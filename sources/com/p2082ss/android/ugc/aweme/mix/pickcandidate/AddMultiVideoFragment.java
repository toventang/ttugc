package com.p2082ss.android.ugc.aweme.mix.pickcandidate;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1182af;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
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
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.header.C17660a;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.mix.createmix.C59467g;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.C59528a;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.EnumC59529b;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.C59853a;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.p2082ss.android.ugc.aweme.mix.p3446a.C59330a;
import com.p2082ss.android.ugc.aweme.mix.p3448c.C59413b;
import com.p2082ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
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
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment */
public final class AddMultiVideoFragment extends AbstractC34586a implements AbstractC12846h {

    /* renamed from: b */
    public static final C59881m f136368b = new C59881m((byte) 0);

    /* renamed from: a */
    public boolean f136369a;

    /* renamed from: c */
    private final AbstractC89244h f136370c = C89250i.m154773a((AbstractC89171a) new C59891v(this));

    /* renamed from: d */
    private final C12814b f136371d;

    /* renamed from: e */
    private final C12814b f136372e;

    /* renamed from: j */
    private SparseArray f136373j;

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$e */
    public static final class C59873e extends AbstractC89220m implements AbstractC89172b<C59528a, C59528a> {
        public static final C59873e INSTANCE = new C59873e();

        static {
            Covode.recordClassIndex(70282);
        }

        public C59873e() {
            super(1);
        }

