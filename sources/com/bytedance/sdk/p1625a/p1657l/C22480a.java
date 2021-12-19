package com.bytedance.sdk.p1625a.p1657l;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1657l.p1661d.C22494c;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.p2082ss.android.account.p2089b.C29345a;
import java.util.Date;
import java.util.Map;

/* renamed from: com.bytedance.sdk.a.l.a */
public final class C22480a {

    /* renamed from: a */
    private static Integer f53141a;

    /* renamed from: b */
    private static String f53142b;

    static {
        Covode.recordClassIndex(26296);
    }

    /* renamed from: a */
    public static C22494c m42423a(C22507a aVar) {
        C22494c cVar;
        try {
            if (f53141a != null) {
                C22494c.C22495a aVar2 = new C22494c.C22495a();
                aVar2.f53171a = new Date().getTime();
                if (!(aVar == null || aVar.f53222m == null)) {
                    aVar2.f53174d = aVar.f53210a;
                    aVar2.f53175e = aVar.f53212c;
                    String optString = aVar.f53222m.optString("screen_name");
                    String optString2 = aVar.f53222m.optString("avatar_url");
                    aVar2.f53177g = optString;
                    aVar2.f53176f = optString2;
                    if (f53141a.intValue() == 6) {
                        Map<String, C29345a> map = aVar.f53211b;
                        if (map != null) {
                            for (String str : map.keySet()) {
                                if (str.contains(f53142b)) {
                                    f53142b = str;
                                    C29345a aVar3 = map.get(str);
                                    if (aVar3 != null) {
                                        String str2 = aVar3.f69628d;
                                        aVar2.f53178h = aVar3.f69629e;
                                        aVar2.f53179i = str2;
                                    }
                                }
                            }
                        }
                    } else if (f53141a.intValue() == 1) {
                        f53142b = aVar.f53216g;
                        aVar2.mo36779a(Integer.valueOf(aVar.f53213d));
                    } else if (f53141a.intValue() == 2 || f53141a.intValue() == 3) {
                        int i = aVar.f53213d;
                        if (!TextUtils.isEmpty(f53142b) && f53142b.startsWith("+")) {
                            f53142b = f53142b.replace("+".concat(String.valueOf(i)), "");
                        }
                        aVar2.mo36779a(Integer.valueOf(i));
                    }
                }
                aVar2.f53172b = f53141a.intValue();
                aVar2.f53173c = f53142b;
                cVar = new C22494c(aVar2.f53171a, aVar2.f53172b, aVar2.f53173c, aVar2.f53174d, aVar2.f53175e, aVar2.f53176f, aVar2.f53177g, aVar2.f53178h, aVar2.f53179i, aVar2.f53180j);
                f53141a = null;
                f53142b = null;
                return cVar;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        cVar = null;
        f53141a = null;
        f53142b = null;
        return cVar;
    }

    /* renamed from: com.bytedance.sdk.a.l.a$a */
    static class C22483a {

        /* renamed from: a */
        public int f53150a;

        /* renamed from: b */
        public String f53151b;

        static {
            Covode.recordClassIndex(26299);
        }

        C22483a(int i, String str) {
            this.f53150a = i;
            this.f53151b = str;
        }
    }

    /* renamed from: a */
    public static void m42424a(Integer num, String str) {
        f53141a = num;
        f53142b = str;
    }
}
