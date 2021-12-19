package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.AbstractC1491x;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.google.android.flexbox.C25246c;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager extends RecyclerView.AbstractC1362i implements RecyclerView.AbstractC1375r.AbstractC1377b, AbstractC25244a {

    /* renamed from: j */
    static final /* synthetic */ boolean f59765j = true;

    /* renamed from: k */
    private static final Rect f59766k = new Rect();

    /* renamed from: L */
    private int f59767L;

    /* renamed from: M */
    private int f59768M;

    /* renamed from: N */
    private SparseArray<View> f59769N;

    /* renamed from: O */
    private final Context f59770O;

    /* renamed from: P */
    private View f59771P;

    /* renamed from: Q */
    private int f59772Q;

    /* renamed from: R */
    private C25246c.C25247a f59773R;

    /* renamed from: a */
    public int f59774a;

    /* renamed from: b */
    public int f59775b;

    /* renamed from: c */
    public int f59776c;

    /* renamed from: d */
    public boolean f59777d;

    /* renamed from: e */
    public List<C25245b> f59778e;

    /* renamed from: f */
    public final C25246c f59779f;

    /* renamed from: g */
    public AbstractC1491x f59780g;

    /* renamed from: h */
    public AbstractC1491x f59781h;

    /* renamed from: i */
    public boolean f59782i;

    /* renamed from: l */
    private int f59783l;

    /* renamed from: m */
    private int f59784m;

    /* renamed from: n */
    private boolean f59785n;

    /* renamed from: o */
    private RecyclerView.C1372o f59786o;

    /* renamed from: p */
    private RecyclerView.C1378s f59787p;

    /* renamed from: q */
    private C25243b f59788q;

    /* renamed from: r */
    private C25242a f59789r;

    /* renamed from: s */
    private SavedState f59790s;

    /* renamed from: t */
    private int f59791t;

    /* renamed from: u */
    private int f59792u;

    public static class LayoutParams extends RecyclerView.C1367j implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() {
            /* class com.google.android.flexbox.FlexboxLayoutManager.LayoutParams.C252401 */

            static {
                Covode.recordClassIndex(30611);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }
        };

        /* renamed from: a */
        private float f59793a;

        /* renamed from: b */
        private float f59794b = 1.0f;

        /* renamed from: g */
        private int f59795g = -1;

        /* renamed from: h */
        private float f59796h = -1.0f;

        /* renamed from: i */
        private int f59797i;

        /* renamed from: j */
        private int f59798j;

        /* renamed from: k */
        private int f59799k = 16777215;

        /* renamed from: l */
        private int f59800l = 16777215;

        /* renamed from: m */
        private boolean f59801m;

        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: a */
        public final int mo41215a() {
            return this.width;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: b */
        public final int mo41217b() {
            return this.height;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: c */
        public final float mo41219c() {
            return this.f59793a;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: d */
        public final float mo41220d() {
            return this.f59794b;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: e */
        public final int mo41221e() {
            return this.f59795g;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: f */
        public final int mo41222f() {
            return this.f59797i;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: g */
        public final int mo41223g() {
            return this.f59798j;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: h */
        public final int mo41224h() {
            return this.f59799k;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: i */
        public final int mo41225i() {
            return this.f59800l;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: j */
        public final boolean mo41226j() {
            return this.f59801m;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: k */
        public final float mo41227k() {
            return this.f59796h;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: l */
        public final int mo41228l() {
            return this.leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: m */
        public final int mo41229m() {
            return this.topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: n */
        public final int mo41230n() {
            return this.rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: o */
        public final int mo41231o() {
            return this.bottomMargin;
        }

        static {
            Covode.recordClassIndex(30610);
        }

        public LayoutParams() {
            super(-2, -2);
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: a */
        public final void mo41216a(int i) {
            this.f59797i = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: b */
        public final void mo41218b(int i) {
            this.f59798j = i;
        }

        protected LayoutParams(Parcel parcel) {
            super(-2, -2);
            boolean z;
            this.f59793a = parcel.readFloat();
            this.f59794b = parcel.readFloat();
            this.f59795g = parcel.readInt();
            this.f59796h = parcel.readFloat();
            this.f59797i = parcel.readInt();
            this.f59798j = parcel.readInt();
            this.f59799k = parcel.readInt();
            this.f59800l = parcel.readInt();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f59801m = z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f59793a);
            parcel.writeFloat(this.f59794b);
            parcel.writeInt(this.f59795g);
            parcel.writeFloat(this.f59796h);
            parcel.writeInt(this.f59797i);
            parcel.writeInt(this.f59798j);
            parcel.writeInt(this.f59799k);
            parcel.writeInt(this.f59800l);
            parcel.writeByte(this.f59801m ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }
    }

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.google.android.flexbox.FlexboxLayoutManager.SavedState.C252411 */

            static {
                Covode.recordClassIndex(30613);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (byte) 0);
            }
        };

        /* renamed from: a */
        public int f59802a;

        /* renamed from: b */
        public int f59803b;

        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        static {
            Covode.recordClassIndex(30612);
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f59802a + ", mAnchorOffset=" + this.f59803b + '}';
        }

        private SavedState(Parcel parcel) {
            this.f59802a = parcel.readInt();
            this.f59803b = parcel.readInt();
        }

        /* renamed from: a */
        public final boolean mo41253a(int i) {
            int i2 = this.f59802a;
            if (i2 < 0 || i2 >= i) {
                return false;
            }
            return true;
        }

        private SavedState(SavedState savedState) {
            this.f59802a = savedState.f59802a;
            this.f59803b = savedState.f59803b;
        }

        /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f59802a);
            parcel.writeInt(this.f59803b);
        }

        /* synthetic */ SavedState(SavedState savedState, byte b) {
            this(savedState);
        }
    }

    @Override // com.google.android.flexbox.AbstractC25244a
    /* renamed from: c */
    public final int mo41240c() {
        return this.f59774a;
    }

    @Override // com.google.android.flexbox.AbstractC25244a
    /* renamed from: d */
    public final int mo41241d() {
        return this.f59775b;
    }

    @Override // com.google.android.flexbox.AbstractC25244a
    /* renamed from: h */
    public final int mo41242h() {
        return this.f59783l;
    }

    @Override // com.google.android.flexbox.AbstractC25244a
    /* renamed from: k */
    public final int mo41245k() {
        return this.f59784m;
    }

    @Override // com.google.android.flexbox.AbstractC25244a
    /* renamed from: l */
    public final List<C25245b> mo41246l() {
        return this.f59778e;
    }

    /* renamed from: b */
    public final void mo4356b(int i) {
        if (this.f59774a != i) {
            mo4729r();
            this.f59774a = i;
            this.f59780g = null;
            this.f59781h = null;
            m48416H();
            mo4726o();
        }
    }

    @Override // com.google.android.flexbox.AbstractC25244a
    /* renamed from: a */
    public final int mo41235a(View view) {
        int s;
        int t;
        if (mo41243i()) {
            s = m4437u(view);
            t = m4438v(view);
        } else {
            s = m4435s(view);
            t = m4436t(view);
        }
        return s + t;
    }

    @Override // com.google.android.flexbox.AbstractC25244a
    /* renamed from: a */
    public final void mo41237a(View view, C25245b bVar) {
        mo4703b(view, f59766k);
        if (mo41243i()) {
            int u = m4437u(view) + m4438v(view);
            bVar.f59827e += u;
            bVar.f59828f += u;
            return;
        }
        int s = m4435s(view) + m4436t(view);
        bVar.f59827e += s;
        bVar.f59828f += s;
    }

    @Override // com.google.android.flexbox.AbstractC25244a
    /* renamed from: a */
    public final View mo4318a(int i) {
        return m48439f(i);
    }

    @Override // com.google.android.flexbox.AbstractC25244a
    /* renamed from: a */
    public final int mo4347a(int i, int i2) {
        return m4414a(this.f4485J, this.f4483H, i, i2, mo4366f());
    }

    @Override // com.google.android.flexbox.AbstractC25244a
    /* renamed from: a */
    public final void mo41236a(int i, View view) {
        this.f59769N.put(i, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final RecyclerView.C1367j mo4334b() {
        return new LayoutParams();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final RecyclerView.C1367j mo4316a(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final boolean mo4330a(RecyclerView.C1367j jVar) {
        return jVar instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4350a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f59790s = (SavedState) parcelable;
            mo4726o();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4326a(RecyclerView recyclerView, int i, int i2) {
        super.mo4326a(recyclerView, i, i2);
        m48443k(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4328a(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.mo4328a(recyclerView, i, i2, obj);
        m48443k(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final void mo4335b(RecyclerView recyclerView, int i, int i2) {
        super.mo4335b(recyclerView, i, i2);
        m48443k(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4327a(RecyclerView recyclerView, int i, int i2, int i3) {
        super.mo4327a(recyclerView, i, i2, i3);
        m48443k(Math.min(i, i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02a0  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4337c(androidx.recyclerview.widget.RecyclerView.C1372o r24, androidx.recyclerview.widget.RecyclerView.C1378s r25) {
        /*
        // Method dump skipped, instructions count: 1206
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.mo4337c(androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4324a(RecyclerView.C1378s sVar) {
        super.mo4324a(sVar);
        this.f59790s = null;
        this.f59791t = -1;
        this.f59792u = Integer.MIN_VALUE;
        this.f59772Q = -1;
        this.f59789r.mo41259a();
        this.f59769N.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
        C1481r rVar = new C1481r(recyclerView.getContext());
        rVar.f4515g = i;
        mo4695a(rVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4353a(RecyclerView recyclerView, RecyclerView.C1372o oVar) {
        super.mo4353a(recyclerView, oVar);
        if (this.f59782i) {
            mo4711c(oVar);
            oVar.mo4756a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final int mo4312a(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        if (!mo41243i() || (this.f59775b == 0 && mo41243i())) {
            int c = m48432c(i, oVar, sVar);
            this.f59769N.clear();
            return c;
        }
        int n = m48446n(i);
        this.f59789r.f59808d += n;
        this.f59781h.mo5022a(-n);
        return n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final int mo4331b(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        if (mo41243i() || (this.f59775b == 0 && !mo41243i())) {
            int c = m48432c(i, oVar, sVar);
            this.f59769N.clear();
            return c;
        }
        int n = m48446n(i);
        this.f59789r.f59808d += n;
        this.f59781h.mo5022a(-n);
        return n;
    }

    @Override // com.google.android.flexbox.AbstractC25244a
    /* renamed from: a */
    public final int mo41234a() {
        return this.f59787p.mo4782a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$a */
    public class C25242a {

        /* renamed from: h */
        static final /* synthetic */ boolean f59804h = true;

        /* renamed from: a */
        public int f59805a;

        /* renamed from: b */
        public int f59806b;

        /* renamed from: c */
        public int f59807c;

        /* renamed from: d */
        public int f59808d;

        /* renamed from: e */
        public boolean f59809e;

        /* renamed from: f */
        public boolean f59810f;

        /* renamed from: g */
        public boolean f59811g;

        static {
            Covode.recordClassIndex(30614);
        }

        /* renamed from: a */
        public final void mo41259a() {
            this.f59805a = -1;
            this.f59806b = -1;
            this.f59807c = Integer.MIN_VALUE;
            boolean z = false;
            this.f59810f = false;
            this.f59811g = false;
            if (FlexboxLayoutManager.this.mo41243i()) {
                if (FlexboxLayoutManager.this.f59775b == 0) {
                    if (FlexboxLayoutManager.this.f59774a == 1) {
                        z = true;
                    }
                    this.f59809e = z;
                    return;
                }
                if (FlexboxLayoutManager.this.f59775b == 2) {
                    z = true;
                }
                this.f59809e = z;
            } else if (FlexboxLayoutManager.this.f59775b == 0) {
                if (FlexboxLayoutManager.this.f59774a == 3) {
                    z = true;
                }
                this.f59809e = z;
            } else {
                if (FlexboxLayoutManager.this.f59775b == 2) {
                    z = true;
                }
                this.f59809e = z;
            }
        }

        /* renamed from: b */
        public final void mo41260b() {
            int b;
            int b2;
            if (FlexboxLayoutManager.this.mo41243i() || !FlexboxLayoutManager.this.f59777d) {
                if (this.f59809e) {
                    b = FlexboxLayoutManager.this.f59780g.mo5025c();
                } else {
                    b = FlexboxLayoutManager.this.f59780g.mo5023b();
                }
                this.f59807c = b;
                return;
            }
            if (this.f59809e) {
                b2 = FlexboxLayoutManager.this.f59780g.mo5025c();
            } else {
                b2 = FlexboxLayoutManager.this.f4485J - FlexboxLayoutManager.this.f59780g.mo5023b();
            }
            this.f59807c = b2;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f59805a + ", mFlexLinePosition=" + this.f59806b + ", mCoordinate=" + this.f59807c + ", mPerpendicularCoordinate=" + this.f59808d + ", mLayoutFromEnd=" + this.f59809e + ", mValid=" + this.f59810f + ", mAssignedFromSavedState=" + this.f59811g + '}';
        }

        private C25242a() {
        }

        /* synthetic */ C25242a(FlexboxLayoutManager flexboxLayoutManager, byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$b */
    public static class C25243b {

        /* renamed from: a */
        public int f59813a;

        /* renamed from: b */
        public boolean f59814b;

        /* renamed from: c */
        public int f59815c;

        /* renamed from: d */
        public int f59816d;

        /* renamed from: e */
        public int f59817e;

        /* renamed from: f */
        public int f59818f;

        /* renamed from: g */
        public int f59819g;

        /* renamed from: h */
        public int f59820h;

        /* renamed from: i */
        public int f59821i;

        /* renamed from: j */
        public boolean f59822j;

        static {
            Covode.recordClassIndex(30615);
        }

        private C25243b() {
            this.f59820h = 1;
            this.f59821i = 1;
        }

        public final String toString() {
            return "LayoutState{mAvailable=" + this.f59813a + ", mFlexLinePosition=" + this.f59815c + ", mPosition=" + this.f59816d + ", mOffset=" + this.f59817e + ", mScrollingOffset=" + this.f59818f + ", mLastScrollDelta=" + this.f59819g + ", mItemDirection=" + this.f59820h + ", mLayoutDirection=" + this.f59821i + '}';
        }

        /* synthetic */ C25243b(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(30609);
    }

    /* renamed from: G */
    private void m48415G() {
        if (this.f59788q == null) {
            this.f59788q = new C25243b((byte) 0);
        }
    }

    /* renamed from: H */
    private void m48416H() {
        this.f59778e.clear();
        this.f59789r.mo41259a();
        this.f59789r.f59808d = 0;
    }

    @Override // com.google.android.flexbox.AbstractC25244a
    /* renamed from: i */
    public final boolean mo41243i() {
        int i = this.f59774a;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    private void m48413E() {
        int i;
        boolean z;
        if (mo41243i()) {
            i = this.f4484I;
        } else {
            i = this.f4483H;
        }
        C25243b bVar = this.f59788q;
        if (i == 0 || i == Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        bVar.f59814b = z;
    }

    /* renamed from: I */
    private int m48417I() {
        View a = m48421a(0, mo4730s(), false);
        if (a == null) {
            return -1;
        }
        return m4426e(a);
    }

    /* renamed from: C */
    public final int mo41232C() {
        View a = m48421a(mo4730s() - 1, -1, false);
        if (a == null) {
            return -1;
        }
        return m4426e(a);
    }

    /* renamed from: D */
    public final int mo41233D() {
        View a = m48421a(mo4730s() - 1, -1, true);
        if (a == null) {
            return -1;
        }
        return m4426e(a);
    }

    /* renamed from: m */
    public final void mo41247m() {
        int i = this.f59775b;
        if (i != 1) {
            if (i == 0) {
                mo4729r();
                m48416H();
            }
            this.f59775b = 1;
            this.f59780g = null;
            this.f59781h = null;
            mo4726o();
        }
    }

    /* renamed from: n */
    public final void mo41248n() {
        if (this.f59783l != 4) {
            mo4729r();
            m48416H();
            this.f59783l = 4;
            mo4726o();
        }
    }

    /* renamed from: F */
    private void m48414F() {
        if (this.f59780g == null) {
            if (mo41243i()) {
                if (this.f59775b != 0) {
                    this.f59780g = AbstractC1491x.m5056b(this);
                    this.f59781h = AbstractC1491x.m5054a(this);
                    return;
                }
            } else if (this.f59775b == 0) {
                this.f59780g = AbstractC1491x.m5056b(this);
                this.f59781h = AbstractC1491x.m5054a(this);
                return;
            }
            this.f59780g = AbstractC1491x.m5054a(this);
            this.f59781h = AbstractC1491x.m5056b(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: e */
    public final Parcelable mo4362e() {
        if (this.f59790s != null) {
            return new SavedState(this.f59790s, (byte) 0);
        }
        SavedState savedState = new SavedState();
        if (mo4730s() > 0) {
            View g = mo4717g(0);
            savedState.f59802a = m4426e(g);
            savedState.f59803b = this.f59780g.mo5021a(g) - this.f59780g.mo5023b();
        } else {
            savedState.f59802a = -1;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: f */
    public final boolean mo4366f() {
        int i;
        if (this.f59775b == 0) {
            return mo41243i();
        }
        if (!mo41243i()) {
            return true;
        }
        int i2 = this.f4485J;
        View view = this.f59771P;
        if (view != null) {
            i = view.getWidth();
        } else {
            i = 0;
        }
        if (i2 > i) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: g */
    public final boolean mo4368g() {
        int i;
        if (this.f59775b != 0) {
            if (!mo41243i()) {
                int i2 = this.f4486K;
                View view = this.f59771P;
                if (view != null) {
                    i = view.getHeight();
                } else {
                    i = 0;
                }
                if (i2 > i) {
                    return true;
                }
                return false;
            }
            return true;
        } else if (!mo41243i()) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.google.android.flexbox.AbstractC25244a
    /* renamed from: j */
    public final int mo41244j() {
        if (this.f59778e.size() == 0) {
            return 0;
        }
        int i = Integer.MIN_VALUE;
        int size = this.f59778e.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.f59778e.get(i2).f59827e);
        }
        return i;
    }

    public FlexboxLayoutManager(Context context) {
        this(context, (byte) 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final int mo4333b(RecyclerView.C1378s sVar) {
        return m48442j(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public final int mo4336c(RecyclerView.C1378s sVar) {
        return m48442j(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: d */
    public final int mo4338d(RecyclerView.C1378s sVar) {
        return m48441i(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: e */
    public final int mo4339e(RecyclerView.C1378s sVar) {
        return m48441i(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: f */
    public final int mo4365f(RecyclerView.C1378s sVar) {
        return m48440h(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: g */
    public final int mo4367g(RecyclerView.C1378s sVar) {
        return m48440h(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public final void mo4712c(RecyclerView recyclerView) {
        super.mo4712c(recyclerView);
        this.f59771P = (View) recyclerView.getParent();
    }

    /* renamed from: f */
    private View m48439f(int i) {
        View view = this.f59769N.get(i);
        if (view != null) {
            return view;
        }
        return this.f59786o.mo4766c(i);
    }

    @Override // com.google.android.flexbox.AbstractC25244a
    /* renamed from: b */
    public final int mo41239b(View view) {
        int u;
        int v;
        if (mo41243i()) {
            u = m4435s(view);
            v = m4436t(view);
        } else {
            u = m4437u(view);
            v = m4438v(view);
        }
        return u + v;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: e */
    public final void mo4363e(int i) {
        this.f59791t = i;
        this.f59792u = Integer.MIN_VALUE;
        SavedState savedState = this.f59790s;
        if (savedState != null) {
            savedState.f59802a = -1;
        }
        mo4726o();
    }

    /* renamed from: h */
    private int m48440h(RecyclerView.C1378s sVar) {
        if (mo4730s() == 0) {
            return 0;
        }
        int a = sVar.mo4782a();
        m48414F();
        View l = m48444l(a);
        View m = m48445m(a);
        if (sVar.mo4782a() == 0 || l == null || m == null) {
            return 0;
        }
        return Math.min(this.f59780g.mo5029e(), this.f59780g.mo5024b(m) - this.f59780g.mo5021a(l));
    }

    /* renamed from: l */
    private View m48444l(int i) {
        int i2;
        if (f59765j || this.f59779f.f59842a != null) {
            View b = m48427b(0, mo4730s(), i);
            if (b == null || (i2 = this.f59779f.f59842a[m4426e(b)]) == -1) {
                return null;
            }
            return m48428b(b, this.f59778e.get(i2));
        }
        throw new AssertionError();
    }

    /* renamed from: m */
    private View m48445m(int i) {
        if (f59765j || this.f59779f.f59842a != null) {
            View b = m48427b(mo4730s() - 1, -1, i);
            if (b == null) {
                return null;
            }
            return m48433c(b, this.f59778e.get(this.f59779f.f59842a[m4426e(b)]));
        }
        throw new AssertionError();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r.AbstractC1377b
    /* renamed from: d */
    public final PointF mo4360d(int i) {
        int i2;
        if (mo4730s() == 0) {
            return null;
        }
        if (i < m4426e(mo4717g(0))) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        if (mo41243i()) {
            return new PointF(0.0f, (float) i2);
        }
        return new PointF((float) i2, 0.0f);
    }

    /* renamed from: i */
    private int m48441i(RecyclerView.C1378s sVar) {
        if (mo4730s() == 0) {
            return 0;
        }
        int a = sVar.mo4782a();
        View l = m48444l(a);
        View m = m48445m(a);
        if (!(sVar.mo4782a() == 0 || l == null || m == null)) {
            if (f59765j || this.f59779f.f59842a != null) {
                int e = m4426e(l);
                int e2 = m4426e(m);
                int abs = Math.abs(this.f59780g.mo5024b(m) - this.f59780g.mo5021a(l));
                int i = this.f59779f.f59842a[e];
                if (!(i == 0 || i == -1)) {
                    return Math.round((((float) i) * (((float) abs) / ((float) ((this.f59779f.f59842a[e2] - i) + 1)))) + ((float) (this.f59780g.mo5023b() - this.f59780g.mo5021a(l))));
                }
            } else {
                throw new AssertionError();
            }
        }
        return 0;
    }

    /* renamed from: j */
    private int m48442j(RecyclerView.C1378s sVar) {
        if (mo4730s() == 0) {
            return 0;
        }
        int a = sVar.mo4782a();
        View l = m48444l(a);
        View m = m48445m(a);
        if (sVar.mo4782a() == 0 || l == null || m == null) {
            return 0;
        }
        if (f59765j || this.f59779f.f59842a != null) {
            int I = m48417I();
            return (int) ((((float) Math.abs(this.f59780g.mo5024b(m) - this.f59780g.mo5021a(l))) / ((float) ((mo41232C() - I) + 1))) * ((float) sVar.mo4782a()));
        }
        throw new AssertionError();
    }

    /* renamed from: k */
    private void m48443k(int i) {
        if (i < mo41232C()) {
            int s = mo4730s();
            this.f59779f.mo41281c(s);
            this.f59779f.mo41279b(s);
            this.f59779f.mo41283d(s);
            if (!f59765j && this.f59779f.f59842a == null) {
                throw new AssertionError();
            } else if (i < this.f59779f.f59842a.length) {
                this.f59772Q = i;
                View g = mo4717g(0);
                if (g != null) {
                    this.f59791t = m4426e(g);
                    if (mo41243i() || !this.f59777d) {
                        this.f59792u = this.f59780g.mo5021a(g) - this.f59780g.mo5023b();
                    } else {
                        this.f59792u = this.f59780g.mo5024b(g) + this.f59780g.mo5031f();
                    }
                }
            }
        }
    }

    /* renamed from: n */
    private int m48446n(int i) {
        int height;
        int i2;
        int i3;
        if (mo4730s() == 0 || i == 0) {
            return 0;
        }
        m48414F();
        boolean i4 = mo41243i();
        View view = this.f59771P;
        if (i4) {
            height = view.getWidth();
            i2 = this.f4485J;
        } else {
            height = view.getHeight();
            i2 = this.f4486K;
        }
        if (C0792v.m2768e(this.f4490w) == 1) {
            int abs = Math.abs(i);
            if (i < 0) {
                i3 = Math.min((i2 + this.f59789r.f59808d) - height, abs);
            } else if (this.f59789r.f59808d + i <= 0) {
                return i;
            } else {
                i3 = this.f59789r.f59808d;
            }
        } else if (i > 0) {
            return Math.min((i2 - this.f59789r.f59808d) - height, i);
        } else {
            if (this.f59789r.f59808d + i >= 0) {
                return i;
            }
            i3 = this.f59789r.f59808d;
        }
        return -i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4692a(RecyclerView.AbstractC1350a aVar, RecyclerView.AbstractC1350a aVar2) {
        mo4729r();
    }

    @Override // com.google.android.flexbox.AbstractC25244a
    /* renamed from: b */
    public final int mo41238b(int i, int i2) {
        return m4414a(this.f4486K, this.f4484I, i, i2, mo4368g());
    }

    private FlexboxLayoutManager(Context context, byte b) {
        this.f59784m = -1;
        this.f59778e = new ArrayList();
        this.f59779f = new C25246c(this);
        this.f59789r = new C25242a(this, (byte) 0);
        this.f59791t = -1;
        this.f59792u = Integer.MIN_VALUE;
        this.f59767L = Integer.MIN_VALUE;
        this.f59768M = Integer.MIN_VALUE;
        this.f59769N = new SparseArray<>();
        this.f59772Q = -1;
        this.f59773R = new C25246c.C25247a();
        mo4356b(0);
        mo41247m();
        mo41248n();
        this.f4478C = true;
        this.f59770O = context;
    }

    /* renamed from: a */
    private void m48423a(RecyclerView.C1372o oVar, C25243b bVar) {
        if (bVar.f59822j) {
            if (bVar.f59821i == -1) {
                m48434c(oVar, bVar);
            } else {
                m48429b(oVar, bVar);
            }
        }
    }

    /* renamed from: b */
    private View m48428b(View view, C25245b bVar) {
        boolean i = mo41243i();
        int i2 = bVar.f59830h;
        for (int i3 = 1; i3 < i2; i3++) {
            View g = mo4717g(i3);
            if (!(g == null || g.getVisibility() == 8)) {
                if (!this.f59777d || i) {
                    if (this.f59780g.mo5021a(view) <= this.f59780g.mo5021a(g)) {
                    }
                } else if (this.f59780g.mo5024b(view) >= this.f59780g.mo5024b(g)) {
                }
                view = g;
            }
        }
        return view;
    }

    /* renamed from: c */
    private View m48433c(View view, C25245b bVar) {
        boolean i = mo41243i();
        int s = (mo4730s() - bVar.f59830h) - 1;
        for (int s2 = mo4730s() - 2; s2 > s; s2--) {
            View g = mo4717g(s2);
            if (!(g == null || g.getVisibility() == 8)) {
                if (!this.f59777d || i) {
                    if (this.f59780g.mo5024b(view) >= this.f59780g.mo5024b(g)) {
                    }
                } else if (this.f59780g.mo5021a(view) <= this.f59780g.mo5021a(g)) {
                }
                view = g;
            }
        }
        return view;
    }

    /* renamed from: a */
    private boolean m48425a(View view, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int t = mo4731t();
        int u = mo4732u();
        int v = this.f4485J - mo4733v();
        int w = this.f4486K - mo4734w();
        int o = m4431o(view) - ((RecyclerView.C1367j) view.getLayoutParams()).leftMargin;
        int p = m4432p(view) - ((RecyclerView.C1367j) view.getLayoutParams()).topMargin;
        int q = m4433q(view) + ((RecyclerView.C1367j) view.getLayoutParams()).rightMargin;
        int r = m4434r(view) + ((RecyclerView.C1367j) view.getLayoutParams()).bottomMargin;
        if (t > o || v < q) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (o >= v || q >= t) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (u > p || w < r) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (p >= w || r >= u) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z) {
            if (!z2 || !z4) {
                return false;
            }
            return true;
        } else if (!z3 || !z5) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    private void m48429b(RecyclerView.C1372o oVar, C25243b bVar) {
        if (bVar.f59818f >= 0) {
            if (f59765j || this.f59779f.f59842a != null) {
                int s = mo4730s();
                if (s != 0) {
                    int i = this.f59779f.f59842a[m4426e(mo4717g(0))];
                    int i2 = -1;
                    if (i != -1) {
                        C25245b bVar2 = this.f59778e.get(i);
                        int i3 = 0;
                        while (true) {
                            if (i3 >= s) {
                                break;
                            }
                            View g = mo4717g(i3);
                            if (!m48431b(g, bVar.f59818f)) {
                                break;
                            }
                            if (bVar2.f59838p == m4426e(g)) {
                                if (i >= this.f59778e.size() - 1) {
                                    i2 = i3;
                                    break;
                                }
                                i += bVar.f59821i;
                                bVar2 = this.f59778e.get(i);
                                i2 = i3;
                            }
                            i3++;
                        }
                        m48422a(oVar, 0, i2);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: c */
    private void m48434c(RecyclerView.C1372o oVar, C25243b bVar) {
        if (bVar.f59818f >= 0) {
            if (f59765j || this.f59779f.f59842a != null) {
                this.f59780g.mo5027d();
                int s = mo4730s();
                if (s != 0) {
                    int i = s - 1;
                    int i2 = this.f59779f.f59842a[m4426e(mo4717g(i))];
                    if (i2 != -1) {
                        C25245b bVar2 = this.f59778e.get(i2);
                        int i3 = i;
                        while (true) {
                            if (i3 < 0) {
                                break;
                            }
                            View g = mo4717g(i3);
                            if (!m48436c(g, bVar.f59818f)) {
                                break;
                            }
                            if (bVar2.f59837o == m4426e(g)) {
                                if (i2 <= 0) {
                                    s = i3;
                                    break;
                                }
                                i2 += bVar.f59821i;
                                bVar2 = this.f59778e.get(i2);
                                s = i3;
                            }
                            i3--;
                        }
                        m48422a(oVar, s, i);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new AssertionError();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01b4  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m48438e(int r20, int r21) {
        /*
        // Method dump skipped, instructions count: 475
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m48438e(int, int):void");
    }

    /* renamed from: c */
    private boolean m48436c(View view, int i) {
        if (mo41243i() || !this.f59777d) {
            if (this.f59780g.mo5021a(view) >= this.f59780g.mo5027d() - i) {
                return true;
            }
            return false;
        } else if (this.f59780g.mo5024b(view) <= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private int m48420a(C25245b bVar, C25243b bVar2) {
        float f;
        float f2;
        float f3;
        View view;
        float f4;
        if (f59765j || this.f59779f.f59843b != null) {
            int u = mo4732u();
            int w = mo4734w();
            int i = this.f4486K;
            int i2 = bVar2.f59817e;
            int i3 = bVar2.f59817e;
            if (bVar2.f59821i == -1) {
                i2 -= bVar.f59829g;
                i3 += bVar.f59829g;
            }
            int i4 = bVar2.f59816d;
            int i5 = this.f59776c;
            if (i5 == 0) {
                f2 = (float) u;
                f = (float) (i - w);
                f3 = 0.0f;
            } else if (i5 == 1) {
                f2 = (float) ((i - bVar.f59827e) + w);
                f = (float) (bVar.f59827e - u);
                f3 = 0.0f;
            } else if (i5 == 2) {
                f2 = ((float) u) + (((float) (i - bVar.f59827e)) / 2.0f);
                f = ((float) (i - w)) - (((float) (i - bVar.f59827e)) / 2.0f);
                f3 = 0.0f;
            } else if (i5 == 3) {
                f2 = (float) u;
                if (bVar.f59830h != 1) {
                    f4 = (float) (bVar.f59830h - 1);
                } else {
                    f4 = 1.0f;
                }
                f3 = ((float) (i - bVar.f59827e)) / f4;
                f = (float) (i - w);
            } else if (i5 == 4) {
                if (bVar.f59830h != 0) {
                    f3 = ((float) (i - bVar.f59827e)) / ((float) bVar.f59830h);
                } else {
                    f3 = 0.0f;
                }
                float f5 = (float) u;
                float f6 = f3 / 2.0f;
                f2 = f5 + f6;
                f = ((float) (i - w)) - f6;
            } else if (i5 == 5) {
                if (bVar.f59830h != 0) {
                    f3 = ((float) (i - bVar.f59827e)) / ((float) (bVar.f59830h + 1));
                } else {
                    f3 = 0.0f;
                }
                f2 = ((float) u) + f3;
                f = ((float) (i - w)) - f3;
            } else {
                throw new IllegalStateException("Invalid justifyContent is set: " + this.f59776c);
            }
            float f7 = f2 - ((float) this.f59789r.f59808d);
            float f8 = f - ((float) this.f59789r.f59808d);
            float max = Math.max(f3, 0.0f);
            int i6 = 0;
            int i7 = bVar.f59830h;
            for (int i8 = i4; i8 < i4 + i7; i8++) {
                View f9 = m48439f(i8);
                if (f9 != null) {
                    long j = this.f59779f.f59843b[i8];
                    int i9 = (int) j;
                    int i10 = (int) (j >> 32);
                    LayoutParams layoutParams = (LayoutParams) f9.getLayoutParams();
                    if (m48437c(f9, i9, i10, layoutParams)) {
                        f9.measure(i9, i10);
                    }
                    float s = f7 + ((float) (layoutParams.topMargin + m4435s(f9)));
                    float t = f8 - ((float) (layoutParams.rightMargin + m4436t(f9)));
                    if (bVar2.f59821i == 1) {
                        mo4703b(f9, f59766k);
                        mo4710c(f9);
                    } else {
                        mo4703b(f9, f59766k);
                        mo4688a(f9, i6);
                        i6++;
                    }
                    int u2 = i2 + m4437u(f9);
                    int v = i3 - m4438v(f9);
                    boolean z = this.f59777d;
                    if (!z) {
                        view = f9;
                        if (this.f59785n) {
                            this.f59779f.mo41275a(view, bVar, z, u2, Math.round(t) - view.getMeasuredHeight(), u2 + view.getMeasuredWidth(), Math.round(t));
                        } else {
                            this.f59779f.mo41275a(view, bVar, z, u2, Math.round(s), u2 + view.getMeasuredWidth(), Math.round(s) + view.getMeasuredHeight());
                        }
                    } else if (this.f59785n) {
                        view = f9;
                        this.f59779f.mo41275a(f9, bVar, z, v - f9.getMeasuredWidth(), Math.round(t) - f9.getMeasuredHeight(), v, Math.round(t));
                    } else {
                        view = f9;
                        this.f59779f.mo41275a(view, bVar, z, v - view.getMeasuredWidth(), Math.round(s), v, Math.round(s) + view.getMeasuredHeight());
                    }
                    f7 = s + ((float) (view.getMeasuredHeight() + layoutParams.topMargin + m4436t(view))) + max;
                    f8 = t - (((float) ((view.getMeasuredHeight() + layoutParams.bottomMargin) + m4435s(view))) + max);
                }
            }
            bVar2.f59815c += this.f59788q.f59821i;
            return bVar.f59829g;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    private boolean m48431b(View view, int i) {
        if (mo41243i() || !this.f59777d) {
            if (this.f59780g.mo5024b(view) <= i) {
                return true;
            }
            return false;
        } else if (this.f59780g.mo5027d() - this.f59780g.mo5021a(view) <= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private void m48422a(RecyclerView.C1372o oVar, int i, int i2) {
        while (i2 >= i) {
            mo4687a(i2, oVar);
            i2--;
        }
    }

    /* renamed from: a */
    private View m48421a(int i, int i2, boolean z) {
        int i3;
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View g = mo4717g(i);
            if (m48425a(g, z)) {
                return g;
            }
            i += i3;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public final void mo4713c(RecyclerView recyclerView, int i, int i2) {
        super.mo4713c(recyclerView, i, i2);
        m48443k(i);
    }

    /* renamed from: c */
    private static boolean m48435c(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode == 1073741824 && size == i) {
                return true;
            }
            return false;
        } else if (size >= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    private View m48427b(int i, int i2, int i3) {
        int i4;
        m48414F();
        m48415G();
        int b = this.f59780g.mo5023b();
        int c = this.f59780g.mo5025c();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View g = mo4717g(i);
            int e = m4426e(g);
            if (e >= 0 && e < i3) {
                if (((RecyclerView.C1367j) g.getLayoutParams()).f4500c.isRemoved()) {
                    if (view2 == null) {
                        view2 = g;
                    }
                } else if (this.f59780g.mo5021a(g) >= b && this.f59780g.mo5024b(g) <= c) {
                    return g;
                } else {
                    if (view == null) {
                        view = g;
                    }
                }
            }
            i += i4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r7 > 0) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r7 < 0) goto L_0x001f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m48432c(int r7, androidx.recyclerview.widget.RecyclerView.C1372o r8, androidx.recyclerview.widget.RecyclerView.C1378s r9) {
        /*
            r6 = this;
            int r0 = r6.mo4730s()
            r5 = 0
            if (r0 == 0) goto L_0x0009
            if (r7 != 0) goto L_0x000a
        L_0x0009:
            return r5
        L_0x000a:
            r6.m48414F()
            com.google.android.flexbox.FlexboxLayoutManager$b r0 = r6.f59788q
            r4 = 1
            r0.f59822j = r4
            boolean r0 = r6.mo41243i()
            if (r0 != 0) goto L_0x0034
            boolean r0 = r6.f59777d
            if (r0 == 0) goto L_0x0034
            r3 = 1
            if (r7 >= 0) goto L_0x0038
        L_0x001f:
            int r2 = java.lang.Math.abs(r7)
            r6.m48438e(r4, r2)
            com.google.android.flexbox.FlexboxLayoutManager$b r0 = r6.f59788q
            int r1 = r0.f59818f
            com.google.android.flexbox.FlexboxLayoutManager$b r0 = r6.f59788q
            int r0 = r6.m48419a(r8, r9, r0)
            int r1 = r1 + r0
            if (r1 >= 0) goto L_0x003a
            return r5
        L_0x0034:
            r3 = 0
            if (r7 <= 0) goto L_0x0038
            goto L_0x001f
        L_0x0038:
            r4 = -1
            goto L_0x001f
        L_0x003a:
            if (r3 == 0) goto L_0x004b
            if (r2 <= r1) goto L_0x0040
            int r7 = -r4
            int r7 = r7 * r1
        L_0x0040:
            androidx.recyclerview.widget.x r1 = r6.f59780g
            int r0 = -r7
            r1.mo5022a(r0)
            com.google.android.flexbox.FlexboxLayoutManager$b r0 = r6.f59788q
            r0.f59819g = r7
            return r7
        L_0x004b:
            if (r2 <= r1) goto L_0x0040
            int r7 = r4 * r1
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m48432c(int, androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s):int");
    }

    /* renamed from: a */
    private void m48424a(C25242a aVar, boolean z, boolean z2) {
        if (z2) {
            m48413E();
        } else {
            this.f59788q.f59814b = false;
        }
        if (mo41243i() || !this.f59777d) {
            this.f59788q.f59813a = this.f59780g.mo5025c() - aVar.f59807c;
        } else {
            this.f59788q.f59813a = aVar.f59807c - mo4733v();
        }
        this.f59788q.f59816d = aVar.f59805a;
        this.f59788q.f59820h = 1;
        this.f59788q.f59821i = 1;
        this.f59788q.f59817e = aVar.f59807c;
        this.f59788q.f59818f = Integer.MIN_VALUE;
        this.f59788q.f59815c = aVar.f59806b;
        if (z && this.f59778e.size() > 1 && aVar.f59806b >= 0 && aVar.f59806b < this.f59778e.size() - 1) {
            this.f59788q.f59815c++;
            this.f59788q.f59816d += this.f59778e.get(aVar.f59806b).f59830h;
        }
    }

    /* renamed from: a */
    private int m48419a(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar, C25243b bVar) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        if (bVar.f59818f != Integer.MIN_VALUE) {
            if (bVar.f59813a < 0) {
                bVar.f59818f += bVar.f59813a;
            }
            m48423a(oVar, bVar);
        }
        int i2 = bVar.f59813a;
        int i3 = bVar.f59813a;
        boolean i4 = mo41243i();
        int i5 = 0;
        while (true) {
            if (i3 <= 0 && !this.f59788q.f59814b) {
                break;
            }
            List<C25245b> list = this.f59778e;
            if (bVar.f59816d < 0 || bVar.f59816d >= sVar.mo4782a() || bVar.f59815c < 0 || bVar.f59815c >= list.size()) {
                break;
            }
            C25245b bVar2 = this.f59778e.get(bVar.f59815c);
            bVar.f59816d = bVar2.f59837o;
            if (!mo41243i()) {
                i = m48420a(bVar2, bVar);
            } else if (f59765j || this.f59779f.f59843b != null) {
                int t = mo4731t();
                int v = mo4733v();
                int i6 = this.f4485J;
                int i7 = bVar.f59817e;
                if (bVar.f59821i == -1) {
                    i7 -= bVar2.f59829g;
                }
                int i8 = bVar.f59816d;
                int i9 = this.f59776c;
                if (i9 != 0) {
                    if (i9 == 1) {
                        f2 = (float) ((i6 - bVar2.f59827e) + v);
                        f = (float) (bVar2.f59827e - t);
                    } else if (i9 == 2) {
                        f2 = (((float) (i6 - bVar2.f59827e)) / 2.0f) + ((float) t);
                        f = ((float) (i6 - v)) - (((float) (i6 - bVar2.f59827e)) / 2.0f);
                    } else if (i9 == 3) {
                        f2 = (float) t;
                        if (bVar2.f59830h != 1) {
                            f4 = (float) (bVar2.f59830h - 1);
                        } else {
                            f4 = 1.0f;
                        }
                        f3 = ((float) (i6 - bVar2.f59827e)) / f4;
                        f = (float) (i6 - v);
                    } else if (i9 == 4) {
                        if (bVar2.f59830h != 0) {
                            f3 = ((float) (i6 - bVar2.f59827e)) / ((float) bVar2.f59830h);
                        } else {
                            f3 = 0.0f;
                        }
                        float f5 = f3 / 2.0f;
                        f2 = ((float) t) + f5;
                        f = ((float) (i6 - v)) - f5;
                    } else if (i9 == 5) {
                        if (bVar2.f59830h != 0) {
                            f3 = ((float) (i6 - bVar2.f59827e)) / ((float) (bVar2.f59830h + 1));
                        } else {
                            f3 = 0.0f;
                        }
                        f2 = ((float) t) + f3;
                        f = ((float) (i6 - v)) - f3;
                    } else {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.f59776c);
                    }
                    f3 = 0.0f;
                } else {
                    f2 = (float) t;
                    f = (float) (i6 - v);
                    f3 = 0.0f;
                }
                float f6 = f2 - ((float) this.f59789r.f59808d);
                float f7 = f - ((float) this.f59789r.f59808d);
                float max = Math.max(f3, 0.0f);
                int i10 = bVar2.f59830h;
                int i11 = 0;
                for (int i12 = i8; i12 < i8 + i10; i12++) {
                    View f8 = m48439f(i12);
                    if (f8 != null) {
                        if (bVar.f59821i == 1) {
                            mo4703b(f8, f59766k);
                            mo4710c(f8);
                        } else {
                            mo4703b(f8, f59766k);
                            mo4688a(f8, i11);
                            i11++;
                        }
                        long j = this.f59779f.f59843b[i12];
                        int i13 = (int) j;
                        int i14 = (int) (j >> 32);
                        LayoutParams layoutParams = (LayoutParams) f8.getLayoutParams();
                        if (m48437c(f8, i13, i14, layoutParams)) {
                            f8.measure(i13, i14);
                        }
                        float u = f6 + ((float) (layoutParams.leftMargin + m4437u(f8)));
                        float v2 = f7 - ((float) (layoutParams.rightMargin + m4438v(f8)));
                        int s = i7 + m4435s(f8);
                        if (this.f59777d) {
                            this.f59779f.mo41274a(f8, bVar2, Math.round(v2) - f8.getMeasuredWidth(), s, Math.round(v2), s + f8.getMeasuredHeight());
                        } else {
                            this.f59779f.mo41274a(f8, bVar2, Math.round(u), s, Math.round(u) + f8.getMeasuredWidth(), s + f8.getMeasuredHeight());
                        }
                        f6 = u + ((float) (f8.getMeasuredWidth() + layoutParams.rightMargin + m4438v(f8))) + max;
                        f7 = v2 - (((float) ((f8.getMeasuredWidth() + layoutParams.leftMargin) + m4437u(f8))) + max);
                    }
                }
                bVar.f59815c += this.f59788q.f59821i;
                i = bVar2.f59829g;
            } else {
                throw new AssertionError();
            }
            i5 += i;
            if (i4 || !this.f59777d) {
                bVar.f59817e += bVar2.f59829g * bVar.f59821i;
            } else {
                bVar.f59817e -= bVar2.f59829g * bVar.f59821i;
            }
            i3 -= bVar2.f59829g;
        }
        bVar.f59813a -= i5;
        if (bVar.f59818f != Integer.MIN_VALUE) {
            bVar.f59818f += i5;
            if (bVar.f59813a < 0) {
                bVar.f59818f += bVar.f59813a;
            }
            m48423a(oVar, bVar);
        }
        return i2 - bVar.f59813a;
    }

    /* renamed from: b */
    private void m48430b(C25242a aVar, boolean z, boolean z2) {
        if (z2) {
            m48413E();
        } else {
            this.f59788q.f59814b = false;
        }
        if (mo41243i() || !this.f59777d) {
            this.f59788q.f59813a = aVar.f59807c - this.f59780g.mo5023b();
        } else {
            this.f59788q.f59813a = (this.f59771P.getWidth() - aVar.f59807c) - this.f59780g.mo5023b();
        }
        this.f59788q.f59816d = aVar.f59805a;
        this.f59788q.f59820h = 1;
        this.f59788q.f59821i = -1;
        this.f59788q.f59817e = aVar.f59807c;
        this.f59788q.f59818f = Integer.MIN_VALUE;
        this.f59788q.f59815c = aVar.f59806b;
        if (z && aVar.f59806b > 0 && this.f59778e.size() > aVar.f59806b) {
            this.f59788q.f59815c--;
            this.f59788q.f59816d -= this.f59778e.get(aVar.f59806b).f59830h;
        }
    }

    /* renamed from: a */
    private int m48418a(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar, boolean z) {
        int i2;
        int b;
        if (mo41243i() || !this.f59777d) {
            int b2 = i - this.f59780g.mo5023b();
            if (b2 <= 0) {
                return 0;
            }
            i2 = -m48432c(b2, oVar, sVar);
        } else {
            int c = this.f59780g.mo5025c() - i;
            if (c <= 0) {
                return 0;
            }
            i2 = m48432c(-c, oVar, sVar);
        }
        int i3 = i + i2;
        if (!z || (b = i3 - this.f59780g.mo5023b()) <= 0) {
            return i2;
        }
        this.f59780g.mo5022a(-b);
        return i2 - b;
    }

    /* renamed from: b */
    private int m48426b(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar, boolean z) {
        int i2;
        int c;
        if (mo41243i() || !this.f59777d) {
            int c2 = this.f59780g.mo5025c() - i;
            if (c2 <= 0) {
                return 0;
            }
            i2 = -m48432c(-c2, oVar, sVar);
        } else {
            int b = i - this.f59780g.mo5023b();
            if (b <= 0) {
                return 0;
            }
            i2 = m48432c(b, oVar, sVar);
        }
        int i3 = i + i2;
        if (!z || (c = this.f59780g.mo5025c() - i3) <= 0) {
            return i2;
        }
        this.f59780g.mo5022a(c);
        return c + i2;
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f59784m = -1;
        this.f59778e = new ArrayList();
        this.f59779f = new C25246c(this);
        this.f59789r = new C25242a(this, (byte) 0);
        this.f59791t = -1;
        this.f59792u = Integer.MIN_VALUE;
        this.f59767L = Integer.MIN_VALUE;
        this.f59768M = Integer.MIN_VALUE;
        this.f59769N = new SparseArray<>();
        this.f59772Q = -1;
        this.f59773R = new C25246c.C25247a();
        RecyclerView.AbstractC1362i.C1366b a = m4415a(context, attributeSet, i, i2);
        int i3 = a.f4496a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (a.f4498c) {
                    mo4356b(3);
                } else {
                    mo4356b(2);
                }
            }
        } else if (a.f4498c) {
            mo4356b(1);
        } else {
            mo4356b(0);
        }
        mo41247m();
        mo41248n();
        this.f4478C = true;
        this.f59770O = context;
    }

    /* renamed from: c */
    private boolean m48437c(View view, int i, int i2, RecyclerView.C1367j jVar) {
        if (view.isLayoutRequested() || !this.f4479D || !m48435c(view.getWidth(), i, jVar.width) || !m48435c(view.getHeight(), i2, jVar.height)) {
            return true;
        }
        return false;
    }
}
