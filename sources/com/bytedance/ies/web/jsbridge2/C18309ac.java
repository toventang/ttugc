package com.bytedance.ies.web.jsbridge2;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18347m;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.jsbridge2.ac */
public final class C18309ac {

    /* renamed from: a */
    public Map<String, List<C18313b>> f43791a = new ConcurrentHashMap();

    /* renamed from: b */
    final LruCache<String, C18314c> f43792b;

    /* renamed from: c */
    private final AbstractC18347m.AbstractC18348a f43793c;

    /* renamed from: d */
    private final String f43794d;

    /* renamed from: e */
    private volatile boolean f43795e = false;

    static {
        Covode.recordClassIndex(20981);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.web.jsbridge2.ac$c */
    public static final class C18314c {

        /* renamed from: a */
        EnumC18323ah f43805a = EnumC18323ah.PUBLIC;

        /* renamed from: b */
        Set<String> f43806b = new HashSet();

        /* renamed from: c */
        Set<String> f43807c = new HashSet();

        static {
            Covode.recordClassIndex(20986);
        }

        C18314c() {
        }
    }

    /* renamed from: com.bytedance.ies.web.jsbridge2.ac$b */
    public static final class C18313b {

        /* renamed from: a */
        public Pattern f43801a;

        /* renamed from: b */
        public EnumC18323ah f43802b;

        /* renamed from: c */
        public List<String> f43803c;

        /* renamed from: d */
        public List<String> f43804d;

        static {
            Covode.recordClassIndex(20985);
        }

        public final String toString() {
            return "RemoteConfig{pattern=" + this.f43801a + ", permissionGroup=" + this.f43802b + ", includedMethods=" + this.f43803c + ", excludedMethods=" + this.f43804d + '}';
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.web.jsbridge2.ac$a */
    public static class C18312a extends IllegalStateException {
        static {
            Covode.recordClassIndex(20984);
        }

        C18312a(String str) {
            super(str);
        }
    }

    /* renamed from: d */
    private static String m34051d(String str) {
        return "com.bytedance.ies.web.jsbridge2.PermissionConfig.".concat(String.valueOf(str));
    }

    /* renamed from: b */
    public final List<C18313b> mo29312b(String str) {
        if (this.f43795e) {
            return this.f43791a.get(str);
        }
        throw new C18312a("Permission config is outdated!");
    }

    /* renamed from: a */
    public static String m34050a(String str) {
        String[] split;
        int length;
        if (str == null || (length = (split = str.split("[.]")).length) < 2) {
            return null;
        }
        if (length == 2) {
            return str;
        }
        return split[length - 2] + "." + split[length - 1];
    }

    /* renamed from: a */
    private static C18313b m34049a(JSONObject jSONObject) {
        C18313b bVar = new C18313b();
        bVar.f43801a = Pattern.compile(jSONObject.getString("pattern"));
        bVar.f43802b = EnumC18323ah.from(jSONObject.getString("group"));
        bVar.f43803c = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("included_methods");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                bVar.f43803c.add(optJSONArray.getString(i));
            }
        }
        bVar.f43804d = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("excluded_methods");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                bVar.f43804d.add(optJSONArray2.getString(i2));
            }
        }
        return bVar;
    }

    /* renamed from: c */
    public final EnumC18323ah mo29314c(String str) {
        EnumC18323ah ahVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        String a = m34050a(authority);
        if (!TextUtils.isEmpty(scheme) && !TextUtils.isEmpty(authority) && a != null) {
            try {
                List<C18313b> b = mo29312b(a);
                if (b == null) {
                    return null;
                }
                for (C18313b bVar : b) {
                    if (bVar.f43801a.matcher(str).find() && (ahVar == null || bVar.f43802b.compareTo((Enum) ahVar) >= 0)) {
                        ahVar = bVar.f43802b;
                    }
                }
            } catch (C18312a unused) {
            }
        }
        return ahVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29311a(JSONObject jSONObject, List<TimeLineEvent> list) {
        mo29313b(jSONObject, list);
        this.f43793c.mo29392b(m34051d(this.f43794d), jSONObject.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C18314c mo29310a(String str, List<TimeLineEvent> list) {
        Object valueOf;
        C18314c cVar = new C18314c();
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        String a = m34050a(authority);
        if (TextUtils.isEmpty(scheme) || TextUtils.isEmpty(authority) || a == null) {
            this.f43792b.put(str, cVar);
            return cVar;
        }
        List<C18313b> b = mo29312b(a);
        TimeLineEvent.C18302a a2 = new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43768q, a);
        String str2 = TimeLineEvent.C18303b.f43764m;
        if (b == null) {
            valueOf = TimeLineEvent.C18303b.f43759h;
        } else {
            valueOf = Integer.valueOf(b.size());
        }
        a2.mo29301a(str2, valueOf).mo29302a(TimeLineEvent.C18303b.f43717aF, list);
        if (b == null) {
            cVar.f43805a = EnumC18323ah.PUBLIC;
            this.f43792b.put(str, cVar);
            return cVar;
        }
        for (C18313b bVar : b) {
            if (bVar.f43801a.matcher(str).find()) {
                if (bVar.f43802b.compareTo((Enum) cVar.f43805a) >= 0) {
                    cVar.f43805a = bVar.f43802b;
                }
                cVar.f43806b.addAll(bVar.f43803c);
                cVar.f43807c.addAll(bVar.f43804d);
            }
        }
        this.f43792b.put(str, cVar);
        new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43758g, TimeLineEvent.C18303b.f43698N).mo29301a(TimeLineEvent.C18303b.f43685A, cVar.f43805a.toString()).mo29301a(TimeLineEvent.C18303b.f43686B, cVar.f43806b.toString()).mo29301a(TimeLineEvent.C18303b.f43687C, cVar.f43807c.toString()).mo29302a(TimeLineEvent.C18303b.f43718aG, list);
        return cVar;
    }

    /* renamed from: b */
    public final void mo29313b(JSONObject jSONObject, List<TimeLineEvent> list) {
        try {
            TimeLineEvent.C18302a aVar = new TimeLineEvent.C18302a();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            JSONObject jSONObject2 = jSONObject.getJSONObject("content");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = jSONObject2.getJSONArray(next);
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    copyOnWriteArrayList.add(m34049a(jSONArray.getJSONObject(i)));
                }
                concurrentHashMap.put(next, copyOnWriteArrayList);
                aVar.mo29301a(jSONObject.getString("channel"), Long.valueOf(jSONObject.getLong("package_version")));
            }
            this.f43791a = concurrentHashMap;
            aVar.mo29302a(TimeLineEvent.C18303b.f43740an, list);
        } catch (JSONException e) {
            C18344j.m34125b(e);
            if (list != null) {
                new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43691G, e.getClass().getSimpleName()).mo29301a(TimeLineEvent.C18303b.f43692H, e.getMessage()).mo29301a(TimeLineEvent.C18303b.f43756e, jSONObject.toString()).mo29302a(TimeLineEvent.C18303b.f43741ao, list);
            }
        }
        this.f43792b.evictAll();
        this.f43795e = true;
    }

    C18309ac(String str, AbstractC18347m.AbstractC18348a aVar, final Executor executor, JSONObject jSONObject, final List<TimeLineEvent> list) {
        this.f43794d = str;
        this.f43792b = new LruCache<>(128);
        this.f43793c = aVar;
        if (jSONObject == null) {
            aVar.mo29391a(m34051d(str), new AbstractC18347m.AbstractC18348a.AbstractC18349a() {
                /* class com.bytedance.ies.web.jsbridge2.C18309ac.C183101 */

                static {
                    Covode.recordClassIndex(20982);
                }

                @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m.AbstractC18348a.AbstractC18349a
                /* renamed from: a */
                public final void mo29315a(final String str) {
                    executor.execute(new Runnable() {
                        /* class com.bytedance.ies.web.jsbridge2.C18309ac.C183101.RunnableC183111 */

                        static {
                            Covode.recordClassIndex(20983);
                        }

                        public final void run() {
                            if (list != null) {
                                new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43756e, Boolean.valueOf(!TextUtils.isEmpty(str))).mo29302a(TimeLineEvent.C18303b.f43739am, list);
                            }
                            if (!TextUtils.isEmpty(str)) {
                                try {
                                    C18309ac.this.mo29313b(new JSONObject(str), list);
                                } catch (JSONException e) {
                                    C18344j.m34125b(e);
                                }
                            }
                        }
                    });
                }
            });
        } else {
            mo29311a(jSONObject, list);
        }
    }
}
