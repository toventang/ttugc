package com.bytedance.android.live.broadcast;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.android.C2690b;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.live.C2981d;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.C3008aa;
import com.bytedance.android.live.broadcast.api.C3018a;
import com.bytedance.android.live.broadcast.api.C3059e;
import com.bytedance.android.live.broadcast.api.C3065g;
import com.bytedance.android.live.broadcast.api.p185c.C3047a;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.broadcast.api.p185c.C3053d;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b;
import com.bytedance.android.live.broadcast.api.p186d.C3058c;
import com.bytedance.android.live.broadcast.p188b.View$OnClickListenerC3087f;
import com.bytedance.android.live.broadcast.p192c.C3215b;
import com.bytedance.android.live.broadcast.p192c.p193a.C3211p;
import com.bytedance.android.live.broadcast.p195d.C3219a;
import com.bytedance.android.live.broadcast.p195d.C3221b;
import com.bytedance.android.live.broadcast.p195d.C3223d;
import com.bytedance.android.live.broadcast.p195d.C3224e;
import com.bytedance.android.live.broadcast.p195d.C3225f;
import com.bytedance.android.live.broadcast.p196e.C3227a;
import com.bytedance.android.live.broadcast.p197f.C3229a;
import com.bytedance.android.live.broadcast.p199h.AbstractC3243a;
import com.bytedance.android.live.broadcast.p199h.C3244b;
import com.bytedance.android.live.broadcast.stream.C3678c;
import com.bytedance.android.live.broadcast.stream.C3704d;
import com.bytedance.android.live.broadcast.stream.C3708f;
import com.bytedance.android.live.broadcast.stream.capture.AbstractC3697f;
import com.bytedance.android.live.broadcast.stream.p207c.C3687b;
import com.bytedance.android.live.broadcast.utils.C3719d;
import com.bytedance.android.live.broadcast.utils.C3723e;
import com.bytedance.android.live.broadcast.utils.C3726f;
import com.bytedance.android.live.broadcast.widget.VideoWidget2;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p213c.RunnableC3859f;
import com.bytedance.android.live.core.p213c.RunnableC3861h;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3935h;
import com.bytedance.android.live.core.p218f.C3939i;
import com.bytedance.android.live.core.p218f.C3940j;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.performance.C4017b;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.effect.C4217d;
import com.bytedance.android.live.effect.api.AbstractC4167d;
import com.bytedance.android.live.effect.api.AbstractC4169e;
import com.bytedance.android.live.effect.api.AbstractC4170f;
import com.bytedance.android.live.effect.api.C4165b;
import com.bytedance.android.live.effect.api.C4173g;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.p240a.AbstractC4155h;
import com.bytedance.android.live.effect.model.C4312b;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.gift.C4346v;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.AbstractC4433d;
import com.bytedance.android.live.liveinteract.api.C4403aq;
import com.bytedance.android.live.liveinteract.api.C4441l;
import com.bytedance.android.live.liveinteract.api.C4450t;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p261b.C4423l;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p250i.p251a.AbstractC4354b;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p379n.AbstractC5771e;
import com.bytedance.android.live.p379n.AbstractC5783o;
import com.bytedance.android.live.p379n.AbstractC5788t;
import com.bytedance.android.live.p385p.AbstractC5843h;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6201f;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.chatroom.p488c.C7398o;
import com.bytedance.android.livesdk.chatroom.p488c.C7399p;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
import com.bytedance.android.livesdk.chatroom.p489d.C7417b;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.chatroom.p499ui.C7930dw;
import com.bytedance.android.livesdk.chatroom.p499ui.DialogC7913do;
import com.bytedance.android.livesdk.gift.C8781a;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.p549e.AbstractC8807b;
import com.bytedance.android.livesdk.live.api.LIveTaskApi;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastLiveCenterSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyParamSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableFixLiveEndSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxEnterBackgroundTimeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePauseLiveSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePushStreamLogLevelSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamBitrateAdaptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamBitrateSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamEnableSdkParamsSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamEnableUrlListSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamHwRoiSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamProfileSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamSwRoiSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveUseEffectAlgorithmAbSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveUseNewAudioCodecSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.PushStreamSupportDnsSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.StreamDefinitionLevelSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.StreamHardwareEncodeSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftInterfaceOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.gift.LivePrefetchGiftImageSetting;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.EnumC9592k;
import com.bytedance.android.livesdk.model.message.C9627ay;
import com.bytedance.android.livesdk.model.message.C9688bt;
import com.bytedance.android.livesdk.model.message.C9883n;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p425aa.C6558k;
import com.bytedance.android.livesdk.p425aa.C6560m;
import com.bytedance.android.livesdk.p425aa.p426a.EnumC6500b;
import com.bytedance.android.livesdk.p425aa.p428c.C6525d;
import com.bytedance.android.livesdk.p425aa.p428c.C6529h;
import com.bytedance.android.livesdk.p425aa.p428c.C6531i;
import com.bytedance.android.livesdk.p425aa.p428c.C6532j;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p558h.EnumC8917a;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9019am;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9022ap;
import com.bytedance.android.livesdk.p561j.C9051bq;
import com.bytedance.android.livesdk.p561j.C9067cf;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9075cn;
import com.bytedance.android.livesdk.p561j.C9080cs;
import com.bytedance.android.livesdk.p561j.C9081ct;
import com.bytedance.android.livesdk.p561j.C9082cu;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9097di;
import com.bytedance.android.livesdk.p561j.C9103do;
import com.bytedance.android.livesdk.p561j.C9110dv;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p561j.C9141w;
import com.bytedance.android.livesdk.p561j.EnumC9050bp;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.performance.C10085b;
import com.bytedance.android.livesdk.performance.C10095g;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.rank.api.C10341e;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;
import com.bytedance.android.livesdk.tunnel.C10928b;
import com.bytedance.android.livesdk.tunnel.EnumC10927a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.C11117b;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdk.util.rxutils.p651b.EnumC11186b;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.utils.C11291z;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.depend.AbstractC11622a;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.C11738s;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11678b;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11679c;
import com.bytedance.android.livesdkapi.depend.p677a.AbstractC11623a;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.model.C11836b;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1204e.p1205a.C17305a;
import com.bytedance.ies.sdk.datachannel.AbstractC17845e;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.avframework.engine.MediaEngineFactory;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.optimizer.live.sdk.dns.C86137a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.o */
public final class C3276o extends C10935a implements C3008aa.AbstractC3009a, AbstractC3057b, C3229a.AbstractC3230a, AbstractC3243a, AbstractC11679c, WeakHandler.IHandler, AbstractC17845e {

    /* renamed from: y */
    static final int[][] f9390y = {new int[]{200, 500, 800, 1}, new int[]{200, 800, 1200, 3}};

