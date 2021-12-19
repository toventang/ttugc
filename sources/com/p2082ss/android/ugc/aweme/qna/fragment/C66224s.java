package com.p2082ss.android.ugc.aweme.qna.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.comment.util.C37218u;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qna.api.EnumC66009f;
import com.p2082ss.android.ugc.aweme.qna.model.C66288a;
import com.p2082ss.android.ugc.aweme.qna.model.C66293f;
import com.p2082ss.android.ugc.aweme.qna.model.C66296h;
import com.p2082ss.android.ugc.aweme.qna.model.C66297i;
import com.p2082ss.android.ugc.aweme.qna.p3646d.C66026b;
import com.p2082ss.android.ugc.aweme.qna.p3647e.C66061b;
import com.p2082ss.android.ugc.aweme.qna.p3649g.C66277a;
import com.p2082ss.android.ugc.aweme.qna.p3649g.C66278b;
import com.p2082ss.android.ugc.aweme.qna.p3649g.C66286e;
import com.p2082ss.android.ugc.aweme.qna.p3650ui.C66325k;
import com.p2082ss.android.ugc.aweme.qna.p3650ui.C66334l;
import com.p2082ss.android.ugc.aweme.qna.p3650ui.QnaRecyclerView;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66355a;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66357c;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66358d;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66360f;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66362h;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaBannerViewModel;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaSelectedPageViewModel;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaSuggestedTabViewModel;
import com.p2082ss.android.ugc.aweme.service.EOYServiceImpl;
import com.p2082ss.android.ugc.aweme.service.IEOYService;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
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
import p4600h.p4615g.C89241a;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.qna.fragment.s */
public final class C66224s extends AbstractC66098a implements AbstractC12846h {

    /* renamed from: q */
    public static final C66228ac f148948q = new C66228ac((byte) 0);

    /* renamed from: i */
    public QnaSuggestedTabViewModel f148949i;

    /* renamed from: j */
    public View f148950j;

    /* renamed from: k */
    public C66334l f148951k;

    /* renamed from: l */
    public String f148952l;

    /* renamed from: m */
    public final C66286e f148953m;

    /* renamed from: n */
    public final boolean f148954n;

    /* renamed from: o */
    public final AtomicLong f148955o;

    /* renamed from: p */
    public final int f148956p;

    /* renamed from: r */
    private final C12814b f148957r;

    /* renamed from: s */
    private final C12814b f148958s;

    /* renamed from: t */
    private QnaRecyclerView f148959t;

    /* renamed from: u */
    private SparseArray f148960u;

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$h */
    public static final class C66254h extends AbstractC89220m implements AbstractC89172b<C66362h, C66362h> {
        public static final C66254h INSTANCE = new C66254h();

        static {
            Covode.recordClassIndex(77762);
        }

        public C66254h() {
            super(1);
        }

