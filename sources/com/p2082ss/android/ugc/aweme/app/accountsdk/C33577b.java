package com.p2082ss.android.ugc.aweme.app.accountsdk;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p983b.C14620c;
import com.google.gson.C27910f;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.ugc.aweme.AbstractC34907bq;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.accountsdk.b */
public final class C33577b implements AbstractC34907bq {
    static {
        Covode.recordClassIndex(40467);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34907bq
    /* renamed from: a */
    public final C27910f mo59924a() {
        C27910f b = GsonHolder.m138943c().mo123620b();
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34907bq
    /* renamed from: a */
    public final int mo59923a(Context context, Throwable th) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(th, "");
        if (!(th instanceof C14620c)) {
            return 0;
        }
        if (((C14620c) th).getStatusCode() == 503) {
            return -19;
        }
        return -16;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34907bq
    /* renamed from: a */
    public final <T> T mo59925a(String str, int i, String str2, Class<T> cls, String str3, List<? extends C29934d> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(cls, "");
        C89219l.m154721d(str3, "");
        return list != null ? (T) Api.m68813a(str, i, str2, (Class) cls, str3, (List<C29934d>) list) : (T) Api.m68812a(str, i, str2, cls, str3);
    }
}
