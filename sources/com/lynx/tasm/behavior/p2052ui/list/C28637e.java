package com.lynx.tasm.behavior.p2052ui.list;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.AbstractC28838o;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.p2054c.C28725c;
import com.lynx.tasm.p2054c.C28729g;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* renamed from: com.lynx.tasm.behavior.ui.list.e */
public final class C28637e extends RecyclerView.AbstractC1371n {

    /* renamed from: a */
    int f67412a;

    /* renamed from: b */
    int f67413b = 200;

    /* renamed from: c */
    int f67414c = 50;

    /* renamed from: d */
    int f67415d = 50;

    /* renamed from: e */
    int f67416e;

    /* renamed from: f */
    int f67417f;

    /* renamed from: g */
    boolean f67418g;

    /* renamed from: h */
    private final C28719c f67419h;

    /* renamed from: i */
    private final RecyclerView f67420i;

    /* renamed from: j */
    private long f67421j;

    /* renamed from: k */
    private final UIList f67422k;

    /* renamed from: l */
    private boolean f67423l = true;

    /* renamed from: m */
    private int f67424m;

    /* renamed from: n */
    private int f67425n = 1;

    static {
        Covode.recordClassIndex(34696);
    }

    /* renamed from: a */
    private static boolean m57264a(int i) {
        return (i & 1) != 0;
    }

    /* renamed from: b */
    private static boolean m57266b(int i) {
        return (i & 2) != 0;
    }

    /* renamed from: c */
    private static boolean m57267c(int i) {
        return (i & 4) != 0;
    }

    /* renamed from: d */
    private static boolean m57268d(int i) {
        return (i & 8) != 0;
    }

    /* renamed from: a */
    public final void mo49573a(JavaOnlyArray javaOnlyArray) {
        if (mo49574a()) {
            C28725c cVar = new C28725c(this.f67422k.getSign(), "layoutcomplete");
            cVar.mo49838a("timestamp", Long.valueOf(new Date().getTime()));
            cVar.mo49838a("cells", javaOnlyArray);
            this.f67419h.mo49834a(cVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
        int i3;
        boolean z;
        boolean z2;
        if (!(i == 0 && i2 == 0)) {
            this.f67424m += i2;
            if (System.currentTimeMillis() - this.f67421j > ((long) this.f67413b)) {
                m57263a("scroll", 1, this.f67424m, i, i2);
                this.f67421j = System.currentTimeMillis();
            }
            RecyclerView.AbstractC1362i layoutManager = this.f67420i.getLayoutManager();
            int childCount = this.f67420i.getChildCount();
            int A = layoutManager.mo4685A();
            int u = layoutManager.mo4732u();
            int w = layoutManager.f4486K - layoutManager.mo4734w();
            int i4 = this.f67416e;
            boolean z3 = true;
            if (i4 > 0 || this.f67417f > 0) {
                int i5 = (A - this.f67417f) - 1;
                int i6 = Integer.MAX_VALUE;
                int i7 = Integer.MIN_VALUE;
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = this.f67420i.getChildAt(i8);
                    int e = RecyclerView.m4278e(childAt);
                    int p = RecyclerView.AbstractC1362i.m4432p(childAt);
                    if (RecyclerView.AbstractC1362i.m4434r(childAt) > u) {
                        i6 = Math.min(e, i6);
                    }
                    if (p < w) {
                        i7 = Math.max(e, i7);
                    }
                }
                if (i6 < i4) {
                    i3 = 4;
                } else {
                    i3 = 0;
                }
                if (i7 > i5) {
                    i3 |= 8;
                }
            } else {
                i3 = 0;
            }
            if (this.f67420i.mo4392a(0, false) != null) {
                z = true;
            } else {
                z = false;
            }
            if (this.f67420i.mo4392a(A - 1, false) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                int i9 = Integer.MIN_VALUE;
                int i10 = Integer.MAX_VALUE;
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt2 = this.f67420i.getChildAt(i11);
                    i10 = Math.min(RecyclerView.AbstractC1362i.m4432p(childAt2), i10);
                    i9 = Math.max(RecyclerView.AbstractC1362i.m4434r(childAt2), i9);
                }
                if (z) {
                    if (i10 == u) {
                        this.f67424m = 0;
                    }
                    if (i10 > u - this.f67414c) {
                        i3 |= 1;
                        if (this.f67416e > 0) {
                            i3 &= -5;
                        }
                    }
                }
                if (z2 && i9 < w + this.f67415d) {
                    i3 |= 2;
                    if (this.f67417f > 0) {
                        i3 &= -9;
                    }
                }
            }
            boolean z4 = m57264a(i3) && !m57264a(this.f67425n);
            boolean z5 = m57267c(i3) && !m57267c(this.f67425n);
            boolean z6 = m57266b(i3) && !m57266b(this.f67425n);
            if (!m57268d(i3) || m57268d(this.f67425n)) {
                z3 = false;
            }
            if (z4 || z5) {
                m57263a("scrolltoupper", 2, this.f67424m, 0, 0);
            } else if (z6 || z3) {
                m57263a("scrolltolower", 4, this.f67424m, 0, 0);
            }
            this.f67425n = i3;
        }
    }

