package com.p2082ss.android.ugc.aweme.question;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20380ar;
import com.bytedance.jedi.arch.AbstractC20468h;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.keva.Keva;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.refresh.TuxRefreshLayout;
import com.bytedance.tux.widget.spring.EnumC23429g;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34569a;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.AbstractC35600b;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.services.CommentService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p2082ss.android.ugc.aweme.detail.AbstractC41135h;
import com.p2082ss.android.ugc.aweme.detail.AbstractC41245k;
import com.p2082ss.android.ugc.aweme.detail.C41247m;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.p4205v.p4206a.C80638a;
import com.p2082ss.android.ugc.aweme.p4205v.p4206a.C80639b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.EnumC65848e;
import com.p2082ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.p2082ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.p2082ss.android.ugc.aweme.qna.model.C66289b;
import com.p2082ss.android.ugc.aweme.qna.services.QnaService;
import com.p2082ss.android.ugc.aweme.question.api.C66500a;
import com.p2082ss.android.ugc.aweme.question.model.QuestionDetailParam;
import com.p2082ss.android.ugc.aweme.question.p3661c.C66512c;
import com.p2082ss.android.ugc.aweme.question.viewmodel.QuestionDetailJediViewModel;
import com.p2082ss.android.ugc.aweme.question.viewmodel.QuestionDetailState;
import com.p2082ss.android.ugc.aweme.question.viewmodel.QuestionDetailViewModel;
import com.p2082ss.android.ugc.aweme.question.widget.C66579a;
import com.p2082ss.android.ugc.aweme.question.widget.MonitorSizeChangedLinearLayout;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.ShareService;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69692g;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
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

/* renamed from: com.ss.android.ugc.aweme.question.i */
public class C66541i extends AbstractC35600b implements AbstractC20380ar<C34499i>, AbstractC20527q, C66579a.AbstractC66580a, AbstractC90252i, AbstractC90253j {

    /* renamed from: r */
    public static final C66547d f149616r = new C66547d((byte) 0);

    /* renamed from: N */
    private final AbstractC89244h f149617N = C89250i.m154774a(EnumC89331m.NONE, new C66554k(this));

    /* renamed from: O */
    private final AbstractC89244h f149618O = C89250i.m154774a(EnumC89331m.NONE, new C66555l(this));

    /* renamed from: P */
    private final AbstractC89244h f149619P = C89250i.m154774a(EnumC89331m.NONE, new C66556m(this));

    /* renamed from: Q */
    private final AbstractC89244h f149620Q = C89250i.m154774a(EnumC89331m.NONE, new C66559p(this));

    /* renamed from: R */
    private final AbstractC89244h f149621R = C89250i.m154774a(EnumC89331m.NONE, new C66557n(this));

    /* renamed from: S */
    private final AbstractC89244h f149622S = C89250i.m154774a(EnumC89331m.NONE, new C66553j(this));

    /* renamed from: T */
    private C66512c f149623T;

    /* renamed from: U */
    private String f149624U;

    /* renamed from: V */
    private C66500a f149625V;

    /* renamed from: W */
    private boolean f149626W = true;

    /* renamed from: X */
    private boolean f149627X;

    /* renamed from: Y */
    private boolean f149628Y;

    /* renamed from: Z */
    private final lifecycleAwareLazy f149629Z;

    /* renamed from: aa */
    private final AbstractC89244h f149630aa;

    /* renamed from: ab */
    private final AbstractC89244h f149631ab;

    /* renamed from: ac */
    private C80638a f149632ac;

    /* renamed from: ad */
    private C80639b f149633ad;

    /* renamed from: ae */
    private boolean f149634ae;

    /* renamed from: af */
    private AbstractC0974l f149635af;

    /* renamed from: ag */
    private float f149636ag;

    /* renamed from: ah */
    private float f149637ah;

    /* renamed from: ai */
    private int f149638ai;

    /* renamed from: aj */
    private SparseArray f149639aj;

    /* renamed from: d */
    final AbstractC89244h f149640d = RouteArgExtension.INSTANCE.navArg(this);

    /* renamed from: e */
    public C66519e f149641e;

    /* renamed from: j */
    public C66504c f149642j;

    /* renamed from: k */
    public String f149643k;

    /* renamed from: l */
    public int f149644l;

    /* renamed from: m */
    public String f149645m = "";

    /* renamed from: n */
    public String f149646n = "";

    /* renamed from: o */
    public C34499i f149647o = new C34499i();

