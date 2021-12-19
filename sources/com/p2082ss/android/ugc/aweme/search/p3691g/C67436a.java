package com.p2082ss.android.ugc.aweme.search.p3691g;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.search.g.a */
public final class C67436a implements Serializable {
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: a */
    private String f151079a;
    @AbstractC27891c(mo46611a = "option_list")

    /* renamed from: b */
    private List<C67443h> f151080b;

    static {
        Covode.recordClassIndex(79072);
    }

    public final List<C67443h> getActivitySelectOption() {
        return this.f151080b;
    }

    public final List<C67443h> getOptionStructList() {
        return this.f151080b;
    }

    public final String getTitle() {
        return this.f151079a;
    }

    public final boolean isEmpty() {
        List<C67443h> list = this.f151080b;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final List<C67443h> getOptionStuct() {
        List<C67443h> list = this.f151080b;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().setActivityOptionStruct(this);
            }
        }
        return this.f151080b;
    }

    public final boolean isDefault() {
        List<C67443h> list = this.f151080b;
        if (list == null) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isSelected()) {
                return false;
            }
        }
        return true;
    }

    public final void reset() {
        List<C67443h> list = this.f151080b;
        if (list != null) {
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                if (t2 != null) {
                    t2.setSelected(false);
                }
                i = i2;
            }
        }
    }

    public final List<C67443h> getDefaultOptionStruct() {
        ArrayList arrayList = new ArrayList();
        List<C67443h> list = this.f151080b;
        if (list != null) {
            for (T t : list) {
                C67443h hVar = new C67443h();
                hVar.setDescription(t.getDescription());
                hVar.setActivityOptionStruct(t.getActivityOptionStruct());
                hVar.setSelected(false);
                hVar.setLogInfo(t.getLogInfo());
                hVar.setName(t.getName());
                hVar.setRequestKey(t.getRequestKey());
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public final void setOptionStructList(List<C67443h> list) {
        this.f151080b = list;
    }

    public final void setTitle(String str) {
        this.f151079a = str;
    }

    public final void setLastOptionData(List<C67443h> list) {
        String str;
        C67443h hVar;
        if (list != null) {
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                String requestKey = t2.getRequestKey();
                List<C67443h> list2 = this.f151080b;
                if (list2 == null || (hVar = list2.get(i)) == null) {
                    str = null;
                } else {
                    str = hVar.getRequestKey();
                }
                if (C89361p.m154872a(requestKey, str, false)) {
                    List<C67443h> list3 = this.f151080b;
                    if (list3 == null) {
                        C89219l.m154715b();
                    }
                    list3.get(i).setSelected(t2.isSelected());
                }
                i = i2;
            }
        }
    }

    public final void selectOption(C67443h hVar, boolean z) {
        List<C67443h> list;
        if (!(hVar == null || (list = this.f151080b) == null)) {
            for (T t : list) {
                if (C89361p.m154872a(t.getRequestKey(), hVar.getRequestKey(), false)) {
                    t.setSelected(z);
                    return;
                }
            }
        }
    }
}
