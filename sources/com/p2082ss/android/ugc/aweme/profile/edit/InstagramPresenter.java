package com.p2082ss.android.ugc.aweme.profile.edit;

import android.os.Message;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.lobby.C20891c;
import com.bytedance.lobby.auth.AbstractC20884a;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34572c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.UserResponse;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.InstagramPresenter */
public final class InstagramPresenter implements WeakHandler.IHandler, AbstractC20884a {

    /* renamed from: a */
    static final String f144139a = (Api.f79771d + "/aweme/v1/instagram/bind/");

    /* renamed from: h */
    private static final boolean f144140h = false;

    /* renamed from: b */
    public AbstractC63524b f144141b;

    /* renamed from: c */
    public ActivityC0945e f144142c;

    /* renamed from: d */
    public WeakHandler f144143d = new WeakHandler(this);

    /* renamed from: e */
    public IAccountUserService f144144e = C31575b.m65865g();

    /* renamed from: f */
    InstagramApi f144145f = ((InstagramApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(InstagramApi.class));

    /* renamed from: g */
    public boolean f144146g;

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.InstagramPresenter$InstagramApi */
    public interface InstagramApi {
        static {
            Covode.recordClassIndex(74821);
        }

        @AbstractC22012t
        @AbstractC21999g
        AbstractFutureC27655q<String> doPost(@AbstractC21993ag String str, @AbstractC21998f Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(74820);
    }

    @Override // com.bytedance.lobby.auth.AbstractC20884a
    /* renamed from: a */
    public final void mo34320a(AuthResult authResult) {
        String str;
        String str2 = "redirect_and_get_token";
        if (!authResult.f49367a) {
            this.f144141b.mo102183c(null);
            C20891c cVar = authResult.f49369c;
            if (cVar != null) {
                str = cVar.getMessage();
                str2 = cVar.getErrorStage();
            } else {
                str = "Lobby failed and no error info available";
            }
            mo102153a(str, str2);
            return;
        }
        String string = authResult.f49376j.getString("code");
        if (f144140h) {
            authResult.f49376j.getString("code");
        }
        if (!TextUtils.isEmpty(string)) {
            C80214ai.m139042a(new RunnableC63528f(this, string), "BoltsUtils");
            return;
        }
        this.f144141b.mo102183c(null);
        mo102153a("Authorization code is missing", str2);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        User user;
        if (!(message.obj instanceof Exception) && message.obj != null) {
            if (message.obj instanceof UserResponse) {
                user = ((UserResponse) message.obj).getUser();
            } else {
                user = (User) message.obj;
            }
            this.f144141b.mo102183c(user.getInsId());
            if (message.what == 6) {
                this.f144144e.updateInsId(user.getInsId());
                AbstractC81915c.m141874a(new C34572c(this.f144144e.getCurUser()));
                C39162r.m79460a("social_account_unbind_success", new C33744d().mo59983a("platform", "instagram").f79943a);
                return;
            } else if (message.what == 112) {
                this.f144144e.updateCurUser(user);
                C39162r.m79460a("social_account_bind_success", new C33744d().mo59983a("platform", "instagram").f79943a);
                return;
            }
        }
        mo102153a("Failed to retrieve data from TikTok server", "sycn_user_info");
        this.f144141b.mo102183c(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo102153a(String str, String str2) {
        if (this.f144146g) {
            C39162r.m79460a("social_account_bind_failure", new C33744d().mo59983a("platform", "instagram").mo59983a("error_desc", str).mo59983a("error_code", str2).f79943a);
        }
    }
}
