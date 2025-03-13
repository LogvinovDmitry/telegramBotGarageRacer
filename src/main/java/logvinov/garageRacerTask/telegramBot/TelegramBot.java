package logvinov.garageRacerTask.telegramBot;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Slf4j
@Component
@RequiredArgsConstructor
public class TelegramBot extends TelegramLongPollingBot {

    private final TelegramBotConfig config;

    @Override
    public String getBotUsername() {
        return config.getBotUsername();
    }

    @Override
    public String getBotToken() {
        return config.getBotToken();
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            switch (messageText) {
                case "/start":
                    sendMessage(chatId, "Привіт! Я простий бот з меню.", BotMenu.getMainMenu());
                    break;
                case "Кнопка 1":
                    sendMessage(chatId, "Кнопка 1", null);
                    break;
                case "Кнопка 2":
                    sendMessage(chatId, "Кнопка 2", null);
                    break;
                case "Далі":
                    sendMessage(chatId, "Переходимо далі", BotMenu.getSecondMenu());
                    break;
                case "Назад":
                    sendMessage(chatId, "Повертаємось назад", BotMenu.getMainMenu());
                    break;
                default:
                    sendMessage(chatId, "Невідома команда. Використовуйте /start для виклику меню.", null);
                    break;
            }
        }
    }

    // Helper method for sending messages
    private void sendMessage(long chatId, String text, org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard keyboard) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(text);

        // Set the keyboard if passed
        if (keyboard != null) {
            message.setReplyMarkup(keyboard);
        }

        try {
            execute(message);
            log.info("Sent message: {}", text);
        } catch (TelegramApiException e) {
            log.error("Error sending message: {}", e.getMessage());
        }
    }
}