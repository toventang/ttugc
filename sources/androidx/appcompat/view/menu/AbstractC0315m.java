package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.m */
public abstract class AbstractC0315m implements AdapterView.OnItemClickListener, AbstractC0318o, AbstractC0324s {

    /* renamed from: g */
    public Rect f1158g;

    static {
        Covode.recordClassIndex(352);
    }

    /* renamed from: a */
    public abstract void mo908a(int i);

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo891a(Context context, C0302h hVar) {
    }

    /* renamed from: a */
    public abstract void mo910a(View view);

    /* renamed from: a */
    public abstract void mo911a(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo912a(C0302h hVar);

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: b */
    public final int mo900b() {
        return 0;
    }

    /* renamed from: b */
    public abstract void mo913b(int i);

    /* renamed from: b */
    public abstract void mo914b(boolean z);

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: b */
    public final boolean mo901b(C0306j jVar) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo916c(int i);

    /* renamed from: c */
    public abstract void mo917c(boolean z);

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: c */
    public final boolean mo902c(C0306j jVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo922h() {
        return true;
    }

    AbstractC0315m() {
    }

    /* renamed from: a */
    protected static C0301g m1171a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0301g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0301g) listAdapter;
    }

    /* renamed from: b */
    protected static boolean m1172b(C0302h hVar) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C0302h hVar = m1171a(listAdapter).f1081a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (mo922h()) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        hVar.mo957a(menuItem, this, i2);
    }

    /* renamed from: a */
    protected static int m1170a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }
}
