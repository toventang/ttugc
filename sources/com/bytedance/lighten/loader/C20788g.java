package com.bytedance.lighten.loader;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20725b;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20730g;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20731h;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import com.facebook.imagepipeline.p1890o.AbstractC24635a;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1826c.p1827a.C24031j;

/* renamed from: com.bytedance.lighten.loader.g */
final class C20788g extends AbstractC24635a {

    /* renamed from: a */
    private AbstractC20731h f49193a;

    /* renamed from: b */
    private AbstractC20730g f49194b;

    static {
        Covode.recordClassIndex(24364);
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24635a, com.facebook.imagepipeline.p1890o.AbstractC24641d
    public final String getName() {
        return this.f49193a.mo34154a();
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24635a, com.facebook.imagepipeline.p1890o.AbstractC24641d
    public final AbstractC24026e getPostprocessorCacheKey() {
        return new C24031j(this.f49193a.mo34154a());
    }

    public C20788g(AbstractC20731h hVar) {
        this.f49193a = hVar;
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24635a, com.facebook.imagepipeline.p1890o.AbstractC24641d
    public final C24117a<Bitmap> process(Bitmap bitmap, final AbstractC24357f fVar) {
        if (this.f49194b == null) {
            this.f49194b = new AbstractC20730g() {
                /* class com.bytedance.lighten.loader.C20788g.C207891 */

                static {
                    Covode.recordClassIndex(24365);
                }

                @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20730g
                /* renamed from: a */
                public final AbstractC20725b mo34152a(int i, int i2, Bitmap.Config config) {
                    return new C20830y(fVar.mo40148a(i, i2, config));
                }
            };
        }
        C20830y yVar = (C20830y) this.f49193a.mo34153a(bitmap, this.f49194b);
        try {
            C24117a<Bitmap> b = C24117a.m45711b(yVar.f49260a);
            C24117a.m45712c(yVar.f49260a);
            return b;
        } catch (Throwable th) {
            if (yVar != null) {
                C24117a.m45712c(yVar.f49260a);
                throw th;
            }
            throw th;
        }
    }
}
