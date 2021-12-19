package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3345h;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1183ag;
import androidx.lifecycle.C1182af;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33946d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoControl;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.LongPressLayout;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57351c;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57355f;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.DiggWidget;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.FeedTitleWidget;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.KidsAnchorWidget;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.MusicCoverWidget;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.MusicInfoWidget;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.VideoProgressBarWidget;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3336d.p3338b.C57404a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3343g.C57447b;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3343g.p3344a.C57445a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.reportstats.C57474b;
import com.p2082ss.android.ugc.aweme.kids.experiment.abmock.C57611a;
import com.p2082ss.android.ugc.aweme.kids.experiment.abmock.p3351a.C57616c;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import com.p2082ss.android.ugc.playerkit.videoview.C84294j;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.h.c */
public final class C57450c implements AbstractC1183ag, AbstractC57448a, OnUIPlayListener, AbstractC84295k {

    /* renamed from: s */
    public static final C57451a f130989s = new C57451a((byte) 0);

    /* renamed from: a */
    public final SmartImageView f130990a;

    /* renamed from: b */
    public final FrameLayout f130991b;

    /* renamed from: c */
    public final SmartCircleImageView f130992c;

    /* renamed from: d */
    public final ImageView f130993d;

    /* renamed from: e */
    public final ImageView f130994e;

    /* renamed from: f */
    public final ImageView f130995f;

    /* renamed from: g */
    public final ImageView f130996g;

    /* renamed from: h */
    public C57447b f130997h = new C57447b();

    /* renamed from: i */
    public Aweme f130998i;

    /* renamed from: j */
    public int f130999j;

    /* renamed from: k */
    public Video f131000k;

    /* renamed from: l */
    public DataCenter f131001l;

    /* renamed from: m */
    public C57445a f131002m;

    /* renamed from: n */
    public AbstractC57449b f131003n;

    /* renamed from: o */
    public final View f131004o;

    /* renamed from: p */
    public final Fragment f131005p;

    /* renamed from: q */
    public final String f131006q;

    /* renamed from: r */
    public final String f131007r;

    /* renamed from: t */
    private final ImageView f131008t;

    /* renamed from: u */
    private final LongPressLayout f131009u;

    /* renamed from: v */
    private final AbstractC84293i f131010v;

    /* renamed from: w */
    private boolean f131011w;

    /* renamed from: x */
    private C33947e f131012x;

    /* renamed from: y */
    private final View.OnTouchListener f131013y;

