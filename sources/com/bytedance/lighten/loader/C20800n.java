package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20732i;
import com.facebook.imagepipeline.p1889n.AbstractC24529ag;
import java.io.InputStream;

/* renamed from: com.bytedance.lighten.loader.n */
final class C20800n implements AbstractC20732i {

    /* renamed from: a */
    private AbstractC24529ag.AbstractC24530a f49204a;

    static {
        Covode.recordClassIndex(24376);
    }

    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20732i
    /* renamed from: a */
    public final void mo34155a() {
        this.f49204a.mo40400a();
    }

    public C20800n(AbstractC24529ag.AbstractC24530a aVar) {
        this.f49204a = aVar;
    }

    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20732i
    /* renamed from: a */
    public final void mo34157a(Throwable th) {
        this.f49204a.mo40402a(th);
    }

    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20732i
    /* renamed from: a */
    public final void mo34156a(InputStream inputStream, int i) {
        this.f49204a.mo40401a(inputStream, i);
    }
}
