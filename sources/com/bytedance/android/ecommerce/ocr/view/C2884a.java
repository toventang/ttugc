package com.bytedance.android.ecommerce.ocr.view;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.bytedance.android.ecommerce.ocr.p166a.AbstractC2869l;
import com.bytedance.android.ecommerce.ocr.p166a.C2846b;
import com.bytedance.android.ecommerce.ocr.p166a.C2857c;
import com.bytedance.android.ecommerce.ocr.p166a.C2860d;
import com.bytedance.android.ecommerce.ocr.p166a.C2862e;
import com.bytedance.android.ecommerce.ocr.p166a.C2864g;
import com.bytedance.android.ecommerce.ocr.p166a.C2865h;
import com.bytedance.android.ecommerce.ocr.p166a.C2866i;
import com.bytedance.android.ecommerce.ocr.p166a.C2867j;
import com.bytedance.android.ecommerce.ocr.p166a.C2871m;
import com.bytedance.android.ecommerce.p165k.C2840k;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.ecommerce.ocr.view.a */
public class C2884a extends ViewGroup {

    /* renamed from: A */
    private final Handler.Callback f8581A;

    /* renamed from: B */
    private AbstractC2896c f8582B;

    /* renamed from: a */
    public Handler f8583a;

    /* renamed from: b */
    public boolean f8584b;

    /* renamed from: c */
    public boolean f8585c;

    /* renamed from: d */
    public List<AbstractC2891a> f8586d = new ArrayList();

    /* renamed from: e */
    C2865h f8587e;

    /* renamed from: f */
    C2871m f8588f;

    /* renamed from: g */
    C2871m f8589g;

    /* renamed from: h */
    Rect f8590h;

    /* renamed from: i */
    public C2871m f8591i;

    /* renamed from: j */
    Rect f8592j = null;

    /* renamed from: k */
    Rect f8593k = null;

    /* renamed from: l */
    C2871m f8594l = null;

    /* renamed from: m */
    double f8595m = 0.1d;

    /* renamed from: n */
    public final AbstractC2891a f8596n;

    /* renamed from: o */
    private C2846b f8597o;

    /* renamed from: p */
    private WindowManager f8598p;

    /* renamed from: q */
    private SurfaceView f8599q;

    /* renamed from: r */
    private TextureView f8600r;

    /* renamed from: s */
    private C2897d f8601s;

    /* renamed from: t */
    private int f8602t = -1;

    /* renamed from: u */
    private C2860d f8603u = new C2860d();

    /* renamed from: v */
    private AbstractC2869l f8604v = null;

    /* renamed from: w */
    private boolean f8605w = false;

    /* renamed from: x */
    private C2857c.AbstractC2859b f8606x;

    /* renamed from: y */
    private Camera.Area f8607y;

    /* renamed from: z */
    private final SurfaceHolder.Callback f8608z = new SurfaceHolder.Callback() {
        /* class com.bytedance.android.ecommerce.ocr.view.C2884a.SurfaceHolder$CallbackC28862 */

        static {
            Covode.recordClassIndex(3315);
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (!Build.BRAND.equalsIgnoreCase("Meizu")) {
                C2884a.this.f8591i = null;
            }
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (surfaceHolder != null) {
                C2884a.this.f8591i = new C2871m(i2, i3);
                C2884a.this.mo7492b();
            }
        }
    };

    /* renamed from: com.bytedance.android.ecommerce.ocr.view.a$a */
    public interface AbstractC2891a {
        static {
            Covode.recordClassIndex(3320);
        }

        /* renamed from: a */
        void mo7477a();

        /* renamed from: a */
        void mo7478a(Exception exc);

        /* renamed from: b */
        void mo7479b();

        /* renamed from: c */
        void mo7480c();

        /* renamed from: d */
        void mo7481d();
    }

