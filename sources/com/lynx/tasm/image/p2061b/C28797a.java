package com.lynx.tasm.image.p2061b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.image.AbstractC28814d;
import com.lynx.tasm.image.C28794b;
import com.lynx.tasm.utils.BlurUtils;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.tasm.image.b.a */
public final class C28797a extends AbstractC28814d {
    static {
        Covode.recordClassIndex(34904);
    }

    C28797a(AbstractC28814d dVar) {
        super(dVar);
    }

    @Override // com.lynx.tasm.image.AbstractC28814d
    /* renamed from: b */
    public final void mo49912b(Canvas canvas, Bitmap bitmap, C28794b bVar) {
        int i;
        if (this.f68005a == 1 && (i = bVar.f67930c) > 0) {
            BlurUtils.iterativeBoxBlur(bitmap, i);
        }
        super.mo49912b(canvas, bitmap, bVar);
    }
}
