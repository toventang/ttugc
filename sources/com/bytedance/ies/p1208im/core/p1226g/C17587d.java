package com.bytedance.ies.p1208im.core.p1226g;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17424c;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17426e;
import com.bytedance.ies.p1208im.core.api.p1215e.C17453a;
import com.bytedance.ies.p1208im.core.api.p1216f.C17456b;
import com.bytedance.ies.p1208im.core.api.p1216f.C17457c;
import com.bytedance.ies.p1208im.core.p1209a.C17397a;
import com.bytedance.ies.p1208im.core.p1209a.C17406e;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19625c;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.proto.ReferenceInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.g.d */
public final class C17587d {

    /* renamed from: l */
    public static volatile int f42051l;

    /* renamed from: m */
    public static final C17588a f42052m = new C17588a((byte) 0);

    /* renamed from: a */
    public String f42053a;

    /* renamed from: b */
    public List<? extends C17457c> f42054b;

    /* renamed from: c */
    public List<? extends C19625c> f42055c;

    /* renamed from: d */
    public Map<String, String> f42056d;

    /* renamed from: e */
    public Map<String, String> f42057e;

    /* renamed from: f */
    public C17456b f42058f;

    /* renamed from: g */
    public int f42059g;

    /* renamed from: h */
    public AbstractC17424c f42060h;

    /* renamed from: i */
    public ReferenceInfo f42061i;

    /* renamed from: j */
    long f42062j;

    /* renamed from: k */
    public final int f42063k;

    /* renamed from: n */
    private boolean f42064n;

    /* renamed from: o */
    private int f42065o;

    /* renamed from: p */
    private List<C19538ai> f42066p;

    static {
        Covode.recordClassIndex(20076);
    }

    /* renamed from: com.bytedance.ies.im.core.g.d$a */
    public static final class C17588a {
        static {
            Covode.recordClassIndex(20077);
        }

        private C17588a() {
        }

        public /* synthetic */ C17588a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final AbstractC17426e mo28025a() {
        AbstractC17424c cVar = this.f42060h;
        if (!(cVar instanceof AbstractC17426e)) {
            cVar = null;
        }
        return (AbstractC17426e) cVar;
    }

    /* renamed from: c */
    private final List<C19538ai> m32624c() {
        List<C19538ai> list = this.f42066p;
        if (list == null || list.isEmpty()) {
            this.f42066p = C17406e.m32232a(this);
        }
        List<C19538ai> list2 = this.f42066p;
        if (list2 == null) {
            C89219l.m154715b();
        }
        return list2;
    }

    /* renamed from: b */
    private final void m32623b() {
        if (this.f42065o < 2) {
            this.f42065o = 2;
            for (T t : m32624c()) {
                int i = this.f42059g;
                if (i < 0 || i > 5) {
                    i = 2;
                }
                t.setMsgStatus(i);
                C17406e.m32233b(t, C17453a.m32406a((AbstractC89172b) null, C17589b.f42067a));
            }
        }
    }

    public final String toString() {
        Integer num;
        StringBuilder append = new StringBuilder("MessageTask{").append(this.f42053a).append(", ").append(this.f42063k).append(", ");
        List<? extends C17457c> list = this.f42054b;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        return append.append(num).append(", ").append(this.f42064n).append(", ").append(this.f42065o).append('}').toString();
    }

