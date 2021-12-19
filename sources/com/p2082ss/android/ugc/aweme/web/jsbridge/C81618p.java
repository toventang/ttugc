package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.p */
final /* synthetic */ class C81618p implements AbstractC1729g {

    /* renamed from: a */
    private final FeedbackUploadALog f182510a;

    static {
        Covode.recordClassIndex(95015);
    }

    C81618p(FeedbackUploadALog feedbackUploadALog) {
        this.f182510a = feedbackUploadALog;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        if (!iVar.mo5535a() || TextUtils.isEmpty((CharSequence) iVar.mo5545d())) {
            return FeedbackUploadALog.m141426a("null");
        }
        return FeedbackUploadALog.m141426a((String) iVar.mo5545d());
    }
}
