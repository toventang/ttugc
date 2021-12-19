package com.bytedance.ies.xbridge.base.runtime.p1294c;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.xbridge.base.runtime.c.a */
public final class C18437a {

    /* renamed from: a */
    public static final C18437a f44056a = new C18437a();

    /* renamed from: b */
    private static final AbstractC89244h f44057b = C89250i.m154773a((AbstractC89171a) C18438a.f44058a);

    /* renamed from: a */
    public static final Handler m34297a() {
        return (Handler) f44057b.getValue();
    }

    private C18437a() {
    }

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.c.a$a */
    static final class C18438a extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C18438a f44058a = new C18438a();

        static {
            Covode.recordClassIndex(21112);
        }

        C18438a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static {
        Covode.recordClassIndex(21111);
    }
}
