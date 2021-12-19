package p4600h.p4622m;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89266e;
import p4600h.p4619j.C89269g;
import p4600h.p4619j.C89271h;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4621l.C89309k;

/* renamed from: h.m.z */
public class C89373z extends C89372y {
    static {
        Covode.recordClassIndex(105457);
    }

    /* renamed from: a */
    public static final String m154897a(String str, char c, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        int a = C89361p.m154882a((CharSequence) str, c, 0, false, 6);
        if (a == -1) {
            return str2;
        }
        String substring = str.substring(0, a);
        C89219l.m154716b(substring, "");
        return substring;
    }

    /* renamed from: a */
    public static final CharSequence m154893a(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(charSequence2, "");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            C89219l.m154716b(sb.append(charSequence, 0, i), "");
            sb.append(charSequence2);
            C89219l.m154716b(sb.append(charSequence, i2, charSequence.length()), "");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    /* renamed from: a */
    public static final CharSequence m154892a(CharSequence charSequence, int i, int i2) {
        C89219l.m154721d(charSequence, "");
        if (i2 < i) {
            throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
        } else if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(charSequence.length() - (i2 - i));
            C89219l.m154716b(sb.append(charSequence, 0, i), "");
            C89219l.m154716b(sb.append(charSequence, i2, charSequence.length()), "");
            return sb;
        }
    }

