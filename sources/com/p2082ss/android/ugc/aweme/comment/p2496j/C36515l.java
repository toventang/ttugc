package com.p2082ss.android.ugc.aweme.comment.p2496j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.comment.model.CommentResponse;

/* renamed from: com.ss.android.ugc.aweme.comment.j.l */
public final class C36515l extends AbstractC36503b<CommentResponse> {
    static {
        Covode.recordClassIndex(43818);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2496j.AbstractC36503b, com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C34608n.m70658a().mo61083a(this.mHandler, new CallableC36516m(objArr), 0);
        return true;
    }
}
