package com.p2082ss.android.ugc.aweme.feed.assem.desc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import androidx.core.p035f.C0671a;
import androidx.core.p037h.C0792v;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.p795b.C12661l;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14524g;
import com.bytedance.ext_power_list.C14530k;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.watcher.C18285c;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.tag.TuxTag;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.C37593d;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.EnumC48310af;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48244cj;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.C48342a;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.assem.desc.VideoDescVM;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49495aa;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49525p;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.p2082ss.android.ugc.aweme.feed.p2936ab.C48022b;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50087aw;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50109bf;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50153bv;
import com.p2082ss.android.ugc.aweme.feed.p2977v.C50480a;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.feed.widget.C50506a;
import com.p2082ss.android.ugc.aweme.feed.widget.C50507b;
import com.p2082ss.android.ugc.aweme.feed.widget.C50516i;
import com.p2082ss.android.ugc.aweme.feed.widget.C50517j;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59253r;
import com.p2082ss.android.ugc.aweme.mix.MixHelperService;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.view.C74147f;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.translation.p4144ui.TranslationStatusView;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80632w;
import com.p2082ss.android.ugc.aweme.views.MentionTextView;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c */
public final class C48593c extends AbstractC48491a<C48593c> {

    /* renamed from: A */
    public static final C48628p f112393A = new C48628p((byte) 0);

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f112394u = {new C89232y(C48593c.class, "videoDescVM", "getVideoDescVM()Lcom/ss/android/ugc/aweme/feed/assem/desc/VideoDescVM;", 0), new C89232y(C48593c.class, "promotedTagVM", "getPromotedTagVM()Lcom/ss/android/ugc/aweme/feed/assem/desc/PromotedTagVM;", 0)};

    /* renamed from: y */
    public static final boolean f112395y;

    /* renamed from: z */
    public static final int f112396z;

    /* renamed from: B */
    private final AbstractC89248d f112397B;

    /* renamed from: C */
    private final AbstractC89248d f112398C;

    /* renamed from: D */
    private final AbstractC89244h f112399D;

    /* renamed from: E */
    private final AbstractC89244h f112400E;

    /* renamed from: F */
    private final AbstractC89244h f112401F;

    /* renamed from: G */
    private final AbstractC89244h f112402G;

    /* renamed from: H */
    private final AbstractC89244h f112403H;

    /* renamed from: I */
    private final AbstractC89244h f112404I;

    /* renamed from: J */
    private final AbstractC89244h f112405J;

    /* renamed from: K */
    private final AbstractC89244h f112406K;

    /* renamed from: L */
    private SparseArray f112407L;

    /* renamed from: v */
    public AbstractC50087aw f112408v;

    /* renamed from: w */
    public C50153bv f112409w;

    /* renamed from: x */
    public final int f112410x;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$e */
    public static final class C48617e extends AbstractC89220m implements AbstractC89172b<C48650l, C48650l> {
        public static final C48617e INSTANCE = new C48617e();

        static {
            Covode.recordClassIndex(57396);
        }

        public C48617e() {
            super(1);
        }

