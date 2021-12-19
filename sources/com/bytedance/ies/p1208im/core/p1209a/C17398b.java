package com.bytedance.ies.p1208im.core.p1209a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17423b;
import com.bytedance.ies.p1208im.core.api.p1215e.C17453a;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1419a.C19769e;
import com.bytedance.p1399im.core.internal.p1427b.C19786a;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19787a;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19794ab;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19832ak;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19846ao;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19849ap;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19854as;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19857at;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19895l;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.AbstractC19669r;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19656k;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.proto.ConversationAddParticipantsRequestBody;
import com.bytedance.p1399im.core.proto.ConversationLeaveRequestBody;
import com.bytedance.p1399im.core.proto.ConversationRemoveParticipantsRequestBody;
import com.bytedance.p1399im.core.proto.DissolveConversationRequestBody;
import com.bytedance.p1399im.core.proto.RequestBody;
import com.bytedance.p1399im.core.proto.SetConversationCoreInfoRequestBody;
import com.bytedance.p1399im.core.proto.SetConversationSettingInfoRequestBody;
import com.bytedance.p1399im.core.proto.UpdateConversationParticipantRequestBody;
import com.bytedance.p1399im.core.proto.UpsertConversationSettingExtInfoRequestBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.a.b */
public final class C17398b extends AbstractC17427b {

    /* renamed from: b */
    public final String f41739b;

    /* renamed from: c */
    private final AbstractC89516am f41740c = C89517an.m155448a(C89546bf.f203266a);

    /* renamed from: d */
    private final AbstractC89244h f41741d = C89250i.m154773a((AbstractC89171a) new C17399a(this));

    static {
        Covode.recordClassIndex(19885);
    }

