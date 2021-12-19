package com.p2082ss.android.ugc.aweme.discover.mob;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.f */
public final class C42454f {

    /* renamed from: a */
    public final String f98959a;

    /* renamed from: b */
    public final String f98960b;

    /* renamed from: c */
    public final String f98961c;

    /* renamed from: d */
    public final boolean f98962d;

    /* renamed from: e */
    public final String f98963e;

    /* renamed from: f */
    public final String f98964f;

    /* renamed from: g */
    public final String f98965g;

    /* renamed from: h */
    public final int f98966h;

    static {
        Covode.recordClassIndex(50402);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42454f)) {
            return false;
        }
        C42454f fVar = (C42454f) obj;
        return C89219l.m154714a(this.f98959a, fVar.f98959a) && C89219l.m154714a(this.f98960b, fVar.f98960b) && C89219l.m154714a(this.f98961c, fVar.f98961c) && this.f98962d == fVar.f98962d && C89219l.m154714a(this.f98963e, fVar.f98963e) && C89219l.m154714a(this.f98964f, fVar.f98964f) && C89219l.m154714a(this.f98965g, fVar.f98965g) && this.f98966h == fVar.f98966h;
    }

    public final int hashCode() {
        String str = this.f98959a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f98960b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f98961c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.f98962d;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode3 + i2) * 31;
        String str4 = this.f98963e;
        int hashCode4 = (i5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f98964f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f98965g;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return ((hashCode5 + i) * 31) + this.f98966h;
    }

    public final String toString() {
        return "SearchFollowParams(event=" + this.f98959a + ", toUserId=" + this.f98960b + ", enterFrom=" + this.f98961c + ", fromSearchResult=" + this.f98962d + ", enterMethod=" + this.f98963e + ", previousPage=" + this.f98964f + ", follow_type=" + this.f98965g + ", isSearchScene=" + this.f98966h + ")";
    }

    public /* synthetic */ C42454f(String str, String str2, String str3) {
        this(str, str2, str3, true, "", "", "");
    }

    public C42454f(String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        this.f98959a = str;
        this.f98960b = str2;
        this.f98961c = str3;
        this.f98962d = z;
        this.f98963e = str4;
        this.f98964f = str5;
        this.f98965g = str6;
        this.f98966h = 1;
    }
}
