package com.p2082ss.android.ugc.aweme.music.assem;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.service.AbstractC12798a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.model.PinnedMusicList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.assem.b */
public final class C60394b implements AbstractC12798a {

    /* renamed from: a */
    public final String f137576a;

    /* renamed from: b */
    public final String f137577b;

    /* renamed from: c */
    public final boolean f137578c;

    /* renamed from: d */
    public final boolean f137579d;

    /* renamed from: e */
    public final boolean f137580e;

    /* renamed from: f */
    public final boolean f137581f;

    /* renamed from: g */
    public final C12776a<Boolean> f137582g;

    /* renamed from: h */
    public final PinnedMusicList f137583h;

    static {
        Covode.recordClassIndex(70943);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60394b)) {
            return false;
        }
        C60394b bVar = (C60394b) obj;
        return C89219l.m154714a(this.f137576a, bVar.f137576a) && C89219l.m154714a(this.f137577b, bVar.f137577b) && this.f137578c == bVar.f137578c && this.f137579d == bVar.f137579d && this.f137580e == bVar.f137580e && this.f137581f == bVar.f137581f && C89219l.m154714a(this.f137582g, bVar.f137582g) && C89219l.m154714a(this.f137583h, bVar.f137583h);
    }

    public final int hashCode() {
        String str = this.f137576a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f137577b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.f137578c;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        boolean z2 = this.f137579d;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.f137580e;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        if (!this.f137581f) {
            i2 = 0;
        }
        int i15 = (i14 + i2) * 31;
        C12776a<Boolean> aVar = this.f137582g;
        int hashCode3 = (i15 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        PinnedMusicList pinnedMusicList = this.f137583h;
        if (pinnedMusicList != null) {
            i = pinnedMusicList.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "OriginMusicCommonData(userId=" + this.f137576a + ", secUserId=" + this.f137577b + ", isPrivateAccount=" + this.f137578c + ", isMe=" + this.f137579d + ", canPin=" + this.f137580e + ", fromSearch=" + this.f137581f + ", onVisibleChanged=" + this.f137582g + ", pinnedMusicList=" + this.f137583h + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C60394b(String str, String str2, boolean z, boolean z2, boolean z3, PinnedMusicList pinnedMusicList, int i) {
        this(str, str2, false, z, z2, z3, null, (i & 128) != 0 ? null : pinnedMusicList);
    }

    private C60394b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, C12776a<Boolean> aVar, PinnedMusicList pinnedMusicList) {
        this.f137576a = str;
        this.f137577b = str2;
        this.f137578c = z;
        this.f137579d = z2;
        this.f137580e = z3;
        this.f137581f = z4;
        this.f137582g = aVar;
        this.f137583h = pinnedMusicList;
    }

    /* renamed from: a */
    public static /* synthetic */ C60394b m110061a(C60394b bVar, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, C12776a aVar, PinnedMusicList pinnedMusicList, int i) {
        PinnedMusicList pinnedMusicList2 = pinnedMusicList;
        C12776a aVar2 = aVar;
        boolean z5 = z4;
        boolean z6 = z3;
        String str3 = str;
        String str4 = str2;
        boolean z7 = z;
        boolean z8 = z2;
        if ((i & 1) != 0) {
            str3 = bVar.f137576a;
        }
        if ((i & 2) != 0) {
            str4 = bVar.f137577b;
        }
        if ((i & 4) != 0) {
            z7 = bVar.f137578c;
        }
        if ((i & 8) != 0) {
            z8 = bVar.f137579d;
        }
        if ((i & 16) != 0) {
            z6 = bVar.f137580e;
        }
        if ((i & 32) != 0) {
            z5 = bVar.f137581f;
        }
        if ((i & 64) != 0) {
            aVar2 = bVar.f137582g;
        }
        if ((i & 128) != 0) {
            pinnedMusicList2 = bVar.f137583h;
        }
        return new C60394b(str3, str4, z7, z8, z6, z5, aVar2, pinnedMusicList2);
    }
}
