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
import android.widget.Button;
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
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.core.C12767q;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
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
import com.bytedance.assem.p793a.C12642a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qna.api.C66012i;
import com.p2082ss.android.ugc.aweme.qna.api.QnaApiV2;
import com.p2082ss.android.ugc.aweme.qna.model.C66293f;
import com.p2082ss.android.ugc.aweme.qna.model.C66297i;
import com.p2082ss.android.ugc.aweme.qna.p3643a.C65944h;
import com.p2082ss.android.ugc.aweme.qna.p3645c.AbstractC66019b;
import com.p2082ss.android.ugc.aweme.qna.p3646d.C66025a;
import com.p2082ss.android.ugc.aweme.qna.p3646d.C66045h;
import com.p2082ss.android.ugc.aweme.qna.p3646d.C66057k;
import com.p2082ss.android.ugc.aweme.qna.p3646d.C66058l;
import com.p2082ss.android.ugc.aweme.qna.p3647e.C66062c;
import com.p2082ss.android.ugc.aweme.qna.p3649g.C66277a;
import com.p2082ss.android.ugc.aweme.qna.p3649g.C66278b;
import com.p2082ss.android.ugc.aweme.qna.p3650ui.C66334l;
import com.p2082ss.android.ugc.aweme.qna.p3650ui.C66339o;
import com.p2082ss.android.ugc.aweme.qna.p3650ui.QnaRecyclerView;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66355a;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66356b;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66357c;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66358d;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66360f;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66361g;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66362h;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.EnumC66359e;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaBannerViewModel;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaCreationViewModel;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaQuestionsTabViewModel;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaSelectedPageViewModel;
import com.p2082ss.android.ugc.aweme.question.C66504c;
import com.p2082ss.android.ugc.aweme.service.EOYServiceImpl;
import com.p2082ss.android.ugc.aweme.service.IEOYService;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
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

/* renamed from: com.ss.android.ugc.aweme.qna.fragment.m */
public final class C66158m extends AbstractC66098a implements AbstractC12846h {

    /* renamed from: n */
    public static final C66168ai f148883n = new C66168ai((byte) 0);

    /* renamed from: i */
    public View f148884i;

    /* renamed from: j */
    public C66334l f148885j;

    /* renamed from: k */
    public QnaQuestionsTabViewModel f148886k;

    /* renamed from: l */
    public String f148887l;

    /* renamed from: m */
    public boolean f148888m;

    /* renamed from: o */
    private QnaRecyclerView f148889o;

    /* renamed from: p */
    private final C12814b f148890p;

    /* renamed from: q */
    private final C12814b f148891q;

    /* renamed from: r */
    private final C12642a f148892r;

    /* renamed from: s */
    private SparseArray f148893s;

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$ac */
    public static final class C66162ac extends AbstractC89220m implements AbstractC89172b<C66361g, C66361g> {
        public static final C66162ac INSTANCE = new C66162ac();

        static {
            Covode.recordClassIndex(77670);
        }

        public C66162ac() {
            super(1);
        }

