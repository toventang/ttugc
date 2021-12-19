package com.google.p1971b.p1972a.p1993g;

import com.bytedance.covode.number.Covode;
import com.google.p1971b.p1972a.p1993g.C27179g;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.b.a.g.j */
public class C27185j extends AbstractMap<String, Object> implements Cloneable {

    /* renamed from: h */
    public Map<String, Object> f64368h;

    /* renamed from: i */
    public final C27174d f64369i;

    static {
        Covode.recordClassIndex(32765);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<String, Object>> entrySet() {
        return new C27187b();
    }

    /* renamed from: com.google.b.a.g.j$a */
    final class C27186a implements Iterator<Map.Entry<String, Object>> {

        /* renamed from: b */
        private boolean f64371b;

        /* renamed from: c */
        private final Iterator<Map.Entry<String, Object>> f64372c;

        /* renamed from: d */
        private final Iterator<Map.Entry<String, Object>> f64373d;

        static {
            Covode.recordClassIndex(32766);
        }

        public final void remove() {
            if (this.f64371b) {
                this.f64373d.remove();
            }
            this.f64372c.remove();
        }

        public final boolean hasNext() {
            if (this.f64372c.hasNext() || this.f64373d.hasNext()) {
                return true;
            }
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public final /* synthetic */ Map.Entry<String, Object> next() {
            if (!this.f64371b) {
                if (this.f64372c.hasNext()) {
                    return this.f64372c.next();
                }
                this.f64371b = true;
            }
            return this.f64373d.next();
        }

        C27186a(C27179g.C27182c cVar) {
            this.f64372c = cVar.iterator();
            this.f64373d = C27185j.this.f64368h.entrySet().iterator();
        }
    }

    /* renamed from: com.google.b.a.g.j$b */
    final class C27187b extends AbstractSet<Map.Entry<String, Object>> {

        /* renamed from: b */
        private final C27179g.C27182c f64375b;

        static {
            Covode.recordClassIndex(32767);
        }

        public final void clear() {
            C27185j.this.f64368h.clear();
            this.f64375b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<Map.Entry<String, Object>> iterator() {
            return new C27186a(this.f64375b);
        }

        public final int size() {
            return C27185j.this.f64368h.size() + this.f64375b.size();
        }

        C27187b() {
            this.f64375b = new C27179g(C27185j.this, C27185j.this.f64369i.f64328b).entrySet();
        }
    }

    public C27185j() {
        this(EnumSet.noneOf(EnumC27188c.class));
    }

    /* renamed from: com.google.b.a.g.j$c */
    public enum EnumC27188c {
        IGNORE_CASE;

        static {
            Covode.recordClassIndex(32768);
        }
    }

    /* renamed from: b */
    public C27185j clone() {
        try {
            C27185j jVar = (C27185j) super.clone();
            C27178f.m54014a(this, jVar);
            jVar.f64368h = (Map) C27178f.m54017b(this.f64368h);
            return jVar;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public C27185j(EnumSet<EnumC27188c> enumSet) {
        this.f64368h = new C27161a();
        this.f64369i = C27174d.m54007a(getClass(), enumSet.contains(EnumC27188c.IGNORE_CASE));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        C27184i a = this.f64369i.mo45245a(str);
        if (a != null) {
            return a.mo45273a(this);
        }
        if (this.f64369i.f64328b) {
            str = str.toLowerCase();
        }
        return this.f64368h.get(str);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map<? extends java.lang.String, ?>] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends String, ? extends Object> map) {
        for (Map.Entry<? extends String, ? extends Object> entry : map.entrySet()) {
            mo45179b((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.f64369i.mo45245a(str) == null) {
            if (this.f64369i.f64328b) {
                str = str.toLowerCase();
            }
            return this.f64368h.remove(str);
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object put(String str, Object obj) {
        C27184i a = this.f64369i.mo45245a(str);
        if (a != null) {
            Object a2 = a.mo45273a(this);
            a.mo45274a(this, obj);
            return a2;
        }
        if (this.f64369i.f64328b) {
            str = str.toLowerCase();
        }
        return this.f64368h.put(str, obj);
    }

    /* renamed from: b */
    public C27185j mo45179b(String str, Object obj) {
        C27184i a = this.f64369i.mo45245a(str);
        if (a != null) {
            a.mo45274a(this, obj);
        } else {
            if (this.f64369i.f64328b) {
                str = str.toLowerCase();
            }
            this.f64368h.put(str, obj);
        }
        return this;
    }
}
