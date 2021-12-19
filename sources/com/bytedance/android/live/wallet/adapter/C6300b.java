package com.bytedance.android.live.wallet.adapter;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.C1764a;
import com.bytedance.android.live.wallet.adapter.C6293a;
import com.bytedance.android.livesdk.wallet.C11314c;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.wallet.adapter.b */
public final class C6300b extends PagerAdapter {

    /* renamed from: a */
    public int f15753a = -1;

    /* renamed from: b */
    public int f15754b = -1;

    /* renamed from: c */
    public List<? extends C11314c> f15755c = new ArrayList();

    /* renamed from: d */
    public int f15756d = -1;

    /* renamed from: e */
    public DiamondPackageExtra f15757e;

    /* renamed from: f */
    public int f15758f;

    /* renamed from: g */
    public SparseArray<Long> f15759g = new SparseArray<>(32);

    /* renamed from: h */
    final C6293a.AbstractC6295b f15760h;

    static {
        Covode.recordClassIndex(7014);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        C89219l.m154721d(obj, "");
        return -2;
    }

    /* renamed from: com.bytedance.android.live.wallet.adapter.b$a */
    public static final class C6301a extends GridLayoutManager.AbstractC1337c {

        /* renamed from: e */
        final /* synthetic */ C6293a f15761e;

        static {
            Covode.recordClassIndex(7015);
        }

        C6301a(C6293a aVar) {
            this.f15761e = aVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            if (this.f15761e.getItemViewType(i) == -1 || this.f15761e.getItemViewType(i) == -2) {
                return 3;
            }
            return 1;
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.adapter.b$b */
    public static final class C6302b extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C6300b f15762a;

        static {
            Covode.recordClassIndex(7016);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6302b(C6300b bVar) {
            this.f15762a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            boolean z;
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            C6300b bVar = this.f15762a;
            int[] iArr = new int[2];
            RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                iArr[0] = linearLayoutManager.mo4371k();
                iArr[1] = linearLayoutManager.mo4373m();
                int i3 = linearLayoutManager.f4334j;
                int i4 = iArr[0];
                int i5 = iArr[1];
                if (i4 <= i5) {
                    while (true) {
                        View c = layoutManager.mo4358c(i4);
                        if (c != null) {
                            Rect rect = new Rect();
                            boolean globalVisibleRect = c.getGlobalVisibleRect(rect);
                            if (i3 != 1 || ((float) rect.height()) < ((float) c.getMeasuredHeight()) / 1.25f || !globalVisibleRect) {
                                z = false;
                            } else {
                                z = true;
                            }
                            Long l = bVar.f15759g.get(i4, -1L);
                            long currentTimeMillis = System.currentTimeMillis();
                            if (l.longValue() > 0) {
                                if (!z) {
                                    C89219l.m154716b(l, "");
                                    if (l.longValue() != currentTimeMillis) {
                                        bVar.f15759g.put(i4, -1L);
                                        bVar.f15760h.mo12309a(false, i4, (C11314c) bVar.f15755c.get(i4));
                                    }
                                }
                            } else if (z) {
                                bVar.f15759g.put(i4, Long.valueOf(currentTimeMillis));
                                bVar.f15760h.mo12309a(true, i4, (C11314c) bVar.f15755c.get(i4));
                            }
                        }
                        if (i4 != i5) {
                            i4++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12320a(List<? extends C11314c> list) {
        C89219l.m154721d(list, "");
        this.f15755c = list;
    }

    public C6300b(C6293a.AbstractC6295b bVar) {
        C89219l.m154721d(bVar, "");
        this.f15760h = bVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(obj, "");
        return C89219l.m154714a(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        MethodCollector.m26663i(14024);
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.bd3, viewGroup, false);
        if (a != null) {
            RecyclerView recyclerView = (RecyclerView) a;
            recyclerView.setOverScrollMode(2);
            RechargePagerAdapter$instantiateItem$layoutManager$1 rechargePagerAdapter$instantiateItem$layoutManager$1 = new RechargePagerAdapter$instantiateItem$layoutManager$1(viewGroup, viewGroup.getContext());
            recyclerView.setLayoutManager(rechargePagerAdapter$instantiateItem$layoutManager$1);
            C6293a aVar = new C6293a(this.f15755c, this.f15760h, this.f15756d, this.f15754b, this.f15753a, this.f15758f);
            recyclerView.setAdapter(aVar);
            rechargePagerAdapter$instantiateItem$layoutManager$1.mo4320a(new C6301a(aVar));
            recyclerView.mo4405a(new C6302b(this));
            viewGroup.addView(a);
            MethodCollector.m26664o(14024);
            return a;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        MethodCollector.m26664o(14024);
        throw nullPointerException;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        MethodCollector.m26663i(14025);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(obj, "");
        viewGroup.removeView((View) obj);
        MethodCollector.m26664o(14025);
    }
}
