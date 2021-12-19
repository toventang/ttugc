package com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e;

import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58522a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58527b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.e.a */
public interface AbstractC58568a extends SurfaceTexture.OnFrameAvailableListener, GLSurfaceView.Renderer, TextureView$SurfaceTextureListenerC58540d.AbstractC58553m {

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.e.a$a */
    public interface AbstractC58569a {
        static {
            Covode.recordClassIndex(68864);
        }

        /* renamed from: a */
        void mo95902a();

        /* renamed from: a */
        void mo95903a(Surface surface);

        /* renamed from: b */
        int mo95904b();
    }

    static {
        Covode.recordClassIndex(68863);
    }

    /* renamed from: a */
    void mo16798a();

    /* renamed from: a */
    void mo16799a(float f, float f2, float f3, float f4);

    /* renamed from: a */
    void mo16800a(C58522a.C58524b bVar);

    /* renamed from: a */
    void mo16801a(AbstractC58569a aVar);

    /* renamed from: a */
    void mo16802a(List<C58527b> list);

    /* renamed from: b */
    void mo16803b();
}
