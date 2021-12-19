package com.bytedance.android.live.liveinteract.multiguest.opt.widget;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Message;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3888a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.app.p231a.C4060b;
import com.bytedance.android.live.liveinteract.api.AbstractC4444o;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.C5300c;
import com.bytedance.android.live.liveinteract.multiguest.opt.p339b.p340a.DialogC5350b;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p317a.C5123a;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5140a;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p320d.AbstractC5170a;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p320d.C5173b;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5182a;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p334a.DialogC5211a;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a;
import com.bytedance.android.live.liveinteract.multilive.anchor.p354e.C5517c;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5389e;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5390f;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5391g;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5393i;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5395k;
import com.bytedance.android.live.liveinteract.multilive.p341a.p344c.C5400b;
import com.bytedance.android.live.liveinteract.multilive.p359b.C5586a;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5600m;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5702a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5703b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5741z;
import com.bytedance.android.live.liveinteract.platform.p368c.C5668c;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.chatroom.api.LinkReviewApi;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7656a;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7665d;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.android.livesdk.chatroom.model.p497c.C7677b;
import com.bytedance.android.livesdk.chatroom.p488c.C7399p;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8095br;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p456as.C6873g;
import com.bytedance.android.livesdk.p456as.C6876j;
import com.bytedance.android.livesdk.p456as.EnumC6874h;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p542g.C8779e;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9074cm;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

public final class MultiGuestAsGuestWidget extends LiveWidget implements C5189g.AbstractC5191b, WeakHandler.IHandler, AbstractC33974au {

    /* renamed from: g */
    public static final C5368a f13870g = new C5368a((byte) 0);

    /* renamed from: a */
    public DialogC5350b f13871a;

    /* renamed from: b */
    public C5300c f13872b;

    /* renamed from: c */
    public AbstractC5258a f13873c;

    /* renamed from: d */
    public Runnable f13874d;

    /* renamed from: e */
    public DialogC5211a.EnumC5215a f13875e = DialogC5211a.EnumC5215a.SEND_REQUEST;

    /* renamed from: f */
    public C5393i f13876f;

    /* renamed from: h */
    private C5400b f13877h;

    /* renamed from: i */
    private DialogC5211a f13878i;

    /* renamed from: j */
    private LiveDialog f13879j;

    /* renamed from: k */
    private WeakHandler f13880k;

    /* renamed from: l */
    private Room f13881l;

    /* renamed from: m */
    private final AbstractC89172b<C7399p, C89391z> f13882m = new C5369b(this);

    /* renamed from: n */
    private final AbstractC5170a f13883n = new C5173b();

    /* renamed from: o */
    private final FrameLayout f13884o;

