package com.bytedance.scene.navigation;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p037h.C0792v;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.p025c.C0490e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.AbstractC22231l;
import com.bytedance.scene.AbstractC22266r;
import com.bytedance.scene.AbstractC22284y;
import com.bytedance.scene.EnumC22282w;
import com.bytedance.scene.group.AbstractC22211d;
import com.bytedance.scene.navigation.C22243f;
import com.bytedance.scene.p1617a.AbstractC22129d;
import com.bytedance.scene.p1617a.p1618a.C22117a;
import com.bytedance.scene.p1617a.p1619b.AbstractC22126a;
import com.bytedance.scene.p1621c.AbstractC22150c;
import com.bytedance.scene.p1621c.C22154f;
import com.bytedance.scene.p1622d.C22164e;
import com.bytedance.scene.p1622d.C22166g;
import com.bytedance.scene.p1622d.C22168h;
import com.bytedance.scene.p1622d.C22169i;
import com.bytedance.scene.p1622d.C22170j;
import com.bytedance.scene.p1622d.C22171k;
import com.bytedance.scene.p1622d.View$OnApplyWindowInsetsListenerC22163d;
import com.bytedance.scene.p1623e.C22176a;
import com.bytedance.scene.p1623e.C22177b;
import com.bytedance.scene.p1623e.C22178c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.scene.navigation.d */
public final class C22239d extends AbstractC22219j implements AbstractC22238c, AbstractC22266r, AbstractC22284y {

    /* renamed from: a */
    public AbstractC22231l f52595a;

    /* renamed from: b */
    C22258g f52596b;

    /* renamed from: c */
    public C22243f f52597c;

    /* renamed from: d */
    public FrameLayout f52598d;

    /* renamed from: e */
    public FrameLayout f52599e;

    /* renamed from: f */
    public AbstractC22129d f52600f = new C22117a();

    /* renamed from: g */
    public final List<AbstractC22126a.AbstractC22127a> f52601g = new ArrayList();

    /* renamed from: h */
    public final List<AbstractC22238c> f52602h = new ArrayList();

    /* renamed from: i */
    private boolean f52603i = true;

    /* renamed from: j */
    private final C0490e<Class, AbstractC22211d> f52604j = new C0490e<>(3);

    /* renamed from: k */
    private final List<C22164e<AbstractC22150c, Boolean>> f52605k = new ArrayList();

    /* renamed from: l */
    private AbstractC22126a.AbstractC22127a f52606l = new AbstractC22126a.AbstractC22127a() {
        /* class com.bytedance.scene.navigation.C22239d.C222412 */

        static {
            Covode.recordClassIndex(26053);
        }
    };

    static {
        Covode.recordClassIndex(26051);
    }

    @Override // com.bytedance.scene.AbstractC22266r
    public final void cq_() {
        this.f52603i = false;
    }

