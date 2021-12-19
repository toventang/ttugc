package com.airbnb.epoxy;

import android.graphics.Rect;
import android.view.View;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.epoxy.r */
public class C1955r extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    public int f5827a;

    /* renamed from: b */
    private boolean f5828b;

    /* renamed from: c */
    private boolean f5829c;

    /* renamed from: d */
    private boolean f5830d;

    /* renamed from: e */
    private boolean f5831e;

    /* renamed from: f */
    private boolean f5832f;

    /* renamed from: g */
    private boolean f5833g;

    /* renamed from: h */
    private boolean f5834h;

    /* renamed from: i */
    private boolean f5835i;

    /* renamed from: j */
    private boolean f5836j;

    static {
        Covode.recordClassIndex(2146);
    }

    public C1955r() {
        this((byte) 0);
    }

    private C1955r(byte b) {
        this.f5827a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i;
        int i2;
        int i3;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        rect.setEmpty();
        int d = RecyclerView.m4277d(view);
        if (d != -1) {
            RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
            int itemCount = recyclerView.getAdapter().getItemCount();
            boolean z12 = true;
            int i4 = 0;
            if (d == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f5830d = z;
            int i5 = itemCount - 1;
            if (d == i5) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f5831e = z2;
            this.f5829c = layoutManager.mo4366f();
            this.f5828b = layoutManager.mo4368g();
            boolean z13 = layoutManager instanceof GridLayoutManager;
            this.f5832f = z13;
            if (z13) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                GridLayoutManager.AbstractC1337c cVar = gridLayoutManager.f4321g;
                int a = cVar.mo4342a(d);
                int i6 = gridLayoutManager.f4316b;
                int a2 = cVar.mo4343a(d, i6);
                if (a2 == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.f5833g = z8;
                if (a2 + a == i6) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f5834h = z9;
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    if (i7 > d) {
                        z10 = true;
                        break;
                    }
                    i8 += cVar.mo4342a(i7);
                    if (i8 > i6) {
                        z10 = false;
                        break;
                    }
                    i7++;
                }
                this.f5835i = z10;
                if (!z10) {
                    int i9 = 0;
                    while (true) {
                        if (i5 < d) {
                            z11 = true;
                            break;
                        }
                        i9 += cVar.mo4342a(i5);
                        if (i9 > i6) {
                            break;
                        }
                        i5--;
                    }
                }
                z11 = false;
                this.f5836j = z11;
            }
            boolean z14 = this.f5832f;
            if (!z14 ? !this.f5829c || this.f5830d : (!this.f5829c || this.f5835i) && (!this.f5828b || this.f5833g)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z14 ? !this.f5829c || this.f5831e : (!this.f5829c || this.f5836j) && (!this.f5828b || this.f5834h)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z14 ? !this.f5828b || this.f5830d : (!this.f5829c || this.f5833g) && (!this.f5828b || this.f5835i)) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z14 ? !this.f5828b || this.f5831e : (!this.f5829c || this.f5834h) && (!this.f5828b || this.f5836j)) {
                z6 = false;
            } else {
                z6 = true;
            }
            boolean z15 = this.f5829c;
            if (!(layoutManager instanceof LinearLayoutManager) || !((LinearLayoutManager) layoutManager).f4336l) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (C0792v.m2768e(layoutManager.f4490w) != 1) {
                z12 = false;
            }
            if (z15 && z12) {
                z7 = !z7;
            }
            if (!z7) {
                z4 = z3;
                z3 = z4;
            } else if (!this.f5829c) {
                z5 = z6;
                z6 = z5;
                z4 = z3;
                z3 = z4;
            }
            int i10 = this.f5827a / 2;
            if (z3) {
                i = i10;
            } else {
                i = 0;
            }
            rect.right = i;
            if (z4) {
                i2 = i10;
            } else {
                i2 = 0;
            }
            rect.left = i2;
            if (z5) {
                i3 = i10;
            } else {
                i3 = 0;
            }
            rect.top = i3;
            if (z6) {
                i4 = i10;
            }
            rect.bottom = i4;
        }
    }
}
