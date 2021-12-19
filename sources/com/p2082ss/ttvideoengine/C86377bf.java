package com.p2082ss.ttvideoengine;

import android.os.SystemClock;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ttvideoengine.p4417j.C86535p;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.ttvideoengine.bf */
public class C86377bf {

    /* renamed from: a */
    private static C86377bf f193508a;

    /* renamed from: b */
    private static int f193509b = -1;

    /* renamed from: c */
    private static int f193510c = 100;

    /* renamed from: d */
    private ConcurrentHashMap<String, C86378a> f193511d = new ConcurrentHashMap<>();

    /* renamed from: com.ss.ttvideoengine.bf$a */
    public static class C86378a {

        /* renamed from: a */
        public C86535p f193512a;

        /* renamed from: b */
        public long f193513b;

        /* renamed from: c */
        public boolean f193514c;

        static {
            Covode.recordClassIndex(101606);
        }
    }

    static {
        Covode.recordClassIndex(101605);
    }

    /* renamed from: a */
    public static C86377bf m148936a() {
        MethodCollector.m26663i(2769);
        if (f193508a == null) {
            synchronized (C86377bf.class) {
                try {
                    if (f193508a == null) {
                        f193508a = new C86377bf();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2769);
                    throw th;
                }
            }
        }
        C86377bf bfVar = f193508a;
        MethodCollector.m26664o(2769);
        return bfVar;
    }

    /* renamed from: a */
    public static void m148937a(int i) {
        f193509b = i;
    }

    /* renamed from: b */
    public static void m148938b(int i) {
        f193510c = i;
    }

    /* renamed from: b */
    public final synchronized void mo137345b(String str, String str2) {
        MethodCollector.m26663i(2947);
        if (this.f193511d != null) {
            String c = m148939c(str, str2);
            if (TextUtils.isEmpty(c)) {
                MethodCollector.m26664o(2947);
                return;
            }
            this.f193511d.remove(c);
        }
        MethodCollector.m26664o(2947);
    }

    /* renamed from: a */
    public final synchronized C86378a mo137342a(String str, String str2) {
        MethodCollector.m26663i(2945);
        if (this.f193511d != null) {
            String c = m148939c(str, str2);
            if (TextUtils.isEmpty(c)) {
                MethodCollector.m26664o(2945);
                return null;
            }
            C86378a aVar = this.f193511d.get(c);
            if (aVar != null) {
                int i = f193509b;
                if (i <= 0) {
                    if (aVar.f193512a != null) {
                        i = (aVar.f193512a.mo137734a(3) + 3600) - 300;
                    } else {
                        i = 3600;
                    }
                }
                if (SystemClock.elapsedRealtime() - aVar.f193513b > ((long) (i * 1000))) {
                    aVar.f193514c = true;
                } else {
                    aVar.f193514c = false;
                }
                MethodCollector.m26664o(2945);
                return aVar;
            }
        }
        MethodCollector.m26664o(2945);
        return null;
    }

    /* renamed from: c */
    private static String m148939c(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        String str8 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String[] split = str2.split("[?]");
        if (split.length >= 2) {
            String[] split2 = split[1].split("&");
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            for (String str9 : split2) {
                if (str9.indexOf("codec_type") == 0) {
                    str8 = str9.substring(11);
                } else if (str9.indexOf("CodecType") == 0) {
                    str8 = str9.substring(10);
                } else if (str9.indexOf("Codec") == 0) {
                    str8 = str9.substring(6);
                } else if (str9.indexOf("format_type") == 0) {
                    str3 = str9.substring(12);
                } else if (str9.indexOf("FormatType") == 0) {
                    str3 = str9.substring(11);
                } else if (str9.indexOf("Format") == 0) {
                    str3 = str9.substring(7);
                } else if (str9.indexOf("ptoken") == 0) {
                    str4 = str9.substring(7);
                } else if (str9.indexOf("PToken") == 0) {
                    str4 = str9.substring(7);
                } else if (str9.indexOf("ssl") == 0) {
                    str5 = str9.substring(4);
                } else if (str9.indexOf("Ssl") == 0) {
                    str5 = str9.substring(4);
                } else if (str9.indexOf("HDRDefinition") == 0) {
                    str6 = str9.substring(14);
                } else if (str9.indexOf("FileType") == 0) {
                    str7 = str9.substring(9);
                }
            }
        } else {
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
        }
        sb.append(str);
        if (!TextUtils.isEmpty(str8)) {
            sb.append(C1764a.m5928a("/%s", new Object[]{str8}));
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(C1764a.m5928a("/%s", new Object[]{str3}));
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append(C1764a.m5928a("/%s", new Object[]{str4}));
        }
        if (!TextUtils.isEmpty(str5)) {
            sb.append(C1764a.m5928a("/%s", new Object[]{str5}));
        }
        if (!TextUtils.isEmpty(str6)) {
            sb.append(C1764a.m5928a("/%s", new Object[]{"hdr_".concat(String.valueOf(str6))}));
        }
        if (!TextUtils.isEmpty(str7)) {
            sb.append(C1764a.m5928a("/%s", new Object[]{str7}));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final synchronized void mo137343a(String str, String str2, C86378a aVar) {
        MethodCollector.m26663i(2862);
        String c = m148939c(str, str2);
        if (TextUtils.isEmpty(c)) {
            MethodCollector.m26664o(2862);
            return;
        }
        this.f193511d.put(c, aVar);
        if (this.f193511d.size() > f193510c) {
            long j = Long.MAX_VALUE;
            String str3 = null;
            for (Map.Entry<String, C86378a> entry : this.f193511d.entrySet()) {
                C86378a value = entry.getValue();
                if (value.f193513b < j) {
                    j = value.f193513b;
                    str3 = entry.getKey();
                }
            }
            if (str3 != null) {
                this.f193511d.remove(str3);
            }
        }
        MethodCollector.m26664o(2862);
    }

    /* renamed from: a */
    public final synchronized void mo137344a(String str, String str2, C86535p pVar) {
        MethodCollector.m26663i(2780);
        if (!(this.f193511d == null || str == null)) {
            if (str2 != null) {
                C86378a aVar = new C86378a();
                aVar.f193512a = pVar;
                aVar.f193513b = SystemClock.elapsedRealtime();
                mo137343a(str, str2, aVar);
                MethodCollector.m26664o(2780);
                return;
            }
        }
        MethodCollector.m26664o(2780);
    }
}
