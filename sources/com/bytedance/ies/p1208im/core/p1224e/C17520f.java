package com.bytedance.ies.p1208im.core.p1224e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.AbstractC16082i;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.p1399im.core.p1404a.C19492f;
import com.bytedance.p1399im.core.p1404a.C19493g;
import com.bytedance.p1399im.core.p1404a.C19496j;
import com.bytedance.p1399im.core.p1404a.C19497k;
import com.bytedance.p1399im.core.p1404a.C19498l;
import com.bytedance.p1399im.core.p1404a.C19499m;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.e.f */
public final class C17520f implements AbstractC16082i {

    /* renamed from: a */
    public static final C17511c f41930a = new C17511c();

    /* renamed from: b */
    public static final C17520f f41931b;

    /* renamed from: c */
    private static final AbstractC89244h f41932c = C89250i.m154773a((AbstractC89171a) C17522b.f41934a);

    /* renamed from: b */
    public static C17511c m32494b() {
        return (C17511c) f41932c.getValue();
    }

    private C17520f() {
    }

    /* renamed from: com.bytedance.ies.im.core.e.f$b */
    static final class C17522b extends AbstractC89220m implements AbstractC89171a<C17511c> {

        /* renamed from: a */
        public static final C17522b f41934a = new C17522b();

        static {
            Covode.recordClassIndex(20011);
        }

        C17522b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C17511c invoke() {
            return m32496a();
        }

        /* renamed from: a */
        private static C17511c m32496a() {
            try {
                return (C17511c) C16048b.m29633a().mo25415a(true, "im_options_config", C17511c.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Override // com.bytedance.ies.abmock.AbstractC16082i
    /* renamed from: a */
    public final void mo25536a() {
        C17415a.m32255b().mo27836b("SdkOptionsExperiment", "onConfigChanged");
        AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203266a), null, null, new C17521a(null), 3);
    }

    static {
        Covode.recordClassIndex(20009);
        C17520f fVar = new C17520f();
        f41931b = fVar;
        SettingsManager.m29616a().mo25399a(fVar);
    }

    /* renamed from: com.bytedance.ies.im.core.e.f$a */
    static final class C17521a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f41933a;

        static {
            Covode.recordClassIndex(20010);
        }

        C17521a(AbstractC89124d dVar) {
            super(2, dVar);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C17521a(dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C17521a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
            if (r0.enable != r6.enable) goto L_0x0054;
         */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
            // Method dump skipped, instructions count: 286
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p1208im.core.p1224e.C17520f.C17521a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final void m32493a(C19492f fVar) {
        C89219l.m154721d(fVar, "");
        C17511c b = m32494b();
        if (b != null) {
            if (!b.f41909a) {
                C17415a.m32255b().mo27836b("SdkOptionsExperiment", "init fail cause close experiment!");
            } else {
                C17415a.m32255b().mo27836b("SdkOptionsExperiment", "init for options:" + C80342dg.m139300a().mo46674b(b));
                fVar.f46274n = b.f41911c;
                fVar.f46275o = b.f41910b;
                fVar.f46278r = b.f41912d;
                fVar.f46276p = b.f41913e;
                fVar.f46277q = b.f41914f;
            }
        }
        Object a = C16048b.m29633a().mo25415a(true, "im_options_fix_bug", C17510b.class);
        if (a != null) {
            C17415a.m32255b().mo27836b("SdkOptionsExperiment", "init for options:" + C80342dg.m139300a().mo46674b(a));
        }
        Object a2 = C16048b.m29633a().mo25415a(true, "im_options_ws_fake_death", C17509a.class);
        if (a2 != null) {
            C17415a.m32255b().mo27836b("SdkOptionsExperiment", "init for ws fake death:" + C80342dg.m139300a().mo46674b(a2));
        }
        fVar.f46217Z = ((Boolean) C17529j.f41952d.getValue()).booleanValue();
        C17415a.m32255b().mo27827a("SdkOptionsExperiment", "options.sendMsgUseParallelQueue = " + fVar.f46217Z);
        fVar.f46211T = C17415a.m32259f().mo27803a().f41796f;
        C17415a.m32255b().mo27827a("SdkOptionsExperiment", "options.autoReportUnreadCount = " + fVar.f46211T);
        C17415a.m32254a();
        fVar.f46241af = C17415a.m32254a().mo27851g();
        fVar.f46286z = true;
        C17415a.m32255b().mo27827a("SdkOptionsExperiment", "options.sendMsgFallbackPush = " + fVar.f46286z);
        fVar.f46243ah = false;
        C17415a.m32255b().mo27836b("SdkOptionsExperiment", "options.enableWal = " + fVar.f46243ah);
        fVar.f46257av = C17526i.m32501a().f41946a;
        fVar.f46253ar = C17526i.m32501a().f41947b;
        C17415a.m32255b().mo27827a("SdkOptionsExperiment", "options.optimizeSendMsgLocalCost = " + fVar.f46257av);
        C17415a.m32255b().mo27827a("SdkOptionsExperiment", "options.sendMsgOptimizerCacheSize = " + fVar.f46253ar);
        fVar.f46244ai = (C19497k) C17535m.f41964c.getValue();
        C17415a.m32255b().mo27836b("SdkOptionsExperiment", "options.recentLinkConfig=" + fVar.f46244ai);
        fVar.f46246ak = ((Boolean) C17531k.f41955a.getValue()).booleanValue();
        C17415a.m32255b().mo27836b("SdkOptionsExperiment", "options.pullRecentAndCmdParallel=" + fVar.f46246ak);
        fVar.f46249an = ((Number) C17539n.f41971a.getValue()).intValue();
        C17415a.m32255b().mo27836b("SdkOptionsExperiment", "options.recoverVersion=" + fVar.f46249an);
        fVar.f46250ao = (C19498l) C17541o.f41975b.getValue();
        C17415a.m32255b().mo27836b("SdkOptionsExperiment", "options.reportDBInfoConfig=" + fVar.f46250ao);
        fVar.f46251ap = (C19499m) C17545q.f41983b.getValue();
        C17415a.m32255b().mo27836b("SdkOptionsExperiment", "options.reportTaskInfoConfig=" + fVar.f46251ap);
        fVar.f46252aq = ((Boolean) C17543p.f41979b.getValue()).booleanValue();
        C17415a.m32255b().mo27836b("SdkOptionsExperiment", "options.reportDBMetricByTea=" + fVar.f46252aq);
        fVar.f46237ab = (C19496j) C17524h.f41939b.getValue();
        C17415a.m32255b().mo27836b("SdkOptionsExperiment", "options.optimizeConvListPullConfig=" + fVar.f46237ab);
        fVar.f46260ay = (C19493g) C17549s.f41992b.getValue();
        fVar.f46245aj = ((Boolean) C17533l.f41959b.getValue()).booleanValue();
        C17415a.m32255b().mo27836b("SdkOptionsExperiment", "options.recentLinkAsync=" + fVar.f46245aj);
        fVar.f46254as = ((Number) C17547r.f41986a.getValue()).intValue();
        C17415a.m32255b().mo27836b("SdkOptionsExperiment", "options.retryDelConMode=" + fVar.f46254as);
    }
}
