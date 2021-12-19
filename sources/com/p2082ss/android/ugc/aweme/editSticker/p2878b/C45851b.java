package com.p2082ss.android.ugc.aweme.editSticker.p2878b;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.editSticker.AbstractC45891h;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.io.IOException;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.b.b */
public final class C45851b {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.b.b$b */
    public static final class C45853b extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f106813a;

        /* renamed from: b */
        int f106814b;

        /* renamed from: c */
        Object f106815c;

        static {
            Covode.recordClassIndex(54376);
        }

        C45853b(AbstractC89124d dVar) {
            super(dVar);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f106813a = obj;
            this.f106814b |= Integer.MIN_VALUE;
            return C45851b.m88479b(null, this);
        }
    }

    static {
        Covode.recordClassIndex(54374);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.b.b$c */
    public static final class C45854c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f106816a;

        /* renamed from: b */
        final /* synthetic */ Effect f106817b;

        static {
            Covode.recordClassIndex(54377);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45854c(Effect effect, AbstractC89124d dVar) {
            super(2, dVar);
            this.f106817b = effect;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C45854c(this.f106817b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C45854c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* renamed from: a */
        private static boolean m88480a(File file) {
            MethodCollector.m26663i(10514);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(10514);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(10514);
            return delete;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f106816a == 0) {
                C89382r.m154942a(obj);
                try {
                    File file = new File(this.f106817b.getZipPath());
                    try {
                        FileUtils.INSTANCE.removeDir(this.f106817b.getUnzipPath());
                        FileUtils.INSTANCE.unZip(this.f106817b.getZipPath(), this.f106817b.getUnzipPath());
                    } catch (IOException e) {
                        AbstractC45891h d = C45866d.m88491d();
                        if (d != null) {
                            d.mo77253b(Log.getStackTraceString(e));
                        }
                    } catch (Throwable th) {
                        m88480a(file);
                        throw th;
                    }
                    m88480a(file);
                } catch (Exception e2) {
                    AbstractC45891h d2 = C45866d.m88491d();
                    if (d2 != null) {
                        d2.mo77253b("EffectExt unzipEffectRes, effect id : " + this.f106817b.getEffectId() + " , exception : " + Log.getStackTraceString(e2));
                    }
                }
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public static final boolean m88478a(Effect effect) {
        File[] listFiles;
        String str;
        C89219l.m154721d(effect, "");
        try {
            File file = new File(effect.getUnzipPath());
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2 != null) {
                        str = file2.getName();
                    } else {
                        str = null;
                    }
                    if (C89219l.m154714a((Object) str, (Object) "config.json")) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            AbstractC45891h d = C45866d.m88491d();
            if (d != null) {
                d.mo77253b("EffectExt isUnzipEffectResExistSync, effect id : " + effect.getEffectId() + " , exception : " + Log.getStackTraceString(e));
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.b.b$a */
    public static final class C45852a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super Boolean>, Object> {

        /* renamed from: a */
        int f106811a;

        /* renamed from: b */
        final /* synthetic */ Effect f106812b;

        static {
            Covode.recordClassIndex(54375);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45852a(Effect effect, AbstractC89124d dVar) {
            super(2, dVar);
            this.f106812b = effect;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C45852a(this.f106812b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super Boolean> dVar) {
            return ((C45852a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            File[] listFiles;
            String str;
            if (this.f106811a == 0) {
                C89382r.m154942a(obj);
                try {
                    File file = new File(this.f106812b.getUnzipPath());
                    if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                        for (File file2 : listFiles) {
                            if (file2 != null) {
                                str = file2.getName();
                            } else {
                                str = null;
                            }
                            if (C89219l.m154714a((Object) str, (Object) "config.json")) {
                                return true;
                            }
                        }
                    }
                    return false;
                } catch (Exception e) {
                    AbstractC45891h d = C45866d.m88491d();
                    if (d != null) {
                        d.mo77253b("EffectExt isUnzipEffectResExistAsync, effect id : " + this.f106812b.getEffectId() + " , exception : " + Log.getStackTraceString(e));
                    }
                    return false;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* renamed from: a */
    public static final Object m88477a(Effect effect, AbstractC89124d<? super Boolean> dVar) {
        return C89624i.m155554a(C89546bf.f203267b, new C45852a(effect, null), dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m88479b(com.p2082ss.android.ugc.effectmanager.effect.model.Effect r6, p4600h.p4603c.AbstractC89124d<? super p4600h.C89391z> r7) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.editSticker.p2878b.C45851b.m88479b(com.ss.android.ugc.effectmanager.effect.model.Effect, h.c.d):java.lang.Object");
    }
}
