package com.p2082ss.android.ugc.aweme.comment.supporterpanel;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.NiceWidthTextView;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.AbstractC23185a;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.sheet.AbstractC23219c;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.C36274b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.j */
public final class C36977j extends Fragment implements AbstractC23185a {

    /* renamed from: l */
    public static boolean f87078l;

    /* renamed from: m */
    public static final C36978a f87079m = new C36978a((byte) 0);

    /* renamed from: a */
    public C36274b f87080a;

    /* renamed from: b */
    public C36985k f87081b;

    /* renamed from: c */
    public C23226a f87082c;

    /* renamed from: d */
    public Aweme f87083d;

    /* renamed from: e */
    public String f87084e;

    /* renamed from: f */
    public AbstractC88412b f87085f;

    /* renamed from: g */
    public C36959f f87086g;

    /* renamed from: h */
    public final AbstractC18099f f87087h = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d();

    /* renamed from: i */
    public TuxDualBallView f87088i;

    /* renamed from: j */
    public RecyclerView f87089j;

    /* renamed from: k */
    public LinearLayout f87090k;

    /* renamed from: n */
    private SparseArray f87091n;

    static {
        Covode.recordClassIndex(44325);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.j$a */
    public static final class C36978a {
        static {
            Covode.recordClassIndex(44326);
        }

        private C36978a() {
        }

        public /* synthetic */ C36978a(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.j$a$a */
        public static final class DialogInterface$OnDismissListenerC36979a implements DialogInterface.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ Aweme f87092a;

            static {
                Covode.recordClassIndex(44327);
            }

            public DialogInterface$OnDismissListenerC36979a(Aweme aweme) {
                this.f87092a = aweme;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                String str;
                String str2;
                Aweme aweme = this.f87092a;
                if (C36977j.f87078l) {
                    str = "click_close_button";
                } else {
                    str = "click_on_video";
                }
                C33744d dVar = new C33744d();
                String str3 = null;
                if (aweme != null) {
                    str2 = aweme.getAid();
                } else {
                    str2 = null;
                }
                C33744d a = dVar.mo59983a("group_id", str2);
                if (aweme != null) {
                    str3 = aweme.getAuthorUid();
                }
                C39162r.m79460a("exit_top_gift_list", a.mo59983a("author_id", str3).mo59983a("exit_method", str).f79943a);
                C36977j.f87078l = false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.j$b */
    static final class C36980b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36977j f87093a;

        static {
            Covode.recordClassIndex(44328);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36980b(C36977j jVar) {
            super(0);
            this.f87093a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f87093a.mo64479f();
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final C36274b mo64475b() {
        C36274b bVar = this.f87080a;
        if (bVar == null) {
            C89219l.m154710a("mCommentInputManager");
        }
        return bVar;
    }

    /* renamed from: c */
    public final TuxDualBallView mo64476c() {
        TuxDualBallView tuxDualBallView = this.f87088i;
        if (tuxDualBallView == null) {
            C89219l.m154710a("tuxDualBallView");
        }
        return tuxDualBallView;
    }

    /* renamed from: e */
    public final void mo64478e() {
        LinearLayout linearLayout = this.f87090k;
        if (linearLayout == null) {
            C89219l.m154710a("errorView");
        }
        linearLayout.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f87091n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.tux.navigation.AbstractC23185a
    /* renamed from: a */
    public final TuxNavBar.C23179a mo37737a() {
        TuxNavBar.C23179a aVar = new TuxNavBar.C23179a();
        C23194g gVar = new C23194g();
        String string = getString(R.string.h8r);
        C89219l.m154716b(string, "");
        TuxNavBar.C23179a a = aVar.mo37731a(gVar.mo37753a(string));
        C23187b a2 = new C23187b().mo37738a(R.raw.icon_x_mark);
        a2.f54930b = true;
        return a.mo37733b(a2.mo37741a((AbstractC89171a<C89391z>) new C36980b(this)));
    }

    /* renamed from: d */
    public final void mo64477d() {
        VGGETSupporterPanelService vGGETSupporterPanelService = (VGGETSupporterPanelService) this.f87087h.mo28858a(VGGETSupporterPanelService.class);
        TuxDualBallView tuxDualBallView = this.f87088i;
        if (tuxDualBallView == null) {
            C89219l.m154710a("tuxDualBallView");
        }
        tuxDualBallView.mo37884b();
        vGGETSupporterPanelService.getSupporterPanel(this.f87084e).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C36981c(this));
    }

    /* renamed from: f */
    public final void mo64479f() {
        f87078l = true;
        AbstractC23219c.C23222c cVar = AbstractC23219c.C23222c.f55027a;
        C89219l.m154719c(this, "");
        C89219l.m154719c(cVar, "");
        C23226a c = C23226a.C23228b.m43792c(this);
        if (c != null) {
            C23226a.C23228b.m43786a(c.getDialog(), cVar);
            c.onCancel(c.getDialog());
            c.dismissAllowingStateLoss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.j$c */
    public static final class C36981c implements AbstractC88986z<C36959f> {

        /* renamed from: a */
        final /* synthetic */ C36977j f87094a;

        static {
            Covode.recordClassIndex(44329);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36981c(C36977j jVar) {
            this.f87094a = jVar;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
            this.f87094a.f87085f = bVar;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            this.f87094a.mo64476c().mo37885c();
            this.f87094a.mo64478e();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(C36959f fVar) {
            List<C36954a> list;
            C36959f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            this.f87094a.mo64476c().mo37885c();
            if (fVar2.f87039a == 0) {
                C36958e eVar = fVar2.f87041c;
                if (eVar == null || (list = eVar.f87038b) == null || !(!list.isEmpty())) {
                    this.f87094a.mo64479f();
                    this.f87094a.mo64475b().mo63479a("", "");
                    return;
                }
                this.f87094a.f87086g = fVar2;
                C36977j jVar = this.f87094a;
                C36985k kVar = jVar.f87081b;
                if (kVar == null) {
                    C89219l.m154710a("adapter");
                }
                jVar.mo64474a(kVar, fVar2, true);
                return;
            }
            this.f87094a.mo64478e();
        }
    }

    /* renamed from: a */
    private static Integer m74631a(C36958e eVar) {
        List<C36954a> list;
        int i;
        if (eVar == null || (list = eVar.f87038b) == null) {
            return null;
        }
        int size = list.size();
        if (eVar.f87037a != null) {
            i = 1;
        } else {
            i = 0;
        }
        return Integer.valueOf(size + i);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.j$d */
    static final class C36982d extends AbstractC89220m implements AbstractC89172b<C36954a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36977j f87095a;

        static {
            Covode.recordClassIndex(44330);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36982d(C36977j jVar) {
            super(1);
            this.f87095a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C36954a aVar) {
            C36954a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C36961h hVar = new C36961h();
            C36274b b = this.f87095a.mo64475b();
            C89219l.m154721d(b, "");
            hVar.f87043a = b;
            hVar.f87046d = this.f87095a.f87083d;
            hVar.f87044b = aVar2.f87016a;
            hVar.f87047e = aVar2.f87018c;
            C23226a aVar3 = this.f87095a.f87082c;
            if (aVar3 != null) {
                aVar3.mo37809a(hVar);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.j$e */
    static final class View$OnClickListenerC36983e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36977j f87096a;

        static {
            Covode.recordClassIndex(44331);
        }

        View$OnClickListenerC36983e(C36977j jVar) {
            this.f87096a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            LinearLayout linearLayout = this.f87096a.f87090k;
            if (linearLayout == null) {
                C89219l.m154710a("errorView");
            }
            linearLayout.setVisibility(8);
            this.f87096a.mo64476c().mo37884b();
            this.f87096a.mo64477d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.j$f */
    static final class View$OnClickListenerC36984f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36977j f87097a;

        static {
            Covode.recordClassIndex(44332);
        }

        View$OnClickListenerC36984f(C36977j jVar) {
            this.f87097a = jVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C33744d a = new C33744d().mo59983a("enter_from", "supporter_panel").mo59983a("enter_method", "send_button");
            Aweme aweme = this.f87097a.f87083d;
            String str2 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            C33744d a2 = a.mo59983a("group_id", str);
            Aweme aweme2 = this.f87097a.f87083d;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            }
            C39162r.m79460a("click_send_gift_button", a2.mo59983a("author_id", str2).f79943a);
            this.f87097a.mo64475b().mo63479a("", "");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Aweme aweme = this.f87083d;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        this.f87084e = str;
        View findViewById = view.findViewById(R.id.ec0);
        C89219l.m154716b(findViewById, "");
        this.f87089j = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.ec1);
        C89219l.m154716b(findViewById2, "");
        this.f87088i = (TuxDualBallView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ebx);
        C89219l.m154716b(findViewById3, "");
        this.f87090k = (LinearLayout) findViewById3;
        C36985k kVar = new C36985k();
        this.f87081b = kVar;
        kVar.f87099b = new C36982d(this);
        RecyclerView recyclerView = this.f87089j;
        if (recyclerView == null) {
            C89219l.m154710a("recyclerView");
        }
        C36985k kVar2 = this.f87081b;
        if (kVar2 == null) {
            C89219l.m154710a("adapter");
        }
        recyclerView.setAdapter(kVar2);
        RecyclerView recyclerView2 = this.f87089j;
        if (recyclerView2 == null) {
            C89219l.m154710a("recyclerView");
        }
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        if (this.f87086g == null) {
            mo64477d();
        } else {
            C36985k kVar3 = this.f87081b;
            if (kVar3 == null) {
                C89219l.m154710a("adapter");
            }
            C36959f fVar = this.f87086g;
            if (fVar == null) {
                C89219l.m154715b();
            }
            mo64474a(kVar3, fVar, false);
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.eby);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setClickable(true);
        tuxTextView.setOnClickListener(new View$OnClickListenerC36983e(this));
        ((NiceWidthTextView) view.findViewById(R.id.ec2)).setOnClickListener(new View$OnClickListenerC36984f(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.ih, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo64474a(C36985k kVar, C36959f fVar, boolean z) {
        C36960g gVar;
        List<C36954a> list;
        String str;
        String str2;
        C36958e eVar = fVar.f87041c;
        String str3 = null;
        if (eVar != null) {
            gVar = eVar.f87037a;
        } else {
            gVar = null;
        }
        kVar.f87098a = gVar;
        if (z) {
            C33744d a = new C33744d().mo59983a("enter_from", "gift_summary_stripe").mo59983a("enter_method", "click");
            Aweme aweme = this.f87083d;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            C33744d a2 = a.mo59983a("group_id", str);
            Aweme aweme2 = this.f87083d;
            if (aweme2 != null) {
                str3 = aweme2.getAuthorUid();
            }
            C33744d a3 = a2.mo59983a("author_id", str3).mo59982a("num_results", m74631a(eVar));
            if (gVar != null) {
                str2 = "premium";
            } else {
                str2 = "";
            }
            C39162r.m79460a("show_top_gift_list", a3.mo59983a("banner", str2).f79943a);
        }
        if (!(eVar == null || (list = eVar.f87038b) == null)) {
            kVar.mo64483a(list);
        }
        kVar.notifyDataSetChanged();
        RecyclerView recyclerView = this.f87089j;
        if (recyclerView == null) {
            C89219l.m154710a("recyclerView");
        }
        recyclerView.setVisibility(0);
    }
}
