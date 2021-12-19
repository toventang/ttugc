package com.p2082ss.android.ugc.aweme.journey.step.p3294c;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.C40313cq;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.journey.step.AbstractC56880a;
import com.p2082ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.p2082ss.android.ugc.aweme.journey.step.p3298g.C56955b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.c.b */
public final class C56904b extends AbstractC56880a {

    /* renamed from: k */
    public static final C56905a f129606k = new C56905a((byte) 0);

    /* renamed from: l */
    private SparseArray f129607l;

    static {
        Covode.recordClassIndex(66791);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56880a
    /* renamed from: a */
    public final View mo94100a(int i) {
        if (this.f129607l == null) {
            this.f129607l = new SparseArray();
        }
        View view = (View) this.f129607l.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f129607l.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56880a
    /* renamed from: c */
    public final void mo94104c() {
        SparseArray sparseArray = this.f129607l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.journey.step.AbstractC56880a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo94104c();
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.c.b$a */
    public static final class C56905a {
        static {
            Covode.recordClassIndex(66792);
        }

        private C56905a() {
        }

        public /* synthetic */ C56905a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.c.b$c */
    static final class View$OnClickListenerC56907c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C56904b f129609a;

        /* renamed from: b */
        final /* synthetic */ C56901a f129610b;

        /* renamed from: c */
        final /* synthetic */ C56914e f129611c;

        static {
            Covode.recordClassIndex(66794);
        }

        View$OnClickListenerC56907c(C56904b bVar, C56901a aVar, C56914e eVar) {
            this.f129609a = bVar;
            this.f129610b = aVar;
            this.f129611c = eVar;
        }

        /* renamed from: a */
        private static boolean m103224a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C89219l.m154716b(view, "");
            view.getContext();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m103224a();
            }
            if (!C58029j.f132256h) {
                new C79459a(view.getContext()).mo123050a(R.string.dcq).mo123053a();
                return;
            }
            this.f129609a.f129570j = true;
            if (!this.f129610b.f129598b.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator<T> it = this.f129610b.f129598b.iterator();
                int i = 0;
                while (it.hasNext()) {
                    sb.append(this.f129611c.f129618a.get(it.next().intValue()).f129485a);
                    if (i != this.f129610b.f129598b.size() - 1) {
                        sb.append(",");
                    }
                    i++;
                }
                String sb2 = sb.toString();
                C89219l.m154716b(sb2, "");
                this.f129609a.mo94117a(false, sb2);
                C40313cq.f94478a.mo60092a(sb2);
            }
            AbstractC81915c.m141874a(new C56955b(false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.c.b$b */
    public static final class C56906b extends GridLayoutManager.AbstractC1337c {

        /* renamed from: e */
        final /* synthetic */ C56901a f129608e;

        static {
            Covode.recordClassIndex(66793);
        }

        C56906b(C56901a aVar) {
            this.f129608e = aVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            if (this.f129608e.getItemViewType(i) == 0) {
                return 2;
            }
            return 1;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.c.b$f */
    static final class C56910f extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56904b f129614a;

        static {
            Covode.recordClassIndex(66797);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56910f(C56904b bVar) {
            super(1);
            this.f129614a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            bool.booleanValue();
            this.f129614a.mo94117a(true, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.c.b$d */
    static final class View$OnClickListenerC56908d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C56904b f129612a;

        static {
            Covode.recordClassIndex(66795);
        }

        View$OnClickListenerC56908d(C56904b bVar) {
            this.f129612a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f129612a.f129570j = true;
            this.f129612a.mo94117a(false, "cancel");
            AbstractC81915c.m141874a(new C56955b(true));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.c.b$e */
    static final class C56909e extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56904b f129613a;

        static {
            Covode.recordClassIndex(66796);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56909e(C56904b bVar) {
            super(1);
            this.f129613a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            if (intValue == 1) {
                this.f129613a.mo94102a(true);
            } else if (intValue == 0) {
                this.f129613a.mo94102a(false);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo94117a(boolean z, String str) {
        if (!z) {
            C39162r.m79460a("choose_content_language_popup", new C33744d().mo59983a("enter_from", "new_user_journey").mo59983a("language_type", str).mo59981a("stay_time", System.currentTimeMillis() - this.f129568d).f79943a);
        }
        C39162r.m79460a("popup_duration", new C33744d().mo59983a("enter_from", "new_user_journey").mo59981a("duration", System.currentTimeMillis() - this.f129568d).f79943a);
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.journey.step.AbstractC56880a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f129569e = new C56910f(this);
        C56914e eVar = ((ComponentDependencies) C1181ae.m3881a(requireActivity(), (C1175ad.AbstractC1177b) null).mo3983a(ComponentDependencies.class)).f129543f;
        if (eVar == null) {
            AbstractC81915c.m141874a(new C56955b(true));
            return;
        }
        ViewGroup.LayoutParams layoutParams = mo94103b().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin -= (int) C13628n.m24520b(mo94103b().getContext(), 4.0f);
        marginLayoutParams.rightMargin = marginLayoutParams.leftMargin;
        C56901a aVar = new C56901a(eVar.f129618a, new C56909e(this), eVar.f129619b);
        RecyclerView b = mo94103b();
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.mo4320a(new C56906b(aVar));
        b.setLayoutManager(gridLayoutManager);
        mo94103b().setAdapter(aVar);
        AbstractC17250a aVar2 = (AbstractC17250a) mo94100a(R.id.eiz);
        String str2 = aVar.f129482a;
        if (str2 == null) {
            str2 = "";
        }
        aVar2.setTitle(str2);
        mo94101a().setOnClickListener(new View$OnClickListenerC56907c(this, aVar, eVar));
        ((TuxTextView) mo94100a(R.id.e1u)).setOnClickListener(new View$OnClickListenerC56908d(this));
        C40313cq.f94478a.mo60098g();
        C33744d a = new C33744d().mo59983a("enter_from", "new_user_journey");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            str = "1";
        } else {
            str = "0";
        }
        C39162r.m79460a("show_content_language_popup", a.mo59983a("is_login", str).mo59981a("page_show_cost", System.currentTimeMillis() - this.f129568d).f79943a);
    }
}