        public final C66361g invoke(C66361g gVar) {
            C89219l.m154719c(gVar, "");
            return gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$h */
    public static final class C66200h extends AbstractC89220m implements AbstractC89172b<C66362h, C66362h> {
        public static final C66200h INSTANCE = new C66200h();

        static {
            Covode.recordClassIndex(77708);
        }

        public C66200h() {
            super(1);
        }

        public final C66362h invoke(C66362h hVar) {
            C89219l.m154719c(hVar, "");
            return hVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$l */
    public static final class C66204l extends AbstractC89220m implements AbstractC89172b<C66360f, C66360f> {
        public static final C66204l INSTANCE = new C66204l();

        static {
            Covode.recordClassIndex(77712);
        }

        public C66204l() {
            super(1);
        }

        public final C66360f invoke(C66360f fVar) {
            C89219l.m154719c(fVar, "");
            return fVar;
        }
    }

    static {
        Covode.recordClassIndex(77666);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f148893s == null) {
            this.f148893s = new SparseArray();
        }
        View view = (View) this.f148893s.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f148893s.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a
    public final void bx_() {
        SparseArray sparseArray = this.f148893s;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a
    /* renamed from: c */
    public final int mo64296c() {
        return R.string.f1o;
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a
    /* renamed from: d */
    public final String mo105141d() {
        return "questions";
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

    /* renamed from: i */
    public final QnaBannerViewModel mo105159i() {
        return (QnaBannerViewModel) this.f148890p.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$ag */
    public static final class C66166ag extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f148898a;

        static {
            Covode.recordClassIndex(77674);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66166ag(AbstractC1204m mVar) {
            super(0);
            this.f148898a = mVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            return this.f148898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$ai */
    public static final class C66168ai {
        static {
            Covode.recordClassIndex(77676);
        }

        private C66168ai() {
        }

        public /* synthetic */ C66168ai(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$b */
    public static final class C66189b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148920a;

        static {
            Covode.recordClassIndex(77697);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66189b(Fragment fragment) {
            super(0);
            this.f148920a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            return this.f148920a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$q */
    public static final class C66209q extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148936a;

        static {
            Covode.recordClassIndex(77717);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66209q(Fragment fragment) {
            super(0);
            this.f148936a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            return this.f148936a;
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

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$ab */
    public static final class C66161ab extends AbstractC89220m implements AbstractC89171a<C12874b<C66360f>> {
        public static final C66161ab INSTANCE = new C66161ab();

        static {
            Covode.recordClassIndex(77669);
        }

        public C66161ab() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66360f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$af */
    public static final class C66165af extends AbstractC89220m implements AbstractC89171a<C12874b<C66361g>> {
        public static final C66165af INSTANCE = new C66165af();

        static {
            Covode.recordClassIndex(77673);
        }

        public C66165af() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66361g> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$ah */
    public static final class C66167ah extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C66167ah INSTANCE = new C66167ah();

        static {
            Covode.recordClassIndex(77675);
        }

        public C66167ah() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$aj */
    static final class C66169aj extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66158m f148899a;

        static {
            Covode.recordClassIndex(77677);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66169aj(C66158m mVar) {
            super(0);
            this.f148899a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f148899a.mo105160j();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$d */
    public static final class C66196d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C66196d INSTANCE = new C66196d();

        static {
            Covode.recordClassIndex(77704);
        }

        public C66196d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$i */
    public static final class C66201i extends AbstractC89220m implements AbstractC89171a<C12874b<C66362h>> {
        public static final C66201i INSTANCE = new C66201i();

        static {
            Covode.recordClassIndex(77709);
        }

        public C66201i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66362h> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$m */
    public static final class C66205m extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C66205m INSTANCE = new C66205m();

        static {
            Covode.recordClassIndex(77713);
        }

        public C66205m() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$p */
    public static final class C66208p extends AbstractC89220m implements AbstractC89171a<C12874b<C66362h>> {
        public static final C66208p INSTANCE = new C66208p();

        static {
            Covode.recordClassIndex(77716);
        }

        public C66208p() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66362h> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$s */
    public static final class C66211s extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C66211s INSTANCE = new C66211s();

        static {
            Covode.recordClassIndex(77719);
        }

        public C66211s() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$v */
    public static final class C66214v extends AbstractC89220m implements AbstractC89171a<C12874b<C66360f>> {
        public static final C66214v INSTANCE = new C66214v();

        static {
            Covode.recordClassIndex(77722);
        }

        public C66214v() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66360f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$y */
    public static final class C66217y extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C66217y INSTANCE = new C66217y();

        static {
            Covode.recordClassIndex(77725);
        }

        public C66217y() {
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
        if (this.f148886k != null) {
            mo105160j();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$ao */
    static final class C66174ao extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, User, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66158m f148904a;

        static {
            Covode.recordClassIndex(77682);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66174ao(C66158m mVar) {
            super(2);
            this.f148904a = mVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$ao$a */
        static final class C66175a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C66174ao f148905a;

            static {
                Covode.recordClassIndex(77683);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C66175a(C66174ao aoVar) {
                super(0);
                this.f148905a = aoVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f148905a.f148904a.mo105160j();
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
                this.f148904a.f148887l = C80580in.m139677a(user2, false);
                QnaQuestionsTabViewModel qnaQuestionsTabViewModel = this.f148904a.f148886k;
                if (!(qnaQuestionsTabViewModel == null || (liveData = qnaQuestionsTabViewModel.f149195c) == null || (value = liveData.getValue()) == null || (t = value.f149006b) == null)) {
                    C66158m mVar = this.f148904a;
                    mVar.mo105137a(t, mVar.mo105157g(), EnumC66275v.Questions, this.f148904a.mo105158h(), this.f148904a.f148887l, new C66175a(this), this.f148904a.f148888m);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$au */
    static final class C66181au extends AbstractC89220m implements AbstractC89172b<EnumC66276w, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66158m f148911a;

        static {
            Covode.recordClassIndex(77689);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66181au(C66158m mVar) {
            super(1);
            this.f148911a = mVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$au$a */
        static final class C66182a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C66181au f148912a;

            /* renamed from: b */
            final /* synthetic */ EnumC66276w f148913b;

            static {
                Covode.recordClassIndex(77690);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C66182a(C66181au auVar, EnumC66276w wVar) {
                super(0);
                this.f148912a = auVar;
                this.f148913b = wVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f148912a.f148911a.mo105160j();
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC66276w wVar) {
            EnumC66276w wVar2 = wVar;
            C89219l.m154721d(wVar2, "");
            if (this.f148911a.f148887l != null) {
                C66158m mVar = this.f148911a;
                mVar.mo105137a(wVar2, mVar.mo105157g(), EnumC66275v.Questions, this.f148911a.mo105158h(), this.f148911a.f148887l, new C66182a(this, wVar2), this.f148911a.f148888m);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$c */
    public static final class C66195c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148928a;

        static {
            Covode.recordClassIndex(77703);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66195c(Fragment fragment) {
            super(0);
            this.f148928a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f148928a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$j */
    public static final class C66202j extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148932a;

        static {
            Covode.recordClassIndex(77710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66202j(Fragment fragment) {
            super(0);
            this.f148932a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f148932a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$r */
    public static final class C66210r extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148937a;

        static {
            Covode.recordClassIndex(77718);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66210r(Fragment fragment) {
            super(0);
            this.f148937a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f148937a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$w */
    public static final class C66215w extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148940a;

        static {
            Covode.recordClassIndex(77723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66215w(Fragment fragment) {
            super(0);
            this.f148940a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f148940a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    /* renamed from: g */
    public final View mo105157g() {
        View view = this.f148884i;
        if (view == null) {
            C89219l.m154710a("questionsTabLayout");
        }
        return view;
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$a */
    public static final class C66159a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f148894a;

        static {
            Covode.recordClassIndex(77667);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66159a(AbstractC89277c cVar) {
            super(0);
            this.f148894a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f148894a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$aa */
    public static final class C66160aa extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148895a;

        static {
            Covode.recordClassIndex(77668);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66160aa(Fragment fragment) {
            super(0);
            this.f148895a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f148895a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f148895a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$ad */
    public static final class C66163ad extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148896a;

        static {
            Covode.recordClassIndex(77671);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66163ad(Fragment fragment) {
            super(0);
            this.f148896a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148896a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$ae */
    public static final class C66164ae extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148897a;

        static {
            Covode.recordClassIndex(77672);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66164ae(Fragment fragment) {
            super(0);
            this.f148897a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148897a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$e */
    public static final class C66197e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148929a;

        static {
            Covode.recordClassIndex(77705);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66197e(Fragment fragment) {
            super(0);
            this.f148929a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f148929a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f148929a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$f */
    public static final class C66198f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148930a;

        static {
            Covode.recordClassIndex(77706);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66198f(Fragment fragment) {
            super(0);
            this.f148930a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f148930a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f148930a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$g */
    public static final class C66199g extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f148931a;

        static {
            Covode.recordClassIndex(77707);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66199g(AbstractC89277c cVar) {
            super(0);
            this.f148931a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f148931a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$k */
    public static final class C66203k extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148933a;

        static {
            Covode.recordClassIndex(77711);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66203k(Fragment fragment) {
            super(0);
            this.f148933a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f148933a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$n */
    public static final class C66206n extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148934a;

        static {
            Covode.recordClassIndex(77714);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66206n(Fragment fragment) {
            super(0);
            this.f148934a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f148934a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f148934a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$o */
    public static final class C66207o extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148935a;

        static {
            Covode.recordClassIndex(77715);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66207o(Fragment fragment) {
            super(0);
            this.f148935a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f148935a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f148935a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$t */
    public static final class C66212t extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148938a;

        static {
            Covode.recordClassIndex(77720);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66212t(Fragment fragment) {
            super(0);
            this.f148938a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f148938a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f148938a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$u */
    public static final class C66213u extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148939a;

        static {
            Covode.recordClassIndex(77721);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66213u(Fragment fragment) {
            super(0);
            this.f148939a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f148939a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f148939a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$x */
    public static final class C66216x extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148941a;

        static {
            Covode.recordClassIndex(77724);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66216x(Fragment fragment) {
            super(0);
            this.f148941a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f148941a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$z */
    public static final class C66218z extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148942a;

        static {
            Covode.recordClassIndex(77726);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66218z(Fragment fragment) {
            super(0);
            this.f148942a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f148942a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f148942a.getActivity());
        }
    }

    /* renamed from: h */
    public final boolean mo105158h() {
        String str = ((AbstractC66098a) this).f148814f;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        return TextUtils.equals(str, g.getCurUserId());
    }

    /* renamed from: j */
    public final void mo105160j() {
        String lastRecordedSecUid;
        String str = ((AbstractC66098a) this).f148814f;
        if (str != null) {
            IAccountUserService g = C31575b.m65865g();
            if (mo105158h()) {
                C89219l.m154716b(g, "");
                str = g.getCurUserId();
            }
            boolean h = mo105158h();
            C89219l.m154716b(g, "");
            if (h) {
                lastRecordedSecUid = g.getCurSecUserId();
            } else {
                lastRecordedSecUid = g.getLastRecordedSecUid();
            }
            QnaQuestionsTabViewModel qnaQuestionsTabViewModel = this.f148886k;
            if (qnaQuestionsTabViewModel != null) {
                C89219l.m154716b(str, "");
                C89219l.m154716b(lastRecordedSecUid, "");
                qnaQuestionsTabViewModel.mo105257a(str, lastRecordedSecUid, this.f148887l, this.f148888m, mo105158h());
            }
        }
    }

    /* renamed from: k */
    public final void mo105161k() {
        String lastRecordedSecUid;
        String str = ((AbstractC66098a) this).f148814f;
        if (str != null) {
            IAccountUserService g = C31575b.m65865g();
            if (mo105158h()) {
                C89219l.m154716b(g, "");
                str = g.getCurUserId();
            }
            boolean h = mo105158h();
            C89219l.m154716b(g, "");
            if (h) {
                lastRecordedSecUid = g.getCurSecUserId();
            } else {
                lastRecordedSecUid = g.getLastRecordedSecUid();
            }
            QnaQuestionsTabViewModel qnaQuestionsTabViewModel = this.f148886k;
            if (qnaQuestionsTabViewModel != null) {
                C89219l.m154716b(str, "");
                C89219l.m154716b(lastRecordedSecUid, "");
                String str2 = this.f148887l;
                boolean z = this.f148888m;
                boolean h2 = mo105158h();
                C89219l.m154721d(str, "");
                C89219l.m154721d(lastRecordedSecUid, "");
                C66045h hVar = qnaQuestionsTabViewModel.f149193a;
                C89219l.m154721d(str, "");
                C89219l.m154721d(lastRecordedSecUid, "");
                hVar.f148719n.mo142945a(QnaApiV2.C66002a.m117822a().getQuestionsTabData(C89361p.m154865g(str), hVar.f148717l, 0, lastRecordedSecUid).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C66045h.C66048c(hVar, z, str2, h2), new C66045h.C66049d(hVar, z, str2, h2)));
            }
        }
    }

    public C66158m() {
        C12814b bVar;
        C12814b bVar2;
        AbstractC12848i.C12849a aVar = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a = C89204ab.m154669a(QnaBannerViewModel.class);
        C66159a aVar2 = new C66159a(a);
        C66204l lVar = C66204l.INSTANCE;
        if (C89219l.m154714a(aVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar2, C66214v.INSTANCE, new C66215w(this), new C66216x(this), C66217y.INSTANCE, lVar, new C66218z(this), new C66160aa(this));
        } else if (aVar == null || C89219l.m154714a(aVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar2, C66161ab.INSTANCE, new C66189b(this), new C66195c(this), C66196d.INSTANCE, lVar, new C66197e(this), new C66198f(this));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f148890p = bVar;
        AbstractC12848i.C12849a aVar3 = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a2 = C89204ab.m154669a(QnaSelectedPageViewModel.class);
        C66199g gVar = new C66199g(a2);
        C66200h hVar = C66200h.INSTANCE;
        if (C89219l.m154714a(aVar3, AbstractC12848i.C12849a.f31275a)) {
            bVar2 = new C12814b(a2, gVar, C66201i.INSTANCE, new C66202j(this), new C66203k(this), C66205m.INSTANCE, hVar, new C66206n(this), new C66207o(this));
        } else if (aVar3 == null || C89219l.m154714a(aVar3, AbstractC12848i.C12852d.f31278a)) {
            bVar2 = new C12814b(a2, gVar, C66208p.INSTANCE, new C66209q(this), new C66210r(this), C66211s.INSTANCE, hVar, new C66212t(this), new C66213u(this));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f148891q = bVar2;
        this.f148892r = new C12642a(C89204ab.m154669a(QnaCreationViewModel.class), null, C66165af.INSTANCE, new C66166ag(this), C66167ah.INSTANCE, C66162ac.INSTANCE, new C66163ad(this), new C66164ae(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$ay */
    static final class C66186ay extends AbstractC89220m implements AbstractC89172b<BaseFragmentViewModel, C89391z> {

        /* renamed from: a */
        public static final C66186ay f148917a = new C66186ay();

        static {
            Covode.recordClassIndex(77694);
        }

        C66186ay() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            C89219l.m154721d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(C661871.f148918a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$az */
    static final class View$OnClickListenerC66188az implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66158m f148919a;

        static {
            Covode.recordClassIndex(77696);
        }

        View$OnClickListenerC66188az(C66158m mVar) {
            this.f148919a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f148919a.mo105161k();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo27716a(C66186ay.f148917a);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$ap */
    static final class C66176ap extends AbstractC89220m implements AbstractC89172b<Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66158m f148906a;

        static {
            Covode.recordClassIndex(77684);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66176ap(C66158m mVar) {
            super(1);
            this.f148906a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Long l) {
            this.f148906a.mo105159i().mo20662a(new QnaBannerViewModel.C66348e(l.longValue()));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$aq */
    static final class C66177aq extends AbstractC89220m implements AbstractC89172b<C66297i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66158m f148907a;

        static {
            Covode.recordClassIndex(77685);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66177aq(C66158m mVar) {
            super(1);
            this.f148907a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C66297i iVar) {
            C66297i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            C66158m mVar = this.f148907a;
            String str = iVar2.f149067a;
            C66334l lVar = mVar.f148885j;
            if (lVar == null) {
                C89219l.m154710a("questionsTabAdapter");
            }
            lVar.mo105252a(str);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$av */
    static final class C66183av extends AbstractC89220m implements AbstractC89172b<C66358d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66158m f148914a;

        static {
            Covode.recordClassIndex(77691);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66183av(C66158m mVar) {
            super(1);
            this.f148914a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C66358d dVar) {
            C66358d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            String str = dVar2.f149229a;
            String str2 = dVar2.f149230b;
            Context requireContext = this.f148914a.requireContext();
            C89219l.m154716b(requireContext, "");
            C66158m.m117904a(str, str2, requireContext, this.f148914a.mo105158h());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$aw */
    static final class C66184aw extends AbstractC89220m implements AbstractC89172b<C66355a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66158m f148915a;

        static {
            Covode.recordClassIndex(77692);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66184aw(C66158m mVar) {
            super(1);
            this.f148915a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C66355a aVar) {
            C66355a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            this.f148915a.mo105139a(aVar2.f149220a, aVar2.f149221b, this.f148915a.mo105158h());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$ax */
    static final class C66185ax extends AbstractC89220m implements AbstractC89172b<C66357c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66158m f148916a;

        static {
            Covode.recordClassIndex(77693);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66185ax(C66158m mVar) {
            super(1);
            this.f148916a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C66357c cVar) {
            C66357c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C66158m mVar = this.f148916a;
            mVar.mo105138a(cVar2, mVar.mo105158h());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$ba */
    static final class C66190ba extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66158m f148921a;

        /* renamed from: b */
        final /* synthetic */ View f148922b;

        static {
            Covode.recordClassIndex(77698);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66190ba(C66158m mVar, View view) {
            super(1);
            this.f148921a = mVar;
            this.f148922b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20582b(this.f148921a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.qna.fragment.C66158m.C66190ba.C661911 */

                /* renamed from: a */
                final /* synthetic */ C66190ba f148923a;

                static {
                    Covode.recordClassIndex(77699);
                }

                {
                    this.f148923a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.f31053e = this.f148923a.f148922b.findViewById(R.id.dnh);
                    qVar2.mo20632a(C89204ab.m154669a(C65944h.class));
                    qVar2.f31050b = new C65944h();
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$al */
    static final class C66171al extends AbstractC89220m implements AbstractC89172b<EnumC66276w, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66158m f148901a;

        static {
            Covode.recordClassIndex(77679);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66171al(C66158m mVar) {
            super(1);
            this.f148901a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC66276w wVar) {
            C89219l.m154721d(wVar, "");
            String str = ((AbstractC66098a) this.f148901a).f148814f;
            if (str != null) {
                QnaBannerViewModel i = this.f148901a.mo105159i();
                Long g = C89361p.m154865g(str);
                IAccountUserService g2 = C31575b.m65865g();
                C89219l.m154716b(g2, "");
                String lastRecordedSecUid = g2.getLastRecordedSecUid();
                C89219l.m154716b(lastRecordedSecUid, "");
                i.mo105256a(g, lastRecordedSecUid);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$at */
    static final class C66180at extends AbstractC89220m implements AbstractC89172b<List<? extends C66293f>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66158m f148910a;

        static {
            Covode.recordClassIndex(77688);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66180at(C66158m mVar) {
            super(1);
            this.f148910a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C66293f> list) {
            List<? extends C66293f> list2 = list;
            C89219l.m154721d(list2, "");
            C66334l lVar = this.f148910a.f148885j;
            if (lVar == null) {
                C89219l.m154710a("questionsTabAdapter");
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

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$bb */
    static final class C66192bb extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66158m f148924a;

        /* renamed from: b */
        final /* synthetic */ C66356b f148925b;

        static {
            Covode.recordClassIndex(77700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66192bb(C66158m mVar, C66356b bVar) {
            super(1);
            this.f148924a = mVar;
            this.f148925b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String string = this.f148924a.requireContext().getString(R.string.b4w);
            C89219l.m154716b(string, "");
            bVar2.mo37421c(string, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.qna.fragment.C66158m.C66192bb.C661931 */

                /* renamed from: a */
                final /* synthetic */ C66192bb f148926a;

                static {
                    Covode.recordClassIndex(77701);
                }

                {
                    this.f148926a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    T t;
                    MethodCollector.m26663i(12666);
                    C89219l.m154721d(aVar, "");
                    String str = this.f148926a.f148925b.f149222a;
                    C89219l.m154721d(str, "");
                    C39162r.m79460a("delete_question", new C33744d().mo59983a("enter_from", "qa_personal_profile").mo59983a("question_id", str).f79943a);
                    QnaQuestionsTabViewModel qnaQuestionsTabViewModel = this.f148926a.f148924a.f148886k;
                    if (qnaQuestionsTabViewModel != null) {
                        String str2 = this.f148926a.f148925b.f149222a;
                        this.f148926a.f148924a.mo105158h();
                        C89219l.m154721d(str2, "");
                        C66045h hVar = qnaQuestionsTabViewModel.f149193a;
                        C89219l.m154721d(str2, "");
                        synchronized (hVar.f148720o) {
                            try {
                                List<C66504c> list = hVar.f148713h;
                                ArrayList arrayList = new ArrayList();
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    String str3 = null;
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    T next = it.next();
                                    Long id = next.getId();
                                    if (id != null) {
                                        str3 = String.valueOf(id.longValue());
                                    }
                                    if (!C89219l.m154714a((Object) str3, (Object) str2)) {
                                        arrayList.add(next);
                                    }
                                }
                                hVar.f148713h = C89070n.m154585g((Collection) arrayList);
                            } catch (Throwable th) {
                                MethodCollector.m26664o(12666);
                                throw th;
                            }
                        }
                        C66045h.m117862a(hVar, C89086z.INSTANCE, null, false, false, 6);
                        C66278b<Long> value = hVar.f148711f.getValue();
                        if (!(value == null || (t = value.f149006b) == null)) {
                            hVar.f148711f.postValue(new C66278b<>(Long.valueOf(t.longValue() - 1)));
                        }
                        hVar.f148708c.setValue(new C66278b<>(C66339o.m117989a((C66012i) null, hVar.f148713h)));
                        hVar.f148719n.mo142945a(QnaApiV2.C66002a.m117822a().deleteQuestion(Long.parseLong(str2)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C66045h.C66046a(hVar), C66045h.C66047b.f148726a));
                    }
                    C89391z zVar = C89391z.f203057a;
                    MethodCollector.m26664o(12666);
                    return zVar;
                }
            });
            String string2 = this.f148924a.requireContext().getString(R.string.a8y);
            C89219l.m154716b(string2, "");
            bVar2.mo37419b(string2, C661942.f148927a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$am */
    static final class C66172am extends AbstractC89220m implements AbstractC89172b<C66356b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66158m f148902a;

        static {
            Covode.recordClassIndex(77680);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66172am(C66158m mVar) {
            super(1);
            this.f148902a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C66356b bVar) {
            C66356b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            AbstractC66019b.C66020a.m117832a(bVar2.f149222a, this.f148902a.mo105158h());
            ArrayList arrayList = new ArrayList();
            if (!this.f148902a.mo105158h() && !bVar2.f149223b) {
                String string = this.f148902a.requireContext().getString(R.string.gh6);
                C89219l.m154716b(string, "");
                arrayList.add(new C66105f(string, 0, EnumC66102c.TRANSLATE));
                String string2 = this.f148902a.requireContext().getString(R.string.f2p);
                C89219l.m154716b(string2, "");
                arrayList.add(new C66105f(string2, 0, EnumC66102c.VIEW_ANSWERS));
            } else if (!this.f148902a.mo105158h()) {
                String string3 = this.f148902a.requireContext().getString(R.string.f2o);
                C89219l.m154716b(string3, "");
                arrayList.add(new C66105f(string3, 0, EnumC66102c.UNTRANSLATE));
                String string4 = this.f148902a.requireContext().getString(R.string.f2p);
                C89219l.m154716b(string4, "");
                arrayList.add(new C66105f(string4, 0, EnumC66102c.VIEW_ANSWERS));
            } else {
                String string5 = this.f148902a.requireContext().getString(R.string.f2p);
                C89219l.m154716b(string5, "");
                arrayList.add(new C66105f(string5, 0, EnumC66102c.VIEW_ANSWERS));
                String string6 = this.f148902a.requireContext().getString(R.string.b4w);
                C89219l.m154716b(string6, "");
                arrayList.add(new C66105f(string6, 1, EnumC66102c.DELETE));
            }
            QnaQuestionsTabViewModel qnaQuestionsTabViewModel = this.f148902a.f148886k;
            if (qnaQuestionsTabViewModel != null) {
                this.f148902a.mo105140a(arrayList, qnaQuestionsTabViewModel, bVar2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$an */
    static final class C66173an extends AbstractC89220m implements AbstractC89172b<C66104e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66158m f148903a;

        static {
            Covode.recordClassIndex(77681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66173an(C66158m mVar) {
            super(1);
            this.f148903a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C66104e eVar) {
            int i;
            MethodCollector.m26663i(12677);
            C66104e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            AbstractC66019b.C66020a.m117831a(eVar2.f148827a.f149222a, eVar2.f148828b, this.f148903a.mo105158h());
            int i2 = C66219n.f148943a[eVar2.f148828b.ordinal()];
            if (i2 == 1) {
                QnaQuestionsTabViewModel qnaQuestionsTabViewModel = this.f148903a.f148886k;
                if (qnaQuestionsTabViewModel != null) {
                    String str = eVar2.f148827a.f149222a;
                    this.f148903a.mo105158h();
                    C89219l.m154721d(str, "");
                    C66045h hVar = qnaQuestionsTabViewModel.f149193a;
                    C89219l.m154721d(str, "");
                    synchronized (hVar.f148720o) {
                        try {
                            hVar.f148715j.add(str);
                        } catch (Throwable th) {
                            MethodCollector.m26664o(12677);
                            throw th;
                        }
                    }
                    C66045h.m117862a(hVar, C89086z.INSTANCE, null, false, false, 22);
                    String str2 = null;
                    int i3 = 0;
                    int size = hVar.f148713h.size();
                    if (size >= 0) {
                        while (true) {
                            if (!C89219l.m154714a((Object) String.valueOf(hVar.f148713h.get(i3).getId()), (Object) str)) {
                                if (i3 == size) {
                                    break;
                                }
                                i3++;
                            } else {
                                str2 = hVar.f148713h.get(i3).getContent();
                                break;
                            }
                        }
                    }
                    if (str2 != null) {
                        hVar.f148716k.mo105105a(new C66058l(str, new C66025a(C89070n.m154516a(new C66057k(str2)), SettingServiceImpl.m120782v().mo108872h())), hVar);
                    }
                }
            } else if (i2 == 2) {
                QnaQuestionsTabViewModel qnaQuestionsTabViewModel2 = this.f148903a.f148886k;
                if (qnaQuestionsTabViewModel2 != null) {
                    String str3 = eVar2.f148827a.f149222a;
                    this.f148903a.mo105158h();
                    C89219l.m154721d(str3, "");
                    C66045h hVar2 = qnaQuestionsTabViewModel2.f149193a;
                    C89219l.m154721d(str3, "");
                    hVar2.f148714i.remove(str3);
                    C66045h.m117862a(hVar2, C89086z.INSTANCE, null, false, false, 22);
                }
            } else if (i2 == 3) {
                QnaQuestionsTabViewModel qnaQuestionsTabViewModel3 = this.f148903a.f148886k;
                if (qnaQuestionsTabViewModel3 != null) {
                    qnaQuestionsTabViewModel3.mo105266a(eVar2.f148827a.f149222a, "click_question");
                }
            } else if (i2 == 4) {
                C66158m mVar = this.f148903a;
                C66356b bVar = eVar2.f148827a;
                if (C89219l.m154714a((Object) bVar.f149225d, (Object) "textual")) {
                    i = R.string.f32;
                } else {
                    i = R.string.f2w;
                }
                Context requireContext = mVar.requireContext();
                C89219l.m154716b(requireContext, "");
                ((C23023b) C23028c.m43435a(((C23023b) new C23023b(requireContext).mo37479a(R.string.cv)).mo37413d(mVar.requireContext().getString(i)), new C66192bb(mVar, bVar)).mo37482a(true)).mo37405a().mo37396b().show();
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(12677);
            return zVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$ak */
    static final class C66170ak extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, EnumC66359e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66158m f148900a;

        static {
            Covode.recordClassIndex(77678);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66170ak(C66158m mVar) {
            super(2);
            this.f148900a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, EnumC66359e eVar) {
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(eVar, "");
            if (eVar == EnumC66359e.PUBLISH_SUCCEED && ((AbstractC66098a) this.f148900a).f148813e) {
                this.f148900a.mo105161k();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$ar */
    static final class C66178ar extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66158m f148908a;

        static {
            Covode.recordClassIndex(77686);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66178ar(C66158m mVar) {
            super(2);
            this.f148908a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, Boolean bool) {
            Boolean bool2 = bool;
            C89219l.m154721d(dVar, "");
            if (bool2 != null) {
                bool2.booleanValue();
                this.f148908a.f148888m = !bool2.booleanValue();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.m$as */
    static final class C66179as extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, C12776a<? extends AbstractC66098a>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66158m f148909a;

        static {
            Covode.recordClassIndex(77687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66179as(C66158m mVar) {
            super(2);
            this.f148909a = mVar;
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
            if (t instanceof C66158m) {
                this.f148909a.mo105142e();
                EOYServiceImpl.m120048b().mo106962b("qa_others_profile");
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LiveData<C66278b<EnumC66276w>> liveData;
        LiveData<C66278b<C66297i>> liveData2;
        LiveData<C66278b<Long>> liveData3;
        LiveData<C66278b<C66104e>> liveData4;
        C1213t<C66278b<C66356b>> tVar;
        LiveData<C66278b<C66357c>> liveData5;
        LiveData<C66278b<C66355a>> liveData6;
        LiveData<C66278b<C66358d>> liveData7;
        LiveData<C66278b<EnumC66276w>> liveData8;
        LiveData<C66278b<List<C66293f>>> liveData9;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("isSelf")) {
            IEOYService b = EOYServiceImpl.m120048b();
            View view2 = this.f148884i;
            if (view2 == null) {
                C89219l.m154710a("questionsTabLayout");
            }
            if (!(view2 instanceof ViewGroup)) {
                view2 = null;
            }
            if (b.mo106959a((ViewGroup) view2, "qa_others_profile")) {
                View view3 = this.f148884i;
                if (view3 == null) {
                    C89219l.m154710a("questionsTabLayout");
                }
                View findViewById = view3.findViewById(R.id.ddi);
                C89219l.m154716b(findViewById, "");
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                C23163i.m43668b(findViewById, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 40.0f, system.getDisplayMetrics()))), null, null, false, 29);
            }
        }
        C12780d.m23005a(this, new C66190ba(this, view));
        View view4 = this.f148884i;
        if (view4 == null) {
            C89219l.m154710a("questionsTabLayout");
        }
        ((TuxStatusView) view4.findViewById(R.id.dc1)).mo37867a();
        this.f148886k = (QnaQuestionsTabViewModel) new C1175ad(this).mo3983a(QnaQuestionsTabViewModel.class);
        View view5 = this.f148884i;
        if (view5 == null) {
            C89219l.m154710a("questionsTabLayout");
        }
        C89219l.m154716b(requireContext(), "");
        View findViewById2 = view5.findViewById(R.id.ddi);
        C89219l.m154716b(findViewById2, "");
        QnaRecyclerView qnaRecyclerView = (QnaRecyclerView) findViewById2;
        this.f148889o = qnaRecyclerView;
        if (qnaRecyclerView == null) {
            C89219l.m154710a("rv");
        }
        RecyclerView.AbstractC1356f itemAnimator = qnaRecyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f4470l = 0;
        }
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel = this.f148886k;
        Objects.requireNonNull(qnaQuestionsTabViewModel, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qna.vm.QnaViewHolderClickDelegate");
        this.f148885j = new C66334l(qnaQuestionsTabViewModel);
        QnaRecyclerView qnaRecyclerView2 = this.f148889o;
        if (qnaRecyclerView2 == null) {
            C89219l.m154710a("rv");
        }
        qnaRecyclerView2.setLayoutManager(new LinearLayoutManager());
        QnaRecyclerView qnaRecyclerView3 = this.f148889o;
        if (qnaRecyclerView3 == null) {
            C89219l.m154710a("rv");
        }
        C66334l lVar = this.f148885j;
        if (lVar == null) {
            C89219l.m154710a("questionsTabAdapter");
        }
        qnaRecyclerView3.setAdapter(lVar);
        QnaRecyclerView qnaRecyclerView4 = this.f148889o;
        if (qnaRecyclerView4 == null) {
            C89219l.m154710a("rv");
        }
        QnaRecyclerView qnaRecyclerView5 = this.f148889o;
        if (qnaRecyclerView5 == null) {
            C89219l.m154710a("rv");
        }
        C66334l lVar2 = this.f148885j;
        if (lVar2 == null) {
            C89219l.m154710a("questionsTabAdapter");
        }
        qnaRecyclerView4.mo4405a(m117902a(qnaRecyclerView5, lVar2, new C66169aj(this)));
        AbstractC12818f.C12819a.m23063a(this, mo105159i(), C66221p.f148945a, (C12854k) null, new C66178ar(this), 6);
        AbstractC12818f.C12819a.m23063a(this, (QnaSelectedPageViewModel) this.f148891q.getValue(), C66223r.f148947a, (C12854k) null, new C66179as(this), 6);
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel2 = this.f148886k;
        if (!(qnaQuestionsTabViewModel2 == null || (liveData9 = qnaQuestionsTabViewModel2.f149194b) == null)) {
            liveData9.observe(getViewLifecycleOwner(), new C66277a(new C66180at(this)));
        }
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel3 = this.f148886k;
        if (!(qnaQuestionsTabViewModel3 == null || (liveData8 = qnaQuestionsTabViewModel3.f149195c) == null)) {
            liveData8.observe(getViewLifecycleOwner(), new C66277a(new C66181au(this)));
        }
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel4 = this.f148886k;
        if (!(qnaQuestionsTabViewModel4 == null || (liveData7 = qnaQuestionsTabViewModel4.f149217i) == null)) {
            liveData7.observe(getViewLifecycleOwner(), new C66277a(new C66183av(this)));
        }
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel5 = this.f148886k;
        if (!(qnaQuestionsTabViewModel5 == null || (liveData6 = qnaQuestionsTabViewModel5.f149218j) == null)) {
            liveData6.observe(getViewLifecycleOwner(), new C66277a(new C66184aw(this)));
        }
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel6 = this.f148886k;
        if (!(qnaQuestionsTabViewModel6 == null || (liveData5 = qnaQuestionsTabViewModel6.f149219k) == null)) {
            liveData5.observe(getViewLifecycleOwner(), new C66277a(new C66185ax(this)));
        }
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel7 = this.f148886k;
        if (!(qnaQuestionsTabViewModel7 == null || (tVar = qnaQuestionsTabViewModel7.f149199g) == null)) {
            tVar.observe(getViewLifecycleOwner(), new C66277a(new C66172am(this)));
        }
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel8 = this.f148886k;
        if (!(qnaQuestionsTabViewModel8 == null || (liveData4 = qnaQuestionsTabViewModel8.f149200h) == null)) {
            liveData4.observe(getViewLifecycleOwner(), new C66277a(new C66173an(this)));
        }
        AbstractC12818f.C12819a.m23063a(this, mo105159i(), C66222q.f148946a, C12856l.m23104c(), new C66174ao(this), 4);
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel9 = this.f148886k;
        if (!(qnaQuestionsTabViewModel9 == null || (liveData3 = qnaQuestionsTabViewModel9.f149197e) == null)) {
            liveData3.observe(getViewLifecycleOwner(), new C66277a(new C66176ap(this)));
        }
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel10 = this.f148886k;
        if (!(qnaQuestionsTabViewModel10 == null || (liveData2 = qnaQuestionsTabViewModel10.f149198f) == null)) {
            liveData2.observe(getViewLifecycleOwner(), new C66277a(new C66177aq(this)));
        }
        AbstractC12818f.C12819a.m23063a(this, (QnaCreationViewModel) this.f148892r.getValue(), C66220o.f148944a, (C12854k) null, new C66170ak(this), 6);
        QnaQuestionsTabViewModel qnaQuestionsTabViewModel11 = this.f148886k;
        if (!(qnaQuestionsTabViewModel11 == null || (liveData = qnaQuestionsTabViewModel11.f149196d) == null)) {
            liveData.observe(getViewLifecycleOwner(), new C66277a(new C66171al(this)));
        }
        if (C66062c.m117873a()) {
            View view6 = this.f148884i;
            if (view6 == null) {
                C89219l.m154710a("questionsTabLayout");
            }
            Button button = (Button) view6.findViewById(R.id.b1b);
            if (button != null) {
                button.setVisibility(0);
                button.setOnClickListener(new View$OnClickListenerC66188az(this));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.aqg, viewGroup, false);
        C89219l.m154716b(a, "");
        this.f148884i = a;
        if (a == null) {
            C89219l.m154710a("questionsTabLayout");
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
