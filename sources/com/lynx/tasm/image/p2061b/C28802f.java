package com.lynx.tasm.image.p2061b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.tasm.image.AbstractC28814d;
import com.lynx.tasm.image.C28794b;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.tasm.image.b.f */
public final class C28802f extends AbstractC28814d {

    /* renamed from: b */
    private static final PorterDuffXfermode f67958b = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);

    /* renamed from: c */
    private final Paint f67959c = new Paint(1);

    /* renamed from: d */
    private final Path f67960d = new Path();

    /* renamed from: e */
    private float[] f67961e;

    static {
        Covode.recordClassIndex(34909);
    }

    public C28802f(AbstractC28814d dVar) {
        super(dVar);
    }

    @Override // com.lynx.tasm.image.AbstractC28814d
    /* renamed from: b */
    public final void mo49912b(Canvas canvas, Bitmap bitmap, C28794b bVar) {
        int i;
        float[] fArr = bVar.f67928a;
        int i2 = bVar.f67931d;
        int i3 = bVar.f67932e;
        if (fArr != null) {
            this.f67959c.setXfermode(null);
            i = canvas.saveLayer(new RectF(0.0f, 0.0f, (float) i2, (float) i3), this.f67959c, 31);
        } else {
            i = 0;
        }
        super.mo49912b(canvas, bitmap, bVar);
        if (fArr != null) {
            int i4 = bVar.f67939l;
            int i5 = bVar.f67940m;
            int i6 = bVar.f67941n;
            int i7 = bVar.f67942o;
            m57651a(i4, i5, i6, i7, fArr);
            this.f67960d.reset();
            this.f67960d.setFillType(Path.FillType.INVERSE_EVEN_ODD);
            this.f67960d.addRoundRect(new RectF((float) i4, (float) i5, (float) (i2 - i6), (float) (i3 - i7)), this.f67961e, Path.Direction.CW);
            this.f67959c.setXfermode(f67958b);
            canvas.drawPath(this.f67960d, this.f67959c);
            canvas.restoreToCount(i);
        }
    }

    /* renamed from: a */
    private void m57651a(int i, int i2, int i3, int i4, float[] fArr) {
        int i5;
        if (this.f67961e == null) {
            this.f67961e = new float[8];
        }
        for (int i6 = 0; i6 < fArr.length; i6++) {
            switch (i6) {
                case 0:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    i5 = i;
                    break;
                case 1:
                case 3:
                    i5 = i2;
                    break;
                case 2:
                case 4:
                    i5 = i3;
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    i5 = i4;
                    break;
                default:
                    i5 = 0;
                    break;
            }
            this.f67961e[i6] = Math.max(fArr[i6] - ((float) i5), 0.0f);
        }
    }
}
