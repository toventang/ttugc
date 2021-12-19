package com.p2082ss.android.ugc.aweme.tools.draft.p4102c;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.asve.editor.C31068c;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.io.IOException;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89703z;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89582cd;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89097a;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.c.c */
public final class C78226c {
    static {
        Covode.recordClassIndex(91341);
    }

    /* renamed from: a */
    public static final AbstractC89516am m136712a() {
        AbstractC89703z a = C89582cd.m155517a(null);
        return C89517an.m155448a(C31068c.f74429a.plus(a).plus(new C78227a(CoroutineExceptionHandler.f203145c)));
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.c.c$a */
    public static final class C78227a extends AbstractC89097a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(91342);
        }

        public C78227a(AbstractC89127f.AbstractC89132c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(AbstractC89127f fVar, Throwable th) {
            C40970e.m82487a(th);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.c.c$b */
    public static final class C78228b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f175697a;

        /* renamed from: b */
        final /* synthetic */ Effect f175698b;

        static {
            Covode.recordClassIndex(91343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78228b(Effect effect, AbstractC89124d dVar) {
            super(2, dVar);
            this.f175698b = effect;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C78228b(this.f175698b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C78228b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* renamed from: a */
        private static boolean m136713a(File file) {
            MethodCollector.m26663i(8865);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(8865);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(8865);
            return delete;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f175697a == 0) {
                C89382r.m154942a(obj);
                File file = new File(this.f175698b.getZipPath());
                try {
                    FileUtils.INSTANCE.removeDir(this.f175698b.getUnzipPath());
                    FileUtils.INSTANCE.unZip(this.f175698b.getZipPath(), this.f175698b.getUnzipPath());
                } catch (IOException e) {
                    C73991bj.m130131b(Log.getStackTraceString(e));
                } catch (Throwable th) {
                    m136713a(file);
                    throw th;
                }
                m136713a(file);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
