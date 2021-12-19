package com.p2082ss.ugc.live.sdk.msg.p4472c;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ugc.live.sdk.msg.c.g */
public enum EnumC87101g {
    WS_MSG_ORIGIN,
    WS_ORIGIN,
    ORIGIN;
    
    public static final C87102a Companion = new C87102a((byte) 0);

    static {
        Covode.recordClassIndex(102897);
    }

    /* renamed from: com.ss.ugc.live.sdk.msg.c.g$a */
    public static final class C87102a {
        static {
            Covode.recordClassIndex(102898);
        }

        private C87102a() {
        }

        public /* synthetic */ C87102a(byte b) {
            this();
        }

        /* renamed from: a */
        public static EnumC87101g m150851a(int i) {
            if (i == 0) {
                return EnumC87101g.WS_MSG_ORIGIN;
            }
            if (i != 1) {
                return EnumC87101g.ORIGIN;
            }
            return EnumC87101g.WS_ORIGIN;
        }
    }

    public final String getStrategy(boolean z) {
        int i = C87103h.f196378a[ordinal()];
        if (i != 1) {
            if (i == 2 && z) {
                return "ws";
            }
            return "origin_http";
        } else if (z) {
            return "ws";
        } else {
            return "room_http";
        }
    }
}
