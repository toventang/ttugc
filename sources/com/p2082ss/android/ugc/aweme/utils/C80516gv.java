package com.p2082ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.C90200t;
import okhttp3.Request;

/* renamed from: com.ss.android.ugc.aweme.utils.gv */
public final class C80516gv implements AbstractC90202u {
    static {
        Covode.recordClassIndex(93789);
    }

    @Override // okhttp3.AbstractC90202u
    public final C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        Request a = aVar.mo144856a();
        C90200t url = a.url();
        if (url != null) {
            C80517gw.m139563a();
            C80517gw.m139567a(url);
            C90200t.C90201a j = url.mo145060j();
            String[] strArr = C80517gw.f180119b;
            for (String str : strArr) {
                String c = url.mo145048c(str);
                if (TextUtils.isEmpty(url.mo145048c("sec_".concat(String.valueOf(str))))) {
                    String c2 = C80517gw.m139563a().mo123775c(c);
                    if (!TextUtils.isEmpty(c2)) {
                        if (C80517gw.m139563a().mo123774b(url.toString())) {
                            j.mo145072e(str);
                        }
                        j.mo145070c("sec_".concat(String.valueOf(str)), c2);
                    }
                }
            }
            a = a.newBuilder().mo144691a(j.mo145068b().toString()).mo144698a();
        }
        return aVar.mo144857a(a);
    }
}
