package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3993e;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20181b;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.AbstractC75742a;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.AbstractC75749b;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.AbstractC75761c;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75689aa;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75696e;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75701h;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75704j;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75706l;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75709o;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75710p;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75711q;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75713r;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75716u;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75717v;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75720y;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75687a;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75692ad;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75722z;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3986c.C75726a;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3986c.C75728c;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3986c.C75729d;
import com.p2082ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4560f.p4561a.p4591l.C88958b;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.d */
public final class C75797d implements AbstractC75749b {

    /* renamed from: a */
    public final C88958b<AbstractC75689aa<?>> f170259a;

    /* renamed from: b */
    public final C88958b<AbstractC75689aa<?>> f170260b;

    /* renamed from: c */
    public final C88958b<AbstractC75689aa<?>> f170261c;

    /* renamed from: d */
    public final C88958b<AbstractC75689aa<?>> f170262d;

    /* renamed from: e */
    public final C88958b<C89378p<String, AbstractC75689aa<?>>> f170263e;

    /* renamed from: f */
    public final C88960c<AbstractC75696e.AbstractC75697a> f170264f;

    /* renamed from: g */
    public final AbstractC84398d f170265g;

    /* renamed from: h */
    private final AbstractC89244h f170266h = C89250i.m154773a((AbstractC89171a) new C75798a(this));

    /* renamed from: i */
    private final C88411a f170267i;

    /* renamed from: j */
    private final String f170268j;

    /* renamed from: k */
    private final AbstractC20181b<C89391z, CategoryEffectModel, C75726a, CategoryEffectModel> f170269k;

    /* renamed from: l */
    private final AbstractC20181b<C89391z, PanelInfoModel, C75729d, PanelInfoModel> f170270l;

    /* renamed from: m */
    private final AbstractC75761c f170271m;

    /* renamed from: n */
    private final AbstractC89244h<AbstractC75742a> f170272n;

    /* renamed from: o */
    private final AbstractC89244h<AbstractC75709o> f170273o;

    /* renamed from: p */
    private final AbstractC89244h<AbstractC75706l> f170274p;

    /* renamed from: q */
    private final AbstractC75710p f170275q;

    /* renamed from: r */
    private final AbstractC89244h<AbstractC75713r> f170276r;

    /* renamed from: s */
    private final AbstractC89244h<AbstractC75717v> f170277s;

    /* renamed from: t */
    private final AbstractC89244h<AbstractC75704j> f170278t;

