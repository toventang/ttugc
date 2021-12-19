package com.bytedance.android.live.liveinteract.cohost.p272e;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.liveinteract.cohost.p271d.C4619b;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.e.b */
public final class C4621b {

    /* renamed from: a */
    public static final C4622a f12272a = new C4622a((byte) 0);

    static {
        Covode.recordClassIndex(5197);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.e.b$a */
    public static final class C4622a {
        static {
            Covode.recordClassIndex(5198);
        }

        private C4622a() {
        }

        public /* synthetic */ C4622a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static C4619b m10747a(String str) {
        C89219l.m154721d(str, "");
        try {
            return (C4619b) C4139e.C4140a.f11575b.mo46670a(str, C4619b.class);
        } catch (Exception e) {
            C3854a.m9458a("RtcMessageReader", e);
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m10748a(String str, Class<T> cls) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(cls, "");
        try {
            return (T) C4139e.C4140a.f11575b.mo46670a(str, (Class) cls);
        } catch (Exception e) {
            C3854a.m9458a("RtcMessageReader", e);
            return null;
        }
    }
}
