package com.bytedance.sdk.p1625a.p1641d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.account.C29351f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.a.d.a */
public final class C22355a {

    /* renamed from: a */
    public final String f52819a;

    /* renamed from: b */
    public final String f52820b;

    /* renamed from: c */
    public final Map<String, String> f52821c;

    /* renamed from: d */
    public long f52822d;

    /* renamed from: e */
    public final String f52823e;

    /* renamed from: f */
    public final String f52824f;

    /* renamed from: g */
    public boolean f52825g;

    static {
        Covode.recordClassIndex(26171);
    }

    /* renamed from: com.bytedance.sdk.a.d.a$a */
    public static class C22356a {

        /* renamed from: a */
        public String f52826a;

        /* renamed from: b */
        private String f52827b;

        /* renamed from: c */
        private Map<String, String> f52828c;

        /* renamed from: d */
        private boolean f52829d;

        static {
            Covode.recordClassIndex(26172);
        }

        /* renamed from: a */
        public final C22356a mo36705a() {
            if (this.f52828c == null) {
                this.f52828c = new HashMap();
            }
            if (C29351f.m58781a().mo52212d()) {
                this.f52828c.put("multi_login", "1");
            }
            return this;
        }

        /* renamed from: b */
        public final C22355a mo36709b() {
            this.f52827b = "get";
            C22355a aVar = new C22355a(this.f52826a, this.f52827b, this.f52828c);
            aVar.f52825g = this.f52829d;
            return aVar;
        }

        /* renamed from: c */
        public final C22355a mo36710c() {
            this.f52827b = UGCMonitor.TYPE_POST;
            C22355a aVar = new C22355a(this.f52826a, this.f52827b, this.f52828c);
            aVar.f52825g = this.f52829d;
            return aVar;
        }

        /* renamed from: a */
        public final C22356a mo36707a(Map<String, String> map) {
            if (this.f52828c == null) {
                this.f52828c = map;
            } else if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    this.f52828c.put(entry.getKey(), entry.getValue());
                }
            }
            return this;
        }

        /* renamed from: a */
        public final C22356a mo36706a(String str, String str2) {
            if (this.f52828c == null) {
                this.f52828c = new HashMap();
            }
            this.f52828c.put(str, str2);
            return this;
        }

        /* renamed from: a */
        public final C22356a mo36708a(Map<String, String> map, Map<String, String> map2) {
            if (this.f52828c == null) {
                this.f52828c = new HashMap();
            }
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    this.f52828c.put(entry.getKey(), entry.getValue());
                }
            }
            if (map2 != null && !map2.isEmpty()) {
                for (String str : map2.keySet()) {
                    if (!TextUtils.isEmpty(str) && map2.get(str) != null) {
                        this.f52828c.put(str, map2.get(str));
                    }
                }
            }
            return this;
        }
    }

    /* renamed from: a */
    public final String mo36704a(String str) {
        Map<String, String> map = this.f52821c;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public C22355a(String str, String str2, Map<String, String> map) {
        this.f52819a = str;
        this.f52820b = str2;
        this.f52821c = map;
    }
}
