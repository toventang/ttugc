package com.bytedance.android.livesdk.chatroom.p499ui;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.AbstractC4317f;
import com.bytedance.android.live.C4347h;
import com.bytedance.android.live.adminsetting.AbstractC2915b;
import com.bytedance.android.live.banner.AbstractC2951c;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.copyrightreview.helper.CopyrightViolationHelper;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.performance.C4017b;
import com.bytedance.android.live.design.widget.shapecontrol.ShapeControllableView;
import com.bytedance.android.live.gift.C4328d;
import com.bytedance.android.live.gift.C4336l;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.C4446p;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p209c.AbstractC3807b;
import com.bytedance.android.live.p247f.AbstractC4318a;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p378m.AbstractC5760a;
import com.bytedance.android.live.p378m.C5762c;
import com.bytedance.android.live.p379n.AbstractC5788t;
import com.bytedance.android.live.p379n.C5766ab;
import com.bytedance.android.live.p379n.C5784p;
import com.bytedance.android.live.p385p.AbstractC5843h;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p403q.AbstractC6091a;
import com.bytedance.android.live.p404r.AbstractC6093a;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.live.share.AbstractC6108b;
import com.bytedance.android.live.share.AbstractC6109c;
import com.bytedance.android.live.share.C6112e;
import com.bytedance.android.live.slot.C6160ac;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.wallet.AbstractC6332d;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.AbstractC10073p;
import com.bytedance.android.livesdk.C6885av;
import com.bytedance.android.livesdk.callback.AbstractC7257a;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.chatroom.C7298b;
import com.bytedance.android.livesdk.chatroom.detail.C7445j;
import com.bytedance.android.livesdk.chatroom.interaction.C7628a;
import com.bytedance.android.livesdk.chatroom.interaction.C7629b;
import com.bytedance.android.livesdk.chatroom.interaction.C7634c;
import com.bytedance.android.livesdk.chatroom.interaction.C7638e;
import com.bytedance.android.livesdk.chatroom.interaction.C7640f;
import com.bytedance.android.livesdk.chatroom.interaction.C7643g;
import com.bytedance.android.livesdk.chatroom.interaction.C7646h;
import com.bytedance.android.livesdk.chatroom.p481b.C7302b;
import com.bytedance.android.livesdk.chatroom.p481b.EnumC7303c;
import com.bytedance.android.livesdk.chatroom.p488c.C7380am;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
import com.bytedance.android.livesdk.chatroom.p490e.C7487k;
import com.bytedance.android.livesdk.chatroom.p490e.C7500q;
import com.bytedance.android.livesdk.chatroom.p492g.p493a.AbstractC7561a;
import com.bytedance.android.livesdk.chatroom.p492g.p493a.C7565d;
import com.bytedance.android.livesdk.chatroom.view.AbstractC7962a;
import com.bytedance.android.livesdk.chatroom.viewmodule.EndWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8007b;
import com.bytedance.android.livesdk.event.C8448b;
import com.bytedance.android.livesdk.function.UserPermissionCheckWidget;
import com.bytedance.android.livesdk.gift.model.AbstractC8855s;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.p544b.C8789a;
import com.bytedance.android.livesdk.gift.p549e.AbstractC8807b;
import com.bytedance.android.livesdk.like.AbstractC9168b;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePauseLiveSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveFastGiftIconHideSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveVideoGiftCoverPanelSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractStartFetchingMessageStyleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveHostCardLongPressEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.MtPipWatchLiveEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableCommentAreaSetting;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.EnumC9541ay;
import com.bytedance.android.livesdk.model.RoomAuthOffReasons;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.C9598ab;
import com.bytedance.android.livesdk.model.message.C9688bt;
import com.bytedance.android.livesdk.model.message.C9691bw;
import com.bytedance.android.livesdk.model.message.C9883n;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6538d;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p441ah.C6682a;
import com.bytedance.android.livesdk.p441ah.C6684c;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p542g.C8780f;
import com.bytedance.android.livesdk.p561j.C9007aa;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9026at;
import com.bytedance.android.livesdk.p561j.C9028av;
import com.bytedance.android.livesdk.p561j.C9036bc;
import com.bytedance.android.livesdk.p561j.C9045bk;
import com.bytedance.android.livesdk.p561j.C9052br;
import com.bytedance.android.livesdk.p561j.C9053bs;
import com.bytedance.android.livesdk.p561j.C9057bw;
import com.bytedance.android.livesdk.p561j.C9058bx;
import com.bytedance.android.livesdk.p561j.C9069ch;
import com.bytedance.android.livesdk.p561j.C9074cm;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9085cx;
import com.bytedance.android.livesdk.p561j.C9092dd;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9096dh;
import com.bytedance.android.livesdk.p561j.C9098dj;
import com.bytedance.android.livesdk.p561j.C9101dm;
import com.bytedance.android.livesdk.p561j.C9111dw;
import com.bytedance.android.livesdk.p561j.C9114dz;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p561j.C9123eh;
import com.bytedance.android.livesdk.p561j.C9128j;
import com.bytedance.android.livesdk.p561j.C9131m;
import com.bytedance.android.livesdk.p571m.C9452a;
import com.bytedance.android.livesdk.p571m.C9454b;
import com.bytedance.android.livesdk.p571m.C9461f;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.rank.api.AbstractC10336c;
import com.bytedance.android.livesdk.rank.api.AbstractC10339d;
import com.bytedance.android.livesdk.survey.AbstractC10787a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdk.utils.C11199a;
import com.bytedance.android.livesdk.utils.C11224am;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.android.livesdk.watch.AbstractC11325d;
import com.bytedance.android.livesdk.widget.C11429j;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdk.widget.p660b.AbstractC11379a;
import com.bytedance.android.livesdk.widget.p660b.C11381c;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p677a.AbstractC11623a;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.model.C11838d;
import com.bytedance.android.livesdkapi.p675c.AbstractC11616a;
import com.bytedance.android.livesdkapi.p689e.C11752b;
import com.bytedance.android.livesdkapi.p692h.C11777a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.message.AbstractC11888a;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.widget.Widget;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1114a.AbstractC16042a;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import com.bytedance.ies.sdk.widgets.IWidgetProvider;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.a */
public abstract class AbstractC7703a extends C10935a implements EnumC7303c.AbstractC7304a, AbstractC7962a, AbstractC11623a, WeakHandler.IHandler, AbstractC16042a {

    /* renamed from: A */
    protected List<AbstractC7257a> f19101A = new ArrayList();

    /* renamed from: B */
    public AbstractC88412b f19102B;

    /* renamed from: C */
    AbstractC11379a f19103C = new AbstractC11379a() {
        /* class com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a.C77041 */

        static {
            Covode.recordClassIndex(8499);
        }

        @Override // com.bytedance.android.livesdk.widget.p660b.AbstractC11380b
        /* renamed from: a */
        public final void mo13976a() {
            AbstractC7703a.this.mo13960k();
        }

        @Override // com.bytedance.android.livesdk.widget.p660b.AbstractC11380b
        /* renamed from: b */
        public final void mo13977b() {
            AbstractC7703a.this.mo13962m();
        }

        @Override // com.bytedance.android.livesdk.widget.p660b.AbstractC11380b
        /* renamed from: c */
        public final void mo13978c() {
            AbstractC7703a.this.mo13961l();
        }

        @Override // com.bytedance.android.livesdk.widget.p660b.AbstractC11380b
        /* renamed from: d */
        public final void mo13979d() {
            AbstractC7703a.this.mo13959j();
        }

        @Override // com.bytedance.android.livesdk.widget.p660b.AbstractC11380b
        /* renamed from: e */
        public final void mo13980e() {
            AbstractC7703a.this.mo13963n();
        }
    };

