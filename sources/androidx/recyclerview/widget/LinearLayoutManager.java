package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.C1465n;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.AbstractC1362i implements RecyclerView.AbstractC1375r.AbstractC1377b, C1465n.AbstractC1477d {

    /* renamed from: a */
    private C1341c f4330a;

    /* renamed from: b */
    private boolean f4331b;

    /* renamed from: c */
    private final C1340b f4332c;

    /* renamed from: d */
    private int[] f4333d;

    /* renamed from: j */
    public int f4334j;

    /* renamed from: k */
    AbstractC1491x f4335k;

    /* renamed from: l */
    public boolean f4336l;

    /* renamed from: m */
    boolean f4337m;

    /* renamed from: n */
    public boolean f4338n;

    /* renamed from: o */
    public boolean f4339o;

    /* renamed from: p */
    int f4340p;

    /* renamed from: q */
    int f4341q;

    /* renamed from: r */
    public boolean f4342r;

    /* renamed from: s */
    SavedState f4343s;

    /* renamed from: t */
    final C1339a f4344t;

    /* renamed from: u */
    public int f4345u;

    static {
        Covode.recordClassIndex(1465);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4322a(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar, C1339a aVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: w_ */
    public final boolean mo4375w_() {
        return true;
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class androidx.recyclerview.widget.LinearLayoutManager.SavedState.C13381 */

            static {
                Covode.recordClassIndex(1467);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        int f4346a;

        /* renamed from: b */
        int f4347b;

        /* renamed from: c */
        boolean f4348c;

        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo4377a() {
            if (this.f4346a >= 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(1466);
        }

        public SavedState(SavedState savedState) {
            this.f4346a = savedState.f4346a;
            this.f4347b = savedState.f4347b;
            this.f4348c = savedState.f4348c;
        }

        SavedState(Parcel parcel) {
            this.f4346a = parcel.readInt();
            this.f4347b = parcel.readInt();
            this.f4348c = parcel.readInt() != 1 ? false : true;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4346a);
            parcel.writeInt(this.f4347b);
            parcel.writeInt(this.f4348c ? 1 : 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C1340b {

        /* renamed from: a */
        public int f4354a;

        /* renamed from: b */
        public boolean f4355b;

        /* renamed from: c */
        public boolean f4356c;

        /* renamed from: d */
        public boolean f4357d;

        static {
            Covode.recordClassIndex(1469);
        }

        protected C1340b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4387a() {
            this.f4354a = 0;
            this.f4355b = false;
            this.f4356c = false;
            this.f4357d = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4353a(RecyclerView recyclerView, RecyclerView.C1372o oVar) {
        super.mo4353a(recyclerView, oVar);
        if (this.f4342r) {
            mo4711c(oVar);
            oVar.mo4756a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4352a(AccessibilityEvent accessibilityEvent) {
        super.mo4352a(accessibilityEvent);
        if (mo4730s() > 0) {
            accessibilityEvent.setFromIndex(mo4371k());
            accessibilityEvent.setToIndex(mo4373m());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public void mo4350a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f4343s = savedState;
            if (this.f4340p != -1) {
                savedState.f4346a = -1;
            }
            mo4726o();
        }
    }

    /* renamed from: a */
    public void mo4329a(boolean z) {
        mo4355a((String) null);
        if (this.f4338n != z) {
            this.f4338n = z;
            mo4726o();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
        C1481r rVar = new C1481r(recyclerView.getContext());
        rVar.f4515g = i;
        mo4695a(rVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public void mo4324a(RecyclerView.C1378s sVar) {
        super.mo4324a(sVar);
        this.f4343s = null;
        this.f4340p = -1;
        this.f4341q = Integer.MIN_VALUE;
        this.f4344t.mo4382a();
    }

    /* renamed from: a */
    public void mo4347a(int i, int i2) {
        this.f4340p = i;
        this.f4341q = i2;
        SavedState savedState = this.f4343s;
        if (savedState != null) {
            savedState.f4346a = -1;
        }
        mo4726o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4325a(RecyclerView.C1378s sVar, C1341c cVar, RecyclerView.AbstractC1362i.AbstractC1365a aVar) {
        int i = cVar.f4361d;
        if (i >= 0 && i < sVar.mo4782a()) {
            aVar.mo4743a(i, Math.max(0, cVar.f4364g));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r1 != false) goto L_0x0016;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4349a(int r6, androidx.recyclerview.widget.RecyclerView.AbstractC1362i.AbstractC1365a r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r5.f4343s
            r4 = -1
            r3 = 0
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo4377a()
            if (r0 == 0) goto L_0x0026
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r5.f4343s
            boolean r1 = r0.f4348c
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r5.f4343s
            int r2 = r0.f4346a
        L_0x0014:
            if (r1 == 0) goto L_0x0035
        L_0x0016:
            r1 = 0
        L_0x0017:
            int r0 = r5.f4345u
            if (r1 >= r0) goto L_0x0037
            if (r2 < 0) goto L_0x0037
            if (r2 >= r6) goto L_0x0037
            r7.mo4743a(r2, r3)
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0026:
            r5.mo91519C()
            boolean r1 = r5.f4337m
            int r2 = r5.f4340p
            if (r2 != r4) goto L_0x0014
            if (r1 == 0) goto L_0x0034
            int r2 = r6 + -1
            goto L_0x0016
        L_0x0034:
            r2 = 0
        L_0x0035:
            r4 = 1
            goto L_0x0016
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo4349a(int, androidx.recyclerview.widget.RecyclerView$i$a):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4348a(int i, int i2, RecyclerView.C1378s sVar, RecyclerView.AbstractC1362i.AbstractC1365a aVar) {
        if (this.f4334j != 0) {
            i = i2;
        }
        if (mo4730s() != 0 && i != 0) {
            mo4370i();
            m4174a(i > 0 ? 1 : -1, Math.abs(i), true, sVar);
            mo4325a(sVar, this.f4330a, aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public void mo4355a(String str) {
        if (this.f4343s == null) {
            super.mo4355a(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4323a(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar, C1341c cVar, C1340b bVar) {
        int u;
        int f;
        int i;
        int i2;
        View a = cVar.mo4388a(oVar);
        if (a == null) {
            bVar.f4355b = true;
            return;
        }
        RecyclerView.C1367j jVar = (RecyclerView.C1367j) a.getLayoutParams();
        boolean z = false;
        if (cVar.f4369l == null) {
            if (this.f4337m == (cVar.f4363f == -1)) {
                mo4710c(a);
            } else {
                mo4688a(a, 0);
            }
        } else {
            boolean z2 = this.f4337m;
            if (cVar.f4363f == -1) {
                z = true;
            }
            if (z2 == z) {
                mo4701a_(a);
            } else {
                mo4708b_(a);
            }
        }
        mo4725l(a);
        bVar.f4354a = this.f4335k.mo5030e(a);
        if (this.f4334j == 1) {
            if (mo4369h()) {
                i2 = this.f4485J - mo4733v();
                i = i2 - this.f4335k.mo5032f(a);
            } else {
                i = mo4731t();
                i2 = this.f4335k.mo5032f(a) + i;
            }
            if (cVar.f4363f == -1) {
                f = cVar.f4359b;
                u = cVar.f4359b - bVar.f4354a;
            } else {
                u = cVar.f4359b;
                f = cVar.f4359b + bVar.f4354a;
            }
        } else {
            u = mo4732u();
            f = this.f4335k.mo5032f(a) + u;
            if (cVar.f4363f == -1) {
                i2 = cVar.f4359b;
                i = cVar.f4359b - bVar.f4354a;
            } else {
                i = cVar.f4359b;
                i2 = cVar.f4359b + bVar.f4354a;
            }
        }
        mo4702b(a, i, u, i2, f);
        if (jVar.f4500c.isRemoved() || jVar.f4500c.isUpdated()) {
            bVar.f4356c = true;
        }
        bVar.f4357d = a.hasFocusable();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo4315a(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar, boolean z, boolean z2) {
        int i;
        int i2;
        mo4370i();
        int s = mo4730s();
        int i3 = -1;
        if (z2) {
            i = mo4730s() - 1;
            i2 = -1;
        } else {
            i3 = s;
            i = 0;
            i2 = 1;
        }
        int a = sVar.mo4782a();
        int b = this.f4335k.mo5023b();
        int c = this.f4335k.mo5025c();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i != i3) {
            View g = mo4717g(i);
            int e = m4426e(g);
            int a2 = this.f4335k.mo5021a(g);
            int b2 = this.f4335k.mo5024b(g);
            if (e >= 0 && e < a) {
                if (!((RecyclerView.C1367j) g.getLayoutParams()).f4500c.isRemoved()) {
                    boolean z3 = b2 <= b && a2 < b;
                    boolean z4 = a2 >= c && b2 > c;
                    if (!z3 && !z4) {
                        return g;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = g;
                        }
                    } else if (!z3) {
                        if (view != null) {
                        }
                        view = g;
                    }
                    view2 = g;
                } else if (view3 == null) {
                    view3 = g;
                }
            }
            i += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068 A[RETURN] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4314a(android.view.View r6, int r7, androidx.recyclerview.widget.RecyclerView.C1372o r8, androidx.recyclerview.widget.RecyclerView.C1378s r9) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo4314a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s):android.view.View");
    }

    @Override // androidx.recyclerview.widget.C1465n.AbstractC1477d
    /* renamed from: a */
    public final void mo4351a(View view, View view2) {
        mo4355a("Cannot drop a view during a scroll or layout calculation");
        mo4370i();
        mo91519C();
        int e = m4426e(view);
        int e2 = m4426e(view2);
        char c = e < e2 ? (char) 1 : 65535;
        if (this.f4337m) {
            if (c == 1) {
                mo4347a(e2, this.f4335k.mo5025c() - (this.f4335k.mo5021a(view2) + this.f4335k.mo5030e(view)));
            } else {
                mo4347a(e2, this.f4335k.mo5025c() - this.f4335k.mo5024b(view2));
            }
        } else if (c == 65535) {
            mo4347a(e2, this.f4335k.mo5021a(view2));
        } else {
            mo4347a(e2, this.f4335k.mo5024b(view2) - this.f4335k.mo5030e(view));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C1339a {

        /* renamed from: a */
        AbstractC1491x f4349a;

        /* renamed from: b */
        int f4350b;

        /* renamed from: c */
        int f4351c;

        /* renamed from: d */
        boolean f4352d;

        /* renamed from: e */
        boolean f4353e;

        static {
            Covode.recordClassIndex(1468);
        }

        C1339a() {
            mo4382a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4382a() {
            this.f4350b = -1;
            this.f4351c = Integer.MIN_VALUE;
            this.f4352d = false;
            this.f4353e = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo4384b() {
            int b;
            if (this.f4352d) {
                b = this.f4349a.mo5025c();
            } else {
                b = this.f4349a.mo5023b();
            }
            this.f4351c = b;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f4350b + ", mCoordinate=" + this.f4351c + ", mLayoutFromEnd=" + this.f4352d + ", mValid=" + this.f4353e + '}';
        }

        /* renamed from: b */
        public final void mo4385b(View view, int i) {
            if (this.f4352d) {
                this.f4351c = this.f4349a.mo5024b(view) + this.f4349a.mo5020a();
            } else {
                this.f4351c = this.f4349a.mo5021a(view);
            }
            this.f4350b = i;
        }

        /* renamed from: a */
        public final void mo4383a(View view, int i) {
            int a = this.f4349a.mo5020a();
            if (a >= 0) {
                mo4385b(view, i);
                return;
            }
            this.f4350b = i;
            if (this.f4352d) {
                int c = (this.f4349a.mo5025c() - a) - this.f4349a.mo5024b(view);
                this.f4351c = this.f4349a.mo5025c() - c;
                if (c > 0) {
                    int e = this.f4351c - this.f4349a.mo5030e(view);
                    int b = this.f4349a.mo5023b();
                    int min = e - (b + Math.min(this.f4349a.mo5021a(view) - b, 0));
                    if (min < 0) {
                        this.f4351c += Math.min(c, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int a2 = this.f4349a.mo5021a(view);
            int b2 = a2 - this.f4349a.mo5023b();
            this.f4351c = a2;
            if (b2 > 0) {
                int c2 = (this.f4349a.mo5025c() - Math.min(0, (this.f4349a.mo5025c() - a) - this.f4349a.mo5024b(view))) - (a2 + this.f4349a.mo5030e(view));
                if (c2 < 0) {
                    this.f4351c -= Math.min(b2, -c2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C1341c {

        /* renamed from: a */
        boolean f4358a = true;

        /* renamed from: b */
        int f4359b;

        /* renamed from: c */
        int f4360c;

        /* renamed from: d */
        int f4361d;

        /* renamed from: e */
        int f4362e;

        /* renamed from: f */
        int f4363f;

        /* renamed from: g */
        int f4364g;

        /* renamed from: h */
        int f4365h;

        /* renamed from: i */
        int f4366i;

        /* renamed from: j */
        boolean f4367j;

        /* renamed from: k */
        int f4368k;

        /* renamed from: l */
        List<RecyclerView.ViewHolder> f4369l;

        /* renamed from: m */
        boolean f4370m;

        static {
            Covode.recordClassIndex(1470);
        }

        C1341c() {
        }

        /* renamed from: a */
        private View m4240a() {
            int size = this.f4369l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f4369l.get(i).itemView;
                RecyclerView.C1367j jVar = (RecyclerView.C1367j) view.getLayoutParams();
                if (!jVar.f4500c.isRemoved() && this.f4361d == jVar.f4500c.getLayoutPosition()) {
                    mo4389a(view);
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo4390a(RecyclerView.C1378s sVar) {
            int i = this.f4361d;
            if (i < 0 || i >= sVar.mo4782a()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final View mo4388a(RecyclerView.C1372o oVar) {
            if (this.f4369l != null) {
                return m4240a();
            }
            View c = oVar.mo4766c(this.f4361d);
            this.f4361d += this.f4362e;
            return c;
        }

        /* renamed from: b */
        private View m4241b(View view) {
            int layoutPosition;
            int size = this.f4369l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f4369l.get(i2).itemView;
                RecyclerView.C1367j jVar = (RecyclerView.C1367j) view3.getLayoutParams();
                if (view3 != view && !jVar.f4500c.isRemoved() && (layoutPosition = (jVar.f4500c.getLayoutPosition() - this.f4361d) * this.f4362e) >= 0 && layoutPosition < i) {
                    view2 = view3;
                    if (layoutPosition == 0) {
                        break;
                    }
                    i = layoutPosition;
                }
            }
            return view2;
        }

        /* renamed from: a */
        public final void mo4389a(View view) {
            View b = m4241b(view);
            if (b == null) {
                this.f4361d = -1;
            } else {
                this.f4361d = ((RecyclerView.C1367j) b.getLayoutParams()).f4500c.getLayoutPosition();
            }
        }
    }

    public LinearLayoutManager() {
        this(1, false);
    }

    /* renamed from: G */
    private View m4169G() {
        return m4184g(0, mo4730s());
    }

    /* renamed from: H */
    private View m4170H() {
        return m4184g(mo4730s() - 1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: f */
    public boolean mo4366f() {
        if (this.f4334j == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: g */
    public boolean mo4368g() {
        if (this.f4334j == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo4369h() {
        if (C0792v.m2768e(this.f4490w) == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo4370i() {
        if (this.f4330a == null) {
            this.f4330a = new C1341c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: x_ */
    public boolean mo4340x_() {
        if (this.f4343s == null && this.f4331b == this.f4338n) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    private void mo91519C() {
        boolean z = true;
        if (this.f4334j == 1 || !mo4369h()) {
            z = this.f4336l;
        } else if (this.f4336l) {
            z = false;
        }
        this.f4337m = z;
    }

    /* renamed from: D */
    private boolean m4166D() {
        if (this.f4335k.mo5033g() == 0 && this.f4335k.mo5027d() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    private View m4167E() {
        int i;
        if (this.f4337m) {
            i = mo4730s() - 1;
        } else {
            i = 0;
        }
        return mo4717g(i);
    }

    /* renamed from: F */
    private View m4168F() {
        int s;
        if (this.f4337m) {
            s = 0;
        } else {
            s = mo4730s() - 1;
        }
        return mo4717g(s);
    }

    /* renamed from: k */
    public final int mo4371k() {
        View a = m4173a(0, mo4730s(), false, true);
        if (a == null) {
            return -1;
        }
        return m4426e(a);
    }

    /* renamed from: l */
    public final int mo4372l() {
        View a = m4173a(0, mo4730s(), true, false);
        if (a == null) {
            return -1;
        }
        return m4426e(a);
    }

    /* renamed from: m */
    public final int mo4373m() {
        View a = m4173a(mo4730s() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return m4426e(a);
    }

    /* renamed from: n */
    public final int mo4374n() {
        View a = m4173a(mo4730s() - 1, -1, true, false);
        if (a == null) {
            return -1;
        }
        return m4426e(a);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: z_ */
    public final boolean mo4376z_() {
        if (!(this.f4484I == 1073741824 || this.f4483H == 1073741824)) {
            int s = mo4730s();
            for (int i = 0; i < s; i++) {
                ViewGroup.LayoutParams layoutParams = mo4717g(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public RecyclerView.C1367j mo4334b() {
        return new RecyclerView.C1367j(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: e */
    public Parcelable mo4362e() {
        if (this.f4343s != null) {
            return new SavedState(this.f4343s);
        }
        SavedState savedState = new SavedState();
        if (mo4730s() > 0) {
            mo4370i();
            boolean z = this.f4331b ^ this.f4337m;
            savedState.f4348c = z;
            if (z) {
                View F = m4168F();
                savedState.f4347b = this.f4335k.mo5025c() - this.f4335k.mo5024b(F);
                savedState.f4346a = m4426e(F);
            } else {
                View E = m4167E();
                savedState.f4346a = m4426e(E);
                savedState.f4347b = this.f4335k.mo5021a(E) - this.f4335k.mo5023b();
            }
        } else {
            savedState.f4346a = -1;
        }
        return savedState;
    }

    /* renamed from: a */
    private void m4175a(C1339a aVar) {
        mo5806e(aVar.f4350b, aVar.f4351c);
    }

    /* renamed from: b */
    private void m4180b(C1339a aVar) {
        m4183f(aVar.f4350b, aVar.f4351c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public int mo4336c(RecyclerView.C1378s sVar) {
        return m4187j(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: d */
    public int mo4338d(RecyclerView.C1378s sVar) {
        return m4185h(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: e */
    public int mo4339e(RecyclerView.C1378s sVar) {
        return m4185h(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: f */
    public int mo4365f(RecyclerView.C1378s sVar) {
        return m4186i(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: g */
    public int mo4367g(RecyclerView.C1378s sVar) {
        return m4186i(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public int mo4333b(RecyclerView.C1378s sVar) {
        return m4187j(sVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final View mo4359c(boolean z) {
        if (this.f4337m) {
            return m4173a(mo4730s() - 1, -1, z, true);
        }
        return m4173a(0, mo4730s(), z, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final View mo4361d(boolean z) {
        if (this.f4337m) {
            return m4173a(0, mo4730s(), z, true);
        }
        return m4173a(mo4730s() - 1, -1, z, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: e */
    public void mo4363e(int i) {
        this.f4340p = i;
        this.f4341q = Integer.MIN_VALUE;
        SavedState savedState = this.f4343s;
        if (savedState != null) {
            savedState.f4346a = -1;
        }
        mo4726o();
    }

    /* renamed from: h */
    private int m4185h(RecyclerView.C1378s sVar) {
        if (mo4730s() == 0) {
            return 0;
        }
        mo4370i();
        return C1390aa.m4764a(sVar, this.f4335k, mo4359c(!this.f4339o), mo4361d(!this.f4339o), this, this.f4339o, this.f4337m);
    }

    /* renamed from: i */
    private int m4186i(RecyclerView.C1378s sVar) {
        if (mo4730s() == 0) {
            return 0;
        }
        mo4370i();
        return C1390aa.m4763a(sVar, this.f4335k, mo4359c(!this.f4339o), mo4361d(!this.f4339o), this, this.f4339o);
    }

    /* renamed from: j */
    private int m4187j(RecyclerView.C1378s sVar) {
        if (mo4730s() == 0) {
            return 0;
        }
        mo4370i();
        return C1390aa.m4765b(sVar, this.f4335k, mo4359c(!this.f4339o), mo4361d(!this.f4339o), this, this.f4339o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r.AbstractC1377b
    /* renamed from: d */
    public PointF mo4360d(int i) {
        if (mo4730s() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < m4426e(mo4717g(0))) {
            z = true;
        }
        if (z != this.f4337m) {
            i2 = -1;
        }
        if (this.f4334j == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public final View mo4358c(int i) {
        int s = mo4730s();
        if (s == 0) {
            return null;
        }
        int e = i - m4426e(mo4717g(0));
        if (e >= 0 && e < s) {
            View g = mo4717g(e);
            if (m4426e(g) == i) {
                return g;
            }
        }
        return super.mo4358c(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo4364f(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.f4334j == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f4334j == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f4334j == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f4334j == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f4334j != 1 && mo4369h()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f4334j != 1 && mo4369h()) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: b */
    public final void mo4356b(int i) {
        if (i == 0 || i == 1) {
            mo4355a((String) null);
            if (i != this.f4334j || this.f4335k == null) {
                AbstractC1491x a = AbstractC1491x.m5055a(this, i);
                this.f4335k = a;
                this.f4344t.f4349a = a;
                this.f4334j = i;
                mo4726o();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:".concat(String.valueOf(i)));
    }

    /* renamed from: b */
    public final void mo4357b(boolean z) {
        mo4355a((String) null);
        if (z != this.f4336l) {
            this.f4336l = z;
            mo4726o();
        }
    }

    public LinearLayoutManager(int i, boolean z) {
        this.f4334j = 1;
        this.f4339o = true;
        this.f4340p = -1;
        this.f4341q = Integer.MIN_VALUE;
        this.f4344t = new C1339a();
        this.f4332c = new C1340b();
        this.f4345u = 2;
        this.f4333d = new int[2];
        mo4356b(i);
        mo4357b(z);
    }

    /* renamed from: e */
    private void mo5806e(int i, int i2) {
        int i3;
        this.f4330a.f4360c = this.f4335k.mo5025c() - i2;
        C1341c cVar = this.f4330a;
        if (this.f4337m) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        cVar.f4362e = i3;
        this.f4330a.f4361d = i;
        this.f4330a.f4363f = 1;
        this.f4330a.f4359b = i2;
        this.f4330a.f4364g = Integer.MIN_VALUE;
    }

    /* renamed from: f */
    private void m4183f(int i, int i2) {
        int i3;
        this.f4330a.f4360c = i2 - this.f4335k.mo5023b();
        this.f4330a.f4361d = i;
        C1341c cVar = this.f4330a;
        if (this.f4337m) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        cVar.f4362e = i3;
        this.f4330a.f4363f = -1;
        this.f4330a.f4359b = i2;
        this.f4330a.f4364g = Integer.MIN_VALUE;
    }

    /* renamed from: g */
    private View m4184g(int i, int i2) {
        int i3;
        int i4;
        mo4370i();
        if (i2 <= i && i2 >= i) {
            return mo4717g(i);
        }
        if (this.f4335k.mo5021a(mo4717g(i)) < this.f4335k.mo5023b()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        if (this.f4334j == 0) {
            return this.f4491x.mo4865a(i, i2, i3, i4);
        }
        return this.f4492y.mo4865a(i, i2, i3, i4);
    }

    /* renamed from: a */
    private void m4177a(RecyclerView.C1372o oVar, C1341c cVar) {
        if (cVar.f4358a && !cVar.f4370m) {
            int i = cVar.f4364g;
            int i2 = cVar.f4366i;
            if (cVar.f4363f == -1) {
                int s = mo4730s();
                if (i >= 0) {
                    int d = (this.f4335k.mo5027d() - i) + i2;
                    if (this.f4337m) {
                        for (int i3 = 0; i3 < s; i3++) {
                            View g = mo4717g(i3);
                            if (this.f4335k.mo5021a(g) < d || this.f4335k.mo5028d(g) < d) {
                                m4176a(oVar, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = s - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View g2 = mo4717g(i5);
                        if (this.f4335k.mo5021a(g2) < d || this.f4335k.mo5028d(g2) < d) {
                            m4176a(oVar, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int s2 = mo4730s();
                if (this.f4337m) {
                    int i7 = s2 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View g3 = mo4717g(i8);
                        if (this.f4335k.mo5024b(g3) > i6 || this.f4335k.mo5026c(g3) > i6) {
                            m4176a(oVar, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < s2; i9++) {
                    View g4 = mo4717g(i9);
                    if (this.f4335k.mo5024b(g4) > i6 || this.f4335k.mo5026c(g4) > i6) {
                        m4176a(oVar, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m4178a(RecyclerView.C1378s sVar, int[] iArr) {
        int i;
        int i2;
        if (sVar.f4529a != -1) {
            i = this.f4335k.mo5029e();
        } else {
            i = 0;
        }
        if (this.f4330a.f4363f == -1) {
            i2 = 0;
        } else {
            i2 = i;
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public void mo4337c(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int a;
        int i7;
        View c;
        int a2;
        int i8;
        int i9;
        View a3;
        boolean z2;
        boolean z3;
        int i10;
        boolean z4;
        boolean z5;
        int a4;
        if (!(this.f4343s == null && this.f4340p == -1) && sVar.mo4782a() == 0) {
            mo4711c(oVar);
            return;
        }
        SavedState savedState = this.f4343s;
        if (savedState != null && savedState.mo4377a()) {
            this.f4340p = this.f4343s.f4346a;
        }
        mo4370i();
        this.f4330a.f4358a = false;
        mo91519C();
        View z6 = mo4737z();
        if (!this.f4344t.f4353e || this.f4340p != -1 || this.f4343s != null) {
            this.f4344t.mo4382a();
            this.f4344t.f4352d = this.f4337m ^ this.f4338n;
            C1339a aVar = this.f4344t;
            if (!sVar.f4535g && (i10 = this.f4340p) != -1) {
                if (i10 < 0 || i10 >= sVar.mo4782a()) {
                    this.f4340p = -1;
                    this.f4341q = Integer.MIN_VALUE;
                } else {
                    aVar.f4350b = this.f4340p;
                    SavedState savedState2 = this.f4343s;
                    if (savedState2 == null || !savedState2.mo4377a()) {
                        if (this.f4341q == Integer.MIN_VALUE) {
                            View c2 = mo4358c(this.f4340p);
                            if (c2 == null) {
                                if (mo4730s() > 0) {
                                    if (this.f4340p < m4426e(mo4717g(0))) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4 == this.f4337m) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    aVar.f4352d = z5;
                                }
                                aVar.mo4384b();
                            } else if (this.f4335k.mo5030e(c2) > this.f4335k.mo5029e()) {
                                aVar.mo4384b();
                            } else if (this.f4335k.mo5021a(c2) - this.f4335k.mo5023b() < 0) {
                                aVar.f4351c = this.f4335k.mo5023b();
                                aVar.f4352d = false;
                            } else if (this.f4335k.mo5025c() - this.f4335k.mo5024b(c2) < 0) {
                                aVar.f4351c = this.f4335k.mo5025c();
                                aVar.f4352d = true;
                            } else {
                                if (aVar.f4352d) {
                                    a4 = this.f4335k.mo5024b(c2) + this.f4335k.mo5020a();
                                } else {
                                    a4 = this.f4335k.mo5021a(c2);
                                }
                                aVar.f4351c = a4;
                            }
                        } else {
                            aVar.f4352d = this.f4337m;
                            if (this.f4337m) {
                                aVar.f4351c = this.f4335k.mo5025c() - this.f4341q;
                            } else {
                                aVar.f4351c = this.f4335k.mo5023b() + this.f4341q;
                            }
                        }
                        this.f4344t.f4353e = true;
                    } else {
                        aVar.f4352d = this.f4343s.f4348c;
                        if (aVar.f4352d) {
                            aVar.f4351c = this.f4335k.mo5025c() - this.f4343s.f4347b;
                        } else {
                            aVar.f4351c = this.f4335k.mo5023b() + this.f4343s.f4347b;
                        }
                        this.f4344t.f4353e = true;
                    }
                }
            }
            if (mo4730s() != 0) {
                View z7 = mo4737z();
                if (z7 != null) {
                    RecyclerView.C1367j jVar = (RecyclerView.C1367j) z7.getLayoutParams();
                    if (!jVar.f4500c.isRemoved() && jVar.f4500c.getLayoutPosition() >= 0 && jVar.f4500c.getLayoutPosition() < sVar.mo4782a()) {
                        aVar.mo4383a(z7, m4426e(z7));
                        this.f4344t.f4353e = true;
                    }
                }
                if (this.f4331b == this.f4338n && (a3 = mo4315a(oVar, sVar, aVar.f4352d, this.f4338n)) != null) {
                    aVar.mo4385b(a3, m4426e(a3));
                    if (!sVar.f4535g && mo4340x_()) {
                        int a5 = this.f4335k.mo5021a(a3);
                        int b = this.f4335k.mo5024b(a3);
                        int b2 = this.f4335k.mo5023b();
                        int c3 = this.f4335k.mo5025c();
                        if (b > b2 || a5 >= b2) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (a5 < c3 || b <= c3) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z2 || z3) {
                            if (aVar.f4352d) {
                                b2 = c3;
                            }
                            aVar.f4351c = b2;
                        }
                    }
                    this.f4344t.f4353e = true;
                }
            }
            aVar.mo4384b();
            if (this.f4338n) {
                i9 = sVar.mo4782a() - 1;
            } else {
                i9 = 0;
            }
            aVar.f4350b = i9;
            this.f4344t.f4353e = true;
        } else if (z6 != null && (this.f4335k.mo5021a(z6) >= this.f4335k.mo5025c() || this.f4335k.mo5024b(z6) <= this.f4335k.mo5023b())) {
            this.f4344t.mo4383a(z6, m4426e(z6));
        }
        C1341c cVar = this.f4330a;
        if (cVar.f4368k >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        cVar.f4363f = i;
        int[] iArr = this.f4333d;
        iArr[0] = 0;
        iArr[1] = 0;
        m4178a(sVar, iArr);
        int max = Math.max(0, this.f4333d[0]) + this.f4335k.mo5023b();
        int max2 = Math.max(0, this.f4333d[1]) + this.f4335k.mo5031f();
        if (!(!sVar.f4535g || (i7 = this.f4340p) == -1 || this.f4341q == Integer.MIN_VALUE || (c = mo4358c(i7)) == null)) {
            if (this.f4337m) {
                i8 = this.f4335k.mo5025c() - this.f4335k.mo5024b(c);
                a2 = this.f4341q;
            } else {
                a2 = this.f4335k.mo5021a(c) - this.f4335k.mo5023b();
                i8 = this.f4341q;
            }
            int i11 = i8 - a2;
            if (i11 > 0) {
                max += i11;
            } else {
                max2 -= i11;
            }
        }
        if (!this.f4344t.f4352d ? !this.f4337m : this.f4337m) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        mo4322a(oVar, sVar, this.f4344t, i2);
        mo4693a(oVar);
        this.f4330a.f4370m = m4166D();
        this.f4330a.f4367j = sVar.f4535g;
        this.f4330a.f4366i = 0;
        if (this.f4344t.f4352d) {
            m4180b(this.f4344t);
            this.f4330a.f4365h = max;
            m4172a(oVar, this.f4330a, sVar, false);
            i4 = this.f4330a.f4359b;
            int i12 = this.f4330a.f4361d;
            if (this.f4330a.f4360c > 0) {
                max2 += this.f4330a.f4360c;
            }
            m4175a(this.f4344t);
            this.f4330a.f4365h = max2;
            this.f4330a.f4361d += this.f4330a.f4362e;
            m4172a(oVar, this.f4330a, sVar, false);
            i3 = this.f4330a.f4359b;
            if (this.f4330a.f4360c > 0) {
                int i13 = this.f4330a.f4360c;
                m4183f(i12, i4);
                this.f4330a.f4365h = i13;
                m4172a(oVar, this.f4330a, sVar, false);
                i4 = this.f4330a.f4359b;
            }
        } else {
            m4175a(this.f4344t);
            this.f4330a.f4365h = max2;
            m4172a(oVar, this.f4330a, sVar, false);
            i3 = this.f4330a.f4359b;
            int i14 = this.f4330a.f4361d;
            if (this.f4330a.f4360c > 0) {
                max += this.f4330a.f4360c;
            }
            m4180b(this.f4344t);
            this.f4330a.f4365h = max;
            this.f4330a.f4361d += this.f4330a.f4362e;
            m4172a(oVar, this.f4330a, sVar, false);
            i4 = this.f4330a.f4359b;
            if (this.f4330a.f4360c > 0) {
                int i15 = this.f4330a.f4360c;
                mo5806e(i14, i3);
                this.f4330a.f4365h = i15;
                m4172a(oVar, this.f4330a, sVar, false);
                i3 = this.f4330a.f4359b;
            }
        }
        if (mo4730s() > 0) {
            if (this.f4337m ^ this.f4338n) {
                int a6 = m4171a(i3, oVar, sVar, true);
                i5 = i4 + a6;
                i6 = i3 + a6;
                a = m4179b(i5, oVar, sVar, false);
            } else {
                int b3 = m4179b(i4, oVar, sVar, true);
                i5 = i4 + b3;
                i6 = i3 + b3;
                a = m4171a(i6, oVar, sVar, false);
            }
            i4 = i5 + a;
            i3 = i6 + a;
        }
        if (sVar.f4539k && mo4730s() != 0 && !sVar.f4535g && mo4340x_()) {
            List<RecyclerView.ViewHolder> list = oVar.f4507d;
            int size = list.size();
            int e = m4426e(mo4717g(0));
            int i16 = 0;
            int i17 = 0;
            for (int i18 = 0; i18 < size; i18++) {
                RecyclerView.ViewHolder viewHolder = list.get(i18);
                if (!viewHolder.isRemoved()) {
                    if (viewHolder.getLayoutPosition() < e) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z != this.f4337m) {
                        i16 += this.f4335k.mo5030e(viewHolder.itemView);
                    } else {
                        i17 += this.f4335k.mo5030e(viewHolder.itemView);
                    }
                }
            }
            this.f4330a.f4369l = list;
            if (i16 > 0) {
                m4183f(m4426e(m4167E()), i4);
                this.f4330a.f4365h = i16;
                this.f4330a.f4360c = 0;
                this.f4330a.mo4389a((View) null);
                m4172a(oVar, this.f4330a, sVar, false);
            }
            if (i17 > 0) {
                mo5806e(m4426e(m4168F()), i3);
                this.f4330a.f4365h = i17;
                this.f4330a.f4360c = 0;
                this.f4330a.mo4389a((View) null);
                m4172a(oVar, this.f4330a, sVar, false);
            }
            this.f4330a.f4369l = null;
        }
        if (!sVar.f4535g) {
            AbstractC1491x xVar = this.f4335k;
            xVar.f4933b = xVar.mo5029e();
        } else {
            this.f4344t.mo4382a();
        }
        this.f4331b = this.f4338n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public int mo4312a(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        if (this.f4334j == 1) {
            return 0;
        }
        return m4181c(i, oVar, sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public int mo4331b(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        if (this.f4334j == 0) {
            return 0;
        }
        return m4181c(i, oVar, sVar);
    }

    /* renamed from: a */
    private void m4176a(RecyclerView.C1372o oVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo4687a(i3, oVar);
                }
                return;
            }
            while (i > i2) {
                mo4687a(i, oVar);
                i--;
            }
        }
    }

    /* renamed from: c */
    private int m4181c(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        int i2;
        if (mo4730s() == 0 || i == 0) {
            return 0;
        }
        mo4370i();
        this.f4330a.f4358a = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        m4174a(i2, abs, true, sVar);
        int a = this.f4330a.f4364g + m4172a(oVar, this.f4330a, sVar, false);
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.f4335k.mo5022a(-i);
        this.f4330a.f4368k = i;
        return i;
    }

    /* renamed from: a */
    private int m4171a(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar, boolean z) {
        int c;
        int c2 = this.f4335k.mo5025c() - i;
        if (c2 <= 0) {
            return 0;
        }
        int i2 = -m4181c(-c2, oVar, sVar);
        int i3 = i + i2;
        if (!z || (c = this.f4335k.mo5025c() - i3) <= 0) {
            return i2;
        }
        this.f4335k.mo5022a(c);
        return c + i2;
    }

    /* renamed from: b */
    private int m4179b(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar, boolean z) {
        int b;
        int b2 = i - this.f4335k.mo5023b();
        if (b2 <= 0) {
            return 0;
        }
        int i2 = -m4181c(b2, oVar, sVar);
        int i3 = i + i2;
        if (!z || (b = i3 - this.f4335k.mo5023b()) <= 0) {
            return i2;
        }
        this.f4335k.mo5022a(-b);
        return i2 - b;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f4334j = 1;
        this.f4339o = true;
        this.f4340p = -1;
        this.f4341q = Integer.MIN_VALUE;
        this.f4344t = new C1339a();
        this.f4332c = new C1340b();
        this.f4345u = 2;
        this.f4333d = new int[2];
        RecyclerView.AbstractC1362i.C1366b a = m4415a(context, attributeSet, i, i2);
        mo4356b(a.f4496a);
        mo4357b(a.f4498c);
        mo4329a(a.f4499d);
    }

    /* renamed from: a */
    private int m4172a(RecyclerView.C1372o oVar, C1341c cVar, RecyclerView.C1378s sVar, boolean z) {
        int i = cVar.f4360c;
        if (cVar.f4364g != Integer.MIN_VALUE) {
            if (cVar.f4360c < 0) {
                cVar.f4364g += cVar.f4360c;
            }
            m4177a(oVar, cVar);
        }
        int i2 = cVar.f4360c + cVar.f4365h;
        C1340b bVar = this.f4332c;
        while (true) {
            if ((!cVar.f4370m && i2 <= 0) || !cVar.mo4390a(sVar)) {
                break;
            }
            bVar.mo4387a();
            mo4323a(oVar, sVar, cVar, bVar);
            if (bVar.f4355b) {
                break;
            }
            cVar.f4359b += bVar.f4354a * cVar.f4363f;
            if (!bVar.f4356c || cVar.f4369l != null || !sVar.f4535g) {
                cVar.f4360c -= bVar.f4354a;
                i2 -= bVar.f4354a;
            }
            if (cVar.f4364g != Integer.MIN_VALUE) {
                cVar.f4364g += bVar.f4354a;
                if (cVar.f4360c < 0) {
                    cVar.f4364g += cVar.f4360c;
                }
                m4177a(oVar, cVar);
            }
            if (z && bVar.f4357d) {
                break;
            }
        }
        return i - cVar.f4360c;
    }

    /* renamed from: a */
    private View m4173a(int i, int i2, boolean z, boolean z2) {
        int i3;
        mo4370i();
        int i4 = 320;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (!z2) {
            i4 = 0;
        }
        if (this.f4334j == 0) {
            return this.f4491x.mo4865a(i, i2, i3, i4);
        }
        return this.f4492y.mo4865a(i, i2, i3, i4);
    }

    /* renamed from: a */
    private void m4174a(int i, int i2, boolean z, RecyclerView.C1378s sVar) {
        int i3;
        int b;
        this.f4330a.f4370m = m4166D();
        this.f4330a.f4363f = i;
        int[] iArr = this.f4333d;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        m4178a(sVar, iArr);
        int max = Math.max(0, this.f4333d[0]);
        int max2 = Math.max(0, this.f4333d[1]);
        if (i == 1) {
            z2 = true;
        }
        C1341c cVar = this.f4330a;
        if (z2) {
            i3 = max2;
        } else {
            i3 = max;
        }
        cVar.f4365h = i3;
        C1341c cVar2 = this.f4330a;
        if (!z2) {
            max = max2;
        }
        cVar2.f4366i = max;
        if (z2) {
            this.f4330a.f4365h += this.f4335k.mo5031f();
            View F = m4168F();
            C1341c cVar3 = this.f4330a;
            if (this.f4337m) {
                i4 = -1;
            }
            cVar3.f4362e = i4;
            this.f4330a.f4361d = m4426e(F) + this.f4330a.f4362e;
            this.f4330a.f4359b = this.f4335k.mo5024b(F);
            b = this.f4335k.mo5024b(F) - this.f4335k.mo5025c();
        } else {
            View E = m4167E();
            this.f4330a.f4365h += this.f4335k.mo5023b();
            C1341c cVar4 = this.f4330a;
            if (!this.f4337m) {
                i4 = -1;
            }
            cVar4.f4362e = i4;
            this.f4330a.f4361d = m4426e(E) + this.f4330a.f4362e;
            this.f4330a.f4359b = this.f4335k.mo5021a(E);
            b = (-this.f4335k.mo5021a(E)) + this.f4335k.mo5023b();
        }
        this.f4330a.f4360c = i2;
        if (z) {
            this.f4330a.f4360c -= b;
        }
        this.f4330a.f4364g = b;
    }
}
