package com.p2082ss.android.ugc.aweme.scene;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.navigation.C22239d;
import com.bytedance.scene.p1621c.C22149b;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.utils.C80564i;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.scene.a */
public final class C67279a {
    static {
        Covode.recordClassIndex(78899);
    }

    /* renamed from: com.ss.android.ugc.aweme.scene.a$a */
    public static final class C67280a extends C22149b {

        /* renamed from: a */
        final /* synthetic */ C22239d f150765a;

        /* renamed from: b */
        final /* synthetic */ Class f150766b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f150767c;

        static {
            Covode.recordClassIndex(78900);
        }

        /* renamed from: com.ss.android.ugc.aweme.scene.a$a$a */
        static final class RunnableC67281a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C67280a f150768a;

            static {
                Covode.recordClassIndex(78901);
            }

            RunnableC67281a(C67280a aVar) {
                this.f150768a = aVar;
            }

            public final void run() {
                this.f150768a.f150765a.mo36535b(this.f150768a);
            }
        }

        @Override // com.bytedance.scene.p1621c.AbstractC22150c, com.bytedance.scene.p1621c.C22149b
        /* renamed from: a */
        public final void mo36335a(AbstractC22219j jVar) {
            C89219l.m154721d(jVar, "");
            if (C89219l.m154714a(jVar.getClass(), this.f150766b)) {
                new SafeHandler(this.f150765a).post(new RunnableC67281a(this));
                this.f150767c.invoke();
            }
        }

        C67280a(C22239d dVar, Class cls, AbstractC89171a aVar) {
            this.f150765a = dVar;
            this.f150766b = cls;
            this.f150767c = aVar;
        }
    }

    /* renamed from: a */
    public static final Activity m119194a(Context context) {
        C89219l.m154721d(context, "");
        return C80564i.m139647a(context);
    }

    /* renamed from: a */
    public static final boolean m119196a(C22239d dVar, AbstractC22219j jVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(jVar, "");
        List<AbstractC22219j> d = dVar.mo36539d();
        C89219l.m154716b(d, "");
        for (T t : d) {
            if (C89219l.m154714a((Object) t, (Object) jVar)) {
                if (t != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m119197a(C22239d dVar, Class<? extends AbstractC22219j> cls) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cls, "");
        List<AbstractC22219j> d = dVar.mo36539d();
        C89219l.m154716b(d, "");
        for (T t : d) {
            if (C89219l.m154714a(t.getClass(), cls)) {
                if (t != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final void m119195a(C22239d dVar, Class<? extends AbstractC22219j> cls, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cls, "");
        C89219l.m154721d(aVar, "");
        dVar.mo36529a(new C67280a(dVar, cls, aVar));
    }
}
