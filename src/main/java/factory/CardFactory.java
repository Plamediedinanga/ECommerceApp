package factory;

import domain.Card;

public class CardFactory {
    public static Card createCard(String Id, String name, String type, String number, String expiry, String cvv) {
        return new Card.Builder()
                .setCardId("id434")
                .setCardNumber("99099452")
                .setCardType("standard")
                .setCardHolderName("john")
                .setCardExpiry("24/04/2028")
                .setCardCVV("9099343")
                .build();
    }
}
