package com.p2082ss.android.ugc.aweme.share.improve.p3755a.p3756a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.qna.model.C66289b;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C68993ai;
import com.p2082ss.android.ugc.aweme.share.qrcode.DialogC69376a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.a.c */
public final class C68970c extends C68993ai {

    /* renamed from: b */
    private final C66289b f154296b;

    static {
        Covode.recordClassIndex(81284);
    }

    public C68970c(C66289b bVar) {
        C89219l.m154721d(bVar, "");
        this.f154296b = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h, com.p2082ss.android.ugc.aweme.share.improve.p3755a.C68993ai
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        new DialogC69376a(context, this.f154296b.f149024c, (long) this.f154296b.f149025d, "qna", 51, String.valueOf(this.f154296b.f149023b), (byte) 0).show();
        C39162r.m79460a("click_qr_code", new C33744d().mo59983a("enter_from", "qa_detail").mo59983a("qr_code_type", "question").mo59981a("question_id", this.f154296b.f149023b).f79943a);
    }
}
