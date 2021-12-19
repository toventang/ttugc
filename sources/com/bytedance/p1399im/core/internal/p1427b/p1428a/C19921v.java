package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1427b.C19786a;
import com.bytedance.p1399im.core.internal.p1431d.AbstractC19977j;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19995d;
import com.bytedance.p1399im.core.internal.utils.C19996e;
import com.bytedance.p1399im.core.internal.utils.C20004l;
import com.bytedance.p1399im.core.internal.utils.C20010n;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19593ar;
import com.bytedance.p1399im.core.p1408d.C19598aw;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.p1415g.C19696b;
import com.bytedance.p1399im.core.proto.ConversationRecentMessage;
import com.bytedance.p1399im.core.proto.GetRecentMessageReqBody;
import com.bytedance.p1399im.core.proto.GetRecentMessageRespBody;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.MessageBody;
import com.bytedance.p1399im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.im.core.internal.b.a.v */
public final class C19921v extends AbstractC19927w<Boolean> {

    /* renamed from: a */
    public int f47340a;

    /* renamed from: b */
    public String f47341b;

    /* renamed from: c */
    public int f47342c;

    /* renamed from: d */
    public int f47343d;

    /* renamed from: e */
    public int f47344e;

    /* renamed from: f */
    public int f47345f;

    /* renamed from: g */
    public long f47346g;

    /* renamed from: h */
    public long f47347h;

    /* renamed from: i */
    public long f47348i;

    /* renamed from: j */
    public long f47349j;

    /* renamed from: k */
    public long f47350k;

    /* renamed from: l */
    public long f47351l;

    /* renamed from: m */
    public long f47352m;

    /* renamed from: n */
    public long f47353n;

    /* renamed from: o */
    private long f47354o;

