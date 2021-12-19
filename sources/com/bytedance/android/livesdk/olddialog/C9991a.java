package com.bytedance.android.livesdk.olddialog;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3931d;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.C4329e;
import com.bytedance.android.live.gift.C4330f;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.dialogv2.AbstractC8331a;
import com.bytedance.android.livesdk.firstrecharge.C8729d;
import com.bytedance.android.livesdk.firstrecharge.C8740e;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.p549e.AbstractC8807b;
import com.bytedance.android.livesdk.gift.p551g.p552a.EnumC8809a;
import com.bytedance.android.livesdk.guide.C8915c;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeStyleSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveEnableRechargeSucceedAnimationSetting;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.olddialog.p597a.C9993a;
import com.bytedance.android.livesdk.olddialog.p598b.C9995a;
import com.bytedance.android.livesdk.olddialog.p598b.C9998b;
import com.bytedance.android.livesdk.olddialog.viewmodel.C10041a;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.olddialog.widget.LiveNewFirstRechargeWidget;
import com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftBottomWidget;
import com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftGuestInfoWidget;
import com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftPageIndicatorWidget;
import com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9023aq;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.service.C10760d;
import com.bytedance.android.livesdk.service.assets.C10690j;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.p621a.C10631a;
import com.bytedance.android.livesdk.service.p621a.C10635b;
import com.bytedance.android.livesdk.service.p621a.C10639c;
import com.bytedance.android.livesdk.service.p625c.p626a.C10703a;
import com.bytedance.android.livesdk.service.p625c.p626a.C10715e;
import com.bytedance.android.livesdk.service.p625c.p626a.C10722f;
import com.bytedance.android.livesdk.service.p625c.p628c.C10730c;
import com.bytedance.android.livesdk.utils.C11221ak;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.android.livesdk.wallet.C11315d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.olddialog.a */
public final class C9991a extends AbstractC11293v implements AbstractC8331a, C9995a.AbstractC9996a, C10690j.AbstractC10691a {

    /* renamed from: a */
    LiveNewGiftPanelWidget f24271a;

    /* renamed from: b */
    LiveNewGiftBottomWidget f24272b;

    /* renamed from: c */
    C9998b f24273c;

    /* renamed from: d */
    String f24274d;

    /* renamed from: e */
    int f24275e;

    /* renamed from: f */
    private Room f24276f;

    /* renamed from: g */
    private boolean f24277g;

    /* renamed from: h */
    private GiftDialogViewModel.EnumC10040b f24278h;

    /* renamed from: i */
    private C10041a f24279i;

    /* renamed from: j */
    private C9995a f24280j;

    /* renamed from: k */
    private String f24281k;

    /* renamed from: l */
    private long f24282l;

    /* renamed from: m */
    private Runnable f24283m;

    /* renamed from: n */
    private final List<GiftPage> f24284n = new ArrayList();

    /* renamed from: t */
    private final C88411a f24285t = new C88411a();

    /* renamed from: u */
    private final WidgetCreateTimeUtil f24286u = new WidgetCreateTimeUtil();

