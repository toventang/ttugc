package com.p2082ss.ttvideoengine.p4417j;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.ss.ttvideoengine.j.l */
public final class C86531l {

    /* renamed from: a */
    public String f194771a;

    /* renamed from: b */
    public int f194772b;

    /* renamed from: c */
    public int f194773c;

    /* renamed from: d */
    public int f194774d;

    /* renamed from: e */
    public long f194775e;

    /* renamed from: f */
    public String f194776f;

    /* renamed from: g */
    public List<String> f194777g;

    /* renamed from: h */
    public List<String> f194778h;

    /* renamed from: i */
    public List<String> f194779i;

    static {
        Covode.recordClassIndex(101759);
    }

    /* renamed from: a */
    public static List<String> m149712a(Object obj, String[] strArr) {
        JSONArray jSONArray;
        int length;
        strArr[0] = null;
        if (obj == null) {
            return null;
        }
        try {
            if (!(obj instanceof JSONArray) || (length = (jSONArray = (JSONArray) obj).length()) == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(string);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            strArr[0] = jSONArray.toString();
            return arrayList;
        } catch (Exception unused) {
        }
        return null;
    }
}
