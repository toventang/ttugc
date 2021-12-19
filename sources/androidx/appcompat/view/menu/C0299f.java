package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.DialogInterfaceC0216c;
import androidx.appcompat.view.menu.AbstractC0318o;
import androidx.appcompat.view.menu.AbstractC0320p;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
public final class C0299f implements AdapterView.OnItemClickListener, AbstractC0318o {

    /* renamed from: a */
    Context f1069a;

    /* renamed from: b */
    LayoutInflater f1070b;

    /* renamed from: c */
    C0302h f1071c;

    /* renamed from: d */
    ExpandedMenuView f1072d;

    /* renamed from: e */
    public int f1073e;

    /* renamed from: f */
    int f1074f;

    /* renamed from: g */
    int f1075g;

    /* renamed from: h */
    public AbstractC0318o.AbstractC0319a f1076h;

    /* renamed from: i */
    C0300a f1077i;

    /* renamed from: j */
    public int f1078j;

    static {
        Covode.recordClassIndex(336);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final boolean mo896a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: b */
    public final boolean mo901b(C0306j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: c */
    public final boolean mo902c(C0306j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: b */
    public final int mo900b() {
        return this.f1078j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.view.menu.f$a */
    public class C0300a extends BaseAdapter {

        /* renamed from: b */
        private int f1080b = -1;

        static {
            Covode.recordClassIndex(337);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final void notifyDataSetChanged() {
            m1087a();
            super.notifyDataSetChanged();
        }

        public final int getCount() {
            int size = C0299f.this.f1071c.mo992k().size() - C0299f.this.f1073e;
            if (this.f1080b < 0) {
                return size;
            }
            return size - 1;
        }

        /* renamed from: a */
        private void m1087a() {
            C0306j jVar = C0299f.this.f1071c.f1100l;
            if (jVar != null) {
                ArrayList<C0306j> k = C0299f.this.f1071c.mo992k();
                int size = k.size();
                for (int i = 0; i < size; i++) {
                    if (k.get(i) == jVar) {
                        this.f1080b = i;
                        return;
                    }
                }
            }
            this.f1080b = -1;
        }

        public C0300a() {
            m1087a();
        }

        /* renamed from: a */
        public final C0306j getItem(int i) {
            ArrayList<C0306j> k = C0299f.this.f1071c.mo992k();
            int i2 = i + C0299f.this.f1073e;
            int i3 = this.f1080b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return k.get(i2);
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = C1764a.m5927a(C0299f.this.f1070b, C0299f.this.f1075g, viewGroup, false);
            }
            ((AbstractC0320p.AbstractC0321a) view).mo795a(getItem(i));
            return view;
        }
    }

    private C0299f() {
        this.f1075g = R.layout.ah;
        this.f1074f = 0;
    }

    /* renamed from: c */
    public final ListAdapter mo932c() {
        if (this.f1077i == null) {
            this.f1077i = new C0300a();
        }
        return this.f1077i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: f */
    public final Parcelable mo920f() {
        if (this.f1072d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f1072d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo894a(AbstractC0318o.AbstractC0319a aVar) {
        this.f1076h = aVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo909a(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f1072d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public C0299f(Context context) {
        this();
        this.f1069a = context;
        this.f1070b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo895a(boolean z) {
        C0300a aVar = this.f1077i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final AbstractC0320p mo931a(ViewGroup viewGroup) {
        if (this.f1072d == null) {
            this.f1072d = (ExpandedMenuView) C1764a.m5927a(this.f1070b, R.layout.ae, viewGroup, false);
            if (this.f1077i == null) {
                this.f1077i = new C0300a();
            }
            this.f1072d.setAdapter((ListAdapter) this.f1077i);
            this.f1072d.setOnItemClickListener(this);
        }
        return this.f1072d;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final boolean mo899a(SubMenuC0328u uVar) {
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        DialogInterface$OnClickListenerC0305i iVar = new DialogInterface$OnClickListenerC0305i(uVar);
        C0302h hVar = iVar.f1114a;
        DialogInterfaceC0216c.C0217a aVar = new DialogInterfaceC0216c.C0217a(hVar.f1089a);
        iVar.f1116c = new C0299f(aVar.f645a.f594a);
        iVar.f1116c.f1076h = iVar;
        iVar.f1114a.mo954a(iVar.f1116c);
        aVar.mo448a(iVar.f1116c.mo932c(), iVar);
        View view = hVar.f1098j;
        if (view != null) {
            aVar.f645a.f600g = view;
        } else {
            aVar.f645a.f597d = hVar.f1097i;
            aVar.mo449a(hVar.f1096h);
        }
        aVar.f645a.f614u = iVar;
        iVar.f1115b = aVar.mo453a();
        iVar.f1115b.setOnDismissListener(iVar);
        WindowManager.LayoutParams attributes = iVar.f1115b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        iVar.f1115b.show();
        AbstractC0318o.AbstractC0319a aVar2 = this.f1076h;
        if (aVar2 == null) {
            return true;
        }
        aVar2.mo560a(uVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo892a(C0302h hVar, boolean z) {
        AbstractC0318o.AbstractC0319a aVar = this.f1076h;
        if (aVar != null) {
            aVar.mo559a(hVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo891a(Context context, C0302h hVar) {
        if (this.f1074f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1074f);
            this.f1069a = contextThemeWrapper;
            this.f1070b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f1069a != null) {
            this.f1069a = context;
            if (this.f1070b == null) {
                this.f1070b = LayoutInflater.from(context);
            }
        }
        this.f1071c = hVar;
        C0300a aVar = this.f1077i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1071c.mo957a(this.f1077i.getItem(i), this, 0);
    }
}
