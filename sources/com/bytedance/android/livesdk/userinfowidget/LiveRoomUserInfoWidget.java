package com.bytedance.android.livesdk.userinfowidget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p037h.p039b.C0767b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3910b;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3958s;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.p218f.p219a.C3889a;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p247f.AbstractC4318a;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p379n.C5767ac;
import com.bytedance.android.live.p379n.C5769c;
import com.bytedance.android.live.p379n.C5793y;
import com.bytedance.android.live.p384o.AbstractC5834a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.livesdk.AbstractC10073p;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.like.AbstractC9168b;
import com.bytedance.android.livesdk.like.AbstractC9170d;
import com.bytedance.android.livesdk.livesetting.other.LiveAnchorInfoAbtestSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveAnchorShareCountShowSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveLikeFirstShowTimeSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRoomUserInfoIconSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRoomUserInfoLanguageSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveShareCountShowSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveShareShowTimeSetting;
import com.bytedance.android.livesdk.model.C9591j;
import com.bytedance.android.livesdk.model.message.C9605ai;
import com.bytedance.android.livesdk.model.message.C9719cc;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p425aa.p428c.C6526e;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p450an.C6782a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p456as.C6865d;
import com.bytedance.android.livesdk.p456as.C6869e;
import com.bytedance.android.livesdk.p456as.C6873g;
import com.bytedance.android.livesdk.p456as.C6876j;
import com.bytedance.android.livesdk.p561j.C9034ba;
import com.bytedance.android.livesdk.p561j.C9066ce;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9101dm;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.rank.api.C10331a;
import com.bytedance.android.livesdk.subscribe.SubscribeApi;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.C11120d;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11199a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.android.livesdkapi.host.AbstractC11807g;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p689e.C11752b;
import com.bytedance.android.livesdkapi.p690f.C11756a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.bytedance.ies.xbridge.p1301e.AbstractC18511d;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.p1301e.C18502c;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.fresco.animation.p1867c.C24296c;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

public class LiveRoomUserInfoWidget extends RoomRecycleWidget implements AbstractC4318a.AbstractC4319a, AbstractC9170d, WeakHandler.IHandler, AbstractC18511d, AbstractC33974au, OnMessageListener {

    /* renamed from: B */
    private static final String f26500B = LiveRoomUserInfoWidget.class.getName();

    /* renamed from: a */
    public static final int f26501a = LiveLikeFirstShowTimeSetting.INSTANCE.getValue();

    /* renamed from: b */
    public static final int f26502b = LiveShareShowTimeSetting.INSTANCE.getValue();

    /* renamed from: A */
    public EnumC11022a f26503A;

    /* renamed from: C */
    private final int f26504C = LiveRoomUserInfoIconSetting.INSTANCE.getValue();

    /* renamed from: D */
    private boolean f26505D = false;

    /* renamed from: E */
    private HSImageView f26506E;

    /* renamed from: F */
    private LiveTextView f26507F;

    /* renamed from: G */
    private View f26508G;

    /* renamed from: H */
    private TextView f26509H;

    /* renamed from: I */
    private ImageView f26510I;

    /* renamed from: J */
    private long f26511J;

    /* renamed from: K */
    private long f26512K;

    /* renamed from: L */
    private long f26513L;

    /* renamed from: M */
    private int f26514M;

    /* renamed from: N */
    private long f26515N;

    /* renamed from: O */
    private AnimatorSet f26516O;

    /* renamed from: P */
    private AnimatorSet f26517P;

    /* renamed from: Q */
    private String f26518Q;

    /* renamed from: R */
    private ActivityC0945e f26519R;

    /* renamed from: S */
    private WeakHandler f26520S;

    /* renamed from: T */
    private UserInfoLikeHelper f26521T;

    /* renamed from: c */
    ViewGroup f26522c;

    /* renamed from: d */
    VHeadView f26523d;

    /* renamed from: e */
    View f26524e;

    /* renamed from: f */
    TextView f26525f;

    /* renamed from: g */
    public ImageView f26526g;

    /* renamed from: h */
    public TextView f26527h;

    /* renamed from: i */
    public TextView f26528i;

    /* renamed from: j */
    View f26529j;

    /* renamed from: k */
    public ViewGroup f26530k;

    /* renamed from: l */
    View f26531l;

    /* renamed from: m */
    public HSAnimImageView f26532m;

    /* renamed from: n */
    public ImageView f26533n;

    /* renamed from: o */
    public TextView f26534o;

    /* renamed from: p */
    public final C88411a f26535p = new C88411a();

    /* renamed from: q */
    Room f26536q;

    /* renamed from: r */
    User f26537r;

    /* renamed from: s */
    boolean f26538s;

    /* renamed from: t */
    boolean f26539t = true;

    /* renamed from: u */
    boolean f26540u = false;

    /* renamed from: v */
    boolean f26541v = false;

    /* renamed from: w */
    long f26542w = -1;

    /* renamed from: x */
    ValueAnimator f26543x;

    /* renamed from: y */
    AnimatorSet f26544y;

    /* renamed from: z */
    AbstractC4367a f26545z;

    @Override // com.bytedance.android.livesdk.like.AbstractC9170d
    /* renamed from: a */
    public final void mo10821a(AbstractC9168b bVar, int i) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.xbridge.p1301e.AbstractC18511d
    /* renamed from: a */
    public final void mo8791a(C18502c cVar) {
        if (cVar.f44153a.equals("js_event_report_log_live_follow")) {
            Map<String, String> map = null;
            try {
                map = (Map) cVar.f44154b.mo29758b().get("log_params");
            } catch (Exception unused) {
            }
            m19651a("follow_discount_popup", map);
        }
    }

    /* renamed from: a */
    public final void mo17858a(C11688a aVar, boolean z) {
        if (isViewValid()) {
            AbstractC4367a aVar2 = this.f26545z;
            if (aVar2 == null || !aVar2.isMicRoomForCurrentRoom()) {
                Room room = (Room) this.dataChannel.mo28318b(C9093de.class);
                room.getOwner().setFollowStatus(aVar.mo18451a());
                this.dataChannel.mo28315b(C9093de.class, room);
            } else {
                Room room2 = (Room) this.dataChannel.mo28318b(C9093de.class);
                if (room2 != null) {
                    room2.officialChannelInfo.f23136a.setFollowStatus(aVar.mo18451a());
                }
                this.dataChannel.mo28315b(C9093de.class, room2);
            }
            if (aVar.mo18451a() == 0) {
                mo17857a(EnumC11022a.UNFOLLOW);
            } else if (!C3958s.m9646b(this.dataChannel)) {
                mo17857a(EnumC11022a.FOLLOWED);
            } else if (z) {
                mo17857a(EnumC11022a.FOLLOW_ANIM);
            }
        }
    }

