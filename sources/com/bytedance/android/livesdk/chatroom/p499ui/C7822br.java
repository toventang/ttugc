package com.bytedance.android.livesdk.chatroom.p499ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Rational;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.android.C2690b;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.RoomStatus;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3931d;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.performance.C4017b;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.view.C4087e;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.gift.C4346v;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.C4392af;
import com.bytedance.android.live.liveinteract.api.C4403aq;
import com.bytedance.android.live.liveinteract.api.C4437h;
import com.bytedance.android.live.liveinteract.api.C4441l;
import com.bytedance.android.live.liveinteract.api.C4450t;
import com.bytedance.android.live.liveinteract.api.EnumC4408av;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p176b.AbstractC2939m;
import com.bytedance.android.live.p229d.AbstractC4051b;
import com.bytedance.android.live.p247f.AbstractC4318a;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p253j.C4369b;
import com.bytedance.android.live.p253j.C4370c;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p379n.AbstractC5788t;
import com.bytedance.android.live.p379n.C5766ab;
import com.bytedance.android.live.p379n.C5786r;
import com.bytedance.android.live.p379n.C5787s;
import com.bytedance.android.live.p384o.AbstractC5834a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.livesdk.AbstractC10135q;
import com.bytedance.android.livesdk.C6561ab;
import com.bytedance.android.livesdk.C6778am;
import com.bytedance.android.livesdk.C6885av;
import com.bytedance.android.livesdk.C6886aw;
import com.bytedance.android.livesdk.C6888ay;
import com.bytedance.android.livesdk.C6905bf;
import com.bytedance.android.livesdk.C6911bk;
import com.bytedance.android.livesdk.C8423e;
import com.bytedance.android.livesdk.chatroom.C7298b;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.chatroom.backroom.p485d.C7349a;
import com.bytedance.android.livesdk.chatroom.detail.C7435f;
import com.bytedance.android.livesdk.chatroom.detail.C7438g;
import com.bytedance.android.livesdk.chatroom.detail.C7442h;
import com.bytedance.android.livesdk.chatroom.detail.C7443i;
import com.bytedance.android.livesdk.chatroom.detail.C7445j;
import com.bytedance.android.livesdk.chatroom.detail.C7454r;
import com.bytedance.android.livesdk.chatroom.detail.C7466y;
import com.bytedance.android.livesdk.chatroom.detail.RunnableC7451o;
import com.bytedance.android.livesdk.chatroom.detail.RunnableC7452p;
import com.bytedance.android.livesdk.chatroom.end.C7512b;
import com.bytedance.android.livesdk.chatroom.end.DialogC7511a;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.View$OnClickListenerC7532a;
import com.bytedance.android.livesdk.chatroom.p481b.C7307f;
import com.bytedance.android.livesdk.chatroom.p488c.C7380am;
import com.bytedance.android.livesdk.chatroom.p488c.C7385d;
import com.bytedance.android.livesdk.chatroom.p488c.C7397n;
import com.bytedance.android.livesdk.chatroom.p488c.C7399p;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
import com.bytedance.android.livesdk.chatroom.p488c.C7401r;
import com.bytedance.android.livesdk.chatroom.p488c.C7403t;
import com.bytedance.android.livesdk.chatroom.p488c.C7409y;
import com.bytedance.android.livesdk.chatroom.p489d.C7413a;
import com.bytedance.android.livesdk.chatroom.p489d.C7421d;
import com.bytedance.android.livesdk.chatroom.p489d.C7422e;
import com.bytedance.android.livesdk.chatroom.p492g.C7572d;
import com.bytedance.android.livesdk.chatroom.p492g.C7589k;
import com.bytedance.android.livesdk.chatroom.p492g.C7591m;
import com.bytedance.android.livesdk.chatroom.p492g.C7599q;
import com.bytedance.android.livesdk.chatroom.p499ui.p500a.C7710a;
import com.bytedance.android.livesdk.chatroom.p499ui.p500a.C7711b;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget;
import com.bytedance.android.livesdk.drawerfeed.C8422f;
import com.bytedance.android.livesdk.event.C8452e;
import com.bytedance.android.livesdk.event.C8456i;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.p549e.AbstractC8807b;
import com.bytedance.android.livesdk.live.p566c.C9294a;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAnchorLinkmicSpeedUpSeiSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveDrawerVersion;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableReusePlayerWithoutFirstFrameSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableSlideEnterRoomOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableSlideVideoLastFrameSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InboxTopLivesEnterRoomOptiSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveClickEnterDelayShowLoadingTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnterDelayShowLoadingTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtFeedDrawerShowMoreLiveSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtForyouEntranceShowMoreLiveSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtRoomSlideUpGuideSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveNewAudienceFinishPageSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePaidEventSchema;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerErrorCountSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveTestEnableRoomStreamToastSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveUseSurfaceViewExperiment;
import com.bytedance.android.livesdk.livesetting.watchlive.MtPipWatchLiveUnderWindowFocusSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.ShowAudienceDefinitionSelectionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.ShowBackgroundBelowVideoExperiment;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisablePullStreamInfoSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveMultiPlayerEnableSetting;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdk.model.message.C9622au;
import com.bytedance.android.livesdk.model.message.C9688bt;
import com.bytedance.android.livesdk.mvp.C9920b;
import com.bytedance.android.livesdk.p425aa.AbstractC6556j;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6538d;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p425aa.C6558k;
import com.bytedance.android.livesdk.p425aa.C6560m;
import com.bytedance.android.livesdk.p425aa.p428c.C6520a;
import com.bytedance.android.livesdk.p425aa.p428c.C6522b;
import com.bytedance.android.livesdk.p425aa.p428c.C6529h;
import com.bytedance.android.livesdk.p425aa.p428c.C6531i;
import com.bytedance.android.livesdk.p425aa.p428c.C6532j;
import com.bytedance.android.livesdk.p425aa.p428c.C6535m;
import com.bytedance.android.livesdk.p425aa.p428c.C6536n;
import com.bytedance.android.livesdk.p425aa.p429d.C6541c;
import com.bytedance.android.livesdk.p441ah.C6682a;
import com.bytedance.android.livesdk.p441ah.C6684c;
import com.bytedance.android.livesdk.p441ah.C6695f;
import com.bytedance.android.livesdk.p441ah.C6696g;
import com.bytedance.android.livesdk.p442ai.C6729h;
import com.bytedance.android.livesdk.p442ai.C6739l;
import com.bytedance.android.livesdk.p442ai.C6750t;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.android.livesdk.p542g.C8779e;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9015ai;
import com.bytedance.android.livesdk.p561j.C9016aj;
import com.bytedance.android.livesdk.p561j.C9020an;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9024ar;
import com.bytedance.android.livesdk.p561j.C9031ay;
import com.bytedance.android.livesdk.p561j.C9043bi;
import com.bytedance.android.livesdk.p561j.C9044bj;
import com.bytedance.android.livesdk.p561j.C9045bk;
import com.bytedance.android.livesdk.p561j.C9056bv;
import com.bytedance.android.livesdk.p561j.C9057bw;
import com.bytedance.android.livesdk.p561j.C9059by;
import com.bytedance.android.livesdk.p561j.C9060bz;
import com.bytedance.android.livesdk.p561j.C9062ca;
import com.bytedance.android.livesdk.p561j.C9065cd;
import com.bytedance.android.livesdk.p561j.C9073cl;
import com.bytedance.android.livesdk.p561j.C9074cm;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9095dg;
import com.bytedance.android.livesdk.p561j.C9100dl;
import com.bytedance.android.livesdk.p561j.C9104dp;
import com.bytedance.android.livesdk.p561j.C9109du;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p561j.C9121ef;
import com.bytedance.android.livesdk.p561j.C9125g;
import com.bytedance.android.livesdk.p561j.C9126h;
import com.bytedance.android.livesdk.p561j.C9129k;
import com.bytedance.android.livesdk.p561j.C9142x;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.p563l.C9162a;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.performance.C10095g;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.rank.api.AbstractC10336c;
import com.bytedance.android.livesdk.rank.api.C10341e;
import com.bytedance.android.livesdk.survey.AbstractC10787a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.C11116a;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdk.utils.C11199a;
import com.bytedance.android.livesdk.utils.C11208ab;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.utils.C11291z;
import com.bytedance.android.livesdk.watch.C11326e;
import com.bytedance.android.livesdk.watch.C11330h;
import com.bytedance.android.livesdk.widget.LiveMaskLayerWidget;
import com.bytedance.android.livesdk.widget.p660b.C11418d;
import com.bytedance.android.livesdkapi.AbstractC11615c;
import com.bytedance.android.livesdkapi.depend.model.live.C11725f;
import com.bytedance.android.livesdkapi.depend.model.live.C11735p;
import com.bytedance.android.livesdkapi.depend.model.live.C11738s;
import com.bytedance.android.livesdkapi.depend.model.live.DebugToolState;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamData;
import com.bytedance.android.livesdkapi.depend.p677a.AbstractC11623a;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11650h;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i;
import com.bytedance.android.livesdkapi.depend.p680d.EnumC11662p;
import com.bytedance.android.livesdkapi.host.AbstractC11807g;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.model.LatestLiveData;
import com.bytedance.android.livesdkapi.p690f.C11756a;
import com.bytedance.android.livesdkapi.p691g.C11771j;
import com.bytedance.android.livesdkapi.p691g.C11773l;
import com.bytedance.android.livesdkapi.p698k.C11822a;
import com.bytedance.android.livesdkapi.p698k.C11824c;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.EnumC11866b;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.view.AbstractC11877e;
import com.bytedance.android.livesdkapi.view.C11879g;
import com.bytedance.android.livesdkapi.view.SurfaceRenderView;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.android.livesdkapi.view.TextureViewWrapper;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.p145b.p146a.C2695a;
import com.bytedance.android.p149d.AbstractC2717b;
import com.bytedance.android.p149d.AbstractC2719c;
import com.bytedance.android.p149d.AbstractC2721d;
import com.bytedance.android.p149d.C2716a;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.AbstractC17845e;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import com.bytedance.ies.sdk.widgets.IWidgetProvider;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.p2083a.p2084a.AbstractC29335a;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.br */
public class C7822br extends C10935a implements C7711b.AbstractC7713b, AbstractC11623a, AbstractC11652i, AbstractC17845e, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    static final Boolean f19399a = false;

    /* renamed from: aq */
    public static final List<Long> f19400aq = new ArrayList();

    /* renamed from: b */
    static float f19401b = 138.0f;

    /* renamed from: A */
    boolean f19402A = false;

    /* renamed from: B */
    boolean f19403B = false;

    /* renamed from: C */
    public C7710a f19404C;

    /* renamed from: D */
    ViewGroup f19405D;

    /* renamed from: E */
    HSImageView f19406E;

    /* renamed from: F */
    public ViewGroup f19407F;

    /* renamed from: G */
    HSImageView f19408G;

    /* renamed from: H */
    LinearLayout f19409H;

    /* renamed from: I */
    View f19410I;

    /* renamed from: J */
    public AbstractC7703a f19411J;

    /* renamed from: K */
    public Dialog f19412K;

    /* renamed from: L */
    public C7512b f19413L;

    /* renamed from: M */
    public String f19414M;

    /* renamed from: N */
    public String f19415N = "other";

    /* renamed from: O */
    public boolean f19416O = false;

    /* renamed from: P */
    public boolean f19417P = false;

    /* renamed from: Q */
    C7438g f19418Q;

    /* renamed from: R */
    public View f19419R;

    /* renamed from: S */
    public List<String> f19420S = new ArrayList();

    /* renamed from: T */
    long f19421T;

    /* renamed from: U */
    long f19422U;

    /* renamed from: V */
    public DataChannel f19423V;

    /* renamed from: W */
    RecyclableWidgetManager f19424W;

    /* renamed from: X */
    public LiveMaskLayerWidget f19425X;

    /* renamed from: Y */
    final Handler f19426Y;

    /* renamed from: Z */
    public HashMap<String, String> f19427Z;

    /* renamed from: aA */
    private C11738s.C11739a f19428aA;

    /* renamed from: aB */
    private boolean f19429aB;

    /* renamed from: aC */
    private C7466y f19430aC;

    /* renamed from: aD */
    private final C7442h f19431aD = new C7442h();

    /* renamed from: aE */
    private C7599q f19432aE;

    /* renamed from: aF */
    private boolean f19433aF = false;

    /* renamed from: aG */
    private boolean f19434aG = false;

    /* renamed from: aH */
    private HSImageView f19435aH;

    /* renamed from: aI */
    private HSImageView f19436aI;

    /* renamed from: aJ */
    private View f19437aJ;

    /* renamed from: aK */
    private HSAnimImageView f19438aK;

    /* renamed from: aL */
    private View$OnClickListenerC7532a f19439aL;

    /* renamed from: aM */
    private DrawerLayout.AbstractC0843c f19440aM;

    /* renamed from: aN */
    private String f19441aN = null;

    /* renamed from: aO */
    private long f19442aO;

    /* renamed from: aP */
    private String f19443aP;

    /* renamed from: aQ */
    private final boolean f19444aQ = ShowBackgroundBelowVideoExperiment.INSTANCE.isEnable();

    /* renamed from: aR */
    private boolean f19445aR = false;

    /* renamed from: aS */
    private AbstractC11652i.AbstractC11653a f19446aS;

    /* renamed from: aT */
    private final boolean f19447aT;

    /* renamed from: aU */
    private final boolean f19448aU;

    /* renamed from: aV */
    private final int f19449aV;

    /* renamed from: aW */
    private final int f19450aW;

    /* renamed from: aX */
    private long f19451aX;

    /* renamed from: aY */
    private long f19452aY;

    /* renamed from: aZ */
    private ValueAnimator f19453aZ;

    /* renamed from: aa */
    public long f19454aa;

    /* renamed from: ab */
    public C6739l f19455ab;

    /* renamed from: ac */
    public View f19456ac;

    /* renamed from: ad */
    public boolean f19457ad;

    /* renamed from: ae */
    public boolean f19458ae;

    /* renamed from: af */
    String f19459af;

    /* renamed from: ag */
    View f19460ag;

    /* renamed from: ah */
    public boolean f19461ah;

    /* renamed from: ai */
    public boolean f19462ai;

    /* renamed from: aj */
    public EnterRoomConfig f19463aj;

    /* renamed from: ak */
    public AbstractC88412b f19464ak;

    /* renamed from: al */
    PictureInPictureParams.Builder f19465al;

    /* renamed from: am */
    boolean f19466am;

    /* renamed from: an */
    C11418d f19467an;

    /* renamed from: ao */
    public boolean f19468ao;

    /* renamed from: ap */
    boolean f19469ap;

    /* renamed from: ar */
    final AbstractC8807b f19470ar;

    /* renamed from: as */
    boolean f19471as;

    /* renamed from: at */
    AbstractC11652i.AbstractC11654b f19472at;

    /* renamed from: au */
    boolean f19473au;

    /* renamed from: av */
    C6695f f19474av;

    /* renamed from: aw */
    C6696g f19475aw;

    /* renamed from: ax */
    private String f19476ax;

    /* renamed from: ay */
    private String f19477ay;

    /* renamed from: az */
    private String f19478az;

    /* renamed from: ba */
    private long f19479ba;

    /* renamed from: bb */
    private boolean f19480bb;

    /* renamed from: bc */
    private boolean f19481bc;

    /* renamed from: bd */
    private C11756a.AbstractC11757a f19482bd;

    /* renamed from: be */
    private final List<C7399p> f19483be;

    /* renamed from: bf */
    private C2716a f19484bf;

    /* renamed from: bg */
    private AbstractC11615c f19485bg;

    /* renamed from: bh */
    private View f19486bh;

    /* renamed from: bi */
    private boolean f19487bi;

    /* renamed from: bj */
    private int f19488bj;

    /* renamed from: bk */
    private boolean f19489bk;

    /* renamed from: bl */
    private final C88411a f19490bl;

    /* renamed from: bm */
    private boolean f19491bm;

    /* renamed from: bn */
    private String f19492bn;

    /* renamed from: bo */
    private final AbstractC2717b.AbstractC2718a f19493bo;

    /* renamed from: bp */
    private BroadcastReceiver f19494bp;

    /* renamed from: c */
    public long f19495c;

    /* renamed from: d */
    public Room f19496d;

    /* renamed from: e */
    long f19497e;

    /* renamed from: f */
    List<String> f19498f;

    /* renamed from: g */
    public String f19499g;

    /* renamed from: h */
    public EnumC11728i f19500h;

    /* renamed from: i */
    boolean f19501i;

    /* renamed from: j */
    long f19502j;

    /* renamed from: k */
    String f19503k;

    /* renamed from: l */
    boolean f19504l;

    /* renamed from: m */
    public boolean f19505m;

    /* renamed from: n */
    public int f19506n = 1;

    /* renamed from: o */
    boolean f19507o;

    /* renamed from: p */
    public int f19508p;

    /* renamed from: q */
    int f19509q;

    /* renamed from: r */
    public EnumC11662p f19510r = EnumC11662p.IDLE;

    /* renamed from: s */
    public C7445j f19511s;

    /* renamed from: t */
    C7443i f19512t;

    /* renamed from: u */
    public C7435f f19513u;

    /* renamed from: v */
    public AbstractC2717b f19514v;

    /* renamed from: w */
    public boolean f19515w = false;

    /* renamed from: x */
    public boolean f19516x = false;

    /* renamed from: y */
    public boolean f19517y = false;

    /* renamed from: z */
    public boolean f19518z = false;

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(344, new RunnableC90250g(C7822br.class, "liveUserKickOut", C11773l.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: n */
    public final Fragment mo14130n() {
        return this;
    }

    @Override // com.bytedance.ies.sdk.datachannel.AbstractC17845e
    /* renamed from: h */
    public final DataChannel mo8509h() {
        return this.f19423V;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: i */
    public final long mo14125i() {
        return this.f19495c;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: w */
    public final EnterRoomConfig mo14149w() {
        return this.f19463aj;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: y */
    public final String mo14151y() {
        return this.f19459af;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14093a(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f19407F.getLayoutParams();
        if (marginLayoutParams.topMargin != i) {
            marginLayoutParams.topMargin = i;
            this.f19407F.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    public final void mo14097a(long j) {
        mo14090E().put("param_live_enter_room_api_start_time", new StringBuilder().append(System.currentTimeMillis()).toString());
        C7435f.AbstractC7436a b = m15903b(j);
        if (C7454r.C7455a.m15360a().mo13690a(j)) {
            C7572d.m15561a("LivePlayFragment", "has prefetch room/enter api !!!! room_id=".concat(String.valueOf(j)));
            this.f19455ab.mo12950a("n_time_api_start");
            this.f19513u = C7454r.C7455a.m15360a().f18535e;
            C7454r.C7455a.m15360a().mo13688a(b);
            return;
        }
        C7572d.m15561a("LivePlayFragment", "start room/enter api !!!! room_id=".concat(String.valueOf(j)));
        m15897a(j, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14107a(boolean z) {
        ((IGiftService) C6193a.m13435a(IGiftService.class)).exitRoom(false);
        this.f19468ao = false;
        if (this.f19510r != EnumC11662p.IDLE && this.f19510r != EnumC11662p.INITIALIZED) {
            C7710a aVar = this.f19404C;
            if (aVar != null && (aVar.f19173a instanceof AbstractC11877e) && !this.f19487bi) {
                C7572d.m15561a("LivePlayFragment", "stop room -> video set reset");
                ((AbstractC11877e) this.f19404C.f19173a).mo19013a();
            }
            C7445j jVar = this.f19511s;
            if (jVar != null) {
                jVar.mo13676d();
            }
            C7599q qVar = this.f19432aE;
            if (qVar != null) {
                qVar.mo13836a();
                this.f19432aE.mo13837b();
            }
            if (this.f19510r != EnumC11662p.LIVE_FINISHED) {
                if (!this.f19461ah) {
                    if (!this.f19462ai) {
                        mo14106a("user cancel, frame_fail", 208, -1);
                    } else {
                        mo14106a("user cancel, frame_fail", 208, -2);
                    }
                } else if (!this.f19462ai) {
                    mo14106a("user cancel, frame_fail", 208, -3);
                }
                if (this.f19510r == EnumC11662p.LIVE_STARTED) {
                    mo14143q();
                }
                if (this.f19510r == EnumC11662p.PREPARED || this.f19510r == EnumC11662p.PREPARING) {
                    m15908d(z);
                }
                C7445j jVar2 = this.f19511s;
                if (jVar2 != null) {
                    jVar2.mo13669a();
                }
                m15894U();
                this.f19462ai = false;
                this.f19461ah = false;
                ((AbstractC10787a) C6193a.m13435a(AbstractC10787a.class)).leavePlay();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo14110a(Room room, boolean z) {
        Boolean bool;
        DataChannel dataChannel;
        View view;
        String str;
        C6520a aVar;
        C7445j jVar = this.f19511s;
        if (!(jVar == null || room == null)) {
            room.setUserFrom(jVar.f18499g);
            room.setRequestId(jVar.f18497e);
            room.setLog_pb(jVar.f18498f);
            room.setLabels(jVar.f18500h);
            room.setSourceType(jVar.f18518z);
        }
        C6529h b = C6538d.m13978b();
        if (b != null) {
            b.f16310b = room;
        }
        Boolean valueOf = Boolean.valueOf(this.f19463aj.f28232b.f28268l);
        C6529h b2 = C6538d.m13978b();
        if (!(b2 == null || (aVar = b2.f16313e) == null)) {
            aVar.f16214t = valueOf;
        }
        String valueOf2 = String.valueOf(room.getId());
        C6529h hVar = (C6529h) DataChannelGlobal.f42558d.mo28324b(C6532j.class);
        C6520a aVar2 = hVar != null ? hVar.f16313e : null;
        if (aVar2 == null || (str = aVar2.f16213s) == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(str.length() > 0);
        }
        if (C11279p.m20012a(bool) && aVar2 != null) {
            aVar2.f16213s = valueOf2;
        }
        if (!isDetached() && getActivity() != null) {
            C4384b a = C4384b.C4385a.m10497a(room.getId(), this.f19423V, "LivePlayFragment");
            if (room.getLinkMicInfo() != null) {
                a.mo10148a(room.getLinkMicInfo());
            }
        }
        boolean z2 = (room.getId() == this.f19463aj.f28231a.f28385l || this.f19463aj.f28231a.f28385l == -1) ? false : true;
        this.f19496d = room;
        this.f19495c = room.getId();
        if (room.getOwner() != null) {
            this.f19497e = room.getOwner().getId();
            if (this.f19498f == null) {
                if (room.getCover() != null && !C13617h.m24465a(room.getCover().getUrls())) {
                    this.f19498f = room.getCover().getUrls();
                } else if (room.getOwner().getAvatarThumb() != null && !C13617h.m24465a(room.getOwner().getAvatarThumb().getUrls())) {
                    this.f19498f = room.getOwner().getAvatarThumb().getUrls();
                }
                m15898a(this.f19500h, this.f19498f);
            }
            if (this.f19466am) {
                m15888O();
            }
            C11115u.m19743a().mo17915b().mo13155a(room.getOwner());
            this.f19463aj.f28233c.f28344ay = room.getOwner().getAvatarThumb();
        }
        if (getActivity() != null) {
            getActivity().getIntent().putExtra("live.intent.extra.USER_ID", this.f19497e);
            getActivity().getIntent().putExtra("current_room_id", this.f19495c);
        }
        this.f19499g = room.buildPullUrl();
        this.f19476ax = room.getSdkParams();
        this.f19477ay = room.getMultiStreamData();
        this.f19478az = room.getMultiStreamDefaultQualitySdkKey();
        this.f19500h = room.getStreamType();
        LivePerformanceManager.getInstance().setStreamType(this.f19500h);
        this.f19428aA = room.getStreamSrConfig();
        EnterRoomConfig enterRoomConfig = this.f19463aj;
        if (enterRoomConfig != null) {
            enterRoomConfig.f28231a.f28379f = this.f19478az;
            this.f19463aj.f28231a.f28376c = this.f19476ax;
            this.f19463aj.f28231a.f28377d = this.f19477ay;
            this.f19463aj.f28231a.f28375b = this.f19499g;
            this.f19463aj.f28231a.f28383j = this.f19500h.ordinal();
            if (this.f19428aA != null) {
                this.f19463aj.f28231a.f28380g = this.f19428aA.f28114a;
                this.f19463aj.f28231a.f28381h = this.f19428aA.f28115b;
                this.f19463aj.f28231a.f28382i = this.f19428aA.f28116c;
            }
        }
        C7445j jVar2 = this.f19511s;
        if (jVar2 != null) {
            jVar2.mo13670a(this.f19495c, room.isLiveTypeAudio(), this.f19497e, room.getLinkMicInfo());
        }
        if (!(this.f19500h != EnumC11728i.OFFICIAL_ACTIVITY || room.background == null || (view = this.f19456ac) == null)) {
            HSImageView hSImageView = (HSImageView) view.findViewById(R.id.fc1);
            if (Build.VERSION.SDK_INT >= 23) {
                hSImageView.setForeground(null);
            }
            C3941k.m9601a(hSImageView, room.background);
        }
        if (!(!room.isOfficial() || this.f19463aj == null || (dataChannel = this.f19423V) == null)) {
            dataChannel.mo28311a(C9059by.class, (Object) false);
            this.f19423V.mo28311a(C9060bz.class, "");
            this.f19463aj.f28233c.f28298O = false;
            this.f19463aj.f28233c.f28299P = "";
        }
        if (this.f19495c != 0) {
            this.f19463aj.f28233c.f28301R = this.f19495c;
        }
        if (this.f19497e != 0) {
            this.f19463aj.f28233c.f28287D = String.valueOf(this.f19497e);
        }
        this.f19463aj.f28233c.f28302S = room.getStreamType();
        if (room.getStatus() == 4) {
            mo14106a("room finish, live_end", 201, -3);
            C6501b.C6502a.m13948a("rd_enter_room_live_end").mo12643a(this.f19423V).mo12655b();
            mo14096a(107, "room finish", this.f19495c);
            Event event = new Event("live_play_end_room_fetch_fail", 1025, EnumC11866b.ServerApiCall);
            event.mo19003a("room status is finished.");
            C11870f.C11871a.f28404a.mo19010a().mo18994a(event);
            mo14099a(EnumC7841a.ROOM_FETCH_FINISHED);
            return false;
        }
        if (z) {
            AbstractC5777j b3 = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11553b(this.f19459af);
            int q = b3 != null ? b3.mo12933q() : 0;
            if ((!room.isPullUrlValid() && !room.isMultiPullDataValid() && q == 0) || (q != 1 ? !(q != 2 || room.isMultiPullDataValid()) : !room.isPullUrlValid())) {
                mo14096a(108, "fetch failed because the pull_url isn't valid", this.f19495c);
                mo14106a("pull url invalid, frame_fail", 207, -2);
                Event event2 = new Event("live_play_end_room_fetch_fail", 1024, EnumC11866b.ServerApiCall);
                event2.mo19003a("pull url invalid, frame_fail.");
                C11870f.C11871a.f28404a.mo19010a().mo18994a(event2);
                mo14099a(EnumC7841a.FETCH_FAILED);
                return false;
            }
        }
        if (z2) {
            mo14115b(true);
            HashMap hashMap = new HashMap(10);
            hashMap.putAll(C6501b.C6502a.m13948a("").mo12659d());
            C3868c.m9491a("ttlive_room_id_changed", 0, hashMap);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0148, code lost:
        if (r5 != null) goto L_0x014a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14094a(int r10, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 595
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p499ui.C7822br.mo14094a(int, int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14109a(int[] iArr, int i, int i2) {
        ViewGroup viewGroup;
        int i3;
        int i4;
        if (i != 0 && i2 != 0 && C13628n.m24504a(getContext()) >= C13628n.m24521b(getContext()) && (viewGroup = this.f19407F) != null) {
            int height = viewGroup.getHeight();
            int width = this.f19407F.getWidth();
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = (float) width;
            float f4 = (float) height;
            if (f / f2 > f3 / f4) {
                i4 = (int) ((f3 / f) * f2);
                i3 = width;
            } else {
                i3 = (int) ((f4 / f2) * f);
                i4 = height;
            }
            int i5 = (width - i3) / 2;
            iArr[0] = i5;
            int i6 = (height - i4) / 2;
            iArr[1] = i6;
            iArr[2] = i5;
            iArr[3] = i6;
        }
    }

    /* renamed from: a */
    public final void mo14103a(Room room) {
        EnterRoomConfig enterRoomConfig;
        if (!(room != null || (enterRoomConfig = this.f19463aj) == null || enterRoomConfig.f28233c == null)) {
            room = new Room();
            if (this.f19463aj.f28233c.f28315aE != null) {
                room.warningTag = this.f19463aj.f28233c.f28315aE;
            }
            if (this.f19463aj.f28233c.f28314aD != null) {
                room.maskLayer = this.f19463aj.f28233c.f28314aD;
            }
        }
        m15904c(room);
        m15907d(room);
    }

    /* renamed from: b */
    public final boolean mo14116b(Room room) {
        if (this.f19416O || room == null || room.maskLayer == null) {
            return false;
        }
        EnterRoomConfig enterRoomConfig = this.f19463aj;
        if (enterRoomConfig == null || enterRoomConfig.f28233c == null) {
            return true;
        }
        String str = this.f19463aj.f28233c.f28295L;
        String str2 = this.f19463aj.f28233c.f28293J;
        if (!"live_cell".equals(str) || (!"homepage_hot".equals(str2) && !"homepage_follow".equals(str2))) {
            return !"right_anchor".equals(str) || !"live_detail".equals(str2);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo14105a(String str) {
        int i = 8;
        if (this.f19435aH.getVisibility() != 8) {
            this.f19435aH.setVisibility(8);
        }
        HSImageView hSImageView = this.f19406E;
        if (this.f19466am) {
            i = 0;
        }
        hSImageView.setVisibility(i);
        C7572d.m15561a("LivePlayFragment", "hide Background, reason: ".concat(String.valueOf(str)));
        mo14108a(false, str);
        AbstractC11615c cVar = this.f19485bg;
        if (cVar != null) {
            cVar.mo18410d();
        }
        this.f19423V.mo28320c(C11326e.class, this.f19435aH);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14108a(boolean z, String str) {
        String str2;
        String str3 = "show";
        if (getUserVisibleHint() || !isHidden()) {
            HashMap hashMap = new HashMap();
            hashMap.put("event_name", "liveplay_background_status");
            if (z) {
                str2 = str3;
            } else {
                str2 = "hide";
            }
            hashMap.put("view_status", str2);
            hashMap.put("view_bg_reason", str);
            C6555i.m14021b().mo9217b("ttlive_room", hashMap);
        }
        HashMap hashMap2 = new HashMap();
        if (!z) {
            str3 = "hide";
        }
        hashMap2.put("bg_status", str3);
        hashMap2.put("bg_reason", str);
        hashMap2.put("bg_illegal", String.valueOf(this.f19517y));
        C6501b.C6502a.m13948a("liveplay_background_monitor").mo12643a(this.f19423V).mo12652a((Map<String, String>) hashMap2).mo12655b();
    }

    /* renamed from: a */
    public final void mo14100a(C9688bt btVar) {
        AbstractC2717b bVar;
        if (isAdded()) {
            boolean z = btVar.f23579f == 2;
            if (z != this.f19517y) {
                this.f19517y = z;
                if (z) {
                    m15905c("illegal Status");
                    if (isViewValid() && (bVar = this.f19514v) != null) {
                        bVar.setMute(true);
                        return;
                    }
                    return;
                }
                AbstractC2717b bVar2 = this.f19514v;
                if (bVar2 != null && bVar2.getDecodeStatus() == 1) {
                    mo14105a("recover from illegal status");
                }
                m15891R();
            }
        }
    }

    public void onEvent(C8456i iVar) {
        DataChannel dataChannel = this.f19423V;
        if (dataChannel != null && ((Boolean) dataChannel.mo28318b(C9074cm.class)).booleanValue()) {
            C6695f fVar = this.f19474av;
            if (fVar == null || fVar.f16606c != iVar.f20906a) {
                String str = "yes";
                if (iVar.f20906a) {
                    C6695f fVar2 = this.f19474av;
                    if (fVar2 != null) {
                        fVar2.f16606c = iVar.f20906a;
                        this.f19474av.f16605b = iVar.f20907b;
                        this.f19474av.f16604a = SystemClock.currentThreadTimeMillis();
                    }
                    C6501b a = C6501b.C6502a.m13948a("livesdk_mini_window_mute_or_pause_click").mo12651a("mute_or_pause", "mute");
                    if (!iVar.f20907b) {
                        str = "no";
                    }
                    a.mo12651a("is_auto", str).mo12655b();
                    mo14095a(2131234539, "", 2, 2);
                } else {
                    C6695f fVar3 = this.f19474av;
                    if (fVar3 != null) {
                        fVar3.f16606c = iVar.f20906a;
                        this.f19474av.mo12849a();
                    }
                    C6501b a2 = C6501b.C6502a.m13948a("livesdk_mini_window_mute_or_pause_click").mo12651a("mute_or_pause", "unmute");
                    if (!this.f19474av.f16605b) {
                        str = "no";
                    }
                    a2.mo12651a("is_auto", str).mo12655b();
                    mo14095a(2131234538, "", 1, 1);
                }
                C3854a.m9453a(4, "picture_in_picture", "onEvent(MuteEvent event): " + iVar.f20906a + iVar.f20907b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14098a(C7399p pVar) {
        if (!isResumed()) {
            DataChannel dataChannel = this.f19423V;
            if (dataChannel != null && ((Boolean) dataChannel.mo28318b(C9074cm.class)).booleanValue()) {
                this.f19423V.mo28320c(C4392af.class, true);
            }
            this.f19483be.add(pVar);
        } else if (this.f19510r == EnumC11662p.LIVE_STARTED) {
            if (3 == pVar.f18332a) {
                this.f19423V.mo28315b(C9031ay.class, (Object) true);
                AbstractC2717b bVar = this.f19514v;
                if (bVar != null) {
                    bVar.stopWhenJoinInteract(getContext());
                }
                this.f19404C.mo13985a(4);
                mo14145s();
            } else if (4 == pVar.f18332a) {
                this.f19423V.mo28315b(C9031ay.class, (Object) false);
                this.f19404C.mo13985a(0);
                AbstractC2717b bVar2 = this.f19514v;
                if (bVar2 != null) {
                    bVar2.tryResumePlay();
                    if (this.f19517y) {
                        this.f19514v.setMute(true);
                    }
                }
            }
        }
    }

    public void onEvent(C11756a aVar) {
        if (this.f19411J != null && getUserVisibleHint()) {
            this.f19482bd = aVar.f28122c;
            boolean z = false;
            if (aVar.f28121b == 2) {
                if (isViewValid() && this.f19506n != 0) {
                    ActivityC0945e activity = getActivity();
                    if (!(this.f19411J == null || activity == null || activity.getWindow() == null || mo14088C().mo12704e() == null)) {
                        mo14088C().mo12704e().mo15452a(false);
                    }
                    m15887N();
                    if (activity != null) {
                        activity.setRequestedOrientation(0);
                    }
                    this.f19433aF = true;
                } else {
                    return;
                }
            } else if (aVar.f28121b == 1) {
                ActivityC0945e activity2 = getActivity();
                if (!(activity2 == null || activity2.getWindow() == null || !C3931d.m9571a(activity2))) {
                    activity2.getWindow().clearFlags(1024);
                }
                if (isViewValid() && this.f19506n != 1) {
                    m15887N();
                    if (activity2 != null) {
                        activity2.setRequestedOrientation(1);
                    }
                    this.f19433aF = true;
                    if (!aVar.f28120a.isEmpty() && this.f19496d.getOwner().getSubscribeInfo() != null && this.f19496d.getOwner().getSubscribeInfo().isAnchorQualified() && aVar.f28120a.startsWith("subscribe_")) {
                        this.f19492bn = aVar.f28120a.substring(10);
                    }
                } else {
                    return;
                }
            }
            ActivityC0945e activity3 = getActivity();
            if (aVar.f28121b == 1) {
                z = true;
            }
            C8422f.m16636a(activity3, Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    public final void mo14099a(EnumC7841a aVar) {
        AbstractC11652i.AbstractC11654b bVar;
        if (getContext() != null) {
            String str = "mini_window";
            boolean z = false;
            switch (C78409.f19546b[aVar.ordinal()]) {
                case 1:
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gn8);
                    mo14096a(128, "fail to enter the room", this.f19495c);
                    mo14087B();
                    return;
                case 2:
                    if (this.f19457ad) {
                        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gn8);
                    }
                    this.f19457ad = true;
                    mo14096a(129, "fail to enter the room", this.f19495c);
                    if (!C7349a.m15251a() || (bVar = this.f19472at) == null || !bVar.mo12709j()) {
                        mo14087B();
                        return;
                    }
                    return;
                case 3:
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gn2);
                    m15912g(true);
                    Event event = new Event("live_play_enter_room_fail", 33801, EnumC11866b.BussinessApiCall);
                    event.mo19003a("live has ended.");
                    C11870f.C11871a.f28404a.mo19010a().mo18994a(event);
                    mo14096a(130, "live has ended.", this.f19495c);
                    mo14087B();
                    return;
                case 4:
                    mo14096a(121, "enter live end", this.f19495c);
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gn2);
                    m15912g(true);
                    mo14087B();
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    mo14096a(116, "fetch finished", this.f19495c);
                    mo14147u();
                    m15912g(true);
                    mo14107a(true);
                    this.f19510r = EnumC11662p.LIVE_FINISHED;
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    if (!m15889P() && !m15910e(1)) {
                        mo14096a(117, "fetch finished", this.f19495c);
                        mo14147u();
                        m15912g(true);
                        mo14107a(true);
                        this.f19510r = EnumC11662p.LIVE_FINISHED;
                        return;
                    }
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gp5);
                    mo14096a(118, "fetch finished", this.f19495c);
                    mo14147u();
                    mo14107a(true);
                    this.f19510r = EnumC11662p.LIVE_FINISHED;
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    mo14096a(114, "user close", this.f19495c);
                    m15890Q();
                    C2695a.f8059g.mo7218a(true, this.f19423V);
                    if (this.f19510r == EnumC11662p.LIVE_FINISHED) {
                        z = true;
                    }
                    m15912g(z);
                    if (this.f19511s != null) {
                        C11824c.m20827a(C11822a.class, new C11822a(new LatestLiveData(this.f19495c, System.currentTimeMillis(), this.f19511s.mo13675c())));
                        this.f19511s.mo13671a(this.f19496d);
                    }
                    mo14087B();
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    C6684c a = C6684c.C6686b.m14211a();
                    C6684c.EnumC6685a aVar2 = C6684c.EnumC6685a.BLOCK_USER;
                    DataChannel dataChannel = this.f19423V;
                    if (dataChannel == null || !((Boolean) dataChannel.mo28318b(C9074cm.class)).booleanValue()) {
                        str = "voice_only";
                    }
                    a.mo12832a(aVar2, str);
                    if (!m15910e(3)) {
                        C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("live_play_user_kick_out", 33806, EnumC11866b.MessageReceived));
                        mo14096a(110, "this user is kicked out by other device", this.f19495c);
                        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gs8);
                        mo14107a(true);
                        mo14087B();
                        return;
                    }
                    return;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                    C6684c a2 = C6684c.C6686b.m14211a();
                    C6684c.EnumC6685a aVar3 = C6684c.EnumC6685a.BLOCK_USER;
                    DataChannel dataChannel2 = this.f19423V;
                    if (dataChannel2 == null || !((Boolean) dataChannel2.mo28318b(C9074cm.class)).booleanValue()) {
                        str = "voice_only";
                    }
                    a2.mo12832a(aVar3, str);
                    if (!m15910e(2)) {
                        final DialogC7511a aVar4 = new DialogC7511a(getContext());
                        if (this.f19489bk && isAdded() && !aVar4.isShowing()) {
                            aVar4.show();
                        }
                        this.f19426Y.postDelayed(new Runnable() {
                            /* class com.bytedance.android.livesdk.chatroom.p499ui.C7822br.RunnableC78365 */

                            static {
                                Covode.recordClassIndex(8631);
                            }

                            public final void run() {
                                if (aVar4.isShowing()) {
                                    aVar4.dismiss();
                                }
                                C7822br brVar = C7822br.this;
                                brVar.mo14096a(111, "watcher kit out", brVar.f19495c);
                                if (!C7349a.m15251a() || C7822br.this.f19472at == null || !C7822br.this.f19472at.mo12709j()) {
                                    C7822br.this.mo14087B();
                                }
                            }
                        }, 2500);
                        Event event2 = new Event("live_play_watch_kick_out", 33803, EnumC11866b.MessageReceived);
                        event2.mo19003a("watcher kick out.");
                        C11870f.C11871a.f28404a.mo19010a().mo18994a(event2);
                        AbstractC81915c.m141874a(new C11771j(this.f19495c));
                        DataChannel dataChannel3 = this.f19423V;
                        if (dataChannel3 != null) {
                            dataChannel3.mo28311a(C6885av.class, (Object) false);
                            return;
                        }
                        return;
                    }
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                    mo14107a(true);
                    mo14107a(false);
                    mo14096a(112, "jump to other room", this.f19495c);
                    return;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                    if (!m15910e(1)) {
                        mo14096a(117, "fetch finished", this.f19495c);
                        mo14147u();
                        m15912g(true);
                        mo14107a(true);
                        this.f19510r = EnumC11662p.LIVE_FINISHED;
                        return;
                    }
                    return;
                default:
                    mo14096a(119, "jump to other room", this.f19495c);
                    mo14107a(true);
                    return;
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: a */
    public final void mo14104a(EnterRoomConfig enterRoomConfig, Room room) {
        this.f19463aj = enterRoomConfig;
        this.f19496d = room;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14095a(int i, String str, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 26 && C6682a.m14195a()) {
            if (this.f19465al == null) {
                this.f19465al = new PictureInPictureParams.Builder();
            }
            ArrayList arrayList = new ArrayList();
            PendingIntent broadcast = PendingIntent.getBroadcast(getContext(), i3, new Intent("media_control").putExtra("control_type", i2), 67108864);
            DataChannel dataChannel = this.f19423V;
            if (dataChannel != null && !((Boolean) dataChannel.mo28318b(C9031ay.class)).booleanValue()) {
                arrayList.add(new RemoteAction(Icon.createWithResource(getContext(), i), str, str, broadcast));
            }
            this.f19465al.setActions(arrayList);
            if (getActivity() != null) {
                getActivity().setPictureInPictureParams(this.f19465al.build());
            }
        }
    }

    /* renamed from: a */
    public final void mo14106a(String str, long j, long j2) {
        if (!this.f19445aR) {
            this.f19445aR = true;
            C6729h.m14301a(str, j, j2, this.f19514v != null ? System.currentTimeMillis() - this.f19514v.getStartTime() : -1, this.f19513u != null ? System.currentTimeMillis() - this.f19513u.f18438c : -1, C13603b.m24435a(this.f19420S) ? "" : C11116a.m19747a(this.f19420S));
        }
    }

    public void onEvent(C8452e eVar) {
        C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("live_play_on_jump_to_other_event", 1027, EnumC11866b.BussinessApiCall));
        C6555i.m14021b();
        C6555i.m9462a("ttlive_room", "received JumpToOtherRoomEvent");
        if (eVar.f20899d != null) {
            long j = eVar.f20899d.f28232b.f28277u;
            if (j > 0) {
                C6555i.m14021b();
                C6555i.m9462a("ttlive_portal", "preparing jump bundle, portalId=" + j + " originatingRoomId=" + this.f19495c);
                eVar.f20899d.f28232b.f28278v = this.f19495c;
            }
            if (!eVar.f20896a) {
                eVar.f20899d.f28233c.f28341av = eVar.f20897b;
            } else {
                eVar.f20899d.f28233c.f28341av = "jump_source_room_back";
            }
            eVar.f20899d.f28233c.f28342aw = eVar.f20896a;
            if (!(mo14086A() == null || mo14086A().getOwner() == null)) {
                this.f19463aj.f28233c.f28344ay = mo14086A().getOwner().getAvatarThumb();
            }
            if (this.f19510r == EnumC11662p.LIVE_STARTED) {
                RunnableC7862ck ckVar = new RunnableC7862ck(this, eVar);
                if (!this.f19411J.mo13949a(ckVar)) {
                    ckVar.run();
                    return;
                }
                return;
            }
            mo14099a(EnumC7841a.JUMP_TO_OTHER);
            AbstractC11652i.AbstractC11654b bVar = this.f19472at;
            if (bVar != null) {
                bVar.mo12695a(eVar.f20898c, eVar.f20899d, eVar.f20896a);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: v */
    public final void mo14148v() {
        this.f19451aX = System.currentTimeMillis();
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: x */
    public final void mo14150x() {
        mo14115b(true);
    }

    /* renamed from: K */
    private static boolean m15884K() {
        if (Build.VERSION.SDK_INT > 19) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    private void m15888O() {
        C6204h.m13481c(new RunnableC7854cc(this));
    }

    /* renamed from: R */
    private void m15891R() {
        AbstractC2717b bVar;
        if (isViewValid() && (bVar = this.f19514v) != null) {
            bVar.setMute(false);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: g */
    public final EnumC11662p mo14123g() {
        if (this.f19458ae) {
            return EnumC11662p.DETACHED;
        }
        return this.f19510r;
    }

    /* renamed from: p */
    public final void mo14142p() {
        Dialog dialog = this.f19412K;
        if (dialog != null && dialog.isShowing()) {
            this.f19412K.dismiss();
        }
    }

    static {
        Covode.recordClassIndex(8617);
    }

    /* renamed from: H */
    private boolean m15881H() {
        boolean z;
        boolean G = m15880G();
        AbstractC7703a aVar = this.f19411J;
        if (aVar != null) {
            z = aVar.f19105E;
        } else {
            z = false;
        }
        if (!G || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    private void m15886M() {
        AbstractC2721d logger;
        AbstractC2717b bVar = this.f19514v;
        if (bVar != null && (logger = bVar.getLogger()) != null) {
            logger.mo7296a(this.f19484bf);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: A */
    public final Room mo14086A() {
        View$OnClickListenerC7532a aVar = this.f19439aL;
        if (aVar == null || !aVar.isVisible()) {
            return this.f19496d;
        }
        return this.f19439aL.f18725i;
    }

    /* renamed from: C */
    public final AbstractC11650h mo14088C() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof C6561ab) {
            return (AbstractC11650h) parentFragment;
        }
        return new AbstractC11650h.C11651a();
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: e */
    public final void mo14121e() {
        C6555i.m14021b();
        C6555i.m9463b("invite_issue_check", "LinkIn_Guest_stopWhenFullySlidingOut");
        if (this.f19447aT) {
            m15905c("reset player");
            this.f19404C.mo13985a(8);
        }
        mo14122f();
    }

    /* renamed from: s */
    public final void mo14145s() {
        this.f19486bh.setVisibility(8);
        this.f19460ag.setVisibility(8);
        this.f19426Y.removeMessages(37);
        AbstractC11615c cVar = this.f19485bg;
        if (cVar != null) {
            cVar.mo18409c();
        }
    }

    /* renamed from: G */
    private boolean m15880G() {
        if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() != 1) {
            return false;
        }
        if (!TextUtils.isEmpty(this.f19463aj.f28233c.f28310a) || (this.f19496d != null && this.f19463aj.f28233c.f28296M == "draw")) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    private void m15883J() {
        C7435f fVar = this.f19513u;
        if (fVar != null) {
            fVar.mo13656b();
            this.f19513u = null;
            C7572d.m15561a("LivePlayFragment", "resetEnterRoom -> roomId=" + this.f19495c + ", userId=" + this.f19497e);
        }
    }

    /* renamed from: N */
    private void m15887N() {
        AbstractC7703a aVar = this.f19411J;
        if (aVar != null) {
            aVar.mo13958i();
            if (!this.mStatusDestroyed) {
                try {
                    getChildFragmentManager().mo3552a().mo3455a(this.f19411J).mo3478e();
                } catch (Throwable unused) {
                }
            }
            C11418d dVar = this.f19467an;
            if (dVar != null) {
                dVar.mo18257b();
            }
            this.f19467an = null;
            this.f19411J = null;
        }
    }

    /* renamed from: P */
    private boolean m15889P() {
        Room room;
        AbstractC4367a aVar = (AbstractC4367a) C6193a.m13435a(AbstractC4367a.class);
        if (aVar == null || !aVar.isMicRoomForCurrentRoom() || !aVar.isMicAudience() || (room = (Room) this.f19423V.mo28318b(C9093de.class)) == null || room.officialChannelInfo == null) {
            return false;
        }
        aVar.jumpRoom(room.officialChannelInfo.f23143h, true);
        return true;
    }

    /* renamed from: S */
    private void m15892S() {
        C6529h hVar = (C6529h) this.f19423V.mo28318b(C6531i.class);
        C6535m mVar = (C6535m) DataChannelGlobal.f42558d.mo28324b(C6536n.class);
        if (hVar != null) {
            hVar.f16314f = mVar;
        }
        DataChannelGlobal.f42558d.mo28321a(C6532j.class, hVar);
        C10095g.m18634b();
    }

    /* renamed from: V */
    private void m15895V() {
        ActivityC0945e activity;
        if (this.f19475aw == null && (activity = getActivity()) != null) {
            C6696g gVar = new C6696g();
            this.f19475aw = gVar;
            gVar.f16616i = activity;
            this.f19475aw.f16617j = this.f19497e;
            this.f19475aw.f16608a = this.f19459af;
            this.f19475aw.show(getActivity().getSupportFragmentManager(), "PipVideoViewContainDialog");
        }
    }

    /* renamed from: B */
    public final void mo14087B() {
        DataChannel dataChannel = this.f19423V;
        if (dataChannel == null || !((Boolean) dataChannel.mo28318b(C9074cm.class)).booleanValue()) {
            if (mo14088C().mo12703d() != null) {
                mo14088C().mo12703d().mo15450a();
            }
        } else if (getActivity() != null && Build.VERSION.SDK_INT >= 21) {
            getActivity().finishAndRemoveTask();
        }
    }

    /* renamed from: E */
    public final HashMap<String, String> mo14090E() {
        DataChannel dataChannel = this.f19423V;
        if (dataChannel == null) {
            return new HashMap<>();
        }
        HashMap<String, String> hashMap = (HashMap) dataChannel.mo28318b(C5787s.class);
        if (hashMap != null) {
            return hashMap;
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        this.f19423V.mo28311a(C5787s.class, hashMap2);
        return hashMap2;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: d */
    public final void mo14120d() {
        C6555i.m14021b();
        C6555i.m9463b("invite_issue_check", "LinkIn_Guest_stopWhenSliding");
        mo14122f();
        if (LiveUseSurfaceViewExperiment.INSTANCE.isEnable()) {
            AbstractC11615c cVar = this.f19485bg;
            if (cVar != null) {
                cVar.mo18410d();
            }
            m15905c("reset player");
            this.f19404C.mo13985a(8);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.p500a.C7711b.AbstractC7713b
    /* renamed from: l */
    public final void mo12711l() {
        View view;
        m15906d(8);
        if (Build.VERSION.SDK_INT >= 23 && (view = this.f19456ac) != null) {
            view.findViewById(R.id.fc1).setForeground(null);
        }
        ViewGroup viewGroup = this.f19405D;
        if (viewGroup != null) {
            viewGroup.setBackground(null);
        }
    }

    /* renamed from: o */
    public final void mo14131o() {
        if (C11199a.m19850a(this.f19423V)) {
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(this.f19495c));
            hashMap.put("anchor_id", String.valueOf(this.f19497e));
            C11199a.m19849a("live_ad", "live_play", null, hashMap);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        if (f19399a.booleanValue()) {
            C7572d.m15561a("LivePlayFragment", "onStart -> roomId=" + this.f19495c + ", userId=" + this.f19497e);
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        if (f19399a.booleanValue()) {
            C7572d.m15561a("LivePlayFragment", "onStop -> roomId=" + this.f19495c + ", userId=" + this.f19497e);
        }
        super.onStop();
        this.f19473au = true;
    }

    /* renamed from: t */
    public final void mo14146t() {
        if (C11115u.m19743a().mo17915b().mo13165e() && this.f19495c != 0) {
            m15883J();
            long j = this.f19495c;
            m15897a(j, m15903b(j));
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: z */
    public final void mo14152z() {
        C6555i.m14021b();
        C6555i.m9463b("invite_issue_check", "LinkIn_Guest_releasePlayerForNextRoomPrePullStream");
        mo14122f();
        AbstractC2717b bVar = this.f19514v;
        if (bVar == null) {
            if (this.f19459af != null && !this.f19480bb) {
                ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).recycleRoomPlayer(this.f19459af);
            }
            this.f19459af = null;
            return;
        }
        bVar.stop(true);
        this.f19514v.recycle();
        this.f19514v = null;
        this.f19459af = null;
    }

    /* renamed from: I */
    private void m15882I() {
        Room room;
        if (this.f19436aI != null && (room = this.f19496d) != null && this.f19437aJ != null) {
            if (room.getCover() != null || (this.f19496d.getOwner() != null && this.f19496d.getOwner().getAvatarMedium() != null)) {
                C13628n.m24504a(getContext());
                C13628n.m24521b(getContext());
                this.f19437aJ.setVisibility(0);
                this.f19436aI.setBackgroundColor(Color.parseColor("#000000"));
            }
        }
    }

    /* renamed from: Q */
    private void m15890Q() {
        C7435f fVar;
        if (C11115u.m19743a().mo17915b().mo13165e() && (fVar = this.f19513u) != null && fVar.f18441f != null && this.f19513u.f18441f.f19034a != null && this.f19513u.f18441f.f19034a.getOwner() != null && this.f19513u.f18441f.f19034a.getOwner().isFollowing()) {
            C6779a.m14563a().mo13053a(new C9162a());
        }
    }

    /* renamed from: U */
    private void m15894U() {
        EnterRoomConfig enterRoomConfig;
        if (!(this.f19511s == null || (enterRoomConfig = this.f19463aj) == null || !enterRoomConfig.f28233c.f28359o)) {
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(this.f19495c));
            hashMap.put("anchor_id", String.valueOf(this.f19497e));
            hashMap.put("duration", String.valueOf(this.f19511s.mo13675c()));
            C11199a.m19849a("live_ad", "exit", null, hashMap);
        }
        C11199a.m19848a(this.f19423V, this.f19463aj);
    }

    /* renamed from: F */
    public final boolean mo14091F() {
        boolean z;
        boolean z2;
        boolean z3;
        if (!LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
            if (!C7589k.m15601a(this.f19423V) || !LiveMtFeedDrawerShowMoreLiveSetting.INSTANCE.getValue()) {
                z = false;
            } else {
                z = true;
            }
            if (!C7589k.m15603b(this.f19423V) || !LiveMtForyouEntranceShowMoreLiveSetting.INSTANCE.getValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!C7589k.m15604c(this.f19423V) || !LiveMtFeedDrawerShowMoreLiveSetting.INSTANCE.getValue()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z || z2 || z3) {
                return true;
            }
            return false;
        } else if (!Boolean.valueOf(this.f19463aj.f28233c.f28345az).booleanValue() || LiveDrawerSettings.INSTANCE.getValue().getEnableDrawerRepeatJump()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public final void mo14111b() {
        Fragment parentFragment;
        if (this.f19423V != null) {
            if (C11725f.f28051c == null) {
                C11725f.f28051c = Boolean.valueOf(((IHostContext) C6193a.m13435a(IHostContext.class)).isOffline());
            }
            if (C11725f.f28051c.booleanValue() && (parentFragment = getParentFragment()) != null && (parentFragment instanceof C6561ab)) {
                this.f19423V.mo28311a(C8423e.class, ((C6561ab) parentFragment).mo12714o());
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: c */
    public final void mo14117c() {
        C7572d.m15561a("LivePlayFragment", "stopRoom -> roomId=" + this.f19495c + ", userId=" + this.f19497e);
        this.f19426Y.removeCallbacksAndMessages(null);
        mo14107a(true);
        C6555i.m14021b();
        C6555i.m9463b("invite_issue_check", "LinkIn_Guest_stopRoom");
        ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).handleLiveRoomStopped();
        C6894d.m14753a().mo13188b();
        C6898g.C6899a.f17285a.mo13197a();
        C4386c.m10499a().mo10161c();
        ((IMessageService) C6193a.m13435a(IMessageService.class)).release(this.f19495c);
        C4384b.C4385a.m10498a("stopRoom");
        this.f19431aD.mo13661a(false);
    }

    @Override // com.bytedance.android.livesdkapi.depend.p677a.AbstractC11623a, com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: i_ */
    public final boolean mo13772i_() {
        List<Fragment> f = getChildFragmentManager().mo3565f();
        boolean z = true;
        if (f == null || f.size() <= 0) {
            if (this.f19510r != EnumC11662p.LIVE_FINISHED) {
                z = false;
            }
            m15912g(z);
        } else {
            for (Fragment fragment : f) {
                if ((fragment instanceof AbstractC11623a) && ((AbstractC11623a) fragment).mo13772i_()) {
                    return true;
                }
            }
            if (this.f19411J == null && C7349a.m15253c()) {
                mo14112b(8);
            }
        }
        return false;
    }

    /* renamed from: m */
    public final void mo14129m() {
        if (this.f19514v != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f19404C.mo13987b();
            layoutParams.width = -1;
            layoutParams.height = -1;
            layoutParams.gravity = 17;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = 0;
            layoutParams.topMargin = 0;
            this.f19404C.mo13986a(layoutParams);
            int[] iArr = new int[2];
            this.f19514v.getVideoSize(iArr);
            if (iArr[0] != 0 && iArr[1] != 0) {
                mo14094a(iArr[0], iArr[1], C13628n.m24504a(getContext()));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.br$9 */
    public static /* synthetic */ class C78409 {

        /* renamed from: a */
        static final /* synthetic */ int[] f19545a;

        /* renamed from: b */
        static final /* synthetic */ int[] f19546b;

        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00b0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00ba */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00c4 */
        static {
            /*
            // Method dump skipped, instructions count: 207
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p499ui.C7822br.C78409.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.br$a */
    public enum EnumC7841a {
        ENTER_FAILED,
        FETCH_FAILED,
        ROOM_FETCH_FINISHED,
        EMPTY_URL,
        ROOM_PLAY_FINISHED,
        PING_KICK_OUT,
        USER_CLOSE,
        USER_KICK_OUT,
        WATCHER_KIT_OUT,
        JUMP_TO_OTHER,
        PLAYER_ERROR,
        ENTER_LIVE_END,
        MIC_ROOM_END;

        static {
            Covode.recordClassIndex(8636);
        }
    }

    public C7822br() {
        boolean z;
        if (!EnableSlideEnterRoomOptSetting.INSTANCE.getValue() || !EnableSlideVideoLastFrameSetting.INSTANCE.getValue()) {
            z = false;
        } else {
            z = true;
        }
        this.f19447aT = z;
        this.f19448aU = EnableSlideEnterRoomOptSetting.INSTANCE.getValue();
        this.f19449aV = LiveEnterDelayShowLoadingTimeSetting.INSTANCE.getValue();
        this.f19450aW = LiveClickEnterDelayShowLoadingTimeSetting.INSTANCE.getValue();
        this.f19451aX = 0;
        this.f19452aY = 0;
        this.f19480bb = LiveMultiPlayerEnableSetting.INSTANCE.getValue();
        this.f19426Y = new Handler(Looper.getMainLooper()) {
            /* class com.bytedance.android.livesdk.chatroom.p499ui.C7822br.HandlerC78231 */

            static {
                Covode.recordClassIndex(8618);
            }

            public final void handleMessage(Message message) {
                String str;
                ActivityC0945e activity;
                Boolean bool;
                super.handleMessage(message);
                int i = message.what;
                if (i == 28) {
                    C7822br.this.mo14111b();
                    C7822br brVar = C7822br.this;
                    Room room = (Room) message.obj;
                    C4017b.m9800b(C4017b.EnumC4018a.ShowCInteractionFirstWidget);
                    if (room == null) {
                        str = "other";
                    } else if (room.isScreenshot) {
                        str = "game";
                    } else if (room.isThirdParty) {
                        str = "thirdparty";
                    } else if (room.isLiveTypeAudio()) {
                        str = DataType.AUDIO;
                    } else {
                        str = "video";
                    }
                    brVar.f19415N = str;
                    if (brVar.f19510r == EnumC11662p.PREPARED) {
                        brVar.f19510r = EnumC11662p.LIVE_STARTED;
                        brVar.f19515w = false;
                        brVar.f19426Y.removeMessages(28);
                        DataChannelGlobal.f42558d.mo28321a(C9009ac.class, room);
                        C6555i.m14021b();
                        C6555i.m9463b("invite_issue_check", "LinkIn_Guest_startInteraction");
                        C6894d.m14753a().mo13188b();
                        C4386c.m10499a().mo10161c();
                        brVar.f19512t = new C7443i(room.getId(), room.getStreamId(), room.getLabels(), new C7443i.AbstractC7444a() {
                            /* class com.bytedance.android.livesdk.chatroom.p499ui.C7822br.C78332 */

                            static {
                                Covode.recordClassIndex(8628);
                            }

                            @Override // com.bytedance.android.livesdk.chatroom.detail.C7443i.AbstractC7444a
                            /* renamed from: c */
                            public final void mo13668c() {
                                C7822br.this.mo14146t();
                            }

                            @Override // com.bytedance.android.livesdk.chatroom.detail.C7443i.AbstractC7444a
                            /* renamed from: b */
                            public final void mo13667b() {
                                Event event = new Event("live_play_end_room_fetch_fail", 33796, EnumC11866b.ServerApiCall);
                                event.mo19003a("ping/audience, room finish");
                                C11870f.C11871a.f28404a.mo19010a().mo18994a(event);
                                C7822br.this.mo14099a(EnumC7841a.ROOM_PLAY_FINISHED);
                            }

                            @Override // com.bytedance.android.livesdk.chatroom.detail.C7443i.AbstractC7444a
                            /* renamed from: a */
                            public final boolean mo13666a() {
                                if (C7822br.this.f19514v == null) {
                                    return true;
                                }
                                C3854a.m9453a(3, "LivePlayFragment", "send play ping room. id:" + C7822br.this.f19495c + ",mActivityPause:" + (!C7822br.this.isResumed()) + ",mAudioLostFocusTime:" + C7822br.this.f19514v.getAudioLostFocusTime());
                                if (C7822br.this.isResumed() || C7822br.this.f19514v.getAudioLostFocusTime() == -1 || System.currentTimeMillis() - C7822br.this.f19514v.getAudioLostFocusTime() <= 10000) {
                                    return true;
                                }
                                C7822br.this.mo14143q();
                                C7822br brVar = C7822br.this;
                                brVar.mo14096a(120, "isn't resumed and lost audio", brVar.f19495c);
                                C7822br.this.mo14115b(true);
                                C7822br.this.f19516x = true;
                                return false;
                            }

                            @Override // com.bytedance.android.livesdk.chatroom.detail.C7443i.AbstractC7444a
                            /* renamed from: a */
                            public final void mo13665a(long j) {
                                C7822br.this.mo14096a(127, "audience/ping callback illegal + mosaicStatus: ".concat(String.valueOf(j)), C7822br.this.f19495c);
                            }

                            @Override // com.bytedance.android.livesdk.chatroom.detail.C7443i.AbstractC7444a
                            /* renamed from: a */
                            public final void mo13664a(int i) {
                                if (30004 == i) {
                                    Event event = new Event("live_play_ping_controller_fail", 33795, EnumC11866b.ServerApiCall);
                                    event.mo19003a("ping kick out");
                                    C11870f.C11871a.f28404a.mo19010a().mo18994a(event);
                                    C7822br.this.mo14099a(EnumC7841a.PING_KICK_OUT);
                                    return;
                                }
                                Event event2 = new Event("live_play_ping_controller_fail", 33794, EnumC11866b.ServerApiCall);
                                event2.mo19003a("ping/audience return error.");
                                C11870f.C11871a.f28404a.mo19010a().mo18994a(event2);
                                C7822br.this.mo14099a(EnumC7841a.ROOM_PLAY_FINISHED);
                            }
                        });
                        C7443i iVar = brVar.f19512t;
                        if (!iVar.f18465a) {
                            iVar.f18465a = true;
                            iVar.mo13663b();
                        }
                        brVar.mo14113b(room, false);
                        if (room.isLiveTypeAudio()) {
                            brVar.f19408G.setVisibility(0);
                            brVar.f19410I.setVisibility(0);
                            C3941k.m9604a(brVar.f19408G, room.getOwner().getAvatarLarge(), new C11291z(5, (float) (C13628n.m24504a(brVar.getContext()) / C13628n.m24521b(brVar.getContext()))));
                        }
                        if (room.getMosaicStatus() != 0) {
                            C9688bt btVar = new C9688bt();
                            btVar.f23579f = 2;
                            btVar.f23578a = brVar.getString(R.string.gpe);
                            brVar.mo14100a(btVar);
                        }
                        if (C7822br.f19399a.booleanValue()) {
                            C7572d.m15561a("LivePlayFragment", "startInteraction -> roomId=" + brVar.f19495c + ", userId=" + brVar.f19497e);
                        }
                        if (brVar.f19467an != null) {
                            C11418d dVar = brVar.f19467an;
                            boolean z = brVar.f19461ah;
                            boolean z2 = brVar.f19462ai;
                            dVar.f27376b = z;
                            dVar.f27375a = z2;
                            Handler handler = dVar.f27381g;
                            if (handler != null) {
                                handler.post(dVar.f27377c);
                            }
                            if (dVar.f27375a) {
                                Handler handler2 = dVar.f27381g;
                                if (handler2 != null) {
                                    handler2.post(dVar.f27378d);
                                    return;
                                }
                                return;
                            }
                            Handler handler3 = dVar.f27381g;
                            if (handler3 != null) {
                                handler3.postDelayed(dVar.f27378d, dVar.f27379e);
                            }
                        }
                    }
                } else if (i != 41) {
                    if (i == 37) {
                        C7822br.this.mo14144r();
                    } else if (i == 38 && message.obj != null && (message.obj instanceof DebugToolState)) {
                        C11725f.f28049a = ((DebugToolState) message.obj).getCanDebugTool();
                        C7822br.this.mo14111b();
                        C7822br brVar2 = C7822br.this;
                        if (brVar2.f19411J != null && C11725f.f28051c.booleanValue() && (bool = C11725f.f28049a) != null && bool.booleanValue() && (brVar2.f19411J instanceof C7891dd)) {
                            ((C7891dd) brVar2.f19411J).mo14188G();
                        }
                    }
                } else if (C7822br.this.mo14091F() && (activity = C7822br.this.getActivity()) != null && (activity instanceof AbstractC10135q) && !activity.isFinishing()) {
                    ((AbstractC10135q) activity).mo16976b();
                }
            }
        };
        this.f19481bc = false;
        this.f19457ad = true;
        this.f19483be = new ArrayList();
        this.f19461ah = false;
        this.f19462ai = false;
        this.f19490bl = new C88411a();
        this.f19492bn = "";
        this.f19470ar = new AbstractC8807b() {
            /* class com.bytedance.android.livesdk.chatroom.p499ui.C7822br.C782410 */

            static {
                Covode.recordClassIndex(8619);
            }

            @Override // com.bytedance.android.livesdk.gift.p549e.AbstractC8807b
            /* renamed from: a */
            public final void mo8519a(List<C9904t> list) {
            }

            @Override // com.bytedance.android.livesdk.gift.p549e.AbstractC8807b
            /* renamed from: b */
            public final void mo8520b(List<GiftPage> list) {
                C7822br.this.f19464ak = AbstractC88979t.m154294a(new C7873cv(list)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143300g();
            }
        };
        this.f19493bo = new AbstractC2717b.AbstractC2718a() {
            /* class com.bytedance.android.livesdk.chatroom.p499ui.C7822br.C782511 */

            /* renamed from: a */
            final int f19521a = LivePlayerErrorCountSetting.INSTANCE.getValue();

            /* renamed from: b */
            List<C7842b> f19522b = new ArrayList();

            /* renamed from: d */
            private int f19524d;

            /* renamed from: e */
            private final long f19525e = 0;

            /* renamed from: f */
            private final Queue<Long> f19526f = new LinkedList();

            static {
                Covode.recordClassIndex(8620);
            }

            @Override // com.bytedance.android.p149d.AbstractC2717b.AbstractC2718a
            /* renamed from: o */
            public final void mo7286o() {
                C7822br.this.mo14144r();
            }

            @Override // com.bytedance.android.p149d.AbstractC2717b.AbstractC2718a
            /* renamed from: k */
            public final void mo7282k() {
                if (!C7822br.this.f19515w && C7822br.this.f19404C.f19173a.getVisibility() == 0) {
                    C7822br.this.mo14144r();
                }
            }

            @Override // com.bytedance.android.p149d.AbstractC2717b.AbstractC2718a
            /* renamed from: n */
            public final void mo7285n() {
                C6555i.m14021b();
                C6555i.m9463b("invite_issue_check", "LinkIn_Guest_onPlayerDetached");
                HashMap hashMap = new HashMap();
                hashMap.put("event_name", "liveplay_player_detached");
                C6555i.m14021b().mo9217b("ttlive_pullstream", hashMap);
                C7822br.this.mo14122f();
                C7822br.this.f19458ae = true;
                long j = C7822br.this.f19495c;
                String str = C7822br.this.f19415N;
                String str2 = C7822br.this.f19499g;
                JSONObject jSONObject = new JSONObject();
                C6739l.m9475a(jSONObject, "room_type", str);
                C6739l.m9474a(jSONObject, "error_code", 0L);
                C6739l.m9475a(jSONObject, "error_msg", "player detach");
                C6739l.m9474a(jSONObject, "room_id", j);
                C6739l.m9475a(jSONObject, "pull_url", str2);
                Pair<String, String> b = C6739l.m14389b();
                C6739l.m9475a(jSONObject, "enter_from_merge", (String) b.first);
                C6739l.m9475a(jSONObject, "enter_method", (String) b.second);
                C3868c.m9497b("ttlive_player_detach_when_pulling", 0, jSONObject);
            }

            @Override // com.bytedance.android.p149d.AbstractC2717b.AbstractC2718a
            /* renamed from: m */
            public final void mo7284m() {
                boolean z;
                boolean z2 = true;
                if (!ShowAudienceDefinitionSelectionSetting.INSTANCE.isEnable()) {
                    return;
                }
                if (C7822br.this.f19500h == EnumC11728i.THIRD_PARTY || C7822br.this.f19500h == EnumC11728i.SCREEN_RECORD) {
                    Map<String, String> a = AbstractC6804a.f17020cP.mo13066a();
                    if (a == null || a.size() <= 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (System.currentTimeMillis() - SwitchDefinitionTipsWidget.f20246e <= 10000) {
                        z2 = false;
                    }
                    boolean isAudienceLowestDefinition = ((AbstractC4051b) C6193a.m13435a(AbstractC4051b.class)).isAudienceLowestDefinition();
                    C3854a.m9453a(4, "LivePlayFragment", "onBufferingStart(). hadManuallySelect=" + z + "; hadBeyond10Sec=" + z2 + "; isLowestDefinition=" + isAudienceLowestDefinition);
                    if (C7822br.this.f19423V != null && z && z2 && !isAudienceLowestDefinition) {
                        C7822br.this.f19423V.mo28319c(C9129k.class);
                    }
                }
            }

            @Override // com.bytedance.android.p149d.AbstractC2717b.AbstractC2718a
            /* renamed from: l */
            public final void mo7283l() {
                String str;
                boolean z;
                if (!C7822br.this.f19462ai) {
                    C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("first_frame", 33792, EnumC11866b.SdkCallback).mo19003a("first_frame"));
                }
                C7822br.this.f19462ai = true;
                C7421d a = C7421d.m15306a();
                if (a.f18405a && a.f18408d == null) {
                    a.f18408d = AbstractC88979t.m154307b((long) LiveMtRoomSlideUpGuideSetting.INSTANCE.getValue().getPlayTimes(), TimeUnit.SECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C7422e(a));
                }
                C7572d.m15561a("LivePlayFragment", " first frame received !!!!");
                C7822br.this.f19427Z.put("time", String.valueOf(System.currentTimeMillis() - C7822br.this.f19454aa));
                C7822br.this.f19427Z.put("location", " after onPlayDisplayed");
                ((AbstractC11807g) C6193a.m13435a(AbstractC11807g.class)).mo18865a("feed_enter_room", C7822br.this.f19427Z);
                if (C7822br.this.f19511s != null) {
                    C7445j jVar = C7822br.this.f19511s;
                    if (!jVar.f18503k) {
                        jVar.f18503k = true;
                        jVar.f18509q = SystemClock.elapsedRealtime() - jVar.f18506n;
                    }
                    C7445j jVar2 = C7822br.this.f19511s;
                    if (!jVar2.f18508p) {
                        jVar2.f18508p = true;
                        jVar2.f18507o = SystemClock.elapsedRealtime();
                        C6501b.C6502a.m13948a("live_stream_load_success").mo12643a(jVar2.f18476B).mo12654b("live_view").mo12656c("core").mo12658d("live_detail").mo12660e("live").mo12641a(C4384b.C4385a.m10496a().mo10155e()).mo12655b();
                    }
                    C7822br.this.f19511s.mo13673a(true, false, C7822br.this.f19463aj.f28233c.f28321ab, C7822br.this.f19496d);
                }
                int[] iArr = new int[2];
                if (C7822br.this.f19514v != null) {
                    C7822br.this.f19514v.getVideoSize(iArr);
                    C7822br.this.f19514v.changeSRSupportScene(true);
                }
                if (!(iArr[0] == 0 || iArr[1] == 0)) {
                    C7822br brVar = C7822br.this;
                    brVar.mo14094a(iArr[0], iArr[1], C13628n.m24504a(brVar.getContext()));
                    if (C7822br.this.f19411J != null) {
                        C7822br.this.f19423V.mo28315b(C5766ab.class, new C7380am(C7822br.this.f19505m, C7822br.this.f19508p));
                    }
                }
                C7822br.this.mo14145s();
                C7822br brVar2 = C7822br.this;
                if (brVar2.f19405D != null) {
                    brVar2.f19405D.post(RunnableC7866co.f19589a);
                }
                if (!C7822br.this.f19517y) {
                    if (C7822br.this.f19500h != EnumC11728i.AUDIO) {
                        C7822br.this.mo14105a("first frame");
                    }
                    if (C7822br.this.f19511s != null) {
                        C7445j jVar3 = C7822br.this.f19511s;
                        HashMap hashMap = new HashMap();
                        long j = jVar3.f18501i.f28232b.f28279w;
                        if (j > 0) {
                            jVar3.f18501i.f28232b.f28279w = 0;
                            hashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - j));
                            hashMap.put("request_page", C7411d.m15284a().mo13614e());
                            if (!C13627m.m24498a(C7411d.m15284a().mo13614e())) {
                                hashMap.put("enter_live_method", C7411d.m15284a().mo13614e());
                            }
                            C6501b.C6502a.m13948a("livesdk_toplive_enter_room_duration").mo12652a((Map<String, String>) hashMap).mo12643a(jVar3.f18476B).mo12655b();
                            C6501b.C6502a.m13948a("livesdk_live_stream_load_duration").mo12652a((Map<String, String>) hashMap).mo12643a(jVar3.f18476B).mo12655b();
                            if (jVar3.f18480F > 0) {
                                hashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - jVar3.f18480F));
                                C6501b.C6502a.m13948a("livesdk_new_style_pull_stream_duration").mo12652a((Map<String, String>) hashMap).mo12643a(jVar3.f18476B).mo12655b();
                            }
                        }
                    }
                } else {
                    C7822br.this.mo14108a(true, "first frame but in illegal status");
                    if (C7822br.this.f19514v != null) {
                        C7822br.this.f19514v.setMute(true);
                    }
                }
                if (C7822br.this.f19468ao) {
                    C7822br.this.mo14126j();
                }
                if (C7822br.this.f19518z) {
                    C7822br.this.f19518z = false;
                    C11226ao.m19883a(C3966y.m9669e(), C7822br.this.getString(R.string.grt), 0);
                }
                if (C7822br.this.mo14088C().mo12704e() != null) {
                    C7822br.this.mo14088C().mo12704e();
                }
                this.f19524d = 0;
                if (!(C7822br.this.f19514v == null || C7822br.this.f19514v.getLogger() == null || !TestDisablePullStreamInfoSetting.INSTANCE.getValue())) {
                    C7822br.this.f19423V.mo28320c(C9109du.class, C7822br.this.f19514v.getLogger());
                }
                if (C7822br.this.f19467an != null) {
                    C11418d dVar = C7822br.this.f19467an;
                    dVar.f27375a = C7822br.this.f19462ai;
                    if (dVar.f27376b) {
                        Handler handler = dVar.f27381g;
                        if (handler != null) {
                            handler.removeCallbacks(dVar.f27378d);
                        }
                        Handler handler2 = dVar.f27381g;
                        if (handler2 != null) {
                            handler2.post(dVar.f27378d);
                        }
                    }
                }
                C7822br.this.f19423V.mo28320c(C9020an.class, true);
                C7822br brVar3 = C7822br.this;
                if (brVar3.mo14116b(brVar3.f19496d)) {
                    C7822br.this.f19514v.stop(false);
                    C7822br brVar4 = C7822br.this;
                    brVar4.mo14103a(brVar4.f19496d);
                }
                C7822br brVar5 = C7822br.this;
                Map map = (Map) brVar5.f19423V.mo28318b(C9125g.class);
                AbstractC4357d dVar2 = (AbstractC4357d) C6193a.m13435a(AbstractC4357d.class);
                if (dVar2 != null) {
                    AbstractC5777j b = dVar2.getLivePlayControllerManager().mo11553b(brVar5.f19459af);
                    StringBuilder append = new StringBuilder("markAudienceDefinitionInfo(). tag=").append(brVar5.f19459af).append(", livePlayController=");
                    if (b == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C3854a.m9453a(4, "LivePlayFragment", append.append(z).toString());
                    if (b != null) {
                        str = b.mo11547g();
                        C3854a.m9453a(4, "LivePlayFragment", "markAudienceDefinitionInfo(). tag=" + brVar5.f19459af + ", currentSdkKey=" + str);
                        if (map != null || !str.equals(map.get("sdk_key"))) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("sdk_key", str);
                            hashMap2.put("start_time", String.valueOf(System.currentTimeMillis()));
                            brVar5.f19423V.mo28315b(C9125g.class, hashMap2);
                        }
                        return;
                    }
                }
                str = "";
                if (map != null) {
                }
                HashMap hashMap22 = new HashMap();
                hashMap22.put("sdk_key", str);
                hashMap22.put("start_time", String.valueOf(System.currentTimeMillis()));
                brVar5.f19423V.mo28315b(C9125g.class, hashMap22);
            }

            @Override // com.bytedance.android.p149d.AbstractC2717b.AbstractC2718a
            /* renamed from: a */
            public final void mo7281a(String str) {
                C3854a.m9453a(4, "LivePlayFragment", "onResolutionDegrade. newResolution=".concat(String.valueOf(str)));
                C7822br.this.f19423V.mo28315b(C9126h.class, str);
            }

            @Override // com.bytedance.android.p149d.AbstractC2717b.AbstractC2718a
            /* renamed from: a */
            public final void mo7279a(Exception exc) {
                C7822br.this.f19455ab.mo12948a(105, "ttplayer init failed", C7822br.this.f19495c, C7822br.this.f19415N, C7822br.this.f19499g);
                C7822br.this.mo14106a("onError, " + exc.getMessage(), 204, -1);
                C7822br brVar = C7822br.this;
                brVar.mo14096a(105, "ttplayer init failed", brVar.f19495c);
                C7822br.this.mo14114b("pull_stream_error");
                C7822br.this.mo14099a(EnumC7841a.PLAYER_ERROR);
                Event event = new Event("live_play_enter_room_fail", 33793, EnumC11866b.SdkInterfaceCall);
                event.mo19003a("player error, there is some problem while starting player.");
                C11870f.C11871a.f28404a.mo19010a().mo18994a(event);
                C4017b.m9795a(C4017b.EnumC4018a.StartLivePlay, C4017b.m9793a("error", "ttplayer init failed"));
                C4017b.m9795a(C4017b.EnumC4018a.ScrollWatchLivePlay, C4017b.m9793a("error", "ttplayer init failed"));
                this.f19524d = 0;
            }

            @Override // com.bytedance.android.p149d.AbstractC2717b.AbstractC2718a
            /* renamed from: a */
            public final void mo7280a(Object obj) {
                boolean z;
                if (C7822br.this.f19411J != null && (C7822br.this.f19411J instanceof C7891dd) && (obj instanceof String)) {
                    boolean z2 = true;
                    if (!C6894d.m14753a().f17248n.booleanValue() || 2 == C4386c.m10499a().f17248n.intValue()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!LiveAnchorLinkmicSpeedUpSeiSetting.INSTANCE.getValue() && !C4384b.C4385a.m10496a().f11937a) {
                        z2 = false;
                    }
                    if (z || z2) {
                        C7891dd ddVar = (C7891dd) C7822br.this.f19411J;
                        String str = (String) obj;
                        if (ddVar.f19628H != null) {
                            ddVar.f19628H.mo10197a(str);
                        }
                    }
                }
            }

            @Override // com.bytedance.android.p149d.AbstractC2717b.AbstractC2718a
            /* renamed from: a */
            public final void mo7277a(int i, int i2) {
                boolean z;
                C3854a.m9453a(3, "RenderView", "onVideoSizeChanged, width" + i + "height" + i2);
                C7822br brVar = C7822br.this;
                if (i > i2) {
                    z = true;
                } else {
                    z = false;
                }
                brVar.f19505m = z;
                if (C7822br.this.f19505m || C7822br.this.f19506n != 0) {
                    if (!(i == 0 || i2 == 0)) {
                        C7822br brVar2 = C7822br.this;
                        brVar2.mo14094a(i, i2, C13628n.m24504a(brVar2.getContext()));
                    }
                    if (C7822br.this.f19411J != null) {
                        C7822br.this.f19423V.mo28315b(C5766ab.class, new C7380am(C7822br.this.f19505m, C7822br.this.f19508p));
                    }
                } else if (C7822br.this.f19411J != null) {
                    C7822br.this.onEvent(new C11756a(1));
                } else {
                    C7822br.this.getActivity().setRequestedOrientation(1);
                    C7822br.this.f19506n = 1;
                    C7822br.this.f19514v.setScreenOrientation(true);
                }
                boolean z2 = C7822br.this.f19505m;
                long j = C7822br.this.f19495c;
                JSONObject jSONObject = new JSONObject();
                C6739l.m9474a(jSONObject, "exit_code", 0L);
                C6739l.m9475a(jSONObject, "exit_msg", "is horizontal? :".concat(String.valueOf(z2)));
                C6739l.m9474a(jSONObject, "room_id", j);
                C3868c.m9492a("ttlive_audience_room_status_changed", 3, jSONObject);
            }

            @Override // com.bytedance.android.p149d.AbstractC2717b.AbstractC2718a
            /* renamed from: a */
            public final void mo7278a(int i, String str) {
                Map map = (Map) C4139e.C4140a.f11576c.mo46671a(str, new C27895a<Map<String, String>>() {
                    /* class com.bytedance.android.livesdk.chatroom.p499ui.C7822br.C782511.C78261 */

                    static {
                        Covode.recordClassIndex(8621);
                    }
                }.type);
                if (map.containsKey("error_code")) {
                    String str2 = (String) map.get("error_code");
                    if (str2 != null) {
                        C6739l lVar = C7822br.this.f19455ab;
                        int intValue = Integer.valueOf(str2).intValue();
                        long j = C7822br.this.f19495c;
                        String str3 = C7822br.this.f19415N;
                        String str4 = C7822br.this.f19499g;
                        if (lVar.f16724c != 1) {
                            if (lVar.f16724c == 2) {
                                lVar.mo12948a(intValue, str, j, str3, str4);
                            } else if (lVar.f16725d == null) {
                                lVar.f16725d = new C6750t(intValue, str, j, str3, str4);
                            }
                        }
                        C6729h.m14301a("onPlayerError, ".concat(String.valueOf(str)), 209, (long) Integer.valueOf(str2).intValue(), 0, 0, "");
                        C7822br.this.f19420S.add(str2);
                    }
                    this.f19522b.add(new C7842b(i, str));
                }
                int i2 = this.f19524d + 1;
                this.f19524d = i2;
                if (i2 > this.f19521a) {
                    Event event = new Event("live_play_enter_room_fail", 33809, EnumC11866b.SdkInterfaceCall);
                    event.mo19003a(C11116a.m19747a(this.f19522b));
                    this.f19524d = 0;
                    this.f19522b = new ArrayList();
                    C11870f.C11871a.f28404a.mo19010a().mo18994a(event);
                }
            }
        };
    }

    /* renamed from: L */
    private void m15885L() {
        if (!this.f19462ai && this.f19404C != null && !this.f19487bi && this.f19444aQ && LiveUseSurfaceViewExperiment.INSTANCE.isEnable() && !C13627m.m24498a(this.f19477ay)) {
            StreamData streamData = (StreamData) C4139e.C4140a.f11576c.mo46670a(this.f19463aj.f28231a.f28377d, StreamData.class);
            if (!C13627m.m24498a(streamData.getStreamDataOriginMain())) {
                StreamData.StreamDataOriginMainSDKParams streamDataOriginMainSDKParams = (StreamData.StreamDataOriginMainSDKParams) C4139e.C4140a.f11576c.mo46670a(streamData.getStreamDataOriginMain(), StreamData.StreamDataOriginMainSDKParams.class);
                C7572d.m15562b("RenderView", "pre adjust:width: " + streamDataOriginMainSDKParams.getWidth() + ",height: " + streamDataOriginMainSDKParams.getHeight() + ",");
                if (this.f19463aj.f28233c.f28336aq) {
                    mo14094a(streamDataOriginMainSDKParams.getHeight(), streamDataOriginMainSDKParams.getWidth(), C13628n.m24504a(getContext()));
                    ((AbstractC11877e) this.f19404C.f19173a).mo19014a(streamDataOriginMainSDKParams.getHeight(), streamDataOriginMainSDKParams.getWidth());
                    return;
                }
                mo14094a(streamDataOriginMainSDKParams.getWidth(), streamDataOriginMainSDKParams.getHeight(), C13628n.m24504a(getContext()));
                ((AbstractC11877e) this.f19404C.f19173a).mo19014a(streamDataOriginMainSDKParams.getWidth(), streamDataOriginMainSDKParams.getHeight());
            }
        }
    }

    /* renamed from: T */
    private void m15893T() {
        String str;
        if (this.f19479ba > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f19479ba;
            long j = this.f19421T;
            this.f19421T = 0;
            this.f19479ba = 0;
            if (j > 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("duration_room", String.valueOf(currentTimeMillis));
                hashMap.put("duration_gift_effect", String.valueOf(j));
                double d = (double) j;
                Double.isNaN(d);
                double d2 = (double) currentTimeMillis;
                Double.isNaN(d2);
                hashMap.put("gift_effect_live_ratio", String.valueOf((d * 1.0d) / d2));
                if (((Boolean) this.f19423V.mo28318b(C9119ed.class)).booleanValue()) {
                    str = "1";
                } else {
                    str = "0";
                }
                hashMap.put("is_anchor", str);
                hashMap.put("room_type", LivePerformanceManager.getInstance().getRoomType(this.f19500h));
                C6501b.C6502a.m13948a("livesdk_gift_effect_show_summary").mo12652a((Map<String, String>) hashMap).mo12643a(this.f19423V).mo12655b();
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: f */
    public final void mo14122f() {
        C7572d.m15561a("LivePlayFragment", "<!!!> stopRoomWithoutReleasePlayer -> roomId=" + this.f19495c + ", userId=" + this.f19497e);
        this.f19490bl.mo142944a();
        this.f19434aG = false;
        this.f19426Y.removeCallbacksAndMessages(null);
        mo14096a(115, "change page", this.f19495c);
        mo14107a(false);
        C6555i.m14021b();
        C6555i.m9463b("invite_issue_check", "LinkIn_Guest_stopRoomWithoutReleasePlayer");
        C6894d.m14753a().mo13188b();
        C4386c.m10499a().mo10161c();
        this.f19431aD.mo13661a(false);
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onDestroy() {
        C6555i.m14021b();
        C6555i.m9463b("invite_issue_check", "LinkIn_Guest_onDestroy");
        if (f19399a.booleanValue()) {
            C7572d.m15561a("LivePlayFragment", "onDestroy -> roomId=" + this.f19495c + ", userId=" + this.f19497e);
        }
        super.onDestroy();
        ValueAnimator valueAnimator = this.f19453aZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C6696g gVar = this.f19475aw;
        if (gVar != null) {
            gVar.dismissAllowingStateLoss();
        }
        mo14117c();
        ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).getHybridDialogManager().mo7672a();
        C7445j jVar = this.f19511s;
        if (jVar != null) {
            jVar.mo13669a();
        }
        if (LiveDrawerVersion.INSTANCE.getValue()) {
            C8422f.m16637a(getActivity(), false, null, null);
        }
        this.f19440aM = null;
        C7599q qVar = this.f19432aE;
        if (qVar != null) {
            qVar.mo13837b();
            this.f19432aE = null;
        }
        this.f19495c = 0;
        this.f19497e = 0;
        this.f19498f = null;
        this.f19499g = null;
        this.f19476ax = null;
        this.f19477ay = null;
        this.f19478az = null;
        this.f19500h = EnumC11728i.VIDEO;
        this.f19428aA = null;
        this.f19510r = EnumC11662p.IDLE;
        this.f19511s = null;
        this.f19468ao = false;
        this.f19516x = false;
        this.f19501i = false;
        this.f19504l = false;
        this.f19434aG = false;
        this.f19487bi = false;
        LivePerformanceManager.getInstance().setStreamType(this.f19500h);
        AbstractC88412b bVar = this.f19464ak;
        if (bVar != null) {
            bVar.dispose();
        }
        EventBus.m156962a().mo145395b(this);
        if (getContext() != null) {
            getContext().unregisterReceiver(this.f19494bp);
            C3854a.m9453a(4, "picture_in_picture", "unregisterReceiver");
        }
        C6695f fVar = this.f19474av;
        if (fVar != null) {
            fVar.mo12849a();
        }
        this.f19474av = null;
        DataChannelGlobal.f42558d.mo28327c(C9095dg.class);
        DataChannelGlobal.f42558d.mo28327c(C9100dl.class);
        DataChannelGlobal.f42558d.mo28327c(C9024ar.class);
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onPause() {
        AbstractC2717b bVar;
        if (f19399a.booleanValue()) {
            C7572d.m15561a("LivePlayFragment", "onPause -> roomId=" + this.f19495c + ", userId=" + this.f19497e);
        }
        AbstractC2717b bVar2 = this.f19514v;
        if (bVar2 != null) {
            bVar2.onBackground();
        }
        C7445j jVar = this.f19511s;
        jVar.f18504l = true;
        if (jVar.f18506n != -1) {
            jVar.f18510r = SystemClock.elapsedRealtime();
            jVar.f18496d.removeCallbacksAndMessages(null);
            jVar.f18493a = true;
            C7413a a = C7413a.m15292a();
            a.f18387b = false;
            a.f18389d = a.mo13618b();
            a.f18388c = -1;
            a.f18392g.removeMessages(C7413a.C7416b.f18398a);
            C3854a.m9453a(4, "AudienceLivePlayTaskManager", "roomBackgroundDuration duration: " + a.mo13618b());
        }
        C7599q qVar = this.f19432aE;
        if (qVar.f18844d) {
            qVar.f18845e = true;
            qVar.f18843c.removeCallbacksAndMessages(null);
        }
        super.onPause();
        if (!C6682a.m14195a() && (bVar = this.f19514v) != null) {
            bVar.changeSRSupportScene(false);
        }
        Room room = this.f19496d;
        if (!(room == null || room.maskLayer == null)) {
            C4087e.C4091c.f11305a.mo9544a(true);
        }
        C10095g.m18640h();
    }

    /* renamed from: q */
    public final void mo14143q() {
        if (this.f19510r == EnumC11662p.LIVE_STARTED) {
            this.f19426Y.removeMessages(28);
            if (m15881H()) {
                AbstractC7703a aVar = this.f19411J;
                if (aVar != null) {
                    aVar.mo13958i();
                }
                C11418d dVar = this.f19467an;
                if (dVar != null) {
                    dVar.mo18256a();
                }
                DataChannel dataChannel = this.f19423V;
                if (dataChannel != null) {
                    dataChannel.mo28320c(C9020an.class, false);
                }
            } else {
                m15887N();
                DataChannel dataChannel2 = this.f19423V;
                if (dataChannel2 != null) {
                    dataChannel2.mo28320c(C9020an.class, false);
                }
            }
            ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).clearMockChatMessage();
            m15891R();
            C7443i iVar = this.f19512t;
            if (iVar != null) {
                iVar.mo13662a();
                this.f19512t = null;
            }
            C7307f.m15214a(this.f19495c);
            this.f19511s.mo13671a(this.f19496d);
            DataChannelGlobal.f42558d.mo28327c(C9009ac.class);
            this.f19515w = false;
            this.f19517y = false;
            this.f19510r = EnumC11662p.PREPARED;
            if (f19399a.booleanValue()) {
                C7572d.m15561a("LivePlayFragment", "stopInteraction, roomId=" + this.f19495c + ", userId=" + this.f19497e);
            }
        }
    }

    /* renamed from: r */
    public final void mo14144r() {
        View view;
        AbstractC11615c cVar = this.f19485bg;
        if (cVar != null) {
            cVar.mo18409c();
        }
        if (!this.f19444aQ || this.f19462ai || TextUtils.equals(this.f19463aj.f28233c.f28320aa, "inner_draw")) {
            if (this.f19462ai && this.f19509q != 0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                if (this.f19506n == 1) {
                    layoutParams.topMargin = this.f19509q;
                    layoutParams.gravity = 1;
                } else {
                    layoutParams.leftMargin = this.f19407F.getWidth() / 2;
                    layoutParams.gravity = 16;
                }
                this.f19460ag.setLayoutParams(layoutParams);
            }
            view = this.f19460ag;
        } else {
            view = this.f19486bh;
        }
        AbstractC5777j b = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11553b(this.f19459af);
        if (this.f19487bi && b != null && b.mo11546f()) {
            view.setVisibility(8);
        } else if (this.f19469ap || EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() != 1) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: D */
    public final void mo14089D() {
        boolean z;
        try {
            ActivityC0945e activity = getActivity();
            DataChannel dataChannel = this.f19423V;
            if ((dataChannel == null || !((Boolean) dataChannel.mo28318b(C9074cm.class)).booleanValue()) && !((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isAudienceApplied()) {
                Room room = this.f19496d;
                if ((room == null || room.getOwner() == null || this.f19496d.getOwner().getSecret() != 1) && !C6905bf.m14776a().mo13209d()) {
                    Dialog dialog = this.f19412K;
                    if (dialog != null && dialog.isShowing()) {
                        return;
                    }
                    if (this.f19462ai) {
                        if (activity == null || !activity.hasWindowFocus()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (MtPipWatchLiveUnderWindowFocusSetting.INSTANCE.getValue()) {
                            z = true;
                        }
                        if (C6682a.m14195a() && getUserVisibleHint() && z) {
                            SurfaceView surfaceView = null;
                            if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getUserRole(C11115u.m19743a().mo17915b().mo13161c()) != EnumC4408av.GUEST_AUDIENCE || ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getLinkInAnchorSurface() == null) {
                                C3854a.m9453a(4, "picture_in_picture", "getPipVideoView  livePlayController");
                                AbstractC5777j b = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11553b(this.f19459af);
                                if (!(b == null || b.mo12931o() == null)) {
                                    View o = b.mo12931o();
                                    if (o instanceof TextureRenderView) {
                                        surfaceView = o;
                                    } else if (o instanceof SurfaceRenderView) {
                                        surfaceView = o;
                                    }
                                }
                            } else {
                                C3854a.m9453a(4, "picture_in_picture", "getPipVideoView  getLinkMicSurface");
                                surfaceView = ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getLinkInAnchorSurface();
                            }
                            this.f19465al = new PictureInPictureParams.Builder();
                            mo14095a(2131234538, "", 1, 1);
                            if (surfaceView != null) {
                                int width = surfaceView.getWidth();
                                int height = surfaceView.getHeight();
                                if (!(width == 0 || height == 0)) {
                                    Rational rational = new Rational(width, height);
                                    C3854a.m9453a(4, "picture_in_picture", "width is " + width + ", height is " + height + "aspect ratio" + rational.toString());
                                    this.f19465al.setAspectRatio(rational);
                                }
                            }
                            if (activity.enterPictureInPictureMode(this.f19465al.build())) {
                                C13628n.m24510a(this.f19456ac.findViewById(R.id.b82), 8);
                                DataChannel dataChannel2 = this.f19423V;
                                if (dataChannel2 != null) {
                                    dataChannel2.mo28315b(C9074cm.class, (Object) true);
                                    C3854a.m9453a(4, "picture_in_picture", "data center set true");
                                    if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getUserRole(C11115u.m19743a().mo17915b().mo13161c()) == EnumC4408av.NORMAL_AUDIENCE) {
                                        m15895V();
                                    }
                                }
                                C6684c.C6686b.m14211a().f16583a = true;
                            }
                        }
                    }
                }
            }
        } catch (IllegalStateException unused) {
            C3854a.m9453a(4, "pip", "enter pip error");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c2, code lost:
        if (r0 <= 0) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e4  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14126j() {
        /*
        // Method dump skipped, instructions count: 504
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p499ui.C7822br.mo14126j():void");
    }

    /* renamed from: u */
    public final void mo14147u() {
        long j;
        String str;
        if ((!InboxTopLivesEnterRoomOptiSetting.INSTANCE.getValue() || !C7589k.m15600a(this.f19463aj) || !this.f19472at.mo12700a(this.f19495c)) && isAdded() && isViewValid()) {
            C6684c.C6686b.m14211a().f16584b = true;
            C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("live_play_show_live_end", 33812, EnumC11866b.SdkInterfaceCall).mo19003a("show live end."));
            AbstractC7703a aVar = this.f19411J;
            if (aVar != null) {
                aVar.mo13958i();
            }
            mo14145s();
            if (this.f19506n == 0) {
                this.f19506n = 1;
                getActivity().setRequestedOrientation(1);
            }
            View view = this.f19419R;
            if (view != null) {
                view.setVisibility(8);
            }
            if (this.f19413L == null && LiveNewAudienceFinishPageSetting.INSTANCE.getValue().enableLab == 0) {
                AbstractC0952i childFragmentManager = getChildFragmentManager();
                Fragment a = childFragmentManager.mo3551a("LiveNewAudienceEndFragment");
                if (a == null) {
                    Room room = null;
                    C7435f fVar = this.f19513u;
                    if (!(fVar == null || fVar.f18441f == null || this.f19513u.f18441f.f19034a == null)) {
                        room = this.f19513u.f18441f.f19034a;
                    }
                    C7512b bVar = new C7512b();
                    this.f19413L = bVar;
                    bVar.mo13769a(getActivity(), room, new AbstractC11623a() {
                        /* class com.bytedance.android.livesdk.chatroom.p499ui.C7822br.C78376 */

                        static {
                            Covode.recordClassIndex(8632);
                        }

                        @Override // com.bytedance.android.livesdkapi.depend.p677a.AbstractC11623a
                        /* renamed from: i_ */
                        public final boolean mo13772i_() {
                            C6558k.m14024a(C7822br.this.getActivity());
                            C7822br.this.mo14112b(8);
                            return true;
                        }
                    }, this.f19511s.f18513u, this.f19463aj.f28233c.f28293J);
                    childFragmentManager.mo3552a().mo3454a(R.id.b82, this.f19413L, "LiveNewAudienceEndFragment").mo3473c();
                    C6739l.m14390c();
                    this.f19413L.getLifecycle().mo4012a(new LivePlayFragment$16(this));
                } else {
                    this.f19413L = (C7512b) a;
                }
                this.f19413L.f18658c = this.f19423V;
            } else if (this.f19439aL == null) {
                AbstractC0952i childFragmentManager2 = getChildFragmentManager();
                View$OnClickListenerC7532a aVar2 = new View$OnClickListenerC7532a();
                this.f19439aL = aVar2;
                EnterRoomConfig enterRoomConfig = this.f19463aj;
                if (enterRoomConfig == null) {
                    j = 0;
                } else {
                    j = enterRoomConfig.f28233c.f28301R;
                }
                aVar2.f18727k = j;
                View$OnClickListenerC7532a aVar3 = this.f19439aL;
                EnterRoomConfig enterRoomConfig2 = this.f19463aj;
                if (enterRoomConfig2 != null) {
                    str = enterRoomConfig2.f28233c.f28293J;
                } else {
                    str = "";
                }
                aVar3.f18701h = str;
                this.f19439aL.f18726j = new C7863cl(this);
                AbstractC0976n a2 = childFragmentManager2.mo3552a();
                a2.mo3454a(R.id.b82, this.f19439aL, "LiveNewAudienceEndFragment");
                a2.mo3473c();
            } else {
                return;
            }
            C2695a.f8059g.f8063c = "end_live";
            C8422f.m16638a((Activity) getActivity(), false);
            C8422f.m16636a((Activity) getActivity(), (Boolean) false);
            this.f19423V.mo28319c(C5786r.class);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: k */
    public final void mo14127k() {
        long longValue;
        String str;
        long j;
        int i;
        int i2;
        boolean z = false;
        this.f19445aR = false;
        EnterRoomConfig enterRoomConfig = this.f19463aj;
        if (enterRoomConfig != null) {
            C6560m.m14027a(enterRoomConfig.f28233c.f28333an, this.f19463aj.f28233c.f28334ao);
        }
        C2695a.f8059g.f8066f = this.f19463aj.f28233c.f28301R;
        if (f19399a.booleanValue()) {
            C3854a.m9453a(3, "LivePlayFragment", "startRoom, roomId=" + this.f19495c + ", userId=" + this.f19497e);
        }
        mo14090E().put("param_live_create_time", new StringBuilder().append(System.currentTimeMillis()).toString());
        C7572d.m15561a("LivePlayFragment", "startRoom -> roomId=" + this.f19495c + ", userId=" + this.f19497e);
        this.f19479ba = System.currentTimeMillis();
        if (!this.f19434aG) {
            m15899a(C11756a.class);
            m15899a(C7400q.class);
            m15899a(C7401r.class);
            m15899a(C7403t.class);
            m15899a(C7397n.class);
            m15899a(C4370c.class);
            m15899a(C4369b.class);
            m15899a(C8456i.class);
            m15899a(C7409y.class);
            m15899a(C7385d.class);
            C6779a.m14563a().mo13051a(this, C8452e.class, new C7867cp(this)).mo17949a(new C7868cq(this));
            this.f19434aG = true;
        }
        if (!EventBus.m156962a().mo145393a(this)) {
            EventBus.m156966a(EventBus.m156962a(), this);
        }
        Event event = new Event("liveplay_start_room_and_player", 1028, EnumC11866b.SdkInterfaceCall);
        event.mo19003a("start room and start player to bind surface.");
        C11870f.C11871a.f28404a.mo19010a().mo18994a(event);
        this.f19423V.mo28314b(C4441l.class, (AbstractC89172b) new C7869cr(this)).mo28314b(C4450t.class, (AbstractC89172b) new C7870cs(this)).mo28314b(C4346v.class, (AbstractC89172b) new C7871ct(this)).mo28314b(C9031ay.class, (AbstractC89172b) new C7872cu(this)).mo28314b(C9074cm.class, (AbstractC89172b) new C7845bu(this)).mo28314b(C9142x.class, (AbstractC89172b) new C7846bv(this)).mo28314b(C9104dp.class, (AbstractC89172b) new C7847bw(this)).mo28310a(C6886aw.class, (AbstractC89172b) new C7848bx(this)).mo28314b(C4403aq.class, (AbstractC89172b) new C7849by(this)).mo28314b(C4437h.class, (AbstractC89172b) new C7850bz(this)).mo28309a((AbstractC1204m) this, C9121ef.class, (AbstractC89172b) new C7852ca(this));
        this.f19468ao = true;
        if (this.f19510r != EnumC11662p.INITIALIZED) {
            C9294a.m17572a().f22727a = null;
            C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("live_play_fragment_state_error", 33813, EnumC11866b.BussinessApiCall).mo19003a("current state:" + this.f19510r.name()));
            C2695a.f8059g.f8063c = "end_live";
            C8422f.m16638a((Activity) getActivity(), false);
            C8422f.m16636a((Activity) getActivity(), (Boolean) false);
            mo14106a("state does not match, ", 201, (long) this.f19510r.ordinal());
            if (this.f19480bb) {
                mo14145s();
            }
        } else {
            this.f19455ab.f16722a = SystemClock.uptimeMillis();
            if (C6541c.f16337a > 0) {
                long currentTimeMillis = System.currentTimeMillis() - C6541c.f16337a;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("cold_start_cost_time", currentTimeMillis);
                } catch (JSONException unused) {
                }
                C3868c.m9497b("ttlive_cold_start_enter_room_all", 0, jSONObject);
                C6541c.f16337a = 0;
            }
            if (this.f19510r == EnumC11662p.LIVE_FINISHED) {
                if (this.f19413L == null) {
                    this.f19413L = (C7512b) getChildFragmentManager().mo3551a("LiveNewAudienceEndFragment");
                }
                if (this.f19413L == null) {
                    this.f19510r = EnumC11662p.INITIALIZED;
                }
            }
            C6684c.C6686b.m14211a().f16584b = false;
            if (this.f19413L != null) {
                if (!this.mStatusDestroyed) {
                    getChildFragmentManager().mo3552a().mo3455a(this.f19413L).mo3473c();
                }
                this.f19413L = null;
            }
            this.f19510r = EnumC11662p.PREPARING;
            String str2 = this.f19463aj.f28233c.f28288E;
            if (str2 != null) {
                this.f19459af = str2;
            }
            if (!C13627m.m24499a("inner_draw", this.f19463aj.f28233c.f28320aa)) {
                this.f19451aX = this.f19463aj.f28233c.f28325af.f28388a;
            }
            C2716a aVar = this.f19484bf;
            long j2 = this.f19451aX;
            long j3 = this.f19452aY;
            if (!TextUtils.isEmpty(this.f19499g) || !TextUtils.isEmpty(this.f19477ay)) {
                z = true;
            }
            EnterRoomConfig enterRoomConfig2 = this.f19463aj;
            if (enterRoomConfig2.f28233c.f28325af.f28389b == null) {
                longValue = System.currentTimeMillis();
            } else {
                longValue = enterRoomConfig2.f28233c.f28325af.f28389b.longValue();
            }
            if (TextUtils.equals(enterRoomConfig2.f28233c.f28320aa, "inner_draw")) {
                str = "draw";
            } else {
                str = "click";
            }
            String str3 = enterRoomConfig2.f28233c.f28293J;
            String str4 = enterRoomConfig2.f28233c.f28295L;
            if (aVar == null) {
                aVar = C2716a.m7846a(enterRoomConfig2.f28233c.f28301R);
                j = 0;
            } else {
                j = 0;
            }
            if (j2 == j) {
                j2 = System.currentTimeMillis();
            }
            aVar.f8118h = j2;
            if (z) {
                i = 1;
            } else {
                i = 3;
            }
            aVar.f8111a = i;
            aVar.f8112b = C2716a.m7847a(str);
            aVar.f8113c = C2716a.m7847a(str3);
            aVar.f8114d = C2716a.m7847a(str4);
            aVar.f8115e = C2716a.m7847a("");
            AbstractC5777j b = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11553b(enterRoomConfig2.f28233c.f28288E);
            if (b == null) {
                i2 = 1;
            } else if (b.mo12928l()) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            aVar.f8116f = i2;
            aVar.f8119i = longValue;
            aVar.f8120j = j3;
            if (this.f19480bb && this.f19514v != null) {
                m15886M();
                this.f19514v.tryToUploadFirstScreenTime();
                this.f19514v.tryToStartAudioDevice();
            }
            C6739l lVar = this.f19455ab;
            lVar.f16727f.clear();
            lVar.f16726e.clear();
            lVar.mo12950a("n_time_start_room");
            String str5 = this.f19463aj.f28233c.f28321ab;
            this.f19423V.mo28311a(C9065cd.class, str5);
            this.f19511s.f18512t = str5;
            this.f19511s.f18476B = this.f19423V;
            this.f19511s.mo13674b();
            this.f19511s.f18479E = this.f19463aj.f28233c.f28309Z;
            C7599q qVar = this.f19432aE;
            if (!qVar.f18844d) {
                qVar.f18844d = true;
                qVar.f18842b = SystemClock.elapsedRealtime();
                qVar.f18843c.sendEmptyMessageDelayed(100, C7599q.f18841a);
            }
            mo14126j();
            this.f19423V.mo28311a(C6778am.class, (Object) true);
            mo14090E().put("param_live_enter_room_start_time", new StringBuilder().append(this.f19451aX).toString());
            if (this.f19480bb) {
                ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11554c(this.f19459af);
            }
        }
        this.f19431aD.mo13661a(true);
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onResume() {
        boolean z;
        DataChannel dataChannel;
        MethodCollector.m26663i(5659);
        super.onResume();
        C10095g.m18639g();
        if (getUserVisibleHint()) {
            m15892S();
        }
        C7710a aVar = this.f19404C;
        if (!(aVar == null || aVar.f19173a == null)) {
            this.f19404C.f19173a.postDelayed(new RunnableC7844bt(this), 50);
        }
        C7445j jVar = this.f19511s;
        jVar.f18504l = false;
        if (jVar.f18510r != -1) {
            jVar.f18511s += SystemClock.elapsedRealtime() - jVar.f18510r;
            jVar.f18510r = -1;
            jVar.f18496d.post(jVar.f18495c);
            jVar.f18496d.post(new RunnableC7451o(jVar));
            jVar.f18496d.post(new RunnableC7452p(jVar));
            jVar.f18475A = SystemClock.elapsedRealtime();
            C7413a a = C7413a.m15292a();
            long c = jVar.mo13675c();
            a.f18387b = true;
            a.f18388c = SystemClock.elapsedRealtime();
            a.f18389d = c;
            a.mo13619c();
            C3854a.m9453a(4, "AudienceLivePlayTaskManager", "roomForegroundDuration duration: " + a.mo13618b());
        }
        C7599q qVar = this.f19432aE;
        if (qVar.f18844d && qVar.f18845e) {
            qVar.f18845e = false;
            qVar.f18842b = SystemClock.elapsedRealtime();
            qVar.f18843c.sendEmptyMessageDelayed(100, C7599q.f18841a);
        }
        AbstractC5777j b = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11553b(this.f19459af);
        if (b != null) {
            b.mo12921f(false);
        }
        if (this.f19458ae) {
            C3854a.m9453a(4, "LivePlayFragment.onResume", "restarting detached live room");
            mo14088C().mo12698a("");
        }
        AbstractC2717b bVar = this.f19514v;
        if (bVar != null) {
            if (!this.f19517y) {
                bVar.onForeground();
            }
            z = this.f19514v.tryResumePlay();
            if (!this.f19483be.isEmpty()) {
                for (C7399p pVar : this.f19483be) {
                    if (pVar.f18332a == 4) {
                        z = true;
                    }
                    mo14098a(pVar);
                }
                this.f19483be.clear();
            }
            if (!C6682a.m14195a()) {
                this.f19514v.changeSRSupportScene(true);
            }
        } else {
            z = false;
        }
        if (f19399a.booleanValue()) {
            C7572d.m15561a("LivePlayFragment", "onResume -> roomId=" + this.f19495c + ", userId=" + this.f19497e + ", resumePlay=" + z + ", mAutoStartWhenResume=" + this.f19516x);
        }
        if (this.f19516x) {
            this.f19516x = false;
            if (this.f19510r == EnumC11662p.PREPARED) {
                if (!TextUtils.isEmpty(this.f19477ay)) {
                    m15901a(this.f19477ay, this.f19478az, this.f19500h, this.f19428aA);
                } else {
                    m15900a(this.f19499g, this.f19500h, this.f19428aA, this.f19476ax);
                }
                if (this.f19480bb) {
                    ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11554c(this.f19459af);
                }
            }
        }
        if (this.f19489bk) {
            mo14099a(EnumC7841a.WATCHER_KIT_OUT);
        }
        this.f19473au = false;
        if (!(b == null || (dataChannel = this.f19423V) == null || !((Boolean) dataChannel.mo28318b(C9074cm.class)).booleanValue())) {
            if (!TextUtils.equals(b.mo11533b(), this.f19459af) && this.f19514v != null) {
                if (this.f19404C.f19173a.getParent() == null) {
                    this.f19407F.addView(this.f19404C.f19173a, 0);
                    this.f19404C.mo13985a(0);
                }
                C7710a aVar2 = this.f19404C;
                if (aVar2 != null && aVar2.f19173a.getVisibility() == 8) {
                    this.f19404C.mo13985a(0);
                }
                AbstractC2717b ensureRoomPlayer = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).ensureRoomPlayer(this.f19495c, this.f19477ay, this.f19478az, this.f19500h, this.f19428aA, this.f19404C.mo13984a(), this.f19493bo, getContext(), this.f19459af);
                this.f19514v = ensureRoomPlayer;
                ensureRoomPlayer.pipResumePlay();
            }
            this.f19423V.mo28315b(C9074cm.class, (Object) false);
            C6695f fVar = this.f19474av;
            if (fVar != null) {
                fVar.mo12849a();
            }
        }
        if (C8779e.f21647a) {
            C11226ao.m19883a(C3966y.m9669e(), C3966y.m9657a((int) R.string.du2), 0);
            C8779e.f21647a = false;
        }
        MethodCollector.m26664o(5659);
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: a */
    public final void mo14101a(AbstractC11652i.AbstractC11653a aVar) {
        this.f19446aS = aVar;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: c */
    public final void mo14118c(int i) {
        this.f19488bj = i;
    }

    /* renamed from: b */
    private C7435f.AbstractC7436a m15903b(final long j) {
        return new C7435f.AbstractC7436a() {
            /* class com.bytedance.android.livesdk.chatroom.p499ui.C7822br.C783217 */

            static {
                Covode.recordClassIndex(8627);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:71:0x02b4, code lost:
                if (r2.contains(java.lang.Long.valueOf(r1.f28239a)) == false) goto L_0x02b6;
             */
            @Override // com.bytedance.android.livesdk.chatroom.detail.C7435f.AbstractC7436a
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo13658a(com.bytedance.android.livesdk.chatroom.model.C7685e r28) {
                /*
                // Method dump skipped, instructions count: 1434
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p499ui.C7822br.C783217.mo13658a(com.bytedance.android.livesdk.chatroom.model.e):void");
            }

            @Override // com.bytedance.android.livesdk.chatroom.detail.C7435f.AbstractC7436a
            /* renamed from: a */
            public final void mo13657a(int i, String str, String str2) {
                int i2;
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                boolean z6;
                C7572d.m15561a("LivePlayFragment", "room/enter fail -> origin room_id = " + j);
                if (i == 4003043) {
                    AbstractC0952i childFragmentManager = C7822br.this.getChildFragmentManager();
                    long j = j;
                    C89219l.m154721d(childFragmentManager, "");
                    C9920b bVar = new C9920b();
                    Bundle bundle = new Bundle();
                    bundle.putLong("roomId", j);
                    bVar.setArguments(bundle);
                    bVar.show(childFragmentManager, "PaidRoomCheckDialog.class");
                    return;
                }
                boolean z7 = false;
                if (i == 4003072) {
                    AbstractC0952i childFragmentManager2 = C7822br.this.getChildFragmentManager();
                    EnterRoomConfig enterRoomConfig = C7822br.this.f19463aj;
                    DataChannel dataChannel = C7822br.this.f19423V;
                    C89219l.m154721d(childFragmentManager2, "");
                    C89219l.m154721d(enterRoomConfig, "");
                    C89219l.m154721d(dataChannel, "");
                    C29844g gVar = new C29844g(LivePaidEventSchema.INSTANCE.getValue());
                    gVar.mo52129a("room_id", enterRoomConfig.f28233c.f28301R);
                    gVar.mo52130a("request_id", enterRoomConfig.f28232b.f28257a);
                    gVar.mo52130a("author_id", enterRoomConfig.f28232b.f28258b);
                    Uri parse = Uri.parse(gVar.mo52126a());
                    if (C7591m.m15605a(parse, "disable_mask_click_close", 0) == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    AbstractC2939m e = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).createLynxDialogBuilder(parse.getQueryParameter("url"), C7591m.m15606a(parse, "fallback_url", "")).mo7682a(C7591m.m15605a(parse, "radius", 8), C7591m.m15605a(parse, "radius", 8)).mo7687b(C7591m.m15605a(parse, "height", 400)).mo7681a(C7591m.m15605a(parse, "width", (int) C3966y.m9668e(C3966y.m9664c()))).mo7690c(C7591m.m15605a(parse, "margin", 0)).mo7696e(80);
                    if (C7591m.m15605a(parse, "show_close", 0) == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    AbstractC2939m d = e.mo7695d(z2);
                    String uri = parse.toString();
                    if (uri == null) {
                        uri = "";
                    }
                    C89219l.m154716b(uri, "");
                    AbstractC2939m f = d.mo7691c(uri).mo7684a(C7591m.m15606a(parse, "from_label", "")).mo7700f(C7591m.m15606a(parse, "title", ""));
                    if (C89361p.m154872a("true", C7591m.m15606a(parse, "show_title_bar", ""), true) || C89219l.m154714a((Object) "1", (Object) C7591m.m15606a(parse, "show_title_bar", ""))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    AbstractC2939m e2 = f.mo7698e(z3);
                    if (C89361p.m154872a("true", C7591m.m15606a(parse, "show_title_share", ""), true) || C89219l.m154714a((Object) "1", (Object) C7591m.m15606a(parse, "show_title_share", ""))) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    AbstractC2939m g = e2.mo7702g(z4);
                    if (C89361p.m154872a("true", C7591m.m15606a(parse, "show_title_close", ""), true) || C89219l.m154714a((Object) "1", (Object) C7591m.m15606a(parse, "show_title_close", ""))) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    AbstractC2939m e3 = g.mo7701f(z5).mo7692c(z).mo7688b(C7591m.m15606a(parse, "web_bg_color", "")).mo7694d(C7591m.m15606a(parse, "popup_enter_type", "")).mo7697e(C7591m.m15606a(parse, "mask_alpha", "0"));
                    if (C7591m.m15605a(parse, "landscape_custom_height", 0) == 1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    AbstractC2939m a = e3.mo7685a(z6);
                    int a2 = C7591m.m15605a(parse, "show_dim", -1);
                    if (a2 != -1) {
                        if (a2 == 1) {
                            z7 = true;
                        }
                        a = a.mo7689b(z7);
                    }
                    C4031a a3 = a.mo7686a();
                    a3.f11065d = new C7591m.DialogInterface$OnDismissListenerC7592a(dataChannel);
                    a3.show(childFragmentManager2, "paidEventDialog");
                    return;
                }
                C7822br.this.f19461ah = true;
                C7822br.this.f19455ab.f16724c = 1;
                C7822br.this.mo14142p();
                C7822br.this.mo14114b("fetch_room_error");
                C7822br.this.mo14131o();
                C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("live_play_enter_room_fail", 1031, EnumC11866b.ServerApiCall).mo19003a("room enter api fail callback."));
                if ((TextUtils.isEmpty(str) || !str.contains("30003")) && i != 30003) {
                    C6501b.C6502a.m13948a("rd_enter_room_failed").mo12643a(C7822br.this.f19423V).mo12655b();
                    if (i != 0) {
                        i2 = i;
                    } else {
                        i2 = 103;
                    }
                    C7822br.this.f19455ab.mo12948a(i2, str, j, C7822br.this.f19415N, C7822br.this.f19499g);
                    C7822br.this.mo14106a("enter room request failure, errMsg = " + str + " ,frame_fail", 205, (long) i2);
                    if (TextUtils.isEmpty(str2) || i == 0) {
                        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gn8);
                        C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("live_play_enter_room_fail", 33811, EnumC11866b.ServerApiCall).mo19003a("enter room api return fail.error_code =0"));
                        C7822br.this.mo14099a(EnumC7841a.ENTER_FAILED);
                    } else if ((TextUtils.isEmpty(str) || !str.contains("30005")) && i != 30005) {
                        C11226ao.m19883a(C3966y.m9669e(), str2, 0);
                        C7822br.this.f19457ad = false;
                        Event event = new Event("live_play_enter_room_fail", 33808, EnumC11866b.ServerApiCall);
                        event.mo19003a("enter room api return fail. error_code: " + i + ", error_prompt: " + str2);
                        C11870f.C11871a.f28404a.mo19010a().mo18994a(event);
                        C7822br.this.mo14099a(EnumC7841a.ENTER_FAILED);
                    } else if (C7822br.this.f19412K == null || !C7822br.this.f19412K.isShowing()) {
                        C7445j jVar = C7822br.this.f19511s;
                        HashMap hashMap = new HashMap();
                        hashMap.put("event_belong", "live");
                        hashMap.put("event_type", "show");
                        hashMap.put("event_page", "live_detail");
                        hashMap.put("event_module", "popup");
                        hashMap.put("live_type", jVar.f18516x);
                        hashMap.put("request_id", jVar.f18497e);
                        hashMap.put("log_pb", jVar.f18498f);
                        C6501b.C6502a.m13948a("crash_popup_show").mo12652a((Map<String, String>) hashMap).mo12655b();
                        C7822br brVar = C7822br.this;
                        DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(C7822br.this.getContext());
                        aVar.f22256m = false;
                        brVar.f19412K = aVar.mo15248b(R.string.gpi).mo15244a(R.string.gph, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC7874cw(this), false).mo15249b(R.string.gw0, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC7875cx(this, i, str2), false).mo15247a();
                        C7822br.this.f19412K.show();
                    }
                } else {
                    C6501b.C6502a.m13948a("rd_enter_room_live_end").mo12643a(C7822br.this.f19423V).mo12655b();
                    C7822br.this.mo14106a("room finish, live_end", 201, (long) i);
                    C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("live_play_enter_room_fail", 1032, EnumC11866b.BussinessApiCall).mo19003a("room enter show end fragment"));
                    C7822br.this.mo14147u();
                    C7822br.this.mo14107a(true);
                    C7822br.this.f19510r = EnumC11662p.LIVE_FINISHED;
                }
            }
        };
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: a */
    public final void mo14102a(AbstractC11652i.AbstractC11654b bVar) {
        this.f19472at = bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("enter_room_config", this.f19463aj);
    }

    /* renamed from: d */
    private void m15906d(int i) {
        View findViewById;
        View view = this.f19456ac;
        if (view != null && (findViewById = view.findViewById(R.id.fc1)) != null && findViewById.getVisibility() != i) {
            findViewById.setVisibility(i);
        }
    }

    public void onEvent(C7409y yVar) {
        if (yVar == null || !yVar.f18361a) {
            mo14087B();
            return;
        }
        C7435f fVar = this.f19513u;
        if (fVar != null) {
            fVar.mo13655a();
        }
    }

    /* renamed from: a */
    private <T> void m15899a(Class<T> cls) {
        this.f19490bl.mo142945a(C6779a.m14563a().mo13052a((Class) cls).mo143254a(new AbstractC88433f<T>() {
            /* class com.bytedance.android.livesdk.chatroom.p499ui.C7822br.C782712 */

            static {
                Covode.recordClassIndex(8622);
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final void accept(T t) {
                if (t instanceof C11756a) {
                    C7822br.this.onEvent((C11756a) t);
                } else if (t instanceof C7400q) {
                    C7822br.this.onEvent((C7400q) t);
                } else if (t instanceof C7401r) {
                    C7822br.this.onEvent((C7401r) t);
                } else if (t instanceof C8452e) {
                    C7822br.this.onEvent((C8452e) t);
                } else if (t instanceof C7403t) {
                    C7822br.this.onEvent((C7403t) t);
                } else if (t instanceof C7397n) {
                    C7822br.this.onEvent((C7397n) t);
                } else if (t instanceof C4370c) {
                    C7822br.this.onEvent((C4370c) t);
                } else if (t instanceof C4369b) {
                    C7822br.this.mo14099a(EnumC7841a.MIC_ROOM_END);
                } else if (t instanceof C8456i) {
                    C7822br.this.onEvent((C8456i) t);
                } else if (t instanceof C7409y) {
                    C7822br.this.onEvent((C7409y) t);
                } else if (t instanceof C7385d) {
                    C7822br.this.onEvent((C7385d) t);
                }
            }
        }, new AbstractC88433f<Throwable>() {
            /* class com.bytedance.android.livesdk.chatroom.p499ui.C7822br.C782813 */

            static {
                Covode.recordClassIndex(8623);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Throwable th) {
            }
        }));
    }

    /* renamed from: c */
    private void m15904c(Room room) {
        int i;
        if (room != null && room.warningTag != null && room.warningTag.text != null) {
            if (room.warningTag.tagSource == 1) {
                i = 4;
            } else {
                i = 3;
            }
            WarningTag warningTag = room.warningTag;
            ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).insertBottomMessage(this.f19495c, "", warningTag.text, warningTag.duration.longValue(), 1, 0, i);
        }
    }

    /* renamed from: e */
    private boolean m15910e(int i) {
        C6696g gVar;
        DataChannel dataChannel = this.f19423V;
        if (dataChannel == null || !((Boolean) dataChannel.mo28318b(C9074cm.class)).booleanValue() || (gVar = this.f19475aw) == null) {
            return false;
        }
        if (i == 1) {
            gVar.mo12850a(i, new C7864cm(this));
            return false;
        }
        if (i == 2 || i == 3) {
            gVar.mo12850a(i, new C7865cn(this));
        }
        return true;
    }

    @AbstractC90264r
    public void liveUserKickOut(C11773l lVar) {
        Room room;
        if (lVar != null && (room = this.f19496d) != null && room.getOwner() != null && C13627m.m24499a(lVar.f28129b, String.valueOf(this.f19496d.getOwner().getId()))) {
            this.f19489bk = lVar.f28128a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        try {
            if (this.f19506n != getActivity().getRequestedOrientation()) {
                getActivity().setRequestedOrientation(this.f19506n);
            }
        } catch (Exception unused) {
            C3854a.m9453a(4, "ttlive_room", "setRequestedOrientation wrong");
        }
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        Fragment a = childFragmentManager.mo3551a("AbsInteractionFragment");
        if (a != null) {
            childFragmentManager.mo3552a().mo3455a(a).mo3473c();
        }
    }

    public void onEvent(C7385d dVar) {
        ActivityC0945e activity = getActivity();
        Boolean valueOf = Boolean.valueOf(dVar.f18307a);
        if (activity != null && (activity instanceof AbstractC10135q)) {
            AbstractC10135q qVar = (AbstractC10135q) activity;
            if (qVar.mo16975a() != null && !activity.isFinishing()) {
                qVar.mo16975a().mo14740b(valueOf.booleanValue());
            }
        }
    }

    /* renamed from: d */
    private void m15907d(Room room) {
        View view = this.f19419R;
        if (view != null) {
            view.setVisibility(8);
            if (mo14116b(room)) {
                C4087e.C4091c.f11305a.mo9544a(false);
                LiveMaskLayerWidget liveMaskLayerWidget = new LiveMaskLayerWidget();
                this.f19425X = liveMaskLayerWidget;
                liveMaskLayerWidget.mo18176a(room);
                this.f19425X.f27214c = this.f19514v;
                this.f19425X.mo18175a();
                this.f19425X.f27212a = this.f19446aS;
                RecyclableWidgetManager.m33062of((Fragment) this, this.f19456ac, false, (IWidgetProvider) LiveWidgetProvider.getInstance(), (FluencyOpt) C6203g.f15476a).load(R.id.cip, this.f19425X);
                this.f19419R.setVisibility(0);
                C6501b.C6502a.m13948a("livesdk_mask_layer_show").mo12661f("show").mo12643a(this.f19423V).mo12655b();
            }
        }
    }

    /* renamed from: e */
    private void m15909e(boolean z) {
        AbstractC7703a atVar;
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        if (this.f19506n == 1) {
            atVar = new C7891dd();
        } else {
            atVar = new C7770at();
        }
        this.f19411J = atVar;
        atVar.mo13944a(this.f19463aj, z);
        this.f19411J.mo13945a(this.f19423V, this.f19500h, new AbstractC5788t() {
            /* class com.bytedance.android.livesdk.chatroom.p499ui.C7822br.C78343 */

            static {
                Covode.recordClassIndex(8629);
            }

            @Override // com.bytedance.android.live.p379n.AbstractC5788t
            /* renamed from: a */
            public final void mo11563a(int i) {
                if (C7822br.this.f19510r == EnumC11662p.LIVE_STARTED) {
                    if (i == 3) {
                        C7822br.this.f19515w = true;
                    } else if (i == 2) {
                        C7822br.this.f19515w = false;
                    }
                }
            }

            @Override // com.bytedance.android.live.p379n.AbstractC5788t
            /* renamed from: a */
            public final void mo8524a(C9688bt btVar) {
                if (btVar != null && C7822br.this.f19510r == EnumC11662p.LIVE_STARTED) {
                    C7822br.this.mo14100a(btVar);
                }
            }
        });
        this.f19411J.f19163z = this.f19511s;
        AbstractC7703a aVar = this.f19411J;
        if (aVar instanceof C7891dd) {
            ((C7891dd) aVar).f19630J = this.f19481bc;
        }
        childFragmentManager.mo3552a().mo3454a(R.id.b82, this.f19411J, "AbsInteractionFragment").mo3473c();
        this.f19411J.getLifecycle().mo4012a(new LivePlayFragment$12(this));
        this.f19467an = new C11418d(this.f19411J, this.f19426Y);
    }

    /* renamed from: f */
    private void m15911f(boolean z) {
        C7710a aVar;
        if (z) {
            AbstractC2717b bVar = this.f19514v;
            if (bVar != null) {
                bVar.tryResumePlay();
                C11208ab.m19865a(this);
                return;
            }
            return;
        }
        AbstractC2717b bVar2 = this.f19514v;
        if (bVar2 != null) {
            bVar2.setMute(true);
            if (!this.f19487bi || (aVar = this.f19404C) == null || aVar.f19173a.getContext() == null) {
                this.f19514v.stopWhenPlayingOther(getContext());
            } else {
                this.f19514v.stopWhenPlayingOther(this.f19404C.f19173a.getContext());
            }
        }
        this.f19426Y.post(new Runnable() {
            /* class com.bytedance.android.livesdk.chatroom.p499ui.C7822br.RunnableC78354 */

            static {
                Covode.recordClassIndex(8630);
            }

            public final void run() {
                C6779a.m14563a().mo13053a(new C7400q(34));
            }
        });
    }

    /* renamed from: g */
    private void m15912g(boolean z) {
        Object obj;
        DataChannel dataChannel = this.f19423V;
        if (dataChannel != null) {
            obj = dataChannel.mo28318b(C10341e.class);
        } else {
            obj = null;
        }
        int i = 0;
        if (obj instanceof Integer) {
            i = ((Integer) obj).intValue();
        }
        RoomStatus roomStatus = new RoomStatus();
        roomStatus.f8705c = z;
        roomStatus.f8706d = i;
        roomStatus.f8704b = this.f19497e;
        roomStatus.f8703a = this.f19495c;
        if (getActivity() != null) {
            Intent intent = getActivity().getIntent();
            if (intent != null) {
                intent.putExtra("host_room_status_event", roomStatus);
            }
            AbstractC11652i.AbstractC11654b bVar = this.f19472at;
            if (bVar != null) {
                bVar.mo12696a(roomStatus);
            }
        }
    }

    public void onEvent(C4370c cVar) {
        if (cVar.f11888a > 0 && this.f19463aj != null) {
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            enterRoomConfig.f28233c.f28301R = cVar.f11888a;
            enterRoomConfig.f28233c.f28293J = this.f19463aj.f28233c.f28293J;
            enterRoomConfig.f28233c.f28295L = this.f19463aj.f28233c.f28295L;
            enterRoomConfig.f28233c.f28330ak = cVar.f11889b;
            EnterRoomLinkSession.m20943a(enterRoomConfig).mo18994a(new Event("mic_room_jump_event", 1033, EnumC11866b.MessageReceived).mo19003a("roomid:" + cVar.f11888a + " autojump:" + cVar.f11889b));
            onEvent(new C8452e(cVar.f11888a, enterRoomConfig, "jump_source_mic_room"));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        boolean z2;
        if (z != getUserVisibleHint()) {
            z2 = true;
        } else {
            z2 = false;
        }
        super.setUserVisibleHint(z);
        C7512b bVar = this.f19413L;
        if (bVar != null) {
            bVar.setUserVisibleHint(z);
        }
        View$OnClickListenerC7532a aVar = this.f19439aL;
        if (aVar != null) {
            aVar.setUserVisibleHint(z);
        }
        if (isResumed() && z2 && getUserVisibleHint()) {
            m15892S();
        }
        DataChannel dataChannel = this.f19423V;
        if (dataChannel != null) {
            dataChannel.mo28315b(C9057bw.class, Boolean.valueOf(z));
        } else {
            this.f19491bm = z;
        }
        if (isViewValid() && z && this.f19510r != EnumC11662p.LIVE_FINISHED) {
            C8422f.m16636a(getActivity(), Boolean.valueOf(mo14091F()));
        }
    }

    /* renamed from: c */
    private void m15905c(String str) {
        HSImageView hSImageView;
        String str2;
        if (!this.f19444aQ || this.f19462ai || TextUtils.equals(this.f19463aj.f28233c.f28320aa, "inner_draw")) {
            hSImageView = this.f19435aH;
        } else {
            hSImageView = this.f19406E;
        }
        AbstractC5777j b = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11553b(this.f19459af);
        if (!this.f19487bi || b == null || !b.mo11546f()) {
            if (!(hSImageView == null || hSImageView.getVisibility() == 0)) {
                hSImageView.setVisibility(0);
            }
            AbstractC11615c cVar = this.f19485bg;
            if (cVar != null) {
                cVar.mo18410d();
            }
            StringBuilder sb = new StringBuilder("show ");
            if (!this.f19444aQ) {
                str2 = "Background";
            } else {
                str2 = "below Background";
            }
            C7572d.m15561a("LivePlayFragment", sb.append(str2).append(", reason: ").append(str).append(this.f19495c).toString());
            mo14108a(true, str);
            this.f19423V.mo28320c(C11326e.class, this.f19435aH);
            return;
        }
        this.f19435aH.setVisibility(8);
        if (!this.f19466am) {
            this.f19406E.setVisibility(8);
        }
    }

    /* renamed from: d */
    private void m15908d(boolean z) {
        if (this.f19510r == EnumC11662p.PREPARING || this.f19510r == EnumC11662p.PREPARED) {
            C7466y yVar = this.f19430aC;
            if (yVar != null) {
                yVar.mo13651b();
                this.f19430aC = null;
                C7572d.m15561a("LivePlayFragment", "resetFetchUserRoom -> roomId=" + this.f19495c + ", userId=" + this.f19497e);
            }
            m15883J();
            mo14115b(z);
            this.f19511s.mo13669a();
            this.f19510r = EnumC11662p.INITIALIZED;
            this.f19415N = "other";
            C7572d.m15561a("LivePlayFragment", "resetPrepare -> roomId=" + this.f19495c + ", userId=" + this.f19497e);
        }
    }

    /* renamed from: b */
    public final void mo14112b(int i) {
        AbstractC11652i.AbstractC11654b bVar;
        Event event = new Event("live_play_end_room_user_close", 33799, EnumC11866b.BussinessApiCall);
        event.mo19003a("user close");
        C11870f.C11871a.f28404a.mo19010a().mo18994a(event);
        C7572d.m15561a("LivePlayFragment", "user close");
        if (this.f19510r != EnumC11662p.LIVE_STARTED || this.f19517y) {
            if (this.f19511s != null && this.f19510r == EnumC11662p.LIVE_STARTED) {
                this.f19511s.mo13671a(this.f19496d);
            }
            if (!C7349a.m15253c() || i != 8 || (bVar = this.f19472at) == null || !bVar.mo12709j()) {
                mo14099a(EnumC7841a.USER_CLOSE);
                return;
            }
            return;
        }
        AbstractC11652i.AbstractC11654b bVar2 = this.f19472at;
        if (bVar2 != null) {
            bVar2.mo12708i();
        }
        RunnableC7861cj cjVar = new RunnableC7861cj(this, i);
        if (!this.f19411J.mo13949a(cjVar)) {
            cjVar.run();
        }
    }

    public void onEvent(C7397n nVar) {
        ViewGroup viewGroup = this.f19405D;
        if (viewGroup != null && (viewGroup.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            int d = C3966y.m9667d(R.dimen.wo);
            if (nVar.f18327b) {
                ValueAnimator valueAnimator = this.f19453aZ;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i = ((ViewGroup.MarginLayoutParams) this.f19407F.getLayoutParams()).rightMargin;
                if (!nVar.f18326a) {
                    d = 0;
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(i, d);
                Math.abs(i - d);
                ValueAnimator duration = ofInt.setDuration(200L);
                this.f19453aZ = duration;
                duration.addUpdateListener(new C7856ce(this));
                this.f19453aZ.start();
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f19407F.getLayoutParams();
            if (!nVar.f18326a) {
                d = 0;
            }
            marginLayoutParams.rightMargin = d;
            this.f19407F.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPictureInPictureModeChanged(boolean z) {
        super.onPictureInPictureModeChanged(z);
        if (getUserVisibleHint()) {
            if (z) {
                if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getUserRole(C11115u.m19743a().mo17915b().mo13161c()) == EnumC4408av.GUEST_AUDIENCE) {
                    m15895V();
                }
                AbstractC2717b bVar = this.f19514v;
                if (bVar != null) {
                    bVar.changeSRSupportScene(false);
                }
                this.f19423V.mo28320c(C9073cl.class, new C89378p(true, Integer.valueOf(this.f19404C.f19173a.getWidth())));
                return;
            }
            C13628n.m24510a(this.f19456ac.findViewById(R.id.b82), 0);
            ActivityC0945e activity = getActivity();
            if (Build.VERSION.SDK_INT >= 24 && activity != null && activity.isInPictureInPictureMode()) {
                return;
            }
            if (this.f19473au) {
                C6501b.C6502a.m13948a("livesdk_mini_window_close").mo12655b();
                if (Build.VERSION.SDK_INT >= 21) {
                    activity.finishAndRemoveTask();
                    return;
                }
                return;
            }
            C6501b.C6502a.m13948a("livesdk_mini_window_return_full").mo12655b();
            this.f19426Y.postDelayed(new Runnable() {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.C7822br.RunnableC78398 */

                static {
                    Covode.recordClassIndex(8634);
                }

                public final void run() {
                    int i;
                    MethodCollector.m26663i(5407);
                    if (C7822br.this.f19475aw == null || !((i = C7822br.this.f19475aw.f16615h) == 2 || i == 3)) {
                        int[] iArr = new int[2];
                        if (C7822br.this.f19514v != null) {
                            C7822br.this.f19514v.getVideoSize(iArr);
                        }
                        C3854a.m9453a(4, "picture_in_picture", "{" + iArr[0] + "," + iArr[1] + "}");
                        if (!(iArr[0] == 0 || iArr[1] == 0)) {
                            C7822br brVar = C7822br.this;
                            brVar.mo14094a(iArr[0], iArr[1], C13628n.m24504a(brVar.getContext()));
                        }
                        C13628n.m24510a(C7822br.this.f19456ac.findViewById(R.id.b82), 0);
                        if (C7822br.this.f19475aw != null) {
                            View view = C7822br.this.f19475aw.f16609b;
                            if (view != null) {
                                ViewParent parent = view.getParent();
                                if (parent instanceof ViewGroup) {
                                    ((ViewGroup) parent).removeView(view);
                                }
                                if ((view instanceof TextureRenderView) || (view instanceof SurfaceRenderView) || (view instanceof TextureViewWrapper)) {
                                    if (C7822br.this.f19407F instanceof ViewGroup) {
                                        C7822br.this.f19407F.addView(view, 0);
                                    }
                                } else if (view instanceof SurfaceView) {
                                    C6696g gVar = C7822br.this.f19475aw;
                                    AbstractC6872f b = C11115u.m19743a().mo17915b();
                                    C89219l.m154716b(b, "");
                                    if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getUserRole(b.mo13161c()) == EnumC4408av.GUEST_AUDIENCE && gVar.f16609b != null && (gVar.f16610c instanceof ViewGroup)) {
                                        ViewGroup viewGroup = gVar.f16610c;
                                        if (viewGroup != null) {
                                            viewGroup.addView(gVar.f16609b);
                                        }
                                        gVar.mo9929d();
                                    }
                                    gVar.f16610c = null;
                                    gVar.f16609b = null;
                                }
                            }
                            C7822br.this.f19475aw.dismiss();
                            C7822br.this.f19475aw = null;
                        }
                        if (C7822br.this.f19514v != null) {
                            C7822br.this.f19514v.changeSRSupportScene(true);
                        }
                        C7822br.this.f19423V.mo28320c(C9073cl.class, new C89378p(false, Integer.valueOf(C7822br.this.f19404C.f19173a.getWidth())));
                        MethodCollector.m26664o(5407);
                        return;
                    }
                    if (C7822br.this.mo14088C().mo12703d() != null) {
                        C7822br.this.mo14088C().mo12703d().mo15450a();
                    }
                    MethodCollector.m26664o(5407);
                }
            }, 200);
            this.f19465al = null;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i
    /* renamed from: c */
    public final void mo14119c(boolean z) {
        if (!TextUtils.isEmpty(this.f19477ay) || !TextUtils.isEmpty(this.f19499g)) {
            if (!TextUtils.isEmpty(this.f19477ay)) {
                m15901a(this.f19477ay, this.f19478az, this.f19500h, this.f19428aA);
            } else if (!TextUtils.isEmpty(this.f19499g)) {
                m15900a(this.f19499g, this.f19500h, this.f19428aA, this.f19476ax);
            }
            this.f19463aj.f28233c.f28288E = this.f19459af;
            if (z) {
                ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11554c(this.f19459af);
                return;
            }
            AbstractC5777j b = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11553b(this.f19459af);
            if (b != null) {
                b.mo11531a(true, this.f19459af);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        boolean z;
        boolean z2;
        boolean z3;
        super.onConfigurationChanged(configuration);
        boolean z4 = false;
        this.f19403B = false;
        DataChannel dataChannel = this.f19423V;
        if (dataChannel == null || !((Boolean) dataChannel.mo28318b(C9074cm.class)).booleanValue()) {
            int requestedOrientation = getActivity().getRequestedOrientation();
            if ((requestedOrientation == 0 || requestedOrientation == 1) && requestedOrientation != this.f19506n) {
                z = true;
                if (this.f19433aF) {
                    this.f19506n = requestedOrientation;
                }
            } else {
                z = false;
            }
            if (this.f19506n == 1 && !this.f19492bn.isEmpty()) {
                String str = this.f19492bn;
                if (this.f19496d.getOwner().isSubscribed()) {
                    ((AbstractC5834a) C6193a.m13435a(AbstractC5834a.class)).openUserSubscribeState(getContext(), this.f19496d, str);
                } else {
                    ((AbstractC5834a) C6193a.m13435a(AbstractC5834a.class)).openUserSubscribeEntry(getContext(), this.f19496d, str);
                }
                this.f19492bn = "";
            }
            C3966y.f10868a = requestedOrientation;
            int[] iArr = new int[2];
            AbstractC2717b bVar = this.f19514v;
            if (bVar != null) {
                if (requestedOrientation == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                bVar.setScreenOrientation(z3);
                this.f19514v.getVideoSize(iArr);
            }
            if (iArr[0] > 0 && iArr[1] > 0) {
                mo14094a(iArr[0], iArr[1], (int) C13628n.m24520b(getContext(), (float) configuration.screenWidthDp));
            }
            if (this.f19433aF) {
                this.f19423V.mo28315b(C5766ab.class, new C7380am(this.f19505m, this.f19508p));
                if (z) {
                    this.f19433aF = false;
                    C7435f fVar = this.f19513u;
                    if (!(fVar == null || fVar.f18441f == null || this.f19513u.f18441f.f19034a == null)) {
                        mo14113b(this.f19513u.f18441f.f19034a, true);
                    }
                    C7442h hVar = this.f19431aD;
                    hVar.f18463c = this.f19506n;
                    hVar.mo13660a();
                    if (AbstractC10336c.C10337a.f24991a) {
                        IMessageManager iMessageManager = ((IMessageService) C6193a.m13435a(IMessageService.class)).get();
                        if (requestedOrientation == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        iMessageManager.insertMessage(new C9622au(z2), true);
                    }
                }
                if (this.f19482bd != null) {
                    getContext();
                    this.f19482bd = null;
                }
                ViewGroup viewGroup = this.f19405D;
                if (viewGroup != null) {
                    if (requestedOrientation == 1) {
                        viewGroup.setBackgroundColor(Color.parseColor("#3E3F49"));
                        m15888O();
                    } else {
                        viewGroup.setBackgroundColor(-16777216);
                        HSImageView hSImageView = this.f19406E;
                        if (hSImageView != null) {
                            hSImageView.setVisibility(8);
                        }
                    }
                }
                C7421d a = C7421d.m15306a();
                if (requestedOrientation == 0) {
                    z4 = true;
                }
                if (a.f18405a) {
                    a.f18413i = z4;
                    if (!z4) {
                        a.mo13624d();
                    }
                }
                this.f19405D.postDelayed(new RunnableC7860ci(this, iArr), 50);
                super.onConfigurationChanged(configuration);
            }
        }
    }

    public void onEvent(C7401r rVar) {
        int d;
        int i;
        AbstractC11652i.AbstractC11654b bVar = this.f19472at;
        if (bVar != null) {
            bVar.mo12699a(rVar.f18339b);
        }
        if (getContext() != null && this.f19423V != null) {
            boolean z = true;
            if (this.f19506n != 1) {
                z = false;
            }
            Context context = getContext();
            if (!z && C7298b.m15199a(this.f19423V)) {
                if (rVar.f18339b) {
                    C89378p pVar = (C89378p) this.f19423V.mo28318b(C6911bk.class);
                    if (pVar == null || ((Integer) pVar.getFirst()).intValue() <= 0 || ((Integer) pVar.getSecond()).intValue() <= 0) {
                        d = C3966y.m9667d(R.dimen.wm);
                    } else {
                        d = C3966y.m9664c() - ((C3966y.m9662b() - (rVar.f18338a + C3966y.m9667d(R.dimen.wp))) * (((Integer) pVar.getFirst()).intValue() / ((Integer) pVar.getSecond()).intValue()));
                        if (C3931d.m9571a(context)) {
                            d -= C3966y.m9666d();
                        }
                    }
                    i = rVar.f18338a + C3966y.m9667d(R.dimen.wp);
                } else {
                    d = C3966y.m9667d(R.dimen.wo);
                    i = 0;
                }
                C13628n.m24512a(this.f19407F, -3, d, i);
            }
        }
    }

    /* renamed from: b */
    public final void mo14114b(String str) {
        if (TextUtils.equals(C6544e.m13990d(), "push")) {
            getParentFragment();
            C6501b.C6502a.m13948a("livesdk_push_error").mo12652a(new AbstractC6556j.C6557a().mo12691a("anchor_id", String.valueOf(this.f19497e)).mo12691a("anchor_status", str).mo12691a("room_id", String.valueOf(this.f19495c)).f16374a).mo12655b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (isResumed() != false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onEvent(com.bytedance.android.livesdk.chatroom.p488c.C7400q r12) {
        /*
        // Method dump skipped, instructions count: 558
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p499ui.C7822br.onEvent(com.bytedance.android.livesdk.chatroom.c.q):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo14092a(Context context) {
        if (context != null) {
            return getContext().getPackageName();
        }
        if (((IHostContext) C6193a.m13435a(IHostContext.class)).context() != null) {
            return ((IHostContext) C6193a.m13435a(IHostContext.class)).context().getPackageName();
        }
        return "";
    }

    /* renamed from: b */
    public final void mo14115b(boolean z) {
        AbstractC2717b bVar = this.f19514v;
        if (bVar != null) {
            if (bVar.getDecodeStatus() == 2) {
                mo14096a(104, this.f19514v.getMediaErrorMessage(), this.f19495c);
            } else if (this.f19514v.getDecodeStatus() != 1) {
                this.f19455ab.mo12949a(this.f19495c);
                mo14096a(113, "room cancel", this.f19495c);
            }
            this.f19514v.stop(z);
            if (this.f19487bi) {
                C7572d.m15561a("LivePlayFragment", "reset player -> clear share player streamData.");
                EnterRoomConfig enterRoomConfig = this.f19463aj;
                if (enterRoomConfig != null) {
                    enterRoomConfig.f28231a.f28378e = "";
                }
            }
            if (!this.f19480bb) {
                this.f19514v.recycle();
            }
            C7572d.m15561a("PreCreateSurface", "reset player, clear 1px");
            AbstractC5777j b = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11553b(this.f19459af);
            if (b != null) {
                b.mo12932p();
            }
            if (!this.f19480bb) {
                this.f19514v = null;
                this.f19459af = null;
            }
            mo14145s();
            AbstractC11615c cVar = this.f19485bg;
            if (cVar != null) {
                cVar.mo18410d();
            }
            if (!this.f19447aT) {
                AbstractC11615c cVar2 = this.f19485bg;
                if (cVar2 != null) {
                    cVar2.mo18410d();
                }
                m15905c("reset player");
                this.f19404C.mo13985a(8);
            }
            this.f19518z = false;
            this.f19507o = false;
            C7572d.m15561a("LivePlayFragment", "resetPlayer, roomId=" + this.f19495c + ", userId=" + this.f19497e);
            mo14093a(0);
        } else if (this.f19459af != null && !this.f19480bb) {
            ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).recycleRoomPlayer(this.f19459af);
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z;
        this.f19427Z = new HashMap<>();
        this.f19454aa = System.currentTimeMillis();
        DataChannel a = DataChannel.C17840a.m33044a(C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null), this);
        this.f19423V = a;
        a.mo28315b(C9057bw.class, Boolean.valueOf(this.f19491bm));
        this.f19423V.mo28311a(C9021ao.class, getChildFragmentManager());
        ActivityC0945e activity = getActivity();
        DataChannel dataChannel = this.f19423V;
        if (activity != null && (activity instanceof AbstractC10135q)) {
            AbstractC10135q qVar = (AbstractC10135q) activity;
            if (qVar.mo16975a() != null && !activity.isFinishing()) {
                qVar.mo16975a().mo14736a(dataChannel);
            }
        }
        super.onCreate(bundle);
        if (!(bundle == null || this.f19463aj != null || bundle.getParcelable("enter_room_config") == null)) {
            this.f19463aj = (EnterRoomConfig) bundle.getParcelable("enter_room_config");
        }
        if (C11870f.C11871a.f28404a.mo19010a().f28391b != null) {
            C6529h.C6530a aVar = new C6529h.C6530a();
            aVar.f16315a = "live_detail";
            aVar.f16319e = (C6520a) DataChannelGlobal.f42558d.mo28324b(C6522b.class);
            aVar.f16320f = (C6535m) DataChannelGlobal.f42558d.mo28324b(C6536n.class);
            this.f19423V.mo28311a(C6531i.class, aVar.mo12676a());
            EnterRoomConfig enterRoomConfig = this.f19463aj;
            if (enterRoomConfig == null || C13627m.m24498a(enterRoomConfig.f28233c.f28306W)) {
                C6538d.m13981c("full_screen");
            } else {
                C6538d.m13981c(this.f19463aj.f28233c.f28306W);
            }
        }
        long j = this.f19463aj.f28232b.f28277u;
        if (j > 0) {
            C6555i.m14021b();
            C6555i.m9462a("ttlive_portal", "entering target room, portalId=".concat(String.valueOf(j)));
        }
        DataChannel dataChannel2 = this.f19423V;
        EnterRoomConfig enterRoomConfig2 = this.f19463aj;
        C89219l.m154721d(enterRoomConfig2, "");
        if (dataChannel2 != null) {
            dataChannel2.mo28311a(C9045bk.class, enterRoomConfig2.f28233c.f28360p);
            dataChannel2.mo28311a(C9016aj.class, Boolean.valueOf(enterRoomConfig2.f28233c.f28359o));
            dataChannel2.mo28311a(C9044bj.class, enterRoomConfig2.f28233c.f28356l);
            dataChannel2.mo28311a(C9043bi.class, enterRoomConfig2.f28233c.f28357m);
        }
        if (this.f19463aj.f28233c.f28301R > 0) {
            this.f19495c = this.f19463aj.f28233c.f28301R;
        }
        if (!C13627m.m24498a(this.f19463aj.f28233c.f28287D)) {
            try {
                this.f19497e = Long.parseLong(this.f19463aj.f28233c.f28287D.trim());
            } catch (NumberFormatException e) {
                C3854a.m9459b(e.getMessage());
            }
        }
        if (this.f19463aj.f28233c.f28333an <= 0) {
            this.f19463aj.f28233c.f28333an = this.f19495c;
        }
        if (this.f19463aj.f28233c.f28334ao <= 0) {
            long j2 = this.f19497e;
            if (j2 <= 0 && !TextUtils.isEmpty(this.f19463aj.f28232b.f28258b)) {
                try {
                    j2 = Long.parseLong(this.f19463aj.f28232b.f28258b);
                } catch (Exception unused) {
                }
            }
            this.f19463aj.f28233c.f28334ao = j2;
        }
        this.f19498f = this.f19463aj.f28233c.f28369y;
        this.f19499g = this.f19463aj.f28231a.f28375b;
        this.f19476ax = this.f19463aj.f28231a.f28376c;
        this.f19477ay = this.f19463aj.f28231a.f28377d;
        this.f19478az = this.f19463aj.f28231a.f28379f;
        this.f19500h = EnumC11728i.valueOf(this.f19463aj.f28231a.f28383j);
        LivePerformanceManager.getInstance().setStreamType(this.f19500h);
        this.f19428aA = new C11738s.C11739a(this.f19463aj.f28231a.f28380g, this.f19463aj.f28231a.f28381h, this.f19463aj.f28231a.f28382i);
        if (!(this.f19495c == 0 && this.f19497e == 0)) {
            this.f19510r = EnumC11662p.INITIALIZED;
        }
        this.f19458ae = false;
        this.f19416O = false;
        this.f19417P = false;
        this.f19414M = this.f19463aj.f28232b.f28257a;
        this.f19442aO = this.f19463aj.f28232b.f28267k;
        this.f19443aP = this.f19463aj.f28233c.f28323ad;
        String str = this.f19463aj.f28233c.f28363s;
        String str2 = this.f19463aj.f28233c.f28293J;
        String str3 = this.f19463aj.f28233c.f28295L;
        String str4 = this.f19463aj.f28233c.f28370z;
        String str5 = this.f19463aj.f28233c.f28307X;
        String str6 = this.f19463aj.f28233c.f28309Z;
        this.f19501i = this.f19463aj.f28233c.f28352h;
        this.f19463aj.f28233c.f28352h = false;
        this.f19504l = this.f19463aj.f28233c.f28350f;
        this.f19463aj.f28233c.f28350f = false;
        this.f19502j = this.f19463aj.f28233c.f28351g;
        this.f19463aj.f28233c.f28351g = 0;
        this.f19503k = this.f19463aj.f28232b.f28276t;
        this.f19463aj.f28232b.f28276t = "";
        this.f19429aB = this.f19463aj.f28233c.f28349e;
        this.f19463aj.f28233c.f28349e = false;
        if (this.f19441aN == null && !C13627m.m24498a(this.f19463aj.f28232b.f28263g)) {
            this.f19441aN = this.f19463aj.f28232b.f28263g;
        }
        if (this.f19442aO == 0 && this.f19463aj.f28232b.f28267k != 0) {
            this.f19442aO = this.f19463aj.f28232b.f28267k;
        }
        C7445j jVar = new C7445j(getContext(), this.f19414M, this.f19441aN, this.f19442aO, str4, str5, this.f19463aj, str2, str3);
        this.f19511s = jVar;
        long j3 = this.f19495c;
        if (this.f19500h == EnumC11728i.AUDIO) {
            z = true;
        } else {
            z = false;
        }
        jVar.mo13670a(j3, z, this.f19497e, (C11735p) null);
        this.f19511s.f18518z = this.f19443aP;
        this.f19511s.f18477C = str;
        this.f19511s.f18479E = str6;
        this.f19455ab = new C6739l();
        this.f19432aE = new C7599q();
        if (f19399a.booleanValue()) {
            C7572d.m15561a("LivePlayFragment", "onCreate -> roomId=" + this.f19495c + ", userId=" + this.f19497e);
        }
        this.f19427Z.put("time", String.valueOf(System.currentTimeMillis() - this.f19454aa));
        this.f19427Z.put("location", "finish live play oncreate");
        ((AbstractC11807g) C6193a.m13435a(AbstractC11807g.class)).mo18865a("feed_enter_room", this.f19427Z);
        DataChannel dataChannel3 = this.f19423V;
        if (dataChannel3 != null) {
            EnterRoomConfig enterRoomConfig3 = C11870f.C11871a.f28404a.mo19010a().f28391b;
            boolean z2 = enterRoomConfig3.f28233c.f28298O;
            String str7 = enterRoomConfig3.f28233c.f28300Q;
            if (z2) {
                Room room = (Room) dataChannel3.mo28318b(C9093de.class);
                if (room != null && room.isOfficial()) {
                    z2 = false;
                }
                String str8 = enterRoomConfig3.f28233c.f28299P;
                String str9 = enterRoomConfig3.f28233c.f28284A;
                dataChannel3.mo28311a(C9059by.class, Boolean.valueOf(z2));
                dataChannel3.mo28311a(C9056bv.class, str7);
                dataChannel3.mo28311a(C9062ca.class, str9);
                dataChannel3.mo28311a(C9060bz.class, str8);
            }
        }
        Boolean valueOf = Boolean.valueOf(LiveTestEnableRoomStreamToastSetting.INSTANCE.getValue());
        if (valueOf != null && valueOf.booleanValue() && (!TextUtils.isEmpty(this.f19477ay) || !TextUtils.isEmpty(this.f19499g))) {
            C11226ao.m19883a(C3966y.m9669e(), "Stream FOUND. ".concat(String.valueOf(str2)), 0);
        }
        if (getActivity() instanceof AbstractC11615c) {
            this.f19485bg = (AbstractC11615c) getActivity();
        }
        String str10 = this.f19463aj.f28233c.f28288E;
        if (str10 != null) {
            this.f19459af = str10;
        }
        this.f19487bi = !TextUtils.isEmpty(this.f19463aj.f28231a.f28378e);
        this.f19494bp = new BroadcastReceiver() {
            /* class com.bytedance.android.livesdk.chatroom.p499ui.C7822br.C78387 */

            static {
                Covode.recordClassIndex(8633);
            }

            public final void onReceive(Context context, Intent intent) {
                if (intent != null && "media_control".equals(intent.getAction())) {
                    int intExtra = intent.getIntExtra("control_type", 0);
                    if (intExtra != 1) {
                        if (intExtra == 2 && C7822br.this.f19514v != null) {
                            C7822br.this.f19514v.setMute(false);
                            C6779a.m14563a().mo13053a(new C8456i(false, false));
                        }
                    } else if (C7822br.this.f19514v != null) {
                        C7822br.this.f19514v.setMute(true);
                        C6779a.m14563a().mo13053a(new C8456i(true, false));
                    }
                }
            }
        };
        if (getContext() != null) {
            m15902b(getContext(), this.f19494bp, new IntentFilter("media_control"));
            C3854a.m9453a(4, "picture_in_picture", "registerReceiver");
        }
        this.f19474av = new C6695f();
        mo14090E().put("param_live_create_time", new StringBuilder().append(System.currentTimeMillis()).toString());
        C7711b.C7712a.m15759a("live_room_ctr").mo13989a(this, 2);
        this.f19484bf = C2716a.m7846a(this.f19495c);
        f19400aq.clear();
    }

    public void onEvent(C7403t tVar) {
        if (this.f19510r == EnumC11662p.LIVE_STARTED) {
            if (tVar.f18344c != null) {
                LiveCoreSDKData.Quality quality = tVar.f18344c;
                if (this.f19510r == EnumC11662p.LIVE_STARTED) {
                    this.f19518z = true;
                    this.f19514v.switchResolution(quality.sdkKey);
                    C11226ao.m19883a(C3966y.m9669e(), getString(R.string.gru), 0);
                    return;
                }
                return;
            }
            String str = tVar.f18342a;
            String str2 = tVar.f18343b;
            if (!TextUtils.isEmpty(str)) {
                this.f19518z = true;
                this.f19514v.stop(false);
                this.f19514v.recycle();
                this.f19514v = null;
                m15900a(str, this.f19500h, this.f19428aA, str2);
                C11226ao.m19883a(C3966y.m9669e(), getString(R.string.gru), 0);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.br$b */
    static class C7842b {

        /* renamed from: a */
        String f19561a;

        /* renamed from: b */
        String f19562b;

        static {
            Covode.recordClassIndex(8637);
        }

        public C7842b(int i, String str) {
            this.f19561a = String.valueOf(i);
            this.f19562b = str;
        }
    }

    /* renamed from: a */
    private void m15898a(EnumC11728i iVar, List<String> list) {
        HSImageView hSImageView;
        if (!this.f19444aQ || TextUtils.equals(this.f19463aj.f28233c.f28320aa, "inner_draw")) {
            hSImageView = this.f19435aH;
        } else {
            hSImageView = this.f19406E;
        }
        if (iVar == EnumC11728i.AUDIO) {
            hSImageView.setBackgroundResource(R.drawable.bxm);
        } else if (C13617h.m24466b(list)) {
            C3941k.m9604a(hSImageView, new ImageModel(null, list), new C11291z(5, ((float) C13628n.m24504a(getContext())) / ((float) C13628n.m24521b(getContext()))));
        } else {
            C3941k.m9605a(hSImageView, "res://" + mo14092a(getContext()) + "/2131234509");
        }
    }

    /* renamed from: a */
    private void m15897a(long j, C7435f.AbstractC7436a aVar) {
        String str;
        String str2;
        String str3;
        if (this.f19513u == null) {
            String str4 = "";
            C7445j jVar = this.f19511s;
            if (jVar != null) {
                if (!TextUtils.isEmpty(jVar.f18479E)) {
                    str4 = this.f19511s.f18479E;
                } else if (!TextUtils.isEmpty(this.f19511s.f18514v)) {
                    if (TextUtils.isEmpty(this.f19511s.f18515w)) {
                        str4 = this.f19511s.f18514v;
                    } else {
                        str4 = this.f19511s.f18514v + "-" + this.f19511s.f18515w;
                    }
                }
                str = this.f19511s.f18512t;
                str2 = this.f19511s.f18500h;
                str3 = this.f19511s.f18513u;
            } else {
                str = this.f19463aj.f28233c.f28321ab;
                str2 = this.f19463aj.f28233c.f28370z;
                str3 = this.f19463aj.f28233c.f28307X;
                if (!TextUtils.isEmpty(this.f19463aj.f28233c.f28309Z)) {
                    str4 = this.f19463aj.f28233c.f28309Z;
                } else if (!TextUtils.isEmpty(this.f19463aj.f28233c.f28293J)) {
                    if (TextUtils.isEmpty(this.f19463aj.f28233c.f28295L)) {
                        str4 = this.f19463aj.f28233c.f28293J;
                    } else {
                        str4 = this.f19463aj.f28233c.f28293J + "-" + this.f19463aj.f28233c.f28295L;
                    }
                }
            }
            C7435f fVar = new C7435f(aVar, j, this.f19414M, str, str2, str3, str4, this.f19463aj.f28232b.f28262f);
            this.f19513u = fVar;
            fVar.mo13655a();
            C7572d.m15561a("LivePlayFragment", "startEnterRoom -> roomId=" + this.f19495c + ", userId=" + this.f19497e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14113b(Room room, boolean z) {
        boolean z2;
        String str;
        if (((Boolean) this.f19423V.mo28318b(C9074cm.class)).booleanValue()) {
            C3854a.m9453a(4, "picture_in_picture", "hide abs interaction fragment");
            C13628n.m24510a(this.f19456ac.findViewById(R.id.b82), 8);
        }
        String str2 = this.f19463aj.f28232b.f28257a;
        this.f19414M = str2;
        room.setRequestId(str2);
        room.setLog_pb(this.f19441aN);
        room.setUserFrom(this.f19442aO);
        this.f19423V.mo28315b(C9093de.class, room);
        this.f19423V.mo28311a(C6888ay.class, this.f19511s);
        AbstractC2717b bVar = this.f19514v;
        if (bVar == null || !bVar.isVideoHorizontal()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f19505m = z2;
        this.f19423V.mo28315b(C5766ab.class, new C7380am(this.f19505m, this.f19508p));
        if (this.f19506n == 1) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        room.setRoomOrientation(str);
        this.f19423V.mo28311a(C9015ai.class, this.f19463aj.f28233c.f28316aF);
        if (!TextUtils.isEmpty(this.f19463aj.f28233c.f28316aF)) {
            this.f19463aj.f28233c.f28316aF = "";
        }
        if (this.f19411J != null) {
            this.f19423V.mo28311a(C6778am.class, (Object) false);
            return;
        }
        m15909e(z);
        this.f19411J.mo13952b(new RunnableC7853cb(this));
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Room room;
        MethodCollector.m26663i(5049);
        super.onViewCreated(view, bundle);
        this.f19456ac = view;
        this.f19404C = new C7710a(view.findViewById(R.id.fe8));
        this.f19405D = (ViewGroup) view.findViewById(R.id.fe9);
        if (this.f19404C.f19173a instanceof AbstractC11877e) {
            this.f19404C.mo13988b(2);
            ((AbstractC11877e) this.f19404C.f19173a).setDataChannel(this.f19423V);
        }
        this.f19435aH = (HSImageView) view.findViewById(R.id.c_u);
        this.f19406E = (HSImageView) view.findViewById(R.id.c_v);
        if (Build.VERSION.SDK_INT >= 23 && getContext() != null) {
            this.f19435aH.setForeground(new ColorDrawable(C0643b.m2378c(getContext(), R.color.bk)));
            this.f19406E.setForeground(new ColorDrawable(C0643b.m2378c(getContext(), R.color.bk)));
        }
        this.f19436aI = (HSImageView) view.findViewById(R.id.cb2);
        this.f19437aJ = view.findViewById(R.id.cb3);
        this.f19407F = (ViewGroup) view.findViewById(R.id.cc4);
        this.f19408G = (HSImageView) view.findViewById(R.id.dds);
        this.f19410I = view.findViewById(R.id.ddt);
        this.f19419R = view.findViewById(R.id.cip);
        EnumC11728i iVar = this.f19500h;
        List<String> list = this.f19498f;
        AbstractC5777j b = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11553b(this.f19459af);
        if (this.f19487bi && b != null && b.mo11546f()) {
            this.f19435aH.setVisibility(8);
            if (!this.f19466am) {
                this.f19406E.setVisibility(8);
            }
        }
        AbstractC11615c cVar = this.f19485bg;
        if (cVar != null) {
            cVar.mo18410d();
        }
        m15898a(iVar, list);
        m15905c("init");
        this.f19404C.mo13985a(8);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.cbb);
        this.f19409H = linearLayout;
        this.f19438aK = (HSAnimImageView) linearLayout.findViewById(R.id.czj);
        ((LiveTextView) this.f19409H.findViewById(R.id.czm)).mo9623a(R.style.ti);
        ((LiveTextView) this.f19409H.findViewById(R.id.czl)).mo9623a(R.style.tm);
        this.f19460ag = view.findViewById(R.id.cbf);
        this.f19486bh = view.findViewById(R.id.cbg);
        LivePerformanceManager.getInstance().setIsAnchor(false);
        if (this.f19487bi) {
            AbstractC5777j b2 = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11553b(this.f19459af);
            if (b2 == null || b2.mo12931o() == null) {
                this.f19487bi = false;
                this.f19404C.mo13988b(2);
            } else {
                View o = b2.mo12931o();
                int width = o.getWidth();
                int height = o.getHeight();
                b2.mo12914a(false, o.getContext());
                if (o.getParent() instanceof ViewGroup) {
                    ((ViewGroup) o.getParent()).removeView(o);
                }
                ViewGroup.LayoutParams b3 = this.f19404C.mo13987b();
                if (width >= height) {
                    if (b3 instanceof FrameLayout.LayoutParams) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b3;
                        layoutParams.gravity = 1;
                        layoutParams.topMargin = C3966y.m9653a(f19401b);
                    }
                    if (this.f19463aj.f28234d.f28238b != null) {
                        this.f19498f = this.f19463aj.f28234d.f28238b;
                    }
                    m15888O();
                } else if (b3 instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) b3).gravity = 17;
                }
                o.setLayoutParams(b3);
                this.f19407F.addView(o, 0);
                C7710a aVar = this.f19404C;
                C89219l.m154721d(o, "");
                aVar.f19173a = o;
                if (EnableReusePlayerWithoutFirstFrameSetting.INSTANCE.getValue() && !b2.mo11546f()) {
                    mo14145s();
                }
                if (width < height) {
                    this.f19404C.mo13985a(0);
                    this.f19404C.mo13988b(2);
                } else {
                    this.f19404C.mo13988b(0);
                }
                b2.mo12925h(true);
                if (EnableReusePlayerWithoutFirstFrameSetting.INSTANCE.getValue() && !b2.mo11546f()) {
                    mo14105a("share");
                }
                ((AbstractC11181z) AbstractC88979t.m154310b((Object) 1).mo143295e(InteractFirstFrameTimeOutDurationSetting.DEFAULT, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143278b(C88391a.m153580a(C88392a.f200660a)).mo143280b((AbstractC88433f) new C7843bs(this)).mo143274a(C11152e.m19789a((Fragment) this))).mo17948a();
            }
        } else {
            this.f19404C.mo13988b(2);
        }
        C7572d.m15561a("LivePlayFragment", "share player -> is keep surfaceTexture? " + (this.f19404C.f19173a instanceof C11879g));
        if (this.f19463aj.f28233c.f28346b) {
            AbstractC5777j b4 = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11553b(this.f19459af);
            if (b4 != null) {
                b4.mo11524a(this.f19404C.mo13984a());
                C7572d.m15561a("PreCreateSurface", "onViewCreated TextureView ready, will clear 1px");
                b4.mo12932p();
            }
            this.f19463aj.f28233c.f28346b = false;
        }
        this.f19452aY = System.currentTimeMillis();
        if (TestDisablePullStreamInfoSetting.INSTANCE.getValue()) {
            RecyclableWidgetManager of = RecyclableWidgetManager.m33063of((Fragment) this, this.f19456ac, false, (IWidgetProvider) LiveWidgetProvider.getInstance(), (FluencyOpt) C6204h.f15480c, C6204h.m13485e());
            this.f19424W = of;
            of.load(R.id.e_h, ((AbstractC4318a) C6193a.m13435a(AbstractC4318a.class)).getStreamInfoWidget());
        }
        if (m15880G()) {
            Room room2 = this.f19496d;
            if (room2 == null || room2.mRoomAuthStatus == null || this.f19496d.getCover() == null || this.f19496d.getOwner() == null) {
                EnterRoomConfig enterRoomConfig = this.f19463aj;
                if (enterRoomConfig == null || EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() != 1) {
                    room = new Room();
                } else {
                    room = (Room) C4139e.C4140a.f11575b.mo46670a(enterRoomConfig.f28233c.f28310a, Room.class);
                    if (room == null) {
                        room = new Room();
                    }
                }
                room.setId(this.f19463aj.f28233c.f28333an);
                room.setOwnerUserId(this.f19463aj.f28233c.f28334ao);
            } else {
                room = this.f19496d;
            }
            mo14113b(room, false);
        }
        mo14111b();
        if (C11725f.f28051c.booleanValue() && C11725f.f28049a == null) {
            C7307f.m15219b(this.f19426Y);
        }
        mo14103a((Room) null);
        if (getUserVisibleHint()) {
            C8422f.m16636a(getActivity(), Boolean.valueOf(mo14091F()));
        }
        MethodCollector.m26664o(5049);
    }

    /* renamed from: a */
    public final void mo14096a(int i, String str, long j) {
        m15893T();
        C6739l lVar = this.f19455ab;
        if (lVar != null) {
            lVar.mo12947a(i, str, j);
        }
    }

    /* renamed from: a */
    private static Intent m15896a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent m15902b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m15896a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p499ui.C7822br.m15902b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        int i;
        String str = this.f19463aj.f28233c.f28293J + "-" + this.f19463aj.f28233c.f28295L;
        if (TextUtils.equals(str, "homepage_hot-live_cell") || TextUtils.equals(str, "homepage_follow-live_cell")) {
            z = false;
        } else {
            z = true;
        }
        if (!LiveUseSurfaceViewExperiment.INSTANCE.isEnable() || !z) {
            i = R.layout.b8o;
        } else {
            i = R.layout.b8p;
        }
        View a = C2690b.m7784a(i, viewGroup);
        C11330h.m20085a();
        ((IGiftService) C6193a.m13435a(IGiftService.class)).onPlayFragmentCreate();
        if (this.f19463aj.f28234d.f28237a) {
            if (Build.VERSION.SDK_INT >= 23) {
                a.findViewById(R.id.fc1).setForeground(null);
            }
            a.findViewById(R.id.fc1).setAlpha(0.0f);
        } else {
            a.findViewById(R.id.fc1).setAlpha(1.0f);
            if (Build.VERSION.SDK_INT >= 23) {
                a.findViewById(R.id.fc1).setForeground(new ColorDrawable(Color.parseColor("#a3000000")));
            }
        }
        return a;
    }

    /* renamed from: a */
    private void m15900a(String str, EnumC11728i iVar, C11738s.C11739a aVar, String str2) {
        if (this.f19514v == null) {
            if (this.f19404C == null) {
                AbstractC29335a.m58737e("LivePlayFragment", "startPlayer mVideoView is null");
                return;
            }
            C7572d.m15561a("LivePlayFragment", "startPlayer -> roomId=" + this.f19495c + ", userId=" + this.f19497e);
            boolean z = false;
            this.f19404C.mo13985a(0);
            if (!this.f19518z && !this.f19444aQ && !this.f19462ai) {
                m15905c("start player");
            }
            if (this.f19487bi) {
                if (this.f19404C.f19173a.getContext() != null) {
                    this.f19514v = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).ensureRoomPlayer(this.f19495c, str, iVar, aVar, this.f19404C.mo13984a(), this.f19493bo, this.f19404C.f19173a.getContext(), str2, this.f19459af);
                } else {
                    return;
                }
            } else if (getContext() != null) {
                this.f19514v = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).ensureRoomPlayer(this.f19495c, str, iVar, aVar, this.f19404C.mo13984a(), this.f19493bo, getContext(), str2, this.f19459af);
            } else {
                return;
            }
            AbstractC2717b bVar = this.f19514v;
            if (bVar instanceof AbstractC2719c) {
                this.f19459af = ((AbstractC2719c) bVar).getPlayerTag();
                this.f19463aj.f28233c.f28288E = this.f19459af;
            }
            this.f19514v.setEnterRoomScene(this.f19463aj.f28233c.f28320aa);
            m15886M();
            this.f19514v.start();
            this.f19514v.setAnchorInteractMode(this.f19507o);
            AbstractC2717b bVar2 = this.f19514v;
            if (this.f19506n == 1) {
                z = true;
            }
            bVar2.setScreenOrientation(z);
            m15885L();
            if (!m15884K()) {
                mo14145s();
            } else if ((this.f19448aU || this.f19480bb) && C13627m.m24499a("inner_draw", this.f19463aj.f28233c.f28320aa)) {
                Handler handler = this.f19426Y;
                handler.sendMessageDelayed(Message.obtain(handler, 37), (long) this.f19449aV);
            } else if (this.f19450aW > 0) {
                Handler handler2 = this.f19426Y;
                handler2.sendMessageDelayed(Message.obtain(handler2, 37), (long) this.f19450aW);
            } else {
                mo14144r();
            }
        }
    }

    /* renamed from: a */
    private void m15901a(String str, String str2, EnumC11728i iVar, C11738s.C11739a aVar) {
        if (this.f19514v == null) {
            if (this.f19404C == null) {
                AbstractC29335a.m58737e("LivePlayFragment", "startPlayer  mVideoView is null");
                return;
            }
            C7572d.m15561a("LivePlayFragment", "startPlayer, roomId=" + this.f19495c + ", userId=" + this.f19497e);
            boolean z = false;
            this.f19404C.mo13985a(0);
            if (!this.f19518z && !this.f19444aQ && !this.f19462ai) {
                m15905c("start player");
            }
            if (this.f19487bi) {
                if (this.f19404C.f19173a.getContext() != null) {
                    this.f19514v = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).ensureRoomPlayer(this.f19495c, str, str2, iVar, aVar, this.f19404C.mo13984a(), this.f19493bo, this.f19404C.f19173a.getContext(), this.f19459af);
                } else {
                    return;
                }
            } else if (getContext() != null) {
                this.f19514v = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).ensureRoomPlayer(this.f19495c, str, str2, iVar, aVar, this.f19404C.mo13984a(), this.f19493bo, getContext(), this.f19459af);
            } else {
                return;
            }
            AbstractC2717b bVar = this.f19514v;
            if (bVar instanceof AbstractC2719c) {
                this.f19459af = ((AbstractC2719c) bVar).getPlayerTag();
                this.f19463aj.f28233c.f28288E = this.f19459af;
            }
            this.f19514v.setEnterRoomScene(this.f19463aj.f28233c.f28320aa);
            m15886M();
            C7445j jVar = this.f19511s;
            if (jVar != null) {
                jVar.f18480F = SystemClock.elapsedRealtime();
            }
            this.f19514v.start();
            this.f19514v.setAnchorInteractMode(this.f19507o);
            AbstractC2717b bVar2 = this.f19514v;
            if (this.f19506n == 1) {
                z = true;
            }
            bVar2.setScreenOrientation(z);
            m15885L();
            if (!m15884K()) {
                mo14145s();
            } else if ((this.f19448aU || this.f19480bb) && C13627m.m24499a("inner_draw", this.f19463aj.f28233c.f28320aa)) {
                Handler handler = this.f19426Y;
                handler.sendMessageDelayed(Message.obtain(handler, 37), (long) this.f19449aV);
            } else if (this.f19450aW > 0) {
                Handler handler2 = this.f19426Y;
                handler2.sendMessageDelayed(Message.obtain(handler2, 37), (long) this.f19450aW);
            } else {
                mo14144r();
            }
        }
    }
}
