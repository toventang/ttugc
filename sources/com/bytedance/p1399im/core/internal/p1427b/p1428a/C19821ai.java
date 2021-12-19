package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1427b.C19786a;
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
import com.bytedance.p1399im.core.internal.utils.C20048w;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1407c.C19515g;
import com.bytedance.p1399im.core.p1407c.C19516h;
import com.bytedance.p1399im.core.p1408d.AbstractC19675w;
import com.bytedance.p1399im.core.p1408d.C19522aa;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19593ar;
import com.bytedance.p1399im.core.p1408d.C19594as;
import com.bytedance.p1399im.core.p1408d.C19595at;
import com.bytedance.p1399im.core.p1408d.C19598aw;
import com.bytedance.p1399im.core.p1408d.C19608bd;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.p1415g.C19696b;
import com.bytedance.p1399im.core.p1417i.C19730f;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.MsgTrace;
import com.bytedance.p1399im.core.proto.MsgTracePath;
import com.bytedance.p1399im.core.proto.NewMessageNotify;
import com.bytedance.p1399im.core.proto.NewMessageNotifyType;
import com.bytedance.p1399im.core.proto.ResponseBody;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.internal.b.a.ai */
public final class C19821ai extends AbstractC19860b {
    static {
        Covode.recordClassIndex(22665);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.im.core.internal.b.a.ai$a */
    public static class C19830a {

        /* renamed from: a */
        boolean f47089a;

        /* renamed from: b */
        boolean f47090b;

        /* renamed from: c */
        boolean f47091c;

        /* renamed from: d */
        boolean f47092d;

        /* renamed from: e */
        boolean f47093e;

        /* renamed from: f */
        boolean f47094f;

        /* renamed from: g */
        C19538ai f47095g;

        /* renamed from: h */
        C19638h f47096h;

        /* renamed from: i */
        C19608bd f47097i;

        /* renamed from: j */
        MsgTracePath f47098j;

        static {
            Covode.recordClassIndex(22674);
        }

        private C19830a() {
        }

        public final String toString() {
            String str;
            StringBuilder append = new StringBuilder("ProcessNotifyResult{isIgnored=").append(this.f47089a).append(", isCursorDiscontinuous=").append(this.f47090b).append(", isSucceed=").append(this.f47091c).append(", isMessageNew=").append(this.f47092d).append(", isProcessedBySendHandler=").append(this.f47094f).append(", message=");
            C19538ai aiVar = this.f47095g;
            String str2 = null;
            if (aiVar != null) {
                str = aiVar.getUuid();
            } else {
                str = null;
            }
            StringBuilder append2 = append.append(str).append(", conversation=");
            C19638h hVar = this.f47096h;
            if (hVar != null) {
                str2 = hVar.getConversationId();
            }
            return append2.append(str2).append("}").toString();
        }

        /* synthetic */ C19830a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19860b
    /* renamed from: a */
    public final void mo31749a(final int i, ResponseBody responseBody, final C19608bd bdVar) {
        int[] a;
        final NewMessageNotify newMessageNotify = responseBody.has_new_message_notify;
        if (newMessageNotify.notify_type == NewMessageNotifyType.PER_USER && (a = C19996e.m37756a()) != null) {
            C19515g a2 = C19516h.m36458a(newMessageNotify.message.server_message_id.longValue());
            if (this.f47160a.f47482f.start_time_stamp != null) {
                a2.f46316a = this.f47160a.f47482f.start_time_stamp;
            } else {
                a2.f46316a = newMessageNotify.message.create_time;
            }
            a2.f46318c = Long.valueOf(System.currentTimeMillis());
            a2.f46317b = newMessageNotify.message.create_time;
            a2.f46319d = Long.valueOf(a2.f46318c.longValue() - a2.f46316a.longValue());
            a2.f46323h = true;
            a2.f46324i = this.f47160a.mo31857f();
            for (int i2 : a) {
                if (i == i2) {
                    Iterator<AbstractC19675w> it = C20014q.m37816a().f47560f.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            AbstractC19675w next = it.next();
                            if (next != null && next.mo31128a(newMessageNotify)) {
                                break;
                            }
                        } else if (newMessageNotify.message == null) {
                            C19512f.m36457b("imsdk", "NewMsgNotifyHandler notifyByUser message null", (Throwable) null);
                        } else if (C20004l.m37794a().mo31880b() == 1) {
                            if (!C19870h.m37414a(newMessageNotify.message)) {
                                RunnableC19987d.m37729a(new AbstractC19986c<C19830a>() {
                                    /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19821ai.C198221 */

                                    static {
                                        Covode.recordClassIndex(22666);
                                    }

                                    /* access modifiers changed from: private */
                                    /* renamed from: b */
                                    public C19830a mo31187a() {
                                        C19830a aVar = new C19830a((byte) 0);
                                        C20041s.m37876a();
                                        long b = C20041s.m37883b(i);
                                        C19512f.m36457b("imsdk", "NewMsgNotifyHandler notifyNormalByRecentLink, localVersion:" + b + ", pre_version:" + newMessageNotify.previous_conversation_version + ", version:" + newMessageNotify.conversation_version, (Throwable) null);
                                        MsgTrace msgTrace = newMessageNotify.trace;
                                        aVar.f47097i = C19821ai.m37326a(bdVar, msgTrace);
                                        if (msgTrace != null) {
                                            aVar.f47098j = msgTrace.path;
                                        }
                                        if (newMessageNotify.conversation_version == null || newMessageNotify.previous_conversation_version == null) {
                                            aVar.f47090b = true;
                                            C19512f.m36457b("imsdk", "NewMsgNotifyHandler notifyNormalByRecentLink version discontinuous", (Throwable) null);
                                        } else if (newMessageNotify.conversation_version.longValue() <= b) {
                                            C19512f.m36457b("imsdk", "NewMsgNotifyHandler notifyNormalByRecentLink, local already exist, ignore", (Throwable) null);
                                            aVar.f47089a = true;
                                        } else if (newMessageNotify.previous_conversation_version.longValue() <= b) {
                                            C19821ai.m37329a(aVar, newMessageNotify);
                                            if (aVar.f47091c) {
                                                C20041s.m37876a();
                                                C20041s.m37884b(i, newMessageNotify.conversation_version.longValue());
                                            }
                                        } else {
                                            aVar.f47090b = true;
                                            C19512f.m36457b("imsdk", "NewMsgNotifyHandler notifyNormalByRecentLink version discontinuous", (Throwable) null);
                                        }
                                        C19512f.m36457b("imsdk", "NewMsgNotifyHandler notifyNormalByRecentLink, result:".concat(String.valueOf(aVar)), (Throwable) null);
                                        return aVar;
                                    }
                                }, new AbstractC19985b<C19830a>() {
                                    /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19821ai.C198232 */

                                    static {
                                        Covode.recordClassIndex(22667);
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                                    /* renamed from: a */
                                    public final /* synthetic */ void mo31188a(C19830a aVar) {
                                        final C19830a aVar2 = aVar;
                                        C19512f.m36457b("imsdk", "NewMsgNotifyHandler notifyNormalByRecentLink onCallback", (Throwable) null);
                                        if (aVar2.f47090b) {
                                            C19930x.m37536a();
                                            int i = i;
                                            if (C19930x.m37542a("pullRecentMessage", 1, i, 2)) {
                                                new C19921v(i).mo31792a(2);
                                            }
                                        } else if (aVar2.f47091c && aVar2.f47095g != null) {
                                            if (aVar2.f47096h != null && aVar2.f47096h.isReadBadgeCountUpdated()) {
                                                C19821ai.m37328a(aVar2);
                                            } else if (!C19483d.m36365a().mo31141b().f46233aO) {
                                                new C19902o().mo31783a(i, aVar2.f47095g, newMessageNotify.badge_count.intValue());
                                            } else {
                                                new C19902o(new AbstractC19479b<C19638h>() {
                                                    /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19821ai.C198232.C198241 */

                                                    static {
                                                        Covode.recordClassIndex(22668);
                                                    }

                                                    @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                                                    /* renamed from: a */
                                                    public final void mo27860a(C19672u uVar) {
                                                        C19512f.m36457b("imsdk", "NewMsgNotifyHandler  GetConversationInfo fail", (Throwable) null);
                                                    }

                                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                    @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                                                    /* renamed from: a */
                                                    public final /* synthetic */ void mo27861a(C19638h hVar) {
                                                        C19638h hVar2 = hVar;
                                                        if (hVar2 != null && hVar2.isReadBadgeCountUpdated()) {
                                                            C19821ai.m37328a(aVar2);
                                                        }
                                                    }
                                                }).mo31783a(i, aVar2.f47095g, newMessageNotify.badge_count.intValue());
                                            }
                                        }
                                        C19786a.m37234a(false);
                                    }
                                }, C19983a.m37721c());
                            } else if (C19730f.m36908a(newMessageNotify.message)) {
                                C19730f.m36907a().mo31673a(i, newMessageNotify.message);
                                C19930x.m37536a().mo31809c(i, 2);
                            } else {
                                RunnableC19987d.m37729a(new AbstractC19986c<C19830a>() {
                                    /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19821ai.C198253 */

                                    static {
                                        Covode.recordClassIndex(22669);
                                    }

                                    /* access modifiers changed from: private */
                                    /* renamed from: b */
                                    public C19830a mo31187a() {
                                        C19830a aVar = new C19830a((byte) 0);
                                        C20041s.m37876a();
                                        long c = C20041s.m37886c(i);
                                        C20041s.m37876a();
                                        long d = C20041s.m37891d(i);
                                        C19512f.m36457b("imsdk", "NewMsgNotifyHandler notifyCommandByRecentLink, localCmdIndex:" + c + ", cmdIndex:" + newMessageNotify.cmd_message_index + ", localUserCursor:" + d + ", userCursor:" + newMessageNotify.next_cursor, (Throwable) null);
                                        if (newMessageNotify.cmd_message_index != null) {
                                            if (newMessageNotify.cmd_message_index.longValue() < c) {
                                                C19512f.m36457b("imsdk", "NewMsgNotifyHandler notifyCommandByRecentLink, local already exist, ignore", (Throwable) null);
                                                aVar.f47089a = true;
                                            } else if (newMessageNotify.cmd_message_index.longValue() == c) {
                                                C19821ai.m37329a(aVar, newMessageNotify);
                                                if (aVar.f47091c) {
                                                    C20041s.m37876a();
                                                    C20041s.m37887c(i, newMessageNotify.cmd_message_index.longValue() + 1);
                                                }
                                                if (newMessageNotify.next_cursor == null || newMessageNotify.next_cursor.longValue() <= d) {
                                                    C19512f.m36457b("imsdk", "NewMsgNotifyHandler notifyCommandByRecentLink mix cursor invalid", (Throwable) null);
                                                } else {
                                                    C20041s.m37876a();
                                                    C20041s.m37892d(i, newMessageNotify.next_cursor.longValue());
                                                }
                                            }
                                            C19512f.m36457b("imsdk", "NewMsgNotifyHandler notifyCommandByRecentLink, result:".concat(String.valueOf(aVar)), (Throwable) null);
                                            return aVar;
                                        }
                                        aVar.f47090b = true;
                                        C19512f.m36457b("imsdk", "NewMsgNotifyHandler notifyCommandByRecentLink index discontinuous", (Throwable) null);
                                        C19512f.m36457b("imsdk", "NewMsgNotifyHandler notifyCommandByRecentLink, result:".concat(String.valueOf(aVar)), (Throwable) null);
                                        return aVar;
                                    }
                                }, new AbstractC19985b<C19830a>() {
                                    /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19821ai.C198264 */

                                    static {
                                        Covode.recordClassIndex(22670);
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                                    /* renamed from: a */
                                    public final /* synthetic */ void mo31188a(C19830a aVar) {
                                        C19512f.m36457b("imsdk", "NewMsgNotifyHandler notifyCommandByRecentLink onCallback", (Throwable) null);
                                        if (aVar.f47090b) {
                                            C19930x.m37536a();
                                            int i = i;
                                            if (C19930x.m37542a("pullCmdMessage", 1, i, 2)) {
                                                new C19898m(i).mo31779a(2);
                                            }
                                        }
                                        C19786a.m37234a(false);
                                    }
                                }, C19983a.m37721c());
                            }
                        } else if (C19730f.m36908a(newMessageNotify.message)) {
                            C19730f.m36907a().mo31673a(i, newMessageNotify.message);
                            C19930x.m37536a();
                            C19930x.m37543b(i, 2);
                        } else {
                            RunnableC19987d.m37729a(new AbstractC19986c<C19830a>() {
                                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19821ai.C198275 */

                                static {
                                    Covode.recordClassIndex(22671);
                                }

                                /* access modifiers changed from: private */
                                /* renamed from: b */
                                public C19830a mo31187a() {
                                    C19830a aVar = new C19830a((byte) 0);
                                    C20041s.m37876a();
                                    long a = C20041s.m37875a(i);
                                    MsgTrace msgTrace = newMessageNotify.trace;
                                    aVar.f47097i = C19821ai.m37326a(bdVar, msgTrace);
                                    if (msgTrace != null) {
                                        aVar.f47098j = msgTrace.path;
                                    }
                                    C19512f.m36457b("imsdk", "NewMsgNotifyHandler notifyByUserLink, localCursor:" + a + ", preCursor:" + newMessageNotify.previous_cursor + ", nextCursor:" + newMessageNotify.next_cursor, (Throwable) null);
                                    if (newMessageNotify.next_cursor.longValue() <= a) {
                                        C19512f.m36457b("imsdk", "NewMsgNotifyHandler notifyByUserLink, local already exist, ignore", (Throwable) null);
                                        aVar.f47089a = true;
                                    } else if (newMessageNotify.previous_cursor.longValue() == a) {
                                        C19821ai.m37329a(aVar, newMessageNotify);
                                        if (aVar.f47091c) {
                                            C20041s.m37876a();
                                            C20041s.m37879a(i, newMessageNotify.next_cursor.longValue());
                                        }
                                    } else {
                                        C19512f.m36457b("imsdk", "NewMsgNotifyHandler notifyByUserLink, cursor discontinuous", (Throwable) null);
                                        aVar.f47090b = true;
                                    }
                                    C19512f.m36457b("imsdk", "NewMsgNotifyHandler notifyByUserLink, result=".concat(String.valueOf(aVar)), (Throwable) null);
                                    return aVar;
                                }
                            }, new AbstractC19985b<C19830a>() {
                                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19821ai.C198286 */

                                static {
                                    Covode.recordClassIndex(22672);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
                                    if (com.bytedance.p1399im.core.internal.utils.C20041s.m37889c() == false) goto L_0x004e;
                                 */
                                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                                /* renamed from: a */
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                public final /* synthetic */ void mo31188a(com.bytedance.p1399im.core.internal.p1427b.p1428a.C19821ai.C19830a r6) {
                                    /*
                                    // Method dump skipped, instructions count: 157
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1427b.p1428a.C19821ai.C198286.mo31188a(java.lang.Object):void");
                                }
                            }, C19983a.m37721c());
                        }
                    }
                }
            }
        }
    }

    C19821ai() {
        super(IMCMD.NEW_MSG_NOTIFY.getValue());
    }

    /* renamed from: a */
    static void m37330a(String str) {
        C19638h a;
        if (C19749c.m37009a(str) && (a = C19640j.m36671a().mo31586a(str)) != null) {
            a.setHasMore(false);
        }
    }

    /* renamed from: a */
    static void m37328a(C19830a aVar) {
        C19538ai aiVar = aVar.f47095g;
        boolean z = aVar.f47092d;
        C19638h a = C19640j.m36671a().mo31586a(aiVar.getConversationId());
        ArrayList arrayList = new ArrayList();
        arrayList.add(aiVar);
        if (z) {
            C19593ar arVar = new C19593ar();
            arVar.f46511a = new C19594as(aVar.f47097i, aVar.f47098j);
            C20014q.m37816a().mo31901a(arrayList, 0, arVar);
            C19515g b = C19516h.m36461b(aiVar.getMsgId());
            if (b != null) {
                b.f46320e = Long.valueOf(System.currentTimeMillis() - b.f46318c.longValue());
                b.f46321f = Long.valueOf(System.currentTimeMillis() - b.f46317b.longValue());
            }
            C19516h.m36460a(aVar.f47095g);
            C19516h.m36462b(aVar.f47095g);
        } else {
            if (C19786a.m37245e(aiVar.getUuid())) {
                C20014q.m37816a().mo31894a(aiVar, aVar.f47093e);
            }
            C19522aa a2 = C19522aa.m36471a();
            String conversationId = aiVar.getConversationId();
            if (!TextUtils.isEmpty(conversationId) && !C19995d.m37744a(arrayList)) {
                C20041s.m37876a();
                if (C20041s.m37889c()) {
                    C19512f.m36457b("imsdk", "LeakMsgRepairManager onUpdateMsg, cid:" + conversationId + ", list:" + arrayList.size(), (Throwable) null);
                    C19983a.m37722d().execute(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00f1: INVOKE  
                          (wrap: java.util.concurrent.Executor : 0x00e8: INVOKE  (r1v5 java.util.concurrent.Executor) =  type: STATIC call: com.bytedance.im.core.internal.e.a.d():java.util.concurrent.Executor)
                          (wrap: com.bytedance.im.core.d.aa$4 : 0x00ee: CONSTRUCTOR  (r0v12 com.bytedance.im.core.d.aa$4) = 
                          (r7v0 'a2' com.bytedance.im.core.d.aa)
                          (r3v0 'arrayList' java.util.ArrayList)
                          (r2v0 'conversationId' java.lang.String)
                         call: com.bytedance.im.core.d.aa.4.<init>(com.bytedance.im.core.d.aa, java.util.List, java.lang.String):void type: CONSTRUCTOR)
                         type: INTERFACE call: java.util.concurrent.Executor.execute(java.lang.Runnable):void in method: com.bytedance.im.core.internal.b.a.ai.a(com.bytedance.im.core.internal.b.a.ai$a):void, file: classes10.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ee: CONSTRUCTOR  (r0v12 com.bytedance.im.core.d.aa$4) = 
                          (r7v0 'a2' com.bytedance.im.core.d.aa)
                          (r3v0 'arrayList' java.util.ArrayList)
                          (r2v0 'conversationId' java.lang.String)
                         call: com.bytedance.im.core.d.aa.4.<init>(com.bytedance.im.core.d.aa, java.util.List, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.im.core.internal.b.a.ai.a(com.bytedance.im.core.internal.b.a.ai$a):void, file: classes10.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 29 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.core.d.aa, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 35 more
                        */
                    /*
                    // Method dump skipped, instructions count: 245
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1427b.p1428a.C19821ai.m37328a(com.bytedance.im.core.internal.b.a.ai$a):void");
                }

                /* renamed from: a */
                public static C19608bd m37326a(C19608bd bdVar, MsgTrace msgTrace) {
                    Map<Integer, Long> map;
                    if (bdVar == null) {
                        return null;
                    }
                    if (msgTrace == null || (map = msgTrace.metrics) == null) {
                        return bdVar;
                    }
                    for (Map.Entry<Integer, Long> entry : map.entrySet()) {
                        bdVar.mo31390a(entry.getKey().intValue(), entry.getValue().longValue());
                    }
                    return bdVar;
                }

                /* renamed from: a */
                public static void m37329a(C19830a aVar, NewMessageNotify newMessageNotify) {
                    C19538ai aiVar;
                    WeakReference<C19835al> weakReference;
                    C19835al alVar;
                    try {
                        C19512f.m36457b("imsdk", "NewMsgNotifyHandler processNotify, start save", (Throwable) null);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        C19608bd bdVar = aVar.f47097i;
                        if (bdVar != null) {
                            bdVar.mo31390a(C19595at.f46522h, C20048w.m37936a());
                        }
                        C19598aw a = m37325a(newMessageNotify.message, false, (Pair<String, String>) null, 0);
                        if (bdVar != null) {
                            bdVar.mo31390a(C19595at.f46523i, C20048w.m37936a());
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                            jSONObject.put("msg_count", 1);
                            jSONObject.put("msg_source", 0);
                            C19510e.m36438a("im_save_msg_list_duration", jSONObject);
                        } catch (Exception unused) {
                        }
                        if (a == null || a.f46545c) {
                            aVar.f47091c = true;
                            if (a == null) {
                                return;
                            }
                        }
                        if (a.f46543a != null && a.f46545c) {
                            if (!(newMessageNotify.message == null || newMessageNotify.message.status.intValue() != 0 || (aiVar = a.f46543a) == null || TextUtils.isEmpty(aiVar.getUuid()) || (weakReference = C19786a.f46977m.get(aiVar.getUuid())) == null || (alVar = weakReference.get()) == null)) {
                                C19786a.m37243d(aiVar.getUuid());
                                alVar.f47106a.f46566t = true;
                                if (!C19483d.m36365a().mo31141b().f46286z) {
                                    C19512f.m36457b("imsdk", "SendMsgHandler handleSendMsgByPush but options disabled", (Throwable) null);
                                } else if (alVar.f47108c) {
                                    C19512f.m36457b("imsdk", "SendMsgHandler handleSendMsgByPush response handled", (Throwable) null);
                                } else {
                                    alVar.f47107b = aiVar;
                                    C19512f.m36457b("imsdk", "SendMsgHandler handleSendMsgByPush push ahead response, waiting", (Throwable) null);
                                    aVar.f47094f = true;
                                    C19512f.m36457b("imsdk", "NewMsgNotifyHandler processNotify receive self sent message, processed by SendMsgHandler", (Throwable) null);
                                    return;
                                }
                            }
                            aVar.f47095g = a.f46543a;
                            aVar.f47092d = a.f46544b;
                            aVar.f47093e = a.f46546d;
                            if (bdVar != null) {
                                bdVar.mo31390a(C19595at.f46524j, C20048w.m37936a());
                            }
                            C19638h a2 = C19749c.m36999a(a.f46543a.getConversationId(), true);
                            if (a2 != null && !a2.isWaitingInfo() && !a2.isTemp()) {
                                m37327a(a2, a.f46543a, newMessageNotify.badge_count);
                                aVar.f47096h = a2;
                            }
                            if (bdVar != null) {
                                bdVar.mo31390a(C19595at.f46525k, C20048w.m37936a());
                            }
                        }
                    } catch (Exception e) {
                        C19512f.m36457b("imsdk", "NewMsgNotifyHandler ", e);
                        C19696b.m36814a(0, e);
                    }
                }

                /* renamed from: a */
                static void m37327a(C19638h hVar, C19538ai aiVar, Integer num) {
                    int i;
                    long b = C20010n.m37808b(aiVar);
                    if (b > hVar.getUpdatedTime()) {
                        hVar.setUpdatedTime(b);
                    }
                    hVar.setLastMessageIndex(C20010n.m37810d(aiVar));
                    hVar.setMaxIndexV2(C20010n.m37811e(aiVar));
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    hVar.setBadgeCount(i);
                    if (C19640j.m36671a().mo31601c(hVar.getConversationId())) {
                        hVar.setReadIndex(hVar.getLastMessageIndex());
                        hVar.setReadIndexV2(hVar.getMaxIndexV2());
                        hVar.setReadBadgeCount(hVar.getBadgeCount());
                        hVar.setUnreadCount(0);
                    } else {
                        hVar.setUnreadCount(C19749c.m37025e(hVar));
                    }
                    boolean a = C19749c.m37012a(hVar.getConversationId(), hVar.getUpdatedTime(), hVar.getLastMessageIndex(), hVar.getMaxIndexV2(), hVar.getBadgeCount(), hVar.getUnreadCount());
                    C19512f.m36457b("NewMsgNotifyHandler syncUpdateConversation, id:", hVar.getConversationId() + ", result:" + a, (Throwable) null);
                    if (a) {
                        C19638h a2 = C19640j.m36671a().mo31586a(hVar.getConversationId());
                        if (a2 != null) {
                            hVar.setDraftContent(a2.getDraftContent());
                            hVar.setDraftTime(a2.getDraftTime());
                        }
                        C19640j.m36671a().mo31589a(hVar);
                    }
                    if (hVar.isStranger()) {
                        C19730f.m36907a().mo31674a(hVar.getInboxType(), hVar.getConversationId(), hVar.getConversationShortId(), hVar.getConversationType());
                    }
                }

                /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Object] */
                /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b3, code lost:
                    if (r11.version.longValue() > r1.getVersion()) goto L_0x00d7;
                 */
                /* JADX WARNING: Unknown variable types count: 2 */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public static com.bytedance.p1399im.core.p1408d.C19598aw m37325a(com.bytedance.p1399im.core.proto.MessageBody r11, boolean r12, android.util.Pair<java.lang.String, java.lang.String> r13, int r14) {
                    /*
                    // Method dump skipped, instructions count: 776
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1427b.p1428a.C19821ai.m37325a(com.bytedance.im.core.proto.MessageBody, boolean, android.util.Pair, int):com.bytedance.im.core.d.aw");
                }
            }
