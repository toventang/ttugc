package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.google.android.material.internal.C26659a;
import com.google.android.material.internal.C26680i;
import com.google.android.material.internal.C26687m;
import com.google.android.material.p1951a.C26555a;
import com.google.android.material.p1951a.C26556b;
import com.google.android.material.p1951a.C26560f;
import com.google.android.material.p1951a.C26561g;
import com.google.android.material.p1951a.C26562h;
import com.google.android.material.p1958g.C26645a;
import com.google.android.material.p1959h.AbstractC26647b;
import com.google.android.material.p1959h.C26646a;
import java.util.ArrayList;

/* renamed from: com.google.android.material.floatingactionbutton.a */
public class C26634a {

    /* renamed from: a */
    static final TimeInterpolator f62974a = C26555a.f62657c;

    /* renamed from: u */
    static final int[] f62975u = {16842919, 16842910};

    /* renamed from: v */
    static final int[] f62976v = {16843623, 16842908, 16842910};

    /* renamed from: w */
    static final int[] f62977w = {16842908, 16842910};

    /* renamed from: x */
    static final int[] f62978x = {16843623, 16842910};

    /* renamed from: y */
    static final int[] f62979y = {16842910};

    /* renamed from: z */
    static final int[] f62980z = new int[0];

    /* renamed from: A */
    final C26687m f62981A;

    /* renamed from: B */
    final AbstractC26647b f62982B;

    /* renamed from: C */
    ViewTreeObserver.OnPreDrawListener f62983C;

    /* renamed from: D */
    private final C26680i f62984D;

    /* renamed from: E */
    private final Rect f62985E = new Rect();

    /* renamed from: F */
    private final RectF f62986F = new RectF();

    /* renamed from: G */
    private final RectF f62987G = new RectF();

    /* renamed from: H */
    private final Matrix f62988H = new Matrix();

    /* renamed from: b */
    int f62989b;

    /* renamed from: c */
    Animator f62990c;

    /* renamed from: d */
    public C26562h f62991d;

    /* renamed from: e */
    public C26562h f62992e;

    /* renamed from: f */
    C26562h f62993f;

    /* renamed from: g */
    C26562h f62994g;

    /* renamed from: h */
    C26646a f62995h;

    /* renamed from: i */
    float f62996i;

    /* renamed from: j */
    Drawable f62997j;

    /* renamed from: k */
    Drawable f62998k;

    /* renamed from: l */
    C26659a f62999l;

    /* renamed from: m */
    public Drawable f63000m;

    /* renamed from: n */
    float f63001n;

    /* renamed from: o */
    public float f63002o;

    /* renamed from: p */
    public float f63003p;

    /* renamed from: q */
    int f63004q;

    /* renamed from: r */
    float f63005r = 1.0f;

    /* renamed from: s */
    public ArrayList<Animator.AnimatorListener> f63006s;

    /* renamed from: t */
    public ArrayList<Animator.AnimatorListener> f63007t;