    /* renamed from: a */
    public final boolean mo49574a() {
        if ((this.f67412a & 16) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final JavaOnlyArray mo49575b() {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        if (DisplayMetricsHolder.m57911a() == null) {
            return javaOnlyArray;
        }
        ArrayList arrayList = new ArrayList();
        RecyclerView.AbstractC1362i layoutManager = this.f67420i.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int m = linearLayoutManager.mo4373m();
            for (int k = linearLayoutManager.mo4371k(); k <= m; k++) {
                arrayList.add(Integer.valueOf(k));
            }
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] a = staggeredGridLayoutManager.mo4790a((int[]) null);
            int[] b = staggeredGridLayoutManager.mo4791b((int[]) null);
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            for (int i3 : a) {
                arrayList.add(Integer.valueOf(i3));
                i2 = Math.max(i2, i3);
            }
            for (int i4 : b) {
                arrayList.add(Integer.valueOf(i4));
                i = Math.min(i, i4);
            }
            while (true) {
                i2++;
                if (i2 >= i) {
                    break;
                }
                arrayList.add(Integer.valueOf(i2));
            }
            Collections.sort(arrayList);
        }
        float f = DisplayMetricsHolder.m57911a().density;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            C28644h hVar = (C28644h) this.f67420i.mo4447e(intValue);
            if (!(hVar == null || hVar.f67449a.f67451b == null)) {
                View view = hVar.itemView;
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                javaOnlyMap.put("id", hVar.f67449a.f67451b.mIdSelector);
                javaOnlyMap.put("position", Integer.valueOf(intValue));
                javaOnlyMap.put("top", Float.valueOf(((float) view.getTop()) / f));
                javaOnlyMap.put("bottom", Float.valueOf(((float) view.getBottom()) / f));
                javaOnlyMap.put("left", Float.valueOf(((float) view.getLeft()) / f));
                javaOnlyMap.put("right", Float.valueOf(((float) view.getRight()) / f));
                javaOnlyArray.add(javaOnlyMap);
            }
        }
        return javaOnlyArray;
    }

    /* renamed from: a */
    public static int m57261a(AbstractC28367a aVar, int i) {
        ReadableType h = aVar.mo48559h();
        if (h == ReadableType.String) {
            try {
                i = Integer.parseInt(aVar.mo48556e());
                return i;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return i;
            }
        } else if (h == ReadableType.Int || h == ReadableType.Number || h == ReadableType.Long) {
            return aVar.mo48555d();
        } else {
            return i;
        }
    }

    /* renamed from: a */
    private void m57262a(int i, String str) {
        JavaOnlyArray javaOnlyArray;
        if ((this.f67412a & 8) != 0) {
            C28729g a = C28729g.m57542a(this.f67422k.getSign(), str);
            if (this.f67418g) {
                javaOnlyArray = mo49575b();
            } else {
                javaOnlyArray = null;
            }
            a.mo49841a(i, javaOnlyArray);
            this.f67419h.mo49834a(a);
        }
    }

    /* renamed from: a */
    public static boolean m57265a(AbstractC28367a aVar, boolean z) {
        if (aVar == null) {
            return z;
        }
        ReadableType h = aVar.mo48559h();
        if (h == ReadableType.String) {
            return Boolean.parseBoolean(aVar.mo48556e());
        }
        if (h == ReadableType.Int || h == ReadableType.Number || h == ReadableType.Long) {
            if (aVar.mo48555d() != 0) {
                return true;
            }
            return false;
        } else if (h == ReadableType.Boolean) {
            return aVar.mo48553b();
        } else {
            return z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49572a(int i, int i2) {
        if (!this.f67423l && i2 == 0) {
            if (i > 0) {
                m57263a("scrolltolower", 4, this.f67424m, 0, 0);
                this.f67423l = true;
            } else if (i < 0) {
                this.f67424m = 0;
                m57263a("scrolltoupper", 2, 0, 0, 0);
                this.f67423l = true;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4753a(RecyclerView recyclerView, int i) {
        this.f67422k.recognizeGesturere();
        if (i == 0) {
            m57262a(1, "scrollstatechange");
            if (this.f67422k.mEnableScrollMonitor) {
                this.f67422k.mContext.f67072m.mo49974b(new AbstractC28838o.C28840b(recyclerView, this.f67422k.mTagName, this.f67422k.mScrollMonitorTag));
            }
        } else if (i == 1) {
            this.f67423l = false;
            m57262a(2, "scrollstatechange");
            if (this.f67422k.mEnableScrollMonitor) {
                this.f67422k.mContext.f67072m.mo49970a(new AbstractC28838o.C28840b(recyclerView, this.f67422k.mTagName, this.f67422k.mScrollMonitorTag));
            }
        } else if (i == 2) {
            m57262a(3, "scrollstatechange");
        }
    }

    public C28637e(C28719c cVar, RecyclerView recyclerView, UIList uIList) {
        this.f67419h = cVar;
        this.f67420i = recyclerView;
        recyclerView.mo4405a(this);
        this.f67422k = uIList;
    }

    /* renamed from: a */
    private void m57263a(String str, int i, int i2, int i3, int i4) {
        JavaOnlyArray javaOnlyArray;
        if ((i & this.f67412a) != 0) {
            C28729g a = C28729g.m57542a(this.f67422k.getSign(), str);
            if (this.f67418g) {
                javaOnlyArray = mo49575b();
            } else {
                javaOnlyArray = null;
            }
            a.mo49840a(i2, i3, i4, javaOnlyArray);
            this.f67419h.mo49834a(a);
        }
    }
}
