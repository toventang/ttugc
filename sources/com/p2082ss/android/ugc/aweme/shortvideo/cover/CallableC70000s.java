package com.p2082ss.android.ugc.aweme.shortvideo.cover;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.AbstractC69978a;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.vesdk.C85581w;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.s */
final /* synthetic */ class CallableC70000s implements Callable {

    /* renamed from: a */
    private final VEVideoCoverGeneratorImpl f156454a;

    /* renamed from: b */
    private final int[] f156455b;

    /* renamed from: c */
    private final int f156456c;

    /* renamed from: d */
    private final int f156457d;

    /* renamed from: e */
    private final AbstractC69978a.AbstractC69979a f156458e;

    /* renamed from: f */
    private final AtomicInteger f156459f;

    /* renamed from: g */
    private final long f156460g;

    static {
        Covode.recordClassIndex(82414);
    }

    CallableC70000s(VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl, int[] iArr, int i, int i2, AbstractC69978a.AbstractC69979a aVar, AtomicInteger atomicInteger, long j) {
        this.f156454a = vEVideoCoverGeneratorImpl;
        this.f156455b = iArr;
        this.f156456c = i;
        this.f156457d = i2;
        this.f156458e = aVar;
        this.f156459f = atomicInteger;
        this.f156460g = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C85581w.EnumC85602a aVar;
        VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.f156454a;
        int[] iArr = this.f156455b;
        int i = this.f156456c;
        int i2 = this.f156457d;
        AbstractC69978a.AbstractC69979a aVar2 = this.f156458e;
        AtomicInteger atomicInteger = this.f156459f;
        long j = this.f156460g;
        for (int i3 : iArr) {
            C84401c.f188722f.mo123660b("VEVideoCoverGeneratorImpl: generateBitmaps begin，timeStamps: ".concat(String.valueOf(i3)));
        }
        C84401c.f188722f.mo123660b("VEVideoCoverGeneratorImpl: generateBitmaps begin，duration: " + vEVideoCoverGeneratorImpl.f156396d.mo56368j());
        AbstractC31071f fVar = vEVideoCoverGeneratorImpl.f156396d;
        if (vEVideoCoverGeneratorImpl.f156398f == null) {
            aVar = C85581w.EnumC85602a.GET_FRAMES_MODE_NOEFFECT;
        } else {
            aVar = vEVideoCoverGeneratorImpl.f156398f;
        }
        fVar.mo56294a(iArr, i, i2, aVar, new C70001t(vEVideoCoverGeneratorImpl, aVar2, atomicInteger, j));
        return null;
    }
}
