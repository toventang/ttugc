package com.p2082ss.android.ugc.aweme.feed.p2969u;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.feed.api.FeedStatsApi;
import com.p2082ss.android.ugc.aweme.feed.model.PrivateUrlModel;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.u.o */
public final class C49979o extends AbstractC39085b<PrivateUrlModel> {

    /* renamed from: a */
    public static final FeedStatsApi f115304a = ((FeedStatsApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(FeedStatsApi.class));

    static {
        Covode.recordClassIndex(59091);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2969u.C49979o.CallableC499801 */

            static {
                Covode.recordClassIndex(59092);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                FeedStatsApi feedStatsApi = C49979o.f115304a;
                Object[] objArr = objArr;
                return feedStatsApi.feedStats((String) objArr[0], ((Integer) objArr[1]).intValue()).get();
            }
        }, 0);
        return true;
    }
}
