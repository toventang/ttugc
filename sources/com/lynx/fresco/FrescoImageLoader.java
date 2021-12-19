package com.lynx.fresco;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.view.C24261b;
import com.facebook.fresco.animation.p1862a.AbstractC24270a;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1890o.AbstractC24635a;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.lynx.p2031a.AbstractC28184c;
import com.lynx.p2031a.AbstractC28189d;
import com.lynx.p2031a.C28182b;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.p2062ui.image.p2064b.C28884b;
import com.lynx.tasm.utils.C28929m;

public class FrescoImageLoader extends AbstractC28189d {
    public C24290a mAnimatedDrawable2;
    public C28340a mCallback;
    public C24117a<Bitmap> mCloseableReference;
    public Bitmap mCurrent;
    public volatile Uri mCurrentUri;
    public C24261b mDraweeHolder;

    static {
        Covode.recordClassIndex(34297);
    }

    @Override // com.lynx.p2031a.AbstractC28189d
    public Bitmap getCurrent() {
        return this.mCurrent;
    }

    @Override // com.lynx.p2031a.AbstractC28189d
    public void onRelease() {
        releasePre();
    }

    @Override // com.lynx.p2031a.AbstractC28189d
    public void onPause() {
        C24290a aVar = this.mAnimatedDrawable2;
        if (aVar != null) {
            aVar.stop();
        }
    }

    @Override // com.lynx.p2031a.AbstractC28189d
    public void onResume() {
        C24290a aVar = this.mAnimatedDrawable2;
        if (aVar != null) {
            aVar.start();
        }
    }

    @Override // com.lynx.p2031a.AbstractC28189d
    public void onDestroy() {
        releasePre();
        C24261b bVar = this.mDraweeHolder;
        if (bVar != null && bVar.f57518a) {
            this.mDraweeHolder.mo40005c();
            this.mDraweeHolder = null;
        }
    }

    public void releasePre() {
        this.mCurrent = null;
        C24290a aVar = this.mAnimatedDrawable2;
        if (aVar != null) {
            aVar.stop();
            this.mAnimatedDrawable2.setCallback(null);
            this.mAnimatedDrawable2 = null;
        }
        C24117a<Bitmap> aVar2 = this.mCloseableReference;
        if (aVar2 != null) {
            aVar2.close();
            this.mCloseableReference = null;
        }
        this.mCallback = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.fresco.FrescoImageLoader$a */
    public class C28340a implements Drawable.Callback {

        /* renamed from: a */
        public final Uri f66554a;

        /* renamed from: b */
        public final AbstractC28184c f66555b;

        /* renamed from: c */
        public final C28182b f66556c;

        /* renamed from: d */
        public boolean f66557d = true;

        /* renamed from: f */
        private final Handler f66559f = new Handler(Looper.getMainLooper());

        static {
            Covode.recordClassIndex(34302);
        }

        public void invalidateDrawable(Drawable drawable) {
            drawable.draw(new Canvas() {
                /* class com.lynx.fresco.FrescoImageLoader.C28340a.C283411 */

                static {
                    Covode.recordClassIndex(34303);
                }

                @Override // android.graphics.Canvas
                public final void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
                    FrescoImageLoader.this.updateBitmap(C28340a.this.f66557d, bitmap, C28340a.this.f66554a, C28340a.this.f66556c, C28340a.this.f66555b);
                    C28340a.this.f66557d = false;
                }

                @Override // android.graphics.Canvas
                public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
                    FrescoImageLoader.this.updateBitmap(C28340a.this.f66557d, bitmap, C28340a.this.f66554a, C28340a.this.f66556c, C28340a.this.f66555b);
                    C28340a.this.f66557d = false;
                }
            });
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            this.f66559f.removeCallbacks(runnable, drawable);
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            this.f66559f.postAtTime(runnable, drawable, j);
        }

