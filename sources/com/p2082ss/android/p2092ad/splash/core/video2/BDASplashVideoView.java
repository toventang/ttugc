package com.p2082ss.android.p2092ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.ss.android.ad.splash.core.video2.BDASplashVideoView */
public class BDASplashVideoView extends FrameLayout implements TextureView.SurfaceTextureListener, AbstractC29622h {

    /* renamed from: a */
    private C29616e f70561a;

    /* renamed from: b */
    private AbstractC29623i f70562b;

    static {
        Covode.recordClassIndex(35984);
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29622h
    /* renamed from: a */
    public final void mo51845a() {
        C29616e eVar = this.f70561a;
        if (eVar != null) {
            eVar.mo51897a();
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29622h
    public Surface getSurface() {
        C29616e eVar = this.f70561a;
        if (eVar != null) {
            return eVar.getSurface();
        }
        return null;
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29622h
    public Context getApplicationContext() {
        Context applicationContext = getContext().getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29622h
    public void setVideoViewCallback(AbstractC29623i iVar) {
        this.f70562b = iVar;
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29622h
    public void setSurfaceLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            this.f70561a.setLayoutParams(layoutParams);
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29622h
    public void setSurfaceViewVisibility(int i) {
        C29616e eVar = this.f70561a;
        if (eVar != null) {
            eVar.setVisibility(i);
        }
    }

    public void setTextureViewOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f70561a.setOnTouchListener(onTouchListener);
    }

    public BDASplashVideoView(Context context) {
        super(context);
        MethodCollector.m26663i(11312);
        m59513a(context);
        MethodCollector.m26664o(11312);
    }

    /* renamed from: a */
    private void m59513a(Context context) {
        C29616e eVar = new C29616e(context);
        this.f70561a = eVar;
        eVar.setSurfaceTextureListener(this);
        addView(this.f70561a, new FrameLayout.LayoutParams(-1, -1));
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f70561a.setKeepScreenOn(false);
        AbstractC29623i iVar = this.f70562b;
        if (iVar != null) {
            iVar.mo51864b(surfaceTexture);
        }
        C29616e eVar = this.f70561a;
        if (!eVar.f70621b || !eVar.f70623d) {
            return true;
        }
        return false;
    }

    public BDASplashVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(11465);
        m59513a(context);
        MethodCollector.m26664o(11465);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f70561a.setKeepScreenOn(true);
        AbstractC29623i iVar = this.f70562b;
        if (iVar != null) {
            iVar.mo51858a(surfaceTexture);
        }
    }
}
