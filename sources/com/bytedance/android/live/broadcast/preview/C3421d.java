package com.bytedance.android.live.broadcast.preview;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.C0550b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.android.C2690b;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.C3010ab;
import com.bytedance.android.live.broadcast.C3011ac;
import com.bytedance.android.live.broadcast.C3015ag;
import com.bytedance.android.live.broadcast.C3228f;
import com.bytedance.android.live.broadcast.C3247i;
import com.bytedance.android.live.broadcast.C3248j;
import com.bytedance.android.live.broadcast.C3752w;
import com.bytedance.android.live.broadcast.C3802x;
import com.bytedance.android.live.broadcast.C3803y;
import com.bytedance.android.live.broadcast.C3804z;
import com.bytedance.android.live.broadcast.EnumC3338p;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p185c.C3049b;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl;
import com.bytedance.android.live.broadcast.model.C3257d;
import com.bytedance.android.live.broadcast.model.C3263i;
import com.bytedance.android.live.broadcast.model.C3267k;
import com.bytedance.android.live.broadcast.model.C3269m;
import com.bytedance.android.live.broadcast.model.C3272o;
import com.bytedance.android.live.broadcast.model.EnumC3268l;
import com.bytedance.android.live.broadcast.p192c.AbstractC3185a;
import com.bytedance.android.live.broadcast.p198g.C3241b;
import com.bytedance.android.live.broadcast.preview.C3527n;
import com.bytedance.android.live.broadcast.preview.C3546q;
import com.bytedance.android.live.broadcast.preview.C3549r;
import com.bytedance.android.live.broadcast.preview.C3558t;
import com.bytedance.android.live.broadcast.preview.C3561v;
import com.bytedance.android.live.broadcast.preview.widget.ObsBroadcastGuideWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewApplyWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewBeautyWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewChangeOrientationWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewCloseWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewCommonNotifyWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewCoverWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewDefinitionSelectionWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewFollowerWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewHelpWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewLiveModeWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewLiveStudioPageWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewLiveStudioTipsWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewLoadEndWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewReplayWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewReverseCameraWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewSeeMoreDetailWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewSelectGameCategoryWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewSettingWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewShareWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewStickerWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewSubscriptionWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewTitleWidget;
import com.bytedance.android.live.broadcast.utils.C3719d;
import com.bytedance.android.live.broadcast.utils.C3730i;
import com.bytedance.android.live.broadcast.widget.View$OnClickListenerC3783e;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3940j;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.performance.C4017b;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.p230a.C4054a;
import com.bytedance.android.live.effect.C4217d;
import com.bytedance.android.live.effect.api.AbstractC4167d;
import com.bytedance.android.live.effect.api.AbstractC4170f;
import com.bytedance.android.live.effect.api.C4147a;
import com.bytedance.android.live.effect.api.p240a.AbstractC4149b;
import com.bytedance.android.live.effect.api.p240a.AbstractC4151d;
import com.bytedance.android.live.effect.api.p240a.AbstractC4152e;
import com.bytedance.android.live.effect.api.p240a.AbstractC4162k;
import com.bytedance.android.live.effect.api.p240a.C4163l;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p209c.AbstractC3807b;
import com.bytedance.android.live.p249h.AbstractC4349b;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p379n.AbstractC5781n;
import com.bytedance.android.live.p385p.AbstractC5843h;
import com.bytedance.android.live.p385p.EnumC5854q;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6201f;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.p481b.C7307f;
import com.bytedance.android.livesdk.chatroom.p481b.C7324u;
import com.bytedance.android.livesdk.chatroom.p481b.C7325v;
import com.bytedance.android.livesdk.chatroom.p488c.C7379al;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameCategoryEntranceSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHashTagAnchorShowEntrance;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveObsBroadcastGuideStrategySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveResumeLiveSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.RemoveOnlineFollowersSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableALogSetting;
import com.bytedance.android.livesdk.model.C9518ae;
import com.bytedance.android.livesdk.model.EnumC9592k;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6519c;
import com.bytedance.android.livesdk.p425aa.C6560m;
import com.bytedance.android.livesdk.p425aa.p428c.C6529h;
import com.bytedance.android.livesdk.p425aa.p428c.C6531i;
import com.bytedance.android.livesdk.p425aa.p428c.C6532j;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p558h.EnumC8917a;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9011ae;
import com.bytedance.android.livesdk.p561j.C9012af;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9023aq;
import com.bytedance.android.livesdk.p561j.C9035bb;
import com.bytedance.android.livesdk.p561j.C9094df;
import com.bytedance.android.livesdk.p561j.C9115e;
import com.bytedance.android.livesdk.p562k.DialogC9146a;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.p620s.C10610a;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.p643ui.TraversalConstraintLayout;
import com.bytedance.android.livesdk.performance.C10085b;
import com.bytedance.android.livesdk.performance.C10095g;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11223al;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.utils.C11291z;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11685f;
import com.bytedance.android.livesdkapi.depend.p679c.HandlerC11626a;
import com.bytedance.android.livesdkapi.host.AbstractC11797b;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.p699l.C11825a;
import com.bytedance.android.livesdkapi.p699l.C11826b;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.dmt.p1194ui.widget.util.FontSpan;
import com.bytedance.ies.sdk.datachannel.AbstractC17845e;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.facebook.common.p1839k.C24134g;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.view.C24262c;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.live.broadcast.preview.d */
public final class C3421d extends C10935a implements HandlerC11626a.AbstractC11627a, AbstractC11685f, AbstractC17845e {

