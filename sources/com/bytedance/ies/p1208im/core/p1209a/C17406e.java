package com.bytedance.ies.p1208im.core.p1209a;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17436f;
import com.bytedance.ies.p1208im.core.api.p1215e.C17453a;
import com.bytedance.ies.p1208im.core.api.p1216f.C17456b;
import com.bytedance.ies.p1208im.core.api.p1216f.C17457c;
import com.bytedance.ies.p1208im.core.api.p1219i.C17468a;
import com.bytedance.ies.p1208im.core.p1224e.C17551t;
import com.bytedance.ies.p1208im.core.p1225f.C17570g;
import com.bytedance.ies.p1208im.core.p1226g.C17583c;
import com.bytedance.ies.p1208im.core.p1226g.C17587d;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1419a.C19777i;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19816ah;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19915t;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19994c;
import com.bytedance.p1399im.core.internal.utils.C20001i;
import com.bytedance.p1399im.core.internal.utils.C20010n;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.AbstractC19674v;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19546ak;
import com.bytedance.p1399im.core.p1408d.C19587an;
import com.bytedance.p1399im.core.p1408d.C19600ay;
import com.bytedance.p1399im.core.p1408d.C19625c;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.p1412e.C19679a;
import com.bytedance.p1399im.core.proto.DeleteMessageRequestBody;
import com.bytedance.p1399im.core.proto.DeleteStrangerMessageRequestBody;
import com.bytedance.p1399im.core.proto.ReferenceInfo;
import com.bytedance.p1399im.core.proto.RequestBody;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.a.e */
public final class C17406e extends AbstractC17436f {

    /* renamed from: b */
    public static final C17406e f41758b = new C17406e();

    private C17406e() {
    }

