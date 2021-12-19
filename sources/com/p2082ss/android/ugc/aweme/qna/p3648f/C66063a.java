package com.p2082ss.android.ugc.aweme.qna.p3648f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* renamed from: com.ss.android.ugc.aweme.qna.f.a */
public final class C66063a {

    /* renamed from: a */
    public static final C66063a f148767a = new C66063a();

    private C66063a() {
    }

    static {
        Covode.recordClassIndex(77569);
    }

    /* renamed from: a */
    public static void m117874a(String str, String str2, Long l, Integer num, Integer num2) {
        C33744d dVar = new C33744d();
        if (str != null) {
            dVar.mo59983a("enter_from", str);
        }
        dVar.mo59983a("enter_method", str2);
        if (l != null) {
            dVar.mo59981a("question_id", l.longValue());
        }
        if (num != null) {
            dVar.mo59980a("invitee_cnt", num.intValue());
        }
        if (num2 != null) {
            dVar.mo59980a("is_success", num2.intValue());
        }
        C39162r.m79460a("send_qa_invitation", dVar.f79943a);
    }
}
