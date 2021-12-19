package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.C48314ai;
import com.p2082ss.android.ugc.aweme.feed.assem.share.C49021g;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49559p;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.RunnableC49561r;
import com.p2082ss.android.ugc.aweme.feed.guide.C49592h;
import com.p2082ss.android.ugc.aweme.feed.helper.C49645l;
import com.p2082ss.android.ugc.aweme.feed.helper.C49658w;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49748e;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50559x;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.aweme.main.p3428b.C59043a;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59240f;
import com.p2082ss.android.ugc.aweme.p2307ai.View$OnTouchListenerC33468a;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33918a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2483co.C36153g;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import com.p2082ss.android.ugc.aweme.share.C68858ae;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.C69508y;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71904j;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
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

/* renamed from: com.ss.android.ugc.aweme.feed.ui.eg */
public class View$OnClickListenerC50266eg extends AbstractC49544a implements View.OnClickListener, AbstractC49691s<C49672ag>, AbstractC49748e, AbstractC90252i, AbstractC90253j {

    /* renamed from: i */
    private static SharedPreferences f116066i;

    /* renamed from: a */
    RemoteImageView f116067a;

    /* renamed from: b */
    TextView f116068b;

    /* renamed from: c */
    View f116069c;

    /* renamed from: d */
    boolean f116070d;

    /* renamed from: e */
    boolean f116071e;

    /* renamed from: f */
    private boolean f116072f;

    /* renamed from: g */
    private long f116073g;

    /* renamed from: h */
    private int f116074h;

    /* renamed from: j */
    private String f116075j;

    /* renamed from: k */
    private C36153g f116076k;