    /* renamed from: z */
    public static final C3277a f9391z = new C3277a((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f9392A = C11831d.m20835a(new C3312g(this));

    /* renamed from: B */
    private final AbstractC89244h f9393B = C11831d.m20835a(new C3320m(this));

    /* renamed from: C */
    private final AbstractC89244h f9394C = C11831d.m20835a(new C3316k(this));

    /* renamed from: D */
    private final AbstractC89244h f9395D = C11831d.m20835a(new C3314i(this));

    /* renamed from: E */
    private final AbstractC89244h f9396E = C11831d.m20835a(new C3311f(this));

    /* renamed from: F */
    private C3008aa f9397F;

    /* renamed from: G */
    private boolean f9398G;

    /* renamed from: H */
    private boolean f9399H;

    /* renamed from: I */
    private long f9400I;

    /* renamed from: J */
    private final List<AbstractC88412b> f9401J = new ArrayList();

    /* renamed from: K */
    private final Map<String, Runnable> f9402K = new HashMap();

    /* renamed from: L */
    private View$OnClickListenerC3087f f9403L;

    /* renamed from: M */
    private final AbstractC89244h f9404M = C89250i.m154773a((AbstractC89171a) C3309d.f9482a);

    /* renamed from: N */
    private final AbstractC89244h f9405N = C11831d.m20835a(new C3317l(this));

    /* renamed from: O */
    private final AbstractC11622a f9406O = new C3310e(this);

    /* renamed from: P */
    private final C3315j f9407P = new C3315j(this);

    /* renamed from: Q */
    private HashMap f9408Q;

    /* renamed from: a */
    final AbstractC89244h f9409a = C11831d.m20835a(new C3321n(this));

    /* renamed from: b */
    public Room f9410b;

    /* renamed from: c */
    public C11738s f9411c;

    /* renamed from: d */
    public AbstractC11678b f9412d;

    /* renamed from: e */
    public C3229a f9413e;

    /* renamed from: f */
    boolean f9414f;

    /* renamed from: g */
    public boolean f9415g;

    /* renamed from: h */
    boolean f9416h;

    /* renamed from: i */
    public boolean f9417i = true;

    /* renamed from: j */
    public boolean f9418j;

    /* renamed from: k */
    long f9419k;

    /* renamed from: l */
    long f9420l;

    /* renamed from: m */
    public AbstractC3055a f9421m;

    /* renamed from: n */
    public VideoWidget2 f9422n;

    /* renamed from: o */
    AbstractC5783o f9423o;

    /* renamed from: p */
    public AbstractC11293v f9424p;

    /* renamed from: q */
    public C3687b f9425q;

    /* renamed from: r */
    public String f9426r;

    /* renamed from: s */
    public CharSequence f9427s;

    /* renamed from: t */
    public CharSequence f9428t;

    /* renamed from: u */
    public CharSequence f9429u;

    /* renamed from: v */
    public AbstractC88412b f9430v;

    /* renamed from: w */
    public C7417b f9431w;

    /* renamed from: x */
    public final AbstractC3697f f9432x = new C3313h(this);

    /* renamed from: p */
    private final C3244b m8757p() {
        return (C3244b) this.f9394C.getValue();
    }

    /* renamed from: q */
    private final DialogC7913do m8758q() {
        return (DialogC7913do) this.f9395D.getValue();
    }

    /* renamed from: s */
    private final C3317l.C33181 m8760s() {
        return (C3317l.C33181) this.f9405N.getValue();
    }

    /* renamed from: u */
    private void m8762u() {
        HashMap hashMap = this.f9408Q;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public final DataChannel mo8627a() {
        return (DataChannel) this.f9392A.getValue();
    }

    /* renamed from: b */
    public final WeakHandler mo8631b() {
        return (WeakHandler) this.f9393B.getValue();
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void beforeLiveCoreStartStream() {
    }

    /* renamed from: c */
    public final View mo8635c(int i) {
        if (this.f9408Q == null) {
            this.f9408Q = new HashMap();
        }
        View view = (View) this.f9408Q.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f9408Q.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final BroadcastTunnelVM mo8636c() {
        return (BroadcastTunnelVM) this.f9396E.getValue();
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void connected() {
    }

    /* renamed from: d */
    public final AbstractC4170f mo8637d() {
        return (AbstractC4170f) this.f9404M.getValue();
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$a */
    public static final class C3277a {
        static {
            Covode.recordClassIndex(3759);
        }

        private C3277a() {
        }

        public /* synthetic */ C3277a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11679c
    /* renamed from: g */
    public final Fragment mo8639g() {
        return this;
    }

    /* renamed from: a */
    public final void mo8629a(String str, long j, boolean z, Integer num) {
        if (getContext() != null) {
            LiveLoadingView liveLoadingView = (LiveLoadingView) mo8635c(R.id.c_y);
            if (liveLoadingView != null) {
                C11279p.m20008a((View) liveLoadingView, false);
            }
            DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(getContext());
            aVar.f22245b = str;
            DialogC9148b.C9149a b = aVar.mo15244a(R.string.duu, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3289al(this, num), false).mo15249b(R.string.dut, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3290am(this, num), false);
            b.f22260q = new DialogInterface$OnCancelListenerC3291an(num);
            b.mo15247a().show();
            C6501b.C6502a.m13948a("livesdk_close_live_duration").mo12643a(mo8627a()).mo12645a("duration", (int) (System.currentTimeMillis() - j)).mo12645a("request_succeed", z ? 1 : 0).mo12655b();
        }
    }

    @Override // com.bytedance.android.live.broadcast.p197f.C3229a.AbstractC3230a
    /* renamed from: a */
    public final void mo8499a(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        if (isViewValid()) {
            m8758q().mo14212a(charSequence);
        }
    }

    @Override // com.bytedance.android.live.broadcast.p197f.C3229a.AbstractC3230a
    /* renamed from: a */
    public final void mo8501a(boolean z, String str) {
        C89219l.m154721d(str, "");
        if (isViewValid()) {
            m8758q().mo14213a(z, str);
        }
    }

    @Override // com.bytedance.android.live.broadcast.p197f.C3229a.AbstractC3230a
    /* renamed from: a */
    public final void mo8500a(boolean z) {
        if (isViewValid()) {
            if (z) {
                DialogC7913do q = m8758q();
                q.setCancelable(false);
                q.show();
                q.mo14211a(new View$OnClickListenerC3301ax(q, this));
                q.f19680a = new C3302ay(q);
                q.f19681b = new C3303az(q);
                return;
            }
            C11279p.m20014b(m8758q());
        }
    }

    @Override // com.bytedance.android.live.broadcast.C3008aa.AbstractC3009a
    /* renamed from: a */
    public final void mo8170a(String str) {
        AbstractC3055a aVar;
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) TelephonyManager.EXTRA_STATE_IDLE, (Object) str)) {
            AbstractC3055a aVar2 = this.f9421m;
            if (aVar2 != null) {
                aVar2.mo8289a(PrivacyCert.Builder.Companion.with("bpea-366").usage("").tag("Switch to the foreground after making a phone call during the live broadcast").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        } else if (C89219l.m154714a((Object) TelephonyManager.EXTRA_STATE_OFFHOOK, (Object) str) && (aVar = this.f9421m) != null) {
            aVar.mo8297b(PrivacyCert.Builder.Companion.with("bpea-387").usage("").tag("Switch to the background when making a phone call during the live broadcast").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    /* renamed from: a */
    public final void mo8630a(String str, Float f, boolean z, int i) {
        C89219l.m154721d(str, "");
        mo8634b(str);
        RunnableC3284ag agVar = new RunnableC3284ag(this, f, str, i, z);
        this.f9402K.put(str, agVar);
        mo8631b().postDelayed(agVar, 30000);
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$l */
    static final class C3317l extends AbstractC89220m implements AbstractC89171a<C33181> {

        /* renamed from: a */
        final /* synthetic */ C3276o f9490a;

        static {
            Covode.recordClassIndex(3799);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3317l(C3276o oVar) {
            super(0);
            this.f9490a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33181 invoke() {
            return new AbstractC8807b(this) {
                /* class com.bytedance.android.live.broadcast.C3276o.C3317l.C33181 */

                /* renamed from: a */
                final /* synthetic */ C3317l f9491a;

                static {
                    Covode.recordClassIndex(3800);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f9491a = r1;
                }

                @Override // com.bytedance.android.livesdk.gift.p549e.AbstractC8807b
                /* renamed from: a */
                public final void mo8519a(List<? extends C9904t> list) {
                    C89219l.m154721d(list, "");
                    C3211p.m8698a(this.f9491a.f9490a.mo8638f());
                }

                @Override // com.bytedance.android.livesdk.gift.p549e.AbstractC8807b
                /* renamed from: b */
                public final void mo8520b(List<? extends GiftPage> list) {
                    this.f9491a.f9490a.f9430v = AbstractC88979t.m154294a(new C3319a(list)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143300g();
                    C3211p.m8698a(this.f9491a.f9490a.mo8638f());
                }

                /* renamed from: com.bytedance.android.live.broadcast.o$l$1$a */
                static final class C3319a<T> implements AbstractC88983w {

                    /* renamed from: a */
                    final /* synthetic */ List f9492a;

                    static {
                        Covode.recordClassIndex(3801);
                    }

                    C3319a(List list) {
                        this.f9492a = list;
                    }

                    @Override // p4560f.p4561a.AbstractC88983w
                    public final void subscribe(AbstractC88982v<Object> vVar) {
                        List<T> list;
                        if (LivePrefetchGiftImageSetting.INSTANCE.getValue() && (list = this.f9492a) != null && (!list.isEmpty())) {
                            for (T t : list) {
                                List<C9904t> list2 = t.gifts;
                                if (list2 != null && (!list2.isEmpty())) {
                                    for (T t2 : list2) {
                                        C89219l.m154716b(t2, "");
                                        C3941k.m9598a(t2.f23997b);
                                    }
                                }
                            }
                        }
                    }
                }
            };
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$m */
    static final class C3320m extends AbstractC89220m implements AbstractC89171a<WeakHandler> {

        /* renamed from: a */
        final /* synthetic */ C3276o f9493a;

        static {
            Covode.recordClassIndex(3802);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3320m(C3276o oVar) {
            super(0);
            this.f9493a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WeakHandler invoke() {
            return new WeakHandler(this.f9493a);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$z */
    static final class RunnableC3337z implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3276o f9511a;

        /* renamed from: b */
        final /* synthetic */ float f9512b;

        static {
            Covode.recordClassIndex(3819);
        }

        RunnableC3337z(C3276o oVar, float f) {
            this.f9511a = oVar;
            this.f9512b = f;
        }

        public final void run() {
            this.f9511a.isViewValid();
        }
    }

    @Override // com.bytedance.ies.sdk.datachannel.AbstractC17845e
    /* renamed from: h */
    public final DataChannel mo8509h() {
        return mo8627a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.o$ai */
    public static final /* synthetic */ class C3286ai extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(3768);
        }

        C3286ai(C3276o oVar) {
            super(0, oVar, C3276o.class, "onFinishBroadcastCancelClick", "onFinishBroadcastCancelClick()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((C3276o) this.receiver).mo8642k();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$f */
    static final class C3311f extends AbstractC89220m implements AbstractC89171a<BroadcastTunnelVM> {

        /* renamed from: a */
        final /* synthetic */ C3276o f9484a;

        static {
            Covode.recordClassIndex(3793);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3311f(C3276o oVar) {
            super(0);
            this.f9484a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BroadcastTunnelVM invoke() {
            return C10928b.C10929a.m19555a(BroadcastTunnelVM.class, this.f9484a.getActivity());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$i */
    static final class C3314i extends AbstractC89220m implements AbstractC89171a<DialogC7913do> {

        /* renamed from: a */
        final /* synthetic */ C3276o f9487a;

        static {
            Covode.recordClassIndex(3796);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3314i(C3276o oVar) {
            super(0);
            this.f9487a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogC7913do invoke() {
            return DialogC7913do.m16042a(this.f9487a.getActivity());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$k */
    static final class C3316k extends AbstractC89220m implements AbstractC89171a<C3244b> {

        /* renamed from: a */
        final /* synthetic */ C3276o f9489a;

        static {
            Covode.recordClassIndex(3798);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3316k(C3276o oVar) {
            super(0);
            this.f9489a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C3244b invoke() {
            return new C3244b(C3276o.m8747a(this.f9489a));
        }
    }

    /* renamed from: r */
    private final long m8759r() {
        Room room = this.f9410b;
        if (room == null) {
            C89219l.m154710a("mRoom");
        }
        return room.getOwnerUserId();
    }

    /* renamed from: f */
    public final long mo8638f() {
        Room room = this.f9410b;
        if (room == null) {
            C89219l.m154710a("mRoom");
        }
        return room.getId();
    }

    @Override // com.bytedance.android.live.broadcast.p197f.C3229a.AbstractC3230a
    /* renamed from: n */
    public final void mo8514n() {
        C11226ao.m19882a(getContext(), (int) R.string.gr8);
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onCaptureFirstFrame() {
        C3047a.m8356a("capture_first_frame", String.valueOf(System.currentTimeMillis()));
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onNetworkLow() {
        C3051c.C3052a.m8359a("ttlive_low_network").mo12632a();
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$ay */
    static final class C3302ay implements DialogC7913do.AbstractC7914a {

        /* renamed from: a */
        final /* synthetic */ DialogC7913do f9469a;

        static {
            Covode.recordClassIndex(3784);
        }

        C3302ay(DialogC7913do doVar) {
            this.f9469a = doVar;
        }

        @Override // com.bytedance.android.livesdk.chatroom.p499ui.DialogC7913do.AbstractC7914a
        /* renamed from: a */
        public final void mo8527a() {
            C11226ao.m19883a(this.f9469a.getContext(), C3966y.m9657a((int) R.string.gpj), 0);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$az */
    static final class C3303az implements DialogC7913do.AbstractC7915b {

        /* renamed from: a */
        final /* synthetic */ DialogC7913do f9470a;

        static {
            Covode.recordClassIndex(3785);
        }

        C3303az(DialogC7913do doVar) {
            this.f9470a = doVar;
        }

        @Override // com.bytedance.android.livesdk.chatroom.p499ui.DialogC7913do.AbstractC7915b
        /* renamed from: a */
        public final void mo8528a() {
            C11226ao.m19883a(this.f9470a.getContext(), C3966y.m9657a((int) R.string.gpj), 0);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$d */
    static final class C3309d extends AbstractC89220m implements AbstractC89171a<AbstractC4170f> {

        /* renamed from: a */
        public static final C3309d f9482a = new C3309d();

        static {
            Covode.recordClassIndex(3791);
        }

        C3309d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC4170f invoke() {
            AbstractC2953a a = C6193a.m13435a(IEffectService.class);
            C89219l.m154716b(a, "");
            return ((IEffectService) a).getLiveFilterManager();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$g */
    static final class C3312g extends AbstractC89220m implements AbstractC89171a<DataChannel> {

        /* renamed from: a */
        final /* synthetic */ C3276o f9485a;

        static {
            Covode.recordClassIndex(3794);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3312g(C3276o oVar) {
            super(0);
            this.f9485a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DataChannel invoke() {
            C1175ad a = C1181ae.m3879a(this.f9485a, (C1175ad.AbstractC1177b) null);
            C89219l.m154716b(a, "");
            return DataChannel.C17840a.m33044a(a, this.f9485a);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$n */
    static final class C3321n extends AbstractC89220m implements AbstractC89171a<WidgetManager> {

        /* renamed from: a */
        final /* synthetic */ C3276o f9494a;

        static {
            Covode.recordClassIndex(3803);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3321n(C3276o oVar) {
            super(0);
            this.f9494a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WidgetManager invoke() {
            C3276o oVar = this.f9494a;
            return WidgetManager.m22025of(oVar, oVar.getView(), C6204h.f15480c, C6204h.m13485e());
        }
    }

    /* renamed from: e */
    public static long m8756e() {
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (b != null) {
            return b.mo13161c();
        }
        return 0;
    }

    @Override // com.bytedance.android.live.broadcast.p197f.C3229a.AbstractC3230a
    /* renamed from: l */
    public final void mo8512l() {
        if (isViewValid()) {
            DialogC7913do q = m8758q();
            new View$OnClickListenerC3307ba(this);
            q.mo14210a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$ac */
    static final class RunnableC3280ac implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3276o f9436a;

        static {
            Covode.recordClassIndex(3762);
        }

        RunnableC3280ac(C3276o oVar) {
            this.f9436a = oVar;
        }

        public final void run() {
            VideoWidget2 videoWidget2;
            View view;
            ViewGroup.LayoutParams layoutParams;
            View view2;
            if (!this.f9436a.mStatusDestroyed && (videoWidget2 = this.f9436a.f9422n) != null && (view = videoWidget2.getView()) != null) {
                VideoWidget2 videoWidget22 = this.f9436a.f9422n;
                FrameLayout.LayoutParams layoutParams2 = null;
                if (videoWidget22 == null || (view2 = videoWidget22.getView()) == null) {
                    layoutParams = null;
                } else {
                    layoutParams = view2.getLayoutParams();
                }
                if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                    layoutParams = null;
                }
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
                if (layoutParams3 != null) {
                    layoutParams3.width = -1;
                    layoutParams3.height = -1;
                    layoutParams3.topMargin = 0;
                    layoutParams2 = layoutParams3;
                }
                view.setLayoutParams(layoutParams2);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$ae */
    static final class RunnableC3282ae implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3276o f9439a;

        static {
            Covode.recordClassIndex(3764);
        }

        RunnableC3282ae(C3276o oVar) {
            this.f9439a = oVar;
        }

        public final void run() {
            MethodCollector.m26663i(7255);
            if (this.f9439a.mStatusDestroyed) {
                MethodCollector.m26664o(7255);
                return;
            }
            ((FrameLayout) this.f9439a.mo8635c(R.id.iw)).removeAllViews();
            MethodCollector.m26664o(7255);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$aw */
    static final class RunnableC3300aw implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3276o f9465a;

        /* renamed from: b */
        final /* synthetic */ AbstractC5783o f9466b;

        static {
            Covode.recordClassIndex(3782);
        }

        RunnableC3300aw(C3276o oVar, AbstractC5783o oVar2) {
            this.f9465a = oVar;
            this.f9466b = oVar2;
        }

        public final void run() {
            VideoWidget2 videoWidget2;
            VideoWidget2 videoWidget22 = this.f9465a.f9422n;
            if (!(videoWidget22 == null || videoWidget22.f10442i == null)) {
                videoWidget22.f10442i.mo8554a();
            }
            if (this.f9466b.mo11520b().isAdded() && (videoWidget2 = this.f9465a.f9422n) != null) {
                FrameLayout c = this.f9466b.mo11561c();
                AbstractC0952i childFragmentManager = this.f9466b.mo11520b().getChildFragmentManager();
                videoWidget2.f10451r = c;
                videoWidget2.f10452s = childFragmentManager;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.o$y */
    public static final class RunnableC3336y implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3276o f9509a;

        /* renamed from: b */
        final /* synthetic */ PrivacyCert f9510b;

        static {
            Covode.recordClassIndex(3818);
        }

        RunnableC3336y(C3276o oVar, PrivacyCert privacyCert) {
            this.f9509a = oVar;
            this.f9510b = privacyCert;
        }

        public final void run() {
            this.f9509a.mo8632b(1);
            this.f9509a.mo8628a(this.f9510b);
            C3221b.m8716b(10001, C3276o.m8756e(), this.f9509a.mo8638f(), this.f9509a.f9417i);
        }
    }

    static {
        Covode.recordClassIndex(3758);
    }

    /* renamed from: i */
    public final void mo8640i() {
        AbstractC5783o oVar = this.f9423o;
        if (oVar != null) {
            oVar.mo11517a();
            getChildFragmentManager().mo3552a().mo3455a(oVar.mo11520b()).mo3478e();
            this.f9423o = null;
            VideoWidget2 videoWidget2 = this.f9422n;
            if (videoWidget2 != null) {
                videoWidget2.mo9062b();
            }
            LiveWidgetProvider.Companion.getInstance().clear();
        }
    }

    /* renamed from: k */
    public final void mo8642k() {
        C6501b.C6502a.m13948a("anchor_close_live_cancel").mo12643a(mo8627a()).mo12651a("live_type", "video_live").mo12655b();
        C6558k.m14024a(getContext());
        mo8638f();
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onFirstRTMPConnect() {
        Message obtain = Message.obtain(C3047a.f8887a, 1);
        obtain.obj = new Pair("live_type", "video");
        C3047a.f8887a.sendMessage(obtain);
        C3047a.m8356a("rtmp_connected", String.valueOf(System.currentTimeMillis()));
        C3047a.m8355a();
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onReconnect() {
        isViewValid();
        if (!this.f9399H) {
            C11226ao.m19882a(getContext(), (int) R.string.gqa);
            C6501b.C6502a.m13948a("livesdk_anchor_network_error").mo12651a("error_type", "1").mo12655b();
            C3051c.C3052a.m8359a("ttlive_reconnect_stream").mo12632a();
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onReconnected() {
        C11226ao.m19882a(getContext(), (int) R.string.gr6);
        C6501b.C6502a.m13948a("livesdk_anchor_network_error").mo12651a("error_type", "2").mo12655b();
        C3051c.C3052a.m8359a("ttlive_reconnect_stream_success").mo12632a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (!this.f9398G) {
            m8750a(C8781a.class);
            m8750a(C7400q.class);
            C3051c.C3052a.m8359a("ttlive_page_start").mo12633b("broadcast").mo12632a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        C3687b bVar;
        super.onStop();
        if (!this.f9398G) {
            C3051c.C3052a.m8359a("ttlive_page_stop").mo12633b("broadcast").mo12632a();
            if (!this.f9399H && mo8636c().f26253a.getValue() != EnumC10927a.STREAM_ON && (bVar = this.f9425q) != null) {
                bVar.mo8959c();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$aa */
    static final class RunnableC3278aa implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3276o f9433a;

        /* renamed from: b */
        final /* synthetic */ C4423l f9434b;

        static {
            Covode.recordClassIndex(3760);
        }

        RunnableC3278aa(C3276o oVar, C4423l lVar) {
            this.f9433a = oVar;
            this.f9434b = lVar;
        }

        public final void run() {
            VideoWidget2 videoWidget2;
            View view;
            ViewGroup.LayoutParams layoutParams;
            int i;
            int i2;
            View view2;
            if (!this.f9433a.mStatusDestroyed && (videoWidget2 = this.f9433a.f9422n) != null && (view = videoWidget2.getView()) != null) {
                VideoWidget2 videoWidget22 = this.f9433a.f9422n;
                FrameLayout.LayoutParams layoutParams2 = null;
                if (videoWidget22 == null || (view2 = videoWidget22.getView()) == null) {
                    layoutParams = null;
                } else {
                    layoutParams = view2.getLayoutParams();
                }
                if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                    layoutParams = null;
                }
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
                if (layoutParams3 != null) {
                    FrameLayout frameLayout = this.f9434b.f12024b;
                    int i3 = -1;
                    if (frameLayout != null) {
                        i = frameLayout.getWidth();
                    } else {
                        i = -1;
                    }
                    layoutParams3.width = i;
                    FrameLayout frameLayout2 = this.f9434b.f12024b;
                    if (frameLayout2 != null) {
                        i3 = frameLayout2.getHeight();
                    }
                    layoutParams3.height = i3;
                    FrameLayout frameLayout3 = this.f9434b.f12024b;
                    if (frameLayout3 != null) {
                        i2 = frameLayout3.getTop();
                    } else {
                        i2 = 0;
                    }
                    layoutParams3.topMargin = i2;
                    layoutParams3.gravity = 51;
                    layoutParams2 = layoutParams3;
                }
                view.setLayoutParams(layoutParams2);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$ab */
    static final class RunnableC3279ab implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3276o f9435a;

        static {
            Covode.recordClassIndex(3761);
        }

        RunnableC3279ab(C3276o oVar) {
            this.f9435a = oVar;
        }

        public final void run() {
            VideoWidget2 videoWidget2;
            View view;
            ViewGroup.LayoutParams layoutParams;
            View view2;
            if (!this.f9435a.mStatusDestroyed && (videoWidget2 = this.f9435a.f9422n) != null && (view = videoWidget2.getView()) != null) {
                VideoWidget2 videoWidget22 = this.f9435a.f9422n;
                FrameLayout.LayoutParams layoutParams2 = null;
                if (videoWidget22 == null || (view2 = videoWidget22.getView()) == null) {
                    layoutParams = null;
                } else {
                    layoutParams = view2.getLayoutParams();
                }
                if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                    layoutParams = null;
                }
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
                if (layoutParams3 != null) {
                    AbstractC4433d linkCrossRoomWidget = ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).linkCrossRoomWidget();
                    C89219l.m154716b(linkCrossRoomWidget, "");
                    layoutParams3.width = linkCrossRoomWidget.mo10207a();
                    AbstractC4433d linkCrossRoomWidget2 = ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).linkCrossRoomWidget();
                    C89219l.m154716b(linkCrossRoomWidget2, "");
                    layoutParams3.height = linkCrossRoomWidget2.mo10208b();
                    layoutParams3.gravity = 3;
                    AbstractC4433d linkCrossRoomWidget3 = ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).linkCrossRoomWidget();
                    C89219l.m154716b(linkCrossRoomWidget3, "");
                    layoutParams3.topMargin = linkCrossRoomWidget3.mo10209c();
                    layoutParams2 = layoutParams3;
                }
                view.setLayoutParams(layoutParams2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.o$ao */
    public static final class RunnableC3292ao implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3276o f9457a;

        static {
            Covode.recordClassIndex(3774);
        }

        RunnableC3292ao(C3276o oVar) {
            this.f9457a = oVar;
        }

        public final /* synthetic */ void run() {
            if (this.f9457a.isViewValid()) {
                this.f9457a.mo8627a().mo28319c(C3018a.class);
                ((IGiftService) C6193a.m13435a(IGiftService.class)).exitRoom(true);
                this.f9457a.mo8640i();
                C3854a.m9453a(3, "LiveBroadcastFragment", "room close new NewLiveBroadcastEndFragment");
                AbstractC11678b bVar = this.f9457a.f9412d;
                if (bVar == null) {
                    C89219l.m154710a("liveBroadcastCallback");
                }
                Bundle bundle = new Bundle();
                bundle.putString("live_end_banned_url", this.f9457a.f9426r);
                bundle.putCharSequence("live_end_banned_title", this.f9457a.f9427s);
                bundle.putCharSequence("live_end_banned_reason", this.f9457a.f9428t);
                bundle.putCharSequence("live_end_banned_content", this.f9457a.f9429u);
                bVar.mo18450a(bundle);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$e */
    public static final class C3310e implements AbstractC11622a {

        /* renamed from: a */
        final /* synthetic */ C3276o f9483a;

        static {
            Covode.recordClassIndex(3792);
        }

        @Override // com.bytedance.android.livesdkapi.depend.AbstractC11622a
        /* renamed from: a */
        public final void mo8667a() {
            C3854a.m9453a(4, "LiveBroadcastFragment", "onEnterBackground");
            AbstractC3055a aVar = this.f9483a.f9421m;
            if (aVar != null) {
                aVar.mo8297b(PrivacyCert.Builder.Companion.with("bpea-385").usage("").tag("Switch to background during live broadcast").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
            C3276o.m8749a(this.f9483a.mo8627a(), true);
            C3687b bVar = this.f9483a.f9425q;
            if (bVar != null) {
                bVar.mo8959c();
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.AbstractC11622a
        /* renamed from: b */
        public final void mo8668b() {
            C3854a.m9453a(4, "LiveBroadcastFragment", "onEnterForeground");
            C3276o.m8749a(this.f9483a.mo8627a(), false);
            if (this.f9483a.mo8636c().f26253a.getValue() == EnumC10927a.STREAM_ON && C11279p.m20019b((Boolean) this.f9483a.mo8627a().mo28318b(C9075cn.class))) {
                AbstractC3055a aVar = this.f9483a.f9421m;
                if (aVar != null) {
                    aVar.mo8289a(PrivacyCert.Builder.Companion.with("bpea-364").usage("").tag("Switch from background to foreground during live broadcast").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                }
                C3687b bVar = this.f9483a.f9425q;
                if (bVar != null) {
                    bVar.mo8958b();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3310e(C3276o oVar) {
            this.f9483a = oVar;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11679c
    /* renamed from: j */
    public final boolean mo8641j() {
        AbstractC0952i supportFragmentManager;
        List<Fragment> f;
        ActivityC0945e activity = getActivity();
        if (!(activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (f = supportFragmentManager.mo3565f()) == null)) {
            for (T t : f) {
                if (!(t instanceof AbstractC11623a)) {
                    t = null;
                }
                T t2 = t;
                if (t2 != null && t2.mo13772i_()) {
                    return true;
                }
            }
        }
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        C89219l.m154716b(childFragmentManager, "");
        List<Fragment> f2 = childFragmentManager.mo3565f();
        C89219l.m154716b(f2, "");
        for (T t3 : f2) {
            if (!(t3 instanceof AbstractC11623a)) {
                t3 = null;
            }
            T t4 = t3;
            if (t4 != null && t4.mo13772i_()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.p197f.C3229a.AbstractC3230a
    /* renamed from: m */
    public final void mo8513m() {
        View$OnClickListenerC3087f fVar;
        if (isViewValid()) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_illegal_review_dialog", true);
            C3868c.m9491a("ttlive_broadcast_action_all", 0, hashMap);
            if (this.f9403L == null) {
                Context context = getContext();
                C3229a aVar = this.f9413e;
                if (aVar == null) {
                    C89219l.m154710a("mLiveIllegalPresenter");
                }
                this.f9403L = View$OnClickListenerC3087f.m8424a(context, aVar);
                C3229a aVar2 = this.f9413e;
                if (aVar2 == null) {
                    C89219l.m154710a("mLiveIllegalPresenter");
                }
                aVar2.f9279h = this.f9403L;
            }
            if (getActivity() != null && (fVar = this.f9403L) != null) {
                AbstractC0952i childFragmentManager = getChildFragmentManager();
                C89219l.m154716b(childFragmentManager, "");
                fVar.show(childFragmentManager, "IllegalReviewDialog");
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.p197f.C3229a.AbstractC3230a
    /* renamed from: o */
    public final void mo8515o() {
        mo8632b(8);
        C3221b.m8716b(10004, m8756e(), mo8638f(), this.f9417i);
        C3854a.m9453a(3, "LiveBroadcastFragment", "room close forceEndLive");
        mo8628a(PrivacyCert.Builder.Companion.with("bpea-422").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$ad */
    static final class RunnableC3281ad implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3276o f9437a;

        /* renamed from: b */
        final /* synthetic */ SurfaceView f9438b;

        static {
            Covode.recordClassIndex(3763);
        }

        RunnableC3281ad(C3276o oVar, SurfaceView surfaceView) {
            this.f9437a = oVar;
            this.f9438b = surfaceView;
        }

        public final void run() {
            MethodCollector.m26663i(7259);
            if (this.f9437a.mStatusDestroyed) {
                MethodCollector.m26664o(7259);
                return;
            }
            ((FrameLayout) this.f9437a.mo8635c(R.id.iw)).removeAllViews();
            SurfaceView surfaceView = this.f9438b;
            AbstractC4433d linkCrossRoomWidget = ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).linkCrossRoomWidget();
            C89219l.m154716b(linkCrossRoomWidget, "");
            int a = linkCrossRoomWidget.mo10207a();
            AbstractC4433d linkCrossRoomWidget2 = ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).linkCrossRoomWidget();
            C89219l.m154716b(linkCrossRoomWidget2, "");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, linkCrossRoomWidget2.mo10208b());
            AbstractC4433d linkCrossRoomWidget3 = ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).linkCrossRoomWidget();
            C89219l.m154716b(linkCrossRoomWidget3, "");
            layoutParams.leftMargin = linkCrossRoomWidget3.mo10207a();
            AbstractC4433d linkCrossRoomWidget4 = ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).linkCrossRoomWidget();
            C89219l.m154716b(linkCrossRoomWidget4, "");
            layoutParams.topMargin = linkCrossRoomWidget4.mo10209c();
            surfaceView.setLayoutParams(layoutParams);
            ((FrameLayout) this.f9437a.mo8635c(R.id.iw)).addView(this.f9438b);
            MethodCollector.m26664o(7259);
        }
    }

    /* renamed from: t */
    private final void m8761t() {
        String str;
        if (this.f9400I > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f9400I;
            long j = this.f9419k;
            this.f9419k = 0;
            this.f9400I = 0;
            if (j > 0) {
                C6501b a = C6501b.C6502a.m13948a("livesdk_gift_effect_show_summary").mo12643a(mo8627a()).mo12651a("duration_room", String.valueOf(currentTimeMillis)).mo12651a("duration_gift_effect", String.valueOf(j));
                double d = (double) j;
                Double.isNaN(d);
                double d2 = (double) currentTimeMillis;
                Double.isNaN(d2);
                C6501b a2 = a.mo12651a("gift_effect_live_ratio", String.valueOf((d * 1.0d) / d2));
                Object b = mo8627a().mo28318b(C9119ed.class);
                if (b == null) {
                    C89219l.m154715b();
                }
                if (((Boolean) b).booleanValue()) {
                    str = "1";
                } else {
                    str = "0";
                }
                a2.mo12651a("is_anchor", str).mo12651a("room_type", "video").mo12655b();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        mo8627a().mo28316b(this);
        C3940j.m9594a().removeCallbacksAndMessages(null);
        C4217d.m10324g().mo9873a(mo8631b());
        mo8631b().removeCallbacksAndMessages(null);
        LivePerformanceManager.getInstance().reportBatteryDrainage();
        mo8632b(1);
        DataChannelGlobal.f42558d.mo28327c(C9009ac.class);
        DataChannelGlobal.f42558d.mo28327c(C3059e.class);
        C6894d.m14753a().mo13188b();
        AbstractC2953a a = C6193a.m13435a(AbstractC4357d.class);
        C89219l.m154716b(a, "");
        ((AbstractC4357d) a).getLivePlayController().mo11540d();
        try {
            ((IGiftService) C6193a.m13435a(IGiftService.class)).clearAssets("effects");
        } catch (IllegalStateException e) {
            C3854a.m9453a(6, "ALogger", e.toString());
        }
        C3051c.C3052a.m8359a("ttlive_page_destroy").mo12633b("broadcast").mo12632a();
        LivePerformanceManager instance = LivePerformanceManager.getInstance();
        instance.onModuleStop("stream");
        instance.stopTimerMonitor();
        instance.release();
        instance.setVideoCaptureFps(-1.0f);
        instance.setPreviewFps(-1.0f);
        instance.setStreamFps(-1.0d);
        C3227a.f9268b.clear();
        C3227a.f9267a.clear();
        C3227a.f9269c = false;
        LivePerformanceManager.getInstance().setExtraParams(null);
        C10095g.m18641i();
        mo8637d().mo9896b(this.f9407P);
        mo8637d().mo9894b();
        C2690b.m7786a();
        ((AbstractC5843h) C6193a.m13435a(AbstractC5843h.class)).releaseToolbarView();
        super.onDestroy();
        DataChannelGlobal.f42558d.mo28327c(C9097di.class);
        Iterator<T> it = this.f9401J.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        AbstractC88412b bVar = this.f9430v;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.f9398G) {
            m8762u();
            return;
        }
        C6201f.m13460c();
        mo8640i();
        C3687b bVar = this.f9425q;
        if (bVar != null) {
            bVar.f10148a.removeCallbacksAndMessages(null);
        }
        AbstractC3055a aVar = this.f9421m;
        if (aVar != null) {
            aVar.mo8299c(PrivacyCert.Builder.Companion.with("bpea-487").usage("").tag("release when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
        m8757p().mo8581a();
        C3229a aVar2 = this.f9413e;
        if (aVar2 == null) {
            C89219l.m154710a("mLiveIllegalPresenter");
        }
        aVar2.mo8577b();
        C11279p.m20014b(m8758q());
        ((IMessageService) C6193a.m13435a(IMessageService.class)).release(mo8638f());
        mo8638f();
        C4384b.C4385a.m10498a("LiveBroadcastFragment_OnDestroy");
        m8762u();
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (!this.f9398G) {
            if (mo8636c().f26253a.getValue() != EnumC10927a.STREAM_ON) {
                AbstractC11678b bVar = this.f9412d;
                if (bVar == null) {
                    C89219l.m154710a("liveBroadcastCallback");
                }
                C3008aa aaVar = this.f9397F;
                if (aaVar == null) {
                    C89219l.m154710a("mPhoneStateReceiver");
                }
                bVar.mo18448a(aaVar);
                PrivacyCert build = PrivacyCert.Builder.Companion.with("bpea-386").usage("").tag("Switch to background during live broadcast").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build();
                if (LivePauseLiveSetting.INSTANCE.pauseLiveEnabled()) {
                    C7417b bVar2 = this.f9431w;
                    if (bVar2 != null) {
                        bVar2.mo13621a(build);
                    }
                } else {
                    AbstractC3055a aVar = this.f9421m;
                    if (aVar != null) {
                        aVar.mo8297b(build);
                    }
                }
            }
            C3051c.C3052a.m8359a("ttlive_page_pause").mo12633b("broadcast").mo12632a();
            C10095g.m18640h();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.f9398G) {
            C10095g.m18639g();
            mo8636c().f26253a.setValue(EnumC10927a.STREAM_PAUSE);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
            AbstractC11678b bVar = this.f9412d;
            if (bVar == null) {
                C89219l.m154710a("liveBroadcastCallback");
            }
            C3008aa aaVar = this.f9397F;
            if (aaVar == null) {
                C89219l.m154710a("mPhoneStateReceiver");
            }
            bVar.mo18449a(aaVar, intentFilter);
            if (this.f9399H) {
                mo8631b().removeCallbacksAndMessages(null);
                return;
            }
            PrivacyCert build = PrivacyCert.Builder.Companion.with("bpea-365").usage("").tag("Switch from background to foreground during live broadcast").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build();
            if (!LivePauseLiveSetting.INSTANCE.pauseLiveEnabled()) {
                AbstractC3055a aVar = this.f9421m;
                if (aVar != null) {
                    aVar.mo8289a(build);
                }
                C3687b bVar2 = this.f9425q;
                if (bVar2 != null) {
                    bVar2.mo8958b();
                }
            } else if (C11279p.m20019b((Boolean) mo8627a().mo28318b(C9075cn.class))) {
                AbstractC3055a aVar2 = this.f9421m;
                if (aVar2 != null) {
                    aVar2.mo8309k(build);
                }
                C3687b bVar3 = this.f9425q;
                if (bVar3 != null) {
                    bVar3.mo8958b();
                }
            }
            C3051c.C3052a.m8359a("ttlive_page_resume").mo12633b("broadcast").mo12632a();
            C4217d.m10322e().mo9851c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.o$ag */
    public static final class RunnableC3284ag implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3276o f9441a;

        /* renamed from: b */
        final /* synthetic */ Float f9442b;

        /* renamed from: c */
        final /* synthetic */ String f9443c;

        /* renamed from: d */
        final /* synthetic */ int f9444d;

        /* renamed from: e */
        final /* synthetic */ boolean f9445e;

        static {
            Covode.recordClassIndex(3766);
        }

        RunnableC3284ag(C3276o oVar, Float f, String str, int i, boolean z) {
            this.f9441a = oVar;
            this.f9442b = f;
            this.f9443c = str;
            this.f9444d = i;
            this.f9445e = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
            if (r7 != null) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
            if (r2 != null) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
            r0 = (p4600h.C89378p) r2.getValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
            if (r0 == null) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
            r0 = (java.lang.Integer) r0.getFirst();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
            if (r0 == null) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
            r5 = r0.intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
            if (r5 >= 0) goto L_0x00ba;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
            r0 = (java.util.concurrent.ConcurrentHashMap) com.bytedance.ies.sdk.datachannel.DataChannelGlobal.f42558d.mo28324b(com.bytedance.android.livesdk.p561j.C9110dv.class);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
            if (r0 == null) goto L_0x018c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
            r0 = r0.entrySet();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
            if (r0 == null) goto L_0x018c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
            r5 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
            if (r5.hasNext() == false) goto L_0x0189;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
            r2 = r5.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a0, code lost:
            if (p4600h.p4611f.p4613b.C89219l.m154714a(((java.util.Map.Entry) r2).getKey(), (java.lang.Object) r11.f9443c) == false) goto L_0x0089;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
            r2 = (java.util.Map.Entry) r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a4, code lost:
            if (r2 == null) goto L_0x018c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
            r0 = (p4600h.C89378p) r2.getValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ac, code lost:
            if (r0 == null) goto L_0x018c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ae, code lost:
            r0 = (java.lang.Integer) r0.getFirst();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b4, code lost:
            if (r0 == null) goto L_0x018c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b6, code lost:
            r5 = r0.intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
            r0 = (java.lang.Long) com.bytedance.ies.sdk.datachannel.DataChannelGlobal.f42558d.mo28324b(com.bytedance.android.livesdk.p561j.C9141w.class);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c4, code lost:
            if (r0 == null) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c6, code lost:
            r9 = r0.longValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ca, code lost:
            r6 = 0;
            r1 = (java.util.concurrent.ConcurrentHashMap) com.bytedance.ies.sdk.datachannel.DataChannelGlobal.f42558d.mo28324b(com.bytedance.android.livesdk.p561j.C9081ct.class);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d6, code lost:
            if (r1 == null) goto L_0x00e9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d8, code lost:
            r0 = (com.bytedance.android.livesdk.p425aa.p428c.C6525d) r1.get(r11.f9443c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e0, code lost:
            if (r0 == null) goto L_0x00e9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e6, code lost:
            if (r0.f16284c >= r9) goto L_0x00e9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e8, code lost:
            r6 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e9, code lost:
            r1 = com.bytedance.android.livesdk.p425aa.C6501b.C6502a.m13948a("livesdk_live_take_beauty_effective_use").mo12643a(r11.f9441a.mo8627a()).mo12651a("beauty_type", r11.f9443c).mo12651a("beauty_type_name", r11.f9443c).mo12651a("beauty_type_name_tier2", r7).mo12649a("beauty_value", java.lang.Float.valueOf(r11.f9442b.floatValue() * 100.0f)).mo12647a("is_default_value", java.lang.Boolean.valueOf(r11.f9445e)).mo12645a("is_live_take_default", r6).mo12645a("impr_position", r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x013e, code lost:
            if (com.bytedance.android.livesdk.utils.C11279p.m20022c() == false) goto L_0x0180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0140, code lost:
            r0 = "live_take_page";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0142, code lost:
            r2 = r1.mo12658d(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0146, code lost:
            if (r4 == null) goto L_0x017e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0148, code lost:
            r0 = java.lang.Long.valueOf(r4.getId());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0150, code lost:
            r1 = r2.mo12663h(java.lang.String.valueOf(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0158, code lost:
            if (r4 == null) goto L_0x0164;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x015a, code lost:
            r0 = r4.getOwner();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x015e, code lost:
            if (r0 == null) goto L_0x0164;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0160, code lost:
            r3 = r0.getIdStr();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0164, code lost:
            r1.mo12662g(r3).mo12655b();
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal.f42558d.mo28321a(com.bytedance.android.livesdk.p561j.C9132n.class, true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x017e, code lost:
            r0 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0180, code lost:
            r0 = "live_take_detail";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0183, code lost:
            r9 = java.lang.System.currentTimeMillis();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0189, code lost:
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x018c, code lost:
            r5 = r11.f9444d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 406
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.C3276o.RunnableC3284ag.run():void");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$p */
    static final class RunnableC3323p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3276o f9496a;

        static {
            Covode.recordClassIndex(3805);
        }

        RunnableC3323p(C3276o oVar) {
            this.f9496a = oVar;
        }

        public final void run() {
            int[] iArr;
            boolean z;
            String str;
            int i;
            String str2;
            int i2;
            int i3;
            int i4;
            int i5;
            AbstractC4357d dVar;
            AbstractC5771e dnsOptimizer;
            C86137a b;
            LiveCore liveCore;
            if (this.f9496a.isAdded()) {
                C3251m.m8741a().mo8583b();
                C3276o oVar = this.f9496a;
                int value = StreamDefinitionLevelSetting.INSTANCE.getValue();
                int length = C3276o.f9390y.length;
                if (value > 0 && length >= value) {
                    iArr = C3276o.f9390y[value - 1];
                } else {
                    iArr = new int[4];
                    C11738s sVar = oVar.f9411c;
                    if (sVar == null) {
                        C89219l.m154710a("mStreamUrlExtra");
                    }
                    iArr[0] = sVar.mo18703c();
                    C11738s sVar2 = oVar.f9411c;
                    if (sVar2 == null) {
                        C89219l.m154710a("mStreamUrlExtra");
                    }
                    iArr[1] = sVar2.mo18704d();
                    C11738s sVar3 = oVar.f9411c;
                    if (sVar3 == null) {
                        C89219l.m154710a("mStreamUrlExtra");
                    }
                    iArr[2] = sVar3.mo18705e();
                    C11738s sVar4 = oVar.f9411c;
                    if (sVar4 == null) {
                        C89219l.m154710a("mStreamUrlExtra");
                    }
                    iArr[3] = sVar4.f28100h;
                }
                int value2 = StreamHardwareEncodeSetting.INSTANCE.getValue();
                if (value2 <= 0) {
                    C11738s sVar5 = oVar.f9411c;
                    if (sVar5 == null) {
                        C89219l.m154710a("mStreamUrlExtra");
                    }
                    z = sVar5.f28101i;
                } else if (value2 == 2) {
                    z = true;
                } else {
                    z = false;
                }
                C11738s sVar6 = oVar.f9411c;
                if (sVar6 == null) {
                    C89219l.m154710a("mStreamUrlExtra");
                }
                int b2 = sVar6.mo18702b();
                C11738s sVar7 = oVar.f9411c;
                if (sVar7 == null) {
                    C89219l.m154710a("mStreamUrlExtra");
                }
                int a = sVar7.mo18701a();
                int[] value3 = LiveStreamSizeSetting.INSTANCE.getValue();
                if (value3.length == 2) {
                    b2 = value3[0];
                    a = value3[1];
                }
                int i6 = iArr[0];
                int i7 = iArr[1];
                int i8 = iArr[2];
                int i9 = iArr[3];
                Integer valueOf = Integer.valueOf(LiveStreamProfileSetting.INSTANCE.getValue());
                if (valueOf.intValue() > 0 && valueOf != null) {
                    i9 = valueOf.intValue();
                }
                int[] value4 = LiveStreamBitrateSetting.INSTANCE.getValue();
                if (value4.length == 3) {
                    i7 = value4[0];
                    i6 = value4[1];
                    i8 = value4[2];
                }
                int value5 = LiveStreamBitrateAdaptSetting.INSTANCE.getValue();
                if (value5 < 0) {
                    C11738s sVar8 = oVar.f9411c;
                    if (sVar8 == null) {
                        C89219l.m154710a("mStreamUrlExtra");
                    }
                    value5 = sVar8.f28102j;
                }
                C11738s sVar9 = oVar.f9411c;
                if (sVar9 == null) {
                    C89219l.m154710a("mStreamUrlExtra");
                }
                boolean z2 = sVar9.f28110r;
                if (LiveStreamHwRoiSetting.INSTANCE.enable()) {
                    z2 = true;
                }
                C11738s sVar10 = oVar.f9411c;
                if (sVar10 == null) {
                    C89219l.m154710a("mStreamUrlExtra");
                }
                boolean z3 = sVar10.f28111s;
                if (LiveStreamSwRoiSetting.INSTANCE.enable()) {
                    z3 = true;
                }
                C89378p[] pVarArr = new C89378p[2];
                String str3 = "1";
                if (z) {
                    str = str3;
                } else {
                    str = "0";
                }
                pVarArr[0] = C89387v.m154943a("hardware", str);
                C11738s sVar11 = oVar.f9411c;
                if (sVar11 == null) {
                    C89219l.m154710a("mStreamUrlExtra");
                }
                if (sVar11.f28107o) {
                    str3 = "2";
                }
                pVarArr[1] = C89387v.m154943a("video_codec", str3);
                LivePerformanceManager.getInstance().onModuleStart("stream", C89041ag.m154428c(pVarArr));
                MediaEngineFactory.setLogLevel(LivePushStreamLogLevelSetting.INSTANCE.getValue());
                AVLog.setupLogIODevice(new C3308c(C6555i.m14021b(), EnumC6500b.PushStream.info));
                C6805b<Integer> bVar = AbstractC6804a.f17058i;
                C89219l.m154716b(bVar, "");
                Integer b3 = bVar.mo13068b();
                if (b3 != null && b3.intValue() == 0) {
                    i = 2;
                } else {
                    i = 1;
                }
                C3704d.C3705a aVar = new C3704d.C3705a(oVar.getContext());
                aVar.f10250c = 0;
                aVar.f10255h = b2;
                aVar.f10256i = a;
                aVar.f10252e = i6;
                aVar.f10251d = i7;
                aVar.f10253f = i8;
                aVar.f10258k = i9;
                if (LiveStreamEnableSdkParamsSetting.INSTANCE.enable()) {
                    Room room = oVar.f9410b;
                    if (room == null) {
                        C89219l.m154710a("mRoom");
                    }
                    StreamUrl streamUrl = room.getStreamUrl();
                    C89219l.m154716b(streamUrl, "");
                    str2 = streamUrl.f27960n;
                } else {
                    str2 = "";
                }
                aVar.f10236D = str2;
                C11738s sVar12 = oVar.f9411c;
                if (sVar12 == null) {
                    C89219l.m154710a("mStreamUrlExtra");
                }
                aVar.f10254g = sVar12.mo18706f();
                aVar.f10257j = z;
                AbstractC2953a a2 = C6193a.m13435a(AbstractC4357d.class);
                C89219l.m154716b(a2, "");
                aVar.f10269v = ((AbstractC4357d) a2).getProjectKey();
                aVar.f10237E = new C3224e();
                aVar.f10267t = new C3225f();
                aVar.f10238F = new C3223d();
                aVar.f10268u = value5;
                C11738s sVar13 = oVar.f9411c;
                if (sVar13 == null) {
                    C89219l.m154710a("mStreamUrlExtra");
                }
                if (sVar13.f28107o) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                aVar.f10272y = i2;
                C11738s sVar14 = oVar.f9411c;
                if (sVar14 == null) {
                    C89219l.m154710a("mStreamUrlExtra");
                }
                aVar.f10270w = sVar14.f28108p;
                C11738s sVar15 = oVar.f9411c;
                if (sVar15 == null) {
                    C89219l.m154710a("mStreamUrlExtra");
                }
                aVar.f10271x = sVar15.f28109q;
                aVar.f10273z = z2;
                String rOIResPath = EnumC3338p.INST.getROIResPath();
                aVar.f10233A = z3;
                aVar.f10234B = rOIResPath;
                aVar.f10235C = true;
                if (LiveUseNewAudioCodecSetting.INSTANCE.enable()) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                aVar.f10262o = i3;
                Room room2 = oVar.f9410b;
                if (room2 == null) {
                    C89219l.m154710a("mRoom");
                }
                aVar.f10246N = room2.authenticationValue;
                aVar.f10260m = (long) LiveMaxEnterBackgroundTimeSetting.INSTANCE.getValue();
                aVar.f10264q = i;
                aVar.f10265r = 5;
                aVar.f10240H = EnumC3338p.INST.getModelFilePath();
                aVar.f10241I = EnumC3338p.INST.getResourceFinder(oVar.getContext());
                aVar.f10247O = true;
                C11738s sVar16 = oVar.f9411c;
                if (sVar16 == null) {
                    C89219l.m154710a("mStreamUrlExtra");
                }
                if (sVar16.f28112t == 0) {
                    i4 = 720;
                } else {
                    i4 = sVar16.f28112t;
                }
                C11738s sVar17 = oVar.f9411c;
                if (sVar17 == null) {
                    C89219l.m154710a("mStreamUrlExtra");
                }
                if (sVar17.f28113u == 0) {
                    i5 = 1280;
                } else {
                    i5 = sVar17.f28113u;
                }
                C3704d.C3705a a3 = aVar.mo9020a(i4, i5);
                a3.f10242J = LiveUseEffectAlgorithmAbSetting.INSTANCE.enable();
                C3704d a4 = a3.mo9021a();
                C11738s sVar18 = oVar.f9411c;
                if (sVar18 == null) {
                    C89219l.m154710a("mStreamUrlExtra");
                }
                boolean z4 = sVar18.f28107o;
                C3219a.f9258i = i8;
                C3219a.f9259j = i6;
                C3219a.f9260k = i7;
                C3219a.f9261l = z4;
                C3219a.f9262m = z;
                C3219a.f9263n = b2;
                C89219l.m154716b(a4, "");
                C3678c cVar = new C3678c(a4);
                cVar.f10122d = oVar;
                DataChannelGlobal.f42558d.mo28321a(C3059e.class, cVar);
                if (!(!PushStreamSupportDnsSetting.INSTANCE.isEnable() || (dVar = (AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)) == null || (dnsOptimizer = dVar.getDnsOptimizer()) == null || (b = dnsOptimizer.mo11512b()) == null || (liveCore = cVar.f10121c) == null)) {
                    liveCore.setDns(b);
                }
                oVar.f9421m = cVar;
                C3276o oVar2 = this.f9496a;
                AbstractC3697f fVar = this.f9496a.f9432x;
                C11738s sVar19 = this.f9496a.f9411c;
                if (sVar19 == null) {
                    C89219l.m154710a("mStreamUrlExtra");
                }
                oVar2.f9422n = new VideoWidget2(fVar, sVar19, this.f9496a.f9421m);
                ((WidgetManager) this.f9496a.f9409a.getValue()).load(R.id.d6c, this.f9496a.f9422n, false);
                this.f9496a.f9431w = new C7417b(this.f9496a.mo8627a(), this.f9496a.f9421m, this.f9496a.f9425q);
                C3276o oVar3 = this.f9496a;
                Room room3 = oVar3.f9410b;
                if (room3 == null) {
                    C89219l.m154710a("mRoom");
                }
                StreamUrl streamUrl2 = room3.getStreamUrl();
                C89219l.m154716b(streamUrl2, "");
                int i10 = streamUrl2.f27949c;
                C11738s sVar20 = oVar3.f9411c;
                if (sVar20 == null) {
                    C89219l.m154710a("mStreamUrlExtra");
                }
                String str4 = sVar20.f28093a;
                if (2 == i10 && !C13627m.m24498a(str4)) {
                    C3854a.m9453a(3, "LiveBroadcastFragment", "start fetch ngb rtmp url");
                    C17305a.m32043a().mo27615a(oVar3.mo8631b(), new Callable(str4) {
                        /* class com.bytedance.android.livesdk.chatroom.p481b.C7307f.CallableC73092 */

                        /* renamed from: a */
                        final /* synthetic */ String f18167a;

                        static {
                            Covode.recordClassIndex(8072);
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return NetworkUtils.executeGet(0, this.f18167a, false, false, null, null, false);
                        }

                        {
                            this.f18167a = r2;
                        }
                    }, 13);
                    oVar3.f9414f = true;
                }
                View view = this.f9496a.getView();
                if (view != null) {
                    view.post(new Runnable(this) {
                        /* class com.bytedance.android.live.broadcast.C3276o.RunnableC3323p.RunnableC33241 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC3323p f9497a;

                        static {
                            Covode.recordClassIndex(3806);
                        }

                        {
                            this.f9497a = r1;
                        }

                        public final void run() {
                            Bundle bundle;
                            AbstractC5783o oVar;
                            C3276o oVar2 = this.f9497a.f9496a;
                            C4017b.m9800b(C4017b.EnumC4018a.ShowBInteractionFirstWidget);
                            oVar2.f9423o = new C7930dw();
                            AbstractC5783o oVar3 = oVar2.f9423o;
                            if (oVar3 != null) {
                                Fragment b = oVar3.mo11520b();
                                Bundle arguments = oVar2.getArguments();
                                AbstractC11679c.AbstractC11680a aVar = null;
                                if (arguments != null) {
                                    bundle = arguments.getBundle("extra");
                                } else {
                                    bundle = null;
                                }
                                b.setArguments(bundle);
                                oVar3.mo11559a(oVar2.f9421m);
                                DataChannel a = oVar2.mo8627a();
                                Room room = oVar2.f9410b;
                                if (room == null) {
                                    C89219l.m154710a("mRoom");
                                }
                                a.mo28315b(C9093de.class, room);
                                LivePerformanceManager.getInstance().setIsAnchor(true);
                                oVar3.mo11518a(oVar2.mo8627a(), new C3293ap(oVar2));
                                oVar3.mo11560a(oVar2.f9422n);
                                VideoWidget2 videoWidget2 = oVar2.f9422n;
                                if (videoWidget2 != null) {
                                    if (!(oVar3 instanceof AbstractC11679c.AbstractC11681b)) {
                                        oVar = null;
                                    } else {
                                        oVar = oVar3;
                                    }
                                    videoWidget2.f10443j = (AbstractC11679c.AbstractC11681b) oVar;
                                }
                                VideoWidget2 videoWidget22 = oVar2.f9422n;
                                if (videoWidget22 != null) {
                                    if (oVar3 instanceof AbstractC11679c.AbstractC11680a) {
                                        aVar = oVar3;
                                    }
                                    videoWidget22.f10444k = aVar;
                                }
                                oVar3.mo11519a(new RunnableC3300aw(oVar2, oVar3));
                                if (oVar2.isAdded()) {
                                    oVar2.getChildFragmentManager().mo3552a().mo3470b(R.id.bpb, oVar3.mo11520b(), "AbsInteractionFragment").mo3478e();
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onStreamStart() {
        long currentTimeMillis;
        this.f9417i = false;
        AbstractC5783o oVar = this.f9423o;
        if (oVar != null) {
            oVar.mo11562d();
        }
        WeakHandler b = mo8631b();
        C11738s sVar = this.f9411c;
        if (sVar == null) {
            C89219l.m154710a("mStreamUrlExtra");
        }
        C89219l.m154721d(b, "");
        C89219l.m154721d(sVar, "");
        if (!C3219a.f9251b) {
            C4017b.m9801c(C4017b.EnumC4018a.CreateLive);
            C3053d.m8364b(C3051c.C3052a.m8359a("ttlive_start_push_video_stream_all").mo12636b("duration", Long.valueOf(System.currentTimeMillis() - C3219a.f9250a))).mo12632a();
            b.postDelayed(new C3219a.RunnableC3220a("ttlive_push_video_stream_five_all"), 300000);
            b.postDelayed(new C3219a.RunnableC3220a("ttlive_push_video_stream_fifteen_all"), 900000);
            b.postDelayed(new C3219a.RunnableC3220a("ttlive_push_video_stream_twenty_five_all"), 1500000);
            C3219a.f9251b = true;
            long currentTimeMillis2 = System.currentTimeMillis();
            if (!(C3219a.f9252c == 0 || C3219a.f9256g == 0 || C3219a.f9253d == 0 || C3219a.f9256g == 0)) {
                C6501b.C6502a.m13948a("livesdk_broadcast_duration").mo12646a("first_show_camera_user", C3219a.f9256g - C3219a.f9252c).mo12646a("first_push_stream_user", currentTimeMillis2 - C3219a.f9252c).mo12646a("first_show_camera_launch", C3219a.f9256g - C3219a.f9253d).mo12646a("first_push_stream_launch", currentTimeMillis2 - C3219a.f9253d).mo12646a("video_broadcast_create_launch", C3219a.f9255f - C3219a.f9253d).mo12645a("max_bitrate", C3219a.f9258i).mo12645a("min_bitrate", C3219a.f9259j).mo12645a("default_bitrate", C3219a.f9260k).mo12645a("is_bytevc1", C3219a.f9261l ? 1 : 0).mo12645a("is_hw", C3219a.f9262m ? 1 : 0).mo12645a("definition", C3219a.f9263n).mo12655b();
            }
            C3219a.f9257h = System.currentTimeMillis();
        }
        if (LiveNewEffectPanelSetting.INSTANCE.useOldPanel()) {
            C6805b<Float> bVar = AbstractC6804a.f16888Q;
            C89219l.m154716b(bVar, "");
            Float a = bVar.mo13066a();
            C6805b<Float> bVar2 = AbstractC6804a.f16889R;
            C89219l.m154716b(bVar2, "");
            Float a2 = bVar2.mo13066a();
            C6805b<Float> bVar3 = AbstractC6804a.f16890S;
            C89219l.m154716b(bVar3, "");
            Float a3 = bVar3.mo13066a();
            Long l = (Long) DataChannelGlobal.f42558d.mo28324b(C9141w.class);
            if (l != null) {
                currentTimeMillis = l.longValue();
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            if (!C89219l.m154712a(a, 0.0f)) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) DataChannelGlobal.f42558d.mo28324b(C9081ct.class);
                if (concurrentHashMap != null) {
                    C11672a b2 = new C3215b().mo8567b();
                    C89219l.m154716b(b2, "");
                    C89219l.m154716b(a, "");
                    concurrentHashMap.put("smooth", new C6525d(b2, a.floatValue(), currentTimeMillis));
                }
                boolean a4 = C89219l.m154712a(a, LiveBeautyParamSetting.INSTANCE.getValue().f23102b.f23107b);
                AbstractC4167d g = C4217d.m10324g();
                C89219l.m154716b(a, "");
                g.mo9877a("smooth", a.floatValue(), 1, a4);
                mo8630a("smooth", a, a4, 1);
            }
            if (!C89219l.m154712a(a2, 0.0f)) {
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) DataChannelGlobal.f42558d.mo28324b(C9081ct.class);
                if (concurrentHashMap2 != null) {
                    C11672a c = new C3215b().mo8568c();
                    C89219l.m154716b(c, "");
                    C89219l.m154716b(a2, "");
                    concurrentHashMap2.put("big_eye", new C6525d(c, a2.floatValue(), currentTimeMillis));
                }
                boolean a5 = C89219l.m154712a(a2, LiveBeautyParamSetting.INSTANCE.getValue().f23103c.f23107b);
                AbstractC4167d g2 = C4217d.m10324g();
                C89219l.m154716b(a2, "");
                g2.mo9877a("big_eye", a2.floatValue(), 2, C89219l.m154712a(a2, LiveBeautyParamSetting.INSTANCE.getValue().f23103c.f23107b));
                mo8630a("big_eye", a2, a5, 2);
            }
            if (!C89219l.m154712a(a3, 0.0f)) {
                ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) DataChannelGlobal.f42558d.mo28324b(C9081ct.class);
                if (concurrentHashMap3 != null) {
                    C11672a c2 = new C3215b().mo8568c();
                    C89219l.m154716b(c2, "");
                    C89219l.m154716b(a3, "");
                    concurrentHashMap3.put("cheek", new C6525d(c2, a3.floatValue(), currentTimeMillis));
                }
                boolean a6 = C89219l.m154712a(a3, LiveBeautyParamSetting.INSTANCE.getValue().f23104d.f23107b);
                AbstractC4167d g3 = C4217d.m10324g();
                C89219l.m154716b(a3, "");
                g3.mo9877a("cheek", a3.floatValue(), 3, C89219l.m154712a(a3, LiveBeautyParamSetting.INSTANCE.getValue().f23104d.f23107b));
                mo8630a("cheek", a3, a6, 3);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$ap */
    public static final class C3293ap extends AbstractC5788t {

        /* renamed from: a */
        final /* synthetic */ C3276o f9458a;

        static {
            Covode.recordClassIndex(3775);
        }

        C3293ap(C3276o oVar) {
            this.f9458a = oVar;
        }

        @Override // com.bytedance.android.live.p379n.AbstractC5788t
        /* renamed from: a */
        public final void mo8524a(C9688bt btVar) {
            C89219l.m154721d(btVar, "");
            C3276o.m8753b(this.f9458a).mo8576a(btVar);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$aq */
    public static final class C3294aq extends C3939i {

        /* renamed from: a */
        final /* synthetic */ C3276o f9459a;

        static {
            Covode.recordClassIndex(3776);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3294aq(C3276o oVar) {
            this.f9459a = oVar;
        }

        @Override // com.bytedance.android.live.core.p218f.C3939i
        /* renamed from: a */
        public final void mo8655a(Animatable animatable) {
            C89219l.m154721d(animatable, "");
            FrameLayout frameLayout = (FrameLayout) this.f9459a.mo8635c(R.id.bp3);
            if (frameLayout != null) {
                frameLayout.setClickable(false);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$as */
    public static final class C3296as extends C3939i {

        /* renamed from: a */
        final /* synthetic */ C3276o f9461a;

        static {
            Covode.recordClassIndex(3778);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3296as(C3276o oVar) {
            this.f9461a = oVar;
        }

        @Override // com.bytedance.android.live.core.p218f.C3939i
        /* renamed from: a */
        public final void mo8655a(Animatable animatable) {
            C89219l.m154721d(animatable, "");
            FrameLayout frameLayout = (FrameLayout) this.f9461a.mo8635c(R.id.bp3);
            if (frameLayout != null) {
                frameLayout.setClickable(false);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$at */
    public static final class C3297at extends C3939i {

        /* renamed from: a */
        final /* synthetic */ C3276o f9462a;

        static {
            Covode.recordClassIndex(3779);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3297at(C3276o oVar) {
            this.f9462a = oVar;
        }

        @Override // com.bytedance.android.live.core.p218f.C3939i
        /* renamed from: a */
        public final void mo8655a(Animatable animatable) {
            C89219l.m154721d(animatable, "");
            FrameLayout frameLayout = (FrameLayout) this.f9462a.mo8635c(R.id.bp3);
            if (frameLayout != null) {
                frameLayout.setClickable(false);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$b */
    final class C3304b implements AbstractView$OnClickListenerC5841f {
        static {
            Covode.recordClassIndex(3786);
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: a */
        public final void mo8491a(View view, DataChannel dataChannel) {
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: a */
        public final void mo8492a(boolean z) {
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: b */
        public final void mo8493b(View view, DataChannel dataChannel) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C3304b() {
        }

        /* renamed from: com.bytedance.android.live.broadcast.o$b$a */
        static final class DialogInterface$OnDismissListenerC3305a implements DialogInterface.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ C3304b f9472a;

            /* renamed from: b */
            final /* synthetic */ AbstractC4155h f9473b;

            /* renamed from: c */
            final /* synthetic */ Float f9474c;

            /* renamed from: d */
            final /* synthetic */ Float f9475d;

            /* renamed from: e */
            final /* synthetic */ Float f9476e;

            static {
                Covode.recordClassIndex(3787);
            }

            DialogInterface$OnDismissListenerC3305a(C3304b bVar, AbstractC4155h hVar, Float f, Float f2, Float f3) {
                this.f9472a = bVar;
                this.f9473b = hVar;
                this.f9474c = f;
                this.f9475d = f2;
                this.f9476e = f3;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                Float e = this.f9473b.mo9858e("smooth/frag/smoothIntensity");
                Float e2 = this.f9473b.mo9858e("FaceDistortionEyeIntensity");
                Float e3 = this.f9473b.mo9858e("FaceDistortionCheekIntensity");
                if (!C89219l.m154713a(this.f9474c, e)) {
                    C3276o.this.mo8630a("smooth", e, C89219l.m154712a(e, LiveBeautyParamSetting.INSTANCE.getValue().f23102b.f23107b), 1);
                }
                if (!C89219l.m154713a(e2, this.f9475d)) {
                    C3276o.this.mo8630a("big_eye", e2, C89219l.m154712a(e2, LiveBeautyParamSetting.INSTANCE.getValue().f23103c.f23107b), 2);
                }
                if (!C89219l.m154713a(this.f9476e, e3)) {
                    C3276o.this.mo8630a("cheek", e3, C89219l.m154712a(e3, LiveBeautyParamSetting.INSTANCE.getValue().f23104d.f23107b), 3);
                }
            }
        }

        /* renamed from: com.bytedance.android.live.broadcast.o$b$b */
        static final class DialogInterface$OnDismissListenerC3306b implements DialogInterface.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ C3304b f9477a;

            static {
                Covode.recordClassIndex(3788);
            }

            DialogInterface$OnDismissListenerC3306b(C3304b bVar) {
                this.f9477a = bVar;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                String str;
                int i;
                AbstractC4169e eVar;
                AbstractC4169e eVar2;
                C4217d.m10324g().mo9874a(C3276o.this.mo8631b(), C3276o.this.mo8627a(), false);
                AbstractC4167d g = C4217d.m10324g();
                DataChannel a = C3276o.this.mo8627a();
                VideoWidget2 videoWidget2 = C3276o.this.f9422n;
                if (videoWidget2 == null || (eVar2 = videoWidget2.f10440g) == null || (str = eVar2.mo9887e()) == null) {
                    str = "";
                }
                VideoWidget2 videoWidget22 = C3276o.this.f9422n;
                if (videoWidget22 == null || (eVar = videoWidget22.f10440g) == null) {
                    i = -1;
                } else {
                    i = eVar.mo9888f();
                }
                g.mo9878b(a, false, str, true, i + 1);
            }
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            if (C3276o.this.f9422n != null) {
                C6501b.C6502a.m13948a("live_take_beauty_click").mo12643a(C3276o.this.mo8627a()).mo12654b("live_take").mo12656c("click").mo12655b();
                String valueOf = String.valueOf(C3276o.this.mo8638f());
                String valueOf2 = String.valueOf(C3276o.m8747a(C3276o.this).getOwnerUserId());
                if (LiveNewEffectPanelSetting.INSTANCE.useNewPanel()) {
                    AbstractC11293v b = C4217d.m10319b();
                    AbstractC0952i childFragmentManager = C3276o.this.getChildFragmentManager();
                    C89219l.m154716b(childFragmentManager, "");
                    b.show(childFragmentManager, "");
                    b.f27012r = new DialogInterface$OnDismissListenerC3306b(this);
                    return;
                }
                AbstractC4155h d = C4217d.m10321d();
                Float e = d.mo9858e("smooth/frag/smoothIntensity");
                Float e2 = d.mo9858e("FaceDistortionEyeIntensity");
                Float e3 = d.mo9858e("FaceDistortionCheekIntensity");
                C3276o oVar = C3276o.this;
                VideoWidget2 videoWidget2 = oVar.f9422n;
                if (videoWidget2 == null) {
                    C89219l.m154715b();
                }
                AbstractC11293v a = C4217d.m10318a(videoWidget2, new C4312b(valueOf, valueOf2, "live_take_detail"));
                AbstractC0952i childFragmentManager2 = C3276o.this.getChildFragmentManager();
                C89219l.m154716b(childFragmentManager2, "");
                a.show(childFragmentManager2, "LiveBeautyFilterDialogFragment");
                a.f27012r = new DialogInterface$OnDismissListenerC3305a(this, d, e, e2, e3);
                oVar.f9424p = a;
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$j */
    public static final class C3315j implements AbstractC4170f.AbstractC4171a {

        /* renamed from: a */
        final /* synthetic */ C3276o f9488a;

        static {
            Covode.recordClassIndex(3797);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3315j(C3276o oVar) {
            this.f9488a = oVar;
        }

        @Override // com.bytedance.android.live.effect.api.AbstractC4170f.AbstractC4171a
        /* renamed from: a */
        public final void mo8671a(FilterModel filterModel, float f) {
            C89219l.m154721d(filterModel, "");
            VideoWidget2 videoWidget2 = this.f9488a.f9422n;
            if (videoWidget2 != null && videoWidget2.f10440g != null) {
                videoWidget2.f10440g.mo9883a(filterModel, f);
            }
        }

        @Override // com.bytedance.android.live.effect.api.AbstractC4170f.AbstractC4171a
        /* renamed from: a */
        public final void mo8670a(int i, boolean z, boolean z2) {
            boolean z3;
            String str;
            if (this.f9488a.f9422n != null) {
                VideoWidget2 videoWidget2 = this.f9488a.f9422n;
                if (videoWidget2 == null) {
                    C89219l.m154715b();
                }
                AbstractC4169e eVar = videoWidget2.f10440g;
                if (eVar != null) {
                    C89219l.m154716b(eVar, "");
                    eVar.mo9880a(i);
                    VideoWidget2 videoWidget22 = this.f9488a.f9422n;
                    if (videoWidget22 == null) {
                        C89219l.m154715b();
                    }
                    if (i < eVar.mo9888f()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    videoWidget22.mo9104a(z3);
                    List<FilterModel> a = this.f9488a.mo8637d().mo9890a();
                    if (i < a.size()) {
                        str = a.get(i).getFilterId();
                    } else {
                        str = "";
                    }
                    C89219l.m154716b(str, "");
                    if (str.length() > 0 && (!C89219l.m154714a((Object) str, (Object) "0"))) {
                        this.f9488a.mo8627a().mo28320c(C4173g.class, str);
                        if (LiveNewEffectPanelSetting.INSTANCE.useOldPanel()) {
                            C4217d.m10324g().mo9876a(this.f9488a.mo8627a(), z, str, z2, i + 1);
                        }
                        C3051c.C3052a.m8360b("ttlive_click_change_filter").mo12633b("broadcast").mo12629a("select_filter_id", str).mo12627a("select_filter_position", Integer.valueOf(i)).mo12632a();
                    }
                    C4217d.m10323f().mo9881a(this.f9488a.mo8638f());
                }
            }
        }
    }

    /* renamed from: a */
    private final void m8751a(Runnable runnable) {
        mo8631b().post(runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.o$ak */
    public static final class C3288ak<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3276o f9449a;

        /* renamed from: b */
        final /* synthetic */ String f9450b;

        /* renamed from: c */
        final /* synthetic */ long f9451c;

        static {
            Covode.recordClassIndex(3770);
        }

        C3288ak(C3276o oVar, String str, long j) {
            this.f9449a = oVar;
            this.f9450b = str;
            this.f9451c = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f9449a.mo8629a(this.f9450b, this.f9451c, false, (Integer) 0);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$ax */
    static final class View$OnClickListenerC3301ax implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC7913do f9467a;

        /* renamed from: b */
        final /* synthetic */ C3276o f9468b;

        static {
            Covode.recordClassIndex(3783);
        }

        View$OnClickListenerC3301ax(DialogC7913do doVar, C3276o oVar) {
            this.f9467a = doVar;
            this.f9468b = oVar;
        }

        public final void onClick(View view) {
            C3276o.m8753b(this.f9468b).mo8575a();
            this.f9467a.dismiss();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Room m8747a(C3276o oVar) {
        Room room = oVar.f9410b;
        if (room == null) {
            C89219l.m154710a("mRoom");
        }
        return room;
    }

    /* renamed from: b */
    public static final /* synthetic */ C3229a m8753b(C3276o oVar) {
        C3229a aVar = oVar.f9413e;
        if (aVar == null) {
            C89219l.m154710a("mLiveIllegalPresenter");
        }
        return aVar;
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onNetworkStatus(int i) {
        AbstractC5783o oVar;
        if (isViewValid() && (oVar = this.f9423o) != null) {
            oVar.mo11558a(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.o$af */
    public static final class C3283af<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3276o f9440a;

        static {
            Covode.recordClassIndex(3765);
        }

        C3283af(C3276o oVar) {
            this.f9440a = oVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final void accept(T t) {
            if (t instanceof C8781a) {
                this.f9440a.onEvent((C8781a) t);
            } else if (t instanceof C7400q) {
                this.f9440a.onEvent((C7400q) t);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.o$ah */
    public static final /* synthetic */ class C3285ah extends C89217j implements AbstractC89172b<PrivacyCert, C89391z> {
        static {
            Covode.recordClassIndex(3767);
        }

        C3285ah(C3276o oVar) {
            super(1, oVar, C3276o.class, "onFinishBroadcastConfirmClick", "onFinishBroadcastConfirmClick(Lcom/bytedance/bpea/basics/PrivacyCert;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(PrivacyCert privacyCert) {
            PrivacyCert privacyCert2 = privacyCert;
            C89219l.m154721d(privacyCert2, "");
            ((C3276o) this.receiver).mo8633b(privacyCert2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.o$an */
    public static final class DialogInterface$OnCancelListenerC3291an implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ Integer f9456a;

        static {
            Covode.recordClassIndex(3773);
        }

        DialogInterface$OnCancelListenerC3291an(Integer num) {
            this.f9456a = num;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            Integer num = this.f9456a;
            if (num != null && num.intValue() == 4) {
                ((IGiftService) C6193a.m13435a(IGiftService.class)).logBoostCardLiveEndClick(2);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$ba */
    static final class View$OnClickListenerC3307ba implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3276o f9478a;

        /* renamed from: b */
        final /* synthetic */ String f9479b = null;

        static {
            Covode.recordClassIndex(3789);
        }

        View$OnClickListenerC3307ba(C3276o oVar) {
            this.f9478a = oVar;
        }

        public final void onClick(View view) {
            AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
            Context context = this.f9478a.getContext();
            AbstractC6956d.C6957a b = AbstractC6963e.m14872b(this.f9479b);
            b.f17379c = true;
            webViewManager.mo13248a(context, b);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$o */
    static final class C3322o implements AbstractC4354b.AbstractC4355a {

        /* renamed from: a */
        public static final C3322o f9495a = new C3322o();

        static {
            Covode.recordClassIndex(3804);
        }

        C3322o() {
        }

        @Override // com.bytedance.android.live.p250i.p251a.AbstractC4354b.AbstractC4355a
        /* renamed from: a */
        public final void mo8672a(String str) {
            AbstractC2953a a = C6193a.m13435a(AbstractC4357d.class);
            C89219l.m154716b(a, "");
            ((AbstractC4357d) a).getLivePlayerLog().mo10106a(str);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onInfo(float f) {
        if (C11279p.m20018b()) {
            isViewValid();
        } else {
            m8751a(new RunnableC3337z(this, f));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$x */
    static final class C3332x<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C11836b f9505a;

        /* renamed from: com.bytedance.android.live.broadcast.o$x$b */
        static final class C3334b<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C3334b f9507a = new C3334b();

            static {
                Covode.recordClassIndex(3816);
            }

            C3334b() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(3814);
        }

        C3332x(C11836b bVar) {
            this.f9505a = bVar;
        }

        /* renamed from: com.bytedance.android.live.broadcast.o$x$a */
        static final class C3333a<T, R> implements AbstractC88434g {

            /* renamed from: a */
            public static final C3333a f9506a = new C3333a();

            static {
                Covode.recordClassIndex(3815);
            }

            C3333a() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                C5832d dVar = (C5832d) obj;
                C89219l.m154721d(dVar, "");
                Object obj2 = dVar.data;
                C89219l.m154716b(obj2, "");
                int i = ((C2981d) obj2).f8751a;
                if (i == 0 || i == 51) {
                    AbstractC88979t b = AbstractC88979t.m154310b(dVar);
                    C89219l.m154716b(b, "");
                    return b;
                }
                AbstractC88979t a = AbstractC88979t.m154302a(new Exception("retry"));
                C89219l.m154716b(a, "");
                return a;
            }
        }

        /* renamed from: com.bytedance.android.live.broadcast.o$x$c */
        static final class C3335c<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C3335c f9508a = new C3335c();

            static {
                Covode.recordClassIndex(3817);
            }

            C3335c() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                C89219l.m154721d(th, "");
                C3868c.m9491a("ttlive_anchor_task_report", 1, C89041ag.m154428c(C89387v.m154943a("error_msg", th.getMessage())));
            }
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C11836b bVar = this.f9505a;
            C89219l.m154716b(bVar, "");
            List<String> list = bVar.f28201d;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((LIveTaskApi) C5805e.m12718a().mo11572a(LIveTaskApi.class)).report(it.next(), new HashMap()).mo143267a((AbstractC88434g<? super C5832d<C2981d>, ? extends AbstractC88984x<? extends R>>) C3333a.f9506a, false).mo143302g(C11195i.m19837a((long) ((Math.random() * 1001.0d) + 4000.0d))).mo143254a(C3334b.f9507a, C3335c.f9508a);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$ar */
    static final class View$OnClickListenerC3295ar implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3276o f9460a;

        static {
            Covode.recordClassIndex(3777);
        }

        View$OnClickListenerC3295ar(C3276o oVar) {
            this.f9460a = oVar;
        }

        public final void onClick(View view) {
            FrameLayout frameLayout = (FrameLayout) this.f9460a.mo8635c(R.id.bp3);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(8);
            FrameLayout frameLayout2 = (FrameLayout) this.f9460a.mo8635c(R.id.bp3);
            C89219l.m154716b(frameLayout2, "");
            frameLayout2.setClickable(false);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$au */
    static final class View$OnClickListenerC3298au implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3276o f9463a;

        static {
            Covode.recordClassIndex(3780);
        }

        View$OnClickListenerC3298au(C3276o oVar) {
            this.f9463a = oVar;
        }

        public final void onClick(View view) {
            FrameLayout frameLayout = (FrameLayout) this.f9463a.mo8635c(R.id.bp3);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(8);
            FrameLayout frameLayout2 = (FrameLayout) this.f9463a.mo8635c(R.id.bp3);
            C89219l.m154716b(frameLayout2, "");
            frameLayout2.setClickable(false);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$q */
    static final class C3325q extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3276o f9498a;

        static {
            Covode.recordClassIndex(3807);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3325q(C3276o oVar) {
            super(1);
            this.f9498a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f9498a.mo8628a(PrivacyCert.Builder.Companion.with("bpea-1041").usage("").tag("paid event").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$t */
    static final class C3328t extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3276o f9501a;

        static {
            Covode.recordClassIndex(3810);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3328t(C3276o oVar) {
            super(1);
            this.f9501a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C3276o oVar = this.f9501a;
            if (booleanValue) {
                oVar.f9420l = System.currentTimeMillis();
            } else if (oVar.f9420l > 0) {
                oVar.f9419k += System.currentTimeMillis() - oVar.f9420l;
                oVar.f9420l = 0;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$w */
    static final class C3331w extends AbstractC89220m implements AbstractC89172b<C4423l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3276o f9504a;

        static {
            Covode.recordClassIndex(3813);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3331w(C3276o oVar) {
            super(1);
            this.f9504a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C4423l lVar) {
            VideoWidget2 videoWidget2;
            View view;
            C4423l lVar2 = lVar;
            C89219l.m154721d(lVar2, "");
            C3276o oVar = this.f9504a;
            if (!(!lVar2.f12026d || (videoWidget2 = oVar.f9422n) == null || (view = videoWidget2.getView()) == null)) {
                view.post(new RunnableC3278aa(oVar, lVar2));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final <T> void m8750a(Class<T> cls) {
        ((AbstractC11181z) C6779a.m14563a().mo13052a((Class) cls).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(C11152e.m19789a((Fragment) this))).mo17949a(new C3283af(this));
    }

    @Override // com.bytedance.android.live.broadcast.p197f.C3229a.AbstractC3230a
    /* renamed from: b */
    public final void mo8502b(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        if (isViewValid()) {
            m8758q().mo14214b(charSequence);
        }
    }

    public final void onEvent(C8781a aVar) {
        C89219l.m154721d(aVar, "");
        AbstractC2953a a = C6193a.m13435a(IGiftService.class);
        C89219l.m154716b(a, "");
        for (C9904t tVar : ((IGiftService) a).getStickerGifts()) {
            C89219l.m154716b(tVar, "");
            if (tVar.f24009n == aVar.f21654a) {
                C3211p.m8698a(mo8638f());
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.o$aj */
    public static final class C3287aj<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3276o f9446a;

        /* renamed from: b */
        final /* synthetic */ String f9447b;

        /* renamed from: c */
        final /* synthetic */ long f9448c;

        static {
            Covode.recordClassIndex(3769);
        }

        C3287aj(C3276o oVar, String str, long j) {
            this.f9446a = oVar;
            this.f9447b = str;
            this.f9448c = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
            if (r2 == null) goto L_0x0032;
         */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r8) {
            /*
                r7 = this;
                com.bytedance.android.live.network.response.d r8 = (com.bytedance.android.live.network.response.C5832d) r8
                java.lang.Object r0 = r8.data
                com.bytedance.android.live.broadcast.model.b r0 = (com.bytedance.android.live.broadcast.model.C3254b) r0
                int r1 = r0.f9311b
                r0 = 4
                if (r1 != r0) goto L_0x0016
                java.lang.Class<com.bytedance.android.live.gift.IGiftService> r0 = com.bytedance.android.live.gift.IGiftService.class
                com.bytedance.android.live.base.a r0 = com.bytedance.android.live.p407t.C6193a.m13435a(r0)
                com.bytedance.android.live.gift.IGiftService r0 = (com.bytedance.android.live.gift.IGiftService) r0
                r0.logBoostCardLiveEndShow()
            L_0x0016:
                com.bytedance.android.live.broadcast.o r1 = r7.f9446a
                java.lang.Object r0 = r8.data
                com.bytedance.android.live.broadcast.model.b r0 = (com.bytedance.android.live.broadcast.model.C3254b) r0
                if (r0 == 0) goto L_0x0032
                com.bytedance.android.live.broadcast.model.b$a r0 = r0.f9310a
                if (r0 == 0) goto L_0x0032
                java.lang.String r2 = r0.f9312a
                if (r2 == 0) goto L_0x0032
                int r0 = r2.length()
                if (r0 != 0) goto L_0x002e
                java.lang.String r2 = r7.f9447b
            L_0x002e:
                java.lang.String r2 = (java.lang.String) r2
                if (r2 != 0) goto L_0x0034
            L_0x0032:
                java.lang.String r2 = r7.f9447b
            L_0x0034:
                long r3 = r7.f9448c
                r5 = 1
                java.lang.Object r0 = r8.data
                com.bytedance.android.live.broadcast.model.b r0 = (com.bytedance.android.live.broadcast.model.C3254b) r0
                int r0 = r0.f9311b
                java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
                r1.mo8629a(r2, r3, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.C3276o.C3287aj.accept(java.lang.Object):void");
        }
    }

    /* renamed from: b */
    public final void mo8632b(int i) {
        C3854a.m9453a(3, "LiveBroadcastFragment", "stopLive: reason=".concat(String.valueOf(i)));
        C3687b bVar = this.f9425q;
        if (bVar != null) {
            bVar.mo8957a(i);
        }
        mo8631b().removeCallbacksAndMessages(null);
        if (this.f9413e != null) {
            C3229a aVar = this.f9413e;
            if (aVar == null) {
                C89219l.m154710a("mLiveIllegalPresenter");
            }
            aVar.mo8578c();
        }
        this.f9399H = true;
        C4017b.m9801c(C4017b.EnumC4018a.CreateLive);
        m8761t();
        LivePerformanceManager.getInstance().onExitRoom();
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$r */
    static final class C3326r extends AbstractC89220m implements AbstractC89172b<C7399p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3276o f9499a;

        static {
            Covode.recordClassIndex(3808);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3326r(C3276o oVar) {
            super(1);
            this.f9499a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C7399p pVar) {
            MethodCollector.m26663i(7412);
            C7399p pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            C3276o oVar = this.f9499a;
            if (oVar.isViewValid()) {
                int i = pVar2.f18332a;
                if (i == 7) {
                    C3854a.m9453a(3, "interact", "onEvent pause normal stream push");
                    oVar.f9416h = true;
                    C3687b bVar = oVar.f9425q;
                    if (bVar != null) {
                        bVar.mo8956a();
                    }
                } else if (i == 8) {
                    C3854a.m9453a(3, "interact", "onEvent resume normal stream push");
                    oVar.f9416h = false;
                } else if (i == 10) {
                    ((FrameLayout) oVar.mo8635c(R.id.iw)).removeAllViews();
                    Object obj = pVar2.f18333b;
                    if (obj != null) {
                        SurfaceView surfaceView = (SurfaceView) obj;
                        surfaceView.setLayoutParams(new WindowManager.LayoutParams(-1, -1));
                        ((FrameLayout) oVar.mo8635c(R.id.iw)).addView(surfaceView);
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.SurfaceView");
                        MethodCollector.m26664o(7412);
                        throw nullPointerException;
                    }
                } else if (i == 11) {
                    ((FrameLayout) oVar.mo8635c(R.id.iw)).removeAllViews();
                }
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(7412);
            return zVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$s */
    static final class C3327s extends AbstractC89220m implements AbstractC89172b<C7398o, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3276o f9500a;

        static {
            Covode.recordClassIndex(3809);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3327s(C3276o oVar) {
            super(1);
            this.f9500a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C7398o oVar) {
            View view;
            View view2;
            View view3;
            VideoWidget2 videoWidget2;
            View view4;
            VideoWidget2 videoWidget22;
            View view5;
            C7398o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            C3276o oVar3 = this.f9500a;
            if (oVar3.isViewValid() && (view = oVar3.getView()) != null) {
                C89219l.m154716b(view, "");
                int i = oVar2.f18328a;
                SurfaceView surfaceView = null;
                if (i == 0) {
                    Room room = oVar3.f9410b;
                    if (room == null) {
                        C89219l.m154710a("mRoom");
                    }
                    if (room.background != null) {
                        C13628n.m24510a(oVar3.mo8635c(R.id.c_w), 0);
                        if (Build.VERSION.SDK_INT >= 23) {
                            HSImageView hSImageView = (HSImageView) oVar3.mo8635c(R.id.c_w);
                            C89219l.m154716b(hSImageView, "");
                            hSImageView.setForeground(null);
                        }
                        HSImageView hSImageView2 = (HSImageView) oVar3.mo8635c(R.id.c_w);
                        Room room2 = oVar3.f9410b;
                        if (room2 == null) {
                            C89219l.m154710a("mRoom");
                        }
                        C3941k.m9601a(hSImageView2, room2.background);
                    } else {
                        view.setBackgroundResource(2131234045);
                    }
                    VideoWidget2 videoWidget23 = oVar3.f9422n;
                    if (!(videoWidget23 == null || (view2 = videoWidget23.getView()) == null)) {
                        view2.post(new RunnableC3279ab(oVar3));
                    }
                } else if (i == 1) {
                    view.setBackgroundColor(Color.parseColor("#303342"));
                    C13628n.m24510a(oVar3.mo8635c(R.id.c_w), 8);
                    VideoWidget2 videoWidget24 = oVar3.f9422n;
                    if (!(videoWidget24 == null || (view3 = videoWidget24.getView()) == null)) {
                        view3.post(new RunnableC3280ac(oVar3));
                    }
                } else if (i == 2) {
                    Object obj = oVar2.f18329b;
                    if (obj instanceof SurfaceView) {
                        surfaceView = obj;
                    }
                    SurfaceView surfaceView2 = surfaceView;
                    if (!(surfaceView2 == null || (videoWidget2 = oVar3.f9422n) == null || (view4 = videoWidget2.getView()) == null)) {
                        view4.post(new RunnableC3281ad(oVar3, surfaceView2));
                    }
                } else if (!(i != 3 || (videoWidget22 = oVar3.f9422n) == null || (view5 = videoWidget22.getView()) == null)) {
                    view5.post(new RunnableC3282ae(oVar3));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static void m8748a(long j) {
        long j2;
        long currentTimeMillis;
        String str = "";
        if (!TextUtils.isEmpty((CharSequence) DataChannelGlobal.f42558d.mo28324b(C9019am.class))) {
            Long l = (Long) DataChannelGlobal.f42558d.mo28324b(C9141w.class);
            if (l != null) {
                currentTimeMillis = l.longValue();
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            String str2 = (String) DataChannelGlobal.f42558d.mo28324b(C9019am.class);
            if (str2 != null) {
                str = str2;
            }
            C3726f.C3727a.m9237a(str, AbstractC6804a.f16886O.mo13066a().intValue() + 1, j, currentTimeMillis);
            return;
        }
        AbstractC2953a a = C6193a.m13435a(IEffectService.class);
        C89219l.m154716b(a, str);
        AbstractC4170f liveFilterManager = ((IEffectService) a).getLiveFilterManager();
        Integer a2 = AbstractC6804a.f16886O.mo13066a();
        if (a2.intValue() < liveFilterManager.mo9890a().size()) {
            List<FilterModel> a3 = liveFilterManager.mo9890a();
            C89219l.m154716b(a2, str);
            String filterId = a3.get(a2.intValue()).getFilterId();
            C89386u uVar = (C89386u) DataChannelGlobal.f42558d.mo28324b(C9082cu.class);
            Long l2 = (Long) DataChannelGlobal.f42558d.mo28324b(C9141w.class);
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = 0;
            }
            if (uVar != null && C89219l.m154714a(uVar.getFirst(), (Object) filterId)) {
                j2 = ((Number) uVar.getThird()).longValue();
            }
            C89219l.m154716b(filterId, str);
            C3726f.C3727a.m9237a(filterId, a2.intValue() + 1, j2, j);
        }
    }

    /* renamed from: c */
    private final void m8755c(PrivacyCert privacyCert) {
        if (this.mStatusActive && !this.f9399H && !this.f9416h) {
            Room room = this.f9410b;
            if (room == null) {
                C89219l.m154710a("mRoom");
            }
            StreamUrl streamUrl = room.getStreamUrl();
            C89219l.m154716b(streamUrl, "");
            String str = streamUrl.f27963q;
            if (str == null || str.length() == 0) {
                Room room2 = this.f9410b;
                if (room2 == null) {
                    C89219l.m154710a("mRoom");
                }
                StreamUrl streamUrl2 = room2.getStreamUrl();
                C89219l.m154716b(streamUrl2, "");
                Room room3 = this.f9410b;
                if (room3 == null) {
                    C89219l.m154710a("mRoom");
                }
                StreamUrl streamUrl3 = room3.getStreamUrl();
                C89219l.m154716b(streamUrl3, "");
                streamUrl2.f27963q = streamUrl3.mo18682a();
            }
            AbstractC3055a aVar = this.f9421m;
            if (aVar != null) {
                aVar.mo8306h(privacyCert);
            }
            C3708f.m9212a("capture_audio");
            C6497a a = C3051c.C3052a.m8359a("ttlive_stream_url");
            if (LiveStreamEnableUrlListSetting.INSTANCE.enable()) {
                AbstractC3055a aVar2 = this.f9421m;
                if (aVar2 != null) {
                    Room room4 = this.f9410b;
                    if (room4 == null) {
                        C89219l.m154710a("mRoom");
                    }
                    StreamUrl streamUrl4 = room4.getStreamUrl();
                    C89219l.m154716b(streamUrl4, "");
                    aVar2.mo8294a(streamUrl4.f27951e);
                }
                Room room5 = this.f9410b;
                if (room5 == null) {
                    C89219l.m154710a("mRoom");
                }
                StreamUrl streamUrl5 = room5.getStreamUrl();
                C89219l.m154716b(streamUrl5, "");
                a.mo12629a("url_list", streamUrl5.f27951e.toString());
            } else {
                AbstractC3055a aVar3 = this.f9421m;
                if (aVar3 != null) {
                    Room room6 = this.f9410b;
                    if (room6 == null) {
                        C89219l.m154710a("mRoom");
                    }
                    StreamUrl streamUrl6 = room6.getStreamUrl();
                    C89219l.m154716b(streamUrl6, "");
                    aVar3.mo8293a(streamUrl6.f27963q);
                }
                Room room7 = this.f9410b;
                if (room7 == null) {
                    C89219l.m154710a("mRoom");
                }
                StreamUrl streamUrl7 = room7.getStreamUrl();
                C89219l.m154716b(streamUrl7, "");
                a.mo12629a("url", streamUrl7.f27963q);
            }
            a.mo12632a();
            mo8627a().mo28315b(C3065g.class, (Object) true);
        }
    }

    /* renamed from: b */
    public final void mo8634b(String str) {
        Runnable remove = this.f9402K.remove(str);
        if (remove != null) {
            mo8631b().removeCallbacks(remove);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        C89219l.m154721d(message, "");
        int i = 0;
        if (message.what == 3) {
            Object obj = message.obj;
            if (!(obj instanceof C2912a)) {
                obj = null;
            }
            C2908a aVar = (C2908a) obj;
            if (aVar != null) {
                i = aVar.getErrorCode();
            }
            mo8530a(i);
        } else if (message.obj instanceof Exception) {
            if (message.what == 13) {
                C3854a.m9453a(6, "LiveBroadcastFragment", "fetch ngb rtmp url failed");
                this.f9414f = false;
                m8755c(PrivacyCert.Builder.Companion.with("bpea-459").usage("").tag("start audio capture when live starts").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        } else if (message.what == 13) {
            this.f9414f = false;
            Object obj2 = message.obj;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Room room = this.f9410b;
            if (room == null) {
                C89219l.m154710a("mRoom");
            }
            StreamUrl streamUrl = room.getStreamUrl();
            StringBuilder append = new StringBuilder().append(str);
            C11738s sVar = this.f9411c;
            if (sVar == null) {
                C89219l.m154710a("mStreamUrlExtra");
            }
            streamUrl.f27962p = append.append(sVar.f28094b).toString();
            C3854a.m9453a(3, "LiveBroadcastFragment", "fetch ngb RTMP url, url = ".concat(String.valueOf(str)));
            m8755c(PrivacyCert.Builder.Companion.with("bpea-460").usage("").tag("start audio capture when live starts").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        C11117b.m19749a(getActivity());
        super.onActivityCreated(bundle);
        ActivityC0945e activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.setSoftInputMode(50);
        }
        if (!this.f9398G) {
            AbstractC2953a a = C6193a.m13435a(AbstractC4357d.class);
            C89219l.m154716b(a, "");
            ((AbstractC4357d) a).getGpuInfoFetcher().mo10105a(getActivity(), getView(), C3322o.f9495a);
            C3047a.m8356a("live_page_load", String.valueOf(System.currentTimeMillis()));
            C3053d.m8364b(C3051c.C3052a.m8359a("ttlive_broadcast_created_all").mo12636b("duration", Long.valueOf(System.currentTimeMillis() - C3219a.f9250a))).mo12632a();
            C3219a.f9250a = System.currentTimeMillis();
            C3219a.f9255f = System.currentTimeMillis();
            View view = getView();
            if (view != null) {
                view.post(new RunnableC3323p(this));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$u */
    static final class C3329u extends AbstractC89220m implements AbstractC89172b<EnumC9050bp, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3276o f9502a;

        static {
            Covode.recordClassIndex(3811);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3329u(C3276o oVar) {
            super(1);
            this.f9502a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC9050bp bpVar) {
            C89219l.m154721d(bpVar, "");
            if (bpVar == EnumC9050bp.SHOWING && BroadcastLiveCenterSetting.INSTANCE.enable()) {
                C3276o oVar = this.f9502a;
                C6805b<Boolean> bVar = AbstractC6804a.f17014cJ;
                C89219l.m154716b(bVar, "");
                Boolean a = bVar.mo13066a();
                C89219l.m154716b(a, "");
                if (a.booleanValue() && oVar.f9418j) {
                    FrameLayout frameLayout = (FrameLayout) oVar.mo8635c(R.id.bp3);
                    C89219l.m154716b(frameLayout, "");
                    frameLayout.setVisibility(0);
                    C3935h hVar = new C3935h();
                    HSImageView hSImageView = (HSImageView) oVar.mo8635c(R.id.bcn);
                    C89219l.m154716b(hSImageView, "");
                    C3935h a2 = hVar.mo9278a(hSImageView).mo9279a("tiktok_live_broadcast_resource");
                    a2.f10817b = true;
                    a2.mo9277a(new C3294aq(oVar));
                    if (C3966y.m9672g()) {
                        hVar.mo9281b("ttlive_livecenter_guide_hand.webp");
                        hVar.mo9280a();
                    } else {
                        hVar.mo9281b("ttlive_livecenter_guide_hand_rtl.webp");
                        hVar.mo9280a();
                    }
                    ((LiveTextView) oVar.mo8635c(R.id.ca5)).mo9623a(R.style.te);
                    LiveTextView liveTextView = (LiveTextView) oVar.mo8635c(R.id.ca5);
                    C89219l.m154716b(liveTextView, "");
                    liveTextView.setText(C3966y.m9657a((int) R.string.e6b));
                    ObjectAnimator duration = ObjectAnimator.ofFloat(oVar.mo8635c(R.id.ca5), "alpha", 0.0f, 1.0f).setDuration(180L);
                    C89219l.m154716b(duration, "");
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(oVar.mo8635c(R.id.ca5), "alpha", 1.0f, 0.0f).setDuration(180L);
                    C89219l.m154716b(duration2, "");
                    duration2.setStartDelay(696);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(duration, duration2);
                    animatorSet.start();
                    FrameLayout frameLayout2 = (FrameLayout) oVar.mo8635c(R.id.bp3);
                    C89219l.m154716b(frameLayout2, "");
                    frameLayout2.setClickable(true);
                    ((FrameLayout) oVar.mo8635c(R.id.bp3)).setOnClickListener(new View$OnClickListenerC3295ar(oVar));
                    C6805b<Boolean> bVar2 = AbstractC6804a.f17014cJ;
                    C89219l.m154716b(bVar2, "");
                    C6806c.m14603a((C6800c) bVar2, (Object) false);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$v */
    static final class C3330v extends AbstractC89220m implements AbstractC89172b<C9627ay, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3276o f9503a;

        static {
            Covode.recordClassIndex(3812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3330v(C3276o oVar) {
            super(1);
            this.f9503a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C9627ay ayVar) {
            C9627ay ayVar2 = ayVar;
            C89219l.m154721d(ayVar2, "");
            if (ayVar2.f23446h == 1) {
                this.f9503a.f9418j = true;
                if (BroadcastLiveCenterSetting.INSTANCE.enable()) {
                    C3276o oVar = this.f9503a;
                    C6805b<Boolean> bVar = AbstractC6804a.f17013cI;
                    C89219l.m154716b(bVar, "");
                    Boolean a = bVar.mo13066a();
                    C89219l.m154716b(a, "");
                    if (a.booleanValue()) {
                        FrameLayout frameLayout = (FrameLayout) oVar.mo8635c(R.id.bp3);
                        C89219l.m154716b(frameLayout, "");
                        frameLayout.setVisibility(0);
                        C3935h hVar = new C3935h();
                        HSImageView hSImageView = (HSImageView) oVar.mo8635c(R.id.bcn);
                        C89219l.m154716b(hSImageView, "");
                        C3935h a2 = hVar.mo9278a(hSImageView).mo9279a("tiktok_live_broadcast_resource");
                        a2.f10817b = true;
                        a2.mo9277a(new C3296as(oVar));
                        C3935h hVar2 = new C3935h();
                        HSImageView hSImageView2 = (HSImageView) oVar.mo8635c(R.id.ss);
                        C89219l.m154716b(hSImageView2, "");
                        C3935h a3 = hVar2.mo9278a(hSImageView2).mo9279a("tiktok_live_broadcast_resource");
                        a3.f10817b = true;
                        a3.f10818c = true;
                        a3.mo9277a(new C3297at(oVar));
                        if (C3966y.m9672g()) {
                            hVar.mo9281b("ttlive_livecenter_guide_hand_rtl.webp");
                            hVar2.mo9281b("ttlive_livecenter_guide_black_line_rtl.webp");
                            hVar.mo9280a();
                            hVar2.mo9280a();
                        } else {
                            hVar.mo9281b("ttlive_livecenter_guide_hand.webp");
                            hVar2.mo9281b("ttlive_livecenter_guide_black_line.webp");
                            hVar.mo9280a();
                            hVar2.mo9280a();
                        }
                        ((LiveTextView) oVar.mo8635c(R.id.ca5)).mo9623a(R.style.te);
                        LiveTextView liveTextView = (LiveTextView) oVar.mo8635c(R.id.ca5);
                        C89219l.m154716b(liveTextView, "");
                        liveTextView.setText(C3966y.m9657a((int) R.string.e6c));
                        ObjectAnimator duration = ObjectAnimator.ofFloat(oVar.mo8635c(R.id.ca5), "alpha", 0.0f, 1.0f).setDuration(180L);
                        C89219l.m154716b(duration, "");
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(oVar.mo8635c(R.id.ca5), "alpha", 1.0f, 0.0f).setDuration(180L);
                        C89219l.m154716b(duration2, "");
                        duration2.setStartDelay(2808);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playSequentially(duration, duration2);
                        animatorSet.start();
                        FrameLayout frameLayout2 = (FrameLayout) oVar.mo8635c(R.id.bp3);
                        C89219l.m154716b(frameLayout2, "");
                        frameLayout2.setClickable(true);
                        ((FrameLayout) oVar.mo8635c(R.id.bp3)).setOnClickListener(new View$OnClickListenerC3298au(oVar));
                        C6805b<Boolean> bVar2 = AbstractC6804a.f17013cI;
                        C89219l.m154716b(bVar2, "");
                        C6806c.m14603a((C6800c) bVar2, (Object) false);
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00fe  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m8754b(long r8) {
        /*
        // Method dump skipped, instructions count: 264
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.C3276o.m8754b(long):void");
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        C10085b value;
        DataChannelGlobal.f42558d.mo28322a(this, this, C9103do.class, new C3325q(this));
        C6560m.f16387j = true;
        C6497a a = C3051c.C3052a.m8359a("ttlive_enter_broadcast_all");
        C6805b<Float> bVar = AbstractC6804a.f16888Q;
        C89219l.m154716b(bVar, "");
        C6497a a2 = a.mo12626a("beauty_skin", bVar.mo13066a());
        C6805b<Float> bVar2 = AbstractC6804a.f16889R;
        C89219l.m154716b(bVar2, "");
        C6497a a3 = a2.mo12626a("big_eyes", bVar2.mo13066a());
        C6805b<Float> bVar3 = AbstractC6804a.f16890S;
        C89219l.m154716b(bVar3, "");
        C6497a a4 = a3.mo12626a("face_lift", bVar3.mo13066a());
        C6805b<Integer> bVar4 = AbstractC6804a.f17058i;
        C89219l.m154716b(bVar4, "");
        Integer a5 = bVar4.mo13066a();
        if (a5 != null && a5.intValue() == 1) {
            str = "front";
        } else {
            str = "back";
        }
        C6497a a6 = a4.mo12629a("camera_type", str);
        C6805b<Integer> bVar5 = AbstractC6804a.f16886O;
        C89219l.m154716b(bVar5, "");
        C3053d.m8364b(a6.mo12627a("filter_position", bVar5.mo13066a()).mo12636b("duration", Long.valueOf(System.currentTimeMillis() - C3219a.f9250a))).mo12632a();
        C3219a.f9250a = System.currentTimeMillis();
        C3219a.f9251b = false;
        C3219a.f9254e = System.currentTimeMillis();
        this.f9400I = System.currentTimeMillis();
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        mo8627a().mo28311a(C9021ao.class, getChildFragmentManager());
        super.onCreate(bundle);
        C10095g.f24530d = true;
        AbstractC89244h<C10085b> hVar = C10095g.f24528b.get("broadcast_enter");
        if (!(hVar == null || (value = hVar.getValue()) == null)) {
            value.f24497c = true;
            value.mo16948a();
            C10095g.m18632a().postDelayed(new C10095g.RunnableC10122b(value), C10095g.f24527a);
        }
        C2690b.m7788a(getContext());
        ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).preloadWidgetView();
        EnumC8917a.LiveResource.preload();
        AbstractC2953a a7 = C6193a.m13435a(AbstractC4357d.class);
        C89219l.m154716b(a7, "");
        ((AbstractC4357d) a7).getLivePlayController().mo11537c();
        mo8627a().mo28314b(C4441l.class, (AbstractC89172b) new C3326r(this)).mo28312a((Object) this, C4450t.class, (AbstractC89172b) new C3327s(this)).mo28314b(C4346v.class, (AbstractC89172b) new C3328t(this)).mo28313b((AbstractC1204m) this, C9051bq.class, (AbstractC89172b) new C3329u(this)).mo28309a((AbstractC1204m) this, C9067cf.class, (AbstractC89172b) new C3330v(this)).mo28312a((Object) this, C4403aq.class, (AbstractC89172b) new C3331w(this));
        if (C13627m.m24499a("referral_task", (String) DataChannelGlobal.f42558d.mo28324b(C3015ag.class))) {
            AbstractC2953a a8 = C6193a.m13435a(IHostAction.class);
            C89219l.m154716b(a8, "");
            List<C11836b> liveActivityTasksSetting = ((IHostAction) a8).getLiveActivityTasksSetting();
            if (liveActivityTasksSetting != null && liveActivityTasksSetting.size() > 0) {
                for (T t : liveActivityTasksSetting) {
                    C89219l.m154716b(t, "");
                    Integer num = t.f28199b;
                    if (num != null && num.intValue() == 4) {
                        Long l = t.f28200c;
                        C89219l.m154716b(l, "");
                        AbstractC88412b d = AbstractC88979t.m154285a(l.longValue(), TimeUnit.SECONDS, C88391a.m153580a(C88392a.f200660a)).mo143289d(new C3332x(t));
                        List<AbstractC88412b> list = this.f9401J;
                        C89219l.m154716b(d, "");
                        list.add(d);
                    }
                }
            }
        }
        register(((IHostApp) C6193a.m13435a(IHostApp.class)).registerAppEnterForeBackgroundCallback(this.f9406O));
        C3227a.f9269c = true;
        LivePerformanceManager.getInstance().setExtraParams(C3227a.f9267a);
        DataChannelGlobal.f42558d.mo28325b(C9141w.class, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.bytedance.android.live.broadcast.p199h.AbstractC3243a
    /* renamed from: a */
    public final void mo8530a(int i) {
        if (i == 30001 || i == 30003 || i == 50002) {
            m8752a(false, PrivacyCert.Builder.Companion.with("bpea-423").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            C3221b.m8715a(i, m8756e(), mo8638f(), this.f9417i);
        }
    }

    /* renamed from: b */
    public final void mo8633b(PrivacyCert privacyCert) {
        String str;
        C6501b.C6502a.m13948a("anchor_close_live_confirm").mo12643a(mo8627a()).mo12651a("live_type", "video_live").mo12655b();
        long currentTimeMillis = System.currentTimeMillis();
        m8748a(currentTimeMillis);
        m8754b(currentTimeMillis);
        DataChannelGlobal.f42558d.mo28321a(C9019am.class, "");
        HashSet hashSet = (HashSet) DataChannelGlobal.f42558d.mo28324b(C9080cs.class);
        if (hashSet != null) {
            hashSet.clear();
        }
        DataChannelGlobal.f42558d.mo28321a(C9082cu.class, new C89386u("", Float.valueOf(0.0f), 0L));
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) DataChannelGlobal.f42558d.mo28324b(C9110dv.class);
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        C6894d a = C6894d.m14753a();
        C89219l.m154716b(a, "");
        T t = a.f17248n;
        C89219l.m154716b(t, "");
        if (t.booleanValue()) {
            HSImageView hSImageView = (HSImageView) mo8635c(R.id.c_q);
            if (hSImageView != null) {
                hSImageView.postDelayed(new RunnableC3336y(this, privacyCert), 1000);
            }
        } else {
            mo8632b(1);
            mo8628a(PrivacyCert.Builder.Companion.with("bpea-429").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            C3221b.m8716b(10001, m8756e(), mo8638f(), this.f9417i);
        }
        C6501b b = C6501b.C6502a.m13948a("pm_live_sticker_use").mo12643a(mo8627a()).mo12658d("anchor_live_ending").mo12656c("other").mo12654b("live_take");
        String str2 = "use";
        if (C11279p.m20012a((Boolean) mo8627a().mo28318b(C9022ap.class))) {
            str = str2;
        } else {
            str = "unused";
        }
        b.mo12651a("use_status", str).mo12646a("room_id", mo8638f()).mo12655b();
        C6501b b2 = C6501b.C6502a.m13948a("pm_live_filter_use").mo12643a(mo8627a()).mo12658d("anchor_live_ending").mo12656c("other").mo12654b("live_take");
        if (!C11279p.m20012a((Boolean) mo8627a().mo28318b(C4165b.class))) {
            str2 = "unused";
        }
        b2.mo12651a("use_status", str2).mo12646a("room_id", mo8638f()).mo12655b();
    }

    public final void onEvent(C7400q qVar) {
        String str;
        int intValue;
        C89219l.m154721d(qVar, "");
        int i = qVar.f18334a;
        if (i != 3) {
            if (i == 11) {
                PrivacyCert build = PrivacyCert.Builder.Companion.with("bpea-421").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build();
                C3221b.m8716b(10002, m8756e(), mo8638f(), this.f9417i);
                mo8632b(1);
                AbstractC3055a aVar = this.f9421m;
                if (aVar != null) {
                    aVar.mo8281a();
                }
                AbstractC3055a aVar2 = this.f9421m;
                if (aVar2 != null) {
                    aVar2.mo8307i(build);
                }
                C3708f.m9212a("release_audio");
                AbstractC3055a aVar3 = this.f9421m;
                if (aVar3 != null) {
                    aVar3.mo8303e(build);
                }
                C3708f.m9212a("release_video");
                C11226ao.m19882a(getContext(), (int) R.string.gs8);
                ActivityC0945e activity = getActivity();
                if (activity != null) {
                    activity.finish();
                }
            } else if (i != 17) {
                if (i != 6) {
                    if (i == 7) {
                        AbstractC6571a aVar4 = qVar.f18337d;
                        if (aVar4 instanceof C9883n) {
                            C9883n nVar = (C9883n) aVar4;
                            if (nVar.f23882a == 4) {
                                C9883n.C9884a aVar5 = nVar.f23884g;
                                if (aVar5 != null) {
                                    this.f9426r = aVar5.f23885a;
                                    this.f9427s = C7557c.m15538a(aVar5.f23887c, "");
                                    this.f9428t = C7557c.m15538a(aVar5.f23888d, "");
                                    this.f9429u = C7557c.m15538a(aVar5.f23889e, "");
                                }
                                m8752a(true, PrivacyCert.Builder.Companion.with("bpea-424").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                                C3221b.m8716b(10003, m8756e(), mo8638f(), this.f9417i);
                                return;
                            }
                        }
                        m8752a(false, PrivacyCert.Builder.Companion.with("bpea-425").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                        C3221b.m8716b(qVar.f18335b, m8756e(), mo8638f(), this.f9417i);
                        return;
                    } else if (i != 8) {
                        return;
                    }
                }
                Context context = getContext();
                if (context != null) {
                    C89219l.m154716b(context, "");
                    if (!C3723e.m9233a(context, mo8627a(), new C3285ah(this), new C3286ai(this))) {
                        Integer num = (Integer) mo8627a().mo28318b(C10341e.class);
                        if (num == null || (intValue = num.intValue()) <= 0) {
                            str = getResources().getString(R.string.dus);
                        } else {
                            str = getResources().getQuantityString(R.plurals.ff, intValue, Integer.valueOf(intValue));
                        }
                        C89219l.m154716b(str, "");
                        LiveLoadingView liveLoadingView = (LiveLoadingView) mo8635c(R.id.c_y);
                        if (liveLoadingView != null) {
                            C11279p.m20008a((View) liveLoadingView, true);
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        C3719d.C3720a.m9229a().mo9038a().getAnchorPreFinish(mo8638f()).mo143271a(C11195i.m19838a(this, EnumC11186b.DESTROY)).mo143271a(new C11191f()).mo143254a(new C3287aj(this, str, currentTimeMillis), new C3288ak(this, str, currentTimeMillis));
                    }
                    C6501b.C6502a.m13948a("anchor_close_live_popup").mo12643a(mo8627a()).mo12651a("live_type", "video_live").mo12655b();
                }
            } else {
                mo8633b(PrivacyCert.Builder.Companion.with("bpea-776").usage("").tag("close live immediately").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        } else if (!this.f9414f) {
            C11279p.m20024d(mo8635c(R.id.c_q));
            m8755c(PrivacyCert.Builder.Companion.with("bpea-461").usage("").tag("start audio capture when live starts").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    /* renamed from: a */
    public final void mo8628a(PrivacyCert privacyCert) {
        String str;
        Room room = this.f9410b;
        if (room == null) {
            C89219l.m154710a("mRoom");
        }
        C3726f.C3727a.m9236a(room, mo8627a());
        this.f9399H = true;
        AbstractC3055a aVar = this.f9421m;
        if (aVar != null) {
            aVar.mo8281a();
        }
        AbstractC3055a aVar2 = this.f9421m;
        if (aVar2 != null) {
            aVar2.mo8307i(privacyCert);
        }
        C3708f.m9212a("release_audio");
        AbstractC3055a aVar3 = this.f9421m;
        if (aVar3 != null) {
            aVar3.mo8303e(privacyCert);
        }
        C3708f.m9212a("release_video");
        if (C4384b.C4385a.m10496a().f11925O) {
            C6805b<Boolean> bVar = AbstractC6804a.f16970bS;
            C89219l.m154716b(bVar, "");
            Boolean a = bVar.mo13066a();
            C6805b<Boolean> bVar2 = AbstractC6804a.f16971bT;
            C89219l.m154716b(bVar2, "");
            Boolean a2 = bVar2.mo13066a();
            C6501b a3 = C6501b.C6502a.m13948a("connection_use_status").mo12643a(mo8627a());
            C89219l.m154716b(a, "");
            String str2 = "open";
            if (a.booleanValue()) {
                str = str2;
            } else {
                str = "close";
            }
            C6501b a4 = a3.mo12651a("connection_status", str);
            C89219l.m154716b(a2, "");
            if (!a2.booleanValue()) {
                str2 = "close";
            }
            a4.mo12651a("recommend_connection_status", str2).mo12655b();
        }
        if (isViewValid()) {
            AbstractC11293v vVar = this.f9424p;
            if (vVar != null) {
                vVar.dismiss();
            }
            m8751a(new RunnableC3292ao(this));
            if (C3219a.f9257h != 0) {
                C6501b.C6502a.m13948a("livesdk_broadcast_end").mo12646a("duration", System.currentTimeMillis() - C3219a.f9257h).mo12655b();
            }
            C3219a.f9252c = 0;
            C3219a.f9253d = 0;
            C3219a.f9254e = 0;
            C3219a.f9255f = 0;
            C3219a.f9256g = 0;
            C3219a.f9257h = 0;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$c */
    public static final class C3308c implements AVLog.ILogFilter {

        /* renamed from: a */
        final /* synthetic */ C6555i f9480a;

        /* renamed from: b */
        final /* synthetic */ String f9481b;

        static {
            Covode.recordClassIndex(3790);
        }

        C3308c(C6555i iVar, String str) {
            this.f9480a = iVar;
            this.f9481b = str;
        }

        @Override // com.p2082ss.avframework.utils.AVLog.ILogFilter
        public final void print(int i, String str, String str2, Throwable th) {
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = "";
            }
            jSONObject.put("sdktag", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("sdkmsg", str2);
            if (th != null) {
                jSONObject.put("throwable", th);
            }
            switch (i) {
                case 2:
                case 3:
                    this.f9480a.mo9218b(this.f9481b, jSONObject);
                    return;
                case 4:
                    this.f9480a.mo9216a(this.f9481b, jSONObject);
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    C6555i iVar = this.f9480a;
                    String str3 = this.f9481b;
                    if (!TextUtils.isEmpty(str3)) {
                        C6203g.m13466b(new RunnableC3861h(iVar, str3, jSONObject));
                        return;
                    }
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    C6555i iVar2 = this.f9480a;
                    String str4 = this.f9481b;
                    if (!TextUtils.isEmpty(str4)) {
                        C6203g.m13466b(new RunnableC3859f(iVar2, str4, jSONObject));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }

        @Override // com.p2082ss.avframework.utils.AVLog.ILogFilter
        public final void print(int i, String str, String str2, String str3, Throwable th) {
            StringBuilder sb = new StringBuilder();
            if (str2 == null) {
                str2 = "";
            }
            StringBuilder append = sb.append(str2).append(' ');
            if (str3 == null) {
                str3 = "";
            }
            print(i, str, append.append(str3).toString(), th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.o$am */
    public static final class DialogInterface$OnClickListenerC3290am implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3276o f9454a;

        /* renamed from: b */
        final /* synthetic */ Integer f9455b;

        static {
            Covode.recordClassIndex(3772);
        }

        DialogInterface$OnClickListenerC3290am(C3276o oVar, Integer num) {
            this.f9454a = oVar;
            this.f9455b = num;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            this.f9454a.mo8642k();
            dialogInterface.dismiss();
            Integer num = this.f9455b;
            if (num != null && num.intValue() == 4) {
                ((IGiftService) C6193a.m13435a(IGiftService.class)).logBoostCardLiveEndClick(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.o$al */
    public static final class DialogInterface$OnClickListenerC3289al implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3276o f9452a;

        /* renamed from: b */
        final /* synthetic */ Integer f9453b;

        static {
            Covode.recordClassIndex(3771);
        }

        DialogInterface$OnClickListenerC3289al(C3276o oVar, Integer num) {
            this.f9452a = oVar;
            this.f9453b = num;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            this.f9452a.mo8633b(PrivacyCert.Builder.Companion.with("bpea-453").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            C4384b.C4385a.m10496a().f11927Q = true;
            C4384b.C4385a.m10496a().f11928R = true;
            dialogInterface.dismiss();
            Integer num = this.f9453b;
            if (num != null && num.intValue() == 4) {
                ((IGiftService) C6193a.m13435a(IGiftService.class)).logBoostCardLiveEndClick(1);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$av */
    static final class DialogInterface$OnClickListenerC3299av implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3276o f9464a;

        static {
            Covode.recordClassIndex(3781);
        }

        DialogInterface$OnClickListenerC3299av(C3276o oVar) {
            this.f9464a = oVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f9464a.mo8628a(PrivacyCert.Builder.Companion.with("bpea-427").usage("").tag("stop video/audio capture when error occurs").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            C6501b.C6502a.m13948a("livesdk_push_stream_failed_click").mo12651a("click_icon", "end_live").mo12645a("is_first_fail", this.f9464a.f9417i ? 1 : 0).mo12655b();
        }
    }

    /* renamed from: a */
    public static void m8749a(DataChannel dataChannel, boolean z) {
        String str;
        String str2;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        long c = C11115u.m19743a().mo17915b().mo13161c();
        if (room != null && room.getOwnerUserId() == c) {
            C6501b g = C6501b.C6502a.m13948a("livesdk_switch_to_background").mo12643a(dataChannel).mo12663h(room.getIdStr()).mo12662g(String.valueOf(room.getOwnerUserId()));
            EnumC11728i streamType = room.getStreamType();
            if (streamType != null) {
                str = C11729j.m20684a(streamType);
            } else {
                str = null;
            }
            C6501b a = g.mo12644a(str);
            if (z) {
                str2 = "anchor_leave";
            } else {
                str2 = "anchor_back";
            }
            a.mo12661f(str2).mo12655b();
        }
    }

    /* renamed from: a */
    private final void m8752a(boolean z, PrivacyCert privacyCert) {
        String str;
        if (!this.f9399H) {
            mo8632b(1);
        }
        if (z && !C13627m.m24498a(this.f9426r)) {
            AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
            Context context = getContext();
            AbstractC6956d.C6957a b = AbstractC6963e.m14872b(this.f9426r);
            b.f17379c = true;
            b.f17378b = C3966y.m9657a((int) R.string.gi2);
            webViewManager.mo13248a(context, b);
        }
        StringBuilder sb = new StringBuilder("room close onLiveEnd endByBanned:");
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        C3854a.m9453a(3, "LiveBroadcastFragment", sb.append(str).toString());
        mo8628a(privacyCert);
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        VideoWidget2 videoWidget2;
        View view2;
        ViewGroup.LayoutParams layoutParams;
        View view3;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (!(!LiveEnableFixLiveEndSetting.INSTANCE.enable() || (videoWidget2 = this.f9422n) == null || (view2 = videoWidget2.getView()) == null)) {
            VideoWidget2 videoWidget22 = this.f9422n;
            if (videoWidget22 == null || (view3 = videoWidget22.getView()) == null) {
                layoutParams = null;
            } else {
                layoutParams = view3.getLayoutParams();
            }
            if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                layoutParams = null;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = 1;
                layoutParams2.rightMargin = 1;
            } else {
                layoutParams2 = null;
            }
            view2.setLayoutParams(layoutParams2);
        }
        mo8637d().mo9891a(this.f9407P);
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (!Room.isValid(room) || room == null || room.getStreamUrl() == null) {
            this.f9398G = true;
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        this.f9410b = room;
        EnumC9592k.VIDEO.config();
        C6201f.m13458a();
        C6201f.m13459b();
        Room room2 = this.f9410b;
        if (room2 == null) {
            C89219l.m154710a("mRoom");
        }
        C3726f.C3727a.m9235a(room2);
        float c = ((float) C3966y.m9664c()) / ((float) C3966y.m9662b());
        HSImageView hSImageView = (HSImageView) mo8635c(R.id.c_q);
        Room room3 = this.f9410b;
        if (room3 == null) {
            C89219l.m154710a("mRoom");
        }
        User owner = room3.getOwner();
        C89219l.m154716b(owner, "");
        C3941k.m9604a(hSImageView, owner.getAvatarThumb(), new C11291z(5, c));
        DataChannel a = mo8627a();
        Room room4 = this.f9410b;
        if (room4 == null) {
            C89219l.m154710a("mRoom");
        }
        a.mo28315b(C9093de.class, room4);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.f42558d;
        C89378p[] pVarArr = new C89378p[2];
        Room room5 = this.f9410b;
        if (room5 == null) {
            C89219l.m154710a("mRoom");
        }
        pVarArr[0] = C89387v.m154943a("anchor_id", String.valueOf(room5.getOwnerUserId()));
        Room room6 = this.f9410b;
        if (room6 == null) {
            C89219l.m154710a("mRoom");
        }
        pVarArr[1] = C89387v.m154943a("room_id", String.valueOf(room6.getId()));
        dataChannelGlobal.mo28321a(C9097di.class, C89041ag.m154421a(pVarArr));
        C6529h.C6530a aVar = new C6529h.C6530a();
        Room room7 = this.f9410b;
        if (room7 == null) {
            C89219l.m154710a("mRoom");
        }
        aVar.f16316b = room7;
        aVar.f16315a = "live_take_detail";
        C6529h a2 = aVar.mo12676a();
        DataChannelGlobal.f42558d.mo28321a(C6532j.class, a2);
        mo8627a().mo28311a(C6531i.class, a2);
        C4384b.C4385a.m10497a(mo8638f(), mo8627a(), "LiveBroadcastFragment_OnViewCreated");
        Room room8 = this.f9410b;
        if (room8 == null) {
            C89219l.m154710a("mRoom");
        }
        C11738s streamUrlExtraSafely = room8.getStreamUrlExtraSafely();
        C89219l.m154716b(streamUrlExtraSafely, "");
        this.f9411c = streamUrlExtraSafely;
        long f = mo8638f();
        getContext();
        C3229a aVar2 = new C3229a(f);
        this.f9413e = aVar2;
        aVar2.mo10297a(this);
        m8757p().f9297a = this;
        C3687b bVar = new C3687b(m8757p());
        bVar.mo8956a();
        this.f9425q = bVar;
        mo8627a().mo28311a(C9068cg.class, ((IMessageService) C6193a.m13435a(IMessageService.class)).messageManagerProvider(mo8638f(), true, getContext()));
        C3211p.m8698a(mo8638f());
        this.f9397F = new C3008aa(this);
        ((IGiftService) C6193a.m13435a(IGiftService.class)).resetRoomStatus();
        if (!LiveGiftInterfaceOptimizeSetting.INSTANCE.getValue()) {
            AbstractC2953a a3 = C6193a.m13435a(IGiftService.class);
            C89219l.m154716b(a3, "");
            ((IGiftService) a3).getFirstRechargeManager().mo15002a(mo8638f(), m8759r());
            ((IGiftService) C6193a.m13435a(IGiftService.class)).syncGiftList(m8760s(), mo8638f(), 2, true);
        } else {
            Room room9 = this.f9410b;
            if (room9 == null) {
                C89219l.m154710a("mRoom");
            }
            if (room9.getRoomAuthStatus() != null) {
                Room room10 = this.f9410b;
                if (room10 == null) {
                    C89219l.m154710a("mRoom");
                }
                if (room10.getRoomAuthStatus().enableGift) {
                    AbstractC2953a a4 = C6193a.m13435a(IGiftService.class);
                    C89219l.m154716b(a4, "");
                    ((IGiftService) a4).getFirstRechargeManager().mo15002a(mo8638f(), m8759r());
                    IGiftService iGiftService = (IGiftService) C6193a.m13435a(IGiftService.class);
                    Room room11 = this.f9410b;
                    if (room11 == null) {
                        C89219l.m154710a("mRoom");
                    }
                    iGiftService.clearFastGift(room11.getId());
                    ((IGiftService) C6193a.m13435a(IGiftService.class)).syncGiftList(m8760s(), mo8638f(), 2, true);
                }
            }
        }
        EnumC5847l.BEAUTY.load(mo8627a(), new C3304b());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AbstractC5783o oVar = this.f9423o;
        if (oVar != null) {
            oVar.mo11520b().onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C2690b.m7784a(R.layout.b8k, viewGroup);
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onStreamEnd(int i, int i2, String str) {
        int i3;
        String str2 = str;
        C89219l.m154721d(str2, "");
        if (C3058c.m8399a(i)) {
            C11226ao.m19882a(getContext(), (int) R.string.gqb);
            DialogC9148b.C9149a a = new DialogC9148b.C9149a(getActivity()).mo15243a(R.string.eh6).mo15248b(R.string.eh5).mo15244a(R.string.eh4, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3299av(this), false);
            a.f22256m = false;
            a.mo15247a().show();
            i3 = 6;
        } else {
            if (i > 0) {
                C11226ao.m19882a(getContext(), (int) R.string.gq_);
                mo8628a(PrivacyCert.Builder.Companion.with("bpea-426").usage("").tag("stop video/audio capture when connection fail").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                i3 = 1;
            }
            C89378p[] pVarArr = new C89378p[2];
            pVarArr[0] = C89387v.m154943a("errCode", String.valueOf(i));
            if (str2.length() <= 0 || str2 == null) {
                str2 = C3058c.m8400b(i);
            }
            pVarArr[1] = C89387v.m154943a("errMsg", str2);
            C4017b.m9795a(C4017b.EnumC4018a.CreateLive, C89041ag.m154428c(pVarArr));
        }
        if (i > 0) {
            C3221b.m8714a(i, i2, str2, m8756e(), mo8638f(), this.f9417i);
            C3687b bVar = this.f9425q;
            if (bVar != null) {
                bVar.mo8957a(i3);
            }
        }
        C89378p[] pVarArr2 = new C89378p[2];
        pVarArr2[0] = C89387v.m154943a("errCode", String.valueOf(i));
        str2 = C3058c.m8400b(i);
        pVarArr2[1] = C89387v.m154943a("errMsg", str2);
        C4017b.m9795a(C4017b.EnumC4018a.CreateLive, C89041ag.m154428c(pVarArr2));
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$h */
    static final class C3313h implements AbstractC3697f {

        /* renamed from: a */
        final /* synthetic */ C3276o f9486a;

        static {
            Covode.recordClassIndex(3795);
        }

        C3313h(C3276o oVar) {
            this.f9486a = oVar;
        }

        @Override // com.bytedance.android.live.broadcast.stream.capture.AbstractC3697f
        /* renamed from: a */
        public final void mo8669a(EGLContext eGLContext, int i, int i2, int i3, long j) {
            if (!this.f9486a.f9415g) {
                C3219a.m8712b();
                this.f9486a.f9415g = true;
                C3219a.m8712b();
                C11279p.m20024d(this.f9486a.mo8635c(R.id.c_q));
            }
            AbstractC3055a aVar = this.f9486a.f9421m;
            if (aVar != null) {
                aVar.mo8282a(i, i2, i3, j);
            }
        }
    }
}
