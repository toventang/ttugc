package com.bytedance.lighten.loader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20765u;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20727d;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20734k;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24250e;
import com.facebook.drawee.p1857h.AbstractC24255a;

public class SmartCircleImageView extends SmartImageView {

    /* renamed from: a */
    public volatile boolean f49138a = true;

    /* renamed from: b */
    public boolean f49139b;

    /* renamed from: d */
    private Paint f49140d = new Paint();

    /* renamed from: e */
    private Bitmap f49141e;

    /* renamed from: f */
    private Drawable f49142f;

    /* renamed from: g */
    private Canvas f49143g;

    /* renamed from: h */
    private int f49144h;

    /* renamed from: i */
    private boolean f49145i;

    static {
        Covode.recordClassIndex(24346);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView
    /* renamed from: a */
    public void mo34192a() {
        super.mo34192a();
        C24250e eVar = ((C24246a) getHierarchy()).f57470a;
        if (eVar == null) {
            eVar = new C24250e();
        }
        eVar.f57500b = true;
        ((C24246a) getHierarchy()).mo39959a(eVar);
        ((C24246a) getHierarchy()).mo39958a(C24229q.AbstractC24231b.f57458h);
        m39085d();
    }

    /* renamed from: d */
    private void m39085d() {
        Bitmap.Config config;
        MethodCollector.m26663i(9549);
        if (!this.f49139b) {
            MethodCollector.m26664o(9549);
            return;
        }
        Drawable drawable = getDrawable();
        this.f49142f = drawable;
        if (drawable == null) {
            MethodCollector.m26664o(9549);
        } else if (getWidth() <= 0 || getHeight() <= 0) {
            MethodCollector.m26664o(9549);
        } else {
            if (this.f49142f.getOpacity() != -1) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            int intrinsicWidth = this.f49142f.getIntrinsicWidth();
            int intrinsicHeight = this.f49142f.getIntrinsicHeight();
            if (intrinsicWidth <= 0) {
                intrinsicWidth = getWidth();
            }
            if (intrinsicHeight <= 0) {
                intrinsicHeight = getHeight();
            }
            Bitmap bitmap = this.f49141e;
            if (bitmap != null) {
                if (intrinsicWidth == bitmap.getWidth() && intrinsicHeight == this.f49141e.getHeight()) {
                    Canvas canvas = this.f49143g;
                    if (canvas != null) {
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    }
                    MethodCollector.m26664o(9549);
                    return;
                } else if (!this.f49141e.isRecycled()) {
                    this.f49141e.recycle();
                }
            }
            this.f49144h = Math.min(intrinsicWidth, intrinsicHeight) / 2;
            this.f49141e = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
            Canvas canvas2 = new Canvas(this.f49141e);
            this.f49143g = canvas2;
            this.f49142f.setBounds(0, 0, canvas2.getWidth(), this.f49143g.getHeight());
            Bitmap bitmap2 = this.f49141e;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
            this.f49140d.setAntiAlias(true);
            this.f49140d.setShader(bitmapShader);
            MethodCollector.m26664o(9549);
        }
    }

    public SmartCircleImageView(Context context) {
        super(context);
    }

    @Override // com.facebook.drawee.view.C24262c
    public void setController(AbstractC24255a aVar) {
        if (this.f49139b) {
            this.f49138a = true;
            setImageDrawable(null);
        }
        super.setController(aVar);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView
    /* renamed from: a */
    public final void mo34193a(C20765u uVar) {
        if (C20761r.m39055a().f49014s) {
            this.f49145i = uVar.f49055J;
        } else {
            this.f49139b = uVar.f49055J;
        }
        if (C20761r.m39055a().f49014s) {
            final AbstractC20734k kVar = uVar.f49051F;
            if (kVar == null) {
                uVar.f49051F = new AbstractC20727d() {
                    /* class com.bytedance.lighten.loader.SmartCircleImageView.C207721 */

                    static {
                        Covode.recordClassIndex(24347);
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34159a(Uri uri, View view, Throwable th) {
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
                        if (animatable != null) {
                            SmartCircleImageView.this.f49138a = true;
                            SmartCircleImageView.this.f49139b = true;
                            return;
                        }
                        SmartCircleImageView.this.f49138a = false;
                        SmartCircleImageView.this.f49139b = false;
                    }
                };
            } else {
                uVar.f49051F = new AbstractC20734k() {
                    /* class com.bytedance.lighten.loader.SmartCircleImageView.C207732 */

                    static {
                        Covode.recordClassIndex(24348);
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34146a(Uri uri) {
                        kVar.mo34146a(uri);
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34147a(Uri uri, View view) {
                        kVar.mo34147a(uri, view);
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34148a(Uri uri, C20758o oVar) {
                        kVar.mo34148a(uri, oVar);
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34149a(Uri uri, Throwable th) {
                        kVar.mo34149a(uri, th);
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34159a(Uri uri, View view, Throwable th) {
                        kVar.mo34159a(uri, view, th);
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
                        if (animatable != null) {
                            SmartCircleImageView.this.f49138a = true;
                            SmartCircleImageView.this.f49139b = true;
                        } else {
                            SmartCircleImageView.this.f49138a = false;
                            SmartCircleImageView.this.f49139b = false;
                        }
                        kVar.mo34158a(uri, view, oVar, animatable);
                    }
                };
            }
        } else if (this.f49139b) {
            final AbstractC20734k kVar2 = uVar.f49051F;
            if (kVar2 == null) {
                uVar.f49051F = new AbstractC20727d() {
                    /* class com.bytedance.lighten.loader.SmartCircleImageView.C207743 */

                    static {
                        Covode.recordClassIndex(24349);
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34159a(Uri uri, View view, Throwable th) {
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
                        SmartCircleImageView.this.f49138a = true;
                    }
                };
            } else {
                uVar.f49051F = new AbstractC20734k() {
                    /* class com.bytedance.lighten.loader.SmartCircleImageView.C207754 */

                    static {
                        Covode.recordClassIndex(24350);
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34146a(Uri uri) {
                        kVar2.mo34146a(uri);
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34147a(Uri uri, View view) {
                        kVar2.mo34147a(uri, view);
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34148a(Uri uri, C20758o oVar) {
                        kVar2.mo34148a(uri, oVar);
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34149a(Uri uri, Throwable th) {
                        kVar2.mo34149a(uri, th);
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34159a(Uri uri, View view, Throwable th) {
                        kVar2.mo34159a(uri, view, th);
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
                        SmartCircleImageView.this.f49138a = true;
                        kVar2.mo34158a(uri, view, oVar, animatable);
                    }
                };
            }
        }
        super.mo34193a(uVar);
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Canvas canvas3;
        if (C20761r.m39055a().f49014s) {
            if (!this.f49139b || !this.f49145i) {
                super.onDraw(canvas);
                return;
            }
            if (this.f49138a) {
                m39085d();
                this.f49138a = false;
            }
            Drawable drawable = this.f49142f;
            if (!(drawable == null || (canvas3 = this.f49143g) == null)) {
                drawable.draw(canvas3);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) this.f49144h, this.f49140d);
        } else if (this.f49139b) {
            if (this.f49138a) {
                m39085d();
                this.f49138a = false;
            }
            Drawable drawable2 = this.f49142f;
            if (!(drawable2 == null || (canvas2 = this.f49143g) == null)) {
                drawable2.draw(canvas2);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) this.f49144h, this.f49140d);
        } else {
            super.onDraw(canvas);
        }
    }

    public SmartCircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m39085d();
    }
}
