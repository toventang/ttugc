package com.p2082ss.android.ugc.aweme.social.p3915b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.impl.C21752c;
import com.p2082ss.android.ugc.aweme.common.AbstractC39145n;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.experiment.C46914ev;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.friends.service.IContactService;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58260s;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56214i;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.social.p3914a.C74710e;
import com.p2082ss.android.ugc.aweme.social.p3914a.C74712f;
import com.p2082ss.android.ugc.aweme.social.widget.p3919b.AbstractC74745a;
import com.p2082ss.android.ugc.aweme.social.widget.p3919b.C74747b;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89599cu;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89097a;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.b.a */
public final class C74716a implements AbstractC58259r {

    /* renamed from: a */
    public final String f167944a = "RecUserLego";

    static {
        Covode.recordClassIndex(87553);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58260s.m105199a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "request_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: b */
    public final EnumC58147aa mo58051b() {
        return EnumC58147aa.NORMAL;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: com.ss.android.ugc.aweme.social.b.a$c */
    public static final class C74719c extends AbstractC89097a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(87556);
        }

        public C74719c(AbstractC89127f.AbstractC89132c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(AbstractC89127f fVar, Throwable th) {
            C56244a.m102186a("MAFSource-startup", "Error refreshing MAF user", th);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.b.a$b */
    static final class C74718b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f167946a;

        /* renamed from: b */
        final /* synthetic */ C74716a f167947b;

        static {
            Covode.recordClassIndex(87555);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74718b(C74716a aVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f167947b = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C74718b(this.f167947b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C74718b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f167946a;
            if (i == 0) {
                C89382r.m154942a(obj);
                C39109f.m79400a(this.f167947b.f167944a, "start to load contact");
                AbstractC39145n a = ((IContactService) ServiceManager.get().getService(IContactService.class)).mo87291a();
                this.f167946a = 1;
                if (a.mo67909b() == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.b.a$d */
    static final class C74720d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f167948a;

        /* renamed from: b */
        final /* synthetic */ C74747b f167949b;

        static {
            Covode.recordClassIndex(87557);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74720d(C74747b bVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f167949b = bVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C74720d(this.f167949b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C74720d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f167948a;
            if (i == 0) {
                C89382r.m154942a(obj);
                C74747b bVar = this.f167949b;
                this.f167948a = 1;
                if (bVar.mo117795a(this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.b.a$a */
    public static final class C74717a extends AbstractC89097a implements CoroutineExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ C74716a f167945a;

        static {
            Covode.recordClassIndex(87554);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74717a(AbstractC89127f.AbstractC89132c cVar, C74716a aVar) {
            super(cVar);
            this.f167945a = aVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(AbstractC89127f fVar, Throwable th) {
            C39109f.m79401a(this.f167945a.f167944a, "Error init local contact cache", th);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: a */
    public final void mo58050a(Context context, boolean z) {
        boolean z2;
        C74747b bVar = new C74747b();
        C21752c.f51535b.mo35380a().mo35384a("source_default_key", bVar, AbstractC74745a.class);
        bVar.f168007a.clear();
        if (!C74710e.f167932f || IMService.createIIMServicebyMonsterPlugin(false).getFriendsCount() >= 15) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 || ((C74712f.f167936a && IMService.createIIMServicebyMonsterPlugin(false).getFriendsCount() < 15) || C56214i.m102128a())) {
            AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89599cu.m155531a().plus(C89546bf.f203267b)), C89546bf.f203267b.plus(new C74719c(CoroutineExceptionHandler.f203145c)), null, new C74720d(bVar, null), 2);
        }
        if (C46914ev.f109330a) {
            AbstractC89568bz unused2 = C89624i.m155555a(C89517an.m155448a(C89599cu.m155531a().plus(C89546bf.f203267b)), C89546bf.f203267b.plus(new C74717a(CoroutineExceptionHandler.f203145c, this)), null, new C74718b(this, null), 2);
        }
    }
}
