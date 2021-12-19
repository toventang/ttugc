package com.bytedance.lottie.p1505f;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21044e;
import com.bytedance.lottie.p1495a.p1496a.C20953r;
import java.io.Closeable;

/* renamed from: com.bytedance.lottie.f.h */
public final class C21087h {

    /* renamed from: a */
    private static final PathMeasure f49963a = new PathMeasure();

    /* renamed from: b */
    private static final Path f49964b = new Path();

    /* renamed from: c */
    private static final Path f49965c = new Path();

    /* renamed from: d */
    private static final float[] f49966d = new float[4];

    /* renamed from: e */
    private static final float f49967e = ((float) Math.sqrt(2.0d));

    /* renamed from: f */
    private static float f49968f = -1.0f;

    /* renamed from: a */
    public static float m39715a() {
        if (f49968f == -1.0f) {
            f49968f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f49968f;
    }

    static {
        Covode.recordClassIndex(24703);
    }

    /* renamed from: a */
    public static void m39719a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static float m39716a(Matrix matrix) {
        float[] fArr = f49966d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f49967e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return ((float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]))) / 2.0f;
    }

    /* renamed from: a */
    public static void m39718a(Path path, C20953r rVar) {
        if (rVar != null) {
            m39717a(path, rVar.f49651b.mo34470d().floatValue() / 100.0f, rVar.f49652c.mo34470d().floatValue() / 100.0f, rVar.f49653d.mo34470d().floatValue() / 360.0f);
        }
    }

    /* renamed from: a */
    public static void m39717a(Path path, float f, float f2, float f3) {
        C21044e.m39621b("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f49963a;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C21044e.m39622c("applyTrimPathIfNeeded");
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 1.0f)) < 0.01d) {
            C21044e.m39622c("applyTrimPathIfNeeded");
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = (float) C21084f.m39706a(min, length);
                max = (float) C21084f.m39706a(max, length);
            }
            if (min < 0.0f) {
                min = (float) C21084f.m39706a(min, length);
            }
            if (max < 0.0f) {
                max = (float) C21084f.m39706a(max, length);
            }
            if (min == max) {
                path.reset();
                C21044e.m39622c("applyTrimPathIfNeeded");
                return;
            }
            if (min >= max) {
                min -= length;
            }
            Path path2 = f49964b;
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                Path path3 = f49965c;
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                Path path4 = f49965c;
                path4.reset();
                pathMeasure.getSegment(min + length, length, path4, true);
                path2.addPath(path4);
            }
            path.set(path2);
            C21044e.m39622c("applyTrimPathIfNeeded");
        }
    }
}
