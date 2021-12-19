package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.appcompat.view.menu.AbstractC0318o;
import androidx.appcompat.view.menu.C0289a;
import androidx.appcompat.view.menu.C0302h;
import androidx.appcompat.widget.Toolbar;
import androidx.core.p037h.C0751ab;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.C0807z;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: androidx.appcompat.widget.am */
public class C0406am implements AbstractC0454v {

    /* renamed from: a */
    Toolbar f1588a;

    /* renamed from: b */
    CharSequence f1589b;

    /* renamed from: c */
    Window.Callback f1590c;

    /* renamed from: d */
    boolean f1591d;

    /* renamed from: e */
    private int f1592e;

    /* renamed from: f */
    private View f1593f;

    /* renamed from: g */
    private View f1594g;

    /* renamed from: h */
    private Drawable f1595h;

    /* renamed from: i */
    private Drawable f1596i;

    /* renamed from: j */
    private Drawable f1597j;

    /* renamed from: k */
    private boolean f1598k;

    /* renamed from: l */
    private CharSequence f1599l;

    /* renamed from: m */
    private CharSequence f1600m;

    /* renamed from: n */
    private ActionMenuPresenter f1601n;

    /* renamed from: o */
    private int f1602o;

    /* renamed from: p */
    private int f1603p;

    /* renamed from: q */
    private Drawable f1604q;

