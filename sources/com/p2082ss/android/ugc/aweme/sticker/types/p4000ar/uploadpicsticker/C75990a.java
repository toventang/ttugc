package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a */
public final class C75990a {

    /* renamed from: a */
    public List<String> f170717a;

    /* renamed from: b */
    public final boolean f170718b;

    /* renamed from: c */
    public final boolean f170719c;

    /* renamed from: d */
    public final int f170720d;

    /* renamed from: e */
    public final int f170721e;

    /* renamed from: f */
    public Boolean f170722f;

    static {
        Covode.recordClassIndex(88934);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75990a)) {
            return false;
        }
        C75990a aVar = (C75990a) obj;
        return this.f170718b == aVar.f170718b && this.f170719c == aVar.f170719c && this.f170720d == aVar.f170720d && this.f170721e == aVar.f170721e && C89219l.m154714a(this.f170722f, aVar.f170722f);
    }

    public final int hashCode() {
        boolean z = this.f170718b;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.f170719c) {
            i = 0;
        }
        int i6 = (((((i5 + i) * 31) + this.f170720d) * 31) + this.f170721e) * 31;
        Boolean bool = this.f170722f;
        return i6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "EffectSdkInfo(isUploadPic=" + this.f170718b + ", isMultiSelect=" + this.f170719c + ", minImageCount=" + this.f170720d + ", maxImageCount=" + this.f170721e + ", isSupportGiphy=" + this.f170722f + ")";
    }

    public /* synthetic */ C75990a(boolean z, boolean z2, int i, int i2) {
        this(z, z2, i, i2, false);
    }

    private C75990a(boolean z, boolean z2, int i, int i2, Boolean bool) {
        this.f170718b = z;
        this.f170719c = z2;
        this.f170720d = i;
        this.f170721e = i2;
        this.f170722f = bool;
    }
}
