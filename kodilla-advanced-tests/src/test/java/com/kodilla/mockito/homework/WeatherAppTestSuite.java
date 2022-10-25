package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherAppTestSuite {

    PopUpService popUpService = new PopUpService();
    User user = Mockito.mock(User.class);
    User userOne = Mockito.mock(User.class);
    User userTwo = Mockito.mock(User.class);
    User userThree = Mockito.mock(User.class);
    Places mazowsze = Mockito.mock(Places.class);
    Places mazury = Mockito.mock(Places.class);
    Places lubelskie = Mockito.mock(Places.class);
    PopUp popUp = Mockito.mock(PopUp.class);

    //Osoba zainteresowana może zostać zapisana do danej lokalizacji i zacznie otrzymywać powiadomienia.
    @Test
    void userShouldBeAddedToDesiredLocationAndGetPopUp() {
        popUpService.addUserToPlace(user, mazowsze);
        popUpService.sendPopUp(user, mazury, popUp);
        Mockito.verify(user, Mockito.times(1)).receive(popUp);
    }
    //Można wycofać subskrypcję z danej lokalizacji.
    @Test
    void userUnsubscribedFromOneLocationAndDontGetPopUpFromIt() {
        popUpService.addUserToPlace(user, mazowsze);
        popUpService.removeUserFromPlace(user, mazowsze);
        popUpService.sendPopUp(user, mazowsze, popUp);
        Mockito.verify(user, Mockito.never()).receive(popUp);
    }
    //Można wycofać subskrypcję ze wszystkich lokalizacji, co równa się kompletnemu wypisaniu klienta z powiadomień.
    @Test
    void userUnsubscribeFromAllLocationAndDontGetPopUpsAtAll() {
        popUpService.addUserToPlace(user, mazowsze);
        popUpService.addUserToPlace(user, mazury);
        popUpService.addUserToPlace(user, lubelskie);
        popUpService.removeUserFromAll();
        popUpService.sendPopUp(user, mazowsze, popUp);
        Mockito.verify(user, Mockito.never()).receive(popUp);
    }
    //Powiadomienie dla osób w danej lokalizacji powinno dotrzeć tylko do określonej grupy osób.
    @Test
    void onlyUsersSubscribedToLocationShouldGetPopUp() {
        popUpService.addUserToPlace(userOne, mazowsze);
        popUpService.addUserToPlace(userOne, mazury);
        popUpService.addUserToPlace(userTwo, mazury);
        popUpService.addUserToPlace(userThree, lubelskie);
        popUpService.sendPopUp(userOne, mazury, popUp);
        popUpService.sendPopUp(userTwo, mazury, popUp);
        Mockito.verify(userOne, Mockito.times(1)).receive(popUp);
        Mockito.verify(userTwo, Mockito.times(1)).receive(popUp);
        Mockito.verify(userThree, Mockito.never()).receive(popUp);
    }
    //Możliwość wysyłki powiadomienia do wszystkich.
    @Test
    void shouldSendPopUpToAllUsers() {
        popUpService.addUserToPlace(userOne, mazowsze);
        popUpService.addUserToPlace(userTwo, mazury);
        popUpService.addUserToPlace(userThree, lubelskie);
        popUpService.sendPopUpToAllUsers(popUp);
        Mockito.verify(userOne, Mockito.times(1)).receive(popUp);
        Mockito.verify(userTwo, Mockito.times(1)).receive(popUp);
        Mockito.verify(userThree, Mockito.times(1)).receive(popUp);
    }
    //Możliwość skasowania danej lokalizacji.
    @Test
    void userCanRemoveDesiredLocation() {
        popUpService.addUserToPlace(userOne, mazowsze);
        popUpService.addUserToPlace(userOne, lubelskie);
        popUpService.removeUserFromPlace(userOne, mazowsze);
        popUpService.sendPopUp(userOne, mazowsze, popUp);
        popUpService.sendPopUp(userOne, lubelskie, popUp);
        Mockito.verify(userOne, Mockito.times(1)).receive(popUp);
    }
}
