package com.bytedance.jedi.ext.adapter;

import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1205n;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.arch.AbstractC20468h;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.adapter.internal.C20658b;
import com.bytedance.jedi.ext.adapter.internal.C20666f;
import com.bytedance.jedi.ext.adapter.internal.C20668g;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20630e;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

public abstract class JediViewHolder<R extends AbstractC20467g, ITEM> extends AbstractC20630e<ITEM> implements AbstractC1204m, AbstractC20673k<R>, AbstractC33974au {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f48643a = {new C89232y(C89204ab.m154669a(JediViewHolder.class), "lifecycleRegistry", "getLifecycleRegistry()Landroidx/lifecycle/LifecycleRegistry;")};

    /* renamed from: b */
    public AbstractC1204m f48644b;

    /* renamed from: c */
    public C20666f f48645c;

    /* renamed from: d */
    public JediViewHolderProxy f48646d;

    /* renamed from: e */
    public boolean f48647e;

    /* renamed from: f */
    private final AbstractC89244h f48648f = C89250i.m154773a((AbstractC89171a) new C20552a(this));

    /* renamed from: n */
    private final C1205n mo70807n() {
        return (C1205n) this.f48648f.getValue();
    }

    /* renamed from: a */
    public void mo33819a(List<Object> list) {
    }

    @Override // com.bytedance.jedi.ext.adapter.p1467b.AbstractC20630e
    /* renamed from: b */
    public final void mo33822b(ITEM item) {
    }

    public void cc_() {
    }

    /* renamed from: f */
    public void mo33828f() {
    }

