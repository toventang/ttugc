package androidx.core.p037h;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.h.m */
public class C0783m {

    /* renamed from: a */
    public boolean f2940a;

    /* renamed from: b */
    private ViewParent f2941b;

    /* renamed from: c */
    private ViewParent f2942c;

    /* renamed from: d */
    private final View f2943d;

    /* renamed from: e */
    private int[] f2944e;

    static {
        Covode.recordClassIndex(864);
    }

    /* renamed from: a */
    public final boolean mo2908a(int i, int i2, int[] iArr, int[] iArr2) {
        return mo2909a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public final boolean mo2909a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent c;
        int i4;
        int i5;
        int[] iArr3 = iArr;
        if (!this.f2940a || (c = m2710c(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f2943d.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr3 == null) {
            iArr3 = m2709a();
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        C0806y.m2813a(c, this.f2943d, i, i2, iArr3, i3);
        if (iArr2 != null) {
            this.f2943d.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private int[] m2709a() {
        if (this.f2944e == null) {
            this.f2944e = new int[2];
        }
        return this.f2944e;
    }

    public C0783m(View view) {
        this.f2943d = view;
    }

    /* renamed from: c */
    private ViewParent m2710c(int i) {
        if (i == 0) {
            return this.f2941b;
        }
        if (i != 1) {
            return null;
        }
        return this.f2942c;
    }

    /* renamed from: a */
    public final void mo2902a(boolean z) {
        if (this.f2940a) {
            View view = this.f2943d;
            if (Build.VERSION.SDK_INT >= 21) {
                view.stopNestedScroll();
            } else if (view instanceof AbstractC0780j) {
                ((AbstractC0780j) view).stopNestedScroll();
            }
        }
        this.f2940a = z;
    }

    /* renamed from: b */
    public final void mo2910b(int i) {
        ViewParent c = m2710c(i);
        if (c != null) {
            View view = this.f2943d;
            if (c instanceof AbstractC0785o) {
                ((AbstractC0785o) c).mo2476b(view, i);
            } else if (i == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        c.onStopNestedScroll(view);
                    } catch (AbstractMethodError unused) {
                        new StringBuilder("ViewParent ").append(c).append(" does not implement interface method onStopNestedScroll");
                    }
                } else if (c instanceof AbstractC0784n) {
                    ((AbstractC0784n) c).onStopNestedScroll(view);
                }
            }
            m2708a(i, (ViewParent) null);
        }
    }

    /* renamed from: a */
    public final boolean mo2905a(int i) {
        if (m2710c(i) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m2708a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f2941b = viewParent;
        } else if (i == 1) {
            this.f2942c = viewParent;
        }
    }

    /* renamed from: a */
    public final boolean mo2903a(float f, float f2) {
        ViewParent c;
        if (!this.f2940a || (c = m2710c(0)) == null) {
            return false;
        }
        return C0806y.m2814a(c, this.f2943d, f, f2);
    }

    /* renamed from: a */
    public final boolean mo2906a(int i, int i2) {
        if (mo2905a(i2)) {
            return true;
        }
        if (!this.f2940a) {
            return false;
        }
        View view = this.f2943d;
        for (ViewParent parent = this.f2943d.getParent(); parent != null; parent = parent.getParent()) {
            if (C0806y.m2816a(parent, view, this.f2943d, i, i2)) {
                m2708a(i2, parent);
                View view2 = this.f2943d;
                if (parent instanceof AbstractC0785o) {
                    ((AbstractC0785o) parent).mo2477b(view, view2, i, i2);
                } else if (i2 == 0) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        try {
                            parent.onNestedScrollAccepted(view, view2, i);
                        } catch (AbstractMethodError unused) {
                            new StringBuilder("ViewParent ").append(parent).append(" does not implement interface method onNestedScrollAccepted");
                        }
                    } else if (parent instanceof AbstractC0784n) {
                        ((AbstractC0784n) parent).onNestedScrollAccepted(view, view2, i);
                    }
                }
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo2904a(float f, float f2, boolean z) {
        ViewParent c;
        if (!this.f2940a || (c = m2710c(0)) == null) {
            return false;
        }
        return C0806y.m2815a(c, this.f2943d, f, f2, z);
    }

    /* renamed from: a */
    public final boolean mo2907a(int i, int i2, int i3, int i4, int[] iArr) {
        return mo2911b(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: a */
    public final void mo2901a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        mo2911b(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: b */
    public final boolean mo2911b(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent c;
        int i6;
        int i7;
        int[] iArr3 = iArr2;
        if (!this.f2940a || (c = m2710c(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f2943d.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr3 == null) {
            iArr3 = m2709a();
            iArr3[0] = 0;
            iArr3[1] = 0;
        }
        C0806y.m2812a(c, this.f2943d, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f2943d.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }
}
