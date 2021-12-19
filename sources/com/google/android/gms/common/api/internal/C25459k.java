package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.api.internal.k */
public final class C25459k<L> {

    /* renamed from: a */
    volatile L f60448a;

    static {
        Covode.recordClassIndex(30858);
    }

    /* renamed from: com.google.android.gms.common.api.internal.k$a */
    public static final class C25460a<L> {

        /* renamed from: a */
        private final L f60449a;

        /* renamed from: b */
        private final String f60450b;

        static {
            Covode.recordClassIndex(30859);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f60449a) * 31) + this.f60450b.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25460a)) {
                return false;
            }
            C25460a aVar = (C25460a) obj;
            if (this.f60449a != aVar.f60449a || !this.f60450b.equals(aVar.f60450b)) {
                return false;
            }
            return true;
        }
    }
}
