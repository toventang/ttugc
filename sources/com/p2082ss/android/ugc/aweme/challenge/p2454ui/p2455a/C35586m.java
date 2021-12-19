package com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.AbstractC35558a;
import com.p2082ss.android.ugc.aweme.challenge.service.ChallengeDetailProvicer;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.ChallengeTransform;
import com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.m */
public final class C35586m extends AbstractC35558a {

    /* renamed from: h */
    public static final C35587a f83918h = new C35587a((byte) 0);

    /* renamed from: i */
    private TextView f83919i;

    /* renamed from: j */
    private View f83920j;

    /* renamed from: k */
    private TextView f83921k;

    /* renamed from: l */
    private TextView f83922l;

    /* renamed from: m */
    private TextView f83923m;

    /* renamed from: n */
    private TextView f83924n;

    /* renamed from: o */
    private View f83925o;

    /* renamed from: p */
    private CheckableImageView f83926p;

    /* renamed from: q */
    private TextView f83927q;

    /* renamed from: r */
    private C35578i f83928r;

    static {
        Covode.recordClassIndex(42810);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.AbstractC35558a
    public final int getAttrsResId() {
        return R.layout.mx;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.AbstractC35558a
    public final int getLayoutResId() {
        return R.layout.n4;
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.m$a */
    public static final class C35587a {
        static {
            Covode.recordClassIndex(42811);
        }

        private C35587a() {
        }

        public /* synthetic */ C35587a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.AbstractC35558a
    /* renamed from: a */
    public final void mo62538a() {
        AbstractC35585l a = ChallengeDetailProvicer.m72635b().mo62521a();
        C89219l.m154716b(a, "");
        mo62540a(a);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.AbstractC35558a
    public final int getButtonResId() {
        int i = C35589n.f83931a[getMHeaderParam().f83913c.ordinal()];
        if (i == 1) {
            return R.layout.mz;
        }
        if (i == 2) {
            return R.layout.n0;
        }
        throw new C89376n();
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.AbstractC35558a
    /* renamed from: b */
    public final void mo62542b() {
        MethodCollector.m26663i(1846);
        View findViewById = findViewById(R.id.ou);
        C89219l.m154716b(findViewById, "");
        this.f83919i = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.m6);
        C89219l.m154716b(findViewById2, "");
        ViewStub viewStub = (ViewStub) findViewById2;
        viewStub.setLayoutResource(getAttrsResId());
        View inflate = viewStub.inflate();
        C89219l.m154716b(inflate, "");
        this.f83920j = inflate;
        if (inflate == null) {
            C89219l.m154710a("attrsContainer");
        }
        View findViewById3 = inflate.findViewById(R.id.m7);
        C89219l.m154716b(findViewById3, "");
        this.f83921k = (TextView) findViewById3;
        View view = this.f83920j;
        if (view == null) {
            C89219l.m154710a("attrsContainer");
        }
        View findViewById4 = view.findViewById(R.id.m_);
        C89219l.m154716b(findViewById4, "");
        this.f83922l = (TextView) findViewById4;
        View view2 = this.f83920j;
        if (view2 == null) {
            C89219l.m154710a("attrsContainer");
        }
        View findViewById5 = view2.findViewById(R.id.ma);
        C89219l.m154716b(findViewById5, "");
        this.f83923m = (TextView) findViewById5;
        View view3 = this.f83920j;
        if (view3 == null) {
            C89219l.m154710a("attrsContainer");
        }
        View findViewById6 = view3.findViewById(R.id.m8);
        C89219l.m154716b(findViewById6, "");
        this.f83924n = (TextView) findViewById6;
        View findViewById7 = findViewById(R.id.a06);
        C89219l.m154716b(findViewById7, "");
        ViewStub viewStub2 = (ViewStub) findViewById7;
        viewStub2.setLayoutResource(getButtonResId());
        View inflate2 = viewStub2.inflate();
        View findViewById8 = inflate2.findViewById(R.id.a7n);
        C89219l.m154716b(findViewById8, "");
        View findViewById9 = inflate2.findViewById(R.id.bu9);
        C89219l.m154716b(findViewById9, "");
        this.f83928r = new C35578i(findViewById8, (CheckableImageView) findViewById9, (TextView) inflate2.findViewById(R.id.etu), getDetailParam());
        View findViewById10 = inflate2.findViewById(R.id.emz);
        this.f83925o = findViewById10;
        if (findViewById10 != null) {
            View findViewById11 = inflate2.findViewById(R.id.c0o);
            C89219l.m154716b(findViewById11, "");
            this.f83926p = (CheckableImageView) findViewById11;
            View findViewById12 = inflate2.findViewById(R.id.f6e);
            C89219l.m154716b(findViewById12, "");
            this.f83927q = (TextView) findViewById12;
        }
        super.mo62542b();
        MethodCollector.m26664o(1846);
    }

    /* renamed from: b */
    public final void mo62599b(String str) {
        C39162r.m79460a(str, new C33744d().mo59983a("challenge_id", getMChallenge().getCid()).mo59980a("content_type", getMChallenge().getContentType()).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.m$b */
    static final class View$OnClickListenerC35588b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35586m f83929a;

        /* renamed from: b */
        final /* synthetic */ ChallengeTransform f83930b;

        static {
            Covode.recordClassIndex(42812);
        }

        View$OnClickListenerC35588b(C35586m mVar, ChallengeTransform challengeTransform) {
            this.f83929a = mVar;
            this.f83930b = challengeTransform;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f83929a.mo62599b("challenge_transform_button_click");
            if (C35570b.m72676a(this.f83930b.getAction())) {
                String action = this.f83930b.getAction();
                if (action == null) {
                    action = "";
                }
                if (C35570b.m72676a(action)) {
                    action = Uri.parse(action).buildUpon().appendQueryParameter("bundle_webview_background", "ffffff").build().toString();
                }
                C89219l.m154716b(action, "");
                if (!C38000g.m77052c().mo65920a(this.f83929a.getContext(), action, true)) {
                    C38000g.m77052c().mo65919a(this.f83929a.getContext(), action, "");
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.AbstractC35558a
    /* renamed from: a */
    public final void mo62539a(ChallengeDetail challengeDetail) {
        boolean z;
        C89219l.m154721d(challengeDetail, "");
        if (challengeDetail.challenge != null) {
            super.mo62539a(challengeDetail);
            if (C35570b.m72676a(getMChallenge().getProfileTagUrl())) {
                TextView textView = this.f83919i;
                if (textView == null) {
                    C89219l.m154710a("avatarTag");
                }
                textView.setVisibility(0);
                TextView textView2 = this.f83919i;
                if (textView2 == null) {
                    C89219l.m154710a("avatarTag");
                }
                textView2.setText(getMChallenge().getProfileTagUrl());
            } else {
                TextView textView3 = this.f83919i;
                if (textView3 == null) {
                    C89219l.m154710a("avatarTag");
                }
                textView3.setVisibility(8);
            }
            List<String> attrs = getMChallenge().getAttrs();
            if (attrs == null || attrs.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                View view = this.f83920j;
                if (view == null) {
                    C89219l.m154710a("attrsContainer");
                }
                view.setVisibility(4);
            } else {
                TextView textView4 = this.f83921k;
                if (textView4 == null) {
                    C89219l.m154710a("attrsFirst");
                }
                m72693a(0, textView4);
                TextView textView5 = this.f83922l;
                if (textView5 == null) {
                    C89219l.m154710a("attrsSecond");
                }
                m72693a(1, textView5);
                TextView textView6 = this.f83923m;
                if (textView6 == null) {
                    C89219l.m154710a("attrsThird");
                }
                m72693a(2, textView6);
                TextView textView7 = this.f83924n;
                if (textView7 == null) {
                    C89219l.m154710a("attrsForth");
                }
                m72693a(3, textView7);
                View view2 = this.f83920j;
                if (view2 == null) {
                    C89219l.m154710a("attrsContainer");
                }
                view2.setVisibility(0);
            }
            C35578i iVar = this.f83928r;
            if (iVar == null) {
                C89219l.m154710a("collectButtonBlock");
            }
            iVar.mo62588a(getMChallenge(), getMHeaderParam());
            if (this.f83925o != null && AbstractC35558a.C35559a.m72672a(getMChallengeDetail())) {
                ChallengeTransform transfrom = getMChallenge().getTransfrom();
                if (transfrom.getIconUrlModel() == null) {
                    CheckableImageView checkableImageView = this.f83926p;
                    if (checkableImageView == null) {
                        C89219l.m154710a("transformIv");
                    }
                    checkableImageView.setVisibility(8);
                } else {
                    CheckableImageView checkableImageView2 = this.f83926p;
                    if (checkableImageView2 == null) {
                        C89219l.m154710a("transformIv");
                    }
                    C34577e.m70592a(checkableImageView2, transfrom.getIconUrlModel());
                }
                TextView textView8 = this.f83927q;
                if (textView8 == null) {
                    C89219l.m154710a("transformTv");
                }
                textView8.setText(transfrom.getText());
                View view3 = this.f83925o;
                if (view3 == null) {
                    C89219l.m154715b();
                }
                view3.setOnClickListener(new View$OnClickListenerC35588b(this, transfrom));
                mo62599b("challenge_transform_button_show");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C35586m(Context context, C35583j jVar) {
        super(context, jVar, null);
        C89219l.m154721d(context, "");
    }

    /* renamed from: a */
    private final void m72693a(int i, TextView textView) {
        List<String> attrs = getMChallenge().getAttrs();
        int size = attrs.size() - (4 - i);
        if (size >= 0) {
            textView.setVisibility(0);
            textView.setText(attrs.get(size));
            return;
        }
        textView.setVisibility(4);
    }

    public /* synthetic */ C35586m(Context context, C35583j jVar, byte b) {
        this(context, jVar);
    }
}
