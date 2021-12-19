package com.lynx.tasm.behavior.p2052ui.utils;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.behavior.shadow.C28542g;
import com.lynx.tasm.utils.C28916c;

/* renamed from: com.lynx.tasm.behavior.ui.utils.b */
public class C28683b {

    /* renamed from: a */
    public static int f67643a = 1;

    /* renamed from: b */
    public static int f67644b = 2;

    /* renamed from: c */
    C28684a[] f67645c;

    /* renamed from: d */
    public float[] f67646d;

    /* renamed from: e */
    private float f67647e;

    /* renamed from: f */
    private float f67648f;

    /* renamed from: g */
    private int f67649g;

    static {
        Covode.recordClassIndex(34759);
    }

    /* renamed from: com.lynx.tasm.behavior.ui.utils.b$a */
    public static class C28684a {

        /* renamed from: a */
        public float f67650a = 1.0E21f;

        /* renamed from: b */
        public float f67651b = 1.0E21f;

        /* renamed from: c */
        public EnumC28686c f67652c;

        /* renamed from: d */
        public EnumC28686c f67653d;

        static {
            Covode.recordClassIndex(34760);
        }

        public C28684a() {
            EnumC28686c cVar = EnumC28686c.NUMBER;
            this.f67653d = cVar;
            this.f67652c = cVar;
        }

        /* renamed from: a */
        public static C28684a m57430a(ReadableArray readableArray, int i) {
            EnumC28686c cVar;
            EnumC28686c cVar2;
            C28684a aVar = new C28684a();
            aVar.f67650a = (float) readableArray.getDouble(i);
            if (readableArray.getInt(i + 1) == 1) {
                cVar = EnumC28686c.PERCENTAGE;
            } else {
                cVar = EnumC28686c.NUMBER;
            }
            aVar.f67652c = cVar;
            aVar.f67651b = (float) readableArray.getDouble(i + 2);
            if (readableArray.getInt(i + 3) == 1) {
                cVar2 = EnumC28686c.PERCENTAGE;
            } else {
                cVar2 = EnumC28686c.NUMBER;
            }
            aVar.f67653d = cVar2;
            return aVar;
        }
    }

    /* renamed from: com.lynx.tasm.behavior.ui.utils.b$c */
    public enum EnumC28686c {
        NUMBER,
        PERCENTAGE;

        static {
            Covode.recordClassIndex(34762);
        }
    }

    /* renamed from: b */
    public final boolean mo49771b() {
        C28684a[] aVarArr = this.f67645c;
        if (aVarArr != null) {
            for (C28684a aVar : aVarArr) {
                if (aVar != null) {
                    if (!C28542g.m57093a(aVar.f67650a) && aVar.f67650a > 0.0f) {
                        return true;
                    }
                    if (!C28542g.m57093a(aVar.f67651b) && aVar.f67651b > 0.0f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: com.lynx.tasm.behavior.ui.utils.b$b */
    public enum EnumC28685b {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END;

        static {
            Covode.recordClassIndex(34761);
        }
    }

    /* renamed from: c */
    private void m57424c() {
        int i;
        int i2;
        boolean z = true;
        float[] a = m57423a(true, 1.0E21f);
        int[] iArr = {2, 3, 0, 1, 6, 7, 4, 5};
        float[] fArr = this.f67646d;
        int i3 = this.f67649g;
        int i4 = 0;
        if ((f67643a & i3) == 0) {
            z = false;
        }
        if ((i3 & f67644b) != 0) {
            int i5 = 0;
            do {
                if (C28542g.m57093a(a[i5])) {
                    a[i5] = fArr[i5];
                }
                i5++;
            } while (i5 < 8);
            do {
                if (z) {
                    i2 = iArr[i4];
                } else {
                    i2 = i4;
                }
                fArr[i4] = a[i2];
                i4++;
            } while (i4 < 8);
            return;
        }
        do {
            if (z) {
                i = iArr[i4];
            } else {
                i = i4;
            }
            float f = a[i];
            if (!C28542g.m57093a(f)) {
                fArr[i4] = f;
            }
            i4++;
        } while (i4 < 8);
    }

    /* renamed from: a */
    public final float[] mo49770a() {
        float[] fArr = this.f67646d;
        if (fArr != null) {
            return fArr;
        }
        this.f67646d = m57423a(false, 0.0f);
        int i = Build.VERSION.SDK_INT;
        m57424c();
        m57425d();
        return this.f67646d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r7 < 1.0f) goto L_0x002e;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m57425d() {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.utils.C28683b.m57425d():void");
    }

    /* renamed from: a */
    public final boolean mo49769a(int i) {
        if (this.f67649g != i) {
            this.f67649g = i;
            this.f67646d = null;
            return true;
        } else if (this.f67646d == null) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo49768a(float f, float f2) {
        if (f < 0.0f || C28542g.m57093a(f)) {
            f = 0.0f;
        }
        if (f2 < 0.0f || C28542g.m57093a(f2)) {
            f2 = 0.0f;
        }
        if (!C28916c.m57920a(f, this.f67647e) || !C28916c.m57920a(f2, this.f67648f)) {
            this.f67647e = f;
            this.f67648f = f2;
            this.f67646d = null;
            return true;
        } else if (this.f67646d == null) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private float[] m57423a(boolean z, float f) {
        float[] fArr = new float[8];
        int i = 0;
        if (this.f67645c == null) {
            do {
                fArr[i] = f;
                i++;
            } while (i < 8);
            return fArr;
        }
        EnumC28685b[] bVarArr = z ? new EnumC28685b[]{EnumC28685b.TOP_START, EnumC28685b.TOP_END, EnumC28685b.BOTTOM_END, EnumC28685b.BOTTOM_START} : new EnumC28685b[]{EnumC28685b.TOP_LEFT, EnumC28685b.TOP_RIGHT, EnumC28685b.BOTTOM_RIGHT, EnumC28685b.BOTTOM_LEFT};
        do {
            C28684a aVar = this.f67645c[bVarArr[i].ordinal()];
            int i2 = i * 2;
            int i3 = i2 + 1;
            if (aVar == null) {
                fArr[i3] = f;
                fArr[i2] = f;
            } else {
                if (C28542g.m57093a(aVar.f67650a)) {
                    fArr[i2] = f;
                } else if (aVar.f67652c == EnumC28686c.PERCENTAGE) {
                    fArr[i2] = aVar.f67650a * this.f67647e * 0.01f;
                } else {
                    fArr[i2] = aVar.f67650a;
                }
                if (C28542g.m57093a(aVar.f67651b)) {
                    fArr[i3] = f;
                } else if (aVar.f67653d == EnumC28686c.PERCENTAGE) {
                    fArr[i3] = aVar.f67651b * this.f67648f * 0.01f;
                } else {
                    fArr[i3] = aVar.f67651b;
                }
            }
            i++;
        } while (i < 4);
        return fArr;
    }
}
