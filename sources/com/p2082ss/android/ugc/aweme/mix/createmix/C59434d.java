package com.p2082ss.android.ugc.aweme.mix.createmix;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1182af;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.C59528a;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.EnumC59529b;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.p2082ss.android.ugc.aweme.mix.p3448c.C59413b;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.mix.createmix.d */
public final class C59434d extends Fragment implements AbstractC12846h {

    /* renamed from: d */
    public static final C59441g f135736d = new C59441g((byte) 0);

    /* renamed from: a */
    public String f135737a = "";

    /* renamed from: b */
    public String f135738b = "";

    /* renamed from: c */
    public boolean f135739c;

    /* renamed from: e */
    private final C12814b f135740e;

    /* renamed from: f */
    private SparseArray f135741f;

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.d$b */
    public static final class C59436b extends AbstractC89220m implements AbstractC89172b<C59528a, C59528a> {
        public static final C59436b INSTANCE = new C59436b();

        static {
            Covode.recordClassIndex(69829);
        }

        public C59436b() {
            super(1);
        }

        public final C59528a invoke(C59528a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(69827);
    }

    /* renamed from: a */
    private View m109124a(int i) {
        if (this.f135741f == null) {
            this.f135741f = new SparseArray();
        }
        View view = (View) this.f135741f.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f135741f.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final MixCreateViewModel mo97089a() {
        return (MixCreateViewModel) this.f135740e.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC1204m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22876d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.d$g */
    public static final class C59441g {
        static {
            Covode.recordClassIndex(69834);
        }

        private C59441g() {
        }

        public /* synthetic */ C59441g(byte b) {
            this();
        }

        /* renamed from: a */
        public static C59434d m109132a(String str, String str2) {
            C59434d dVar = new C59434d();
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", str);
            bundle.putString("enter_method", str2);
            bundle.putBoolean("half_create_name", false);
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22878f
    public final AbstractC1204m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22878f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22880h
    public final AbstractC22876d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22880h<AbstractC22876d> getActualReceiverHolder() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.d$c */
    public static final class C59437c extends AbstractC89220m implements AbstractC89171a<C12874b<C59528a>> {
        public static final C59437c INSTANCE = new C59437c();

        static {
            Covode.recordClassIndex(69830);
        }

        public C59437c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59528a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.d$f */
    public static final class C59440f extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59440f INSTANCE = new C59440f();

        static {
            Covode.recordClassIndex(69833);
        }

        public C59440f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.d$d */
    public static final class C59438d extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f135743a;

        static {
            Covode.recordClassIndex(69831);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59438d(Fragment fragment) {
            super(0);
            this.f135743a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f135743a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f135741f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.d$a */
    public static final class C59435a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f135742a;

        static {
            Covode.recordClassIndex(69828);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59435a(AbstractC89277c cVar) {
            super(0);
            this.f135742a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f135742a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.d$e */
    public static final class C59439e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f135744a;

        static {
            Covode.recordClassIndex(69832);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59439e(Fragment fragment) {
            super(0);
            this.f135744a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f135744a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    public C59434d() {
        AbstractC89277c a = C89204ab.m154669a(MixCreateViewModel.class);
        this.f135740e = new C12814b(a, new C59435a(a), C59437c.INSTANCE, new C59438d(this), new C59439e(this), C59440f.INSTANCE, C59436b.INSTANCE);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.d$h */
    static final class View$OnClickListenerC59442h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59434d f135745a;

        static {
            Covode.recordClassIndex(69835);
        }

        View$OnClickListenerC59442h(C59434d dVar) {
            this.f135745a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ActivityC0945e b = C12777b.m23004b(this.f135745a);
            if (b != null) {
                b.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.d$i */
    static final class View$OnClickListenerC59443i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59434d f135746a;

        static {
            Covode.recordClassIndex(69836);
        }

        View$OnClickListenerC59443i(C59434d dVar) {
            this.f135746a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if ((C59413b.m109112a() == 1 || C59413b.m109112a() == 2) && !this.f135746a.f135739c) {
                this.f135746a.mo97089a().mo97102a(EnumC59529b.MULTI_VIDEO);
            } else {
                this.f135746a.mo97089a().mo97102a(EnumC59529b.CREATE_NAME);
            }
            String str = this.f135746a.f135737a;
            String str2 = this.f135746a.f135738b;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C39162r.m79460a("start_first_playlist", new C33744d().mo59983a("enter_from", str).mo59983a("enter_method", str2).f79943a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        TextTitleBar textTitleBar = (TextTitleBar) m109124a(R.id.eiz);
        C89219l.m154716b(textTitleBar, "");
        textTitleBar.getBackBtn().setImageResource(2131233257);
        TextTitleBar textTitleBar2 = (TextTitleBar) m109124a(R.id.eiz);
        C89219l.m154716b(textTitleBar2, "");
        textTitleBar2.getBackBtn().setOnClickListener(new View$OnClickListenerC59442h(this));
        if (C59413b.m109112a() == 1) {
            TuxTextView tuxTextView = (TuxTextView) m109124a(R.id.e7s);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(getString(R.string.g30));
            TuxTextView tuxTextView2 = (TuxTextView) m109124a(R.id.e7w);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setText(getString(R.string.g32));
            TuxTextView tuxTextView3 = (TuxTextView) m109124a(R.id.e7z);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setText(getString(R.string.g2y));
        } else if (C59413b.m109112a() == 2) {
            TuxTextView tuxTextView4 = (TuxTextView) m109124a(R.id.e7s);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setText(getString(R.string.g30));
            TuxTextView tuxTextView5 = (TuxTextView) m109124a(R.id.e7w);
            C89219l.m154716b(tuxTextView5, "");
            tuxTextView5.setText(getString(R.string.g2y));
            TuxTextView tuxTextView6 = (TuxTextView) m109124a(R.id.e7y);
            C89219l.m154716b(tuxTextView6, "");
            tuxTextView6.setVisibility(8);
            TuxTextView tuxTextView7 = (TuxTextView) m109124a(R.id.e7z);
            C89219l.m154716b(tuxTextView7, "");
            tuxTextView7.setVisibility(8);
            View a = m109124a(R.id.c96);
            C89219l.m154716b(a, "");
            a.setVisibility(8);
        }
        C58001a.m104815a(m109124a(R.id.button), 300);
        ((TuxButton) m109124a(R.id.button)).setOnClickListener(new View$OnClickListenerC59443i(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str = "";
        C89219l.m154721d(layoutInflater, str);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("enter_from");
            if (string == null) {
                string = str;
            }
            this.f135737a = string;
            String string2 = arguments.getString("enter_method");
            if (string2 != null) {
                str = string2;
            }
            this.f135738b = str;
            this.f135739c = arguments.getBoolean("half_create_name");
        }
        return C1764a.m5927a(layoutInflater, R.layout.akj, viewGroup, false);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j> void mo20508a(AssemViewModel<S> assemViewModel, C12854k<S> kVar, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super S, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23092a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: b */
    public final <S extends AbstractC12853j, A> void mo20515b(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23097b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A> void mo20509a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23093a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B> void mo20510a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C12854k<C12794p<A, B>> kVar3, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89187q<? super AbstractC22876d, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(qVar, "");
        AbstractC12846h.C12847a.m23094a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C> void mo20511a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C12854k<C12795q<A, B, C>> kVar4, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89188r<? super AbstractC22876d, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(rVar, "");
        AbstractC12846h.C12847a.m23095a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C, D> void mo20512a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C12854k<C12796r<A, B, C, D>> kVar5, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89189s<? super AbstractC22876d, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(kVar5, "");
        C89219l.m154721d(sVar, "");
        AbstractC12846h.C12847a.m23096a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
