package com.bytedance.frameworks.baselib.network.http.p993e;

import com.bytedance.covode.number.Covode;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;

/* renamed from: com.bytedance.frameworks.baselib.network.http.e.b */
public class C14744b {

    /* renamed from: a */
    Hashtable f35932a = new Hashtable();

    static {
        Covode.recordClassIndex(16841);
    }

    public C14744b() {
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.ensureCapacity(this.f35932a.size() * 16);
        Enumeration keys = this.f35932a.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            stringBuffer.append("; ");
            stringBuffer.append(str);
            stringBuffer.append('=');
            stringBuffer.append(m27015b((String) this.f35932a.get(str)));
        }
        return stringBuffer.toString();
    }

    public C14744b(String str) {
        m27013a(str);
    }

    /* renamed from: a */
    private static boolean m27014a(char c) {
        if (c <= ' ' || c >= 127 || "()<>@,;:/[]?=\\\"".indexOf(c) >= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static String m27015b(String str) {
        int length = str.length();
        int i = 0;
        boolean z = false;
        while (true) {
            if (i < length) {
                if (z) {
                    break;
                }
                z = !m27014a(str.charAt(i));
                i++;
            } else if (!z) {
                return str;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        double d = (double) length;
        Double.isNaN(d);
        stringBuffer.ensureCapacity((int) (d * 1.5d));
        stringBuffer.append('\"');
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\\' || charAt == '\"') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(charAt);
        }
        stringBuffer.append('\"');
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private void m27013a(String str) {
        int length;
        String str2;
        int i;
        if (str != null && (length = str.length()) > 0) {
            int a = m27012a(str, 0);
            while (a < length && str.charAt(a) == ';') {
                int a2 = m27012a(str, a + 1);
                if (a2 < length) {
                    int i2 = a2;
                    while (i2 < length && m27014a(str.charAt(i2))) {
                        i2++;
                    }
                    String lowerCase = str.substring(a2, i2).toLowerCase(Locale.ENGLISH);
                    int a3 = m27012a(str, i2);
                    if (a3 >= length || str.charAt(a3) != '=') {
                        throw new C14745c("Couldn't find the '=' that separates a parameter name from its value.");
                    }
                    int a4 = m27012a(str, a3 + 1);
                    if (a4 < length) {
                        char charAt = str.charAt(a4);
                        if (charAt == '\"') {
                            int i3 = a4 + 1;
                            if (i3 < length) {
                                int i4 = i3;
                                while (true) {
                                    if (i4 < length) {
                                        charAt = str.charAt(i4);
                                        if (charAt == '\"') {
                                            break;
                                        }
                                        if (charAt == '\\') {
                                            i4++;
                                        }
                                        i4++;
                                    } else if (charAt != '\"') {
                                        throw new C14745c("Encountered unterminated quoted parameter value.");
                                    }
                                }
                                String substring = str.substring(i3, i4);
                                int length2 = substring.length();
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.ensureCapacity(length2);
                                boolean z = false;
                                for (int i5 = 0; i5 < length2; i5++) {
                                    char charAt2 = substring.charAt(i5);
                                    if (z) {
                                        stringBuffer.append(charAt2);
                                        z = false;
                                    } else if (charAt2 != '\\') {
                                        stringBuffer.append(charAt2);
                                    } else {
                                        z = true;
                                    }
                                }
                                str2 = stringBuffer.toString();
                                i = i4 + 1;
                            } else {
                                throw new C14745c("Encountered unterminated quoted parameter value.");
                            }
                        } else if (m27014a(charAt)) {
                            i = a4;
                            while (i < length && m27014a(str.charAt(i))) {
                                i++;
                            }
                            str2 = str.substring(a4, i);
                        } else {
                            throw new C14745c("Unexpected character encountered at index ".concat(String.valueOf(a4)));
                        }
                        this.f35932a.put(lowerCase, str2);
                        a = m27012a(str, i);
                    } else {
                        throw new C14745c("Couldn't find a value for parameter named ".concat(String.valueOf(lowerCase)));
                    }
                } else {
                    return;
                }
            }
            if (a < length) {
                throw new C14745c("More characters encountered in input than expected.");
            }
        }
    }

    /* renamed from: a */
    private static int m27012a(String str, int i) {
        int length = str.length();
        while (i < length && Character.isWhitespace(str.charAt(i))) {
            i++;
        }
        return i;
    }
}
