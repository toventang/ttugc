package com.p2082ss.android.common.applog.p2128a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.a.a */
public abstract class AbstractC29766a {

    /* renamed from: a */
    protected HashSet<String> f70982a;

    /* renamed from: b */
    protected HashMap<String, HashSet<String>> f70983b;

    static {
        Covode.recordClassIndex(36171);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo52031a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo52033a(HashSet<String> hashSet, String str);

    /* renamed from: a */
    public static final AbstractC29766a m59961a(Context context) {
        Map<String, ?> map;
        AbstractC29766a aVar;
        Set set;
        Set set2;
        try {
            SharedPreferences a = C34822d.m71158a(context, "sp_filter_name", 0);
            HashSet hashSet = new HashSet();
            HashMap hashMap = new HashMap();
            try {
                map = a.getAll();
            } catch (Throwable unused) {
                map = null;
            }
            if (map == null || map.size() <= 0) {
                return null;
            }
            int i = 0;
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    if ("is_block".equals(key)) {
                        i = a.getInt("is_block", 0);
                    } else if ("events".equals(key)) {
                        try {
                            set2 = (Set) entry.getValue();
                        } catch (Throwable unused2) {
                            set2 = null;
                        }
                        if (set2 != null && set2.size() > 0) {
                            hashSet.addAll(set2);
                        }
                    } else if (!TextUtils.isEmpty(key)) {
                        HashSet hashSet2 = new HashSet();
                        try {
                            set = (Set) entry.getValue();
                        } catch (Throwable unused3) {
                            set = null;
                        }
                        if (set != null && set.size() > 0) {
                            hashSet2.addAll(set);
                        }
                        if (hashSet2.size() > 0) {
                            hashMap.put(key, hashSet2);
                        }
                    }
                }
            }
            if (i > 0) {
                aVar = new C29767b(hashSet, hashMap);
            } else {
                aVar = new C29769d(hashSet, hashMap);
            }
            return aVar;
        } catch (Throwable unused4) {
            return null;
        }
    }

    protected AbstractC29766a(HashSet<String> hashSet, HashMap<String, HashSet<String>> hashMap) {
        this.f70982a = hashSet;
        this.f70983b = hashMap;
    }

    /* renamed from: a */
    public final boolean mo52032a(String str, JSONObject jSONObject) {
        HashMap<String, HashSet<String>> hashMap;
        HashSet<String> hashSet;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        HashSet<String> hashSet2 = this.f70982a;
        if (hashSet2 != null && hashSet2.size() > 0) {
            if (mo52031a(str)) {
                return false;
            }
            if (jSONObject != null && (hashMap = this.f70983b) != null && hashMap.size() > 0 && this.f70983b.containsKey(str) && (hashSet = this.f70983b.get(str)) != null && hashSet.size() > 0) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    if (mo52033a(hashSet, keys.next())) {
                        try {
                            keys.remove();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final AbstractC29766a m59962a(Context context, JSONObject jSONObject) {
        AbstractC29766a aVar;
        try {
            SharedPreferences.Editor edit = C34822d.m71158a(context, "sp_filter_name", 0).edit();
            edit.clear().commit();
            if (jSONObject == null) {
                return null;
            }
            if (!jSONObject.has("event_list")) {
                return null;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("event_list");
            if (optJSONObject == null) {
                return null;
            }
            int optInt = optJSONObject.optInt("is_block", 0);
            edit.putInt("is_block", optInt);
            HashSet hashSet = new HashSet();
            JSONArray optJSONArray = optJSONObject.optJSONArray("events");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        hashSet.add(optString);
                    }
                }
            }
            if (hashSet.size() > 0) {
                edit.putStringSet("events", hashSet);
            }
            HashMap hashMap = new HashMap();
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("params");
            if (optJSONObject2 != null) {
                Iterator<String> keys = optJSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next)) {
                        HashSet hashSet2 = new HashSet();
                        JSONArray optJSONArray2 = optJSONObject2.optJSONArray(next);
                        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                String optString2 = optJSONArray2.optString(i2);
                                if (!TextUtils.isEmpty(optString2)) {
                                    hashSet2.add(optString2);
                                }
                            }
                        }
                        if (hashSet2.size() > 0) {
                            hashMap.put(next, hashSet2);
                        }
                    }
                }
            }
            if (hashMap.size() > 0) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    edit.putStringSet((String) entry.getKey(), (Set) entry.getValue());
                }
            }
            edit.commit();
            if (optInt > 0) {
                aVar = new C29767b(hashSet, hashMap);
            } else {
                aVar = new C29769d(hashSet, hashMap);
            }
            return aVar;
        } catch (Throwable unused) {
            return null;
        }
    }
}
