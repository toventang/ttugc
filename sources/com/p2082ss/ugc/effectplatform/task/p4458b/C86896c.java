package com.p2082ss.ugc.effectplatform.task.p4458b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86702f;
import com.p2082ss.ugc.effectplatform.p4448e.C86767b;
import com.p2082ss.ugc.effectplatform.p4449f.C86783c;
import com.p2082ss.ugc.effectplatform.util.C86994k;
import p4519d.p4520a.p4530d.p4531a.AbstractC88054k;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4519d.p4520a.p4530d.p4531a.C88050g;
import p4519d.p4520a.p4530d.p4531a.C88053j;
import p4519d.p4520a.p4532e.C88060b;
import p4519d.p4520a.p4533f.AbstractC88064c;
import p4519d.p4520a.p4534g.C88073f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89216i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89278d;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.task.b.c */
public final class C86896c implements AbstractC88064c<C86702f, String> {

    /* renamed from: b */
    public static final C86897a f195917b = new C86897a((byte) 0);

    /* renamed from: a */
    public final AbstractC86894a f195918a = null;

    /* renamed from: c */
    private final String f195919c;

    /* renamed from: d */
    private final String f195920d;

    /* renamed from: e */
    private String f195921e;

    static {
        Covode.recordClassIndex(102661);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.b.c$a */
    public static final class C86897a {
        static {
            Covode.recordClassIndex(102662);
        }

        private C86897a() {
        }

        public /* synthetic */ C86897a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.task.b.c$b */
    public static final /* synthetic */ class C86898b extends C89216i implements AbstractC89183m<Integer, Long, C89391z> {
        static {
            Covode.recordClassIndex(102663);
        }

        C86898b(C86896c cVar) {
            super(2, cVar);
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
        public final String getName() {
            return "onProgress";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final String getSignature() {
            return "onProgress(IJ)V";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final AbstractC89278d getOwner() {
            return C89204ab.m154669a(C86896c.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Integer num, Long l) {
            ((C86896c) this.receiver).mo140607a(num.intValue(), l.longValue());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.task.b.c$c */
    public static final /* synthetic */ class C86899c extends C89216i implements AbstractC89183m<Integer, Long, C89391z> {
        static {
            Covode.recordClassIndex(102664);
        }

        C86899c(C86896c cVar) {
            super(2, cVar);
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
        public final String getName() {
            return "onProgress";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final String getSignature() {
            return "onProgress(IJ)V";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final AbstractC89278d getOwner() {
            return C89204ab.m154669a(C86896c.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Integer num, Long l) {
            ((C86896c) this.receiver).mo140607a(num.intValue(), l.longValue());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String mo140606a(C86702f fVar) {
        C88050g gVar;
        boolean z;
        C89219l.m154719c(fVar, "");
        if (!C88045d.m153118f(this.f195919c)) {
            C88045d.m153117e(this.f195919c);
        }
        String a = C86994k.m150670a(this.f195920d, "_tmp");
        C86767b bVar = new C86767b(fVar.f195518b);
        if (a != null) {
            if (C88045d.m153118f(a)) {
                C88045d.m153119g(a);
            }
            gVar = C88045d.m153102a(a, false);
        } else {
            gVar = null;
        }
        if (gVar != null) {
            String str = this.f195921e;
            if (str == null || C89361p.m154870a((CharSequence) str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C86994k.m150668a(bVar, gVar, fVar.f195519c, new C86898b(this));
                C88045d.m153106a((AbstractC88054k) bVar);
                if (C86994k.m150672a(a, this.f195920d, false)) {
                    return this.f195920d;
                }
                C88060b.m153136a("FileWriterPipeLine", "file rename failed", null);
                throw new C88053j("FileWriter error");
            }
            String b = C86994k.m150673b(bVar, gVar, fVar.f195519c, new C86899c(this));
            C88045d.m153106a((AbstractC88054k) bVar);
            if (C89219l.m154714a((Object) b, (Object) this.f195921e) && C86994k.m150672a(a, this.f195920d, false)) {
                return this.f195920d;
            }
            C88060b.m153136a("FileWriterPipeLine", "md5 check failed", null);
            throw new C86783c("MD5 not match");
        }
        throw new C88053j("FileWriter error");
    }

    /* renamed from: a */
    public final void mo140607a(int i, long j) {
        C88073f.m153147a(new RunnableC86900d(this, i, j));
    }

    /* renamed from: com.ss.ugc.effectplatform.task.b.c$d */
    public static final class RunnableC86900d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C86896c f195922a;

        /* renamed from: b */
        final /* synthetic */ int f195923b;

        /* renamed from: c */
        final /* synthetic */ long f195924c;

        static {
            Covode.recordClassIndex(102665);
        }

        public final void run() {
        }

        RunnableC86900d(C86896c cVar, int i, long j) {
            this.f195922a = cVar;
            this.f195923b = i;
            this.f195924c = j;
        }
    }

    public C86896c(String str, String str2, String str3) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f195919c = str;
        this.f195920d = str2;
        this.f195921e = str3;
    }
}