        public C28340a(Uri uri, AbstractC28184c cVar, C28182b bVar) {
            this.f66554a = uri;
            this.f66555b = cVar;
            this.f66556c = bVar;
        }
    }

    public static boolean isSameUrl(Uri uri, Uri uri2) {
        if (uri == uri2) {
            return true;
        }
        if (uri == null || !uri.equals(uri2)) {
            return false;
        }
        return true;
    }

    public static C24117a<Bitmap> getTargetReference(Bitmap bitmap, C28182b bVar) {
        int intValue;
        int intValue2;
        if (bVar == null) {
            intValue = bitmap.getWidth();
            intValue2 = bitmap.getHeight();
        } else {
            Pair<Integer, Integer> targetSize = getTargetSize(bVar.f65963a, bVar.f65964b, bitmap.getWidth(), bitmap.getHeight());
            intValue = ((Integer) targetSize.first).intValue();
            intValue2 = ((Integer) targetSize.second).intValue();
            if (!bVar.f65965c && bitmap.getWidth() * bitmap.getHeight() < intValue * intValue2) {
                intValue = bitmap.getWidth();
                intValue2 = bitmap.getHeight();
            }
        }
        C24117a<Bitmap> b = C24428k.m46551a().mo40248f().mo40152b(intValue, intValue2, bitmap.getConfig());
        Bitmap a = b.mo39695a();
        new Canvas(a).drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, a.getWidth(), a.getHeight()), (Paint) null);
        return b;
    }

    public void load(final Uri uri, final C28182b bVar, final AbstractC28184c cVar) {
        int i;
        C24363d dVar;
        Bitmap.Config config;
        int i2 = Integer.MAX_VALUE;
        if (bVar == null || (bVar.f65963a == -1 && bVar.f65964b == -1)) {
            i = Integer.MAX_VALUE;
        } else if (bVar.f65963a == -1) {
            i = bVar.f65964b;
            i2 = 1;
        } else {
            i2 = bVar.f65963a;
            i = 1;
        }
        C24639c a = C24639c.m47149a(uri).mo40486a(true);
        if (i2 <= 0 || i <= 0) {
            dVar = null;
        } else {
            dVar = new C24363d(i2, i);
        }
        a.f58553d = dVar;
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        if (bVar == null) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = bVar.f65967e;
        }
        a.f58555f = imageDecodeOptionsBuilder.setBitmapConfig(config).mo40154a();
        a.f58560k = new AbstractC24635a() {
            /* class com.lynx.fresco.FrescoImageLoader.C283372 */

            static {
                Covode.recordClassIndex(34299);
            }

            @Override // com.facebook.imagepipeline.p1890o.AbstractC24635a, com.facebook.imagepipeline.p1890o.AbstractC24641d
            public final C24117a<Bitmap> process(Bitmap bitmap, AbstractC24357f fVar) {
                if (FrescoImageLoader.isSameUrl(uri, FrescoImageLoader.this.mCurrentUri)) {
                    return FrescoImageLoader.getTargetReference(bitmap, bVar);
                }
                return null;
            }
        };
        C24185e b = C24182c.m45843b();
        b.f57299c = (REQUEST) a.mo40483a();
        b.f57303g = new C24202c() {
            /* class com.lynx.fresco.FrescoImageLoader.C283383 */

            static {
                Covode.recordClassIndex(34300);
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final void onFailure(String str, Throwable th) {
                super.onFailure(str, th);
                if (FrescoImageLoader.isSameUrl(uri, FrescoImageLoader.this.mCurrentUri)) {
                    FrescoImageLoader.this.releasePre();
                    AbstractC28184c cVar = cVar;
                    if (cVar != null) {
                        cVar.mo48201a(uri, th);
                    }
                }
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
                super.onFinalImageSet(str, obj, animatable);
                if (FrescoImageLoader.isSameUrl(uri, FrescoImageLoader.this.mCurrentUri)) {
                    FrescoImageLoader.this.releasePre();
                    if (cVar != null) {
                        if (obj instanceof C24455d) {
                            FrescoImageLoader.this.mCloseableReference = ((C24455d) obj).mo40299f();
                            FrescoImageLoader frescoImageLoader = FrescoImageLoader.this;
                            frescoImageLoader.mCurrent = frescoImageLoader.mCloseableReference.mo39695a();
                            cVar.mo48200a(uri, FrescoImageLoader.this.mCurrent);
                        } else if (animatable instanceof C24290a) {
                            FrescoImageLoader.this.mCallback = new C28340a(uri, cVar, bVar);
                            FrescoImageLoader.this.mAnimatedDrawable2 = (C24290a) animatable;
                            int i = 0;
                            FrescoImageLoader.this.mAnimatedDrawable2.setBounds(0, 0, FrescoImageLoader.this.mAnimatedDrawable2.getIntrinsicWidth(), FrescoImageLoader.this.mAnimatedDrawable2.getIntrinsicHeight());
                            C24290a aVar = FrescoImageLoader.this.mAnimatedDrawable2;
                            AbstractC24270a aVar2 = FrescoImageLoader.this.mAnimatedDrawable2.f57588d;
                            C28182b bVar = bVar;
                            if (bVar != null) {
                                i = bVar.f65966d;
                            }
                            aVar.mo40069a(new C28345b(aVar2, i));
                            FrescoImageLoader.this.mAnimatedDrawable2.setCallback(FrescoImageLoader.this.mCallback);
                            C28884b.m57862a(FrescoImageLoader.this.mAnimatedDrawable2);
                            FrescoImageLoader.this.mAnimatedDrawable2.start();
                        }
                    }
                }
            }
        };
        final C24261b a2 = C24261b.m46095a(new C24247b(LynxEnv.m56706b().f66634a.getResources()).mo39973a());
        a2.mo40001a(b.mo39827e());
        RunnableC283394 r1 = new Runnable() {
            /* class com.lynx.fresco.FrescoImageLoader.RunnableC283394 */

            static {
                Covode.recordClassIndex(34301);
            }

            public final void run() {
                FrescoImageLoader.this.mDraweeHolder = a2;
                a2.mo40003b();
            }
        };
        if (C28929m.m57950a()) {
            r1.run();
        } else {
            C28929m.m57947a(r1);
        }
    }

    @Override // com.lynx.p2031a.AbstractC28189d
    public void onLoad(AbstractC28520j jVar, final Uri uri, final C28182b bVar, final AbstractC28184c cVar) {
        C24261b bVar2 = this.mDraweeHolder;
        if (bVar2 != null && bVar2.f57518a) {
            this.mDraweeHolder.mo40005c();
            this.mDraweeHolder = null;
        }
        this.mCurrentUri = uri;
        C28342a.m56646a().execute(new Runnable() {
            /* class com.lynx.fresco.FrescoImageLoader.RunnableC283361 */

            static {
                Covode.recordClassIndex(34298);
            }

            public final void run() {
                FrescoImageLoader.this.load(uri, bVar, cVar);
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getTargetSize(int r4, int r5, int r6, int r7) {
        /*
            r0 = -1
            if (r4 != r0) goto L_0x0015
            if (r5 != r0) goto L_0x0017
            r4 = r6
        L_0x0006:
            r5 = r7
        L_0x0007:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.<init>(r1, r0)
            return r2
        L_0x0015:
            if (r4 != r0) goto L_0x002f
        L_0x0017:
            if (r5 != r7) goto L_0x001b
            r4 = r6
            goto L_0x0007
        L_0x001b:
            double r2 = (double) r5
            double r0 = (double) r7
            java.lang.Double.isNaN(r2)
            java.lang.Double.isNaN(r0)
            double r2 = r2 / r0
            double r0 = (double) r6
            java.lang.Double.isNaN(r0)
            double r2 = r2 * r0
            double r0 = java.lang.Math.ceil(r2)
            int r4 = (int) r0
            goto L_0x0007
        L_0x002f:
            if (r4 != r6) goto L_0x0032
            goto L_0x0006
        L_0x0032:
            double r2 = (double) r4
            double r0 = (double) r6
            java.lang.Double.isNaN(r2)
            java.lang.Double.isNaN(r0)
            double r2 = r2 / r0
            double r0 = (double) r7
            java.lang.Double.isNaN(r0)
            double r2 = r2 * r0
            double r0 = java.lang.Math.ceil(r2)
            int r5 = (int) r0
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.fresco.FrescoImageLoader.getTargetSize(int, int, int, int):android.util.Pair");
    }

    public void updateBitmap(boolean z, Bitmap bitmap, Uri uri, C28182b bVar, AbstractC28184c cVar) {
        C24117a<Bitmap> aVar = this.mCloseableReference;
        if (aVar != null) {
            aVar.close();
            this.mCloseableReference = null;
        }
        try {
            C24117a<Bitmap> targetReference = getTargetReference(bitmap, bVar);
            this.mCloseableReference = targetReference;
            Bitmap a = targetReference.mo39695a();
            this.mCurrent = a;
            if (cVar == null) {
                return;
            }
            if (z) {
                cVar.mo48200a(uri, a);
            } else {
                cVar.mo48204b(uri, a);
            }
        } catch (Exception e) {
            if (cVar == null) {
                return;
            }
            if (z) {
                cVar.mo48201a(uri, e);
            } else {
                cVar.mo48205b(uri, e);
            }
        }
    }
}
