package com.bytedance.ies.bullet.kit.lynx;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import javax.xml.transform.Transformer;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.kit.lynx.h */
public final class C16416h {

    /* renamed from: a */
    public final Context f39419a;

    /* renamed from: b */
    public final String f39420b;

    /* renamed from: c */
    public final String f39421c;

    /* renamed from: d */
    public final float f39422d;

    /* renamed from: e */
    public final float f39423e;

    /* renamed from: f */
    public final Transformer f39424f;

    static {
        Covode.recordClassIndex(18719);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16416h)) {
            return false;
        }
        C16416h hVar = (C16416h) obj;
        return C89219l.m154714a(this.f39419a, hVar.f39419a) && C89219l.m154714a(this.f39420b, hVar.f39420b) && C89219l.m154714a(this.f39421c, hVar.f39421c) && Float.compare(this.f39422d, hVar.f39422d) == 0 && Float.compare(this.f39423e, hVar.f39423e) == 0 && C89219l.m154714a(this.f39424f, hVar.f39424f);
    }

    public final int hashCode() {
        Context context = this.f39419a;
        int i = 0;
        int hashCode = (context != null ? context.hashCode() : 0) * 31;
        String str = this.f39420b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39421c;
        int hashCode3 = (((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f39422d)) * 31) + Float.floatToIntBits(this.f39423e)) * 31;
        Transformer transformer = this.f39424f;
        if (transformer != null) {
            i = transformer.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "LynxImageInfo(context=" + this.f39419a + ", cacheKey=" + this.f39420b + ", src=" + this.f39421c + ", width=" + this.f39422d + ", height=" + this.f39423e + ", transformer=" + this.f39424f + ")";
    }

    public C16416h(Context context, String str, String str2, float f, float f2, Transformer transformer) {
        C89219l.m154719c(context, "");
        this.f39419a = context;
        this.f39420b = str;
        this.f39421c = str2;
        this.f39422d = f;
        this.f39423e = f2;
        this.f39424f = transformer;
    }
}
