package com.p2082ss.android.ugc.aweme.tools.draft.viewmodel;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.tools.draft.p4101b.C78188b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.viewmodel.a */
public final class C78467a {

    /* renamed from: a */
    public final Map<String, C43223c> f176343a = new HashMap();

    static {
        Covode.recordClassIndex(91596);
    }

    /* renamed from: a */
    public final void mo122386a() {
        this.f176343a.clear();
    }

    /* renamed from: b */
    public final void mo122387b(String str) {
        C89219l.m154721d(str, "");
        this.f176343a.remove(str);
    }

    /* renamed from: a */
    public final C43223c mo122385a(String str) {
        C89219l.m154721d(str, "");
        C84911q.m145921a("AwemeDraftCaches : query -> creationId = ".concat(String.valueOf(str)));
        C43223c cVar = this.f176343a.get(str);
        if (cVar != null) {
            C84911q.m145921a("AwemeDraftCaches : query -> draft from caches");
        } else {
            cVar = C78188b.m136672a(str);
            if (cVar != null) {
                this.f176343a.put(str, cVar);
                C84911q.m145921a("AwemeDraftCaches : query -> draft from db,creationId = " + cVar.mo73726r());
            }
        }
        return cVar;
    }
}
