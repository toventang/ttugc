package com.lynx.tasm.behavior.p2052ui.p2053a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.LLog;

/* renamed from: com.lynx.tasm.behavior.ui.a.a */
public abstract class AbstractC28588a extends AbstractC28590c {

    /* renamed from: f */
    protected static float f67300f = -2.0f;

    /* renamed from: a */
    public Shader f67301a;

    /* renamed from: b */
    protected int f67302b;

    /* renamed from: c */
    protected int f67303c;

    /* renamed from: d */
    protected int[] f67304d = null;

    /* renamed from: e */
    protected float[] f67305e = null;

    /* renamed from: h */
    private final Paint f67306h = new Paint(1);

    @Override // com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28590c
    /* renamed from: a */
    public final void mo49401a(int i, int i2) {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28590c
    /* renamed from: a */
    public final boolean mo49403a() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28590c
    /* renamed from: d */
    public final void mo49406d() {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28590c
    /* renamed from: e */
    public final void mo49408e() {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28590c
    /* renamed from: b */
    public final int mo49404b() {
        return this.f67302b;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28590c
    /* renamed from: c */
    public final int mo49405c() {
        return this.f67303c;
    }

    static {
        Covode.recordClassIndex(34623);
    }

    public void draw(Canvas canvas) {
        if (this.f67301a == null) {
            LLog.m56856a(6, "gradient", "BackgroundGradientLayer.draw() must be called after setBounds()");
        }
        this.f67306h.setShader(this.f67301a);
        if (this.f67307g != null) {
            canvas.drawPath(this.f67307g, this.f67306h);
        } else {
            canvas.drawRect(getBounds(), this.f67306h);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49402a(ReadableArray readableArray, ReadableArray readableArray2) {
        if (readableArray2.size() == 0 || readableArray.size() == readableArray2.size()) {
            this.f67304d = new int[readableArray.size()];
            if (readableArray2.size() == readableArray.size()) {
                this.f67305e = new float[readableArray2.size()];
            }
            int i = 0;
            while (true) {
                int[] iArr = this.f67304d;
                if (i < iArr.length) {
                    iArr[i] = readableArray.getInt(i);
                    float[] fArr = this.f67305e;
                    if (fArr != null) {
                        fArr[i] = ((float) readableArray2.getDouble(i)) / 100.0f;
                    }
                    i++;
                } else {
                    return;
                }
            }
        } else {
            LLog.m56856a(6, "Gradient", "native parser error, color and stop must have same size");
        }
    }
}
