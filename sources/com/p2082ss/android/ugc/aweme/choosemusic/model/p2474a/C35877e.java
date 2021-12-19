package com.p2082ss.android.ugc.aweme.choosemusic.model.p2474a;

import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.a.e */
public final class C35877e {

    /* renamed from: a */
    public final int f84669a;

    /* renamed from: b */
    public final String f84670b;

    /* renamed from: c */
    public final boolean f84671c;

    /* renamed from: d */
    public final int f84672d;

    static {
        Covode.recordClassIndex(43117);
    }

    public final String toString() {
        return "MusicListRequestParam(radioCursor=" + this.f84669a + ", idsArrayJson=" + this.f84670b + ", isCommerceMusic=" + this.f84671c + ", soundPageScene=" + this.f84672d + ")";
    }

    public final int hashCode() {
        int i;
        int i2 = this.f84669a * 31;
        String str = this.f84670b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((i2 + i) * 31) + (this.f84671c ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C89219l.m154714a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.model.data.MusicListRequestParam");
        C35877e eVar = (C35877e) obj;
        if (this.f84669a == eVar.f84669a && !(!C89219l.m154714a((Object) this.f84670b, (Object) eVar.f84670b)) && this.f84671c == eVar.f84671c && this.f84672d == eVar.f84672d) {
            return true;
        }
        return false;
    }

    public C35877e(int i, String str, boolean z, int i2) {
        this.f84669a = i;
        this.f84670b = str;
        this.f84671c = z;
        this.f84672d = i2;
    }
}
