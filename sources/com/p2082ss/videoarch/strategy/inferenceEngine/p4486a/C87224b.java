package com.p2082ss.videoarch.strategy.inferenceEngine.p4486a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.strategy.inferenceEngine.a.b */
public final class C87224b {

    /* renamed from: e */
    private static String f197544e = "(^((([0-9A-Fa-f]{1,4}:){7}(([0-9A-Fa-f]{1,4}){1}|:))|(([0-9A-Fa-f]{1,4}:){6}((:[0-9A-Fa-f]{1,4}){1}|((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){5}((:[0-9A-Fa-f]{1,4}){1,2}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){4}((:[0-9A-Fa-f]{1,4}){1,3}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){3}((:[0-9A-Fa-f]{1,4}){1,4}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){2}((:[0-9A-Fa-f]{1,4}){1,5}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){1}((:[0-9A-Fa-f]{1,4}){1,6}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(:((:[0-9A-Fa-f]{1,4}){1,7}|(:[fF]{4}){0,1}:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:)))$)";

    /* renamed from: a */
    public final String f197545a;

    /* renamed from: b */
    public int f197546b;

    /* renamed from: c */
    public List<String> f197547c = new ArrayList();

    /* renamed from: d */
    public String f197548d = null;

    /* renamed from: f */
    private final Random f197549f;

    /* renamed from: g */
    private List<String> f197550g = new ArrayList();

    /* renamed from: h */
    private List<String> f197551h = new ArrayList();

    /* renamed from: i */
    private ReentrantLock f197552i = new ReentrantLock();

    /* renamed from: j */
    private final List<String> f197553j = new ArrayList(10);

    /* renamed from: k */
    private final List<String> f197554k = new ArrayList();

    static {
        Covode.recordClassIndex(103027);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List<String> mo141095b() {
        this.f197552i.lock();
        ArrayList arrayList = new ArrayList();
        List<String> list = this.f197550g;
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(this.f197550g);
        }
        List<String> list2 = this.f197551h;
        if (list2 != null && !list2.isEmpty()) {
            arrayList.addAll(this.f197551h);
        }
        List<String> list3 = this.f197547c;
        if (list3 != null && !list3.isEmpty()) {
            arrayList.addAll(this.f197547c);
        }
        this.f197552i.unlock();
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONArray mo141093a() {
        this.f197552i.lock();
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f197550g;
        if (!(list == null || this.f197551h == null)) {
            if (!list.isEmpty()) {
                for (int i = 0; i < this.f197550g.size(); i++) {
                    jSONArray.put(this.f197550g.get(i));
                }
            }
            if (!this.f197551h.isEmpty()) {
                for (int i2 = 0; i2 < this.f197551h.size(); i2++) {
                    jSONArray.put(this.f197551h.get(i2));
                }
            }
        }
        this.f197552i.unlock();
        return jSONArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final JSONObject mo141097c() {
        this.f197552i.lock();
        JSONObject jSONObject = new JSONObject();
        List<String> list = this.f197547c;
        if (!(list == null || list.size() == 0)) {
            for (String str : this.f197547c) {
                try {
                    jSONObject.put(str, "local_dns");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        List<String> list2 = this.f197551h;
        if (!(list2 == null || list2.size() == 0)) {
            for (String str2 : this.f197551h) {
                try {
                    jSONObject.put(str2, "remote_local_dns");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        List<String> list3 = this.f197550g;
        if (!(list3 == null || list3.size() == 0)) {
            for (String str3 : this.f197550g) {
                try {
                    jSONObject.put(str3, "http_dns");
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
        }
        this.f197552i.unlock();
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo141094a(List<String> list) {
        this.f197552i.lock();
        this.f197550g = list;
        this.f197552i.unlock();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo141096b(List<String> list) {
        this.f197552i.lock();
        this.f197551h = list;
        this.f197552i.unlock();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo141098c(List<String> list) {
        this.f197552i.lock();
        this.f197547c = list;
        this.f197552i.unlock();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo141092a(boolean z) {
        this.f197552i.lock();
        List<String> list = this.f197550g;
        if (list == null || list.isEmpty()) {
            List<String> list2 = this.f197551h;
            if (list2 == null || list2.isEmpty()) {
                List<String> list3 = this.f197547c;
                if (list3 == null || list3.isEmpty()) {
                    this.f197552i.unlock();
                    return null;
                }
                for (String str : this.f197547c) {
                    if (!TextUtils.isEmpty(str)) {
                        if (Pattern.compile(f197544e).matcher(Normalizer.normalize(str, Normalizer.Form.NFKC)).matches()) {
                            if (z) {
                                this.f197552i.unlock();
                                return str;
                            }
                        }
                    }
                    if (!z) {
                        this.f197552i.unlock();
                        return str;
                    }
                }
                String str2 = this.f197547c.get(0);
                this.f197552i.unlock();
                return str2;
            }
            String str3 = this.f197551h.get(0);
            this.f197552i.unlock();
            return str3;
        }
        String str4 = this.f197550g.get(0);
        this.f197552i.unlock();
        return str4;
    }

    C87224b(String str, int i) {
        this.f197545a = str;
        this.f197549f = new Random(System.currentTimeMillis());
        this.f197546b = i;
    }
}
