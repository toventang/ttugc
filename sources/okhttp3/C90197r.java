package okhttp3;

import com.bytedance.covode.number.Covode;
import java.security.cert.Certificate;
import java.util.List;

/* renamed from: okhttp3.r */
public final class C90197r {

    /* renamed from: a */
    public final EnumC90035af f204851a;

    /* renamed from: b */
    public final C90055h f204852b;

    /* renamed from: c */
    public final List<Certificate> f204853c;

    /* renamed from: d */
    public final List<Certificate> f204854d;

    static {
        Covode.recordClassIndex(106370);
    }

    public final int hashCode() {
        return ((((((this.f204851a.hashCode() + 527) * 31) + this.f204852b.hashCode()) * 31) + this.f204853c.hashCode()) * 31) + this.f204854d.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C90197r)) {
            return false;
        }
        C90197r rVar = (C90197r) obj;
        if (!this.f204851a.equals(rVar.f204851a) || !this.f204852b.equals(rVar.f204852b) || !this.f204853c.equals(rVar.f204853c) || !this.f204854d.equals(rVar.f204854d)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static okhttp3.C90197r m156768a(javax.net.ssl.SSLSession r5) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C90197r.m156768a(javax.net.ssl.SSLSession):okhttp3.r");
    }

    C90197r(EnumC90035af afVar, C90055h hVar, List<Certificate> list, List<Certificate> list2) {
        this.f204851a = afVar;
        this.f204852b = hVar;
        this.f204853c = list;
        this.f204854d = list2;
    }
}