    /* renamed from: a */
    public final void mo17857a(EnumC11022a aVar) {
        while (this.f26503A != aVar) {
            if (aVar != EnumC11022a.FOLLOW_ANIM || this.f26503A == EnumC11022a.UNFOLLOW) {
                this.f26503A = aVar;
                m19656f();
                m19657g();
                C13628n.m24510a(this.f26530k, 8);
                C13628n.m24510a(this.f26531l, 8);
                C13628n.m24510a(this.f26532m, 8);
                C13628n.m24510a(this.f26533n, 8);
                C13628n.m24510a(this.f26510I, 8);
                C13628n.m24510a(this.f26534o, 8);
                int i = C110175.f26555a[aVar.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        C13628n.m24510a(this.f26530k, 0);
                        C13628n.m24510a(this.f26531l, 0);
                        m19655e();
                        return;
                    } else if (i == 3) {
                        C13628n.m24510a(this.f26530k, 0);
                        C13628n.m24510a(this.f26533n, 0);
                        m19659i();
                        m19658h();
                        return;
                    } else if (i == 4) {
                        C13628n.m24510a(this.f26530k, 0);
                        C13628n.m24510a(this.f26510I, 0);
                        C3889a a = C3889a.m9507a(this.f26510I.getContext()).mo9249a(ImageView.ScaleType.CENTER_INSIDE);
                        a.f10755d = m19662l();
                        a.mo9252a(this.f26510I);
                        m19660j();
                        return;
                    } else if (!m19661k()) {
                        C13628n.m24510a(this.f26530k, 8);
                        return;
                    } else if (mo17859b()) {
                        aVar = EnumC11022a.SUBSCRIBED;
                    } else {
                        aVar = EnumC11022a.UNSUBSCRIBE;
                    }
                } else if (!m19661k() || !mo17859b()) {
                    C13628n.m24510a(this.f26530k, 0);
                    C13628n.m24510a(this.f26531l, 0);
                    return;
                } else {
                    aVar = EnumC11022a.SUBSCRIBED;
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ C89391z mo17860c() {
        m19665o();
        return C89391z.f203057a;
    }

    /* renamed from: d */
    private static boolean m19654d() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: o */
    private void m19665o() {
        if (this.f26531l.getVisibility() == 0) {
            mo17854a();
        }
    }

    static {
        Covode.recordClassIndex(12625);
    }

    /* renamed from: g */
    private void m19657g() {
        ViewGroup.LayoutParams layoutParams = this.f26530k.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0547a) {
            ((ConstraintLayout.C0547a) layoutParams).f2278p = R.id.cpp;
        }
        this.f26530k.setLayoutParams(layoutParams);
        C13628n.m24510a(this.f26529j, 8);
    }

    /* renamed from: n */
    private boolean m19664n() {
        int value;
        if (this.f26538s) {
            value = LiveAnchorShareCountShowSetting.INSTANCE.getValue();
        } else {
            value = LiveShareCountShowSetting.INSTANCE.getValue();
        }
        if (value == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private int m19667q() {
        if (this.f26514M == 0) {
            this.f26514M = findViewById(R.id.ctk).getHeight();
        }
        return this.f26514M;
    }

    /* renamed from: f */
    private void m19656f() {
        HSAnimImageView hSAnimImageView = this.f26532m;
        if (hSAnimImageView != null && hSAnimImageView.mo9392c()) {
            this.f26532m.mo9391b();
        }
        ValueAnimator valueAnimator = this.f26543x;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f26543x.cancel();
        }
        AnimatorSet animatorSet = this.f26544y;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f26544y.cancel();
        }
    }

    /* renamed from: k */
    private boolean m19661k() {
        Room room;
        if (this.f26538s || (room = this.f26536q) == null || room.getOwner() == null || this.f26536q.getOwner().getSubscribeInfo() == null || !this.f26536q.getOwner().getSubscribeInfo().isAnchorQualified()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private ImageModel m19662l() {
        Room room = this.f26536q;
        if (room == null || room.getOwner() == null || this.f26536q.getOwner().getSubscribeInfo() == null || this.f26536q.getOwner().getSubscribeInfo().getSubscribeBadge() == null) {
            return null;
        }
        return this.f26536q.getOwner().getSubscribeInfo().getSubscribeBadge().getOriginImage();
    }

    /* renamed from: b */
    public final boolean mo17859b() {
        Room room;
        if (this.f26538s || (room = this.f26536q) == null || room.getOwner() == null || this.f26536q.getOwner().getSubscribeInfo() == null || !this.f26536q.getOwner().isSubscribed()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        if (((Boolean) this.dataChannel.mo28318b(C9119ed.class)).booleanValue()) {
            if (this.f26504C == 0) {
                return R.layout.bbu;
            }
            return R.layout.bbx;
        } else if (this.f26504C == 0) {
            return R.layout.bbv;
        } else {
            return R.layout.bbw;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget$5 */
    public static /* synthetic */ class C110175 {

        /* renamed from: a */
        static final /* synthetic */ int[] f26555a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 12634(0x315a, float:1.7704E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget$a[] r0 = com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.EnumC11022a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.C110175.f26555a = r2
                com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget$a r0 = com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.EnumC11022a.UNFOLLOW     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.C110175.f26555a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget$a r0 = com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.EnumC11022a.FOLLOW_ANIM     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.C110175.f26555a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget$a r0 = com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.EnumC11022a.UNSUBSCRIBE     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.C110175.f26555a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget$a r0 = com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.EnumC11022a.SUBSCRIBED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.C110175.f26555a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget$a r0 = com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.EnumC11022a.FOLLOWED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.C110175.<clinit>():void");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget$a */
    public enum EnumC11022a {
        UNFOLLOW,
        FOLLOW_ANIM,
        FOLLOWED,
        UNSUBSCRIBE,
        SUBSCRIBED;

        static {
            Covode.recordClassIndex(12639);
        }
    }

    /* renamed from: e */
    private void m19655e() {
        C13628n.m24510a(this.f26531l, 4);
        C13628n.m24510a(this.f26532m, 0);
        HSAnimImageView hSAnimImageView = this.f26532m;
        if (hSAnimImageView != null && !hSAnimImageView.mo9392c()) {
            if (!m19661k() || mo17859b()) {
                this.f26532m.mo9389a(HSAnimImageView.m9804a("tiktok_live_basic_resource", C11024a.m19685a()));
                this.f26532m.mo9388a(new C24296c() {
                    /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.C110219 */

                    static {
                        Covode.recordClassIndex(12638);
                    }

                    @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b, com.facebook.fresco.animation.p1867c.C24296c
                    /* renamed from: b */
                    public final void mo9285b(C24290a aVar) {
                        C13628n.m24510a(LiveRoomUserInfoWidget.this.f26532m, 8);
                        if (LiveRoomUserInfoWidget.this.mo17859b()) {
                            LiveRoomUserInfoWidget.this.mo17857a(EnumC11022a.SUBSCRIBED);
                            return;
                        }
                        LiveRoomUserInfoWidget liveRoomUserInfoWidget = LiveRoomUserInfoWidget.this;
                        GradientDrawable gradientDrawable = (GradientDrawable) liveRoomUserInfoWidget.f26530k.getBackground();
                        int measuredWidth = liveRoomUserInfoWidget.f26530k.getMeasuredWidth();
                        int measuredHeight = liveRoomUserInfoWidget.f26530k.getMeasuredHeight();
                        liveRoomUserInfoWidget.f26543x = ValueAnimator.ofFloat(1.0f, 0.0f);
                        liveRoomUserInfoWidget.f26543x.addUpdateListener(new C11039o(liveRoomUserInfoWidget, measuredWidth, measuredHeight, gradientDrawable));
                        liveRoomUserInfoWidget.f26543x.addListener(new AnimatorListenerAdapter(gradientDrawable) {
                            /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.C1101010 */

                            /* renamed from: a */
                            final /* synthetic */ GradientDrawable f26547a;

                            static {
                                Covode.recordClassIndex(12627);
                            }

                            public final void onAnimationEnd(Animator animator) {
                                ViewGroup.LayoutParams layoutParams = LiveRoomUserInfoWidget.this.f26530k.getLayoutParams();
                                layoutParams.width = -2;
                                layoutParams.height = -2;
                                LiveRoomUserInfoWidget.this.f26530k.setLayoutParams(layoutParams);
                                GradientDrawable gradientDrawable = this.f26547a;
                                if (gradientDrawable != null) {
                                    gradientDrawable.setCornerRadius((float) C3966y.m9653a(13.5f));
                                }
                                LiveRoomUserInfoWidget.this.mo17857a(EnumC11022a.FOLLOWED);
                            }

                            {
                                this.f26547a = r2;
                            }
                        });
                        liveRoomUserInfoWidget.f26543x.setDuration(200L);
                        liveRoomUserInfoWidget.f26543x.start();
                    }
                });
            } else {
                this.f26532m.mo9389a(HSAnimImageView.m9804a("tiktok_live_basic_resource", "ttlive_user_info_follow_complete2.webp"));
                this.f26532m.mo9388a(new C24296c() {
                    /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.C110208 */

                    static {
                        Covode.recordClassIndex(12637);
                    }

                    @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b, com.facebook.fresco.animation.p1867c.C24296c
                    /* renamed from: b */
                    public final void mo9285b(C24290a aVar) {
                        LiveRoomUserInfoWidget liveRoomUserInfoWidget = LiveRoomUserInfoWidget.this;
                        if (liveRoomUserInfoWidget.getView() != null && liveRoomUserInfoWidget.f26503A == EnumC11022a.FOLLOW_ANIM) {
                            C13628n.m24510a(liveRoomUserInfoWidget.f26529j, 0);
                            ViewGroup.LayoutParams layoutParams = liveRoomUserInfoWidget.f26530k.getLayoutParams();
                            if (layoutParams instanceof ConstraintLayout.C0547a) {
                                ConstraintLayout.C0547a aVar2 = (ConstraintLayout.C0547a) layoutParams;
                                aVar2.f2278p = R.id.bdt;
                                aVar2.setMarginStart(C3966y.m9653a(6.0f));
                            }
                            liveRoomUserInfoWidget.f26530k.setLayoutParams(layoutParams);
                            ChangeBounds changeBounds = new ChangeBounds();
                            changeBounds.setDuration(200);
                            TransitionManager.beginDelayedTransition((ViewGroup) liveRoomUserInfoWidget.getView(), changeBounds);
                            C13628n.m24510a(liveRoomUserInfoWidget.f26531l, 8);
                            C13628n.m24510a(liveRoomUserInfoWidget.f26533n, 4);
                            C13628n.m24510a(liveRoomUserInfoWidget.f26534o, 4);
                            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) liveRoomUserInfoWidget.f26533n.getLayoutParams();
                            layoutParams2.setMarginStart(C3966y.m9653a(-6.0f));
                            liveRoomUserInfoWidget.f26533n.setLayoutParams(layoutParams2);
                            ObjectAnimator duration = ObjectAnimator.ofFloat(liveRoomUserInfoWidget.f26524e, View.ALPHA, 1.0f, 0.2f).setDuration(200L);
                            ObjectAnimator duration2 = ObjectAnimator.ofFloat(liveRoomUserInfoWidget.f26532m, View.ALPHA, 1.0f, 0.0f).setDuration(200L);
                            duration2.addListener(new AnimatorListenerAdapter() {
                                /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.C1101111 */

                                static {
                                    Covode.recordClassIndex(12628);
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    C13628n.m24510a(LiveRoomUserInfoWidget.this.f26532m, 8);
                                    LiveRoomUserInfoWidget.this.f26532m.setAlpha(1.0f);
                                }
                            });
                            ObjectAnimator duration3 = ObjectAnimator.ofFloat(liveRoomUserInfoWidget.f26533n, View.SCALE_X, 0.0f, 1.0f).setDuration(300L);
                            duration3.setInterpolator(C0767b.m2680a(0.17f, 0.89f, 0.32f, 1.77f));
                            duration3.addListener(new AnimatorListenerAdapter() {
                                /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.C1101212 */

                                static {
                                    Covode.recordClassIndex(12629);
                                }

                                public final void onAnimationStart(Animator animator) {
                                    C13628n.m24510a(LiveRoomUserInfoWidget.this.f26533n, 0);
                                }
                            });
                            duration3.setStartDelay(200);
                            ObjectAnimator duration4 = ObjectAnimator.ofFloat(liveRoomUserInfoWidget.f26533n, View.SCALE_Y, 0.0f, 1.0f).setDuration(300L);
                            duration4.setInterpolator(C0767b.m2680a(0.17f, 0.89f, 0.32f, 1.77f));
                            duration4.setStartDelay(200);
                            ObjectAnimator duration5 = ObjectAnimator.ofFloat(liveRoomUserInfoWidget.f26534o, View.ALPHA, 0.0f, 1.0f).setDuration(150L);
                            duration5.setStartDelay(200);
                            duration5.addListener(new AnimatorListenerAdapter() {
                                /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.C1101313 */

                                static {
                                    Covode.recordClassIndex(12630);
                                }

                                public final void onAnimationStart(Animator animator) {
                                    C13628n.m24510a(LiveRoomUserInfoWidget.this.f26534o, 0);
                                }
                            });
                            ObjectAnimator duration6 = ObjectAnimator.ofFloat(liveRoomUserInfoWidget.f26534o, View.ALPHA, 1.0f, 0.0f).setDuration(150L);
                            duration6.setStartDelay(3200);
                            duration6.addListener(new AnimatorListenerAdapter() {
                                /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.C110142 */

                                static {
                                    Covode.recordClassIndex(12631);
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    if (LiveRoomUserInfoWidget.this.getView() != null) {
                                        ChangeBounds changeBounds = new ChangeBounds();
                                        changeBounds.setDuration(200);
                                        TransitionManager.beginDelayedTransition((ViewGroup) LiveRoomUserInfoWidget.this.getView(), changeBounds);
                                        C13628n.m24510a(LiveRoomUserInfoWidget.this.f26534o, 8);
                                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) LiveRoomUserInfoWidget.this.f26533n.getLayoutParams();
                                        layoutParams.setMarginStart(0);
                                        LiveRoomUserInfoWidget.this.f26533n.setLayoutParams(layoutParams);
                                        LiveRoomUserInfoWidget.this.f26535p.mo142945a(AbstractC88979t.m154310b((Object) 1).mo143295e(200, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143280b((AbstractC88433f) new C11049y(this)).mo143300g());
                                    }
                                }
                            });
                            ObjectAnimator duration7 = ObjectAnimator.ofFloat(liveRoomUserInfoWidget.f26524e, View.ALPHA, 0.2f, 1.0f).setDuration(200L);
                            duration7.setStartDelay(3350);
                            liveRoomUserInfoWidget.f26544y = new AnimatorSet();
                            liveRoomUserInfoWidget.f26544y.playTogether(duration, duration2, duration3, duration4, duration5, duration6, duration7);
                            liveRoomUserInfoWidget.f26544y.start();
                        }
                    }
                });
            }
            this.f26532m.mo9390a();
        }
    }

    /* renamed from: h */
    private void m19658h() {
        this.f26535p.mo142945a(((SubscribeApi) C5805e.m12718a().mo11572a(SubscribeApi.class)).getSubPrivilegeDetail(this.f26536q.getIdStr(), C11115u.m19743a().mo17915b().mo13153a(this.f26536q.getOwner().getId())).mo143271a(new C11191f()).mo143254a(new C11040p(this), C11041q.f26587a));
    }

    /* renamed from: i */
    private void m19659i() {
        Room room = this.f26536q;
        if (room != null && room.getOwner() != null && this.f26536q.getOwner().getSubscribeInfo() != null) {
            C6501b.C6502a.m13948a("livesdk_subscribe_icon_show").mo12646a("anchor_id", this.f26536q.getOwnerUserId()).mo12646a("room_id", this.f26536q.getId()).mo12651a("enter_from_merge", C6544e.m13987a()).mo12651a("enter_method", C6544e.m13990d()).mo12651a("action_type", "click").mo12651a("request_id", C6544e.m13997k()).mo12651a("video_id", C6544e.m13992f()).mo12651a("show_entrance", "live_left_corner").mo12655b();
        }
    }

    /* renamed from: j */
    private void m19660j() {
        Room room = this.f26536q;
        if (room != null && room.getOwner() != null && this.f26536q.getOwner().getSubscribeInfo() != null) {
            C6501b.C6502a.m13948a("livesdk_privilege_badge_show").mo12646a("anchor_id", this.f26536q.getOwnerUserId()).mo12646a("room_id", this.f26536q.getId()).mo12651a("enter_from_merge", C6544e.m13987a()).mo12651a("enter_method", C6544e.m13990d()).mo12651a("action_type", "click").mo12651a("request_id", C6544e.m13997k()).mo12651a("video_id", C6544e.m13992f()).mo12651a("show_entrance", "live_left_corner").mo12655b();
        }
    }

    /* renamed from: m */
    private void m19663m() {
        if (!m19664n()) {
            C13628n.m24510a(this.f26528i, 8);
            Room room = this.f26536q;
            if (room != null) {
                long anchorTabType = room.getAnchorTabType();
                if (anchorTabType == 3) {
                    C13628n.m24510a(this.f26528i, 0);
                } else if (anchorTabType == 4) {
                    C13628n.m24510a(this.f26528i, 8);
                } else if (!this.f26538s) {
                    this.f26528i.setVisibility(0);
                }
            } else if (!this.f26538s) {
                C13628n.m24510a(this.f26528i, 0);
            }
        }
    }

    /* renamed from: p */
    private void m19666p() {
        AnimatorSet animatorSet = this.f26516O;
        if (animatorSet == null || !animatorSet.isRunning()) {
            int q = m19667q();
            this.f26527h.setVisibility(0);
            this.f26528i.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f26527h, "alpha", 0.0f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f26527h, "translationY", (float) q, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f26528i, "alpha", 1.0f, 0.0f);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f26528i, "translationY", 0.0f, (float) (-q));
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f26516O = animatorSet2;
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            this.f26516O.setDuration(200L);
            this.f26516O.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.C110153 */

                static {
                    Covode.recordClassIndex(12632);
                }

                public final void onAnimationEnd(Animator animator) {
                    LiveRoomUserInfoWidget.this.f26528i.setVisibility(4);
                }
            });
            this.f26516O.start();
            this.f26515N = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        IMessageManager iMessageManager;
        AbstractC9168b likeHelper;
        this.f26541v = false;
        this.dataChannel.mo28316b(this);
        C18494b.m34422b("js_event_report_log_live_follow", this);
        this.f26535p.mo142944a();
        C11279p.m20021c(getView());
        this.f26511J = 0;
        this.f26540u = false;
        this.f26537r = null;
        WeakHandler weakHandler = this.f26520S;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
        if (this.f26536q != null && (likeHelper = ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getLikeHelper(this.f26536q.getId())) != null && likeHelper.mo15295n() && likeHelper.mo15293l()) {
            likeHelper.mo15280b(this.f26521T);
            likeHelper.mo15280b(this);
            likeHelper.mo15270a((View) null);
        }
        if (!(this.dataChannel == null || (iMessageManager = (IMessageManager) this.dataChannel.mo28318b(C9068cg.class)) == null)) {
            iMessageManager.removeMessageListener(EnumC9596a.LIKE.getIntType(), this);
        }
        this.f26519R = null;
        IMessageManager iMessageManager2 = (IMessageManager) this.dataChannel.mo28318b(C9068cg.class);
        if (iMessageManager2 != null) {
            iMessageManager2.removeMessageListener(EnumC9596a.LIKE.getIntType(), this);
            iMessageManager2.removeMessageListener(EnumC9596a.USER_SEQ.getIntType(), this);
        }
        m19656f();
        AnimatorSet animatorSet = this.f26516O;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f26516O.cancel();
        }
        AnimatorSet animatorSet2 = this.f26517P;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            this.f26517P.cancel();
        }
        ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).xClearStorageItem(this.context, "user_subscribe_entry_info");
    }

    /* renamed from: a */
    public final void mo17854a() {
        AbstractC4367a aVar;
        Room room;
        if (isViewValid()) {
            if (this.f26519R != null) {
                if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132253e = m19654d();
                }
                if (!C58029j.f132253e) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.edd);
                    return;
                }
            }
            if (!C11115u.m19743a().mo17915b().mo13165e()) {
                Bundle bundle = new Bundle();
                bundle.putString("enter_from", "live_detail");
                bundle.putString("action_type", "follow");
                bundle.putString("source", "live");
                bundle.putString("v1_source", "follow");
                this.f26540u = true;
                AbstractC6872f b = C11115u.m19743a().mo17915b();
                Context context = this.context;
                C6876j.C6877a a = C6876j.m14732a();
                a.f17232a = C6782a.m14569a();
                a.f17233b = C6782a.m14570b();
                a.f17236e = "live_detail";
                a.f17237f = "follow";
                a.f17235d = "live";
                a.f17234c = 1;
                b.mo13149a(context, a.mo13173a()).mo143062b(new C6873g());
                return;
            }
            if (this.f26519R != null) {
                ((IHostApp) C6193a.m13435a(IHostApp.class)).checkAndShowGuide(this.f26519R, "live", this.context.getResources().getString(R.string.gul));
            }
            User owner = this.f26536q.getOwner();
            if (!(this.f26538s || (aVar = this.f26545z) == null || !aVar.isMicRoomForCurrentRoom() || (room = this.f26536q) == null || room.officialChannelInfo == null)) {
                owner = this.f26536q.officialChannelInfo.f23136a;
            }
            if (C11199a.m19850a(this.dataChannel) && this.f26536q.author() != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("refer", "follow_button");
                HashMap hashMap2 = new HashMap();
                hashMap2.put("anchor_id", String.valueOf(this.f26536q.author().getId()));
                hashMap2.put("room_id", String.valueOf(this.f26536q.getId()));
                C11199a.m19849a("live_ad", "follow", hashMap, hashMap2);
            }
            if (this.f26519R != null) {
                C11115u.m19743a().mo17915b().mo13151a(((C6869e.AbstractC6870a) ((C6869e.AbstractC6870a) ((C6869e.AbstractC6870a) ((C6869e.AbstractC6870a) ((C6865d.AbstractC6866a) new C6869e.C6871b().mo13134a(owner.getId())).mo13136a(this.f26536q.getRequestId()).mo13139b(this.f26518Q).mo13140c("live").mo13138b(this.f26536q.getId()).mo13142d(this.f26536q.getLabels())).mo13143a(this.f26519R)).mo13145e("live_detail")).mo13146f("follow")).mo13141c()).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143271a(getAutoUnbindTransformer()).mo143062b(new AbstractC88986z<C11688a>() {
                    /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.C110186 */

                    static {
                        Covode.recordClassIndex(12635);
                    }

                    @Override // p4560f.p4561a.AbstractC88986z
                    public final void onComplete() {
                    }

                    @Override // p4560f.p4561a.AbstractC88986z
                    public final void onSubscribe(AbstractC88412b bVar) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4560f.p4561a.AbstractC88986z
                    public final /* synthetic */ void onNext(C11688a aVar) {
                        LiveRoomUserInfoWidget.this.mo17858a(aVar, false);
                    }

                    @Override // p4560f.p4561a.AbstractC88986z
                    public final void onError(Throwable th) {
                        if (LiveRoomUserInfoWidget.this.isViewValid()) {
                            LiveRoomUserInfoWidget.this.mo17857a(EnumC11022a.UNFOLLOW);
                            C11264f.m19957a(LiveRoomUserInfoWidget.this.context, th);
                        }
                    }
                });
            }
            if (C3958s.m9646b(this.dataChannel)) {
                mo17857a(EnumC11022a.FOLLOW_ANIM);
            } else {
                mo17857a(EnumC11022a.FOLLOWED);
            }
            m19651a("follow_icon", (Map<String, String>) null);
        }
    }

    @Override // com.bytedance.android.live.p247f.AbstractC4318a.AbstractC4319a
    /* renamed from: a */
    public final void mo10009a(boolean z) {
        m19663m();
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        this.f26536q = room;
        onLoad(new Object[]{room});
    }

    /* renamed from: a */
    private static boolean m19652a(Room room) {
        try {
            if (room.officialChannelInfo.f23136a.getId() == room.getOwnerUserId()) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo17853a(Long l) {
        this.f26511J = l.longValue();
        this.f26509H.setText(this.context.getString(R.string.gkk, C3910b.m9544b(l.longValue())));
        m19665o();
        return C89391z.f203057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17855a(View view) {
        if (this.dataChannel != null && this.dataChannel.mo28318b(C9076co.class) != null && !((Boolean) this.dataChannel.mo28318b(C9076co.class)).booleanValue()) {
            C6779a.m14563a().mo13053a(new C11756a("subscribe_live_left_corner"));
        } else if (view.getId() == R.id.d71) {
            ((AbstractC5834a) C6193a.m13435a(AbstractC5834a.class)).openUserSubscribeState(C3966y.m9669e(), this.f26536q, "live_left_corner");
        } else if (view.getId() == R.id.eao) {
            ((AbstractC5834a) C6193a.m13435a(AbstractC5834a.class)).openUserSubscribeEntry(C3966y.m9669e(), this.f26536q, "live_left_corner");
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        if (iMessage != null) {
            if (iMessage instanceof C9605ai) {
                C9605ai aiVar = (C9605ai) iMessage;
                if (!aiVar.f16442c) {
                    m19650a((long) aiVar.f23313a);
                }
            } else if (iMessage instanceof C9719cc) {
                C9719cc ccVar = (C9719cc) iMessage;
                if (ccVar.f23687a == 3) {
                    m19653b((long) ccVar.f23692j);
                    AnimatorSet animatorSet = this.f26517P;
                    if (animatorSet == null || !animatorSet.isRunning()) {
                        if (this.f26527h.getVisibility() != 0) {
                            m19666p();
                        }
                        this.f26520S.removeMessages(3);
                        this.f26520S.removeMessages(2);
                        this.f26520S.sendEmptyMessageDelayed(3, (long) f26502b);
                        return;
                    }
                    long animatedFraction = (long) ((1.0f - ((ValueAnimator) this.f26517P.getChildAnimations().get(0)).getAnimatedFraction()) * 200.0f);
                    this.f26520S.removeMessages(2);
                    this.f26520S.sendEmptyMessageDelayed(2, animatedFraction);
                }
            }
        }
    }

    /* renamed from: a */
    private void m19650a(long j) {
        if (j <= 0) {
            this.f26512K = 0;
        } else if (j > this.f26512K) {
            long j2 = 2147483647L;
            if (j <= 2147483647L) {
                j2 = (long) ((int) j);
            }
            this.f26512K = j2;
        }
        TextView textView = this.f26528i;
        if (textView != null) {
            int i = this.f26504C;
            if (i == 2 || (i == 1 && this.f26505D)) {
                Drawable c = C3966y.m9665c(2131234617);
                c.setBounds(0, C3966y.m9653a(-1.0f), C3966y.m9653a(11.0f), C3966y.m9653a(10.0f));
                this.f26528i.setCompoundDrawablePadding(C3966y.m9653a(2.0f));
                this.f26528i.setCompoundDrawables(c, null, null, null);
                this.f26528i.setText(((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).formatLikeNumber(this.f26512K));
                return;
            }
            textView.setCompoundDrawablePadding(0);
            this.f26528i.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f26528i.setText(C3966y.m9659a(R.plurals.ft, (int) this.f26512K, ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).formatLikeNumber(this.f26512K)));
        }
    }

    /* renamed from: b */
    private void m19653b(long j) {
        if (j <= 0) {
            this.f26513L = 0;
        } else if (j > this.f26513L) {
            long j2 = 2147483647L;
            if (j <= 2147483647L) {
                j2 = (long) ((int) j);
            }
            this.f26513L = j2;
        }
        TextView textView = this.f26527h;
        if (textView != null) {
            int i = this.f26504C;
            if (i == 2 || (i == 1 && this.f26505D)) {
                Drawable c = C3966y.m9665c(2131234618);
                c.setBounds(0, C3966y.m9653a(-1.0f), C3966y.m9653a(11.0f), C3966y.m9653a(10.0f));
                this.f26527h.setCompoundDrawablePadding(C3966y.m9653a(2.0f));
                this.f26527h.setCompoundDrawables(c, null, null, null);
                this.f26527h.setText(((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).formatLikeNumber(this.f26513L));
                return;
            }
            textView.setCompoundDrawablePadding(0);
            this.f26527h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f26527h.setText(C3966y.m9660a((int) R.string.e_v, ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).formatLikeNumber(this.f26513L)));
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        EnumC11728i iVar;
        String str;
        int i = message.what;
        if (i == 2) {
            AnimatorSet animatorSet = this.f26517P;
            if (animatorSet == null || !animatorSet.isRunning()) {
                m19666p();
                this.f26520S.removeMessages(3);
                this.f26520S.sendEmptyMessageDelayed(3, (long) f26502b);
                return;
            }
            this.f26520S.sendEmptyMessage(2);
        } else if (i == 3) {
            AnimatorSet animatorSet2 = this.f26517P;
            if (animatorSet2 == null || !animatorSet2.isRunning()) {
                int q = m19667q();
                int i2 = 0;
                this.f26528i.setVisibility(0);
                this.f26527h.setVisibility(0);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f26528i, "alpha", 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f26528i, "translationY", (float) q, 0.0f);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f26527h, "alpha", 1.0f, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f26527h, "translationY", 0.0f, (float) (-q));
                AnimatorSet animatorSet3 = new AnimatorSet();
                this.f26517P = animatorSet3;
                animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                this.f26517P.setDuration(200L);
                this.f26517P.addListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.C110164 */

                    static {
                        Covode.recordClassIndex(12633);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        LiveRoomUserInfoWidget.this.f26527h.setVisibility(4);
                    }
                });
                this.f26517P.start();
                Room room = this.f26536q;
                if (room != null) {
                    iVar = room.getStreamType();
                } else {
                    iVar = EnumC11728i.VIDEO;
                }
                String a = C11729j.m20684a(iVar);
                if (this.f26538s) {
                    str = "anchor";
                } else {
                    User user = this.f26537r;
                    if (user == null || user.getUserAttr() == null || !this.f26537r.getUserAttr().f23192b) {
                        str = "viewer";
                    } else {
                        str = "admin";
                    }
                }
                if (this.f26515N > 0) {
                    i2 = (int) ((System.currentTimeMillis() - this.f26515N) / 1000);
                    this.f26515N = 0;
                }
                C6501b.C6502a.m13948a("livesdk_share_count_show").mo12639a().mo12651a("live_type", a).mo12651a("admin_type", str).mo12645a("duration", i2).mo12655b();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object... objArr) {
        int i;
        this.f26522c = (ViewGroup) findViewById(R.id.iv);
        this.f26523d = (VHeadView) findViewById(R.id.bdt);
        this.f26506E = (HSImageView) findViewById(R.id.btp);
        this.f26507F = (LiveTextView) findViewById(R.id.cjx);
        this.f26524e = findViewById(R.id.cpp);
        this.f26522c.setOnClickListener(new View$OnClickListenerC11026b(this));
        this.f26525f = (TextView) findViewById(R.id.fa1);
        this.f26526g = (ImageView) findViewById(R.id.n1);
        this.f26508G = findViewById(R.id.ctk);
        this.f26509H = (TextView) findViewById(R.id.az7);
        this.f26527h = (TextView) findViewById(R.id.dxq);
        this.f26528i = (TextView) findViewById(R.id.c8p);
        this.f26529j = findViewById(R.id.ayd);
        this.f26530k = (ViewGroup) findViewById(R.id.b6q);
        if (C3958s.m9646b(this.dataChannel)) {
            i = R.id.b6a;
        } else {
            i = R.id.b6u;
        }
        View findViewById = findViewById(i);
        this.f26531l = findViewById;
        findViewById.setOnClickListener(new View$OnClickListenerC11027c(this));
        this.f26532m = (HSAnimImageView) findViewById(R.id.b6w);
        ImageView imageView = (ImageView) findViewById(R.id.eao);
        this.f26533n = imageView;
        imageView.setOnClickListener(new View$OnClickListenerC11038n(this));
        ImageView imageView2 = (ImageView) findViewById(R.id.d71);
        this.f26510I = imageView2;
        imageView2.setOnClickListener(new View$OnClickListenerC11042r(this));
        TextView textView = (TextView) findViewById(R.id.eaq);
        this.f26534o = textView;
        textView.setOnClickListener(null);
        for (String str : LiveRoomUserInfoLanguageSetting.INSTANCE.getValue()) {
            if (str.equals(C11120d.m19751a(((IHostContext) C6193a.m13435a(IHostContext.class)).currentLocale()))) {
                this.f26505D = true;
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object... objArr) {
        TextView textView;
        long likeCount;
        AbstractC4367a aVar;
        long j;
        Room room;
        LiveTextView liveTextView;
        Room room2;
        this.f26545z = (AbstractC4367a) C6193a.m13435a(AbstractC4367a.class);
        this.f26536q = (Room) this.dataChannel.mo28318b(C9093de.class);
        this.f26538s = ((Boolean) this.dataChannel.mo28318b(C9119ed.class)).booleanValue();
        this.f26539t = ((Boolean) this.dataChannel.mo28318b(C9076co.class)).booleanValue();
        this.f26518Q = (String) this.dataChannel.mo28318b(C11752b.class);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        m19663m();
        C18494b.m34417a("js_event_report_log_live_follow", this);
        if (this.f26538s) {
            this.f26525f.setMaxWidth(C3966y.m9653a(131.0f));
        }
        if (!(this.f26538s || this.f26545z == null || (liveTextView = this.f26507F) == null || this.f26508G == null)) {
            C13628n.m24510a(liveTextView, 8);
            C13628n.m24510a(this.f26508G, 0);
            if (!this.f26538s && this.f26545z.isMicRoomForCurrentRoom()) {
                C13628n.m24510a(this.f26507F, 0);
                C13628n.m24510a(this.f26508G, 8);
                if (!(this.f26507F == null || (room2 = this.f26536q) == null || room2.officialChannelInfo == null || this.f26536q.getOfficialChannelInfo().f23137b == null)) {
                    this.f26507F.setText(this.f26536q.getOfficialChannelInfo().f23137b);
                }
            }
        }
        this.f26519R = (ActivityC0945e) this.context;
        if (!this.f26538s) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("anchor_id", new StringBuilder().append(this.f26536q.getOwnerUserId()).toString());
                hashMap.put("room_id", this.f26536q.getIdStr());
                hashMap.put("rank_type", new String[]{"money", "fans", "nothing", "room_money"}[LiveAnchorInfoAbtestSetting.INSTANCE.getValue()]);
                ((AbstractC11807g) C6193a.m13435a(AbstractC11807g.class)).mo18865a("livesdk_live_room_info", hashMap);
            } catch (Exception e) {
                C3854a.m9458a("ALogger", e);
            }
            AbstractC4367a aVar2 = this.f26545z;
            if (aVar2 == null || !aVar2.isMicRoomForCurrentRoom() || (room = this.f26536q) == null || room.getOfficialChannelInfo() == null || this.f26536q.getOfficialChannelInfo().f23136a == null) {
                C88411a aVar3 = this.f26535p;
                Room room3 = this.f26536q;
                if (room3 == null || room3.getOwner() == null) {
                    j = 0;
                } else {
                    j = this.f26536q.getOwner().getId();
                }
                aVar3.mo142945a(b.mo13163d(j).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C11045u(this), C11046v.f26592a));
            } else {
                this.f26535p.mo142945a(b.mo13163d(this.f26536q.getOfficialChannelInfo().f23136a.getId()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C11043s(this), C11044t.f26590a));
            }
        }
        if (this.f26538s) {
            mo17857a(EnumC11022a.FOLLOWED);
        }
        if (!(this.f26509H == null || this.f26536q.getOwner() == null || this.f26536q.getOwner().getFollowInfo() == null)) {
            this.f26511J = this.f26536q.getOwner().getFollowInfo().getFollowerCount();
            this.f26509H.setText(this.context.getString(R.string.gkk, C3910b.m9544b(this.f26511J)));
        }
        this.f26535p.mo142945a(b.mo13162c(this.f26536q.getOwnerUserId()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C11047w(this), C11048x.f26594a));
        C6203g.f15476a.post(new RunnableC11028d(this), this);
        this.f26520S = new WeakHandler(this.context.getMainLooper(), this);
        this.dataChannel.mo28309a((AbstractC1204m) this, C9101dm.class, (AbstractC89172b) new C11029e(this)).mo28312a((Object) this, C9066ce.class, (AbstractC89172b) new C11030f(this)).mo28309a((AbstractC1204m) this, C9034ba.class, (AbstractC89172b) new C11031g(this)).mo28309a((AbstractC1204m) this, C5769c.class, (AbstractC89172b) new C11032h(this)).mo28309a((AbstractC1204m) this, C5767ac.class, (AbstractC89172b) new C11033i(this)).mo28309a((AbstractC1204m) this, C10331a.class, (AbstractC89172b) new C11034j(this));
        DataChannelGlobal.f42558d.mo28322a(this, this, C5793y.class, new C11035k(this));
        if (getView() != null) {
            getView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.ViewTreeObserver$OnGlobalLayoutListenerC110091 */

                static {
                    Covode.recordClassIndex(12626);
                }

                public final void onGlobalLayout() {
                    if (LiveRoomUserInfoWidget.this.getView() != null) {
                        LiveRoomUserInfoWidget.this.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        int[] iArr = new int[2];
                        LiveRoomUserInfoWidget.this.getView().getLocationOnScreen(iArr);
                        float height = (float) (iArr[1] + LiveRoomUserInfoWidget.this.getView().getHeight());
                        Context e = C3966y.m9669e();
                        if (e != null) {
                            C11226ao.f26873a = (int) ((height - ((float) C13628n.m24525e(e))) - C13628n.m24520b(e, 52.0f));
                        }
                    }
                }
            });
        }
        ImageView imageView = (ImageView) findViewById(R.id.dp8);
        if (this.f26528i.getVisibility() == 0) {
            textView = this.f26528i;
        } else {
            textView = this.f26527h;
        }
        this.f26521T = new UserInfoLikeHelper(this, imageView, textView);
        this.f26512K = 0;
        Room room4 = this.f26536q;
        if (room4 == null) {
            likeCount = 0;
        } else {
            likeCount = room4.getLikeCount();
        }
        AbstractC9168b bVar = null;
        if (this.f26536q != null) {
            bVar = ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getLikeHelper(this.f26536q.getId());
        }
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.mo28318b(C9068cg.class);
        if (bVar != null && bVar.mo15295n()) {
            if (bVar.mo15293l()) {
                if (this.f26538s || (aVar = this.f26545z) == null || !aVar.isMicRoomForCurrentRoom() || m19652a(this.f26536q)) {
                    bVar.mo15270a(this.f26523d);
                }
                if (bVar.mo15296o()) {
                    bVar.mo15271a(this.f26521T);
                }
                if (bVar.mo15288g() > 0) {
                    likeCount += (long) bVar.mo15288g();
                }
                bVar.mo15271a(this);
            }
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(EnumC9596a.LIKE.getIntType(), this);
            }
        }
        m19650a(likeCount);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC9596a.USER_SEQ.getIntType(), this);
        }
        if (this.f26536q != null) {
            ((AbstractC4318a) C6193a.m13435a(AbstractC4318a.class)).addOnUserCountVisibilityChangeListener(this.f26536q.getId(), this);
        }
        if (m19664n()) {
            Room room5 = this.f26536q;
            if (!(room5 == null || room5.getStats() == null)) {
                this.f26513L = (long) this.f26536q.getStats().getShareCount();
            }
            m19653b(this.f26513L);
            this.f26527h.setVisibility(4);
            this.f26528i.setVisibility(0);
            if (this.f26513L > 0) {
                this.f26520S.sendEmptyMessageDelayed(2, (long) f26501a);
            }
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(EnumC9596a.SOCIAL.getIntType(), this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17856a(C9591j jVar) {
        AbstractC4367a aVar;
        if (jVar == null || (aVar = this.f26545z) == null || (aVar.isMicRoomForCurrentRoom() && !this.f26538s)) {
            this.f26506E.setImageDrawable(null);
        } else {
            C3941k.m9601a(this.f26506E, jVar.f23265a);
        }
    }

    /* renamed from: a */
    private void m19651a(String str, Map<String, String> map) {
        String str2;
        String str3;
        Room room;
        try {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.put("growth_deepevent", "1");
            if (!C13627m.m24498a(C7411d.m15284a().mo13614e())) {
                hashMap.put("enter_live_method", C7411d.m15284a().mo13614e());
            }
            String g = C6544e.m13993g();
            if (TextUtils.isEmpty(g) || !"click_push_live_cd_user".equals(g)) {
                hashMap.put("is_subscribe", "0");
            } else {
                hashMap.put("is_subscribe", "1");
            }
            User owner = this.f26536q.getOwner();
            String valueOf = String.valueOf(owner.getId());
            String str4 = "live_audience_c_anchor";
            AbstractC4367a aVar = this.f26545z;
            if (!(aVar == null || (room = this.f26536q) == null || !aVar.isMicRoomForRoom(room))) {
                if (this.f26545z.isMicAudience()) {
                    str4 = "carousel_audience_c_official_id";
                } else {
                    str4 = "loyal_audience_c_official_id";
                }
                valueOf = String.valueOf(this.f26536q.officialChannelInfo.f23136a.getId());
            }
            if (!this.f26538s) {
                if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isInCoHost()) {
                    hashMap.put("connection_type", "anchor");
                    hashMap.put("anchor_type", "current");
                    hashMap.put("channel_id", String.valueOf(C4384b.C4385a.m10496a().f11957e));
                }
                if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isRoomInBattle()) {
                    hashMap.put("connection_type", "manual_pk");
                    hashMap.put("pk_id", String.valueOf(((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getBattleId()));
                }
                if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isInMultiGuest()) {
                    hashMap.put("connection_type", "audience");
                }
            }
            hashMap.put("to_user_id", valueOf);
            hashMap.put("request_page", str4);
            hashMap.put("click_user_position", str);
            if (this.f26539t) {
                str2 = "portrait";
            } else {
                str2 = "landscape";
            }
            hashMap.put("room_orientation", str2);
            Room room2 = this.f26536q;
            if (!(room2 == null || room2.getOwner() == null || this.f26536q.getOwner().getFollowInfo() == null)) {
                int followStatus = (int) this.f26536q.getOwner().getFollowInfo().getFollowStatus();
                if (followStatus == 1 || followStatus == 3) {
                    str3 = "mutual";
                } else {
                    str3 = "single";
                }
                hashMap.put("follow_type", str3);
            }
            C6501b.C6502a.m13948a("livesdk_follow").mo12652a((Map<String, String>) hashMap).mo12640a(new C6526e("live", owner.getId())).mo12643a(this.dataChannel).mo12654b("live_interact").mo12658d("live_detail").mo12655b();
        } catch (Exception e) {
            C3854a.m9453a(6, f26500B, e.toString());
        }
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9170d
    /* renamed from: a */
    public final void mo10822a(AbstractC9168b bVar, int i, int i2, float f, float f2, float f3, float f4) {
        m19650a(this.f26512K + 1);
    }
}
