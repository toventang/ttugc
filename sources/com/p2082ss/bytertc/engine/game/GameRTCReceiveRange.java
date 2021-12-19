package com.p2082ss.bytertc.engine.game;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.game.GameRTCReceiveRange */
public class GameRTCReceiveRange {
    public int max;
    public int min;

    static {
        Covode.recordClassIndex(101005);
    }

    public GameRTCReceiveRange(int i, int i2) {
        this.min = i;
        this.max = i2;
    }
}
