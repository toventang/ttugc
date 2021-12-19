package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.AbstractC0274b;
import androidx.appcompat.view.C0273a;
import androidx.appcompat.view.C0281g;
import androidx.appcompat.view.C0284h;
import androidx.appcompat.view.menu.C0302h;
import androidx.appcompat.widget.AbstractC0454v;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0395af;
import androidx.appcompat.widget.Toolbar;
import androidx.core.p037h.AbstractC0750aa;
import androidx.core.p037h.AbstractC0752ac;
import androidx.core.p037h.C0751ab;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.C0807z;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.app.m */
public class C0252m extends AbstractC0211a implements ActionBarOverlayLayout.AbstractC0334a {

    /* renamed from: s */
    static final /* synthetic */ boolean f766s = true;

    /* renamed from: t */
    private static final Interpolator f767t = new AccelerateInterpolator();

    /* renamed from: u */
    private static final Interpolator f768u = new DecelerateInterpolator();

    /* renamed from: A */
    private boolean f769A;

    /* renamed from: B */
    private boolean f770B;

    /* renamed from: C */
    private ArrayList<Object> f771C = new ArrayList<>();

    /* renamed from: D */
    private boolean f772D;

    /* renamed from: E */
    private int f773E = 0;

    /* renamed from: F */
    private boolean f774F;

    /* renamed from: G */
    private boolean f775G = true;

    /* renamed from: H */
    private boolean f776H;

    /* renamed from: a */
    Context f777a;

    /* renamed from: b */
    ActionBarOverlayLayout f778b;

    /* renamed from: c */
    ActionBarContainer f779c;

    /* renamed from: d */
    AbstractC0454v f780d;

    /* renamed from: e */
    ActionBarContextView f781e;

    /* renamed from: f */
    View f782f;

    /* renamed from: g */
    C0395af f783g;

    /* renamed from: h */
    C0256a f784h;

    /* renamed from: i */
    AbstractC0274b f785i;

    /* renamed from: j */
    AbstractC0274b.AbstractC0275a f786j;

    /* renamed from: k */
    boolean f787k = true;

    /* renamed from: l */
    boolean f788l;

    /* renamed from: m */
    boolean f789m;

    /* renamed from: n */
    C0284h f790n;

    /* renamed from: o */
    boolean f791o;

    /* renamed from: p */
    final AbstractC0750aa f792p = new C0751ab() {
        /* class androidx.appcompat.app.C0252m.C02531 */

        static {
            Covode.recordClassIndex(287);
        }

        @Override // androidx.core.p037h.AbstractC0750aa, androidx.core.p037h.C0751ab
        /* renamed from: b */
        public final void mo558b(View view) {
            if (C0252m.this.f787k && C0252m.this.f782f != null) {
                C0252m.this.f782f.setTranslationY(0.0f);
                C0252m.this.f779c.setTranslationY(0.0f);
            }
            C0252m.this.f779c.setVisibility(8);
            C0252m.this.f779c.setTransitioning(false);
            C0252m.this.f790n = null;
            C0252m mVar = C0252m.this;
            if (mVar.f786j != null) {
                mVar.f786j.mo561a(mVar.f785i);
                mVar.f785i = null;
                mVar.f786j = null;
            }
            if (C0252m.this.f778b != null) {
                C0792v.m2780n(C0252m.this.f778b);
            }
        }
    };

    /* renamed from: q */
    final AbstractC0750aa f793q = new C0751ab() {
        /* class androidx.appcompat.app.C0252m.C02542 */

        static {
            Covode.recordClassIndex(288);
        }

        @Override // androidx.core.p037h.AbstractC0750aa, androidx.core.p037h.C0751ab
        /* renamed from: b */
        public final void mo558b(View view) {
            C0252m.this.f790n = null;
            C0252m.this.f779c.requestLayout();
        }
    };

