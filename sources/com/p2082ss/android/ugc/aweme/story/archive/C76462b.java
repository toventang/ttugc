package com.p2082ss.android.ugc.aweme.story.archive;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.assem.p793a.C12642a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AbstractC14534m;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import com.p2082ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.archive.b */
public final class C76462b extends AbstractC14534m<StoryArchListViewModel> {

    /* renamed from: j */
    final AbstractC89244h f171740j;

    /* renamed from: k */
    private final AbstractC89244h f171741k = C89250i.m154773a((AbstractC89171a) new C76476j(this));

    /* renamed from: l */
    private final C12642a f171742l;

    /* renamed from: m */
    private final AbstractC89244h f171743m;

    /* renamed from: n */
    private final AbstractC89244h f171744n;

    /* renamed from: com.ss.android.ugc.aweme.story.archive.b$a */
    public static final class C76463a extends AbstractC89220m implements AbstractC89172b<C76488h, C76488h> {
        public static final C76463a INSTANCE = new C76463a();

        static {
            Covode.recordClassIndex(89443);
        }

        public C76463a() {
            super(1);
        }

        public final C76488h invoke(C76488h hVar) {
            C89219l.m154719c(hVar, "");
            return hVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.b$p */
    static final class C76482p extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C76482p f171762a = new C76482p();

        static {
            Covode.recordClassIndex(89462);
        }

        C76482p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "story_arch_list";
        }
    }

    static {
        Covode.recordClassIndex(89442);
    }

