package com.p2082ss.android.ugc.aweme.services;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount;
import com.p2082ss.android.ugc.aweme.profile.UserResponse;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.services.ApiNetworkServiceForAccount */
public class ApiNetworkServiceForAccount implements IApiNetworkServiceForAccount {
    private AccountApi mApi = ((AccountApi) C18097a.m33698a(Api.f79771d, AccountApi.class));

    /* renamed from: com.ss.android.ugc.aweme.services.ApiNetworkServiceForAccount$AccountApi */
    public interface AccountApi {
        static {
            Covode.recordClassIndex(79586);
        }

        @AbstractC22000h
        AbstractC21983b<String> doGet(@AbstractC21993ag String str);

        @AbstractC22012t
        @AbstractC21999g
        AbstractC21983b<String> doPost(@AbstractC21993ag String str, @AbstractC21998f Map<String, String> map);

        @AbstractC22012t
        @AbstractC21999g
        AbstractFutureC27655q<UserResponse> postUserResponse(@AbstractC21993ag String str, @AbstractC21998f Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(79585);
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount
    public void executeGetForCheck(String str) {
        Api.m68817a(this.mApi.doGet(str).execute().f52262b, str);
    }

    public static IApiNetworkServiceForAccount createIApiNetworkServiceForAccountbyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(9764);
        Object a = C81908b.m141854a(IApiNetworkServiceForAccount.class, z);
        if (a != null) {
            IApiNetworkServiceForAccount iApiNetworkServiceForAccount = (IApiNetworkServiceForAccount) a;
            MethodCollector.m26664o(9764);
            return iApiNetworkServiceForAccount;
        }
        if (C81908b.f183341dl == null) {
            synchronized (IApiNetworkServiceForAccount.class) {
                try {
                    if (C81908b.f183341dl == null) {
                        C81908b.f183341dl = new ApiNetworkServiceForAccount();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9764);
                    throw th;
                }
            }
        }
        ApiNetworkServiceForAccount apiNetworkServiceForAccount = (ApiNetworkServiceForAccount) C81908b.f183341dl;
        MethodCollector.m26664o(9764);
        return apiNetworkServiceForAccount;
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount
    public User executeGetJSONObject(String str) {
        T t = this.mApi.doGet(str).execute().f52262b;
        JSONObject jSONObject = new JSONObject((String) t);
        Api.m68818a(jSONObject, t, str);
        return (User) GsonHolder.m138943c().mo123620b().mo46670a(jSONObject.opt("user").toString(), User.class);
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount
    public UserResponse executePostJSONObjectForUserResponse(String str, List<C29934d> list) {
        HashMap hashMap = new HashMap();
        if (!C34717d.m70908a(list)) {
            for (C29934d dVar : list) {
                hashMap.put(dVar.f71419a, dVar.f71420b);
            }
            C29803q.m60037b(hashMap, true);
        }
        return this.mApi.postUserResponse(str, hashMap).get();
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount
    public void registerNotice(String str, int i) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("phone_number", str);
        }
        hashMap.put("login_type", String.valueOf(i));
        C29803q.m60037b(hashMap, true);
        Api.m68817a(this.mApi.doPost(Api.f79775h, hashMap).execute().f52262b, Api.f79775h);
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount
    public User executePostJSONObjectForUser(String str, List<C29934d> list) {
        HashMap hashMap = new HashMap();
        if (!C34717d.m70908a(list)) {
            for (C29934d dVar : list) {
                hashMap.put(dVar.f71419a, dVar.f71420b);
            }
            C29803q.m60037b(hashMap, true);
        }
        T t = this.mApi.doPost(str, hashMap).execute().f52262b;
        JSONObject jSONObject = new JSONObject((String) t);
        Api.m68818a(jSONObject, t, str);
        return (User) GsonHolder.m138943c().mo123620b().mo46670a(jSONObject.opt("user").toString(), User.class);
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount
    public AvatarUri uploadAvatar(String str, int i, String str2, List<C29934d> list) {
        if (list == null) {
            return (AvatarUri) Api.m68812a(str, i, str2, AvatarUri.class, "data");
        }
        return (AvatarUri) Api.m68813a(str, i, str2, AvatarUri.class, "data", list);
    }
}
