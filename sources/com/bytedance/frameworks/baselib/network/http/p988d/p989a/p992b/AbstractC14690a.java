package com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.b.a */
public abstract class AbstractC14690a {

    /* renamed from: l */
    private static final String f35689l = AbstractC14690a.class.getSimpleName();

    /* renamed from: a */
    protected List<String> f35690a = new ArrayList();

    /* renamed from: b */
    protected List<String> f35691b = new ArrayList();

    /* renamed from: c */
    protected List<String> f35692c = new ArrayList();

    /* renamed from: d */
    protected List<String> f35693d = new ArrayList();

    /* renamed from: e */
    protected List<String> f35694e = new ArrayList();

    /* renamed from: f */
    protected List<String> f35695f = new ArrayList();

    /* renamed from: g */
    public int f35696g;

    /* renamed from: h */
    public long f35697h;

    /* renamed from: i */
    public String f35698i;

    /* renamed from: j */
    protected int f35699j;

    /* renamed from: k */
    public List<String> f35700k = new ArrayList();

    /* renamed from: m */
    private long f35701m;

    /* renamed from: n */
    private long f35702n;

    /* renamed from: a */
    public abstract boolean mo23697a(JSONObject jSONObject);

    /* renamed from: a */
    public final boolean mo23694a() {
        return mo23703b();
    }

    static {
        Covode.recordClassIndex(16787);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.b.a$a */
    public enum EnumC14691a {
        DISPATCH_NONE,
        DISPATCH_HIT,
        DISPATCH_DROP,
        DISPATCH_DELAY;

        static {
            Covode.recordClassIndex(16788);
        }
    }

    /* renamed from: b */
    private boolean mo23703b() {
        long j = this.f35701m;
        if (j == 0 && this.f35702n == 0) {
            return true;
        }
        if (!(j == -1 || this.f35702n == -1)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis <= this.f35701m || currentTimeMillis >= this.f35702n) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo23696a(C14705l lVar) {
        if (lVar.f35756c > this.f35696g) {
            return false;
        }
        if (this.f35700k.isEmpty() || TextUtils.isEmpty(lVar.f35755b) || this.f35700k.contains(lVar.f35755b)) {
            return mo23703b();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo23698b(JSONObject jSONObject) {
        m26897a(jSONObject, "host_group", this.f35690a);
        m26897a(jSONObject, "equal_group", this.f35691b);
        m26897a(jSONObject, "prefixes_group", this.f35692c);
        m26897a(jSONObject, "contain_group", this.f35693d);
        m26897a(jSONObject, "pattern_group", this.f35694e);
        m26897a(jSONObject, "url_group", this.f35695f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo23695a(Uri uri) {
        if (this.f35690a.isEmpty()) {
            String path = uri.getPath();
        } else {
            for (String str : this.f35690a) {
                if (C14759i.m27069a(uri.getHost(), str)) {
                }
            }
            return false;
        }
        String path2 = uri.getPath();
        if (path2 != null) {
            if (!this.f35691b.isEmpty()) {
                for (String str2 : this.f35691b) {
                    if (path2.equals(str2)) {
                        return true;
                    }
                }
            }
            if (!this.f35692c.isEmpty()) {
                for (String str3 : this.f35692c) {
                    if (path2.startsWith(str3)) {
                        return true;
                    }
                }
            }
            if (!this.f35693d.isEmpty()) {
                for (String str4 : this.f35693d) {
                    if (path2.contains(str4)) {
                        return true;
                    }
                }
            }
            if (!this.f35694e.isEmpty()) {
                for (String str5 : this.f35694e) {
                    if (path2.matches(str5)) {
                        return true;
                    }
                }
            }
        }
        if (!this.f35695f.isEmpty()) {
            for (String str6 : this.f35695f) {
                if (uri.toString().matches(str6)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m26897a(JSONObject jSONObject, String str, List<String> list) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    list.add(optString);
                }
            }
        }
    }

    /* renamed from: a */
    public static AbstractC14690a m26896a(String str, JSONObject jSONObject, int i, long j, long j2, long j3, String str2, long j4, List<String> list, int i2) {
        AbstractC14690a aVar;
        if (str.equals("tc")) {
            aVar = new C14701i();
        } else {
            aVar = null;
        }
        if (str.equals("dispatch")) {
            aVar = new C14699g();
        }
        if (str.equals("delay")) {
            aVar = new C14693c();
        } else if (aVar == null) {
            return null;
        }
        aVar.f35696g = i;
        aVar.f35701m = j;
        aVar.f35702n = j2;
        aVar.f35697h = j3;
        aVar.f35700k = list;
        if (i2 < 0) {
            aVar.f35699j = Integer.MAX_VALUE;
        } else {
            aVar.f35699j = i2;
        }
        if (aVar.mo23697a(jSONObject)) {
            return aVar;
        }
        return null;
    }
}
