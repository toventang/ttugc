package com.p2082ss.android.ugc.playerkit.videoview;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.playerkit.videoview.f */
public final class C84289f implements AbstractC84293i {

    /* renamed from: a */
    public Set<AbstractC84295k> f188490a = new LinkedHashSet(1);

    /* renamed from: b */
    public boolean f188491b;

    /* renamed from: c */
    public SurfaceTexture f188492c;

    /* renamed from: d */
    private final KeepSurfaceTextureView f188493d;

    static {
        Covode.recordClassIndex(98204);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i
    /* renamed from: e */
    public final int mo129317e() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i
    /* renamed from: f */
    public final boolean mo129318f() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i
    /* renamed from: g */
    public final void mo129319g() {
        this.f188491b = true;
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i
    /* renamed from: h */
    public final void mo129320h() {
        this.f188491b = false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i
    /* renamed from: a */
    public final View mo129311a() {
        return this.f188493d;
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i
    /* renamed from: b */
    public final Surface mo129313b() {
        return this.f188493d.getSurface();
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i
    /* renamed from: c */
    public final boolean mo129315c() {
        return this.f188493d.f188400e;
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i
    /* renamed from: d */
    public final void mo129316d() {
        this.f188493d.mo129249g();
    }

    /* renamed from: i */
    private void m144957i() {
        this.f188493d.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* class com.p2082ss.android.ugc.playerkit.videoview.C84289f.TextureView$SurfaceTextureListenerC842901 */

            static {
                Covode.recordClassIndex(98205);
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                Iterator it = new ArrayList(C84289f.this.f188490a).iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                for (AbstractC84295k kVar : new ArrayList(C84289f.this.f188490a)) {
                    kVar.aJ_();
                }
                C84289f fVar = C84289f.this;
                if (!fVar.f188491b) {
                    surfaceTexture = null;
                }
                fVar.f188492c = surfaceTexture;
                if (!C84289f.this.f188491b) {
                    return true;
                }
                return false;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                for (AbstractC84295k kVar : new ArrayList(C84289f.this.f188490a)) {
                    kVar.mo60627b(i, i2);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                C84289f.this.f188491b = false;
                for (AbstractC84295k kVar : new ArrayList(C84289f.this.f188490a)) {
                    kVar.mo60625a(i, i2);
                }
            }
        });
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i
    /* renamed from: a */
    public final void mo129312a(AbstractC84295k kVar) {
        this.f188490a.add(kVar);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i
    /* renamed from: b */
    public final void mo129314b(AbstractC84295k kVar) {
        this.f188490a.remove(kVar);
    }

    public C84289f(KeepSurfaceTextureView keepSurfaceTextureView) {
        this.f188493d = keepSurfaceTextureView;
        m144957i();
    }

    public C84289f(ViewGroup viewGroup) {
        MethodCollector.m26663i(12050);
        KeepSurfaceTextureView keepSurfaceTextureView = new KeepSurfaceTextureView(viewGroup.getContext());
        this.f188493d = keepSurfaceTextureView;
        if (viewGroup instanceof FrameLayout) {
            viewGroup.addView(keepSurfaceTextureView, 0, new FrameLayout.LayoutParams(-1, -1, 17));
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            viewGroup.addView(keepSurfaceTextureView, 0, layoutParams);
        } else {
            viewGroup.addView(keepSurfaceTextureView, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        m144957i();
        MethodCollector.m26664o(12050);
    }
}
