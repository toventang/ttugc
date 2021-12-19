package com.p2082ss.android.ugc.aweme.app.p2329g;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.app.g.b */
public final class HandlerThreadC33754b extends HandlerThread {

    /* renamed from: a */
    public Handler f79958a;

    /* renamed from: b */
    private Handler.Callback f79959b;

    static {
        Covode.recordClassIndex(40649);
    }

    /* access modifiers changed from: protected */
    public final void onLooperPrepared() {
        this.f79958a = new Handler(getLooper(), this.f79959b);
    }
}
