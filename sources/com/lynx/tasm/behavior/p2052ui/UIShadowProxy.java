package com.lynx.tasm.behavior.p2052ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.utils.C28683b;
import com.lynx.tasm.behavior.p2052ui.utils.C28693h;
import com.lynx.tasm.behavior.p2052ui.utils.EnumC28687c;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import com.lynx.tasm.p2043a.p2045b.C28410c;
import com.lynx.tasm.p2043a.p2046c.C28422a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.ui.UIShadowProxy */
public class UIShadowProxy extends UIGroup<C28585c> {

    /* renamed from: a */
    public LynxBaseUI f67262a;

    /* renamed from: b */
    Matrix f67263b = new Matrix();

    /* renamed from: c */
    private List<C28601c> f67264c;

    /* renamed from: d */
    private C28583a f67265d;

    /* renamed from: e */
    private Boolean f67266e;

    /* renamed from: f */
    private C28693h f67267f;

    static {
        Covode.recordClassIndex(34615);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public Rect getBoundRectForOverflow() {
        return null;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public boolean enableLayoutAnimation() {
        return this.f67262a.enableLayoutAnimation();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public Rect getBound() {
        return this.f67262a.getBound();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public int getHeight() {
        return this.f67262a.getHeight();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public C28410c getLayoutAnimator() {
        return this.f67262a.getLayoutAnimator();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public int getLeft() {
        return this.f67262a.getLeft();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public int getOriginLeft() {
        return this.f67262a.getOriginLeft();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public int getOriginTop() {
        return this.f67262a.getOriginTop();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public JavaOnlyMap getProps() {
        return this.f67262a.getProps();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public int getTop() {
        return this.f67262a.getTop();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public C28422a getTransitionAnimator() {
        return this.f67262a.getTransitionAnimator();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public int getWidth() {
        return this.f67262a.getWidth();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public boolean isFlatten() {
        return this.f67262a.isFlatten();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void measure() {
        this.f67262a.measure();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public float getTranslationZ() {
        LynxBaseUI lynxBaseUI = this.f67262a;
        if (lynxBaseUI instanceof LynxUI) {
            return lynxBaseUI.getTranslationZ();
        }
        return 0.0f;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onPropsUpdated() {
        LynxBaseUI lynxBaseUI = this.f67262a;
        if (lynxBaseUI != null) {
            lynxBaseUI.onPropsUpdated();
        }
        super.onPropsUpdated();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C28583a mo49393a() {
        if (this.f67265d == null) {
            this.f67265d = new C28583a();
            if (this.mView != null) {
                ((C28585c) this.mView).f67297a = this.f67265d;
            }
        }
        return this.f67265d;
    }

    /* renamed from: b */
    public final void mo49395b() {
        boolean z;
        this.f67267f = null;
        if (this.f67262a.mTransformRaw != null) {
            z = true;
        } else {
            z = false;
        }
        this.f67266e = Boolean.valueOf(z);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public List<LynxBaseUI> getChildren() {
        if (this.mContext.f67077r) {
            return this.f67262a.getChildren();
        }
        return super.getChildren();
    }

    /* renamed from: com.lynx.tasm.behavior.ui.UIShadowProxy$b */
    public static class C28584b {

        /* renamed from: w */
        static double[] f67274w = {1.0d, 0.8027415617602307d, 0.6443940149772542d, 0.5172818579717866d, 0.41524364653850576d, 0.3333333333333333d, 0.2075805205867436d, 0.1147980049924181d, 0.0424272859905955d, 0.0d};

        /* renamed from: a */
        Paint f67275a = new Paint(5);

        /* renamed from: b */
        Paint f67276b;

        /* renamed from: c */
        Paint f67277c;

        /* renamed from: d */
        Paint f67278d;

        /* renamed from: e */
        Paint f67279e;

        /* renamed from: f */
        Paint f67280f;

        /* renamed from: g */
        final RectF f67281g;

        /* renamed from: h */
        final RectF f67282h;

        /* renamed from: i */
        float[] f67283i;

        /* renamed from: j */
        float[] f67284j;

        /* renamed from: k */
        C28601c f67285k;

        /* renamed from: l */
        final Path f67286l = new Path();

        /* renamed from: m */
        final Path f67287m = new Path();

        /* renamed from: n */
        final Path f67288n = new Path();

        /* renamed from: o */
        final Path f67289o = new Path();

        /* renamed from: p */
        final Path f67290p = new Path();

        /* renamed from: q */
        final Path f67291q = new Path();

        /* renamed from: r */
        final Path f67292r = new Path();

        /* renamed from: s */
        final Path f67293s = new Path();

        /* renamed from: t */
        final Path f67294t = new Path();

        /* renamed from: u */
        final Path f67295u = new Path();

        /* renamed from: v */
        boolean f67296v = false;

        static {
            Covode.recordClassIndex(34619);
        }

        public C28584b() {
            Paint paint = new Paint(5);
            this.f67276b = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f67276b.setDither(true);
            this.f67277c = new Paint(this.f67276b);
            this.f67278d = new Paint(this.f67276b);
            this.f67279e = new Paint(this.f67276b);
            this.f67281g = new RectF();
            this.f67282h = new RectF();
            this.f67280f = new Paint(this.f67276b);
            this.f67283i = new float[8];
            this.f67284j = new float[8];
        }

        /* renamed from: a */
        private void m57162a(Path path, float f, float f2) {
            float f3;
            path.reset();
            if (this.f67285k.mo49432a()) {
                f3 = this.f67285k.f67347f;
            } else {
                f3 = -this.f67285k.f67347f;
            }
            RectF rectF = new RectF(0.0f, 0.0f, f * 2.0f, f2 * 2.0f);
            RectF rectF2 = new RectF(rectF);
            if (f3 > 0.0f) {
                float min = Math.min(rectF2.width(), rectF2.height()) / 2.0f;
                if (f3 > min) {
                    f3 = min;
                }
            }
            if (f3 <= -0.1f || f3 >= 0.1f) {
                rectF2.inset(f3, f3);
                path.setFillType(Path.FillType.EVEN_ODD);
                path.moveTo(0.0f, f2);
                path.rLineTo(f3, 0.0f);
                path.arcTo(rectF2, 180.0f, 90.0f, false);
                path.arcTo(rectF, 270.0f, -90.0f, false);
                path.close();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0149, code lost:
            if (r9 < 1.0f) goto L_0x014b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo49397a(com.lynx.tasm.behavior.p2052ui.C28601c r26, android.graphics.Rect r27, float[] r28) {
            /*
            // Method dump skipped, instructions count: 1066
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.UIShadowProxy.C28584b.mo49397a(com.lynx.tasm.behavior.ui.c, android.graphics.Rect, float[]):void");
        }

        /* renamed from: a */
        private void m57161a(Paint paint, int[] iArr, float f, float f2) {
            float f3 = this.f67285k.f67347f;
            float f4 = (f + f2) / 2.0f;
            int length = f67274w.length;
            float f5 = 1.0f;
            float f6 = 0.0f;
            char c = 2;
            if (!this.f67285k.mo49432a()) {
                float f7 = f3 + f4;
                if (((double) f7) <= 1.0E-6d) {
                    paint.setShader(null);
                    return;
                }
                float f8 = f4 / f7;
                int i = length + 1;
                float[] fArr = new float[i];
                int[] iArr2 = new int[i];
                fArr[0] = 0.0f;
                fArr[1] = f8;
                iArr2[0] = this.f67285k.f67342a;
                iArr2[1] = this.f67285k.f67342a;
                for (int i2 = 2; i2 <= length; i2++) {
                    int i3 = i2 - 1;
                    fArr[i2] = (((1.0f - f8) * ((float) i3)) / ((float) (length - 1))) + f8;
                    double d = (double) iArr[0];
                    double d2 = f67274w[i3];
                    Double.isNaN(d);
                    iArr2[i2] = Color.argb((int) (d * d2), iArr[1], iArr[2], iArr[3]);
                }
                paint.setShader(new RadialGradient(f, f2, f7, iArr2, fArr, Shader.TileMode.CLAMP));
            } else if (((double) f4) <= 1.0E-6d) {
                paint.setShader(null);
            } else {
                float f9 = f3 / f4;
                int i4 = length + 1;
                float[] fArr2 = new float[i4];
                int[] iArr3 = new int[i4];
                fArr2[length] = 1.0f;
                iArr3[length] = this.f67285k.f67342a;
                int i5 = 1;
                while (i5 < length) {
                    int i6 = length - i5;
                    fArr2[i6] = Math.max(f5 - ((((float) i5) * f9) / ((float) (length - 1))), f6);
                    double d3 = (double) iArr[0];
                    double d4 = f67274w[i5];
                    Double.isNaN(d3);
                    iArr3[i6] = Color.argb((int) (d3 * d4), iArr[1], iArr[c], iArr[3]);
                    i5++;
                    f5 = 1.0f;
                    f6 = 0.0f;
                    c = 2;
                }
                fArr2[0] = 0.0f;
                iArr3[0] = Color.argb(0, iArr[1], iArr[2], iArr[3]);
                paint.setShader(new RadialGradient(f, f2, f4, iArr3, fArr2, Shader.TileMode.CLAMP));
            }
        }
    }

    /* renamed from: c */
    private Rect m57155c() {
        return new Rect(this.f67262a.getLeft(), this.f67262a.getTop(), this.f67262a.getLeft() + this.f67262a.getWidth(), this.f67262a.getTop() + this.f67262a.getHeight());
    }

    /* renamed from: d */
    private void m57156d() {
        float[] fArr;
        C28683b d = this.f67262a.mLynxBackground.mo49780d();
        int width = this.f67262a.getWidth();
        int height = this.f67262a.getHeight();
        if (d != null) {
            if (width > 0 && height > 0) {
                d.mo49768a((float) width, (float) height);
            }
            fArr = d.mo49770a();
        } else {
            fArr = null;
        }
        if (width > 0 && height > 0) {
            Rect c = m57155c();
            C28583a aVar = this.f67265d;
            if (aVar != null) {
                aVar.f67271d = c;
            }
            ((C28585c) this.mView).f67297a = this.f67265d;
            ((C28585c) this.mView).mo49398a(this.f67264c, c, fArr);
        }
        ((C28585c) this.mView).invalidate();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void layout() {
        View view = (View) ((C28585c) this.mView).getParent();
        if (view != null) {
            ((C28585c) this.mView).layout(0, 0, view.getWidth(), view.getHeight());
            if (((C28585c) this.mView).getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) ((C28585c) this.mView).getParent();
                if (getOverflow() != 0) {
                    viewGroup.setClipChildren(false);
                }
                C0792v.m2745a(this.mView, getBoundRectForOverflow());
            }
            LynxBaseUI lynxBaseUI = this.f67262a;
            if (lynxBaseUI instanceof LynxUI) {
                lynxBaseUI.layout();
            }
            m57156d();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        return new C28585c(this, context);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void removeChild(LynxBaseUI lynxBaseUI) {
        this.f67262a.removeChild(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setOutlineWidth(float f) {
        mo49393a().f67270c = f;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void updateExtraData(Object obj) {
        this.f67262a.updateExtraData(obj);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void updateLayoutInfo(LynxBaseUI lynxBaseUI) {
        this.f67262a.updateLayoutInfo(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void updatePropertiesInterval(C28716v vVar) {
        this.f67262a.updateProperties(vVar);
    }

    /* renamed from: com.lynx.tasm.behavior.ui.UIShadowProxy$c */
    public static class C28585c extends C28698a {

        /* renamed from: a */
        public C28583a f67297a;

        /* renamed from: b */
        private ArrayList<C28584b> f67298b;

        /* renamed from: c */
        private WeakReference<UIShadowProxy> f67299c;

        static {
            Covode.recordClassIndex(34620);
        }

        @Override // com.lynx.tasm.behavior.p2052ui.view.C28698a
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        @Override // com.lynx.tasm.behavior.p2052ui.view.C28698a
        public void dispatchDraw(Canvas canvas) {
            m57164a(canvas, false);
            super.dispatchDraw(canvas);
            m57164a(canvas, true);
        }

        public C28585c(UIShadowProxy uIShadowProxy, Context context) {
            super(context);
            this.f67299c = new WeakReference<>(uIShadowProxy);
            setWillNotDraw(false);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0216  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x022f  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x0352  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0358  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m57164a(android.graphics.Canvas r54, boolean r55) {
            /*
            // Method dump skipped, instructions count: 864
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.UIShadowProxy.C28585c.m57164a(android.graphics.Canvas, boolean):void");
        }

        /* renamed from: a */
        public final void mo49398a(List<C28601c> list, Rect rect, float[] fArr) {
            this.f67298b = null;
            if (!(list == null || list.isEmpty())) {
                this.f67298b = new ArrayList<>();
                for (C28601c cVar : list) {
                    C28584b bVar = new C28584b();
                    bVar.mo49397a(cVar, rect, fArr);
                    this.f67298b.add(bVar);
                }
                invalidate();
            }
        }
    }

    /* renamed from: a */
    public final void mo49394a(List<C28601c> list) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f67264c = list;
            m57156d();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setOutlineColor(int i) {
        mo49393a().f67269b = Integer.valueOf(i);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void updateSticky(float[] fArr) {
        this.f67262a.updateSticky(fArr);
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public LynxBaseUI getChildAt(int i) {
        if (this.mContext.f67077r) {
            return this.f67262a.mChildren.get(i);
        }
        return super.getChildAt(i);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.UIGroup
    public void insertView(LynxUI lynxUI) {
        if (this.mContext.f67077r) {
            ((UIGroup) this.f67262a).insertView(lynxUI);
        } else {
            super.insertView(lynxUI);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.UIGroup
    public void removeView(LynxBaseUI lynxBaseUI) {
        if (this.mContext.f67077r) {
            ((UIGroup) this.f67262a).removeView(lynxBaseUI);
        } else {
            super.removeView(lynxBaseUI);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setBoxShadow(ReadableArray readableArray) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f67264c = C28601c.m57197a(readableArray);
            m57156d();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void insertChild(LynxBaseUI lynxBaseUI, int i) {
        this.f67262a.insertChild(lynxBaseUI, i);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public void insertDrawList(LynxBaseUI lynxBaseUI, LynxBaseUI lynxBaseUI2) {
        ((LynxUI) this.f67262a).insertDrawList(lynxBaseUI, lynxBaseUI2);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public boolean checkStickyOnParentScroll(int i, int i2) {
        boolean checkStickyOnParentScroll = this.f67262a.checkStickyOnParentScroll(i, i2);
        if (checkStickyOnParentScroll) {
            invalidate();
        }
        return checkStickyOnParentScroll;
    }

    public UIShadowProxy(AbstractC28520j jVar, LynxBaseUI lynxBaseUI) {
        super(jVar);
        this.mOverflow = 3;
        this.f67262a = lynxBaseUI;
        lynxBaseUI.setParent(this);
        setSign(lynxBaseUI.getSign(), lynxBaseUI.mTagName);
        initialize();
        super.insertChild(this.f67262a, 0);
        if (this.mContext.f67077r) {
            super.insertDrawList(null, this.f67262a);
            super.insertView((LynxUI) this.f67262a);
        }
        mo49395b();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void updateDrawingLayoutInfo(int i, int i2, Rect rect) {
        this.f67262a.updateDrawingLayoutInfo(i, i2, rect);
    }

    /* renamed from: com.lynx.tasm.behavior.ui.UIShadowProxy$a */
    public static class C28583a {

        /* renamed from: a */
        public EnumC28687c f67268a = EnumC28687c.NONE;

        /* renamed from: b */
        public Integer f67269b = -16777216;

        /* renamed from: c */
        public float f67270c;

        /* renamed from: d */
        public Rect f67271d;

        /* renamed from: e */
        Paint f67272e;

        /* renamed from: f */
        private Path f67273f;

        static {
            Covode.recordClassIndex(34618);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo49396a(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            if (this.f67273f == null) {
                this.f67273f = new Path();
            }
            this.f67273f.reset();
            this.f67273f.moveTo(f, f2);
            this.f67273f.lineTo(f3, f4);
            this.f67273f.lineTo(f5, f6);
            this.f67273f.lineTo(f7, f8);
            this.f67273f.lineTo(f, f2);
            canvas.clipPath(this.f67273f);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setLayoutData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Rect rect) {
        this.f67262a.setLayoutData(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, rect);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        this.f67262a.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}
