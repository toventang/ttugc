package com.p2082ss.android.ugc.aweme.feed.p2969u;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;

/* renamed from: com.ss.android.ugc.aweme.feed.u.a */
public final class C49955a extends AbstractC39085b {
    static {
        Covode.recordClassIndex(59067);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof C49966c)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        this.mHandler.postDelayed(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2969u.C49955a.RunnableC499561 */

            static {
                Covode.recordClassIndex(59068);
            }

            public final void run() {
                C34608n.m70658a().mo61083a(C49955a.this.mHandler, new CallableC49965b(objArr), 0);
            }
        }, 500);
        return true;
    }
}