    /* renamed from: com.google.android.material.floatingactionbutton.a$d */
    interface AbstractC26641d {
        static {
            Covode.recordClassIndex(32092);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo44091b(Rect rect) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo44092c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo44094e() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo44083a() {
        return this.f63001n;
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$e */
    class C26642e extends AbstractC26643f {
        static {
            Covode.recordClassIndex(32093);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.C26634a.AbstractC26643f
        /* renamed from: a */
        public final float mo44103a() {
            return C26634a.this.f63001n;
        }

        C26642e() {
            super(C26634a.this, (byte) 0);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$b */
    class C26639b extends AbstractC26643f {
        static {
            Covode.recordClassIndex(32090);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.C26634a.AbstractC26643f
        /* renamed from: a */
        public final float mo44103a() {
            return C26634a.this.f63001n + C26634a.this.f63002o;
        }

        C26639b() {
            super(C26634a.this, (byte) 0);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$c */
    class C26640c extends AbstractC26643f {
        static {
            Covode.recordClassIndex(32091);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.C26634a.AbstractC26643f
        /* renamed from: a */
        public final float mo44103a() {
            return C26634a.this.f63001n + C26634a.this.f63003p;
        }

        C26640c() {
            super(C26634a.this, (byte) 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo44090b() {
        C26680i iVar = this.f62984D;
        if (iVar.f63216c != null) {
            iVar.f63216c.end();
            iVar.f63216c = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo44093d() {
        Rect rect = this.f62985E;
        mo44088a(rect);
        mo44091b(rect);
        this.f62982B.mo44080a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: f */
    public final boolean mo44095f() {
        if (this.f62981A.getVisibility() != 0) {
            if (this.f62989b == 2) {
                return true;
            }
            return false;
        } else if (this.f62989b != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo44096g() {
        if (!C0792v.m2788v(this.f62981A) || this.f62981A.isInEditMode()) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(32085);
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$a */
    class C26638a extends AbstractC26643f {
        static {
            Covode.recordClassIndex(32089);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.C26634a.AbstractC26643f
        /* renamed from: a */
        public final float mo44103a() {
            return 0.0f;
        }

        C26638a() {
            super(C26634a.this, (byte) 0);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$f */
    abstract class AbstractC26643f extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f63020a;

        /* renamed from: c */
        private float f63022c;

        /* renamed from: d */
        private float f63023d;

        static {
            Covode.recordClassIndex(32094);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract float mo44103a();

        private AbstractC26643f() {
        }

        public void onAnimationEnd(Animator animator) {
            C26634a.this.f62995h.mo44106a(this.f63023d);
            this.f63020a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f63020a) {
                this.f63022c = C26634a.this.f62995h.f63044k;
                this.f63023d = mo44103a();
                this.f63020a = true;
            }
            C26646a aVar = C26634a.this.f62995h;
            float f = this.f63022c;
            aVar.mo44106a(f + ((this.f63023d - f) * valueAnimator.getAnimatedFraction()));
        }

        /* synthetic */ AbstractC26643f(C26634a aVar, byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo44088a(Rect rect) {
        this.f62995h.getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44085a(float f) {
        this.f63005r = f;
        Matrix matrix = this.f62988H;
        m52858a(f, matrix);
        this.f62981A.setImageMatrix(matrix);
    }

    /* renamed from: a */
    private static ValueAnimator m52857a(AbstractC26643f fVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f62974a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(fVar);
        valueAnimator.addUpdateListener(fVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo44087a(ColorStateList colorStateList) {
        Drawable drawable = this.f62998k;
        if (drawable != null) {
            C0705a.m2496a(drawable, C26645a.m52890a(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo44089a(int[] iArr) {
        C26680i.C26682a aVar;
        C26680i iVar = this.f62984D;
        int size = iVar.f63214a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = iVar.f63214a.get(i);
            if (StateSet.stateSetMatches(aVar.f63219a, iArr)) {
                break;
            }
            i++;
        }
        if (aVar != iVar.f63215b) {
            if (!(iVar.f63215b == null || iVar.f63216c == null)) {
                iVar.f63216c.cancel();
                iVar.f63216c = null;
            }
            iVar.f63215b = aVar;
            if (aVar != null) {
                iVar.f63216c = aVar.f63220b;
                iVar.f63216c.start();
            }
        }
    }

    /* renamed from: a */
    private void m52858a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f62981A.getDrawable();
        if (drawable != null && this.f63004q != 0) {
            RectF rectF = this.f62986F;
            RectF rectF2 = this.f62987G;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f63004q;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f63004q;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    C26634a(C26687m mVar, AbstractC26647b bVar) {
        this.f62981A = mVar;
        this.f62982B = bVar;
        C26680i iVar = new C26680i();
        this.f62984D = iVar;
        iVar.mo44187a(f62975u, m52857a(new C26640c()));
        iVar.mo44187a(f62976v, m52857a(new C26639b()));
        iVar.mo44187a(f62977w, m52857a(new C26639b()));
        iVar.mo44187a(f62978x, m52857a(new C26639b()));
        iVar.mo44187a(f62979y, m52857a(new C26642e()));
        iVar.mo44187a(f62980z, m52857a(new C26638a()));
        this.f62996i = mVar.getRotation();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo44086a(float f, float f2, float f3) {
        C26646a aVar = this.f62995h;
        if (aVar != null) {
            aVar.mo44107a(f, this.f63003p + f);
            mo44093d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AnimatorSet mo44084a(C26562h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f62981A, View.ALPHA, f);
        hVar.mo43706a("opacity").mo43711a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f62981A, View.SCALE_X, f2);
        hVar.mo43706a("scale").mo43711a((Animator) ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f62981A, View.SCALE_Y, f2);
        hVar.mo43706a("scale").mo43711a((Animator) ofFloat3);
        arrayList.add(ofFloat3);
        m52858a(f3, this.f62988H);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f62981A, new C26560f(), new C26561g(), new Matrix(this.f62988H));
        hVar.mo43706a("iconScale").mo43711a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C26556b.m52580a(animatorSet, arrayList);
        return animatorSet;
    }
}
