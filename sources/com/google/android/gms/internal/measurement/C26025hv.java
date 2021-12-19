package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.AbstractC25981gj;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.hv */
public final class C26025hv {
    static {
        Covode.recordClassIndex(31440);
    }

    /* renamed from: a */
    private static final String m50747a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: a */
    static void m50748a(AbstractC26020hq hqVar, StringBuilder sb, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean equals;
        String str6;
        String str7;
        String str8;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        Method[] declaredMethods = hqVar.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str9 : treeSet) {
            if (str9.startsWith("get")) {
                str = str9.substring(3);
            } else {
                str = str9;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String valueOf = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(str.substring(1, str.length() - 4));
                if (valueOf2.length() != 0) {
                    str8 = valueOf.concat(valueOf2);
                } else {
                    str8 = new String(valueOf);
                }
                Method method2 = (Method) hashMap.get(str9);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m50749a(sb, i, m50747a(str8), AbstractC25981gj.m50559a(method2, hqVar, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String valueOf3 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(str.substring(1, str.length() - 3));
                if (valueOf4.length() != 0) {
                    str7 = valueOf3.concat(valueOf4);
                } else {
                    str7 = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str9);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m50749a(sb, i, m50747a(str7), AbstractC25981gj.m50559a(method3, hqVar, new Object[0]));
                }
            }
            String valueOf5 = String.valueOf(str);
            if (valueOf5.length() != 0) {
                str2 = "set".concat(valueOf5);
            } else {
                str2 = new String("set");
            }
            if (hashMap2.get(str2) != null) {
                if (str.endsWith("Bytes")) {
                    String valueOf6 = String.valueOf(str.substring(0, str.length() - 5));
                    if (valueOf6.length() != 0) {
                        str6 = "get".concat(valueOf6);
                    } else {
                        str6 = new String("get");
                    }
                    if (hashMap.containsKey(str6)) {
                    }
                }
                String valueOf7 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf8 = String.valueOf(str.substring(1));
                if (valueOf8.length() != 0) {
                    str3 = valueOf7.concat(valueOf8);
                } else {
                    str3 = new String(valueOf7);
                }
                String valueOf9 = String.valueOf(str);
                if (valueOf9.length() != 0) {
                    str4 = "get".concat(valueOf9);
                } else {
                    str4 = new String("get");
                }
                Method method4 = (Method) hashMap.get(str4);
                String valueOf10 = String.valueOf(str);
                if (valueOf10.length() != 0) {
                    str5 = "has".concat(valueOf10);
                } else {
                    str5 = new String("has");
                }
                Method method5 = (Method) hashMap.get(str5);
                if (method4 != null) {
                    Object a = AbstractC25981gj.m50559a(method4, hqVar, new Object[0]);
                    if (method5 == null) {
                        if (a instanceof Boolean) {
                            if (!((Boolean) a).booleanValue()) {
                            }
                        } else if (a instanceof Integer) {
                            if (((Integer) a).intValue() == 0) {
                            }
                        } else if (a instanceof Float) {
                            if (((Float) a).floatValue() == 0.0f) {
                            }
                        } else if (!(a instanceof Double)) {
                            if (a instanceof String) {
                                equals = a.equals("");
                            } else if (a instanceof AbstractC25943fb) {
                                equals = a.equals(AbstractC25943fb.zza);
                            } else if (a instanceof AbstractC26020hq) {
                                if (a == ((AbstractC26020hq) a).mo42615H_()) {
                                }
                            } else if ((a instanceof Enum) && ((Enum) a).ordinal() == 0) {
                            }
                            if (equals) {
                            }
                        } else if (((Double) a).doubleValue() == 0.0d) {
                        }
                    } else if (!((Boolean) AbstractC25981gj.m50559a(method5, hqVar, new Object[0])).booleanValue()) {
                    }
                    m50749a(sb, i, m50747a(str3), a);
                }
            }
        }
        if (hqVar instanceof AbstractC25981gj.AbstractC25983b) {
            Iterator<Map.Entry<Object, Object>> b = ((AbstractC25981gj.AbstractC25983b) hqVar).zzc.mo42590b();
            if (b.hasNext()) {
                b.next().getKey();
                throw new NoSuchMethodError();
            }
        }
        AbstractC25981gj gjVar = (AbstractC25981gj) hqVar;
        if (gjVar.zzb != null) {
            gjVar.zzb.mo42754a(sb, i);
        }
    }

    /* renamed from: a */
    static final void m50749a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m50749a(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Object obj3 : ((Map) obj).entrySet()) {
                m50749a(sb, i, str, obj3);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"").append(C26054ix.m50895a(AbstractC25943fb.zza((String) obj))).append('\"');
            } else if (obj instanceof AbstractC25943fb) {
                sb.append(": \"").append(C26054ix.m50895a((AbstractC25943fb) obj)).append('\"');
            } else if (obj instanceof AbstractC25981gj) {
                sb.append(" {");
                m50748a((AbstractC25931es) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m50749a(sb, i4, "key", entry.getKey());
                m50749a(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ").append(obj.toString());
            }
        }
    }
}
