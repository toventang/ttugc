package com.bytedance.android.live.broadcast.widget;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.effect.IVideoEffectProcessor;

/* renamed from: com.bytedance.android.live.broadcast.widget.q */
final /* synthetic */ class C3798q implements IVideoEffectProcessor.FaceDetectListener {

    /* renamed from: a */
    private final VideoWidget2 f10532a;

    static {
        Covode.recordClassIndex(4324);
    }

    C3798q(VideoWidget2 videoWidget2) {
        this.f10532a = videoWidget2;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.FaceDetectListener
    public final void onFaceDetectResultCallback(int i) {
        VideoWidget2 videoWidget2 = this.f10532a;
        if (videoWidget2.f10448o && System.currentTimeMillis() - videoWidget2.f10449p > 100) {
            videoWidget2.f10449p = System.currentTimeMillis();
            videoWidget2.f10447n.removeMessages(101);
            Message obtain = Message.obtain();
            obtain.what = 101;
            obtain.obj = Integer.valueOf(i);
            videoWidget2.f10447n.sendMessage(obtain);
        }
    }
}