    static {
        Covode.recordClassIndex(59392);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo63634a(C49672ag agVar) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(6, new RunnableC90250g(View$OnClickListenerC50266eg.class, "onVideoPlayerEvent", C71904j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80928a() {
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: c */
    private C36153g m94332c() {
        if (this.f116076k == null) {
            this.f116076k = new C36153g();
        }
        return this.f116076k;
    }

    /* renamed from: t */
    private static int m94342t() {
        return C16048b.m29633a().mo25412a(true, "share_guide_daily_limit", 0);
    }

    /* renamed from: e */
    private void m94334e() {
        if (this.f113963V == null || !C49658w.m93104a((Activity) this.f113963V.getActivity())) {
            m94337o();
        } else {
            this.f116067a.setImageResource(2131231752);
        }
    }

    /* renamed from: s */
    private static SharedPreferences m94341s() {
        if (f116066i == null) {
            f116066i = C34822d.m71158a(C17867d.m33078a(), "sp_video_digg_record", 0);
        }
        return f116066i;
    }

    /* renamed from: o */
    private void m94337o() {
        this.f116069c.setAlpha(1.0f);
        this.f116067a.getLayoutParams().width = (int) C13628n.m24520b(this.f113959R, 40.0f);
        this.f116067a.getLayoutParams().height = -1;
        this.f116067a.setImageResource(C68858ae.m121526a());
    }

    /* renamed from: r */
    private boolean m94340r() {
        User author;
        if (this.f113953L == null || (author = this.f113953L.getAuthor()) == null) {
            return false;
        }
        return TextUtils.equals(author.getUid(), C31575b.m65865g().getCurUser().getUid());
    }

    /* renamed from: v */
    private void m94344v() {
        View view = this.f116069c;
        if (view != null && !this.f116071e) {
            this.f116071e = true;
            view.animate().scaleX(1.05f).scaleY(1.05f).setDuration(150).withEndAction(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50266eg.RunnableC502777 */

                static {
                    Covode.recordClassIndex(59403);
                }

                public final void run() {
                    View$OnClickListenerC50266eg.this.f116069c.animate().scaleX(0.9f).scaleY(0.9f).setDuration(150).withEndAction(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50266eg.RunnableC502777.RunnableC502781 */

                        static {
                            Covode.recordClassIndex(59404);
                        }

                        public final void run() {
                            ScaleAnimation scaleAnimation = new ScaleAnimation(0.9f, 1.05f, 0.9f, 1.05f, 1, 0.5f, 1, 0.5f);
                            scaleAnimation.setDuration(600);
                            scaleAnimation.setRepeatMode(2);
                            scaleAnimation.setRepeatCount(-1);
                            View$OnClickListenerC50266eg.this.f116069c.startAnimation(scaleAnimation);
                        }
                    }).start();
                }
            }).start();
        }
    }

    /* renamed from: u */
    private void m94343u() {
        if (!this.f116071e && C16048b.m29633a().mo25412a(true, "interction_share_button_style", 0) == 0 && m94342t() == 0 && !this.f116072f && !C80636z.m139819d(this.f113953L) && !C80636z.m139818c(this.f113953L) && !C49658w.m93105a(this.f113959R)) {
            C49592h.C49593a.f114095a.mo81383b(C59208ac.m108771e(this.f113953L));
            C48314ai.m91748b();
            this.f116070d = true;
            final Aweme aweme = this.f113953L;
            final String str = this.f113954M;
            C49559p.f113984a.mo81305a(new RunnableC49561r(false, new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50266eg.RunnableC502704 */

                static {
                    Covode.recordClassIndex(59396);
                }

                public final void run() {
                    View$OnClickListenerC50266eg.this.f116069c.animate().scaleX(0.0f).scaleY(0.0f).setDuration(300).withEndAction(new RunnableC50289er(this, str, aweme)).start();
                }
            }));
        }
    }

    /* renamed from: b */
    public final void mo85433b() {
        int t;
        this.f116074h++;
        if (!m94339q() && !m94338p() && (t = m94342t()) != 0 && t != -2) {
            try {
                if (C17873f.m33102j() == this.f113963V.getActivity()) {
                    TextUtils.equals(AwemeChangeCallBack.m108593a((ActivityC0945e) C17873f.m33102j()).getAid(), this.f113953L.getAid());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    private void m94333d() {
        this.f116075j = C68863ah.f154028b.mo109368d();
        boolean b = C49658w.m93109b(this.f113959R);
        if (this.f116075j != null || !b) {
            int a = C16048b.m29633a().mo25412a(true, "interction_share_button_style", 0);
            if (this.f116075j == null || a == 1) {
                m94337o();
                return;
            }
            Drawable a2 = C68863ah.f154028b.mo109354a((Activity) this.f113963V.getActivity(), this.f116075j);
            if (a2 != null) {
                this.f116067a.getLayoutParams().width = (int) C13628n.m24520b(this.f113959R, 36.0f);
                this.f116067a.getLayoutParams().height = (int) C13628n.m24520b(this.f113959R, 36.0f);
                this.f116067a.setImageDrawable(a2);
                return;
            }
            return;
        }
        this.f116067a.getLayoutParams().width = (int) C13628n.m24520b(this.f113959R, 36.0f);
        this.f116067a.getLayoutParams().height = (int) C13628n.m24520b(this.f113959R, 36.0f);
        this.f116067a.setImageResource(2131231752);
    }

    /* renamed from: p */
    private boolean m94338p() {
        Drawable drawable;
        if (this.f116074h != 2) {
            return false;
        }
        try {
            if (C17873f.m33102j() != this.f113963V.getActivity() || !TextUtils.equals(AwemeChangeCallBack.m108593a((ActivityC0945e) C17873f.m33102j()).getAid(), this.f113953L.getAid())) {
                return false;
            }
            boolean b = C49658w.m93109b(this.f113959R);
            int a = C16048b.m29633a().mo25412a(true, "interction_share_button_style", 0);
            if (a != 0 && (this.f116075j != null || b)) {
                if (C49592h.C49593a.f114095a.mo81382a(this.f113953L.getAid()) || C69508y.f155284b) {
                    return true;
                }
                C49592h.C49593a.f114095a.mo81383b(this.f113953L.getAid());
                this.f116067a.getLayoutParams().width = (int) C13628n.m24520b(this.f113959R, 36.0f);
                this.f116067a.getLayoutParams().height = (int) C13628n.m24520b(this.f113959R, 36.0f);
                if (TextUtils.isEmpty(this.f116075j) || this.f113963V == null || this.f113963V.getActivity() == null) {
                    drawable = this.f113959R.getResources().getDrawable(2131231752);
                } else {
                    drawable = C68863ah.f154028b.mo109354a((Activity) this.f113963V.getActivity(), this.f116075j);
                }
                this.f116067a.setImageDrawable(drawable);
                if (a != 1 ? a == 2 : this.f116075j == null) {
                    m94344v();
                    return true;
                } else if (a == 3) {
                    m94330a(1.05f, 0.9f);
                    return true;
                } else if (!(a != 1 || this.f116075j == null || this.f113963V == null || this.f113963V.getActivity() == null)) {
                    m94330a(1.05f, 0.9f);
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: q */
    private boolean m94339q() {
        try {
            if (C17873f.m33102j() != this.f113963V.getActivity() || !TextUtils.equals(AwemeChangeCallBack.m108593a((ActivityC0945e) C17873f.m33102j()).getAid(), this.f113953L.getAid()) || !C49658w.m93105a(this.f113959R) || !C49658w.m93106a(this.f113953L) || C49592h.C49593a.f114095a.mo81382a(this.f113953L.getAid())) {
                return false;
            }
            C49592h.C49593a.f114095a.mo81383b(this.f113953L.getAid());
            int a = C16048b.m29633a().mo25412a(true, "interction_share_button_whatsapp_style", 0);
            if (!C49658w.m93104a((Activity) this.f113963V.getActivity())) {
                this.f116067a.setImageResource(2131231752);
                if (a == 1) {
                    m94330a(1.02f, 0.95f);
                } else if (a == 2) {
                    m94330a(1.05f, 0.9f);
                }
            } else if (a == 1) {
                m94330a(1.02f, 0.95f);
            } else if (a == 2) {
                m94344v();
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public View$OnClickListenerC50266eg(View view) {
        super(view);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo81273a(VideoItemParams videoItemParams) {
        super.mo81273a(videoItemParams);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49748e
    /* renamed from: g */
    public final String mo84304g(boolean z) {
        return this.f113954M;
    }

    /* renamed from: a */
    private static Context m94328a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    private void m94331a(Aweme aweme) {
        TextView textView;
        if (C58956a.m108315a(aweme) && (textView = this.f116068b) != null) {
            textView.setText("0");
        }
    }

    /* renamed from: a */
    private CharSequence m94329a(AwemeStatistics awemeStatistics) {
        String a = C53437b.m98615a(awemeStatistics.getShareCount());
        if (!TextUtils.equals("0", a) || this.f113959R == null) {
            return a;
        }
        return this.f113959R.getResources().getText(R.string.h84);
    }

    @AbstractC90264r
    public void onVideoPlayerEvent(final C71904j jVar) {
        if (jVar.f161106c == 7 && TextUtils.equals(jVar.f161109f, this.f113953L.getAid())) {
            C49559p.f113984a.mo81305a(new RunnableC49561r(false, new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50266eg.RunnableC502682 */

                static {
                    Covode.recordClassIndex(59394);
                }

                public final void run() {
                    MethodCollector.m26663i(3943);
                    synchronized (View$OnClickListenerC50266eg.this) {
                        try {
                            View$OnClickListenerC50266eg.this.mo85433b();
                        } finally {
                            MethodCollector.m26664o(3943);
                        }
                    }
                }
            }));
        }
    }

    /* renamed from: h */
    private void m94335h(Map<String, Object> map) {
        Aweme aweme;
        if (map != null) {
            aweme = (Aweme) map.get("aweme_state");
        } else {
            aweme = this.f113953L;
        }
        if (aweme != null && aweme.getAuthor() != null && !C56216k.m102133c() && C31575b.m65865g().isMe(aweme.getAuthor().getUid())) {
            this.f116067a.setImageResource(2131233178);
        } else if (C49658w.m93105a(this.f113959R)) {
            m94334e();
        } else if (C16048b.m29633a().mo25412a(true, "interction_share_button_style", 0) != 0) {
            m94333d();
        } else {
            try {
                m94337o();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public final void mo85281c(Map<String, Object> map) {
        if (this.f116071e) {
            this.f116071e = false;
            C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50280ei(this, map)));
        }
        if (this.f116070d) {
            this.f116070d = false;
            C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50285en(this, map)));
        }
        if (this.f116072f) {
            this.f116072f = false;
            C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50286eo(this, map)));
        }
    }

    /* renamed from: d */
    public final void mo85437g(Map<String, Object> map) {
        Animation animation = this.f116069c.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        this.f116069c.clearAnimation();
        if (C33918a.m69450a()) {
            mo81274a(map);
        } else if (C49658w.m93105a(this.f113959R)) {
            m94334e();
        } else if (C16048b.m29633a().mo25412a(true, "interction_share_button_style", 0) != 0) {
            m94333d();
        } else {
            m94337o();
        }
        this.f116069c.setScaleX(1.0f);
        this.f116069c.setScaleY(1.0f);
        m94336i(map);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: e */
    public final C33942b mo81280e(C33942b bVar) {
        boolean z;
        C33942b bVar2 = null;
        if (bVar == null) {
            return null;
        }
        super.mo81280e(bVar);
        if (bVar.f80277a.equals("video_params")) {
            if (this.f113953L == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            bVar2 = new C33942b("ui_state", hashMap);
            hashMap.put("aweme_state", this.f113953L);
            hashMap.put("isInActivityState", Boolean.valueOf(C33918a.m69450a()));
            hashMap.put("isSelfAweme", Boolean.valueOf(m94340r()));
            if (m94340r() || ((!C80636z.m139819d(this.f113953L) && !C80636z.m139818c(this.f113953L)) || C50559x.m94790a(this.f113953L, this.f113957P))) {
                z = false;
            } else {
                z = true;
            }
            hashMap.put("share_enable_state", Boolean.valueOf(z));
        }
        return bVar2;
    }

    /* renamed from: i */
    private void m94336i(Map<String, Object> map) {
        Aweme aweme = (Aweme) map.get("aweme_state");
        if (aweme != null) {
            User author = aweme.getAuthor();
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics == null || author == null) {
                this.f116068b.setVisibility(8);
            } else if (TextUtils.equals(C31575b.m65865g().getCurUserId(), author.getUid())) {
                this.f116068b.setVisibility(8);
            } else if (C16048b.m29633a().mo25412a(true, "share_button_style", 2) == 2) {
                this.f116068b.setVisibility(0);
                this.f116068b.setTextSize(1, 10.0f);
                this.f116068b.setText(R.string.h84);
            } else if (C16048b.m29633a().mo25412a(true, "share_button_style", 2) == 3) {
                this.f116068b.setVisibility(0);
                this.f116068b.setTextSize(1, 12.0f);
                this.f116068b.setText(m94329a(statistics));
                m94332c();
                C36153g.m73653a(this.f116068b);
            } else {
                this.f116068b.setVisibility(8);
            }
            m94331a(aweme);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80929a(View view) {
        View a = C1870c.m6045a((Activity) this.f113959R, (int) R.layout.t5);
        this.f113961T = a;
        this.f116067a = (RemoteImageView) this.f113961T.findViewById(R.id.dxv);
        this.f116068b = (TextView) this.f113961T.findViewById(R.id.dxq);
        this.f116069c = this.f113961T.findViewById(R.id.dxn);
        this.f116067a.setOnClickListener(this);
        this.f116067a.setOnTouchListener(new View$OnTouchListenerC33468a(0.6f));
        this.f116068b.setOnClickListener(this);
        this.f116069c.setOnClickListener(this);
        EventBus.m156966a(EventBus.m156962a(), this);
        C36153g c = m94332c();
        c.f85409a = this.f113960S;
        c.f85410b = a;
        c.f85411c = this.f116069c;
        c.f85412d = this.f116067a;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    public final void mo80935b(C33942b bVar) {
        MethodCollector.m26663i(4434);
        if (!this.f113952K) {
            this.f113952K = true;
            if (this.f113960S instanceof FrameLayout) {
                ((FrameLayout) this.f113960S).addView(this.f113961T);
            }
        }
        if (bVar == null) {
            MethodCollector.m26664o(4434);
            return;
        }
        HashMap hashMap = (HashMap) bVar.mo60212a();
        if (hashMap.get("aweme_state") != null) {
            this.f116069c.setVisibility(0);
            this.f116068b.setVisibility(0);
            mo81274a((Map<String, Object>) hashMap);
            if (C50559x.m94790a(this.f113953L, this.f113957P) || !C80636z.m139819d(this.f113953L) || m94340r()) {
                this.f116069c.setAlpha(1.0f);
                this.f116069c.setEnabled(true);
            } else {
                this.f116069c.setAlpha(0.5f);
                this.f116069c.setEnabled(false);
            }
            m94336i(hashMap);
            this.f116074h = 0;
        }
        m94332c().mo63274b();
        MethodCollector.m26664o(4434);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80931a(DataCenter dataCenter) {
        dataCenter.mo60189a("video_show_share_guide_animation", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("video_show_share_stay_home_animation", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("video_hide_share_stay_home_animation", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("update_diig_view", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("video_on_pause", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("pause_share_guide_animation", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("recover_share_guide_animation", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("on_page_unselected", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("on_page_selected", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("video_digg", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("video_share_click", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("show_festival_activity_icon", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("awesome_update_backup_data", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("video_show_flip_share_drawable", (AbstractC1214u<C33942b>) this.f113951J);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: c */
    public final void mo80938c(C33942b bVar) {
        char c;
        User author;
        boolean a;
        if (bVar != null) {
            String str = bVar.f80277a;
            str.hashCode();
            int i = 3;
            switch (str.hashCode()) {
                case -1618328215:
                    if (str.equals("video_digg")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1157435412:
                    if (str.equals("video_show_share_stay_home_animation")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 245017106:
                    if (str.equals("video_show_flip_share_drawable")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 249129690:
                    if (str.equals("video_on_pause")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 281945252:
                    if (str.equals("show_festival_activity_icon")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 350216171:
                    if (str.equals("on_page_selected")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 651229933:
                    if (str.equals("awesome_update_backup_data")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 920041496:
                    if (str.equals("pause_share_guide_animation")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1346787590:
                    if (str.equals("recover_share_guide_animation")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1628582276:
                    if (str.equals("on_page_unselected")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1863388195:
                    if (str.equals("video_show_share_guide_animation")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 2084107761:
                    if (str.equals("video_hide_share_stay_home_animation")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    if (((Integer) bVar.mo60212a()).intValue() == 5 && m94342t() != 0 && m94342t() != -2 && m94342t() != -1) {
                        String curUserId = C31575b.m65865g().getCurUserId();
                        int t = m94342t();
                        int i2 = m94341s().getInt("video_digg_".concat(String.valueOf(curUserId)), 0);
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!DateUtils.isToday(m94341s().getLong("video_digg_time_".concat(String.valueOf(curUserId)), 0))) {
                            SharedPreferences.Editor edit = m94341s().edit();
                            edit.putLong("video_digg_time_".concat(String.valueOf(curUserId)), currentTimeMillis);
                            edit.putInt("video_digg_".concat(String.valueOf(curUserId)), 1);
                            edit.apply();
                            return;
                        }
                        if (t > 3) {
                            i = t;
                        }
                        if (i2 <= i) {
                            SharedPreferences.Editor edit2 = m94341s().edit();
                            edit2.putInt("video_digg_".concat(String.valueOf(curUserId)), i2 + 1);
                            edit2.apply();
                            return;
                        }
                        return;
                    }
                    return;
                case 1:
                    C49559p.f113984a.mo81305a(new RunnableC49561r(false, new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50266eg.RunnableC502755 */

                        static {
                            Covode.recordClassIndex(59401);
                        }

                        public final void run() {
                            if (View$OnClickListenerC50266eg.this.f116069c != null && View$OnClickListenerC50266eg.this.f116067a != null) {
                                View$OnClickListenerC50266eg.this.f116069c.animate().scaleX(0.0f).scaleY(0.0f).setDuration(300).withEndAction(new RunnableC50290es(this)).start();
                            }
                        }
                    }));
                    return;
                case 2:
                    Aweme aweme = this.f113953L;
                    if (aweme != null && C33918a.m69454b(aweme) && (author = aweme.getAuthor()) != null && !C80636z.m139818c(aweme) && !C80636z.m139819d(aweme)) {
                        if (C31575b.m65865g().isMe(author.getUid())) {
                            a = C33918a.m69452a(aweme);
                        } else if (!author.isSecret()) {
                            a = C33918a.m69451a(SharePrefCache.inst().getFestivalShareDonationTime().mo59941c().longValue(), System.currentTimeMillis());
                        } else {
                            return;
                        }
                        if (a && this.f113953L.getAuthor() != null && !this.f116072f) {
                            C31575b.m65865g().isMe(this.f113953L.getAuthor().getUid());
                            return;
                        }
                        return;
                    }
                    return;
                case 3:
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    final HashMap hashMap = new HashMap();
                    hashMap.put("isInActivityState", Boolean.valueOf(C33918a.m69450a()));
                    hashMap.put("isSelfAweme", Boolean.valueOf(m94340r()));
                    hashMap.put("aweme_state", this.f113953L);
                    C49559p.f113984a.mo81305a(new RunnableC49561r(false, new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50266eg.RunnableC502671 */

                        static {
                            Covode.recordClassIndex(59393);
                        }

                        public final void run() {
                            View$OnClickListenerC50266eg.this.mo85281c(hashMap);
                        }
                    }));
                    return;
                case 4:
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("isInActivityState", Boolean.valueOf(C33918a.m69450a()));
                    hashMap2.put("isSelfAweme", Boolean.valueOf(m94340r()));
                    C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50279eh(this, hashMap2)));
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    if (this.f116069c != null) {
                        C49559p.f113984a.mo81305a(new RunnableC49561r(false, new Runnable() {
                            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50266eg.RunnableC502766 */

                            static {
                                Covode.recordClassIndex(59402);
                            }

                            public final void run() {
                                View$OnClickListenerC50266eg.this.f116069c.setScaleX(1.0f);
                                View$OnClickListenerC50266eg.this.f116069c.setScaleY(1.0f);
                            }
                        }));
                        return;
                    }
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    if (bVar.mo60212a() != null) {
                        onChanged(new C33942b("video_params", bVar.mo60212a()));
                        return;
                    }
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    final HashMap hashMap3 = new HashMap();
                    hashMap3.put("isInActivityState", Boolean.valueOf(C33918a.m69450a()));
                    hashMap3.put("isSelfAweme", Boolean.valueOf(m94340r()));
                    if (this.f116070d) {
                        C49559p.f113984a.mo81305a(new RunnableC49561r(false, new Runnable() {
                            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50266eg.RunnableC502693 */

                            static {
                                Covode.recordClassIndex(59395);
                            }

                            public final void run() {
                                View$OnClickListenerC50266eg.this.mo85437g(hashMap3);
                            }
                        }));
                        return;
                    }
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    if (this.f116070d) {
                        m94343u();
                        return;
                    }
                    return;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    m94343u();
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50287ep(this)));
                    return;
                default:
                    return;
            }
        }
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        this.f113958Q.mo60191a("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR", this.f113953L.getAid());
        if (!C58001a.m104815a(view, 1200)) {
            C49021g.m92187a();
            C39162r.m79460a("verify_precise_exp", new C33744d().mo59983a("scene", "enter_share").f79943a);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f116073g < 800) {
                this.f116073g = 0;
                return;
            }
            this.f116073g = currentTimeMillis;
            if (this.f113953L != null) {
                if (C37699a.m76252aX(this.f113953L)) {
                    new C23144b(view).mo37640e(R.string.o2).mo37637b();
                } else if (((this.f113953L.isCanPlay() && !this.f113953L.isDelete()) || C50559x.m94790a(this.f113953L, this.f113957P) || C58956a.m108316b(this.f113953L)) && (this.f113957P == 1000 || C50559x.m94790a(this.f113953L, this.f113957P) || !C58956a.m108315a(this.f113953L))) {
                    if (C69508y.f155284b && !C56216k.m102133c()) {
                        C69508y.m122723c(this.f113953L);
                    }
                    this.f113958Q.mo60191a("video_share_click", (Object) null);
                    if (this.f116070d) {
                        C39162r.m79460a("share_highlight_click", new C33744d().mo59983a("group_id", C59208ac.m108771e(this.f113953L)).mo59983a("author_id", C59208ac.m108758a(this.f113953L)).mo59983a("show_content", C68863ah.f154028b.mo109365b((Activity) this.f113959R)).mo59980a("is_pop_up", 0).f79943a);
                    } else {
                        C49645l.m93085a();
                        C49645l.m93088a(this.f116067a, this.f113954M, C59208ac.m108771e(this.f113953L), C59208ac.m108758a(this.f113953L));
                    }
                    SecApiImpl.m119993a().reportData("share");
                    Map<String, Object> hashMap = new HashMap<>();
                    hashMap.put("isInActivityState", Boolean.valueOf(C33918a.m69450a()));
                    hashMap.put("isSelfAweme", Boolean.valueOf(m94340r()));
                    Aweme aweme = this.f113953L;
                    hashMap.put("aweme_state", aweme);
                    mo85281c(hashMap);
                    String str = "";
                    if (this.f113954M == null) {
                        this.f113954M = str;
                    }
                    boolean c = C56216k.m102133c();
                    String str2 = this.f113954M;
                    str2.hashCode();
                    if (str2.equals("homepage_follow")) {
                        m94328a(this.f113959R);
                        C39162r.m79455a("click_share_button", "homepage_follow", this.f113953L.getAid(), 0);
                        C59240f f = new C59240f(c).mo96797a("homepage_follow").mo96749g(this.f113953L);
                        f.f135194p = (String) this.f113958Q.mo60195b("playlist_id", str);
                        f.f135193e = (String) this.f113958Q.mo60195b("playlist_id_key", str);
                        f.f135192d = (String) this.f113958Q.mo60195b("playlist_type", str);
                        C59240f fVar = (C59240f) f.mo96801c((String) this.f113958Q.mo60195b("tab_name", str)).mo96802d(C59208ac.m108764b(this.f113953L, this.f113957P));
                        if (this.f113953L.getAuthor() != null) {
                            str = this.f113953L.getAuthor().getUid();
                        }
                        fVar.f135190b = str;
                        fVar.f135191c = this.f113957P;
                        fVar.mo96792f();
                    } else if (str2.equals("homepage_hot")) {
                        m94328a(this.f113959R);
                        C39162r.m79455a("click_share_button", "homepage_hot", this.f113953L.getAid(), 0);
                        C59240f f2 = new C59240f(c).mo96797a("homepage_hot").mo96749g(this.f113953L);
                        f2.f135194p = (String) this.f113958Q.mo60195b("playlist_id", str);
                        f2.f135193e = (String) this.f113958Q.mo60195b("playlist_id_key", str);
                        f2.f135192d = (String) this.f113958Q.mo60195b("playlist_type", str);
                        C59240f fVar2 = (C59240f) f2.mo96801c((String) this.f113958Q.mo60195b("tab_name", str)).mo96802d(C59208ac.m108764b(this.f113953L, this.f113957P));
                        if (this.f113953L.getAuthor() != null) {
                            str = this.f113953L.getAuthor().getUid();
                        }
                        fVar2.f135190b = str;
                        fVar2.f135200v = C76706a.m134276b(this.f113953L);
                        fVar2.f135222V = C76598h.m134176a(this.f113953L.getAuthor());
                        fVar2.f135199u = Boolean.valueOf(C76706a.m134281g(this.f113953L));
                        fVar2.f135191c = this.f113957P;
                        C79900c.m138667a(fVar2, this.f113953L, "homepage_hot");
                        fVar2.mo96792f();
                        if (C37699a.m76314s(this.f113953L)) {
                            C38000g.m77050a().mo65909u(this.f113959R, this.f113953L);
                        }
                    } else if (this.f113964W == 2) {
                        m94328a(this.f113959R);
                        C39162r.m79455a("click_share_button", this.f113954M, this.f113953L.getAid(), 0);
                        String searchResultId = FeedParamProvider.m93269a(this.f113959R).getSearchResultId();
                        if (TextUtils.isEmpty(searchResultId)) {
                            searchResultId = C59208ac.m108771e(this.f113953L);
                        }
                        C59240f f3 = new C59240f(c).mo96797a(this.f113954M).mo96749g(this.f113953L);
                        f3.f135194p = (String) this.f113958Q.mo60195b("playlist_id", str);
                        f3.f135193e = (String) this.f113958Q.mo60195b("playlist_id_key", str);
                        f3.f135192d = (String) this.f113958Q.mo60195b("playlist_type", str);
                        C59240f fVar3 = (C59240f) f3.mo96801c((String) this.f113958Q.mo60195b("tab_name", str)).mo96802d(C59208ac.m108764b(this.f113953L, this.f113957P));
                        if (this.f113953L.getAuthor() != null) {
                            str = this.f113953L.getAuthor().getUid();
                        }
                        fVar3.f135190b = str;
                        C59240f fVar4 = (C59240f) fVar3.mo96810l(FeedParamProvider.m93269a(this.f113959R).getSearchId()).mo96804f(searchResultId);
                        fVar4.f135191c = this.f113957P;
                        AbstractC59233c a = fVar4.mo96788a(C80632w.m139800a(aweme, "click_more_button", this.f113954M));
                        C79900c.m138667a(a, this.f113953L, this.f113954M);
                        a.mo96792f();
                    }
                    AbstractC81915c.m141874a(new C59043a());
                } else if (this.f113953L.isImage()) {
                    new C79459a(this.f113959R).mo123050a(R.string.civ).mo123053a();
                } else {
                    new C79459a(this.f113959R).mo123052a(C58956a.m108314a(this.f113953L, R.string.h8k)).mo123053a();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo81274a(Map<String, Object> map) {
        if (map == null ? !(!C33918a.m69450a() || m94340r()) : !(!((Boolean) map.get("isInActivityState")).booleanValue() || ((Boolean) map.get("isSelfAweme")).booleanValue())) {
            if (!C49658w.m93105a(this.f113959R)) {
                m94335h(map);
                return;
            }
        }
        m94335h(map);
    }

    /* renamed from: a */
    private void m94330a(float f, float f2) {
        View view = this.f116069c;
        if (view != null && !this.f116071e) {
            this.f116071e = true;
            view.animate().scaleX(0.001f).scaleY(0.001f).setDuration(300).withEndAction(new RunnableC50288eq(this, f2, f)).start();
        }
    }
}
