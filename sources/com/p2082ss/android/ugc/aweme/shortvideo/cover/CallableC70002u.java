package com.p2082ss.android.ugc.aweme.shortvideo.cover;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.AbstractC69978a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.u */
final /* synthetic */ class CallableC70002u implements Callable {

    /* renamed from: a */
    private final VEVideoCoverGeneratorImpl f156465a;

    /* renamed from: b */
    private final AbstractC69978a.AbstractC69979a f156466b;

    /* renamed from: c */
    private final AtomicInteger f156467c;

    /* renamed from: d */
    private final Bitmap f156468d;

    /* renamed from: e */
    private final long f156469e;

    static {
        Covode.recordClassIndex(82416);
    }

    CallableC70002u(VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl, AbstractC69978a.AbstractC69979a aVar, AtomicInteger atomicInteger, Bitmap bitmap, long j) {
        this.f156465a = vEVideoCoverGeneratorImpl;
        this.f156466b = aVar;
        this.f156467c = atomicInteger;
        this.f156468d = bitmap;
        this.f156469e = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.f156465a;
        AbstractC69978a.AbstractC69979a aVar = this.f156466b;
        AtomicInteger atomicInteger = this.f156467c;
        Bitmap bitmap = this.f156468d;
        long j = this.f156469e;
        aVar.mo110426a(atomicInteger.get(), bitmap);
        atomicInteger.incrementAndGet();
        vEVideoCoverGeneratorImpl.f156397e.add(Long.valueOf(System.currentTimeMillis() - j));
        return null;
    }
}
