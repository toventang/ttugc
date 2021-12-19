package com.p2082ss.android.ugc.aweme.social.monitor;

import com.bytedance.covode.number.Covode;
import java.util.UUID;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.monitor.e */
public final class C74740e implements IRelationMonitorService {

    /* renamed from: b */
    public static final C74740e f167996b = new C74740e();

    /* renamed from: c */
    private final /* synthetic */ IRelationMonitorService f167997c;

    @Override // com.p2082ss.android.ugc.aweme.social.monitor.IRelationMonitorService
    /* renamed from: a */
    public final AbstractC74739d mo117778a(int i, UUID uuid) {
        C89219l.m154721d(uuid, "");
        return this.f167997c.mo117778a(i, uuid);
    }

    static {
        Covode.recordClassIndex(87581);
    }

    private C74740e() {
        IRelationMonitorService a = RelationMonitorServiceImp.m131193a();
        C89219l.m154716b(a, "");
        this.f167997c = a;
    }
}
