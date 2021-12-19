package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1427b.C19786a;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19996e;
import com.bytedance.p1399im.core.internal.utils.C20004l;
import com.bytedance.p1399im.core.internal.utils.C20010n;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1407c.C19515g;
import com.bytedance.p1399im.core.p1407c.C19516h;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19593ar;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.p1413f.C19682a;
import com.bytedance.p1399im.core.p1415g.C19696b;
import com.bytedance.p1399im.core.proto.ConversationBadgeCountInfo;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.MessageBody;
import com.bytedance.p1399im.core.proto.MessagesPerUserRequestBody;
import com.bytedance.p1399im.core.proto.MessagesPerUserResponseBody;
import com.bytedance.p1399im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.im.core.internal.b.a.u */
public final class C19918u extends AbstractC19927w {

    /* renamed from: a */
    public int f47313a;

    /* renamed from: b */
    public int f47314b;

    /* renamed from: c */
    public int f47315c;

    /* renamed from: d */
    public boolean f47316d = false;

    /* renamed from: e */
    public int f47317e = 0;

    /* renamed from: f */
    public int f47318f = 0;

    /* renamed from: g */
    public int f47319g = 0;

    /* renamed from: h */
    public int f47320h = 0;

    /* renamed from: i */
    public long f47321i = 0;

    /* renamed from: j */
    public long f47322j = 0;

    /* renamed from: k */
    public long f47323k = 0;

    /* renamed from: l */
    public long f47324l = 0;

    /* renamed from: m */
    public long f47325m = 0;

    /* renamed from: n */
    public long f47326n = 0;

    /* renamed from: o */
    public C19978k f47327o = null;

    /* renamed from: q */
    private long f47328q;

    /* renamed from: r */
    private long f47329r;

    /* renamed from: s */
    private long f47330s = 0;

    /* renamed from: t */
    private long f47331t = 0;

    static {
        Covode.recordClassIndex(22762);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return true;
    }

    /* renamed from: c */
    public final void mo31791c() {
        if (!this.f47316d) {
            C19512f.m36457b("imsdk", "GetMsgByUserHandler recordExceptionWhileSaveMsg", (Throwable) null);
            C20041s.m37876a();
            long a = C20041s.m37875a(this.f47313a);
            C20041s.m37876a();
            String a2 = C20041s.m37877a(this.f47313a, "error_cursor");
            String b = C20041s.f47627a.mo27996b(a2, (String) null);
            if (!TextUtils.isEmpty(b)) {
                String[] split = b.split(":");
                if (split.length == 2) {
                    long a3 = C19996e.m37748a(split[0], 0L);
                    int a4 = C19996e.m37746a(split[1], 0);
                    C19512f.m36457b("imsdk", "SPUtils getErrorCursor, key:" + a2 + ", cursor:" + a3 + ", count:" + a4, (Throwable) null);
                    Pair pair = new Pair(Long.valueOf(a3), Integer.valueOf(a4));
                    long longValue = ((Long) pair.first).longValue();
                    int intValue = ((Integer) pair.second).intValue();
                    if (longValue != a) {
                        C20041s.m37876a();
                        C20041s.m37880a(this.f47313a, a, 1);
                    } else if (intValue == 2) {
                        C19512f.m36457b("imsdk", "GetMsgByUserHandler cursor always fail, skip: ".concat(String.valueOf(a)), (Throwable) null);
                        return;
                    } else {
                        C20041s.m37876a();
                        C20041s.m37880a(this.f47313a, a, intValue + 1);
                    }
                    this.f47316d = true;
                }
            }
            C20041s.m37876a();
            C20041s.m37880a(this.f47313a, a, 1);
            this.f47316d = true;
        }
    }

