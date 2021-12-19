package com.p2082ss.android.ugc.aweme.feed.p2969u;

import androidx.core.p036g.C0692e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.feed.u.aa */
public final class C49957aa extends AbstractC39085b<C0692e<String, Integer>> {

    /* renamed from: a */
    public int f115163a;

    static {
        Covode.recordClassIndex(59069);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1 || !(objArr[0] instanceof HashMap)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C34608n.m70658a().mo61083a(this.mHandler, new CallableC49958ab(this, objArr), 0);
        return true;
    }
}
