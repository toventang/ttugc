package com.bytedance.android.live.broadcast.api.p186d;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.SurfaceView;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.ILiveStream;
import com.p2082ss.avframework.livestreamv2.core.Client;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.livestreamv2.filter.IFilterManager;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.api.d.a */
public interface AbstractC3055a {

    /* renamed from: com.bytedance.android.live.broadcast.api.d.a$a */
    public static class C3056a {

        /* renamed from: a */
        public int f8891a;

        /* renamed from: b */
        private final int f8892b = 1;

        /* renamed from: c */
        private final int f8893c = 2;

        /* renamed from: d */
        private final int f8894d = 3;

        /* renamed from: e */
        private final int f8895e = 4;

        /* renamed from: f */
        private final int f8896f = 5;

        /* renamed from: g */
        private final int f8897g = 6;

        static {
            Covode.recordClassIndex(3534);
        }
    }

    static {
        Covode.recordClassIndex(3533);
    }

    /* renamed from: a */
    int mo8279a(float f);

    /* renamed from: a */
    Client mo8280a(LiveCore.InteractConfig interactConfig);

    /* renamed from: a */
    void mo8281a();

    /* renamed from: a */
    void mo8282a(int i, int i2, int i3, long j);

    /* renamed from: a */
    void mo8283a(int i, PrivacyCert privacyCert);

    /* renamed from: a */
    void mo8284a(Bitmap bitmap, PrivacyCert privacyCert);

    /* renamed from: a */
    void mo8285a(Bundle bundle, ILiveStream.CatchPicCallback catchPicCallback);

    /* renamed from: a */
    void mo8286a(Bundle bundle, ILiveStream.CatchVideoCallback catchVideoCallback);

    /* renamed from: a */
    void mo8287a(SurfaceView surfaceView);

    /* renamed from: a */
    void mo8288a(AbstractC3057b bVar);

    /* renamed from: a */
    void mo8289a(PrivacyCert privacyCert);

    /* renamed from: a */
    void mo8290a(ILiveStream.ILiveStreamErrorListener iLiveStreamErrorListener);

    /* renamed from: a */
    void mo8291a(ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener);

    /* renamed from: a */
    void mo8292a(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener);

    /* renamed from: a */
    void mo8293a(String str);

    /* renamed from: a */
    void mo8294a(List<String> list);

    /* renamed from: a */
    void mo8295a(boolean z, PrivacyCert privacyCert);

    /* renamed from: b */
    IFilterManager mo8296b();

    /* renamed from: b */
    void mo8297b(PrivacyCert privacyCert);

    /* renamed from: c */
    void mo8298c();

    /* renamed from: c */
    void mo8299c(PrivacyCert privacyCert);

    /* renamed from: d */
    int mo8300d();

    /* renamed from: d */
    void mo8301d(PrivacyCert privacyCert);

    /* renamed from: e */
    LiveCore mo8302e();

    /* renamed from: e */
    void mo8303e(PrivacyCert privacyCert);

    /* renamed from: f */
    void mo8304f(PrivacyCert privacyCert);

    /* renamed from: g */
    void mo8305g(PrivacyCert privacyCert);

    /* renamed from: h */
    void mo8306h(PrivacyCert privacyCert);

    /* renamed from: i */
    void mo8307i(PrivacyCert privacyCert);

    /* renamed from: j */
    void mo8308j(PrivacyCert privacyCert);

    /* renamed from: k */
    void mo8309k(PrivacyCert privacyCert);
}
