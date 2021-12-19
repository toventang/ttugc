package com.bytedance.android.livesdk.chatroom.p499ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.C2690b;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.broadcast.api.C3020b;
import com.bytedance.android.live.broadcast.api.C3065g;
import com.bytedance.android.live.broadcast.api.C3066h;
import com.bytedance.android.live.broadcast.api.C3067i;
import com.bytedance.android.live.broadcast.api.p185c.C3047a;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a;
import com.bytedance.android.live.broadcast.view.LinkCrossGuestBgView;
import com.bytedance.android.live.broadcast.view.LiveCenterContainerView;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.AbstractC4433d;
import com.bytedance.android.live.liveinteract.api.AbstractC4434e;
import com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget;
import com.bytedance.android.live.liveinteract.api.BaseLinkWidget;
import com.bytedance.android.live.liveinteract.api.C4396aj;
import com.bytedance.android.live.liveinteract.api.C4450t;
import com.bytedance.android.live.p247f.AbstractC4318a;
import com.bytedance.android.live.p378m.AbstractC5760a;
import com.bytedance.android.live.p378m.C5762c;
import com.bytedance.android.live.p379n.AbstractC5783o;
import com.bytedance.android.live.p385p.C5856s;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC7601b;
import com.bytedance.android.livesdk.chatroom.p488c.C7398o;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
import com.bytedance.android.livesdk.chatroom.p488c.C7404u;
import com.bytedance.android.livesdk.chatroom.widget.BroadcastCountDownWidget;
import com.bytedance.android.livesdk.chatroom.widget.BroadcastFilterStyleWidget;
import com.bytedance.android.livesdk.chatroom.widget.C8184l;
import com.bytedance.android.livesdk.chatroom.widget.CountDownView;
import com.bytedance.android.livesdk.chatroom.widget.LiveCenterEntranceWidget;
import com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastLiveCenterSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableBitrateMonitorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkEntranceExperiment;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableMixStreamTypeSetting;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p558h.EnumC8919b;
import com.bytedance.android.livesdk.p561j.C9051bq;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.EnumC9050bp;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.AbstractC11748e;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11679c;
import com.bytedance.android.livesdkapi.host.AbstractC11797b;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.android.widget.Widget;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.xbridge.model.p1339a.p1340a.C18738d;
import com.bytedance.ies.xbridge.p1301e.C18484a;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dw */
public final class C7930dw extends AbstractC7725al implements AbstractC5783o, AbstractC11679c.AbstractC11680a, AbstractC11679c.AbstractC11681b {

    /* renamed from: n */
    public AtomicBoolean f19738n = new AtomicBoolean(false);

    /* renamed from: o */
    public boolean f19739o;

    /* renamed from: p */
    public AbstractC3055a f19740p;

    /* renamed from: q */
    public AbstractC7601b f19741q;

    /* renamed from: r */
    public BaseLinkControlWidget f19742r;

    /* renamed from: s */
    private final EnumC11728i f19743s = EnumC11728i.VIDEO;

    /* renamed from: t */
    private boolean f19744t;

    /* renamed from: u */
    private boolean f19745u;

    /* renamed from: v */
    private BroadcastFilterStyleWidget f19746v;

    /* renamed from: w */
    private final AbstractC89244h f19747w = C11831d.m20835a(new C7934d(this));

    /* renamed from: x */
    private final AbstractC89244h f19748x = C11831d.m20835a(new C7933c(this));

    /* renamed from: y */
    private HashMap f19749y;

    static {
        Covode.recordClassIndex(8725);
    }

