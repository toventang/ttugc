package com.bytedance.android.livesdk.feed.tab.p541b;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.feed.AbstractC8652o;
import com.bytedance.android.livesdk.feed.feed.C8587f;
import com.bytedance.android.livesdk.feed.services.C8680b;
import com.bytedance.android.livesdk.feed.tab.p540a.AbstractC8690b;
import com.bytedance.android.livesdk.feed.tab.p540a.AbstractC8691c;
import com.bytedance.android.livesdk.model.C9520ag;
import com.bytedance.android.livesdk.util.C11116a;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.p910e.C13611a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import com.google.gson.C28020m;
import com.google.gson.C28023p;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.livesdk.feed.tab.b.f */
public class C8699f implements AbstractC8702h {

    /* renamed from: a */
    private Context f21458a;

    /* renamed from: b */
    private AbstractC8691c f21459b;

    /* renamed from: c */
    private List<C9520ag> f21460c;

    /* renamed from: d */
    private AbstractC8652o<C9520ag> f21461d;

    /* renamed from: e */
    private C27910f f21462e;

    /* renamed from: f */
    private Map<Long, C9520ag> f21463f = new ConcurrentHashMap();

    /* renamed from: g */
    private C8587f f21464g = null;

    /* renamed from: h */
    private AbstractC8690b f21465h;

    /* renamed from: i */
    private List<C9520ag> f21466i;

    /* renamed from: j */
    private C8587f f21467j;

    static {
        Covode.recordClassIndex(9567);
    }

