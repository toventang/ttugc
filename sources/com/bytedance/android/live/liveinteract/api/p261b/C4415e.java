package com.bytedance.android.live.liveinteract.api.p261b;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.api.b.e */
public final class C4415e {

    /* renamed from: b */
    public static final String f12005b = "normal";

    /* renamed from: c */
    public static final String f12006c = "multi_guest";

    /* renamed from: d */
    public static final String f12007d = "co_host";

    /* renamed from: e */
    public static final String f12008e = "co_host_inviting";

    /* renamed from: f */
    public static final String f12009f = "match";

    /* renamed from: g */
    public static final String f12010g = "match_inviting";

    /* renamed from: h */
    public static final String f12011h = "punishing";

    /* renamed from: i */
    public static final String f12012i = "rematch_inviting";

    /* renamed from: j */
    public static final C4416a f12013j = new C4416a((byte) 0);

    /* renamed from: k */
    private static final String f12014k = "LinkStateChangedEvent";

    /* renamed from: a */
    public final String f12015a;

    /* renamed from: com.bytedance.android.live.liveinteract.api.b.e$a */
    public static final class C4416a {
        static {
            Covode.recordClassIndex(4992);
        }

        private C4416a() {
        }

        public /* synthetic */ C4416a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(4991);
    }

    public C4415e(String str) {
        C89219l.m154721d(str, "");
        this.f12015a = str;
        C3854a.m9453a(3, f12014k, "curType=" + str);
    }
}
