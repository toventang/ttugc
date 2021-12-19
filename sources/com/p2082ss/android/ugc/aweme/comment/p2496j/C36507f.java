package com.p2082ss.android.ugc.aweme.comment.p2496j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;

/* renamed from: com.ss.android.ugc.aweme.comment.j.f */
public final class C36507f extends AbstractC36503b<BaseCommentResponse> {

    /* renamed from: b */
    public String f86436b = "";

    /* renamed from: c */
    public String f86437c = "";

    /* renamed from: d */
    public String f86438d = "";

    /* renamed from: e */
    public Comment f86439e;

    static {
        Covode.recordClassIndex(43810);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 4) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2496j.AbstractC36503b, com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C34608n.m70658a().mo61083a(this.mHandler, new CallableC36508g(this, objArr), 0);
        return true;
    }
}
