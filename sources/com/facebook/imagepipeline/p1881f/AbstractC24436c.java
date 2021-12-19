package com.facebook.imagepipeline.p1881f;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.p1844d.AbstractC24156b;
import com.facebook.p1844d.AbstractC24157c;

/* renamed from: com.facebook.imagepipeline.f.c */
public abstract class AbstractC24436c extends AbstractC24156b<C24117a<AbstractC24454c>> {
    static {
        Covode.recordClassIndex(28579);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo30327a(C24117a<Bitmap> aVar);

    @Override // com.facebook.p1844d.AbstractC24156b
    public void onNewResultImpl(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
        if (cVar.mo39745b()) {
            C24117a<AbstractC24454c> d = cVar.mo39747d();
            C24117a<Bitmap> aVar = null;
            if (d != null && (d.mo39695a() instanceof C24455d)) {
                aVar = ((C24455d) d.mo39695a()).mo40299f();
            }
            try {
                mo30327a(aVar);
            } finally {
                C24117a.m45712c(aVar);
                C24117a.m45712c(d);
            }
        }
    }
}
