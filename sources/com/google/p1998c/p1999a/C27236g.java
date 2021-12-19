package com.google.p1998c.p1999a;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.google.c.a.g */
public class C27236g {

    /* renamed from: a */
    public final String f64396a;

    static {
        Covode.recordClassIndex(32816);
    }

    private C27236g(C27236g gVar) {
        this.f64396a = gVar.f64396a;
    }

    /* renamed from: a */
    public static C27236g m54207a(String str) {
        return new C27236g(str);
    }

    public C27236g(String str) {
        this.f64396a = (String) C27245k.m54229a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public CharSequence mo45321a(Object obj) {
        C27245k.m54229a(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    /* renamed from: b */
    public C27236g mo45324b(final String str) {
        C27245k.m54229a(str);
        return new C27236g(this) {
            /* class com.google.p1998c.p1999a.C27236g.C272371 */

            static {
                Covode.recordClassIndex(32817);
            }

            @Override // com.google.p1998c.p1999a.C27236g
            /* renamed from: b */
            public final C27236g mo45324b(String str) {
                throw new UnsupportedOperationException("already specified useForNull");
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p1999a.C27236g
            /* renamed from: a */
            public final CharSequence mo45321a(Object obj) {
                if (obj == null) {
                    return str;
                }
                return C27236g.this.mo45321a(obj);
            }
        };
    }

    /* renamed from: a */
    public final String mo45322a(Iterable<?> iterable) {
        return m54208a(new StringBuilder(), iterable.iterator()).toString();
    }

    /* renamed from: a */
    public final String mo45323a(Object[] objArr) {
        return mo45322a((Iterable<?>) Arrays.asList(objArr));
    }

    /* synthetic */ C27236g(C27236g gVar, byte b) {
        this(gVar);
    }

    /* renamed from: a */
    private StringBuilder m54208a(StringBuilder sb, Iterator<?> it) {
        try {
            C27245k.m54229a(sb);
            if (it.hasNext()) {
                sb.append(mo45321a(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f64396a);
                    sb.append(mo45321a(it.next()));
                }
            }
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
