package com.p2082ss.android.ugc.aweme.discover.p2760a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.a.ap */
public final class C41508ap {

    /* renamed from: d */
    public static final C41509a f96830d = new C41509a((byte) 0);
    @AbstractC27891c(mo46611a = "highlight_type")

    /* renamed from: a */
    public final int f96831a;
    @AbstractC27891c(mo46611a = "font_color")

    /* renamed from: b */
    public final String f96832b;
    @AbstractC27891c(mo46611a = "background_color")

    /* renamed from: c */
    public final String f96833c;

    static {
        Covode.recordClassIndex(49415);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41508ap)) {
            return false;
        }
        C41508ap apVar = (C41508ap) obj;
        return this.f96831a == apVar.f96831a && C89219l.m154714a(this.f96832b, apVar.f96832b) && C89219l.m154714a(this.f96833c, apVar.f96833c);
    }

    public final int hashCode() {
        int i = this.f96831a * 31;
        String str = this.f96832b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f96833c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "UserRelationTagStyle(highlightType=" + this.f96831a + ", fontColor=" + this.f96832b + ", backgroundColor=" + this.f96833c + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.ap$a */
    public static final class C41509a {
        static {
            Covode.recordClassIndex(49416);
        }

        private C41509a() {
        }

        public /* synthetic */ C41509a(byte b) {
            this();
        }
    }

    public /* synthetic */ C41508ap() {
        this("#80161823", "#FFF1F1F2");
    }

    private C41508ap(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f96831a = 3;
        this.f96832b = str;
        this.f96833c = str2;
    }
}
