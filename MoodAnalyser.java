package com.moodanalyser;

public class MoodAnalyser {

    public String analyseMood(String message) {
        if(message.contains("SAD"))
            return "SAD";
        else
            return "Happy";
    }
}