        public final C48650l invoke(C48650l lVar) {
            C89219l.m154719c(lVar, "");
            return lVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$k */
    public static final class C48623k extends AbstractC89220m implements AbstractC89172b<C48592b, C48592b> {
        public static final C48623k INSTANCE = new C48623k();

        static {
            Covode.recordClassIndex(57402);
        }

        public C48623k() {
            super(1);
        }

        public final C48592b invoke(C48592b bVar) {
            C89219l.m154719c(bVar, "");
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$m */
    public static final class C48625m extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {
        public static final C48625m INSTANCE = new C48625m();

        static {
            Covode.recordClassIndex(57404);
        }

        public C48625m() {
            super(1);
        }

        public final C48244cj invoke(C48244cj cjVar) {
            C89219l.m154719c(cjVar, "");
            return cjVar;
        }
    }

    /* renamed from: Q */
    private VideoViewModel m91963Q() {
        return (VideoViewModel) this.f112399D.getValue();
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.t0;
    }

    /* renamed from: G */
    public final VideoDescVM mo80597G() {
        return (VideoDescVM) this.f112397B.mo23374a(this, f112394u[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f112407L == null) {
            this.f112407L = new SparseArray();
        }
        View view = (View) this.f112407L.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f112407L.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: I */
    public final MentionTextView mo80598I() {
        return (MentionTextView) this.f112400E.getValue();
    }

    /* renamed from: J */
    public final TuxTextView mo80599J() {
        return (TuxTextView) this.f112401F.getValue();
    }

    /* renamed from: K */
    public final TuxTextView mo80600K() {
        return (TuxTextView) this.f112402G.getValue();
    }

    /* renamed from: L */
    public final TuxTag mo80601L() {
        return (TuxTag) this.f112403H.getValue();
    }

    /* renamed from: M */
    public final TranslationStatusView mo80602M() {
        return (TranslationStatusView) this.f112404I.getValue();
    }

    /* renamed from: N */
    public final LinearLayout mo80603N() {
        return (LinearLayout) this.f112405J.getValue();
    }

    /* renamed from: O */
    public final FrameLayout mo80604O() {
        return (FrameLayout) this.f112406K.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$p */
    public static final class C48628p {
        static {
            Covode.recordClassIndex(57407);
        }

        private C48628p() {
        }

        public /* synthetic */ C48628p(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$b */
    public static final class C48614b extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112431a;

        static {
            Covode.recordClassIndex(57393);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48614b(AbstractC12693u uVar) {
            super(0);
            this.f112431a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f112431a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$f */
    public static final class C48618f extends AbstractC89220m implements AbstractC89171a<C12874b<C48650l>> {
        public static final C48618f INSTANCE = new C48618f();

        static {
            Covode.recordClassIndex(57397);
        }

        public C48618f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48650l> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$g */
    public static final class C48619g extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112434a;

        static {
            Covode.recordClassIndex(57398);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48619g(AbstractC12693u uVar) {
            super(0);
            this.f112434a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f112434a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$l */
    public static final class C48624l extends AbstractC89220m implements AbstractC89171a<C12874b<C48592b>> {
        public static final C48624l INSTANCE = new C48624l();

        static {
            Covode.recordClassIndex(57403);
        }

        public C48624l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48592b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$n */
    public static final class C48626n extends AbstractC89220m implements AbstractC89171a<C12874b<C48244cj>> {
        public static final C48626n INSTANCE = new C48626n();

        static {
            Covode.recordClassIndex(57405);
        }

        public C48626n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48244cj> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$o */
    public static final class C48627o extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48627o INSTANCE = new C48627o();

        static {
            Covode.recordClassIndex(57406);
        }

        public C48627o() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$v */
    static final class RunnableC48636v implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C48593c f112451a;

        static {
            Covode.recordClassIndex(57415);
        }

        RunnableC48636v(C48593c cVar) {
            this.f112451a = cVar;
        }

        public final void run() {
            this.f112451a.mo80605P();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$aa */
    static final class C48595aa extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C48593c f112412a;

        static {
            Covode.recordClassIndex(57374);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48595aa(C48593c cVar) {
            super(0);
            this.f112412a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f112412a.mo20546C().findViewById(R.id.f68);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$ab */
    static final class C48596ab extends AbstractC89220m implements AbstractC89171a<MentionTextView> {

        /* renamed from: a */
        final /* synthetic */ C48593c f112413a;

        static {
            Covode.recordClassIndex(57375);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48596ab(C48593c cVar) {
            super(0);
            this.f112413a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MentionTextView invoke() {
            return this.f112413a.mo20546C().findViewById(R.id.ajd);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$ac */
    static final class C48597ac extends AbstractC89220m implements AbstractC89171a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ C48593c f112414a;

        static {
            Covode.recordClassIndex(57376);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48597ac(C48593c cVar) {
            super(0);
            this.f112414a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FrameLayout invoke() {
            return this.f112414a.mo20546C().findViewById(R.id.ajk);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$ad */
    static final class C48598ad extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C48593c f112415a;

        static {
            Covode.recordClassIndex(57377);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48598ad(C48593c cVar) {
            super(0);
            this.f112415a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return this.f112415a.mo20546C().findViewById(R.id.ajv);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$ae */
    static final class C48599ae extends AbstractC89220m implements AbstractC89171a<TranslationStatusView> {

        /* renamed from: a */
        final /* synthetic */ C48593c f112416a;

        static {
            Covode.recordClassIndex(57378);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48599ae(C48593c cVar) {
            super(0);
            this.f112416a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TranslationStatusView invoke() {
            return this.f112416a.mo20546C().findViewById(R.id.eng);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$aq */
    static final class C48611aq extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C48593c f112428a;

        static {
            Covode.recordClassIndex(57390);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48611aq(C48593c cVar) {
            super(0);
            this.f112428a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f112428a.mo20546C().findViewById(R.id.d_m);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$as */
    static final class C48613as extends AbstractC89220m implements AbstractC89171a<TuxTag> {

        /* renamed from: a */
        final /* synthetic */ C48593c f112430a;

        static {
            Covode.recordClassIndex(57392);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48613as(C48593c cVar) {
            super(0);
            this.f112430a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTag invoke() {
            return this.f112430a.mo20546C().findViewById(R.id.emr);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$c */
    public static final class C48615c extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112432a;

        static {
            Covode.recordClassIndex(57394);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48615c(AbstractC12693u uVar) {
            super(0);
            this.f112432a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f112432a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$d */
    public static final class C48616d extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112433a;

        static {
            Covode.recordClassIndex(57395);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48616d(AbstractC12693u uVar) {
            super(0);
            this.f112433a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f112433a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$h */
    public static final class C48620h extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112435a;

        static {
            Covode.recordClassIndex(57399);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48620h(AbstractC12693u uVar) {
            super(0);
            this.f112435a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f112435a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$i */
    public static final class C48621i extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112436a;

        static {
            Covode.recordClassIndex(57400);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48621i(AbstractC12693u uVar) {
            super(0);
            this.f112436a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f112436a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$u */
    static final class RunnableC48635u implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C48593c f112449a;

        /* renamed from: b */
        final /* synthetic */ VideoItemParams f112450b;

        static {
            Covode.recordClassIndex(57414);
        }

        RunnableC48635u(C48593c cVar, VideoItemParams videoItemParams) {
            this.f112449a = cVar;
            this.f112450b = videoItemParams;
        }

        public final void run() {
            this.f112449a.mo80611b(this.f112450b.mAweme);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a, com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final void mo20466a() {
        mo80597G().mo80587a((Context) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$a */
    public static final class C48594a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f112411a;

        static {
            Covode.recordClassIndex(57373);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48594a(AbstractC89277c cVar) {
            super(0);
            this.f112411a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f112411a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$j */
    public static final class C48622j extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f112437a;

        static {
            Covode.recordClassIndex(57401);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48622j(AbstractC89277c cVar) {
            super(0);
            this.f112437a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f112437a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$s */
    static final class RunnableC48633s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C48593c f112447a;

        static {
            Covode.recordClassIndex(57412);
        }

        RunnableC48633s(C48593c cVar) {
            this.f112447a = cVar;
        }

        public final void run() {
            if (this.f112447a.mo80603N() != null) {
                this.f112447a.mo80603N().invalidate();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$w */
    static final class RunnableC48637w implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C48593c f112452a;

        /* renamed from: b */
        final /* synthetic */ VideoItemParams f112453b;

        static {
            Covode.recordClassIndex(57416);
        }

        RunnableC48637w(C48593c cVar, VideoItemParams videoItemParams) {
            this.f112452a = cVar;
            this.f112453b = videoItemParams;
        }

        public final void run() {
            C48593c cVar = this.f112452a;
            Aweme aweme = this.f112453b.mAweme;
            C89219l.m154716b(aweme, "");
            C89219l.m154716b(this.f112453b.mEventType, "");
            int i = this.f112453b.mPageType;
            cVar.mo80609a(aweme);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$r */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC48630r implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C48593c f112442a;

        /* renamed from: b */
        final /* synthetic */ Aweme f112443b;

        static {
            Covode.recordClassIndex(57409);
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$r$b */
        static final class RunnableC48632b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC48630r f112446a;

            static {
                Covode.recordClassIndex(57411);
            }

            RunnableC48632b(ViewTreeObserver$OnGlobalLayoutListenerC48630r rVar) {
                this.f112446a = rVar;
            }

            public final void run() {
                MentionTextView I = this.f112446a.f112442a.mo80598I();
                C89219l.m154716b(I, "");
                if (I.getLineCount() != 0) {
                    MentionTextView I2 = this.f112446a.f112442a.mo80598I();
                    MentionTextView I3 = this.f112446a.f112442a.mo80598I();
                    C89219l.m154716b(I3, "");
                    I2.setLines(I3.getLineCount());
                    this.f112446a.f112442a.mo80610a(false);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$r$a */
        static final class RunnableC48631a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC48630r f112444a;

            /* renamed from: b */
            final /* synthetic */ int f112445b;

            static {
                Covode.recordClassIndex(57410);
            }

            RunnableC48631a(ViewTreeObserver$OnGlobalLayoutListenerC48630r rVar, int i) {
                this.f112444a = rVar;
                this.f112445b = i;
            }

            public final void run() {
                VideoDescVM G = this.f112444a.f112442a.mo80597G();
                MentionTextView I = this.f112444a.f112442a.mo80598I();
                C89219l.m154716b(I, "");
                G.f112362A = I.getHeight();
                VideoDescVM G2 = this.f112444a.f112442a.mo80597G();
                int i = this.f112444a.f112442a.mo80597G().f112362A * this.f112445b;
                this.f112444a.f112442a.mo80597G();
                G2.f112373z = i / VideoDescVM.m91948a(this.f112444a.f112443b);
                if (!(!C48593c.f112395y || ((VideoItemParams) C12661l.m22797a(this.f112444a.f112442a)).mAweme == null || this.f112444a.f112442a.mo80602M() == null)) {
                    TranslationStatusView M = this.f112444a.f112442a.mo80602M();
                    C89219l.m154716b(M, "");
                    if (M.getVisibility() == 0) {
                        TranslationStatusView M2 = this.f112444a.f112442a.mo80602M();
                        C89219l.m154716b(M2, "");
                        if (M2.getStatus() == 0) {
                            ((VideoItemParams) C12661l.m22797a(this.f112444a.f112442a)).mAweme.setDescLines(this.f112445b);
                            ((VideoItemParams) C12661l.m22797a(this.f112444a.f112442a)).mAweme.setDescTruncatedTextHeight(this.f112444a.f112442a.mo80597G().f112362A);
                            ((VideoItemParams) C12661l.m22797a(this.f112444a.f112442a)).mAweme.setDescFullTextHeight(this.f112444a.f112442a.mo80597G().f112373z);
                        }
                    }
                }
                this.f112444a.f112442a.mo80610a(true);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:52:0x027f, code lost:
            if (r0.getLineCount() != r5) goto L_0x0281;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x029a, code lost:
            if (r20.f112443b.isAd() == false) goto L_0x02d7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
            r0 = r20.f112442a.mo80598I();
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
            r14 = r5 - 1;
            r13 = r0.getLayout().getLineEnd(r14);
            r0 = r20.f112442a.mo80598I();
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
            r12 = (float) r0.getWidth();
            r0 = r20.f112442a.mo80598I();
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
            r11 = r0.getPaint();
            r0 = r20.f112442a.mo80598I();
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
            r9 = r0.getText();
            r0 = r20.f112442a.mo80598I();
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
            r12 = r12 - r11.measureText(r9, r0.getLayout().getLineStart(r14), r13);
            r0 = r20.f112442a.mo80598I();
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
            r16 = r0.getPaint().measureText(r10);
            r0 = r20.f112442a.mo80598I();
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
            r16 = r16 - r0.getPaint().measureText("...");
            r11 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x034f, code lost:
            if (r12 >= r16) goto L_0x03cf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            r11 = r11.subSequence(0, r13 - r10.length());
            r20.f112442a.mo80607a(new android.text.SpannableStringBuilder(r11).append((java.lang.CharSequence) "..."));
            r0 = r20.f112442a.mo80598I();
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0376, code lost:
            if (r0.getLineCount() != r5) goto L_0x03cf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0378, code lost:
            r0 = r20.f112442a.mo80598I();
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
            r13 = r0.getLayout().getLineEnd(r14);
            r0 = r20.f112442a.mo80598I();
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
            r12 = (float) r0.getWidth();
            r0 = r20.f112442a.mo80598I();
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
            r15 = r0.getPaint();
            r0 = r20.f112442a.mo80598I();
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
            r9 = r0.getText();
            r0 = r20.f112442a.mo80598I();
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
            r12 = r12 - r15.measureText(r9, r0.getLayout().getLineStart(r14), r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x03c8, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x03ca, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x03cb, code lost:
            r11 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x03cc, code lost:
            com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a.m95786a(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x03d3, code lost:
            if (android.text.TextUtils.equals(r11, r6) == false) goto L_0x03d5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x03d5, code lost:
            r6 = new android.text.SpannableStringBuilder(r11).append((java.lang.CharSequence) "...");
            p4600h.p4611f.p4613b.C89219l.m154716b(r6, "");
         */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x0483  */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x04cd  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x0516  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x01b1  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0249  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0272  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0285  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x02b3  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x03d5  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0414  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x044b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onGlobalLayout() {
            /*
            // Method dump skipped, instructions count: 1338
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.desc.C48593c.ViewTreeObserver$OnGlobalLayoutListenerC48630r.onGlobalLayout():void");
        }

        ViewTreeObserver$OnGlobalLayoutListenerC48630r(C48593c cVar, Aweme aweme) {
            this.f112442a = cVar;
            this.f112443b = aweme;
        }
    }

    static {
        int i;
        Covode.recordClassIndex(57372);
        boolean a = C50480a.m94644a();
        f112395y = a;
        if (!a) {
            i = 12;
        } else if (C49525p.m92764d()) {
            i = Integer.MAX_VALUE;
        } else {
            i = 10;
        }
        f112396z = i;
    }

    /* renamed from: P */
    public final void mo80605P() {
        try {
            if (C80471gb.m139483a(az_())) {
                MentionTextView I = mo80598I();
                C89219l.m154716b(I, "");
                I.setMovementMethod(C50516i.m94696a());
            } else {
                MentionTextView I2 = mo80598I();
                C89219l.m154716b(I2, "");
                I2.setMovementMethod(C50506a.m94687a());
            }
            if (C80471gb.m139483a(az_())) {
                if (f112395y) {
                    MentionTextView I3 = mo80598I();
                    C89219l.m154716b(I3, "");
                    I3.setMovementMethod(C50517j.C50518a.m94697a());
                    return;
                }
                MentionTextView I4 = mo80598I();
                C89219l.m154716b(I4, "");
                I4.setMovementMethod(C50516i.m94696a());
            } else if (f112395y) {
                MentionTextView I5 = mo80598I();
                C89219l.m154716b(I5, "");
                I5.setMovementMethod(C50507b.C50508a.m94688a());
            } else {
                MentionTextView I6 = mo80598I();
                C89219l.m154716b(I6, "");
                I6.setMovementMethod(C50506a.m94687a());
            }
        } catch (IndexOutOfBoundsException e) {
            C51423a.m95788a("", e);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        /*
            r6 = this;
            h.h.d r2 = r6.f112398C
            h.k.i[] r1 = com.p2082ss.android.ugc.aweme.feed.assem.desc.C48593c.f112394u
            r0 = 1
            r0 = r1[r0]
            java.lang.Object r1 = r2.mo23374a(r6, r0)
            com.ss.android.ugc.aweme.feed.assem.desc.PromotedTagVM r1 = (com.p2082ss.android.ugc.aweme.feed.assem.desc.PromotedTagVM) r1
            com.ss.android.ugc.aweme.feed.assem.desc.c$af r0 = com.p2082ss.android.ugc.aweme.feed.assem.desc.C48593c.C48600af.f112417a
            com.bytedance.assem.arch.viewModel.AbstractC12818f.C12819a.m23061a(r6, r1, r0)
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r1 = r6.mo80597G()
            h.k.k r2 = com.p2082ss.android.ugc.aweme.feed.assem.desc.C48643e.f112466a
            com.bytedance.assem.arch.viewModel.k r3 = com.bytedance.assem.arch.viewModel.C12856l.m23104c()
            com.ss.android.ugc.aweme.feed.assem.desc.c$ah r4 = com.p2082ss.android.ugc.aweme.feed.assem.desc.C48593c.C48602ah.f112419a
            r5 = 4
            r0 = r6
            com.bytedance.assem.arch.viewModel.AbstractC12818f.C12819a.m23063a(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r1 = r6.mo80597G()
            h.k.k r2 = com.p2082ss.android.ugc.aweme.feed.assem.desc.C48644f.f112467a
            com.ss.android.ugc.aweme.feed.assem.desc.c$ai r4 = com.p2082ss.android.ugc.aweme.feed.assem.desc.C48593c.C48603ai.f112420a
            r3 = 0
            r5 = 6
            com.bytedance.assem.arch.viewModel.AbstractC12818f.C12819a.m23063a(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r1 = r6.mo80597G()
            h.k.k r2 = com.p2082ss.android.ugc.aweme.feed.assem.desc.C48645g.f112468a
            com.bytedance.assem.arch.viewModel.k r3 = com.bytedance.assem.arch.viewModel.C12856l.m23104c()
            com.ss.android.ugc.aweme.feed.assem.desc.c$aj r4 = com.p2082ss.android.ugc.aweme.feed.assem.desc.C48593c.C48604aj.f112421a
            r5 = 4
            com.bytedance.assem.arch.viewModel.AbstractC12818f.C12819a.m23063a(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r1 = r6.mo80597G()
            h.k.k r2 = com.p2082ss.android.ugc.aweme.feed.assem.desc.C48646h.f112469a
            com.bytedance.assem.arch.viewModel.k r3 = com.bytedance.assem.arch.viewModel.C12856l.m23104c()
            com.ss.android.ugc.aweme.feed.assem.desc.c$ak r4 = com.p2082ss.android.ugc.aweme.feed.assem.desc.C48593c.C48605ak.f112422a
            com.bytedance.assem.arch.viewModel.AbstractC12818f.C12819a.m23063a(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r1 = r6.mo80597G()
            h.k.k r2 = com.p2082ss.android.ugc.aweme.feed.assem.desc.C48642d.f112465a
            com.bytedance.assem.arch.viewModel.k r3 = com.bytedance.assem.arch.viewModel.C12856l.m23103b()
            com.ss.android.ugc.aweme.feed.assem.desc.c$ag r4 = com.p2082ss.android.ugc.aweme.feed.assem.desc.C48593c.C48601ag.f112418a
            com.bytedance.assem.arch.viewModel.AbstractC12818f.C12819a.m23063a(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.desc.C48593c.mo20533y():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$y */
    public static final class C48639y extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C48593c f112457a;

        /* renamed from: b */
        final /* synthetic */ boolean f112458b;

        /* renamed from: c */
        final /* synthetic */ VideoItemParams f112459c;

        /* renamed from: d */
        final /* synthetic */ int f112460d;

        /* renamed from: e */
        final /* synthetic */ int f112461e;

        /* renamed from: f */
        final /* synthetic */ int f112462f;

        static {
            Covode.recordClassIndex(57418);
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$y$a */
        static final class RunnableC48640a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C48639y f112463a;

            static {
                Covode.recordClassIndex(57419);
            }

            RunnableC48640a(C48639y yVar) {
                this.f112463a = yVar;
            }

            public final void run() {
                int lineCount;
                MentionTextView I = this.f112463a.f112457a.mo80598I();
                if (!C48593c.f112395y) {
                    MentionTextView I2 = this.f112463a.f112457a.mo80598I();
                    C89219l.m154716b(I2, "");
                    lineCount = I2.getLineCount();
                } else if (!C49525p.m92764d() || this.f112463a.f112460d == 0) {
                    int i = C48593c.f112396z;
                    MentionTextView I3 = this.f112463a.f112457a.mo80598I();
                    C89219l.m154716b(I3, "");
                    lineCount = Math.min(i, I3.getLineCount());
                } else {
                    int i2 = this.f112463a.f112461e;
                    TuxTextView J = this.f112463a.f112457a.mo80599J();
                    C89219l.m154716b(J, "");
                    int height = i2 + J.getHeight();
                    this.f112463a.f112457a.mo80597G();
                    Aweme aweme = this.f112463a.f112459c.mAweme;
                    C89219l.m154716b(aweme, "");
                    int a = (height * VideoDescVM.m91948a(aweme)) / this.f112463a.f112460d;
                    MentionTextView I4 = this.f112463a.f112457a.mo80598I();
                    C89219l.m154716b(I4, "");
                    lineCount = Math.min(a, I4.getLineCount());
                }
                I.setLines(lineCount);
            }
        }

        public final void onAnimationStart(Animator animator) {
            AbstractC50087aw awVar;
            C89219l.m154721d(animator, "");
            if (this.f112458b) {
                this.f112457a.mo80599J().setText(R.string.bu_);
            } else {
                this.f112457a.mo80599J().setText(R.string.bua);
            }
            this.f112457a.mo80599J().setVisibility(4);
            if (C49525p.m92764d() && (awVar = this.f112457a.f112408v) != null) {
                awVar.mo80221h(this.f112458b);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            AbstractC50087aw awVar;
            int transDescLines;
            C89219l.m154721d(animator, "");
            if (this.f112458b) {
                if (this.f112459c.mAweme.getTransDescLines() != 0) {
                    TranslationStatusView M = this.f112457a.mo80602M();
                    C89219l.m154716b(M, "");
                    if (M.getVisibility() == 0) {
                        TranslationStatusView M2 = this.f112457a.mo80602M();
                        C89219l.m154716b(M2, "");
                        if (M2.getStatus() == 2) {
                            MentionTextView I = this.f112457a.mo80598I();
                            if (C48593c.f112395y) {
                                transDescLines = Math.min(C48593c.f112396z, this.f112459c.mAweme.getTransDescLines());
                            } else {
                                transDescLines = this.f112459c.mAweme.getTransDescLines();
                            }
                            I.setLines(transDescLines);
                        }
                    }
                }
                this.f112457a.mo80598I().post(new RunnableC48640a(this));
            } else {
                if (C48593c.f112395y) {
                    this.f112457a.mo80598I().scrollTo(0, 0);
                }
                MentionTextView I2 = this.f112457a.mo80598I();
                C89219l.m154716b(I2, "");
                if (I2.getText().length() > 0) {
                    MentionTextView I3 = this.f112457a.mo80598I();
                    this.f112457a.mo80597G();
                    Aweme aweme = this.f112459c.mAweme;
                    C89219l.m154716b(aweme, "");
                    I3.setLines(VideoDescVM.m91948a(aweme));
                } else {
                    MentionTextView I4 = this.f112457a.mo80598I();
                    C89219l.m154716b(I4, "");
                    I4.setMaxLines(this.f112462f);
                }
            }
            this.f112457a.mo80599J().setVisibility(0);
            if (C48022b.m91033b() != 0 && C48593c.f112395y && C49525p.m92762b() && (awVar = this.f112457a.f112408v) != null) {
                awVar.mo80221h(this.f112458b);
            }
        }

        C48639y(C48593c cVar, boolean z, VideoItemParams videoItemParams, int i, int i2, int i3) {
            this.f112457a = cVar;
            this.f112458b = z;
            this.f112459c = videoItemParams;
            this.f112460d = i;
            this.f112461e = i2;
            this.f112462f = i3;
        }
    }

    public C48593c() {
        AbstractC12848i.C12851c cVar = AbstractC12848i.C12851c.f31277a;
        AbstractC89277c a = C89204ab.m154669a(VideoDescVM.class);
        this.f112397B = C14530k.m26542a(this, a, cVar == null ? AbstractC12848i.C12851c.f31277a : cVar, new C48594a(a), C48618f.INSTANCE, new C48619g(this), C48617e.INSTANCE, null, null, new C48620h(this), new C48621i(this));
        AbstractC12848i.C12851c cVar2 = AbstractC12848i.C12851c.f31277a;
        AbstractC89277c a2 = C89204ab.m154669a(PromotedTagVM.class);
        this.f112398C = C14530k.m26542a(this, a2, cVar2 == null ? AbstractC12848i.C12851c.f31277a : cVar2, new C48622j(a2), C48624l.INSTANCE, new C48614b(this), C48623k.INSTANCE, null, null, new C48615c(this), new C48616d(this));
        this.f112399D = new C14524g(C89204ab.m154669a(VideoViewModel.class), this, C48626n.INSTANCE, C48627o.INSTANCE, C48625m.INSTANCE);
        this.f112400E = C89250i.m154773a((AbstractC89171a) new C48596ab(this));
        this.f112401F = C89250i.m154773a((AbstractC89171a) new C48595aa(this));
        this.f112402G = C89250i.m154773a((AbstractC89171a) new C48611aq(this));
        this.f112403H = C89250i.m154773a((AbstractC89171a) new C48613as(this));
        this.f112404I = C89250i.m154773a((AbstractC89171a) new C48599ae(this));
        this.f112405J = C89250i.m154773a((AbstractC89171a) new C48598ad(this));
        this.f112406K = C89250i.m154773a((AbstractC89171a) new C48597ac(this));
        this.f112410x = AVExternalServiceImpl.m113114a().publishService().getAddVideosExperiConsuSideCode();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a, com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: b */
    public final /* synthetic */ void mo20469b(VideoItemParams videoItemParams) {
        mo20469b(videoItemParams);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$am */
    static final class View$OnClickListenerC48607am implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48593c f112424a;

        static {
            Covode.recordClassIndex(57386);
        }

        View$OnClickListenerC48607am(C48593c cVar) {
            this.f112424a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f112424a.mo80597G().mo80591j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$q */
    public static final class C48629q extends AbstractC50109bf {

        /* renamed from: c */
        private final WeakReference<C48593c> f112438c;

        /* renamed from: d */
        private final SpannableStringBuilder f112439d;

        /* renamed from: e */
        private final boolean f112440e;

        /* renamed from: f */
        private final boolean f112441f;

        static {
            Covode.recordClassIndex(57408);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(-1);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            C48593c cVar = this.f112438c.get();
            if (cVar == null) {
                return;
            }
            if (this.f112441f) {
                cVar.mo80597G().mo80591j();
                return;
            }
            VideoDescVM G = cVar.mo80597G();
            SpannableStringBuilder spannableStringBuilder = this.f112439d;
            boolean z = this.f112440e;
            TranslationStatusView M = cVar.mo80602M();
            C89219l.m154716b(M, "");
            int visibility = M.getVisibility();
            TranslationStatusView M2 = cVar.mo80602M();
            C89219l.m154716b(M2, "");
            G.mo80588a(spannableStringBuilder, z, visibility, M2.getStatus());
        }

        public C48629q(C48593c cVar, SpannableStringBuilder spannableStringBuilder, boolean z, boolean z2) {
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(spannableStringBuilder, "");
            this.f112439d = spannableStringBuilder;
            this.f112440e = z;
            this.f112441f = z2;
            this.f112438c = new WeakReference<>(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$ar */
    public static final class C48612ar implements MentionTextView.AbstractC81407d {

        /* renamed from: a */
        final /* synthetic */ C48593c f112429a;

        static {
            Covode.recordClassIndex(57391);
        }

        C48612ar(C48593c cVar) {
            this.f112429a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.MentionTextView.AbstractC81407d
        /* renamed from: a */
        public final boolean mo59077a(TextExtraStruct textExtraStruct) {
            C89219l.m154721d(textExtraStruct, "");
            if (this.f112429a.f112410x == 0 && textExtraStruct.getType() == 5) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$al */
    static final class View$OnClickListenerC48606al implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48593c f112423a;

        static {
            Covode.recordClassIndex(57385);
        }

        View$OnClickListenerC48606al(C48593c cVar) {
            this.f112423a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            VideoDescVM G = this.f112423a.mo80597G();
            TuxTextView J = this.f112423a.mo80599J();
            C89219l.m154716b(J, "");
            String obj = J.getText().toString();
            TranslationStatusView M = this.f112423a.mo80602M();
            C89219l.m154716b(M, "");
            int visibility = M.getVisibility();
            TranslationStatusView M2 = this.f112423a.mo80602M();
            C89219l.m154716b(M2, "");
            G.mo80589a(obj, visibility, M2.getStatus());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$z */
    static final class C48641z implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C48593c f112464a;

        static {
            Covode.recordClassIndex(57420);
        }

        C48641z(C48593c cVar) {
            this.f112464a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154721d(valueAnimator, "");
            this.f112464a.mo80599J().setVisibility(0);
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            this.f112464a.mo80599J().setHeight(((Integer) animatedValue).intValue());
        }
    }

    /* renamed from: a */
    public final void mo80609a(Aweme aweme) {
        MentionTextView I = mo80598I();
        C89219l.m154716b(I, "");
        I.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC48630r(this, aweme));
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$x */
    static final class C48638x implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C48593c f112454a;

        /* renamed from: b */
        final /* synthetic */ boolean f112455b;

        /* renamed from: c */
        final /* synthetic */ int f112456c;

        static {
            Covode.recordClassIndex(57417);
        }

        C48638x(C48593c cVar, boolean z, int i) {
            this.f112454a = cVar;
            this.f112455b = z;
            this.f112456c = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AbstractC50087aw awVar;
            C89219l.m154721d(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            if (intValue > 0) {
                MentionTextView I = this.f112454a.mo80598I();
                C89219l.m154716b(I, "");
                I.setHeight(intValue);
                if (C48593c.f112395y) {
                    if (this.f112455b) {
                        this.f112454a.mo80604O().getLayoutParams().height = intValue + this.f112456c;
                    } else {
                        this.f112454a.mo80604O().getLayoutParams().height = intValue;
                    }
                    if (C49525p.m92763c() && (awVar = this.f112454a.f112408v) != null) {
                        awVar.mo80221h(this.f112455b);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        if (mo80597G().f112366l) {
            mo80598I().setFontSize(5);
        }
        TuxTextView J = mo80599J();
        C89219l.m154716b(J, "");
        J.setTextSize(15.0f);
        mo80599J().setOnClickListener(new View$OnClickListenerC48606al(this));
        mo80603N().setOnClickListener(new View$OnClickListenerC48607am(this));
        AbstractC12818f.C12819a.m23063a(this, m91963Q(), C48647i.f112470a, C12856l.m23100a(), C48608an.f112425a, 4);
        AbstractC12818f.C12819a.m23063a(this, m91963Q(), C48648j.f112471a, C12856l.m23100a(), C48609ao.f112426a, 4);
        AbstractC12818f.C12819a.m23063a(this, m91963Q(), C48649k.f112472a, C12856l.m23100a(), C48610ap.f112427a, 4);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* renamed from: a */
    public final void mo80607a(SpannableStringBuilder spannableStringBuilder) {
        Aweme aweme;
        Aweme aweme2;
        if (spannableStringBuilder == 0) {
            spannableStringBuilder = "";
        }
        try {
            CharSequence charSequence = (CharSequence) spannableStringBuilder;
            if (C49495aa.m92734a()) {
                C51423a.m95791b(4, "VideoDescView", "VideoDescView_setDescSafely desc:" + charSequence);
            }
            if (f112395y) {
                VideoItemParams videoItemParams = (VideoItemParams) mo80597G().mo23342g();
                if (videoItemParams != null && (aweme2 = videoItemParams.mAweme) != null) {
                    mo80598I().mo124997a(charSequence, aweme2.getDescLanguage());
                    return;
                }
                return;
            }
            VideoItemParams videoItemParams2 = (VideoItemParams) mo80597G().mo23342g();
            if (videoItemParams2 != null && (aweme = videoItemParams2.mAweme) != null) {
                if (aweme.isAd()) {
                    mo80598I().setText(charSequence);
                } else {
                    mo80598I().mo124997a(charSequence, aweme.getDescLanguage());
                }
            }
        } catch (Exception e) {
            C51423a.m95786a(e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: a */
    public final void mo80495a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
        mo80597G().mo80587a(az_());
        this.f112408v = videoItemParams.videoDescViewHost;
    }

    /* renamed from: b */
    public final void mo80611b(Aweme aweme) {
        VideoItemParams videoItemParams;
        Context az_;
        if (!(aweme == null || (videoItemParams = (VideoItemParams) mo80597G().mo23342g()) == null || (az_ = az_()) == null)) {
            if (!aweme.isScheduleVideo()) {
                mo80598I().mo124999a(aweme.getTextExtra(), new C74147f(), new C48612ar(this));
            }
            ICommerceChallengeService e = CommerceChallengeServiceImpl.m75741e();
            MentionTextView I = mo80598I();
            C89219l.m154716b(I, "");
            e.mo65385a(I, aweme, videoItemParams.mEventType);
            if (aweme.getTextExtra() != null && !TextUtils.isEmpty(aweme.getDesc())) {
                for (TextExtraStruct textExtraStruct : aweme.getTextExtra()) {
                    VideoDescVM G = mo80597G();
                    C89219l.m154716b(textExtraStruct, "");
                    if ((G.mo80590a(textExtraStruct) && textExtraStruct.getType() == 0 && ((!TextUtils.isEmpty(textExtraStruct.getAwemeId()) || 2 == textExtraStruct.getSubtype()) && aweme.getDesc().charAt(textExtraStruct.getStart()) == '@')) || (mo80597G().mo80590a(textExtraStruct) && this.f112410x == 1 && textExtraStruct.getType() == 5 && !TextUtils.isEmpty(textExtraStruct.getAwemeId()))) {
                        C37593d dVar = new C37593d(az_, (float) Math.round(((float) C13628n.m24504a(az_)) - (C13628n.m24520b(az_, 100.0f) + az_.getResources().getDimension(R.dimen.g5))), C0643b.m2378c(az_, R.color.a7), -1, textExtraStruct);
                        dVar.f88862b = C13628n.m24520b(az_, 12.0f);
                        dVar.f88863c = C13628n.m24520b(az_, 2.0f);
                        dVar.f88861a = C13628n.m24520b(az_, 13.0f);
                        mo80598I().mo124996a(textExtraStruct.getStart(), textExtraStruct.getEnd(), dVar);
                        VideoDescVM G2 = mo80597G();
                        C89219l.m154721d(textExtraStruct, "");
                        VideoItemParams videoItemParams2 = (VideoItemParams) G2.mo23342g();
                        if (videoItemParams2 != null && 4 == textExtraStruct.getSubtype()) {
                            Map<String, String> map = new C33744d().mo59983a("enter_from", videoItemParams2.mEventType).mo59983a("group_id", videoItemParams2.mAweme.getAid()).mo59983a("author_id", videoItemParams2.mAweme.getAuthorUid()).mo59983a("music_id", C59208ac.m108770d(videoItemParams2.mAweme)).f79943a;
                            C89219l.m154716b(map, "");
                            C39162r.m79460a("duet_with_show", map);
                        }
                    }
                }
            }
            mo80598I().setAdHashTag(aweme);
        }
    }

    /* renamed from: a */
    public final void mo80610a(boolean z) {
        VideoItemParams videoItemParams;
        Aweme aweme;
        boolean z2;
        boolean z3;
        int i;
        Context az_ = az_();
        if (az_ != null && (videoItemParams = (VideoItemParams) mo80597G().mo23342g()) != null && (aweme = videoItemParams.mAweme) != null && aweme.getDesc() != null) {
            boolean a = C80471gb.m139483a(az_);
            boolean a2 = C0671a.m2407a().mo2695a(videoItemParams.mAweme.getDesc());
            int i2 = 1;
            boolean z4 = false;
            if (a != a2) {
                z2 = true;
            } else {
                z2 = false;
            }
            try {
                MentionTextView I = mo80598I();
                C89219l.m154716b(I, "");
                ViewGroup.LayoutParams layoutParams = I.getLayoutParams();
                if (layoutParams != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    if (z) {
                        if (!mo80597G().f112369v) {
                            if (z2) {
                                if (mo80597G().f112370w) {
                                    return;
                                }
                            } else if (!mo80597G().f112370w) {
                                return;
                            }
                        }
                        mo80597G().f112369v = false;
                        VideoDescVM G = mo80597G();
                        if (!mo80597G().f112370w) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        G.f112370w = z3;
                        MentionTextView I2 = mo80598I();
                        if (!a2) {
                            i2 = 0;
                        }
                        C0792v.m2759b((View) I2, i2);
                        TuxTextView J = mo80599J();
                        C89219l.m154716b(J, "");
                        ViewGroup.LayoutParams layoutParams3 = J.getLayoutParams();
                        if (layoutParams3 != null) {
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                            if (a2) {
                                i = 83;
                            } else {
                                i = 85;
                            }
                            layoutParams4.gravity = i;
                            layoutParams4.leftMargin = C34728n.m70946a(15.0d);
                            int i3 = Build.VERSION.SDK_INT;
                            layoutParams4.setMarginStart((int) C13628n.m24520b(az_, 15.0f));
                            TuxTextView J2 = mo80599J();
                            C89219l.m154716b(J2, "");
                            J2.setLayoutParams(layoutParams4);
                            z4 = z2;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                    } else if (C0792v.m2768e(mo80598I()) != a) {
                        mo80597G().f112369v = true;
                        MentionTextView I3 = mo80598I();
                        if (!a) {
                            i2 = 0;
                        }
                        C0792v.m2759b((View) I3, i2);
                    } else {
                        return;
                    }
                    if (z4) {
                        layoutParams2.rightMargin = C34728n.m70946a(15.0d);
                        layoutParams2.leftMargin = C34728n.m70946a(0.0d);
                        int i4 = Build.VERSION.SDK_INT;
                        layoutParams2.setMarginEnd((int) C13628n.m24520b(az_, 15.0f));
                        layoutParams2.setMarginStart((int) C13628n.m24520b(az_, 0.0f));
                    } else {
                        layoutParams2.leftMargin = C34728n.m70946a(15.0d);
                        layoutParams2.rightMargin = C34728n.m70946a(0.0d);
                        int i5 = Build.VERSION.SDK_INT;
                        layoutParams2.setMarginStart((int) C13628n.m24520b(az_, 15.0f));
                        layoutParams2.setMarginEnd((int) C13628n.m24520b(az_, 0.0f));
                    }
                    MentionTextView I4 = mo80598I();
                    C89219l.m154716b(I4, "");
                    I4.setLayoutParams(layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$t */
    static final class C48634t implements MentionTextView.AbstractC81409f {

        /* renamed from: a */
        final /* synthetic */ C48593c f112448a;

        static {
            Covode.recordClassIndex(57413);
        }

        C48634t(C48593c cVar) {
            this.f112448a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.MentionTextView.AbstractC81409f
        /* renamed from: a */
        public final void mo63408a(TextExtraStruct textExtraStruct) {
            Context h;
            boolean z;
            String str;
            String str2;
            String str3;
            boolean z2;
            boolean z3;
            VideoDescVM G = this.f112448a.mo80597G();
            VideoItemParams videoItemParams = (VideoItemParams) G.mo23342g();
            if (videoItemParams != null && (h = G.mo23343h()) != null && textExtraStruct != null) {
                boolean z4 = false;
                String str4 = "";
                if (textExtraStruct.getType() == 1) {
                    CommerceChallengeServiceImpl.m75741e().mo65384a(textExtraStruct);
                    if (CommerceChallengeServiceImpl.m75741e().mo65376a(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false) != null) {
                        CommerceChallengeServiceImpl.m75741e().mo65391b(videoItemParams.mEventType, textExtraStruct.getHashTagName());
                    }
                    String uuid = UUID.randomUUID().toString();
                    C89219l.m154716b(uuid, str4);
                    if (MSAdaptionService.m97895c().mo89377c(h)) {
                        SmartRouter.buildRoute(h, "//duo").withParam("duo_type", "duo_challenge").withParam("aweme_id", videoItemParams.mAweme.getAid()).withParam("id", textExtraStruct.getHashTagName()).withParam("extra_challenge_is_hashtag", true).withParam("extra_challenge_from", videoItemParams.mEventType).open();
                    } else {
                        C18285c.m34003a("cd_start_activity_to_request_net_duration");
                        C18285c.m34003a("cd_start_activity_to_show_header_duration");
                        C18285c.m34003a("cd_start_activity_to_show_list_duration");
                        SmartRouter.buildRoute(h, "//challenge/detail").withParam("aweme_id", videoItemParams.mAweme.getAid()).withParam("id", textExtraStruct.getHashTagName()).withParam("extra_challenge_is_hashtag", true).withParam("process_id", uuid).withParam("extra_challenge_from", videoItemParams.mEventType).open(10086);
                    }
                    C39162r.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName(videoItemParams.mEventType).setValue(videoItemParams.mAweme.getAid()).setExtValueString(textExtraStruct.getCid()));
                    C38000g.m77050a().mo65892d(h, videoItemParams.mAweme);
                    C18129a.m33746a("draw_ad", "challenge_click", videoItemParams.mAweme.getAwemeRawAd()).mo28902c();
                    String searchResultId = FeedParamProvider.C49809a.m93270a(h).getSearchResultId();
                    if (TextUtils.isEmpty(searchResultId)) {
                        searchResultId = C59208ac.m108771e(videoItemParams.mAweme);
                    }
                    if (videoItemParams.mAweme.getBottomBarModel() != null) {
                        z4 = true;
                    }
                    C59253r rVar = (C59253r) new C59253r().mo96827o(videoItemParams.mEventType).mo96740a(h);
                    if (videoItemParams.mAweme.getAuthor() != null) {
                        str4 = videoItemParams.mAweme.getAuthor().getUid();
                    }
                    rVar.f135339p = str4;
                    rVar.f135338e = videoItemParams.mAweme.getAid();
                    C59253r f = rVar.mo96749g(videoItemParams.mAweme);
                    f.f135320X = FeedParamProvider.C49809a.m93270a(h).getPreviousPage();
                    f.f135321Y = FeedParamProvider.C49809a.m93270a(h).getPreviousPagePosition();
                    f.f135322Z = z4;
                    f.f135341r = uuid;
                    C59253r rVar2 = (C59253r) f.mo96802d(C59208ac.m108764b(videoItemParams.mAweme, videoItemParams.mPageType));
                    rVar2.f135340q = textExtraStruct.getCid();
                    C59253r rVar3 = (C59253r) ((C59253r) rVar2.mo96741a("click_in_video_name")).mo96828p(C59208ac.m108759a(videoItemParams.mAweme, videoItemParams.mPageType)).mo96804f(searchResultId).mo96810l(FeedParamProvider.C49809a.m93270a(h).getSearchId());
                    rVar3.f135324ab = FeedParamProvider.C49809a.m93270a(h).getCategoryName();
                    C79900c.m138667a(rVar3.mo96788a(C80632w.m139800a(videoItemParams.mAweme, "enter_tag_detail", videoItemParams.mEventType)), videoItemParams.mAweme, videoItemParams.mEventType).mo96792f();
                    C49907s.m93686a(EnumC48310af.CHALLENGE);
                } else if (textExtraStruct.getType() == 0 && ((!TextUtils.isEmpty(textExtraStruct.getAwemeId()) || 2 == textExtraStruct.getSubtype()) && G.mo80590a(textExtraStruct) && videoItemParams.mAweme.getDesc().charAt(textExtraStruct.getStart()) == '@')) {
                    if (2 == textExtraStruct.getSubtype() || 3 == textExtraStruct.getSubtype()) {
                        Aweme aweme = videoItemParams.mAweme;
                        C89219l.m154716b(aweme, str4);
                        VideoReplyStruct videoReplyStruct = aweme.getVideoReplyStruct();
                        if (videoReplyStruct != null) {
                            if (videoReplyStruct.getAwemeId() != 0) {
                                str2 = String.valueOf(videoReplyStruct.getAwemeId());
                            } else {
                                str2 = str4;
                            }
                            if (videoReplyStruct.getCommentId() != 0) {
                                str3 = String.valueOf(videoReplyStruct.getCommentId());
                            } else {
                                str3 = str4;
                            }
                            if (videoReplyStruct.getAliasCommentId() != 0) {
                                str = String.valueOf(videoReplyStruct.getAliasCommentId());
                            } else {
                                str = str4;
                            }
                        } else {
                            str2 = str4;
                            str3 = str2;
                            str = str3;
                        }
                        if (2 == textExtraStruct.getSubtype()) {
                            C39162r.m79460a("click_comment_chain", new C33744d().mo59983a("enter_from", videoItemParams.mEventType).mo59983a("group_id", videoItemParams.mAweme.getAid()).mo59983a("author_id", videoItemParams.mAweme.getAuthorUid()).mo59983a("to_group_id", str2).mo59983a("reply_comment_id", str3).mo59983a("reply_user_id", textExtraStruct.getUserId()).f79943a);
                        }
                    } else {
                        if (videoItemParams.mAweme.getAwemeType() == 51) {
                            C39162r.m79460a("click_duet_icon", new C33744d().mo59983a("enter_from", videoItemParams.mEventType).mo59983a("group_id", videoItemParams.mAweme.getAid()).mo59983a("author_id", videoItemParams.mAweme.getAuthorUid()).mo59983a("to_group_id", textExtraStruct.getAwemeId()).mo59983a("chain_type", "duet").f79943a);
                        } else if (videoItemParams.mAweme.getAwemeType() == 52) {
                            C39162r.m79460a("click_react_icon", new C33744d().mo59983a("enter_from", videoItemParams.mEventType).mo59983a("group_id", videoItemParams.mAweme.getAid()).mo59983a("author_id", videoItemParams.mAweme.getAuthorUid()).mo59983a("to_group_id", textExtraStruct.getAwemeId()).f79943a);
                        } else if (videoItemParams.mAweme.getAwemeType() == 58) {
                            C39162r.m79460a("click_duet_icon", new C33744d().mo59983a("chain_type", "stitch").mo59983a("enter_from", videoItemParams.mEventType).mo59983a("group_id", videoItemParams.mAweme.getAid()).mo59983a("author_id", videoItemParams.mAweme.getAuthorUid()).mo59983a("to_group_id", textExtraStruct.getAwemeId()).f79943a);
                        }
                        str = str4;
                        str2 = str;
                        str3 = str2;
                    }
                    if (!VideoDescVM.m91949i()) {
                        new C79459a(h).mo123050a(R.string.dcq).mo123053a();
                    } else if (2 == textExtraStruct.getSubtype()) {
                        SmartRouter.buildRoute(h, "aweme://aweme/detail/").withParam("id", str2).withParam("refer", "click_comment_chain").withParam("cid", str3 + ',' + str).withParam("video_from", videoItemParams.mEventType).open();
                    } else if (4 == textExtraStruct.getSubtype()) {
                        Map<String, String> map = new C33744d().mo59983a("enter_from", videoItemParams.mEventType).mo59983a("group_id", videoItemParams.mAweme.getAid()).mo59983a("author_id", videoItemParams.mAweme.getAuthorUid()).mo59983a("music_id", C59208ac.m108770d(videoItemParams.mAweme)).mo59983a("anchor_type", "duet").f79943a;
                        C89219l.m154716b(map, str4);
                        C39162r.m79460a("enter_anchor_detail", map);
                        SmartRouter.buildRoute(h, "//duet/detail").withParam("id", videoItemParams.mAweme.getAid()).withParam("author_id", videoItemParams.mAweme.getAuthorUid()).withParam("origin_item_id", textExtraStruct.getAwemeId()).withParam("anchor_event_map", new HashMap(map)).open();
                    } else if (7 == textExtraStruct.getSubtype() || textExtraStruct.getSubtype() == 5) {
                        boolean enableQaSticker = AVExternalServiceImpl.m113114a().configService().avsettingsConfig().enableQaSticker();
                        Aweme aweme2 = videoItemParams.mAweme;
                        C89219l.m154716b(aweme2, str4);
                        List<InteractStickerStruct> interactStickerStructs = aweme2.getInteractStickerStructs();
                        if (interactStickerStructs != null && interactStickerStructs.size() > 0) {
                            InteractStickerStruct interactStickerStruct = interactStickerStructs.get(0);
                            C89219l.m154716b(interactStickerStruct, str4);
                            if (interactStickerStruct.getQaStruct() != null) {
                                InteractStickerStruct interactStickerStruct2 = interactStickerStructs.get(0);
                                C89219l.m154716b(interactStickerStruct2, str4);
                                if (interactStickerStruct2.getQaStruct().getQuestionId() != 0) {
                                    z2 = true;
                                    if (enableQaSticker || !z2) {
                                        new C79459a(h).mo123050a(R.string.f46).mo123053a();
                                    }
                                    Aweme aweme3 = videoItemParams.mAweme;
                                    C89219l.m154716b(aweme3, str4);
                                    InteractStickerStruct interactStickerStruct3 = aweme3.getInteractStickerStructs().get(0);
                                    C89219l.m154716b(interactStickerStruct3, str4);
                                    long questionId = interactStickerStruct3.getQaStruct().getQuestionId();
                                    SmartRoute withParam = SmartRouter.buildRoute(h, "aweme://qna/detail/").withParam("id", String.valueOf(questionId)).withParam("extra_question_from", videoItemParams.mEventType);
                                    Aweme aweme4 = videoItemParams.mAweme;
                                    C89219l.m154716b(aweme4, str4);
                                    withParam.withParam("aweme_id", aweme4.getAid()).withParam("qid", String.valueOf(questionId)).withParam("enter_from", videoItemParams.mEventType).withParam("process_id", UUID.randomUUID().toString()).open();
                                    return;
                                }
                            }
                        }
                        z2 = false;
                        if (enableQaSticker) {
                        }
                        new C79459a(h).mo123050a(R.string.f46).mo123053a();
                    } else {
                        SmartRoute withParam2 = SmartRouter.buildRoute(h, "//aweme/detail").withParam("id", textExtraStruct.getAwemeId()).withParam("refer", videoItemParams.mEventType).withParam("isChain", true);
                        Aweme aweme5 = videoItemParams.mAweme;
                        if (aweme5 == null || aweme5.getAwemeType() != 51) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        withParam2.withParam("is_from_duet_chain", z3).open();
                    }
                } else if (textExtraStruct.getType() != 5 || textExtraStruct.getSubtype() != 6 || TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
                    C39162r.m79457a(StringSet.name, "video_at", videoItemParams.mAweme.getAid(), textExtraStruct.getUserId());
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("group_id", str4);
                        jSONObject.put("request_id", videoItemParams.mRequestId.get("request_id"));
                        jSONObject.put("enter_from", videoItemParams.mEventType);
                        jSONObject.put("enter_method", "click_head");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (videoItemParams.mAweme.getAuthor() != null) {
                        C39162r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(videoItemParams.mAweme.getAuthor().getUid()).setJsonObject(jSONObject));
                        String searchResultId2 = FeedParamProvider.C49809a.m93270a(h).getSearchResultId();
                        if (TextUtils.isEmpty(searchResultId2)) {
                            searchResultId2 = C59208ac.m108771e(videoItemParams.mAweme);
                        }
                        C33744d dVar = new C33744d();
                        if (textExtraStruct.getSubtype() == 11) {
                            dVar.mo59983a("is_from_bc_video", "1");
                        }
                        C39162r.m79460a("enter_personal_detail", dVar.mo59983a("enter_from", videoItemParams.mEventType).mo59983a("to_user_id", textExtraStruct.getUserId()).mo59983a("group_id", videoItemParams.mAweme.getAid()).mo59983a("author_id", videoItemParams.mAweme.getAuthorUid()).mo59983a("enter_method", "video_at").mo59983a("search_id", FeedParamProvider.C49809a.m93270a(h).getSearchId()).mo59983a("search_result_id", searchResultId2).mo59978a(videoItemParams.mAweme, "enter_personal_detail", videoItemParams.mEventType).f79943a);
                    }
                    SmartRouter.buildRoute(h, "aweme://user/profile/").withParam("uid", textExtraStruct.getUserId()).withParam("sec_user_id", textExtraStruct.getSecUid()).withParam("profile_from", "video_at").withParam("enter_from", videoItemParams.mEventType).withParam("video_id", videoItemParams.mAweme.getAid()).open();
                } else if (!VideoDescVM.m91949i()) {
                    G.mo20667b(new VideoDescVM.C48587c(G));
                } else {
                    C33744d a = new C33744d().mo59983a("enter_from", videoItemParams.mEventType);
                    Aweme aweme6 = videoItemParams.mAweme;
                    C89219l.m154716b(aweme6, str4);
                    C39162r.m79460a("click_quote_icon", a.mo59983a("group_id", aweme6.getAid()).mo59983a("to_group_id", textExtraStruct.getAwemeId()).mo59983a("quote_type", "personal").f79943a);
                    Map<String, String> map2 = new C33744d().mo59983a("is_from_add_video_chain", "1").f79943a;
                    SmartRoute withParam3 = SmartRouter.buildRoute(h, "//aweme/detail").withParam("id", textExtraStruct.getAwemeId()).withParam("refer", videoItemParams.mEventType).withParam("isChain", true);
                    Aweme aweme7 = videoItemParams.mAweme;
                    C89219l.m154716b(aweme7, str4);
                    if (aweme7.getAwemeType() == 51) {
                        z = true;
                    } else {
                        z = false;
                    }
                    withParam3.withParam("is_from_duet_chain", z).withParam("feed_param_extra", new HashMap(map2)).open();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$ag */
    static final class C48601ag extends AbstractC89220m implements AbstractC89183m<C48593c, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        public static final C48601ag f112418a = new C48601ag();

        static {
            Covode.recordClassIndex(57380);
        }

        C48601ag() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48593c cVar, C12776a<? extends Boolean> aVar) {
            C48593c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            if (cVar2.mo80598I() != null) {
                MentionTextView I = cVar2.mo80598I();
                C89219l.m154716b(I, "");
                new C23144b(I).mo37640e(R.string.dcq).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$ai */
    static final class C48603ai extends AbstractC89220m implements AbstractC89183m<C48593c, Boolean, C89391z> {

        /* renamed from: a */
        public static final C48603ai f112420a = new C48603ai();

        static {
            Covode.recordClassIndex(57382);
        }

        C48603ai() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48593c cVar, Boolean bool) {
            C48593c cVar2 = cVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(cVar2, "");
            if (booleanValue) {
                MixHelperService.m109027a();
                cVar2.az_();
                cVar2.mo80597G().mo23342g();
                cVar2.mo80598I();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$an */
    static final class C48608an extends AbstractC89220m implements AbstractC89183m<C48593c, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        public static final C48608an f112425a = new C48608an();

        static {
            Covode.recordClassIndex(57387);
        }

        C48608an() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x0022  */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.feed.assem.desc.C48593c r6, com.bytedance.assem.arch.extensions.C12776a<? extends java.lang.Integer> r7) {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.feed.assem.desc.c r6 = (com.p2082ss.android.ugc.aweme.feed.assem.desc.C48593c) r6
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r6, r0)
                com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r4 = r6.mo80597G()
                com.ss.android.ugc.aweme.feed.ui.bv r3 = r6.f112409w
                r2 = 1
                if (r3 == 0) goto L_0x003a
                r3.f115772o = r2
                java.lang.Object r0 = r4.mo23342g()
                com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams) r0
                if (r0 != 0) goto L_0x002e
            L_0x001a:
                com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r1 = r6.mo80597G()
                com.ss.android.ugc.aweme.feed.ui.aw r0 = r6.f112408v
                if (r0 != 0) goto L_0x0025
                p4600h.p4611f.p4613b.C89219l.m154715b()
            L_0x0025:
                int r0 = r0.mo80205az()
                r1.f112364C = r0
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            L_0x002e:
                com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM$d r1 = new com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM$d
                r1.<init>(r4, r0, r3)
                java.util.concurrent.ExecutorService r0 = com.p2082ss.android.ugc.aweme.common.C39162r.m79452a()
                p077b.C1731i.m5640b(r1, r0)
            L_0x003a:
                r4.f112368n = r2
                boolean r0 = r4.f112367m
                if (r0 == 0) goto L_0x001a
                com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM$e r1 = new com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM$e
                r1.<init>(r4)
                java.util.concurrent.ExecutorService r0 = com.p2082ss.android.ugc.aweme.common.C39162r.m79452a()
                p077b.C1731i.m5640b(r1, r0)
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.desc.C48593c.C48608an.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$ao */
    static final class C48609ao extends AbstractC89220m implements AbstractC89183m<C48593c, C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        public static final C48609ao f112426a = new C48609ao();

        static {
            Covode.recordClassIndex(57388);
        }

        C48609ao() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48593c cVar, C12776a<? extends C89391z> aVar) {
            String str;
            C48593c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            VideoDescVM G = cVar2.mo80597G();
            C50153bv bvVar = cVar2.f112409w;
            if (bvVar != null) {
                bvVar.f115772o = false;
            }
            G.f112368n = false;
            TuxTextView J = cVar2.mo80599J();
            C89219l.m154716b(J, "");
            String obj = J.getText().toString();
            Context az_ = cVar2.az_();
            if (az_ != null) {
                str = az_.getString(R.string.bu_);
            } else {
                str = null;
            }
            if (obj.equals(str)) {
                VideoDescVM G2 = cVar2.mo80597G();
                TuxTextView J2 = cVar2.mo80599J();
                C89219l.m154716b(J2, "");
                String obj2 = J2.getText().toString();
                TranslationStatusView M = cVar2.mo80602M();
                C89219l.m154716b(M, "");
                int visibility = M.getVisibility();
                TranslationStatusView M2 = cVar2.mo80602M();
                C89219l.m154716b(M2, "");
                G2.mo80589a(obj2, visibility, M2.getStatus());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$ap */
    static final class C48610ap extends AbstractC89220m implements AbstractC89183m<C48593c, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        public static final C48610ap f112427a = new C48610ap();

        static {
            Covode.recordClassIndex(57389);
        }

        C48610ap() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48593c cVar, C12776a<? extends Boolean> aVar) {
            String str;
            C48593c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            boolean d = C49525p.m92764d();
            TuxTextView J = cVar2.mo80599J();
            C89219l.m154716b(J, "");
            String obj = J.getText().toString();
            Context az_ = cVar2.az_();
            if (az_ != null) {
                str = az_.getString(R.string.bu_);
            } else {
                str = null;
            }
            if (d && obj.equals(str)) {
                VideoDescVM G = cVar2.mo80597G();
                TuxTextView J2 = cVar2.mo80599J();
                C89219l.m154716b(J2, "");
                String obj2 = J2.getText().toString();
                TranslationStatusView M = cVar2.mo80602M();
                C89219l.m154716b(M, "");
                int visibility = M.getVisibility();
                TranslationStatusView M2 = cVar2.mo80602M();
                C89219l.m154716b(M2, "");
                G.mo80589a(obj2, visibility, M2.getStatus());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$af */
    static final class C48600af extends AbstractC89220m implements AbstractC89183m<C48593c, C48592b, C89391z> {

        /* renamed from: a */
        public static final C48600af f112417a = new C48600af();

        static {
            Covode.recordClassIndex(57379);
        }

        C48600af() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48593c cVar, C48592b bVar) {
            TuxTextView K;
            C48593c cVar2 = cVar;
            C48592b bVar2 = bVar;
            C89219l.m154721d(cVar2, "");
            C89219l.m154721d(bVar2, "");
            TuxTextView K2 = cVar2.mo80600K();
            C89219l.m154716b(K2, "");
            K2.setVisibility(8);
            TuxTag L = cVar2.mo80601L();
            C89219l.m154716b(L, "");
            L.setVisibility(8);
            if (!(bVar2.f112387a == 8 && bVar2.f112388b == 8)) {
                if (bVar2.f112392f) {
                    K = cVar2.mo80601L();
                } else {
                    K = cVar2.mo80600K();
                }
                C89219l.m154716b(K, "");
                K.setVisibility(0);
                K.setText(bVar2.f112391e);
                if (bVar2.f112392f) {
                    C17301b.m32033a().mo27614a(cVar2.mo80601L(), C17303d.f41573g);
                    Integer num = bVar2.f112389c;
                    if (num != null) {
                        cVar2.mo80601L().setTagBackgroundColor(num.intValue());
                    }
                } else {
                    Integer num2 = bVar2.f112389c;
                    if (num2 != null) {
                        cVar2.mo80600K().setBackgroundColor(num2.intValue());
                    }
                    Integer num3 = bVar2.f112390d;
                    if (num3 != null) {
                        cVar2.mo80600K().setTextColor(num3.intValue());
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$aj */
    static final class C48604aj extends AbstractC89220m implements AbstractC89183m<C48593c, C48591a, C89391z> {

        /* renamed from: a */
        public static final C48604aj f112421a = new C48604aj();

        static {
            Covode.recordClassIndex(57383);
        }

        C48604aj() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48593c cVar, C48591a aVar) {
            ValueAnimator ofInt;
            AbstractC50087aw awVar;
            C48593c cVar2 = cVar;
            C48591a aVar2 = aVar;
            C89219l.m154721d(cVar2, "");
            SpannableStringBuilder spannableStringBuilder = null;
            if (aVar2 != null) {
                if (aVar2.f112382a != null) {
                    if (aVar2 != null) {
                        spannableStringBuilder = aVar2.f112382a;
                    }
                    cVar2.mo80607a(spannableStringBuilder);
                }
                if (aVar2 != null) {
                    boolean z = aVar2.f112386e;
                    int i = aVar2.f112383b;
                    int i2 = aVar2.f112384c;
                    int i3 = aVar2.f112385d;
                    VideoItemParams videoItemParams = (VideoItemParams) cVar2.mo80597G().mo23342g();
                    if (videoItemParams != null) {
                        if (cVar2.mo80597G().f112363B == 0) {
                            VideoDescVM G = cVar2.mo80597G();
                            TuxTextView J = cVar2.mo80599J();
                            C89219l.m154716b(J, "");
                            G.f112363B = J.getHeight();
                        }
                        int i4 = cVar2.mo80597G().f112363B;
                        if (z) {
                            ofInt = ValueAnimator.ofInt(i2, i);
                        } else {
                            ofInt = ValueAnimator.ofInt(i, i2);
                        }
                        ofInt.addUpdateListener(new C48638x(cVar2, z, i4));
                        ofInt.addListener(new C48639y(cVar2, z, videoItemParams, i2, i, i3));
                        if (cVar2.mo80597G().f112363B == 0) {
                            cVar2.mo80597G().f112363B = cVar2.mo80599J().getHeight();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, cVar2.mo80597G().f112363B);
                        ofInt2.addUpdateListener(new C48641z(cVar2));
                        C89219l.m154716b(ofInt2, "");
                        ofInt2.setDuration(100L);
                        ofInt2.setStartDelay(150);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofInt, ofInt2);
                        animatorSet.start();
                        if (C48022b.m91033b() == 0 && C48593c.f112395y && C49525p.m92762b() && (awVar = cVar2.f112408v) != null) {
                            awVar.mo80221h(z);
                        }
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$ah */
    static final class C48602ah extends AbstractC89220m implements AbstractC89183m<C48593c, C12776a<? extends SpannableStringBuilder>, C89391z> {

        /* renamed from: a */
        public static final C48602ah f112419a = new C48602ah();

        static {
            Covode.recordClassIndex(57381);
        }

        C48602ah() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
            if (r8 == null) goto L_0x0080;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.feed.assem.desc.C48593c r15, com.bytedance.assem.arch.extensions.C12776a<? extends android.text.SpannableStringBuilder> r16) {
            /*
            // Method dump skipped, instructions count: 292
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.desc.C48593c.C48602ah.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$ak */
    static final class C48605ak extends AbstractC89220m implements AbstractC89183m<C48593c, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        public static final C48605ak f112422a = new C48605ak();

        static {
            Covode.recordClassIndex(57384);
        }

        C48605ak() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48593c cVar, C12776a<? extends Boolean> aVar) {
            Aweme aweme;
            int i;
            C48593c cVar2 = cVar;
            C12776a<? extends Boolean> aVar2 = aVar;
            C89219l.m154721d(cVar2, "");
            if (aVar2 == null || !aVar2.f31085a.booleanValue()) {
                cVar2.mo20528t().setVisibility(8);
            } else {
                cVar2.mo80597G().mo23342g();
                cVar2.mo20528t().setVisibility(0);
                VideoItemParams videoItemParams = (VideoItemParams) cVar2.mo80597G().mo23342g();
                if (videoItemParams != null) {
                    if (C48593c.f112395y) {
                        cVar2.mo80598I().scrollTo(0, 0);
                        cVar2.mo80604O().getLayoutParams().height = -2;
                    }
                    cVar2.mo80597G().f112370w = false;
                    if (videoItemParams.mAweme.getTextExtra() != null && videoItemParams.mAweme.getTextExtra().size() > 0) {
                        for (TextExtraStruct textExtraStruct : videoItemParams.mAweme.getTextExtra()) {
                            if (textExtraStruct != null) {
                                if (textExtraStruct.getStart() < 0) {
                                    textExtraStruct.setStart(0);
                                }
                                if (textExtraStruct.getEnd() > videoItemParams.mAweme.getDesc().length()) {
                                    textExtraStruct.setEnd(videoItemParams.mAweme.getDesc().length());
                                }
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT < 21) {
                        cVar2.mo80603N().post(new RunnableC48633s(cVar2));
                    }
                    if (cVar2.az_() != null) {
                        VideoDescVM G = cVar2.mo80597G();
                        if (C48593c.f112395y) {
                            i = 550;
                        } else {
                            VideoItemParams videoItemParams2 = (VideoItemParams) G.mo23342g();
                            if (videoItemParams2 != null) {
                                aweme = videoItemParams2.mAweme;
                            } else {
                                aweme = null;
                            }
                            C37699a.m76314s(aweme);
                            i = 200;
                        }
                        cVar2.mo80598I().setMaxSize(i);
                        if (cVar2.mo80597G().f112366l) {
                            cVar2.mo80598I().setSpanSize((float) C34728n.m70949c(14.0d));
                        } else {
                            cVar2.mo80598I().setSpanSize((float) C34728n.m70949c(15.0d));
                        }
                        cVar2.mo80598I().setSpanColor(cVar2.mo80598I().getCurrentTextColor());
                        cVar2.mo80598I().setSpanStyle(1);
                        cVar2.mo80598I().setOnSpanClickListener(new C48634t(cVar2));
                        if (C48342a.f112042a) {
                            C58254p.m105190a().post(new RunnableC48635u(cVar2, videoItemParams));
                            C58254p.m105190a().post(new RunnableC48636v(cVar2));
                        } else {
                            cVar2.mo80611b(videoItemParams.mAweme);
                            cVar2.mo80605P();
                        }
                        if (C48342a.f112042a || CommerceChallengeServiceImpl.m75741e().mo65396d()) {
                            cVar2.mo80598I().post(new RunnableC48637w(cVar2, videoItemParams));
                        } else {
                            Aweme aweme2 = videoItemParams.mAweme;
                            C89219l.m154716b(aweme2, "");
                            C89219l.m154716b(videoItemParams.mEventType, "");
                            int i2 = videoItemParams.mPageType;
                            cVar2.mo80609a(aweme2);
                        }
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo80608a(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, boolean z, boolean z2) {
        C48629q qVar = new C48629q(this, spannableStringBuilder2, z, z2);
        qVar.f115672a = 0;
        spannableStringBuilder.setSpan(qVar, 0, spannableStringBuilder.length(), 17);
    }

    /* renamed from: a */
    public final int mo80606a(CharSequence charSequence, String str, int i, int i2, int i3) {
        float f;
        try {
            float measureText = mo80599J().getPaint().measureText(str);
            int width = mo80598I().getWidth();
            float measureText2 = mo80598I().getPaint().measureText(charSequence, i2, i3);
            if (mo80597G().f112366l) {
                f = mo80598I().getPaint().measureText("...", 0, 3);
            } else {
                f = 0.0f;
            }
            float f2 = ((measureText2 + measureText) + f) - ((float) width);
            if (f2 <= 0.0f) {
                return 0;
            }
            int i4 = 1;
            int i5 = (i3 - i2) + 1;
            if (i5 > 0) {
                while (mo80598I().getPaint().measureText(charSequence, i3 - i4, i3) < f2) {
                    if (i4 != i5) {
                        i4++;
                    }
                }
                return i4;
            }
            return i + 1;
        } catch (Exception unused) {
            return i;
        }
    }
}