    static {
        Covode.recordClassIndex(471);
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: k */
    public final void mo1862k() {
        this.f1591d = true;
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: a */
    public final ViewGroup mo1839a() {
        return this.f1588a;
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: m */
    public final int mo1864m() {
        return this.f1592e;
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: n */
    public final int mo1865n() {
        return this.f1602o;
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: d */
    public final void mo1853d() {
        this.f1588a.collapseActionView();
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: e */
    public final CharSequence mo1855e() {
        return this.f1588a.getTitle();
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: f */
    public final boolean mo1857f() {
        return this.f1588a.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: g */
    public final boolean mo1858g() {
        return this.f1588a.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: h */
    public final boolean mo1859h() {
        return this.f1588a.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: i */
    public final boolean mo1860i() {
        return this.f1588a.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: j */
    public final boolean mo1861j() {
        return this.f1588a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: l */
    public final void mo1863l() {
        this.f1588a.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: o */
    public final Menu mo1866o() {
        return this.f1588a.getMenu();
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: c */
    public final boolean mo1852c() {
        return this.f1588a.hasExpandedActionView();
    }

    /* renamed from: p */
    private void m1486p() {
        Drawable drawable;
        int i = this.f1592e;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f1596i;
            if (drawable == null) {
                drawable = this.f1595h;
            }
        } else {
            drawable = this.f1595h;
        }
        this.f1588a.setLogo(drawable);
    }

    /* renamed from: q */
    private void m1487q() {
        if ((this.f1592e & 4) != 0) {
            Toolbar toolbar = this.f1588a;
            Drawable drawable = this.f1597j;
            if (drawable == null) {
                drawable = this.f1604q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1588a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: r */
    private void m1488r() {
        if ((this.f1592e & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1600m)) {
            this.f1588a.setNavigationContentDescription(this.f1603p);
        } else {
            this.f1588a.setNavigationContentDescription(this.f1600m);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: b */
    public final Context mo1849b() {
        return this.f1588a.getContext();
    }

    /* renamed from: b */
    private void m1483b(Drawable drawable) {
        this.f1596i = drawable;
        m1486p();
    }

    /* renamed from: c */
    private void m1485c(CharSequence charSequence) {
        this.f1600m = charSequence;
        m1488r();
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: a */
    public final void mo1842a(Drawable drawable) {
        this.f1595h = drawable;
        m1486p();
    }

    /* renamed from: b */
    private void m1484b(CharSequence charSequence) {
        this.f1589b = charSequence;
        if ((this.f1592e & 8) != 0) {
            this.f1588a.setTitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: a */
    public final void mo1844a(Window.Callback callback) {
        this.f1590c = callback;
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: e */
    public final void mo1856e(int i) {
        this.f1588a.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: d */
    public final void mo1854d(int i) {
        String string;
        if (i == 0) {
            string = null;
        } else {
            string = this.f1588a.getContext().getString(i);
        }
        m1485c(string);
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: a */
    public final void mo1841a(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0196a.m619b(this.f1588a.getContext(), i);
        } else {
            drawable = null;
        }
        mo1842a(drawable);
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: b */
    public final void mo1850b(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0196a.m619b(this.f1588a.getContext(), i);
        } else {
            drawable = null;
        }
        m1483b(drawable);
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: c */
    public final void mo1851c(int i) {
        View view;
        int i2 = this.f1592e ^ i;
        this.f1592e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m1488r();
                }
                m1487q();
            }
            if ((i2 & 3) != 0) {
                m1486p();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1588a.setTitle(this.f1589b);
                    this.f1588a.setSubtitle(this.f1599l);
                } else {
                    this.f1588a.setTitle((CharSequence) null);
                    this.f1588a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f1594g) != null) {
                if ((i & 16) != 0) {
                    this.f1588a.addView(view);
                } else {
                    this.f1588a.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: a */
    public final void mo1846a(C0395af afVar) {
        Toolbar toolbar;
        View view = this.f1593f;
        if (view != null && view.getParent() == (toolbar = this.f1588a)) {
            toolbar.removeView(this.f1593f);
        }
        this.f1593f = afVar;
        if (afVar != null && this.f1602o == 2) {
            this.f1588a.addView(afVar, 0);
            Toolbar.C0376b bVar = (Toolbar.C0376b) this.f1593f.getLayoutParams();
            bVar.width = -2;
            bVar.height = -2;
            bVar.f637a = 8388691;
            afVar.setAllowCollapse(true);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: a */
    public final void mo1847a(CharSequence charSequence) {
        if (!this.f1598k) {
            m1484b(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: a */
    public final void mo1848a(boolean z) {
        this.f1588a.setCollapsible(z);
    }

    public C0406am(Toolbar toolbar, boolean z) {
        this(toolbar, z, (byte) 0);
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: a */
    public final C0807z mo1840a(final int i, long j) {
        float f;
        C0807z j2 = C0792v.m2776j(this.f1588a);
        if (i == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return j2.mo2931a(f).mo2932a(j).mo2934a(new C0751ab() {
            /* class androidx.appcompat.widget.C0406am.C04082 */

            /* renamed from: c */
            private boolean f1609c;

            static {
                Covode.recordClassIndex(473);
            }

            @Override // androidx.core.p037h.AbstractC0750aa, androidx.core.p037h.C0751ab
            /* renamed from: c */
            public final void mo1705c(View view) {
                this.f1609c = true;
            }

            @Override // androidx.core.p037h.AbstractC0750aa, androidx.core.p037h.C0751ab
            /* renamed from: a */
            public final void mo557a(View view) {
                C0406am.this.f1588a.setVisibility(0);
            }

            @Override // androidx.core.p037h.AbstractC0750aa, androidx.core.p037h.C0751ab
            /* renamed from: b */
            public final void mo558b(View view) {
                if (!this.f1609c) {
                    C0406am.this.f1588a.setVisibility(i);
                }
            }
        });
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: a */
    public final void mo1843a(Menu menu, AbstractC0318o.AbstractC0319a aVar) {
        if (this.f1601n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1588a.getContext());
            this.f1601n = actionMenuPresenter;
            actionMenuPresenter.f1025h = R.id.cc;
        }
        this.f1601n.f1023f = aVar;
        this.f1588a.setMenu((C0302h) menu, this.f1601n);
    }

    @Override // androidx.appcompat.widget.AbstractC0454v
    /* renamed from: a */
    public final void mo1845a(AbstractC0318o.AbstractC0319a aVar, C0302h.AbstractC0303a aVar2) {
        this.f1588a.setMenuCallbacks(aVar, aVar2);
    }

    private C0406am(Toolbar toolbar, boolean z, byte b) {
        boolean z2;
        Drawable drawable;
        this.f1588a = toolbar;
        this.f1589b = toolbar.getTitle();
        this.f1599l = toolbar.getSubtitle();
        if (this.f1589b != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f1598k = z2;
        this.f1597j = toolbar.getNavigationIcon();
        C0405al a = C0405al.m1466a(toolbar.getContext(), null, new int[]{R.attr.ja, R.attr.jd, R.attr.je, R.attr.pj, R.attr.pk, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.po, R.attr.qr, R.attr.re, R.attr.rg, R.attr.sf, R.attr.v_, R.attr.vg, R.attr.vq, R.attr.vr, R.attr.vu, R.attr.wm, R.attr.y1, R.attr.a3p, R.attr.a67, R.attr.a7j, R.attr.a7v, R.attr.a7w, R.attr.afv, R.attr.afy, R.attr.aiw, R.attr.aj9}, R.attr.h0, 0);
        int i = 15;
        this.f1604q = a.mo1826a(15);
        if (z) {
            CharSequence c = a.mo1831c(27);
            if (!TextUtils.isEmpty(c)) {
                this.f1598k = true;
                m1484b(c);
            }
            CharSequence c2 = a.mo1831c(25);
            if (!TextUtils.isEmpty(c2)) {
                this.f1599l = c2;
                if ((this.f1592e & 8) != 0) {
                    this.f1588a.setSubtitle(c2);
                }
            }
            Drawable a2 = a.mo1826a(20);
            if (a2 != null) {
                m1483b(a2);
            }
            Drawable a3 = a.mo1826a(17);
            if (a3 != null) {
                mo1842a(a3);
            }
            if (this.f1597j == null && (drawable = this.f1604q) != null) {
                this.f1597j = drawable;
                m1487q();
            }
            mo1851c(a.mo1824a(10, 0));
            int g = a.mo1838g(9, 0);
            if (g != 0) {
                View a4 = C1764a.m5927a(LayoutInflater.from(this.f1588a.getContext()), g, this.f1588a, false);
                View view = this.f1594g;
                if (!(view == null || (this.f1592e & 16) == 0)) {
                    this.f1588a.removeView(view);
                }
                this.f1594g = a4;
                if (!(a4 == null || (this.f1592e & 16) == 0)) {
                    this.f1588a.addView(a4);
                }
                mo1851c(this.f1592e | 16);
            }
            int f = a.mo1836f(13, 0);
            if (f > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1588a.getLayoutParams();
                layoutParams.height = f;
                this.f1588a.setLayoutParams(layoutParams);
            }
            int d = a.mo1832d(7, -1);
            int d2 = a.mo1832d(3, -1);
            if (d >= 0 || d2 >= 0) {
                this.f1588a.setContentInsetsRelative(Math.max(d, 0), Math.max(d2, 0));
            }
            int g2 = a.mo1838g(28, 0);
            if (g2 != 0) {
                Toolbar toolbar2 = this.f1588a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), g2);
            }
            int g3 = a.mo1838g(26, 0);
            if (g3 != 0) {
                Toolbar toolbar3 = this.f1588a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), g3);
            }
            int g4 = a.mo1838g(22, 0);
            if (g4 != 0) {
                this.f1588a.setPopupTheme(g4);
            }
        } else {
            if (this.f1588a.getNavigationIcon() != null) {
                this.f1604q = this.f1588a.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f1592e = i;
        }
        a.f1585a.recycle();
        if (R.string.l9 != this.f1603p) {
            this.f1603p = R.string.l9;
            if (TextUtils.isEmpty(this.f1588a.getNavigationContentDescription())) {
                mo1854d(this.f1603p);
            }
        }
        this.f1600m = this.f1588a.getNavigationContentDescription();
        this.f1588a.setNavigationOnClickListener(new View.OnClickListener() {
            /* class androidx.appcompat.widget.C0406am.View$OnClickListenerC04071 */

            /* renamed from: a */
            final C0289a f1605a;

            static {
                Covode.recordClassIndex(472);
            }

            {
                this.f1605a = new C0289a(C0406am.this.f1588a.getContext(), C0406am.this.f1589b);
            }

            public final void onClick(View view) {
                if (C0406am.this.f1590c != null && C0406am.this.f1591d) {
                    C0406am.this.f1590c.onMenuItemSelected(0, this.f1605a);
                }
            }
        });
    }
}
