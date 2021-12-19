package com.p2082ss.android.ugc.aweme.editSticker.p2883f;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.tools.utils.C84891c;

/* renamed from: com.ss.android.ugc.aweme.editSticker.f.f */
public final class C45888f {
    static {
        Covode.recordClassIndex(54412);
    }

    /* renamed from: a */
    public static Bitmap m88532a(View view, int i, int i2, int i3, int i4) {
        Bitmap bitmap;
        MethodCollector.m26663i(13834);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            createBitmap.setDensity(C45866d.m88488a().getResources().getDisplayMetrics().densityDpi);
            if (view.getDrawingCacheBackgroundColor() != 0) {
                createBitmap.eraseColor(view.getDrawingCacheBackgroundColor());
            }
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate((float) (-view.getScrollX()), (float) (-view.getScrollY()));
            view.draw(canvas);
            int width = createBitmap.getWidth();
            int height = createBitmap.getHeight();
            if (width == i && height == i2) {
                bitmap = createBitmap;
            } else if (i3 <= 0 || i4 <= 0 || (width <= i3 && height <= i4)) {
                Matrix matrix = new Matrix();
                matrix.postScale(((float) i) / ((float) width), ((float) i2) / ((float) height));
                createBitmap = createBitmap;
                bitmap = Bitmap.createBitmap(createBitmap, 0, 0, width, height, matrix, true);
            } else {
                Matrix matrix2 = new Matrix();
                matrix2.setTranslate(((float) (width - i3)) * 0.5f, ((float) (height - i4)) * 0.5f);
                matrix2.postScale(((float) i) / ((float) i3), ((float) i2) / ((float) i4));
                bitmap = Bitmap.createBitmap(createBitmap, 0, 0, i3, i4, matrix2, true);
            }
            if (bitmap != createBitmap) {
                C84891c.m145846a(createBitmap);
            }
            MethodCollector.m26664o(13834);
            return bitmap;
        } catch (OutOfMemoryError e) {
            if (C45866d.m88491d() != null) {
                C45866d.m88491d().mo77252a(e);
            }
            MethodCollector.m26664o(13834);
            return null;
        }
    }
}
