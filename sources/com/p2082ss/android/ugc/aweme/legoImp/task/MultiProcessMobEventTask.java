package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.MultiProcessMobEventTask */
public final class MultiProcessMobEventTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68542);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.MultiProcessMobEventTask$a */
    static final class CallableC58369a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC58369a f132911a = new CallableC58369a();

        static {
            Covode.recordClassIndex(68543);
        }

        CallableC58369a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0040 A[Catch:{ Exception -> 0x0049 }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0046 A[SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r8 = this;
                java.lang.String r7 = "event_name"
                java.lang.String r6 = ""
                java.lang.String r3 = "[]"
                java.lang.String r2 = "event_list"
                com.bytedance.keva.Keva r0 = com.p2082ss.android.ugc.aweme.feed.cache.C49332k.m92422a()     // Catch:{ Exception -> 0x0049 }
                java.lang.String r1 = r0.getString(r2, r3)     // Catch:{ Exception -> 0x0049 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r6)     // Catch:{ Exception -> 0x0049 }
                com.bytedance.keva.Keva r0 = com.p2082ss.android.ugc.aweme.feed.cache.C49332k.m92422a()     // Catch:{ Exception -> 0x0049 }
                r0.storeString(r2, r3)     // Catch:{ Exception -> 0x0049 }
                org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x0049 }
                r5.<init>(r1)     // Catch:{ Exception -> 0x0049 }
                int r4 = r5.length()     // Catch:{ Exception -> 0x0049 }
                r0 = 0
                r3 = 0
            L_0x0025:
                if (r3 >= r4) goto L_0x004d
                org.json.JSONObject r2 = r5.getJSONObject(r3)     // Catch:{ Exception -> 0x0049 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r2, r6)     // Catch:{ Exception -> 0x0049 }
                java.lang.String r1 = r2.optString(r7)     // Catch:{ Exception -> 0x0049 }
                if (r1 == 0) goto L_0x003d
                int r0 = r1.length()     // Catch:{ Exception -> 0x0049 }
                if (r0 != 0) goto L_0x003b
                goto L_0x003d
            L_0x003b:
                r0 = 0
                goto L_0x003e
            L_0x003d:
                r0 = 1
            L_0x003e:
                if (r0 != 0) goto L_0x0046
                r2.remove(r7)     // Catch:{ Exception -> 0x0049 }
                com.p2082ss.android.ugc.aweme.common.C39162r.m79461a(r1, r2)     // Catch:{ Exception -> 0x0049 }
            L_0x0046:
                int r3 = r3 + 1
                goto L_0x0025
            L_0x0049:
                r0 = move-exception
                r0.printStackTrace()
            L_0x004d:
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.legoImp.task.MultiProcessMobEventTask.CallableC58369a.call():java.lang.Object");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C89219l.m154721d(context, "");
        C1731i.m5640b(CallableC58369a.f132911a, C1731i.f5562a);
    }
}
