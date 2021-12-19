package com.p2082ss.android.ugc.aweme.newfollow.p3506c;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34597d;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.newfollow.c.b */
public final class C61499b {

    /* renamed from: a */
    public volatile HashSet<String> f139599a;

    /* renamed from: b */
    public volatile HashSet<String> f139600b;

    /* renamed from: c */
    public volatile List<String> f139601c;

    /* renamed from: d */
    private HashSet<String> f139602d;

    static {
        Covode.recordClassIndex(72156);
    }

    private C61499b() {
        m111338d();
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.c.b$a */
    public static class C61500a {

        /* renamed from: a */
        private static final Map<String, C61499b> f139603a = new ConcurrentHashMap(1);

        static {
            Covode.recordClassIndex(72157);
        }

        /* renamed from: a */
        public static C61499b m111344a(String str) {
            Map<String, C61499b> map = f139603a;
            C61499b bVar = map.get(str);
            if (bVar != null) {
                return bVar;
            }
            C61499b bVar2 = new C61499b((byte) 0);
            map.put(str, bVar2);
            return bVar2;
        }
    }

    /* renamed from: e */
    private static void m111339e() {
        C34597d.m70638e().mo61057b("to_report_feed_ids", "");
    }

    /* renamed from: d */
    private void m111338d() {
        String a = C34597d.m70638e().mo61051a("to_report_feed_ids", "");
        if (!(a == null || a.isEmpty())) {
            String[] split = a.split(",");
            for (String str : split) {
                mo99144a(str);
            }
        }
    }

    /* renamed from: a */
    public final String mo99143a() {
        if (C13603b.m24435a((Collection) this.f139601c)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : this.f139601c) {
            sb.append(str);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo99145b() {
        if (C13603b.m24435a((Collection) this.f139599a)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f139599a.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo99146c() {
        if (this.f139599a != null) {
            if (!C13603b.m24435a((Collection) this.f139600b)) {
                this.f139599a.removeAll(this.f139600b);
            } else {
                this.f139599a.clear();
            }
        }
        if (this.f139600b != null) {
            this.f139600b.clear();
        }
        m111339e();
    }

    /* synthetic */ C61499b(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo99144a(String str) {
        if (str != null && !str.isEmpty()) {
            if (this.f139602d == null) {
                this.f139602d = new HashSet<>();
            }
            if (this.f139599a == null) {
                this.f139599a = new HashSet<>();
            }
            if (!this.f139602d.contains(str)) {
                this.f139599a.add(str);
                this.f139602d.add(str);
            }
        }
    }
}
