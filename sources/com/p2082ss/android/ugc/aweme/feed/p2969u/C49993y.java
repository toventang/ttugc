package com.p2082ss.android.ugc.aweme.feed.p2969u;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.feed.api.FeedActionApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.u.y */
public final class C49993y extends AbstractC39085b<String> {
    static {
        Covode.recordClassIndex(59105);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
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
            /* class com.p2082ss.android.ugc.aweme.feed.p2969u.C49993y.CallableC499941 */

            static {
                Covode.recordClassIndex(59106);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str = (String) objArr[0];
                FeedActionApi.f111983a.deleteItem(str).get();
                return str;
            }
        }, 0);
        return true;
    }
}
