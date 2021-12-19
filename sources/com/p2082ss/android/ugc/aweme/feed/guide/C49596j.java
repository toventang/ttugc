package com.p2082ss.android.ugc.aweme.feed.guide;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.AbstractC1391ab;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.j */
public final class C49596j extends AbstractC1391ab {

    /* renamed from: o */
    private static TimeInterpolator f114098o;

    /* renamed from: a */
    ArrayList<ArrayList<RecyclerView.ViewHolder>> f114099a = new ArrayList<>();

    /* renamed from: b */
    ArrayList<ArrayList<C49607b>> f114100b = new ArrayList<>();

    /* renamed from: c */
    ArrayList<ArrayList<C49606a>> f114101c = new ArrayList<>();

    /* renamed from: d */
    ArrayList<RecyclerView.ViewHolder> f114102d = new ArrayList<>();

    /* renamed from: e */
    ArrayList<RecyclerView.ViewHolder> f114103e = new ArrayList<>();

    /* renamed from: f */
    ArrayList<RecyclerView.ViewHolder> f114104f = new ArrayList<>();

    /* renamed from: g */
    ArrayList<RecyclerView.ViewHolder> f114105g = new ArrayList<>();

    /* renamed from: n */
    public RecyclerView f114106n;

    /* renamed from: p */
    private ArrayList<RecyclerView.ViewHolder> f114107p = new ArrayList<>();

    /* renamed from: q */
    private ArrayList<RecyclerView.ViewHolder> f114108q = new ArrayList<>();

    /* renamed from: r */
    private ArrayList<C49607b> f114109r = new ArrayList<>();

    /* renamed from: s */
    private ArrayList<C49606a> f114110s = new ArrayList<>();

    static {
        Covode.recordClassIndex(58442);
    }

