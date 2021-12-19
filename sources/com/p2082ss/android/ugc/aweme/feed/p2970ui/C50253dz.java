package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
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
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50061ao;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dz */
public class C50253dz extends AbstractC49544a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public C50061ao f116041a;

    /* renamed from: b */
    public final AbstractC1204m f116042b;

    /* renamed from: c */
    public final HashMap<String, String> f116043c;

    /* renamed from: d */
    private VideoTitleFollowBtn f116044d;

    /* renamed from: e */
    private final View.OnTouchListener f116045e;

    static {
        Covode.recordClassIndex(59379);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80931a(DataCenter dataCenter) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(67, new RunnableC90250g(C50253dz.class, "onFollowEvent", FollowStatusEvent.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80928a() {
        EventBus.m156962a().mo145395b(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: f */
    public final void mo81282f() {
        super.mo81282f();
        AbstractC1204m mVar = this.f116042b;
        if (mVar != null) {
            C34727m.m70944a(new RunnableC50255b(mVar, this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.dz$a */
    static final class RunnableC50254a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50253dz f116046a;

        static {
            Covode.recordClassIndex(59380);
        }

        RunnableC50254a(C50253dz dzVar) {
            this.f116046a = dzVar;
        }

        public final void run() {
            C50061ao aoVar = this.f116046a.f116041a;
            if (aoVar != null) {
                DataCenter dataCenter = this.f116046a.f113958Q;
                GenericWidget genericWidget = this.f116046a.f113951J;
                C89219l.m154716b(genericWidget, "");
                aoVar.mo85181a(dataCenter, genericWidget);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.dz$b */
    static final class RunnableC50255b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f116047a;

        /* renamed from: b */
        final /* synthetic */ C50253dz f116048b;

        static {
            Covode.recordClassIndex(59381);
        }

        RunnableC50255b(AbstractC1204m mVar, C50253dz dzVar) {
            this.f116047a = mVar;
            this.f116048b = dzVar;
        }

        public final void run() {
            CommentService e = CommentServiceImpl.m73664e();
            AbstractC1196i lifecycle = this.f116047a.getLifecycle();
            C89219l.m154716b(lifecycle, "");
            LiveData<Aweme> a = e.mo63276a(lifecycle);
            if (a != null) {
                a.observe(this.f116047a, new AbstractC1214u(this) {
                    /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50253dz.RunnableC50255b.C502561 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC50255b f116049a;

                    static {
                        Covode.recordClassIndex(59382);
                    }

                    {
                        this.f116049a = r1;
                    }

                    @Override // androidx.lifecycle.AbstractC1214u
                    public final /* synthetic */ void onChanged(Object obj) {
                        Aweme aweme = (Aweme) obj;
                        if (aweme != null) {
                            String aid = aweme.getAid();
                            Aweme aweme2 = this.f116049a.f116048b.f113953L;
                            String str = null;
                            if (aweme2 != null) {
                                str = aweme2.getAid();
                            }
                            if (C89219l.m154714a((Object) aid, (Object) str)) {
                                this.f116049a.f116048b.f113958Q.mo60191a("social_video_tag_info", aweme);
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: c */
    public final void mo80938c(C33942b bVar) {
        C50061ao aoVar = this.f116041a;
        if (aoVar != null) {
            aoVar.mo85182a(bVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo81273a(VideoItemParams videoItemParams) {
        super.mo81273a(videoItemParams);
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
        hashMap.put("aweme_state", this.f113953L);
        C50061ao aoVar = this.f116041a;
        if (aoVar != null) {
            aoVar.mo85184a((VideoItemParams) bVar.mo60212a(), hashMap);
        }
        return new C33942b("ui_state", hashMap);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80929a(View view) {
        Context context = this.f113959R;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        this.f113961T = C1870c.m6045a((Activity) context, (int) R.layout.t8);
        this.f116044d = (VideoTitleFollowBtn) this.f113961T.findViewById(R.id.xm);
        this.f116041a = new C50061ao(this.f113961T, this.f116045e, this.f113959R, this.f116043c);
        C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50254a(this)));
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    public final void mo80935b(C33942b bVar) {
        MethodCollector.m26663i(5571);
        if (!this.f113952K) {
            this.f113952K = true;
            if (this.f113960S instanceof FrameLayout) {
                ((FrameLayout) this.f113960S).addView(this.f113961T, new FrameLayout.LayoutParams(-2, -2));
            }
        }
        if (bVar == null) {
            MethodCollector.m26664o(5571);
            return;
        }
        C50061ao aoVar = this.f116041a;
        if (aoVar != null) {
            Object a = bVar.mo60212a();
            C89219l.m154716b(a, "");
            aoVar.mo85186a((HashMap) a);
            MethodCollector.m26664o(5571);
            return;
        }
        MethodCollector.m26664o(5571);
    }

    @AbstractC90264r
    public final void onFollowEvent(FollowStatusEvent followStatusEvent) {
        C50061ao aoVar;
        C89219l.m154721d(followStatusEvent, "");
        FollowStatus followStatus = followStatusEvent.status;
        if (!TextUtils.isEmpty(followStatus.userId) && TextUtils.equals(C59208ac.m108758a(this.f113953L), followStatus.userId) && (aoVar = this.f116041a) != null) {
            C89219l.m154721d(followStatus, "");
            if (C50130bm.m94080c(aoVar.f115575r)) {
                C50061ao.RunnableC50068e eVar = new C50061ao.RunnableC50068e(aoVar, followStatus);
                if (C89219l.m154714a(Looper.getMainLooper(), Looper.myLooper())) {
                    eVar.run();
                } else if (aoVar.f115541b == null || aoVar.f115573p == null) {
                    C51423a.m95784a(3, null, "onFollowEvent mFollowUserBtn is null!");
                } else {
                    View view = aoVar.f115541b;
                    if (view != null) {
                        view.post(eVar);
                    }
                }
            }
        }
    }

    public C50253dz(View view, View.OnTouchListener onTouchListener, AbstractC1204m mVar, HashMap<String, String> hashMap) {
        super(view);
        this.f116045e = onTouchListener;
        this.f116042b = mVar;
        this.f116043c = hashMap;
    }
}