    /* renamed from: D */
    public C11381c f19104D = new C11381c(this.f19103C);

    /* renamed from: E */
    public boolean f19105E = false;

    /* renamed from: F */
    ShapeControllableView f19106F;

    /* renamed from: G */
    public final Runnable f19107G = new RunnableC7777b(this);

    /* renamed from: H */
    private GestureDetectLayout f19108H;

    /* renamed from: I */
    private WidgetCreateTimeUtil f19109I = new WidgetCreateTimeUtil();

    /* renamed from: J */
    private boolean f19110J;

    /* renamed from: K */
    private TextView f19111K;

    /* renamed from: L */
    private C7640f f19112L;

    /* renamed from: M */
    private C7643g f19113M;

    /* renamed from: N */
    private C7629b f19114N;

    /* renamed from: O */
    private C7646h f19115O;

    /* renamed from: P */
    private C7638e f19116P;

    /* renamed from: Q */
    private AbstractC11888a f19117Q;

    /* renamed from: R */
    private C7500q f19118R;

    /* renamed from: S */
    private LiveRecyclableWidget f19119S;

    /* renamed from: T */
    private LiveRecyclableWidget f19120T;

    /* renamed from: U */
    private C7487k f19121U;

    /* renamed from: V */
    private Runnable f19122V;

    /* renamed from: W */
    private CopyrightViolationHelper f19123W;

    /* renamed from: X */
    private AbstractC6108b f19124X;

    /* renamed from: Y */
    private DialogInterface f19125Y;

    /* renamed from: Z */
    private LiveRecyclableWidget f19126Z;

    /* renamed from: a */
    protected WeakHandler f19127a = new WeakHandler(this);

    /* renamed from: aa */
    private LiveRecyclableWidget f19128aa;

    /* renamed from: ab */
    private LiveRecyclableWidget f19129ab;

    /* renamed from: ac */
    private LiveRecyclableWidget f19130ac;

    /* renamed from: ad */
    private LiveRecyclableWidget f19131ad;

    /* renamed from: ae */
    private LiveRecyclableWidget f19132ae;

    /* renamed from: af */
    private boolean f19133af = false;

    /* renamed from: ag */
    private LiveRecyclableWidget f19134ag;

    /* renamed from: ah */
    private LiveRecyclableWidget f19135ah;

    /* renamed from: ai */
    private AbstractC10336c f19136ai;

    /* renamed from: aj */
    private final Runnable f19137aj = new RunnableC7851c(this);