    static {
        Covode.recordClassIndex(3313);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo7486f() {
    }

    public C2846b getCameraInstance() {
        return this.f8597o;
    }

    public C2860d getCameraSettings() {
        return this.f8603u;
    }

    public Rect getFramingRect() {
        return this.f8592j;
    }

    public C2871m getFramingRectSize() {
        return this.f8594l;
    }

    public double getMarginFraction() {
        return this.f8595m;
    }

    public Rect getPreviewFramingRect() {
        return this.f8593k;
    }

    /* renamed from: h */
    private TextureView.SurfaceTextureListener m8180h() {
        return new TextureView.SurfaceTextureListener() {
            /* class com.bytedance.android.ecommerce.ocr.view.C2884a.TextureView$SurfaceTextureListenerC28851 */

            static {
                Covode.recordClassIndex(3314);
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                return false;
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C2884a.this.f8591i = new C2871m(i, i2);
                C2884a.this.mo7492b();
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo7494e() {
        if (this.f8597o != null) {
            return true;
        }
        return false;
    }

    private int getDisplayRotation() {
        return this.f8598p.getDefaultDisplay().getRotation();
    }

    /* renamed from: i */
    private boolean m8181i() {
        C2846b bVar = this.f8597o;
        if (bVar == null || bVar.f8468g) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo7495g() {
        if (!m8181i()) {
            this.f8597o.mo7439d();
        }
    }

    public AbstractC2869l getPreviewScalingStrategy() {
        AbstractC2869l lVar = this.f8604v;
        if (lVar != null) {
            return lVar;
        }
        if (this.f8600r != null) {
            return new C2864g();
        }
        return new C2866i();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.f8605w);
        return bundle;
    }

    /* renamed from: a */
    public final void mo7490a() {
        if (mo7494e() && getDisplayRotation() != this.f8602t) {
            mo7493d();
            mo7485c();
        }
    }

    /* renamed from: d */
    public final void mo7493d() {
        TextureView textureView;
        SurfaceView surfaceView;
        C2840k.m8119a();
        this.f8602t = -1;
        C2846b bVar = this.f8597o;
        if (bVar != null) {
            bVar.mo7440e();
            this.f8597o = null;
            this.f8585c = false;
        } else {
            this.f8583a.sendEmptyMessage(R.id.fk9);
        }
        if (this.f8591i == null && (surfaceView = this.f8599q) != null) {
            surfaceView.getHolder().removeCallback(this.f8608z);
        }
        if (this.f8591i == null && (textureView = this.f8600r) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f8588f = null;
        this.f8589g = null;
        this.f8593k = null;
        this.f8601s.mo7529a();
        this.f8596n.mo7480c();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        MethodCollector.m26663i(3186);
        super.onAttachedToWindow();
        if (this.f8584b) {
            TextureView textureView = new TextureView(getContext());
            this.f8600r = textureView;
            textureView.setSurfaceTextureListener(m8180h());
            addView(this.f8600r);
            MethodCollector.m26664o(3186);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.f8599q = surfaceView;
        surfaceView.getHolder().addCallback(this.f8608z);
        addView(this.f8599q);
        MethodCollector.m26664o(3186);
    }

    /* renamed from: b */
    public final void mo7492b() {
        float f;
        C2871m mVar = this.f8591i;
        if (mVar != null && this.f8589g != null && this.f8590h != null) {
            if (this.f8599q == null || !mVar.equals(new C2871m(this.f8590h.width(), this.f8590h.height()))) {
                TextureView textureView = this.f8600r;
                if (textureView != null && textureView.getSurfaceTexture() != null) {
                    if (this.f8589g != null) {
                        C2871m mVar2 = new C2871m(this.f8600r.getWidth(), this.f8600r.getHeight());
                        C2871m mVar3 = this.f8589g;
                        float f2 = ((float) mVar2.f8535a) / ((float) mVar2.f8536b);
                        float f3 = ((float) mVar3.f8535a) / ((float) mVar3.f8536b);
                        float f4 = 1.0f;
                        if (f2 < f3) {
                            f4 = f3 / f2;
                            f = 1.0f;
                        } else {
                            f = f2 / f3;
                        }
                        Matrix matrix = new Matrix();
                        matrix.setScale(f4, f);
                        matrix.postTranslate((((float) mVar2.f8535a) - (((float) mVar2.f8535a) * f4)) / 2.0f, (((float) mVar2.f8536b) - (((float) mVar2.f8536b) * f)) / 2.0f);
                        this.f8600r.setTransform(matrix);
                    }
                    m8179a(new C2862e(this.f8600r.getSurfaceTexture()));
                    return;
                }
                return;
            }
            m8179a(new C2862e(this.f8599q.getHolder()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0101, code lost:
        if (r2 != false) goto L_0x005b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7485c() {
        /*
        // Method dump skipped, instructions count: 261
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.ecommerce.ocr.view.C2884a.mo7485c():void");
    }

    public void setCameraSettings(C2860d dVar) {
        this.f8603u = dVar;
    }

    public void setFramingRectSize(C2871m mVar) {
        this.f8594l = mVar;
    }

    public void setPreviewScalingStrategy(AbstractC2869l lVar) {
        this.f8604v = lVar;
    }

    public void setUseTextureView(boolean z) {
        this.f8584b = z;
    }

    /* renamed from: a */
    public final void mo7491a(int i) {
        if (!m8181i()) {
            this.f8597o.mo7433a(i);
        }
    }

    public void setLightListener(C2857c.AbstractC2859b bVar) {
        C2846b bVar2 = this.f8597o;
        if (bVar2 != null) {
            bVar2.mo7434a(bVar);
        }
        this.f8606x = bVar;
    }

    public void setTorch(boolean z) {
        this.f8605w = z;
        C2846b bVar = this.f8597o;
        if (bVar != null) {
            bVar.mo7436a(z);
        }
    }

    public void setZoom(float f) {
        if (!m8181i()) {
            this.f8597o.mo7432a(f);
        }
    }

    /* renamed from: a */
    private void m8179a(C2862e eVar) {
        C2846b bVar;
        if (!this.f8585c && (bVar = this.f8597o) != null) {
            bVar.f8463b = eVar;
            this.f8597o.mo7438c();
            this.f8585c = true;
            mo7486f();
            this.f8596n.mo7479b();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    public void setMarginFraction(double d) {
        if (d < 0.5d) {
            this.f8595m = d;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    /* renamed from: a */
    private static Object m8178a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(3179);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(3179);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public C2884a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(3155);
        C28873 r3 = new Handler.Callback() {
            /* class com.bytedance.android.ecommerce.ocr.view.C2884a.C28873 */

            static {
                Covode.recordClassIndex(3316);
            }

            public final boolean handleMessage(Message message) {
                if (message.what == R.id.fkf) {
                    C2884a aVar = C2884a.this;
                    aVar.f8589g = (C2871m) message.obj;
                    if (aVar.f8588f == null) {
                        return true;
                    }
                    if (aVar.f8588f == null || aVar.f8589g == null || aVar.f8587e == null) {
                        aVar.f8593k = null;
                        aVar.f8592j = null;
                        aVar.f8590h = null;
                        throw new IllegalStateException("containerSize or previewSize is not set yet");
                    }
                    int i = aVar.f8589g.f8535a;
                    int i2 = aVar.f8589g.f8536b;
                    int i3 = aVar.f8588f.f8535a;
                    int i4 = aVar.f8588f.f8536b;
                    C2865h hVar = aVar.f8587e;
                    aVar.f8590h = hVar.f8529c.mo7458b(aVar.f8589g, hVar.f8527a);
                    Rect rect = new Rect(0, 0, i3, i4);
                    Rect rect2 = aVar.f8590h;
                    Rect rect3 = new Rect(rect);
                    rect3.intersect(rect2);
                    if (aVar.f8594l != null) {
                        rect3.inset(Math.max(0, (rect3.width() - aVar.f8594l.f8535a) / 2), Math.max(0, (rect3.height() - aVar.f8594l.f8536b) / 2));
                    } else {
                        double width = (double) rect3.width();
                        double d = aVar.f8595m;
                        Double.isNaN(width);
                        double d2 = width * d;
                        double height = (double) rect3.height();
                        double d3 = aVar.f8595m;
                        Double.isNaN(height);
                        int min = (int) Math.min(d2, height * d3);
                        rect3.inset(min, min);
                        if (rect3.height() > rect3.width()) {
                            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
                        }
                    }
                    aVar.f8592j = rect3;
                    Rect rect4 = new Rect(aVar.f8592j);
                    rect4.offset(-aVar.f8590h.left, -aVar.f8590h.top);
                    aVar.f8593k = new Rect((rect4.left * i) / aVar.f8590h.width(), (rect4.top * i2) / aVar.f8590h.height(), (rect4.right * i) / aVar.f8590h.width(), (rect4.bottom * i2) / aVar.f8590h.height());
                    if (aVar.f8593k.width() <= 0 || aVar.f8593k.height() <= 0) {
                        aVar.f8593k = null;
                        aVar.f8592j = null;
                    } else {
                        aVar.f8596n.mo7477a();
                    }
                    aVar.requestLayout();
                    aVar.mo7492b();
                    return true;
                }
                if (message.what == R.id.fk_) {
                    Exception exc = (Exception) message.obj;
                    if (C2884a.this.mo7494e()) {
                        C2884a.this.mo7493d();
                        C2884a.this.f8596n.mo7478a(exc);
                    }
                } else if (message.what == R.id.fk9) {
                    C2884a.this.f8596n.mo7481d();
                }
                return false;
            }
        };
        this.f8581A = r3;
        this.f8582B = new AbstractC2896c() {
            /* class com.bytedance.android.ecommerce.ocr.view.C2884a.C28884 */

            static {
                Covode.recordClassIndex(3317);
            }

            @Override // com.bytedance.android.ecommerce.ocr.view.AbstractC2896c
            /* renamed from: a */
            public final void mo7523a() {
                C2884a.this.f8583a.postDelayed(new Runnable() {
                    /* class com.bytedance.android.ecommerce.ocr.view.C2884a.C28884.RunnableC28891 */

                    static {
                        Covode.recordClassIndex(3318);
                    }

                    public final void run() {
                        C2884a.this.mo7490a();
                    }
                }, 250);
            }
        };
        this.f8596n = new AbstractC2891a() {
            /* class com.bytedance.android.ecommerce.ocr.view.C2884a.C28905 */

            static {
                Covode.recordClassIndex(3319);
            }

            @Override // com.bytedance.android.ecommerce.ocr.view.C2884a.AbstractC2891a
            /* renamed from: a */
            public final void mo7477a() {
                for (AbstractC2891a aVar : C2884a.this.f8586d) {
                    aVar.mo7477a();
                }
            }

            @Override // com.bytedance.android.ecommerce.ocr.view.C2884a.AbstractC2891a
            /* renamed from: b */
            public final void mo7479b() {
                for (AbstractC2891a aVar : C2884a.this.f8586d) {
                    aVar.mo7479b();
                }
            }

            @Override // com.bytedance.android.ecommerce.ocr.view.C2884a.AbstractC2891a
            /* renamed from: c */
            public final void mo7480c() {
                for (AbstractC2891a aVar : C2884a.this.f8586d) {
                    aVar.mo7480c();
                }
            }

            @Override // com.bytedance.android.ecommerce.ocr.view.C2884a.AbstractC2891a
            /* renamed from: d */
            public final void mo7481d() {
                for (AbstractC2891a aVar : C2884a.this.f8586d) {
                    aVar.mo7481d();
                }
            }

            @Override // com.bytedance.android.ecommerce.ocr.view.C2884a.AbstractC2891a
            /* renamed from: a */
            public final void mo7478a(Exception exc) {
                for (AbstractC2891a aVar : C2884a.this.f8586d) {
                    aVar.mo7478a(exc);
                }
            }
        };
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.auf, R.attr.aug, R.attr.aui, R.attr.aul});
        int dimension = (int) obtainStyledAttributes.getDimension(1, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f8594l = new C2871m(dimension, dimension2);
        }
        this.f8584b = obtainStyledAttributes.getBoolean(3, true);
        int integer = obtainStyledAttributes.getInteger(2, -1);
        if (integer == 1) {
            this.f8604v = new C2864g();
        } else if (integer == 2) {
            this.f8604v = new C2866i();
        } else if (integer == 3) {
            this.f8604v = new C2867j();
        }
        obtainStyledAttributes.recycle();
        this.f8598p = (WindowManager) m8178a(context, "window");
        this.f8583a = new Handler(r3);
        this.f8601s = new C2897d();
        MethodCollector.m26664o(3155);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C2871m mVar = new C2871m(i3 - i, i4 - i2);
        this.f8588f = mVar;
        C2846b bVar = this.f8597o;
        if (bVar != null && bVar.f8466e == null) {
            C2865h hVar = new C2865h(getDisplayRotation(), mVar);
            this.f8587e = hVar;
            hVar.f8529c = getPreviewScalingStrategy();
            C2846b bVar2 = this.f8597o;
            C2865h hVar2 = this.f8587e;
            bVar2.f8466e = hVar2;
            bVar2.f8464c.f8496f = hVar2;
            this.f8597o.mo7437b();
            boolean z2 = this.f8605w;
            if (z2) {
                this.f8597o.mo7436a(z2);
            }
        }
        SurfaceView surfaceView = this.f8599q;
        if (surfaceView != null) {
            Rect rect = this.f8590h;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
            } else {
                surfaceView.layout(rect.left, this.f8590h.top, this.f8590h.right, this.f8590h.bottom);
            }
        } else {
            TextureView textureView = this.f8600r;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
            }
        }
    }
}
