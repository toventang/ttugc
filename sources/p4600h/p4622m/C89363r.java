package p4600h.p4622m;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.m.r */
public class C89363r extends C89362q {

    /* access modifiers changed from: package-private */
    /* renamed from: h.m.r$a */
    public static final class C89364a extends AbstractC89220m implements AbstractC89172b<String, String> {

        /* renamed from: a */
        public static final C89364a f203037a = new C89364a();

        static {
            Covode.recordClassIndex(105448);
        }

        C89364a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(String str) {
            C89219l.m154721d(str, "");
            return str;
        }
    }

    static {
        Covode.recordClassIndex(105447);
    }

    /* renamed from: b */
    public static final String m154854b(String str) {
        C89219l.m154721d(str, "");
        return C89361p.m154855b(str, "");
    }

    /* renamed from: d */
    private static final AbstractC89172b<String, String> m154857d(String str) {
        if (str.length() == 0) {
            return C89364a.f203037a;
        }
        return new C89365b(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h.m.r$b */
    public static final class C89365b extends AbstractC89220m implements AbstractC89172b<String, String> {

        /* renamed from: a */
        final /* synthetic */ String f203038a;

        static {
            Covode.recordClassIndex(105449);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C89365b(String str) {
            super(1);
            this.f203038a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            return this.f203038a + str2;
        }
    }

    /* renamed from: c */
    private static final int m154856c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (!(!C89332a.m154830a(str.charAt(i)))) {
                i++;
            } else if (i != -1) {
                return i;
            }
        }
        return str.length();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        if (r3 == null) goto L_0x0058;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m154853a(java.lang.String r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: p4600h.p4622m.C89363r.m154853a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static final String m154855b(String str, String str2) {
        int i;
        String invoke;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        List<String> h = C89361p.m154937h((CharSequence) str);
        ArrayList arrayList = new ArrayList();
        for (T t : h) {
            if (!C89361p.m154870a((CharSequence) t)) {
                arrayList.add(t);
            }
        }
        ArrayList<String> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
        for (String str3 : arrayList2) {
            arrayList3.add(Integer.valueOf(m154856c(str3)));
        }
        Integer num = (Integer) C89070n.m154597q(arrayList3);
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int length = str.length() + (str2.length() * h.size());
        AbstractC89172b<String, String> d = m154857d(str2);
        int a = C89070n.m154517a((List) h);
        ArrayList arrayList4 = new ArrayList();
        for (T t2 : h) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C89070n.m154520a();
            }
            T t3 = t2;
            if ((i2 != 0 && i2 != a) || !C89361p.m154870a((CharSequence) t3)) {
                String a2 = C89361p.m154821a((String) t3, i);
                if (a2 != null && (invoke = d.invoke(a2)) != null) {
                    t3 = invoke;
                } else if (t3 == null) {
                }
                arrayList4.add(t3);
            }
            i2 = i3;
        }
        String sb = ((StringBuilder) C89070n.m154548a(arrayList4, new StringBuilder(length), "\n", "", "", -1, "...", (AbstractC89172b) null)).toString();
        C89219l.m154716b(sb, "");
        return sb;
    }
}
