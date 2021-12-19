package com.p2082ss.android.ugc.aweme.question.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20379aq;
import com.p2082ss.android.ugc.aweme.question.api.C66500a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailState */
public final class QuestionDetailState implements AbstractC20368af {
    private final AbstractC20362a<C66500a> questionDetail;

    static {
        Covode.recordClassIndex(78124);
    }

    public QuestionDetailState() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuestionDetailState copy$default(QuestionDetailState questionDetailState, AbstractC20362a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = questionDetailState.questionDetail;
        }
        return questionDetailState.copy(aVar);
    }

    public final AbstractC20362a<C66500a> component1() {
        return this.questionDetail;
    }

    public final QuestionDetailState copy(AbstractC20362a<C66500a> aVar) {
        C89219l.m154721d(aVar, "");
        return new QuestionDetailState(aVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof QuestionDetailState) && C89219l.m154714a(this.questionDetail, ((QuestionDetailState) obj).questionDetail);
        }
        return true;
    }

    public final int hashCode() {
        AbstractC20362a<C66500a> aVar = this.questionDetail;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "QuestionDetailState(questionDetail=" + this.questionDetail + ")";
    }

    public final AbstractC20362a<C66500a> getQuestionDetail() {
        return this.questionDetail;
    }

    public QuestionDetailState(AbstractC20362a<C66500a> aVar) {
        C89219l.m154721d(aVar, "");
        this.questionDetail = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QuestionDetailState(AbstractC20362a aVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? C20379aq.f48273a : aVar);
    }
}
