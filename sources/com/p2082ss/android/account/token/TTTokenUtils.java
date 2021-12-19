package com.p2082ss.android.account.token;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.p2082ss.android.C29845d;
import com.p2082ss.android.token.C30627c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.account.token.TTTokenUtils */
public class TTTokenUtils {
    static {
        Covode.recordClassIndex(35761);
    }

    public static void addTokenInterceptor() {
        RetrofitUtils.m43285a(new TTTokenInterceptor());
        C29845d.m60144a("TTTokenUtils", "call addTokenInterceptor");
    }

    /* renamed from: a */
    public static List<C30627c> m58801a(List<C22027b> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C22027b bVar : list) {
            if (bVar != null && !TextUtils.isEmpty(bVar.f52037a) && !TextUtils.isEmpty(bVar.f52038b)) {
                arrayList.add(new C30627c(bVar.f52037a, bVar.f52038b));
            }
        }
        return arrayList;
    }
}
