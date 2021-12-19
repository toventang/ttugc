package com.p2082ss.android.ugc.aweme.lancet.p3385b;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ttnet.p1700a.C22898a;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.lancet.b.a */
public final class C58007a {

    /* renamed from: a */
    public static volatile boolean f132206a;

    /* renamed from: b */
    public static final C58007a f132207b = new C58007a();

    /* renamed from: c */
    private static AbstractC58008a f132208c;

    /* renamed from: d */
    private static volatile boolean f132209d;

    /* renamed from: e */
    private static final List<String> f132210e = C89070n.m154525d("sessionid", "sid_tt", "sid_guard", "uid_tt");

    /* renamed from: com.ss.android.ugc.aweme.lancet.b.a$a */
    public interface AbstractC58008a {
        static {
            Covode.recordClassIndex(68043);
        }
    }

    private C58007a() {
    }

    static {
        Covode.recordClassIndex(68042);
    }

    /* renamed from: a */
    public static List<String> m104828a() {
        try {
            return C22898a.m43150a(C17867d.m33078a()).mo23739d(NetworkUtils.getShareCookieHost());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static final boolean m104834b() {
        if (TextUtils.equals(C17867d.f42595s, "lark_inhouse") || TextUtils.equals(C17867d.f42595s, "local_test")) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.lancet.b.a$b */
    static final class CallableC58009b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f132211a;

        static {
            Covode.recordClassIndex(68044);
        }

        CallableC58009b(String str) {
            this.f132211a = str;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            String str;
            String str2 = this.f132211a;
            if ((str2 != null && C89361p.m154874b(str2, "http://", false)) || ((str = this.f132211a) != null && C89361p.m154874b(str, "https://", false))) {
                List<String> a = C58007a.m104828a();
                if (a == null || a.isEmpty()) {
                    C58007a.m104834b();
                    C58007a.m104829a(C58007a.m104827a(this.f132211a), a, (String) null);
                } else {
                    URI create = URI.create(this.f132211a);
                    C89219l.m154716b(create, "");
                    String host = create.getHost();
                    C89219l.m154716b(host, "");
                    String c = C58007a.m104835c(host);
                    if (c != null && a.contains(c)) {
                        C58007a.m104831a(create, a, CookieManager.getInstance().getCookie(create.getHost()));
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: b */
    public static final void m104833b(String str) {
        if (!TextUtils.isEmpty(str) && f132206a) {
            C1731i.m5640b(new CallableC58009b(str), C40780g.m82246c());
        }
    }

    /* renamed from: a */
    public static final String m104827a(String str) {
        if (str != null) {
            try {
                URI create = URI.create(str);
                if (create == null) {
                    return "";
                }
                return create.getHost() + create.getPath();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    /* renamed from: c */
    public static String m104835c(String str) {
        C89219l.m154721d(str, "");
        int length = str.length() - 1;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (length < 0) {
                break;
            }
            if (str.charAt(length) == '.') {
                if (i2 != 1) {
                    i2++;
                } else if (length > 0) {
                    i = length;
                }
            }
            length--;
        }
        String substring = str.substring(i);
        C89219l.m154716b(substring, "");
        return substring;
    }

    /* renamed from: e */
    private static boolean m104837e(String str) {
        int i = 0;
        for (String str2 : f132210e) {
            if (C89361p.m154908a((CharSequence) str, (CharSequence) str2, false)) {
                i++;
            }
        }
        if (i < f132210e.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m104830a(String str, boolean z) {
        if (!m104834b()) {
            return;
        }
        if (!((!f132206a && !z) || str == null || f132208c == null)) {
            List<String> a = m104828a();
            StringBuffer stringBuffer = new StringBuffer();
            if (a != null) {
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) a, 10));
                for (T t : a) {
                    arrayList.add(stringBuffer.append((String) t).append(":").append(CookieManager.getInstance().getCookie(t)));
                }
            }
            new Date().toLocaleString();
            Thread currentThread = Thread.currentThread();
            C89219l.m154716b(currentThread, "");
            currentThread.getName();
        }
    }

    /* renamed from: a */
    public static final void m104832a(URI uri, Map<String, ? extends List<String>> map) {
        String str = "";
        try {
            if (f132206a && uri != null) {
                List<String> a = m104828a();
                if (a == null || a.isEmpty()) {
                    m104834b();
                    m104829a(m104827a(uri.toString()), a, (String) null);
                    return;
                }
                String host = uri.getHost();
                C89219l.m154716b(host, str);
                String c = m104835c(host);
                if (c != null && a.contains(c)) {
                    if (!map.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
                            sb.append(entry).append(";");
                        }
                        String sb2 = sb.toString();
                        C89219l.m154716b(sb2, str);
                        str = sb2;
                    }
                    m104831a(uri, a, str);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m104829a(String str, List<String> list, String str2) {
        if (!f132209d) {
            f132209d = true;
            String str3 = "";
            if (list != null) {
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    str3 = str3 + ((String) it.next());
                    arrayList.add(C89391z.f203057a);
                }
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("host", str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("error_desc", str2);
                }
                jSONObject.put("uri", str);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C12290b.m22064a("cookie_error", jSONObject);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    /* renamed from: a */
    public static void m104831a(java.net.URI r3, java.util.List<java.lang.String> r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.lancet.p3385b.C58007a.m104831a(java.net.URI, java.util.List, java.lang.String):void");
    }
}
