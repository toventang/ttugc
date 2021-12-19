package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1721g.C23144b;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36387c;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38255s;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39114d;
import com.p2082ss.android.ugc.aweme.feed.assem.videocomment.C49178a;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49559p;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.RunnableC49561r;
import com.p2082ss.android.ugc.aweme.feed.helper.C49645l;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.legoImp.inflate.C58292e;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.aweme.main.p3428b.C59043a;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.p2307ai.View$OnTouchListenerC33468a;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33918a;
import com.p2082ss.android.ugc.aweme.p2483co.C36149c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80636z;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bt */
public class C50150bt extends AbstractC49544a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    TextView f115747a;

    /* renamed from: b */
    View f115748b;

    /* renamed from: c */
    ImageView f115749c;

    /* renamed from: d */
    View f115750d;

    /* renamed from: e */
    ImageView f115751e;

    /* renamed from: f */
    private C36149c f115752f;

    static {
        Covode.recordClassIndex(59276);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new RunnableC90250g(C50150bt.class, "onVideoEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        hashMap.put(5, new RunnableC90250g(C50150bt.class, "onCommentEvent", C36387c.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80928a() {
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: b */
    private C36149c m94108b() {
        if (this.f115752f == null) {
            this.f115752f = new C36149c();
        }
        return this.f115752f;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo81273a(VideoItemParams videoItemParams) {
        super.mo81273a(videoItemParams);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bt$a */
    public class View$OnClickListenerC50151a implements View.OnClickListener {
        static {
            Covode.recordClassIndex(59277);
        }

        public View$OnClickListenerC50151a() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C49178a.m92269a();
            C39162r.m79460a("verify_precise_exp", new C33744d().mo59983a("scene", "enter_comment").f79943a);
            C50150bt.this.f113958Q.mo60191a("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR", C50150bt.this.f113953L.getAid());
            if (C58956a.m108315a(C50150bt.this.f113953L)) {
                new C79459a(C50150bt.this.f113959R).mo123052a(C58956a.m108314a(C50150bt.this.f113953L, R.string.h8k)).mo123053a();
            } else if (C50150bt.this.f113953L == null || (C50150bt.this.f113953L.isCanPlay() && !C50150bt.this.f113953L.isDelete())) {
                CommentServiceImpl.m73664e().mo63302b();
                C49645l.m93085a();
                C49645l.m93090b(C50150bt.this.f115749c, C50150bt.this.f113954M, C59208ac.m108771e(C50150bt.this.f113953L), C59208ac.m108758a(C50150bt.this.f113953L));
                AbstractC81915c.m141874a(new C59043a());
                if (C80636z.m139819d(C50150bt.this.f113953L) && !C50545m.m94762a(C50150bt.this.f113953L)) {
                    new C79459a(C50150bt.this.f113959R).mo123050a(R.string.eti).mo123053a();
                } else if (!C50545m.m94762a(C50150bt.this.f113953L) && C80636z.m139818c(C50150bt.this.f113953L) && !C80636z.m139820e(C50150bt.this.f113953L)) {
                    new C79459a(C50150bt.this.f113959R).mo123050a(R.string.hc8).mo123053a();
                } else if (C50150bt.this.f113953L != null && C50150bt.this.f113953L.getVideoControl() != null && C50150bt.this.f113953L.getVideoControl().timerStatus == 0) {
                } else {
                    if (C37699a.m76252aX(C50150bt.this.f113953L)) {
                        new C23144b(view).mo37640e(R.string.akw).mo37637b();
                    } else if (C50150bt.this.f113953L == null || !C50150bt.this.f113953L.isProhibited()) {
                        C50150bt btVar = C50150bt.this;
                        if ((btVar.f113953L != null && btVar.f113953L.getStatus() != null && btVar.f113953L.getStatus().isAllowComment()) || C37699a.m76218U(C50150bt.this.f113953L)) {
                            C50150bt.this.f113958Q.mo60191a("video_comment_list", (Object) 7);
                        } else if (!C37699a.m76218U(C50150bt.this.f113953L)) {
                            new C79459a(C50150bt.this.f113959R).mo123050a(R.string.a8t).mo123053a();
                        }
                        if ("homepage_hot".equals(C50150bt.this.f113954M) && C37699a.m76314s(C50150bt.this.f113953L)) {
                            C38000g.m77050a().mo65893e(C50150bt.this.f113959R, C50150bt.this.f113953L);
                        }
                    } else {
                        new C79459a(C50150bt.this.f113959R).mo123050a(R.string.akw).mo123053a();
                    }
                }
            } else if (C50150bt.this.f113953L.isImage()) {
                new C79459a(C50150bt.this.f113959R).mo123050a(R.string.civ).mo123053a();
            } else {
                new C79459a(C50150bt.this.f113959R).mo123050a(R.string.h8k).mo123053a();
            }
        }
    }

    public C50150bt(View view) {
        super(view);
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    /* renamed from: a */
    private static String m94106a(long j) {
        if (j <= 0) {
            return "0";
        }
        return C53437b.m98615a(j);
    }

    /* renamed from: b */
    private static long m94107b(Aweme aweme) {
        AwemeStatistics statistics;
        if (aweme == null || (statistics = aweme.getStatistics()) == null) {
            return 0;
        }
        return statistics.getCommentCount() + 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: c */
    public final void mo80938c(C33942b bVar) {
        if (bVar != null) {
            C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50152bu(this, bVar.f80277a, bVar, VideoGiftService.m120814l())));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: d */
    public final boolean mo81279d(C33942b bVar) {
        View view;
        if (!bVar.f80277a.equals("video_open_comment_dialog")) {
            return false;
        }
        if (this.f113953L == null || this.f113961T == null || (view = this.f115750d) == null) {
            return true;
        }
        view.callOnClick();
        return true;
    }

    @AbstractC90264r
    public void onCommentEvent(C36387c cVar) {
        Object[] objArr;
        int i = cVar.f86061a;
        if ((i == 3 || i == 4 || i == 8) && (objArr = (Object[]) cVar.f86062b) != null && objArr.length == 2) {
            m94110c((Map<String, Object>) null);
        }
    }

    @AbstractC90264r
    public void onVideoEvent(C49672ag agVar) {
        if (agVar != null && 14 == agVar.f114315a) {
            if (C13627m.m24499a(this.f113953L.getAid(), (String) agVar.f114316b)) {
                m94110c((Map<String, Object>) null);
            }
        }
    }

    /* renamed from: a */
    private static long m94105a(Aweme aweme) {
        AwemeStatistics statistics;
        if (aweme == null || (statistics = aweme.getStatistics()) == null) {
            return 0;
        }
        long commentCount = statistics.getCommentCount();
        C38255s adCommentStruct = aweme.getAdCommentStruct();
        if (adCommentStruct == null) {
            return commentCount;
        }
        if (commentCount > 0 || adCommentStruct.showAsDefault()) {
            return commentCount + 1;
        }
        return commentCount;
    }

    /* renamed from: c */
    private void m94109c(Aweme aweme) {
        int i;
        if (aweme != null) {
            if (aweme.isAd() || !C37699a.m76217T(aweme)) {
                TextView textView = this.f115747a;
                if (aweme.isCmtSwt() || C37699a.m76218U(aweme)) {
                    i = 4;
                } else {
                    i = 0;
                }
                textView.setVisibility(i);
            }
            if (aweme.isDelete()) {
                this.f115747a.setVisibility(4);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: e */
    public final C33942b mo81280e(C33942b bVar) {
        if (bVar == null) {
            return null;
        }
        super.mo81280e(bVar);
        if (!bVar.f80277a.equals("video_params")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        C33942b bVar2 = new C33942b("ui_state", hashMap);
        hashMap.put("aweme_state", this.f113953L);
        hashMap.put("isInActivityState", Boolean.valueOf(C33918a.m69450a()));
        return bVar2;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80931a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo60189a("show_festival_activity_icon", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("video_open_comment_dialog", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("on_viewpager_page_selected", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("action_video_on_play_progress_change", (AbstractC1214u<C33942b>) this.f113951J);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    public final void mo80935b(C33942b bVar) {
        MethodCollector.m26663i(4757);
        if (!this.f113952K) {
            this.f113952K = true;
            if (this.f113960S instanceof FrameLayout) {
                ((FrameLayout) this.f113960S).addView(this.f113961T);
            }
        }
        if (bVar == null) {
            MethodCollector.m26664o(4757);
            return;
        }
        HashMap hashMap = (HashMap) bVar.mo60212a();
        if (hashMap.get("aweme_state") == null) {
            MethodCollector.m26664o(4757);
            return;
        }
        mo81274a(hashMap);
        m94110c(hashMap);
        m94108b().mo63274b();
        MethodCollector.m26664o(4757);
    }

    /* renamed from: c */
    private void m94110c(Map<String, Object> map) {
        Aweme aweme;
        long j;
        if (map != null) {
            aweme = (Aweme) map.get("aweme_state");
        } else {
            aweme = this.f113953L;
        }
        if (aweme == null || !aweme.isDelete()) {
            this.f115747a.setVisibility(0);
            this.f115748b.setVisibility(0);
            String aid = this.f113953L.getAid();
            if (aid == null || !C50108be.m94063c(aid)) {
                this.f115751e.setVisibility(8);
            } else {
                this.f115751e.setVisibility(0);
            }
            m94109c(aweme);
            long j2 = 0;
            if (CommentServiceImpl.m73664e().mo63307c(aweme) || C58956a.m108315a(aweme)) {
                j = 0;
            } else {
                j = m94105a(aweme);
            }
            if (CommentServiceImpl.m73664e().mo63280a(aweme) != null) {
                j = m94107b(aweme);
            }
            if (j >= 0) {
                j2 = j;
            }
            try {
                this.f115747a.setText(m94106a(j2));
            } catch (Exception e) {
                C51423a.m95790a((Throwable) e);
                this.f115747a.setText("0");
            }
        } else {
            this.f115747a.setVisibility(4);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80929a(View view) {
        this.f113961T = C1870c.m6045a((Activity) this.f113959R, (int) R.layout.sy);
        View findViewById = this.f113961T.findViewById(R.id.a_x);
        this.f115750d = findViewById;
        if (findViewById == null) {
            this.f113961T = C58292e.m105313a(getClass().getName(), this.f113961T, this.f113959R, R.layout.sy);
            this.f115750d = this.f113961T.findViewById(R.id.a_x);
        }
        this.f115747a = (TextView) this.f113961T.findViewById(R.id.a9a);
        this.f115748b = this.f113961T.findViewById(R.id.a99);
        this.f115749c = (ImageView) this.f113961T.findViewById(R.id.a9q);
        this.f115750d.setOnClickListener(new View$OnClickListenerC50151a());
        this.f115747a.setOnClickListener(new View$OnClickListenerC50151a());
        this.f115748b.setOnClickListener(new View$OnClickListenerC50151a());
        this.f115748b.setOnTouchListener(new View$OnTouchListenerC33468a(0.6f));
        if (C56216k.m102131a()) {
            C39114d.m79408a(this.f115747a, 14);
        }
        this.f115751e = (ImageView) this.f113961T.findViewById(R.id.a9o);
        C36149c b = m94108b();
        b.f85394a = this.f113960S;
        b.f85395b = this.f115748b;
        b.f85396c = this.f115749c;
        b.f85397d = this.f115747a;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo81274a(Map<String, Object> map) {
        if (map != null) {
            if (!((Boolean) map.get("isInActivityState")).booleanValue()) {
                return;
            }
        } else if (!C33918a.m69450a()) {
            return;
        }
        this.f115749c.setImageDrawable(C0643b.m2369a(this.f113959R, 2131233147));
    }
}
