package com.bytedance.geckox.settings.p1033a;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.geckox.settings.a.a */
public final class C15008a {

    /* renamed from: a */
    public List<AbstractC15009b> f36668a;

    static {
        Covode.recordClassIndex(17153);
    }

    /* renamed from: a */
    public final void mo24247a() {
        List<AbstractC15009b> list = this.f36668a;
        if (list != null && !list.isEmpty()) {
            C14957a.m27543a("global settings notify finish");
            Iterator<AbstractC15009b> it = this.f36668a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: a */
    public final void mo24248a(GlobalConfigSettings globalConfigSettings) {
        List<AbstractC15009b> list = this.f36668a;
        if (!(list == null || list.isEmpty())) {
            C14957a.m27543a("global settings notify update");
            for (AbstractC15009b bVar : this.f36668a) {
                bVar.mo24041a(globalConfigSettings);
            }
        }
    }
}
