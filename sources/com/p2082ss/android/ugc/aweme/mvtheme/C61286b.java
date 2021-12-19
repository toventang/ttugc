package com.p2082ss.android.ugc.aweme.mvtheme;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mvtheme.b */
public final class C61286b implements Serializable {
    @AbstractC27891c(mo46611a = "template_items")

    /* renamed from: a */
    private final List<C61287c> f139189a;

    static {
        Covode.recordClassIndex(71905);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.mvtheme.b */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C61286b copy$default(C61286b bVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bVar.f139189a;
        }
        return bVar.copy(list);
    }

    public final List<C61287c> component1() {
        return this.f139189a;
    }

    public final C61286b copy(List<C61287c> list) {
        C89219l.m154721d(list, "");
        return new C61286b(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C61286b) && C89219l.m154714a(this.f139189a, ((C61286b) obj).f139189a);
        }
        return true;
    }

    public final int hashCode() {
        List<C61287c> list = this.f139189a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "BirthdayBlessMvParam(templateItems=" + this.f139189a + ")";
    }

    public final List<C61287c> getTemplateItems() {
        return this.f139189a;
    }

    public final int getTemplateCount() {
        return this.f139189a.size();
    }

    public C61286b(List<C61287c> list) {
        C89219l.m154721d(list, "");
        this.f139189a = list;
    }

    public final C61287c getCurrentTemplate(String str) {
        T t;
        Iterator<T> it = this.f139189a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C89219l.m154714a((Object) t.getEffectId(), (Object) str)) {
                break;
            }
        }
        return t;
    }

    public final C61287c getNextTemplate(String str) {
        int i;
        List<C61287c> list = this.f139189a;
        ListIterator<C61287c> listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (C89219l.m154714a((Object) listIterator.previous().getEffectId(), (Object) str)) {
                    i = listIterator.nextIndex();
                    break;
                }
            } else {
                i = -1;
                break;
            }
        }
        C61287c cVar = (C61287c) C89070n.m154561b((List) this.f139189a, i + 1);
        if (cVar == null) {
            return (C61287c) C89070n.m154583g((List) this.f139189a);
        }
        return cVar;
    }
}
