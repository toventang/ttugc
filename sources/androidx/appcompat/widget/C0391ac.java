package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0301g;
import androidx.appcompat.view.menu.C0302h;
import androidx.appcompat.view.menu.C0306j;
import androidx.appcompat.view.menu.ListMenuItemView;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.ac */
public final class C0391ac extends C0381aa implements AbstractC0390ab {

    /* renamed from: b */
    private static Method f1513b;

    /* renamed from: a */
    public AbstractC0390ab f1514a;

    /* renamed from: androidx.appcompat.widget.ac$a */
    public static class C0392a extends C0456x {

        /* renamed from: c */
        final int f1515c;

        /* renamed from: d */
        final int f1516d;

        /* renamed from: e */
        private AbstractC0390ab f1517e;

        /* renamed from: f */
        private MenuItem f1518f;

        static {
            Covode.recordClassIndex(457);
        }

        @Override // androidx.appcompat.widget.C0456x
        public final /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.C0456x
        public final /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.C0456x
        public final /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.C0456x
        public final /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public final void setHoverListener(AbstractC0390ab abVar) {
            this.f1517e = abVar;
        }

        @Override // android.widget.AbsListView, androidx.appcompat.widget.C0456x
        public final /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        @Override // androidx.appcompat.widget.C0456x
        public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        @Override // androidx.appcompat.widget.C0456x
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C0301g gVar;
            int pointToPosition;
            int i2;
            if (this.f1517e != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    gVar = (C0301g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    gVar = (C0301g) adapter;
                }
                C0306j jVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < gVar.getCount()) {
                    jVar = gVar.getItem(i2);
                }
                MenuItem menuItem = this.f1518f;
                if (menuItem != jVar) {
                    C0302h hVar = gVar.f1081a;
                    if (menuItem != null) {
                        this.f1517e.mo928a(hVar, menuItem);
                    }
                    this.f1518f = jVar;
                    if (jVar != null) {
                        this.f1517e.mo929b(hVar, jVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // androidx.appcompat.widget.C0456x
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1732a(MotionEvent motionEvent, int i) {
            return super.mo1732a(motionEvent, i);
        }

        public C0392a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            int i = Build.VERSION.SDK_INT;
            if (1 == configuration.getLayoutDirection()) {
                this.f1515c = 21;
                this.f1516d = 22;
                return;
            }
            this.f1515c = 22;
            this.f1516d = 21;
        }

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null) {
                if (i == this.f1515c) {
                    if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                        performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                    }
                    return true;
                } else if (i == this.f1516d) {
                    setSelection(-1);
                    ((C0301g) getAdapter()).f1081a.mo956a(false);
                    return true;
                }
            }
            return super.onKeyDown(i, keyEvent);
        }

        @Override // androidx.appcompat.widget.C0456x
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ int mo1731a(int i, int i2, int i3, int i4, int i5) {
            return super.mo1731a(i, i2, i3, i4, i5);
        }
    }

    static {
        Covode.recordClassIndex(456);
        try {
            f1513b = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
        }
    }

    /* renamed from: a */
    public final void mo1729a() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1501w.setEnterTransition(null);
        }
    }

    /* renamed from: l */
    public final void mo1730l() {
        Method method = f1513b;
        if (method != null) {
            try {
                method.invoke(this.f1501w, false);
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0390ab
    /* renamed from: a */
    public final void mo928a(C0302h hVar, MenuItem menuItem) {
        AbstractC0390ab abVar = this.f1514a;
        if (abVar != null) {
            abVar.mo928a(hVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0390ab
    /* renamed from: b */
    public final void mo929b(C0302h hVar, MenuItem menuItem) {
        AbstractC0390ab abVar = this.f1514a;
        if (abVar != null) {
            abVar.mo929b(hVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.C0381aa
    /* renamed from: a */
    public final C0456x mo1706a(Context context, boolean z) {
        C0392a aVar = new C0392a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    public C0391ac(Context context, int i, int i2) {
        super(context, null, i, i2);
    }
}
