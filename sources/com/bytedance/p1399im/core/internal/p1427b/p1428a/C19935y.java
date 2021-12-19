package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1427b.C19786a;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19631f;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.p1415g.C19696b;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.InitType;
import com.bytedance.p1399im.core.proto.MessagesPerUserInitV2RequestBody;
import com.bytedance.p1399im.core.proto.MessagesPerUserInitV2ResponseBody;
import com.bytedance.p1399im.core.proto.RequestBody;

/* renamed from: com.bytedance.im.core.internal.b.a.y */
public final class C19935y extends AbstractC19927w {

    /* renamed from: o */
    public static int f47394o = 10;

    /* renamed from: a */
    public int f47395a;

    /* renamed from: b */
    public boolean f47396b;

    /* renamed from: c */
    public boolean f47397c;

    /* renamed from: d */
    public int f47398d = 0;

    /* renamed from: e */
    public int f47399e = 0;

    /* renamed from: f */
    public int f47400f = 0;

    /* renamed from: g */
    public long f47401g;

    /* renamed from: h */
    public long f47402h = 0;

    /* renamed from: i */
    public long f47403i = 0;

    /* renamed from: j */
    public long f47404j = 0;

    /* renamed from: k */
    public long f47405k = 0;

    /* renamed from: l */
    public long f47406l = 0;

    /* renamed from: m */
    public long f47407m = 0;

    /* renamed from: n */
    public long f47408n = 0;

    /* renamed from: q */
    private long f47409q;

    /* renamed from: r */
    private long f47410r = 0;

