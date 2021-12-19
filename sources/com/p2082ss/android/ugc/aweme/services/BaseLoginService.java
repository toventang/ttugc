package com.p2082ss.android.ugc.aweme.services;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.bean.C31597d;
import com.p2082ss.android.ugc.aweme.account.login.C32079s;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32835a;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32837b;
import com.p2082ss.android.ugc.aweme.account.util.C33048q;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.BaseLoginService */
public abstract class BaseLoginService implements AbstractC33974au, AbstractC34892bo {
    private boolean mKeepCallback;
    private IAccountService.C31273c mLoginParam;
    private IAccountService.C31273c mPlatformParam;

    static {
        Covode.recordClassIndex(79591);
    }

    public AbstractC34892bo keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    public String getLoginMobEnterFrom() {
        return C32079s.f76562b;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34892bo
    public String getLoginMobEnterMethod() {
        return C32079s.f76561a;
    }

    public IAccountService.C31273c getLoginParam() {
        return this.mLoginParam;
    }

    private void computeNumOfUidsOnDevice() {
        C40780g.m82246c().execute(new BaseLoginService$$Lambda$0(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34892bo
    public List<C31597d> getAllSupportedLoginPlatform() {
        return Collections.singletonList(new C31597d("Phone", 2131231096, "mobile"));
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        IAccountService.C31273c cVar = this.mLoginParam;
        if (cVar != null && (cVar.f74953a instanceof AbstractC1204m)) {
            ((AbstractC1204m) this.mLoginParam.f74953a).getLifecycle().mo4013b(this);
        }
        this.mLoginParam = null;
        this.mPlatformParam = null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$computeNumOfUidsOnDevice$0$BaseLoginService() {
        Keva repo = Keva.getRepo("uid_recorder", 0);
        String[] stringArray = repo.getStringArray("logged_in_uids", new String[20]);
        int i = repo.getInt("num_of_logged_in_uids", 0);
        try {
            String secUid = C36085cj.m73552f().getSecUid();
            if (!TextUtils.isEmpty(secUid) && !containsInArray(stringArray, Math.min(i, 20), secUid)) {
                stringArray[i % 20] = secUid;
                repo.storeStringArray("logged_in_uids", stringArray);
                repo.storeInt("num_of_logged_in_uids", i + 1);
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34892bo
    public void showLoginView(IAccountService.C31273c cVar) {
        this.mLoginParam = cVar;
        C32079s.f76561a = cVar.f74956d.getString("enter_method", "");
        C32079s.f76562b = cVar.f74956d.getString("enter_from", "");
        if (!this.mKeepCallback && (cVar.f74953a instanceof AbstractC1204m)) {
            ((AbstractC1204m) cVar.f74953a).getLifecycle().mo4012a(this);
        }
        this.mKeepCallback = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34892bo
    public void showLoginAndRegisterView(IAccountService.C31273c cVar) {
        this.mLoginParam = cVar;
        if (!cVar.f74956d.getBoolean("is_multi_account", false) && !C33048q.m67694d().getBoolean("account_terminal_app_has_logged_out", true)) {
            C33048q.m67695d(true);
            String str = C32835a.f78203b;
            C33743c cVar2 = new C33743c();
            cVar2.mo59976a(StringSet.type, "auto_logout");
            if (!TextUtils.isEmpty(str)) {
                cVar2.mo59976a("error_desc", str);
            }
            JSONObject a = cVar2.mo59977a();
            C89219l.m154716b(a, "");
            C32837b.m67403a("monitor_account_business", 1, a);
        }
        C32835a.f78202a = "OpenLogin";
        if (!this.mKeepCallback && (cVar.f74953a instanceof AbstractC1204m)) {
            ((AbstractC1204m) cVar.f74953a).getLifecycle().mo4012a(this);
        }
        this.mKeepCallback = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34892bo
    public void logout(String str, String str2) {
        logout(str, str2, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34892bo
    public void loginByPlatform(IAccountService.C31273c cVar, C31597d dVar) {
        this.mPlatformParam = cVar;
        C32079s.f76561a = cVar.f74956d.getString("enter_method", "");
        C32079s.f76562b = cVar.f74956d.getString("enter_from", "");
        if (!this.mKeepCallback && (cVar.f74953a instanceof AbstractC1204m)) {
            ((AbstractC1204m) cVar.f74953a).getLifecycle().mo4012a(this);
        }
        this.mKeepCallback = false;
    }

    public void notifyProgress(int i, int i2, String str) {
        IAccountService.C31273c cVar = this.mLoginParam;
        if (cVar != null && cVar.f74958f != null) {
            this.mLoginParam.f74958f.mo57085a(i, i2);
        }
    }

    private boolean containsInArray(String[] strArr, int i, String str) {
        for (int i2 = 0; i2 < i; i2++) {
            if (TextUtils.equals(strArr[i2], str)) {
                return true;
            }
        }
        return false;
    }

    public void returnResult(int i, int i2, Object obj) {
        IAccountService.C31273c cVar = this.mLoginParam;
        if (!(cVar == null || cVar.f74957e == null)) {
            this.mLoginParam.f74957e.onResult(i, i2, obj);
            this.mLoginParam = null;
        }
        IAccountService.C31273c cVar2 = this.mPlatformParam;
        if (cVar2 != null && cVar2.f74957e != null) {
            this.mPlatformParam.f74957e.onResult(i, i2, obj);
            this.mPlatformParam = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        if (android.text.TextUtils.equals(r14, "user_logout") != false) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0096 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    @Override // com.p2082ss.android.ugc.aweme.AbstractC34892bo
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void logout(java.lang.String r13, java.lang.String r14, com.p2082ss.android.ugc.aweme.AbstractC34892bo.AbstractC34893a r15) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.services.BaseLoginService.logout(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.bo$a):void");
    }
}
