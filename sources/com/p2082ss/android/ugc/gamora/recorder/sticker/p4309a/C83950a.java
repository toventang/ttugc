package com.p2082ss.android.ugc.gamora.recorder.sticker.p4309a;

import android.util.Pair;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.bytedance.creativex.recorder.sticker.p948b.C14335a;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75275d;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75314e;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3955a.C75289c;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.AbstractC75296b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75711q;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.AbstractC75730a;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.C75734e;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.C75735f;
import com.p2082ss.android.ugc.aweme.sticker.types.game.GameResultViewModel;
import com.p2082ss.android.ugc.aweme.sticker.types.game.p4011a.AbstractC76065a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4312a.C83971b;
import com.p2082ss.android.ugc.tools.utils.C84909p;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4589j.C88934a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a */
public final class C83950a extends AbstractC2562j<AbstractC75314e> implements AbstractC21566a, AbstractC75314e {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f187408a = {new C89232y(C83950a.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0)};

    /* renamed from: b */
    public final AbstractC75314e f187409b = this;

    /* renamed from: c */
    public final C2563k<AbstractC75275d> f187410c = new C2563k<>();

    /* renamed from: d */
    public final ActivityC0945e f187411d = ((ActivityC0945e) getDiContainer().mo35249a(ActivityC0945e.class, (String) null));

    /* renamed from: e */
    public final ShortVideoContext f187412e = ((ShortVideoContext) getDiContainer().mo35249a(ShortVideoContext.class, (String) null));

    /* renamed from: f */
    private final AbstractC89248d f187413f = C21572a.m40504a(getDiContainer(), AbstractC14330a.class);

    /* renamed from: g */
    private AbstractC75633m f187414g;

    /* renamed from: h */
    private AbstractC75633m f187415h;

    /* renamed from: i */
    private final AbstractC89244h f187416i = C89250i.m154773a((AbstractC89171a) new C83951a(this));

    /* renamed from: j */
    private final C88411a f187417j = new C88411a();

    /* renamed from: k */
    private final C21582f f187418k;

    static {
        Covode.recordClassIndex(97843);
    }

    /* renamed from: d */
    private final AbstractC76065a m144387d() {
        return (AbstractC76065a) this.f187416i.getValue();
    }

    /* renamed from: c */
    public final AbstractC14330a mo128835c() {
        return (AbstractC14330a) this.f187413f.mo23374a(this, f187408a[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.AbstractC75314e
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2559g mo118896a() {
        return this.f187410c;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC75314e getApiComponent() {
        return this.f187409b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f187418k;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.AbstractC75314e
    /* renamed from: b */
    public final boolean mo118897b() {
        View findViewById = this.f187411d.findViewById(R.id.c48);
        if (findViewById == null || findViewById.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onDestroy() {
        super.onDestroy();
        this.f187417j.mo142944a();
        AbstractC75633m mVar = this.f187414g;
        if (mVar != null) {
            mo128835c().mo23161b(mVar);
        }
        AbstractC75633m mVar2 = this.f187415h;
        if (mVar2 != null) {
            mo128835c().mo23161b(mVar2);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a$a */
    static final class C83951a extends AbstractC89220m implements AbstractC89171a<C83956c> {

        /* renamed from: a */
        final /* synthetic */ C83950a f187419a;

        static {
            Covode.recordClassIndex(97844);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83951a(C83950a aVar) {
            super(0);
            this.f187419a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C83956c invoke() {
            return new C83956c(this.f187419a.f187411d, (AbstractC14177d) this.f187419a.getDiContainer().mo35248a(AbstractC14177d.class, (String) null), (AbstractC14099a) this.f187419a.getDiContainer().mo35248a(AbstractC14099a.class, (String) null), (AbstractC14210a) this.f187419a.getDiContainer().mo35252b(AbstractC14210a.class, null), this.f187419a.mo128835c(), this.f187419a.f187412e, this.f187419a.f187410c);
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        AbstractC1174ac a = C1181ae.m3881a(this.f187411d, (C1175ad.AbstractC1177b) null).mo3983a(GameResultViewModel.class);
        C89219l.m154716b(a, "");
        AbstractC88412b a2 = mo128835c().mo23125g().mo143254a(new C83952b((GameResultViewModel) a), C84909p.f189747a);
        C89219l.m154716b(a2, "");
        C88934a.m154195a(a2, this.f187417j);
        AbstractC75711q.AbstractC75712a a3 = mo128835c().mo23167t().mo119291c().mo119461g().mo119441a();
        a3.mo119445a(C83953c.f187421a);
        ShortVideoContext shortVideoContext = this.f187412e;
        if (shortVideoContext.f155817b.mo109890c() || CommentUtils.isDataValid(shortVideoContext.f155825j) || shortVideoContext.mo110022c()) {
            a3.mo119444a(new C75735f());
        }
        if (shortVideoContext.f155817b.mo109890c() || shortVideoContext.f155817b.mo109889b() || CommentUtils.isDataValid(shortVideoContext.f155825j) || shortVideoContext.f155817b.f155653i || shortVideoContext.mo110022c()) {
            a3.mo119444a(new C75734e());
        }
        a3.mo119443a();
        AbstractC75300d u = mo128835c().mo23168u();
        u.mo118612a(new C75289c(this.f187411d, mo128835c().mo23122d(), this.f187412e, new C83954d(u)));
        AbstractC83955b bVar = (AbstractC83955b) getDiContainer().mo35252b(AbstractC83955b.class, null);
        if (bVar == null) {
            bVar = new C83971b(getDiContainer());
        }
        this.f187414g = bVar.mo128836a(mo128835c(), m144387d());
        this.f187415h = bVar.mo128837b(mo128835c(), m144387d());
        AbstractC75633m mVar = this.f187414g;
        if (mVar != null) {
            mo128835c().mo23157a(mVar);
        }
        AbstractC75633m mVar2 = this.f187415h;
        if (mVar2 != null) {
            mo128835c().mo23157a(mVar2);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a$d */
    static final class C83954d extends AbstractC89220m implements AbstractC89172b<AbstractC75296b<?>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC75300d f187422a;

        static {
            Covode.recordClassIndex(97847);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83954d(AbstractC75300d dVar) {
            super(1);
            this.f187422a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC75296b<?> bVar) {
            AbstractC75296b<?> bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            this.f187422a.mo118613a(bVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a$c */
    static final class C83953c extends AbstractC89220m implements AbstractC89172b<AbstractC75730a, Boolean> {

        /* renamed from: a */
        public static final C83953c f187421a = new C83953c();

        static {
            Covode.recordClassIndex(97846);
        }

        C83953c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC75730a aVar) {
            boolean z;
            C89219l.m154721d(aVar, "");
            if ((aVar instanceof C75735f) || (aVar instanceof C75734e)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a$b */
    static final class C83952b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ GameResultViewModel f187420a;

        static {
            Covode.recordClassIndex(97845);
        }

        C83952b(GameResultViewModel gameResultViewModel) {
            this.f187420a = gameResultViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C14335a aVar = (C14335a) ((C89378p) obj).component2();
            int i = aVar.f34706a;
            int i2 = aVar.f34707b;
            if (i == 4099 || i == 49) {
                this.f187420a.mo119778a().postValue(new Pair<>(true, Integer.valueOf(i2)));
            }
            if (i == 4104) {
                this.f187420a.mo119779b().postValue(Integer.valueOf(i));
            }
        }
    }

    public C83950a(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f187418k = fVar;
    }
}
