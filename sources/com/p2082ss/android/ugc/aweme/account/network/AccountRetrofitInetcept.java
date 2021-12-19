package com.p2082ss.android.ugc.aweme.account.network;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import java.util.regex.Pattern;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.network.AccountRetrofitInetcept */
public final class AccountRetrofitInetcept implements AbstractC22021a {

    /* renamed from: a */
    public static final AccountRetrofitInetcept f78252a = new AccountRetrofitInetcept();

    /* renamed from: b */
    private static final Pattern f78253b = Pattern.compile(".*/passport/.*");

    /* renamed from: c */
    private static String f78254c = "";

    private AccountRetrofitInetcept() {
    }

    static {
        Covode.recordClassIndex(39655);
    }

    /* renamed from: a */
    public static void m67474a(String str) {
        C89219l.m154721d(str, "");
        f78254c = str;
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public final C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m67473a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u<?> a = m67473a(aVar);
        if (bVar.f82416X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f82416X;
            String simpleName = getClass().getSimpleName();
            bVar.mo61814a(simpleName, uptimeMillis2);
            bVar.mo61816c(simpleName, uptimeMillis2);
        }
        bVar.f82416X = SystemClock.uptimeMillis();
        return a;
    }

    /* renamed from: a */
    private static C22099u<?> m67473a(AbstractC22021a.AbstractC22022a aVar) {
        C89219l.m154721d(aVar, "");
        Request a = aVar.mo35809a();
        C89219l.m154716b(a, "");
        String url = a.getUrl();
        C89219l.m154716b(url, "");
        if (f78253b.matcher(url).matches()) {
            if (C89361p.m154908a((CharSequence) url, (CharSequence) "?", false)) {
                url = url + "&support_webview=1";
            } else {
                url = url + "?support_webview=1";
            }
            if (!TextUtils.isEmpty(f78254c)) {
                url = url + "&interstitial_token=" + f78254c;
            }
        }
        C22099u<?> a2 = aVar.mo35810a(a.newBuilder().mo35838a(url).mo35840a());
        C89219l.m154716b(a2, "");
        return a2;
    }
}
