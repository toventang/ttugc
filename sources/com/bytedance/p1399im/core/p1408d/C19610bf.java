package com.bytedance.p1399im.core.p1408d;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1427b.C19786a;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19888j;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.p1399im.core.internal.utils.C20002j;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.proto.DeleteConversationRequestBody;
import com.google.gson.p2019b.C27895a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.im.core.d.bf */
public final class C19610bf {

    /* renamed from: a */
    public static final int f46605a = C19483d.m36365a().mo31141b().f46254as;

    /* renamed from: b */
    public static AbstractC19617c f46606b = null;

    /* renamed from: c */
    private static long f46607c = 0;

    /* renamed from: com.bytedance.im.core.d.bf$c */
    public interface AbstractC19617c {
        static {
            Covode.recordClassIndex(22461);
        }

        /* renamed from: a */
        void mo31400a();

        /* renamed from: a */
        void mo31401a(int i, String str, DeleteConversationRequestBody deleteConversationRequestBody);

        /* renamed from: a */
        void mo31402a(String str);

        /* renamed from: b */
        Map<String, C19665n> mo31403b();
    }

    /* renamed from: com.bytedance.im.core.d.bf$b */
    public static class C19613b implements AbstractC19617c {

        /* renamed from: a */
        public final Map<String, C19665n> f46611a = new ConcurrentHashMap();

        /* renamed from: b */
        public volatile boolean f46612b = false;

        static {
            Covode.recordClassIndex(22457);
        }

        /* renamed from: c */
        private void m36640c() {
            C19983a.m37722d().execute(new Runnable() {
                /* class com.bytedance.p1399im.core.p1408d.C19610bf.C19613b.RunnableC196163 */

                static {
                    Covode.recordClassIndex(22460);
                }

                public final void run() {
                    try {
                        String b = C19999h.f47538a.mo46674b(C19613b.this.f46611a);
                        if (b == null) {
                            b = "";
                        }
                        C20041s.m37876a();
                        C20041s.f47627a.mo27992a(C20041s.m37878a("wait_del_conversation"), b);
                        C19512f.m36457b("imsdk", "WaitDelCon_FileStore updateSp, cache:" + C19613b.this.f46611a.size(), (Throwable) null);
                    } catch (Throwable th) {
                        C20002j.m37781b("WaitDelCon_FileStore updateSp error ", th);
                    }
                }
            });
        }

        @Override // com.bytedance.p1399im.core.p1408d.C19610bf.AbstractC19617c
        /* renamed from: a */
        public final void mo31400a() {
            C19983a.m37717a().execute(new Runnable() {
                /* class com.bytedance.p1399im.core.p1408d.C19610bf.C19613b.RunnableC196141 */

                static {
                    Covode.recordClassIndex(22458);
                }

                public final void run() {
                    C19613b bVar = C19613b.this;
                    C20041s.m37876a();
                    String b = C20041s.f47627a.mo27996b(C20041s.m37878a("wait_del_conversation"), "");
                    if (!TextUtils.isEmpty(b)) {
                        try {
                            Map<? extends String, ? extends C19665n> map = (Map) C19999h.f47538a.mo46671a(b, new C27895a<ConcurrentHashMap<String, C19665n>>() {
                                /* class com.bytedance.p1399im.core.p1408d.C19610bf.C19613b.C196152 */

                                static {
                                    Covode.recordClassIndex(22459);
                                }
                            }.type);
                            if (map != null) {
                                bVar.f46611a.putAll(map);
                            }
                            C19512f.m36457b("imsdk", "WaitDelCon_FileStore initFromSp success, cache:" + bVar.f46611a.size(), (Throwable) null);
                        } catch (Throwable th) {
                            C20002j.m37781b("WaitDelCon_FileStore initFromSp error, json:".concat(String.valueOf(b)), th);
                        }
                    }
                    C19613b.this.f46612b = true;
                }
            });
        }

        @Override // com.bytedance.p1399im.core.p1408d.C19610bf.AbstractC19617c
        /* renamed from: b */
        public final Map<String, C19665n> mo31403b() {
            C19512f.m36457b("imsdk", "WaitDelCon_FileStore trigger, cache:" + this.f46611a.size() + ", isInit:" + this.f46612b, (Throwable) null);
            if (this.f46611a.isEmpty()) {
                return new HashMap();
            }
            for (C19665n nVar : this.f46611a.values()) {
                nVar.retryTimes++;
            }
            HashMap hashMap = new HashMap(this.f46611a);
            if (C19610bf.f46605a != 2) {
                this.f46611a.clear();
            }
            m36640c();
            return hashMap;
        }

        @Override // com.bytedance.p1399im.core.p1408d.C19610bf.AbstractC19617c
        /* renamed from: a */
        public final void mo31402a(String str) {
            if (TextUtils.isEmpty(str)) {
                C19512f.m36457b("imsdk", "WaitDelCon_FileStore remove, invalid cid:".concat(String.valueOf(str)), (Throwable) null);
            } else if (this.f46611a.remove(str) == null) {
                C19512f.m36457b("imsdk", "WaitDelCon_FileStore remove not exist, cid:".concat(String.valueOf(str)), (Throwable) null);
            } else {
                m36640c();
            }
        }

