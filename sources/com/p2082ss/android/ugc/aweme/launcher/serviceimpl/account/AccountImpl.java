package com.p2082ss.android.ugc.aweme.launcher.serviceimpl.account;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2123b.C29735a;
import com.p2082ss.android.sdk.p2174a.C30223b;
import com.p2082ss.android.token.C30628d;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.account.util.C33035e;
import com.p2082ss.android.ugc.aweme.app.launch.p2334a.C33814a;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34542e;
import com.p2082ss.android.ugc.aweme.launcher.service.account.IAccountApi;
import com.p2082ss.android.ugc.trill.main.login.component.I18nLoginActivityComponent;
import java.util.Collection;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.launcher.serviceimpl.account.AccountImpl */
public final class AccountImpl implements IAccountApi {
    static {
        Covode.recordClassIndex(68133);
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.account.IAccountApi
    /* renamed from: d */
    public final String mo95581d() {
        return "mobile";
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.account.IAccountApi
    /* renamed from: a */
    public final boolean mo95576a() {
        return C30223b.f72086a.mo53667a();
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.account.IAccountApi
    /* renamed from: b */
    public final /* synthetic */ AbstractC34542e mo95578b() {
        return new I18nLoginActivityComponent();
    }

    /* renamed from: e */
    public static IAccountApi m104964e() {
        MethodCollector.m26663i(1736);
        Object a = C81908b.m141854a(IAccountApi.class, false);
        if (a != null) {
            IAccountApi iAccountApi = (IAccountApi) a;
            MethodCollector.m26664o(1736);
            return iAccountApi;
        }
        if (C81908b.f183223bZ == null) {
            synchronized (IAccountApi.class) {
                try {
                    if (C81908b.f183223bZ == null) {
                        C81908b.f183223bZ = new AccountImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1736);
                    throw th;
                }
            }
        }
        AccountImpl accountImpl = (AccountImpl) C81908b.f183223bZ;
        MethodCollector.m26664o(1736);
        return accountImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.account.IAccountApi
    /* renamed from: c */
    public final String mo95580c() {
        String b = C33035e.m67669b();
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        if (!TextUtils.isEmpty(b)) {
            String[] split = b.split(";");
            for (String str : split) {
                if (!TextUtils.isEmpty(str)) {
                    String[] split2 = str.split("=");
                    if (split2.length >= 2 && split2[0].trim().equals("sessionid")) {
                        return split2[1];
                    }
                }
            }
        }
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.account.IAccountApi
    /* renamed from: b */
    public final void mo95579b(String str) {
        C29735a.f70919j = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.account.IAccountApi
    /* renamed from: a */
    public final void mo95574a(Collection<String> collection) {
        C89219l.m154721d(collection, "");
        C30628d.m62923a(collection);
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.account.IAccountApi
    /* renamed from: a */
    public final boolean mo95577a(String str) {
        return C30223b.f72086a.mo53668a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.account.IAccountApi
    /* renamed from: a */
    public final void mo95575a(boolean z, String str) {
        C89219l.m154721d(str, "");
        C33814a.m69181a(z, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.account.IAccountApi
    /* renamed from: a */
    public final void mo95573a(String str, String str2, String str3) {
        C29735a.f70910a = str;
        C29735a.f70911b = str;
        C29735a.f70912c = C29735a.f70910a;
        C29735a.f70913d = C29735a.f70910a;
        C29735a.f70914e = C29735a.f70910a;
        C29735a.f70915f = C29735a.f70910a;
        C29735a.f70916g = C29735a.f70910a;
        C29735a.f70917h = str3;
        C29735a.f70918i = str2;
    }
}
