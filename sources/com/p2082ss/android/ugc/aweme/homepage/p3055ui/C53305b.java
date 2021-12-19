package com.p2082ss.android.ugc.aweme.homepage.p3055ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.p2082ss.android.ugc.aweme.AbstractC35329by;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34681b;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.p3056a.AbstractC53302a;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.HomeTabViewModel;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.b */
public final class C53305b extends AbstractC34681b {

    /* renamed from: e */
    public static final C53306a f122347e = new C53306a((byte) 0);

    /* renamed from: c */
    public SparseArray<Fragment> f122348c = new SparseArray<>();

    /* renamed from: d */
    public boolean f122349d;

    /* renamed from: f */
    private final AbstractC18234b f122350f;

    /* renamed from: g */
    private final ActivityC0945e f122351g;

    /* renamed from: h */
    private final List<AbstractC35329by> f122352h;

    /* renamed from: i */
    private WeakReference<Fragment> f122353i;

    /* renamed from: j */
    private final AbstractC53302a f122354j;

    static {
        Covode.recordClassIndex(62856);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.b$a */
    public static final class C53306a {
        static {
            Covode.recordClassIndex(62857);
        }

        private C53306a() {
        }

        public /* synthetic */ C53306a(byte b) {
            this();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f122352h.size();
    }

    /* renamed from: a */
    public final Fragment mo89711a() {
        WeakReference<Fragment> weakReference = this.f122353i;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        return this.f122352h.get(i).mo62207Y_();
    }

    /* renamed from: b */
    public final int mo89712b(int i) {
        if (i < 0 || i >= this.f122352h.size()) {
            return -1;
        }
        return this.f122352h.get(i).mo57291a();
    }

    /* renamed from: c */
    public final int mo89713c(int i) {
        if (this.f122352h.size() <= 0) {
            return -1;
        }
        int size = this.f122352h.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f122352h.get(i2).mo57291a() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b8  */
    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34681b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.Fragment mo61341a(int r11) {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.p3055ui.C53305b.mo61341a(int):androidx.fragment.app.Fragment");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.util.SparseArray<androidx.fragment.app.Fragment> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.viewpager.widget.PagerAdapter, com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34681b
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        C89219l.m154716b(instantiateItem, "");
        SparseArray<Fragment> sparseArray = this.f122348c;
        Objects.requireNonNull(instantiateItem, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        sparseArray.put(i, instantiateItem);
        AbstractC53302a aVar = this.f122354j;
        if (aVar != null) {
            aVar.mo89709a(this.f122348c);
        }
        return instantiateItem;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53305b(AbstractC18234b bVar, AbstractC53302a aVar) {
        super(bVar.getChildFragmentManager());
        C89219l.m154721d(bVar, "");
        this.f122354j = aVar;
        this.f122350f = bVar;
        Context context = bVar.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC0945e eVar = (ActivityC0945e) context;
        this.f122351g = eVar;
        this.f122352h = HomeTabViewModel.C53309a.m98315a(eVar).mo89740b();
        SharePrefCache inst = SharePrefCache.inst();
        C89219l.m154716b(inst, "");
        C33594aj<Boolean> showTimeLineTab = inst.getShowTimeLineTab();
        C89219l.m154716b(showTimeLineTab, "");
        Boolean c = showTimeLineTab.mo59941c();
        C89219l.m154716b(c, "");
        this.f122349d = c.booleanValue();
        if (aVar != null) {
            aVar.mo89709a(this.f122348c);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter, com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34681b
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(obj, "");
        super.destroyItem(viewGroup, i, obj);
        if (obj instanceof Fragment) {
            try {
                if (this.f81937b != null) {
                    this.f81937b.mo3455a((Fragment) obj);
                }
                this.f122348c.remove(i);
                AbstractC53302a aVar = this.f122354j;
                if (aVar != null) {
                    aVar.mo89709a(this.f122348c);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter, com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34681b
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment;
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(obj, "");
        super.setPrimaryItem(viewGroup, i, obj);
        WeakReference<Fragment> weakReference = this.f122353i;
        if (weakReference != null) {
            fragment = weakReference.get();
        } else {
            fragment = null;
        }
        if (fragment != obj) {
            WeakReference<Fragment> weakReference2 = new WeakReference<>(obj);
            this.f122353i = weakReference2;
            AbstractC53302a aVar = this.f122354j;
            if (aVar != null) {
                aVar.mo89710a(weakReference2);
            }
        }
    }
}
