package com.p2082ss.android.ugc.aweme.share.p3749g.p3750a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.share.g.a.a */
public final class C68928a extends AbstractC39085b<String> {
    static {
        Covode.recordClassIndex(81237);
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
            /* class com.p2082ss.android.ugc.aweme.share.p3749g.p3750a.C68928a.CallableC689291 */

            static {
                Covode.recordClassIndex(81238);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ShareDependService a = ShareDependService.C68822a.m121324a();
                Object[] objArr = objArr;
                return a.mo109327a((Aweme) objArr[0], ((Integer) objArr[1]).intValue());
            }
        }, 0);
        return true;
    }
}
