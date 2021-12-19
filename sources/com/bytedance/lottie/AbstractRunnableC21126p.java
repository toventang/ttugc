package com.bytedance.lottie;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lottie.p */
public abstract class AbstractRunnableC21126p implements Runnable {

    /* renamed from: c */
    public final WeakReference<AbstractC21037d> f50112c;

    /* renamed from: d */
    public final WeakReference<AbstractC20932a> f50113d;

    /* renamed from: e */
    public final WeakReference<Context> f50114e;

    static {
        Covode.recordClassIndex(24742);
    }

    public AbstractRunnableC21126p(AbstractC21037d dVar, AbstractC20932a aVar, Context context) {
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(aVar, "");
        this.f50112c = new WeakReference<>(dVar);
        this.f50113d = new WeakReference<>(aVar);
        this.f50114e = new WeakReference<>(context);
    }
}
