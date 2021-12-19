package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.graphics.Bitmap;
import android.util.SparseArray;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1878c.C24359g;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1885j.C24458g;
import com.p2082ss.android.medialib.jni.FrameThumb;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2730de.C40984s;
import com.p2082ss.android.ugc.aweme.shortvideo.util.AbstractC73999bo;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.DefaultVideoCover */
public class DefaultVideoCover extends VideoCoverCacheImpl implements AbstractC33974au {

    /* renamed from: a */
    public SparseArray<C24117a<AbstractC24454c>> f165986a = new SparseArray<>();

    static {
        Covode.recordClassIndex(86675);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.shortvideo.util.VideoCoverCacheImpl
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.util.VideoCoverCacheImpl
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.f165998f.unInitVideoToGraph();
        for (int i = 0; i < this.f165986a.size(); i++) {
            C24117a.m45712c(this.f165986a.valueAt(i));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.util.VideoCoverCacheImpl
    /* renamed from: b */
    public final Runnable mo116376b(final int i, final AbstractC73999bo.AbstractC74000a aVar) {
        return new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.util.DefaultVideoCover.RunnableC739281 */

            static {
                Covode.recordClassIndex(86676);
            }

            public final void run() {
                MethodCollector.m26663i(5147);
                int[] frameThumbnail = DefaultVideoCover.this.f165998f.getFrameThumbnail(i);
                if (frameThumbnail != null) {
                    C24117a<AbstractC24454c> a = C24117a.m45706a(new C24455d(Bitmap.createBitmap(frameThumbnail, DefaultVideoCover.this.f165994b, DefaultVideoCover.this.f165995c, Bitmap.Config.ARGB_8888), C24359g.m46366a(), C24458g.f58105a));
                    final C24117a<AbstractC24454c> b = a.clone();
                    C40984s.m82525a(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.util.DefaultVideoCover.RunnableC739281.RunnableC739291 */

                        static {
                            Covode.recordClassIndex(86677);
                        }

                        public final void run() {
                            aVar.mo110114a(b);
                        }
                    });
                    DefaultVideoCover.this.f165986a.put(i, a);
                }
                MethodCollector.m26664o(5147);
            }
        };
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.util.VideoCoverCacheImpl, com.p2082ss.android.ugc.aweme.shortvideo.util.AbstractC73999bo
    /* renamed from: a */
    public final void mo116375a(int i, AbstractC73999bo.AbstractC74000a aVar) {
        super.mo116375a(i, aVar);
        C24117a<AbstractC24454c> aVar2 = this.f165986a.get(i);
        if (aVar2 == null || !aVar2.mo39700d()) {
            this.f165997e.execute(mo116376b(i, aVar));
            return;
        }
        aVar.mo110114a(aVar2.clone());
        C24117a.m45712c(aVar2);
    }

    public DefaultVideoCover(AbstractC1204m mVar, FrameThumb frameThumb, String str, int i, int i2) {
        super(mVar, frameThumb, str, i, i2);
    }
}
