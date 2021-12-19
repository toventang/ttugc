package com.p2082ss.android.ugc.aweme.commercialize.profile;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.c */
public final class C38398c extends RecyclerView.ViewHolder implements AbstractC39062g {

    /* renamed from: a */
    final SmartImageView f90721a;

    /* renamed from: b */
    final TuxTextView f90722b;

    /* renamed from: c */
    final SmartAvatarImageView f90723c;

    /* renamed from: d */
    final TuxTextView f90724d;

    /* renamed from: e */
    final TuxTextView f90725e;

    /* renamed from: f */
    final RelativeLayout f90726f;

    /* renamed from: g */
    Aweme f90727g;

    /* renamed from: h */
    public final AbstractC35500d f90728h;

    static {
        Covode.recordClassIndex(45905);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    /* renamed from: a */
    public final void mo66990a(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    public final void as_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    public final void at_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    public final void au_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    /* renamed from: b */
    public final void mo66994b(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    /* renamed from: e */
    public final boolean mo66995e() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    /* renamed from: c */
    public final void mo62381c() {
        UrlModel urlModel;
        Video video;
        Aweme aweme = this.f90727g;
        if (aweme == null || (video = aweme.getVideo()) == null) {
            urlModel = null;
        } else {
            urlModel = video.getCover();
        }
        C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel));
        C89219l.m154716b(a, "");
        int[] a2 = C80397em.m139369a(201);
        if (a2 != null) {
            a.mo34185b(a2);
        }
        a.f49092E = this.f90721a;
        a.mo34186c();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.c$a */
    static final class View$OnClickListenerC38399a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38398c f90729a;

        /* renamed from: b */
        final /* synthetic */ Aweme f90730b;

        static {
            Covode.recordClassIndex(45906);
        }

        View$OnClickListenerC38399a(C38398c cVar, Aweme aweme) {
            this.f90729a = cVar;
            this.f90730b = aweme;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f90729a.f90728h.mo62403a(view, this.f90730b, "just_watched_cover");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.c$b */
    static final class View$OnClickListenerC38400b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38398c f90731a;

        /* renamed from: b */
        final /* synthetic */ Aweme f90732b;

        static {
            Covode.recordClassIndex(45907);
        }

        View$OnClickListenerC38400b(C38398c cVar, Aweme aweme) {
            this.f90731a = cVar;
            this.f90732b = aweme;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f90731a.f90728h.mo62403a(view, this.f90732b, "normal_cover");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38398c(View view, AbstractC35500d dVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(dVar, "");
        this.f90728h = dVar;
        View findViewById = view.findViewById(R.id.ayl);
        C89219l.m154716b(findViewById, "");
        this.f90721a = (SmartImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.ayi);
        C89219l.m154716b(findViewById2, "");
        this.f90722b = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ayn);
        C89219l.m154716b(findViewById3, "");
        this.f90723c = (SmartAvatarImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ayp);
        C89219l.m154716b(findViewById4, "");
        this.f90724d = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.ayo);
        C89219l.m154716b(findViewById5, "");
        this.f90725e = (TuxTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.ayr);
        C89219l.m154716b(findViewById6, "");
        this.f90726f = (RelativeLayout) findViewById6;
    }
}
