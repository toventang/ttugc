package com.p2082ss.android.ugc.aweme.comment.supporterpanel;

import android.os.Bundle;
import android.os.Handler;
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
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.AbstractC23185a;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.comment.C36274b;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz;
import com.p2082ss.android.ugc.aweme.comment.supporterpanel.C36967i;
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
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.h */
public final class C36961h extends Fragment implements AbstractC23185a {

    /* renamed from: a */
    public C36274b f87043a;

    /* renamed from: b */
    public C36956c f87044b;

    /* renamed from: c */
    public String f87045c;

    /* renamed from: d */
    public Aweme f87046d;

    /* renamed from: e */
    public String f87047e;

    /* renamed from: f */
    public final AbstractC18099f f87048f = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d();

    /* renamed from: g */
    public AbstractC88412b f87049g;

    /* renamed from: h */
    public VGGifterPanelService f87050h;

    /* renamed from: i */
    public boolean f87051i;

    /* renamed from: j */
    public boolean f87052j = true;

    /* renamed from: k */
    public long f87053k;

    /* renamed from: l */
    public LinearLayoutManager f87054l;

    /* renamed from: m */
    public C36967i f87055m;

    /* renamed from: n */
    public LinearLayout f87056n;

    /* renamed from: o */
    public LinearLayout f87057o;

    /* renamed from: p */
    public TuxDualBallView f87058p;

    /* renamed from: q */
    private RecyclerView f87059q;

    /* renamed from: r */
    private RecyclerView.AbstractC1371n f87060r;

    /* renamed from: s */
    private SparseArray f87061s;

