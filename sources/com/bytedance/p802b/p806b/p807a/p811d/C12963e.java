package com.bytedance.p802b.p806b.p807a.p811d;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p806b.p807a.AbstractC12976g;
import com.bytedance.p802b.p806b.p807a.C12927a;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p834j.C13104c;
import com.bytedance.p802b.p841k.C13122d;
import com.bytedance.p802b.p841k.C13129e;
import com.bytedance.p802b.p841k.p843b.C13118b;
import com.bytedance.services.apm.api.C22710c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.b.a.d.e */
public final class C12963e {

    /* renamed from: f */
    private static HashMap<AbstractC12964f, C12963e> f31579f = new HashMap<>();

    /* renamed from: a */
    private String f31580a;

    /* renamed from: b */
    private volatile boolean f31581b;

    /* renamed from: c */
    private int f31582c;

    /* renamed from: d */
    private String f31583d;

    /* renamed from: e */
    private Boolean f31584e;

    /* renamed from: g */
    private List<String> f31585g;

    static {
        Covode.recordClassIndex(14799);
    }

    /* renamed from: a */
    private String m23269a() {
        List<String> list = this.f31585g;
        if (!TextUtils.isEmpty(this.f31580a)) {
            if (list != null && list.size() > 0) {
                try {
                    return "https://" + this.f31580a + new URL(list.get(0)).getPath();
                } catch (Throwable unused) {
                }
            }
            return null;
        } else if (!TextUtils.isEmpty(this.f31583d)) {
            return this.f31583d;
        } else {
            if (this.f31581b) {
                this.f31582c++;
            }
            int size = list.size();
            int i = this.f31582c;
            if (size > i && i >= 0) {
                return list.get(i);
            }
            this.f31582c = 0;
            return list.get(0);
        }
    }

    private C12963e(AbstractC12964f fVar) {
        this.f31585g = fVar.mo20824b();
    }

    /* renamed from: a */
    public static C12963e m23268a(AbstractC12964f fVar) {
        if (f31579f.containsKey(fVar)) {
            return f31579f.get(fVar);
        }
        f31579f.put(fVar, new C12963e(fVar));
        return f31579f.get(fVar);
    }

    /* renamed from: b */
    private static byte[] m23272b(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                C13122d.m23595a(gZIPOutputStream);
                return byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                C13122d.m23595a(gZIPOutputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream2 = gZIPOutputStream;
                C13122d.m23595a(gZIPOutputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            gZIPOutputStream = null;
            C13122d.m23595a(gZIPOutputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C13122d.m23595a(gZIPOutputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    private static JSONObject m23271a(C22710c cVar) {
        String str;
        AbstractC12976g gVar;
        try {
            JSONObject jSONObject = new JSONObject(new String(cVar.f53674c));
            Map<String, String> map = cVar.f53673b;
            if (map == null || map.isEmpty()) {
                str = null;
            } else {
                str = map.get("ran");
            }
            boolean z = true;
            try {
                String optString = jSONObject.optString("data");
                if (!optString.isEmpty()) {
                    if (!TextUtils.isEmpty(str)) {
                        String a = m23270a(optString.getBytes(), str);
                        jSONObject = new JSONObject(a);
                        z = true ^ TextUtils.isEmpty(a);
                    } else {
                        jSONObject = new JSONObject(new String(optString.getBytes()));
                    }
                }
                if (!C13129e.m23602a(jSONObject)) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("configs");
                    if (!C13129e.m23602a(optJSONObject) && (gVar = (AbstractC12976g) C13104c.m23566a(AbstractC12976g.class)) != null) {
                        gVar.mo20762a(optJSONObject);
                    }
                }
                if (z) {
                    return jSONObject;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "success");
                return jSONObject2;
            } catch (Throwable unused) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("message", "success");
                return jSONObject3;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6 A[Catch:{ all -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b2 A[Catch:{ all -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0116 A[Catch:{ all -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012c A[Catch:{ all -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0138 A[Catch:{ all -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0142 A[Catch:{ all -> 0x022f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20821a(byte[] r13) {
        /*
        // Method dump skipped, instructions count: 568
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p802b.p806b.p807a.p811d.C12963e.mo20821a(byte[]):boolean");
    }

    /* renamed from: a */
    private static String m23270a(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/NoPadding");
            instance.init(2, secretKeySpec);
            String str2 = new String(instance.doFinal(Base64.decode(bArr, 0)));
            int indexOf = str2.indexOf("$");
            if (indexOf != -1) {
                return str2.substring(0, indexOf);
            }
            return str2;
        } catch (Throwable th) {
            if (C13037a.m23579r()) {
                C13118b.m23587a(C12927a.f31456a, "decodeData", th);
            }
            return "";
        }
    }
}
