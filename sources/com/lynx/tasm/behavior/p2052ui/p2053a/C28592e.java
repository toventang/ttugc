package com.lynx.tasm.behavior.p2052ui.p2053a;

import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Shader;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.LLog;

/* renamed from: com.lynx.tasm.behavior.ui.a.e */
public class C28592e extends AbstractC28588a {

    /* renamed from: h */
    public EnumC28593a f67318h;

    /* renamed from: i */
    private double f67319i;

    static {
        Covode.recordClassIndex(34627);
    }

    /* renamed from: com.lynx.tasm.behavior.ui.a.e$a */
    public enum EnumC28593a {
        None,
        ToTop,
        ToBottom,
        ToLeft,
        ToRight,
        ToTopRight,
        ToTopLeft,
        ToBottomRight,
        ToBottomLeft,
        Angle;

        static {
            Covode.recordClassIndex(34628);
        }
    }

    public C28592e(ReadableArray readableArray) {
        if (readableArray == null) {
            LLog.m56856a(6, "LinearGradient", "native parse error array is null");
        } else if (readableArray.size() != 3) {
            LLog.m56856a(6, "LinearGradient", "native parse error, array.size must be 3");
        } else {
            this.f67319i = readableArray.getDouble(0);
            mo49402a(readableArray.getArray(1), readableArray.getArray(2));
        }
    }

    public void setBounds(Rect rect) {
        PointF pointF;
        this.f67302b = Math.max(rect.width(), 1);
        this.f67303c = Math.max(rect.height(), 1);
        int[] iArr = this.f67304d;
        float[] fArr = this.f67305e;
        if (this.f67304d == null || this.f67304d.length < 2) {
            this.f67301a = null;
        } else if (this.f67305e == null || this.f67305e.length == this.f67304d.length) {
            try {
                float f = ((((float) this.f67302b) * 2.0f) * ((float) this.f67303c)) / ((float) ((this.f67302b * this.f67302b) + (this.f67303c * this.f67303c)));
                if (this.f67319i == 0.0d || this.f67318h == EnumC28593a.ToTop) {
                    this.f67301a = new LinearGradient(0.0f, (float) this.f67303c, 0.0f, 0.0f, iArr, fArr, Shader.TileMode.CLAMP);
                } else if (this.f67319i == 180.0d || this.f67318h == EnumC28593a.ToBottom) {
                    this.f67301a = new LinearGradient(0.0f, 0.0f, 0.0f, (float) this.f67303c, iArr, fArr, Shader.TileMode.CLAMP);
                } else if (this.f67319i == 270.0d || this.f67318h == EnumC28593a.ToLeft) {
                    this.f67301a = new LinearGradient((float) this.f67302b, 0.0f, 0.0f, 0.0f, iArr, fArr, Shader.TileMode.CLAMP);
                } else if (this.f67319i == 90.0d || this.f67318h == EnumC28593a.ToRight) {
                    this.f67301a = new LinearGradient(0.0f, 0.0f, (float) this.f67302b, 0.0f, iArr, fArr, Shader.TileMode.CLAMP);
                } else if (this.f67319i == 45.0d || this.f67318h == EnumC28593a.ToTopRight) {
                    this.f67301a = new LinearGradient(((float) this.f67302b) - (((float) this.f67303c) * f), ((float) this.f67302b) * f, (float) this.f67302b, 0.0f, iArr, fArr, Shader.TileMode.CLAMP);
                } else if (this.f67319i == 305.0d || this.f67318h == EnumC28593a.ToTopLeft) {
                    this.f67301a = new LinearGradient(((float) this.f67303c) * f, ((float) this.f67302b) * f, 0.0f, 0.0f, iArr, fArr, Shader.TileMode.CLAMP);
                } else if (this.f67319i == 135.0d || this.f67318h == EnumC28593a.ToBottomRight) {
                    this.f67301a = new LinearGradient(0.0f, 0.0f, ((float) this.f67303c) * f, ((float) this.f67302b) * f, iArr, fArr, Shader.TileMode.CLAMP);
                } else if (this.f67319i == 225.0d || this.f67318h == EnumC28593a.ToBottomLeft) {
                    this.f67301a = new LinearGradient((float) this.f67302b, 0.0f, ((float) this.f67302b) - (((float) this.f67303c) * f), ((float) this.f67302b) * f, iArr, fArr, Shader.TileMode.CLAMP);
                } else {
                    PointF pointF2 = new PointF();
                    PointF pointF3 = new PointF();
                    PointF pointF4 = new PointF(((float) this.f67302b) / 2.0f, ((float) this.f67303c) / 2.0f);
                    double radians = Math.toRadians(this.f67319i);
                    float sin = (float) Math.sin(radians);
                    float cos = (float) Math.cos(radians);
                    float tan = (float) Math.tan(radians);
                    if (sin >= 0.0f && cos >= 0.0f) {
                        pointF = new PointF((float) this.f67302b, 0.0f);
                    } else if (sin >= 0.0f && cos < 0.0f) {
                        pointF = new PointF((float) this.f67302b, (float) this.f67303c);
                    } else if (sin >= 0.0f || cos >= 0.0f) {
                        pointF = new PointF(0.0f, 0.0f);
                    } else {
                        pointF = new PointF(0.0f, (float) this.f67303c);
                    }
                    float f2 = ((pointF4.y - pointF.y) - (pointF4.x * tan)) + (pointF.x * tan);
                    pointF3.x = pointF4.x + ((sin * f2) / ((sin * tan) + cos));
                    pointF3.y = pointF4.y - (f2 / ((tan * tan) + 1.0f));
                    pointF2.x = (pointF4.x * 2.0f) - pointF3.x;
                    pointF2.y = (pointF4.y * 2.0f) - pointF3.y;
                    this.f67301a = new LinearGradient(pointF2.x, pointF2.y, pointF3.x, pointF3.y, iArr, fArr, Shader.TileMode.CLAMP);
                }
            } catch (Exception e) {
                this.f67301a = null;
                e.printStackTrace();
                LLog.m56861c("BackgroundLinearGradientLayer", "exception:\n" + e.toString());
            }
        } else {
            this.f67301a = null;
        }
        super.setBounds(rect);
    }
}