    /* renamed from: p */
    private final GestureDetector$OnDoubleTapListenerC7760ao m16059p() {
        return (GestureDetector$OnDoubleTapListenerC7760ao) this.f19747w.getValue();
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al
    /* renamed from: b */
    public final View mo13999b(int i) {
        if (this.f19749y == null) {
            this.f19749y = new HashMap();
        }
        View view = (View) this.f19749y.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f19749y.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al
    /* renamed from: o */
    public final void mo14009o() {
        HashMap hashMap = this.f19749y;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo14009o();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al
    /* renamed from: h */
    public final EnumC11728i mo14002h() {
        return this.f19743s;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dw$d */
    static final class C7934d extends AbstractC89220m implements AbstractC89171a<GestureDetector$OnDoubleTapListenerC7760ao> {

        /* renamed from: a */
        final /* synthetic */ C7930dw f19753a;

        static {
            Covode.recordClassIndex(8729);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7934d(C7930dw dwVar) {
            super(0);
            this.f19753a = dwVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ GestureDetector$OnDoubleTapListenerC7760ao invoke() {
            return new GestureDetector$OnDoubleTapListenerC7760ao(this.f19753a.getContext());
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5783o
    /* renamed from: c */
    public final FrameLayout mo11561c() {
        return (FrameLayout) mo13999b(R.id.e88);
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f19738n.set(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dw$a */
    public static final class RunnableC7931a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7930dw f19750a;

        static {
            Covode.recordClassIndex(8726);
        }

        RunnableC7931a(C7930dw dwVar) {
            this.f19750a = dwVar;
        }

        public final void run() {
            if (!this.f19750a.mStatusDestroyed) {
                LinkCrossGuestBgView linkCrossGuestBgView = (LinkCrossGuestBgView) this.f19750a.mo13999b(R.id.rs);
                C89219l.m154716b(linkCrossGuestBgView, "");
                linkCrossGuestBgView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dw$b */
    static final class C7932b implements CountDownView.AbstractC8132a {

        /* renamed from: a */
        final /* synthetic */ C7930dw f19751a;

        static {
            Covode.recordClassIndex(8727);
        }

        C7932b(C7930dw dwVar) {
            this.f19751a = dwVar;
        }

        @Override // com.bytedance.android.livesdk.chatroom.widget.CountDownView.AbstractC8132a
        /* renamed from: a */
        public final void mo14239a() {
            if (!this.f19751a.f19738n.get()) {
                C6779a.m14563a().mo13053a(new C7400q(3));
            } else {
                this.f19751a.f19739o = true;
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dw$c */
    static final class C7933c extends AbstractC89220m implements AbstractC89171a<ScaleGestureDetector> {

        /* renamed from: a */
        final /* synthetic */ C7930dw f19752a;

        static {
            Covode.recordClassIndex(8728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7933c(C7930dw dwVar) {
            super(0);
            this.f19752a = dwVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ScaleGestureDetector invoke() {
            return new ScaleGestureDetector(this.f19752a.getContext(), new C3020b(this.f19752a.f19740p, this.f19752a.mo14003i()));
        }
    }

    /* renamed from: q */
    private final void m16060q() {
        ((LinkCrossGuestBgView) mo13999b(R.id.rs)).post(new RunnableC7931a(this));
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f19739o) {
            C6779a.m14563a().mo13053a(new C7400q(3));
            this.f19739o = false;
        }
        this.f19738n.set(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        mo14003i().mo28320c(C3066h.class, Float.valueOf(0.0f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dw$h */
    public static final class RunnableC7939h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7930dw f19759a;

        static {
            Covode.recordClassIndex(8734);
        }

        RunnableC7939h(C7930dw dwVar) {
            this.f19759a = dwVar;
        }

        public final void run() {
            if (!this.f19759a.mStatusDestroyed) {
                LinkCrossGuestBgView linkCrossGuestBgView = (LinkCrossGuestBgView) this.f19759a.mo13999b(R.id.rs);
                C89219l.m154716b(linkCrossGuestBgView, "");
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
                linkCrossGuestBgView.setLayoutParams(layoutParams);
                LinkCrossGuestBgView linkCrossGuestBgView2 = (LinkCrossGuestBgView) this.f19759a.mo13999b(R.id.rs);
                C89219l.m154716b(linkCrossGuestBgView2, "");
                linkCrossGuestBgView2.setVisibility(0);
            }
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5783o
    /* renamed from: d */
    public final void mo11562d() {
        BroadcastFilterStyleWidget broadcastFilterStyleWidget;
        if (isViewValid() && (broadcastFilterStyleWidget = this.f19746v) != null) {
            AbstractC11748e b = ((AbstractC11797b) C6193a.m13435a(AbstractC11797b.class)).mo18859b();
            if (!b.mo18708a(EnumC8919b.HAS_SHOW_FILTER_GUIDE)) {
                b.mo18709b(EnumC8919b.HAS_SHOW_FILTER_GUIDE);
                View view = broadcastFilterStyleWidget.f20144a;
                if (view == null) {
                    C89219l.m154710a("filterArrow1");
                }
                view.setVisibility(0);
                View view2 = broadcastFilterStyleWidget.f20145b;
                if (view2 == null) {
                    C89219l.m154710a("filterArrow2");
                }
                view2.setVisibility(0);
                LiveTextView liveTextView = broadcastFilterStyleWidget.f20147d;
                if (liveTextView == null) {
                    C89219l.m154710a("filterStyleText");
                }
                liveTextView.setText(C3966y.m9657a((int) R.string.gvs));
                View view3 = broadcastFilterStyleWidget.f20146c;
                if (view3 == null) {
                    C89219l.m154710a("filterStyle");
                }
                view3.setClickable(true);
                view3.setVisibility(0);
                view3.setOnClickListener(new BroadcastFilterStyleWidget.View$OnClickListenerC8126c(view3, broadcastFilterStyleWidget));
                return;
            }
            View view4 = broadcastFilterStyleWidget.f20146c;
            if (view4 == null) {
                C89219l.m154710a("filterStyle");
            }
            view4.setVisibility(8);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al
    /* renamed from: k */
    public final Object[] mo14005k() {
        ArrayList d;
        Object[] objArr = new Object[2];
        ArrayList arrayList = new ArrayList();
        arrayList.add(EnumC5847l.SLOT);
        if (C5762c.m12632a(mo14003i())) {
            arrayList.add(EnumC5847l.QUESTION);
        }
        if (!C5856s.m12794a((Room) mo14003i().mo28318b(C9093de.class))) {
            arrayList.add(EnumC5847l.SHARE);
        }
        arrayList.add(EnumC5847l.EFFECT);
        arrayList.add(EnumC5847l.CLOSE_ROOM);
        arrayList.add(EnumC5847l.MORE);
        objArr[0] = arrayList;
        if (LinkEntranceExperiment.INSTANCE.getValue()) {
            d = C89070n.m154525d(EnumC5847l.COHOST, EnumC5847l.MULTIGUEST, EnumC5847l.INTERACTION_PK);
        } else {
            d = C89070n.m154525d(EnumC5847l.INTERACTION, EnumC5847l.INTERACTION_PK);
        }
        objArr[1] = d;
        return objArr;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006f, code lost:
        if (r7 > r1) goto L_0x0054;
     */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14006l() {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p499ui.C7930dw.mo14006l():void");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al
    /* renamed from: n */
    public final boolean mo14008n() {
        Boolean bool;
        boolean z;
        LiveCenterContainerView liveCenterContainerView = (LiveCenterContainerView) mo13999b(R.id.ca2);
        if (liveCenterContainerView != null) {
            DataChannel dataChannel = liveCenterContainerView.f10345c;
            if (dataChannel != null) {
                bool = (Boolean) dataChannel.mo28318b(C3067i.class);
            } else {
                bool = null;
            }
            if (!C11279p.m20012a(bool) && liveCenterContainerView.f10346d == EnumC9050bp.SCROLLING && BroadcastLiveCenterSetting.INSTANCE.enable()) {
                int abs = Math.abs((int) liveCenterContainerView.f10343a);
                int abs2 = (int) Math.abs(liveCenterContainerView.getTranslationX());
                if (1 <= abs2 && abs > abs2) {
                    if (Math.abs(liveCenterContainerView.getTranslationX()) < Math.abs(liveCenterContainerView.f10343a / 2.0f)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        LiveCenterContainerView.m9248a(liveCenterContainerView, "swipe", false, 2);
                    } else {
                        LiveCenterContainerView.m9250b(liveCenterContainerView, "swipe", false, 2);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5783o
    /* renamed from: a */
    public final void mo11559a(AbstractC3055a aVar) {
        this.f19740p = aVar;
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5783o
    /* renamed from: a */
    public final void mo11560a(AbstractC7601b bVar) {
        this.f19741q = bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dw$f */
    static final class C7937f extends AbstractC89220m implements AbstractC89172b<C7398o, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C7930dw f19757a;

        static {
            Covode.recordClassIndex(8732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7937f(C7930dw dwVar) {
            super(1);
            this.f19757a = dwVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C7398o oVar) {
            C7398o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            this.f19757a.mo14235a(oVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dw$g */
    static final class C7938g extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C7930dw f19758a;

        static {
            Covode.recordClassIndex(8733);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7938g(C7930dw dwVar) {
            super(1);
            this.f19758a = dwVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            ((LinkCrossGuestBgView) this.f19758a.mo13999b(R.id.rs)).setTipText(str2);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11679c.AbstractC11680a
    /* renamed from: a */
    public final void mo14237a(boolean z) {
        int i;
        LinearLayout linearLayout = (LinearLayout) mo13999b(R.id.cdf);
        if (linearLayout != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            linearLayout.setVisibility(i);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C3047a.m8356a("timer_start", String.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dw$e */
    static final class C7935e extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C7930dw f19754a;

        static {
            Covode.recordClassIndex(8730);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7935e(C7930dw dwVar) {
            super(1);
            this.f19754a = dwVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            bool.booleanValue();
            AbstractC2953a a = C6193a.m13435a(AbstractC4409b.class);
            C89219l.m154716b(a, "");
            final AbstractC4434e linkWidgetFactory = ((AbstractC4409b) a).getLinkWidgetFactory();
            linkWidgetFactory.mo10213a(this.f19754a.f19741q);
            BaseLinkControlWidget a2 = linkWidgetFactory.mo10210a(new BaseLinkControlWidget.AbstractC4381a(this) {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.C7930dw.C7935e.C79361 */

                /* renamed from: a */
                final /* synthetic */ C7935e f19755a;

                static {
                    Covode.recordClassIndex(8731);
                }

                @Override // com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget.AbstractC4381a
                /* renamed from: a */
                public final void mo10143a(LiveWidget liveWidget) {
                    this.f19755a.f19754a.mo14000f().unload(liveWidget);
                }

                @Override // com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget.AbstractC4381a
                /* renamed from: a */
                public final LiveWidget mo10142a(int i) {
                    if (i == 0) {
                        LiveWidget a = linkWidgetFactory.mo10212a();
                        ((BaseLinkWidget) a).mo10216a(this.f19755a.f19754a);
                        this.f19755a.f19754a.mo14000f().load(R.id.ctl, (Widget) a, false);
                        return a;
                    } else if (i == 1) {
                        AbstractC4434e eVar = linkWidgetFactory;
                        FrameLayout frameLayout = (FrameLayout) this.f19755a.f19754a.mo13999b(R.id.bp4);
                        C89219l.m154716b(frameLayout, "");
                        LiveWidget b = eVar.mo10215b(frameLayout);
                        this.f19755a.f19754a.mo14000f().load(R.id.ctl, (Widget) b, false);
                        return b;
                    } else if (i == 2) {
                        BaseLinkWidget a2 = linkWidgetFactory.mo10211a((FrameLayout) this.f19755a.f19754a.mo13999b(R.id.bp4));
                        a2.mo10216a(this.f19755a.f19754a);
                        this.f19755a.f19754a.mo14000f().load(R.id.d29, (Widget) a2, false);
                        return a2;
                    } else if (i != 4) {
                        return null;
                    } else {
                        LiveWidget b2 = linkWidgetFactory.mo10214b();
                        this.f19755a.f19754a.mo14000f().load(R.id.ir, (Widget) b2, false);
                        return b2;
                    }
                }

                {
                    this.f19755a = r1;
                }
            });
            this.f19754a.f19742r = a2;
            this.f19754a.mo14000f().load(R.id.bp7, a2);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5783o
    /* renamed from: a */
    public final void mo11558a(int i) {
        NetSpeedMonitorWidget netSpeedMonitorWidget = this.f19201a;
        if (netSpeedMonitorWidget != null) {
            if (netSpeedMonitorWidget.f20211e == NetworkUtils.EnumC29835h.NONE) {
                netSpeedMonitorWidget.f20207a = 3;
            } else if (i != 0) {
                netSpeedMonitorWidget.f20207a = i;
            }
            C6779a.m14563a().mo13053a(new C8184l(netSpeedMonitorWidget.f20207a));
            if (netSpeedMonitorWidget.f20208b != i) {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("room_id", String.valueOf(C6544e.m13995i()));
                jSONObject.put("quality", i);
                C18494b.m34415a(new C18484a("anchor_center_net_quality_changed", currentTimeMillis, new C18738d(jSONObject)));
                netSpeedMonitorWidget.f20208b = i;
            }
        }
    }

    /* renamed from: a */
    public final void mo14235a(C7398o oVar) {
        if (isViewValid()) {
            ((LinkCrossGuestBgView) mo13999b(R.id.rs)).setDataChannel(mo14003i());
            int i = oVar.f18328a;
            if (i == 0) {
                this.f19745u = true;
            } else if (i == 1) {
                this.f19745u = false;
                m16060q();
            } else if (i == 2) {
                m16060q();
            } else if (i == 3 && this.f19745u) {
                ((LinkCrossGuestBgView) mo13999b(R.id.rs)).post(new RunnableC7939h(this));
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al
    /* renamed from: a */
    public final boolean mo13997a(MotionEvent motionEvent) {
        m16059p();
        if (GestureDetector$OnDoubleTapListenerC7760ao.m15802a()) {
            GestureDetector$OnDoubleTapListenerC7760ao p = m16059p();
            GestureDetectLayout gestureDetectLayout = (GestureDetectLayout) mo13999b(R.id.cz7);
            C89219l.m154716b(gestureDetectLayout, "");
            int width = gestureDetectLayout.getWidth();
            GestureDetectLayout gestureDetectLayout2 = (GestureDetectLayout) mo13999b(R.id.cz7);
            C89219l.m154716b(gestureDetectLayout2, "");
            int height = gestureDetectLayout2.getHeight();
            GestureDetectLayout gestureDetectLayout3 = (GestureDetectLayout) mo13999b(R.id.cz7);
            C89219l.m154716b(gestureDetectLayout3, "");
            int top = gestureDetectLayout3.getTop();
            GestureDetectLayout gestureDetectLayout4 = (GestureDetectLayout) mo13999b(R.id.cz7);
            C89219l.m154716b(gestureDetectLayout4, "");
            int left = gestureDetectLayout4.getLeft();
            p.f19259d = width;
            p.f19260e = height;
            p.f19261f = top;
            p.f19262g = left;
            GestureDetector$OnDoubleTapListenerC7760ao p2 = m16059p();
            if (GestureDetector$OnDoubleTapListenerC7760ao.m15802a()) {
                if ((motionEvent.getAction() & 255) == 2) {
                    for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                        C6779a.m14563a().mo13053a(new C7404u(207, p2.mo14019a(motionEvent, (long) motionEvent.getPointerId(i))));
                    }
                } else {
                    C6779a.m14563a().mo13053a(new C7404u(207, p2.mo14019a(motionEvent, (long) motionEvent.getPointerId(motionEvent.getActionIndex()))));
                }
                C3854a.m9453a(6, "AmazingEngineTouch", "notifyTouchEvent: ACTION_AMAZING_TOUCH");
                int action = motionEvent.getAction() & 255;
                p2.f19257b.onTouchEvent(motionEvent);
                if (action == 0) {
                    p2.f19258c = false;
                }
                if (motionEvent.getPointerCount() > 1) {
                    p2.f19258c = true;
                }
                if (!p2.f19258c) {
                    p2.f19256a.mo2893a(motionEvent);
                }
                if (action == 0) {
                    p2.f19263h = true;
                    p2.f19264i = motionEvent;
                } else if (action == 1) {
                    p2.f19263h = false;
                    GestureDetector$OnDoubleTapListenerC7760ao.m15801a(202, p2.mo14020a(motionEvent, true));
                }
            }
            return true;
        } else if (mo14003i().mo28318b(C9051bq.class) != EnumC9050bp.DISMISS || ((ScaleGestureDetector) this.f19748x.getValue()).onTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((LiveCenterContainerView) mo13999b(R.id.ca2)).setDataChannel(mo14003i());
        ((LiveCenterContainerView) mo13999b(R.id.ca2)).setGestureDetectLayout((GestureDetectLayout) mo13999b(R.id.cz7));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al
    /* renamed from: a */
    public final void mo13994a(View view, Bundle bundle) {
        if (TestDisableMixStreamTypeSetting.INSTANCE.getValue()) {
            mo14000f().load(mo13999b(R.id.e_h), ((AbstractC4318a) C6193a.m13435a(AbstractC4318a.class)).getStreamInfoWidget());
        }
        mo14003i().mo28313b((AbstractC1204m) this, C3065g.class, (AbstractC89172b) new C7935e(this)).mo28312a((Object) this, C4450t.class, (AbstractC89172b) new C7937f(this)).mo28312a((Object) this, C4396aj.class, (AbstractC89172b) new C7938g(this));
        if (C5762c.m12632a(mo14003i())) {
            mo14000f().load(R.id.dcx, ((AbstractC5760a) C6193a.m13435a(AbstractC5760a.class)).getQAWidget());
        }
        if (LiveEnableBitrateMonitorSetting.INSTANCE.getValue() == 1) {
            RecyclableWidgetManager f = mo14000f();
            NetSpeedMonitorWidget netSpeedMonitorWidget = new NetSpeedMonitorWidget();
            this.f19201a = netSpeedMonitorWidget;
            f.load(R.id.crf, netSpeedMonitorWidget);
        }
        RecyclableWidgetManager f2 = mo14000f();
        BroadcastCountDownWidget broadcastCountDownWidget = new BroadcastCountDownWidget();
        C7932b bVar = new C7932b(this);
        C89219l.m154721d(bVar, "");
        broadcastCountDownWidget.f20142a = bVar;
        f2.load(R.id.aeu, broadcastCountDownWidget);
        if (BroadcastLiveCenterSetting.INSTANCE.enable()) {
            RecyclableWidgetManager f3 = mo14000f();
            LiveCenterEntranceWidget liveCenterEntranceWidget = new LiveCenterEntranceWidget();
            this.f19202b = liveCenterEntranceWidget;
            f3.load(R.id.ca4, liveCenterEntranceWidget);
        } else {
            RecyclableWidgetManager f4 = mo14000f();
            BroadcastFilterStyleWidget broadcastFilterStyleWidget = new BroadcastFilterStyleWidget();
            this.f19746v = broadcastFilterStyleWidget;
            f4.load(R.id.b26, broadcastFilterStyleWidget);
        }
        super.mo13994a(view, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11679c.AbstractC11681b
    /* renamed from: a */
    public final void mo14236a(String str, boolean z) {
        BroadcastFilterStyleWidget broadcastFilterStyleWidget;
        AnimationSet animationSet;
        if (isViewValid() && str != null && str.length() != 0) {
            if (!(!this.f19744t || (broadcastFilterStyleWidget = this.f19746v) == null || !broadcastFilterStyleWidget.isViewValid || str == null || str.length() == 0)) {
                LiveTextView liveTextView = broadcastFilterStyleWidget.f20147d;
                if (liveTextView == null) {
                    C89219l.m154710a("filterStyleText");
                }
                liveTextView.setText(str);
                View view = broadcastFilterStyleWidget.f20146c;
                if (view == null) {
                    C89219l.m154710a("filterStyle");
                }
                view.clearAnimation();
                View view2 = broadcastFilterStyleWidget.f20146c;
                if (view2 == null) {
                    C89219l.m154710a("filterStyle");
                }
                if (z) {
                    animationSet = (AnimationSet) broadcastFilterStyleWidget.f20148e.getValue();
                } else {
                    animationSet = (AnimationSet) broadcastFilterStyleWidget.f20149f.getValue();
                }
                view2.startAnimation(animationSet);
            }
            this.f19744t = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C2690b.m7784a(R.layout.b86, viewGroup);
    }
}
