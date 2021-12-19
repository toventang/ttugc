package com.p2082ss.android.ugc.aweme.feed.assem.vpainfobar;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
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
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14524g;
import com.bytedance.ext_power_list.C14530k;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48244cj;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.assem.vpainfobar.VPAInfoBarVM;
import com.p2082ss.android.ugc.aweme.feed.cache.C49301e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49671af;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
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

/* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.a */
public final class C49219a extends AbstractC48491a<C49219a> {

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f113206u = {new C89232y(C49219a.class, "vpaInfoVM", "getVpaInfoVM()Lcom/ss/android/ugc/aweme/feed/assem/vpainfobar/VPAInfoBarVM;", 0)};

    /* renamed from: A */
    private SparseArray f113207A;

    /* renamed from: v */
    final AbstractC89244h f113208v = C89250i.m154773a((AbstractC89171a) new C49229j(this));

    /* renamed from: w */
    final AbstractC89244h f113209w = C89250i.m154773a((AbstractC89171a) new C49240q(this));

    /* renamed from: x */
    private final AbstractC89244h f113210x = C89250i.m154773a((AbstractC89171a) new C49236o(this));

    /* renamed from: y */
    private final AbstractC89248d f113211y;

    /* renamed from: z */
    private final AbstractC89244h f113212z;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.a$b */
    public static final class C49221b extends AbstractC89220m implements AbstractC89172b<C49245f, C49245f> {
        public static final C49221b INSTANCE = new C49221b();

        static {
            Covode.recordClassIndex(58017);
        }

        public C49221b() {
            super(1);
        }

