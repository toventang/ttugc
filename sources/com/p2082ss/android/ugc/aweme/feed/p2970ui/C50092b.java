package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.AlgoFreeInfo;
import com.p2082ss.android.ugc.aweme.feed.helper.C49651r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2943d.C49418a;
import com.p2082ss.android.ugc.aweme.video.C80709c;
import com.p2082ss.android.ugc.aweme.video.p4211e.C80721a;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import com.p2082ss.android.ugc.playerkit.videoview.C84294j;
import com.p2082ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.p2082ss.android.ugc.trill.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.b */
public final class C50092b {

    /* renamed from: a */
    public VideoViewComponent f115625a;

    /* renamed from: b */
    public boolean f115626b;

    /* renamed from: c */
    public boolean f115627c;

    /* renamed from: d */
    public final ViewGroup f115628d;

    /* renamed from: e */
    private C49651r f115629e;

    /* renamed from: f */
    private final C49418a f115630f;

    /* renamed from: g */
    private C50095c f115631g = new C50095c(this);

    static {
        Covode.recordClassIndex(59218);
    }

    /* renamed from: a */
    public final void mo85228a() {
        m94041f();
        this.f115626b = true;
        mo85230c();
        this.f115628d.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo85229b() {
        this.f115626b = false;
        m94042g();
        this.f115628d.setVisibility(8);
        C39223a.m79592f().mo68590c();
    }

    /* renamed from: g */
    private void m94042g() {
        this.f115627c = false;
        int i = this.f115630f.f113577a;
        if (i == 1 || i == 2 || i == 4) {
            C49651r rVar = this.f115629e;
            if (rVar == null) {
                C89219l.m154710a("mPlayVideoHelper");
            }
            rVar.mo81447c();
            this.f115630f.f113577a = 0;
        }
    }

    /* renamed from: c */
    public final void mo85230c() {
        VideoViewComponent videoViewComponent = this.f115625a;
        if (videoViewComponent == null) {
            C89219l.m154710a("mVideoView");
        }
        C84294j jVar = videoViewComponent.f188405b;
        C89219l.m154716b(jVar, "");
        if (!jVar.mo129315c()) {
            this.f115627c = true;
            return;
        }
        int i = this.f115630f.f113577a;
        if (i == 0) {
            C49651r rVar = this.f115629e;
            if (rVar == null) {
                C89219l.m154710a("mPlayVideoHelper");
            }
            rVar.mo81445a();
            this.f115627c = false;
            this.f115630f.f113577a = 2;
        } else if (i == 3) {
            mo85231d();
        }
    }

    /* renamed from: d */
    public final void mo85231d() {
        this.f115627c = false;
        int i = this.f115630f.f113577a;
        if (i == 0) {
            mo85230c();
        } else if (i == 3) {
            C49651r rVar = this.f115629e;
            if (rVar == null) {
                C89219l.m154710a("mPlayVideoHelper");
            }
            rVar.mo81446b();
            this.f115630f.f113577a = 4;
        }
    }

    /* renamed from: e */
    public final void mo85232e() {
        this.f115627c = false;
        int i = this.f115630f.f113577a;
        if (i == 1 || i == 2 || i == 4) {
            C49651r rVar = this.f115629e;
            if (rVar == null) {
                C89219l.m154710a("mPlayVideoHelper");
            }
            rVar.f114282b.mo129267b();
            this.f115630f.f113577a = 3;
        }
    }

    /* renamed from: f */
    private final void m94041f() {
        String str;
        String str2;
        String str3;
        String body;
        TuxTextView tuxTextView = (TuxTextView) this.f115628d.findViewById(R.id.c7s);
        AlgoFreeInfo a = C39223a.m79592f().mo68587a();
        if (a == null || (str = a.getLearnMoreText()) == null) {
            str = "Learn More";
        }
        tuxTextView.setText(str);
        tuxTextView.setOnClickListener(new View$OnClickListenerC50093a(tuxTextView));
        RemoteImageView remoteImageView = (RemoteImageView) this.f115628d.findViewById(R.id.bh1);
        AlgoFreeInfo a2 = C39223a.m79592f().mo68587a();
        String str4 = null;
        if (a2 != null) {
            str2 = a2.getIconUrl();
        } else {
            str2 = null;
        }
        C34577e.m70608b(remoteImageView, str2, -1, -1);
        TuxTextView tuxTextView2 = (TuxTextView) this.f115628d.findViewById(R.id.title);
        C89219l.m154716b(tuxTextView2, "");
        AlgoFreeInfo a3 = C39223a.m79592f().mo68587a();
        if (a3 != null) {
            str3 = a3.getTitle();
        } else {
            str3 = null;
        }
        tuxTextView2.setText(str3);
        AlgoFreeInfo a4 = C39223a.m79592f().mo68587a();
        if (!(a4 == null || (body = a4.getBody()) == null)) {
            str4 = C89361p.m154869a(body, "\n", "\n\n", false);
        }
        SpannableString spannableString = new SpannableString(str4);
        Matcher matcher = Pattern.compile("\n\n").matcher(str4);
        while (matcher.find()) {
            spannableString.setSpan(new AbsoluteSizeSpan(7, true), matcher.start() + 1, matcher.end(), 33);
        }
        TuxTextView tuxTextView3 = (TuxTextView) this.f115628d.findViewById(R.id.ajd);
        C89219l.m154716b(tuxTextView3, "");
        tuxTextView3.setText(spannableString);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.b$c */
    public static final class C50095c extends C80709c {

        /* renamed from: a */
        final /* synthetic */ C50092b f115634a;

        static {
            Covode.recordClassIndex(59221);
        }

        @Override // com.p2082ss.android.ugc.aweme.video.C80709c, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayFailed(C84208l lVar) {
            super.onPlayFailed(lVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.video.C80709c, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderFirstFrame(C84216o oVar) {
            super.onRenderFirstFrame(oVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.video.C80709c, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onResumePlay(String str) {
            super.onResumePlay(str);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C50095c(C50092b bVar) {
            this.f115634a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.video.C80709c, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPreparePlay(String str) {
            super.onPreparePlay(str);
            C84294j jVar = C50092b.m94040a(this.f115634a).f188405b;
            C89219l.m154716b(jVar, "");
            View a = jVar.mo129311a();
            C89219l.m154716b(a, "");
            a.setVisibility(4);
        }

        @Override // com.p2082ss.android.ugc.aweme.video.C80709c, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderReady(C84215n nVar) {
            super.onRenderReady(nVar);
            C84294j jVar = C50092b.m94040a(this.f115634a).f188405b;
            C89219l.m154716b(jVar, "");
            View a = jVar.mo129311a();
            C89219l.m154716b(a, "");
            a.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.b$b */
    public static final class C50094b implements AbstractC84295k {

        /* renamed from: a */
        final /* synthetic */ C50092b f115633a;

        static {
            Covode.recordClassIndex(59220);
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        public final void aJ_() {
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: b */
        public final void mo60627b(int i, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C50094b(C50092b bVar) {
            this.f115633a = bVar;
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: a */
        public final void mo60625a(int i, int i2) {
            if (this.f115633a.f115627c) {
                this.f115633a.f115627c = false;
                this.f115633a.mo85230c();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoViewComponent m94040a(C50092b bVar) {
        VideoViewComponent videoViewComponent = bVar.f115625a;
        if (videoViewComponent == null) {
            C89219l.m154710a("mVideoView");
        }
        return videoViewComponent;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.b$a */
    public static final class View$OnClickListenerC50093a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TuxTextView f115632a;

        static {
            Covode.recordClassIndex(59219);
        }

        View$OnClickListenerC50093a(TuxTextView tuxTextView) {
            this.f115632a = tuxTextView;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            View rootView = this.f115632a.getRootView();
            C89219l.m154716b(rootView, "");
            Context context = rootView.getContext();
            AlgoFreeInfo a = C39223a.m79592f().mo68587a();
            if (a != null) {
                str = a.getLearnMoreLink();
            } else {
                str = null;
            }
            SmartRouter.buildRoute(context, str).open();
        }
    }

    public C50092b(ViewGroup viewGroup) {
        String str;
        C89219l.m154721d(viewGroup, "");
        this.f115628d = viewGroup;
        C49418a aVar = new C49418a();
        this.f115630f = aVar;
        VideoViewComponent videoViewComponent = new VideoViewComponent((byte) 0);
        this.f115625a = videoViewComponent;
        videoViewComponent.mo129261a((ViewGroup) viewGroup.findViewById(R.id.fc5));
        VideoViewComponent videoViewComponent2 = this.f115625a;
        if (videoViewComponent2 == null) {
            C89219l.m154710a("mVideoView");
        }
        videoViewComponent2.mo129266a(new C50094b(this));
        VideoViewComponent videoViewComponent3 = this.f115625a;
        if (videoViewComponent3 == null) {
            C89219l.m154710a("mVideoView");
        }
        this.f115629e = new C49651r(videoViewComponent3, this.f115631g);
        if (aVar.f113577a == 2) {
            C49651r rVar = this.f115629e;
            if (rVar == null) {
                C89219l.m154710a("mPlayVideoHelper");
            }
            rVar.f114282b.mo129267b();
        }
        aVar.f113577a = 0;
        C49651r rVar2 = this.f115629e;
        if (rVar2 == null) {
            C89219l.m154710a("mPlayVideoHelper");
        }
        AlgoFreeInfo a = C39223a.m79592f().mo68587a();
        Aweme a2 = C80721a.m139945a((a == null || (str = a.getBackgroundVideoUrl()) == null) ? "" : str);
        C89219l.m154721d(a2, "");
        rVar2.f114281a = a2;
    }
}
