package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.AbstractC0318o;
import androidx.appcompat.view.menu.C0302h;
import androidx.appcompat.view.menu.C0306j;
import androidx.appcompat.view.menu.SubMenuC0328u;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.f */
public final class C26665f implements AbstractC0318o {

    /* renamed from: a */
    public NavigationMenuView f63184a;

    /* renamed from: b */
    public LinearLayout f63185b;

    /* renamed from: c */
    C0302h f63186c;

    /* renamed from: d */
    public int f63187d;

    /* renamed from: e */
    public C26668b f63188e;

    /* renamed from: f */
    public LayoutInflater f63189f;

    /* renamed from: g */
    int f63190g;

    /* renamed from: h */
    boolean f63191h;

    /* renamed from: i */
    public ColorStateList f63192i;

    /* renamed from: j */
    public ColorStateList f63193j;

    /* renamed from: k */
    public Drawable f63194k;

    /* renamed from: l */
    public int f63195l;

    /* renamed from: m */
    public int f63196m;

    /* renamed from: n */
    public int f63197n;

    /* renamed from: o */
    int f63198o;

    /* renamed from: p */
    final View.OnClickListener f63199p = new View.OnClickListener() {
        /* class com.google.android.material.internal.C26665f.View$OnClickListenerC266661 */

        static {
            Covode.recordClassIndex(32122);
        }

        public final void onClick(View view) {
            C26665f.this.mo44177b(true);
            C0306j itemData = ((NavigationMenuItemView) view).getItemData();
            boolean a = C26665f.this.f63186c.mo957a(itemData, C26665f.this, 0);
            if (itemData != null && itemData.isCheckable() && a) {
                C26665f.this.f63188e.mo44181a(itemData);
            }
            C26665f.this.mo44177b(false);
            C26665f.this.mo895a(false);
        }
    };

    /* renamed from: q */
    private AbstractC0318o.AbstractC0319a f63200q;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.f$d */
    public interface AbstractC26670d {
        static {
            Covode.recordClassIndex(32126);
        }
    }