    static {
        Covode.recordClassIndex(88731);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75718w
    /* renamed from: e */
    public final AbstractC75710p mo119459e() {
        return this.f170275q;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75718w
    /* renamed from: j */
    public final AbstractC75720y mo119464j() {
        return this.f170271m;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.d$a */
    static final class C75798a extends AbstractC89220m implements AbstractC89171a<C75791a> {

        /* renamed from: a */
        final /* synthetic */ C75797d f170279a;

        static {
            Covode.recordClassIndex(88732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75798a(C75797d dVar) {
            super(0);
            this.f170279a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75791a invoke() {
            return new C75791a(this.f170279a.f170264f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75718w
    /* renamed from: c */
    public final AbstractC75706l mo119457c() {
        return this.f170274p.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75718w
    /* renamed from: d */
    public final AbstractC75709o mo119458d() {
        return this.f170273o.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75718w
    /* renamed from: f */
    public final AbstractC75701h mo119460f() {
        return this.f170272n.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75718w
    /* renamed from: g */
    public final AbstractC75711q mo119461g() {
        return this.f170276r.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75718w
    /* renamed from: h */
    public final AbstractC75716u mo119462h() {
        return this.f170277s.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75718w
    /* renamed from: i */
    public final AbstractC75704j mo119463i() {
        return this.f170278t.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.internals.AbstractC75749b
    /* renamed from: k */
    public final AbstractC88979t<AbstractC75689aa<?>> mo119493k() {
        AbstractC88979t<AbstractC75689aa<?>> c = this.f170262d.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.internals.AbstractC75749b
    /* renamed from: l */
    public final AbstractC88979t<C89378p<String, AbstractC75689aa<?>>> mo119494l() {
        AbstractC88979t<C89378p<String, AbstractC75689aa<?>>> c = this.f170263e.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.internals.AbstractC75749b
    /* renamed from: m */
    public final AbstractC88979t<AbstractC75689aa<?>> mo119495m() {
        AbstractC88979t<AbstractC75689aa<?>> c = this.f170259a.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.internals.AbstractC75749b
    /* renamed from: n */
    public final AbstractC88979t<AbstractC75689aa<?>> mo119496n() {
        AbstractC88979t<AbstractC75689aa<?>> c = this.f170260b.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.internals.AbstractC75749b
    /* renamed from: o */
    public final AbstractC88979t<AbstractC75689aa<?>> mo119497o() {
        AbstractC88979t<AbstractC75689aa<?>> c = this.f170261c.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.internals.AbstractC75749b
    /* renamed from: p */
    public final AbstractC88979t<AbstractC75696e.AbstractC75697a> mo119498p() {
        AbstractC88979t<AbstractC75696e.AbstractC75697a> c = this.f170264f.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75718w
    /* renamed from: a */
    public final void mo119451a() {
        this.f170260b.onNext(C75722z.f170130a);
        this.f170265g.mo78889a(new C75807j(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75718w
    /* renamed from: b */
    public final void mo119455b() {
        this.f170265g.destroy();
        this.f170271m.mo119507h();
        AbstractC89244h<AbstractC75742a> hVar = this.f170272n;
        if (hVar.isInitialized()) {
            hVar.getValue().mo119492d();
        }
        AbstractC89244h<AbstractC75704j> hVar2 = this.f170278t;
        if (hVar2.isInitialized()) {
            hVar2.getValue().mo119433b();
        }
        this.f170267i.dispose();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.d$i */
    static final class C75806i<T> implements AbstractC88433f<AbstractC75689aa<?>> {

        /* renamed from: a */
        final /* synthetic */ C75797d f170289a;

        static {
            Covode.recordClassIndex(88740);
        }

        C75806i(C75797d dVar) {
            this.f170289a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(AbstractC75689aa<?> aaVar) {
            this.f170289a.f170262d.onNext(aaVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.d$j */
    public static final class C75807j implements AbstractC86796e<RecommendSearchWordsResponse> {

        /* renamed from: a */
        final /* synthetic */ C75797d f170290a;

        static {
            Covode.recordClassIndex(88741);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C75807j(C75797d dVar) {
            this.f170290a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onSuccess(RecommendSearchWordsResponse recommendSearchWordsResponse) {
            C89219l.m154721d(recommendSearchWordsResponse, "");
            this.f170290a.f170260b.onNext(new C75692ad(recommendSearchWordsResponse));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onFail(RecommendSearchWordsResponse recommendSearchWordsResponse, C86840e eVar) {
            C89219l.m154721d(eVar, "");
            C88958b<AbstractC75689aa<?>> bVar = this.f170290a.f170260b;
            Exception exc = eVar.f195758c;
            if (exc == null) {
                exc = new Exception("search sticker error ,msg :" + eVar.f195757b);
            }
            bVar.onNext(new C75687a(exc));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.d$k */
    public static final class C75808k implements ISearchEffectListenerV2 {

        /* renamed from: a */
        final /* synthetic */ C75797d f170291a;

        static {
            Covode.recordClassIndex(88742);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C75808k(C75797d dVar) {
            this.f170291a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(SearchEffectResponseV2 searchEffectResponseV2) {
            C89219l.m154721d(searchEffectResponseV2, "");
            this.f170291a.f170259a.onNext(new C75692ad(searchEffectResponseV2));
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2
        public final void onFail(ExceptionResult exceptionResult) {
            Exception statusCodeException;
            C89219l.m154721d(exceptionResult, "");
            if (exceptionResult.getException() != null) {
                statusCodeException = exceptionResult.getException();
            } else {
                statusCodeException = new StatusCodeException(exceptionResult.getErrorCode(), "search stickers failed");
            }
            C88958b<AbstractC75689aa<?>> bVar = this.f170291a.f170259a;
            C89219l.m154716b(statusCodeException, "");
            bVar.onNext(new C75687a(statusCodeException));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.d$l */
    public static final class C75809l implements ISearchEffectListenerV2 {

        /* renamed from: a */
        final /* synthetic */ C75797d f170292a;

        static {
            Covode.recordClassIndex(88743);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C75809l(C75797d dVar) {
            this.f170292a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(SearchEffectResponseV2 searchEffectResponseV2) {
            C89219l.m154721d(searchEffectResponseV2, "");
            this.f170292a.f170259a.onNext(new C75692ad(searchEffectResponseV2));
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2
        public final void onFail(ExceptionResult exceptionResult) {
            Exception statusCodeException;
            C89219l.m154721d(exceptionResult, "");
            if (exceptionResult.getException() != null) {
                statusCodeException = exceptionResult.getException();
            } else {
                statusCodeException = new StatusCodeException(exceptionResult.getErrorCode(), "search stickers failed");
            }
            C88958b<AbstractC75689aa<?>> bVar = this.f170292a.f170259a;
            C89219l.m154716b(statusCodeException, "");
            bVar.onNext(new C75687a(statusCodeException));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.d$c */
    static final class C75800c<T, R> implements AbstractC88434g<CategoryEffectModel, AbstractC75689aa<?>> {

        /* renamed from: a */
        public static final C75800c f170282a = new C75800c();

        static {
            Covode.recordClassIndex(88734);
        }

        C75800c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ AbstractC75689aa<?> apply(CategoryEffectModel categoryEffectModel) {
            C89219l.m154721d(categoryEffectModel, "");
            return new C75692ad(categoryEffectModel);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.d$d */
    static final class C75801d<T, R> implements AbstractC88434g<Throwable, AbstractC75689aa<?>> {

        /* renamed from: a */
        public static final C75801d f170283a = new C75801d();

        static {
            Covode.recordClassIndex(88735);
        }

        C75801d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ AbstractC75689aa<?> apply(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            return new C75687a(th2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.d$e */
    static final class C75802e<T> implements AbstractC88433f<AbstractC75689aa<?>> {

        /* renamed from: a */
        final /* synthetic */ C75797d f170284a;

        /* renamed from: b */
        final /* synthetic */ C75726a f170285b;

        static {
            Covode.recordClassIndex(88736);
        }

        C75802e(C75797d dVar, C75726a aVar) {
            this.f170284a = dVar;
            this.f170285b = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(AbstractC75689aa<?> aaVar) {
            this.f170284a.f170263e.onNext(C89387v.m154943a(this.f170285b.f170131a, aaVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.d$f */
    static final class C75803f<T> implements AbstractC88433f<AbstractC88412b> {

        /* renamed from: a */
        final /* synthetic */ C75797d f170286a;

        static {
            Covode.recordClassIndex(88737);
        }

        C75803f(C75797d dVar) {
            this.f170286a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(AbstractC88412b bVar) {
            this.f170286a.f170262d.onNext(C75722z.f170130a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.d$g */
    static final class C75804g<T, R> implements AbstractC88434g<PanelInfoModel, AbstractC75689aa<?>> {

        /* renamed from: a */
        public static final C75804g f170287a = new C75804g();

        static {
            Covode.recordClassIndex(88738);
        }

        C75804g() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ AbstractC75689aa<?> apply(PanelInfoModel panelInfoModel) {
            C89219l.m154721d(panelInfoModel, "");
            return new C75692ad(panelInfoModel);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.d$h */
    static final class C75805h<T, R> implements AbstractC88434g<Throwable, AbstractC75689aa<?>> {

        /* renamed from: a */
        public static final C75805h f170288a = new C75805h();

        static {
            Covode.recordClassIndex(88739);
        }

        C75805h() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ AbstractC75689aa<?> apply(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            return new C75687a(th2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.d$b */
    static final class C75799b<T> implements AbstractC88433f<AbstractC88412b> {

        /* renamed from: a */
        final /* synthetic */ C75797d f170280a;

        /* renamed from: b */
        final /* synthetic */ C75726a f170281b;

        static {
            Covode.recordClassIndex(88733);
        }

        C75799b(C75797d dVar, C75726a aVar) {
            this.f170280a = dVar;
            this.f170281b = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(AbstractC88412b bVar) {
            this.f170280a.f170263e.onNext(C89387v.m154943a(this.f170281b.f170131a, C75722z.f170130a));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75718w
    /* renamed from: a */
    public final void mo119452a(C75726a aVar) {
        C89219l.m154721d(aVar, "");
        this.f170267i.mo142945a(this.f170269k.mo33487c(aVar).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143285c(new C75799b(this, aVar)).mo143292d(C75800c.f170282a).mo143299f(C75801d.f170283a).mo143289d(new C75802e(this, aVar)));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75718w
    /* renamed from: a */
    public final void mo119453a(C75728c cVar) {
        C89219l.m154721d(cVar, "");
        this.f170259a.onNext(C75722z.f170130a);
        this.f170265g.mo78895a(cVar.f170141a, cVar.f170142b, cVar.f170143c, cVar.f170144d, cVar.f170145e, new C75809l(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75718w
    /* renamed from: b */
    public final void mo119456b(C75728c cVar) {
        C89219l.m154721d(cVar, "");
        this.f170259a.onNext(C75722z.f170130a);
        this.f170265g.mo78900a(cVar.f170147g, cVar.f170141a, "word", cVar.f170142b, cVar.f170143c, cVar.f170144d, C89041ag.m154415a(), new C75808k(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75718w
    /* renamed from: a */
    public final void mo119454a(C75729d dVar) {
        C89219l.m154721d(dVar, "");
        this.f170267i.mo142945a(this.f170270l.mo33487c(dVar).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143285c(new C75803f(this)).mo143292d(C75804g.f170287a).mo143299f(C75805h.f170288a).mo143289d(new C75806i(this)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.internals.a> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.o> */
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.l> */
    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.r> */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.v> */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public C75797d(String str, AbstractC84398d dVar, AbstractC20181b<C89391z, CategoryEffectModel, C75726a, CategoryEffectModel> bVar, AbstractC20181b<C89391z, PanelInfoModel, C75729d, PanelInfoModel> bVar2, AbstractC75761c cVar, AbstractC89244h<? extends AbstractC75742a> hVar, AbstractC89244h<? extends AbstractC75709o> hVar2, AbstractC89244h<? extends AbstractC75706l> hVar3, AbstractC75710p pVar, AbstractC89244h<? extends AbstractC75713r> hVar4, AbstractC89244h<? extends AbstractC75717v> hVar5, AbstractC89244h<? extends AbstractC75704j> hVar6) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(hVar2, "");
        C89219l.m154721d(hVar3, "");
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(hVar4, "");
        C89219l.m154721d(hVar5, "");
        C89219l.m154721d(hVar6, "");
        this.f170268j = str;
        this.f170265g = dVar;
        this.f170269k = bVar;
        this.f170270l = bVar2;
        this.f170271m = cVar;
        this.f170272n = hVar;
        this.f170273o = hVar2;
        this.f170274p = hVar3;
        this.f170275q = pVar;
        this.f170276r = hVar4;
        this.f170277s = hVar5;
        this.f170278t = hVar6;
        C88958b<AbstractC75689aa<?>> bVar3 = new C88958b<>();
        C89219l.m154716b(bVar3, "");
        this.f170259a = bVar3;
        C88958b<AbstractC75689aa<?>> bVar4 = new C88958b<>();
        C89219l.m154716b(bVar4, "");
        this.f170260b = bVar4;
        C88958b<AbstractC75689aa<?>> bVar5 = new C88958b<>();
        C89219l.m154716b(bVar5, "");
        this.f170261c = bVar5;
        C88958b<AbstractC75689aa<?>> bVar6 = new C88958b<>();
        C89219l.m154716b(bVar6, "");
        this.f170262d = bVar6;
        C88958b<C89378p<String, AbstractC75689aa<?>>> bVar7 = new C88958b<>();
        C89219l.m154716b(bVar7, "");
        this.f170263e = bVar7;
        C88960c<AbstractC75696e.AbstractC75697a> cVar2 = new C88960c<>();
        C89219l.m154716b(cVar2, "");
        this.f170264f = cVar2;
        cVar.mo119506a(this);
        ((AbstractC75717v) hVar5.getValue()).mo119450a(this);
        this.f170267i = new C88411a();
    }
}
