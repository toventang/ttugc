package com.bytedance.p1399im.core.p1408d;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19892k;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.p1399im.core.internal.utils.C20002j;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.proto.DeleteMessageRequestBody;
import com.bytedance.p1399im.core.proto.DeleteStrangerMessageRequestBody;
import com.google.gson.p2019b.C27895a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.im.core.d.bg */
public final class C19618bg {

    /* renamed from: a */
    public static final int f46616a = C19483d.m36365a().mo31141b().f46256au;

    /* renamed from: b */
    public static AbstractC19624c f46617b = null;

    /* renamed from: c */
    private static long f46618c = 0;

    /* renamed from: com.bytedance.im.core.d.bg$c */
    public interface AbstractC19624c {
        static {
            Covode.recordClassIndex(22468);
        }

        /* renamed from: a */
        void mo31406a();

        /* renamed from: a */
        void mo31407a(int i, Long l, DeleteMessageRequestBody deleteMessageRequestBody);

        /* renamed from: a */
        void mo31408a(int i, Long l, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody);

        /* renamed from: b */
        Map<Long, C19666o> mo31409b();
    }

    /* renamed from: com.bytedance.im.core.d.bg$b */
    public static class C19620b implements AbstractC19624c {

        /* renamed from: a */
        public final Map<Long, C19666o> f46620a = new ConcurrentHashMap();

        /* renamed from: b */
        public volatile boolean f46621b = false;

        static {
            Covode.recordClassIndex(22464);
        }

        /* renamed from: c */
        private void m36654c() {
            C19983a.m37722d().execute(new Runnable() {
                /* class com.bytedance.p1399im.core.p1408d.C19618bg.C19620b.RunnableC196233 */

                static {
                    Covode.recordClassIndex(22467);
                }

                public final void run() {
                    try {
                        String b = C19999h.f47538a.mo46674b(C19620b.this.f46620a);
                        if (b == null) {
                            b = "";
                        }
                        C20041s.m37876a();
                        C20041s.f47627a.mo27992a(C20041s.m37878a("wait_del_message"), b);
                        C19512f.m36457b("imsdk", "WaitDelCon_FileStore updateSp, cache:" + C19620b.this.f46620a.size(), (Throwable) null);
                    } catch (Throwable th) {
                        C20002j.m37781b("WaitDelCon_FileStore updateSp error ", th);
                    }
                }
            });
        }

        @Override // com.bytedance.p1399im.core.p1408d.C19618bg.AbstractC19624c
        /* renamed from: a */
        public final void mo31406a() {
            C19983a.m37717a().execute(new Runnable() {
                /* class com.bytedance.p1399im.core.p1408d.C19618bg.C19620b.RunnableC196211 */

                static {
                    Covode.recordClassIndex(22465);
                }

                public final void run() {
                    C19620b bVar = C19620b.this;
                    C20041s.m37876a();
                    String b = C20041s.f47627a.mo27996b(C20041s.m37878a("wait_del_message"), "");
                    if (!TextUtils.isEmpty(b)) {
                        try {
                            Map<? extends Long, ? extends C19666o> map = (Map) C19999h.f47538a.mo46671a(b, new C27895a<ConcurrentHashMap<Long, C19666o>>() {
                                /* class com.bytedance.p1399im.core.p1408d.C19618bg.C19620b.C196222 */

                                static {
                                    Covode.recordClassIndex(22466);
                                }
                            }.type);
                            if (map != null) {
                                bVar.f46620a.putAll(map);
                            }
                            C19512f.m36457b("imsdk", "WaitDelCon_FileStore initFromSp success, cache:" + bVar.f46620a.size(), (Throwable) null);
                        } catch (Throwable th) {
                            C20002j.m37781b("WaitDelCon_FileStore initFromSp error, json:".concat(String.valueOf(b)), th);
                        }
                    }
                    C19620b.this.f46621b = true;
                }
            });
        }

        @Override // com.bytedance.p1399im.core.p1408d.C19618bg.AbstractC19624c
        /* renamed from: b */
        public final Map<Long, C19666o> mo31409b() {
            C19512f.m36457b("imsdk", "WaitDelCon_FileStore trigger, cache:" + this.f46620a.size() + ", isInit:" + this.f46621b, (Throwable) null);
            if (this.f46620a.isEmpty()) {
                return new HashMap();
            }
            for (C19666o oVar : this.f46620a.values()) {
                oVar.retryTimes = Integer.valueOf(oVar.retryTimes.intValue() + 1);
            }
            HashMap hashMap = new HashMap(this.f46620a);
            if (C19618bg.f46616a != 5) {
                this.f46620a.clear();
            }
            m36654c();
            return hashMap;
        }

        @Override // com.bytedance.p1399im.core.p1408d.C19618bg.AbstractC19624c
        /* renamed from: a */
        public final void mo31407a(int i, Long l, DeleteMessageRequestBody deleteMessageRequestBody) {
            if (deleteMessageRequestBody == null) {
                C19512f.m36457b("imsdk", "WaitDelCon_FileStore add, invalid param, msgId:".concat(String.valueOf(l)), (Throwable) null);
                return;
            }
            if (!this.f46621b) {
                C19512f.m36457b("imsdk", "WaitDelCon_FileStore add, not init, msgId:".concat(String.valueOf(l)), (Throwable) null);
            }
            if (this.f46620a.containsKey(l)) {
                C19512f.m36457b("imsdk", "WaitDelCon_FileStore , add, already in cache, msgId:".concat(String.valueOf(l)), (Throwable) null);
            }
            this.f46620a.put(deleteMessageRequestBody.message_id, C19666o.fromReqBody(i, deleteMessageRequestBody));
            m36654c();
        }