    /* renamed from: g */
    public void mo33829g() {
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public boolean getUniqueOnlyGlobal() {
        return false;
    }

    /* renamed from: h */
    public void mo33830h() {
    }

    /* renamed from: i */
    public void mo33831i() {
    }

    /* renamed from: j */
    public void mo33832j() {
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            create$ext_adapter_release();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            start$ext_adapter_release();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            resume$ext_adapter_release();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            pause$ext_adapter_release();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            stop$ext_adapter_release();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            destroy$ext_adapter_release();
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.AbstractC20673k
    public final AbstractC20640c ax_() {
        return this.f48646d;
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.JediViewHolder$a */
    static final class C20552a extends AbstractC89220m implements AbstractC89171a<C1205n> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f48649a;

        static {
            Covode.recordClassIndex(24083);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20552a(JediViewHolder jediViewHolder) {
            super(0);
            this.f48649a = jediViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1205n invoke() {
            return new C1205n(this.f48649a);
        }
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        return mo70807n();
    }

    /* renamed from: m */
    private final C20658b mo63351m() {
        C20666f fVar = this.f48645c;
        if (fVar == null) {
            C89219l.m154710a("provider");
        }
        return fVar.f48872b;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void destroy$ext_adapter_release() {
        mo33832j();
        mo70808o();
        mo70807n().mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20534v getLifecycleOwnerHolder() {
        AbstractC20640c ax_ = ax_();
        if (ax_ != null) {
            return ax_;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20367ae<R> getReceiverHolder() {
        AbstractC20640c ax_ = ax_();
        if (ax_ != null) {
            return ax_;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: k */
    public final AbstractC1204m mo33833k() {
        AbstractC1204m mVar = this.f48644b;
        if (mVar == null) {
            C89219l.m154710a("parent");
        }
        return mVar;
    }

    static {
        Covode.recordClassIndex(24082);
    }

    /* renamed from: o */
    private final void mo70808o() {
        AbstractC1204m mVar = this.f48644b;
        if (mVar == null) {
            C89219l.m154710a("parent");
        }
        mVar.getLifecycle().mo4013b(this);
        mo70809p();
    }

    @Override // com.bytedance.jedi.ext.adapter.p1467b.AbstractC20630e
    public void cd_() {
        super.cd_();
        JediViewHolderProxy jediViewHolderProxy = this.f48646d;
        if (jediViewHolderProxy != null && this == jediViewHolderProxy.f48840b) {
            jediViewHolderProxy.f48841c = true;
        }
        mo70809p();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void pause$ext_adapter_release() {
        if (this.f48647e) {
            mo33830h();
            mo70807n().mo4016a(AbstractC1196i.EnumC1198a.ON_PAUSE);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void resume$ext_adapter_release() {
        if (this.f48647e) {
            mo33829g();
            mo70807n().mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public final void start$ext_adapter_release() {
        if (this.f48647e) {
            mo33828f();
            mo70807n().mo4016a(AbstractC1196i.EnumC1198a.ON_START);
            JediViewHolderProxy jediViewHolderProxy = this.f48646d;
            if (jediViewHolderProxy != null && this == jediViewHolderProxy.f48840b) {
                jediViewHolderProxy.mo33903a(false);
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void stop$ext_adapter_release() {
        if (this.f48647e) {
            mo33831i();
            mo70807n().mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
            JediViewHolderProxy jediViewHolderProxy = this.f48646d;
            if (jediViewHolderProxy != null && this == jediViewHolderProxy.f48840b) {
                jediViewHolderProxy.mo33904b(false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r1 != 3) goto L_0x0019;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void mo70809p() {
        /*
            r2 = this;
            androidx.lifecycle.i r0 = r2.getLifecycle()
            androidx.lifecycle.i$b r0 = r0.mo4011a()
            int[] r1 = com.bytedance.jedi.ext.adapter.C20653h.f48836b
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L_0x001d
            r0 = 2
            if (r1 == r0) goto L_0x0020
            r0 = 3
            if (r1 == r0) goto L_0x0020
        L_0x0019:
            r0 = 0
            r2.f48647e = r0
            return
        L_0x001d:
            r2.pause$ext_adapter_release()
        L_0x0020:
            r2.stop$ext_adapter_release()
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.JediViewHolder.mo70809p():void");
    }

    @Override // com.bytedance.jedi.ext.adapter.p1467b.AbstractC20630e
    public void ay_() {
        super.ay_();
        JediViewHolderProxy jediViewHolderProxy = this.f48646d;
        if (jediViewHolderProxy != null && this == jediViewHolderProxy.f48840b) {
            jediViewHolderProxy.f48841c = false;
        }
        this.f48647e = true;
        int i = C20653h.f48835a[getLifecycle().mo4011a().ordinal()];
        if (i == 2) {
            start$ext_adapter_release();
            resume$ext_adapter_release();
        } else if (i == 3) {
            resume$ext_adapter_release();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void create$ext_adapter_release() {
        C20658b m = mo63351m();
        int i = this.f48794i;
        if (i < 0 || i >= m.f48855a.size() || !m.f48855a.get(i).booleanValue()) {
            cc_();
            mo63351m().mo33915a(this.f48794i, true);
            mo70807n().mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JediViewHolder(View view) {
        super(view);
        C89219l.m154719c(view, "");
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154719c(vm1, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(vm1, "");
        C89219l.m154719c(bVar, "");
        return (R) AbstractC20468h.C20469a.m38675a(vm1, bVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super R, ? super S, C89391z> mVar) {
        C89219l.m154719c(jediViewModel, "");
        C89219l.m154719c(ahVar, "");
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(jediViewModel, "");
        C89219l.m154719c(ahVar, "");
        C89219l.m154719c(mVar, "");
        return AbstractC20468h.C20469a.m38663a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.p1467b.AbstractC20630e
    /* renamed from: b */
    public final void mo33823b(ITEM item, int i, List<Object> list) {
        JediViewHolderProxy jediViewHolderProxy;
        Object obj;
        super.mo33823b(item, i, list);
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (!(next instanceof C89378p)) {
                    next = null;
                }
                T t = next;
                if (t != null) {
                    obj = t.getSecond();
                } else {
                    obj = null;
                }
                if (obj == C20643e.f48811a) {
                    break;
                }
            }
        }
        this.f48647e = true;
        mo70808o();
        C20666f fVar = this.f48645c;
        if (fVar == null) {
            C89219l.m154710a("provider");
        }
        C20668g gVar = fVar.f48873c;
        if (i < 0 || i >= gVar.f48876a.size() || (jediViewHolderProxy = gVar.f48876a.get(i)) == null) {
            jediViewHolderProxy = fVar.f48871a.invoke();
            fVar.f48873c.mo33921a(i, jediViewHolderProxy);
        }
        JediViewHolderProxy jediViewHolderProxy2 = this.f48646d;
        if (!(jediViewHolderProxy == jediViewHolderProxy2 || jediViewHolderProxy2 == null || this != jediViewHolderProxy2.f48840b)) {
            C20666f fVar2 = this.f48645c;
            if (fVar2 == null) {
                C89219l.m154710a("provider");
            }
            jediViewHolderProxy2.mo33902a(fVar2.f48874d, null);
        }
        C20666f fVar3 = this.f48645c;
        if (fVar3 == null) {
            C89219l.m154710a("provider");
        }
        jediViewHolderProxy.mo33902a(fVar3.f48874d, this);
        this.f48647e = true;
        AbstractC1204m mVar = this.f48644b;
        if (mVar == null) {
            C89219l.m154710a("parent");
        }
        mVar.getLifecycle().mo4012a(this);
        mo33819a(list);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super R, ? super A, C89391z> mVar) {
        C89219l.m154719c(jediViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(ahVar, "");
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(jediViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(ahVar, "");
        C89219l.m154719c(mVar, "");
        return AbstractC20468h.C20469a.m38665a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super R, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154719c(jediViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C89219l.m154719c(ahVar, "");
        C89219l.m154719c(qVar, "");
        C89219l.m154719c(jediViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C89219l.m154719c(ahVar, "");
        C89219l.m154719c(qVar, "");
        return AbstractC20468h.C20469a.m38669a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super R, ? super Throwable, C89391z> mVar, AbstractC89172b<? super R, C89391z> bVar, AbstractC89183m<? super R, ? super T, C89391z> mVar2) {
        C89219l.m154719c(jediViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(ahVar, "");
        C89219l.m154719c(jediViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(ahVar, "");
        return AbstractC20468h.C20469a.m38666a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super R, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154719c(jediViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C89219l.m154719c(kVar3, "");
        C89219l.m154719c(ahVar, "");
        C89219l.m154719c(rVar, "");
        C89219l.m154719c(jediViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C89219l.m154719c(kVar3, "");
        C89219l.m154719c(ahVar, "");
        C89219l.m154719c(rVar, "");
        return AbstractC20468h.C20469a.m38671a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super R, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154719c(jediViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C89219l.m154719c(kVar3, "");
        C89219l.m154719c(kVar4, "");
        C89219l.m154719c(ahVar, "");
        C89219l.m154719c(sVar, "");
        C89219l.m154719c(jediViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C89219l.m154719c(kVar3, "");
        C89219l.m154719c(kVar4, "");
        C89219l.m154719c(ahVar, "");
        C89219l.m154719c(sVar, "");
        return AbstractC20468h.C20469a.m38673a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