    static {
        Covode.recordClassIndex(32121);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final boolean mo896a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final boolean mo899a(SubMenuC0328u uVar) {
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.f$c */
    public static class C26669c implements AbstractC26670d {
        static {
            Covode.recordClassIndex(32125);
        }

        C26669c() {
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: b */
    public final int mo900b() {
        return this.f63187d;
    }

    /* renamed from: com.google.android.material.internal.f$b */
    public class C26668b extends RecyclerView.AbstractC1350a<AbstractC26676j> {

        /* renamed from: a */
        final ArrayList<AbstractC26670d> f63202a = new ArrayList<>();

        /* renamed from: b */
        public C0306j f63203b;

        /* renamed from: c */
        public boolean f63204c;

        static {
            Covode.recordClassIndex(32124);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final long getItemId(int i) {
            return (long) i;
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ AbstractC26676j onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m52963a(this, viewGroup, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemCount() {
            return this.f63202a.size();
        }

        /* renamed from: b */
        public final Bundle mo44182b() {
            C0306j jVar;
            View actionView;
            Bundle bundle = new Bundle();
            C0306j jVar2 = this.f63203b;
            if (jVar2 != null) {
                bundle.putInt("android:menu:checked", jVar2.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f63202a.size();
            for (int i = 0; i < size; i++) {
                AbstractC26670d dVar = this.f63202a.get(i);
                if (!(!(dVar instanceof C26672f) || (jVar = ((C26672f) dVar).f63208a) == null || (actionView = jVar.getActionView()) == null)) {
                    ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                    actionView.saveHierarchyState(parcelableSparseArray);
                    sparseArray.put(jVar.getItemId(), parcelableSparseArray);
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo44180a() {
            if (!this.f63204c) {
                this.f63204c = true;
                this.f63202a.clear();
                this.f63202a.add(new C26669c());
                int i = -1;
                int size = C26665f.this.f63186c.mo989i().size();
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0306j jVar = C26665f.this.f63186c.mo989i().get(i3);
                    if (jVar.isChecked()) {
                        mo44181a(jVar);
                    }
                    if (jVar.isCheckable()) {
                        jVar.mo1009a(false);
                    }
                    if (jVar.hasSubMenu()) {
                        SubMenu subMenu = jVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.f63202a.add(new C26671e(C26665f.this.f63198o, 0));
                            }
                            this.f63202a.add(new C26672f(jVar));
                            int size2 = this.f63202a.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                C0306j jVar2 = (C0306j) subMenu.getItem(i4);
                                if (jVar2.isVisible()) {
                                    if (!z2 && jVar2.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (jVar2.isCheckable()) {
                                        jVar2.mo1009a(false);
                                    }
                                    if (jVar.isChecked()) {
                                        mo44181a(jVar);
                                    }
                                    this.f63202a.add(new C26672f(jVar2));
                                }
                            }
                            if (z2) {
                                m52964a(size2, this.f63202a.size());
                            }
                        }
                    } else {
                        int groupId = jVar.getGroupId();
                        if (groupId != i) {
                            i2 = this.f63202a.size();
                            if (jVar.getIcon() != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (i3 != 0) {
                                i2++;
                                this.f63202a.add(new C26671e(C26665f.this.f63198o, C26665f.this.f63198o));
                            }
                        } else if (!z && jVar.getIcon() != null) {
                            m52964a(i2, this.f63202a.size());
                            z = true;
                        }
                        C26672f fVar = new C26672f(jVar);
                        fVar.f63209b = z;
                        this.f63202a.add(fVar);
                        i = groupId;
                    }
                }
                this.f63204c = false;
            }
        }

        public C26668b() {
            mo44180a();
        }

        /* renamed from: a */
        public final void mo44181a(C0306j jVar) {
            if (this.f63203b != jVar && jVar.isCheckable()) {
                C0306j jVar2 = this.f63203b;
                if (jVar2 != null) {
                    jVar2.setChecked(false);
                }
                this.f63203b = jVar;
                jVar.setChecked(true);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemViewType(int i) {
            AbstractC26670d dVar = this.f63202a.get(i);
            if (dVar instanceof C26671e) {
                return 2;
            }
            if (dVar instanceof C26669c) {
                return 3;
            }
            if (!(dVar instanceof C26672f)) {
                throw new RuntimeException("Unknown item type.");
            } else if (((C26672f) dVar).f63208a.hasSubMenu()) {
                return 1;
            } else {
                return 0;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ void onViewRecycled(AbstractC26676j jVar) {
            MethodCollector.m26663i(11646);
            AbstractC26676j jVar2 = jVar;
            if (jVar2 instanceof C26673g) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) jVar2.itemView;
                if (navigationMenuItemView.f63106e != null) {
                    navigationMenuItemView.f63106e.removeAllViews();
                }
                navigationMenuItemView.f63105d.setCompoundDrawables(null, null, null, null);
            }
            MethodCollector.m26664o(11646);
        }

        /* renamed from: a */
        private void m52964a(int i, int i2) {
            while (i < i2) {
                ((C26672f) this.f63202a.get(i)).f63209b = true;
                i++;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ void onBindViewHolder(AbstractC26676j jVar, int i) {
            Drawable drawable;
            AbstractC26676j jVar2 = jVar;
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) jVar2.itemView;
                navigationMenuItemView.setIconTintList(C26665f.this.f63193j);
                if (C26665f.this.f63191h) {
                    navigationMenuItemView.setTextAppearance(C26665f.this.f63190g);
                }
                if (C26665f.this.f63192i != null) {
                    navigationMenuItemView.setTextColor(C26665f.this.f63192i);
                }
                if (C26665f.this.f63194k != null) {
                    drawable = C26665f.this.f63194k.getConstantState().newDrawable();
                } else {
                    drawable = null;
                }
                C0792v.m2746a(navigationMenuItemView, drawable);
                C26672f fVar = (C26672f) this.f63202a.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(fVar.f63209b);
                navigationMenuItemView.setHorizontalPadding(C26665f.this.f63195l);
                navigationMenuItemView.setIconPadding(C26665f.this.f63196m);
                navigationMenuItemView.mo795a(fVar.f63208a);
            } else if (itemViewType == 1) {
                ((TextView) jVar2.itemView).setText(((C26672f) this.f63202a.get(i)).f63208a.getTitle());
            } else if (itemViewType == 2) {
                C26671e eVar = (C26671e) this.f63202a.get(i);
                jVar2.itemView.setPadding(0, eVar.f63206a, 0, eVar.f63207b);
            }
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m52963a(C26668b bVar, ViewGroup viewGroup, int i) {
            RecyclerView.ViewHolder viewHolder;
            MethodCollector.m26663i(11648);
            boolean z = true;
            if (i == 0) {
                viewHolder = new C26673g(C26665f.this.f63189f, viewGroup, C26665f.this.f63199p);
            } else if (i == 1) {
                viewHolder = new C26675i(C26665f.this.f63189f, viewGroup);
            } else if (i == 2) {
                viewHolder = new C26674h(C26665f.this.f63189f, viewGroup);
            } else if (i != 3) {
                viewHolder = null;
            } else {
                viewHolder = new C26667a(C26665f.this.f63185b);
            }
            try {
                if (viewHolder.itemView.getParent() != null) {
                    try {
                        z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                        C22708a.m42800a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewHolder.itemView);
                        }
                    }
                }
            } catch (Exception e) {
                C63423ai.m115002a(e);
                C51423a.m95786a(e);
            }
            C80493gg.f180088a = viewHolder.getClass().getName();
            MethodCollector.m26664o(11648);
            return viewHolder;
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: f */
    public final Parcelable mo920f() {
        Bundle bundle = new Bundle();
        if (this.f63184a != null) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            this.f63184a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C26668b bVar = this.f63188e;
        if (bVar != null) {
            bundle.putBundle("android:menu:adapter", bVar.mo44182b());
        }
        if (this.f63185b != null) {
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            this.f63185b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.f$a */
    public static class C26667a extends AbstractC26676j {
        static {
            Covode.recordClassIndex(32123);
        }

        public C26667a(View view) {
            super(view);
        }
    }

    /* renamed from: com.google.android.material.internal.f$j */
    static abstract class AbstractC26676j extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(32132);
        }

        public AbstractC26676j(View view) {
            super(view);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo894a(AbstractC0318o.AbstractC0319a aVar) {
        this.f63200q = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.f$f */
    public static class C26672f implements AbstractC26670d {

        /* renamed from: a */
        public final C0306j f63208a;

        /* renamed from: b */
        boolean f63209b;

        static {
            Covode.recordClassIndex(32128);
        }

        C26672f(C0306j jVar) {
            this.f63208a = jVar;
        }
    }

    /* renamed from: a */
    public final void mo44172a(ColorStateList colorStateList) {
        this.f63193j = colorStateList;
        mo895a(false);
    }

    /* renamed from: b */
    public final void mo44175b(int i) {
        this.f63195l = i;
        mo895a(false);
    }

    /* renamed from: c */
    public final void mo44178c(int i) {
        this.f63196m = i;
        mo895a(false);
    }

    /* renamed from: a */
    public final void mo44171a(int i) {
        this.f63190g = i;
        this.f63191h = true;
        mo895a(false);
    }

    /* renamed from: b */
    public final void mo44176b(ColorStateList colorStateList) {
        this.f63192i = colorStateList;
        mo895a(false);
    }

    /* renamed from: b */
    public final void mo44177b(boolean z) {
        C26668b bVar = this.f63188e;
        if (bVar != null) {
            bVar.f63204c = z;
        }
    }

    /* renamed from: a */
    public final void mo44173a(Drawable drawable) {
        this.f63194k = drawable;
        mo895a(false);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo909a(Parcelable parcelable) {
        C0306j jVar;
        View actionView;
        SparseArray<Parcelable> sparseArray;
        C0306j jVar2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f63184a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                C26668b bVar = this.f63188e;
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    bVar.f63204c = true;
                    int size = bVar.f63202a.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        AbstractC26670d dVar = bVar.f63202a.get(i2);
                        if ((dVar instanceof C26672f) && (jVar2 = ((C26672f) dVar).f63208a) != null && jVar2.getItemId() == i) {
                            bVar.mo44181a(jVar2);
                            break;
                        }
                        i2++;
                    }
                    bVar.f63204c = false;
                    bVar.mo44180a();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = bVar.f63202a.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        AbstractC26670d dVar2 = bVar.f63202a.get(i3);
                        if (!(!(dVar2 instanceof C26672f) || (jVar = ((C26672f) dVar2).f63208a) == null || (actionView = jVar.getActionView()) == null || (sparseArray = (SparseArray) sparseParcelableArray2.get(jVar.getItemId())) == null)) {
                            actionView.restoreHierarchyState(sparseArray);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f63185b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    /* renamed from: a */
    public final void mo44174a(C0306j jVar) {
        this.f63188e.mo44181a(jVar);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo895a(boolean z) {
        C26668b bVar = this.f63188e;
        if (bVar != null) {
            bVar.mo44180a();
            bVar.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.f$e */
    public static class C26671e implements AbstractC26670d {

        /* renamed from: a */
        public final int f63206a;

        /* renamed from: b */
        public final int f63207b;

        static {
            Covode.recordClassIndex(32127);
        }

        public C26671e(int i, int i2) {
            this.f63206a = i;
            this.f63207b = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.f$h */
    public static class C26674h extends AbstractC26676j {
        static {
            Covode.recordClassIndex(32130);
        }

        public C26674h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(C1764a.m5927a(layoutInflater, R.layout.vr, viewGroup, false));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.f$i */
    public static class C26675i extends AbstractC26676j {
        static {
            Covode.recordClassIndex(32131);
        }

        public C26675i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(C1764a.m5927a(layoutInflater, R.layout.vs, viewGroup, false));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo891a(Context context, C0302h hVar) {
        this.f63189f = LayoutInflater.from(context);
        this.f63186c = hVar;
        this.f63198o = context.getResources().getDimensionPixelOffset(R.dimen.hy);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo892a(C0302h hVar, boolean z) {
        AbstractC0318o.AbstractC0319a aVar = this.f63200q;
        if (aVar != null) {
            aVar.mo559a(hVar, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.f$g */
    public static class C26673g extends AbstractC26676j {
        static {
            Covode.recordClassIndex(32129);
        }

        public C26673g(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(C1764a.m5927a(layoutInflater, R.layout.vp, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }
}
