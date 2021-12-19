package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LiveCnySetting */
public class LiveCnySetting {
    @AbstractC27891c(mo46611a = "force_update_room")
    private Boolean forceUpdateRoom = true;

    static {
        Covode.recordClassIndex(62371);
    }

    public Boolean getForceUpdateRoom() {
        Boolean bool = this.forceUpdateRoom;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }
}
