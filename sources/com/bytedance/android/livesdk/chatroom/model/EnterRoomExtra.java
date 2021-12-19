package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class EnterRoomExtra extends Extra {
    @AbstractC27891c(mo46611a = "is_official_channel")
    public boolean isOfficialChannel;
    @AbstractC27891c(mo46611a = "is_same_app_language")
    public boolean isSameAppLanguage;
    @AbstractC27891c(mo46611a = "region")
    public String region;

    static {
        Covode.recordClassIndex(8431);
    }
}
