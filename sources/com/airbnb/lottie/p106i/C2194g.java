package com.airbnb.lottie.p106i;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.C2041d;
import com.airbnb.lottie.C2152h;
import com.airbnb.lottie.p093a.p094a.C2011s;
import com.airbnb.lottie.p093a.p095b.C2019c;
import com.airbnb.lottie.p104g.C2144d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;

/* renamed from: com.airbnb.lottie.i.g */
public final class C2194g {

    /* renamed from: a */
    public static final ThreadLocal<float[]> f6550a = new ThreadLocal<float[]>() {
        /* class com.airbnb.lottie.p106i.C2194g.C21984 */

        static {
            Covode.recordClassIndex(2393);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ float[] initialValue() {
            return new float[4];
        }
    };

    /* renamed from: b */
    private static final ThreadLocal<PathMeasure> f6551b = new ThreadLocal<PathMeasure>() {
        /* class com.airbnb.lottie.p106i.C2194g.C21951 */

        static {
            Covode.recordClassIndex(2390);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ PathMeasure initialValue() {
            return new PathMeasure();
        }
    };

    /* renamed from: c */
    private static final ThreadLocal<Path> f6552c = new ThreadLocal<Path>() {
        /* class com.airbnb.lottie.p106i.C2194g.C21962 */

        static {
            Covode.recordClassIndex(2391);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Path initialValue() {
            return new Path();
        }
    };

    /* renamed from: d */
    private static final ThreadLocal<Path> f6553d = new ThreadLocal<Path>() {
        /* class com.airbnb.lottie.p106i.C2194g.C21973 */

        static {
            Covode.recordClassIndex(2392);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Path initialValue() {
            return new Path();
        }
    };

    /* renamed from: e */
    private static final float f6554e = ((float) (Math.sqrt(2.0d) / 2.0d));

    /* renamed from: f */
    private static final PathMeasure f6555f = new PathMeasure();

    /* renamed from: g */
    private static final Path f6556g = new Path();

    /* renamed from: h */
    private static final Path f6557h = new Path();

    /* renamed from: i */
    private static final float[] f6558i = new float[4];

    /* renamed from: j */
    private static final float f6559j = ((float) Math.sqrt(2.0d));

    /* renamed from: k */
    private static float f6560k = -1.0f;

    /* renamed from: a */
    public static float m6792a() {
        if (f6560k == -1.0f) {
            f6560k = Resources.getSystem().getDisplayMetrics().density;
        }
        return f6560k;
    }

    static {
        Covode.recordClassIndex(2389);
    }

    /* renamed from: a */
    public static void m6798a(Closeable closeable) {
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
    public static float m6793a(Matrix matrix) {
        if (C2144d.C2145a.f6479a) {
            float[] fArr = f6550a.get();
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = f6554e;
            fArr[2] = f;
            fArr[3] = f;
            matrix.mapPoints(fArr);
            return (float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]));
        }
        float[] fArr2 = f6558i;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        float f2 = f6559j;
        fArr2[2] = f2;
        fArr2[3] = f2;
        matrix.mapPoints(fArr2);
        return ((float) Math.hypot((double) (fArr2[2] - fArr2[0]), (double) (fArr2[3] - fArr2[1]))) / 2.0f;
    }

    /* renamed from: a */
    public static void m6797a(Path path, C2011s sVar) {
        if (sVar != null) {
            if (C2144d.C2145a.f6479a) {
                m6796a(path, ((C2019c) sVar.f6059b).mo5925g() / 100.0f, ((C2019c) sVar.f6060c).mo5925g() / 100.0f, ((C2019c) sVar.f6061d).mo5925g() / 360.0f);
                return;
            }
            m6796a(path, sVar.f6059b.mo5918f().floatValue() / 100.0f, sVar.f6060c.mo5918f().floatValue() / 100.0f, sVar.f6061d.mo5918f().floatValue() / 360.0f);
        }
    }

    /* renamed from: a */
    public static Bitmap m6794a(Bitmap bitmap, int i, int i2, C2152h hVar) {
        int i3;
        int i4;
        Bitmap bitmap2;
        MethodCollector.m26663i(13165);
        if (bitmap == null || hVar == null || i <= 0 || i2 <= 0) {
            MethodCollector.m26664o(13165);
            return bitmap;
        } else if (C2144d.C2145a.f6484f) {
            if (C2144d.C2149e.f6506c) {
                int i5 = hVar.f6509a;
                int i6 = hVar.f6510b;
                if (i5 >= 32 && i6 >= 32) {
                    i3 = i / 2;
                    i4 = i2 / 2;
                    if (bitmap.getWidth() <= i3 || bitmap.getHeight() > i4) {
                        bitmap2 = Bitmap.createScaledBitmap(bitmap, i3, i4, true);
                        bitmap.recycle();
                    } else {
                        bitmap2 = bitmap;
                    }
                    if (bitmap2.getWidth() < i || bitmap2.getHeight() < i2) {
                        hVar.f6516h = true;
                    }
                    if (C2144d.f6474a && !(bitmap.getWidth() == i && bitmap.getHeight() == i2)) {
                        bitmap.getWidth();
                        bitmap.getHeight();
                    }
                    MethodCollector.m26664o(13165);
                    return bitmap2;
                }
            }
            i3 = i;
            i4 = i2;
            if (bitmap.getWidth() <= i3) {
            }
            bitmap2 = Bitmap.createScaledBitmap(bitmap, i3, i4, true);
            bitmap.recycle();
            hVar.f6516h = true;
            bitmap.getWidth();
            bitmap.getHeight();
            MethodCollector.m26664o(13165);
            return bitmap2;
        } else if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            MethodCollector.m26664o(13165);
            return bitmap;
        } else {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
            bitmap.recycle();
            MethodCollector.m26664o(13165);
            return createScaledBitmap;
        }
    }

    /* renamed from: a */
    public static Path m6795a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        return path;
    }

    /* renamed from: a */
    public static void m6796a(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure;
        Path path2;
        Path path3;
        C2041d.m6462b("applyTrimPathIfNeeded");
        if (C2144d.C2145a.f6479a) {
            pathMeasure = f6551b.get();
            path2 = f6552c.get();
            path3 = f6553d.get();
        } else {
            pathMeasure = f6555f;
            path2 = f6556g;
            path3 = f6557h;
        }
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C2041d.m6463c("applyTrimPathIfNeeded");
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 1.0f)) < 0.01d) {
            C2041d.m6463c("applyTrimPathIfNeeded");
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = (float) C2192f.m6786a(min, length);
                max = (float) C2192f.m6786a(max, length);
            }
            if (min < 0.0f) {
                min = (float) C2192f.m6786a(min, length);
            }
            if (max < 0.0f) {
                max = (float) C2192f.m6786a(max, length);
            }
            if (min == max) {
                path.reset();
                C2041d.m6463c("applyTrimPathIfNeeded");
                return;
            }
            if (min >= max) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            C2041d.m6463c("applyTrimPathIfNeeded");
        }
    }
}
