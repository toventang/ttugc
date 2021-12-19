package com.bytedance.android.livesdk.p456as;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.as.a */
public class C6861a {

    /* renamed from: a */
    public long f17204a;

    static {
        Covode.recordClassIndex(7599);
    }

    /* renamed from: com.bytedance.android.livesdk.as.a$a */
    public static abstract class AbstractC6862a<T extends AbstractC6862a<T>> {

        /* renamed from: a */
        long f17205a;

        static {
            Covode.recordClassIndex(7600);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract T mo13133a();

        /* renamed from: a */
        public final T mo13134a(long j) {
            this.f17205a = j;
            return mo13133a();
        }
    }

    C6861a(AbstractC6862a aVar) {
        this.f17204a = aVar.f17205a;
    }
}
