package logvinov.garageRacerTask.telegramBot;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class BotMenu {
    // Creating the main menu (first level)
    public static ReplyKeyboardMarkup getMainMenu() {
        // Create the keyboard
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        // Create a list of button rows
        List<KeyboardRow> keyboard = new ArrayList<>();

        // First row - buttons 1 and 2
        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Кнопка 1"));
        row1.add(new KeyboardButton("Кнопка 2"));
        keyboard.add(row1);

        // Second row - "Next" button
        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Далі"));
        keyboard.add(row2);

        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;
    }

    // Creating the second menu (second level)
    public static ReplyKeyboardMarkup getSecondMenu() {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboard = new ArrayList<>();

        // First row - buttons 1 and 2
        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Кнопка 1"));
        row1.add(new KeyboardButton("Кнопка 2"));
        keyboard.add(row1);

        // Second row - "Back" button
        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Назад"));
        keyboard.add(row2);

        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;
    }
}