package com.bytedance.android.live.wallet.p413a;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.p230a.C4054a;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.live.gift.C4341q;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.rtl.RtlViewPager;
import com.bytedance.android.live.wallet.AbstractC6332d;
import com.bytedance.android.live.wallet.AbstractC6347f;
import com.bytedance.android.live.wallet.C6336e;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.adapter.C6293a;
import com.bytedance.android.live.wallet.adapter.C6300b;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.BasePackage;
import com.bytedance.android.live.wallet.model.C6381d;
import com.bytedance.android.live.wallet.model.C6384g;
import com.bytedance.android.live.wallet.model.CurrencyInfo;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.UserBalance;
import com.bytedance.android.live.wallet.p416c.C6318b;
import com.bytedance.android.live.wallet.p416c.C6331c;
import com.bytedance.android.live.wallet.p419f.p420a.C6351d;
import com.bytedance.android.live.wallet.p419f.p421b.AbstractC6358b;
import com.bytedance.android.live.wallet.p422g.C6361a;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.event.C8458k;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeEntranceSchema;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeTitle;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRoomRechargeAgreementConfigSetting;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWebRechargeAuditing;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWebRechargeDialog;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWebRechargeUrl;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeFeedbackUrlSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9096dh;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p562k.DialogC9146a;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.wallet.C11314c;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdk.wallet.p657a.C11310a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11636c;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.C11637d;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.model.LiveRechargeAgreementConfig;
import com.bytedance.android.livesdkapi.p690f.C11756a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1114a.AbstractC16042a;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.live.wallet.a.i */
public final class C6266i extends AbstractC11293v implements AbstractC6358b {

