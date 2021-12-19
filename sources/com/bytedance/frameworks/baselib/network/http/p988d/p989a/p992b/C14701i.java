package com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.AbstractC14690a;
import java.util.List;
import java.util.Random;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.b.i */
public class C14701i extends AbstractC14702j {

    /* renamed from: m */
    private static final String f35727m = C14701i.class.getSimpleName();

    /* renamed from: n */
    private String f35728n;

    /* renamed from: o */
    private String f35729o;

    /* renamed from: p */
    private String f35730p;

    /* renamed from: q */
    private String f35731q;

    /* renamed from: r */
    private String f35732r;

    /* renamed from: s */
    private boolean f35733s;

    /* renamed from: t */
    private int f35734t = 100;

    /* renamed from: u */
    private boolean f35735u;

    @Override // com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.AbstractC14702j
    /* renamed from: b */
    public final int mo23703b() {
        return -1;
    }

    static {
        Covode.recordClassIndex(16798);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.AbstractC14702j
    /* renamed from: a */
    public final boolean mo23702a(JSONObject jSONObject, List<Boolean> list) {
        boolean z;
        mo23698b(jSONObject);
        this.f35698i = jSONObject.optString("service_name");
        this.f35728n = jSONObject.optString("scheme_replace");
        this.f35729o = jSONObject.optString("host_replace");
        this.f35730p = jSONObject.optString("path_replace");
        this.f35732r = jSONObject.optString("url_contain");
        this.f35731q = jSONObject.optString("replace");
        if (jSONObject.optInt("drop") == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f35733s = z;
        int optInt = jSONObject.optInt("possibility", 100);
        if (optInt >= 0 && optInt <= 100) {
            this.f35734t = optInt;
        }
        if ((this.f35691b.isEmpty() && this.f35692c.isEmpty() && this.f35693d.isEmpty() && this.f35694e.isEmpty() && this.f35695f.isEmpty()) || (!this.f35733s && this.f35728n.isEmpty() && this.f35729o.isEmpty() && this.f35730p.isEmpty() && this.f35731q.isEmpty())) {
            this.f35735u = true;
        }
        list.set(0, false);
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.AbstractC14702j
    /* renamed from: a */
    public final AbstractC14690a.EnumC14691a mo23701a(String str, List<String> list) {
        String str2;
        if (this.f35735u) {
            list.set(0, str);
            return AbstractC14690a.EnumC14691a.DISPATCH_NONE;
        }
        list.set(0, str);
        Uri parse = Uri.parse(str);
        if (this.f35733s) {
            int i = this.f35734t;
            if ((i < 100 && (i <= 0 || new Random().nextInt(100) >= this.f35734t)) || !mo23695a(parse)) {
                return AbstractC14690a.EnumC14691a.DISPATCH_NONE;
            }
            list.set(0, "");
            return AbstractC14690a.EnumC14691a.DISPATCH_DROP;
        } else if (!this.f35729o.isEmpty() || !this.f35728n.isEmpty() || !this.f35730p.isEmpty()) {
            if (!mo23695a(parse)) {
                return AbstractC14690a.EnumC14691a.DISPATCH_NONE;
            }
            if (parse.getScheme() != null) {
                String scheme = parse.getScheme();
                String str3 = this.f35728n;
                if (!TextUtils.isEmpty(str3) && (scheme.equals(str3) || (((scheme.equals("http") || scheme.equals("https")) && (str3.equals("http") || str3.equals("https"))) || ((scheme.equals("ws") || scheme.equals("wss")) && (str3.equals("ws") || str3.equals("wss")))))) {
                    str = str.replaceFirst(parse.getScheme(), this.f35728n);
                }
            }
            if (parse.getHost() != null && !TextUtils.isEmpty(this.f35729o)) {
                str = str.replaceFirst(parse.getHost(), this.f35729o);
            }
            if (parse.getPath() != null && !TextUtils.isEmpty(this.f35730p)) {
                str = str.replaceFirst(parse.getPath(), this.f35730p);
            }
            list.set(0, str);
            return AbstractC14690a.EnumC14691a.DISPATCH_HIT;
        } else if (this.f35695f.size() != 1) {
            return AbstractC14690a.EnumC14691a.DISPATCH_NONE;
        } else {
            if (!this.f35732r.isEmpty() && parse.getPath() != null && !parse.getPath().contains(this.f35732r)) {
                return AbstractC14690a.EnumC14691a.DISPATCH_NONE;
            }
            if (!TextUtils.isEmpty(this.f35731q)) {
                str2 = str.replaceAll((String) this.f35695f.get(0), this.f35731q);
            } else {
                str2 = str;
            }
            if (str2.equals(str)) {
                return AbstractC14690a.EnumC14691a.DISPATCH_NONE;
            }
            list.set(0, str2);
            return AbstractC14690a.EnumC14691a.DISPATCH_HIT;
        }
    }
}
