package com.bytedance.crash.runtime.p933a;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICommonParams;
import com.bytedance.crash.entity.C13864b;
import com.bytedance.crash.p923a.C13815a;
import com.bytedance.crash.util.C14043ac;
import com.bytedance.crash.util.C14044b;
import com.bytedance.crash.util.C14062n;
import com.bytedance.crash.util.NativeTools;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.a.b */
public abstract class AbstractC13983b {

    /* renamed from: a */
    protected CrashType f34100a;

    /* renamed from: b */
    protected Context f34101b;

    /* renamed from: c */
    protected ICommonParams f34102c = C13933m.m25221a().f34140a;

    /* renamed from: d */
    protected C13978a f34103d;

    /* renamed from: e */
    protected C13986d f34104e;

    /* renamed from: com.bytedance.crash.runtime.a.b$a */
    public interface AbstractC13984a {
        static {
            Covode.recordClassIndex(16049);
        }

        /* renamed from: a */
        C13864b mo22310a(int i, C13864b bVar);

        /* renamed from: b */
        C13864b mo22311b(int i, C13864b bVar);
    }

    static {
        Covode.recordClassIndex(16048);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C13864b mo22505a(C13864b bVar) {
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo22507a() {
        return true;
    }

    /* renamed from: b */
    private void m25309b(C13864b bVar) {
        List<AttachUserData> attachUserData = C13933m.f33943h.getAttachUserData(this.f34100a);
        HashMap hashMap = new HashMap();
        JSONObject optJSONObject = bVar.f33757a.optJSONObject("custom");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            bVar.mo22346a("custom", optJSONObject);
        }
        if (attachUserData != null) {
            for (int i = 0; i < attachUserData.size(); i++) {
                try {
                    AttachUserData attachUserData2 = attachUserData.get(i);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C13864b.m25058a(optJSONObject, attachUserData2.getUserData(this.f34100a));
                    hashMap.put("custom_cost_" + attachUserData2.getClass().getName() + "_" + hashMap.size(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                } catch (Throwable th) {
                    C13864b.m25057a(optJSONObject, th);
                }
            }
        }
        C14062n.m25593a(optJSONObject, "fd_count", Integer.valueOf(NativeTools.m25458a().mo22563b()));
        for (Map.Entry entry : hashMap.entrySet()) {
            C14062n.m25593a(optJSONObject, (String) entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C13864b mo22504a(int i, C13864b bVar) {
        int i2;
        if (bVar == null) {
            bVar = new C13864b();
        }
        if (i == 0) {
            int i3 = C13933m.f33946k;
            String str = C13933m.f33947l;
            C14062n.m25593a(bVar.f33757a, "miniapp_id", Integer.valueOf(i3));
            C14062n.m25593a(bVar.f33757a, "miniapp_version", str);
            if (C13933m.f33941f) {
                bVar.mo22346a("is_mp", (Object) 1);
            }
            bVar.mo22337a(this.f34102c);
            ConcurrentHashMap<Integer, String> concurrentHashMap = C13933m.f33944i;
            if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                for (Integer num : concurrentHashMap.keySet()) {
                    C14062n.m25593a(jSONObject, String.valueOf(num), concurrentHashMap.get(num));
                }
                C14062n.m25593a(bVar.f33757a, "sdk_info", jSONObject);
            }
            bVar.mo22346a("inner_sdk", C13933m.f33945j);
            bVar.mo22346a("process_name", C14044b.m25520c(C13933m.f33936a));
        } else if (i == 1) {
            if (!C14044b.m25518b(C13933m.f33936a)) {
                bVar.mo22346a("remote_process", (Object) 1);
            }
            bVar.mo22346a("pid", Integer.valueOf(Process.myPid()));
            bVar.mo22336a(C13933m.f33938c, C13933m.f33939d);
            C13978a aVar = this.f34103d;
            if (aVar != null) {
                JSONObject jSONObject2 = new JSONObject();
                C14062n.m25593a(jSONObject2, "last_create_activity", C13978a.m25304a(aVar.f34075l, aVar.f34076m));
                C14062n.m25593a(jSONObject2, "last_start_activity", C13978a.m25304a(aVar.f34077n, aVar.f34078o));
                C14062n.m25593a(jSONObject2, "last_resume_activity", C13978a.m25304a(aVar.f34079p, aVar.f34080q));
                C14062n.m25593a(jSONObject2, "last_pause_activity", C13978a.m25304a(aVar.f34081r, aVar.f34082s));
                C14062n.m25593a(jSONObject2, "last_stop_activity", C13978a.m25304a(aVar.f34083t, aVar.f34084u));
                C14062n.m25593a(jSONObject2, "alive_activities", aVar.mo22490a(aVar.f34070g, aVar.f34071h));
                C14062n.m25593a(jSONObject2, "finish_activities", aVar.mo22490a(aVar.f34072i, aVar.f34073j));
                bVar.mo22346a("activity_trace", jSONObject2);
                bVar.mo22342a("activity_track", aVar.mo22493c());
            }
            try {
                bVar.mo22343a(this.f34102c.getPatchInfo());
            } catch (Throwable unused) {
            }
            Object obj = C13933m.f33940e;
            if (obj != null) {
                bVar.mo22346a("business", obj);
            }
            bVar.mo22346a("is_background", Boolean.valueOf(C14044b.m25515a(this.f34101b)));
            m25309b(bVar);
        } else if (i == 2) {
            String d = C13933m.m25221a().mo22521d();
            if (!TextUtils.isEmpty(d)) {
                bVar.mo22346a("session_id", (Object) d);
            }
            C13986d dVar = this.f34104e;
            if (dVar == null) {
                i2 = 0;
            } else {
                i2 = dVar.f34105a;
            }
            bVar.mo22346a("battery", Integer.valueOf(i2));
            bVar.mo22344a(C13933m.f33943h.getTagMap());
            bVar.mo22340a("alog_inited", String.valueOf(C13815a.m24932a().mo22257b()));
        } else if (i == 5 && mo22507a()) {
            bVar.mo22348b(C14043ac.m25507a());
        }
        return bVar;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0014 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a A[SYNTHETIC, Splitter:B:11:0x001a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.crash.entity.C13864b mo22506a(com.bytedance.crash.entity.C13864b r8, com.bytedance.crash.runtime.p933a.AbstractC13983b.AbstractC13984a r9, boolean r10) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0007
            com.bytedance.crash.entity.b r8 = new com.bytedance.crash.entity.b
            r8.<init>()
        L_0x0007:
            r0 = 0
            r6 = r8
            r5 = 0
        L_0x000a:
            long r3 = android.os.SystemClock.uptimeMillis()
            if (r9 == 0) goto L_0x0014
            com.bytedance.crash.entity.b r6 = r9.mo22310a(r5, r6)     // Catch:{ all -> 0x0014 }
        L_0x0014:
            com.bytedance.crash.entity.b r6 = r7.mo22504a(r5, r6)     // Catch:{ all -> 0x0018 }
        L_0x0018:
            if (r9 == 0) goto L_0x002c
            com.bytedance.crash.entity.b r6 = r9.mo22311b(r5, r6)     // Catch:{ all -> 0x001e }
        L_0x001e:
            if (r10 == 0) goto L_0x002c
            if (r5 == 0) goto L_0x0048
            org.json.JSONObject r0 = r6.f33757a
            r8.mo22351c(r0)
        L_0x0027:
            com.bytedance.crash.entity.b r6 = new com.bytedance.crash.entity.b
            r6.<init>()
        L_0x002c:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "step_cost_"
            java.lang.String r2 = r0.concat(r1)
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r3
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.mo22350c(r2, r0)
            int r5 = r5 + 1
            r0 = 6
            if (r5 >= r0) goto L_0x004a
            goto L_0x000a
        L_0x0048:
            r8 = r6
            goto L_0x0027
        L_0x004a:
            com.bytedance.crash.entity.b r0 = r7.mo22505a(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.p933a.AbstractC13983b.mo22506a(com.bytedance.crash.entity.b, com.bytedance.crash.runtime.a.b$a, boolean):com.bytedance.crash.entity.b");
    }

    AbstractC13983b(CrashType crashType, Context context, C13978a aVar, C13986d dVar) {
        this.f34100a = crashType;
        this.f34101b = context;
        this.f34103d = aVar;
        this.f34104e = dVar;
    }
}
