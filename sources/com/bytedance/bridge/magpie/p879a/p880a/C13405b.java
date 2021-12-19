package com.bytedance.bridge.magpie.p879a.p880a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.bridge.magpie.p883b.C13431b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

/* renamed from: com.bytedance.bridge.magpie.a.a.b */
public final class C13405b {

    /* renamed from: c */
    public static final C13406a f32703c = new C13406a((byte) 0);

    /* renamed from: a */
    public LruCache<String, C13407c> f32704a;

    /* renamed from: b */
    public final String f32705b;

    /* renamed from: d */
    private Map<String, List<C13404a>> f32706d = new LinkedHashMap();

    static {
        Covode.recordClassIndex(15405);
    }

    /* renamed from: com.bytedance.bridge.magpie.a.a.b$a */
    public static final class C13406a {
        static {
            Covode.recordClassIndex(15406);
        }

        private C13406a() {
        }

        public /* synthetic */ C13406a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo21628a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        Iterator<String> keys;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!(jSONObject == null || (optJSONObject = jSONObject.optJSONObject("content")) == null || (keys = optJSONObject.keys()) == null)) {
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray optJSONArray = optJSONObject.optJSONArray(next);
                ArrayList arrayList = new ArrayList();
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList.add(m24111b(optJSONArray != null ? optJSONArray.optJSONObject(i) : null));
                    }
                }
                C89219l.m154709a((Object) next, "");
                linkedHashMap.put(next, arrayList);
            }
        }
        this.f32706d = linkedHashMap;
        LruCache<String, C13407c> lruCache = this.f32704a;
        if (lruCache != null) {
            lruCache.evictAll();
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r8 != null) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a1 A[ADDED_TO_REGION] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.bridge.magpie.p879a.p880a.C13404a m24111b(org.json.JSONObject r8) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bridge.magpie.p879a.p880a.C13405b.m24111b(org.json.JSONObject):com.bytedance.bridge.magpie.a.a.a");
    }

    /* renamed from: a */
    public final C13407c mo21627a(String str) {
        Matcher matcher;
        String str2 = null;
        C13407c cVar = new C13407c(C13431b.EnumC13432a.PUBLIC, null, null, 6);
        Uri parse = Uri.parse(str);
        C89219l.m154709a((Object) parse, "");
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        if (authority != null) {
            Object[] array = new C89350l("[.]").split(authority, 0).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                int length = strArr.length;
                if (length >= 2) {
                    str2 = length == 2 ? authority : strArr[length - 2] + "." + strArr[length - 1];
                }
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        if (TextUtils.isEmpty(scheme) || TextUtils.isEmpty(authority) || str2 == null) {
            LruCache<String, C13407c> lruCache = this.f32704a;
            if (lruCache != null) {
                lruCache.put(str, cVar);
            }
            return cVar;
        }
        List<C13404a> list = this.f32706d.get(str2);
        if (list != null) {
            for (T t : list) {
                Pattern pattern = t.f32699a;
                if (!(pattern == null || (matcher = pattern.matcher(str)) == null || !matcher.find())) {
                    if (t.f32700b.compareTo((Enum) cVar.f32707a) >= 0) {
                        C13431b.EnumC13432a aVar = t.f32700b;
                        C89219l.m154719c(aVar, "");
                        cVar.f32707a = aVar;
                    }
                    cVar.f32708b.addAll(t.f32701c);
                    cVar.f32709c.addAll(t.f32702d);
                }
            }
        }
        LruCache<String, C13407c> lruCache2 = this.f32704a;
        if (lruCache2 != null) {
            lruCache2.put(str, cVar);
        }
        return cVar;
    }

    public C13405b(String str, int i, JSONObject jSONObject) {
        C89219l.m154719c(str, "");
        this.f32705b = str;
        this.f32704a = new LruCache<>(i <= 0 ? 16 : i);
        mo21628a(jSONObject);
    }
}
