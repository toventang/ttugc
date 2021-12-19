package com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig;
import com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3556a.C63111b;
import com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3558b.C63114a;
import com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3559c.C63120a;
import com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3559c.C63122b;
import com.p2082ss.android.ugc.aweme.playerkit.p3555a.AbstractC63097a;
import com.p2082ss.android.ugc.aweme.playerkit.p3555a.C63102f;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.playerkit.configpickerimpl.a */
public final class C63105a implements AbstractC63097a {

    /* renamed from: a */
    private final C63114a f143420a = new C63114a();

    /* renamed from: b */
    private final C63111b f143421b = new C63111b();

    static {
        Covode.recordClassIndex(73947);
    }

    @Override // com.p2082ss.android.ugc.aweme.playerkit.p3555a.AbstractC63097a
    /* renamed from: a */
    public final <T> List<T> mo101325a(C63102f fVar, Type type) {
        return (List) C63120a.m114060a(new C63113b(this, fVar, type));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized <T> List<T> mo101331b(C63102f fVar, Type type) {
        MethodCollector.m26663i(2015);
        this.f143420a.mo101339a(fVar);
        this.f143421b.f143432a = fVar;
        C63111b bVar = this.f143421b;
        if (bVar.f143434c == null) {
            bVar.mo101337a();
        }
        List<ConditionConfig> a = this.f143420a.mo101338a(bVar.f143434c);
        if (a.size() == 0) {
            MethodCollector.m26664o(2015);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ConditionConfig conditionConfig : a) {
            arrayList.add(C63122b.m114064a(conditionConfig.f143458c, type));
        }
        MethodCollector.m26664o(2015);
        return arrayList;
    }
}
