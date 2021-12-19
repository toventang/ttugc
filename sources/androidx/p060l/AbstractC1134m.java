package androidx.p060l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.p037h.C0792v;
import androidx.p025c.C0484a;
import androidx.p025c.C0489d;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.l.m */
public abstract class AbstractC1134m implements Cloneable {

    /* renamed from: C */
    private static ThreadLocal<C0484a<Animator, C1138a>> f3837C = new ThreadLocal<>();

    /* renamed from: a */
    private static final int[] f3838a = {2, 1, 3, 4};

    /* renamed from: p */
    private static final AbstractC1119g f3839p = new AbstractC1119g() {
        /* class androidx.p060l.AbstractC1134m.C11351 */

        static {
            Covode.recordClassIndex(1228);
        }

        @Override // androidx.p060l.AbstractC1119g
        /* renamed from: a */
        public final Path mo3898a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };

    /* renamed from: A */
    private ArrayList<C1150s> f3840A;

    /* renamed from: B */
    private ArrayList<C1150s> f3841B;

    /* renamed from: D */
    private ViewGroup f3842D = null;

    /* renamed from: E */
    private int f3843E = 0;

    /* renamed from: F */
    private boolean f3844F = false;

    /* renamed from: G */
    private boolean f3845G = false;

    /* renamed from: H */
    private ArrayList<AbstractC1140c> f3846H = null;

    /* renamed from: I */
    private ArrayList<Animator> f3847I = new ArrayList<>();

    /* renamed from: J */
    private C0484a<String, String> f3848J;

    /* renamed from: b */
    public String f3849b = getClass().getName();

    /* renamed from: c */
    public long f3850c = -1;

    /* renamed from: d */
    public long f3851d = -1;

    /* renamed from: e */
    public TimeInterpolator f3852e = null;

    /* renamed from: f */
    public ArrayList<Integer> f3853f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<View> f3854g = new ArrayList<>();

    /* renamed from: h */
    public ArrayList<String> f3855h = null;

    /* renamed from: i */
    public ArrayList<Class> f3856i = null;

    /* renamed from: j */
    C1146q f3857j = null;

    /* renamed from: k */
    boolean f3858k = false;

    /* renamed from: l */
    ArrayList<Animator> f3859l = new ArrayList<>();

    /* renamed from: m */
    public AbstractC1145p f3860m;

    /* renamed from: n */
    public AbstractC1139b f3861n;

    /* renamed from: o */
    public AbstractC1119g f3862o = f3839p;

    /* renamed from: q */
    private ArrayList<Integer> f3863q = null;

    /* renamed from: r */
    private ArrayList<View> f3864r = null;

    /* renamed from: s */
    private ArrayList<Class> f3865s = null;

    /* renamed from: t */
    private ArrayList<String> f3866t = null;

    /* renamed from: u */
    private ArrayList<Integer> f3867u = null;

    /* renamed from: v */
    private ArrayList<View> f3868v = null;

    /* renamed from: w */
    private ArrayList<Class> f3869w = null;

    /* renamed from: x */
    private C1151t f3870x = new C1151t();

    /* renamed from: y */
    private C1151t f3871y = new C1151t();

    /* renamed from: z */
    private int[] f3872z = f3838a;

    /* renamed from: androidx.l.m$b */
    public static abstract class AbstractC1139b {
        static {
            Covode.recordClassIndex(1232);
        }

        /* renamed from: a */
        public abstract Rect mo3897a();
    }

    /* renamed from: androidx.l.m$c */
    public interface AbstractC1140c {
        static {
            Covode.recordClassIndex(1233);
        }

        /* renamed from: a */
        void mo3865a(AbstractC1134m mVar);

        /* renamed from: b */
        void mo3866b(AbstractC1134m mVar);

        /* renamed from: c */
        void mo3867c(AbstractC1134m mVar);

        /* renamed from: d */
        void mo3868d(AbstractC1134m mVar);
    }

    /* renamed from: a */
    public Animator mo3858a(ViewGroup viewGroup, C1150s sVar, C1150s sVar2) {
        return null;
    }

    /* renamed from: a */
    public abstract void mo3859a(C1150s sVar);

    /* renamed from: a */
    public String[] mo3861a() {
        return null;
    }

