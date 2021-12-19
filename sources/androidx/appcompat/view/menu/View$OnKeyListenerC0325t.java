package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.AbstractC0318o;
import androidx.appcompat.widget.C0391ac;
import androidx.appcompat.widget.C0456x;
import androidx.core.p037h.C0792v;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.t */
public final class View$OnKeyListenerC0325t extends AbstractC0315m implements View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

    /* renamed from: e */
    private static final int f1172e = R.layout.ak;

    /* renamed from: a */
    final C0391ac f1173a;

    /* renamed from: b */
    final ViewTreeObserver.OnGlobalLayoutListener f1174b = new ViewTreeObserver.OnGlobalLayoutListener() {
        /* class androidx.appcompat.view.menu.View$OnKeyListenerC0325t.ViewTreeObserver$OnGlobalLayoutListenerC03261 */

        static {
            Covode.recordClassIndex(363);
        }

        public final void onGlobalLayout() {
            if (View$OnKeyListenerC0325t.this.mo919e() && !View$OnKeyListenerC0325t.this.f1173a.f1500v) {
                View view = View$OnKeyListenerC0325t.this.f1175c;
                if (view == null || !view.isShown()) {
                    View$OnKeyListenerC0325t.this.mo918d();
                } else {
                    View$OnKeyListenerC0325t.this.f1173a.mo915c();
                }
            }
        }
    };

    /* renamed from: c */
    View f1175c;

    /* renamed from: d */
    ViewTreeObserver f1176d;

    /* renamed from: f */
    private final Context f1177f;

    /* renamed from: h */
    private final C0302h f1178h;

    /* renamed from: i */
    private final C0301g f1179i;

    /* renamed from: j */
    private final boolean f1180j;

    /* renamed from: k */
    private final int f1181k;

    /* renamed from: l */
    private final int f1182l;

    /* renamed from: m */
    private final int f1183m;

    /* renamed from: n */
    private final View.OnAttachStateChangeListener f1184n = new View.OnAttachStateChangeListener() {
        /* class androidx.appcompat.view.menu.View$OnKeyListenerC0325t.View$OnAttachStateChangeListenerC03272 */

        static {
            Covode.recordClassIndex(364);
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (View$OnKeyListenerC0325t.this.f1176d != null) {
                if (!View$OnKeyListenerC0325t.this.f1176d.isAlive()) {
                    View$OnKeyListenerC0325t.this.f1176d = view.getViewTreeObserver();
                }
                View$OnKeyListenerC0325t.this.f1176d.removeGlobalOnLayoutListener(View$OnKeyListenerC0325t.this.f1174b);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: o */
    private PopupWindow.OnDismissListener f1185o;

    /* renamed from: p */
    private View f1186p;

    /* renamed from: q */
    private AbstractC0318o.AbstractC0319a f1187q;

    /* renamed from: r */
    private boolean f1188r;

    /* renamed from: s */
    private boolean f1189s;

    /* renamed from: t */
    private int f1190t;

    /* renamed from: u */
    private int f1191u = 0;

    /* renamed from: v */
    private boolean f1192v;

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo909a(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0315m
    /* renamed from: a */
    public final void mo912a(C0302h hVar) {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final boolean mo896a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: f */
    public final Parcelable mo920f() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0324s
    /* renamed from: g */
    public final ListView mo921g() {
        return this.f1173a.f1483e;
    }

    static {
        Covode.recordClassIndex(362);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0324s
    /* renamed from: d */
    public final void mo918d() {
        if (mo919e()) {
            this.f1173a.mo918d();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0324s
    /* renamed from: e */
    public final boolean mo919e() {
        if (this.f1188r || !this.f1173a.f1501w.isShowing()) {
            return false;
        }
        return true;
    }

    public final void onDismiss() {
        this.f1188r = true;
        this.f1178h.close();
        ViewTreeObserver viewTreeObserver = this.f1176d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1176d = this.f1175c.getViewTreeObserver();
            }
            this.f1176d.removeGlobalOnLayoutListener(this.f1174b);
            this.f1176d = null;
        }
        this.f1175c.removeOnAttachStateChangeListener(this.f1184n);
        PopupWindow.OnDismissListener onDismissListener = this.f1185o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0324s
    /* renamed from: c */
    public final void mo915c() {
        View view;
        boolean z;
        if (!mo919e()) {
            if (this.f1188r || (view = this.f1186p) == null) {
                throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
            }
            this.f1175c = view;
            this.f1173a.mo1710a(this);
            this.f1173a.f1495q = this;
            this.f1173a.mo1711b();
            View view2 = this.f1175c;
            if (this.f1176d == null) {
                z = true;
            } else {
                z = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.f1176d = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1174b);
            }
            view2.addOnAttachStateChangeListener(this.f1184n);
            this.f1173a.f1493o = view2;
            this.f1173a.f1488j = this.f1191u;
            if (!this.f1189s) {
                this.f1190t = m1170a(this.f1179i, null, this.f1177f, this.f1181k);
                this.f1189s = true;
            }
            this.f1173a.mo1712b(this.f1190t);
            this.f1173a.mo1715h();
            this.f1173a.f1499u = this.f1158g;
            this.f1173a.mo915c();
            C0456x xVar = this.f1173a.f1483e;
            xVar.setOnKeyListener(this);
            if (this.f1192v && this.f1178h.f1096h != null) {
                FrameLayout frameLayout = (FrameLayout) C1764a.m5927a(LayoutInflater.from(this.f1177f), R.layout.aj, xVar, false);
                TextView textView = (TextView) frameLayout.findViewById(16908310);
                if (textView != null) {
                    textView.setText(this.f1178h.f1096h);
                }
                frameLayout.setEnabled(false);
                xVar.addHeaderView(frameLayout, null, false);
            }
            this.f1173a.mo1709a(this.f1179i);
            this.f1173a.mo915c();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0315m
    /* renamed from: a */
    public final void mo908a(int i) {
        this.f1191u = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0315m
    /* renamed from: c */
    public final void mo917c(boolean z) {
        this.f1192v = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0315m
    /* renamed from: b */
    public final void mo913b(int i) {
        this.f1173a.f1486h = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0315m
    /* renamed from: c */
    public final void mo916c(int i) {
        this.f1173a.mo1707a(i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0315m
    /* renamed from: a */
    public final void mo910a(View view) {
        this.f1186p = view;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0315m
    /* renamed from: b */
    public final void mo914b(boolean z) {
        this.f1179i.f1082b = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0315m
    /* renamed from: a */
    public final void mo911a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1185o = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo894a(AbstractC0318o.AbstractC0319a aVar) {
        this.f1187q = aVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo895a(boolean z) {
        this.f1189s = false;
        C0301g gVar = this.f1179i;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final boolean mo899a(SubMenuC0328u uVar) {
        if (uVar.hasVisibleItems()) {
            C0316n nVar = new C0316n(this.f1177f, uVar, this.f1175c, this.f1180j, this.f1182l, this.f1183m);
            nVar.mo1129a(this.f1187q);
            nVar.mo1130a(AbstractC0315m.m1172b(uVar));
            nVar.f1161c = this.f1185o;
            this.f1185o = null;
            this.f1178h.mo956a(false);
            int i = this.f1173a.f1486h;
            int f = this.f1173a.mo1714f();
            if ((Gravity.getAbsoluteGravity(this.f1191u, C0792v.m2768e(this.f1186p)) & 7) == 5) {
                i += this.f1186p.getWidth();
            }
            if (!nVar.mo1134e()) {
                if (nVar.f1159a != null) {
                    nVar.mo1128a(i, f, true, true);
                }
            }
            AbstractC0318o.AbstractC0319a aVar = this.f1187q;
            if (aVar != null) {
                aVar.mo560a(uVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo892a(C0302h hVar, boolean z) {
        if (hVar == this.f1178h) {
            mo918d();
            AbstractC0318o.AbstractC0319a aVar = this.f1187q;
            if (aVar != null) {
                aVar.mo559a(hVar, z);
            }
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo918d();
        return true;
    }

    public View$OnKeyListenerC0325t(Context context, C0302h hVar, View view, int i, int i2, boolean z) {
        this.f1177f = context;
        this.f1178h = hVar;
        this.f1180j = z;
        this.f1179i = new C0301g(hVar, LayoutInflater.from(context), z, f1172e);
        this.f1182l = i;
        this.f1183m = i2;
        Resources resources = context.getResources();
        this.f1181k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.a0));
        this.f1186p = view;
        this.f1173a = new C0391ac(context, i, i2);
        hVar.mo955a(this, context);
    }
}
