package com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1375d.p1376a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19180a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19188h;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.a.a */
public final class C19141a implements AbstractC19180a {
    static {
        Covode.recordClassIndex(21904);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19180a
    /* renamed from: b */
    public final AbstractC19186f mo30505b(AbstractC19188h hVar) {
        List<AbstractC19186f> b;
        if (hVar == null || (b = hVar.mo30539b()) == null) {
            return null;
        }
        return (AbstractC19186f) C89070n.m154561b((List) b, hVar.mo30540c());
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19180a
    /* renamed from: a */
    public final AbstractC19186f mo30504a(AbstractC19188h hVar) {
        int c;
        if (hVar == null) {
            return null;
        }
        if (hVar.mo30540c() - 1 < 0) {
            c = C89070n.m154517a((List) hVar.mo30539b());
        } else {
            c = hVar.mo30540c() - 1;
        }
        return (AbstractC19186f) C89070n.m154561b((List) hVar.mo30539b(), c);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19180a
    /* renamed from: c */
    public final AbstractC19186f mo30506c(AbstractC19188h hVar) {
        int c;
        if (hVar == null) {
            return null;
        }
        if (hVar.mo30540c() + 1 > C89070n.m154517a((List) hVar.mo30539b())) {
            c = 0;
        } else {
            c = hVar.mo30540c() + 1;
        }
        return (AbstractC19186f) C89070n.m154561b((List) hVar.mo30539b(), c);
    }
}
