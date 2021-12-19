package com.p2082ss.android.ugc.aweme.qna.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
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
import com.bytedance.assem.arch.core.C12767q;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12780d;
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
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qna.model.C66293f;
import com.p2082ss.android.ugc.aweme.qna.p3643a.C65884a;
import com.p2082ss.android.ugc.aweme.qna.p3645c.AbstractC66019b;
import com.p2082ss.android.ugc.aweme.qna.p3646d.C66025a;
import com.p2082ss.android.ugc.aweme.qna.p3646d.C66035c;
import com.p2082ss.android.ugc.aweme.qna.p3646d.C66057k;
import com.p2082ss.android.ugc.aweme.qna.p3646d.C66058l;
import com.p2082ss.android.ugc.aweme.qna.p3649g.C66277a;
import com.p2082ss.android.ugc.aweme.qna.p3649g.C66278b;
import com.p2082ss.android.ugc.aweme.qna.p3650ui.C66334l;
import com.p2082ss.android.ugc.aweme.qna.p3650ui.QnaRecyclerView;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66355a;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66356b;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66357c;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66358d;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66360f;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66362h;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaAnswersTabViewModel;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaBannerViewModel;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaSelectedPageViewModel;
import com.p2082ss.android.ugc.aweme.service.EOYServiceImpl;
import com.p2082ss.android.ugc.aweme.service.IEOYService;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
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
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.qna.fragment.g */
public final class C66106g extends AbstractC66098a implements AbstractC12846h, AbstractC90252i, AbstractC90253j {

    /* renamed from: n */
    public static final C66110ac f148832n = new C66110ac((byte) 0);

    /* renamed from: i */
    public View f148833i;

    /* renamed from: j */
    public QnaAnswersTabViewModel f148834j;

    /* renamed from: k */
    public C66334l f148835k;

    /* renamed from: l */
    public String f148836l;

    /* renamed from: m */
    public boolean f148837m;

    /* renamed from: o */
    private final C12814b f148838o;

    /* renamed from: p */
    private final C12814b f148839p;

    /* renamed from: q */
    private SparseArray f148840q;

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$h */
    public static final class C66134h extends AbstractC89220m implements AbstractC89172b<C66362h, C66362h> {
        public static final C66134h INSTANCE = new C66134h();

        static {
            Covode.recordClassIndex(77642);
        }

        public C66134h() {
            super(1);
        }

