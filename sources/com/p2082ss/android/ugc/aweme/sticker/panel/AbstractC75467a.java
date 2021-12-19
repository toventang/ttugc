package com.p2082ss.android.ugc.aweme.sticker.panel;

import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.services.IStickerService;
import com.p2082ss.android.ugc.aweme.framework.services.StickerTagChangeData;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75345d;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3971a.AbstractC75474b;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3971a.C75476d;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75621d;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76331c;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76121h;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76128m;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.EnumC76135n;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.a */
public abstract class AbstractC75467a implements AbstractC75573i {

    /* renamed from: a */
    public final C1213t<Integer> f169570a = new C1213t<>();

    /* renamed from: b */
    public final C1213t<IStickerService.FaceSticker> f169571b = new C1213t<>();

    /* renamed from: c */
    public final C1213t<StickerTagChangeData> f169572c = new C1213t<>();

    /* renamed from: d */
    public final C1213t<Boolean> f169573d = new C1213t<>();

    /* renamed from: e */
    public final List<AbstractC75576l> f169574e = new ArrayList();

    /* renamed from: f */
    public final List<AbstractC75301e> f169575f = new ArrayList();

    /* renamed from: g */
    public final C75472b f169576g = new C75472b(this);

    /* renamed from: h */
    public final AbstractC75474b f169577h = new C75476d();

    /* renamed from: i */
    public final AbstractC1204m f169578i;

    /* renamed from: j */
    public final AbstractC75655o f169579j;

    /* renamed from: k */
    private final AbstractC89244h f169580k = C89250i.m154773a((AbstractC89171a) new C75468a(this));

    static {
        Covode.recordClassIndex(88389);
    }

    /* renamed from: n */
    private AbstractC76121h m132375n() {
        return (AbstractC76121h) this.f169580k.getValue();
    }

