package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment.a */
public final class C39874a extends AbstractC39856a<CommentViewModel> {
    static {
        Covode.recordClassIndex(47611);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a
    /* renamed from: c */
    public final String mo69150c() {
        return UGCMonitor.EVENT_COMMENT;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a
    /* renamed from: b */
    public final void mo69149b(int i) {
        String str;
        super.mo69149b(i);
        C33744d a = new C33744d().mo59983a("enter_from", "privacy_and_safety_settings");
        if (i == 0) {
            str = "public";
        } else if (i == 1) {
            str = "friends";
        } else if (i != 3) {
            str = "";
        } else {
            str = "no one";
        }
        C39162r.m79460a("disable_account_comment", a.mo59983a("to_status", str).f79943a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C39874a(com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment.CommentViewModel r4, androidx.fragment.app.Fragment r5) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment.C39874a.<init>(com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment.CommentViewModel, androidx.fragment.app.Fragment):void");
    }
}
