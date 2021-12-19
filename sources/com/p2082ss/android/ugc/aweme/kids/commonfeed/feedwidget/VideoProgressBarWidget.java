package com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.kids.common.p3329b.C57348c;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3341a.C57435a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3333a.C57384a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.AudioControlView;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.VideoPlayerProgressBar;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.VideoProgressBarWidget */
public final class VideoProgressBarWidget extends AbsFeedWidget {
    static {
        Covode.recordClassIndex(67359);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.VideoProgressBarWidget$a */
    public static final class C57431a extends AbstractC57436a implements AbstractC1214u<C33942b>, AbstractC90252i, AbstractC90253j {

        /* renamed from: a */
        public AudioControlView f130933a;

        /* renamed from: b */
        final /* synthetic */ VideoProgressBarWidget f130934b;

        /* renamed from: c */
        final /* synthetic */ View f130935c;

        /* renamed from: j */
        private Activity f130936j;

        /* renamed from: k */
        private VideoPlayerProgressBar f130937k;

        /* renamed from: l */
        private LineProgressBar f130938l;

        /* renamed from: m */
        private AnimatorSet f130939m;

        /* renamed from: n */
        private AnimatorSet f130940n;

        /* renamed from: o */
        private AnimatorSet f130941o;

        /* renamed from: p */
        private boolean f130942p = true;

        /* renamed from: q */
        private long f130943q;

        static {
            Covode.recordClassIndex(67360);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: b */
        public final String mo94694b() {
            return "progress_bar";
        }

        @Override // org.greenrobot.eventbus.AbstractC90252i
        public final Map<Integer, Object> getSubscriberEventTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put(28, new RunnableC90250g(C57431a.class, "onVolumeChangeEvent", C57348c.class, ThreadMode.POSTING, 0, false));
            return hashMap;
        }

        /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.VideoProgressBarWidget$a$a */
        public static final class C57432a implements AudioControlView.AbstractC57505b {

            /* renamed from: a */
            final /* synthetic */ C57431a f130944a;

            static {
                Covode.recordClassIndex(67361);
            }

            @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.AudioControlView.AbstractC57505b
            /* renamed from: a */
            public final void mo94705a() {
                this.f130944a.mo94702d();
            }

            @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.AudioControlView.AbstractC57505b
            /* renamed from: b */
            public final void mo94706b() {
                this.f130944a.mo94703e();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C57432a(C57431a aVar) {
                this.f130944a = aVar;
            }
        }

        /* renamed from: g */
        private final void m104093g() {
            LineProgressBar lineProgressBar = this.f130938l;
            if (lineProgressBar != null) {
                lineProgressBar.mo85737b();
            }
        }

        /* renamed from: d */
        public final void mo94702d() {
            if (this.f130937k != null && this.f130933a != null) {
                if (this.f130940n != null || this.f130939m != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f130941o = animatorSet;
                    VideoPlayerProgressBar videoPlayerProgressBar = this.f130937k;
                    if (videoPlayerProgressBar == null) {
                        C89219l.m154715b();
                    }
                    AnimatorSet.Builder play = animatorSet.play(videoPlayerProgressBar.getShowAnim());
                    AudioControlView audioControlView = this.f130933a;
                    if (audioControlView == null) {
                        C89219l.m154715b();
                    }
                    play.after(audioControlView.getHideVolumeAnim());
                    AnimatorSet animatorSet2 = this.f130941o;
                    if (animatorSet2 == null) {
                        C89219l.m154715b();
                    }
                    animatorSet2.start();
                }
            }
        }

        /* renamed from: e */
        public final void mo94703e() {
            if (this.f130937k != null && this.f130933a != null) {
                AnimatorSet animatorSet = this.f130941o;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                VideoPlayerProgressBar videoPlayerProgressBar = this.f130937k;
                if (videoPlayerProgressBar == null) {
                    C89219l.m154715b();
                }
                videoPlayerProgressBar.setAlpha(0.0f);
                AudioControlView audioControlView = this.f130933a;
                if (audioControlView == null) {
                    C89219l.m154715b();
                }
                audioControlView.setAlpha(1.0f);
            }
        }

        /* renamed from: h */
        private final void m104094h() {
            VideoPlayerProgressBar videoPlayerProgressBar;
            this.f130943q = SystemClock.elapsedRealtime();
            if (this.f130950d != null) {
                Aweme aweme = this.f130950d;
                C89219l.m154716b(aweme, "");
                if (aweme.getVideoControl() != null) {
                    Aweme aweme2 = this.f130950d;
                    C89219l.m154716b(aweme2, "");
                    if (aweme2.getVideoControl().showProgressBar == 1) {
                        VideoPlayerProgressBar videoPlayerProgressBar2 = this.f130937k;
                        if (videoPlayerProgressBar2 != null) {
                            videoPlayerProgressBar2.setProgress(0);
                        }
                        Aweme aweme3 = this.f130950d;
                        C89219l.m154716b(aweme3, "");
                        if (!(aweme3.getVideo() == null || (videoPlayerProgressBar = this.f130937k) == null)) {
                            Aweme aweme4 = this.f130950d;
                            C89219l.m154716b(aweme4, "");
                            Video video = aweme4.getVideo();
                            C89219l.m154716b(video, "");
                            videoPlayerProgressBar.setMax(video.getDuration());
                        }
                        C34729o.m70955a(this.f130937k, 0);
                        return;
                    }
                }
                C34729o.m70955a(this.f130937k, 8);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94687a() {
            mo94703e();
            AnimatorSet animatorSet = this.f130939m;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                AnimatorSet animatorSet2 = this.f130939m;
                if (animatorSet2 == null) {
                    C89219l.m154715b();
                }
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.f130940n;
            if (animatorSet3 != null) {
                animatorSet3.removeAllListeners();
                AnimatorSet animatorSet4 = this.f130940n;
                if (animatorSet4 == null) {
                    C89219l.m154715b();
                }
                animatorSet4.cancel();
            }
            AudioControlView audioControlView = this.f130933a;
            if (audioControlView != null) {
                audioControlView.f131149c = null;
            }
            LineProgressBar lineProgressBar = this.f130938l;
            if (lineProgressBar != null) {
                lineProgressBar.mo85738c();
                LineProgressBar lineProgressBar2 = this.f130938l;
                if (lineProgressBar2 == null) {
                    C89219l.m154715b();
                }
                lineProgressBar2.clearAnimation();
            }
            VideoPlayerProgressBar videoPlayerProgressBar = this.f130937k;
            if (videoPlayerProgressBar != null) {
                videoPlayerProgressBar.clearAnimation();
            }
            C80298cg.m139205b(this);
            this.f130936j = null;
        }

        /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.VideoProgressBarWidget$a$b */
        public static final class C57433b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C57431a f130945a;

            static {
                Covode.recordClassIndex(67362);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C57433b(C57431a aVar) {
                this.f130945a = aVar;
            }

            public final void onAnimationEnd(Animator animator) {
                C89219l.m154721d(animator, "");
                if (this.f130945a.f130933a != null) {
                    AudioControlView audioControlView = this.f130945a.f130933a;
                    if (audioControlView == null) {
                        C89219l.m154715b();
                    }
                    audioControlView.mo94748a();
                    C51423a.m95784a(4, "VoiceAdjust", "addVolume");
                    audioControlView.f131151e.sendEmptyMessage(2);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.VideoProgressBarWidget$a$c */
        public static final class C57434c extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C57431a f130946a;

            static {
                Covode.recordClassIndex(67363);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C57434c(C57431a aVar) {
                this.f130946a = aVar;
            }

            public final void onAnimationEnd(Animator animator) {
                C89219l.m154721d(animator, "");
                if (this.f130946a.f130933a != null) {
                    AudioControlView audioControlView = this.f130946a.f130933a;
                    if (audioControlView == null) {
                        C89219l.m154715b();
                    }
                    audioControlView.mo94748a();
                    C51423a.m95784a(4, "VoiceAdjust", "cutVolume");
                    audioControlView.f131151e.sendEmptyMessage(3);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94691a(C57435a aVar) {
            super.mo94691a(aVar);
            AudioControlView audioControlView = this.f130933a;
            if (audioControlView != null) {
                audioControlView.setOnAudioControlViewHideListener(new C57432a(this));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94690a(DataCenter dataCenter) {
            if (dataCenter != null) {
                dataCenter.mo60189a("load_progress_bar", (AbstractC1214u<C33942b>) this);
                dataCenter.mo60189a("on_page_unselected", (AbstractC1214u<C33942b>) this);
                dataCenter.mo60189a("on_page_selected", (AbstractC1214u<C33942b>) this);
                dataCenter.mo60189a("stop_animation", (AbstractC1214u<C33942b>) this);
                dataCenter.mo60189a("on_play_progress_change", (AbstractC1214u<C33942b>) this);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94689a(View view) {
            MethodCollector.m26663i(8195);
            if (view instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) view;
                View inflate = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.acw, (ViewGroup) null);
                this.f130933a = (AudioControlView) inflate.findViewById(R.id.mr);
                this.f130937k = (VideoPlayerProgressBar) inflate.findViewById(R.id.fd_);
                this.f130938l = (LineProgressBar) inflate.findViewById(R.id.c9d);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C34728n.m70946a(1.0d));
                layoutParams.gravity = 80;
                if (C57384a.C57385a.f130808a.f130807m) {
                    int a = C34728n.m70946a(8.0d);
                    layoutParams.leftMargin = a;
                    layoutParams.rightMargin = a;
                }
                frameLayout.addView(inflate, layoutParams);
            }
            MethodCollector.m26664o(8195);
        }

        @AbstractC90264r
        public final void onVolumeChangeEvent(C57348c cVar) {
            C89219l.m154721d(cVar, "");
            AudioControlView audioControlView = this.f130933a;
            if (audioControlView == null || audioControlView.f131151e == null || !audioControlView.f131151e.f131163d) {
                VideoPlayerProgressBar videoPlayerProgressBar = this.f130937k;
                if (videoPlayerProgressBar != null) {
                    videoPlayerProgressBar.setAlpha(0.0f);
                }
                ObjectAnimator objectAnimator = null;
                if (cVar.f130721a) {
                    if (this.f130933a != null && this.f130937k != null) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.f130940n = animatorSet;
                        AudioControlView audioControlView2 = this.f130933a;
                        if (audioControlView2 == null) {
                            C89219l.m154715b();
                        }
                        AnimatorSet.Builder play = animatorSet.play(audioControlView2.getShowVolumeAnim());
                        VideoPlayerProgressBar videoPlayerProgressBar2 = this.f130937k;
                        if (videoPlayerProgressBar2 != null) {
                            objectAnimator = videoPlayerProgressBar2.getHideAnim();
                        }
                        play.after(objectAnimator);
                        AnimatorSet animatorSet2 = this.f130940n;
                        if (animatorSet2 == null) {
                            C89219l.m154715b();
                        }
                        animatorSet2.addListener(new C57433b(this));
                        AnimatorSet animatorSet3 = this.f130940n;
                        if (animatorSet3 == null) {
                            C89219l.m154715b();
                        }
                        animatorSet3.start();
                    }
                } else if (this.f130933a != null && this.f130937k != null) {
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f130939m = animatorSet4;
                    AudioControlView audioControlView3 = this.f130933a;
                    if (audioControlView3 == null) {
                        C89219l.m154715b();
                    }
                    AnimatorSet.Builder play2 = animatorSet4.play(audioControlView3.getShowVolumeAnim());
                    VideoPlayerProgressBar videoPlayerProgressBar3 = this.f130937k;
                    if (videoPlayerProgressBar3 != null) {
                        objectAnimator = videoPlayerProgressBar3.getHideAnim();
                    }
                    play2.after(objectAnimator);
                    AnimatorSet animatorSet5 = this.f130939m;
                    if (animatorSet5 == null) {
                        C89219l.m154715b();
                    }
                    animatorSet5.addListener(new C57434c(this));
                    AnimatorSet animatorSet6 = this.f130939m;
                    if (animatorSet6 == null) {
                        C89219l.m154715b();
                    }
                    animatorSet6.start();
                }
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C33942b bVar) {
            C33942b bVar2 = bVar;
            if (bVar2 != null) {
                String str = bVar2.f80277a;
                switch (str.hashCode()) {
                    case -1121670825:
                        if (str.equals("on_play_progress_change")) {
                            Float f = (Float) bVar2.mo60212a();
                            C89219l.m154716b(f, "");
                            float floatValue = f.floatValue();
                            if (this.f130950d != null) {
                                VideoPlayerProgressBar videoPlayerProgressBar = this.f130937k;
                                if (videoPlayerProgressBar == null || videoPlayerProgressBar.getProgress() != 0 || SystemClock.elapsedRealtime() >= this.f130943q + 600) {
                                    VideoPlayerProgressBar videoPlayerProgressBar2 = this.f130937k;
                                    if (videoPlayerProgressBar2 != null) {
                                        Aweme aweme = this.f130950d;
                                        C89219l.m154716b(aweme, "");
                                        Video video = aweme.getVideo();
                                        C89219l.m154716b(video, "");
                                        videoPlayerProgressBar2.setMax(video.getDuration());
                                    }
                                    VideoPlayerProgressBar videoPlayerProgressBar3 = this.f130937k;
                                    if (videoPlayerProgressBar3 != null) {
                                        Aweme aweme2 = this.f130950d;
                                        C89219l.m154716b(aweme2, "");
                                        Video video2 = aweme2.getVideo();
                                        C89219l.m154716b(video2, "");
                                        double duration = (double) video2.getDuration();
                                        double d = (double) floatValue;
                                        Double.isNaN(d);
                                        Double.isNaN(duration);
                                        videoPlayerProgressBar3.setProgress(((Integer) Double.valueOf(duration * (d / 100.0d))).intValue());
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case -904341062:
                        if (str.equals("load_progress_bar")) {
                            Boolean bool = (Boolean) bVar2.mo60212a();
                            C89219l.m154716b(bool, "");
                            if (bool.booleanValue()) {
                                LineProgressBar lineProgressBar = this.f130938l;
                                if (lineProgressBar != null) {
                                    lineProgressBar.mo85736a();
                                    return;
                                }
                                return;
                            }
                            m104093g();
                            return;
                        }
                        return;
                    case -301890681:
                        if (str.equals("stop_animation") && !this.f130942p) {
                            VideoPlayerProgressBar videoPlayerProgressBar4 = this.f130937k;
                            if (videoPlayerProgressBar4 != null) {
                                videoPlayerProgressBar4.setProgress(0);
                                videoPlayerProgressBar4.clearAnimation();
                                videoPlayerProgressBar4.setVisibility(4);
                            }
                            LineProgressBar lineProgressBar2 = this.f130938l;
                            if (lineProgressBar2 != null) {
                                lineProgressBar2.clearAnimation();
                                lineProgressBar2.mo85738c();
                                return;
                            }
                            return;
                        }
                        return;
                    case 350216171:
                        if (str.equals("on_page_selected")) {
                            this.f130942p = true;
                            mo94702d();
                            m104094h();
                            return;
                        }
                        return;
                    case 1628582276:
                        if (str.equals("on_page_unselected")) {
                            this.f130942p = false;
                            m104094h();
                            m104093g();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57431a(VideoProgressBarWidget videoProgressBarWidget, View view, View view2) {
            super(view2);
            this.f130934b = videoProgressBarWidget;
            this.f130935c = view;
            C80298cg.m139204a(this);
            this.f130936j = videoProgressBarWidget.mo60208d();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.AbsFeedWidget
    /* renamed from: b */
    public final AbstractC57436a mo94686b(View view) {
        return new C57431a(this, view, view);
    }
}