    static {
        Covode.recordClassIndex(11545);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: c_ */
    public final C11221ak.EnumC11222a mo9928c_() {
        return C11221ak.EnumC11222a.PANEL_GIFT;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C10722f.m19298a(SystemClock.uptimeMillis() - this.f24282l);
    }

    @Override // com.bytedance.android.livesdk.dialogv2.AbstractC8331a
    /* renamed from: d */
    public final void mo9929d() {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f24271a;
        liveNewGiftPanelWidget.f24429m = false;
        liveNewGiftPanelWidget.f24427k = false;
        mo16812a(GiftManager.inst().getGiftPageList());
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void dismiss() {
        if (this.f27010p != null) {
            this.f27010p.mo28320c(C4329e.class, false);
        }
        C88411a aVar = this.f24285t;
        if (aVar != null) {
            aVar.mo142944a();
        }
        super.dismiss();
    }

    @Override // com.bytedance.android.livesdk.olddialog.p598b.C9995a.AbstractC9996a
    /* renamed from: e */
    public final void mo16814e() {
        C6779a.m14563a().mo13053a(new C10760d());
        getView().findViewById(R.id.ba0).setVisibility(8);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: i */
    public final boolean mo10398i() {
        if (this.f27010p != null) {
            this.f27010p.mo28320c(C4329e.class, false);
        }
        return super.mo10398i();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.f27010p != null) {
            this.f27010p.mo28315b(C4330f.class, (Object) false);
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        int i;
        int i2;
        int i3;
        IMessageManager iMessageManager;
        if (this.f27010p != null) {
            boolean booleanValue = ((Boolean) this.f27010p.mo28318b(C9076co.class)).booleanValue();
            C9995a aVar = this.f24280j;
            DataChannel dataChannel = this.f27010p;
            aVar.f24291c = dataChannel;
            if (dataChannel != null) {
                iMessageManager = (IMessageManager) dataChannel.mo28318b(C9068cg.class);
            } else {
                iMessageManager = null;
            }
            aVar.f24290b = iMessageManager;
            IMessageManager iMessageManager2 = aVar.f24290b;
            if (iMessageManager2 != null) {
                iMessageManager2.addMessageListener(EnumC9596a.GIFT_UPDATE.getIntType(), aVar);
            }
            if (!booleanValue) {
                i = R.layout.b5t;
                i3 = R.style.a2z;
                i2 = 5;
                AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(i);
                bVar.f27015b = i3;
                bVar.f27025l = 48;
                bVar.f27020g = i2;
                return bVar;
            }
        }
        i = R.layout.b5s;
        i3 = R.style.a2y;
        i2 = 80;
        AbstractC11293v.C11295b bVar2 = new AbstractC11293v.C11295b(i);
        bVar2.f27015b = i3;
        bVar2.f27025l = 48;
        bVar2.f27020g = i2;
        return bVar2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        IMessageManager iMessageManager;
        super.onDestroy();
        C10703a.C10704a.C10705a.f25783a.mo17630a();
        C10690j a = C10690j.m19257a();
        if (a.f25746b.contains(this)) {
            a.f25746b.remove(this);
        }
        C10041a aVar = this.f24279i;
        if (!(aVar == null || aVar.f24387c == null || this.f24279i.f24388d == null || this.f24279i.f24389e == null)) {
            C9995a aVar2 = this.f24280j;
            if (!(aVar2 == null || (iMessageManager = aVar2.f24290b) == null)) {
                iMessageManager.removeMessageListener(aVar2);
            }
            this.f24286u.send();
            this.f24279i.f24387c.removeObservers(this);
            this.f24279i.f24388d.removeObservers(this);
            this.f24279i.f24389e.removeObservers(this);
            int intValue = this.f24279i.f24386b.getValue().intValue();
            for (int i = 0; i < this.f24284n.size(); i++) {
                if (this.f24284n.get(i).pageType == intValue) {
                    C10715e eVar = C10715e.f25799h;
                    GiftPage giftPage = this.f24284n.get(i);
                    C89219l.m154721d(giftPage, "");
                    C6501b.C6502a.m13948a("tab_leave").mo12639a().mo12651a("gift_dialog_request_id", C10639c.f25641a).mo12651a("live", giftPage.pageName).mo12645a("tab_position", i + 1).mo12646a("stay_duration", (C11200a.m19851a() - eVar.f25807f) / 1000).mo12655b();
                    return;
                }
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onStart() {
        boolean z;
        super.onStart();
        if (this.f27010p != null) {
            boolean booleanValue = ((Boolean) this.f27010p.mo28318b(C9076co.class)).booleanValue();
            if (!booleanValue || (!this.f24277g && !C3931d.m9571a(getContext()))) {
                z = false;
            } else {
                z = true;
            }
            Window window = getDialog().getWindow();
            if (window != null) {
                if (!booleanValue || (!this.f24277g && !C3931d.m9571a(getContext()))) {
                    window.addFlags(1024);
                } else {
                    window.clearFlags(1024);
                }
                if (z) {
                    window.setLayout(-1, -2);
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.width = C3966y.m9664c();
                    attributes.height = C3966y.m9662b() - C3966y.m9666d();
                    window.setAttributes(attributes);
                } else if (booleanValue) {
                    window.setLayout(-1, -1);
                } else {
                    window.setLayout(C3966y.m9667d(R.dimen.wl), -1);
                }
            }
            if (this.f24283m != null) {
                new Handler(Looper.getMainLooper()).postDelayed(this.f24283m, 10);
            }
            this.f27010p.mo28315b(C4330f.class, (Object) true);
        }
    }

    /* renamed from: a */
    public final void mo16812a(List<GiftPage> list) {
        this.f24284n.clear();
        boolean z = false;
        for (GiftPage giftPage : list) {
            if (this.f24279i.f24386b.getValue().intValue() == giftPage.pageType) {
                z = true;
            }
            this.f24284n.add(giftPage);
        }
        if (!z) {
            this.f24279i.f24386b.setValue(1);
        }
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f24271a;
        if (liveNewGiftPanelWidget != null) {
            liveNewGiftPanelWidget.mo16872a(this.f24284n);
        }
        LiveNewGiftBottomWidget liveNewGiftBottomWidget = this.f24272b;
        if (liveNewGiftBottomWidget != null) {
            liveNewGiftBottomWidget.mo16869a(this.f24284n);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C10635b.C10636a.C10637a.f25639a.f25638a = true;
        C8729d.f21542u.f21558o = this.f24274d;
        this.f24282l = SystemClock.uptimeMillis();
        C10730c.m19321a();
        String str2 = "";
        if (this.f27010p == null || this.f27010p.mo28318b(C9023aq.class) == null) {
            str = str2;
        } else {
            str2 = ((Hashtag) this.f27010p.mo28318b(C9023aq.class)).title;
            str = String.valueOf(((Hashtag) this.f27010p.mo28318b(C9023aq.class)).f23083id);
        }
        C10722f.m19299a(this.f24274d, C3966y.m9670f(), str2, str);
        C10631a.C10632a.C10633a.f25635a.f25634a = true;
    }

    @Override // com.bytedance.android.livesdk.service.assets.C10690j.AbstractC10691a
    /* renamed from: b */
    public final void mo16813b(List<Prop> list) {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f24271a;
        liveNewGiftPanelWidget.f24421e.clear();
        liveNewGiftPanelWidget.f24421e.addAll(list);
        if (!(liveNewGiftPanelWidget.f24423g == null || liveNewGiftPanelWidget.f24423g.f24386b == null || liveNewGiftPanelWidget.f24423g.f24386b.getValue() == null || liveNewGiftPanelWidget.f24423g == null || liveNewGiftPanelWidget.f24423g.f24386b.getValue().intValue() != 5)) {
            liveNewGiftPanelWidget.mo16875b(list);
        }
        if (!(list == null || list.isEmpty() || list.get(0).banner == null)) {
            this.f24281k = list.get(0).banner.f23249f;
        }
        LiveNewGiftBottomWidget liveNewGiftBottomWidget = this.f24272b;
        String str = this.f24281k;
        if (str == null || !(liveNewGiftBottomWidget.f24395b == null || liveNewGiftBottomWidget.f24395b.f24386b == null || liveNewGiftBottomWidget.f24395b.f24386b.getValue() == null || liveNewGiftBottomWidget.f24395b.f24386b.getValue().intValue() == 5)) {
            liveNewGiftBottomWidget.f24396c.setVisibility(8);
        } else {
            liveNewGiftBottomWidget.f24396c.setVisibility(0);
        }
        liveNewGiftBottomWidget.f24397d = str;
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        super.onViewCreated(view, bundle);
        C10639c.m19198a();
        if (this.f27010p != null) {
            this.f24276f = (Room) this.f27010p.mo28318b(C9093de.class);
            this.f24277g = ((Boolean) this.f27010p.mo28318b(C9119ed.class)).booleanValue();
        }
        View view2 = getView();
        if (view2 != null) {
            view2.findViewById(R.id.crq).setOnClickListener(new View$OnClickListenerC10003g(this));
        }
        View view3 = getView();
        if (!(view3 == null || getContext() == null || this.f27010p == null)) {
            WidgetManager of = WidgetManager.m22024of(this, view3, C6204h.f15480c);
            of.mWidgetCreateTimeListener = this.f24286u;
            boolean booleanValue = ((Boolean) this.f27010p.mo28318b(C9076co.class)).booleanValue();
            LiveNewGiftPanelWidget liveNewGiftPanelWidget = new LiveNewGiftPanelWidget();
            this.f24271a = liveNewGiftPanelWidget;
            liveNewGiftPanelWidget.f24423g = this.f24279i;
            this.f24271a.f24419c = this.f24278h;
            this.f24271a.f24424h = booleanValue;
            this.f24271a.f24426j = this.f24274d;
            long j2 = 0;
            if (this.f24279i.f24391g.getValue() != null) {
                j = this.f24279i.f24391g.getValue().longValue();
            } else {
                j = 0;
            }
            long a = C9993a.m18475a(getContext(), "default_dialog_item");
            if (j == 0) {
                j = a;
            }
            this.f24271a.f24425i = j;
            ((ViewGroup) getView().findViewById(R.id.akq)).setClipChildren(!booleanValue);
            of.load(R.id.crr, this.f24271a, false);
            LiveNewGiftPageIndicatorWidget liveNewGiftPageIndicatorWidget = new LiveNewGiftPageIndicatorWidget();
            liveNewGiftPageIndicatorWidget.f24412b = this.f24279i;
            of.load(R.id.cyo, liveNewGiftPageIndicatorWidget);
            LiveNewGiftBottomWidget liveNewGiftBottomWidget = new LiveNewGiftBottomWidget();
            this.f24272b = liveNewGiftBottomWidget;
            liveNewGiftBottomWidget.f24395b = this.f24279i;
            this.f24272b.f24398e = this.f24274d;
            of.load(R.id.cro, this.f24272b, false);
            mo16812a(GiftManager.inst().getGiftPageList());
            if (booleanValue && this.f24278h == GiftDialogViewModel.EnumC10040b.GUEST) {
                LiveNewGiftGuestInfoWidget liveNewGiftGuestInfoWidget = new LiveNewGiftGuestInfoWidget();
                liveNewGiftGuestInfoWidget.f24410a = this.f24279i;
                of.load(R.id.ba3, liveNewGiftGuestInfoWidget);
                getView().findViewById(R.id.ba3).setVisibility(0);
            }
            if (LiveFirstRechargeStyleSetting.INSTANCE.getValue() && C8729d.f21542u.mo15009d() && !C8729d.f21542u.mo15010e()) {
                C8740e.m17059a();
                of.load(R.id.ba0, new LiveNewFirstRechargeWidget());
                getView().findViewById(R.id.ba0).setVisibility(0);
            }
            C99921 r6 = new AbstractC8807b() {
                /* class com.bytedance.android.livesdk.olddialog.C9991a.C99921 */

                static {
                    Covode.recordClassIndex(11546);
                }

                @Override // com.bytedance.android.livesdk.gift.p549e.AbstractC8807b
                /* renamed from: a */
                public final void mo8519a(List<C9904t> list) {
                }

                @Override // com.bytedance.android.livesdk.gift.p549e.AbstractC8807b
                /* renamed from: b */
                public final void mo8520b(List<GiftPage> list) {
                    C9991a.this.mo16812a(list);
                }
            };
            GiftManager inst = GiftManager.inst();
            Room room = this.f24276f;
            if (room != null) {
                j2 = room.getId();
            }
            inst.syncGiftList(r6, j2, 3, this.f24277g);
            C10690j a2 = C10690j.m19257a();
            if (!a2.f25746b.contains(this)) {
                a2.f25746b.add(this);
            }
            if (this.f24276f != null) {
                C10690j.m19257a().mo17629b(this.f24276f.getId());
            }
        }
        this.f24279i.f24387c.observe(this, new C9994b(this));
        this.f24279i.f24388d.observe(this, new C9999c(this));
        this.f24279i.f24389e.observe(this, new C10000d(this));
        if (this.f27010p != null) {
            this.f27010p.mo28320c(C4329e.class, true);
            this.f27010p.mo28309a((AbstractC1204m) this, C4329e.class, (AbstractC89172b) new C10001e(this));
        }
        if (LiveEnableRechargeSucceedAnimationSetting.INSTANCE.enable()) {
            this.f24285t.mo142945a(C6779a.m14563a().mo13052a(C11315d.class).mo143289d(new C10002f(this)));
        }
        this.f24273c.f24294a = getContext();
    }

    /* renamed from: a */
    public static C9991a m18464a(Room room, User user, EnumC8809a aVar, String str, Runnable runnable, long j) {
        C9991a aVar2 = new C9991a();
        if (user == null || user.getId() == room.getOwnerUserId()) {
            aVar2.f24278h = GiftDialogViewModel.EnumC10040b.ANCHOR;
        } else {
            aVar2.f24278h = GiftDialogViewModel.EnumC10040b.GUEST;
        }
        aVar2.f24276f = room;
        if (C8915c.f21976a && "icon".equals(str)) {
            str = "gift_guide_bubble";
        }
        aVar2.f24274d = str;
        aVar2.f24273c = new C9998b();
        C9995a aVar3 = new C9995a();
        aVar2.f24280j = aVar3;
        C89219l.m154721d(aVar2, "");
        aVar3.f24289a = aVar2;
        aVar2.f24280j.f24292d = str;
        aVar2.f24273c.f24295b = user;
        aVar2.f24279i = new C10041a();
        if (EnumC8809a.DEFAULT != aVar) {
            aVar2.f24279i.f24386b.setValue(Integer.valueOf(aVar.value));
        } else {
            aVar2.f24279i.f24386b.setValue(Integer.valueOf(C9993a.m18474a(C3966y.m9669e(), "sp_gift_page_type", 1)));
        }
        if (str.equals("gift_panel") && GiftManager.inst().getTabByGiftId(j) != -1) {
            aVar2.f24279i.f24386b.setValue(Integer.valueOf(GiftManager.inst().getTabByGiftId(j)));
        }
        aVar2.f24279i.f24391g.setValue(Long.valueOf(j));
        aVar2.f24279i.f24385a = user;
        aVar2.f24283m = runnable;
        return aVar2;
    }
}
