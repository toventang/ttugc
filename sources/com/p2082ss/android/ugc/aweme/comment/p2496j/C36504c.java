package com.p2082ss.android.ugc.aweme.comment.p2496j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36499g;

/* renamed from: com.ss.android.ugc.aweme.comment.j.c */
public final class C36504c extends AbstractC36503b<BaseCommentResponse> {

    /* renamed from: b */
    public String f86431b = "";

    /* renamed from: c */
    public String f86432c = "";

    /* renamed from: d */
    public C36499g f86433d;

    static {
        Covode.recordClassIndex(43807);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 2) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2496j.AbstractC36503b, com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C34608n.m70658a().mo61083a(this.mHandler, new CallableC36505d(this, objArr), 0);
        return true;
    }
}