    /* renamed from: r */
    final AbstractC0752ac f794r = new AbstractC0752ac() {
        /* class androidx.appcompat.app.C0252m.C02553 */

        static {
            Covode.recordClassIndex(289);
        }

        @Override // androidx.core.p037h.AbstractC0752ac
        /* renamed from: a */
        public final void mo612a() {
            ((View) C0252m.this.f779c.getParent()).invalidate();
        }
    };

    /* renamed from: v */
    private Context f795v;

    /* renamed from: w */
    private Activity f796w;

    /* renamed from: x */
    private Dialog f797x;

    /* renamed from: y */
    private ArrayList<Object> f798y = new ArrayList<>();

    /* renamed from: z */
    private int f799z = -1;

    /* renamed from: a */
    static boolean m836a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: androidx.appcompat.app.m$a */
    public class C0256a extends AbstractC0274b implements C0302h.AbstractC0303a {

        /* renamed from: a */
        final C0302h f803a;

        /* renamed from: e */
        private final Context f805e;

        /* renamed from: f */
        private AbstractC0274b.AbstractC0275a f806f;

        /* renamed from: g */
        private WeakReference<View> f807g;

        static {
            Covode.recordClassIndex(290);
        }

        @Override // androidx.appcompat.view.AbstractC0274b
        /* renamed from: b */
        public final Menu mo618b() {
            return this.f803a;
        }

        @Override // androidx.appcompat.view.AbstractC0274b
        /* renamed from: a */
        public final MenuInflater mo613a() {
            return new C0281g(this.f805e);
        }

        @Override // androidx.appcompat.view.AbstractC0274b
        /* renamed from: h */
        public final boolean mo626h() {
            return C0252m.this.f781e.f1207g;
        }

        @Override // androidx.appcompat.view.AbstractC0274b
        /* renamed from: f */
        public final CharSequence mo624f() {
            return C0252m.this.f781e.getTitle();
        }

        @Override // androidx.appcompat.view.AbstractC0274b
        /* renamed from: g */
        public final CharSequence mo625g() {
            return C0252m.this.f781e.getSubtitle();
        }

