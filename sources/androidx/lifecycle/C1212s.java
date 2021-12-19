package androidx.lifecycle;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.s */
public final class C1212s {

    /* renamed from: a */
    private Map<String, Integer> f4005a = new HashMap();

    static {
        Covode.recordClassIndex(1319);
    }

    /* renamed from: a */
    public final boolean mo4028a(String str, int i) {
        int i2;
        boolean z;
        Integer num = this.f4005a.get(str);
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        if ((i2 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f4005a.put(str, Integer.valueOf(i | i2));
        if (!z) {
            return true;
        }
        return false;
    }
}
