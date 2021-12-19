package com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2842a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1836h.C24117a;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.imagepipeline.common.EnumC24362c;
import com.facebook.imagepipeline.p1880e.C24413h;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.facebook.p1844d.AbstractC24157c;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2842a.AbstractC44487c;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44529c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.a.a */
public final class C44484a implements AbstractC44487c {
    static {
        Covode.recordClassIndex(52832);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2842a.AbstractC44487c
    /* renamed from: a */
    public final void mo75483a(AbstractC44487c.AbstractC44489b bVar) {
        C34577e.m70589a(new UrlModel(), 0, 0, new C44486b(this, bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2842a.AbstractC44487c
    /* renamed from: b */
    public final boolean mo75485b(String str) {
        return C34577e.m70603a(Uri.parse(str));
    }

    /* renamed from: a */
    public static Bitmap m87169a(Bitmap bitmap) {
        MethodCollector.m26663i(8217);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = (float) width;
        if (f > 2000.0f) {
            float f2 = (float) height;
            if (f2 > 2000.0f) {
                float max = Math.max(f / 2000.0f, f2 / 2000.0f);
                Matrix matrix = new Matrix();
                float f3 = 1.0f / max;
                matrix.setScale(f3, f3);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                MethodCollector.m26664o(8217);
                return createBitmap;
            }
        }
        MethodCollector.m26664o(8217);
        return bitmap;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2842a.AbstractC44487c
    /* renamed from: a */
    public final Drawable mo75482a(String str) {
        MethodCollector.m26663i(8215);
        String a = C34577e.m70588a(str);
        if (!C13627m.m24498a(a)) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(a, options);
                if (((float) options.outWidth) <= 2000.0f || ((float) options.outHeight) <= 2000.0f) {
                    Drawable createFromPath = BitmapDrawable.createFromPath(a);
                    MethodCollector.m26664o(8215);
                    return createFromPath;
                }
                options.inSampleSize = m87168a(options.outWidth, options.outHeight);
                options.inJustDecodeBounds = false;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeFile(a, options));
                MethodCollector.m26664o(8215);
                return bitmapDrawable;
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        MethodCollector.m26664o(8215);
        return null;
    }

    /* renamed from: a */
    private static int m87168a(int i, int i2) {
        float min = Math.min(((float) i) / 2000.0f, ((float) i2) / 2000.0f);
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (f2 > min) {
                return (int) f;
            }
            f = f2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2842a.AbstractC44487c
    /* renamed from: a */
    public final void mo75484a(String str, final ImageView imageView, final Drawable drawable, final AbstractC44487c.AbstractC44488a aVar) {
        C24413h e = C24428k.m46551a().mo40247e();
        C24639c a = C24639c.m47149a(Uri.parse(str));
        a.f58559j = EnumC24362c.HIGH;
        REQUEST request = (REQUEST) a.mo40483a();
        final AbstractC24157c<C24117a<AbstractC24454c>> a2 = e.mo40224a(request, (Object) null);
        C24185e b = C24182c.m45843b();
        b.f57299c = request;
        C44529c cVar = (C44529c) imageView;
        b.f57309m = cVar.getController();
        b.f57303g = new C24202c<AbstractC24457f>() {
            /* class com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2842a.C44484a.C444851 */

            static {
                Covode.recordClassIndex(52833);
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final void onSubmit(String str, Object obj) {
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final void onFailure(String str, Throwable th) {
                Drawable drawable = drawable;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                }
                AbstractC44487c.AbstractC44488a aVar = aVar;
                if (aVar != null) {
                    aVar.mo75486a(0);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
                C24117a aVar;
                Throwable th;
                Bitmap bitmap;
                try {
                    aVar = (C24117a) a2.mo39747d();
                    if (aVar != null) {
                        try {
                            AbstractC24454c cVar = (AbstractC24454c) aVar.mo39695a();
                            if ((cVar instanceof C24455d) && (bitmap = ((C24455d) cVar).f58089a) != null) {
                                imageView.setImageBitmap(C44484a.m87169a(bitmap));
                                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            a2.mo39750g();
                            C24117a.m45712c(aVar);
                            throw th;
                        }
                    }
                    a2.mo39750g();
                    C24117a.m45712c(aVar);
                    AbstractC44487c.AbstractC44488a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.mo75486a(1);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    aVar = null;
                    a2.mo39750g();
                    C24117a.m45712c(aVar);
                    throw th;
                }
            }
        };
        cVar.setController(b.mo39827e());
    }
}