    /* renamed from: f */
    private final C19656k m32196f() {
        return (C19656k) this.f41741d.getValue();
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b
    /* renamed from: b */
    public final String mo27743b() {
        return this.f41739b;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b
    /* renamed from: a */
    public final void mo27742a(boolean z, AbstractC19479b<C19638h> bVar) {
        C19656k f = m32196f();
        if (C19640j.m36671a().mo31586a(f.f46702a) != null) {
            C19930x.m37536a();
            String str = f.f46702a;
            C19849ap apVar = new C19849ap(bVar);
            C19638h a = C19640j.m36671a().mo31586a(str);
            RequestBody build = new RequestBody.Builder().set_conversation_setting_info_body(new SetConversationSettingInfoRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).set_stick_on_top(Boolean.valueOf(z)).build()).build();
            int inboxType = a.getInboxType();
            Object[] objArr = new Object[3];
            boolean z2 = false;
            objArr[0] = str;
            if (C19483d.m36365a().mo31141b().f46195D && z) {
                z2 = true;
            }
            objArr[1] = Boolean.valueOf(z2);
            objArr[2] = "s:stick_on_top";
            apVar.mo31798a(inboxType, build, null, objArr);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b
    /* renamed from: a */
    public final void mo27741a(Map<String, String> map, AbstractC19479b<C19638h> bVar) {
        C89219l.m154721d(map, "");
        C19656k f = m32196f();
        if (C19640j.m36671a().mo31586a(f.f46702a) != null) {
            C19930x.m37536a();
            String str = f.f46702a;
            C19857at atVar = new C19857at(bVar);
            if (map != null) {
                C19638h a = C19640j.m36671a().mo31586a(str);
                RequestBody build = new RequestBody.Builder().upsert_conversation_setting_ext_info_body(new UpsertConversationSettingExtInfoRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).ext(map).build()).build();
                atVar.mo31798a(a.getInboxType(), build, null, str);
            }
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b
    /* renamed from: a */
    public final void mo27734a() {
        m32196f().mo31194a();
    }

    /* renamed from: com.bytedance.ies.im.core.a.b$a */
    static final class C17399a extends AbstractC89220m implements AbstractC89171a<C19656k> {

        /* renamed from: a */
        final /* synthetic */ C17398b f41742a;

        static {
            Covode.recordClassIndex(19886);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17399a(C17398b bVar) {
            super(0);
            this.f41742a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19656k invoke() {
            return new C19656k(this.f41742a.f41739b);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b
    /* renamed from: c */
    public final C19638h mo27749c() {
        return C17397a.f41738b.mo27720a(this.f41739b);
    }

    /* renamed from: com.bytedance.ies.im.core.a.b$b */
    static final class RunnableC17400b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C17398b f41743a;

        /* renamed from: b */
        final /* synthetic */ AbstractC19479b f41744b;

        static {
            Covode.recordClassIndex(19887);
        }

        RunnableC17400b(C17398b bVar, AbstractC19479b bVar2) {
            this.f41743a = bVar;
            this.f41744b = bVar2;
        }

        public final void run() {
            AbstractC19479b bVar = this.f41744b;
            if (bVar != null) {
                bVar.mo27861a(C17397a.f41738b.mo27720a(this.f41743a.f41739b));
            }
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b
    /* renamed from: e */
    public final void mo27751e() {
        C19640j.m36671a();
        String str = this.f41739b;
        C19640j.m36671a().mo31598b(str, new AbstractC19479b<C19638h>(str) {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x.C199322 */

            /* renamed from: a */
            final /* synthetic */ String f47388a;

            static {
                Covode.recordClassIndex(22776);
            }

            @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
            /* renamed from: a */
            public final void mo27860a(C19672u uVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
            /* renamed from: a */
            public final /* synthetic */ void mo27861a(C19638h hVar) {
                C19638h hVar2 = hVar;
                if (hVar2 == null || !hVar2.isStranger()) {
                    C19813ag agVar = new C19813ag();
                    String str = this.f47388a;
                    RunnableC19987d.m37728a(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0080: INVOKE  
                          (wrap: com.bytedance.im.core.internal.b.a.ag$1 : 0x0078: CONSTRUCTOR  (r1v0 com.bytedance.im.core.internal.b.a.ag$1) = (r3v0 'agVar' com.bytedance.im.core.internal.b.a.ag), (r2v0 'str' java.lang.String) call: com.bytedance.im.core.internal.b.a.ag.1.<init>(com.bytedance.im.core.internal.b.a.ag, java.lang.String):void type: CONSTRUCTOR)
                          (wrap: com.bytedance.im.core.internal.b.a.ag$2 : 0x007d: CONSTRUCTOR  (r0v0 com.bytedance.im.core.internal.b.a.ag$2) = (r3v0 'agVar' com.bytedance.im.core.internal.b.a.ag), (r2v0 'str' java.lang.String) call: com.bytedance.im.core.internal.b.a.ag.2.<init>(com.bytedance.im.core.internal.b.a.ag, java.lang.String):void type: CONSTRUCTOR)
                         type: STATIC call: com.bytedance.im.core.internal.e.d.a(com.bytedance.im.core.internal.e.c, com.bytedance.im.core.internal.e.b):void in method: com.bytedance.im.core.internal.b.a.x.2.a(com.bytedance.im.core.d.h):void, file: classes10.dex
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0078: CONSTRUCTOR  (r1v0 com.bytedance.im.core.internal.b.a.ag$1) = (r3v0 'agVar' com.bytedance.im.core.internal.b.a.ag), (r2v0 'str' java.lang.String) call: com.bytedance.im.core.internal.b.a.ag.1.<init>(com.bytedance.im.core.internal.b.a.ag, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.im.core.internal.b.a.x.2.a(com.bytedance.im.core.d.h):void, file: classes10.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 21 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.core.internal.b.a.ag, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 27 more
                        */
                    /*
                    // Method dump skipped, instructions count: 132
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x.C199322.mo27861a(java.lang.Object):void");
                }

                {
                    this.f47388a = r2;
                }
            });
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b
        /* renamed from: d */
        public final void mo27750d() {
            C19656k f = m32196f();
            C19512f.m36457b("imsdk", "ConversationModel queryMemberList:" + f.f46702a, (Throwable) null);
            RunnableC19987d.m37728a(new AbstractC19986c<List<C19537ah>>() {
                /* class com.bytedance.p1399im.core.p1408d.C19656k.C196571 */

                static {
                    Covode.recordClassIndex(22501);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final /* synthetic */ List<C19537ah> mo31187a() {
                    return C19769e.m37143b(C19656k.this.f46702a);
                }
            }, new AbstractC19985b<List<C19537ah>>() {
                /* class com.bytedance.p1399im.core.p1408d.C19656k.C196593 */

                /* renamed from: a */
                final /* synthetic */ AbstractC19479b f46708a = null;

                static {
                    Covode.recordClassIndex(22503);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo31188a(List<C19537ah> list) {
                    List<C19537ah> list2 = list;
                    C19656k kVar = C19656k.this;
                    kVar.mo28005a(kVar.f46702a, list2);
                    AbstractC19479b bVar = this.f46708a;
                    if (bVar != null) {
                        bVar.mo27861a(list2);
                    }
                }
            });
        }

        /* renamed from: com.bytedance.ies.im.core.a.b$c */
        static final class C17401c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

            /* renamed from: a */
            int f41745a;

            /* renamed from: b */
            final /* synthetic */ C17398b f41746b;

            /* renamed from: c */
            final /* synthetic */ Map f41747c;

            static {
                Covode.recordClassIndex(19888);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C17401c(C17398b bVar, Map map, AbstractC89124d dVar) {
                super(2, dVar);
                this.f41746b = bVar;
                this.f41747c = map;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C17401c(this.f41746b, this.f41747c, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                return ((C17401c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                if (this.f41745a == 0) {
                    C89382r.m154942a(obj);
                    C19749c.m37013a(this.f41746b.f41739b, this.f41747c);
                    return C89391z.f203057a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public C17398b(String str) {
            C89219l.m154721d(str, "");
            this.f41739b = str;
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b
        /* renamed from: a */
        public final void mo27740a(Map<String, String> map) {
            C89219l.m154721d(map, "");
            AbstractC89568bz unused = C89624i.m155555a(this.f41740c, null, null, new C17401c(this, map, null), 3);
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b
        /* renamed from: a */
        public final void mo27735a(AbstractC17423b bVar) {
            C89219l.m154721d(bVar, "");
            C19656k f = m32196f();
            f.f46703b = bVar;
            C20014q a = C20014q.m37816a();
            String str = f.f46702a;
            List<AbstractC19669r> list = a.f47558d.get(str);
            if (list == null) {
                list = new ArrayList<>();
            }
            if (!list.contains(f)) {
                int i = 0;
                while (i < list.size() && (list.get(i) == null || f.mo28016d() >= list.get(i).mo28016d())) {
                    i++;
                }
                list.add(i, f);
            }
            a.f47558d.put(str, list);
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b
        /* renamed from: b */
        public final void mo27744b(AbstractC19479b<String> bVar) {
            C19656k f = m32196f();
            C19930x.m37536a();
            String str = f.f46702a;
            C19895l lVar = new C19895l(bVar);
            C19638h a = C19640j.m36671a().mo31586a(str);
            if (a == null) {
                lVar.mo31803b(C19978k.m37686a(-1017));
                return;
            }
            C19786a.m37237b(a.getInboxType(), str);
            RequestBody build = new RequestBody.Builder().dissolve_conversation_body(new DissolveConversationRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).build()).build();
            lVar.mo31798a(a.getInboxType(), build, null, str, true);
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b
        /* renamed from: a */
        public final void mo27736a(AbstractC19479b<String> bVar) {
            C19656k f = m32196f();
            C19930x.m37536a();
            String str = f.f46702a;
            C19794ab abVar = new C19794ab(bVar);
            C19638h a = C19640j.m36671a().mo31586a(str);
            if (a == null) {
                abVar.mo31799a(C19672u.m36756a(C19978k.m37686a(-1017)));
                return;
            }
            RequestBody build = new RequestBody.Builder().leave_conversation_body(new ConversationLeaveRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).build()).build();
            abVar.mo31798a(a.getInboxType(), build, null, str, true);
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b
        /* renamed from: b */
        public final void mo27747b(Map<String, String> map, AbstractC19479b<C19638h> bVar) {
            C89219l.m154721d(map, "");
            C19656k f = m32196f();
            RunnableC17400b bVar2 = new RunnableC17400b(this, bVar);
            String str = f.f46702a;
            C19512f.m36457b("imsdk", "ConversationModel updateLocal, conversationId:".concat(String.valueOf(str)), (Throwable) null);
            RunnableC19987d.m37728a(new AbstractC19986c<Boolean>(str, map) {
                /* class com.bytedance.p1399im.core.p1408d.C19656k.C196626 */

                /* renamed from: a */
                final /* synthetic */ String f46715a;

                /* renamed from: b */
                final /* synthetic */ Map f46716b;

                static {
                    Covode.recordClassIndex(22506);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final /* synthetic */ Boolean mo31187a() {
                    return Boolean.valueOf(C19749c.m37013a(this.f46715a, this.f46716b));
                }

                {
                    this.f46715a = r1;
                    this.f46716b = r2;
                }
            }, new AbstractC19985b<Boolean>(str, map, bVar2) {
                /* class com.bytedance.p1399im.core.p1408d.C19656k.C196582 */

                /* renamed from: a */
                final /* synthetic */ String f46705a;

                /* renamed from: b */
                final /* synthetic */ Map f46706b;

                /* renamed from: c */
                final /* synthetic */ Runnable f46707c;

                static {
                    Covode.recordClassIndex(22502);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                /* renamed from: a */
                public final /* synthetic */ void mo31188a(Boolean bool) {
                    C19638h a;
                    Boolean bool2 = bool;
                    if (!(bool2 == null || !bool2.booleanValue() || (a = C19640j.m36671a().mo31586a(this.f46705a)) == null)) {
                        a.setLocalExt(this.f46706b);
                        C19640j.m36671a().mo31590a(a, 10);
                    }
                    Runnable runnable = this.f46707c;
                    if (runnable != null) {
                        runnable.run();
                    }
                }

                {
                    this.f46705a = r1;
                    this.f46706b = r2;
                    this.f46707c = r3;
                }
            });
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b
        /* renamed from: b */
        public final void mo27745b(String str, AbstractC19479b<C19537ah> bVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(bVar, "");
            long a = C17453a.m32405a(str, bVar);
            if (a > 0) {
                C19656k f = m32196f();
                String str2 = this.f41739b;
                String valueOf = String.valueOf(a);
                C19512f.m36457b("imsdk", "ConversationModel queryMember, conversationId:" + f.f46702a + ", uid:" + valueOf, (Throwable) null);
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(valueOf)) {
                    RunnableC19987d.m37728a(new AbstractC19986c<C19537ah>(str2, valueOf) {
                        /* class com.bytedance.p1399im.core.p1408d.C19656k.C196604 */

                        /* renamed from: a */
                        final /* synthetic */ String f46710a;

                        /* renamed from: b */
                        final /* synthetic */ String f46711b;

                        static {
                            Covode.recordClassIndex(22504);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                        /* renamed from: a */
                        public final /* bridge */ /* synthetic */ C19537ah mo31187a() {
                            return C19769e.m37135a(this.f46710a, this.f46711b);
                        }

                        {
                            this.f46710a = r2;
                            this.f46711b = r3;
                        }
                    }, new AbstractC19985b<C19537ah>(bVar) {
                        /* class com.bytedance.p1399im.core.p1408d.C19656k.C196615 */

                        /* renamed from: a */
                        final /* synthetic */ AbstractC19479b f46713a;

                        static {
                            Covode.recordClassIndex(22505);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                        /* renamed from: a */
                        public final /* bridge */ /* synthetic */ void mo31188a(C19537ah ahVar) {
                            this.f46713a.mo27861a(ahVar);
                        }

                        {
                            this.f46713a = r2;
                        }
                    });
                }
            }
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b
        /* renamed from: a */
        public final void mo27738a(String str, AbstractC19479b<C19638h> bVar) {
            C89219l.m154721d(str, "");
            C19656k f = m32196f();
            if (C19640j.m36671a().mo31586a(f.f46702a) != null) {
                C19930x.m37536a();
                String str2 = f.f46702a;
                C19846ao aoVar = new C19846ao(bVar);
                HashMap hashMap = new HashMap();
                C19638h a = C19640j.m36671a().mo31586a(str2);
                RequestBody build = new RequestBody.Builder().set_conversation_core_info_body(new SetConversationCoreInfoRequestBody.Builder().conversation_id(str2).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).ext(hashMap).name(str).is_name_set(true).build()).build();
                aoVar.mo31798a(a.getInboxType(), build, null, str2, "s:name");
            }
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b
        /* renamed from: b */
        public final void mo27748b(boolean z, AbstractC19479b<C19638h> bVar) {
            C19656k f = m32196f();
            if (C19640j.m36671a().mo31586a(f.f46702a) != null) {
                C19930x.m37536a();
                String str = f.f46702a;
                C19849ap apVar = new C19849ap(bVar);
                C19638h a = C19640j.m36671a().mo31586a(str);
                RequestBody build = new RequestBody.Builder().set_conversation_setting_info_body(new SetConversationSettingInfoRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).set_mute(Boolean.valueOf(z)).build()).build();
                apVar.mo31798a(a.getInboxType(), build, null, str, false, "s:mute");
            }
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b
        /* renamed from: b */
        public final void mo27746b(List<String> list, Map<String, String> map, AbstractC19479b<List<C19537ah>> bVar) {
            C89219l.m154721d(list, "");
            List<Long> a = C17453a.m32407a(list);
            C19656k f = m32196f();
            C19930x.m37536a();
            String str = f.f46702a;
            C19832ak akVar = new C19832ak(bVar);
            if (a != null && !a.isEmpty()) {
                C19638h a2 = C19640j.m36671a().mo31586a(str);
                ConversationRemoveParticipantsRequestBody.Builder participants = new ConversationRemoveParticipantsRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).participants(a);
                if (map != null) {
                    participants.biz_ext(map);
                }
                RequestBody build = new RequestBody.Builder().conversation_remove_participants_body(participants.build()).build();
                akVar.mo31798a(a2.getInboxType(), build, null, str, a);
            }
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b
        /* renamed from: a */
        public final void mo27739a(List<String> list, Map<String, String> map, AbstractC19479b<List<C19537ah>> bVar) {
            C19638h a;
            C89219l.m154721d(list, "");
            List<Long> a2 = C17453a.m32407a(list);
            C19656k f = m32196f();
            C19930x.m37536a();
            String str = f.f46702a;
            C19787a aVar = new C19787a(bVar);
            if (a2 != null && !a2.isEmpty() && (a = C19640j.m36671a().mo31586a(str)) != null) {
                long conversationShortId = a.getConversationShortId();
                int conversationType = a.getConversationType();
                int inboxType = a.getInboxType();
                if (!a2.isEmpty() && !TextUtils.isEmpty(str)) {
                    ConversationAddParticipantsRequestBody.Builder participants = new ConversationAddParticipantsRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(conversationShortId)).conversation_type(Integer.valueOf(conversationType)).participants(a2);
                    participants.biz_ext(map);
                    aVar.mo31798a(inboxType, new RequestBody.Builder().conversation_add_participants_body(participants.build()).build(), null, str, a2);
                }
            }
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b
        /* renamed from: a */
        public final void mo27737a(String str, int i, Map<String, String> map, AbstractC19479b<C19537ah> bVar) {
            C89219l.m154721d(str, "");
            long a = C17453a.m32405a(str, bVar);
            if (a > 0) {
                C19656k f = m32196f();
                if (C19640j.m36671a().mo31586a(f.f46702a) != null) {
                    C19930x.m37536a();
                    String str2 = f.f46702a;
                    C19854as asVar = new C19854as(bVar);
                    C19638h a2 = C19640j.m36671a().mo31586a(str2);
                    UpdateConversationParticipantRequestBody.Builder role = new UpdateConversationParticipantRequestBody.Builder().conversation_id(str2).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).user_id(Long.valueOf(a)).role(Integer.valueOf(i));
                    if (map != null) {
                        role.biz_ext(map);
                    }
                    RequestBody build = new RequestBody.Builder().update_conversation_participant_body(role.build()).build();
                    asVar.mo31798a(a2.getInboxType(), build, null, str2);
                }
            }
        }
    }