    /* renamed from: a */
    public static final String m154900a(String str, CharSequence charSequence, CharSequence charSequence2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(charSequence2, "");
        if (str.length() < charSequence.length() + charSequence2.length() || !C89361p.m154916b((CharSequence) str, charSequence) || !C89361p.m154923c((CharSequence) str, charSequence2)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        C89219l.m154716b(substring, "");
        return substring;
    }

    /* renamed from: a */
    public static final String m154901a(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        int a = C89361p.m154885a((CharSequence) str, str2);
        if (a == -1) {
            return str4;
        }
        return C89361p.m154893a(str, a + str2.length(), str.length(), str3).toString();
    }

    /* renamed from: a */
    public static final boolean m154907a(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(charSequence2, "");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C89332a.m154831a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m154906a(CharSequence charSequence, char c) {
        C89219l.m154721d(charSequence, "");
        return charSequence.length() > 0 && C89332a.m154831a(charSequence.charAt(C89361p.m154930f(charSequence)), c, false);
    }

    /* renamed from: a */
    public static final int m154889a(CharSequence charSequence, char[] cArr, int i, boolean z) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(cArr, "");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int b = C89271h.m154769b(i, 0);
            int f = C89361p.m154930f(charSequence);
            if (b > f) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(b);
                for (char c : cArr) {
                    if (C89332a.m154831a(c, charAt, z)) {
                        return b;
                    }
                }
                if (b == f) {
                    return -1;
                }
                b++;
            }
        } else {
            return ((String) charSequence).indexOf(C89064i.m154473a(cArr), i);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ int m154888a(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return C89361p.m154887a(charSequence, str, i, z);
    }

    /* renamed from: a */
    public static final boolean m154908a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(charSequence2, "");
        return charSequence2 instanceof String ? C89361p.m154888a(charSequence, (String) charSequence2, 0, z, 2) >= 0 : m154884a(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0;
    }

    /* renamed from: a */
    public static final void m154905a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Limit must be non-negative, but was ".concat(String.valueOf(i)).toString());
        }
    }

    /* renamed from: a */
    public static final AbstractC89306h<String> m154890a(CharSequence charSequence, String[] strArr) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(strArr, "");
        return C89309k.m154810e(m154891a(charSequence, strArr, false, 0), new C89375b(charSequence));
    }

    /* renamed from: a */
    public static final List<String> m154904a(CharSequence charSequence, char[] cArr) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(cArr, "");
        return m154903a(charSequence, String.valueOf(cArr[0]), false, 0);
    }

    /* renamed from: a */
    private static final List<String> m154903a(CharSequence charSequence, String str, boolean z, int i) {
        C89361p.m154905a(0);
        int a = C89361p.m154887a(charSequence, str, 0, false);
        if (a == -1) {
            return C89070n.m154516a(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int i2 = 0;
        do {
            arrayList.add(charSequence.subSequence(i2, a).toString());
            i2 = str.length() + a;
            a = C89361p.m154887a(charSequence, str, i2, false);
        } while (a != -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x0033 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.CharSequence] */
    /* renamed from: a */
    public static final String m154902a(String str, char... cArr) {
        Object obj = "";
        C89219l.m154721d(str, obj);
        C89219l.m154721d(cArr, obj);
        int length = str.length() - 1;
        while (true) {
            if (length < 0) {
                break;
            }
            char charAt = str.charAt(length);
            C89219l.m154721d(cArr, obj);
            C89219l.m154721d(cArr, obj);
            int i = 0;
            while (true) {
                if (charAt == cArr[i]) {
                    break;
                }
                i++;
                if (i > 0) {
                    i = -1;
                    break;
                }
            }
            if (i < 0) {
                obj = str.subSequence(0, length + 1);
                break;
            }
            length--;
        }
        return obj.toString();
    }

    /* renamed from: a */
    public static final String m154898a(String str, C89269g gVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(gVar, "");
        String substring = str.substring(Integer.valueOf(gVar.f202927a).intValue(), Integer.valueOf(gVar.f202928b).intValue() + 1);
        C89219l.m154716b(substring, "");
        return substring;
    }

    /* renamed from: a */
    public static final String m154895a(CharSequence charSequence, C89269g gVar) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(gVar, "");
        return charSequence.subSequence(Integer.valueOf(gVar.f202927a).intValue(), Integer.valueOf(gVar.f202928b).intValue() + 1).toString();
    }

    /* renamed from: a */
    public static final String m154899a(String str, CharSequence charSequence) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(charSequence, "");
        if (!C89361p.m154916b((CharSequence) str, charSequence)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C89219l.m154716b(substring, "");
        return substring;
    }

    /* renamed from: a */
    public static final CharSequence m154894a(CharSequence charSequence, CharSequence charSequence2) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(charSequence2, "");
        if (C89361p.m154923c(charSequence, charSequence2)) {
            return charSequence.subSequence(0, charSequence.length() - charSequence2.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    /* renamed from: a */
    private static /* synthetic */ AbstractC89306h m154891a(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C89361p.m154905a(0);
        return new C89339e(charSequence, 0, new C89374a(C89064i.m154463a(strArr), false));
    }

    /* renamed from: h.m.z$b */
    static final class C89375b extends AbstractC89220m implements AbstractC89172b<C89269g, String> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f203041a;

        static {
            Covode.recordClassIndex(105459);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C89375b(CharSequence charSequence) {
            super(1);
            this.f203041a = charSequence;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(C89269g gVar) {
            C89269g gVar2 = gVar;
            C89219l.m154721d(gVar2, "");
            return C89361p.m154895a(this.f203041a, gVar2);
        }
    }

    /* renamed from: f */
    public static final int m154930f(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        return charSequence.length() - 1;
    }

    /* renamed from: h */
    public static final List<String> m154937h(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        return C89309k.m154813g(C89361p.m154933g(charSequence));
    }

    /* renamed from: d */
    public static final CharSequence m154924d(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return "";
            }
        } while (C89332a.m154830a(charSequence.charAt(length)));
        return charSequence.subSequence(0, length + 1);
    }

    /* renamed from: e */
    public static final C89269g m154927e(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        return new C89269g(0, charSequence.length() - 1);
    }

    /* renamed from: g */
    public static final AbstractC89306h<String> m154933g(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        return C89361p.m154890a(charSequence, new String[]{"\r\n", "\n", "\r"});
    }

    /* renamed from: b */
    public static final CharSequence m154910b(CharSequence charSequence) {
        int i;
        C89219l.m154721d(charSequence, "");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean a = C89332a.m154830a(charSequence.charAt(i));
            if (z) {
                if (!a) {
                    break;
                }
                length--;
            } else if (!a) {
                z = true;
            } else {
                i2++;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    /* renamed from: c */
    public static final CharSequence m154917c(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!C89332a.m154830a(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    /* renamed from: b */
    public static /* synthetic */ int m154909b(CharSequence charSequence, char c) {
        return C89361p.m154880a(charSequence, c, C89361p.m154930f(charSequence));
    }

    /* renamed from: c */
    public static final String m154919c(String str, CharSequence charSequence) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(charSequence, "");
        return C89361p.m154900a(str, charSequence, charSequence);
    }

    /* renamed from: b */
    public static final String m154913b(String str, CharSequence charSequence) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(charSequence, "");
        if (!C89361p.m154923c((CharSequence) str, charSequence)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        C89219l.m154716b(substring, "");
        return substring;
    }

    /* renamed from: c */
    public static final boolean m154922c(CharSequence charSequence, char c) {
        C89219l.m154721d(charSequence, "");
        if (C89361p.m154882a(charSequence, c, 0, false, 2) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h.m.z$a */
    public static final class C89374a extends AbstractC89220m implements AbstractC89183m<CharSequence, Integer, C89378p<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ List f203039a;

        /* renamed from: b */
        final /* synthetic */ boolean f203040b;

        static {
            Covode.recordClassIndex(105458);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C89374a(List list, boolean z) {
            super(2);
            this.f203039a = list;
            this.f203040b = z;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89378p<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            C89378p a;
            Object next;
            CharSequence charSequence2 = charSequence;
            int intValue = num.intValue();
            C89219l.m154721d(charSequence2, "");
            List list = this.f203039a;
            boolean z = this.f203040b;
            if (z || list.size() != 1) {
                C89269g gVar = new C89269g(C89271h.m154769b(intValue, 0), charSequence2.length());
                if (charSequence2 instanceof String) {
                    int i = gVar.f202927a;
                    int i2 = gVar.f202928b;
                    int i3 = gVar.f202929c;
                    if (i3 < 0 ? i >= i2 : i <= i2) {
                        while (true) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next2 = it.next();
                                String str = (String) next2;
                                if (C89361p.m154871a(str, 0, (String) charSequence2, i, str.length(), z)) {
                                    if (next2 != null) {
                                        a = C89387v.m154943a(Integer.valueOf(i), next2);
                                        break;
                                    }
                                }
                            }
                            if (i == i2) {
                                break;
                            }
                            i += i3;
                        }
                    }
                    return null;
                }
                int i4 = gVar.f202927a;
                int i5 = gVar.f202928b;
                int i6 = gVar.f202929c;
                if (i6 < 0 ? i4 >= i5 : i4 <= i5) {
                    while (true) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next3 = it2.next();
                            String str2 = (String) next3;
                            z = z;
                            if (C89361p.m154907a(str2, 0, charSequence2, i4, str2.length(), z)) {
                                if (next3 != null) {
                                    a = C89387v.m154943a(Integer.valueOf(i4), next3);
                                    break;
                                }
                            }
                        }
                        if (i4 == i5) {
                            break;
                        }
                        i4 += i6;
                    }
                }
                return null;
            }
            C89219l.m154721d(list, "");
            if (list instanceof List) {
                List list2 = list;
                C89219l.m154721d(list2, "");
                int size = list2.size();
                if (size == 0) {
                    throw new NoSuchElementException("List is empty.");
                } else if (size == 1) {
                    next = list2.get(0);
                } else {
                    throw new IllegalArgumentException("List has more than one element.");
                }
            } else {
                Iterator it3 = list.iterator();
                if (it3.hasNext()) {
                    next = it3.next();
                    if (it3.hasNext()) {
                        throw new IllegalArgumentException("Collection has more than one element.");
                    }
                } else {
                    throw new NoSuchElementException("Collection is empty.");
                }
            }
            String str3 = (String) next;
            int a2 = C89361p.m154888a(charSequence2, str3, intValue, false, 4);
            if (a2 >= 0) {
                a = C89387v.m154943a(Integer.valueOf(a2), str3);
            }
            return null;
            if (a != null) {
                return C89387v.m154943a(a.getFirst(), Integer.valueOf(((String) a.getSecond()).length()));
            }
            return null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ int m154885a(CharSequence charSequence, String str) {
        return C89361p.m154886a(charSequence, str, C89361p.m154930f(charSequence));
    }

    /* renamed from: b */
    public static final List<String> m154915b(CharSequence charSequence, String[] strArr) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(strArr, "");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return m154903a(charSequence, str, false, 0);
            }
        }
        Iterable<C89269g> k = C89309k.m154817k(m154891a(charSequence, strArr, false, 0));
        ArrayList arrayList = new ArrayList(C89070n.m154526a(k, 10));
        for (C89269g gVar : k) {
            arrayList.add(C89361p.m154895a(charSequence, gVar));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static final boolean m154923c(CharSequence charSequence, CharSequence charSequence2) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(charSequence2, "");
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return C89361p.m154907a(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), false);
        }
        return C89361p.m154876c((String) charSequence, (String) charSequence2, false);
    }

    /* renamed from: b */
    public static final boolean m154916b(CharSequence charSequence, CharSequence charSequence2) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(charSequence2, "");
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return C89361p.m154907a(charSequence, 0, charSequence2, 0, charSequence2.length(), false);
        }
        return C89361p.m154874b((String) charSequence, (String) charSequence2, false);
    }

    /* renamed from: b */
    public static final String m154912b(String str, char c, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        int b = C89361p.m154909b((CharSequence) str, c);
        if (b == -1) {
            return str2;
        }
        String substring = str.substring(0, b);
        C89219l.m154716b(substring, "");
        return substring;
    }

    /* renamed from: c */
    public static final String m154918c(String str, char c, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        int b = C89361p.m154909b((CharSequence) str, c);
        if (b == -1) {
            return str2;
        }
        String substring = str.substring(b + 1, str.length());
        C89219l.m154716b(substring, "");
        return substring;
    }

    /* renamed from: a */
    public static final int m154880a(CharSequence charSequence, char c, int i) {
        C89219l.m154721d(charSequence, "");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(cArr, "");
        for (int c2 = C89271h.m154772c(i, C89361p.m154930f(charSequence)); c2 >= 0; c2--) {
            char charAt = charSequence.charAt(c2);
            int i2 = 0;
            while (!C89332a.m154831a(cArr[i2], charAt, false)) {
                i2++;
                if (i2 > 0) {
                }
            }
            return c2;
        }
        return -1;
    }

    /* renamed from: d */
    public static final String m154925d(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        int a = C89361p.m154885a((CharSequence) str, str2);
        if (a == -1) {
            return str3;
        }
        String substring = str.substring(0, a);
        C89219l.m154716b(substring, "");
        return substring;
    }

    /* renamed from: e */
    public static final String m154928e(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        int a = C89361p.m154885a((CharSequence) str, str2);
        if (a == -1) {
            return str3;
        }
        String substring = str.substring(a + str2.length(), str.length());
        C89219l.m154716b(substring, "");
        return substring;
    }

    /* renamed from: g */
    public static final String m154935g(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        int b = C89361p.m154909b((CharSequence) str, '.');
        if (b == -1) {
            return str3;
        }
        return C89361p.m154893a(str, b + 1, str.length(), str2).toString();
    }

    /* renamed from: c */
    public static final String m154920c(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        int a = C89361p.m154888a((CharSequence) str, str2, 0, false, 6);
        if (a == -1) {
            return str3;
        }
        String substring = str.substring(a + str2.length(), str.length());
        C89219l.m154716b(substring, "");
        return substring;
    }

    /* renamed from: b */
    public static final String m154914b(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        int a = C89361p.m154888a((CharSequence) str, str2, 0, false, 6);
        if (a == -1) {
            return str3;
        }
        String substring = str.substring(0, a);
        C89219l.m154716b(substring, "");
        return substring;
    }

    /* renamed from: a */
    public static final int m154886a(CharSequence charSequence, String str, int i) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(str, "");
        if (!(charSequence instanceof String)) {
            return m154884a(charSequence, (CharSequence) str, i, 0, false, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    /* renamed from: a */
    public static final int m154881a(CharSequence charSequence, char c, int i, boolean z) {
        C89219l.m154721d(charSequence, "");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return C89361p.m154889a(charSequence, new char[]{c}, i, z);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 5 out of bounds for length 5
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:78)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    /* renamed from: a */
    public static final int m154887a(java.lang.CharSequence r1, java.lang.String r2, int r3, boolean r4) {
        /*
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r1, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r2, r0)
            if (r4 != 0) goto L_0x000e
            boolean r0 = r1 instanceof java.lang.String
            if (r0 != 0) goto L_0x0017
        L_0x000e:
            int r0 = r1.length()
            int r0 = m154883a(r1, r2, r3, r0, r4)
            return r0
        L_0x0017:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = r1.indexOf(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p4600h.p4622m.C89373z.m154887a(java.lang.CharSequence, java.lang.String, int, boolean):int");
    }

    /* renamed from: a */
    public static /* synthetic */ int m154882a(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return C89361p.m154881a(charSequence, c, i, false);
    }

    /* renamed from: a */
    public static final int m154884a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C89266e a;
        if (!z2) {
            a = new C89269g(C89271h.m154769b(i, 0), C89271h.m154772c(i2, charSequence.length()));
        } else {
            a = C89266e.C89267a.m154754a(C89271h.m154772c(i, C89361p.m154930f(charSequence)), C89271h.m154769b(i2, 0), -1);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i3 = a.f202927a;
            int i4 = a.f202928b;
            int i5 = a.f202929c;
            if (i5 < 0 ? i3 >= i4 : i3 <= i4) {
                while (!C89361p.m154907a(charSequence2, 0, charSequence, i3, charSequence2.length(), z)) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                return i3;
            }
        } else {
            int i6 = a.f202927a;
            int i7 = a.f202928b;
            int i8 = a.f202929c;
            if (i8 < 0 ? i6 >= i7 : i6 <= i7) {
                while (!C89361p.m154871a((String) charSequence2, 0, (String) charSequence, i6, charSequence2.length(), z)) {
                    if (i6 != i7) {
                        i6 += i8;
                    }
                }
                return i6;
            }
        }
        return -1;
    }
}
