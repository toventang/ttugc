package com.p2082ss.android.ugc.aweme.p2359ay;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1833e.AbstractC24101c;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ay.d */
public final class C34369d implements AbstractC24101c {

    /* renamed from: a */
    public static final C34369d f81252a = new C34369d();

    /* renamed from: b */
    public String f81253b = "unknown";

    /* renamed from: c */
    private int f81254c = 5;

    static {
        Covode.recordClassIndex(41313);
    }

    private C34369d() {
    }

    @Override // com.facebook.common.p1833e.AbstractC24101c
    /* renamed from: a */
    public final void mo39651a(int i) {
        this.f81254c = i;
    }

    @Override // com.facebook.common.p1833e.AbstractC24101c
    /* renamed from: b */
    public final boolean mo39656b(int i) {
        if (this.f81254c <= i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m70326a(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m70327a(Throwable th) {
        if (th == null || th.getMessage() == null || th.getMessage().length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static String m70328b(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            return stringWriter.toString();
        } finally {
            printWriter.close();
        }
    }

    @Override // com.facebook.common.p1833e.AbstractC24101c
    /* renamed from: b */
    public final void mo39654b(String str, String str2) {
        m70330f(str, str2);
    }

    @Override // com.facebook.common.p1833e.AbstractC24101c
    /* renamed from: c */
    public final void mo39657c(String str, String str2) {
        m70330f(str, str2);
    }

    @Override // com.facebook.common.p1833e.AbstractC24101c
    /* renamed from: e */
    public final void mo39661e(String str, String str2) {
        m70330f(str, str2);
    }

    @Override // com.facebook.common.p1833e.AbstractC24101c
    /* renamed from: a */
    public final void mo39652a(String str, String str2) {
        m70330f(str, str2);
    }

    /* renamed from: f */
    private static void m70330f(String str, String str2) {
        if (!m70326a(str)) {
            m70326a(str2);
        }
    }

    @Override // com.facebook.common.p1833e.AbstractC24101c
    /* renamed from: d */
    public final void mo39659d(String str, String str2) {
        if (str2 != null) {
            if (str2.contains("init FrescoTTNetFetcher")) {
                C51423a.m95787a("init FrescoTTNetFetcher " + Log.getStackTraceString(new Throwable()));
            }
            if (str2.contains("Fresco has already been initialized!")) {
                C51423a.m95787a("Fresco has already been initialized! " + Log.getStackTraceString(new Throwable()));
            }
        }
        m70330f(str, str2);
    }

    @Override // com.facebook.common.p1833e.AbstractC24101c
    /* renamed from: d */
    public final void mo39660d(String str, String str2, Throwable th) {
        m70329e(str, str2, th);
    }

    /* renamed from: e */
    private static void m70329e(String str, String str2, Throwable th) {
        if (!m70326a(str) && !m70326a(str2)) {
            m70327a(th);
        }
    }

    @Override // com.facebook.common.p1833e.AbstractC24101c
    /* renamed from: c */
    public final void mo39658c(String str, String str2, Throwable th) {
        m70329e(str, str2, th);
        if (str2 != null && str2.contains("Malformed escape pair")) {
            C51423a.m95787a("ImageEncryptUtils failed:".concat(String.valueOf(str2)));
        }
    }

    @Override // com.facebook.common.p1833e.AbstractC24101c
    /* renamed from: a */
    public final void mo39653a(String str, String str2, Throwable th) {
        m70329e(str, str2, th);
    }

    @Override // com.facebook.common.p1833e.AbstractC24101c
    /* renamed from: b */
    public final void mo39655b(String str, String str2, Throwable th) {
        m70329e(str, str2, th);
        if (th instanceof IllegalStateException) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!m70326a(str2)) {
                    jSONObject.put("errorField", str2);
                }
                jSONObject.put("errorDesc", m70328b(th));
                jSONObject.put("status", 1);
                C34611o.m70668a("aweme_image_error_log", jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
