package com.p2082ss.android.ugc.aweme.account.network.p2275a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.AbstractC22354d;
import com.p2082ss.android.C29910g;
import com.p2082ss.android.C29912h;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.network.a.b */
public final class C32882b implements AbstractC22354d {
    static {
        Covode.recordClassIndex(39670);
    }

    @Override // com.bytedance.sdk.p1625a.AbstractC22354d
    /* renamed from: a */
    public final C29912h mo36702a(String str, Map<String, String> map, String str2, String str3, List<C29910g> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str3, "");
        return null;
    }

    @Override // com.bytedance.sdk.p1625a.AbstractC22354d
    /* renamed from: a */
    public final int mo36700a(Context context, Throwable th) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(th, "");
        return C31291a.m65464b().mo59923a(context, th);
    }

    @Override // com.bytedance.sdk.p1625a.AbstractC22354d
    /* renamed from: a */
    public final C29912h mo36701a(String str, List<C29910g> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        return NetworkProxyAccount.f78256b.mo58680a(Integer.MAX_VALUE, str, list);
    }

    @Override // com.bytedance.sdk.p1625a.AbstractC22354d
    /* renamed from: a */
    public final C29912h mo36703a(String str, Map<String, String> map, List<C29910g> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        C89219l.m154721d(list, "");
        return NetworkProxyAccount.f78256b.mo58681a(Integer.MAX_VALUE, str, map, list);
    }
}
