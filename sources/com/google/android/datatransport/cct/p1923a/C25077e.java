package com.google.android.datatransport.cct.p1923a;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.google.android.datatransport.cct.a.e */
public final class C25077e extends AbstractC25087k {

    /* renamed from: a */
    final List<AbstractC25096q> f59472a;

    static {
        Covode.recordClassIndex(30442);
    }

    @Override // com.google.android.datatransport.cct.p1923a.AbstractC25087k
    /* renamed from: a */
    public final List<AbstractC25096q> mo41009a() {
        return this.f59472a;
    }

    public final int hashCode() {
        return this.f59472a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f59472a + "}";
    }

    public C25077e(List<AbstractC25096q> list) {
        this.f59472a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC25087k) {
            return this.f59472a.equals(((AbstractC25087k) obj).mo41009a());
        }
        return false;
    }
}
