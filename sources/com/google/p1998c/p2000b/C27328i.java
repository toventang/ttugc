package com.google.p1998c.p2000b;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27255q;
import java.util.concurrent.atomic.AtomicLong;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.b.i */
public final class C27328i {

    /* renamed from: a */
    private static final AbstractC27255q<AbstractC27327h> f64604a;

    /* renamed from: com.google.c.b.i$a */
    static final class C27331a extends AtomicLong implements AbstractC27327h {
        static {
            Covode.recordClassIndex(32911);
        }

        private C27331a() {
        }

        @Override // com.google.p1998c.p2000b.AbstractC27327h
        /* renamed from: a */
        public final void mo45509a() {
            getAndIncrement();
        }

        /* synthetic */ C27331a(byte b) {
            this();
        }

        @Override // com.google.p1998c.p2000b.AbstractC27327h
        /* renamed from: a */
        public final void mo45510a(long j) {
            getAndAdd(j);
        }
    }

    /* renamed from: a */
    public static AbstractC27327h m54585a() {
        return f64604a.mo5560b();
    }

    static {
        AbstractC27255q<AbstractC27327h> qVar;
        Covode.recordClassIndex(32908);
        try {
            new C27332j();
            qVar = new AbstractC27255q<AbstractC27327h>() {
                /* class com.google.p1998c.p2000b.C27328i.C273291 */

                static {
                    Covode.recordClassIndex(32909);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.google.p1998c.p1999a.AbstractC27255q
                /* renamed from: b */
                public final /* synthetic */ AbstractC27327h mo5560b() {
                    return new C27332j();
                }
            };
        } catch (Throwable unused) {
            qVar = new AbstractC27255q<AbstractC27327h>() {
                /* class com.google.p1998c.p2000b.C27328i.C273302 */

                static {
                    Covode.recordClassIndex(32910);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.google.p1998c.p1999a.AbstractC27255q
                /* renamed from: b */
                public final /* synthetic */ AbstractC27327h mo5560b() {
                    return new C27331a((byte) 0);
                }
            };
        }
        f64604a = qVar;
    }
}