    static {
        Covode.recordClassIndex(5962);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: a */
    public final void mo10546a(Throwable th) {
        AbstractC8095br.m16255a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bee;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget$a */
    public static final class C5368a {
        static {
            Covode.recordClassIndex(5963);
        }

        private C5368a() {
        }

        public /* synthetic */ C5368a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5191b
    /* renamed from: h */
    public final DialogC5211a.EnumC5215a mo10976h() {
        return this.f13875e;
    }

    /* renamed from: a */
    public final void mo11193a(boolean z) {
        C5153d i;
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        if (!b.mo13165e()) {
            AbstractC6872f b2 = C11115u.m19743a().mo17915b();
            Context context = this.context;
            C6876j.C6877a a = C6876j.m14732a();
            a.f17232a = C3966y.m9657a((int) R.string.gof);
            a.f17235d = "interact";
            a.f17234c = 0;
            b2.mo13149a(context, a.mo13173a()).mo143271a(getAutoUnbindTransformer()).mo143062b(new C6873g());
        } else if (!C11115u.m19743a().mo17915b().mo13158a(EnumC6874h.INTERACT)) {
            if (z) {
                this.f13876f = null;
            }
            C5300c cVar = this.f13872b;
            if (cVar == null || !cVar.mo11166r()) {
                C5300c cVar2 = this.f13872b;
                if (cVar2 == null || (i = cVar2.mo11157i()) == null || i.mo10909f() <= 0) {
                    C4386c a2 = C4386c.m10499a();
                    C89219l.m154716b(a2, "");
                    T t = a2.f17248n;
                    if (t != null && t.intValue() == 0) {
                        m11845j();
                        return;
                    }
                }
                C5300c cVar3 = this.f13872b;
                if (cVar3 != null) {
                    cVar3.mo11162n();
                    return;
                }
                return;
            }
            m11845j();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5191b
    /* renamed from: a */
    public final void mo10967a(List<? extends C7665d> list, String str) {
        m11844a(false, list, str);
    }

    /* renamed from: k */
    private final AbstractC0952i m11846k() {
        return (AbstractC0952i) this.dataChannel.mo28318b(C9021ao.class);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5191b
    /* renamed from: a */
    public final void mo10959a() {
        C5300c cVar = this.f13872b;
        if (cVar != null) {
            cVar.mo11154f("rtc_error");
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: g */
    public final String mo10549g() {
        return getClass().getName();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDetachWidget() {
        super.onDetachWidget();
        C5300c cVar = this.f13872b;
        if (cVar != null) {
            cVar.mo11163o();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5191b
    /* renamed from: d */
    public final void mo10973d() {
        AbstractC5258a aVar = this.f13873c;
        if (aVar != null) {
            aVar.mo11087c(true);
        }
        Runnable runnable = this.f13874d;
        if (runnable != null) {
            runnable.run();
        }
        this.f13874d = null;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget$l */
    public static final class C5379l implements IBroadcastService.AbstractC3017a {

        /* renamed from: a */
        final /* synthetic */ MultiGuestAsGuestWidget f13898a;

        /* renamed from: b */
        final /* synthetic */ int f13899b;

        static {
            Covode.recordClassIndex(5974);
        }

        @Override // com.bytedance.android.live.broadcast.api.IBroadcastService.AbstractC3017a
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8220a() {
            C3854a.m9453a(3, "LinkInRoomVideoGuestWid", "canceled dialog for edit dob");
            C6501b.C6502a.m13948a("livesdk_add_birth_popup_window_click").mo12651a("request_page", C5713h.m12502a(this.f13899b)).mo12651a("click_type", "cancel").mo12639a().mo12655b();
            this.f13898a.dataChannel.mo28319c(C5389e.class);
            return C89391z.f203057a;
        }

        @Override // com.bytedance.android.live.broadcast.api.IBroadcastService.AbstractC3017a
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8221a(String str) {
            if (C89219l.m154714a((Object) str, (Object) "") && this.f13899b == 2) {
                this.f13898a.dataChannel.mo28319c(C5390f.class);
            }
            C3854a.m9453a(6, "LinkInRoomVideoGuestWid", "edit dob failed and msg:".concat(String.valueOf(str)));
            return C89391z.f203057a;
        }

        C5379l(MultiGuestAsGuestWidget multiGuestAsGuestWidget, int i) {
            this.f13898a = multiGuestAsGuestWidget;
            this.f13899b = i;
        }

        @Override // com.bytedance.android.live.broadcast.api.IBroadcastService.AbstractC3017a
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8222a(String str, String str2) {
            C3854a.m9453a(3, "LinkInRoomVideoGuestWid", " enter edit dob succeed and dob:" + str + ", appealUrl:" + str2);
            C8779e.f21647a = true;
            if (this.f13899b == 2) {
                this.f13898a.dataChannel.mo28319c(C5391g.class);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: j */
    private final void m11845j() {
        long j;
        User owner;
        FollowInfo followInfo;
        this.f13875e = DialogC5211a.EnumC5215a.SEND_REQUEST;
        C5300c cVar = this.f13872b;
        if (cVar != null) {
            cVar.mo11143a(0);
        }
        Room room = this.f13881l;
        if (room == null || (owner = room.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null) {
            j = 0;
        } else {
            j = followInfo.getFollowStatus();
        }
        C5703b.m12464a("connection_button", j);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5191b
    /* renamed from: c */
    public final void mo10972c() {
        DialogC9148b a = new DialogC9148b.C9149a(this.context).mo15248b(R.string.goh).mo15244a(R.string.gtk, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC5376i.f13893a, false).mo15247a();
        C89219l.m154716b(a, "");
        a.show();
        C5300c cVar = this.f13872b;
        if (cVar != null) {
            cVar.mo11154f("leave_with_money_not_enough");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5191b
    /* renamed from: e */
    public final boolean mo10974e() {
        boolean z;
        C5300c cVar = this.f13872b;
        if (cVar != null) {
            z = cVar.mo11166r();
        } else {
            z = false;
        }
        if (z) {
            C5400b bVar = this.f13877h;
            if (bVar == null || !bVar.mo18054n()) {
                return false;
            }
            return true;
        }
        DialogC5211a aVar = this.f13878i;
        if (aVar == null || !aVar.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5191b
    /* renamed from: f */
    public final void mo10975f() {
        DialogC5211a aVar;
        C5400b bVar;
        C5400b bVar2 = this.f13877h;
        if (!(bVar2 == null || !bVar2.mo18054n() || (bVar = this.f13877h) == null)) {
            bVar.dismiss();
        }
        DialogC5211a aVar2 = this.f13878i;
        if (aVar2 != null && aVar2.isShowing() && (aVar = this.f13878i) != null) {
            aVar.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5191b
    /* renamed from: i */
    public final void mo10977i() {
        if (mo10974e() && this.f13875e == DialogC5211a.EnumC5215a.GO_LIVE) {
            C5300c cVar = this.f13872b;
            if (cVar == null || !cVar.mo11166r()) {
                DialogC5211a aVar = this.f13878i;
                if (aVar != null) {
                    aVar.dismiss();
                    return;
                }
                return;
            }
            C5400b bVar = this.f13877h;
            if (bVar != null) {
                bVar.dismiss();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5191b
    /* renamed from: b */
    public final void mo10968b() {
        Object obj;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            obj = dataChannel.mo28318b(C9074cm.class);
        } else {
            obj = null;
        }
        if (!C89219l.m154714a(obj, (Object) true)) {
            if (this.f13879j == null) {
                this.f13879j = new LiveDialog.C4056a(this.context).mo9504b(R.string.e35).mo9500a(R.string.eev, C5380m.f13900a).mo9503a();
            }
            LiveDialog liveDialog = this.f13879j;
            if (liveDialog != null) {
                liveDialog.show();
            }
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        C5668c h;
        WeakHandler weakHandler;
        C5300c cVar = this.f13872b;
        if (cVar != null) {
            cVar.mo11160l();
        }
        C5300c cVar2 = this.f13872b;
        if (!(cVar2 == null || (h = cVar2.mo11156h()) == null || !h.f14397d || (weakHandler = this.f13880k) == null)) {
            weakHandler.sendEmptyMessageDelayed(140000, 180000);
        }
        DialogC5211a aVar = this.f13878i;
        if (aVar != null && aVar.isShowing()) {
            DialogC5211a aVar2 = this.f13878i;
            if ((aVar2 instanceof DialogC5211a) && aVar2 != null) {
                aVar2.mo10994a(false, PrivacyCert.Builder.with("bpea-464").usage("").tag("link mic camera inactive").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        }
        super.onPause();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        WeakHandler weakHandler = this.f13880k;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
        C5300c cVar = this.f13872b;
        if (cVar != null) {
            cVar.mo11159k();
        }
        DialogC5211a aVar = this.f13878i;
        if (aVar != null && aVar.isShowing()) {
            DialogC5211a aVar2 = this.f13878i;
            if ((aVar2 instanceof DialogC5211a) && aVar2 != null) {
                aVar2.mo10994a(true, PrivacyCert.Builder.with("bpea-463").usage("").tag("link mic camera active").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0082, code lost:
        if (r4 == null) goto L_0x0084;
     */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
        // Method dump skipped, instructions count: 254
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget.onCreate():void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        DialogC5211a aVar;
        C5400b bVar;
        C5702a.m12447a("LinkIn_Guest_Widget_onDestroy");
        if (C5741z.f14563a > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - C5741z.f14563a;
            Map<String, String> a = C5741z.m12605a();
            String str = C5741z.f14565c;
            if (str == null) {
                str = "live_over";
            }
            a.put("trigger", str);
            C5741z.m12606a(null);
            C5586a.m12137a(a, C5586a.m12139b());
            a.put("duration", String.valueOf(uptimeMillis));
            C5741z.m12607a("livesdk_guest_connection_mode_view_duration", a);
            C5741z.f14563a = 0;
        }
        if (C6894d.m14753a().f17273t > 0) {
            C5741z.m12610d(null);
        }
        C6894d.m14753a().mo10159a((Object) false);
        C5300c cVar = this.f13872b;
        if (cVar != null) {
            cVar.mo8577b();
        }
        AbstractC5258a aVar2 = this.f13873c;
        if (aVar2 != null) {
            aVar2.mo11082b();
        }
        C5400b bVar2 = this.f13877h;
        if (!(bVar2 == null || !bVar2.mo18054n() || (bVar = this.f13877h) == null)) {
            bVar.dismiss();
        }
        DialogC5211a aVar3 = this.f13878i;
        if (!(aVar3 == null || !aVar3.isShowing() || (aVar = this.f13878i) == null)) {
            aVar.dismiss();
        }
        this.dataChannel.mo28316b(this);
        DialogC5350b bVar3 = this.f13871a;
        if (bVar3 != null) {
            bVar3.dismiss();
        }
        C6894d.m14753a().mo13188b();
        LiveDialog liveDialog = this.f13879j;
        if (liveDialog != null && liveDialog.isShowing()) {
            LiveDialog liveDialog2 = this.f13879j;
            if (liveDialog2 != null) {
                liveDialog2.dismiss();
            }
            this.f13879j = null;
        }
        super.onDestroy();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget$p */
    static final class DialogInterface$OnDismissListenerC5383p implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ MultiGuestAsGuestWidget f13903a;

        static {
            Covode.recordClassIndex(5978);
        }

        DialogInterface$OnDismissListenerC5383p(MultiGuestAsGuestWidget multiGuestAsGuestWidget) {
            this.f13903a = multiGuestAsGuestWidget;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f13903a.f13871a = null;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5191b
    /* renamed from: a */
    public final void mo10961a(DialogC5211a.EnumC5215a aVar) {
        C89219l.m154721d(aVar, "");
        this.f13875e = aVar;
    }

    /* renamed from: b */
    public final void mo11194b(boolean z) {
        AbstractC5258a aVar = this.f13873c;
        if (aVar != null) {
            aVar.mo11084b(z);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget$e */
    static final class C5372e extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MultiGuestAsGuestWidget f13889a;

        static {
            Covode.recordClassIndex(5967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5372e(MultiGuestAsGuestWidget multiGuestAsGuestWidget) {
            super(1);
            this.f13889a = multiGuestAsGuestWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f13889a.mo11194b(bool.booleanValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget$g */
    static final class C5374g extends AbstractC89220m implements AbstractC89172b<DialogC5211a.EnumC5215a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MultiGuestAsGuestWidget f13891a;

        static {
            Covode.recordClassIndex(5969);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5374g(MultiGuestAsGuestWidget multiGuestAsGuestWidget) {
            super(1);
            this.f13891a = multiGuestAsGuestWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(DialogC5211a.EnumC5215a aVar) {
            DialogC5211a.EnumC5215a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            this.f13891a.f13875e = aVar2;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget$k */
    static final class C5378k implements LiveDialog.AbstractC4057b {

        /* renamed from: a */
        final /* synthetic */ int f13897a;

        static {
            Covode.recordClassIndex(5973);
        }

        C5378k(int i) {
            this.f13897a = i;
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.AbstractC4057b
        /* renamed from: a */
        public final void mo8359a(DialogInterface dialogInterface) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
            C5713h.m12505a(this.f13897a, "ok");
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget$m */
    static final class C5380m implements LiveDialog.AbstractC4057b {

        /* renamed from: a */
        public static final C5380m f13900a = new C5380m();

        static {
            Covode.recordClassIndex(5975);
        }

        C5380m() {
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.AbstractC4057b
        /* renamed from: a */
        public final void mo8359a(DialogInterface dialogInterface) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget$f */
    static final class C5373f extends AbstractC89220m implements AbstractC89172b<C5393i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MultiGuestAsGuestWidget f13890a;

        static {
            Covode.recordClassIndex(5968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5373f(MultiGuestAsGuestWidget multiGuestAsGuestWidget) {
            super(1);
            this.f13890a = multiGuestAsGuestWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C5393i iVar) {
            C5393i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            this.f13890a.f13875e = DialogC5211a.EnumC5215a.SEND_REQUEST;
            this.f13890a.f13876f = iVar2;
            this.f13890a.mo11193a(false);
            return C89391z.f203057a;
        }
    }

    public MultiGuestAsGuestWidget(FrameLayout frameLayout) {
        C89219l.m154721d(frameLayout, "");
        this.f13884o = frameLayout;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5191b
    /* renamed from: a */
    public final void mo10962a(C5600m mVar) {
        C89219l.m154721d(mVar, "");
        AbstractC5258a aVar = this.f13873c;
        if (aVar != null) {
            aVar.mo11076a(mVar);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5191b
    /* renamed from: b */
    public final void mo10970b(Throwable th) {
        C89219l.m154721d(th, "");
        C11264f.m19957a(this.context, th);
        C5300c cVar = this.f13872b;
        if (cVar != null) {
            cVar.mo11154f("join_channel_error");
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        C5300c cVar;
        C89219l.m154721d(message, "");
        if (isViewValid() && 140000 == message.what && (cVar = this.f13872b) != null) {
            cVar.mo11154f("leave_with_background");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5191b
    /* renamed from: a */
    public final void mo10963a(C7677b bVar) {
        C89219l.m154721d(bVar, "");
        if (bVar.f19021a) {
            EnumC4422k a = C5517c.m12022a(bVar.f19022b, bVar.f19023c);
            AbstractC5258a aVar = this.f13873c;
            if (aVar != null) {
                aVar.mo11081a(a);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget$b */
    static final class C5369b extends AbstractC89220m implements AbstractC89172b<C7399p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MultiGuestAsGuestWidget f13885a;

        static {
            Covode.recordClassIndex(5964);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5369b(MultiGuestAsGuestWidget multiGuestAsGuestWidget) {
            super(1);
            this.f13885a = multiGuestAsGuestWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C7399p pVar) {
            C5300c cVar;
            C5300c cVar2;
            C7399p pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            MultiGuestAsGuestWidget multiGuestAsGuestWidget = this.f13885a;
            int i = pVar2.f18332a;
            if (i == 0) {
                C5300c cVar3 = multiGuestAsGuestWidget.f13872b;
                if (cVar3 != null) {
                    cVar3.mo11162n();
                }
            } else if (i == 1) {
                Object obj = pVar2.f18333b;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multiguest.ui.dialog.InteractApplyDialogMt.ApplyDialogType");
                multiGuestAsGuestWidget.f13875e = (DialogC5211a.EnumC5215a) obj;
                int i2 = C5384a.f13904a[multiGuestAsGuestWidget.f13875e.ordinal()];
                if (i2 == 1) {
                    C5300c cVar4 = multiGuestAsGuestWidget.f13872b;
                    if (cVar4 != null) {
                        cVar4.mo11143a(1);
                    }
                } else if (i2 == 2 && (cVar = multiGuestAsGuestWidget.f13872b) != null) {
                    cVar.mo11143a(0);
                }
            } else if (i == 5 && (cVar2 = multiGuestAsGuestWidget.f13872b) != null) {
                cVar2.mo11154f("leave_normally");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget$h */
    static final class C5375h extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MultiGuestAsGuestWidget f13892a;

        static {
            Covode.recordClassIndex(5970);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5375h(MultiGuestAsGuestWidget multiGuestAsGuestWidget) {
            super(1);
            this.f13892a = multiGuestAsGuestWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            boolean z;
            View view2 = view;
            C89219l.m154721d(view2, "");
            MultiGuestAsGuestWidget multiGuestAsGuestWidget = this.f13892a;
            C6894d a = C6894d.m14753a();
            C89219l.m154716b(a, "");
            if (!a.f17258c) {
                AbstractC5258a aVar = multiGuestAsGuestWidget.f13873c;
                if (aVar != null) {
                    if (view2.getVisibility() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.mo11090d(z);
                }
                if (view2.getVisibility() != 0) {
                    View view3 = multiGuestAsGuestWidget.getView();
                    if (view3 != null) {
                        view3.setVisibility(0);
                    }
                } else {
                    View view4 = multiGuestAsGuestWidget.getView();
                    if (view4 != null) {
                        view4.setVisibility(8);
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget$j */
    static final class View$OnClickListenerC5377j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MultiGuestAsGuestWidget f13894a;

        /* renamed from: b */
        final /* synthetic */ LiveDialog f13895b;

        /* renamed from: c */
        final /* synthetic */ int f13896c;

        static {
            Covode.recordClassIndex(5972);
        }

        View$OnClickListenerC5377j(MultiGuestAsGuestWidget multiGuestAsGuestWidget, LiveDialog liveDialog, int i) {
            this.f13894a = multiGuestAsGuestWidget;
            this.f13895b = liveDialog;
            this.f13896c = i;
        }

        public final void onClick(View view) {
            this.f13895b.dismiss();
            C5713h.m12505a(this.f13896c, "appeal");
            AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
            Context context = this.f13894a.context;
            AbstractC6956d.C6957a b = AbstractC6963e.m14872b("https://webcast.tiktokv.com/falcon/webcast_mt/page/appeal_v3/index.html?enter_from=" + C5713h.m12502a(this.f13896c));
            b.f17379c = true;
            b.f17378b = C3966y.m9657a((int) R.string.dtq);
            webViewManager.mo13248a(context, b);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5191b
    /* renamed from: a */
    public final void mo10964a(String str) {
        C89219l.m154721d(str, "");
        AbstractC5258a aVar = this.f13873c;
        if (aVar != null) {
            aVar.mo11083b(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5191b
    /* renamed from: b */
    public final void mo10971b(List<? extends C7666e> list) {
        boolean z;
        DialogC5350b bVar;
        DialogC5350b bVar2;
        C5400b bVar3;
        DataChannel dataChannel;
        C89219l.m154721d(list, "");
        C5300c cVar = this.f13872b;
        if (cVar != null) {
            z = cVar.mo11166r();
        } else {
            z = false;
        }
        if (z) {
            if (isViewValid() && (bVar3 = this.f13877h) != null && bVar3.mo18054n() && (dataChannel = this.dataChannel) != null) {
                dataChannel.mo28320c(C5395k.class, list);
            }
        } else if (isViewValid() && (bVar = this.f13871a) != null && bVar.isShowing() && (bVar2 = this.f13871a) != null) {
            List d = C89206ad.m154682d(list);
            if (d != null) {
                C5123a aVar = bVar2.f13829b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : d) {
                    if (((C7666e) obj).f19003e == 1) {
                        arrayList.add(obj);
                    }
                }
                aVar.mo10853a(arrayList);
                bVar2.mo11182e();
                return;
            }
            try {
                throw new IllegalArgumentException("Required value was null.".toString());
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5191b
    /* renamed from: a */
    public final void mo10960a(C5189g.AbstractC5191b.C5192a aVar) {
        User owner;
        C89219l.m154721d(aVar, "");
        Throwable th = aVar.f13421a;
        if (!(th instanceof C2912a)) {
            C11264f.m19957a(this.context, th);
            return;
        }
        C2912a aVar2 = (C2912a) th;
        String str = null;
        switch (aVar2.getErrorCode()) {
            case 20048:
                String a = C3966y.m9657a((int) R.string.e9_);
                C89219l.m154716b(a, "");
                String a2 = C1764a.m5928a(a, Arrays.copyOf(new Object[]{String.valueOf(LiveAudienceLinkmicLowestAgeSetting.INSTANCE.getValue())}, 1));
                C89219l.m154716b(a2, "");
                DialogC9148b.C9149a aVar3 = new DialogC9148b.C9149a(getContext());
                aVar3.f22256m = true;
                aVar3.f22245b = a2;
                aVar3.mo15244a(R.string.gjt, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC5381n(this), false).mo15249b(R.string.gju, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC5382o.f13902a, false).mo15247a().show();
                C5713h.m12524b("guest_connection_underage_popup", null, "show");
                return;
            case 31002:
                C7656a aVar4 = (C7656a) C4139e.C4140a.f11575b.mo46670a(aVar2.getExtra(), C7656a.class);
                if (aVar4 != null) {
                    List<C7665d> list = aVar4.f18971a;
                    String str2 = aVar4.f18972b;
                    if (list == null || list.isEmpty()) {
                        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.glp);
                        return;
                    } else {
                        m11844a(true, list, str2);
                        return;
                    }
                } else {
                    return;
                }
            case 31011:
                C5300c cVar = this.f13872b;
                if (cVar != null) {
                    cVar.mo11161m();
                    return;
                }
                return;
            case 4003036:
                C11226ao.m19883a(C3966y.m9669e(), C3966y.m9657a((int) R.string.eao), 0);
                return;
            case 4003037:
                AbstractC4444o.EnumC4445a aVar5 = AbstractC4444o.EnumC4445a.BAN_FOR_BROADCASTING;
                if (aVar5 != null) {
                    ((LinkReviewApi) C5805e.m12718a().mo11572a(LinkReviewApi.class)).bannedInfo(aVar5.type).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C5140a.C5143c(aVar5), C5140a.C5144d.f13330a);
                    return;
                } else {
                    try {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            case 4003088:
                int i = aVar.f13422b;
                Activity a3 = C3888a.m9505a(this.context);
                if (a3 != null) {
                    C89219l.m154716b(a3, "");
                    ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).showGuideBirthdayEditDialog(a3, "multi_live", C5713h.m12502a(i), new C5379l(this, i));
                    C6501b.C6502a.m13948a("livesdk_add_birth_popup_window_show").mo12651a("request_page", C5713h.m12502a(i)).mo12639a().mo12655b();
                    return;
                }
                return;
            case 4003089:
                int i2 = aVar.f13422b;
                SpannableString spannableString = new SpannableString(C3966y.m9657a((int) R.string.dtq));
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FE2C55")), 0, spannableString.length(), 33);
                Room room = (Room) this.dataChannel.mo28318b(C9093de.class);
                LiveDialog.C4056a aVar6 = new LiveDialog.C4056a(this.context);
                aVar6.f11242r = false;
                aVar6.f11241q = false;
                aVar6.f11227c = C3966y.m9660a((int) R.string.dtu, String.valueOf(LiveBroadcastAgeThresholdSetting.INSTANCE.getValue()));
                String a4 = C3966y.m9657a((int) R.string.dtt);
                C89219l.m154716b(a4, "");
                String a5 = C89361p.m154868a(a4, "{username}", "%s");
                Object[] objArr = new Object[1];
                if (!(room == null || (owner = room.getOwner()) == null)) {
                    str = owner.displayId;
                }
                objArr[0] = str;
                String a6 = C1764a.m5928a(a5, Arrays.copyOf(objArr, 1));
                C89219l.m154716b(a6, "");
                LiveDialog a7 = aVar6.mo9502a(a6).mo9500a(R.string.e3m, new C5378k(i2)).mo9503a();
                C4060b.C4061a aVar7 = new C4060b.C4061a();
                aVar7.f11254a = spannableString;
                aVar7.f11255b = new View$OnClickListenerC5377j(this, a7, i2);
                a7.mo9497a(aVar7.mo9509a());
                a7.show();
                C6501b.C6502a.m13948a("livesdk_appeal_popup_window_show").mo12651a("request_page", C5713h.m12502a(i2)).mo12639a().mo12655b();
                return;
            default:
                C11264f.m19957a(this.context, th);
                return;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5191b
    /* renamed from: a */
    public final void mo10966a(List<C7666e> list) {
        boolean z;
        Room room;
        int i;
        C5153d i2;
        C5300c cVar = this.f13872b;
        if (cVar != null) {
            z = cVar.mo11166r();
        } else {
            z = false;
        }
        if (z) {
            if (this.f13877h == null) {
                C5300c cVar2 = this.f13872b;
                if (cVar2 != null) {
                    room = cVar2.f13752t;
                } else {
                    room = null;
                }
                C5300c cVar3 = this.f13872b;
                if (cVar3 == null || (i2 = cVar3.mo11157i()) == null) {
                    i = 0;
                } else {
                    i = i2.mo10910g();
                }
                C5182a aVar = new C5182a(room, false, null, "", i);
                DataChannel dataChannel = this.dataChannel;
                C89219l.m154716b(dataChannel, "");
                this.f13877h = C5400b.C5401a.m11886a(dataChannel, aVar, this.f13872b, this.f13875e, null);
            }
            AbstractC0952i k = m11846k();
            if (k != null) {
                C5400b bVar = this.f13877h;
                if (bVar != null) {
                    bVar.mo11208a(this.f13875e, this.f13876f);
                }
                C5400b bVar2 = this.f13877h;
                if (bVar2 != null) {
                    bVar2.show(k, "MultiLiveGuestUserInfoDialog");
                }
            }
        } else if (isViewValid() && this.f13871a == null) {
            if (list == null) {
                list = new ArrayList<>();
            }
            C5300c cVar4 = this.f13872b;
            if (cVar4 != null) {
                Context context = this.context;
                C89219l.m154716b(context, "");
                this.f13871a = new DialogC5350b(context, cVar4, list);
            }
            DialogC5350b bVar3 = this.f13871a;
            if (bVar3 != null) {
                bVar3.setOnDismissListener(new DialogInterface$OnDismissListenerC5383p(this));
            }
            DialogC5350b bVar4 = this.f13871a;
            if (bVar4 != null) {
                bVar4.show();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget$d */
    public static final class DialogInterface$OnClickListenerC5371d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC5371d f13888a = new DialogInterface$OnClickListenerC5371d();

        static {
            Covode.recordClassIndex(5966);
        }

        DialogInterface$OnClickListenerC5371d() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget$i */
    static final class DialogInterface$OnClickListenerC5376i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC5376i f13893a = new DialogInterface$OnClickListenerC5376i();

        static {
            Covode.recordClassIndex(5971);
        }

        DialogInterface$OnClickListenerC5376i() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget$o */
    static final class DialogInterface$OnClickListenerC5382o implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC5382o f13902a = new DialogInterface$OnClickListenerC5382o();

        static {
            Covode.recordClassIndex(5977);
        }

        DialogInterface$OnClickListenerC5382o() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
            C5713h.m12519a(true);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5191b
    /* renamed from: b */
    public final void mo10969b(String str, SurfaceView surfaceView) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(surfaceView, "");
        AbstractC5258a aVar = this.f13873c;
        if (aVar != null) {
            aVar.mo11079a(str, surfaceView);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget$c */
    public static final class DialogInterface$OnClickListenerC5370c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MultiGuestAsGuestWidget f13886a;

        /* renamed from: b */
        final /* synthetic */ Runnable f13887b;

        static {
            Covode.recordClassIndex(5965);
        }

        public DialogInterface$OnClickListenerC5370c(MultiGuestAsGuestWidget multiGuestAsGuestWidget, Runnable runnable) {
            this.f13886a = multiGuestAsGuestWidget;
            this.f13887b = runnable;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
            this.f13886a.f13874d = this.f13887b;
            C5300c cVar = this.f13886a.f13872b;
            if (cVar != null) {
                cVar.mo11154f("live_end");
            }
            C5741z.m12608b("live_over");
            C5741z.m12606a("live_over");
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget$n */
    static final class DialogInterface$OnClickListenerC5381n implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MultiGuestAsGuestWidget f13901a;

        static {
            Covode.recordClassIndex(5976);
        }

        DialogInterface$OnClickListenerC5381n(MultiGuestAsGuestWidget multiGuestAsGuestWidget) {
            this.f13901a = multiGuestAsGuestWidget;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
            String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
            if (TextUtils.isEmpty(value)) {
                AbstractC2953a a = C6193a.m13435a(IHostApp.class);
                C89219l.m154716b(a, "");
                if (((IHostApp) a).isInMusicallyRegion()) {
                    value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
                } else {
                    value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
                }
            }
            ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(this.f13901a.context, value);
            if (C11115u.m19743a().mo17915b() != null) {
                HashMap hashMap = new HashMap();
                AbstractC6872f b = C11115u.m19743a().mo17915b();
                C89219l.m154716b(b, "");
                hashMap.put("user_id", String.valueOf(b.mo13161c()));
                C6501b.C6502a.m13948a("livesdk_user_click_contact_us").mo12652a((Map<String, String>) hashMap).mo12643a(this.f13901a.dataChannel).mo12655b();
            }
            C5713h.m12519a(false);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5191b
    /* renamed from: a */
    public final void mo10965a(String str, SurfaceView surfaceView) {
        DialogC5350b bVar;
        C5400b bVar2;
        if (str == null || str.length() == 0 || surfaceView == null) {
            String str2 = "onStartInteract encounter an exception, linkMicId: " + str + ", surfaceView:" + surfaceView;
            C3854a.m9453a(6, "LinkInRoomVideoGuestWid", str2);
            C3868c.m9496a(new Throwable(), str2);
            return;
        }
        C5300c cVar = this.f13872b;
        if (cVar == null || !cVar.mo11166r()) {
            DialogC5350b bVar3 = this.f13871a;
            if (!(bVar3 == null || !bVar3.isShowing() || (bVar = this.f13871a) == null)) {
                bVar.dismiss();
            }
        } else {
            C5400b bVar4 = this.f13877h;
            if (!(bVar4 == null || !bVar4.mo18054n() || (bVar2 = this.f13877h) == null)) {
                bVar2.dismiss();
            }
        }
        AbstractC5258a aVar = this.f13873c;
        if (aVar != null) {
            aVar.mo11087c(false);
        }
        AbstractC5258a aVar2 = this.f13873c;
        if (aVar2 != null) {
            C6894d a = C6894d.m14753a();
            String str3 = "";
            C89219l.m154716b(a, str3);
            String str4 = a.f17260e;
            if (str4 != null) {
                str3 = str4;
            }
            if (surfaceView == null) {
                C89219l.m154715b();
            }
            aVar2.mo11079a(str3, surfaceView);
        }
    }

    /* renamed from: a */
    private final void m11844a(boolean z, List<? extends C7665d> list, String str) {
        boolean z2;
        Room room;
        int i;
        DialogC5211a aVar;
        int i2;
        C5153d i3;
        C5300c cVar = this.f13872b;
        if (cVar != null) {
            z2 = cVar.mo11166r();
        } else {
            z2 = false;
        }
        C5300c cVar2 = this.f13872b;
        if (cVar2 != null) {
            room = cVar2.f13752t;
        } else {
            room = null;
        }
        C5300c cVar3 = this.f13872b;
        if (cVar3 == null || (i3 = cVar3.mo11157i()) == null) {
            i = 0;
        } else {
            i = i3.mo10910g();
        }
        C5182a aVar2 = new C5182a(room, z, list, str, i);
        if (z2) {
            C5400b bVar = this.f13877h;
            if (bVar == null || !bVar.mo18054n()) {
                C5393i iVar = this.f13876f;
                int i4 = -1;
                if (iVar != null) {
                    i2 = iVar.f13905a;
                } else {
                    i2 = -1;
                }
                AbstractC5258a aVar3 = this.f13873c;
                if (aVar3 != null) {
                    i4 = aVar3.mo11091e();
                }
                C5393i iVar2 = new C5393i(i2, i4);
                DataChannel dataChannel = this.dataChannel;
                C89219l.m154716b(dataChannel, "");
                this.f13877h = C5400b.C5401a.m11886a(dataChannel, aVar2, this.f13872b, this.f13875e, iVar2);
                AbstractC0952i k = m11846k();
                if (k != null) {
                    C5400b bVar2 = this.f13877h;
                    if (bVar2 != null) {
                        bVar2.mo11208a(this.f13875e, this.f13876f);
                    }
                    C5400b bVar3 = this.f13877h;
                    if (bVar3 != null) {
                        bVar3.show(k, "MultiLiveGuestUserInfoDialog");
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        DialogC5211a aVar4 = this.f13878i;
        if (aVar4 == null || !aVar4.isShowing()) {
            DialogC5211a aVar5 = new DialogC5211a(C11279p.m20001a(this.context), aVar2, this.dataChannel, this.f13875e);
            this.f13878i = aVar5;
            aVar5.show();
            if (this.f13875e == DialogC5211a.EnumC5215a.GO_LIVE && (aVar = this.f13878i) != null) {
                aVar.setCancelable(false);
            }
            DialogC5211a aVar6 = this.f13878i;
            Objects.requireNonNull(aVar6, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multiguest.ui.dialog.InteractApplyDialogMt");
            aVar6.f13472i = this.f13883n;
        }
    }
}
