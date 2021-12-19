package com.twitter.sdk.android.core.internal.scribe;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.e */
public final class C87764e {
    @AbstractC27891c(mo46611a = "client")

    /* renamed from: a */
    public final String f199342a;
    @AbstractC27891c(mo46611a = "page")

    /* renamed from: b */
    public final String f199343b;
    @AbstractC27891c(mo46611a = "section")

    /* renamed from: c */
    public final String f199344c;
    @AbstractC27891c(mo46611a = "component")

    /* renamed from: d */
    public final String f199345d;
    @AbstractC27891c(mo46611a = "element")

    /* renamed from: e */
    public final String f199346e;
    @AbstractC27891c(mo46611a = "action")

    /* renamed from: f */
    public final String f199347f;

    static {
        Covode.recordClassIndex(103762);
    }

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.e$a */
    public static class C87765a {

        /* renamed from: a */
        public String f199348a;

        /* renamed from: b */
        public String f199349b;

        /* renamed from: c */
        public String f199350c;

        /* renamed from: d */
        public String f199351d;

        /* renamed from: e */
        public String f199352e;

        /* renamed from: f */
        public String f199353f;

        static {
            Covode.recordClassIndex(103763);
        }

        /* renamed from: a */
        public final C87764e mo142219a() {
            return new C87764e(this.f199348a, this.f199349b, this.f199350c, this.f199351d, this.f199352e, this.f199353f);
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str = this.f199342a;
        int i6 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        String str2 = this.f199343b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        String str3 = this.f199344c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        String str4 = this.f199345d;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        String str5 = this.f199346e;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        String str6 = this.f199347f;
        if (str6 != null) {
            i6 = str6.hashCode();
        }
        return i11 + i6;
    }

    public final String toString() {
        return "client=" + this.f199342a + ", page=" + this.f199343b + ", section=" + this.f199344c + ", component=" + this.f199345d + ", element=" + this.f199346e + ", action=" + this.f199347f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C87764e eVar = (C87764e) obj;
        String str = this.f199347f;
        if (str == null ? eVar.f199347f != null : !str.equals(eVar.f199347f)) {
            return false;
        }
        String str2 = this.f199342a;
        if (str2 == null ? eVar.f199342a != null : !str2.equals(eVar.f199342a)) {
            return false;
        }
        String str3 = this.f199345d;
        if (str3 == null ? eVar.f199345d != null : !str3.equals(eVar.f199345d)) {
            return false;
        }
        String str4 = this.f199346e;
        if (str4 == null ? eVar.f199346e != null : !str4.equals(eVar.f199346e)) {
            return false;
        }
        String str5 = this.f199343b;
        if (str5 == null ? eVar.f199343b != null : !str5.equals(eVar.f199343b)) {
            return false;
        }
        String str6 = this.f199344c;
        String str7 = eVar.f199344c;
        if (str6 == null ? str7 == null : str6.equals(str7)) {
            return true;
        }
        return false;
    }

    public C87764e(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f199342a = str;
        this.f199343b = str2;
        this.f199344c = str3;
        this.f199345d = str4;
        this.f199346e = str5;
        this.f199347f = str6;
    }
}
