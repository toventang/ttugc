package com.squareup.p2075a;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.squareup.p2075a.p2076a.p2078b.C29168g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* renamed from: com.squareup.a.p */
public final class C29235p {

    /* renamed from: a */
    public final String[] f69280a;

    static {
        Covode.recordClassIndex(35584);
    }

    /* renamed from: com.squareup.a.p$a */
    public static final class C29236a {

        /* renamed from: a */
        public final List<String> f69281a = new ArrayList(20);

        static {
            Covode.recordClassIndex(35585);
        }

        /* renamed from: a */
        public final C29235p mo50985a() {
            return new C29235p(this, (byte) 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C29236a mo50983a(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                return m58503c(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            if (str.startsWith(":")) {
                return m58503c("", str.substring(1));
            }
            return m58503c("", str);
        }

        /* renamed from: b */
        public final C29236a mo50986b(String str) {
            int i = 0;
            while (i < this.f69281a.size()) {
                if (str.equalsIgnoreCase(this.f69281a.get(i))) {
                    this.f69281a.remove(i);
                    this.f69281a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: a */
        public final C29236a mo50984a(String str, String str2) {
            m58504d(str, str2);
            return m58503c(str, str2);
        }

        /* renamed from: c */
        private C29236a m58503c(String str, String str2) {
            this.f69281a.add(str);
            this.f69281a.add(str2.trim());
            return this;
        }

        /* renamed from: b */
        public final C29236a mo50987b(String str, String str2) {
            m58504d(str, str2);
            mo50986b(str);
            m58503c(str, str2);
            return this;
        }

        /* renamed from: d */
        private static void m58504d(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            } else if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= 31 || charAt >= 127) {
                        throw new IllegalArgumentException(C1764a.m5928a("Unexpected char %#04x at %d in header name: %s", new Object[]{Integer.valueOf(charAt), Integer.valueOf(i), str}));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char charAt2 = str2.charAt(i2);
                        if (charAt2 <= 31 || charAt2 >= 127) {
                            throw new IllegalArgumentException(C1764a.m5928a("Unexpected char %#04x at %d in header value: %s", new Object[]{Integer.valueOf(charAt2), Integer.valueOf(i2), str2}));
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("value == null");
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }
    }

    /* renamed from: a */
    public final C29236a mo50976a() {
        C29236a aVar = new C29236a();
        Collections.addAll(aVar.f69281a, this.f69280a);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f69280a.length / 2;
        for (int i = 0; i < length; i++) {
            sb.append(mo50977a(i)).append(": ").append(mo50979b(i)).append("\n");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo50978a(String str) {
        return m58496a(this.f69280a, str);
    }

    /* renamed from: b */
    public final String mo50979b(int i) {
        int i2 = (i * 2) + 1;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.f69280a;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    private C29235p(C29236a aVar) {
        this.f69280a = (String[]) aVar.f69281a.toArray(new String[aVar.f69281a.size()]);
    }

    /* renamed from: b */
    public final Date mo50980b(String str) {
        String a = mo50978a(str);
        if (a != null) {
            return C29168g.m58296a(a);
        }
        return null;
    }

    /* renamed from: a */
    public final String mo50977a(int i) {
        int i2 = i * 2;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.f69280a;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    /* renamed from: c */
    public final List<String> mo50981c(String str) {
        int length = this.f69280a.length / 2;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            if (str.equalsIgnoreCase(mo50977a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mo50979b(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* synthetic */ C29235p(C29236a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    private static String m58496a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }
}
