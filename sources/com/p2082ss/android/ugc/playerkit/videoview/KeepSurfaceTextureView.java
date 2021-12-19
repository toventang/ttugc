package com.p2082ss.android.ugc.playerkit.videoview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.feed.p2956m.C49739a;
import com.p2082ss.android.ugc.aweme.feed.p2956m.C49740b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63054o;
import com.p2082ss.android.ugc.aweme.player.sdk.util.SurfaceWrapper;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView */
public class KeepSurfaceTextureView extends TextureView {

    /* renamed from: a */
    private boolean f188397a;

    /* renamed from: c */
    public SurfaceTexture f188398c;

    /* renamed from: d */
    public SurfaceWrapper f188399d;

    /* renamed from: e */
    public boolean f188400e;

    /* renamed from: f */
    public TextureView.SurfaceTextureListener f188401f;

    static {
        Covode.recordClassIndex(98154);
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public Surface getSurface() {
        return this.f188399d;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f188397a = true;
    }

    /* renamed from: h */
    public static boolean m144852h() {
        if (Build.VERSION.SDK_INT > 19 || !C84199c.f187979a.shouldForceToKeepSurfaceBelowKITKAT()) {
            return false;
        }
        return true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (m144852h()) {
            mo129248a(true);
        }
        this.f188397a = false;
    }

    /* renamed from: g */
    public final void mo129249g() {
        SurfaceWrapper surfaceWrapper;
        if (this.f188398c == null || (surfaceWrapper = this.f188399d) == null || !surfaceWrapper.isValid()) {
            mo129248a(!m144852h());
        } else if (this.f188400e) {
        } else {
            if (this.f188398c != getSurfaceTexture()) {
                setSurfaceTexture(this.f188398c);
                this.f188400e = true;
                TextureView.SurfaceTextureListener surfaceTextureListener = this.f188401f;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureAvailable(this.f188398c, getWidth(), getHeight());
                    return;
                }
                return;
            }
            mo129248a(!m144852h());
        }
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f188401f = surfaceTextureListener;
    }

    public KeepSurfaceTextureView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0 && this.f188397a) {
            mo129249g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo129248a(boolean z) {
        SurfaceWrapper surfaceWrapper;
        AbstractC63054o oVar;
        SurfaceTexture surfaceTexture = this.f188398c;
        if (surfaceTexture != null && z) {
            surfaceTexture.release();
            this.f188398c = null;
        }
        if (!(C84199c.f187979a == null || !C84199c.f187979a.isEnableSurfaceLifeCycleNotification() || (surfaceWrapper = this.f188399d) == null || surfaceWrapper.f143377a == null || (oVar = this.f188399d.f143377a.get()) == null)) {
            oVar.mo101118b(this.f188399d);
        }
        SurfaceWrapper surfaceWrapper2 = this.f188399d;
        if (surfaceWrapper2 != null) {
            surfaceWrapper2.release();
            this.f188399d = null;
        }
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            try {
                if (C49740b.f114471a == null) {
                    C49740b.f114471a = Boolean.valueOf(SettingsManager.m29616a().mo25400a("video_textureView_monitor", true));
                }
                Boolean bool = C49740b.f114471a;
                if (bool == null) {
                    C89219l.m154715b();
                }
                if (bool.booleanValue() && C49739a.f114466a > 0 && C49739a.f114467b > 0 && layoutParams.height > 0) {
                    if (layoutParams.width > 0) {
                        if (!(C49739a.f114466a == layoutParams.width && C49739a.f114467b == layoutParams.height)) {
                            String stackTraceString = Log.getStackTraceString(new Throwable());
                            C89219l.m154716b(stackTraceString, "");
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("VideoTextureViewMonitor>>>pageWidth:" + C49739a.f114466a + " , pageHeight:" + C49739a.f114467b + ",  pageWidth:" + C49739a.f114466a + ", pageHeight:" + C49739a.f114467b + " , videoWidth:" + C49739a.f114468c + ", videoHeight:" + C49739a.f114469d + ' ' + "\n");
                            int i = 0;
                            for (Object obj : C89361p.m154921c(stackTraceString, new String[]{"\n"})) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    C89070n.m154520a();
                                }
                                String str = (String) obj;
                                if (i < 15) {
                                    stringBuffer.append(str + "\n");
                                }
                                i = i2;
                            }
                            C51423a.m95791b(6, "VideoTextureViewMonitor", stringBuffer.toString());
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public KeepSurfaceTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KeepSurfaceTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(9504);
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* class com.p2082ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView.TextureView$SurfaceTextureListenerC842421 */

            static {
                Covode.recordClassIndex(98155);
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                KeepSurfaceTextureView.this.f188400e = false;
                if (KeepSurfaceTextureView.this.f188401f == null || !KeepSurfaceTextureView.this.f188401f.onSurfaceTextureDestroyed(surfaceTexture) || KeepSurfaceTextureView.m144852h()) {
                    return false;
                }
                KeepSurfaceTextureView.this.mo129248a(true);
                return true;
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (KeepSurfaceTextureView.this.f188401f != null) {
                    KeepSurfaceTextureView.this.f188401f.onSurfaceTextureUpdated(surfaceTexture);
                }
                if (C84199c.f187979a != null && C84199c.f187979a.isEnableSurfaceLifeCycleNotification() && KeepSurfaceTextureView.this.f188399d != null && KeepSurfaceTextureView.this.f188399d.f143377a != null) {
                    KeepSurfaceTextureView.this.f188399d.f143377a.get();
                }
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (KeepSurfaceTextureView.this.f188401f != null) {
                    KeepSurfaceTextureView.this.f188401f.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (surfaceTexture != KeepSurfaceTextureView.this.f188398c) {
                    KeepSurfaceTextureView.this.mo129248a(true);
                }
                if (KeepSurfaceTextureView.this.f188398c == null) {
                    KeepSurfaceTextureView.this.f188398c = surfaceTexture;
                    KeepSurfaceTextureView.this.f188399d = new SurfaceWrapper(KeepSurfaceTextureView.this.f188398c);
                }
                KeepSurfaceTextureView.this.f188400e = true;
                if (KeepSurfaceTextureView.this.f188401f != null) {
                    KeepSurfaceTextureView.this.f188401f.onSurfaceTextureAvailable(KeepSurfaceTextureView.this.f188398c, i, i2);
                }
                if (C84199c.f187979a != null && C84199c.f187979a.isEnableSurfaceLifeCycleNotification() && KeepSurfaceTextureView.this.f188399d != null && KeepSurfaceTextureView.this.f188399d.f143377a != null) {
                    KeepSurfaceTextureView.this.f188399d.f143377a.get();
                }
            }
        });
        MethodCollector.m26664o(9504);
    }
}