    /* renamed from: b */
    private void m37496b(int i) {
        boolean z;
        if (this.f47314b != 8) {
            C19483d.m36365a().f46157b.mo27961b(this.f47313a, i);
        }
        C20014q.m37816a();
        if (i == 5) {
            z = true;
        } else {
            z = false;
        }
        C20014q.m37818a(z);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.messages_per_user_body == null) {
            return false;
        }
        return true;
    }

    C19918u(int i) {
        super(IMCMD.GET_MESSAGES_BY_USER.getValue());
        this.f47313a = i;
    }

    /* renamed from: a */
    public static Map<String, ConversationBadgeCountInfo> m37494a(MessagesPerUserResponseBody messagesPerUserResponseBody) {
        HashMap hashMap = new HashMap();
        if (messagesPerUserResponseBody.conversation_badge_count == null) {
            return hashMap;
        }
        for (ConversationBadgeCountInfo conversationBadgeCountInfo : messagesPerUserResponseBody.conversation_badge_count) {
            if (!(conversationBadgeCountInfo == null || TextUtils.isEmpty(conversationBadgeCountInfo.conversation_id) || conversationBadgeCountInfo.badge_count == null)) {
                hashMap.put(conversationBadgeCountInfo.conversation_id, conversationBadgeCountInfo);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo31789a(int i) {
        Log.getStackTraceString(new Exception());
        if (!(i == 9 || C20004l.m37794a().mo31880b() == 0)) {
            C19696b.m36812a(3, i);
        }
        this.f47328q = SystemClock.uptimeMillis();
        C20041s.m37876a();
        m37495a(i, C20041s.m37875a(this.f47313a));
    }

    /* renamed from: a */
    private void m37495a(int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (C19786a.m37238b(this.f47313a) || C19786a.m37249i(this.f47313a)) {
            C19512f.m36457b("imsdk", "GetMsgByUserHandler pull, reason:" + i + ", inbox:" + this.f47313a + ", already doing, return", (Throwable) null);
            return;
        }
        C19512f.m36457b("imsdk", "GetMsgByUserHandler pull, reason:" + i + ", inbox:" + this.f47313a + ", cursor:" + j, (Throwable) null);
        if (i != 1) {
            this.f47315c = i;
        }
        this.f47314b = i;
        if (i != 1) {
            m37496b(i);
        }
        C19786a.m37240c(this.f47313a);
        MessagesPerUserRequestBody.Builder cursor = new MessagesPerUserRequestBody.Builder().cursor(Long.valueOf(j));
        if (this.f47314b == 8) {
            cursor.interval(Long.valueOf(C19682a.m36780a().mo31635b()));
        }
        if (this.f47314b == 0) {
            C19483d.m36365a();
        }
        mo31798a(this.f47313a, new RequestBody.Builder().messages_per_user_body(cursor.build()).build(), null, new Object[0]);
        this.f47330s += SystemClock.uptimeMillis() - uptimeMillis;
        this.f47329r = SystemClock.uptimeMillis();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        boolean z;
        Integer valueOf;
        this.f47331t += SystemClock.uptimeMillis() - this.f47329r;
        this.f47327o = kVar;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            z = false;
        } else {
            z = true;
        }
        C19512f.m36457b("imsdk", "GetMsgByUserHandler handleResponse, seqId:" + kVar.f47477a + ", success:" + z, (Throwable) null);
        if (z) {
            this.f47326n = System.currentTimeMillis();
            final MessagesPerUserResponseBody messagesPerUserResponseBody = kVar.f47482f.body.messages_per_user_body;
            if (messagesPerUserResponseBody.messages != null && messagesPerUserResponseBody.messages.size() > 0) {
                this.f47325m += SystemClock.uptimeMillis() - uptimeMillis;
                final long j = kVar.f47477a;
                final long uptimeMillis2 = SystemClock.uptimeMillis();
                final List<MessageBody> list = messagesPerUserResponseBody.messages;
                final Boolean bool = messagesPerUserResponseBody.has_more;
                Long l = messagesPerUserResponseBody.next_cursor;
                Long l2 = messagesPerUserResponseBody.next_conversation_version;
                StringBuilder sb = new StringBuilder("GetMsgByUserHandler saveMsg, messages:");
                if (list == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(list.size());
                }
                C19512f.m36457b("imsdk", sb.append(valueOf).append(", hasMore:").append(bool).append(", nextCursor:").append(l).append(", nextVersion:").append(l2).append(", seqId:").append(j).toString(), (Throwable) null);
                RunnableC19987d.m37729a(new AbstractC19986c<Map<String, List<C19538ai>>>() {
                    /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19918u.C199191 */

                    static {
                        Covode.recordClassIndex(22763);
                    }

                    /* access modifiers changed from: private */
                    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01b8, code lost:
                        if (com.bytedance.p1399im.core.internal.utils.C20041s.m37889c() != false) goto L_0x01e8;
                     */
                    /* renamed from: b */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public java.util.Map<java.lang.String, java.util.List<com.bytedance.p1399im.core.p1408d.C19538ai>> mo31187a() {
                        /*
                        // Method dump skipped, instructions count: 807
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1427b.p1428a.C19918u.C199191.mo31187a():java.util.Map");
                    }
                }, new AbstractC19985b<Map<String, List<C19538ai>>>() {
                    /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19918u.C199202 */

                    static {
                        Covode.recordClassIndex(22764);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                    /* renamed from: a */
                    public final /* synthetic */ void mo31188a(Map<String, List<C19538ai>> map) {
                        int size;
                        boolean z;
                        boolean z2;
                        List<C19538ai> a;
                        Map<String, List<C19538ai>> map2 = map;
                        C19918u.this.f47323k += SystemClock.uptimeMillis() - uptimeMillis2;
                        StringBuilder sb = new StringBuilder("GetMsgByUserHandler saveMsg onCallback, result:");
                        if (map2 == null) {
                            size = 0;
                        } else {
                            size = map2.size();
                        }
                        C19512f.m36457b("imsdk", sb.append(size).append(", seqId:").append(j).toString(), (Throwable) null);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (map2 == null || map2.isEmpty()) {
                            z = false;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (String str : map2.keySet()) {
                                List<C19538ai> list = map2.get(str);
                                C20014q.m37816a().mo31901a(list, 3, new C19593ar());
                                for (C19538ai aiVar : list) {
                                    C19515g b = C19516h.m36461b(aiVar.getMsgId());
                                    if (!(b == null || C19918u.this.f47315c == 0)) {
                                        b.f46320e = Long.valueOf(System.currentTimeMillis() - b.f46318c.longValue());
                                        b.f46321f = Long.valueOf(System.currentTimeMillis() - b.f46317b.longValue());
                                        C19516h.m36460a(aiVar);
                                        C19516h.m36462b(aiVar);
                                    }
                                }
                                C19512f.m36457b("GetMsgByUserHandler saveMsg onCallback onGetMessage, conversationId:", str + ", messageList:" + Integer.valueOf(list.size()) + ", seqId:" + j, (Throwable) null);
                                if (C19483d.m36365a().mo31141b().f46220aB) {
                                    a = C20010n.m37805a(str, list);
                                } else {
                                    a = C20010n.m37805a(str, map2.get(str));
                                }
                                if (a != null) {
                                    arrayList.addAll(a);
                                }
                                if (!C19786a.m37235a(C19918u.this.f47313a, str)) {
                                    C19512f.m36457b("GetMsgByUserHandler  saveMsg onCallback onUpdateConversation, conversationId:", str + ", seqId:" + j, (Throwable) null);
                                    C19640j.m36671a().mo31587a(2, C19640j.m36671a().mo31586a(str));
                                }
                            }
                            z = false;
                            if (!arrayList.isEmpty()) {
                                C19483d.m36365a();
                            }
                        }
                        C19918u.this.f47324l += SystemClock.uptimeMillis() - uptimeMillis;
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        if (C19483d.m36365a().mo31141b().f46284x == 1) {
                            if (C19918u.this.f47314b == 0) {
                                z = true;
                            }
                            C19786a.m37234a(z);
                        } else if (!bool.booleanValue()) {
                            if (C19918u.this.f47314b == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            C19786a.m37234a(z2);
                            int i = C19918u.this.f47313a;
                            if (!C19786a.f46972h.containsKey(Integer.valueOf(i)) || C19786a.f46972h.get(Integer.valueOf(i)).isEmpty()) {
                                C19786a.m37229a(C19918u.this.f47313a);
                            }
                        }
                        C19918u.this.f47325m += SystemClock.uptimeMillis() - uptimeMillis2;
                        if (!bool.booleanValue()) {
                            C19918u.this.mo31790a(true, (C19672u) null);
                        }
                    }
                }, C19983a.m37721c());
            } else if (!messagesPerUserResponseBody.has_more.booleanValue()) {
                this.f47325m += SystemClock.uptimeMillis() - uptimeMillis;
                mo31790a(true, (C19672u) null);
            }
            long uptimeMillis3 = SystemClock.uptimeMillis();
            if (this.f47314b == 8 && messagesPerUserResponseBody.next_interval != null) {
                if (messagesPerUserResponseBody.next_interval.longValue() > 0) {
                    C19682a a = C19682a.m36780a();
                    a.f46797d = messagesPerUserResponseBody.next_interval.longValue();
                    if (a.f46796c != null) {
                        a.f46795b.removeCallbacks(a.f46796c);
                        a.f46795b.postDelayed(a.f46796c, a.mo31635b() * 1000);
                    }
                } else {
                    C19682a.m36780a().mo31637d();
                }
            }
            C19786a.m37242d(this.f47313a);
            this.f47325m += SystemClock.uptimeMillis() - uptimeMillis3;
            if (messagesPerUserResponseBody.has_more.booleanValue()) {
                m37495a(1, messagesPerUserResponseBody.next_cursor.longValue());
                return;
            }
            long uptimeMillis4 = SystemClock.uptimeMillis();
            m37496b(5);
            C19510e.m36435a(kVar, true).mo31165a();
            C20004l a2 = C20004l.m37794a();
            if (a2.f47544a || a2.f47546c) {
                C19512f.m36457b("imsdk", "LinkModeManager afterPullMixLink checking or ever migrated, isChecking:" + a2.f47544a + ", isEverMigrated:" + a2.f47546c, (Throwable) null);
            } else {
                a2.f47544a = true;
                RunnableC19987d.m37729a(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01b3: INVOKE  
                      (wrap: com.bytedance.im.core.internal.utils.l$1 : 0x01a7: CONSTRUCTOR  (r3v5 com.bytedance.im.core.internal.utils.l$1) = (r6v5 'a2' com.bytedance.im.core.internal.utils.l) call: com.bytedance.im.core.internal.utils.l.1.<init>(com.bytedance.im.core.internal.utils.l):void type: CONSTRUCTOR)
                      (wrap: com.bytedance.im.core.internal.utils.l$2 : 0x01ac: CONSTRUCTOR  (r1v6 com.bytedance.im.core.internal.utils.l$2) = (r6v5 'a2' com.bytedance.im.core.internal.utils.l) call: com.bytedance.im.core.internal.utils.l.2.<init>(com.bytedance.im.core.internal.utils.l):void type: CONSTRUCTOR)
                      (wrap: java.util.concurrent.Executor : 0x01af: INVOKE  (r0v40 java.util.concurrent.Executor) =  type: STATIC call: com.bytedance.im.core.internal.e.a.d():java.util.concurrent.Executor)
                     type: STATIC call: com.bytedance.im.core.internal.e.d.a(com.bytedance.im.core.internal.e.c, com.bytedance.im.core.internal.e.b, java.util.concurrent.Executor):void in method: com.bytedance.im.core.internal.b.a.u.a(com.bytedance.im.core.internal.d.k, java.lang.Runnable):void, file: classes10.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01a7: CONSTRUCTOR  (r3v5 com.bytedance.im.core.internal.utils.l$1) = (r6v5 'a2' com.bytedance.im.core.internal.utils.l) call: com.bytedance.im.core.internal.utils.l.1.<init>(com.bytedance.im.core.internal.utils.l):void type: CONSTRUCTOR in method: com.bytedance.im.core.internal.b.a.u.a(com.bytedance.im.core.internal.d.k, java.lang.Runnable):void, file: classes10.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 30 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.core.internal.utils.l, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 36 more
                    */
                /*
                // Method dump skipped, instructions count: 468
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1427b.p1428a.C19918u.mo31129a(com.bytedance.im.core.internal.d.k, java.lang.Runnable):void");
            }

            /* renamed from: a */
            public final void mo31790a(boolean z, C19672u uVar) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f47314b == 0) {
                    C20014q.m37816a().mo31889a(this.f47313a);
                }
                C20014q.m37816a();
                C20014q.m37818a(z);
                this.f47325m += SystemClock.uptimeMillis() - uptimeMillis;
                C19696b.m36827a(false, z, SystemClock.uptimeMillis() - this.f47328q, this.f47317e, this.f47318f, this.f47319g, this.f47320h, uVar, this.f47330s, this.f47331t, this.f47321i, this.f47322j, this.f47323k, this.f47324l, this.f47325m);
            }
        }
