package com.p2082ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.api.a */
public final class C66004a {
    @AbstractC27891c(mo46611a = "question_id")

    /* renamed from: a */
    public final long f148585a;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: b */
    public final String f148586b;
    @AbstractC27891c(mo46611a = "question_creator")

    /* renamed from: c */
    public final User f148587c;
    @AbstractC27891c(mo46611a = "answer_creator")

    /* renamed from: d */
    public final User f148588d;
    @AbstractC27891c(mo46611a = "answers")

    /* renamed from: e */
    public final List<Aweme> f148589e;

    static {
        Covode.recordClassIndex(77510);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66004a)) {
            return false;
        }
        C66004a aVar = (C66004a) obj;
        return this.f148585a == aVar.f148585a && C89219l.m154714a(this.f148586b, aVar.f148586b) && C89219l.m154714a(this.f148587c, aVar.f148587c) && C89219l.m154714a(this.f148588d, aVar.f148588d) && C89219l.m154714a(this.f148589e, aVar.f148589e);
    }

    public final String toString() {
        return "AnswerStruct(questionId=" + this.f148585a + ", content=" + this.f148586b + ", questionCreator=" + this.f148587c + ", answerCreator=" + this.f148588d + ", answers=" + this.f148589e + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        long j = this.f148585a;
        int i4 = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f148586b;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = (i4 + i) * 31;
        User user = this.f148587c;
        if (user != null) {
            i2 = user.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        User user2 = this.f148588d;
        if (user2 != null) {
            i3 = user2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        List<Aweme> list = this.f148589e;
        if (list != null) {
            i5 = list.hashCode();
        }
        return i8 + i5;
    }
}
