package com.bytedance.android.livesdk.tunnel;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.tunnel.b */
public final class C10928b {

    /* renamed from: a */
    public static final C10929a f26255a = new C10929a((byte) 0);

    static {
        Covode.recordClassIndex(12538);
    }

    /* renamed from: com.bytedance.android.livesdk.tunnel.b$a */
    public static final class C10929a {
        static {
            Covode.recordClassIndex(12539);
        }

        private C10929a() {
        }

        public /* synthetic */ C10929a(byte b) {
            this();
        }

        /* renamed from: a */
        public static <T extends TunnelViewModel> T m19555a(Class<T> cls, ActivityC0945e eVar) {
            C89219l.m154721d(cls, "");
            if (eVar == null) {
                C89219l.m154715b();
            }
            AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(cls);
            C89219l.m154716b(a, "");
            return (T) ((TunnelViewModel) a);
        }
    }
}
