package androidx.fragment.app;

import androidx.core.p036g.C0690c;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.LayoutInflater$Factory2C0956j;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.c */
public final class C0942c extends AbstractC0976n implements AbstractC0952i.AbstractC0953a, LayoutInflater$Factory2C0956j.AbstractC0970h {

    /* renamed from: a */
    final LayoutInflater$Factory2C0956j f3348a;

    /* renamed from: b */
    ArrayList<C0943a> f3349b = new ArrayList<>();

    /* renamed from: c */
    int f3350c;

    /* renamed from: d */
    int f3351d;

    /* renamed from: e */
    int f3352e;

    /* renamed from: f */
    int f3353f;

    /* renamed from: g */
    public int f3354g;

    /* renamed from: h */
    public int f3355h;

    /* renamed from: i */
    boolean f3356i;

    /* renamed from: j */
    boolean f3357j = true;

    /* renamed from: k */
    String f3358k;

    /* renamed from: l */
    boolean f3359l;

    /* renamed from: m */
    int f3360m = -1;

    /* renamed from: n */
    int f3361n;

    /* renamed from: o */
    CharSequence f3362o;

    /* renamed from: p */
    int f3363p;

    /* renamed from: q */
    CharSequence f3364q;

    /* renamed from: r */
    ArrayList<String> f3365r;

    /* renamed from: s */
    ArrayList<String> f3366s;

    /* renamed from: t */
    boolean f3367t = false;

    /* renamed from: u */
    ArrayList<Runnable> f3368u;

    static {
        Covode.recordClassIndex(1035);
    }

