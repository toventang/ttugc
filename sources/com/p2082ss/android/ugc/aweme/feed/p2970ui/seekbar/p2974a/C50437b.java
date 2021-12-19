package com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17238d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.AbstractC41361am;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49673ah;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50434a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50453c;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50457d;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50458e;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50459f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50462h;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.VideoSeekBar;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.main.AbstractC59102i;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.p2399bo.C34894a;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.a.b */
public class C50437b implements VideoSeekBar.AbstractC50430b, VideoSeekBar.AbstractC50431c, AbstractC50448h, AbstractC90252i, AbstractC90253j {

    /* renamed from: w */
    public static String f116483w = "CommonControl";

    /* renamed from: x */
    public static final C50438a f116484x = new C50438a((byte) 0);

    /* renamed from: A */
    private final Runnable f116485A;

    /* renamed from: a */
    public Aweme f116486a;

    /* renamed from: b */
    public Aweme f116487b;

    /* renamed from: c */
    public int f116488c;

    /* renamed from: d */
    public boolean f116489d;

    /* renamed from: e */
    public boolean f116490e;

    /* renamed from: f */
    public boolean f116491f;

    /* renamed from: g */
    public int f116492g;

    /* renamed from: h */
    public long f116493h;

    /* renamed from: i */
    public AbstractC49849am f116494i;

    /* renamed from: j */
    public String f116495j = "";

    /* renamed from: k */
    public int f116496k = -1;

    /* renamed from: l */
    public int f116497l;

    /* renamed from: m */
    public boolean f116498m;

    /* renamed from: n */
    public boolean f116499n = true;

    /* renamed from: o */
    public boolean f116500o = true;

    /* renamed from: p */
    public Float f116501p;

    /* renamed from: q */
    public int f116502q;

    /* renamed from: r */
    public final VideoSeekBar f116503r;

    /* renamed from: s */
    public final ViewGroup f116504s;

    /* renamed from: t */
    public final TextView f116505t;

    /* renamed from: u */
    public final TextView f116506u;

    /* renamed from: v */
    public final ScrollSwitchStateManager f116507v;

    /* renamed from: y */
    private final Handler f116508y = new Handler(Looper.getMainLooper());

    /* renamed from: z */
    private final AbstractC89244h f116509z = C89250i.m154773a((AbstractC89171a) new C50441d(this));

