package com.bytedance.android.livesdk.chatroom.p499ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.AbstractC4317f;
import com.bytedance.android.live.banner.AbstractC2951c;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.model.C3069b;
import com.bytedance.android.live.broadcast.api.p187e.AbstractC3063c;
import com.bytedance.android.live.broadcast.p198g.C3238a;
import com.bytedance.android.live.broadcast.utils.C3737o;
import com.bytedance.android.live.broadcast.widget.PauseLiveWidget;
import com.bytedance.android.live.copyrightreview.helper.CopyrightViolationHelper;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3958s;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.performance.C4017b;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.shapecontrol.ShapeControllableView;
import com.bytedance.android.live.gift.C4328d;
import com.bytedance.android.live.gift.C4339o;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p209c.AbstractC3807b;
import com.bytedance.android.live.p247f.AbstractC4318a;
import com.bytedance.android.live.p249h.AbstractC4349b;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p378m.AbstractC5760a;
import com.bytedance.android.live.p379n.AbstractC5775h;
import com.bytedance.android.live.p379n.AbstractC5788t;
import com.bytedance.android.live.p379n.AbstractC5790v;
import com.bytedance.android.live.p379n.C5766ab;
import com.bytedance.android.live.p379n.C5784p;
import com.bytedance.android.live.p385p.AbstractC5843h;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p385p.EnumC5854q;
import com.bytedance.android.live.p403q.AbstractC6091a;
import com.bytedance.android.live.p404r.AbstractC6093a;
import com.bytedance.android.live.p405s.AbstractC6102d;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.live.share.AbstractC6108b;
import com.bytedance.android.live.share.AbstractC6109c;
import com.bytedance.android.live.share.C6112e;
import com.bytedance.android.live.share.ShareApi;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.AbstractC10073p;
import com.bytedance.android.livesdk.chatroom.interaction.C7629b;
import com.bytedance.android.livesdk.chatroom.interaction.C7634c;
import com.bytedance.android.livesdk.chatroom.interaction.C7638e;
import com.bytedance.android.livesdk.chatroom.interaction.C7640f;
import com.bytedance.android.livesdk.chatroom.interaction.C7643g;
import com.bytedance.android.livesdk.chatroom.interaction.C7646h;
import com.bytedance.android.livesdk.chatroom.model.C7655b;
import com.bytedance.android.livesdk.chatroom.p481b.EnumC7303c;
import com.bytedance.android.livesdk.chatroom.p488c.C7378ak;
import com.bytedance.android.livesdk.chatroom.p488c.C7380am;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
import com.bytedance.android.livesdk.chatroom.p490e.C7487k;
import com.bytedance.android.livesdk.chatroom.p490e.C7500q;
import com.bytedance.android.livesdk.chatroom.p492g.p493a.C7565d;
import com.bytedance.android.livesdk.chatroom.view.AbstractC7962a;
import com.bytedance.android.livesdk.chatroom.viewmodule.EndWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8006a;
import com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8020e;
import com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8024f;
import com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8035i;
import com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8036j;
import com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8041k;
import com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8042l;
import com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8043m;
import com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8047o;
import com.bytedance.android.livesdk.chatroom.widget.LiveCenterEntranceWidget;
import com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget;
import com.bytedance.android.livesdk.gift.model.AbstractC8854r;
import com.bytedance.android.livesdk.gift.model.AbstractC8855s;
import com.bytedance.android.livesdk.gift.p544b.C8789a;
import com.bytedance.android.livesdk.like.AbstractC9168b;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastLiveCenterSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.FrisbeeTaskIconShowSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHashTagAnchorShowEntrance;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePauseLiveSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveVideoGiftCoverPanelSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveWishlistPermissionSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.roomfunction.EnableAnchorLiveLongPressShareSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.PostponeRequestBatchShareListSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableCommentAreaSetting;
import com.bytedance.android.livesdk.lynx.lynxcard.AbstractC9368b;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdk.model.message.C9688bt;
import com.bytedance.android.livesdk.model.message.C9691bw;
import com.bytedance.android.livesdk.model.message.C9883n;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6538d;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p430ab.C6567a;
import com.bytedance.android.livesdk.p441ah.C6682a;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p542g.C8780f;
import com.bytedance.android.livesdk.p561j.C9007aa;
import com.bytedance.android.livesdk.p561j.C9018al;
import com.bytedance.android.livesdk.p561j.C9026at;
import com.bytedance.android.livesdk.p561j.C9027au;
import com.bytedance.android.livesdk.p561j.C9028av;
import com.bytedance.android.livesdk.p561j.C9030ax;
import com.bytedance.android.livesdk.p561j.C9034ba;
import com.bytedance.android.livesdk.p561j.C9036bc;
import com.bytedance.android.livesdk.p561j.C9039be;
import com.bytedance.android.livesdk.p561j.C9046bl;
import com.bytedance.android.livesdk.p561j.C9051bq;
import com.bytedance.android.livesdk.p561j.C9053bs;
import com.bytedance.android.livesdk.p561j.C9058bx;
import com.bytedance.android.livesdk.p561j.C9063cb;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9090db;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9096dh;
import com.bytedance.android.livesdk.p561j.C9098dj;
import com.bytedance.android.livesdk.p561j.C9111dw;
import com.bytedance.android.livesdk.p561j.C9113dy;
import com.bytedance.android.livesdk.p561j.C9114dz;
import com.bytedance.android.livesdk.p561j.C9118ec;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p561j.C9123eh;
import com.bytedance.android.livesdk.p561j.EnumC9050bp;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.rank.api.AbstractC10336c;
import com.bytedance.android.livesdk.rank.api.AbstractC10339d;
import com.bytedance.android.livesdk.rank.api.C10346j;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.android.livesdk.widget.C11429j;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.AbstractC11609b;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p677a.AbstractC11623a;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.p692h.C11777a;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.android.message.AbstractC11888a;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetContainer;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1114a.AbstractC16042a;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import com.bytedance.ies.sdk.widgets.IWidgetProvider;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.facebook.common.p1832d.C24085e;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.al */
public abstract class AbstractC7725al extends C10935a implements AbstractC5775h, AbstractC5790v, EnumC7303c.AbstractC7304a, AbstractC7962a, AbstractC11623a, AbstractC16042a {

    /* renamed from: m */
    public static final C7726a f19190m = new C7726a((byte) 0);

    /* renamed from: A */
    private AbstractC5788t f19191A;

    /* renamed from: B */
    private C8780f f19192B;

    /* renamed from: C */
    private Runnable f19193C;

    /* renamed from: D */
    private C7500q f19194D;

    /* renamed from: E */
    private C7487k f19195E;

    /* renamed from: F */
    private AbstractC11888a f19196F;

    /* renamed from: G */
    private C6567a f19197G;

    /* renamed from: H */
    private final AbstractC89244h f19198H = C89250i.m154773a((AbstractC89171a) C7739j.f19232a);

    /* renamed from: I */
    private AbstractC6108b f19199I;

    /* renamed from: J */
    private HashMap f19200J;

    /* renamed from: a */
    public NetSpeedMonitorWidget f19201a;

    /* renamed from: b */
    public LiveCenterEntranceWidget f19202b;

    /* renamed from: c */
    public LiveWidget f19203c;

    /* renamed from: d */
    public LiveWidget f19204d;

    /* renamed from: e */
    public LiveWidget f19205e;

    /* renamed from: f */
    public final WidgetCreateTimeUtil f19206f = new WidgetCreateTimeUtil(null, 1, null);

    /* renamed from: g */
    public final C3238a f19207g = new C3238a();

    /* renamed from: h */
    final AbstractC89244h f19208h = C11831d.m20835a(new C7733h(this));

    /* renamed from: i */
    final AbstractC89244h f19209i = C11831d.m20835a(new C7738i(this));

    /* renamed from: j */
    protected Room f19210j;

    /* renamed from: k */
    protected DataChannel f19211k;

    /* renamed from: l */
    public DialogInterface f19212l;

    /* renamed from: n */
    private final AbstractC89244h f19213n = C11831d.m20835a(new C7740k(this));

    /* renamed from: o */
    private LiveWidget f19214o;

    /* renamed from: p */
    private LiveRecyclableWidget f19215p;

    /* renamed from: q */
    private LiveWidget f19216q;

    /* renamed from: r */
    private LiveWidget f19217r;

    /* renamed from: s */
    private LiveWidget f19218s;

    /* renamed from: t */
    private AbstractC6102d f19219t;

    /* renamed from: u */
    private C7629b f19220u;

    /* renamed from: v */
    private C7646h f19221v;

    /* renamed from: w */
    private C7640f f19222w;

    /* renamed from: x */
    private C7643g f19223x;

    /* renamed from: y */
    private final C88411a f19224y = new C88411a();

