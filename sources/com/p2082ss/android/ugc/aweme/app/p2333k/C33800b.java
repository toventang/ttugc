package com.p2082ss.android.ugc.aweme.app.p2333k;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.app.k.b */
public final class C33800b {

    /* renamed from: a */
    public static final C33801a f80048a = new C33801a((byte) 0);

    static {
        Covode.recordClassIndex(40697);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.k.b$a */
    public static final class C33801a {
        static {
            Covode.recordClassIndex(40698);
        }

        private C33801a() {
        }

        public /* synthetic */ C33801a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m69151a(Map<String, ? extends Object> map) {
            if (map == null) {
                return "";
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                stringBuffer.append(entry.getKey() + '=' + entry.getValue());
                stringBuffer.append("&");
            }
            String stringBuffer2 = stringBuffer.toString();
            C89219l.m154716b(stringBuffer2, "");
            if (!C89361p.m154876c(stringBuffer2, "&", false)) {
                return stringBuffer2;
            }
            Objects.requireNonNull(stringBuffer2, "null cannot be cast to non-null type java.lang.String");
            String substring = stringBuffer2.substring(0, stringBuffer2.length() - 1);
            C89219l.m154716b(substring, "");
            return substring;
        }

        /* renamed from: a */
        public static HashMap<String, Object> m69152a(String str) {
            C89219l.m154721d(str, "");
            HashMap<String, Object> hashMap = new HashMap<>(0);
            if (TextUtils.isEmpty(str)) {
                return hashMap;
            }
            Object[] array = C89361p.m154921c(str, new String[]{"&"}).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            for (String str2 : (String[]) array) {
                Object[] array2 = C89361p.m154921c(str2, new String[]{"="}).toArray(new String[0]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array2;
                if (strArr.length == 2) {
                    hashMap.put(strArr[0], strArr[1]);
                }
            }
            return hashMap;
        }
    }
}
