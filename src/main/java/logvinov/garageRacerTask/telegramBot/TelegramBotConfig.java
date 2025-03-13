package logvinov.garageRacerTask.telegramBot;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class TelegramBotConfig {
    @Value("${BOT_USERNAME}")
    private String botUsername;

    @Value("${BOT_TOKEN}")
    private String botToken;
}