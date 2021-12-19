package com.bytedance.apm;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.config.C12422d;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p754a.AbstractC12267d;
import com.bytedance.apm.p754a.AbstractC12268e;
import com.bytedance.apm.p754a.C12260a;
import com.bytedance.apm.p754a.C12264b;
import com.bytedance.apm.p767c.p769b.C12408b;
import com.bytedance.apm.p767c.p769b.C12409c;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.apm.p788p.C12566c;
import com.bytedance.apm.p789q.C12581e;
import com.bytedance.apm.p789q.C12584g;
import com.bytedance.apm.p789q.C12600t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.p802b.p803a.C12918a;
import com.bytedance.p802b.p803a.p805b.C12922a;
import com.bytedance.p802b.p803a.p805b.C12923b;
import com.bytedance.p802b.p841k.C13129e;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.b */
public class C12290b {

    /* renamed from: a */
    static AtomicLong f29545a = new AtomicLong(0);

    /* renamed from: b */
    private static File f29546b;

    /* renamed from: c */
    private static long f29547c = -1;

    /* renamed from: d */
    private static MappedByteBuffer f29548d;

    /* renamed from: a */
    public static void m22066a(final String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject a = m22057a(jSONObject3);
        m22071d(a);
        C12918a.m23186a(str, C12584g.m22678d(jSONObject), C12584g.m22678d(jSONObject2), a);
        if (C12397c.f29933c) {
            final JSONObject c = C12584g.m22677c(jSONObject);
            final JSONObject c2 = C12584g.m22677c(jSONObject2);
            final JSONObject c3 = C12584g.m22677c(a);
            C12566c.m22611a().mo20395a(new Runnable() {
                /* class com.bytedance.apm.C12290b.RunnableC1230119 */

                static {
                    Covode.recordClassIndex(14106);
                }

                public final void run() {
                    JSONObject a = new C12409c(str, 0, (JSONObject) null, c, c2, c3).mo20188a();
                    if (a != null) {
                        C12290b.m22063a("monitorEvent", a.toString());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m22065a(final String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject c = m22070c(jSONObject2);
        m22071d(c);
        C12918a.m23182a(new C12922a(str, 0, C13129e.m23604b(jSONObject), null, null, c));
        if (C12397c.f29933c) {
            final JSONObject c2 = C12584g.m22677c(jSONObject);
            final JSONObject c3 = C12584g.m22677c(c);
            C12566c.m22611a().mo20395a(new Runnable() {
                /* class com.bytedance.apm.C12290b.RunnableC123055 */

                static {
                    Covode.recordClassIndex(14110);
                }

                public final void run() {
                    JSONObject a = new C12409c(str, 0, c2, (JSONObject) null, (JSONObject) null, c3).mo20188a();
                    if (a != null) {
                        C12290b.m22063a("monitorDuration", a.toString());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m22063a(String str, String str2) {
        try {
            synchronized (C12290b.class) {
                String a = C12397c.m22278a();
                long id = Thread.currentThread().getId();
                long currentTimeMillis = System.currentTimeMillis();
                String a2 = C12600t.m22725a();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str).append("#").append(id).append("#").append(currentTimeMillis).append("#").append(a2).append("\n").append(str2).append("\n");
                byte[] bytes = stringBuffer.toString().getBytes("UTF-8");
                String absolutePath = m22056a(C12397c.f29931a).getAbsolutePath();
                if (f29548d == null) {
                    File file = new File(absolutePath + "/logs");
                    f29546b = new File(absolutePath + "/logs/proc: " + a);
                    File file2 = new File(absolutePath + "/logs/proc: " + a + "/" + a2);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    if (!f29546b.exists()) {
                        f29546b.mkdirs();
                    }
                    file2.createNewFile();
                    f29548d = new RandomAccessFile(file2, "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0, C12397c.m22285b() ? 2097152 : 262144);
                }
                if (f29548d.remaining() < bytes.length) {
                    f29548d.force();
                    f29548d = new RandomAccessFile(new File(absolutePath + "/logs/proc: " + a + "/" + a2), "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0, C12397c.m22285b() ? 2097152 : 262144);
                }
                f29548d.put(bytes);
                if (f29547c == -1 || System.currentTimeMillis() - f29547c > 3600000) {
                    if (C12581e.m22658a(f29546b) > 1073741824 || C12581e.m22659a(C12397c.f29931a).getFreeSpace() < 1073741824) {
                        m22058a();
                    }
                    f29547c = System.currentTimeMillis();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static boolean m22067a(File file) {
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    /* renamed from: a */
    public static void m22064a(final String str, JSONObject jSONObject) {
        final JSONObject a = m22057a(jSONObject);
        m22071d(a);
        C12560b.C12564a.f30567a.mo20387a(new Runnable() {
            /* class com.bytedance.apm.C12290b.RunnableC1229210 */

            static {
                Covode.recordClassIndex(14097);
            }

            public final void run() {
                String str = str;
                JSONObject jSONObject = a;
                if (!TextUtils.isEmpty(str)) {
                    C12918a.m23183a(new C12923b(str, jSONObject));
                }
            }
        });
        if (C12397c.f29933c) {
            final JSONObject c = C12584g.m22677c(a);
            C12566c.m22611a().mo20395a(new Runnable() {
                /* class com.bytedance.apm.C12290b.RunnableC1229311 */

                /* renamed from: c */
                final /* synthetic */ boolean f29560c = false;

                static {
                    Covode.recordClassIndex(14098);
                }

                public final void run() {
                    JSONObject a = new C12408b(str, c, this.f29560c).mo20188a();
                    if (a != null) {
                        C12290b.m22063a("monitorCommonLog", a.toString());
                    }
                }
            });
        }
    }

    static {
        Covode.recordClassIndex(14095);
    }

    /* renamed from: a */
    private static void m22058a() {
        if (C12397c.m22285b() && f29546b.exists()) {
            File[] listFiles = f29546b.listFiles();
            Arrays.sort(listFiles, new Comparator<File>() {
                /* class com.bytedance.apm.C12290b.C1229917 */

                static {
                    Covode.recordClassIndex(14104);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(File file, File file2) {
                    int i = Build.VERSION.SDK_INT;
                    return Long.compare(file.lastModified(), file2.lastModified());
                }
            });
            int i = 60;
            if (listFiles.length <= 60) {
                i = listFiles.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                m22067a(listFiles[i2]);
            }
        }
    }

    /* renamed from: a */
    public static boolean m22068a(String str) {
        return ApmDelegate.C12507a.f30372a.mo20331b(str);
    }

    /* renamed from: a */
    private static File m22056a(Context context) {
        if (!TextUtils.isEmpty(null)) {
            return context.getExternalFilesDir(null);
        }
        if (C58016d.f132223d != null && C58016d.f132224e) {
            return C58016d.f132223d;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        C58016d.f132223d = externalFilesDir;
        return externalFilesDir;
    }

    /* renamed from: b */
    private static JSONObject m22069b(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject.isNull("timestamp")) {
            try {
                jSONObject.put("timestamp", System.currentTimeMillis());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: c */
    private static JSONObject m22070c(JSONObject jSONObject) {
        try {
            JSONObject b = C13129e.m23604b(jSONObject);
            if (b == null) {
                b = new JSONObject();
            }
            if (b.isNull("timestamp")) {
                b.put("timestamp", System.currentTimeMillis());
            }
            return b;
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    /* renamed from: a */
    public static JSONObject m22057a(JSONObject jSONObject) {
        JSONObject jSONObject2 = null;
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                if (keys != null) {
                    jSONObject2 = new JSONObject();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                }
            } catch (Exception unused) {
                return jSONObject;
            }
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject2.isNull("timestamp")) {
            jSONObject2.put("timestamp", System.currentTimeMillis());
        }
        return jSONObject2;
    }

    /* renamed from: d */
    private static void m22071d(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("_debug_uuid", C12397c.m22287d() + "_" + f29545a.getAndAdd(1));
                jSONObject.put("_debug_self", jSONObject2);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m22059a(final C12422d dVar) {
        if (dVar != null) {
            final JSONObject b = m22069b(dVar.f30136e);
            m22071d(b);
            C12560b.C12564a.f30567a.mo20387a(new Runnable() {
                /* class com.bytedance.apm.C12290b.RunnableC123022 */

                static {
                    Covode.recordClassIndex(14107);
                }

                public final void run() {
                    C12918a.m23185a(dVar.f30132a, dVar.f30133b, dVar.f30134c, dVar.f30135d, b);
                }
            });
            if (C12397c.f29933c) {
                final JSONObject c = C12584g.m22677c(dVar.f30134c);
                final JSONObject c2 = C12584g.m22677c(dVar.f30135d);
                final JSONObject c3 = C12584g.m22677c(b);
                C12566c.m22611a().mo20395a(new Runnable() {
                    /* class com.bytedance.apm.C12290b.RunnableC123033 */

                    static {
                        Covode.recordClassIndex(14108);
                    }

                    public final void run() {
                        JSONObject a = new C12409c(dVar.f30132a, dVar.f30133b, c, c2, c3, dVar.f30137f).mo20188a();
                        if (a != null) {
                            C12290b.m22063a("monitorEvent", a.toString());
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static void m22060a(final String str, final int i, JSONObject jSONObject) {
        JSONObject a = m22057a(jSONObject);
        m22071d(a);
        C12918a.m23187b(str, i, null, null, a);
        if (C12397c.f29933c) {
            final JSONObject c = C12584g.m22677c(a);
            C12566c.m22611a().mo20395a(new Runnable() {
                /* class com.bytedance.apm.C12290b.RunnableC123044 */

                static {
                    Covode.recordClassIndex(14109);
                }

                public final void run() {
                    JSONObject a = new C12409c(str, i, (JSONObject) null, (JSONObject) null, (JSONObject) null, c).mo20188a();
                    if (a != null) {
                        C12290b.m22063a("monitorStatusRate", a.toString());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m22061a(final String str, final int i, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject a = m22057a(jSONObject2);
        m22071d(a);
        C12918a.m23182a(new C12922a(str, i, C12584g.m22678d(jSONObject), null, null, C12584g.m22678d(a)));
        if (C12397c.f29933c) {
            final JSONObject c = C12584g.m22677c(jSONObject);
            final JSONObject c2 = C12584g.m22677c(a);
            C12566c.m22611a().mo20395a(new Runnable() {
                /* class com.bytedance.apm.C12290b.RunnableC123066 */

                static {
                    Covode.recordClassIndex(14111);
                }

                public final void run() {
                    JSONObject a = new C12409c(str, i, c, (JSONObject) null, (JSONObject) null, c2).mo20188a();
                    if (a != null) {
                        C12290b.m22063a("monitorStatusAndDuration", a.toString());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m22062a(String str, long j, long j2, String str2, AbstractC12268e eVar, AbstractC12267d dVar) {
        ApmDelegate apmDelegate = ApmDelegate.C12507a.f30372a;
        if (apmDelegate.f30346n) {
            C12560b.C12564a.f30567a.mo20391b(new Runnable(str, j, j2, str2, eVar, dVar) {
                /* class com.bytedance.apm.internal.ApmDelegate.RunnableC125058 */

                /* renamed from: a */
                final /* synthetic */ String f30363a;

                /* renamed from: b */
                final /* synthetic */ long f30364b;

                /* renamed from: c */
                final /* synthetic */ long f30365c;

                /* renamed from: d */
                final /* synthetic */ String f30366d;

                /* renamed from: e */
                final /* synthetic */ AbstractC12268e f30367e;

                /* renamed from: f */
                final /* synthetic */ AbstractC12267d f30368f;

                static {
                    Covode.recordClassIndex(14321);
                }

                public final void run() {
                    String str;
                    int i;
                    String str2 = this.f30363a;
                    long j = this.f30364b;
                    long j2 = this.f30365c;
                    String str3 = this.f30366d;
                    AbstractC12268e eVar = this.f30367e;
                    AbstractC12267d dVar = this.f30368f;
                    long currentTimeMillis = System.currentTimeMillis();
                    C12290b.m22060a("apm_event_stats_alog", 0, (JSONObject) null);
                    C12264b.m22042a("begin upload alog:" + str2 + " startTime:" + j + " endTime:" + j2 + " scene:" + str3);
                    boolean z = true;
                    if (C12397c.f29931a == null) {
                        str = "apm context is null";
                        i = 0;
                    } else {
                        if (TextUtils.isEmpty(str2)) {
                            if (TextUtils.isEmpty(C12397c.f29948r)) {
                                str = "alog file dir is null";
                                i = 1;
                            } else {
                                str2 = C12397c.f29948r;
                            }
                        }
                        if (!new File(str2).exists()) {
                            str = "alog file dir do not exist";
                            i = 2;
                        } else {
                            if (eVar != null) {
                                eVar.mo19759a();
                                C12264b.m22042a("flush alog data to file");
                            } else {
                                C12290b.m22060a("apm_event_stats_alog_fail", 3, (JSONObject) null);
                            }
                            C12260a.m22036a(str2, j, j2, str3, dVar);
                            str = "";
                            i = -1;
                            z = false;
                        }
                    }
                    JSONObject a = C12264b.m22041a(!z, i, null, null);
                    if (z) {
                        if (dVar != null) {
                            dVar.mo19758a(false, a);
                        }
                        C12290b.m22060a("apm_event_stats_alog_fail", i, a);
                    }
                    C12264b.m22042a("upload end. ".concat(str));
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("time", System.currentTimeMillis() - currentTimeMillis);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    C12290b.m22066a("apm_event_stats_alog_time", (JSONObject) null, jSONObject, (JSONObject) null);
                }

                {
                    this.f30363a = r2;
                    this.f30364b = r3;
                    this.f30365c = r5;
                    this.f30366d = r7;
                    this.f30367e = r8;
                    this.f30368f = r9;
                }
            });
        }
    }
}