    static {
        Covode.recordClassIndex(19893);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.im.core.a.e$a */
    public static final class C17407a extends AbstractC89220m implements AbstractC89172b<C19538ai, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC19479b f41759a;

        static {
            Covode.recordClassIndex(19894);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17407a(AbstractC19479b bVar) {
            super(1);
            this.f41759a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C19538ai aiVar) {
            C19538ai aiVar2 = aiVar;
            C17551t.m32515a(aiVar2, (C19672u) null);
            AbstractC19479b bVar = this.f41759a;
            if (bVar != null) {
                bVar.mo27861a(aiVar2);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17436f
    /* renamed from: b */
    public final void mo27776b(C19538ai aiVar) {
        C89219l.m154721d(aiVar, "");
        C19546ak.m36521b(aiVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.im.core.a.e$b */
    public static final class C17408b extends AbstractC89220m implements AbstractC89172b<C19672u, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C19538ai f41760a;

        /* renamed from: b */
        final /* synthetic */ AbstractC19479b f41761b;

        static {
            Covode.recordClassIndex(19895);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17408b(C19538ai aiVar, AbstractC19479b bVar) {
            super(1);
            this.f41760a = aiVar;
            this.f41761b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C19672u uVar) {
            C19672u uVar2 = uVar;
            C17551t.m32515a(this.f41760a, uVar2);
            AbstractC19479b bVar = this.f41761b;
            if (bVar != null) {
                bVar.mo27860a(uVar2);
            }
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: com.bytedance.im.core.d.ai */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static List<C19538ai> m32232a(C17587d dVar) {
        long j;
        C89219l.m154721d(dVar, "");
        String str = dVar.f42053a;
        if (str == null) {
            C89219l.m154715b();
        }
        List<? extends C17457c> list = dVar.f42054b;
        if (list == null) {
            C89219l.m154715b();
        }
        List<? extends C19625c> list2 = dVar.f42055c;
        C17456b bVar = dVar.f42058f;
        Map<String, String> map = dVar.f42056d;
        Map<String, String> map2 = dVar.f42057e;
        ReferenceInfo referenceInfo = dVar.f42061i;
        C19638h a = C17397a.f41738b.mo27720a(str);
        if (a == null) {
            C17415a.m32255b().mo27838c("MessageOperator", "buildMessageList conversation null: ".concat(String.valueOf(str)));
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        C19538ai lastMessage = a.getLastMessage();
        if (lastMessage != null) {
            j = lastMessage.getOrderIndex();
        } else {
            j = 0;
        }
        long j2 = j + 1;
        for (C17457c cVar : list) {
            int a2 = C17415a.m32259f().mo27802a(cVar);
            if (a2 < 0) {
                C17415a.m32255b().mo27838c("MessageOperator", "buildMessageList msgType unknown: ".concat(String.valueOf(cVar)));
            } else {
                C19538ai.C19540a aVar = new C19538ai.C19540a();
                aVar.f46383a.conversationId = a.getConversationId();
                aVar.f46383a.conversationShortId = a.getConversationShortId();
                aVar.f46383a.conversationType = a.getConversationType();
                aVar.f46383a.orderIndex = a.getLastMessageOrderIndex() + 1;
                aVar.f46383a.index = a.getLastMessageIndex() + 1;
                aVar.f46383a.indexInConversationV2 = -1;
                C20001i.m37775a().mo31877a("imsdk", "Message conversation content=" + aVar.f46383a.getLogContent() + ", index=" + aVar.f46383a.index + ", orderIndex=" + aVar.f46383a.orderIndex);
                aVar.f46383a.addLocalExt("s:message_index_is_local", "1");
                aVar.f46383a.msgType = a2;
                aVar.f46383a.content = C80342dg.m139300a().mo46674b(cVar);
                aVar.f46383a.uuid = UUID.randomUUID().toString();
                aVar.f46383a.sender = C19679a.m36773a().mo31632b();
                aVar.f46383a.createdAt = System.currentTimeMillis();
                aVar.f46383a.msgStatus = 0;
                aVar.f46383a.secSender = C19679a.m36773a().mo31633c();
                C19538ai aiVar = aVar.f46383a;
                if (map != null) {
                    aiVar.putExt(map);
                }
                if (map2 != null) {
                    aiVar.putLocalExt(map2);
                }
                C89219l.m154716b(aiVar, "");
                aiVar.setOrderIndex(j2);
                if (list2 != null) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        it.next().setMsgUuid(aiVar.getUuid());
                    }
                }
                aiVar.setAttachments(list2);
                if (bVar != null) {
                    C17583c.m32616a(aiVar, bVar);
                }
                if (referenceInfo != null) {
                    aiVar.setRefMsg(referenceInfo);
                }
                C17415a.m32259f().mo27807a(a, aiVar, cVar);
                j2++;
                arrayList.add(aiVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17436f
    /* renamed from: a */
    public final boolean mo27775a(C19538ai aiVar) {
        C89219l.m154721d(aiVar, "");
        return C20010n.m37806a(aiVar);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17436f
    /* renamed from: a */
    public final C19538ai mo27769a(String str, long j) {
        C89219l.m154721d(str, "");
        return C19777i.m37174a(str, j);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17436f
    /* renamed from: a */
    public final void mo27771a(C19538ai aiVar, AbstractC19479b<C19538ai> bVar) {
        C89219l.m154721d(aiVar, "");
        mo27772a(aiVar, bVar, 0, null);
    }

    /* renamed from: b */
    public static void m32233b(C19538ai aiVar, AbstractC19479b<C19538ai> bVar) {
        C89219l.m154721d(aiVar, "");
        C19512f.m36457b("imsdk", "MessageModel addMessage", (Throwable) null);
        if (C19483d.m36365a().mo31141b().f46192A) {
            aiVar = C19994c.m37742a(aiVar);
        }
        RunnableC19987d.m37728a(new AbstractC19986c<Pair<C19638h, C19538ai>>(aiVar) {
            /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1955113 */

            /* renamed from: a */
            final /* synthetic */ C19538ai f46423a;

            static {
                Covode.recordClassIndex(22395);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final /* synthetic */ Pair<C19638h, C19538ai> mo31187a() {
                boolean a = C19777i.m37185a(this.f46423a, true, true);
                C19638h a2 = C19749c.m36999a(this.f46423a.getConversationId(), true);
                if (a2 != null) {
                    a2.setUnreadCount(C19749c.m37025e(a2));
                    a2.setUpdatedTime(Math.max(a2.getUpdatedTime(), this.f46423a.getCreatedAt()));
                    a2.setLastMessageIndex(Math.max(a2.getLastMessageIndex(), this.f46423a.getIndex()));
                    C19749c.m37008a(a2, false);
                }
                if (a) {
                    return new Pair(a2, this.f46423a);
                }
                return null;
            }

            {
                this.f46423a = r1;
            }
        }, new AbstractC19985b<Pair<C19638h, C19538ai>>(bVar, aiVar) {
            /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1955214 */

            /* renamed from: a */
            final /* synthetic */ AbstractC19479b f46424a;

            /* renamed from: b */
            final /* synthetic */ C19538ai f46425b;

            static {
                Covode.recordClassIndex(22396);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(Pair<C19638h, C19538ai> pair) {
                Pair<C19638h, C19538ai> pair2 = pair;
                int i = -3001;
                if (pair2 != null) {
                    if (pair2.first != null) {
                        C19640j.m36671a().mo31590a((C19638h) pair2.first, 2);
                    }
                    AbstractC19479b bVar = this.f46424a;
                    if (bVar != null) {
                        bVar.mo27861a(this.f46425b);
                    }
                } else {
                    this.f46425b.setMsgStatus(3);
                    AbstractC19479b bVar2 = this.f46424a;
                    if (bVar2 != null) {
                        bVar2.mo27860a(C19672u.m36756a(C19978k.m37686a(-3001)));
                    }
                }
                C20014q a = C20014q.m37816a();
                if (pair2 != null) {
                    i = C19489e.AbstractC19491b.f46184a;
                }
                C19538ai aiVar = this.f46425b;
                if (aiVar != null && !TextUtils.isEmpty(aiVar.getConversationId())) {
                    a.mo31898a(aiVar.getConversationId(), new C20014q.AbstractC20039a<AbstractC19674v>(i, aiVar) {
                        /* class com.bytedance.p1399im.core.internal.utils.C20014q.C200356 */

                        /* renamed from: a */
                        final /* synthetic */ int f47616a;

                        /* renamed from: b */
                        final /* synthetic */ C19538ai f47617b;

                        static {
                            Covode.recordClassIndex(22880);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.bytedance.p1399im.core.internal.utils.C20014q.AbstractC20039a
                        /* renamed from: a */
                        public final /* bridge */ /* synthetic */ void mo31914a(AbstractC19674v vVar) {
                            vVar.mo27789a(this.f47616a, this.f47617b);
                        }

                        {
                            this.f47616a = r2;
                            this.f47617b = r3;
                        }
                    });
                }
            }

            {
                this.f46424a = r1;
                this.f46425b = r2;
            }
        });
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17436f
    /* renamed from: a */
    public final void mo27774a(C19587an anVar, AbstractC19479b<C19587an> bVar) {
        C89219l.m154721d(anVar, "");
        C19930x.m37536a();
        new C19816ah(bVar).mo31747a(anVar);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17436f
    /* renamed from: a */
    public final void mo27770a(long j, C19638h hVar, AbstractC19479b<C19538ai> bVar) {
        C19930x.m37536a();
        C19915t tVar = new C19915t(bVar);
        if (!C19915t.f47306a) {
            tVar.mo31788a(j, hVar);
            return;
        }
        C19538ai aiVar = tVar.f47307b.get(Long.valueOf(j));
        if (aiVar != null) {
            tVar.mo31800a(aiVar);
        } else {
            RunnableC19987d.m37729a(new AbstractC19986c<C19538ai>(j) {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19915t.C199161 */

                /* renamed from: a */
                final /* synthetic */ long f47308a;

                static {
                    Covode.recordClassIndex(22760);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ C19538ai mo31187a() {
                    return C19777i.m37172a(this.f47308a);
                }

                {
                    this.f47308a = r2;
                }
            }, new AbstractC19985b<C19538ai>(j, hVar) {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19915t.C199172 */

                /* renamed from: a */
                final /* synthetic */ long f47310a;

                /* renamed from: b */
                final /* synthetic */ C19638h f47311b;

                static {
                    Covode.recordClassIndex(22761);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo31188a(C19538ai aiVar) {
                    if (aiVar != null) {
                        C19915t.this.mo31800a(aiVar);
                    } else {
                        C19915t.this.mo31788a(this.f47310a, this.f47311b);
                    }
                }

                {
                    this.f47310a = r2;
                    this.f47311b = r4;
                }
            }, C19983a.m37717a());
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17436f
    /* renamed from: a */
    public final void mo27773a(C19538ai aiVar, boolean z, AbstractC19479b<C19538ai> bVar) {
        C89219l.m154721d(aiVar, "");
        C19930x a = C19930x.m37536a();
        if (aiVar != null && !TextUtils.isEmpty(aiVar.getConversationId())) {
            C19640j.m36671a().mo31598b(aiVar.getConversationId(), new AbstractC19479b<C19638h>(bVar, aiVar, false) {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x.C199333 */

                /* renamed from: a */
                final /* synthetic */ AbstractC19479b f47390a;

                /* renamed from: b */
                final /* synthetic */ C19538ai f47391b;

                /* renamed from: c */
                final /* synthetic */ boolean f47392c;

                static {
                    Covode.recordClassIndex(22777);
                }

                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final void mo27860a(C19672u uVar) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final /* synthetic */ void mo27861a(C19638h hVar) {
                    boolean z;
                    C19638h hVar2 = hVar;
                    if (hVar2 == null || !hVar2.isStranger()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    C19892k kVar = new C19892k(z, this.f47390a);
                    C19538ai aiVar = this.f47391b;
                    boolean z2 = this.f47392c;
                    C19512f.m36457b("imsdk", "DeleteMsgHandler delete, isLocal:" + z2 + ", stranger:" + kVar.f47238a, (Throwable) null);
                    if (aiVar == null) {
                        kVar.mo31803b(C19978k.m37686a(-1015));
                        return;
                    }
                    kVar.f47239b = aiVar;
                    String uuid = aiVar.getUuid();
                    String conversationId = aiVar.getConversationId();
                    if (TextUtils.isEmpty(uuid) || TextUtils.isEmpty(conversationId)) {
                        kVar.mo31803b(C19978k.m37686a(-1015));
                        return;
                    }
                    C19638h a = C19640j.m36671a().mo31586a(conversationId);
                    if (a != null && aiVar.getMsgId() > 0 && !z2) {
                        int inboxType = a.getInboxType();
                        long conversationShortId = aiVar.getConversationShortId();
                        int conversationType = aiVar.getConversationType();
                        long msgId = aiVar.getMsgId();
                        if (kVar.f47238a) {
                            RequestBody build = new RequestBody.Builder().delete_stranger_message_body(new DeleteStrangerMessageRequestBody.Builder().conversation_short_id(Long.valueOf(conversationShortId)).server_message_id(Long.valueOf(msgId)).build()).build();
                            kVar.f47240c = build;
                            kVar.mo31798a(inboxType, build, null, new Object[0]);
                        } else {
                            RequestBody build2 = new RequestBody.Builder().delete_message_body(new DeleteMessageRequestBody.Builder().conversation_id(conversationId).conversation_short_id(Long.valueOf(conversationShortId)).conversation_type(Integer.valueOf(conversationType)).message_id(Long.valueOf(msgId)).build()).build();
                            kVar.f47240c = build2;
                            kVar.mo31798a(inboxType, build2, null, new Object[0]);
                        }
                    }
                    RunnableC19987d.m37728a(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c5: INVOKE  
                          (wrap: com.bytedance.im.core.internal.b.a.k$1 : 0x00bd: CONSTRUCTOR  (r1v7 com.bytedance.im.core.internal.b.a.k$1) = 
                          (r7v0 'kVar' com.bytedance.im.core.internal.b.a.k)
                          (r4v0 'uuid' java.lang.String)
                          (r3v0 'conversationId' java.lang.String)
                          (r6v0 'aiVar' com.bytedance.im.core.d.ai)
                         call: com.bytedance.im.core.internal.b.a.k.1.<init>(com.bytedance.im.core.internal.b.a.k, java.lang.String, java.lang.String, com.bytedance.im.core.d.ai):void type: CONSTRUCTOR)
                          (wrap: com.bytedance.im.core.internal.b.a.k$2 : 0x00c2: CONSTRUCTOR  (r0v10 com.bytedance.im.core.internal.b.a.k$2) = (r7v0 'kVar' com.bytedance.im.core.internal.b.a.k), (r6v0 'aiVar' com.bytedance.im.core.d.ai) call: com.bytedance.im.core.internal.b.a.k.2.<init>(com.bytedance.im.core.internal.b.a.k, com.bytedance.im.core.d.ai):void type: CONSTRUCTOR)
                         type: STATIC call: com.bytedance.im.core.internal.e.d.a(com.bytedance.im.core.internal.e.c, com.bytedance.im.core.internal.e.b):void in method: com.bytedance.im.core.internal.b.a.x.3.a(com.bytedance.im.core.d.h):void, file: classes10.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00bd: CONSTRUCTOR  (r1v7 com.bytedance.im.core.internal.b.a.k$1) = 
                          (r7v0 'kVar' com.bytedance.im.core.internal.b.a.k)
                          (r4v0 'uuid' java.lang.String)
                          (r3v0 'conversationId' java.lang.String)
                          (r6v0 'aiVar' com.bytedance.im.core.d.ai)
                         call: com.bytedance.im.core.internal.b.a.k.1.<init>(com.bytedance.im.core.internal.b.a.k, java.lang.String, java.lang.String, com.bytedance.im.core.d.ai):void type: CONSTRUCTOR in method: com.bytedance.im.core.internal.b.a.x.3.a(com.bytedance.im.core.d.h):void, file: classes10.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 22 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.core.internal.b.a.k, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 28 more
                        */
                    /*
                    // Method dump skipped, instructions count: 266
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x.C199333.mo27861a(java.lang.Object):void");
                }

                {
                    this.f47390a = r2;
                    this.f47391b = r3;
                    this.f47392c = r4;
                }
            });
        } else if (bVar != null) {
            bVar.mo27860a(C19672u.m36756a(C19978k.m37686a(-1015)));
        }
    }

    /* renamed from: a */
    public final void mo27772a(C19538ai aiVar, AbstractC19479b<C19538ai> bVar, int i, C19672u uVar) {
        C89219l.m154721d(aiVar, "");
        C17415a.m32259f().mo27806a(aiVar);
        AbstractC19479b a = C17453a.m32406a(new C17407a(bVar), new C17408b(aiVar, bVar));
        if (!aiVar.getExt().containsKey("old_client_message_id")) {
            Map<String, String> ext = aiVar.getExt();
            C89219l.m154716b(ext, "");
            ext.put("old_client_message_id", String.valueOf(C17468a.m32437a()));
        }
        try {
            Long l = C17570g.f42026c;
            if (l != null) {
                Map<String, String> ext2 = aiVar.getExt();
                C89219l.m154716b(ext2, "");
                ext2.put("im_client_send_msg_time", String.valueOf(System.currentTimeMillis() + l.longValue()));
            }
        } catch (Exception unused) {
        }
        C17456b a2 = C17583c.f42044a.mo28024a(aiVar);
        if (a2 != null) {
            a2.f41807h = C17415a.m32257d().mo27858a();
            if (!a2.f41807h) {
                C17415a.m32256c();
            }
            a2.f41804e = SystemClock.uptimeMillis();
        }
        if (i != 0) {
            mo27776b(aiVar);
            C19638h a3 = C17397a.f41738b.mo27720a(aiVar.getConversationId());
            if (a3 != null) {
                C19640j.m36671a().mo31590a(a3, 2);
            }
            C20014q.m37816a().mo31891a(i, aiVar, (C19600ay) null);
            a.mo27860a(uVar);
            return;
        }
        C19546ak.m36519a(aiVar, a);
    }
}
