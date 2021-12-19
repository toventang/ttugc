package com.p2082ss.android.ugc.aweme.share.qrcode.p3773b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.net.Uri;
import android.view.View;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.qrcode.C66372b;
import com.p2082ss.android.ugc.aweme.qrcode.C66416k;
import com.p2082ss.android.ugc.aweme.share.qrcode.view.C69412a;
import com.p2082ss.android.ugc.aweme.share.qrcode.view.QRCodeBackgroundLayout;
import com.p2082ss.android.ugc.aweme.share.qrcode.view.QRCodeSquareView;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73955am;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.io.FileNotFoundException;
import p078c.p080b.C1757e;
import p078c.p083d.C1762a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.qrcode.b.a */
public final class C69393a {

    /* renamed from: a */
    public static final C69394a f155005a = new C69394a((byte) 0);

    static {
        Covode.recordClassIndex(81726);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.b.a$a */
    public static final class C69394a {

        /* renamed from: com.ss.android.ugc.aweme.share.qrcode.b.a$a$a */
        public interface AbstractC69395a {
            static {
                Covode.recordClassIndex(81728);
            }

            /* renamed from: a */
            void mo109639a(Uri uri, String str, boolean z);
        }

        static {
            Covode.recordClassIndex(81727);
        }

        private C69394a() {
        }

        public /* synthetic */ C69394a(byte b) {
            this();
        }

        /* renamed from: a */
        private static Bitmap m122580a(View view) {
            Bitmap bitmap;
            MethodCollector.m26663i(7700);
            view.setDrawingCacheEnabled(true);
            view.buildDrawingCache();
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            } else {
                bitmap = null;
            }
            view.setDrawingCacheEnabled(false);
            MethodCollector.m26664o(7700);
            return bitmap;
        }

        /* renamed from: b */
        private static Bitmap m122586b(View view) {
            Bitmap bitmap;
            MethodCollector.m26663i(7837);
            view.setDrawingCacheEnabled(true);
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            } else {
                bitmap = null;
            }
            view.setDrawingCacheEnabled(false);
            MethodCollector.m26664o(7837);
            return bitmap;
        }

        /* renamed from: a */
        private static Bitmap m122579a(Bitmap bitmap, float f, float f2) {
            float f3;
            MethodCollector.m26663i(7523);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (((float) (width / height)) < f / f2) {
                f3 = f / ((float) width);
            } else {
                f3 = f2 / ((float) height);
            }
            Matrix matrix = new Matrix();
            matrix.postScale(f3, f3);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            C89219l.m154716b(createBitmap, "");
            MethodCollector.m26664o(7523);
            return createBitmap;
        }

