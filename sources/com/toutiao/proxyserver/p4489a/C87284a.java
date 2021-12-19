package com.toutiao.proxyserver.p4489a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.toutiao.proxyserver.a.a */
public final class C87284a {

    /* renamed from: a */
    public AtomicInteger f197839a;

    /* renamed from: b */
    public AtomicInteger f197840b;

    static {
        Covode.recordClassIndex(103180);
    }

    /* renamed from: com.toutiao.proxyserver.a.a$a */
    public static final class C87285a {

        /* renamed from: a */
        public static final C87284a f197841a = new C87284a((byte) 0);

        static {
            Covode.recordClassIndex(103181);
        }
    }

    /* renamed from: a */
    public final boolean mo141319a() {
        if (this.f197839a.get() == 2) {
            return true;
        }
        return false;
    }

    private C87284a() {
        this.f197839a = new AtomicInteger(0);
        this.f197840b = new AtomicInteger(0);
    }

    /* synthetic */ C87284a(byte b) {
        this();
    }
}
