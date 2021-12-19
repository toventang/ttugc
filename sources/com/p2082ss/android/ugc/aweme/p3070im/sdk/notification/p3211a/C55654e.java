package com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17436f;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.p2082ss.android.ugc.aweme.AbstractC33485al;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55219n;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55649c;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a.e */
public final class C55654e implements AbstractC33485al, AbstractC55665g {

    /* renamed from: b */
    public static final C55654e f126932b = C55656b.f126941a;

    /* renamed from: c */
    public static final C55655a f126933c = new C55655a((byte) 0);

    /* renamed from: a */
    public boolean f126934a;

    /* renamed from: d */
    private final HashSet<String> f126935d;

    /* renamed from: e */
    private final Map<String, Integer> f126936e;

    /* renamed from: f */
    private int f126937f;

    /* renamed from: g */
    private boolean f126938g;

    /* renamed from: h */
    private final AbstractC89244h f126939h;

    /* renamed from: i */
    private final AbstractC89244h f126940i;

    /* renamed from: c */
    public final C55666h mo92546c() {
        return (C55666h) this.f126939h.getValue();
    }

    /* renamed from: d */
    public final C55662f mo92547d() {
        return (C55662f) this.f126940i.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a.e$a */
    public static final class C55655a {
        static {
            Covode.recordClassIndex(65438);
        }

        private C55655a() {
        }

        public /* synthetic */ C55655a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a.e$b */
    static final class C55656b {

        /* renamed from: a */
        static final C55654e f126941a = new C55654e((byte) 0);

        /* renamed from: b */
        public static final C55656b f126942b = new C55656b();

        private C55656b() {
        }

        static {
            Covode.recordClassIndex(65439);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a.e$c */
    static final class C55657c extends AbstractC89220m implements AbstractC89171a<C55666h> {

        /* renamed from: a */
        final /* synthetic */ C55654e f126943a;

        static {
            Covode.recordClassIndex(65440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55657c(C55654e eVar) {
            super(0);
            this.f126943a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C55666h invoke() {
            return new C55666h(this.f126943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a.e$e */
    static final class C55659e extends AbstractC89220m implements AbstractC89171a<C55662f> {

        /* renamed from: a */
        public static final C55659e f126947a = new C55659e();

        static {
            Covode.recordClassIndex(65442);
        }

        C55659e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C55662f invoke() {
            return new C55662f();
        }
    }

    /* renamed from: f */
    public final boolean mo92549f() {
        if (mo92546c().f126960a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo92550g() {
        C55649c.m101404b();
        this.f126935d.clear();
        this.f126936e.clear();
    }

    static {
        Covode.recordClassIndex(65437);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: a */
    public final void mo59568a() {
        this.f126934a = false;
        String name = getClass().getName();
        C89219l.m154716b(name, "");
        mo92544a(name, 0, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: b */
    public final void mo59569b() {
        this.f126934a = true;
        String name = getClass().getName();
        C89219l.m154716b(name, "");
        mo92544a(name, 1, false);
    }

    private C55654e() {
        this.f126935d = new HashSet<>();
        this.f126936e = new LinkedHashMap();
        this.f126934a = true;
        this.f126938g = true;
        this.f126939h = C89250i.m154773a((AbstractC89171a) new C55657c(this));
        this.f126940i = C89250i.m154773a((AbstractC89171a) C55659e.f126947a);
        mo92548e();
        AbstractC56220e b = C55076b.m100723b();
        if (b != null) {
            b.registerAppStateCallback(this);
        }
    }

    /* renamed from: e */
    public final void mo92548e() {
        C55219n a = C55219n.m100965a();
        C89219l.m154716b(a, "");
        this.f126937f = a.mo92205b();
        C55219n a2 = C55219n.m100965a();
        C89219l.m154716b(a2, "");
        Set<String> c = a2.mo92206c();
        if (c != null) {
            this.f126935d.addAll(c);
        }
    }

    public /* synthetic */ C55654e(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo92543a(String str) {
        if (str != null && this.f126936e.containsKey(str)) {
            this.f126936e.remove(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a.e$d */
    public static final class C55658d implements AbstractC19479b<C19638h> {

        /* renamed from: a */
        final /* synthetic */ C55654e f126944a;

        /* renamed from: b */
        final /* synthetic */ C55648b f126945b;

        /* renamed from: c */
        final /* synthetic */ C19538ai f126946c;

        static {
            Covode.recordClassIndex(65441);
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            Throwable th;
            C56244a.m102193e("DmHelper", "onGetModifyPropertyMsg add fail cause:" + this.f126946c.getMsgId() + ",error:" + uVar);
            if (uVar != null && (th = uVar.f46735h) != null) {
                C56244a.m102188a(th);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(C19638h hVar) {
            List<C55674n> list;
            int i;
            C19638h hVar2 = hVar;
            if (!(hVar2 == null || hVar2.isMute() || (list = this.f126945b.f126925a) == null)) {
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    if (t.f126995b == EnumC55647a.ADD) {
                        arrayList.add(t);
                    }
                }
                ArrayList<C55674n> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
                for (C55674n nVar : arrayList2) {
                    arrayList3.add(nVar.f126994a);
                }
                ArrayList<C55671l> arrayList4 = arrayList3;
                if (!(arrayList4 == null || arrayList4.isEmpty())) {
                    C56244a.m102191c("DmHelper", "onGetModifyPropertyMsg start:" + this.f126946c.getMsgId());
                    if (!this.f126944a.mo92546c().mo92554a() && C55649c.m101403a(this.f126946c)) {
                        for (C55671l lVar : arrayList4) {
                            C19538ai aiVar = this.f126946c;
                            Integer num = this.f126945b.f126926b;
                            if (num != null) {
                                i = num.intValue();
                            } else {
                                i = 0;
                            }
                            C89219l.m154721d(aiVar, "");
                            C89219l.m154721d(lVar, "");
                            C55649c.m101402a(new C55667i(EnumC55669j.Property, aiVar, lVar, Integer.valueOf(i), null, 16));
                        }
                        C55649c.m101400a();
                        this.f126944a.mo92542a(1000L);
                    }
                }
            }
        }

        public C55658d(C55654e eVar, C55648b bVar, C19538ai aiVar) {
            this.f126944a = eVar;
            this.f126945b = bVar;
            this.f126946c = aiVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a.e$f */
    public static final class C55660f extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f126948a;

        /* renamed from: b */
        final /* synthetic */ C55654e f126949b;

        /* renamed from: c */
        final /* synthetic */ long f126950c;

        static {
            Covode.recordClassIndex(65443);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55660f(C55654e eVar, long j, AbstractC89124d dVar) {
            super(2, dVar);
            this.f126949b = eVar;
            this.f126950c = j;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C55660f(this.f126949b, this.f126950c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C55660f) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[RETURN] */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                h.c.a.a r4 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
                int r0 = r5.f126948a
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L_0x0012
                if (r0 == r2) goto L_0x0020
                if (r0 != r3) goto L_0x0034
                p4600h.C89382r.m154942a(r6)
            L_0x000f:
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            L_0x0012:
                p4600h.C89382r.m154942a(r6)
                long r0 = r5.f126950c
                r5.f126948a = r2
                java.lang.Object r0 = kotlinx.coroutines.C89536ay.m155464a(r0, r5)
                if (r0 != r4) goto L_0x0023
                return r4
            L_0x0020:
                p4600h.C89382r.m154942a(r6)
            L_0x0023:
                kotlinx.coroutines.ci r2 = kotlinx.coroutines.internal.C89652o.f203399a
                com.ss.android.ugc.aweme.im.sdk.notification.a.e$f$1 r1 = new com.ss.android.ugc.aweme.im.sdk.notification.a.e$f$1
                r0 = 0
                r1.<init>(r5, r0)
                r5.f126948a = r3
                java.lang.Object r0 = kotlinx.coroutines.C89624i.m155554a(r2, r1, r5)
                if (r0 != r4) goto L_0x000f
                return r4
            L_0x0034:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55654e.C55660f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.AbstractC55665g
    /* renamed from: a */
    public final void mo92541a(int i) {
        if (i == 0) {
            mo92547d().f126953a = false;
            if (this.f126938g) {
                mo92542a(30000L);
                this.f126938g = false;
                return;
            }
            mo92542a(1000L);
        } else if (i != 1) {
            if (i == 2) {
                C55649c.m101404b();
                C55649c.m101400a();
            }
        } else if (this.f126934a) {
            C55649c.m101404b();
        }
    }

    /* renamed from: a */
    public final void mo92542a(long j) {
        AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203266a), null, null, new C55660f(this, j, null), 3);
    }

    /* renamed from: a */
    public final void mo92545a(List<C19538ai> list, int i) {
        C89219l.m154721d(list, "");
        if (!list.isEmpty() && !mo92546c().mo92554a()) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                C89219l.m154721d(t2, "");
                if (t2.getReadStatus() != 1 && AbstractC17436f.C17437a.m32346a().mo27775a(t2) && !t2.isSelf() && !C89219l.m154714a((Object) "1", (Object) t2.getExt().get("a:disable_inner_push")) && C55649c.m101403a((C19538ai) t2)) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            if ((!arrayList2.isEmpty()) && arrayList2 != null) {
                if (this.f126934a) {
                    C55649c.m101401a(C55649c.EnumC55650a.ASSEMBLE, arrayList2);
                } else if (i == 3) {
                    C55649c.m101401a(C55649c.EnumC55650a.ASSEMBLE, arrayList2);
                    mo92542a(30000L);
                } else {
                    C55649c.m101401a(C55649c.EnumC55650a.NORMAL, arrayList2);
                    C55649c.m101400a();
                    mo92542a(1000L);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo92544a(String str, int i, boolean z) {
        C89219l.m154721d(str, "");
        if (z) {
            mo92547d().mo92551a();
        }
        mo92546c().mo92553a(str, i);
    }
}
