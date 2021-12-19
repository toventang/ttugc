package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.broadcast.api.C3059e;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a;
import com.bytedance.android.live.broadcast.api.p187e.AbstractC3062b;
import com.bytedance.android.live.broadcast.p195d.C3223d;
import com.bytedance.android.live.broadcast.p195d.C3224e;
import com.bytedance.android.live.broadcast.p195d.C3225f;
import com.bytedance.android.live.broadcast.stream.C3678c;
import com.bytedance.android.live.broadcast.stream.C3704d;
import com.bytedance.android.live.broadcast.stream.C3708f;
import com.bytedance.android.live.broadcast.stream.capture.AbstractC3697f;
import com.bytedance.android.live.broadcast.stream.capture.C3698g;
import com.bytedance.android.live.broadcast.utils.HandlerThreadC3714a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC7601b;
import com.bytedance.android.livesdk.livesetting.broadcast.AdmServerCfgSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.AdmTypeSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGuestLiveAudioCaptureSetting;
import com.bytedance.android.livesdk.model.C9593l;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.avframework.livestreamv2.core.Client;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.bytedance.android.live.broadcast.widget.a */
public final class C3779a extends GLSurfaceView implements AbstractC3062b, AbstractC3697f, C3698g.AbstractC3700a, AbstractC7601b {

    /* renamed from: a */
    C3698g f10473a;

    /* renamed from: b */
    HandlerThreadC3714a f10474b;

    /* renamed from: c */
    private final AbstractC3055a f10475c;

    /* renamed from: d */
    private boolean f10476d;

    /* renamed from: e */
    private EGLContext f10477e;

    static {
        Covode.recordClassIndex(4305);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC7600a
    /* renamed from: a */
    public final void mo9070a() {
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC7600a
    /* renamed from: a */
    public final void mo9071a(boolean z, PrivacyCert privacyCert) {
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10476d) {
            this.f10475c.mo8306h(PrivacyCert.Builder.with("bpea-566").usage("").tag("start link mic video capture").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
        this.f10475c.mo8289a(PrivacyCert.Builder.with("bpea-369").usage("").tag("link mic resume").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        this.f10475c.mo8301d(PrivacyCert.Builder.with("bpea-357").usage("").tag("link mic").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
        C3708f.m9212a("capture_video");
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f10475c.mo8307i(PrivacyCert.Builder.with("bpea-567").usage("").tag("stop link mic video capture").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        this.f10475c.mo8303e(PrivacyCert.Builder.with("bpea-440").usage("").tag("stop video capture when link mic ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
        C3708f.m9212a("release_video");
        this.f10475c.mo8297b(PrivacyCert.Builder.with("bpea-399").usage("").tag("link mic finish").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        this.f10475c.mo8299c(PrivacyCert.Builder.with("bpea-492").usage("").tag("release when link mic ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        super.onDetachedFromWindow();
    }

    public C3779a(Context context) {
        this(context, (byte) 0);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC7601b
    /* renamed from: a */
    public final Client mo9069a(LiveCore.InteractConfig interactConfig) {
        return this.f10475c.mo8280a(interactConfig);
    }

    @Override // com.bytedance.android.live.broadcast.api.p187e.AbstractC3062b
    public final void setOutputFormat(int i) {
        this.f10473a.mo9008a(i);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC7600a
    /* renamed from: c */
    public final void mo9074c(PrivacyCert privacyCert) {
        HandlerThreadC3714a aVar = this.f10474b;
        if (aVar != null) {
            aVar.quitSafely();
        }
        DataChannelGlobal.f42558d.mo28327c(C3059e.class);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC7600a
    /* renamed from: a_ */
    public final void mo9072a_(PrivacyCert privacyCert) {
        onPause();
        try {
            this.f10473a.f10166a.onPause();
            this.f10475c.mo8297b(privacyCert);
        } catch (NullPointerException e) {
            C3854a.m9455a(6, "LinkInRoomAudioView", e.getStackTrace());
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC7600a
    /* renamed from: b_ */
    public final void mo9073b_(PrivacyCert privacyCert) {
        onResume();
        try {
            this.f10473a.f10166a.onResume();
            this.f10475c.mo8289a(privacyCert);
        } catch (NullPointerException e) {
            C3854a.m9455a(6, "LinkInRoomAudioView", e.getStackTrace());
        }
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.C3698g.AbstractC3700a
    /* renamed from: a */
    public final void mo9017a(Surface surface) {
        String str;
        AbstractC2994b a;
        ImageModel avatarThumb;
        List<String> urls;
        HandlerThreadC3714a.C3716a aVar = new HandlerThreadC3714a.C3716a();
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (b == null || (a = b.mo13147a()) == null || (avatarThumb = a.getAvatarThumb()) == null || (urls = avatarThumb.getUrls()) == null || urls.isEmpty()) {
            str = "";
        } else {
            str = urls.get(0);
        }
        aVar.f10308a = str;
        aVar.f10310c = getHeight();
        aVar.f10309b = getWidth();
        HandlerThreadC3714a aVar2 = new HandlerThreadC3714a(surface, aVar);
        this.f10474b = aVar2;
        aVar2.start();
    }

    private C3779a(Context context, byte b) {
        super(context, null);
        MethodCollector.m26663i(7883);
        C3698g gVar = new C3698g(this);
        this.f10473a = gVar;
        gVar.f10167b = this;
        this.f10473a.mo9009a(this);
        Integer valueOf = Integer.valueOf(AdmTypeSetting.INSTANCE.getValue());
        C9593l a = C9593l.m17932a(valueOf.intValue(), AdmServerCfgSetting.INSTANCE.getValue());
        C3704d.C3705a aVar = new C3704d.C3705a(getContext());
        aVar.f10269v = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getProjectKey();
        aVar.f10237E = new C3224e();
        aVar.f10267t = new C3225f();
        aVar.f10238F = new C3223d();
        C3704d.C3705a a2 = aVar.mo9020a(240, 320);
        a2.f10256i = 320;
        a2.f10255h = 240;
        a2.f10264q = 4;
        a2.f10265r = 5;
        a2.f10266s = a;
        boolean z = true;
        if (LiveGuestLiveAudioCaptureSetting.INSTANCE.getValue()) {
            a2.f10247O = true;
        }
        C3704d a3 = a2.mo9021a();
        if (valueOf.intValue() != 1 && !LiveGuestLiveAudioCaptureSetting.INSTANCE.getValue()) {
            z = false;
        }
        this.f10476d = z;
        C3678c cVar = new C3678c(a3);
        this.f10475c = cVar;
        DataChannelGlobal.f42558d.mo28321a(C3059e.class, cVar);
        MethodCollector.m26664o(7883);
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.AbstractC3697f
    /* renamed from: a */
    public final void mo8669a(EGLContext eGLContext, int i, int i2, int i3, long j) {
        if (this.f10475c != null) {
            EGLContext eGLContext2 = this.f10477e;
            if (eGLContext2 != null && !eGLContext2.equals(eGLContext)) {
                C3854a.m9453a(5, C3780b.class.getSimpleName(), "eglContext changed");
            }
            this.f10477e = eGLContext;
            C3854a.m9453a(4, C3780b.class.getSimpleName(), "eglContext=" + eGLContext.hashCode());
            this.f10475c.mo8282a(i, i2, i3, j);
        }
    }
}
