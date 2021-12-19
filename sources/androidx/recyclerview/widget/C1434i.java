package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.i */
public class C1434i extends AbstractC1391ab {

    /* renamed from: n */
    private static TimeInterpolator f4711n;

    /* renamed from: a */
    ArrayList<ArrayList<RecyclerView.ViewHolder>> f4712a = new ArrayList<>();

    /* renamed from: b */
    ArrayList<ArrayList<C1444b>> f4713b = new ArrayList<>();

    /* renamed from: c */
    ArrayList<ArrayList<C1443a>> f4714c = new ArrayList<>();

    /* renamed from: d */
    ArrayList<RecyclerView.ViewHolder> f4715d = new ArrayList<>();

    /* renamed from: e */
    ArrayList<RecyclerView.ViewHolder> f4716e = new ArrayList<>();

    /* renamed from: f */
    ArrayList<RecyclerView.ViewHolder> f4717f = new ArrayList<>();

    /* renamed from: g */
    ArrayList<RecyclerView.ViewHolder> f4718g = new ArrayList<>();

    /* renamed from: o */
    private ArrayList<RecyclerView.ViewHolder> f4719o = new ArrayList<>();

    /* renamed from: p */
    private ArrayList<RecyclerView.ViewHolder> f4720p = new ArrayList<>();

    /* renamed from: q */
    private ArrayList<C1444b> f4721q = new ArrayList<>();

    /* renamed from: r */
    private ArrayList<C1443a> f4722r = new ArrayList<>();

