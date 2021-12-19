package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3991c;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1447b.C20155b;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20181b;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20191d;
import com.bytedance.jedi.p1445a.p1460j.AbstractC20287b;
import com.bytedance.jedi.p1445a.p1460j.AbstractC20288c;
import com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.AbstractC75742a;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75703i;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75693b;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.EnumC75694c;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3985b.C75724a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.c.a */
public final class C75762a extends AbstractC20287b implements AbstractC75703i, AbstractC75742a {

    /* renamed from: b */
    public final C75724a<FetchFavoriteListResponse> f170189b;

    /* renamed from: c */
    public final C1213t<C35324a<FetchFavoriteListResponse>> f170190c = new C1213t<>();

    /* renamed from: d */
    private final C1213t<C75693b> f170191d = new C1213t<>();

    /* renamed from: e */
    private final C1213t<Boolean> f170192e = new C1213t<>();

    /* renamed from: f */
    private final AbstractC20181b<C89391z, C75774d, C75774d, List<String>> f170193f;

    /* renamed from: g */
    private final AbstractC20191d<C89391z, FetchFavoriteListResponse> f170194g;

    static {
        Covode.recordClassIndex(88696);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75701h
    /* renamed from: a */
    public final AbstractC75703i mo119423a() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75703i
    /* renamed from: b */
    public final LiveData<C35324a<FetchFavoriteListResponse>> mo119428b() {
        return this.f170190c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75703i
    /* renamed from: c */
    public final LiveData<Boolean> mo119429c() {
        return this.f170192e;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.internals.AbstractC75742a
    /* renamed from: d */
    public final void mo119492d() {
        bt_();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.c.a$a */
    static final class C75763a<T> implements AbstractC88433f<AbstractC88412b> {

        /* renamed from: a */
        final /* synthetic */ C75762a f170195a;

        /* renamed from: b */
        final /* synthetic */ Effect f170196b;

        /* renamed from: c */
        final /* synthetic */ boolean f170197c;

        /* renamed from: d */
        final /* synthetic */ EnumC75694c f170198d;

        static {
            Covode.recordClassIndex(88697);
        }

        C75763a(C75762a aVar, Effect effect, boolean z, EnumC75694c cVar) {
            this.f170195a = aVar;
            this.f170196b = effect;
            this.f170197c = z;
            this.f170198d = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(AbstractC88412b bVar) {
            this.f170195a.mo119508b(this.f170196b, !this.f170197c, this.f170198d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.c.a$b */
    static final class C75764b<T> implements AbstractC88433f<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C75762a f170199a;

        /* renamed from: b */
        final /* synthetic */ Effect f170200b;

        /* renamed from: c */
        final /* synthetic */ boolean f170201c;

        /* renamed from: d */
        final /* synthetic */ EnumC75694c f170202d;

        static {
            Covode.recordClassIndex(88698);
        }

        C75764b(C75762a aVar, Effect effect, boolean z, EnumC75694c cVar) {
            this.f170199a = aVar;
            this.f170200b = effect;
            this.f170201c = z;
            this.f170202d = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Throwable th) {
            this.f170199a.mo119508b(this.f170200b, this.f170201c, this.f170202d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.c.a$d */
    static final class C75766d<T> implements AbstractC88433f<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C75762a f170204a;

        static {
            Covode.recordClassIndex(88700);
        }

        C75766d(C75762a aVar) {
            this.f170204a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Throwable th) {
            this.f170204a.f170190c.setValue(C35324a.m72280a(C35324a.EnumC35325a.ERROR, th));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75701h
    /* renamed from: b */
    public final void mo119427b(boolean z) {
        this.f170192e.setValue(Boolean.valueOf(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.c.a$c */
    static final class C75765c<T> implements AbstractC88433f<FetchFavoriteListResponse> {

        /* renamed from: a */
        final /* synthetic */ C75762a f170203a;

        static {
            Covode.recordClassIndex(88699);
        }

        C75765c(C75762a aVar) {
            this.f170203a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(FetchFavoriteListResponse fetchFavoriteListResponse) {
            this.f170203a.f170189b.mo33457a(C89391z.f203057a, fetchFavoriteListResponse);
            this.f170203a.f170190c.setValue(C35324a.m72279a(C35324a.EnumC35325a.SUCCESS, fetchFavoriteListResponse));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75701h
    /* renamed from: a */
    public final AbstractC88403ab<FetchFavoriteListResponse> mo119425a(boolean z) {
        AbstractC20181b a;
        if (z) {
            a = this.f170194g;
        } else {
            a = C20155b.m38133a(this.f170194g, this.f170189b, C20155b.C20156a.f47930a).mo33480a(C75767e.f170205a);
        }
        AbstractC88403ab<FetchFavoriteListResponse> c = AbstractC88403ab.m153601a((AbstractC88984x) a.mo33487c(C89391z.f203057a)).mo142920b((AbstractC88433f) new C75765c(this)).mo142924c(new C75766d(this));
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75701h
    /* renamed from: a */
    public final boolean mo119426a(String str) {
        FetchFavoriteListResponse b;
        List<Effect> effects;
        if (str != null && (b = this.f170189b.mo33459b(C89391z.f203057a)) != null && (effects = b.getEffects()) != null) {
            Iterator<T> it = effects.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C89219l.m154714a((Object) next.getEffectId(), (Object) str)) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.c.a$e */
    static final class C75767e extends AbstractC89220m implements AbstractC89183m<AbstractC88979t<FetchFavoriteListResponse>, AbstractC88979t<FetchFavoriteListResponse>, AbstractC88979t<FetchFavoriteListResponse>> {

        /* renamed from: a */
        public static final C75767e f170205a = new C75767e();

        static {
            Covode.recordClassIndex(88701);
        }

        C75767e() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ AbstractC88979t<FetchFavoriteListResponse> invoke(AbstractC88979t<FetchFavoriteListResponse> tVar, AbstractC88979t<FetchFavoriteListResponse> tVar2) {
            AbstractC88979t<FetchFavoriteListResponse> tVar3 = tVar;
            AbstractC88979t<FetchFavoriteListResponse> tVar4 = tVar2;
            C89219l.m154721d(tVar3, "");
            C89219l.m154721d(tVar4, "");
            AbstractC88979t<FetchFavoriteListResponse> d = tVar4.mo143293d(tVar3);
            C89219l.m154716b(d, "");
            return d;
        }
    }

    public C75762a(AbstractC20181b<C89391z, C75774d, C75774d, List<String>> bVar, AbstractC20191d<C89391z, FetchFavoriteListResponse> dVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(dVar, "");
        this.f170193f = bVar;
        this.f170194g = dVar;
        C75724a<FetchFavoriteListResponse> aVar = new C75724a<>();
        this.f170189b = aVar;
        AbstractC20288c.m38482a(this, dVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75701h
    /* renamed from: a */
    public final AbstractC88403ab<List<String>> mo119424a(Effect effect, boolean z, EnumC75694c cVar) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(cVar, "");
        AbstractC88403ab<List<String>> c = AbstractC88403ab.m153601a((AbstractC88984x) this.f170193f.mo33487c(new C75774d(effect, !z))).mo142913a((AbstractC88433f<? super AbstractC88412b>) new C75763a(this, effect, z, cVar)).mo142924c(new C75764b(this, effect, z, cVar));
        C89219l.m154716b(c, "");
        return c;
    }

    /* renamed from: b */
    public final void mo119508b(Effect effect, boolean z, EnumC75694c cVar) {
        this.f170191d.setValue(new C75693b(z, effect, cVar));
        FetchFavoriteListResponse b = this.f170189b.mo33459b(C89391z.f203057a);
        if (b != null) {
            List<? extends Effect> g = C89070n.m154585g((Collection) b.getEffects());
            if (z) {
                g.add(0, effect);
            } else {
                Iterator<T> it = g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (C89219l.m154714a((Object) next.getEffectId(), (Object) effect.getEffectId())) {
                        if (next != null) {
                            effect = next;
                        }
                    }
                }
                g.remove(effect);
            }
            b.setEffects(g);
            this.f170189b.mo33457a(C89391z.f203057a, b);
            this.f170190c.setValue(C35324a.m72279a(C35324a.EnumC35325a.SUCCESS, b));
        }
    }
}
