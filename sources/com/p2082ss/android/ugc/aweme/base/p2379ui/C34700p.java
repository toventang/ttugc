package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.ui.p */
public class C34700p extends AbstractC34686f<C34685e> {

    /* renamed from: d */
    public List<C34690j> f81973d;

    /* renamed from: e */
    HashMap<String, C34690j> f81974e;

    /* renamed from: f */
    List<C34690j> f81975f;

    /* renamed from: g */
    public AbstractC0952i f81976g;

    /* renamed from: h */
    public AbstractC34703b f81977h;

    /* renamed from: i */
    public AbstractC34704c f81978i;

    /* renamed from: j */
    private int f81979j;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.p$b */
    public interface AbstractC34703b {
        static {
            Covode.recordClassIndex(41690);
        }

        /* renamed from: a */
        void mo61373a(HashMap<Integer, C34685e> hashMap);

        /* renamed from: a */
        void mo61374a(List<C34690j> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.p$c */
    public interface AbstractC34704c {
        static {
            Covode.recordClassIndex(41691);
        }

        /* renamed from: a */
        void mo61375a(C34685e eVar);
    }

    static {
        Covode.recordClassIndex(41687);
    }

    @Override // com.bytedance.ies.uikit.p1284f.AbstractC18273b, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // com.bytedance.ies.uikit.p1284f.AbstractC18273b, androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        super.finishUpdate(viewGroup);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34686f
    /* renamed from: a */
    public final void mo61346a(HashMap<Integer, C34685e> hashMap) {
        AbstractC34703b bVar = this.f81977h;
        if (bVar != null) {
            bVar.mo61373a(hashMap);
        }
    }

    /* renamed from: a */
    private long m70867a(C34690j jVar) {
        if (jVar == null) {
            return -1;
        }
        return (long) this.f81973d.indexOf(jVar);
    }

    /* renamed from: b */
    private String m70869b(C34690j jVar) {
        return m70868a(this.f81979j, m70867a(jVar));
    }

    @Override // com.bytedance.ies.uikit.p1284f.AbstractC18273b
    /* renamed from: b */
    public final long mo29163b(int i) {
        List<C34690j> list;
        List<C34690j> list2 = this.f81975f;
        if (list2 == null || (list = this.f81973d) == null) {
            return (long) i;
        }
        return (long) list.indexOf(list2.get(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.p$a */
    public static class C34701a {

        /* renamed from: a */
        List<C34690j> f81980a = new ArrayList();

        /* renamed from: b */
        public AbstractC34703b f81981b;

        static {
            Covode.recordClassIndex(41688);
        }

        /* renamed from: a */
        private static int m70876a(List<C34690j> list) {
            if (C13603b.m24435a((Collection) list)) {
                return 0;
            }
            HashSet hashSet = new HashSet();
            for (C34690j jVar : list) {
                if (jVar != null) {
                    hashSet.add(Integer.valueOf(jVar.f81951e));
                }
            }
            return hashSet.size();
        }

        /* renamed from: a */
        public final C34700p mo61371a(AbstractC0952i iVar) {
            C34700p pVar = new C34700p(iVar, m70876a(this.f81980a));
            pVar.f81977h = this.f81981b;
            pVar.f81973d = this.f81980a;
            if (!C13603b.m24435a((Collection) pVar.f81973d)) {
                pVar.f81974e = new HashMap<>(pVar.f81973d.size());
                pVar.f81975f = new ArrayList();
                for (C34690j jVar : pVar.f81973d) {
                    if (jVar != null) {
                        pVar.f81974e.put(jVar.f81948b, jVar);
                        int i = jVar.f81951e;
                        if (i >= pVar.f81975f.size()) {
                            pVar.f81975f.add(i, jVar);
                        }
                    }
                }
                if (pVar.f81977h != null) {
                    pVar.f81977h.mo61374a(pVar.f81975f);
                }
                pVar.f81975f.size();
            }
            return pVar;
        }

        /* renamed from: a */
        public final C34701a mo61370a(Class<? extends C34685e> cls, String str, Bundle bundle) {
            int i;
            if (C13603b.m24435a((Collection) this.f81980a)) {
                i = 0;
            } else {
                Collections.sort(this.f81980a, new Comparator<C34690j>() {
                    /* class com.p2082ss.android.ugc.aweme.base.p2379ui.C34700p.C34701a.C347021 */

                    static {
                        Covode.recordClassIndex(41689);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // java.util.Comparator
                    public final /* bridge */ /* synthetic */ int compare(C34690j jVar, C34690j jVar2) {
                        return jVar.f81951e - jVar2.f81951e;
                    }
                });
                i = 1;
                for (int i2 = 1; i2 < this.f81980a.size(); i2++) {
                    if (this.f81980a.get(i2 - 1).f81951e != this.f81980a.get(i2).f81951e) {
                        i++;
                    }
                }
            }
            return mo61369a(cls, str, i, bundle);
        }

        /* renamed from: a */
        public final C34701a mo61369a(Class<? extends C34685e> cls, String str, int i, Bundle bundle) {
            this.f81980a.add(new C34690j(cls, str, i, 1.0f, bundle));
            return this;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C34685e mo61347c(int i) {
        C34690j jVar = this.f81975f.get(i);
        if (jVar == null) {
            return null;
        }
        try {
            C34685e eVar = (C34685e) jVar.f81947a.newInstance();
            if (!(jVar.f81949c == null || eVar == null)) {
                eVar.setArguments(jVar.f81949c);
            }
            return eVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.fragment.app.Fragment] */
    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34686f
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo61345a(C34685e eVar) {
        C34685e eVar2 = eVar;
        AbstractC34704c cVar = this.f81978i;
        if (cVar != null) {
            cVar.mo61375a(eVar2);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public float getPageWidth(int i) {
        C34690j jVar;
        if (i < 0 || i >= this.f81975f.size()) {
            jVar = null;
        } else {
            jVar = this.f81975f.get(i);
        }
        if (jVar == null || jVar.f81950d <= 0.0f) {
            return 1.0f;
        }
        return jVar.f81950d;
    }

    /* renamed from: a */
    public final void mo61368a(String str) {
        C34690j jVar;
        if (!C13603b.m24435a((Collection) this.f81973d) && !C13603b.m24435a((Collection) this.f81975f) && !TextUtils.isEmpty(str) && (jVar = this.f81974e.get(str)) != null && this.f81975f.size() > jVar.f81951e && !str.equals(this.f81975f.get(jVar.f81951e).f81948b)) {
            AbstractC0976n a = this.f81976g.mo3552a();
            Fragment a2 = this.f81976g.mo3551a(m70869b(this.f81975f.get(jVar.f81951e)));
            if (a2 != null) {
                a.mo3471b(a2);
            }
            Fragment a3 = this.f81976g.mo3551a(m70869b(jVar));
            if (a3 == null || !a3.isAdded()) {
                m70869b(jVar);
            } else {
                a.mo3474c(a3);
            }
            a.mo3473c();
            this.f81975f.remove(jVar.f81951e);
            this.f81975f.add(jVar.f81951e, jVar);
            AbstractC34703b bVar = this.f81977h;
            if (bVar != null) {
                bVar.mo61374a(this.f81975f);
            }
            notifyDataSetChanged();
        }
    }

    public C34700p(AbstractC0952i iVar, int i) {
        super(iVar, i);
        this.f81976g = iVar;
    }

    @Override // com.bytedance.ies.uikit.p1284f.AbstractC18273b, androidx.viewpager.widget.PagerAdapter, com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34686f
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        this.f81979j = viewGroup.getId();
        return super.instantiateItem(viewGroup, i);
    }

    /* renamed from: a */
    private static String m70868a(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }
}
