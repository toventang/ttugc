package com.p2082ss.bytertc.engine.game;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.game.GameRTCRoomConfig */
public class GameRTCRoomConfig {
    public int audioVolumeIndicationInterval;
    public boolean enableRangeAudio;
    public RoomType roomType;

    static {
        Covode.recordClassIndex(101006);
    }

    /* renamed from: com.ss.bytertc.engine.game.GameRTCRoomConfig$RoomType */
    public enum RoomType {
        RTC_ROOM_TEAM(0),
        RTC_ROOM_WORLD(1);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(101007);
        }

        private RoomType(int i) {
            this.value = i;
        }
    }
}
