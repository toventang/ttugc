package com.p2082ss.android.ugc.aweme.shortvideo.cover;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.AbstractC69978a;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.vesdk.VEListener;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.t */
final /* synthetic */ class C70001t implements VEListener.AbstractC85254w {

    /* renamed from: a */
    private final VEVideoCoverGeneratorImpl f156461a;

    /* renamed from: b */
    private final AbstractC69978a.AbstractC69979a f156462b;

    /* renamed from: c */
    private final AtomicInteger f156463c;

    /* renamed from: d */
    private final long f156464d;

    static {
        Covode.recordClassIndex(82415);
    }

    C70001t(VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl, AbstractC69978a.AbstractC69979a aVar, AtomicInteger atomicInteger, long j) {
        this.f156461a = vEVideoCoverGeneratorImpl;
        this.f156462b = aVar;
        this.f156463c = atomicInteger;
        this.f156464d = j;
    }

    @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85254w
    /* renamed from: a */
    public final int mo110443a(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(11773);
        VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.f156461a;
        AbstractC69978a.AbstractC69979a aVar = this.f156462b;
        AtomicInteger atomicInteger = this.f156463c;
        long j = this.f156464d;
        if (bArr != null) {
            C84401c.f188722f.mo123660b("VEVideoCoverGeneratorImpl: generateBitmaps onGetImageData，bytes: " + bArr.length);
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
            C1731i.m5640b(new CallableC70002u(vEVideoCoverGeneratorImpl, aVar, atomicInteger, createBitmap, j), C1731i.f5564c);
        } else {
            C84401c.f188722f.mo123660b("VEVideoCoverGeneratorImpl: generateBitmaps onGetImageData end，bytes: null");
            vEVideoCoverGeneratorImpl.f156396d.mo56395z();
            if (atomicInteger.get() != vEVideoCoverGeneratorImpl.f156394b) {
                C84401c.f188722f.mo123660b("VEVideoCoverGeneratorImpl:cover size not correct，want" + vEVideoCoverGeneratorImpl.f156394b + "，actually" + atomicInteger.get());
            }
        }
        MethodCollector.m26664o(11773);
        return 0;
    }
}
