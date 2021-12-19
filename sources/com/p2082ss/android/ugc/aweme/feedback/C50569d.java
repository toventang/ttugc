package com.p2082ss.android.ugc.aweme.feedback;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84891c;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feedback.d */
public final class C50569d {

    /* renamed from: a */
    public static final C50569d f116866a = new C50569d();

    private C50569d() {
    }

    static {
        Covode.recordClassIndex(59716);
    }

    /* renamed from: a */
    private static String m94801a() {
        File a = C80720e.m139916a(m94804b());
        if (a == null) {
            return "";
        }
        String path = a.getPath();
        C89219l.m154716b(path, "");
        return path;
    }

    /* renamed from: b */
    private static String m94804b() {
        return "feedback" + File.separator + "upload";
    }

    /* renamed from: a */
    public static void m94803a(int i) {
        if (i > 0) {
            C80720e.m139938e(m94801a());
        }
    }

    /* renamed from: a */
    public static String m94802a(String str, File file, int i) {
        MethodCollector.m26663i(5633);
        C89219l.m154721d(str, "");
        C89219l.m154721d(file, "");
        int min = Math.min(i, 720);
        if (min > 0) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                if (options.outWidth > min) {
                    options.inSampleSize = C84891c.m145842a(options, min, (options.outHeight * min) / options.outWidth);
                    options.inJustDecodeBounds = false;
                    Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                    C89219l.m154716b(decodeFile, "");
                    Bitmap rotateBitmap = BitmapUtils.rotateBitmap(decodeFile, BitmapUtils.readPictureDegree(str));
                    C89219l.m154716b(rotateBitmap, "");
                    if (rotateBitmap != null) {
                        String a = m94801a();
                        if (BitmapUtils.saveBitmapToSD(rotateBitmap, a, file.getName())) {
                            str = a + File.separator + file.getName();
                        }
                        rotateBitmap.recycle();
                    }
                }
            } catch (Throwable unused) {
            }
        }
        MethodCollector.m26664o(5633);
        return str;
    }
}
