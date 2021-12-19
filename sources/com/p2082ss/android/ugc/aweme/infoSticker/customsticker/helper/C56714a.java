package com.p2082ss.android.ugc.aweme.infoSticker.customsticker.helper;

import android.graphics.Bitmap;
import android.media.ExifInterface;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.helper.a */
public final class C56714a {

    /* renamed from: a */
    public static final C56714a f129263a = new C56714a();

    private C56714a() {
    }

    static {
        Covode.recordClassIndex(66572);
    }

    /* renamed from: a */
    private static String m102720a() {
        String e = C63244g.m114602a().mo73279g().mo69470c().mo69479e("custom_sticker");
        if (!new File(e).exists()) {
            new File(e).mkdirs();
        }
        return e;
    }

    /* renamed from: a */
    public static int m102716a(String str) {
        try {
            ExifInterface c = C84896h.m145870c(str);
            if (c == null) {
                return 0;
            }
            int attributeInt = c.getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return LiveFeedRefreshTimeSetting.DEFAULT;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (IOException e) {
            C73991bj.m130131b("readPictureDegree failed: " + e.getMessage());
            return 0;
        }
    }

    /* renamed from: b */
    private static String m102723b(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        C89219l.m154716b(instance, "");
        return simpleDateFormat.format(instance.getTime()) + str;
    }

    /* renamed from: a */
    private static File m102717a(Bitmap.CompressFormat compressFormat) {
        String str;
        String a = m102720a();
        if (compressFormat == Bitmap.CompressFormat.PNG) {
            str = a + File.separator + m102723b(".png");
        } else {
            str = a + File.separator + m102723b(".jpg");
        }
        return new File(str);
    }

    /* renamed from: a */
    private static void m102721a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable th) {
                C40970e.m82485a("CutoutImageHelper#saveImageBitmap failed. Msg:" + th.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static final File m102719a(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        C89219l.m154721d(compressFormat, "");
        if (bitmap == null) {
            return null;
        }
        File a = m102717a(compressFormat);
        m102722a(bitmap, a, compressFormat);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return a;
    }

    /* renamed from: a */
    private static boolean m102722a(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat) {
        Throwable th;
        Exception e;
        MethodCollector.m26663i(12421);
        BufferedOutputStream bufferedOutputStream = null;
        boolean z = false;
        try {
            if (bitmap.isRecycled()) {
                m102721a((OutputStream) null);
                MethodCollector.m26664o(12421);
                return false;
            }
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bitmap.compress(compressFormat, 80, bufferedOutputStream2);
                bufferedOutputStream2.flush();
                z = true;
                m102721a(bufferedOutputStream2);
            } catch (Exception e2) {
                e = e2;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    C40970e.m82485a("CutoutImageHelper#saveImageBitmap failed. Msg:" + e.getMessage());
                    m102721a(bufferedOutputStream);
                    MethodCollector.m26664o(12421);
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    m102721a(bufferedOutputStream);
                    MethodCollector.m26664o(12421);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = bufferedOutputStream2;
                m102721a(bufferedOutputStream);
                MethodCollector.m26664o(12421);
                throw th;
            }
            MethodCollector.m26664o(12421);
            return z;
        } catch (Exception e3) {
            e = e3;
            C40970e.m82485a("CutoutImageHelper#saveImageBitmap failed. Msg:" + e.getMessage());
            m102721a(bufferedOutputStream);
            MethodCollector.m26664o(12421);
            return z;
        }
    }
}
