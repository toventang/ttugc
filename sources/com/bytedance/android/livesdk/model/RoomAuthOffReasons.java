package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class RoomAuthOffReasons {
    @AbstractC27891c(mo46611a = "gift")
    String gift;
    @AbstractC27891c(mo46611a = "gift_off_reason")
    int unAvailableClickReason;

    static {
        Covode.recordClassIndex(11047);
    }

    public String getGift() {
        return this.gift;
    }

    public EnumC9541ay getUnAvailableClickReason() {
        return EnumC9541ay.parseEnum(this.unAvailableClickReason);
    }
}
