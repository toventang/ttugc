package com.p2082ss.android.ugc.aweme.share.p3746d;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.livedata.C34603a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.NoticeButtonView;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.share.d.g */
public final class C68913g implements AbstractC68912f {

    /* renamed from: a */
    static NoticeButtonView f154166a;

    /* renamed from: b */
    static final Handler f154167b = new HandlerC68915b(Looper.getMainLooper());

    /* renamed from: c */
    public static final C68913g f154168c = new C68913g();

    private C68913g() {
    }

    /* renamed from: com.ss.android.ugc.aweme.share.d.g$c */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC68916c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ NoticeButtonView f154171a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f154172b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f154173c;

        /* renamed from: d */
        final /* synthetic */ int f154174d;

        static {
            Covode.recordClassIndex(81222);
        }

        /* renamed from: com.ss.android.ugc.aweme.share.d.g$c$a */
        static final class RunnableC68917a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC68916c f154175a;

            static {
                Covode.recordClassIndex(81223);
            }

            RunnableC68917a(ViewTreeObserver$OnGlobalLayoutListenerC68916c cVar) {
                this.f154175a = cVar;
            }

            public final void run() {
                this.f154175a.f154171a.setVisibility(0);
            }
        }

        public final void onGlobalLayout() {
            MethodCollector.m26663i(6475);
            if (this.f154171a.getHeight() != 0) {
                this.f154171a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f154172b.removeView(this.f154171a);
                int b = (int) C13628n.m24520b(C17867d.m33078a(), 16.0f);
                C89219l.m154716b(C33403c.C33406b.f79409a, "");
                int a = C33403c.m68502a();
                int height = ((this.f154172b.getHeight() - b) - this.f154171a.getHeight()) - a;
                int i = this.f154174d;
                this.f154173c.element.setMargins(i, height, i, b + a);
                if (Build.VERSION.SDK_INT < 24) {
                    this.f154171a.setY((float) height);
                }
                this.f154172b.addView(this.f154171a, this.f154173c.element);
                C68913g.f154167b.post(new RunnableC68917a(this));
            }
            MethodCollector.m26664o(6475);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC68916c(NoticeButtonView noticeButtonView, FrameLayout frameLayout, C89233z.C89238e eVar, int i) {
            this.f154171a = noticeButtonView;
            this.f154172b = frameLayout;
            this.f154173c = eVar;
            this.f154174d = i;
        }
    }

    /* renamed from: c */
    private static void m121612c() {
        Handler handler = f154167b;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.d.g$a */
    public static final class C68914a implements NoticeButtonView.AbstractC64330b {

        /* renamed from: a */
        final /* synthetic */ Context f154169a;

        /* renamed from: b */
        final /* synthetic */ Aweme f154170b;

        static {
            Covode.recordClassIndex(81220);
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.NoticeButtonView.AbstractC64330b
        /* renamed from: c */
        public final void mo103848c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.NoticeButtonView.AbstractC64330b
        /* renamed from: a */
        public final void mo103846a() {
            C68913g.f154168c.mo109466b();
            C34603a.C34604a.f81659a.mo61063a("video_click_retry").postValue(this.f154170b);
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.NoticeButtonView.AbstractC64330b
        /* renamed from: b */
        public final void mo103847b() {
            String str;
            C68913g.f154168c.mo109466b();
            C33744d a = new C33744d().mo59983a("enter_from", C68909c.f154158f);
            Aweme aweme = C68909c.f154157e;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            C39162r.m79460a("download_cancel", a.mo59983a("group_id", str).mo59980a("is_downloading", C68909c.m121606b() ? 1 : 0).f79943a);
        }

        C68914a(Context context, Aweme aweme) {
            this.f154169a = context;
            this.f154170b = aweme;
        }
    }

    static {
        Covode.recordClassIndex(81219);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.p3746d.AbstractC68912f
    /* renamed from: a */
    public final void mo109465a() {
        C34603a.C34604a.f81659a.mo61063a("video_download_status").mo60214a(new C68910d(), true);
        C34603a.C34604a.f81659a.mo61063a("video_click_retry").observeForever(new C68911e());
    }

    @Override // com.p2082ss.android.ugc.aweme.share.p3746d.AbstractC68912f
    /* renamed from: b */
    public final void mo109466b() {
        MethodCollector.m26663i(6473);
        NoticeButtonView noticeButtonView = f154166a;
        if (noticeButtonView != null) {
            noticeButtonView.setVisibility(8);
            ViewParent parent = noticeButtonView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(noticeButtonView);
            }
        }
        m121612c();
        f154166a = null;
        MethodCollector.m26664o(6473);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.d.g$b */
    public static final class HandlerC68915b extends Handler {
        static {
            Covode.recordClassIndex(81221);
        }

        HandlerC68915b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            C89219l.m154721d(message, "");
            C68913g.f154168c.mo109466b();
        }
    }
}
