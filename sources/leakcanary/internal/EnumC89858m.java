package leakcanary.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: leakcanary.internal.m */
public enum EnumC89858m {
    LEAKCANARY_LOW("LeakCanary Low Priority", 2),
    LEAKCANARY_RESULT("LeakCanary Result", 3);
    

    /* renamed from: b */
    private final String f203751b;

    /* renamed from: c */
    private final int f203752c;

    public final int getImportance() {
        return this.f203752c;
    }

    public final String getNameStr() {
        return this.f203751b;
    }

    static {
        Covode.recordClassIndex(105955);
    }

    private EnumC89858m(String str, int i) {
        this.f203751b = str;
        this.f203752c = i;
    }
}
