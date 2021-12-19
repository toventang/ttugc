package com.p2082ss.android.ugc.aweme.homepage.story.container;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.core.content.C0643b;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.p030b.C0622a;
import androidx.core.p037h.C0774e;
import androidx.core.p037h.C0792v;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1722h.C23155d;
import com.p2082ss.android.ugc.aweme.homepage.story.container.C53080m;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer */
public class StepDrawerContainer extends ViewGroup {

    /* renamed from: H */
    private static final int[] f121927H = {16843828};

    /* renamed from: I */
    private static final boolean f121928I;

    /* renamed from: e */
    public static final int[] f121929e = {16842931};

    /* renamed from: f */
    public static final boolean f121930f = true;

    /* renamed from: g */
    public static final C53036a f121931g = new C53036a((byte) 0);

    /* renamed from: A */
    private boolean f121932A;

    /* renamed from: B */
    private Drawable f121933B;

    /* renamed from: C */
    private Drawable f121934C;

    /* renamed from: D */
    private boolean f121935D;

    /* renamed from: E */
    private Drawable f121936E;

    /* renamed from: F */
    private int f121937F;

    /* renamed from: G */
    private final Paint f121938G;

    /* renamed from: a */
    Object f121939a;

    /* renamed from: b */
    boolean f121940b;

    /* renamed from: c */
    C89378p<Boolean, Integer> f121941c = new C89378p<>(false, 0);

    /* renamed from: d */
    public boolean f121942d;

    /* renamed from: h */
    private final int f121943h;

    /* renamed from: i */
    private float f121944i;

    /* renamed from: j */
    private final C53080m f121945j;

    /* renamed from: k */
    private final C53040d f121946k;

    /* renamed from: l */
    private int f121947l;

    /* renamed from: m */
    private boolean f121948m;

    /* renamed from: n */
    private boolean f121949n = true;

    /* renamed from: o */
    private int f121950o = 3;

    /* renamed from: p */
    private int f121951p = 3;

    /* renamed from: q */
    private boolean f121952q;

    /* renamed from: r */
    private List<AbstractC53037b> f121953r;

    /* renamed from: s */
    private float f121954s;

    /* renamed from: t */
    private float f121955t;

    /* renamed from: u */
    private float f121956u;

    /* renamed from: v */
    private float f121957v;

    /* renamed from: w */
    private Drawable f121958w;

    /* renamed from: x */
    private final ArrayList<View> f121959x;

    /* renamed from: y */
    private Rect f121960y;

    /* renamed from: z */
    private Matrix f121961z;

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer$SavedState */
    protected static final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C53035b();

        /* renamed from: f */
        public static final C53034a f121963f = new C53034a((byte) 0);

        /* renamed from: a */
        public int f121964a;

        /* renamed from: b */
        public int f121965b;

        /* renamed from: e */
        public int f121966e;

        /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer$SavedState$a */
        public static final class C53034a {
            static {
                Covode.recordClassIndex(62577);
            }

            private C53034a() {
            }

            public /* synthetic */ C53034a(byte b) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer$SavedState$b */
        public static final class C53035b implements Parcelable.ClassLoaderCreator<SavedState> {
            static {
                Covode.recordClassIndex(62578);
            }

            C53035b() {
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                C89219l.m154721d(parcel, "");
                return new SavedState(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                C89219l.m154721d(parcel, "");
                C89219l.m154721d(classLoader, "");
                return new SavedState(parcel, classLoader);
            }
        }

