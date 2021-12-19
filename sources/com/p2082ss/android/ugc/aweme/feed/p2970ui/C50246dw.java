package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AudioControlView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.AbstractC41360al;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49559p;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.RunnableC49561r;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49670ae;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50458e;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50462h;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.C50443c;
import com.p2082ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import com.p2082ss.android.ugc.aweme.main.AbstractC59105l;
import com.p2082ss.android.ugc.aweme.main.MainPageExperimentServiceImpl;
import com.p2082ss.android.ugc.aweme.p3426m.C58977b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.NewVideoPlayerProgressbar;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
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

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dw */
public class C50246dw extends AbstractC49544a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public AudioControlView f116019a;

    /* renamed from: b */
    NewVideoPlayerProgressbar f116020b;

    /* renamed from: c */
    LineProgressBar f116021c;

    /* renamed from: d */
    boolean f116022d = true;

    /* renamed from: e */
    private View f116023e;

    /* renamed from: f */
    private Activity f116024f;

    /* renamed from: g */
    private final AbstractC34466a f116025g;

    /* renamed from: h */
    private AnimatorSet f116026h;

    /* renamed from: i */
    private AnimatorSet f116027i;

    /* renamed from: j */
    private AnimatorSet f116028j;

    /* renamed from: k */
    private boolean f116029k;

    /* renamed from: l */
    private View f116030l;

    /* renamed from: m */
    private FrameLayout.LayoutParams f116031m;

    /* renamed from: n */
    private long f116032n;

    static {
        Covode.recordClassIndex(59372);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(8, new RunnableC90250g(C50246dw.class, "onPlayerControllerVideoPlayProgressEvent", C50458e.class, ThreadMode.POSTING, 0, false));
        hashMap.put(10, new RunnableC90250g(C50246dw.class, "onShareEndEvent", C49670ae.class, ThreadMode.POSTING, 0, false));
        hashMap.put(12, new RunnableC90250g(C50246dw.class, "onAwesomeSplashEvent", C18017a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo85414d() {
        LineProgressBar lineProgressBar = this.f116021c;
        if (lineProgressBar != null) {
            lineProgressBar.mo85737b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: h */
    public final void mo81285h() {
        super.mo81285h();
        EventBus.m156962a().mo145395b(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo85416o() {
        Activity activity = this.f116024f;
        if (activity instanceof AbstractC34472g) {
            ((AbstractC34472g) activity).registerActivityOnKeyDownListener(this.f116025g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo85420p() {
        Activity activity = this.f116024f;
        if (activity instanceof AbstractC34472g) {
            ((AbstractC34472g) activity).unRegisterActivityOnKeyDownListener(this.f116025g);
        }
    }

    /* renamed from: c */
    public final void mo85413c() {
        if (this.f116020b != null && this.f116019a != null) {
            AnimatorSet animatorSet = this.f116028j;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.f116020b.setAlpha(0.0f);
            this.f116019a.setAlpha(1.0f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80928a() {
        mo85413c();
        AnimatorSet animatorSet = this.f116026h;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f116026h.cancel();
        }
        AnimatorSet animatorSet2 = this.f116027i;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
            this.f116027i.cancel();
        }
        AudioControlView audioControlView = this.f116019a;
        if (audioControlView != null) {
            audioControlView.f81843c = null;
        }
        LineProgressBar lineProgressBar = this.f116021c;
        if (lineProgressBar != null) {
            lineProgressBar.mo85738c();
            this.f116021c.clearAnimation();
        }
        NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.f116020b;
        if (newVideoPlayerProgressbar != null) {
            newVideoPlayerProgressbar.clearAnimation();
        }
        mo85420p();
        this.f116024f = null;
    }

    /* renamed from: b */
    public final void mo85412b() {
        if (this.f116020b != null && this.f116019a != null) {
            if (this.f116027i != null || this.f116026h != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f116028j = animatorSet;
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50246dw.C502504 */

                    static {
                        Covode.recordClassIndex(59376);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        C50462h hVar = new C50462h(C50246dw.this.f113953L, C50246dw.this.f113954M, C50246dw.this.f113957P, 0, null);
                        hVar.f116553a = false;
                        AbstractC81915c.m141874a(hVar);
                    }
                });
                this.f116028j.play(this.f116020b.getShowAnim()).after(this.f116019a.getHideVolumeAnim());
                this.f116028j.start();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo85415e() {
        this.f116032n = SystemClock.elapsedRealtime();
        if (this.f113953L != null) {
            if (C76706a.m134281g(this.f113953L)) {
                this.f116020b.setVisibility(8);
            } else if (C50443c.m94610b(this.f113953L) || this.f113953L.getVideoControl() == null || this.f113953L.getVideoControl().showProgressBar != 1) {
                C34729o.m70955a(this.f116020b, 8);
            } else {
                this.f116020b.setProgress(0);
                if (this.f113953L.getVideo() != null) {
                    this.f116020b.setMax(this.f113953L.getVideo().getDuration());
                }
                C34729o.m70955a(this.f116020b, 0);
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
        return bVar;
    }

    @AbstractC90264r
    public void onShareEndEvent(C49670ae aeVar) {
        C34729o.m70955a(this.f116023e, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo81273a(VideoItemParams videoItemParams) {
        super.mo81273a(videoItemParams);
        AudioControlView audioControlView = this.f116019a;
        if (audioControlView != null) {
            audioControlView.setOnAudioControlViewHideListener(new AudioControlView.AbstractC34658b() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50246dw.C502471 */

                static {
                    Covode.recordClassIndex(59373);
                }

                @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AudioControlView.AbstractC34658b
                /* renamed from: a */
                public final void mo61283a() {
                    C50246dw.this.mo85412b();
                }

                @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AudioControlView.AbstractC34658b
                /* renamed from: b */
                public final void mo61284b() {
                    C50246dw.this.mo85413c();
                }
            });
        }
    }

    @AbstractC90264r
    public void onAwesomeSplashEvent(C18017a aVar) {
        boolean z;
        if (aVar.f42891a != 4) {
            z = true;
        } else {
            z = false;
        }
        this.f116029k = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: c */
    public final void mo80938c(C33942b bVar) {
        if (bVar != null) {
            C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50252dy(this, bVar.f80277a, bVar)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80929a(View view) {
        if (view instanceof FrameLayout) {
            this.f116030l = view;
            View a = C1870c.m6045a((Activity) this.f113959R, (int) R.layout.to);
            this.f116023e = a;
            this.f116019a = (AudioControlView) a.findViewById(R.id.mr);
            this.f116020b = (NewVideoPlayerProgressbar) this.f116023e.findViewById(R.id.fd_);
            this.f116021c = (LineProgressBar) this.f116023e.findViewById(R.id.c9d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C34728n.m70946a(1.0d));
            layoutParams.gravity = 80;
            if (C33403c.C33406b.f79409a.f79391t) {
                int a2 = C34728n.m70946a(8.0d);
                layoutParams.leftMargin = a2;
                layoutParams.rightMargin = a2;
            }
            this.f116031m = layoutParams;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    public final void mo80935b(C33942b bVar) {
        MethodCollector.m26663i(3702);
        if (!this.f113952K) {
            this.f113952K = true;
            View view = this.f116030l;
            if (view instanceof FrameLayout) {
                ((FrameLayout) view).addView(this.f116023e, this.f116031m);
            }
        }
        if (bVar == null) {
            MethodCollector.m26664o(3702);
        } else {
            MethodCollector.m26664o(3702);
        }
    }

    @AbstractC90264r
    public void onPlayerControllerVideoPlayProgressEvent(C50458e eVar) {
        if (this.f113953L != null && eVar.f116539a != null && eVar.f116539a.getAid().equals(this.f113953L.getAid())) {
            if (this.f116020b.getProgress() != 0 || SystemClock.elapsedRealtime() >= this.f116032n + 600) {
                this.f116020b.setMax(this.f113953L.getVideo().getDuration());
                NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.f116020b;
                double duration = (double) this.f113953L.getVideo().getDuration();
                double d = (double) eVar.f116542d;
                Double.isNaN(d);
                Double.isNaN(duration);
                newVideoPlayerProgressbar.setProgress((int) (duration * (d / 100.0d)));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80931a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo60189a("load_progress_bar", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("in_video_view_holder", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("on_page_unselected", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("on_page_selected", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("stopPlayAnimation", (AbstractC1214u<C33942b>) this.f113951J);
        }
    }

    public C50246dw(View view, Activity activity) {
        super(view);
        EventBus.m156966a(EventBus.m156962a(), this);
        this.f116024f = activity;
        this.f116025g = new C50251dx(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ boolean mo85411a(int i, KeyEvent keyEvent) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        boolean z3;
        if (i != 25 && i != 24) {
            return false;
        }
        if (i == 24) {
            z = true;
        } else {
            z = false;
        }
        C58977b.m108350a().mo96452b();
        if (z) {
            str = "up";
        } else {
            str = "down";
        }
        if (this.f113953L != null) {
            str2 = this.f113953L.getFromGroupId();
        } else {
            str2 = "";
        }
        C39162r.m79460a("adjust_volumn", new C33744d().mo59983a("enter_from", this.f113954M).mo59983a("to_status", str).mo59983a("group_id", str2).f79943a);
        AudioControlView audioControlView = this.f116019a;
        if (audioControlView == null || !audioControlView.mo61270e()) {
            Activity activity = this.f116024f;
            if (!(activity instanceof AbstractC59103j) || !ScrollSwitchStateManager.C52950a.m97811a((ActivityC0945e) activity).mo89350b("page_feed") || !(((AbstractC59103j) this.f116024f).getCurFragment() instanceof AbstractC59105l) || (!((AbstractC59105l) ((AbstractC59103j) this.f116024f).getCurFragment()).mo96548m() && !((AbstractC59105l) ((AbstractC59103j) this.f116024f).getCurFragment()).mo96549n())) {
                z2 = false;
            } else {
                z2 = true;
            }
            Activity activity2 = this.f116024f;
            if (!(activity2 instanceof AbstractC41360al) || !ScrollSwitchStateManager.C52950a.m97811a((ActivityC0945e) activity2).mo89350b("page_feed")) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (this.f116024f instanceof AbstractC59103j) {
                MainPageExperimentServiceImpl.m108379b();
            }
            if (z2 || z3) {
                AudioControlView audioControlView2 = this.f116019a;
                if (audioControlView2 != null) {
                    audioControlView2.mo61265a();
                    audioControlView2.f81845e.f81858e = true;
                }
                C50462h hVar = new C50462h(this.f113953L, this.f113954M, this.f113957P, i, keyEvent);
                hVar.f116553a = true;
                AbstractC81915c.m141874a(hVar);
                NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.f116020b;
                if (newVideoPlayerProgressbar != null) {
                    newVideoPlayerProgressbar.setAlpha(0.0f);
                }
                if (i == 25) {
                    AudioControlView audioControlView3 = this.f116019a;
                    if (audioControlView3 != null) {
                        if (this.f116029k) {
                            audioControlView3.mo61266b();
                        } else if (this.f116020b != null) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.f116026h = animatorSet;
                            animatorSet.play(this.f116019a.getShowVolumeAnim()).after(this.f116020b.getHideAnim());
                            this.f116026h.addListener(new AnimatorListenerAdapter() {
                                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50246dw.C502482 */

                                static {
                                    Covode.recordClassIndex(59374);
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    if (C50246dw.this.f116019a != null) {
                                        C50246dw.this.f116019a.mo61266b();
                                    }
                                }
                            });
                            this.f116026h.start();
                        }
                    }
                } else {
                    AudioControlView audioControlView4 = this.f116019a;
                    if (audioControlView4 != null) {
                        if (this.f116029k) {
                            audioControlView4.mo61267c();
                        } else if (this.f116020b != null) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.f116027i = animatorSet2;
                            animatorSet2.play(this.f116019a.getShowVolumeAnim()).after(this.f116020b.getHideAnim());
                            this.f116027i.addListener(new AnimatorListenerAdapter() {
                                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50246dw.C502493 */

                                static {
                                    Covode.recordClassIndex(59375);
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    if (C50246dw.this.f116019a != null) {
                                        C50246dw.this.f116019a.mo61267c();
                                    }
                                }
                            });
                            this.f116027i.start();
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }
}