    static {
        Covode.recordClassIndex(1572);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: a */
    public final boolean mo4666a(RecyclerView.ViewHolder viewHolder, List<Object> list) {
        return !list.isEmpty() || super.mo4666a(viewHolder, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4929c() {
        if (!mo4668b()) {
            mo4673e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.i$a */
    public static class C1443a {

        /* renamed from: a */
        public RecyclerView.ViewHolder f4751a;

        /* renamed from: b */
        public RecyclerView.ViewHolder f4752b;

        /* renamed from: c */
        public int f4753c;

        /* renamed from: d */
        public int f4754d;

        /* renamed from: e */
        public int f4755e;

        /* renamed from: f */
        public int f4756f;

        static {
            Covode.recordClassIndex(1581);
        }

        public final String toString() {
            return "ChangeInfo{oldHolder=" + this.f4751a + ", newHolder=" + this.f4752b + ", fromX=" + this.f4753c + ", fromY=" + this.f4754d + ", toX=" + this.f4755e + ", toY=" + this.f4756f + '}';
        }

        private C1443a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            this.f4751a = viewHolder;
            this.f4752b = viewHolder2;
        }

        C1443a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            this(viewHolder, viewHolder2);
            this.f4753c = i;
            this.f4754d = i2;
            this.f4755e = i3;
            this.f4756f = i4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: b */
    public boolean mo4668b() {
        if (!this.f4720p.isEmpty() || !this.f4722r.isEmpty() || !this.f4721q.isEmpty() || !this.f4719o.isEmpty() || !this.f4716e.isEmpty() || !this.f4717f.isEmpty() || !this.f4715d.isEmpty() || !this.f4718g.isEmpty() || !this.f4713b.isEmpty() || !this.f4712a.isEmpty() || !this.f4714c.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: a */
    public void mo4663a() {
        long j;
        long j2;
        boolean z = !this.f4719o.isEmpty();
        boolean z2 = !this.f4721q.isEmpty();
        boolean z3 = !this.f4722r.isEmpty();
        boolean z4 = !this.f4720p.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.ViewHolder> it = this.f4719o.iterator();
            while (it.hasNext()) {
                final RecyclerView.ViewHolder next = it.next();
                final View view = next.itemView;
                final ViewPropertyAnimator animate = view.animate();
                this.f4717f.add(next);
                animate.setDuration(this.f4468j).alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                    /* class androidx.recyclerview.widget.C1434i.C14384 */

                    static {
                        Covode.recordClassIndex(1576);
                    }

                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationEnd(Animator animator) {
                        animate.setListener(null);
                        view.setAlpha(1.0f);
                        C1434i.this.mo4674f(next);
                        C1434i.this.f4717f.remove(next);
                        C1434i.this.mo4929c();
                    }
                }).start();
            }
            this.f4719o.clear();
            if (z2) {
                final ArrayList<C1444b> arrayList = new ArrayList<>();
                arrayList.addAll(this.f4721q);
                this.f4713b.add(arrayList);
                this.f4721q.clear();
                RunnableC14351 r3 = new Runnable() {
                    /* class androidx.recyclerview.widget.C1434i.RunnableC14351 */

                    static {
                        Covode.recordClassIndex(1573);
                    }

                    public final void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C1444b bVar = (C1444b) it.next();
                            C1434i iVar = C1434i.this;
                            RecyclerView.ViewHolder viewHolder = bVar.f4757a;
                            int i = bVar.f4758b;
                            int i2 = bVar.f4759c;
                            int i3 = bVar.f4760d;
                            int i4 = bVar.f4761e;
                            View view = viewHolder.itemView;
                            int i5 = i3 - i;
                            int i6 = i4 - i2;
                            if (i5 != 0) {
                                view.animate().translationX(0.0f);
                            }
                            if (i6 != 0) {
                                view.animate().translationY(0.0f);
                            }
                            ViewPropertyAnimator animate = view.animate();
                            iVar.f4716e.add(viewHolder);
                            animate.setDuration(iVar.f4469k).setListener(new AnimatorListenerAdapter(viewHolder, i5, view, i6, animate) {
                                /* class androidx.recyclerview.widget.C1434i.C14406 */

                                /* renamed from: a */
                                final /* synthetic */ RecyclerView.ViewHolder f4737a;

                                /* renamed from: b */
                                final /* synthetic */ int f4738b;

                                /* renamed from: c */
                                final /* synthetic */ View f4739c;

                                /* renamed from: d */
                                final /* synthetic */ int f4740d;

                                /* renamed from: e */
                                final /* synthetic */ ViewPropertyAnimator f4741e;

                                static {
                                    Covode.recordClassIndex(1578);
                                }

                                public final void onAnimationStart(Animator animator) {
                                }

                                public final void onAnimationCancel(Animator animator) {
                                    if (this.f4738b != 0) {
                                        this.f4739c.setTranslationX(0.0f);
                                    }
                                    if (this.f4740d != 0) {
                                        this.f4739c.setTranslationY(0.0f);
                                    }
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    this.f4741e.setListener(null);
                                    C1434i.this.mo4674f(this.f4737a);
                                    C1434i.this.f4716e.remove(this.f4737a);
                                    C1434i.this.mo4929c();
                                }

                                {
                                    this.f4737a = r2;
                                    this.f4738b = r3;
                                    this.f4739c = r4;
                                    this.f4740d = r5;
                                    this.f4741e = r6;
                                }
                            }).start();
                        }
                        arrayList.clear();
                        C1434i.this.f4713b.remove(arrayList);
                    }
                };
                if (z) {
                    C0792v.m2751a(arrayList.get(0).f4757a.itemView, r3, this.f4468j);
                } else {
                    r3.run();
                }
            }
            if (z3) {
                final ArrayList<C1443a> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f4722r);
                this.f4714c.add(arrayList2);
                this.f4722r.clear();
                RunnableC14362 r32 = new Runnable() {
                    /* class androidx.recyclerview.widget.C1434i.RunnableC14362 */

                    static {
                        Covode.recordClassIndex(1574);
                    }

                    public final void run() {
                        View view;
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C1443a aVar = (C1443a) it.next();
                            C1434i iVar = C1434i.this;
                            RecyclerView.ViewHolder viewHolder = aVar.f4751a;
                            View view2 = null;
                            if (viewHolder == null) {
                                view = null;
                            } else {
                                view = viewHolder.itemView;
                            }
                            RecyclerView.ViewHolder viewHolder2 = aVar.f4752b;
                            if (viewHolder2 != null) {
                                view2 = viewHolder2.itemView;
                            }
                            if (view != null) {
                                ViewPropertyAnimator duration = view.animate().setDuration(iVar.f4470l);
                                iVar.f4718g.add(aVar.f4751a);
                                duration.translationX((float) (aVar.f4755e - aVar.f4753c));
                                duration.translationY((float) (aVar.f4756f - aVar.f4754d));
                                duration.alpha(0.0f).setListener(new AnimatorListenerAdapter(aVar, duration, view) {
                                    /* class androidx.recyclerview.widget.C1434i.C14417 */

                                    /* renamed from: a */
                                    final /* synthetic */ C1443a f4743a;

                                    /* renamed from: b */
                                    final /* synthetic */ ViewPropertyAnimator f4744b;

                                    /* renamed from: c */
                                    final /* synthetic */ View f4745c;

                                    static {
                                        Covode.recordClassIndex(1579);
                                    }

                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        this.f4744b.setListener(null);
                                        this.f4745c.setAlpha(1.0f);
                                        this.f4745c.setTranslationX(0.0f);
                                        this.f4745c.setTranslationY(0.0f);
                                        C1434i.this.mo4674f(this.f4743a.f4751a);
                                        C1434i.this.f4718g.remove(this.f4743a.f4751a);
                                        C1434i.this.mo4929c();
                                    }

                                    {
                                        this.f4743a = r2;
                                        this.f4744b = r3;
                                        this.f4745c = r4;
                                    }
                                }).start();
                            }
                            if (view2 != null) {
                                ViewPropertyAnimator animate = view2.animate();
                                iVar.f4718g.add(aVar.f4752b);
                                animate.translationX(0.0f).translationY(0.0f).setDuration(iVar.f4470l).alpha(1.0f).setListener(new AnimatorListenerAdapter(aVar, animate, view2) {
                                    /* class androidx.recyclerview.widget.C1434i.C14428 */

                                    /* renamed from: a */
                                    final /* synthetic */ C1443a f4747a;

                                    /* renamed from: b */
                                    final /* synthetic */ ViewPropertyAnimator f4748b;

                                    /* renamed from: c */
                                    final /* synthetic */ View f4749c;

                                    static {
                                        Covode.recordClassIndex(1580);
                                    }

                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        this.f4748b.setListener(null);
                                        this.f4749c.setAlpha(1.0f);
                                        this.f4749c.setTranslationX(0.0f);
                                        this.f4749c.setTranslationY(0.0f);
                                        C1434i.this.mo4674f(this.f4747a.f4752b);
                                        C1434i.this.f4718g.remove(this.f4747a.f4752b);
                                        C1434i.this.mo4929c();
                                    }

                                    {
                                        this.f4747a = r2;
                                        this.f4748b = r3;
                                        this.f4749c = r4;
                                    }
                                }).start();
                            }
                        }
                        arrayList2.clear();
                        C1434i.this.f4714c.remove(arrayList2);
                    }
                };
                if (z) {
                    C0792v.m2751a(arrayList2.get(0).f4751a.itemView, r32, this.f4468j);
                } else {
                    r32.run();
                }
            }
            if (z4) {
                final ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f4720p);
                this.f4712a.add(arrayList3);
                this.f4720p.clear();
                RunnableC14373 r6 = new Runnable() {
                    /* class androidx.recyclerview.widget.C1434i.RunnableC14373 */

                    static {
                        Covode.recordClassIndex(1575);
                    }

                    public final void run() {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) it.next();
                            C1434i iVar = C1434i.this;
                            View view = viewHolder.itemView;
                            ViewPropertyAnimator animate = view.animate();
                            iVar.f4715d.add(viewHolder);
                            animate.alpha(1.0f).setDuration(iVar.f4467i).setListener(new AnimatorListenerAdapter(viewHolder, view, animate) {
                                /* class androidx.recyclerview.widget.C1434i.C14395 */

                                /* renamed from: a */
                                final /* synthetic */ RecyclerView.ViewHolder f4733a;

                                /* renamed from: b */
                                final /* synthetic */ View f4734b;

                                /* renamed from: c */
                                final /* synthetic */ ViewPropertyAnimator f4735c;

                                static {
                                    Covode.recordClassIndex(1577);
                                }

                                public final void onAnimationStart(Animator animator) {
                                }

                                public final void onAnimationCancel(Animator animator) {
                                    this.f4734b.setAlpha(1.0f);
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    this.f4735c.setListener(null);
                                    C1434i.this.mo4674f(this.f4733a);
                                    C1434i.this.f4715d.remove(this.f4733a);
                                    C1434i.this.mo4929c();
                                }

                                {
                                    this.f4733a = r2;
                                    this.f4734b = r3;
                                    this.f4735c = r4;
                                }
                            }).start();
                        }
                        arrayList3.clear();
                        C1434i.this.f4712a.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    long j3 = 0;
                    if (z) {
                        j = this.f4468j;
                    } else {
                        j = 0;
                    }
                    if (z2) {
                        j2 = this.f4469k;
                    } else {
                        j2 = 0;
                    }
                    if (z3) {
                        j3 = this.f4470l;
                    }
                    C0792v.m2751a(arrayList3.get(0).itemView, r6, j + Math.max(j2, j3));
                    return;
                }
                r6.run();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: d */
    public void mo4672d() {
        for (int size = this.f4721q.size() - 1; size >= 0; size--) {
            C1444b bVar = this.f4721q.get(size);
            View view = bVar.f4757a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo4674f(bVar.f4757a);
            this.f4721q.remove(size);
        }
        for (int size2 = this.f4719o.size() - 1; size2 >= 0; size2--) {
            mo4674f(this.f4719o.get(size2));
            this.f4719o.remove(size2);
        }
        for (int size3 = this.f4720p.size() - 1; size3 >= 0; size3--) {
            RecyclerView.ViewHolder viewHolder = this.f4720p.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            mo4674f(viewHolder);
            this.f4720p.remove(size3);
        }
        for (int size4 = this.f4722r.size() - 1; size4 >= 0; size4--) {
            m4906a(this.f4722r.get(size4));
        }
        this.f4722r.clear();
        if (mo4668b()) {
            for (int size5 = this.f4713b.size() - 1; size5 >= 0; size5--) {
                ArrayList<C1444b> arrayList = this.f4713b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C1444b bVar2 = arrayList.get(size6);
                    View view2 = bVar2.f4757a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo4674f(bVar2.f4757a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f4713b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f4712a.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.ViewHolder> arrayList2 = this.f4712a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder2 = arrayList2.get(size8);
                    viewHolder2.itemView.setAlpha(1.0f);
                    mo4674f(viewHolder2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f4712a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f4714c.size() - 1; size9 >= 0; size9--) {
                ArrayList<C1443a> arrayList3 = this.f4714c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m4906a(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f4714c.remove(arrayList3);
                    }
                }
            }
            m4907a(this.f4717f);
            m4907a(this.f4716e);
            m4907a(this.f4715d);
            m4907a(this.f4718g);
            mo4673e();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1391ab
    /* renamed from: a */
    public boolean mo4850a(RecyclerView.ViewHolder viewHolder) {
        m4910h(viewHolder);
        this.f4719o.add(viewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1391ab
    /* renamed from: b */
    public boolean mo4853b(RecyclerView.ViewHolder viewHolder) {
        m4910h(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.f4720p.add(viewHolder);
        return true;
    }

    /* renamed from: a */
    private void m4906a(C1443a aVar) {
        if (aVar.f4751a != null) {
            m4909a(aVar, aVar.f4751a);
        }
        if (aVar.f4752b != null) {
            m4909a(aVar, aVar.f4752b);
        }
    }

    /* renamed from: h */
    private void m4910h(RecyclerView.ViewHolder viewHolder) {
        if (f4711n == null) {
            f4711n = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(f4711n);
        mo4670c(viewHolder);
    }

    /* renamed from: a */
    private static void m4907a(List<RecyclerView.ViewHolder> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: c */
    public void mo4670c(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        for (int size = this.f4721q.size() - 1; size >= 0; size--) {
            if (this.f4721q.get(size).f4757a == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo4674f(viewHolder);
                this.f4721q.remove(size);
            }
        }
        m4908a(this.f4722r, viewHolder);
        if (this.f4719o.remove(viewHolder)) {
            view.setAlpha(1.0f);
            mo4674f(viewHolder);
        }
        if (this.f4720p.remove(viewHolder)) {
            view.setAlpha(1.0f);
            mo4674f(viewHolder);
        }
        for (int size2 = this.f4714c.size() - 1; size2 >= 0; size2--) {
            ArrayList<C1443a> arrayList = this.f4714c.get(size2);
            m4908a(arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.f4714c.remove(size2);
            }
        }
        for (int size3 = this.f4713b.size() - 1; size3 >= 0; size3--) {
            ArrayList<C1444b> arrayList2 = this.f4713b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f4757a == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo4674f(viewHolder);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f4713b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f4712a.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.ViewHolder> arrayList3 = this.f4712a.get(size5);
            if (arrayList3.remove(viewHolder)) {
                view.setAlpha(1.0f);
                mo4674f(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.f4712a.remove(size5);
                }
            }
        }
        this.f4717f.remove(viewHolder);
        this.f4715d.remove(viewHolder);
        this.f4718g.remove(viewHolder);
        this.f4716e.remove(viewHolder);
        mo4929c();
    }

    /* renamed from: a */
    private void m4908a(List<C1443a> list, RecyclerView.ViewHolder viewHolder) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1443a aVar = list.get(size);
            if (m4909a(aVar, viewHolder) && aVar.f4751a == null && aVar.f4752b == null) {
                list.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m4909a(C1443a aVar, RecyclerView.ViewHolder viewHolder) {
        if (aVar.f4752b == viewHolder) {
            aVar.f4752b = null;
        } else if (aVar.f4751a != viewHolder) {
            return false;
        } else {
            aVar.f4751a = null;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        mo4674f(viewHolder);
        return true;
    }

    /* renamed from: androidx.recyclerview.widget.i$b */
    static class C1444b {

        /* renamed from: a */
        public RecyclerView.ViewHolder f4757a;

        /* renamed from: b */
        public int f4758b;

        /* renamed from: c */
        public int f4759c;

        /* renamed from: d */
        public int f4760d;

        /* renamed from: e */
        public int f4761e;

        static {
            Covode.recordClassIndex(1582);
        }

        C1444b(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.f4757a = viewHolder;
            this.f4758b = i;
            this.f4759c = i2;
            this.f4760d = i3;
            this.f4761e = i4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        if (r1 != 0) goto L_0x002e;
     */
    @Override // androidx.recyclerview.widget.AbstractC1391ab
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4851a(androidx.recyclerview.widget.RecyclerView.ViewHolder r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            r4 = r10
            r5 = r11
            r3 = r9
            android.view.View r2 = r3.itemView
            android.view.View r0 = r3.itemView
            float r0 = r0.getTranslationX()
            int r0 = (int) r0
            int r4 = r4 + r0
            android.view.View r0 = r3.itemView
            float r0 = r0.getTranslationY()
            int r0 = (int) r0
            int r5 = r5 + r0
            r8.m4910h(r3)
            r6 = r12
            int r0 = r6 - r4
            r7 = r13
            int r1 = r7 - r5
            if (r0 != 0) goto L_0x0027
            if (r1 != 0) goto L_0x002e
            r8.mo4674f(r3)
            r0 = 0
            return r0
        L_0x0027:
            int r0 = -r0
            float r0 = (float) r0
            r2.setTranslationX(r0)
            if (r1 == 0) goto L_0x0033
        L_0x002e:
            int r0 = -r1
            float r0 = (float) r0
            r2.setTranslationY(r0)
        L_0x0033:
            java.util.ArrayList<androidx.recyclerview.widget.i$b> r0 = r8.f4721q
            androidx.recyclerview.widget.i$b r2 = new androidx.recyclerview.widget.i$b
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1434i.mo4851a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int, int, int, int):boolean");
    }

    @Override // androidx.recyclerview.widget.AbstractC1391ab
    /* renamed from: a */
    public boolean mo4852a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (viewHolder == viewHolder2) {
            return mo4851a(viewHolder, i, i2, i3, i4);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        m4910h(viewHolder);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            m4910h(viewHolder2);
            viewHolder2.itemView.setTranslationX((float) (-i5));
            viewHolder2.itemView.setTranslationY((float) (-i6));
            viewHolder2.itemView.setAlpha(0.0f);
        }
        this.f4722r.add(new C1443a(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }
}