        @Override // com.bytedance.p1399im.core.p1408d.C19610bf.AbstractC19617c
        /* renamed from: a */
        public final void mo31401a(int i, String str, DeleteConversationRequestBody deleteConversationRequestBody) {
            if (TextUtils.isEmpty(str) || deleteConversationRequestBody == null) {
                C19512f.m36457b("imsdk", "WaitDelCon_FileStore add, invalid param, cid:".concat(String.valueOf(str)), (Throwable) null);
                return;
            }
            if (!this.f46612b) {
                C19512f.m36457b("imsdk", "WaitDelCon_FileStore add, not init, cid:".concat(String.valueOf(str)), (Throwable) null);
            }
            if (this.f46611a.containsKey(str)) {
                C19512f.m36457b("imsdk", "WaitDelCon_FileStore , add, already in cache, cid:".concat(String.valueOf(str)), (Throwable) null);
            }
            this.f46611a.put(str, C19665n.fromReqBody(i, str, deleteConversationRequestBody));
            m36640c();
        }
    }

    static {
        Covode.recordClassIndex(22454);
    }

    /* renamed from: com.bytedance.im.core.d.bf$a */
    public static class C19612a implements AbstractC19617c {

        /* renamed from: a */
        private final Map<String, C19665n> f46610a = new ConcurrentHashMap();

        static {
            Covode.recordClassIndex(22456);
        }

        @Override // com.bytedance.p1399im.core.p1408d.C19610bf.AbstractC19617c
        /* renamed from: a */
        public final void mo31400a() {
        }

        @Override // com.bytedance.p1399im.core.p1408d.C19610bf.AbstractC19617c
        /* renamed from: b */
        public final Map<String, C19665n> mo31403b() {
            for (C19665n nVar : this.f46610a.values()) {
                nVar.retryTimes++;
            }
            HashMap hashMap = new HashMap(this.f46610a);
            this.f46610a.clear();
            return hashMap;
        }

        @Override // com.bytedance.p1399im.core.p1408d.C19610bf.AbstractC19617c
        /* renamed from: a */
        public final void mo31402a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f46610a.remove(str);
            }
        }

        @Override // com.bytedance.p1399im.core.p1408d.C19610bf.AbstractC19617c
        /* renamed from: a */
        public final void mo31401a(int i, String str, DeleteConversationRequestBody deleteConversationRequestBody) {
            if (TextUtils.isEmpty(str) || deleteConversationRequestBody == null) {
                C19512f.m36457b("imsdk", "WaitDelCon_CacheStoreadd, invalid param, cid:".concat(String.valueOf(str)), (Throwable) null);
                return;
            }
            if (this.f46610a.containsKey(str)) {
                C19512f.m36457b("imsdk", "WaitDelCon_CacheStore, add, already in cache, cid:".concat(String.valueOf(str)), (Throwable) null);
            }
            this.f46610a.put(str, C19665n.fromReqBody(i, str, deleteConversationRequestBody));
        }
    }

    /* renamed from: a */
    public static void m36632a() {
        StringBuilder sb = new StringBuilder("WaitDelCon onLogin, mode:");
        int i = f46605a;
        C19512f.m36457b("imsdk", sb.append(i).toString(), (Throwable) null);
        if (i == 0) {
            f46606b = new C19612a();
        } else {
            f46606b = new C19613b();
        }
        f46606b.mo31400a();
    }

    /* renamed from: b */
    public static void m36633b() {
        if (f46606b == null) {
            C19512f.m36457b("imsdk", "WaitDelCon trigger, store null", (Throwable) null);
        } else if (SystemClock.uptimeMillis() - f46607c <= 30000) {
            C19512f.m36457b("imsdk", "WaitDelCon trigger, time limit", (Throwable) null);
        } else {
            f46607c = SystemClock.uptimeMillis();
            Map<String, C19665n> b = f46606b.mo31403b();
            C19512f.m36457b("imsdk", "WaitDelCon trigger, map:" + b.size() + ", mode:" + f46605a, (Throwable) null);
            for (Map.Entry<String, C19665n> entry : b.entrySet()) {
                final String key = entry.getKey();
                final C19665n value = entry.getValue();
                if (value == null) {
                    C19512f.m36457b("imsdk", "WaitDelCon trigger, invalid request, cid:".concat(String.valueOf(key)), (Throwable) null);
                } else if (C19786a.m37235a(value.inboxType, key)) {
                    C19512f.m36457b("imsdk", "WaitDelCon trigger, cid:" + key + " conversation waiting to create", (Throwable) null);
                } else {
                    C19640j.m36671a().mo31598b(key, new AbstractC19479b<C19638h>() {
                        /* class com.bytedance.p1399im.core.p1408d.C19610bf.C196111 */

                        static {
                            Covode.recordClassIndex(22455);
                        }

                        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                        /* renamed from: a */
                        public final void mo27860a(C19672u uVar) {
                            new C19888j().mo31776a(value);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                        /* renamed from: a */
                        public final /* synthetic */ void mo27861a(C19638h hVar) {
                            if (hVar == null) {
                                new C19888j().mo31776a(value);
                            } else {
                                C19512f.m36457b("imsdk", "WaitDelCon trigger, cid:" + key + " conversation ever created after deleted", (Throwable) null);
                            }
                        }
                    });
                }
            }
        }
    }
}
