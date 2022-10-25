package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.Map;

public class PopUpService {

    Map<User, Places> userPlacesMap = new HashMap<>();
    void sendPopUp(User user, Places places, PopUp popUp) {
        if (userPlacesMap.containsValue(places)){
            user.receive(popUp);
        }
    }
    void sendPopUpToAllUsers(PopUp popUp) {
        userPlacesMap.forEach((user, places) -> user.receive(popUp));
    }

    void addUserToPlace(User user, Places places) {
        userPlacesMap.put(user, places);
    }
    void removeUserFromPlace(User user, Places places) {
        userPlacesMap.remove(user, places);
    }
    void removeUserFromAll() {
        userPlacesMap.clear();
    }

}
