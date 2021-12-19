package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a;

import com.bytedance.covode.number.Covode;
import com.bytedance.provider.AbstractC21732b;
import com.bytedance.provider.impl.C21752c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.p3916c.C74721a;
import com.p2082ss.android.ugc.aweme.social.p3916c.C74722b;
import com.p2082ss.android.ugc.aweme.social.widget.p3919b.AbstractC74745a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89097a;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.h */
public final class C55780h extends AbstractC55766f<C74721a, IMContact> {

    /* renamed from: a */
    private final AbstractC89172b<C74721a, IMContact> f127203a;

    static {
        Covode.recordClassIndex(65566);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.h$a */
    public static final class C55781a extends AbstractC55766f.AbstractC55767a<C55780h, C74721a, IMContact> {

        /* renamed from: a */
        public final C55780h f127204a = new C55780h((byte) 0);

        static {
            Covode.recordClassIndex(65567);
        }

        /* Return type fixed from 'com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f' to match base method */
        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f.AbstractC55767a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C55780h mo92638a() {
            return this.f127204a;
        }

        /* Return type fixed from 'com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f' to match base method */
        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f.AbstractC55767a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C55780h mo92639b() {
            return this.f127204a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f
    /* renamed from: a */
    public final AbstractC89172b<C74721a, IMContact> mo92632a() {
        return this.f127203a;
    }

    private C55780h() {
        this.f127203a = C55782b.f127205a;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f
    /* renamed from: d */
    public final List<C74721a> mo92634d() {
        return new ArrayList();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f
    /* renamed from: c */
    public final List<C74721a> mo92633c() {
        AbstractC74745a aVar;
        int i = 0;
        if (IMService.createIIMServicebyMonsterPlugin(false).getFriendsCount() >= 15) {
            return new ArrayList();
        }
        AbstractC21732b a = C21752c.f51535b.mo35380a().mo35381a("source_default_key", AbstractC74745a.class);
        if (a == null || (aVar = (AbstractC74745a) a.mo35378a()) == null) {
            return new ArrayList();
        }
        AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89546bf.f203267b.plus(new C55783c(CoroutineExceptionHandler.f203145c)), null, new C55784d(aVar, null), 2);
        List<User> b = aVar.mo117797b();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) b, 10));
        for (T t : b) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            C74721a a2 = C74722b.m131181a((User) t);
            a2.setSortIndex(i);
            arrayList.add(a2);
            i = i2;
        }
        List<C74721a> g = C89070n.m154585g((Collection) arrayList);
        C56244a.m102191c("MAFLoader", "load MaF size: " + g.size());
        return g;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.h$c */
    public static final class C55783c extends AbstractC89097a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(65569);
        }

        public C55783c(AbstractC89127f.AbstractC89132c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(AbstractC89127f fVar, Throwable th) {
            C56244a.m102186a("MAFSource-Loader", "Error refreshing MAF user", th);
        }
    }

    public /* synthetic */ C55780h(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.h$b */
    static final class C55782b extends AbstractC89220m implements AbstractC89172b<C74721a, C74721a> {

        /* renamed from: a */
        public static final C55782b f127205a = new C55782b();

        static {
            Covode.recordClassIndex(65568);
        }

        C55782b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C74721a invoke(C74721a aVar) {
            C89219l.m154721d(aVar, "");
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.h$d */
    static final class C55784d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f127206a;

        /* renamed from: b */
        final /* synthetic */ AbstractC74745a f127207b;

        static {
            Covode.recordClassIndex(65570);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55784d(AbstractC74745a aVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f127207b = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C55784d(this.f127207b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C55784d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f127206a;
            if (i == 0) {
                C89382r.m154942a(obj);
                AbstractC74745a aVar2 = this.f127207b;
                this.f127206a = 1;
                if (aVar2.mo117795a(this) == aVar) {
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
}
