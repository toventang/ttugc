package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.bytedance.jedi.p1445a.p1448c.C20171g;
import com.bytedance.jedi.p1445a.p1458h.AbstractC20270e;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.b.b.b */
public abstract class AbstractC84486b<RESP, V> extends AbstractC20270e<V> {

    /* renamed from: a */
    public final AbstractC89171a<AbstractC84398d> f188851a;

    /* renamed from: b */
    public final AbstractC89171a<String> f188852b;

    /* renamed from: com.ss.android.ugc.tools.h.b.b.b$a */
    protected interface AbstractC84487a<RESPONSE> {
        static {
            Covode.recordClassIndex(98452);
        }

        /* renamed from: a */
        void mo129462a(ExceptionResult exceptionResult);

        /* renamed from: a */
        void mo129463a(RESPONSE response);
    }

    static {
        Covode.recordClassIndex(98451);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo129460a(AbstractC89171a<? extends AbstractC84398d> aVar, AbstractC89171a<String> aVar2, AbstractC84487a<RESP> aVar3);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract V mo129461d(RESP resp);

    @Override // com.bytedance.jedi.p1445a.p1458h.AbstractC20266a
    /* renamed from: b */
    public final AbstractC88979t<V> mo33640b() {
        AbstractC88979t a = AbstractC88979t.m154294a(new C84489c(this));
        C89219l.m154716b(a, "");
        AbstractC88979t<V> d = a.mo143292d(new C84488b(this));
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.b.b$c */
    static final class C84489c<T> implements AbstractC88983w<C20169f<? extends RESP>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84486b f188854a;

        static {
            Covode.recordClassIndex(98454);
        }

        C84489c(AbstractC84486b bVar) {
            this.f188854a = bVar;
        }

        /* renamed from: com.ss.android.ugc.tools.h.b.b.b$c$a */
        public static final class C84490a implements AbstractC84487a<RESP> {

            /* renamed from: a */
            final /* synthetic */ AbstractC88982v f188855a;

            static {
                Covode.recordClassIndex(98455);
            }

            C84490a(AbstractC88982v vVar) {
                this.f188855a = vVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.AbstractC84486b.AbstractC84487a
            /* renamed from: a */
            public final void mo129463a(RESP resp) {
                this.f188855a.mo143031a(C20171g.m38149a(resp));
                this.f188855a.mo143023a();
            }

            @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.AbstractC84486b.AbstractC84487a
            /* renamed from: a */
            public final void mo129462a(ExceptionResult exceptionResult) {
                Exception exc;
                String str;
                Exception exception;
                if (!(exceptionResult == null || (exception = exceptionResult.getException()) == null)) {
                    exception.printStackTrace();
                }
                AbstractC88982v vVar = this.f188855a;
                if (exceptionResult == null || (exc = exceptionResult.getException()) == null) {
                    StringBuilder sb = new StringBuilder("Failed on fetch from effect platform, msg : ");
                    Integer num = null;
                    if (exceptionResult != null) {
                        str = exceptionResult.getMsg();
                    } else {
                        str = null;
                    }
                    StringBuilder append = sb.append(str).append(", code : ");
                    if (exceptionResult != null) {
                        num = Integer.valueOf(exceptionResult.getErrorCode());
                    }
                    exc = new RuntimeException(append.append(num).append('.').toString());
                }
                vVar.mo143104b(exc);
                this.f188855a.mo143023a();
            }
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<C20169f<RESP>> vVar) {
            C89219l.m154721d(vVar, "");
            C84490a aVar = new C84490a(vVar);
            AbstractC84486b bVar = this.f188854a;
            bVar.mo129460a(bVar.f188851a, this.f188854a.f188852b, aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.b.b$b */
    static final class C84488b<T, R> implements AbstractC88434g<C20169f<? extends RESP>, V> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84486b f188853a;

        static {
            Covode.recordClassIndex(98453);
        }

        C84488b(AbstractC84486b bVar) {
            this.f188853a = bVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.tools.h.b.b.b */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C20169f fVar = (C20169f) obj;
            C89219l.m154721d(fVar, "");
            return this.f188853a.mo129461d(fVar.mo33486a());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC84486b(AbstractC89171a<? extends AbstractC84398d> aVar, AbstractC89171a<String> aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f188851a = aVar;
        this.f188852b = aVar2;
    }
}
