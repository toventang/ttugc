package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.C24783w;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.facebook.t */
public final class C25028t {

    /* renamed from: a */
    private static final String f59368a = C25028t.class.getSimpleName();

    /* renamed from: b */
    private String f59369b;

    /* renamed from: c */
    private SharedPreferences f59370c;

    static {
        Covode.recordClassIndex(30360);
    }

    /* renamed from: b */
    public final void mo40918b() {
        this.f59370c.edit().clear().apply();
    }

    /* renamed from: a */
    public final Bundle mo40917a() {
        Bundle bundle = new Bundle();
        for (String str : this.f59370c.getAll().keySet()) {
            try {
                m47991a(str, bundle);
            } catch (JSONException e) {
                C24783w.m47440a(EnumC25029u.CACHE, f59368a, "Error reading cached value for key: '" + str + "' -- " + e);
                return null;
            }
        }
        return bundle;
    }

    public C25028t(Context context) {
        this(context, (byte) 0);
    }

    /* renamed from: a */
    static Date m47990a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j == Long.MIN_VALUE) {
            return null;
        }
        return new Date(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r1 != null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C25028t(android.content.Context r3, byte r4) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "context"
            com.facebook.internal.C24699ae.m47301a(r3, r0)
            r1 = 0
            boolean r0 = com.facebook.internal.C24693ad.m47261a(r1)
            if (r0 == 0) goto L_0x0011
            java.lang.String r1 = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY"
        L_0x0011:
            r2.f59369b = r1
            android.content.Context r1 = r3.getApplicationContext()
            boolean r0 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132201c
            if (r0 != 0) goto L_0x0028
        L_0x001b:
            if (r1 == 0) goto L_0x001e
        L_0x001d:
            r3 = r1
        L_0x001e:
            java.lang.String r1 = r2.f59369b
            r0 = 0
            android.content.SharedPreferences r0 = com.p2082ss.android.ugc.aweme.p2387bf.C34822d.m71158a(r3, r1, r0)
            r2.f59370c = r0
            return
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x001d
        L_0x002b:
            android.app.Application r1 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132199a
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C25028t.<init>(android.content.Context, byte):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: android.os.Bundle */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m47991a(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject(this.f59370c.getString(str, "{}"));
        String string = jSONObject.getString("valueType");
        if (string.equals("bool")) {
            bundle.putBoolean(str, jSONObject.getBoolean("value"));
            return;
        }
        int i = 0;
        if (string.equals("bool[]")) {
            JSONArray jSONArray = jSONObject.getJSONArray("value");
            int length = jSONArray.length();
            boolean[] zArr = new boolean[length];
            while (i < length) {
                zArr[i] = jSONArray.getBoolean(i);
                i++;
            }
            bundle.putBooleanArray(str, zArr);
        } else if (string.equals("byte")) {
            bundle.putByte(str, (byte) jSONObject.getInt("value"));
        } else if (string.equals("byte[]")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("value");
            int length2 = jSONArray2.length();
            byte[] bArr = new byte[length2];
            while (i < length2) {
                bArr[i] = (byte) jSONArray2.getInt(i);
                i++;
            }
            bundle.putByteArray(str, bArr);
        } else if (string.equals("short")) {
            bundle.putShort(str, (short) jSONObject.getInt("value"));
        } else if (string.equals("short[]")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("value");
            int length3 = jSONArray3.length();
            short[] sArr = new short[length3];
            while (i < length3) {
                sArr[i] = (short) jSONArray3.getInt(i);
                i++;
            }
            bundle.putShortArray(str, sArr);
        } else if (string.equals("int")) {
            bundle.putInt(str, jSONObject.getInt("value"));
        } else if (string.equals("int[]")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("value");
            int length4 = jSONArray4.length();
            int[] iArr = new int[length4];
            while (i < length4) {
                iArr[i] = jSONArray4.getInt(i);
                i++;
            }
            bundle.putIntArray(str, iArr);
        } else if (string.equals("long")) {
            bundle.putLong(str, jSONObject.getLong("value"));
        } else if (string.equals("long[]")) {
            JSONArray jSONArray5 = jSONObject.getJSONArray("value");
            int length5 = jSONArray5.length();
            long[] jArr = new long[length5];
            while (i < length5) {
                jArr[i] = jSONArray5.getLong(i);
                i++;
            }
            bundle.putLongArray(str, jArr);
        } else if (string.equals("float")) {
            bundle.putFloat(str, (float) jSONObject.getDouble("value"));
        } else if (string.equals("float[]")) {
            JSONArray jSONArray6 = jSONObject.getJSONArray("value");
            int length6 = jSONArray6.length();
            float[] fArr = new float[length6];
            while (i < length6) {
                fArr[i] = (float) jSONArray6.getDouble(i);
                i++;
            }
            bundle.putFloatArray(str, fArr);
        } else if (string.equals("double")) {
            bundle.putDouble(str, jSONObject.getDouble("value"));
        } else if (string.equals("double[]")) {
            JSONArray jSONArray7 = jSONObject.getJSONArray("value");
            int length7 = jSONArray7.length();
            double[] dArr = new double[length7];
            while (i < length7) {
                dArr[i] = jSONArray7.getDouble(i);
                i++;
            }
            bundle.putDoubleArray(str, dArr);
        } else if (string.equals("char")) {
            String string2 = jSONObject.getString("value");
            if (string2 != null && string2.length() == 1) {
                bundle.putChar(str, string2.charAt(0));
            }
        } else if (string.equals("char[]")) {
            JSONArray jSONArray8 = jSONObject.getJSONArray("value");
            int length8 = jSONArray8.length();
            char[] cArr = new char[length8];
            for (int i2 = 0; i2 < length8; i2++) {
                String string3 = jSONArray8.getString(i2);
                if (string3 != null && string3.length() == 1) {
                    cArr[i2] = string3.charAt(0);
                }
            }
            bundle.putCharArray(str, cArr);
        } else if (string.equals("string")) {
            bundle.putString(str, jSONObject.getString("value"));
        } else if (string.equals("stringList")) {
            JSONArray jSONArray9 = jSONObject.getJSONArray("value");
            int length9 = jSONArray9.length();
            ArrayList arrayList = new ArrayList(length9);
            while (i < length9) {
                Object obj = jSONArray9.get(i);
                if (obj == JSONObject.NULL) {
                    obj = null;
                }
                arrayList.add(i, obj);
                i++;
            }
            bundle.putStringArrayList(str, arrayList);
        } else if (string.equals("enum")) {
            try {
                bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString("enumType")), jSONObject.getString("value")));
            } catch (ClassNotFoundException | IllegalArgumentException unused) {
            }
        }
    }
}
