package com.p2082ss.android.ugc.aweme.detail.p2750i;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.detail.api.DetailApi;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.detail.i.i */
public final class C41235i extends AbstractC39085b<Aweme> {
    static {
        Covode.recordClassIndex(49118);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean sendRequest(Object... objArr) {
        final String str;
        final int i;
        if (!super.sendRequest(objArr)) {
            return false;
        }
        final String str2 = (String) objArr[0];
        if (objArr.length <= 1 || objArr[1] == null) {
            str = "";
        } else {
            str = (String) objArr[1];
        }
        if (objArr.length <= 2 || objArr[2] == null) {
            i = 0;
        } else {
            i = ((Integer) objArr[2]).intValue();
        }
        C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.detail.p2750i.C41235i.CallableC412361 */

            static {
                Covode.recordClassIndex(49119);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DetailApi.m82809a(str2, str, i);
            }
        }, 0);
        return true;
    }
}