        @Override // androidx.appcompat.view.AbstractC0274b
        /* renamed from: i */
        public final View mo627i() {
            WeakReference<View> weakReference = this.f807g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.AbstractC0274b
        /* renamed from: d */
        public final void mo622d() {
            if (C0252m.this.f784h == this) {
                this.f803a.mo982e();
                try {
                    this.f806f.mo564b(this, this.f803a);
                } finally {
                    this.f803a.mo983f();
                }
            }
        }

        /* renamed from: e */
        public final boolean mo623e() {
            this.f803a.mo982e();
            try {
                return this.f806f.mo562a(this, this.f803a);
            } finally {
                this.f803a.mo983f();
            }
        }

        @Override // androidx.appcompat.view.AbstractC0274b
        /* renamed from: c */
        public final void mo621c() {
            if (C0252m.this.f784h == this) {
                if (!C0252m.m836a(C0252m.this.f788l, C0252m.this.f789m, false)) {
                    C0252m.this.f785i = this;
                    C0252m.this.f786j = this.f806f;
                } else {
                    this.f806f.mo561a(this);
                }
                this.f806f = null;
                C0252m.this.mo608f(false);
                C0252m.this.f781e.mo1203b();
                C0252m.this.f780d.mo1839a().sendAccessibilityEvent(32);
                C0252m.this.f778b.setHideOnContentScrollEnabled(C0252m.this.f791o);
                C0252m.this.f784h = null;
            }
        }

        @Override // androidx.appcompat.view.AbstractC0274b
        /* renamed from: b */
        public final void mo620b(CharSequence charSequence) {
            C0252m.this.f781e.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.AbstractC0274b
        /* renamed from: a */
        public final void mo614a(int i) {
            mo620b(C0252m.this.f777a.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.AbstractC0274b
        /* renamed from: b */
        public final void mo619b(int i) {
            mo616a(C0252m.this.f777a.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.AbstractC0274b
        /* renamed from: a */
        public final void mo615a(View view) {
            C0252m.this.f781e.setCustomView(view);
            this.f807g = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.menu.C0302h.AbstractC0303a
        /* renamed from: a */
        public final void mo536a(C0302h hVar) {
            if (this.f806f != null) {
                mo622d();
                C0252m.this.f781e.mo1202a();
            }
        }

        @Override // androidx.appcompat.view.AbstractC0274b
        /* renamed from: a */
        public final void mo616a(CharSequence charSequence) {
            C0252m.this.f781e.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.AbstractC0274b
        /* renamed from: a */
        public final void mo617a(boolean z) {
            super.mo617a(z);
            C0252m.this.f781e.setTitleOptional(z);
        }

        @Override // androidx.appcompat.view.menu.C0302h.AbstractC0303a
        /* renamed from: a */
        public final boolean mo539a(C0302h hVar, MenuItem menuItem) {
            AbstractC0274b.AbstractC0275a aVar = this.f806f;
            if (aVar != null) {
                return aVar.mo563a(this, menuItem);
            }
            return false;
        }

        public C0256a(Context context, AbstractC0274b.AbstractC0275a aVar) {
            this.f805e = context;
            this.f806f = aVar;
            C0302h hVar = new C0302h(context);
            hVar.f1094f = 1;
            this.f803a = hVar;
            hVar.mo953a(this);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: a */
    public final void mo416a(boolean z) {
        m834a(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: a */
    public final boolean mo417a(int i, KeyEvent keyEvent) {
        C0302h hVar;
        C0256a aVar = this.f784h;
        if (aVar == null || (hVar = aVar.f803a) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        hVar.setQwertyMode(z);
        return hVar.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: n */
    private int m842n() {
        return this.f780d.mo1865n();
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: a */
    public final void mo411a() {
        m834a(0, 8);
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: b */
    public final int mo419b() {
        return this.f780d.mo1864m();
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: c */
    public final void mo421c() {
        if (!this.f788l) {
            this.f788l = true;
            m839h(false);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0334a
    /* renamed from: k */
    public final void mo609k() {
        if (this.f789m) {
            this.f789m = false;
            m839h(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0334a
    /* renamed from: l */
    public final void mo610l() {
        if (!this.f789m) {
            this.f789m = true;
            m839h(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0334a
    /* renamed from: m */
    public final void mo611m() {
        C0284h hVar = this.f790n;
        if (hVar != null) {
            hVar.mo779b();
            this.f790n = null;
        }
    }

    static {
        Covode.recordClassIndex(286);
    }

    /* renamed from: o */
    private void m843o() {
        if (!this.f774F) {
            this.f774F = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f778b;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m839h(false);
        }
    }

    /* renamed from: p */
    private void m844p() {
        if (this.f774F) {
            this.f774F = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f778b;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m839h(false);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: e */
    public final void mo425e() {
        if (this.f778b.f1224b) {
            this.f791o = true;
            this.f778b.setHideOnContentScrollEnabled(true);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: i */
    public final boolean mo429i() {
        AbstractC0454v vVar = this.f780d;
        if (vVar == null || !vVar.mo1852c()) {
            return false;
        }
        this.f780d.mo1853d();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: d */
    public final Context mo423d() {
        if (this.f795v == null) {
            TypedValue typedValue = new TypedValue();
            this.f777a.getTheme().resolveAttribute(R.attr.h5, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f795v = new ContextThemeWrapper(this.f777a, i);
            } else {
                this.f795v = this.f777a;
            }
        }
        return this.f795v;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0334a
    /* renamed from: b */
    public final void mo606b(int i) {
        this.f773E = i;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0334a
    /* renamed from: e */
    public final void mo607e(boolean z) {
        this.f787k = z;
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: b */
    public final void mo420b(boolean z) {
        if (!this.f769A) {
            mo416a(z);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: c */
    public final void mo422c(boolean z) {
        C0284h hVar;
        this.f776H = z;
        if (!z && (hVar = this.f790n) != null) {
            hVar.mo779b();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: d */
    public final void mo424d(boolean z) {
        if (z != this.f770B) {
            this.f770B = z;
            int size = this.f771C.size();
            for (int i = 0; i < size; i++) {
                this.f771C.get(i);
            }
        }
    }

    public C0252m(Dialog dialog) {
        this.f797x = dialog;
        m835a(dialog.getWindow().getDecorView());
    }

    /* renamed from: b */
    private static AbstractC0454v m837b(View view) {
        String str;
        if (view instanceof AbstractC0454v) {
            return (AbstractC0454v) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        if (view != null) {
            str = view.getClass().getSimpleName();
        } else {
            str = "null";
        }
        throw new IllegalStateException(sb.append(str).toString());
    }

    /* renamed from: h */
    private void m839h(boolean z) {
        if (m836a(this.f788l, this.f789m, this.f774F)) {
            if (!this.f775G) {
                this.f775G = true;
                m840i(z);
            }
        } else if (this.f775G) {
            this.f775G = false;
            m841j(z);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: a */
    public final AbstractC0274b mo410a(AbstractC0274b.AbstractC0275a aVar) {
        C0256a aVar2 = this.f784h;
        if (aVar2 != null) {
            aVar2.mo621c();
        }
        this.f778b.setHideOnContentScrollEnabled(false);
        this.f781e.mo1204c();
        C0256a aVar3 = new C0256a(this.f781e.getContext(), aVar);
        if (!aVar3.mo623e()) {
            return null;
        }
        this.f784h = aVar3;
        aVar3.mo622d();
        this.f781e.mo1201a(aVar3);
        mo608f(true);
        this.f781e.sendAccessibilityEvent(32);
        return aVar3;
    }

    /* renamed from: g */
    private void m838g(boolean z) {
        boolean z2;
        boolean z3;
        this.f772D = z;
        if (!z) {
            this.f780d.mo1846a((C0395af) null);
            this.f779c.setTabContainer(this.f783g);
        } else {
            this.f779c.setTabContainer(null);
            this.f780d.mo1846a(this.f783g);
        }
        boolean z4 = true;
        if (m842n() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0395af afVar = this.f783g;
        if (afVar != null) {
            if (z2) {
                afVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f778b;
                if (actionBarOverlayLayout != null) {
                    C0792v.m2780n(actionBarOverlayLayout);
                }
            } else {
                afVar.setVisibility(8);
            }
        }
        AbstractC0454v vVar = this.f780d;
        if (this.f772D || !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        vVar.mo1848a(z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f778b;
        if (this.f772D || !z2) {
            z4 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z4);
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: a */
    public final void mo412a(float f) {
        C0792v.m2739a(this.f779c, f);
    }

    /* renamed from: f */
    public final void mo608f(boolean z) {
        C0807z a;
        C0807z a2;
        if (z) {
            m843o();
        } else {
            m844p();
        }
        if (C0792v.m2788v(this.f779c)) {
            if (z) {
                a2 = this.f780d.mo1840a(4, 100);
                a = this.f781e.mo1200a(0, 200);
            } else {
                a = this.f780d.mo1840a(0, 200);
                a2 = this.f781e.mo1200a(8, 100);
            }
            C0284h hVar = new C0284h();
            hVar.mo777a(a2, a);
            hVar.mo778a();
        } else if (z) {
            this.f780d.mo1856e(4);
            this.f781e.setVisibility(0);
        } else {
            this.f780d.mo1856e(0);
            this.f781e.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m835a(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.ahy);
        this.f778b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f780d = m837b(view.findViewById(R.id.bx));
        this.f781e = (ActionBarContextView) view.findViewById(R.id.c7);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.bz);
        this.f779c = actionBarContainer;
        AbstractC0454v vVar = this.f780d;
        if (vVar == null || this.f781e == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f777a = vVar.mo1849b();
        if ((this.f780d.mo1864m() & 4) != 0) {
            this.f769A = true;
        }
        C0273a a = C0273a.m938a(this.f777a);
        a.mo740c();
        m838g(a.mo739b());
        TypedArray obtainStyledAttributes = this.f777a.obtainStyledAttributes(null, new int[]{R.attr.ja, R.attr.jd, R.attr.je, R.attr.pj, R.attr.pk, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.po, R.attr.qr, R.attr.re, R.attr.rg, R.attr.sf, R.attr.v_, R.attr.vg, R.attr.vq, R.attr.vr, R.attr.vu, R.attr.wm, R.attr.y1, R.attr.a3p, R.attr.a67, R.attr.a7j, R.attr.a7v, R.attr.a7w, R.attr.afv, R.attr.afy, R.attr.aiw, R.attr.aj9}, R.attr.h0, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            mo425e();
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            mo412a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: i */
    private void m840i(boolean z) {
        View view;
        View view2;
        C0284h hVar = this.f790n;
        if (hVar != null) {
            hVar.mo779b();
        }
        this.f779c.setVisibility(0);
        if (this.f773E != 0 || (!this.f776H && !z)) {
            this.f779c.setAlpha(1.0f);
            this.f779c.setTranslationY(0.0f);
            if (this.f787k && (view = this.f782f) != null) {
                view.setTranslationY(0.0f);
            }
            this.f793q.mo558b(null);
        } else {
            this.f779c.setTranslationY(0.0f);
            float f = (float) (-this.f779c.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f779c.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f779c.setTranslationY(f);
            C0284h hVar2 = new C0284h();
            C0807z b = C0792v.m2776j(this.f779c).mo2937b(0.0f);
            b.mo2935a(this.f794r);
            hVar2.mo776a(b);
            if (this.f787k && (view2 = this.f782f) != null) {
                view2.setTranslationY(f);
                hVar2.mo776a(C0792v.m2776j(this.f782f).mo2937b(0.0f));
            }
            hVar2.mo774a(f768u);
            hVar2.mo780c();
            hVar2.mo775a(this.f793q);
            this.f790n = hVar2;
            hVar2.mo778a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f778b;
        if (actionBarOverlayLayout != null) {
            C0792v.m2780n(actionBarOverlayLayout);
        }
    }

    /* renamed from: j */
    private void m841j(boolean z) {
        View view;
        C0284h hVar = this.f790n;
        if (hVar != null) {
            hVar.mo779b();
        }
        if (this.f773E != 0 || (!this.f776H && !z)) {
            this.f792p.mo558b(null);
            return;
        }
        this.f779c.setAlpha(1.0f);
        this.f779c.setTransitioning(true);
        C0284h hVar2 = new C0284h();
        float f = (float) (-this.f779c.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f779c.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C0807z b = C0792v.m2776j(this.f779c).mo2937b(f);
        b.mo2935a(this.f794r);
        hVar2.mo776a(b);
        if (this.f787k && (view = this.f782f) != null) {
            hVar2.mo776a(C0792v.m2776j(view).mo2937b(f));
        }
        hVar2.mo774a(f767t);
        hVar2.mo780c();
        hVar2.mo775a(this.f792p);
        this.f790n = hVar2;
        hVar2.mo778a();
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: a */
    public final void mo413a(int i) {
        this.f780d.mo1854d(i);
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: a */
    public final void mo414a(Configuration configuration) {
        m838g(C0273a.m938a(this.f777a).mo739b());
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: a */
    public final void mo415a(CharSequence charSequence) {
        this.f780d.mo1847a(charSequence);
    }

    /* renamed from: a */
    private void m834a(int i, int i2) {
        int m = this.f780d.mo1864m();
        if ((i2 & 4) != 0) {
            this.f769A = true;
        }
        this.f780d.mo1851c((i & i2) | ((i2 ^ -1) & m));
    }

    public C0252m(Activity activity, boolean z) {
        this.f796w = activity;
        View decorView = activity.getWindow().getDecorView();
        m835a(decorView);
        if (!z) {
            this.f782f = decorView.findViewById(16908290);
        }
    }
}
