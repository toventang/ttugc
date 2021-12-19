package com.lynx.tasm.image.p2061b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.image.AbstractC28814d;
import com.lynx.tasm.image.C28794b;

/* renamed from: com.lynx.tasm.image.b.e */
public final class C28801e extends AbstractC28814d {
    static {
        Covode.recordClassIndex(34908);
    }

    public C28801e(AbstractC28814d dVar) {
        super(dVar);
    }

    @Override // com.lynx.tasm.image.AbstractC28814d
    /* renamed from: b */
    public final void mo49912b(Canvas canvas, Bitmap bitmap, C28794b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr = bVar.f67938k;
        if (iArr == null) {
            i = bVar.f67934g;
            i2 = bVar.f67935h;
            i3 = bVar.f67936i;
            i4 = bVar.f67937j;
        } else {
            i = bVar.f67934g + iArr[0];
            i2 = bVar.f67935h + iArr[1];
            i3 = bVar.f67936i + iArr[2];
            i4 = iArr[3] + bVar.f67937j;
        }
        bVar.f67939l = Math.max(i, 0);
        bVar.f67940m = Math.max(i2, 0);
        bVar.f67941n = Math.max(i3, 0);
        bVar.f67942o = Math.max(i4, 0);
        super.mo49912b(canvas, bitmap, bVar);
    }
}