        /* renamed from: a */
        private static Uri m122581a(Bitmap bitmap, String str, Context context) {
            MethodCollector.m26663i(7973);
            C89219l.m154721d(bitmap, "");
            C89219l.m154721d(context, "");
            Uri a = C1757e.m5902a(context, str, "image/jpeg");
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, context.getContentResolver().openOutputStream(a));
                MethodCollector.m26664o(7973);
                return a;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                MethodCollector.m26664o(7973);
                return null;
            }
        }

        /* renamed from: a */
        private static void m122583a(Context context, View view, boolean z, boolean z2, AbstractC69395a aVar) {
            if (view != null) {
                C66372b a = C66416k.f149319a.mo105289a(view, C13607d.m24442b("" + System.currentTimeMillis()) + ".png", z2);
                if (a != null) {
                    if (z) {
                        new C79459a(context).mo123050a(R.string.fdu).mo123053a();
                    }
                    view.announceForAccessibility(C17867d.m33078a().getString(R.string.fdu));
                    if (a.f149275c) {
                        String str = a.f149274b;
                        if (str != null && aVar != null) {
                            aVar.mo109639a(null, str, a.f149275c);
                            return;
                        }
                        return;
                    }
                    Uri uri = a.f149273a;
                    if (uri != null && aVar != null) {
                        aVar.mo109639a(uri, null, a.f149275c);
                    }
                }
            }
        }

        /* renamed from: a */
        public static void m122582a(Context context, View view, QRCodeSquareView qRCodeSquareView, boolean z, boolean z2, AbstractC69395a aVar) {
            C89219l.m154721d(context, "");
            if (qRCodeSquareView == null || !qRCodeSquareView.f155027b) {
                Context a = C17867d.m33078a();
                new C79459a(a).mo123052a(a.getString(R.string.bb4)).mo123053a();
                return;
            }
            m122583a(context, view, z, z2, aVar);
        }

        /* renamed from: a */
        private static void m122584a(Context context, QRCodeBackgroundLayout qRCodeBackgroundLayout, C69412a aVar, boolean z, boolean z2, AbstractC69395a aVar2) {
            MethodCollector.m26663i(7367);
            Bitmap a = m122580a(qRCodeBackgroundLayout);
            Bitmap b = m122586b(aVar);
            if (a == null || b == null) {
                MethodCollector.m26664o(7367);
                return;
            }
            float b2 = C13628n.m24520b(context, 250.0f);
            float b3 = C13628n.m24520b(context, 445.0f);
            Bitmap a2 = m122579a(a, b2, b3);
            Bitmap createBitmap = Bitmap.createBitmap((int) b2, (int) b3, a2.getConfig());
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawBitmap(a2, new Matrix(), null);
            Matrix matrix = new Matrix();
            matrix.postTranslate((b2 - ((float) b.getWidth())) / 2.0f, C13628n.m24520b(context, 76.0f));
            canvas.drawBitmap(b, matrix, null);
            String str = C13607d.m24442b("" + System.currentTimeMillis()) + ".png";
            if (z2) {
                String g = C73955am.m130077g(context);
                if (BitmapUtils.saveBitmapToSD(createBitmap, g, str)) {
                    String str2 = g + '/' + str;
                    if (z) {
                        new C79459a(context).mo123050a(R.string.fdu).mo123053a();
                    }
                    qRCodeBackgroundLayout.announceForAccessibility(C17867d.m33078a().getString(R.string.fdu));
                    C66416k.f149319a.mo105290a(context, str2);
                    if (aVar2 != null) {
                        aVar2.mo109639a(null, str2, z2);
                        MethodCollector.m26664o(7367);
                        return;
                    }
                    MethodCollector.m26664o(7367);
                    return;
                }
            } else {
                C89219l.m154716b(createBitmap, "");
                Uri a3 = m122581a(createBitmap, str, context);
                if (a3 != null) {
                    String a4 = C1762a.m5918a(context, a3);
                    if (a4 != null) {
                        C1757e.m5912c(context, a4);
                    }
                    if (z) {
                        new C79459a(context).mo123050a(R.string.fdu).mo123053a();
                    }
                    qRCodeBackgroundLayout.announceForAccessibility(C17867d.m33078a().getString(R.string.fdu));
                    if (aVar2 != null) {
                        aVar2.mo109639a(a3, null, z2);
                        MethodCollector.m26664o(7367);
                        return;
                    }
                }
            }
            MethodCollector.m26664o(7367);
        }

        /* renamed from: a */
        public static void m122585a(Context context, QRCodeSquareView qRCodeSquareView, View view, QRCodeBackgroundLayout qRCodeBackgroundLayout, C69412a aVar, boolean z, boolean z2, AbstractC69395a aVar2) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(qRCodeBackgroundLayout, "");
            C89219l.m154721d(aVar, "");
            if (qRCodeSquareView == null || !qRCodeSquareView.f155027b) {
                Context a = C17867d.m33078a();
                new C79459a(a).mo123052a(a.getString(R.string.bb4)).mo123053a();
                if (view != null) {
                    view.announceForAccessibility(a.getString(R.string.bb4));
                    return;
                }
                return;
            }
            m122584a(context, qRCodeBackgroundLayout, aVar, z, z2, aVar2);
        }
    }
}
