package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0550b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: androidx.constraintlayout.widget.c */
public final class C0552c extends ViewGroup {

    /* renamed from: a */
    C0550b f2376a;

    static {
        Covode.recordClassIndex(625);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0553a();
    }

    /* renamed from: androidx.constraintlayout.widget.c$a */
    public static class C0553a extends ConstraintLayout.C0547a {

        /* renamed from: an */
        public float f2377an = 1.0f;

        /* renamed from: ao */
        public boolean f2378ao;

        /* renamed from: ap */
        public float f2379ap;

        /* renamed from: aq */
        public float f2380aq;

        /* renamed from: ar */
        public float f2381ar;

        /* renamed from: as */
        public float f2382as;

        /* renamed from: at */
        public float f2383at = 1.0f;

        /* renamed from: au */
        public float f2384au = 1.0f;

        /* renamed from: av */
        public float f2385av;

        /* renamed from: aw */
        public float f2386aw;

        /* renamed from: ax */
        public float f2387ax;

        /* renamed from: ay */
        public float f2388ay;

        /* renamed from: az */
        public float f2389az;

        static {
            Covode.recordClassIndex(626);
        }

        public C0553a() {
            super(-2, -2);
        }

        public C0553a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.jq, R.attr.jr, R.attr.ml, R.attr.pg, R.attr.zm, R.attr.zn, R.attr.zo, R.attr.zp, R.attr.zq, R.attr.zr, R.attr.zs, R.attr.zt, R.attr.zu, R.attr.zv, R.attr.zw, R.attr.zx, R.attr.zy, R.attr.zz, R.attr.a00, R.attr.a01, R.attr.a02, R.attr.a03, R.attr.a04, R.attr.a05, R.attr.a06, R.attr.a07, R.attr.a08, R.attr.a09, R.attr.a0_, R.attr.a0a, R.attr.a0b, R.attr.a0c, R.attr.a0d, R.attr.a0e, R.attr.a0f, R.attr.a0g, R.attr.a0h, R.attr.a0i, R.attr.a0j, R.attr.a0k, R.attr.a0l, R.attr.a0m, R.attr.a0n, R.attr.a0o, R.attr.a0p, R.attr.a0w, R.attr.a0x, R.attr.a11, R.attr.a12, R.attr.a13, R.attr.a14, R.attr.a15, R.attr.a16});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 13) {
                    this.f2377an = obtainStyledAttributes.getFloat(index, this.f2377an);
                } else if (index == 26) {
                    this.f2379ap = obtainStyledAttributes.getFloat(index, this.f2379ap);
                    this.f2378ao = true;
                } else if (index == 21) {
                    this.f2381ar = obtainStyledAttributes.getFloat(index, this.f2381ar);
                } else if (index == 22) {
                    this.f2382as = obtainStyledAttributes.getFloat(index, this.f2382as);
                } else if (index == 20) {
                    this.f2380aq = obtainStyledAttributes.getFloat(index, this.f2380aq);
                } else if (index == 18) {
                    this.f2383at = obtainStyledAttributes.getFloat(index, this.f2383at);
                } else if (index == 19) {
                    this.f2384au = obtainStyledAttributes.getFloat(index, this.f2384au);
                } else if (index == 14) {
                    this.f2385av = obtainStyledAttributes.getFloat(index, this.f2385av);
                } else if (index == 15) {
                    this.f2386aw = obtainStyledAttributes.getFloat(index, this.f2386aw);
                } else if (index == 16) {
                    this.f2387ax = obtainStyledAttributes.getFloat(index, this.f2387ax);
                } else if (index == 17) {
                    this.f2388ay = obtainStyledAttributes.getFloat(index, this.f2388ay);
                } else if (index == 25) {
                    this.f2387ax = obtainStyledAttributes.getFloat(index, this.f2389az);
                }
            }
        }
    }

    public final C0550b getConstraintSet() {
        if (this.f2376a == null) {
            this.f2376a = new C0550b();
        }
        C0550b bVar = this.f2376a;
        int childCount = getChildCount();
        bVar.f2301b.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0553a aVar = (C0553a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!bVar.f2301b.containsKey(Integer.valueOf(id))) {
                    bVar.f2301b.put(Integer.valueOf(id), new C0550b.C0551a((byte) 0));
                }
                C0550b.C0551a aVar2 = bVar.f2301b.get(Integer.valueOf(id));
                if (childAt instanceof AbstractC0549a) {
                    AbstractC0549a aVar3 = (AbstractC0549a) childAt;
                    aVar2.mo2459a(id, aVar);
                    if (aVar3 instanceof Barrier) {
                        aVar2.f2348at = 1;
                        Barrier barrier = (Barrier) aVar3;
                        aVar2.f2347as = barrier.getType();
                        aVar2.f2349au = barrier.getReferencedIds();
                    }
                }
                aVar2.mo2459a(id, aVar);
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.f2376a;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0547a(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0553a(getContext(), attributeSet);
    }
}
