package com.facebook.imagepipeline.p1881f;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1885j.AbstractC24453b;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.p1844d.AbstractC24156b;
import com.facebook.p1844d.AbstractC24157c;

/* renamed from: com.facebook.imagepipeline.f.b */
public abstract class AbstractC24435b extends AbstractC24156b<C24117a<AbstractC24454c>> {
    static {
        Covode.recordClassIndex(28578);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9033a(Bitmap bitmap);

    @Override // com.facebook.p1844d.AbstractC24156b
    public void onNewResultImpl(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
        if (cVar.mo39745b()) {
            C24117a<AbstractC24454c> d = cVar.mo39747d();
            Bitmap bitmap = null;
            if (d != null && (d.mo39695a() instanceof AbstractC24453b)) {
                bitmap = ((AbstractC24453b) d.mo39695a()).mo40296d();
            }
            try {
                mo9033a(bitmap);
            } finally {
                C24117a.m45712c(d);
            }
        }
    }
}
