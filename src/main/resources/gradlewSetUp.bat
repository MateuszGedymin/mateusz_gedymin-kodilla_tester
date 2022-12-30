/*
  Usuń wszystkie pliki build/libs/*.jar.
  Wywołaj gradlew build.
  Jeżeli istnieje plik build/libs/*.jar, to skopiuj go do podkatalogu project.
  Jeżeli plik nie istnieje – wyświetl komunikat o błędzie kompilacji.
*/

cd build/libs/*.jar.
del *.jar.
call gradlew build
if *.jar. EXISTS COPY *.jar. subdirectory ELSE echo Cant compile