    private C17587d(int i) {
        this.f42063k = i;
        this.f42059g = -1;
        this.f42065o = -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.im.core.g.d$b */
    public static final class C17589b extends AbstractC89220m implements AbstractC89172b<C19672u, C89391z> {

        /* renamed from: a */
        public static final C17589b f42067a = new C17589b();

        static {
            Covode.recordClassIndex(20078);
        }

        C17589b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C19672u uVar) {
            C17415a.m32255b().mo27838c("MsgSender_Task", "addMessageForLocalOnly onError: ".concat(String.valueOf(uVar)));
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.im.core.g.d$e */
    public static final class C17592e extends AbstractC89220m implements AbstractC89172b<C19672u, C89391z> {

        /* renamed from: a */
        public static final C17592e f42080a = new C17592e();

        static {
            Covode.recordClassIndex(20081);
        }

        C17592e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C19672u uVar) {
            C17415a.m32255b().mo27838c("MsgSender_Task", "onConversationTemp onError: ".concat(String.valueOf(uVar)));
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.im.core.g.d$c */
    public static final class C17590c extends AbstractC89220m implements AbstractC89172b<C19538ai, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C19538ai f42068a;

        /* renamed from: b */
        final /* synthetic */ C17587d f42069b;

        /* renamed from: c */
        final /* synthetic */ C19638h f42070c;

        /* renamed from: d */
        final /* synthetic */ List f42071d;

        /* renamed from: e */
        final /* synthetic */ List f42072e;

        /* renamed from: f */
        final /* synthetic */ Map f42073f;

        static {
            Covode.recordClassIndex(20079);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17590c(C19538ai aiVar, C17587d dVar, C19638h hVar, List list, List list2, Map map) {
            super(1);
            this.f42068a = aiVar;
            this.f42069b = dVar;
            this.f42070c = hVar;
            this.f42071d = list;
            this.f42072e = list2;
            this.f42073f = map;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C19538ai aiVar) {
            AbstractC17426e a = this.f42069b.mo28025a();
            if (a != null) {
                a.mo27800a(this.f42068a);
            }
            List list = this.f42071d;
            if (aiVar == null) {
                aiVar = this.f42068a;
            }
            list.add(aiVar);
            this.f42069b.mo28029a(this.f42072e, this.f42071d, this.f42073f);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.im.core.g.d$d */
    public static final class C17591d extends AbstractC89220m implements AbstractC89172b<C19672u, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C19538ai f42074a;

        /* renamed from: b */
        final /* synthetic */ C17587d f42075b;

        /* renamed from: c */
        final /* synthetic */ C19638h f42076c;

        /* renamed from: d */
        final /* synthetic */ List f42077d;

        /* renamed from: e */
        final /* synthetic */ List f42078e;

        /* renamed from: f */
        final /* synthetic */ Map f42079f;

        static {
            Covode.recordClassIndex(20080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17591d(C19538ai aiVar, C17587d dVar, C19638h hVar, List list, List list2, Map map) {
            super(1);
            this.f42074a = aiVar;
            this.f42075b = dVar;
            this.f42076c = hVar;
            this.f42077d = list;
            this.f42078e = list2;
            this.f42079f = map;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C19672u uVar) {
            C19672u uVar2 = uVar;
            AbstractC17426e a = this.f42075b.mo28025a();
            if (a != null) {
                a.mo27801a(this.f42074a, uVar2);
            }
            Map map = this.f42079f;
            C19538ai aiVar = this.f42074a;
            if (uVar2 == null) {
                uVar2 = C19672u.m36755a().mo31630a("Unknown error").f46736a;
            }
            C89219l.m154716b(uVar2, "");
            map.put(aiVar, uVar2);
            this.f42075b.mo28029a(this.f42078e, this.f42077d, this.f42079f);
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private static String m32622b(C19638h hVar) {
        return "Conversation{" + hVar.getConversationId() + ", " + hVar.isTemp() + '}';
    }

    /* renamed from: a */
    public final void mo28026a(C19638h hVar) {
        C89219l.m154721d(hVar, "");
        C17415a.m32255b().mo27836b("MsgSender_Task", "onConversationTemp: " + m32622b(hVar) + ", " + this);
        if (this.f42064n) {
            m32623b();
        } else if (this.f42065o < 0) {
            this.f42065o = 0;
            for (T t : m32624c()) {
                t.setMsgStatus(0);
                C17406e.m32233b(t, C17453a.m32406a((AbstractC89172b) null, C17592e.f42080a));
            }
        }
    }

    /* renamed from: a */
    public final void mo28028a(C19672u uVar) {
        C89219l.m154721d(uVar, "");
        C17397a aVar = C17397a.f41738b;
        String str = this.f42053a;
        if (str == null) {
            C89219l.m154715b();
        }
        C19638h a = aVar.mo27720a(str);
        C17415a.m32255b().mo27838c("MsgSender_Task", new StringBuilder("onConversationError: ").append(a != null ? m32622b(a) : null).append(", ").append(uVar).toString());
        if (this.f42064n) {
            this.f42065o = 3;
            return;
        }
        List<C19538ai> list = this.f42066p;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.f42065o == 0 && list != null && !list.isEmpty()) {
            for (T t : list) {
                t.setMsgStatus(3);
                t.addLocalExt("s:err_code", "-100001");
                t.addLocalExt("s:log_id", uVar.toString());
                linkedHashMap.put(t, uVar);
                AbstractC17426e a2 = mo28025a();
                if (a2 != null) {
                    a2.mo27801a(t, uVar);
                }
                C17406e.f41758b.mo27772a(t, null, -100001, uVar);
            }
        }
        this.f42065o = 3;
        mo28025a();
    }

    public /* synthetic */ C17587d(int i, byte b) {
        this(i);
    }

    /* renamed from: a */
    public final void mo28027a(C19638h hVar, boolean z) {
        C89219l.m154721d(hVar, "");
        C17415a.m32255b().mo27836b("MsgSender_Task", "onConversationReady: " + m32622b(hVar) + ", " + this);
        long uptimeMillis = SystemClock.uptimeMillis();
        if (z) {
            C17456b bVar = this.f42058f;
            if (bVar == null) {
                C89219l.m154715b();
            }
            bVar.f41805f = true;
            C17456b bVar2 = this.f42058f;
            if (bVar2 == null) {
                C89219l.m154715b();
            }
            bVar2.f41806g = uptimeMillis - this.f42062j;
        } else {
            C17456b bVar3 = this.f42058f;
            if (bVar3 == null) {
                C89219l.m154715b();
            }
            bVar3.f41805f = false;
            C17456b bVar4 = this.f42058f;
            if (bVar4 == null) {
                C89219l.m154715b();
            }
            bVar4.f41806g = 0;
        }
        if (this.f42064n) {
            m32623b();
        } else if (this.f42065o <= 0) {
            this.f42065o = 1;
            List<C19538ai> c = m32624c();
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t : c) {
                C17406e.f41758b.mo27771a(t, C17453a.m32406a(new C17590c(t, this, hVar, arrayList, c, linkedHashMap), new C17591d(t, this, hVar, arrayList, c, linkedHashMap)));
            }
        }
    }

    /* renamed from: a */
    public final void mo28029a(List<C19538ai> list, List<C19538ai> list2, Map<C19538ai, ? extends C19672u> map) {
        int i;
        if (list2.size() + map.size() == list.size()) {
            if (!list2.isEmpty()) {
                i = 2;
            } else {
                i = 3;
            }
            this.f42065o = i;
            mo28025a();
        }
    }
}
