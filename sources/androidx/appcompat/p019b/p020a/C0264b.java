package androidx.appcompat.p019b.p020a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C0705a;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.b.a.b */
public class C0264b extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    public int f823a = -1;

    /* renamed from: b */
    private AbstractC0267b f824b;

    /* renamed from: c */
    private Rect f825c;

    /* renamed from: d */
    private Drawable f826d;

    /* renamed from: e */
    private Drawable f827e;

    /* renamed from: f */
    private int f828f = 255;

    /* renamed from: g */
    private boolean f829g;

    /* renamed from: h */
    private int f830h = -1;

    /* renamed from: i */
    private boolean f831i;

    /* renamed from: j */
    private Runnable f832j;

    /* renamed from: k */
    private long f833k;

    /* renamed from: l */
    private long f834l;

    /* renamed from: m */
    private C0266a f835m;

    static {
        Covode.recordClassIndex(298);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.b.a.b$a */
    public static class C0266a implements Drawable.Callback {

        /* renamed from: a */
        Drawable.Callback f837a;

        static {
            Covode.recordClassIndex(300);
        }

        public final void invalidateDrawable(Drawable drawable) {
        }

        C0266a() {
        }

        /* renamed from: a */
        public final Drawable.Callback mo681a() {
            Drawable.Callback callback = this.f837a;
            this.f837a = null;
            return callback;
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f837a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f837a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC0267b mo631b() {
        return this.f824b;
    }

    public int getAlpha() {
        return this.f828f;
    }

    public Drawable getCurrent() {
        return this.f826d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.b.a.b$b */
    public static abstract class AbstractC0267b extends Drawable.ConstantState {

        /* renamed from: A */
        boolean f838A;

        /* renamed from: B */
        int f839B;

        /* renamed from: C */
        public int f840C;

        /* renamed from: D */
        public int f841D;

        /* renamed from: E */
        boolean f842E;

        /* renamed from: F */
        ColorFilter f843F;

        /* renamed from: G */
        boolean f844G;

        /* renamed from: H */
        ColorStateList f845H;

        /* renamed from: I */
        PorterDuff.Mode f846I;

        /* renamed from: J */
        boolean f847J;

        /* renamed from: K */
        boolean f848K;

        /* renamed from: c */
        final C0264b f849c;

        /* renamed from: d */
        Resources f850d;

        /* renamed from: e */
        int f851e = 160;

        /* renamed from: f */
        int f852f;

        /* renamed from: g */
        int f853g;

        /* renamed from: h */
        SparseArray<Drawable.ConstantState> f854h;

        /* renamed from: i */
        Drawable[] f855i;

        /* renamed from: j */
        public int f856j;

        /* renamed from: k */
        public boolean f857k;

        /* renamed from: l */
        boolean f858l;

        /* renamed from: m */
        Rect f859m;

        /* renamed from: n */
        public boolean f860n;

        /* renamed from: o */
        boolean f861o;

        /* renamed from: p */
        int f862p;

        /* renamed from: q */
        int f863q;

        /* renamed from: r */
        int f864r;

        /* renamed from: s */
        int f865s;

        /* renamed from: t */
        boolean f866t;

        /* renamed from: u */
        int f867u;

        /* renamed from: v */
        boolean f868v;

        /* renamed from: w */
        boolean f869w;

        /* renamed from: x */
        boolean f870x;

        /* renamed from: y */
        boolean f871y;

        /* renamed from: z */
        boolean f872z = true;

        static {
            Covode.recordClassIndex(301);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo688b() {
            this.f866t = false;
            this.f868v = false;
        }

        public int getChangingConfigurations() {
            return this.f852f | this.f853g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo668a() {
            int i = this.f856j;
            Drawable[] drawableArr = this.f855i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    drawableArr[i2].mutate();
                }
            }
            this.f838A = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo690c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f854h;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f855i[this.f854h.keyAt(i)] = m920b(this.f854h.valueAt(i).newDrawable(this.f850d));
                }
                this.f854h = null;
            }
        }

        public boolean canApplyTheme() {
            int i = this.f856j;
            Drawable[] drawableArr = this.f855i;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f854h.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public final synchronized boolean mo693e() {
            if (this.f870x) {
                return this.f871y;
            }
            mo690c();
            this.f870x = true;
            int i = this.f856j;
            Drawable[] drawableArr = this.f855i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f871y = false;
                    return false;
                }
            }
            this.f871y = true;
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo692d() {
            this.f861o = true;
            mo690c();
            int i = this.f856j;
            Drawable[] drawableArr = this.f855i;
            this.f863q = -1;
            this.f862p = -1;
            this.f865s = 0;
            this.f864r = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f862p) {
                    this.f862p = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f863q) {
                    this.f863q = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f864r) {
                    this.f864r = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f865s) {
                    this.f865s = minimumHeight;
                }
            }
        }

        /* renamed from: b */
        private Drawable m920b(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f839B);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f849c);
            return mutate;
        }

        /* renamed from: a */
        public final int mo685a(Drawable drawable) {
            int i = this.f856j;
            if (i >= this.f855i.length) {
                mo689b(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f849c);
            this.f855i[i] = drawable;
            this.f856j++;
            this.f853g = drawable.getChangingConfigurations() | this.f853g;
            mo688b();
            this.f859m = null;
            this.f858l = false;
            this.f861o = false;
            this.f870x = false;
            return i;
        }

        /* renamed from: b */
        public final Drawable mo687b(int i) {
            int indexOfKey;
            Drawable drawable = this.f855i[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f854h;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable b = m920b(this.f854h.valueAt(indexOfKey).newDrawable(this.f850d));
            this.f855i[i] = b;
            this.f854h.removeAt(indexOfKey);
            if (this.f854h.size() == 0) {
                this.f854h = null;
            }
            return b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo686a(Resources resources) {
            if (resources != null) {
                this.f850d = resources;
                int a = C0264b.m912a(resources, this.f851e);
                int i = this.f851e;
                this.f851e = a;
                if (i != a) {
                    this.f861o = false;
                    this.f858l = false;
                }
            }
        }

        /* renamed from: b */
        public void mo689b(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f855i, 0, drawableArr, 0, i);
            this.f855i = drawableArr;
        }

        AbstractC0267b(AbstractC0267b bVar, C0264b bVar2, Resources resources) {
            Resources resources2;
            int i;
            this.f849c = bVar2;
            if (resources != null) {
                resources2 = resources;
            } else if (bVar != null) {
                resources2 = bVar.f850d;
            } else {
                resources2 = null;
            }
            this.f850d = resources2;
            if (bVar != null) {
                i = bVar.f851e;
            } else {
                i = 0;
            }
            int a = C0264b.m912a(resources, i);
            this.f851e = a;
            if (bVar != null) {
                this.f852f = bVar.f852f;
                this.f853g = bVar.f853g;
                this.f870x = true;
                this.f871y = true;
                this.f857k = bVar.f857k;
                this.f860n = bVar.f860n;
                this.f872z = bVar.f872z;
                this.f838A = bVar.f838A;
                this.f839B = bVar.f839B;
                this.f840C = bVar.f840C;
                this.f841D = bVar.f841D;
                this.f842E = bVar.f842E;
                this.f843F = bVar.f843F;
                this.f844G = bVar.f844G;
                this.f845H = bVar.f845H;
                this.f846I = bVar.f846I;
                this.f847J = bVar.f847J;
                this.f848K = bVar.f848K;
                if (bVar.f851e == a) {
                    if (bVar.f858l) {
                        this.f859m = new Rect(bVar.f859m);
                        this.f858l = true;
                    }
                    if (bVar.f861o) {
                        this.f862p = bVar.f862p;
                        this.f863q = bVar.f863q;
                        this.f864r = bVar.f864r;
                        this.f865s = bVar.f865s;
                        this.f861o = true;
                    }
                }
                if (bVar.f866t) {
                    this.f867u = bVar.f867u;
                    this.f866t = true;
                }
                if (bVar.f868v) {
                    this.f869w = bVar.f869w;
                    this.f868v = true;
                }
                Drawable[] drawableArr = bVar.f855i;
                this.f855i = new Drawable[drawableArr.length];
                this.f856j = bVar.f856j;
                SparseArray<Drawable.ConstantState> sparseArray = bVar.f854h;
                if (sparseArray != null) {
                    this.f854h = sparseArray.clone();
                } else {
                    this.f854h = new SparseArray<>(this.f856j);
                }
                int i2 = this.f856j;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null) {
                        Drawable.ConstantState constantState = drawableArr[i3].getConstantState();
                        if (constantState != null) {
                            this.f854h.put(i3, constantState);
                        } else {
                            this.f855i[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.f855i = new Drawable[10];
            this.f856j = 0;
        }
    }

    public boolean canApplyTheme() {
        return this.f824b.canApplyTheme();
    }

    public boolean isAutoMirrored() {
        return this.f824b.f842E;
    }

    C0264b() {
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f824b.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f824b.mo693e()) {
            return null;
        }
        this.f824b.f852f = getChangingConfigurations();
        return this.f824b;
    }

    public int getIntrinsicHeight() {
        if (this.f824b.f860n) {
            AbstractC0267b bVar = this.f824b;
            if (!bVar.f861o) {
                bVar.mo692d();
            }
            return bVar.f863q;
        }
        Drawable drawable = this.f826d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f824b.f860n) {
            AbstractC0267b bVar = this.f824b;
            if (!bVar.f861o) {
                bVar.mo692d();
            }
            return bVar.f862p;
        }
        Drawable drawable = this.f826d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f824b.f860n) {
            AbstractC0267b bVar = this.f824b;
            if (!bVar.f861o) {
                bVar.mo692d();
            }
            return bVar.f865s;
        }
        Drawable drawable = this.f826d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f824b.f860n) {
            AbstractC0267b bVar = this.f824b;
            if (!bVar.f861o) {
                bVar.mo692d();
            }
            return bVar.f864r;
        }
        Drawable drawable = this.f826d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public Drawable mutate() {
        if (!this.f831i && super.mutate() == this) {
            AbstractC0267b b = mo631b();
            b.mo668a();
            mo629a(b);
            this.f831i = true;
        }
        return this;
    }

    public int getOpacity() {
        Drawable drawable = this.f826d;
        int i = -2;
        if (drawable != null && drawable.isVisible()) {
            AbstractC0267b bVar = this.f824b;
            if (bVar.f866t) {
                return bVar.f867u;
            }
            bVar.mo690c();
            int i2 = bVar.f856j;
            Drawable[] drawableArr = bVar.f855i;
            if (i2 > 0) {
                i = drawableArr[0].getOpacity();
            }
            for (int i3 = 1; i3 < i2; i3++) {
                i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
            }
            bVar.f867u = i;
            bVar.f866t = true;
        }
        return i;
    }

    public boolean isStateful() {
        AbstractC0267b bVar = this.f824b;
        if (bVar.f868v) {
            return bVar.f869w;
        }
        bVar.mo690c();
        int i = bVar.f856j;
        Drawable[] drawableArr = bVar.f855i;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            } else if (drawableArr[i2].isStateful()) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        bVar.f869w = z;
        bVar.f868v = true;
        return z;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f827e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f827e = null;
            this.f830h = -1;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f826d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f829g) {
                this.f826d.setAlpha(this.f828f);
            }
        }
        if (this.f834l != 0) {
            this.f834l = 0;
            z = true;
        }
        if (this.f833k != 0) {
            this.f833k = 0;
        } else if (!z) {
            return;
        }
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo674a(Resources resources) {
        this.f824b.mo686a(resources);
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f826d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f826d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f827e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f825c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f827e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f826d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo629a(AbstractC0267b bVar) {
        this.f824b = bVar;
        int i = this.f823a;
        if (i >= 0) {
            Drawable b = bVar.mo687b(i);
            this.f826d = b;
            if (b != null) {
                m913a(b);
            }
        }
        this.f830h = -1;
        this.f827e = null;
    }

    public void invalidateDrawable(Drawable drawable) {
        AbstractC0267b bVar = this.f824b;
        if (bVar != null) {
            bVar.mo688b();
        }
        if (drawable == this.f826d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f827e;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f826d;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f827e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f826d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void setAutoMirrored(boolean z) {
        if (this.f824b.f842E != z) {
            this.f824b.f842E = z;
            Drawable drawable = this.f826d;
            if (drawable != null) {
                C0705a.m2500a(drawable, this.f824b.f842E);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f824b.f844G = true;
        if (this.f824b.f843F != colorFilter) {
            this.f824b.f843F = colorFilter;
            Drawable drawable = this.f826d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        if (this.f824b.f872z != z) {
            this.f824b.f872z = z;
            Drawable drawable = this.f826d;
            if (drawable != null) {
                drawable.setDither(this.f824b.f872z);
            }
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f824b.f847J = true;
        if (this.f824b.f845H != colorStateList) {
            this.f824b.f845H = colorStateList;
            C0705a.m2496a(this.f826d, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f824b.f848K = true;
        if (this.f824b.f846I != mode) {
            this.f824b.f846I = mode;
            C0705a.m2499a(this.f826d, mode);
        }
    }

    public void applyTheme(Resources.Theme theme) {
        AbstractC0267b bVar = this.f824b;
        if (theme != null) {
            bVar.mo690c();
            int i = bVar.f856j;
            Drawable[] drawableArr = bVar.f855i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                    drawableArr[i2].applyTheme(theme);
                    bVar.f853g |= drawableArr[i2].getChangingConfigurations();
                }
            }
            bVar.mo686a(theme.getResources());
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean z;
        AbstractC0267b bVar = this.f824b;
        int i2 = this.f823a;
        int i3 = bVar.f856j;
        Drawable[] drawableArr = bVar.f855i;
        boolean z2 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z = drawableArr[i4].setLayoutDirection(i);
                } else {
                    z = false;
                }
                if (i4 == i2) {
                    z2 = z;
                }
            }
        }
        bVar.f839B = i;
        return z2;
    }

    public void setAlpha(int i) {
        if (!this.f829g || this.f828f != i) {
            this.f829g = true;
            this.f828f = i;
            Drawable drawable = this.f826d;
            if (drawable == null) {
                return;
            }
            if (this.f833k == 0) {
                drawable.setAlpha(i);
            } else {
                mo675a(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo675a(boolean r14) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.p019b.p020a.C0264b.mo675a(boolean):void");
    }

    /* renamed from: a */
    private void m913a(Drawable drawable) {
        if (this.f835m == null) {
            this.f835m = new C0266a();
        }
        C0266a aVar = this.f835m;
        aVar.f837a = drawable.getCallback();
        drawable.setCallback(aVar);
        try {
            if (this.f824b.f840C <= 0 && this.f829g) {
                drawable.setAlpha(this.f828f);
            }
            if (this.f824b.f844G) {
                drawable.setColorFilter(this.f824b.f843F);
            } else {
                if (this.f824b.f847J) {
                    C0705a.m2496a(drawable, this.f824b.f845H);
                }
                if (this.f824b.f848K) {
                    C0705a.m2499a(drawable, this.f824b.f846I);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f824b.f872z);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            int i = Build.VERSION.SDK_INT;
            drawable.setAutoMirrored(this.f824b.f842E);
            Rect rect = this.f825c;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f835m.mo681a());
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        AbstractC0267b bVar = this.f824b;
        Rect rect2 = null;
        if (!bVar.f857k) {
            if (bVar.f859m != null || bVar.f858l) {
                rect2 = bVar.f859m;
            } else {
                bVar.mo690c();
                Rect rect3 = new Rect();
                int i = bVar.f856j;
                Drawable[] drawableArr = bVar.f855i;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect3)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        if (rect3.left > rect2.left) {
                            rect2.left = rect3.left;
                        }
                        if (rect3.top > rect2.top) {
                            rect2.top = rect3.top;
                        }
                        if (rect3.right > rect2.right) {
                            rect2.right = rect3.right;
                        }
                        if (rect3.bottom > rect2.bottom) {
                            rect2.bottom = rect3.bottom;
                        }
                    }
                }
                bVar.f858l = true;
                bVar.f859m = rect2;
            }
            if (rect2 != null) {
                rect.set(rect2);
                if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (isAutoMirrored() && getLayoutDirection() == 1) {
                    int i3 = rect.left;
                    rect.left = rect.right;
                    rect.right = i3;
                }
                return z;
            }
        }
        Drawable drawable = this.f826d;
        if (drawable != null) {
            z = drawable.getPadding(rect);
        } else {
            z = super.getPadding(rect);
        }
        int i32 = rect.left;
        rect.left = rect.right;
        rect.right = i32;
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo676a(int i) {
        if (i == this.f823a) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f824b.f841D > 0) {
            Drawable drawable = this.f827e;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f826d;
            if (drawable2 != null) {
                this.f827e = drawable2;
                this.f830h = this.f823a;
                this.f834l = ((long) this.f824b.f841D) + uptimeMillis;
            } else {
                this.f827e = null;
                this.f830h = -1;
                this.f834l = 0;
            }
        } else {
            Drawable drawable3 = this.f826d;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i < 0 || i >= this.f824b.f856j) {
            this.f826d = null;
            this.f823a = -1;
        } else {
            Drawable b = this.f824b.mo687b(i);
            this.f826d = b;
            this.f823a = i;
            if (b != null) {
                if (this.f824b.f840C > 0) {
                    this.f833k = uptimeMillis + ((long) this.f824b.f840C);
                }
                m913a(b);
            }
        }
        if (!(this.f833k == 0 && this.f834l == 0)) {
            Runnable runnable = this.f832j;
            if (runnable == null) {
                this.f832j = new Runnable() {
                    /* class androidx.appcompat.p019b.p020a.C0264b.RunnableC02651 */

                    static {
                        Covode.recordClassIndex(299);
                    }

                    public final void run() {
                        C0264b.this.mo675a(true);
                        C0264b.this.invalidateSelf();
                    }
                };
            } else {
                unscheduleSelf(runnable);
            }
            mo675a(true);
        }
        invalidateSelf();
        return true;
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f826d;
        if (drawable != null) {
            C0705a.m2493a(drawable, f, f2);
        }
    }

    /* renamed from: a */
    static int m912a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f827e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f826d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f826d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f826d && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f825c;
        if (rect == null) {
            this.f825c = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f826d;
        if (drawable != null) {
            C0705a.m2495a(drawable, i, i2, i3, i4);
        }
    }
}
