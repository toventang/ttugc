package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3206a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.tux.button.TuxButton;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.activity.ChatRoomActivity;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3139a.C54603a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55082e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55213i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55232u;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3207b.C55539b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.C55619b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.C55357e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55340b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p */
public final class C55503p extends AbstractC12769a {

    /* renamed from: j */
    public View f126740j;

    /* renamed from: k */
    private final C12786i f126741k = new C12786i(bW_(), new C55525u(this, "init_config"));

    /* renamed from: l */
    private final C12814b f126742l;

    /* renamed from: m */
    private TuxButton f126743m;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$l */
    public static final class C55516l extends AbstractC89220m implements AbstractC89172b<C55619b, C55619b> {
        public static final C55516l INSTANCE = new C55516l();

        static {
            Covode.recordClassIndex(65287);
        }

        public C55516l() {
            super(1);
        }

        public final C55619b invoke(C55619b bVar) {
            C89219l.m154719c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(65274);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final C55539b.C55555p mo92477v() {
        return (C55539b.C55555p) this.f126741k.getValue();
    }

    /* renamed from: w */
    public final ContactListViewModel mo92478w() {
        return (ContactListViewModel) this.f126742l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$h */
    public static final class C55512h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126750a;

        static {
            Covode.recordClassIndex(65283);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55512h(AbstractC12748a aVar) {
            super(0);
            this.f126750a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f126750a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$d */
    public static final class C55508d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C55508d INSTANCE = new C55508d();

        static {
            Covode.recordClassIndex(65279);
        }

        public C55508d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$g */
    public static final class C55511g extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55511g INSTANCE = new C55511g();

        static {
            Covode.recordClassIndex(65282);
        }

        public C55511g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$i */
    public static final class C55513i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126751a;

        static {
            Covode.recordClassIndex(65284);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55513i(AbstractC12748a aVar) {
            super(0);
            this.f126751a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f126751a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$j */
    public static final class C55514j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126752a;

        static {
            Covode.recordClassIndex(65285);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55514j(AbstractC12748a aVar) {
            super(0);
            this.f126752a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f126752a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$n */
    public static final class C55518n extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55518n INSTANCE = new C55518n();

        static {
            Covode.recordClassIndex(65289);
        }

        public C55518n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$q */
    public static final class C55521q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C55521q INSTANCE = new C55521q();

        static {
            Covode.recordClassIndex(65292);
        }

        public C55521q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$t */
    public static final class C55524t extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55524t INSTANCE = new C55524t();

        static {
            Covode.recordClassIndex(65295);
        }

        public C55524t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$k */
    public static final class C55515k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126753a;

        static {
            Covode.recordClassIndex(65286);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55515k(AbstractC12748a aVar) {
            super(0);
            this.f126753a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f126753a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$m */
    public static final class C55517m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126754a;

        static {
            Covode.recordClassIndex(65288);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55517m(AbstractC12748a aVar) {
            super(0);
            this.f126754a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f126754a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$a */
    public static final class C55504a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f126744a;

        static {
            Covode.recordClassIndex(65275);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55504a(AbstractC89277c cVar) {
            super(0);
            this.f126744a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f126744a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$b */
    public static final class C55506b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126746a;

        static {
            Covode.recordClassIndex(65277);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55506b(AbstractC12748a aVar) {
            super(0);
            this.f126746a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f126746a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$c */
    public static final class C55507c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126747a;

        static {
            Covode.recordClassIndex(65278);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55507c(AbstractC12748a aVar) {
            super(0);
            this.f126747a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f126747a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$o */
    public static final class C55519o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126755a;

        static {
            Covode.recordClassIndex(65290);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55519o(AbstractC12748a aVar) {
            super(0);
            this.f126755a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f126755a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$p */
    public static final class C55520p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126756a;

        static {
            Covode.recordClassIndex(65291);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55520p(AbstractC12748a aVar) {
            super(0);
            this.f126756a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f126756a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$r */
    public static final class C55522r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126757a;

        static {
            Covode.recordClassIndex(65293);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55522r(AbstractC12748a aVar) {
            super(0);
            this.f126757a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f126757a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$s */
    public static final class C55523s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126758a;

        static {
            Covode.recordClassIndex(65294);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55523s(AbstractC12748a aVar) {
            super(0);
            this.f126758a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f126758a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$u */
    public static final class C55525u extends AbstractC89220m implements AbstractC89171a<C55539b.C55555p> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126759a;

        /* renamed from: b */
        final /* synthetic */ String f126760b;

        static {
            Covode.recordClassIndex(65296);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55525u(AbstractC12748a aVar, String str) {
            super(0);
            this.f126759a = aVar;
            this.f126760b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$p] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3207b.C55539b.C55555p invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f126759a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$p> r1 = com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3207b.C55539b.C55555p.class
                java.lang.String r0 = r3.f126760b
                java.lang.Object r0 = r2.mo20603a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3206a.C55503p.C55525u.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$aa */
    public static final class RunnableC55505aa implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C55503p f126745a;

        static {
            Covode.recordClassIndex(65276);
        }

        RunnableC55505aa(C55503p pVar) {
            this.f126745a = pVar;
        }

        public final void run() {
            int i;
            View view = this.f126745a.f126740j;
            if (view == null) {
                C89219l.m154710a("widget");
            }
            if (this.f126745a.mo92478w().mo92518i().size() > 0) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$e */
    public static final class C55509e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126748a;

        static {
            Covode.recordClassIndex(65280);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55509e(AbstractC12748a aVar) {
            super(0);
            this.f126748a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f126748a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$f */
    public static final class C55510f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126749a;

        static {
            Covode.recordClassIndex(65281);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55510f(AbstractC12748a aVar) {
            super(0);
            this.f126749a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f126749a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: y */
    public final void mo92480y() {
        View view = this.f126740j;
        if (view == null) {
            C89219l.m154710a("widget");
        }
        view.postDelayed(new RunnableC55505aa(this), 50);
        TuxButton tuxButton = this.f126743m;
        if (tuxButton == null) {
            C89219l.m154710a("button");
        }
        tuxButton.setText(mo92477v().getEntry().sendBtnText(mo92478w().mo92521l()));
    }

    public C55503p() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(ContactListViewModel.class);
        C55504a aVar = new C55504a(a);
        C55516l lVar = C55516l.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C55518n.INSTANCE, new C55519o(this), new C55520p(this), C55521q.INSTANCE, lVar, new C55522r(this), new C55523s(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C55524t.INSTANCE, new C55506b(this), new C55507c(this), C55508d.INSTANCE, lVar, new C55509e(this), new C55510f(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C55511g.INSTANCE, new C55512h(this), new C55513i(this), new C55514j(this), lVar, new C55515k(this), new C55517m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f126742l = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo92479x() {
        List<IMUser> m = mo92478w().mo92522m();
        C56244a.m102191c("GroupCreateFragment", "creating chat, selected size: " + m.size());
        int size = m.size();
        if (size == 0) {
            mo92480y();
        } else if (size != 1) {
            C55357e.C55358a.m101168a();
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) m, 10));
            Iterator<T> it = m.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getUid());
            }
            C55357e.m101166a(arrayList, new C55531z(this));
            C54603a.m100106a(C55213i.m100956b(mo92478w().mo92522m()));
        } else {
            C54603a.m100102a(0, AbstractC17420a.C17421a.m32276a().mo27720a(AbstractC17427b.C17428a.m32310b(m.get(0).getUid())), "private", null);
            ChatRoomActivity.C54401a.m99731a(C56245a.C56247b.m102214a(az_(), m.get(0)).mo93270b(0).f128281a);
            ActivityC0945e b = C12777b.m23004b(this);
            if (b != null) {
                b.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$v */
    public static final class C55526v implements AbstractC19479b<List<? extends C19537ah>> {

        /* renamed from: a */
        final /* synthetic */ C55503p f126761a;

        /* renamed from: b */
        final /* synthetic */ Fragment f126762b;

        static {
            Covode.recordClassIndex(65297);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(List<? extends C19537ah> list) {
            ActivityC0945e activity = this.f126762b.getActivity();
            if (activity != null) {
                activity.setResult(2095);
                activity.finish();
            }
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            ActivityC0945e activity;
            if (uVar == null || (activity = this.f126762b.getActivity()) == null) {
                C55340b.m101158a(C17867d.m33078a(), uVar);
                this.f126761a.mo92476a(false);
                return;
            }
            C55340b.m101158a(C17867d.m33078a(), uVar);
            activity.finish();
        }

        C55526v(C55503p pVar, Fragment fragment) {
            this.f126761a = pVar;
            this.f126762b = fragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$x */
    static final class C55528x extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55503p f126764a;

        static {
            Covode.recordClassIndex(65299);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55528x(C55503p pVar) {
            super(1);
            this.f126764a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20582b(this.f126764a, C555291.f126765a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo92476a(boolean z) {
        TuxButton tuxButton = this.f126743m;
        if (tuxButton == null) {
            C89219l.m154710a("button");
        }
        tuxButton.setLoading(z);
        mo92478w().f126835k = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$z */
    public static final class C55531z extends AbstractC89220m implements AbstractC89172b<C19638h, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55503p f126767a;

        static {
            Covode.recordClassIndex(65302);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55531z(C55503p pVar) {
            super(1);
            this.f126767a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C19638h hVar) {
            C19638h hVar2 = hVar;
            if (hVar2 == null) {
                this.f126767a.mo92476a(false);
            } else {
                ChatRoomActivity.C54401a.m99731a(C56245a.C56247b.m102213a(this.f126767a.az_(), C55082e.m100739a(hVar2)).mo93270b(3).mo93268a(hVar2.getConversationId()).mo93271b("create_group").f128281a);
                ActivityC0945e b = C12777b.m23004b(this.f126767a);
                if (b != null) {
                    b.finish();
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        ContactListViewModel w;
        C89219l.m154721d(view, "");
        C12780d.m23007a(this, new C55528x(this));
        LinearLayout linearLayout = (LinearLayout) mo20528t().findViewById(R.id.v7);
        C89219l.m154716b(linearLayout, "");
        this.f126740j = linearLayout;
        TuxButton tuxButton = (TuxButton) mo20528t().findViewById(R.id.dvb);
        tuxButton.setOnClickListener(new View$OnClickListenerC55527w(this));
        C89219l.m154716b(tuxButton, "");
        this.f126743m = tuxButton;
        mo20508a(w, C12856l.m23102a(mo92478w().f31149c), null, new C55530y(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$w */
    static final class View$OnClickListenerC55527w implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C55503p f126763a;

        static {
            Covode.recordClassIndex(65298);
        }

        View$OnClickListenerC55527w(C55503p pVar) {
            this.f126763a = pVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C55232u.m101003a(view, 500)) {
                C55503p pVar = this.f126763a;
                if (!pVar.mo92478w().f126835k) {
                    pVar.mo92476a(true);
                    int i = C55532q.f126768a[pVar.mo92477v().getEntry().ordinal()];
                    if (i == 1) {
                        Fragment a = C12777b.m22999a((AbstractC1204m) pVar);
                        if (a != null) {
                            C55357e.C55358a.m101168a();
                            String uid = pVar.mo92478w().f126834j.getUid();
                            C89219l.m154716b(uid, "");
                            long parseLong = Long.parseLong(uid);
                            String conversationId = pVar.mo92477v().getConversationId();
                            List<IMUser> k = pVar.mo92478w().mo92520k();
                            C55526v vVar = new C55526v(pVar, a);
                            C89219l.m154721d(conversationId, "");
                            C89219l.m154721d(k, "");
                            C89219l.m154721d(vVar, "");
                            if (conversationId.length() != 0) {
                                AbstractC17427b a2 = AbstractC17427b.C17428a.m32308a(conversationId);
                                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) k, 10));
                                Iterator<T> it = k.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(it.next().getUid());
                                }
                                HashMap hashMap = new HashMap();
                                JSONObject jSONObject = new JSONObject();
                                JSONObject jSONObject2 = new JSONObject();
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject2.put("source_app_id", C17867d.f42590n);
                                jSONObject3.put("im_user_id", parseLong);
                                jSONObject.put("invitee", jSONObject2);
                                jSONObject.put("invitor", jSONObject3);
                                jSONObject.put("source_type", 6);
                                String jSONObject4 = jSONObject.toString();
                                C89219l.m154716b(jSONObject4, "");
                                hashMap.put("invitation", jSONObject4);
                                a2.mo27739a(arrayList, hashMap, vVar);
                            }
                            C54603a.m100110b(C55213i.m100956b(pVar.mo92478w().mo92520k()));
                        }
                    } else if (i == 2) {
                        pVar.mo92479x();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p$y */
    static final class C55530y extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C55619b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55503p f126766a;

        static {
            Covode.recordClassIndex(65301);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55530y(C55503p pVar) {
            super(2);
            this.f126766a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C55619b bVar) {
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(bVar, "");
            this.f126766a.mo92480y();
            return C89391z.f203057a;
        }
    }
}
