package com.p2082ss.android.ugc.playerkit.session;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.playerkit.session.a */
public final class C84229a {

    /* renamed from: a */
    public static final C84229a f188297a = new C84229a();

    /* renamed from: b */
    public LruCache<String, String> f188298b = new LruCache<>(100);

    /* renamed from: c */
    private volatile Session f188299c;

    /* renamed from: d */
    private final Queue<Session> f188300d = new LinkedList();

    /* renamed from: e */
    private LruCache<String, AbstractC81964c> f188301e = new LruCache<>(100);

    /* renamed from: f */
    private LruCache<String, String> f188302f = new LruCache<>(100);

    /* renamed from: g */
    private LruCache<String, String> f188303g = new LruCache<>(100);

    static {
        Covode.recordClassIndex(98137);
    }

    /* renamed from: a */
    public final synchronized Session mo129046a() {
        MethodCollector.m26663i(5829);
        if (this.f188299c != null) {
            Session session = this.f188299c;
            MethodCollector.m26664o(5829);
            return session;
        }
        Session session2 = Session.DEFAULT;
        MethodCollector.m26664o(5829);
        return session2;
    }

    private C84229a() {
    }

    /* renamed from: a */
    public final synchronized Session mo129047a(String str) {
        Session session;
        MethodCollector.m26663i(5695);
        this.f188299c = mo129050b(str);
        if (this.f188299c == null) {
            this.f188299c = mo129054d(str);
        }
        session = this.f188299c;
        MethodCollector.m26664o(5695);
        return session;
    }

    /* renamed from: b */
    public final synchronized Session mo129050b(String str) {
        MethodCollector.m26663i(5831);
        if (!TextUtils.isEmpty(str)) {
            Session[] sessionArr = (Session[]) this.f188300d.toArray(new Session[0]);
            for (int length = sessionArr.length - 1; length >= 0; length--) {
                if (str.equals(sessionArr[length].key)) {
                    Session session = sessionArr[length];
                    MethodCollector.m26664o(5831);
                    return session;
                }
            }
        }
        MethodCollector.m26664o(5831);
        return null;
    }

    /* renamed from: c */
    public final synchronized Session mo129052c(String str) {
        MethodCollector.m26663i(5971);
        if (!TextUtils.isEmpty(str)) {
            Session[] sessionArr = (Session[]) this.f188300d.toArray(new Session[0]);
            for (int length = sessionArr.length - 1; length >= 0; length--) {
                if (str.equals(sessionArr[length].sourceId)) {
                    Session session = sessionArr[length];
                    MethodCollector.m26664o(5971);
                    return session;
                }
            }
        }
        MethodCollector.m26664o(5971);
        return null;
    }

    /* renamed from: d */
    public final synchronized Session mo129054d(String str) {
        MethodCollector.m26663i(6118);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(6118);
            return null;
        }
        Session instance = Session.instance();
        instance.key = str;
        instance.uri = str;
        if (this.f188300d.size() + 1 > 5) {
            this.f188300d.poll();
        }
        this.f188300d.offer(instance);
        MethodCollector.m26664o(6118);
        return instance;
    }

    /* renamed from: e */
    public final synchronized AbstractC81964c mo129055e(String str) {
        MethodCollector.m26663i(6121);
        if (!TextUtils.isEmpty(str)) {
            AbstractC81964c cVar = this.f188301e.get(str);
            MethodCollector.m26664o(6121);
            return cVar;
        }
        MethodCollector.m26664o(6121);
        return null;
    }

    /* renamed from: f */
    public final synchronized String mo129056f(String str) {
        MethodCollector.m26663i(6123);
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f188302f.get(str);
            MethodCollector.m26664o(6123);
            return str2;
        }
        MethodCollector.m26664o(6123);
        return null;
    }

    /* renamed from: g */
    public final synchronized String mo129057g(String str) {
        MethodCollector.m26663i(6277);
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f188303g.get(str);
            MethodCollector.m26664o(6277);
            return str2;
        }
        MethodCollector.m26664o(6277);
        return "";
    }

    /* renamed from: c */
    public final synchronized void mo129053c(String str, String str2) {
        MethodCollector.m26663i(6124);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f188303g.put(str, str2);
        }
        MethodCollector.m26664o(6124);
    }

    /* renamed from: a */
    public final synchronized void mo129048a(String str, AbstractC81964c cVar) {
        MethodCollector.m26663i(6120);
        if (!TextUtils.isEmpty(str)) {
            this.f188301e.put(str, cVar);
        }
        MethodCollector.m26664o(6120);
    }

    /* renamed from: b */
    public final synchronized void mo129051b(String str, String str2) {
        MethodCollector.m26663i(6122);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(6122);
        } else if (TextUtils.isEmpty(str2)) {
            this.f188302f.remove(str);
            MethodCollector.m26664o(6122);
        } else {
            this.f188302f.put(str, str2);
            MethodCollector.m26664o(6122);
        }
    }

    /* renamed from: a */
    public final void mo129049a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f188298b.put(str, str2);
        }
    }
}
