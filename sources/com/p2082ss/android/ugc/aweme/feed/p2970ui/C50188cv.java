package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.kakao.usermgmt.StringSet;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.app.p2322c.C33721c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.captcha.util.CaptchaHelperServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.api.AbstractC36272e;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39114d;
import com.p2082ss.android.ugc.aweme.discover.hitrank.C42066d;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.C48317al;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49526q;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49559p;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.RunnableC49561r;
import com.p2082ss.android.ugc.aweme.feed.helper.C49619e;
import com.p2082ss.android.ugc.aweme.feed.helper.C49645l;
import com.p2082ss.android.ugc.aweme.feed.helper.C49648o;
import com.p2082ss.android.ugc.aweme.feed.helper.C49653t;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49690r;
import com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49991w;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49957aa;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49959ac;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50323k;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50524a;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50535d;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50541i;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50560y;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.feed.widget.DiggAnimationView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59263y;
import com.p2082ss.android.ugc.aweme.metrics.C59264z;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33918a;
import com.p2082ss.android.ugc.aweme.p2483co.C36150d;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.p3538o.C62692b;
import com.p2082ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import com.p2082ss.android.ugc.aweme.utils.C80632w;
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
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cv */
public class C50188cv extends AbstractC49544a implements AbstractC49991w, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    DiggAnimationView f115869a;

    /* renamed from: b */
    TextView f115870b;

    /* renamed from: c */
    View f115871c;

    /* renamed from: d */
    public long f115872d;

    /* renamed from: e */
    public boolean f115873e;

    /* renamed from: f */
    long f115874f;

    /* renamed from: g */
    public C49959ac f115875g;

    /* renamed from: h */
    Drawable f115876h;

    /* renamed from: i */
    public final String f115877i;

    /* renamed from: j */
    AbstractC36272e f115878j;

    /* renamed from: k */
    public View f115879k;

    /* renamed from: l */
    AbstractC1214u<C89378p<String, Long>> f115880l = new C50192cw(this);

    /* renamed from: m */
    public View.OnClickListener f115881m = new View.OnClickListener() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50188cv.View$OnClickListenerC501891 */

        static {
            Covode.recordClassIndex(59315);
        }

        /* renamed from: a */
        private static boolean m94208a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C50188cv.this.f113958Q.mo60191a("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR", C50188cv.this.f113953L.getAid());
            if (C37699a.m76278ax(C50188cv.this.f113953L)) {
                new C79459a(C50188cv.this.f113959R).mo123050a(R.string.o6).mo123053a();
                return;
            }
            int a = C49526q.m92767a();
            if (a != 0 ? !(a <= 0 || C31575b.m65865g().isLogin() || C50188cv.this.f115873e || C50188cv.this.f113953L.getUserDigg() != 0 || C48317al.m91756b() < a) : (!C31575b.m65865g().isLogin())) {
                C59264z a2 = new C59264z().mo96855a(C50188cv.this.f115877i);
                a2.f135474e = C50188cv.this.f113957P;
                a2.f135470a = C50188cv.this.f113953L.getAid();
                C59264z f = a2.mo96749g(C50188cv.this.f113953L);
                f.f135471b = "click_like";
                f.f135472c = !C48317al.m91758d() ? 1 : 0;
                f.f135473d = 1;
                f.mo96792f();
                if (!C48317al.m91758d()) {
                    C48317al.m91757c();
                }
                if (C50188cv.this.f113953L != null) {
                    str = C50188cv.this.f113953L.getAid();
                } else {
                    str = "";
                }
                C58957c.m108320a((Activity) C50188cv.this.f113959R, C50188cv.this.f115877i, "click_like", new C80222ap().mo123649a("login_title", "").mo123649a("group_id", str).mo123649a("log_pb", C59208ac.m108768c(str)).f179700a, new C50206de(this, view));
            } else if (C37699a.m76252aX(C50188cv.this.f113953L)) {
                new C23144b(view).mo37640e(R.string.cuu).mo37637b();
            } else if (C58956a.m108315a(C50188cv.this.f113953L) && C50188cv.this.f113953L.getUserDigg() == 0) {
                new C79459a(C50188cv.this.f113959R).mo123052a(C58956a.m108314a(C50188cv.this.f113953L, R.string.h8k)).mo123053a();
            } else if (C50188cv.this.f113953L.isCanPlay() || C50188cv.this.f113953L.getUserDigg() != 0) {
                if (C50188cv.this.f113953L.isDelete() && C50188cv.this.f113953L.getUserDigg() == 0) {
                    new C79459a(C50188cv.this.f113959R).mo123050a(R.string.h8k).mo123053a();
                } else if (C50188cv.this.f113953L.getVideoControl() != null && C50188cv.this.f113953L.getVideoControl().timerStatus == 0) {
                } else {
                    if (C50188cv.this.f113953L.isProhibited()) {
                        new C79459a(C50188cv.this.f113959R).mo123050a(R.string.cuu).mo123053a();
                    } else if (C50545m.m94762a(C50188cv.this.f113953L) && C80636z.m139819d(C50188cv.this.f113953L)) {
                        new C23144b(C50188cv.this.f115879k).mo37640e(R.string.et2).mo37637b();
                    } else if (C50188cv.this.f115873e || !C80636z.m139818c(C50188cv.this.f113953L) || !C80636z.m139816a(C50188cv.this.f113953L)) {
                        C50188cv.this.f115869a.mo85725a(view);
                        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                            C58029j.f132256h = m94208a();
                        }
                        if (!C58029j.f132256h) {
                            new C79459a(C50188cv.this.f113959R).mo123050a(R.string.dcq).mo123053a();
                            return;
                        }
                        C50188cv cvVar = C50188cv.this;
                        cvVar.mo85346a(cvVar.f113953L);
                    } else {
                        new C79459a(C50188cv.this.f113959R).mo123050a(R.string.hc8).mo123053a();
                    }
                }
            } else if (C50188cv.this.f113953L.isImage()) {
                new C79459a(C50188cv.this.f113959R).mo123050a(R.string.civ).mo123053a();
            } else {
                new C79459a(C50188cv.this.f113959R).mo123050a(R.string.h8k).mo123053a();
            }
        }
    };

    /* renamed from: n */
    private long f115882n;

    /* renamed from: o */
    private int f115883o;

    /* renamed from: p */
    private View f115884p;

    /* renamed from: q */
    private final String f115885q;

    /* renamed from: r */
    private final String f115886r;

    /* renamed from: s */
    private final String f115887s;

    /* renamed from: t */
    private final String f115888t;

    /* renamed from: u */
    private final String f115889u;

    /* renamed from: v */
    private final String f115890v;

    /* renamed from: w */
    private final VideoDiggWidget.AbstractC49543a f115891w;

    /* renamed from: x */
    private C36150d f115892x;

    /* renamed from: y */
    private View f115893y;

    /* renamed from: z */
    private C50524a f115894z = new C50524a();

    static {
        Covode.recordClassIndex(59314);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(7, new RunnableC90250g(C50188cv.class, "onEventDiggUpdate", C49690r.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85348a(boolean z, Aweme aweme, Map<String, Object> map) {
        long j;
        if (aweme != null) {
            this.f115869a.setSelected(z);
            j = ((Long) map.get("digg_count_state")).longValue();
            this.f113958Q.mo60191a("update_diig_view", Boolean.valueOf(z));
            if (j < 0) {
                j = 0;
            }
            if (aweme != null) {
                try {
                    if (aweme.isDelete() && j == 0) {
                        this.f115870b.setVisibility(4);
                        this.f115874f = j;
                    }
                } catch (NullPointerException e) {
                    this.f115870b.setText(m94186a(0, aweme));
                    this.f115874f = 0;
                    C51423a.m95790a((Throwable) e);
                    e.printStackTrace();
                    return;
                }
            }
        } else {
            C51423a.m95791b(6, "VideoDiggView", "updateDiggView when aweme is null:" + Log.getStackTraceString(new Throwable()));
            j = 0;
        }
        this.f115870b.setVisibility(0);
        this.f115870b.setText(m94186a(j, aweme));
        this.f115874f = j;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo81274a(Map<String, Object> map) {
        if (map != null) {
            if (!((Boolean) map.get("isInActivityState")).booleanValue()) {
                C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50195cz(this)));
                return;
            }
        } else if (!C33918a.m69450a()) {
            C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50202da(this)));
            return;
        }
        C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50203db(this)));
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49991w
    /* renamed from: a */
    public final void mo72644a(Exception exc) {
        CaptchaHelperServiceImpl.m72448a();
        final Aweme aweme = this.f113953L;
        if (!(this.f113959R == null || aweme == null)) {
            C49559p.f113984a.mo81305a(new RunnableC49561r(this.f113950I, new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50188cv.RunnableC501902 */

                static {
                    Covode.recordClassIndex(59316);
                }

                public final void run() {
                    final boolean z;
                    if (!C50188cv.this.f115873e) {
                        C50188cv.this.f115872d++;
                        z = true;
                    } else {
                        if (C50188cv.this.f115873e) {
                            C50188cv.this.f115872d--;
                        }
                        z = false;
                    }
                    C49559p.f113984a.mo81305a(new RunnableC49561r(false, new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50188cv.RunnableC501902.RunnableC501911 */

                        static {
                            Covode.recordClassIndex(59317);
                        }

                        public final void run() {
                            C50188cv.this.mo85347a(z, aweme);
                        }
                    }));
                }
            }));
        }
        C33615a.m68848a(this.f113959R, (Throwable) exc, this.f115875g.mo84999d() == 1 ? R.string.b6t : R.string.h11);
    }

    /* renamed from: b */
    private C36150d m94189b() {
        if (this.f115892x == null) {
            this.f115892x = new C36150d();
        }
        return this.f115892x;
    }

    /* renamed from: c */
    private JSONObject m94193c() {
        return C50541i.m94754a(this.f113953L, this.f113957P, this.f113962U, this.f115877i);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80928a() {
        EventBus.m156962a().mo145395b(this);
        C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50205dd(this)));
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo81273a(VideoItemParams videoItemParams) {
        super.mo81273a(videoItemParams);
    }

    @AbstractC90264r
    public void onEventDiggUpdate(C49690r rVar) {
        if (rVar != null && TextUtils.equals(rVar.f114356a, C59208ac.m108771e(this.f113953L))) {
            mo85347a(rVar.f114357b, this.f113953L);
        }
    }

    /* renamed from: d */
    private static void m94194d(Aweme aweme) {
        if (aweme != null) {
            C39162r.m79460a("unlogin_like_cancel", new C33744d().mo59983a("enter_from", "homepage_hot").mo59983a("group_id", aweme.getAid()).mo59983a("author_id", C59208ac.m108758a(aweme)).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(aweme.getRequestId())).f79943a);
        }
    }

    /* renamed from: b */
    private static String m94190b(Aweme aweme) {
        if (aweme.isLive()) {
            if (aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().getNewLiveRoomData() == null) {
                return null;
            }
            return String.valueOf(aweme.getRoomFeedCellStruct().getNewLiveRoomData().getAnchorId());
        } else if (aweme.getAuthor() == null || !aweme.getAuthor().isLive()) {
            return null;
        } else {
            return String.valueOf(aweme.getAuthor().getUid());
        }
    }

    /* renamed from: c */
    private static String m94192c(Aweme aweme) {
        if (aweme.isLive()) {
            if (aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().getNewLiveRoomData() == null) {
                return null;
            }
            return String.valueOf(aweme.getRoomFeedCellStruct().getNewLiveRoomData().f114485id);
        } else if (aweme.getAuthor() == null || !aweme.getAuthor().isLive()) {
            return null;
        } else {
            return String.valueOf(aweme.getAuthor().roomId);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49991w
    /* renamed from: a */
    public final void mo72639a(C0692e<String, Integer> eVar) {
        this.f113958Q.mo60191a("digg_success", eVar);
        C49672ag agVar = new C49672ag(13, eVar.f2750a);
        Bundle bundle = new Bundle();
        S s = eVar.f2751b;
        if (s == null) {
            s = -1;
        }
        bundle.putInt("user_digged", s.intValue());
        agVar.f114317c = bundle;
        AbstractC81915c.m141874a(agVar);
        AbstractC81915c.m141874a(new C62692b(s.intValue()));
        C42066d.f98067b.mo71244a(this.f113953L, 4);
        SpecActServiceImpl.m131497i().mo118029b("like");
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: e */
    public final C33942b mo81280e(C33942b bVar) {
        long diggCount;
        C33942b bVar2 = null;
        if (bVar == null) {
            return null;
        }
        super.mo81280e(bVar);
        if (bVar.f80277a.equals("video_params")) {
            HashMap hashMap = new HashMap();
            bVar2 = new C33942b("uistate", hashMap);
            Aweme aweme = this.f113953L;
            hashMap.put("aweme_state", aweme);
            if (this.f113953L.getStatistics() == null) {
                diggCount = 0;
            } else {
                diggCount = this.f113953L.getStatistics().getDiggCount();
            }
            this.f115872d = diggCount;
            this.f115882n = diggCount;
            this.f115883o = this.f113953L.getUserDigg();
            hashMap.put("isInActivityState", Boolean.valueOf(C33918a.m69450a()));
            boolean z = true;
            if (aweme.getUserDigg() != 1) {
                z = false;
            }
            m94191b(z, aweme, hashMap);
            this.f115871c.setOnClickListener(this.f115881m);
            this.f115870b.setOnClickListener(this.f115881m);
            this.f115884p.setOnClickListener(this.f115881m);
        }
        return bVar2;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80929a(View view) {
        this.f115893y = view;
        View a = C1870c.m6045a((Activity) this.f113959R, (int) R.layout.t1);
        this.f115879k = a;
        this.f115869a = (DiggAnimationView) a.findViewById(R.id.al8);
        this.f115870b = (TextView) a.findViewById(R.id.ala);
        this.f115871c = a.findViewById(R.id.al_);
        this.f115884p = a.findViewById(R.id.ald);
        C49959ac acVar = new C49959ac();
        this.f115875g = acVar;
        acVar.mo67838a(new C49957aa());
        this.f115875g.mo67839a_(this);
        this.f115876h = this.f113959R.getResources().getDrawable(R.drawable.b10);
        EventBus.m156966a(EventBus.m156962a(), this);
        C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50193cx(this)));
        if (C56216k.m102131a()) {
            C39114d.m79408a(this.f115870b, 12);
        }
        C36150d b = m94189b();
        b.f85398a = this.f113960S;
        b.f85399b = this.f115871c;
        b.f85400c = this.f115869a;
        b.f85401d = this.f115870b;
        Drawable d = C36150d.m73649d();
        if (d != null) {
            this.f115876h = d;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    public final void mo80935b(C33942b bVar) {
        MethodCollector.m26663i(5446);
        boolean z = true;
        if (!this.f113952K) {
            this.f113952K = true;
            View view = this.f115893y;
            if (view instanceof FrameLayout) {
                ((FrameLayout) view).addView(this.f115879k);
            }
        }
        if (bVar == null) {
            MethodCollector.m26664o(5446);
            return;
        }
        Map<String, Object> map = (Map) bVar.mo60212a();
        Aweme aweme = (Aweme) map.get("aweme_state");
        if (aweme == null) {
            C51423a.m95791b(6, "VideoDiggView", "dig aweme is null content visible" + this.f115879k.getVisibility());
            MethodCollector.m26664o(5446);
            return;
        }
        mo81274a(map);
        C51423a.m95791b(6, "VideoDiggView", "dig visible" + this.f115879k.getVisibility() + " aweme " + aweme.getAid());
        if (aweme.getUserDigg() != 1) {
            z = false;
        }
        mo85348a(z, aweme, map);
        m94189b().mo63274b();
        C89219l.m154721d("VideoDiggView OnBind", "");
        MethodCollector.m26664o(5446);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: c */
    public final void mo80938c(C33942b bVar) {
        Aweme aweme;
        boolean z;
        long diggCount;
        if (bVar != null) {
            String str = bVar.f80277a;
            str.hashCode();
            switch (str.hashCode()) {
                case -1475411887:
                    if (str.equals("handle_double_click")) {
                        Aweme aweme2 = (Aweme) bVar.mo60212a();
                        if (this.f113959R != null && aweme2 != null) {
                            if (C37699a.m76278ax(aweme2)) {
                                new C79459a(this.f113959R).mo123050a(R.string.o6).mo123053a();
                                return;
                            } else if (C37699a.m76252aX(aweme2)) {
                                new C23144b(this.f115871c).mo37640e(R.string.cuu).mo37637b();
                                return;
                            } else if (!this.f115873e && aweme2.getUserDigg() == 0) {
                                this.f115872d++;
                                HashMap hashMap = new HashMap();
                                m94191b(true, aweme2, hashMap);
                                C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50204dc(this, aweme2, hashMap)));
                                m94187a(aweme2, "click_double_like");
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 281945252:
                    if (!str.equals("show_festival_activity_icon")) {
                        return;
                    }
                    mo81274a((Map<String, Object>) null);
                    return;
                case 350216171:
                    if (!str.equals("on_page_selected")) {
                        return;
                    }
                    mo81274a((Map<String, Object>) null);
                    return;
                case 651229933:
                    if (!str.equals("awesome_update_backup_data")) {
                        return;
                    }
                    onChanged(new C33942b("video_params", bVar.mo60212a()));
                    return;
                case 710615618:
                    if (str.equals("video_resume_play") && (aweme = (Aweme) bVar.mo60212a()) != null && aweme.isAd()) {
                        if (aweme.getUserDigg() == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (this.f113953L != null) {
                            this.f115873e = z;
                            if (this.f113953L.getStatistics() == null) {
                                diggCount = 0;
                            } else {
                                diggCount = this.f113953L.getStatistics().getDiggCount();
                            }
                            this.f115872d = diggCount;
                            if (diggCount < 0) {
                                this.f115872d = 0;
                            }
                            C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50194cy(this, z, this.f115872d, this.f113953L)));
                            return;
                        }
                        return;
                    }
                    return;
                case 1759823748:
                    if (!str.equals("awesome_update_data")) {
                        return;
                    }
                    onChanged(new C33942b("video_params", bVar.mo60212a()));
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80931a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo60189a("video_resume_play", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("handle_double_click", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("show_festival_activity_icon", (AbstractC1214u<C33942b>) this.f113951J);
        }
    }

    /* renamed from: a */
    public final void mo85346a(Aweme aweme) {
        String str;
        if (this.f113959R == null || aweme == null) {
            C51423a.m95791b(6, "VideoDiggView", "handleDiggClick:" + String.valueOf(this.f113959R) + ",aweme:" + String.valueOf(aweme));
            return;
        }
        C49645l.m93085a();
        C49645l.m93090b(this.f115869a, this.f115877i, C59208ac.m108771e(this.f113953L), C59208ac.m108758a(this.f113953L));
        this.f113958Q.mo60191a("handle_digg_click", aweme);
        boolean z = true;
        if (!this.f115873e && aweme.getUserDigg() == 0) {
            this.f113958Q.mo60191a("video_digg", (Object) 5);
            this.f115872d++;
            mo85347a(true, aweme);
            m94187a(aweme, "click_like");
        } else if (!this.f115873e || aweme.getUserDigg() == 0) {
            if (aweme.getUserDigg() != 1) {
                z = false;
            }
            this.f115873e = z;
            mo85347a(z, aweme);
            if (this.f115873e) {
                this.f115872d++;
            } else {
                this.f115872d--;
            }
        } else {
            this.f113958Q.mo60191a("video_digg", (Object) 6);
            this.f115872d--;
            mo85347a(false, aweme);
            if (!C34719f.C34720a.f82009a.mo61395c()) {
                new C79459a(this.f113959R).mo123050a(R.string.dcq).mo123053a();
            } else {
                String searchResultId = FeedParamProvider.m93269a(this.f113959R).getSearchResultId();
                if (TextUtils.isEmpty(searchResultId)) {
                    searchResultId = C59208ac.m108771e(aweme);
                }
                if (aweme.playlist_info != null) {
                    str = aweme.playlist_info.getMixId();
                } else {
                    str = "";
                }
                C59263y yVar = (C59263y) new C59263y("like_cancel").mo96852a(this.f115877i).mo96810l(FeedParamProvider.m93269a(this.f113959R).getSearchId()).mo96804f(searchResultId);
                yVar.f135462e = this.f115885q;
                yVar.f135432a = this.f113957P;
                C59263y o = yVar.mo96749g(aweme).mo96854o(this.f115888t);
                o.f135465r = this.f115889u;
                o.f135466s = this.f115890v;
                o.f135429X = str;
                o.mo96788a(C80632w.m139800a(this.f113953L, "like_cancel", this.f115877i)).mo96792f();
                if (!TextUtils.equals("opus", this.f115877i)) {
                    C39162r.m79456a("like_cancel", this.f115877i, aweme.getAid(), 0, m94193c());
                } else if (this.f113956O) {
                    C39162r.m79456a("like_cancel", "personal_homepage", aweme.getAid(), 0, m94193c());
                } else {
                    C39162r.m79456a("like_cancel", "others_homepage", aweme.getAid(), 0, m94193c());
                }
                if (aweme.getAwemeType() != 34) {
                    m94188a(aweme.getAid(), 0, aweme);
                } else {
                    C38000g.m77050a().mo65895g(this.f113959R, aweme);
                    C18129a.m33746a("draw_ad", "like_cancel", aweme.getAwemeRawAd()).mo28902c();
                }
            }
        }
        C50524a.m94705a(this.f113959R, this.f113959R.getString(R.string.kn), false, 0);
    }

    /* renamed from: a */
    public final void mo85347a(boolean z, Aweme aweme) {
        HashMap hashMap = new HashMap();
        m94191b(z, aweme, hashMap);
        mo85348a(z, aweme, hashMap);
    }

    /* renamed from: a */
    static String m94186a(long j, Aweme aweme) {
        if (!C58956a.m108315a(aweme) && j > 0) {
            return C53437b.m98615a(j);
        }
        return "0";
    }

    /* renamed from: a */
    private void m94187a(Aweme aweme, String str) {
        boolean z;
        String str2;
        long j;
        String str3;
        long j2;
        if (!TextUtils.equals("opus", this.f115877i)) {
            C39162r.m79456a("like", this.f115877i, aweme.getAid(), 0, m94193c());
        } else if (this.f113956O) {
            C39162r.m79456a("like", "personal_homepage", aweme.getAid(), 0, m94193c());
        } else {
            C39162r.m79456a("like", "others_homepage", aweme.getAid(), 0, m94193c());
        }
        String a = C49619e.m93060a(this.f113957P, this.f115877i, true);
        if (aweme == null || aweme.getBottomBarModel() == null) {
            z = false;
        } else {
            z = true;
        }
        if (aweme == null || aweme.playlist_info == null) {
            str2 = "";
        } else {
            str2 = aweme.playlist_info.getMixId();
        }
        if (!C31575b.m65865g().isLogin()) {
            C59264z a2 = new C59264z().mo96855a(this.f115877i);
            a2.f135474e = this.f113957P;
            a2.f135470a = aweme.getAid();
            C59264z f = a2.mo96749g(aweme);
            f.f135471b = str;
            f.f135472c = !C48317al.m91758d() ? 1 : 0;
            f.f135473d = 0;
            f.mo96792f();
            String searchResultId = FeedParamProvider.C49809a.m93270a(this.f113959R).getSearchResultId();
            if (TextUtils.isEmpty(searchResultId)) {
                searchResultId = C59208ac.m108771e(aweme);
            }
            C59263y yVar = new C59263y();
            yVar.f135468u = 0;
            yVar.f135467t = str;
            C59263y a3 = yVar.mo96852a(a);
            a3.f135462e = this.f115885q;
            a3.f135459b = (String) this.f113958Q.mo60195b("playlist_type", "");
            a3.f135461d = (String) this.f113958Q.mo60195b("playlist_id", "");
            a3.f135460c = (String) this.f113958Q.mo60195b("playlist_id_key", "");
            C59263y yVar2 = (C59263y) ((C59263y) a3.mo96801c((String) this.f113958Q.mo60195b("tab_name", "")).mo96802d(C59208ac.m108764b(this.f113953L, this.f113957P))).mo96749g(aweme).mo96799a(Boolean.valueOf(C50545m.m94765b(aweme)));
            VideoDiggWidget.AbstractC49543a aVar = this.f115891w;
            if (aVar != null) {
                j2 = aVar.mo80546a();
            } else {
                j2 = 0;
            }
            yVar2.f135469v = j2;
            C59263y o = yVar2.mo96854o(this.f115888t);
            o.f135465r = this.f115889u;
            o.f135466s = this.f115890v;
            C59263y yVar3 = (C59263y) o.mo96810l(FeedParamProvider.C49809a.m93270a(this.f113959R).getSearchId()).mo96804f(searchResultId);
            yVar3.f135429X = str2;
            yVar3.f135434ab = a;
            yVar3.f135435ac = FeedParamProvider.C49809a.m93270a(this.f113959R).getLastGroupId();
            C59263y yVar4 = (C59263y) yVar3.mo96771n(C50560y.m94791a(this.f115885q, this.f115886r));
            yVar4.f135436ad = FeedParamProvider.C49809a.m93270a(this.f113959R).getNewsId();
            yVar4.mo96788a(C80632w.m139800a(this.f113953L, "like", this.f115877i)).mo96792f();
        } else {
            String searchResultId2 = FeedParamProvider.C49809a.m93270a(this.f113959R).getSearchResultId();
            if (TextUtils.isEmpty(searchResultId2)) {
                searchResultId2 = C59208ac.m108771e(aweme);
            }
            this.f113958Q.mo60191a("follow_button_interaction", C50323k.EnumC50325b.LIKE);
            C59263y yVar5 = new C59263y();
            yVar5.f135468u = 1;
            yVar5.f135467t = str;
            C59263y yVar6 = (C59263y) yVar5.mo96852a(a).mo96810l(FeedParamProvider.C49809a.m93270a(this.f113959R).getSearchId());
            yVar6.f135462e = this.f115885q;
            yVar6.f135463p = this.f115887s;
            yVar6.f135464q = z;
            yVar6.f135459b = (String) this.f113958Q.mo60195b("playlist_type", "");
            yVar6.f135461d = (String) this.f113958Q.mo60195b("playlist_id", "");
            yVar6.f135460c = (String) this.f113958Q.mo60195b("playlist_id_key", "");
            C59263y yVar7 = (C59263y) ((C59263y) yVar6.mo96801c((String) this.f113958Q.mo60195b("tab_name", "")).mo96802d(C59208ac.m108764b(this.f113953L, this.f113957P))).mo96749g(aweme).mo96799a(Boolean.valueOf(C50545m.m94765b(aweme)));
            VideoDiggWidget.AbstractC49543a aVar2 = this.f115891w;
            if (aVar2 != null) {
                j = aVar2.mo80546a();
            } else {
                j = 0;
            }
            yVar7.f135469v = j;
            C59263y o2 = yVar7.mo96854o(this.f115888t);
            o2.f135465r = this.f115889u;
            o2.f135466s = this.f115890v;
            C59263y yVar8 = (C59263y) o2.mo96810l(FeedParamProvider.C49809a.m93270a(this.f113959R).getSearchId()).mo96804f(searchResultId2);
            yVar8.f135222V = C76598h.m134176a(aweme.getAuthor());
            if (C76706a.m134281g(this.f113953L)) {
                str3 = "story";
            } else {
                str3 = UGCMonitor.TYPE_POST;
            }
            yVar8.f135223W = str3;
            yVar8.f135434ab = a;
            yVar8.f135435ac = FeedParamProvider.C49809a.m93270a(this.f113959R).getLastGroupId();
            C59263y yVar9 = (C59263y) yVar8.mo96752b_(C76706a.m134276b(aweme));
            yVar9.f135429X = str2;
            yVar9.f135436ad = FeedParamProvider.C49809a.m93270a(this.f113959R).getNewsId();
            AbstractC59242h n = yVar9.mo96771n(C50560y.m94791a(this.f115885q, this.f115886r));
            C79900c.m138667a(n, aweme, a);
            C76598h.m134178a(n, aweme).mo96788a(C80632w.m139800a(this.f113953L, "like", this.f115877i)).mo96792f();
        }
        if (aweme.getAwemeType() != 34) {
            m94188a(aweme.getAid(), 1, aweme);
            return;
        }
        C38000g.m77050a().mo65894f(this.f113959R, aweme);
        C18129a.m33746a("draw_ad", "like", aweme.getAwemeRawAd()).mo28897a("anchor_id", m94190b(aweme)).mo28897a("room_id", m94192c(aweme)).mo28902c();
    }

    public C50188cv(View view, Bundle bundle, VideoDiggWidget.AbstractC49543a aVar) {
        super(view);
        this.f115877i = bundle.getString("eventType");
        this.f115885q = bundle.getString("previousPage");
        this.f115886r = bundle.getString("from_group_id");
        this.f115887s = bundle.getString("previousPagePosition");
        this.f115888t = bundle.getString("creationId");
        this.f115889u = bundle.getString("challengeId");
        this.f115890v = bundle.getString("extra_parent_tag_id");
        this.f115891w = aVar;
    }

    /* renamed from: b */
    private void m94191b(boolean z, Aweme aweme, Map<String, Object> map) {
        long j;
        AbstractC36272e b;
        if (aweme != null) {
            this.f115873e = z;
            if (z) {
                if (this.f115883o == 1) {
                    if (this.f115882n < 1 && !aweme.isDelete()) {
                        this.f115882n = 1;
                    }
                    j = this.f115882n;
                } else {
                    j = 1 + this.f115882n;
                }
            } else if (this.f115883o != 1 || aweme.isDelete()) {
                j = this.f115882n;
            } else {
                j = this.f115882n - 1;
            }
            map.put("digg_count_state", Long.valueOf(j));
            if ((this.f113959R instanceof ActivityC0945e) && (b = CommentServiceImpl.m73664e().mo63298b((ActivityC0945e) this.f113959R)) != null) {
                b.mo63461a(aweme.getAid(), j);
                return;
            }
            return;
        }
        C51423a.m95791b(6, "VideoDiggView", "updateDiggView when aweme is null:" + Log.getStackTraceString(new Throwable()));
    }

    /* renamed from: a */
    private void m94188a(String str, int i, Aweme aweme) {
        if (!C48317al.m91758d()) {
            C48317al.m91757c();
        }
        if (!TextUtils.isEmpty(this.f115877i) && i == 1) {
            C49653t.m93096a(new C49648o(aweme.getAid(), 1, System.currentTimeMillis(), this.f115877i));
        }
        if (C49526q.m92767a() == 0 || C31575b.m65865g().isLogin()) {
            HashMap hashMap = new HashMap();
            hashMap.put("aweme_id", String.valueOf(str));
            hashMap.put(StringSet.type, String.valueOf(i));
            hashMap.put("channel_id", String.valueOf(C33721c.m69041a(this.f115877i)));
            if (this.f113953L == null || !this.f113953L.isAd()) {
                C50535d.m94740a(this.f115877i, null, hashMap);
            } else {
                C50535d.m94739a(this.f113959R, this.f113953L.getAwemeRawAd().getLogExtra(), String.valueOf(this.f113953L.getAwemeRawAd().getAdId()), String.valueOf(this.f113953L.getAwemeRawAd().getCreativeId()), hashMap);
            }
            this.f115875g.mo57616a(hashMap);
        } else if (i == 1) {
            C48317al.m91755a(C48317al.m91756b() + 1);
            if (!(aweme == null || aweme.getStatistics() == null)) {
                aweme.setUserDigg(1);
                aweme.getStatistics().setDiggCount(this.f115872d);
            }
            AbstractC81915c.m141874a(new C49672ag(13, 0));
        } else if (i == 0) {
            C48317al.m91755a(Math.max(C48317al.m91756b() - 1, 0));
            m94194d(aweme);
            if (!(aweme == null || aweme.getStatistics() == null)) {
                aweme.setUserDigg(0);
                aweme.getStatistics().setDiggCount(this.f115872d);
            }
            AbstractC81915c.m141874a(new C49672ag(13, 1));
        }
    }
}