    /* renamed from: ak */
    private final AbstractC8807b f19138ak = new AbstractC8807b() {
        /* class com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a.C77096 */

        static {
            Covode.recordClassIndex(8504);
        }

        @Override // com.bytedance.android.livesdk.gift.p549e.AbstractC8807b
        /* renamed from: a */
        public final void mo8519a(List<C9904t> list) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final /* synthetic */ void mo13983a() {
            ((IGiftService) C6193a.m13435a(IGiftService.class)).loadBehavior(AbstractC7703a.this.getContext(), AbstractC7703a.this.f19145h, EnumC5847l.FAST_GIFT.ordinal());
        }

        @Override // com.bytedance.android.livesdk.gift.p549e.AbstractC8807b
        /* renamed from: b */
        public final void mo8520b(List<GiftPage> list) {
            AbstractC7703a.this.f19102B = AbstractC88979t.m154294a(new C7723aj(this, list)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143300g();
        }
    };

    /* renamed from: b */
    protected View f19139b = null;

    /* renamed from: c */
    protected String f19140c;

    /* renamed from: d */
    protected final C88411a f19141d = new C88411a();

    /* renamed from: e */
    protected C11429j f19142e;

    /* renamed from: f */
    protected ScaleGestureDetector f19143f;

    /* renamed from: g */
    protected EnumC11728i f19144g;

    /* renamed from: h */
    protected DataChannel f19145h;

    /* renamed from: i */
    protected Room f19146i;

    /* renamed from: j */
    protected View f19147j;

    /* renamed from: k */
    protected C8780f f19148k;

    /* renamed from: l */
    protected AbstractC5788t f19149l;

    /* renamed from: m */
    protected RecyclableWidgetManager f19150m;

    /* renamed from: n */
    protected LiveWidget f19151n;

    /* renamed from: o */
    protected LiveRecyclableWidget f19152o;

    /* renamed from: p */
    protected EndWidget f19153p;

    /* renamed from: q */
    protected LiveWidget f19154q;

    /* renamed from: r */
    protected LiveWidget f19155r;

    /* renamed from: s */
    protected LiveWidget f19156s;

    /* renamed from: t */
    boolean f19157t;

    /* renamed from: u */
    public long f19158u;

    /* renamed from: v */
    protected EnterRoomConfig f19159v;

    /* renamed from: w */
    protected View f19160w;

    /* renamed from: x */
    protected LiveWidget f19161x;

    /* renamed from: y */
    public View$OnClickListenerC7911dn f19162y;

    /* renamed from: z */
    public C7445j f19163z;

    static {
        Covode.recordClassIndex(8498);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13941a(View view, Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo13948a(MotionEvent motionEvent, MotionEvent motionEvent2, float f);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C7298b mo13954d();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo13955f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo13956g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract boolean mo13957h();

    /* renamed from: a */
    public final void mo13945a(DataChannel dataChannel, EnumC11728i iVar, AbstractC5788t tVar) {
        this.f19145h = dataChannel;
        this.f19146i = (Room) dataChannel.mo28318b(C9093de.class);
        this.f19144g = iVar;
        boolean z = true;
        DataChannel a = this.f19145h.mo28311a(C9036bc.class, Boolean.valueOf(!mo13957h())).mo28311a(C9007aa.class, (Object) false).mo28311a(C9096dh.class, Long.valueOf(this.f19146i.getId())).mo28311a(C9076co.class, Boolean.valueOf(mo13957h()));
        if (!mo13957h() || !ToolBarButtonWithTextExperiment.hasText()) {
            z = false;
        }
        a.mo28311a(C9114dz.class, Boolean.valueOf(z)).mo28311a(C9058bx.class, iVar).mo28315b(C9119ed.class, (Object) false);
        Room room = this.f19146i;
        if (!(room == null || room.getRoomAuthStatus() == null)) {
            C6555i.m14021b();
            C6555i.m9463b("interaction_widget_room_auth", this.f19146i.toString());
        }
        mo14054e();
        if (this.f19140c == null) {
            this.f19140c = "";
        }
        this.f19149l = tVar;
        C6682a.f16579b = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ boolean mo13947a(MotionEvent motionEvent) {
        ScaleGestureDetector scaleGestureDetector;
        if (this.f19142e.onTouchEvent(motionEvent) || (scaleGestureDetector = this.f19143f) == null) {
            return false;
        }
        scaleGestureDetector.onTouchEvent(motionEvent);
        return false;
    }

    /* renamed from: a */
    public final boolean mo13949a(Runnable runnable) {
        for (AbstractC7257a aVar : this.f19101A) {
            if (aVar.mo10636a(runnable)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.chatroom.p481b.EnumC7303c.AbstractC7304a
    /* renamed from: a */
    public final void mo13553a(C11777a aVar) {
        if (aVar == null) {
            EnumC7303c.INSTANCE.onMessageFinish();
        } else if (aVar instanceof C9598ab) {
            C9598ab abVar = (C9598ab) aVar;
            Room room = this.f19146i;
            if ((room == null || !room.isOfficial()) && abVar.f23298a == 2 && mo13957h()) {
                this.f19158u = abVar.f23301h;
                this.f19127a.post(this.f19137aj);
                EnumC7303c.INSTANCE.onMessageFinish();
            }
        } else if (aVar instanceof C9691bw) {
            this.f19145h.mo28320c(C9098dj.class, aVar);
        } else {
            EnumC7303c.INSTANCE.onMessageFinish();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13946a(boolean z) {
        View findViewById;
        if (z) {
            mo14192a(R.id.elg, 4);
            mo14192a(R.id.eky, 4);
            mo14192a(R.id.d_q, 4);
        } else {
            mo14192a(R.id.elg, 0);
            mo14192a(R.id.eky, 0);
            mo14192a(R.id.d_q, 0);
        }
        boolean z2 = !z;
        LiveWidget liveWidget = this.f19155r;
        if (liveWidget != null) {
            findViewById = liveWidget.getView();
        } else {
            findViewById = getView().findViewById(R.id.rn);
        }
        C11279p.m20008a(findViewById, z2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final /* synthetic */ void mo13972w() {
        m15694b(false);
    }

    /* renamed from: e */
    private void mo14054e() {
        EnterRoomConfig enterRoomConfig = this.f19159v;
        if (enterRoomConfig != null) {
            this.f19140c = enterRoomConfig.f28233c.f28307X;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo13950b() {
        LiveWidget liveWidget = this.f19156s;
        if (liveWidget != null) {
            return liveWidget.getView();
        }
        return this.f19160w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final /* synthetic */ void mo13968s() {
        C9452a.m17753a(this.f19146i, C6544e.m13987a(), C6544e.m13990d(), C9454b.EnumC9455a.LONG_PRESS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final /* synthetic */ void mo13969t() {
        DataChannel dataChannel = this.f19145h;
        if (dataChannel != null) {
            dataChannel.mo28315b(C9092dd.class, (Object) false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final /* synthetic */ void mo13970u() {
        DataChannel dataChannel = this.f19145h;
        if (dataChannel != null) {
            dataChannel.mo28315b(C9092dd.class, (Object) true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final /* synthetic */ C89391z mo13974y() {
        C3854a.m9453a(4, "WidgetLoadState", "continueAfterWidgetLoaded");
        mo13953c();
        return C89391z.f203057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final /* synthetic */ void mo13933A() {
        ((AbstractC6091a) C6193a.m13435a(AbstractC6091a.class)).configProfileHelper(this, this.f19145h, mo13957h(), this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo13965p() {
        ((IGiftService) C6193a.m13435a(IGiftService.class)).syncGiftList(this.f19138ak, this.f19146i.getId(), 2, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo13966q() {
        this.f19145h.mo28320c(((AbstractC3807b) C6193a.m13435a(AbstractC3807b.class)).getRoomStickersEvent(), this.f19146i.getStickerList().get(0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void mo13967r() {
        this.f19145h.mo28320c(((AbstractC3807b) C6193a.m13435a(AbstractC3807b.class)).getDonationDecorationsEvent(), this.f19146i.getDecorationList());
    }

    /* renamed from: i */
    public final void mo13958i() {
        this.f19145h.mo28319c(C9026at.class);
        if (getActivity() != null) {
            Fragment a = getActivity().getSupportFragmentManager().mo3551a(((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).getWebDialogTag());
            if (a instanceof DialogInterface$OnCancelListenerC0944d) {
                ((DialogInterface$OnCancelListenerC0944d) a).dismissAllowingStateLoss();
            }
        }
        this.f19145h.mo28319c(C9052br.class);
    }

    @Override // com.bytedance.android.livesdkapi.depend.p677a.AbstractC11623a
    /* renamed from: i_ */
    public final boolean mo13772i_() {
        IHostApp iHostApp = (IHostApp) C6193a.m13435a(IHostApp.class);
        if (iHostApp == null || !iHostApp.isShowStickerView()) {
            C6779a.m14563a().mo13053a(new C7400q(8));
            return true;
        }
        iHostApp.hideStickerView();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo13960k() {
        ShapeControllableView shapeControllableView;
        this.f19150m.detachWidget();
        if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1 && (shapeControllableView = this.f19106F) != null && (shapeControllableView.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            ((RelativeLayout.LayoutParams) this.f19106F.getLayoutParams()).addRule(6, 0);
        }
        this.f19119S = null;
        this.f19161x = null;
    }

    /* renamed from: n */
    public final void mo13963n() {
        if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() != 1 || InteractStartFetchingMessageStyleSetting.INSTANCE.getValue() == 2) {
            EndWidget endWidget = new EndWidget();
            this.f19153p = endWidget;
            this.f19150m.load(R.id.avr, endWidget);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ C89391z mo13964o() {
        if (!LiveFastGiftIconHideSetting.INSTANCE.getValue()) {
            EnumC5847l.DUMMY_FAST_GIFT.unload(this.f19145h);
            C6203g.m13469c(new RunnableC7715ab(this));
        }
        EnumC5847l.DUMMY_GIFT.unload(this.f19145h);
        ((IGiftService) C6193a.m13435a(IGiftService.class)).loadBehavior(getContext(), this.f19145h, EnumC5847l.GIFT.ordinal());
        return C89391z.f203057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final /* synthetic */ void mo13971v() {
        if (isViewValid() && C11115u.m19743a().mo17915b().mo13165e() && !this.f19146i.getOwner().isFollowing()) {
            m15694b(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final /* synthetic */ C89391z mo13973x() {
        AbstractC0952i iVar = (AbstractC0952i) this.f19145h.mo28318b(C9021ao.class);
        if (iVar != null) {
            ((AbstractC2915b) C6193a.m13435a(AbstractC2915b.class)).getAdminSettingDialog().show(iVar, "AbsInteractionFragment");
            EnumC5847l.SHARE.hideRedDot(this.f19145h);
        }
        return C89391z.f203057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final /* synthetic */ C89391z mo13975z() {
        C6501b.C6502a.m13948a("close_gift_toast_show").mo12658d("live_room").mo12660e("live_room").mo12654b("live").mo12656c("show").mo12643a(this.f19145h).mo12655b();
        return C89391z.f203057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final /* synthetic */ void mo13935C() {
        Room room;
        if (C11199a.m19850a(this.f19145h) && (room = this.f19146i) != null && room.author() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", String.valueOf(this.f19146i.author().getId()));
            hashMap.put("room_id", String.valueOf(this.f19146i.getId()));
            hashMap.put("duration", String.valueOf(this.f19163z.mo13675c()));
            C11199a.m19849a("live_ad", "live_watch_onemin", null, hashMap);
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f19149l = null;
        this.f19127a.removeCallbacksAndMessages(null);
        C7565d a = C7565d.C7566a.m15554a();
        if (a == null) {
            C89219l.m154715b();
        }
        a.mo13815b();
        EnumC7303c.INSTANCE.stop();
        if (this.f19146i != null) {
            ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).releaseLikeHelper(this.f19146i.getId());
        }
        this.f19145h.mo28316b(this);
        AbstractC10336c cVar = this.f19136ai;
        if (cVar != null) {
            cVar.mo17117b();
        }
        C6160ac.f15387b.mo12081a();
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final /* synthetic */ C89391z mo13934B() {
        if (LiveHostCardLongPressEnableSetting.INSTANCE.getValue() && mo13957h() && getActivity() != null) {
            DialogInterface dialogInterface = this.f19125Y;
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            Room room = this.f19146i;
            C11666c.C11667a a = C6112e.m13328a(room, this.f19145h, C6112e.m13330a(room.getOwner()), "live_room_long_press", null);
            a.f27844H = true;
            a.f27845I = ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).shouldDislikeActionShow(C6544e.m13987a(), C6544e.m13990d());
            a.f27850N = ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getReportScene();
            a.f27848L = (String) this.f19145h.mo28318b(C9045bk.class);
            a.f27851O = C11199a.m19850a(this.f19145h);
            a.f27853Q = new C7951p(this);
            final C11666c a2 = a.mo18437a();
            this.f19125Y = ((AbstractC4318a) C6193a.m13435a(AbstractC4318a.class)).onLongPress(getActivity(), false, this.f19146i, a2, new IHostLongPressCallback() {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a.C77074 */

                static {
                    Covode.recordClassIndex(8502);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public final /* synthetic */ void mo13982a() {
                    C6779a.m14563a().mo13053a(new C9461f(AbstractC7703a.this.f19146i.getId()));
                }

                @Override // com.bytedance.android.livesdk.callback.IHostLongPressCallback
                public final void onDislikePressed() {
                    if (!C11199a.m19850a(AbstractC7703a.this.f19145h)) {
                        C6779a.m14563a().mo13053a(new C9461f(AbstractC7703a.this.f19146i.getId()));
                        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e6o);
                    } else if (AbstractC7703a.this.f19146i != null && AbstractC7703a.this.getContext() != null && AbstractC7703a.this.f19159v != null && AbstractC7703a.this.f19159v.f28233c.f28360p != null) {
                        ((AbstractC11616a) C6193a.m13435a(AbstractC11616a.class)).mo18412a(AbstractC7703a.this.getContext(), AbstractC7703a.this.f19159v.f28233c.f28360p, AbstractC7703a.this.f19146i.getId(), new C7722ai(this));
                    }
                }

                @Override // com.bytedance.android.livesdk.callback.IHostLongPressCallback
                public final void onReportPressed() {
                    if (C11199a.m19850a(AbstractC7703a.this.f19145h)) {
                        if (AbstractC7703a.this.f19146i != null && AbstractC7703a.this.getContext() != null && AbstractC7703a.this.f19159v != null && AbstractC7703a.this.f19159v.f28233c.f28360p != null) {
                            ((AbstractC11616a) C6193a.m13435a(AbstractC11616a.class)).mo18411a(AbstractC7703a.this.getContext(), AbstractC7703a.this.f19159v.f28233c.f28360p, AbstractC7703a.this.f19146i.getId());
                        }
                    } else if (AbstractC7703a.this.f19146i != null && AbstractC7703a.this.getContext() != null) {
                        C11115u.m19743a().mo17915b().mo13147a();
                        C11838d dVar = new C11838d(AbstractC7703a.this.f19146i.getId(), AbstractC7703a.this.f19146i.getOwner().getId(), AbstractC7703a.this.f19146i.getOwner().getId(), AbstractC7703a.this.f19146i.getOwner().getSecUid(), "long_press", C6544e.m13987a(), C6544e.m13990d(), C6544e.m13991e(), "report_anchor", AbstractC7703a.this.f19146i.getRequestId());
                        dVar.f28220s = ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getReportScene();
                        ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).report(AbstractC7703a.this.getContext(), dVar);
                    }
                }
            }, new AbstractC11665b() {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a.C77085 */

                static {
                    Covode.recordClassIndex(8503);
                }

                @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
                /* renamed from: a */
                public final void mo8904a(Throwable th) {
                }

                @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
                /* renamed from: a */
                public final void mo8903a(String str, String str2, Bundle bundle) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.ek1);
                    Room room = AbstractC7703a.this.f19146i;
                    DataChannel dataChannel = AbstractC7703a.this.f19145h;
                    AbstractC7703a aVar = AbstractC7703a.this;
                    C6112e.m13331a(room, dataChannel, aVar, str2, aVar.f19146i.getLabels(), bundle);
                    HashMap hashMap = new HashMap();
                    if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isRoomInBattle()) {
                        hashMap.put("connection_type", "manual_pk");
                        hashMap.put("pk_id", String.valueOf(((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getBattleId()));
                    }
                    C6112e.m13333a(AbstractC7703a.this.f19146i, AbstractC7703a.this.f19145h, str, str2, bundle, a2.f27795B, hashMap);
                    C6112e.m13332a(AbstractC7703a.this.f19146i, AbstractC7703a.this.f19145h, str);
                }
            });
        }
        return C89391z.f203057a;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f19115O.mo13859a();
        C7500q qVar = this.f19118R;
        if (qVar != null) {
            qVar.mo8577b();
        }
        AbstractC11888a aVar = this.f19117Q;
        if (aVar != null) {
            aVar.mo12735b();
        }
        this.f19124X.mo11992a();
        this.f19124X = null;
        IMessageManager iMessageManager = ((IMessageService) C6193a.m13435a(IMessageService.class)).get();
        if (iMessageManager != null) {
            iMessageManager.stopMessage(false);
        }
        m15694b(false);
        EnumC7303c.INSTANCE.stop();
        this.f19141d.mo142944a();
        this.f19150m.unload(this.f19152o);
        LiveWidgetProvider.getInstance().clearWidgetCache(((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getPublicScreenWidgetClass(mo13957h()));
        C7487k kVar = this.f19121U;
        if (kVar != null) {
            kVar.mo13727a();
        }
        AbstractC88412b bVar = this.f19102B;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f19109I.send();
        DataChannelGlobal.f42558d.mo28326b(this);
        super.onDestroyView();
        this.f19108H.mo18160a();
        this.f19122V = null;
        ((AbstractC4318a) C6193a.m13435a(AbstractC4318a.class)).leave(this.f19145h, this.f19146i);
        ((AbstractC2951c) C6193a.m13435a(AbstractC2951c.class)).leave(this.f19145h, this.f19146i);
        DialogInterface dialogInterface = this.f19125Y;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13953c() {
        Room room;
        if (!(this.f19122V == null || getView() == null)) {
            getView().post(this.f19122V);
            this.f19122V = null;
        }
        IMessageManager iMessageManager = ((IMessageService) C6193a.m13435a(IMessageService.class)).get();
        if (iMessageManager != null) {
            iMessageManager.startMessage();
        }
        this.f19142e = new C11429j(getContext(), new C7634c(this, this.f19145h, this.f19147j, new C7718ae(this), new C7719af(this), new C7720ag(this), null, null)) {
            /* class com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a.C77052 */

            /* renamed from: b */
            private float f19166b;

            /* renamed from: c */
            private float f19167c;

            static {
                Covode.recordClassIndex(8500);
            }

            @Override // com.bytedance.android.livesdk.widget.C11429j
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent != null) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (motionEvent.getAction() == 0) {
                        this.f19167c = x;
                        this.f19166b = y;
                    }
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        if (this.f19159v != null && (room = this.f19146i) != null && !room.isStar() && ((this.f19146i.isThirdParty || this.f19146i.isScreenshot) && this.f19146i.mRoomAuthStatus != null && this.f19146i.mRoomAuthStatus.isEnableLandscape())) {
            this.f19143f = new ScaleGestureDetector(getContext(), new C7889dc(mo13957h()));
        }
        this.f19108H.mo18161a(new View$OnTouchListenerC7721ah(this));
        this.f19117Q = ((IMessageService) C6193a.m13435a(IMessageService.class)).configInteractionMessageHelper(this, this.f19145h, this.f19149l, this.f19111K, null, new C7886d(this), new C7940e(this), new C7941f(this));
        C7500q qVar = new C7500q(this.f19145h);
        this.f19118R = qVar;
        qVar.mo10297a(this);
        EnumC7303c.INSTANCE.start(this);
        C4017b.m9801c(C4017b.EnumC4018a.ShowBInteractionFirstWidget);
        Room room2 = this.f19146i;
        if (room2 != null && room2.getStatus() == 3) {
            C9883n a = C7302b.m15207a(this.f19146i.getId());
            if (iMessageManager != null) {
                iMessageManager.insertMessage(a, true);
            }
        }
        ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).configUserHelper(this, this.f19145h, this.f19141d).mo11967a();
        C7487k kVar = new C7487k(this.f19145h);
        this.f19121U = kVar;
        kVar.mo13728a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo13962m() {
        Room room = this.f19146i;
        if (room != null) {
            if (!room.isOfficial()) {
                AbstractC4367a aVar = (AbstractC4367a) C6193a.m13435a(AbstractC4367a.class);
                if (aVar == null || !aVar.isMicRoomForRoom(this.f19146i)) {
                    this.f19131ad = this.f19150m.load(((AbstractC4367a) C6193a.m13435a(AbstractC4367a.class)).getMicRoomAudienceEnterWidget());
                } else {
                    this.f19130ac = this.f19150m.load(((AbstractC4367a) C6193a.m13435a(AbstractC4367a.class)).getMicRoomAudienceExitWidget());
                }
            }
            C6555i.m14021b();
            C6555i.m9463b("ttlive_comment", "CommentWidget is load.");
            this.f19145h.mo28320c(C5784p.class, true);
            LiveWidget giftWidget = ((IGiftService) C6193a.m13435a(IGiftService.class)).getGiftWidget();
            this.f19151n = giftWidget;
            if ((giftWidget instanceof AbstractC8855s) && mo13954d() != null) {
                mo13954d();
                ((AbstractC8855s) this.f19151n).mo15096a();
                ((AbstractC8855s) this.f19151n).mo15099a(this.f19150m);
                ((AbstractC8855s) this.f19151n).mo15097a(mo13954d().f18141f);
            }
            LiveWidget liveWidget = this.f19151n;
            if (liveWidget instanceof AbstractC8855s) {
                ((AbstractC8855s) liveWidget).mo15098a(new C7961z(this));
            }
            if (LiveVideoGiftCoverPanelSetting.INSTANCE.getValue()) {
                this.f19150m.load(R.id.fbx, (Widget) this.f19151n, false);
            } else {
                this.f19150m.load(R.id.fby, (Widget) this.f19151n, false);
            }
            AbstractC2951c cVar = (AbstractC2951c) C6193a.m13435a(AbstractC2951c.class);
            if (cVar.shouldShowBanner(this.f19146i.getId())) {
                m15693b(cVar);
            }
            cVar.addOnBannerVisibilityChangeListener(this.f19146i.getId(), new C7714aa(this, cVar));
            this.f19134ag = this.f19150m.load(R.id.bbb, ((AbstractC4318a) C6193a.m13435a(AbstractC4318a.class)).getLiveRoomNotifyWidget());
            if (mo13957h()) {
                this.f19154q = this.f19150m.load(R.id.dmv, ((AbstractC3807b) C6193a.m13435a(AbstractC3807b.class)).getDonationStickerAnchorWidget());
                this.f19135ah = this.f19150m.load(R.id.v6, ((ISlotService) C6193a.m13435a(ISlotService.class)).getFrameL3SlotWidget());
            }
            this.f19150m.load(R.id.ecc, ((AbstractC10787a) C6193a.m13435a(AbstractC10787a.class)).getSurveyCardWidget());
            this.f19150m.load(((AbstractC10787a) C6193a.m13435a(AbstractC10787a.class)).getSurveyControlWidget());
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onResume() {
        DataChannel dataChannel;
        Room room;
        super.onResume();
        EnterRoomConfig enterRoomConfig = this.f19159v;
        if (enterRoomConfig != null && !this.f19110J && enterRoomConfig.f28233c.f28325af.f28388a > 0) {
            this.f19110J = true;
            long currentTimeMillis = System.currentTimeMillis() - this.f19159v.f28233c.f28325af.f28388a;
            HashMap hashMap = new HashMap();
            hashMap.put("duration", String.valueOf(currentTimeMillis));
            hashMap.put("room_type", LivePerformanceManager.getInstance().getRoomType(EnumC11728i.valueOf(this.f19159v.f28231a.f28383j)));
            hashMap.put("is_anchor", "0");
            C6501b.C6502a.m13948a("livesdk_interaction_load_duration").mo12652a((Map<String, String>) hashMap).mo12643a(this.f19145h).mo12655b();
        }
        ActivityC0945e activity = getActivity();
        if (Build.VERSION.SDK_INT >= 26 && activity != null && activity.getRequestedOrientation() == 1) {
            C6682a.f16578a = C11224am.m19877a(activity);
        }
        C6682a.m14198b(getContext());
        C6684c a = C6684c.C6686b.m14211a();
        C6805b<Boolean> bVar = AbstractC6804a.f17044cr;
        C89219l.m154716b(bVar, "");
        if (!bVar.mo13066a().booleanValue() && a.f16583a) {
            C6805b<Boolean> bVar2 = AbstractC6804a.f17043cq;
            C89219l.m154716b(bVar2, "");
            if (!bVar2.mo13066a().booleanValue() && MtPipWatchLiveEnableSetting.INSTANCE.getValue() && !C6682a.f16579b && C6682a.m14197b() && (dataChannel = this.f19145h) != null && ((Boolean) dataChannel.mo28318b(C6885av.class)).booleanValue() && (room = this.f19146i) != null && room.getOwner() != null && this.f19146i.getOwner().getSecret() != 1) {
                this.f19127a.post(new RunnableC7952q(this));
            }
        }
        if (C6682a.m14195a()) {
            this.f19127a.post(new RunnableC7953r(this));
            if (!C13603b.m24435a((Collection) this.f19146i.getStickerList())) {
                this.f19127a.post(new RunnableC7954s(this));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo13959j() {
        boolean z;
        boolean z2;
        ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).configInteractionHelper(this, this.f19145h, this.f19108H);
        this.f19150m.load(R.id.f_r, ((AbstractC6093a) C6193a.m13435a(AbstractC6093a.class)).getGeneralUserInfoWidget());
        boolean booleanValue = ((Boolean) this.f19145h.mo28318b(C9036bc.class)).booleanValue();
        boolean equals = Boolean.TRUE.equals(this.f19145h.mo28318b(C9114dz.class));
        if (!booleanValue || mo13954d() == null) {
            this.f19132ae = this.f19150m.load(R.id.a9r, ((AbstractC4317f) C6193a.m13435a(AbstractC4317f.class)).getCommentWidget());
        } else {
            this.f19132ae = this.f19150m.load(mo13954d().f18140e, ((AbstractC4317f) C6193a.m13435a(AbstractC4317f.class)).getCommentWidget());
        }
        if (getContext() != null) {
            if (C5762c.m12633b(this.f19145h)) {
                EnumC5847l.QUESTION.load(this.f19145h, ((AbstractC5760a) C6193a.m13435a(AbstractC5760a.class)).getToolbarBehavior(getContext()));
                if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1) {
                    EnumC5847l.QUESTION.setEnableClick(this.f19145h, false);
                }
            }
            if (mo13957h()) {
                EnumC5847l.SHARE.load(this.f19145h, ((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).getShareBehavior(getActivity(), getContext(), this.f19144g, this));
            }
            Room room = this.f19146i;
            if (room == null || room.getRoomAuthStatus() == null || !this.f19146i.getRoomAuthStatus().isEnableGift()) {
                z = false;
            } else {
                z = true;
            }
            if (((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter() == null || ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12373b() <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            C8789a.EnumC8790a a = C8789a.m17098a(false, z2, z);
            if (a == C8789a.EnumC8790a.GREY) {
                ((IGiftService) C6193a.m13435a(IGiftService.class)).loadBehavior(getContext(), this.f19145h, EnumC5847l.DUMMY_GIFT.ordinal());
                if (!LiveFastGiftIconHideSetting.INSTANCE.getValue()) {
                    ((IGiftService) C6193a.m13435a(IGiftService.class)).loadBehavior(getContext(), this.f19145h, EnumC5847l.DUMMY_FAST_GIFT.ordinal());
                }
            } else if (a == C8789a.EnumC8790a.SHOW) {
                ((IGiftService) C6193a.m13435a(IGiftService.class)).loadBehavior(getContext(), this.f19145h, EnumC5847l.GIFT.ordinal());
                if (!LiveFastGiftIconHideSetting.INSTANCE.getValue()) {
                    ((IGiftService) C6193a.m13435a(IGiftService.class)).loadBehavior(getContext(), this.f19145h, EnumC5847l.FAST_GIFT.ordinal());
                }
            }
            this.f19145h.mo28309a((AbstractC1204m) this, C9131m.class, (AbstractC89172b) new C7958w(this));
            this.f19145h.mo28309a((AbstractC1204m) this, C4347h.class, (AbstractC89172b) new C7959x(this));
        }
        if (equals && getView() != null) {
            View findViewById = getView().findViewById(R.id.ek7);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            marginLayoutParams.bottomMargin = C3966y.m9653a(12.0f);
            findViewById.setLayoutParams(marginLayoutParams);
        }
        this.f19150m.load(R.id.ek7, (Class) ((AbstractC5843h) C6193a.m13435a(AbstractC5843h.class)).audienceToolbarWidget(), false, new Object[]{C7628a.m15642a(this.f19145h, getContext())});
        this.f19106F = (ShapeControllableView) getView().findViewById(R.id.dab);
        if (getView() != null && mo13957h()) {
            this.f19106F.setVisibility(0);
            if (this.f19106F.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                this.f19106F.getLayoutParams().height = C3966y.m9653a(272.0f);
            }
            if (equals) {
                this.f19106F.setGradientColors(new int[]{Color.argb(0, 0, 0, 0), Color.argb(128, 0, 0, 0)});
                this.f19106F.setGradientPositions(new float[]{0.0f, 1.0f});
                this.f19106F.setGradientOrientation(1);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo13961l() {
        boolean z;
        Boolean bool;
        boolean z2;
        AbstractC9168b likeHelper;
        EnumC9541ay ayVar;
        RoomAuthStatus roomAuthStatus;
        RoomAuthOffReasons roomAuthOffReasons;
        RoomAuthStatus roomAuthStatus2;
        Room room = (Room) this.f19145h.mo28318b(C9093de.class);
        this.f19146i = room;
        if (room != null) {
            ((AbstractC4318a) C6193a.m13435a(AbstractC4318a.class)).enter(this.f19145h, this.f19146i);
            ((AbstractC2951c) C6193a.m13435a(AbstractC2951c.class)).enter(this.f19145h, this.f19146i);
            this.f19150m.load(new UserPermissionCheckWidget());
            EnumC5847l.AUDIENCE_SLOT.load(this.f19145h, new C8007b(getContext(), this));
            Room room2 = this.f19146i;
            DataChannel dataChannel = this.f19145h;
            if (room2 == null || (roomAuthStatus2 = room2.getRoomAuthStatus()) == null || !roomAuthStatus2.isEnableGift()) {
                z = false;
            } else {
                z = true;
            }
            if (dataChannel != null) {
                bool = (Boolean) dataChannel.mo28318b(C9119ed.class);
            } else {
                bool = null;
            }
            boolean a = C11279p.m20012a(bool);
            AbstractC6332d walletCenter = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter();
            C89219l.m154716b(walletCenter, "");
            if (walletCenter.mo12373b() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C8789a.EnumC8790a a2 = C8789a.m17098a(false, z2, z);
            String str = "anchor";
            if (a2 == C8789a.EnumC8790a.GREY) {
                IGiftService iGiftService = (IGiftService) C6193a.m13435a(IGiftService.class);
                if (room2 == null || (roomAuthStatus = room2.getRoomAuthStatus()) == null || (roomAuthOffReasons = roomAuthStatus.getRoomAuthOffReasons()) == null || (ayVar = roomAuthOffReasons.getUnAvailableClickReason()) == null) {
                    ayVar = EnumC9541ay.UNKNOWN;
                }
                if (!a) {
                    str = "user";
                }
                iGiftService.monitorGiftIconShow(false, ayVar, str, "icon");
            } else if (a2 == C8789a.EnumC8790a.SHOW) {
                IGiftService iGiftService2 = (IGiftService) C6193a.m13435a(IGiftService.class);
                EnumC9541ay ayVar2 = EnumC9541ay.UNKNOWN;
                if (!a) {
                    str = "user";
                }
                iGiftService2.monitorGiftIconShow(true, ayVar2, str, "icon");
            }
            this.f19145h.mo28311a(C9096dh.class, Long.valueOf(this.f19146i.getId()));
            C6160ac.f15387b.mo12081a();
            C6160ac.f15386a = this.f19146i.getId();
            Room room3 = this.f19146i;
            if (room3 != null && room3.getMosaicStatus() == 1) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gpe);
            }
            if (C5762c.m12633b(this.f19145h) && EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1) {
                EnumC5847l.QUESTION.setEnableClick(this.f19145h, true);
            }
            if (this.f19146i.getRoomAuthStatus() == null || this.f19146i.getRoomAuthStatus().isMessageEnable()) {
                this.f19145h.mo28311a(C9007aa.class, (Object) true);
            }
            if (Boolean.TRUE.equals(this.f19145h.mo28318b(C9114dz.class)) && getView() != null) {
                View findViewById = getView().findViewById(R.id.uv);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
                marginLayoutParams.bottomMargin = C3966y.m9653a(12.0f);
                marginLayoutParams.leftMargin = C3966y.m9653a(8.0f);
                marginLayoutParams.rightMargin = C3966y.m9653a(-4.0f);
                findViewById.setLayoutParams(marginLayoutParams);
            }
            this.f19126Z = this.f19150m.load(R.id.uv, ((ISlotService) C6193a.m13435a(ISlotService.class)).getBottomLeftSlotWidget());
            boolean booleanValue = ((Boolean) this.f19145h.mo28318b(C9036bc.class)).booleanValue();
            if (!TestDisableCommentAreaSetting.INSTANCE.getValue()) {
                Class<? extends LiveRecyclableWidget> publicScreenWidgetClass = ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getPublicScreenWidgetClass(mo13957h());
                if (!booleanValue || mo13954d() == null) {
                    this.f19152o = this.f19150m.load(R.id.cjn, publicScreenWidgetClass);
                } else {
                    this.f19152o = this.f19150m.load(mo13954d().f18139d, publicScreenWidgetClass);
                }
            }
            if (this.f19146i != null && (likeHelper = ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getLikeHelper(this.f19146i.getId())) != null && likeHelper.mo15295n()) {
                if (likeHelper.mo15293l()) {
                    this.f19128aa = this.f19150m.load(R.id.dv2, ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getSelfLikeWidgetClass(likeHelper));
                    this.f19129ab = this.f19150m.load(R.id.c8u, ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getLikeUserInfoAnimWidgetClass(likeHelper));
                }
                if (likeHelper.mo15294m()) {
                    this.f19156s = this.f19150m.load(R.id.cxz, ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getOthersLikeWidgetClass(likeHelper));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo13940a(Boolean bool) {
        RecyclableWidgetManager recyclableWidgetManager = this.f19150m;
        if (recyclableWidgetManager != null) {
            recyclableWidgetManager.onVisibility(bool.booleanValue());
        }
        return C89391z.f203057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ C89391z mo13951b(Boolean bool) {
        mo13946a(bool.booleanValue());
        return C89391z.f203057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo13936a(float f) {
        this.f19147j.setTranslationY(f);
        if (mo13950b() != null) {
            mo13950b().setTranslationY(f);
        }
        return C89391z.f203057a;
    }

    /* renamed from: b */
    public final void mo13952b(Runnable runnable) {
        if (this.f19148k != null) {
            this.f19122V = null;
            runnable.run();
            return;
        }
        this.f19122V = runnable;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (isViewValid()) {
            if (message.obj instanceof C2912a) {
                this.f19145h.mo28320c(C9085cx.class, message.obj);
            } else if (message.obj instanceof Exception) {
                C3854a.m9453a(3, "AbsInteractionFragment", "unknown exception " + ((Exception) message.obj).toString());
            }
        }
    }

    /* renamed from: b */
    private void m15693b(AbstractC2951c cVar) {
        if (this.f19161x == null) {
            this.f19161x = this.f19150m.load(R.id.cjw, cVar.getActivityTopRightBannerWidget());
        }
        if (mo13957h() && this.f19119S == null) {
            this.f19119S = this.f19150m.load(R.id.v5, cVar.getBottomRightBannerWidget(), C6203g.m13464a());
        }
        if (mo13957h() && this.f19120T == null) {
            this.f19120T = this.f19150m.load(R.id.elv, ((AbstractC2951c) C6193a.m13435a(AbstractC2951c.class)).getTopRightBannerWidget(), C6203g.m13464a());
        }
        cVar.fetchBanner(this, this.f19146i.getId(), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo13937a(C7380am amVar) {
        if (isViewValid() && getView() != null) {
            if (mo13957h()) {
                mo13956g();
            }
            if (amVar.mo13610a() && getActivity() != null && getActivity().getRequestedOrientation() == 1) {
                if (this.f19116P == null) {
                    this.f19116P = new C7638e(getView().findViewById(R.id.dh4));
                }
                this.f19116P.mo13856a();
            }
        }
        return C89391z.f203057a;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(null);
        if (mo13957h()) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        C6538d.m13980b(str);
        C4386c.m10499a().mo10159a((Integer) 0);
        if (this.f19144g == null) {
            this.f19144g = EnumC11728i.VIDEO;
        }
        mo14054e();
        DataChannel dataChannel = this.f19145h;
        if (dataChannel != null) {
            dataChannel.mo28315b(C11752b.class, this.f19140c);
        }
        C11200a.m19852a(getContext());
        if (getActivity() != null && !getActivity().isFinishing()) {
            AbstractC10336c rankOptOutPresenter = ((AbstractC10339d) C6193a.m13435a(AbstractC10339d.class)).getRankOptOutPresenter();
            this.f19136ai = rankOptOutPresenter;
            if (rankOptOutPresenter != null) {
                rankOptOutPresenter.mo17116a((AbstractC0952i) this.f19145h.mo28318b(C9021ao.class));
                this.f19136ai.mo17114a();
            }
        }
    }

    /* renamed from: b */
    private void m15694b(boolean z) {
        if (!z) {
            View$OnClickListenerC7911dn dnVar = this.f19162y;
            if (dnVar != null && dnVar.isShowing()) {
                this.f19162y.dismiss();
                C7565d a = C7565d.C7566a.m15554a();
                if (a == null) {
                    C89219l.m154715b();
                }
                a.mo13813a();
            }
            this.f19162y = null;
        } else if (isViewValid()) {
            View$OnClickListenerC7911dn dnVar2 = this.f19162y;
            if ((dnVar2 == null || !dnVar2.isShowing()) && !getActivity().isFinishing() && !((Boolean) this.f19145h.mo28318b(C9074cm.class)).booleanValue()) {
                if (this.f19162y == null) {
                    View$OnClickListenerC7911dn dnVar3 = new View$OnClickListenerC7911dn(getActivity(), mo13957h(), this.f19146i, this.f19140c);
                    this.f19162y = dnVar3;
                    dnVar3.setOnShowListener(new DialogInterface$OnShowListenerC7948m(this));
                    this.f19162y.setOnDismissListener(new DialogInterface$OnDismissListenerC7950o(this));
                }
                this.f19162y.f19674e = this.f19145h;
                C7565d a2 = C7565d.C7566a.m15554a();
                if (a2 == null) {
                    C89219l.m154715b();
                }
                a2.mo13814a(new AbstractC7561a() {
                    /* class com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a.C77063 */

                    static {
                        Covode.recordClassIndex(8501);
                    }

                    @Override // com.bytedance.android.livesdk.chatroom.p492g.p493a.AbstractC7563b
                    /* renamed from: a */
                    public final void mo13812a() {
                        if (AbstractC7703a.this.f19162y != null) {
                            AbstractC7703a.this.f19162y.show();
                            if (AbstractC7703a.this.f19158u > 0) {
                                AbstractC7703a.this.f19127a.removeCallbacks(AbstractC7703a.this.f19107G);
                                AbstractC7703a.this.f19127a.postDelayed(AbstractC7703a.this.f19107G, AbstractC7703a.this.f19158u);
                                AbstractC7703a.this.f19158u = 0;
                            }
                            C6501b.C6502a.m13948a("follow_popup_show").mo12643a(AbstractC7703a.this.f19145h).mo12655b();
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo13938a(C8448b bVar) {
        float f;
        User user = (User) this.f19145h.mo28318b(C9101dm.class);
        View view = EnumC5847l.QUESTION.getView(this.f19145h);
        if (view != null && isViewValid()) {
            if ((user == null || user.getUserAttr() == null || !user.getUserAttr().f23192b) && bVar.f20888a && this.f19146i.questionVersion == 2) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
            view.setAlpha(f);
        }
        return C89391z.f203057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo13939a(C9688bt btVar) {
        if (this.f19123W == null) {
            this.f19123W = new CopyrightViolationHelper(this);
        }
        this.f19123W.mo9164a(getContext(), btVar, this.f19146i, this.f19141d);
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = getView();
        if (view != null) {
            this.f19139b = view;
            this.f19145h.mo28312a((Object) this, C9123eh.class, (AbstractC89172b) new C7942g(this)).mo28313b((AbstractC1204m) this, C5766ab.class, (AbstractC89172b) new C7943h(this)).mo28309a((AbstractC1204m) this, C9028av.class, (AbstractC89172b) new C7944i(this));
            DataChannelGlobal.f42558d.mo28323a(this, C9069ch.class, new C7945j(this));
            this.f19148k = C8780f.m17080a(this, view, bundle);
            this.f19145h.mo28320c(C4328d.class, false);
            C6555i.m14021b();
            C6555i.m9463b("ttlive_room", "prepare load widget, first anyway");
            this.f19145h.mo28311a(C9053bs.class, C6544e.m13989c());
            RecyclableWidgetManager of = RecyclableWidgetManager.m33063of((Fragment) this, this.f19139b, false, (IWidgetProvider) LiveWidgetProvider.getInstance(), (FluencyOpt) C6204h.f15480c, C6204h.m13485e());
            this.f19150m = of;
            of.mWidgetCreateTimeListener = this.f19109I;
            this.f19145h.mo28315b(C9128j.class, Long.valueOf(System.currentTimeMillis()));
            if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() != 1 || ((TextUtils.isEmpty(this.f19159v.f28233c.f28310a) && (this.f19146i == null || this.f19159v.f28233c.f28296M != "draw")) || !mo13957h() || this.f19133af)) {
                AbstractC11379a aVar = this.f19103C;
                aVar.mo13979d();
                aVar.mo13978c();
                aVar.mo13977b();
                aVar.mo13980e();
                mo13941a(this.f19139b, bundle);
            } else {
                C3854a.m9453a(4, "WidgetLoadState", "widget state loadWidgetP0Runnable call");
                this.f19104D.f27340a.mo13070a(C11381c.AbstractC11382a.C11387e.f27346a);
                this.f19105E = true;
            }
            if (C11199a.m19850a(this.f19145h)) {
                ((AbstractC11181z) AbstractC88979t.m154310b(this).mo143295e(60000, TimeUnit.MILLISECONDS).mo143271a(new C11191f()).mo143274a(C11152e.m19789a((Fragment) this))).mo17950a(C7946k.f19766a, C11195i.f26823a);
            }
            this.f19145h.mo28313b((AbstractC1204m) this, C9057bw.class, (AbstractC89172b) new C7947l(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo13942a(AbstractC2951c cVar) {
        if (cVar.shouldShowBanner(this.f19146i.getId())) {
            m15693b(cVar);
            return;
        }
        this.f19150m.unload(this.f19161x);
        this.f19150m.unload(this.f19119S);
        this.f19150m.unload(this.f19120T);
        this.f19161x = null;
        this.f19119S = null;
        this.f19120T = null;
    }

    @Override // com.bytedance.android.livesdk.chatroom.view.AbstractC7962a
    /* renamed from: a */
    public final void mo13943a(C9883n nVar) {
        if (isViewValid()) {
            int i = nVar.f23882a;
            if (3 == i) {
                C6779a.m14563a().mo13053a(new C7400q(10010, (byte) 0));
            } else if (4 == i) {
                C7400q qVar = new C7400q(7);
                qVar.f18337d = nVar;
                C6779a.m14563a().mo13053a(qVar);
                if (!C13627m.m24498a(nVar.f23883f)) {
                    C11226ao.m19883a(C3966y.m9669e(), nVar.f23883f, 0);
                }
                JSONObject jSONObject = new JSONObject();
                C3866a.m9474a(jSONObject, "error_code", 0L);
                C3866a.m9475a(jSONObject, "error_msg", nVar.f23883f);
                C3868c.m9492a("ttlive_anchor_close_room", 0, jSONObject);
            } else if (1 == i) {
                if (!this.f19146i.isThirdParty) {
                    this.f19157t = true;
                    AbstractC5788t tVar = this.f19149l;
                    if (tVar != null) {
                        tVar.mo11563a(3);
                    }
                    if (this.f19111K.getVisibility() == 8) {
                        if (!LivePauseLiveSetting.INSTANCE.pauseLiveEnabled()) {
                            if (!((Boolean) this.f19145h.mo28318b(C4446p.class)).booleanValue()) {
                                C6779a.m14563a().mo13053a(new C7400q(30));
                            }
                            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gpe);
                        } else if (!((Boolean) this.f19145h.mo28318b(C4446p.class)).booleanValue()) {
                            C6779a.m14563a().mo13053a(new C7400q(30));
                        } else {
                            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gpd);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        C3866a.m9474a(jSONObject2, "error_code", 0L);
                        C3866a.m9475a(jSONObject2, "error_msg", "action_pause");
                        C3868c.m9492a("ttlive_control_message_status", 0, jSONObject2);
                    }
                }
            } else if (2 == i) {
                this.f19157t = false;
                AbstractC5788t tVar2 = this.f19149l;
                if (tVar2 != null) {
                    tVar2.mo11563a(2);
                }
                if (this.f19146i.getMosaicStatus() == 0) {
                    C6779a.m14563a().mo13053a(new C7400q(31));
                    JSONObject jSONObject3 = new JSONObject();
                    C3866a.m9474a(jSONObject3, "error_code", 0L);
                    C3866a.m9475a(jSONObject3, "error_msg", "action_resume");
                    C3868c.m9492a("ttlive_control_message_status", 0, jSONObject3);
                    if (!LivePauseLiveSetting.INSTANCE.pauseLiveEnabled()) {
                        C11226ao.m19882a(getActivity(), (int) R.string.gr5);
                    }
                    C6779a.m14563a().mo13053a(new C7400q(31));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13944a(EnterRoomConfig enterRoomConfig, boolean z) {
        this.f19159v = enterRoomConfig;
        this.f19133af = z;
    }

    /* renamed from: a */
    private void mo14192a(int i, int i2) {
        if (getView().findViewById(i) != null) {
            getView().findViewById(i).setVisibility(i2);
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setFitsSystemWindows(true);
        this.f19108H = (GestureDetectLayout) view.findViewById(R.id.cz7);
        this.f19147j = view.findViewById(R.id.bpe);
        this.f19160w = view.findViewById(R.id.cxz);
        this.f19111K = (TextView) view.findViewById(R.id.cba);
        C6203g.m13462a(new RunnableC7949n(this));
        this.f19112L = new C7640f(this, this.f19145h);
        ((IWalletService) C6193a.m13435a(IWalletService.class)).configPackagePurchaseHelper(this, this.f19145h, this);
        this.f19113M = new C7643g(this, this.f19145h);
        ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).configWebDialogHelper(this, this.f19145h, mo13957h(), this);
        this.f19114N = new C7629b(this, this.f19145h, view.findViewById(R.id.bpg), mo13954d(), new C7960y(this));
        this.f19115O = new C7646h(this, this.f19145h);
        this.f19145h.mo28309a((AbstractC1204m) this, C4336l.class, (AbstractC89172b) new C7716ac(this)).mo28309a((AbstractC1204m) this, C9111dw.class, (AbstractC89172b) new C7717ad(this));
        if (this.f19124X == null) {
            this.f19124X = ((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).provideShareCountManager();
            int i = 0;
            Room room = this.f19146i;
            if (!(room == null || room.getStats() == null)) {
                i = this.f19146i.getStats().getShareCount();
            }
            this.f19124X.mo11993a(this.f19145h, ((IMessageService) C6193a.m13435a(IMessageService.class)).get(), i);
        }
    }
}