        public final C49245f invoke(C49245f fVar) {
            C89219l.m154719c(fVar, "");
            return fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.a$g */
    public static final class C49226g extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {
        public static final C49226g INSTANCE = new C49226g();

        static {
            Covode.recordClassIndex(58022);
        }

        public C49226g() {
            super(1);
        }

        public final C48244cj invoke(C48244cj cjVar) {
            C89219l.m154719c(cjVar, "");
            return cjVar;
        }
    }

    static {
        Covode.recordClassIndex(58015);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.tq;
    }

    /* renamed from: G */
    public final TextView mo80863G() {
        return (TextView) this.f113210x.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f113207A == null) {
            this.f113207A = new SparseArray();
        }
        View view = (View) this.f113207A.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f113207A.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: I */
    public final VPAInfoBarVM mo80864I() {
        return (VPAInfoBarVM) this.f113211y.mo23374a(this, f113206u[0]);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.a$c */
    public static final class C49222c extends AbstractC89220m implements AbstractC89171a<C12874b<C49245f>> {
        public static final C49222c INSTANCE = new C49222c();

        static {
            Covode.recordClassIndex(58018);
        }

        public C49222c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C49245f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.a$d */
    public static final class C49223d extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f113214a;

        static {
            Covode.recordClassIndex(58019);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49223d(AbstractC12693u uVar) {
            super(0);
            this.f113214a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f113214a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.a$h */
    public static final class C49227h extends AbstractC89220m implements AbstractC89171a<C12874b<C48244cj>> {
        public static final C49227h INSTANCE = new C49227h();

        static {
            Covode.recordClassIndex(58023);
        }

        public C49227h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48244cj> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.a$i */
    public static final class C49228i extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C49228i INSTANCE = new C49228i();

        static {
            Covode.recordClassIndex(58024);
        }

        public C49228i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.a$e */
    public static final class C49224e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f113215a;

        static {
            Covode.recordClassIndex(58020);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49224e(AbstractC12693u uVar) {
            super(0);
            this.f113215a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f113215a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.a$f */
    public static final class C49225f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f113216a;

        static {
            Covode.recordClassIndex(58021);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49225f(AbstractC12693u uVar) {
            super(0);
            this.f113216a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f113216a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.a$j */
    static final class C49229j extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C49219a f113217a;

        static {
            Covode.recordClassIndex(58025);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49229j(C49219a aVar) {
            super(0);
            this.f113217a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f113217a.mo20546C().findViewById(R.id.bnq);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.a$o */
    static final class C49236o extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C49219a f113224a;

        static {
            Covode.recordClassIndex(58032);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49236o(C49219a aVar) {
            super(0);
            this.f113224a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f113224a.mo20546C().findViewById(R.id.cx1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.a$q */
    static final class C49240q extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C49219a f113228a;

        static {
            Covode.recordClassIndex(58036);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49240q(C49219a aVar) {
            super(0);
            this.f113228a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f113228a.mo20546C().findViewById(R.id.fh8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.a$a */
    public static final class C49220a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f113213a;

        static {
            Covode.recordClassIndex(58016);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49220a(AbstractC89277c cVar) {
            super(0);
            this.f113213a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f113213a).getName();
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        super.mo20533y();
        AbstractC12818f.C12819a.m23063a(this, mo80864I(), C49241b.f113229a, (C12854k) null, C49230k.f113218a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo80864I(), C49242c.f113230a, (C12854k) null, C49231l.f113219a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo80864I(), C49243d.f113231a, (C12854k) null, C49233m.f113221a, 6);
    }

    public C49219a() {
        AbstractC12848i.C12851c cVar = AbstractC12848i.C12851c.f31277a;
        AbstractC89277c a = C89204ab.m154669a(VPAInfoBarVM.class);
        this.f113211y = C14530k.m26542a(this, a, cVar == null ? AbstractC12848i.C12851c.f31277a : cVar, new C49220a(a), C49222c.INSTANCE, new C49223d(this), C49221b.INSTANCE, null, null, new C49224e(this), new C49225f(this));
        this.f113212z = new C14524g(C89204ab.m154669a(VideoViewModel.class), this, C49227h.INSTANCE, C49228i.INSTANCE, C49226g.INSTANCE);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
        mo20546C().setVisibility(mo80864I().mo23343h());
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        AbstractC12818f.C12819a.m23070b(this, (VideoViewModel) this.f113212z.getValue(), C49244e.f113232a, (C12854k) null, C49235n.f113223a, 6);
        mo20546C().setVisibility(8);
    }

    /* renamed from: a */
    public final C33744d mo80865a(C33744d dVar) {
        C33744d a = dVar.mo59983a("enter_from", ((VideoItemParams) C12661l.m22797a(this)).mEventType);
        Aweme aweme = ((VideoItemParams) C12661l.m22797a(this)).mAweme;
        C89219l.m154716b(aweme, "");
        C33744d a2 = a.mo59983a("group_id", aweme.getAid());
        Aweme aweme2 = ((VideoItemParams) C12661l.m22797a(this)).mAweme;
        C89219l.m154716b(aweme2, "");
        a2.mo59983a("author_id", aweme2.getAuthorUid()).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108759a(((VideoItemParams) C12661l.m22797a(this)).mAweme, ((VideoItemParams) C12661l.m22797a(this)).mPageType)));
        return dVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.a$k */
    static final class C49230k extends AbstractC89220m implements AbstractC89183m<C49219a, SpannableString, C89391z> {

        /* renamed from: a */
        public static final C49230k f113218a = new C49230k();

        static {
            Covode.recordClassIndex(58026);
        }

        C49230k() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49219a aVar, SpannableString spannableString) {
            C49219a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            ((TextView) aVar2.f113208v.getValue()).setText(spannableString);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.a$n */
    static final class C49235n extends AbstractC89220m implements AbstractC89183m<C49219a, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        public static final C49235n f113223a = new C49235n();

        static {
            Covode.recordClassIndex(58031);
        }

        C49235n() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49219a aVar, C12776a<? extends Integer> aVar2) {
            C49219a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            VPAInfoBarVM I = aVar3.mo80864I();
            I.mo20662a(new VPAInfoBarVM.C49218b(I));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.a$p */
    static final class DialogInterface$OnClickListenerC49237p implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49219a f113225a;

        static {
            Covode.recordClassIndex(58033);
        }

        DialogInterface$OnClickListenerC49237p(C49219a aVar) {
            this.f113225a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C39223a.m79591e().mo68724a(new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.feed.assem.vpainfobar.C49219a.DialogInterface$OnClickListenerC49237p.C492381 */

                /* renamed from: a */
                final /* synthetic */ DialogInterface$OnClickListenerC49237p f113226a;

                static {
                    Covode.recordClassIndex(58034);
                }

                {
                    this.f113226a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    AbstractC81915c.m141874a(new C49671af());
                    C49301e.m92382m();
                    new C79459a(this.f113226a.f113225a.az_()).mo123050a(R.string.bvc).mo123053a();
                    return C89391z.f203057a;
                }
            }, new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.feed.assem.vpainfobar.C49219a.DialogInterface$OnClickListenerC49237p.C492392 */

                /* renamed from: a */
                final /* synthetic */ DialogInterface$OnClickListenerC49237p f113227a;

                static {
                    Covode.recordClassIndex(58035);
                }

                {
                    this.f113227a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    new C79459a(this.f113227a.f113225a.az_()).mo123050a(R.string.bvb).mo123053a();
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.a$l */
    static final class C49231l extends AbstractC89220m implements AbstractC89183m<C49219a, Integer, C89391z> {

        /* renamed from: a */
        public static final C49231l f113219a = new C49231l();

        static {
            Covode.recordClassIndex(58027);
        }

        C49231l() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49219a aVar, Integer num) {
            final C49219a aVar2 = aVar;
            int intValue = num.intValue();
            C89219l.m154721d(aVar2, "");
            aVar2.mo20546C().setVisibility(intValue);
            if (intValue == 0) {
                C33744d dVar = new C33744d();
                C89219l.m154716b(dVar, "");
                C39162r.m79460a("vpa_notify_show", aVar2.mo80865a(dVar).f79943a);
                ((View) aVar2.f113209w.getValue()).setOnClickListener(new View.OnClickListener() {
                    /* class com.p2082ss.android.ugc.aweme.feed.assem.vpainfobar.C49219a.C49231l.View$OnClickListenerC492321 */

                    static {
                        Covode.recordClassIndex(58028);
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        SmartRouter.buildRoute(aVar2.az_(), C39223a.m79591e().mo68727b()).open();
                        C49219a aVar = aVar2;
                        C33744d dVar = new C33744d();
                        C89219l.m154716b(dVar, "");
                        C39162r.m79460a("enter_vpa_notify", aVar.mo80865a(dVar).f79943a);
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.a$m */
    static final class C49233m extends AbstractC89220m implements AbstractC89183m<C49219a, Integer, C89391z> {

        /* renamed from: a */
        public static final C49233m f113221a = new C49233m();

        static {
            Covode.recordClassIndex(58029);
        }

        C49233m() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49219a aVar, Integer num) {
            final C49219a aVar2 = aVar;
            int intValue = num.intValue();
            C89219l.m154721d(aVar2, "");
            aVar2.mo80863G().setVisibility(intValue);
            if (intValue == 0) {
                C33744d dVar = new C33744d();
                C89219l.m154716b(dVar, "");
                C39162r.m79460a("opt_out_show", aVar2.mo80865a(dVar).f79943a);
                aVar2.mo80863G().setOnClickListener(new View.OnClickListener() {
                    /* class com.p2082ss.android.ugc.aweme.feed.assem.vpainfobar.C49219a.C49233m.View$OnClickListenerC492341 */

                    static {
                        Covode.recordClassIndex(58030);
                    }

                    public final void onClick(View view) {
                        String str;
                        String str2;
                        ClickAgent.onClick(view);
                        C49219a aVar = aVar2;
                        C33744d dVar = new C33744d();
                        C89219l.m154716b(dVar, "");
                        C39162r.m79460a("opt_out_click", aVar.mo80865a(dVar).f79943a);
                        C49219a aVar2 = aVar2;
                        C17197a.C17200a aVar3 = new C17197a.C17200a(aVar2.az_());
                        aVar3.f41059E = true;
                        C17197a.C17200a a = aVar3.mo27189a(R.string.bva);
                        StringBuilder sb = new StringBuilder();
                        Context az_ = aVar2.az_();
                        if (az_ != null) {
                            str = az_.getString(R.string.bv8);
                        } else {
                            str = null;
                        }
                        StringBuilder append = sb.append(str).append("\n\n");
                        Context az_2 = aVar2.az_();
                        if (az_2 != null) {
                            str2 = az_2.getString(R.string.bv9);
                        } else {
                            str2 = null;
                        }
                        a.f41071b = append.append(str2).toString();
                        C17197a.C17200a b = a.mo27190a(R.string.bv_, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC49237p(aVar2), false).mo27195b(R.string.a6m, (DialogInterface.OnClickListener) null, false);
                        b.f41060F = true;
                        b.mo27193a().mo27185c();
                    }
                });
            }
            return C89391z.f203057a;
        }
    }
}
