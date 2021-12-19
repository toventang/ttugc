package com.p2082ss.android.p2092ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ad.splash.core.video2.e */
public final class C29616e extends TextureView {

    /* renamed from: a */
    public TextureView.SurfaceTextureListener f70620a;

    /* renamed from: b */
    public boolean f70621b;

    /* renamed from: c */
    public boolean f70622c;

    /* renamed from: d */
    public boolean f70623d;

    /* renamed from: e */
    public boolean f70624e;

    /* renamed from: f */
    public Surface f70625f;

    /* renamed from: g */
    public SurfaceTexture f70626g;

    /* renamed from: h */
    private final String f70627h;

    /* renamed from: i */
    private Context f70628i;

    /* renamed from: j */
    private int f70629j;

    /* renamed from: k */
    private int f70630k;

    static {
        Covode.recordClassIndex(36012);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
    }

    public final Surface getSurface() {
        return this.f70625f;
    }

    /* renamed from: a */
    public final void mo51897a() {
        this.f70622c = false;
        this.f70623d = false;
        this.f70625f = null;
        this.f70626g = null;
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public final void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f70620a = surfaceTextureListener;
    }

    public C29616e(Context context) {
        this(context, (byte) 0);
    }

    private C29616e(Context context, byte b) {
        super(context, null);
        MethodCollector.m26663i(10242);
        this.f70627h = "TextureVideoView";
        this.f70621b = true;
        this.f70628i = context;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f70630k = displayMetrics.heightPixels;
        this.f70629j = displayMetrics.widthPixels;
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* class com.p2082ss.android.p2092ad.splash.core.video2.C29616e.TextureView$SurfaceTextureListenerC296171 */

            static {
                Covode.recordClassIndex(36013);
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (C29616e.this.f70620a != null) {
                    C29616e.this.f70620a.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                if (C29616e.this.f70621b && !C29616e.this.f70622c && C29616e.this.f70625f != null) {
                    C29616e.this.f70625f.release();
                    C29616e.this.f70625f = null;
                    C29616e.this.f70626g = null;
                }
                C29616e.this.f70624e = false;
                if (C29616e.this.f70620a == null || !C29616e.this.f70620a.onSurfaceTextureDestroyed(surfaceTexture)) {
                    return false;
                }
                C29616e.this.mo51897a();
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (C29616e.this.f70620a != null) {
                    C29616e.this.f70620a.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (C29616e.this.f70621b) {
                    C29616e.this.f70623d = true;
                    if (C29616e.this.f70625f != null && (!C29616e.this.f70622c || !C29616e.this.f70625f.isValid())) {
                        C29616e.this.f70625f.release();
                        C29616e.this.f70625f = null;
                        C29616e.this.f70626g = null;
                    }
                    if (C29616e.this.f70625f == null) {
                        C29616e.this.f70625f = new Surface(surfaceTexture);
                        C29616e.this.f70626g = surfaceTexture;
                    } else {
                        try {
                            int i3 = Build.VERSION.SDK_INT;
                            if (C29616e.this.f70626g != null) {
                                C29616e eVar = C29616e.this;
                                eVar.setSurfaceTexture(eVar.f70626g);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    C29616e.this.f70624e = true;
                    C29616e.this.f70622c = true;
                } else {
                    C29616e.this.f70625f = new Surface(surfaceTexture);
                    C29616e.this.f70626g = surfaceTexture;
                }
                if (C29616e.this.f70620a != null) {
                    C29616e.this.f70620a.onSurfaceTextureAvailable(C29616e.this.f70626g, i, i2);
                }
            }
        });
        MethodCollector.m26664o(10242);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
