package androidx.lifecycle;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: androidx.lifecycle.af */
public class C1182af {

    /* renamed from: a */
    private final HashMap<String, AbstractC1174ac> f3970a = new HashMap<>();

    static {
        Covode.recordClassIndex(1289);
    }

    /* renamed from: a */
    public final void mo3997a() {
        for (AbstractC1174ac acVar : this.f3970a.values()) {
            acVar.clear();
        }
        this.f3970a.clear();
    }

    /* renamed from: a */
    public final AbstractC1174ac mo3996a(String str) {
        return this.f3970a.get(str);
    }

    /* renamed from: a */
    public final void mo3998a(String str, AbstractC1174ac acVar) {
        AbstractC1174ac put = this.f3970a.put(str, acVar);
        if (put != null) {
            put.onCleared();
        }
    }
}
