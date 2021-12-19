package com.p2082ss.android.ugc.aweme.p2722cy.p2723a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cy.a.d */
public final class C40888d {

    /* renamed from: f */
    public static final C40889a f95706f = new C40889a((byte) 0);

    /* renamed from: a */
    public final boolean f95707a;

    /* renamed from: b */
    public final String f95708b;

    /* renamed from: c */
    public final C69905c f95709c;

    /* renamed from: d */
    public final String f95710d;

    /* renamed from: e */
    public final boolean f95711e;

    static {
        Covode.recordClassIndex(48740);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40888d)) {
            return false;
        }
        C40888d dVar = (C40888d) obj;
        return this.f95707a == dVar.f95707a && C89219l.m154714a(this.f95708b, dVar.f95708b) && C89219l.m154714a(this.f95709c, dVar.f95709c) && C89219l.m154714a(this.f95710d, dVar.f95710d) && this.f95711e == dVar.f95711e;
    }

    public final int hashCode() {
        boolean z = this.f95707a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.f95708b;
        int i6 = 0;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        C69905c cVar = this.f95709c;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        String str2 = this.f95710d;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        int i7 = (hashCode2 + i6) * 31;
        if (!this.f95711e) {
            i = 0;
        }
        return i7 + i;
    }

    public final String toString() {
        return "ChooseMusicResultBean(isCancelCurrentMusic=" + this.f95707a + ", musicOrigin=" + this.f95708b + ", music=" + this.f95709c + ", musicLocalPath=" + this.f95710d + ", isShowTips=" + this.f95711e + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.cy.a.d$a */
    public static final class C40889a {
        static {
            Covode.recordClassIndex(48741);
        }

        private C40889a() {
        }

        public /* synthetic */ C40889a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C40888d m82358a(Boolean bool, String str, C69905c cVar, String str2) {
            boolean z;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            return new C40888d(z, str, cVar, str2);
        }
    }

    public /* synthetic */ C40888d(boolean z, String str, C69905c cVar, String str2) {
        this(z, str, cVar, str2, true);
    }

    public C40888d(boolean z, String str, C69905c cVar, String str2, boolean z2) {
        this.f95707a = z;
        this.f95708b = str;
        this.f95709c = cVar;
        this.f95710d = str2;
        this.f95711e = z2;
    }
}
