package com.google.android.material.floatingactionbutton;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.C0428h;
import androidx.appcompat.widget.C0435j;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.p037h.AbstractC0791u;
import androidx.core.p037h.C0792v;
import androidx.core.widget.AbstractC0826j;
import androidx.p025c.C0497g;
import com.bytedance.covode.number.Covode;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C26634a;
import com.google.android.material.internal.C26659a;
import com.google.android.material.internal.C26662c;
import com.google.android.material.internal.C26687m;
import com.google.android.material.p1951a.C26562h;
import com.google.android.material.p1955d.AbstractC26626a;
import com.google.android.material.p1955d.C26628c;
import com.google.android.material.p1959h.AbstractC26647b;
import com.google.android.material.stateful.ExtendableSavedState;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.trill.R;

@CoordinatorLayout.AbstractC0558c(mo2534a = Behavior.class)
public final class FloatingActionButton extends C26687m implements AbstractC0791u, AbstractC0826j, AbstractC26626a {

    /* renamed from: a */
    public int f62953a;

    /* renamed from: b */
    boolean f62954b;

    /* renamed from: c */
    final Rect f62955c;

    /* renamed from: d */
    private ColorStateList f62956d;

    /* renamed from: e */
    private PorterDuff.Mode f62957e;

    /* renamed from: f */
    private ColorStateList f62958f;

    /* renamed from: g */
    private PorterDuff.Mode f62959g;

    /* renamed from: h */
    private ColorStateList f62960h;

    /* renamed from: i */
    private int f62961i;

    /* renamed from: j */
    private int f62962j;

    /* renamed from: k */
    private int f62963k;

    /* renamed from: l */
    private final Rect f62964l;

    /* renamed from: m */
    private final C0435j f62965m;

    /* renamed from: n */
    private final C26628c f62966n;

    /* renamed from: o */
    private C26634a f62967o;

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public static abstract class AbstractC26632a {
        static {
            Covode.recordClassIndex(32083);
        }
    }

    static {
        Covode.recordClassIndex(32079);
    }

    public final void setBackgroundColor(int i) {
    }

    public final void setBackgroundDrawable(Drawable drawable) {
    }

