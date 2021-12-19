package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.GameInfo */
public class GameInfo implements Serializable {
    @AbstractC27891c(mo46611a = "game_score")
    public int gameScore;
    @AbstractC27891c(mo46611a = "game_type")
    public int gameType;

    static {
        Covode.recordClassIndex(58697);
    }

    public int getGameScore() {
        return this.gameScore;
    }

    public int getGameType() {
        return this.gameType;
    }

    public void setGameScore(int i) {
        this.gameScore = i;
    }

    public void setGameType(int i) {
        this.gameType = i;
    }
}
