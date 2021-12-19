package com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.C14581a;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.AbstractC14690a;
import com.bytedance.frameworks.baselib.network.http.p995g.C14755e;
import com.bytedance.frameworks.baselib.network.http.p995g.C14756f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.b.c */
public class C14693c extends AbstractC14690a {

    /* renamed from: l */
    private static final String f35704l = C14693c.class.getSimpleName();

    /* renamed from: m */
    private int f35705m;

    /* renamed from: n */
    private int f35706n;

    /* renamed from: o */
    private int f35707o;

    /* renamed from: p */
    private final Map<String, Set<String>> f35708p = new HashMap();

    static {
        Covode.recordClassIndex(16790);
    }

    /* renamed from: b */
    private int m26905b() {
        int i = this.f35705m;
        if (i > 0) {
            return i;
        }
        if (this.f35706n < this.f35707o) {
            return new Random().nextInt(this.f35707o - this.f35706n) + this.f35706n;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v8. Raw type applied. Possible types: java.util.Map<java.lang.String, java.util.Set<java.lang.String>>, java.util.Map */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Set, java.lang.Object] */
    @Override // com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.AbstractC14690a
    /* renamed from: a */
    public final boolean mo23697a(JSONObject jSONObject) {
        int i;
        int i2;
        JSONException e;
        mo23698b(jSONObject);
        String optString = jSONObject.optString("tag");
        int i3 = 0;
        if (!TextUtils.isEmpty(optString)) {
            String[] split = optString.split(";");
            for (String str : split) {
                ArrayList<Pair> arrayList = new ArrayList();
                if (C14755e.m27052a(str, ",", "=", arrayList)) {
                    for (Pair pair : arrayList) {
                        Set<String> set = this.f35708p.get(pair.first);
                        if (set == null) {
                            set = new HashSet<>();
                        }
                        set.add(pair.second);
                        this.f35708p.put(pair.first, set);
                    }
                }
            }
        }
        this.f35705m = jSONObject.optInt("delay");
        JSONArray optJSONArray = jSONObject.optJSONArray("random");
        if (this.f35705m > 0 || optJSONArray == null) {
            i = 0;
        } else if (optJSONArray.length() != 2) {
            return false;
        } else {
            try {
                i2 = optJSONArray.getInt(0);
                try {
                    i = optJSONArray.getInt(1);
                } catch (JSONException e2) {
                    e = e2;
                }
            } catch (JSONException e3) {
                e = e3;
                i2 = 0;
                e.printStackTrace();
                i = 0;
                if (i2 > 0) {
                }
                return false;
            }
            if (i2 > 0 || i <= 0 || i2 >= i) {
                return false;
            }
            i3 = i2;
        }
        this.f35706n = i3;
        this.f35707o = i;
        Logger.debug();
        return true;
    }

    /* renamed from: a */
    public final AbstractC14690a.EnumC14691a mo23700a(String str, String str2, List<Integer> list) {
        boolean z;
        C14581a.EnumC14583a aVar;
        if (!mo23694a() || TextUtils.isEmpty(str)) {
            list.set(0, 0);
            return AbstractC14690a.EnumC14691a.DISPATCH_NONE;
        }
        Uri parse = Uri.parse(str);
        if (parse.getHost() == null || !mo23695a(parse)) {
            return AbstractC14690a.EnumC14691a.DISPATCH_NONE;
        }
        if (this.f35708p.isEmpty()) {
            list.set(0, Integer.valueOf(m26905b()));
            Logger.debug();
            return AbstractC14690a.EnumC14691a.DISPATCH_DELAY;
        } else if (!C14581a.f35251b.get()) {
            Logger.debug();
            return AbstractC14690a.EnumC14691a.DISPATCH_NONE;
        } else {
            if ("".equals(str2)) {
                str2 = "s=0;p=0";
            }
            HashMap hashMap = new HashMap();
            ArrayList<Pair> arrayList = new ArrayList();
            if (!C14755e.m27052a(str2, ";", "=", arrayList)) {
                return AbstractC14690a.EnumC14691a.DISPATCH_NONE;
            }
            for (Pair pair : arrayList) {
                hashMap.put(pair.first, pair.second);
            }
            String num = Integer.toString(C14581a.EnumC14583a.NormalStart.getValue());
            if (C14581a.f35250a != C14581a.EnumC14583a.NormalStart) {
                Logger.debug();
                int i = C14581a.C145821.f35257a[C14581a.f35250a.ordinal()];
                if (i == 1) {
                    if (C14581a.m26666a(C14581a.f35252c.get(), C14581a.f35253d.get())) {
                        C14581a.f35250a = C14581a.EnumC14583a.NormalStart;
                    }
                    aVar = C14581a.f35250a;
                } else if (i == 2) {
                    if (C14581a.m26666a(C14581a.f35252c.get(), C14581a.f35254e.get())) {
                        C14581a.f35250a = C14581a.EnumC14583a.NormalStart;
                    }
                    aVar = C14581a.f35250a;
                } else if (i != 3) {
                    aVar = C14581a.f35250a;
                } else {
                    if (C14581a.m26666a(C14581a.f35252c.get(), C14581a.f35255f.get())) {
                        C14581a.f35250a = C14581a.EnumC14583a.NormalStart;
                    }
                    aVar = C14581a.f35250a;
                }
                num = Integer.toString(aVar.getValue());
            }
            hashMap.put("s", num);
            Context context = C14703k.m26921a().f35742a;
            if (context != null) {
                z = C14756f.m27056a(context);
            } else {
                z = true;
            }
            hashMap.put("p", Integer.toString(!z ? 1 : 0));
            Logger.debug();
            AbstractC14690a.EnumC14691a aVar2 = AbstractC14690a.EnumC14691a.DISPATCH_DELAY;
            Iterator<Map.Entry<String, Set<String>>> it = this.f35708p.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Set<String>> next = it.next();
                Object obj = hashMap.get(next.getKey());
                if (obj != null) {
                    if (!next.getValue().contains(obj)) {
                        aVar2 = AbstractC14690a.EnumC14691a.DISPATCH_NONE;
                        break;
                    }
                } else {
                    aVar2 = AbstractC14690a.EnumC14691a.DISPATCH_NONE;
                    break;
                }
            }
            if (aVar2 == AbstractC14690a.EnumC14691a.DISPATCH_DELAY) {
                list.set(0, Integer.valueOf(m26905b()));
            }
            Logger.debug();
            return aVar2;
        }
    }
}
