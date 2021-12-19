package androidx.work;

import androidx.work.C1597e;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger extends AbstractC1599f {
    static {
        Covode.recordClassIndex(1738);
    }

    @Override // androidx.work.AbstractC1599f
    /* renamed from: a */
    public final C1597e mo5334a(List<C1597e> list) {
        C1597e.C1598a aVar = new C1597e.C1598a();
        HashMap hashMap = new HashMap();
        for (C1597e eVar : list) {
            hashMap.putAll(Collections.unmodifiableMap(eVar.f5225b));
        }
        aVar.mo5360a(hashMap);
        return aVar.mo5361a();
    }
}
