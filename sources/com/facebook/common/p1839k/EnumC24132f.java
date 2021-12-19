package com.facebook.common.p1839k;

import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.common.k.f */
public enum EnumC24132f {
    YES,
    NO,
    UNSET;

    public final boolean isSet() {
        if (this != UNSET) {
            return true;
        }
        return false;
    }

    public final int getDbValue() {
        int i = C241331.f57080a[ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 3;
            }
        }
        return i2;
    }

    /* renamed from: com.facebook.common.k.f$1 */
    static /* synthetic */ class C241331 {

        /* renamed from: a */
        static final /* synthetic */ int[] f57080a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 28261(0x6e65, float:3.9602E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.common.k.f[] r0 = com.facebook.common.p1839k.EnumC24132f.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.common.p1839k.EnumC24132f.C241331.f57080a = r2
                com.facebook.common.k.f r0 = com.facebook.common.p1839k.EnumC24132f.YES     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.common.p1839k.EnumC24132f.C241331.f57080a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.common.k.f r0 = com.facebook.common.p1839k.EnumC24132f.NO     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.common.p1839k.EnumC24132f.C241331.f57080a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.facebook.common.k.f r0 = com.facebook.common.p1839k.EnumC24132f.UNSET     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.p1839k.EnumC24132f.C241331.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(28260);
    }

    public final boolean asBoolean() {
        int i = C241331.f57080a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i != 3) {
            throw new IllegalStateException("Unrecognized TriState value: ".concat(String.valueOf(this)));
        }
        throw new IllegalStateException("No boolean equivalent for UNSET");
    }

    public final Boolean asBooleanObject() {
        int i = C241331.f57080a[ordinal()];
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i == 2) {
            return Boolean.FALSE;
        }
        if (i == 3) {
            return null;
        }
        throw new IllegalStateException("Unrecognized TriState value: ".concat(String.valueOf(this)));
    }

    public static EnumC24132f valueOf(boolean z) {
        if (z) {
            return YES;
        }
        return NO;
    }

    public static EnumC24132f fromDbValue(int i) {
        if (i == 1) {
            return YES;
        }
        if (i != 2) {
            return UNSET;
        }
        return NO;
    }

    public static EnumC24132f valueOf(Boolean bool) {
        if (bool != null) {
            return valueOf(bool.booleanValue());
        }
        return UNSET;
    }

    public final boolean asBoolean(boolean z) {
        int i = C241331.f57080a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            return z;
        }
        throw new IllegalStateException("Unrecognized TriState value: ".concat(String.valueOf(this)));
    }
}
