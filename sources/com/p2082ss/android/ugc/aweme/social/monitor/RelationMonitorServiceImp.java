package com.p2082ss.android.ugc.aweme.social.monitor;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import java.util.UUID;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.monitor.RelationMonitorServiceImp */
public final class RelationMonitorServiceImp implements IRelationMonitorService {
    static {
        Covode.recordClassIndex(87573);
    }

    /* renamed from: a */
    public static IRelationMonitorService m131193a() {
        MethodCollector.m26663i(7644);
        Object a = C81908b.m141854a(IRelationMonitorService.class, false);
        if (a != null) {
            IRelationMonitorService iRelationMonitorService = (IRelationMonitorService) a;
            MethodCollector.m26664o(7644);
            return iRelationMonitorService;
        }
        if (C81908b.f183378eh == null) {
            synchronized (IRelationMonitorService.class) {
                try {
                    if (C81908b.f183378eh == null) {
                        C81908b.f183378eh = new RelationMonitorServiceImp();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7644);
                    throw th;
                }
            }
        }
        RelationMonitorServiceImp relationMonitorServiceImp = (RelationMonitorServiceImp) C81908b.f183378eh;
        MethodCollector.m26664o(7644);
        return relationMonitorServiceImp;
    }

    @Override // com.p2082ss.android.ugc.aweme.social.monitor.IRelationMonitorService
    /* renamed from: a */
    public final AbstractC74739d mo117778a(int i, UUID uuid) {
        C89219l.m154721d(uuid, "");
        C89219l.m154721d(uuid, "");
        String uuid2 = uuid.toString();
        C89219l.m154716b(uuid2, "");
        C74734b bVar = C74734b.f167989d.get(uuid2);
        if (bVar == null) {
            bVar = new C74734b(i, uuid2);
            C74734b.f167989d.put(uuid2, bVar);
        }
        C74733a aVar = bVar.f167991a;
        bVar.f167991a = new C74733a(aVar.f167974a, aVar.f167975b, aVar.f167976c, aVar.f167977d, aVar.f167978e, aVar.f167979f, aVar.f167980g, aVar.f167981h, aVar.f167982i, aVar.f167983j, aVar.f167984k, aVar.f167985l, aVar.f167986m, aVar.f167987n, aVar.f167988o);
        return bVar;
    }
}
