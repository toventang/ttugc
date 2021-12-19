package com.p2082ss.android.ugc.aweme.share.improve.p3755a.p3756a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C68993ai;
import com.p2082ss.android.ugc.aweme.share.qrcode.DialogC69376a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.a.d */
public final class C68971d extends C68993ai {

    /* renamed from: b */
    private final C75445g f154297b;

    /* renamed from: c */
    private final String f154298c;

    static {
        Covode.recordClassIndex(81285);
    }

    public C68971d(C75445g gVar, String str) {
        C89219l.m154721d(gVar, "");
        this.f154297b = gVar;
        this.f154298c = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h, com.p2082ss.android.ugc.aweme.share.improve.p3755a.C68993ai
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        C39162r.m79460a("enter_personal_detail", new C33744d().mo59983a("prop_id", this.f154297b.f169545id).mo59983a("to_user_id", this.f154297b.ownerId).mo59983a("group_id", this.f154298c).mo59983a("enter_from", "prop_page").mo59983a("enter_method", "click_name").f79943a);
        String str = this.f154297b.name;
        long j = this.f154297b.userCount;
        String str2 = this.f154297b.f169545id;
        C89219l.m154716b(str2, "");
        new DialogC69376a(context, str, j, "sticker", 17, str2, (byte) 0).show();
    }
}
