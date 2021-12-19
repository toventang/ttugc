package com.bytedance.android.livesdk.dialogv2;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.C1213t;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.p218f.C3931d;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.p218f.p219a.C3889a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.C4329e;
import com.bytedance.android.live.gift.C4330f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.C8972i;
import com.bytedance.android.livesdk.C9005j;
import com.bytedance.android.livesdk.dialogv2.p515a.C8332a;
import com.bytedance.android.livesdk.dialogv2.p517c.C8350a;
import com.bytedance.android.livesdk.dialogv2.p517c.C8359c;
import com.bytedance.android.livesdk.dialogv2.p517c.C8366d;
import com.bytedance.android.livesdk.dialogv2.viewmodel.C8374a;
import com.bytedance.android.livesdk.dialogv2.viewmodel.LiveGiftDialogViewModel;
import com.bytedance.android.livesdk.dialogv2.widget.LiveGiftBottomWidget;
import com.bytedance.android.livesdk.dialogv2.widget.LiveGiftDescriptionWidget;
import com.bytedance.android.livesdk.dialogv2.widget.LiveGiftGuestInfoWidget;
import com.bytedance.android.livesdk.dialogv2.widget.LiveGiftPanelWidget;
import com.bytedance.android.livesdk.firstrecharge.C8729d;
import com.bytedance.android.livesdk.livesetting.wallet.LiveEnableRechargeSucceedAnimationSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.olddialog.p597a.C9993a;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9023aq;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p640t.C10890a;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.p621a.C10631a;
import com.bytedance.android.livesdk.service.p621a.C10639c;
import com.bytedance.android.livesdk.service.p625c.p626a.C10703a;
import com.bytedance.android.livesdk.service.p625c.p626a.C10715e;
import com.bytedance.android.livesdk.service.p625c.p626a.C10722f;
import com.bytedance.android.livesdk.service.p625c.p628c.C10730c;
import com.bytedance.android.livesdk.utils.C11221ak;
import com.bytedance.android.livesdk.utils.C11227ap;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.android.livesdk.wallet.C11315d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.dialogv2.b */
public final class C8338b extends AbstractC11293v implements AbstractC8331a {

    /* renamed from: e */
    public static final C8339a f20631e = new C8339a((byte) 0);

    /* renamed from: a */
    public LiveGiftBottomWidget f20632a;

    /* renamed from: b */
    public LiveGiftPanelWidget f20633b;

    /* renamed from: c */
    public LiveGiftDialogViewModel f20634c;

    /* renamed from: d */
    public Runnable f20635d;

    /* renamed from: f */
    private boolean f20636f;

    /* renamed from: g */
    private Room f20637g;

    /* renamed from: h */
    private boolean f20638h = true;

    /* renamed from: i */
    private long f20639i;

    /* renamed from: j */
    private final WidgetCreateTimeUtil f20640j = new WidgetCreateTimeUtil(null, 1, null);

    /* renamed from: k */
    private final C88411a f20641k = new C88411a();

    /* renamed from: l */
    private HashMap f20642l;

    static {
        Covode.recordClassIndex(9176);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f20642l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f20642l == null) {
            this.f20642l = new HashMap();
        }
        View view = (View) this.f20642l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f20642l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.b$a */
    public static final class C8339a {
        static {
            Covode.recordClassIndex(9177);
        }

        private C8339a() {
        }

        public /* synthetic */ C8339a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: c_ */
    public final C11221ak.EnumC11222a mo9928c_() {
        return C11221ak.EnumC11222a.PANEL_GIFT;
    }