        static {
            Covode.recordClassIndex(62576);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SavedState(Parcelable parcelable) {
            super(parcelable);
            C89219l.m154721d(parcelable, "");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            C89219l.m154721d(parcel, "");
            this.f121964a = parcel.readInt();
            this.f121965b = parcel.readInt();
            this.f121966e = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState
        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154721d(parcel, "");
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f121964a);
            parcel.writeInt(this.f121965b);
            parcel.writeInt(this.f121966e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer$b */
    public interface AbstractC53037b {
        static {
            Covode.recordClassIndex(62580);
        }

        /* renamed from: a */
        void mo89542a(int i, boolean z, boolean z2);

        /* renamed from: a */
        void mo89543a(View view, float f, boolean z, float f2);

        /* renamed from: a */
        void mo89544a(View view, boolean z);

        /* renamed from: a */
        void mo89545a(View view, boolean z, boolean z2);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer$c */
    public static final class C53038c extends ViewGroup.MarginLayoutParams {

        /* renamed from: e */
        public static final C53039a f121967e = new C53039a((byte) 0);

        /* renamed from: a */
        public C89386u<Float, Integer, Boolean> f121968a;

        /* renamed from: b */
        public int f121969b;

        /* renamed from: c */
        public float f121970c;

        /* renamed from: d */
        public int f121971d;

        static {
            Covode.recordClassIndex(62581);
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer$c$a */
        public static final class C53039a {
            static {
                Covode.recordClassIndex(62582);
            }

            private C53039a() {
            }

            public /* synthetic */ C53039a(byte b) {
                this();
            }
        }

        public C53038c() {
            super(-1, -1);
        }

        /* renamed from: a */
        public final boolean mo89546a() {
            if ((this.f121971d & 3) == 3) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo89547b() {
            C89386u<Float, Integer, Boolean> uVar = this.f121968a;
            if (uVar == null || uVar.getFirst().floatValue() == 0.0f) {
                return false;
            }
            return true;
        }

        public C53038c(int i) {
            this();
            this.f121969b = i;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53038c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            C89219l.m154721d(layoutParams, "");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53038c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            C89219l.m154721d(marginLayoutParams, "");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53038c(C53038c cVar) {
            super((ViewGroup.MarginLayoutParams) cVar);
            C89219l.m154721d(cVar, "");
            this.f121969b = cVar.f121969b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53038c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C89219l.m154721d(context, "");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, StepDrawerContainer.f121929e);
            C89219l.m154716b(obtainStyledAttributes, "");
            this.f121969b = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    private static /* synthetic */ void getMLockModeEnd$annotations() {
    }

    private static /* synthetic */ void getMLockModeStart$annotations() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo89475a(boolean z, float f) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo89480a(View view, int i, int i2) {
        C89219l.m154721d(view, "");
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer$a */
    public static final class C53036a {
        static {
            Covode.recordClassIndex(62579);
        }

        private C53036a() {
        }

        public /* synthetic */ C53036a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m98001a(int i) {
            String hexString = Integer.toHexString(i);
            C89219l.m154716b(hexString, "");
            return hexString;
        }
    }

    public final C89378p<Boolean, Integer> getFakeState() {
        return this.f121941c;
    }

    /* access modifiers changed from: protected */
    public final float getInitialMotionX() {
        return this.f121954s;
    }

    /* access modifiers changed from: protected */
    public final float getInitialMotionY() {
        return this.f121955t;
    }

    /* access modifiers changed from: protected */
    public final float getLastMoveX() {
        return this.f121956u;
    }

    /* access modifiers changed from: protected */
    public final float getLastMoveY() {
        return this.f121957v;
    }

    /* access modifiers changed from: protected */
    public final C53080m getMDragHelper() {
        return this.f121945j;
    }

    /* access modifiers changed from: protected */
    public final int getMDrawerState() {
        return this.f121947l;
    }

    public final boolean getMaybeClose() {
        return this.f121932A;
    }

    /* access modifiers changed from: protected */
    public final boolean getNeedDrawShadow() {
        return this.f121935D;
    }

    public final Drawable getStatusBarBackgroundDrawable() {
        return this.f121958w;
    }

    /* renamed from: a */
    public final boolean mo89477a() {
        return C0792v.m2768e(this) == 1;
    }

    /* renamed from: a */
    public final void mo89473a(AbstractC53037b bVar) {
        C89219l.m154721d(bVar, "");
        if (this.f121953r == null) {
            this.f121953r = new ArrayList();
        }
        List<AbstractC53037b> list = this.f121953r;
        if (list == null) {
            C89219l.m154715b();
        }
        list.add(bVar);
    }

    /* renamed from: a */
    public final boolean mo89479a(View view, int i) {
        C89219l.m154721d(view, "");
        return (m97974e(view) & i) == i;
    }

    /* renamed from: a */
    public final boolean mo89478a(float f, float f2, float f3, float f4) {
        int i;
        int i2;
        View a;
        if (this.f121944i > 0.0f && m97978g()) {
            if (m97972c(this.f121954s, this.f121955t) && (a = this.f121945j.mo89594a((i = (int) f), (i2 = (int) f2))) != null) {
                C89219l.m154716b(a, "");
                if (!mo89480a(a, i, i2)) {
                    return false;
                }
            }
            if (m97968b(f, f2)) {
                float f5 = (float) this.f121945j.f122055b;
                mo89475a(Math.abs(f3) > f5 || Math.abs(f4) > f5, f4);
                mo89562c(false);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo89481a(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        if (view instanceof ViewGroup) {
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                C89219l.m154716b(childAt, "");
                if (childAt.getVisibility() == 0 && (i4 = i2 + scrollX) >= childAt.getLeft() && i4 < childAt.getRight() && (i5 = i3 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && mo89481a(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo89476a(boolean z, boolean z2) {
        View b = mo89483b(8388611);
        if (b != null) {
            m97973d(b, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + C53036a.m98001a(8388611));
    }

    /* renamed from: f */
    private void m97977f() {
        mo89562c(false);
    }

    /* renamed from: b */
    public final void mo89484b() {
        mo89485b(true);
    }

    /* renamed from: c */
    public final boolean mo89487c() {
        return m97978g();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C53038c();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f121949n = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f121949n = true;
    }

    public void requestLayout() {
        if (!this.f121948m) {
            super.requestLayout();
        }
    }

    /* renamed from: g */
    private boolean m97978g() {
        View b = mo89483b(8388611);
        if (b != null) {
            return mo89493d(b);
        }
        return false;
    }

    private final float getDensity() {
        Resources resources = getResources();
        C89219l.m154716b(resources, "");
        return resources.getDisplayMetrics().density;
    }

    static {
        Covode.recordClassIndex(62574);
        boolean z = false;
        int i = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        f121928I = z;
    }

    /* renamed from: e */
    private boolean mo89563e() {
        if (this.f121950o != 1 || this.f121951p != 1) {
            return false;
        }
        if (!m97978g()) {
            return true;
        }
        mo89485b(true);
        return true;
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C89219l.m154716b(childAt, "");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
            f = Math.max(f, ((C53038c) layoutParams).f121970c);
        }
        this.f121944i = f;
        if (this.f121945j.mo89606b()) {
            C0792v.m2764c(this);
        }
    }

    /* renamed from: d */
    public final void mo89492d() {
        if (this.f121941c.getFirst().booleanValue()) {
            setFakeLeft(this.f121941c.getSecond().intValue());
            this.f121941c = this.f121941c.copy(false, 0);
        }
    }

    /* renamed from: h */
    private View m97979h() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C89219l.m154716b(childAt, "");
            if (mo89488c(childAt)) {
                if (mo89488c(childAt)) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
                    if (((C53038c) layoutParams).f121970c > 0.0f) {
                        return childAt;
                    }
                } else {
                    throw new IllegalArgumentException(("View " + childAt + " is not a drawer").toString());
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C53038c cVar;
        boolean z;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            C89219l.m154715b();
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            C89219l.m154716b(childAt, "");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
            cVar = (C53038c) layoutParams;
            boolean z2 = true;
            if (cVar.f121971d == 1) {
                z = true;
            } else {
                z = false;
            }
            if (cVar.f121971d != 4) {
                z2 = false;
            }
            if (z || z2) {
                savedState.f121964a = cVar.f121969b;
            } else {
                i++;
            }
        }
        savedState.f121964a = cVar.f121969b;
        savedState.f121965b = this.f121950o;
        savedState.f121966e = this.f121951p;
        return savedState;
    }

    /* renamed from: a */
    public final void mo89474a(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* access modifiers changed from: protected */
    public final void setInitialMotionX(float f) {
        this.f121954s = f;
    }

    /* access modifiers changed from: protected */
    public final void setInitialMotionY(float f) {
        this.f121955t = f;
    }

    /* access modifiers changed from: protected */
    public final void setLastMoveX(float f) {
        this.f121956u = f;
    }

    /* access modifiers changed from: protected */
    public final void setLastMoveY(float f) {
        this.f121957v = f;
    }

    public final void setLockReleaseStep(boolean z) {
        this.f121942d = z;
    }

    public final void setMaybeClose(boolean z) {
        this.f121932A = z;
    }

    /* access modifiers changed from: protected */
    public final void setNeedDrawShadow(boolean z) {
        this.f121935D = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer$d */
    final class C53040d extends C53080m.AbstractC53083a {

        /* renamed from: a */
        public C53080m f121972a;

        static {
            Covode.recordClassIndex(62583);
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.C53080m.AbstractC53083a
        /* renamed from: a */
        public final boolean mo89552a(View view) {
            C89219l.m154721d(view, "");
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.C53080m.AbstractC53083a
        /* renamed from: b */
        public final void mo89554b(View view) {
            C89219l.m154721d(view, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C53040d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.C53080m.AbstractC53083a
        /* renamed from: d */
        public final int mo89556d(View view) {
            C89219l.m154721d(view, "");
            return view.getTop();
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.C53080m.AbstractC53083a
        /* renamed from: c */
        public final int mo89555c(View view) {
            C89219l.m154721d(view, "");
            if (StepDrawerContainer.this.mo89488c(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.C53080m.AbstractC53083a
        /* renamed from: a */
        public final void mo89548a(int i) {
            C53080m mVar = this.f121972a;
            if (mVar == null) {
                C89219l.m154715b();
            }
            View view = mVar.f122068o;
            if (view != null) {
                C89219l.m154716b(view, "");
                if (!StepDrawerContainer.this.mo89486b(view) && StepDrawerContainer.this.mo89488c(view)) {
                    StepDrawerContainer stepDrawerContainer = StepDrawerContainer.this;
                    C53080m mVar2 = this.f121972a;
                    if (mVar2 == null) {
                        C89219l.m154715b();
                    }
                    stepDrawerContainer.mo89471a(i, mVar2.f122068o);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.C53080m.AbstractC53083a
        /* renamed from: b */
        public final int mo89553b(View view, int i) {
            int width;
            C89219l.m154721d(view, "");
            if (!StepDrawerContainer.this.mo89488c(view)) {
                return 0;
            }
            int a = StepDrawerContainer.this.mo89470a(view, false);
            if (StepDrawerContainer.this.mo89479a(view, 3)) {
                width = a;
                a = -view.getWidth();
            } else {
                width = StepDrawerContainer.this.getWidth();
            }
            return C0622a.m2312a(i, a, width);
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.C53080m.AbstractC53083a
        /* renamed from: a */
        public final void mo89550a(View view, int i) {
            float width;
            int i2;
            C89219l.m154721d(view, "");
            if (StepDrawerContainer.this.mo89488c(view)) {
                int width2 = view.getWidth();
                if (StepDrawerContainer.this.mo89479a(view, 3)) {
                    width = (float) (i + width2);
                } else {
                    width = (float) (StepDrawerContainer.this.getWidth() - i);
                }
                float f = width / ((float) width2);
                StepDrawerContainer.this.mo89472a(view, f);
                if (f == 0.0f) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                view.setVisibility(i2);
                StepDrawerContainer.this.invalidate();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
            if (r12 > 0.5f) goto L_0x006c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ad, code lost:
            if (r12 >= 0.0f) goto L_0x011e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b8, code lost:
            if (r12 > 0.5f) goto L_0x006c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00eb, code lost:
            if (r12 > 0.5f) goto L_0x011e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f0, code lost:
            if (r12 >= 0.0f) goto L_0x00db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x00fb, code lost:
            if (r12 > 0.5f) goto L_0x011e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0102, code lost:
            if (r12 > 0.5f) goto L_0x00db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0109, code lost:
            if (r11 != false) goto L_0x00db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0113, code lost:
            if (r12 > (r3.floatValue() / 2.0f)) goto L_0x00db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x011c, code lost:
            if (r12 > 0.5f) goto L_0x011e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x0125, code lost:
            if (r11 != false) goto L_0x011e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x012f, code lost:
            if (r12 > (r3.floatValue() / 2.0f)) goto L_0x011e;
         */
        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.C53080m.AbstractC53083a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo89549a(android.view.View r14, float r15) {
            /*
            // Method dump skipped, instructions count: 323
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.C53040d.mo89549a(android.view.View, float):void");
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.C53080m.AbstractC53083a
        /* renamed from: a */
        public final boolean mo89551a(float f, float f2, float f3, float f4, int i, View view) {
            C53080m mVar;
            View b;
            int i2;
            C53080m mVar2;
            View b2;
            C89219l.m154721d(view, "");
            boolean b3 = StepDrawerContainer.this.mo89486b(view);
            boolean c = StepDrawerContainer.this.mo89488c(view);
            boolean z = true;
            if (b3) {
                int i3 = 8388613;
                if (f3 < 0.0f) {
                    i2 = 8388613;
                } else {
                    i2 = 8388611;
                }
                if (StepDrawerContainer.this.mo89477a()) {
                    if (i2 == 8388613) {
                        i3 = 8388611;
                    }
                    i2 = i3;
                }
                if (!StepDrawerContainer.m97965a(f3, f4) && (((mVar2 = this.f121972a) == null || !mVar2.mo89606b()) && (b2 = StepDrawerContainer.this.mo89483b(8388611)) != null && ((StepDrawerContainer.this.mo89493d(b2) || (b2 = StepDrawerContainer.this.mo89483b(i2)) != null) && StepDrawerContainer.this.mo89469a(i2) == 0 && !StepDrawerContainer.this.mo89481a(view, false, (int) f3, (int) f, (int) f2)))) {
                    C53080m mVar3 = this.f121972a;
                    if (mVar3 == null) {
                        C89219l.m154715b();
                    }
                    mVar3.mo89601a(b2, i);
                } else {
                    z = false;
                }
                StepDrawerContainer.this.mo89474a(z);
                if (!z) {
                    StepDrawerContainer.this.mo89478a(f, f2, f3, f4);
                } else {
                    StepDrawerContainer.this.setMaybeClose(false);
                }
            } else if (!c) {
                return false;
            } else {
                if (!StepDrawerContainer.m97965a(f3, f4) && (((mVar = this.f121972a) == null || !mVar.mo89606b()) && (b = StepDrawerContainer.this.mo89483b(8388611)) != null && !(!C89219l.m154714a(b, view)) && !StepDrawerContainer.this.mo89481a(view, false, (int) f3, (int) f, (int) f2))) {
                    C53080m mVar4 = this.f121972a;
                    if (mVar4 == null) {
                        C89219l.m154715b();
                    }
                    mVar4.mo89601a(b, i);
                } else {
                    z = false;
                }
            }
            return z;
        }
    }

    public final void setFakeState(C89378p<Boolean, Integer> pVar) {
        C89219l.m154721d(pVar, "");
        this.f121941c = pVar;
    }

    public final void setScrimColor(int i) {
        this.f121937F = i;
        invalidate();
    }

    public final void setStatusBarBackground(Drawable drawable) {
        this.f121958w = drawable;
        invalidate();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            mo89562c(true);
        }
    }

    /* access modifiers changed from: protected */
    public final void setDrawerLockMode(int i) {
        m97963a(i, 8388611);
        m97963a(i, 8388613);
    }

    public final void setStatusBarBackgroundColor(int i) {
        this.f121958w = new ColorDrawable(i);
        invalidate();
    }

    /* renamed from: a */
    public static float m97962a(View view) {
        C89219l.m154721d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
        return ((C53038c) layoutParams).f121970c;
    }

    /* renamed from: e */
    private int m97974e(View view) {
        C89219l.m154721d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
        return C0774e.m2693a(((C53038c) layoutParams).f121969b, C0792v.m2768e(this));
    }

    public boolean canScrollHorizontally(int i) {
        if (super.canScrollHorizontally(i) || m97978g() || this.f121947l != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C89219l.m154721d(layoutParams, "");
        if (!(layoutParams instanceof C53038c) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C89219l.m154721d(attributeSet, "");
        Context context = getContext();
        C89219l.m154716b(context, "");
        return new C53038c(context, attributeSet);
    }

    public void onRtlPropertiesChanged(int i) {
        int e = C0792v.m2768e(this);
        if (e == 0) {
            Drawable drawable = this.f121933B;
            if (drawable != null) {
                m97964a(drawable, e);
                return;
            }
            return;
        }
        Drawable drawable2 = this.f121934C;
        if (drawable2 != null) {
            m97964a(drawable2, e);
        }
    }

    public final void setStatusBarBackground(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0643b.m2369a(getContext(), i);
        } else {
            drawable = null;
        }
        this.f121958w = drawable;
        invalidate();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C89219l.m154721d(layoutParams, "");
        if (layoutParams instanceof C53038c) {
            return new C53038c((C53038c) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C53038c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C53038c(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View b;
        C89219l.m154721d(parcelable, "");
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3089d);
        if (!(savedState.f121964a == 0 || (b = mo89483b(savedState.f121964a)) == null)) {
            m97973d(b, true);
        }
        if (savedState.f121965b != 3) {
            m97963a(savedState.f121965b, 8388611);
        }
        if (savedState.f121966e != 3) {
            m97963a(savedState.f121966e, 8388613);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 1) {
            if (this.f121932A) {
                mo89478a(motionEvent.getX(), motionEvent.getY(), motionEvent.getX() - this.f121954s, motionEvent.getY() - this.f121955t);
            }
        } else if (actionMasked == 2) {
            this.f121956u = motionEvent.getX();
            this.f121957v = motionEvent.getY();
        }
        return dispatchTouchEvent;
    }

    public void onDraw(Canvas canvas) {
        Object obj;
        int systemWindowInsetTop;
        MethodCollector.m26663i(2901);
        C89219l.m154721d(canvas, "");
        super.onDraw(canvas);
        if (this.f121940b && this.f121958w != null && Build.VERSION.SDK_INT >= 21 && (obj = this.f121939a) != null && (systemWindowInsetTop = ((WindowInsets) obj).getSystemWindowInsetTop()) > 0) {
            Drawable drawable = this.f121958w;
            if (drawable == null) {
                C89219l.m154715b();
            }
            drawable.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            Drawable drawable2 = this.f121958w;
            if (drawable2 == null) {
                C89219l.m154715b();
            }
            drawable2.draw(canvas);
        }
        MethodCollector.m26664o(2901);
    }

    public final void setFakeLeft(int i) {
        float width;
        int i2;
        View b = mo89483b(8388611);
        if (b != null) {
            if (!this.f121941c.getFirst().booleanValue()) {
                this.f121941c = this.f121941c.copy(true, Integer.valueOf(b.getLeft()));
            }
            int width2 = b.getWidth();
            C0792v.m2769e(b, i - b.getLeft());
            if (mo89479a(b, 3)) {
                width = (float) (i + width2);
            } else {
                width = (float) (getWidth() - i);
            }
            float f = width / ((float) width2);
            ViewGroup.LayoutParams layoutParams = b.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
            C53038c cVar = (C53038c) layoutParams;
            if (f != cVar.f121970c) {
                cVar.f121970c = f;
                if (f == 0.0f) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                b.setVisibility(i2);
                invalidate();
            }
        }
    }

    /* renamed from: c */
    private void mo89562c(boolean z) {
        boolean a;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C89219l.m154716b(childAt, "");
            Objects.requireNonNull(childAt.getLayoutParams(), "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
            if (mo89488c(childAt) && !z) {
                int width = childAt.getWidth();
                if (mo89479a(childAt, 3)) {
                    a = this.f121945j.mo89604a(childAt, -width, childAt.getTop());
                } else {
                    a = this.f121945j.mo89604a(childAt, getWidth(), childAt.getTop());
                }
                z2 |= a;
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* renamed from: a */
    public final int mo89469a(int i) {
        int i2;
        if (i == 8388611) {
            int i3 = this.f121950o;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 8388613 && (i2 = this.f121951p) != 3) {
            return i2;
        } else {
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo89483b(int i) {
        int a = C0774e.m2693a(i, C0792v.m2768e(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C89219l.m154716b(childAt, "");
            if ((m97974e(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final boolean mo89493d(View view) {
        C89219l.m154721d(view, "");
        if (mo89488c(view)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
            if ((((C53038c) layoutParams).f121971d & 1) == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException(("View " + view + " is not a drawer").toString());
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        C89219l.m154721d(motionEvent, "");
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f121944i <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            C89219l.m154716b(childAt, "");
            if (this.f121960y == null) {
                this.f121960y = new Rect();
            }
            childAt.getHitRect(this.f121960y);
            Rect rect = this.f121960y;
            if (rect == null) {
                C89219l.m154715b();
            }
            if (rect.contains((int) x, (int) y) && !mo89486b(childAt)) {
                Matrix matrix = childAt.getMatrix();
                C89219l.m154716b(matrix, "");
                if (!matrix.isIdentity()) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(((float) getScrollX()) - ((float) childAt.getLeft()), ((float) getScrollY()) - ((float) childAt.getTop()));
                    Matrix matrix2 = childAt.getMatrix();
                    C89219l.m154716b(matrix2, "");
                    if (!matrix2.isIdentity()) {
                        if (this.f121961z == null) {
                            this.f121961z = new Matrix();
                        }
                        matrix2.invert(this.f121961z);
                        obtain.transform(this.f121961z);
                    }
                    C89219l.m154716b(obtain, "");
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                } else {
                    float scrollX = ((float) getScrollX()) - ((float) childAt.getLeft());
                    float scrollY = ((float) getScrollY()) - ((float) childAt.getTop());
                    motionEvent.offsetLocation(scrollX, scrollY);
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                }
                if (dispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo89485b(boolean z) {
        View b = mo89483b(8388611);
        if (b != null) {
            m97975e(b, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + C53036a.m98001a(8388611));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo89488c(View view) {
        C89219l.m154721d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
        int a = C0774e.m2693a(((C53038c) layoutParams).f121969b, C0792v.m2768e(view));
        if ((a & 3) == 0 && (a & 5) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r5 != 3) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r25) {
        /*
        // Method dump skipped, instructions count: 470
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009b, code lost:
        if (r11.f122056c == -1) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009d, code lost:
        r11.mo89609c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
        // Method dump skipped, instructions count: 488
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo89486b(View view) {
        C89219l.m154721d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
        if (((C53038c) layoutParams).f121969b == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m97964a(Drawable drawable, int i) {
        if (drawable != null && C0705a.m2501a(drawable)) {
            C0705a.m2503b(drawable, i);
        }
    }

    /* renamed from: b */
    private final boolean m97968b(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        View a = this.f121945j.mo89594a(i, i2);
        if (a == null) {
            return false;
        }
        C89219l.m154716b(a, "");
        if (mo89486b(a) || mo89480a(a, i, i2)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m97972c(float f, float f2) {
        View a = this.f121945j.mo89594a((int) f, (int) f2);
        if (a == null) {
            return false;
        }
        C89219l.m154716b(a, "");
        return mo89488c(a);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C89219l.m154721d(keyEvent, "");
        if (i != 4 || m97979h() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    /* renamed from: a */
    private void m97963a(int i, int i2) {
        View b;
        int a = C0774e.m2693a(i2, C0792v.m2768e(this));
        if (i2 == 8388611) {
            this.f121950o = i;
        } else if (i2 == 8388613) {
            this.f121951p = i;
        }
        if (i != 0) {
            this.f121945j.mo89595a();
            if (i == 1) {
                View b2 = mo89483b(a);
                if (b2 != null) {
                    m97975e(b2, true);
                }
            } else if (i == 2 && (b = mo89483b(a)) != null) {
                m97973d(b, true);
            }
        }
    }

    /* renamed from: b */
    private void m97967b(View view, boolean z) {
        C89219l.m154721d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
        C53038c cVar = (C53038c) layoutParams;
        if ((cVar.f121971d & 1) == 1) {
            cVar.f121971d = 0;
            List<AbstractC53037b> list = this.f121953r;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    List<AbstractC53037b> list2 = this.f121953r;
                    if (list2 == null) {
                        C89219l.m154715b();
                    }
                    list2.get(size).mo89544a(view, z);
                }
            }
        }
    }

    /* renamed from: c */
    private void m97969c(View view, float f) {
        C89219l.m154721d(view, "");
        float a = m97962a(view);
        float width = (float) view.getWidth();
        int a2 = C89241a.m154730a(width * 0.0f) - C89241a.m154730a(a * width);
        if (!mo89479a(view, 3)) {
            a2 = -a2;
        }
        view.offsetLeftAndRight(a2);
        mo89472a(view, 0.0f);
    }

    /* renamed from: a */
    protected static boolean m97965a(float f, float f2) {
        if (Math.abs(f) < Math.abs(f2) * 2.0f) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m97966b(android.view.View r6, float r7) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r0)
            java.util.List<com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer$b> r0 = r5.f121953r
            if (r0 == 0) goto L_0x005d
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            boolean r0 = r2 instanceof com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.C53038c
            if (r0 != 0) goto L_0x0012
            r2 = 0
        L_0x0012:
            com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer$c r2 = (com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.C53038c) r2
            r4 = 1
            r3 = 0
            if (r2 == 0) goto L_0x005b
            boolean r0 = r2.mo89547b()
            if (r0 == 0) goto L_0x005b
            boolean r0 = r2.mo89546a()
            if (r0 != 0) goto L_0x005b
            r3 = 1
            int r1 = r6.getWidth()
            h.u<java.lang.Float, java.lang.Integer, java.lang.Boolean> r0 = r2.f121968a
            if (r0 == 0) goto L_0x005b
            float r2 = (float) r1
            float r2 = r2 * r7
            java.lang.Object r0 = r0.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r2 = r2 / r0
        L_0x003a:
            java.util.List<com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer$b> r0 = r5.f121953r
            if (r0 != 0) goto L_0x0041
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0041:
            int r1 = r0.size()
            int r1 = r1 - r4
        L_0x0046:
            if (r1 < 0) goto L_0x005d
            java.util.List<com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer$b> r0 = r5.f121953r
            if (r0 != 0) goto L_0x004f
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x004f:
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer$b r0 = (com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.AbstractC53037b) r0
            r0.mo89543a(r6, r7, r3, r2)
            int r1 = r1 + -1
            goto L_0x0046
        L_0x005b:
            r2 = r7
            goto L_0x003a
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.m97966b(android.view.View, float):void");
    }

    /* renamed from: c */
    private void m97970c(View view, boolean z) {
        int i;
        C89219l.m154721d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
        C53038c cVar = (C53038c) layoutParams;
        boolean b = cVar.mo89547b();
        if ((cVar.f121971d & 1) == 0) {
            if (z) {
                i = 3;
            } else {
                i = 1;
            }
            cVar.f121971d = i;
            List<AbstractC53037b> list = this.f121953r;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    List<AbstractC53037b> list2 = this.f121953r;
                    if (list2 == null) {
                        C89219l.m154715b();
                    }
                    list2.get(size).mo89545a(view, z, b);
                }
            }
        } else if (cVar.mo89546a() && !z) {
            cVar.f121971d = 1;
            List<AbstractC53037b> list3 = this.f121953r;
            if (list3 == null) {
                C89219l.m154715b();
            }
            for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
                List<AbstractC53037b> list4 = this.f121953r;
                if (list4 == null) {
                    C89219l.m154715b();
                }
                list4.get(size2).mo89545a(view, false, b);
            }
        }
    }

    /* renamed from: d */
    private final void m97973d(View view, boolean z) {
        int i;
        if (mo89488c(view)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
            C53038c cVar = (C53038c) layoutParams;
            if (this.f121949n) {
                cVar.f121970c = 1.0f;
                if (cVar.f121968a == null || !z) {
                    i = 1;
                } else {
                    i = 3;
                }
                cVar.f121971d = i;
            } else {
                cVar.f121971d |= 4;
                this.f121945j.mo89604a(view, mo89470a(view, z), view.getTop());
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException(("View " + view + " is not a sliding drawer").toString());
    }

    /* renamed from: e */
    private void m97975e(View view, boolean z) {
        int i;
        C89219l.m154721d(view, "");
        if (mo89488c(view)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
            C53038c cVar = (C53038c) layoutParams;
            if (this.f121949n) {
                cVar.f121970c = 0.0f;
                cVar.f121971d = 0;
            } else if (z) {
                cVar.f121971d |= 8;
                C53080m mVar = this.f121945j;
                if (mo89477a()) {
                    i = getWidth();
                } else {
                    i = -view.getWidth();
                }
                mVar.mo89604a(view, i, view.getTop());
            } else {
                m97969c(view, 0.0f);
                mo89471a(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException(("View " + view + " is not a sliding drawer").toString());
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C89219l.m154721d(keyEvent, "");
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View h = m97979h();
        if (h == null) {
            return false;
        }
        C89219l.m154721d(h, "");
        if (mo89488c(h)) {
            ViewGroup.LayoutParams layoutParams = h.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
            if (mo89469a(((C53038c) layoutParams).f121969b) != 0) {
                return true;
            }
            m97977f();
            return true;
        }
        throw new IllegalArgumentException(("View " + h + " is not a drawer").toString());
    }

    /* renamed from: a */
    public final int mo89470a(View view, boolean z) {
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
        C89386u<Float, Integer, Boolean> uVar = ((C53038c) layoutParams).f121968a;
        boolean a = mo89479a(view, 3);
        int width = view.getWidth();
        if (uVar == null || (!z && !uVar.getThird().booleanValue())) {
            if (a) {
                return 0;
            }
            i = getWidth();
        } else if (a) {
            return C89241a.m154730a(((float) width) * (uVar.getFirst().floatValue() - 1.0f));
        } else {
            i = getWidth();
            width = C89241a.m154730a(((float) width) * uVar.getFirst().floatValue());
        }
        return i - width;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        if (this.f121939a == null || !C0792v.m2781o(this)) {
            z = false;
        } else {
            z = true;
        }
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C89219l.m154716b(childAt, "");
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
                C53038c cVar = (C53038c) layoutParams;
                if (z) {
                    int a = C0774e.m2693a(cVar.f121969b, C0792v.m2768e(this));
                    if (C0792v.m2781o(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f121939a;
                            if (a == 3) {
                                if (windowInsets == null) {
                                    C89219l.m154715b();
                                }
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                            } else if (a == 5) {
                                if (windowInsets == null) {
                                    C89219l.m154715b();
                                }
                                windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f121939a;
                        if (a == 3) {
                            if (windowInsets2 == null) {
                                C89219l.m154715b();
                            }
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a == 5) {
                            if (windowInsets2 == null) {
                                C89219l.m154715b();
                            }
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        if (windowInsets2 == null) {
                            C89219l.m154715b();
                        }
                        cVar.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        cVar.topMargin = windowInsets2.getSystemWindowInsetTop();
                        cVar.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        cVar.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (mo89486b(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - cVar.leftMargin) - cVar.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - cVar.topMargin) - cVar.bottomMargin, 1073741824));
                } else if (mo89488c(childAt)) {
                    int e = m97974e(childAt) & 7;
                    if (e == 3) {
                        if (!z2) {
                            z2 = true;
                        } else {
                            throw new IllegalStateException(("Child drawer has absolute gravity " + C53036a.m98001a(e) + " but this StepDrawerContainer already has a drawer view along that edge").toString());
                        }
                    } else if (!z3) {
                        z3 = true;
                    } else {
                        throw new IllegalStateException(("Child drawer has absolute gravity " + C53036a.m98001a(e) + " but this StepDrawerContainer already has a drawer view along that edge").toString());
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f121943h + cVar.leftMargin + cVar.rightMargin, cVar.width), ViewGroup.getChildMeasureSpec(i2, cVar.topMargin + cVar.bottomMargin, cVar.height));
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo89471a(int i, View view) {
        boolean z;
        int i2 = this.f121945j.f122054a;
        int i3 = 2;
        boolean z2 = false;
        if (i2 == 1) {
            i3 = 1;
        } else if (i2 != 2) {
            i3 = 0;
        }
        if (view != null && i == 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
            C53038c cVar = (C53038c) layoutParams;
            if (cVar.f121970c == 0.0f) {
                m97967b(view, cVar.mo89546a());
            } else if (cVar.f121970c == 1.0f) {
                C89219l.m154721d(view, "");
                m97970c(view, false);
            } else {
                C89386u<Float, Integer, Boolean> uVar = cVar.f121968a;
                if (uVar != null && cVar.f121970c == uVar.getFirst().floatValue()) {
                    m97970c(view, true);
                }
            }
        }
        if (i3 != this.f121947l) {
            this.f121947l = i3;
            C53038c cVar2 = null;
            ViewGroup.LayoutParams layoutParams2 = view != null ? view.getLayoutParams() : null;
            if (layoutParams2 instanceof C53038c) {
                cVar2 = layoutParams2;
            }
            C53038c cVar3 = cVar2;
            if (cVar3 != null) {
                z2 = cVar3.mo89547b();
                z = cVar3.mo89546a();
            } else {
                z = false;
            }
            List<AbstractC53037b> list = this.f121953r;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    List<AbstractC53037b> list2 = this.f121953r;
                    if (list2 == null) {
                        C89219l.m154715b();
                    }
                    list2.get(size).mo89542a(i3, z2, z);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo89472a(View view, float f) {
        C89219l.m154721d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
        C53038c cVar = (C53038c) layoutParams;
        if (f != cVar.f121970c) {
            cVar.f121970c = f;
            m97966b(view, f);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C89219l.m154721d(arrayList, "");
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C89219l.m154716b(childAt, "");
                if (!mo89488c(childAt)) {
                    this.f121959x.add(childAt);
                } else if (mo89493d(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.f121959x.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.f121959x.get(i4);
                    C89219l.m154716b(view, "");
                    View view2 = view;
                    if (view2.getVisibility() == 0) {
                        view2.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f121959x.clear();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StepDrawerContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, null, 0);
        int i2;
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(1197);
        setDescendantFocusability(262144);
        this.f121943h = (int) ((getDensity() * 0.0f) + 0.5f);
        C53040d dVar = new C53040d();
        this.f121946k = dVar;
        C53080m mVar = new C53080m(getContext(), this, dVar);
        mVar.f122055b = (int) (((float) mVar.f122055b) * 1.0f);
        C89219l.m154716b(mVar, "");
        this.f121945j = mVar;
        mVar.f122063j = getDensity() * 400.0f;
        dVar.f121972a = mVar;
        setFocusableInTouchMode(true);
        C0792v.m2740a((View) this, 1);
        setMotionEventSplittingEnabled(false);
        if (C0792v.m2781o(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(View$OnApplyWindowInsetsListenerC530331.f121962a);
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f121927H);
                C89219l.m154716b(obtainStyledAttributes, "");
                try {
                    this.f121958w = obtainStyledAttributes.getDrawable(0);
                    obtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    MethodCollector.m26664o(1197);
                    throw th;
                }
            } else {
                this.f121958w = null;
            }
        }
        this.f121959x = new ArrayList<>();
        Integer a = C23155d.m43641a(context, R.attr.b0);
        if (a != null) {
            i2 = a.intValue();
        } else {
            i2 = -1728053248;
        }
        this.f121937F = i2;
        this.f121938G = new Paint();
        MethodCollector.m26664o(1197);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(view, "");
        if (!this.f121935D) {
            return super.drawChild(canvas, view, j);
        }
        int height = getHeight();
        boolean b = mo89486b(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (b) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view) {
                    C89219l.m154716b(childAt, "");
                    if (childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && mo89488c(childAt) && childAt.getHeight() >= height) {
                        if (mo89479a(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i2) {
                                i2 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f121944i;
        if (f > 0.0f && b) {
            int i4 = this.f121937F;
            this.f121938G.setColor((i4 & 16777215) | (((int) (((float) ((-16777216 & i4) >>> 24)) * f)) << 24));
            canvas.drawRect((float) i, 0.0f, (float) width, (float) getHeight(), this.f121938G);
        } else if (this.f121936E != null && mo89479a(view, 3)) {
            Drawable drawable = this.f121936E;
            if (drawable == null) {
                C89219l.m154715b();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f121945j.f122064k), 1.0f));
            Drawable drawable2 = this.f121936E;
            if (drawable2 == null) {
                C89219l.m154715b();
            }
            drawable2.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            Drawable drawable3 = this.f121936E;
            if (drawable3 == null) {
                C89219l.m154715b();
            }
            drawable3.setAlpha((int) (max * 255.0f));
            Drawable drawable4 = this.f121936E;
            if (drawable4 == null) {
                C89219l.m154715b();
            }
            drawable4.draw(canvas);
        } else if (this.f121936E != null && mo89479a(view, 5)) {
            Drawable drawable5 = this.f121936E;
            if (drawable5 == null) {
                C89219l.m154715b();
            }
            int intrinsicWidth2 = drawable5.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f121945j.f122064k), 1.0f));
            Drawable drawable6 = this.f121936E;
            if (drawable6 == null) {
                C89219l.m154715b();
            }
            drawable6.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            Drawable drawable7 = this.f121936E;
            if (drawable7 == null) {
                C89219l.m154715b();
            }
            drawable7.setAlpha((int) (max2 * 255.0f));
            Drawable drawable8 = this.f121936E;
            if (drawable8 == null) {
                C89219l.m154715b();
            }
            drawable8.draw(canvas);
        }
        return drawChild;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int a;
        int i5;
        boolean z2;
        int i6;
        this.f121948m = true;
        int i7 = i3 - i;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            C89219l.m154716b(childAt, "");
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
                C53038c cVar = (C53038c) layoutParams;
                if (mo89486b(childAt)) {
                    childAt.layout(cVar.leftMargin, cVar.topMargin, cVar.leftMargin + childAt.getMeasuredWidth(), cVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    float f = (float) measuredWidth;
                    float f2 = cVar.f121970c * f;
                    if (!Float.isNaN(f2)) {
                        if (mo89479a(childAt, 3)) {
                            a = (-measuredWidth) + C89241a.m154730a(f2);
                            i5 = measuredWidth + a;
                        } else {
                            a = i7 - C89241a.m154730a(f2);
                            i5 = i7 - a;
                        }
                        float f3 = ((float) i5) / f;
                        if (f3 != cVar.f121970c) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int i9 = cVar.f121969b & 112;
                        if (i9 == 16) {
                            int i10 = i4 - i2;
                            int i11 = (i10 - measuredHeight) / 2;
                            if (i11 < cVar.topMargin) {
                                i11 = cVar.topMargin;
                            } else if (i11 + measuredHeight > i10 - cVar.bottomMargin) {
                                i11 = (i10 - cVar.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(a, i11, measuredWidth + a, measuredHeight + i11);
                        } else if (i9 == 48) {
                            childAt.layout(a, cVar.topMargin, measuredWidth + a, cVar.topMargin + measuredHeight);
                        } else if (i9 != 80) {
                            childAt.layout(a, cVar.topMargin, measuredWidth + a, cVar.topMargin + measuredHeight);
                        } else {
                            int i12 = i4 - i2;
                            childAt.layout(a, (i12 - cVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + a, i12 - cVar.bottomMargin);
                        }
                        if (z2) {
                            mo89472a(childAt, f3);
                        }
                        if (cVar.f121970c > 0.0f) {
                            i6 = 0;
                        } else {
                            i6 = 4;
                        }
                        if (childAt.getVisibility() != i6) {
                            childAt.setVisibility(i6);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        this.f121948m = false;
        this.f121949n = false;
    }
}
