package com.bytedance.android.livesdk.p604qa;

import com.bytedance.android.livesdk.model.message.C9676bi;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.qa.af */
public final class C10188af {
    @AbstractC27891c(mo46611a = "question")

    /* renamed from: a */
    public C9676bi f24694a;
    @AbstractC27891c(mo46611a = "like_cnt")

    /* renamed from: b */
    public long f24695b;
    @AbstractC27891c(mo46611a = "self_like_status")

    /* renamed from: c */
    public int f24696c;

    static {
        Covode.recordClassIndex(11754);
    }

    public C10188af() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10188af)) {
            return false;
        }
        C10188af afVar = (C10188af) obj;
        return C89219l.m154714a(this.f24694a, afVar.f24694a) && this.f24695b == afVar.f24695b && this.f24696c == afVar.f24696c;
    }

    public final String toString() {
        return "QuestionEx(question=" + this.f24694a + ", likeCount=" + this.f24695b + ", selfLikeStatus=" + this.f24696c + ")";
    }

    public final int hashCode() {
        int i;
        C9676bi biVar = this.f24694a;
        if (biVar != null) {
            i = biVar.hashCode();
        } else {
            i = 0;
        }
        long j = this.f24695b;
        return (((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f24696c;
    }

    public C10188af(C9676bi biVar) {
        C89219l.m154721d(biVar, "");
        this.f24694a = biVar;
        this.f24695b = 0;
        this.f24696c = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10188af(C9676bi biVar, int i) {
        this((i & 1) != 0 ? new C9676bi() : biVar);
    }
}
