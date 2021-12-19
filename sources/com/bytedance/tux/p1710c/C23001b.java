package com.bytedance.tux.p1710c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;
import com.bytedance.tux.p1708b.C22978b;
import com.bytedance.tux.p1708b.C22982f;
import com.bytedance.tux.p1708b.C22983g;
import com.bytedance.tux.p1722h.C23155d;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.tux.c.b */
public class C23001b extends Drawable {

    /* renamed from: e */
    public static boolean f54438e;

    /* renamed from: f */
    public static final C23002a f54439f = new C23002a((byte) 0);

    /* renamed from: a */
    public Drawable f54440a;

    /* renamed from: b */
    public boolean f54441b;

    /* renamed from: c */
    public boolean f54442c;

    /* renamed from: d */
    public Integer f54443d;

    /* renamed from: g */
    private final int f54444g;

    /* renamed from: h */
    private Drawable f54445h;

    /* renamed from: i */
    private int f54446i;

    /* renamed from: j */
    private boolean f54447j;

    /* renamed from: k */
    private final boolean f54448k;

    /* renamed from: l */
    private final AbstractC89244h f54449l = C89250i.m154773a((AbstractC89171a) C23004c.f54457a);

    /* renamed from: m */
    private int f54450m = -1;

    /* renamed from: n */
    private int f54451n = -1;

    /* renamed from: o */
    private final C23003b f54452o;

    /* renamed from: p */
    private int f54453p = -1;

    /* renamed from: q */
    private int f54454q = -1;

    static {
        Covode.recordClassIndex(26921);
    }

    public int getOpacity() {
        return -1;
    }

    /* renamed from: com.bytedance.tux.c.b$a */
    public static final class C23002a {
        static {
            Covode.recordClassIndex(26922);
        }

        private C23002a() {
        }

        public /* synthetic */ C23002a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.tux.c.b$b */
    public final class C23003b extends Drawable.ConstantState {

        /* renamed from: a */
        final /* synthetic */ C23001b f54455a;

        /* renamed from: b */
        private final C23001b f54456b;

        static {
            Covode.recordClassIndex(26923);
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return this.f54456b;
        }

        public C23003b(C23001b bVar, C23001b bVar2) {
            C89219l.m154719c(bVar2, "");
            this.f54455a = bVar;
            this.f54456b = bVar2;
        }
    }

    public int getIntrinsicHeight() {
        return this.f54451n;
    }

    public int getIntrinsicWidth() {
        return this.f54450m;
    }

    /* renamed from: com.bytedance.tux.c.b$c */
    static final class C23004c extends AbstractC89220m implements AbstractC89171a<PorterDuffXfermode> {

        /* renamed from: a */
        public static final C23004c f54457a = new C23004c();

        static {
            Covode.recordClassIndex(26924);
        }

        C23004c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PorterDuffXfermode invoke() {
            return new PorterDuffXfermode(PorterDuff.Mode.XOR);
        }
    }

    /* renamed from: a */
    public final int mo37370a() {
        int i = this.f54453p;
        if (i <= 0) {
            return getBounds().width();
        }
        return i;
    }

    /* renamed from: b */
    public final int mo37374b() {
        int i = this.f54454q;
        if (i <= 0) {
            return getBounds().height();
        }
        return i;
    }

