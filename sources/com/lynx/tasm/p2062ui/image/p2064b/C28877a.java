package com.lynx.tasm.p2062ui.image.p2064b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1835g.AbstractC24111h;
import com.facebook.common.p1835g.C24114j;
import com.facebook.common.p1836h.C24117a;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.imagepipeline.p1880e.C24413h;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1844d.AbstractC24156b;
import com.facebook.p1844d.AbstractC24157c;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.p2062ui.image.HandlerThreadC28891e;
import com.lynx.tasm.p2062ui.image.p2063a.C28873b;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.lynx.tasm.ui.image.b.a */
public class C28877a {

    /* renamed from: f */
    private static int f68217f = Math.min(3379, 3379);

    /* renamed from: g */
    private static int f68218g = Math.min(3379, 3379);

    /* renamed from: a */
    public AbstractC28882b f68219a;

    /* renamed from: b */
    public C28883c f68220b;

    /* renamed from: c */
    public boolean f68221c;

    /* renamed from: d */
    private Handler f68222d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private int f68223e;

    /* renamed from: com.lynx.tasm.ui.image.b.a$b */
    public interface AbstractC28882b {
        static {
            Covode.recordClassIndex(35005);
        }

        /* renamed from: a */
        void mo50009a();
    }

    /* renamed from: a */
    public final void mo50094a(final C28883c cVar) {
        this.f68222d.post(new Runnable() {
            /* class com.lynx.tasm.p2062ui.image.p2064b.C28877a.RunnableC288781 */

            static {
                Covode.recordClassIndex(35001);
            }

            public final void run() {
                C28877a.this.mo50096b(cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo50092a(Context context, C24636b bVar, C28881a aVar) {
        m57846b(context, bVar, aVar);
        m57844a(bVar, aVar);
    }

    /* renamed from: a */
    public final boolean mo50095a(Context context, Canvas canvas, C24636b bVar, C28881a aVar) {
        this.f68221c = true;
        C28883c cVar = this.f68220b;
        if (cVar == null || cVar.f68245d == null || this.f68220b.f68247f.f68233a != aVar.f68233a) {
            mo50090a();
            mo50092a(context, bVar, aVar);
        }
        C28883c cVar2 = this.f68220b;
        if (cVar2 == null || cVar2.f68245d == null) {
            return false;
        }
        C28873b.m57836a((int) aVar.f68234b, (int) aVar.f68235c, this.f68220b.f68245d.getWidth(), this.f68220b.f68245d.getHeight(), aVar.f68237e, aVar.f68240h, aVar.f68241i, canvas, this.f68220b.f68245d);
        return true;
    }

    /* renamed from: a */
    public final void mo50093a(Canvas canvas, C28883c cVar) {
        if (cVar != null && cVar.f68245d != null && !cVar.f68245d.isRecycled()) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            if (cVar.f68247f.f68237e != C24229q.AbstractC24231b.f57454d || !cVar.f68247f.f68236d) {
                Matrix matrix = new Matrix();
                matrix.preTranslate((float) this.f68220b.f68244c.left, (float) this.f68220b.f68244c.top);
                if (this.f68220b.f68246e) {
                    matrix.postScale((((float) (this.f68220b.f68244c.right - this.f68220b.f68244c.left)) * 1.0f) / ((float) (this.f68220b.f68243b.right - this.f68220b.f68243b.left)), (((float) (this.f68220b.f68244c.bottom - this.f68220b.f68244c.top)) * 1.0f) / ((float) (this.f68220b.f68243b.bottom - this.f68220b.f68243b.top)));
                    canvas.drawBitmap(this.f68220b.f68245d, matrix, paint);
                    return;
                }
                matrix.postScale((((float) (this.f68220b.f68244c.right - this.f68220b.f68244c.left)) * 1.0f) / ((float) this.f68220b.f68245d.getWidth()), (((float) (this.f68220b.f68244c.bottom - this.f68220b.f68244c.top)) * 1.0f) / ((float) this.f68220b.f68245d.getHeight()));
                canvas.drawBitmap(this.f68220b.f68245d, matrix, paint);
                return;
            }
            Bitmap bitmap = this.f68220b.f68245d;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            Matrix matrix2 = new Matrix();
            float min = Math.min((((float) canvas.getWidth()) * 1.0f) / ((float) this.f68220b.f68245d.getWidth()), (((float) canvas.getHeight()) * 1.0f) / ((float) this.f68220b.f68245d.getHeight()));
            matrix2.postScale(min, min);
            bitmapShader.setLocalMatrix(matrix2);
            paint.setShader(bitmapShader);
            canvas.drawRect(new Rect(0, 0, canvas.getWidth(), canvas.getHeight()), paint);
        }
    }

    /* renamed from: com.lynx.tasm.ui.image.b.a$c */
    public static class C28883c {

        /* renamed from: a */
        public int f68242a = 1;

        /* renamed from: b */
        public Rect f68243b;

        /* renamed from: c */
        public Rect f68244c;

        /* renamed from: d */
        public Bitmap f68245d;

        /* renamed from: e */
        public boolean f68246e = true;

        /* renamed from: f */
        public C28881a f68247f;

        /* renamed from: g */
        public C24117a<AbstractC24454c> f68248g;

        static {
            Covode.recordClassIndex(35006);
        }

        /* renamed from: a */
        public final void mo50099a() {
            Bitmap bitmap = this.f68245d;
            if (bitmap != null && !bitmap.isRecycled() && !this.f68246e) {
                this.f68245d.recycle();
                this.f68245d = null;
            }
            C24117a<AbstractC24454c> aVar = this.f68248g;
            if (aVar != null) {
                aVar.close();
            }
        }

        public C28883c(C28881a aVar) {
            this.f68247f = aVar;
        }
    }

    static {
        Covode.recordClassIndex(35000);
    }

    /* renamed from: a */
    public final void mo50090a() {
        C28883c cVar = this.f68220b;
        if (cVar != null) {
            cVar.mo50099a();
        }
        this.f68220b = null;
    }

    /* renamed from: a */
    public final void mo50091a(int i) {
        this.f68223e = i;
        mo50090a();
    }

    /* renamed from: a */
    public static void m57845a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static Point m57843a(Canvas canvas) {
        return new Point(Math.min(canvas.getMaximumBitmapWidth(), f68217f), Math.min(canvas.getMaximumBitmapHeight(), f68218g));
    }

    /* renamed from: com.lynx.tasm.ui.image.b.a$a */
    public static class C28881a {

        /* renamed from: a */
        public int f68233a;

        /* renamed from: b */
        public float f68234b;

        /* renamed from: c */
        public float f68235c;

        /* renamed from: d */
        public boolean f68236d;

        /* renamed from: e */
        public C24229q.AbstractC24231b f68237e;

        /* renamed from: f */
        String f68238f;

        /* renamed from: g */
        Point f68239g;

        /* renamed from: h */
        public String f68240h;

        /* renamed from: i */
        public String f68241i;

        static {
            Covode.recordClassIndex(35004);
        }

        /* renamed from: a */
        public static C28881a m57857a(C28881a aVar) {
            String str = null;
            if (aVar == null) {
                return null;
            }
            if (!TextUtils.isEmpty(aVar.f68238f)) {
                str = String.copyValueOf(aVar.f68238f.toCharArray());
            }
            return new C28881a(aVar.f68233a, aVar.f68234b, aVar.f68235c, aVar.f68236d, aVar.f68237e, str, aVar.f68239g, aVar.f68240h, aVar.f68241i);
        }

        public C28881a(int i, float f, float f2, boolean z, C24229q.AbstractC24231b bVar, String str, Point point, String str2, String str3) {
            this.f68233a = i;
            this.f68234b = f;
            this.f68235c = f2;
            this.f68236d = z;
            this.f68237e = bVar;
            this.f68238f = str;
            this.f68239g = new Point(point.x, point.y);
            this.f68240h = str2;
            this.f68241i = str3;
        }
    }

    /* renamed from: b */
    public final void mo50096b(C28883c cVar) {
        if (cVar != null && cVar.f68245d != null && !cVar.f68245d.isRecycled()) {
            if (cVar.f68247f.f68233a != this.f68223e) {
                cVar.mo50099a();
                return;
            }
            C28883c cVar2 = this.f68220b;
            if (cVar2 == null || cVar2.f68245d == null || (this.f68220b.f68245d.getWidth() < cVar.f68245d.getWidth() && this.f68220b.f68245d.getHeight() < cVar.f68245d.getHeight())) {
                mo50090a();
                this.f68220b = cVar;
                AbstractC28882b bVar = this.f68219a;
                if (bVar != null) {
                    bVar.mo50009a();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r0 == null) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.lynx.tasm.p2062ui.image.p2064b.C28877a.C28883c mo50088a(com.lynx.tasm.p2062ui.image.p2064b.C28877a.C28881a r7) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.p2062ui.image.p2064b.C28877a.mo50088a(com.lynx.tasm.ui.image.b.a$a):com.lynx.tasm.ui.image.b.a$c");
    }

    public C28877a(AbstractC28882b bVar, int i) {
        this.f68219a = bVar;
        this.f68223e = i;
    }

    /* renamed from: a */
    private void m57844a(C24636b bVar, C28881a aVar) {
        if (bVar != null) {
            try {
                AbstractC24026e a = C24428k.m46551a().mo40247e().f57871d.mo40188a(bVar, null);
                if (C24428k.m46551a().mo40247e().f57868a.mo40201a(a) != null) {
                    C24117a<AbstractC24454c> b = C24428k.m46551a().mo40247e().f57868a.mo40201a(a).clone();
                    if (b.mo39695a() != null && (b.mo39695a() instanceof C24455d)) {
                        Bitmap bitmap = ((C24455d) b.mo39695a()).f58089a;
                        C28883c a2 = mo50089a(aVar, (float) bitmap.getWidth(), (float) bitmap.getHeight());
                        if (a2 != null) {
                            a2.f68248g = b;
                            a2.f68245d = bitmap;
                            mo50096b(a2);
                        }
                    }
                }
            } catch (Throwable th) {
                LLog.m56862d("BigImageDrawingHelper", "loadBitmapFromMemory failed: " + th.toString());
            }
        }
    }

    /* renamed from: a */
    public final C28883c mo50087a(Context context, C28881a aVar) {
        MethodCollector.m26663i(8213);
        try {
            InputStream open = context.getAssets().open(aVar.f68238f.substring(9));
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(open, false);
            BitmapFactory.Options options = new BitmapFactory.Options();
            C28883c a = mo50089a(aVar, (float) newInstance.getWidth(), (float) newInstance.getHeight());
            if (a != null) {
                options.inSampleSize = a.f68242a;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                a.f68245d = newInstance.decodeRegion(a.f68243b, options);
                a.f68246e = false;
            }
            newInstance.recycle();
            open.close();
            MethodCollector.m26664o(8213);
            return a;
        } catch (Throwable th) {
            LLog.m56862d("LynxImageHelper", "loadBitmapFromAssetSync error: " + th.getMessage());
            MethodCollector.m26664o(8213);
            return null;
        }
    }

    /* renamed from: b */
    private void m57846b(final Context context, final C24636b bVar, final C28881a aVar) {
        if (aVar != null && !TextUtils.isEmpty(aVar.f68238f)) {
            final C28881a a = C28881a.m57857a(aVar);
            HandlerThreadC28891e.m57879a().mo50103a(new Runnable() {
                /* class com.lynx.tasm.p2062ui.image.p2064b.C28877a.RunnableC288792 */

                static {
                    Covode.recordClassIndex(35002);
                }

                public final void run() {
                    try {
                        if (a.f68238f == null || !a.f68238f.startsWith("asset")) {
                            C28883c a = C28877a.this.mo50088a(a);
                            if (a != null) {
                                C28877a.this.mo50094a(a);
                                return;
                            }
                            C28877a aVar = C28877a.this;
                            Context context = context;
                            C28881a aVar2 = aVar;
                            if (aVar2 == null) {
                                return;
                            }
                            if (!TextUtils.isEmpty(aVar2.f68238f)) {
                                LLog.m56856a(3, "LynxImageHelper", "loadBitmapFromRemote");
                                Uri parse = Uri.parse(aVar2.f68238f);
                                C24413h e = C24428k.m46551a().mo40247e();
                                C24639c a2 = C24639c.m47149a(parse);
                                C28884b.m57860a(a2);
                                AbstractC24157c<C24117a<AbstractC24111h>> b = e.mo40229b(a2.mo40483a(), context);
                                C288803 r2 = new AbstractC24156b<C24117a<AbstractC24111h>>(aVar2) {
                                    /* class com.lynx.tasm.p2062ui.image.p2064b.C28877a.C288803 */

                                    /* renamed from: a */
                                    final /* synthetic */ C28881a f68231a;

                                    static {
                                        Covode.recordClassIndex(35003);
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.facebook.d.c] */
                                    @Override // com.facebook.p1844d.AbstractC24156b
                                    public final void onFailureImpl(AbstractC24157c<C24117a<AbstractC24111h>> cVar) {
                                        Throwable e = cVar.mo39748e();
                                        if (e != null) {
                                            LLog.m56862d("LynxImageHelper", "loadBitmapFromRemote failed: " + e.toString());
                                        }
                                        if (C28877a.this.f68219a != null && C28877a.this.f68220b != null && C28877a.this.f68220b.f68247f != null) {
                                            String str = C28877a.this.f68220b.f68247f.f68238f;
                                        }
                                    }

                                    @Override // com.facebook.p1844d.AbstractC24156b
                                    public final void onNewResultImpl(AbstractC24157c<C24117a<AbstractC24111h>> cVar) {
                                        C24117a<AbstractC24111h> d;
                                        C24114j jVar;
                                        Throwable th;
                                        Exception e;
                                        if (cVar.mo39745b() && (d = cVar.mo39747d()) != null) {
                                            C24117a<AbstractC24111h> b = d.clone();
                                            try {
                                                jVar = new C24114j(b.mo39695a());
                                                try {
                                                    BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance((InputStream) jVar, false);
                                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                                    C28883c a = C28877a.this.mo50089a(this.f68231a, (float) newInstance.getWidth(), (float) newInstance.getHeight());
                                                    if (a != null) {
                                                        options.inSampleSize = a.f68242a;
                                                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                                        a.f68245d = newInstance.decodeRegion(a.f68243b, options);
                                                        a.f68246e = false;
                                                        C28877a.this.mo50094a(a);
                                                    }
                                                    newInstance.recycle();
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    try {
                                                        e.printStackTrace();
                                                        C28877a.m57845a(jVar);
                                                        d.close();
                                                        b.close();
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        C28877a.m57845a(jVar);
                                                        d.close();
                                                        b.close();
                                                        throw th;
                                                    }
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                jVar = null;
                                                e.printStackTrace();
                                                C28877a.m57845a(jVar);
                                                d.close();
                                                b.close();
                                            } catch (Throwable th3) {
                                                th = th3;
                                                jVar = null;
                                                C28877a.m57845a(jVar);
                                                d.close();
                                                b.close();
                                                throw th;
                                            }
                                            C28877a.m57845a(jVar);
                                            d.close();
                                            b.close();
                                        }
                                    }

                                    {
                                        this.f68231a = r2;
                                    }
                                };
                                C40787l.C40788a a3 = C40787l.m82269a(EnumC40793o.FIXED);
                                a3.f95505c = 1;
                                b.mo39739a(r2, C40780g.m82242a(a3.mo70028a()));
                                return;
                            }
                            return;
                        }
                        C28883c a4 = C28877a.this.mo50087a(context, a);
                        if (a4 != null) {
                            C28877a.this.mo50094a(a4);
                        }
                    } catch (Throwable th) {
                        LLog.m56862d("BigImageDrawingHelper", "loadOriginBitmap failed: " + th.toString());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final C28883c mo50089a(C28881a aVar, float f, float f2) {
        if (f == 0.0f || f2 == 0.0f || aVar.f68234b == 0.0f || aVar.f68235c == 0.0f) {
            return null;
        }
        C28883c cVar = new C28883c(aVar);
        if (aVar.f68237e == C24229q.AbstractC24231b.f57456f) {
            cVar.f68243b = new Rect();
            cVar.f68244c = new Rect();
            if (f <= aVar.f68234b) {
                cVar.f68243b.left = 0;
                cVar.f68243b.right = (int) f;
                cVar.f68244c.left = (int) ((aVar.f68234b - f) / 2.0f);
                cVar.f68244c.right = (int) ((aVar.f68234b + f) / 2.0f);
            } else {
                float f3 = (f - aVar.f68234b) / 2.0f;
                cVar.f68243b.left = (int) f3;
                cVar.f68243b.right = (int) (f - f3);
                cVar.f68244c.left = 0;
                cVar.f68244c.right = (int) aVar.f68234b;
            }
            if (f2 <= aVar.f68235c) {
                cVar.f68243b.top = 0;
                cVar.f68243b.bottom = (int) f2;
                cVar.f68244c.top = (int) ((aVar.f68235c - f2) / 2.0f);
                cVar.f68244c.bottom = (int) ((aVar.f68235c + f2) / 2.0f);
            } else {
                float f4 = (f2 - aVar.f68235c) / 2.0f;
                cVar.f68243b.top = (int) f4;
                cVar.f68243b.bottom = (int) (f2 - f4);
                cVar.f68244c.top = 0;
                cVar.f68244c.bottom = (int) aVar.f68235c;
            }
            float f5 = (float) (cVar.f68243b.right - cVar.f68243b.left);
            float f6 = (float) (cVar.f68243b.bottom - cVar.f68243b.top);
            cVar.f68242a = m57842a(aVar.f68239g, f5, f6, f5, f6);
        } else if (aVar.f68237e == C24229q.AbstractC24231b.f57454d) {
            float f7 = aVar.f68234b / f;
            float f8 = aVar.f68235c / f2;
            cVar.f68243b = new Rect();
            cVar.f68243b.top = 0;
            cVar.f68243b.bottom = (int) f2;
            cVar.f68243b.left = 0;
            cVar.f68243b.right = (int) f;
            cVar.f68244c = new Rect();
            if (f7 <= f8) {
                float f9 = f7 * f2;
                cVar.f68244c.left = 0;
                cVar.f68244c.right = (int) aVar.f68234b;
                cVar.f68244c.top = (int) ((aVar.f68235c - f9) / 2.0f);
                cVar.f68244c.bottom = (int) ((aVar.f68235c + f9) / 2.0f);
            } else {
                float f10 = f8 * f;
                cVar.f68244c.top = 0;
                cVar.f68244c.bottom = (int) aVar.f68235c;
                cVar.f68244c.left = (int) ((aVar.f68234b - f10) / 2.0f);
                cVar.f68244c.right = (int) ((aVar.f68234b + f10) / 2.0f);
            }
            cVar.f68242a = m57842a(aVar.f68239g, (float) (cVar.f68244c.right - cVar.f68244c.left), (float) (cVar.f68244c.bottom - cVar.f68244c.top), f, f2);
        } else if (aVar.f68237e == C24229q.AbstractC24231b.f57458h) {
            float f11 = aVar.f68234b / f;
            float f12 = aVar.f68235c / f2;
            cVar.f68244c = new Rect();
            cVar.f68244c.top = 0;
            cVar.f68244c.bottom = (int) aVar.f68235c;
            cVar.f68244c.left = 0;
            cVar.f68244c.right = (int) aVar.f68234b;
            cVar.f68243b = new Rect();
            if (f11 >= f12) {
                float f13 = aVar.f68235c / f11;
                cVar.f68243b.left = 0;
                cVar.f68243b.right = (int) f;
                cVar.f68243b.top = (int) ((f2 - f13) / 2.0f);
                cVar.f68243b.bottom = (int) ((f2 + f13) / 2.0f);
            } else {
                float f14 = aVar.f68234b / f12;
                cVar.f68243b.left = (int) ((f - f14) / 2.0f);
                cVar.f68243b.right = (int) ((f + f14) / 2.0f);
                cVar.f68243b.top = 0;
                cVar.f68243b.bottom = (int) f2;
            }
            cVar.f68242a = m57842a(aVar.f68239g, aVar.f68234b, aVar.f68235c, (float) (cVar.f68243b.right - cVar.f68243b.left), (float) (cVar.f68243b.bottom - cVar.f68243b.top));
        } else {
            cVar.f68243b = new Rect(0, 0, (int) f, (int) f2);
            cVar.f68244c = new Rect(0, 0, (int) aVar.f68234b, (int) aVar.f68235c);
            cVar.f68242a = m57842a(aVar.f68239g, aVar.f68234b, aVar.f68235c, f, f2);
        }
        if (this.f68221c) {
            cVar.f68242a = 1;
        }
        return cVar;
    }

    /* renamed from: a */
    private static int m57842a(Point point, float f, float f2, float f3, float f4) {
        if (!(f4 == 0.0f || f3 == 0.0f)) {
            float min = Math.min(Math.min(f / f3, f2 / f4), Math.min(((float) point.x) / f3, ((float) point.y) / f4));
            int i = (int) (f3 * min);
            int i2 = (int) (min * f4);
            if (!(i == 0 || i2 == 0)) {
                float f5 = (float) i2;
                int i3 = 1;
                if (f4 > f5 || f3 > ((float) i)) {
                    int round = Math.round(f4 / f5);
                    int round2 = Math.round(f3 / ((float) i));
                    if (round >= round2) {
                        round = round2;
                    }
                    while (true) {
                        int i4 = i3 * 2;
                        if (i4 > round) {
                            break;
                        }
                        i3 = i4;
                    }
                }
                return i3;
            }
        }
        return 32;
    }
}
