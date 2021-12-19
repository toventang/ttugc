package com.p2082ss.android.ugc.aweme.net.p3495h.p3496a.p3497a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.token.C30628d;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import java.util.Map;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.Request;

/* renamed from: com.ss.android.ugc.aweme.net.h.a.a.c */
public final class C61366c extends C61367d {
    static {
        Covode.recordClassIndex(71999);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.net.p3495h.p3496a.p3497a.C61367d
    /* renamed from: a */
    public final C90029ac mo98960a(AbstractC90202u.AbstractC90203a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        Request a = aVar.mo144856a();
        Map a2 = C30628d.m62921a(a.url().toString());
        if (a2 != null && !a2.isEmpty()) {
            Request.C90016a aVar2 = null;
            for (Map.Entry entry : a2.entrySet()) {
                if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue()) && !TextUtils.equals(a.header((String) entry.getKey()), (CharSequence) entry.getValue())) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    a.header(str);
                    if (aVar2 == null) {
                        aVar2 = a.newBuilder();
                    }
                    aVar2.mo144692a(str, str2);
                }
            }
            if (aVar2 != null) {
                a = aVar2.mo144698a();
            }
        }
        C58945a.C58947b.f134185a.mo96423a("ensure_tt_token_interceptor_duration", System.currentTimeMillis() - currentTimeMillis);
        return aVar.mo144857a(a);
    }
}
