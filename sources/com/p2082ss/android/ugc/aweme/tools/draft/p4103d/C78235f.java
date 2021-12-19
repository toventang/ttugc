package com.p2082ss.android.ugc.aweme.tools.draft.p4103d;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.d.f */
public final class C78235f {
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: a */
    public final String f175721a;
    @AbstractC27891c(mo46611a = "textExtra_strusts")

    /* renamed from: b */
    public final List<AVTextExtraStruct> f175722b;
    @AbstractC27891c(mo46611a = "cover_path")

    /* renamed from: c */
    public final String f175723c;
    @AbstractC27891c(mo46611a = "music_name")

    /* renamed from: d */
    public final String f175724d;
    @AbstractC27891c(mo46611a = "music_id")

    /* renamed from: e */
    public final String f175725e;
    @AbstractC27891c(mo46611a = "time")

    /* renamed from: f */
    public final long f175726f;
    @AbstractC27891c(mo46611a = "save_time")

    /* renamed from: g */
    public long f175727g;

    static {
        Covode.recordClassIndex(91350);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78235f)) {
            return false;
        }
        C78235f fVar = (C78235f) obj;
        return C89219l.m154714a(this.f175721a, fVar.f175721a) && C89219l.m154714a(this.f175722b, fVar.f175722b) && C89219l.m154714a(this.f175723c, fVar.f175723c) && C89219l.m154714a(this.f175724d, fVar.f175724d) && C89219l.m154714a(this.f175725e, fVar.f175725e) && this.f175726f == fVar.f175726f && this.f175727g == fVar.f175727g;
    }

    public final String toString() {
        return "DraftShowInfo(title=" + this.f175721a + ", textExtraStrusts=" + this.f175722b + ", coverPath=" + this.f175723c + ", musicName=" + this.f175724d + ", musicId=" + this.f175725e + ", time=" + this.f175726f + ", saveTime=" + this.f175727g + ")";
    }

    public /* synthetic */ C78235f() {
        this("", null, "", "", "", 0, 0);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f175721a;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        List<AVTextExtraStruct> list = this.f175722b;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str2 = this.f175723c;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str3 = this.f175724d;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str4 = this.f175725e;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        long j = this.f175726f;
        long j2 = this.f175727g;
        return ((((i9 + i5) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C78235f(String str, List<AVTextExtraStruct> list, String str2, String str3, String str4, long j, long j2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.f175721a = str;
        this.f175722b = list;
        this.f175723c = str2;
        this.f175724d = str3;
        this.f175725e = str4;
        this.f175726f = j;
        this.f175727g = j2;
    }
}
