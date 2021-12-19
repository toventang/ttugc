package com.bytedance.android.live.broadcast.preview.virtual;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.google.gson.p2018a.AbstractC27891c;
import p4560f.p4561a.AbstractC88979t;

public final class LiveSettingApi {

    public interface WebcastAPI {
        static {
            Covode.recordClassIndex(4049);
        }

        @AbstractC22000h(mo35789a = "/webcast/room/live_podcast/")
        AbstractC88979t<C5832d<C3564a>> getLivePodCast();
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.virtual.LiveSettingApi$a */
    public class C3564a {
        @AbstractC27891c(mo46611a = "can_be_live_podcast")

        /* renamed from: a */
        public boolean f9885a;
        @AbstractC27891c(mo46611a = "live_scenario")

        /* renamed from: b */
        public C3571b f9886b;
        @AbstractC27891c(mo46611a = "live_permission_apply")

        /* renamed from: c */
        public C3570a f9887c;

        static {
            Covode.recordClassIndex(4050);
        }
    }

    static {
        Covode.recordClassIndex(4048);
    }
}
