package com.bytedance.android.live.broadcast.api.blockword;

import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordGetExtra;
import com.bytedance.android.live.broadcast.api.blockword.model.C3043a;
import com.bytedance.android.live.broadcast.api.blockword.model.C3044b;
import com.bytedance.android.live.broadcast.api.p185c.C3049b;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.api.blockword.a */
public final class C3034a {

    /* renamed from: a */
    final BlockWordApi f8865a;

    /* renamed from: b */
    String f8866b;

    /* renamed from: c */
    boolean f8867c;

    /* renamed from: d */
    String f8868d = "";

    /* renamed from: e */
    long f8869e;

    /* renamed from: f */
    public final AbstractC3035a f8870f;

    /* renamed from: com.bytedance.android.live.broadcast.api.blockword.a$a */
    public interface AbstractC3035a {
        static {
            Covode.recordClassIndex(3512);
        }

        /* renamed from: a */
        void mo8252a(C3043a aVar);

        /* renamed from: a */
        void mo8253a(Throwable th);

        /* renamed from: a */
        void mo8254a(List<C3043a> list, long j, long j2);

        /* renamed from: b */
        void mo8257b(C3043a aVar);

        /* renamed from: b */
        void mo8258b(Throwable th);

        /* renamed from: c */
        void mo8259c(Throwable th);
    }

    static {
        Covode.recordClassIndex(3511);
    }

    /* renamed from: com.bytedance.android.live.broadcast.api.blockword.a$d */
    static final class C3038d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3034a f8875a;

        /* renamed from: b */
        final /* synthetic */ C3043a f8876b;

        static {
            Covode.recordClassIndex(3515);
        }

        C3038d(C3034a aVar, C3043a aVar2) {
            this.f8875a = aVar;
            this.f8876b = aVar2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f8875a.f8870f.mo8257b(this.f8876b);
            C3051c.C3052a.m8360b("ttlive_delete_sensitive_word").mo12629a("sensitive_word", this.f8876b.f8884b).mo12632a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.api.blockword.a$g */
    static final class C3041g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3034a f8880a;

        static {
            Covode.recordClassIndex(3518);
        }

        C3041g(C3034a aVar) {
            this.f8880a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            AbstractC3035a aVar = this.f8880a.f8870f;
            C89219l.m154716b(th, "");
            aVar.mo8259c(th);
            C3049b.C3050a.m8357a("ttlive_fetch_sensitive_word", th).mo12632a();
        }
    }

    public C3034a(AbstractC3035a aVar) {
        C89219l.m154721d(aVar, "");
        this.f8870f = aVar;
        Object a = C5805e.m12718a().mo11572a(BlockWordApi.class);
        C89219l.m154716b(a, "");
        this.f8865a = (BlockWordApi) a;
    }

    /* renamed from: com.bytedance.android.live.broadcast.api.blockword.a$b */
    static final class C3036b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3034a f8871a;

        /* renamed from: b */
        final /* synthetic */ C3043a f8872b;

        static {
            Covode.recordClassIndex(3513);
        }

        C3036b(C3034a aVar, C3043a aVar2) {
            this.f8871a = aVar;
            this.f8872b = aVar2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Integer num = ((C3044b) ((C5832d) obj).data).f8885a;
            if (num != null) {
                this.f8872b.f8883a = num.intValue();
                this.f8871a.f8870f.mo8252a(this.f8872b);
                C3051c.C3052a.m8360b("ttlive_add_sensitive_word").mo12629a("sensitive_word", this.f8872b.f8884b).mo12632a();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.api.blockword.a$c */
    static final class C3037c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3034a f8873a;

        /* renamed from: b */
        final /* synthetic */ C3043a f8874b;

        static {
            Covode.recordClassIndex(3514);
        }

        C3037c(C3034a aVar, C3043a aVar2) {
            this.f8873a = aVar;
            this.f8874b = aVar2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            AbstractC3035a aVar = this.f8873a.f8870f;
            C89219l.m154716b(th, "");
            aVar.mo8253a(th);
            C3049b.C3050a.m8357a("ttlive_add_sensitive_word", th).mo12629a("sensitive_word", this.f8874b.f8884b).mo12632a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.api.blockword.a$e */
    static final class C3039e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3034a f8877a;

        /* renamed from: b */
        final /* synthetic */ C3043a f8878b;

        static {
            Covode.recordClassIndex(3516);
        }

        C3039e(C3034a aVar, C3043a aVar2) {
            this.f8877a = aVar;
            this.f8878b = aVar2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            AbstractC3035a aVar = this.f8877a.f8870f;
            C89219l.m154716b(th, "");
            aVar.mo8258b(th);
            C3049b.C3050a.m8357a("ttlive_delete_sensitive_word", th).mo12629a("sensitive_word", this.f8878b.f8884b).mo12632a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.api.blockword.a$f */
    static final class C3040f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3034a f8879a;

        static {
            Covode.recordClassIndex(3517);
        }

        C3040f(C3034a aVar) {
            this.f8879a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5830b bVar = (C5830b) obj;
            List<C3043a> list = bVar.data.f8886a;
            if (list != null) {
                this.f8879a.f8870f.mo8254a(list, ((BlockWordGetExtra) bVar.extra).maxCount, ((BlockWordGetExtra) bVar.extra).maxLength);
                C3051c.C3052a.m8360b("ttlive_fetch_sensitive_word").mo12627a("list_size", Integer.valueOf(list.size())).mo12632a();
            }
        }
    }
}
