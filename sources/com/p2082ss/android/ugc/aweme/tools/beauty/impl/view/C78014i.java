package com.p2082ss.android.ugc.aweme.tools.beauty.impl.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77861e;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77871b;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78049b;
import com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySwitchView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.i */
public final class C78014i implements AbstractC77871b {

    /* renamed from: a */
    public final BeautySwitchView f175016a;

    /* renamed from: b */
    public final Context f175017b;

    /* renamed from: c */
    public final View f175018c;

    /* renamed from: d */
    public final C77861e f175019d;

    /* renamed from: e */
    public final C77989b f175020e;

    /* renamed from: f */
    private final ViewGroup f175021f;

    static {
        Covode.recordClassIndex(91104);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77871b
    /* renamed from: d */
    public final boolean mo121476d() {
        return this.f175019d.f174735m;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77871b
    /* renamed from: c */
    public final boolean mo121475c() {
        BeautySwitchView beautySwitchView = this.f175016a;
        C89219l.m154716b(beautySwitchView, "");
        return beautySwitchView.f175182b;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77871b
    /* renamed from: b */
    public final void mo121474b() {
        if (this.f175019d.f174735m) {
            BeautySwitchView beautySwitchView = this.f175016a;
            C89219l.m154716b(beautySwitchView, "");
            if (!beautySwitchView.f175182b) {
                BeautySwitchView beautySwitchView2 = this.f175016a;
                C89219l.m154716b(beautySwitchView2, "");
                beautySwitchView2.setChecked(true);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77871b
    /* renamed from: e */
    public final void mo121477e() {
        if (this.f175019d.f174735m && !mo121475c()) {
            BeautySwitchView beautySwitchView = this.f175016a;
            C89219l.m154716b(beautySwitchView, "");
            beautySwitchView.setChecked(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77871b
    /* renamed from: a */
    public final void mo121473a() {
        C77861e eVar = this.f175019d;
        C89219l.m154721d(eVar, "");
        if (eVar.f174735m) {
            this.f175016a.setEnableTouch(false);
            BeautySwitchView beautySwitchView = this.f175016a;
            C89219l.m154716b(beautySwitchView, "");
            beautySwitchView.setChecked(this.f175020e.f174958a.mo121633q());
            C77989b bVar = this.f175020e;
            BeautySwitchView beautySwitchView2 = this.f175016a;
            C89219l.m154716b(beautySwitchView2, "");
            bVar.mo121676a(beautySwitchView2.f175182b);
            this.f175016a.setOnCheckedChangeListener(new C78015a(this));
            this.f175021f.setOnClickListener(new View$OnClickListenerC78016b(this));
            this.f175020e.f174962e.mo121502a();
            ViewGroup viewGroup = this.f175021f;
            C89219l.m154716b(viewGroup, "");
            viewGroup.setVisibility(0);
            return;
        }
        BeautySwitchView beautySwitchView3 = this.f175016a;
        C89219l.m154716b(beautySwitchView3, "");
        beautySwitchView3.setChecked(true);
        ViewGroup viewGroup2 = this.f175021f;
        C89219l.m154716b(viewGroup2, "");
        viewGroup2.setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.i$a */
    static final class C78015a implements BeautySwitchView.AbstractC78068a {

        /* renamed from: a */
        final /* synthetic */ C78014i f175022a;

        static {
            Covode.recordClassIndex(91105);
        }

        C78015a(C78014i iVar) {
            this.f175022a = iVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySwitchView.AbstractC78068a
        /* renamed from: a */
        public final void mo121725a(boolean z) {
            this.f175022a.f175020e.mo121676a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.i$b */
    static final class View$OnClickListenerC78016b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C78014i f175023a;

        static {
            Covode.recordClassIndex(91106);
        }

        View$OnClickListenerC78016b(C78014i iVar) {
            this.f175023a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BeautySwitchView beautySwitchView = this.f175023a.f175016a;
            C89219l.m154716b(beautySwitchView, "");
            BeautySwitchView beautySwitchView2 = this.f175023a.f175016a;
            C89219l.m154716b(beautySwitchView2, "");
            beautySwitchView.setChecked(!beautySwitchView2.f175182b);
            C77989b bVar = this.f175023a.f175020e;
            BeautySwitchView beautySwitchView3 = this.f175023a.f175016a;
            C89219l.m154716b(beautySwitchView3, "");
            boolean z = beautySwitchView3.f175182b;
            AbstractC78049b bVar2 = bVar.f174960c.f174956a;
            if (bVar2 != null) {
                bVar2.mo121779a(z);
            }
        }
    }

    public C78014i(Context context, View view, C77861e eVar, C77989b bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(bVar, "");
        this.f175017b = context;
        this.f175018c = view;
        this.f175019d = eVar;
        this.f175020e = bVar;
        this.f175021f = (ViewGroup) view.findViewById(R.id.b3v);
        this.f175016a = (BeautySwitchView) view.findViewById(R.id.b28);
    }
}
