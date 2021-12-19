package com.p2082ss.android.ugc.aweme.shortvideo.editcut;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel */
public final class EditAdjustClipsBottomViewModel extends BaseJediViewModel<EditAdjustClipsBottomViewState> {

    /* renamed from: a */
    AbstractC20382b f160321a;

    static {
        Covode.recordClassIndex(84077);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel$a */
    public static final class C71534a implements AbstractC20382b {

        /* renamed from: a */
        final /* synthetic */ AbstractC1196i f160322a;

        static {
            Covode.recordClassIndex(84078);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20468h
        public final boolean getUniqueOnlyGlobal() {
            return true;
        }

        @Override // androidx.lifecycle.AbstractC1204m
        public final AbstractC1196i getLifecycle() {
            return this.f160322a;
        }

        /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
        @Override // com.bytedance.jedi.arch.AbstractC20367ae
        public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
            return this;
        }

        @Override // com.bytedance.jedi.arch.AbstractC20534v
        public final AbstractC1204m getLifecycleOwner() {
            return AbstractC20382b.C20383a.m38581a(this);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20468h
        public final AbstractC20534v getLifecycleOwnerHolder() {
            return AbstractC20382b.C20383a.m38601b(this);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20468h
        public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
            return AbstractC20382b.C20383a.m38604c(this);
        }

        C71534a(AbstractC1196i iVar) {
            this.f160322a = iVar;
        }

        @Override // com.bytedance.jedi.arch.AbstractC20382b
        public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
            C89219l.m154721d(vm1, "");
            return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20468h
        public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
            C89219l.m154721d(vm1, "");
            C89219l.m154721d(bVar, "");
            return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20468h
        public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(mVar, "");
            return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20382b
        public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(mVar, "");
            AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20468h
        public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(mVar, "");
            return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20382b
        public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(mVar, "");
            AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20382b
        public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(mVar, "");
            AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20468h
        public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(kVar2, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(qVar, "");
            return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20468h
        public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(ahVar, "");
            return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20468h
        public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(kVar2, "");
            C89219l.m154721d(kVar3, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(rVar, "");
            return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20468h
        public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(kVar2, "");
            C89219l.m154721d(kVar3, "");
            C89219l.m154721d(kVar4, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(sVar, "");
            return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
        }
    }

    /* renamed from: b */
    public final void mo113269b() {
        mo33690d(C71537d.f160326a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return m126440h();
    }

    /* renamed from: g */
    public final void mo113271g() {
        mo33690d(C71541h.f160331a);
    }

    /* renamed from: h */
    private static EditAdjustClipsBottomViewState m126440h() {
        return new EditAdjustClipsBottomViewState(0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    /* renamed from: a */
    public final EditAdjustClipsBottomViewState mo113264a() {
        EditAdjustClipsBottomViewState editAdjustClipsBottomViewState;
        AbstractC20382b bVar = this.f160321a;
        if (bVar == null || (editAdjustClipsBottomViewState = (EditAdjustClipsBottomViewState) bVar.getState(this)) == null) {
            return m126440h();
        }
        return editAdjustClipsBottomViewState;
    }

    /* renamed from: a */
    public final void mo113265a(float f) {
        mo33689c(new C71549p(f));
    }

    /* renamed from: b */
    public final void mo113270b(float f) {
        mo33689c(new C71548o(f));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel$b */
    static final class C71535b extends AbstractC89220m implements AbstractC89172b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {

        /* renamed from: a */
        final /* synthetic */ List f160323a;

        static {
            Covode.recordClassIndex(84079);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71535b(List list) {
            super(1);
            this.f160323a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            C89219l.m154721d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, null, null, null, null, null, null, null, new C20391d(this.f160323a), null, null, null, 61439, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel$c */
    static final class C71536c extends AbstractC89220m implements AbstractC89172b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {

        /* renamed from: a */
        final /* synthetic */ int f160324a;

        /* renamed from: b */
        final /* synthetic */ VideoSegment f160325b;

        static {
            Covode.recordClassIndex(84080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71536c(int i, VideoSegment videoSegment) {
            super(1);
            this.f160324a = i;
            this.f160325b = videoSegment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            C89219l.m154721d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, null, null, null, null, new C20524n(C89387v.m154943a(Integer.valueOf(this.f160324a), this.f160325b)), null, null, null, null, null, null, 65023, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel$d */
    static final class C71537d extends AbstractC89220m implements AbstractC89172b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {

        /* renamed from: a */
        public static final C71537d f160326a = new C71537d();

        static {
            Covode.recordClassIndex(84081);
        }

        C71537d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            C89219l.m154721d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, new C20526p(), null, null, 57343, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel$e */
    static final class C71538e extends AbstractC89220m implements AbstractC89172b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {

        /* renamed from: a */
        final /* synthetic */ C71796s f160327a;

        static {
            Covode.recordClassIndex(84082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71538e(C71796s sVar) {
            super(1);
            this.f160327a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            C89219l.m154721d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, null, null, null, null, null, null, new C20391d(this.f160327a), null, null, null, null, 63487, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel$f */
    static final class C71539f extends AbstractC89220m implements AbstractC89172b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {

        /* renamed from: a */
        final /* synthetic */ int f160328a;

        static {
            Covode.recordClassIndex(84083);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71539f(int i) {
            super(1);
            this.f160328a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            C89219l.m154721d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, this.f160328a, null, null, null, null, null, null, null, null, null, null, null, null, 65527, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel$g */
    static final class C71540g extends AbstractC89220m implements AbstractC89172b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {

        /* renamed from: a */
        final /* synthetic */ int f160329a;

        /* renamed from: b */
        final /* synthetic */ VideoSegment f160330b;

        static {
            Covode.recordClassIndex(84084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71540g(int i, VideoSegment videoSegment) {
            super(1);
            this.f160329a = i;
            this.f160330b = videoSegment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            C89219l.m154721d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, null, null, null, null, null, new C20524n(C89387v.m154943a(Integer.valueOf(this.f160329a), this.f160330b)), null, null, null, null, null, 64511, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel$h */
    static final class C71541h extends AbstractC89220m implements AbstractC89172b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {

        /* renamed from: a */
        public static final C71541h f160331a = new C71541h();

        static {
            Covode.recordClassIndex(84085);
        }

        C71541h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            C89219l.m154721d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, new C20526p(), null, 49151, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel$i */
    public static final class C71542i extends AbstractC89220m implements AbstractC89172b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {

        /* renamed from: a */
        final /* synthetic */ int f160332a;

        static {
            Covode.recordClassIndex(84086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71542i(int i) {
            super(1);
            this.f160332a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            C89219l.m154721d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, this.f160332a, 0, null, null, null, null, null, null, null, null, null, null, null, null, 65531, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel$j */
    static final class C71543j extends AbstractC89220m implements AbstractC89172b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {

        /* renamed from: a */
        public static final C71543j f160333a = new C71543j();

        static {
            Covode.recordClassIndex(84087);
        }

        C71543j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            C89219l.m154721d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, new C20526p(), 32767, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel$k */
    static final class C71544k extends AbstractC89220m implements AbstractC89172b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {

        /* renamed from: a */
        final /* synthetic */ int f160334a;

        /* renamed from: b */
        final /* synthetic */ int f160335b;

        static {
            Covode.recordClassIndex(84088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71544k(int i, int i2) {
            super(1);
            this.f160334a = i;
            this.f160335b = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            C89219l.m154721d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, this.f160334a, this.f160335b, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, 65532, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel$l */
    public static final class C71545l extends AbstractC89220m implements AbstractC89172b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f160336a;

        static {
            Covode.recordClassIndex(84089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71545l(boolean z) {
            super(1);
            this.f160336a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            C89219l.m154721d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, null, null, null, Boolean.valueOf(this.f160336a), null, null, null, null, null, null, null, 65279, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel$m */
    static final class C71546m extends AbstractC89220m implements AbstractC89172b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f160337a;

        static {
            Covode.recordClassIndex(84090);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71546m(boolean z) {
            super(1);
            this.f160337a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            C89219l.m154721d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, Boolean.valueOf(this.f160337a), null, null, null, null, null, null, null, null, null, null, null, 65519, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel$n */
    static final class C71547n extends AbstractC89220m implements AbstractC89172b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {

        /* renamed from: a */
        final /* synthetic */ int f160338a;

        static {
            Covode.recordClassIndex(84091);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71547n(int i) {
            super(1);
            this.f160338a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            C89219l.m154721d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, null, null, Integer.valueOf(this.f160338a), null, null, null, null, null, null, null, null, 65407, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel$o */
    static final class C71548o extends AbstractC89220m implements AbstractC89172b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {

        /* renamed from: a */
        final /* synthetic */ float f160339a;

        static {
            Covode.recordClassIndex(84092);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71548o(float f) {
            super(1);
            this.f160339a = f;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            C89219l.m154721d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, Float.valueOf(this.f160339a), null, null, null, null, null, null, null, null, null, null, 65503, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel$p */
    static final class C71549p extends AbstractC89220m implements AbstractC89172b<EditAdjustClipsBottomViewState, EditAdjustClipsBottomViewState> {

        /* renamed from: a */
        final /* synthetic */ float f160340a;

        static {
            Covode.recordClassIndex(84093);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71549p(float f) {
            super(1);
            this.f160340a = f;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditAdjustClipsBottomViewState invoke(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            EditAdjustClipsBottomViewState editAdjustClipsBottomViewState2 = editAdjustClipsBottomViewState;
            C89219l.m154721d(editAdjustClipsBottomViewState2, "");
            return EditAdjustClipsBottomViewState.copy$default(editAdjustClipsBottomViewState2, 0, 0, 0, 0, null, null, Float.valueOf(this.f160340a), null, null, null, null, null, null, null, null, null, 65471, null);
        }
    }

    /* renamed from: a */
    public final void mo113266a(int i) {
        mo33690d(new C71539f(i));
    }

    /* renamed from: a */
    public final void mo113267a(C71796s sVar) {
        mo33690d(new C71538e(sVar));
    }

    /* renamed from: a */
    public final void mo113268a(boolean z) {
        mo33690d(new C71546m(z));
    }
}
