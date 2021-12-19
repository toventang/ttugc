package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89207b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4621l.C89297c;

/* renamed from: h.a.m */
public class C89068m extends C89067l {
    static {
        Covode.recordClassIndex(105152);
    }

    /* renamed from: a */
    public static final <T> boolean m154489a(T[] tArr, T t) {
        C89219l.m154721d(tArr, "");
        return C89064i.m154493b(tArr, t) >= 0;
    }

    /* renamed from: a */
    public static final boolean m154487a(int[] iArr, int i) {
        C89219l.m154721d(iArr, "");
        return C89064i.m154491b(iArr, i) >= 0;
    }

    /* renamed from: a */
    public static final boolean m154488a(long[] jArr) {
        C89219l.m154721d(jArr, "");
        return C89064i.m154492b(jArr) >= 0;
    }

    /* renamed from: a */
    public static final <C extends Collection<? super T>, T> C m154485a(T[] tArr, C c) {
        C89219l.m154721d(tArr, "");
        C89219l.m154721d(c, "");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    /* renamed from: b */
    public static final <T> T[] m154498b(T[] tArr, Comparator<? super T> comparator) {
        C89219l.m154721d(tArr, "");
        C89219l.m154721d(comparator, "");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        C89219l.m154716b(tArr2, "");
        C89064i.m154467a((Object[]) tArr2, (Comparator) comparator);
        return tArr2;
    }

    /* renamed from: a */
    public static final int[] m154490a(Integer[] numArr) {
        C89219l.m154721d(numArr, "");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* renamed from: a */
    public static final List<Byte> m154486a(byte[] bArr) {
        C89219l.m154721d(bArr, "");
        int length = bArr.length;
        if (length == 0) {
            return C89086z.INSTANCE;
        }
        if (length != 1) {
            return C89064i.m154497b(bArr);
        }
        return C89070n.m154516a(Byte.valueOf(bArr[0]));
    }

    /* renamed from: a */
    public static /* synthetic */ String m154484a(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC89172b bVar, int i2) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            bVar = null;
        }
        return C89064i.m154483a(objArr, charSequence, charSequence2, charSequence3, i, charSequence4, bVar);
    }

    /* renamed from: a */
    public static final <T> String m154483a(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC89172b<? super T, ? extends CharSequence> bVar) {
        C89219l.m154721d(tArr, "");
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(charSequence2, "");
        C89219l.m154721d(charSequence3, "");
        C89219l.m154721d(charSequence4, "");
        String sb = ((StringBuilder) C89064i.m154478a(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, bVar)).toString();
        C89219l.m154716b(sb, "");
        return sb;
    }

    /* renamed from: a */
    public static final String m154482a(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        C89219l.m154721d(jArr, "");
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(charSequence2, "");
        C89219l.m154721d(charSequence3, "");
        C89219l.m154721d(charSequence4, "");
        String sb = ((StringBuilder) C89064i.m154477a(jArr, new StringBuilder(), charSequence, charSequence2, charSequence3, -1, charSequence4, (AbstractC89172b<? super Long, ? extends CharSequence>) null)).toString();
        C89219l.m154716b(sb, "");
        return sb;
    }

    /* renamed from: h.a.m$a */
    public static final class C89069a implements AbstractC89306h<T> {

        /* renamed from: a */
        final /* synthetic */ Object[] f202794a;

        static {
            Covode.recordClassIndex(105153);
        }

        @Override // p4600h.p4621l.AbstractC89306h
        /* renamed from: a */
        public final Iterator<T> mo2926a() {
            return C89207b.m154693a(this.f202794a);
        }

        public C89069a(Object[] objArr) {
            this.f202794a = objArr;
        }
    }

    /* renamed from: a */
    public static final int m154474a(int[] iArr) {
        C89219l.m154721d(iArr, "");
        return iArr.length - 1;
    }

