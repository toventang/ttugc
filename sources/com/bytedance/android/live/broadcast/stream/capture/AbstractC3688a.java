package com.bytedance.android.live.broadcast.stream.capture;

import com.bytedance.android.live.broadcast.stream.capture.C3693c;
import com.bytedance.android.live.effect.api.AbstractC4166c;
import com.bytedance.android.live.effect.api.p240a.AbstractC4153f;
import com.bytedance.android.live.effect.model.C4309a;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.effect.IVideoEffectProcessor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.stream.capture.a */
public abstract class AbstractC3688a implements AbstractC4166c {

    /* renamed from: a */
    protected List<IVideoEffectProcessor.FaceDetectListener> f10153a;

    /* renamed from: b */
    public AbstractC4153f f10154b;

    /* renamed from: c */
    protected AbstractC3697f f10155c;

    static {
        Covode.recordClassIndex(4201);
    }

    /* renamed from: a */
    public abstract void mo8961a();

    /* renamed from: a */
    public abstract void mo8962a(C3693c.AbstractC3694a aVar);

    @Override // com.bytedance.android.live.effect.api.AbstractC4166c
    /* renamed from: a */
    public abstract void mo8964a(C4309a aVar);

    /* renamed from: a */
    public abstract void mo8965a(PrivacyCert privacyCert);

    /* renamed from: a */
    public abstract void mo8967a(boolean z, PrivacyCert privacyCert);

    /* renamed from: b */
    public abstract void mo8968b();

    /* renamed from: b */
    public abstract void mo8969b(PrivacyCert privacyCert);

    /* renamed from: a */
    public final synchronized void mo8963a(AbstractC3697f fVar) {
        this.f10155c = fVar;
    }

    /* renamed from: b */
    public final synchronized void mo8970b(IVideoEffectProcessor.FaceDetectListener faceDetectListener) {
        List<IVideoEffectProcessor.FaceDetectListener> list = this.f10153a;
        if (list != null) {
            for (int size = list.size() - 1; size > 0; size--) {
                if (this.f10153a.get(size) == faceDetectListener) {
                    this.f10153a.remove(size);
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo8966a(IVideoEffectProcessor.FaceDetectListener faceDetectListener) {
        if (this.f10153a == null) {
            this.f10153a = new ArrayList();
        }
        this.f10153a.add(faceDetectListener);
    }
}
