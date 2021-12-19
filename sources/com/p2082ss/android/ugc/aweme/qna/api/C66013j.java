package com.p2082ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.api.j */
public final class C66013j {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final int f148624a;
    @AbstractC27891c(mo46611a = "msg")

    /* renamed from: b */
    public final String f148625b;
    @AbstractC27891c(mo46611a = "questions_tab_title")

    /* renamed from: c */
    public final String f148626c;
    @AbstractC27891c(mo46611a = "questions_count")

    /* renamed from: d */
    public final long f148627d;

    static {
        Covode.recordClassIndex(77519);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66013j)) {
            return false;
        }
        C66013j jVar = (C66013j) obj;
        return this.f148624a == jVar.f148624a && C89219l.m154714a(this.f148625b, jVar.f148625b) && C89219l.m154714a(this.f148626c, jVar.f148626c) && this.f148627d == jVar.f148627d;
    }

    public final int hashCode() {
        int i = this.f148624a * 31;
        String str = this.f148625b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f148626c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        long j = this.f148627d;
        return ((hashCode + i2) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "TiktokV1ForumQuestionDeleteResponse(statusCode=" + this.f148624a + ", msg=" + this.f148625b + ", questionsTabTitle=" + this.f148626c + ", questionsCount=" + this.f148627d + ")";
    }
}
