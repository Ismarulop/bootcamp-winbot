package com.telegrambot.bootcamp;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class TelegramBot {

    public static void sendToTelegram() {
        String urlString = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s";

        String apiToken = "5647366243:AAF0qUIjd-GD4gzF5X5XpSeVoqXx4GUg8rE"; //Input the token of the bot.

        String chatId = "-1001839904443"; // Input the chatId.

        //Function to get the best team //

        String text = "The team with most points is: "; //A string with the Team with most points should be concatenated.

        urlString = String.format(urlString, apiToken, chatId, text);
        System.out.println(urlString);
        try {
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            InputStream is = new BufferedInputStream(conn.getInputStream());
        } catch (IOException e) {
            e.printStackTrace( );
        }
    }


}
