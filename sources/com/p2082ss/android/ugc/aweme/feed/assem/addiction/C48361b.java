package com.p2082ss.android.ugc.aweme.feed.assem.addiction;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14524g;
import com.bytedance.ext_power_list.C14530k;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38660az;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48200bc;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Date;
import p4600h.AbstractC89244h;
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

/* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.b */
public final class C48361b extends AbstractC48491a<C48361b> {

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f112067u = {new C89232y(C48361b.class, "antiAddictionVM", "getAntiAddictionVM()Lcom/ss/android/ugc/aweme/feed/assem/addiction/VideoAntiAddictionVM;", 0)};

    /* renamed from: w */
    public static final C48371j f112068w = new C48371j((byte) 0);

    /* renamed from: v */
    public ViewGroup f112069v;

    /* renamed from: x */
    private final AbstractC89248d f112070x;

    /* renamed from: y */
    private final AbstractC89244h f112071y = new C14524g(C89204ab.m154669a(VideoPlayViewModel.class), this, C48369h.INSTANCE, C48370i.INSTANCE, C48368g.INSTANCE);

    /* renamed from: z */
    private SparseArray f112072z;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.b$b */
    public static final class C48363b extends AbstractC89220m implements AbstractC89172b<C48379e, C48379e> {
        public static final C48363b INSTANCE = new C48363b();

        static {
            Covode.recordClassIndex(57136);
        }

        public C48363b() {
            super(1);
        }

