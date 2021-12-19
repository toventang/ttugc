package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.AbstractC1362i implements RecyclerView.AbstractC1375r.AbstractC1377b {

    /* renamed from: L */
    private boolean f4553L = true;

    /* renamed from: M */
    private int[] f4554M;

    /* renamed from: N */
    private final Runnable f4555N = new Runnable() {
        /* class androidx.recyclerview.widget.StaggeredGridLayoutManager.RunnableC13811 */

        static {
            Covode.recordClassIndex(1516);
        }

        public final void run() {
            StaggeredGridLayoutManager.this.mo4792h();
        }
    };

    /* renamed from: a */
    public int f4556a = -1;

    /* renamed from: b */
    public C1386c[] f4557b;

    /* renamed from: c */
    AbstractC1491x f4558c;

    /* renamed from: d */
    AbstractC1491x f4559d;

    /* renamed from: e */
    public int f4560e;

    /* renamed from: f */
    public boolean f4561f;

    /* renamed from: g */
    boolean f4562g;

    /* renamed from: h */
    int f4563h = -1;

    /* renamed from: i */
    int f4564i = Integer.MIN_VALUE;

    /* renamed from: j */
    LazySpanLookup f4565j = new LazySpanLookup();

    /* renamed from: k */
    public int f4566k = 2;

    /* renamed from: l */
    private int f4567l;

    /* renamed from: m */
    private final C1480q f4568m;

    /* renamed from: n */
    private BitSet f4569n;

    /* renamed from: o */
    private boolean f4570o;

    /* renamed from: p */
    private boolean f4571p;

    /* renamed from: q */
    private SavedState f4572q;

    /* renamed from: r */
    private int f4573r;

    /* renamed from: s */
    private final Rect f4574s = new Rect();

    /* renamed from: t */
    private final C1384a f4575t = new C1384a();

    /* renamed from: u */
    private boolean f4576u = false;

    /* access modifiers changed from: package-private */
    public static class LazySpanLookup {

        /* renamed from: a */
        int[] f4578a;

        /* renamed from: b */
        List<FullSpanItem> f4579b;

        static {
            Covode.recordClassIndex(1517);
        }

        /* access modifiers changed from: package-private */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new Parcelable.Creator<FullSpanItem>() {
                /* class androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.C13821 */

                static {
                    Covode.recordClassIndex(1519);
                }

                /* Return type fixed from 'java.lang.Object[]' to match base method */
                @Override // android.os.Parcelable.Creator
                public final /* bridge */ /* synthetic */ FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }
            };

            /* renamed from: a */
            int f4580a;

            /* renamed from: b */
            int f4581b;

            /* renamed from: c */
            int[] f4582c;

            /* renamed from: d */
            boolean f4583d;

            public int describeContents() {
                return 0;
            }

            FullSpanItem() {
            }

            static {
                Covode.recordClassIndex(1518);
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f4580a + ", mGapDir=" + this.f4581b + ", mHasUnwantedGapAfter=" + this.f4583d + ", mGapPerSpan=" + Arrays.toString(this.f4582c) + '}';
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public final int mo4806a(int i) {
                int[] iArr = this.f4582c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            FullSpanItem(Parcel parcel) {
                this.f4580a = parcel.readInt();
                this.f4581b = parcel.readInt();
                this.f4583d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f4582c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f4580a);
                parcel.writeInt(this.f4581b);
                parcel.writeInt(this.f4583d ? 1 : 0);
                int[] iArr = this.f4582c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f4582c);
            }
        }

        LazySpanLookup() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4798a() {
            int[] iArr = this.f4578a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4579b = null;
        }

        /* renamed from: e */
        private int m4699e(int i) {
            int length = this.f4578a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final int mo4804c(int i) {
            int[] iArr = this.f4578a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* renamed from: d */
        public final FullSpanItem mo4805d(int i) {
            List<FullSpanItem> list = this.f4579b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f4579b.get(size);
                if (fullSpanItem.f4580a == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: f */
        private void m4700f(int i) {
            int[] iArr = this.f4578a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f4578a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[m4699e(i)];
                this.f4578a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4578a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: g */
        private int m4701g(int i) {
            if (this.f4579b == null) {
                return -1;
            }
            FullSpanItem d = mo4805d(i);
            if (d != null) {
                this.f4579b.remove(d);
            }
            int size = this.f4579b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (this.f4579b.get(i2).f4580a < i) {
                    i2++;
                } else if (i2 != -1) {
                    this.f4579b.remove(i2);
                    return this.f4579b.get(i2).f4580a;
                }
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo4796a(int i) {
            List<FullSpanItem> list = this.f4579b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f4579b.get(size).f4580a >= i) {
                        this.f4579b.remove(size);
                    }
                }
            }
            return mo4802b(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final int mo4802b(int i) {
            int[] iArr = this.f4578a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int g = m4701g(i);
            if (g == -1) {
                int[] iArr2 = this.f4578a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f4578a.length;
            }
            int min = Math.min(g + 1, this.f4578a.length);
            Arrays.fill(this.f4578a, i, min, -1);
            return min;
        }

        /* renamed from: a */
        public final void mo4801a(FullSpanItem fullSpanItem) {
            if (this.f4579b == null) {
                this.f4579b = new ArrayList();
            }
            int size = this.f4579b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f4579b.get(i);
                if (fullSpanItem2.f4580a == fullSpanItem.f4580a) {
                    this.f4579b.remove(i);
                }
                if (fullSpanItem2.f4580a >= fullSpanItem.f4580a) {
                    this.f4579b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f4579b.add(fullSpanItem);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4800a(int i, C1386c cVar) {
            m4700f(i);
            this.f4578a[i] = cVar.f4607e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo4803b(int i, int i2) {
            int[] iArr = this.f4578a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                m4700f(i3);
                int[] iArr2 = this.f4578a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f4578a, i, i3, -1);
                m4698d(i, i2);
            }
        }

        /* renamed from: c */
        private void m4697c(int i, int i2) {
            List<FullSpanItem> list = this.f4579b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f4579b.get(size);
                    if (fullSpanItem.f4580a >= i) {
                        if (fullSpanItem.f4580a < i3) {
                            this.f4579b.remove(size);
                        } else {
                            fullSpanItem.f4580a -= i2;
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        private void m4698d(int i, int i2) {
            List<FullSpanItem> list = this.f4579b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f4579b.get(size);
                    if (fullSpanItem.f4580a >= i) {
                        fullSpanItem.f4580a += i2;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4799a(int i, int i2) {
            int[] iArr = this.f4578a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                m4700f(i3);
                int[] iArr2 = this.f4578a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f4578a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m4697c(i, i2);
            }
        }

        /* renamed from: a */
        public final FullSpanItem mo4797a(int i, int i2, int i3) {
            List<FullSpanItem> list = this.f4579b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f4579b.get(i4);
                if (fullSpanItem.f4580a >= i2) {
                    return null;
                }
                if (fullSpanItem.f4580a >= i && (i3 == 0 || fullSpanItem.f4581b == i3 || fullSpanItem.f4583d)) {
                    return fullSpanItem;
                }
            }
            return null;
        }
    }

    static {
        Covode.recordClassIndex(1515);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState.C13831 */

            static {
                Covode.recordClassIndex(1521);
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
        int f4584a;

        /* renamed from: b */
        int f4585b;

        /* renamed from: c */
        int f4586c;

        /* renamed from: d */
        int[] f4587d;

        /* renamed from: e */
        int f4588e;

        /* renamed from: f */
        int[] f4589f;

        /* renamed from: g */
        List<LazySpanLookup.FullSpanItem> f4590g;

        /* renamed from: h */
        boolean f4591h;

        /* renamed from: i */
        boolean f4592i;

        /* renamed from: j */
        boolean f4593j;

        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        static {
            Covode.recordClassIndex(1520);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4812a() {
            this.f4587d = null;
            this.f4586c = 0;
            this.f4588e = 0;
            this.f4589f = null;
            this.f4590g = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo4813b() {
            this.f4587d = null;
            this.f4586c = 0;
            this.f4584a = -1;
            this.f4585b = -1;
        }

        public SavedState(SavedState savedState) {
            this.f4586c = savedState.f4586c;
            this.f4584a = savedState.f4584a;
            this.f4585b = savedState.f4585b;
            this.f4587d = savedState.f4587d;
            this.f4588e = savedState.f4588e;
            this.f4589f = savedState.f4589f;
            this.f4591h = savedState.f4591h;
            this.f4592i = savedState.f4592i;
            this.f4593j = savedState.f4593j;
            this.f4590g = savedState.f4590g;
        }

        SavedState(Parcel parcel) {
            boolean z;
            boolean z2;
            this.f4584a = parcel.readInt();
            this.f4585b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f4586c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f4587d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f4588e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f4589f = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z3 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f4591h = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f4592i = z2;
            this.f4593j = parcel.readInt() == 1 ? true : z3;
            this.f4590g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4584a);
            parcel.writeInt(this.f4585b);
            parcel.writeInt(this.f4586c);
            if (this.f4586c > 0) {
                parcel.writeIntArray(this.f4587d);
            }
            parcel.writeInt(this.f4588e);
            if (this.f4588e > 0) {
                parcel.writeIntArray(this.f4589f);
            }
            parcel.writeInt(this.f4591h ? 1 : 0);
            parcel.writeInt(this.f4592i ? 1 : 0);
            parcel.writeInt(this.f4593j ? 1 : 0);
            parcel.writeList(this.f4590g);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public void mo4353a(RecyclerView recyclerView, RecyclerView.C1372o oVar) {
        super.mo4353a(recyclerView, oVar);
        mo4699a(this.f4555N);
        for (int i = 0; i < this.f4556a; i++) {
            this.f4557b[i].mo4828c();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: a */
    private boolean m4624a(C1386c cVar) {
        return this.f4562g ? cVar.mo4825b() < this.f4558c.mo5025c() && !((C1385b) cVar.f4603a.get(cVar.f4603a.size() - 1).getLayoutParams()).f4602b : cVar.mo4820a() > this.f4558c.mo5023b() && !((C1385b) cVar.f4603a.get(0).getLayoutParams()).f4602b;
    }

    /* renamed from: a */
    public final void mo4318a(int i) {
        mo4355a((String) null);
        if (i != this.f4556a) {
            mo4794k();
            this.f4556a = i;
            this.f4569n = new BitSet(this.f4556a);
            this.f4557b = new C1386c[this.f4556a];
            for (int i2 = 0; i2 < this.f4556a; i2++) {
                this.f4557b[i2] = new C1386c(i2);
            }
            mo4726o();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4355a(String str) {
        if (this.f4572q == null) {
            super.mo4355a(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4319a(Rect rect, int i, int i2) {
        int a;
        int a2;
        int t = mo4731t() + mo4733v();
        int u = mo4732u() + mo4734w();
        if (this.f4560e == 1) {
            a2 = m4413a(i2, rect.height() + u, C0792v.m2775i(this.f4490w));
            a = m4413a(i, (this.f4567l * this.f4556a) + t, C0792v.m2774h(this.f4490w));
        } else {
            a = m4413a(i, rect.width() + t, C0792v.m2774h(this.f4490w));
            a2 = m4413a(i2, (this.f4567l * this.f4556a) + u, C0792v.m2775i(this.f4490w));
        }
        mo4714d(a, a2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4692a(RecyclerView.AbstractC1350a aVar, RecyclerView.AbstractC1350a aVar2) {
        this.f4565j.mo4798a();
        for (int i = 0; i < this.f4556a; i++) {
            this.f4557b[i].mo4828c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public void mo4324a(RecyclerView.C1378s sVar) {
        super.mo4324a(sVar);
        this.f4563h = -1;
        this.f4564i = Integer.MIN_VALUE;
        this.f4572q = null;
        this.f4575t.mo4818a();
    }

    /* renamed from: a */
    public final int[] mo4790a(int[] iArr) {
        int a;
        if (iArr == null) {
            iArr = new int[this.f4556a];
        } else if (iArr.length < this.f4556a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f4556a + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f4556a; i++) {
            C1386c cVar = this.f4557b[i];
            if (StaggeredGridLayoutManager.this.f4561f) {
                a = cVar.mo4822a(cVar.f4603a.size() - 1, -1, false);
            } else {
                a = cVar.mo4822a(0, cVar.f4603a.size(), false);
            }
            iArr[i] = a;
        }
        return iArr;
    }

    /* renamed from: b */
    public final int[] mo4791b(int[] iArr) {
        int a;
        if (iArr == null) {
            iArr = new int[this.f4556a];
        } else if (iArr.length < this.f4556a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f4556a + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f4556a; i++) {
            C1386c cVar = this.f4557b[i];
            if (StaggeredGridLayoutManager.this.f4561f) {
                a = cVar.mo4822a(0, cVar.f4603a.size(), false);
            } else {
                a = cVar.mo4822a(cVar.f4603a.size() - 1, -1, false);
            }
            iArr[i] = a;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4350a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f4572q = savedState;
            if (this.f4563h != -1) {
                savedState.mo4813b();
                this.f4572q.mo4812a();
            }
            mo4726o();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4352a(AccessibilityEvent accessibilityEvent) {
        super.mo4352a(accessibilityEvent);
        if (mo4730s() > 0) {
            View b = m4626b(false);
            View c = m4632c(false);
            if (b != null && c != null) {
                int e = m4426e(b);
                int e2 = m4426e(c);
                if (e < e2) {
                    accessibilityEvent.setFromIndex(e);
                    accessibilityEvent.setToIndex(e2);
                    return;
                }
                accessibilityEvent.setFromIndex(e2);
                accessibilityEvent.setToIndex(e);
            }
        }
    }

    /* renamed from: a */
    private void m4620a(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar, boolean z) {
        int c;
        int o = m4646o(Integer.MIN_VALUE);
        if (o != Integer.MIN_VALUE && (c = this.f4558c.mo5025c() - o) > 0) {
            int i = c - (-m4631c(-c, oVar, sVar));
            if (z && i > 0) {
                this.f4558c.mo5022a(i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final void mo4335b(RecyclerView recyclerView, int i, int i2) {
        m4633c(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4326a(RecyclerView recyclerView, int i, int i2) {
        m4633c(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4327a(RecyclerView recyclerView, int i, int i2, int i3) {
        m4633c(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4328a(RecyclerView recyclerView, int i, int i2, Object obj) {
        m4633c(i, i2, 4);
    }

    /* renamed from: a */
    private void m4621a(RecyclerView.C1372o oVar, C1480q qVar) {
        int min;
        int min2;
        if (qVar.f4902a && !qVar.f4910i) {
            if (qVar.f4903b == 0) {
                if (qVar.f4906e == -1) {
                    m4629b(oVar, qVar.f4908g);
                } else {
                    m4619a(oVar, qVar.f4907f);
                }
            } else if (qVar.f4906e == -1) {
                int m = qVar.f4907f - m4642m(qVar.f4907f);
                if (m < 0) {
                    min2 = qVar.f4908g;
                } else {
                    min2 = qVar.f4908g - Math.min(m, qVar.f4903b);
                }
                m4629b(oVar, min2);
            } else {
                int p = m4647p(qVar.f4908g) - qVar.f4908g;
                if (p < 0) {
                    min = qVar.f4907f;
                } else {
                    min = Math.min(p, qVar.f4903b) + qVar.f4907f;
                }
                m4619a(oVar, min);
            }
        }
    }

    /* renamed from: a */
    private void m4622a(C1386c cVar, int i, int i2) {
        int i3 = cVar.f4606d;
        if (i == -1) {
            if (cVar.mo4820a() + i3 <= i2) {
                this.f4569n.set(cVar.f4607e, false);
            }
        } else if (cVar.mo4825b() - i3 >= i2) {
            this.f4569n.set(cVar.f4607e, false);
        }
    }

    /* renamed from: a */
    private void m4619a(RecyclerView.C1372o oVar, int i) {
        while (mo4730s() > 0) {
            View g = mo4717g(0);
            if (this.f4558c.mo5024b(g) <= i && this.f4558c.mo5026c(g) <= i) {
                C1385b bVar = (C1385b) g.getLayoutParams();
                if (bVar.f4602b) {
                    for (int i2 = 0; i2 < this.f4556a; i2++) {
                        if (this.f4557b[i2].f4603a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f4556a; i3++) {
                        this.f4557b[i3].mo4832e();
                    }
                } else if (bVar.f4601a.f4603a.size() != 1) {
                    bVar.f4601a.mo4832e();
                } else {
                    return;
                }
                mo4691a(g, oVar);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
        C1481r rVar = new C1481r(recyclerView.getContext());
        rVar.f4515g = i;
        mo4695a(rVar);
    }

    /* renamed from: a */
    public final void mo4347a(int i, int i2) {
        SavedState savedState = this.f4572q;
        if (savedState != null) {
            savedState.mo4813b();
        }
        this.f4563h = i;
        this.f4564i = i2;
        mo4726o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4348a(int i, int i2, RecyclerView.C1378s sVar, RecyclerView.AbstractC1362i.AbstractC1365a aVar) {
        int b;
        int i3;
        if (this.f4560e != 0) {
            i = i2;
        }
        if (!(mo4730s() == 0 || i == 0)) {
            m4628b(i, sVar);
            int[] iArr = this.f4554M;
            if (iArr == null || iArr.length < this.f4556a) {
                this.f4554M = new int[this.f4556a];
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f4556a; i5++) {
                if (this.f4568m.f4905d == -1) {
                    b = this.f4568m.f4907f;
                    i3 = this.f4557b[i5].mo4821a(this.f4568m.f4907f);
                } else {
                    b = this.f4557b[i5].mo4826b(this.f4568m.f4908g);
                    i3 = this.f4568m.f4908g;
                }
                int i6 = b - i3;
                if (i6 >= 0) {
                    this.f4554M[i4] = i6;
                    i4++;
                }
            }
            Arrays.sort(this.f4554M, 0, i4);
            for (int i7 = 0; i7 < i4 && this.f4568m.mo5008a(sVar); i7++) {
                aVar.mo4743a(this.f4568m.f4904c, this.f4554M[i7]);
                this.f4568m.f4904c += this.f4568m.f4905d;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final RecyclerView.C1367j mo4317a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1385b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1385b(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        if (r11.f4560e == 1) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        if (m4608C() == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004b, code lost:
        if (m4608C() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
        if (r11.f4560e == 0) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0129 A[LOOP:3: B:93:0x0129->B:101:0x0140, LOOP_START, PHI: r2 
      PHI: (r2v3 int) = (r2v2 int), (r2v4 int) binds: [B:80:0x00ff, B:101:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo4314a(android.view.View r12, int r13, androidx.recyclerview.widget.RecyclerView.C1372o r14, androidx.recyclerview.widget.RecyclerView.C1378s r15) {
        /*
        // Method dump skipped, instructions count: 333
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo4314a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s):android.view.View");
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public class C1386c {

        /* renamed from: a */
        public ArrayList<View> f4603a = new ArrayList<>();

        /* renamed from: b */
        int f4604b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f4605c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f4606d = 0;

        /* renamed from: e */
        final int f4607e;

        static {
            Covode.recordClassIndex(1524);
        }

        /* renamed from: j */
        private void m4721j() {
            this.f4604b = Integer.MIN_VALUE;
            this.f4605c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo4820a() {
            int i = this.f4604b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m4719h();
            return this.f4604b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo4828c() {
            this.f4603a.clear();
            m4721j();
            this.f4606d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final int mo4825b() {
            int i = this.f4605c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m4720i();
            return this.f4605c;
        }

        /* renamed from: f */
        public final int mo4833f() {
            if (StaggeredGridLayoutManager.this.f4561f) {
                return m4718b(this.f4603a.size() - 1, -1);
            }
            return m4718b(0, this.f4603a.size());
        }

        /* renamed from: g */
        public final int mo4834g() {
            if (StaggeredGridLayoutManager.this.f4561f) {
                return m4718b(0, this.f4603a.size());
            }
            return m4718b(this.f4603a.size() - 1, -1);
        }

        /* renamed from: h */
        private void m4719h() {
            LazySpanLookup.FullSpanItem d;
            View view = this.f4603a.get(0);
            C1385b bVar = (C1385b) view.getLayoutParams();
            this.f4604b = StaggeredGridLayoutManager.this.f4558c.mo5021a(view);
            if (bVar.f4602b && (d = StaggeredGridLayoutManager.this.f4565j.mo4805d(bVar.f4500c.getLayoutPosition())) != null && d.f4581b == -1) {
                this.f4604b -= d.mo4806a(this.f4607e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo4830d() {
            int size = this.f4603a.size();
            View remove = this.f4603a.remove(size - 1);
            C1385b bVar = (C1385b) remove.getLayoutParams();
            bVar.f4601a = null;
            if (bVar.f4500c.isRemoved() || bVar.f4500c.isUpdated()) {
                this.f4606d -= StaggeredGridLayoutManager.this.f4558c.mo5030e(remove);
            }
            if (size == 1) {
                this.f4604b = Integer.MIN_VALUE;
            }
            this.f4605c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final void mo4832e() {
            View remove = this.f4603a.remove(0);
            C1385b bVar = (C1385b) remove.getLayoutParams();
            bVar.f4601a = null;
            if (this.f4603a.size() == 0) {
                this.f4605c = Integer.MIN_VALUE;
            }
            if (bVar.f4500c.isRemoved() || bVar.f4500c.isUpdated()) {
                this.f4606d -= StaggeredGridLayoutManager.this.f4558c.mo5030e(remove);
            }
            this.f4604b = Integer.MIN_VALUE;
        }

        /* renamed from: i */
        private void m4720i() {
            LazySpanLookup.FullSpanItem d;
            ArrayList<View> arrayList = this.f4603a;
            View view = arrayList.get(arrayList.size() - 1);
            C1385b bVar = (C1385b) view.getLayoutParams();
            this.f4605c = StaggeredGridLayoutManager.this.f4558c.mo5024b(view);
            if (bVar.f4602b && (d = StaggeredGridLayoutManager.this.f4565j.mo4805d(bVar.f4500c.getLayoutPosition())) != null && d.f4581b == 1) {
                this.f4605c += d.mo4806a(this.f4607e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo4829c(int i) {
            this.f4604b = i;
            this.f4605c = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo4821a(int i) {
            int i2 = this.f4604b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4603a.size() == 0) {
                return i;
            }
            m4719h();
            return this.f4604b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo4831d(int i) {
            int i2 = this.f4604b;
            if (i2 != Integer.MIN_VALUE) {
                this.f4604b = i2 + i;
            }
            int i3 = this.f4605c;
            if (i3 != Integer.MIN_VALUE) {
                this.f4605c = i3 + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final int mo4826b(int i) {
            int i2 = this.f4605c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4603a.size() == 0) {
                return i;
            }
            m4720i();
            return this.f4605c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo4827b(View view) {
            C1385b bVar = (C1385b) view.getLayoutParams();
            bVar.f4601a = this;
            this.f4603a.add(view);
            this.f4605c = Integer.MIN_VALUE;
            if (this.f4603a.size() == 1) {
                this.f4604b = Integer.MIN_VALUE;
            }
            if (bVar.f4500c.isRemoved() || bVar.f4500c.isUpdated()) {
                this.f4606d += StaggeredGridLayoutManager.this.f4558c.mo5030e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4824a(View view) {
            C1385b bVar = (C1385b) view.getLayoutParams();
            bVar.f4601a = this;
            this.f4603a.add(0, view);
            this.f4604b = Integer.MIN_VALUE;
            if (this.f4603a.size() == 1) {
                this.f4605c = Integer.MIN_VALUE;
            }
            if (bVar.f4500c.isRemoved() || bVar.f4500c.isUpdated()) {
                this.f4606d += StaggeredGridLayoutManager.this.f4558c.mo5030e(view);
            }
        }

        /* renamed from: b */
        private int m4718b(int i, int i2) {
            return m4717a(i, i2, false, false, true);
        }

        C1386c(int i) {
            this.f4607e = i;
        }

        /* renamed from: a */
        public final View mo4823a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f4603a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f4603a.get(size);
                    if ((StaggeredGridLayoutManager.this.f4561f && StaggeredGridLayoutManager.m4426e(view2) >= i) || ((!StaggeredGridLayoutManager.this.f4561f && StaggeredGridLayoutManager.m4426e(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f4603a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f4603a.get(i3);
                    if ((StaggeredGridLayoutManager.this.f4561f && StaggeredGridLayoutManager.m4426e(view3) <= i) || ((!StaggeredGridLayoutManager.this.f4561f && StaggeredGridLayoutManager.m4426e(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: a */
        public final int mo4822a(int i, int i2, boolean z) {
            return m4717a(i, i2, z, true, false);
        }

        /* renamed from: a */
        private int m4717a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int i3;
            boolean z4;
            int b = StaggeredGridLayoutManager.this.f4558c.mo5023b();
            int c = StaggeredGridLayoutManager.this.f4558c.mo5025c();
            if (i2 > i) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            while (i != i2) {
                View view = this.f4603a.get(i);
                int a = StaggeredGridLayoutManager.this.f4558c.mo5021a(view);
                int b2 = StaggeredGridLayoutManager.this.f4558c.mo5024b(view);
                boolean z5 = false;
                if (!z3 ? a >= c : a > c) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!z3 ? b2 > b : b2 >= b) {
                    z5 = true;
                }
                if (z4 && z5) {
                    if (z) {
                        if (z2) {
                            if (a >= b && b2 <= c) {
                                return StaggeredGridLayoutManager.m4426e(view);
                            }
                        }
                    } else if (z2) {
                        return StaggeredGridLayoutManager.m4426e(view);
                    }
                    if (a < b || b2 > c) {
                        return StaggeredGridLayoutManager.m4426e(view);
                    }
                }
                i += i3;
            }
            return -1;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: w_ */
    public final boolean mo4375w_() {
        if (this.f4566k != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: x_ */
    public boolean mo4340x_() {
        if (this.f4572q == null) {
            return true;
        }
        return false;
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public static class C1385b extends RecyclerView.C1367j {

        /* renamed from: a */
        C1386c f4601a;

        /* renamed from: b */
        public boolean f4602b;

        static {
            Covode.recordClassIndex(1523);
        }

        /* renamed from: d */
        public final int mo4819d() {
            C1386c cVar = this.f4601a;
            if (cVar == null) {
                return -1;
            }
            return cVar.f4607e;
        }

        public C1385b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1385b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1385b(int i, int i2) {
            super(i, i2);
        }

        public C1385b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: C */
    private boolean m4608C() {
        if (C0792v.m2768e(this.f4490w) == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: f */
    public final boolean mo4366f() {
        if (this.f4560e == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: g */
    public boolean mo4368g() {
        if (this.f4560e == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void mo4793i() {
        mo4355a((String) null);
        if (this.f4566k != 0) {
            this.f4566k = 0;
            mo4726o();
        }
    }

    /* renamed from: k */
    public final void mo4794k() {
        this.f4565j.mo4798a();
        mo4726o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: y_ */
    public final void mo4341y_() {
        this.f4565j.mo4798a();
        mo4726o();
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class C1384a {

        /* renamed from: a */
        int f4594a;

        /* renamed from: b */
        int f4595b;

        /* renamed from: c */
        boolean f4596c;

        /* renamed from: d */
        boolean f4597d;

        /* renamed from: e */
        boolean f4598e;

        /* renamed from: f */
        int[] f4599f;

        static {
            Covode.recordClassIndex(1522);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4818a() {
            this.f4594a = -1;
            this.f4595b = Integer.MIN_VALUE;
            this.f4596c = false;
            this.f4597d = false;
            this.f4598e = false;
            int[] iArr = this.f4599f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        C1384a() {
            mo4818a();
        }
    }

    /* renamed from: D */
    private boolean m4609D() {
        int b = this.f4557b[0].mo4826b(Integer.MIN_VALUE);
        for (int i = 1; i < this.f4556a; i++) {
            if (this.f4557b[i].mo4826b(Integer.MIN_VALUE) != b) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: E */
    private boolean m4610E() {
        int a = this.f4557b[0].mo4821a(Integer.MIN_VALUE);
        for (int i = 1; i < this.f4556a; i++) {
            if (this.f4557b[i].mo4821a(Integer.MIN_VALUE) != a) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    private int m4611F() {
        int s = mo4730s();
        if (s == 0) {
            return 0;
        }
        return m4426e(mo4717g(s - 1));
    }

    /* renamed from: G */
    private int m4612G() {
        if (mo4730s() == 0) {
            return 0;
        }
        return m4426e(mo4717g(0));
    }

    /* renamed from: l */
    private void m4641l() {
        this.f4558c = AbstractC1491x.m5055a(this, this.f4560e);
        this.f4559d = AbstractC1491x.m5055a(this, 1 - this.f4560e);
    }

    /* renamed from: n */
    private void m4645n() {
        boolean z = true;
        if (this.f4560e == 1 || !m4608C()) {
            z = this.f4561f;
        } else if (this.f4561f) {
            z = false;
        }
        this.f4562g = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo4792h() {
        int G;
        int F;
        int i;
        if (mo4730s() == 0 || this.f4566k == 0 || !this.f4477B) {
            return false;
        }
        if (this.f4562g) {
            G = m4611F();
            F = m4612G();
        } else {
            G = m4612G();
            F = m4611F();
        }
        if (G == 0 && m4643m() != null) {
            this.f4565j.mo4798a();
            this.f4476A = true;
            mo4726o();
            return true;
        } else if (!this.f4576u) {
            return false;
        } else {
            if (this.f4562g) {
                i = -1;
            } else {
                i = 1;
            }
            int i2 = F + 1;
            LazySpanLookup.FullSpanItem a = this.f4565j.mo4797a(G, i2, i);
            if (a == null) {
                this.f4576u = false;
                this.f4565j.mo4796a(i2);
                return false;
            }
            LazySpanLookup.FullSpanItem a2 = this.f4565j.mo4797a(G, a.f4580a, i * -1);
            if (a2 == null) {
                this.f4565j.mo4796a(a.f4580a);
            } else {
                this.f4565j.mo4796a(a2.f4580a + 1);
            }
            this.f4476A = true;
            mo4726o();
            return true;
        }
    }

    /* renamed from: m */
    private View m4643m() {
        char c;
        int i;
        int i2;
        boolean z;
        boolean z2;
        int s = mo4730s() - 1;
        BitSet bitSet = new BitSet(this.f4556a);
        bitSet.set(0, this.f4556a, true);
        int i3 = -1;
        if (this.f4560e != 1 || !m4608C()) {
            c = 65535;
        } else {
            c = 1;
        }
        if (this.f4562g) {
            i = -1;
        } else {
            i = s + 1;
            s = 0;
        }
        if (s < i) {
            i3 = 1;
        }
        while (s != i) {
            View g = mo4717g(s);
            C1385b bVar = (C1385b) g.getLayoutParams();
            if (bitSet.get(bVar.f4601a.f4607e)) {
                if (m4624a(bVar.f4601a)) {
                    return g;
                }
                bitSet.clear(bVar.f4601a.f4607e);
            }
            if (!bVar.f4602b && (i2 = s + i3) != i) {
                View g2 = mo4717g(i2);
                if (this.f4562g) {
                    int b = this.f4558c.mo5024b(g);
                    int b2 = this.f4558c.mo5024b(g2);
                    if (b < b2) {
                        return g;
                    }
                    if (b != b2) {
                        continue;
                    }
                } else {
                    int a = this.f4558c.mo5021a(g);
                    int a2 = this.f4558c.mo5021a(g2);
                    if (a > a2) {
                        return g;
                    }
                    if (a != a2) {
                        continue;
                    }
                }
                if (bVar.f4601a.f4607e - ((C1385b) g2.getLayoutParams()).f4601a.f4607e < 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (c < 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z != z2) {
                    return g;
                }
            }
            s += i3;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: e */
    public final Parcelable mo4362e() {
        int G;
        View b;
        int a;
        int b2;
        if (this.f4572q != null) {
            return new SavedState(this.f4572q);
        }
        SavedState savedState = new SavedState();
        savedState.f4591h = this.f4561f;
        savedState.f4592i = this.f4570o;
        savedState.f4593j = this.f4571p;
        LazySpanLookup lazySpanLookup = this.f4565j;
        if (lazySpanLookup == null || lazySpanLookup.f4578a == null) {
            savedState.f4588e = 0;
        } else {
            savedState.f4589f = this.f4565j.f4578a;
            savedState.f4588e = savedState.f4589f.length;
            savedState.f4590g = this.f4565j.f4579b;
        }
        int i = -1;
        if (mo4730s() > 0) {
            if (this.f4570o) {
                G = m4611F();
            } else {
                G = m4612G();
            }
            savedState.f4584a = G;
            if (this.f4562g) {
                b = m4632c(true);
            } else {
                b = m4626b(true);
            }
            if (b != null) {
                i = m4426e(b);
            }
            savedState.f4585b = i;
            savedState.f4586c = this.f4556a;
            savedState.f4587d = new int[this.f4556a];
            for (int i2 = 0; i2 < this.f4556a; i2++) {
                if (this.f4570o) {
                    a = this.f4557b[i2].mo4826b(Integer.MIN_VALUE);
                    if (a != Integer.MIN_VALUE) {
                        b2 = this.f4558c.mo5025c();
                    } else {
                        savedState.f4587d[i2] = a;
                    }
                } else {
                    a = this.f4557b[i2].mo4821a(Integer.MIN_VALUE);
                    if (a != Integer.MIN_VALUE) {
                        b2 = this.f4558c.mo5023b();
                    } else {
                        savedState.f4587d[i2] = a;
                    }
                }
                a -= b2;
                savedState.f4587d[i2] = a;
            }
        } else {
            savedState.f4584a = -1;
            savedState.f4585b = -1;
            savedState.f4586c = 0;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final RecyclerView.C1367j mo4334b() {
        if (this.f4560e == 0) {
            return new C1385b(-2, -1);
        }
        return new C1385b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final boolean mo4330a(RecyclerView.C1367j jVar) {
        return jVar instanceof C1385b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public final int mo4336c(RecyclerView.C1378s sVar) {
        return m4638j(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: d */
    public final int mo4338d(RecyclerView.C1378s sVar) {
        return m4636h(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: e */
    public final int mo4339e(RecyclerView.C1378s sVar) {
        return m4636h(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: f */
    public final int mo4365f(RecyclerView.C1378s sVar) {
        return m4637i(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: g */
    public final int mo4367g(RecyclerView.C1378s sVar) {
        return m4637i(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: j */
    public final void mo4723j(int i) {
        if (i == 0) {
            mo4792h();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final int mo4333b(RecyclerView.C1378s sVar) {
        return m4638j(sVar);
    }

    /* renamed from: a */
    private void m4623a(boolean z) {
        mo4355a((String) null);
        SavedState savedState = this.f4572q;
        if (!(savedState == null || savedState.f4591h == z)) {
            this.f4572q.f4591h = z;
        }
        this.f4561f = z;
        mo4726o();
    }

    /* renamed from: b */
    private void m4627b(int i) {
        this.f4567l = i / this.f4556a;
        this.f4573r = View.MeasureSpec.makeMeasureSpec(i, this.f4559d.mo5033g());
    }

    /* renamed from: f */
    private void m4635f(int i) {
        boolean z;
        this.f4568m.f4906e = i;
        C1480q qVar = this.f4568m;
        boolean z2 = this.f4562g;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        qVar.f4905d = i2;
    }

    /* renamed from: m */
    private int m4642m(int i) {
        int a = this.f4557b[0].mo4821a(i);
        for (int i2 = 1; i2 < this.f4556a; i2++) {
            int a2 = this.f4557b[i2].mo4821a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: n */
    private int m4644n(int i) {
        int a = this.f4557b[0].mo4821a(i);
        for (int i2 = 1; i2 < this.f4556a; i2++) {
            int a2 = this.f4557b[i2].mo4821a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: o */
    private int m4646o(int i) {
        int b = this.f4557b[0].mo4826b(i);
        for (int i2 = 1; i2 < this.f4556a; i2++) {
            int b2 = this.f4557b[i2].mo4826b(i);
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: p */
    private int m4647p(int i) {
        int b = this.f4557b[0].mo4826b(i);
        for (int i2 = 1; i2 < this.f4556a; i2++) {
            int b2 = this.f4557b[i2].mo4826b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: r */
    private int m4649r(int i) {
        boolean z;
        if (mo4730s() != 0) {
            if (i < m4612G()) {
                z = true;
            } else {
                z = false;
            }
            if (z != this.f4562g) {
                return -1;
            }
            return 1;
        } else if (this.f4562g) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: w */
    private void m4650w(View view) {
        for (int i = this.f4556a - 1; i >= 0; i--) {
            this.f4557b[i].mo4827b(view);
        }
    }

    /* renamed from: x */
    private void m4651x(View view) {
        for (int i = this.f4556a - 1; i >= 0; i--) {
            this.f4557b[i].mo4824a(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r.AbstractC1377b
    /* renamed from: d */
    public final PointF mo4360d(int i) {
        int r = m4649r(i);
        PointF pointF = new PointF();
        if (r == 0) {
            return null;
        }
        if (this.f4560e == 0) {
            pointF.x = (float) r;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) r;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: h */
    public final void mo4719h(int i) {
        super.mo4719h(i);
        for (int i2 = 0; i2 < this.f4556a; i2++) {
            this.f4557b[i2].mo4831d(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: i */
    public final void mo4721i(int i) {
        super.mo4721i(i);
        for (int i2 = 0; i2 < this.f4556a; i2++) {
            this.f4557b[i2].mo4831d(i);
        }
    }

    /* renamed from: h */
    private int m4636h(RecyclerView.C1378s sVar) {
        if (mo4730s() == 0) {
            return 0;
        }
        return C1390aa.m4764a(sVar, this.f4558c, m4626b(!this.f4553L), m4632c(!this.f4553L), this, this.f4553L, this.f4562g);
    }

    /* renamed from: i */
    private int m4637i(RecyclerView.C1378s sVar) {
        if (mo4730s() == 0) {
            return 0;
        }
        return C1390aa.m4763a(sVar, this.f4558c, m4626b(!this.f4553L), m4632c(!this.f4553L), this, this.f4553L);
    }

    /* renamed from: j */
    private int m4638j(RecyclerView.C1378s sVar) {
        if (mo4730s() == 0) {
            return 0;
        }
        return C1390aa.m4765b(sVar, this.f4558c, m4626b(!this.f4553L), m4632c(!this.f4553L), this, this.f4553L);
    }

    /* renamed from: k */
    private LazySpanLookup.FullSpanItem m4639k(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f4582c = new int[this.f4556a];
        for (int i2 = 0; i2 < this.f4556a; i2++) {
            fullSpanItem.f4582c[i2] = i - this.f4557b[i2].mo4826b(i);
        }
        return fullSpanItem;
    }

    /* renamed from: l */
    private LazySpanLookup.FullSpanItem m4640l(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f4582c = new int[this.f4556a];
        for (int i2 = 0; i2 < this.f4556a; i2++) {
            fullSpanItem.f4582c[i2] = this.f4557b[i2].mo4821a(i) - i;
        }
        return fullSpanItem;
    }

    /* renamed from: q */
    private boolean m4648q(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f4560e == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != this.f4562g) {
                return true;
            }
            return false;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.f4562g) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == m4608C()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: e */
    public final void mo4363e(int i) {
        SavedState savedState = this.f4572q;
        if (!(savedState == null || savedState.f4584a == i)) {
            this.f4572q.mo4813b();
        }
        this.f4563h = i;
        this.f4564i = Integer.MIN_VALUE;
        mo4726o();
    }

    /* renamed from: a */
    private C1386c m4614a(C1480q qVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m4648q(qVar.f4906e)) {
            i = this.f4556a - 1;
            i2 = -1;
        } else {
            i = 0;
            i3 = this.f4556a;
            i2 = 1;
        }
        C1386c cVar = null;
        if (qVar.f4906e == 1) {
            int i4 = Integer.MAX_VALUE;
            int b = this.f4558c.mo5023b();
            while (i != i3) {
                C1386c cVar2 = this.f4557b[i];
                int b2 = cVar2.mo4826b(b);
                if (b2 < i4) {
                    cVar = cVar2;
                    i4 = b2;
                }
                i += i2;
            }
            return cVar;
        }
        int i5 = Integer.MIN_VALUE;
        int c = this.f4558c.mo5025c();
        while (i != i3) {
            C1386c cVar3 = this.f4557b[i];
            int a = cVar3.mo4821a(c);
            if (a > i5) {
                cVar = cVar3;
                i5 = a;
            }
            i += i2;
        }
        return cVar;
    }

    /* renamed from: b */
    private View m4626b(boolean z) {
        int b = this.f4558c.mo5023b();
        int c = this.f4558c.mo5025c();
        int s = mo4730s();
        View view = null;
        for (int i = 0; i < s; i++) {
            View g = mo4717g(i);
            int a = this.f4558c.mo5021a(g);
            if (this.f4558c.mo5024b(g) > b && a < c) {
                if (a >= b || !z) {
                    return g;
                }
                if (view == null) {
                    view = g;
                }
            }
        }
        return view;
    }

    /* renamed from: c */
    private View m4632c(boolean z) {
        int b = this.f4558c.mo5023b();
        int c = this.f4558c.mo5025c();
        View view = null;
        for (int s = mo4730s() - 1; s >= 0; s--) {
            View g = mo4717g(s);
            int a = this.f4558c.mo5021a(g);
            int b2 = this.f4558c.mo5024b(g);
            if (b2 > b && a < c) {
                if (b2 <= c || !z) {
                    return g;
                }
                if (view == null) {
                    view = g;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final RecyclerView.C1367j mo4316a(Context context, AttributeSet attributeSet) {
        return new C1385b(context, attributeSet);
    }

    /* renamed from: e */
    private void m4634e(int i, int i2) {
        for (int i3 = 0; i3 < this.f4556a; i3++) {
            if (!this.f4557b[i3].f4603a.isEmpty()) {
                m4622a(this.f4557b[i3], i, i2);
            }
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f4560e = i2;
        mo4318a(i);
        this.f4568m = new C1480q();
        m4641l();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4615a(int r7, androidx.recyclerview.widget.RecyclerView.C1378s r8) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4615a(int, androidx.recyclerview.widget.RecyclerView$s):void");
    }

    /* renamed from: b */
    private void m4628b(int i, RecyclerView.C1378s sVar) {
        int G;
        int i2;
        if (i > 0) {
            G = m4611F();
            i2 = 1;
        } else {
            G = m4612G();
            i2 = -1;
        }
        this.f4568m.f4902a = true;
        m4615a(G, sVar);
        m4635f(i2);
        C1480q qVar = this.f4568m;
        qVar.f4904c = G + qVar.f4905d;
        this.f4568m.f4903b = Math.abs(i);
    }

    /* renamed from: a */
    private void m4617a(View view, C1385b bVar) {
        if (bVar.f4602b) {
            if (this.f4560e == 1) {
                m4616a(view, this.f4573r, m4414a(this.f4486K, this.f4484I, mo4732u() + mo4734w(), bVar.height, true));
            } else {
                m4616a(view, m4414a(this.f4485J, this.f4483H, mo4731t() + mo4733v(), bVar.width, true), this.f4573r);
            }
        } else if (this.f4560e == 1) {
            m4616a(view, m4414a(this.f4567l, this.f4483H, 0, bVar.width, false), m4414a(this.f4486K, this.f4484I, mo4732u() + mo4734w(), bVar.height, true));
        } else {
            m4616a(view, m4414a(this.f4485J, this.f4483H, mo4731t() + mo4733v(), bVar.width, true), m4414a(this.f4567l, this.f4484I, 0, bVar.height, false));
        }
    }

    /* renamed from: b */
    private void m4629b(RecyclerView.C1372o oVar, int i) {
        for (int s = mo4730s() - 1; s >= 0; s--) {
            View g = mo4717g(s);
            if (this.f4558c.mo5021a(g) >= i && this.f4558c.mo5028d(g) >= i) {
                C1385b bVar = (C1385b) g.getLayoutParams();
                if (bVar.f4602b) {
                    for (int i2 = 0; i2 < this.f4556a; i2++) {
                        if (this.f4557b[i2].f4603a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f4556a; i3++) {
                        this.f4557b[i3].mo4830d();
                    }
                } else if (bVar.f4601a.f4603a.size() != 1) {
                    bVar.f4601a.mo4830d();
                } else {
                    return;
                }
                mo4691a(g, oVar);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:231:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x042c A[LOOP:0: B:1:0x0003->B:234:0x042c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x043d A[SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4337c(androidx.recyclerview.widget.RecyclerView.C1372o r13, androidx.recyclerview.widget.RecyclerView.C1378s r14) {
        /*
        // Method dump skipped, instructions count: 1086
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo4337c(androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final int mo4312a(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        return m4631c(i, oVar, sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public int mo4331b(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        return m4631c(i, oVar, sVar);
    }

    /* renamed from: a */
    private void m4616a(View view, int i, int i2) {
        mo4703b(view, this.f4574s);
        C1385b bVar = (C1385b) view.getLayoutParams();
        int b = m4625b(i, bVar.leftMargin + this.f4574s.left, bVar.rightMargin + this.f4574s.right);
        int b2 = m4625b(i2, bVar.topMargin + this.f4574s.top, bVar.bottomMargin + this.f4574s.bottom);
        if (mo4707b(view, b, b2, bVar)) {
            view.measure(b, b2);
        }
    }

    /* renamed from: b */
    private static int m4625b(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* renamed from: c */
    private int m4631c(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        if (mo4730s() == 0 || i == 0) {
            return 0;
        }
        m4628b(i, sVar);
        int a = m4613a(oVar, this.f4568m, sVar);
        if (this.f4568m.f4903b >= a) {
            if (i < 0) {
                i = -a;
            } else {
                i = a;
            }
        }
        this.f4558c.mo5022a(-i);
        this.f4570o = this.f4562g;
        this.f4568m.f4903b = 0;
        m4621a(oVar, this.f4568m);
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0020 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4633c(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f4562g
            if (r0 == 0) goto L_0x003f
            int r5 = r6.m4611F()
        L_0x0008:
            r4 = 8
            if (r9 != r4) goto L_0x003c
            if (r7 >= r8) goto L_0x0038
            int r3 = r8 + 1
        L_0x0010:
            r2 = r7
        L_0x0011:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.f4565j
            r0.mo4802b(r2)
            r1 = 1
            if (r9 == r1) goto L_0x0032
            r0 = 2
            if (r9 == r0) goto L_0x002c
            if (r9 == r4) goto L_0x0021
        L_0x001e:
            if (r3 > r5) goto L_0x0044
            return
        L_0x0021:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.f4565j
            r0.mo4799a(r7, r1)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.f4565j
            r0.mo4803b(r8, r1)
            goto L_0x001e
        L_0x002c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.f4565j
            r0.mo4799a(r7, r8)
            goto L_0x001e
        L_0x0032:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.f4565j
            r0.mo4803b(r7, r8)
            goto L_0x001e
        L_0x0038:
            int r3 = r7 + 1
            r2 = r8
            goto L_0x0011
        L_0x003c:
            int r3 = r7 + r8
            goto L_0x0010
        L_0x003f:
            int r5 = r6.m4612G()
            goto L_0x0008
        L_0x0044:
            boolean r0 = r6.f4562g
            if (r0 == 0) goto L_0x0052
            int r0 = r6.m4612G()
        L_0x004c:
            if (r2 > r0) goto L_0x0051
            r6.mo4726o()
        L_0x0051:
            return
        L_0x0052:
            int r0 = r6.m4611F()
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4633c(int, int, int):void");
    }

    /* renamed from: a */
    private int m4613a(RecyclerView.C1372o oVar, C1480q qVar, RecyclerView.C1378s sVar) {
        int i;
        int b;
        int o;
        boolean z;
        C1386c cVar;
        int a;
        int e;
        int b2;
        int e2;
        boolean E;
        int i2 = 0;
        this.f4569n.set(0, this.f4556a, true);
        if (this.f4568m.f4910i) {
            if (qVar.f4906e == 1) {
                i = Integer.MAX_VALUE;
            } else {
                i = Integer.MIN_VALUE;
            }
        } else if (qVar.f4906e == 1) {
            i = qVar.f4908g + qVar.f4903b;
        } else {
            i = qVar.f4907f - qVar.f4903b;
        }
        m4634e(qVar.f4906e, i);
        if (this.f4562g) {
            b = this.f4558c.mo5025c();
        } else {
            b = this.f4558c.mo5023b();
        }
        boolean z2 = false;
        while (qVar.mo5008a(sVar) && (this.f4568m.f4910i || !this.f4569n.isEmpty())) {
            View a2 = qVar.mo5007a(oVar);
            C1385b bVar = (C1385b) a2.getLayoutParams();
            int layoutPosition = bVar.f4500c.getLayoutPosition();
            int c = this.f4565j.mo4804c(layoutPosition);
            if (c == -1) {
                z = true;
                if (bVar.f4602b) {
                    cVar = this.f4557b[i2];
                } else {
                    cVar = m4614a(qVar);
                }
                this.f4565j.mo4800a(layoutPosition, cVar);
            } else {
                z = false;
                cVar = this.f4557b[c];
            }
            bVar.f4601a = cVar;
            if (qVar.f4906e == 1) {
                mo4710c(a2);
            } else {
                mo4688a(a2, i2);
            }
            m4617a(a2, bVar);
            if (qVar.f4906e == 1) {
                if (bVar.f4602b) {
                    e = m4646o(b);
                } else {
                    e = cVar.mo4826b(b);
                }
                a = this.f4558c.mo5030e(a2) + e;
                if (z && bVar.f4602b) {
                    LazySpanLookup.FullSpanItem k = m4639k(e);
                    k.f4581b = -1;
                    k.f4580a = layoutPosition;
                    this.f4565j.mo4801a(k);
                }
            } else {
                if (bVar.f4602b) {
                    a = m4644n(b);
                } else {
                    a = cVar.mo4821a(b);
                }
                e = a - this.f4558c.mo5030e(a2);
                if (z && bVar.f4602b) {
                    LazySpanLookup.FullSpanItem l = m4640l(a);
                    l.f4581b = 1;
                    l.f4580a = layoutPosition;
                    this.f4565j.mo4801a(l);
                }
            }
            if (bVar.f4602b && qVar.f4905d == -1) {
                if (!z) {
                    if (qVar.f4906e == 1) {
                        E = m4609D();
                    } else {
                        E = m4610E();
                    }
                    if (!E) {
                        LazySpanLookup.FullSpanItem d = this.f4565j.mo4805d(layoutPosition);
                        if (d != null) {
                            d.f4583d = true;
                        }
                    }
                }
                this.f4576u = true;
            }
            m4618a(a2, bVar, qVar);
            if (!m4608C() || this.f4560e != 1) {
                if (bVar.f4602b) {
                    b2 = this.f4559d.mo5023b();
                } else {
                    b2 = (cVar.f4607e * this.f4567l) + this.f4559d.mo5023b();
                }
                e2 = this.f4559d.mo5030e(a2) + b2;
            } else {
                if (bVar.f4602b) {
                    e2 = this.f4559d.mo5025c();
                } else {
                    e2 = this.f4559d.mo5025c() - (((this.f4556a - 1) - cVar.f4607e) * this.f4567l);
                }
                b2 = e2 - this.f4559d.mo5030e(a2);
            }
            if (this.f4560e == 1) {
                mo4702b(a2, b2, e, e2, a);
            } else {
                mo4702b(a2, e, b2, a, e2);
            }
            if (bVar.f4602b) {
                m4634e(this.f4568m.f4906e, i);
            } else {
                m4622a(cVar, this.f4568m.f4906e, i);
            }
            m4621a(oVar, this.f4568m);
            if (this.f4568m.f4909h && a2.hasFocusable()) {
                if (bVar.f4602b) {
                    this.f4569n.clear();
                } else {
                    this.f4569n.set(cVar.f4607e, false);
                }
            }
            z2 = true;
            i2 = 0;
        }
        if (!z2) {
            m4621a(oVar, this.f4568m);
        }
        if (this.f4568m.f4906e == -1) {
            o = this.f4558c.mo5023b() - m4644n(this.f4558c.mo5023b());
        } else {
            o = m4646o(this.f4558c.mo5025c()) - this.f4558c.mo5025c();
        }
        if (o > 0) {
            return Math.min(qVar.f4903b, o);
        }
        return 0;
    }

    /* renamed from: b */
    private void m4630b(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar, boolean z) {
        int b;
        int n = m4644n(Integer.MAX_VALUE);
        if (n != Integer.MAX_VALUE && (b = n - this.f4558c.mo5023b()) > 0) {
            int c = b - m4631c(b, oVar, sVar);
            if (z && c > 0) {
                this.f4558c.mo5022a(-c);
            }
        }
    }

    /* renamed from: a */
    private void m4618a(View view, C1385b bVar, C1480q qVar) {
        if (qVar.f4906e == 1) {
            if (bVar.f4602b) {
                m4650w(view);
            } else {
                bVar.f4601a.mo4827b(view);
            }
        } else if (bVar.f4602b) {
            m4651x(view);
        } else {
            bVar.f4601a.mo4824a(view);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.AbstractC1362i.C1366b a = m4415a(context, attributeSet, i, i2);
        int i3 = a.f4496a;
        if (i3 == 0 || i3 == 1) {
            mo4355a((String) null);
            if (i3 != this.f4560e) {
                this.f4560e = i3;
                AbstractC1491x xVar = this.f4558c;
                this.f4558c = this.f4559d;
                this.f4559d = xVar;
                mo4726o();
            }
            mo4318a(a.f4497b);
            m4623a(a.f4498c);
            this.f4568m = new C1480q();
            m4641l();
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }
}