    static {
        Covode.recordClassIndex(67379);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
    public final void aJ_() {
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
    /* renamed from: b */
    public final void mo60627b(int i, int i2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreParePlay(String str, C84215n nVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreRenderSessionMissed(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C84216o oVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC63056b bVar, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i, int i2) {
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.h.c$a */
    public static final class C57451a {
        static {
            Covode.recordClassIndex(67380);
        }

        private C57451a() {
        }

        public /* synthetic */ C57451a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3345h.AbstractC57448a
    /* renamed from: b */
    public final Aweme mo94720b() {
        return this.f130998i;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3345h.AbstractC57448a
    /* renamed from: f */
    public final DataCenter mo94724f() {
        return this.f131001l;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3345h.AbstractC57448a
    /* renamed from: h */
    public final int mo94726h() {
        return this.f130999j;
    }

    /* renamed from: k */
    private final void m104133k() {
        this.f130990a.setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3345h.AbstractC57448a
    /* renamed from: g */
    public final Surface mo94725g() {
        return this.f131010v.mo129313b();
    }

    @Override // androidx.lifecycle.AbstractC1183ag
    public final C1182af getViewModelStore() {
        return new C1182af();
    }

    /* renamed from: i */
    public final void mo94727i() {
        this.f130990a.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3345h.AbstractC57448a
    /* renamed from: c */
    public final void mo94721c() {
        DataCenter dataCenter = this.f131001l;
        if (dataCenter != null) {
            dataCenter.mo60191a("stop_animation", (Object) true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3345h.AbstractC57448a
    /* renamed from: d */
    public final void mo94722d() {
        DataCenter dataCenter = this.f131001l;
        if (dataCenter != null) {
            dataCenter.mo60191a("start_animation", (Object) null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3345h.AbstractC57448a
    /* renamed from: e */
    public final void mo94723e() {
        DataCenter dataCenter = this.f131001l;
        if (dataCenter != null) {
            dataCenter.mo60191a("pause_animation", (Object) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.h.c$e */
    static final class CallableC57455e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C57450c f131017a;

        static {
            Covode.recordClassIndex(67384);
        }

        CallableC57455e(C57450c cVar) {
            this.f131017a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            String str2;
            C33743c a = new C33743c().mo59976a("enter_from", this.f131017a.f131006q);
            Aweme aweme = this.f131017a.f130998i;
            String str3 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            C33743c a2 = a.mo59976a("group_id", str);
            Aweme aweme2 = this.f131017a.f130998i;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            } else {
                str2 = null;
            }
            C33743c a3 = a2.mo59976a("author_id", str2);
            Aweme aweme3 = this.f131017a.f130998i;
            if (aweme3 != null) {
                str3 = aweme3.getLogPbString();
            }
            C57355f.m103962a("video_play_finish", a3.mo59976a("log_pb", str3).mo59977a());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.h.c$d */
    static final class CallableC57454d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C57450c f131016a;

        static {
            Covode.recordClassIndex(67383);
        }

        CallableC57454d(C57450c cVar) {
            this.f131016a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C33743c cVar;
            String str;
            String str2;
            String str3;
            String str4;
            String str5 = "log_pb";
            String str6 = null;
            if (TextUtils.equals("discovery", this.f131016a.f131006q) || TextUtils.equals("category_details_page", this.f131016a.f131006q)) {
                C33743c a = new C33743c().mo59976a("enter_from", this.f131016a.f131006q);
                Aweme aweme = this.f131016a.f130998i;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                C33743c a2 = a.mo59976a("group_id", str);
                Aweme aweme2 = this.f131016a.f130998i;
                if (aweme2 != null) {
                    str2 = aweme2.getAuthorUid();
                } else {
                    str2 = null;
                }
                C33743c a3 = a2.mo59976a("author_id", str2);
                Aweme aweme3 = this.f131016a.f130998i;
                if (aweme3 != null) {
                    str6 = aweme3.getLogPbString();
                }
                cVar = a3.mo59976a(str5, str6).mo59974a("rank", Integer.valueOf(this.f131016a.f130999j + 1));
                str5 = C57351c.f130726a;
                str6 = C57351c.f130727b;
            } else {
                C33743c a4 = new C33743c().mo59976a("enter_from", this.f131016a.f131006q);
                Aweme aweme4 = this.f131016a.f130998i;
                if (aweme4 != null) {
                    str3 = aweme4.getAid();
                } else {
                    str3 = null;
                }
                C33743c a5 = a4.mo59976a("group_id", str3);
                Aweme aweme5 = this.f131016a.f130998i;
                if (aweme5 != null) {
                    str4 = aweme5.getAuthorUid();
                } else {
                    str4 = null;
                }
                cVar = a5.mo59976a("author_id", str4);
                Aweme aweme6 = this.f131016a.f130998i;
                if (aweme6 != null) {
                    str6 = aweme6.getLogPbString();
                }
            }
            C57355f.m103962a("video_play", cVar.mo59976a(str5, str6).mo59977a());
            return C89391z.f203057a;
        }
    }

    /* renamed from: j */
    private final void m104132j() {
        this.f131001l = DataCenter.m69492a(C33946d.m69514a(this.f131005p, this), this.f131005p);
        C33947e a = C33947e.m69516a(this.f131005p, this.f131004o);
        this.f131012x = a;
        if (a != null) {
            a.mo60218a(this.f131001l);
        }
        C33947e eVar = this.f131012x;
        if (eVar != null) {
            eVar.mo60221b(R.id.b06, new FeedTitleWidget());
            eVar.mo60221b(R.id.b0i, new MusicInfoWidget());
            eVar.mo60221b(R.id.b0h, new MusicCoverWidget());
            eVar.mo60221b(R.id.b0d, new DiggWidget());
            eVar.mo60221b(R.id.b0b, new VideoProgressBarWidget());
            Object a2 = C57611a.m104321a(new C57616c());
            Objects.requireNonNull(a2, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) a2).intValue() == 1 && KidsAnchorWidget.C57424a.m104068a(this.f130998i)) {
                eVar.mo60221b(R.id.b0a, new KidsAnchorWidget());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        mo94727i();
        m104131a(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C84215n nVar) {
        m104131a(false);
    }

    /* renamed from: a */
    private final void m104131a(boolean z) {
        DataCenter dataCenter = this.f131001l;
        if (dataCenter != null) {
            dataCenter.mo60191a("load_progress_bar", Boolean.valueOf(z));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        if (z) {
            m104131a(true);
        } else {
            m104131a(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        C1731i.m5640b(new CallableC57455e(this), C57355f.m103959a());
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C84208l lVar) {
        m104131a(false);
        DataCenter dataCenter = this.f131001l;
        if (dataCenter != null) {
            dataCenter.mo60191a("pause_animation", (Object) true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        this.f131011w = false;
        m104133k();
        C57445a aVar = this.f131002m;
        if (aVar != null) {
            aVar.mo94718a();
        }
        DataCenter dataCenter = this.f131001l;
        if (dataCenter != null) {
            dataCenter.mo60191a("start_animation", (Object) true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        Aweme aweme;
        VideoControl videoControl;
        DataCenter dataCenter;
        Aweme aweme2 = this.f130998i;
        if (aweme2 != null && aweme2.getVideoControl() != null && (aweme = this.f130998i) != null && (videoControl = aweme.getVideoControl()) != null && videoControl.showProgressBar == 1 && (dataCenter = this.f131001l) != null) {
            dataCenter.mo60191a("on_play_progress_change", Float.valueOf(f));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C84216o oVar) {
        m104133k();
        C1731i.m5640b(new CallableC57454d(this), C57355f.m103959a());
        C57445a aVar = this.f131002m;
        if (aVar != null) {
            aVar.mo94718a();
        }
        DataCenter dataCenter = this.f131001l;
        if (dataCenter != null) {
            dataCenter.mo60191a("start_animation", (Object) true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.h.c$b */
    static final class View$OnClickListenerC57452b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C57450c f131014a;

        static {
            Covode.recordClassIndex(67381);
        }

        View$OnClickListenerC57452b(C57450c cVar) {
            this.f131014a = cVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickAgent.onClick(view);
            C57404a aVar = new C57404a();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_aweme", this.f131014a.f130998i);
            aVar.setArguments(bundle);
            aVar.show(this.f131014a.f131005p.getFragmentManager(), "AwemeMore");
            C33743c a = new C33743c().mo59976a("enter_from", this.f131014a.f131006q);
            Aweme aweme = this.f131014a.f130998i;
            String str3 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            C33743c a2 = a.mo59976a("group_id", str);
            Aweme aweme2 = this.f131014a.f130998i;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            } else {
                str2 = null;
            }
            C33743c a3 = a2.mo59976a("author_id", str2);
            Aweme aweme3 = this.f131014a.f130998i;
            if (aweme3 != null) {
                str3 = aweme3.getLogPbString();
            }
            C57355f.m103962a("click_menu", a3.mo59976a("log_pb", str3).mo59977a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.h.c$c */
    static final class View$OnClickListenerC57453c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C57450c f131015a;

        static {
            Covode.recordClassIndex(67382);
        }

        View$OnClickListenerC57453c(C57450c cVar) {
            this.f131015a = cVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickAgent.onClick(view);
            C33743c a = new C33743c().mo59976a("enter_from", this.f131015a.f131006q);
            Aweme aweme = this.f131015a.f130998i;
            String str3 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            C33743c a2 = a.mo59976a("group_id", str);
            Aweme aweme2 = this.f131015a.f130998i;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            } else {
                str2 = null;
            }
            C33743c a3 = a2.mo59976a("author_id", str2);
            Aweme aweme3 = this.f131015a.f130998i;
            if (aweme3 != null) {
                str3 = aweme3.getLogPbString();
            }
            C57355f.m103962a("click_profile_icon", a3.mo59976a("log_pb", str3).mo59977a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        C57445a aVar;
        this.f131011w = true;
        Aweme aweme = this.f130998i;
        if (!(aweme == null || (aVar = this.f131002m) == null)) {
            String str2 = this.f131006q;
            int i = this.f130999j;
            String str3 = this.f131007r;
            C89219l.m154721d(str2, "");
            C89219l.m154721d(aweme, "");
            if (aVar.f130979a != -1) {
                long currentTimeMillis = System.currentTimeMillis() - aVar.f130979a;
                if (currentTimeMillis > 50) {
                    String valueOf = String.valueOf(currentTimeMillis);
                    C89219l.m154721d(valueOf, "");
                    C57474b.f131091b = valueOf;
                    C33743c a = new C33743c().mo59976a("enter_from", str2).mo59976a("duration", String.valueOf(currentTimeMillis)).mo59974a("rank", Integer.valueOf(i + 1)).mo59976a("group_id", aweme.getAid()).mo59976a("author_id", aweme.getAuthorUid()).mo59976a("log_pb", aweme.getLogPbString());
                    if (C80537hk.m139613a(str3)) {
                        if (str3 == null) {
                            str3 = "";
                        }
                        a.mo59976a("category_id", str3);
                    }
                    C57355f.m103962a("play_time", a.mo59977a());
                }
                aVar.f130979a = -1;
            }
        }
        DataCenter dataCenter = this.f131001l;
        if (dataCenter != null) {
            dataCenter.mo60191a("pause_animation", (Object) true);
        }
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
    /* renamed from: a */
    public final void mo60625a(int i, int i2) {
        AbstractC57449b bVar = this.f131003n;
        if (bVar != null) {
            bVar.mo94679a(this.f130999j);
        }
    }

    public C57450c(View view, Fragment fragment, String str, String str2, View.OnTouchListener onTouchListener) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(onTouchListener, "");
        this.f131004o = view;
        this.f131005p = fragment;
        this.f131006q = str;
        this.f131007r = str2;
        this.f131013y = onTouchListener;
        View findViewById = view.findViewById(R.id.b0c);
        C89219l.m154716b(findViewById, "");
        this.f130990a = (SmartImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.b0y);
        C89219l.m154716b(findViewById2, "");
        FrameLayout frameLayout = (FrameLayout) findViewById2;
        this.f130991b = frameLayout;
        View findViewById3 = view.findViewById(R.id.b0f);
        C89219l.m154716b(findViewById3, "");
        ImageView imageView = (ImageView) findViewById3;
        this.f131008t = imageView;
        View findViewById4 = view.findViewById(R.id.b0e);
        C89219l.m154716b(findViewById4, "");
        SmartCircleImageView smartCircleImageView = (SmartCircleImageView) findViewById4;
        this.f130992c = smartCircleImageView;
        View findViewById5 = view.findViewById(R.id.b0g);
        C89219l.m154716b(findViewById5, "");
        LongPressLayout longPressLayout = (LongPressLayout) findViewById5;
        this.f131009u = longPressLayout;
        View findViewById6 = view.findViewById(R.id.aeo);
        C89219l.m154716b(findViewById6, "");
        this.f130993d = (ImageView) findViewById6;
        View findViewById7 = view.findViewById(R.id.aep);
        C89219l.m154716b(findViewById7, "");
        this.f130994e = (ImageView) findViewById7;
        View findViewById8 = view.findViewById(R.id.aek);
        C89219l.m154716b(findViewById8, "");
        this.f130995f = (ImageView) findViewById8;
        View findViewById9 = view.findViewById(R.id.ael);
        C89219l.m154716b(findViewById9, "");
        this.f130996g = (ImageView) findViewById9;
        C84294j a = C84294j.m144980a(frameLayout);
        C89219l.m154716b(a, "");
        this.f131010v = a;
        a.mo129312a(this);
        m104132j();
        longPressLayout.setTapListener(onTouchListener);
        imageView.setOnClickListener(new View$OnClickListenerC57452b(this));
        smartCircleImageView.setOnClickListener(new View$OnClickListenerC57453c(this));
        int i = Build.VERSION.SDK_INT;
        C57447b.m104115a(view.getContext());
    }
}
