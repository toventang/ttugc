package com.p2082ss.android.ugc.aweme.photo;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.photo.d */
public final class C62860d {

    /* renamed from: com.ss.android.ugc.aweme.photo.d$a */
    public interface AbstractC62865a {
        static {
            Covode.recordClassIndex(73696);
        }

        /* renamed from: a */
        void mo100836a(Bitmap bitmap);
    }

    static {
        Covode.recordClassIndex(73691);
    }

    /* renamed from: a */
    public static UrlModel m113278a(Uri uri) {
        if (uri == null) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add(uri.toString());
        urlModel.setUrlList(arrayList);
        return urlModel;
    }

    /* renamed from: a */
    public static boolean m113279a(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Bitmap m113277a(Bitmap bitmap, int i, int i2) {
        MethodCollector.m26663i(11366);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) i) / ((float) width), ((float) i2) / ((float) height));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        bitmap.recycle();
        MethodCollector.m26664o(11366);
        return createBitmap;
    }
}
