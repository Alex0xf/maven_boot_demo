package com.javasm.reflection;

/**
 * @author Alex
 * @creartTime 2018/9/1 - 0:25
 * @function
 */
public class GameVO extends GameModel{

    private String gameIOSUrl;
    private String gameAndroidUrl;

    public String getGameAndroidUrl() {
        return gameAndroidUrl;
    }

    public void setGameAndroidUrl(String gameAndroidUrl) {
        this.gameAndroidUrl = gameAndroidUrl;
    }

    public String getGameIOSUrl() {
        return gameIOSUrl;
    }

    public void setGameIOSUrl(String gameIOSUrl) {
        this.gameIOSUrl = gameIOSUrl;
    }
}
