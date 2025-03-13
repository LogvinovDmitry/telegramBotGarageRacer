# Telegram Bot with Two-Level Menu

A simple Java-based Telegram bot using Spring Boot that implements a two-level menu system. This bot responds to the `/start` command and provides an interactive menu interface with buttons.

## Features

- Two-level menu navigation
- Button-based interaction
- Spring Boot integration
- Clean, structured code design
- Minimal configuration required

## Requirements

- Java 11 or higher
- Maven
- Telegram Bot API token (obtained from BotFather)


---

## Running the Application

You can start the application using one of the following methods:

- **Run the `main` method** in the `TelegramBotApplication` class directly.
- **Use Maven** to launch the application:

  ```bash
  mvn spring-boot:run
  ```  

To stop the application running in the console, press **Ctrl + C**.

## Bot Usage

Once the bot is running, you can interact with it in Telegram:

1. Find your bot by its username (`SimpleJavaExampleBot`)
2. Send the `/start` command to initialize the bot
3. The bot will respond with a welcome message and display the main menu
4. Use the buttons to navigate and interact with the bot

## Menu Structure

### Main Menu
- Button 1: Prints "Кнопка 1" message
- Button 2: Prints "Кнопка 2" message 
- Next: Navigates to the second menu

### Second Menu
- Button 1: Prints "Кнопка 1" message
- Button 2: Prints "Кнопка 2" message
- Back: Returns to the main menu

## How to Create a new Bot in Telegram

1. Open Telegram and search for `@BotFather`
2. Send the `/newbot` command
3. Follow the instructions to create a new bot
4. Copy the HTTP API token provided by BotFather and new username
5. Use this token and username in your `application.yaml` file

## Configuration

If you've created a new bot, make sure to update the `application.yaml` file before launching the application by specifying the correct `BOT_TOKEN` and `BOT_USERNAME`.

```properties
BOT_USERNAME=your_bot_username
BOT_TOKEN=your_bot_token
```

## Project Structure

- `TelegramBotApplication.java`: Spring Boot application entry point
- `TelegramBotConfig.java`: Configuration class for bot credentials
- `BotMenu.java`: Service class for creating menu keyboards
- `TelegramBot.java`: Main bot logic implementation

## Extending the Bot

To add new functionality:
1. Add new buttons to the menus in `BotMenu.java`
2. Add corresponding case statements in the `onUpdateReceived` method in `TelegramBot.java`
3. Implement the desired functionality for each new button or command