package com.p2082ss.android.ugc.aweme.kids.discovery.p3348a;

import android.content.Context;
import android.content.res.Resources;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.kids.discovery.a.f */
public final class C57550f extends RecyclerView.AbstractC1371n {

    /* renamed from: a */
    AbstractC57551a f131378a;

    /* renamed from: b */
    public boolean f131379b = true;

    /* renamed from: c */
    private int f131380c = 3;

    /* renamed from: d */
    private int f131381d;

    /* renamed from: e */
    private int f131382e;

    /* renamed from: f */
    private int f131383f = -1;

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.a.f$a */
    public interface AbstractC57551a {
        static {
            Covode.recordClassIndex(67501);
        }

        /* renamed from: a */
        void mo94897a();
    }

    static {
        Covode.recordClassIndex(67500);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4753a(RecyclerView recyclerView, int i) {
        C89219l.m154721d(recyclerView, "");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
        int i3;
        C89219l.m154721d(recyclerView, "");
        if (this.f131379b && i2 >= 0 && i >= 0) {
            if (this.f131382e == 0) {
                Context context = recyclerView.getContext();
                C89219l.m154716b(context, "");
                Resources resources = context.getResources();
                C89219l.m154716b(resources, "");
                this.f131382e = (int) (resources.getDisplayMetrics().density * 40.0f);
            }
            int i4 = this.f131381d + i2;
            this.f131381d = i4;
            if (i4 > this.f131382e) {
                RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    C89219l.m154716b(layoutManager, "");
                    int i5 = Integer.MAX_VALUE;
                    int A = layoutManager.mo4685A() - 1;
                    if (layoutManager instanceof GridLayoutManager) {
                        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                        int i6 = this.f131380c * gridLayoutManager.f4316b;
                        int i7 = A - 1;
                        int i8 = 0;
                        while (true) {
                            if (i7 < 0) {
                                break;
                            }
                            i8 += gridLayoutManager.f4321g.mo4342a(i7);
                            if (i8 >= i6) {
                                i5 = i7;
                                break;
                            }
                            i7--;
                        }
                        i3 = gridLayoutManager.mo4373m();
                    } else if (layoutManager instanceof LinearLayoutManager) {
                        i5 = (A - 1) - (this.f131380c * 1);
                        i3 = ((LinearLayoutManager) layoutManager).mo4373m();
                    } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                        int i9 = staggeredGridLayoutManager.f4556a;
                        int[] iArr = new int[i9];
                        staggeredGridLayoutManager.mo4791b(iArr);
                        i3 = iArr[0];
                        for (int i10 = 0; i10 < i9; i10++) {
                            int i11 = iArr[i10];
                            if (i11 > i3) {
                                i3 = i11;
                            }
                        }
                        i5 = A - (staggeredGridLayoutManager.f4556a * this.f131380c);
                    }
                    if (layoutManager.mo4730s() > 0 && i3 >= i5 && this.f131383f != i5) {
                        this.f131383f = i5;
                        AbstractC57551a aVar = this.f131378a;
                        if (aVar != null) {
                            aVar.mo94897a();
                        }
                    }
                }
                this.f131381d = 0;
            }
        }
    }
}
