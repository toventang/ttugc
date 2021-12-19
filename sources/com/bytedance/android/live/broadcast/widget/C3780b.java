package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import com.bytedance.android.live.broadcast.api.C3059e;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a;
import com.bytedance.android.live.broadcast.api.p187e.AbstractC3062b;
import com.bytedance.android.live.broadcast.stream.capture.AbstractC3697f;
import com.bytedance.android.live.broadcast.stream.capture.C3698g;
import com.bytedance.android.live.broadcast.utils.HandlerThreadC3718c;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC7601b;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.avframework.livestreamv2.core.Client;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Config;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.bytedance.android.live.broadcast.widget.b */
public class C3780b extends GLSurfaceView implements AbstractC3062b, AbstractC3697f, C3698g.AbstractC3700a, AbstractC7601b {

    /* renamed from: a */
    C3698g f10478a;

    /* renamed from: b */
    HandlerThreadC3718c f10479b;

    /* renamed from: c */
    private final AbstractC3055a f10480c;

    /* renamed from: d */
    private EGLContext f10481d;

    static {
        Covode.recordClassIndex(4306);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC7600a
    /* renamed from: a */
    public final void mo9070a() {
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC7600a
    /* renamed from: a */
    public final void mo9071a(boolean z, PrivacyCert privacyCert) {
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC7600a
    /* renamed from: a_ */
    public final void mo9072a_(PrivacyCert privacyCert) {
        onPause();
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC7600a
    /* renamed from: b_ */
    public final void mo9073b_(PrivacyCert privacyCert) {
        onResume();
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC7601b
    /* renamed from: a */
    public final Client mo9069a(LiveCore.InteractConfig interactConfig) {
        return this.f10480c.mo8280a(interactConfig);
    }

    @Override // com.bytedance.android.live.broadcast.api.p187e.AbstractC3062b
    public void setOutputFormat(int i) {
        this.f10478a.mo9008a(i);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC7600a
    /* renamed from: c */
    public final void mo9074c(PrivacyCert privacyCert) {
        HandlerThreadC3718c cVar = this.f10479b;
        if (cVar != null) {
            cVar.quitSafely();
        }
        DataChannelGlobal.f42558d.mo28327c(C3059e.class);
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.C3698g.AbstractC3700a
    /* renamed from: a */
    public final void mo9017a(Surface surface) {
        HandlerThreadC3718c cVar = new HandlerThreadC3718c(surface, Config.VideoQuality.GUEST_NORMAL.getWidth(), Config.VideoQuality.GUEST_NORMAL.getHeight());
        this.f10479b = cVar;
        cVar.start();
    }

    public C3780b(AbstractC3055a aVar, Context context) {
        this(aVar, context, (byte) 0);
    }

    private C3780b(AbstractC3055a aVar, Context context, byte b) {
        super(context, null);
        MethodCollector.m26663i(7553);
        this.f10480c = aVar;
        DataChannelGlobal.f42558d.mo28321a(C3059e.class, aVar);
        C3698g gVar = new C3698g(this);
        this.f10478a = gVar;
        gVar.f10167b = this;
        this.f10478a.mo9009a(this);
        MethodCollector.m26664o(7553);
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.AbstractC3697f
    /* renamed from: a */
    public final void mo8669a(EGLContext eGLContext, int i, int i2, int i3, long j) {
        if (this.f10480c != null) {
            EGLContext eGLContext2 = this.f10481d;
            if (eGLContext2 != null && !eGLContext2.equals(eGLContext)) {
                C3854a.m9453a(5, C3780b.class.getSimpleName(), "eglContext changed");
            }
            this.f10481d = eGLContext;
            C3854a.m9453a(4, C3780b.class.getSimpleName(), "eglContext=" + eGLContext.hashCode());
            this.f10480c.mo8282a(i, i2, i3, j);
        }
    }
}