    @Override // androidx.fragment.app.AbstractC0976n
    /* renamed from: f */
    public final AbstractC0976n mo3479f() {
        this.f3367t = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$a */
    public static final class C0943a {

        /* renamed from: a */
        int f3369a;

        /* renamed from: b */
        Fragment f3370b;

        /* renamed from: c */
        int f3371c;

        /* renamed from: d */
        int f3372d;

        /* renamed from: e */
        int f3373e;

        /* renamed from: f */
        int f3374f;

        static {
            Covode.recordClassIndex(1036);
        }

        C0943a() {
        }

        C0943a(int i, Fragment fragment) {
            this.f3369a = i;
            this.f3370b = fragment;
        }
    }

    @Override // androidx.fragment.app.AbstractC0952i.AbstractC0953a
    /* renamed from: h */
    public final String mo3481h() {
        return this.f3358k;
    }

    /* renamed from: a */
    public final void mo3462a(String str, PrintWriter printWriter) {
        mo3463a(str, printWriter, true);
    }

    /* renamed from: a */
    public final void mo3463a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3358k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3360m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3359l);
            if (this.f3354g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3354g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f3355h));
            }
            if (!(this.f3350c == 0 && this.f3351d == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3350c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3351d));
            }
            if (!(this.f3352e == 0 && this.f3353f == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3352e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3353f));
            }
            if (!(this.f3361n == 0 && this.f3362o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3361n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3362o);
            }
            if (!(this.f3363p == 0 && this.f3364q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3363p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3364q);
            }
        }
        if (!this.f3349b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f3349b.size();
            for (int i = 0; i < size; i++) {
                C0943a aVar = this.f3349b.get(i);
                switch (aVar.f3369a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        str2 = "SHOW";
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        str2 = "DETACH";
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        str2 = "ATTACH";
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f3369a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f3370b);
                if (z) {
                    if (!(aVar.f3371c == 0 && aVar.f3372d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3371c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3372d));
                    }
                    if (aVar.f3373e != 0 || aVar.f3374f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3373e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3374f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3461a(C0943a aVar) {
        this.f3349b.add(aVar);
        aVar.f3371c = this.f3350c;
        aVar.f3372d = this.f3351d;
        aVar.f3373e = this.f3352e;
        aVar.f3374f = this.f3353f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3459a(int i) {
        if (this.f3356i) {
            int size = this.f3349b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0943a aVar = this.f3349b.get(i2);
                if (aVar.f3370b != null) {
                    aVar.f3370b.mBackStackNesting += i;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo3458a() {
        ArrayList<Runnable> arrayList = this.f3368u;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f3368u.get(i).run();
            }
            this.f3368u = null;
        }
    }

    @Override // androidx.fragment.app.LayoutInflater$Factory2C0956j.AbstractC0970h
    /* renamed from: a */
    public final boolean mo3466a(ArrayList<C0942c> arrayList, ArrayList<Boolean> arrayList2) {
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f3356i) {
            return true;
        }
        LayoutInflater$Factory2C0956j jVar = this.f3348a;
        if (jVar.f3403g == null) {
            jVar.f3403g = new ArrayList<>();
        }
        jVar.f3403g.add(this);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo3465a(ArrayList<C0942c> arrayList, int i, int i2) {
        int i3;
        if (i2 == i) {
            return false;
        }
        int size = this.f3349b.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            C0943a aVar = this.f3349b.get(i5);
            if (!(aVar.f3370b == null || (i3 = aVar.f3370b.mContainerId) == 0 || i3 == i4)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0942c cVar = arrayList.get(i6);
                    int size2 = cVar.f3349b.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        C0943a aVar2 = cVar.f3349b.get(i7);
                        if (aVar2.f3370b != null && aVar2.f3370b.mContainerId == i3) {
                            return true;
                        }
                    }
                }
                i4 = i3;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3464a(boolean z) {
        for (int size = this.f3349b.size() - 1; size >= 0; size--) {
            C0943a aVar = this.f3349b.get(size);
            Fragment fragment = aVar.f3370b;
            if (fragment != null) {
                int i = this.f3354g;
                int i2 = 8194;
                if (i != 4097) {
                    i2 = i != 4099 ? i != 8194 ? 0 : 4097 : 4099;
                }
                fragment.setNextTransition(i2, this.f3355h);
            }
            switch (aVar.f3369a) {
                case 1:
                    fragment.setNextAnim(aVar.f3374f);
                    this.f3348a.mo3606e(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3369a);
                case 3:
                    fragment.setNextAnim(aVar.f3373e);
                    this.f3348a.mo3588a(fragment, false);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f3373e);
                    LayoutInflater$Factory2C0956j.m3285g(fragment);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    fragment.setNextAnim(aVar.f3374f);
                    LayoutInflater$Factory2C0956j.m3283f(fragment);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    fragment.setNextAnim(aVar.f3373e);
                    this.f3348a.mo3609i(fragment);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    fragment.setNextAnim(aVar.f3374f);
                    this.f3348a.mo3607h(fragment);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    this.f3348a.mo3610j(null);
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    this.f3348a.mo3610j(fragment);
                    break;
            }
            if (!(this.f3367t || aVar.f3369a == 3 || fragment == null)) {
                this.f3348a.mo3603c(fragment);
            }
        }
        if (!this.f3367t && z) {
            LayoutInflater$Factory2C0956j jVar = this.f3348a;
            jVar.mo3584a(jVar.f3408l, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3460a(Fragment.AbstractC0936c cVar) {
        for (int i = 0; i < this.f3349b.size(); i++) {
            C0943a aVar = this.f3349b.get(i);
            if (m3156b(aVar)) {
                aVar.f3370b.setOnStartEnterTransitionListener(cVar);
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0976n
    /* renamed from: b */
    public final int mo3467b() {
        return m3155b(false);
    }

    @Override // androidx.fragment.app.AbstractC0976n
    /* renamed from: c */
    public final int mo3473c() {
        return m3155b(true);
    }

    /* renamed from: i */
    private AbstractC0976n m3157i() {
        if (!this.f3356i) {
            this.f3357j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    @Override // androidx.fragment.app.AbstractC0976n
    /* renamed from: d */
    public final void mo3476d() {
        m3157i();
        this.f3348a.mo3600b((LayoutInflater$Factory2C0956j.AbstractC0970h) this, false);
    }

    @Override // androidx.fragment.app.AbstractC0976n
    /* renamed from: e */
    public final void mo3478e() {
        m3157i();
        this.f3348a.mo3600b((LayoutInflater$Factory2C0956j.AbstractC0970h) this, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3360m >= 0) {
            sb.append(" #");
            sb.append(this.f3360m);
        }
        if (this.f3358k != null) {
            sb.append(" ");
            sb.append(this.f3358k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo3480g() {
        int size = this.f3349b.size();
        for (int i = 0; i < size; i++) {
            C0943a aVar = this.f3349b.get(i);
            Fragment fragment = aVar.f3370b;
            if (fragment != null) {
                fragment.setNextTransition(this.f3354g, this.f3355h);
            }
            switch (aVar.f3369a) {
                case 1:
                    fragment.setNextAnim(aVar.f3371c);
                    this.f3348a.mo3588a(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3369a);
                case 3:
                    fragment.setNextAnim(aVar.f3372d);
                    this.f3348a.mo3606e(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f3372d);
                    LayoutInflater$Factory2C0956j.m3283f(fragment);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    fragment.setNextAnim(aVar.f3371c);
                    LayoutInflater$Factory2C0956j.m3285g(fragment);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    fragment.setNextAnim(aVar.f3372d);
                    this.f3348a.mo3607h(fragment);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    fragment.setNextAnim(aVar.f3371c);
                    this.f3348a.mo3609i(fragment);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    this.f3348a.mo3610j(fragment);
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    this.f3348a.mo3610j(null);
                    break;
            }
            if (!(this.f3367t || aVar.f3369a == 1 || fragment == null)) {
                this.f3348a.mo3603c(fragment);
            }
        }
        if (!this.f3367t) {
            LayoutInflater$Factory2C0956j jVar = this.f3348a;
            jVar.mo3584a(jVar.f3408l, true);
        }
    }

    @Override // androidx.fragment.app.AbstractC0976n
    /* renamed from: c */
    public final AbstractC0976n mo3474c(Fragment fragment) {
        mo3461a(new C0943a(5, fragment));
        return this;
    }

    @Override // androidx.fragment.app.AbstractC0976n
    /* renamed from: d */
    public final AbstractC0976n mo3475d(Fragment fragment) {
        mo3461a(new C0943a(6, fragment));
        return this;
    }

    @Override // androidx.fragment.app.AbstractC0976n
    /* renamed from: e */
    public final AbstractC0976n mo3477e(Fragment fragment) {
        mo3461a(new C0943a(7, fragment));
        return this;
    }

    public C0942c(LayoutInflater$Factory2C0956j jVar) {
        this.f3348a = jVar;
    }

    /* renamed from: b */
    static boolean m3156b(C0943a aVar) {
        Fragment fragment = aVar.f3370b;
        if (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private int m3155b(boolean z) {
        if (!this.f3359l) {
            if (LayoutInflater$Factory2C0956j.f3390a) {
                PrintWriter printWriter = new PrintWriter(new C0690c("FragmentManager"));
                mo3462a("  ", printWriter);
                printWriter.close();
            }
            this.f3359l = true;
            if (this.f3356i) {
                this.f3360m = this.f3348a.mo3583a(this);
            } else {
                this.f3360m = -1;
            }
            this.f3348a.mo3591a(this, z);
            return this.f3360m;
        }
        throw new IllegalStateException("commit already called");
    }

    @Override // androidx.fragment.app.AbstractC0976n
    /* renamed from: a */
    public final AbstractC0976n mo3455a(Fragment fragment) {
        mo3461a(new C0943a(3, fragment));
        return this;
    }

    @Override // androidx.fragment.app.AbstractC0976n
    /* renamed from: b */
    public final AbstractC0976n mo3471b(Fragment fragment) {
        mo3461a(new C0943a(4, fragment));
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo3472b(int i) {
        int i2;
        int size = this.f3349b.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0943a aVar = this.f3349b.get(i3);
            if (!(aVar.f3370b == null || (i2 = aVar.f3370b.mContainerId) == 0 || i2 != i)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.AbstractC0976n
    /* renamed from: a */
    public final AbstractC0976n mo3457a(String str) {
        if (this.f3357j) {
            this.f3356i = true;
            this.f3358k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    @Override // androidx.fragment.app.AbstractC0976n
    /* renamed from: a */
    public final AbstractC0976n mo3451a(int i, int i2) {
        return mo3452a(i, i2, 0, 0);
    }

    @Override // androidx.fragment.app.AbstractC0976n
    /* renamed from: b */
    public final AbstractC0976n mo3469b(int i, Fragment fragment) {
        return mo3470b(i, fragment, null);
    }

    @Override // androidx.fragment.app.AbstractC0976n
    /* renamed from: a */
    public final AbstractC0976n mo3453a(int i, Fragment fragment) {
        m3154a(i, fragment, (String) null, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Fragment mo3468b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int i = 0; i < this.f3349b.size(); i++) {
            C0943a aVar = this.f3349b.get(i);
            int i2 = aVar.f3369a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            fragment = null;
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            fragment = aVar.f3370b;
                            break;
                    }
                }
                arrayList.add(aVar.f3370b);
            }
            arrayList.remove(aVar.f3370b);
        }
        return fragment;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Fragment mo3450a(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f3349b.size()) {
            C0943a aVar = this.f3349b.get(i);
            int i2 = aVar.f3369a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f3370b;
                    int i3 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f3349b.add(i, new C0943a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                C0943a aVar2 = new C0943a(3, fragment4);
                                aVar2.f3371c = aVar.f3371c;
                                aVar2.f3373e = aVar.f3373e;
                                aVar2.f3372d = aVar.f3372d;
                                aVar2.f3374f = aVar.f3374f;
                                this.f3349b.add(i, aVar2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f3349b.remove(i);
                        i--;
                    } else {
                        aVar.f3369a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(aVar.f3370b);
                    if (aVar.f3370b == fragment2) {
                        this.f3349b.add(i, new C0943a(9, aVar.f3370b));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f3349b.add(i, new C0943a(9, fragment2));
                        i++;
                        fragment2 = aVar.f3370b;
                    }
                }
                i++;
            }
            arrayList.add(aVar.f3370b);
            i++;
        }
        return fragment2;
    }

    @Override // androidx.fragment.app.AbstractC0976n
    /* renamed from: a */
    public final AbstractC0976n mo3456a(Fragment fragment, String str) {
        m3154a(0, fragment, str, 1);
        return this;
    }

    @Override // androidx.fragment.app.AbstractC0976n
    /* renamed from: a */
    public final AbstractC0976n mo3454a(int i, Fragment fragment, String str) {
        m3154a(i, fragment, str, 1);
        return this;
    }

    @Override // androidx.fragment.app.AbstractC0976n
    /* renamed from: b */
    public final AbstractC0976n mo3470b(int i, Fragment fragment, String str) {
        if (i != 0) {
            m3154a(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    @Override // androidx.fragment.app.AbstractC0976n
    /* renamed from: a */
    public final AbstractC0976n mo3452a(int i, int i2, int i3, int i4) {
        this.f3350c = i;
        this.f3351d = i2;
        this.f3352e = i3;
        this.f3353f = i4;
        return this;
    }

    /* renamed from: a */
    private void m3154a(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        fragment.mFragmentManager = this.f3348a;
        if (str != null) {
            if (fragment.mTag == null || str.equals(fragment.mTag)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            } else if (fragment.mFragmentId == 0 || fragment.mFragmentId == i) {
                fragment.mFragmentId = i;
                fragment.mContainerId = i;
            } else {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
            }
        }
        mo3461a(new C0943a(i2, fragment));
    }
}
