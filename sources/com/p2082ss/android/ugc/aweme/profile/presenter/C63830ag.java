package com.p2082ss.android.ugc.aweme.profile.presenter;

import android.text.TextUtils;
import com.bytedance.android.live.base.p177a.C2954a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.p1121b.p1122a.C16105a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p122a.C2541b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C47035m;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.api.C63429c;
import com.p2082ss.android.ugc.aweme.profile.api.C63431e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63765ad;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64135cz;
import com.p2082ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.Map;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.ag */
public class C63830ag extends AbstractC63822aa {

    /* renamed from: c */
    String f144706c;

    /* renamed from: d */
    String f144707d;

    /* renamed from: e */
    public String f144708e;

    /* renamed from: f */
    public Boolean f144709f = true;

    /* renamed from: g */
    public int f144710g = 0;

    /* renamed from: k */
    public boolean f144711k = false;

    /* renamed from: l */
    public boolean f144712l = false;

    static {
        Covode.recordClassIndex(75254);
    }

    /* renamed from: d */
    public final void mo103298d() {
        mo67838a(new AbstractC39085b<UserResponse>() {
            /* class com.p2082ss.android.ugc.aweme.profile.presenter.C63830ag.C638311 */

            static {
                Covode.recordClassIndex(75255);
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length < 2) {
                    return false;
                }
                return true;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean sendRequest(Object... objArr) {
                String str;
                if (!super.sendRequest(objArr)) {
                    C33744d a = new C33744d().mo59983a("enter_from", C63830ag.this.f144708e);
                    if (objArr != null) {
                        a.mo59983a("params", TextUtils.join(",", objArr));
                    }
                    C39162r.m79460a("profile_request_request", a.f79943a);
                    return false;
                }
                C63830ag.this.f144706c = (String) objArr[0];
                C63830ag.this.f144707d = (String) objArr[1];
                if (objArr.length > 2) {
                    str = (String) objArr[2];
                } else {
                    str = null;
                }
                if (C52912c.f121688a.f121689b.getSecIdSwitch().intValue() == 0) {
                    C63431e.m115024a();
                    C63431e.m115026a(this.mHandler, C63830ag.this.f144706c, C63830ag.this.f144707d, str, C63830ag.this.mo103299e(), C63830ag.this.f144709f);
                } else if (!TextUtils.isEmpty(C63830ag.this.f144707d)) {
                    C63431e.m115024a();
                    C63431e.m115027b(this.mHandler, C63429c.m115018a(C63830ag.this.f144707d, null, C63830ag.this.mo103299e(), C63830ag.this.f144709f));
                } else {
                    C63431e.m115024a();
                    C63431e.m115027b(this.mHandler, C63429c.m115019a(null, C63830ag.this.f144706c, str, C63830ag.this.mo103299e(), C63830ag.this.f144709f));
                }
                C39162r.m79460a("profile_request_request", new C33744d().mo59983a("enter_from", C63830ag.this.f144708e).mo59983a("sec_uid", C63830ag.this.f144707d).mo59983a("uid", C63830ag.this.f144706c).f79943a);
                return true;
            }
        });
    }

    public C63830ag() {
        mo103298d();
    }

