package com.lynx.tasm.p2054c;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import java.util.Map;

/* renamed from: com.lynx.tasm.c.a */
public class C28723a {

    /* renamed from: a */
    public String f67733a;

    /* renamed from: b */
    public String f67734b;

    /* renamed from: c */
    public String f67735c;

    static {
        Covode.recordClassIndex(34817);
    }

    /* renamed from: a */
    public static Map<String, C28723a> m57533a(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        C0484a aVar = new C0484a();
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            C28723a aVar2 = new C28723a(map.getString(StringSet.name), map.getString(StringSet.type), map.getString("function"));
            aVar.put(aVar2.f67733a, aVar2);
        }
        return aVar;
    }

    public C28723a(String str, String str2, String str3) {
        this.f67733a = str;
        this.f67734b = str2;
        this.f67735c = str3;
    }
}
