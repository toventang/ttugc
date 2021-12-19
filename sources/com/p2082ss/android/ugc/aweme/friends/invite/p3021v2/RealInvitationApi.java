package com.p2082ss.android.ugc.aweme.friends.invite.p3021v2;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.RealInvitationApi */
public interface RealInvitationApi {
    static {
        Covode.recordClassIndex(60858);
    }

    @AbstractC89722f(mo144276a = "/tiktok/social/invitation/config/get/v1")
    AbstractC88979t<C51596a> getInvitationConfig(@AbstractC89736t(mo144292a = "source") String str);

    @AbstractC89722f(mo144276a = "/tiktok/social/invitation/get/v1")
    AbstractC88979t<C51597b> getInvitationInfo(@AbstractC89736t(mo144292a = "invitation_code") String str, @AbstractC89736t(mo144292a = "inviter_uid") String str2, @AbstractC89736t(mo144292a = "inviter_sec_uid") String str3);
}
