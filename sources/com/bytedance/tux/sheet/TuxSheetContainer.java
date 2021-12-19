package com.bytedance.tux.sheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.sheet.sheet.TuxSheetHandle;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class TuxSheetContainer extends RelativeLayout {

    /* renamed from: c */
    public static final C23197a f54948c = new C23197a((byte) 0);

    /* renamed from: a */
    public boolean f54949a;

    /* renamed from: b */
    public TuxSheetHandle f54950b;

    /* renamed from: d */
    private int f54951d;

    /* renamed from: e */
    private int f54952e;

    /* renamed from: f */
    private int f54953f;

    /* renamed from: g */
    private int f54954g;

    /* renamed from: h */
    private AbstractC89171a<C89391z> f54955h;

    /* renamed from: i */
    private BottomSheetBehavior.AbstractC26607a f54956i;

    /* renamed from: j */
    private final AbstractC89244h f54957j;

    /* renamed from: k */
    private BottomSheetBehavior<?> f54958k;

    static {
        Covode.recordClassIndex(27135);
    }

    public TuxSheetContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final int getMinHeightPx() {
        return ((Number) this.f54957j.getValue()).intValue();
    }

    /* renamed from: com.bytedance.tux.sheet.TuxSheetContainer$a */
    public static final class C23197a {
        static {
            Covode.recordClassIndex(27136);
        }

        private C23197a() {
        }

        public /* synthetic */ C23197a(byte b) {
            this();
        }
    }

    public final BottomSheetBehavior<?> getBehavior() {
        return this.f54958k;
    }

    public final BottomSheetBehavior.AbstractC26607a getBottomSheetCallback() {
        return this.f54956i;
    }

    public final AbstractC89171a<C89391z> getDismissFunc() {
        return this.f54955h;
    }

    public final int getDynamicMaxHeightPx() {
        return this.f54954g;
    }

    public final int getDynamicPeekHeightPx() {
        return this.f54953f;
    }

    public final int getFixedHeightPx() {
        return this.f54952e;
    }

    public final int getVariant() {
        return this.f54951d;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f54950b = (TuxSheetHandle) findViewById(R.id.dzj);
    }

    /* renamed from: com.bytedance.tux.sheet.TuxSheetContainer$b */
    static final class C23198b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ TuxSheetContainer f54959a;

        static {
            Covode.recordClassIndex(27137);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23198b(TuxSheetContainer tuxSheetContainer) {
            super(0);
            this.f54959a = tuxSheetContainer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.f54959a.getResources().getDimensionPixelSize(R.dimen.a0l));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.view.View] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            int r2 = r5.f54951d
            r1 = 0
            r0 = 2
            if (r2 == r0) goto L_0x000c
            r0 = 3
            if (r2 != r0) goto L_0x005f
        L_0x000c:
            r4 = 1
        L_0x000d:
            com.bytedance.tux.sheet.sheet.TuxSheetHandle r0 = r5.f54950b
            if (r0 == 0) goto L_0x0016
            if (r4 == 0) goto L_0x005c
        L_0x0013:
            r0.setVisibility(r1)
        L_0x0016:
            r3 = r5
        L_0x0017:
            r2 = 0
            android.view.ViewParent r1 = r3.getParent()
            boolean r0 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r0 == 0) goto L_0x0052
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r5.f54958k
            if (r0 != 0) goto L_0x003c
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.m52754a(r3)
        L_0x0028:
            r5.f54958k = r1
            if (r1 == 0) goto L_0x0033
            com.bytedance.tux.sheet.TuxSheetContainer$c r0 = new com.bytedance.tux.sheet.TuxSheetContainer$c
            r0.<init>(r5, r4)
            r1.f62901o = r0
        L_0x0033:
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r1 = r5.f54958k
            if (r1 == 0) goto L_0x003b
            boolean r0 = r5.f54949a
            r1.f62894h = r0
        L_0x003b:
            return
        L_0x003c:
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            boolean r0 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C0560e
            if (r0 != 0) goto L_0x0050
        L_0x0044:
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0560e) r2
            if (r2 == 0) goto L_0x004d
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r5.f54958k
            r2.mo2538a(r0)
        L_0x004d:
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r1 = r5.f54958k
            goto L_0x0028
        L_0x0050:
            r2 = r1
            goto L_0x0044
        L_0x0052:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x005b
            android.view.View r1 = (android.view.View) r1
            r3 = r1
            if (r3 != 0) goto L_0x0017
        L_0x005b:
            return
        L_0x005c:
            r1 = 8
            goto L_0x0013
        L_0x005f:
            r4 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.sheet.TuxSheetContainer.onAttachedToWindow():void");
    }

    public final void setBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        this.f54958k = bottomSheetBehavior;
    }

    public final void setBottomSheetCallback(BottomSheetBehavior.AbstractC26607a aVar) {
        this.f54956i = aVar;
    }

    public final void setDismissFunc(AbstractC89171a<C89391z> aVar) {
        this.f54955h = aVar;
    }

    public final void setDynamicMaxHeightPx(int i) {
        this.f54954g = i;
    }

    public final void setDynamicPeekHeightPx(int i) {
        this.f54953f = i;
    }

    public final void setFixedHeightPx(int i) {
        this.f54952e = i;
    }

    public final void setHideable(boolean z) {
        this.f54949a = z;
    }

    public final void setVariant(int i) {
        this.f54951d = i;
    }

    public final void setHideable$tux_release(boolean z) {
        this.f54949a = z;
        BottomSheetBehavior<?> bottomSheetBehavior = this.f54958k;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.f62894h = z;
        }
    }

    /* renamed from: com.bytedance.tux.sheet.TuxSheetContainer$c */
    public static final class C23199c extends BottomSheetBehavior.AbstractC26607a {

        /* renamed from: a */
        final /* synthetic */ TuxSheetContainer f54960a;

        /* renamed from: b */
        final /* synthetic */ boolean f54961b;

        static {
            Covode.recordClassIndex(27138);
        }

        C23199c(TuxSheetContainer tuxSheetContainer, boolean z) {
            this.f54960a = tuxSheetContainer;
            this.f54961b = z;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
        /* renamed from: a */
        public final void mo37774a(View view, float f) {
            TuxSheetHandle tuxSheetHandle;
            BottomSheetBehavior.AbstractC26607a bottomSheetCallback;
            C89219l.m154719c(view, "");
            if (!(!this.f54961b || (tuxSheetHandle = this.f54960a.f54950b) == null || (bottomSheetCallback = tuxSheetHandle.getBottomSheetCallback()) == null)) {
                bottomSheetCallback.mo37774a(view, f);
            }
            BottomSheetBehavior.AbstractC26607a bottomSheetCallback2 = this.f54960a.getBottomSheetCallback();
            if (bottomSheetCallback2 != null) {
                bottomSheetCallback2.mo37774a(view, f);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
        /* renamed from: a */
        public final void mo37775a(View view, int i) {
            AbstractC89171a<C89391z> dismissFunc;
            TuxSheetHandle tuxSheetHandle;
            int i2;
            BottomSheetBehavior.AbstractC26607a bottomSheetCallback;
            C89219l.m154719c(view, "");
            if (this.f54961b) {
                TuxSheetHandle tuxSheetHandle2 = this.f54960a.f54950b;
                if (!(tuxSheetHandle2 == null || (bottomSheetCallback = tuxSheetHandle2.getBottomSheetCallback()) == null)) {
                    bottomSheetCallback.mo37775a(view, i);
                }
                if (this.f54960a.getVariant() == 3 && (tuxSheetHandle = this.f54960a.f54950b) != null) {
                    if (i == 3) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    tuxSheetHandle.setVisibility(i2);
                }
            }
            if (i == 5 && (dismissFunc = this.f54960a.getDismissFunc()) != null) {
                dismissFunc.invoke();
            }
            BottomSheetBehavior.AbstractC26607a bottomSheetCallback2 = this.f54960a.getBottomSheetCallback();
            if (bottomSheetCallback2 != null) {
                bottomSheetCallback2.mo37775a(view, i);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        if (r1 > 0) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.sheet.TuxSheetContainer.onMeasure(int, int):void");
    }

    private /* synthetic */ TuxSheetContainer(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxSheetContainer(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(9961);
        this.f54949a = true;
        this.f54952e = -1;
        this.f54953f = -1;
        this.f54954g = -1;
        this.f54957j = C89250i.m154773a((AbstractC89171a) new C23198b(this));
        MethodCollector.m26664o(9961);
    }
}
