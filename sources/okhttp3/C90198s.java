package okhttp3;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.internal.C90084c;

/* renamed from: okhttp3.s */
public final class C90198s {

    /* renamed from: a */
    public final String[] f204855a;

    static {
        Covode.recordClassIndex(106371);
    }

    /* renamed from: okhttp3.s$a */
    public static final class C90199a {

        /* renamed from: a */
        final List<String> f204856a = new ArrayList(20);

        static {
            Covode.recordClassIndex(106372);
        }

        /* renamed from: a */
        public final C90198s mo145040a() {
            return new C90198s(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C90199a mo145038a(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                return mo145044c(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            if (str.startsWith(":")) {
                return mo145044c("", str.substring(1));
            }
            return mo145044c("", str);
        }

        /* renamed from: b */
        public final C90199a mo145041b(String str) {
            int i = 0;
            while (i < this.f204856a.size()) {
                if (str.equalsIgnoreCase(this.f204856a.get(i))) {
                    this.f204856a.remove(i);
                    this.f204856a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: c */
        public final String mo145043c(String str) {
            for (int size = this.f204856a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.f204856a.get(size))) {
                    return this.f204856a.get(size + 1);
                }
            }
            return null;
        }

        /* renamed from: b */
        public final C90199a mo145042b(String str, String str2) {
            C90198s.m156773c(str);
            return mo145044c(str, str2);
        }

        /* renamed from: a */
        public final C90199a mo145039a(String str, String str2) {
            C90198s.m156773c(str);
            C90198s.m156772a(str2, str);
            return mo145044c(str, str2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final C90199a mo145044c(String str, String str2) {
            this.f204856a.add(str);
            this.f204856a.add(str2.trim());
            return this;
        }

        /* renamed from: d */
        public final C90199a mo145045d(String str, String str2) {
            C90198s.m156773c(str);
            C90198s.m156772a(str2, str);
            mo145041b(str);
            mo145044c(str, str2);
            return this;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f204855a);
    }

    /* renamed from: c */
    public final C90199a mo145033c() {
        C90199a aVar = new C90199a();
        Collections.addAll(aVar.f204856a, this.f204855a);
        return aVar;
    }

    /* renamed from: b */
    public final long mo145030b() {
        String[] strArr = this.f204855a;
        long length = (long) (strArr.length * 2);
        int length2 = strArr.length;
        for (int i = 0; i < length2; i++) {
            length += (long) this.f204855a[i].length();
        }
        return length;
    }

    /* renamed from: d */
    public final Map<String, List<String>> mo145034d() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int length = this.f204855a.length / 2;
        for (int i = 0; i < length; i++) {
            String lowerCase = mo145027a(i).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(mo145031b(i));
        }
        return treeMap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f204855a.length / 2;
        for (int i = 0; i < length; i++) {
            sb.append(mo145027a(i)).append(": ").append(mo145031b(i)).append("\n");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final Set<String> mo145029a() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int length = this.f204855a.length / 2;
        for (int i = 0; i < length; i++) {
            treeSet.add(mo145027a(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    private C90198s(String[] strArr) {
        this.f204855a = strArr;
    }

    /* renamed from: a */
    public final String mo145027a(int i) {
        return this.f204855a[i * 2];
    }

    /* renamed from: a */
    public final String mo145028a(String str) {
        return m156769a(this.f204855a, str);
    }

    /* renamed from: b */
    public final String mo145031b(int i) {
        return this.f204855a[(i * 2) + 1];
    }

    C90198s(C90199a aVar) {
        this.f204855a = (String[]) aVar.f204856a.toArray(new String[aVar.f204856a.size()]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C90198s) || !Arrays.equals(((C90198s) obj).f204855a, this.f204855a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C90198s m156771a(String... strArr) {
        String[] strArr2 = (String[]) strArr.clone();
        for (int i = 0; i < strArr2.length; i++) {
            if (strArr2[i] != null) {
                strArr2[i] = strArr2[i].trim();
            } else {
                throw new IllegalArgumentException("Headers cannot be null");
            }
        }
        for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
            String str = strArr2[i2];
            String str2 = strArr2[i2 + 1];
            m156773c(str);
            m156772a(str2, str);
        }
        return new C90198s(strArr2);
    }

    /* renamed from: b */
    public final List<String> mo145032b(String str) {
        int length = this.f204855a.length / 2;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            if (str.equalsIgnoreCase(mo145027a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mo145031b(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public static C90198s m156770a(Map<String, String> map) {
        Objects.requireNonNull(map, "headers == null");
        String[] strArr = new String[(map.size() * 2)];
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            String trim = entry.getKey().trim();
            String trim2 = entry.getValue().trim();
            m156773c(trim);
            m156772a(trim2, trim);
            strArr[i] = trim;
            strArr[i + 1] = trim2;
            i += 2;
        }
        return new C90198s(strArr);
    }

    /* renamed from: c */
    static void m156773c(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(C90084c.m156407a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty");
    }

    /* renamed from: a */
    private static String m156769a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: a */
    static void m156772a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= 31) {
                    if (charAt != '\t') {
                        throw new IllegalArgumentException(C90084c.m156407a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                    }
                } else if (charAt >= 127) {
                    throw new IllegalArgumentException(C90084c.m156407a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str2 + " == null");
    }
}
