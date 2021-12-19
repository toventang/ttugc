package com.p2082ss.android.ugc.aweme.discover.p2797ui.view;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.view.a */
public class C42989a extends RecyclerView.AbstractC1371n {

    /* renamed from: a */
    private int[] f100231a;

    /* renamed from: b */
    private int f100232b;

    static {
        Covode.recordClassIndex(51123);
    }

    /* renamed from: a */
    public void mo73174a(boolean z) {
    }

    /* renamed from: a */
    private static int m85808a(int[] iArr) {
        int i = iArr[0];
        int length = iArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            if (iArr[i2] > i) {
                i = iArr[i2];
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
        int a;
        C89219l.m154721d(recyclerView, "");
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            if (this.f100231a == null) {
                this.f100231a = new int[staggeredGridLayoutManager.f4556a];
            }
            int[] iArr = this.f100231a;
            if (iArr == null) {
                iArr = new int[staggeredGridLayoutManager.f4556a];
            } else if (iArr.length < staggeredGridLayoutManager.f4556a) {
                throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + staggeredGridLayoutManager.f4556a + ", array size:" + iArr.length);
            }
            for (int i3 = 0; i3 < staggeredGridLayoutManager.f4556a; i3++) {
                StaggeredGridLayoutManager.C1386c cVar = staggeredGridLayoutManager.f4557b[i3];
                if (StaggeredGridLayoutManager.this.f4561f) {
                    a = cVar.mo4822a(0, cVar.f4603a.size(), true);
                } else {
                    a = cVar.mo4822a(cVar.f4603a.size() - 1, -1, true);
                }
                iArr[i3] = a;
            }
            int[] iArr2 = this.f100231a;
            if (iArr2 == null) {
                C89219l.m154715b();
            }
            this.f100232b = m85808a(iArr2);
        } else if (layoutManager instanceof GridLayoutManager) {
            this.f100232b = ((LinearLayoutManager) layoutManager).mo4374n();
        } else if (layoutManager instanceof LinearLayoutManager) {
            this.f100232b = ((LinearLayoutManager) layoutManager).mo4374n();
        }
        C89219l.m154721d(recyclerView, "");
        RecyclerView.AbstractC1362i layoutManager2 = recyclerView.getLayoutManager();
        if (layoutManager2 == null) {
            C89219l.m154715b();
        }
        int s = layoutManager2.mo4730s();
        int A = layoutManager2.mo4685A();
        if (s <= 0 || this.f100232b < A - 1) {
            mo73174a(false);
        } else {
            mo73174a(true);
        }
    }
}
