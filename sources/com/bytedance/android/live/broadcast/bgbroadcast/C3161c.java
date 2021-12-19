package com.bytedance.android.live.broadcast.bgbroadcast;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.StatusApi;
import com.bytedance.android.live.broadcast.api.p185c.C3047a;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b;
import com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3126j;
import com.bytedance.android.live.broadcast.bgbroadcast.p191b.C3155b;
import com.bytedance.android.live.broadcast.p188b.View$OnClickListenerC3087f;
import com.bytedance.android.live.broadcast.p195d.C3221b;
import com.bytedance.android.live.broadcast.p197f.C3229a;
import com.bytedance.android.live.broadcast.utils.C3719d;
import com.bytedance.android.live.broadcast.utils.C3723e;
import com.bytedance.android.live.broadcast.utils.C3726f;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p379n.AbstractC5775h;
import com.bytedance.android.live.p379n.AbstractC5788t;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6201f;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.chatroom.p499ui.DialogC7913do;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.p543a.AbstractC8783b;
import com.bytedance.android.livesdk.gift.p549e.AbstractC8807b;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftInterfaceOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.gift.LivePrefetchGiftImageSetting;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.C9688bt;
import com.bytedance.android.livesdk.model.message.C9883n;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p425aa.C6560m;
import com.bytedance.android.livesdk.p425aa.p428c.C6529h;
import com.bytedance.android.livesdk.p425aa.p428c.C6531i;
import com.bytedance.android.livesdk.p425aa.p428c.C6532j;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9097di;
import com.bytedance.android.livesdk.p561j.C9103do;
import com.bytedance.android.livesdk.p561j.C9141w;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.p605r.AbstractC10312b;
import com.bytedance.android.livesdk.p605r.C10328j;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.rank.api.C10341e;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.C11117b;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdk.util.rxutils.p651b.EnumC11186b;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.AbstractBinderC11605a;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11677a;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11678b;
import com.bytedance.android.livesdkapi.depend.p677a.AbstractC11623a;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.message.IMessageService;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.AbstractC17845e;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c */
public final class C3161c extends C10935a implements AbstractC3057b, AbstractC3182f, C3229a.AbstractC3230a, AbstractC11677a, AbstractC17845e {

    /* renamed from: f */
    public static final C3162a f9147f = new C3162a((byte) 0);

    /* renamed from: a */
    public AbstractC11678b f9148a;

    /* renamed from: b */
    public AbstractC88412b f9149b;

    /* renamed from: c */
    public AbstractBinderC11605a f9150c;

    /* renamed from: d */
    public AbstractC3153b f9151d;

    /* renamed from: e */
    public C3229a f9152e;

    /* renamed from: g */
    private String f9153g;

    /* renamed from: h */
    private CharSequence f9154h;

    /* renamed from: i */
    private CharSequence f9155i;

    /* renamed from: j */
    private CharSequence f9156j;

    /* renamed from: k */
    private boolean f9157k;

    /* renamed from: l */
    private boolean f9158l;

    /* renamed from: m */
    private DataChannel f9159m;

    /* renamed from: n */
    private boolean f9160n;

    /* renamed from: o */
    private boolean f9161o;

    /* renamed from: p */
    private boolean f9162p = true;

    /* renamed from: q */
    private final ServiceConnection f9163q = new ServiceConnectionC3163b(this);

    /* renamed from: r */
    private final AbstractC8807b f9164r = new C3164c(this);

    /* renamed from: s */
    private Room f9165s;

    /* renamed from: t */
    private AbstractC5775h f9166t;

    /* renamed from: u */
    private DialogC7913do f9167u;

    /* renamed from: v */
    private View$OnClickListenerC3087f f9168v;

    /* renamed from: w */
    private HashMap f9169w;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c$l */
    public static final class C3174l<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C3174l f9179a = new C3174l();

        static {
            Covode.recordClassIndex(3655);
        }