    /* renamed from: b */
    public abstract void mo3862b(C1150s sVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3912a(ViewGroup viewGroup, C1151t tVar, C1151t tVar2, ArrayList<C1150s> arrayList, ArrayList<C1150s> arrayList2) {
        C1150s sVar;
        View view;
        C0484a<Animator, C1138a> f = m3751f();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C1150s sVar2 = arrayList.get(i);
            C1150s sVar3 = arrayList2.get(i);
            if (sVar2 != null && !sVar2.f3901c.contains(this)) {
                sVar2 = null;
            }
            if (sVar3 != null && !sVar3.f3901c.contains(this)) {
                sVar3 = null;
            }
            if (sVar2 == null) {
                if (sVar3 == null) {
                }
            } else if (sVar3 != null && !mo3860a(sVar2, sVar3)) {
            }
            Animator a = mo3858a(viewGroup, sVar2, sVar3);
            if (a != null) {
                if (sVar3 != null) {
                    view = sVar3.f3900b;
                    String[] a2 = mo3861a();
                    if (view == null || a2 == null || a2.length <= 0) {
                        sVar = null;
                    } else {
                        sVar = new C1150s();
                        sVar.f3900b = view;
                        C1150s sVar4 = tVar2.f3902a.get(view);
                        if (sVar4 != null) {
                            for (int i2 = 0; i2 < a2.length; i2++) {
                                sVar.f3899a.put(a2[i2], sVar4.f3899a.get(a2[i2]));
                            }
                        }
                        int size2 = f.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size2) {
                                break;
                            }
                            C1138a aVar = f.get(f.mo2162b(i3));
                            if (aVar.f3878c != null && aVar.f3876a == view && aVar.f3877b.equals(this.f3849b) && aVar.f3878c.equals(sVar)) {
                                break;
                            }
                            i3++;
                        }
                    }
                } else {
                    view = sVar2.f3900b;
                    sVar = null;
                }
                AbstractC1145p pVar = this.f3860m;
                if (pVar != null) {
                    long a3 = pVar.mo3902a(viewGroup, this, sVar2, sVar3);
                    sparseIntArray.put(this.f3847I.size(), (int) a3);
                    j = Math.min(a3, j);
                }
                f.put(a, new C1138a(view, this.f3849b, this, C1082ae.m3649b(viewGroup), sVar));
                this.f3847I.add(a);
            }
        }
        if (j != 0) {
            for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
                Animator animator = this.f3847I.get(sparseIntArray.keyAt(i4));
                animator.setStartDelay((((long) sparseIntArray.valueAt(i4)) - j) + animator.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo3918a(View view) {
        ArrayList<Class> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f3863q;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f3864r;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class> arrayList5 = this.f3865s;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f3865s.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (!(this.f3866t == null || C0792v.m2778l(view) == null || !this.f3866t.contains(C0792v.m2778l(view)))) {
            return false;
        }
        if ((this.f3853f.size() == 0 && this.f3854g.size() == 0 && (((arrayList = this.f3856i) == null || arrayList.isEmpty()) && ((arrayList2 = this.f3855h) == null || arrayList2.isEmpty()))) || this.f3853f.contains(Integer.valueOf(id)) || this.f3854g.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f3855h;
        if (arrayList6 != null && arrayList6.contains(C0792v.m2778l(view))) {
            return true;
        }
        if (this.f3856i != null) {
            for (int i2 = 0; i2 < this.f3856i.size(); i2++) {
                if (this.f3856i.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3913a(ViewGroup viewGroup, boolean z) {
        C0484a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class> arrayList2;
        mo3917a(z);
        if ((this.f3853f.size() > 0 || this.f3854g.size() > 0) && (((arrayList = this.f3855h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f3856i) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f3853f.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f3853f.get(i).intValue());
                if (findViewById != null) {
                    C1150s sVar = new C1150s();
                    sVar.f3900b = findViewById;
                    if (z) {
                        mo3859a(sVar);
                    } else {
                        mo3862b(sVar);
                    }
                    sVar.f3901c.add(this);
                    mo3927c(sVar);
                    if (z) {
                        m3747a(this.f3870x, findViewById, sVar);
                    } else {
                        m3747a(this.f3871y, findViewById, sVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f3854g.size(); i2++) {
                View view = this.f3854g.get(i2);
                C1150s sVar2 = new C1150s();
                sVar2.f3900b = view;
                if (z) {
                    mo3859a(sVar2);
                } else {
                    mo3862b(sVar2);
                }
                sVar2.f3901c.add(this);
                mo3927c(sVar2);
                if (z) {
                    m3747a(this.f3870x, view, sVar2);
                } else {
                    m3747a(this.f3871y, view, sVar2);
                }
            }
        } else {
            m3750c(viewGroup, z);
        }
        if (!(z || (aVar = this.f3848J) == null)) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f3870x.f3905d.remove(this.f3848J.mo2162b(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = arrayList3.get(i4);
                if (obj != null) {
                    this.f3870x.f3905d.put(this.f3848J.mo2163c(i4), obj);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3917a(boolean z) {
        if (z) {
            this.f3870x.f3902a.clear();
            this.f3870x.f3903b.clear();
            this.f3870x.f3904c.mo2086c();
            return;
        }
        this.f3871y.f3902a.clear();
        this.f3871y.f3903b.clear();
        this.f3871y.f3904c.mo2086c();
    }

    /* renamed from: a */
    public boolean mo3860a(C1150s sVar, C1150s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] a = mo3861a();
        if (a != null) {
            for (String str : a) {
                if (!m3749a(sVar, sVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : sVar.f3899a.keySet()) {
            if (m3749a(sVar, sVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: a */
    public void mo3914a(AbstractC1119g gVar) {
        if (gVar == null) {
            this.f3862o = f3839p;
        } else {
            this.f3862o = gVar;
        }
    }

    /* renamed from: a */
    public void mo3915a(AbstractC1139b bVar) {
        this.f3861n = bVar;
    }

    /* renamed from: a */
    public void mo3916a(AbstractC1145p pVar) {
        this.f3860m = pVar;
    }

    public String toString() {
        return mo3910a("");
    }

    /* renamed from: f */
    private static C0484a<Animator, C1138a> m3751f() {
        C0484a<Animator, C1138a> aVar = f3837C.get();
        if (aVar != null) {
            return aVar;
        }
        C0484a<Animator, C1138a> aVar2 = new C0484a<>();
        f3837C.set(aVar2);
        return aVar2;
    }

    static {
        Covode.recordClassIndex(1227);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo3926c() {
        if (this.f3843E == 0) {
            ArrayList<AbstractC1140c> arrayList = this.f3846H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3846H.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC1140c) arrayList2.get(i)).mo3868d(this);
                }
            }
            this.f3845G = false;
        }
        this.f3843E++;
    }

    /* renamed from: e */
    public AbstractC1134m clone() {
        try {
            AbstractC1134m mVar = (AbstractC1134m) super.clone();
            mVar.f3847I = new ArrayList<>();
            mVar.f3870x = new C1151t();
            mVar.f3871y = new C1151t();
            mVar.f3840A = null;
            mVar.f3841B = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3924b() {
        mo3926c();
        final C0484a<Animator, C1138a> f = m3751f();
        Iterator<Animator> it = this.f3847I.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (f.containsKey(next)) {
                mo3926c();
                if (next != null) {
                    next.addListener(new AnimatorListenerAdapter() {
                        /* class androidx.p060l.AbstractC1134m.C11362 */

                        static {
                            Covode.recordClassIndex(1229);
                        }

                        public final void onAnimationStart(Animator animator) {
                            AbstractC1134m.this.f3859l.add(animator);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            f.remove(animator);
                            AbstractC1134m.this.f3859l.remove(animator);
                        }
                    });
                    long j = this.f3851d;
                    if (j >= 0) {
                        next.setDuration(j);
                    }
                    long j2 = this.f3850c;
                    if (j2 >= 0) {
                        next.setStartDelay(j2);
                    }
                    TimeInterpolator timeInterpolator = this.f3852e;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new AnimatorListenerAdapter() {
                        /* class androidx.p060l.AbstractC1134m.C11373 */

                        static {
                            Covode.recordClassIndex(1230);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            AbstractC1134m.this.mo3929d();
                            animator.removeListener(this);
                        }
                    });
                    next.start();
                }
            }
        }
        this.f3847I.clear();
        mo3929d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo3929d() {
        int i = this.f3843E - 1;
        this.f3843E = i;
        if (i == 0) {
            ArrayList<AbstractC1140c> arrayList = this.f3846H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3846H.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC1140c) arrayList2.get(i2)).mo3865a(this);
                }
            }
            for (int i3 = 0; i3 < this.f3870x.f3904c.mo2080b(); i3++) {
                View c = this.f3870x.f3904c.mo2085c(i3);
                if (c != null) {
                    C0792v.m2753a(c, false);
                }
            }
            for (int i4 = 0; i4 < this.f3871y.f3904c.mo2080b(); i4++) {
                View c2 = this.f3871y.f3904c.mo2085c(i4);
                if (c2 != null) {
                    C0792v.m2753a(c2, false);
                }
            }
            this.f3845G = true;
        }
    }

    /* renamed from: b */
    public AbstractC1134m mo3920b(long j) {
        this.f3850c = j;
        return this;
    }

    /* renamed from: a */
    public AbstractC1134m mo3906a(long j) {
        this.f3851d = j;
        return this;
    }

    /* renamed from: b */
    public AbstractC1134m mo3921b(View view) {
        this.f3854g.add(view);
        return this;
    }

    /* renamed from: c */
    public AbstractC1134m mo3925c(View view) {
        this.f3854g.remove(view);
        return this;
    }

    /* renamed from: a */
    public AbstractC1134m mo3907a(TimeInterpolator timeInterpolator) {
        this.f3852e = timeInterpolator;
        return this;
    }

    /* renamed from: b */
    public AbstractC1134m mo3919b(int i) {
        if (i != 0) {
            this.f3853f.add(Integer.valueOf(i));
        }
        return this;
    }

    /* renamed from: b */
    public AbstractC1134m mo3922b(AbstractC1140c cVar) {
        ArrayList<AbstractC1140c> arrayList = this.f3846H;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(cVar);
        if (this.f3846H.size() == 0) {
            this.f3846H = null;
        }
        return this;
    }

    /* renamed from: a */
    public AbstractC1134m mo3908a(AbstractC1140c cVar) {
        if (this.f3846H == null) {
            this.f3846H = new ArrayList<>();
        }
        this.f3846H.add(cVar);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3927c(C1150s sVar) {
        String[] a;
        if (!(this.f3860m == null || sVar.f3899a.isEmpty() || (a = this.f3860m.mo3874a()) == null)) {
            for (String str : a) {
                if (!sVar.f3899a.containsKey(str)) {
                    this.f3860m.mo3873a(sVar);
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public void mo3932e(View view) {
        if (this.f3844F) {
            if (!this.f3845G) {
                C0484a<Animator, C1138a> f = m3751f();
                int size = f.size();
                AbstractC1096an b = C1082ae.m3649b(view);
                for (int i = size - 1; i >= 0; i--) {
                    C1138a c = f.mo2163c(i);
                    if (c.f3876a != null && b.equals(c.f3879d)) {
                        int i2 = Build.VERSION.SDK_INT;
                        f.mo2162b(i).resume();
                    }
                }
                ArrayList<AbstractC1140c> arrayList = this.f3846H;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f3846H.clone();
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((AbstractC1140c) arrayList2.get(i3)).mo3867c(this);
                    }
                }
            }
            this.f3844F = false;
        }
    }

    /* renamed from: d */
    public void mo3930d(View view) {
        int i;
        if (!this.f3845G) {
            C0484a<Animator, C1138a> f = m3751f();
            int size = f.size();
            AbstractC1096an b = C1082ae.m3649b(view);
            int i2 = size - 1;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                C1138a c = f.mo2163c(i2);
                if (c.f3876a != null && b.equals(c.f3879d)) {
                    int i3 = Build.VERSION.SDK_INT;
                    f.mo2162b(i2).pause();
                }
                i2--;
            }
            ArrayList<AbstractC1140c> arrayList = this.f3846H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3846H.clone();
                int size2 = arrayList2.size();
                for (i = 0; i < size2; i++) {
                    ((AbstractC1140c) arrayList2.get(i)).mo3866b(this);
                }
            }
            this.f3844F = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo3910a(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f3851d != -1) {
            str2 = str2 + "dur(" + this.f3851d + ") ";
        }
        if (this.f3850c != -1) {
            str2 = str2 + "dly(" + this.f3850c + ") ";
        }
        if (this.f3852e != null) {
            str2 = str2 + "interp(" + this.f3852e + ") ";
        }
        if (this.f3853f.size() <= 0 && this.f3854g.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f3853f.size() > 0) {
            for (int i = 0; i < this.f3853f.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f3853f.get(i);
            }
        }
        if (this.f3854g.size() > 0) {
            for (int i2 = 0; i2 < this.f3854g.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f3854g.get(i2);
            }
        }
        return str3 + ")";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3911a(ViewGroup viewGroup) {
        C1138a aVar;
        this.f3840A = new ArrayList<>();
        this.f3841B = new ArrayList<>();
        m3748a(this.f3870x, this.f3871y);
        C0484a<Animator, C1138a> f = m3751f();
        int size = f.size();
        AbstractC1096an b = C1082ae.m3649b(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator b2 = f.mo2162b(i);
            if (!(b2 == null || (aVar = f.get(b2)) == null || aVar.f3876a == null || !b.equals(aVar.f3879d))) {
                C1150s sVar = aVar.f3878c;
                View view = aVar.f3876a;
                C1150s a = mo3909a(view, true);
                C1150s b3 = mo3923b(view, true);
                if (!(a == null && b3 == null) && aVar.f3880e.mo3860a(sVar, b3)) {
                    if (b2.isRunning() || b2.isStarted()) {
                        b2.cancel();
                    } else {
                        f.remove(b2);
                    }
                }
            }
        }
        mo3912a(viewGroup, this.f3870x, this.f3871y, this.f3840A, this.f3841B);
        mo3924b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C1150s mo3923b(View view, boolean z) {
        ArrayList<C1150s> arrayList;
        ArrayList<C1150s> arrayList2;
        C1146q qVar = this;
        while (true) {
            C1146q qVar2 = qVar.f3857j;
            if (qVar2 == null) {
                break;
            }
            qVar = qVar2;
        }
        if (z) {
            arrayList = qVar.f3840A;
        } else {
            arrayList = qVar.f3841B;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1150s sVar = arrayList.get(i);
            if (sVar == null) {
                return null;
            }
            if (sVar.f3900b == view) {
                if (i < 0) {
                    return null;
                } else {
                    if (z) {
                        arrayList2 = qVar.f3841B;
                    } else {
                        arrayList2 = qVar.f3840A;
                    }
                    return arrayList2.get(i);
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m3750c(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f3863q;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f3864r;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class> arrayList3 = this.f3865s;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        for (int i = 0; i < size; i++) {
                            if (this.f3865s.get(i).isInstance(view)) {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C1150s sVar = new C1150s();
                        sVar.f3900b = view;
                        if (z) {
                            mo3859a(sVar);
                        } else {
                            mo3862b(sVar);
                        }
                        sVar.f3901c.add(this);
                        mo3927c(sVar);
                        if (z) {
                            m3747a(this.f3870x, view, sVar);
                        } else {
                            m3747a(this.f3871y, view, sVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f3867u;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f3868v;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class> arrayList6 = this.f3869w;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        if (this.f3869w.get(i2).isInstance(view)) {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m3750c(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final C1150s mo3909a(View view, boolean z) {
        C1151t tVar;
        C1146q qVar = this;
        while (true) {
            C1146q qVar2 = qVar.f3857j;
            if (qVar2 == null) {
                break;
            }
            qVar = qVar2;
        }
        if (z) {
            tVar = qVar.f3870x;
        } else {
            tVar = qVar.f3871y;
        }
        return tVar.f3902a.get(view);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: java.util.ArrayList<androidx.l.s> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: java.util.ArrayList<androidx.l.s> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: java.util.ArrayList<androidx.l.s> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: java.util.ArrayList<androidx.l.s> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v31, resolved type: java.util.ArrayList<androidx.l.s> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v36, resolved type: java.util.ArrayList<androidx.l.s> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v37, resolved type: java.util.ArrayList<androidx.l.s> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m3748a(C1151t tVar, C1151t tVar2) {
        C1150s sVar;
        View view;
        View view2;
        View a;
        C0484a aVar = new C0484a(tVar.f3902a);
        C0484a aVar2 = new C0484a(tVar2.f3902a);
        int i = 0;
        while (true) {
            int[] iArr = this.f3872z;
            if (i >= iArr.length) {
                break;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                for (int size = aVar.size() - 1; size >= 0; size--) {
                    View view3 = (View) aVar.mo2162b(size);
                    if (!(view3 == null || !mo3918a(view3) || (sVar = (C1150s) aVar2.remove(view3)) == null || sVar.f3900b == null || !mo3918a(sVar.f3900b))) {
                        this.f3840A.add(aVar.mo2167d(size));
                        this.f3841B.add(sVar);
                    }
                }
            } else if (i2 == 2) {
                C0484a<String, View> aVar3 = tVar.f3905d;
                C0484a<String, View> aVar4 = tVar2.f3905d;
                int size2 = aVar3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    View c = aVar3.mo2163c(i3);
                    if (c != null && mo3918a(c) && (view = aVar4.get(aVar3.mo2162b(i3))) != null && mo3918a(view)) {
                        Object obj = aVar.get(c);
                        Object obj2 = aVar2.get(view);
                        if (!(obj == null || obj2 == null)) {
                            this.f3840A.add(obj);
                            this.f3841B.add(obj2);
                            aVar.remove(c);
                            aVar2.remove(view);
                        }
                    }
                }
            } else if (i2 == 3) {
                SparseArray<View> sparseArray = tVar.f3903b;
                SparseArray<View> sparseArray2 = tVar2.f3903b;
                int size3 = sparseArray.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    View valueAt = sparseArray.valueAt(i4);
                    if (valueAt != null && mo3918a(valueAt) && (view2 = sparseArray2.get(sparseArray.keyAt(i4))) != null && mo3918a(view2)) {
                        Object obj3 = aVar.get(valueAt);
                        Object obj4 = aVar2.get(view2);
                        if (!(obj3 == null || obj4 == null)) {
                            this.f3840A.add(obj3);
                            this.f3841B.add(obj4);
                            aVar.remove(valueAt);
                            aVar2.remove(view2);
                        }
                    }
                }
            } else if (i2 == 4) {
                C0489d<View> dVar = tVar.f3904c;
                C0489d<View> dVar2 = tVar2.f3904c;
                int b = dVar.mo2080b();
                for (int i5 = 0; i5 < b; i5++) {
                    View c2 = dVar.mo2085c(i5);
                    if (c2 != null && mo3918a(c2) && (a = dVar2.mo2078a(dVar.mo2081b(i5), null)) != null && mo3918a(a)) {
                        Object obj5 = aVar.get(c2);
                        Object obj6 = aVar2.get(a);
                        if (!(obj5 == null || obj6 == null)) {
                            this.f3840A.add(obj5);
                            this.f3841B.add(obj6);
                            aVar.remove(c2);
                            aVar2.remove(a);
                        }
                    }
                }
            }
            i++;
        }
        for (int i6 = 0; i6 < aVar.size(); i6++) {
            C1150s sVar2 = (C1150s) aVar.mo2163c(i6);
            if (mo3918a(sVar2.f3900b)) {
                this.f3840A.add(sVar2);
                this.f3841B.add(null);
            }
        }
        for (int i7 = 0; i7 < aVar2.size(); i7++) {
            C1150s sVar3 = (C1150s) aVar2.mo2163c(i7);
            if (mo3918a(sVar3.f3900b)) {
                this.f3841B.add(sVar3);
                this.f3840A.add(null);
            }
        }
    }

    /* renamed from: a */
    private static boolean m3749a(C1150s sVar, C1150s sVar2, String str) {
        Object obj = sVar.f3899a.get(str);
        Object obj2 = sVar2.f3899a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null || !obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m3747a(C1151t tVar, View view, C1150s sVar) {
        tVar.f3902a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f3903b.indexOfKey(id) >= 0) {
                tVar.f3903b.put(id, null);
            } else {
                tVar.f3903b.put(id, view);
            }
        }
        String l = C0792v.m2778l(view);
        if (l != null) {
            if (tVar.f3905d.containsKey(l)) {
                tVar.f3905d.put(l, null);
            } else {
                tVar.f3905d.put(l, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f3904c.mo2084c(itemIdAtPosition) >= 0) {
                    View a = tVar.f3904c.mo2078a(itemIdAtPosition, null);
                    if (a != null) {
                        C0792v.m2753a(a, false);
                        tVar.f3904c.mo2083b(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C0792v.m2753a(view, true);
                tVar.f3904c.mo2083b(itemIdAtPosition, view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.l.m$a */
    public static class C1138a {

        /* renamed from: a */
        View f3876a;

        /* renamed from: b */
        String f3877b;

        /* renamed from: c */
        C1150s f3878c;

        /* renamed from: d */
        AbstractC1096an f3879d;

        /* renamed from: e */
        AbstractC1134m f3880e;

        static {
            Covode.recordClassIndex(1231);
        }

        C1138a(View view, String str, AbstractC1134m mVar, AbstractC1096an anVar, C1150s sVar) {
            this.f3876a = view;
            this.f3877b = str;
            this.f3878c = sVar;
            this.f3879d = anVar;
            this.f3880e = mVar;
        }
    }
}
