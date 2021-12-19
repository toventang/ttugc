package com.p2082ss.android.ugc.aweme.feed.assem.videoauthorinfo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.LiveData;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.p795b.C12661l;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14524g;
import com.bytedance.ext_power_list.C14530k;
import com.bytedance.ies.dmt.p1194ui.p1199e.C17226a;
import com.bytedance.ies.dmt.p1194ui.widget.View$OnTouchListenerC17271b;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23155d;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C47008he;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48198ba;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48244cj;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationVM;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfoEvent;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50130bm;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.VideoTitleFollowBtn;
import com.p2082ss.android.ugc.aweme.friends.C51487e;
import com.p2082ss.android.ugc.aweme.friends.model.MutualStruct;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.ext.C74729a;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4615g.C89241a;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a */
public final class C49113a extends AbstractC48491a<C49113a> {

    /* renamed from: G */
    public static final C49146s f113061G = new C49146s((byte) 0);

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f113062u = {new C89232y(C49113a.class, "authorInfoVM", "getAuthorInfoVM()Lcom/ss/android/ugc/aweme/feed/assem/videoauthorinfo/VideoAuthorInfoVM;", 0), new C89232y(C49113a.class, "authorInfoRelationVM", "getAuthorInfoRelationVM()Lcom/ss/android/ugc/aweme/feed/assem/videoauthorinfo/VideoAuthorInfoRelationVM;", 0)};

    /* renamed from: A */
    public TuxTextView f113063A;

    /* renamed from: B */
    public MutualRelationView f113064B;

    /* renamed from: C */
    public boolean f113065C;

    /* renamed from: D */
    public String f113066D = "";

    /* renamed from: E */
    public String f113067E = "low_interest";

    /* renamed from: F */
    public final HashMap<String, String> f113068F = new HashMap<>();

    /* renamed from: H */
    private View f113069H;

    /* renamed from: I */
    private TuxTextView f113070I;

    /* renamed from: J */
    private MutualRelationView f113071J;

    /* renamed from: K */
    private View f113072K;

    /* renamed from: L */
    private TuxTextView f113073L;

    /* renamed from: M */
    private MutualRelationView f113074M;

    /* renamed from: N */
    private final AbstractC89244h f113075N = C89250i.m154773a((AbstractC89171a) new C49147t(this));

    /* renamed from: O */
    private final AbstractC89244h f113076O = C89250i.m154773a((AbstractC89171a) new C49127al(this));

    /* renamed from: P */
    private final AbstractC89244h f113077P = C89250i.m154773a((AbstractC89171a) new C49126ak(this));

    /* renamed from: Q */
    private final AbstractC89248d f113078Q;

    /* renamed from: R */
    private final AbstractC89248d f113079R;

    /* renamed from: S */
    private final AbstractC89244h f113080S;

    /* renamed from: T */
    private final AbstractC89244h f113081T;

    /* renamed from: U */
    private SparseArray f113082U;

    /* renamed from: v */
    public TextView f113083v;

    /* renamed from: w */
    public TextView f113084w;

    /* renamed from: x */
    public VideoTitleFollowBtn f113085x;

    /* renamed from: y */
    public View f113086y;

    /* renamed from: z */
    public View f113087z;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$e */
    public static final class C49132e extends AbstractC89220m implements AbstractC89172b<C49171q, C49171q> {
        public static final C49132e INSTANCE = new C49132e();

        static {
            Covode.recordClassIndex(57926);
        }

        public C49132e() {
            super(1);
        }

