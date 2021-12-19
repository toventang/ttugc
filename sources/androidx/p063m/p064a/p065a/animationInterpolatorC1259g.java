package androidx.p063m.p064a.p065a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.core.content.p032a.C0642h;
import androidx.core.graphics.C0702d;
import com.bytedance.covode.number.Covode;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.m.a.a.g  reason: invalid class name */
public final class animationInterpolatorC1259g implements Interpolator {

    /* renamed from: a */
    private float[] f4115a;

    /* renamed from: b */
    private float[] f4116b;

    static {
        Covode.recordClassIndex(1368);
    }

    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f4115a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f4115a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f4115a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f4116b[i];
        }
        float f3 = (f - fArr[i]) / f2;
        float[] fArr2 = this.f4116b;
        float f4 = fArr2[i];
        return f4 + (f3 * (fArr2[length] - f4));
    }

    /* renamed from: a */
    private void m4012a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f4115a = new float[min];
            this.f4116b = new float[min];
            float[] fArr = new float[2];
            int i2 = 0;
            do {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, null);
                this.f4115a[i2] = fArr[0];
                this.f4116b[i2] = fArr[1];
                i2++;
            } while (i2 < min);
            if (((double) Math.abs(this.f4115a[0])) <= 1.0E-5d && ((double) Math.abs(this.f4116b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f4115a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f4116b[i3] - 1.0f)) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    do {
                        float[] fArr2 = this.f4115a;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :".concat(String.valueOf(f2)));
                        }
                    } while (i < min);
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            int i6 = min - 1;
            throw new IllegalArgumentException("The Path must start at (0,0) and end at (1,1) start: " + this.f4115a[0] + "," + this.f4116b[0] + " end:" + this.f4115a[i6] + "," + this.f4116b[i6]);
        }
        throw new IllegalArgumentException("The Path has a invalid length ".concat(String.valueOf(length)));
    }

    public animationInterpolatorC1259g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private animationInterpolatorC1259g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C0642h.m2361a(resources, theme, attributeSet, C1249a.f4101l);
        if (C0642h.m2364a(xmlPullParser, "pathData")) {
            String c = C0642h.m2366c(a, xmlPullParser, "pathData", 4);
            Path a2 = C0702d.m2471a(c);
            if (a2 != null) {
                m4012a(a2);
            } else {
                throw new InflateException("The path is null, which is created from ".concat(String.valueOf(c)));
            }
        } else if (!C0642h.m2364a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C0642h.m2364a(xmlPullParser, "controlY1")) {
            float a3 = C0642h.m2358a(a, xmlPullParser, "controlX1", 0, 0.0f);
            float a4 = C0642h.m2358a(a, xmlPullParser, "controlY1", 1, 0.0f);
            boolean a5 = C0642h.m2364a(xmlPullParser, "controlX2");
            if (a5 != C0642h.m2364a(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!a5) {
                Path path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.quadTo(a3, a4, 1.0f, 1.0f);
                m4012a(path);
            } else {
                float a6 = C0642h.m2358a(a, xmlPullParser, "controlX2", 2, 0.0f);
                float a7 = C0642h.m2358a(a, xmlPullParser, "controlY2", 3, 0.0f);
                Path path2 = new Path();
                path2.moveTo(0.0f, 0.0f);
                path2.cubicTo(a3, a4, a6, a7, 1.0f, 1.0f);
                m4012a(path2);
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        a.recycle();
    }
}