    /* renamed from: p */
    C66579a f149648p;

    /* renamed from: q */
    final IQAInvitationService f149649q;

    /* renamed from: s */
    private final AbstractC89244h f149650s = C89250i.m154774a(EnumC89331m.NONE, new C66552i(this));

    /* renamed from: t */
    private final AbstractC89244h f149651t = C89250i.m154774a(EnumC89331m.NONE, new C66558o(this));

    /* renamed from: u */
    private final AbstractC89244h f149652u = C89250i.m154774a(EnumC89331m.NONE, new C66561r(this));

    /* renamed from: com.ss.android.ugc.aweme.question.i$b */
    public static final class C66544b extends AbstractC89220m implements AbstractC89183m<QuestionDetailState, Bundle, QuestionDetailState> {
        public static final C66544b INSTANCE = new C66544b();

        static {
            Covode.recordClassIndex(78087);
        }

        public C66544b() {
            super(2);
        }

        public final QuestionDetailState invoke(QuestionDetailState questionDetailState, Bundle bundle) {
            C89219l.m154719c(questionDetailState, "");
            return questionDetailState;
        }
    }

    static {
        Covode.recordClassIndex(78084);
    }

    /* renamed from: t */
    private final View m118292t() {
        return (View) this.f149651t.getValue();
    }

    /* renamed from: u */
    private final View m118293u() {
        return (View) this.f149652u.getValue();
    }

    /* renamed from: v */
    private final MonitorSizeChangedLinearLayout m118294v() {
        return (MonitorSizeChangedLinearLayout) this.f149622S.getValue();
    }

