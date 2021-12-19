package com.p2082ss.android.ugc.aweme.publish.p3624h;

import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.publish.AbstractC65608f;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.h.i */
final class C65655i implements AbstractC65608f {
    static {
        Covode.recordClassIndex(77146);
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65608f
    /* renamed from: a */
    public final void mo104777a(AbstractC89171a<Boolean> aVar, String str, String str2, Map<String, String> map) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(map, "");
        if (aVar.invoke().booleanValue()) {
            C63244g.m114602a();
            C22708a.m42801a("[" + str + "][" + str2 + ']', map);
            C84911q.m145922a(str, "publish illegal state: message=[" + str + "][" + str2 + "], data=" + map);
        }
    }
}