    static {
        Covode.recordClassIndex(44309);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.h$a */
    static final class C36962a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36961h f87062a;

        static {
            Covode.recordClassIndex(44310);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36962a(C36961h hVar) {
            super(0);
            this.f87062a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C23226a.C23228b.m43791b(this.f87062a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final TuxDualBallView mo64465b() {
        TuxDualBallView tuxDualBallView = this.f87058p;
        if (tuxDualBallView == null) {
            C89219l.m154710a("tuxDualBallView");
        }
        return tuxDualBallView;
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f87061s;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: c */
    public final void mo64466c() {
        RecyclerView recyclerView = this.f87059q;
        if (recyclerView == null) {
            C89219l.m154710a("recyclerView");
        }
        if (recyclerView.getVisibility() != 0) {
            LinearLayout linearLayout = this.f87056n;
            if (linearLayout == null) {
                C89219l.m154710a("errorView");
            }
            linearLayout.setVisibility(0);
        }
    }

    /* renamed from: d */
    public final void mo64467d() {
        TuxDualBallView tuxDualBallView = this.f87058p;
        if (tuxDualBallView == null) {
            C89219l.m154710a("tuxDualBallView");
        }
        tuxDualBallView.mo37884b();
        VGGifterPanelService vGGifterPanelService = this.f87050h;
        if (vGGifterPanelService == null) {
            C89219l.m154710a("api");
        }
        mo64464a(vGGifterPanelService);
    }

    @Override // com.bytedance.tux.navigation.AbstractC23185a
    /* renamed from: a */
    public final TuxNavBar.C23179a mo37737a() {
        TuxNavBar.C23179a aVar = new TuxNavBar.C23179a();
        C23187b a = new C23187b().mo37738a(R.raw.icon_chevron_left_ltr);
        a.f54930b = true;
        return aVar.mo37732a(a.mo37741a((AbstractC89171a<C89391z>) new C36962a(this))).mo37731a(new C23194g().mo37753a("Gifters"));
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.h$b */
    public static final class C36963b implements AbstractC88986z<C36955b> {

        /* renamed from: a */
        final /* synthetic */ C36961h f87063a;

        static {
            Covode.recordClassIndex(44311);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36963b(C36961h hVar) {
            this.f87063a = hVar;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
            this.f87063a.f87049g = bVar;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            this.f87063a.mo64465b().mo37885c();
            this.f87063a.mo64466c();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(C36955b bVar) {
            Integer num;
            String str;
            C36955b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            this.f87063a.mo64465b().mo37885c();
            if (bVar2.f87019a == 0) {
                LinearLayout linearLayout = this.f87063a.f87057o;
                if (linearLayout == null) {
                    C89219l.m154710a("gifterPanelView");
                }
                linearLayout.setVisibility(0);
                C36967i a = C36961h.m74623a(this.f87063a);
                if (a.f87069b && a.f87068a.size() != 0) {
                    a.f87068a.remove(a.f87068a.size() - 1);
                    a.notifyItemRemoved(a.f87068a.size());
                    a.f87069b = false;
                }
                List<C36957d> list = bVar2.f87021c;
                if (list != null) {
                    C36967i a2 = C36961h.m74623a(this.f87063a);
                    C89219l.m154721d(list, "");
                    new Handler().post(new C36967i.RunnableC36974f(a2, list));
                }
                this.f87063a.f87052j = bVar2.f87022d;
                Long l = bVar2.f87023e;
                if (l != null) {
                    this.f87063a.f87053k = l.longValue();
                }
                if (!this.f87063a.f87051i) {
                    C36961h hVar = this.f87063a;
                    List<C36957d> list2 = bVar2.f87021c;
                    String str2 = null;
                    if (list2 != null) {
                        num = Integer.valueOf(list2.size());
                    } else {
                        num = null;
                    }
                    C33744d a3 = new C33744d().mo59983a("enter_from", hVar.f87047e).mo59983a("enter_method", "click");
                    Aweme aweme = hVar.f87046d;
                    if (aweme != null) {
                        str = aweme.getAid();
                    } else {
                        str = null;
                    }
                    C33744d a4 = a3.mo59983a("group_id", str);
                    Aweme aweme2 = hVar.f87046d;
                    if (aweme2 != null) {
                        str2 = aweme2.getAuthorUid();
                    }
                    C39162r.m79460a("show_gifters_list", a4.mo59983a("author_id", str2).mo59982a("num_results", num).f79943a);
                } else if (!this.f87063a.f87052j) {
                    new Handler().post(new C36967i.RunnableC36975g(C36961h.m74623a(this.f87063a)));
                }
            } else {
                this.f87063a.mo64466c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.h$e */
    public static final class C36966e extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C36961h f87066a;

        static {
            Covode.recordClassIndex(44314);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36966e(C36961h hVar) {
            this.f87066a = hVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            Integer num;
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
            Integer num2 = null;
            if (layoutManager != null) {
                num = Integer.valueOf(layoutManager.mo4685A());
            } else {
                num = null;
            }
            LinearLayoutManager linearLayoutManager = this.f87066a.f87054l;
            if (linearLayoutManager == null || (num2 = Integer.valueOf(linearLayoutManager.mo4373m())) == null) {
                C89219l.m154715b();
            }
            int intValue = num2.intValue() + 1;
            if (num != null && num.intValue() == intValue && this.f87066a.f87052j && !C36961h.m74623a(this.f87066a).f87069b) {
                C36961h hVar = this.f87066a;
                hVar.f87051i = true;
                C36967i iVar = hVar.f87055m;
                if (iVar == null) {
                    C89219l.m154710a("adapter");
                }
                if (!iVar.f87069b) {
                    iVar.f87069b = true;
                    new Handler().post(new C36967i.RunnableC36976h(iVar));
                }
                VGGifterPanelService vGGifterPanelService = hVar.f87050h;
                if (vGGifterPanelService == null) {
                    C89219l.m154710a("api");
                }
                hVar.mo64464a(vGGifterPanelService);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C36967i m74623a(C36961h hVar) {
        C36967i iVar = hVar.f87055m;
        if (iVar == null) {
            C89219l.m154710a("adapter");
        }
        return iVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.h$c */
    static final class View$OnClickListenerC36964c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36961h f87064a;

        static {
            Covode.recordClassIndex(44312);
        }

        View$OnClickListenerC36964c(C36961h hVar) {
            this.f87064a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            LinearLayout linearLayout = this.f87064a.f87056n;
            if (linearLayout == null) {
                C89219l.m154710a("errorView");
            }
            linearLayout.setVisibility(8);
            this.f87064a.mo64465b().mo37884b();
            this.f87064a.mo64467d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.h$d */
    static final class View$OnClickListenerC36965d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36961h f87065a;

        static {
            Covode.recordClassIndex(44313);
        }

        View$OnClickListenerC36965d(C36961h hVar) {
            this.f87065a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C36956c cVar = this.f87065a.f87044b;
            if (cVar != null) {
                long j = cVar.f87024a;
                C36274b bVar = this.f87065a.f87043a;
                if (bVar == null) {
                    C89219l.m154710a("mCommentInputManager");
                }
                if (bVar.mo63515n()) {
                    Bundle a = bVar.mo63464a((CharSequence) "");
                    a.putBoolean("showGiftPanel", true);
                    bVar.f85748s.f86230e = "";
                    bVar.f85748s.f86231f = Long.valueOf(j);
                    DialogInterface$OnShowListenerC37084bz a2 = DialogInterface$OnShowListenerC37084bz.m74807a(bVar.f85732c.mo64438p(), bVar.mo63507f(), bVar.f85738i, a);
                    bVar.mo63483a("");
                    bVar.mo63472a(a2);
                    bVar.mo63502d();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo64464a(VGGifterPanelService vGGifterPanelService) {
        Long l;
        String str = this.f87045c;
        C36956c cVar = this.f87044b;
        if (cVar != null) {
            l = Long.valueOf(cVar.f87024a);
        } else {
            l = null;
        }
        vGGifterPanelService.getGifterPanel(str, l, Long.valueOf(this.f87053k)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C36963b(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        TuxTextView tuxTextView;
        SmartAvatarImageView smartAvatarImageView;
        UrlModel urlModel;
        List<String> urlList;
        String str2;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Aweme aweme = this.f87046d;
        String str3 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        this.f87045c = str;
        View findViewById = view.findViewById(R.id.bb2);
        C89219l.m154716b(findViewById, "");
        this.f87058p = (TuxDualBallView) findViewById;
        View findViewById2 = view.findViewById(R.id.bay);
        C89219l.m154716b(findViewById2, "");
        this.f87056n = (LinearLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.bb1);
        C89219l.m154716b(findViewById3, "");
        this.f87057o = (LinearLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.bb3);
        C89219l.m154716b(findViewById4, "");
        this.f87059q = (RecyclerView) findViewById4;
        this.f87055m = new C36967i();
        RecyclerView recyclerView = this.f87059q;
        if (recyclerView == null) {
            C89219l.m154710a("recyclerView");
        }
        C36967i iVar = this.f87055m;
        if (iVar == null) {
            C89219l.m154710a("adapter");
        }
        recyclerView.setAdapter(iVar);
        getContext();
        this.f87054l = new LinearLayoutManager();
        RecyclerView recyclerView2 = this.f87059q;
        if (recyclerView2 == null) {
            C89219l.m154710a("recyclerView");
        }
        recyclerView2.setLayoutManager(this.f87054l);
        this.f87060r = new C36966e(this);
        RecyclerView recyclerView3 = this.f87059q;
        if (recyclerView3 == null) {
            C89219l.m154710a("recyclerView");
        }
        RecyclerView.AbstractC1371n nVar = this.f87060r;
        if (nVar == null) {
            C89219l.m154710a("scrollListener");
        }
        recyclerView3.mo4405a(nVar);
        View view2 = getView();
        if (view2 != null) {
            tuxTextView = (TuxTextView) view2.findViewById(R.id.bac);
        } else {
            tuxTextView = null;
        }
        View view3 = getView();
        if (view3 != null) {
            smartAvatarImageView = (SmartAvatarImageView) view3.findViewById(R.id.ba_);
        } else {
            smartAvatarImageView = null;
        }
        if (tuxTextView != null) {
            C36956c cVar = this.f87044b;
            if (cVar != null) {
                str2 = cVar.f87025b;
            } else {
                str2 = null;
            }
            tuxTextView.setText(str2);
        }
        if (smartAvatarImageView != null) {
            C36956c cVar2 = this.f87044b;
            if (!(cVar2 == null || (urlModel = cVar2.f87028e) == null || (urlList = urlModel.getUrlList()) == null)) {
                str3 = urlList.get(0);
            }
            smartAvatarImageView.setImageURI(str3);
            smartAvatarImageView.setOnClickListener(new View$OnClickListenerC36965d(this));
        }
        Object a = this.f87048f.mo28858a(VGGifterPanelService.class);
        C89219l.m154716b(a, "");
        this.f87050h = (VGGifterPanelService) a;
        mo64467d();
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.baz);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setClickable(true);
        tuxTextView2.setOnClickListener(new View$OnClickListenerC36964c(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.ib, viewGroup, false);
    }
}
