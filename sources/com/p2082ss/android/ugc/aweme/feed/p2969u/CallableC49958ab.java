package com.p2082ss.android.ugc.aweme.feed.p2969u;

import androidx.core.p036g.C0692e;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.feed.api.FeedActionApi;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.u.ab */
final /* synthetic */ class CallableC49958ab implements Callable {

    /* renamed from: a */
    private final C49957aa f115164a;

    /* renamed from: b */
    private final Object[] f115165b;

    static {
        Covode.recordClassIndex(59070);
    }

    CallableC49958ab(C49957aa aaVar, Object[] objArr) {
        this.f115164a = aaVar;
        this.f115165b = objArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C49957aa aaVar = this.f115164a;
        HashMap hashMap = (HashMap) this.f115165b[0];
        aaVar.f115163a = Integer.parseInt((String) hashMap.get(StringSet.type));
        FeedActionApi.f111983a.diggItem(hashMap).get();
        return C0692e.m2449a(hashMap.get("aweme_id"), Integer.valueOf(Integer.parseInt((String) hashMap.get(StringSet.type))));
    }
}
