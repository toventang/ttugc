package com.google.p1971b.p1972a.p1993g;

import com.bytedance.covode.number.Covode;
import com.google.p1971b.p1972a.p1988f.p1989a.p1990a.p1991a.p1992a.C27159b;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: com.google.b.a.g.g */
public final class C27179g extends AbstractMap<String, Object> {

    /* renamed from: a */
    final Object f64346a;

    /* renamed from: b */
    final C27174d f64347b;

    static {
        Covode.recordClassIndex(32759);
    }

    /* renamed from: com.google.b.a.g.g$a */
    final class C27180a implements Map.Entry<String, Object> {

        /* renamed from: b */
        private Object f64349b;

        /* renamed from: c */
        private final C27184i f64350c;

        static {
            Covode.recordClassIndex(32760);
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f64349b;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String getKey() {
            String str = this.f64350c.f64367c;
            if (C27179g.this.f64347b.f64328b) {
                return str.toLowerCase();
            }
            return str;
        }

        public final int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            Object obj2 = this.f64349b;
            this.f64349b = C27159b.m53980a(obj);
            this.f64350c.mo45274a(C27179g.this.f64346a, obj);
            return obj2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!getKey().equals(entry.getKey()) || !getValue().equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        C27180a(C27184i iVar, Object obj) {
            this.f64350c = iVar;
            this.f64349b = C27159b.m53980a(obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.b.a.g.g$c */
    public final class C27182c extends AbstractSet<Map.Entry<String, Object>> {
        static {
            Covode.recordClassIndex(32762);
        }

        /* renamed from: a */
        public final C27181b iterator() {
            return new C27181b();
        }

        public final void clear() {
            for (String str : C27179g.this.f64347b.f64329c) {
                C27179g.this.f64347b.mo45245a(str).mo45274a(C27179g.this.f64346a, (Object) null);
            }
        }

        public final boolean isEmpty() {
            for (String str : C27179g.this.f64347b.f64329c) {
                if (C27179g.this.f64347b.mo45245a(str).mo45273a(C27179g.this.f64346a) != null) {
                    return false;
                }
            }
            return true;
        }

        public final int size() {
            int i = 0;
            for (String str : C27179g.this.f64347b.f64329c) {
                if (C27179g.this.f64347b.mo45245a(str).mo45273a(C27179g.this.f64346a) != null) {
                    i++;
                }
            }
            return i;
        }

        C27182c() {
        }
    }

    /* renamed from: a */
    public final C27182c entrySet() {
        return new C27182c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.b.a.g.g$b */
    public final class C27181b implements Iterator<Map.Entry<String, Object>> {

        /* renamed from: b */
        private int f64352b = -1;

        /* renamed from: c */
        private C27184i f64353c;

        /* renamed from: d */
        private Object f64354d;

        /* renamed from: e */
        private boolean f64355e;

        /* renamed from: f */
        private boolean f64356f;

        /* renamed from: g */
        private C27184i f64357g;

        static {
            Covode.recordClassIndex(32761);
        }

        public final void remove() {
            C27184i iVar = this.f64357g;
            if (iVar == null || this.f64355e) {
                throw new IllegalStateException();
            }
            this.f64355e = true;
            iVar.mo45274a(C27179g.this.f64346a, (Object) null);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public final /* synthetic */ Map.Entry<String, Object> next() {
            if (hasNext()) {
                this.f64357g = this.f64353c;
                Object obj = this.f64354d;
                this.f64356f = false;
                this.f64355e = false;
                this.f64353c = null;
                this.f64354d = null;
                return new C27180a(this.f64357g, obj);
            }
            throw new NoSuchElementException();
        }

        public final boolean hasNext() {
            if (!this.f64356f) {
                this.f64356f = true;
                this.f64354d = null;
                while (this.f64354d == null) {
                    int i = this.f64352b + 1;
                    this.f64352b = i;
                    if (i >= C27179g.this.f64347b.f64329c.size()) {
                        break;
                    }
                    C27184i a = C27179g.this.f64347b.mo45245a(C27179g.this.f64347b.f64329c.get(this.f64352b));
                    this.f64353c = a;
                    this.f64354d = a.mo45273a(C27179g.this.f64346a);
                }
            }
            if (this.f64354d != null) {
                return true;
            }
            return false;
        }

        C27181b() {
        }
    }

    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C27184i a;
        if ((obj instanceof String) && (a = this.f64347b.mo45245a((String) obj)) != null) {
            return a.mo45273a(this.f64346a);
        }
        return null;
    }

    public C27179g(Object obj, boolean z) {
        this.f64346a = obj;
        C27174d a = C27174d.m54007a(obj.getClass(), z);
        this.f64347b = a;
        C27159b.m53983a(!a.f64327a.isEnum());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(String str, Object obj) {
        String str2;
        String str3 = str;
        C27184i a = this.f64347b.mo45245a(str3);
        String valueOf = String.valueOf(str3);
        if (valueOf.length() != 0) {
            str2 = "no field of key ".concat(valueOf);
        } else {
            str2 = new String("no field of key ");
        }
        C27159b.m53981a(a, str2);
        Object a2 = a.mo45273a(this.f64346a);
        a.mo45274a(this.f64346a, C27159b.m53980a(obj));
        return a2;
    }
}
