package com.p2082ss.android.ugc.aweme.contentlanguage;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.contentlanguage.C40203j;
import com.p2082ss.android.ugc.aweme.contentlanguage.api.LanguageApi;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import com.p2082ss.android.ugc.aweme.user.C80064f;
import com.p2082ss.android.ugc.aweme.views.DialogC81459o;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.i */
public final class View$OnClickListenerC40200i extends DialogC81459o implements View.OnClickListener, AbstractC40224n {

    /* renamed from: a */
    public C40196h f94386a;

    /* renamed from: b */
    public String f94387b;

    /* renamed from: c */
    public long f94388c;

    /* renamed from: d */
    private final C40225o f94389d = new C40225o();

    /* renamed from: e */
    private final LanguageApi f94390e = ((LanguageApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(LanguageApi.class));

    /* renamed from: f */
    private ArrayList<String> f94391f = new ArrayList<>();

    static {
        Covode.recordClassIndex(47995);
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.i$b */
    public static final class C40202b implements AbstractC88986z<BaseResponse> {
        static {
            Covode.recordClassIndex(47997);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        C40202b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            C89219l.m154721d(baseResponse, "");
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        mo69399b();
    }

    @Override // com.p2082ss.android.ugc.aweme.views.DialogC81459o
    public final void onStart() {
        super.onStart();
        this.f94388c = System.currentTimeMillis();
    }

    /* renamed from: d */
    private final void m81311d() {
        ArrayList<String> arrayList;
        float f;
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.yh);
        C89219l.m154716b(tuxTextView, "");
        C40196h hVar = this.f94386a;
        if (hVar != null) {
            arrayList = hVar.f94375b;
        } else {
            arrayList = null;
        }
        tuxTextView.setEnabled(!C13603b.m24435a((Collection) arrayList));
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.yh);
        C89219l.m154716b(tuxTextView2, "");
        TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.yh);
        C89219l.m154716b(tuxTextView3, "");
        if (tuxTextView3.isEnabled()) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        tuxTextView2.setAlpha(f);
    }

    @Override // com.p2082ss.android.ugc.aweme.views.DialogC81459o
    public final void ar_() {
        super.ar_();
        this.f182108l = (int) C13628n.m24520b(getContext(), 280.0f);
        double b = (double) C13628n.m24521b(getContext());
        Double.isNaN(b);
        this.f182109m = (int) (b * 0.67d);
    }

    /* renamed from: b */
    public final void mo69399b() {
        if (this.f94388c > 0) {
            C33744d a = new C33744d().mo59983a("enter_from", this.f94387b).mo59981a("duration", System.currentTimeMillis() - this.f94388c).mo59980a("icon_load", this.f94391f.size());
            Integer a2 = HybridABInfoService.m69246b().mo60084a();
            if (a2 != null) {
                a.mo59980a("is_ab_backend_resp_received", a2.intValue());
            }
            C39162r.m79460a("popup_duration", a.f79943a);
            this.f94388c = 0;
            this.f94391f.size();
        }
    }

    /* renamed from: c */
    private final void m81310c() {
        setCanceledOnTouchOutside(false);
        setOnShowListener(new DialogInterface$OnShowListenerC40201a(this));
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.title);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(C40188b.m81300a().getTitle());
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.ajd);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(C40188b.m81300a().getText());
        ((TuxTextView) findViewById(R.id.yh)).setOnClickListener(this);
        m81311d();
        ((TuxIconView) findViewById(R.id.x_)).setOnClickListener(this);
        this.f94386a = new C40196h(this.f94387b, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.dgw);
        C89219l.m154716b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(2));
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.dgw);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setAdapter(this.f94386a);
        ((RecyclerView) findViewById(R.id.dgw)).mo4402a(new C40223m());
    }

    @Override // com.p2082ss.android.ugc.aweme.contentlanguage.AbstractC40224n
    /* renamed from: a */
    public final void mo69397a(String str) {
        C89219l.m154721d(str, "");
        m81311d();
    }

    @Override // com.p2082ss.android.ugc.aweme.contentlanguage.AbstractC40224n
    /* renamed from: b */
    public final void mo69400b(String str) {
        if (!TextUtils.isEmpty(str) && !C89070n.m154556a((Iterable) this.f94391f, (Object) str)) {
            ArrayList<String> arrayList = this.f94391f;
            if (str == null) {
                C89219l.m154715b();
            }
            arrayList.add(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.i$a */
    public static final class DialogInterface$OnShowListenerC40201a implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC40200i f94392a;

        static {
            Covode.recordClassIndex(47996);
        }

        DialogInterface$OnShowListenerC40201a(View$OnClickListenerC40200i iVar) {
            this.f94392a = iVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            String str;
            C40203j.C40204a.m81323a().mo69409c();
            C33744d a = new C33744d().mo59983a("enter_from", this.f94392a.f94387b);
            if (C80064f.m138815a(C80061e.f179403k.mo123508a())) {
                str = "1";
            } else {
                str = "0";
            }
            C33744d a2 = a.mo59983a("is_login", str);
            Integer a3 = HybridABInfoService.m69246b().mo60084a();
            if (a3 != null) {
                a2.mo59980a("is_ab_backend_resp_received", a3.intValue());
            }
            C39162r.m79460a("show_content_language_popup", a2.f79943a);
        }
    }

    public final void onClick(View view) {
        ArrayList<String> arrayList;
        ClickAgent.onClick(view);
        Integer num = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        }
        if (num != null) {
            if (num.intValue() == R.id.x_) {
                C39162r.m79460a("choose_content_language_popup", new C33744d().mo59983a("enter_from", this.f94387b).mo59983a("language_type", "cancel").f79943a);
                dismiss();
            } else if (num.intValue() == R.id.yh) {
                C40196h hVar = this.f94386a;
                if (hVar == null || (arrayList = hVar.f94375b) == null || C13603b.m24435a((Collection) arrayList)) {
                    C39162r.m79460a("click_content_language_popup", new C33744d().mo59983a("enter_from", this.f94387b).mo59983a("language_type", "ok").mo59983a("click_type", "null").f79943a);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                int i = 0;
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                    if (i != arrayList.size() - 1) {
                        sb.append(",");
                    }
                    i++;
                }
                if (C80064f.m138815a(C80061e.f179403k.mo123508a())) {
                    this.f94390e.setContentLanguage("content_language", sb.toString(), 1).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C40202b());
                } else {
                    C40225o oVar = this.f94389d;
                    String sb2 = sb.toString();
                    C89219l.m154716b(sb2, "");
                    oVar.mo69423a(sb2);
                }
                C39162r.m79460a("choose_content_language_popup", new C33744d().mo59983a("enter_from", this.f94387b).mo59983a("language_type", sb.toString()).f79943a);
                dismiss();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC40200i(Context context, String str) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        this.f94387b = str;
        setContentView(R.layout.x3);
        m81310c();
    }
}
