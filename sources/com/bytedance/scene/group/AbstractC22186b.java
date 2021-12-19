package com.bytedance.scene.group;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.AbstractC22231l;
import com.bytedance.scene.AbstractC22266r;
import com.bytedance.scene.EnumC22282w;
import com.bytedance.scene.group.C22189c;
import com.bytedance.scene.p1617a.AbstractC22128c;
import com.bytedance.scene.p1617a.C22122b;
import com.bytedance.scene.p1621c.AbstractC22150c;
import com.bytedance.scene.p1622d.C22164e;
import com.bytedance.scene.p1622d.C22166g;
import com.bytedance.scene.p1622d.C22168h;
import com.bytedance.scene.p1622d.C22170j;
import com.bytedance.scene.p1622d.C22171k;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.bytedance.scene.group.b */
public abstract class AbstractC22186b extends AbstractC22219j implements AbstractC22266r {

    /* renamed from: d */
    private static final AbstractC22128c f52449d = new AbstractC22128c() {
        /* class com.bytedance.scene.group.AbstractC22186b.C221871 */

        static {
            Covode.recordClassIndex(25993);
        }

        @Override // com.bytedance.scene.p1617a.AbstractC22128c
        /* renamed from: a */
        public final C22122b mo36321a() {
            return null;
        }
    };

    /* renamed from: a */
    public final C22189c f52450a = new C22189c(this);

    /* renamed from: b */
    private final List<C22164e<AbstractC22150c, Boolean>> f52451b = new ArrayList();

    /* renamed from: c */
    private boolean f52452c = true;

    /* renamed from: D */
    public void mo36385D() {
    }

    /* renamed from: b */
    public abstract ViewGroup mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Override // com.bytedance.scene.AbstractC22266r
    public final void cq_() {
        this.f52452c = false;
    }