    /* renamed from: a */
    public boolean mo85688a(Object obj) {
        C89219l.m154721d(obj, "");
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.AbstractC50448h
    /* renamed from: b */
    public void mo85690b(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.AbstractC50448h
    /* renamed from: c */
    public void mo85691c() {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(279, new RunnableC90250g(C50437b.class, "onVideoMaskEvent", C49673ah.class, ThreadMode.POSTING, 0, false));
        hashMap.put(280, new RunnableC90250g(C50437b.class, "onFullFeedVideoChangeEvent", C50434a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(281, new RunnableC90250g(C50437b.class, "onPlayerControllerVideoPlayProgressChange", C50458e.class, ThreadMode.POSTING, 0, false));
        hashMap.put(282, new RunnableC90250g(C50437b.class, "onPlayerControllerVideoStatusEvent", C50459f.class, ThreadMode.POSTING, 0, false));
        hashMap.put(283, new RunnableC90250g(C50437b.class, "onRenderFirstFrame", C50457d.class, ThreadMode.POSTING, 0, false));
        hashMap.put(284, new RunnableC90250g(C50437b.class, "onFullFeedFragmentPageStateChangeEvent", C50453c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(285, new RunnableC90250g(C50437b.class, "onVideoProgressVolumeKeyEvent", C50462h.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.a.b$a */
    public static final class C50438a {
        static {
            Covode.recordClassIndex(59574);
        }

        private C50438a() {
        }

        public /* synthetic */ C50438a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.a.b$e */
    static final class RunnableC50442e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50437b f116513a;

        static {
            Covode.recordClassIndex(59578);
        }

        RunnableC50442e(C50437b bVar) {
            this.f116513a = bVar;
        }

        public final void run() {
            this.f116513a.f116503r.setSeekBarShowType(0);
        }
    }

    static {
        Covode.recordClassIndex(59573);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.a.b$d */
    static final class C50441d extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C50437b f116512a;

        static {
            Covode.recordClassIndex(59577);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50441d(C50437b bVar) {
            super(0);
            this.f116512a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(C13628n.m24520b(this.f116512a.f116503r.getContext(), 12.0f) / ((float) C13628n.m24504a(this.f116512a.f116503r.getContext())));
        }
    }

    /* renamed from: d */
    private final void m94593d() {
        if (!this.f116498m) {
            Context context = this.f116503r.getContext();
            if (!(context instanceof ActivityC0945e)) {
                context = null;
            }
            ActivityC0945e eVar = (ActivityC0945e) context;
            if (eVar != null) {
                this.f116498m = true;
                ScrollSwitchStateManager scrollSwitchStateManager = this.f116507v;
                if (scrollSwitchStateManager != null) {
                    scrollSwitchStateManager.mo89353c(eVar, new C50439b(this));
                }
                ScrollSwitchStateManager scrollSwitchStateManager2 = this.f116507v;
                if (scrollSwitchStateManager2 != null) {
                    scrollSwitchStateManager2.mo89359f(eVar, new C50440c(this));
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.AbstractC50448h
    /* renamed from: b */
    public final void mo85689b() {
        EventBus.m156962a().mo145395b(this);
        this.f116494i = null;
        this.f116508y.removeCallbacks(this.f116485A);
    }

    /* renamed from: a */
    public final void mo85685a() {
        int i;
        Video video;
        m94593d();
        this.f116503r.setProgress(0.0f);
        if (!m94590a(this.f116486a)) {
            this.f116503r.setVisibility(8);
            this.f116504s.setVisibility(8);
            C51423a.m95784a(2, f116483w, "do not show progressbar");
            return;
        }
        this.f116503r.setAlpha(1.0f);
        this.f116503r.setVisibility(0);
        C51423a.m95784a(2, f116483w, "progressbar can drag");
        this.f116504s.setVisibility(8);
        Aweme aweme = this.f116486a;
        if (aweme == null || (video = aweme.getVideo()) == null) {
            i = 0;
        } else {
            i = video.getDuration();
        }
        this.f116488c = C34894a.m71272a(i);
        this.f116503r.mo85636a(0.0f);
        this.f116506u.setText(C34894a.f82342a.mo61798a(this.f116488c, false));
        this.f116505t.setText(C34894a.f82342a.mo61798a(0, false));
        this.f116503r.setSeekBarShowType(0);
    }

    /* renamed from: a */
    private final boolean m94590a(Aweme aweme) {
        if (!C50443c.m94610b(aweme) || !m94591b(aweme) || !C50443c.m94608a(aweme) || C76706a.m134281g(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final boolean m94591b(Aweme aweme) {
        String str;
        Aweme aweme2 = this.f116487b;
        String str2 = null;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        if (aweme != null) {
            str2 = aweme.getAid();
        }
        return C13627m.m24499a(str, str2);
    }

    /* renamed from: c */
    private final void m94592c(boolean z) {
        AbstractC49849am amVar;
        VerticalViewPager aR;
        if (this.f116507v != null && (amVar = this.f116494i) != null && (aR = amVar.mo84710aR()) != null) {
            aR.setCanTouch(z);
        }
    }

    @AbstractC90264r
    public final void onFullFeedFragmentPageStateChangeEvent(C50453c cVar) {
        C89219l.m154721d(cVar, "");
        if (mo85688a(cVar) && m94590a(cVar.f116524a)) {
            mo85686a(cVar.f116524a, cVar.f116525b, true);
        }
    }

    @AbstractC90264r
    public final void onRenderFirstFrame(C50457d dVar) {
        C89219l.m154721d(dVar, "");
        if (mo85688a(dVar)) {
            this.f116487b = dVar.f116534a;
            mo85685a();
        }
    }

    @AbstractC90264r
    public final void onVideoMaskEvent(C49673ah ahVar) {
        String str;
        C89219l.m154721d(ahVar, "");
        String str2 = ahVar.f114330b;
        Aweme aweme = this.f116486a;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (C89219l.m154714a((Object) str2, (Object) str)) {
            mo85687a(ahVar.f114329a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.VideoSeekBar.AbstractC50431c
    /* renamed from: a */
    public final void mo85657a(int i) {
        this.f116505t.setText(C34894a.f82342a.mo61797a(((float) i) / 100.0f, this.f116488c));
    }

    @AbstractC90264r
    public final void onFullFeedVideoChangeEvent(C50434a aVar) {
        String str = "";
        C89219l.m154721d(aVar, str);
        if (mo85688a(aVar)) {
            this.f116486a = aVar.f116475a;
            String str2 = aVar.f116476b;
            if (str2 != null) {
                str = str2;
            }
            this.f116495j = str;
            this.f116496k = aVar.f116477c;
            this.f116494i = aVar.f116478d;
            this.f116492g = 0;
            if (!this.f116499n) {
                this.f116500o = false;
            }
            mo85685a();
        }
    }

    @AbstractC90264r
    public final void onPlayerControllerVideoStatusEvent(C50459f fVar) {
        C89219l.m154721d(fVar, "");
        if (mo85688a(fVar) && m94590a(fVar.f116545a)) {
            int i = fVar.f116548d;
            if (i == 1) {
                this.f116492g = 1;
                this.f116502q = 0;
                this.f116503r.setPauseStatus(true);
                this.f116503r.setSeekBarShowType(1);
            } else if (i == 2) {
                this.f116492g = 2;
                this.f116503r.setPauseStatus(false);
                if (this.f116499n) {
                    this.f116503r.setSeekBarShowType(0);
                }
            }
        }
    }

    @AbstractC90264r
    public final void onVideoProgressVolumeKeyEvent(C50462h hVar) {
        C89219l.m154721d(hVar, "");
        if (mo85688a(hVar) && m94590a(hVar.f116554b) && this.f116499n) {
            if (hVar.f116553a) {
                this.f116503r.setVisibility(4);
            } else {
                this.f116503r.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.a.b$b */
    public static final class C50439b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C50437b f116510a;

        static {
            Covode.recordClassIndex(59575);
        }

        C50439b(C50437b bVar) {
            this.f116510a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C34685e b;
            VerticalViewPager aR;
            Integer num = (Integer) obj;
            ScrollSwitchStateManager scrollSwitchStateManager = this.f116510a.f116507v;
            if (!scrollSwitchStateManager.f121759a.f121780a) {
                b = null;
            } else {
                b = scrollSwitchStateManager.mo89348b(scrollSwitchStateManager.f121759a.getValue().intValue());
            }
            if (b instanceof AbstractC41361am) {
                C50437b bVar = this.f116510a;
                Aweme aweme = bVar.f116486a;
                C89219l.m154716b(num, "");
                bVar.mo85686a(aweme, num.intValue(), true);
            }
            AbstractC49849am amVar = this.f116510a.f116494i;
            if (amVar != null && (aR = amVar.mo84710aR()) != null) {
                aR.setCanTouch(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.a.b$c */
    public static final class C50440c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C50437b f116511a;

        static {
            Covode.recordClassIndex(59576);
        }

        C50440c(C50437b bVar) {
            this.f116511a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Fragment fragment;
            boolean z;
            AbstractC49849am amVar;
            VerticalViewPager aR;
            Integer num = (Integer) obj;
            WeakReference<Fragment> weakReference = this.f116511a.f116507v.f121769k;
            if (weakReference != null) {
                fragment = weakReference.get();
            } else {
                fragment = null;
            }
            if (fragment instanceof AbstractC59102i) {
                AbstractC59102i iVar = (AbstractC59102i) fragment;
                if (C89219l.m154714a((Object) "FeedFollowFragment", (Object) iVar.mo85175u()) || C89219l.m154714a((Object) "FeedRecommendFragment", (Object) iVar.mo85175u()) || C89219l.m154714a((Object) "FeedLearnFragment", (Object) iVar.mo85175u())) {
                    z = true;
                    C50437b bVar = this.f116511a;
                    Aweme aweme = bVar.f116486a;
                    C89219l.m154716b(num, "");
                    bVar.mo85686a(aweme, num.intValue(), z);
                    amVar = this.f116511a.f116494i;
                    if (amVar != null && (aR = amVar.mo84710aR()) != null) {
                        aR.setCanTouch(true);
                        return;
                    }
                }
            }
            z = false;
            C50437b bVar2 = this.f116511a;
            Aweme aweme2 = bVar2.f116486a;
            C89219l.m154716b(num, "");
            bVar2.mo85686a(aweme2, num.intValue(), z);
            amVar = this.f116511a.f116494i;
            if (amVar != null) {
            }
        }
    }

    @AbstractC90264r
    public final void onPlayerControllerVideoPlayProgressChange(C50458e eVar) {
        C89219l.m154721d(eVar, "");
        if (mo85688a(eVar) && m94590a(eVar.f116539a) && !this.f116489d) {
            if (this.f116492g == 1) {
                int i = this.f116502q + 1;
                this.f116502q = i;
                if (i > 3) {
                    this.f116502q = 0;
                    this.f116503r.setSeekBarShowType(0);
                }
            }
            if (this.f116493h == 0 || SystemClock.elapsedRealtime() > this.f116493h + 600) {
                this.f116503r.mo85636a(eVar.f116542d);
                this.f116505t.setText(C34894a.f82342a.mo61797a(eVar.f116542d, this.f116488c));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.VideoSeekBar.AbstractC50430b
    /* renamed from: a */
    public void mo85656a(MotionEvent motionEvent) {
        Integer valueOf;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (valueOf.intValue() == 0) {
                this.f116490e = false;
                this.f116501p = Float.valueOf(motionEvent.getRawX());
            } else if (valueOf != null) {
                if (valueOf.intValue() == 2) {
                    Float f = this.f116501p;
                    if (f != null && Math.abs(f.floatValue() - motionEvent.getRawX()) > 10.0f) {
                        this.f116503r.setSeekBarShowType(1);
                        if (C50443c.m94610b(this.f116486a) && this.f116504s.getVisibility() != 0) {
                            this.f116504s.setVisibility(0);
                            this.f116504s.setAlpha(0.0f);
                            ViewPropertyAnimator animate = this.f116504s.animate();
                            if (!(animate == null || (alpha = animate.alpha(1.0f)) == null || (duration = alpha.setDuration(200)) == null)) {
                                duration.start();
                            }
                        }
                        this.f116499n = false;
                        m94592c(false);
                        this.f116490e = true;
                    }
                } else if (valueOf.intValue() == 1 || valueOf.intValue() == 3) {
                    this.f116499n = true;
                    m94592c(true);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.VideoSeekBar.AbstractC50431c
    /* renamed from: b */
    public void mo85659b(SeekBar seekBar) {
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        AbstractC49849am amVar;
        String str;
        this.f116493h = SystemClock.elapsedRealtime();
        int i = 0;
        this.f116489d = false;
        String str2 = null;
        if (this.f116490e || this.f116492g == 1) {
            this.f116490e = false;
            if (seekBar != null) {
                int progress = seekBar.getProgress();
                if (!this.f116500o) {
                    this.f116500o = true;
                } else {
                    C81079v.m140776O().mo123931a(((float) progress) / 100.0f);
                    if (this.f116497l < progress) {
                        str = "back";
                    } else {
                        str = "front";
                    }
                    if (this.f116492g == 1) {
                        i = 1;
                    }
                    C33744d a = new C33744d().mo59983a("enter_from", this.f116495j).mo59983a("impr_type", C59208ac.m108776j(this.f116486a)).mo59983a("action_type", str).mo59980a("is_pause", i).mo59983a("author_id", C59208ac.m108758a(this.f116486a)).mo59980a("page_type", this.f116496k).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108763b(this.f116486a)));
                    Aweme aweme = this.f116486a;
                    if (aweme != null) {
                        str2 = aweme.getAid();
                    }
                    C39162r.m79460a("click_progress_bar", a.mo59983a("group_id", str2).f79943a);
                }
            }
        }
        if (this.f116492g == 1 && (amVar = this.f116494i) != null) {
            amVar.mo84795o(amVar.mo81109aD());
        }
        this.f116504s.setAlpha(1.0f);
        ViewPropertyAnimator animate = this.f116504s.animate();
        if (!(animate == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(200)) == null)) {
            duration.start();
        }
        this.f116504s.setVisibility(8);
        this.f116508y.removeCallbacks(this.f116485A);
        this.f116508y.postDelayed(this.f116485A, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.VideoSeekBar.AbstractC50431c
    /* renamed from: a */
    public final void mo85658a(SeekBar seekBar) {
        AbstractC49849am amVar;
        this.f116489d = true;
        if (this.f116492g == 1 && (amVar = this.f116494i) != null) {
            amVar.mo81102au();
        }
        if (seekBar != null) {
            this.f116497l = seekBar.getProgress();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo85687a(boolean z) {
        if (z) {
            VideoSeekBar videoSeekBar = this.f116503r;
            C17238d.m31812a(videoSeekBar, videoSeekBar.getAlpha(), 0.0f);
            return;
        }
        C17238d.m31812a(this.f116503r, 0.0f, 1.0f);
    }

    /* renamed from: a */
    public final void mo85686a(Aweme aweme, int i, boolean z) {
        if (!m94590a(aweme) || !z) {
            this.f116503r.setVisibility(4);
            return;
        }
        if (i == 0) {
            this.f116503r.setVisibility(0);
            this.f116492g = 2;
            if (this.f116489d) {
                this.f116504s.setVisibility(0);
                return;
            }
        } else {
            this.f116503r.setVisibility(4);
        }
        this.f116504s.setVisibility(8);
    }

    public C50437b(VideoSeekBar videoSeekBar, ViewGroup viewGroup, TextView textView, TextView textView2, ScrollSwitchStateManager scrollSwitchStateManager) {
        C89219l.m154721d(videoSeekBar, "");
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(textView, "");
        C89219l.m154721d(textView2, "");
        this.f116503r = videoSeekBar;
        this.f116504s = viewGroup;
        this.f116505t = textView;
        this.f116506u = textView2;
        this.f116507v = scrollSwitchStateManager;
        String b = C89204ab.m154669a(getClass()).mo143613b();
        f116483w = b == null ? "CommonControl" : b;
        videoSeekBar.setVisibility(8);
        viewGroup.setVisibility(8);
        videoSeekBar.setOnSeekBarChangeListener(this);
        videoSeekBar.setOnDispatchTouchEventListener(this);
        textView2.setAlpha(0.75f);
        EventBus.m156966a(EventBus.m156962a(), this);
        this.f116485A = new RunnableC50442e(this);
    }
}