    /* renamed from: z */
    private final AbstractC89244h f19225z = C11831d.m20835a(new C7731f(this));

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$y */
    public final /* synthetic */ class C7757y implements AbstractC8854r {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f19251a;

        static {
            Covode.recordClassIndex(8552);
        }

        C7757y(AbstractC89171a aVar) {
            this.f19251a = aVar;
        }

        @Override // com.bytedance.android.livesdk.gift.model.AbstractC8854r
        /* renamed from: a */
        public final /* synthetic */ void mo14016a() {
            C89219l.m154716b(this.f19251a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(8520);
    }

    /* renamed from: c */
    private final AbstractC10336c mo11561c() {
        return (AbstractC10336c) this.f19198H.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo13997a(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: b */
    public View mo13999b(int i) {
        if (this.f19200J == null) {
            this.f19200J = new HashMap();
        }
        View view = (View) this.f19200J.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f19200J.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5790v
    /* renamed from: e */
    public final void mo11564e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final RecyclableWidgetManager mo14000f() {
        return (RecyclableWidgetManager) this.f19213n.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract EnumC11728i mo14002h();

    /* renamed from: k */
    public abstract Object[] mo14005k();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo14008n() {
        return false;
    }

    /* renamed from: o */
    public void mo14009o() {
        HashMap hashMap = this.f19200J;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$a */
    public static final class C7726a {
        static {
            Covode.recordClassIndex(8521);
        }

        private C7726a() {
        }

        public /* synthetic */ C7726a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$e */
    public static final /* synthetic */ class C7730e extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(8525);
        }

        C7730e(AbstractC7725al alVar) {
            super(0, alVar, AbstractC7725al.class, "loadFollowGuideWidget", "loadFollowGuideWidget()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5775h
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Fragment mo11520b() {
        return this;
    }

    /* renamed from: a */
    public final boolean mo13998a(MotionEvent motionEvent, MotionEvent motionEvent2, float f) {
        boolean z = false;
        if (!BroadcastLiveCenterSetting.INSTANCE.enable() && !C11729j.m20686c(mo14002h()) && motionEvent != null && motionEvent2 != null) {
            float x = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(x) > 200.0f && Math.abs(f) > 100.0f) {
                z = true;
                C6779a.m14563a().mo13053a(new C3069b(x > 0.0f ? 1 : 2));
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$d */
    public static final class C7729d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C7729d f19227a = new C7729d();

        static {
            Covode.recordClassIndex(8524);
        }

        C7729d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return false;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$f */
    static final class C7731f extends AbstractC89220m implements AbstractC89171a<CopyrightViolationHelper> {

        /* renamed from: a */
        final /* synthetic */ AbstractC7725al f19228a;

        static {
            Covode.recordClassIndex(8526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7731f(AbstractC7725al alVar) {
            super(0);
            this.f19228a = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CopyrightViolationHelper invoke() {
            return new CopyrightViolationHelper(this.f19228a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$x */
    public static final /* synthetic */ class C7756x extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(8551);
        }

        C7756x(AbstractC7725al alVar) {
            super(0, alVar, AbstractC7725al.class, "changeTextMessageViewHeight", "changeTextMessageViewHeight()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((AbstractC7725al) this.receiver).mo14007m();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final Room mo14001g() {
        Room room = this.f19210j;
        if (room == null) {
            C89219l.m154710a("mRoom");
        }
        return room;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final DataChannel mo14003i() {
        DataChannel dataChannel = this.f19211k;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        return dataChannel;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$i */
    static final class C7738i extends AbstractC89220m implements AbstractC89171a<C7638e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC7725al f19231a;

        static {
            Covode.recordClassIndex(8533);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7738i(AbstractC7725al alVar) {
            super(0);
            this.f19231a = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C7638e invoke() {
            FrameLayout frameLayout = (FrameLayout) this.f19231a.mo13999b(R.id.dh4);
            C89219l.m154716b(frameLayout, "");
            return new C7638e(frameLayout);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$j */
    static final class C7739j extends AbstractC89220m implements AbstractC89171a<AbstractC10336c> {

        /* renamed from: a */
        public static final C7739j f19232a = new C7739j();

        static {
            Covode.recordClassIndex(8534);
        }

        C7739j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC10336c invoke() {
            AbstractC2953a a = C6193a.m13435a(AbstractC10339d.class);
            C89219l.m154716b(a, "");
            return ((AbstractC10339d) a).getRankOptOutPresenter();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$k */
    static final class C7740k extends AbstractC89220m implements AbstractC89171a<RecyclableWidgetManager> {

        /* renamed from: a */
        final /* synthetic */ AbstractC7725al f19233a;

        static {
            Covode.recordClassIndex(8535);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7740k(AbstractC7725al alVar) {
            super(0);
            this.f19233a = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecyclableWidgetManager invoke() {
            AbstractC7725al alVar = this.f19233a;
            RecyclableWidgetManager of = RecyclableWidgetManager.m33063of((Fragment) alVar, alVar.getView(), true, (IWidgetProvider) LiveWidgetProvider.Companion.getInstance(), (FluencyOpt) C6204h.f15480c, C6204h.m13485e());
            of.mWidgetCreateTimeListener = this.f19233a.f19206f;
            return of;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$t */
    public static final class RunnableC7752t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC7725al f19246a;

        static {
            Covode.recordClassIndex(8547);
        }

        RunnableC7752t(AbstractC7725al alVar) {
            this.f19246a = alVar;
        }

        public final void run() {
            this.f19246a.f19207g.mo8580a(this.f19246a.mo14001g().getId(), this.f19246a, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$r */
    public static final class RunnableC7749r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC7725al f19243a;

        /* renamed from: b */
        final /* synthetic */ View f19244b;

        static {
            Covode.recordClassIndex(8544);
        }

        RunnableC7749r(AbstractC7725al alVar, View view) {
            this.f19243a = alVar;
            this.f19244b = view;
        }

        public final void run() {
            this.f19243a.mo14003i().mo28311a(C9030ax.class, Integer.valueOf(this.f19244b.getHeight()));
            View view = this.f19244b;
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.android.livesdk.widget.GestureDetectLayout");
            ((GestureDetectLayout) view).setOnSizeChangedListener(new GestureDetectLayout.AbstractC11348a(this) {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al.RunnableC7749r.C77501 */

                /* renamed from: a */
                final /* synthetic */ RunnableC7749r f19245a;

                static {
                    Covode.recordClassIndex(8545);
                }

                {
                    this.f19245a = r1;
                }

                @Override // com.bytedance.android.livesdk.widget.GestureDetectLayout.AbstractC11348a
                /* renamed from: a */
                public final void mo14014a(int i, int i2) {
                    if (i != i2) {
                        this.f19245a.f19243a.mo14003i().mo28311a(C9030ax.class, Integer.valueOf(i));
                        this.f19245a.f19243a.mo14003i().mo28320c(C9063cb.class, Integer.valueOf(i));
                    }
                }
            });
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5775h
    /* renamed from: a */
    public final void mo11517a() {
        AbstractC3063c cVar;
        C7732g gVar = new C7732g(this);
        DataChannel dataChannel = this.f19211k;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        dataChannel.mo28319c(C9026at.class);
        C6567a aVar = this.f19197G;
        if (!(aVar == null || (cVar = aVar.f16438a) == null)) {
            cVar.mo8328e_();
        }
        AbstractC2953a a = C6193a.m13435a(AbstractC2928f.class);
        C89219l.m154716b(a, "");
        gVar.mo14011a(((AbstractC2928f) a).getWebDialogTag());
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

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$h */
    static final class C7733h extends AbstractC89220m implements AbstractC89171a<C11429j> {

        /* renamed from: a */
        final /* synthetic */ AbstractC7725al f19230a;

        static {
            Covode.recordClassIndex(8528);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7733h(AbstractC7725al alVar) {
            super(0);
            this.f19230a = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C11429j invoke() {
            Context context = this.f19230a.getContext();
            AbstractC7725al alVar = this.f19230a;
            DataChannel i = alVar.mo14003i();
            RelativeLayout relativeLayout = (RelativeLayout) this.f19230a.mo13999b(R.id.bpe);
            C89219l.m154716b(relativeLayout, "");
            return new C11429j(context, new C7634c(alVar, i, relativeLayout, new AbstractC89171a<C89391z>(this.f19230a) {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al.C7733h.C77341 */

                static {
                    Covode.recordClassIndex(8529);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    ((AbstractC7725al) this.receiver).mo14004j();
                    return C89391z.f203057a;
                }
            }, null, new AbstractC89188r<MotionEvent, MotionEvent, Float, Float, Boolean>(this.f19230a) {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al.C7733h.C77352 */

                static {
                    Covode.recordClassIndex(8530);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89188r
                /* renamed from: a */
                public final /* synthetic */ Boolean mo8774a(MotionEvent motionEvent, MotionEvent motionEvent2, Float f, Float f2) {
                    float floatValue = f.floatValue();
                    f2.floatValue();
                    return Boolean.valueOf(((AbstractC7725al) this.receiver).mo13998a(motionEvent, motionEvent2, floatValue));
                }
            }, new AbstractC89188r<MotionEvent, MotionEvent, Float, Float, Boolean>(this.f19230a) {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al.C7733h.C77363 */

                static {
                    Covode.recordClassIndex(8531);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89188r
                /* renamed from: a */
                public final /* synthetic */ Boolean mo8774a(MotionEvent motionEvent, MotionEvent motionEvent2, Float f, Float f2) {
                    f.floatValue();
                    f2.floatValue();
                    return false;
                }
            }, new AbstractC89172b<MotionEvent, Boolean>(this.f19230a) {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al.C7733h.C77374 */

                static {
                    Covode.recordClassIndex(8532);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ Boolean invoke(MotionEvent motionEvent) {
                    return Boolean.valueOf(((AbstractC7725al) this.receiver).mo14008n());
                }
            }));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$w */
    public static final class C7755w implements AbstractC2951c.AbstractC2952a {

        /* renamed from: a */
        final /* synthetic */ AbstractC2951c f19249a;

        /* renamed from: b */
        final /* synthetic */ AbstractC7725al f19250b;

        static {
            Covode.recordClassIndex(8550);
        }

        @Override // com.bytedance.android.live.banner.AbstractC2951c.AbstractC2952a
        /* renamed from: a */
        public final void mo7729a() {
            if (this.f19249a.shouldShowBanner(this.f19250b.mo14001g().getId())) {
                AbstractC7725al alVar = this.f19250b;
                AbstractC2951c cVar = this.f19249a;
                C89219l.m154716b(cVar, "");
                alVar.mo13995a(cVar);
                return;
            }
            this.f19250b.mo14000f().unload(this.f19250b.f19203c).unload(this.f19250b.f19205e).unload(this.f19250b.f19204d);
            this.f19250b.f19203c = null;
            this.f19250b.f19205e = null;
            this.f19250b.f19204d = null;
        }

        C7755w(AbstractC2951c cVar, AbstractC7725al alVar) {
            this.f19249a = cVar;
            this.f19250b = alVar;
        }
    }

    /* renamed from: j */
    public final void mo14004j() {
        DialogInterface dialogInterface = this.f19212l;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        C7747q qVar = new C7747q(this);
        C3238a aVar = this.f19207g;
        boolean z = true;
        if (!(!aVar.f9289a.isEmpty()) && !(!aVar.f9290b.isEmpty())) {
            z = false;
        }
        if (z) {
            qVar.mo8579a();
            C3238a aVar2 = this.f19207g;
            Room room = this.f19210j;
            if (room == null) {
                C89219l.m154710a("mRoom");
            }
            aVar2.mo8580a(room.getId(), this, null);
            return;
        }
        C3238a aVar3 = this.f19207g;
        Room room2 = this.f19210j;
        if (room2 == null) {
            C89219l.m154710a("mRoom");
        }
        aVar3.mo8580a(room2.getId(), this, qVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$q */
    public static final class C7747q implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ AbstractC7725al f19240a;

        static {
            Covode.recordClassIndex(8542);
        }

        C7747q(AbstractC7725al alVar) {
            this.f19240a = alVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            Context context = this.f19240a.getContext();
            if (context != null) {
                C11666c.C11667a a = C6112e.m13328a(this.f19240a.mo14001g(), this.f19240a.mo14003i(), C6112e.m13330a(this.f19240a.mo14001g().getOwner()), "live_room_long_press", null);
                a.f27844H = false;
                a.f27845I = false;
                if (EnableAnchorLiveLongPressShareSetting.INSTANCE.getValue() == 2) {
                    C24085e copyOf = C24085e.copyOf(this.f19240a.f19207g.f9289a);
                    C89219l.m154716b(copyOf, "");
                    if (copyOf != null && !copyOf.isEmpty()) {
                        a.f27846J.addAll(copyOf);
                    }
                    C24085e copyOf2 = C24085e.copyOf(this.f19240a.f19207g.f9290b);
                    C89219l.m154716b(copyOf2, "");
                    if (copyOf2 != null && !copyOf2.isEmpty()) {
                        a.f27847K.addAll(copyOf2);
                    }
                }
                a.f27850N = ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getReportScene();
                C11666c a2 = a.mo18437a();
                AbstractC7725al alVar = this.f19240a;
                C89219l.m154716b(context, "");
                Room g = this.f19240a.mo14001g();
                C89219l.m154716b(a2, "");
                alVar.f19212l = ((AbstractC4318a) C6193a.m13435a(AbstractC4318a.class)).onLongPress(context, true, g, a2, null, new C7748a(a2, this));
            }
        }

        /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$q$a */
        public static final class C7748a implements AbstractC11665b {

            /* renamed from: a */
            final /* synthetic */ C11666c f19241a;

            /* renamed from: b */
            final /* synthetic */ C7747q f19242b;

            static {
                Covode.recordClassIndex(8543);
            }

            @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
            /* renamed from: a */
            public final void mo8904a(Throwable th) {
            }

            C7748a(C11666c cVar, C7747q qVar) {
                this.f19241a = cVar;
                this.f19242b = qVar;
            }

            @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
            /* renamed from: a */
            public final void mo8903a(String str, String str2, Bundle bundle) {
                String[] stringArray;
                C89219l.m154721d(str, "");
                C89219l.m154721d(str2, "");
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.ek1);
                C6112e.m13331a(this.f19242b.f19240a.mo14001g(), this.f19242b.f19240a.mo14003i(), this.f19242b.f19240a, str2, this.f19242b.f19240a.mo14001g().getLabels(), bundle);
                Room g = this.f19242b.f19240a.mo14001g();
                DataChannel i = this.f19242b.f19240a.mo14003i();
                C11666c cVar = this.f19241a;
                C89219l.m154716b(cVar, "");
                String str3 = cVar.f27795B;
                C89219l.m154716b(str3, "");
                C6112e.m13333a(g, i, str, str2, bundle, str3, null);
                C6112e.m13332a(this.f19242b.f19240a.mo14001g(), this.f19242b.f19240a.mo14003i(), str);
                long id = this.f19242b.f19240a.mo14001g().getId();
                if (bundle != null && (stringArray = bundle.getStringArray(((IHostShare) C6193a.m13435a(IHostShare.class)).getBundleKey(0))) != null && stringArray.length != 0) {
                    ((ShareApi) C5805e.m12718a().mo11572a(ShareApi.class)).submitShare(id, C89064i.m154484a(stringArray, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62)).mo143271a(new C11191f()).mo143254a(C6112e.C6114b.f15244a, C6112e.C6115c.f15245a);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo14006l() {
        if (!(this.f19193C == null || getView() == null)) {
            View view = getView();
            if (view != null) {
                view.post(this.f19193C);
            }
            this.f19193C = null;
        }
        IMessageManager iMessageManager = ((IMessageService) C6193a.m13435a(IMessageService.class)).get();
        if (iMessageManager != null) {
            iMessageManager.startMessage();
        }
        ((GestureDetectLayout) mo13999b(R.id.cz7)).mo18161a(new View$OnTouchListenerC7727b(this));
        IMessageService iMessageService = (IMessageService) C6193a.m13435a(IMessageService.class);
        DataChannel dataChannel = this.f19211k;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        AbstractC5788t tVar = this.f19191A;
        if (tVar == null) {
            C89219l.m154710a("mLiveStatusListener");
        }
        LiveTextView liveTextView = (LiveTextView) mo13999b(R.id.cba);
        C89219l.m154716b(liveTextView, "");
        this.f19196F = iMessageService.configInteractionMessageHelper(this, dataChannel, tVar, liveTextView, null, new C7728c(this), C7729d.f19227a, new C7730e(this));
        DataChannel dataChannel2 = this.f19211k;
        if (dataChannel2 == null) {
            C89219l.m154710a("mDataChannel");
        }
        this.f19197G = new C6567a(this, dataChannel2);
        DataChannel dataChannel3 = this.f19211k;
        if (dataChannel3 == null) {
            C89219l.m154710a("mDataChannel");
        }
        C7500q qVar = new C7500q(dataChannel3);
        qVar.mo10297a(this);
        this.f19194D = qVar;
        EnumC7303c.INSTANCE.start(this);
        C4017b.m9801c(C4017b.EnumC4018a.ShowBInteractionFirstWidget);
        DataChannel dataChannel4 = this.f19211k;
        if (dataChannel4 == null) {
            C89219l.m154710a("mDataChannel");
        }
        C7487k kVar = new C7487k(dataChannel4);
        kVar.mo13728a(this);
        this.f19195E = kVar;
        AbstractC6102d dVar = this.f19219t;
        if (dVar != null) {
            dVar.mo11967a();
        }
    }

    /* renamed from: m */
    public final void mo14007m() {
        int i;
        DataChannel dataChannel = this.f19211k;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        C7380am amVar = (C7380am) dataChannel.mo28318b(C5766ab.class);
        if (amVar != null) {
            i = amVar.f18292a;
        } else {
            i = 0;
        }
        DataChannel dataChannel2 = this.f19211k;
        if (dataChannel2 == null) {
            C89219l.m154710a("mDataChannel");
        }
        C7380am amVar2 = (C7380am) dataChannel2.mo28318b(C5766ab.class);
        if ((amVar2 == null || amVar2.mo13610a()) && i > 0 && isViewValid()) {
            DataChannel dataChannel3 = this.f19211k;
            if (dataChannel3 == null) {
                C89219l.m154710a("mDataChannel");
            }
            Object b = dataChannel3.mo28318b(C9034ba.class);
            if (b == null) {
                C89219l.m154715b();
            }
            if (!((Boolean) b).booleanValue()) {
                DataChannel dataChannel4 = this.f19211k;
                if (dataChannel4 == null) {
                    C89219l.m154710a("mDataChannel");
                }
                DataChannel c = dataChannel4.mo28320c(C9111dw.class, -1).mo28320c(C9113dy.class, Integer.valueOf(i)).mo28320c(C9118ec.class, new C7378ak(C13628n.m24521b(getContext()) - i)).mo28320c(C4339o.class, Integer.valueOf((C13628n.m24521b(getContext()) - i) + C3966y.m9653a(4.0f)));
                C9039be beVar = new C9039be();
                beVar.f22140a = C13628n.m24521b(getContext()) - i;
                c.mo28320c(C9018al.class, beVar);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onDestroy() {
        String str;
        RoomAuthStatus roomAuthStatus;
        Integer valueOf;
        C7565d a = C7565d.C7566a.m15554a();
        if (a == null) {
            C89219l.m154715b();
        }
        a.mo13815b();
        EnumC7303c.INSTANCE.stop();
        AbstractC10073p pVar = (AbstractC10073p) C6193a.m13435a(AbstractC10073p.class);
        Room room = this.f19210j;
        if (room == null) {
            C89219l.m154710a("mRoom");
        }
        pVar.releaseLikeHelper(room.getId());
        DataChannel dataChannel = this.f19211k;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        dataChannel.mo28316b(this);
        AbstractC10336c c = mo11561c();
        if (c != null) {
            c.mo17117b();
        }
        C6501b a2 = C6501b.C6502a.m13948a("livesdk_anchor_end_rankings_status");
        DataChannel dataChannel2 = this.f19211k;
        if (dataChannel2 == null) {
            C89219l.m154710a("mDataChannel");
        }
        C6501b a3 = a2.mo12643a(dataChannel2);
        DataChannel dataChannel3 = this.f19211k;
        if (dataChannel3 == null) {
            C89219l.m154710a("mDataChannel");
        }
        Room room2 = (Room) dataChannel3.mo28318b(C9093de.class);
        if (room2 == null || (roomAuthStatus = room2.getRoomAuthStatus()) == null || (valueOf = Integer.valueOf(roomAuthStatus.getRankingsSwitchStatus())) == null || valueOf.intValue() != 2) {
            str = "open";
        } else {
            str = "close";
        }
        a3.mo12651a("ranking_status", str).mo12655b();
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        IMessageManager iMessageManager;
        C7646h hVar = this.f19221v;
        if (hVar == null) {
            C89219l.m154710a("mStickerEventHelper");
        }
        hVar.mo13859a();
        C7487k kVar = this.f19195E;
        if (kVar != null) {
            kVar.mo13727a();
        }
        C7500q qVar = this.f19194D;
        if (qVar != null) {
            qVar.mo8577b();
        }
        AbstractC11888a aVar = this.f19196F;
        if (aVar != null) {
            aVar.mo12735b();
        }
        C6567a aVar2 = this.f19197G;
        if (!(aVar2 == null || (iMessageManager = ((IMessageService) C6193a.m13435a(IMessageService.class)).get()) == null)) {
            iMessageManager.removeMessageListener(aVar2);
        }
        EnumC7303c.INSTANCE.stop();
        this.f19224y.mo142944a();
        mo14000f().unload(this.f19215p);
        AbstractC6108b bVar = this.f19199I;
        if (bVar != null) {
            bVar.mo11992a();
        }
        this.f19199I = null;
        IMessageManager iMessageManager2 = ((IMessageService) C6193a.m13435a(IMessageService.class)).get();
        if (iMessageManager2 != null) {
            iMessageManager2.stopMessage(false);
        }
        this.f19206f.send();
        super.onDestroyView();
        GestureDetectLayout gestureDetectLayout = (GestureDetectLayout) mo13999b(R.id.cz7);
        if (gestureDetectLayout != null) {
            gestureDetectLayout.mo18160a();
        }
        this.f19193C = null;
        AbstractC4318a aVar3 = (AbstractC4318a) C6193a.m13435a(AbstractC4318a.class);
        DataChannel dataChannel = this.f19211k;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        Room room = this.f19210j;
        if (room == null) {
            C89219l.m154710a("mRoom");
        }
        aVar3.leave(dataChannel, room);
        AbstractC2951c cVar = (AbstractC2951c) C6193a.m13435a(AbstractC2951c.class);
        DataChannel dataChannel2 = this.f19211k;
        if (dataChannel2 == null) {
            C89219l.m154710a("mDataChannel");
        }
        Room room2 = this.f19210j;
        if (room2 == null) {
            C89219l.m154710a("mRoom");
        }
        cVar.leave(dataChannel2, room2);
        DialogInterface dialogInterface = this.f19212l;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        mo14009o();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$g */
    static final class C7732g extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC7725al f19229a;

        static {
            Covode.recordClassIndex(8527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7732g(AbstractC7725al alVar) {
            super(1);
            this.f19229a = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            mo14011a(str);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo14011a(String str) {
            Fragment fragment;
            AbstractC0952i supportFragmentManager;
            ActivityC0945e activity = this.f19229a.getActivity();
            DialogInterface$OnCancelListenerC0944d dVar = null;
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                fragment = null;
            } else {
                fragment = supportFragmentManager.mo3551a(str);
            }
            if (fragment instanceof DialogInterface$OnCancelListenerC0944d) {
                dVar = fragment;
            }
            DialogInterface$OnCancelListenerC0944d dVar2 = dVar;
            if (dVar2 != null) {
                dVar2.dismissAllowingStateLoss();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$p */
    public static final class C7746p extends AbstractC89220m implements AbstractC89172b<EnumC9050bp, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC7725al f19239a;

        static {
            Covode.recordClassIndex(8541);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7746p(AbstractC7725al alVar) {
            super(1);
            this.f19239a = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC9050bp bpVar) {
            m15792a(bpVar);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        private void m15792a(EnumC9050bp bpVar) {
            float f;
            C89219l.m154721d(bpVar, "");
            View b = this.f19239a.mo13999b(R.id.bpc);
            float[] fArr = new float[1];
            int i = C7758am.f19252a[bpVar.ordinal()];
            if (i == 1) {
                f = 0.0f;
            } else if (i == 2) {
                f = 1.0f;
            } else if (i != 3) {
                throw new C89376n();
            } else {
                return;
            }
            fArr[0] = f;
            ObjectAnimator.ofFloat(b, "alpha", fArr).setDuration(300L).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$l */
    public static final class C7741l extends AbstractC89220m implements AbstractC89172b<C7655b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC7725al f19234a;

        static {
            Covode.recordClassIndex(8536);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7741l(AbstractC7725al alVar) {
            super(1);
            this.f19234a = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C7655b bVar) {
            C89219l.m154721d(bVar, "");
            C6203g.m13462a(new Runnable(this) {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al.C7741l.RunnableC77421 */

                /* renamed from: a */
                final /* synthetic */ C7741l f19235a;

                static {
                    Covode.recordClassIndex(8537);
                }

                {
                    this.f19235a = r1;
                }

                public final void run() {
                    this.f19235a.f19234a.mo14006l();
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5775h
    /* renamed from: a */
    public final void mo11519a(Runnable runnable) {
        if (this.f19192B != null) {
            this.f19193C = null;
            runnable.run();
            return;
        }
        this.f19193C = runnable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$c */
    public static final /* synthetic */ class C7728c extends C89217j implements AbstractC89172b<C9688bt, C89391z> {
        static {
            Covode.recordClassIndex(8523);
        }

        C7728c(AbstractC7725al alVar) {
            super(1, alVar, AbstractC7725al.class, "handleCopyrightViolation", "handleCopyrightViolation(Lcom/bytedance/android/livesdk/model/message/RemindMessage;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C9688bt btVar) {
            C9688bt btVar2 = btVar;
            C89219l.m154721d(btVar2, "");
            ((AbstractC7725al) this.receiver).mo13996a(btVar2);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p481b.EnumC7303c.AbstractC7304a
    /* renamed from: a */
    public final void mo13553a(C11777a aVar) {
        if (aVar == null || !(aVar instanceof C9691bw)) {
            EnumC7303c.INSTANCE.onMessageFinish();
            return;
        }
        DataChannel dataChannel = this.f19211k;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        dataChannel.mo28320c(C9098dj.class, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$m */
    public static final class C7743m extends AbstractC89220m implements AbstractC89172b<C7380am, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC7725al f19236a;

        static {
            Covode.recordClassIndex(8538);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7743m(AbstractC7725al alVar) {
            super(1);
            this.f19236a = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C7380am amVar) {
            ActivityC0945e activity;
            C7380am amVar2 = amVar;
            C89219l.m154721d(amVar2, "");
            if (this.f19236a.isViewValid()) {
                this.f19236a.mo14007m();
                if (amVar2.mo13610a() && (activity = this.f19236a.getActivity()) != null && activity.getRequestedOrientation() == 1) {
                    ((C7638e) this.f19236a.f19209i.getValue()).mo13856a();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$s */
    public static final /* synthetic */ class C7751s extends C89217j implements AbstractC89172b<Float, C89391z> {
        static {
            Covode.recordClassIndex(8546);
        }

        C7751s(AbstractC7725al alVar) {
            super(1, alVar, AbstractC7725al.class, "setTranslationY", "setTranslationY(F)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Float f) {
            float floatValue = f.floatValue();
            AbstractC7725al alVar = (AbstractC7725al) this.receiver;
            RelativeLayout relativeLayout = (RelativeLayout) alVar.mo13999b(R.id.bpe);
            C89219l.m154716b(relativeLayout, "");
            relativeLayout.setTranslationY(floatValue);
            WidgetContainer widgetContainer = (WidgetContainer) alVar.mo13999b(R.id.cxz);
            if (widgetContainer != null) {
                widgetContainer.setTranslationY(floatValue);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$u */
    public static final class C7753u extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC7725al f19247a;

        static {
            Covode.recordClassIndex(8548);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7753u(AbstractC7725al alVar) {
            super(1);
            this.f19247a = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                FrameLayout frameLayout = (FrameLayout) this.f19247a.mo13999b(R.id.and);
                C89219l.m154716b(frameLayout, "");
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
                    layoutParams = null;
                }
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (layoutParams2 != null) {
                    layoutParams2.topMargin = 0;
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$v */
    public static final class C7754v extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC7725al f19248a;

        static {
            Covode.recordClassIndex(8549);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7754v(AbstractC7725al alVar) {
            super(1);
            this.f19248a = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            View findViewById;
            float f;
            boolean booleanValue = bool.booleanValue();
            View view = this.f19248a.getView();
            ViewGroup.LayoutParams layoutParams = null;
            if (!(view == null || (findViewById = view.findViewById(R.id.fj3)) == null)) {
                ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                if (layoutParams2 != null) {
                    if (booleanValue) {
                        f = 118.0f;
                    } else {
                        f = 6.0f;
                    }
                    int a = C3966y.m9653a(f);
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    ((RelativeLayout.LayoutParams) layoutParams2).setMarginEnd(a);
                    layoutParams = layoutParams2;
                }
                findViewById.setLayoutParams(layoutParams);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        EnumC5854q qVar;
        super.onCreate(null);
        C6538d.m13980b("portrait");
        C4386c.m10499a().mo10159a((Integer) 0);
        C11200a.m19852a(getContext());
        AbstractC5843h hVar = (AbstractC5843h) C6193a.m13435a(AbstractC5843h.class);
        Context context = getContext();
        if (ToolBarButtonWithTextExperiment.hasText()) {
            qVar = EnumC5854q.ICON_WITH_TEXT;
        } else {
            qVar = EnumC5854q.ICON;
        }
        hVar.preloadToolbarView(context, 7, qVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$o */
    public static final class C7745o extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC7725al f19238a;

        static {
            Covode.recordClassIndex(8540);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7745o(AbstractC7725al alVar) {
            super(1);
            this.f19238a = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            View view;
            View view2;
            boolean booleanValue = bool.booleanValue();
            AbstractC7725al alVar = this.f19238a;
            if (booleanValue) {
                ConstraintLayout constraintLayout = (ConstraintLayout) alVar.mo13999b(R.id.elg);
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(4);
                }
                NetSpeedMonitorWidget netSpeedMonitorWidget = alVar.f19201a;
                if (netSpeedMonitorWidget == null || (view2 = netSpeedMonitorWidget.getView()) == null) {
                    view2 = alVar.mo13999b(R.id.crf);
                }
                C11279p.m20021c(view2);
            } else {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) alVar.mo13999b(R.id.elg);
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(0);
                }
                NetSpeedMonitorWidget netSpeedMonitorWidget2 = alVar.f19201a;
                if (netSpeedMonitorWidget2 == null || (view = netSpeedMonitorWidget2.getView()) == null) {
                    view = alVar.mo13999b(R.id.crf);
                }
                C11279p.m20017b(view);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo13995a(AbstractC2951c cVar) {
        if (this.f19203c == null) {
            this.f19203c = mo14000f().load(R.id.v5, ((AbstractC2951c) C6193a.m13435a(AbstractC2951c.class)).getBottomRightBannerWidget(), C6203g.m13464a());
        }
        if (this.f19205e == null) {
            this.f19205e = mo14000f().load(R.id.cjw, ((AbstractC2951c) C6193a.m13435a(AbstractC2951c.class)).getActivityTopRightBannerWidget());
        }
        if (this.f19204d == null) {
            this.f19204d = mo14000f().load(R.id.elv, ((AbstractC2951c) C6193a.m13435a(AbstractC2951c.class)).getTopRightBannerWidget());
        }
        Room room = this.f19210j;
        if (room == null) {
            C89219l.m154710a("mRoom");
        }
        cVar.fetchBanner(this, room.getId(), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$n */
    public static final class C7744n extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC7725al f19237a;

        static {
            Covode.recordClassIndex(8539);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7744n(AbstractC7725al alVar) {
            super(1);
            this.f19237a = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            int i;
            NetSpeedMonitorWidget netSpeedMonitorWidget;
            boolean booleanValue = bool.booleanValue();
            AbstractC7725al alVar = this.f19237a;
            if (booleanValue) {
                i = 4;
                NetSpeedMonitorWidget netSpeedMonitorWidget2 = alVar.f19201a;
                if (netSpeedMonitorWidget2 != null) {
                    netSpeedMonitorWidget2.hide();
                }
                LiveCenterEntranceWidget liveCenterEntranceWidget = alVar.f19202b;
                if (liveCenterEntranceWidget != null) {
                    liveCenterEntranceWidget.hide();
                }
                LiveWidget liveWidget = alVar.f19203c;
                if (liveWidget != null) {
                    liveWidget.hide();
                }
            } else {
                i = 0;
                if (!BroadcastLiveCenterSetting.INSTANCE.enable() && (netSpeedMonitorWidget = alVar.f19201a) != null) {
                    netSpeedMonitorWidget.show();
                }
                LiveCenterEntranceWidget liveCenterEntranceWidget2 = alVar.f19202b;
                if (liveCenterEntranceWidget2 != null) {
                    liveCenterEntranceWidget2.show();
                }
                LiveWidget liveWidget2 = alVar.f19203c;
                if (liveWidget2 != null) {
                    liveWidget2.show();
                }
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) alVar.mo13999b(R.id.qj);
            C89219l.m154716b(constraintLayout, "");
            constraintLayout.setVisibility(i);
            RelativeLayout relativeLayout = (RelativeLayout) alVar.mo13999b(R.id.emc);
            C89219l.m154716b(relativeLayout, "");
            relativeLayout.setVisibility(i);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) alVar.mo13999b(R.id.elg);
            C89219l.m154716b(constraintLayout2, "");
            constraintLayout2.setVisibility(i);
            FrameLayout frameLayout = (FrameLayout) alVar.mo13999b(R.id.d6u);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(i);
            FrameLayout frameLayout2 = (FrameLayout) alVar.mo13999b(R.id.d_q);
            C89219l.m154716b(frameLayout2, "");
            frameLayout2.setVisibility(i);
            FrameLayout frameLayout3 = (FrameLayout) alVar.mo13999b(R.id.ahc);
            C89219l.m154716b(frameLayout3, "");
            frameLayout3.setVisibility(i);
            FrameLayout frameLayout4 = (FrameLayout) alVar.mo13999b(R.id.d2a);
            C89219l.m154716b(frameLayout4, "");
            frameLayout4.setVisibility(i);
            FrameLayout frameLayout5 = (FrameLayout) alVar.mo13999b(R.id.az2);
            C89219l.m154716b(frameLayout5, "");
            frameLayout5.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo13996a(C9688bt btVar) {
        if (btVar.f23579f == 7 || (btVar.f23579f == 6 && C11729j.m20685b(mo14002h()))) {
            CopyrightViolationHelper copyrightViolationHelper = (CopyrightViolationHelper) this.f19225z.getValue();
            Context context = getContext();
            Room room = this.f19210j;
            if (room == null) {
                C89219l.m154710a("mRoom");
            }
            copyrightViolationHelper.mo9164a(context, btVar, room, this.f19224y);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.view.AbstractC7962a
    /* renamed from: a */
    public final void mo13943a(C9883n nVar) {
        C89219l.m154721d(nVar, "");
        if (isViewValid()) {
            int i = nVar.f23882a;
            if (i == 2) {
                AbstractC5788t tVar = this.f19191A;
                if (tVar == null) {
                    C89219l.m154710a("mLiveStatusListener");
                }
                tVar.mo11563a(2);
                Room room = this.f19210j;
                if (room == null) {
                    C89219l.m154710a("mRoom");
                }
                if (room.getMosaicStatus() == 0) {
                    LiveTextView liveTextView = (LiveTextView) mo13999b(R.id.cba);
                    C89219l.m154716b(liveTextView, "");
                    liveTextView.setVisibility(8);
                    JSONObject jSONObject = new JSONObject();
                    C3866a.m9474a(jSONObject, "error_code", 0L);
                    C3866a.m9475a(jSONObject, "error_msg", "action_resume");
                    C3868c.m9492a("ttlive_control_message_status", 0, jSONObject);
                }
            } else if (i == 3) {
                C6779a.m14563a().mo13053a(new C7400q(10010, (byte) 0));
            } else if (i == 4) {
                C6779a a = C6779a.m14563a();
                C7400q qVar = new C7400q(7);
                qVar.f18337d = nVar;
                a.mo13053a(qVar);
                if (!C13627m.m24498a(nVar.f23883f)) {
                    C11226ao.m19883a(C3966y.m9669e(), nVar.f23883f, 0);
                }
                JSONObject jSONObject2 = new JSONObject();
                C3866a.m9474a(jSONObject2, "error_code", 0L);
                C3866a.m9475a(jSONObject2, "error_msg", nVar.f23883f);
                C3868c.m9492a("ttlive_anchor_close_room", 0, jSONObject2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        boolean z;
        super.onActivityCreated(bundle);
        View view = getView();
        if (view != null) {
            C89219l.m154716b(view, "");
            DataChannel dataChannel = this.f19211k;
            if (dataChannel == null) {
                C89219l.m154710a("mDataChannel");
            }
            dataChannel.mo28312a((Object) this, C9123eh.class, (AbstractC89172b) new C7741l(this)).mo28313b((AbstractC1204m) this, C5766ab.class, (AbstractC89172b) new C7743m(this)).mo28309a((AbstractC1204m) this, C9027au.class, (AbstractC89172b) new C7744n(this)).mo28309a((AbstractC1204m) this, C9028av.class, (AbstractC89172b) new C7745o(this)).mo28309a((AbstractC1204m) this, C9051bq.class, (AbstractC89172b) new C7746p(this));
            C6555i.m14021b();
            C6555i.m9463b("ttlive_room", "prepare load widget");
            this.f19192B = C8780f.m17080a(this, view, bundle);
            DataChannel dataChannel2 = this.f19211k;
            if (dataChannel2 == null) {
                C89219l.m154710a("mDataChannel");
            }
            dataChannel2.mo28311a(C9053bs.class, C6544e.m13989c());
            Room room = this.f19210j;
            if (room == null) {
                C89219l.m154710a("mRoom");
            }
            RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
            if (roomAuthStatus == null || roomAuthStatus.isAnchorGiftEnable()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                AbstractC2953a a = C6193a.m13435a(IGiftService.class);
                C89219l.m154716b(a, "");
                LiveWidget giftWidget = ((IGiftService) a).getGiftWidget();
                this.f19214o = giftWidget;
                if (!(giftWidget instanceof AbstractC8855s)) {
                    giftWidget = null;
                }
                AbstractC8855s sVar = (AbstractC8855s) giftWidget;
                if (sVar != null) {
                    sVar.mo15098a(new C7757y(new C7756x(this)));
                }
                if (LiveVideoGiftCoverPanelSetting.INSTANCE.getValue()) {
                    mo14000f().load(R.id.fbx, this.f19214o, C6203g.m13468b());
                } else {
                    mo14000f().load(R.id.fby, this.f19214o, C6203g.m13468b());
                }
            }
            Room room2 = this.f19210j;
            if (room2 == null) {
                C89219l.m154710a("mRoom");
            }
            RoomAuthStatus roomAuthStatus2 = room2.getRoomAuthStatus();
            if (roomAuthStatus2 == null || roomAuthStatus2.isMessageEnable()) {
                DataChannel dataChannel3 = this.f19211k;
                if (dataChannel3 == null) {
                    C89219l.m154710a("mDataChannel");
                }
                dataChannel3.mo28311a(C9007aa.class, (Object) true);
            }
            if (!TestDisableCommentAreaSetting.INSTANCE.getValue()) {
                this.f19215p = mo14000f().load(R.id.cjn, ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getPublicScreenWidgetClass(true));
                ShapeControllableView shapeControllableView = (ShapeControllableView) mo13999b(R.id.dab);
                C89219l.m154716b(shapeControllableView, "");
                shapeControllableView.setVisibility(0);
                DataChannel dataChannel4 = this.f19211k;
                if (dataChannel4 == null) {
                    C89219l.m154710a("mDataChannel");
                }
                if (C89219l.m154714a(dataChannel4.mo28318b(C9114dz.class), (Object) true)) {
                    ShapeControllableView shapeControllableView2 = (ShapeControllableView) mo13999b(R.id.dab);
                    shapeControllableView2.setGradientColors(new int[]{Color.argb(0, 0, 0, 0), Color.argb(128, 0, 0, 0)});
                    shapeControllableView2.setGradientPositions(new float[]{0.0f, 1.0f});
                    shapeControllableView2.setGradientOrientation(1);
                }
            }
            AbstractC2951c cVar = (AbstractC2951c) C6193a.m13435a(AbstractC2951c.class);
            Room room3 = this.f19210j;
            if (room3 == null) {
                C89219l.m154710a("mRoom");
            }
            if (cVar.shouldShowBanner(room3.getId())) {
                C89219l.m154716b(cVar, "");
                mo13995a(cVar);
            }
            Room room4 = this.f19210j;
            if (room4 == null) {
                C89219l.m154710a("mRoom");
            }
            cVar.addOnBannerVisibilityChangeListener(room4.getId(), new C7755w(cVar, this));
            mo14000f().load(R.id.bbb, ((AbstractC4318a) C6193a.m13435a(AbstractC4318a.class)).getLiveRoomNotifyWidget());
            mo14000f().load(R.id.a9r, ((AbstractC4317f) C6193a.m13435a(AbstractC4317f.class)).getCommentWidget());
            C6555i.m14021b();
            C6555i.m9463b("ttlive_comment", "CommentWidget is load.");
            DataChannel dataChannel5 = this.f19211k;
            if (dataChannel5 == null) {
                C89219l.m154710a("mDataChannel");
            }
            dataChannel5.mo28320c(C5784p.class, true);
            FrameLayout frameLayout = (FrameLayout) mo13999b(R.id.d2a);
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            if (C11729j.m20690g(mo14002h())) {
                this.f19218s = mo14000f().load(R.id.dmv, ((AbstractC3807b) C6193a.m13435a(AbstractC3807b.class)).getDonationStickerAnchorWidget());
            }
            EnumC11728i h = mo14002h();
            C89219l.m154721d(h, "");
            if (h != EnumC11728i.THIRD_PARTY && LivePauseLiveSetting.INSTANCE.pauseLiveEnabled()) {
                RecyclableWidgetManager f = mo14000f();
                View b = mo13999b(R.id.czk);
                C89219l.m154716b(b, "");
                f.load(R.id.czn, new PauseLiveWidget(b));
            }
            mo13994a(view, bundle);
            mo14000f().load(R.id.avr, new EndWidget());
            DataChannel dataChannel6 = this.f19211k;
            if (dataChannel6 == null) {
                C89219l.m154710a("mDataChannel");
            }
            dataChannel6.mo28320c(C4328d.class, false);
            AbstractC10073p pVar = (AbstractC10073p) C6193a.m13435a(AbstractC10073p.class);
            Room room5 = this.f19210j;
            if (room5 == null) {
                C89219l.m154710a("mRoom");
            }
            AbstractC9168b likeHelper = pVar.getLikeHelper(room5.getId());
            if (likeHelper != null) {
                C89219l.m154716b(likeHelper, "");
                if (likeHelper.mo15295n()) {
                    if (likeHelper.mo15293l()) {
                        mo14000f().load(R.id.dv2, ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getSelfLikeWidgetClass(likeHelper));
                        mo14000f().load(R.id.c8u, ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getLikeUserInfoAnimWidgetClass(likeHelper));
                    }
                    if (likeHelper.mo15294m()) {
                        mo14000f().load(R.id.cxz, ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getOthersLikeWidgetClass(likeHelper));
                    }
                }
            }
            mo14000f().load(R.id.cho, ((AbstractC9368b) C6193a.m13435a(AbstractC9368b.class)).getLynxCardPreviewWidget());
            mo14000f().load(R.id.chp, ((AbstractC9368b) C6193a.m13435a(AbstractC9368b.class)).getLynxCardWidget());
            IGiftService iGiftService = (IGiftService) C6193a.m13435a(IGiftService.class);
            if (iGiftService.enableRedEnvelope()) {
                RecyclableWidgetManager f2 = mo14000f();
                C89219l.m154716b(iGiftService, "");
                f2.load(R.id.cbk, iGiftService.getRedEnvelopeWidget());
            }
            Runnable runnable = this.f19193C;
            if (runnable != null) {
                view.post(runnable);
                this.f19193C = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.al$b */
    public static final class View$OnTouchListenerC7727b implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC7725al f19226a;

        static {
            Covode.recordClassIndex(8522);
        }

        View$OnTouchListenerC7727b(AbstractC7725al alVar) {
            this.f19226a = alVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f19226a.mo13997a(motionEvent)) {
                return false;
            }
            ((C11429j) this.f19226a.f19208h.getValue()).onTouchEvent(motionEvent);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13994a(View view, Bundle bundle) {
        Class<? extends LiveRecyclableWidget> cls;
        boolean z;
        AbstractView$OnClickListenerC5841f anchorToolbarBehavior;
        IBroadcastService iBroadcastService;
        WidgetContainer widgetContainer;
        Room room = this.f19210j;
        if (room == null) {
            C89219l.m154710a("mRoom");
        }
        if (!room.isOfficial()) {
            mo14000f().load(R.id.f_r, ((AbstractC6093a) C6193a.m13435a(AbstractC6093a.class)).getUserInfoWidget());
            mo14000f().load(R.id.mg, ((AbstractC10339d) C6193a.m13435a(AbstractC10339d.class)).getRankWidgetClass(5), C6203g.m13464a());
        }
        DataChannel dataChannel = this.f19211k;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        if (C3958s.m9646b(dataChannel)) {
            DataChannel dataChannel2 = this.f19211k;
            if (dataChannel2 == null) {
                C89219l.m154710a("mDataChannel");
            }
            dataChannel2.mo28310a(C10346j.class, (AbstractC89172b) new C7753u(this));
        }
        RecyclableWidgetManager f = mo14000f();
        AbstractC2953a a = C6193a.m13435a(AbstractC6109c.class);
        C89219l.m154716b(a, "");
        f.load(((AbstractC6109c) a).getShareWidget());
        RecyclableWidgetManager f2 = mo14000f();
        AbstractC2953a a2 = C6193a.m13435a(ISlotService.class);
        C89219l.m154716b(a2, "");
        f2.load(((ISlotService) a2).getBarrageWidget());
        RecyclableWidgetManager f3 = mo14000f();
        AbstractC2953a a3 = C6193a.m13435a(ISlotService.class);
        C89219l.m154716b(a3, "");
        f3.load(R.id.e30, ((ISlotService) a3).getFrameSlotWidget());
        mo14000f().load(R.id.b_d, ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).getWidgetClass(1));
        AbstractC5843h hVar = (AbstractC5843h) C6193a.m13435a(AbstractC5843h.class);
        if (C11729j.m20685b(mo14002h())) {
            cls = hVar.broadcastToolbarWidget();
        } else {
            cls = hVar.toolbarWidget();
        }
        DataChannel dataChannel3 = this.f19211k;
        if (dataChannel3 == null) {
            C89219l.m154710a("mDataChannel");
        }
        Boolean bool = (Boolean) dataChannel3.mo28318b(C9114dz.class);
        boolean z2 = false;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (z && (widgetContainer = (WidgetContainer) mo13999b(R.id.ek7)) != null) {
            ViewGroup.LayoutParams layoutParams = widgetContainer.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = C3966y.m9653a(12.0f);
            widgetContainer.setLayoutParams(marginLayoutParams);
        }
        mo14000f().load(R.id.ek7, (Class) cls, false, mo14005k());
        if (C11729j.m20690g(mo14002h())) {
            mo14000f().load(R.id.cac, ((AbstractC3807b) C6193a.m13435a(AbstractC3807b.class)).getDecorationWidget());
        }
        if (!C6203g.m13464a()) {
            Room room2 = this.f19210j;
            if (room2 == null) {
                C89219l.m154710a("mRoom");
            }
            if (room2.isOfficial()) {
                RecyclableWidgetManager f4 = mo14000f();
                AbstractC2953a a4 = C6193a.m13435a(AbstractC10073p.class);
                C89219l.m154716b(a4, "");
                f4.load(R.id.qp, ((AbstractC10073p) a4).getBarrageWidget());
            }
        }
        Room room3 = this.f19210j;
        if (room3 == null) {
            C89219l.m154710a("mRoom");
        }
        if (!room3.isStar() && (iBroadcastService = (IBroadcastService) C6193a.m13435a(IBroadcastService.class)) != null) {
            C13628n.m24510a(mo13999b(R.id.jr), 0);
            mo14000f().load(R.id.jr, iBroadcastService.getWidgetClass(2));
        }
        if (C6203g.m13464a()) {
            RecyclableWidgetManager f5 = mo14000f();
            AbstractC2953a a5 = C6193a.m13435a(AbstractC10339d.class);
            C89219l.m154716b(a5, "");
            f5.load(R.id.bg2, (Widget) ((AbstractC10339d) a5).getHourlyRankWidget(), true);
        } else {
            mo14000f().load(R.id.bg2, (Class) ((AbstractC10339d) C6193a.m13435a(AbstractC10339d.class)).getRankWidgetClass(4), false);
        }
        this.f19217r = mo14000f().load(((AbstractC4367a) C6193a.m13435a(AbstractC4367a.class)).getMicRoomAnchorTimeControlWidget());
        if (LiveHashTagAnchorShowEntrance.INSTANCE.getValue()) {
            this.f19216q = mo14000f().load(R.id.bdi, ((AbstractC4349b) C6193a.m13435a(AbstractC4349b.class)).getAnchorHashTagWidget());
        }
        Room room4 = this.f19210j;
        if (room4 == null) {
            C89219l.m154710a("mRoom");
        }
        RoomAuthStatus roomAuthStatus = room4.getRoomAuthStatus();
        if (roomAuthStatus != null) {
            z2 = roomAuthStatus.isEnableGift();
        }
        if (C8789a.m17098a(true, true, z2) == C8789a.EnumC8790a.SHOW && LiveWishlistPermissionSetting.INSTANCE.getValue().f21778a == 1) {
            RecyclableWidgetManager f6 = mo14000f();
            AbstractC2953a a6 = C6193a.m13435a(IGiftService.class);
            C89219l.m154716b(a6, "");
            f6.load(R.id.fj3, ((IGiftService) a6).getWishListWidget());
            DataChannel dataChannel4 = this.f19211k;
            if (dataChannel4 == null) {
                C89219l.m154710a("mDataChannel");
            }
            dataChannel4.mo28314b(C9046bl.class, (AbstractC89172b) new C7754v(this));
        }
        Context context = getContext();
        if (context != null) {
            C89219l.m154716b(context, "");
            EnumC5847l lVar = EnumC5847l.SLOT;
            DataChannel dataChannel5 = this.f19211k;
            if (dataChannel5 == null) {
                C89219l.m154710a("mDataChannel");
            }
            lVar.load(dataChannel5, new C8024f(context, this));
            EnumC5847l lVar2 = EnumC5847l.EFFECT;
            DataChannel dataChannel6 = this.f19211k;
            if (dataChannel6 == null) {
                C89219l.m154710a("mDataChannel");
            }
            lVar2.load(dataChannel6, new C8020e(context));
            EnumC5847l lVar3 = EnumC5847l.MORE;
            DataChannel dataChannel7 = this.f19211k;
            if (dataChannel7 == null) {
                C89219l.m154710a("mDataChannel");
            }
            lVar3.load(dataChannel7, new C8043m());
            EnumC5847l lVar4 = EnumC5847l.CLOSE_ROOM;
            DataChannel dataChannel8 = this.f19211k;
            if (dataChannel8 == null) {
                C89219l.m154710a("mDataChannel");
            }
            lVar4.load(dataChannel8, new C8035i());
            EnumC5847l lVar5 = EnumC5847l.COMMENT;
            DataChannel dataChannel9 = this.f19211k;
            if (dataChannel9 == null) {
                C89219l.m154710a("mDataChannel");
            }
            lVar5.load(dataChannel9, new C8036j(context));
            EnumC5847l lVar6 = EnumC5847l.SETTING;
            DataChannel dataChannel10 = this.f19211k;
            if (dataChannel10 == null) {
                C89219l.m154710a("mDataChannel");
            }
            lVar6.load(dataChannel10, new C8042l(context));
            EnumC5847l lVar7 = EnumC5847l.INTRO;
            DataChannel dataChannel11 = this.f19211k;
            if (dataChannel11 == null) {
                C89219l.m154710a("mDataChannel");
            }
            lVar7.load(dataChannel11, new C8041k(context));
            AbstractView$OnClickListenerC5841f toolbarBehavior = ((AbstractC5760a) C6193a.m13435a(AbstractC5760a.class)).getToolbarBehavior(context);
            if (toolbarBehavior != null) {
                EnumC5847l lVar8 = EnumC5847l.QUESTION;
                DataChannel dataChannel12 = this.f19211k;
                if (dataChannel12 == null) {
                    C89219l.m154710a("mDataChannel");
                }
                lVar8.load(dataChannel12, toolbarBehavior);
            }
            EnumC5847l lVar9 = EnumC5847l.SHARE;
            DataChannel dataChannel13 = this.f19211k;
            if (dataChannel13 == null) {
                C89219l.m154710a("mDataChannel");
            }
            AbstractView$OnClickListenerC5841f shareBehavior = ((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).getShareBehavior(getActivity(), context, mo14002h(), this);
            C89219l.m154716b(shareBehavior, "");
            lVar9.load(dataChannel13, shareBehavior);
            if (LivePauseLiveSetting.INSTANCE.pauseLiveEnabled()) {
                EnumC5847l lVar10 = EnumC5847l.PAUSE_LIVE;
                DataChannel dataChannel14 = this.f19211k;
                if (dataChannel14 == null) {
                    C89219l.m154710a("mDataChannel");
                }
                lVar10.load(dataChannel14, new C8047o());
            }
            if (FrisbeeTaskIconShowSetting.INSTANCE.enable()) {
                EnumC5847l lVar11 = EnumC5847l.TASK;
                DataChannel dataChannel15 = this.f19211k;
                if (dataChannel15 == null) {
                    C89219l.m154710a("mDataChannel");
                }
                lVar11.load(dataChannel15, new C8006a(context));
            }
            DataChannel dataChannel16 = this.f19211k;
            if (dataChannel16 == null) {
                C89219l.m154710a("mDataChannel");
            }
            if (C3737o.m9246a(dataChannel16) && (anchorToolbarBehavior = ((AbstractC4349b) C6193a.m13435a(AbstractC4349b.class)).getAnchorToolbarBehavior()) != null) {
                EnumC5847l lVar12 = EnumC5847l.TOPICS;
                DataChannel dataChannel17 = this.f19211k;
                if (dataChannel17 == null) {
                    C89219l.m154710a("mDataChannel");
                }
                lVar12.load(dataChannel17, anchorToolbarBehavior);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        DrawerLayout a;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        view.setFitsSystemWindows(true);
        view.post(new RunnableC7749r(this, view));
        Room room = this.f19210j;
        if (room == null) {
            C89219l.m154710a("mRoom");
        }
        if (room.getMosaicStatus() == 1) {
            LiveTextView liveTextView = (LiveTextView) mo13999b(R.id.cba);
            C89219l.m154716b(liveTextView, "");
            liveTextView.setVisibility(0);
        }
        Room room2 = this.f19210j;
        if (room2 == null) {
            C89219l.m154710a("mRoom");
        }
        if (room2.isOfficial()) {
            ActivityC0945e activity = getActivity();
            if (!(activity instanceof AbstractC11609b)) {
                activity = null;
            }
            AbstractC11609b bVar = (AbstractC11609b) activity;
            if (!(bVar == null || (a = bVar.mo18408a()) == null)) {
                a.setDrawerLockMode(1);
            }
        }
        if (this.f19199I == null) {
            AbstractC6108b provideShareCountManager = ((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).provideShareCountManager();
            DataChannel dataChannel = this.f19211k;
            if (dataChannel == null) {
                C89219l.m154710a("mDataChannel");
            }
            IMessageManager iMessageManager = ((IMessageService) C6193a.m13435a(IMessageService.class)).get();
            Room room3 = this.f19210j;
            if (room3 == null) {
                C89219l.m154710a("mRoom");
            }
            RoomStats stats = room3.getStats();
            if (stats != null) {
                i = stats.getShareCount();
            } else {
                i = 0;
            }
            provideShareCountManager.mo11993a(dataChannel, iMessageManager, i);
            this.f19199I = provideShareCountManager;
        }
        Room room4 = this.f19210j;
        if (room4 == null) {
            C89219l.m154710a("mRoom");
        }
        if (room4.getRoomAuthStatus().chatSubOnly) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.el_);
        }
        AbstractC6103e eVar = (AbstractC6103e) C6193a.m13435a(AbstractC6103e.class);
        DataChannel dataChannel2 = this.f19211k;
        if (dataChannel2 == null) {
            C89219l.m154710a("mDataChannel");
        }
        this.f19219t = eVar.configUserHelper(this, dataChannel2, this.f19224y);
        AbstractC6091a aVar = (AbstractC6091a) C6193a.m13435a(AbstractC6091a.class);
        DataChannel dataChannel3 = this.f19211k;
        if (dataChannel3 == null) {
            C89219l.m154710a("mDataChannel");
        }
        aVar.configProfileHelper(this, dataChannel3, true, this);
        DataChannel dataChannel4 = this.f19211k;
        if (dataChannel4 == null) {
            C89219l.m154710a("mDataChannel");
        }
        this.f19222w = new C7640f(this, dataChannel4);
        IWalletService iWalletService = (IWalletService) C6193a.m13435a(IWalletService.class);
        DataChannel dataChannel5 = this.f19211k;
        if (dataChannel5 == null) {
            C89219l.m154710a("mDataChannel");
        }
        iWalletService.configPackagePurchaseHelper(this, dataChannel5, this);
        DataChannel dataChannel6 = this.f19211k;
        if (dataChannel6 == null) {
            C89219l.m154710a("mDataChannel");
        }
        this.f19223x = new C7643g(this, dataChannel6);
        AbstractC2928f fVar = (AbstractC2928f) C6193a.m13435a(AbstractC2928f.class);
        DataChannel dataChannel7 = this.f19211k;
        if (dataChannel7 == null) {
            C89219l.m154710a("mDataChannel");
        }
        fVar.configWebDialogHelper(this, dataChannel7, true, this);
        DataChannel dataChannel8 = this.f19211k;
        if (dataChannel8 == null) {
            C89219l.m154710a("mDataChannel");
        }
        this.f19221v = new C7646h(this, dataChannel8);
        AbstractC10073p pVar = (AbstractC10073p) C6193a.m13435a(AbstractC10073p.class);
        DataChannel dataChannel9 = this.f19211k;
        if (dataChannel9 == null) {
            C89219l.m154710a("mDataChannel");
        }
        pVar.configInteractionHelper(this, dataChannel9, (GestureDetectLayout) mo13999b(R.id.cz7));
        DataChannel dataChannel10 = this.f19211k;
        if (dataChannel10 == null) {
            C89219l.m154710a("mDataChannel");
        }
        View b = mo13999b(R.id.bpg);
        C89219l.m154716b(b, "");
        this.f19220u = new C7629b(this, dataChannel10, b, null, new C7751s(this));
        if (C11279p.m20011a((Activity) getActivity())) {
            DataChannel dataChannel11 = this.f19211k;
            if (dataChannel11 == null) {
                C89219l.m154710a("mDataChannel");
            }
            dataChannel11.mo28311a(C9090db.class, "live_page");
            AbstractC10336c c = mo11561c();
            if (c != null) {
                AbstractC0952i childFragmentManager = getChildFragmentManager();
                C89219l.m154716b(childFragmentManager, "");
                c.mo17116a(childFragmentManager);
            }
            AbstractC10336c c2 = mo11561c();
            if (c2 != null) {
                c2.mo17114a();
            }
        }
        View b2 = mo13999b(R.id.ug);
        C89219l.m154716b(b2, "");
        b2.setVisibility(0);
        DataChannel dataChannel12 = this.f19211k;
        if (dataChannel12 == null) {
            C89219l.m154710a("mDataChannel");
        }
        if (C3958s.m9646b(dataChannel12)) {
            FrameLayout frameLayout = (FrameLayout) mo13999b(R.id.bpf);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(0);
        }
        AbstractC4318a aVar2 = (AbstractC4318a) C6193a.m13435a(AbstractC4318a.class);
        DataChannel dataChannel13 = this.f19211k;
        if (dataChannel13 == null) {
            C89219l.m154710a("mDataChannel");
        }
        Room room5 = this.f19210j;
        if (room5 == null) {
            C89219l.m154710a("mRoom");
        }
        aVar2.enter(dataChannel13, room5);
        AbstractC2951c cVar = (AbstractC2951c) C6193a.m13435a(AbstractC2951c.class);
        DataChannel dataChannel14 = this.f19211k;
        if (dataChannel14 == null) {
            C89219l.m154710a("mDataChannel");
        }
        Room room6 = this.f19210j;
        if (room6 == null) {
            C89219l.m154710a("mRoom");
        }
        cVar.enter(dataChannel14, room6);
        int value = PostponeRequestBatchShareListSetting.INSTANCE.getValue();
        if (value <= 0) {
            C3238a aVar3 = this.f19207g;
            Room room7 = this.f19210j;
            if (room7 == null) {
                C89219l.m154710a("mRoom");
            }
            aVar3.mo8580a(room7.getId(), this, null);
            return;
        }
        view.postDelayed(new RunnableC7752t(this), TimeUnit.SECONDS.toMillis((long) value));
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5775h
    /* renamed from: a */
    public final void mo11518a(DataChannel dataChannel, AbstractC5788t tVar) {
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(tVar, "");
        Object b = dataChannel.mo28318b(C9093de.class);
        if (b == null) {
            C89219l.m154715b();
        }
        this.f19210j = (Room) b;
        DataChannel a = dataChannel.mo28311a(C9036bc.class, (Object) false).mo28311a(C9007aa.class, (Object) false);
        Room room = this.f19210j;
        if (room == null) {
            C89219l.m154710a("mRoom");
        }
        this.f19211k = a.mo28311a(C9096dh.class, Long.valueOf(room.getId())).mo28311a(C9076co.class, (Object) true).mo28311a(C9114dz.class, Boolean.valueOf(ToolBarButtonWithTextExperiment.hasText())).mo28311a(C9058bx.class, mo14002h()).mo28315b(C9119ed.class, (Object) true);
        this.f19191A = tVar;
        C6682a.f16579b = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        AbstractC3063c cVar;
        C6567a aVar = this.f19197G;
        if (aVar != null && (cVar = aVar.f16438a) != null) {
            cVar.mo8326a(i, i2, intent);
        }
    }
}
