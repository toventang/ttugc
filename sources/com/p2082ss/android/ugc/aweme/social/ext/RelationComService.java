package com.p2082ss.android.ugc.aweme.social.ext;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.social.p3915b.C74716a;
import com.p2082ss.android.ugc.aweme.social.service.IRelationComService;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.social.ext.RelationComService */
public final class RelationComService implements IRelationComService {
    static {
        Covode.recordClassIndex(87566);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.service.IRelationComService
    /* renamed from: a */
    public final List<AbstractC58259r> mo117775a() {
        return C89070n.m154516a(new C74716a());
    }

    /* renamed from: b */
    public static IRelationComService m131185b() {
        MethodCollector.m26663i(7402);
        Object a = C81908b.m141854a(IRelationComService.class, false);
        if (a != null) {
            IRelationComService iRelationComService = (IRelationComService) a;
            MethodCollector.m26664o(7402);
            return iRelationComService;
        }
        if (C81908b.f183376ef == null) {
            synchronized (IRelationComService.class) {
                try {
                    if (C81908b.f183376ef == null) {
                        C81908b.f183376ef = new RelationComService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7402);
                    throw th;
                }
            }
        }
        RelationComService relationComService = (RelationComService) C81908b.f183376ef;
        MethodCollector.m26664o(7402);
        return relationComService;
    }
}
