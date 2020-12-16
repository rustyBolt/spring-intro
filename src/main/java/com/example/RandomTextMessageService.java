package com.example;
import org.springframework.stereotype.Component;

@Component("messageService2")
public class RandomTextMessageService implements MessageService {
    String[] x = {"Wiadomosc 1",
                "Wiadomosc 2",
                "Wiadomosc 3",
                "Wiadomosc 4",
                "Wiadomosc 5",
                "Wiadomosc 6",
                "Wiadomosc 7",
                "Wiadomosc 8",
                "Wiadomosc 9",
                "Wiadomosc 10"};

    @Override
    public String getMessage() {
        java.util.Random random = new java.util.Random();
        int randomInt = random.nextInt(x.length);
        return x[randomInt];
    }
}
