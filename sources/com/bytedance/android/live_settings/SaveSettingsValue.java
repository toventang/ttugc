package com.bytedance.android.live_settings;

import com.bytedance.android.live_settings.p423a.C6408c;
import com.bytedance.android.live_settings.p423a.C6409d;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import java.util.ArrayList;
import java.util.Iterator;

public class SaveSettingsValue {
    protected static volatile boolean isSaving;

    static {
        Covode.recordClassIndex(7128);
    }

    static long getLatestSettingsSavedTime() {
        return C6408c.f15976b.mo12546b("settings_saved_time", 0L);
    }

    static void save(C28022o oVar, ArrayList<C6411c> arrayList) {
        isSaving = true;
        realSave(oVar, arrayList);
        isSaving = false;
        C6408c.f15976b.mo12539a("settings_saved_time", System.currentTimeMillis());
    }

    private static void saveDoubleValue(C28022o oVar, String str) {
        try {
            AbstractC28019l c = oVar.mo46803c(str);
            if (c != null) {
                C6409d.f15977b.mo12536a(str, c.mo46690d());
            } else {
                C6409d.f15977b.mo12535a(str);
            }
        } catch (Throwable th) {
            SettingsManager.monitor.mo12560a("saveDoubleValue", "exception: " + th.getMessage() + ", key: " + str);
        }
    }

    private static void saveFloatValue(C28022o oVar, String str) {
        try {
            AbstractC28019l c = oVar.mo46803c(str);
            if (c != null) {
                C6409d.f15977b.mo12537a(str, c.mo46691e());
            } else {
                C6409d.f15977b.mo12535a(str);
            }
        } catch (Throwable th) {
            SettingsManager.monitor.mo12560a("saveFloatValue", "exception: " + th.getMessage() + ", key: " + str);
        }
    }

    private static void saveLongValue(C28022o oVar, String str) {
        try {
            AbstractC28019l c = oVar.mo46803c(str);
            if (c != null) {
                C6409d.f15977b.mo12539a(str, c.mo46693f());
            } else {
                C6409d.f15977b.mo12535a(str);
            }
        } catch (Throwable th) {
            SettingsManager.monitor.mo12560a("saveLongValue", "exception: " + th.getMessage() + ", key: " + str);
        }
    }

    private static void saveBooleanValue(C28022o oVar, String str) {
        boolean z;
        try {
            C28025r d = oVar.mo46804d(str);
            if (d == null) {
                C6409d.f15977b.mo12535a(str);
            } else if (d.f65806a instanceof Number) {
                C6409d dVar = C6409d.f15977b;
                if (d.mo46694g() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                dVar.mo12541a(str, z);
            } else {
                C6409d.f15977b.mo12541a(str, d.mo46695h());
            }
        } catch (Throwable th) {
            SettingsManager.monitor.mo12560a("saveBooleanValue", "exception: " + th.getMessage() + ", key: " + str);
        }
    }

    private static void saveCustomTypeValue(C28022o oVar, String str) {
        try {
            AbstractC28019l c = oVar.mo46803c(str);
            if (c != null) {
                C6409d.f15977b.mo12540a(str, c.toString());
            } else if (oVar.mo46802b(str)) {
                C6409d.f15977b.mo12540a(str, (String) null);
            } else {
                C6409d.f15977b.mo12535a(str);
            }
        } catch (Throwable th) {
            SettingsManager.monitor.mo12560a("saveCustomTypeValue", "exception: " + th.getMessage() + ", key: " + str);
        }
    }

    private static void saveIntValue(C28022o oVar, String str) {
        int i;
        try {
            C28025r d = oVar.mo46804d(str);
            if (d == null) {
                C6409d.f15977b.mo12535a(str);
            } else if (d.f65806a instanceof Boolean) {
                C6409d dVar = C6409d.f15977b;
                if (d.mo46695h()) {
                    i = 1;
                } else {
                    i = 0;
                }
                dVar.mo12538a(str, i);
            } else {
                C6409d.f15977b.mo12538a(str, d.mo46694g());
            }
        } catch (Throwable th) {
            SettingsManager.monitor.mo12560a("saveIntValue", "exception: " + th.getMessage() + ", key: " + str);
        }
    }

    private static void saveStringArrayValue(C28022o oVar, String str) {
        try {
            AbstractC28019l c = oVar.mo46803c(str);
            if (c != null) {
                C6409d.f15977b.mo12542a(str, (String[]) C6409d.f15977b.mo12533a().mo46667a(c, String[].class));
            } else if (oVar.mo46802b(str)) {
                C6409d.f15977b.mo12542a(str, (String[]) null);
            } else {
                C6409d.f15977b.mo12535a(str);
            }
        } catch (Throwable th) {
            SettingsManager.monitor.mo12560a("saveStringArrayValue", "exception: " + th.getMessage() + ", key: " + str);
        }
    }

    private static void saveStringValue(C28022o oVar, String str) {
        try {
            AbstractC28019l c = oVar.mo46803c(str);
            if (c != null) {
                if (!(c instanceof C28025r)) {
                    C6409d.f15977b.mo12540a(str, c.toString());
                } else {
                    C6409d.f15977b.mo12540a(str, c.mo46689c());
                }
            } else if (oVar.mo46802b(str)) {
                C6409d.f15977b.mo12540a(str, (String) null);
            } else {
                C6409d.f15977b.mo12535a(str);
            }
        } catch (Throwable th) {
            SettingsManager.monitor.mo12560a("saveStringValue", "exception: " + th.getMessage() + ", key: " + str);
        }
    }

    private static void realSave(C28022o oVar, ArrayList<C6411c> arrayList) {
        Iterator<C6411c> it = arrayList.iterator();
        while (it.hasNext()) {
            C6411c next = it.next();
            String str = next.f15983c;
            str.hashCode();
            switch (str.hashCode()) {
                case -1325958191:
                    if (str.equals("double")) {
                        saveDoubleValue(oVar, next.f15984d);
                        continue;
                    }
                    break;
                case 104431:
                    if (str.equals("int")) {
                        saveIntValue(oVar, next.f15984d);
                        continue;
                    }
                    break;
                case 3327612:
                    if (str.equals("long")) {
                        saveLongValue(oVar, next.f15984d);
                        continue;
                    }
                    break;
                case 64711720:
                    if (str.equals("boolean")) {
                        saveBooleanValue(oVar, next.f15984d);
                        continue;
                    }
                    break;
                case 97526364:
                    if (str.equals("float")) {
                        saveFloatValue(oVar, next.f15984d);
                        continue;
                    }
                    break;
                case 1195259493:
                    if (str.equals("java.lang.String")) {
                        saveStringValue(oVar, next.f15984d);
                        continue;
                    }
                    break;
                case 1888107655:
                    if (str.equals("java.lang.String[]")) {
                        saveStringArrayValue(oVar, next.f15984d);
                        continue;
                    }
                    break;
            }
            saveCustomTypeValue(oVar, next.f15984d);
        }
    }
}
