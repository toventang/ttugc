package com.p2082ss.android.ugc.aweme.account.agegate.model;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.sdk.p1625a.p1626a.C22306c;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31566h;
import com.p2082ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p2082ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.p2082ss.android.ugc.aweme.account.util.C33041j;
import com.p2082ss.android.ugc.aweme.account.util.C33043l;
import com.p2082ss.android.ugc.aweme.account.util.C33048q;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.IAccountHelperService;
import com.p2082ss.android.ugc.aweme.share.ShareServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.model.b */
public final class C31541b extends AbstractC39085b<AgeGateResponse> {

    /* renamed from: a */
    public static final Set<String> f75431a = new HashSet(Arrays.asList("NO", "LT", "ET", "DA", "SK", "LV"));

    /* renamed from: d */
    private static final String f75432d = "api.tiktokv.com/aweme/v3/verification/age/";

    /* renamed from: b */
    public EnumC32594j f75433b;

    /* renamed from: c */
    public HashSet<Integer> f75434c = new HashSet<>(Arrays.asList(3008010, 3008011, 3008009, 3008008, 3008012, 3008020, 3008026));

    /* renamed from: e */
    private int f75435e;

    /* renamed from: f */
    private int f75436f;

    /* renamed from: g */
    private int f75437g;

    /* renamed from: h */
    private EnumC32592i f75438h;

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    /* renamed from: e */
    public final boolean mo57546e() {
        if (this.f75433b != EnumC32594j.AGE_GATE) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo57548g() {
        if (this.f75433b == EnumC32594j.AGE_GATE) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo57549h() {
        if (this.f75433b == EnumC32594j.EDIT_DOB_AGE_GATE) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo57551i() {
        if (this.f75438h == EnumC32592i.GUEST_MODE) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final String mo57543c() {
        if (this.mData == null || ((AgeGateResponse) this.mData).getStatus_msg() == null) {
            return "";
        }
        return ((AgeGateResponse) this.mData).getStatus_msg();
    }

    /* renamed from: f */
    public final boolean mo57547f() {
        if (this.mData == null || !this.f75434c.contains(Integer.valueOf(((AgeGateResponse) this.mData).getStatus_code()))) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(38259);
    }

    /* renamed from: b */
    public final boolean mo57542b() {
        if (this.mData == null || ((AgeGateResponse) this.mData).getStatus_code() != 0) {
            return false;
        }
        if (((AgeGateResponse) this.mData).getAgeGatePostAction() == 0 && ((AgeGateResponse) this.mData).getRegisterAgeGatePostAction() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final String mo57545d() {
        String valueOf;
        String valueOf2;
        String valueOf3 = String.valueOf(this.f75435e);
        int i = this.f75436f;
        if (i < 10) {
            valueOf = "0" + this.f75436f;
        } else {
            valueOf = String.valueOf(i);
        }
        int i2 = this.f75437g;
        if (i2 < 10) {
            valueOf2 = "0" + this.f75437g;
        } else {
            valueOf2 = String.valueOf(i2);
        }
        return valueOf3 + "-" + valueOf + "-" + valueOf2;
    }

    /* renamed from: a */
    public final boolean mo57541a() {
        if (this.mData != null && ((AgeGateResponse) this.mData).getStatus_code() == 0 && ((AgeGateResponse) this.mData).getAgeGatePostAction() == 0 && ((AgeGateResponse) this.mData).getRegisterAgeGatePostAction() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        super.handleMsg(message);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(AgeGateResponse ageGateResponse) {
        super.handleData(ageGateResponse);
        C33048q.m67692c().edit().putBoolean("ftc_age_gate_response_prompt", ageGateResponse.is_prompt()).apply();
        C33048q.m67692c().edit().putInt("ftc_age_gate_response_mode", ageGateResponse.getAgeGatePostAction()).apply();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean sendRequest(Object... objArr) {
        boolean z;
        boolean sendRequest = super.sendRequest(objArr);
        if (sendRequest) {
            boolean z2 = false;
            String valueOf = String.valueOf(objArr[0]);
            if (!C36085cj.f85262b.mo57069e().isLogin() || (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue())) {
                z = true;
            } else {
                z = false;
            }
            if (objArr.length > 2 && ((Boolean) objArr[2]).booleanValue()) {
                z2 = true;
            }
            if (!z) {
                C1731i.m5640b(new CallableC31542c(this, valueOf, z2), C1731i.f5562a).mo5542c(new C31543d(this)).mo5543c(new C31544e(this), C1731i.f5564c).mo5532a((AbstractC1729g) new C33041j(this.mHandler));
            } else {
                C1731i.m5640b(new CallableC31545f(this, valueOf), C1731i.f5562a).mo5532a((AbstractC1729g) new C33041j(this.mHandler));
            }
        }
        return sendRequest;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ User mo57539a(C1731i iVar) {
        String str;
        if (!C80214ai.m139043a(iVar)) {
            return null;
        }
        handleData((AgeGateResponse) iVar.mo5545d());
        if (((AgeGateResponse) iVar.mo5545d()).getStatus_code() == 0) {
            User queryUser = C36085cj.f85262b.mo57069e().queryUser(((IAccountHelperService) C31291a.m65463a(IAccountHelperService.class)).selfUserApi(), false);
            int ageGatePostAction = ((AgeGateResponse) iVar.mo5545d()).getAgeGatePostAction();
            if (ageGatePostAction == 0) {
                queryUser.setUserMode(1);
                ShareServiceImpl.m121448d().mo109407a(C17867d.m33078a(), false);
            } else {
                queryUser.setUserMode(2);
                if (ageGatePostAction == 1 && C31575b.m65865g().allUidList().size() > 1) {
                    C31575b.m65865g().logoutAllBackgroundUser();
                }
                ShareServiceImpl.m121448d().mo109407a(C17867d.m33078a(), true);
            }
            queryUser.setAgeGatePostAction(ageGatePostAction);
            queryUser.setAgeGateAction(0);
            C33048q.m67687a(queryUser.getUid(), ageGatePostAction);
            C31566h.m65849a(queryUser.getUid(), ageGatePostAction);
            String uid = queryUser.getUid();
            C34822d.m71158a(C31291a.f74991a, "aweme_user", 0).edit().putInt("ftc_user_mode_prefix_".concat(String.valueOf(uid)), queryUser.getUserMode()).apply();
            return queryUser;
        }
        int status_code = ((AgeGateResponse) iVar.mo5545d()).getStatus_code();
        Integer valueOf = Integer.valueOf(status_code);
        if (((AgeGateResponse) iVar.mo5545d()).getStatus_msg() != null) {
            str = ((AgeGateResponse) iVar.mo5545d()).getStatus_msg();
        } else {
            str = "";
        }
        throw new C34485a(status_code).setErrorMsg(C33043l.m67678a(valueOf, str));
    }

    public C31541b(EnumC32594j jVar, EnumC32592i iVar) {
        this.f75433b = jVar;
        this.f75438h = iVar;
    }

    /* renamed from: a */
    public final void mo57540a(int i, int i2, int i3) {
        this.f75435e = i;
        this.f75436f = i2;
        this.f75437g = i3;
    }

    /* renamed from: a */
    static AgeGateResponse m65797a(String str, boolean z, boolean z2) {
        int i;
        String str2 = C22306c.C22307a.f52737a + f75432d;
        HashMap hashMap = new HashMap();
        hashMap.put("birthday", str);
        int i2 = 1;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        hashMap.put("session_registered", String.valueOf(i));
        if (z2) {
            i2 = 2;
        }
        hashMap.put("update_birthdate_type", String.valueOf(i2));
        if (GuestModeServiceImpl.m65990d().mo57218b()) {
            hashMap.put("is_guest", "1");
        }
        return (AgeGateResponse) new C27910f().mo46670a(NetworkProxyAccount.f78256b.mo58684a(str2, hashMap), AgeGateResponse.class);
    }
}
