package com.p2082ss.android.ugc.aweme.search.p3691g;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.g.c */
public final class C67438c implements Serializable {
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: a */
    private String f151088a;
    @AbstractC27891c(mo46611a = "collapsed")

    /* renamed from: b */
    private String f151089b;
    @AbstractC27891c(mo46611a = "option_list")

    /* renamed from: c */
    private List<C67442g> f151090c;

    static {
        Covode.recordClassIndex(79074);
    }

    public final String getCollapsed() {
        return this.f151089b;
    }

    public final List<C67442g> getOptionStructList() {
        return this.f151090c;
    }

    public final String getTitle() {
        return this.f151088a;
    }

    public final C67442g getDefaultOption() {
        List<C67442g> list = this.f151090c;
        if (list != null) {
            return (C67442g) C89070n.m154583g((List) list);
        }
        return null;
    }

    public final boolean isEmpty() {
        List<C67442g> list = this.f151090c;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final List<C67442g> getOptionStuct() {
        List<C67442g> list = this.f151090c;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().setFilterOptionStruct(this);
            }
        }
        return this.f151090c;
    }

    public final C67442g getSelectOption() {
        List<C67442g> list = this.f151090c;
        T t = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.isSelected()) {
                t = next;
                break;
            }
        }
        return t;
    }

    public final void reset() {
        boolean z;
        List<C67442g> list = this.f151090c;
        if (list != null) {
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                boolean z2 = true;
                if (t2 != null) {
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    t2.setSelected(z);
                    if (i != 0) {
                        z2 = false;
                    }
                    t2.setDefaultOption(z2);
                }
                i = i2;
            }
        }
    }

    public final void setCollapsed(String str) {
        this.f151089b = str;
    }

    public final void setOptionStructList(List<C67442g> list) {
        this.f151090c = list;
    }

    public final void setTitle(String str) {
        this.f151088a = str;
    }

    public final void selectOption(C67442g gVar) {
        List<C67442g> list;
        if (!(gVar == null || (list = this.f151090c) == null)) {
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                if (t2 != null) {
                    t2.setSelected(C89219l.m154714a((Object) t2, (Object) gVar));
                }
                i = i2;
            }
        }
    }
}
