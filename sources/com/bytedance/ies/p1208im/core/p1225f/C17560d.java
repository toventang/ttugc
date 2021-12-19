package com.bytedance.ies.p1208im.core.p1225f;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.api.p1210a.AbstractC17417b;
import com.bytedance.ies.p1208im.core.api.p1210a.C17418c;
import com.bytedance.ies.p1208im.core.api.p1210a.EnumC17416a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17429c;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17451d;
import com.bytedance.ies.p1208im.core.api.p1216f.C17455a;
import com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a;
import com.bytedance.ies.p1208im.core.api.p1220j.C17470b;
import com.bytedance.ies.p1208im.core.p1221b.AbstractC17485b;
import com.bytedance.ies.p1208im.core.p1221b.C17472a;
import com.bytedance.ies.p1208im.core.p1221b.HandlerC17488e;
import com.bytedance.ies.p1208im.core.p1222c.C17492a;
import com.bytedance.ies.p1208im.core.p1222c.C17496c;
import com.bytedance.ies.p1208im.core.p1222c.C17498d;
import com.bytedance.ies.p1208im.core.p1224e.C17512d;
import com.bytedance.ies.p1208im.core.p1224e.C17514e;
import com.bytedance.ies.p1208im.core.p1224e.C17520f;
import com.bytedance.ies.p1208im.core.p1226g.C17583c;
import com.bytedance.ies.p1208im.core.p1228i.C17595a;
import com.bytedance.p1399im.core.internal.C19738a;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.p1404a.AbstractC19495i;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.C19492f;
import com.bytedance.p1399im.core.p1407c.AbstractC19506a;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1415g.C19696b;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.google.gson.C28022o;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.f.d */
public final class C17560d implements AbstractC17417b, AbstractC17469a, AbstractC17485b {

    /* renamed from: a */
    static boolean f42009a;

    /* renamed from: b */
    public static final C17560d f42010b = new C17560d();

    /* renamed from: c */
    private static final AbstractC89516am f42011c = C89517an.m155448a(C89546bf.f203266a);

    /* renamed from: d */
    private static volatile int f42012d;

    /* renamed from: e */
    private static volatile boolean f42013e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.im.core.f.d$a */
    public static final class C17561a implements AbstractC19506a {

        /* renamed from: a */
        public static final C17561a f42014a = new C17561a();

        static {
            Covode.recordClassIndex(20050);
        }

