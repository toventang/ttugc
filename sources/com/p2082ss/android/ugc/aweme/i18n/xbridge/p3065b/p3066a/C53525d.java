package com.p2082ss.android.ugc.aweme.i18n.xbridge.p3065b.p3066a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.C16238z;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostFrameworkDepend;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import com.p2082ss.android.ugc.aweme.crossplatform.p2709c.C40603d;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3068d.C53582d;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.d */
public final class C53525d implements IHostFrameworkDepend {
    static {
        Covode.recordClassIndex(63101);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostFrameworkDepend
    public final String getContainerID(C18742c cVar) {
        String str;
        C16238z a;
        AbstractC16208i a2 = C53582d.m98793a(cVar);
        if (a2 != null && (a = a2.mo25762a()) != null) {
            return a.f39033a;
        }
        C40603d a3 = C40603d.C40604a.m81964a();
        if (!(!a3.f95022b.isEmpty()) || (str = (String) C89070n.m154586h((List) a3.f95022b)) == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostFrameworkDepend
    public final void addObserverEvent(C18742c cVar, String str, List<String> list, List<? extends JSONObject> list2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        AbstractC16208i a = C53582d.m98793a(cVar);
        if (a != null) {
            a.mo25765a(str, list, list2);
        }
    }
}
