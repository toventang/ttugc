package com.facebook.p1814a.p1815a;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.p1894a.p1896b.C24677a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: com.facebook.a.a.c */
public final class C23871c {

    /* renamed from: a */
    static final Set<C23871c> f56496a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private static final String f56497b = C23871c.class.getCanonicalName();

    /* renamed from: c */
    private String f56498c;

    /* renamed from: d */
    private List<String> f56499d;

    /* renamed from: e */
    private String f56500e;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo39376b() {
        if (C24677a.m47209a(this)) {
            return null;
        }
        try {
            return this.f56498c;
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo39378d() {
        if (C24677a.m47209a(this)) {
            return null;
        }
        try {
            return this.f56500e;
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return null;
        }
    }

    static {
        Covode.recordClassIndex(27992);
    }

    /* renamed from: a */
    public static Set<C23871c> m45130a() {
        if (C24677a.m47209a(C23871c.class)) {
            return null;
        }
        try {
            return new HashSet(f56496a);
        } catch (Throwable th) {
            C24677a.m47208a(th, C23871c.class);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final List<String> mo39377c() {
        if (C24677a.m47209a(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f56499d);
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return null;
        }
    }

    /* renamed from: e */
    public static Set<String> m45132e() {
        if (C24677a.m47209a(C23871c.class)) {
            return null;
        }
        try {
            HashSet hashSet = new HashSet();
            for (C23871c cVar : f56496a) {
                hashSet.add(cVar.mo39376b());
            }
            return hashSet;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23871c.class);
            return null;
        }
    }

    /* renamed from: a */
    static void m45131a(JSONObject jSONObject) {
        if (!C24677a.m47209a(C23871c.class)) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("k");
                        String optString2 = optJSONObject.optString("v");
                        if (!optString.isEmpty()) {
                            f56496a.add(new C23871c(next, Arrays.asList(optString.split(",")), optString2));
                        }
                    }
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C23871c.class);
            }
        }
    }

    private C23871c(String str, List<String> list, String str2) {
        this.f56498c = str;
        this.f56499d = list;
        this.f56500e = str2;
    }
}
