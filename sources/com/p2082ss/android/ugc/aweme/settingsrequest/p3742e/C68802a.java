package com.p2082ss.android.ugc.aweme.settingsrequest.p3742e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89536ay;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
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

/* renamed from: com.ss.android.ugc.aweme.settingsrequest.e.a */
public final class C68802a {

    /* renamed from: a */
    public static final C68802a f153878a = new C68802a();

    /* renamed from: b */
    private static List<AbstractC68342a> f153879b = new ArrayList();

    /* renamed from: c */
    private static AbstractC68342a f153880c;

    /* renamed from: d */
    private static boolean f153881d = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);

    /* renamed from: e */
    private static final AbstractC89244h f153882e = C89250i.m154773a((AbstractC89171a) C68803a.f153883a);

    /* renamed from: b */
    private static C39088c<AbstractC39085b<C68348f>, AbstractC68351c> m121275b() {
        return (C39088c) f153882e.getValue();
    }

    private C68802a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.settingsrequest.e.a$a */
    static final class C68803a extends AbstractC89220m implements AbstractC89171a<C39088c<AbstractC39085b<C68348f>, AbstractC68351c>> {

        /* renamed from: a */
        public static final C68803a f153883a = new C68803a();

        static {
            Covode.recordClassIndex(81080);
        }

        C68803a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C39088c<AbstractC39085b<C68348f>, AbstractC68351c> invoke() {
            C39088c<AbstractC39085b<C68348f>, AbstractC68351c> providePushSettingFetchPresenter = C68432f.f153189a.providePushSettingFetchPresenter();
            providePushSettingFetchPresenter.mo67839a_(new AbstractC68351c() {
                /* class com.p2082ss.android.ugc.aweme.settingsrequest.p3742e.C68802a.C68803a.C688041 */

                static {
                    Covode.recordClassIndex(81081);
                }

                @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
                /* renamed from: a */
                public final void mo68831a(C68348f fVar) {
                    C89219l.m154721d(fVar, "");
                    C68802a.m121271a(fVar);
                }

                @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
                /* renamed from: a */
                public final void mo68832a(Exception exc) {
                    C89219l.m154721d(exc, "");
                    C68802a.m121274a(exc);
                }
            });
            return providePushSettingFetchPresenter;
        }
    }

    static {
        Covode.recordClassIndex(81079);
        m121270a();
        if (C29843f.m60129a(C17867d.m33078a())) {
        }
    }

    /* renamed from: a */
    private static void m121270a() {
        f153879b.addAll(C68432f.f153189a.mo108860a());
        Object a = C39223a.m79590d().mo68614a();
        AbstractC68342a aVar = null;
        if (!(a instanceof AbstractC68342a)) {
            a = null;
        }
        AbstractC68342a aVar2 = (AbstractC68342a) a;
        if (aVar2 != null) {
            m121272a(aVar2);
        }
        Object f = C39223a.m79591e().mo68731f();
        if (!(f instanceof AbstractC68342a)) {
            f = null;
        }
        AbstractC68342a aVar3 = (AbstractC68342a) f;
        if (aVar3 != null) {
            m121272a(aVar3);
        }
        Object pushSettingCallback = C63419ae.f143971a.getPushSettingCallback();
        if (!(pushSettingCallback instanceof AbstractC68342a)) {
            pushSettingCallback = null;
        }
        AbstractC68342a aVar4 = (AbstractC68342a) pushSettingCallback;
        if (aVar4 != null) {
            m121272a(aVar4);
        }
        for (AbstractC68342a aVar5 : SettingsRequestServiceImpl.m65417i().mo57274a()) {
            m121272a(aVar5);
        }
        Object j = C39223a.m79590d().mo68625j();
        if (j instanceof AbstractC68342a) {
            aVar = j;
        }
        AbstractC68342a aVar6 = aVar;
        if (aVar6 != null) {
            m121272a(aVar6);
        }
    }

    /* renamed from: a */
    private static void m121272a(AbstractC68342a aVar) {
        f153879b.add(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.settingsrequest.e.a$b */
    public static final class C68805b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f153884a;

        /* renamed from: b */
        final /* synthetic */ AbstractC68342a f153885b;

        static {
            Covode.recordClassIndex(81082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68805b(AbstractC68342a aVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f153885b = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C68805b(this.f153885b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C68805b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f153884a;
            if (i == 0) {
                C89382r.m154942a(obj);
                long millis = TimeUnit.SECONDS.toMillis(1);
                this.f153884a = 1;
                if (C89536ay.m155464a(millis, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C68802a.m121273a(this.f153885b, true);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m121271a(C68348f fVar) {
        C89219l.m154721d(fVar, "");
        Iterator<T> it = f153879b.iterator();
        while (it.hasNext()) {
            it.next().mo60118a(fVar);
        }
        AbstractC68342a aVar = f153880c;
        if (aVar != null) {
            aVar.mo60118a(fVar);
        }
        f153880c = null;
    }

    /* renamed from: a */
    public static void m121274a(Exception exc) {
        Iterator<T> it = f153879b.iterator();
        while (it.hasNext()) {
            it.next().mo60119a(exc);
        }
        AbstractC68342a aVar = f153880c;
        if (aVar != null) {
            aVar.mo60119a(exc);
        }
        f153880c = null;
    }

    /* renamed from: a */
    public static void m121273a(AbstractC68342a aVar, boolean z) {
        f153880c = aVar;
        try {
            m121275b().mo57616a(new Object[0]);
        } catch (Exception unused) {
            if (!z) {
                AbstractC89568bz unused2 = C89624i.m155555a(C89561bs.f203280a, C89652o.f203399a, null, new C68805b(aVar, null), 2);
            } else {
                m121274a(new Exception());
            }
        }
    }
}
