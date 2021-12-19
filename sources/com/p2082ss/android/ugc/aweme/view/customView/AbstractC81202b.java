package com.p2082ss.android.ugc.aweme.view.customView;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.C0569a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.common.C39076ab;
import com.p2082ss.android.ugc.aweme.common.C39220y;
import com.p2082ss.android.ugc.aweme.common.C39222z;
import com.p2082ss.android.ugc.aweme.model.C60159r;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.view.customView.b */
public abstract class AbstractC81202b extends Fragment implements AbstractC20527q {

    /* renamed from: a */
    final String[] f181483a = {"android.permission.CAMERA"};

    /* renamed from: b */
    private final Handler f181484b = new Handler();

    /* renamed from: c */
    private final AbstractC89244h f181485c = C89250i.m154773a((AbstractC89171a) new C81203a(this));

    /* renamed from: d */
    private final AbstractC89244h f181486d = C89250i.m154773a((AbstractC89171a) new C81210g(this));

    /* renamed from: e */
    private SparseArray f181487e;

    static {
        Covode.recordClassIndex(94532);
    }

    /* renamed from: a */
    public View mo124616a(int i) {
        if (this.f181487e == null) {
            this.f181487e = new SparseArray();
        }
        View view = (View) this.f181487e.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f181487e.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final ProfileNaviEditorViewModel mo124687a() {
        return (ProfileNaviEditorViewModel) this.f181485c.getValue();
    }

    /* renamed from: b */
    public abstract int mo124617b();

    /* renamed from: c */
    public abstract void mo124618c();

    /* renamed from: d */
    public boolean mo124690d() {
        return true;
    }

    /* renamed from: e */
    public abstract NaviGLSurfaceView mo124619e();

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: j */
    public void mo124621j() {
        SparseArray sparseArray = this.f181487e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo124621j();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    /* renamed from: h */
    public final void mo124692h() {
        this.f181484b.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        mo124687a();
        MessageCenter.removeAllListener();
        MessageCenter.destroy();
    }

    /* renamed from: com.ss.android.ugc.aweme.view.customView.b$a */
    static final class C81203a extends AbstractC89220m implements AbstractC89171a<ProfileNaviEditorViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC81202b f181488a;

        static {
            Covode.recordClassIndex(94533);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81203a(AbstractC81202b bVar) {
            super(0);
            this.f181488a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProfileNaviEditorViewModel invoke() {
            JediViewModel a = C20531t.m38716a(this.f181488a.requireActivity()).mo33800a(ProfileNaviEditorViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.customView.b$g */
    static final class C81210g extends AbstractC89220m implements AbstractC89171a<ProfileNaviSwitcherViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC81202b f181496a;

        static {
            Covode.recordClassIndex(94540);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81210g(AbstractC81202b bVar) {
            super(0);
            this.f181496a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProfileNaviSwitcherViewModel invoke() {
            JediViewModel a = C20531t.m38716a(this.f181496a.requireActivity()).mo33800a(ProfileNaviSwitcherViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: i */
    public final void mo124693i() {
        C81200a naviManager;
        NaviGLSurfaceView e = mo124619e();
        if (!(e == null || (naviManager = e.getNaviManager()) == null)) {
            naviManager.mo124678a("");
        }
        mo124687a().f181668a = false;
        mo124687a();
        C39222z.m79578a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        mo124693i();
        NaviGLSurfaceView e = mo124619e();
        if (e != null) {
            e.onPause();
        }
        this.f181484b.removeCallbacksAndMessages(null);
    }

    /* renamed from: f */
    public final void mo124691f() {
        mo124687a();
        if (C60159r.f137138a != null) {
            String headStickerPath = ((ProfileNaviEditorState) mo124687a().mo33676a(this)).getHeadStickerPath();
            if (headStickerPath != null && headStickerPath.length() != 0) {
                mo124689a(headStickerPath);
            } else if (getContext() != null) {
                ProfileNaviEditorViewModel a = mo124687a();
                Context context = getContext();
                if (context == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(context, "");
                a.mo124844c(context);
            }
        }
    }

    /* renamed from: g */
    public void mo124620g() {
        AbstractC88412b unused = selectSubscribe(mo124687a(), C81211c.f181497a, new C20370ah(), new C81204b(this));
        AbstractC88412b unused2 = selectSubscribe(mo124687a(), C81212d.f181498a, new C20370ah(), new C81205c(this));
        AbstractC88412b unused3 = selectSubscribe(mo124687a(), C81213e.f181499a, new C20370ah(), new C81206d(this));
        AbstractC88412b unused4 = selectSubscribe((ProfileNaviSwitcherViewModel) this.f181486d.getValue(), C81214f.f181500a, new C20370ah(), new C81207e(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.view.customView.b$f */
    public static final class RunnableC81209f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC81202b f181494a;

        /* renamed from: b */
        final /* synthetic */ String f181495b;

        static {
            Covode.recordClassIndex(94539);
        }

        RunnableC81209f(AbstractC81202b bVar, String str) {
            this.f181494a = bVar;
            this.f181495b = str;
        }

        public final void run() {
            if (this.f181494a.mo124687a().f181668a) {
                AbstractC81202b bVar = this.f181494a;
                if (!(bVar.getContext() == null || bVar.getActivity() == null || !bVar.mo124690d())) {
                    bVar.mo124687a();
                    if (C39076ab.f92277c) {
                        Context context = bVar.getContext();
                        if (context == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(context, "");
                        for (String str : bVar.f181483a) {
                            if (C0569a.m2367a(context, str) != 0) {
                                return;
                            }
                        }
                        NaviGLSurfaceView e = bVar.mo124619e();
                        if (e != null) {
                            e.setCamera(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            this.f181494a.mo124689a(this.f181495b);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        NaviGLSurfaceView e;
        C81200a naviManager;
        super.onResume();
        NaviGLSurfaceView e2 = mo124619e();
        if (e2 != null) {
            e2.onResume();
        }
        if (!(getContext() == null || (e = mo124619e()) == null || (naviManager = e.getNaviManager()) == null)) {
            ProfileNaviEditorViewModel a = mo124687a();
            Context context = getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            DownloadableModelSupportResourceFinder resourceFinder = a.mo124842b(context).getResourceFinder();
            naviManager.mo124675a();
            naviManager.f181459c = resourceFinder;
        }
        mo124691f();
    }

    /* renamed from: a */
    public final void mo124689a(String str) {
        C81200a naviManager;
        NaviGLSurfaceView e = mo124619e();
        if (!(e == null || (naviManager = e.getNaviManager()) == null)) {
            naviManager.mo124678a(str);
        }
        mo124688a(new RunnableC81209f(this, str), 1000);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.view.customView.b$c */
    public static final class C81205c extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC81202b f181490a;

        static {
            Covode.recordClassIndex(94535);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81205c(AbstractC81202b bVar) {
            super(2);
            this.f181490a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, String str) {
            String str2 = str;
            C89219l.m154721d(iVar, "");
            if (str2 != null) {
                this.f181490a.mo124689a(str2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo124688a(Runnable runnable, long j) {
        C89219l.m154721d(runnable, "");
        this.f181484b.removeCallbacksAndMessages(null);
        this.f181484b.postDelayed(runnable, j);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo124620g();
        mo124618c();
        Context context = getContext();
        if (context != null) {
            ProfileNaviEditorViewModel a = mo124687a();
            C89219l.m154716b(context, "");
            a.mo124838a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.view.customView.b$b */
    public static final class C81204b extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C39220y, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC81202b f181489a;

        static {
            Covode.recordClassIndex(94534);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81204b(AbstractC81202b bVar) {
            super(2);
            this.f181489a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C39220y yVar) {
            NaviGLSurfaceView e;
            C81200a naviManager;
            C39220y yVar2 = yVar;
            C89219l.m154721d(iVar, "");
            if (!(yVar2 == null || (e = this.f181489a.mo124619e()) == null || (naviManager = e.getNaviManager()) == null)) {
                naviManager.mo124677a(yVar2.f92641a, yVar2.f92643c, yVar2.f92643c, yVar2.f92642b);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.view.customView.b$d */
    public static final class C81206d extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC81202b f181491a;

        static {
            Covode.recordClassIndex(94536);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81206d(AbstractC81202b bVar) {
            super(2);
            this.f181491a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            NaviGLSurfaceView e;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f181491a.mo124687a();
                if (!C39076ab.f92277c && (e = this.f181491a.mo124619e()) != null) {
                    e.setCamera(false);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.view.customView.b$e */
    public static final class C81207e extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC81202b f181492a;

        static {
            Covode.recordClassIndex(94537);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81207e(AbstractC81202b bVar) {
            super(2);
            this.f181492a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f181492a.mo124693i();
                this.f181492a.mo124688a(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b.C81207e.RunnableC812081 */

                    /* renamed from: a */
                    final /* synthetic */ C81207e f181493a;

                    static {
                        Covode.recordClassIndex(94538);
                    }

                    {
                        this.f181493a = r1;
                    }

                    public final void run() {
                        this.f181493a.f181492a.mo124691f();
                    }
                }, 500);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater.cloneInContext(new ContextThemeWrapper(getActivity(), 16974122)), mo124617b(), viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