        C3174l() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(3642);
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void beforeLiveCoreStartStream() {
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void connected() {
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onCaptureFirstFrame() {
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onFirstRTMPConnect() {
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onInfo(float f) {
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onNetworkLow() {
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onNetworkStatus(int i) {
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onReconnect() {
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onReconnected() {
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onStreamStart() {
        this.f9162p = false;
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c$a */
    public static final class C3162a {
        static {
            Covode.recordClassIndex(3643);
        }

        private C3162a() {
        }

        public /* synthetic */ C3162a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3182f, com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11677a
    /* renamed from: c */
    public final Fragment mo8504c() {
        return this;
    }

    @Override // com.bytedance.android.live.broadcast.p197f.C3229a.AbstractC3230a
    /* renamed from: a */
    public final void mo8501a(boolean z, String str) {
        if (!this.mStatusDestroyed) {
            m8613k().mo14213a(z, str);
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3182f
    /* renamed from: f */
    public final void mo8507f() {
        AbstractBinderC11605a aVar = this.f9150c;
        if (aVar != null) {
            aVar.startBgActivity();
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3182f
    /* renamed from: i */
    public final /* synthetic */ Activity mo8510i() {
        return getActivity();
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3182f, com.bytedance.android.livesdk.p643ui.C10935a
    public final boolean isViewValid() {
        if (!this.mStatusDestroyed) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c$e */
    public static final /* synthetic */ class C3167e extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(3648);
        }

        C3167e(C3161c cVar) {
            super(0, cVar, C3161c.class, "onFinishBroadcastCancelClick", "onFinishBroadcastCancelClick()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((C3161c) this.receiver).mo8506e();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c$k */
    static final class RunnableC3173k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3161c f9178a;

        static {
            Covode.recordClassIndex(3654);
        }

        RunnableC3173k(C3161c cVar) {
            this.f9178a = cVar;
        }

        public final void run() {
            if (!this.f9178a.mStatusDestroyed) {
                C3161c.m8609a(this.f9178a).mo8452h();
            }
        }
    }

    /* renamed from: r */
    private final long m8616r() {
        Room room = this.f9165s;
        if (room == null) {
            C89219l.m154710a("mRoom");
        }
        return room.getId();
    }

    @Override // com.bytedance.ies.sdk.datachannel.AbstractC17845e
    /* renamed from: h */
    public final DataChannel mo8509h() {
        DataChannel dataChannel = this.f9159m;
        if (dataChannel == null) {
            C89219l.m154710a("dataChannel");
        }
        return dataChannel;
    }

    @Override // com.bytedance.android.live.broadcast.p197f.C3229a.AbstractC3230a
    /* renamed from: n */
    public final void mo8514n() {
        C11226ao.m19882a(getContext(), (int) R.string.gr8);
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f9169w;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c$o */
    static final class C3177o implements DialogC7913do.AbstractC7914a {

        /* renamed from: a */
        final /* synthetic */ DialogC7913do f9184a;

        static {
            Covode.recordClassIndex(3658);
        }

        C3177o(DialogC7913do doVar) {
            this.f9184a = doVar;
        }

        @Override // com.bytedance.android.livesdk.chatroom.p499ui.DialogC7913do.AbstractC7914a
        /* renamed from: a */
        public final void mo8527a() {
            C11226ao.m19883a(this.f9184a.getContext(), C3966y.m9657a((int) R.string.gpj), 0);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c$p */
    static final class C3178p implements DialogC7913do.AbstractC7915b {

        /* renamed from: a */
        final /* synthetic */ DialogC7913do f9185a;

        static {
            Covode.recordClassIndex(3659);
        }

        C3178p(DialogC7913do doVar) {
            this.f9185a = doVar;
        }

        @Override // com.bytedance.android.livesdk.chatroom.p499ui.DialogC7913do.AbstractC7915b
        /* renamed from: a */
        public final void mo8528a() {
            C11226ao.m19883a(this.f9185a.getContext(), C3966y.m9657a((int) R.string.gpj), 0);
        }
    }

    /* renamed from: j */
    private final void m8612j() {
        if (this.f9161o) {
            AbstractBinderC11605a aVar = this.f9150c;
            if (aVar != null) {
                aVar.setLiveStatusListener(null);
            }
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                activity.unbindService(this.f9163q);
            }
            this.f9161o = false;
        }
    }

    /* renamed from: k */
    private final DialogC7913do m8613k() {
        DialogC7913do doVar = this.f9167u;
        if (doVar != null) {
            return doVar;
        }
        DialogC7913do a = DialogC7913do.m16042a(getActivity());
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: q */
    private static long m8615q() {
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (b != null) {
            return b.mo13161c();
        }
        return 0;
    }

    @Override // com.bytedance.android.live.broadcast.p197f.C3229a.AbstractC3230a
    /* renamed from: l */
    public final void mo8512l() {
        if (!this.mStatusDestroyed) {
            DialogC7913do k = m8613k();
            new View$OnClickListenerC3179q(this);
            k.mo14210a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (!this.f9158l) {
            m8612j();
            C3051c.C3052a.m8359a("ttlive_page_stop").mo12633b("pc_broadcast").mo12632a();
        }
    }

    /* renamed from: p */
    private final void m8614p() {
        Intent intent;
        try {
            m8612j();
            AbstractBinderC11605a aVar = this.f9150c;
            if (aVar != null) {
                aVar.stopService();
            }
            if (this.f9157k) {
                ActivityC0945e activity = getActivity();
                if (activity != null) {
                    Context context = getContext();
                    if (context != null) {
                        C89219l.m154716b(context, "");
                        intent = m8608a(context);
                    } else {
                        intent = null;
                    }
                    activity.stopService(intent);
                }
                this.f9157k = false;
            }
        } catch (Throwable th) {
            C3854a.m9453a(6, "ALogger", th.getMessage());
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11677a
    /* renamed from: a */
    public final void mo8496a() {
        try {
            AbstractC10312b b = C10328j.m18798b("control_view");
            if (b != null) {
                b.mo17082a();
            }
        } catch (Throwable th) {
            C3854a.m9453a(6, "ALogger", th.getMessage());
        }
        try {
            AbstractC10312b b2 = C10328j.m18798b("msg_view");
            if (b2 != null) {
                b2.mo17082a();
            }
        } catch (Throwable th2) {
            C3854a.m9453a(6, "ALogger", th2.getMessage());
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11677a
    /* renamed from: b */
    public final boolean mo8503b() {
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        C89219l.m154716b(childFragmentManager, "");
        List<Fragment> f = childFragmentManager.mo3565f();
        C89219l.m154716b(f, "");
        for (T t : f) {
            if ((t instanceof AbstractC11623a) && t != null) {
                Objects.requireNonNull(t, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.chat.OnBackPressedListener");
                if (t.mo13772i_()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public final void mo8506e() {
        C6501b a = C6501b.C6502a.m13948a("anchor_close_live_cancel");
        DataChannel dataChannel = this.f9159m;
        if (dataChannel == null) {
            C89219l.m154710a("dataChannel");
        }
        C6501b a2 = a.mo12643a(dataChannel);
        Room room = this.f9165s;
        if (room == null) {
            C89219l.m154710a("mRoom");
        }
        EnumC11728i streamType = room.getStreamType();
        C89219l.m154716b(streamType, "");
        a2.mo12651a("live_type", C11729j.m20684a(streamType)).mo12655b();
        C6805b<Boolean> bVar = AbstractC6804a.f16929ae;
        C89219l.m154716b(bVar, "");
        C6806c.m14603a((C6800c) bVar, (Object) false);
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3182f
    /* renamed from: g */
    public final void mo8508g() {
        AbstractBinderC11605a aVar = this.f9150c;
        if (aVar != null) {
            aVar.startStream(false, PrivacyCert.Builder.Companion.with("bpea-575").usage("").tag("start video/audio capture when live starts").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    @Override // com.bytedance.android.live.broadcast.p197f.C3229a.AbstractC3230a
    /* renamed from: m */
    public final void mo8513m() {
        if (!this.mStatusDestroyed && getActivity() != null) {
            View$OnClickListenerC3087f fVar = this.f9168v;
            if (fVar == null) {
                fVar = View$OnClickListenerC3087f.m8424a(getContext(), this.f9152e);
                C3229a aVar = this.f9152e;
                if (aVar != null) {
                    aVar.f9279h = fVar;
                }
                AbstractC0952i childFragmentManager = getChildFragmentManager();
                C89219l.m154716b(childFragmentManager, "");
                fVar.show(childFragmentManager, "IllegalReviewDialog");
            }
            this.f9168v = fVar;
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (!this.f9158l) {
            AbstractC3153b bVar = this.f9151d;
            if (bVar == null) {
                C89219l.m154710a("mStrategy");
            }
            bVar.mo8450f();
            C3051c.C3052a.m8359a("ttlive_page_pause").mo12633b("pc_broadcast").mo12632a();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.f9158l) {
            AbstractC3153b bVar = this.f9151d;
            if (bVar == null) {
                C89219l.m154710a("mStrategy");
            }
            bVar.mo8449e();
            C3051c.C3052a.m8359a("ttlive_page_resume").mo12633b("pc_broadcast").mo12632a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        Intent intent;
        super.onStart();
        if (!this.f9158l) {
            if (!this.f9160n && !this.f9161o) {
                ActivityC0945e activity = getActivity();
                if (activity != null) {
                    Context context = getContext();
                    if (context != null) {
                        C89219l.m154716b(context, "");
                        intent = m8608a(context);
                    } else {
                        intent = null;
                    }
                    activity.bindService(intent, this.f9163q, 1);
                }
                this.f9161o = true;
            }
            C3051c.C3052a.m8359a("ttlive_page_start").mo12633b("pc_broadcast").mo12632a();
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3182f
    /* renamed from: d */
    public final void mo8505d() {
        if (!this.mStatusDestroyed) {
            Room room = this.f9165s;
            if (room == null) {
                C89219l.m154710a("mRoom");
            }
            DataChannel dataChannel = this.f9159m;
            if (dataChannel == null) {
                C89219l.m154710a("dataChannel");
            }
            C3726f.C3727a.m9236a(room, dataChannel);
            ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).clearMockChatMessage();
            this.f9160n = true;
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                activity.setRequestedOrientation(1);
            }
            Bundle bundle = new Bundle();
            AbstractC3153b bVar = this.f9151d;
            if (bVar == null) {
                C89219l.m154710a("mStrategy");
            }
            bVar.mo8442a(bundle);
            LiveWidgetProvider.Companion.getInstance().clear();
            AbstractC11678b bVar2 = this.f9148a;
            if (bVar2 != null) {
                bVar2.mo18450a(bundle);
            }
            AbstractC3153b bVar3 = this.f9151d;
            if (bVar3 == null) {
                C89219l.m154710a("mStrategy");
            }
            bVar3.mo8453i();
            m8614p();
            mo8496a();
        }
    }

    @Override // com.bytedance.android.live.broadcast.p197f.C3229a.AbstractC3230a
    /* renamed from: o */
    public final void mo8515o() {
        m8610a(8, PrivacyCert.Builder.Companion.with("bpea-580").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        m8614p();
        C3854a.m9453a(3, "BgBroadcastFragment", "room close forceEndLive");
        mo8505d();
        C3221b.m8716b(10004, m8615q(), m8616r(), this.f9162p);
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        DataChannelGlobal.f42558d.mo28327c(C9097di.class);
        DataChannel dataChannel = this.f9159m;
        if (dataChannel == null) {
            C89219l.m154710a("dataChannel");
        }
        dataChannel.mo28316b(this);
        C3229a aVar = this.f9152e;
        if (aVar != null) {
            aVar.mo8577b();
        }
        DialogC7913do doVar = this.f9167u;
        if (doVar != null) {
            C11279p.m20014b(doVar);
        }
        m8614p();
        this.mStatusDestroyed = true;
        AbstractC88412b bVar = this.f9149b;
        if (bVar != null) {
            bVar.dispose();
        }
        C6201f.m13460c();
        super.onDestroy();
        if (!this.f9158l) {
            m8610a(1, PrivacyCert.Builder.Companion.with("bpea-578").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            IMessageService iMessageService = (IMessageService) C6193a.m13435a(IMessageService.class);
            Room room = this.f9165s;
            if (room == null) {
                C89219l.m154710a("mRoom");
            }
            iMessageService.release(room.getId());
            Room room2 = this.f9165s;
            if (room2 == null) {
                C89219l.m154710a("mRoom");
            }
            room2.getId();
            C4384b.C4385a.m10498a("BgBroadcastFragment_OnDestroy");
            AbstractC3153b bVar2 = this.f9151d;
            if (bVar2 == null) {
                C89219l.m154710a("mStrategy");
            }
            bVar2.mo8451g();
            C3051c.C3052a.m8359a("ttlive_page_destroy").mo12633b("pc_broadcast").mo12632a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c$b */
    public static final class ServiceConnectionC3163b implements ServiceConnection {

        /* renamed from: a */
        final /* synthetic */ C3161c f9170a;

        static {
            Covode.recordClassIndex(3644);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ServiceConnectionC3163b(C3161c cVar) {
            this.f9170a = cVar;
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            C89219l.m154721d(componentName, "");
            this.f9170a.f9150c = null;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C89219l.m154721d(componentName, "");
            C89219l.m154721d(iBinder, "");
            this.f9170a.f9150c = (AbstractBinderC11605a) iBinder;
            AbstractC3153b a = C3161c.m8609a(this.f9170a);
            AbstractBinderC11605a aVar = this.f9170a.f9150c;
            if (aVar == null) {
                C89219l.m154715b();
            }
            a.mo8444a(aVar);
            if (this.f9170a.f9150c instanceof BgBroadcastServiceImpl) {
                AbstractBinderC11605a aVar2 = this.f9170a.f9150c;
                Objects.requireNonNull(aVar2, "null cannot be cast to non-null type com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl");
                ((BgBroadcastServiceImpl) aVar2).setLiveStreamCallback(this.f9170a);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c$c */
    public static final class C3164c extends AbstractC8807b {

        /* renamed from: a */
        final /* synthetic */ C3161c f9171a;

        static {
            Covode.recordClassIndex(3645);
        }

        @Override // com.bytedance.android.livesdk.gift.p549e.AbstractC8807b
        /* renamed from: a */
        public final void mo8519a(List<? extends C9904t> list) {
            C89219l.m154721d(list, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3164c(C3161c cVar) {
            this.f9171a = cVar;
        }

        @Override // com.bytedance.android.livesdk.gift.p549e.AbstractC8807b
        /* renamed from: b */
        public final void mo8520b(List<? extends GiftPage> list) {
            C89219l.m154721d(list, "");
            this.f9171a.f9149b = AbstractC88979t.m154294a(new C3165a(list)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143300g();
        }

        /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c$c$a */
        static final class C3165a<T> implements AbstractC88983w {

            /* renamed from: a */
            final /* synthetic */ List f9172a;

            static {
                Covode.recordClassIndex(3646);
            }

            C3165a(List list) {
                this.f9172a = list;
            }

            @Override // p4560f.p4561a.AbstractC88983w
            public final void subscribe(AbstractC88982v<Object> vVar) {
                ImageModel imageModel;
                if (LivePrefetchGiftImageSetting.INSTANCE.getValue()) {
                    List<T> list = this.f9172a;
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    for (T t : list) {
                        arrayList.add(t.gifts);
                    }
                    for (T t2 : C89070n.m154528a((Iterable) arrayList)) {
                        if (t2 != null) {
                            imageModel = t2.f23997b;
                        } else {
                            imageModel = null;
                        }
                        C3941k.m9598a(imageModel);
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c$j */
    public static final class C3172j extends AbstractC5788t {

        /* renamed from: a */
        final /* synthetic */ C3161c f9177a;

        static {
            Covode.recordClassIndex(3653);
        }

        C3172j(C3161c cVar) {
            this.f9177a = cVar;
        }

        @Override // com.bytedance.android.live.p379n.AbstractC5788t
        /* renamed from: a */
        public final void mo8524a(C9688bt btVar) {
            C89219l.m154721d(btVar, "");
            C3229a aVar = this.f9177a.f9152e;
            if (aVar != null) {
                aVar.mo8576a(btVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c$m */
    public static final class C3175m<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C3175m f9180a = new C3175m();

        static {
            Covode.recordClassIndex(3656);
        }

        C3175m() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C3854a.m9458a("BgBroadcastFragment", (Throwable) obj);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c$h */
    static final class C3170h extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3161c f9175a;

        static {
            Covode.recordClassIndex(3651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3170h(C3161c cVar) {
            super(1);
            this.f9175a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f9175a.mo8505d();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c$i */
    static final class C3171i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3161c f9176a;

        static {
            Covode.recordClassIndex(3652);
        }

        C3171i(C3161c cVar) {
            this.f9176a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C7400q qVar = (C7400q) obj;
            C3161c cVar = this.f9176a;
            C89219l.m154716b(qVar, "");
            cVar.onEvent(qVar);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c$n */
    static final class View$OnClickListenerC3176n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC7913do f9181a;

        /* renamed from: b */
        final /* synthetic */ C3161c f9182b;

        /* renamed from: c */
        final /* synthetic */ boolean f9183c;

        static {
            Covode.recordClassIndex(3657);
        }

        View$OnClickListenerC3176n(DialogC7913do doVar, C3161c cVar, boolean z) {
            this.f9181a = doVar;
            this.f9182b = cVar;
            this.f9183c = z;
        }

        public final void onClick(View view) {
            C3229a aVar = this.f9182b.f9152e;
            if (aVar != null) {
                aVar.mo8575a();
                this.f9181a.dismiss();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AbstractC3153b m8609a(C3161c cVar) {
        AbstractC3153b bVar = cVar.f9151d;
        if (bVar == null) {
            C89219l.m154710a("mStrategy");
        }
        return bVar;
    }

    @Override // com.bytedance.android.live.broadcast.p197f.C3229a.AbstractC3230a
    /* renamed from: b */
    public final void mo8502b(CharSequence charSequence) {
        if (!this.mStatusDestroyed) {
            m8613k().mo14214b(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c$d */
    public static final /* synthetic */ class C3166d extends C89217j implements AbstractC89172b<PrivacyCert, C89391z> {
        static {
            Covode.recordClassIndex(3647);
        }

        C3166d(C3161c cVar) {
            super(1, cVar, C3161c.class, "onFinishBroadcastConfirmClick", "onFinishBroadcastConfirmClick(Lcom/bytedance/bpea/basics/PrivacyCert;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(PrivacyCert privacyCert) {
            PrivacyCert privacyCert2 = privacyCert;
            C89219l.m154721d(privacyCert2, "");
            ((C3161c) this.receiver).mo8498a(privacyCert2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c$q */
    static final class View$OnClickListenerC3179q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3161c f9186a;

        /* renamed from: b */
        final /* synthetic */ String f9187b = null;

        static {
            Covode.recordClassIndex(3660);
        }

        View$OnClickListenerC3179q(C3161c cVar) {
            this.f9186a = cVar;
        }

        public final void onClick(View view) {
            AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
            Context context = this.f9186a.getContext();
            AbstractC6956d.C6957a b = AbstractC6963e.m14872b(this.f9187b);
            b.f17379c = true;
            webViewManager.mo13248a(context, b);
        }
    }

    /* renamed from: a */
    private static Intent m8608a(Context context) {
        Intent intent = new Intent();
        AbstractC2953a a = C6193a.m13435a(IHostApp.class);
        C89219l.m154716b(a, "");
        intent.setComponent(new ComponentName(context, ((IHostApp) a).getBgBroadcastServiceName()));
        return intent;
    }

    /* renamed from: b */
    private final void m8611b(boolean z) {
        String str;
        if (z && !C13627m.m24498a(this.f9153g)) {
            AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
            Context context = getContext();
            AbstractC6956d.C6957a b = AbstractC6963e.m14872b(this.f9153g);
            b.f17379c = true;
            b.f17378b = C3966y.m9657a((int) R.string.gi2);
            webViewManager.mo13248a(context, b);
        }
        StringBuilder sb = new StringBuilder("room close onLiveEnd endByBanned:");
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        C3854a.m9453a(3, "BgBroadcastFragment", sb.append(str).toString());
        mo8505d();
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3182f
    /* renamed from: a */
    public final void mo8497a(AbstractC5775h hVar) {
        Bundle bundle;
        C89219l.m154721d(hVar, "");
        if (!this.mStatusDestroyed && getChildFragmentManager().mo3551a("AbsInteractionFragment") == null) {
            DataChannel dataChannel = this.f9159m;
            if (dataChannel == null) {
                C89219l.m154710a("dataChannel");
            }
            Room room = this.f9165s;
            if (room == null) {
                C89219l.m154710a("mRoom");
            }
            dataChannel.mo28315b(C9093de.class, room);
            this.f9166t = hVar;
            Fragment b = hVar.mo11520b();
            Bundle arguments = getArguments();
            if (arguments != null) {
                bundle = arguments.getBundle("extra");
            } else {
                bundle = null;
            }
            b.setArguments(bundle);
            DataChannel dataChannel2 = this.f9159m;
            if (dataChannel2 == null) {
                C89219l.m154710a("dataChannel");
            }
            hVar.mo11518a(dataChannel2, new C3172j(this));
            getChildFragmentManager().mo3552a().mo3454a(R.id.bpb, hVar.mo11520b(), "AbsInteractionFragment").mo3473c();
            hVar.mo11519a(new RunnableC3173k(this));
            LivePerformanceManager.getInstance().setIsAnchor(true);
        }
    }

    /* renamed from: a */
    public final void mo8498a(PrivacyCert privacyCert) {
        C6501b a = C6501b.C6502a.m13948a("anchor_close_live_confirm");
        DataChannel dataChannel = this.f9159m;
        if (dataChannel == null) {
            C89219l.m154710a("dataChannel");
        }
        C6501b a2 = a.mo12643a(dataChannel);
        Room room = this.f9165s;
        if (room == null) {
            C89219l.m154710a("mRoom");
        }
        EnumC11728i streamType = room.getStreamType();
        C89219l.m154716b(streamType, "");
        a2.mo12651a("live_type", C11729j.m20684a(streamType)).mo12655b();
        C6805b<Boolean> bVar = AbstractC6804a.f16929ae;
        C89219l.m154716b(bVar, "");
        C6806c.m14603a((C6800c) bVar, (Object) true);
        C3221b.m8716b(10001, m8615q(), m8616r(), this.f9162p);
        m8610a(1, privacyCert);
        mo8505d();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Boolean bool;
        Window window;
        C11117b.m19749a(getActivity());
        super.onActivityCreated(bundle);
        if (!this.f9158l) {
            C6201f.m13458a();
            C6201f.m13459b();
            ActivityC0945e activity = getActivity();
            if (!(activity == null || (window = activity.getWindow()) == null)) {
                window.setSoftInputMode(50);
            }
            Room room = this.f9165s;
            if (room == null) {
                C89219l.m154710a("mRoom");
            }
            if (Room.isValid(room)) {
                Room room2 = this.f9165s;
                if (room2 == null) {
                    C89219l.m154710a("mRoom");
                }
                if (room2.isPullUrlValid()) {
                    Room room3 = this.f9165s;
                    if (room3 == null) {
                        C89219l.m154710a("mRoom");
                    }
                    long id = room3.getId();
                    DataChannel dataChannel = this.f9159m;
                    if (dataChannel == null) {
                        C89219l.m154710a("dataChannel");
                    }
                    C4384b.C4385a.m10497a(id, dataChannel, "BgBroadcastFragment_OnActivityCreated");
                    AbstractC0952i childFragmentManager = getChildFragmentManager();
                    C89219l.m154716b(childFragmentManager, "");
                    Fragment a = childFragmentManager.mo3551a("AbsInteractionFragment");
                    if (a != null) {
                        try {
                            childFragmentManager.mo3552a().mo3455a(a).mo3478e();
                        } catch (Exception e) {
                            C6555i.m14021b();
                            C3854a.m9455a(6, "ttlive_exception", e.getStackTrace());
                        }
                    }
                    Room room4 = this.f9165s;
                    if (room4 == null) {
                        C89219l.m154710a("mRoom");
                    }
                    long id2 = room4.getId();
                    getContext();
                    C3229a aVar = new C3229a(id2);
                    this.f9152e = aVar;
                    aVar.mo10297a(this);
                    this.f9157k = true;
                    ((IGiftService) C6193a.m13435a(IGiftService.class)).resetRoomStatus();
                    Intent intent = null;
                    if (!LiveGiftInterfaceOptimizeSetting.INSTANCE.getValue()) {
                        AbstractC2953a a2 = C6193a.m13435a(IGiftService.class);
                        C89219l.m154716b(a2, "");
                        AbstractC8783b firstRechargeManager = ((IGiftService) a2).getFirstRechargeManager();
                        Room room5 = this.f9165s;
                        if (room5 == null) {
                            C89219l.m154710a("mRoom");
                        }
                        long id3 = room5.getId();
                        Room room6 = this.f9165s;
                        if (room6 == null) {
                            C89219l.m154710a("mRoom");
                        }
                        firstRechargeManager.mo15002a(id3, room6.getOwnerUserId());
                        IGiftService iGiftService = (IGiftService) C6193a.m13435a(IGiftService.class);
                        AbstractC8807b bVar = this.f9164r;
                        Room room7 = this.f9165s;
                        if (room7 == null) {
                            C89219l.m154710a("mRoom");
                        }
                        iGiftService.syncGiftList(bVar, room7.getId(), 2, true);
                    } else {
                        Room room8 = this.f9165s;
                        if (room8 == null) {
                            C89219l.m154710a("mRoom");
                        }
                        RoomAuthStatus roomAuthStatus = room8.getRoomAuthStatus();
                        if (roomAuthStatus != null) {
                            bool = Boolean.valueOf(roomAuthStatus.enableGift);
                        } else {
                            bool = null;
                        }
                        if (C11279p.m20012a(bool)) {
                            AbstractC2953a a3 = C6193a.m13435a(IGiftService.class);
                            C89219l.m154716b(a3, "");
                            AbstractC8783b firstRechargeManager2 = ((IGiftService) a3).getFirstRechargeManager();
                            Room room9 = this.f9165s;
                            if (room9 == null) {
                                C89219l.m154710a("mRoom");
                            }
                            long id4 = room9.getId();
                            Room room10 = this.f9165s;
                            if (room10 == null) {
                                C89219l.m154710a("mRoom");
                            }
                            firstRechargeManager2.mo15002a(id4, room10.getOwnerUserId());
                            IGiftService iGiftService2 = (IGiftService) C6193a.m13435a(IGiftService.class);
                            Room room11 = this.f9165s;
                            if (room11 == null) {
                                C89219l.m154710a("mRoom");
                            }
                            iGiftService2.clearFastGift(room11.getId());
                            IGiftService iGiftService3 = (IGiftService) C6193a.m13435a(IGiftService.class);
                            AbstractC8807b bVar2 = this.f9164r;
                            Room room12 = this.f9165s;
                            if (room12 == null) {
                                C89219l.m154710a("mRoom");
                            }
                            iGiftService3.syncGiftList(bVar2, room12.getId(), 2, true);
                        }
                    }
                    C3047a.m8356a("live_page_load", String.valueOf(System.currentTimeMillis()));
                    AbstractC3153b bVar3 = this.f9151d;
                    if (bVar3 == null) {
                        C89219l.m154710a("mStrategy");
                    }
                    bVar3.mo8447c();
                    if (Build.VERSION.SDK_INT >= 26) {
                        ActivityC0945e activity2 = getActivity();
                        if (activity2 != null) {
                            Context context = getContext();
                            if (context != null) {
                                C89219l.m154716b(context, "");
                                intent = m8608a(context);
                            }
                            activity2.startForegroundService(intent);
                            return;
                        }
                        return;
                    }
                    ActivityC0945e activity3 = getActivity();
                    if (activity3 != null) {
                        Context context2 = getContext();
                        if (context2 != null) {
                            C89219l.m154716b(context2, "");
                            intent = m8608a(context2);
                        }
                        activity3.startService(intent);
                        return;
                    }
                    return;
                }
            }
            ActivityC0945e activity4 = getActivity();
            if (activity4 != null) {
                activity4.finish();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        AbstractC3153b bVar;
        DataChannelGlobal.f42558d.mo28322a(this, this, C9103do.class, new C3170h(this));
        C6560m.f16387j = true;
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        C1175ad a = C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null);
        C89219l.m154716b(a, "");
        this.f9159m = DataChannel.C17840a.m33044a(a, this).mo28311a(C9021ao.class, getChildFragmentManager());
        super.onCreate(bundle);
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (!Room.isValid(room) || room == null || room.getStreamUrl() == null) {
            this.f9158l = true;
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        this.f9165s = room;
        if (room == null) {
            C89219l.m154710a("mRoom");
        }
        if (room.isScreenshot) {
            Room room2 = this.f9165s;
            if (room2 == null) {
                C89219l.m154710a("mRoom");
            }
            DataChannel dataChannel = this.f9159m;
            if (dataChannel == null) {
                C89219l.m154710a("dataChannel");
            }
            bVar = new C3126j(room2, this, dataChannel);
        } else {
            Room room3 = this.f9165s;
            if (room3 == null) {
                C89219l.m154710a("mRoom");
            }
            DataChannel dataChannel2 = this.f9159m;
            if (dataChannel2 == null) {
                C89219l.m154710a("dataChannel");
            }
            bVar = new C3155b(room3, this, dataChannel2);
        }
        this.f9151d = bVar;
        bVar.mo8440a();
        C6529h.C6530a aVar = new C6529h.C6530a();
        Room room4 = this.f9165s;
        if (room4 == null) {
            C89219l.m154710a("mRoom");
        }
        aVar.f16316b = room4;
        aVar.f16315a = "live_take_detail";
        C6529h a2 = aVar.mo12676a();
        DataChannelGlobal.f42558d.mo28321a(C6532j.class, a2);
        DataChannel dataChannel3 = this.f9159m;
        if (dataChannel3 == null) {
            C89219l.m154710a("dataChannel");
        }
        dataChannel3.mo28311a(C6531i.class, a2);
        C11117b.m19749a(getActivity());
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C7400q.class).mo143271a(C11195i.m19838a(this, EnumC11186b.DESTROY)).mo143274a(C11152e.m19789a((Fragment) this))).mo17949a(new C3171i(this));
        C6497a a3 = C3051c.C3052a.m8359a("ttlive_enter_obs_broadcast_all");
        a3.f16147c = true;
        a3.mo12632a();
        HashMap hashMap = new HashMap();
        Room room5 = this.f9165s;
        if (room5 == null) {
            C89219l.m154710a("mRoom");
        }
        hashMap.put("anchor_id", String.valueOf(room5.getOwnerUserId()));
        Room room6 = this.f9165s;
        if (room6 == null) {
            C89219l.m154710a("mRoom");
        }
        hashMap.put("room_id", String.valueOf(room6.getId()));
        DataChannelGlobal.f42558d.mo28321a(C9097di.class, hashMap);
        DataChannelGlobal.f42558d.mo28325b(C9141w.class, Long.valueOf(System.currentTimeMillis()));
    }

    public final void onEvent(C7400q qVar) {
        String str;
        int intValue;
        C89219l.m154721d(qVar, "");
        int i = qVar.f18334a;
        if (i != 6) {
            if (i == 7) {
                AbstractC6571a aVar = qVar.f18337d;
                if (aVar instanceof C9883n) {
                    C9883n nVar = (C9883n) aVar;
                    if (nVar.f23882a == 4) {
                        C9883n.C9884a aVar2 = nVar.f23884g;
                        if (aVar2 != null) {
                            this.f9153g = aVar2.f23885a;
                            this.f9154h = C7557c.m15538a(aVar2.f23887c, "");
                            this.f9155i = C7557c.m15538a(aVar2.f23888d, "");
                            this.f9156j = C7557c.m15538a(aVar2.f23889e, "");
                        }
                        m8611b(true);
                        C3221b.m8716b(10003, m8615q(), m8616r(), this.f9162p);
                        m8610a(1, PrivacyCert.Builder.Companion.with("bpea-579").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                        C3854a.m9453a(3, "BgBroadcastFragment", "room close LiveEvent.ACTION_SHOW_LIVE_END_DIALOG");
                        return;
                    }
                }
                m8611b(false);
                C3221b.m8716b(qVar.f18335b, m8615q(), m8616r(), this.f9162p);
                m8610a(1, PrivacyCert.Builder.Companion.with("bpea-579").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                C3854a.m9453a(3, "BgBroadcastFragment", "room close LiveEvent.ACTION_SHOW_LIVE_END_DIALOG");
                return;
            } else if (i != 8) {
                if (i == 17) {
                    mo8498a(PrivacyCert.Builder.Companion.with("bpea-802").usage("").tag("bg broadacst close live immediately").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                    return;
                }
                return;
            }
        }
        C6501b a = C6501b.C6502a.m13948a("anchor_close_live_popup");
        DataChannel dataChannel = this.f9159m;
        if (dataChannel == null) {
            C89219l.m154710a("dataChannel");
        }
        a.mo12643a(dataChannel).mo12651a("live_type", C11729j.m20684a(EnumC11728i.THIRD_PARTY)).mo12655b();
        if (getContext() != null) {
            Context context = getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            DataChannel dataChannel2 = this.f9159m;
            if (dataChannel2 == null) {
                C89219l.m154710a("dataChannel");
            }
            if (!C3723e.m9233a(context, dataChannel2, new C3166d(this), new C3167e(this))) {
                DataChannel dataChannel3 = this.f9159m;
                if (dataChannel3 == null) {
                    C89219l.m154710a("dataChannel");
                }
                Integer num = (Integer) dataChannel3.mo28318b(C10341e.class);
                if (num == null || (intValue = num.intValue()) <= 0) {
                    str = C3966y.m9657a((int) R.string.dus);
                } else {
                    str = getResources().getQuantityString(R.plurals.ff, intValue, Integer.valueOf(intValue));
                }
                DialogC9148b.C9149a aVar3 = new DialogC9148b.C9149a(getContext());
                aVar3.f22245b = str;
                aVar3.mo15244a(R.string.duu, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3168f(this), false).mo15249b(R.string.dut, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3169g(this), false).mo15247a().show();
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.p197f.C3229a.AbstractC3230a
    /* renamed from: a */
    public final void mo8499a(CharSequence charSequence) {
        if (!this.mStatusDestroyed) {
            m8613k().mo14212a(charSequence);
        }
    }

    @Override // com.bytedance.android.live.broadcast.p197f.C3229a.AbstractC3230a
    /* renamed from: a */
    public final void mo8500a(boolean z) {
        DialogC7913do doVar;
        if (this.mStatusDestroyed || (doVar = this.f9167u) == null) {
            return;
        }
        if (z) {
            doVar.setCancelable(false);
            doVar.show();
            doVar.mo14211a(new View$OnClickListenerC3176n(doVar, this, z));
            doVar.f19680a = new C3177o(doVar);
            doVar.f19681b = new C3178p(doVar);
            C3051c.C3052a.m8359a("ttlive_illegal_dialog_show").mo12633b("pc_broadcast").mo12632a();
            return;
        }
        doVar.dismiss();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c$g */
    public static final class DialogInterface$OnClickListenerC3169g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3161c f9174a;

        static {
            Covode.recordClassIndex(3650);
        }

        DialogInterface$OnClickListenerC3169g(C3161c cVar) {
            this.f9174a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f9174a.mo8506e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c$f */
    public static final class DialogInterface$OnClickListenerC3168f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3161c f9173a;

        static {
            Covode.recordClassIndex(3649);
        }

        DialogInterface$OnClickListenerC3168f(C3161c cVar) {
            this.f9173a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f9173a.mo8498a(PrivacyCert.Builder.Companion.with("bpea-581").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (!this.f9158l) {
            Room room = this.f9165s;
            if (room == null) {
                C89219l.m154710a("mRoom");
            }
            C3726f.C3727a.m9235a(room);
            AbstractC3153b bVar = this.f9151d;
            if (bVar == null) {
                C89219l.m154710a("mStrategy");
            }
            bVar.mo8448d();
        }
    }

    /* renamed from: a */
    private final void m8610a(int i, PrivacyCert privacyCert) {
        StatusApi c = C3719d.C3720a.m9229a().mo9041c();
        Room room = this.f9165s;
        if (room == null) {
            C89219l.m154710a("mRoom");
        }
        long id = room.getId();
        Room room2 = this.f9165s;
        if (room2 == null) {
            C89219l.m154710a("mRoom");
        }
        c.sendStatus(id, 4, room2.getStreamId(), i).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(C3174l.f9179a, C3175m.f9180a);
        AbstractBinderC11605a aVar = this.f9150c;
        if (aVar != null) {
            aVar.stopStream(i, privacyCert);
        }
        C3229a aVar2 = this.f9152e;
        if (aVar2 != null) {
            aVar2.mo8578c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!this.f9158l) {
            AbstractC3153b bVar = this.f9151d;
            if (bVar == null) {
                C89219l.m154710a("mStrategy");
            }
            bVar.mo8441a(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        if (this.f9158l) {
            return null;
        }
        AbstractC3153b bVar = this.f9151d;
        if (bVar == null) {
            C89219l.m154710a("mStrategy");
        }
        return C1764a.m5927a(layoutInflater, bVar.mo8446b(), viewGroup, false);
    }

    @Override // com.bytedance.android.live.broadcast.api.p186d.AbstractC3057b
    public final void onStreamEnd(int i, int i2, String str) {
        String str2 = str;
        if (str2 == null) {
            str2 = "";
        }
        C3221b.m8714a(i, i2, str2, m8615q(), m8616r(), this.f9162p);
    }
}