    /* renamed from: a */
    public abstract AbstractC76121h mo119130a(AbstractC75301e eVar);

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75573i
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ LiveData mo119129a() {
        return this.f169572c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75573i
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ LiveData mo119136b() {
        return this.f169573d;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75573i
    /* renamed from: c */
    public final AbstractC75474b mo119139c() {
        return this.f169577h;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76121h
    /* renamed from: f */
    public final void mo119142f() {
        m132375n().mo119142f();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76121h
    /* renamed from: g */
    public final void mo119143g() {
        m132375n().mo119143g();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76121h
    /* renamed from: l */
    public final void mo119148l() {
        m132375n().mo119148l();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76121h
    /* renamed from: d */
    public final boolean mo119140d() {
        return m132375n().mo119140d();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76121h
    /* renamed from: e */
    public final AbstractC76331c mo119141e() {
        return m132375n().mo119141e();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76118e
    /* renamed from: h */
    public final AbstractC88979t<Integer> mo119144h() {
        return m132375n().mo119144h();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76121h
    /* renamed from: i */
    public final AbstractC88979t<Boolean> mo119145i() {
        return m132375n().mo119145i();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76121h
    /* renamed from: j */
    public final AbstractC88979t<EnumC76135n> mo119146j() {
        return m132375n().mo119146j();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76121h
    /* renamed from: k */
    public final AbstractC88979t<AbstractC76128m> mo119147k() {
        return m132375n().mo119147k();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.a$a */
    static final class C75468a extends AbstractC89220m implements AbstractC89171a<AbstractC76121h> {

        /* renamed from: a */
        final /* synthetic */ AbstractC75467a f169581a;

        static {
            Covode.recordClassIndex(88390);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75468a(AbstractC75467a aVar) {
            super(0);
            this.f169581a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC76121h invoke() {
            AbstractC75467a aVar = this.f169581a;
            AbstractC76121h a = aVar.mo119130a(aVar.f169576g);
            a.mo119147k().mo143254a(new C75469a(this), C88446a.f200699e);
            a.mo119146j().mo143254a(new C75470b(this), C88446a.f200699e);
            a.mo119145i().mo143254a(new C75471c(this), C88446a.f200699e);
            return a;
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.panel.a$a$c */
        static final class C75471c<T> implements AbstractC88433f<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C75468a f169584a;

            static {
                Covode.recordClassIndex(88393);
            }

            C75471c(C75468a aVar) {
                this.f169584a = aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Boolean bool) {
                this.f169584a.f169581a.f169573d.setValue(bool);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.panel.a$a$a */
        static final class C75469a<T> implements AbstractC88433f<AbstractC76128m> {

            /* renamed from: a */
            final /* synthetic */ C75468a f169582a;

            static {
                Covode.recordClassIndex(88391);
            }

            C75469a(C75468a aVar) {
                this.f169582a = aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(AbstractC76128m mVar) {
                AbstractC76128m mVar2 = mVar;
                if (mVar2 instanceof AbstractC76128m.C76132d) {
                    AbstractC76128m.C76132d dVar = (AbstractC76128m.C76132d) mVar2;
                    String name = dVar.f171033a.getName();
                    String key = dVar.f171033a.getKey();
                    if (name != null && name.length() != 0 && key != null && key.length() != 0) {
                        this.f169582a.f169581a.f169572c.setValue(new StickerTagChangeData(this.f169582a.f169581a.f169579j.mo119305p().f170069a, name, key));
                    }
                } else if (mVar2 instanceof AbstractC76128m.C76134f) {
                    Iterator<T> it = this.f169582a.f169581a.f169574e.iterator();
                    while (it.hasNext()) {
                        it.next().mo23175a(((AbstractC76128m.C76134f) mVar2).f171037a);
                    }
                } else if (mVar2 instanceof AbstractC76128m.C76130b) {
                    Iterator<T> it2 = this.f169582a.f169581a.f169574e.iterator();
                    while (it2.hasNext()) {
                        it2.next().cD_();
                    }
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.panel.a$a$b */
        static final class C75470b<T> implements AbstractC88433f<EnumC76135n> {

            /* renamed from: a */
            final /* synthetic */ C75468a f169583a;

            static {
                Covode.recordClassIndex(88392);
            }

            C75470b(C75468a aVar) {
                this.f169583a = aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(EnumC76135n nVar) {
                EnumC76135n nVar2 = nVar;
                if (nVar2 != null) {
                    int i = C75478b.f169596a[nVar2.ordinal()];
                    if (i == 1) {
                        this.f169583a.f169581a.f169570a.setValue(0);
                        Iterator<T> it = this.f169583a.f169581a.f169574e.iterator();
                        while (it.hasNext()) {
                            it.next().mo23176a(AbstractC75576l.EnumC75577a.BEFORE_ANIMATE);
                        }
                    } else if (i == 2) {
                        Iterator<T> it2 = this.f169583a.f169581a.f169574e.iterator();
                        while (it2.hasNext()) {
                            it2.next().mo23176a(AbstractC75576l.EnumC75577a.AFTER_ANIMATE);
                        }
                    } else if (i == 3) {
                        Iterator<T> it3 = this.f169583a.f169581a.f169574e.iterator();
                        while (it3.hasNext()) {
                            it3.next().mo23177b(AbstractC75576l.EnumC75577a.BEFORE_ANIMATE);
                        }
                    } else if (i == 4) {
                        this.f169583a.f169581a.f169570a.setValue(8);
                        Iterator<T> it4 = this.f169583a.f169581a.f169574e.iterator();
                        while (it4.hasNext()) {
                            it4.next().mo23177b(AbstractC75576l.EnumC75577a.AFTER_ANIMATE);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.a$b */
    public static final class C75472b implements AbstractC75301e {

        /* renamed from: a */
        final /* synthetic */ AbstractC75467a f169585a;

        static {
            Covode.recordClassIndex(88394);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C75472b(AbstractC75467a aVar) {
            this.f169585a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e
        /* renamed from: a */
        public final void mo87551a(C75618a aVar) {
            C89219l.m154721d(aVar, "");
            Iterator<T> it = this.f169585a.f169575f.iterator();
            while (it.hasNext()) {
                it.next().mo87551a(aVar);
            }
            this.f169585a.f169571b.setValue(C75345d.m132152a(aVar.f170022a));
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e
        /* renamed from: a */
        public final void mo87552a(C75621d dVar) {
            C89219l.m154721d(dVar, "");
            Iterator<T> it = this.f169585a.f169575f.iterator();
            while (it.hasNext()) {
                it.next().mo87552a(dVar);
            }
            this.f169585a.f169571b.setValue(null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75573i
    /* renamed from: a */
    public final void mo119132a(AbstractC1214u<StickerTagChangeData> uVar) {
        C89219l.m154721d(uVar, "");
        this.f169572c.observe(this.f169578i, uVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75573i
    /* renamed from: b */
    public final void mo119138b(AbstractC75301e eVar) {
        C89219l.m154721d(eVar, "");
        if (!this.f169575f.contains(eVar)) {
            this.f169575f.add(eVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75521f
    /* renamed from: a */
    public final void mo119133a(AbstractC75498c cVar) {
        C89219l.m154721d(cVar, "");
        m132375n().mo119133a(cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75573i
    /* renamed from: a */
    public final void mo119134a(AbstractC75576l lVar) {
        C89219l.m154721d(lVar, "");
        if (!this.f169574e.contains(lVar)) {
            this.f169574e.add(lVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76116c
    /* renamed from: a */
    public final void mo119135a(List<EffectCategoryModel> list) {
        C89219l.m154721d(list, "");
        m132375n().mo119135a(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76118e
    /* renamed from: b */
    public final void mo119137b(int i, boolean z) {
        m132375n().mo119137b(i, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76117d
    /* renamed from: a */
    public final void mo119131a(int i, boolean z) {
        m132375n().mo119131a(i, z);
    }

    public AbstractC75467a(AbstractC1204m mVar, AbstractC75655o oVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(oVar, "");
        this.f169578i = mVar;
        this.f169579j = oVar;
    }
}