    @Override // com.bytedance.scene.AbstractC22266r
    public final boolean cr_() {
        return this.f52603i;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n */
    public final void mo36480n() {
        super.mo36480n();
    }

    /* renamed from: a */
    public final void mo36532a(AbstractC22259h hVar) {
        C22170j.m41654a();
        this.f52597c.mo36546a(hVar);
    }

    /* renamed from: a */
    public final void mo36533a(Class<? extends AbstractC22219j> cls, Bundle bundle, C22154f fVar) {
        AbstractC22211d dVar;
        if (!AbstractC22211d.class.isAssignableFrom(cls) || (dVar = this.f52604j.mo2091a(cls)) == null) {
            dVar = C22166g.m41650a(cls, bundle);
        } else if (bundle != null) {
            dVar.f52554r = bundle;
        }
        mo36537b(dVar, fVar);
    }

    /* renamed from: a */
    public final void mo36534a(boolean z) {
        ((C22178c) this.f52550n).setTouchEnabled(!z);
    }

    @Override // com.bytedance.scene.navigation.AbstractC22238c
    /* renamed from: a */
    public final void mo36521a(AbstractC22219j jVar, AbstractC22219j jVar2, boolean z) {
        for (AbstractC22238c cVar : new ArrayList(this.f52602h)) {
            cVar.mo36521a(jVar, jVar2, z);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36392a(AbstractC22219j jVar, boolean z) {
        if (jVar != this) {
            for (C22164e eVar : new ArrayList(this.f52605k)) {
                if (!z) {
                    eVar.f52403b.booleanValue();
                }
            }
        }
        super.mo36392a(jVar, z);
    }

    /* renamed from: C */
    public final void mo36522C() {
        AbstractC22219j b = this.f52597c.mo36548b();
        if (b != null) {
            C22169i.m41653a(b.f52550n);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    public final void cs_() {
        super.cs_();
        m41845a(EnumC22282w.STARTED);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    public final void ct_() {
        super.ct_();
        m41845a(EnumC22282w.RESUMED);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    public final void cu_() {
        m41845a(EnumC22282w.STARTED);
        super.cu_();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    public final void cv_() {
        m41845a(EnumC22282w.ACTIVITY_CREATED);
        super.cv_();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: y */
    public final void mo36492y() {
        super.mo36492y();
        this.f52597c.mo36551d();
    }

    /* renamed from: D */
    public final void mo36523D() {
        View view;
        AbstractC22219j b = this.f52597c.mo36548b();
        if (b != null && (view = b.f52550n) != null) {
            int i = Build.VERSION.SDK_INT;
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: F */
    public final void mo36525F() {
        C22170j.m41654a();
        if (C22171k.m41661a(this.f52549m)) {
            mo36522C();
            mo36523D();
            this.f52597c.mo36542a();
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        EnumC22282w wVar = EnumC22282w.NONE;
        C22243f fVar = this.f52597c;
        String a = fVar.mo36541a("NavigationManager dispatchChildrenState");
        new C22243f.C22256h(fVar, wVar).mo36558a(C22243f.f52609j);
        fVar.mo36549b(a);
        super.mo22713n_();
    }

    /* renamed from: E */
    public final boolean mo36524E() {
        C22170j.m41654a();
        if (!C22171k.m41661a(this.f52549m)) {
            return false;
        }
        if (this.f52597c.mo36550c()) {
            return true;
        }
        if (!this.f52597c.f52611b.mo36564b()) {
            return false;
        }
        mo36525F();
        return true;
    }

    /* renamed from: d */
    public final List<AbstractC22219j> mo36539d() {
        List<Record> c = this.f52597c.f52611b.mo36565c();
        ArrayList arrayList = new ArrayList();
        for (Record record : c) {
            arrayList.add(record.f52586a);
        }
        return arrayList;
    }

    @Override // com.bytedance.scene.AbstractC22284y
    /* renamed from: a */
    public final String mo36526a(String str) {
        return this.f52597c.mo36541a(str);
    }

    @Override // com.bytedance.scene.AbstractC22284y
    /* renamed from: b */
    public final void mo36538b(String str) {
        this.f52597c.mo36549b(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36530a(AbstractC22211d dVar) {
        this.f52604j.mo2092a(dVar.getClass(), dVar);
    }

    /* renamed from: a */
    private void m41845a(EnumC22282w wVar) {
        if (this.f52553q.value >= EnumC22282w.VIEW_CREATED.value) {
            this.f52597c.mo36547a(wVar);
            return;
        }
        throw new IllegalArgumentException("dispatchCurrentChildState can only call when state is VIEW_CREATED, ACTIVITY_CREATED, STARTED, RESUMED");
    }

    /* renamed from: b */
    public final void mo36535b(AbstractC22150c cVar) {
        C22170j.m41654a();
        int size = this.f52605k.size();
        for (int i = 0; i < size; i++) {
            if (this.f52605k.get(i).f52402a == cVar) {
                C22164e<AbstractC22150c, Boolean> eVar = this.f52605k.get(i);
                if (eVar != null) {
                    this.f52605k.remove(eVar);
                    return;
                }
                return;
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: f */
    public final void mo36419f(Bundle bundle) {
        super.mo36419f(bundle);
        if (!bundle.containsKey("bd-scene-navigation:support_restore")) {
            bundle.putBoolean("bd-scene-navigation:support_restore", this.f52603i);
            if (this.f52603i) {
                this.f52597c.mo36543a(bundle);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("outState already contains key bd-scene-navigation:support_restore");
    }

    /* renamed from: b */
    public final void mo36536b(AbstractC22219j jVar) {
        C22170j.m41654a();
        if (C22171k.m41661a(this.f52549m)) {
            if (this.f52597c.mo36548b() == jVar) {
                mo36522C();
                mo36523D();
            }
            C22243f fVar = this.f52597c;
            fVar.mo36545a(new C22243f.C22255g(fVar, jVar, (byte) 0));
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: c */
    public final void mo36399c(Bundle bundle) {
        boolean z;
        boolean z2;
        super.mo36399c(bundle);
        C22243f fVar = this.f52597c;
        if (fVar.f52613d.size() != 0 && fVar.mo36552e()) {
            if (System.currentTimeMillis() - fVar.f52614e > 800) {
                z = true;
            } else {
                z = false;
            }
            ArrayList arrayList = new ArrayList(fVar.f52613d);
            for (int i = 0; i < arrayList.size(); i++) {
                C22243f.AbstractC22248b bVar = (C22243f.AbstractC22248b) arrayList.get(i);
                if (i < arrayList.size() - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                fVar.f52619k = z2 | z;
                String a = fVar.mo36541a("NavigationManager executePendingOperation");
                bVar.mo36558a(C22243f.f52609j);
                fVar.mo36549b(a);
                fVar.f52619k = false;
            }
            fVar.f52613d.removeAll(arrayList);
            if (fVar.f52613d.size() <= 0) {
                fVar.f52614e = -1;
                return;
            }
            throw new IllegalStateException("why mPendingActionList still have item?");
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: e */
    public final void mo36416e(Bundle bundle) {
        super.mo36416e(bundle);
        this.f52597c = new C22243f(this);
        if (this.f52554r != null) {
            Bundle bundle2 = this.f52554r;
            String string = bundle2.getString("extra_rootScene");
            if (string != null) {
                C22258g gVar = new C22258g(string, bundle2.getBundle("extra_rootScene_arguments"));
                gVar.f52653c = bundle2.getBoolean("extra_drawWindowBackground");
                gVar.f52654d = bundle2.getBoolean("extra_fixSceneBackground_enabled");
                gVar.f52655e = bundle2.getInt("extra_sceneBackground");
                this.f52596b = gVar;
                if (bundle != null && !bundle.getBoolean("bd-scene-navigation:support_restore", this.f52603i)) {
                    this.f52603i = false;
                    return;
                }
                return;
            }
            throw new IllegalStateException("root scene class name cant be null");
        }
        throw new IllegalArgumentException("NavigationScene need NavigationSceneOptions bundle");
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        AbstractC22219j a;
        AbstractC22219j a2;
        super.mo22704a(bundle);
        if (bundle == null || !this.f52603i) {
            String str = this.f52596b.f52651a;
            Bundle bundle2 = this.f52596b.f52652b;
            if (this.f52595a == null || (a = this.f52595a.instantiateScene(mo36486t().getClassLoader(), str, bundle2)) == null) {
                a = C22166g.m41649a(mo36486t(), str, bundle2);
            } else if (a.f52551o != null) {
                throw new IllegalArgumentException("SceneComponentFactory instantiateScene return Scene already has a parent");
            }
            this.f52597c.mo36544a(a, new C22154f.C22155a().mo36338b());
        } else {
            C22243f fVar = this.f52597c;
            Activity t = mo36486t();
            AbstractC22231l lVar = this.f52595a;
            C22260i iVar = fVar.f52611b;
            iVar.f52656a = new ArrayList(bundle.getParcelableArrayList("bd-scene-nav:record_stack"));
            for (int i = 0; i < iVar.f52656a.size(); i++) {
                Record record = iVar.f52656a.get(i);
                if (i != 0 || lVar == null || (a2 = lVar.instantiateScene(t.getClassLoader(), record.f52593h, null)) == null) {
                    a2 = C22166g.m41649a(t, record.f52593h, null);
                } else if (a2.f52551o != null) {
                    throw new IllegalArgumentException("SceneComponentFactory instantiateScene return Scene already has a parent");
                }
                record.f52586a = a2;
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("bd-scene-nav:navigation_scene_manager");
            List<Record> c = fVar.f52611b.mo36565c();
            for (int i2 = 0; i2 <= c.size() - 1; i2++) {
                C22243f.m41889a(fVar.f52610a, c.get(i2).f52586a, EnumC22282w.ACTIVITY_CREATED, (Bundle) parcelableArrayList.get(i2), false, null);
            }
        }
        C22239d a3 = C22242e.m41885a(this);
        if (a3 != null) {
            a3.mo36528a(this, new AbstractC22259h() {
                /* class com.bytedance.scene.navigation.C22239d.C222401 */

                static {
                    Covode.recordClassIndex(26052);
                }

                @Override // com.bytedance.scene.navigation.AbstractC22259h
                /* renamed from: a */
                public final boolean mo36540a() {
                    return C22239d.this.mo36524E();
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36529a(AbstractC22150c cVar) {
        C22170j.m41654a();
        this.f52605k.add(C22164e.m41646a(cVar, false));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36390a(AbstractC22219j jVar) {
        super.mo36390a(jVar);
        if (jVar == null) {
            return;
        }
        if (!(jVar instanceof AbstractC22266r)) {
            throw new C22168h("unknown parent Scene type " + jVar.getClass());
        } else if (!((AbstractC22266r) jVar).cr_()) {
            this.f52603i = false;
        }
    }

    /* renamed from: a */
    public final void mo36531a(AbstractC22219j jVar, C22154f fVar) {
        mo36537b(jVar, fVar);
    }

    /* renamed from: a */
    public final void mo36527a(AbstractC1204m mVar, AbstractC22238c cVar) {
        C22170j.m41654a();
        if (mVar.getLifecycle().mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
            this.f52602h.add(cVar);
            mVar.getLifecycle().mo4012a(new NavigationScene$1(this, mVar, cVar));
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: e */
    public final void mo36418e(AbstractC22219j jVar, boolean z) {
        if (jVar != this) {
            for (C22164e eVar : new ArrayList(this.f52605k)) {
                if (!z) {
                    eVar.f52403b.booleanValue();
                }
            }
        }
        super.mo36418e(jVar, z);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.m26663i(3585);
        C22177b bVar = new C22177b(mo36485s());
        if (Build.VERSION.SDK_INT >= 21) {
            bVar.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC22163d());
        }
        bVar.setId(R.id.cra);
        this.f52598d = new FrameLayout(mo36485s());
        if (Build.VERSION.SDK_INT >= 21) {
            this.f52598d.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC22163d());
        }
        bVar.addView(this.f52598d, new FrameLayout.LayoutParams(-1, -1));
        C22176a aVar = new C22176a(mo36485s());
        if (Build.VERSION.SDK_INT >= 21) {
            aVar.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC22163d());
        }
        this.f52599e = aVar;
        bVar.addView(aVar, new FrameLayout.LayoutParams(-1, -1));
        if (this.f52596b.f52653c) {
            C0792v.m2746a(bVar, C22171k.m41655a(mo36485s()));
        }
        MethodCollector.m26664o(3585);
        return bVar;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: f */
    public final void mo36420f(AbstractC22219j jVar, boolean z) {
        if (jVar != this) {
            for (C22164e eVar : new ArrayList(this.f52605k)) {
                if (z || eVar.f52403b.booleanValue()) {
                    eVar.f52402a.mo36335a(jVar);
                }
            }
        }
        super.mo36420f(jVar, z);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: c */
    public final void mo36402c(AbstractC22219j jVar, boolean z) {
        if (jVar != this) {
            for (C22164e eVar : new ArrayList(this.f52605k)) {
                if (!z) {
                    eVar.f52403b.booleanValue();
                }
            }
        }
        super.mo36402c(jVar, z);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: d */
    public final void mo36415d(AbstractC22219j jVar, boolean z) {
        if (jVar != this) {
            for (C22164e eVar : new ArrayList(this.f52605k)) {
                if (!z) {
                    eVar.f52403b.booleanValue();
                }
            }
        }
        super.mo36415d(jVar, z);
    }

    /* renamed from: a */
    public final void mo36528a(AbstractC1204m mVar, AbstractC22259h hVar) {
        C22170j.m41654a();
        if (mVar.getLifecycle().mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
            this.f52597c.f52616g.add(C22164e.m41646a(mVar, hVar));
            mVar.getLifecycle().mo4012a(new NavigationScene$2(this, mVar, hVar));
        }
    }

    /* renamed from: b */
    public final void mo36537b(AbstractC22219j jVar, C22154f fVar) {
        C22170j.m41654a();
        if (C22171k.m41661a(this.f52549m)) {
            if (jVar.f52551o != null) {
                if (jVar.f52551o == this) {
                    throw new IllegalArgumentException("Scene is already pushed");
                }
                throw new IllegalArgumentException("Scene already has a parent, parent " + jVar.f52551o);
            } else if (!this.f52603i || C22166g.m41651a(jVar)) {
                if (fVar == null) {
                    fVar = new C22154f.C22155a().mo36338b();
                }
                mo36522C();
                mo36523D();
                this.f52597c.mo36544a(jVar, fVar);
            } else {
                throw new IllegalArgumentException("Scene " + jVar.getClass().getName() + " must be a public class or public static class, and have only one parameterless constructor to be properly recreated from instance state.");
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: b */
    public final void mo36398b(AbstractC22219j jVar, boolean z) {
        if (jVar != this) {
            for (C22164e eVar : new ArrayList(this.f52605k)) {
                if (!z) {
                    eVar.f52403b.booleanValue();
                }
            }
        }
        super.mo36398b(jVar, z);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: c */
    public final void mo36401c(AbstractC22219j jVar, Bundle bundle, boolean z) {
        if (jVar != this) {
            for (C22164e eVar : new ArrayList(this.f52605k)) {
                if (!z) {
                    eVar.f52403b.booleanValue();
                }
            }
        }
        super.mo36401c(jVar, bundle, z);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: d */
    public final void mo36414d(AbstractC22219j jVar, Bundle bundle, boolean z) {
        if (jVar != this) {
            for (C22164e eVar : new ArrayList(this.f52605k)) {
                if (!z) {
                    eVar.f52403b.booleanValue();
                }
            }
        }
        super.mo36414d(jVar, bundle, z);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: b */
    public final void mo36397b(AbstractC22219j jVar, Bundle bundle, boolean z) {
        if (jVar != this) {
            for (C22164e eVar : new ArrayList(this.f52605k)) {
                if (!z) {
                    eVar.f52403b.booleanValue();
                }
            }
        }
        super.mo36397b(jVar, bundle, z);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36391a(AbstractC22219j jVar, Bundle bundle, boolean z) {
        if (jVar != this) {
            for (C22164e eVar : new ArrayList(this.f52605k)) {
                if (!z) {
                    eVar.f52403b.booleanValue();
                }
            }
        }
        super.mo36391a(jVar, bundle, z);
    }
}
