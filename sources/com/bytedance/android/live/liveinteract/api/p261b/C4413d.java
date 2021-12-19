package com.bytedance.android.live.liveinteract.api.p261b;

import android.text.TextUtils;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.api.b.d */
public final class C4413d {

    /* renamed from: b */
    public static final String f11999b = "start_co_host";

    /* renamed from: c */
    public static final String f12000c = "start_match";

    /* renamed from: d */
    public static final String f12001d = "start_rematch";

    /* renamed from: e */
    public static final C4414a f12002e = new C4414a((byte) 0);

    /* renamed from: f */
    private static final String f12003f = "LinkStartEvent";

    /* renamed from: a */
    public final String f12004a;

    /* renamed from: com.bytedance.android.live.liveinteract.api.b.d$a */
    public static final class C4414a {
        static {
            Covode.recordClassIndex(4990);
        }

        private C4414a() {
        }

        public /* synthetic */ C4414a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(4989);
    }

    public C4413d(String str) {
        C89219l.m154721d(str, "");
        this.f12004a = str;
        if (!TextUtils.equals(str, f11999b) && !TextUtils.equals(str, f12000c) && !TextUtils.equals(str, f12001d)) {
            C3854a.m9453a(6, f12003f, "type error");
        }
    }
}