    /* renamed from: d */
    public static final <T> T m154503d(T[] tArr) {
        C89219l.m154721d(tArr, "");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: e */
    public static final <T> T m154504e(T[] tArr) {
        C89219l.m154721d(tArr, "");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    /* renamed from: h */
    public static final <T> int m154507h(T[] tArr) {
        C89219l.m154721d(tArr, "");
        return tArr.length - 1;
    }

    /* renamed from: j */
    public static final <T> List<T> m154509j(T[] tArr) {
        C89219l.m154721d(tArr, "");
        return new ArrayList(C89070n.m154519a((Object[]) tArr));
    }

    /* renamed from: l */
    public static final <T> List<T> m154511l(T[] tArr) {
        C89219l.m154721d(tArr, "");
        return C89070n.m154590j(C89064i.m154512m(tArr));
    }

    /* renamed from: a */
    public static final char m154473a(char[] cArr) {
        C89219l.m154721d(cArr, "");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: c */
    public static final <T> T m154500c(T[] tArr) {
        C89219l.m154721d(tArr, "");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: f */
    public static final <T> List<T> m154505f(T[] tArr) {
        C89219l.m154721d(tArr, "");
        return C89064i.m154501c(tArr, C89271h.m154769b(tArr.length - 1, 0));
    }

    /* renamed from: g */
    public static final <T> List<T> m154506g(T[] tArr) {
        C89219l.m154721d(tArr, "");
        return (List) C89064i.m154485a((Object[]) tArr, (Collection) new ArrayList());
    }

    /* renamed from: i */
    public static final <T> List<T> m154508i(T[] tArr) {
        C89219l.m154721d(tArr, "");
        int length = tArr.length;
        if (length == 0) {
            return C89086z.INSTANCE;
        }
        if (length != 1) {
            return C89064i.m154509j(tArr);
        }
        return C89070n.m154516a((Object) tArr[0]);
    }

    /* renamed from: m */
    public static final <T> Set<T> m154512m(T[] tArr) {
        C89219l.m154721d(tArr, "");
        return (Set) C89064i.m154496b((Object[]) tArr, (Collection) new LinkedHashSet(C89041ag.m154411a(tArr.length)));
    }

    /* renamed from: o */
    public static final <T> AbstractC89306h<T> m154514o(T[] tArr) {
        C89219l.m154721d(tArr, "");
        if (tArr.length == 0) {
            return C89297c.f202938a;
        }
        return new C89069a(tArr);
    }

    /* renamed from: b */
    public static final int m154492b(long[] jArr) {
        C89219l.m154721d(jArr, "");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (6737595547571456005L == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static final Integer m154499c(int[] iArr) {
        C89219l.m154721d(iArr, "");
        int i = 1;
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int a = C89064i.m154474a(iArr);
        if (a > 0) {
            while (true) {
                int i3 = iArr[i];
                if (i2 > i3) {
                    i2 = i3;
                }
                if (i == a) {
                    break;
                }
                i++;
            }
        }
        return Integer.valueOf(i2);
    }

    /* renamed from: k */
    public static final <T> Set<T> m154510k(T[] tArr) {
        C89219l.m154721d(tArr, "");
        int length = tArr.length;
        if (length == 0) {
            return C89036ab.INSTANCE;
        }
        if (length != 1) {
            return (Set) C89064i.m154496b((Object[]) tArr, (Collection) new LinkedHashSet(C89041ag.m154411a(tArr.length)));
        }
        return C89047am.m154436a((Object) tArr[0]);
    }

    /* renamed from: n */
    public static final <T> T[] m154513n(T[] tArr) {
        C89219l.m154721d(tArr, "");
        for (T t : tArr) {
            if (t == null) {
                throw new IllegalArgumentException("null element found in " + tArr + '.');
            }
        }
        return tArr;
    }

    /* renamed from: b */
    public static final Integer m154494b(int[] iArr) {
        C89219l.m154721d(iArr, "");
        int i = 1;
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int a = C89064i.m154474a(iArr);
        if (a > 0) {
            while (true) {
                int i3 = iArr[i];
                if (i2 < i3) {
                    i2 = i3;
                }
                if (i == a) {
                    break;
                }
                i++;
            }
        }
        return Integer.valueOf(i2);
    }

    /* renamed from: b */
    public static final List<Byte> m154497b(byte[] bArr) {
        C89219l.m154721d(bArr, "");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final int m154491b(int[] iArr, int i) {
        C89219l.m154721d(iArr, "");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static final <T> int m154493b(T[] tArr, T t) {
        C89219l.m154721d(tArr, "");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (C89219l.m154714a((Object) t, (Object) tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: c */
    public static final <T> List<T> m154501c(T[] tArr, int i) {
        C89219l.m154721d(tArr, "");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return C89086z.INSTANCE;
        } else {
            int length = tArr.length;
            if (i >= length) {
                return C89064i.m154508i(tArr);
            }
            if (i == 1) {
                return C89070n.m154516a((Object) tArr[length - 1]);
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = length - i; i2 < length; i2++) {
                arrayList.add(tArr[i2]);
            }
            return arrayList;
        }
    }

    /* renamed from: c */
    public static final <T> List<T> m154502c(T[] tArr, Comparator<? super T> comparator) {
        C89219l.m154721d(tArr, "");
        C89219l.m154721d(comparator, "");
        return C89064i.m154463a(C89064i.m154498b((Object[]) tArr, (Comparator) comparator));
    }

    /* renamed from: b */
    public static final <T> T m154495b(T[] tArr, int i) {
        C89219l.m154721d(tArr, "");
        if (i < 0 || i > C89064i.m154507h(tArr)) {
            return null;
        }
        return tArr[i];
    }

    /* renamed from: b */
    public static final <T, C extends Collection<? super T>> C m154496b(T[] tArr, C c) {
        C89219l.m154721d(tArr, "");
        C89219l.m154721d(c, "");
        for (T t : tArr) {
            c.add(t);
        }
        return c;
    }

    /* renamed from: a */
    public static final String m154480a(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, AbstractC89172b<? super Integer, ? extends CharSequence> bVar) {
        C89219l.m154721d(iArr, "");
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(charSequence2, "");
        C89219l.m154721d(charSequence3, "");
        C89219l.m154721d(charSequence4, "");
        String sb = ((StringBuilder) C89064i.m154476a(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, -1, charSequence4, bVar)).toString();
        C89219l.m154716b(sb, "");
        return sb;
    }

    /* renamed from: a */
    public static final <A extends Appendable> A m154475a(byte[] bArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, AbstractC89172b<? super Byte, ? extends CharSequence> bVar) {
        C89219l.m154721d(bArr, "");
        C89219l.m154721d(a, "");
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(charSequence2, "");
        C89219l.m154721d(charSequence3, "");
        C89219l.m154721d(charSequence4, "");
        a.append(charSequence2);
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                a.append(charSequence);
            }
            if (bVar != null) {
                a.append((CharSequence) bVar.invoke(Byte.valueOf(b)));
            } else {
                a.append(String.valueOf((int) b));
            }
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: a */
    public static final <A extends Appendable> A m154477a(long[] jArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC89172b<? super Long, ? extends CharSequence> bVar) {
        C89219l.m154721d(jArr, "");
        C89219l.m154721d(a, "");
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(charSequence2, "");
        C89219l.m154721d(charSequence3, "");
        C89219l.m154721d(charSequence4, "");
        a.append(charSequence2);
        int i2 = 0;
        for (long j : jArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            a.append(String.valueOf(j));
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: a */
    public static final <A extends Appendable> A m154476a(int[] iArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC89172b<? super Integer, ? extends CharSequence> bVar) {
        C89219l.m154721d(iArr, "");
        C89219l.m154721d(a, "");
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(charSequence2, "");
        C89219l.m154721d(charSequence3, "");
        C89219l.m154721d(charSequence4, "");
        a.append(charSequence2);
        int i2 = 0;
        for (int i3 : iArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (bVar != null) {
                a.append((CharSequence) bVar.invoke(Integer.valueOf(i3)));
            } else {
                a.append(String.valueOf(i3));
            }
        }
        a.append(charSequence3);
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        r6.append(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r10 >= 0) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r2 <= r10) goto L_0x0037;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, A extends java.lang.Appendable> A m154478a(T[] r5, A r6, java.lang.CharSequence r7, java.lang.CharSequence r8, java.lang.CharSequence r9, int r10, java.lang.CharSequence r11, p4600h.p4611f.p4612a.AbstractC89172b<? super T, ? extends java.lang.CharSequence> r12) {
        /*
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r7, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r8, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r9, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r11, r0)
            r6.append(r8)
            int r4 = r5.length
            r3 = 0
            r2 = 0
        L_0x001a:
            if (r3 >= r4) goto L_0x0030
            r1 = r5[r3]
            int r2 = r2 + 1
            r0 = 1
            if (r2 <= r0) goto L_0x0026
            r6.append(r7)
        L_0x0026:
            if (r10 < 0) goto L_0x002a
            if (r2 > r10) goto L_0x0032
        L_0x002a:
            p4600h.p4622m.C89361p.m154851a(r6, r1, r12)
            int r3 = r3 + 1
            goto L_0x001a
        L_0x0030:
            if (r10 < 0) goto L_0x0037
        L_0x0032:
            if (r2 <= r10) goto L_0x0037
            r6.append(r11)
        L_0x0037:
            r6.append(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p4600h.p4601a.C89068m.m154478a(java.lang.Object[], java.lang.Appendable, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, h.f.a.b):java.lang.Appendable");
    }
}
