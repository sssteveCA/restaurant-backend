package com.onlinerestaurant.restaurant.interfaces;

public interface Constants {
    
    String ADMIN_CONTACT = "Se il problema persiste, contattare l'amministratore del sito";

    //Errors
    String ERR_INVALID_DATA = "I dati inseriti non sono validi, riprova";
    String ERR_MENU = "Impossibile mostrare i menu del ristorante. "+ADMIN_CONTACT;
    String ERR_MISSING_DATA = "Inserisci i dati richiesti per continuare";

    //Keys
    String KEY_DONE = "done";
    String KEY_MESSAGE = "message";
}