    /* renamed from: s */
    private int f47411s = 0;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return true;
    }

    static {
        Covode.recordClassIndex(22779);
    }

    /* renamed from: c */
    private void m37556c() {
        if (!C19483d.m36365a().f46160e) {
            RunnableC19987d.m37728a(new AbstractC19986c<Boolean>() {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19935y.C199449 */

                static {
                    Covode.recordClassIndex(22788);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final /* synthetic */ Boolean mo31187a() {
                    return Boolean.valueOf(C19749c.m37019c());
                }
            }, (AbstractC19985b) null);
        }
    }

    public C19935y(int i) {
        super(IMCMD.GET_MESSAGES_BY_USER_INIT_V2.getValue());
        this.f47395a = i;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.messages_per_user_init_v2_body == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo31812a(long j) {
        this.f47410r = j;
        long uptimeMillis = SystemClock.uptimeMillis();
        MessagesPerUserInitV2RequestBody.Builder cursor = new MessagesPerUserInitV2RequestBody.Builder().cursor(Long.valueOf(j));
        C19483d.m36365a();
        MessagesPerUserInitV2RequestBody.Builder new_user = cursor.new_user(0);
        if (C19483d.m36365a().mo31141b().f46231aM != null) {
            new_user.init_sub_type(C19483d.m36365a().mo31141b().f46231aM);
        }
        RequestBody build = new RequestBody.Builder().messages_per_user_init_v2_body(new_user.build()).build();
        C19696b.f46836a = true;
        mo31798a(this.f47395a, build, null, new Object[0]);
        this.f47403i += SystemClock.uptimeMillis() - uptimeMillis;
        this.f47409q = SystemClock.uptimeMillis();
    }

    /* renamed from: a */
    public final void mo31813a(boolean z) {
        long uptimeMillis = SystemClock.uptimeMillis();
        C19786a.m37250j(this.f47395a);
        m37556c();
        C19640j.m36671a().mo31593a(z);
        if (this.f47396b) {
            C19786a.m37234a(false);
        } else if (C19483d.m36365a().mo31141b().f46205N) {
            C19930x.m37536a().mo31807a(this.f47395a, 0);
        } else {
            C20014q.m37816a().mo31889a(this.f47395a);
        }
        this.f47407m += SystemClock.uptimeMillis() - uptimeMillis;
        C19631f.m36665a();
    }

    /* renamed from: a */
    public final void mo31814a(final boolean z, final boolean z2) {
        if (C19483d.m36365a().mo31141b().f46234aP) {
            RunnableC19987d.m37728a(new AbstractC19986c<Object>() {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19935y.C199438 */

                static {
                    Covode.recordClassIndex(22787);
                }

                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final Object mo31187a() {
                    C19935y.this.mo31813a(z2);
                    return null;
                }
            }, (AbstractC19985b) null);
        } else {
            mo31813a(z2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(final C19978k kVar, Runnable runnable) {
        boolean z;
        final boolean z2;
        final MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody = null;
        boolean z3 = false;
        if (C19483d.m36365a().mo31141b().f46237ab.initConvListPullAsyncEnable != 0) {
            this.f47402h += SystemClock.uptimeMillis() - this.f47409q;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!kVar.mo31869l() || !mo31130a(kVar)) {
                z2 = false;
            } else {
                z2 = true;
            }
            C19512f.m36457b("imsdk", "IMInitHandler handleResponse, seqId:" + kVar.f47477a + ", isSuccess:" + z2, (Throwable) null);
            if (z2) {
                messagesPerUserInitV2ResponseBody = kVar.f47482f.body.messages_per_user_init_v2_body;
            }
            if (z2) {
                if (messagesPerUserInitV2ResponseBody.init_type == InitType.TYPE_BY_USER) {
                    z3 = true;
                }
                this.f47397c = z3;
            }
            this.f47408n += SystemClock.uptimeMillis() - uptimeMillis;
            final long uptimeMillis2 = SystemClock.uptimeMillis();
            RunnableC19987d.m37729a(new AbstractC19986c<Pair<Long, Long>>() {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19935y.C199383 */

                static {
                    Covode.recordClassIndex(22782);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final /* synthetic */ Pair<Long, Long> mo31187a() {
                    if (!z2) {
                        return null;
                    }
                    return C19935y.this.mo31811a(kVar.f47482f.inbox_type.intValue(), messagesPerUserInitV2ResponseBody, kVar.f47477a);
                }
            }, new AbstractC19985b<Pair<Long, Long>>() {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19935y.C199394 */

                static {
                    Covode.recordClassIndex(22783);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                /* renamed from: a */
                public final /* synthetic */ void mo31188a(Pair<Long, Long> pair) {
                    Pair<Long, Long> pair2 = pair;
                    C19935y.this.f47406l += SystemClock.uptimeMillis() - uptimeMillis2;
                    if (z2) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        C19935y.this.f47398d++;
                        C19512f.m36457b("imsdk", "IMInitHandler handleResponse onCallback, has_more:" + messagesPerUserInitV2ResponseBody.has_more + ", nextCursor:" + messagesPerUserInitV2ResponseBody.next_cursor + ", isByUser:" + C19935y.this.f47397c + ", seqId:" + kVar.f47477a, (Throwable) null);
                        C19483d.m36365a();
                        ((Long) pair2.first).longValue();
                        ((Long) pair2.second).longValue();
                        C20041s.m37876a();
                        long j = 0;
                        if (C20041s.m37875a(C19935y.this.f47395a) <= 0) {
                            C20041s.m37876a();
                            int i = C19935y.this.f47395a;
                            if (messagesPerUserInitV2ResponseBody.per_user_cursor != null) {
                                j = messagesPerUserInitV2ResponseBody.per_user_cursor.longValue();
                            }
                            C20041s.m37879a(i, j);
                        }
                        if (!messagesPerUserInitV2ResponseBody.has_more.booleanValue() || messagesPerUserInitV2ResponseBody.next_cursor == null) {
                            C20041s.m37876a();
                            C20041s.m37901h(C19935y.this.f47395a);
                            C19483d.m36365a().f46157b.mo27956a(C19935y.this.f47395a, 2);
                            C19935y.this.f47408n += SystemClock.uptimeMillis() - uptimeMillis;
                            C19935y.this.mo31814a(true, true);
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            C19786a.m37234a(true);
                            C19935y.this.f47408n += SystemClock.uptimeMillis() - uptimeMillis2;
                            C19696b.m36825a(true, SystemClock.uptimeMillis() - C19935y.this.f47401g, C19935y.this.f47398d, C19935y.this.f47399e, C19935y.this.f47400f, C19672u.m36756a(kVar), C19935y.this.f47402h, C19935y.this.f47403i, C19935y.this.f47404j, C19935y.this.f47405k, C19935y.this.f47406l, C19935y.this.f47407m, C19935y.this.f47408n);
                        } else {
                            if (C19935y.this.f47397c) {
                                C20041s.m37876a();
                                C20041s.m37894e(C19935y.this.f47395a, messagesPerUserInitV2ResponseBody.next_cursor.longValue());
                            }
                            if (C19483d.m36365a().mo31141b().f46284x == 1) {
                                C19786a.m37234a(true);
                            }
                            C19935y.this.f47408n += SystemClock.uptimeMillis() - uptimeMillis;
                        }
                        C19510e.m36435a(kVar, true).mo31165a();
                    } else {
                        C19483d.m36365a().f46157b.mo27956a(C19935y.this.f47395a, 1);
                        C19935y.this.mo31814a(true, true);
                        C19510e.m36435a(kVar, false).mo31165a();
                        C19696b.m36825a(false, SystemClock.uptimeMillis() - C19935y.this.f47401g, C19935y.this.f47398d, C19935y.this.f47399e, C19935y.this.f47400f, C19672u.m36756a(kVar), C19935y.this.f47402h, C19935y.this.f47403i, C19935y.this.f47404j, C19935y.this.f47405k, C19935y.this.f47406l, C19935y.this.f47407m, C19935y.this.f47408n);
                    }
                    C19510e.m36435a(kVar, true).mo31165a();
                }
            }, C19983a.m37721c());
            if (z2 && messagesPerUserInitV2ResponseBody.has_more.booleanValue() && messagesPerUserInitV2ResponseBody.next_cursor != null) {
                mo31812a(messagesPerUserInitV2ResponseBody.next_cursor.longValue());
                return;
            }
            return;
        }
        this.f47402h += SystemClock.uptimeMillis() - this.f47409q;
        long uptimeMillis3 = SystemClock.uptimeMillis();
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            z = false;
        } else {
            z = true;
        }
        C19512f.m36457b("imsdk", "IMInitHandler handleResponse, seqId:" + kVar.f47477a + ", isSuccess:" + z, (Throwable) null);
        if (z) {
            this.f47398d++;
            final MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody2 = kVar.f47482f.body.messages_per_user_init_v2_body;
            C20041s.m37876a();
            long j = 0;
            if (C20041s.m37875a(this.f47395a) <= 0) {
                C20041s.m37876a();
                int i = this.f47395a;
                if (messagesPerUserInitV2ResponseBody2.per_user_cursor != null) {
                    j = messagesPerUserInitV2ResponseBody2.per_user_cursor.longValue();
                }
                C20041s.m37879a(i, j);
            }
            if (messagesPerUserInitV2ResponseBody2.init_type == InitType.TYPE_BY_USER) {
                z3 = true;
            }
            this.f47397c = z3;
            this.f47408n += SystemClock.uptimeMillis() - uptimeMillis3;
            final long uptimeMillis4 = SystemClock.uptimeMillis();
            RunnableC19987d.m37729a(new AbstractC19986c<Pair<Long, Long>>() {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19935y.C199361 */

                static {
                    Covode.recordClassIndex(22780);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final /* synthetic */ Pair<Long, Long> mo31187a() {
                    return C19935y.this.mo31811a(kVar.f47482f.inbox_type.intValue(), messagesPerUserInitV2ResponseBody2, kVar.f47477a);
                }
            }, new AbstractC19985b<Pair<Long, Long>>() {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19935y.C199372 */

                static {
                    Covode.recordClassIndex(22781);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                /* renamed from: a */
                public final /* synthetic */ void mo31188a(Pair<Long, Long> pair) {
                    Pair<Long, Long> pair2 = pair;
                    C19935y.this.f47406l += SystemClock.uptimeMillis() - uptimeMillis4;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C19512f.m36457b("imsdk", "IMInitHandler handleResponse onCallback, has_more:" + messagesPerUserInitV2ResponseBody2.has_more + ", nextCursor:" + messagesPerUserInitV2ResponseBody2.next_cursor + ", isByUser:" + C19935y.this.f47397c + ", seqId:" + kVar.f47477a, (Throwable) null);
                    C19483d.m36365a();
                    ((Long) pair2.first).longValue();
                    ((Long) pair2.second).longValue();
                    if (!messagesPerUserInitV2ResponseBody2.has_more.booleanValue() || messagesPerUserInitV2ResponseBody2.next_cursor == null) {
                        C20041s.m37876a();
                        C20041s.m37901h(C19935y.this.f47395a);
                        C19483d.m36365a().f46157b.mo27956a(C19935y.this.f47395a, 2);
                        C19935y.this.f47408n += SystemClock.uptimeMillis() - uptimeMillis;
                        C19935y.this.mo31814a(true, true);
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        C19786a.m37234a(true);
                        C19935y.this.f47408n += SystemClock.uptimeMillis() - uptimeMillis2;
                        C19696b.m36825a(true, SystemClock.uptimeMillis() - C19935y.this.f47401g, C19935y.this.f47398d, C19935y.this.f47399e, C19935y.this.f47400f, C19672u.m36756a(kVar), C19935y.this.f47402h, C19935y.this.f47403i, C19935y.this.f47404j, C19935y.this.f47405k, C19935y.this.f47406l, C19935y.this.f47407m, C19935y.this.f47408n);
                    } else {
                        if (C19935y.this.f47397c) {
                            C20041s.m37876a();
                            C20041s.m37894e(C19935y.this.f47395a, messagesPerUserInitV2ResponseBody2.next_cursor.longValue());
                        }
                        C19935y.this.f47408n += SystemClock.uptimeMillis() - uptimeMillis;
                        C19935y.this.mo31812a(messagesPerUserInitV2ResponseBody2.next_cursor.longValue());
                        long uptimeMillis3 = SystemClock.uptimeMillis();
                        if (C19483d.m36365a().mo31141b().f46284x == 1) {
                            C19786a.m37234a(true);
                        }
                        C19935y.this.f47408n += SystemClock.uptimeMillis() - uptimeMillis3;
                    }
                    C19510e.m36435a(kVar, true).mo31165a();
                }
            }, C19983a.m37721c());
        } else if (this.f47411s >= f47394o || kVar.f47482f.status_code.intValue() == -1000 || kVar.f47482f.body == null) {
            C19483d.m36365a().f46157b.mo27956a(this.f47395a, 1);
            this.f47408n += SystemClock.uptimeMillis() - uptimeMillis3;
            mo31814a(true, true);
            C19510e.m36435a(kVar, false).mo31165a();
            C19696b.m36825a(false, SystemClock.uptimeMillis() - this.f47401g, this.f47398d, this.f47399e, this.f47400f, C19672u.m36756a(kVar), this.f47402h, this.f47403i, this.f47404j, this.f47405k, this.f47406l, this.f47407m, this.f47408n);
        } else {
            this.f47411s++;
            mo31812a(this.f47410r);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:17|18|(6:22|23|(1:119)(2:25|(3:27|28|120)(6:29|(7:33|(1:39)|40|(1:42)|43|(1:51)|52)|53|54|55|118))|56|20|19)|57|58|59|60) */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0170, code lost:
        r8 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0164 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<java.lang.Long, java.lang.Long> mo31811a(int r34, com.bytedance.p1399im.core.proto.MessagesPerUserInitV2ResponseBody r35, long r36) {
        /*
        // Method dump skipped, instructions count: 735
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1427b.p1428a.C19935y.mo31811a(int, com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody, long):android.util.Pair");
    }
}
