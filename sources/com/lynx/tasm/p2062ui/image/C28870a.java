package com.lynx.tasm.p2062ui.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1836h.C24117a;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.imagepipeline.p1885j.AbstractC24453b;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28590c;
import com.lynx.tasm.p2062ui.image.C28901j;
import com.lynx.tasm.utils.C28929m;

/* renamed from: com.lynx.tasm.ui.image.a */
public class C28870a extends AbstractC28590c implements Drawable.Callback, C28901j.AbstractC28908a {

    /* renamed from: a */
    public int f68182a;

    /* renamed from: b */
    public int f68183b;

    /* renamed from: c */
    private C28901j f68184c;

    /* renamed from: d */
    private Drawable f68185d;

    /* renamed from: e */
    private boolean f68186e;

    /* renamed from: f */
    private int f68187f;

    /* renamed from: h */
    private int f68188h;

    /* renamed from: i */
    private boolean f68189i;

    /* renamed from: j */
    private final Context f68190j;

    static {
        Covode.recordClassIndex(34993);
    }

    @Override // com.lynx.tasm.p2062ui.image.C28901j.AbstractC28908a
    /* renamed from: O_ */
    public final void mo49986O_() {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28590c
    /* renamed from: b */
    public final int mo49404b() {
        return this.f68182a;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28590c
    /* renamed from: c */
    public final int mo49405c() {
        return this.f68183b;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28590c
    /* renamed from: d */
    public final void mo49406d() {
        m57821f();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28590c
    /* renamed from: a */
    public final boolean mo49403a() {
        if (this.f68185d != null) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28590c
    /* renamed from: e */
    public final void mo49408e() {
        this.f68184c.mo50111b();
        this.f68186e = false;
    }

    /* renamed from: f */
    private void m57821f() {
        if (!this.f68186e) {
            this.f68184c.mo50106a();
            this.f68186e = true;
            this.f68184c.f68300n = true;
            this.f68184c.mo50107a(this.f68187f, this.f68188h, 0, 0, 0, 0);
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28590c
    /* renamed from: a */
    public final void mo49410a(Bitmap.Config config) {
        this.f68184c.mo50108a(config);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f68185d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Drawable drawable = this.f68185d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // com.lynx.tasm.p2062ui.image.C28901j.AbstractC28908a
    /* renamed from: a */
    public final void mo49987a(Drawable drawable) {
        if (!this.f68189i) {
            this.f68185d = drawable;
            drawable.setBounds(getBounds());
            this.f68185d.setCallback(this);
            invalidateSelf();
        }
    }

    @Override // com.lynx.tasm.p2062ui.image.C28901j.AbstractC28908a
    /* renamed from: a */
    public final void mo49988a(C24117a<?> aVar) {
        Bitmap bitmap;
        MethodCollector.m26663i(8676);
        if (aVar != null && aVar.mo39700d()) {
            Object a = aVar.mo39695a();
            if (a instanceof AbstractC24453b) {
                bitmap = ((AbstractC24453b) a).mo40296d();
            } else if (a instanceof Bitmap) {
                bitmap = (Bitmap) a;
            }
            if (bitmap != null) {
                this.f68189i = true;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f68190j.getResources(), bitmap.copy(bitmap.getConfig(), true));
                this.f68185d = bitmapDrawable;
                bitmapDrawable.setBounds(getBounds());
                this.f68185d.setCallback(this);
                this.f68182a = bitmap.getWidth();
                this.f68183b = bitmap.getHeight();
                invalidateSelf();
            }
        }
        MethodCollector.m26664o(8676);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C28929m.m57948a(runnable, drawable);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28590c
    /* renamed from: a */
    public final void mo49401a(int i, int i2) {
        this.f68187f = i;
        this.f68188h = i2;
        this.f68184c.mo50107a(i, i2, 0, 0, 0, 0);
        m57821f();
    }

    C28870a(final Context context, final String str) {
        this.f68190j = context;
        C28901j jVar = new C28901j(context, C24182c.m45843b(), this, true);
        this.f68184c = jVar;
        jVar.f68282F = true;
        this.f68184c.f68306u = new C28890d() {
            /* class com.lynx.tasm.p2062ui.image.C28870a.C288711 */

            static {
                Covode.recordClassIndex(34994);
            }

            @Override // com.lynx.tasm.p2062ui.image.C28890d
            /* renamed from: a */
            public final void mo50007a(String str) {
                Context context = context;
                if (context instanceof AbstractC28520j) {
                    ((AbstractC28520j) context).mo49039a(str, "image", str);
                }
            }

            @Override // com.lynx.tasm.p2062ui.image.C28890d
            /* renamed from: a */
            public final void mo50006a(int i, int i2) {
                C28870a.this.f68182a = i;
                C28870a.this.f68183b = i2;
            }
        };
        this.f68184c.mo50109a(str);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C28929m.m57949a(runnable, drawable, j);
    }
}
