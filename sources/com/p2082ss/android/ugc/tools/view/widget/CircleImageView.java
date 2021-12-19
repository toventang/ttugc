package com.p2082ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24250e;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;

/* renamed from: com.ss.android.ugc.tools.view.widget.CircleImageView */
public class CircleImageView extends SimpleDraweeView {

    /* renamed from: a */
    public volatile boolean f190068a = true;

    /* renamed from: b */
    private Paint f190069b = new Paint();

    /* renamed from: c */
    private Bitmap f190070c;

    /* renamed from: d */
    private Drawable f190071d;

    /* renamed from: e */
    private BitmapShader f190072e;

    /* renamed from: f */
    private Canvas f190073f;

    /* renamed from: g */
    private int f190074g;

    /* renamed from: h */
    private boolean f190075h = false;

    /* renamed from: i */
    private AbstractC24203d<AbstractC24457f> f190076i = new C24202c<AbstractC24457f>() {
        /* class com.p2082ss.android.ugc.tools.view.widget.CircleImageView.C849931 */

        static {
            Covode.recordClassIndex(99007);
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onFailure(String str, Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onRelease(String str) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* bridge */ /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            CircleImageView.this.f190068a = true;
        }
    };

    static {
        Covode.recordClassIndex(99006);
    }

    public AbstractC24203d<AbstractC24457f> getControllerListener() {
        return this.f190076i;
    }

    /* renamed from: a */
    public void mo112852a() {
        C24250e eVar = new C24250e();
        eVar.f57500b = true;
        ((C24246a) getHierarchy()).mo39959a(eVar);
        ((C24246a) getHierarchy()).mo39958a(C24229q.AbstractC24231b.f57458h);
        m146083b();
    }

    /* renamed from: b */
    private void m146083b() {
        Bitmap.Config config;
        MethodCollector.m26663i(10436);
        if (!this.f190075h) {
            MethodCollector.m26664o(10436);
            return;
        }
        Drawable drawable = getDrawable();
        this.f190071d = drawable;
        if (drawable == null) {
            MethodCollector.m26664o(10436);
        } else if (getWidth() <= 0 || getHeight() <= 0) {
            MethodCollector.m26664o(10436);
        } else {
            if (this.f190071d.getOpacity() != -1) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            int intrinsicWidth = this.f190071d.getIntrinsicWidth();
            int intrinsicHeight = this.f190071d.getIntrinsicHeight();
            if (intrinsicWidth <= 0) {
                intrinsicWidth = getWidth();
            }
            if (intrinsicHeight <= 0) {
                intrinsicHeight = getHeight();
            }
            Bitmap bitmap = this.f190070c;
            if (bitmap != null) {
                if (intrinsicWidth == bitmap.getWidth() && intrinsicHeight == this.f190070c.getHeight()) {
                    Canvas canvas = this.f190073f;
                    if (canvas != null) {
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    }
                    MethodCollector.m26664o(10436);
                    return;
                } else if (!this.f190070c.isRecycled()) {
                    this.f190070c.recycle();
                }
            }
            this.f190074g = intrinsicWidth / 2;
            this.f190070c = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
            Canvas canvas2 = new Canvas(this.f190070c);
            this.f190073f = canvas2;
            this.f190071d.setBounds(0, 0, canvas2.getWidth(), this.f190073f.getHeight());
            Bitmap bitmap2 = this.f190070c;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f190072e = new BitmapShader(bitmap2, tileMode, tileMode);
            this.f190069b.setAntiAlias(true);
            this.f190069b.setShader(this.f190072e);
            MethodCollector.m26664o(10436);
        }
    }

    @Override // com.facebook.drawee.view.C24262c
    public void setController(AbstractC24255a aVar) {
        if (this.f190075h) {
            this.f190068a = true;
            setImageDrawable(null);
        }
        super.setController(aVar);
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f190075h) {
            if (this.f190068a) {
                m146083b();
                this.f190068a = false;
            }
            Drawable drawable = this.f190071d;
            if (!(drawable == null || (canvas2 = this.f190073f) == null)) {
                drawable.draw(canvas2);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) this.f190074g, this.f190069b);
            return;
        }
        super.onDraw(canvas);
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo112852a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m146083b();
    }
}