    /* renamed from: e */
    public final int mo103299e() {
        if (TextUtils.equals(this.f144708e, "music_detail")) {
            return 1;
        }
        if (TextUtils.equals(this.f144708e, "prop_page")) {
            return 3;
        }
        if (TextUtils.equals(this.f144708e, "general_search") && this.f144710g == 2) {
            return 2;
        }
        if (TextUtils.equals(this.f144708e, "general_search") && this.f144710g == 3) {
            return 4;
        }
        if (TextUtils.equals(this.f144708e, "general_search") && this.f144710g == 1) {
            return 6;
        }
        if (this.f144711k) {
            return 7;
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public void mo57528c() {
        String a;
        if (this.f144712l) {
            C2541b.m7437b("profile", "info");
        }
        User user = null;
        if (!(this.f92286h == null || this.f92286h.mData == null)) {
            user = this.f92286h.mData.getUser();
        }
        if (!(this.f92286h == null || this.f92286h.mData == null)) {
            C1731i.m5640b(new CallableC63832ah(this.f92286h.mData), C39162r.m79452a());
        }
        if (!(this.f92286h == null || this.f92286h.mData == null)) {
            C48027ac.C48028a.f111257a.mo80058b(this.f144706c, this.f92286h.mData.getLogPb());
        }
        boolean z = false;
        if (user == null || C31575b.m65865g().isUserEmpty(user)) {
            C39162r.m79460a("profile_request_response", new C33744d().mo59983a("enter_from", this.f144708e).mo59980a("is_success", 0).mo59983a("fail_info", "user_is_empty").mo59983a("to_user_id", this.f144706c).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80059c(this.f144706c)).f79943a);
            return;
        }
        if (user.getFollowStatus() == 1 || user.getFollowStatus() == 2) {
            IMService.createIIMServicebyMonsterPlugin(false).updateIMUserFollowStatus(IMUser.fromUser(user));
        }
        if (this.f92287i == null || (!TextUtils.isEmpty(((AbstractC63855s) this.f92287i).mo103332a()) && !TextUtils.equals(user.getUid(), ((AbstractC63855s) this.f92287i).mo103332a()))) {
            C33744d a2 = new C33744d().mo59983a("enter_from", this.f144708e).mo59980a("is_success", 1);
            StringBuilder append = new StringBuilder().append(this.f144706c).append(",").append(this.f144707d).append(",");
            if (this.f92287i == null) {
                a = "";
            } else {
                a = ((AbstractC63855s) this.f92287i).mo103332a();
            }
            C39162r.m79460a("profile_request_response", a2.mo59983a("fail_info", append.append(a).append(",").append(user.getUid()).toString()).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80059c(this.f144706c)).f79943a);
            return;
        }
        mo103278a(user);
        C2954a aVar = new C2954a();
        aVar.f8697b = Long.parseLong(user.getUid());
        aVar.f8696a = user.roomId;
        aVar.f8698c = !user.isLive();
        AbstractC81915c.m141874a(aVar);
        if (!C80580in.m139694g(user)) {
            int followStatus = user.getFollowStatus();
            IMainServiceHelper createIMainServiceHelperbyMonsterPlugin = MainServiceHelperImpl.createIMainServiceHelperbyMonsterPlugin(false);
            if (createIMainServiceHelperbyMonsterPlugin != null && createIMainServiceHelperbyMonsterPlugin.isChatFunOfflineUnder16()) {
                return;
            }
            if (C16048b.m29633a().mo25421a(true, "hide_profile_message_button", false) && !user.isShowMessageButton()) {
                return;
            }
            if (followStatus == 1 || followStatus == 2 || (C47035m.m90295b() && C64135cz.C64136a.m116068a(user))) {
                String uid = user.getUid();
                if (user.getAccountType() == 3) {
                    z = true;
                }
                C63765ad.m115315a(uid, followStatus, z);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: a */
    public final boolean mo57616a(Object... objArr) {
        if (this.f144712l) {
            C2541b.m7434a("profile", "info");
        }
        return super.mo57616a(objArr);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63822aa
    /* renamed from: a_ */
    public void mo57526a_(Exception exc) {
        if (this.f144712l) {
            C2541b.m7435a("profile", "info", C16105a.m29902a(C17867d.m33078a(), exc));
        }
        C33744d a = new C33744d().mo59983a("to_user_id", this.f144706c).mo59983a("enter_from", this.f144708e).mo59980a("is_success", 0).mo59983a("fail_info", exc.getMessage());
        if (exc instanceof C34485a) {
            a.mo59983a("response", ((C34485a) exc).getResponse());
        }
        Map<String, String> map = a.f79943a;
        C39162r.m79460a("profile_request_response", map);
        C51423a.m95784a(4, "aweme/v1/user", map.toString());
        super.mo57526a_(exc);
    }
}