        @Override // com.bytedance.p1399im.core.p1408d.C19618bg.AbstractC19624c
        /* renamed from: a */
        public final void mo31408a(int i, Long l, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
            if (deleteStrangerMessageRequestBody == null) {
                C19512f.m36457b("imsdk", "WaitDelCon_FileStore add, invalid param, msgId:".concat(String.valueOf(l)), (Throwable) null);
                return;
            }
            if (!this.f46621b) {
                C19512f.m36457b("imsdk", "WaitDelCon_FileStore add, not init, msgId:".concat(String.valueOf(l)), (Throwable) null);
            }
            if (this.f46620a.containsKey(l)) {
                C19512f.m36457b("imsdk", "WaitDelCon_FileStore , add, already in cache, msgId:".concat(String.valueOf(l)), (Throwable) null);
            }
            this.f46620a.put(deleteStrangerMessageRequestBody.server_message_id, C19666o.fromReqBody(i, deleteStrangerMessageRequestBody));
            m36654c();
        }
    }

    static {
        Covode.recordClassIndex(22462);
    }

    /* renamed from: com.bytedance.im.core.d.bg$a */
    public static class C19619a implements AbstractC19624c {

        /* renamed from: a */
        private final Map<Long, C19666o> f46619a = new ConcurrentHashMap();

        static {
            Covode.recordClassIndex(22463);
        }

        @Override // com.bytedance.p1399im.core.p1408d.C19618bg.AbstractC19624c
        /* renamed from: a */
        public final void mo31406a() {
        }

        @Override // com.bytedance.p1399im.core.p1408d.C19618bg.AbstractC19624c
        /* renamed from: b */
        public final Map<Long, C19666o> mo31409b() {
            for (C19666o oVar : this.f46619a.values()) {
                oVar.retryTimes = Integer.valueOf(oVar.retryTimes.intValue() + 1);
            }
            HashMap hashMap = new HashMap(this.f46619a);
            this.f46619a.clear();
            return hashMap;
        }

        @Override // com.bytedance.p1399im.core.p1408d.C19618bg.AbstractC19624c
        /* renamed from: a */
        public final void mo31407a(int i, Long l, DeleteMessageRequestBody deleteMessageRequestBody) {
            if (deleteMessageRequestBody == null) {
                C19512f.m36457b("imsdk", "WaitDelCon_CacheStoreadd, invalid param, msgId:".concat(String.valueOf(l)), (Throwable) null);
                return;
            }
            if (this.f46619a.containsKey(l)) {
                C19512f.m36457b("imsdk", "WaitDelCon_CacheStore, add, already in cache, msgId:".concat(String.valueOf(l)), (Throwable) null);
            }
            this.f46619a.put(deleteMessageRequestBody.message_id, C19666o.fromReqBody(i, deleteMessageRequestBody));
        }

        @Override // com.bytedance.p1399im.core.p1408d.C19618bg.AbstractC19624c
        /* renamed from: a */
        public final void mo31408a(int i, Long l, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
            if (deleteStrangerMessageRequestBody == null) {
                C19512f.m36457b("imsdk", "WaitDelCon_CacheStoreadd, invalid param, msgId:".concat(String.valueOf(l)), (Throwable) null);
                return;
            }
            if (this.f46619a.containsKey(l)) {
                C19512f.m36457b("imsdk", "WaitDelCon_CacheStore, add, already in cache, msgId:".concat(String.valueOf(l)), (Throwable) null);
            }
            this.f46619a.put(deleteStrangerMessageRequestBody.server_message_id, C19666o.fromReqBody(i, deleteStrangerMessageRequestBody));
        }
    }

    /* renamed from: a */
    public static void m36649a() {
        if (f46617b == null) {
            C19512f.m36457b("imsdk", "WaitDelCon trigger, store null", (Throwable) null);
        } else if (SystemClock.uptimeMillis() - f46618c <= 30000) {
            C19512f.m36457b("imsdk", "WaitDelCon trigger, time limit", (Throwable) null);
        } else {
            f46618c = SystemClock.uptimeMillis();
            Map<Long, C19666o> b = f46617b.mo31409b();
            C19512f.m36457b("imsdk", "WaitDelCon trigger, map:" + b.size() + ", mode:" + f46616a, (Throwable) null);
            for (Map.Entry<Long, C19666o> entry : b.entrySet()) {
                Long key = entry.getKey();
                C19666o value = entry.getValue();
                if (value == null) {
                    C19512f.m36457b("imsdk", "WaitDelCon trigger, invalid request, msgId:".concat(String.valueOf(key)), (Throwable) null);
                } else {
                    new C19892k(value.isStranger, null).mo31778a(value);
                }
            }
        }
    }
}
