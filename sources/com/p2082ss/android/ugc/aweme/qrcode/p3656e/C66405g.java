package com.p2082ss.android.ugc.aweme.qrcode.p3656e;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import java.io.IOException;
import p078c.p080b.C1757e;

/* renamed from: com.ss.android.ugc.aweme.qrcode.e.g */
public final class C66405g {
    static {
        Covode.recordClassIndex(77937);
    }

    /* renamed from: a */
    public static Bitmap m118106a(View view) {
        Bitmap bitmap;
        MethodCollector.m26663i(278);
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        if (view.getDrawingCache() != null) {
            bitmap = Bitmap.createBitmap(view.getDrawingCache());
        } else {
            bitmap = null;
        }
        MethodCollector.m26664o(278);
        return bitmap;
    }

    /* renamed from: a */
    public static Uri m118107a(View view, String str, Context context) {
        MethodCollector.m26663i(276);
        Bitmap a = m118106a(view);
        if (a == null) {
            MethodCollector.m26664o(276);
            return null;
        }
        view.setDrawingCacheEnabled(false);
        if (context == null) {
            context = C17867d.m33078a();
        }
        try {
            Uri a2 = C1757e.m5902a(context, str, "image/png");
            if (a2 != null) {
                a.compress(Bitmap.CompressFormat.PNG, 100, context.getContentResolver().openOutputStream(a2));
                MethodCollector.m26664o(276);
                return a2;
            }
            IOException iOException = new IOException();
            MethodCollector.m26664o(276);
            throw iOException;
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m26664o(276);
            return null;
        }
    }
}