    /* renamed from: A */
    public final TuxStatusView.C23263c mo120214A() {
        return (TuxStatusView.C23263c) this.f171744n.getValue();
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m
    /* renamed from: w */
    public final PowerList mo23379w() {
        return (PowerList) this.f171741k.getValue();
    }

    /* renamed from: y */
    public final StoryArchListViewModel mo23378v() {
        return (StoryArchListViewModel) this.f171742l.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final TuxStatusView mo120217z() {
        return (TuxStatusView) this.f171743m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.b$e */
    public static final class C76467e extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f171747a;

        static {
            Covode.recordClassIndex(89447);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76467e(AbstractC1204m mVar) {
            super(0);
            this.f171747a = mVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            return this.f171747a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.b$d */
    public static final class C76466d extends AbstractC89220m implements AbstractC89171a<C12874b<C76488h>> {
        public static final C76466d INSTANCE = new C76466d();

        static {
            Covode.recordClassIndex(89446);
        }

        public C76466d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C76488h> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.b$f */
    public static final class C76468f extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C76468f INSTANCE = new C76468f();

        static {
            Covode.recordClassIndex(89448);
        }

        public C76468f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.b$j */
    static final class C76476j extends AbstractC89220m implements AbstractC89171a<PowerList> {

        /* renamed from: a */
        final /* synthetic */ C76462b f171756a;

        static {
            Covode.recordClassIndex(89456);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76476j(C76462b bVar) {
            super(0);
            this.f171756a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PowerList invoke() {
            return this.f171756a.mo20528t().findViewById(R.id.e9x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.b$b */
    public static final class C76464b extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f171745a;

        static {
            Covode.recordClassIndex(89444);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76464b(AbstractC12748a aVar) {
            super(0);
            this.f171745a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f171745a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.b$c */
    public static final class C76465c extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f171746a;

        static {
            Covode.recordClassIndex(89445);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76465c(AbstractC12748a aVar) {
            super(0);
            this.f171746a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f171746a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.b$o */
    static final class C76481o extends AbstractC89220m implements AbstractC89171a<TuxStatusView> {

        /* renamed from: a */
        final /* synthetic */ C76462b f171761a;

        static {
            Covode.recordClassIndex(89461);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76481o(C76462b bVar) {
            super(0);
            this.f171761a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxStatusView invoke() {
            TuxStatusView tuxStatusView = (TuxStatusView) this.f171761a.mo20528t().findViewById(R.id.e7i);
            tuxStatusView.setLayoutVariant(0);
            return tuxStatusView;
        }
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m
    /* renamed from: x */
    public final C17693c mo23380x() {
        C17693c cVar = new C17693c();
        cVar.f42319a = 5;
        cVar.f42320b = true;
        return cVar.mo28182a(LoadingFooterCell.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.b$g */
    static final class C76469g extends AbstractC89220m implements AbstractC89171a<TuxStatusView.C23263c> {

        /* renamed from: a */
        final /* synthetic */ C76462b f171748a;

        static {
            Covode.recordClassIndex(89449);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76469g(C76462b bVar) {
            super(0);
            this.f171748a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxStatusView.C23263c invoke() {
            String str;
            String str2;
            Context az_ = this.f171748a.az_();
            if (az_ == null || (str = az_.getString(R.string.g68)) == null) {
                str = "";
            }
            C89219l.m154716b(str, "");
            Context az_2 = this.f171748a.az_();
            if (az_2 == null || (str2 = az_2.getString(R.string.g67)) == null) {
                str2 = "";
            }
            C89219l.m154716b(str2, "");
            return new TuxStatusView.C23263c().mo37879a(str).mo37878a((CharSequence) str2).mo37877a(C23005c.m43393a(C764701.f171749a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.b$h */
    static final class C76471h extends AbstractC89220m implements AbstractC89171a<TuxStatusView.C23263c> {

        /* renamed from: a */
        final /* synthetic */ C76462b f171750a;

        static {
            Covode.recordClassIndex(89451);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76471h(C76462b bVar) {
            super(0);
            this.f171750a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxStatusView.C23263c invoke() {
            String str;
            String str2;
            Context az_ = this.f171750a.az_();
            if (az_ == null || (str = az_.getString(R.string.g6t)) == null) {
                str = "";
            }
            C89219l.m154716b(str, "");
            Context az_2 = this.f171750a.az_();
            if (az_2 == null || (str2 = az_2.getString(R.string.g6r)) == null) {
                str2 = "";
            }
            C89219l.m154716b(str2, "");
            TuxStatusView.C23263c a = new TuxStatusView.C23263c().mo37877a(C23005c.m43393a(C764721.f171751a)).mo37879a(str).mo37878a((CharSequence) str2);
            a.f55132j = new AbstractC89172b<TuxButton, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.story.archive.C76462b.C76471h.C764732 */

                /* renamed from: a */
                final /* synthetic */ C76471h f171752a;

                static {
                    Covode.recordClassIndex(89453);
                }

                {
                    this.f171752a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(TuxButton tuxButton) {
                    String str;
                    TuxButton tuxButton2 = tuxButton;
                    C89219l.m154721d(tuxButton2, "");
                    Context az_ = this.f171752a.f171750a.az_();
                    if (az_ != null) {
                        str = az_.getString(R.string.cj0);
                    } else {
                        str = null;
                    }
                    tuxButton2.setText(str);
                    tuxButton2.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_tab_arrow_counter_clockwise_fill));
                    tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                        /* class com.p2082ss.android.ugc.aweme.story.archive.C76462b.C76471h.C764732.View$OnClickListenerC764741 */

                        /* renamed from: a */
                        final /* synthetic */ C764732 f171753a;

                        static {
                            Covode.recordClassIndex(89454);
                        }

                        {
                            this.f171753a = r1;
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            C76462b bVar = this.f171753a.f171752a.f171750a;
                            bVar.mo23379w().setVisibility(8);
                            TuxStatusView z = bVar.mo120217z();
                            C89219l.m154716b(z, "");
                            z.setVisibility(0);
                            bVar.mo120217z().mo37867a();
                            bVar.mo23378v().mo23342g();
                        }
                    });
                    return C89391z.f203057a;
                }
            };
            return a;
        }
    }

    public C76462b() {
        C76482p pVar = C76482p.f171762a;
        this.f171742l = new C12642a(C89204ab.m154669a(StoryArchListViewModel.class), pVar, C76466d.INSTANCE, new C76467e(this), C76468f.INSTANCE, C76463a.INSTANCE, new C76464b(this), new C76465c(this));
        this.f171743m = C89250i.m154773a((AbstractC89171a) new C76481o(this));
        this.f171744n = C89250i.m154773a((AbstractC89171a) new C76471h(this));
        this.f171740j = C89250i.m154773a((AbstractC89171a) new C76469g(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.b$m */
    static final class C76479m extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76462b f171759a;

        static {
            Covode.recordClassIndex(89459);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76479m(C76462b bVar) {
            super(1);
            this.f171759a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            C76462b bVar = this.f171759a;
            bVar.mo120215a(bVar.mo120214A());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.b$n */
    static final class C76480n extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76462b f171760a;

        static {
            Covode.recordClassIndex(89460);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76480n(C76462b bVar) {
            super(1);
            this.f171760a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            ActivityC0945e b = C12777b.m23004b(this.f171760a);
            if (b != null) {
                new C23144b(b).mo37640e(R.string.g6g).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.b$i */
    public static final class C76475i extends GridLayoutManager.AbstractC1337c {

        /* renamed from: e */
        final /* synthetic */ GridLayoutManager f171754e;

        /* renamed from: f */
        final /* synthetic */ C76462b f171755f;

        static {
            Covode.recordClassIndex(89455);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            int headerCount = this.f171755f.mo23379w().getHeaderCount();
            List<AbstractC17641a> c = this.f171755f.mo23379w().getState().mo28140c();
            if (i < headerCount) {
                return this.f171754e.f4316b;
            }
            if (i >= headerCount + c.size()) {
                return this.f171754e.f4316b;
            }
            return 1;
        }

        C76475i(GridLayoutManager gridLayoutManager, C76462b bVar) {
            this.f171754e = gridLayoutManager;
            this.f171755f = bVar;
        }
    }

    /* renamed from: a */
    public final void mo120215a(TuxStatusView.C23263c cVar) {
        String str;
        StringBuilder sb = new StringBuilder("show status: ");
        if (C89219l.m154714a(cVar, mo120214A())) {
            str = "error";
        } else {
            str = "empty";
        }
        C77283a.m135111b("StoryArchListAssem", sb.append(str).toString());
        mo23379w().setVisibility(8);
        TuxStatusView z = mo120217z();
        C89219l.m154716b(z, "");
        z.setVisibility(0);
        mo120217z().setStatus(cVar);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        mo120217z().mo37867a();
        mo23379w().mo28083a(StoryArchListCell.class);
        mo23379w().setItemAnimator(null);
        PowerList w = mo23379w();
        az_();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(3);
        gridLayoutManager.mo4320a(new C76475i(gridLayoutManager, this));
        w.setLayoutManager(gridLayoutManager);
        super.mo20630b(view);
        AbstractC12818f.C12819a.m23063a(this, mo23378v(), C76483c.f171763a, C12856l.m23100a(), new C76477k(this), 4);
        AbstractC12818f.C12819a.m23063a(this, mo23378v(), C76484d.f171764a, (C12854k) null, new C76478l(this), 6);
        AssemViewModel.m23030a(mo23378v(), C76485e.f171765a, null, new C76479m(this), null, null, 26);
        AssemViewModel.m23030a(mo23378v(), C76486f.f171766a, null, new C76480n(this), null, null, 26);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.b$k */
    static final class C76477k extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, List<? extends C76487g>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76462b f171757a;

        static {
            Covode.recordClassIndex(89457);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76477k(C76462b bVar) {
            super(2);
            this.f171757a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, List<? extends C76487g> list) {
            List<? extends C76487g> list2 = list;
            C89219l.m154721d(pVar, "");
            C76462b bVar = this.f171757a;
            if (list2 == null || list2.isEmpty()) {
                bVar.mo120215a((TuxStatusView.C23263c) bVar.f171740j.getValue());
            } else {
                TuxStatusView z = bVar.mo120217z();
                C89219l.m154716b(z, "");
                z.setVisibility(8);
                bVar.mo23379w().setVisibility(0);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.b$l */
    static final class C76478l extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76462b f171758a;

        static {
            Covode.recordClassIndex(89458);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76478l(C76462b bVar) {
            super(2);
            this.f171758a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends String> aVar) {
            ActivityC0945e b;
            C12776a<? extends String> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(aVar2, "");
            T t = aVar2.f31085a;
            if (!TextUtils.isEmpty(t) && (b = C12777b.m23004b(this.f171758a)) != null) {
                SmartRouter.buildRoute(b, "aweme://story/detail").withParam("video_from", "STORY_ENTRANCE_ARCHIVE").withParam("enter_from", "story_archive").withParam("id", (String) t).open();
            }
            return C89391z.f203057a;
        }
    }
}
