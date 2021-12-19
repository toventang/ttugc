package com.p2082ss.android.ugc.aweme.sticker.repository.p3986c;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.c.c */
public final class C75728c {

    /* renamed from: a */
    public final String f170141a;

    /* renamed from: b */
    public final String f170142b;

    /* renamed from: c */
    public final int f170143c;

    /* renamed from: d */
    public final int f170144d;

    /* renamed from: e */
    public final Map<String, String> f170145e;

    /* renamed from: f */
    public final boolean f170146f;

    /* renamed from: g */
    public final String f170147g;

    static {
        Covode.recordClassIndex(88659);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75728c)) {
            return false;
        }
        C75728c cVar = (C75728c) obj;
        return C89219l.m154714a(this.f170141a, cVar.f170141a) && C89219l.m154714a(this.f170142b, cVar.f170142b) && this.f170143c == cVar.f170143c && this.f170144d == cVar.f170144d && C89219l.m154714a(this.f170145e, cVar.f170145e) && this.f170146f == cVar.f170146f && C89219l.m154714a(this.f170147g, cVar.f170147g);
    }

    public final int hashCode() {
        String str = this.f170141a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f170142b;
        int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f170143c) * 31) + this.f170144d) * 31;
        Map<String, String> map = this.f170145e;
        int hashCode3 = (hashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        boolean z = this.f170146f;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode3 + i2) * 31;
        String str3 = this.f170147g;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "SearchStickerRequest(searchId=" + this.f170141a + ", keyword=" + this.f170142b + ", count=" + this.f170143c + ", cursor=" + this.f170144d + ", extraParams=" + this.f170145e + ", fromGuessTag=" + this.f170146f + ", host=" + this.f170147g + ")";
    }

    private C75728c(String str, String str2, int i, Map<String, String> map, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(map, "");
        C89219l.m154721d(str3, "");
        this.f170141a = str;
        this.f170142b = str2;
        this.f170143c = i;
        this.f170144d = 0;
        this.f170145e = map;
        this.f170146f = false;
        this.f170147g = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C75728c(String str, String str2, int i, Map map, String str3, int i2) {
        this((i2 & 1) != 0 ? "0" : str, str2, (i2 & 4) != 0 ? 60 : i, (i2 & 16) != 0 ? C89041ag.m154415a() : map, (i2 & 64) != 0 ? "" : str3);
    }
}
