package com.bytedance.ammt.mmt;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.entity.C13864b;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.p932j.C13907f;
import com.bytedance.crash.util.C14061m;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ammt.mmt.c */
public final class C2572c {

    /* renamed from: a */
    public static String f7739a = "UploadManager";

    /* renamed from: b */
    public static int f7740b = 88888;

    /* renamed from: c */
    public static String f7741c;

    /* renamed from: d */
    public static String f7742d;

    /* renamed from: e */
    private static String f7743e = "tombstone.txt";

    /* renamed from: f */
    private static String f7744f = "logcat.txt";

    static {
        Covode.recordClassIndex(2957);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ammt.mmt.c$a */
    public static class C2574a {
        static {
            Covode.recordClassIndex(2959);
        }

        /* renamed from: a */
        public static void m7510a() {
            File file = new File(C2572c.f7742d);
            if (file.exists()) {
                m7512a(file);
            }
            File file2 = new File(C2572c.f7741c);
            if (file2.exists()) {
                m7512a(file2);
            }
        }

        /* renamed from: a */
        public static Header m7508a(Context context) {
            Header a = Header.m25037a(context);
            Header.addRuntimeHeader(a.f33753a);
            Header.m25039a(a);
            a.mo22330a(C13933m.m25221a().mo22518a());
            C13933m.m25226b().mo22549a();
            a.mo22333d();
            C13933m.m25221a().mo22522e();
            a.mo22334e();
            try {
                a.f33753a.put("aid", C2572c.f7740b);
            } catch (Exception unused) {
            }
            return a;
        }

        /* renamed from: a */
        public static JSONArray m7509a(String str) {
            Matcher matcher = Pattern.compile("lib\\w+\\.so").matcher(str);
            HashSet<String> hashSet = new HashSet();
            while (matcher.find()) {
                hashSet.add(matcher.group());
            }
            JSONArray jSONArray = new JSONArray();
            for (String str2 : hashSet) {
                NativeTools.m25458a();
                String g = NativeTools.m25461g(str2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("lib_name", str2);
                    jSONObject.put("lib_uuid", NativeTools.m25460f(g));
                    jSONArray.put(jSONObject);
                } catch (Exception unused) {
                }
            }
            return jSONArray;
        }

        /* renamed from: a */
        private static boolean m7512a(File file) {
            MethodCollector.m26663i(8208);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(8208);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(8208);
            return delete;
        }

        /* renamed from: a */
        public static void m7511a(final C13864b bVar, final File file) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                new Thread(new Runnable(bVar) {
                    /* class com.bytedance.ammt.mmt.C2572c.C2574a.RunnableC25751 */

                    /* renamed from: a */
                    final /* synthetic */ C13864b f7748a;

                    static {
                        Covode.recordClassIndex(2960);
                    }

                    public final void run() {
                        if (C13907f.m25168a(C13933m.f33942g.getNativeCrashUploadUrl(), bVar.f33757a.toString(), file).f33927a == 0) {
                            C2574a.m7510a();
                        }
                    }

                    {
                        this.f7748a = r1;
                    }
                }).start();
                return;
            }
            if (C13907f.m25168a(C13933m.f33942g.getNativeCrashUploadUrl(), bVar.f33757a.toString(), file).f33927a == 0) {
                m7510a();
            }
        }
    }

    /* renamed from: a */
    static String m7506a(Context context) {
        StringBuilder sb = new StringBuilder();
        C2569a.m7495a();
        return sb.append(C2569a.m7498b(context)).append(File.separator).append("gmt").append(File.separator).append(f7743e).toString();
    }

    /* renamed from: a */
    public static List<JSONObject> m7507a(String str) {
        Throwable th;
        Exception e;
        String str2;
        MethodCollector.m26663i(7175);
        BufferedReader bufferedReader = null;
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(7175);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.startsWith("report GL usage start")) {
                        JSONObject jSONObject = new JSONObject();
                        StringBuffer stringBuffer = new StringBuffer();
                        jSONObject.put(StringSet.name, "GL_USAGE");
                        jSONObject.put("usages", "null");
                        jSONObject.put("backtrace", "null");
                        while (true) {
                            String readLine2 = bufferedReader2.readLine();
                            if (readLine2 == null) {
                                break;
                            }
                            ALog.m59869i("GL Usage", readLine2);
                            if (readLine2.startsWith("report GL usage end")) {
                                jSONObject.put("usages", stringBuffer.toString());
                                arrayList.add(jSONObject);
                                break;
                            }
                            stringBuffer.append(readLine2);
                            stringBuffer.append('\n');
                        }
                    }
                    if (readLine.startsWith("report GL unwind usage start")) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(StringSet.name, "GL_UNWIND_USAGE");
                        jSONObject2.put("usages", "null");
                        jSONObject2.put("backtrace", "null");
                        StringBuffer stringBuffer2 = new StringBuffer();
                        int i = 0;
                        while (true) {
                            String readLine3 = bufferedReader2.readLine();
                            if (readLine3 == null) {
                                break;
                            } else if (readLine3.startsWith("context")) {
                                jSONObject2.put("usages", readLine3);
                            } else if (readLine3.startsWith("report GL unwind usage end")) {
                                jSONObject2.put("backtrace", stringBuffer2.toString());
                                arrayList.add(jSONObject2);
                                break;
                            } else {
                                if (i >= 3) {
                                    int i2 = i - 3;
                                    if (i2 > 9) {
                                        str2 = String.valueOf(i2);
                                    } else {
                                        str2 = "0".concat(String.valueOf(i2));
                                    }
                                    stringBuffer2.append("    #" + str2 + " " + readLine3);
                                    stringBuffer2.append('\n');
                                }
                                i++;
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    bufferedReader = bufferedReader2;
                    try {
                        e.printStackTrace();
                        C14061m.m25588a(bufferedReader);
                        MethodCollector.m26664o(7175);
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        C14061m.m25588a(bufferedReader);
                        MethodCollector.m26664o(7175);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = bufferedReader2;
                    C14061m.m25588a(bufferedReader);
                    MethodCollector.m26664o(7175);
                    throw th;
                }
            }
            C14061m.m25588a(bufferedReader2);
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            C14061m.m25588a(bufferedReader);
            MethodCollector.m26664o(7175);
            return arrayList;
        }
        MethodCollector.m26664o(7175);
        return arrayList;
    }

    /* renamed from: a */
    public static C13864b m7505a(Context context, String str) {
        Header a = C2574a.m7508a(context);
        C13864b bVar = new C13864b();
        bVar.mo22338a(a);
        bVar.mo22346a("is_native_crash", (Object) 1);
        bVar.mo22346a("data", (Object) str);
        bVar.mo22346a("crash_lib_uuid", (Object) C2574a.m7509a(str));
        bVar.mo22346a("crash_time", Long.valueOf(System.currentTimeMillis()));
        return bVar;
    }
}
