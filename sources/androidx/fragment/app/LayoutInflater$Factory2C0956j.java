package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.core.p036g.C0689b;
import androidx.core.p036g.C0690c;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1182af;
import androidx.p025c.C0486b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.fragment.app.j */
public final class LayoutInflater$Factory2C0956j extends AbstractC0952i implements LayoutInflater.Factory2 {

    /* renamed from: F */
    static final Interpolator f3386F = new DecelerateInterpolator(2.5f);

    /* renamed from: G */
    static final Interpolator f3387G = new DecelerateInterpolator(1.5f);

    /* renamed from: H */
    static final Interpolator f3388H = new AccelerateInterpolator(2.5f);

    /* renamed from: I */
    static final Interpolator f3389I = new AccelerateInterpolator(1.5f);

    /* renamed from: a */
    static boolean f3390a;

    /* renamed from: q */
    static Field f3391q;

    /* renamed from: A */
    Bundle f3392A = null;

    /* renamed from: B */
    SparseArray<Parcelable> f3393B = null;

    /* renamed from: C */
    ArrayList<C0972j> f3394C;

    /* renamed from: D */
    C0973k f3395D;

    /* renamed from: E */
    Runnable f3396E = new Runnable() {
        /* class androidx.fragment.app.LayoutInflater$Factory2C0956j.RunnableC09571 */

        static {
            Covode.recordClassIndex(1050);
        }

        public final void run() {
            LayoutInflater$Factory2C0956j.this.mo3611j();
        }
    };

    /* renamed from: J */
    private final CopyOnWriteArrayList<C0968f> f3397J = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    ArrayList<AbstractC0970h> f3398b;

    /* renamed from: c */
    public boolean f3399c;

    /* renamed from: d */
    int f3400d;

    /* renamed from: e */
    final ArrayList<Fragment> f3401e = new ArrayList<>();

    /* renamed from: f */
    SparseArray<Fragment> f3402f;

    /* renamed from: g */
    ArrayList<C0942c> f3403g;

    /* renamed from: h */
    ArrayList<Fragment> f3404h;

    /* renamed from: i */
    ArrayList<C0942c> f3405i;

    /* renamed from: j */
    ArrayList<Integer> f3406j;

    /* renamed from: k */
    ArrayList<AbstractC0952i.AbstractC0955c> f3407k;

    /* renamed from: l */
    int f3408l = 0;

    /* renamed from: m */
    AbstractC0951h f3409m;

    /* renamed from: n */
    AbstractC0949f f3410n;

    /* renamed from: o */
    Fragment f3411o;

    /* renamed from: p */
    Fragment f3412p;

    /* renamed from: r */
    boolean f3413r;

    /* renamed from: s */
    boolean f3414s;

    /* renamed from: t */
    boolean f3415t;

    /* renamed from: u */
    boolean f3416u;

    /* renamed from: v */
    String f3417v;

    /* renamed from: w */
    boolean f3418w;

    /* renamed from: x */
    ArrayList<C0942c> f3419x;

    /* renamed from: y */
    ArrayList<Boolean> f3420y;

    /* renamed from: z */
    ArrayList<Fragment> f3421z;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$h */
    public interface AbstractC0970h {
        static {
            Covode.recordClassIndex(1063);
        }

        /* renamed from: a */
        boolean mo3466a(ArrayList<C0942c> arrayList, ArrayList<Boolean> arrayList2);
    }

    @Override // androidx.fragment.app.AbstractC0952i
    /* renamed from: g */
    public final boolean mo3566g() {
        return this.f3416u;
    }

