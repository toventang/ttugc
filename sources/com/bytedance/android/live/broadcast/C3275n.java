package com.bytedance.android.live.broadcast;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.utils.EarlyAVLog;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.n */
public final /* synthetic */ class C3275n implements EarlyAVLog.IEarlyLogPrint {

    /* renamed from: a */
    static final EarlyAVLog.IEarlyLogPrint f9389a = new C3275n();

    static {
        Covode.recordClassIndex(3757);
    }

    private C3275n() {
    }

    @Override // com.p2082ss.avframework.utils.EarlyAVLog.IEarlyLogPrint
    public final void print(int i, String str, String str2, Throwable th) {
        C3854a.m9460b("LiveBroadcastContext", "code:" + i + " var2:" + str + " var3:" + str2, th);
    }
}
