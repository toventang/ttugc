package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.services.ApiMonitorService */
public final class ApiMonitorService extends AbsApiMonitorService {
    public static final Companion Companion = new Companion(null);
    public static final AbstractC89244h instance$delegate = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, ApiMonitorService$Companion$instance$2.INSTANCE);

    /* renamed from: com.ss.android.ugc.aweme.services.ApiMonitorService$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(79583);
        }

        public final ApiMonitorService getInstance() {
            return (ApiMonitorService) ApiMonitorService.instance$delegate.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    private ApiMonitorService() {
    }

    static {
        Covode.recordClassIndex(79582);
    }

    public /* synthetic */ ApiMonitorService(C89214g gVar) {
        this();
    }
}