    /* renamed from: n */
    public static final C6267a f15667n = new C6267a((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f15668A = C89250i.m154773a((AbstractC89171a) new C6270d(this));

    /* renamed from: B */
    private final AbstractC89244h f15669B = C89250i.m154773a((AbstractC89171a) new C6281o(this));

    /* renamed from: C */
    private C11314c f15670C;

    /* renamed from: D */
    private final AbstractC89244h f15671D = C89250i.m154773a((AbstractC89171a) new C6283q(this));

    /* renamed from: E */
    private final AbstractC89244h f15672E = C89250i.m154773a((AbstractC89171a) new C6279m(this));

    /* renamed from: F */
    private HashMap f15673F;

    /* renamed from: a */
    public C11637d f15674a;

    /* renamed from: b */
    public Activity f15675b;

    /* renamed from: c */
    public String f15676c = "";

    /* renamed from: d */
    public boolean f15677d;

    /* renamed from: e */
    public boolean f15678e;

    /* renamed from: f */
    public LiveTextView f15679f;

    /* renamed from: g */
    public DialogC9146a f15680g;

    /* renamed from: h */
    public C6351d f15681h;

    /* renamed from: i */
    public C11314c f15682i;

    /* renamed from: j */
    public C11314c f15683j;

    /* renamed from: k */
    public C11314c f15684k;

    /* renamed from: l */
    public AbstractC6347f f15685l;

    /* renamed from: m */
    public AbstractC11635b f15686m;

    /* renamed from: t */
    private Application.ActivityLifecycleCallbacks f15687t = new C6269c(this);

    /* renamed from: u */
    private C6300b f15688u;

    /* renamed from: v */
    private FrameLayout f15689v;

    /* renamed from: w */
    private final AbstractC89244h f15690w = C89250i.m154773a((AbstractC89171a) new C6280n(this));

    /* renamed from: x */
    private final AbstractC89244h f15691x = C89250i.m154773a((AbstractC89171a) new C6278l(this));

    /* renamed from: y */
    private final AbstractC89244h f15692y = C89250i.m154773a((AbstractC89171a) new C6282p(this));

    /* renamed from: z */
    private final AbstractC89244h f15693z = C89250i.m154773a((AbstractC89171a) new C6290x(this));

    static {
        Covode.recordClassIndex(6979);
    }

    /* renamed from: o */
    private final int m13585o() {
        return ((Number) this.f15668A.getValue()).intValue();
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f15673F;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f15673F == null) {
            this.f15673F = new HashMap();
        }
        View view = (View) this.f15673F.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f15673F.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public final boolean mo9929d() {
        return ((Boolean) this.f15690w.getValue()).booleanValue();
    }

    /* renamed from: e */
    public final String mo12284e() {
        return (String) this.f15691x.getValue();
    }

    /* renamed from: f */
    public final String mo12285f() {
        return (String) this.f15692y.getValue();
    }

    /* renamed from: g */
    public final int mo12286g() {
        return ((Number) this.f15693z.getValue()).intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final long mo12287h() {
        return ((Number) this.f15669B.getValue()).longValue();
    }

    /* renamed from: j */
    public final String mo12288j() {
        return (String) this.f15671D.getValue();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$a */
    public static final class C6267a {
        static {
            Covode.recordClassIndex(6980);
        }

        private C6267a() {
        }

        public /* synthetic */ C6267a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.wallet.p419f.p421b.AbstractC6359c
    /* renamed from: c */
    public final void mo12262c() {
        DialogC9146a aVar = this.f15680g;
        if (aVar != null) {
            C11279p.m20014b(aVar);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$d */
    static final class C6270d extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C6266i f15698a;

        static {
            Covode.recordClassIndex(6983);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6270d(C6266i iVar) {
            super(0);
            this.f15698a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            int i;
            Bundle arguments = this.f15698a.getArguments();
            if (arguments != null) {
                i = arguments.getInt("key_bundle_can_exchange");
            } else {
                i = 0;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$l */
    static final class C6278l extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C6266i f15708a;

        static {
            Covode.recordClassIndex(6991);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6278l(C6266i iVar) {
            super(0);
            this.f15708a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String str;
            Bundle arguments = this.f15708a.getArguments();
            if (arguments == null || (str = arguments.getString("KEY_CHARGE_REASON")) == null) {
                str = "";
            }
            C89219l.m154716b(str, "");
            return str;
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$m */
    static final class C6279m extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C6266i f15709a;

        static {
            Covode.recordClassIndex(6992);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6279m(C6266i iVar) {
            super(0);
            this.f15709a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            int i;
            Bundle arguments = this.f15709a.getArguments();
            if (arguments != null) {
                i = arguments.getInt("key_bundle_charge_source");
            } else {
                i = 0;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$n */
    static final class C6280n extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C6266i f15710a;

        static {
            Covode.recordClassIndex(6993);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6280n(C6266i iVar) {
            super(0);
            this.f15710a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Boolean bool;
            DataChannel dataChannel = this.f15710a.f27010p;
            if (dataChannel == null || (bool = (Boolean) dataChannel.mo28318b(C9076co.class)) == null) {
                z = true;
            } else {
                z = bool.booleanValue();
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$p */
    static final class C6282p extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C6266i f15712a;

        static {
            Covode.recordClassIndex(6995);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6282p(C6266i iVar) {
            super(0);
            this.f15712a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String str;
            Bundle arguments = this.f15712a.getArguments();
            if (arguments == null || (str = arguments.getString("key_bundle_previous_page")) == null) {
                str = "normal";
            }
            C89219l.m154716b(str, "");
            return str;
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$q */
    static final class C6283q extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C6266i f15713a;

        static {
            Covode.recordClassIndex(6996);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6283q(C6266i iVar) {
            super(0);
            this.f15713a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String str;
            Bundle arguments = this.f15713a.getArguments();
            if (arguments == null || (str = arguments.getString("KEY_REQUEST_PAGE")) == null) {
                str = "live_detail";
            }
            C89219l.m154716b(str, "");
            return str;
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$x */
    static final class C6290x extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C6266i f15724a;

        static {
            Covode.recordClassIndex(7003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6290x(C6266i iVar) {
            super(0);
            this.f15724a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            int i;
            Bundle arguments = this.f15724a.getArguments();
            if (arguments != null) {
                i = arguments.getInt("key_bundle_show_balance");
            } else {
                i = 0;
            }
            return Integer.valueOf(i);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void dismiss() {
        C6351d dVar = this.f15681h;
        if (dVar != null) {
            dVar.mo8577b();
        }
        C6351d dVar2 = this.f15681h;
        if (dVar2 != null) {
            dVar2.mo12412f();
        }
        super.dismiss();
    }

    @Override // com.bytedance.android.live.wallet.p419f.p421b.AbstractC6358b
    /* renamed from: l */
    public final void mo12290l() {
        LoadingStatusView loadingStatusView;
        View view = getView();
        if (view != null && (loadingStatusView = (LoadingStatusView) view.findViewById(R.id.e7i)) != null) {
            loadingStatusView.setStatus(0);
        }
    }

    @Override // com.bytedance.android.live.wallet.p419f.p421b.AbstractC6358b
    /* renamed from: m */
    public final void mo12291m() {
        LoadingStatusView loadingStatusView;
        View view = getView();
        if (view != null && (loadingStatusView = (LoadingStatusView) view.findViewById(R.id.e7i)) != null) {
            loadingStatusView.mo12206a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        Application application;
        super.onDestroy();
        ActivityC0945e activity = getActivity();
        if (activity != null && (application = activity.getApplication()) != null) {
            application.unregisterActivityLifecycleCallbacks(this.f15687t);
        }
    }

    /* renamed from: p */
    private static String m13586p() {
        if (C11279p.m20013a((CharSequence) LiveExchangeEntranceSchema.INSTANCE.getValue())) {
            return LiveExchangeEntranceSchema.INSTANCE.getValue();
        }
        AbstractC2953a a = C6193a.m13435a(IHostApp.class);
        C89219l.m154716b(a, "");
        if (((IHostApp) a).isInMusicallyRegion()) {
            return "sslocal://webcast_lynxview?type=popup&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Fexchange%2Fpackage_exchange.js&height=446&radius=8&gravity=bottom&popup_enter_type=right";
        }
        return "sslocal://webcast_lynxview?type=popup&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Fexchange%2Fpackage_exchange.js&height=446&radius=8&gravity=bottom&popup_enter_type=right";
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$o */
    static final class C6281o extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        final /* synthetic */ C6266i f15711a;

        static {
            Covode.recordClassIndex(6994);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6281o(C6266i iVar) {
            super(0);
            this.f15711a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            long j;
            long j2;
            Bundle arguments = this.f15711a.getArguments();
            if (arguments != null) {
                j = arguments.getLong("key_bundle_need_coins");
            } else {
                j = 0;
            }
            Bundle arguments2 = this.f15711a.getArguments();
            if (arguments2 != null) {
                j2 = arguments2.getLong("key_bundle_total_coins");
            } else {
                j2 = 0;
            }
            AbstractC6332d walletCenter = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter();
            C89219l.m154716b(walletCenter, "");
            long b = walletCenter.mo12373b();
            if (j == 0 && j2 > 0) {
                j = j2 - b;
            }
            return Long.valueOf(j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.wallet.a.i$r */
    public static final class RunnableC6284r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6266i f15714a;

        /* renamed from: b */
        final /* synthetic */ int f15715b;

        /* renamed from: c */
        final /* synthetic */ Exception f15716c;

        static {
            Covode.recordClassIndex(6997);
        }

        RunnableC6284r(C6266i iVar, int i, Exception exc) {
            this.f15714a = iVar;
            this.f15715b = i;
            this.f15716c = exc;
        }

        public final void run() {
            int i;
            if (this.f15715b == 302 && !C6336e.C6337a.m13682a()) {
                Context context = this.f15714a.getContext();
                if (context != null) {
                    C89219l.m154716b(context, "");
                    String string = context.getString(R.string.en2);
                    C89219l.m154716b(string, "");
                    String string2 = context.getString(R.string.en3);
                    C89219l.m154716b(string2, "");
                    String e = this.f15714a.mo12284e();
                    C11314c cVar = this.f15714a.f15684k;
                    if (cVar != null) {
                        i = cVar.f27058d;
                    } else {
                        i = 0;
                    }
                    C6361a.m13730a(context, string, string2, "context", "package", 302, new C11310a(e, i));
                }
            } else if (this.f15716c != null) {
                C11264f.m19957a(this.f15714a.getContext(), this.f15716c);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        int i;
        int i2;
        int a;
        int i3;
        if (mo9929d()) {
            i = R.layout.b76;
        } else {
            i = R.layout.b75;
        }
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(i);
        bVar.f27017d = mo9929d();
        if (mo9929d()) {
            i2 = 80;
        } else {
            i2 = 8388613;
        }
        bVar.f27020g = i2;
        if (mo9929d()) {
            a = -1;
        } else {
            a = C3966y.m9653a(375.0f);
        }
        bVar.f27021h = a;
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            if (mo9929d()) {
                i3 = -2;
            } else {
                i3 = C3966y.m9656a(activity).heightPixels;
            }
            bVar.f27022i = i3;
        }
        return bVar;
    }

    /* renamed from: k */
    public final void mo12289k() {
        Map<String, String> map;
        C29844g gVar;
        C6501b a = C6501b.C6502a.m13948a("livesdk_recharge_lagersum_click").mo12652a(C89041ag.m154421a(C89387v.m154943a("request_page", mo12288j()), C89387v.m154943a("charge_reason", mo12284e()), C89387v.m154943a("charge_style", "window"), C89387v.m154943a("panel_type", "normal"), C89387v.m154943a("gift_enter_from", this.f15676c), C89387v.m154943a("pay_method", C6336e.C6337a.m13683b())));
        C11637d dVar = this.f15674a;
        if (dVar != null) {
            map = dVar.f27779b;
        } else {
            map = null;
        }
        a.mo12652a(map).mo12643a(this.f27010p).mo12655b();
        if (C13627m.m24499a(C34822d.m71158a(C3966y.m9669e(), "js_kv_methods_20191113", 0).getString("live_guide_show_discount_modal", "1"), "0")) {
            gVar = new C29844g(LiveWebRechargeUrl.INSTANCE.getValue());
            double b = (double) C3966y.m9662b();
            Double.isNaN(b);
            gVar.mo52128a("height", (int) C3966y.m9668e((int) (b * 0.9d)));
        } else {
            gVar = new C29844g(LiveWebRechargeDialog.INSTANCE.getValue());
        }
        gVar.mo52130a("charge_reason", mo12284e());
        gVar.mo52130a("pay_method", "google_pay");
        gVar.mo52130a("request_page", mo12288j());
        Uri parse = Uri.parse(gVar.mo52126a());
        C89219l.m154716b(parse, "");
        ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(getContext(), parse);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.wallet.a.i$s */
    public static final class RunnableC6285s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6266i f15717a;

        /* renamed from: b */
        final /* synthetic */ List f15718b;

        static {
            Covode.recordClassIndex(6998);
        }

        RunnableC6285s(C6266i iVar, List list) {
            this.f15717a = iVar;
            this.f15718b = list;
        }

        public final void run() {
            int height;
            RtlViewPager rtlViewPager;
            String str;
            Object obj;
            String str2;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            RtlViewPager rtlViewPager2;
            ViewGroup.LayoutParams layoutParams;
            RtlViewPager rtlViewPager3;
            LinearLayout linearLayout;
            LiveTextView liveTextView;
            LiveButton liveButton;
            LinearLayout linearLayout2;
            ConstraintLayout constraintLayout;
            Map<String, String> map = null;
            if (this.f15717a.mo9929d()) {
                int b = C3966y.m9662b() / 2;
                C6266i iVar = this.f15717a;
                View view = iVar.getView();
                if (view == null || (constraintLayout = (ConstraintLayout) view.findViewById(R.id.eiz)) == null) {
                    i = 0;
                } else {
                    i = constraintLayout.getHeight();
                }
                int i6 = i + 0;
                View view2 = iVar.getView();
                if (view2 == null || (linearLayout2 = (LinearLayout) view2.findViewById(R.id.agm)) == null) {
                    i2 = 0;
                } else {
                    i2 = linearLayout2.getHeight();
                }
                int i7 = i6 + i2;
                View view3 = iVar.getView();
                if (view3 == null || (liveButton = (LiveButton) view3.findViewById(R.id.a45)) == null) {
                    i3 = 0;
                } else {
                    i3 = liveButton.getHeight();
                }
                int i8 = i7 + i3;
                View view4 = iVar.getView();
                if (view4 == null || (liveTextView = (LiveTextView) view4.findViewById(R.id.es6)) == null) {
                    i4 = 0;
                } else {
                    i4 = liveTextView.getHeight();
                }
                int i9 = i8 + i4;
                View view5 = iVar.getView();
                if (view5 == null || (linearLayout = (LinearLayout) view5.findViewById(R.id.hu)) == null) {
                    i5 = 0;
                } else {
                    i5 = linearLayout.getHeight();
                }
                height = b - ((i9 + i5) + C3966y.m9653a(56.0f));
                View view6 = this.f15717a.getView();
                if (!(view6 == null || (rtlViewPager2 = (RtlViewPager) view6.findViewById(R.id.ffo)) == null)) {
                    View view7 = this.f15717a.getView();
                    if (view7 == null || (rtlViewPager3 = (RtlViewPager) view7.findViewById(R.id.ffo)) == null || (layoutParams = rtlViewPager3.getLayoutParams()) == null) {
                        layoutParams = null;
                    } else {
                        layoutParams.height = height;
                    }
                    rtlViewPager2.setLayoutParams(layoutParams);
                }
            } else {
                View view8 = this.f15717a.getView();
                height = (view8 == null || (rtlViewPager = (RtlViewPager) view8.findViewById(R.id.ffo)) == null) ? 0 : rtlViewPager.getHeight();
            }
            int a = ((int) (((((float) height) * 1.0f) / ((float) C3966y.m9653a(68.0f))) + 0.2f)) * 3;
            C89378p[] pVarArr = new C89378p[9];
            pVarArr[0] = C89387v.m154943a("request_page", this.f15717a.mo12288j());
            pVarArr[1] = C89387v.m154943a("charge_reason", this.f15717a.mo12284e());
            pVarArr[2] = C89387v.m154943a("charge_style", "window");
            pVarArr[3] = C89387v.m154943a("panel_type", "normal");
            AbstractC2953a a2 = C6193a.m13435a(IGiftService.class);
            C89219l.m154716b(a2, "");
            String str3 = "1";
            if (((IGiftService) a2).isFirstRecharge()) {
                str = str3;
            } else {
                str = "0";
            }
            pVarArr[4] = C89387v.m154943a("is_first_recharge", str);
            DataChannel dataChannel = this.f15717a.f27010p;
            if (dataChannel != null) {
                obj = dataChannel.mo28318b(C9119ed.class);
            } else {
                obj = null;
            }
            if (C89219l.m154714a(obj, (Object) true)) {
                str2 = str3;
            } else {
                str2 = "0";
            }
            pVarArr[5] = C89387v.m154943a("is_anchor", str2);
            pVarArr[6] = C89387v.m154943a("package_show_num", String.valueOf(C89271h.m154772c(a, this.f15718b.size())));
            if (this.f15717a.mo9929d()) {
                str3 = "0";
            }
            pVarArr[7] = C89387v.m154943a("is_landscape", str3);
            pVarArr[8] = C89387v.m154943a("model", Build.MODEL);
            C6501b a3 = C6501b.C6502a.m13948a("livesdk_recharge_show_before_action").mo12643a(this.f15717a.f27010p).mo12652a(C89041ag.m154421a(pVarArr));
            C11637d dVar = this.f15717a.f15674a;
            if (dVar != null) {
                map = dVar.f27779b;
            }
            a3.mo12652a(map).mo12655b();
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$c */
    public static final class C6269c implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ C6266i f15697a;

        static {
            Covode.recordClassIndex(6982);
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C89219l.m154721d(activity, "");
        }

        public final void onActivityDestroyed(Activity activity) {
            C89219l.m154721d(activity, "");
        }

        public final void onActivityPaused(Activity activity) {
            C89219l.m154721d(activity, "");
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(bundle, "");
        }

        public final void onActivityStarted(Activity activity) {
            C89219l.m154721d(activity, "");
        }

        public final void onActivityStopped(Activity activity) {
            C89219l.m154721d(activity, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6269c(C6266i iVar) {
            this.f15697a = iVar;
        }

        public final void onActivityResumed(Activity activity) {
            Integer num;
            String str;
            C89219l.m154721d(activity, "");
            ComponentName componentName = activity.getComponentName();
            C89219l.m154716b(componentName, "");
            if (C13627m.m24499a("com.android.billingclient.api.ProxyBillingActivity", componentName.getClassName())) {
                C89378p[] pVarArr = new C89378p[8];
                pVarArr[0] = C89387v.m154943a("request_page", this.f15697a.mo12288j());
                pVarArr[1] = C89387v.m154943a("charge_reason", this.f15697a.mo12284e());
                pVarArr[2] = C89387v.m154943a("charge_style", "window");
                pVarArr[3] = C89387v.m154943a("panel_type", "normal");
                pVarArr[4] = C89387v.m154943a("pay_method", C6336e.C6337a.m13683b());
                C11314c cVar = this.f15697a.f15684k;
                Map<String, String> map = null;
                if (cVar != null) {
                    num = Integer.valueOf(cVar.f27058d);
                } else {
                    num = null;
                }
                pVarArr[5] = C89387v.m154943a("recharge_package", String.valueOf(num));
                AbstractC2953a a = C6193a.m13435a(IGiftService.class);
                C89219l.m154716b(a, "");
                if (((IGiftService) a).isFirstRecharge()) {
                    str = "1";
                } else {
                    str = "0";
                }
                pVarArr[6] = C89387v.m154943a("is_first_recharge", str);
                pVarArr[7] = C89387v.m154943a("second_entrance", this.f15697a.mo12285f());
                C6501b a2 = C6501b.C6502a.m13948a("livesdk_recharge_pay").mo12652a(C89041ag.m154421a(pVarArr)).mo12651a("gift_enter_from", this.f15697a.f15676c);
                C11637d dVar = this.f15697a.f15674a;
                if (dVar != null) {
                    map = dVar.f27779b;
                }
                a2.mo12652a(map).mo12643a(this.f15697a.f27010p).mo12655b();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$j */
    public static final class C6276j implements C6293a.AbstractC6295b {

        /* renamed from: a */
        final /* synthetic */ C6266i f15706a;

        static {
            Covode.recordClassIndex(6989);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6276j(C6266i iVar) {
            this.f15706a = iVar;
        }

        @Override // com.bytedance.android.live.wallet.adapter.C6293a.AbstractC6295b
        /* renamed from: a */
        public final void mo12307a(int i, int i2) {
            int i3;
            String str;
            C6501b a = C6501b.C6502a.m13948a("livesdk_recharge_exchange_entrance").mo12643a(this.f15706a.f27010p).mo12651a("request_page", "live_detail");
            if (i2 == 2) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            C6501b a2 = a.mo12645a("could_exchange", i3);
            if (i == -1) {
                str = "ug_exchange";
            } else {
                str = "anchor_income";
            }
            a2.mo12651a("charge_reason", str).mo12645a("is_anchor", C11279p.m20029f() ? 1 : 0).mo12655b();
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i == -1) {
                        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e0q);
                    } else if (this.f15706a.mo12286g() == -2) {
                        AbstractC6332d walletCenter = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter();
                        C89219l.m154716b(walletCenter, "");
                        C6384g f = walletCenter.mo12382f();
                        C89219l.m154716b(f, "");
                        RevenueExchange revenueExchange = f.f15957c;
                        if (revenueExchange == null || !revenueExchange.isRevenue()) {
                            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e2s);
                        } else {
                            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e2t);
                        }
                    }
                } else if (!this.f15706a.mo9929d()) {
                    this.f15706a.f15677d = true;
                    C6779a.m14563a().mo13053a(new C11756a(1));
                } else {
                    this.f15706a.mo12283c(i);
                }
            } else if (i == -1) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e0p);
            } else if (this.f15706a.mo12286g() == -2) {
                AbstractC6332d walletCenter2 = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter();
                C89219l.m154716b(walletCenter2, "");
                C6384g f2 = walletCenter2.mo12382f();
                C89219l.m154716b(f2, "");
                RevenueExchange revenueExchange2 = f2.f15957c;
                if (revenueExchange2 == null || !revenueExchange2.isRevenue()) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e2q);
                } else {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e2r);
                }
            }
        }

        @Override // com.bytedance.android.live.wallet.adapter.C6293a.AbstractC6295b
        /* renamed from: a */
        public final void mo12308a(C11314c cVar, int i) {
            String str;
            Object obj;
            String str2;
            Map<String, String> map;
            C89219l.m154721d(cVar, "");
            this.f15706a.f15684k = cVar;
            C89378p[] pVarArr = new C89378p[9];
            pVarArr[0] = C89387v.m154943a("request_page", this.f15706a.mo12288j());
            pVarArr[1] = C89387v.m154943a("charge_reason", this.f15706a.mo12284e());
            pVarArr[2] = C89387v.m154943a("charge_style", "window");
            pVarArr[3] = C89387v.m154943a("panel_type", "normal");
            pVarArr[4] = C89387v.m154943a("pay_method", C6336e.C6337a.m13683b());
            AbstractC2953a a = C6193a.m13435a(IGiftService.class);
            C89219l.m154716b(a, "");
            String str3 = "1";
            if (((IGiftService) a).isFirstRecharge()) {
                str = str3;
            } else {
                str = "0";
            }
            pVarArr[5] = C89387v.m154943a("is_first_recharge", str);
            pVarArr[6] = C89387v.m154943a("recharge_package", String.valueOf(cVar.f27058d));
            DataChannel dataChannel = this.f15706a.f27010p;
            Map<String, String> map2 = null;
            if (dataChannel != null) {
                obj = dataChannel.mo28318b(C9119ed.class);
            } else {
                obj = null;
            }
            if (!C89219l.m154714a(obj, (Object) true)) {
                str3 = "0";
            }
            pVarArr[7] = C89387v.m154943a("is_anchor", str3);
            if (i == 1) {
                str2 = "call";
            } else {
                str2 = "click";
            }
            pVarArr[8] = C89387v.m154943a("preview_type", str2);
            C6501b a2 = C6501b.C6502a.m13948a("livesdk_recharge_preview").mo12643a(this.f15706a.f27010p).mo12652a(C89041ag.m154421a(pVarArr));
            C11637d dVar = this.f15706a.f15674a;
            if (dVar != null) {
                map = dVar.f27779b;
            } else {
                map = null;
            }
            a2.mo12652a(map).mo12655b();
            if (cVar.f27060f == 2) {
                C6501b a3 = C6501b.C6502a.m13948a("livesdk_recharge_lagersum_preview").mo12643a(this.f15706a.f27010p).mo12652a(C89041ag.m154421a(C89387v.m154943a("request_page", this.f15706a.mo12288j()), C89387v.m154943a("charge_reason", this.f15706a.mo12284e()), C89387v.m154943a("charge_style", "window"), C89387v.m154943a("panel_type", "normal"), C89387v.m154943a("gift_enter_from", this.f15706a.f15676c), C89387v.m154943a("pay_method", C6336e.C6337a.m13683b())));
                C11637d dVar2 = this.f15706a.f15674a;
                if (dVar2 != null) {
                    map2 = dVar2.f27779b;
                }
                a3.mo12652a(map2).mo12655b();
            }
        }

        @Override // com.bytedance.android.live.wallet.adapter.C6293a.AbstractC6295b
        /* renamed from: a */
        public final void mo12309a(boolean z, int i, C11314c cVar) {
            String str;
            Object obj;
            C89219l.m154721d(cVar, "");
            if (z) {
                C89378p[] pVarArr = new C89378p[10];
                pVarArr[0] = C89387v.m154943a("request_page", this.f15706a.mo12288j());
                pVarArr[1] = C89387v.m154943a("charge_reason", this.f15706a.mo12284e());
                pVarArr[2] = C89387v.m154943a("charge_style", "window");
                pVarArr[3] = C89387v.m154943a("panel_type", "normal");
                pVarArr[4] = C89387v.m154943a("pay_method", C6336e.C6337a.m13683b());
                AbstractC2953a a = C6193a.m13435a(IGiftService.class);
                C89219l.m154716b(a, "");
                String str2 = "1";
                if (((IGiftService) a).isFirstRecharge()) {
                    str = str2;
                } else {
                    str = "0";
                }
                pVarArr[5] = C89387v.m154943a("is_first_recharge", str);
                pVarArr[6] = C89387v.m154943a("recharge_package", String.valueOf(cVar.f27058d));
                DataChannel dataChannel = this.f15706a.f27010p;
                Map<String, String> map = null;
                if (dataChannel != null) {
                    obj = dataChannel.mo28318b(C9119ed.class);
                } else {
                    obj = null;
                }
                if (!C89219l.m154714a(obj, (Object) true)) {
                    str2 = "0";
                }
                pVarArr[7] = C89387v.m154943a("is_anchor", str2);
                pVarArr[8] = C89387v.m154943a("line", String.valueOf((i / 3) + 1));
                pVarArr[9] = C89387v.m154943a("position", String.valueOf(i));
                C6501b a2 = C6501b.C6502a.m13948a("livesdk_recharge_package_show").mo12643a(this.f15706a.f27010p).mo12652a(C89041ag.m154421a(pVarArr));
                C11637d dVar = this.f15706a.f15674a;
                if (dVar != null) {
                    map = dVar.f27779b;
                }
                a2.mo12652a(map).mo12655b();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$u */
    static final class C6287u<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6266i f15721a;

        static {
            Covode.recordClassIndex(7000);
        }

        C6287u(C6266i iVar) {
            this.f15721a = iVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f15721a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$v */
    static final class C6288v<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6266i f15722a;

        static {
            Covode.recordClassIndex(7001);
        }

        C6288v(C6266i iVar) {
            this.f15722a = iVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f15722a.onEvent((C8458k) obj);
        }
    }

    @Override // com.bytedance.android.live.wallet.p419f.p421b.AbstractC6359c
    /* renamed from: b */
    public final void mo12261b(int i) {
        m13582a(i, true);
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$k */
    static final class View$OnClickListenerC6277k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6266i f15707a;

        static {
            Covode.recordClassIndex(6990);
        }

        View$OnClickListenerC6277k(C6266i iVar) {
            this.f15707a = iVar;
        }

        public final void onClick(View view) {
            C6351d dVar = this.f15707a.f15681h;
            if (dVar != null) {
                dVar.mo12409c();
            }
        }
    }

    public final void onEvent(C8458k kVar) {
        if (kVar != null && kVar.f20910b) {
            m13582a(kVar.f20909a, false);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$b */
    public final class C6268b extends ClickableSpan {

        /* renamed from: a */
        public final String f15694a;

        /* renamed from: b */
        public final Context f15695b;

        /* renamed from: c */
        final /* synthetic */ C6266i f15696c;

        static {
            Covode.recordClassIndex(6981);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager().mo13248a(this.f15695b, AbstractC6963e.m14872b(this.f15694a));
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(C3966y.m9663b((int) R.color.zn));
            textPaint.setUnderlineText(false);
            textPaint.setFakeBoldText(true);
        }

        public C6268b(C6266i iVar, String str, Context context) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(context, "");
            this.f15696c = iVar;
            this.f15694a = str;
            this.f15695b = context;
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$e */
    static final class View$OnClickListenerC6271e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6266i f15699a;

        /* renamed from: b */
        final /* synthetic */ String f15700b;

        static {
            Covode.recordClassIndex(6984);
        }

        View$OnClickListenerC6271e(C6266i iVar, String str) {
            this.f15699a = iVar;
            this.f15700b = str;
        }

        public final void onClick(View view) {
            AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
            Context context = this.f15699a.getContext();
            AbstractC6956d.C6957a b = AbstractC6963e.m14872b(this.f15700b);
            b.f17379c = true;
            webViewManager.mo13248a(context, b);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$f */
    static final class View$OnClickListenerC6272f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6266i f15701a;

        /* renamed from: b */
        final /* synthetic */ String f15702b;

        static {
            Covode.recordClassIndex(6985);
        }

        View$OnClickListenerC6272f(C6266i iVar, String str) {
            this.f15701a = iVar;
            this.f15702b = str;
        }

        public final void onClick(View view) {
            AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
            Context context = this.f15701a.getContext();
            AbstractC6956d.C6957a b = AbstractC6963e.m14872b(this.f15702b);
            b.f17379c = true;
            webViewManager.mo13248a(context, b);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$t */
    public static final class C6286t implements AbstractC11636c {

        /* renamed from: a */
        final /* synthetic */ int f15719a;

        /* renamed from: b */
        final /* synthetic */ long f15720b;

        static {
            Covode.recordClassIndex(6999);
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11636c
        /* renamed from: a */
        public final void mo12314a(Throwable th) {
            int i;
            C89219l.m154721d(th, "");
            if (th instanceof C2908a) {
                i = ((C2908a) th).getErrorCode();
            } else {
                i = 61;
            }
            C6331c.m13650a("ttlive_update_wallet_info_order", i, -1, "update info fail");
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11636c
        /* renamed from: a */
        public final void mo12313a(long j) {
            HashMap hashMap = new HashMap();
            long j2 = (long) this.f15719a;
            long j3 = this.f15720b;
            if (j2 + j3 == j) {
                C6331c.m13652a("ttlive_update_wallet_info_order", hashMap);
                return;
            }
            hashMap.put("originCoins", Long.valueOf(j3));
            hashMap.put("preCoins", Integer.valueOf(this.f15719a));
            hashMap.put("serverCoins", Long.valueOf(j));
            C6331c.m13651a("ttlive_update_wallet_info_order", 62, -1, "update info fail", hashMap);
        }

        C6286t(int i, long j) {
            this.f15719a = i;
            this.f15720b = j;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Application application;
        super.onCreate(bundle);
        ActivityC0945e activity = getActivity();
        if (activity != null && (application = activity.getApplication()) != null) {
            application.registerActivityLifecycleCallbacks(this.f15687t);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C6351d dVar = this.f15681h;
        if (dVar != null) {
            dVar.mo8577b();
        }
        C6351d dVar2 = this.f15681h;
        if (dVar2 != null) {
            dVar2.mo12412f();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(C4054a.m9853a(getActivity()));
        C89219l.m154716b(cloneInContext, "");
        return cloneInContext;
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$h */
    static final class View$OnClickListenerC6274h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6266i f15704a;

        static {
            Covode.recordClassIndex(6987);
        }

        View$OnClickListenerC6274h(C6266i iVar) {
            this.f15704a = iVar;
        }

        public final void onClick(View view) {
            AbstractC2953a a = C6193a.m13435a(IGiftService.class);
            C89219l.m154716b(a, "");
            ((IGiftService) a).getFirstRechargeManager().mo15006b(this.f15704a.getActivity(), this.f15704a.mo12284e());
            this.f15704a.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onConfigurationChanged(Configuration configuration) {
        C89219l.m154721d(configuration, "");
        super.onConfigurationChanged(configuration);
        if (configuration.orientation != 1) {
            return;
        }
        if (this.f15677d) {
            dismiss();
            mo12283c(mo12286g());
            this.f15677d = false;
        } else if (this.f15678e) {
            dismiss();
            mo12289k();
            this.f15678e = false;
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$g */
    static final class View$OnClickListenerC6273g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6266i f15703a;

        static {
            Covode.recordClassIndex(6986);
        }

        View$OnClickListenerC6273g(C6266i iVar) {
            this.f15703a = iVar;
        }

        public final void onClick(View view) {
            AbstractC2953a a = C6193a.m13435a(IGiftService.class);
            C89219l.m154716b(a, "");
            if (!((IGiftService) a).isFirstRecharge() || !(!C89219l.m154714a((Object) this.f15703a.mo12285f(), (Object) "other_recharge"))) {
                ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(this.f15703a.getContext(), Uri.parse(LiveRechargeFeedbackUrlSetting.INSTANCE.getValue()));
                C6501b.C6502a.m13948a("livesdk_recharge_faq_click").mo12643a(this.f15703a.f27010p).mo12655b();
                return;
            }
            ((IGiftService) C6193a.m13435a(IGiftService.class)).openRechargeFAQPage(this.f15703a.getActivity());
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$w */
    static final class C6289w<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6266i f15723a;

        static {
            Covode.recordClassIndex(7002);
        }

        C6289w(C6266i iVar) {
            this.f15723a = iVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            LiveTextView liveTextView;
            LiveTextView liveTextView2;
            LiveTextView liveTextView3;
            C6266i iVar = this.f15723a;
            if (iVar.mo12287h() > 0) {
                View view = iVar.getView();
                if (!(view == null || (liveTextView3 = (LiveTextView) view.findViewById(R.id.ev_)) == null)) {
                    liveTextView3.setVisibility(0);
                }
                String quantityString = iVar.getResources().getQuantityString(R.plurals.gg, (int) iVar.mo12287h(), String.valueOf(iVar.mo12287h()));
                C89219l.m154716b(quantityString, "");
                View view2 = iVar.getView();
                if (!(view2 == null || (liveTextView2 = (LiveTextView) view2.findViewById(R.id.ev_)) == null)) {
                    liveTextView2.setText(quantityString);
                }
            }
            View view3 = iVar.getView();
            if (view3 != null && (liveTextView = (LiveTextView) view3.findViewById(R.id.ev9)) != null) {
                AbstractC6332d walletCenter = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter();
                C89219l.m154716b(walletCenter, "");
                liveTextView.setText(String.valueOf(walletCenter.mo12373b()));
            }
        }
    }

    @Override // com.bytedance.android.live.wallet.p419f.p421b.AbstractC6359c
    /* renamed from: a */
    public final void mo12256a(int i) {
        String str;
        Resources resources;
        ActivityC0945e activity = getActivity();
        if (activity == null || !activity.isFinishing()) {
            if (this.f15680g == null) {
                this.f15680g = new DialogC9146a.C9147a(getContext()).mo15240a();
            }
            DialogC9146a aVar = this.f15680g;
            if (aVar != null) {
                if (i == 0) {
                    str = "";
                } else {
                    Context context = getContext();
                    if (context == null || (resources = context.getResources()) == null) {
                        str = null;
                    } else {
                        str = resources.getString(i);
                    }
                }
                aVar.mo15238a(str);
            }
            DialogC9146a aVar2 = this.f15680g;
            if (aVar2 != null) {
                C11279p.m19997a(aVar2);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$i */
    static final class View$OnClickListenerC6275i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6266i f15705a;

        static {
            Covode.recordClassIndex(6988);
        }

        View$OnClickListenerC6275i(C6266i iVar) {
            this.f15705a = iVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            if (com.bytedance.common.utility.C13627m.m24499a(r1, r0) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
            // Method dump skipped, instructions count: 239
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p413a.C6266i.View$OnClickListenerC6275i.onClick(android.view.View):void");
        }
    }

    /* renamed from: c */
    public final void mo12283c(int i) {
        long j;
        BalanceStructExtra balanceStructExtra;
        String str;
        long j2;
        long j3;
        int i2;
        long j4;
        CurrencyInfo currencyInfo;
        BasePackage basePackage;
        BasePackage basePackage2;
        BasePackage basePackage3;
        CurrencyInfo currencyInfo2;
        CurrencyInfo currencyInfo3;
        String str2;
        if (i != 0) {
            C29844g gVar = new C29844g(m13586p());
            int i3 = 0;
            int i4 = 1;
            if (i == -1) {
                gVar.mo52128a("way", 0);
                AbstractC6332d walletCenter = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter();
                C89219l.m154716b(walletCenter, "");
                BalanceStruct e = walletCenter.mo12380e();
                UserBalance userBalance = e.getUserBalance();
                if (userBalance != null) {
                    double balance = (double) userBalance.getBalance();
                    double pow = Math.pow(10.0d, 2.0d);
                    Double.isNaN(balance);
                    str2 = C1764a.m5928a("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(balance / pow)}, 1));
                    C89219l.m154716b(str2, "");
                } else {
                    str2 = "0";
                }
                gVar.mo52130a("balance", str2);
                balanceStructExtra = e.getExchangeInfo();
            } else {
                gVar.mo52128a("way", 1);
                AbstractC6332d walletCenter2 = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter();
                C89219l.m154716b(walletCenter2, "");
                C6384g f = walletCenter2.mo12382f();
                Object[] objArr = new Object[1];
                C89219l.m154716b(f, "");
                RevenueExchange revenueExchange = f.f15957c;
                if (revenueExchange != null) {
                    j = revenueExchange.getBalance();
                } else {
                    j = 0;
                }
                double d = (double) j;
                double pow2 = Math.pow(10.0d, 2.0d);
                Double.isNaN(d);
                objArr[0] = Double.valueOf(d / pow2);
                String a = C1764a.m5928a("%.2f", Arrays.copyOf(objArr, 1));
                C89219l.m154716b(a, "");
                gVar.mo52130a("balance", a);
                RevenueExchange revenueExchange2 = f.f15957c;
                if (revenueExchange2 == null || !revenueExchange2.isRevenue()) {
                    i4 = 0;
                }
                gVar.mo52128a("has_short_video_gift", i4);
                balanceStructExtra = f.f15958d;
            }
            String str3 = null;
            if (balanceStructExtra == null || (currencyInfo3 = balanceStructExtra.getCurrencyInfo()) == null) {
                str = null;
            } else {
                str = currencyInfo3.getCode();
            }
            gVar.mo52130a("currency_code", str);
            if (!(balanceStructExtra == null || (currencyInfo2 = balanceStructExtra.getCurrencyInfo()) == null)) {
                str3 = currencyInfo2.getSymbol();
            }
            gVar.mo52130a("symbol", str3);
            if (balanceStructExtra == null || (basePackage3 = balanceStructExtra.getBasePackage()) == null) {
                j2 = 0;
            } else {
                j2 = basePackage3.getId();
            }
            gVar.mo52129a("base_package_id", j2);
            if (balanceStructExtra == null || (basePackage2 = balanceStructExtra.getBasePackage()) == null) {
                j3 = 0;
            } else {
                j3 = basePackage2.getPrice();
            }
            gVar.mo52129a("base_package_price", j3);
            if (balanceStructExtra == null || (basePackage = balanceStructExtra.getBasePackage()) == null) {
                i2 = 0;
            } else {
                i2 = basePackage.getRealDot();
            }
            gVar.mo52128a("real_dot", i2);
            if (balanceStructExtra != null) {
                j4 = balanceStructExtra.getMaxCoins();
            } else {
                j4 = 0;
            }
            gVar.mo52129a("max_coins", j4);
            if (!(balanceStructExtra == null || (currencyInfo = balanceStructExtra.getCurrencyInfo()) == null)) {
                i3 = currencyInfo.getKeepDot();
            }
            gVar.mo52128a("keep_dot", i3);
            gVar.mo52128a("is_anchor", C11279p.m20029f() ? 1 : 0);
            Uri parse = Uri.parse(gVar.mo52126a());
            C89219l.m154716b(parse, "");
            ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(getContext(), parse);
        }
    }

    /* renamed from: b */
    private final void m13583b(DiamondPackageExtra diamondPackageExtra, List<? extends C11314c> list) {
        C6300b bVar = this.f15688u;
        if (bVar != null) {
            bVar.mo12320a(list);
        }
        C6300b bVar2 = this.f15688u;
        if (bVar2 != null) {
            bVar2.f15757e = diamondPackageExtra;
        }
        C6300b bVar3 = this.f15688u;
        if (bVar3 != null) {
            bVar3.f15758f = m13585o();
        }
        C6300b bVar4 = this.f15688u;
        if (bVar4 != null) {
            bVar4.notifyDataSetChanged();
        }
    }

    @Override // com.bytedance.android.live.wallet.p419f.p421b.AbstractC6358b
    /* renamed from: a */
    public final void mo12281a(DiamondPackageExtra diamondPackageExtra, List<C11314c> list) {
        Integer num;
        LinearLayout linearLayout;
        ViewGroup.LayoutParams layoutParams;
        LinearLayout linearLayout2;
        C89219l.m154721d(list, "");
        if (this.f15675b instanceof ActivityC0945e) {
            LinkedList linkedList = new LinkedList(list);
            if (!list.isEmpty() || mo12286g() != 0) {
                if (mo12286g() != 0 && list.isEmpty()) {
                    C11314c cVar = new C11314c();
                    cVar.f27060f = mo12286g();
                    linkedList.addFirst(cVar);
                    LiveButton liveButton = (LiveButton) mo8166a_(R.id.a45);
                    if (liveButton != null) {
                        liveButton.setVisibility(8);
                    }
                    m13583b(diamondPackageExtra, linkedList);
                } else if (list.isEmpty() || mo12286g() != 0) {
                    C11314c cVar2 = new C11314c();
                    cVar2.f27060f = mo12286g();
                    linkedList.addFirst(cVar2);
                    this.f15684k = list.get(0);
                    m13584c(diamondPackageExtra, linkedList);
                    m13583b(diamondPackageExtra, linkedList);
                } else {
                    this.f15684k = list.get(0);
                    m13584c(diamondPackageExtra, linkedList);
                    m13583b(diamondPackageExtra, linkedList);
                }
                View view = getView();
                if (!(view == null || (linearLayout = (LinearLayout) view.findViewById(R.id.ccw)) == null || (layoutParams = linearLayout.getLayoutParams()) == null)) {
                    layoutParams.height = -2;
                    View view2 = getView();
                    if (!(view2 == null || (linearLayout2 = (LinearLayout) view2.findViewById(R.id.ccw)) == null)) {
                        linearLayout2.setLayoutParams(layoutParams);
                    }
                }
                View view3 = getView();
                if (view3 != null) {
                    view3.post(new RunnableC6285s(this, list));
                }
                C6501b a = C6501b.C6502a.m13948a("livesdk_recharge_show_recommond").mo12643a(this.f27010p);
                C11314c cVar3 = this.f15684k;
                if (cVar3 != null) {
                    num = Integer.valueOf(cVar3.f27058d);
                } else {
                    num = null;
                }
                a.mo12650a("recommend_package", (Number) num).mo12655b();
                return;
            }
            mo12282a(new Exception("rechargeList is empty"), 0);
        }
    }

    /* renamed from: a */
    private final void m13582a(int i, boolean z) {
        String str;
        Integer num;
        String str2;
        Resources resources;
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28315b(C4341q.class, Integer.valueOf(i));
        }
        if (z) {
            C6779a.m14563a().mo13053a(new C8458k(i));
        }
        Activity activity = this.f15675b;
        Map<String, String> map = null;
        if (activity == null || (resources = activity.getResources()) == null) {
            str = null;
        } else {
            str = resources.getString(R.string.gid);
        }
        C11226ao.m19883a(activity, str, 0);
        AbstractC6332d walletCenter = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter();
        C89219l.m154716b(walletCenter, "");
        ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12370a(new C6286t(i, walletCenter.mo12373b()));
        C89378p[] pVarArr = new C89378p[8];
        pVarArr[0] = C89387v.m154943a("pay_method", C6336e.C6337a.m13683b());
        pVarArr[1] = C89387v.m154943a("charge_style", "window");
        pVarArr[2] = C89387v.m154943a("charge_reason", mo12284e());
        pVarArr[3] = C89387v.m154943a("request_page", mo12288j());
        pVarArr[4] = C89387v.m154943a("panel_type", "normal");
        C11314c cVar = this.f15684k;
        if (cVar != null) {
            num = Integer.valueOf(cVar.f27058d);
        } else {
            num = null;
        }
        pVarArr[5] = C89387v.m154943a("recharge_package", String.valueOf(num));
        AbstractC2953a a = C6193a.m13435a(IGiftService.class);
        C89219l.m154716b(a, "");
        if (((IGiftService) a).isFirstRecharge()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        pVarArr[6] = C89387v.m154943a("is_first_recharge", str2);
        pVarArr[7] = C89387v.m154943a("second_entrance", mo12285f());
        Map<String, String> b = C89041ag.m154427b(pVarArr);
        C7411d a2 = C7411d.m15284a();
        C89219l.m154716b(a2, "");
        if (!C13627m.m24498a(a2.mo13614e())) {
            C7411d a3 = C7411d.m15284a();
            C89219l.m154716b(a3, "");
            String e = a3.mo13614e();
            C89219l.m154716b(e, "");
            b.put("enter_live_method", e);
        }
        C6501b a4 = C6501b.C6502a.m13948a("livesdk_recharge_success").mo12652a(b).mo12651a("gift_enter_from", this.f15676c);
        C11637d dVar = this.f15674a;
        if (dVar != null) {
            map = dVar.f27779b;
        }
        a4.mo12652a(map).mo12643a(this.f27010p).mo12655b();
        dismiss();
    }

    /* renamed from: c */
    private final void m13584c(DiamondPackageExtra diamondPackageExtra, List<C11314c> list) {
        Map<String, String> map;
        int size = list.size();
        if (mo12287h() > 0 && !C13603b.m24435a((Collection) list)) {
            C6300b bVar = this.f15688u;
            if (bVar != null) {
                bVar.f15756d = size - 1;
            }
            this.f15683j = list.get(size - 1);
            int size2 = list.size();
            int i = 0;
            while (true) {
                if (i >= size2) {
                    break;
                } else if (((long) list.get(i).f27058d) >= mo12287h()) {
                    C6300b bVar2 = this.f15688u;
                    if (bVar2 != null) {
                        bVar2.f15756d = i;
                    }
                    this.f15683j = list.get(i);
                } else {
                    i++;
                }
            }
        }
        if (diamondPackageExtra != null) {
            int size3 = list.size();
            for (int i2 = 0; i2 < size3; i2++) {
                if (diamondPackageExtra.recentlyPurchasedPacketId == list.get(i2).f27055a && list.get(i2).f27060f == 0) {
                    C6300b bVar3 = this.f15688u;
                    if (bVar3 != null) {
                        bVar3.f15753a = i2;
                    }
                    this.f15682i = list.get(i2);
                }
                if (diamondPackageExtra.RecommendedPacketId == list.get(i2).f27055a && list.get(i2).f27060f == 0) {
                    C6300b bVar4 = this.f15688u;
                    if (bVar4 != null) {
                        bVar4.f15754b = i2;
                    }
                    this.f15670C = list.get(i2);
                }
            }
            if (diamondPackageExtra.officialRecharge && !LiveWebRechargeAuditing.INSTANCE.getValue()) {
                C11314c cVar = new C11314c();
                cVar.f27060f = 2;
                C89219l.m154716b(cVar, "");
                list.add(cVar);
                C6501b a = C6501b.C6502a.m13948a("livesdk_recharge_lagersum_show").mo12643a(this.f27010p).mo12652a(C89041ag.m154427b(C89387v.m154943a("pay_method", C6336e.C6337a.m13683b()), C89387v.m154943a("charge_style", "window"), C89387v.m154943a("charge_reason", mo12284e()), C89387v.m154943a("request_page", mo12288j()), C89387v.m154943a("panel_type", "normal")));
                C11637d dVar = this.f15674a;
                if (dVar != null) {
                    map = dVar.f27779b;
                } else {
                    map = null;
                }
                a.mo12652a(map).mo12655b();
            }
        }
        C11314c cVar2 = this.f15683j;
        if (cVar2 != null) {
            this.f15684k = cVar2;
            return;
        }
        C11314c cVar3 = this.f15670C;
        if (cVar3 != null) {
            this.f15684k = cVar3;
            return;
        }
        C11314c cVar4 = this.f15682i;
        if (cVar4 != null) {
            this.f15684k = cVar4;
        }
    }

    @Override // com.bytedance.android.live.wallet.p419f.p421b.AbstractC6358b
    /* renamed from: a */
    public final void mo12282a(Exception exc, int i) {
        LoadingStatusView loadingStatusView;
        if (mo12286g() != 0) {
            mo12291m();
            mo12281a((DiamondPackageExtra) null, new ArrayList());
            return;
        }
        View view = getView();
        if (!(view == null || (loadingStatusView = (LoadingStatusView) view.findViewById(R.id.e7i)) == null)) {
            loadingStatusView.setStatus(2);
        }
        View view2 = getView();
        if (view2 != null) {
            view2.post(new RunnableC6284r(this, i, exc));
        }
        C6300b bVar = this.f15688u;
        if (bVar != null) {
            bVar.mo12320a(C89086z.INSTANCE);
        }
        C6300b bVar2 = this.f15688u;
        if (bVar2 != null) {
            bVar2.f15757e = new DiamondPackageExtra();
        }
        C6300b bVar3 = this.f15688u;
        if (bVar3 != null) {
            bVar3.notifyDataSetChanged();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        ViewGroup.LayoutParams layoutParams;
        String str2;
        Map<String, String> map;
        long j;
        long j2;
        Room room;
        Long l;
        View view2;
        TextView textView;
        Context context;
        int i;
        LiveAutoRtlImageView liveAutoRtlImageView;
        ViewGroup.LayoutParams layoutParams2;
        MethodCollector.m26663i(13494);
        C89219l.m154721d(view, "");
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("key_bundle_gift_from", "")) == null) {
            str = "";
        }
        this.f15676c = str;
        super.onViewCreated(view, bundle);
        if (mo9929d()) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ccw);
            if (!(linearLayout == null || (layoutParams2 = linearLayout.getLayoutParams()) == null)) {
                layoutParams2.height = C3966y.m9653a(275.0f);
                LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.ccw);
                if (linearLayout2 != null) {
                    linearLayout2.setLayoutParams(layoutParams2);
                }
            }
        } else {
            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.ccw);
            if (!(linearLayout3 == null || (layoutParams = linearLayout3.getLayoutParams()) == null)) {
                layoutParams.height = -1;
                layoutParams.width = C3966y.m9653a(375.0f);
                LinearLayout linearLayout4 = (LinearLayout) view.findViewById(R.id.ccw);
                if (linearLayout4 != null) {
                    linearLayout4.setLayoutParams(layoutParams);
                }
            }
        }
        Drawable c = C3966y.m9665c(2131234435);
        int a = C3966y.m9653a(16.0f);
        if (c != null) {
            c.setBounds(0, 0, a, a);
        }
        if (C6229a.m13521a(getContext())) {
            TextView textView2 = (TextView) view.findViewById(R.id.ev9);
            if (textView2 != null) {
                textView2.setCompoundDrawables(null, null, c, null);
            }
        } else {
            TextView textView3 = (TextView) view.findViewById(R.id.ev9);
            if (textView3 != null) {
                textView3.setCompoundDrawables(c, null, null, null);
            }
        }
        this.f15689v = (FrameLayout) view.findViewById(R.id.aju);
        LiveAutoRtlImageView liveAutoRtlImageView2 = (LiveAutoRtlImageView) mo8166a_(R.id.aza);
        if (liveAutoRtlImageView2 != null) {
            liveAutoRtlImageView2.setOnClickListener(new View$OnClickListenerC6273g(this));
        }
        AbstractC2953a a2 = C6193a.m13435a(IGiftService.class);
        C89219l.m154716b(a2, "");
        if (((IGiftService) a2).isFirstRecharge() && !C3966y.m9670f() && (liveAutoRtlImageView = (LiveAutoRtlImageView) mo8166a_(R.id.aza)) != null) {
            liveAutoRtlImageView.setVisibility(8);
        }
        AbstractC2953a a3 = C6193a.m13435a(IGiftService.class);
        C89219l.m154716b(a3, "");
        if (((IGiftService) a3).isFirstRecharge() && (textView = (TextView) view.findViewById(R.id.title)) != null) {
            if (!LiveFirstRechargeTitle.INSTANCE.getValue()) {
                context = view.getContext();
                i = R.string.ecy;
            } else {
                context = view.getContext();
                i = R.string.eb3;
            }
            textView.setText(context.getString(i));
        }
        this.f15679f = (LiveTextView) view.findViewById(R.id.b2s);
        AbstractC2953a a4 = C6193a.m13435a(IGiftService.class);
        C89219l.m154716b(a4, "");
        if (((IGiftService) a4).isFirstRecharge()) {
            LiveTextView liveTextView = this.f15679f;
            if (liveTextView != null) {
                liveTextView.setVisibility(0);
            }
            LiveTextView liveTextView2 = this.f15679f;
            if (liveTextView2 != null) {
                liveTextView2.setText(view.getContext().getText(R.string.eb2));
            }
        }
        if (C89219l.m154714a((Object) mo12285f(), (Object) "other_recharge")) {
            View findViewById = view.findViewById(R.id.c8_);
            C89219l.m154716b(findViewById, "");
            findViewById.setVisibility(0);
            view.findViewById(R.id.c8_).setOnClickListener(new View$OnClickListenerC6274h(this));
        }
        C11637d dVar = this.f15674a;
        if (!(dVar == null || (view2 = dVar.f27778a) == null)) {
            ViewParent parent = view2.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(view2);
            }
            FrameLayout frameLayout = this.f15689v;
            if (frameLayout != null) {
                frameLayout.addView(view2);
            }
        }
        LiveButton liveButton = (LiveButton) mo8166a_(R.id.a45);
        if (liveButton != null) {
            liveButton.setVisibility(0);
        }
        LiveButton liveButton2 = (LiveButton) mo8166a_(R.id.a45);
        if (liveButton2 != null) {
            liveButton2.setOnClickListener(new View$OnClickListenerC6275i(this));
        }
        RtlViewPager rtlViewPager = (RtlViewPager) view.findViewById(R.id.ffo);
        C89219l.m154716b(rtlViewPager, "");
        rtlViewPager.setOverScrollMode(2);
        this.f15688u = new C6300b(new C6276j(this));
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.ffo);
        if (viewPager != null) {
            viewPager.setAdapter(this.f15688u);
        }
        View inflate = getLayoutInflater().inflate(R.layout.bb7, (ViewGroup) null);
        if (C6336e.C6337a.m13682a()) {
            ((TextView) inflate.findViewById(R.id.title)).setText(R.string.een);
        }
        View inflate2 = getLayoutInflater().inflate(R.layout.bb8, (ViewGroup) null);
        ((LiveButton) inflate.findViewById(R.id.button)).setOnClickListener(new View$OnClickListenerC6277k(this));
        LoadingStatusView.C6234a b = LoadingStatusView.C6234a.m13528a(getContext()).mo12211b(R.string.gk4);
        b.f15603d = inflate;
        b.f15601b = inflate2;
        ((LoadingStatusView) view.findViewById(R.id.e7i)).setBuilder(b);
        LiveRechargeAgreementConfig value = LiveRoomRechargeAgreementConfigSetting.INSTANCE.getValue();
        if (value == null) {
            value = LiveRoomRechargeAgreementConfigSetting.INSTANCE.getDEFAULT();
        }
        boolean z = value.isShowRechargeLawInGlobal;
        LiveTextView liveTextView3 = (LiveTextView) view.findViewById(R.id.es6);
        if (z) {
            C89219l.m154716b(liveTextView3, "");
            liveTextView3.setVisibility(0);
            String str3 = value.agreementForGlobal;
            String a5 = C3966y.m9657a((int) R.string.e_6);
            String a6 = C3966y.m9657a((int) R.string.e5i);
            C89219l.m154716b(a5, "");
            String a7 = C1764a.m5928a(a5, Arrays.copyOf(new Object[]{a6}, 1));
            C89219l.m154716b(a7, "");
            SpannableString spannableString = new SpannableString(a7);
            Context context2 = getContext();
            if (context2 != null) {
                C89219l.m154716b(str3, "");
                C89219l.m154716b(context2, "");
                C6268b bVar = new C6268b(this, str3, context2);
                C89219l.m154716b(a6, "");
                spannableString.setSpan(bVar, C89361p.m154888a((CharSequence) a7, a6, 0, false, 6), C89361p.m154888a((CharSequence) a7, a6, 0, false, 6) + a6.length(), 17);
            }
            liveTextView3.setText(spannableString);
            liveTextView3.setHighlightColor(C3966y.m9663b((int) R.color.c9));
            liveTextView3.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            C89219l.m154716b(liveTextView3, "");
            liveTextView3.setVisibility(8);
        }
        LiveRechargeAgreementConfig value2 = LiveRoomRechargeAgreementConfigSetting.INSTANCE.getValue();
        if (value2 == null) {
            value2 = LiveRoomRechargeAgreementConfigSetting.INSTANCE.getDEFAULT();
        }
        boolean z2 = value2.isShowRechargeLawInRegion;
        LiveTextView liveTextView4 = (LiveTextView) view.findViewById(R.id.ew7);
        LiveTextView liveTextView5 = (LiveTextView) view.findViewById(R.id.f3b);
        LinearLayout linearLayout5 = (LinearLayout) view.findViewById(R.id.hu);
        if (z2) {
            C89219l.m154716b(linearLayout5, "");
            linearLayout5.setVisibility(0);
            String str4 = value2.agreementsForRegion.get(0).lawUrl;
            C89219l.m154716b(liveTextView4, "");
            liveTextView4.setText(value2.agreementsForRegion.get(0).lawName);
            liveTextView4.setOnClickListener(new View$OnClickListenerC6271e(this, str4));
            String str5 = value2.agreementsForRegion.get(1).lawUrl;
            C89219l.m154716b(liveTextView5, "");
            liveTextView5.setText(value2.agreementsForRegion.get(1).lawName);
            liveTextView5.setOnClickListener(new View$OnClickListenerC6272f(this, str5));
        } else {
            C89219l.m154716b(linearLayout5, "");
            linearLayout5.setVisibility(8);
        }
        Activity activity = this.f15675b;
        if (activity != null) {
            C6318b bVar2 = new C6318b(((Number) this.f15672E.getValue()).intValue());
            DataChannel dataChannel = this.f27010p;
            if (dataChannel == null || (l = (Long) dataChannel.mo28318b(C9096dh.class)) == null) {
                j = 0;
            } else {
                j = l.longValue();
            }
            DataChannel dataChannel2 = this.f27010p;
            if (dataChannel2 == null || (room = (Room) dataChannel2.mo28318b(C9093de.class)) == null) {
                j2 = 0;
            } else {
                j2 = room.getOwnerUserId();
            }
            C6351d dVar2 = new C6351d(activity, bVar2, j, j2);
            this.f15681h = dVar2;
            dVar2.mo12411e();
            C6351d dVar3 = this.f15681h;
            if (dVar3 != null) {
                dVar3.mo10297a((AbstractC16042a) this);
            }
            C6351d dVar4 = this.f15681h;
            if (dVar4 != null) {
                dVar4.f15872e = this.f15686m;
            }
        }
        C89378p[] pVarArr = new C89378p[8];
        pVarArr[0] = C89387v.m154943a("request_page", mo12288j());
        pVarArr[1] = C89387v.m154943a("charge_reason", mo12284e());
        pVarArr[2] = C89387v.m154943a("charge_style", "window");
        pVarArr[3] = C89387v.m154943a("panel_type", "normal");
        pVarArr[4] = C89387v.m154943a("gift_enter_from", this.f15676c);
        pVarArr[5] = C89387v.m154943a("pay_method", C6336e.C6337a.m13683b());
        AbstractC2953a a8 = C6193a.m13435a(IGiftService.class);
        C89219l.m154716b(a8, "");
        if (((IGiftService) a8).isFirstRecharge()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        pVarArr[6] = C89387v.m154943a("is_first_recharge", str2);
        pVarArr[7] = C89387v.m154943a("second_entrance", mo12285f());
        C6501b a9 = C6501b.C6502a.m13948a("livesdk_recharge_show").mo12652a(C89041ag.m154421a(pVarArr));
        C11637d dVar5 = this.f15674a;
        if (dVar5 != null) {
            map = dVar5.f27779b;
        } else {
            map = null;
        }
        a9.mo12652a(map).mo12643a(this.f27010p).mo12655b();
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C6381d.class).mo143274a(C11152e.m19789a((Fragment) this))).mo17949a(new C6287u(this));
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C8458k.class).mo143274a(C11152e.m19789a((Fragment) this))).mo17949a(new C6288v(this));
        if (C6193a.m13435a(IWalletService.class) != null) {
            ((AbstractC11181z) ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12364a().mo143274a(C11152e.m19789a((Fragment) this))).mo17949a(new C6289w(this));
            ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12379d();
        } else {
            C6501b.C6502a.m13948a("livesdk_recharge_service_error").mo12643a(this.f27010p).mo12655b();
        }
        if (!(!C6336e.f15839g.mo12388a().isEmpty()) || C6336e.f15839g.f15845e == null) {
            C6351d dVar6 = this.f15681h;
            if (dVar6 != null) {
                dVar6.mo12409c();
                MethodCollector.m26664o(13494);
                return;
            }
            MethodCollector.m26664o(13494);
            return;
        }
        mo12291m();
        mo12281a(C6336e.f15839g.f15845e, C6336e.f15839g.mo12388a());
        AbstractC11635b bVar3 = this.f15686m;
        if (bVar3 != null) {
            bVar3.mo18418a(1, 0, "ok");
            MethodCollector.m26664o(13494);
            return;
        }
        MethodCollector.m26664o(13494);
    }

    @Override // com.bytedance.android.live.wallet.p419f.p421b.AbstractC6359c
    /* renamed from: a */
    public final void mo12257a(int i, int i2, int i3, Exception exc) {
        int i4;
        String e = mo12284e();
        C11314c cVar = this.f15684k;
        if (cVar != null) {
            i4 = cVar.f27058d;
        } else {
            i4 = 0;
        }
        C6361a.m13732a(new C11310a(i, i2, i3, exc, true, e, i4, false), getContext());
    }
}
