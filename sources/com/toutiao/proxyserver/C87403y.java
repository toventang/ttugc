package com.toutiao.proxyserver;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.toutiao.proxyserver.net.C87360c;
import com.toutiao.proxyserver.p4495g.C87328b;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.toutiao.proxyserver.y */
public final class C87403y {

    /* renamed from: a */
    public final C87405b f198165a;

    /* renamed from: b */
    public final List<C87360c> f198166b;

    /* renamed from: c */
    public final C87404a f198167c;

    static {
        Covode.recordClassIndex(103300);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.toutiao.proxyserver.y$c */
    public static final class C87406c extends Exception {
        static {
            Covode.recordClassIndex(103303);
        }

        C87406c() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.toutiao.proxyserver.y$b */
    public static final class C87405b {

        /* renamed from: a */
        final String f198177a;

        /* renamed from: b */
        final String f198178b;

        /* renamed from: c */
        final String f198179c;

        static {
            Covode.recordClassIndex(103302);
        }

        public final String toString() {
            return "RequestLine{method='" + this.f198177a + '\'' + ", path='" + this.f198178b + '\'' + ", version='" + this.f198179c + '\'' + '}';
        }

        C87405b(String str, String str2, String str3) {
            this.f198177a = str;
            this.f198178b = str2;
            this.f198179c = str3;
        }
    }

    public final String toString() {
        return "Request{requestLine=" + this.f198165a + ", headers=" + this.f198166b + ", extra=" + this.f198167c + '}';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.toutiao.proxyserver.y$a */
    public static final class C87404a {

        /* renamed from: a */
        final int f198168a;

        /* renamed from: b */
        final String f198169b;

        /* renamed from: c */
        final String f198170c;

        /* renamed from: d */
        final String f198171d;

        /* renamed from: e */
        final int f198172e;

        /* renamed from: f */
        final int f198173f;

        /* renamed from: g */
        final String f198174g;

        /* renamed from: h */
        final List<String> f198175h;

        /* renamed from: i */
        final String f198176i;

        static {
            Covode.recordClassIndex(103301);
        }

        public final String toString() {
            return "Extra{flag=" + this.f198168a + ", rawKey='" + this.f198169b + '\'' + ", key='" + this.f198170c + '\'' + ", from=" + this.f198172e + ", to=" + this.f198173f + ", urls=" + this.f198175h + '}';
        }

        /* renamed from: a */
        static C87404a m151698a(C87405b bVar, List<C87360c> list) {
            int indexOf = bVar.f198178b.indexOf("?");
            if (indexOf != -1) {
                ArrayList arrayList = new ArrayList();
                String[] split = bVar.f198178b.substring(indexOf + 1).split("&");
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                int i = 0;
                for (String str6 : split) {
                    String[] split2 = str6.split("=");
                    if (split2.length == 2) {
                        if ("rk".equals(split2[0])) {
                            str2 = Uri.decode(split2[1]);
                        } else if ("k".equals(split2[0])) {
                            str3 = split2[1];
                        } else if (split2[0].startsWith("u")) {
                            arrayList.add(Uri.decode(split2[1]));
                        } else if ("f".equals(split2[0])) {
                            if (C87328b.m151544a(split2[1], 0) == 1) {
                                i = 1;
                            }
                        } else if ("s".equals(split2[0])) {
                            str5 = split2[1];
                        } else if ("ah".equals(split2[0])) {
                            str4 = split2[1];
                        }
                    }
                }
                if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                    throw new C87406c();
                }
                int i2 = 0;
                int i3 = 0;
                for (C87360c cVar : list) {
                    if (cVar != null && "Range".equalsIgnoreCase(cVar.f198014a)) {
                        int indexOf2 = cVar.f198015b.indexOf("=");
                        if (indexOf2 == -1) {
                            throw new C87406c();
                        } else if ("bytes".equalsIgnoreCase(cVar.f198015b.substring(0, indexOf2).trim())) {
                            String substring = cVar.f198015b.substring(indexOf2 + 1);
                            if (!substring.contains(",")) {
                                int indexOf3 = substring.indexOf("-");
                                if (indexOf3 != -1) {
                                    String trim = substring.substring(0, indexOf3).trim();
                                    String trim2 = substring.substring(indexOf3 + 1).trim();
                                    try {
                                        if (trim.length() > 0) {
                                            i2 = Integer.parseInt(trim);
                                        }
                                        if (trim2.length() <= 0 || i2 <= (i3 = Integer.parseInt(trim2))) {
                                            str = cVar.f198015b;
                                        } else {
                                            throw new C87406c();
                                        }
                                    } catch (NumberFormatException unused) {
                                        throw new C87406c();
                                    }
                                } else {
                                    throw new C87406c();
                                }
                            } else {
                                throw new C87406c();
                            }
                        } else {
                            throw new C87406c();
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new C87404a(i, str2, str3, str4, i2, i3, str, arrayList, str5);
                }
                throw new C87406c();
            }
            throw new C87406c();
        }

        private C87404a(int i, String str, String str2, String str3, int i2, int i3, String str4, List<String> list, String str5) {
            this.f198168a = i;
            this.f198169b = str;
            this.f198170c = str2;
            this.f198171d = str3;
            this.f198172e = i2;
            this.f198173f = i3;
            this.f198174g = str4;
            this.f198175h = list;
            this.f198176i = str5;
        }
    }

    /* renamed from: a */
    public static C87403y m151695a(InputStream inputStream) {
        MethodCollector.m26663i(12961);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C87328b.f197937a));
        ArrayList arrayList = new ArrayList();
        C87405b bVar = null;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (!TextUtils.isEmpty(readLine)) {
                String trim = readLine.trim();
                if (bVar == null) {
                    int indexOf = trim.indexOf(32);
                    if (indexOf != -1) {
                        int lastIndexOf = trim.lastIndexOf(32);
                        if (lastIndexOf > indexOf) {
                            String trim2 = trim.substring(0, indexOf).trim();
                            String trim3 = trim.substring(indexOf + 1, lastIndexOf).trim();
                            String trim4 = trim.substring(lastIndexOf + 1).trim();
                            if (trim2.length() == 0 || trim3.length() == 0 || trim4.length() == 0) {
                                C87406c cVar = new C87406c();
                                MethodCollector.m26664o(12961);
                            } else {
                                bVar = new C87405b(trim2, trim3, trim4);
                            }
                        } else {
                            C87406c cVar2 = new C87406c();
                            MethodCollector.m26664o(12961);
                            throw cVar2;
                        }
                    } else {
                        C87406c cVar3 = new C87406c();
                        MethodCollector.m26664o(12961);
                        throw cVar3;
                    }
                } else {
                    try {
                        int indexOf2 = trim.indexOf(":");
                        if (indexOf2 != -1) {
                            arrayList.add(new C87360c(trim.substring(0, indexOf2), trim.substring(indexOf2 + 1)));
                        } else {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("request header format error, header: ".concat(String.valueOf(trim)));
                            MethodCollector.m26664o(12961);
                            throw illegalArgumentException;
                        }
                    } catch (IllegalArgumentException unused) {
                        C87406c cVar4 = new C87406c();
                        MethodCollector.m26664o(12961);
                        throw cVar4;
                    }
                }
            } else if (bVar != null) {
                C87403y yVar = new C87403y(bVar, arrayList, C87404a.m151698a(bVar, arrayList));
                MethodCollector.m26664o(12961);
                return yVar;
            } else {
                C87406c cVar5 = new C87406c();
                MethodCollector.m26664o(12961);
                throw cVar5;
            }
        }
        C87406c cVar6 = new C87406c();
        MethodCollector.m26664o(12961);
        throw cVar6;
    }

    private C87403y(C87405b bVar, List<C87360c> list, C87404a aVar) {
        this.f198165a = bVar;
        this.f198166b = list;
        this.f198167c = aVar;
    }

    /* renamed from: a */
    static String m151696a(String str, String str2, List<String> list, String str3) {
        StringBuilder sb = new StringBuilder(512);
        while (true) {
            String a = m151697a(sb, str, str2, list, str3);
            if (a.length() <= 3072) {
                return a;
            }
            if (list.size() == 1) {
                return null;
            }
            list.remove(list.size() - 1);
        }
    }

    /* renamed from: a */
    private static String m151697a(StringBuilder sb, String str, String str2, List<String> list, String str3) {
        sb.delete(0, sb.length());
        sb.append("rk=").append(Uri.encode(str));
        sb.append("&k=").append(str2);
        if (!TextUtils.isEmpty(str3)) {
            sb.append("&s=").append(str3);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append("&u").append(i).append("=").append(Uri.encode(list.get(i)));
        }
        sb.append("&ah=").append(C87383u.m151658a(str, str2, list, str3));
        return sb.toString();
    }
}
