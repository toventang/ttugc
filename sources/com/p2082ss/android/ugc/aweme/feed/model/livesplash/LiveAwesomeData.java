package com.p2082ss.android.ugc.aweme.feed.model.livesplash;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27890b;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.utils.C80365dx;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeData */
public final class LiveAwesomeData {
    @AbstractC27891c(mo46611a = "gbc")
    public String gbc;
    @AbstractC27891c(mo46611a = "hidden_psm_pi")
    public boolean hideView = true;
    @AbstractC27891c(mo46611a = "psm_pi")
    public List<LiveShowMessage> psmPi;
    @AbstractC27890b(mo46609a = C80365dx.class)
    @AbstractC27891c(mo46611a = "data")
    public String roomData;
    @AbstractC27891c(mo46611a = "sec_uid")
    public String secUid;
    @AbstractC27891c(mo46611a = "uid")
    public long uid;
    @AbstractC27891c(mo46611a = "use_room_info")
    public boolean useRoomInfo = true;

    static {
        Covode.recordClassIndex(58820);
    }
}
