package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.graphics.Bitmap;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.common.C24361b;
import com.facebook.imagepipeline.common.C24364e;
import com.facebook.imagepipeline.p1878c.C24359g;
import com.facebook.imagepipeline.p1879d.C24370c;
import com.facebook.imagepipeline.p1879d.C24389j;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1885j.C24458g;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.p2082ss.android.medialib.jni.FrameThumb;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2730de.C40984s;
import com.p2082ss.android.ugc.aweme.shortvideo.util.AbstractC73999bo;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.VideoCoverCacheImpl */
public class VideoCoverCacheImpl implements AbstractC33974au, AbstractC73999bo {

    /* renamed from: b */
    int f165994b;

    /* renamed from: c */
    int f165995c;

    /* renamed from: d */
    String f165996d;

    /* renamed from: e */
    Executor f165997e = new ThreadPoolExecutor(0, 4, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardOldestPolicy());

    /* renamed from: f */
    FrameThumb f165998f;

    static {
        Covode.recordClassIndex(86680);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        FrameThumb frameThumb = this.f165998f;
        if (frameThumb != null) {
            frameThumb.unInitVideoToGraph();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Runnable mo116376b(final int i, final AbstractC73999bo.AbstractC74000a aVar) {
        return new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.util.VideoCoverCacheImpl.RunnableC739311 */

            static {
                Covode.recordClassIndex(86681);
            }

            public final void run() {
                MethodCollector.m26663i(3749);
                int[] frameThumbnail = VideoCoverCacheImpl.this.f165998f.getFrameThumbnail(i);
                if (frameThumbnail != null) {
                    C24117a<AbstractC24454c> a = C24117a.m45706a(new C24455d(Bitmap.createBitmap(frameThumbnail, VideoCoverCacheImpl.this.f165994b, VideoCoverCacheImpl.this.f165995c, Bitmap.Config.ARGB_8888), C24359g.m46366a(), C24458g.f58105a));
                    final C24117a<AbstractC24454c> b = a.clone();
                    C40984s.m82525a(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.util.VideoCoverCacheImpl.RunnableC739311.RunnableC739321 */

                        static {
                            Covode.recordClassIndex(86682);
                        }

                        public final void run() {
                            aVar.mo110114a(b);
                        }
                    });
                    C24428k.m46551a().mo40245c().mo40202a(C24389j.m46446a().mo40188a(C24636b.fromUri("file://".concat(String.valueOf(VideoCoverCacheImpl.this.f165996d + i))), null), a);
                }
                MethodCollector.m26664o(3749);
            }
        };
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.util.AbstractC73999bo
    /* renamed from: a */
    public void mo116375a(int i, AbstractC73999bo.AbstractC74000a aVar) {
        C24117a<AbstractC24454c> a = C24428k.m46551a().mo40245c().mo40201a(new C24370c("file://".concat(String.valueOf(this.f165996d + i)), null, C24364e.f57783b, C24361b.f57766a, null, null, null));
        if (a != null) {
            aVar.mo110114a(a.clone());
            C24117a.m45712c(a);
            return;
        }
        this.f165997e.execute(mo116376b(i, aVar));
    }

    public VideoCoverCacheImpl(AbstractC1204m mVar, FrameThumb frameThumb, String str, int i, int i2) {
        this.f165996d = str;
        this.f165994b = i;
        this.f165995c = i2;
        mVar.getLifecycle().mo4012a(this);
        this.f165998f = frameThumb;
    }
}
