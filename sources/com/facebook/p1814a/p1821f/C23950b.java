package com.facebook.p1814a.p1821f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.p1821f.C23953c;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.a.f.b */
public final class C23950b {

    /* renamed from: a */
    private C23949a f56696a;

    /* renamed from: b */
    private C23949a f56697b;

    /* renamed from: c */
    private C23949a f56698c;

    /* renamed from: d */
    private C23949a f56699d;

    /* renamed from: e */
    private C23949a f56700e;

    /* renamed from: f */
    private C23949a f56701f;

    /* renamed from: g */
    private C23949a f56702g;

    /* renamed from: h */
    private C23949a f56703h;

    /* renamed from: i */
    private C23949a f56704i;

    /* renamed from: j */
    private C23949a f56705j;

    /* renamed from: k */
    private C23949a f56706k;

    /* renamed from: l */
    private final Map<String, C23949a> f56707l = new HashMap();

    static {
        Covode.recordClassIndex(28071);
    }

    /* renamed from: a */
    private static Map<String, String> m45279a() {
        if (C24677a.m47209a(C23950b.class)) {
            return null;
        }
        try {
            return new HashMap<String, String>() {
                /* class com.facebook.p1814a.p1821f.C23950b.C239522 */

                static {
                    Covode.recordClassIndex(28073);
                }

                {
                    put("embedding.weight", "embed.weight");
                    put("dense1.weight", "fc1.weight");
                    put("dense2.weight", "fc2.weight");
                    put("dense3.weight", "fc3.weight");
                    put("dense1.bias", "fc1.bias");
                    put("dense2.bias", "fc2.bias");
                    put("dense3.bias", "fc3.bias");
                }
            };
        } catch (Throwable th) {
            C24677a.m47208a(th, C23950b.class);
            return null;
        }
    }

