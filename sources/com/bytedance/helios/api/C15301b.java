package com.bytedance.helios.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.config.AbstractC15331b;
import com.bytedance.helios.api.config.C15330a;
import com.bytedance.helios.api.config.RuleInfo;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.api.b */
public final class C15301b extends AbstractC15295a {

    /* renamed from: a */
    private final boolean f37317a;

    static {
        Covode.recordClassIndex(17531);
    }

    @Override // com.bytedance.helios.api.AbstractC15295a
    public final void init(AbstractC15331b bVar, C15330a aVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(aVar, "");
    }

    @Override // com.bytedance.helios.api.AbstractC15295a
    public final void recordRegionEvent(Map<String, Object> map) {
        C89219l.m154719c(map, "");
    }

    @Override // com.bytedance.helios.api.AbstractC15295a
    public final void ruleChangeNotify(RuleInfo ruleInfo) {
        C89219l.m154719c(ruleInfo, "");
    }

    @Override // com.bytedance.helios.api.AbstractC15295a
    public final void ruleChangeNotify(String str, boolean z) {
        C89219l.m154719c(str, "");
    }

    @Override // com.bytedance.helios.api.AbstractC15295a
    public final boolean isEnabled() {
        return this.f37317a;
    }
}
