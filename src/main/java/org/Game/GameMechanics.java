package org.Game;

public class GameMechanics {
}

//Pozostałe klasy powinny być odpowiedzialne za obsługę logiki i mechaniki gry.
// Żeby trzymać nasz podział na warstwy w ryzach – klasy te nie powinny w żaden sposób
// być powiązane z konsolą. Nie powinny zatem wyświetlać komunikatów na konsoli
// przy użyciu np. System.out.println, czy też odczytywać danych z klawiatury.
// To te klasy powinny weryfikować, czy wykonany ruch jest poprawny (czy dane pole nie jest już zajęte).
// W takiej sytuacji powinniśmy użyć mechanizmu wyjątków. Warstwa mechaniki gry
// powinna wyrzucić wyjątek, który będzie odpowiednio obsłużony w klasie odpowiedzialnej za prezentację planszy.