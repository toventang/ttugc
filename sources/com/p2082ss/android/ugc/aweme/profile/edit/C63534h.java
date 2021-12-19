package com.p2082ss.android.ugc.aweme.profile.edit;

import android.os.Message;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.lobby.C20891c;
import com.bytedance.lobby.auth.AbstractC20884a;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C20886c;
import com.bytedance.lobby.internal.C20919d;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.UserResponse;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.trill.main.login.C85097a;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.h */
public final class C63534h implements WeakHandler.IHandler, AbstractC20884a {

    /* renamed from: e */
    private static final boolean f144192e = false;

    /* renamed from: a */
    protected AbstractC63525c f144193a;

    /* renamed from: b */
    protected ActivityC0945e f144194b;

    /* renamed from: c */
    public WeakHandler f144195c = new WeakHandler(this);

    /* renamed from: d */
    public boolean f144196d;

    static {
        Covode.recordClassIndex(74849);
    }

    /* renamed from: a */
    public final void mo102193a() {
        this.f144196d = true;
        C20886c.C20887a aVar = new C20886c.C20887a(this.f144194b);
        aVar.f49390a = "twitter";
        aVar.f49392c = this;
        C20886c a = aVar.mo34322a();
        C20919d.m39339a();
        C20919d.m39340a(a);
    }

    @Override // com.bytedance.lobby.auth.AbstractC20884a
    /* renamed from: a */
    public final void mo34320a(AuthResult authResult) {
        String str;
        if (authResult.f49367a) {
            C80214ai.m139042a(new RunnableC63537i(this, authResult.f49371e, authResult.f49376j.getString("username"), authResult.f49372f, authResult.f49373g), "BoltsUtils");
            return;
        }
        C20891c cVar = authResult.f49369c;
        if (authResult.f49369c != null) {
            str = authResult.f49369c.getMessage();
        } else {
            str = "";
        }
        this.f144193a.mo102185d(null);
        if (!(cVar == null || TextUtils.equals(str, "Authorization failed, request was canceled.") || TextUtils.equals(str, "Failed to get authorization, bundle incomplete"))) {
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : cVar.getStackTrace()) {
                sb.append(stackTraceElement.toString());
            }
            sb.append(cVar.getMessage());
            String sb2 = sb.toString();
            C17867d.m33078a();
            if (C85097a.m146318a()) {
                C12290b.m22060a("aweme_thirdparty_login_error_rate", 0, C85097a.m146317a("twitter").mo59976a("app_language", SettingServiceImpl.m120782v().mo108872h()).mo59976a("platform", "twitter").mo59976a("errorDesc", String.valueOf(sb2)).mo59976a("errorUrl", "").mo59977a());
            }
            C51423a.m95790a((Throwable) cVar);
            mo102194a(cVar.getMessage(), cVar.getErrorStage());
        }
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
            if (message.what == 112) {
                C31575b.m65865g().updateCurUser(user);
                if (this.f144196d) {
                    this.f144193a.mo102185d(user.getTwitterName());
                    C39162r.m79460a("social_account_bind_success", new C33744d().mo59983a("platform", "twitter").f79943a);
                } else {
                    this.f144193a.mo102185d(null);
                    C39162r.m79460a("social_account_unbind_success", new C33744d().mo59983a("platform", "twitter").f79943a);
                }
                C17867d.m33078a();
                if (C85097a.m146318a()) {
                    C12290b.m22060a("aweme_thirdparty_login_error_rate", 1, C85097a.m146317a("twitter").mo59976a("app_language", SettingServiceImpl.m120782v().mo108872h()).mo59976a("platform", "twitter").mo59977a());
                    return;
                }
                return;
            }
        }
        mo102194a("Failed to retrieve data from TikTok server", "sycn_user_info");
        this.f144193a.mo102185d(null);
    }

    /* renamed from: a */
    public final void mo102194a(String str, String str2) {
        if (this.f144196d) {
            C39162r.m79460a("social_account_bind_failure", new C33744d().mo59983a("platform", "twitter").mo59983a("error_desc", str).mo59983a("error_code", str2).f79943a);
        }
    }
}
