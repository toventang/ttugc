package android.p003ss.com.vboost;

import com.bytedance.covode.number.Covode;

/* renamed from: android.ss.com.vboost.b */
public enum EnumC0009b {
    SILVER(1),
    GOLD(2),
    SUPER(3);
    

    /* renamed from: a */
    private int f40a;

    public final int getIndex() {
        return this.f40a;
    }

    static {
        Covode.recordClassIndex(12);
    }

    public static EnumC0009b valueOf(int i) {
        if (i == 1) {
            return SILVER;
        }
        if (i == 2) {
            return GOLD;
        }
        if (i != 3) {
            return null;
        }
        return SUPER;
    }

    private EnumC0009b(int i) {
        this.f40a = i;
    }
}
