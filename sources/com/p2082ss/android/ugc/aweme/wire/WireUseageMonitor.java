package com.p2082ss.android.ugc.aweme.wire;

import android.util.Log;
import com.C1764a;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.wire.WireUseageMonitor */
public class WireUseageMonitor {
    private static final Set<C81660a> DEDUPLICATE_SET = new HashSet();

    /* renamed from: com_ss_android_ugc_aweme_wire_WireUseageMonitor_com_ss_android_ugc_aweme_lancet_LogLancet_v */
    public static int m141530x7598e0e0(String str, String str2) {
        return 0;
    }

    static {
        Covode.recordClassIndex(95063);
    }

    private static String getStackTrace() {
        return Log.getStackTraceString(new Throwable());
    }

    /* renamed from: com.ss.android.ugc.aweme.wire.WireUseageMonitor$a */
    static class C81660a {

        /* renamed from: a */
        private String f182594a;

        /* renamed from: b */
        private String f182595b;

        static {
            Covode.recordClassIndex(95064);
        }

        public final int hashCode() {
            int hashCode;
            String str = this.f182594a;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            String str2 = this.f182595b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            C81660a aVar = (C81660a) obj;
            String str = this.f182594a;
            if (str != null ? str.equals(aVar.f182594a) : aVar.f182594a == null) {
                String str2 = this.f182595b;
                String str3 = aVar.f182595b;
                if (str2 == null) {
                    if (str3 == null) {
                        return true;
                    }
                } else if (str2.equals(str3)) {
                    return true;
                }
            }
            return false;
        }

        private C81660a(String str, String str2) {
            this.f182594a = str;
            this.f182595b = str2;
        }

        /* synthetic */ C81660a(String str, String str2, byte b) {
            this(str, str2);
        }
    }

    public static void upload(String str, String str2) {
        C81660a aVar = new C81660a(str, str2, (byte) 0);
        Set<C81660a> set = DEDUPLICATE_SET;
        if (!set.contains(aVar)) {
            set.add(aVar);
            m141530x7598e0e0("wire_usage_monitor", C1764a.m5928a("find useage of %s.%s\n stacktarce: %s", new Object[]{str, str2, getStackTrace()}));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("class_name", str);
                jSONObject.put("method_name", str2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C12290b.m22060a("wire_usage_monitor", 1, jSONObject);
        }
    }
}