    /* renamed from: w */
    private final QuestionDetailJediViewModel m118295w() {
        return (QuestionDetailJediViewModel) this.f149629Z.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final String mo62627a(int i) {
        return i != 0 ? "" : "qa_detail";
    }

    /* renamed from: b */
    public final View mo105529b(int i) {
        if (this.f149639aj == null) {
            this.f149639aj = new SparseArray();
        }
        View view = (View) this.f149639aj.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f149639aj.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public final QuestionDetailParam mo105530b() {
        return (QuestionDetailParam) this.f149650s.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final RelativeLayout mo105531c() {
        return (RelativeLayout) this.f149617N.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final View mo105532e() {
        return (View) this.f149618O.getValue();
    }

    /* renamed from: g */
    public final SpringLayout mo105533g() {
        return (SpringLayout) this.f149619P.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(34, new RunnableC90250g(C66541i.class, "onAntiCrawlerEvent", C34569a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(26, new RunnableC90250g(C66541i.class, "onEvent", C56257j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: h */
    public final int mo62639h() {
        return R.layout.aqn;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final DmtStatusView mo105534j() {
        return (DmtStatusView) this.f149620Q.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final ImageView mo105535m() {
        return (ImageView) this.f149621R.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$d */
    public static final class C66547d {
        static {
            Covode.recordClassIndex(78090);
        }

        private C66547d() {
        }

        public /* synthetic */ C66547d(byte b) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f149647o;
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

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: l */
    public final AbstractC0974l mo62643l() {
        return this.f149635af;
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$aa */
    static final class C66543aa implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ String f149654a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f149655b;

        static {
            Covode.recordClassIndex(78086);
        }

        C66543aa(String str, AbstractC89171a aVar) {
            this.f149654a = str;
            this.f149655b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            this.f149655b.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$q */
    static final class C66560q extends AbstractC89220m implements AbstractC89171a<HashMap<Integer, View>> {

        /* renamed from: a */
        public static final C66560q f149673a = new C66560q();

        static {
            Covode.recordClassIndex(78103);
        }

        C66560q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<Integer, View> invoke() {
            return new HashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$a */
    public static final class C66542a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f149653a;

        static {
            Covode.recordClassIndex(78085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66542a(AbstractC89277c cVar) {
            super(0);
            this.f149653a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f149653a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$g */
    static final class C66550g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66541i f149663a;

        static {
            Covode.recordClassIndex(78093);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66550g(C66541i iVar) {
            super(0);
            this.f149663a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f149663a.mo105528a(true, true);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$j */
    static final class C66553j extends AbstractC89220m implements AbstractC89171a<MonitorSizeChangedLinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C66541i f149666a;

        static {
            Covode.recordClassIndex(78096);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66553j(C66541i iVar) {
            super(0);
            this.f149666a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MonitorSizeChangedLinearLayout invoke() {
            return this.f149666a.mo105529b(R.id.be4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$k */
    static final class C66554k extends AbstractC89220m implements AbstractC89171a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ C66541i f149667a;

        static {
            Covode.recordClassIndex(78097);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66554k(C66541i iVar) {
            super(0);
            this.f149667a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RelativeLayout invoke() {
            return this.f149667a.mo105529b(R.id.e6t);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$l */
    static final class C66555l extends AbstractC89220m implements AbstractC89171a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ C66541i f149668a;

        static {
            Covode.recordClassIndex(78098);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66555l(C66541i iVar) {
            super(0);
            this.f149668a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FrameLayout invoke() {
            return this.f149668a.mo105529b(R.id.e6q);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$m */
    static final class C66556m extends AbstractC89220m implements AbstractC89171a<TuxRefreshLayout> {

        /* renamed from: a */
        final /* synthetic */ C66541i f149669a;

        static {
            Covode.recordClassIndex(78099);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66556m(C66541i iVar) {
            super(0);
            this.f149669a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxRefreshLayout invoke() {
            return this.f149669a.mo105529b(R.id.c5p);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$n */
    static final class C66557n extends AbstractC89220m implements AbstractC89171a<TuxIconView> {

        /* renamed from: a */
        final /* synthetic */ C66541i f149670a;

        static {
            Covode.recordClassIndex(78100);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66557n(C66541i iVar) {
            super(0);
            this.f149670a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxIconView invoke() {
            return this.f149670a.mo105529b(R.id.dxf);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$o */
    static final class C66558o extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C66541i f149671a;

        static {
            Covode.recordClassIndex(78101);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66558o(C66541i iVar) {
            super(0);
            this.f149671a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f149671a.mo105529b(R.id.e7_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$p */
    static final class C66559p extends AbstractC89220m implements AbstractC89171a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ C66541i f149672a;

        static {
            Covode.recordClassIndex(78102);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66559p(C66541i iVar) {
            super(0);
            this.f149672a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DmtStatusView invoke() {
            return this.f149672a.mo105529b(R.id.e7i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$r */
    static final class C66561r extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C66541i f149674a;

        static {
            Covode.recordClassIndex(78104);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66561r(C66541i iVar) {
            super(0);
            this.f149674a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return this.f149674a.mo105529b(R.id.ejf);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.question.i$z */
    public static final class RunnableC66570z implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C66541i f149683a;

        static {
            Covode.recordClassIndex(78113);
        }

        RunnableC66570z(C66541i iVar) {
            this.f149683a = iVar;
        }

        public final void run() {
            ScrollableLayout scrollableLayout = this.f149683a.f96084y;
            if (scrollableLayout != null) {
                scrollableLayout.setMaxScrollHeight(Integer.MAX_VALUE);
            }
        }
    }

    /* renamed from: x */
    private static boolean m118296x() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: i */
    public final String mo62640i() {
        String str = this.f149624U;
        if (str == null) {
            C89219l.m154710a("mQuestionId");
        }
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: k */
    public final void mo62642k() {
        super.mo62642k();
        DmtTabLayout dmtTabLayout = this.f96070C;
        if (dmtTabLayout != null) {
            dmtTabLayout.setBackgroundResource(R.color.l);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    public void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f149639aj;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$i */
    static final class C66552i extends AbstractC89220m implements AbstractC89171a<QuestionDetailParam> {

        /* renamed from: a */
        final /* synthetic */ C66541i f149665a;

        static {
            Covode.recordClassIndex(78095);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66552i(C66541i iVar) {
            super(0);
            this.f149665a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ QuestionDetailParam invoke() {
            Object value = this.f149665a.f149640d.getValue();
            if (value == null) {
                return new QuestionDetailParam(null, null, null, null, null, null, 63, null);
            }
            return value;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$s */
    static final class C66562s extends AbstractC89220m implements AbstractC89171a<QuestionDetailViewModel> {

        /* renamed from: a */
        final /* synthetic */ C66541i f149675a;

        static {
            Covode.recordClassIndex(78105);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66562s(C66541i iVar) {
            super(0);
            this.f149675a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ QuestionDetailViewModel invoke() {
            ActivityC0945e activity = this.f149675a.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            return QuestionDetailViewModel.C66578a.m118326a(activity);
        }
    }

    /* renamed from: r */
    static boolean m118291r() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean x = m118296x();
        C58029j.f132253e = x;
        return x;
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$c */
    public static final class C66545c extends AbstractC89220m implements AbstractC89171a<QuestionDetailJediViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f149656a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f149657b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f149658c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f149659d;

        static {
            Covode.recordClassIndex(78088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66545c(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f149656a = fragment;
            this.f149657b = aVar;
            this.f149658c = cVar;
            this.f149659d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailJediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.question.viewmodel.QuestionDetailJediViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f149656a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f149657b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f149658c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m118321xddf4fdc4(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailJediViewModel> r0 = com.p2082ss.android.ugc.aweme.question.viewmodel.QuestionDetailJediViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.question.i$c$1 r0 = new com.ss.android.ugc.aweme.question.i$c$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.question.C66541i.C66545c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_question_QuestionDetailFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m118321xddf4fdc4(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: q */
    public final List<Aweme> mo105538q() {
        List<Aweme> p;
        if (this.f96076I == null || !(this.f96076I.get(this.f96074G) instanceof C35658s)) {
            return C89086z.INSTANCE;
        }
        Object obj = this.f96076I.get(this.f96074G);
        if (!(obj instanceof C35658s)) {
            obj = null;
        }
        C35658s sVar = (C35658s) obj;
        if (sVar == null || (p = sVar.mo62689p()) == null) {
            return C89086z.INSTANCE;
        }
        return p;
    }

    @Override // com.p2082ss.android.ugc.aweme.question.widget.C66579a.AbstractC66580a
    /* renamed from: s */
    public final void mo105539s() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        C39162r.m79460a("enter_qa_personal_profile", new C33744d().mo59983a("enter_from", "qa_detail").mo59983a("enter_method", "click_toast").f79943a);
        SmartRouter.buildRoute(this, "aweme://user/qna/profile/" + curUser.getUid()).withParam("enter_from", "qa_detail").withParam("enter_method", "click_toast").open();
        C66579a aVar = this.f149648p;
        if (aVar == null) {
            C89219l.m154715b();
        }
        if (aVar.isShowing()) {
            C66579a aVar2 = this.f149648p;
            if (aVar2 == null) {
                C89219l.m154715b();
            }
            aVar2.dismiss();
        }
    }

    public C66541i() {
        AbstractC89277c a = C89204ab.m154669a(QuestionDetailJediViewModel.class);
        C66542a aVar = new C66542a(a);
        this.f149629Z = new lifecycleAwareLazy(this, aVar, new C66545c(this, aVar, a, C66544b.INSTANCE));
        this.f149630aa = C89250i.m154774a(EnumC89331m.NONE, new C66562s(this));
        this.f149631ab = C89250i.m154774a(EnumC89331m.NONE, C66560q.f149673a);
        IQAInvitationService b = QAInvitationService.m117786b();
        C89219l.m154716b(b, "");
        this.f149649q = b;
        this.f149638ai = -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: b */
    private final void m118290b(View view) {
        m118289a(view, new C66569y(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.question.i$f */
    public static final class View$OnClickListenerC66549f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f149662a;

        static {
            Covode.recordClassIndex(78092);
        }

        View$OnClickListenerC66549f(AbstractC89172b bVar) {
            this.f149662a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                AbstractC89172b bVar = this.f149662a;
                C89219l.m154716b(view, "");
                bVar.invoke(view);
            }
        }
    }

    @AbstractC90264r
    public final void onAntiCrawlerEvent(C34569a aVar) {
        C89219l.m154721d(aVar, "");
        String str = aVar.f81610a;
        if (str != null && C89361p.m154908a((CharSequence) str, (CharSequence) "/tiktok/v1/forum/question/detail/?", false)) {
            EventBus.m156962a().mo145397d(aVar);
            mo105528a(true, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.question.i$e */
    public static final class C66548e implements AbstractC41245k {

        /* renamed from: a */
        final /* synthetic */ C66541i f149661a;

        static {
            Covode.recordClassIndex(78091);
        }

        C66548e(C66541i iVar) {
            this.f149661a = iVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41245k
        /* renamed from: a */
        public final void mo62652a(boolean z) {
            if (z) {
                C66541i iVar = this.f149661a;
                C66519e eVar = iVar.f149641e;
                if (eVar == null) {
                    C89219l.m154710a("mHotFragment");
                }
                String jSONObject = eVar.mo62535a().toString();
                C89219l.m154716b(jSONObject, "");
                iVar.f149646n = jSONObject;
            } else if (this.f149661a.mo105533g().f55533g) {
                this.f149661a.mo105533g().setRefreshing(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$t */
    static final class C66563t extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66541i f149676a;

        static {
            Covode.recordClassIndex(78106);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66563t(C66541i iVar) {
            super(1);
            this.f149676a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            if (MSAdaptionService.m97895c().mo89377c(this.f149676a.getContext())) {
                SmartRouter.buildRoute(this.f149676a.getContext(), "//duo").withParam("duo_type", "duo_back").open();
            } else {
                ActivityC0945e activity = this.f149676a.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.question.i$x */
    public static final class C66567x extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66541i f149681a;

        static {
            Covode.recordClassIndex(78110);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66567x(C66541i iVar) {
            super(1);
            this.f149681a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            C66541i iVar = this.f149681a;
            C665681 r4 = new AbstractC89171a<C89391z>(this.f149681a) {
                /* class com.p2082ss.android.ugc.aweme.question.C66541i.C66567x.C665681 */

                static {
                    Covode.recordClassIndex(78111);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    long j;
                    User creator;
                    String uid;
                    Long id;
                    C66541i iVar = (C66541i) this.receiver;
                    iVar.getContext();
                    if (!C66541i.m118291r()) {
                        new C79459a(iVar.getContext()).mo123050a(R.string.dcq).mo123053a();
                    } else {
                        try {
                            ActivityC0945e activity = iVar.getActivity();
                            if (activity != null) {
                                IQAInvitationService iQAInvitationService = iVar.f149649q;
                                EnumC65848e eVar = EnumC65848e.QUESTION_DETAIL;
                                C66504c cVar = iVar.f149642j;
                                long j2 = 0;
                                if (cVar == null || (id = cVar.getId()) == null) {
                                    j = 0;
                                } else {
                                    j = id.longValue();
                                }
                                Long valueOf = Long.valueOf(j);
                                C66504c cVar2 = iVar.f149642j;
                                if (!(cVar2 == null || (creator = cVar2.getCreator()) == null || (uid = creator.getUid()) == null)) {
                                    j2 = Long.parseLong(uid);
                                }
                                IQAInvitationService.C65856a.m117785a(iQAInvitationService, activity, "click_button", "qa_detail", eVar, valueOf, Long.valueOf(j2), null, 128);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    return C89391z.f203057a;
                }
            };
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                ActivityC0945e activity = iVar.getActivity();
                if (activity != null) {
                    C58957c.m108321a(activity, "qa_detail", "click_button", new C66543aa("click_button", r4));
                }
            } else {
                r4.invoke();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final void mo62630a(Bundle bundle) {
        String id = mo105530b().getId();
        String str = "";
        if (id == null) {
            id = str;
        }
        this.f149624U = id;
        String processId = mo105530b().getProcessId();
        if (processId != null) {
            str = processId;
        }
        this.f149645m = str;
    }

    @AbstractC90264r
    public final void onEvent(C56257j jVar) {
        IIMService createIIMServicebyMonsterPlugin;
        C89219l.m154721d(jVar, "");
        if (TextUtils.equals("qna", jVar.f128321d) && (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) != null) {
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            createIIMServicebyMonsterPlugin.showIMSnackbar(activity, mo105531c(), jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$h */
    static final class C66551h extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66541i f149664a;

        static {
            Covode.recordClassIndex(78094);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66551h(C66541i iVar) {
            super(1);
            this.f149664a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            String str;
            String str2;
            long j;
            String str3;
            int i;
            Integer videosCount;
            Long id;
            User creator;
            C89219l.m154721d(view, "");
            if (this.f149664a.f149642j != null) {
                QuestionDetailParam b = this.f149664a.mo105530b();
                ShareInfo shareInfo = null;
                if (b != null) {
                    str = b.getId();
                } else {
                    str = null;
                }
                C33744d dVar = new C33744d();
                dVar.mo59983a("enter_from", "qa_detail");
                if (str != null) {
                    dVar.mo59983a("question_id", str);
                }
                C39162r.m79460a("click_more_button", dVar.f79943a);
                C66504c cVar = this.f149664a.f149642j;
                if (cVar == null || (creator = cVar.getCreator()) == null || (str2 = creator.getUid()) == null) {
                    str2 = "";
                }
                C66504c cVar2 = this.f149664a.f149642j;
                if (cVar2 == null || (id = cVar2.getId()) == null) {
                    j = 0;
                } else {
                    j = id.longValue();
                }
                C66504c cVar3 = this.f149664a.f149642j;
                if (cVar3 == null || (str3 = cVar3.getContent()) == null) {
                    str3 = "";
                }
                C66504c cVar4 = this.f149664a.f149642j;
                if (cVar4 == null || (videosCount = cVar4.getVideosCount()) == null) {
                    i = 0;
                } else {
                    i = videosCount.intValue();
                }
                C66504c cVar5 = this.f149664a.f149642j;
                if (cVar5 != null) {
                    shareInfo = cVar5.getShareInfo();
                }
                List<Aweme> q = this.f149664a.mo105538q();
                ShareService shareService = C68863ah.f154027a;
                ActivityC0945e activity = this.f149664a.getActivity();
                if (activity == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(activity, "");
                shareService.mo109404a(activity, new C66289b(str2, j, str3, i, shareInfo, q), new C69692g(), this.f149664a.f149645m);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.question.i$y */
    public static final class C66569y extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66541i f149682a;

        static {
            Covode.recordClassIndex(78112);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66569y(C66541i iVar) {
            super(1);
            this.f149682a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            long j;
            long j2;
            long j3;
            UrlModel urlModel;
            User user;
            User creator;
            User creator2;
            Aweme video;
            String aid;
            User creator3;
            String uid;
            Long id;
            String str = "";
            C89219l.m154721d(view, str);
            C66504c cVar = this.f149682a.f149642j;
            String str2 = null;
            if (!(cVar == null || cVar.getCreator() == null)) {
                CommentService e = CommentServiceImpl.m73664e();
                ActivityC0945e activity = this.f149682a.getActivity();
                if (activity == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(activity, str);
                C66504c cVar2 = this.f149682a.f149642j;
                if (cVar2 == null || (id = cVar2.getId()) == null) {
                    j = 0;
                } else {
                    j = id.longValue();
                }
                C66504c cVar3 = this.f149682a.f149642j;
                if (cVar3 == null || (creator3 = cVar3.getCreator()) == null || (uid = creator3.getUid()) == null) {
                    j2 = 0;
                } else {
                    j2 = Long.parseLong(uid);
                }
                C66504c cVar4 = this.f149682a.f149642j;
                if (cVar4 == null || (video = cVar4.getVideo()) == null || (aid = video.getAid()) == null) {
                    j3 = 0;
                } else {
                    j3 = Long.parseLong(aid);
                }
                C66504c cVar5 = this.f149682a.f149642j;
                if (cVar5 == null || (creator2 = cVar5.getCreator()) == null) {
                    urlModel = null;
                } else {
                    urlModel = creator2.getAvatarThumb();
                }
                C66504c cVar6 = this.f149682a.f149642j;
                if (cVar6 != null) {
                    user = cVar6.getCreator();
                } else {
                    user = null;
                }
                String e2 = C80580in.m139690e(user);
                String str3 = this.f149682a.f149643k;
                if (str3 != null) {
                    str = str3;
                }
                C66504c cVar7 = this.f149682a.f149642j;
                if (!(cVar7 == null || (creator = cVar7.getCreator()) == null)) {
                    str2 = creator.getSecUid();
                }
                e.mo63288a(activity, new QaStruct(j, j2, j3, urlModel, e2, str, str2, C89086z.INSTANCE), "qa_detail", "click_qa_detail", "answer");
            }
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        if ((!r0.isEmpty()) == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0612, code lost:
        if (p4600h.p4622m.C89361p.m154874b(r5, r9, false) != true) goto L_0x0614;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo105527a(com.p2082ss.android.ugc.aweme.question.api.C66500a r26) {
        /*
        // Method dump skipped, instructions count: 2036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.question.C66541i.mo105527a(com.ss.android.ugc.aweme.question.api.a):void");
    }

    /* renamed from: a */
    private static void m118289a(View view, AbstractC89172b<? super View, C89391z> bVar) {
        view.setOnClickListener(new View$OnClickListenerC66549f(bVar));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final void mo62628a(float f, float f2) {
        this.f149627X = C41247m.m83131a(f, f2, this.f149627X, this);
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$w */
    static final class C66566w extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66541i f149680a;

        static {
            Covode.recordClassIndex(78109);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66566w(C66541i iVar) {
            super(2);
            this.f149680a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th2, "");
            C66541i iVar2 = this.f149680a;
            if (iVar2.af_()) {
                iVar2.mo105533g().setRefreshing(false);
                iVar2.mo105533g().setVisibility(8);
                iVar2.mo105535m().setVisibility(8);
                iVar2.mo105531c().setVisibility(8);
                iVar2.mo105532e().setVisibility(8);
                iVar2.mo105534j().mo27387h();
                if (th2 != null) {
                    th2.printStackTrace();
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final void mo62629a(int i, int i2) {
        boolean z;
        super.mo62629a(i, i2);
        Set<Map.Entry> entrySet = ((HashMap) this.f149631ab.getValue()).entrySet();
        if (entrySet != null) {
            for (Map.Entry entry : entrySet) {
                Object value = entry.getValue();
                C89219l.m154716b(value, "");
                View view = (View) value;
                Integer num = (Integer) entry.getKey();
                if (num != null && num.intValue() == i) {
                    z = true;
                } else {
                    z = false;
                }
                view.setSelected(z);
            }
        }
        if (this.f96076I != null) {
            Object obj = this.f96076I.get(i);
            AbstractC41135h hVar = (AbstractC41135h) obj;
            C89219l.m154716b(hVar, "");
            if (!hVar.mo62674d()) {
                obj = null;
            }
            AbstractC41135h hVar2 = (AbstractC41135h) obj;
            if (hVar2 != null) {
                hVar2.mo62677j();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$v */
    static final class C66565v extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C66500a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66541i f149678a;

        /* renamed from: b */
        final /* synthetic */ View f149679b;

        static {
            Covode.recordClassIndex(78108);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66565v(C66541i iVar, View view) {
            super(2);
            this.f149678a = iVar;
            this.f149679b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C66500a aVar) {
            C66500a aVar2 = aVar;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(aVar2, "");
            this.f149678a.mo105527a(aVar2);
            if (QnaService.m117969a().enablePublicQna()) {
                ActivityC0945e activity = this.f149678a.getActivity();
                if (activity == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(activity, "");
                if (!activity.isDestroyed()) {
                    ActivityC0945e activity2 = this.f149678a.getActivity();
                    if (activity2 == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(activity2, "");
                    if (!activity2.isFinishing()) {
                        C66541i iVar2 = this.f149678a;
                        View view = this.f149679b;
                        ActivityC0945e b = C12777b.m23004b(iVar2);
                        if (b != null && C89219l.m154714a((Object) iVar2.mo105530b().getEnterMethod(), (Object) "ask_question") && C89219l.m154714a((Object) iVar2.mo105530b().getQuestionType(), (Object) "textual")) {
                            IAccountUserService g = C31575b.m65865g();
                            C89219l.m154716b(g, "");
                            User curUser = g.getCurUser();
                            C89219l.m154716b(curUser, "");
                            if (curUser.getDisplayQnaOnProfile() == null) {
                                Keva repo = Keva.getRepo("keva_question_detail_repo");
                                StringBuilder sb = new StringBuilder("is_first_time_ask_text_question");
                                IAccountUserService g2 = C31575b.m65865g();
                                C89219l.m154716b(g2, "");
                                if (repo.getBoolean(sb.append(g2.getCurUserId()).toString(), true)) {
                                    Keva repo2 = Keva.getRepo("keva_question_detail_repo");
                                    StringBuilder sb2 = new StringBuilder("is_first_time_ask_text_question");
                                    IAccountUserService g3 = C31575b.m65865g();
                                    C89219l.m154716b(g3, "");
                                    repo2.storeBoolean(sb2.append(g3.getCurUserId()).toString(), false);
                                    iVar2.f149648p = new C66579a(b, view, iVar2);
                                    C66579a aVar3 = iVar2.f149648p;
                                    if (aVar3 == null) {
                                        C89219l.m154715b();
                                    }
                                    new Handler().postDelayed(new C66579a.RunnableC66583d(aVar3), 200);
                                    new Handler().postDelayed(new C66579a.RunnableC66584e(aVar3), 3000);
                                }
                            }
                        }
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo105528a(boolean z, boolean z2) {
        getContext();
        if (!m118291r()) {
            new C23144b(this).mo37640e(R.string.dcq).mo37637b();
            mo105534j().mo27387h();
            mo105533g().setRefreshing(false);
        } else {
            mo105534j().mo27384f();
            String id = mo105530b().getId();
            if (id != null) {
                m118295w().mo105572a(Long.parseLong(id), z2);
            }
            List<AbstractC41135h> list = this.f96076I;
            if (z && list != null) {
                for (AbstractC41135h hVar : list) {
                    hVar.mo62669a(false, true);
                }
            }
        }
        if (z2) {
            mo105534j().mo27382d();
            mo62628a(0.0f, -60.0f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: b */
    public final void mo62635b(int i, int i2) {
        int i3;
        super.mo62635b(i, i2);
        float f = 0.0f;
        if (this.f149638ai != m118294v().getBottom()) {
            int bottom = m118294v().getBottom();
            View view = this.f96068A;
            C89219l.m154716b(view, "");
            float bottom2 = (float) ((bottom - view.getBottom()) - m118292t().getHeight());
            this.f149636ag = bottom2;
            float b = bottom2 - C13628n.m24520b(getContext(), 20.0f);
            this.f149637ah = b;
            if (b < 0.0f) {
                this.f149637ah = 0.0f;
            }
            this.f149638ai = m118294v().getBottom();
        }
        if (i == 0) {
            m118293u().setBackground(new ColorDrawable(C0643b.m2378c(m118293u().getContext(), R.color.c9)));
        } else {
            m118293u().setBackground(new ColorDrawable(C0643b.m2378c(m118293u().getContext(), R.color.l)));
        }
        C66512c cVar = this.f149623T;
        if (cVar != null) {
            i3 = cVar.getAvatarContainerHeight();
        } else {
            i3 = 1;
        }
        float f2 = ((float) i) / ((float) i3);
        if (f2 >= 0.0f) {
            if (f2 > 1.0f) {
                f = 1.0f;
            } else {
                f = f2;
            }
        }
        TextView textView = this.f96085z;
        C89219l.m154716b(textView, "");
        textView.setAlpha(f);
        this.f149627X = C41247m.m83132a(f, this.f149627X, this);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.AbstractC35600b, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        int identifier;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (TextUtils.isEmpty(mo105530b().getId())) {
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        DmtTabLayout dmtTabLayout = this.f96070C;
        C89219l.m154716b(dmtTabLayout, "");
        dmtTabLayout.setVisibility(8);
        TextView textView = this.f96085z;
        C89219l.m154716b(textView, "");
        textView.setVisibility(0);
        if (MSAdaptionService.m97895c().mo89377c(getContext())) {
            AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo105529b(R.id.pi);
            C89219l.m154716b(autoRTLImageView, "");
            autoRTLImageView.setVisibility(8);
        }
        AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) mo105529b(R.id.pi);
        C89219l.m154716b(autoRTLImageView2, "");
        m118289a(autoRTLImageView2, new C66563t(this));
        int i2 = Build.VERSION.SDK_INT;
        Context context = getContext();
        if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
            i = 0;
        } else {
            i = context.getResources().getDimensionPixelSize(identifier);
        }
        float dimension = getResources().getDimension(R.dimen.a0s);
        m118292t().getLayoutParams().height = i;
        m118292t().setAlpha(1.0f);
        ViewGroup.LayoutParams layoutParams = mo105534j().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (((float) i) + dimension);
        m118289a(mo105535m(), new C66551h(this));
        C17273d.C17274a aVar = new C17273d.C17274a(getContext());
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a = C89241a.m154730a(TypedValue.applyDimension(1, 69.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        mo105534j().setBuilder(DmtStatusView.C17269a.m31905a(getContext()).mo27407b(aVar.mo27458a(2131231887, a, C89241a.m154730a(TypedValue.applyDimension(1, 69.0f, system2.getDisplayMetrics()))).mo27462b(R.string.f2e).mo27456a().f41365a));
        mo105533g().setScrollMode(EnumC23429g.NONE);
        mo105533g().setOnRefreshListener(new C66550g(this));
        m118294v().setOnSizeChangedListener(new C66564u(this));
        AbstractC20468h.C20469a.m38667a(this, m118295w(), C66571j.f149684a, (C20370ah) null, new C66566w(this), (AbstractC89172b) null, new C66565v(this, view), 10);
        mo105528a(false, false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$u */
    static final class C66564u extends AbstractC89220m implements AbstractC89188r<Integer, Integer, Integer, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66541i f149677a;

        static {
            Covode.recordClassIndex(78107);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66564u(C66541i iVar) {
            super(4);
            this.f149677a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(Integer num, Integer num2, Integer num3, Integer num4) {
            num.intValue();
            int intValue = num2.intValue();
            num3.intValue();
            num4.intValue();
            this.f149677a.f149644l = intValue;
            return C89391z.f203057a;
        }
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
