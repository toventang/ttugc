package p078c.p079a;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import p078c.p080b.C1752a;
import p078c.p082c.AbstractC1760b;
import p078c.p082c.C1759a;

/* renamed from: c.a.a */
public final class C1749a {

    /* renamed from: a */
    private List<AbstractC1760b> f5616a;

    static {
        Covode.recordClassIndex(1919);
    }

    /* renamed from: c.a.a$a */
    public static class C1750a {

        /* renamed from: a */
        public static final C1749a f5617a = new C1749a((byte) 0);

        static {
            Covode.recordClassIndex(1920);
        }
    }

    private C1749a() {
        this.f5616a = new LinkedList();
    }

    /* synthetic */ C1749a(byte b) {
        this();
    }

    /* renamed from: a */
    public final C1749a mo5561a(AbstractC1760b bVar) {
        if (!this.f5616a.contains(bVar)) {
            this.f5616a.add(0, bVar);
        }
        return this;
    }

    /* renamed from: a */
    public static C1752a m5881a(File file) {
        if (file instanceof C1752a) {
            return (C1752a) file;
        }
        return new C1752a(file.getPath());
    }

    /* renamed from: b */
    public static String m5882b(String str) {
        int length = str.length();
        char[] charArray = str.toCharArray();
        int i = 0;
        char c = 0;
        int i2 = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '/' || c != '/') {
                charArray[i2] = c2;
                i2++;
            }
            i++;
            c = c2;
        }
        if (c == '/' && length > 1) {
            i2--;
        }
        if (i2 != length) {
            return new String(charArray, 0, i2);
        }
        return str;
    }

    /* renamed from: a */
    public final String mo5562a(String str) {
        if (str == null) {
            return str;
        }
        C1759a aVar = new C1759a(str);
        return new C1751b(this.f5616a, 0, aVar).mo5565a(aVar).f5655a;
    }

    /* renamed from: a */
    public final String mo5563a(String str, String str2) {
        if (str2 == null) {
            return str2;
        }
        if (str == null || str.isEmpty()) {
            return mo5562a(str2);
        }
        if (str2.isEmpty() || str2.equals("/")) {
            return mo5562a(str);
        }
        if (str2.charAt(0) == '/' && str.equals("/")) {
            return mo5562a(str2);
        }
        C1759a aVar = new C1759a(str, str2);
        return new C1751b(this.f5616a, 0, aVar).mo5565a(aVar).f5655a;
    }
}