    public Drawable.ConstantState getConstantState() {
        if (Build.VERSION.SDK_INT <= 23) {
            return this.f54452o;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo37371a(int i) {
        this.f54453p = i;
        this.f54450m = i;
        invalidateSelf();
    }

    /* renamed from: b */
    public final void mo37375b(int i) {
        this.f54454q = i;
        this.f54451n = i;
        invalidateSelf();
    }

    /* renamed from: c */
    public final void mo37377c(int i) {
        this.f54443d = Integer.valueOf(i);
        m43384a(this.f54440a, i);
        invalidateSelf();
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f54440a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        Drawable drawable2 = this.f54445h;
        if (drawable2 != null) {
            drawable2.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f54440a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    /* renamed from: a */
    private static Drawable m43383a(Drawable drawable) {
        Drawable.ConstantState constantState;
        Drawable newDrawable;
        if (drawable instanceof AbstractC15287a) {
            return (Drawable) drawable.getClass().newInstance();
        }
        if (drawable == null || (constantState = drawable.getConstantState()) == null || (newDrawable = constantState.newDrawable()) == null) {
            return null;
        }
        return newDrawable.mutate();
    }

    /* renamed from: b */
    public final void mo37376b(boolean z) {
        this.f54442c = z;
        if (z) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            this.f54446i = C89241a.m154730a(TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics()));
            Drawable a = m43383a(this.f54440a);
            this.f54445h = a;
            if (a != null) {
                a.setAlpha(30);
            }
            Drawable drawable = this.f54445h;
            if (drawable != null) {
                drawable.setColorFilter(null);
            }
        } else {
            this.f54445h = null;
        }
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo37373a(boolean z) {
        this.f54441b = z;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        boolean z;
        PorterDuffXfermode porterDuffXfermode;
        C89219l.m154719c(canvas, "");
        Drawable drawable = this.f54440a;
        if (drawable != null) {
            int width = getBounds().width();
            int height = getBounds().height();
            if (!this.f54447j || !this.f54448k) {
                z = false;
            } else {
                z = true;
                canvas.save();
                canvas.translate((float) width, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            if (mo37370a() <= 0 || mo37374b() <= 0) {
                drawable.setBounds(getBounds().left, getBounds().top, getBounds().left + width, getBounds().top + height);
            } else {
                drawable.setBounds(getBounds().left + ((width - mo37370a()) / 2), getBounds().top + ((height - mo37374b()) / 2), getBounds().left + ((width + mo37370a()) / 2), getBounds().top + ((height + mo37374b()) / 2));
            }
            if (this.f54442c) {
                Rect bounds = drawable.getBounds();
                C89219l.m154709a((Object) bounds, "");
                Drawable drawable2 = this.f54445h;
                if (drawable2 != null) {
                    drawable2.setBounds(bounds.left, bounds.top + this.f54446i, bounds.right, bounds.bottom + this.f54446i);
                }
                Drawable drawable3 = this.f54445h;
                if (drawable3 != null) {
                    drawable3.draw(canvas);
                }
            }
            if (this.f54441b) {
                porterDuffXfermode = (PorterDuffXfermode) this.f54449l.getValue();
            } else {
                porterDuffXfermode = null;
            }
            if (drawable instanceof BitmapDrawable) {
                Paint paint = ((BitmapDrawable) drawable).getPaint();
                C89219l.m154709a((Object) paint, "");
                paint.setXfermode(porterDuffXfermode);
            } else if (drawable instanceof AbstractC15287a) {
                ((AbstractC15287a) drawable).mo24798a(porterDuffXfermode);
            }
            drawable.draw(canvas);
            if (z) {
                canvas.restore();
            }
        }
    }

    /* renamed from: a */
    public final void mo37372a(Context context, int i) {
        C89219l.m154719c(context, "");
        Integer a = C23155d.m43641a(context, i);
        if (a != null) {
            mo37377c(a.intValue());
        }
    }

    /* renamed from: a */
    private static void m43384a(Drawable drawable, int i) {
        if (drawable != null) {
            drawable.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, (float) Color.red(i), 0.0f, 0.0f, 0.0f, 0.0f, (float) Color.green(i), 0.0f, 0.0f, 0.0f, 0.0f, (float) Color.blue(i), 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
            drawable.setAlpha(Color.alpha(i));
        }
    }

    public C23001b(Context context, int i) {
        Drawable drawable;
        Map<Integer, Object> map;
        C89219l.m154719c(context, "");
        C22978b a = C22982f.m43324a((int) R.attr.ap6, i);
        Drawable drawable2 = null;
        if (a == null || (map = a.f54330a) == null) {
            drawable = null;
        } else {
            drawable = null;
            for (Map.Entry<Integer, Object> entry : map.entrySet()) {
                int intValue = entry.getKey().intValue();
                if (intValue == C22983g.m43344r().f54332a) {
                    C22983g.m43344r();
                    Object value = entry.getValue();
                    C89219l.m154719c(value, "");
                    this.f54447j = ((Boolean) value).booleanValue();
                } else if (intValue == C22983g.m43345s().f54332a && f54438e) {
                    C22983g.m43345s();
                    Object value2 = entry.getValue();
                    C89219l.m154719c(value2, "");
                    Object newInstance = C89170a.m154665a((AbstractC89277c) value2).newInstance();
                    if (newInstance instanceof Drawable) {
                        drawable = (Drawable) newInstance;
                    }
                }
            }
        }
        this.f54448k = C23163i.m43663a(context);
        if (drawable == null) {
            if (i > 0) {
                try {
                    Drawable a2 = C0643b.m2369a(context, i);
                    if (a2 != null) {
                        drawable2 = a2.mutate();
                    }
                } catch (Exception unused) {
                }
            }
            drawable = drawable2;
        }
        this.f54440a = drawable;
        this.f54444g = i;
        this.f54452o = new C23003b(this, this);
    }
}
