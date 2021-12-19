package com.bytedance.android.livesdk.widgets.giftwidget;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.C4327c;
import com.bytedance.android.live.gift.C4329e;
import com.bytedance.android.live.gift.C4335k;
import com.bytedance.android.live.gift.C4340p;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p385p.C5840e;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.live.wallet.AbstractC6332d;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.C6889az;
import com.bytedance.android.livesdk.C6900ba;
import com.bytedance.android.livesdk.C6903bd;
import com.bytedance.android.livesdk.C6904be;
import com.bytedance.android.livesdk.boostcard.C6914b;
import com.bytedance.android.livesdk.boostcard.C6916d;
import com.bytedance.android.livesdk.boostcard.LiveBoostcardApi;
import com.bytedance.android.livesdk.chatroom.p488c.C7389h;
import com.bytedance.android.livesdk.dialogv2.AbstractC8331a;
import com.bytedance.android.livesdk.dialogv2.C8338b;
import com.bytedance.android.livesdk.dialogv2.viewmodel.C8374a;
import com.bytedance.android.livesdk.firstrecharge.C8729d;
import com.bytedance.android.livesdk.gift.model.AbstractC8854r;
import com.bytedance.android.livesdk.gift.model.AbstractC8855s;
import com.bytedance.android.livesdk.gift.model.C8851o;
import com.bytedance.android.livesdk.gift.p543a.AbstractC8782a;
import com.bytedance.android.livesdk.gift.p548d.C8798b;
import com.bytedance.android.livesdk.gift.p548d.C8801e;
import com.bytedance.android.livesdk.gift.p548d.C8803g;
import com.bytedance.android.livesdk.gift.p550f.C8808a;
import com.bytedance.android.livesdk.gifttray.AbsNormalGiftAnimWidget;
import com.bytedance.android.livesdk.gifttray.LiveGiftTrayWidget;
import com.bytedance.android.livesdk.guide.LiveGiftGuideWidget;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftDialogUpDownSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGuideSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRoomChargeTypeSetting;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.message.C9623av;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget;
import com.bytedance.android.livesdk.olddialog.C9991a;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9096dh;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.p668y.p670b.C11597b;
import com.bytedance.android.livesdk.p668y.p671c.C11599a;
import com.bytedance.android.livesdk.service.animation.C10644a;
import com.bytedance.android.livesdk.service.assets.C10690j;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.p621a.C10640d;
import com.bytedance.android.livesdk.service.p624b.C10700d;
import com.bytedance.android.livesdk.service.p625c.p626a.C10715e;
import com.bytedance.android.livesdk.service.p625c.p631f.C10748d;
import com.bytedance.android.livesdk.toolbar.p641a.C10893a;
import com.bytedance.android.livesdk.toolbar.p641a.C10895c;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.C11118c;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.widgets.LiveNewSpecialGiftWidget;
import com.bytedance.android.livesdk.widgets.giftwidget.p661a.C11441a;
import com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11451ad;
import com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11453ae;
import com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11454af;
import com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11455ag;
import com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11478ax;
import com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11479ay;
import com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11481az;
import com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11483b;
import com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11505v;
import com.bytedance.android.livesdk.widgets.giftwidget.p662b.DialogInterface$OnClickListenerC11474at;
import com.bytedance.android.livesdk.widgets.giftwidget.p662b.DialogInterface$OnClickListenerC11475au;
import com.bytedance.android.livesdk.widgets.giftwidget.p662b.DialogInterface$OnClickListenerC11476av;
import com.bytedance.android.livesdkapi.depend.model.live.C11727h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p689e.C11751a;
import com.bytedance.android.livesdkapi.p690f.C11756a;
import com.bytedance.android.widget.Widget;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public class GiftWidget extends LiveRecyclableWidget implements AbstractC8855s, LiveNewVideoGiftWidget.AbstractC9946a, C11451ad.AbstractC11452a, C11455ag.AbstractC11461a, C11481az.AbstractC11482a, C11483b.AbstractC11485a, AbstractC33974au {

    /* renamed from: a */
    AbsNormalGiftAnimWidget f27432a;

    /* renamed from: b */
    LiveNewVideoGiftWidget f27433b;

    /* renamed from: c */
    public C11505v f27434c;

    /* renamed from: d */
    Room f27435d;

    /* renamed from: e */
    boolean f27436e;

    /* renamed from: f */
    private AbstractC11293v f27437f;

    /* renamed from: g */
    private RecyclableWidgetManager f27438g;

    /* renamed from: h */
    private final WidgetCreateTimeUtil f27439h = new WidgetCreateTimeUtil();

    /* renamed from: i */
    private C10893a f27440i;

    /* renamed from: j */
    private C11455ag f27441j;

    /* renamed from: k */
    private C11483b f27442k;

    /* renamed from: l */
    private C11481az f27443l;

    /* renamed from: m */
    private C11479ay f27444m;

    /* renamed from: n */
    private C6916d f27445n;

    /* renamed from: o */
    private C11478ax f27446o;

    /* renamed from: p */
    private ViewGroup f27447p;

    /* renamed from: q */
    private AbstractC8854r f27448q;

    /* renamed from: r */
    private FrameLayout f27449r;

    /* renamed from: s */
    private int f27450s = 0;

    /* renamed from: t */
    private C11451ad f27451t;

    /* renamed from: u */
    private boolean f27452u = false;

    /* renamed from: v */
    private int f27453v;

    static {
        Covode.recordClassIndex(13098);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bfz;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object... objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11483b.AbstractC11485a
    /* renamed from: a */
    public final void mo18287a(boolean z) {
        AbsNormalGiftAnimWidget absNormalGiftAnimWidget = this.f27432a;
        if (absNormalGiftAnimWidget != null && this.f27433b != null) {
            if (z) {
                absNormalGiftAnimWidget.mo15101a();
                this.f27432a.mo15104b();
                this.f27433b.mo16649a();
                this.f27432a.f21818a = true;
                return;
            }
            absNormalGiftAnimWidget.f21818a = false;
        }
    }

    @Override // com.bytedance.android.livesdk.gift.model.AbstractC8855s
    /* renamed from: a */
    public final void mo15099a(RecyclableWidgetManager recyclableWidgetManager) {
        this.f27438g = recyclableWidgetManager;
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11455ag.AbstractC11461a
    /* renamed from: a */
    public final void mo18285a(Exception exc, C10700d dVar) {
        Context context = getContext();
        C11505v vVar = this.f27434c;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            boolean booleanValue = ((Boolean) dataChannel.mo28318b(C9119ed.class)).booleanValue();
            Room room = (Room) dataChannel.mo28318b(C9093de.class);
            if (room != null) {
                if (!(exc instanceof C8808a)) {
                    if (!(exc instanceof C2912a)) {
                        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e7g);
                        return;
                    } else if (((C2908a) exc).getErrorCode() != 40001) {
                        if (((C2908a) exc).getErrorCode() == 90501) {
                            C10690j.m19257a().mo17629b(room.getId());
                            DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(context);
                            aVar.f22256m = true;
                            aVar.mo15248b(R.string.gq7).mo15244a(R.string.gls, DialogInterface$OnClickListenerC11476av.f27538a, false).mo15247a().show();
                            return;
                        }
                        C2912a aVar2 = (C2912a) exc;
                        if (aVar2.getErrorCode() == 4004051) {
                            C11226ao.m19884a(aVar2.getPrompt());
                            C10748d.m19338a(C10748d.EnumC10749a.ANCHOR);
                            return;
                        }
                        C2912a aVar3 = (C2912a) exc;
                        if (aVar3.getErrorCode() == 4004052) {
                            C11226ao.m19884a(aVar3.getPrompt());
                            C10748d.m19338a(C10748d.EnumC10749a.GUEST);
                            return;
                        }
                        C2912a aVar4 = (C2912a) exc;
                        if (aVar4.getErrorCode() == 4025008) {
                            C11226ao.m19884a(aVar4.getPrompt());
                            C6501b.C6502a.m13948a("subscribe_expire").mo12646a("room_id", C6544e.m13995i()).mo12646a("anchor_id", C6544e.m13994h()).mo12651a("enter_from_merge", C6544e.m13987a()).mo12651a("enter_method", C6544e.m13990d()).mo12651a("action_type", C6544e.m13991e()).mo12651a("request_id", C6544e.m13997k()).mo12651a("video_id", C6544e.m13992f()).mo12651a("click_position", "sub_gift").mo12655b();
                            return;
                        }
                        C2912a aVar5 = (C2912a) exc;
                        int errorCode = aVar5.getErrorCode();
                        if (errorCode == 40032) {
                            vVar.mo18318a();
                            return;
                        } else if (errorCode == 4006063) {
                            vVar.mo18320a("reject");
                            return;
                        } else if (errorCode == 4006064) {
                            vVar.mo18320a("frequency");
                            return;
                        } else {
                            C11226ao.m19884a(aVar5.getPrompt());
                            if (errorCode == 4006052) {
                                C6501b.C6502a.m13948a("livesdk_consume_limit_toast_show").mo12639a().mo12655b();
                                return;
                            }
                            return;
                        }
                    }
                }
                if (LiveRoomChargeTypeSetting.INSTANCE.getValue() == 1 || booleanValue) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gv9);
                    String str = dVar.f25768j;
                    String str2 = "wishlist";
                    if (!TextUtils.equals(str, str2)) {
                        str2 = TextUtils.equals(str, "convenient_gift") ? "shortcut_gift" : "gift";
                    }
                    vVar.mo18319a(new C6903bd(str2, 0, "normal", dVar.f25768j));
                    return;
                }
                DialogC9148b.C9149a aVar6 = new DialogC9148b.C9149a(context);
                aVar6.f22245b = context.getString(R.string.gth);
                aVar6.mo15244a(R.string.gtk, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC11474at(context), false).mo15249b(R.string.gi8, DialogInterface$OnClickListenerC11475au.f27537a, false).mo15247a().show();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11451ad.AbstractC11452a
    /* renamed from: a */
    public final void mo18284a(C9895y yVar, boolean z) {
        if (isViewValid()) {
            long j = (long) yVar.f23936k;
            Room room = this.f27435d;
            if (!(room == null || room.getOwner() == null || ((yVar.f23933h != null && 0 != yVar.f23933h.getId() && yVar.f23933h.getId() != this.f27435d.getOwner().getId()) || (yVar.f23944s && j == 0)))) {
                this.dataChannel.mo28315b(C11751a.class, Long.valueOf(j));
            }
            if (!z || yVar.f23944s || yVar.f23938m == 1) {
                C9904t tVar = yVar.f23945t;
                if (tVar == null) {
                    C3854a.m9453a(6, "GiftWidget", "The user does not have this gift locally， giftMessageId = " + yVar.getMessageId() + ",  giftId = " + yVar.f23934i);
                    return;
                }
                AbstractC8782a aVar = C10644a.m19200a().f25651a.get(GiftManager.inst().getGiftType(tVar));
                if (aVar != null && (yVar.f23933h == null || yVar.f23933h.getId() == C11115u.m19743a().mo17915b().mo13161c())) {
                    aVar.mo8561a(yVar);
                }
                this.f27432a.mo15103a(yVar);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11483b.AbstractC11485a
    /* renamed from: a */
    public final void mo18286a(String str) {
        if (getContext() instanceof Activity) {
            C8729d dVar = C8729d.f21542u;
            ActivityC0945e a = C11279p.m20001a(getContext());
            C89219l.m154721d(a, "");
            if (str == null) {
                str = "";
            }
            dVar.f21551h = str;
            AbstractC2953a a2 = C6193a.m13435a(AbstractC2928f.class);
            C89219l.m154716b(a2, "");
            ((AbstractC2928f) a2).getHybridDialogManager().mo7672a();
            AbstractC6332d walletCenter = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter();
            C89219l.m154716b(walletCenter, "");
            dVar.f21546c = (int) walletCenter.mo12373b();
            dVar.f21557n = new WeakReference<>(a);
            a.getApplication().unregisterActivityLifecycleCallbacks(dVar.f21562s);
            a.getApplication().registerActivityLifecycleCallbacks(dVar.f21562s);
            ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12367a(dVar.f21563t);
            ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12369a(dVar.f21561r, a);
        }
    }

    @Override // com.bytedance.android.livesdk.gift.model.AbstractC8855s
    /* renamed from: a */
    public final void mo15096a() {
        this.f27450s = R.id.e4w;
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11483b.AbstractC11485a
    /* renamed from: d */
    public final void mo18291d() {
        this.containerView.requestFocus();
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11483b.AbstractC11485a
    /* renamed from: f */
    public final void mo18293f() {
        this.f27434c.mo18318a();
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11483b.AbstractC11485a
    /* renamed from: h */
    public final void mo18295h() {
        ((AbstractC8331a) this.f27437f).mo14663d();
    }

    @Override // com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget.AbstractC9946a
    /* renamed from: b */
    public final void mo16653b() {
        if (this.dataChannel != null) {
            this.dataChannel.mo28319c(C6900ba.class);
        }
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11483b.AbstractC11485a
    /* renamed from: g */
    public final void mo18294g() {
        MethodCollector.m26663i(5756);
        FrameLayout frameLayout = this.f27449r;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        MethodCollector.m26664o(5756);
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11483b.AbstractC11485a
    /* renamed from: e */
    public final void mo18292e() {
        AbstractC8854r rVar;
        if (((Boolean) this.dataChannel.mo28318b(C9076co.class)).booleanValue() && (rVar = this.f27448q) != null) {
            rVar.mo14016a();
        }
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11483b.AbstractC11485a
    /* renamed from: c */
    public final void mo18290c() {
        for (AbstractC8782a aVar : C10644a.m19200a().f25651a.values()) {
            aVar.mo8560a();
        }
        AbsNormalGiftAnimWidget absNormalGiftAnimWidget = this.f27432a;
        if (absNormalGiftAnimWidget != null) {
            absNormalGiftAnimWidget.mo15101a();
        }
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11483b.AbstractC11485a
    /* renamed from: i */
    public final void mo18296i() {
        Fragment a = ((ActivityC0945e) getContext()).getSupportFragmentManager().mo3551a(((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).getWebDialogTag());
        if (a instanceof DialogInterface$OnCancelListenerC0944d) {
            ((DialogInterface$OnCancelListenerC0944d) a).dismissAllowingStateLoss();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        IMessageManager iMessageManager;
        C11451ad adVar = this.f27451t;
        if (adVar.f27470a != null && !adVar.f27470a.isDisposed()) {
            adVar.f27470a.dispose();
        }
        IMessageManager iMessageManager2 = (IMessageManager) adVar.f27475f.mo28318b(C9068cg.class);
        if (iMessageManager2 != null) {
            iMessageManager2.removeMessageListener(adVar);
        }
        C10748d.m19339a("GiftWidget unLoad");
        C11455ag agVar = this.f27441j;
        if (agVar != null) {
            agVar.f27481c.mo28316b(agVar);
        }
        C11483b bVar = this.f27442k;
        bVar.f27554i = null;
        bVar.f27549d.removeObserver(bVar.f27555j);
        bVar.f27553h.mo142944a();
        C11505v vVar = this.f27434c;
        if (vVar != null) {
            vVar.f27579b.mo28316b(vVar);
        }
        C11479ay ayVar = this.f27444m;
        if (!(ayVar == null || (iMessageManager = ayVar.f27541a) == null)) {
            iMessageManager.removeMessageListener(ayVar);
        }
        C6916d dVar = this.f27445n;
        if (dVar != null) {
            C6914b.f17308h = false;
            dVar.f17314d = 0;
            dVar.f17315e = 0;
            dVar.f17322l.clear();
            dVar.f17313c.mo142944a();
            dVar.f17316f = false;
            C6914b.f17303c = false;
            dVar.f17317g = false;
            dVar.f17318h = false;
            dVar.f17319i = false;
            C18494b.m34422b("live_boost_use_card", dVar);
        }
        C11599a.C11601a.f27757a.mo18398b();
        C6779a.m14563a().mo13053a(new C11597b());
        C6779a.m14563a().mo13053a(new C11441a());
        AbstractC11293v vVar2 = this.f27437f;
        if (vVar2 != null) {
            vVar2.dismiss();
        }
        this.f27439h.send();
    }

    @Override // com.bytedance.android.livesdk.gift.model.AbstractC8855s
    /* renamed from: a */
    public final void mo15097a(ViewGroup viewGroup) {
        this.f27447p = viewGroup;
    }

    @Override // com.bytedance.android.livesdk.gift.model.AbstractC8855s
    /* renamed from: a */
    public final void mo15098a(AbstractC8854r rVar) {
        this.f27448q = rVar;
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11451ad.AbstractC11452a
    /* renamed from: a */
    public final void mo18281a(C9623av avVar) {
        AbsNormalGiftAnimWidget absNormalGiftAnimWidget = this.f27432a;
        if (absNormalGiftAnimWidget != null && avVar != null) {
            absNormalGiftAnimWidget.mo15102a(avVar);
        }
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11483b.AbstractC11485a
    /* renamed from: a */
    public final void mo18277a(int i) {
        if (isViewValid() && getContext() != null) {
            this.f27453v = i;
            if (!this.f27452u) {
                ViewGroup viewGroup = (ViewGroup) this.contentView.findViewById(R.id.cjb);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
                layoutParams.bottomMargin = i;
                viewGroup.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11483b.AbstractC11485a
    /* renamed from: b */
    public final void mo18289b(boolean z) {
        ViewGroup viewGroup;
        float a;
        if (this.contentView != null && (viewGroup = (ViewGroup) this.contentView.findViewById(R.id.cth)) != null) {
            ViewPropertyAnimator animate = viewGroup.animate();
            if (z) {
                a = 0.0f;
            } else {
                a = (float) C3966y.m9653a(44.0f);
            }
            animate.translationY(a).setDuration(88).start();
        }
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11483b.AbstractC11485a
    /* renamed from: a */
    public final void mo18278a(View view) {
        MethodCollector.m26663i(5754);
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = this.f27449r;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.f27449r.addView(view);
        }
        MethodCollector.m26664o(5754);
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11483b.AbstractC11485a
    /* renamed from: a */
    public final void mo18279a(C7389h hVar) {
        if (isViewValid() && getContext() != null && this.f27436e) {
            this.f27452u = hVar.f18312a;
            ViewGroup viewGroup = (ViewGroup) this.contentView.findViewById(R.id.cth);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
            int i = hVar.f18313b;
            if (!hVar.f18312a) {
                i = this.f27453v;
                if (i == 0) {
                    i = (int) getContext().getResources().getDimension(R.dimen.w0);
                }
            } else if (layoutParams.bottomMargin >= i) {
                return;
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(viewGroup, "translationY", (float) (layoutParams.bottomMargin - i)).setDuration(300L);
            View findViewById = this.contentView.findViewById(R.id.baj);
            if (findViewById != null) {
                ObjectAnimator.ofFloat(findViewById, "translationY", (float) (layoutParams.bottomMargin - i)).setDuration(300L).start();
            }
            duration.start();
        }
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11481az.AbstractC11482a
    /* renamed from: b */
    public final void mo18288b(C8803g gVar) {
        User user;
        User owner;
        if (C10640d.C10641a.f25646a.mo17551a(C10640d.EnumC10643c.GIFT_DIALOG)) {
            C11118c.m19750a(C11118c.EnumC11119a.ENTER_GIFT_PANEL);
            AbstractC0952i iVar = (AbstractC0952i) this.dataChannel.mo28318b(C9021ao.class);
            C10715e.f25799h.mo17638a();
            C6779a.m14563a().mo13053a(new C4327c());
            if (LiveGiftDialogUpDownSetting.INSTANCE.getValue() != 1 || !this.f27436e) {
                Room room = this.f27435d;
                if (gVar.f21679a == null) {
                    user = this.f27435d.getOwner();
                } else {
                    user = gVar.f21679a;
                }
                this.f27437f = C9991a.m18464a(room, user, gVar.f21681c, gVar.f21680b, gVar.f21682d, gVar.f21683e);
            } else {
                if (gVar.f21679a == null || this.f27435d == null || gVar.f21679a.getId() == this.f27435d.getOwnerUserId()) {
                    C8374a.C8375a.C8376a.f20718a.mo14699a(GiftDialogViewModel.EnumC10040b.ANCHOR);
                } else {
                    C8374a.C8375a.C8376a.f20718a.mo14699a(GiftDialogViewModel.EnumC10040b.GUEST);
                }
                C8374a.C8375a.C8376a.f20718a.f20710d = this.f27435d;
                C8374a.C8375a.C8376a.f20718a.mo14700a(gVar.f21680b);
                C8374a aVar = C8374a.C8375a.C8376a.f20718a;
                if (gVar.f21679a != null) {
                    owner = gVar.f21679a;
                } else {
                    owner = ((Room) this.dataChannel.mo28318b(C9093de.class)).getOwner();
                }
                aVar.f20708b = owner;
                C8374a.C8375a.C8376a.f20718a.f20707a = Long.valueOf(gVar.f21683e);
                this.f27437f = C8338b.m16500a(gVar.f21682d);
            }
            if (iVar != null) {
                ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12379d();
                this.f27437f.show(iVar, "LiveNewGiftDialog");
            }
        }
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11483b.AbstractC11485a
    /* renamed from: a */
    public final void mo18280a(C8803g gVar) {
        C11481az azVar = this.f27443l;
        if (C11115u.m19743a().mo17915b().mo13147a().childrenManagerForbidWalletFunctions()) {
            C11226ao.m19882a(azVar.f27543a, (int) R.string.gii);
        } else if (((IHostContext) C6193a.m13435a(IHostContext.class)).isNeedProtectMinor()) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gq8);
        } else {
            if (azVar.f27545c != null) {
                azVar.f27545c.mo28320c(C5840e.class, true);
            }
            if (azVar.f27544b != null) {
                azVar.f27544b.mo18288b(gVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0177, code lost:
        if (r17 != null) goto L_0x0167;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x016e  */
    @Override // com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11451ad.AbstractC11452a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18282a(com.bytedance.android.livesdk.model.message.C9892v r17) {
        /*
        // Method dump skipped, instructions count: 382
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widgets.giftwidget.GiftWidget.mo18282a(com.bytedance.android.livesdk.model.message.v):void");
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11451ad.AbstractC11452a
    /* renamed from: a */
    public final void mo18283a(C9895y yVar) {
        AbsNormalGiftAnimWidget absNormalGiftAnimWidget = this.f27432a;
        if (absNormalGiftAnimWidget != null && yVar != null) {
            absNormalGiftAnimWidget.mo15105b(yVar);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object... objArr) {
        long j;
        Room room;
        boolean z;
        IMessageManager iMessageManager;
        Object obj;
        String str;
        Object obj2;
        C11727h hVar;
        String str2;
        C11727h hVar2;
        C11727h hVar3;
        C11727h hVar4;
        C11727h hVar5;
        String str3;
        String str4;
        Boolean bool;
        Long l;
        IMessageManager iMessageManager2;
        if (!this.f27436e) {
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.cth);
            if (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
                int i = Build.VERSION.SDK_INT;
                layoutParams.addRule(20);
                frameLayout.setLayoutParams(layoutParams);
            }
        }
        C10748d.m19339a("Load GiftWidget,ToolbarManager load Gift and FastGift behavior");
        this.f27436e = ((Boolean) this.dataChannel.mo28318b(C9076co.class)).booleanValue();
        this.f27435d = (Room) this.dataChannel.mo28318b(C9093de.class);
        ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12379d();
        ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12384h();
        if (this.dataChannel != null) {
            this.dataChannel.mo28309a((AbstractC1204m) this, C4329e.class, (AbstractC89172b) new C11440a(this)).mo28309a((AbstractC1204m) this, C4340p.class, (AbstractC89172b) new C11442b(this));
        }
        if (!this.f27436e) {
            ((AbstractC11181z) C6779a.m14563a().mo13052a(C8801e.class).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(WidgetExtendsKt.autoDispose(this))).mo17949a(new C11511c(this));
        }
        C11455ag agVar = new C11455ag();
        this.f27441j = agVar;
        agVar.f27481c = this.dataChannel;
        this.f27441j.f27482d = C11279p.m20001a(getContext());
        this.f27441j.f27483e = this;
        C11455ag agVar2 = this.f27441j;
        agVar2.f27481c.mo28312a(agVar2, C6889az.class, agVar2.f27484f);
        C11505v vVar = new C11505v();
        this.f27434c = vVar;
        vVar.f27578a = getContext();
        this.f27434c.f27579b = this.dataChannel;
        C11505v vVar2 = this.f27434c;
        vVar2.f27579b.mo28312a(vVar2, C6904be.class, vVar2.f27580c);
        if (LiveGiftDialogUpDownSetting.INSTANCE.getValue() == 1) {
            C11479ay ayVar = new C11479ay();
            this.f27444m = ayVar;
            DataChannel dataChannel = this.dataChannel;
            ayVar.f27542b = dataChannel;
            if (dataChannel != null) {
                iMessageManager2 = (IMessageManager) dataChannel.mo28318b(C9068cg.class);
            } else {
                iMessageManager2 = null;
            }
            ayVar.f27541a = iMessageManager2;
            IMessageManager iMessageManager3 = ayVar.f27541a;
            if (iMessageManager3 != null) {
                iMessageManager3.addMessageListener(EnumC9596a.GIFT_UPDATE.getIntType(), ayVar);
            }
        }
        C11483b bVar = new C11483b(this.dataChannel, getAutoUnbindTransformer(), this);
        this.f27442k = bVar;
        bVar.f27548c = this.f27447p;
        C11483b bVar2 = this.f27442k;
        bVar2.f27547b = this;
        if (bVar2.f27547b != null) {
            bVar2.f27547b.mo18292e();
        }
        C11481az azVar = new C11481az(this.context, this.dataChannel);
        this.f27443l = azVar;
        azVar.f27544b = this;
        if (!(this.dataChannel == null || this.dataChannel.mo28318b(C9119ed.class) == null || !((Boolean) this.dataChannel.mo28318b(C9119ed.class)).booleanValue())) {
            C6916d dVar = new C6916d();
            this.f27445n = dVar;
            dVar.f17311a = this.dataChannel;
            DataChannel dataChannel2 = dVar.f17311a;
            long j2 = 0;
            if (dataChannel2 == null || (l = (Long) dataChannel2.mo28318b(C9096dh.class)) == null) {
                j = 0;
            } else {
                j = l.longValue();
            }
            dVar.f17312b = j;
            DataChannel dataChannel3 = dVar.f17311a;
            if (dataChannel3 != null) {
                room = (Room) dataChannel3.mo28318b(C9093de.class);
            } else {
                room = null;
            }
            DataChannel dataChannel4 = dVar.f17311a;
            if (dataChannel4 == null || (bool = (Boolean) dataChannel4.mo28318b(C9119ed.class)) == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            String str5 = "";
            if (room != null) {
                C11727h hVar6 = room.mBoostCardRoomStatus;
                if (hVar6 == null || !hVar6.f28056a || !z) {
                    C11727h hVar7 = room.mBoostCardRoomStatus;
                    if (hVar7 != null && hVar7.f28057b > 0 && z) {
                        if (!(room == null || (hVar5 = room.mBoostCardRoomStatus) == null)) {
                            j2 = hVar5.f28057b;
                        }
                        dVar.f17314d = j2 * 1000;
                        if (room == null || (hVar4 = room.mBoostCardRoomStatus) == null) {
                            obj = str5;
                        } else {
                            obj = Long.valueOf(hVar4.f28058c);
                        }
                        C6914b.m14790d(obj.toString());
                        if (room == null || (hVar3 = room.mBoostCardRoomStatus) == null || (str = hVar3.f28060e) == null) {
                            str = str5;
                        }
                        C6914b.m14788b(str);
                        if (room == null || (hVar2 = room.mBoostCardRoomStatus) == null) {
                            obj2 = str5;
                        } else {
                            obj2 = Long.valueOf(hVar2.f28061f);
                        }
                        C6914b.m14789c(obj2.toString());
                        C6914b.f17304d = dVar.f17314d;
                        C6914b.f17308h = true;
                        if (!(room == null || (hVar = room.mBoostCardRoomStatus) == null || (str2 = hVar.f28062g) == null)) {
                            str5 = str2;
                        }
                        C6914b.m14787a(str5);
                        dVar.f17313c.mo142945a(((LiveBoostcardApi) C5805e.m12718a().mo11572a(LiveBoostcardApi.class)).queryUserStatus(dVar.f17312b, false).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C6916d.C6920d(dVar), C6916d.C6921e.f17326a));
                    }
                } else {
                    dVar.f17314d = room.mBoostCardRoomStatus.f28057b * 1000;
                    C6914b.m14790d(String.valueOf(room.mBoostCardRoomStatus.f28058c));
                    C6914b.m14788b(room.mBoostCardRoomStatus.f28060e);
                    C11727h hVar8 = room.mBoostCardRoomStatus;
                    if (hVar8 == null || (str3 = hVar8.f28062g) == null) {
                        str3 = str5;
                    }
                    dVar.f17321k = str3;
                    C11727h hVar9 = room.mBoostCardRoomStatus;
                    if (!(hVar9 == null || (str4 = hVar9.f28062g) == null)) {
                        str5 = str4;
                    }
                    C6914b.m14787a(str5);
                    C6914b.m14789c(String.valueOf(room.mBoostCardRoomStatus.f28061f));
                    dVar.f17313c.mo142945a(AbstractC88979t.m154307b(5, TimeUnit.MILLISECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C6916d.C6919c(dVar)));
                }
            }
            dVar.f17313c.mo142945a(AbstractC88979t.m154307b(5, TimeUnit.MILLISECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C6916d.C6924h(dVar)));
            dVar.f17313c.mo142945a(C6779a.m14563a().mo13052a(C8798b.class).mo143289d(new C6916d.C6925i(dVar)));
            dVar.f17313c.mo142945a(C6779a.m14563a().mo13052a(C4335k.class).mo143289d(new C6916d.C6926j(dVar)));
            DataChannel dataChannel5 = dVar.f17311a;
            if (!(dataChannel5 == null || (iMessageManager = (IMessageManager) dataChannel5.mo28318b(C9068cg.class)) == null)) {
                iMessageManager.addMessageListener(EnumC9596a.GIFT_BOOST_CARD_MESSAGE.getIntType(), dVar);
            }
            C18494b.m34417a("live_boost_use_card", dVar);
        }
        C11451ad adVar = new C11451ad();
        this.f27451t = adVar;
        DataChannel dataChannel6 = this.dataChannel;
        adVar.f27474e = this;
        adVar.f27475f = dataChannel6;
        adVar.f27471b = (Room) adVar.f27475f.mo28318b(C9093de.class);
        adVar.f27473d = ((Boolean) adVar.f27475f.mo28318b(C9119ed.class)).booleanValue();
        adVar.f27472c = ((Boolean) adVar.f27475f.mo28318b(C9076co.class)).booleanValue();
        IMessageManager iMessageManager4 = (IMessageManager) adVar.f27475f.mo28318b(C9068cg.class);
        if (iMessageManager4 != null) {
            iMessageManager4.addMessageListener(EnumC9596a.GIFT.getIntType(), adVar);
            iMessageManager4.addMessageListener(EnumC9596a.DOODLE_GIFT.getIntType(), adVar);
            iMessageManager4.addMessageListener(EnumC9596a.FREE_CELL_GIFT_MESSAGE.getIntType(), adVar);
            iMessageManager4.addMessageListener(EnumC9596a.ASSET_MESSAGE.getIntType(), adVar);
            iMessageManager4.addMessageListener(EnumC9596a.BINDING_GIFT_MESSAGE.getIntType(), adVar);
            iMessageManager4.addMessageListener(EnumC9596a.TRAY_MESSAGE.getIntType(), adVar);
            iMessageManager4.addMessageListener(EnumC9596a.GIFT_GLOBAL_MESSAGE.getIntType(), adVar);
        }
        adVar.f27470a.mo142945a(C6779a.m14563a().mo13052a(C11756a.class).mo143289d(new C11453ae(adVar)));
        adVar.f27470a.mo142945a(C6779a.m14563a().mo13052a(C8851o.class).mo143289d(new C11454af(adVar)));
        C11478ax axVar = new C11478ax();
        this.f27446o = axVar;
        axVar.f27540a = this.dataChannel;
        this.f27440i = new C10893a(this.f27435d, this.dataChannel);
        C10895c cVar = new C10895c(this.dataChannel);
        EnumC5847l.BROADCAST_GIFT.load(this.dataChannel, this.f27440i);
        EnumC5847l.DUMMY_BROADCAST_GIFT.load(this.dataChannel, cVar);
        this.f27449r = (FrameLayout) this.containerView.findViewById(R.id.cjb);
        this.f27439h.clear();
        enableSubWidgetManager(this.f27439h, C6203g.f15476a);
        this.f27432a = new LiveGiftTrayWidget();
        if (this.dataChannel == null || ((Boolean) this.dataChannel.mo28318b(C9076co.class)).booleanValue()) {
            this.subWidgetManager.load(R.id.cth, this.f27432a);
        } else {
            this.subWidgetManager.load(R.id.cti, this.f27432a);
        }
        LiveNewVideoGiftWidget liveNewVideoGiftWidget = new LiveNewVideoGiftWidget();
        this.f27433b = liveNewVideoGiftWidget;
        liveNewVideoGiftWidget.f24080b = this;
        this.subWidgetManager.load(R.id.fbx, (Widget) this.f27433b, false);
        this.subWidgetManager.load(R.id.e4r, new LiveNewSpecialGiftWidget());
        if (LiveGiftGuideSetting.INSTANCE.getValue() != 0 && C3966y.f10868a == 1) {
            this.subWidgetManager.load(new LiveGiftGuideWidget());
        }
        C8803g gVar = C8729d.f21542u.f21552i;
        if (gVar != null) {
            C8729d.f21542u.f21552i = null;
            mo18288b(gVar);
        }
    }
}
