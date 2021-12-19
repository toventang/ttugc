package com.p2082ss.android.ugc.aweme.music.p3481ui;

import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.b */
public final class C61133b implements AbstractC12779c {

    /* renamed from: a */
    public final List<ExternalMusicInfo> f138812a;

    /* renamed from: b */
    public final boolean f138813b;

    /* renamed from: c */
    public final String f138814c;

    /* renamed from: d */
    public final String f138815d;

    /* renamed from: e */
    public final String f138816e;

    static {
        Covode.recordClassIndex(71738);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61133b)) {
            return false;
        }
        C61133b bVar = (C61133b) obj;
        return C89219l.m154714a(this.f138812a, bVar.f138812a) && this.f138813b == bVar.f138813b && C89219l.m154714a(this.f138814c, bVar.f138814c) && C89219l.m154714a(this.f138815d, bVar.f138815d) && C89219l.m154714a(this.f138816e, bVar.f138816e);
    }

    public final int hashCode() {
        List<ExternalMusicInfo> list = this.f138812a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.f138813b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        String str = this.f138814c;
        int hashCode2 = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f138815d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f138816e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "ChooseThirdMusicData(musicInfoList=" + this.f138812a + ", isExclusiveResso=" + this.f138813b + ", processId=" + this.f138814c + ", musicId=" + this.f138815d + ", groupId=" + this.f138816e + ")";
    }

    public C61133b(List<ExternalMusicInfo> list, boolean z, String str, String str2, String str3) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f138812a = list;
        this.f138813b = z;
        this.f138814c = str;
        this.f138815d = str2;
        this.f138816e = str3;
    }
}