    /* renamed from: t */
    public static final C3422a f9651t = new C3422a((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f9652A = C11831d.m20835a(new C3432aj(this));

    /* renamed from: B */
    private final AbstractC89244h f9653B = C11831d.m20835a(new C3433ak(this));

    /* renamed from: C */
    private final AbstractC89244h f9654C = C11831d.m20835a(new C3434al(this));

    /* renamed from: D */
    private final AbstractC89244h f9655D = C11831d.m20835a(C3431ai.f9714a);

    /* renamed from: E */
    private final AbstractC89244h f9656E = C11831d.m20835a(new C3438an(this));

    /* renamed from: F */
    private final AbstractC89244h f9657F = C11831d.m20835a(C3425ac.f9708a);

    /* renamed from: G */
    private final AbstractC89244h f9658G = C11831d.m20835a(C3427ae.f9710a);

    /* renamed from: H */
    private final AbstractC89244h f9659H = C11831d.m20835a(C3492x.f9782a);

    /* renamed from: I */
    private final AbstractC89244h f9660I = C11831d.m20835a(C3429ag.f9712a);

    /* renamed from: J */
    private final AbstractC89244h f9661J = C11831d.m20835a(new C3436am(this));

    /* renamed from: K */
    private final AbstractC89244h f9662K = C11831d.m20835a(C3439ao.f9720a);

    /* renamed from: L */
    private final AbstractC89244h f9663L = C11831d.m20835a(C3487t.f9778a);

    /* renamed from: M */
    private final AbstractC89244h f9664M = C11831d.m20835a(C3424ab.f9707a);

    /* renamed from: N */
    private final AbstractC89244h f9665N = C11831d.m20835a(C3482o.f9773a);

    /* renamed from: O */
    private final AbstractC89244h f9666O = C11831d.m20835a(C3485r.f9776a);

    /* renamed from: P */
    private final AbstractC89244h f9667P = C11831d.m20835a(C3486s.f9777a);

    /* renamed from: Q */
    private final AbstractC89244h f9668Q = C11831d.m20835a(C3483p.f9774a);

    /* renamed from: R */
    private final AbstractC89244h f9669R = C11831d.m20835a(new C3484q(this));

    /* renamed from: S */
    private final AbstractC89244h f9670S = C11831d.m20835a(new C3469d(this));

    /* renamed from: T */
    private boolean f9671T;

    /* renamed from: U */
    private long f9672U;

    /* renamed from: V */
    private final WidgetCreateTimeUtil f9673V = new WidgetCreateTimeUtil(new C3440ap(this));

    /* renamed from: W */
    private Runnable f9674W;

    /* renamed from: X */
    private C3561v f9675X;

    /* renamed from: Y */
    private final AbstractC4170f f9676Y = C4217d.m10317a();

    /* renamed from: Z */
    private final AbstractC89244h f9677Z = C11831d.m20835a(new C3467bo(this));

    /* renamed from: a */
    public DataChannel f9678a;

    /* renamed from: aa */
    private final AbstractC4151d f9679aa = new C3479m(this);

    /* renamed from: ab */
    private final AbstractC11683e.AbstractC11684a f9680ab = new C3480n(this);

    /* renamed from: ac */
    private HashMap f9681ac;

    /* renamed from: b */
    final AbstractC89244h f9682b = C11831d.m20835a(new C3493y(this));

    /* renamed from: c */
    public PreviewSubscriptionWidget f9683c;

    /* renamed from: d */
    final AbstractC89244h f9684d = C11831d.m20835a(C3489v.f9780a);

    /* renamed from: e */
    public LiveWidget f9685e;

    /* renamed from: f */
    public ObsBroadcastGuideWidget f9686f;

    /* renamed from: g */
    final AbstractC89244h f9687g = C11831d.m20835a(C3428af.f9711a);

    /* renamed from: h */
    EnumC11728i f9688h;

    /* renamed from: i */
    public User f9689i;

    /* renamed from: j */
    public AbstractC11683e f9690j;

    /* renamed from: k */
    public boolean f9691k;

    /* renamed from: l */
    public long f9692l;

    /* renamed from: m */
    public float f9693m;

    /* renamed from: n */
    public float f9694n;

    /* renamed from: o */
    public boolean f9695o;

    /* renamed from: p */
    boolean f9696p;

    /* renamed from: q */
    public boolean f9697q;

    /* renamed from: r */
    final AbstractC89244h f9698r = C11831d.m20835a(C3494z.f9784a);

    /* renamed from: s */
    final C3488u f9699s = new C3488u(this);

    /* renamed from: u */
    private final C11825a f9700u = ((C11825a) DataChannelGlobal.f42558d.mo28324b(C9115e.class));

    /* renamed from: v */
    private WidgetManager f9701v;

    /* renamed from: w */
    private final AbstractC89244h f9702w = C11831d.m20835a(new C3490w(this));

    /* renamed from: x */
    private final AbstractC89244h f9703x = C11831d.m20835a(new C3423aa(this));

    /* renamed from: y */
    private final AbstractC89244h f9704y = C11831d.m20835a(C3426ad.f9709a);

    /* renamed from: z */
    private final AbstractC89244h f9705z = C11831d.m20835a(new C3430ah(this));

    static {
        Covode.recordClassIndex(3905);
    }

    /* renamed from: H */
    private final Handler m8843H() {
        return (Handler) this.f9668Q.getValue();
    }

    /* renamed from: I */
    private final Context m8844I() {
        return (Context) this.f9670S.getValue();
    }

    /* renamed from: a */
    public final PreviewBeautyWidget mo8733a() {
        return (PreviewBeautyWidget) this.f9702w.getValue();
    }

    /* renamed from: b */
    public final PreviewCoverWidget mo8741b() {
        return (PreviewCoverWidget) this.f9703x.getValue();
    }

    /* renamed from: c */
    public final PreviewHelpWidget mo8745c() {
        return (PreviewHelpWidget) this.f9704y.getValue();
    }

    /* renamed from: d */
    public final View mo8746d(int i) {
        if (this.f9681ac == null) {
            this.f9681ac = new HashMap();
        }
        View view = (View) this.f9681ac.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f9681ac.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public final PreviewReverseCameraWidget mo8747d() {
        return (PreviewReverseCameraWidget) this.f9705z.getValue();
    }

    /* renamed from: e */
    public final PreviewSettingWidget mo8748e() {
        return (PreviewSettingWidget) this.f9652A.getValue();
    }

    /* renamed from: f */
    public final PreviewShareWidget mo8749f() {
        return (PreviewShareWidget) this.f9653B.getValue();
    }

    /* renamed from: g */
    public final PreviewStartLiveWidget mo8750g() {
        return (PreviewStartLiveWidget) this.f9654C.getValue();
    }

    /* renamed from: i */
    public final PreviewSeeMoreDetailWidget mo8752i() {
        return (PreviewSeeMoreDetailWidget) this.f9655D.getValue();
    }

    /* renamed from: j */
    public final PreviewTitleWidget mo8753j() {
        return (PreviewTitleWidget) this.f9656E.getValue();
    }

    /* renamed from: k */
    public final PreviewFollowerWidget mo8754k() {
        return (PreviewFollowerWidget) this.f9657F.getValue();
    }

    /* renamed from: l */
    public final PreviewLiveModeWidget mo8755l() {
        return (PreviewLiveModeWidget) this.f9658G.getValue();
    }

    /* renamed from: m */
    public final PreviewChangeOrientationWidget mo8756m() {
        return (PreviewChangeOrientationWidget) this.f9659H.getValue();
    }

    /* renamed from: n */
    public final PreviewReplayWidget mo8757n() {
        return (PreviewReplayWidget) this.f9660I.getValue();
    }

    /* renamed from: o */
    public final PreviewStickerWidget mo8758o() {
        return (PreviewStickerWidget) this.f9661J.getValue();
    }

    /* renamed from: p */
    public final LiveWidget mo8759p() {
        return (LiveWidget) this.f9662K.getValue();
    }

    /* renamed from: q */
    public final LiveWidget mo8760q() {
        return (LiveWidget) this.f9663L.getValue();
    }

    /* renamed from: r */
    public final PreviewDefinitionSelectionWidget mo8761r() {
        return (PreviewDefinitionSelectionWidget) this.f9664M.getValue();
    }

    /* renamed from: s */
    public final PreviewSelectGameCategoryWidget mo8762s() {
        return (PreviewSelectGameCategoryWidget) this.f9665N.getValue();
    }

    /* renamed from: t */
    public final PreviewLiveStudioPageWidget mo8763t() {
        return (PreviewLiveStudioPageWidget) this.f9666O.getValue();
    }

    /* renamed from: u */
    public final PreviewLiveStudioTipsWidget mo8764u() {
        return (PreviewLiveStudioTipsWidget) this.f9667P.getValue();
    }

    /* renamed from: v */
    public final C3527n mo8765v() {
        return (C3527n) this.f9669R.getValue();
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$a */
    public static final class C3422a {
        static {
            Covode.recordClassIndex(3906);
        }

        private C3422a() {
        }

        public /* synthetic */ C3422a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11685f
    /* renamed from: F */
    public final /* bridge */ /* synthetic */ Fragment mo8731F() {
        return this;
    }

    /* renamed from: a */
    public final void mo8739a(PrivacyCert privacyCert) {
        C6204h.m13474a(new C3451az(this, privacyCert));
        C6204h.m13474a(C3453ba.f9735a);
    }

    /* renamed from: a */
    public final void mo8740a(boolean z) {
        if (!z) {
            mo8747d().hide();
            mo8748e().hide();
            mo8749f().hide();
            mo8733a().hide();
            mo8758o().hide();
            LiveWidget p = mo8759p();
            if (p != null) {
                p.hide();
            }
            mo8754k().hide();
            C3561v vVar = this.f9675X;
            if (vVar == null) {
                C89219l.m154710a("mPreviewSlotHelper");
            }
            C3561v.C3562a aVar = vVar.f9876f;
            if (aVar != null) {
                aVar.mo8831a(false);
            }
            C3561v vVar2 = this.f9675X;
            if (vVar2 == null) {
                C89219l.m154710a("mPreviewSlotHelper");
            }
            C3561v.C3562a aVar2 = vVar2.f9877g;
            if (aVar2 != null) {
                aVar2.mo8831a(false);
            }
            C11279p.m20006a(mo8746d(R.id.afw));
            mo8741b().hide();
            mo8750g().hide();
            LiveWidget liveWidget = this.f9685e;
            if (liveWidget != null) {
                liveWidget.hide();
            }
            mo8757n().mo8896b();
            PreviewSubscriptionWidget previewSubscriptionWidget = this.f9683c;
            if (previewSubscriptionWidget != null) {
                previewSubscriptionWidget.hide();
            }
        } else if (this.f9671T || getView() == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_msg", this.f9671T ? "isFinished" : "view is null");
            C3868c.m9491a("ttlive_live_preview_show_widgets_fail", 1, hashMap);
        } else {
            m8847L();
            C11279p.m20017b(mo8746d(R.id.afw));
            mo8741b().show();
            mo8750g().show();
            mo8757n().mo8895a();
            DataChannel dataChannel = this.f9678a;
            if (dataChannel == null) {
                C89219l.m154710a("mDataChannel");
            }
            if (dataChannel.mo28318b(C3010ab.class) == null) {
                LiveWidget p2 = mo8759p();
                if (p2 != null) {
                    p2.show();
                }
                C3561v vVar3 = this.f9675X;
                if (vVar3 == null) {
                    C89219l.m154710a("mPreviewSlotHelper");
                }
                C3561v.C3562a aVar3 = vVar3.f9876f;
                if (aVar3 != null) {
                    aVar3.mo8831a(true);
                }
                C3561v vVar4 = this.f9675X;
                if (vVar4 == null) {
                    C89219l.m154710a("mPreviewSlotHelper");
                }
                C3561v.C3562a aVar4 = vVar4.f9877g;
                if (aVar4 != null) {
                    aVar4.mo8831a(true);
                }
                LiveWidget liveWidget2 = this.f9685e;
                if (liveWidget2 != null) {
                    liveWidget2.show();
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$aa */
    static final class C3423aa extends AbstractC89220m implements AbstractC89171a<PreviewCoverWidget> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9706a;

        static {
            Covode.recordClassIndex(3907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3423aa(C3421d dVar) {
            super(0);
            this.f9706a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewCoverWidget invoke() {
            return new PreviewCoverWidget(this.f9706a);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$ab */
    static final class C3424ab extends AbstractC89220m implements AbstractC89171a<PreviewDefinitionSelectionWidget> {

        /* renamed from: a */
        public static final C3424ab f9707a = new C3424ab();

        static {
            Covode.recordClassIndex(3908);
        }

        C3424ab() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewDefinitionSelectionWidget invoke() {
            return new PreviewDefinitionSelectionWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$ac */
    static final class C3425ac extends AbstractC89220m implements AbstractC89171a<PreviewFollowerWidget> {

        /* renamed from: a */
        public static final C3425ac f9708a = new C3425ac();

        static {
            Covode.recordClassIndex(3909);
        }

        C3425ac() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewFollowerWidget invoke() {
            return new PreviewFollowerWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$ad */
    static final class C3426ad extends AbstractC89220m implements AbstractC89171a<PreviewHelpWidget> {

        /* renamed from: a */
        public static final C3426ad f9709a = new C3426ad();

        static {
            Covode.recordClassIndex(3910);
        }

        C3426ad() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewHelpWidget invoke() {
            return new PreviewHelpWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$ae */
    static final class C3427ae extends AbstractC89220m implements AbstractC89171a<PreviewLiveModeWidget> {

        /* renamed from: a */
        public static final C3427ae f9710a = new C3427ae();

        static {
            Covode.recordClassIndex(3911);
        }

        C3427ae() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewLiveModeWidget invoke() {
            return new PreviewLiveModeWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$af */
    static final class C3428af extends AbstractC89220m implements AbstractC89171a<PreviewLoadEndWidget> {

        /* renamed from: a */
        public static final C3428af f9711a = new C3428af();

        static {
            Covode.recordClassIndex(3912);
        }

        C3428af() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewLoadEndWidget invoke() {
            return new PreviewLoadEndWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$ag */
    static final class C3429ag extends AbstractC89220m implements AbstractC89171a<PreviewReplayWidget> {

        /* renamed from: a */
        public static final C3429ag f9712a = new C3429ag();

        static {
            Covode.recordClassIndex(3913);
        }

        C3429ag() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewReplayWidget invoke() {
            return new PreviewReplayWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$ai */
    static final class C3431ai extends AbstractC89220m implements AbstractC89171a<PreviewSeeMoreDetailWidget> {

        /* renamed from: a */
        public static final C3431ai f9714a = new C3431ai();

        static {
            Covode.recordClassIndex(3915);
        }

        C3431ai() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewSeeMoreDetailWidget invoke() {
            return new PreviewSeeMoreDetailWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$at */
    static final class RunnableC3445at implements Runnable {

        /* renamed from: a */
        public static final RunnableC3445at f9726a = new RunnableC3445at();

        static {
            Covode.recordClassIndex(3929);
        }

        RunnableC3445at() {
        }

        public final void run() {
            C4217d.m10322e().mo9851c();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$bo */
    static final class C3467bo extends AbstractC89220m implements AbstractC89171a<HandlerC11626a> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9750a;

        static {
            Covode.recordClassIndex(3951);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3467bo(C3421d dVar) {
            super(0);
            this.f9750a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HandlerC11626a invoke() {
            return new HandlerC11626a(this.f9750a);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$o */
    static final class C3482o extends AbstractC89220m implements AbstractC89171a<PreviewSelectGameCategoryWidget> {

        /* renamed from: a */
        public static final C3482o f9773a = new C3482o();

        static {
            Covode.recordClassIndex(3966);
        }

        C3482o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewSelectGameCategoryWidget invoke() {
            return new PreviewSelectGameCategoryWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$r */
    static final class C3485r extends AbstractC89220m implements AbstractC89171a<PreviewLiveStudioPageWidget> {

        /* renamed from: a */
        public static final C3485r f9776a = new C3485r();

        static {
            Covode.recordClassIndex(3969);
        }

        C3485r() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewLiveStudioPageWidget invoke() {
            return new PreviewLiveStudioPageWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$s */
    static final class C3486s extends AbstractC89220m implements AbstractC89171a<PreviewLiveStudioTipsWidget> {

        /* renamed from: a */
        public static final C3486s f9777a = new C3486s();

        static {
            Covode.recordClassIndex(3970);
        }

        C3486s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewLiveStudioTipsWidget invoke() {
            return new PreviewLiveStudioTipsWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$v */
    static final class C3489v extends AbstractC89220m implements AbstractC89171a<PreviewApplyWidget> {

        /* renamed from: a */
        public static final C3489v f9780a = new C3489v();

        static {
            Covode.recordClassIndex(3973);
        }

        C3489v() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewApplyWidget invoke() {
            return new PreviewApplyWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$x */
    static final class C3492x extends AbstractC89220m implements AbstractC89171a<PreviewChangeOrientationWidget> {

        /* renamed from: a */
        public static final C3492x f9782a = new C3492x();

        static {
            Covode.recordClassIndex(3976);
        }

        C3492x() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewChangeOrientationWidget invoke() {
            return new PreviewChangeOrientationWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$z */
    static final class C3494z extends AbstractC89220m implements AbstractC89171a<PreviewCommonNotifyWidget> {

        /* renamed from: a */
        public static final C3494z f9784a = new C3494z();

        static {
            Covode.recordClassIndex(3978);
        }

        C3494z() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewCommonNotifyWidget invoke() {
            return new PreviewCommonNotifyWidget();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$ah */
    static final class C3430ah extends AbstractC89220m implements AbstractC89171a<PreviewReverseCameraWidget> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9713a;

        static {
            Covode.recordClassIndex(3914);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3430ah(C3421d dVar) {
            super(0);
            this.f9713a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewReverseCameraWidget invoke() {
            return new PreviewReverseCameraWidget(new C3519j(this.f9713a));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$ak */
    static final class C3433ak extends AbstractC89220m implements AbstractC89171a<PreviewShareWidget> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9716a;

        static {
            Covode.recordClassIndex(3917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3433ak(C3421d dVar) {
            super(0);
            this.f9716a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewShareWidget invoke() {
            return new PreviewShareWidget(this.f9716a.f9689i);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$ar */
    static final class RunnableC3443ar implements Runnable {

        /* renamed from: a */
        public static final RunnableC3443ar f9724a = new RunnableC3443ar();

        static {
            Covode.recordClassIndex(3927);
        }

        RunnableC3443ar() {
        }

        public final void run() {
            LivePerformanceManager.getInstance().monitorPerformance("create_live_preview");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$as */
    static final class RunnableC3444as implements Runnable {

        /* renamed from: a */
        public static final RunnableC3444as f9725a = new RunnableC3444as();

        static {
            Covode.recordClassIndex(3928);
        }

        RunnableC3444as() {
        }

        public final void run() {
            LivePerformanceManager.getInstance().initStartValue(1000);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.d$az */
    public static final class C3451az extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9732a;

        /* renamed from: b */
        final /* synthetic */ PrivacyCert f9733b;

        static {
            Covode.recordClassIndex(3935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3451az(C3421d dVar, PrivacyCert privacyCert) {
            super(0);
            this.f9732a = dVar;
            this.f9733b = privacyCert;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC11683e eVar = this.f9732a.f9690j;
            if (eVar != null) {
                eVar.mo8860b(this.f9733b);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.d$ba */
    public static final class C3453ba extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C3453ba f9735a = new C3453ba();

        static {
            Covode.recordClassIndex(3937);
        }

        C3453ba() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C4217d.m10322e().mo9851c();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.d$c */
    public static final class C3468c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9751a;

        /* renamed from: b */
        final /* synthetic */ PrivacyCert f9752b;

        static {
            Covode.recordClassIndex(3952);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3468c(C3421d dVar, PrivacyCert privacyCert) {
            super(0);
            this.f9751a = dVar;
            this.f9752b = privacyCert;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC11683e eVar = this.f9751a.f9690j;
            if (eVar != null) {
                eVar.mo8853a(this.f9752b);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$d */
    static final class C3469d extends AbstractC89220m implements AbstractC89171a<Context> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9753a;

        static {
            Covode.recordClassIndex(3953);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3469d(C3421d dVar) {
            super(0);
            this.f9753a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Context invoke() {
            return C4054a.m9853a(this.f9753a.getContext());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$p */
    static final class C3483p extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C3483p f9774a = new C3483p();

        static {
            Covode.recordClassIndex(3967);
        }

        C3483p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$q */
    static final class C3484q extends AbstractC89220m implements AbstractC89171a<C3527n> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9775a;

        static {
            Covode.recordClassIndex(3968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3484q(C3421d dVar) {
            super(0);
            this.f9775a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C3527n invoke() {
            return new C3527n(this.f9775a, new C3516g(this.f9775a));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$y */
    static final class C3493y extends AbstractC89220m implements AbstractC89171a<PreviewCloseWidget> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9783a;

        static {
            Covode.recordClassIndex(3977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3493y(C3421d dVar) {
            super(0);
            this.f9783a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewCloseWidget invoke() {
            return new PreviewCloseWidget(new C3518i(this.f9783a));
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11685f
    /* renamed from: A */
    public final String mo8726A() {
        String faceReshapeFilePath = EnumC3338p.INST.getFaceReshapeFilePath();
        C89219l.m154716b(faceReshapeFilePath, "");
        return faceReshapeFilePath;
    }

    @Override // com.bytedance.ies.sdk.datachannel.AbstractC17845e
    /* renamed from: h */
    public final DataChannel mo8509h() {
        DataChannel dataChannel = this.f9678a;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        return dataChannel;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11685f
    /* renamed from: z */
    public final String mo8769z() {
        String beautyFilePath = EnumC3338p.INST.getBeautyFilePath();
        C89219l.m154716b(beautyFilePath, "");
        return beautyFilePath;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$aj */
    static final class C3432aj extends AbstractC89220m implements AbstractC89171a<PreviewSettingWidget> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9715a;

        static {
            Covode.recordClassIndex(3916);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3432aj(C3421d dVar) {
            super(0);
            this.f9715a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewSettingWidget invoke() {
            AbstractC0952i childFragmentManager = this.f9715a.getChildFragmentManager();
            C89219l.m154716b(childFragmentManager, "");
            return new PreviewSettingWidget(childFragmentManager);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$al */
    static final class C3434al extends AbstractC89220m implements AbstractC89171a<PreviewStartLiveWidget> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9717a;

        static {
            Covode.recordClassIndex(3918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3434al(C3421d dVar) {
            super(0);
            this.f9717a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewStartLiveWidget invoke() {
            return new PreviewStartLiveWidget(this.f9717a.f9689i, new AbstractC89172b<Boolean, C89391z>(this.f9717a) {
                /* class com.bytedance.android.live.broadcast.preview.C3421d.C3434al.C34351 */

                static {
                    Covode.recordClassIndex(3919);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Boolean bool) {
                    boolean booleanValue = bool.booleanValue();
                    C3421d dVar = (C3421d) this.receiver;
                    dVar.f9696p = booleanValue;
                    if (booleanValue) {
                        C4217d.m10317a().mo9896b(dVar.f9699s);
                        C4217d.m10317a().mo9896b(dVar.mo8733a().f9912b);
                        C6201f.m13460c();
                        C3940j.m9594a().removeCallbacksAndMessages(null);
                    }
                    return C89391z.f203057a;
                }
            }, new C3520k(this.f9717a));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$an */
    static final class C3438an extends AbstractC89220m implements AbstractC89171a<PreviewTitleWidget> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9719a;

        static {
            Covode.recordClassIndex(3922);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3438an(C3421d dVar) {
            super(0);
            this.f9719a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewTitleWidget invoke() {
            Long l;
            User user = this.f9719a.f9689i;
            if (user != null) {
                l = Long.valueOf(user.getId());
            } else {
                l = null;
            }
            return new PreviewTitleWidget(l);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$ao */
    static final class C3439ao extends AbstractC89220m implements AbstractC89171a<LiveWidget> {

        /* renamed from: a */
        public static final C3439ao f9720a = new C3439ao();

        static {
            Covode.recordClassIndex(3923);
        }

        C3439ao() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveWidget invoke() {
            AbstractC3807b bVar = (AbstractC3807b) C6193a.m13435a(AbstractC3807b.class);
            if (bVar != null) {
                return bVar.getSelectDonationStickerWidget();
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$aw */
    static final class C3448aw implements C3561v.AbstractC3563b {

        /* renamed from: a */
        final /* synthetic */ C3421d f9729a;

        static {
            Covode.recordClassIndex(3932);
        }

        C3448aw(C3421d dVar) {
            this.f9729a = dVar;
        }

        @Override // com.bytedance.android.live.broadcast.preview.C3561v.AbstractC3563b
        /* renamed from: a */
        public final void mo8776a() {
            C3421d dVar = this.f9729a;
            dVar.mo8737a(dVar.mo8766w());
            C3421d dVar2 = this.f9729a;
            dVar2.mo8766w();
            dVar2.mo8768y();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$t */
    static final class C3487t extends AbstractC89220m implements AbstractC89171a<LiveWidget> {

        /* renamed from: a */
        public static final C3487t f9778a = new C3487t();

        static {
            Covode.recordClassIndex(3971);
        }

        C3487t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveWidget invoke() {
            AbstractC3807b bVar = (AbstractC3807b) C6193a.m13435a(AbstractC3807b.class);
            if (bVar != null) {
                return bVar.getSelectDonationStickerWidget();
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$w */
    static final class C3490w extends AbstractC89220m implements AbstractC89171a<PreviewBeautyWidget> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9781a;

        static {
            Covode.recordClassIndex(3974);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3490w(C3421d dVar) {
            super(0);
            this.f9781a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewBeautyWidget invoke() {
            C34911 r3 = new AbstractC89172b<Boolean, C89391z>(this.f9781a) {
                /* class com.bytedance.android.live.broadcast.preview.C3421d.C3490w.C34911 */

                static {
                    Covode.recordClassIndex(3975);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Boolean bool) {
                    ((C3421d) this.receiver).mo8740a(bool.booleanValue());
                    return C89391z.f203057a;
                }
            };
            AbstractC0952i childFragmentManager = this.f9781a.getChildFragmentManager();
            C89219l.m154716b(childFragmentManager, "");
            return new PreviewBeautyWidget(r3, childFragmentManager, new C3517h(this.f9781a));
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11685f
    /* renamed from: C */
    public final int mo8728C() {
        C6805b<Integer> bVar = AbstractC6804a.f17058i;
        C89219l.m154716b(bVar, "");
        Integer b = bVar.mo13068b();
        C89219l.m154716b(b, "");
        return b.intValue();
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11685f
    /* renamed from: E */
    public final void mo8730E() {
        mo8765v().mo8813a();
        C3051c.C3052a.m8359a("ttlive_page_hide").mo12633b("preview").mo12632a();
        C10095g.m18640h();
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (!this.f9671T) {
            mo8765v().mo8813a();
            this.f9673V.send();
        }
        super.onDestroyView();
        HashMap hashMap = this.f9681ac;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (!this.f9671T) {
            C3051c.C3052a.m8359a("ttlive_page_pause").mo12633b("preview").mo12632a();
            C10095g.m18640h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C3051c.C3052a.m8359a("ttlive_page_start").mo12633b("preview").mo12632a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (!this.f9671T) {
            C3051c.C3052a.m8359a("ttlive_page_stop").mo12633b("preview").mo12632a();
        }
    }

    /* renamed from: w */
    public final EnumC11728i mo8766w() {
        DataChannel dataChannel = this.f9678a;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        Object b = dataChannel.mo28318b(C3802x.class);
        if (b == null) {
            C89219l.m154715b();
        }
        return (EnumC11728i) b;
    }

    /* renamed from: x */
    public final void mo8767x() {
        ViewTreeObserver viewTreeObserver;
        View view = getView();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC3452b(this));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$am */
    static final class C3436am extends AbstractC89220m implements AbstractC89171a<PreviewStickerWidget> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9718a;

        static {
            Covode.recordClassIndex(3920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3436am(C3421d dVar) {
            super(0);
            this.f9718a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PreviewStickerWidget invoke() {
            FrameLayout frameLayout = (FrameLayout) this.f9718a.mo8746d(R.id.e87);
            C89219l.m154716b(frameLayout, "");
            return new PreviewStickerWidget(frameLayout, new AbstractC89172b<Boolean, C89391z>(this.f9718a) {
                /* class com.bytedance.android.live.broadcast.preview.C3421d.C3436am.C34371 */

                static {
                    Covode.recordClassIndex(3921);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Boolean bool) {
                    ((C3421d) this.receiver).mo8740a(bool.booleanValue());
                    return C89391z.f203057a;
                }
            }, new C3521l(this.f9718a));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$aq */
    static final class RunnableC3441aq implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3421d f9722a;

        static {
            Covode.recordClassIndex(3925);
        }

        RunnableC3441aq(C3421d dVar) {
            this.f9722a = dVar;
        }

        public final void run() {
            AbstractC2953a a = C6193a.m13435a(AbstractC4357d.class);
            C89219l.m154716b(a, "");
            ((AbstractC4357d) a).getGpuInfoFetcher().mo10105a(this.f9722a.getActivity(), this.f9722a.getView(), C34421.f9723a);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$e */
    static final class RunnableC3470e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3272o f9754a;

        static {
            Covode.recordClassIndex(3954);
        }

        RunnableC3470e(C3272o oVar) {
            this.f9754a = oVar;
        }

        public final void run() {
            String str;
            C3272o oVar = this.f9754a;
            String str2 = "";
            C89219l.m154721d(oVar, str2);
            C6497a b = C3051c.C3052a.m8360b("ttlive_fetch_room_info_all").mo12633b("preview");
            ImageModel imageModel = oVar.f9366a;
            if (!(imageModel == null || (str = imageModel.mUri) == null)) {
                str2 = str;
            }
            C6497a a = b.mo12629a("cover", str2).mo12629a("title", oVar.f9369d).mo12628a("cover_status", Long.valueOf(oVar.f9367b));
            a.f16147c = true;
            a.mo12632a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$f */
    static final class RunnableC3471f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3421d f9755a;

        static {
            Covode.recordClassIndex(3955);
        }

        RunnableC3471f(C3421d dVar) {
            this.f9755a = dVar;
        }

        public final void run() {
            String str;
            this.f9755a.f9695o = false;
            if (this.f9755a.f9693m > this.f9755a.f9694n) {
                str = "zoom_in";
            } else if (this.f9755a.f9693m < this.f9755a.f9694n) {
                str = "zoom_out";
            } else {
                str = "no_change";
            }
            C6501b.C6502a.m13948a("livesdk_zoom_in").mo12658d("live_take_page").mo12651a("hand_gesture", str).mo12655b();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$l */
    static final class C3477l extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ WidgetManager f9766a;

        /* renamed from: b */
        final /* synthetic */ C3421d f9767b;

        static {
            Covode.recordClassIndex(3961);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3477l(WidgetManager widgetManager, C3421d dVar) {
            super(0);
            this.f9766a = widgetManager;
            this.f9767b = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f9766a.load(R.id.cb8, this.f9767b.mo8755l());
            WidgetManager widgetManager = this.f9766a;
            PreviewLoadEndWidget previewLoadEndWidget = (PreviewLoadEndWidget) this.f9767b.f9687g.getValue();
            C34781 r1 = new AbstractC89171a<C89391z>(this) {
                /* class com.bytedance.android.live.broadcast.preview.C3421d.C3477l.C34781 */

                /* renamed from: a */
                final /* synthetic */ C3477l f9768a;

                static {
                    Covode.recordClassIndex(3962);
                }

                {
                    this.f9768a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f9768a.f9767b.mo8767x();
                    return C89391z.f203057a;
                }
            };
            C89219l.m154721d(r1, "");
            previewLoadEndWidget.f9969a = r1;
            widgetManager.load(R.id.avr, previewLoadEndWidget);
            return C89391z.f203057a;
        }
    }

    /* renamed from: J */
    private final boolean m8845J() {
        if (C11115u.m19743a().mo17915b() != null) {
            return false;
        }
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gkh);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
        this.f9671T = true;
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11685f
    /* renamed from: B */
    public final /* synthetic */ List mo8727B() {
        ArrayList arrayList = new ArrayList();
        for (T t : this.f9676Y.mo9890a()) {
            arrayList.add(new Pair(t.getName(), t.getFilterPath()));
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.f9671T) {
            C4017b.m9801c(C4017b.EnumC4018a.CreateStartLivePreview);
            C3051c.C3052a.m8359a("ttlive_page_resume").mo12633b("preview").mo12632a();
            C10095g.m18639g();
            C6204h.m13476a(RunnableC3444as.f9725a);
            C6204h.m13476a(RunnableC3445at.f9726a);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$av */
    static final class RunnableC3447av implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3421d f9728a;

        static {
            Covode.recordClassIndex(3931);
        }

        RunnableC3447av(C3421d dVar) {
            this.f9728a = dVar;
        }

        public final void run() {
            C3527n v = this.f9728a.mo8765v();
            ActivityC0945e eVar = v.f9826a;
            if (eVar != null && !eVar.isFinishing() && LiveNewEffectPanelSetting.INSTANCE.useOldPanel()) {
                if (EnumC3338p.INST.isLoadedRes()) {
                    v.mo8814b();
                    return;
                }
                IHostPlugin iHostPlugin = (IHostPlugin) C6193a.m13435a(IHostPlugin.class);
                if (iHostPlugin != null && !iHostPlugin.isFull()) {
                    iHostPlugin.preload(EnumC8917a.LiveResource.getPackageName());
                }
                if (v.f9829d == null && v.f9827b != null && v.f9830e.isViewValid()) {
                    DialogC9146a.C9147a aVar = new DialogC9146a.C9147a(v.f9827b);
                    aVar.f22146a = new C3527n.DialogInterface$OnDismissListenerC3529b(v);
                    v.f9829d = aVar.mo15240a();
                    DialogC9146a aVar2 = v.f9829d;
                    if (aVar2 != null) {
                        C11279p.m19997a(aVar2);
                    }
                }
                EnumC3338p.INST.isLoadedRes.observe(v.f9830e, new C3527n.C3530c(v));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$ay */
    static final class RunnableC3450ay implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3421d f9731a;

        static {
            Covode.recordClassIndex(3934);
        }

        RunnableC3450ay(C3421d dVar) {
            this.f9731a = dVar;
        }

        public final void run() {
            String string;
            JSONObject a;
            String string2;
            EnumC11728i iVar;
            C3421d dVar = this.f9731a;
            try {
                Bundle arguments = dVar.getArguments();
                if (arguments != null && (string = arguments.getString("sourceParams")) != null && (a = C3421d.m8849a(string)) != null && (string2 = a.getString("child_tab")) != null) {
                    PreviewLiveModeWidget l = dVar.mo8755l();
                    int hashCode = string2.hashCode();
                    if (hashCode != -416447130) {
                        if (hashCode != 109824) {
                            if (hashCode == 1787034050) {
                                if (string2.equals("livestudio")) {
                                    iVar = EnumC11728i.LIVE_STUDIO;
                                    l.mo8887a(iVar, true);
                                }
                            }
                        } else if (string2.equals("obs")) {
                            iVar = EnumC11728i.THIRD_PARTY;
                            l.mo8887a(iVar, true);
                        }
                    } else if (string2.equals("screenshot")) {
                        iVar = EnumC11728i.SCREEN_RECORD;
                        l.mo8887a(iVar, true);
                    }
                    iVar = EnumC11728i.VIDEO;
                    l.mo8887a(iVar, true);
                }
            } catch (Exception e) {
                C3854a.m9453a(6, "LiveBroadcastPreviewFragment", "checkDefaultTab(). exception=".concat(String.valueOf(e)));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$b */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC3452b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C3421d f9734a;

        static {
            Covode.recordClassIndex(3936);
        }

        public final void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver;
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f9734a.mo8746d(R.id.dqa);
            C89219l.m154716b(constraintLayout, "");
            int height = constraintLayout.getHeight();
            ScrollView scrollView = (ScrollView) this.f9734a.mo8746d(R.id.dq_);
            C89219l.m154716b(scrollView, "");
            if (height <= scrollView.getHeight()) {
                C11279p.m20006a(this.f9734a.mo8746d(R.id.bwl));
            } else {
                C11279p.m20017b(this.f9734a.mo8746d(R.id.bwl));
                C6501b.C6502a.m13948a("livesdk_more_icon_show").mo12643a(C3421d.m8848a(this.f9734a)).mo12658d("live_take_page").mo12655b();
            }
            View view = this.f9734a.getView();
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC3452b(C3421d dVar) {
            this.f9734a = dVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$h */
    static final class C3473h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ WidgetManager f9758a;

        /* renamed from: b */
        final /* synthetic */ C3421d f9759b;

        static {
            Covode.recordClassIndex(3957);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3473h(WidgetManager widgetManager, C3421d dVar) {
            super(0);
            this.f9758a = widgetManager;
            this.f9759b = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f9758a.load(R.id.afy, this.f9759b.mo8741b(), C6203g.m13464a());
            this.f9758a.load(R.id.fd0, this.f9759b.mo8759p());
            this.f9758a.load(R.id.cvr, this.f9759b.mo8760q());
            if (LiveGameCategoryEntranceSetting.INSTANCE.shouldShow()) {
                this.f9758a.load(R.id.du_, this.f9759b.mo8762s());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$j */
    static final class C3475j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ WidgetManager f9762a;

        /* renamed from: b */
        final /* synthetic */ C3421d f9763b;

        static {
            Covode.recordClassIndex(3959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3475j(WidgetManager widgetManager, C3421d dVar) {
            super(0);
            this.f9762a = widgetManager;
            this.f9763b = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f9762a.load(R.id.aiv, this.f9763b.mo8761r());
            this.f9762a.load(R.id.rj, this.f9763b.mo8733a());
            this.f9762a.load(R.id.dhx, this.f9763b.mo8757n());
            this.f9762a.load(R.id.e9p, this.f9763b.mo8758o());
            this.f9762a.load(R.id.ejr, this.f9763b.mo8753j());
            return C89391z.f203057a;
        }
    }

    /* renamed from: K */
    private final void m8846K() {
        ImageModel imageModel;
        C11291z zVar = new C11291z(5, ((float) C13628n.m24504a(getContext())) / ((float) C13628n.m24521b(getContext())));
        User user = this.f9689i;
        ImageModel imageModel2 = null;
        if (user != null) {
            imageModel = user.getAvatarLarge();
        } else {
            imageModel = null;
        }
        if (imageModel != null) {
            HSImageView hSImageView = (HSImageView) mo8746d(R.id.dds);
            User user2 = this.f9689i;
            if (user2 != null) {
                imageModel2 = user2.getAvatarLarge();
            }
            C3941k.m9604a(hSImageView, imageModel2, zVar);
            return;
        }
        C24262c cVar = (C24262c) mo8746d(R.id.dds);
        C89219l.m154716b(cVar, "");
        C24185e b = C24182c.m45843b();
        C24639c a = C24639c.m47149a(C24134g.m45734a((int) R.drawable.bxm));
        a.f58560k = zVar;
        b.f57299c = (REQUEST) a.mo40483a();
        C24262c cVar2 = (C24262c) mo8746d(R.id.dds);
        C89219l.m154716b(cVar2, "");
        b.f57309m = cVar2.getController();
        cVar.setController(b.mo39827e());
    }

    /* renamed from: L */
    private final void m8847L() {
        mo8747d().show();
        mo8748e().show();
        mo8733a().show();
        mo8758o().show();
        mo8754k().show();
        DataChannel dataChannel = this.f9678a;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        if (dataChannel.mo28318b(C3010ab.class) == null) {
            LiveWidget p = mo8759p();
            if (p != null) {
                p.show();
            }
            C3561v vVar = this.f9675X;
            if (vVar == null) {
                C89219l.m154710a("mPreviewSlotHelper");
            }
            C3561v.C3562a aVar = vVar.f9876f;
            if (aVar != null) {
                aVar.mo8831a(true);
            }
            C3561v vVar2 = this.f9675X;
            if (vVar2 == null) {
                C89219l.m154710a("mPreviewSlotHelper");
            }
            C3561v.C3562a aVar2 = vVar2.f9877g;
            if (aVar2 != null) {
                aVar2.mo8831a(true);
            }
            LiveWidget liveWidget = this.f9685e;
            if (liveWidget != null) {
                liveWidget.show();
            }
        }
        mo8749f().show();
        m8851b(mo8766w());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final void mo8732G() {
        boolean z;
        DataChannel dataChannel = this.f9678a;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        Object b = dataChannel.mo28318b(C3802x.class);
        if (b == null) {
            C89219l.m154715b();
        }
        DataChannel dataChannel2 = this.f9678a;
        if (dataChannel2 == null) {
            C89219l.m154710a("mDataChannel");
        }
        C3272o oVar = (C3272o) dataChannel2.mo28318b(C9094df.class);
        if (oVar != null) {
            if (oVar.mo8625a() || b == EnumC11728i.SCREEN_RECORD) {
                z = true;
            } else {
                z = false;
            }
            int i = -1;
            if (z) {
                ConstraintLayout constraintLayout = (ConstraintLayout) mo8746d(R.id.b2q);
                LiveWidget liveWidget = this.f9685e;
                if (liveWidget != null) {
                    i = liveWidget.getViewId();
                }
                C11279p.m20009a(constraintLayout, i, C3966y.m9667d(R.dimen.xc));
                return;
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) mo8746d(R.id.b2q);
            LiveWidget liveWidget2 = this.f9685e;
            if (liveWidget2 != null) {
                i = liveWidget2.getViewId();
            }
            C11279p.m20009a(constraintLayout2, i, 0);
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataChannel dataChannel = this.f9678a;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        dataChannel.mo28316b(this);
        this.f9676Y.mo9896b(this.f9699s);
        C4217d.m10322e().mo9850b(this.f9679aa);
        if (!this.f9696p) {
            C4217d.m10322e().mo9848b();
            this.f9676Y.mo9894b();
            C10095g.m18641i();
            C6201f.m13460c();
            C3940j.m9594a().removeCallbacksAndMessages(null);
            C2690b.m7786a();
            ((AbstractC5843h) C6193a.m13435a(AbstractC5843h.class)).releaseToolbarView();
        }
        m8843H().removeCallbacksAndMessages(null);
        C3241b.f9296a = null;
        C3051c.C3052a.m8359a("ttlive_page_destroy").mo12633b("preview").mo12632a();
    }

    /* renamed from: y */
    public final void mo8768y() {
        Integer num;
        PreviewSubscriptionWidget previewSubscriptionWidget;
        C0550b bVar = new C0550b();
        bVar.mo2451a((ConstraintLayout) mo8746d(R.id.dqa));
        bVar.mo2446a(mo8748e().getViewId(), 3);
        int viewId = mo8748e().getViewId();
        C3561v vVar = this.f9675X;
        if (vVar == null) {
            C89219l.m154710a("mPreviewSlotHelper");
        }
        C3561v.C3562a aVar = vVar.f9877g;
        if ((aVar == null || (num = aVar.mo8826a()) == null) && ((previewSubscriptionWidget = this.f9683c) == null || (num = Integer.valueOf(previewSubscriptionWidget.getViewId())) == null)) {
            num = Integer.valueOf(mo8749f().getViewId());
        }
        C89219l.m154716b(num, "");
        bVar.mo2449a(viewId, 3, num.intValue(), 4, C3966y.m9653a(16.0f));
        bVar.mo2454b((ConstraintLayout) mo8746d(R.id.dqa));
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$i */
    static final class C3474i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ WidgetManager f9760a;

        /* renamed from: b */
        final /* synthetic */ C3421d f9761b;

        static {
            Covode.recordClassIndex(3958);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3474i(WidgetManager widgetManager, C3421d dVar) {
            super(0);
            this.f9760a = widgetManager;
            this.f9761b = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f9760a.load(R.id.cbx, this.f9761b.mo8763t());
            this.f9760a.load(R.id.dto, this.f9761b.mo8752i());
            this.f9760a.load(R.id.a7a, (PreviewCloseWidget) this.f9761b.f9682b.getValue());
            this.f9760a.load(R.id.dww, this.f9761b.mo8748e());
            this.f9760a.load(R.id.djh, this.f9761b.mo8747d());
            this.f9760a.load(R.id.beu, this.f9761b.mo8745c());
            this.f9760a.load(R.id.dz9, this.f9761b.mo8749f());
            if (User.sSubPermission) {
                C3421d dVar = this.f9761b;
                AbstractC0952i childFragmentManager = this.f9761b.getChildFragmentManager();
                C89219l.m154716b(childFragmentManager, "");
                dVar.f9683c = new PreviewSubscriptionWidget(childFragmentManager);
                this.f9760a.load(R.id.ear, this.f9761b.f9683c);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$k */
    static final class C3476k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ WidgetManager f9764a;

        /* renamed from: b */
        final /* synthetic */ C3421d f9765b;

        static {
            Covode.recordClassIndex(3960);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3476k(WidgetManager widgetManager, C3421d dVar) {
            super(0);
            this.f9764a = widgetManager;
            this.f9765b = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f9764a.load(R.id.e6p, this.f9765b.mo8750g());
            if (RemoveOnlineFollowersSetting.INSTANCE.show()) {
                this.f9764a.load(R.id.b7b, this.f9765b.mo8754k());
            }
            this.f9764a.load(R.id.ko, (PreviewApplyWidget) this.f9765b.f9684d.getValue());
            this.f9764a.load(R.id.a3t, this.f9765b.mo8756m());
            this.f9764a.load(R.id.bdi, this.f9765b.f9685e);
            this.f9764a.load(R.id.cvh, (PreviewCommonNotifyWidget) this.f9765b.f9698r.getValue());
            if (LiveObsBroadcastGuideStrategySetting.INSTANCE.getValue() != 0) {
                this.f9765b.f9686f = new ObsBroadcastGuideWidget();
                this.f9764a.load(R.id.cvp, this.f9765b.f9686f);
            }
            this.f9764a.load(R.id.cby, this.f9765b.mo8764u());
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11685f
    /* renamed from: D */
    public final void mo8729D() {
        String str;
        int i = 1;
        DataChannelGlobal.f42558d.mo28321a(C9035bb.class, true);
        if (LiveResumeLiveSetting.INSTANCE.resumeLiveEnabled()) {
            AbstractC5781n.C5782a aVar = new AbstractC5781n.C5782a((HandlerC11626a) this.f9677Z.getValue(), mo8766w());
            aVar.f14621h = 40;
            ((RoomRetrofitApi) C5805e.m12718a().mo11572a(RoomRetrofitApi.class)).continuePreviousRoom().mo143271a(new C11191f()).mo143254a(new C7324u(aVar), new C7325v(aVar));
        }
        if (this.f9678a != null) {
            if (C11729j.m20685b(mo8766w())) {
                mo8739a(PrivacyCert.Builder.Companion.with("bpea-598").usage("").tag("[Live Preview] open camera when live mode is video").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            } else {
                mo8743b(PrivacyCert.Builder.Companion.with("bpea-603").usage("").tag("[Live Preview] close camera when live mode is not video").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            }
        }
        C3051c.C3052a.m8359a("ttlive_page_show").mo12633b("preview").mo12632a();
        DataChannel dataChannel = this.f9678a;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("hashtag_id") || !arguments.containsKey("hashtag_title")) {
            C6805b<Boolean> bVar = AbstractC6804a.f17051cy;
            C89219l.m154716b(bVar, "");
            Boolean a = bVar.mo13066a();
            C89219l.m154716b(a, "");
            if (!a.booleanValue()) {
                i = 0;
            }
        } else {
            i = 2;
        }
        C6501b a2 = C6519c.m13965a(C6501b.C6502a.m13948a("livesdk_pm_live_takepage_show").mo12654b("live_take").mo12656c("show").mo12658d("live_take_page"), dataChannel);
        String str2 = null;
        if (arguments != null) {
            str = arguments.getString("request_from");
        } else {
            str = null;
        }
        if (arguments != null) {
            str2 = arguments.getString("enter_from");
        }
        a2.mo12651a("enter_from", C3558t.m8951a(str, str2)).mo12645a("has_ever_set_hashtag", i).mo12655b();
        C10095g.m18639g();
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$u */
    public static final class C3488u implements AbstractC4170f.AbstractC4171a {

        /* renamed from: a */
        final /* synthetic */ C3421d f9779a;

        static {
            Covode.recordClassIndex(3972);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3488u(C3421d dVar) {
            this.f9779a = dVar;
        }

        @Override // com.bytedance.android.live.effect.api.AbstractC4170f.AbstractC4171a
        /* renamed from: a */
        public final void mo8671a(FilterModel filterModel, float f) {
            C89219l.m154721d(filterModel, "");
            AbstractC11683e eVar = this.f9779a.f9690j;
            if (eVar != null) {
                filterModel.getFilterId();
                eVar.mo8864d(f);
            }
        }

        @Override // com.bytedance.android.live.effect.api.AbstractC4170f.AbstractC4171a
        /* renamed from: a */
        public final void mo8670a(int i, boolean z, boolean z2) {
            AbstractC11683e eVar = this.f9779a.f9690j;
            if (eVar != null) {
                eVar.mo8849a(i);
            }
        }
    }

    /* renamed from: a */
    static JSONObject m8849a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11685f
    /* renamed from: c */
    public final float mo8744c(int i) {
        return this.f9676Y.mo9889a(i);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$bf */
    static final class C3458bf extends AbstractC89220m implements AbstractC89172b<EnumC11728i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9740a;

        static {
            Covode.recordClassIndex(3942);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3458bf(C3421d dVar) {
            super(1);
            this.f9740a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC11728i iVar) {
            EnumC11728i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            this.f9740a.mo8738a(iVar2, false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$bg */
    static final class C3459bg extends AbstractC89220m implements AbstractC89172b<EnumC11728i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9741a;

        static {
            Covode.recordClassIndex(3943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3459bg(C3421d dVar) {
            super(1);
            this.f9741a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC11728i iVar) {
            EnumC11728i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            this.f9741a.mo8738a(iVar2, true);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ DataChannel m8848a(C3421d dVar) {
        DataChannel dataChannel = dVar.f9678a;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        return dataChannel;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$ap */
    static final class C3440ap extends AbstractC89220m implements AbstractC89172b<Widget, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9721a;

        static {
            Covode.recordClassIndex(3924);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3440ap(C3421d dVar) {
            super(1);
            this.f9721a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Widget widget) {
            Widget widget2 = widget;
            C3421d dVar = this.f9721a;
            if (widget2 instanceof PreviewLiveModeWidget) {
                widget2.contentView.post(new RunnableC3450ay(dVar));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$bc */
    static final class C3455bc<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C3455bc f9737a = new C3455bc();

        static {
            Covode.recordClassIndex(3939);
        }

        C3455bc() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154716b(th, "");
            C89219l.m154721d(th, "");
            C6497a b = C3049b.C3050a.m8358b("ttlive_fetch_room_info_all", th).mo12633b("preview");
            b.f16149e = true;
            b.mo12632a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$bd */
    static final class C3456bd<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3421d f9738a;

        static {
            Covode.recordClassIndex(3940);
        }

        C3456bd(C3421d dVar) {
            this.f9738a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5832d dVar = (C5832d) obj;
            if (dVar != null) {
                DataChannel a = C3421d.m8848a(this.f9738a);
                Map<String, C3263i.C3264a> map = ((C3263i) dVar.data).f9341a;
                C89219l.m154716b(map, "");
                a.mo28315b(C3804z.class, map);
            }
        }
    }

    /* renamed from: b */
    public final void mo8743b(PrivacyCert privacyCert) {
        C6204h.m13474a(new C3468c(this, privacyCert));
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(m8844I());
        C89219l.m154716b(cloneInContext, "");
        return cloneInContext;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$bi */
    static final class C3461bi extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9743a;

        static {
            Covode.recordClassIndex(3945);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3461bi(C3421d dVar) {
            super(1);
            this.f9743a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (!bool.booleanValue() || (!C11729j.m20685b(this.f9743a.mo8766w()) && !C11729j.m20688e(this.f9743a.mo8766w()))) {
                this.f9743a.mo8754k().hide();
            } else {
                this.f9743a.mo8754k().show();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$n */
    static final class C3480n implements AbstractC11683e.AbstractC11684a {

        /* renamed from: a */
        final /* synthetic */ C3421d f9770a;

        static {
            Covode.recordClassIndex(3964);
        }

        C3480n(C3421d dVar) {
            this.f9770a = dVar;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e.AbstractC11684a
        /* renamed from: a */
        public final void mo8788a(final int i) {
            ActivityC0945e activity;
            if (this.f9770a.f9691k && System.currentTimeMillis() - this.f9770a.f9692l > 100) {
                this.f9770a.f9692l = System.currentTimeMillis();
                if (C11729j.m20685b(this.f9770a.mo8766w()) && (activity = this.f9770a.getActivity()) != null) {
                    activity.runOnUiThread(new Runnable(this) {
                        /* class com.bytedance.android.live.broadcast.preview.C3421d.C3480n.RunnableC34811 */

                        /* renamed from: a */
                        final /* synthetic */ C3480n f9771a;

                        static {
                            Covode.recordClassIndex(3965);
                        }

                        {
                            this.f9771a = r1;
                        }

                        public final void run() {
                            int i;
                            LinearLayout linearLayout = (LinearLayout) this.f9771a.f9770a.mo8746d(R.id.cdf);
                            if (linearLayout != null) {
                                if (i == 0) {
                                    i = 0;
                                } else {
                                    i = 8;
                                }
                                linearLayout.setVisibility(i);
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$be */
    static final class C3457be extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9739a;

        static {
            Covode.recordClassIndex(3941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3457be(C3421d dVar) {
            super(1);
            this.f9739a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                this.f9739a.mo8743b(PrivacyCert.Builder.Companion.with("bpea-600").usage("").tag("[Live Preview] close camera when recerving event").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            } else if (C11729j.m20685b(this.f9739a.mo8766w())) {
                this.f9739a.mo8739a(PrivacyCert.Builder.Companion.with("bpea-599").usage("").tag("[Live Preview] open camera when recerving event").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$bj */
    static final class C3462bj extends AbstractC89220m implements AbstractC89172b<C3272o, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9744a;

        static {
            Covode.recordClassIndex(3946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3462bj(C3421d dVar) {
            super(1);
            this.f9744a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C3272o oVar) {
            C3272o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            if (!LiveGameCategoryEntranceSetting.INSTANCE.shouldShow() || !oVar2.f9383r || (!C11729j.m20689f(this.f9744a.mo8766w()) && !C11729j.m20688e(this.f9744a.mo8766w()))) {
                this.f9744a.mo8762s().hide();
            } else {
                this.f9744a.mo8762s().show();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private final void m8851b(EnumC11728i iVar) {
        int viewId;
        if (iVar != null) {
            C0550b bVar = new C0550b();
            bVar.mo2451a((ConstraintLayout) mo8746d(R.id.dqa));
            bVar.mo2446a(mo8749f().getViewId(), 3);
            int viewId2 = mo8749f().getViewId();
            if (C3514e.f9811a[iVar.ordinal()] != 1) {
                viewId = mo8758o().getViewId();
            } else {
                viewId = mo8756m().getViewId();
            }
            bVar.mo2449a(viewId2, 3, viewId, 4, C3966y.m9653a(16.0f));
            bVar.mo2454b((ConstraintLayout) mo8746d(R.id.dqa));
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11685f
    /* renamed from: a */
    public final void mo8734a(float f) {
        if (!this.f9695o) {
            this.f9694n = f;
            this.f9695o = true;
        }
        this.f9693m = f;
        Handler H = m8843H();
        Runnable runnable = this.f9674W;
        if (runnable == null) {
            C89219l.m154710a("mZoomScaleReportRunnable");
        }
        H.removeCallbacks(runnable);
        Handler H2 = m8843H();
        Runnable runnable2 = this.f9674W;
        if (runnable2 == null) {
            C89219l.m154710a("mZoomScaleReportRunnable");
        }
        H2.postDelayed(runnable2, 3000);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        if (!this.f9671T) {
            ActivityC0945e activity = getActivity();
            if (!(activity == null || (window = activity.getWindow()) == null)) {
                window.setSoftInputMode(48);
            }
            C6204h.m13476a(new RunnableC3441aq(this));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
            C3868c.m9494a("ttlive_enter_preview_page_duration", System.currentTimeMillis() - this.f9672U, jSONObject);
            C6501b.C6502a.m13948a("livesdk_broadcast_duration").mo12646a("preview_create_launch", System.currentTimeMillis() - this.f9672U).mo12655b();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$ax */
    static final class View$OnClickListenerC3449ax implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3421d f9730a;

        static {
            Covode.recordClassIndex(3933);
        }

        View$OnClickListenerC3449ax(C3421d dVar) {
            this.f9730a = dVar;
        }

        public final void onClick(View view) {
            boolean z;
            C3421d dVar = this.f9730a;
            if (!dVar.f9697q) {
                ((ScrollView) this.f9730a.mo8746d(R.id.dq_)).fullScroll(130);
                ((ImageView) this.f9730a.mo8746d(R.id.bwl)).setImageDrawable(C3966y.m9665c(2131234518));
                ScrollView scrollView = (ScrollView) this.f9730a.mo8746d(R.id.dq_);
                C89219l.m154716b(scrollView, "");
                ViewGroup.LayoutParams layoutParams = scrollView.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
                aVar.bottomMargin = C3966y.m9653a(64.0f);
                ScrollView scrollView2 = (ScrollView) this.f9730a.mo8746d(R.id.dq_);
                C89219l.m154716b(scrollView2, "");
                scrollView2.setLayoutParams(aVar);
                C3558t.m8953a(C3421d.m8848a(this.f9730a), "unfold");
                z = true;
            } else {
                ((ScrollView) this.f9730a.mo8746d(R.id.dq_)).fullScroll(33);
                ((ImageView) this.f9730a.mo8746d(R.id.bwl)).setImageDrawable(C3966y.m9665c(2131234493));
                ScrollView scrollView3 = (ScrollView) this.f9730a.mo8746d(R.id.dq_);
                C89219l.m154716b(scrollView3, "");
                ViewGroup.LayoutParams layoutParams2 = scrollView3.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.C0547a aVar2 = (ConstraintLayout.C0547a) layoutParams2;
                aVar2.bottomMargin = C3966y.m9653a(120.0f);
                ScrollView scrollView4 = (ScrollView) this.f9730a.mo8746d(R.id.dq_);
                C89219l.m154716b(scrollView4, "");
                scrollView4.setLayoutParams(aVar2);
                C3558t.m8953a(C3421d.m8848a(this.f9730a), "fold");
                z = false;
            }
            dVar.f9697q = z;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$bh */
    static final class C3460bh extends AbstractC89220m implements AbstractC89172b<C3269m, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3421d f9742a;

        static {
            Covode.recordClassIndex(3944);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3460bh(C3421d dVar) {
            super(1);
            this.f9742a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C3269m mVar) {
            C3269m mVar2 = mVar;
            C89219l.m154721d(mVar2, "");
            C3421d dVar = this.f9742a;
            if (dVar.f9688h != EnumC11728i.LIVE_STUDIO) {
                DataChannel dataChannel = dVar.f9678a;
                if (dataChannel == null) {
                    C89219l.m154710a("mDataChannel");
                }
                C6501b.C6502a.m13948a("livesdk_live_banned_toast_show").mo12643a(dataChannel).mo12656c("show").mo12655b();
                Context context = dVar.getContext();
                if (context != null) {
                    C89219l.m154716b(context, "");
                    DataChannel dataChannel2 = dVar.f9678a;
                    if (dataChannel2 == null) {
                        C89219l.m154710a("mDataChannel");
                    }
                    C89219l.m154721d(context, "");
                    C89219l.m154721d(dataChannel2, "");
                    C89219l.m154721d(mVar2, "");
                    SpannableString spannableString = new SpannableString(mVar2.f9358a + C3546q.m8947a());
                    C3546q.C3548b bVar = new C3546q.C3548b(spannableString);
                    spannableString.setSpan(new AbsoluteSizeSpan(C3966y.m9653a(12.0f)), 0, spannableString.length(), 17);
                    bVar.mo8820a(new C3546q.C3547a(context, mVar2, dataChannel2));
                    bVar.mo8820a(new AbsoluteSizeSpan(C3966y.m9653a(12.0f)));
                    bVar.mo8820a(new FontSpan(C17303d.f41573g));
                    dataChannel2.mo28320c(C3228f.class, new C3267k(0, EnumC3268l.NORMAL_BLOCK, spannableString));
                }
                dVar.mo8757n().hide();
                LiveWidget p = dVar.mo8759p();
                if (p != null) {
                    p.hide();
                }
                LiveWidget q = dVar.mo8760q();
                if (q != null) {
                    q.hide();
                }
                ObsBroadcastGuideWidget obsBroadcastGuideWidget = dVar.f9686f;
                if (obsBroadcastGuideWidget != null) {
                    obsBroadcastGuideWidget.hide();
                }
                LiveWidget liveWidget = dVar.f9685e;
                if (liveWidget != null) {
                    liveWidget.hide();
                }
                dVar.mo8762s().hide();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11685f
    /* renamed from: a */
    public final void mo8735a(int i) {
        C6805b<Integer> bVar = AbstractC6804a.f17058i;
        C89219l.m154716b(bVar, "");
        bVar.mo13069b(Integer.valueOf(i));
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11685f
    /* renamed from: b */
    public final void mo8742b(int i) {
        String str;
        Dialog dialog;
        if (isAdded()) {
            Fragment a = getChildFragmentManager().mo3551a("LiveBeautyFilterDialogFragment");
            if (!(a instanceof DialogInterface$OnCancelListenerC0944d)) {
                a = null;
            }
            DialogInterface$OnCancelListenerC0944d dVar = (DialogInterface$OnCancelListenerC0944d) a;
            if (!(dVar == null || (dialog = dVar.getDialog()) == null || !dialog.isShowing())) {
                return;
            }
        }
        C6805b<Integer> bVar = AbstractC6804a.f16886O;
        C89219l.m154716b(bVar, "");
        Integer a2 = bVar.mo13066a();
        if (a2 == null || a2.intValue() != i) {
            List<FilterModel> a3 = this.f9676Y.mo9890a();
            DataChannel dataChannel = this.f9678a;
            if (dataChannel == null) {
                C89219l.m154710a("mDataChannel");
            }
            C89219l.m154721d(a3, "");
            AbstractC4167d g = C4217d.m10324g();
            if (i < a3.size()) {
                str = a3.get(i).getFilterId();
            } else {
                str = "";
            }
            C89219l.m154716b(str, "");
            g.mo9876a(dataChannel, false, str, false, i + 1);
            C6805b<Integer> bVar2 = AbstractC6804a.f16886O;
            C89219l.m154716b(bVar2, "");
            C6806c.m14603a(bVar2, Integer.valueOf(i));
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p679c.HandlerC11626a.AbstractC11627a
    public final void handleMsg(Message message) {
        if (message != null && message.what == 40) {
            Room room = null;
            if (message.obj instanceof Room) {
                Object obj = message.obj;
                if (obj instanceof Room) {
                    room = obj;
                }
                Room room2 = room;
                DataChannelGlobal.f42558d.mo28321a(C9009ac.class, room2);
                DialogC9148b.C9149a b = new DialogC9148b.C9149a(getContext()).mo15243a(R.string.drc).mo15248b(R.string.dr_).mo15244a(R.string.dra, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3463bk(this, room2), false).mo15249b(R.string.drb, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3464bl(this), false);
                b.f22256m = false;
                b.mo15247a().show();
                DataChannel dataChannel = this.f9678a;
                if (dataChannel == null) {
                    C89219l.m154710a("mDataChannel");
                }
                C3558t.m8957b("show", dataChannel);
            } else if (message.obj instanceof C2912a) {
                Object obj2 = message.obj;
                if (obj2 instanceof C2912a) {
                    room = obj2;
                }
                C2908a aVar = room;
                if (aVar != null && aVar.getErrorCode() == 30005 && getContext() != null) {
                    DataChannel dataChannel2 = this.f9678a;
                    if (dataChannel2 == null) {
                        C89219l.m154710a("mDataChannel");
                    }
                    C3558t.m8955a("show", dataChannel2);
                    DialogC9148b.C9149a b2 = new DialogC9148b.C9149a(getContext()).mo15243a(R.string.e5o).mo15248b(R.string.e5p).mo15244a(R.string.dzt, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3465bm(this), false).mo15249b(R.string.eft, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3466bn(this), false);
                    b2.f22256m = false;
                    b2.mo15247a().show();
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$bb */
    static final class C3454bb<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3421d f9736a;

        static {
            Covode.recordClassIndex(3938);
        }

        C3454bb(C3421d dVar) {
            this.f9736a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            ActivityC0945e a;
            Hashtag hashtag;
            String str;
            Long l;
            C3421d dVar = this.f9736a;
            C3272o oVar = (C3272o) ((C5832d) obj).data;
            if (oVar != null) {
                C6203g.m13466b(new RunnableC3470e(oVar));
                DataChannel dataChannel = dVar.f9678a;
                if (dataChannel == null) {
                    C89219l.m154710a("mDataChannel");
                }
                String str2 = oVar.f9381p.f9340b;
                C89219l.m154716b(str2, "");
                boolean z2 = true;
                if (str2.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                long j = 0;
                if (!z || oVar.f9381p.f9339a <= 0) {
                    z2 = false;
                }
                dataChannel.mo28315b(C3752w.class, Boolean.valueOf(z2));
                DataChannel dataChannel2 = dVar.f9678a;
                if (dataChannel2 == null) {
                    C89219l.m154710a("mDataChannel");
                }
                dataChannel2.mo28315b(C9094df.class, oVar);
                C3257d dVar2 = oVar.f9376k;
                if (dVar2 != null && dVar2.f9320b) {
                    DataChannel dataChannel3 = dVar.f9678a;
                    if (dataChannel3 == null) {
                        C89219l.m154710a("mDataChannel");
                    }
                    dataChannel3.mo28315b(C3010ab.class, new C3269m(dVar2.f9319a, 0));
                }
                dVar.mo8732G();
                Hashtag hashtag2 = oVar.f9380o;
                if (LiveHashTagAnchorShowEntrance.INSTANCE.getValue()) {
                    DataChannel dataChannel4 = dVar.f9678a;
                    if (dataChannel4 == null) {
                        C89219l.m154710a("mDataChannel");
                    }
                    Hashtag hashtag3 = (Hashtag) dataChannel4.mo28318b(C9023aq.class);
                    if (!C9518ae.m17826a(hashtag2) && C9518ae.m17826a(hashtag3)) {
                        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.ea_);
                    }
                    DataChannel dataChannel5 = dVar.f9678a;
                    if (dataChannel5 == null) {
                        C89219l.m154710a("mDataChannel");
                    }
                    if (hashtag2 == null) {
                        hashtag = new Hashtag(0L, "", null, 4, null);
                    } else {
                        hashtag = hashtag2;
                    }
                    dataChannel5.mo28315b(C9023aq.class, hashtag);
                    C6805b<Long> bVar = AbstractC6804a.f17049cw;
                    C89219l.m154716b(bVar, "");
                    if (!(hashtag2 == null || (l = hashtag2.f23083id) == null)) {
                        j = l.longValue();
                    }
                    C6806c.m14603a(bVar, Long.valueOf(j));
                    C6805b<String> bVar2 = AbstractC6804a.f17050cx;
                    C89219l.m154716b(bVar2, "");
                    if (hashtag2 == null || (str = hashtag2.title) == null) {
                        str = "none";
                    }
                    C6806c.m14603a(bVar2, str);
                }
                Context context = dVar.getContext();
                if (context != null && (a = C11279p.m20001a(context)) != null) {
                    int i = oVar.f9384s;
                    DataChannel dataChannel6 = dVar.f9678a;
                    if (dataChannel6 == null) {
                        C89219l.m154710a("mDataChannel");
                    }
                    C3537p.m8940a(a, i, dataChannel6, new C3515f(dVar));
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11685f
    /* renamed from: a */
    public final void mo8736a(AbstractC11683e eVar) {
        this.f9690j = eVar;
        if (eVar != null) {
            eVar.mo8851a(this.f9680ab);
        }
    }

    /* renamed from: a */
    public final void mo8737a(EnumC11728i iVar) {
        Integer a;
        int viewId;
        int viewId2;
        int a2;
        Boolean bool;
        Integer a3;
        int viewId3;
        C3561v vVar = this.f9675X;
        if (vVar == null) {
            C89219l.m154710a("mPreviewSlotHelper");
        }
        C3561v.C3562a aVar = vVar.f9876f;
        if (!(aVar == null || (a3 = aVar.mo8826a()) == null)) {
            if (C11729j.m20686c(iVar)) {
                viewId3 = mo8748e().getViewId();
            } else {
                viewId3 = mo8747d().getViewId();
            }
            C0550b bVar = new C0550b();
            bVar.mo2451a((ConstraintLayout) mo8746d(R.id.dqa));
            C89219l.m154716b(a3, "");
            bVar.mo2446a(a3.intValue(), 3);
            bVar.mo2449a(a3.intValue(), 3, mo8748e().getViewId(), 4, C3966y.m9653a(8.0f));
            bVar.mo2448a(a3.intValue(), 6, viewId3, 6);
            bVar.mo2448a(a3.intValue(), 7, viewId3, 7);
            bVar.mo2454b((ConstraintLayout) mo8746d(R.id.dqa));
        }
        C3561v vVar2 = this.f9675X;
        if (vVar2 == null) {
            C89219l.m154710a("mPreviewSlotHelper");
        }
        C3561v.C3562a aVar2 = vVar2.f9877g;
        if (aVar2 != null && (a = aVar2.mo8826a()) != null) {
            if (!C11729j.m20686c(iVar)) {
                viewId = mo8747d().getViewId();
            } else if (mo8745c().isShowing()) {
                viewId = mo8745c().getViewId();
            } else {
                viewId = mo8748e().getViewId();
            }
            C0550b bVar2 = new C0550b();
            bVar2.mo2451a((ConstraintLayout) mo8746d(R.id.dqa));
            C89219l.m154716b(a, "");
            bVar2.mo2446a(a.intValue(), 3);
            int intValue = a.intValue();
            PreviewSubscriptionWidget previewSubscriptionWidget = this.f9683c;
            if (previewSubscriptionWidget != null) {
                viewId2 = previewSubscriptionWidget.getViewId();
            } else if (C11729j.m20688e(iVar)) {
                viewId2 = mo8745c().getViewId();
            } else {
                viewId2 = mo8749f().getViewId();
            }
            bVar2.mo2449a(intValue, 3, viewId2, 4, 0);
            bVar2.mo2448a(a.intValue(), 6, viewId, 6);
            bVar2.mo2448a(a.intValue(), 7, viewId, 7);
            bVar2.mo2454b((ConstraintLayout) mo8746d(R.id.dqa));
            C3561v vVar3 = this.f9675X;
            if (vVar3 == null) {
                C89219l.m154710a("mPreviewSlotHelper");
            }
            C3561v.C3562a aVar3 = vVar3.f9877g;
            if (aVar3 != null) {
                if (C11729j.m20688e(iVar)) {
                    PreviewSubscriptionWidget previewSubscriptionWidget2 = this.f9683c;
                    if (previewSubscriptionWidget2 != null) {
                        bool = Boolean.valueOf(previewSubscriptionWidget2.isShowing());
                    } else {
                        bool = null;
                    }
                    if (C11279p.m20019b(bool)) {
                        a2 = 0;
                        aVar3.mo8827a(a2);
                    }
                }
                a2 = C3966y.m9653a(16.0f);
                aVar3.mo8827a(a2);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        long j;
        String str2;
        int i;
        Hashtag hashtag;
        String str3;
        EnumC5854q qVar;
        Long l;
        C10085b value;
        LiveEnableALogSetting.INSTANCE.update();
        C6560m.f16387j = true;
        String str4 = null;
        C1175ad a = C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null);
        C89219l.m154716b(a, "");
        DataChannel a2 = DataChannel.C17840a.m33044a(a, this);
        this.f9678a = a2;
        if (a2 == null) {
            C89219l.m154710a("mDataChannel");
        }
        a2.mo28311a(C9021ao.class, getChildFragmentManager());
        super.onCreate(bundle);
        C11223al.f26868a = true;
        C6204h.m13473a();
        C10095g.f24530d = true;
        AbstractC89244h<C10085b> hVar = C10095g.f24528b.get("preview_enter");
        if (!(hVar == null || (value = hVar.getValue()) == null)) {
            value.mo16948a();
            value.f24497c = true;
            C10095g.m18632a().postDelayed(new C10095g.RunnableC10123c(value), C10095g.f24527a);
        }
        EnumC9592k.PREVIEW.config();
        DataChannel dataChannel = this.f9678a;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("enter_from_type")) == null) {
            str = "";
        }
        dataChannel.mo28311a(C3803y.class, str);
        Bundle arguments2 = getArguments();
        long j2 = 0;
        if (arguments2 != null) {
            j = arguments2.getLong("hashtag_id", 0);
        } else {
            j = 0;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str2 = arguments3.getString("hashtag_title");
        } else {
            str2 = null;
        }
        DataChannel dataChannel2 = this.f9678a;
        if (dataChannel2 == null) {
            C89219l.m154710a("mDataChannel");
        }
        if (j == 0 || str2 == null) {
            i = 0;
            C6805b<Long> bVar = AbstractC6804a.f17049cw;
            C89219l.m154716b(bVar, "");
            C6805b<String> bVar2 = AbstractC6804a.f17050cx;
            C89219l.m154716b(bVar2, "");
            hashtag = new Hashtag(bVar.mo13066a(), bVar2.mo13066a(), null, 4, null);
        } else {
            i = 0;
            hashtag = new Hashtag(Long.valueOf(j), str2, null, 4, null);
        }
        dataChannel2.mo28315b(C9023aq.class, hashtag);
        this.f9672U = System.currentTimeMillis();
        C4017b.m9800b(C4017b.EnumC4018a.CreateStartLivePreview);
        Context context = getContext();
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        AbstractC2994b a3 = b.mo13147a();
        Objects.requireNonNull(a3, "null cannot be cast to non-null type com.bytedance.android.live.base.model.user.User");
        String a4 = C3730i.C3731a.m9243a(context, ((User) a3).getIdStr());
        C89219l.m154721d(a4, "");
        C3558t.RunnableC3559a aVar = new C3558t.RunnableC3559a(a4);
        C89219l.m154721d(aVar, "");
        C6204h.m13477a(aVar, i);
        C6204h.m13476a(RunnableC3443ar.f9724a);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.f42558d;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            str3 = arguments4.getString("request_from");
        } else {
            str3 = null;
        }
        dataChannelGlobal.mo28321a(C3015ag.class, str3);
        DataChannel dataChannel3 = this.f9678a;
        if (dataChannel3 == null) {
            C89219l.m154710a("mDataChannel");
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            str4 = arguments5.getString("enter_from");
        }
        dataChannel3.mo28311a(C3247i.class, str4);
        DataChannel dataChannel4 = this.f9678a;
        if (dataChannel4 == null) {
            C89219l.m154710a("mDataChannel");
        }
        Hashtag hashtag2 = (Hashtag) dataChannel4.mo28318b(C9023aq.class);
        if (!(hashtag2 == null || (l = hashtag2.f23083id) == null)) {
            j2 = l.longValue();
        }
        C3719d.C3720a.m9229a().mo9038a().getPreviewRoomCreateInfo(j2).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C3454bb(this), C3455bc.f9737a);
        C11825a aVar2 = this.f9700u;
        if (aVar2 != null && (aVar2.f28180a || aVar2.f28181b || aVar2.f28182c)) {
            StringBuffer stringBuffer = new StringBuffer("");
            C11825a aVar3 = this.f9700u;
            if (aVar3 != null) {
                m8850a(aVar3.f28180a, stringBuffer, "live");
                m8850a(aVar3.f28181b, stringBuffer, "live_by_record");
                m8850a(aVar3.f28182c, stringBuffer, "computer");
            }
            C3719d.C3720a.m9229a().mo9038a().getLivePermissionApply(stringBuffer.toString()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C3456bd(this));
        }
        C11825a aVar4 = this.f9700u;
        if (aVar4 != null) {
            AbstractC6872f b2 = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b2, "");
            String valueOf = String.valueOf(b2.mo13161c());
            C3730i.C3731a.m9245a(getContext(), EnumC11728i.VIDEO.name(), valueOf, aVar4.f28180a);
            C3730i.C3731a.m9245a(getContext(), EnumC11728i.SCREEN_RECORD.name(), valueOf, aVar4.f28181b);
            C3730i.C3731a.m9245a(getContext(), EnumC11728i.THIRD_PARTY.name(), valueOf, aVar4.f28182c);
        }
        Context context2 = getContext();
        if (context2 != null) {
            C89219l.m154716b(context2, "");
            DataChannel dataChannel5 = this.f9678a;
            if (dataChannel5 == null) {
                C89219l.m154710a("mDataChannel");
            }
            C89219l.m154721d(context2, "");
            C89219l.m154721d(dataChannel5, "");
            dataChannel5.mo28310a(C3802x.class, (AbstractC89172b) new C3549r.C3550a(context2, dataChannel5)).mo28314b(C3804z.class, (AbstractC89172b) new C3549r.C3551b(context2, dataChannel5));
        }
        if (C6204h.f15478a) {
            C2690b.m7787a((int) R.layout.b8k);
            C2690b.m7787a((int) R.layout.b86);
            C2690b.m7787a((int) R.layout.be9);
            C2690b.m7787a((int) R.layout.b4r);
            C2690b.m7787a((int) R.layout.bg6);
            ((AbstractC5843h) C6193a.m13435a(AbstractC5843h.class)).preloadBroadcastToolbarWidget();
        }
        AbstractC5843h hVar2 = (AbstractC5843h) C6193a.m13435a(AbstractC5843h.class);
        Context context3 = getContext();
        if (ToolBarButtonWithTextExperiment.hasText()) {
            qVar = EnumC5854q.ICON_WITH_TEXT;
        } else {
            qVar = EnumC5854q.ICON;
        }
        hVar2.preloadToolbarView(context3, 7, qVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$bl */
    static final class DialogInterface$OnClickListenerC3464bl implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3421d f9747a;

        static {
            Covode.recordClassIndex(3948);
        }

        DialogInterface$OnClickListenerC3464bl(C3421d dVar) {
            this.f9747a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C3558t.m8957b("cancel", C3421d.m8848a(this.f9747a));
            C7307f.m15216a((Handler) null);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$bm */
    static final class DialogInterface$OnClickListenerC3465bm implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3421d f9748a;

        static {
            Covode.recordClassIndex(3949);
        }

        DialogInterface$OnClickListenerC3465bm(C3421d dVar) {
            this.f9748a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C3558t.m8955a("end_live", C3421d.m8848a(this.f9748a));
            C7307f.m15216a((Handler) null);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$bn */
    static final class DialogInterface$OnClickListenerC3466bn implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3421d f9749a;

        static {
            Covode.recordClassIndex(3950);
        }

        DialogInterface$OnClickListenerC3466bn(C3421d dVar) {
            this.f9749a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C3558t.m8955a("back", C3421d.m8848a(this.f9749a));
            ActivityC0945e a = C11279p.m20001a(this.f9749a.getContext());
            if (a != null) {
                a.finish();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$g */
    static final class View$OnTouchListenerC3472g implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ View f9756a;

        /* renamed from: b */
        final /* synthetic */ C3421d f9757b;

        static {
            Covode.recordClassIndex(3956);
        }

        View$OnTouchListenerC3472g(View view, C3421d dVar) {
            this.f9756a = view;
            this.f9757b = dVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f9756a.requestFocus();
            C3421d.m8848a(this.f9757b).mo28319c(C3011ac.class);
            return false;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$bk */
    static final class DialogInterface$OnClickListenerC3463bk implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3421d f9745a;

        /* renamed from: b */
        final /* synthetic */ Room f9746b;

        static {
            Covode.recordClassIndex(3947);
        }

        DialogInterface$OnClickListenerC3463bk(C3421d dVar, Room room) {
            this.f9745a = dVar;
            this.f9746b = room;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            boolean z;
            int i2;
            String str;
            RoomAuthStatus roomAuthStatus;
            C3558t.m8957b("back_to_live", C3421d.m8848a(this.f9745a));
            if (Room.isValid(this.f9746b)) {
                DataChannelGlobal.f42558d.mo28321a(C9009ac.class, this.f9746b);
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.f42558d;
                Room room = this.f9746b;
                if (room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null) {
                    z = true;
                } else {
                    z = roomAuthStatus.isChatL2Enabled();
                }
                dataChannelGlobal.mo28321a(C9035bb.class, Boolean.valueOf(z));
                Context context = this.f9745a.getContext();
                IHostApp iHostApp = (IHostApp) C6193a.m13435a(IHostApp.class);
                if (this.f9745a.mo8766w().isStreamingBackground) {
                    i2 = 6;
                } else {
                    i2 = 5;
                }
                Intent intent = new Intent(context, iHostApp.getHostActivity(i2));
                C3272o oVar = (C3272o) C3421d.m8848a(this.f9745a).mo28318b(C9094df.class);
                if (oVar != null) {
                    str = oVar.f9374i;
                } else {
                    str = null;
                }
                intent.putExtra("live.intent.extra.LIVE_PC_TIPS", str);
                Context context2 = this.f9745a.getContext();
                if (context2 != null) {
                    C84349a.m145093a(intent, context2);
                    context2.startActivity(intent);
                }
                ((AbstractC11797b) C6193a.m13435a(AbstractC11797b.class)).mo18858a().mo18415a();
                ActivityC0945e a = C11279p.m20001a(this.f9745a.getContext());
                if (a != null) {
                    a.finish();
                }
                ActivityC0945e a2 = C11279p.m20001a(this.f9745a.getContext());
                if (a2 != null) {
                    a2.overridePendingTransition(0, 0);
                }
                ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).startLiveManager().onStartLive();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Long l;
        int i;
        AbstractC2994b a;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.f9678a;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        dataChannel.mo28310a(C7379al.class, (AbstractC89172b) new C3457be(this));
        dataChannel.mo28312a((Object) this, C3802x.class, (AbstractC89172b) new C3458bf(this));
        dataChannel.mo28312a((Object) this, C9011ae.class, (AbstractC89172b) new C3459bg(this));
        dataChannel.mo28314b(C3010ab.class, (AbstractC89172b) new C3460bh(this));
        dataChannel.mo28310a(C3248j.class, (AbstractC89172b) new C3461bi(this));
        dataChannel.mo28310a(C9094df.class, (AbstractC89172b) new C3462bj(this));
        if (!m8845J()) {
            C6201f.m13458a();
            C6201f.m13459b();
            ((TraversalConstraintLayout) mo8746d(R.id.b8f)).setTraversalCallBack(C3446au.f9727a);
            C6529h.C6530a aVar = new C6529h.C6530a();
            aVar.f16315a = "live_take_page";
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            if (b == null || (a = b.mo13147a()) == null) {
                l = null;
            } else {
                l = Long.valueOf(a.getId());
            }
            aVar.f16317c = l;
            C6529h a2 = aVar.mo12676a();
            DataChannelGlobal.f42558d.mo28321a(C6532j.class, a2);
            DataChannel dataChannel2 = this.f9678a;
            if (dataChannel2 == null) {
                C89219l.m154710a("mDataChannel");
            }
            dataChannel2.mo28311a(C6531i.class, a2);
            AbstractC3185a.m8649a();
            AbstractC11683e eVar = this.f9690j;
            if (eVar != null) {
                eVar.mo8857b();
            }
            C6204h.m13476a(new RunnableC3447av(this));
            DataChannel dataChannel3 = this.f9678a;
            if (dataChannel3 == null) {
                C89219l.m154710a("mDataChannel");
            }
            this.f9675X = new C3561v(dataChannel3, this, view, new C3448aw(this));
            DataChannel dataChannel4 = this.f9678a;
            if (dataChannel4 == null) {
                C89219l.m154710a("mDataChannel");
            }
            this.f9685e = ((AbstractC4349b) C6193a.m13435a(AbstractC4349b.class)).getPreviewHashTagWidget((EnumC11728i) dataChannel4.mo28318b(C3802x.class));
            WidgetManager widgetManager = new WidgetManager(C6204h.m13485e());
            this.f9701v = widgetManager;
            widgetManager.config(null, this, getView(), m8844I(), C6204h.f15480c);
            WidgetManager widgetManager2 = this.f9701v;
            if (widgetManager2 == null) {
                C89219l.m154710a("mWidgetManager");
            }
            widgetManager2.mWidgetCreateTimeListener = this.f9673V;
            WidgetManager widgetManager3 = this.f9701v;
            if (widgetManager3 == null) {
                C89219l.m154710a("mWidgetManager");
            }
            C6204h.m13474a(new C3473h(widgetManager3, this));
            C6204h.m13474a(new C3474i(widgetManager3, this));
            C6204h.m13474a(new C3475j(widgetManager3, this));
            C6204h.m13474a(new C3476k(widgetManager3, this));
            C6204h.m13474a(new C3477l(widgetManager3, this));
            AbstractC4152e e = C4217d.m10322e();
            C4163l.C4164a aVar2 = new C4163l.C4164a();
            aVar2.f11599b = C89070n.m154522b(C4147a.f11583a, C4147a.f11586d, "beauty");
            AbstractC4149b composerHandler = C4217d.f11697a.getComposerHandler(this.f9690j);
            C89219l.m154716b(composerHandler, "");
            aVar2.f11601d = composerHandler;
            e.mo9844a(aVar2.mo9872a());
            e.mo9843a(this.f9679aa);
            this.f9676Y.mo9891a(this.f9699s);
            AbstractC4162k c = C4217d.m10320c();
            DataChannel dataChannel5 = this.f9678a;
            if (dataChannel5 == null) {
                C89219l.m154710a("mDataChannel");
            }
            c.mo9871a(dataChannel5, this, true);
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.setOnTouchListener(new View$OnTouchListenerC3472g(view, this));
            ConstraintLayout constraintLayout = (ConstraintLayout) mo8746d(R.id.b2q);
            LiveWidget p = mo8759p();
            if (p != null) {
                i = p.getViewId();
            } else {
                i = -1;
            }
            C11279p.m20009a(constraintLayout, i, C3966y.m9667d(R.dimen.xa));
            this.f9674W = new RunnableC3471f(this);
            C3558t.f9868a = SystemClock.uptimeMillis();
            mo8767x();
            ((ImageView) mo8746d(R.id.bwl)).setOnClickListener(new View$OnClickListenerC3449ax(this));
        }
    }

    /* renamed from: a */
    public final void mo8738a(EnumC11728i iVar, boolean z) {
        if (isViewValid() && this.f9688h != iVar) {
            this.f9688h = iVar;
            View view = getView();
            if (view != null) {
                view.setClickable(C11729j.m20686c(iVar));
            }
            if (iVar != null) {
                C3051c.C3052a.m8359a("ttlive_change_mode").mo12633b("preview").mo12629a("select_live_mode", iVar.name()).mo12632a();
            }
            mo8741b().hide();
            mo8753j().hide();
            LiveWidget liveWidget = this.f9685e;
            if (liveWidget != null) {
                liveWidget.hide();
            }
            LiveWidget p = mo8759p();
            if (p != null) {
                p.hide();
            }
            LiveWidget q = mo8760q();
            if (q != null) {
                q.hide();
            }
            mo8747d().hide();
            mo8733a().hide();
            mo8758o().hide();
            mo8749f().hide();
            mo8748e().hide();
            mo8754k().hide();
            mo8756m().hide();
            mo8745c().hide();
            mo8757n().mo8896b();
            ObsBroadcastGuideWidget obsBroadcastGuideWidget = this.f9686f;
            if (obsBroadcastGuideWidget != null) {
                obsBroadcastGuideWidget.hide();
            }
            mo8750g().hide();
            mo8762s().hide();
            mo8763t().hide();
            mo8752i().hide();
            mo8764u().hide();
            C3561v vVar = this.f9675X;
            if (vVar == null) {
                C89219l.m154710a("mPreviewSlotHelper");
            }
            C3561v.C3562a aVar = vVar.f9876f;
            if (aVar != null) {
                aVar.mo8831a(false);
            }
            C3561v vVar2 = this.f9675X;
            if (vVar2 == null) {
                C89219l.m154710a("mPreviewSlotHelper");
            }
            C3561v.C3562a aVar2 = vVar2.f9877g;
            if (aVar2 != null) {
                aVar2.mo8831a(false);
            }
            mo8761r().hide();
            C11279p.m20006a(mo8746d(R.id.ddu));
            C11279p.m20006a(mo8746d(R.id.dds));
            C11279p.m20006a(mo8746d(R.id.cdf));
            C11279p.m20006a(mo8746d(R.id.dq0));
            mo8732G();
            if (C11729j.m20685b(iVar)) {
                mo8750g().show();
                mo8741b().show();
                mo8753j().show();
                mo8747d().show();
                mo8733a().show();
                mo8758o().show();
                mo8749f().show();
                mo8748e().show();
                mo8754k().show();
                mo8757n().mo8895a();
                DataChannel dataChannel = this.f9678a;
                if (dataChannel == null) {
                    C89219l.m154710a("mDataChannel");
                }
                if (dataChannel.mo28318b(C3010ab.class) == null) {
                    LiveWidget p2 = mo8759p();
                    if (p2 != null) {
                        p2.show();
                    }
                    LiveWidget liveWidget2 = this.f9685e;
                    if (liveWidget2 != null) {
                        liveWidget2.show();
                    }
                    C3561v vVar3 = this.f9675X;
                    if (vVar3 == null) {
                        C89219l.m154710a("mPreviewSlotHelper");
                    }
                    C3561v.C3562a aVar3 = vVar3.f9876f;
                    if (aVar3 != null) {
                        aVar3.mo8831a(true);
                    }
                    C3561v vVar4 = this.f9675X;
                    if (vVar4 == null) {
                        C89219l.m154710a("mPreviewSlotHelper");
                    }
                    C3561v.C3562a aVar4 = vVar4.f9877g;
                    if (aVar4 != null) {
                        aVar4.mo8831a(true);
                    }
                }
                m8851b(EnumC11728i.VIDEO);
                mo8739a(PrivacyCert.Builder.Companion.with("bpea-597").usage("").tag("[Live Preview] open camera when live mode is video").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            } else if (C11729j.m20689f(iVar)) {
                mo8750g().show();
                mo8741b().show();
                mo8753j().show();
                mo8749f().show();
                mo8748e().show();
                mo8756m().show();
                mo8745c().show();
                mo8757n().mo8895a();
                C11826b bVar = (C11826b) DataChannelGlobal.f42558d.mo28324b(C9012af.class);
                if (bVar != null && bVar.f28187e) {
                    mo8764u().show();
                }
                DataChannel dataChannel2 = this.f9678a;
                if (dataChannel2 == null) {
                    C89219l.m154710a("mDataChannel");
                }
                if (dataChannel2.mo28318b(C3010ab.class) == null) {
                    LiveWidget liveWidget3 = this.f9685e;
                    if (liveWidget3 != null) {
                        liveWidget3.show();
                    }
                    C3561v vVar5 = this.f9675X;
                    if (vVar5 == null) {
                        C89219l.m154710a("mPreviewSlotHelper");
                    }
                    C3561v.C3562a aVar5 = vVar5.f9877g;
                    if (aVar5 != null) {
                        aVar5.mo8831a(true);
                    }
                    DataChannel dataChannel3 = this.f9678a;
                    if (dataChannel3 == null) {
                        C89219l.m154710a("mDataChannel");
                    }
                    if (C10610a.m19180a(dataChannel3)) {
                        mo8762s().show();
                    }
                }
                mo8761r().show();
                C11279p.m20017b(mo8746d(R.id.ddu));
                C11279p.m20017b(mo8746d(R.id.dds));
                C11279p.m20017b(mo8746d(R.id.dq0));
                mo8732G();
                m8851b(EnumC11728i.SCREEN_RECORD);
                m8846K();
                mo8743b(PrivacyCert.Builder.Companion.with("bpea-601").usage("").tag("[Live Preview] close camera when live mode is obs").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            } else if (C11729j.m20688e(iVar)) {
                mo8750g().show();
                mo8741b().show();
                mo8753j().show();
                mo8748e().show();
                mo8754k().show();
                C11826b bVar2 = (C11826b) DataChannelGlobal.f42558d.mo28324b(C9012af.class);
                if (bVar2 != null && bVar2.f28187e) {
                    mo8764u().show();
                }
                mo8757n().mo8895a();
                ObsBroadcastGuideWidget obsBroadcastGuideWidget2 = this.f9686f;
                if (obsBroadcastGuideWidget2 != null) {
                    obsBroadcastGuideWidget2.show();
                }
                DataChannel dataChannel4 = this.f9678a;
                if (dataChannel4 == null) {
                    C89219l.m154710a("mDataChannel");
                }
                if (dataChannel4.mo28318b(C3010ab.class) == null) {
                    LiveWidget liveWidget4 = this.f9685e;
                    if (liveWidget4 != null) {
                        liveWidget4.show();
                    }
                    LiveWidget q2 = mo8760q();
                    if (q2 != null) {
                        q2.show();
                    }
                    C3561v vVar6 = this.f9675X;
                    if (vVar6 == null) {
                        C89219l.m154710a("mPreviewSlotHelper");
                    }
                    C3561v.C3562a aVar6 = vVar6.f9876f;
                    if (aVar6 != null) {
                        aVar6.mo8831a(true);
                    }
                    C3561v vVar7 = this.f9675X;
                    if (vVar7 == null) {
                        C89219l.m154710a("mPreviewSlotHelper");
                    }
                    C3561v.C3562a aVar7 = vVar7.f9877g;
                    if (aVar7 != null) {
                        aVar7.mo8831a(true);
                    }
                    DataChannel dataChannel5 = this.f9678a;
                    if (dataChannel5 == null) {
                        C89219l.m154710a("mDataChannel");
                    }
                    if (C10610a.m19180a(dataChannel5)) {
                        mo8762s().show();
                    }
                }
                C11279p.m20017b(mo8746d(R.id.ddu));
                C11279p.m20017b(mo8746d(R.id.dds));
                m8846K();
                mo8743b(PrivacyCert.Builder.Companion.with("bpea-602").usage("").tag("[Live Preview] close camera when live mode is game").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            } else {
                C89219l.m154721d(iVar, "");
                if (iVar == EnumC11728i.LIVE_STUDIO) {
                    mo8752i().mo8897a(z);
                    mo8763t().mo8893a(z);
                    C11279p.m20017b(mo8746d(R.id.ddu));
                    C11279p.m20017b(mo8746d(R.id.dds));
                    m8846K();
                    mo8743b(PrivacyCert.Builder.Companion.with("bpea-1013").usage("").tag("[Live Preview] close camera when live mode is live studio").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
                }
            }
            mo8767x();
            mo8737a(iVar);
            mo8768y();
            ((AbstractC4349b) C6193a.m13435a(AbstractC4349b.class)).updatePreviewHashTagWidgetLiveMode(this.f9685e, iVar);
        }
    }

    /* renamed from: a */
    private static void m8850a(boolean z, StringBuffer stringBuffer, String str) {
        if (z) {
            if (C89361p.m154870a(stringBuffer)) {
                stringBuffer.append(str);
            } else {
                stringBuffer.append(",".concat(String.valueOf(str)));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$m */
    static final class C3479m implements AbstractC4151d {

        /* renamed from: a */
        final /* synthetic */ C3421d f9769a;

        static {
            Covode.recordClassIndex(3963);
        }

        C3479m(C3421d dVar) {
            this.f9769a = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
            if ((!r0.isEmpty()) != false) goto L_0x0027;
         */
        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4151d
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo8787a(boolean r5, java.lang.String r6, com.bytedance.android.livesdkapi.depend.model.C11672a r7) {
            /*
                r4 = this;
                com.bytedance.android.live.effect.api.a.e r0 = com.bytedance.android.live.effect.C4217d.m10322e()
                java.util.Map r3 = r0.mo9841a()
                com.bytedance.android.live.broadcast.preview.d r2 = r4.f9769a
                java.lang.String r0 = com.bytedance.android.live.effect.api.C4147a.f11584b
                boolean r0 = r3.containsKey(r0)
                r1 = 1
                if (r0 == 0) goto L_0x002a
                java.lang.String r0 = com.bytedance.android.live.effect.api.C4147a.f11584b
                java.lang.Object r0 = r3.get(r0)
                if (r0 != 0) goto L_0x001e
                p4600h.p4611f.p4613b.C89219l.m154715b()
            L_0x001e:
                java.util.Map r0 = (java.util.Map) r0
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ r1
                if (r0 == 0) goto L_0x002a
            L_0x0027:
                r2.f9691k = r1
                return
            L_0x002a:
                com.bytedance.android.live.broadcast.preview.d r1 = r4.f9769a
                r0 = 2131366056(0x7f0a10a8, float:1.8351995E38)
                android.view.View r0 = r1.mo8746d(r0)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                if (r0 == 0) goto L_0x003a
                com.bytedance.android.livesdk.utils.C11279p.m20006a(r0)
            L_0x003a:
                r1 = 0
                goto L_0x0027
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.C3421d.C3479m.mo8787a(boolean, java.lang.String, com.bytedance.android.livesdkapi.depend.model.a):void");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!this.f9671T) {
            if (i != 20001) {
                View$OnClickListenerC3783e eVar = mo8741b().f9930a;
                if (eVar != null && eVar.f10491d != null) {
                    eVar.f10491d.mo11514a(i, i2, intent);
                    return;
                }
                return;
            }
            PreviewStartLiveWidget g = mo8750g();
            if (Build.VERSION.SDK_INT >= 21) {
                if (i2 == -1) {
                    Object a = PreviewStartLiveWidget.m9055a(g.context, "media_projection");
                    if ((a instanceof MediaProjectionManager) && a != null) {
                        C6501b.C6502a.m13948a("livesdk_allow_screen_share").mo12651a("is_allowed_screen_share", "allowed").mo12655b();
                        g.f10001c = intent;
                        BgBroadcastServiceImpl.setProjectionIntent(intent);
                        g.mo8909a(false);
                        return;
                    }
                }
                C6501b.C6502a.m13948a("livesdk_allow_screen_share").mo12651a("is_allowed_screen_share", "not_allowed").mo12655b();
                g.mo8913e();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        if (m8845J()) {
            return null;
        }
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        AbstractC2994b a = b.mo13147a();
        Objects.requireNonNull(a, "null cannot be cast to non-null type com.bytedance.android.live.base.model.user.User");
        User user = (User) a;
        C6805b<Long> bVar = AbstractC6804a.f16883L;
        C89219l.m154716b(bVar, "");
        Long a2 = bVar.mo13066a();
        long id = user.getId();
        if (a2 == null || a2.longValue() != id) {
            C6805b<Long> bVar2 = AbstractC6804a.f16883L;
            C89219l.m154716b(bVar2, "");
            C6806c.m14603a(bVar2, Long.valueOf(user.getId()));
        }
        this.f9689i = user;
        return C2690b.m7784a(R.layout.b8l, viewGroup);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$au */
    static final /* synthetic */ class C3446au extends C89217j implements AbstractC89188r<Long, Long, Long, Long, C89391z> {

        /* renamed from: a */
        public static final C3446au f9727a = new C3446au();

        static {
            Covode.recordClassIndex(3930);
        }

        C3446au() {
            super(4, C3558t.class, "logPreviewTraversalTime", "logPreviewTraversalTime(JJJJ)V", 1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(Long l, Long l2, Long l3, Long l4) {
            l.longValue();
            l2.longValue();
            l3.longValue();
            C3868c.m9491a("ttlive_preview_page_traversal_time", 0, C89041ag.m154412a(C89387v.m154943a("time_cost", String.valueOf(l4.longValue()))));
            return C89391z.f203057a;
        }
    }
}
