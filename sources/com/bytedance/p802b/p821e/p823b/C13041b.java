package com.bytedance.p802b.p821e.p823b;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p821e.p822a.AbstractC13038b;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p834j.p837c.C13105a;
import com.bytedance.p802b.p841k.C13122d;
import com.bytedance.p802b.p841k.C13129e;
import com.bytedance.p802b.p841k.C13135k;
import com.bytedance.p802b.p841k.p845d.AbstractRunnableC13123a;
import com.bytedance.p802b.p841k.p845d.C13124b;
import com.bytedance.p802b.p841k.p845d.EnumC13126c;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.e.b.b */
public final class C13041b {

    /* renamed from: a */
    public static boolean f31834a = true;

    /* renamed from: b */
    public static String f31835b;

    /* renamed from: c */
    private static AtomicInteger f31836c = new AtomicInteger(0);

    /* renamed from: a */
    public static boolean m23468a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(14877);
    }

    /* renamed from: a */
    private static byte[] m23469a(byte[] bArr) {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream2.write(bArr);
                C13122d.m23595a(gZIPOutputStream2);
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = gZIPOutputStream2;
                C13122d.m23595a(gZIPOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            C13122d.m23595a(gZIPOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    static C13105a m23466a(String str, byte[] bArr) {
        HashMap hashMap = new HashMap();
        if (bArr.length > 128) {
            try {
                byte[] a = m23469a(bArr);
                hashMap.put("Content-Encoding", "gzip");
                bArr = a;
            } catch (IOException unused) {
            }
        }
        return new C13105a(C13135k.m23623a(str, C13037a.m23449q()), hashMap, bArr);
    }

    /* renamed from: a */
    static void m23467a(final String str, final String str2, final Throwable th) {
        if (f31834a && f31836c.get() < 3) {
            f31836c.incrementAndGet();
            C13124b.m23597a(EnumC13126c.IO).mo20943a(new AbstractRunnableC13123a() {
                /* class com.bytedance.p802b.p821e.p823b.C13041b.C130421 */

                static {
                    Covode.recordClassIndex(14878);
                }

                public final void run() {
                    String str = str;
                    String str2 = str2;
                    C13040a aVar = new C13040a("tag=" + str + " message=" + str2, th);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("event_type", "exception");
                        jSONObject.put("timestamp", System.currentTimeMillis());
                        StringWriter stringWriter = new StringWriter();
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        aVar.printStackTrace(printWriter);
                        Throwable cause = aVar.getCause();
                        if (cause != null) {
                            cause.printStackTrace(printWriter);
                            Throwable cause2 = cause.getCause();
                            if (cause2 != null) {
                                cause2.printStackTrace(printWriter);
                            }
                        }
                        String stringWriter2 = stringWriter.toString();
                        printWriter.close();
                        jSONObject.put("stack", stringWriter2);
                        jSONObject.put("exception_type", 1);
                        jSONObject.put("message", str + "_" + str2);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("apm_sdk", "apm6_error");
                        jSONObject2.put("host_aid", String.valueOf(C13037a.m23437e()));
                        jSONObject.put("filters", jSONObject2);
                        JSONObject jSONObject3 = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(jSONObject);
                        jSONObject3.put("data", jSONArray);
                        JSONObject jSONObject4 = new JSONObject();
                        C13129e.m23601a(jSONObject4, C13037a.m23445m());
                        AbstractC13038b bVar = C13037a.f31819a;
                        if (bVar != null) {
                            C13129e.m23601a(jSONObject4, bVar.mo20755r());
                        }
                        jSONObject4.put("os", "Android");
                        jSONObject4.put("aid", 2085);
                        jSONObject4.put("device_id", C13037a.m23446n());
                        jSONObject4.put("channel", C13037a.m23438f());
                        jSONObject4.put("version_code", C13037a.m23441i());
                        jSONObject4.put("update_version_code", C13037a.m23439g());
                        jSONObject4.put("device_id", C13037a.m23446n());
                        jSONObject4.put("uid", C13037a.m23448p());
                        jSONObject4.put("process_name", C13037a.m23436d());
                        jSONObject3.put("header", jSONObject4);
                        String str3 = C13041b.f31835b;
                        byte[] bytes = jSONObject3.toString().getBytes();
                        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                            C58029j.f132253e = C13041b.m23468a();
                        }
                        if (C58029j.f132253e && bytes != null) {
                            if (bytes.length != 0) {
                                C13105a a = C13041b.m23466a(str3, bytes);
                                C13037a.m23433a(a.f31947a, a.f31948b, a.f31949c);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
