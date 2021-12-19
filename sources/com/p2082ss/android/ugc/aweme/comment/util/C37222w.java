package com.p2082ss.android.ugc.aweme.comment.util;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.util.w */
public final class C37222w {

    /* renamed from: a */
    public AbstractC37224b f87760a;

    /* renamed from: b */
    public AbstractC88412b f87761b;

    /* renamed from: com.ss.android.ugc.aweme.comment.util.w$a */
    public interface AbstractC37223a {
        static {
            Covode.recordClassIndex(44578);
        }

        /* renamed from: a */
        void mo63331a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.util.w$b */
    public interface AbstractC37224b {
        static {
            Covode.recordClassIndex(44579);
        }

        /* renamed from: a */
        void mo64779a(String str);
    }

    static {
        Covode.recordClassIndex(44577);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.util.w$c */
    public static final class C37225c<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C37222w f87762a;

        static {
            Covode.recordClassIndex(44580);
        }

        public C37225c(C37222w wVar) {
            this.f87762a = wVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<String> vVar) {
            C89219l.m154721d(vVar, "");
            this.f87762a.f87760a = new AbstractC37224b() {
                /* class com.p2082ss.android.ugc.aweme.comment.util.C37222w.C37225c.C372261 */

                static {
                    Covode.recordClassIndex(44581);
                }

                @Override // com.p2082ss.android.ugc.aweme.comment.util.C37222w.AbstractC37224b
                /* renamed from: a */
                public final void mo64779a(String str) {
                    C89219l.m154721d(str, "");
                    AbstractC88982v vVar = vVar;
                    C89219l.m154716b(vVar, "");
                    if (!vVar.isDisposed()) {
                        vVar.mo143031a(str);
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.util.w$d */
    public static final class C37227d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC37223a f87764a;

        static {
            Covode.recordClassIndex(44582);
        }

        public C37227d(AbstractC37223a aVar) {
            this.f87764a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            AbstractC37223a aVar = this.f87764a;
            C89219l.m154716b(str, "");
            aVar.mo63331a(str);
        }
    }
}