        public final C66362h invoke(C66362h hVar) {
            C89219l.m154719c(hVar, "");
            return hVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$l */
    public static final class C66138l extends AbstractC89220m implements AbstractC89172b<C66360f, C66360f> {
        public static final C66138l INSTANCE = new C66138l();

        static {
            Covode.recordClassIndex(77646);
        }

        public C66138l() {
            super(1);
        }

        public final C66360f invoke(C66360f fVar) {
            C89219l.m154719c(fVar, "");
            return fVar;
        }
    }

    static {
        Covode.recordClassIndex(77614);
    }

    /* renamed from: j */
    private final QnaBannerViewModel m117916j() {
        return (QnaBannerViewModel) this.f148838o.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f148840q == null) {
            this.f148840q = new SparseArray();
        }
        View view = (View) this.f148840q.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f148840q.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a
    public final void bx_() {
        SparseArray sparseArray = this.f148840q;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a
    /* renamed from: c */
    public final int mo64296c() {
        return R.string.f1n;
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a
    /* renamed from: d */
    public final String mo105141d() {
        return "answers";
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

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new RunnableC90250g(C66106g.class, "onVideoEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        return hashMap;
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

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$ac */
    public static final class C66110ac {
        static {
            Covode.recordClassIndex(77618);
        }

        private C66110ac() {
        }

        public /* synthetic */ C66110ac(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$b */
    public static final class C66128b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148862a;

        static {
            Covode.recordClassIndex(77636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66128b(Fragment fragment) {
            super(0);
            this.f148862a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            return this.f148862a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$q */
    public static final class C66143q extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148871a;

        static {
            Covode.recordClassIndex(77651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66143q(Fragment fragment) {
            super(0);
            this.f148871a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            return this.f148871a;
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

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$ab */
    public static final class C66109ab extends AbstractC89220m implements AbstractC89171a<C12874b<C66360f>> {
        public static final C66109ab INSTANCE = new C66109ab();

        static {
            Covode.recordClassIndex(77617);
        }

        public C66109ab() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66360f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$ad */
    static final class C66111ad extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66106g f148843a;

        static {
            Covode.recordClassIndex(77619);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66111ad(C66106g gVar) {
            super(0);
            this.f148843a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f148843a.mo105153i();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$d */
    public static final class C66130d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C66130d INSTANCE = new C66130d();

        static {
            Covode.recordClassIndex(77638);
        }

        public C66130d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$i */
    public static final class C66135i extends AbstractC89220m implements AbstractC89171a<C12874b<C66362h>> {
        public static final C66135i INSTANCE = new C66135i();

        static {
            Covode.recordClassIndex(77643);
        }

        public C66135i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66362h> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$m */
    public static final class C66139m extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C66139m INSTANCE = new C66139m();

        static {
            Covode.recordClassIndex(77647);
        }

        public C66139m() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$p */
    public static final class C66142p extends AbstractC89220m implements AbstractC89171a<C12874b<C66362h>> {
        public static final C66142p INSTANCE = new C66142p();

        static {
            Covode.recordClassIndex(77650);
        }

        public C66142p() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66362h> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$s */
    public static final class C66145s extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C66145s INSTANCE = new C66145s();

        static {
            Covode.recordClassIndex(77653);
        }

        public C66145s() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$v */
    public static final class C66148v extends AbstractC89220m implements AbstractC89171a<C12874b<C66360f>> {
        public static final C66148v INSTANCE = new C66148v();

        static {
            Covode.recordClassIndex(77656);
        }

        public C66148v() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66360f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$y */
    public static final class C66151y extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C66151y INSTANCE = new C66151y();

        static {
            Covode.recordClassIndex(77659);
        }

        public C66151y() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a
    /* renamed from: f */
    public final void mo105143f() {
        if (this.f148834j != null) {
            mo105153i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$ag */
    static final class C66114ag extends AbstractC89220m implements AbstractC89172b<EnumC66276w, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66106g f148846a;

        static {
            Covode.recordClassIndex(77622);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66114ag(C66106g gVar) {
            super(1);
            this.f148846a = gVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$ag$a */
        static final class C66115a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C66114ag f148847a;

            /* renamed from: b */
            final /* synthetic */ EnumC66276w f148848b;

            static {
                Covode.recordClassIndex(77623);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C66115a(C66114ag agVar, EnumC66276w wVar) {
                super(0);
                this.f148847a = agVar;
                this.f148848b = wVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f148847a.f148846a.mo105153i();
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC66276w wVar) {
            EnumC66276w wVar2 = wVar;
            C89219l.m154721d(wVar2, "");
            if (this.f148846a.f148836l != null) {
                C66106g gVar = this.f148846a;
                gVar.mo105137a((AbstractC66098a) wVar2, (EnumC66276w) gVar.mo105151g(), (View) EnumC66275v.Answers, (EnumC66275v) this.f148846a.mo105152h(), (boolean) this.f148846a.f148836l, (String) ((AbstractC89171a<C89391z>) new C66115a(this, wVar2)), (AbstractC89171a) false);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$am */
    static final class C66121am extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, User, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66106g f148854a;

        static {
            Covode.recordClassIndex(77629);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66121am(C66106g gVar) {
            super(2);
            this.f148854a = gVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$am$a */
        static final class C66122a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C66121am f148855a;

            static {
                Covode.recordClassIndex(77630);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C66122a(C66121am amVar) {
                super(0);
                this.f148855a = amVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f148855a.f148854a.mo105153i();
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, User user) {
            LiveData<C66278b<EnumC66276w>> liveData;
            C66278b<EnumC66276w> value;
            T t;
            User user2 = user;
            C89219l.m154721d(dVar, "");
            if (user2 != null) {
                this.f148854a.f148836l = C80580in.m139677a(user2, false);
                QnaAnswersTabViewModel qnaAnswersTabViewModel = this.f148854a.f148834j;
                if (!(qnaAnswersTabViewModel == null || (liveData = qnaAnswersTabViewModel.f149172c) == null || (value = liveData.getValue()) == null || (t = value.f149006b) == null)) {
                    C66106g gVar = this.f148854a;
                    gVar.mo105137a((AbstractC66098a) t, (EnumC66276w) gVar.mo105151g(), (View) EnumC66275v.Answers, (EnumC66275v) this.f148854a.mo105152h(), (boolean) this.f148854a.f148836l, (String) ((AbstractC89171a<C89391z>) new C66122a(this)), (AbstractC89171a) false);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$c */
    public static final class C66129c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148863a;

        static {
            Covode.recordClassIndex(77637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66129c(Fragment fragment) {
            super(0);
            this.f148863a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f148863a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$j */
    public static final class C66136j extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148867a;

        static {
            Covode.recordClassIndex(77644);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66136j(Fragment fragment) {
            super(0);
            this.f148867a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f148867a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$r */
    public static final class C66144r extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148872a;

        static {
            Covode.recordClassIndex(77652);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66144r(Fragment fragment) {
            super(0);
            this.f148872a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f148872a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$w */
    public static final class C66149w extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148875a;

        static {
            Covode.recordClassIndex(77657);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66149w(Fragment fragment) {
            super(0);
            this.f148875a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f148875a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    /* renamed from: g */
    public final View mo105151g() {
        View view = this.f148833i;
        if (view == null) {
            C89219l.m154710a("answerTabLayout");
        }
        return view;
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$a */
    public static final class C66107a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f148841a;

        static {
            Covode.recordClassIndex(77615);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66107a(AbstractC89277c cVar) {
            super(0);
            this.f148841a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f148841a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$aa */
    public static final class C66108aa extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148842a;

        static {
            Covode.recordClassIndex(77616);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66108aa(Fragment fragment) {
            super(0);
            this.f148842a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f148842a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f148842a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$e */
    public static final class C66131e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148864a;

        static {
            Covode.recordClassIndex(77639);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66131e(Fragment fragment) {
            super(0);
            this.f148864a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f148864a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f148864a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$f */
    public static final class C66132f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148865a;

        static {
            Covode.recordClassIndex(77640);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66132f(Fragment fragment) {
            super(0);
            this.f148865a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f148865a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f148865a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$g */
    public static final class C66133g extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f148866a;

        static {
            Covode.recordClassIndex(77641);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66133g(AbstractC89277c cVar) {
            super(0);
            this.f148866a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f148866a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$k */
    public static final class C66137k extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148868a;

        static {
            Covode.recordClassIndex(77645);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66137k(Fragment fragment) {
            super(0);
            this.f148868a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f148868a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$n */
    public static final class C66140n extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148869a;

        static {
            Covode.recordClassIndex(77648);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66140n(Fragment fragment) {
            super(0);
            this.f148869a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f148869a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f148869a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$o */
    public static final class C66141o extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148870a;

        static {
            Covode.recordClassIndex(77649);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66141o(Fragment fragment) {
            super(0);
            this.f148870a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f148870a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f148870a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$t */
    public static final class C66146t extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148873a;

        static {
            Covode.recordClassIndex(77654);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66146t(Fragment fragment) {
            super(0);
            this.f148873a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f148873a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f148873a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$u */
    public static final class C66147u extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148874a;

        static {
            Covode.recordClassIndex(77655);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66147u(Fragment fragment) {
            super(0);
            this.f148874a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f148874a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f148874a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$x */
    public static final class C66150x extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148876a;

        static {
            Covode.recordClassIndex(77658);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66150x(Fragment fragment) {
            super(0);
            this.f148876a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f148876a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$z */
    public static final class C66152z extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148877a;

        static {
            Covode.recordClassIndex(77660);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66152z(Fragment fragment) {
            super(0);
            this.f148877a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f148877a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f148877a.getActivity());
        }
    }

    /* renamed from: h */
    public final boolean mo105152h() {
        String str = ((AbstractC66098a) this).f148814f;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        return TextUtils.equals(str, g.getCurUserId());
    }

    /* renamed from: i */
    public final void mo105153i() {
        String lastRecordedSecUid;
        String str = ((AbstractC66098a) this).f148814f;
        if (str != null) {
            IAccountUserService g = C31575b.m65865g();
            if (mo105152h()) {
                C89219l.m154716b(g, "");
                str = g.getCurUserId();
            }
            boolean h = mo105152h();
            C89219l.m154716b(g, "");
            if (h) {
                lastRecordedSecUid = g.getCurSecUserId();
            } else {
                lastRecordedSecUid = g.getLastRecordedSecUid();
            }
            QnaAnswersTabViewModel qnaAnswersTabViewModel = this.f148834j;
            if (qnaAnswersTabViewModel != null) {
                C89219l.m154716b(str, "");
                C89219l.m154716b(lastRecordedSecUid, "");
                qnaAnswersTabViewModel.mo105255a(str, lastRecordedSecUid, this.f148836l, this.f148837m);
            }
        }
    }

    public C66106g() {
        C12814b bVar;
        C12814b bVar2;
        AbstractC12848i.C12849a aVar = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a = C89204ab.m154669a(QnaBannerViewModel.class);
        C66107a aVar2 = new C66107a(a);
        C66138l lVar = C66138l.INSTANCE;
        if (C89219l.m154714a(aVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar2, C66148v.INSTANCE, new C66149w(this), new C66150x(this), C66151y.INSTANCE, lVar, new C66152z(this), new C66108aa(this));
        } else if (aVar == null || C89219l.m154714a(aVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar2, C66109ab.INSTANCE, new C66128b(this), new C66129c(this), C66130d.INSTANCE, lVar, new C66131e(this), new C66132f(this));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f148838o = bVar;
        AbstractC12848i.C12849a aVar3 = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a2 = C89204ab.m154669a(QnaSelectedPageViewModel.class);
        C66133g gVar = new C66133g(a2);
        C66134h hVar = C66134h.INSTANCE;
        if (C89219l.m154714a(aVar3, AbstractC12848i.C12849a.f31275a)) {
            bVar2 = new C12814b(a2, gVar, C66135i.INSTANCE, new C66136j(this), new C66137k(this), C66139m.INSTANCE, hVar, new C66140n(this), new C66141o(this));
        } else if (aVar3 == null || C89219l.m154714a(aVar3, AbstractC12848i.C12852d.f31278a)) {
            bVar2 = new C12814b(a2, gVar, C66142p.INSTANCE, new C66143q(this), new C66144r(this), C66145s.INSTANCE, hVar, new C66146t(this), new C66147u(this));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f148839p = bVar2;
        C80298cg.m139204a(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$an */
    static final class C66123an extends AbstractC89220m implements AbstractC89172b<BaseFragmentViewModel, C89391z> {

        /* renamed from: a */
        public static final C66123an f148856a = new C66123an();

        static {
            Covode.recordClassIndex(77631);
        }

        C66123an() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            C89219l.m154721d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(C661241.f148857a);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo27716a(C66123an.f148856a);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$ah */
    static final class C66116ah extends AbstractC89220m implements AbstractC89172b<C66358d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66106g f148849a;

        static {
            Covode.recordClassIndex(77624);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66116ah(C66106g gVar) {
            super(1);
            this.f148849a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C66358d dVar) {
            C66358d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            String str = dVar2.f149229a;
            String str2 = dVar2.f149230b;
            Context requireContext = this.f148849a.requireContext();
            C89219l.m154716b(requireContext, "");
            C66106g.m117904a(str, str2, requireContext, this.f148849a.mo105152h());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$ai */
    static final class C66117ai extends AbstractC89220m implements AbstractC89172b<C66355a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66106g f148850a;

        static {
            Covode.recordClassIndex(77625);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66117ai(C66106g gVar) {
            super(1);
            this.f148850a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C66355a aVar) {
            C66355a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            this.f148850a.mo105139a(aVar2.f149220a, aVar2.f149221b, this.f148850a.mo105152h());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$aj */
    static final class C66118aj extends AbstractC89220m implements AbstractC89172b<C66357c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66106g f148851a;

        static {
            Covode.recordClassIndex(77626);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66118aj(C66106g gVar) {
            super(1);
            this.f148851a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C66357c cVar) {
            C66357c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C66106g gVar = this.f148851a;
            gVar.mo105138a(cVar2, gVar.mo105152h());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$ao */
    static final class C66125ao extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66106g f148858a;

        /* renamed from: b */
        final /* synthetic */ View f148859b;

        static {
            Covode.recordClassIndex(77633);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66125ao(C66106g gVar, View view) {
            super(1);
            this.f148858a = gVar;
            this.f148859b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20582b(this.f148858a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.qna.fragment.C66106g.C66125ao.C661261 */

                /* renamed from: a */
                final /* synthetic */ C66125ao f148860a;

                static {
                    Covode.recordClassIndex(77634);
                }

                {
                    this.f148860a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.f31053e = this.f148860a.f148859b.findViewById(R.id.dnh);
                    qVar2.mo20632a(C89204ab.m154669a(C65884a.class));
                    qVar2.f31050b = new C65884a();
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$ae */
    static final class C66112ae extends AbstractC89220m implements AbstractC89172b<List<? extends C66293f>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66106g f148844a;

        static {
            Covode.recordClassIndex(77620);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66112ae(C66106g gVar) {
            super(1);
            this.f148844a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C66293f> list) {
            List<? extends C66293f> list2 = list;
            C89219l.m154721d(list2, "");
            C66334l lVar = this.f148844a.f148835k;
            if (lVar == null) {
                C89219l.m154710a("answersTabAdapter");
            }
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            lVar.mo5018a(arrayList);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$ak */
    static final class C66119ak extends AbstractC89220m implements AbstractC89172b<C66356b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66106g f148852a;

        static {
            Covode.recordClassIndex(77627);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66119ak(C66106g gVar) {
            super(1);
            this.f148852a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C66356b bVar) {
            C66356b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            ArrayList arrayList = new ArrayList();
            if (bVar2.f149226e) {
                if (bVar2.f149223b) {
                    String string = this.f148852a.requireContext().getString(R.string.f2o);
                    C89219l.m154716b(string, "");
                    arrayList.add(new C66105f(string, 0, EnumC66102c.UNTRANSLATE));
                } else {
                    String string2 = this.f148852a.requireContext().getString(R.string.gh6);
                    C89219l.m154716b(string2, "");
                    arrayList.add(new C66105f(string2, 0, EnumC66102c.TRANSLATE));
                }
            }
            String string3 = this.f148852a.requireContext().getString(R.string.f2p);
            C89219l.m154716b(string3, "");
            arrayList.add(new C66105f(string3, 0, EnumC66102c.VIEW_ANSWERS));
            AbstractC66019b.C66020a.m117832a(bVar2.f149222a, this.f148852a.mo105152h());
            QnaAnswersTabViewModel qnaAnswersTabViewModel = this.f148852a.f148834j;
            if (qnaAnswersTabViewModel != null) {
                this.f148852a.mo105140a(arrayList, qnaAnswersTabViewModel, bVar2);
            }
            return C89391z.f203057a;
        }
    }

    @AbstractC90264r
    public final void onVideoEvent(C49672ag agVar) {
        C89219l.m154721d(agVar, "");
        if (agVar.f114315a == 2) {
            Object obj = agVar.f114316b;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            if (AwemeService.m70060b().mo60684b(str) != null) {
                QnaAnswersTabViewModel qnaAnswersTabViewModel = this.f148834j;
                if (qnaAnswersTabViewModel != null) {
                    C89219l.m154721d(str, "");
                    qnaAnswersTabViewModel.f149170a.mo105096a(str);
                }
                String str2 = ((AbstractC66098a) this).f148814f;
                if (str2 != null) {
                    QnaBannerViewModel j = m117916j();
                    Long g = C89361p.m154865g(str2);
                    IAccountUserService g2 = C31575b.m65865g();
                    C89219l.m154716b(g2, "");
                    String lastRecordedSecUid = g2.getLastRecordedSecUid();
                    C89219l.m154716b(lastRecordedSecUid, "");
                    j.mo105256a(g, lastRecordedSecUid);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$al */
    static final class C66120al extends AbstractC89220m implements AbstractC89172b<C66104e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66106g f148853a;

        static {
            Covode.recordClassIndex(77628);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66120al(C66106g gVar) {
            super(1);
            this.f148853a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C66104e eVar) {
            QnaAnswersTabViewModel qnaAnswersTabViewModel;
            C66104e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            AbstractC66019b.C66020a.m117831a(eVar2.f148827a.f149222a, eVar2.f148828b, this.f148853a.mo105152h());
            int i = C66153h.f148878a[eVar2.f148828b.ordinal()];
            int i2 = 0;
            if (i == 1) {
                QnaAnswersTabViewModel qnaAnswersTabViewModel2 = this.f148853a.f148834j;
                if (qnaAnswersTabViewModel2 != null) {
                    String str = eVar2.f148827a.f149222a;
                    C89219l.m154721d(str, "");
                    C66035c cVar = qnaAnswersTabViewModel2.f149170a;
                    C89219l.m154721d(str, "");
                    cVar.f148686e.add(str);
                    cVar.mo105098a(C89086z.INSTANCE, false, null);
                    int size = cVar.f148684c.size();
                    if (size >= 0) {
                        while (true) {
                            if (!C89219l.m154714a((Object) String.valueOf(cVar.f148684c.get(i2).f148585a), (Object) str)) {
                                if (i2 == size) {
                                    break;
                                }
                                i2++;
                            } else {
                                String str2 = cVar.f148684c.get(i2).f148586b;
                                if (str2 != null) {
                                    cVar.f148687f.mo105105a(new C66058l(str, new C66025a(C89070n.m154516a(new C66057k(str2)), SettingServiceImpl.m120782v().mo108872h())), cVar);
                                }
                            }
                        }
                    }
                }
            } else if (i == 2) {
                QnaAnswersTabViewModel qnaAnswersTabViewModel3 = this.f148853a.f148834j;
                if (qnaAnswersTabViewModel3 != null) {
                    String str3 = eVar2.f148827a.f149222a;
                    C89219l.m154721d(str3, "");
                    C66035c cVar2 = qnaAnswersTabViewModel3.f149170a;
                    C89219l.m154721d(str3, "");
                    cVar2.f148685d.remove(str3);
                    cVar2.mo105098a(C89086z.INSTANCE, false, null);
                }
            } else if (i == 3 && (qnaAnswersTabViewModel = this.f148853a.f148834j) != null) {
                qnaAnswersTabViewModel.mo105266a(eVar2.f148827a.f149222a, "click_answer");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$af */
    static final class C66113af extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66106g f148845a;

        static {
            Covode.recordClassIndex(77621);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66113af(C66106g gVar) {
            super(2);
            this.f148845a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, Boolean bool) {
            Boolean bool2 = bool;
            C89219l.m154721d(dVar, "");
            if (bool2 != null) {
                bool2.booleanValue();
                this.f148845a.f148837m = !bool2.booleanValue();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$ap */
    static final class C66127ap extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, C12776a<? extends AbstractC66098a>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66106g f148861a;

        static {
            Covode.recordClassIndex(77635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66127ap(C66106g gVar) {
            super(2);
            this.f148861a = gVar;
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
            if (t instanceof C66106g) {
                this.f148861a.mo105142e();
                EOYServiceImpl.m120048b().mo106962b("qa_others_profile");
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LiveData<C66278b<C66104e>> liveData;
        C1213t<C66278b<C66356b>> tVar;
        LiveData<C66278b<C66357c>> liveData2;
        LiveData<C66278b<C66355a>> liveData3;
        LiveData<C66278b<C66358d>> liveData4;
        LiveData<C66278b<EnumC66276w>> liveData5;
        LiveData<C66278b<List<C66293f>>> liveData6;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("isSelf")) {
            IEOYService b = EOYServiceImpl.m120048b();
            View view2 = this.f148833i;
            if (view2 == null) {
                C89219l.m154710a("answerTabLayout");
            }
            if (!(view2 instanceof ViewGroup)) {
                view2 = null;
            }
            if (b.mo106959a((ViewGroup) view2, "qa_others_profile")) {
                View view3 = this.f148833i;
                if (view3 == null) {
                    C89219l.m154710a("answerTabLayout");
                }
                View findViewById = view3.findViewById(R.id.ka);
                C89219l.m154716b(findViewById, "");
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                C23163i.m43668b(findViewById, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 40.0f, system.getDisplayMetrics()))), null, null, false, 29);
            }
        }
        C12780d.m23005a(this, new C66125ao(this, view));
        View view4 = this.f148833i;
        if (view4 == null) {
            C89219l.m154710a("answerTabLayout");
        }
        ((TuxStatusView) view4.findViewById(R.id.dc1)).mo37867a();
        this.f148834j = (QnaAnswersTabViewModel) new C1175ad(this).mo3983a(QnaAnswersTabViewModel.class);
        View view5 = this.f148833i;
        if (view5 == null) {
            C89219l.m154710a("answerTabLayout");
        }
        C89219l.m154716b(requireContext(), "");
        QnaRecyclerView qnaRecyclerView = (QnaRecyclerView) view5.findViewById(R.id.ka);
        C89219l.m154716b(qnaRecyclerView, "");
        RecyclerView.AbstractC1356f itemAnimator = qnaRecyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f4470l = 0;
        }
        QnaAnswersTabViewModel qnaAnswersTabViewModel = this.f148834j;
        Objects.requireNonNull(qnaAnswersTabViewModel, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qna.vm.QnaViewHolderClickDelegate");
        this.f148835k = new C66334l(qnaAnswersTabViewModel);
        qnaRecyclerView.setLayoutManager(new LinearLayoutManager());
        C66334l lVar = this.f148835k;
        if (lVar == null) {
            C89219l.m154710a("answersTabAdapter");
        }
        qnaRecyclerView.setAdapter(lVar);
        C66334l lVar2 = this.f148835k;
        if (lVar2 == null) {
            C89219l.m154710a("answersTabAdapter");
        }
        qnaRecyclerView.mo4405a(m117902a(qnaRecyclerView, lVar2, new C66111ad(this)));
        QnaAnswersTabViewModel qnaAnswersTabViewModel2 = this.f148834j;
        if (!(qnaAnswersTabViewModel2 == null || (liveData6 = qnaAnswersTabViewModel2.f149171b) == null)) {
            liveData6.observe(getViewLifecycleOwner(), new C66277a(new C66112ae(this)));
        }
        QnaAnswersTabViewModel qnaAnswersTabViewModel3 = this.f148834j;
        if (!(qnaAnswersTabViewModel3 == null || (liveData5 = qnaAnswersTabViewModel3.f149172c) == null)) {
            liveData5.observe(getViewLifecycleOwner(), new C66277a(new C66114ag(this)));
        }
        QnaAnswersTabViewModel qnaAnswersTabViewModel4 = this.f148834j;
        if (!(qnaAnswersTabViewModel4 == null || (liveData4 = qnaAnswersTabViewModel4.f149217i) == null)) {
            liveData4.observe(getViewLifecycleOwner(), new C66277a(new C66116ah(this)));
        }
        QnaAnswersTabViewModel qnaAnswersTabViewModel5 = this.f148834j;
        if (!(qnaAnswersTabViewModel5 == null || (liveData3 = qnaAnswersTabViewModel5.f149218j) == null)) {
            liveData3.observe(getViewLifecycleOwner(), new C66277a(new C66117ai(this)));
        }
        QnaAnswersTabViewModel qnaAnswersTabViewModel6 = this.f148834j;
        if (!(qnaAnswersTabViewModel6 == null || (liveData2 = qnaAnswersTabViewModel6.f149219k) == null)) {
            liveData2.observe(getViewLifecycleOwner(), new C66277a(new C66118aj(this)));
        }
        QnaAnswersTabViewModel qnaAnswersTabViewModel7 = this.f148834j;
        if (!(qnaAnswersTabViewModel7 == null || (tVar = qnaAnswersTabViewModel7.f149173d) == null)) {
            tVar.observe(getViewLifecycleOwner(), new C66277a(new C66119ak(this)));
        }
        QnaAnswersTabViewModel qnaAnswersTabViewModel8 = this.f148834j;
        if (!(qnaAnswersTabViewModel8 == null || (liveData = qnaAnswersTabViewModel8.f149174e) == null)) {
            liveData.observe(getViewLifecycleOwner(), new C66277a(new C66120al(this)));
        }
        AbstractC12818f.C12819a.m23063a(this, m117916j(), C66155j.f148880a, C12856l.m23104c(), new C66121am(this), 4);
        if (!mo105152h()) {
            AbstractC12818f.C12819a.m23063a(this, m117916j(), C66154i.f148879a, (C12854k) null, new C66113af(this), 6);
        }
        AbstractC12818f.C12819a.m23063a(this, (QnaSelectedPageViewModel) this.f148839p.getValue(), C66156k.f148881a, (C12854k) null, new C66127ap(this), 6);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.aqf, viewGroup, false);
        C89219l.m154716b(a, "");
        this.f148833i = a;
        if (a == null) {
            C89219l.m154710a("answerTabLayout");
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
    /* renamed from: a */
    public final <S extends AbstractC12853j, A> void mo20509a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23093a(this, assemViewModel, kVar, kVar2, bVar, mVar);
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
