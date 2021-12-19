package com.lynx.tasm.image.p2061b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28588a;
import com.lynx.tasm.image.AbstractC28814d;
import com.lynx.tasm.image.C28794b;
import com.lynx.tasm.image.p2060a.C28793a;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.tasm.image.b.d */
public final class C28800d extends AbstractC28814d {

    /* renamed from: b */
    private static final PorterDuffXfermode f67955b = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);

    /* renamed from: c */
    private final Paint f67956c = new Paint(1);

    /* renamed from: d */
    private final Rect f67957d = new Rect();

    static {
        Covode.recordClassIndex(34907);
    }

    C28800d(AbstractC28814d dVar) {
        super(dVar);
    }

    @Override // com.lynx.tasm.image.AbstractC28814d
    /* renamed from: b */
    public final void mo49912b(Canvas canvas, Bitmap bitmap, C28794b bVar) {
        C28793a aVar = bVar.f67944q;
        if (aVar == null) {
            super.mo49912b(canvas, bitmap, bVar);
            return;
        }
        int i = 0;
        AbstractC28588a aVar2 = aVar.f67927a;
        int i2 = bVar.f67931d;
        int i3 = bVar.f67932e;
        if (aVar2 != null) {
            i = canvas.saveLayer(0.0f, 0.0f, (float) i2, (float) i3, null, 31);
        }
        super.mo49912b(canvas, bitmap, bVar);
        if (aVar2 != null) {
            this.f67957d.right = i2;
            this.f67957d.bottom = i3;
            aVar2.setBounds(this.f67957d);
            Shader shader = aVar2.f67301a;
            this.f67956c.setXfermode(f67955b);
            this.f67956c.setShader(shader);
            canvas.drawRect(this.f67957d, this.f67956c);
            canvas.restoreToCount(i);
        }
    }
}
