package com.facebook.imagepipeline.p1889n;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.C24455d;

/* renamed from: com.facebook.imagepipeline.n.i */
public final class C24592i implements AbstractC24544ak<C24117a<AbstractC24454c>> {

    /* renamed from: a */
    private final AbstractC24544ak<C24117a<AbstractC24454c>> f58429a;

    /* renamed from: b */
    private final int f58430b;

    /* renamed from: c */
    private final int f58431c;

    /* renamed from: d */
    private final boolean f58432d;

    static {
        Covode.recordClassIndex(28736);
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(AbstractC24596k<C24117a<AbstractC24454c>> kVar, AbstractC24545al alVar) {
        if (!alVar.mo40419f() || this.f58432d) {
            this.f58429a.mo40379a(new C24593a(kVar, this.f58430b, this.f58431c), alVar);
        } else {
            this.f58429a.mo40379a(kVar, alVar);
        }
    }

    /* renamed from: com.facebook.imagepipeline.n.i$a */
    static class C24593a extends AbstractC24604n<C24117a<AbstractC24454c>, C24117a<AbstractC24454c>> {

        /* renamed from: a */
        private final int f58433a;

        /* renamed from: b */
        private final int f58434b;

        static {
            Covode.recordClassIndex(28737);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final /* synthetic */ void mo40278a(Object obj, int i) {
            AbstractC24454c cVar;
            Bitmap bitmap;
            int rowBytes;
            C24117a aVar = (C24117a) obj;
            if (aVar != null && aVar.mo39700d() && (cVar = (AbstractC24454c) aVar.mo39695a()) != null && !cVar.mo40289a() && (cVar instanceof C24455d) && (bitmap = ((C24455d) cVar).f58089a) != null && (rowBytes = bitmap.getRowBytes() * bitmap.getHeight()) >= this.f58433a && rowBytes <= this.f58434b) {
                bitmap.prepareToDraw();
            }
            this.f58467e.mo40434b(aVar, i);
        }

        C24593a(AbstractC24596k<C24117a<AbstractC24454c>> kVar, int i, int i2) {
            super(kVar);
            this.f58433a = i;
            this.f58434b = i2;
        }
    }

    public C24592i(AbstractC24544ak<C24117a<AbstractC24454c>> akVar, int i, int i2, boolean z) {
        boolean z2;
        if (i <= i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C24091i.m45620a(z2);
        this.f58429a = (AbstractC24544ak) C24091i.m45617a(akVar);
        this.f58430b = i;
        this.f58431c = i2;
        this.f58432d = z;
    }
}