        public final C49171q invoke(C49171q qVar) {
            C89219l.m154719c(qVar, "");
            return qVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$k */
    public static final class C49138k extends AbstractC89220m implements AbstractC89172b<C49170p, C49170p> {
        public static final C49138k INSTANCE = new C49138k();

        static {
            Covode.recordClassIndex(57932);
        }

        public C49138k() {
            super(1);
        }

        public final C49170p invoke(C49170p pVar) {
            C89219l.m154719c(pVar, "");
            return pVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$m */
    public static final class C49140m extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {
        public static final C49140m INSTANCE = new C49140m();

        static {
            Covode.recordClassIndex(57934);
        }

        public C49140m() {
            super(1);
        }

        public final C48198ba invoke(C48198ba baVar) {
            C89219l.m154719c(baVar, "");
            return baVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$p */
    public static final class C49143p extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {
        public static final C49143p INSTANCE = new C49143p();

        static {
            Covode.recordClassIndex(57937);
        }

        public C49143p() {
            super(1);
        }

        public final C48244cj invoke(C48244cj cjVar) {
            C89219l.m154719c(cjVar, "");
            return cjVar;
        }
    }

    static {
        Covode.recordClassIndex(57907);
    }

    /* renamed from: I */
    private final float m92240I() {
        return ((Number) this.f113075N.getValue()).floatValue();
    }

    /* renamed from: J */
    private final float m92241J() {
        return ((Number) this.f113076O.getValue()).floatValue();
    }

    /* renamed from: K */
    private final float m92242K() {
        return ((Number) this.f113077P.getValue()).floatValue();
    }

    /* renamed from: L */
    private final VideoAuthorInfoVM m92243L() {
        return (VideoAuthorInfoVM) this.f113078Q.mo23374a(this, f113062u[0]);
    }

    /* renamed from: M */
    private final VideoEventDispatchViewModel m92244M() {
        return (VideoEventDispatchViewModel) this.f113080S.getValue();
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.t8;
    }

    /* renamed from: G */
    public final VideoAuthorInfoRelationVM mo80831G() {
        return (VideoAuthorInfoRelationVM) this.f113079R.mo23374a(this, f113062u[1]);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f113082U == null) {
            this.f113082U = new SparseArray();
        }
        View view = (View) this.f113082U.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f113082U.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$s */
    public static final class C49146s {
        static {
            Covode.recordClassIndex(57940);
        }

        private C49146s() {
        }

        public /* synthetic */ C49146s(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$b */
    public static final class C49129b extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f113111a;

        static {
            Covode.recordClassIndex(57923);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49129b(AbstractC12693u uVar) {
            super(0);
            this.f113111a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f113111a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$f */
    public static final class C49133f extends AbstractC89220m implements AbstractC89171a<C12874b<C49171q>> {
        public static final C49133f INSTANCE = new C49133f();

        static {
            Covode.recordClassIndex(57927);
        }

        public C49133f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C49171q> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$g */
    public static final class C49134g extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f113114a;

        static {
            Covode.recordClassIndex(57928);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49134g(AbstractC12693u uVar) {
            super(0);
            this.f113114a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f113114a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$l */
    public static final class C49139l extends AbstractC89220m implements AbstractC89171a<C12874b<C49170p>> {
        public static final C49139l INSTANCE = new C49139l();

        static {
            Covode.recordClassIndex(57933);
        }

        public C49139l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C49170p> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$n */
    public static final class C49141n extends AbstractC89220m implements AbstractC89171a<C12874b<C48198ba>> {
        public static final C49141n INSTANCE = new C49141n();

        static {
            Covode.recordClassIndex(57935);
        }

        public C49141n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48198ba> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$o */
    public static final class C49142o extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C49142o INSTANCE = new C49142o();

        static {
            Covode.recordClassIndex(57936);
        }

        public C49142o() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$q */
    public static final class C49144q extends AbstractC89220m implements AbstractC89171a<C12874b<C48244cj>> {
        public static final C49144q INSTANCE = new C49144q();

        static {
            Covode.recordClassIndex(57938);
        }

        public C49144q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48244cj> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$r */
    public static final class C49145r extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C49145r INSTANCE = new C49145r();

        static {
            Covode.recordClassIndex(57939);
        }

        public C49145r() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$c */
    public static final class C49130c extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f113112a;

        static {
            Covode.recordClassIndex(57924);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49130c(AbstractC12693u uVar) {
            super(0);
            this.f113112a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f113112a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$d */
    public static final class C49131d extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f113113a;

        static {
            Covode.recordClassIndex(57925);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49131d(AbstractC12693u uVar) {
            super(0);
            this.f113113a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f113113a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$h */
    public static final class C49135h extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f113115a;

        static {
            Covode.recordClassIndex(57929);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49135h(AbstractC12693u uVar) {
            super(0);
            this.f113115a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f113115a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$i */
    public static final class C49136i extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f113116a;

        static {
            Covode.recordClassIndex(57930);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49136i(AbstractC12693u uVar) {
            super(0);
            this.f113116a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f113116a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$a */
    public static final class C49114a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f113088a;

        static {
            Covode.recordClassIndex(57908);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49114a(AbstractC89277c cVar) {
            super(0);
            this.f113088a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f113088a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$ag */
    static final class RunnableC49121ag implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49113a f113095a;

        static {
            Covode.recordClassIndex(57915);
        }

        RunnableC49121ag(C49113a aVar) {
            this.f113095a = aVar;
        }

        public final void run() {
            LiveData<Aweme> a = CommentServiceImpl.m73664e().mo63276a(this.f113095a.f31000d);
            if (a != null) {
                a.observe(this.f113095a, new AbstractC1214u(this) {
                    /* class com.p2082ss.android.ugc.aweme.feed.assem.videoauthorinfo.C49113a.RunnableC49121ag.C491221 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC49121ag f113096a;

                    static {
                        Covode.recordClassIndex(57916);
                    }

                    {
                        this.f113096a = r1;
                    }

                    @Override // androidx.lifecycle.AbstractC1214u
                    public final /* synthetic */ void onChanged(Object obj) {
                        Aweme aweme = (Aweme) obj;
                        if (aweme != null) {
                            String aid = aweme.getAid();
                            Aweme aweme2 = ((VideoItemParams) C12661l.m22797a(this.f113096a.f113095a)).mAweme;
                            C89219l.m154716b(aweme2, "");
                            if (C89219l.m154714a((Object) aid, (Object) aweme2.getAid())) {
                                this.f113096a.f113095a.mo80832a(aweme);
                            }
                        }
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$ak */
    static final class C49126ak extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C49113a f113100a;

        static {
            Covode.recordClassIndex(57920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49126ak(C49113a aVar) {
            super(0);
            this.f113100a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(C13628n.m24520b(this.f113100a.az_(), 4.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$al */
    static final class C49127al extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C49113a f113101a;

        static {
            Covode.recordClassIndex(57921);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49127al(C49113a aVar) {
            super(0);
            this.f113101a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(C13628n.m24520b(this.f113101a.az_(), 30.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$j */
    public static final class C49137j extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f113117a;

        static {
            Covode.recordClassIndex(57931);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49137j(AbstractC89277c cVar) {
            super(0);
            this.f113117a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f113117a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$t */
    static final class C49147t extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C49113a f113118a;

        static {
            Covode.recordClassIndex(57941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49147t(C49113a aVar) {
            super(0);
            this.f113118a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(((float) C34723i.m70928b(this.f113118a.az_())) - C13628n.m24520b(this.f113118a.az_(), 105.0f));
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        super.mo20533y();
        AbstractC12818f.C12819a.m23063a(this, m92243L(), C49156b.f113129a, (C12854k) null, C49152y.f113123a, 6);
        AbstractC12818f.C12819a.m23063a(this, m92243L(), C49163i.f113136a, (C12854k) null, C49115aa.f113089a, 6);
        AbstractC12818f.C12819a.m23063a(this, m92243L(), C49164j.f113137a, (C12854k) null, C49116ab.f113090a, 6);
        AbstractC12818f.C12819a.m23063a(this, m92243L(), C49165k.f113138a, (C12854k) null, C49117ac.f113091a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo80831G(), C49166l.f113139a, (C12854k) null, C49148u.f113119a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo80831G(), C49157c.f113130a, (C12854k) null, C49149v.f113120a, 6);
        AbstractC12818f.C12819a.m23067a(this, mo80831G(), C49158d.f113131a, C49159e.f113132a, C49160f.f113133a, (C12854k) null, C49150w.f113121a, 24);
        AbstractC12818f.C12819a.m23063a(this, mo80831G(), C49161g.f113134a, (C12854k) null, C49151x.f113122a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo80831G(), C49162h.f113135a, (C12854k) null, C49153z.f113124a, 6);
    }

    public C49113a() {
        AbstractC12848i.C12851c cVar = AbstractC12848i.C12851c.f31277a;
        AbstractC89277c a = C89204ab.m154669a(VideoAuthorInfoVM.class);
        this.f113078Q = C14530k.m26542a(this, a, cVar == null ? AbstractC12848i.C12851c.f31277a : cVar, new C49114a(a), C49133f.INSTANCE, new C49134g(this), C49132e.INSTANCE, null, null, new C49135h(this), new C49136i(this));
        AbstractC12848i.C12851c cVar2 = AbstractC12848i.C12851c.f31277a;
        AbstractC89277c a2 = C89204ab.m154669a(VideoAuthorInfoRelationVM.class);
        this.f113079R = C14530k.m26542a(this, a2, cVar2 == null ? AbstractC12848i.C12851c.f31277a : cVar2, new C49137j(a2), C49139l.INSTANCE, new C49129b(this), C49138k.INSTANCE, null, null, new C49130c(this), new C49131d(this));
        this.f113080S = new C14524g(C89204ab.m154669a(VideoEventDispatchViewModel.class), this, C49141n.INSTANCE, C49142o.INSTANCE, C49140m.INSTANCE);
        this.f113081T = new C14524g(C89204ab.m154669a(VideoViewModel.class), this, C49144q.INSTANCE, C49145r.INSTANCE, C49143p.INSTANCE);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
    }

    /* renamed from: a */
    public static final /* synthetic */ TextView m92245a(C49113a aVar) {
        TextView textView = aVar.f113083v;
        if (textView == null) {
            C89219l.m154710a("titleView");
        }
        return textView;
    }

    /* renamed from: b */
    public static final /* synthetic */ TextView m92246b(C49113a aVar) {
        TextView textView = aVar.f113084w;
        if (textView == null) {
            C89219l.m154710a("postTimeView");
        }
        return textView;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m92247c(C49113a aVar) {
        View view = aVar.f113087z;
        if (view == null) {
            C89219l.m154710a("relationLayout");
        }
        return view;
    }

    /* renamed from: d */
    public static final /* synthetic */ VideoTitleFollowBtn m92248d(C49113a aVar) {
        VideoTitleFollowBtn videoTitleFollowBtn = aVar.f113085x;
        if (videoTitleFollowBtn == null) {
            C89219l.m154710a("followUserBtn");
        }
        return videoTitleFollowBtn;
    }

    /* renamed from: e */
    public static final /* synthetic */ View m92249e(C49113a aVar) {
        View view = aVar.f113086y;
        if (view == null) {
            C89219l.m154710a("rootLayout");
        }
        return view;
    }

    /* renamed from: f */
    public static final /* synthetic */ MutualRelationView m92250f(C49113a aVar) {
        MutualRelationView mutualRelationView = aVar.f113064B;
        if (mutualRelationView == null) {
            C89219l.m154710a("mutualRelationView");
        }
        return mutualRelationView;
    }

    /* renamed from: g */
    public static final /* synthetic */ TuxTextView m92251g(C49113a aVar) {
        TuxTextView tuxTextView = aVar.f113063A;
        if (tuxTextView == null) {
            C89219l.m154710a("tvRelationView");
        }
        return tuxTextView;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$ad */
    static final class View$OnClickListenerC49118ad implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49113a f113092a;

        static {
            Covode.recordClassIndex(57912);
        }

        View$OnClickListenerC49118ad(C49113a aVar) {
            this.f113092a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DataCenter dataCenter = ((VideoItemParams) C12661l.m22797a(this.f113092a)).dataCenter;
            if (dataCenter != null) {
                dataCenter.mo60191a("title_view_click", (Object) null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$ah */
    static final class View$OnClickListenerC49123ah implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49113a f113097a;

        static {
            Covode.recordClassIndex(57917);
        }

        View$OnClickListenerC49123ah(C49113a aVar) {
            this.f113097a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DataCenter dataCenter = ((VideoItemParams) C12661l.m22797a(this.f113097a)).dataCenter;
            if (dataCenter != null) {
                dataCenter.mo60191a("title_view_click", (Object) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo80832a(Aweme aweme) {
        Aweme aweme2 = ((VideoItemParams) C12661l.m22797a(this)).mAweme;
        if (aweme2 != null) {
            aweme2.setInteractionTagInfo(aweme.getInteractionTagInfo());
            mo80833b(aweme2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$am */
    public static final class View$OnClickListenerC49128am implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f113102a;

        /* renamed from: b */
        final /* synthetic */ String f113103b;

        /* renamed from: c */
        final /* synthetic */ View f113104c;

        /* renamed from: d */
        final /* synthetic */ float f113105d;

        /* renamed from: e */
        final /* synthetic */ C49113a f113106e;

        /* renamed from: f */
        final /* synthetic */ Aweme f113107f;

        /* renamed from: g */
        final /* synthetic */ View f113108g;

        /* renamed from: h */
        final /* synthetic */ TuxTextView f113109h;

        /* renamed from: i */
        final /* synthetic */ MutualRelationView f113110i;

        static {
            Covode.recordClassIndex(57922);
        }

        View$OnClickListenerC49128am(View view, String str, View view2, float f, C49113a aVar, Aweme aweme, View view3, TuxTextView tuxTextView, MutualRelationView mutualRelationView) {
            this.f113102a = view;
            this.f113103b = str;
            this.f113104c = view2;
            this.f113105d = f;
            this.f113106e = aVar;
            this.f113107f = aweme;
            this.f113108g = view3;
            this.f113109h = tuxTextView;
            this.f113110i = mutualRelationView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context context = this.f113102a.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            if (activity != null && (activity instanceof ActivityC0945e)) {
                VideoAuthorInfoRelationVM G = this.f113106e.mo80831G();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                ActivityC0945e eVar = (ActivityC0945e) activity;
                Aweme aweme = this.f113107f;
                String str = this.f113106e.f113067E;
                String str2 = "";
                C89219l.m154721d(eVar, str2);
                C89219l.m154721d(aweme, str2);
                C89219l.m154721d(str, str2);
                CommentServiceImpl.m73664e().mo63290a(eVar, aweme, G.f112231p, str);
                C33744d a = new C33744d().mo59983a("enter_from", G.f112231p);
                String aid = aweme.getAid();
                if (aid == null) {
                    aid = str2;
                }
                C33744d a2 = a.mo59983a("group_id", aid);
                String authorUid = aweme.getAuthorUid();
                if (authorUid != null) {
                    str2 = authorUid;
                }
                C39162r.m79460a("tag_anchor_click", a2.mo59983a("author_id", str2).mo59983a("anchor_type", str).f79943a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$ai */
    static final class View$OnClickListenerC49124ai implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49113a f113098a;

        static {
            Covode.recordClassIndex(57918);
        }

        View$OnClickListenerC49124ai(C49113a aVar) {
            this.f113098a = aVar;
        }

        public final void onClick(View view) {
            User author;
            ClickAgent.onClick(view);
            C49113a aVar = this.f113098a;
            Aweme aweme = ((VideoItemParams) C12661l.m22797a(aVar)).mAweme;
            if (aweme != null) {
                DataCenter dataCenter = ((VideoItemParams) C12661l.m22797a(aVar)).dataCenter;
                if (dataCenter != null) {
                    dataCenter.mo60191a("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR", aweme.getAid());
                }
                if (view != null && view.getVisibility() == 0 && !C37699a.m76202E(aweme) && !aweme.isDelete() && (author = aweme.getAuthor()) != null) {
                    String uid = author.getUid();
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    if (!TextUtils.equals(uid, g.getCurUserId())) {
                        if (C37699a.m76255aa(aweme) || C37699a.m76222Y(aweme)) {
                            C38000g.m77050a().mo65880a(view.getContext(), aweme, "plus_sign");
                        }
                        C34719f fVar = C34719f.C34720a.f82009a;
                        C89219l.m154716b(fVar, "");
                        if (!fVar.mo61395c()) {
                            Context context = view.getContext();
                            new C17226a(context, context.getString(R.string.dcq), 2, C17226a.m31792b()).mo27250a();
                        } else if (((VideoItemParams) C12661l.m22797a(aVar)).dataCenter != null && author.getFollowStatus() == 0) {
                            C49672ag agVar = new C49672ag(12, aweme);
                            agVar.f114328n = "card_button";
                            DataCenter dataCenter2 = ((VideoItemParams) C12661l.m22797a(aVar)).dataCenter;
                            if (dataCenter2 != null) {
                                dataCenter2.mo60191a("feed_internal_event", agVar);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01d2  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80833b(com.p2082ss.android.ugc.aweme.feed.model.Aweme r22) {
        /*
        // Method dump skipped, instructions count: 549
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.videoauthorinfo.C49113a.mo80833b(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.f1e);
        C89219l.m154716b(findViewById, "");
        this.f113084w = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.title);
        C89219l.m154716b(findViewById2, "");
        TextView textView = (TextView) findViewById2;
        this.f113083v = textView;
        if (textView == null) {
            C89219l.m154710a("titleView");
        }
        textView.setOnTouchListener(new View$OnTouchListenerC17271b());
        TextView textView2 = this.f113083v;
        if (textView2 == null) {
            C89219l.m154710a("titleView");
        }
        textView2.setOnClickListener(new View$OnClickListenerC49118ad(this));
        View findViewById3 = view.findViewById(R.id.ce9);
        C89219l.m154716b(findViewById3, "");
        this.f113087z = findViewById3;
        View findViewById4 = view.findViewById(R.id.xm);
        C89219l.m154716b(findViewById4, "");
        this.f113085x = (VideoTitleFollowBtn) findViewById4;
        View findViewById5 = view.findViewById(R.id.dlw);
        C89219l.m154716b(findViewById5, "");
        this.f113086y = findViewById5;
        View findViewById6 = view.findViewById(R.id.title);
        C89219l.m154716b(findViewById6, "");
        this.f113083v = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.f2b);
        C89219l.m154716b(findViewById7, "");
        this.f113063A = (TuxTextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.cp6);
        C89219l.m154716b(findViewById8, "");
        this.f113064B = (MutualRelationView) findViewById8;
        View findViewById9 = view.findViewById(R.id.e3y);
        C89219l.m154716b(findViewById9, "");
        this.f113070I = (TuxTextView) findViewById9;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        gradientDrawable.setStroke(C89241a.m154730a(TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics())), C0643b.m2378c(view.getContext(), R.color.l));
        gradientDrawable.setColor(C0643b.m2378c(view.getContext(), R.color.l));
        View findViewById10 = view.findViewById(R.id.e3x);
        MutualRelationView mutualRelationView = (MutualRelationView) findViewById10;
        mutualRelationView.setSocialVideoTag(true);
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        int a = C89241a.m154730a(TypedValue.applyDimension(1, 18.0f, system2.getDisplayMetrics()));
        Resources system3 = Resources.getSystem();
        C89219l.m154709a((Object) system3, "");
        mutualRelationView.mo125021a(a, C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system3.getDisplayMetrics())));
        C89219l.m154716b(findViewById10, "");
        this.f113071J = mutualRelationView;
        View findViewById11 = view.findViewById(R.id.e3z);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(C13628n.m24520b(view.getContext(), 2.0f));
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        Integer a2 = C23155d.m43641a(context, R.attr.a9);
        if (a2 != null) {
            gradientDrawable2.setColor(a2.intValue());
        }
        findViewById11.setBackground(gradientDrawable2);
        C89219l.m154716b(findViewById11, "");
        this.f113069H = findViewById11;
        View findViewById12 = view.findViewById(R.id.e41);
        C89219l.m154716b(findViewById12, "");
        this.f113073L = (TuxTextView) findViewById12;
        View findViewById13 = view.findViewById(R.id.e40);
        MutualRelationView mutualRelationView2 = (MutualRelationView) findViewById13;
        mutualRelationView2.setSocialVideoTag(true);
        Resources system4 = Resources.getSystem();
        C89219l.m154709a((Object) system4, "");
        int a3 = C89241a.m154730a(TypedValue.applyDimension(1, 18.0f, system4.getDisplayMetrics()));
        Resources system5 = Resources.getSystem();
        C89219l.m154709a((Object) system5, "");
        mutualRelationView2.mo125021a(a3, C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system5.getDisplayMetrics())));
        C89219l.m154716b(findViewById13, "");
        this.f113074M = mutualRelationView2;
        View findViewById14 = view.findViewById(R.id.e42);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(C13628n.m24520b(view.getContext(), 2.0f));
        Context context2 = view.getContext();
        C89219l.m154716b(context2, "");
        Integer a4 = C23155d.m43641a(context2, R.attr.a9);
        if (a4 != null) {
            gradientDrawable3.setColor(a4.intValue());
        }
        findViewById14.setBackground(gradientDrawable3);
        C89219l.m154716b(findViewById14, "");
        this.f113072K = findViewById14;
        View view2 = this.f113086y;
        if (view2 == null) {
            C89219l.m154710a("rootLayout");
        }
        view2.setOnClickListener(new View$OnClickListenerC49123ah(this));
        VideoTitleFollowBtn videoTitleFollowBtn = this.f113085x;
        if (videoTitleFollowBtn == null) {
            C89219l.m154710a("followUserBtn");
        }
        videoTitleFollowBtn.setOnClickListener(new View$OnClickListenerC49124ai(this));
        AbstractC12818f.C12819a.m23070b(this, m92244M(), C49169o.f113142a, (C12854k) null, C49125aj.f113099a, 6);
        AbstractC12818f.C12819a.m23070b(this, m92244M(), C49167m.f113140a, (C12854k) null, C49119ae.f113093a, 6);
        AbstractC12818f.C12819a.m23063a(this, (VideoViewModel) this.f113081T.getValue(), C49168n.f113141a, (C12854k) null, C49120af.f113094a, 6);
        C34727m.m70944a(new RunnableC49121ag(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$aa */
    static final class C49115aa extends AbstractC89220m implements AbstractC89183m<C49113a, Integer, C89391z> {

        /* renamed from: a */
        public static final C49115aa f113089a = new C49115aa();

        static {
            Covode.recordClassIndex(57909);
        }

        C49115aa() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49113a aVar, Integer num) {
            C49113a aVar2 = aVar;
            int intValue = num.intValue();
            C89219l.m154721d(aVar2, "");
            C49113a.m92245a(aVar2).setVisibility(intValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$y */
    static final class C49152y extends AbstractC89220m implements AbstractC89183m<C49113a, String, C89391z> {

        /* renamed from: a */
        public static final C49152y f113123a = new C49152y();

        static {
            Covode.recordClassIndex(57946);
        }

        C49152y() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49113a aVar, String str) {
            C49113a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C49113a.m92245a(aVar2).setText(str);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$ab */
    static final class C49116ab extends AbstractC89220m implements AbstractC89183m<C49113a, C89378p<? extends String, ? extends String>, C89391z> {

        /* renamed from: a */
        public static final C49116ab f113090a = new C49116ab();

        static {
            Covode.recordClassIndex(57910);
        }

        C49116ab() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49113a aVar, C89378p<? extends String, ? extends String> pVar) {
            C49113a aVar2 = aVar;
            C89378p<? extends String, ? extends String> pVar2 = pVar;
            C89219l.m154721d(aVar2, "");
            if (pVar2 != null) {
                Context az_ = aVar2.az_();
                if (az_ == null) {
                    C89219l.m154715b();
                }
                C80581io.m139704a(az_, (String) pVar2.getFirst(), (String) pVar2.getSecond(), C49113a.m92245a(aVar2));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$ac */
    static final class C49117ac extends AbstractC89220m implements AbstractC89183m<C49113a, String, C89391z> {

        /* renamed from: a */
        public static final C49117ac f113091a = new C49117ac();

        static {
            Covode.recordClassIndex(57911);
        }

        C49117ac() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49113a aVar, String str) {
            C49113a aVar2 = aVar;
            String str2 = str;
            C89219l.m154721d(aVar2, "");
            C49113a.m92246b(aVar2).setText(str2);
            TextView b = C49113a.m92246b(aVar2);
            int i = 0;
            if (str2 == null || str2.length() == 0) {
                i = 8;
            }
            b.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$ae */
    static final class C49119ae extends AbstractC89220m implements AbstractC89183m<C49113a, InteractionTagInfoEvent, C89391z> {

        /* renamed from: a */
        public static final C49119ae f113093a = new C49119ae();

        static {
            Covode.recordClassIndex(57913);
        }

        C49119ae() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49113a aVar, InteractionTagInfoEvent interactionTagInfoEvent) {
            Aweme aweme;
            C49113a aVar2 = aVar;
            InteractionTagInfoEvent interactionTagInfoEvent2 = interactionTagInfoEvent;
            C89219l.m154721d(aVar2, "");
            if (!(interactionTagInfoEvent2 == null || (aweme = interactionTagInfoEvent2.aweme) == null)) {
                String aid = aweme.getAid();
                Aweme aweme2 = ((VideoItemParams) C12661l.m22797a(aVar2)).mAweme;
                C89219l.m154716b(aweme2, "");
                if (C89219l.m154714a((Object) aid, (Object) aweme2.getAid())) {
                    aVar2.mo80832a(aweme);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$v */
    static final class C49149v extends AbstractC89220m implements AbstractC89183m<C49113a, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        public static final C49149v f113120a = new C49149v();

        static {
            Covode.recordClassIndex(57943);
        }

        C49149v() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49113a aVar, C12776a<? extends Boolean> aVar2) {
            T t;
            C49113a aVar3 = aVar;
            C12776a<? extends Boolean> aVar4 = aVar2;
            C89219l.m154721d(aVar3, "");
            if (!(aVar4 == null || (t = aVar4.f31085a) == null)) {
                aVar3.f113065C = t.booleanValue();
                Aweme aweme = ((VideoItemParams) C12661l.m22797a(aVar3)).mAweme;
                C89219l.m154716b(aweme, "");
                aVar3.mo80833b(aweme);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$x */
    static final class C49151x extends AbstractC89220m implements AbstractC89183m<C49113a, C89378p<? extends Integer, ? extends Integer>, C89391z> {

        /* renamed from: a */
        public static final C49151x f113122a = new C49151x();

        static {
            Covode.recordClassIndex(57945);
        }

        C49151x() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49113a aVar, C89378p<? extends Integer, ? extends Integer> pVar) {
            C49113a aVar2 = aVar;
            C89378p<? extends Integer, ? extends Integer> pVar2 = pVar;
            C89219l.m154721d(aVar2, "");
            if (pVar2 != null) {
                C49113a.m92248d(aVar2).mo73175a(((Number) pVar2.getFirst()).intValue(), ((Number) pVar2.getSecond()).intValue());
                C49113a.m92248d(aVar2).setVisibility(0);
                C49113a.m92248d(aVar2).setAlpha(1.0f);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$af */
    static final class C49120af extends AbstractC89220m implements AbstractC89183m<C49113a, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        public static final C49120af f113094a = new C49120af();

        static {
            Covode.recordClassIndex(57914);
        }

        C49120af() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49113a aVar, C12776a<? extends Integer> aVar2) {
            VideoItemParams videoItemParams;
            Aweme aweme;
            C49113a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            if (!(aVar2 == null || (videoItemParams = (VideoItemParams) C12661l.m22797a(aVar3)) == null || (aweme = videoItemParams.mAweme) == null)) {
                if (aVar3.f113068F.keySet().contains(aweme.getAid())) {
                    VideoAuthorInfoRelationVM G = aVar3.mo80831G();
                    String str = aVar3.f113068F.get(aweme.getAid());
                    if (str == null) {
                        str = "";
                    }
                    C89219l.m154716b(str, "");
                    G.mo80830a(aweme, str);
                } else if (TextUtils.isEmpty(aVar3.f113066D)) {
                    String aid = aweme.getAid();
                    C89219l.m154716b(aid, "");
                    aVar3.f113066D = aid;
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$aj */
    static final class C49125aj extends AbstractC89220m implements AbstractC89183m<C49113a, FollowStatusEvent, C89391z> {

        /* renamed from: a */
        public static final C49125aj f113099a = new C49125aj();

        static {
            Covode.recordClassIndex(57919);
        }

        C49125aj() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49113a aVar, FollowStatusEvent followStatusEvent) {
            String str;
            FollowStatus followStatus;
            C49113a aVar2 = aVar;
            FollowStatusEvent followStatusEvent2 = followStatusEvent;
            C89219l.m154721d(aVar2, "");
            if (followStatusEvent2 != null) {
                FollowStatus followStatus2 = followStatusEvent2.status;
                if (followStatus2 != null) {
                    str = followStatus2.userId;
                } else {
                    str = null;
                }
                if (!(!C89219l.m154714a((Object) str, (Object) C59208ac.m108758a(((VideoItemParams) C12661l.m22797a(aVar2)).mAweme))) && (followStatus = followStatusEvent2.status) != null && followStatus.followStatus == 1) {
                    Aweme aweme = ((VideoItemParams) C12661l.m22797a(aVar2)).mAweme;
                    C89219l.m154716b(aweme, "");
                    if (C50130bm.m94080c(aweme.getAid())) {
                        VideoAuthorInfoRelationVM G = aVar2.mo80831G();
                        FollowStatus followStatus3 = followStatusEvent2.status;
                        C89219l.m154721d(followStatus3, "");
                        if (C47008he.m90283b()) {
                            G.mo20662a(new VideoAuthorInfoRelationVM.C49110a(followStatus3));
                        }
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$z */
    static final class C49153z extends AbstractC89220m implements AbstractC89183m<C49113a, Boolean, C89391z> {

        /* renamed from: a */
        public static final C49153z f113124a = new C49153z();

        static {
            Covode.recordClassIndex(57947);
        }

        C49153z() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49113a aVar, Boolean bool) {
            final C49113a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (!(!C89219l.m154714a((Object) bool, (Object) true))) {
                Aweme aweme = ((VideoItemParams) C12661l.m22797a(aVar2)).mAweme;
                C89219l.m154716b(aweme, "");
                C50130bm.m94077a(aweme.getAid());
                final int measuredHeight = C49113a.m92249e(aVar2).getMeasuredHeight() - C49113a.m92245a(aVar2).getMeasuredHeight();
                final int measuredHeight2 = C49113a.m92249e(aVar2).getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                C89219l.m154716b(ofFloat, "");
                ofFloat.setStartDelay(200);
                ofFloat.setDuration(300L);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.p2082ss.android.ugc.aweme.feed.assem.videoauthorinfo.C49113a.C49153z.C491541 */

                    static {
                        Covode.recordClassIndex(57948);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Drawable background;
                        C89219l.m154716b(valueAnimator, "");
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        ViewGroup.MarginLayoutParams marginLayoutParams = null;
                        if (!(animatedValue instanceof Float)) {
                            animatedValue = null;
                        }
                        Float f = (Float) animatedValue;
                        if (f != null) {
                            float floatValue = f.floatValue();
                            View e = C49113a.m92249e(aVar2);
                            if (!(e == null || (background = e.getBackground()) == null)) {
                                background.setAlpha((int) (255.0f * floatValue));
                            }
                            View e2 = C49113a.m92249e(aVar2);
                            ViewGroup.LayoutParams layoutParams = C49113a.m92249e(aVar2).getLayoutParams();
                            layoutParams.height = (int) (((float) measuredHeight2) - ((1.0f - floatValue) * ((float) measuredHeight)));
                            e2.setLayoutParams(layoutParams);
                            TextView a = C49113a.m92245a(aVar2);
                            ViewGroup.LayoutParams layoutParams2 = C49113a.m92245a(aVar2).getLayoutParams();
                            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                                layoutParams2 = null;
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                            if (marginLayoutParams2 != null) {
                                int b = (int) C13628n.m24520b(aVar2.az_(), 8.0f * floatValue);
                                if (!C80471gb.m139483a(aVar2.az_())) {
                                    marginLayoutParams2.leftMargin = b;
                                } else {
                                    marginLayoutParams2.rightMargin = b;
                                }
                                marginLayoutParams2.topMargin = b;
                                marginLayoutParams = marginLayoutParams2;
                            }
                            a.setLayoutParams(marginLayoutParams);
                            C49113a.m92248d(aVar2).setAlpha(floatValue);
                            C49113a.m92247c(aVar2).setAlpha(floatValue);
                        }
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    /* class com.p2082ss.android.ugc.aweme.feed.assem.videoauthorinfo.C49113a.C49153z.C491552 */

                    static {
                        Covode.recordClassIndex(57949);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        aVar2.mo80831G().mo20662a(VideoAuthorInfoRelationVM.C49111b.f113059a);
                        Aweme aweme = ((VideoItemParams) C12661l.m22797a(aVar2)).mAweme;
                        C89219l.m154716b(aweme, "");
                        C50130bm.m94078a(aweme.getAid(), false);
                    }
                });
                ofFloat.start();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$u */
    static final class C49148u extends AbstractC89220m implements AbstractC89183m<C49113a, Boolean, C89391z> {

        /* renamed from: a */
        public static final C49148u f113119a = new C49148u();

        static {
            Covode.recordClassIndex(57942);
        }

        C49148u() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: android.graphics.drawable.GradientDrawable */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49113a aVar, Boolean bool) {
            int i;
            ColorDrawable colorDrawable;
            float f;
            C49113a aVar2 = aVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(aVar2, "");
            View c = C49113a.m92247c(aVar2);
            int i2 = 8;
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            c.setVisibility(i);
            VideoTitleFollowBtn d = C49113a.m92248d(aVar2);
            if (booleanValue) {
                i2 = 0;
            }
            d.setVisibility(i2);
            C49113a.m92247c(aVar2).setAlpha(1.0f);
            C49113a.m92248d(aVar2).setAlpha(1.0f);
            View e = C49113a.m92249e(aVar2);
            if (booleanValue) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(C13628n.m24520b(aVar2.az_(), 4.0f));
                Context az_ = aVar2.az_();
                colorDrawable = gradientDrawable;
                if (az_ != null) {
                    Integer a = C23155d.m43641a(az_, R.attr.a4);
                    colorDrawable = gradientDrawable;
                    if (a != null) {
                        gradientDrawable.setColor(a.intValue());
                        colorDrawable = gradientDrawable;
                    }
                }
            } else {
                colorDrawable = new ColorDrawable(0);
            }
            e.setBackground(colorDrawable);
            View e2 = C49113a.m92249e(aVar2);
            ViewGroup.LayoutParams layoutParams = C49113a.m92249e(aVar2).getLayoutParams();
            layoutParams.height = -2;
            e2.setLayoutParams(layoutParams);
            if (booleanValue) {
                f = 8.0f;
            } else {
                f = 0.0f;
            }
            TextView a2 = C49113a.m92245a(aVar2);
            ViewGroup.LayoutParams layoutParams2 = C49113a.m92245a(aVar2).getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams2 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (marginLayoutParams2 != null) {
                int b = (int) C13628n.m24520b(aVar2.az_(), f);
                if (!C80471gb.m139483a(aVar2.az_())) {
                    marginLayoutParams2.leftMargin = b;
                } else {
                    marginLayoutParams2.rightMargin = b;
                }
                marginLayoutParams2.topMargin = b;
                marginLayoutParams = marginLayoutParams2;
            }
            a2.setLayoutParams(marginLayoutParams);
            if (booleanValue) {
                Aweme aweme = ((VideoItemParams) C12661l.m22797a(aVar2)).mAweme;
                C89219l.m154716b(aweme, "");
                C50130bm.m94078a(aweme.getAid(), true);
            }
            aVar2.mo80831G().mo20662a(new VideoAuthorInfoRelationVM.C49112c(booleanValue));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$w */
    static final class C49150w extends AbstractC89220m implements AbstractC89188r<C49113a, MutualStruct, String, Aweme, C89391z> {

        /* renamed from: a */
        public static final C49150w f113121a = new C49150w();

        static {
            Covode.recordClassIndex(57944);
        }

        C49150w() {
            super(4);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(C49113a aVar, MutualStruct mutualStruct, String str, Aweme aweme) {
            C49113a aVar2 = aVar;
            MutualStruct mutualStruct2 = mutualStruct;
            String str2 = str;
            Aweme aweme2 = aweme;
            C89219l.m154721d(aVar2, "");
            if (mutualStruct2 != null) {
                C49113a.m92250f(aVar2).setVisibility(0);
                MutualRelationView f = C49113a.m92250f(aVar2);
                Context az_ = aVar2.az_();
                if (az_ == null) {
                    C89219l.m154715b();
                }
                f.setTextColor(C0643b.m2378c(az_, R.color.a9));
                C49113a.m92250f(aVar2).setDarkMode(true);
                C49113a.m92250f(aVar2).mo125023a(mutualStruct2, C51487e.m95908e());
            } else {
                C49113a.m92250f(aVar2).setVisibility(8);
            }
            if (aweme2 != null) {
                C74729a.m131190a(C49113a.m92251g(aVar2), null, aweme2, Integer.valueOf(C49113a.m92251g(aVar2).getMaxWidth()), 1);
                C49113a.m92251g(aVar2).setVisibility(0);
            } else if (str2 == null || str2.length() == 0) {
                C49113a.m92251g(aVar2).setVisibility(8);
            } else {
                TuxTextView tuxTextView = aVar2.f113063A;
                if (tuxTextView == null) {
                    C89219l.m154710a("tvRelationView");
                }
                tuxTextView.setVisibility(0);
                TuxTextView tuxTextView2 = aVar2.f113063A;
                if (tuxTextView2 == null) {
                    C89219l.m154710a("tvRelationView");
                }
                tuxTextView2.setText(str2);
                C49113a.m92251g(aVar2).setVisibility(0);
            }
            return C89391z.f203057a;
        }
    }
}
