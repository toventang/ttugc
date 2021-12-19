package com.kakao.util.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.kakao.util.helper.log.Logger;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SharedPreferencesCache implements PersistentKVStore {
    private final SharedPreferences file;
    private final Bundle memory = new Bundle();

    static {
        Covode.recordClassIndex(34061);
    }

    @Override // com.kakao.util.helper.PersistentKVStore
    public synchronized void clearAll() {
        MethodCollector.m26663i(8698);
        this.file.edit().clear().apply();
        this.memory.clear();
        MethodCollector.m26664o(8698);
    }

    public synchronized boolean clearAllSync() {
        boolean commit;
        MethodCollector.m26663i(8846);
        commit = this.file.edit().clear().commit();
        this.memory.clear();
        MethodCollector.m26664o(8846);
        return commit;
    }

    public synchronized void reloadAll() {
        MethodCollector.m26663i(8398);
        for (String str : this.file.getAll().keySet()) {
            try {
                deserializeKey(str);
            } catch (JSONException unused) {
            }
        }
        MethodCollector.m26664o(8398);
    }

    /* renamed from: com_kakao_util_helper_SharedPreferencesCache_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m56188x48fbee29(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public synchronized int getInt(String str) {
        int i;
        MethodCollector.m26663i(9302);
        i = this.memory.getInt(str);
        if (i == 0) {
            try {
                deserializeKey(str);
                i = this.memory.getInt(str);
            } catch (JSONException unused) {
            }
        }
        MethodCollector.m26664o(9302);
        return i;
    }

    @Override // com.kakao.util.helper.PersistentKVStore
    public synchronized String getString(String str) {
        String string;
        MethodCollector.m26663i(9158);
        string = this.memory.getString(str);
        if (string == null) {
            try {
                deserializeKey(str);
                string = this.memory.getString(str);
            } catch (JSONException unused) {
            }
        }
        MethodCollector.m26664o(9158);
        return string;
    }

    public synchronized void remove(String str) {
        MethodCollector.m26663i(8552);
        SharedPreferences.Editor edit = this.file.edit();
        edit.remove(str);
        edit.apply();
        this.memory.remove(str);
        MethodCollector.m26664o(8552);
    }

    public synchronized Boolean getBoolean(String str) {
        Boolean valueOf;
        MethodCollector.m26663i(9618);
        if (!this.memory.containsKey(str)) {
            try {
                deserializeKey(str);
            } catch (JSONException unused) {
            }
        }
        valueOf = Boolean.valueOf(this.memory.getBoolean(str));
        MethodCollector.m26664o(9618);
        return valueOf;
    }

    @Override // com.kakao.util.helper.PersistentKVStore
    public synchronized Date getDate(String str) {
        MethodCollector.m26663i(9762);
        long longValue = getLong(str).longValue();
        if (longValue <= 0) {
            MethodCollector.m26664o(9762);
            return null;
        }
        Date date = new Date(longValue);
        MethodCollector.m26664o(9762);
        return date;
    }

    public synchronized Long getLong(String str) {
        Long valueOf;
        MethodCollector.m26663i(9459);
        long j = this.memory.getLong(str);
        if (j == 0) {
            try {
                deserializeKey(str);
                j = this.memory.getLong(str);
            } catch (JSONException unused) {
            }
        }
        valueOf = Long.valueOf(j);
        MethodCollector.m26664o(9459);
        return valueOf;
    }

    @Override // com.kakao.util.helper.PersistentKVStore
    public synchronized void clear(List<String> list) {
        MethodCollector.m26663i(8554);
        SharedPreferences.Editor edit = this.file.edit();
        for (String str : list) {
            edit.remove(str);
        }
        edit.apply();
        for (String str2 : list) {
            this.memory.remove(str2);
        }
        MethodCollector.m26664o(8554);
    }

    public synchronized Map<String, String> getStringMap(String str) {
        HashMap hashMap;
        MethodCollector.m26663i(9000);
        reloadAll();
        hashMap = new HashMap();
        for (String str2 : this.memory.keySet()) {
            if (str2.startsWith(str)) {
                hashMap.put(str2.substring(str.length()), (String) m56187x19366f1d(this.memory, str2));
            }
        }
        MethodCollector.m26664o(9000);
        return hashMap;
    }

    @Override // com.kakao.util.helper.PersistentKVStore
    public synchronized void save(Bundle bundle) {
        MethodCollector.m26663i(8550);
        Utility.notNull(bundle, "bundle");
        SharedPreferences.Editor edit = this.file.edit();
        for (String str : bundle.keySet()) {
            try {
                serializeKey(str, m56187x19366f1d(bundle, str), edit);
            } catch (JSONException unused) {
                MethodCollector.m26664o(8550);
                return;
            }
        }
        edit.apply();
        for (String str2 : bundle.keySet()) {
            try {
                deserializeKey(str2);
            } catch (JSONException unused2) {
            }
        }
        MethodCollector.m26664o(8550);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v42, resolved type: android.os.Bundle */
    /* JADX WARN: Multi-variable type inference failed */
    private void deserializeKey(String str) {
        JSONObject jSONObject = new JSONObject(this.file.getString(str, "{}"));
        String string = jSONObject.getString("valueType");
        string.hashCode();
        int i = 0;
        char c = 65535;
        switch (string.hashCode()) {
            case -1573317553:
                if (string.equals("stringList")) {
                    c = 0;
                    break;
                }
                break;
            case -1383386164:
                if (string.equals("bool[]")) {
                    c = 1;
                    break;
                }
                break;
            case -1374008726:
                if (string.equals("byte[]")) {
                    c = 2;
                    break;
                }
                break;
            case -1361632968:
                if (string.equals("char[]")) {
                    c = 3;
                    break;
                }
                break;
            case -1325958191:
                if (string.equals("double")) {
                    c = 4;
                    break;
                }
                break;
            case -1097129250:
                if (string.equals("long[]")) {
                    c = 5;
                    break;
                }
                break;
            case -891985903:
                if (string.equals("string")) {
                    c = 6;
                    break;
                }
                break;
            case -766441794:
                if (string.equals("float[]")) {
                    c = 7;
                    break;
                }
                break;
            case 104431:
                if (string.equals("int")) {
                    c = '\b';
                    break;
                }
                break;
            case 3029738:
                if (string.equals("bool")) {
                    c = '\t';
                    break;
                }
                break;
            case 3039496:
                if (string.equals("byte")) {
                    c = '\n';
                    break;
                }
                break;
            case 3052374:
                if (string.equals("char")) {
                    c = 11;
                    break;
                }
                break;
            case 3118337:
                if (string.equals("enum")) {
                    c = '\f';
                    break;
                }
                break;
            case 3327612:
                if (string.equals("long")) {
                    c = '\r';
                    break;
                }
                break;
            case 97526364:
                if (string.equals("float")) {
                    c = 14;
                    break;
                }
                break;
            case 100361105:
                if (string.equals("int[]")) {
                    c = 15;
                    break;
                }
                break;
            case 109413500:
                if (string.equals("short")) {
                    c = 16;
                    break;
                }
                break;
            case 1359468275:
                if (string.equals("double[]")) {
                    c = 17;
                    break;
                }
                break;
            case 2067161310:
                if (string.equals("short[]")) {
                    c = 18;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                JSONArray jSONArray = jSONObject.getJSONArray("value");
                int length = jSONArray.length();
                ArrayList arrayList = new ArrayList(length);
                while (i < length) {
                    Object obj = jSONArray.get(i);
                    if (obj == JSONObject.NULL) {
                        obj = null;
                    }
                    arrayList.add(i, obj);
                    i++;
                }
                this.memory.putStringArrayList(str, arrayList);
                return;
            case 1:
                JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                int length2 = jSONArray2.length();
                boolean[] zArr = new boolean[length2];
                while (i < length2) {
                    zArr[i] = jSONArray2.getBoolean(i);
                    i++;
                }
                this.memory.putBooleanArray(str, zArr);
                return;
            case 2:
                JSONArray jSONArray3 = jSONObject.getJSONArray("value");
                int length3 = jSONArray3.length();
                byte[] bArr = new byte[length3];
                while (i < length3) {
                    bArr[i] = (byte) jSONArray3.getInt(i);
                    i++;
                }
                this.memory.putByteArray(str, bArr);
                return;
            case 3:
                JSONArray jSONArray4 = jSONObject.getJSONArray("value");
                int length4 = jSONArray4.length();
                char[] cArr = new char[length4];
                for (int i2 = 0; i2 < length4; i2++) {
                    String string2 = jSONArray4.getString(i2);
                    if (string2 != null && string2.length() == 1) {
                        cArr[i2] = string2.charAt(0);
                    }
                }
                this.memory.putCharArray(str, cArr);
                return;
            case 4:
                this.memory.putDouble(str, jSONObject.getDouble("value"));
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                JSONArray jSONArray5 = jSONObject.getJSONArray("value");
                int length5 = jSONArray5.length();
                long[] jArr = new long[length5];
                while (i < length5) {
                    jArr[i] = jSONArray5.getLong(i);
                    i++;
                }
                this.memory.putLongArray(str, jArr);
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                this.memory.putString(str, jSONObject.getString("value"));
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                JSONArray jSONArray6 = jSONObject.getJSONArray("value");
                int length6 = jSONArray6.length();
                float[] fArr = new float[length6];
                while (i < length6) {
                    fArr[i] = (float) jSONArray6.getDouble(i);
                    i++;
                }
                this.memory.putFloatArray(str, fArr);
                return;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                this.memory.putInt(str, jSONObject.getInt("value"));
                return;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                this.memory.putBoolean(str, jSONObject.getBoolean("value"));
                return;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                this.memory.putByte(str, (byte) jSONObject.getInt("value"));
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                String string3 = jSONObject.getString("value");
                if (string3 != null && string3.length() == 1) {
                    this.memory.putChar(str, string3.charAt(0));
                    return;
                }
                return;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                try {
                    this.memory.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString("enumType")), jSONObject.getString("value")));
                    return;
                } catch (ClassNotFoundException | IllegalArgumentException e) {
                    Logger.m56205e("SharedPreferences.deserializeKey: Error deserializing key '" + str + "' -- " + e);
                    return;
                }
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                this.memory.putLong(str, jSONObject.getLong("value"));
                return;
            case ABRConfig.ABR_SELECT_SCENE:
                this.memory.putFloat(str, (float) jSONObject.getDouble("value"));
                return;
            case 15:
                JSONArray jSONArray7 = jSONObject.getJSONArray("value");
                int length7 = jSONArray7.length();
                int[] iArr = new int[length7];
                while (i < length7) {
                    iArr[i] = jSONArray7.getInt(i);
                    i++;
                }
                this.memory.putIntArray(str, iArr);
                return;
            case 16:
                this.memory.putShort(str, (short) jSONObject.getInt("value"));
                return;
            case 17:
                JSONArray jSONArray8 = jSONObject.getJSONArray("value");
                int length8 = jSONArray8.length();
                double[] dArr = new double[length8];
                while (i < length8) {
                    dArr[i] = jSONArray8.getDouble(i);
                    i++;
                }
                this.memory.putDoubleArray(str, dArr);
                return;
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                JSONArray jSONArray9 = jSONObject.getJSONArray("value");
                int length9 = jSONArray9.length();
                short[] sArr = new short[length9];
                while (i < length9) {
                    sArr[i] = (short) jSONArray9.getInt(i);
                    i++;
                }
                this.memory.putShortArray(str, sArr);
                return;
            default:
                return;
        }
    }

    /* renamed from: com_kakao_util_helper_SharedPreferencesCache_com_ss_android_ugc_aweme_lancet_IntentLancet_get */
    public static Object m56187x19366f1d(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public SharedPreferencesCache(Context context, String str) {
        Utility.notNull(context, "context");
        Utility.notNull(str, "cacheName");
        Context com_kakao_util_helper_SharedPreferencesCache_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = m56188x48fbee29(context);
        this.file = C34822d.m71158a(com_kakao_util_helper_SharedPreferencesCache_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext != null ? com_kakao_util_helper_SharedPreferencesCache_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext : context, str, 0);
        reloadAll();
    }

    public synchronized void put(String str, Object obj) {
        MethodCollector.m26663i(9001);
        SharedPreferences.Editor edit = this.file.edit();
        try {
            serializeKey(str, obj, edit);
            edit.apply();
            try {
                deserializeKey(str);
                MethodCollector.m26664o(9001);
            } catch (JSONException unused) {
                MethodCollector.m26664o(9001);
            }
        } catch (JSONException unused2) {
            MethodCollector.m26664o(9001);
        }
    }

    private void serializeKey(String str, Object obj, SharedPreferences.Editor editor) {
        String str2;
        if (obj != null) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = null;
            if (obj instanceof Byte) {
                jSONObject.put("value", ((Byte) obj).intValue());
                str2 = "byte";
            } else if (obj instanceof Short) {
                jSONObject.put("value", ((Short) obj).intValue());
                str2 = "short";
            } else if (obj instanceof Integer) {
                jSONObject.put("value", ((Integer) obj).intValue());
                str2 = "int";
            } else if (obj instanceof Long) {
                jSONObject.put("value", ((Long) obj).longValue());
                str2 = "long";
            } else if (obj instanceof Float) {
                jSONObject.put("value", ((Float) obj).doubleValue());
                str2 = "float";
            } else if (obj instanceof Double) {
                jSONObject.put("value", ((Double) obj).doubleValue());
                str2 = "double";
            } else if (obj instanceof Boolean) {
                jSONObject.put("value", ((Boolean) obj).booleanValue());
                str2 = "bool";
            } else if (obj instanceof Character) {
                jSONObject.put("value", obj.toString());
                str2 = "char";
            } else if (obj instanceof String) {
                jSONObject.put("value", obj);
                str2 = "string";
            } else if (obj instanceof Enum) {
                jSONObject.put("value", obj.toString());
                jSONObject.put("enumType", obj.getClass().getName());
                str2 = "enum";
            } else {
                jSONArray = new JSONArray();
                int i = 0;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    while (i < length) {
                        jSONArray.put((int) bArr[i]);
                        i++;
                    }
                    str2 = "byte[]";
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    int length2 = sArr.length;
                    while (i < length2) {
                        jSONArray.put((int) sArr[i]);
                        i++;
                    }
                    str2 = "short[]";
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length3 = iArr.length;
                    while (i < length3) {
                        jSONArray.put(iArr[i]);
                        i++;
                    }
                    str2 = "int[]";
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length4 = jArr.length;
                    while (i < length4) {
                        jSONArray.put(jArr[i]);
                        i++;
                    }
                    str2 = "long[]";
                } else if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    int length5 = fArr.length;
                    while (i < length5) {
                        jSONArray.put((double) fArr[i]);
                        i++;
                    }
                    str2 = "float[]";
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length6 = dArr.length;
                    while (i < length6) {
                        jSONArray.put(dArr[i]);
                        i++;
                    }
                    str2 = "double[]";
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length7 = zArr.length;
                    while (i < length7) {
                        jSONArray.put(zArr[i]);
                        i++;
                    }
                    str2 = "bool[]";
                } else if (obj instanceof char[]) {
                    char[] cArr = (char[]) obj;
                    int length8 = cArr.length;
                    while (i < length8) {
                        jSONArray.put(String.valueOf(cArr[i]));
                        i++;
                    }
                    str2 = "char[]";
                } else if (obj instanceof List) {
                    for (Object obj2 : (List) obj) {
                        if (obj2 == null) {
                            obj2 = JSONObject.NULL;
                        }
                        jSONArray.put(obj2);
                    }
                    str2 = "stringList";
                } else {
                    return;
                }
            }
            jSONObject.put("valueType", str2);
            if (jSONArray != null) {
                jSONObject.putOpt("value", jSONArray);
            }
            editor.putString(str, jSONObject.toString());
        }
    }
}
