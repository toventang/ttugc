package com.lynx.tasm.behavior.p2052ui.utils;

import android.graphics.DashPathEffect;
import android.graphics.PathEffect;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.behavior.ui.utils.c */
public enum EnumC28687c {
    SOLID,
    DASHED,
    DOTTED,
    DOUBLE,
    GROOVE,
    RIDGE,
    INSET,
    OUTSET,
    HIDDEN,
    NONE;

    /* renamed from: a */
    private static int m57431a(int i) {
        return (i & -16777216) | ((16711422 & i) >> 1);
    }

    /* renamed from: b */
    private static boolean m57433b(int i) {
        return (i & 15790320) == 0;
    }

    public final boolean isSolidDashedOrDotted() {
        int i = C286881.f67657a[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.utils.c$1 */
    public static /* synthetic */ class C286881 {

        /* renamed from: a */
        static final /* synthetic */ int[] f67657a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.utils.EnumC28687c.C286881.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(34763);
    }

    public static EnumC28687c parse(int i) {
        if (i < 0 || i > NONE.ordinal()) {
            return null;
        }
        return values()[i];
    }

    public final PathEffect getPathEffect(float f) {
        int i = C286881.f67657a[ordinal()];
        if (i == 1) {
            float f2 = f * 3.0f;
            return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
        } else if (i != 2) {
            return null;
        } else {
            return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
        }
    }

    public final PathEffect getPathEffectAutoAdjust(float f, float f2) {
        int i;
        if (this != DASHED && this != DOTTED) {
            return null;
        }
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (this == DOTTED) {
            i = 2;
        } else {
            i = 6;
        }
        int i2 = (((int) (((f2 / ((f * ((float) i)) * 0.5f)) - 0.5f) * 0.5f)) * 2) + 1;
        if (i2 <= 1) {
            return null;
        }
        float f3 = f2 / ((float) i2);
        return new DashPathEffect(new float[]{f3, f3}, 0.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r2 == 1) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r2 == 1) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        r0 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r2 == 1) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        r0 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r2 == 1) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r0 = r15;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m57432a(android.graphics.Canvas r9, android.graphics.Paint r10, int r11, float r12, float r13, int r14, int r15, float r16, float r17, float r18, float r19) {
        /*
            r0 = 0
            r8 = r10
            r8.setPathEffect(r0)
            r8.setStrokeWidth(r12)
            r0 = -1
            r2 = -1
        L_0x000a:
            r4 = 1
            if (r2 > r4) goto L_0x0046
            r0 = 0
            r1 = 0
            if (r11 == 0) goto L_0x0039
            if (r11 == r4) goto L_0x002c
            r3 = 2
            if (r11 == r3) goto L_0x003f
            r3 = 3
            if (r11 == r3) goto L_0x0032
        L_0x0019:
            r3 = 0
        L_0x001a:
            r8.setColor(r0)
            float r4 = r16 + r1
            float r5 = r17 + r3
            float r6 = r18 + r1
            float r7 = r19 + r3
            r3 = r9
            r3.drawLine(r4, r5, r6, r7, r8)
            int r2 = r2 + 2
            goto L_0x000a
        L_0x002c:
            float r3 = (float) r2
            float r3 = r3 * r13
            if (r2 != r4) goto L_0x0037
        L_0x0030:
            r0 = r14
            goto L_0x001a
        L_0x0032:
            float r3 = -r13
            float r0 = (float) r2
            float r3 = r3 * r0
            if (r2 != r4) goto L_0x0030
        L_0x0037:
            r0 = r15
            goto L_0x001a
        L_0x0039:
            float r1 = (float) r2
            float r1 = r1 * r13
            if (r2 != r4) goto L_0x0044
        L_0x003d:
            r0 = r14
            goto L_0x0019
        L_0x003f:
            float r1 = -r13
            float r0 = (float) r2
            float r1 = r1 * r0
            if (r2 != r4) goto L_0x003d
        L_0x0044:
            r0 = r15
            goto L_0x0019
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.utils.EnumC28687c.m57432a(android.graphics.Canvas, android.graphics.Paint, int, float, float, int, int, float, float, float, float):void");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0069, code lost:
        if (r23 != 2) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0055, code lost:
        if (r23 != 0) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void strokeBorderLine(android.graphics.Canvas r21, android.graphics.Paint r22, int r23, float r24, int r25, float r26, float r27, float r28, float r29, float r30, float r31) {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.utils.EnumC28687c.strokeBorderLine(android.graphics.Canvas, android.graphics.Paint, int, float, int, float, float, float, float, float, float):void");
    }
}
