package com.p2082ss.ugc.live.barrage;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.barrage.p4467a.AbstractC87048a;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.live.barrage.a */
public final class C87046a extends CopyOnWriteArrayList<AbstractC87048a> {

    /* renamed from: a */
    private AbstractC87047a f196251a;

    /* renamed from: com.ss.ugc.live.barrage.a$a */
    public interface AbstractC87047a {
        static {
            Covode.recordClassIndex(102813);
        }

        /* renamed from: a */
        void mo140671a(boolean z, AbstractC87048a aVar);
    }

    static {
        Covode.recordClassIndex(102812);
    }

    public final int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(AbstractC87048a aVar) {
        return super.contains((Object) aVar);
    }

    public final /* bridge */ int indexOf(AbstractC87048a aVar) {
        return super.indexOf((Object) aVar);
    }

    public final /* bridge */ int lastIndexOf(AbstractC87048a aVar) {
        return super.lastIndexOf((Object) aVar);
    }

    @Override // java.util.List, java.util.concurrent.CopyOnWriteArrayList
    public final AbstractC87048a remove(int i) {
        return remove(i);
    }

    public final void setOnChangeListener(AbstractC87047a aVar) {
        C89219l.m154719c(aVar, "");
        this.f196251a = aVar;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof AbstractC87048a)) {
            return contains((AbstractC87048a) obj);
        }
        return false;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null || (obj instanceof AbstractC87048a)) {
            return indexOf((AbstractC87048a) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null || (obj instanceof AbstractC87048a)) {
            return lastIndexOf((AbstractC87048a) obj);
        }
        return -1;
    }

    public final boolean remove(AbstractC87048a aVar) {
        boolean remove = super.remove((Object) aVar);
        if (aVar != null) {
            aVar.mo140673a(AbstractC87048a.AbstractC87049a.C87050a.f196259a);
            AbstractC87047a aVar2 = this.f196251a;
            if (aVar2 != null) {
                aVar2.mo140671a(false, aVar);
            }
        }
        return remove;
    }

    /* renamed from: removeAt */
    public final AbstractC87048a remove(int i) {
        AbstractC87048a aVar = (AbstractC87048a) super.remove(i);
        if (aVar != null) {
            aVar.mo140673a(AbstractC87048a.AbstractC87049a.C87050a.f196259a);
            AbstractC87047a aVar2 = this.f196251a;
            if (aVar2 != null) {
                aVar2.mo140671a(false, aVar);
            }
        }
        C89219l.m154709a((Object) aVar, "");
        return aVar;
    }

    public final boolean add(AbstractC87048a aVar) {
        C89219l.m154719c(aVar, "");
        boolean add = super.add((Object) aVar);
        aVar.mo140673a(AbstractC87048a.AbstractC87049a.C87053d.f196262a);
        AbstractC87047a aVar2 = this.f196251a;
        if (aVar2 != null) {
            aVar2.mo140671a(true, aVar);
        }
        return add;
    }

    @Override // java.util.List, java.util.concurrent.CopyOnWriteArrayList
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof AbstractC87048a)) {
            return remove((AbstractC87048a) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.util.concurrent.CopyOnWriteArrayList
    public final boolean removeAll(Collection<? extends Object> collection) {
        C89219l.m154719c(collection, "");
        boolean removeAll = super.removeAll(collection);
        Iterator<? extends Object> it = collection.iterator();
        while (it.hasNext()) {
            AbstractC87048a aVar = (AbstractC87048a) it.next();
            if (aVar != null) {
                aVar.mo140673a(AbstractC87048a.AbstractC87049a.C87050a.f196259a);
                AbstractC87047a aVar2 = this.f196251a;
                if (aVar2 != null) {
                    aVar2.mo140671a(false, aVar);
                }
            }
        }
        return removeAll;
    }

    @Override // java.util.List, java.util.Collection, java.util.concurrent.CopyOnWriteArrayList
    public final boolean addAll(Collection<? extends AbstractC87048a> collection) {
        C89219l.m154719c(collection, "");
        boolean addAll = super.addAll(collection);
        for (AbstractC87048a aVar : collection) {
            aVar.mo140673a(AbstractC87048a.AbstractC87049a.C87053d.f196262a);
            AbstractC87047a aVar2 = this.f196251a;
            if (aVar2 != null) {
                aVar2.mo140671a(true, aVar);
            }
        }
        return addAll;
    }

    public final void add(int i, AbstractC87048a aVar) {
        C89219l.m154719c(aVar, "");
        super.add(i, (Object) aVar);
        aVar.mo140673a(AbstractC87048a.AbstractC87049a.C87053d.f196262a);
        AbstractC87047a aVar2 = this.f196251a;
        if (aVar2 != null) {
            aVar2.mo140671a(true, aVar);
        }
    }

    @Override // java.util.List, java.util.concurrent.CopyOnWriteArrayList
    public final boolean addAll(int i, Collection<? extends AbstractC87048a> collection) {
        C89219l.m154719c(collection, "");
        boolean addAll = super.addAll(i, collection);
        for (AbstractC87048a aVar : collection) {
            aVar.mo140673a(AbstractC87048a.AbstractC87049a.C87053d.f196262a);
            AbstractC87047a aVar2 = this.f196251a;
            if (aVar2 != null) {
                aVar2.mo140671a(true, aVar);
            }
        }
        return addAll;
    }
}