    public final void setBackgroundResource(int i) {
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        static {
            Covode.recordClassIndex(32082);
        }

        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b, com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo2517a(CoordinatorLayout.C0560e eVar) {
            super.mo2517a(eVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo44076a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.mo2524a(coordinatorLayout, floatingActionButton, i);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo44077a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo2526a(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo44078a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo2533b(coordinatorLayout, floatingActionButton, view);
        }
    }

    public final ColorStateList getBackgroundTintList() {
        return this.f62956d;
    }

    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f62957e;
    }

    public final int getCustomSize() {
        return this.f62962j;
    }

    public final ColorStateList getRippleColorStateList() {
        return this.f62960h;
    }

    public final int getSize() {
        return this.f62961i;
    }

    @Override // androidx.core.widget.AbstractC0826j
    public final ColorStateList getSupportImageTintList() {
        return this.f62958f;
    }

    @Override // androidx.core.widget.AbstractC0826j
    public final PorterDuff.Mode getSupportImageTintMode() {
        return this.f62959g;
    }

    public final boolean getUseCompatPadding() {
        return this.f62954b;
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC0557b<T> {

        /* renamed from: a */
        private Rect f62970a;

        /* renamed from: b */
        private AbstractC26632a f62971b;

        /* renamed from: c */
        private boolean f62972c;

        static {
            Covode.recordClassIndex(32081);
        }

        public BaseBehavior() {
            this.f62972c = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
        /* renamed from: a */
        public void mo2517a(CoordinatorLayout.C0560e eVar) {
            if (eVar.f2423h == 0) {
                eVar.f2423h = 80;
            }
        }

        /* renamed from: a */
        private static boolean m52838a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0560e) {
                return ((CoordinatorLayout.C0560e) layoutParams).f2416a instanceof BottomSheetBehavior;
            }
            return false;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k5});
            this.f62972c = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private boolean m52839a(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.C0560e eVar = (CoordinatorLayout.C0560e) floatingActionButton.getLayoutParams();
            if (this.f62972c && eVar.f2421f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private boolean m52841b(View view, FloatingActionButton floatingActionButton) {
            if (!m52839a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0560e) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo44028b(this.f62971b);
                return true;
            }
            floatingActionButton.mo44025a(this.f62971b);
            return true;
        }

        /* renamed from: a */
        private boolean m52840a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m52839a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f62970a == null) {
                this.f62970a = new Rect();
            }
            Rect rect = this.f62970a;
            C26662c.m52941a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo44028b(this.f62971b);
                return true;
            }
            floatingActionButton.mo44025a(this.f62971b);
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2524a(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.floatingactionbutton.FloatingActionButton r8, int r9) {
            /*
            // Method dump skipped, instructions count: 138
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior.mo2524a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.floatingactionbutton.FloatingActionButton, int):boolean");
        }

        /* renamed from: a */
        public boolean mo2526a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f62955c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        public boolean mo2533b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m52840a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!m52838a(view)) {
                return false;
            } else {
                m52841b(view, floatingActionButton);
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public class C26633b implements AbstractC26647b {
        static {
            Covode.recordClassIndex(32084);
        }

        @Override // com.google.android.material.p1959h.AbstractC26647b
        /* renamed from: b */
        public final boolean mo44082b() {
            return FloatingActionButton.this.f62954b;
        }

        @Override // com.google.android.material.p1959h.AbstractC26647b
        /* renamed from: a */
        public final float mo44079a() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }

        C26633b() {
        }

        @Override // com.google.android.material.p1959h.AbstractC26647b
        /* renamed from: a */
        public final void mo44081a(Drawable drawable) {
            FloatingActionButton.super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.p1959h.AbstractC26647b
        /* renamed from: a */
        public final void mo44080a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f62955c.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f62953a, i2 + FloatingActionButton.this.f62953a, i3 + FloatingActionButton.this.f62953a, i4 + FloatingActionButton.this.f62953a);
        }
    }

    @Override // com.google.android.material.p1955d.AbstractC26627b
    /* renamed from: a */
    public final boolean mo44024a() {
        return this.f62966n.f62951b;
    }

    public final float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f63002o;
    }

    public final float getCompatPressedTranslationZ() {
        return getImpl().f63003p;
    }

    public final Drawable getContentBackground() {
        return getImpl().f63000m;
    }

    public final int getExpandedComponentIdHint() {
        return this.f62966n.f62952c;
    }

    public final C26562h getHideMotionSpec() {
        return getImpl().f62992e;
    }

    public final C26562h getShowMotionSpec() {
        return getImpl().f62991d;
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public final ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo44089a(getDrawableState());
    }

    public final float getCompatElevation() {
        return getImpl().mo44083a();
    }

    public final int getRippleColor() {
        ColorStateList colorStateList = this.f62960h;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo44090b();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C26634a impl = getImpl();
        if (impl.f62983C != null) {
            impl.f62981A.getViewTreeObserver().removeOnPreDrawListener(impl.f62983C);
            impl.f62983C = null;
        }
        C58030k.m104850a(this);
    }

    /* renamed from: b */
    private void m52831b() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f62958f;
            if (colorStateList == null) {
                C0705a.m2505d(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f62959g;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0428h.m1577a(colorForState, mode));
        }
    }

    public final C26634a getImpl() {
        C26634a aVar;
        if (this.f62967o == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                aVar = new C26644b(this, new C26633b());
            } else {
                aVar = new C26634a(this, new C26633b());
            }
            this.f62967o = aVar;
        }
        return this.f62967o;
    }

    /* access modifiers changed from: package-private */
    public final int getSizeDimension() {
        int i = this.f62961i;
        while (true) {
            int i2 = this.f62962j;
            if (i2 != 0) {
                return i2;
            }
            Resources resources = getResources();
            if (i != -1) {
                if (i != 1) {
                    return resources.getDimensionPixelSize(R.dimen.ho);
                }
                return resources.getDimensionPixelSize(R.dimen.hn);
            } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
                i = 1;
            } else {
                i = 0;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C26634a impl = getImpl();
        if (impl.mo44094e()) {
            if (impl.f62983C == null) {
                impl.f62983C = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0016: IPUT  
                      (wrap: com.google.android.material.floatingactionbutton.a$3 : 0x0013: CONSTRUCTOR  (r0v4 com.google.android.material.floatingactionbutton.a$3) = (r2v0 'impl' com.google.android.material.floatingactionbutton.a) call: com.google.android.material.floatingactionbutton.a.3.<init>(com.google.android.material.floatingactionbutton.a):void type: CONSTRUCTOR)
                      (r2v0 'impl' com.google.android.material.floatingactionbutton.a)
                     com.google.android.material.floatingactionbutton.a.C android.view.ViewTreeObserver$OnPreDrawListener in method: com.google.android.material.floatingactionbutton.FloatingActionButton.onAttachedToWindow():void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0013: CONSTRUCTOR  (r0v4 com.google.android.material.floatingactionbutton.a$3) = (r2v0 'impl' com.google.android.material.floatingactionbutton.a) call: com.google.android.material.floatingactionbutton.a.3.<init>(com.google.android.material.floatingactionbutton.a):void type: CONSTRUCTOR in method: com.google.android.material.floatingactionbutton.FloatingActionButton.onAttachedToWindow():void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 26 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.google.android.material.floatingactionbutton.a, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 30 more
                    */
                /*
                    this = this;
                    super.onAttachedToWindow()
                    com.google.android.material.floatingactionbutton.a r2 = r3.getImpl()
                    boolean r0 = r2.mo44094e()
                    if (r0 == 0) goto L_0x0023
                    android.view.ViewTreeObserver$OnPreDrawListener r0 = r2.f62983C
                    if (r0 != 0) goto L_0x0018
                    com.google.android.material.floatingactionbutton.a$3 r0 = new com.google.android.material.floatingactionbutton.a$3
                    r0.<init>()
                    r2.f62983C = r0
                L_0x0018:
                    com.google.android.material.internal.m r0 = r2.f62981A
                    android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
                    android.view.ViewTreeObserver$OnPreDrawListener r0 = r2.f62983C
                    r1.addOnPreDrawListener(r0)
                L_0x0023:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.onAttachedToWindow():void");
            }

            /* access modifiers changed from: protected */
            public final Parcelable onSaveInstanceState() {
                ExtendableSavedState extendableSavedState = new ExtendableSavedState(super.onSaveInstanceState());
                C0497g<String, Bundle> gVar = extendableSavedState.f63285a;
                C26628c cVar = this.f62966n;
                Bundle bundle = new Bundle();
                bundle.putBoolean("expanded", cVar.f62951b);
                bundle.putInt("expandedComponentIdHint", cVar.f62952c);
                gVar.put("expandableWidgetHelper", bundle);
                return extendableSavedState;
            }

            @Override // androidx.core.p037h.AbstractC0791u
            public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
                setBackgroundTintList(colorStateList);
            }

            @Override // androidx.core.p037h.AbstractC0791u
            public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
                setBackgroundTintMode(mode);
            }

            public final void setExpandedComponentIdHint(int i) {
                this.f62966n.f62952c = i;
            }

            public final void setHideMotionSpec(C26562h hVar) {
                getImpl().f62992e = hVar;
            }

            public final void setImageResource(int i) {
                this.f62965m.mo1932a(i);
            }

            public final void setRippleColor(int i) {
                setRippleColor(ColorStateList.valueOf(i));
            }

            public final void setShowMotionSpec(C26562h hVar) {
                getImpl().f62991d = hVar;
            }

            /* renamed from: c */
            private C26634a.AbstractC26641d m52832c(final AbstractC26632a aVar) {
                if (aVar == null) {
                    return null;
                }
                return new C26634a.AbstractC26641d() {
                    /* class com.google.android.material.floatingactionbutton.FloatingActionButton.C266311 */

                    static {
                        Covode.recordClassIndex(32080);
                    }
                };
            }

            public final void setCompatElevationResource(int i) {
                setCompatElevation(getResources().getDimension(i));
            }

            public final void setCompatHoveredFocusedTranslationZResource(int i) {
                setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
            }

            public final void setCompatPressedTranslationZResource(int i) {
                setCompatPressedTranslationZ(getResources().getDimension(i));
            }

            public final void setCustomSize(int i) {
                if (i >= 0) {
                    this.f62962j = i;
                    return;
                }
                throw new IllegalArgumentException("Custom size must be non-negative");
            }

            public final void setHideMotionSpecResource(int i) {
                setHideMotionSpec(C26562h.m52582a(getContext(), i));
            }

            public final void setImageDrawable(Drawable drawable) {
                super.setImageDrawable(drawable);
                C26634a impl = getImpl();
                impl.mo44085a(impl.f63005r);
            }

            public final void setRippleColor(ColorStateList colorStateList) {
                if (this.f62960h != colorStateList) {
                    this.f62960h = colorStateList;
                    getImpl().mo44087a(this.f62960h);
                }
            }

            public final void setShowMotionSpecResource(int i) {
                setShowMotionSpec(C26562h.m52582a(getContext(), i));
            }

            public final void setSize(int i) {
                this.f62962j = 0;
                if (i != this.f62961i) {
                    this.f62961i = i;
                    requestLayout();
                }
            }

            @Override // androidx.core.widget.AbstractC0826j
            public final void setSupportImageTintList(ColorStateList colorStateList) {
                if (this.f62958f != colorStateList) {
                    this.f62958f = colorStateList;
                    m52831b();
                }
            }

            @Override // androidx.core.widget.AbstractC0826j
            public final void setSupportImageTintMode(PorterDuff.Mode mode) {
                if (this.f62959g != mode) {
                    this.f62959g = mode;
                    m52831b();
                }
            }

            public final void setUseCompatPadding(boolean z) {
                if (this.f62954b != z) {
                    this.f62954b = z;
                    getImpl().mo44092c();
                }
            }

            public final void setBackgroundTintMode(PorterDuff.Mode mode) {
                if (this.f62957e != mode) {
                    this.f62957e = mode;
                    C26634a impl = getImpl();
                    if (impl.f62997j != null) {
                        C0705a.m2499a(impl.f62997j, mode);
                    }
                }
            }

            public final void setCompatElevation(float f) {
                C26634a impl = getImpl();
                if (impl.f63001n != f) {
                    impl.f63001n = f;
                    impl.mo44086a(impl.f63001n, impl.f63002o, impl.f63003p);
                }
            }

            public final void setCompatHoveredFocusedTranslationZ(float f) {
                C26634a impl = getImpl();
                if (impl.f63002o != f) {
                    impl.f63002o = f;
                    impl.mo44086a(impl.f63001n, impl.f63002o, impl.f63003p);
                }
            }

            public final void setCompatPressedTranslationZ(float f) {
                C26634a impl = getImpl();
                if (impl.f63003p != f) {
                    impl.f63003p = f;
                    impl.mo44086a(impl.f63001n, impl.f63002o, impl.f63003p);
                }
            }

            /* renamed from: a */
            public final boolean mo44026a(Rect rect) {
                if (!C0792v.m2788v(this)) {
                    return false;
                }
                rect.set(0, 0, getWidth(), getHeight());
                mo44027b(rect);
                return true;
            }

            public final boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 || !mo44026a(this.f62964l) || this.f62964l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            }

            public final void setBackgroundTintList(ColorStateList colorStateList) {
                if (this.f62956d != colorStateList) {
                    this.f62956d = colorStateList;
                    C26634a impl = getImpl();
                    if (impl.f62997j != null) {
                        C0705a.m2496a(impl.f62997j, colorStateList);
                    }
                    if (impl.f62999l != null) {
                        C26659a aVar = impl.f62999l;
                        if (colorStateList != null) {
                            aVar.f63121g = colorStateList.getColorForState(aVar.getState(), aVar.f63121g);
                        }
                        aVar.f63120f = colorStateList;
                        aVar.f63122h = true;
                        aVar.invalidateSelf();
                    }
                }
            }

            /* renamed from: b */
            public final void mo44027b(Rect rect) {
                rect.left += this.f62955c.left;
                rect.top += this.f62955c.top;
                rect.right -= this.f62955c.right;
                rect.bottom -= this.f62955c.bottom;
            }

            /* access modifiers changed from: protected */
            public final void onRestoreInstanceState(Parcelable parcelable) {
                if (!(parcelable instanceof ExtendableSavedState)) {
                    super.onRestoreInstanceState(parcelable);
                    return;
                }
                ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
                super.onRestoreInstanceState(extendableSavedState.f3089d);
                C26628c cVar = this.f62966n;
                Bundle bundle = extendableSavedState.f63285a.get("expandableWidgetHelper");
                cVar.f62951b = bundle.getBoolean("expanded", false);
                cVar.f62952c = bundle.getInt("expandedComponentIdHint", 0);
                if (cVar.f62951b) {
                    ViewParent parent = cVar.f62950a.getParent();
                    if (parent instanceof CoordinatorLayout) {
                        ((CoordinatorLayout) parent).mo2468a(cVar.f62950a);
                    }
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public final void mo44025a(AbstractC26632a aVar) {
                C26562h hVar;
                C26634a impl = getImpl();
                C26634a.AbstractC26641d c = m52832c(aVar);
                if (!impl.mo44095f()) {
                    if (impl.f62990c != null) {
                        impl.f62990c.cancel();
                    }
                    if (impl.mo44096g()) {
                        if (impl.f62981A.getVisibility() != 0) {
                            impl.f62981A.setAlpha(0.0f);
                            impl.f62981A.setScaleY(0.0f);
                            impl.f62981A.setScaleX(0.0f);
                            impl.mo44085a(0.0f);
                        }
                        if (impl.f62991d != null) {
                            hVar = impl.f62991d;
                        } else {
                            if (impl.f62993f == null) {
                                impl.f62993f = C26562h.m52582a(impl.f62981A.getContext(), (int) R.animator.c);
                            }
                            hVar = impl.f62993f;
                        }
                        AnimatorSet a = impl.mo44084a(hVar, 1.0f, 1.0f, 1.0f);
                        a.addListener(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0049: INVOKE  
                              (r2v1 'a' android.animation.AnimatorSet)
                              (wrap: com.google.android.material.floatingactionbutton.a$2 : 0x0046: CONSTRUCTOR  (r0v16 com.google.android.material.floatingactionbutton.a$2) = 
                              (r3v0 'impl' com.google.android.material.floatingactionbutton.a)
                              (r4v0 'c' com.google.android.material.floatingactionbutton.a$d)
                             call: com.google.android.material.floatingactionbutton.a.2.<init>(com.google.android.material.floatingactionbutton.a, com.google.android.material.floatingactionbutton.a$d):void type: CONSTRUCTOR)
                             type: VIRTUAL call: android.animation.AnimatorSet.addListener(android.animation.Animator$AnimatorListener):void in method: com.google.android.material.floatingactionbutton.FloatingActionButton.a(com.google.android.material.floatingactionbutton.FloatingActionButton$a):void, file: classes9.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0046: CONSTRUCTOR  (r0v16 com.google.android.material.floatingactionbutton.a$2) = 
                              (r3v0 'impl' com.google.android.material.floatingactionbutton.a)
                              (r4v0 'c' com.google.android.material.floatingactionbutton.a$d)
                             call: com.google.android.material.floatingactionbutton.a.2.<init>(com.google.android.material.floatingactionbutton.a, com.google.android.material.floatingactionbutton.a$d):void type: CONSTRUCTOR in method: com.google.android.material.floatingactionbutton.FloatingActionButton.a(com.google.android.material.floatingactionbutton.FloatingActionButton$a):void, file: classes9.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 28 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.google.android.material.floatingactionbutton.a, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 34 more
                            */
                        /*
                        // Method dump skipped, instructions count: 153
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.mo44025a(com.google.android.material.floatingactionbutton.FloatingActionButton$a):void");
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: b */
                    public final void mo44028b(AbstractC26632a aVar) {
                        C26562h hVar;
                        C26634a impl = getImpl();
                        C26634a.AbstractC26641d c = m52832c(aVar);
                        if (impl.f62981A.getVisibility() == 0) {
                            if (impl.f62989b == 1) {
                                return;
                            }
                        } else if (impl.f62989b != 2) {
                            return;
                        }
                        if (impl.f62990c != null) {
                            impl.f62990c.cancel();
                        }
                        if (impl.mo44096g()) {
                            if (impl.f62992e != null) {
                                hVar = impl.f62992e;
                            } else {
                                if (impl.f62994g == null) {
                                    impl.f62994g = C26562h.m52582a(impl.f62981A.getContext(), (int) R.animator.b);
                                }
                                hVar = impl.f62994g;
                            }
                            AnimatorSet a = impl.mo44084a(hVar, 0.0f, 0.0f, 0.0f);
                            a.addListener(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003c: INVOKE  
                                  (r2v1 'a' android.animation.AnimatorSet)
                                  (wrap: com.google.android.material.floatingactionbutton.a$1 : 0x0039: CONSTRUCTOR  (r0v11 com.google.android.material.floatingactionbutton.a$1) = 
                                  (r3v0 'impl' com.google.android.material.floatingactionbutton.a)
                                  (r4v0 'c' com.google.android.material.floatingactionbutton.a$d)
                                 call: com.google.android.material.floatingactionbutton.a.1.<init>(com.google.android.material.floatingactionbutton.a, com.google.android.material.floatingactionbutton.a$d):void type: CONSTRUCTOR)
                                 type: VIRTUAL call: android.animation.AnimatorSet.addListener(android.animation.Animator$AnimatorListener):void in method: com.google.android.material.floatingactionbutton.FloatingActionButton.b(com.google.android.material.floatingactionbutton.FloatingActionButton$a):void, file: classes9.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0039: CONSTRUCTOR  (r0v11 com.google.android.material.floatingactionbutton.a$1) = 
                                  (r3v0 'impl' com.google.android.material.floatingactionbutton.a)
                                  (r4v0 'c' com.google.android.material.floatingactionbutton.a$d)
                                 call: com.google.android.material.floatingactionbutton.a.1.<init>(com.google.android.material.floatingactionbutton.a, com.google.android.material.floatingactionbutton.a$d):void type: CONSTRUCTOR in method: com.google.android.material.floatingactionbutton.FloatingActionButton.b(com.google.android.material.floatingactionbutton.FloatingActionButton$a):void, file: classes9.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                	... 21 more
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.google.android.material.floatingactionbutton.a, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                	... 27 more
                                */
                            /*
                            // Method dump skipped, instructions count: 122
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.mo44028b(com.google.android.material.floatingactionbutton.FloatingActionButton$a):void");
                        }

                        /* renamed from: a */
                        private static int m52829a(int i, int i2) {
                            int mode = View.MeasureSpec.getMode(i2);
                            int size = View.MeasureSpec.getSize(i2);
                            if (mode == Integer.MIN_VALUE) {
                                return Math.min(i, size);
                            }
                            if (mode == 0) {
                                return i;
                            }
                            if (mode == 1073741824) {
                                return size;
                            }
                            throw new IllegalArgumentException();
                        }

                        /* access modifiers changed from: protected */
                        public final void onMeasure(int i, int i2) {
                            int sizeDimension = getSizeDimension();
                            this.f62953a = (sizeDimension - this.f62963k) / 2;
                            getImpl().mo44093d();
                            int min = Math.min(m52829a(sizeDimension, i), m52829a(sizeDimension, i2));
                            setMeasuredDimension(this.f62955c.left + min + this.f62955c.right, min + this.f62955c.top + this.f62955c.bottom);
                        }
                    }