    /* renamed from: d */
    private boolean m16983d() {
        if (this.f21458a == null) {
            if (C3966y.m9669e() == null) {
                return false;
            }
            this.f21458a = m16979a(C3966y.m9669e());
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.feed.tab.p541b.AbstractC8702h
    /* renamed from: b */
    public final List<C9520ag> mo14982b() {
        if (!m16984d(this.f21466i)) {
            return null;
        }
        return new ArrayList(this.f21466i);
    }

    /* renamed from: c */
    private synchronized void m16981c() {
        MethodCollector.m26663i(2676);
        if (!m16984d(this.f21460c)) {
            m16982c((List) m16980a(new C27895a<List<C9520ag>>() {
                /* class com.bytedance.android.livesdk.feed.tab.p541b.C8699f.C87001 */

                static {
                    Covode.recordClassIndex(9568);
                }
            }, this.f21465h.mo14973a(), ""));
            if (!m16984d(this.f21460c)) {
                m16982c(this.f21459b.mo14975a());
            }
            MethodCollector.m26664o(2676);
            return;
        }
        MethodCollector.m26664o(2676);
    }

    @Override // com.bytedance.android.livesdk.feed.tab.p541b.AbstractC8702h
    /* renamed from: a */
    public final List<C9520ag> mo14979a() {
        m16981c();
        return new ArrayList(this.f21460c);
    }

    /* renamed from: a */
    private static Context m16979a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: d */
    private static boolean m16984d(List<C9520ag> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.feed.tab.p541b.AbstractC8702h
    /* renamed from: a */
    public final C9520ag mo14978a(long j) {
        m16981c();
        return this.f21463f.get(Long.valueOf(j));
    }

    /* renamed from: c */
    private synchronized void m16982c(List<C9520ag> list) {
        MethodCollector.m26663i(2672);
        this.f21460c = list;
        if (!C13617h.m24465a(list)) {
            for (C9520ag agVar : list) {
                if (agVar != null) {
                    this.f21463f.put(Long.valueOf(agVar.getId()), agVar);
                }
            }
        }
        MethodCollector.m26664o(2672);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0012  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m16985e(java.util.List<com.bytedance.android.livesdk.model.C9520ag> r3) {
        /*
            boolean r0 = m16984d(r3)
            r2 = 0
            if (r0 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.util.Iterator r1 = r3.iterator()
        L_0x000c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r1.next()
            com.bytedance.android.livesdk.model.ag r0 = (com.bytedance.android.livesdk.model.C9520ag) r0
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.isItemValid()
            if (r0 != 0) goto L_0x000c
        L_0x0020:
            return r2
        L_0x0021:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.tab.p541b.C8699f.m16985e(java.util.List):boolean");
    }

    @Override // com.bytedance.android.livesdk.feed.tab.p541b.AbstractC8702h
    /* renamed from: b */
    public final synchronized boolean mo14983b(C8587f fVar) {
        MethodCollector.m26663i(2779);
        if (fVar == null) {
            MethodCollector.m26664o(2779);
            return true;
        } else if (this.f21467j == null || fVar.now >= this.f21467j.now) {
            this.f21467j = fVar;
            MethodCollector.m26664o(2779);
            return true;
        } else {
            MethodCollector.m26664o(2779);
            return true;
        }
    }

    @Override // com.bytedance.android.livesdk.feed.tab.p541b.AbstractC8702h
    /* renamed from: b */
    public final synchronized boolean mo14984b(List<C9520ag> list) {
        MethodCollector.m26663i(2778);
        if (!m16985e(list)) {
            this.f21466i = null;
            MethodCollector.m26664o(2778);
            return false;
        } else if (this.f21461d.mo14953a(list, this.f21466i)) {
            MethodCollector.m26664o(2778);
            return false;
        } else {
            this.f21466i = new ArrayList(list);
            MethodCollector.m26664o(2778);
            return true;
        }
    }

    @Override // com.bytedance.android.livesdk.feed.tab.p541b.AbstractC8702h
    /* renamed from: a */
    public final boolean mo14980a(C8587f fVar) {
        if (fVar == null) {
            return true;
        }
        if (this.f21464g != null && fVar.now < this.f21464g.now) {
            return true;
        }
        try {
            String b = this.f21462e.mo46674b(fVar);
            if (!m16983d()) {
                return false;
            }
            SharedPreferences.Editor edit = C34822d.m71158a(this.f21458a, "ttlive_tabs_cache", 0).edit();
            edit.putString(this.f21465h.mo14974b(), b);
            C13611a.m24460a(edit);
            this.f21464g = fVar;
            return true;
        } catch (C28020m e) {
            C3854a.m9460b("BaseLocalFeedTabDataSource", "saveFeedTabExtra: ", e);
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.feed.tab.p541b.AbstractC8702h
    /* renamed from: a */
    public final synchronized boolean mo14981a(List<C9520ag> list) {
        MethodCollector.m26663i(2757);
        if (list == null || list.isEmpty() || !m16985e(list)) {
            MethodCollector.m26664o(2757);
            return false;
        } else if (this.f21461d.mo14953a(list, this.f21460c)) {
            MethodCollector.m26664o(2757);
            return false;
        } else {
            m16982c(new ArrayList(list));
            try {
                String b = this.f21462e.mo46674b(list);
                if (!m16983d()) {
                    MethodCollector.m26664o(2757);
                    return false;
                }
                SharedPreferences.Editor edit = C34822d.m71158a(this.f21458a, "ttlive_tabs_cache", 0).edit();
                edit.putString(this.f21465h.mo14973a(), b);
                C13611a.m24460a(edit);
                MethodCollector.m26664o(2757);
                return true;
            } catch (C28020m e) {
                C3854a.m9460b("BaseLocalFeedTabDataSource", "saveFeedTab: ", e);
                MethodCollector.m26664o(2757);
                return false;
            }
        }
    }

    public C8699f(AbstractC8690b bVar, AbstractC8691c cVar, AbstractC8652o<C9520ag> oVar) {
        this.f21465h = bVar;
        this.f21459b = cVar;
        this.f21461d = oVar;
        this.f21462e = (C27910f) C8680b.m16959a().mo14966a(C27910f.class);
    }

    /* renamed from: a */
    private <T> T m16980a(C27895a<T> aVar, String str, String str2) {
        if (!m16983d()) {
            return null;
        }
        String string = C34822d.m71158a(this.f21458a, "ttlive_tabs_cache", 0).getString(str, str2);
        if (C13627m.m24498a(string)) {
            return null;
        }
        try {
            return (T) C11116a.m19746a(string, aVar.type);
        } catch (C28023p e) {
            C3854a.m9458a("ALogger", e);
            return null;
        }
    }
}
