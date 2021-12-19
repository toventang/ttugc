package com.bytedance.ies.p1208im.core.p1226g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17422a;
import com.bytedance.ies.p1208im.core.p1209a.C17397a;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19672u;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.g.a */
public final class C17573a implements AbstractC17422a {

    /* renamed from: c */
    public static final C17574a f42029c = new C17574a((byte) 0);

    /* renamed from: a */
    volatile int f42030a;

    /* renamed from: b */
    public final HandlerC17580b f42031b;

    /* renamed from: d */
    private final AbstractC89244h f42032d = C89250i.m154773a((AbstractC89171a) new C17577d(this));

    /* renamed from: e */
    private final AbstractC89244h f42033e = C89250i.m154773a((AbstractC89171a) C17576c.f42036a);

    static {
        Covode.recordClassIndex(20062);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C17577d.HandlerC175781 mo28000a() {
        return (C17577d.HandlerC175781) this.f42032d.getValue();
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: a */
    public final void mo28002a(C19638h hVar, int i) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: a */
    public final void mo28003a(String str, int i) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: a */
    public final void mo28004a(String str, int i, List list) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: a */
    public final void mo28005a(String str, List list) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: a */
    public final void mo28006a(List list) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19667p
    /* renamed from: a */
    public final void mo28007a(Map map) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map<String, Integer> mo28009b() {
        return (Map) this.f42033e.getValue();
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: b */
    public final void mo28010b(C19638h hVar) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: b */
    public final void mo28012b(List list) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: c */
    public final void mo28014c(C19638h hVar) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: c */
    public final void mo28015c(List list) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: d */
    public final int mo28016d() {
        return 0;
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: d */
    public final void mo28017d(C19638h hVar) {
    }

    /* renamed from: com.bytedance.ies.im.core.g.a$a */
    static final class C17574a {
        static {
            Covode.recordClassIndex(20063);
        }

        private C17574a() {
        }

        public /* synthetic */ C17574a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.im.core.g.a$c */
    static final class C17576c extends AbstractC89220m implements AbstractC89171a<Map<String, Integer>> {

        /* renamed from: a */
        public static final C17576c f42036a = new C17576c();

        static {
            Covode.recordClassIndex(20065);
        }

        C17576c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<String, Integer> invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.bytedance.ies.im.core.g.a$d */
    static final class C17577d extends AbstractC89220m implements AbstractC89171a<HandlerC175781> {

        /* renamed from: a */
        final /* synthetic */ C17573a f42037a;

        static {
            Covode.recordClassIndex(20066);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17577d(C17573a aVar) {
            super(0);
            this.f42037a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HandlerC175781 invoke() {
            return new Handler(this, Looper.getMainLooper()) {
                /* class com.bytedance.ies.p1208im.core.p1226g.C17573a.C17577d.HandlerC175781 */

                /* renamed from: a */
                final /* synthetic */ C17577d f42038a;

                static {
                    Covode.recordClassIndex(20067);
                }

                public final void handleMessage(Message message) {
                    C89219l.m154721d(message, "");
                    C17573a aVar = this.f42038a.f42037a;
                    Object obj = message.obj;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj;
                    C17415a.m32255b().mo27836b("MsgSender_CQ", "handleMessage[" + str + ']');
                    aVar.mo28011b(str);
                    aVar.f42031b.mo28020a(str, true, C19672u.m36755a().mo31630a("CQ timeout").f46736a);
                }

                {
                    this.f42038a = r1;
                }
            };
        }
    }

    /* renamed from: c */
    public final void mo28013c() {
        C17415a.m32255b().mo27836b("MsgSender_CQ", "clear");
        mo28009b().clear();
    }

    /* renamed from: com.bytedance.ies.im.core.g.a$b */
    public static final class C17575b implements AbstractC19479b<C19638h> {

        /* renamed from: a */
        final /* synthetic */ C17573a f42034a;

        /* renamed from: b */
        final /* synthetic */ String f42035b;

        static {
            Covode.recordClassIndex(20064);
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            C17415a.m32255b().mo27838c("MsgSender_CQ", "create onFailure[" + this.f42035b + "]: " + uVar);
            this.f42034a.mo28011b(this.f42035b);
            this.f42034a.f42031b.mo28020a(this.f42035b, true, uVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(C19638h hVar) {
            C17415a.m32255b().mo27836b("MsgSender_CQ", "create onSuccess[" + this.f42035b + ']');
            C19640j.m36671a();
            C19640j.m36675b(this.f42035b);
        }

        C17575b(C17573a aVar, String str) {
            this.f42034a = aVar;
            this.f42035b = str;
        }
    }

    /* renamed from: com.bytedance.ies.im.core.g.a$e */
    public static final class C17579e implements AbstractC19479b<C19638h> {

        /* renamed from: a */
        final /* synthetic */ C17573a f42039a;

        /* renamed from: b */
        final /* synthetic */ String f42040b;

        static {
            Covode.recordClassIndex(20068);
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            C17415a.m32255b().mo27838c("MsgSender_CQ", "pull conversation[" + this.f42040b + "]: " + uVar);
            this.f42039a.mo28011b(this.f42040b);
            this.f42039a.f42031b.mo28020a(this.f42040b, true, uVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(C19638h hVar) {
            C17415a.m32255b().mo27836b("MsgSender_CQ", "pull conversation onSuccess[" + this.f42040b + ']');
            this.f42039a.mo28011b(this.f42040b);
            this.f42039a.f42031b.mo28020a(this.f42040b, false, (C19672u) null);
        }

        C17579e(C17573a aVar, String str) {
            this.f42039a = aVar;
            this.f42040b = str;
        }
    }

    public C17573a(HandlerC17580b bVar) {
        C89219l.m154721d(bVar, "");
        this.f42031b = bVar;
        C17397a.f41738b.mo27723a(this);
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: a */
    public final void mo28001a(C19638h hVar) {
        C89219l.m154721d(hVar, "");
        C17415a.m32255b().mo27836b("MsgSender_CQ", "onCreateConversation[" + hVar.getConversationId() + "]: " + hVar.isTemp());
        if (!hVar.isTemp()) {
            String conversationId = hVar.getConversationId();
            C89219l.m154716b(conversationId, "");
            mo28011b(conversationId);
        }
        HandlerC17580b bVar = this.f42031b;
        String conversationId2 = hVar.getConversationId();
        C89219l.m154716b(conversationId2, "");
        bVar.mo28020a(conversationId2, false, (C19672u) null);
    }

    /* renamed from: b */
    public final void mo28011b(String str) {
        MethodCollector.m26663i(7422);
        C17415a.m32255b().mo27836b("MsgSender_CQ", "dequeue before[" + str + "]: " + mo28009b().size());
        synchronized (mo28009b()) {
            try {
                if (mo28009b().containsKey(str)) {
                    Integer remove = mo28009b().remove(str);
                    if (remove == null) {
                        C89219l.m154715b();
                    }
                    int intValue = remove.intValue();
                    C17415a.m32255b().mo27827a("MsgSender_CQ", "cancelTimeOut[" + str + "]: " + intValue);
                    mo28000a().removeMessages(intValue);
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(7422);
                throw th;
            }
        }
        C17415a.m32255b().mo27836b("MsgSender_CQ", "dequeue after[" + str + "]: " + mo28009b().size());
        MethodCollector.m26664o(7422);
    }

    /* renamed from: a */
    public final boolean mo28008a(String str) {
        boolean containsKey;
        MethodCollector.m26663i(7277);
        C89219l.m154721d(str, "");
        synchronized (mo28009b()) {
            try {
                containsKey = mo28009b().containsKey(str);
            } finally {
                MethodCollector.m26664o(7277);
            }
        }
        return containsKey;
    }
}
