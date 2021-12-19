package com.bytedance.ies.abmock;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.datacenter.C16065e;
import com.bytedance.ies.abmock.datacenter.p1118c.C16063e;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import java.util.Map;

/* renamed from: com.bytedance.ies.abmock.e */
public class C16073e {

    /* renamed from: a */
    private static volatile C16073e f38708a;

    /* renamed from: b */
    private static final Float f38709b = Float.valueOf(0.74347335f);

    /* renamed from: c */
    private static final Double f38710c = Double.valueOf(0.7434733377752801d);

    /* renamed from: d */
    private static final Integer f38711d = 2690237;

    /* renamed from: e */
    private static final Long f38712e = 992354881878L;

    /* renamed from: f */
    private static final Boolean f38713f = false;

    private C16073e() {
    }

    /* renamed from: a */
    public static boolean m29868a(String str, boolean z, boolean z2) {
        if (!C16083j.m29874a().mo25538c()) {
            return C16048b.m29633a().mo25421a(z2, str, z);
        }
        boolean a = C16065e.m29769a().mo25493a(str, z, z2);
        C16083j.m29874a();
        Boolean.valueOf(a);
        return a;
    }

    /* renamed from: a */
    public static String m29867a(String str, String str2, boolean z) {
        if (!C16083j.m29874a().mo25538c()) {
            return C16048b.m29633a().mo25417a(z, str, str2);
        }
        String a = C16065e.m29769a().mo25491a(str, str2, z);
        C16083j.m29874a();
        return a;
    }

    static {
        Covode.recordClassIndex(18349);
    }

