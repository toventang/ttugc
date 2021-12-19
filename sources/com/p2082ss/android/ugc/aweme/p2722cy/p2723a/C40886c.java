package com.p2082ss.android.ugc.aweme.p2722cy.p2723a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cy.a.c */
public final class C40886c {

    /* renamed from: l */
    public static final C40887a f95694l = new C40887a((byte) 0);

    /* renamed from: a */
    public final String f95695a;

    /* renamed from: b */
    public final int f95696b;

    /* renamed from: c */
    public final boolean f95697c;

    /* renamed from: d */
    public final boolean f95698d;

    /* renamed from: e */
    public final Bundle f95699e;

    /* renamed from: f */
    public final String f95700f;

    /* renamed from: g */
    public final String f95701g;

    /* renamed from: h */
    public final boolean f95702h;

    /* renamed from: i */
    public final boolean f95703i;

    /* renamed from: j */
    public final boolean f95704j;

    /* renamed from: k */
    public final boolean f95705k;

    static {
        Covode.recordClassIndex(48738);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40886c)) {
            return false;
        }
        C40886c cVar = (C40886c) obj;
        return C89219l.m154714a(this.f95695a, cVar.f95695a) && this.f95696b == cVar.f95696b && this.f95697c == cVar.f95697c && this.f95698d == cVar.f95698d && C89219l.m154714a(this.f95699e, cVar.f95699e) && C89219l.m154714a(this.f95700f, cVar.f95700f) && C89219l.m154714a(this.f95701g, cVar.f95701g) && this.f95702h == cVar.f95702h && this.f95703i == cVar.f95703i && this.f95704j == cVar.f95704j && this.f95705k == cVar.f95705k;
    }

    public final int hashCode() {
        String str = this.f95695a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f95696b) * 31;
        boolean z = this.f95697c;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        boolean z2 = this.f95698d;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        Bundle bundle = this.f95699e;
        int hashCode2 = (i10 + (bundle != null ? bundle.hashCode() : 0)) * 31;
        String str2 = this.f95700f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f95701g;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i11 = (hashCode3 + i) * 31;
        boolean z3 = this.f95702h;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        boolean z4 = this.f95703i;
        if (z4) {
            z4 = true;
        }
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = (i15 + i16) * 31;
        boolean z5 = this.f95704j;
        if (z5) {
            z5 = true;
        }
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = z5 ? 1 : 0;
        int i23 = (i19 + i20) * 31;
        if (!this.f95705k) {
            i2 = 0;
        }
        return i23 + i2;
    }

    public final String toString() {
        return "ChooseMusicRequestBean(title=" + this.f95695a + ", musicChooseType=" + this.f95696b + ", allowClear=" + this.f95697c + ", isPhotoMvMode=" + this.f95698d + ", bundle=" + this.f95699e + ", shootWay=" + this.f95700f + ", creationId=" + this.f95701g + ", isBeatMusicSticker=" + this.f95702h + ", hideLocalMusic=" + this.f95703i + ", isMvThemeMusic=" + this.f95704j + ", isLongVideo=" + this.f95705k + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.cy.a.c$a */
    public static final class C40887a {
        static {
            Covode.recordClassIndex(48739);
        }

        private C40887a() {
        }

        public /* synthetic */ C40887a(byte b) {
            this();
        }

        /* renamed from: a */
        private static C40886c m82357a(String str, int i, boolean z, boolean z2, Bundle bundle, String str2, String str3, boolean z3, boolean z4, boolean z5) {
            return new C40886c(str, i, z, false, bundle, str2, str3, z3, z4, z5);
        }

        /* renamed from: a */
        public static /* synthetic */ C40886c m82356a(String str, int i, boolean z, Bundle bundle, String str2, String str3, boolean z2, boolean z3, boolean z4, int i2) {
            boolean z5 = z3;
            boolean z6 = z4;
            if ((i2 & 256) != 0) {
                z5 = false;
            }
            if ((i2 & 512) != 0) {
                z6 = false;
            }
            return m82357a(str, i, z, false, bundle, str2, str3, z2, z5, z6);
        }
    }

    public /* synthetic */ C40886c(String str, int i, boolean z, boolean z2, Bundle bundle, String str2, String str3, boolean z3, boolean z4, boolean z5) {
        this(str, i, z, z2, bundle, str2, str3, z3, z4, false, z5);
    }

    public C40886c(String str, int i, boolean z, boolean z2, Bundle bundle, String str2, String str3, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f95695a = str;
        this.f95696b = i;
        this.f95697c = z;
        this.f95698d = z2;
        this.f95699e = bundle;
        this.f95700f = str2;
        this.f95701g = str3;
        this.f95702h = z3;
        this.f95703i = z4;
        this.f95704j = z5;
        this.f95705k = z6;
    }
}
