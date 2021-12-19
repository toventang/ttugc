package com.p2082ss.android.ugc.aweme.qna.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.model.b */
public final class C66289b {
    @AbstractC27891c(mo46611a = "owner_id")

    /* renamed from: a */
    public final String f149022a;
    @AbstractC27891c(mo46611a = "qa_id")

    /* renamed from: b */
    public final long f149023b;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: c */
    public final String f149024c;
    @AbstractC27891c(mo46611a = "video_count")

    /* renamed from: d */
    public final int f149025d;
    @AbstractC27891c(mo46611a = "share_info")

    /* renamed from: e */
    public final ShareInfo f149026e;
    @AbstractC27891c(mo46611a = "aweme_list")

    /* renamed from: f */
    public final List<Aweme> f149027f;

    static {
        Covode.recordClassIndex(77798);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66289b)) {
            return false;
        }
        C66289b bVar = (C66289b) obj;
        return C89219l.m154714a(this.f149022a, bVar.f149022a) && this.f149023b == bVar.f149023b && C89219l.m154714a(this.f149024c, bVar.f149024c) && this.f149025d == bVar.f149025d && C89219l.m154714a(this.f149026e, bVar.f149026e) && C89219l.m154714a(this.f149027f, bVar.f149027f);
    }

    public final String toString() {
        return "Qna(ownerId=" + this.f149022a + ", questionId=" + this.f149023b + ", questionName=" + this.f149024c + ", userCount=" + this.f149025d + ", shareInfo=" + this.f149026e + ", awemeCoverList=" + this.f149027f + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f149022a;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        long j = this.f149023b;
        int i5 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f149024c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (((i5 + i2) * 31) + this.f149025d) * 31;
        ShareInfo shareInfo = this.f149026e;
        if (shareInfo != null) {
            i3 = shareInfo.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        List<Aweme> list = this.f149027f;
        if (list != null) {
            i4 = list.hashCode();
        }
        return i7 + i4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public C66289b(String str, long j, String str2, int i, ShareInfo shareInfo, List<? extends Aweme> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(list, "");
        this.f149022a = str;
        this.f149023b = j;
        this.f149024c = str2;
        this.f149025d = i;
        this.f149026e = shareInfo;
        this.f149027f = list;
    }
}