        public final C66362h invoke(C66362h hVar) {
            C89219l.m154719c(hVar, "");
            return hVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$l */
    public static final class C66258l extends AbstractC89220m implements AbstractC89172b<C66360f, C66360f> {
        public static final C66258l INSTANCE = new C66258l();

        static {
            Covode.recordClassIndex(77766);
        }

        public C66258l() {
            super(1);
        }

        public final C66360f invoke(C66360f fVar) {
            C89219l.m154719c(fVar, "");
            return fVar;
        }
    }

    static {
        Covode.recordClassIndex(77732);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f148960u == null) {
            this.f148960u = new SparseArray();
        }
        View view = (View) this.f148960u.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f148960u.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a
    public final void bx_() {
        SparseArray sparseArray = this.f148960u;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a
    /* renamed from: c */
    public final int mo64296c() {
        return R.string.f3x;
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a
    /* renamed from: d */
    public final String mo105141d() {
        return "suggested";
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

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$ac */
    public static final class C66228ac {
        static {
            Covode.recordClassIndex(77736);
        }

        private C66228ac() {
        }

        public /* synthetic */ C66228ac(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$b */
    public static final class C66248b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148983a;

        static {
            Covode.recordClassIndex(77756);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66248b(Fragment fragment) {
            super(0);
            this.f148983a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            return this.f148983a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$q */
    public static final class C66263q extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148992a;

        static {
            Covode.recordClassIndex(77771);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66263q(Fragment fragment) {
            super(0);
            this.f148992a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            return this.f148992a;
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

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$ab */
    public static final class C66227ab extends AbstractC89220m implements AbstractC89171a<C12874b<C66360f>> {
        public static final C66227ab INSTANCE = new C66227ab();

        static {
            Covode.recordClassIndex(77735);
        }

        public C66227ab() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66360f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$d */
    public static final class C66250d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C66250d INSTANCE = new C66250d();

        static {
            Covode.recordClassIndex(77758);
        }

        public C66250d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$i */
    public static final class C66255i extends AbstractC89220m implements AbstractC89171a<C12874b<C66362h>> {
        public static final C66255i INSTANCE = new C66255i();

        static {
            Covode.recordClassIndex(77763);
        }

        public C66255i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66362h> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$m */
    public static final class C66259m extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C66259m INSTANCE = new C66259m();

        static {
            Covode.recordClassIndex(77767);
        }

        public C66259m() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$p */
    public static final class C66262p extends AbstractC89220m implements AbstractC89171a<C12874b<C66362h>> {
        public static final C66262p INSTANCE = new C66262p();

        static {
            Covode.recordClassIndex(77770);
        }

        public C66262p() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66362h> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$s */
    public static final class C66265s extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C66265s INSTANCE = new C66265s();

        static {
            Covode.recordClassIndex(77773);
        }

        public C66265s() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$v */
    public static final class C66268v extends AbstractC89220m implements AbstractC89171a<C12874b<C66360f>> {
        public static final C66268v INSTANCE = new C66268v();

        static {
            Covode.recordClassIndex(77776);
        }

        public C66268v() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66360f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$y */
    public static final class C66271y extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C66271y INSTANCE = new C66271y();

        static {
            Covode.recordClassIndex(77779);
        }

        public C66271y() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$ad */
    static final class C66229ad extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66224s f148963a;

        static {
            Covode.recordClassIndex(77737);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66229ad(C66224s sVar) {
            super(0);
            this.f148963a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            QnaSuggestedTabViewModel qnaSuggestedTabViewModel = this.f148963a.f148949i;
            if (qnaSuggestedTabViewModel != null) {
                qnaSuggestedTabViewModel.mo105259a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$c */
    public static final class C66249c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148984a;

        static {
            Covode.recordClassIndex(77757);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66249c(Fragment fragment) {
            super(0);
            this.f148984a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f148984a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$j */
    public static final class C66256j extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148988a;

        static {
            Covode.recordClassIndex(77764);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66256j(Fragment fragment) {
            super(0);
            this.f148988a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f148988a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$r */
    public static final class C66264r extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148993a;

        static {
            Covode.recordClassIndex(77772);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66264r(Fragment fragment) {
            super(0);
            this.f148993a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f148993a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$w */
    public static final class C66269w extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148996a;

        static {
            Covode.recordClassIndex(77777);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66269w(Fragment fragment) {
            super(0);
            this.f148996a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f148996a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$a */
    public static final class C66225a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f148961a;

        static {
            Covode.recordClassIndex(77733);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66225a(AbstractC89277c cVar) {
            super(0);
            this.f148961a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f148961a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$aa */
    public static final class C66226aa extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148962a;

        static {
            Covode.recordClassIndex(77734);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66226aa(Fragment fragment) {
            super(0);
            this.f148962a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f148962a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f148962a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$e */
    public static final class C66251e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148985a;

        static {
            Covode.recordClassIndex(77759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66251e(Fragment fragment) {
            super(0);
            this.f148985a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f148985a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f148985a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$f */
    public static final class C66252f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148986a;

        static {
            Covode.recordClassIndex(77760);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66252f(Fragment fragment) {
            super(0);
            this.f148986a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f148986a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f148986a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$g */
    public static final class C66253g extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f148987a;

        static {
            Covode.recordClassIndex(77761);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66253g(AbstractC89277c cVar) {
            super(0);
            this.f148987a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f148987a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$k */
    public static final class C66257k extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148989a;

        static {
            Covode.recordClassIndex(77765);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66257k(Fragment fragment) {
            super(0);
            this.f148989a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f148989a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$n */
    public static final class C66260n extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148990a;

        static {
            Covode.recordClassIndex(77768);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66260n(Fragment fragment) {
            super(0);
            this.f148990a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f148990a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f148990a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$o */
    public static final class C66261o extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148991a;

        static {
            Covode.recordClassIndex(77769);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66261o(Fragment fragment) {
            super(0);
            this.f148991a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f148991a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f148991a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$t */
    public static final class C66266t extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148994a;

        static {
            Covode.recordClassIndex(77774);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66266t(Fragment fragment) {
            super(0);
            this.f148994a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f148994a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f148994a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$u */
    public static final class C66267u extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148995a;

        static {
            Covode.recordClassIndex(77775);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66267u(Fragment fragment) {
            super(0);
            this.f148995a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f148995a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f148995a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$x */
    public static final class C66270x extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148997a;

        static {
            Covode.recordClassIndex(77778);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66270x(Fragment fragment) {
            super(0);
            this.f148997a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f148997a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$z */
    public static final class C66272z extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148998a;

        static {
            Covode.recordClassIndex(77780);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66272z(Fragment fragment) {
            super(0);
            this.f148998a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f148998a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f148998a.getActivity());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a
    /* renamed from: e */
    public final void mo105142e() {
        C66296h hVar;
        super.mo105142e();
        QnaRecyclerView qnaRecyclerView = this.f148959t;
        if (qnaRecyclerView != null) {
            RecyclerView.AbstractC1362i layoutManager = qnaRecyclerView.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager != null) {
                int k = linearLayoutManager.mo4371k();
                int m = linearLayoutManager.mo4373m();
                ArrayList arrayList = new ArrayList();
                while (k <= m) {
                    int i = k + 1;
                    RecyclerView.ViewHolder f = qnaRecyclerView.mo4451f(k);
                    if (!(f instanceof C66325k)) {
                        f = null;
                    }
                    C66325k kVar = (C66325k) f;
                    if (!(kVar == null || (hVar = kVar.f149142a) == null)) {
                        arrayList.add(hVar);
                    }
                    k = i;
                }
                C66334l lVar = this.f148951k;
                if (lVar == null) {
                    C89219l.m154710a("suggestedTabAdapter");
                }
                lVar.mo105253b(arrayList);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a
    /* renamed from: f */
    public final void mo105143f() {
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel = this.f148949i;
        if (qnaSuggestedTabViewModel == null) {
            return;
        }
        if (C16048b.m29633a().mo25412a(true, "public_qna_suggested_tab", 0) == 3) {
            C66026b bVar = qnaSuggestedTabViewModel.f149204a;
            String b = C80342dg.m139300a().mo46674b(C89070n.m154522b(bVar.mo105082a(bVar.f148645c), bVar.mo105091b(bVar.f148646d)));
            C89219l.m154716b(b, "");
            bVar.mo105088a(b, C89070n.m154522b(EnumC66009f.RECOMMEND, EnumC66009f.INVITATION), false);
        } else if (C66061b.m117872b()) {
            qnaSuggestedTabViewModel.f149204a.mo105083a();
        } else if (C66061b.m117871a()) {
            qnaSuggestedTabViewModel.f149204a.mo105092b();
        }
    }

    public C66224s() {
        C12814b bVar;
        C12814b bVar2;
        AbstractC12848i.C12849a aVar = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a = C89204ab.m154669a(QnaBannerViewModel.class);
        C66225a aVar2 = new C66225a(a);
        C66258l lVar = C66258l.INSTANCE;
        if (C89219l.m154714a(aVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar2, C66268v.INSTANCE, new C66269w(this), new C66270x(this), C66271y.INSTANCE, lVar, new C66272z(this), new C66226aa(this));
        } else if (aVar == null || C89219l.m154714a(aVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar2, C66227ab.INSTANCE, new C66248b(this), new C66249c(this), C66250d.INSTANCE, lVar, new C66251e(this), new C66252f(this));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f148957r = bVar;
        AbstractC12848i.C12849a aVar3 = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a2 = C89204ab.m154669a(QnaSelectedPageViewModel.class);
        C66253g gVar = new C66253g(a2);
        C66254h hVar = C66254h.INSTANCE;
        if (C89219l.m154714a(aVar3, AbstractC12848i.C12849a.f31275a)) {
            bVar2 = new C12814b(a2, gVar, C66255i.INSTANCE, new C66256j(this), new C66257k(this), C66259m.INSTANCE, hVar, new C66260n(this), new C66261o(this));
        } else if (aVar3 == null || C89219l.m154714a(aVar3, AbstractC12848i.C12852d.f31278a)) {
            bVar2 = new C12814b(a2, gVar, C66262p.INSTANCE, new C66263q(this), new C66264r(this), C66265s.INSTANCE, hVar, new C66266t(this), new C66267u(this));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f148958s = bVar2;
        this.f148953m = new C66286e();
        this.f148954n = true;
        this.f148955o = new AtomicLong(-1);
        this.f148956p = 3000;
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$af */
    static final class C66231af extends AbstractC89220m implements AbstractC89172b<C66357c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66224s f148965a;

        static {
            Covode.recordClassIndex(77739);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66231af(C66224s sVar) {
            super(1);
            this.f148965a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C66357c cVar) {
            C66357c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            this.f148965a.mo105138a(cVar2, true);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$al */
    static final class C66238al extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66224s f148972a;

        static {
            Covode.recordClassIndex(77746);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66238al(C66224s sVar) {
            super(1);
            this.f148972a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            this.f148972a.mo105166b(num.intValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$aq */
    static final class C66243aq extends AbstractC89220m implements AbstractC89172b<BaseFragmentViewModel, C89391z> {

        /* renamed from: a */
        public static final C66243aq f148977a = new C66243aq();

        static {
            Covode.recordClassIndex(77751);
        }

        C66243aq() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            C89219l.m154721d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(C662441.f148978a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C66334l m117945a(C66224s sVar) {
        C66334l lVar = sVar.f148951k;
        if (lVar == null) {
            C89219l.m154710a("suggestedTabAdapter");
        }
        return lVar;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo27716a(C66243aq.f148977a);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$ag */
    static final class C66232ag extends AbstractC89220m implements AbstractC89172b<C66297i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66224s f148966a;

        static {
            Covode.recordClassIndex(77740);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66232ag(C66224s sVar) {
            super(1);
            this.f148966a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C66297i iVar) {
            C66297i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            C66224s.m117945a(this.f148966a).mo105252a(iVar2.f149067a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$ap */
    static final class C66242ap extends AbstractC89220m implements AbstractC89172b<C66355a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66224s f148976a;

        static {
            Covode.recordClassIndex(77750);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66242ap(C66224s sVar) {
            super(1);
            this.f148976a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C66355a aVar) {
            C66355a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            this.f148976a.mo105139a(aVar2.f149220a, aVar2.f149221b, this.f148976a.f148954n);
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo105166b(int i) {
        new C23144b(this).mo37635a(requireContext().getString(i)).mo37637b();
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$ak */
    static final class C66236ak extends AbstractC89220m implements AbstractC89172b<EnumC66276w, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66224s f148970a;

        static {
            Covode.recordClassIndex(77744);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66236ak(C66224s sVar) {
            super(1);
            this.f148970a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC66276w wVar) {
            EnumC66276w wVar2 = wVar;
            C89219l.m154721d(wVar2, "");
            C66224s sVar = this.f148970a;
            View view = sVar.f148950j;
            if (view == null) {
                C89219l.m154710a("suggestedTabLayout");
            }
            sVar.mo105137a((AbstractC66098a) wVar2, (EnumC66276w) view, (View) EnumC66275v.Suggestions, (EnumC66275v) true, (boolean) "", (String) ((AbstractC89171a<C89391z>) new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.qna.fragment.C66224s.C66236ak.C662371 */

                /* renamed from: a */
                final /* synthetic */ C66236ak f148971a;

                static {
                    Covode.recordClassIndex(77745);
                }

                {
                    this.f148971a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    QnaSuggestedTabViewModel qnaSuggestedTabViewModel = this.f148971a.f148970a.f148949i;
                    if (qnaSuggestedTabViewModel != null) {
                        qnaSuggestedTabViewModel.mo105259a();
                    }
                    return C89391z.f203057a;
                }
            }), (AbstractC89171a) false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$an */
    static final class C66240an extends AbstractC89220m implements AbstractC89172b<C89378p<? extends QaStruct, ? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66224s f148974a;

        static {
            Covode.recordClassIndex(77748);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66240an(C66224s sVar) {
            super(1);
            this.f148974a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89378p<? extends QaStruct, ? extends Boolean> pVar) {
            String str;
            C89378p<? extends QaStruct, ? extends Boolean> pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            C66224s sVar = this.f148974a;
            QaStruct qaStruct = (QaStruct) pVar2.getFirst();
            if (((Boolean) pVar2.getSecond()).booleanValue()) {
                str = "click_invitation";
            } else {
                str = "click_recommendation";
            }
            ActivityC0945e requireActivity = sVar.requireActivity();
            C89219l.m154716b(requireActivity, "");
            C37218u.m75213a(requireActivity, qaStruct, "qa_personal_profile", str, "answer");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$ar */
    static final class C66245ar extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66224s f148979a;

        /* renamed from: b */
        final /* synthetic */ String f148980b;

        static {
            Covode.recordClassIndex(77753);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66245ar(C66224s sVar, String str) {
            super(1);
            this.f148979a = sVar;
            this.f148980b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String string = this.f148979a.requireContext().getString(R.string.b4w);
            C89219l.m154716b(string, "");
            bVar2.mo37421c(string, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.qna.fragment.C66224s.C66245ar.C662461 */

                /* renamed from: a */
                final /* synthetic */ C66245ar f148981a;

                static {
                    Covode.recordClassIndex(77754);
                }

                {
                    this.f148981a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    QnaSuggestedTabViewModel qnaSuggestedTabViewModel = this.f148981a.f148979a.f148949i;
                    if (qnaSuggestedTabViewModel != null) {
                        qnaSuggestedTabViewModel.mo105260a(this.f148981a.f148980b);
                    }
                    return C89391z.f203057a;
                }
            });
            String string2 = this.f148979a.requireContext().getString(R.string.a8y);
            C89219l.m154716b(string2, "");
            bVar2.mo37419b(string2, C662472.f148982a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$ae */
    static final class C66230ae extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66224s f148964a;

        static {
            Covode.recordClassIndex(77738);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66230ae(C66224s sVar) {
            super(1);
            this.f148964a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            C66224s sVar = this.f148964a;
            Context requireContext = sVar.requireContext();
            C89219l.m154716b(requireContext, "");
            ((C23023b) C23028c.m43435a(((C23023b) new C23023b(requireContext).mo37479a(R.string.f1z)).mo37413d(sVar.requireContext().getString(R.string.f1y)), new C66245ar(sVar, str2)).mo37482a(true)).mo37405a().mo37396b().show();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$aj */
    static final class C66235aj extends AbstractC89220m implements AbstractC89172b<List<? extends C66293f>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66224s f148969a;

        static {
            Covode.recordClassIndex(77743);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66235aj(C66224s sVar) {
            super(1);
            this.f148969a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C66293f> list) {
            Integer num;
            List<? extends C66293f> list2 = list;
            C89219l.m154721d(list2, "");
            C66286e eVar = this.f148969a.f148953m;
            QnaSuggestedTabViewModel qnaSuggestedTabViewModel = this.f148969a.f148949i;
            Integer num2 = null;
            if (qnaSuggestedTabViewModel != null) {
                num = Integer.valueOf(qnaSuggestedTabViewModel.f149204a.f148643a.size());
            } else {
                num = null;
            }
            eVar.f149017a = num;
            QnaSuggestedTabViewModel qnaSuggestedTabViewModel2 = this.f148969a.f148949i;
            if (qnaSuggestedTabViewModel2 != null) {
                num2 = qnaSuggestedTabViewModel2.f149204a.f148648f;
            }
            this.f148969a.f148953m.f149018b = num2;
            C66334l a = C66224s.m117945a(this.f148969a);
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            a.mo5018a(arrayList);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$am */
    static final class C66239am extends AbstractC89220m implements AbstractC89172b<C66288a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66224s f148973a;

        static {
            Covode.recordClassIndex(77747);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66239am(C66224s sVar) {
            super(1);
            this.f148973a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C66288a aVar) {
            C66288a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (!aVar2.f149020b || aVar2.f149021c != 1) {
                if (!aVar2.f149020b) {
                    this.f148973a.mo105166b(R.string.g1d);
                }
            } else if (System.currentTimeMillis() > this.f148973a.f148955o.get() + ((long) this.f148973a.f148956p)) {
                this.f148973a.mo105166b(R.string.f3g);
                this.f148973a.f148955o.set(System.currentTimeMillis());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$ao */
    static final class C66241ao extends AbstractC89220m implements AbstractC89172b<C66358d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66224s f148975a;

        static {
            Covode.recordClassIndex(77749);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66241ao(C66224s sVar) {
            super(1);
            this.f148975a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0076  */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.qna.p3651vm.C66358d r11) {
            /*
            // Method dump skipped, instructions count: 212
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.qna.fragment.C66224s.C66241ao.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$ah */
    static final class C66233ah extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, User, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66224s f148967a;

        static {
            Covode.recordClassIndex(77741);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66233ah(C66224s sVar) {
            super(2);
            this.f148967a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, User user) {
            User user2 = user;
            C89219l.m154721d(dVar, "");
            if (user2 != null) {
                this.f148967a.f148952l = C80580in.m139677a(user2, false);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.s$ai */
    static final class C66234ai extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, C12776a<? extends AbstractC66098a>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66224s f148968a;

        static {
            Covode.recordClassIndex(77742);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66234ai(C66224s sVar) {
            super(2);
            this.f148968a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, C12776a<? extends AbstractC66098a> aVar) {
            T t;
            C12776a<? extends AbstractC66098a> aVar2 = aVar;
            C89219l.m154721d(dVar, "");
            if (aVar2 != null) {
                t = aVar2.f31085a;
            } else {
                t = null;
            }
            if (t instanceof C66224s) {
                this.f148968a.mo105142e();
                EOYServiceImpl.m120048b().mo106962b("qa_personal_profile");
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LiveData<C66278b<C66297i>> liveData;
        LiveData<C66278b<C66357c>> liveData2;
        C1213t<C66278b<String>> tVar;
        LiveData<C66278b<C66355a>> liveData3;
        LiveData<C66278b<C66358d>> liveData4;
        C1213t<C66278b<C89378p<QaStruct, Boolean>>> tVar2;
        C1213t<C66278b<C66288a>> tVar3;
        LiveData<C66278b<Integer>> liveData5;
        LiveData<C66278b<EnumC66276w>> liveData6;
        LiveData<C66278b<List<C66293f>>> liveData7;
        RecyclerView.AbstractC1356f itemAnimator;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        IEOYService b = EOYServiceImpl.m120048b();
        View view2 = this.f148950j;
        if (view2 == null) {
            C89219l.m154710a("suggestedTabLayout");
        }
        if (!(view2 instanceof ViewGroup)) {
            view2 = null;
        }
        if (b.mo106959a((ViewGroup) view2, "qa_personal_profile")) {
            View view3 = this.f148950j;
            if (view3 == null) {
                C89219l.m154710a("suggestedTabLayout");
            }
            View findViewById = view3.findViewById(R.id.ebi);
            C89219l.m154716b(findViewById, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            C23163i.m43668b(findViewById, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 40.0f, system.getDisplayMetrics()))), null, null, false, 29);
        }
        this.f148949i = (QnaSuggestedTabViewModel) new C1175ad(this).mo3983a(QnaSuggestedTabViewModel.class);
        View view4 = this.f148950j;
        if (view4 == null) {
            C89219l.m154710a("suggestedTabLayout");
        }
        C89219l.m154716b(requireContext(), "");
        QnaRecyclerView qnaRecyclerView = (QnaRecyclerView) view4.findViewById(R.id.ebi);
        this.f148959t = qnaRecyclerView;
        if (!(qnaRecyclerView == null || (itemAnimator = qnaRecyclerView.getItemAnimator()) == null)) {
            itemAnimator.f4470l = 0;
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel = this.f148949i;
        Objects.requireNonNull(qnaSuggestedTabViewModel, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qna.vm.QnaViewHolderClickDelegate");
        this.f148951k = new C66334l(qnaSuggestedTabViewModel, this.f148953m);
        QnaRecyclerView qnaRecyclerView2 = this.f148959t;
        if (qnaRecyclerView2 != null) {
            qnaRecyclerView2.setLayoutManager(new LinearLayoutManager());
        }
        QnaRecyclerView qnaRecyclerView3 = this.f148959t;
        if (qnaRecyclerView3 != null) {
            C66334l lVar = this.f148951k;
            if (lVar == null) {
                C89219l.m154710a("suggestedTabAdapter");
            }
            qnaRecyclerView3.setAdapter(lVar);
        }
        QnaRecyclerView qnaRecyclerView4 = this.f148959t;
        if (qnaRecyclerView4 != null) {
            C66334l lVar2 = this.f148951k;
            if (lVar2 == null) {
                C89219l.m154710a("suggestedTabAdapter");
            }
            qnaRecyclerView4.mo4405a(m117902a(qnaRecyclerView4, lVar2, new C66229ad(this)));
        }
        AbstractC12818f.C12819a.m23063a(this, (QnaSelectedPageViewModel) this.f148958s.getValue(), C66273t.f148999a, (C12854k) null, new C66234ai(this), 6);
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel2 = this.f148949i;
        if (!(qnaSuggestedTabViewModel2 == null || (liveData7 = qnaSuggestedTabViewModel2.f149205b) == null)) {
            liveData7.observe(getViewLifecycleOwner(), new C66277a(new C66235aj(this)));
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel3 = this.f148949i;
        if (!(qnaSuggestedTabViewModel3 == null || (liveData6 = qnaSuggestedTabViewModel3.f149206c) == null)) {
            liveData6.observe(getViewLifecycleOwner(), new C66277a(new C66236ak(this)));
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel4 = this.f148949i;
        if (!(qnaSuggestedTabViewModel4 == null || (liveData5 = qnaSuggestedTabViewModel4.f149208e) == null)) {
            liveData5.observe(getViewLifecycleOwner(), new C66277a(new C66238al(this)));
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel5 = this.f148949i;
        if (!(qnaSuggestedTabViewModel5 == null || (tVar3 = qnaSuggestedTabViewModel5.f149209f) == null)) {
            tVar3.observe(getViewLifecycleOwner(), new C66277a(new C66239am(this)));
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel6 = this.f148949i;
        if (!(qnaSuggestedTabViewModel6 == null || (tVar2 = qnaSuggestedTabViewModel6.f149211h) == null)) {
            tVar2.observe(getViewLifecycleOwner(), new C66277a(new C66240an(this)));
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel7 = this.f148949i;
        if (!(qnaSuggestedTabViewModel7 == null || (liveData4 = qnaSuggestedTabViewModel7.f149217i) == null)) {
            liveData4.observe(getViewLifecycleOwner(), new C66277a(new C66241ao(this)));
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel8 = this.f148949i;
        if (!(qnaSuggestedTabViewModel8 == null || (liveData3 = qnaSuggestedTabViewModel8.f149218j) == null)) {
            liveData3.observe(getViewLifecycleOwner(), new C66277a(new C66242ap(this)));
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel9 = this.f148949i;
        if (!(qnaSuggestedTabViewModel9 == null || (tVar = qnaSuggestedTabViewModel9.f149210g) == null)) {
            tVar.observe(getViewLifecycleOwner(), new C66277a(new C66230ae(this)));
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel10 = this.f148949i;
        if (!(qnaSuggestedTabViewModel10 == null || (liveData2 = qnaSuggestedTabViewModel10.f149219k) == null)) {
            liveData2.observe(getViewLifecycleOwner(), new C66277a(new C66231af(this)));
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel11 = this.f148949i;
        if (!(qnaSuggestedTabViewModel11 == null || (liveData = qnaSuggestedTabViewModel11.f149207d) == null)) {
            liveData.observe(getViewLifecycleOwner(), new C66277a(new C66232ag(this)));
        }
        AbstractC12818f.C12819a.m23063a(this, (QnaBannerViewModel) this.f148957r.getValue(), C66274u.f149000a, (C12854k) null, new C66233ah(this), 6);
        View view5 = this.f148950j;
        if (view5 == null) {
            C89219l.m154710a("suggestedTabLayout");
        }
        ((TuxStatusView) view5.findViewById(R.id.dc1)).mo37867a();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.aqh, viewGroup, false);
        C89219l.m154716b(a, "");
        this.f148950j = a;
        if (a == null) {
            C89219l.m154710a("suggestedTabLayout");
        }
        return a;
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
