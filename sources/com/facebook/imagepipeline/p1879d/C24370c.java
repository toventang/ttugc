package com.facebook.imagepipeline.p1879d;

import android.net.Uri;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24088h;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.common.C24361b;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.common.C24364e;
import com.facebook.p1826c.p1827a.AbstractC24026e;

/* renamed from: com.facebook.imagepipeline.d.c */
public final class C24370c implements AbstractC24026e {

    /* renamed from: a */
    public final String f57789a;

    /* renamed from: b */
    public final Object f57790b;

    /* renamed from: c */
    public final long f57791c;

    /* renamed from: d */
    private final String f57792d;

    /* renamed from: e */
    private final C24363d f57793e;

    /* renamed from: f */
    private final C24364e f57794f;

    /* renamed from: g */
    private final C24361b f57795g;

    /* renamed from: h */
    private final AbstractC24026e f57796h;

    /* renamed from: i */
    private final int f57797i;

    static {
        Covode.recordClassIndex(28513);
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24026e
    /* renamed from: a */
    public final String mo39543a() {
        return this.f57792d;
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24026e
    public final int hashCode() {
        return this.f57797i;
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24026e
    public final String toString() {
        return C1764a.m5929a(null, "%s_%s_%s_%s_%s_%s_%d", new Object[]{this.f57792d, this.f57793e, this.f57794f, this.f57795g, this.f57796h, this.f57789a, Integer.valueOf(this.f57797i)});
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24026e
    /* renamed from: a */
    public final boolean mo39544a(Uri uri) {
        return this.f57792d.contains(uri.toString());
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24026e
    public final boolean equals(Object obj) {
        if (!(obj instanceof C24370c)) {
            return false;
        }
        C24370c cVar = (C24370c) obj;
        if (this.f57797i != cVar.f57797i || !this.f57792d.equals(cVar.f57792d) || !C24088h.m45611a(this.f57793e, cVar.f57793e) || !C24088h.m45611a(this.f57794f, cVar.f57794f) || !C24088h.m45611a(this.f57795g, cVar.f57795g) || !C24088h.m45611a(this.f57796h, cVar.f57796h) || !C24088h.m45611a(this.f57789a, cVar.f57789a)) {
            return false;
        }
        return true;
    }

    public C24370c(String str, C24363d dVar, C24364e eVar, C24361b bVar, AbstractC24026e eVar2, String str2, Object obj) {
        int i;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        this.f57792d = (String) C24091i.m45617a(str);
        this.f57793e = dVar;
        this.f57794f = eVar;
        this.f57795g = bVar;
        this.f57796h = eVar2;
        this.f57789a = str2;
        Integer valueOf = Integer.valueOf(str.hashCode());
        int i2 = 0;
        if (dVar != null) {
            i = dVar.hashCode();
        } else {
            i = 0;
        }
        Integer valueOf2 = Integer.valueOf(i);
        Integer valueOf3 = Integer.valueOf(eVar.hashCode());
        if (valueOf == null) {
            hashCode = 0;
        } else {
            hashCode = valueOf.hashCode();
        }
        if (valueOf2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = valueOf2.hashCode();
        }
        if (valueOf3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = valueOf3.hashCode();
        }
        if (bVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bVar.hashCode();
        }
        if (eVar2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = eVar2.hashCode();
        }
        this.f57797i = ((((((((((hashCode + 31) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str2 != null ? str2.hashCode() : i2);
        this.f57790b = obj;
        this.f57791c = RealtimeSinceBootClock.get().now();
    }
}