        public final C48379e invoke(C48379e eVar) {
            C89219l.m154719c(eVar, "");
            return eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.b$g */
    public static final class C48368g extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {
        public static final C48368g INSTANCE = new C48368g();

        static {
            Covode.recordClassIndex(57141);
        }

        public C48368g() {
            super(1);
        }

        public final C48200bc invoke(C48200bc bcVar) {
            C89219l.m154719c(bcVar, "");
            return bcVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.b$l */
    static final class View$OnClickListenerC48373l implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC48373l f112078a = new View$OnClickListenerC48373l();

        static {
            Covode.recordClassIndex(57146);
        }

        View$OnClickListenerC48373l() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(57134);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.rr;
    }

    /* renamed from: G */
    public final VideoAntiAddictionVM mo80493G() {
        return (VideoAntiAddictionVM) this.f112070x.mo23374a(this, f112067u[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f112072z == null) {
            this.f112072z = new SparseArray();
        }
        View view = (View) this.f112072z.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f112072z.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.b$j */
    public static final class C48371j {
        static {
            Covode.recordClassIndex(57144);
        }

        private C48371j() {
        }

        public /* synthetic */ C48371j(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.b$c */
    public static final class C48364c extends AbstractC89220m implements AbstractC89171a<C12874b<C48379e>> {
        public static final C48364c INSTANCE = new C48364c();

        static {
            Covode.recordClassIndex(57137);
        }

        public C48364c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48379e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.b$d */
    public static final class C48365d extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112074a;

        static {
            Covode.recordClassIndex(57138);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48365d(AbstractC12693u uVar) {
            super(0);
            this.f112074a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f112074a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.b$h */
    public static final class C48369h extends AbstractC89220m implements AbstractC89171a<C12874b<C48200bc>> {
        public static final C48369h INSTANCE = new C48369h();

        static {
            Covode.recordClassIndex(57142);
        }

        public C48369h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48200bc> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.b$i */
    public static final class C48370i extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48370i INSTANCE = new C48370i();

        static {
            Covode.recordClassIndex(57143);
        }

        public C48370i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.b$e */
    public static final class C48366e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112075a;

        static {
            Covode.recordClassIndex(57139);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48366e(AbstractC12693u uVar) {
            super(0);
            this.f112075a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f112075a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.b$f */
    public static final class C48367f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112076a;

        static {
            Covode.recordClassIndex(57140);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48367f(AbstractC12693u uVar) {
            super(0);
            this.f112076a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f112076a.bD_().f30985g;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a, com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final void mo20466a() {
        super.mo20466a();
        mo80493G().mo80489a((Context) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.b$a */
    public static final class C48362a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f112073a;

        static {
            Covode.recordClassIndex(57135);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48362a(AbstractC89277c cVar) {
            super(0);
            this.f112073a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f112073a).getName();
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        super.mo20533y();
        AbstractC12818f.C12819a.m23063a(this, mo80493G(), C48377c.f112082a, (C12854k) null, C48372k.f112077a, 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.b$o */
    static final class RunnableC48376o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C48361b f112081a;

        static {
            Covode.recordClassIndex(57149);
        }

        RunnableC48376o(C48361b bVar) {
            this.f112081a = bVar;
        }

        public final void run() {
            if (this.f112081a.f112069v != null) {
                AbstractC38660az d = C38000g.m77053d();
                ViewGroup viewGroup = this.f112081a.f112069v;
                ViewGroup viewGroup2 = this.f112081a.f112069v;
                if (viewGroup2 == null) {
                    C89219l.m154715b();
                }
                d.mo67203a(viewGroup, -viewGroup2.getHeight(), 360, false);
            }
        }
    }

    public C48361b() {
        AbstractC89277c a = C89204ab.m154669a(VideoAntiAddictionVM.class);
        this.f112070x = C14530k.m26542a(this, a, AbstractC12848i.C12851c.f31277a, new C48362a(a), C48364c.INSTANCE, new C48365d(this), C48363b.INSTANCE, null, null, new C48366e(this), new C48367f(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.b$n */
    static final class RunnableC48375n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C48361b f112080a;

        static {
            Covode.recordClassIndex(57148);
        }

        RunnableC48375n(C48361b bVar) {
            this.f112080a = bVar;
        }

        public final void run() {
            String str;
            Resources resources;
            if (this.f112080a.f112069v != null) {
                ViewGroup viewGroup = this.f112080a.f112069v;
                if (viewGroup == null) {
                    C89219l.m154715b();
                }
                View findViewById = viewGroup.findViewById(R.id.es3);
                C89219l.m154716b(findViewById, "");
                TextView textView = (TextView) findViewById;
                String obj = textView.getText().toString();
                if (!TextUtils.isEmpty(obj)) {
                    Context az_ = this.f112080a.az_();
                    if (az_ == null || (resources = az_.getResources()) == null || (str = resources.getString(R.string.rb)) == null) {
                        str = "";
                    }
                    Date date = new Date(System.currentTimeMillis());
                    this.f112080a.mo80493G();
                    String format = VideoAntiAddictionVM.m91807h().format(date);
                    if (format == null) {
                        format = "";
                    }
                    String a = C1764a.m5928a(str, Arrays.copyOf(new Object[]{format, obj}, 2));
                    C89219l.m154716b(a, "");
                    textView.setText(a);
                    C38000g.m77053d().mo67203a(this.f112080a.f112069v, 0, 360, true);
                    if (C34729o.m70957a(this.f112080a.f112069v)) {
                        this.f112080a.mo80493G().f112061m = true;
                    }
                    C39223a.m79588b().mo68595c();
                }
            }
        }
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

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: a */
    public final void mo80495a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
        super.mo20469b(videoItemParams);
        mo80493G().mo80489a(az_());
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        if (!(view instanceof ViewGroup)) {
            view = null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        this.f112069v = viewGroup;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        ViewGroup viewGroup2 = this.f112069v;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(View$OnClickListenerC48373l.f112078a);
        }
        AbstractC12818f.C12819a.m23063a(this, (VideoPlayViewModel) this.f112071y.getValue(), C48378d.f112083a, (C12854k) null, C48374m.f112079a, 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.b$m */
    static final class C48374m extends AbstractC89220m implements AbstractC89183m<C48361b, C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        public static final C48374m f112079a = new C48374m();

        static {
            Covode.recordClassIndex(57147);
        }

        C48374m() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48361b bVar, C12776a<? extends C89391z> aVar) {
            C48361b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            if (!bVar2.mo80493G().f112060l && !bVar2.mo80493G().f112061m && C34729o.m70957a(bVar2.f112069v) && C34729o.m70957a(bVar2.f112069v)) {
                Handler handler = new Handler();
                handler.postDelayed(new RunnableC48375n(bVar2), 100);
                handler.postDelayed(new RunnableC48376o(bVar2), 7000);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.b$k */
    static final class C48372k extends AbstractC89220m implements AbstractC89183m<C48361b, C48360a, C89391z> {

        /* renamed from: a */
        public static final C48372k f112077a = new C48372k();

        static {
            Covode.recordClassIndex(57145);
        }

        C48372k() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e4, code lost:
            if (r2 != null) goto L_0x00d8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.feed.assem.addiction.C48361b r9, com.p2082ss.android.ugc.aweme.feed.assem.addiction.C48360a r10) {
            /*
            // Method dump skipped, instructions count: 249
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.addiction.C48361b.C48372k.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
