package com.lynx.tasm.image.p2061b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.bytedance.covode.number.Covode;
import com.lynx.p2031a.AbstractC28181a;
import com.lynx.p2031a.C28192f;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.image.AbstractC28814d;
import com.lynx.tasm.image.C28794b;
import com.lynx.tasm.utils.BlurUtils;

/* renamed from: com.lynx.tasm.image.b.b */
public final class C28798b extends AbstractC28814d {

    /* renamed from: b */
    private final Paint f67950b;

    /* renamed from: c */
    private final Matrix f67951c = new Matrix();

    /* renamed from: d */
    private AbstractC28181a f67952d;

    /* renamed from: e */
    private Bitmap f67953e;

    /* renamed from: f */
    private Bitmap f67954f;

    static {
        Covode.recordClassIndex(34905);
    }

    @Override // com.lynx.tasm.image.AbstractC28814d
    /* renamed from: c */
    public final void mo49913c() {
        AbstractC28181a aVar = this.f67952d;
        if (aVar != null) {
            aVar.recycle(this.f67953e);
            this.f67952d.recycle(this.f67954f);
        }
        super.mo49913c();
    }

    public C28798b(AbstractC28814d dVar) {
        super(dVar);
        Paint paint = new Paint();
        this.f67950b = paint;
        paint.setFlags(3);
    }

    @Override // com.lynx.tasm.image.AbstractC28814d
    /* renamed from: b */
    public final void mo49912b(Canvas canvas, Bitmap bitmap, C28794b bVar) {
        C28794b.C28795a aVar = bVar.f67943p;
        if (aVar == null) {
            super.mo49912b(canvas, bitmap, bVar);
            return;
        }
        int i = bVar.f67931d;
        int i2 = bVar.f67932e;
        int i3 = bVar.f67939l;
        int i4 = bVar.f67940m;
        int i5 = (i - i3) - bVar.f67941n;
        int i6 = (i2 - i4) - bVar.f67942o;
        if (i5 <= 0 || i6 <= 0) {
            super.mo49912b(canvas, bitmap, bVar);
            return;
        }
        Bitmap a = m57644a(this.f67953e, i5, i6, Bitmap.Config.ARGB_8888);
        this.f67953e = a;
        if (a == null) {
            super.mo49912b(canvas, bitmap, bVar);
            LLog.m56856a(6, "FilterImage", "create soft bitmap failed!");
            return;
        }
        a.eraseColor(0);
        Canvas canvas2 = new Canvas(this.f67953e);
        bVar.f67931d = i5;
        bVar.f67932e = i6;
        super.mo49912b(canvas2, bitmap, bVar);
        bVar.f67931d = i;
        bVar.f67932e = i2;
        Bitmap a2 = m57644a(this.f67954f, Math.max(i / 2, 1), Math.max(i2 / 2, 1), Bitmap.Config.ARGB_8888);
        this.f67954f = a2;
        if (a2 == null) {
            canvas.drawBitmap(this.f67953e, (float) i3, (float) i4, (Paint) null);
            LLog.m56862d("FilterImage", "create shadow bitmap failed!");
            return;
        }
        a2.eraseColor(0);
        Canvas canvas3 = new Canvas(this.f67954f);
        this.f67950b.setColorFilter(new PorterDuffColorFilter(aVar.f67947c, PorterDuff.Mode.SRC_IN));
        this.f67951c.reset();
        this.f67951c.setScale(0.5f, 0.5f);
        this.f67951c.preTranslate((float) (aVar.f67945a + i3), (float) (aVar.f67946b + i4));
        canvas3.drawBitmap(this.f67953e, this.f67951c, this.f67950b);
        BlurUtils.iterativeBoxBlur(this.f67954f, aVar.f67948d / 2);
        this.f67951c.reset();
        this.f67951c.setScale(2.0f, 2.0f);
        canvas.drawBitmap(this.f67954f, this.f67951c, null);
        canvas.drawBitmap(this.f67953e, (float) i3, (float) i4, (Paint) null);
    }

    /* renamed from: a */
    private Bitmap m57644a(Bitmap bitmap, int i, int i2, Bitmap.Config config) {
        if (bitmap != null && bitmap.getWidth() >= i && bitmap.getHeight() >= i2) {
            return bitmap;
        }
        if (this.f67952d == null) {
            this.f67952d = C28192f.m56295b();
        }
        this.f67952d.recycle(bitmap);
        return this.f67952d.require(i, i2, config);
    }
}
