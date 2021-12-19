package com.bytedance.ies.abmock.datacenter.p1118c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16075f;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.datacenter.plugin.BaseConfigPlugin;
import com.bytedance.ies.abmock.datacenter.plugin.C16072a;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28021n;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.bytedance.ies.abmock.datacenter.c.d */
public final class C16061d {

    /* renamed from: a */
    public static boolean f38685a;

    /* renamed from: b */
    public static C28022o f38686b;

    static {
        Covode.recordClassIndex(18332);
    }

    /* renamed from: com.bytedance.ies.abmock.datacenter.c.d$1 */
    static /* synthetic */ class C160621 {

        /* renamed from: a */
        static final /* synthetic */ int[] f38687a;

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
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.abmock.datacenter.p1118c.C16061d.C160621.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static boolean m29739a(C28022o oVar) {
        Map<String, ConfigItem> configMap;
        f38686b = oVar;
        for (Map.Entry<String, ConfigItem> entry : C16075f.f38715a.entrySet()) {
            String key = entry.getKey();
            switch (C160621.f38687a[entry.getValue().type.ordinal()]) {
                case 1:
                    m29740b(oVar, key);
                    break;
                case 2:
                    m29738a(oVar, key);
                    break;
                case 3:
                    m29742d(oVar, key);
                    break;
                case 4:
                    m29743e(oVar, key);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    m29744f(oVar, key);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    m29741c(oVar, key);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    m29745g(oVar, key);
                    break;
                default:
                    m29746h(oVar, key);
                    break;
            }
        }
        Map<BaseConfigPlugin, Boolean> map = C16072a.m29859a().f38707a;
        Map<String, ConfigItem> map2 = C16075f.f38715a;
        for (Map.Entry<BaseConfigPlugin, Boolean> entry2 : map.entrySet()) {
            if (!entry2.getValue().booleanValue() && (configMap = entry2.getKey().getConfigMap()) != null) {
                for (Map.Entry<String, ConfigItem> entry3 : configMap.entrySet()) {
                    String key2 = entry3.getKey();
                    if (map2 == null || !map2.containsKey(key2)) {
                        switch (C160621.f38687a[entry3.getValue().type.ordinal()]) {
                            case 1:
                                m29740b(oVar, key2);
                                break;
                            case 2:
                                m29738a(oVar, key2);
                                break;
                            case 3:
                                m29742d(oVar, key2);
                                break;
                            case 4:
                                m29743e(oVar, key2);
                                break;
                            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                                m29744f(oVar, key2);
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                                m29741c(oVar, key2);
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                                m29745g(oVar, key2);
                                break;
                            default:
                                m29746h(oVar, key2);
                                break;
                        }
                    }
                }
            }
        }
        C28022o a = oVar.mo46697i();
        Iterator<String> it = a.f65804a.keySet().iterator();
        Map<String, ConfigItem> map3 = C16075f.f38715a;
        while (it.hasNext()) {
            String next = it.next();
            if (map3 != null && map3.containsKey(next)) {
                it.remove();
            }
        }
        C16063e.f38688a.mo25485b(a);
        try {
            f38685a = true;
            C16058b.f38679a.mo25478b("libra_config_center_saved", true);
        } catch (Throwable th) {
            C13468b.m24210a(th);
        }
        return true;
    }

    /* renamed from: d */
    private static void m29742d(C28022o oVar, String str) {
        AbstractC28019l c;
        try {
            C28022o f = oVar.mo46807f(str);
            if (f == null || (c = f.mo46803c("val")) == null || (c instanceof C28021n)) {
                C16058b.f38679a.mo25480c(str);
            } else {
                C16058b.f38679a.mo25476b(str, c.mo46693f());
            }
        } catch (Throwable th) {
            C13468b.m24209a(th + "  , key: " + str);
        }
    }

    /* renamed from: e */
    private static void m29743e(C28022o oVar, String str) {
        AbstractC28019l c;
        try {
            C28022o f = oVar.mo46807f(str);
            if (f == null || (c = f.mo46803c("val")) == null || (c instanceof C28021n)) {
                C16058b.f38679a.mo25480c(str);
            } else {
                C16058b.f38679a.mo25473b(str, c.mo46690d());
            }
        } catch (Throwable th) {
            C13468b.m24209a(th + "  , key: " + str);
        }
    }

    /* renamed from: f */
    private static void m29744f(C28022o oVar, String str) {
        AbstractC28019l c;
        try {
            C28022o f = oVar.mo46807f(str);
            if (f == null || (c = f.mo46803c("val")) == null || (c instanceof C28021n)) {
                C16058b.f38679a.mo25480c(str);
            } else {
                C16058b.f38679a.mo25474b(str, c.mo46691e());
            }
        } catch (Throwable th) {
            C13468b.m24209a(th + "  , key: " + str);
        }
    }

    /* renamed from: a */
    private static void m29738a(C28022o oVar, String str) {
        C28025r d;
        int i;
        try {
            C28022o f = oVar.mo46807f(str);
            if (f == null || (d = f.mo46804d("val")) == null) {
                C16058b.f38679a.mo25480c(str);
            } else if (d.f65806a instanceof Boolean) {
                C16058b bVar = C16058b.f38679a;
                if (d.mo46695h()) {
                    i = 1;
                } else {
                    i = 0;
                }
                bVar.mo25475b(str, i);
            } else {
                C16058b.f38679a.mo25475b(str, d.mo46694g());
            }
        } catch (Throwable th) {
            C13468b.m24209a(th + "  , key: " + str);
        }
    }

    /* renamed from: b */
    private static void m29740b(C28022o oVar, String str) {
        C28025r d;
        boolean z;
        try {
            C28022o f = oVar.mo46807f(str);
            if (f == null || (d = f.mo46804d("val")) == null) {
                C16058b.f38679a.mo25480c(str);
            } else if (d.f65806a instanceof Number) {
                C16058b bVar = C16058b.f38679a;
                if (d.mo46694g() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                bVar.mo25478b(str, z);
            } else {
                C16058b.f38679a.mo25478b(str, d.mo46695h());
            }
        } catch (Throwable th) {
            C13468b.m24209a(th + "  , key: " + str);
        }
    }

    /* renamed from: c */
    private static void m29741c(C28022o oVar, String str) {
        AbstractC28019l c;
        try {
            C28022o f = oVar.mo46807f(str);
            if (f != null && (c = f.mo46803c("val")) != null && !(c instanceof C28021n)) {
                C16058b.f38679a.mo25477b(str, c.mo46689c());
            } else if (oVar.mo46802b(str)) {
                C16058b.f38679a.mo25477b(str, (String) null);
            } else {
                C16058b.f38679a.mo25480c(str);
            }
        } catch (Throwable th) {
            C13468b.m24209a(th + "  , key: " + str);
        }
    }

    /* renamed from: g */
    private static void m29745g(C28022o oVar, String str) {
        AbstractC28019l c;
        try {
            C28022o f = oVar.mo46807f(str);
            if (f != null && (c = f.mo46803c("val")) != null && !(c instanceof C28021n)) {
                C16058b.f38679a.mo25470a(str, (String[]) C16058b.f38679a.mo25467a().mo46667a(c, String[].class));
            } else if (oVar.mo46802b(str)) {
                C16058b.f38679a.mo25470a(str, (String[]) null);
            } else {
                C16058b.f38679a.mo25480c(str);
            }
        } catch (Throwable th) {
            C13468b.m24209a(th + "  , key: " + str);
        }
    }

    /* renamed from: h */
    private static void m29746h(C28022o oVar, String str) {
        AbstractC28019l c;
        try {
            C28022o f = oVar.mo46807f(str);
            if (f != null && (c = f.mo46803c("val")) != null && !(c instanceof C28021n)) {
                C16058b.f38679a.mo25477b(str, c.toString());
            } else if (oVar.mo46802b(str)) {
                C16058b.f38679a.mo25477b(str, (String) null);
            } else {
                C16058b.f38679a.mo25480c(str);
            }
        } catch (Throwable th) {
            C13468b.m24209a(th + "  , key: " + str);
        }
    }
}