    @Override // com.bytedance.android.livesdk.dialogv2.AbstractC8331a
    /* renamed from: d */
    public final void mo9929d() {
        LiveGiftPanelWidget liveGiftPanelWidget = this.f20633b;
        if (liveGiftPanelWidget != null) {
            liveGiftPanelWidget.mo14717a();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: i */
    public final boolean mo10398i() {
        dismissAllowingStateLoss();
        return super.mo10398i();
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b5v);
        bVar.f27015b = R.style.a2y;
        bVar.f27025l = 48;
        bVar.f27020g = 80;
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C10722f.m19298a(SystemClock.uptimeMillis() - this.f20639i);
        C6779a.m14563a().mo13053a(new C9005j());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28320c(C4329e.class, false);
        }
        this.f20641k.mo142944a();
        this.f20640j.send();
        C10703a.C10704a.C10705a.f25783a.mo17630a();
        C6501b.C6502a.m13948a("tab_leave").mo12639a().mo12651a("gift_dialog_request_id", C10639c.f25641a).mo12651a("live", GiftManager.inst().getTabName(C8374a.C8375a.C8376a.f20718a.f20716j)).mo12645a("tab_position", GiftManager.inst().getTabLocation(C8374a.C8375a.C8376a.f20718a.f20716j)).mo12646a("stay_duration", (C11200a.m19851a() - C10715e.f25799h.f25807f) / 1000).mo12655b();
        DataChannel dataChannel2 = this.f27010p;
        if (dataChannel2 != null) {
            dataChannel2.mo28315b(C4330f.class, (Object) false);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onStart() {
        boolean z;
        Window window;
        super.onStart();
        if (this.f27010p != null) {
            DataChannel dataChannel = this.f27010p;
            if (dataChannel == null) {
                C89219l.m154715b();
            }
            Object b = dataChannel.mo28318b(C9076co.class);
            if (b == null) {
                C89219l.m154715b();
            }
            boolean booleanValue = ((Boolean) b).booleanValue();
            if (!booleanValue || (!this.f20636f && !C3931d.m9571a(getContext()))) {
                z = false;
            } else {
                z = true;
            }
            Dialog dialog = getDialog();
            if (!(dialog == null || (window = dialog.getWindow()) == null)) {
                if (!booleanValue || (!this.f20636f && !C3931d.m9571a(getContext()))) {
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
            Handler handler = new Handler(Looper.getMainLooper());
            Runnable runnable = this.f20635d;
            if (runnable != null) {
                handler.postDelayed(runnable, 10);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.b$d */
    static final class View$OnClickListenerC8342d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8338b f20645a;

        static {
            Covode.recordClassIndex(9180);
        }

        View$OnClickListenerC8342d(C8338b bVar) {
            this.f20645a = bVar;
        }

        public final void onClick(View view) {
            this.f20645a.dismissAllowingStateLoss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.b$b */
    static final class C8340b extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C8338b f20643a;

        static {
            Covode.recordClassIndex(9178);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8340b(C8338b bVar) {
            super(1);
            this.f20643a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            bool.booleanValue();
            this.f20643a.dismissAllowingStateLoss();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.b$e */
    static final class C8343e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C8338b f20646a;

        static {
            Covode.recordClassIndex(9181);
        }

        C8343e(C8338b bVar) {
            this.f20646a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            View view = this.f20646a.getView();
            if (view != null) {
                view.postDelayed(new Runnable(this) {
                    /* class com.bytedance.android.livesdk.dialogv2.C8338b.C8343e.RunnableC83441 */

                    /* renamed from: a */
                    final /* synthetic */ C8343e f20647a;

                    static {
                        Covode.recordClassIndex(9182);
                    }

                    {
                        this.f20647a = r1;
                    }

                    public final void run() {
                        View view;
                        float a;
                        View view2 = this.f20647a.f20646a.getView();
                        if (view2 != null) {
                            view = view2.findViewById(R.id.akt);
                        } else {
                            view = null;
                        }
                        Context context = this.f20647a.f20646a.getContext();
                        if (context != null) {
                            C6779a a2 = C6779a.m14563a();
                            if (view != null) {
                                a = (float) view.getHeight();
                            } else {
                                a = C11227ap.m19885a(context, 276.0f);
                            }
                            a2.mo13053a(new C8972i(Float.valueOf(a)));
                        }
                    }
                }, 30);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.b$c */
    static final class C8341c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C8338b f20644a;

        static {
            Covode.recordClassIndex(9179);
        }

        C8341c(C8338b bVar) {
            this.f20644a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C8332a aVar;
            HSImageView hSImageView;
            File tTLiveGeckoResourceFile;
            C11315d dVar = (C11315d) obj;
            if (dVar != null) {
                int i = dVar.f27066b;
                LiveGiftBottomWidget liveGiftBottomWidget = this.f20644a.f20632a;
                if (!(liveGiftBottomWidget == null || (tTLiveGeckoResourceFile = ((IHostContext) C6193a.m13435a(IHostContext.class)).getTTLiveGeckoResourceFile("tiktok_live_basic_resource", "ttlive_recharge_anim.webp")) == null)) {
                    HSImageView hSImageView2 = (HSImageView) liveGiftBottomWidget.findViewById(R.id.byv);
                    C89219l.m154716b(hSImageView2, "");
                    hSImageView2.setVisibility(0);
                    C3889a a = C3889a.m9507a(hSImageView2.getContext()).mo9250a(tTLiveGeckoResourceFile).mo9249a(ImageView.ScaleType.CENTER_CROP);
                    a.f10759h = true;
                    a.f10753b = new LiveGiftBottomWidget.C8384g(liveGiftBottomWidget, i);
                    a.mo9252a(hSImageView2);
                }
                LiveGiftPanelWidget liveGiftPanelWidget = this.f20644a.f20633b;
                if (!(liveGiftPanelWidget == null || (aVar = liveGiftPanelWidget.f20758b) == null)) {
                    if (aVar.f20622a instanceof C8366d) {
                        C8350a aVar2 = aVar.f20622a;
                        Objects.requireNonNull(aVar2, "null cannot be cast to non-null type com.bytedance.android.livesdk.dialogv2.viewholder.LiveGiftPanelViewHolder");
                        C8366d dVar2 = (C8366d) aVar2;
                        if (!dVar2.mo14686e() && (hSImageView = dVar2.f20650c) != null) {
                            hSImageView.postDelayed(new C8366d.RunnableC8370d(dVar2), 50);
                        }
                    } else if (aVar.f20622a instanceof C8359c) {
                        C8350a aVar3 = aVar.f20622a;
                        Objects.requireNonNull(aVar3, "null cannot be cast to non-null type com.bytedance.android.livesdk.dialogv2.viewholder.LiveGiftFirstRechargeViewHolder");
                        C8359c cVar = (C8359c) aVar3;
                        if (!cVar.mo14686e()) {
                            if (C8729d.f21542u.mo15011f()) {
                                HSImageView hSImageView3 = cVar.f20650c;
                                if (hSImageView3 != null) {
                                    hSImageView3.postDelayed(new C8359c.RunnableC8365e(cVar), 50);
                                }
                            } else {
                                LottieAnimationView lottieAnimationView = cVar.f20674o;
                                if (lottieAnimationView != null) {
                                    lottieAnimationView.mo5826a();
                                }
                            }
                        }
                    }
                }
                C6501b.C6502a.m13948a("livesdk_recharge_success_anime").mo12639a().mo12655b();
            }
        }
    }

    /* renamed from: a */
    public static final C8338b m16500a(Runnable runnable) {
        C1213t<Integer> tVar;
        long j;
        C1213t<Integer> tVar2;
        long j2;
        C8338b bVar = new C8338b();
        bVar.f20634c = new LiveGiftDialogViewModel();
        if (C89219l.m154714a((Object) C8374a.C8375a.C8376a.f20718a.f20711e, (Object) "gift_panel")) {
            GiftManager inst = GiftManager.inst();
            Long l = C8374a.C8375a.C8376a.f20718a.f20707a;
            long j3 = 0;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            if (inst.getTabByGiftId(j) != -1) {
                LiveGiftDialogViewModel liveGiftDialogViewModel = bVar.f20634c;
                if (!(liveGiftDialogViewModel == null || (tVar2 = liveGiftDialogViewModel.f20705a) == null)) {
                    GiftManager inst2 = GiftManager.inst();
                    Long l2 = C8374a.C8375a.C8376a.f20718a.f20707a;
                    if (l2 != null) {
                        j2 = l2.longValue();
                    } else {
                        j2 = 0;
                    }
                    tVar2.setValue(Integer.valueOf(inst2.getTabByGiftId(j2)));
                }
                C8374a aVar = C8374a.C8375a.C8376a.f20718a;
                GiftManager inst3 = GiftManager.inst();
                Long l3 = C8374a.C8375a.C8376a.f20718a.f20707a;
                if (l3 != null) {
                    j3 = l3.longValue();
                }
                aVar.f20713g = inst3.getTabByGiftId(j3);
                bVar.f20635d = runnable;
                return bVar;
            }
        }
        LiveGiftDialogViewModel liveGiftDialogViewModel2 = bVar.f20634c;
        if (!(liveGiftDialogViewModel2 == null || (tVar = liveGiftDialogViewModel2.f20705a) == null)) {
            tVar.setValue(Integer.valueOf(C9993a.m18474a(C3966y.m9669e(), "sp_gift_page_type", 1)));
        }
        C8374a.C8375a.C8376a.f20718a.f20713g = C9993a.m18474a(C3966y.m9669e(), "sp_gift_page_type", 1);
        bVar.f20635d = runnable;
        return bVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        Long l;
        Hashtag hashtag;
        Hashtag hashtag2;
        boolean z;
        super.onCreate(bundle);
        C10715e eVar = C10715e.f25799h;
        eVar.f25808g = C8374a.C8375a.C8376a.f20718a.f20711e;
        eVar.f25807f = C11200a.m19851a();
        String a = C10715e.m19278a(String.valueOf(C10890a.m19495a() + C11200a.m19851a()));
        if (!C89219l.m154714a((Object) eVar.f25803b, (Object) a)) {
            eVar.f25803b = a;
            if (C8374a.C8375a.C8376a.f20718a.f20709c == GiftDialogViewModel.EnumC10040b.GUEST) {
                z = true;
            } else {
                z = false;
            }
            eVar.f25806e = z;
        }
        this.f20639i = SystemClock.uptimeMillis();
        DataChannel dataChannel = this.f27010p;
        if (dataChannel == null || (hashtag2 = (Hashtag) dataChannel.mo28318b(C9023aq.class)) == null || (str = hashtag2.title) == null) {
            str = "";
        }
        DataChannel dataChannel2 = this.f27010p;
        if (dataChannel2 == null || (hashtag = (Hashtag) dataChannel2.mo28318b(C9023aq.class)) == null) {
            l = null;
        } else {
            l = hashtag.f23083id;
        }
        C10722f.m19299a(C8374a.C8375a.C8376a.f20718a.f20711e, C3966y.m9670f(), str, String.valueOf(l));
        C10631a.C10632a.C10633a.f25635a.f25634a = true;
        C10730c.m19321a();
        this.f20641k.mo142945a(C6779a.m14563a().mo13052a(C9005j.class).mo143289d(new C8343e(this)));
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        Room room;
        long j;
        Boolean bool;
        Boolean bool2;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        boolean z2 = true;
        C8374a.C8375a.C8376a.f20718a.f20714h = true;
        DataChannel dataChannel = this.f27010p;
        if (dataChannel == null || (bool2 = (Boolean) dataChannel.mo28318b(C9119ed.class)) == null) {
            z = false;
        } else {
            z = bool2.booleanValue();
        }
        this.f20636f = z;
        DataChannel dataChannel2 = this.f27010p;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.mo28318b(C9093de.class);
        } else {
            room = null;
        }
        this.f20637g = room;
        DataChannel dataChannel3 = this.f27010p;
        if (!(dataChannel3 == null || (bool = (Boolean) dataChannel3.mo28318b(C9076co.class)) == null)) {
            z2 = bool.booleanValue();
        }
        this.f20638h = z2;
        DataChannel dataChannel4 = this.f27010p;
        if (dataChannel4 != null) {
            dataChannel4.mo28320c(C4329e.class, true);
        }
        DataChannel dataChannel5 = this.f27010p;
        if (dataChannel5 != null) {
            dataChannel5.mo28312a((Object) this, C4329e.class, (AbstractC89172b) new C8340b(this));
        }
        if (LiveEnableRechargeSucceedAnimationSetting.INSTANCE.enable()) {
            this.f20641k.mo142945a(C6779a.m14563a().mo13052a(C11315d.class).mo143289d(new C8341c(this)));
        }
        C10639c.m19198a();
        GiftManager inst = GiftManager.inst();
        Room room2 = this.f20637g;
        if (room2 != null) {
            j = room2.getId();
        } else {
            j = 0;
        }
        inst.syncGiftList(null, j, 3, this.f20636f);
        ((FrameLayout) mo8166a_(R.id.crq)).setOnClickListener(new View$OnClickListenerC8342d(this));
        WidgetManager of = WidgetManager.m22024of(this, getView(), C6204h.f15480c);
        of.mWidgetCreateTimeListener = this.f20640j;
        of.load(R.id.b_t, new LiveGiftDescriptionWidget(), false);
        LiveGiftPanelWidget liveGiftPanelWidget = new LiveGiftPanelWidget(this.f20634c);
        this.f20633b = liveGiftPanelWidget;
        of.load(R.id.crr, liveGiftPanelWidget);
        if (C8374a.C8375a.C8376a.f20718a.f20709c == GiftDialogViewModel.EnumC10040b.GUEST) {
            LiveGiftGuestInfoWidget liveGiftGuestInfoWidget = new LiveGiftGuestInfoWidget();
            LiveGiftDialogViewModel liveGiftDialogViewModel = this.f20634c;
            if (liveGiftDialogViewModel != null) {
                C89219l.m154721d(liveGiftDialogViewModel, "");
                liveGiftGuestInfoWidget.f20752a = liveGiftDialogViewModel;
            }
            View a_ = mo8166a_(R.id.b_v);
            C89219l.m154716b(a_, "");
            a_.setVisibility(8);
            of.load(R.id.ba3, liveGiftGuestInfoWidget);
        }
        LiveGiftBottomWidget liveGiftBottomWidget = new LiveGiftBottomWidget();
        this.f20632a = liveGiftBottomWidget;
        GiftManager inst2 = GiftManager.inst();
        C89219l.m154716b(inst2, "");
        liveGiftBottomWidget.f20723d = inst2.getGiftPageList();
        liveGiftBottomWidget.mo14701a();
        LiveGiftBottomWidget liveGiftBottomWidget2 = this.f20632a;
        if (liveGiftBottomWidget2 != null) {
            liveGiftBottomWidget2.f20721b = this.f20634c;
        }
        of.load(R.id.cro, this.f20632a);
        DataChannel dataChannel6 = this.f27010p;
        if (dataChannel6 != null) {
            dataChannel6.mo28315b(C4330f.class, (Object) true);
        }
    }
}