    /* renamed from: a */
    private static boolean m3269a(Animator animator) {
        PropertyValuesHolder[] values;
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            for (PropertyValuesHolder propertyValuesHolder : ((ValueAnimator) animator).getValues()) {
                if ("alpha".equals(propertyValuesHolder.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i = 0; i < childAnimations.size(); i++) {
                if (m3269a(childAnimations.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m3266a(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C0690c("FragmentManager"));
        AbstractC0951h hVar = this.f3409m;
        if (hVar != null) {
            try {
                hVar.mo3537a("  ", printWriter, new String[0]);
            } catch (Exception unused) {
            }
        } else {
            mo3557a("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    @Override // androidx.fragment.app.AbstractC0952i
    /* renamed from: a */
    public final void mo3556a(AbstractC0952i.AbstractC0955c cVar) {
        if (this.f3407k == null) {
            this.f3407k = new ArrayList<>();
        }
        this.f3407k.add(cVar);
    }

    @Override // androidx.fragment.app.AbstractC0952i
    /* renamed from: a */
    public final void mo3553a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mIndex < 0) {
            m3266a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, fragment.mIndex);
    }

    @Override // androidx.fragment.app.AbstractC0952i
    /* renamed from: a */
    public final Fragment mo3550a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        Fragment fragment = this.f3402f.get(i);
        if (fragment == null) {
            m3266a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        return fragment;
    }

    @Override // androidx.fragment.app.AbstractC0952i
    /* renamed from: a */
    public final Fragment.SavedState mo3548a(Fragment fragment) {
        Bundle q;
        if (fragment.mIndex < 0) {
            m3266a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        if (fragment.mState <= 0 || (q = m3294q(fragment)) == null) {
            return null;
        }
        return new Fragment.SavedState(q);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0103 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.AbstractC0952i
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3557a(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
        // Method dump skipped, instructions count: 522
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0956j.mo3557a(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    /* renamed from: b */
    public final void mo3599b(Fragment fragment) {
        if (!fragment.mDeferStart) {
            return;
        }
        if (this.f3399c) {
            this.f3418w = true;
            return;
        }
        fragment.mDeferStart = false;
        m3264a(this, fragment, this.f3408l, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0065, code lost:
        if (r6 != 3) goto L_0x0286;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3587a(androidx.fragment.app.Fragment r14, int r15, int r16, int r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 873
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0956j.mo3587a(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    /* renamed from: a */
    private void m3263a(final Fragment fragment, C0965c cVar, int i) {
        final View view = fragment.mView;
        final ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        fragment.setStateAfterAnimating(i);
        if (cVar.f3438a != null) {
            RunnableC0967e eVar = new RunnableC0967e(cVar.f3438a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar.setAnimationListener(new animationAnimation$AnimationListenerC0964b(m3253a(eVar)) {
                /* class androidx.fragment.app.LayoutInflater$Factory2C0956j.C09582 */

                static {
                    Covode.recordClassIndex(1051);
                }

                @Override // androidx.fragment.app.LayoutInflater$Factory2C0956j.animationAnimation$AnimationListenerC0964b
                public final void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    viewGroup.post(new Runnable() {
                        /* class androidx.fragment.app.LayoutInflater$Factory2C0956j.C09582.RunnableC09591 */

                        static {
                            Covode.recordClassIndex(1052);
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:19:0x00bc  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void run() {
                            /*
                            // Method dump skipped, instructions count: 202
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0956j.C09582.RunnableC09591.run():void");
                        }
                    });
                }
            });
            m3258a(view, cVar);
            fragment.mView.startAnimation(eVar);
            return;
        }
        Animator animator = cVar.f3439b;
        fragment.setAnimator(cVar.f3439b);
        animator.addListener(new AnimatorListenerAdapter() {
            /* class androidx.fragment.app.LayoutInflater$Factory2C0956j.C09603 */

            static {
                Covode.recordClassIndex(1053);
            }

            public final void onAnimationEnd(Animator animator) {
                String str;
                viewGroup.endViewTransition(view);
                Animator animator2 = fragment.getAnimator();
                fragment.setAnimator(null);
                if (animator2 != null && viewGroup.indexOfChild(view) < 0) {
                    LayoutInflater$Factory2C0956j jVar = LayoutInflater$Factory2C0956j.this;
                    Fragment fragment = fragment;
                    int stateAfterAnimating = fragment.getStateAfterAnimating();
                    try {
                        jVar.mo3587a(fragment, stateAfterAnimating, 0, 0, false);
                    } catch (Exception e) {
                        try {
                            String name = fragment.getClass().getName();
                            Activity j = C17873f.m33102j();
                            if (j != null) {
                                str = j.getClass().getName();
                            } else {
                                str = "";
                            }
                            C33830n.m69192a("fragment_crash_log", "", new C33743c().mo59976a("errorDesc", new C33743c().mo59976a("fragmentname", name).mo59974a("newState", Integer.valueOf(stateAfterAnimating)).mo59974a("transit", (Integer) 0).mo59974a("transitionStyle", (Integer) 0).mo59971a("keepActive", (Boolean) false).mo59976a("currentActivity", str).mo59976a("errorMsg", Log.getStackTraceString(e)).mo59977a().toString()).mo59976a("fragment_name", name).mo59977a());
                        } catch (Exception unused) {
                        }
                        for (Class cls : MainServiceImpl.createIMainServicebyMonsterPlugin(false).getFixFragmentManagerWhiteList()) {
                            if (cls.isInstance(fragment)) {
                                return;
                            }
                        }
                        throw e;
                    }
                }
            }
        });
        animator.setTarget(fragment.mView);
        m3258a(fragment.mView, cVar);
        animator.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3584a(int i, boolean z) {
        AbstractC0951h hVar;
        if (this.f3409m == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f3408l) {
            this.f3408l = i;
            if (this.f3402f != null) {
                int size = this.f3401e.size();
                for (int i2 = 0; i2 < size; i2++) {
                    mo3603c(this.f3401e.get(i2));
                }
                int size2 = this.f3402f.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Fragment valueAt = this.f3402f.valueAt(i3);
                    if (valueAt != null && ((valueAt.mRemoving || valueAt.mDetached) && !valueAt.mIsNewlyAdded)) {
                        mo3603c(valueAt);
                    }
                }
                m3296u();
                if (this.f3413r && (hVar = this.f3409m) != null && this.f3408l == 4) {
                    hVar.mo3541d();
                    this.f3413r = false;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo3588a(Fragment fragment, boolean z) {
        mo3605d(fragment);
        if (fragment.mDetached) {
            return;
        }
        if (!this.f3401e.contains(fragment)) {
            synchronized (this.f3401e) {
                this.f3401e.add(fragment);
            }
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.f3413r = true;
            }
            if (z) {
                m3288k(fragment);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(fragment)));
    }

    @Override // androidx.fragment.app.AbstractC0952i
    /* renamed from: a */
    public final Fragment mo3549a(int i) {
        for (int size = this.f3401e.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f3401e.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        SparseArray<Fragment> sparseArray = this.f3402f;
        if (sparseArray == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            Fragment valueAt = this.f3402f.valueAt(size2);
            if (valueAt != null && valueAt.mFragmentId == i) {
                return valueAt;
            }
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0952i
    /* renamed from: a */
    public final Fragment mo3551a(String str) {
        if (str != null) {
            for (int size = this.f3401e.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f3401e.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        SparseArray<Fragment> sparseArray = this.f3402f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            Fragment valueAt = this.f3402f.valueAt(size2);
            if (valueAt != null && str.equals(valueAt.mTag)) {
                return valueAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final Fragment mo3597b(String str) {
        Fragment findFragmentByWho;
        SparseArray<Fragment> sparseArray = this.f3402f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            Fragment valueAt = this.f3402f.valueAt(size);
            if (!(valueAt == null || (findFragmentByWho = valueAt.findFragmentByWho(str)) == null)) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo3591a(AbstractC0970h hVar, boolean z) {
        if (!z) {
            m3297v();
        }
        synchronized (this) {
            if (!this.f3416u) {
                if (this.f3409m != null) {
                    if (this.f3398b == null) {
                        this.f3398b = new ArrayList<>();
                    }
                    this.f3398b.add(hVar);
                    mo3608i();
                    return;
                }
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: a */
    public final int mo3583a(C0942c cVar) {
        synchronized (this) {
            ArrayList<Integer> arrayList = this.f3406j;
            if (arrayList == null || arrayList.size() <= 0) {
                if (this.f3405i == null) {
                    this.f3405i = new ArrayList<>();
                }
                int size = this.f3405i.size();
                this.f3405i.add(cVar);
                return size;
            }
            ArrayList<Integer> arrayList2 = this.f3406j;
            int intValue = arrayList2.remove(arrayList2.size() - 1).intValue();
            this.f3405i.set(intValue, cVar);
            return intValue;
        }
    }

    /* renamed from: b */
    public final void mo3600b(AbstractC0970h hVar, boolean z) {
        if (!z || (this.f3409m != null && !this.f3416u)) {
            m3278c(z);
            if (hVar.mo3466a(this.f3419x, this.f3420y)) {
                this.f3399c = true;
                try {
                    m3274b(this.f3419x, this.f3420y);
                } finally {
                    m3298w();
                }
            }
            m3301z();
            m3251C();
        }
    }

    /* renamed from: a */
    private void m3267a(ArrayList<C0942c> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C0972j> arrayList3 = this.f3394C;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                C0972j jVar = this.f3394C.get(i);
                if (arrayList != null && !jVar.f3453a && (indexOf2 = arrayList.indexOf(jVar.f3454b)) != -1 && arrayList2.get(indexOf2).booleanValue()) {
                    jVar.mo3638d();
                } else if (jVar.f3455c == 0 || (arrayList != null && jVar.f3454b.mo3465a(arrayList, 0, arrayList.size()))) {
                    this.f3394C.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || jVar.f3453a || (indexOf = arrayList.indexOf(jVar.f3454b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        jVar.mo3637c();
                    } else {
                        jVar.mo3638d();
                    }
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    private void m3268a(ArrayList<C0942c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4 = i;
        boolean z = arrayList.get(i4).f3367t;
        ArrayList<Fragment> arrayList3 = this.f3421z;
        if (arrayList3 == null) {
            this.f3421z = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f3421z.addAll(this.f3401e);
        Fragment fragment = this.f3412p;
        boolean z2 = false;
        for (int i5 = i4; i5 < i2; i5++) {
            C0942c cVar = arrayList.get(i5);
            if (!arrayList2.get(i5).booleanValue()) {
                fragment = cVar.mo3450a(this.f3421z, fragment);
            } else {
                fragment = cVar.mo3468b(this.f3421z, fragment);
            }
            z2 = z2 || cVar.f3356i;
        }
        this.f3421z.clear();
        if (!z) {
            C0977o.m3403a(this, arrayList, arrayList2, i4, i2, false);
        }
        m3275b(arrayList, arrayList2, i4, i2);
        if (z) {
            C0486b<Fragment> bVar = new C0486b<>();
            m3270b(bVar);
            i3 = m3252a(arrayList, arrayList2, i4, i2, bVar);
            m3259a(bVar);
        } else {
            i3 = i2;
        }
        if (i3 != i4 && z) {
            C0977o.m3403a(this, arrayList, arrayList2, i4, i3, true);
            mo3584a(this.f3408l, true);
        }
        while (i4 < i2) {
            C0942c cVar2 = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue() && cVar2.f3360m >= 0) {
                int i6 = cVar2.f3360m;
                synchronized (this) {
                    this.f3405i.set(i6, null);
                    if (this.f3406j == null) {
                        this.f3406j = new ArrayList<>();
                    }
                    this.f3406j.add(Integer.valueOf(i6));
                }
                cVar2.f3360m = -1;
            }
            cVar2.mo3458a();
            i4++;
        }
        if (z2) {
            m3249A();
        }
    }

    /* renamed from: a */
    private static void m3259a(C0486b<Fragment> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) bVar.f1844a[i];
            if (!fragment.mAdded) {
                View view = fragment.getView();
                fragment.mPostponedAlpha = view.getAlpha();
                view.setAlpha(0.0f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3589a(C0942c cVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            cVar.mo3464a(z3);
        } else {
            cVar.mo3480g();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(cVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0977o.m3403a(this, (ArrayList<C0942c>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            mo3584a(this.f3408l, true);
        }
        SparseArray<Fragment> sparseArray = this.f3402f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                Fragment valueAt = this.f3402f.valueAt(i);
                if (valueAt != null && valueAt.mView != null && valueAt.mIsNewlyAdded && cVar.mo3472b(valueAt.mContainerId)) {
                    if (valueAt.mPostponedAlpha > 0.0f) {
                        valueAt.mView.setAlpha(valueAt.mPostponedAlpha);
                    }
                    if (z3) {
                        valueAt.mPostponedAlpha = 0.0f;
                    } else {
                        valueAt.mPostponedAlpha = -1.0f;
                        valueAt.mIsNewlyAdded = false;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo3596a(ArrayList<C0942c> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C0942c> arrayList3 = this.f3403g;
        if (arrayList3 == null) {
            return false;
        }
        if (str != null || i >= 0) {
            i3 = arrayList3.size() - 1;
            while (i3 >= 0) {
                C0942c cVar = this.f3403g.get(i3);
                if ((str == null || !str.equals(cVar.f3358k)) && (i < 0 || i != cVar.f3360m)) {
                    i3--;
                } else if ((i2 & 1) != 0) {
                    while (true) {
                        i3--;
                        if (i3 < 0) {
                            break;
                        }
                        C0942c cVar2 = this.f3403g.get(i3);
                        if ((str == null || !str.equals(cVar2.f3358k)) && (i < 0 || i != cVar2.f3360m)) {
                            break;
                        }
                    }
                }
            }
            return false;
        } else if ((i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f3403g.remove(size));
            arrayList2.add(true);
            return true;
        } else {
            i3 = -1;
        }
        if (i3 == this.f3403g.size() - 1) {
            return false;
        }
        for (int size2 = this.f3403g.size() - 1; size2 > i3; size2--) {
            arrayList.add(this.f3403g.remove(size2));
            arrayList2.add(true);
        }
        return true;
    }

    /* renamed from: a */
    static void m3265a(C0973k kVar) {
        if (kVar != null) {
            List<Fragment> list = kVar.f3456a;
            if (list != null) {
                for (Fragment fragment : list) {
                    fragment.mRetaining = true;
                }
            }
            List<C0973k> list2 = kVar.f3457b;
            if (list2 != null) {
                for (C0973k kVar2 : list2) {
                    m3265a(kVar2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3586a(Parcelable parcelable, C0973k kVar) {
        List<C0973k> list;
        List<C1182af> list2;
        List<Fragment> list3;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f3330a != null) {
                if (kVar != null) {
                    List<Fragment> list4 = kVar.f3456a;
                    list = kVar.f3457b;
                    list2 = kVar.f3458c;
                    if (list4 != null) {
                        int size = list4.size();
                        for (int i = 0; i < size; i++) {
                            Fragment fragment = list4.get(i);
                            int i2 = 0;
                            while (i2 < fragmentManagerState.f3330a.length && fragmentManagerState.f3330a[i2].f3336b != fragment.mIndex) {
                                i2++;
                            }
                            if (i2 == fragmentManagerState.f3330a.length) {
                                m3266a(new IllegalStateException("Could not find active fragment with index " + fragment.mIndex));
                            }
                            FragmentState fragmentState = fragmentManagerState.f3330a[i2];
                            fragmentState.f3346l = fragment;
                            fragment.mSavedViewState = null;
                            fragment.mBackStackNesting = 0;
                            fragment.mInLayout = false;
                            fragment.mAdded = false;
                            fragment.mTarget = null;
                            if (fragmentState.f3345k != null) {
                                fragmentState.f3345k.setClassLoader(this.f3409m.f3383c.getClassLoader());
                                fragment.mSavedViewState = fragmentState.f3345k.getSparseParcelableArray("android:view_state");
                                fragment.mSavedFragmentState = fragmentState.f3345k;
                            }
                        }
                    }
                } else {
                    list = null;
                    list2 = null;
                }
                this.f3402f = new SparseArray<>(fragmentManagerState.f3330a.length);
                int i3 = 0;
                while (i3 < fragmentManagerState.f3330a.length) {
                    FragmentState fragmentState2 = fragmentManagerState.f3330a[i3];
                    if (fragmentState2 != null) {
                        Fragment a = fragmentState2.mo3444a(this.f3409m, this.f3410n, this.f3411o, (list == null || i3 >= list.size()) ? null : list.get(i3), (list2 == null || i3 >= list2.size()) ? null : list2.get(i3));
                        this.f3402f.put(a.mIndex, a);
                        fragmentState2.f3346l = null;
                    }
                    i3++;
                }
                if (!(kVar == null || (list3 = kVar.f3456a) == null)) {
                    int size2 = list3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        Fragment fragment2 = list3.get(i4);
                        if (fragment2.mTargetIndex >= 0) {
                            fragment2.mTarget = this.f3402f.get(fragment2.mTargetIndex);
                        }
                    }
                }
                this.f3401e.clear();
                if (fragmentManagerState.f3331b != null) {
                    for (int i5 = 0; i5 < fragmentManagerState.f3331b.length; i5++) {
                        Fragment fragment3 = this.f3402f.get(fragmentManagerState.f3331b[i5]);
                        if (fragment3 == null) {
                            m3266a(new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.f3331b[i5]));
                        }
                        fragment3.mAdded = true;
                        if (!this.f3401e.contains(fragment3)) {
                            synchronized (this.f3401e) {
                                this.f3401e.add(fragment3);
                            }
                        } else {
                            throw new IllegalStateException("Already added!");
                        }
                    }
                }
                if (fragmentManagerState.f3332c != null) {
                    this.f3403g = new ArrayList<>(fragmentManagerState.f3332c.length);
                    for (int i6 = 0; i6 < fragmentManagerState.f3332c.length; i6++) {
                        C0942c a2 = fragmentManagerState.f3332c[i6].mo3264a(this);
                        if (f3390a) {
                            PrintWriter printWriter = new PrintWriter(new C0690c("FragmentManager"));
                            a2.mo3463a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f3403g.add(a2);
                        if (a2.f3360m >= 0) {
                            m3257a(a2.f3360m, a2);
                        }
                    }
                } else {
                    this.f3403g = null;
                }
                if (fragmentManagerState.f3333d >= 0) {
                    this.f3412p = this.f3402f.get(fragmentManagerState.f3333d);
                }
                this.f3400d = fragmentManagerState.f3334e;
            }
        }
    }

    /* renamed from: a */
    public final void mo3590a(AbstractC0951h hVar, AbstractC0949f fVar, Fragment fragment) {
        if (this.f3409m == null) {
            this.f3409m = hVar;
            this.f3410n = fVar;
            this.f3411o = fragment;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: a */
    public final void mo3592a(boolean z) {
        for (int size = this.f3401e.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f3401e.get(size);
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    /* renamed from: b */
    public final void mo3601b(boolean z) {
        for (int size = this.f3401e.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f3401e.get(size);
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo3585a(Configuration configuration) {
        for (int i = 0; i < this.f3401e.size(); i++) {
            Fragment fragment = this.f3401e.get(i);
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo3594a(Menu menu, MenuInflater menuInflater) {
        if (this.f3408l <= 0) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f3401e.size(); i++) {
            Fragment fragment = this.f3401e.get(i);
            if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f3404h != null) {
            for (int i2 = 0; i2 < this.f3404h.size(); i2++) {
                Fragment fragment2 = this.f3404h.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f3404h = arrayList;
        return z;
    }

    /* renamed from: a */
    public final boolean mo3593a(Menu menu) {
        if (this.f3408l <= 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f3401e.size(); i++) {
            Fragment fragment = this.f3401e.get(i);
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo3595a(MenuItem menuItem) {
        if (this.f3408l <= 0) {
            return false;
        }
        for (int i = 0; i < this.f3401e.size(); i++) {
            Fragment fragment = this.f3401e.get(i);
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo3602b(MenuItem menuItem) {
        if (this.f3408l <= 0) {
            return false;
        }
        for (int i = 0; i < this.f3401e.size(); i++) {
            Fragment fragment = this.f3401e.get(i);
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo3598b(Menu menu) {
        if (this.f3408l > 0) {
            for (int i = 0; i < this.f3401e.size(); i++) {
                Fragment fragment = this.f3401e.get(i);
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0952i
    /* renamed from: a */
    public final void mo3554a(AbstractC0952i.AbstractC0954b bVar) {
        synchronized (this.f3397J) {
            int i = 0;
            int size = this.f3397J.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.f3397J.get(i).f3446a == bVar) {
                    this.f3397J.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    private void m3260a(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.f3411o;
        if (fragment2 != null) {
            AbstractC0952i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C0956j) {
                ((LayoutInflater$Factory2C0956j) fragmentManager).m3260a(fragment, context, true);
            }
        }
        Iterator<C0968f> it = this.f3397J.iterator();
        while (it.hasNext()) {
            C0968f next = it.next();
            if (!z || next.f3447b) {
                next.f3446a.onFragmentPreAttached(this, fragment, context);
            }
        }
    }

    /* renamed from: a */
    private void m3261a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f3411o;
        if (fragment2 != null) {
            AbstractC0952i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C0956j) {
                ((LayoutInflater$Factory2C0956j) fragmentManager).m3261a(fragment, bundle, true);
            }
        }
        Iterator<C0968f> it = this.f3397J.iterator();
        while (it.hasNext()) {
            C0968f next = it.next();
            if (!z || next.f3447b) {
                next.f3446a.onFragmentPreCreated(this, fragment, bundle);
            }
        }
    }

    /* renamed from: a */
    private void m3262a(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f3411o;
        if (fragment2 != null) {
            AbstractC0952i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C0956j) {
                ((LayoutInflater$Factory2C0956j) fragmentManager).m3262a(fragment, view, bundle, true);
            }
        }
        Iterator<C0968f> it = this.f3397J.iterator();
        while (it.hasNext()) {
            C0968f next = it.next();
            if (!z || next.f3447b) {
                next.f3446a.onFragmentViewCreated(this, fragment, view, bundle);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0097  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m3264a(androidx.fragment.app.LayoutInflater$Factory2C0956j r6, androidx.fragment.app.Fragment r7, int r8, int r9, int r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0956j.m3264a(androidx.fragment.app.j, androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$j */
    public static class C0972j implements Fragment.AbstractC0936c {

        /* renamed from: a */
        final boolean f3453a;

        /* renamed from: b */
        final C0942c f3454b;

        /* renamed from: c */
        int f3455c;

        static {
            Covode.recordClassIndex(1065);
        }

        @Override // androidx.fragment.app.Fragment.AbstractC0936c
        /* renamed from: b */
        public final void mo3439b() {
            this.f3455c++;
        }

        /* renamed from: d */
        public final void mo3638d() {
            this.f3454b.f3348a.mo3589a(this.f3454b, this.f3453a, false, false);
        }

        @Override // androidx.fragment.app.Fragment.AbstractC0936c
        /* renamed from: a */
        public final void mo3438a() {
            int i = this.f3455c - 1;
            this.f3455c = i;
            if (i == 0) {
                this.f3454b.f3348a.mo3608i();
            }
        }

        /* renamed from: c */
        public final void mo3637c() {
            boolean z;
            if (this.f3455c > 0) {
                z = true;
            } else {
                z = false;
            }
            LayoutInflater$Factory2C0956j jVar = this.f3454b.f3348a;
            int size = jVar.f3401e.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = jVar.f3401e.get(i);
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            this.f3454b.f3348a.mo3589a(this.f3454b, this.f3453a, !z, true);
        }

        C0972j(C0942c cVar, boolean z) {
            this.f3453a = z;
            this.f3454b = cVar;
        }
    }

    @Override // androidx.fragment.app.AbstractC0952i
    /* renamed from: a */
    public final AbstractC0976n mo3552a() {
        return new C0942c(this);
    }

    @Override // androidx.fragment.app.AbstractC0952i
    /* renamed from: d */
    public final boolean mo3563d() {
        m3297v();
        return m3295t();
    }

    /* renamed from: q */
    public final void mo3620q() {
        this.f3415t = true;
        mo3604d(2);
    }

    /* renamed from: w */
    private void m3298w() {
        this.f3399c = false;
        this.f3420y.clear();
        this.f3419x.clear();
    }

    /* renamed from: z */
    private void m3301z() {
        if (this.f3418w) {
            this.f3418w = false;
            m3296u();
        }
    }

    @Override // androidx.fragment.app.AbstractC0952i
    /* renamed from: b */
    public final boolean mo3560b() {
        boolean j = mo3611j();
        m3299x();
        return j;
    }

    @Override // androidx.fragment.app.AbstractC0952i
    /* renamed from: e */
    public final int mo3564e() {
        ArrayList<C0942c> arrayList = this.f3403g;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.fragment.app.AbstractC0952i
    /* renamed from: h */
    public final boolean mo3567h() {
        if (this.f3414s || this.f3415t) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final void mo3614m() {
        this.f3414s = false;
        this.f3415t = false;
        mo3604d(1);
    }

    /* renamed from: n */
    public final void mo3615n() {
        this.f3414s = false;
        this.f3415t = false;
        mo3604d(2);
    }

    /* renamed from: o */
    public final void mo3616o() {
        this.f3414s = false;
        this.f3415t = false;
        mo3604d(3);
    }

    /* renamed from: p */
    public final void mo3619p() {
        this.f3414s = false;
        this.f3415t = false;
        mo3604d(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$e */
    public static class RunnableC0967e extends AnimationSet implements Runnable {

        /* renamed from: a */
        private final ViewGroup f3441a;

        /* renamed from: b */
        private final View f3442b;

        /* renamed from: c */
        private boolean f3443c;

        /* renamed from: d */
        private boolean f3444d;

        /* renamed from: e */
        private boolean f3445e = true;

        static {
            Covode.recordClassIndex(1060);
        }

        public final void run() {
            if (this.f3443c || !this.f3445e) {
                this.f3441a.endViewTransition(this.f3442b);
                this.f3444d = true;
                return;
            }
            this.f3445e = false;
            this.f3441a.post(this);
        }

        public final boolean getTransformation(long j, Transformation transformation) {
            this.f3445e = true;
            if (!this.f3443c) {
                if (!super.getTransformation(j, transformation)) {
                    this.f3443c = true;
                    View$OnAttachStateChangeListenerC0992r.m3452a(this.f3441a, this);
                }
                return true;
            } else if (!this.f3444d) {
                return true;
            } else {
                return false;
            }
        }

        RunnableC0967e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3441a = viewGroup;
            this.f3442b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.f3445e = true;
            if (!this.f3443c) {
                if (!super.getTransformation(j, transformation, f)) {
                    this.f3443c = true;
                    View$OnAttachStateChangeListenerC0992r.m3452a(this.f3441a, this);
                }
                return true;
            } else if (!this.f3444d) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$g */
    public static class C0969g {

        /* renamed from: a */
        public static final int[] f3448a = {16842755, 16842960, 16842961};

        static {
            Covode.recordClassIndex(1062);
        }
    }

    /* renamed from: A */
    private void m3249A() {
        if (this.f3407k != null) {
            for (int i = 0; i < this.f3407k.size(); i++) {
                this.f3407k.get(i).mo3582a();
            }
        }
    }

    /* renamed from: u */
    private void m3296u() {
        if (this.f3402f != null) {
            for (int i = 0; i < this.f3402f.size(); i++) {
                Fragment valueAt = this.f3402f.valueAt(i);
                if (valueAt != null) {
                    mo3599b(valueAt);
                }
            }
        }
    }

    /* renamed from: x */
    private void m3299x() {
        if (this.f3394C != null) {
            while (!this.f3394C.isEmpty()) {
                this.f3394C.remove(0).mo3637c();
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0952i
    /* renamed from: c */
    public final void mo3562c() {
        mo3591a((AbstractC0970h) new C0971i(-1, 0), false);
    }

    @Override // androidx.fragment.app.AbstractC0952i
    /* renamed from: f */
    public final List<Fragment> mo3565f() {
        List<Fragment> list;
        if (this.f3401e.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3401e) {
            list = (List) this.f3401e.clone();
        }
        return list;
    }

    /* renamed from: r */
    public final void mo3621r() {
        this.f3416u = true;
        mo3611j();
        mo3604d(0);
        this.f3409m = null;
        this.f3410n = null;
        this.f3411o = null;
    }

    /* renamed from: s */
    public final void mo3622s() {
        for (int i = 0; i < this.f3401e.size(); i++) {
            Fragment fragment = this.f3401e.get(i);
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    static {
        Covode.recordClassIndex(1049);
    }

    LayoutInflater$Factory2C0956j() {
    }

    /* renamed from: C */
    private void m3251C() {
        SparseArray<Fragment> sparseArray = this.f3402f;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.f3402f.valueAt(size) == null) {
                    SparseArray<Fragment> sparseArray2 = this.f3402f;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    /* renamed from: t */
    private boolean m3295t() {
        AbstractC0952i peekChildFragmentManager;
        mo3611j();
        m3278c(true);
        Fragment fragment = this.f3412p;
        if (fragment != null && (peekChildFragmentManager = fragment.peekChildFragmentManager()) != null && peekChildFragmentManager.mo3563d()) {
            return true;
        }
        boolean a = mo3596a(this.f3419x, this.f3420y, (String) null, -1, 0);
        if (a) {
            this.f3399c = true;
            try {
                m3274b(this.f3419x, this.f3420y);
            } finally {
                m3298w();
            }
        }
        m3301z();
        m3251C();
        return a;
    }

    /* renamed from: v */
    private void m3297v() {
        if (mo3567h()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f3417v != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f3417v);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo3608i() {
        boolean z;
        synchronized (this) {
            ArrayList<C0972j> arrayList = this.f3394C;
            boolean z2 = false;
            if (arrayList == null || arrayList.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            ArrayList<AbstractC0970h> arrayList2 = this.f3398b;
            if (arrayList2 != null && arrayList2.size() == 1) {
                z2 = true;
            }
            if (z || z2) {
                this.f3409m.f3384d.removeCallbacks(this.f3396E);
                this.f3409m.f3384d.post(this.f3396E);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f3411o;
        if (fragment != null) {
            C0689b.m2445a(fragment, sb);
        } else {
            C0689b.m2445a(this.f3409m, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: y */
    private void m3300y() {
        SparseArray<Fragment> sparseArray = this.f3402f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                Fragment valueAt = this.f3402f.valueAt(i);
                if (valueAt != null) {
                    if (valueAt.getAnimatingAway() != null) {
                        int stateAfterAnimating = valueAt.getStateAfterAnimating();
                        View animatingAway = valueAt.getAnimatingAway();
                        Animation animation = animatingAway.getAnimation();
                        if (animation != null) {
                            animation.cancel();
                            animatingAway.clearAnimation();
                        }
                        valueAt.setAnimatingAway(null);
                        m3264a(this, valueAt, stateAfterAnimating, 0, 0, false);
                    } else if (valueAt.getAnimator() != null) {
                        valueAt.getAnimator().end();
                    }
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: j */
    public final boolean mo3611j() {
        m3278c(true);
        boolean z = false;
        while (m3279c(this.f3419x, this.f3420y)) {
            this.f3399c = true;
            try {
                m3274b(this.f3419x, this.f3420y);
                m3298w();
                z = true;
            } catch (Throwable th) {
                m3298w();
                throw th;
            }
        }
        m3301z();
        m3251C();
        return z;
    }

    /* renamed from: l */
    public final void mo3613l() {
        this.f3395D = null;
        this.f3414s = false;
        this.f3415t = false;
        int size = this.f3401e.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = this.f3401e.get(i);
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3250B() {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0956j.m3250B():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014f  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable mo3612k() {
        /*
        // Method dump skipped, instructions count: 347
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0956j.mo3612k():android.os.Parcelable");
    }

    /* renamed from: androidx.fragment.app.j$b  reason: invalid class name */
    static class animationAnimation$AnimationListenerC0964b implements Animation.AnimationListener {

        /* renamed from: a */
        private final Animation.AnimationListener f3437a;

        static {
            Covode.recordClassIndex(1057);
        }

        animationAnimation$AnimationListenerC0964b(Animation.AnimationListener animationListener) {
            this.f3437a = animationListener;
        }

        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f3437a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f3437a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f3437a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$d */
    public static class C0966d extends AnimatorListenerAdapter {

        /* renamed from: a */
        View f3440a;

        static {
            Covode.recordClassIndex(1059);
        }

        C0966d(View view) {
            this.f3440a = view;
        }

        public final void onAnimationStart(Animator animator) {
            this.f3440a.setLayerType(2, null);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f3440a.setLayerType(0, null);
            animator.removeListener(this);
        }
    }

    @Override // androidx.fragment.app.AbstractC0952i
    /* renamed from: b */
    public final void mo3559b(AbstractC0952i.AbstractC0955c cVar) {
        ArrayList<AbstractC0952i.AbstractC0955c> arrayList = this.f3407k;
        if (arrayList != null) {
            arrayList.remove(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$c */
    public static class C0965c {

        /* renamed from: a */
        public final Animation f3438a;

        /* renamed from: b */
        public final Animator f3439b;

        static {
            Covode.recordClassIndex(1058);
        }

        C0965c(Animator animator) {
            this.f3439b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        C0965c(Animation animation) {
            this.f3438a = animation;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: f */
    public static void m3283f(Fragment fragment) {
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        }
    }

    /* renamed from: g */
    public static void m3285g(Fragment fragment) {
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* renamed from: k */
    private void m3288k(Fragment fragment) {
        m3264a(this, fragment, this.f3408l, 0, 0, false);
    }

    @Override // androidx.fragment.app.AbstractC0952i
    /* renamed from: c */
    public final AbstractC0952i.AbstractC0953a mo3561c(int i) {
        return this.f3403g.get(i);
    }

    /* renamed from: a */
    private static Animation.AnimationListener m3253a(Animation animation) {
        try {
            if (f3391q == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                f3391q = declaredField;
                declaredField.setAccessible(true);
            }
            return (Animation.AnimationListener) f3391q.get(animation);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: n */
    private void m3291n(Fragment fragment) {
        if (fragment.mIndex >= 0) {
            this.f3402f.put(fragment.mIndex, null);
            fragment.initState();
        }
    }

    @Override // androidx.fragment.app.AbstractC0952i
    /* renamed from: b */
    public final void mo3558b(int i) {
        if (i >= 0) {
            mo3591a((AbstractC0970h) new C0971i(i, 1), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: ".concat(String.valueOf(i)));
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo3604d(int i) {
        try {
            this.f3399c = true;
            mo3584a(i, false);
            this.f3399c = false;
            mo3611j();
        } catch (Throwable th) {
            this.f3399c = false;
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$a */
    public static class C0962a extends animationAnimation$AnimationListenerC0964b {

        /* renamed from: a */
        View f3435a;

        static {
            Covode.recordClassIndex(1055);
        }

        @Override // androidx.fragment.app.LayoutInflater$Factory2C0956j.animationAnimation$AnimationListenerC0964b
        public final void onAnimationEnd(Animation animation) {
            if (C0792v.m2791y(this.f3435a) || Build.VERSION.SDK_INT >= 24) {
                this.f3435a.post(new Runnable() {
                    /* class androidx.fragment.app.LayoutInflater$Factory2C0956j.C0962a.RunnableC09631 */

                    static {
                        Covode.recordClassIndex(1056);
                    }

                    public final void run() {
                        C0962a.this.f3435a.setLayerType(0, null);
                    }
                });
            } else {
                this.f3435a.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }

        C0962a(View view, Animation.AnimationListener animationListener) {
            super(animationListener);
            this.f3435a = view;
        }
    }

    /* renamed from: b */
    private void m3270b(C0486b<Fragment> bVar) {
        int i = this.f3408l;
        if (i > 0) {
            int min = Math.min(i, 3);
            int size = this.f3401e.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.f3401e.get(i2);
                if (fragment.mState < min) {
                    m3264a(this, fragment, min, fragment.getNextAnim(), fragment.getNextTransition(), false);
                    if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    /* renamed from: l */
    private void m3289l(Fragment fragment) {
        if (fragment.mFromLayout && !fragment.mPerformedCreateView) {
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            if (fragment.mView != null) {
                fragment.mInnerView = fragment.mView;
                fragment.mView.setSaveFromParentEnabled(false);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                m3262a(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                return;
            }
            fragment.mInnerView = null;
        }
    }

    /* renamed from: o */
    private Fragment m3292o(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        View view = fragment.mView;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f3401e.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f3401e.get(indexOf);
                if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: p */
    private void m3293p(Fragment fragment) {
        if (fragment.mInnerView != null) {
            SparseArray<Parcelable> sparseArray = this.f3393B;
            if (sparseArray == null) {
                this.f3393B = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            fragment.mInnerView.saveHierarchyState(this.f3393B);
            if (this.f3393B.size() > 0) {
                fragment.mSavedViewState = this.f3393B;
                this.f3393B = null;
            }
        }
    }

    /* renamed from: j */
    public final void mo3610j(Fragment fragment) {
        if (fragment == null || (this.f3402f.get(fragment.mIndex) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this))) {
            this.f3412p = fragment;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: q */
    private Bundle m3294q(Fragment fragment) {
        if (this.f3392A == null) {
            this.f3392A = new Bundle();
        }
        fragment.performSaveInstanceState(this.f3392A);
        m3280d(fragment, this.f3392A, false);
        Bundle bundle = null;
        if (!this.f3392A.isEmpty()) {
            Bundle bundle2 = this.f3392A;
            this.f3392A = null;
            bundle = bundle2;
        }
        if (fragment.mView != null) {
            m3293p(fragment);
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle;
    }

    /* renamed from: e */
    public final void mo3606e(Fragment fragment) {
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            synchronized (this.f3401e) {
                this.f3401e.remove(fragment);
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.f3413r = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
        }
    }

    /* renamed from: h */
    public final void mo3607h(Fragment fragment) {
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                synchronized (this.f3401e) {
                    this.f3401e.remove(fragment);
                }
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.f3413r = true;
                }
                fragment.mAdded = false;
            }
        }
    }

    /* renamed from: i */
    public final void mo3609i(Fragment fragment) {
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            if (!this.f3401e.contains(fragment)) {
                synchronized (this.f3401e) {
                    this.f3401e.add(fragment);
                }
                fragment.mAdded = true;
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.f3413r = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(fragment)));
        }
    }

    /* renamed from: c */
    private void m3278c(boolean z) {
        if (this.f3399c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f3409m == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f3409m.f3384d.getLooper()) {
            if (!z) {
                m3297v();
            }
            if (this.f3419x == null) {
                this.f3419x = new ArrayList<>();
                this.f3420y = new ArrayList<>();
            }
            this.f3399c = true;
            try {
                m3267a((ArrayList<C0942c>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f3399c = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: m */
    private void m3290m(final Fragment fragment) {
        int i;
        if (fragment.mView != null) {
            C0965c a = m3256a(fragment, fragment.getNextTransition(), !fragment.mHidden, fragment.getNextTransitionStyle());
            if (a != null) {
                if (a.f3439b != null) {
                    a.f3439b.setTarget(fragment.mView);
                    if (!fragment.mHidden) {
                        fragment.mView.setVisibility(0);
                    } else if (fragment.isHideReplaced()) {
                        fragment.setHideReplaced(false);
                    } else {
                        final ViewGroup viewGroup = fragment.mContainer;
                        final View view = fragment.mView;
                        viewGroup.startViewTransition(view);
                        a.f3439b.addListener(new AnimatorListenerAdapter() {
                            /* class androidx.fragment.app.LayoutInflater$Factory2C0956j.C09614 */

                            static {
                                Covode.recordClassIndex(1054);
                            }

                            public final void onAnimationEnd(Animator animator) {
                                viewGroup.endViewTransition(view);
                                animator.removeListener(this);
                                if (fragment.mView != null) {
                                    fragment.mView.setVisibility(8);
                                }
                            }
                        });
                    }
                    m3258a(fragment.mView, a);
                    a.f3439b.start();
                } else {
                    m3258a(fragment.mView, a);
                    fragment.mView.startAnimation(a.f3438a);
                    a.f3438a.start();
                }
            }
            if (!fragment.mHidden || fragment.isHideReplaced()) {
                i = 0;
            } else {
                i = 8;
            }
            fragment.mView.setVisibility(i);
            if (fragment.isHideReplaced()) {
                fragment.setHideReplaced(false);
            }
        }
        if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible) {
            this.f3413r = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo3605d(Fragment fragment) {
        if (fragment.mIndex < 0) {
            int i = this.f3400d;
            this.f3400d = i + 1;
            fragment.setIndex(i, this.f3411o);
            if (this.f3402f == null) {
                this.f3402f = new SparseArray<>();
            }
            this.f3402f.put(fragment.mIndex, fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo3603c(Fragment fragment) {
        ViewGroup viewGroup;
        int indexOfChild;
        int indexOfChild2;
        if (fragment != null) {
            int i = this.f3408l;
            if (fragment.mRemoving) {
                if (fragment.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, 0);
                }
            }
            m3264a(this, fragment, i, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
            if (fragment.mView != null) {
                Fragment o = m3292o(fragment);
                if (o != null && (indexOfChild2 = viewGroup.indexOfChild(fragment.mView)) < (indexOfChild = (viewGroup = fragment.mContainer).indexOfChild(o.mView))) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.mView, indexOfChild);
                }
                if (fragment.mIsNewlyAdded && fragment.mContainer != null) {
                    if (fragment.mPostponedAlpha > 0.0f) {
                        fragment.mView.setAlpha(fragment.mPostponedAlpha);
                    }
                    fragment.mPostponedAlpha = 0.0f;
                    fragment.mIsNewlyAdded = false;
                    C0965c a = m3256a(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
                    if (a != null) {
                        m3258a(fragment.mView, a);
                        if (a.f3438a != null) {
                            fragment.mView.startAnimation(a.f3438a);
                        } else {
                            a.f3439b.setTarget(fragment.mView);
                            a.f3439b.start();
                        }
                    }
                }
            }
            if (fragment.mHiddenChanged) {
                m3290m(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$f */
    public static final class C0968f {

        /* renamed from: a */
        final AbstractC0952i.AbstractC0954b f3446a;

        /* renamed from: b */
        final boolean f3447b;

        static {
            Covode.recordClassIndex(1061);
        }

        C0968f(AbstractC0952i.AbstractC0954b bVar, boolean z) {
            this.f3446a = bVar;
            this.f3447b = z;
        }
    }

    @Override // androidx.fragment.app.AbstractC0952i
    /* renamed from: a */
    public final void mo3555a(AbstractC0952i.AbstractC0954b bVar, boolean z) {
        this.f3397J.add(new C0968f(bVar, z));
    }

    /* renamed from: androidx.fragment.app.j$i */
    class C0971i implements AbstractC0970h {

        /* renamed from: a */
        final String f3449a = null;

        /* renamed from: b */
        final int f3450b;

        /* renamed from: c */
        final int f3451c;

        static {
            Covode.recordClassIndex(1064);
        }

        @Override // androidx.fragment.app.LayoutInflater$Factory2C0956j.AbstractC0970h
        /* renamed from: a */
        public final boolean mo3466a(ArrayList<C0942c> arrayList, ArrayList<Boolean> arrayList2) {
            AbstractC0952i peekChildFragmentManager;
            if (LayoutInflater$Factory2C0956j.this.f3412p == null || this.f3450b >= 0 || this.f3449a != null || (peekChildFragmentManager = LayoutInflater$Factory2C0956j.this.f3412p.peekChildFragmentManager()) == null || !peekChildFragmentManager.mo3563d()) {
                return LayoutInflater$Factory2C0956j.this.mo3596a(arrayList, arrayList2, this.f3449a, this.f3450b, this.f3451c);
            }
            return false;
        }

        C0971i(int i, int i2) {
            this.f3450b = i;
            this.f3451c = i2;
        }
    }

    /* renamed from: a */
    private static C0965c m3254a(float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f3387G);
        alphaAnimation.setDuration(220);
        return new C0965c(alphaAnimation);
    }

    /* renamed from: e */
    private void m3282e(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f3411o;
        if (fragment2 != null) {
            AbstractC0952i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C0956j) {
                ((LayoutInflater$Factory2C0956j) fragmentManager).m3282e(fragment, true);
            }
        }
        Iterator<C0968f> it = this.f3397J.iterator();
        while (it.hasNext()) {
            C0968f next = it.next();
            if (!z || next.f3447b) {
                next.f3446a.onFragmentStopped(this, fragment);
            }
        }
    }

    /* renamed from: f */
    private void m3284f(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f3411o;
        if (fragment2 != null) {
            AbstractC0952i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C0956j) {
                ((LayoutInflater$Factory2C0956j) fragmentManager).m3284f(fragment, true);
            }
        }
        Iterator<C0968f> it = this.f3397J.iterator();
        while (it.hasNext()) {
            C0968f next = it.next();
            if (!z || next.f3447b) {
                next.f3446a.onFragmentViewDestroyed(this, fragment);
            }
        }
    }

    /* renamed from: g */
    private void m3286g(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f3411o;
        if (fragment2 != null) {
            AbstractC0952i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C0956j) {
                ((LayoutInflater$Factory2C0956j) fragmentManager).m3286g(fragment, true);
            }
        }
        Iterator<C0968f> it = this.f3397J.iterator();
        while (it.hasNext()) {
            C0968f next = it.next();
            if (!z || next.f3447b) {
                next.f3446a.onFragmentDestroyed(this, fragment);
            }
        }
    }

    /* renamed from: h */
    private void m3287h(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f3411o;
        if (fragment2 != null) {
            AbstractC0952i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C0956j) {
                ((LayoutInflater$Factory2C0956j) fragmentManager).m3287h(fragment, true);
            }
        }
        Iterator<C0968f> it = this.f3397J.iterator();
        while (it.hasNext()) {
            C0968f next = it.next();
            if (!z || next.f3447b) {
                next.f3446a.onFragmentDetached(this, fragment);
            }
        }
    }

    /* renamed from: c */
    private void m3277c(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f3411o;
        if (fragment2 != null) {
            AbstractC0952i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C0956j) {
                ((LayoutInflater$Factory2C0956j) fragmentManager).m3277c(fragment, true);
            }
        }
        Iterator<C0968f> it = this.f3397J.iterator();
        while (it.hasNext()) {
            C0968f next = it.next();
            if (!z || next.f3447b) {
                next.f3446a.onFragmentResumed(this, fragment);
            }
        }
    }

    /* renamed from: d */
    private void m3281d(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f3411o;
        if (fragment2 != null) {
            AbstractC0952i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C0956j) {
                ((LayoutInflater$Factory2C0956j) fragmentManager).m3281d(fragment, true);
            }
        }
        Iterator<C0968f> it = this.f3397J.iterator();
        while (it.hasNext()) {
            C0968f next = it.next();
            if (!z || next.f3447b) {
                next.f3446a.onFragmentPaused(this, fragment);
            }
        }
    }

    /* renamed from: b */
    private void m3273b(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f3411o;
        if (fragment2 != null) {
            AbstractC0952i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C0956j) {
                ((LayoutInflater$Factory2C0956j) fragmentManager).m3273b(fragment, true);
            }
        }
        Iterator<C0968f> it = this.f3397J.iterator();
        while (it.hasNext()) {
            C0968f next = it.next();
            if (!z || next.f3447b) {
                next.f3446a.onFragmentStarted(this, fragment);
            }
        }
    }

    /* renamed from: c */
    private boolean m3279c(ArrayList<C0942c> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            ArrayList<AbstractC0970h> arrayList3 = this.f3398b;
            if (arrayList3 == null || arrayList3.size() == 0) {
                return false;
            }
            int size = this.f3398b.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.f3398b.get(i).mo3466a(arrayList, arrayList2);
            }
            this.f3398b.clear();
            this.f3409m.f3384d.removeCallbacks(this.f3396E);
            return z;
        }
    }

    /* renamed from: a */
    private void m3257a(int i, C0942c cVar) {
        synchronized (this) {
            if (this.f3405i == null) {
                this.f3405i = new ArrayList<>();
            }
            int size = this.f3405i.size();
            if (i < size) {
                this.f3405i.set(i, cVar);
            } else {
                while (size < i) {
                    this.f3405i.add(null);
                    if (this.f3406j == null) {
                        this.f3406j = new ArrayList<>();
                    }
                    this.f3406j.add(Integer.valueOf(size));
                    size++;
                }
                this.f3405i.add(cVar);
            }
        }
    }

    /* renamed from: b */
    private void m3274b(ArrayList<C0942c> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m3267a(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!arrayList.get(i).f3367t) {
                    if (i2 != i) {
                        m3268a(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (arrayList2.get(i).booleanValue()) {
                        while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f3367t) {
                            i2++;
                        }
                    }
                    m3268a(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m3268a(arrayList, arrayList2, i2, size);
            }
        }
    }

    /* renamed from: a */
    private static void m3258a(View view, C0965c cVar) {
        if (!(view == null || cVar == null)) {
            int i = Build.VERSION.SDK_INT;
            if (view.getLayerType() == 0 && C0792v.m2782p(view)) {
                if (!(cVar.f3438a instanceof AlphaAnimation)) {
                    if (cVar.f3438a instanceof AnimationSet) {
                        List<Animation> animations = ((AnimationSet) cVar.f3438a).getAnimations();
                        for (int i2 = 0; i2 < animations.size(); i2++) {
                            if (!(animations.get(i2) instanceof AlphaAnimation)) {
                            }
                        }
                        return;
                    } else if (!m3269a(cVar.f3439b)) {
                        return;
                    }
                }
                if (cVar.f3439b != null) {
                    cVar.f3439b.addListener(new C0966d(view));
                    return;
                }
                Animation.AnimationListener a = m3253a(cVar.f3438a);
                view.setLayerType(2, null);
                cVar.f3438a.setAnimationListener(new C0962a(view, a));
            }
        }
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: c */
    private void m3276c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f3411o;
        if (fragment2 != null) {
            AbstractC0952i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C0956j) {
                ((LayoutInflater$Factory2C0956j) fragmentManager).m3276c(fragment, bundle, true);
            }
        }
        Iterator<C0968f> it = this.f3397J.iterator();
        while (it.hasNext()) {
            C0968f next = it.next();
            if (!z || next.f3447b) {
                next.f3446a.onFragmentActivityCreated(this, fragment, bundle);
            }
        }
    }

    /* renamed from: d */
    private void m3280d(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f3411o;
        if (fragment2 != null) {
            AbstractC0952i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C0956j) {
                ((LayoutInflater$Factory2C0956j) fragmentManager).m3280d(fragment, bundle, true);
            }
        }
        Iterator<C0968f> it = this.f3397J.iterator();
        while (it.hasNext()) {
            C0968f next = it.next();
            if (!z || next.f3447b) {
                next.f3446a.onFragmentSaveInstanceState(this, fragment, bundle);
            }
        }
    }

    /* renamed from: b */
    private void m3271b(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.f3411o;
        if (fragment2 != null) {
            AbstractC0952i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C0956j) {
                ((LayoutInflater$Factory2C0956j) fragmentManager).m3271b(fragment, context, true);
            }
        }
        Iterator<C0968f> it = this.f3397J.iterator();
        while (it.hasNext()) {
            C0968f next = it.next();
            if (!z || next.f3447b) {
                next.f3446a.onFragmentAttached(this, fragment, context);
            }
        }
    }

    /* renamed from: b */
    private void m3272b(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f3411o;
        if (fragment2 != null) {
            AbstractC0952i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C0956j) {
                ((LayoutInflater$Factory2C0956j) fragmentManager).m3272b(fragment, bundle, true);
            }
        }
        Iterator<C0968f> it = this.f3397J.iterator();
        while (it.hasNext()) {
            C0968f next = it.next();
            if (!z || next.f3447b) {
                next.f3446a.onFragmentCreated(this, fragment, bundle);
            }
        }
    }

    /* renamed from: a */
    private static C0965c m3255a(float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f3386F);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f3387G);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new C0965c(animationSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (0 != 0) goto L_0x006d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.fragment.app.LayoutInflater$Factory2C0956j.C0965c m3256a(androidx.fragment.app.Fragment r7, int r8, boolean r9, int r10) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0956j.m3256a(androidx.fragment.app.Fragment, int, boolean, int):androidx.fragment.app.j$c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r10 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r5 == -1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        r10 = mo3549a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (androidx.fragment.app.LayoutInflater$Factory2C0956j.f3390a == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        java.lang.Integer.toHexString(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        if (r10 != null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        r10 = r15.f3410n.mo3431a(r18, r3, null);
        r10.mFromLayout = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (r6 == 0) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        r10.mFragmentId = r0;
        r10.mContainerId = r5;
        r10.mTag = r4;
        r10.mInLayout = true;
        r10.mFragmentManager = r15;
        r10.mHost = r15.f3409m;
        r10.onInflate(r15.f3409m.f3383c, r19, r10.mSavedFragmentState);
        mo3588a(r10, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        if (r15.f3408l > 0) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
        if (r10.mFromLayout == false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        m3264a(r15, r10, 1, 0, 0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        if (r10.mView == null) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0096, code lost:
        if (r6 == 0) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0098, code lost:
        r10.mView.setId(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        if (r10.mView.getTag() != null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
        r10.mView.setTag(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ac, code lost:
        return r10.mView;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ad, code lost:
        m3288k(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b1, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b5, code lost:
        if (r10.mInLayout != false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b7, code lost:
        r10.mInLayout = true;
        r10.mHost = r15.f3409m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bf, code lost:
        if (r10.mRetaining != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c1, code lost:
        r10.onInflate(r15.f3409m.f3383c, r19, r10.mSavedFragmentState);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d1, code lost:
        if (r10 == null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d3, code lost:
        if (r4 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f3, code lost:
        throw new java.lang.IllegalStateException("Fragment " + r3 + " did not create a view.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013a, code lost:
        throw new java.lang.IllegalArgumentException(r19.getPositionDescription() + ": Duplicate id 0x" + java.lang.Integer.toHexString(r6) + ", tag " + r4 + ", or parent id 0x" + java.lang.Integer.toHexString(r5) + " with another fragment for " + r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r16, java.lang.String r17, android.content.Context r18, android.util.AttributeSet r19) {
        /*
        // Method dump skipped, instructions count: 348
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0956j.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* renamed from: b */
    private static void m3275b(ArrayList<C0942c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0942c cVar = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                cVar.mo3459a(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                cVar.mo3464a(z);
            } else {
                cVar.mo3459a(1);
                cVar.mo3480g();
            }
            i++;
        }
    }

    /* renamed from: a */
    private int m3252a(ArrayList<C0942c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0486b<Fragment> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0942c cVar = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            int i5 = 0;
            while (true) {
                if (i5 >= cVar.f3349b.size()) {
                    break;
                } else if (!C0942c.m3156b(cVar.f3349b.get(i5))) {
                    i5++;
                } else if (!cVar.mo3465a(arrayList, i4 + 1, i2)) {
                    if (this.f3394C == null) {
                        this.f3394C = new ArrayList<>();
                    }
                    C0972j jVar = new C0972j(cVar, booleanValue);
                    this.f3394C.add(jVar);
                    cVar.mo3460a(jVar);
                    if (booleanValue) {
                        cVar.mo3480g();
                    } else {
                        cVar.mo3464a(false);
                    }
                    i3--;
                    if (i4 != i3) {
                        arrayList.remove(i4);
                        arrayList.add(i3, cVar);
                    }
                    m3270b(bVar);
                }
            }
        }
        return i3;
    }
}
