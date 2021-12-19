package com.bytedance.android.livesdk.p456as;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p215e.C3880a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.bytedance.android.livesdk.as.g */
public class C6873g<T> implements AbstractC88406ae<T>, AbstractC88986z<T> {
    static {
        Covode.recordClassIndex(7611);
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public void onComplete() {
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public void onNext(T t) {
    }

    @Override // p4560f.p4561a.AbstractC88986z, p4560f.p4561a.AbstractC88406ae
    public void onSubscribe(AbstractC88412b bVar) {
    }

    @Override // p4560f.p4561a.AbstractC88406ae
    public void onSuccess(T t) {
    }

    @Override // p4560f.p4561a.AbstractC88986z, p4560f.p4561a.AbstractC88406ae
    public void onError(Throwable th) {
        C3854a.m9458a("LiveEmptyObserver", th);
        if (th instanceof C3880a) {
            C3854a.m9453a(6, "LiveEmptyObserver", "ApiServerException thrown, url: " + ((C3880a) th).getUrl());
        }
    }
}
