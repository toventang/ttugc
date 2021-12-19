package com.bytedance.android.live.broadcast.stream.capture;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a;
import com.bytedance.android.live.broadcast.stream.C3708f;
import com.bytedance.android.live.broadcast.stream.capture.C3693c;
import com.bytedance.android.live.effect.model.AbstractC4314d;
import com.bytedance.android.live.effect.model.C4309a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11263e;
import com.bytedance.android.livesdkapi.host.AbstractC11803e;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.effect.IVideoEffectProcessor;
import com.p2082ss.avframework.livestreamv2.ILiveStream;
import com.p2082ss.avframework.livestreamv2.filter.IFilterManager;
import javax.microedition.khronos.egl.EGLContext;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.stream.capture.b */
public final class C3691b extends AbstractC3688a implements ILiveStream.ILiveStreamErrorListener, ILiveStream.ILiveStreamInfoListener, ILiveStream.ITextureFrameAvailableListener, IFilterManager.EffectMsgListener, IFilterManager.FaceDetectListener {

    /* renamed from: d */
    public AbstractC3055a f10156d;

    /* renamed from: e */
    private AbstractC4314d f10157e;

    /* renamed from: f */
    private C3693c.AbstractC3694a f10158f;

    /* renamed from: g */
    private IFilterManager f10159g;

    /* renamed from: h */
    private boolean f10160h;

    /* renamed from: i */
    private int f10161i = AbstractC6804a.f17058i.mo13068b().intValue();

    static {
        Covode.recordClassIndex(4204);
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.AbstractC3688a
    /* renamed from: a */
    public final void mo8961a() {
        this.f10156d.mo8298c();
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.AbstractC3688a
    /* renamed from: b */
    public final void mo8968b() {
        this.f10156d.mo8301d(PrivacyCert.Builder.with("bpea-355").usage("").tag("start broadcast").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
        C3708f.m9212a("capture_video");
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.AbstractC3688a
    /* renamed from: a */
    public final void mo8962a(C3693c.AbstractC3694a aVar) {
        this.f10158f = aVar;
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.AbstractC3688a, com.bytedance.android.live.effect.api.AbstractC4166c
    /* renamed from: a */
    public final void mo8964a(C4309a aVar) {
        aVar.f11846a = this.f10157e;
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.AbstractC3688a
    /* renamed from: b */
    public final void mo8969b(PrivacyCert privacyCert) {
        if (!this.f10160h) {
            this.f10160h = true;
            this.f10156d.mo8308j(privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.AbstractC3688a
    /* renamed from: a */
    public final void mo8965a(PrivacyCert privacyCert) {
        this.f10155c = null;
        this.f10157e.mo9004b();
        this.f10156d.mo8303e(privacyCert);
        C3708f.m9212a("release_video");
        this.f10159g.setFaceDetectListener(null);
        this.f10159g.setEffectMsgListener(null);
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.FaceDetectListener
    public final void onFaceDetectResultCallback(int i) {
        if (this.f10153a != null) {
            for (int size = this.f10153a.size() - 1; size >= 0; size--) {
                ((IVideoEffectProcessor.FaceDetectListener) this.f10153a.get(size)).onFaceDetectResultCallback(i);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.stream.capture.AbstractC3688a
    /* renamed from: a */
    public final void mo8967a(boolean z, PrivacyCert privacyCert) {
        AbstractC2994b a;
        int videoCaptureDevice;
        if (z) {
            this.f10156d.mo8283a(this.f10161i, privacyCert);
            return;
        }
        if (!(this.f10156d.mo8302e() == null || this.f10156d.mo8302e().getBuilder() == null || (videoCaptureDevice = this.f10156d.mo8302e().getBuilder().getVideoCaptureDevice()) == 5)) {
            this.f10161i = videoCaptureDevice;
        }
        this.f10156d.mo8283a(5, privacyCert);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (b != null && (a = b.mo13147a()) != null && this.f10156d.mo8302e() != null && (a instanceof User)) {
            ((AbstractC11803e) C6193a.m13435a(AbstractC11803e.class)).mo18862a(a.getAvatarThumb(), new AbstractC11803e.AbstractC11805b() {
                /* class com.bytedance.android.live.broadcast.stream.capture.C3691b.C36921 */

                static {
                    Covode.recordClassIndex(4205);
                }

                @Override // com.bytedance.android.livesdkapi.host.AbstractC11803e.AbstractC11805b
                /* renamed from: a */
                public final void mo8986a(Bitmap bitmap) {
                    MethodCollector.m26663i(7270);
                    if (bitmap == null || bitmap.isRecycled()) {
                        MethodCollector.m26664o(7270);
                        return;
                    }
                    C89219l.m154721d(bitmap, "");
                    float f = 0.1f;
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    if (width < 100 || height < 100) {
                        f = 0.6f;
                    } else if (width < 200 || height < 200) {
                        f = 0.3f;
                    }
                    int round = Math.round(((float) width) * f);
                    int round2 = Math.round(((float) height) * f);
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, round, round2, false);
                    Bitmap createBitmap = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                    C11263e.m19955a(createScaledBitmap, createBitmap, 5);
                    createScaledBitmap.recycle();
                    if (createBitmap == null || createBitmap.isRecycled()) {
                        MethodCollector.m26664o(7270);
                        return;
                    }
                    C3691b.this.f10156d.mo8302e().setBackGroundPhotoPath(createBitmap);
                    MethodCollector.m26664o(7270);
                }
            });
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.ILiveStreamErrorListener
    public final void onError(int i, int i2, Exception exc) {
        C3693c.AbstractC3694a aVar = this.f10158f;
        if (aVar != null) {
            aVar.mo8838a(i, i2);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.ILiveStreamInfoListener
    public final void onInfo(int i, int i2, int i3) {
        if (i == 5) {
            this.f10160h = false;
        }
    }

    public C3691b(SurfaceView surfaceView, AbstractC3055a aVar, boolean z) {
        this.f10156d = aVar;
        aVar.mo8287a(surfaceView);
        this.f10156d.mo8292a((ILiveStream.ITextureFrameAvailableListener) this);
        this.f10156d.mo8290a((ILiveStream.ILiveStreamErrorListener) this);
        this.f10156d.mo8291a((ILiveStream.ILiveStreamInfoListener) this);
        IFilterManager b = this.f10156d.mo8296b();
        this.f10159g = b;
        b.enable(true);
        this.f10159g.setFaceDetectListener(this);
        this.f10159g.setEffectMsgListener(this);
        this.f10157e = new C3696e(this.f10159g);
        if (z) {
            mo8968b();
        }
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.EffectMsgListener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        C3693c.AbstractC3694a aVar;
        if (i == 2139095041 && (aVar = this.f10158f) != null) {
            aVar.mo8837a();
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener
    public final void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr) {
        if (this.f10155c != null) {
            this.f10155c.mo8669a(eGLContext, i, i2, i3, j);
        }
    }
}
