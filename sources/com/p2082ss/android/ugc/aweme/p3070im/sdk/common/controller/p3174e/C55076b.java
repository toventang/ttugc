package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17419b;
import com.p2082ss.android.ugc.aweme.common.net.C39151f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.C53633b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3182k.C55156a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.DefaultMainProxy;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IImplService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMServiceProvider;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.ImplService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55219n;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55231t;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.p3209b.C55638f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.data.api.UserSettingService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.data.p3219a.C55703a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.C55836b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.p3228a.EnumC55835a;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e;
import com.p2082ss.android.ugc.aweme.p3070im.service.C56185a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89536ay;
import kotlinx.coroutines.C89546bf;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4567d.AbstractC88429b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.b */
public final class C55076b implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public static final AbstractC89516am f126048a = C89517an.m155448a(C89546bf.f203266a);

    /* renamed from: b */
    public static AbstractC56220e f126049b;

    /* renamed from: c */
    public static C56185a f126050c;

    /* renamed from: d */
    public static volatile boolean f126051d;

    /* renamed from: e */
    public static final C55076b f126052e = new C55076b();

    /* renamed from: f */
    private static final AbstractC89244h f126053f = C89250i.m154773a((AbstractC89171a) C55078b.f126057a);

    /* renamed from: g */
    private static final long f126054g = System.currentTimeMillis();

    /* renamed from: a */
    public static C55081d m100722a() {
        return (C55081d) f126053f.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(178, new RunnableC90250g(C55076b.class, "onEvent", C39151f.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    private C55076b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.b$b */
    static final class C55078b extends AbstractC89220m implements AbstractC89171a<C55081d> {

        /* renamed from: a */
        public static final C55078b f126057a = new C55078b();

        static {
            Covode.recordClassIndex(64806);
        }

        C55078b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C55081d invoke() {
            return new C55081d();
        }
    }

    /* renamed from: f */
    public static void m100727f() {
        C17419b.m32261a().mo27885a();
    }

    /* renamed from: b */
    public static AbstractC56220e m100723b() {
        AbstractC56220e eVar = f126049b;
        if (eVar == null) {
            return new DefaultMainProxy();
        }
        return eVar;
    }

    /* renamed from: d */
    public static final IImplService m100725d() {
        IImplService createIImplServicebyMonsterPlugin = ImplService.createIImplServicebyMonsterPlugin(false);
        C89219l.m154716b(createIImplServicebyMonsterPlugin, "");
        return createIImplServicebyMonsterPlugin;
    }

    static {
        Covode.recordClassIndex(64804);
    }

    /* renamed from: c */
    public static boolean m100724c() {
        try {
            C55638f.f126899a.mo27857a(C55156a.f126203a);
            C17419b.m32261a().mo27886a(C53633b.f123055a);
            C17419b.m32261a().mo27885a();
            return true;
        } catch (Exception e) {
            C56244a.m102186a("AwemeImManager", "initInSubThread error", e);
            return false;
        }
    }

    /* renamed from: e */
    public static void m100726e() {
        boolean z;
        if (C55197c.m100917a()) {
            long e = C55197c.m100923e();
            C55219n a = C55219n.m100965a();
            C89219l.m154716b(a, "");
            if (e != a.f126298b.getLong("userid", -1)) {
                z = true;
            } else {
                z = false;
            }
            C55219n a2 = C55219n.m100965a();
            C89219l.m154716b(a2, "");
            a2.f126298b.edit().putLong("userid", e).commit();
            C56244a.m102190b("AwemeImManager", "refresh login: true, user changed ".concat(String.valueOf(z)));
            if (z) {
                C55836b.m101604a(EnumC55835a.COLDUP_FULL, true);
            }
            IMServiceProvider.INSTANCE.getFamiliarService().mo92288a();
            UserSettingService.C55705a.m101447a().getUserSettings("").mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142922b(C55079c.f126058a);
            return;
        }
        C56244a.m102190b("AwemeImManager", "refresh login: false");
        C55219n.m100965a().f126298b.edit().remove("userid").remove("token").commit();
        C55085g.m100762c();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.b$a */
    public static final class C55077a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f126055a;

        /* renamed from: b */
        final /* synthetic */ long f126056b;

        static {
            Covode.recordClassIndex(64805);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55077a(long j, AbstractC89124d dVar) {
            super(2, dVar);
            this.f126056b = j;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C55077a(this.f126056b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C55077a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f126055a;
            if (i == 0) {
                C89382r.m154942a(obj);
                long j = this.f126056b;
                this.f126055a = 1;
                if (C89536ay.m155464a(j, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C55076b.m100724c();
            return C89391z.f203057a;
        }
    }

    @AbstractC90264r
    public final void onEvent(C39151f fVar) {
        C89219l.m154721d(fVar, "");
        C56244a.m102190b("AwemeImManager", "onEvent");
        if (fVar.f92366a != 0 && C55197c.m100917a() && System.currentTimeMillis() - f126054g >= 5000) {
            C55231t.m100998a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.b$c */
    public static final class C55079c<T1, T2> implements AbstractC88429b {

        /* renamed from: a */
        public static final C55079c f126058a = new C55079c();

        static {
            Covode.recordClassIndex(64807);
        }

        C55079c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88429b
        /* renamed from: a */
        public final /* synthetic */ void mo10350a(Object obj, Object obj2) {
            C68348f fVar = (C68348f) obj;
            if (fVar != null) {
                C55219n a = C55219n.m100965a();
                C89219l.m154716b(a, "");
                a.mo92203a(new C55703a(fVar.f152940C, fVar.f152941D, fVar.f152942E));
            }
        }
    }
}
