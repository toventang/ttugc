package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.services.CommentService;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49559p;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.RunnableC49561r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ev */
public final class C50293ev extends AbstractC49544a {

    /* renamed from: a */
    public C50053an f116122a;

    /* renamed from: b */
    public final AbstractC1204m f116123b;

    /* renamed from: c */
    public final HashMap<String, String> f116124c;

    /* renamed from: d */
    private boolean f116125d = true;

    /* renamed from: e */
    private final View.OnTouchListener f116126e;

    static {
        Covode.recordClassIndex(59419);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80928a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80931a(DataCenter dataCenter) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: f */
    public final void mo81282f() {
        super.mo81282f();
        AbstractC1204m mVar = this.f116123b;
        if (mVar != null) {
            C34727m.m70944a(new RunnableC50295b(mVar, this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ev$a */
    static final class RunnableC50294a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50293ev f116127a;

        static {
            Covode.recordClassIndex(59420);
        }

        RunnableC50294a(C50293ev evVar) {
            this.f116127a = evVar;
        }

        public final void run() {
            C50053an anVar = this.f116127a.f116122a;
            if (anVar != null) {
                DataCenter dataCenter = this.f116127a.f113958Q;
                GenericWidget genericWidget = this.f116127a.f113951J;
                C89219l.m154716b(genericWidget, "");
                anVar.mo85181a(dataCenter, genericWidget);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ev$b */
    static final class RunnableC50295b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f116128a;

        /* renamed from: b */
        final /* synthetic */ C50293ev f116129b;

        static {
            Covode.recordClassIndex(59421);
        }

        RunnableC50295b(AbstractC1204m mVar, C50293ev evVar) {
            this.f116128a = mVar;
            this.f116129b = evVar;
        }

        public final void run() {
            CommentService e = CommentServiceImpl.m73664e();
            AbstractC1196i lifecycle = this.f116128a.getLifecycle();
            C89219l.m154716b(lifecycle, "");
            LiveData<Aweme> a = e.mo63276a(lifecycle);
            if (a != null) {
                a.observe(this.f116128a, new AbstractC1214u(this) {
                    /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50293ev.RunnableC50295b.C502961 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC50295b f116130a;

                    static {
                        Covode.recordClassIndex(59422);
                    }

                    {
                        this.f116130a = r1;
                    }

                    @Override // androidx.lifecycle.AbstractC1214u
                    public final /* synthetic */ void onChanged(Object obj) {
                        Aweme aweme = (Aweme) obj;
                        if (aweme != null) {
                            String aid = aweme.getAid();
                            Aweme aweme2 = this.f116130a.f116129b.f113953L;
                            String str = null;
                            if (aweme2 != null) {
                                str = aweme2.getAid();
                            }
                            if (C89219l.m154714a((Object) aid, (Object) str)) {
                                this.f116130a.f116129b.f113958Q.mo60191a("social_video_tag_info", aweme);
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: i */
    public final void mo81287i() {
        C50053an anVar;
        super.mo81287i();
        C50053an anVar2 = this.f116122a;
        if (anVar2 != null) {
            anVar2.f115549j = this.f113953L;
        }
        C50053an anVar3 = this.f116122a;
        if (anVar3 != null) {
            anVar3.f115550k = this.f116125d;
        }
        C50053an anVar4 = this.f116122a;
        if (anVar4 != null) {
            anVar4.f115551l = false;
        }
        HashMap<String, String> hashMap = this.f116124c;
        if (hashMap != null) {
            Set<String> keySet = hashMap.keySet();
            C89219l.m154716b(keySet, "");
            Aweme aweme = this.f113953L;
            String str = null;
            if (aweme != null) {
                str = aweme.getAid();
            }
            if (C89070n.m154556a((Iterable) keySet, (Object) str) && (anVar = this.f116122a) != null) {
                anVar.mo85183a(this.f113953L);
            }
        }
        if (this.f116125d) {
            this.f116125d = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: c */
    public final void mo80938c(C33942b bVar) {
        C50053an anVar = this.f116122a;
        if (anVar != null) {
            anVar.mo85182a(bVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo81273a(VideoItemParams videoItemParams) {
        super.mo81273a(videoItemParams);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80929a(View view) {
        this.f113961T = C1870c.m6045a((Activity) this.f113959R, (int) R.layout.t6);
        View view2 = this.f113961T;
        View.OnTouchListener onTouchListener = this.f116126e;
        Context context = this.f113959R;
        C89219l.m154716b(context, "");
        this.f116122a = new C50053an(view2, onTouchListener, context, this.f116124c);
        C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50294a(this)));
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: e */
    public final C33942b mo81280e(C33942b bVar) {
        if (bVar == null) {
            return null;
        }
        super.mo81280e(bVar);
        if (!TextUtils.equals(bVar.f80277a, "video_params")) {
            return null;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        C50053an anVar = this.f116122a;
        if (anVar != null) {
            anVar.mo85184a((VideoItemParams) bVar.mo60212a(), hashMap);
        }
        return new C33942b("ui_state", hashMap);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    public final void mo80935b(C33942b bVar) {
        MethodCollector.m26663i(3951);
        if (!this.f113952K) {
            this.f113952K = true;
            if (this.f113960S instanceof FrameLayout) {
                ((FrameLayout) this.f113960S).addView(this.f113961T, new FrameLayout.LayoutParams(-2, -2));
            }
        }
        if (bVar == null) {
            MethodCollector.m26664o(3951);
            return;
        }
        C50053an anVar = this.f116122a;
        if (anVar != null) {
            Object a = bVar.mo60212a();
            C89219l.m154716b(a, "");
            anVar.mo85186a((HashMap) a);
            MethodCollector.m26664o(3951);
            return;
        }
        MethodCollector.m26664o(3951);
    }

    public C50293ev(View view, View.OnTouchListener onTouchListener, AbstractC1204m mVar, HashMap<String, String> hashMap) {
        super(view);
        this.f116126e = onTouchListener;
        this.f116123b = mVar;
        this.f116124c = hashMap;
    }
}