    /* renamed from: com.bytedance.ies.abmock.e$1 */
    static /* synthetic */ class C160741 {

        /* renamed from: a */
        static final /* synthetic */ int[] f38714a;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 102
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.abmock.C16073e.C160741.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C16073e m29864a() {
        MethodCollector.m26663i(2067);
        if (f38708a == null) {
            synchronized (C16073e.class) {
                try {
                    if (f38708a == null) {
                        f38708a = new C16073e();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2067);
                    throw th;
                }
            }
        }
        C16073e eVar = f38708a;
        MethodCollector.m26664o(2067);
        return eVar;
    }

    /* renamed from: a */
    public static <T> T m29865a(String str, boolean z) {
        if (!C16083j.m29874a().mo25538c()) {
            return (T) C16048b.m29633a().mo25414a(z, str);
        }
        T t = (T) C16065e.m29769a().mo25494a(str, z);
        C16083j.m29874a();
        return t;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public static Object m29869b(String str, boolean z) {
        boolean z2;
        boolean z3;
        Object obj;
        Object obj2;
        if (C16050d.f38667a == null || C16050d.f38667a.isEmpty()) {
            z2 = false;
        } else {
            z2 = C16050d.f38667a.containsKey(str);
        }
        if (z2) {
            Object obj3 = C16050d.f38667a.get(str);
            C16083j.m29874a();
            return obj3;
        }
        C28022o a = C16063e.f38688a.mo25481a();
        if (a != null) {
            z3 = a.mo46802b(str);
        } else {
            z3 = false;
        }
        if (z3) {
            Object a2 = C16063e.f38688a.mo25482a(str);
            if (z) {
                String b = C16086m.m29881a().mo46674b(a2);
                C16083j.m29874a();
                return b;
            }
            C16083j.m29874a();
            return a2;
        }
        Map<String, ConfigItem> map = C16075f.f38715a;
        if (map == null || map.isEmpty()) {
            C16083j.m29874a();
            return null;
        }
        C16083j.m29874a();
        ConfigItem configItem = map.get(str);
        if (configItem != null) {
            try {
                switch (C160741.f38714a[configItem.type.ordinal()]) {
                    case 1:
                        int intValue = f38711d.intValue();
                        if (configItem.defaultValue != null) {
                            intValue = ((Integer) configItem.defaultValue).intValue();
                        }
                        if (C16083j.m29874a().mo25538c()) {
                            m29864a();
                            return Integer.valueOf(m29862a(str, intValue, false));
                        } else if (configItem.isAB) {
                            return Integer.valueOf(C16048b.m29633a().mo25412a(false, str, intValue));
                        } else {
                            return Integer.valueOf(SettingsManager.m29616a().mo25394a(str, intValue));
                        }
                    case 2:
                        boolean booleanValue = f38713f.booleanValue();
                        if (configItem.defaultValue != null) {
                            booleanValue = ((Boolean) configItem.defaultValue).booleanValue();
                        }
                        if (C16083j.m29874a().mo25538c()) {
                            m29864a();
                            return Boolean.valueOf(m29868a(str, booleanValue, false));
                        } else if (configItem.isAB) {
                            return Boolean.valueOf(C16048b.m29633a().mo25421a(false, str, booleanValue));
                        } else {
                            return Boolean.valueOf(SettingsManager.m29616a().mo25400a(str, booleanValue));
                        }
                    case 3:
                        long longValue = f38712e.longValue();
                        if (configItem.defaultValue != null) {
                            longValue = ((Long) configItem.defaultValue).longValue();
                        }
                        if (C16083j.m29874a().mo25538c()) {
                            m29864a();
                            return Long.valueOf(m29863a(str, longValue, false));
                        } else if (configItem.isAB) {
                            return Long.valueOf(C16048b.m29633a().mo25413a(false, str, longValue));
                        } else {
                            return Long.valueOf(SettingsManager.m29616a().mo25395a(str, longValue));
                        }
                    case 4:
                        double doubleValue = f38710c.doubleValue();
                        if (configItem.defaultValue != null) {
                            doubleValue = ((Double) configItem.defaultValue).doubleValue();
                        }
                        if (C16083j.m29874a().mo25538c()) {
                            m29864a();
                            return Double.valueOf(m29860a(str, doubleValue, false));
                        } else if (configItem.isAB) {
                            return Double.valueOf(C16048b.m29633a().mo25409a(false, str, doubleValue));
                        } else {
                            return Double.valueOf(SettingsManager.m29616a().mo25392a(str, doubleValue));
                        }
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        float floatValue = f38709b.floatValue();
                        if (configItem.defaultValue != null) {
                            floatValue = ((Float) configItem.defaultValue).floatValue();
                        }
                        if (C16083j.m29874a().mo25538c()) {
                            m29864a();
                            return Float.valueOf(m29861a(str, floatValue, false));
                        } else if (configItem.isAB) {
                            return Float.valueOf(C16048b.m29633a().mo25410a(false, str, floatValue));
                        } else {
                            return Float.valueOf(SettingsManager.m29616a().mo25393a(str, floatValue));
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        if (C16083j.m29874a().mo25538c()) {
                            m29864a();
                            return m29867a(str, (String) configItem.defaultValue, false);
                        } else if (configItem.isAB) {
                            return C16048b.m29633a().mo25417a(false, str, (String) configItem.defaultValue);
                        } else {
                            return SettingsManager.m29616a().mo25398a(str, (String) configItem.defaultValue);
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        if (C16083j.m29874a().mo25538c()) {
                            m29864a();
                            obj = m29865a(str, false);
                        } else if (configItem.isAB) {
                            obj = C16048b.m29633a().mo25414a(false, str);
                        } else {
                            obj = SettingsManager.m29616a().mo25396a(str, String[].class);
                        }
                        if (z) {
                            return C16086m.m29881a().mo46674b(obj);
                        }
                        return obj;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        if (C16083j.m29874a().mo25538c()) {
                            m29864a();
                            obj2 = m29866a(str, false, true, AbstractC28019l.class);
                        } else if (configItem.isAB) {
                            obj2 = C16048b.m29633a().mo25415a(false, str, AbstractC28019l.class);
                        } else {
                            obj2 = SettingsManager.m29616a().mo25396a(str, AbstractC28019l.class);
                        }
                        if (z) {
                            return C16086m.m29881a().mo46674b(obj2);
                        }
                        return obj2;
                }
            } catch (Throwable th) {
                C16083j.m29874a();
                th.getMessage();
            }
        }
        C16083j.m29874a();
        return null;
    }

    /* renamed from: a */
    public static double m29860a(String str, double d, boolean z) {
        if (!C16083j.m29874a().mo25538c()) {
            return C16048b.m29633a().mo25409a(z, str, d);
        }
        double a = C16065e.m29769a().mo25486a(str, d, z);
        C16083j.m29874a();
        Double.valueOf(a);
        return a;
    }

    /* renamed from: a */
    public static float m29861a(String str, float f, boolean z) {
        if (!C16083j.m29874a().mo25538c()) {
            return C16048b.m29633a().mo25410a(z, str, f);
        }
        float a = C16065e.m29769a().mo25487a(str, f, z);
        C16083j.m29874a();
        Float.valueOf(a);
        return a;
    }

    /* renamed from: a */
    public static int m29862a(String str, int i, boolean z) {
        if (!C16083j.m29874a().mo25538c()) {
            return C16048b.m29633a().mo25412a(z, str, i);
        }
        int a = C16065e.m29769a().mo25488a(str, i, z);
        C16083j.m29874a();
        Integer.valueOf(a);
        return a;
    }

    /* renamed from: a */
    public static long m29863a(String str, long j, boolean z) {
        if (!C16083j.m29874a().mo25538c()) {
            return C16048b.m29633a().mo25413a(z, str, j);
        }
        long a = C16065e.m29769a().mo25489a(str, j, z);
        C16083j.m29874a();
        Long.valueOf(a);
        return a;
    }

    /* renamed from: a */
    static <T> T m29866a(String str, boolean z, boolean z2, Class cls) {
        if (!C16083j.m29874a().mo25538c()) {
            return (T) C16048b.m29633a().mo25415a(z, str, cls);
        }
        T t = (T) C16065e.m29769a().mo25490a(str, z, z2, cls);
        C16083j.m29874a();
        return t;
    }
}
