package com.p2082ss.android.ugc.aweme.base.p2379ui;

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
import com.facebook.imagepipeline.p1885j.AbstractC24457f;

/* renamed from: com.ss.android.ugc.aweme.base.ui.CircleImageView */
public class CircleImageView extends AnimatedImageView {

    /* renamed from: e */
    public volatile boolean f81867e = true;

    /* renamed from: f */
    public boolean f81868f = false;

    /* renamed from: g */
    private Paint f81869g = new Paint();

    /* renamed from: h */
    private Bitmap f81870h;

    /* renamed from: i */
    private Drawable f81871i;

    /* renamed from: j */
    private BitmapShader f81872j;

    /* renamed from: k */
    private Canvas f81873k;

    /* renamed from: l */
    private int f81874l;

    /* renamed from: m */
    private AbstractC24203d<AbstractC24457f> f81875m = new C24202c<AbstractC24457f>() {
        /* class com.p2082ss.android.ugc.aweme.base.p2379ui.CircleImageView.C346591 */

        static {
            Covode.recordClassIndex(41634);
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
            CircleImageView.this.f81867e = true;
        }
    };

    static {
        Covode.recordClassIndex(41633);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AnimatedImageView
    public AbstractC24203d<AbstractC24457f> getControllerListener() {
        return this.f81875m;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView, com.p2082ss.android.ugc.aweme.base.p2379ui.AnimatedImageView
    /* renamed from: a */
    public void mo61253a() {
        super.mo61253a();
        C24250e eVar = new C24250e();
        eVar.f57500b = true;
        ((C24246a) getHierarchy()).mo39959a(eVar);
        ((C24246a) getHierarchy()).mo39958a(C24229q.AbstractC24231b.f57458h);
        mo103511d();
    }

    /* renamed from: d */
    private void mo103511d() {
        Bitmap.Config config;
        MethodCollector.m26663i(12735);
        if (!this.f81868f) {
            MethodCollector.m26664o(12735);
            return;
        }
        Drawable drawable = getDrawable();
        this.f81871i = drawable;
        if (drawable == null) {
            MethodCollector.m26664o(12735);
        } else if (getWidth() <= 0 || getHeight() <= 0) {
            MethodCollector.m26664o(12735);
        } else {
            if (this.f81871i.getOpacity() != -1) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            int intrinsicWidth = this.f81871i.getIntrinsicWidth();
            int intrinsicHeight = this.f81871i.getIntrinsicHeight();
            if (intrinsicWidth <= 0) {
                intrinsicWidth = getWidth();
            }
            if (intrinsicHeight <= 0) {
                intrinsicHeight = getHeight();
            }
            Bitmap bitmap = this.f81870h;
            if (bitmap != null) {
                if (intrinsicWidth == bitmap.getWidth() && intrinsicHeight == this.f81870h.getHeight()) {
                    Canvas canvas = this.f81873k;
                    if (canvas != null) {
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    }
                    MethodCollector.m26664o(12735);
                    return;
                } else if (!this.f81870h.isRecycled()) {
                    this.f81870h.recycle();
                }
            }
            this.f81874l = intrinsicWidth / 2;
            this.f81870h = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
            Canvas canvas2 = new Canvas(this.f81870h);
            this.f81873k = canvas2;
            this.f81871i.setBounds(0, 0, canvas2.getWidth(), this.f81873k.getHeight());
            Bitmap bitmap2 = this.f81870h;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f81872j = new BitmapShader(bitmap2, tileMode, tileMode);
            this.f81869g.setAntiAlias(true);
            this.f81869g.setShader(this.f81872j);
            MethodCollector.m26664o(12735);
        }
    }

    @Override // com.facebook.drawee.view.C24262c
    public void setController(AbstractC24255a aVar) {
        if (this.f81868f) {
            this.f81867e = true;
            setImageDrawable(null);
        }
        super.setController(aVar);
    }

    public CircleImageView(Context context) {
        super(context);
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f81868f) {
            if (this.f81867e) {
                mo103511d();
                this.f81867e = false;
            }
            Drawable drawable = this.f81871i;
            if (!(drawable == null || (canvas2 = this.f81873k) == null)) {
                drawable.draw(canvas2);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) this.f81874l, this.f81869g);
            return;
        }
        super.onDraw(canvas);
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo103511d();
    }
}
