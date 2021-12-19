package com.bytedance.p1399im.core.p1407c;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1404a.AbstractC19481b;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.im.core.c.h */
public final class C19516h {

    /* renamed from: a */
    public static final C19516h f46326a = new C19516h();

    /* renamed from: b */
    private static HashMap<Long, C19515g> f46327b = new HashMap<>();

    private C19516h() {
    }

    static {
        Covode.recordClassIndex(22360);
    }

    /* renamed from: a */
    public static C19515g m36458a(long j) {
        C19515g gVar = new C19515g(j);
        m36459a(gVar);
        return gVar;
    }

    /* renamed from: b */
    public static C19515g m36461b(long j) {
        return f46327b.get(Long.valueOf(j));
    }

    /* renamed from: a */
    private static void m36459a(C19515g gVar) {
        C89219l.m154719c(gVar, "");
        f46327b.put(Long.valueOf(gVar.f46325j), gVar);
    }

    /* renamed from: a */
    public static void m36460a(C19538ai aiVar) {
        C89219l.m154719c(aiVar, "");
        C19515g b = m36461b(aiVar.getMsgId());
        if (b == null) {
            b = m36458a(aiVar.getMsgId());
        }
        C19517i a = C19517i.m36463a().mo31179a("imsdk_recieve_msg").mo31180a("conversation_id", aiVar.getConversationId()).mo31180a("msg_uuid", aiVar.getUuid()).mo31180a("result", 1).mo31180a("msg_type", Integer.valueOf(aiVar.getMsgType())).mo31180a("is_background", Boolean.valueOf(C19512f.f46310a)).mo31180a("is_connected", Boolean.valueOf(C19512f.f46310a)).mo31180a("is_background", Boolean.valueOf(C19512f.f46310a));
        C19483d a2 = C19483d.m36365a();
        C89219l.m154709a((Object) a2, "");
        AbstractC19481b bVar = a2.f46157b;
        C89219l.m154709a((Object) bVar, "");
        a.mo31180a("net_connected", Boolean.valueOf(bVar.mo27964e())).mo31180a("recieve_cost_time", b.f46319d).mo31180a("recieve_start_time", b.f46316a).mo31180a("recieve_end_time", b.f46318c).mo31180a("send_start_time", b.f46317b).mo31180a("pull_msg_reaseon", b.f46322g).mo31180a("is_ws", Integer.valueOf(b.f46323h ? 1 : 0)).mo31180a("logid", b.f46324i).mo31181b();
    }

    /* renamed from: b */
    public static void m36462b(C19538ai aiVar) {
        C89219l.m154719c(aiVar, "");
        C19515g b = m36461b(aiVar.getMsgId());
        if (b == null) {
            b = m36458a(aiVar.getMsgId());
        }
        C19517i a = C19517i.m36463a().mo31179a("imsdk_load_msg").mo31180a("conversation_id", aiVar.getConversationId()).mo31180a("msg_uuid", aiVar.getUuid()).mo31180a("result", 1).mo31180a("msg_type", Integer.valueOf(aiVar.getMsgType())).mo31180a("is_background", Boolean.valueOf(C19512f.f46310a)).mo31180a("is_connected", Boolean.valueOf(C19512f.f46310a)).mo31180a("is_background", Boolean.valueOf(C19512f.f46310a));
        C19483d a2 = C19483d.m36365a();
        C89219l.m154709a((Object) a2, "");
        AbstractC19481b bVar = a2.f46157b;
        C89219l.m154709a((Object) bVar, "");
        a.mo31180a("net_connected", Boolean.valueOf(bVar.mo27964e())).mo31180a("load_cost_time", b.f46320e).mo31180a("recieve_end_time", b.f46318c).mo31180a("send_start_time", b.f46317b).mo31180a("total_cost_time", b.f46321f).mo31180a("is_ws", Integer.valueOf(b.f46323h ? 1 : 0)).mo31180a("logid", b.f46324i).mo31181b();
        f46327b.remove(Long.valueOf(aiVar.getMsgId()));
    }
}
