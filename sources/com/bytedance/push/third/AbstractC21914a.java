package com.bytedance.push.third;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.p1600k.AbstractC21859e;
import com.p2082ss.android.pushmanager.setting.C30221b;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.bytedance.push.third.a */
public abstract class AbstractC21914a {

    /* renamed from: b */
    protected static final Set<Integer> f51899b = new CopyOnWriteArraySet();

    /* renamed from: a */
    protected Map<Integer, AbstractC21859e<AbstractC21919c>> f51900a = new HashMap();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo35673a();

    static {
        Covode.recordClassIndex(25579);
    }

    public AbstractC21914a() {
        mo35673a();
    }

    /* renamed from: b */
    public Set<Integer> mo35674b() {
        Map<Integer, AbstractC21859e<AbstractC21919c>> map = this.f51900a;
        if (map == null) {
            return null;
        }
        return map.keySet();
    }

    /* renamed from: c */
    public JSONArray mo35677c() {
        JSONArray jSONArray = new JSONArray();
        try {
            for (Integer num : this.f51900a.keySet()) {
                if (mo35675b(num.intValue())) {
                    jSONArray.put(num);
                }
            }
        } catch (Throwable unused) {
            for (Integer num2 : this.f51900a.keySet()) {
                if (num2 instanceof Integer) {
                    Integer num3 = num2;
                    if (mo35675b(num3.intValue())) {
                        jSONArray.put(num3);
                    }
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: c */
    public static boolean m41190c(int i) {
        Logger.debug();
        Set<Integer> set = f51899b;
        if (set.isEmpty()) {
            C30221b.m61148b();
            m41189a(C30221b.m61150d(), false);
        }
        return set.contains(Integer.valueOf(i));
    }

    /* renamed from: a */
    public AbstractC21918b mo35672a(int i) {
        AbstractC21919c f = this.f51900a.get(Integer.valueOf(i)).mo35537f();
        if (f == null) {
            return null;
        }
        return f.mo35681b();
    }

    /* renamed from: b */
    public boolean mo35675b(int i) {
        AbstractC21919c f = this.f51900a.get(Integer.valueOf(i)).mo35537f();
        if (f == null) {
            return false;
        }
        return f.mo35680a();
    }

    /* renamed from: d */
    public String mo35678d(int i) {
        if (this.f51900a.get(Integer.valueOf(i)) == null) {
            return "unknown";
        }
        return this.f51900a.get(Integer.valueOf(i)).mo35537f().mo35683d();
    }

    /* renamed from: a */
    public int mo35671a(String str) {
        if (this.f51900a == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        for (Integer num : this.f51900a.keySet()) {
            if (str.equals(this.f51900a.get(num).mo35537f().mo35682c())) {
                return num.intValue();
            }
        }
        return -1;
    }

    /* renamed from: b */
    public boolean mo35676b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!"[]".equals(str)) {
                    JSONArray jSONArray = new JSONArray(str);
                    if (jSONArray.length() > 0) {
                        if (jSONArray.optInt(0) == -9307) {
                            return true;
                        }
                        String jSONArray2 = mo35677c().toString();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            if (jSONArray2.contains(String.valueOf(jSONArray.optInt(i)))) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static void m41189a(String str, boolean z) {
        if (z) {
            C30221b.m61148b();
            C30221b.m61153g().mo35599b(str);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                Logger.debug();
                f51899b.clear();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    int optInt = jSONArray.optInt(i);
                    if (optInt > 0) {
                        f51899b.add(Integer.valueOf(optInt));
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
