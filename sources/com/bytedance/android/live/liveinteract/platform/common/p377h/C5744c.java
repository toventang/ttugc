package com.bytedance.android.live.liveinteract.platform.common.p377h;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.h.c */
public final class C5744c {

    /* renamed from: a */
    public static final C5744c f14570a = new C5744c();

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.h.c$a */
    public enum EnumC5745a {
        NORMAL_VIDEO("normal_video_live"),
        LINE_UP("video_anchor_order"),
        LINK_MIC_ANCHOR("video_anchor_connect"),
        LINK_MIC_PK("video_anchor_pk"),
        LINK_MIC_GUEST("video_anchor_guest_connect");
        

        /* renamed from: b */
        private final String f14572b;

        public final String getDesc() {
            return this.f14572b;
        }

        static {
            Covode.recordClassIndex(6343);
        }

        private EnumC5745a(String str) {
            this.f14572b = str;
        }
    }

    private C5744c() {
    }

    static {
        Covode.recordClassIndex(6342);
    }
}
