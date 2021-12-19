package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.p1477a.C20751h;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.main.p3428b.C59043a;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59240f;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.C69508y;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.C69576b;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ds */
public final class C50232ds extends AbstractC49544a {

    /* renamed from: a */
    public static final int f115990a = ((int) C13628n.m24520b(C20751h.f48987a, 10.0f));

    /* renamed from: b */
    public static final C50233a f115991b = new C50233a((byte) 0);

    /* renamed from: c */
    private final View f115992c;

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80928a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80931a(DataCenter dataCenter) {
        C89219l.m154721d(dataCenter, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ds$a */
    public static final class C50233a {
        static {
            Covode.recordClassIndex(59359);
        }

        private C50233a() {
        }

        public /* synthetic */ C50233a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(59358);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ds$b */
    static final class RunnableC50234b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50232ds f115993a;

        static {
            Covode.recordClassIndex(59360);
        }

        RunnableC50234b(C50232ds dsVar) {
            this.f115993a = dsVar;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f115993a.f113961T.getHitRect(rect);
            rect.top -= C50232ds.f115990a;
            rect.left -= C50232ds.f115990a;
            rect.bottom += C50232ds.f115990a;
            rect.right += C50232ds.f115990a;
            View view = this.f115993a.f113960S;
            C89219l.m154716b(view, "");
            view.setTouchDelegate(new TouchDelegate(rect, this.f115993a.f113961T));
        }
    }

    /* renamed from: b */
    public final void mo85399b() {
        String uid;
        if (C69508y.f155284b && C56216k.m102133c()) {
            Aweme aweme = this.f113953L;
            C89219l.m154716b(aweme, "");
            C69508y.m122723c(aweme);
        }
        if (this.f113954M == null) {
            this.f113954M = "";
        }
        C59240f f = new C59240f().mo96797a("homepage_hot").mo96749g(this.f113953L);
        f.f135194p = (String) this.f113958Q.mo60195b("playlist_id", "");
        f.f135193e = (String) this.f113958Q.mo60195b("playlist_id_key", "");
        f.f135192d = (String) this.f113958Q.mo60195b("playlist_type", "");
        C59240f fVar = (C59240f) f.mo96801c((String) this.f113958Q.mo60195b("tab_name", "")).mo96802d(C59208ac.m108764b(this.f113953L, this.f113957P));
        Aweme aweme2 = this.f113953L;
        C89219l.m154716b(aweme2, "");
        if (aweme2.getAuthor() == null) {
            uid = "";
        } else {
            Aweme aweme3 = this.f113953L;
            if (aweme3 == null) {
                C89219l.m154715b();
            }
            User author = aweme3.getAuthor();
            if (author == null) {
                C89219l.m154715b();
            }
            uid = author.getUid();
        }
        fVar.f135190b = uid;
        Aweme aweme4 = this.f113953L;
        C89219l.m154716b(aweme4, "");
        fVar.f135222V = C76598h.m134176a(aweme4.getAuthor());
        fVar.f135199u = Boolean.valueOf(C76706a.m134281g(this.f113953L));
        fVar.f135191c = this.f113957P;
        Aweme aweme5 = this.f113953L;
        C89219l.m154716b(aweme5, "");
        fVar.f135200v = C76706a.m134276b(aweme5);
        C59240f fVar2 = (C59240f) C79900c.m138667a(fVar, this.f113953L, "homepage_hot");
        String str = this.f113954M;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1271119582) {
                if (hashCode == 1691937916 && str.equals("homepage_hot")) {
                    fVar2.mo96797a("homepage_hot");
                    fVar2.mo96792f();
                    AbstractC81915c.m141874a(new C59043a());
                }
            } else if (str.equals("homepage_follow")) {
                fVar2.mo96797a("homepage_follow");
                fVar2.mo96792f();
                AbstractC81915c.m141874a(new C59043a());
            }
        }
        if (this.f113964W == 2) {
            fVar2.mo96797a(this.f113954M);
        }
        fVar2.mo96792f();
        AbstractC81915c.m141874a(new C59043a());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50232ds(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f115992c = view;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ds$c */
    static final class View$OnClickListenerC50235c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50232ds f115994a;

        static {
            Covode.recordClassIndex(59361);
        }

        View$OnClickListenerC50235c(C50232ds dsVar) {
            this.f115994a = dsVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C69576b.m122788a(view, 1200)) {
                this.f115994a.f113958Q.mo60191a("video_more_click", (Object) null);
                this.f115994a.mo85399b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80929a(View view) {
        C89219l.m154721d(view, "");
        Context context = this.f113959R;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        this.f113961T = C1870c.m6045a((Activity) context, (int) R.layout.t4);
        this.f113961T.setOnClickListener(new View$OnClickListenerC50235c(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    public final void mo80935b(C33942b bVar) {
        MethodCollector.m26663i(4893);
        if (!this.f113952K) {
            this.f113952K = true;
            if (this.f113960S instanceof FrameLayout) {
                ((FrameLayout) this.f113960S).addView(this.f113961T);
            }
            this.f113960S.post(new RunnableC50234b(this));
            if (!C56216k.m102133c()) {
                View view = this.f113960S;
                C89219l.m154716b(view, "");
                view.setVisibility(8);
            }
        }
        if (bVar == null) {
            MethodCollector.m26664o(4893);
        } else {
            MethodCollector.m26664o(4893);
        }
    }
}
