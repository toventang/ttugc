package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.AbstractC0318o;
import androidx.appcompat.widget.AbstractC0390ab;
import androidx.appcompat.widget.C0391ac;
import androidx.appcompat.widget.C0456x;
import androidx.core.p037h.C0774e;
import androidx.core.p037h.C0792v;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.e */
public final class View$OnKeyListenerC0293e extends AbstractC0315m implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: h */
    private static final int f1032h = R.layout.ac;

    /* renamed from: A */
    private AbstractC0318o.AbstractC0319a f1033A;

    /* renamed from: B */
    private PopupWindow.OnDismissListener f1034B;

    /* renamed from: a */
    final Handler f1035a;

    /* renamed from: b */
    final List<C0298a> f1036b = new ArrayList();

    /* renamed from: c */
    final ViewTreeObserver.OnGlobalLayoutListener f1037c = new ViewTreeObserver.OnGlobalLayoutListener() {
        /* class androidx.appcompat.view.menu.View$OnKeyListenerC0293e.ViewTreeObserver$OnGlobalLayoutListenerC02941 */

        static {
            Covode.recordClassIndex(331);
        }

        public final void onGlobalLayout() {
            if (View$OnKeyListenerC0293e.this.mo919e() && View$OnKeyListenerC0293e.this.f1036b.size() > 0 && !View$OnKeyListenerC0293e.this.f1036b.get(0).f1066a.f1500v) {
                View view = View$OnKeyListenerC0293e.this.f1038d;
                if (view == null || !view.isShown()) {
                    View$OnKeyListenerC0293e.this.mo918d();
                    return;
                }
                for (C0298a aVar : View$OnKeyListenerC0293e.this.f1036b) {
                    aVar.f1066a.mo915c();
                }
            }
        }
    };

    /* renamed from: d */
    View f1038d;

    /* renamed from: e */
    ViewTreeObserver f1039e;

    /* renamed from: f */
    boolean f1040f;

    /* renamed from: i */
    private final Context f1041i;

    /* renamed from: j */
    private final int f1042j;

    /* renamed from: k */
    private final int f1043k;

    /* renamed from: l */
    private final int f1044l;

    /* renamed from: m */
    private final boolean f1045m;

    /* renamed from: n */
    private final List<C0302h> f1046n = new ArrayList();

    /* renamed from: o */
    private final View.OnAttachStateChangeListener f1047o = new View.OnAttachStateChangeListener() {
        /* class androidx.appcompat.view.menu.View$OnKeyListenerC0293e.View$OnAttachStateChangeListenerC02952 */

        static {
            Covode.recordClassIndex(332);
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (View$OnKeyListenerC0293e.this.f1039e != null) {
                if (!View$OnKeyListenerC0293e.this.f1039e.isAlive()) {
                    View$OnKeyListenerC0293e.this.f1039e = view.getViewTreeObserver();
                }
                View$OnKeyListenerC0293e.this.f1039e.removeGlobalOnLayoutListener(View$OnKeyListenerC0293e.this.f1037c);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: p */
    private final AbstractC0390ab f1048p = new AbstractC0390ab() {
        /* class androidx.appcompat.view.menu.View$OnKeyListenerC0293e.C02963 */

        static {
            Covode.recordClassIndex(333);
        }

        @Override // androidx.appcompat.widget.AbstractC0390ab
        /* renamed from: a */
        public final void mo928a(C0302h hVar, MenuItem menuItem) {
            View$OnKeyListenerC0293e.this.f1035a.removeCallbacksAndMessages(hVar);
        }

        @Override // androidx.appcompat.widget.AbstractC0390ab
        /* renamed from: b */
        public final void mo929b(final C0302h hVar, final MenuItem menuItem) {
            final C0298a aVar = null;
            View$OnKeyListenerC0293e.this.f1035a.removeCallbacksAndMessages(null);
            int size = View$OnKeyListenerC0293e.this.f1036b.size();
            for (int i = 0; i < size; i++) {
                if (hVar == View$OnKeyListenerC0293e.this.f1036b.get(i).f1067b) {
                    if (i != -1) {
                        int i2 = i + 1;
                        if (i2 < View$OnKeyListenerC0293e.this.f1036b.size()) {
                            aVar = View$OnKeyListenerC0293e.this.f1036b.get(i2);
                        }
                        View$OnKeyListenerC0293e.this.f1035a.postAtTime(new Runnable() {
                            /* class androidx.appcompat.view.menu.View$OnKeyListenerC0293e.C02963.RunnableC02971 */

                            static {
                                Covode.recordClassIndex(334);
                            }

                            public final void run() {
                                if (aVar != null) {
                                    View$OnKeyListenerC0293e.this.f1040f = true;
                                    aVar.f1067b.mo956a(false);
                                    View$OnKeyListenerC0293e.this.f1040f = false;
                                }
                                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                                    hVar.mo957a(menuItem, (AbstractC0318o) null, 4);
                                }
                            }
                        }, hVar, SystemClock.uptimeMillis() + 200);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    };

    /* renamed from: q */
    private int f1049q = 0;

    /* renamed from: r */
    private int f1050r = 0;

    /* renamed from: s */
    private View f1051s;

    /* renamed from: t */
    private int f1052t;

    /* renamed from: u */
    private boolean f1053u;

    /* renamed from: v */
    private boolean f1054v;

    /* renamed from: w */
    private int f1055w;

    /* renamed from: x */
    private int f1056x;

    /* renamed from: y */
    private boolean f1057y;

    /* renamed from: z */
    private boolean f1058z;

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo909a(Parcelable parcelable) {
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

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.view.menu.AbstractC0315m
    /* renamed from: h */
    public final boolean mo922h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final boolean mo899a(SubMenuC0328u uVar) {
        for (C0298a aVar : this.f1036b) {
            if (uVar == aVar.f1067b) {
                aVar.f1066a.f1483e.requestFocus();
                return true;
            }
        }
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        mo912a((C0302h) uVar);
        AbstractC0318o.AbstractC0319a aVar2 = this.f1033A;
        if (aVar2 != null) {
            aVar2.mo560a(uVar);
        }
        return true;
    }

    static {
        Covode.recordClassIndex(330);
    }

    /* renamed from: j */
    private int m1051j() {
        if (C0792v.m2768e(this.f1051s) == 1) {
            return 0;
        }
        return 1;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0324s
    /* renamed from: e */
    public final boolean mo919e() {
        if (this.f1036b.size() <= 0 || !this.f1036b.get(0).f1066a.f1501w.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0324s
    /* renamed from: g */
    public final ListView mo921g() {
        if (this.f1036b.isEmpty()) {
            return null;
        }
        List<C0298a> list = this.f1036b;
        return list.get(list.size() - 1).f1066a.f1483e;
    }

    /* renamed from: i */
    private C0391ac m1050i() {
        C0391ac acVar = new C0391ac(this.f1041i, this.f1043k, this.f1044l);
        acVar.f1514a = this.f1048p;
        acVar.f1495q = this;
        acVar.mo1710a(this);
        acVar.f1493o = this.f1051s;
        acVar.f1488j = this.f1050r;
        acVar.mo1711b();
        acVar.mo1715h();
        return acVar;
    }

    public final void onDismiss() {
        int size = this.f1036b.size();
        for (int i = 0; i < size; i++) {
            C0298a aVar = this.f1036b.get(i);
            if (!aVar.f1066a.f1501w.isShowing()) {
                aVar.f1067b.mo956a(false);
                return;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0324s
    /* renamed from: c */
    public final void mo915c() {
        boolean z;
        if (!mo919e()) {
            for (C0302h hVar : this.f1046n) {
                m1048c(hVar);
            }
            this.f1046n.clear();
            View view = this.f1051s;
            this.f1038d = view;
            if (view != null) {
                if (this.f1039e == null) {
                    z = true;
                } else {
                    z = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f1039e = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f1037c);
                }
                this.f1038d.addOnAttachStateChangeListener(this.f1047o);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0324s
    /* renamed from: d */
    public final void mo918d() {
        int size = this.f1036b.size();
        if (size > 0) {
            C0298a[] aVarArr = (C0298a[]) this.f1036b.toArray(new C0298a[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0298a aVar = aVarArr[i];
                if (aVar.f1066a.f1501w.isShowing()) {
                    aVar.f1066a.mo918d();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0315m
    /* renamed from: b */
    public final void mo914b(boolean z) {
        this.f1057y = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0315m
    /* renamed from: c */
    public final void mo917c(boolean z) {
        this.f1058z = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0315m
    /* renamed from: a */
    public final void mo911a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1034B = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0315m
    /* renamed from: b */
    public final void mo913b(int i) {
        this.f1053u = true;
        this.f1055w = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0315m
    /* renamed from: c */
    public final void mo916c(int i) {
        this.f1054v = true;
        this.f1056x = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo894a(AbstractC0318o.AbstractC0319a aVar) {
        this.f1033A = aVar;
    }

    /* renamed from: d */
    private int m1049d(int i) {
        List<C0298a> list = this.f1036b;
        C0456x xVar = list.get(list.size() - 1).f1066a.f1483e;
        int[] iArr = new int[2];
        xVar.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1038d.getWindowVisibleDisplayFrame(rect);
        if (this.f1052t == 1) {
            if (iArr[0] + xVar.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0315m
    /* renamed from: a */
    public final void mo908a(int i) {
        if (this.f1049q != i) {
            this.f1049q = i;
            this.f1050r = C0774e.m2693a(i, C0792v.m2768e(this.f1051s));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0315m
    /* renamed from: a */
    public final void mo910a(View view) {
        if (this.f1051s != view) {
            this.f1051s = view;
            this.f1050r = C0774e.m2693a(this.f1049q, C0792v.m2768e(view));
        }
    }

    /* renamed from: c */
    private void m1048c(C0302h hVar) {
        C0298a aVar;
        View view;
        boolean z;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f1041i);
        C0301g gVar = new C0301g(hVar, from, this.f1045m, f1032h);
        if (!mo919e() && this.f1057y) {
            gVar.f1082b = true;
        } else if (mo919e()) {
            gVar.f1082b = AbstractC0315m.m1172b(hVar);
        }
        int a = m1170a(gVar, null, this.f1041i, this.f1042j);
        C0391ac i4 = m1050i();
        i4.mo1709a(gVar);
        i4.mo1712b(a);
        i4.f1488j = this.f1050r;
        if (this.f1036b.size() > 0) {
            List<C0298a> list = this.f1036b;
            aVar = list.get(list.size() - 1);
            view = m1047a(aVar, hVar);
        } else {
            aVar = null;
            view = null;
        }
        if (view != null) {
            i4.mo1730l();
            i4.mo1729a();
            int d = m1049d(a);
            if (d == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f1052t = d;
            if (Build.VERSION.SDK_INT >= 26) {
                i4.f1493o = view;
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f1051s.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1050r & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1051s.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f1050r & 5) != 5) {
                if (z) {
                    a = view.getWidth();
                }
                i3 = i - a;
                i4.f1486h = i3;
                i4.mo1718k();
                i4.mo1707a(i2);
            } else if (!z) {
                a = view.getWidth();
                i3 = i - a;
                i4.f1486h = i3;
                i4.mo1718k();
                i4.mo1707a(i2);
            }
            i3 = i + a;
            i4.f1486h = i3;
            i4.mo1718k();
            i4.mo1707a(i2);
        } else {
            if (this.f1053u) {
                i4.f1486h = this.f1055w;
            }
            if (this.f1054v) {
                i4.mo1707a(this.f1056x);
            }
            i4.f1499u = this.f1158g;
        }
        this.f1036b.add(new C0298a(i4, hVar, this.f1052t));
        i4.mo915c();
        C0456x xVar = i4.f1483e;
        xVar.setOnKeyListener(this);
        if (aVar == null && this.f1058z && hVar.f1096h != null) {
            FrameLayout frameLayout = (FrameLayout) C1764a.m5927a(from, R.layout.aj, xVar, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(hVar.f1096h);
            xVar.addHeaderView(frameLayout, null, false);
            i4.mo915c();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0315m
    /* renamed from: a */
    public final void mo912a(C0302h hVar) {
        hVar.mo955a(this, this.f1041i);
        if (mo919e()) {
            m1048c(hVar);
        } else {
            this.f1046n.add(hVar);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo895a(boolean z) {
        for (C0298a aVar : this.f1036b) {
            m1171a(aVar.f1066a.f1483e.getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private static MenuItem m1046a(C0302h hVar, C0302h hVar2) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.hasSubMenu() && hVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static View m1047a(C0298a aVar, C0302h hVar) {
        C0301g gVar;
        int i;
        int firstVisiblePosition;
        MenuItem a = m1046a(aVar.f1067b, hVar);
        if (a == null) {
            return null;
        }
        C0456x xVar = aVar.f1066a.f1483e;
        ListAdapter adapter = xVar.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            gVar = (C0301g) headerViewListAdapter.getWrappedAdapter();
        } else {
            gVar = (C0301g) adapter;
            i = 0;
        }
        int count = gVar.getCount();
        while (true) {
            if (i2 >= count) {
                break;
            } else if (a != gVar.getItem(i2)) {
                i2++;
            } else if (i2 != -1 && (firstVisiblePosition = (i2 + i) - xVar.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < xVar.getChildCount()) {
                return xVar.getChildAt(firstVisiblePosition);
            } else {
                return null;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo892a(C0302h hVar, boolean z) {
        int size = this.f1036b.size();
        for (int i = 0; i < size; i++) {
            if (hVar == this.f1036b.get(i).f1067b) {
                if (i >= 0) {
                    int i2 = i + 1;
                    if (i2 < this.f1036b.size()) {
                        this.f1036b.get(i2).f1067b.mo956a(false);
                    }
                    C0298a remove = this.f1036b.remove(i);
                    remove.f1067b.mo971b(this);
                    if (this.f1040f) {
                        C0391ac acVar = remove.f1066a;
                        if (Build.VERSION.SDK_INT >= 23) {
                            acVar.f1501w.setExitTransition(null);
                        }
                        remove.f1066a.f1501w.setAnimationStyle(0);
                    }
                    remove.f1066a.mo918d();
                    int size2 = this.f1036b.size();
                    if (size2 > 0) {
                        this.f1052t = this.f1036b.get(size2 - 1).f1068c;
                    } else {
                        this.f1052t = m1051j();
                        if (size2 == 0) {
                            mo918d();
                            AbstractC0318o.AbstractC0319a aVar = this.f1033A;
                            if (aVar != null) {
                                aVar.mo559a(hVar, true);
                            }
                            ViewTreeObserver viewTreeObserver = this.f1039e;
                            if (viewTreeObserver != null) {
                                if (viewTreeObserver.isAlive()) {
                                    this.f1039e.removeGlobalOnLayoutListener(this.f1037c);
                                }
                                this.f1039e = null;
                            }
                            this.f1038d.removeOnAttachStateChangeListener(this.f1047o);
                            this.f1034B.onDismiss();
                            return;
                        }
                    }
                    if (z) {
                        this.f1036b.get(0).f1067b.mo956a(false);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.view.menu.e$a */
    public static class C0298a {

        /* renamed from: a */
        public final C0391ac f1066a;

        /* renamed from: b */
        public final C0302h f1067b;

        /* renamed from: c */
        public final int f1068c;

        static {
            Covode.recordClassIndex(335);
        }

        public C0298a(C0391ac acVar, C0302h hVar, int i) {
            this.f1066a = acVar;
            this.f1067b = hVar;
            this.f1068c = i;
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo918d();
        return true;
    }

    public View$OnKeyListenerC0293e(Context context, View view, int i, int i2, boolean z) {
        this.f1041i = context;
        this.f1051s = view;
        this.f1043k = i;
        this.f1044l = i2;
        this.f1045m = z;
        this.f1057y = false;
        this.f1052t = m1051j();
        Resources resources = context.getResources();
        this.f1042j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.a0));
        this.f1035a = new Handler();
    }
}
