package com.p2082ss.android.ugc.aweme.favorites.p2921c;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.AbstractC12800c;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39054a;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39059e;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.favorites.api.C47192d;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47797a;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47802d;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.favorites.c.f */
public final class C47235f extends AbstractC12769a {

    /* renamed from: k */
    public static final C47262t f109904k = new C47262t((byte) 0);

    /* renamed from: j */
    public boolean f109905j;

    /* renamed from: l */
    private final C12786i f109906l = new C12786i(bW_(), new C47260r(this, null));

    /* renamed from: m */
    private final C12786i f109907m = new C12786i(bW_(), new C47261s(this, null));

    /* renamed from: n */
    private final C12814b f109908n;

    /* renamed from: o */
    private final AbstractC89244h f109909o;

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$j */
    public static final class C47252j extends AbstractC89220m implements AbstractC89172b<C47802d, C47802d> {
        public static final C47252j INSTANCE = new C47252j();

        static {
            Covode.recordClassIndex(55865);
        }

        public C47252j() {
            super(1);
        }

        public final C47802d invoke(C47802d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$v */
    public interface AbstractC47264v extends AbstractC12800c {
        static {
            Covode.recordClassIndex(55877);
        }

        /* renamed from: a */
        void mo79655a(View view, Aweme aweme);

        /* renamed from: a */
        void mo79656a(Aweme aweme);
    }

    static {
        Covode.recordClassIndex(55848);
    }

    /* renamed from: v */
    public final C47192d mo79647v() {
        return (C47192d) this.f109906l.getValue();
    }

    /* renamed from: w */
    public final C47263u mo79648w() {
        return (C47263u) this.f109907m.getValue();
    }

    /* renamed from: x */
    public final VideoCollectionContentViewModel mo79649x() {
        return (VideoCollectionContentViewModel) this.f109908n.getValue();
    }

    /* renamed from: y */
    public final AbstractC47264v mo79650y() {
        return (AbstractC47264v) this.f109909o.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$g */
    public static final class C47249g extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109926a;

        static {
            Covode.recordClassIndex(55862);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47249g(AbstractC12748a aVar) {
            super(0);
            this.f109926a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f109926a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$t */
    public static final class C47262t {
        static {
            Covode.recordClassIndex(55875);
        }

        private C47262t() {
        }

        public /* synthetic */ C47262t(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$f */
    public static final class C47248f extends AbstractC89220m implements AbstractC89171a<C12874b<C47802d>> {
        public static final C47248f INSTANCE = new C47248f();

        static {
            Covode.recordClassIndex(55861);
        }

        public C47248f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47802d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$h */
    public static final class C47250h extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109927a;

        static {
            Covode.recordClassIndex(55863);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47250h(AbstractC12748a aVar) {
            super(0);
            this.f109927a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f109927a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$l */
    public static final class C47254l extends AbstractC89220m implements AbstractC89171a<C12874b<C47802d>> {
        public static final C47254l INSTANCE = new C47254l();

        static {
            Covode.recordClassIndex(55867);
        }

        public C47254l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47802d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$q */
    public static final class C47259q extends AbstractC89220m implements AbstractC89171a<C12874b<C47802d>> {
        public static final C47259q INSTANCE = new C47259q();

        static {
            Covode.recordClassIndex(55872);
        }

        public C47259q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47802d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$y */
    final class C47269y extends AbstractC39054a {

        /* renamed from: a */
        public final TextView f109952a;

        /* renamed from: b */
        public final CheckBox f109953b;

        /* renamed from: c */
        public final View f109954c;

        /* renamed from: d */
        public final View f109955d;

        /* renamed from: e */
        final /* synthetic */ C47235f f109956e;

        static {
            Covode.recordClassIndex(55882);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39054a
        /* renamed from: b */
        public final int[] mo62380b() {
            return C80397em.m139369a(200);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
        /* renamed from: c */
        public final void mo62381c() {
            if (this.f92231m != null) {
                Object obj = this.f92231m;
                C89219l.m154716b(obj, "");
                Video video = ((Aweme) obj).getVideo();
                if (video == null) {
                    return;
                }
                if (mo67790a(video, "AbsAwemeViewHolder")) {
                    this.f92233o = true;
                } else {
                    mo67788a(video.getCover(), "AbsAwemeViewHolder");
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$y$b */
        static final class View$OnClickListenerC47271b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C47269y f109961a;

            static {
                Covode.recordClassIndex(55884);
            }

            View$OnClickListenerC47271b(C47269y yVar) {
                this.f109961a = yVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f109961a.f109954c.callOnClick();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$y$a */
        static final class View$OnClickListenerC47270a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C47269y f109957a;

            /* renamed from: b */
            final /* synthetic */ boolean f109958b;

            /* renamed from: c */
            final /* synthetic */ ActivityC0945e f109959c;

            /* renamed from: d */
            final /* synthetic */ C47797a f109960d;

            static {
                Covode.recordClassIndex(55883);
            }

            View$OnClickListenerC47270a(C47269y yVar, boolean z, ActivityC0945e eVar, C47797a aVar) {
                this.f109957a = yVar;
                this.f109958b = z;
                this.f109959c = eVar;
                this.f109960d = aVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f109958b) {
                    new C23144b(this.f109959c).mo37640e(R.string.bsm).mo37637b();
                    this.f109957a.f109953b.setChecked(false);
                    return;
                }
                VideoCollectionContentViewModel x = this.f109957a.f109956e.mo79649x();
                Aweme aweme = this.f109960d.f110745a;
                int i = 2;
                if (this.f109960d.f110746b == 2) {
                    i = 1;
                }
                C47797a aVar = new C47797a(aweme, i);
                C89219l.m154721d(aVar, "");
                x.mo20662a(new VideoCollectionContentViewModel.C47781g(aVar));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$y$c */
        static final class View$OnClickListenerC47272c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C47269y f109962a;

            /* renamed from: b */
            final /* synthetic */ C47797a f109963b;

            /* renamed from: c */
            final /* synthetic */ boolean f109964c;

            /* renamed from: d */
            final /* synthetic */ ActivityC0945e f109965d;

            /* renamed from: e */
            final /* synthetic */ boolean f109966e;

            static {
                Covode.recordClassIndex(55885);
            }

            View$OnClickListenerC47272c(C47269y yVar, C47797a aVar, boolean z, ActivityC0945e eVar, boolean z2) {
                this.f109962a = yVar;
                this.f109963b = aVar;
                this.f109964c = z;
                this.f109965d = eVar;
                this.f109966e = z2;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C39162r.m79460a("click_personal_collection", new C33744d().mo59983a("enter_from", "collection_video").mo59983a("content", "video").mo59983a("video_id", this.f109963b.f110745a.getAid()).f79943a);
                if (!this.f109964c) {
                    new C23144b(this.f109965d).mo37640e(R.string.bt0).mo37637b();
                } else if (!this.f109966e) {
                    AbstractC47264v y = this.f109962a.f109956e.mo79650y();
                    View view2 = this.f109962a.itemView;
                    C89219l.m154716b(view2, "");
                    y.mo79655a(view2, this.f109963b.f110745a);
                } else if (this.f109963b.f110746b == 0) {
                    this.f109962a.f109956e.mo79650y().mo79656a(this.f109963b.f110745a);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo67806a(Aweme aweme, int i) {
            if (aweme != null) {
                super.mo67806a((Object) aweme, i);
                this.f92231m = aweme;
                mo62381c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47269y(C47235f fVar, ViewGroup viewGroup) {
            super(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a03, viewGroup, false));
            C89219l.m154721d(viewGroup, "");
            this.f109956e = fVar;
            View findViewById = this.itemView.findViewById(R.id.emg);
            C89219l.m154716b(findViewById, "");
            this.f109952a = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.dur);
            C89219l.m154716b(findViewById2, "");
            this.f109953b = (CheckBox) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.duz);
            C89219l.m154716b(findViewById3, "");
            this.f109954c = findViewById3;
            View findViewById4 = this.itemView.findViewById(R.id.all);
            C89219l.m154716b(findViewById4, "");
            this.f109955d = findViewById4;
            this.f92232n = (SmartImageView) this.itemView.findViewById(R.id.afn);
            if (C16048b.m29633a().mo25421a(true, "stop_main_anim_when_invisible", false)) {
                this.f92232n.setAnimationListener(this.f92226l);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$aa */
    static final class C47237aa extends AbstractC89220m implements AbstractC89171a<AbstractC47264v> {

        /* renamed from: a */
        final /* synthetic */ C47235f f109911a;

        static {
            Covode.recordClassIndex(55850);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47237aa(C47235f fVar) {
            super(0);
            this.f109911a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC47264v invoke() {
            return C12801d.m23023b(this.f109911a, C89204ab.m154669a(AbstractC47264v.class));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$ab */
    static final class C47238ab implements AbstractC39063h.AbstractC39067a {

        /* renamed from: a */
        final /* synthetic */ C47268x f109912a;

        /* renamed from: b */
        final /* synthetic */ C47235f f109913b;

        static {
            Covode.recordClassIndex(55851);
        }

        C47238ab(C47268x xVar, C47235f fVar) {
            this.f109912a = xVar;
            this.f109913b = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
        /* renamed from: l */
        public final void mo62679l() {
            C47235f.m22977a(this.f109913b.mo79649x(), new AbstractC89172b<C47802d, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2921c.C47235f.C47238ab.C472391 */

                /* renamed from: a */
                final /* synthetic */ C47238ab f109914a;

                static {
                    Covode.recordClassIndex(55852);
                }

                {
                    this.f109914a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C47802d dVar) {
                    Integer num;
                    C47802d dVar2 = dVar;
                    C89219l.m154721d(dVar2, "");
                    StringBuilder sb = new StringBuilder("load more videos: type = ");
                    C47263u w = this.f109914a.f109913b.mo79648w();
                    if (w != null) {
                        num = Integer.valueOf(w.f109938a);
                    } else {
                        num = null;
                    }
                    ALog.m59865d("Collections", sb.append(num).append(", hasMore = ").append(dVar2.f110753c).append(", cursor = ").append(dVar2.f110752b).toString());
                    if (dVar2.f110753c) {
                        this.f109914a.f109912a.ao_();
                        this.f109914a.f109913b.mo79646a(false);
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$ad */
    static final class C47241ad extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f109918a;

        /* renamed from: b */
        final /* synthetic */ C47268x f109919b;

        static {
            Covode.recordClassIndex(55854);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47241ad(RecyclerView recyclerView, C47268x xVar) {
            super(0);
            this.f109918a = recyclerView;
            this.f109919b = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f109918a.setVisibility(8);
            this.f109919b.mo67810f();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$i */
    public static final class C47251i extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109928a;

        static {
            Covode.recordClassIndex(55864);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47251i(AbstractC12748a aVar) {
            super(0);
            this.f109928a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f109928a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$k */
    public static final class C47253k extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109929a;

        static {
            Covode.recordClassIndex(55866);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47253k(AbstractC12748a aVar) {
            super(0);
            this.f109929a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f109929a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$a */
    public static final class C47236a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f109910a;

        static {
            Covode.recordClassIndex(55849);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47236a(AbstractC89277c cVar) {
            super(0);
            this.f109910a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f109910a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$b */
    public static final class C47244b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109922a;

        static {
            Covode.recordClassIndex(55857);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47244b(AbstractC12748a aVar) {
            super(0);
            this.f109922a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f109922a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$c */
    public static final class C47245c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109923a;

        static {
            Covode.recordClassIndex(55858);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47245c(AbstractC12748a aVar) {
            super(0);
            this.f109923a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f109923a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$m */
    public static final class C47255m extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109930a;

        static {
            Covode.recordClassIndex(55868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47255m(AbstractC12748a aVar) {
            super(0);
            this.f109930a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f109930a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$n */
    public static final class C47256n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109931a;

        static {
            Covode.recordClassIndex(55869);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47256n(AbstractC12748a aVar) {
            super(0);
            this.f109931a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f109931a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$o */
    public static final class C47257o extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109932a;

        static {
            Covode.recordClassIndex(55870);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47257o(AbstractC12748a aVar) {
            super(0);
            this.f109932a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f109932a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$p */
    public static final class C47258p extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109933a;

        static {
            Covode.recordClassIndex(55871);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47258p(AbstractC12748a aVar) {
            super(0);
            this.f109933a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f109933a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$r */
    public static final class C47260r extends AbstractC89220m implements AbstractC89171a<C47192d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109934a;

        /* renamed from: b */
        final /* synthetic */ String f109935b;

        static {
            Covode.recordClassIndex(55873);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47260r(AbstractC12748a aVar, String str) {
            super(0);
            this.f109934a = aVar;
            this.f109935b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.favorites.api.d, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.favorites.api.C47192d invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f109934a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.favorites.api.d> r1 = com.p2082ss.android.ugc.aweme.favorites.api.C47192d.class
                java.lang.String r0 = r3.f109935b
                java.lang.Object r0 = r2.mo20603a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.favorites.p2921c.C47235f.C47260r.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$s */
    public static final class C47261s extends AbstractC89220m implements AbstractC89171a<C47263u> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109936a;

        /* renamed from: b */
        final /* synthetic */ String f109937b;

        static {
            Covode.recordClassIndex(55874);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47261s(AbstractC12748a aVar, String str) {
            super(0);
            this.f109936a = aVar;
            this.f109937b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.favorites.c.f$u, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.favorites.p2921c.C47235f.C47263u invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f109936a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.favorites.c.f$u> r1 = com.p2082ss.android.ugc.aweme.favorites.p2921c.C47235f.C47263u.class
                java.lang.String r0 = r3.f109937b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.favorites.p2921c.C47235f.C47261s.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$z */
    static final class C47273z extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C47235f f109967a;

        static {
            Covode.recordClassIndex(55886);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47273z(C47235f fVar) {
            super(0);
            this.f109967a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            String str = this.f109967a.mo79647v().f109842a;
            if (str == null) {
                str = "";
            }
            return VideoCollectionContentViewModel.C47759a.m90805a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$d */
    public static final class C47246d extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109924a;

        static {
            Covode.recordClassIndex(55859);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47246d(AbstractC12748a aVar) {
            super(0);
            this.f109924a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f109924a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$e */
    public static final class C47247e extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f109925a;

        static {
            Covode.recordClassIndex(55860);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47247e(AbstractC12748a aVar) {
            super(0);
            this.f109925a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f109925a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C47235f() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        C47273z zVar = new C47273z(this);
        AbstractC89277c a = C89204ab.m154669a(VideoCollectionContentViewModel.class);
        C47236a aVar = new C47236a(a);
        C47252j jVar = C47252j.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C47254l.INSTANCE, new C47255m(this), new C47256n(this), zVar, jVar, new C47257o(this), new C47258p(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C47259q.INSTANCE, new C47244b(this), new C47245c(this), zVar, jVar, new C47246d(this), new C47247e(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C47248f.INSTANCE, new C47249g(this), new C47250h(this), zVar, jVar, new C47251i(this), new C47253k(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f109908n = bVar;
        this.f109909o = C89250i.m154773a((AbstractC89171a) new C47237aa(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$af */
    public static final class C47243af extends GridLayoutManager.AbstractC1337c {

        /* renamed from: e */
        final /* synthetic */ C47268x f109921e;

        static {
            Covode.recordClassIndex(55856);
        }

        C47243af(C47268x xVar) {
            this.f109921e = xVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            if (this.f109921e.getItemViewType(i) == 0) {
                return 3;
            }
            return 1;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$ae */
    static final class C47242ae extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f109920a;

        static {
            Covode.recordClassIndex(55855);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47242ae(RecyclerView recyclerView) {
            super(1);
            this.f109920a = recyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            this.f109920a.setVisibility(8);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$x */
    final class C47268x extends AbstractC34766g<C47797a> {

        /* renamed from: d */
        public final ActivityC0945e f109949d;

        /* renamed from: e */
        public final boolean f109950e;

        /* renamed from: f */
        final /* synthetic */ C47235f f109951f;

        static {
            Covode.recordClassIndex(55881);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
        /* renamed from: c */
        public final int mo60936c(int i) {
            if (this.f109950e || i != 0) {
                return 1;
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            C89219l.m154721d(viewHolder, "");
            super.onViewAttachedToWindow(viewHolder);
            if (viewHolder instanceof C47269y) {
                ((AbstractC39059e) viewHolder).mo66994b(true);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
        public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            C89219l.m154721d(viewHolder, "");
            super.onViewDetachedFromWindow(viewHolder);
            if (viewHolder instanceof C47269y) {
                AbstractC39059e eVar = (AbstractC39059e) viewHolder;
                eVar.mo66994b(false);
                eVar.f92232n.mo34198c();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
        /* renamed from: a */
        public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
            C89219l.m154721d(viewGroup, "");
            if (i == 0) {
                return new C47265w(this.f109951f, viewGroup);
            }
            if (i == 1) {
                return new C47269y(this.f109951f, viewGroup);
            }
            throw new Exception("not match view type");
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
        /* renamed from: a */
        public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
            long j;
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int i3;
            Long l;
            List e = mo63369e();
            Long l2 = null;
            if (e != null && C89070n.m154561b(e, i) != null) {
                int i4 = 0;
                if (viewHolder instanceof C47265w) {
                    C47265w wVar = (C47265w) viewHolder;
                    ActivityC0945e eVar = this.f109949d;
                    if (mo63369e().size() == 1 || ((C47797a) mo63369e().get(i)).f110746b != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    C89219l.m154721d(eVar, "");
                    wVar.f109940a.setText(wVar.f109945f.mo79647v().f109843b);
                    TextView textView = wVar.f109941b;
                    View view = wVar.itemView;
                    C89219l.m154716b(view, "");
                    Context context = view.getContext();
                    C89219l.m154716b(context, "");
                    Resources resources = context.getResources();
                    C47192d.C47193a aVar = wVar.f109945f.mo79647v().f109846e;
                    if (aVar == null || (l = aVar.f109847a) == null) {
                        i3 = 0;
                    } else {
                        i3 = (int) l.longValue();
                    }
                    Object[] objArr = new Object[1];
                    C47192d.C47193a aVar2 = wVar.f109945f.mo79647v().f109846e;
                    if (aVar2 != null) {
                        l2 = aVar2.f109847a;
                    }
                    objArr[0] = String.valueOf(l2);
                    textView.setText(resources.getQuantityString(R.plurals.ck, i3, objArr));
                    if (z4) {
                        wVar.f109943d.setIconRes(R.raw.icon_plus);
                        wVar.f109944e.setText(R.string.bt7);
                        wVar.f109942c.setOnClickListener(new C47265w.View$OnClickListenerC47266a(wVar, eVar));
                    } else {
                        wVar.f109943d.setIconRes(R.raw.icon_gear);
                        wVar.f109944e.setText(R.string.bt_);
                        wVar.f109942c.setOnClickListener(new C47265w.View$OnClickListenerC47267b(wVar));
                    }
                    wVar.f109944e.requestLayout();
                } else if (viewHolder instanceof C47269y) {
                    C47269y yVar = (C47269y) viewHolder;
                    ActivityC0945e eVar2 = this.f109949d;
                    Object obj = mo63369e().get(i);
                    C89219l.m154716b(obj, "");
                    C47797a aVar3 = (C47797a) obj;
                    C89219l.m154721d(eVar2, "");
                    C89219l.m154721d(aVar3, "");
                    yVar.f92234p = true;
                    TextView textView2 = yVar.f109952a;
                    AwemeStatistics statistics = aVar3.f110745a.getStatistics();
                    if (statistics != null) {
                        j = statistics.getPlayCount();
                    } else {
                        j = 0;
                    }
                    textView2.setText(C53437b.m98615a(j));
                    View view2 = yVar.f109954c;
                    if (aVar3.f110746b != 0) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    view2.setVisibility(i2);
                    CheckBox checkBox = yVar.f109953b;
                    if (aVar3.f110746b == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    checkBox.setChecked(z);
                    if (aVar3.f110745a.isDelete() || !aVar3.f110745a.isCanPlay()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (aVar3.f110746b != 1) {
                        z3 = true;
                    } else {
                        z3 = yVar.f109956e.f109905j;
                    }
                    View view3 = yVar.f109955d;
                    if (z3 && (aVar3.f110746b != 1 || !z2)) {
                        i4 = 8;
                    }
                    view3.setVisibility(i4);
                    yVar.f109953b.setEnabled(z3);
                    yVar.f109954c.setEnabled(z3);
                    yVar.f109954c.setOnClickListener(new C47269y.View$OnClickListenerC47270a(yVar, z2, eVar2, aVar3));
                    yVar.f109953b.setOnClickListener(new C47269y.View$OnClickListenerC47271b(yVar));
                    yVar.mo67806a(aVar3.f110745a, i);
                    yVar.itemView.setOnClickListener(new C47269y.View$OnClickListenerC47272c(yVar, aVar3, z3, eVar2, z2));
                } else {
                    throw new Exception("not match view type");
                }
            }
        }

        public C47268x(C47235f fVar, ActivityC0945e eVar, boolean z) {
            C89219l.m154721d(eVar, "");
            this.f109951f = fVar;
            this.f109949d = eVar;
            this.f109950e = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$w */
    final class C47265w extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f109940a;

        /* renamed from: b */
        public final TextView f109941b;

        /* renamed from: c */
        public final View f109942c;

        /* renamed from: d */
        public final TuxIconView f109943d;

        /* renamed from: e */
        public final TextView f109944e;

        /* renamed from: f */
        final /* synthetic */ C47235f f109945f;

        static {
            Covode.recordClassIndex(55878);
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$w$a */
        static final class View$OnClickListenerC47266a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C47265w f109946a;

            /* renamed from: b */
            final /* synthetic */ ActivityC0945e f109947b;

            static {
                Covode.recordClassIndex(55879);
            }

            View$OnClickListenerC47266a(C47265w wVar, ActivityC0945e eVar) {
                this.f109946a = wVar;
                this.f109947b = eVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                SmartRouter.buildRoute(this.f109947b, "aweme://favorite/videos/collections/add/video").withParam("collectionId", this.f109946a.f109945f.mo79647v().f109842a).withParam("from", "COLLECTION_CONTENT").open();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$w$b */
        static final class View$OnClickListenerC47267b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C47265w f109948a;

            static {
                Covode.recordClassIndex(55880);
            }

            View$OnClickListenerC47267b(C47265w wVar) {
                this.f109948a = wVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C39162r.m79462a("collection_manage_videos", C89387v.m154943a("collection_video", "enter_from"), C89387v.m154943a(this.f109948a.f109945f.mo79647v().f109842a, "collection_id"));
                this.f109948a.f109945f.mo79649x().mo79853a(true);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47265w(C47235f fVar, ViewGroup viewGroup) {
            super(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a00, viewGroup, false));
            C89219l.m154721d(viewGroup, "");
            this.f109945f = fVar;
            View findViewById = this.itemView.findViewById(R.id.a7u);
            C89219l.m154716b(findViewById, "");
            this.f109940a = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.a7v);
            C89219l.m154716b(findViewById2, "");
            this.f109941b = (TextView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.y_);
            C89219l.m154716b(findViewById3, "");
            this.f109942c = findViewById3;
            View findViewById4 = this.itemView.findViewById(R.id.xv);
            C89219l.m154716b(findViewById4, "");
            this.f109943d = (TuxIconView) findViewById4;
            View findViewById5 = this.itemView.findViewById(R.id.z5);
            C89219l.m154716b(findViewById5, "");
            this.f109944e = (TextView) findViewById5;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo79646a(boolean z) {
        Integer valueOf;
        C47263u w = mo79648w();
        if (w != null && (valueOf = Integer.valueOf(w.f109938a)) != null) {
            if (valueOf.intValue() == 1) {
                mo79649x().mo79854b(z);
            } else if (valueOf.intValue() == 0) {
                mo79649x().mo79856d(z);
            } else if (valueOf.intValue() == 2) {
                mo79649x().mo79855c(z);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        boolean z;
        C89219l.m154721d(view, "");
        RecyclerView recyclerView = (RecyclerView) view;
        ActivityC0945e b = C12777b.m23004b(this);
        if (b != null) {
            C47263u w = mo79648w();
            if (w == null || w.f109938a != 0) {
                z = true;
            } else {
                z = false;
            }
            C47268x xVar = new C47268x(this, b, z);
            xVar.mo67813a((AbstractC39063h.AbstractC39067a) new C47238ab(xVar, this));
            xVar.f92247s = new C47243af(xVar);
            az_();
            recyclerView.setLayoutManager(new GridLayoutManager(3));
            recyclerView.setAdapter(xVar);
            VideoCollectionContentViewModel x = mo79649x();
            AbstractC89290k kVar = C47274g.f109968a;
            C47240ac acVar = new C47240ac(this, xVar, recyclerView);
            AssemViewModel.m23030a(x, kVar, null, new C47242ae(recyclerView), new C47241ad(recyclerView, xVar), acVar, 2);
            mo79646a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$ac */
    static final class C47240ac extends AbstractC89220m implements AbstractC89172b<List<? extends C47797a>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C47235f f109915a;

        /* renamed from: b */
        final /* synthetic */ C47268x f109916b;

        /* renamed from: c */
        final /* synthetic */ RecyclerView f109917c;

        static {
            Covode.recordClassIndex(55853);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47240ac(C47235f fVar, C47268x xVar, RecyclerView recyclerView) {
            super(1);
            this.f109915a = fVar;
            this.f109916b = xVar;
            this.f109917c = recyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x008d  */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(java.util.List<? extends com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47797a> r9) {
            /*
            // Method dump skipped, instructions count: 162
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.favorites.p2921c.C47235f.C47240ac.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$u */
    public static final class C47263u implements AbstractC12779c {

        /* renamed from: a */
        public final int f109938a;

        /* renamed from: b */
        public final int f109939b;

        static {
            Covode.recordClassIndex(55876);
        }

        public C47263u() {
            this(0, 0, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C47263u)) {
                return false;
            }
            C47263u uVar = (C47263u) obj;
            return this.f109938a == uVar.f109938a && this.f109939b == uVar.f109939b;
        }

        public final int hashCode() {
            return (this.f109938a * 31) + this.f109939b;
        }

        public final String toString() {
            return "Config(type=" + this.f109938a + ", maxEnableSelectCount=" + this.f109939b + ")";
        }

        public C47263u(int i, int i2) {
            this.f109938a = i;
            this.f109939b = i2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C47263u(int i, int i2, int i3) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? Integer.MAX_VALUE : i2);
        }
    }
}
