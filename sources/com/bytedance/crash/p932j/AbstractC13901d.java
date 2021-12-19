package com.bytedance.crash.p932j;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.j.d */
public abstract class AbstractC13901d {

    /* renamed from: a */
    public static ConcurrentLinkedQueue<AbstractC13901d> f33870a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    public static volatile boolean f33871b = false;

    /* renamed from: c */
    public static LinkedList<C13904a> f33872c = new LinkedList<>();

    /* renamed from: a */
    public abstract void mo22384a();

    /* renamed from: com.bytedance.crash.j.d$a */
    public static class C13904a {

        /* renamed from: a */
        public final JSONObject f33875a;

        /* renamed from: b */
        public final JSONObject f33876b;

        /* renamed from: c */
        public final CrashType f33877c;

        static {
            Covode.recordClassIndex(15964);
        }

        /* renamed from: a */
        public final long mo22386a() {
            return (long) this.f33875a.optInt("app_start_time", -1);
        }

        C13904a(JSONObject jSONObject, CrashType crashType) {
            this.f33877c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f33875a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f33875a = jSONObject;
            }
            this.f33876b = jSONObject.optJSONObject("header");
        }
    }

    static {
        Covode.recordClassIndex(15961);
    }

    /* renamed from: b */
    static void m25155b() {
        f33871b = true;
        ConcurrentLinkedQueue<AbstractC13901d> concurrentLinkedQueue = f33870a;
        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
            Iterator<AbstractC13901d> it = f33870a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: com.bytedance.crash.j.d$2 */
    static /* synthetic */ class C139032 {

        /* renamed from: a */
        static final /* synthetic */ int[] f33874a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 15963(0x3e5b, float:2.2369E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.crash.CrashType[] r0 = com.bytedance.crash.CrashType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.crash.p932j.AbstractC13901d.C139032.f33874a = r2
                com.bytedance.crash.CrashType r0 = com.bytedance.crash.CrashType.JAVA     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.crash.p932j.AbstractC13901d.C139032.f33874a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.crash.CrashType r0 = com.bytedance.crash.CrashType.LAUNCH     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.crash.p932j.AbstractC13901d.C139032.f33874a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.crash.CrashType r0 = com.bytedance.crash.CrashType.NATIVE     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p932j.AbstractC13901d.C139032.<clinit>():void");
        }
    }

    /* renamed from: a */
    static void m25154a(CrashType crashType, JSONObject jSONObject) {
        f33872c.add(new C13904a(jSONObject, crashType));
        ConcurrentLinkedQueue<AbstractC13901d> concurrentLinkedQueue = f33870a;
        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
            Iterator<AbstractC13901d> it = f33870a.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo22384a();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
