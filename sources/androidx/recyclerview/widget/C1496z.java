package androidx.recyclerview.widget;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p037h.C0726a;
import androidx.core.p037h.p038a.C0733d;
import androidx.core.p037h.p038a.C0737e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.z */
public class C1496z extends C0726a {

    /* renamed from: b */
    final RecyclerView f4938b;

    /* renamed from: c */
    public final C1497a f4939c;

    static {
        Covode.recordClassIndex(1634);
    }

    /* renamed from: androidx.recyclerview.widget.z$a */
    public static class C1497a extends C0726a {

        /* renamed from: b */
        final C1496z f4940b;

        /* renamed from: c */
        Map<View, C0726a> f4941c = new WeakHashMap();

        static {
            Covode.recordClassIndex(1635);
        }

        public C1497a(C1496z zVar) {
            this.f4940b = zVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final C0726a mo5035c(View view) {
            return this.f4941c.remove(view);
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final C0737e mo2805a(View view) {
            C0726a aVar = this.f4941c.get(view);
            if (aVar != null) {
                return aVar.mo2805a(view);
            }
            return super.mo2805a(view);
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: b */
        public final boolean mo2811b(View view, AccessibilityEvent accessibilityEvent) {
            C0726a aVar = this.f4941c.get(view);
            if (aVar != null) {
                return aVar.mo2811b(view, accessibilityEvent);
            }
            return super.mo2811b(view, accessibilityEvent);
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: c */
        public final void mo2812c(View view, AccessibilityEvent accessibilityEvent) {
            C0726a aVar = this.f4941c.get(view);
            if (aVar != null) {
                aVar.mo2812c(view, accessibilityEvent);
            } else {
                super.mo2812c(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: d */
        public final void mo2813d(View view, AccessibilityEvent accessibilityEvent) {
            C0726a aVar = this.f4941c.get(view);
            if (aVar != null) {
                aVar.mo2813d(view, accessibilityEvent);
            } else {
                super.mo2813d(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final void mo2806a(View view, int i) {
            C0726a aVar = this.f4941c.get(view);
            if (aVar != null) {
                aVar.mo2806a(view, i);
            } else {
                super.mo2806a(view, i);
            }
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final void mo2807a(View view, AccessibilityEvent accessibilityEvent) {
            C0726a aVar = this.f4941c.get(view);
            if (aVar != null) {
                aVar.mo2807a(view, accessibilityEvent);
            } else {
                super.mo2807a(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final void mo2808a(View view, C0733d dVar) {
            if (this.f4940b.f4938b.mo4500p() || this.f4940b.f4938b.getLayoutManager() == null) {
                super.mo2808a(view, dVar);
                return;
            }
            this.f4940b.f4938b.getLayoutManager().mo4690a(view, dVar);
            C0726a aVar = this.f4941c.get(view);
            if (aVar != null) {
                aVar.mo2808a(view, dVar);
            } else {
                super.mo2808a(view, dVar);
            }
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final boolean mo2809a(View view, int i, Bundle bundle) {
            if (this.f4940b.f4938b.mo4500p() || this.f4940b.f4938b.getLayoutManager() == null) {
                return super.mo2809a(view, i, bundle);
            }
            C0726a aVar = this.f4941c.get(view);
            if (aVar != null) {
                if (aVar.mo2809a(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo2809a(view, i, bundle)) {
                return true;
            }
            this.f4940b.f4938b.getLayoutManager();
            return false;
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final boolean mo2810a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0726a aVar = this.f4941c.get(viewGroup);
            if (aVar != null) {
                return aVar.mo2810a(viewGroup, view, accessibilityEvent);
            }
            return super.mo2810a(viewGroup, view, accessibilityEvent);
        }
    }

    public C1496z(RecyclerView recyclerView) {
        this.f4938b = recyclerView;
        C1497a aVar = this.f4939c;
        if (aVar == null || !(aVar instanceof C1497a)) {
            this.f4939c = new C1497a(this);
        } else {
            this.f4939c = aVar;
        }
    }

    @Override // androidx.core.p037h.C0726a
    /* renamed from: d */
    public final void mo2813d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2813d(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.f4938b.mo4500p()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo4352a(accessibilityEvent);
            }
        }
    }

    @Override // androidx.core.p037h.C0726a
    /* renamed from: a */
    public final void mo2808a(View view, C0733d dVar) {
        C0733d.C0735b bVar;
        super.mo2808a(view, dVar);
        if (!this.f4938b.mo4500p() && this.f4938b.getLayoutManager() != null) {
            RecyclerView.AbstractC1362i layoutManager = this.f4938b.getLayoutManager();
            RecyclerView.C1372o oVar = layoutManager.f4490w.f4435e;
            RecyclerView.C1378s sVar = layoutManager.f4490w.f4386G;
            if (layoutManager.f4490w.canScrollVertically(-1) || layoutManager.f4490w.canScrollHorizontally(-1)) {
                dVar.mo2829a(8192);
                dVar.mo2844d(true);
            }
            if (layoutManager.f4490w.canScrollVertically(1) || layoutManager.f4490w.canScrollHorizontally(1)) {
                dVar.mo2829a(4096);
                dVar.mo2844d(true);
            }
            int a = layoutManager.mo4313a(oVar, sVar);
            int b = layoutManager.mo4332b(oVar, sVar);
            if (Build.VERSION.SDK_INT >= 21) {
                bVar = new C0733d.C0735b(AccessibilityNodeInfo.CollectionInfo.obtain(a, b, false, 0));
            } else {
                int i = Build.VERSION.SDK_INT;
                bVar = new C0733d.C0735b(AccessibilityNodeInfo.CollectionInfo.obtain(a, b, false));
            }
            int i2 = Build.VERSION.SDK_INT;
            dVar.f2837a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) bVar.f2881a);
        }
    }

    @Override // androidx.core.p037h.C0726a
    /* renamed from: a */
    public final boolean mo2809a(View view, int i, Bundle bundle) {
        int i2;
        int i3;
        if (super.mo2809a(view, i, bundle)) {
            return true;
        }
        if (this.f4938b.mo4500p() || this.f4938b.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.AbstractC1362i layoutManager = this.f4938b.getLayoutManager();
        if (layoutManager.f4490w == null) {
            return false;
        }
        if (i == 4096) {
            if (layoutManager.f4490w.canScrollVertically(1)) {
                i2 = (layoutManager.f4486K - layoutManager.mo4732u()) - layoutManager.mo4734w();
            } else {
                i2 = 0;
            }
            if (layoutManager.f4490w.canScrollHorizontally(1)) {
                i3 = (layoutManager.f4485J - layoutManager.mo4731t()) - layoutManager.mo4733v();
                layoutManager.f4490w.mo4397a(i3, i2, true);
                return true;
            }
            i3 = 0;
            layoutManager.f4490w.mo4397a(i3, i2, true);
            return true;
        } else if (i == 8192) {
            if (layoutManager.f4490w.canScrollVertically(-1)) {
                i2 = -((layoutManager.f4486K - layoutManager.mo4732u()) - layoutManager.mo4734w());
            } else {
                i2 = 0;
            }
            if (layoutManager.f4490w.canScrollHorizontally(-1)) {
                i3 = -((layoutManager.f4485J - layoutManager.mo4731t()) - layoutManager.mo4733v());
                if (!(i2 == 0 && i3 == 0)) {
                    layoutManager.f4490w.mo4397a(i3, i2, true);
                    return true;
                }
            }
            i3 = 0;
            layoutManager.f4490w.mo4397a(i3, i2, true);
            return true;
        }
        return false;
    }
}
