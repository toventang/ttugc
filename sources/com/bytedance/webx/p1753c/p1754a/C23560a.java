package com.bytedance.webx.p1753c.p1754a;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.webx.c.a.a */
public final class C23560a implements AbstractC23561b {

    /* renamed from: a */
    protected static final Bitmap.Config f55811a = Bitmap.Config.ARGB_8888;

    /* renamed from: b */
    protected static Bitmap f55812b;

    /* renamed from: c */
    public float f55813c = 0.1f;

    static {
        Covode.recordClassIndex(27658);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        if (r4 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r4 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r2 = new android.graphics.Canvas(r4);
        r0 = r6.f55813c;
        r2.scale(r0, r0);
        r7.computeScroll();
        r2.translate((float) (-r7.getScrollX()), (float) (-r7.getScrollY()));
        r7.draw(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (r5 == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        r0 = com.bytedance.webx.p1753c.p1754a.C23560a.f55812b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        if (r0 == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007a, code lost:
        if (r0.isRecycled() != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007c, code lost:
        com.bytedance.webx.p1753c.p1754a.C23560a.f55812b.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        com.bytedance.webx.p1753c.p1754a.C23560a.f55812b = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0083, code lost:
        r3.f55814a = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        return r3;
     */
    @Override // com.bytedance.webx.p1753c.p1754a.AbstractC23561b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.webx.p1753c.p1754a.C23562c mo38640a(android.view.View r7) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1753c.p1754a.C23560a.mo38640a(android.view.View):com.bytedance.webx.c.a.c");
    }

    /* renamed from: a */
    private static Bitmap m44307a(View view, int i, int i2) {
        Bitmap bitmap;
        MethodCollector.m26663i(4978);
        try {
            int i3 = Build.VERSION.SDK_INT;
            bitmap = Bitmap.createBitmap(view.getContext().getResources().getDisplayMetrics(), i, i2, f55811a);
        } catch (OutOfMemoryError unused) {
            bitmap = null;
        }
        MethodCollector.m26664o(4978);
        return bitmap;
    }
}