        C17561a() {
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a
    /* renamed from: a */
    public final void mo27899a(String str) {
    }

    private C17560d() {
    }

    static {
        Covode.recordClassIndex(20049);
    }

    /* renamed from: d */
    private static C19492f m32552d() {
        C19492f fVar = new C19492f();
        AbstractC17451d a = C17415a.m32254a();
        fVar.f46265e = a.mo27847c();
        fVar.f46266f = a.mo27850f();
        fVar.f46272l = 0;
        fVar.f46218a = a.mo27851g();
        fVar.f46263c = a.mo27851g();
        fVar.f46268h = a.mo27852h();
        fVar.f46262b = 2;
        fVar.f46282v = 1;
        fVar.f46271k = 1000;
        fVar.f46195D = true;
        fVar.f46204M = "1000";
        fVar.f46236aa = C17496c.m32481a();
        C17415a.m32259f();
        fVar.f46205N = true;
        fVar.f46264d = !a.mo27851g();
        C17455a a2 = C17415a.m32259f().mo27803a();
        fVar.f46280t = a2.f41791a;
        fVar.f46279s = a2.f41792b;
        fVar.f46240ae = a2.f41794d;
        fVar.f46214W = a2.f41793c;
        fVar.f46258aw = a2.f41795e;
        fVar.f46196E = a2.f41797g;
        fVar.f46232aN = false;
        fVar.f46234aP = a2.f41799i;
        C17520f.m32493a(fVar);
        return fVar;
    }

    /* renamed from: a */
    public final void mo27976a() {
        MethodCollector.m26663i(7785);
        try {
            if (((Boolean) C17512d.f41917a.getValue()).booleanValue()) {
                synchronized (this) {
                    try {
                        f42010b.m32551c();
                    } finally {
                        MethodCollector.m26664o(7785);
                    }
                }
                return;
            }
            m32551c();
            MethodCollector.m26664o(7785);
        } catch (Throwable th) {
            C17415a.m32255b().mo27828a("SDKManager", "init error", th);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_msg", C19696b.m36810a(th));
            jSONObject.put("error_stack", C19696b.m36828b(th));
            C17415a.m32255b().mo27839c("im_sdk_init_error", jSONObject);
            MethodCollector.m26664o(7785);
        }
    }

    /* renamed from: b */
    public final void mo27977b() {
        AbstractC17449b b = C17415a.m32255b();
        StringBuilder append = new StringBuilder("ensure: ").append(f42013e).append(", ").append(f42012d).append(", ");
        C19483d a = C19483d.m36365a();
        C89219l.m154716b(a, "");
        b.mo27836b("SDKManager", append.append(a.f46159d).toString());
        mo27976a();
        if (f42012d != 1) {
            C19483d a2 = C19483d.m36365a();
            C89219l.m154716b(a2, "");
            if (!a2.f46159d) {
                m32553e();
            }
        }
    }

    /* renamed from: c */
    private void m32551c() {
        Context a = C17415a.m32254a().mo27845a();
        C17415a.m32255b().mo27836b("SDKManager", "init: " + f42013e + ", " + C17415a.m32258e().mo27822a() + ", " + C17415a.m32258e().mo27825d() + ", " + a);
        if (!f42013e) {
            HandlerC17488e.m32469a(this);
            C17595a.f42083a.mo27857a(this);
            C19483d a2 = C19483d.m36365a();
            C20014q.m37816a().f47555a = C17472a.f41830a;
            a2.mo31138a(a, m32552d(), C17553a.f41998a);
            C89219l.m154716b(a2, "");
            a2.mo31139a(C17554b.f41999a);
            a2.f46158c = C17561a.f42014a;
            try {
                C28022o a3 = C17498d.m32482a();
                if (a3 != null) {
                    C19738a.m36933a(new JSONObject(a3.toString()));
                } else {
                    C17415a.m32255b().mo27836b("SDKManager", "init update settings empty config");
                }
            } catch (JSONException e) {
                C17415a.m32255b().mo27828a("SDKManager", "init update settings error ", e);
            }
            f42013e = true;
            C17570g.m32582a(a2);
            a2.f46163h = C17562b.f42015a;
            C19510e.f46308a = C17568e.f42022a;
            m32553e();
        }
    }

    /* renamed from: f */
    private static void m32554f() {
        AbstractC17449b b = C17415a.m32255b();
        StringBuilder append = new StringBuilder("logoutSDK: ").append(C17415a.m32258e().mo27825d()).append(", ").append(HandlerC17488e.m32471c()).append(", ").append(C17415a.m32258e().mo27822a()).append(", ").append(f42012d);
        C19483d a = C19483d.m36365a();
        C89219l.m154716b(a, "");
        b.mo27836b("SDKManager", append.append(a.f46159d).append(", ").toString());
        f42012d = 0;
        C19483d a2 = C19483d.m36365a();
        C89219l.m154716b(a2, "");
        if (a2.f46159d) {
            C17415a.m32255b().mo27836b("SDKManager", "logoutSDK real");
            C17583c.m32619c();
            C19483d.m36365a().mo31143d();
            C17415a.m32259f().mo27808a(C17567f.f42021a);
        }
    }

    /* renamed from: e */
    private final void m32553e() {
        if (!f42013e) {
            C17415a.m32255b().mo27838c("SDKManager", "loginSDK before init!");
            mo27976a();
            return;
        }
        if (f42009a) {
            C19483d a = C19483d.m36365a();
            C89219l.m154716b(a, "");
            a.mo31141b().f46205N = true;
        }
        if (C17415a.m32258e().mo27826e()) {
            C17415a.m32255b().mo27836b("SDKManager", "loginSDK forbid by ftc");
            return;
        }
        C17415a.m32258e();
        AbstractC17449b b = C17415a.m32255b();
        StringBuilder append = new StringBuilder("loginSDK: ").append(C17415a.m32258e().mo27825d()).append(", ").append(HandlerC17488e.m32471c()).append(", ").append(C17415a.m32258e().mo27822a()).append(", ").append(f42012d);
        C19483d a2 = C19483d.m36365a();
        C89219l.m154716b(a2, "");
        b.mo27836b("SDKManager", append.append(a2.f46159d).append(", ").append(C17492a.m32480a()).toString());
        C19483d a3 = C19483d.m36365a();
        C89219l.m154716b(a3, "");
        if (!a3.f46159d && C17415a.m32258e().mo27822a() && HandlerC17488e.m32471c().length() != 0) {
            C17415a.m32255b().mo27836b("SDKManager", "loginSDK real");
            f42012d = 1;
            C17415a.m32259f().mo27808a(C17563c.f42016a);
            if (C17492a.m32480a()) {
                AbstractC89568bz unused = C89624i.m155555a(f42011c, null, null, new C17564d(null), 3);
            } else {
                C19483d.m36365a().mo31142c();
            }
            if (!f42009a) {
                C19483d a4 = C19483d.m36365a();
                C89219l.m154716b(a4, "");
                if (!a4.mo31141b().f46205N) {
                    C17415a.m32259f();
                    C19483d.m36365a().mo31137a(0);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.im.core.f.d$c */
    public static final class C17563c extends AbstractC89220m implements AbstractC89172b<AbstractC17429c, C89391z> {

        /* renamed from: a */
        public static final C17563c f42016a = new C17563c();

        static {
            Covode.recordClassIndex(20052);
        }

        C17563c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC17429c cVar) {
            AbstractC17429c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            cVar2.mo27809b();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.im.core.f.d$f */
    public static final class C17567f extends AbstractC89220m implements AbstractC89172b<AbstractC17429c, C89391z> {

        /* renamed from: a */
        public static final C17567f f42021a = new C17567f();

        static {
            Covode.recordClassIndex(20056);
        }

        C17567f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC17429c cVar) {
            AbstractC17429c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            cVar2.mo27811c();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a
    /* renamed from: a */
    public final void mo27898a(C17470b bVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.im.core.f.d$d */
    public static final class C17564d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f42017a;

        static {
            Covode.recordClassIndex(20053);
        }

        C17564d(AbstractC89124d dVar) {
            super(2, dVar);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C17564d(dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C17564d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f42017a == 0) {
                C89382r.m154942a(obj);
                C19483d.m36365a().mo31142c();
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.im.core.f.d$b */
    public static final class C17562b implements AbstractC19495i {

        /* renamed from: a */
        public static final C17562b f42015a = new C17562b();

        static {
            Covode.recordClassIndex(20051);
        }

        C17562b() {
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19495i
        /* renamed from: a */
        public final boolean mo27978a(Integer num) {
            int value = IMCMD.REPORT_CLIENT_METRICS.getValue();
            if (num != null && num.intValue() == value) {
                return true;
            }
            int value2 = IMCMD.GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3.getValue();
            if (num != null && num.intValue() == value2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.ies.im.core.f.d$e */
    static final class C17565e extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f42018a;

        /* renamed from: b */
        final /* synthetic */ long f42019b;

        static {
            Covode.recordClassIndex(20054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17565e(long j, AbstractC89124d dVar) {
            super(2, dVar);
            this.f42019b = j;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C17565e(this.f42019b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C17565e) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[RETURN] */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                h.c.a.a r4 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
                int r0 = r5.f42018a
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L_0x0012
                if (r0 == r2) goto L_0x0020
                if (r0 != r3) goto L_0x0034
                p4600h.C89382r.m154942a(r6)
            L_0x000f:
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            L_0x0012:
                p4600h.C89382r.m154942a(r6)
                long r0 = r5.f42019b
                r5.f42018a = r2
                java.lang.Object r0 = kotlinx.coroutines.C89536ay.m155464a(r0, r5)
                if (r0 != r4) goto L_0x0023
                return r4
            L_0x0020:
                p4600h.C89382r.m154942a(r6)
            L_0x0023:
                kotlinx.coroutines.ci r2 = kotlinx.coroutines.internal.C89652o.f203399a
                com.bytedance.ies.im.core.f.d$e$1 r1 = new com.bytedance.ies.im.core.f.d$e$1
                r0 = 0
                r1.<init>(r0)
                r5.f42018a = r3
                java.lang.Object r0 = kotlinx.coroutines.C89624i.m155554a(r2, r1, r5)
                if (r0 != r4) goto L_0x000f
                return r4
            L_0x0034:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p1208im.core.p1225f.C17560d.C17565e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1210a.AbstractC17417b
    /* renamed from: a */
    public final void mo27788a(EnumC17416a aVar, C17418c cVar) {
        String str;
        C89219l.m154721d(aVar, "");
        AbstractC17449b b = C17415a.m32255b();
        StringBuilder append = new StringBuilder("onAccountChange: ").append(aVar).append(", ");
        if (cVar != null) {
            str = cVar.f41775a;
        } else {
            str = null;
        }
        b.mo27836b("SDKManager", append.append(str).toString());
        f42009a = true;
        if (aVar == EnumC17416a.LOGOUT || aVar == EnumC17416a.SWITCH) {
            m32554f();
        } else if (HandlerC17488e.m32471c().length() > 0) {
            m32553e();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01bd, code lost:
        if (r1 == -1) goto L_0x01bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01d0  */
    @Override // com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27897a(com.bytedance.common.wschannel.model.WsChannelMsg r13, com.bytedance.p1399im.core.p1408d.C19608bd r14) {
        /*
        // Method dump skipped, instructions count: 502
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p1208im.core.p1225f.C17560d.mo27897a(com.bytedance.common.wschannel.model.WsChannelMsg, com.bytedance.im.core.d.bd):void");
    }

    @Override // com.bytedance.ies.p1208im.core.p1221b.AbstractC17485b
    /* renamed from: a */
    public final void mo27912a(String str, String str2) {
        AbstractC17449b b = C17415a.m32255b();
        StringBuilder append = new StringBuilder("onTokenChanged: ").append(str).append(", ").append(str2).append(", ");
        C19483d a = C19483d.m36365a();
        C89219l.m154716b(a, "");
        b.mo27836b("SDKManager", append.append(a.f46159d).toString());
        if (str2 == null || str2.length() == 0) {
            C19483d a2 = C19483d.m36365a();
            C89219l.m154716b(a2, "");
            if (a2.f46159d) {
                m32554f();
                return;
            }
            return;
        }
        C19483d a3 = C19483d.m36365a();
        C89219l.m154716b(a3, "");
        if (a3.f46159d) {
            C17415a.m32255b().mo27836b("SDKManager", "refreshSDKToken: " + HandlerC17488e.m32471c());
            C17514e.m32487a();
            return;
        }
        m32553e();
    }
}
