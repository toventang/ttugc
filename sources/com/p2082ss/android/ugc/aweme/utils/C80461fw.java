package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.property.C65360bc;
import com.p2082ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.p2082ss.android.ugc.aweme.services.performance.LagDataCallback;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.fw */
public final class C80461fw {

    /* renamed from: a */
    public static final C80461fw f180038a = new C80461fw();

    /* renamed from: b */
    private static final AbstractC89244h f180039b = C89250i.m154773a((AbstractC89171a) C80462a.f180040a);

    /* renamed from: a */
    private static final ICreativePerformanceMonitorService m139465a() {
        return (ICreativePerformanceMonitorService) f180039b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.fw$b */
    public static final class C80463b implements LagDataCallback {
        static {
            Covode.recordClassIndex(93731);
        }

        C80463b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.services.performance.LagDataCallback
        public final void onDataAvailable(JSONObject jSONObject) {
            C89219l.m154721d(jSONObject, "");
            C39162r.m79461a("tool_performance_block_info", jSONObject);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.fw$c */
    public static final class C80464c implements LagDataCallback {
        static {
            Covode.recordClassIndex(93732);
        }

        C80464c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.services.performance.LagDataCallback
        public final void onDataAvailable(JSONObject jSONObject) {
            C89219l.m154721d(jSONObject, "");
            C39162r.m79461a("tool_performance_fps_info", jSONObject);
        }
    }

    private C80461fw() {
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.fw$a */
    static final class C80462a extends AbstractC89220m implements AbstractC89171a<ICreativePerformanceMonitorService> {

        /* renamed from: a */
        public static final C80462a f180040a = new C80462a();

        static {
            Covode.recordClassIndex(93730);
        }

        C80462a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ICreativePerformanceMonitorService invoke() {
            return AVExternalServiceImpl.m113114a().performanceMonitorService();
        }
    }

    static {
        Covode.recordClassIndex(93729);
    }

    /* renamed from: a */
    public static final void m139466a(String str) {
        C89219l.m154721d(str, "");
        if (C65360bc.m117057a()) {
            m139465a().stopBlockMonitor(str);
            m139465a().stopFpsMonitor(str);
        }
    }

    /* renamed from: a */
    public static final void m139467a(String str, int i, long j) {
        C89219l.m154721d(str, "");
        if (C65360bc.m117057a()) {
            m139465a().startBlockMonitor(str, i, j, new C80463b());
            m139465a().startFpsMonitor(str, j, new C80464c());
        }
    }
}
