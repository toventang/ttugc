package com.p2082ss.android.ugc.aweme.common.net;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.common.net.d */
final /* synthetic */ class CallableC39149d implements Callable {

    /* renamed from: a */
    private final NetWorkStateReceiver f92364a;

    static {
        Covode.recordClassIndex(46772);
    }

    CallableC39149d(NetWorkStateReceiver netWorkStateReceiver) {
        this.f92364a = netWorkStateReceiver;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f92364a.mo67910a();
    }
}
