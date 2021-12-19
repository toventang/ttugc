package com.bytedance.ies.xelement.overlay;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.overlay.b */
public final class C19307b {

    /* renamed from: a */
    static final List<C19308a> f45624a = new ArrayList();

    /* renamed from: b */
    static int f45625b;

    /* renamed from: c */
    public static final C19307b f45626c = new C19307b();

    private C19307b() {
    }

    static {
        Covode.recordClassIndex(22092);
    }

    /* renamed from: a */
    public static JavaOnlyArray m36039a() {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        Iterator<T> it = f45624a.iterator();
        while (it.hasNext()) {
            javaOnlyArray.pushString(it.next().f45627a);
        }
        return javaOnlyArray;
    }

    /* renamed from: a */
    public static void m36040a(String str) {
        if (str != null) {
            for (T t : f45624a) {
                if (C89219l.m154714a((Object) t.f45627a, (Object) str)) {
                    f45624a.remove(t);
                    return;
                }
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.overlay.b$a */
    public static final class C19308a {

        /* renamed from: a */
        public final String f45627a;

        /* renamed from: b */
        public final DialogC19305a f45628b;

        static {
            Covode.recordClassIndex(22093);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19308a)) {
                return false;
            }
            C19308a aVar = (C19308a) obj;
            return C89219l.m154714a(this.f45627a, aVar.f45627a) && C89219l.m154714a(this.f45628b, aVar.f45628b);
        }

        public final int hashCode() {
            String str = this.f45627a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            DialogC19305a aVar = this.f45628b;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "OverlayData(id=" + this.f45627a + ", dialog=" + this.f45628b + ")";
        }

        public C19308a(String str, DialogC19305a aVar) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(aVar, "");
            this.f45627a = str;
            this.f45628b = aVar;
        }
    }
}
