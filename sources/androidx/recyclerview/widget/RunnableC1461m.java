package androidx.recyclerview.widget;

import androidx.core.p033d.C0654g;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.m */
public final class RunnableC1461m implements Runnable {

    /* renamed from: a */
    static final ThreadLocal<RunnableC1461m> f4827a = new ThreadLocal<>();

    /* renamed from: e */
    static Comparator<C1464b> f4828e = new Comparator<C1464b>() {
        /* class androidx.recyclerview.widget.RunnableC1461m.C14621 */

        static {
            Covode.recordClassIndex(1600);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(C1464b bVar, C1464b bVar2) {
            boolean z;
            boolean z2;
            C1464b bVar3 = bVar;
            C1464b bVar4 = bVar2;
            if (bVar3.f4840d == null) {
                z = true;
            } else {
                z = false;
            }
            if (bVar4.f4840d == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (bVar3.f4840d == null) {
                    return 1;
                }
                return -1;
            } else if (bVar3.f4837a == bVar4.f4837a) {
                int i = bVar4.f4838b - bVar3.f4838b;
                if (i != 0) {
                    return i;
                }
                int i2 = bVar3.f4839c - bVar4.f4839c;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            } else if (bVar3.f4837a) {
                return -1;
            } else {
                return 1;
            }
        }
    };

    /* renamed from: b */
    ArrayList<RecyclerView> f4829b = new ArrayList<>();

    /* renamed from: c */
    long f4830c;

    /* renamed from: d */
    long f4831d;

    /* renamed from: f */
    private ArrayList<C1464b> f4832f = new ArrayList<>();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.m$a */
    public static class C1463a implements RecyclerView.AbstractC1362i.AbstractC1365a {

        /* renamed from: a */
        int f4833a;

        /* renamed from: b */
        int f4834b;

        /* renamed from: c */
        int[] f4835c;

        /* renamed from: d */
        int f4836d;

        static {
            Covode.recordClassIndex(1601);
        }

        C1463a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4969a() {
            int[] iArr = this.f4835c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4836d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo4971a(int i) {
            if (this.f4835c != null) {
                int i2 = this.f4836d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f4835c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i.AbstractC1365a
        /* renamed from: a */
        public final void mo4743a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f4836d * 2;
                int[] iArr = this.f4835c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f4835c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f4835c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f4835c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f4836d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4970a(RecyclerView recyclerView, boolean z) {
            this.f4836d = 0;
            int[] iArr = this.f4835c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC1362i iVar = recyclerView.f4445o;
            if (recyclerView.f4444n != null && iVar != null && iVar.f4480E) {
                if (z) {
                    if (!recyclerView.f4437g.mo4844d()) {
                        iVar.mo4349a(recyclerView.f4444n.getItemCount(), this);
                    }
                } else if (!recyclerView.mo4500p()) {
                    iVar.mo4348a(this.f4833a, this.f4834b, recyclerView.f4386G, this);
                }
                if (this.f4836d > iVar.f4481F) {
                    iVar.f4481F = this.f4836d;
                    iVar.f4482G = z;
                    recyclerView.f4435e.mo4763b();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$b */
    static class C1464b {

        /* renamed from: a */
        public boolean f4837a;

        /* renamed from: b */
        public int f4838b;

        /* renamed from: c */
        public int f4839c;

        /* renamed from: d */
        public RecyclerView f4840d;

        /* renamed from: e */
        public int f4841e;

        static {
            Covode.recordClassIndex(1602);
        }

        C1464b() {
        }
    }

    static {
        Covode.recordClassIndex(1599);
    }

    RunnableC1461m() {
    }

    public final void run() {
        Throwable th;
        long j;
        RecyclerView recyclerView;
        C1464b bVar;
        boolean z;
        long j2 = 0;
        try {
            C0654g.m2391a("RV Prefetch");
            if (!this.f4829b.isEmpty()) {
                int size = this.f4829b.size();
                long j3 = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView2 = this.f4829b.get(i);
                    if (recyclerView2.getWindowVisibility() == 0) {
                        j3 = Math.max(recyclerView2.getDrawingTime(), j3);
                    }
                }
                if (j3 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j3) + this.f4831d;
                    int size2 = this.f4829b.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        RecyclerView recyclerView3 = this.f4829b.get(i3);
                        if (recyclerView3.getWindowVisibility() == 0) {
                            recyclerView3.f4385F.mo4970a(recyclerView3, false);
                            i2 += recyclerView3.f4385F.f4836d;
                        }
                    }
                    this.f4832f.ensureCapacity(i2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        RecyclerView recyclerView4 = this.f4829b.get(i5);
                        if (recyclerView4.getWindowVisibility() == 0) {
                            C1463a aVar = recyclerView4.f4385F;
                            int abs = Math.abs(aVar.f4833a) + Math.abs(aVar.f4834b);
                            for (int i6 = 0; i6 < aVar.f4836d * 2; i6 += 2) {
                                if (i4 >= this.f4832f.size()) {
                                    bVar = new C1464b();
                                    this.f4832f.add(bVar);
                                } else {
                                    bVar = this.f4832f.get(i4);
                                }
                                int i7 = aVar.f4835c[i6 + 1];
                                if (i7 <= abs) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                try {
                                    bVar.f4837a = z;
                                    bVar.f4838b = abs;
                                    bVar.f4839c = i7;
                                    bVar.f4840d = recyclerView4;
                                    bVar.f4841e = aVar.f4835c[i6];
                                    i4++;
                                } catch (Throwable th2) {
                                    th = th2;
                                    j2 = 0;
                                    this.f4830c = j2;
                                    C0654g.m2390a();
                                    throw th;
                                }
                            }
                        }
                    }
                    Collections.sort(this.f4832f, f4828e);
                    for (int i8 = 0; i8 < this.f4832f.size(); i8++) {
                        C1464b bVar2 = this.f4832f.get(i8);
                        if (bVar2.f4840d == null) {
                            break;
                        }
                        if (bVar2.f4837a) {
                            j = Long.MAX_VALUE;
                        } else {
                            j = nanos;
                        }
                        RecyclerView.ViewHolder a = m4959a(bVar2.f4840d, bVar2.f4841e, j);
                        if (!(a == null || a.mNestedRecyclerView == null || !a.isBound() || a.isInvalid() || (recyclerView = a.mNestedRecyclerView.get()) == null)) {
                            if (recyclerView.f4380A && recyclerView.f4438h.mo4899b() != 0) {
                                recyclerView.mo4412b();
                            }
                            C1463a aVar2 = recyclerView.f4385F;
                            aVar2.mo4970a(recyclerView, true);
                            if (aVar2.f4836d != 0) {
                                try {
                                    C0654g.m2391a("RV Nested Prefetch");
                                    RecyclerView.C1378s sVar = recyclerView.f4386G;
                                    RecyclerView.AbstractC1350a aVar3 = recyclerView.f4444n;
                                    sVar.f4532d = 1;
                                    sVar.f4533e = aVar3.getItemCount();
                                    sVar.f4535g = false;
                                    sVar.f4536h = false;
                                    sVar.f4537i = false;
                                    for (int i9 = 0; i9 < aVar2.f4836d * 2; i9 += 2) {
                                        m4959a(recyclerView, aVar2.f4835c[i9], nanos);
                                    }
                                } finally {
                                    C0654g.m2390a();
                                }
                            }
                        }
                        bVar2.f4837a = false;
                        bVar2.f4838b = 0;
                        bVar2.f4839c = 0;
                        bVar2.f4840d = null;
                        bVar2.f4841e = 0;
                    }
                    j2 = 0;
                }
            }
            this.f4830c = j2;
            C0654g.m2390a();
        } catch (Throwable th3) {
            th = th3;
            this.f4830c = j2;
            C0654g.m2390a();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4966a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f4830c == 0) {
            this.f4830c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C1463a aVar = recyclerView.f4385F;
        aVar.f4833a = i;
        aVar.f4834b = i2;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m4959a(RecyclerView recyclerView, int i, long j) {
        int b = recyclerView.f4438h.mo4899b();
        for (int i2 = 0; i2 < b; i2++) {
            RecyclerView.ViewHolder c = RecyclerView.m4275c(recyclerView.f4438h.mo4903c(i2));
            if (c.mPosition == i && !c.isInvalid()) {
                return null;
            }
        }
        RecyclerView.C1372o oVar = recyclerView.f4435e;
        try {
            recyclerView.mo4482j();
            RecyclerView.ViewHolder a = RecyclerView.C1372o.m4556a(oVar, i, j);
            if (a != null) {
                if (!a.isBound() || a.isInvalid()) {
                    oVar.mo4760a(a, false);
                } else {
                    oVar.mo4757a(a.itemView);
                }
            }
            return a;
        } finally {
            recyclerView.mo4419b(false);
        }
    }
}
