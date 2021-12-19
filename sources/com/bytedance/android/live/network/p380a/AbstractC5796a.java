package com.bytedance.android.live.network.p380a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.network.a.a */
public @interface AbstractC5796a {
    static {
        Covode.recordClassIndex(6396);
    }

    /* renamed from: a */
    EnumC5797a mo11568a();

    /* renamed from: com.bytedance.android.live.network.a.a$a */
    public enum EnumC5797a {
        ROOM("room"),
        FEED("feed"),
        GIFT("gift"),
        BROADCAST("broadcast"),
        RANK_LIST("rank_list"),
        REPORT("report"),
        LINK_MIC("link_mic"),
        OTHER("other");
        
        public final String key;

        static {
            Covode.recordClassIndex(6397);
        }

        private EnumC5797a(String str) {
            this.key = str;
        }
    }
}
