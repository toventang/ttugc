package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.Window$CallbackC0286i;
import androidx.appcompat.view.menu.AbstractC0318o;
import androidx.appcompat.view.menu.C0302h;
import androidx.appcompat.widget.AbstractC0454v;
import androidx.appcompat.widget.C0406am;
import androidx.appcompat.widget.Toolbar;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.app.j */
final class C0243j extends AbstractC0211a {

    /* renamed from: a */
    AbstractC0454v f738a;

    /* renamed from: b */
    boolean f739b;

    /* renamed from: c */
    public Window.Callback f740c;

    /* renamed from: d */
    private boolean f741d;

    /* renamed from: e */
    private boolean f742e;

    /* renamed from: f */
    private ArrayList<Object> f743f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f744g = new Runnable() {
        /* class androidx.appcompat.app.C0243j.RunnableC02441 */

        static {
            Covode.recordClassIndex(278);
        }

        public final void run() {
            C0302h hVar;
            C0243j jVar = C0243j.this;
            Menu k = jVar.mo600k();
            if (k instanceof C0302h) {
                hVar = (C0302h) k;
                if (hVar != null) {
                    hVar.mo982e();
                }
            } else {
                hVar = null;
            }
            try {
                k.clear();
                if (!jVar.f740c.onCreatePanelMenu(0, k) || !jVar.f740c.onPreparePanel(0, null, k)) {
                    k.clear();
                }
            } finally {
                if (hVar != null) {
                    hVar.mo983f();
                }
            }
        }
    };

    /* renamed from: h */
    private final Toolbar.AbstractC0377c f745h;

    static {
        Covode.recordClassIndex(277);
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: b */
    public final void mo420b(boolean z) {
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: c */
    public final void mo422c(boolean z) {
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: a */
    public final void mo411a() {
        m799a(0, 8);
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: b */
    public final int mo419b() {
        return this.f738a.mo1864m();
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: c */
    public final void mo421c() {
        this.f738a.mo1856e(8);
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: d */
    public final Context mo423d() {
        return this.f738a.mo1849b();
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: f */
    public final boolean mo426f() {
        return this.f738a.mo1860i();
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: g */
    public final boolean mo427g() {
        return this.f738a.mo1861j();
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: j */
    public final void mo430j() {
        this.f738a.mo1839a().removeCallbacks(this.f744g);
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: h */
    public final boolean mo428h() {
        this.f738a.mo1839a().removeCallbacks(this.f744g);
        C0792v.m2750a(this.f738a.mo1839a(), this.f744g);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: i */
    public final boolean mo429i() {
        if (!this.f738a.mo1852c()) {
            return false;
        }
        this.f738a.mo1853d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Menu mo600k() {
        if (!this.f741d) {
            this.f738a.mo1845a(new C0246a(), new C0247b());
            this.f741d = true;
        }
        return this.f738a.mo1866o();
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: a */
    public final void mo414a(Configuration configuration) {
        super.mo414a(configuration);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.j$a */
    public final class C0246a implements AbstractC0318o.AbstractC0319a {

        /* renamed from: b */
        private boolean f749b;

        static {
            Covode.recordClassIndex(280);
        }

        C0246a() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0318o.AbstractC0319a
        /* renamed from: a */
        public final boolean mo560a(C0302h hVar) {
            if (C0243j.this.f740c == null) {
                return false;
            }
            C0243j.this.f740c.onMenuOpened(108, hVar);
            return true;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0318o.AbstractC0319a
        /* renamed from: a */
        public final void mo559a(C0302h hVar, boolean z) {
            if (!this.f749b) {
                this.f749b = true;
                C0243j.this.f738a.mo1863l();
                if (C0243j.this.f740c != null) {
                    C0243j.this.f740c.onPanelClosed(108, hVar);
                }
                this.f749b = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.j$b */
    public final class C0247b implements C0302h.AbstractC0303a {
        static {
            Covode.recordClassIndex(281);
        }

        @Override // androidx.appcompat.view.menu.C0302h.AbstractC0303a
        /* renamed from: a */
        public final boolean mo539a(C0302h hVar, MenuItem menuItem) {
            return false;
        }

        C0247b() {
        }

        @Override // androidx.appcompat.view.menu.C0302h.AbstractC0303a
        /* renamed from: a */
        public final void mo536a(C0302h hVar) {
            if (C0243j.this.f740c == null) {
                return;
            }
            if (C0243j.this.f738a.mo1858g()) {
                C0243j.this.f740c.onPanelClosed(108, hVar);
            } else if (C0243j.this.f740c.onPreparePanel(0, null, hVar)) {
                C0243j.this.f740c.onMenuOpened(108, hVar);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: a */
    public final void mo412a(float f) {
        C0792v.m2739a(this.f738a.mo1839a(), f);
    }

    /* renamed from: androidx.appcompat.app.j$c */
    class C0248c extends Window$CallbackC0286i {
        static {
            Covode.recordClassIndex(282);
        }

        @Override // androidx.appcompat.view.Window$CallbackC0286i
        public final View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C0243j.this.f738a.mo1849b());
            }
            return super.onCreatePanelView(i);
        }

        public C0248c(Window.Callback callback) {
            super(callback);
        }

        @Override // androidx.appcompat.view.Window$CallbackC0286i
        public final boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel && !C0243j.this.f739b) {
                C0243j.this.f738a.mo1862k();
                C0243j.this.f739b = true;
            }
            return onPreparePanel;
        }
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: d */
    public final void mo424d(boolean z) {
        if (z != this.f742e) {
            this.f742e = z;
            int size = this.f743f.size();
            for (int i = 0; i < size; i++) {
                this.f743f.get(i);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: a */
    public final void mo413a(int i) {
        this.f738a.mo1854d(i);
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: a */
    public final void mo415a(CharSequence charSequence) {
        this.f738a.mo1847a(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: a */
    public final void mo416a(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        m799a(i, 4);
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: a */
    public final boolean mo418a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo426f();
        }
        return true;
    }

    /* renamed from: a */
    private void m799a(int i, int i2) {
        this.f738a.mo1851c((i & i2) | ((i2 ^ -1) & this.f738a.mo1864m()));
    }

    @Override // androidx.appcompat.app.AbstractC0211a
    /* renamed from: a */
    public final boolean mo417a(int i, KeyEvent keyEvent) {
        int i2;
        Menu k = mo600k();
        if (k == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        int keyboardType = KeyCharacterMap.load(i2).getKeyboardType();
        boolean z = true;
        if (keyboardType == 1) {
            z = false;
        }
        k.setQwertyMode(z);
        return k.performShortcut(i, keyEvent, 0);
    }

    C0243j(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        C02452 r2 = new Toolbar.AbstractC0377c() {
            /* class androidx.appcompat.app.C0243j.C02452 */

            static {
                Covode.recordClassIndex(279);
            }

            @Override // androidx.appcompat.widget.Toolbar.AbstractC0377c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return C0243j.this.f740c.onMenuItemSelected(0, menuItem);
            }
        };
        this.f745h = r2;
        this.f738a = new C0406am(toolbar, false);
        C0248c cVar = new C0248c(callback);
        this.f740c = cVar;
        this.f738a.mo1844a(cVar);
        toolbar.setOnMenuItemClickListener(r2);
        this.f738a.mo1847a(charSequence);
    }
}