    static {
        Covode.recordClassIndex(22765);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(final C19978k kVar, Runnable runnable) {
        boolean z = true;
        final GetRecentMessageRespBody getRecentMessageRespBody = null;
        if (C19483d.m36365a().mo31141b().f46245aj) {
            this.f47348i += SystemClock.uptimeMillis() - this.f47354o;
            long uptimeMillis = SystemClock.uptimeMillis();
            final boolean z2 = kVar.mo31869l() && mo31130a(kVar);
            C19512f.m36457b("imsdk", "GetRecentMsgHandler handleResponse, seqId:" + kVar.f47477a + ", success:" + z2, (Throwable) null);
            if (z2) {
                getRecentMessageRespBody = kVar.f47482f.body.get_recent_message_body;
            }
            this.f47353n += SystemClock.uptimeMillis() - uptimeMillis;
            final long uptimeMillis2 = SystemClock.uptimeMillis();
            RunnableC19987d.m37729a(new AbstractC19986c<C19926a>() {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19921v.C199243 */

                static {
                    Covode.recordClassIndex(22768);
                }

                /* access modifiers changed from: private */
                /* renamed from: b */
                public C19926a mo31187a() {
                    if (!z2) {
                        return null;
                    }
                    C19926a aVar = new C19926a();
                    try {
                        C19742b.m36974a("GetRecentMsgHandler.handleResponse()");
                        C19921v.this.mo31794a(aVar, getRecentMessageRespBody.messages);
                        C19742b.m36975a("GetRecentMsgHandler.handleResponse()", true);
                        C19921v.this.mo31793a(aVar, getRecentMessageRespBody.next_conversation_version);
                    } catch (Exception e) {
                        C19512f.m36457b("imsdk", "GetRecentMsgHandler handleResponse saveMessage error", e);
                        C19742b.m36975a("GetRecentMsgHandler.handleResponse()", false);
                        C19510e.m36439a(e);
                        C19696b.m36814a(4, e);
                        C20041s.m37876a();
                        if (C20041s.m37895e(C19921v.this.f47340a)) {
                            C19921v.this.mo31793a(aVar, getRecentMessageRespBody.next_conversation_version);
                        } else {
                            C19512f.m36457b("imsdk", "GetRecentMsgHandler handleResponse forbid to update version", (Throwable) null);
                        }
                    }
                    return aVar;
                }
            }, new AbstractC19985b<C19926a>() {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19921v.C199254 */

                static {
                    Covode.recordClassIndex(22769);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                /* renamed from: a */
                public final /* synthetic */ void mo31188a(C19926a aVar) {
                    boolean z;
                    C19926a aVar2 = aVar;
                    C19921v.this.f47351l = SystemClock.uptimeMillis() - uptimeMillis2;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    boolean z2 = false;
                    if (z2) {
                        C19512f.m36457b("imsdk", "GetRecentMsgHandler handleResponse onCallback, seqId:" + kVar.f47477a + ", result:" + aVar2, (Throwable) null);
                        C19921v.m37506a(aVar2);
                        C19921v.this.f47352m += SystemClock.uptimeMillis() - uptimeMillis;
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        if (aVar2.f47374f <= 0 || !getRecentMessageRespBody.has_more.booleanValue()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (C19483d.m36365a().mo31141b().f46284x == 1 || !z) {
                            if (C19921v.this.f47342c == 0) {
                                z2 = true;
                            }
                            C19786a.m37234a(z2);
                            if (!z) {
                                C19786a.m37246f(C19921v.this.f47340a);
                                C19510e.m36435a(kVar, true).mo31165a();
                                C19921v.this.f47353n += SystemClock.uptimeMillis() - uptimeMillis2;
                                C19696b.m36827a(true, true, SystemClock.uptimeMillis() - C19921v.this.f47346g, C19921v.this.f47343d, 0, C19921v.this.f47344e, C19921v.this.f47345f, null, C19921v.this.f47347h, C19921v.this.f47348i, C19921v.this.f47349j, C19921v.this.f47350k, C19921v.this.f47351l, C19921v.this.f47352m, C19921v.this.f47353n);
                                C19921v.this.mo31800a((Object) true);
                                C20004l.m37794a().mo31881c();
                                C19921v.this.mo31796a(true);
                                return;
                            }
                        }
                        C19921v.this.f47353n += SystemClock.uptimeMillis() - uptimeMillis2;
                        return;
                    }
                    C19786a.m37246f(C19921v.this.f47340a);
                    C19510e.m36435a(kVar, false).mo31165a();
                    C19921v.this.f47353n += SystemClock.uptimeMillis() - uptimeMillis;
                    C19696b.m36827a(true, false, SystemClock.uptimeMillis() - C19921v.this.f47346g, C19921v.this.f47343d, 0, C19921v.this.f47344e, C19921v.this.f47345f, C19672u.m36756a(kVar), C19921v.this.f47347h, C19921v.this.f47348i, C19921v.this.f47349j, C19921v.this.f47350k, C19921v.this.f47351l, C19921v.this.f47352m, C19921v.this.f47353n);
                    C19921v.this.mo31800a((Object) false);
                    C19921v.this.mo31796a(false);
                }
            }, C19983a.m37721c());
            long uptimeMillis3 = SystemClock.uptimeMillis();
            if (!z2 || getRecentMessageRespBody.next_conversation_version == null || getRecentMessageRespBody.next_conversation_version.longValue() <= 0 || !getRecentMessageRespBody.has_more.booleanValue()) {
                z = false;
            }
            this.f47353n += SystemClock.uptimeMillis() - uptimeMillis3;
            if (z) {
                mo31795a(this.f47341b, getRecentMessageRespBody.next_conversation_version.longValue());
                return;
            }
            return;
        }
        this.f47348i += SystemClock.uptimeMillis() - this.f47354o;
        long uptimeMillis4 = SystemClock.uptimeMillis();
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            z = false;
        }
        C19512f.m36457b("imsdk", "GetRecentMsgHandler handleResponse, seqId:" + kVar.f47477a + ", success:" + z, (Throwable) null);
        if (!z) {
            C19786a.m37246f(this.f47340a);
            C19510e.m36435a(kVar, false).mo31165a();
            this.f47353n += SystemClock.uptimeMillis() - uptimeMillis4;
            C19696b.m36827a(true, false, SystemClock.uptimeMillis() - this.f47346g, this.f47343d, 0, this.f47344e, this.f47345f, C19672u.m36756a(kVar), this.f47347h, this.f47348i, this.f47349j, this.f47350k, this.f47351l, this.f47352m, this.f47353n);
            mo31800a((Object) false);
            mo31796a(false);
            return;
        }
        final GetRecentMessageRespBody getRecentMessageRespBody2 = kVar.f47482f.body.get_recent_message_body;
        this.f47353n += SystemClock.uptimeMillis() - uptimeMillis4;
        final long uptimeMillis5 = SystemClock.uptimeMillis();
        RunnableC19987d.m37729a(new AbstractC19986c<C19926a>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19921v.C199221 */

            static {
                Covode.recordClassIndex(22766);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public C19926a mo31187a() {
                C19926a aVar = new C19926a();
                try {
                    C19742b.m36974a("GetRecentMsgHandler.handleResponse()");
                    C19921v.this.mo31794a(aVar, getRecentMessageRespBody2.messages);
                    C19742b.m36975a("GetRecentMsgHandler.handleResponse()", true);
                    C19921v.this.mo31793a(aVar, getRecentMessageRespBody2.next_conversation_version);
                } catch (Exception e) {
                    C19512f.m36457b("imsdk", "GetRecentMsgHandler handleResponse saveMessage error", e);
                    C19742b.m36975a("GetRecentMsgHandler.handleResponse()", false);
                    C19510e.m36439a(e);
                    C19696b.m36814a(4, e);
                    C20041s.m37876a();
                    if (C20041s.m37895e(C19921v.this.f47340a)) {
                        C19921v.this.mo31793a(aVar, getRecentMessageRespBody2.next_conversation_version);
                    } else {
                        C19512f.m36457b("imsdk", "GetRecentMsgHandler handleResponse forbid to update version", (Throwable) null);
                    }
                }
                return aVar;
            }
        }, new AbstractC19985b<C19926a>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19921v.C199232 */

            static {
                Covode.recordClassIndex(22767);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(C19926a aVar) {
                boolean z;
                C19926a aVar2 = aVar;
                C19921v.this.f47351l = SystemClock.uptimeMillis() - uptimeMillis5;
                long uptimeMillis = SystemClock.uptimeMillis();
                C19512f.m36457b("imsdk", "GetRecentMsgHandler handleResponse onCallback, seqId:" + kVar.f47477a + ", result:" + aVar2, (Throwable) null);
                C19921v.m37506a(aVar2);
                C19921v.this.f47352m += SystemClock.uptimeMillis() - uptimeMillis;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                boolean z2 = false;
                if (aVar2.f47374f <= 0 || !getRecentMessageRespBody2.has_more.booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                if (C19483d.m36365a().mo31141b().f46284x == 1 || !z) {
                    if (C19921v.this.f47342c == 0) {
                        z2 = true;
                    }
                    C19786a.m37234a(z2);
                    if (!z) {
                        C19786a.m37246f(C19921v.this.f47340a);
                        C19510e.m36435a(kVar, true).mo31165a();
                        C19921v.this.f47353n += SystemClock.uptimeMillis() - uptimeMillis2;
                        C19696b.m36827a(true, true, SystemClock.uptimeMillis() - C19921v.this.f47346g, C19921v.this.f47343d, 0, C19921v.this.f47344e, C19921v.this.f47345f, null, C19921v.this.f47347h, C19921v.this.f47348i, C19921v.this.f47349j, C19921v.this.f47350k, C19921v.this.f47351l, C19921v.this.f47352m, C19921v.this.f47353n);
                        C19921v.this.mo31800a((Object) true);
                        C20004l.m37794a().mo31881c();
                        C19921v.this.mo31796a(true);
                        return;
                    }
                }
                C19921v.this.f47353n += SystemClock.uptimeMillis() - uptimeMillis2;
                C19921v vVar = C19921v.this;
                vVar.mo31795a(vVar.f47341b, aVar2.f47374f);
            }
        }, C19983a.m37721c());
    }

    /* renamed from: a */
    public final void mo31795a(String str, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        C19512f.m36457b("imsdk", "GetRecentMsgHandler pull, source:" + str + ", inbox:" + this.f47340a + ", version:" + j, (Throwable) null);
        this.f47341b = str;
        C19786a.m37244e(this.f47340a);
        GetRecentMessageReqBody.Builder conversation_version = new GetRecentMessageReqBody.Builder().source(str).conversation_version(Long.valueOf(j));
        if (this.f47342c == 0) {
            C19483d.m36365a();
        }
        mo31798a(this.f47340a, new RequestBody.Builder().get_recent_message_body(conversation_version.build()).build(), (AbstractC19977j) null, new Object[0]);
        this.f47347h += SystemClock.uptimeMillis() - uptimeMillis;
        this.f47354o = SystemClock.uptimeMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.im.core.internal.b.a.v$a */
    public static class C19926a {

        /* renamed from: a */
        final Set<C19638h> f47369a = new LinkedHashSet();

        /* renamed from: b */
        final Set<String> f47370b = new LinkedHashSet();

        /* renamed from: c */
        final Map<String, Integer> f47371c = new HashMap();

        /* renamed from: d */
        final Map<String, List<C19538ai>> f47372d = new LinkedHashMap();

        /* renamed from: e */
        final List<C19538ai> f47373e = new ArrayList();

        /* renamed from: f */
        long f47374f = -1;

        static {
            Covode.recordClassIndex(22770);
        }

        C19926a() {
        }

        public final String toString() {
            return "ProcessResult{has:" + this.f47369a.size() + ", waiting:" + this.f47370b.size() + ", nextPullVersion:" + this.f47374f + ", msgListMap:" + this.f47372d.size() + ", pushMsgList:" + this.f47373e.size() + "}";
        }
    }

    C19921v(int i) {
        this(i, null);
    }

    /* renamed from: a */
    public final void mo31796a(boolean z) {
        if (this.f47342c == 0) {
            C20014q.m37816a().mo31889a(this.f47340a);
        }
        C20014q.m37816a();
        C20014q.m37818a(z);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.get_recent_message_body == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m37506a(C19926a aVar) {
        HashSet hashSet = new HashSet();
        for (C19638h hVar : aVar.f47369a) {
            String conversationId = hVar.getConversationId();
            hashSet.add(conversationId);
            m37507a(conversationId, hVar, aVar.f47372d.get(conversationId), aVar.f47371c.get(conversationId));
        }
        if (C19483d.m36365a().mo31141b().f46248am) {
            for (String str : aVar.f47370b) {
                if (!hashSet.contains(str)) {
                    m37507a(str, (C19638h) null, aVar.f47372d.get(str), (Integer) null);
                }
            }
        }
        if (!aVar.f47373e.isEmpty()) {
            C19483d.m36365a();
        }
    }

    /* renamed from: a */
    public final void mo31792a(int i) {
        Log.getStackTraceString(new Exception());
        if (!(i == 9 || C20004l.m37794a().mo31880b() == 1)) {
            C19696b.m36812a(4, i);
        }
        String a = C19996e.m37749a(i);
        if (C19786a.f46968d.contains(Integer.valueOf(this.f47340a))) {
            C19512f.m36457b("imsdk", "GetRecentMsgHandler pull, source:" + a + ", inbox:" + this.f47340a + ", already doing, return", (Throwable) null);
            return;
        }
        this.f47342c = i;
        this.f47346g = SystemClock.uptimeMillis();
        C20041s.m37876a();
        mo31795a(a, C20041s.m37883b(this.f47340a));
    }

    public C19921v(int i, AbstractC19479b<Boolean> bVar) {
        super(IMCMD.GET_RECENT_MESSAGE.getValue(), bVar);
        this.f47343d = 0;
        this.f47344e = 0;
        this.f47345f = 0;
        this.f47347h = 0;
        this.f47348i = 0;
        this.f47349j = 0;
        this.f47350k = 0;
        this.f47351l = 0;
        this.f47352m = 0;
        this.f47353n = 0;
        this.f47340a = i;
    }

    /* renamed from: a */
    public final void mo31793a(C19926a aVar, Long l) {
        long j;
        C20041s.m37876a();
        long b = C20041s.m37883b(this.f47340a);
        if (l == null || l.longValue() <= b) {
            StringBuilder sb = new StringBuilder("GetRecentMsgHandler updateVersion version invalid, next:");
            if (l != null) {
                j = l.longValue();
            } else {
                j = -1;
            }
            C19512f.m36457b("imsdk", sb.append(j).append(", local:").append(b).toString(), (Throwable) null);
            return;
        }
        C20041s.m37876a();
        C20041s.m37884b(this.f47340a, l.longValue());
        aVar.f47374f = l.longValue();
    }

    /* renamed from: a */
    public final void mo31794a(C19926a aVar, List<ConversationRecentMessage> list) {
        if (list != null && list.size() > 0) {
            C20041s.m37876a();
            C20041s.f47627a.mo27993a(C20041s.m37878a("ever_use_recent_link"), true);
            int i = 0;
            for (ConversationRecentMessage conversationRecentMessage : list) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (!(conversationRecentMessage == null || conversationRecentMessage.conversation_short_id == null || conversationRecentMessage.conversation_short_id.longValue() <= 0)) {
                    List<MessageBody> list2 = conversationRecentMessage.messages;
                    if (!C19995d.m37744a(list2)) {
                        String str = list2.get(0).conversation_id;
                        ArrayList arrayList = new ArrayList();
                        for (MessageBody messageBody : list2) {
                            i++;
                            C19598aw a = C19821ai.m37325a(messageBody, false, (Pair<String, String>) new Pair("s:msg_get_by_pull", "1"), 4);
                            if (!(a == null || a.f46543a == null)) {
                                arrayList.add(a.f46543a);
                            }
                        }
                        this.f47349j += SystemClock.uptimeMillis() - uptimeMillis;
                        if (!arrayList.isEmpty()) {
                            this.f47344e++;
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            aVar.f47372d.put(str, arrayList);
                            List<C19538ai> a2 = C20010n.m37805a(str, arrayList);
                            if (!C19995d.m37744a(a2)) {
                                aVar.f47373e.addAll(a2);
                            }
                            C19538ai aiVar = (C19538ai) arrayList.get(0);
                            C19638h a3 = C19749c.m36999a(str, true);
                            if (a3 == null || a3.isWaitingInfo() || !a3.isReadBadgeCountUpdated()) {
                                if (C19483d.m36365a().mo31141b().f46220aB) {
                                    C19902o.m37460a(this.f47340a, aiVar.getConversationId(), aiVar.getConversationShortId(), aiVar.getConversationType(), aiVar.getCreatedAt(), conversationRecentMessage.badge_count.intValue(), aiVar);
                                } else {
                                    C19902o.m37459a(this.f47340a, aiVar.getConversationId(), aiVar.getConversationShortId(), aiVar.getConversationType(), aiVar.getCreatedAt(), conversationRecentMessage.badge_count.intValue());
                                }
                                C19786a.m37230a(this.f47340a, aiVar);
                                aVar.f47370b.add(str);
                            } else {
                                long unreadCount = a3.getUnreadCount();
                                aVar.f47371c.put(str, Integer.valueOf(conversationRecentMessage.badge_count.intValue() - a3.getBadgeCount()));
                                C19821ai.m37327a(a3, aiVar, conversationRecentMessage.badge_count);
                                this.f47345f = (int) (((long) this.f47345f) + (a3.getUnreadCount() - unreadCount));
                                aVar.f47369a.add(a3);
                            }
                            this.f47350k += SystemClock.uptimeMillis() - uptimeMillis2;
                        }
                    }
                }
            }
            this.f47343d += i;
        }
    }

    /* renamed from: a */
    private static void m37507a(String str, C19638h hVar, List<C19538ai> list, Integer num) {
        Object obj;
        int i;
        StringBuilder append = new StringBuilder("GetRecentMsgHandler notifyByConversation, cid:").append(str).append(", msgList:");
        if (list != null) {
            obj = Integer.valueOf(list.size());
        } else {
            obj = "null";
        }
        C19512f.m36457b("imsdk", append.append(obj).toString(), (Throwable) null);
        if (!C19995d.m37744a(list)) {
            C19593ar arVar = new C19593ar();
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            arVar.f46512b = i;
            C20014q.m37816a().mo31901a(list, 4, arVar);
        }
        C19638h a = C19640j.m36671a().mo31586a(str);
        if (a != null) {
            hVar = a;
        } else if (hVar == null) {
            return;
        }
        C19640j.m36671a().mo31587a(2, hVar);
    }
}
