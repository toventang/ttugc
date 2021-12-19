package com.p2082ss.android.ugc.aweme.mvtemplate.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1481d.C20744c;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.IChallengeDetailLegacyService;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.challenge.ChallengeDetailLegacyServiceImpl;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.mvtemplate.p3486a.C61248d;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33918a;
import com.p2082ss.android.ugc.aweme.p4205v.p4206a.AbstractC80640c;
import com.p2082ss.android.ugc.aweme.p4205v.p4206a.C80638a;
import com.p2082ss.android.ugc.aweme.p4243y.C81779c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.b */
public final class C61261b implements AbstractC61281g {

    /* renamed from: a */
    public final Context f139119a;

    /* renamed from: b */
    public final String f139120b;

    /* renamed from: d */
    private TextView f139121d;

    /* renamed from: e */
    private RemoteImageView f139122e;

    /* renamed from: f */
    private TextView f139123f;

    /* renamed from: g */
    private FrameLayout f139124g;

    /* renamed from: h */
    private SmartImageView f139125h;

    /* renamed from: i */
    private TuxTextView f139126i;

    static {
        Covode.recordClassIndex(71878);
    }

    @Override // com.p2082ss.android.ugc.aweme.mvtemplate.view.AbstractC61281g
    /* renamed from: a */
    public final AbstractC80640c mo98787a() {
        Context context = this.f139119a;
        LayoutInflater from = LayoutInflater.from(context);
        C89219l.m154716b(from, "");
        return new C80638a(context, from, R.string.b8_);
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.b$a */
    static final class View$OnClickListenerC61262a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C61261b f139127a;

        /* renamed from: b */
        final /* synthetic */ C81779c f139128b;

        static {
            Covode.recordClassIndex(71879);
        }

        View$OnClickListenerC61262a(C61261b bVar, C81779c cVar) {
            this.f139127a = bVar;
            this.f139128b = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            IChallengeDetailLegacyService a = ChallengeDetailLegacyServiceImpl.m72544a();
            Context context = this.f139127a.f139119a;
            C81779c.C81781b bVar = this.f139128b.f182885s;
            C89219l.m154716b(bVar, "");
            a.mo57209a(context, bVar.f182889b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mvtemplate.view.AbstractC61281g
    /* renamed from: a */
    public final void mo98788a(View view) {
        C89219l.m154721d(view, "");
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.be4);
        if (viewGroup != null) {
            View a = C1764a.m5927a(LayoutInflater.from(this.f139119a), R.layout.akv, viewGroup, true);
            this.f139126i = (TuxTextView) a.findViewById(R.id.ak7);
            this.f139125h = (SmartImageView) a.findViewById(R.id.cu);
            this.f139124g = (FrameLayout) a.findViewById(R.id.ct);
            this.f139121d = (TextView) a.findViewById(R.id.cmf);
            this.f139122e = (RemoteImageView) a.findViewById(R.id.cmd);
            this.f139123f = (TextView) a.findViewById(R.id.cp9);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mvtemplate.view.AbstractC61281g
    /* renamed from: a */
    public final void mo98789a(C61248d dVar) {
        C81779c b;
        String str;
        long j;
        C89219l.m154721d(dVar, "");
        MvModel mvModel = dVar.f139078c;
        if (mvModel != null) {
            TextView textView = this.f139121d;
            if (textView != null) {
                textView.setText(mvModel.getName());
            }
            TextView textView2 = this.f139123f;
            if (textView2 != null) {
                StringBuilder sb = new StringBuilder();
                Long userCount = mvModel.getUserCount();
                if (userCount != null) {
                    j = userCount.longValue();
                } else {
                    j = 0;
                }
                textView2.setText(sb.append(C53437b.m98615a(j)).append(" ").toString());
            }
            C34577e.m70592a(this.f139122e, mvModel.getIconUrl());
        }
        if (C33918a.m69450a() && (b = C33918a.m69453b()) != null && b.f182885s != null && b.f182878l != null) {
            List<String> list = b.f182878l;
            MvModel mvModel2 = dVar.f139078c;
            if (mvModel2 != null) {
                str = mvModel2.getMvId();
            } else {
                str = null;
            }
            if (list.contains(str)) {
                if (!TextUtils.isEmpty(b.f182880n)) {
                    TuxTextView tuxTextView = this.f139126i;
                    if (tuxTextView != null) {
                        tuxTextView.setVisibility(0);
                    }
                    TuxTextView tuxTextView2 = this.f139126i;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(b.f182880n);
                    }
                    FrameLayout frameLayout = this.f139124g;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(0);
                    }
                } else {
                    TuxTextView tuxTextView3 = this.f139126i;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setVisibility(8);
                    }
                }
                FrameLayout frameLayout2 = this.f139124g;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0);
                }
                SmartImageView smartImageView = this.f139125h;
                if (smartImageView != null) {
                    smartImageView.setVisibility(0);
                }
                C81779c.C81781b bVar = b.f182885s;
                C89219l.m154716b(bVar, "");
                C20766v a = C20761r.m39061a(bVar.f182888a).mo34179a("MovieDetailFragment");
                Context context = this.f139119a;
                C20745e.C20746a aVar = new C20745e.C20746a();
                aVar.f48961e = C20744c.m39047a(context, 2.0f);
                aVar.f48958b = C20744c.m39047a(context, 0.0f);
                C20745e a2 = aVar.mo34169a();
                C89219l.m154716b(a2, "");
                a.f49126w = a2;
                a.f49092E = this.f139125h;
                a.mo34186c();
                FrameLayout frameLayout3 = this.f139124g;
                if (frameLayout3 != null) {
                    frameLayout3.setOnClickListener(new View$OnClickListenerC61262a(this, b));
                }
            }
        }
    }

    public C61261b(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        this.f139119a = context;
        this.f139120b = str;
    }
}
