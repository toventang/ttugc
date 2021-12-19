package com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.AbstractC14690a;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.AbstractC14696f;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.b.g */
public class C14699g extends AbstractC14702j {

    /* renamed from: m */
    private static final String f35723m = C14699g.class.getSimpleName();

    /* renamed from: n */
    private AbstractC14696f f35724n;

    static {
        Covode.recordClassIndex(16796);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.AbstractC14702j
    /* renamed from: b */
    public final int mo23703b() {
        return this.f35724n.f35720a.ordinal();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.AbstractC14702j
    /* renamed from: a */
    public final AbstractC14690a.EnumC14691a mo23701a(String str, List<String> list) {
        AbstractC14690a.EnumC14691a aVar = AbstractC14690a.EnumC14691a.DISPATCH_NONE;
        Uri parse = Uri.parse(str);
        if (!(parse.getHost() == null || !mo23695a(parse) || this.f35724n == null)) {
            aVar = AbstractC14690a.EnumC14691a.DISPATCH_HIT;
            String a = this.f35724n.mo23699a(parse);
            if (!str.equals(a)) {
                list.set(0, a);
            } else {
                list.set(0, str);
            }
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.AbstractC14702j
    /* renamed from: a */
    public final boolean mo23702a(JSONObject jSONObject, List<Boolean> list) {
        AbstractC14696f hVar;
        mo23698b(jSONObject);
        String optString = jSONObject.optString("service_name");
        if (!TextUtils.isEmpty(optString)) {
            this.f35698i = optString;
        }
        int optInt = jSONObject.optInt("dispatch_strategy", 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("strategy_info");
        if (optInt < 0 || optInt > 5) {
            this.f35724n = null;
            return false;
        }
        if (AbstractC14696f.C146971.f35721a[AbstractC14696f.EnumC14698a.values()[optInt].ordinal()] != 1) {
            hVar = new C14692b();
        } else {
            hVar = new C14700h(optJSONObject);
        }
        this.f35724n = hVar;
        list.set(0, false);
        return true;
    }
}
