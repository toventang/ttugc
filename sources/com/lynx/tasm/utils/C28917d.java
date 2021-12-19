package com.lynx.tasm.utils;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.p2055d.C28751a;

/* renamed from: com.lynx.tasm.utils.d */
public class C28917d {
    static {
        Covode.recordClassIndex(35045);
    }

    /* renamed from: a */
    public static String m57922a(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"")) {
            int indexOf = str.indexOf("\"", 1);
            if (indexOf == -1) {
                return null;
            }
            return str.substring(1, indexOf);
        } else if (!str.startsWith("'")) {
            return str;
        } else {
            int indexOf2 = str.indexOf("'", 1);
            if (indexOf2 == -1) {
                return null;
            }
            return str.substring(1, indexOf2);
        }
    }

    /* renamed from: b */
    private static String m57923b(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        int length = str.length();
        if (str.startsWith("'") || str.startsWith("\"")) {
            i = 1;
        }
        if (str.endsWith("'") || str.endsWith("\"")) {
            length--;
        }
        if (i > length) {
            return null;
        }
        return str.substring(i, length);
    }

    /* renamed from: a */
    public static C28751a m57921a(AbstractC28520j jVar, String str) {
        ReadableMap map;
        C0484a<String, Object> arrayMap;
        String a = m57922a(str);
        if (a == null || jVar.f67063d == null || !jVar.f67063d.hasKey(a) || (map = jVar.f67063d.getMap(a)) == null || (arrayMap = map.toArrayMap()) == null) {
            return null;
        }
        C28751a aVar = new C28751a();
        aVar.f67801a = a;
        for (Object obj : arrayMap.values()) {
            if (obj instanceof String) {
                String str2 = (String) obj;
                int i = 0;
                int length = str2.length();
                while (i < length) {
                    int indexOf = str2.indexOf("url(", i);
                    int indexOf2 = str2.indexOf("local(", i);
                    if (indexOf == -1 && indexOf2 == -1) {
                        break;
                    }
                    if (indexOf != -1) {
                        if (indexOf2 == -1) {
                            if (indexOf != -1) {
                                int indexOf3 = str2.indexOf(")", indexOf);
                                if (indexOf3 == -1) {
                                    break;
                                }
                                i = indexOf3 + 2;
                                String b = m57923b(str2.substring(indexOf + 4, indexOf3));
                                if (b == null) {
                                    break;
                                }
                                aVar.mo49868a(b);
                            }
                        } else if (indexOf >= indexOf2) {
                            int indexOf4 = str2.indexOf(")", indexOf2);
                            if (indexOf4 == -1) {
                                break;
                            }
                            i = indexOf4 + 2;
                            String b2 = m57923b(str2.substring(indexOf2 + 6, indexOf4));
                            if (b2 == null) {
                                break;
                            }
                            aVar.mo49869b(b2);
                        } else {
                            int indexOf5 = str2.indexOf(")", indexOf);
                            if (indexOf5 == -1) {
                                break;
                            }
                            i = indexOf5 + 2;
                            String b3 = m57923b(str2.substring(indexOf + 4, indexOf5));
                            if (b3 == null) {
                                break;
                            }
                            aVar.mo49868a(b3);
                        }
                    }
                    int indexOf6 = str2.indexOf(")", indexOf2);
                    if (indexOf6 == -1) {
                        break;
                    }
                    i = indexOf6 + 2;
                    String b4 = m57923b(str2.substring(indexOf2 + 6, indexOf6));
                    if (b4 == null) {
                        break;
                    }
                    aVar.mo49869b(b4);
                }
            }
        }
        return aVar;
    }
}