    @Override // androidx.recyclerview.widget.AbstractC1391ab
    /* renamed from: a */
    public final boolean mo4852a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (viewHolder == viewHolder2) {
            return mo4851a(viewHolder, i, i2, i3, i4);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        m93018h(viewHolder);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            m93018h(viewHolder2);
            viewHolder2.itemView.setTranslationX((float) (-i5));
            viewHolder2.itemView.setTranslationY((float) (-i6));
            viewHolder2.itemView.setAlpha(0.0f);
        }
        this.f114110s.add(new C49606a(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: a */
    public final boolean mo4666a(RecyclerView.ViewHolder viewHolder, List<Object> list) {
        return !list.isEmpty() || super.mo4666a(viewHolder, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo81385c() {
        if (!mo4668b()) {
            mo4673e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.guide.j$a */
    public static class C49606a {

        /* renamed from: a */
        public RecyclerView.ViewHolder f114137a;

        /* renamed from: b */
        public RecyclerView.ViewHolder f114138b;

        /* renamed from: c */
        public int f114139c;

        /* renamed from: d */
        public int f114140d;

        /* renamed from: e */
        public int f114141e;

        /* renamed from: f */
        public int f114142f;

        static {
            Covode.recordClassIndex(58452);
        }

        public final String toString() {
            return "ChangeInfo{oldHolder=" + this.f114137a + ", newHolder=" + this.f114138b + ", fromX=" + this.f114139c + ", fromY=" + this.f114140d + ", toX=" + this.f114141e + ", toY=" + this.f114142f + '}';
        }

        private C49606a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            this.f114137a = viewHolder;
            this.f114138b = viewHolder2;
        }

        C49606a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            this(viewHolder, viewHolder2);
            this.f114139c = i;
            this.f114140d = i2;
            this.f114141e = i3;
            this.f114142f = i4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: b */
    public final boolean mo4668b() {
        if (!this.f114108q.isEmpty() || !this.f114110s.isEmpty() || !this.f114109r.isEmpty() || !this.f114107p.isEmpty() || !this.f114103e.isEmpty() || !this.f114104f.isEmpty() || !this.f114102d.isEmpty() || !this.f114105g.isEmpty() || !this.f114100b.isEmpty() || !this.f114099a.isEmpty() || !this.f114101c.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: d */
    public final void mo4672d() {
        for (int size = this.f114109r.size() - 1; size >= 0; size--) {
            C49607b bVar = this.f114109r.get(size);
            View view = bVar.f114143a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo4674f(bVar.f114143a);
            this.f114109r.remove(size);
        }
        for (int size2 = this.f114107p.size() - 1; size2 >= 0; size2--) {
            mo4674f(this.f114107p.get(size2));
            this.f114107p.remove(size2);
        }
        for (int size3 = this.f114108q.size() - 1; size3 >= 0; size3--) {
            RecyclerView.ViewHolder viewHolder = this.f114108q.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            mo4674f(viewHolder);
            this.f114108q.remove(size3);
        }
        for (int size4 = this.f114110s.size() - 1; size4 >= 0; size4--) {
            m93014a(this.f114110s.get(size4));
        }
        this.f114110s.clear();
        if (mo4668b()) {
            for (int size5 = this.f114100b.size() - 1; size5 >= 0; size5--) {
                ArrayList<C49607b> arrayList = this.f114100b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C49607b bVar2 = arrayList.get(size6);
                    View view2 = bVar2.f114143a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo4674f(bVar2.f114143a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f114100b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f114099a.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.ViewHolder> arrayList2 = this.f114099a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder2 = arrayList2.get(size8);
                    viewHolder2.itemView.setAlpha(1.0f);
                    mo4674f(viewHolder2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f114099a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f114101c.size() - 1; size9 >= 0; size9--) {
                ArrayList<C49606a> arrayList3 = this.f114101c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m93014a(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f114101c.remove(arrayList3);
                    }
                }
            }
            m93015a(this.f114104f);
            m93015a(this.f114103e);
            m93015a(this.f114102d);
            m93015a(this.f114105g);
            mo4673e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: a */
    public final void mo4663a() {
        long j;
        long j2;
        boolean z = !this.f114107p.isEmpty();
        boolean z2 = !this.f114109r.isEmpty();
        boolean z3 = !this.f114110s.isEmpty();
        boolean z4 = !this.f114108q.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.ViewHolder> it = this.f114107p.iterator();
            while (it.hasNext()) {
                final RecyclerView.ViewHolder next = it.next();
                this.f114104f.add(next);
                final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.p2082ss.android.ugc.aweme.feed.guide.C49596j.C496004 */

                    static {
                        Covode.recordClassIndex(58446);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        View view = next.itemView;
                        Float f = (Float) valueAnimator.getAnimatedValue();
                        view.setAlpha(1.0f - f.floatValue());
                        view.setScaleX(1.0f - (f.floatValue() * 0.5f));
                        view.setScaleY(1.0f - (f.floatValue() * 0.5f));
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    /* class com.p2082ss.android.ugc.aweme.feed.guide.C49596j.C496015 */

                    static {
                        Covode.recordClassIndex(58447);
                    }

                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationEnd(Animator animator) {
                        ofFloat.removeAllListeners();
                        C49596j.this.mo4674f(next);
                        C49596j.this.f114104f.remove(next);
                        C49596j.this.mo81385c();
                    }
                });
                ofFloat.start();
            }
            this.f114107p.clear();
            if (z2) {
                final ArrayList<C49607b> arrayList = new ArrayList<>();
                arrayList.addAll(this.f114109r);
                this.f114100b.add(arrayList);
                this.f114109r.clear();
                RunnableC495971 r3 = new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.feed.guide.C49596j.RunnableC495971 */

                    static {
                        Covode.recordClassIndex(58443);
                    }

                    public final void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C49596j jVar = C49596j.this;
                            RecyclerView.ViewHolder viewHolder = ((C49607b) it.next()).f114143a;
                            jVar.f114103e.add(viewHolder);
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            float translationX = viewHolder.itemView.getTranslationX();
                            ofFloat.setDuration(400L);
                            ofFloat.addUpdateListener(new C49608k(jVar, viewHolder, translationX));
                            ofFloat.addListener(new AnimatorListenerAdapter(viewHolder, ofFloat) {
                                /* class com.p2082ss.android.ugc.aweme.feed.guide.C49596j.C496037 */

                                /* renamed from: a */
                                final /* synthetic */ RecyclerView.ViewHolder f114126a;

                                /* renamed from: b */
                                final /* synthetic */ ValueAnimator f114127b;

                                static {
                                    Covode.recordClassIndex(58449);
                                }

                                public final void onAnimationStart(Animator animator) {
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    this.f114127b.removeAllListeners();
                                    C49596j.this.mo4674f(this.f114126a);
                                    C49596j.this.f114103e.remove(this.f114126a);
                                    C49596j.this.mo81385c();
                                }

                                {
                                    this.f114126a = r2;
                                    this.f114127b = r3;
                                }
                            });
                            ofFloat.setStartDelay(100);
                            ofFloat.start();
                        }
                        arrayList.clear();
                        C49596j.this.f114100b.remove(arrayList);
                    }
                };
                if (z) {
                    C0792v.m2751a(arrayList.get(0).f114143a.itemView, r3, this.f4468j);
                } else {
                    r3.run();
                }
            }
            if (z3) {
                final ArrayList<C49606a> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f114110s);
                this.f114101c.add(arrayList2);
                this.f114110s.clear();
                RunnableC495982 r32 = new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.feed.guide.C49596j.RunnableC495982 */

                    static {
                        Covode.recordClassIndex(58444);
                    }

                    public final void run() {
                        View view;
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C49606a aVar = (C49606a) it.next();
                            C49596j jVar = C49596j.this;
                            RecyclerView.ViewHolder viewHolder = aVar.f114137a;
                            View view2 = null;
                            if (viewHolder == null) {
                                view = null;
                            } else {
                                view = viewHolder.itemView;
                            }
                            RecyclerView.ViewHolder viewHolder2 = aVar.f114138b;
                            if (viewHolder2 != null) {
                                view2 = viewHolder2.itemView;
                            }
                            if (view != null) {
                                ViewPropertyAnimator duration = view.animate().setDuration(jVar.f4470l);
                                jVar.f114105g.add(aVar.f114137a);
                                duration.translationX((float) (aVar.f114141e - aVar.f114139c));
                                duration.translationY((float) (aVar.f114142f - aVar.f114140d));
                                duration.alpha(0.0f).setListener(new AnimatorListenerAdapter(aVar, duration, view) {
                                    /* class com.p2082ss.android.ugc.aweme.feed.guide.C49596j.C496048 */

                                    /* renamed from: a */
                                    final /* synthetic */ C49606a f114129a;

                                    /* renamed from: b */
                                    final /* synthetic */ ViewPropertyAnimator f114130b;

                                    /* renamed from: c */
                                    final /* synthetic */ View f114131c;

                                    static {
                                        Covode.recordClassIndex(58450);
                                    }

                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        this.f114130b.setListener(null);
                                        this.f114131c.setAlpha(1.0f);
                                        this.f114131c.setTranslationX(0.0f);
                                        this.f114131c.setTranslationY(0.0f);
                                        C49596j.this.mo4674f(this.f114129a.f114137a);
                                        C49596j.this.f114105g.remove(this.f114129a.f114137a);
                                        C49596j.this.mo81385c();
                                    }

                                    {
                                        this.f114129a = r2;
                                        this.f114130b = r3;
                                        this.f114131c = r4;
                                    }
                                }).start();
                            }
                            if (view2 != null) {
                                ViewPropertyAnimator animate = view2.animate();
                                jVar.f114105g.add(aVar.f114138b);
                                animate.translationX(0.0f).translationY(0.0f).setDuration(jVar.f4470l).alpha(1.0f).setListener(new AnimatorListenerAdapter(aVar, animate, view2) {
                                    /* class com.p2082ss.android.ugc.aweme.feed.guide.C49596j.C496059 */

                                    /* renamed from: a */
                                    final /* synthetic */ C49606a f114133a;

                                    /* renamed from: b */
                                    final /* synthetic */ ViewPropertyAnimator f114134b;

                                    /* renamed from: c */
                                    final /* synthetic */ View f114135c;

                                    static {
                                        Covode.recordClassIndex(58451);
                                    }

                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        this.f114134b.setListener(null);
                                        this.f114135c.setAlpha(1.0f);
                                        this.f114135c.setTranslationX(0.0f);
                                        this.f114135c.setTranslationY(0.0f);
                                        C49596j.this.mo4674f(this.f114133a.f114138b);
                                        C49596j.this.f114105g.remove(this.f114133a.f114138b);
                                        C49596j.this.mo81385c();
                                    }

                                    {
                                        this.f114133a = r2;
                                        this.f114134b = r3;
                                        this.f114135c = r4;
                                    }
                                }).start();
                            }
                        }
                        arrayList2.clear();
                        C49596j.this.f114101c.remove(arrayList2);
                    }
                };
                if (z) {
                    C0792v.m2751a(arrayList2.get(0).f114137a.itemView, r32, this.f4468j);
                } else {
                    r32.run();
                }
            }
            if (z4) {
                final ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f114108q);
                this.f114099a.add(arrayList3);
                this.f114108q.clear();
                RunnableC495993 r6 = new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.feed.guide.C49596j.RunnableC495993 */

                    static {
                        Covode.recordClassIndex(58445);
                    }

                    public final void run() {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) it.next();
                            C49596j jVar = C49596j.this;
                            View view = viewHolder.itemView;
                            ViewPropertyAnimator animate = view.animate();
                            jVar.f114102d.add(viewHolder);
                            animate.translationX(0.0f).setDuration(300).setListener(new AnimatorListenerAdapter(viewHolder, view, animate) {
                                /* class com.p2082ss.android.ugc.aweme.feed.guide.C49596j.C496026 */

                                /* renamed from: a */
                                final /* synthetic */ RecyclerView.ViewHolder f114122a;

                                /* renamed from: b */
                                final /* synthetic */ View f114123b;

                                /* renamed from: c */
                                final /* synthetic */ ViewPropertyAnimator f114124c;

                                static {
                                    Covode.recordClassIndex(58448);
                                }

                                public final void onAnimationStart(Animator animator) {
                                }

                                public final void onAnimationCancel(Animator animator) {
                                    this.f114123b.setTranslationX(0.0f);
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    this.f114124c.setListener(null);
                                    C49596j.this.mo4674f(this.f114122a);
                                    C49596j.this.f114102d.remove(this.f114122a);
                                    C49596j.this.mo81385c();
                                }

                                {
                                    this.f114122a = r2;
                                    this.f114123b = r3;
                                    this.f114124c = r4;
                                }
                            }).start();
                        }
                        arrayList3.clear();
                        C49596j.this.f114099a.remove(arrayList3);
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

    @Override // androidx.recyclerview.widget.AbstractC1391ab
    /* renamed from: a */
    public final boolean mo4850a(RecyclerView.ViewHolder viewHolder) {
        m93018h(viewHolder);
        this.f114107p.add(viewHolder);
        return true;
    }

    /* renamed from: h */
    private void m93018h(RecyclerView.ViewHolder viewHolder) {
        if (f114098o == null) {
            f114098o = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(f114098o);
        mo4670c(viewHolder);
    }

    /* renamed from: a */
    private void m93014a(C49606a aVar) {
        if (aVar.f114137a != null) {
            m93017a(aVar, aVar.f114137a);
        }
        if (aVar.f114138b != null) {
            m93017a(aVar, aVar.f114138b);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1391ab
    /* renamed from: b */
    public final boolean mo4853b(RecyclerView.ViewHolder viewHolder) {
        m93018h(viewHolder);
        viewHolder.itemView.setAlpha(0.34f);
        if (viewHolder.getAdapterPosition() > ((GalleryLayoutManager) this.f114106n.getLayoutManager()).f114053b) {
            viewHolder.itemView.setTranslationX((float) this.f114106n.getWidth());
        } else {
            viewHolder.itemView.setTranslationX((float) (-this.f114106n.getWidth()));
        }
        this.f114108q.add(viewHolder);
        return true;
    }

    public C49596j(RecyclerView recyclerView) {
        this.f114106n = recyclerView;
    }

    /* renamed from: a */
    private static void m93015a(List<RecyclerView.ViewHolder> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: c */
    public final void mo4670c(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        for (int size = this.f114109r.size() - 1; size >= 0; size--) {
            if (this.f114109r.get(size).f114143a == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo4674f(viewHolder);
                this.f114109r.remove(size);
            }
        }
        m93016a(this.f114110s, viewHolder);
        if (this.f114107p.remove(viewHolder)) {
            view.setAlpha(1.0f);
            mo4674f(viewHolder);
        }
        if (this.f114108q.remove(viewHolder)) {
            view.setAlpha(1.0f);
            mo4674f(viewHolder);
        }
        for (int size2 = this.f114101c.size() - 1; size2 >= 0; size2--) {
            ArrayList<C49606a> arrayList = this.f114101c.get(size2);
            m93016a(arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.f114101c.remove(size2);
            }
        }
        for (int size3 = this.f114100b.size() - 1; size3 >= 0; size3--) {
            ArrayList<C49607b> arrayList2 = this.f114100b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f114143a == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo4674f(viewHolder);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f114100b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f114099a.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.ViewHolder> arrayList3 = this.f114099a.get(size5);
            if (arrayList3.remove(viewHolder)) {
                view.setAlpha(1.0f);
                mo4674f(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.f114099a.remove(size5);
                }
            }
        }
        this.f114104f.remove(viewHolder);
        this.f114102d.remove(viewHolder);
        this.f114105g.remove(viewHolder);
        this.f114103e.remove(viewHolder);
        mo81385c();
    }

    /* renamed from: a */
    static float m93013a(RecyclerView.ViewHolder viewHolder, float f) {
        if (viewHolder.itemView.getContext() != null) {
            return C13628n.m24520b(viewHolder.itemView.getContext(), f);
        }
        return 12.0f;
    }

    /* renamed from: a */
    private void m93016a(List<C49606a> list, RecyclerView.ViewHolder viewHolder) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C49606a aVar = list.get(size);
            if (m93017a(aVar, viewHolder) && aVar.f114137a == null && aVar.f114138b == null) {
                list.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m93017a(C49606a aVar, RecyclerView.ViewHolder viewHolder) {
        if (aVar.f114138b == viewHolder) {
            aVar.f114138b = null;
        } else if (aVar.f114137a != viewHolder) {
            return false;
        } else {
            aVar.f114137a = null;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        mo4674f(viewHolder);
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.j$b */
    static class C49607b {

        /* renamed from: a */
        public RecyclerView.ViewHolder f114143a;

        /* renamed from: b */
        public int f114144b;

        /* renamed from: c */
        public int f114145c;

        /* renamed from: d */
        public int f114146d;

        /* renamed from: e */
        public int f114147e;

        static {
            Covode.recordClassIndex(58453);
        }

        C49607b(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.f114143a = viewHolder;
            this.f114144b = i;
            this.f114145c = i2;
            this.f114146d = i3;
            this.f114147e = i4;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1391ab
    /* renamed from: a */
    public final boolean mo4851a(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        int i5 = i - i3;
        viewHolder.itemView.setTranslationX((float) i5);
        viewHolder.itemView.setAlpha(0.34f);
        viewHolder.itemView.setScaleX(0.9f);
        viewHolder.itemView.setScaleY(0.9f);
        viewHolder.itemView.setTranslationY(m93013a(viewHolder, 12.0f));
        if (Math.abs(i5) < viewHolder.itemView.getWidth() / 2) {
            return true;
        }
        this.f114109r.add(new C49607b(viewHolder, i, i2, i3, i4));
        return true;
    }
}
