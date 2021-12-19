package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import java.util.HashMap;
import p4519d.p4520a.p4521a.C87989b;
import p4519d.p4520a.p4522b.C87993b;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.am */
public final class C86886am extends AbstractC86891b {

    /* renamed from: c */
    public static final C86887a f195903c = new C86887a((byte) 0);

    /* renamed from: a */
    public final C86687a f195904a;

    /* renamed from: b */
    public final String f195905b;

    /* renamed from: d */
    private final C87989b<String, String> f195906d;

    static {
        Covode.recordClassIndex(102651);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.am$a */
    public static final class C86887a {
        static {
            Covode.recordClassIndex(102652);
        }

        private C86887a() {
        }

        public /* synthetic */ C86887a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.am$b */
    static final class C86888b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86886am f195907a;

        static {
            Covode.recordClassIndex(102653);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86888b(C86886am amVar) {
            super(0);
            this.f195907a = amVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f195907a.f195904a.f195443K.mo140037b(this.f195907a.f195905b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: b */
    public final void mo139953b() {
        m150523a(new C86888b(this));
    }

    /* renamed from: com.ss.ugc.effectplatform.task.am$c */
    static final class C86889c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86886am f195908a;

        /* renamed from: b */
        final /* synthetic */ C86840e f195909b;

        static {
            Covode.recordClassIndex(102654);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86889c(C86886am amVar, C86840e eVar) {
            super(0);
            this.f195908a = amVar;
            this.f195909b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f195908a.f195904a.f195443K.mo140035a(this.f195908a.f195905b);
            if (a != null) {
                a.onFail(null, this.f195909b);
            }
            this.f195908a.f195904a.f195443K.mo140037b(this.f195908a.f195905b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.am$d */
    static final class C86890d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86886am f195910a;

        static {
            Covode.recordClassIndex(102655);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86890d(C86886am amVar) {
            super(0);
            this.f195910a = amVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f195910a.f195904a.f195443K.mo140035a(this.f195910a.f195905b);
            if (a != null) {
                a.onSuccess("");
            }
            this.f195910a.f195904a.f195443K.mo140037b(this.f195910a.f195905b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: a */
    public final void mo139952a() {
        String convertObjToJson;
        AbstractC86755f fVar;
        HashMap hashMap = new HashMap();
        C87989b<String, String> bVar = this.f195906d;
        if (bVar != null) {
            hashMap.putAll(bVar);
        }
        try {
            C86695b bVar2 = this.f195904a.f195461q;
            if (!(bVar2 == null || (convertObjToJson = bVar2.f195508a.convertObjToJson(hashMap)) == null || (fVar = (AbstractC86755f) C87993b.m153064a(this.f195904a.f195467w)) == null)) {
                fVar.mo140005a("updatetime", convertObjToJson);
            }
            m150523a(new C86890d(this));
        } catch (Exception e) {
            m150523a(new C86889c(this, new C86840e(e)));
            C88060b.m153136a("WriteUpdateTagTask", String.valueOf(e), null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86886am(C86687a aVar, String str, C87989b<String, String> bVar) {
        super(str);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        this.f195904a = aVar;
        this.f195905b = str;
        this.f195906d = bVar;
    }
}
