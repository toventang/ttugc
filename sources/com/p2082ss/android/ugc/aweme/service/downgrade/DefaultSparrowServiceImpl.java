package com.p2082ss.android.ugc.aweme.service.downgrade;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.service.IPublishXService;
import com.p2082ss.android.ugc.aweme.service.ISparrowService;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.service.downgrade.DefaultSparrowServiceImpl */
public final class DefaultSparrowServiceImpl implements ISparrowService {
    static {
        Covode.recordClassIndex(79547);
    }

    /* renamed from: com.ss.android.ugc.aweme.service.downgrade.DefaultSparrowServiceImpl$a */
    public static final class C67851a implements IPublishXService {
        static {
            Covode.recordClassIndex(79548);
        }

        @Override // com.p2082ss.android.ugc.aweme.service.IPublishXService
        /* renamed from: a */
        public final void mo106971a(Throwable th, Map<String, ? extends Object> map) {
            C89219l.m154721d(th, "");
            C89219l.m154721d(map, "");
        }

        C67851a() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.service.ISparrowService
    /* renamed from: a */
    public final IPublishXService mo106974a() {
        return new C67851a();
    }
}
