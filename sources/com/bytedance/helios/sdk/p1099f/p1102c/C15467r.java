package com.bytedance.helios.sdk.p1099f.p1102c;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15484f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.helios.sdk.f.c.r */
public final class C15467r {

    /* renamed from: a */
    public static final C15467r f37702a = new C15467r();

    /* renamed from: b */
    private static final List<AbstractC15453f> f37703b = C89070n.m154522b(new C15457i(), new C15469t(), new C15464p(), new C15448a(), new C15450c(), new C15461m(), new C15452e(), new C15451d(), new C15458j(), new C15456h(), new C15468s(), new C15470u(), new C15460l(), new C15449b(), new C15459k(), new C15454g(), new C15465q(), new C15462n());

    private C15467r() {
    }

    static {
        Covode.recordClassIndex(17719);
    }

    /* renamed from: a */
    private static AbstractC15453f m28451a(String str) {
        T t;
        Iterator<T> it = f37703b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C89219l.m154714a((Object) t.mo25188a(), (Object) str)) {
                break;
            }
        }
        return t;
    }

    /* renamed from: a */
    public static boolean m28452a(Object obj) {
        String valueOf = String.valueOf(obj);
        Locale locale = Locale.getDefault();
        C89219l.m154709a((Object) locale, "");
        Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(locale);
        C89219l.m154716b(lowerCase, "");
        if (C89219l.m154714a((Object) lowerCase, (Object) "true")) {
            return true;
        }
        if (C89219l.m154714a((Object) lowerCase, (Object) "false")) {
            return false;
        }
        throw new RuntimeException("not valid boolean, value = ".concat(String.valueOf(lowerCase)));
    }

    /* renamed from: a */
    private static boolean m28454a(List<Object> list) {
        Object a;
        Object obj;
        String str;
        String str2;
        if (list == null || list.isEmpty()) {
            return false;
        }
        if (list.size() == 1 && ((obj = list.get(0)) == null || (obj instanceof String))) {
            String str3 = (String) obj;
            if (str3 != null) {
                Locale locale = Locale.getDefault();
                C89219l.m154709a((Object) locale, "");
                Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
                str = str3.toLowerCase(locale);
                C89219l.m154716b(str, "");
            } else {
                str = null;
            }
            if (C89219l.m154714a((Object) str, (Object) "true")) {
                return true;
            }
            if (str3 != null) {
                Locale locale2 = Locale.getDefault();
                C89219l.m154709a((Object) locale2, "");
                Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
                str2 = str3.toLowerCase(locale2);
                C89219l.m154716b(str2, "");
            } else {
                str2 = null;
            }
            if (C89219l.m154714a((Object) str2, (Object) "false")) {
                return false;
            }
        }
        Stack stack = new Stack();
        for (T t : list) {
            if (t instanceof AbstractC15453f) {
                if (t instanceof C15462n) {
                    a = t.mo25187a(null, stack.pop());
                } else {
                    a = t.mo25187a(stack.pop(), stack.pop());
                }
                stack.push(a);
            } else {
                stack.push(t);
            }
        }
        return m28452a(stack.pop());
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0033 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0036  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m28453a(java.lang.String r11, java.util.Map<java.lang.String, p4600h.p4611f.p4612a.AbstractC89171a<java.lang.Object>> r12) {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.sdk.p1099f.p1102c.C15467r.m28453a(java.lang.String, java.util.Map):boolean");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x0096 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* renamed from: b */
    private static List<Object> m28455b(String str, Map<String, AbstractC89171a<Object>> map) {
        List<String> b = C89361p.m154915b(str, new String[]{" "});
        ArrayList arrayList = new ArrayList();
        for (T t : b) {
            if (!C89361p.m154870a((CharSequence) t)) {
                arrayList.add(t);
            }
        }
        ArrayList<String> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
        for (String str2 : arrayList2) {
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.CharSequence");
            String a = C89361p.m154868a(C89361p.m154910b((CharSequence) str2).toString(), "$@", " ");
            AbstractC15453f a2 = m28451a(a);
            AbstractC89171a<Object> aVar = map.get(a);
            if (a2 != null) {
                a = a2;
            } else if (map.containsKey(a)) {
                Object invoke = aVar != null ? aVar.invoke() : null;
                C15484f.m28491a("Helios-Control-Api", "parseExpression " + a + '=' + invoke, (String) null, 12);
                a = invoke;
            }
            arrayList3.add(a == true ? 1 : 0);
        }
        ArrayList arrayList4 = new ArrayList();
        Stack stack = new Stack();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(next instanceof AbstractC15453f)) {
                arrayList4.add(next);
            } else if (next instanceof C15457i) {
                stack.add(next);
            } else if (next instanceof C15469t) {
                while (!(stack.peek() instanceof C15457i)) {
                    arrayList4.add(stack.pop());
                }
                stack.pop();
            } else {
                while ((!stack.isEmpty()) && ((AbstractC15453f) next).mo25189b() <= ((AbstractC15453f) stack.peek()).mo25189b()) {
                    arrayList4.add(stack.pop());
                }
                stack.push(next);
            }
        }
        while (!stack.isEmpty()) {
            arrayList4.add(stack.pop());
        }
        return arrayList4;
    }
}
