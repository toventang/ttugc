package com.google.android.datatransport.cct.p1923a;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.cct.p1923a.AbstractC25071a;

/* renamed from: com.google.android.datatransport.cct.a.d */
public final class C25075d extends AbstractC25071a {

    /* renamed from: a */
    public final int f59456a;

    /* renamed from: b */
    public final String f59457b;

    /* renamed from: c */
    public final String f59458c;

    /* renamed from: d */
    public final String f59459d;

    /* renamed from: e */
    public final String f59460e;

    /* renamed from: f */
    public final String f59461f;

    /* renamed from: g */
    public final String f59462g;

    /* renamed from: h */
    public final String f59463h;

    static {
        Covode.recordClassIndex(30440);
    }

    /* renamed from: com.google.android.datatransport.cct.a.d$a */
    public static final class C25076a extends AbstractC25071a.AbstractC25072a {

        /* renamed from: a */
        private Integer f59464a;

        /* renamed from: b */
        private String f59465b;

        /* renamed from: c */
        private String f59466c;

        /* renamed from: d */
        private String f59467d;

        /* renamed from: e */
        private String f59468e;

        /* renamed from: f */
        private String f59469f;

        /* renamed from: g */
        private String f59470g;

        /* renamed from: h */
        private String f59471h;

        static {
            Covode.recordClassIndex(30441);
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25071a.AbstractC25072a
        /* renamed from: a */
        public final AbstractC25071a mo40998a() {
            String str = "";
            if (this.f59464a == null) {
                str = str + " sdkVersion";
            }
            if (str.isEmpty()) {
                return new C25075d(this.f59464a.intValue(), this.f59465b, this.f59466c, this.f59467d, this.f59468e, this.f59469f, this.f59470g, this.f59471h);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25071a.AbstractC25072a
        /* renamed from: a */
        public final AbstractC25071a.AbstractC25072a mo40997a(String str) {
            this.f59465b = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25071a.AbstractC25072a
        /* renamed from: b */
        public final AbstractC25071a.AbstractC25072a mo40999b(String str) {
            this.f59466c = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25071a.AbstractC25072a
        /* renamed from: c */
        public final AbstractC25071a.AbstractC25072a mo41000c(String str) {
            this.f59467d = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25071a.AbstractC25072a
        /* renamed from: d */
        public final AbstractC25071a.AbstractC25072a mo41001d(String str) {
            this.f59468e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25071a.AbstractC25072a
        /* renamed from: e */
        public final AbstractC25071a.AbstractC25072a mo41002e(String str) {
            this.f59469f = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25071a.AbstractC25072a
        /* renamed from: f */
        public final AbstractC25071a.AbstractC25072a mo41003f(String str) {
            this.f59470g = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25071a.AbstractC25072a
        /* renamed from: g */
        public final AbstractC25071a.AbstractC25072a mo41004g(String str) {
            this.f59471h = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25071a.AbstractC25072a
        /* renamed from: a */
        public final AbstractC25071a.AbstractC25072a mo40996a(int i) {
            this.f59464a = Integer.valueOf(i);
            return this;
        }
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int i = (this.f59456a ^ 1000003) * 1000003;
        String str = this.f59457b;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (i ^ hashCode) * 1000003;
        String str2 = this.f59458c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        String str3 = this.f59459d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i5 = (i4 ^ hashCode3) * 1000003;
        String str4 = this.f59460e;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        String str5 = this.f59461f;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i7 = (i6 ^ hashCode5) * 1000003;
        String str6 = this.f59462g;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i8 = (i7 ^ hashCode6) * 1000003;
        String str7 = this.f59463h;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        return i8 ^ i2;
    }

    public final String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f59456a + ", model=" + this.f59457b + ", hardware=" + this.f59458c + ", device=" + this.f59459d + ", product=" + this.f59460e + ", osBuild=" + this.f59461f + ", manufacturer=" + this.f59462g + ", fingerprint=" + this.f59463h + "}";
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC25071a) {
            C25075d dVar = (C25075d) ((AbstractC25071a) obj);
            if (this.f59456a != dVar.f59456a || ((str = this.f59457b) != null ? !str.equals(dVar.f59457b) : dVar.f59457b != null) || ((str2 = this.f59458c) != null ? !str2.equals(dVar.f59458c) : dVar.f59458c != null) || ((str3 = this.f59459d) != null ? !str3.equals(dVar.f59459d) : dVar.f59459d != null) || ((str4 = this.f59460e) != null ? !str4.equals(dVar.f59460e) : dVar.f59460e != null) || ((str5 = this.f59461f) != null ? !str5.equals(dVar.f59461f) : dVar.f59461f != null) || ((str6 = this.f59462g) != null ? !str6.equals(dVar.f59462g) : dVar.f59462g != null) || ((str7 = this.f59463h) != null ? !str7.equals(dVar.f59463h) : dVar.f59463h != null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* synthetic */ C25075d(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f59456a = i;
        this.f59457b = str;
        this.f59458c = str2;
        this.f59459d = str3;
        this.f59460e = str4;
        this.f59461f = str5;
        this.f59462g = str6;
        this.f59463h = str7;
    }
}
