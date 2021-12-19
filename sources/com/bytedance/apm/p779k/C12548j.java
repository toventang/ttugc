package com.bytedance.apm.p779k;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.p767c.p768a.C12401a;
import com.bytedance.apm.p767c.p769b.C12412f;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.covode.number.Covode;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.k.j */
public final class C12548j extends AbstractC12513a {

    /* renamed from: a */
    public static boolean f30514a = false;

    /* renamed from: b */
    public static int f30515b = 300;

    /* renamed from: c */
    private static final int f30516c = Runtime.getRuntime().availableProcessors();

    /* renamed from: e */
    private static boolean f30517e = false;

    /* renamed from: f */
    private static boolean f30518f = false;

    /* renamed from: d */
    private long f30519d = 600000;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: b */
    public final boolean mo20036b() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: c */
    public final long mo20037c() {
        return this.f30519d;
    }

    @Override // com.bytedance.apm.p779k.AbstractC12513a, com.bytedance.services.slardar.config.AbstractC22715a
    /* renamed from: d */
    public final void mo20038d() {
        super.mo20038d();
        f30514a = true;
    }

    public C12548j() {
        this.f30391p = "thread";
    }

    static {
        Covode.recordClassIndex(14364);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: e */
    public final void mo20039e() {
        super.mo20039e();
        if (f30517e && f30518f && System.currentTimeMillis() - C12397c.m22292i() > 1200000) {
            m22559f();
        }
    }

    /* renamed from: f */
    private static int m22559f() {
        try {
            final int length = new File("/proc/self/task/").list().length;
            if (length == 0) {
                return 0;
            }
            final ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
            while (threadGroup.getParent() != null) {
                threadGroup = threadGroup.getParent();
            }
            final int[] iArr = {threadGroup.activeCount()};
            C12560b.C12564a.f30567a.mo20387a(new Runnable() {
                /* class com.bytedance.apm.p779k.C12548j.RunnableC125491 */

                /* renamed from: a */
                final /* synthetic */ boolean f30520a = false;

                /* renamed from: c */
                final /* synthetic */ String f30522c;

                static {
                    Covode.recordClassIndex(14365);
                }

                public final void run() {
                    if (this.f30520a || iArr[0] < C12548j.f30515b || !C12548j.f30514a) {
                        try {
                            C12401a.m22303b().mo20179a(new C12412f("thread", C12548j.m22558a(this.f30522c, length, iArr[0], null)));
                        } catch (Exception unused) {
                        }
                    } else {
                        int[] iArr = iArr;
                        Thread[] threadArr = new Thread[(iArr[0] + (iArr[0] / 2))];
                        iArr[0] = threadGroup.enumerate(threadArr);
                        StringBuilder sb = new StringBuilder();
                        int i = 0;
                        while (true) {
                            int[] iArr2 = iArr;
                            if (i < iArr2[0]) {
                                String name = threadArr[i].getName();
                                if (!TextUtils.isEmpty(name)) {
                                    sb.append(name);
                                    sb.append(",");
                                }
                                i++;
                            } else {
                                try {
                                    C12401a.m22303b().mo20179a(new C12412f("thread", C12548j.m22558a(this.f30522c, length, iArr2[0], sb.toString())));
                                    return;
                                } catch (Throwable unused2) {
                                    return;
                                }
                            }
                        }
                    }
                }

                {
                    this.f30522c = null;
                }
            });
            return (length << 16) + iArr[0];
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: a */
    public final void mo20034a(JSONObject jSONObject) {
        boolean z;
        super.mo20034a(jSONObject);
        boolean z2 = false;
        if (jSONObject.optInt("enable_thread_collect", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        f30517e = z;
        if (jSONObject.optInt("enable_upload", 0) == 1) {
            z2 = true;
        }
        f30518f = z2;
        f30515b = jSONObject.optInt("thread_count_threshold", 300);
        this.f30519d = jSONObject.optLong("collect_interval", 10) * 60000;
    }

    /* renamed from: a */
    public static JSONObject m22558a(String str, int i, int i2, String str2) {
        JSONObject jSONObject = new JSONObject();
        if (i > 0) {
            try {
                jSONObject.put("total_thread_count", i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        jSONObject.put("java_thread_count", i2);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("scene", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("thread_detail", str2);
        }
        jSONObject.put("is_main_process", C12397c.m22285b());
        jSONObject.put("cpu_count", f30516c);
        jSONObject.put("process_name", C12397c.m22278a());
        return jSONObject;
    }
}