    @Override // com.bytedance.scene.AbstractC22266r
    public final boolean cr_() {
        return this.f52452c;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: k */
    public final void mo36423k() {
        super.mo36423k();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: l */
    public final void mo36424l() {
        super.mo36424l();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: m */
    public final void mo36425m() {
        super.mo36425m();
    }

    static {
        Covode.recordClassIndex(25992);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    public final void cs_() {
        super.cs_();
        m41677b(EnumC22282w.STARTED);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    public final void ct_() {
        super.ct_();
        m41677b(EnumC22282w.RESUMED);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    public final void cu_() {
        m41677b(EnumC22282w.STARTED);
        super.cu_();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    public final void cv_() {
        m41677b(EnumC22282w.ACTIVITY_CREATED);
        super.cv_();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    public final void cw_() {
        m41675a(EnumC22282w.NONE);
        super.cw_();
    }

    public final void cp_() {
        C22189c cVar = this.f52450a;
        if (!cVar.f52460f) {
            cVar.f52460f = true;
            return;
        }
        throw new IllegalStateException("you must call commitTransaction before another beginTransaction");
    }

    /* renamed from: C */
    public final void mo36384C() {
        C22189c cVar = this.f52450a;
        if (cVar.f52460f) {
            if (cVar.f52461g.size() > 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (C22189c.AbstractC22203d dVar : cVar.f52461g) {
                    List list = (List) linkedHashMap.get(dVar.f52490i);
                    if (list == null) {
                        list = new ArrayList();
                        linkedHashMap.put(dVar.f52490i, list);
                    }
                    list.add(dVar);
                }
                for (AbstractC22219j jVar : linkedHashMap.keySet()) {
                    List list2 = (List) linkedHashMap.get(jVar);
                    EnumC22282w wVar = jVar.f52553q;
                    EnumC22282w wVar2 = ((C22189c.AbstractC22203d) list2.get(list2.size() - 1)).f52491j;
                    boolean z = ((C22189c.AbstractC22203d) list2.get(list2.size() - 1)).f52492k;
                    boolean z2 = ((C22189c.AbstractC22203d) list2.get(list2.size() - 1)).f52493l;
                    boolean z3 = ((C22189c.AbstractC22203d) list2.get(list2.size() - 1)).f52494m;
                    if (wVar != wVar2 || z || z2 || z3) {
                        if (wVar == EnumC22282w.NONE) {
                            C22189c.C22195a a = C22189c.m41715a(list2);
                            if (a == null) {
                                throw new IllegalStateException("you must add Scene first");
                            } else if (cVar.mo36426a(a.f52472b) == null) {
                                new C22189c.C22210g(jVar, a.f52471a, a.f52472b, wVar2, z, z2, z3).mo36445a(C22189c.f52456e);
                            } else {
                                throw new IllegalStateException("already have a Scene with tag " + a.f52472b);
                            }
                        } else {
                            new C22189c.C22210g(jVar, -1, null, wVar2, z, z2, z3).mo36445a(C22189c.f52456e);
                        }
                    }
                }
                cVar.f52461g.clear();
            }
            cVar.f52460f = false;
            return;
        }
        throw new IllegalStateException("you must call beginTransaction before commitTransaction");
    }

    /* renamed from: E */
    private void mo62771E() {
        AbstractC22219j jVar;
        ArrayList arrayList = new ArrayList();
        m41676a(arrayList, (ViewGroup) mo36482p());
        if (arrayList.size() != 0) {
            if (!this.f52452c) {
                SparseArray sparseArray = new SparseArray();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C22212e eVar = (C22212e) arrayList.get(i);
                    ViewGroup viewGroup = (ViewGroup) eVar.getParent();
                    int id = viewGroup.getId();
                    if (id != -1) {
                        if (sparseArray.get(id) == null) {
                            sparseArray.put(id, viewGroup);
                        } else if (sparseArray.get(id) != viewGroup) {
                            throw new IllegalArgumentException("ScenePlaceHolderView' parent ViewGroup should have unique id, the duplicate id is " + C22171k.m41657a(mo36485s(), id));
                        }
                        ViewGroup.LayoutParams layoutParams = eVar.getLayoutParams();
                        String sceneName = eVar.getSceneName();
                        String sceneTag = eVar.getSceneTag();
                        Bundle arguments = eVar.getArguments();
                        AbstractC22231l sceneComponentFactory = eVar.getSceneComponentFactory();
                        if (sceneComponentFactory == null || (jVar = sceneComponentFactory.instantiateScene(mo36485s().getClassLoader(), sceneName, arguments)) == null) {
                            jVar = C22166g.m41649a(mo36485s(), sceneName, arguments);
                        }
                        int indexOfChild = viewGroup.indexOfChild(eVar);
                        viewGroup.removeView(eVar);
                        if (eVar.getVisibility() == 0) {
                            mo36387a(id, jVar, sceneTag);
                        } else if (eVar.getVisibility() == 8) {
                            cp_();
                            mo36387a(id, jVar, sceneTag);
                            mo36413d(jVar);
                            mo36384C();
                        } else {
                            throw new IllegalStateException("ScenePlaceHolderView's visibility can't be View.INVISIBLE, use View.VISIBLE or View.GONE instead");
                        }
                        View p = jVar.mo36482p();
                        if (eVar.getId() != -1) {
                            if (p.getId() == -1) {
                                p.setId(eVar.getId());
                            } else if (eVar.getId() != p.getId()) {
                                throw new IllegalStateException(C1764a.m5928a("ScenePlaceHolderView's id %s is different from Scene root view's id %s", new Object[]{C22171k.m41657a(mo36485s(), eVar.getId()), C22171k.m41657a(mo36485s(), p.getId())}));
                            }
                        }
                        viewGroup.removeView(p);
                        viewGroup.addView(p, indexOfChild, layoutParams);
                    } else {
                        throw new IllegalArgumentException("ScenePlaceHolderView parent id can't be View.NO_ID");
                    }
                }
                return;
            }
            throw new IllegalStateException("ScenePlaceHolderView can only be used when support restore is disabled");
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36388a(Activity activity) {
        super.mo36388a(activity);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: d */
    public final void mo36412d(Bundle bundle) {
        super.mo36412d(bundle);
    }

    /* renamed from: a */
    private void m41675a(EnumC22282w wVar) {
        this.f52450a.mo36430a(wVar);
    }

    /* renamed from: b */
    private void m41677b(EnumC22282w wVar) {
        this.f52450a.mo36432b(wVar);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: c */
    public final void mo36399c(Bundle bundle) {
        super.mo36399c(bundle);
        m41675a(EnumC22282w.ACTIVITY_CREATED);
        mo36385D();
    }

    /* renamed from: f */
    public final boolean mo36421f(AbstractC22219j jVar) {
        if (this.f52450a.mo36434d(jVar) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final <T extends AbstractC22219j> T mo36386a(String str) {
        GroupRecord a;
        C22170j.m41654a();
        if (str == null || (a = this.f52450a.mo36426a(str)) == null) {
            return null;
        }
        return (T) a.f52439b;
    }

    /* renamed from: b */
    public final String mo36394b(AbstractC22219j jVar) {
        GroupRecord d;
        C22170j.m41654a();
        if (jVar == null || (d = this.f52450a.mo36434d(jVar)) == null) {
            return null;
        }
        return d.f52440c;
    }

    /* renamed from: g */
    public final boolean mo36422g(AbstractC22219j jVar) {
        GroupRecord d = this.f52450a.mo36434d(jVar);
        if (d != null && !d.f52441d) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: b */
    public final void mo36396b(Bundle bundle) {
        super.mo36396b(bundle);
    }

    /* renamed from: c */
    public final void mo36400c(AbstractC22219j jVar) {
        AbstractC22128c cVar = f52449d;
        C22170j.m41654a();
        C22189c cVar2 = this.f52450a;
        cVar2.mo36429a(jVar);
        if (cVar2.f52460f || cVar2.f52459c.mo36381a(jVar) != null) {
            C22189c.C22204e eVar = new C22189c.C22204e(cVar2, jVar, cVar, (byte) 0);
            if (cVar2.f52460f) {
                cVar2.f52461g.add(eVar);
            } else {
                eVar.mo36445a(C22189c.f52456e);
            }
        } else {
            throw new IllegalStateException("Target scene is not find");
        }
    }

    /* renamed from: d */
    public final void mo36413d(AbstractC22219j jVar) {
        AbstractC22128c cVar = f52449d;
        C22170j.m41654a();
        C22189c cVar2 = this.f52450a;
        cVar2.mo36429a(jVar);
        if (cVar2.f52460f || cVar2.f52459c.mo36381a(jVar) != null) {
            C22189c.C22198b bVar = new C22189c.C22198b(cVar2, jVar, cVar, (byte) 0);
            if (cVar2.f52460f) {
                cVar2.f52461g.add(bVar);
            } else {
                bVar.mo36445a(C22189c.f52456e);
            }
        } else {
            throw new IllegalStateException("Target scene is not find");
        }
    }

    /* renamed from: e */
    public final void mo36417e(AbstractC22219j jVar) {
        AbstractC22128c cVar = f52449d;
        C22170j.m41654a();
        C22189c cVar2 = this.f52450a;
        cVar2.mo36429a(jVar);
        if (cVar2.f52460f || cVar2.f52459c.mo36381a(jVar) != null) {
            C22189c.C22207f fVar = new C22189c.C22207f(cVar2, jVar, cVar, (byte) 0);
            if (cVar2.f52460f) {
                cVar2.f52461g.add(fVar);
            } else {
                fVar.mo36445a(C22189c.f52456e);
            }
        } else {
            throw new IllegalStateException("Target scene is not find");
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: f */
    public void mo36419f(Bundle bundle) {
        super.mo36419f(bundle);
        if (!bundle.containsKey("bd-scene-group:support_restore")) {
            bundle.putBoolean("bd-scene-group:support_restore", this.f52452c);
            if (this.f52452c) {
                this.f52450a.mo36428a(bundle);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("outState already contains key bd-scene-group:support_restore");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final ViewGroup mo36411d(int i) {
        ViewGroup viewGroup = (ViewGroup) this.f52550n.findViewById(i);
        if (viewGroup != null) {
            ViewGroup viewGroup2 = viewGroup;
            while (viewGroup2 != null && viewGroup2 != this.f52550n) {
                AbstractC22219j jVar = (AbstractC22219j) viewGroup2.getTag(R.id.a0m);
                if (jVar == null) {
                    viewGroup2 = (ViewGroup) viewGroup2.getParent();
                } else {
                    throw new IllegalArgumentException(C1764a.m5928a("cant add Scene to child Scene %s view hierarchy ", new Object[]{jVar.toString()}));
                }
            }
            return viewGroup;
        }
        try {
            throw new IllegalArgumentException(" " + mo36486t().getResources().getResourceName(i) + " view not found");
        } catch (Resources.NotFoundException unused) {
            throw new IllegalArgumentException(" " + i + " view not found");
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: e */
    public void mo36416e(Bundle bundle) {
        super.mo36416e(bundle);
        if (bundle != null) {
            if (!bundle.getBoolean("bd-scene-group:support_restore", this.f52452c)) {
                this.f52452c = false;
            }
            if (this.f52452c) {
                C22189c cVar = this.f52450a;
                Activity t = mo36486t();
                C22185a aVar = cVar.f52459c;
                if (aVar.f52446a == null || aVar.f52446a.size() <= 0) {
                    aVar.f52446a = new ArrayList(bundle.getParcelableArrayList("bd-scene-nav:group_stack"));
                    for (GroupRecord groupRecord : aVar.f52446a) {
                        groupRecord.f52439b = C22166g.m41649a(t, groupRecord.f52443f, null);
                        aVar.f52447b.put(groupRecord.f52439b, groupRecord);
                        aVar.f52448c.put(groupRecord.f52440c, groupRecord);
                    }
                    List unmodifiableList = Collections.unmodifiableList(cVar.f52459c.f52446a);
                    if (unmodifiableList.size() != 0) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("bd-scene-nav:group_scene_manager");
                        for (int i = 0; i <= unmodifiableList.size() - 1; i++) {
                            GroupRecord groupRecord2 = (GroupRecord) unmodifiableList.get(i);
                            AbstractC22219j jVar = groupRecord2.f52439b;
                            groupRecord2.f52444g = (Bundle) parcelableArrayList.get(i);
                            if (cVar.mo36437g(jVar)) {
                                cVar.mo36431b(jVar);
                                C22189c.m41718a(cVar.f52457a, jVar, cVar.f52457a.f52553q, false, new Runnable(jVar) {
                                    /* class com.bytedance.scene.group.C22189c.RunnableC221934 */

                                    /* renamed from: a */
                                    final /* synthetic */ AbstractC22219j f52468a;

                                    static {
                                        Covode.recordClassIndex(25999);
                                    }

                                    public final void run() {
                                        C22189c.this.mo36433c(this.f52468a);
                                    }

                                    {
                                        this.f52468a = r2;
                                    }
                                });
                            } else {
                                throw new C22168h("Scene is not found");
                            }
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("mSceneList size is not zero, Scene is added before restore");
            }
        }
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
            this.f52452c = false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<com.bytedance.scene.group.e> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static void m41676a(List<C22212e> list, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        if (childCount != 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof C22212e) {
                    list.add(childAt);
                } else if (childAt instanceof ViewGroup) {
                    m41676a(list, (ViewGroup) childAt);
                }
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: e */
    public final void mo36418e(AbstractC22219j jVar, boolean z) {
        if (jVar != this) {
            for (C22164e eVar : new ArrayList(this.f52451b)) {
                if (!z) {
                    eVar.f52403b.booleanValue();
                }
            }
        }
        super.mo36418e(jVar, z);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: f */
    public final void mo36420f(AbstractC22219j jVar, boolean z) {
        if (jVar != this) {
            for (C22164e eVar : new ArrayList(this.f52451b)) {
                if (z || eVar.f52403b.booleanValue()) {
                    eVar.f52402a.mo36335a(jVar);
                }
            }
        }
        super.mo36420f(jVar, z);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: b */
    public final void mo36398b(AbstractC22219j jVar, boolean z) {
        if (jVar != this) {
            for (C22164e eVar : new ArrayList(this.f52451b)) {
                if (!z) {
                    eVar.f52403b.booleanValue();
                }
            }
        }
        super.mo36398b(jVar, z);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: c */
    public final void mo36402c(AbstractC22219j jVar, boolean z) {
        if (jVar != this) {
            for (C22164e eVar : new ArrayList(this.f52451b)) {
                if (!z) {
                    eVar.f52403b.booleanValue();
                }
            }
        }
        super.mo36402c(jVar, z);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36389a(Bundle bundle, ViewGroup viewGroup) {
        super.mo36389a(bundle, viewGroup);
        if (this.f52550n instanceof ViewGroup) {
            this.f52450a.f52458b = (ViewGroup) this.f52550n;
            m41675a(EnumC22282w.VIEW_CREATED);
            mo62771E();
            return;
        }
        throw new IllegalArgumentException("GroupScene onCreateView view must be ViewGroup");
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: d */
    public final void mo36415d(AbstractC22219j jVar, boolean z) {
        if (jVar != this) {
            for (C22164e eVar : new ArrayList(this.f52451b)) {
                if (!z) {
                    eVar.f52403b.booleanValue();
                }
            }
        }
        super.mo36415d(jVar, z);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36392a(AbstractC22219j jVar, boolean z) {
        if (jVar != this) {
            for (C22164e eVar : new ArrayList(this.f52451b)) {
                if (!z) {
                    eVar.f52403b.booleanValue();
                }
            }
        }
        super.mo36392a(jVar, z);
    }

    /* renamed from: b */
    public final void mo36395b(int i, AbstractC22219j jVar, String str) {
        m41674a(i, jVar, str, new AbstractC22128c(0, jVar) {
            /* class com.bytedance.scene.group.AbstractC22186b.C221882 */

            /* renamed from: a */
            final /* synthetic */ int f52453a = 0;

            /* renamed from: b */
            final /* synthetic */ AbstractC22219j f52454b;

            static {
                Covode.recordClassIndex(25994);
            }

            @Override // com.bytedance.scene.p1617a.AbstractC22128c
            /* renamed from: a */
            public final C22122b mo36321a() {
                if (this.f52453a == 0) {
                    return null;
                }
                return C22122b.m41603a(this.f52454b.mo36486t(), this.f52453a);
            }

            {
                this.f52454b = r3;
            }
        });
    }

    /* renamed from: a */
    public final void mo36387a(int i, AbstractC22219j jVar, String str) {
        m41674a(i, jVar, str, f52449d);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: b */
    public final void mo36397b(AbstractC22219j jVar, Bundle bundle, boolean z) {
        if (jVar != this) {
            for (C22164e eVar : new ArrayList(this.f52451b)) {
                if (!z) {
                    eVar.f52403b.booleanValue();
                }
            }
        }
        super.mo36397b(jVar, bundle, z);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: c */
    public final void mo36401c(AbstractC22219j jVar, Bundle bundle, boolean z) {
        if (jVar != this) {
            for (C22164e eVar : new ArrayList(this.f52451b)) {
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
            for (C22164e eVar : new ArrayList(this.f52451b)) {
                if (!z) {
                    eVar.f52403b.booleanValue();
                }
            }
        }
        super.mo36414d(jVar, bundle, z);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36391a(AbstractC22219j jVar, Bundle bundle, boolean z) {
        if (jVar != this) {
            for (C22164e eVar : new ArrayList(this.f52451b)) {
                if (!z) {
                    eVar.f52403b.booleanValue();
                }
            }
        }
        super.mo36391a(jVar, bundle, z);
    }

    /* renamed from: a */
    private void m41674a(int i, AbstractC22219j jVar, String str, AbstractC22128c cVar) {
        String str2;
        C22170j.m41654a();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag can't be empty");
        } else if (jVar != this) {
            if (mo36421f(jVar)) {
                int e = this.f52450a.mo36435e(jVar);
                if (e == i) {
                    String f = this.f52450a.mo36436f(jVar);
                    if (!f.equals(str)) {
                        throw new IllegalArgumentException("Scene is already added, tag ".concat(String.valueOf(f)));
                    }
                } else {
                    try {
                        str2 = mo36486t().getResources().getResourceName(e);
                    } catch (Resources.NotFoundException unused) {
                        str2 = String.valueOf(e);
                    }
                    throw new IllegalArgumentException("Scene is already added to another container, viewId ".concat(String.valueOf(str2)));
                }
            } else {
                AbstractC22219j a = mo36386a(str);
                if (a != null) {
                    throw new IllegalArgumentException("already have a Scene " + a.toString() + " with tag " + str);
                }
            }
            if (jVar.f52551o != null && jVar.f52551o != this) {
                throw new IllegalArgumentException("Scene already has a parent, parent " + jVar.f52551o);
            } else if (!this.f52452c || C22166g.m41651a(jVar)) {
                this.f52450a.mo36427a(i, jVar, str, cVar);
            } else {
                throw new IllegalArgumentException("Scene " + jVar.getClass().getName() + " must be a public class or public static class, and have only one parameterless constructor to be properly recreated from instance state.");
            }
        } else {
            throw new IllegalArgumentException("GroupScene can't be added to itself");
        }
    }
}