    /* renamed from: a */
    public static C23950b m45278a(File file) {
        if (C24677a.m47209a(C23950b.class)) {
            return null;
        }
        try {
            try {
                return new C23950b(m45280b(file));
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            C24677a.m47208a(th, C23950b.class);
            return null;
        }
    }

    private C23950b(Map<String, C23949a> map) {
        this.f56696a = map.get("embed.weight");
        this.f56697b = C23962d.m45313e(map.get("convs.0.weight"));
        this.f56698c = C23962d.m45313e(map.get("convs.1.weight"));
        this.f56699d = C23962d.m45313e(map.get("convs.2.weight"));
        this.f56700e = map.get("convs.0.bias");
        this.f56701f = map.get("convs.1.bias");
        this.f56702g = map.get("convs.2.bias");
        this.f56703h = C23962d.m45312d(map.get("fc1.weight"));
        this.f56704i = C23962d.m45312d(map.get("fc2.weight"));
        this.f56705j = map.get("fc1.bias");
        this.f56706k = map.get("fc2.bias");
        for (String str : new HashSet<String>() {
            /* class com.facebook.p1814a.p1821f.C23950b.C239511 */

            static {
                Covode.recordClassIndex(28072);
            }

            {
                add(C23953c.EnumC23958a.MTML_INTEGRITY_DETECT.toKey());
                add(C23953c.EnumC23958a.MTML_APP_EVENT_PREDICTION.toKey());
            }
        }) {
            String str2 = str + ".weight";
            String str3 = str + ".bias";
            C23949a aVar = map.get(str2);
            C23949a aVar2 = map.get(str3);
            if (aVar != null) {
                this.f56707l.put(str2, C23962d.m45312d(aVar));
            }
            if (aVar2 != null) {
                this.f56707l.put(str3, aVar2);
            }
        }
    }

    /* renamed from: b */
    private static Map<String, C23949a> m45280b(File file) {
        Throwable th;
        int i = 7977;
        MethodCollector.m26663i(7977);
        Map<String, C23949a> map = null;
        if (C24677a.m47209a(C23950b.class)) {
            MethodCollector.m26664o(7977);
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int available = fileInputStream.available();
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            byte[] bArr = new byte[available];
            dataInputStream.readFully(bArr);
            dataInputStream.close();
            if (available < 4) {
                try {
                    MethodCollector.m26664o(7977);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    C24677a.m47208a(th, C23950b.class);
                    MethodCollector.m26664o(i);
                    return map;
                }
            } else {
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                int i2 = wrap.getInt();
                int i3 = i2 + 4;
                if (available < i3) {
                    MethodCollector.m26664o(7977);
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i2));
                JSONArray names = jSONObject.names();
                int length = names.length();
                String[] strArr = new String[length];
                for (int i4 = 0; i4 < length; i4++) {
                    strArr[i4] = names.getString(i4);
                }
                Arrays.sort(strArr);
                HashMap hashMap = new HashMap();
                Map<String, String> a = m45279a();
                int i5 = 0;
                while (i5 < length) {
                    String str = strArr[i5];
                    JSONArray jSONArray = jSONObject.getJSONArray(str);
                    int length2 = jSONArray.length();
                    int[] iArr = new int[length2];
                    int i6 = 1;
                    for (int i7 = 0; i7 < length2; i7++) {
                        try {
                            iArr[i7] = jSONArray.getInt(i7);
                            i6 *= iArr[i7];
                        } catch (Exception unused) {
                            i = 7977;
                            MethodCollector.m26664o(i);
                            return null;
                        } catch (Throwable th3) {
                            th = th3;
                            i = 7977;
                            map = null;
                            C24677a.m47208a(th, C23950b.class);
                            MethodCollector.m26664o(i);
                            return map;
                        }
                    }
                    int i8 = i6 * 4;
                    int i9 = i3 + i8;
                    if (i9 > available) {
                        i = 7977;
                        try {
                            MethodCollector.m26664o(7977);
                            return null;
                        } catch (Throwable th4) {
                            th = th4;
                            map = null;
                            C24677a.m47208a(th, C23950b.class);
                            MethodCollector.m26664o(i);
                            return map;
                        }
                    } else {
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i3, i8);
                        wrap2.order(ByteOrder.LITTLE_ENDIAN);
                        C23949a aVar = new C23949a(iArr);
                        wrap2.asFloatBuffer().get(aVar.f56693a, 0, i6);
                        if (a.containsKey(str)) {
                            str = a.get(str);
                        }
                        hashMap.put(str, aVar);
                        i5++;
                        i3 = i9;
                        i = 7977;
                    }
                }
                MethodCollector.m26664o(i);
                return hashMap;
            }
        } catch (Exception unused2) {
            MethodCollector.m26664o(i);
            return null;
        }
    }

    /* renamed from: a */
    public final C23949a mo39449a(C23949a aVar, String[] strArr, String str) {
        if (C24677a.m47209a(this)) {
            return null;
        }
        try {
            C23949a b = C23962d.m45308b(C23962d.m45305a(strArr, this.f56696a), this.f56697b);
            C23962d.m45307a(b, this.f56700e);
            C23962d.m45306a(b);
            C23949a b2 = C23962d.m45308b(b, this.f56698c);
            C23962d.m45307a(b2, this.f56701f);
            C23962d.m45306a(b2);
            C23949a a = C23962d.m45302a(b2, 2);
            C23949a b3 = C23962d.m45308b(a, this.f56699d);
            C23962d.m45307a(b3, this.f56702g);
            C23962d.m45306a(b3);
            C23949a a2 = C23962d.m45302a(b, b.f56694b[1]);
            C23949a a3 = C23962d.m45302a(a, a.f56694b[1]);
            C23949a a4 = C23962d.m45302a(b3, b3.f56694b[1]);
            C23962d.m45309b(a2);
            C23962d.m45309b(a3);
            C23962d.m45309b(a4);
            C23949a a5 = C23962d.m45303a(C23962d.m45304a(new C23949a[]{a2, a3, a4, aVar}), this.f56703h, this.f56705j);
            C23962d.m45306a(a5);
            C23949a a6 = C23962d.m45303a(a5, this.f56704i, this.f56706k);
            C23962d.m45306a(a6);
            C23949a aVar2 = this.f56707l.get(str + ".weight");
            C23949a aVar3 = this.f56707l.get(str + ".bias");
            if (aVar2 == null || aVar3 == null) {
                return null;
            }
            C23949a a7 = C23962d.m45303a(a6, aVar2, aVar3);
            C23962d.m45311c(a7);
            return a7;
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return null;
        }
    }
}