        public final C59528a invoke(C59528a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$k */
    public static final class C59879k extends AbstractC89220m implements AbstractC89172b<C59853a, C59853a> {
        public static final C59879k INSTANCE = new C59879k();

        static {
            Covode.recordClassIndex(70288);
        }

        public C59879k() {
            super(1);
        }

        public final C59853a invoke(C59853a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70275);
    }

    /* renamed from: a */
    public final View mo97270a(int i) {
        if (this.f136373j == null) {
            this.f136373j = new SparseArray();
        }
        View view = (View) this.f136373j.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f136373j.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final MultiVideoViewModel mo97271a() {
        return (MultiVideoViewModel) this.f136370c.getValue();
    }

    /* renamed from: b */
    public final MixCreateViewModel mo97272b() {
        return (MixCreateViewModel) this.f136371d.getValue();
    }

    /* renamed from: c */
    public final MixVideosManageViewModel mo97273c() {
        return (MixVideosManageViewModel) this.f136372e.getValue();
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

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$m */
    public static final class C59881m {
        static {
            Covode.recordClassIndex(70290);
        }

        private C59881m() {
        }

        /* renamed from: a */
        public static AddMultiVideoFragment m109337a() {
            Bundle bundle = new Bundle();
            AddMultiVideoFragment addMultiVideoFragment = new AddMultiVideoFragment();
            addMultiVideoFragment.setArguments(bundle);
            return addMultiVideoFragment;
        }

        public /* synthetic */ C59881m(byte b) {
            this();
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

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$d */
    public static final class C59872d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59872d INSTANCE = new C59872d();

        static {
            Covode.recordClassIndex(70281);
        }

        public C59872d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$f */
    public static final class C59874f extends AbstractC89220m implements AbstractC89171a<C12874b<C59528a>> {
        public static final C59874f INSTANCE = new C59874f();

        static {
            Covode.recordClassIndex(70283);
        }

        public C59874f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59528a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$i */
    public static final class C59877i extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59877i INSTANCE = new C59877i();

        static {
            Covode.recordClassIndex(70286);
        }

        public C59877i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$l */
    public static final class C59880l extends AbstractC89220m implements AbstractC89171a<C12874b<C59853a>> {
        public static final C59880l INSTANCE = new C59880l();

        static {
            Covode.recordClassIndex(70289);
        }

        public C59880l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59853a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$b */
    public static final class C59870b extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f136378a;

        static {
            Covode.recordClassIndex(70279);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59870b(Fragment fragment) {
            super(0);
            this.f136378a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f136378a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$g */
    public static final class C59875g extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f136380a;

        static {
            Covode.recordClassIndex(70284);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59875g(Fragment fragment) {
            super(0);
            this.f136380a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f136380a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f136373j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$a */
    public static final class C59869a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f136377a;

        static {
            Covode.recordClassIndex(70278);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59869a(AbstractC89277c cVar) {
            super(0);
            this.f136377a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f136377a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$c */
    public static final class C59871c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f136379a;

        static {
            Covode.recordClassIndex(70280);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59871c(Fragment fragment) {
            super(0);
            this.f136379a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f136379a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$h */
    public static final class C59876h extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f136381a;

        static {
            Covode.recordClassIndex(70285);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59876h(Fragment fragment) {
            super(0);
            this.f136381a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f136381a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$j */
    public static final class C59878j extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f136382a;

        static {
            Covode.recordClassIndex(70287);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59878j(AbstractC89277c cVar) {
            super(0);
            this.f136382a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f136382a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$v */
    static final class C59891v extends AbstractC89220m implements AbstractC89171a<MultiVideoViewModel> {

        /* renamed from: a */
        final /* synthetic */ AddMultiVideoFragment f136391a;

        static {
            Covode.recordClassIndex(70300);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59891v(AddMultiVideoFragment addMultiVideoFragment) {
            super(0);
            this.f136391a = addMultiVideoFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MultiVideoViewModel invoke() {
            AbstractC1174ac a = C1181ae.m3879a(this.f136391a, (C1175ad.AbstractC1177b) null).mo3983a(MultiVideoViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(view, "");
        view.setFocusableInTouchMode(true);
        View view2 = getView();
        if (view2 == null) {
            C89219l.m154715b();
        }
        view2.requestFocus();
        View view3 = getView();
        if (view3 == null) {
            C89219l.m154715b();
        }
        view3.setOnKeyListener(new View$OnKeyListenerC59890u(this));
    }

    public AddMultiVideoFragment() {
        AbstractC89277c a = C89204ab.m154669a(MixCreateViewModel.class);
        this.f136371d = new C12814b(a, new C59869a(a), C59874f.INSTANCE, new C59875g(this), new C59876h(this), C59877i.INSTANCE, C59873e.INSTANCE);
        AbstractC89277c a2 = C89204ab.m154669a(MixVideosManageViewModel.class);
        this.f136372e = new C12814b(a2, new C59878j(a2), C59880l.INSTANCE, new C59870b(this), new C59871c(this), C59872d.INSTANCE, C59879k.INSTANCE);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$CandidateGridLayoutManager */
    public static final class CandidateGridLayoutManager extends GridLayoutManager {

        /* renamed from: L */
        public final PowerList f136374L;

        static {
            Covode.recordClassIndex(70276);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager
        /* renamed from: a */
        public final void mo4320a(GridLayoutManager.AbstractC1337c cVar) {
            super.mo4320a(new C59868a(this, cVar));
        }

        /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$CandidateGridLayoutManager$a */
        public static final class C59868a extends GridLayoutManager.AbstractC1337c {

            /* renamed from: e */
            final /* synthetic */ CandidateGridLayoutManager f136375e;

            /* renamed from: f */
            final /* synthetic */ GridLayoutManager.AbstractC1337c f136376f;

            static {
                Covode.recordClassIndex(70277);
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
            /* renamed from: a */
            public final int mo4342a(int i) {
                List<AbstractC17641a> c = this.f136375e.f136374L.getState().mo28140c();
                int headerCount = this.f136375e.f136374L.getHeaderCount();
                if (i < headerCount) {
                    return ((GridLayoutManager) this.f136375e).f4316b;
                }
                if (i >= c.size() + headerCount) {
                    return ((GridLayoutManager) this.f136375e).f4316b;
                }
                int i2 = i - headerCount;
                if (c.get(i2) instanceof C17660a) {
                    return ((GridLayoutManager) this.f136375e).f4316b;
                }
                GridLayoutManager.AbstractC1337c cVar = this.f136376f;
                if (cVar != null) {
                    return cVar.mo4342a(i2);
                }
                return 1;
            }

            C59868a(CandidateGridLayoutManager candidateGridLayoutManager, GridLayoutManager.AbstractC1337c cVar) {
                this.f136375e = candidateGridLayoutManager;
                this.f136376f = cVar;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CandidateGridLayoutManager(Context context, PowerList powerList) {
            super(3);
            C89219l.m154721d(context, "");
            C89219l.m154721d(powerList, "");
            this.f136374L = powerList;
            mo4320a((GridLayoutManager.AbstractC1337c) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$o */
    static final class View$OnClickListenerC59883o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddMultiVideoFragment f136383a;

        static {
            Covode.recordClassIndex(70292);
        }

        View$OnClickListenerC59883o(AddMultiVideoFragment addMultiVideoFragment) {
            this.f136383a = addMultiVideoFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f136383a.mo97271a().mo97290b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$s */
    static final class View$OnClickListenerC59887s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddMultiVideoFragment f136388a;

        static {
            Covode.recordClassIndex(70296);
        }

        View$OnClickListenerC59887s(AddMultiVideoFragment addMultiVideoFragment) {
            this.f136388a = addMultiVideoFragment;
        }

        public final void onClick(View view) {
            AbstractC0952i supportFragmentManager;
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f136388a.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                this.f136388a.mo97273c().mo97230a(true);
                if (supportFragmentManager.mo3564e() == 0) {
                    ActivityC0945e activity2 = this.f136388a.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                        return;
                    }
                    return;
                }
                supportFragmentManager.mo3562c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$q */
    static final class C59885q<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AddMultiVideoFragment f136386a;

        static {
            Covode.recordClassIndex(70294);
        }

        C59885q(AddMultiVideoFragment addMultiVideoFragment) {
            this.f136386a = addMultiVideoFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            int status = MultiVideoViewModel.EnumC59898a.EMPTY.getStatus();
            if (num != null && num.intValue() == status) {
                DmtStatusView dmtStatusView = (DmtStatusView) this.f136386a.mo97270a(R.id.a1d);
                C89219l.m154716b(dmtStatusView, "");
                dmtStatusView.setVisibility(0);
                ((DmtStatusView) this.f136386a.mo97270a(R.id.a1d)).mo27385g();
                return;
            }
            int status2 = MultiVideoViewModel.EnumC59898a.ERROR.getStatus();
            if (num != null && num.intValue() == status2) {
                DmtStatusView dmtStatusView2 = (DmtStatusView) this.f136386a.mo97270a(R.id.a1d);
                C89219l.m154716b(dmtStatusView2, "");
                dmtStatusView2.setVisibility(0);
                ((DmtStatusView) this.f136386a.mo97270a(R.id.a1d)).mo27387h();
                return;
            }
            int status3 = MultiVideoViewModel.EnumC59898a.SUCCESS.getStatus();
            if (num != null && num.intValue() == status3) {
                DmtStatusView dmtStatusView3 = (DmtStatusView) this.f136386a.mo97270a(R.id.a1d);
                C89219l.m154716b(dmtStatusView3, "");
                dmtStatusView3.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$r */
    static final class C59886r<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AddMultiVideoFragment f136387a;

        static {
            Covode.recordClassIndex(70295);
        }

        C59886r(AddMultiVideoFragment addMultiVideoFragment) {
            this.f136387a = addMultiVideoFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            TuxButton tuxButton = (TuxButton) this.f136387a.mo97270a(R.id.cs9);
            C89219l.m154716b(tuxButton, "");
            if (num.intValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            tuxButton.setEnabled(z);
            TuxButton tuxButton2 = (TuxButton) this.f136387a.mo97270a(R.id.cs9);
            C89219l.m154716b(tuxButton2, "");
            Resources resources = this.f136387a.getResources();
            C89219l.m154716b(num, "");
            tuxButton2.setText(resources.getQuantityString(R.plurals.fb, num.intValue(), num));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$p */
    static final class C59884p<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AddMultiVideoFragment f136384a;

        /* renamed from: b */
        final /* synthetic */ int f136385b;

        static {
            Covode.recordClassIndex(70293);
        }

        C59884p(AddMultiVideoFragment addMultiVideoFragment, int i) {
            this.f136384a = addMultiVideoFragment;
            this.f136385b = i;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            TuxButton tuxButton = (TuxButton) this.f136384a.mo97270a(R.id.cs9);
            C89219l.m154716b(tuxButton, "");
            if (num.intValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            tuxButton.setEnabled(z);
            if (num.intValue() >= this.f136385b) {
                if (!this.f136384a.mo97271a().f136412h) {
                    this.f136384a.f136369a = true;
                    this.f136384a.mo97271a().f136412h = true;
                    PowerList powerList = (PowerList) this.f136384a.mo97270a(R.id.db9);
                    C89219l.m154716b(powerList, "");
                    int i = 0;
                    for (T t : powerList.getState().mo28140c()) {
                        if (t instanceof C59905a) {
                            T t2 = t;
                            if (!t2.f136429b) {
                                C59905a aVar = C59905a.m109350a(t2.f136428a, t2.f136429b, true, t2.f136431d, t2.f136432e, t2.f136433f, t2.f136434g);
                                PowerList powerList2 = (PowerList) this.f136384a.mo97270a(R.id.db9);
                                C89219l.m154716b(powerList2, "");
                                powerList2.getState().mo28136b(i, aVar);
                            }
                        }
                        i++;
                    }
                    String string = this.f136384a.getResources().getString(R.string.gfe);
                    C89219l.m154716b(string, "");
                    String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f136385b)}, 1));
                    C89219l.m154716b(a, "");
                    new C23144b(this.f136384a).mo37635a(a).mo37637b();
                    this.f136384a.mo97271a().f136411g = false;
                    if (this.f136384a.getActivity() instanceof MixFeedManagerActivity) {
                        C59330a.m109034a(this.f136384a.mo97273c().mo23342g(), this.f136384a.mo97273c().f136169j, "manage_video");
                    } else {
                        C59330a.m109034a(this.f136384a.mo97272b().f135806j, this.f136384a.mo97272b().f135807k, "create_playlist");
                    }
                } else {
                    return;
                }
            } else if (this.f136384a.f136369a) {
                this.f136384a.f136369a = false;
                PowerList powerList3 = (PowerList) this.f136384a.mo97270a(R.id.db9);
                C89219l.m154716b(powerList3, "");
                int i2 = 0;
                for (T t3 : powerList3.getState().mo28140c()) {
                    if (t3 instanceof C59905a) {
                        T t4 = t3;
                        if (!t4.f136431d && !t4.f136429b) {
                            C59905a aVar2 = C59905a.m109350a(t4.f136428a, t4.f136429b, false, t4.f136431d, t4.f136432e, t4.f136433f, t4.f136434g);
                            PowerList powerList4 = (PowerList) this.f136384a.mo97270a(R.id.db9);
                            C89219l.m154716b(powerList4, "");
                            powerList4.getState().mo28136b(i2, aVar2);
                        }
                    }
                    i2++;
                }
                this.f136384a.mo97271a().f136411g = true;
            }
            if (!(this.f136384a.getActivity() instanceof MixFeedManagerActivity)) {
                TuxButton tuxButton2 = (TuxButton) this.f136384a.mo97270a(R.id.cs9);
                C89219l.m154716b(tuxButton2, "");
                String string2 = this.f136384a.getString(R.string.dfc);
                C89219l.m154716b(string2, "");
                String a2 = C1764a.m5928a(string2, Arrays.copyOf(new Object[]{num}, 1));
                C89219l.m154716b(a2, "");
                tuxButton2.setText(a2);
            }
            if (num.intValue() < this.f136385b) {
                this.f136384a.mo97271a().f136412h = false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$t */
    static final class View$OnClickListenerC59888t implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddMultiVideoFragment f136389a;

        static {
            Covode.recordClassIndex(70297);
        }

        View$OnClickListenerC59888t(AddMultiVideoFragment addMultiVideoFragment) {
            this.f136389a = addMultiVideoFragment;
        }

        public final void onClick(View view) {
            AbstractC0952i supportFragmentManager;
            AbstractC0952i supportFragmentManager2;
            AbstractC0952i supportFragmentManager3;
            ClickAgent.onClick(view);
            TuxButton tuxButton = (TuxButton) this.f136389a.mo97270a(R.id.cs9);
            C89219l.m154716b(tuxButton, "");
            if (tuxButton.isEnabled()) {
                if (this.f136389a.getActivity() instanceof MixFeedManagerActivity) {
                    MixVideosManageViewModel c = this.f136389a.mo97273c();
                    AddMultiVideoFragment addMultiVideoFragment = this.f136389a;
                    ArrayList arrayList = new ArrayList();
                    PowerList powerList = (PowerList) addMultiVideoFragment.mo97270a(R.id.db9);
                    C89219l.m154716b(powerList, "");
                    for (T t : powerList.getState().mo28140c()) {
                        for (Aweme aweme : addMultiVideoFragment.mo97271a().f136407c) {
                            if (t instanceof C59905a) {
                                T t2 = t;
                                if (C89219l.m154714a(t2.f136432e, aweme) && !t2.f136433f) {
                                    arrayList.add(aweme);
                                }
                            }
                        }
                    }
                    List<Aweme> list = this.f136389a.mo97271a().f136407c;
                    C89219l.m154721d(arrayList, "");
                    C89219l.m154721d(list, "");
                    List<Aweme> list2 = ((C59853a) c.mo20671d().mo20680a()).f136325a;
                    C89233z.C89238e eVar = new C89233z.C89238e();
                    eVar.element = (T) new ArrayList();
                    if (list2 != null) {
                        eVar.element.addAll(C89070n.m154590j(list2));
                        eVar.element.addAll(0, arrayList);
                    }
                    c.mo20662a(new MixVideosManageViewModel.C59778b(eVar, c, arrayList, list));
                    c.mo20662a(new MixVideosManageViewModel.C59779c(c, arrayList, list));
                }
                MixCreateViewModel b = this.f136389a.mo97272b();
                List a = C89070n.m154553a((Iterable) this.f136389a.mo97271a().f136407c, (Comparator) new C59889a());
                C89219l.m154721d(a, "");
                b.mo20662a(new MixCreateViewModel.C59513f(a));
                if (this.f136389a.getActivity() instanceof MixFeedManagerActivity) {
                    ActivityC0945e activity = this.f136389a.getActivity();
                    if (!(activity == null || (supportFragmentManager3 = activity.getSupportFragmentManager()) == null)) {
                        this.f136389a.mo97273c().mo97230a(true);
                        supportFragmentManager3.mo3562c();
                    }
                    String g = this.f136389a.mo97273c().mo23342g();
                    String str = this.f136389a.mo97273c().f136169j;
                    Integer value = this.f136389a.mo97271a().f136413i.getValue();
                    if (value == null) {
                        value = 0;
                    }
                    C89219l.m154716b(value, "");
                    C39162r.m79460a("add_multiple_playlist_video", new C33744d().mo59983a("enter_from", str).mo59983a("enter_method", "manage_video").mo59980a("add_cnt", value.intValue()).mo59983a("playlist_id", g).f79943a);
                    Resources resources = this.f136389a.getResources();
                    Integer value2 = this.f136389a.mo97271a().f136413i.getValue();
                    if (value2 == null) {
                        value2 = 0;
                    }
                    C89219l.m154716b(value2, "");
                    String quantityString = resources.getQuantityString(R.plurals.m, value2.intValue(), this.f136389a.mo97271a().f136413i.getValue());
                    C89219l.m154716b(quantityString, "");
                    new C23144b(this.f136389a).mo37635a(quantityString).mo37637b();
                } else if (C59413b.m109112a() != 2 || !this.f136389a.mo97272b().mo23343h()) {
                    ActivityC0945e activity2 = this.f136389a.getActivity();
                    if (activity2 == null || (supportFragmentManager2 = activity2.getSupportFragmentManager()) == null || supportFragmentManager2.mo3551a("MixFeedOrderFragment") == null) {
                        C59467g a2 = C59467g.C59474g.m109144a();
                        ActivityC0945e activity3 = this.f136389a.getActivity();
                        if (!(activity3 == null || (supportFragmentManager = activity3.getSupportFragmentManager()) == null)) {
                            supportFragmentManager.mo3552a().mo3452a(R.anim.dq, R.anim.dx, 0, R.anim.dx).mo3454a(R.id.b82, a2, "AddMultiVideoFragment").mo3457a((String) null).mo3467b();
                        }
                        C59330a.m109042f(this.f136389a.mo97272b().f135807k, this.f136389a.mo97272b().f135808l);
                    }
                } else {
                    this.f136389a.mo97272b().mo97102a(EnumC59529b.CREATE_NAME);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$t$a */
        public static final class C59889a<T> implements Comparator {
            static {
                Covode.recordClassIndex(70298);
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C89090a.m154604a(t2.getAid(), t.getAid());
            }
        }
    }

    /* renamed from: a */
    private static Object m109324a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(2939);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(2939);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        Collection<? extends Aweme> arrayList;
        List<String> arrayList2;
        MethodCollector.m26663i(2828);
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(getContext());
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.akt, (ViewGroup) null);
        C89219l.m154716b(inflate, "");
        DmtStatusView.C17269a a2 = a.mo27406b(inflate).mo27401a(R.string.fz3, new View$OnClickListenerC59883o(this));
        a2.f41304g = 0;
        ((DmtStatusView) mo97270a(R.id.a1d)).setBuilder(a2);
        if (getActivity() instanceof MixFeedManagerActivity) {
            MultiVideoViewModel a3 = mo97271a();
            String g = mo97273c().mo23342g();
            C89219l.m154721d(g, "");
            a3.f136415k = g;
        }
        int i = Build.VERSION.SDK_INT;
        Context context = getContext();
        if (context != null) {
            obj = m109324a(context, "input_method");
        } else {
            obj = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) obj;
        if (inputMethodManager != null) {
            TuxButton tuxButton = (TuxButton) mo97270a(R.id.cs9);
            C89219l.m154716b(tuxButton, "");
            inputMethodManager.hideSoftInputFromWindow(tuxButton.getWindowToken(), 0);
        }
        DmtStatusView dmtStatusView = (DmtStatusView) mo97270a(R.id.a1d);
        C89219l.m154716b(dmtStatusView, "");
        dmtStatusView.setVisibility(0);
        if (getActivity() instanceof MixFeedManagerActivity) {
            TuxButton tuxButton2 = (TuxButton) mo97270a(R.id.cs9);
            C89219l.m154716b(tuxButton2, "");
            tuxButton2.setText(getString(R.string.pd));
        } else {
            TuxButton tuxButton3 = (TuxButton) mo97270a(R.id.cs9);
            C89219l.m154716b(tuxButton3, "");
            tuxButton3.setText(getString(R.string.dfb));
        }
        if (getActivity() instanceof MixFeedManagerActivity) {
            List<Aweme> list = mo97271a().f136407c;
            C59853a aVar = (C59853a) mo97273c().mo20671d().mo20680a();
            if (aVar != null) {
                arrayList = aVar.f136330f;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
            } else {
                arrayList = new ArrayList<>();
            }
            list.addAll(arrayList);
            mo97271a().f136413i.postValue(0);
            MultiVideoViewModel a4 = mo97271a();
            C59853a aVar2 = (C59853a) mo97273c().mo20671d().mo20680a();
            if (aVar2 != null) {
                arrayList2 = aVar2.f136331g;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
            } else {
                arrayList2 = new ArrayList<>();
            }
            a4.f136414j = arrayList2;
        }
        TuxButton tuxButton4 = (TuxButton) mo97270a(R.id.cs9);
        C89219l.m154716b(tuxButton4, "");
        tuxButton4.setEnabled(false);
        if (getContext() != null) {
            ((PowerList) mo97270a(R.id.db9)).mo28083a(MixPickCandidatePowerCell.class);
            ((RecyclerView) mo97270a(R.id.db9)).mo4415b(new C59882n());
            RecyclerView recyclerView = (RecyclerView) mo97270a(R.id.db9);
            C89219l.m154716b(recyclerView, "");
            Context context2 = getContext();
            if (context2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context2, "");
            PowerList powerList = (PowerList) mo97270a(R.id.db9);
            C89219l.m154716b(powerList, "");
            recyclerView.setLayoutManager(new CandidateGridLayoutManager(context2, powerList));
            RecyclerView recyclerView2 = (RecyclerView) mo97270a(R.id.db9);
            C89219l.m154716b(recyclerView2, "");
            recyclerView2.setItemAnimator(null);
            ((PowerList) mo97270a(R.id.db9)).mo28082a(mo97271a().mo97287a());
            mo97271a().mo97290b();
            ((PowerList) mo97270a(R.id.db9)).mo28079a(0, C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.akg, null, false));
            DmtStatusView dmtStatusView2 = (DmtStatusView) mo97270a(R.id.a1d);
            if (dmtStatusView2 != null) {
                dmtStatusView2.mo27384f();
            }
        }
        mo97271a().f136408d.observe(this, new C59884p(this, SettingsManager.m29616a().mo25394a("mix_max_add_aweme_count", 100)));
        mo97271a().f136409e.observe(this, new C59885q(this));
        if (getActivity() instanceof MixFeedManagerActivity) {
            mo97271a().f136413i.observe(this, new C59886r(this));
        }
        ((ImageView) mo97270a(R.id.cq6)).setOnClickListener(new View$OnClickListenerC59887s(this));
        ((TuxButton) mo97270a(R.id.cs9)).setOnClickListener(new View$OnClickListenerC59888t(this));
        MethodCollector.m26664o(2828);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$n */
    public static final class C59882n extends RecyclerView.AbstractC1361h {
        static {
            Covode.recordClassIndex(70291);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            C89219l.m154721d(canvas, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            super.onDraw(canvas, recyclerView, sVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            C89219l.m154721d(rect, "");
            C89219l.m154721d(view, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            super.getItemOffsets(rect, view, recyclerView, sVar);
            rect.set(2, 2, 2, 2);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.akl, viewGroup, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment$u */
    static final class View$OnKeyListenerC59890u implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ AddMultiVideoFragment f136390a;

        static {
            Covode.recordClassIndex(70299);
        }

        View$OnKeyListenerC59890u(AddMultiVideoFragment addMultiVideoFragment) {
            this.f136390a = addMultiVideoFragment;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            AbstractC0952i supportFragmentManager;
            C89219l.m154716b(keyEvent, "");
            if (keyEvent.getAction() != 0 || i != 4) {
                return false;
            }
            ActivityC0945e activity = this.f136390a.getActivity();
            if (!(activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null)) {
                this.f136390a.mo97273c().mo97230a(true);
                if (supportFragmentManager.mo3564e() == 0) {
                    ActivityC0945e activity2 = this.f136390a.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                } else {
                    supportFragmentManager.mo3562c();
                }
            }
            return true;
        }
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
