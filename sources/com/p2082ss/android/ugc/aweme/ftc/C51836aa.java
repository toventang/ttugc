package com.p2082ss.android.ugc.aweme.ftc;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.File;
import kotlinx.coroutines.AbstractC89516am;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.aa */
public final class C51836aa {
    static {
        Covode.recordClassIndex(61205);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.aa$a */
    static final class C51837a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f119484a;

        /* renamed from: b */
        final /* synthetic */ ShortVideoContext f119485b;

        static {
            Covode.recordClassIndex(61206);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51837a(ShortVideoContext shortVideoContext, AbstractC89124d dVar) {
            super(2, dVar);
            this.f119485b = shortVideoContext;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C51837a(this.f119485b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C51837a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* renamed from: a */
        private static boolean m96540a(File file) {
            MethodCollector.m26663i(8294);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(8294);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(8294);
            return delete;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f119484a == 0) {
                C89382r.m154942a(obj);
                Workspace workspace = this.f119485b.f155817b.f155652h;
                File a = workspace.mo110089a();
                if (!a.exists()) {
                    a = null;
                }
                if (a != null) {
                    m96540a(a);
                    StringBuilder sb = new StringBuilder("delete video, path is ");
                    File a2 = workspace.mo110089a();
                    C89219l.m154716b(a2, "");
                    C84911q.m145926b(sb.append(a2.getPath()).toString());
                }
                File b = workspace.mo110091b();
                if (b.exists()) {
                    m96540a(b);
                    StringBuilder sb2 = new StringBuilder("delete audio, path is ");
                    File b2 = workspace.mo110091b();
                    C89219l.m154716b(b2, "");
                    C84911q.m145926b(sb2.append(b2.getPath()).toString());
                }
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
