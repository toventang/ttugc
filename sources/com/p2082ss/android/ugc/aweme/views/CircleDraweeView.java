package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.tools.utils.C84912r;

/* renamed from: com.ss.android.ugc.aweme.views.CircleDraweeView */
public class CircleDraweeView extends C81429a {

    /* renamed from: a */
    public static int f181793a = 1;

    /* renamed from: b */
    public static int f181794b;

    /* renamed from: c */
    public volatile boolean f181795c = true;

    /* renamed from: d */
    public boolean f181796d = false;

    /* renamed from: e */
    private float f181797e = C84912r.m145930a(getContext(), 6.0f);

    /* renamed from: f */
    private Paint f181798f = new Paint();

    /* renamed from: g */
    private Bitmap f181799g;

    /* renamed from: h */
    private Drawable f181800h;

    /* renamed from: i */
    private BitmapShader f181801i;

    /* renamed from: j */
    private Canvas f181802j;

    /* renamed from: k */
    private float f181803k = this.f181797e;

    /* renamed from: l */
    private RectF f181804l = new RectF();

    /* renamed from: m */
    private int f181805m = f181794b;

    /* renamed from: n */
    private AbstractC24203d<AbstractC24457f> f181806n = new C24202c<AbstractC24457f>() {
        /* class com.p2082ss.android.ugc.aweme.views.CircleDraweeView.C813931 */

        static {
            Covode.recordClassIndex(94740);
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
            CircleDraweeView.this.f181795c = true;
        }
    };

    @Override // com.facebook.drawee.view.C24262c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    static {
        Covode.recordClassIndex(94739);
    }

    /* renamed from: a */
    private void m141085a() {
        Bitmap.Config config;
        MethodCollector.m26663i(4949);
        if (!this.f181796d) {
            MethodCollector.m26664o(4949);
            return;
        }
        Drawable drawable = getDrawable();
        this.f181800h = drawable;
        if (drawable == null) {
            MethodCollector.m26664o(4949);
        } else if (getWidth() <= 0 || getHeight() <= 0) {
            MethodCollector.m26664o(4949);
        } else {
            if (this.f181800h.getOpacity() != -1) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            int intrinsicWidth = this.f181800h.getIntrinsicWidth();
            int intrinsicHeight = this.f181800h.getIntrinsicHeight();
            if (intrinsicWidth <= 0) {
                intrinsicWidth = getWidth();
            }
            if (intrinsicHeight <= 0) {
                intrinsicHeight = getHeight();
            }
            Bitmap bitmap = this.f181799g;
            if (bitmap != null) {
                if (intrinsicWidth == bitmap.getWidth() && intrinsicHeight == this.f181799g.getHeight()) {
                    Canvas canvas = this.f181802j;
                    if (canvas != null) {
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    }
                    MethodCollector.m26664o(4949);
                    return;
                } else if (!this.f181799g.isRecycled()) {
                    this.f181799g.recycle();
                }
            }
            this.f181799g = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
            Canvas canvas2 = new Canvas(this.f181799g);
            this.f181802j = canvas2;
            this.f181800h.setBounds(0, 0, canvas2.getWidth(), this.f181802j.getHeight());
            Bitmap bitmap2 = this.f181799g;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f181801i = new BitmapShader(bitmap2, tileMode, tileMode);
            this.f181798f.setAntiAlias(true);
            this.f181798f.setShader(this.f181801i);
            MethodCollector.m26664o(4949);
        }
    }

    public void setClipStyle(int i) {
        this.f181805m = i;
    }

    public void setRectFRadius(float f) {
        this.f181803k = f;
    }

    @Override // com.p2082ss.android.ugc.aweme.views.C81429a, com.facebook.drawee.view.C24262c
    public void setController(AbstractC24255a aVar) {
        if (this.f181796d) {
            this.f181795c = true;
            setImageDrawable(null);
        }
        super.setController(aVar);
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f181796d) {
            if (this.f181795c) {
                m141085a();
                this.f181795c = false;
            }
            Drawable drawable = this.f181800h;
            if (!(drawable == null || (canvas2 = this.f181802j) == null)) {
                drawable.draw(canvas2);
            }
            if (this.f181805m == f181794b) {
                double width = (double) getWidth();
                Double.isNaN(width);
                canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) (width / 2.0d), this.f181798f);
                return;
            }
            this.f181804l.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            RectF rectF = this.f181804l;
            float f = this.f181803k;
            canvas.drawRoundRect(rectF, f, f, this.f181798f);
            return;
        }
        super.onDraw(canvas);
    }

    public CircleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m141085a();
    }
}
