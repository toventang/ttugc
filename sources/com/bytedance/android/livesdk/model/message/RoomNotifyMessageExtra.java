package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

public class RoomNotifyMessageExtra {
    @AbstractC27891c(mo46611a = "highlighted")

    /* renamed from: a */
    public List<Object> f23283a;
    @AbstractC27891c(mo46611a = "background")

    /* renamed from: b */
    public Background f23284b;
    @AbstractC27891c(mo46611a = "content_list")

    /* renamed from: c */
    public C9664bb f23285c;
    @AbstractC27891c(mo46611a = "duration")

    /* renamed from: d */
    public long f23286d;

    public static class Background extends ImageModel {
        static {
            Covode.recordClassIndex(11136);
        }
    }

    static {
        Covode.recordClassIndex(11135);
    }
}
