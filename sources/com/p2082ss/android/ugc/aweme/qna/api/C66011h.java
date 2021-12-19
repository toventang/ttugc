package com.p2082ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.api.h */
public final class C66011h {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final int f148611a;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    public final String f148612b;
    @AbstractC27891c(mo46611a = "answers_tab_title")

    /* renamed from: c */
    public final String f148613c;
    @AbstractC27891c(mo46611a = "questions_tab_title")

    /* renamed from: d */
    public final String f148614d;
    @AbstractC27891c(mo46611a = "profile_user")

    /* renamed from: e */
    public final User f148615e;
    @AbstractC27891c(mo46611a = "answers_count")

    /* renamed from: f */
    public final Long f148616f;
    @AbstractC27891c(mo46611a = "questions_count")

    /* renamed from: g */
    public final Long f148617g;
    @AbstractC27891c(mo46611a = "allow_ask_question")

    /* renamed from: h */
    public final boolean f148618h;

    static {
        Covode.recordClassIndex(77517);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66011h)) {
            return false;
        }
        C66011h hVar = (C66011h) obj;
        return this.f148611a == hVar.f148611a && C89219l.m154714a(this.f148612b, hVar.f148612b) && C89219l.m154714a(this.f148613c, hVar.f148613c) && C89219l.m154714a(this.f148614d, hVar.f148614d) && C89219l.m154714a(this.f148615e, hVar.f148615e) && C89219l.m154714a(this.f148616f, hVar.f148616f) && C89219l.m154714a(this.f148617g, hVar.f148617g) && this.f148618h == hVar.f148618h;
    }

    public final int hashCode() {
        int i = this.f148611a * 31;
        String str = this.f148612b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f148613c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f148614d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        User user = this.f148615e;
        int hashCode4 = (hashCode3 + (user != null ? user.hashCode() : 0)) * 31;
        Long l = this.f148616f;
        int hashCode5 = (hashCode4 + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.f148617g;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        int i3 = (hashCode5 + i2) * 31;
        boolean z = this.f148618h;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "TiktokV1ForumProfileBannerResponse(statusCode=" + this.f148611a + ", msg=" + this.f148612b + ", answersTabTitle=" + this.f148613c + ", questionsTabTitle=" + this.f148614d + ", profileUser=" + this.f148615e + ", answersCount=" + this.f148616f + ", questionsCount=" + this.f148617g + ", allowAskQuestion=" + this.f148618h + ")";
    }
}
