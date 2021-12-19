package com.p2082ss.android.ugc.aweme.question.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.question.C66504c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.question.api.a */
public final class C66500a extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "question")

    /* renamed from: a */
    private C66504c f149493a;

    static {
        Covode.recordClassIndex(78043);
    }

    public final C66504c getQuestion() {
        return this.f149493a;
    }

    public final void setQuestion(C66504c cVar) {
        this.f149493a = cVar;
    }
}
