package com.bytedance.android.live.broadcast.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.C2690b;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.p261b.C4415e;
import com.bytedance.android.live.liveinteract.api.p261b.C4417f;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p176b.AbstractC2932i;
import com.bytedance.android.live.p176b.C2927e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastLiveCenterUrl;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9047bm;
import com.bytedance.android.livesdk.p561j.C9048bn;
import com.bytedance.android.livesdk.p561j.C9049bo;
import com.bytedance.android.livesdk.p561j.C9051bq;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.EnumC9050bp;
import com.bytedance.android.livesdk.rank.api.p606a.C10332a;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.xbridge.model.p1339a.p1340a.C18738d;
import com.bytedance.ies.xbridge.p1301e.AbstractC18511d;
import com.bytedance.ies.xbridge.p1301e.C18484a;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.p1301e.C18502c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class LiveCenterContainerView extends FrameLayout implements AbstractC18511d {

    /* renamed from: e */
    public static final C3741a f10342e = new C3741a((byte) 0);

    /* renamed from: a */
    public final float f10343a;

    /* renamed from: b */
    public String f10344b;

    /* renamed from: c */
    public DataChannel f10345c;

    /* renamed from: d */
    public EnumC9050bp f10346d;

    /* renamed from: f */
    private long f10347f;

    /* renamed from: g */
    private final boolean f10348g;

    /* renamed from: h */
    private float f10349h;

    /* renamed from: i */
    private float f10350i;

    /* renamed from: j */
    private boolean f10351j;

    /* renamed from: k */
    private final AbstractC2932i f10352k;

    /* renamed from: l */
    private boolean f10353l;

    /* renamed from: m */
    private EnumC9050bp f10354m;

    /* renamed from: n */
    private final C88411a f10355n;

    /* renamed from: o */
    private GestureDetectLayout f10356o;

    /* renamed from: p */
    private HashMap f10357p;

    static {
        Covode.recordClassIndex(4256);
    }

    public LiveCenterContainerView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public LiveCenterContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: com.bytedance.android.live.broadcast.view.LiveCenterContainerView$a */
    public static final class C3741a {
        static {
            Covode.recordClassIndex(4258);
        }

        private C3741a() {
        }

        public /* synthetic */ C3741a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.view.LiveCenterContainerView$f */
    public static final class C3747f extends C2927e {
        static {
            Covode.recordClassIndex(4264);
        }

        C3747f() {
        }
    }

    public final DataChannel getDataChannel() {
        return this.f10345c;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10355n.mo142945a(C6779a.m14563a().mo13052a(C10332a.class).mo143289d(new C3748g(this)));
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10344b = null;
        C18494b.m34422b("anchor_center_request_room_info", this);
        C18494b.m34422b("live_anchor_center_mask_close", this);
        AbstractC2932i iVar = this.f10352k;
        if (iVar != null) {
            iVar.mo7669a();
        }
        this.f10355n.mo142944a();
    }

    /* renamed from: a */
    public final void mo9050a() {
        if (!this.f10353l) {
            this.f10353l = true;
            AbstractC2932i iVar = this.f10352k;
            if (iVar != null) {
                String value = BroadcastLiveCenterUrl.INSTANCE.getValue();
                if (this.f10357p == null) {
                    this.f10357p = new HashMap();
                }
                View view = (View) this.f10357p.get(Integer.valueOf((int) R.id.ca6));
                if (view == null) {
                    view = findViewById(R.id.ca6);
                    this.f10357p.put(Integer.valueOf((int) R.id.ca6), view);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                C89219l.m154716b(frameLayout, "");
                AbstractC2932i.C2934b.m8229a(iVar, "lynx", value, "", frameLayout, new C3747f());
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.view.LiveCenterContainerView$b */
    static final class C3742b extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LiveCenterContainerView f10359a;

        static {
            Covode.recordClassIndex(4259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3742b(LiveCenterContainerView liveCenterContainerView) {
            super(1);
            this.f10359a = liveCenterContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            LiveCenterContainerView.m9248a(this.f10359a, null, false, 3);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.view.LiveCenterContainerView$c */
    static final class C3743c extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LiveCenterContainerView f10360a;

        static {
            Covode.recordClassIndex(4260);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3743c(LiveCenterContainerView liveCenterContainerView) {
            super(1);
            this.f10360a = liveCenterContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            LiveCenterContainerView.m9250b(this.f10360a, null, false, 3);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.view.LiveCenterContainerView$g */
    static final class C3748g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ LiveCenterContainerView f10363a;

        static {
            Covode.recordClassIndex(4265);
        }

        C3748g(LiveCenterContainerView liveCenterContainerView) {
            this.f10363a = liveCenterContainerView;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (((C10332a) obj).f24988b == 1) {
                LiveCenterContainerView.m9250b(this.f10363a, null, false, 3);
            }
        }
    }

    private final void setStatus(EnumC9050bp bpVar) {
        this.f10346d = bpVar;
        DataChannel dataChannel = this.f10345c;
        if (dataChannel != null) {
            dataChannel.mo28315b(C9051bq.class, bpVar);
        }
    }

    public final void setGestureDetectLayout(GestureDetectLayout gestureDetectLayout) {
        this.f10356o = gestureDetectLayout;
        if (gestureDetectLayout != null) {
            gestureDetectLayout.mo18161a(new View$OnTouchListenerC3749h(this));
            gestureDetectLayout.f27181a.add(new View$OnTouchListenerC3750i(this));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.view.LiveCenterContainerView$e */
    static final class C3745e extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LiveCenterContainerView f10362a;

        static {
            Covode.recordClassIndex(4262);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3745e(LiveCenterContainerView liveCenterContainerView) {
            super(1);
            this.f10362a = liveCenterContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            if (C6204h.f15478a) {
                C37461 r1 = new AbstractC89171a<C89391z>(this.f10362a) {
                    /* class com.bytedance.android.live.broadcast.view.LiveCenterContainerView.C3745e.C37461 */

                    static {
                        Covode.recordClassIndex(4263);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        ((LiveCenterContainerView) this.receiver).mo9050a();
                        return C89391z.f203057a;
                    }
                };
                C89219l.m154721d(r1, "");
                C6204h.m13475a(null, new C6204h.RunnableC6206b(r1), 0, 8000);
            }
            return C89391z.f203057a;
        }
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.f10345c = dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28310a(C9049bo.class, (AbstractC89172b) new C3742b(this)).mo28310a(C9047bm.class, (AbstractC89172b) new C3743c(this)).mo28310a(C4417f.class, (AbstractC89172b) new C3744d(this)).mo28314b(C9048bn.class, (AbstractC89172b) new C3745e(this));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.view.LiveCenterContainerView$d */
    static final class C3744d extends AbstractC89220m implements AbstractC89172b<C4415e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LiveCenterContainerView f10361a;

        static {
            Covode.recordClassIndex(4261);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3744d(LiveCenterContainerView liveCenterContainerView) {
            super(1);
            this.f10361a = liveCenterContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C4415e eVar) {
            C4415e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            if (!C89219l.m154714a((Object) this.f10361a.f10344b, (Object) eVar2.f12015a)) {
                if (C89219l.m154714a((Object) eVar2.f12015a, (Object) C4415e.f12009f)) {
                    LiveCenterContainerView.m9250b(this.f10361a, null, false, 3);
                } else if (C89219l.m154714a((Object) eVar2.f12015a, (Object) C4415e.f12007d) && (!C89219l.m154714a((Object) this.f10361a.f10344b, (Object) C4415e.f12009f))) {
                    LiveCenterContainerView.m9250b(this.f10361a, null, false, 3);
                }
                this.f10361a.f10344b = eVar2.f12015a;
            }
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (r1 != 3) goto L_0x0013;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9051a(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 235
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.view.LiveCenterContainerView.mo9051a(android.view.MotionEvent):void");
    }

    @Override // com.bytedance.ies.xbridge.p1301e.AbstractC18511d
    /* renamed from: a */
    public final void mo8791a(C18502c cVar) {
        Room room;
        RoomAuthStatus roomAuthStatus;
        C89219l.m154721d(cVar, "");
        Boolean bool = null;
        if (C89219l.m154714a((Object) cVar.f44153a, (Object) "anchor_center_request_room_info")) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", String.valueOf(C6544e.m13995i()));
            DataChannel dataChannel = this.f10345c;
            if (!(dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null || (roomAuthStatus = room.getRoomAuthStatus()) == null)) {
                bool = Boolean.valueOf(roomAuthStatus.isEnableGift());
            }
            jSONObject.put("gift_permission", bool);
            C18494b.m34415a(new C18484a("anchor_center_response_room_info", currentTimeMillis, new C18738d(jSONObject)));
        } else if (C89219l.m154714a((Object) cVar.f44153a, (Object) "live_anchor_center_mask_close")) {
            m9250b(this, null, false, 3);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.view.LiveCenterContainerView$h */
    static final class View$OnTouchListenerC3749h implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ LiveCenterContainerView f10364a;

        static {
            Covode.recordClassIndex(4266);
        }

        View$OnTouchListenerC3749h(LiveCenterContainerView liveCenterContainerView) {
            this.f10364a = liveCenterContainerView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f10364a.mo9051a(motionEvent);
            return false;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.view.LiveCenterContainerView$i */
    static final class View$OnTouchListenerC3750i implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ LiveCenterContainerView f10365a;

        static {
            Covode.recordClassIndex(4267);
        }

        View$OnTouchListenerC3750i(LiveCenterContainerView liveCenterContainerView) {
            this.f10365a = liveCenterContainerView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f10365a.mo9051a(motionEvent);
            return false;
        }
    }

    /* renamed from: a */
    private final void m9249a(String str, boolean z) {
        if (this.f10346d != EnumC9050bp.SHOWING) {
            if (C6204h.f15478a) {
                mo9050a();
            }
            if (z) {
                ObjectAnimator.ofFloat(this, "translationX", 0.0f).setDuration(300L).start();
            } else {
                setTranslationX(0.0f);
            }
            setStatus(EnumC9050bp.SHOWING);
            this.f10347f = SystemClock.elapsedRealtime();
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", String.valueOf(C6544e.m13995i()));
            C18494b.m34415a(new C18484a("live_anchor_center_mask_will_appear", currentTimeMillis, new C18738d(jSONObject)));
            if (this.f10354m != EnumC9050bp.SHOWING) {
                C6501b.C6502a.m13948a("livesdk_live_center_show").mo12643a(this.f10345c).mo12651a("enter_type", str).mo12655b();
            }
            this.f10354m = EnumC9050bp.SHOWING;
        }
    }

    /* renamed from: b */
    private final void m9251b(String str, boolean z) {
        if (this.f10346d != EnumC9050bp.DISMISS) {
            if (z) {
                ObjectAnimator.ofFloat(this, "translationX", this.f10343a).setDuration(300L).start();
            } else {
                setTranslationX(this.f10343a);
            }
            setStatus(EnumC9050bp.DISMISS);
            if (this.f10354m != EnumC9050bp.DISMISS) {
                C6501b.C6502a.m13948a("livesdk_live_center_leave").mo12643a(this.f10345c).mo12651a("leave_type", str).mo12646a("duration", SystemClock.elapsedRealtime() - this.f10347f).mo12655b();
            }
            this.f10354m = EnumC9050bp.DISMISS;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ LiveCenterContainerView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LiveCenterContainerView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        int c;
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7018);
        boolean g = C3966y.m9672g();
        this.f10348g = g;
        if (g) {
            c = -C3966y.m9664c();
        } else {
            c = C3966y.m9664c();
        }
        this.f10343a = (float) c;
        AbstractC2953a a = C6193a.m13435a(AbstractC2928f.class);
        C89219l.m154716b(a, "");
        this.f10352k = ((AbstractC2928f) a).getHybridContainerManager();
        this.f10354m = EnumC9050bp.DISMISS;
        this.f10355n = new C88411a();
        addView(C2690b.m7784a(R.layout.be9, this));
        post(new Runnable(this) {
            /* class com.bytedance.android.live.broadcast.view.LiveCenterContainerView.RunnableC37401 */

            /* renamed from: a */
            final /* synthetic */ LiveCenterContainerView f10358a;

            static {
                Covode.recordClassIndex(4257);
            }

            {
                this.f10358a = r1;
            }

            public final void run() {
                LiveCenterContainerView liveCenterContainerView = this.f10358a;
                liveCenterContainerView.setTranslationX(liveCenterContainerView.f10343a);
                C11279p.m20017b(this.f10358a);
            }
        });
        C18494b.m34417a("anchor_center_request_room_info", this);
        C18494b.m34417a("live_anchor_center_mask_close", this);
        if (!C6204h.f15478a) {
            mo9050a();
        }
        this.f10346d = EnumC9050bp.DISMISS;
        MethodCollector.m26664o(7018);
    }

    /* renamed from: a */
    public static /* synthetic */ void m9248a(LiveCenterContainerView liveCenterContainerView, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            str = "click";
        }
        if ((i & 2) != 0) {
            z = true;
        }
        liveCenterContainerView.m9249a(str, z);
    }

    /* renamed from: b */
    public static /* synthetic */ void m9250b(LiveCenterContainerView liveCenterContainerView, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            str = "click";
        }
        if ((i & 2) != 0) {
            z = true;
        }
        liveCenterContainerView.m9251b(str, z);
    }
}
