package com.p2082ss.android.ugc.aweme.friends.invite.p3021v2;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationApi */
public final class InvitationApi implements RealInvitationApi {

    /* renamed from: a */
    public static final InvitationApi f118801a = new InvitationApi();

    /* renamed from: b */
    private final /* synthetic */ RealInvitationApi f118802b;

    @Override // com.p2082ss.android.ugc.aweme.friends.invite.p3021v2.RealInvitationApi
    @AbstractC89722f(mo144276a = "/tiktok/social/invitation/config/get/v1")
    public final AbstractC88979t<C51596a> getInvitationConfig(@AbstractC89736t(mo144292a = "source") String str) {
        C89219l.m154721d(str, "");
        return this.f118802b.getInvitationConfig(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.invite.p3021v2.RealInvitationApi
    @AbstractC89722f(mo144276a = "/tiktok/social/invitation/get/v1")
    public final AbstractC88979t<C51597b> getInvitationInfo(@AbstractC89736t(mo144292a = "invitation_code") String str, @AbstractC89736t(mo144292a = "inviter_uid") String str2, @AbstractC89736t(mo144292a = "inviter_sec_uid") String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return this.f118802b.getInvitationInfo(str, str2, str3);
    }

    static {
        Covode.recordClassIndex(60816);
    }

    private InvitationApi() {
        Object a = RetrofitFactory.m33635a().mo28817b(Api.f79771d).mo28832d().mo28858a(RealInvitationApi.class);
        C89219l.m154716b(a, "");
        this.f118802b = (RealInvitationApi) a;
    }
}
