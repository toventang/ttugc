package com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3556a.p3557a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3559c.C63120a;
import com.p2082ss.android.ugc.aweme.playerkit.p3555a.AbstractC63101e;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.playerkit.configpickerimpl.a.a.b */
final /* synthetic */ class C63108b implements C63120a.AbstractC63121a {

    /* renamed from: a */
    private final C63107a f143426a;

    /* renamed from: b */
    private final Map f143427b;

    /* renamed from: c */
    private final AbstractC63101e f143428c;

    static {
        Covode.recordClassIndex(73950);
    }

    C63108b(C63107a aVar, Map map, AbstractC63101e eVar) {
        this.f143426a = aVar;
        this.f143427b = map;
        this.f143428c = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3559c.C63120a.AbstractC63121a
    /* renamed from: a */
    public final Object mo101335a() {
        Map map = this.f143427b;
        AbstractC63101e eVar = this.f143428c;
        return map.put(eVar.mo101329a(), eVar.mo101330b());
    }
}
