package com.bytedance.crash;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.C13866d;
import com.bytedance.crash.p932j.C13911h;
import com.bytedance.crash.p932j.C13913i;
import com.bytedance.crash.runtime.p935c.C14002b;
import com.bytedance.crash.util.C14044b;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class MonitorCrash {
    private static volatile boolean sAppMonitorCrashInit;
    Config mConfig;
    AttachUserData mCustomData;
    AttachUserData mCustomLongData;
    HeaderParams mParams;
    HashMap<String, String> mTagMap = new HashMap<>();

    public interface HeaderParams {
        static {
            Covode.recordClassIndex(15863);
        }

        Map<String, Object> getCommonParams();
    }

    static {
        Covode.recordClassIndex(15861);
    }

    public Config config() {
        return this.mConfig;
    }

    public MonitorCrash setCustomDataCallback(AttachUserData attachUserData) {
        this.mCustomData = attachUserData;
        return this;
    }

    public MonitorCrash withOtherHeaders(HeaderParams headerParams) {
        this.mParams = headerParams;
        return this;
    }

    public class Config {
        String mAid;
        String mChannel;
        String mDeviceId;
        String mPackageName;
        String[] mSoList;
        long mUID;
        long mVersionInt = -1;
        String mVersionStr;
        boolean test;

        static {
            Covode.recordClassIndex(15862);
        }

        public Config setChannel(String str) {
            this.mChannel = str;
            C14002b.m25372a();
            return this;
        }

        public Config setDeviceId(String str) {
            this.mDeviceId = str;
            C14002b.m25372a();
            return this;
        }

        public Config setPackageName(String str) {
            this.mPackageName = str;
            C14002b.m25372a();
            return this;
        }

        public Config setSoList(String[] strArr) {
            this.mSoList = strArr;
            C14002b.m25372a();
            return this;
        }

        public Config setUID(long j) {
            this.mUID = j;
            C14002b.m25372a();
            return this;
        }

        public Config() {
        }
    }

    public MonitorCrash addTags(String str, String str2) {
        this.mTagMap.put(str, str2);
        return this;
    }

    public void reportCustomErr(String str, String str2, Throwable th) {
        try {
            C13911h.m25182a((Object) this, th, (StackTraceElement[]) null, 0, str, true, (Map<String, String>) null, Thread.currentThread(), str2, "core_exception_monitor");
        } catch (Throwable unused) {
        }
    }

    private MonitorCrash(Context context, String str, long j, String str2) {
        Config config = new Config();
        this.mConfig = config;
        config.mAid = str;
        this.mConfig.mVersionInt = j;
        this.mConfig.mVersionStr = str2;
        C13881i iVar = new C13881i(this);
        C13881i.f33809b = this;
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C13933m.m25224a((Application) applicationContext, context, new ICommonParams(iVar, this) {
            /* class com.bytedance.crash.C13881i.C138821 */

            /* renamed from: a */
            final /* synthetic */ C13881i f33811a;

            /* renamed from: b */
            final /* synthetic */ MonitorCrash f33812b;

            static {
                Covode.recordClassIndex(15942);
            }

            @Override // com.bytedance.crash.ICommonParams
            public final List<String> getPatchInfo() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public final Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public final String getSessionId() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public final String getDeviceId() {
                return this.f33812b.mConfig.mDeviceId;
            }

            @Override // com.bytedance.crash.ICommonParams
            public final long getUserId() {
                return this.f33812b.mConfig.mUID;
            }

            @Override // com.bytedance.crash.ICommonParams
            public final Map<String, Object> getCommonParams() {
                JSONObject a = this.f33811a.mo22360a();
                HashMap hashMap = new HashMap();
                Iterator<String> keys = a.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, a.opt(next));
                }
                return hashMap;
            }

            {
                this.f33811a = r1;
                this.f33812b = r2;
            }
        });
    }

    public static MonitorCrash init(Context context, String str, long j, String str2) {
        MethodCollector.m26663i(1896);
        if (!sAppMonitorCrashInit) {
            synchronized (MonitorCrash.class) {
                try {
                    if (!sAppMonitorCrashInit) {
                        sAppMonitorCrashInit = true;
                        C13934n.m25235a(context);
                        return new MonitorCrash(context, str, j, str2);
                    }
                } finally {
                    MethodCollector.m26664o(1896);
                }
            }
        }
        MethodCollector.m26664o(1896);
        return null;
    }

    private MonitorCrash(String str, long j, String str2, String str3) {
        Config config = new Config();
        this.mConfig = config;
        config.mAid = str;
        this.mConfig.mVersionInt = j;
        this.mConfig.mVersionStr = str2;
        this.mConfig.mPackageName = str3;
        new C13881i(this);
    }

    public static MonitorCrash initSDK(Context context, String str, long j, String str2, String str3) {
        C13934n.m25235a(context);
        MonitorCrash monitorCrash = new MonitorCrash(str, j, str2, str3);
        monitorCrash.config().setPackageName(str3);
        return monitorCrash;
    }

    public void reportEvent(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C13866d.C138671 r2 = new C13866d() {
            /* class com.bytedance.crash.entity.C13866d.C138671 */

            static {
                Covode.recordClassIndex(15926);
            }

            @Override // com.bytedance.crash.entity.C13866d
            /* renamed from: c */
            public final boolean mo22352c() {
                return true;
            }
        };
        r2.mo22346a("event_type", (Object) "exception");
        r2.mo22346a("log_type", (Object) "service_monitor");
        r2.mo22346a("timestamp", Long.valueOf(System.currentTimeMillis()));
        r2.mo22346a("crash_time", Long.valueOf(System.currentTimeMillis()));
        r2.mo22346a("process_name", (Object) C14044b.m25520c(C13933m.f33936a));
        r2.mo22346a("crash_thread_name", (Object) Thread.currentThread().getName());
        r2.mo22346a("service", (Object) str);
        r2.mo22346a("status", Integer.valueOf(i));
        if (jSONObject != null) {
            r2.mo22346a("category", jSONObject);
        }
        if (jSONObject2 != null) {
            r2.mo22346a("metric", jSONObject2);
        }
        r2.mo22346a("sid", Long.valueOf(C13933m.f33938c));
        C13913i.m25189a(this, r2);
    }

    public static MonitorCrash initSDK(Context context, String str, long j, String str2, String str3, String[] strArr) {
        C13934n.m25235a(context);
        MonitorCrash monitorCrash = new MonitorCrash(str, j, str2, str3);
        monitorCrash.config().setPackageName(str3).setSoList(strArr);
        return monitorCrash;
    }
}
