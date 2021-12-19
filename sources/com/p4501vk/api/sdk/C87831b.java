package com.p4501vk.api.sdk;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p4501vk.api.sdk.AbstractC87907j;
import com.p4501vk.api.sdk.p4507f.p4508a.AbstractC87884c;
import com.p4501vk.api.sdk.p4507f.p4508a.C87882a;
import java.util.concurrent.TimeUnit;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.b */
public final class C87831b {

    /* renamed from: r */
    public static final C87838a f199514r = new C87838a((byte) 0);

    /* renamed from: a */
    public final Context f199515a;

    /* renamed from: b */
    public final int f199516b;

    /* renamed from: c */
    public final AbstractC87878f f199517c;

    /* renamed from: d */
    public final AbstractC89244h<String> f199518d;

    /* renamed from: e */
    public final String f199519e;

    /* renamed from: f */
    public final AbstractC87907j f199520f;

    /* renamed from: g */
    public final long f199521g;

    /* renamed from: h */
    public final long f199522h;

    /* renamed from: i */
    public final AbstractC87884c f199523i;

    /* renamed from: j */
    public final AbstractC89244h<String> f199524j;

    /* renamed from: k */
    public final AbstractC89244h<String> f199525k;

    /* renamed from: l */
    public final boolean f199526l;

    /* renamed from: m */
    public final AbstractC89244h<Boolean> f199527m;

    /* renamed from: n */
    public final int f199528n;

    /* renamed from: o */
    public final AbstractC89244h<String> f199529o;

    /* renamed from: p */
    public final String f199530p;

    /* renamed from: q */
    public final AbstractC87896h f199531q;

    static {
        Covode.recordClassIndex(103841);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C87831b)) {
            return false;
        }
        C87831b bVar = (C87831b) obj;
        return C89219l.m154714a(this.f199515a, bVar.f199515a) && this.f199516b == bVar.f199516b && C89219l.m154714a(this.f199517c, bVar.f199517c) && C89219l.m154714a(this.f199518d, bVar.f199518d) && C89219l.m154714a(this.f199519e, bVar.f199519e) && C89219l.m154714a(this.f199520f, bVar.f199520f) && this.f199521g == bVar.f199521g && this.f199522h == bVar.f199522h && C89219l.m154714a(this.f199523i, bVar.f199523i) && C89219l.m154714a(this.f199524j, bVar.f199524j) && C89219l.m154714a(this.f199525k, bVar.f199525k) && this.f199526l == bVar.f199526l && C89219l.m154714a(this.f199527m, bVar.f199527m) && this.f199528n == bVar.f199528n && C89219l.m154714a(this.f199529o, bVar.f199529o) && C89219l.m154714a(this.f199530p, bVar.f199530p) && C89219l.m154714a(this.f199531q, bVar.f199531q);
    }

    public final int hashCode() {
        Context context = this.f199515a;
        int i = 0;
        int hashCode = (((context != null ? context.hashCode() : 0) * 31) + this.f199516b) * 31;
        AbstractC87878f fVar = this.f199517c;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        AbstractC89244h<String> hVar = this.f199518d;
        int hashCode3 = (hashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        String str = this.f199519e;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        AbstractC87907j jVar = this.f199520f;
        int hashCode5 = jVar != null ? jVar.hashCode() : 0;
        long j = this.f199521g;
        long j2 = this.f199522h;
        int i2 = (((((hashCode4 + hashCode5) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        AbstractC87884c cVar = this.f199523i;
        int hashCode6 = (i2 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        AbstractC89244h<String> hVar2 = this.f199524j;
        int hashCode7 = (hashCode6 + (hVar2 != null ? hVar2.hashCode() : 0)) * 31;
        AbstractC89244h<String> hVar3 = this.f199525k;
        int hashCode8 = (hashCode7 + (hVar3 != null ? hVar3.hashCode() : 0)) * 31;
        boolean z = this.f199526l;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode8 + i3) * 31;
        AbstractC89244h<Boolean> hVar4 = this.f199527m;
        int hashCode9 = (((i6 + (hVar4 != null ? hVar4.hashCode() : 0)) * 31) + this.f199528n) * 31;
        AbstractC89244h<String> hVar5 = this.f199529o;
        int hashCode10 = (hashCode9 + (hVar5 != null ? hVar5.hashCode() : 0)) * 31;
        String str2 = this.f199530p;
        int hashCode11 = (hashCode10 + (str2 != null ? str2.hashCode() : 0)) * 31;
        AbstractC87896h hVar6 = this.f199531q;
        if (hVar6 != null) {
            i = hVar6.hashCode();
        }
        return hashCode11 + i;
    }

    public final String toString() {
        return "VKApiConfig(context=" + this.f199515a + ", appId=" + this.f199516b + ", validationHandler=" + this.f199517c + ", deviceId=" + this.f199518d + ", version=" + this.f199519e + ", okHttpProvider=" + this.f199520f + ", defaultTimeoutMs=" + this.f199521g + ", postRequestsTimeout=" + this.f199522h + ", logger=" + this.f199523i + ", accessToken=" + this.f199524j + ", secret=" + this.f199525k + ", logFilterCredentials=" + this.f199526l + ", debugCycleCalls=" + this.f199527m + ", callsPerSecondLimit=" + this.f199528n + ", httpApiHost=" + this.f199529o + ", lang=" + this.f199530p + ", keyValueStorage=" + this.f199531q + ")";
    }

    /* renamed from: com.vk.api.sdk.b$a */
    public static final class C87838a {
        static {
            Covode.recordClassIndex(103848);
        }

        private C87838a() {
        }

        public /* synthetic */ C87838a(byte b) {
            this();
        }
    }

    public /* synthetic */ C87831b(Context context, int i, AbstractC87878f fVar) {
        this(context, i, fVar, C89250i.m154773a((AbstractC89171a) C878321.f199532a), "5.90", new AbstractC87907j.C87909b(), TimeUnit.SECONDS.toMillis(10), TimeUnit.MINUTES.toMillis(5), new C87882a(C89250i.m154773a((AbstractC89171a) C878332.f199533a), "VKSdkApi"), C89250i.m154773a((AbstractC89171a) C878343.f199534a), C89250i.m154773a((AbstractC89171a) C878354.f199535a), C89250i.m154773a((AbstractC89171a) C878365.f199536a), C89250i.m154773a((AbstractC89171a) C878376.f199537a), "en", new C87910k(context));
    }

    private C87831b(Context context, int i, AbstractC87878f fVar, AbstractC89244h<String> hVar, String str, AbstractC87907j jVar, long j, long j2, AbstractC87884c cVar, AbstractC89244h<String> hVar2, AbstractC89244h<String> hVar3, AbstractC89244h<Boolean> hVar4, AbstractC89244h<String> hVar5, String str2, AbstractC87896h hVar6) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(hVar2, "");
        C89219l.m154719c(hVar3, "");
        C89219l.m154719c(hVar4, "");
        C89219l.m154719c(hVar5, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(hVar6, "");
        this.f199515a = context;
        this.f199516b = i;
        this.f199517c = fVar;
        this.f199518d = hVar;
        this.f199519e = str;
        this.f199520f = jVar;
        this.f199521g = j;
        this.f199522h = j2;
        this.f199523i = cVar;
        this.f199524j = hVar2;
        this.f199525k = hVar3;
        this.f199526l = true;
        this.f199527m = hVar4;
        this.f199528n = 3;
        this.f199529o = hVar5;
        this.f199530p = str2;
        this.f199531q = hVar6;
    }
}
