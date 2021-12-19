package leakcanary;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.liko.memoryexplorer.AnalyzerEngine;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.util.concurrent.Callable;
import leakcanary.internal.C89851k;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4645m.C89863a;

/* renamed from: leakcanary.d */
public final class C89797d {

    /* renamed from: a */
    public static volatile boolean f203632a;

    /* renamed from: b */
    public static final C89797d f203633b = new C89797d();

    private C89797d() {
    }

    static {
        Covode.recordClassIndex(105892);
    }

    /* renamed from: leakcanary.d$a */
    static final class CallableC89798a<V> implements Callable<C89391z> {

        /* renamed from: a */
        final /* synthetic */ File f203634a;

        static {
            Covode.recordClassIndex(105893);
        }

        CallableC89798a(File file) {
            this.f203634a = file;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C89391z call() {
            C89863a.AbstractC89864a aVar = C89863a.f203762a;
            if (aVar != null) {
                aVar.mo144406a("start Analysis:hprof path:" + this.f203634a.getAbsolutePath());
            }
            try {
                C89797d.f203632a = true;
                new AnalyzerEngine().runAnalysis(this.f203634a, MemoryConfig.getMemoryConfig());
            } catch (Throwable th) {
                C89863a.AbstractC89864a aVar2 = C89863a.f203762a;
                if (aVar2 != null) {
                    aVar2.mo144407a(th, "runAnalysis fail! delete heapDumpFile");
                }
                m155892a(this.f203634a);
            }
            C89863a.AbstractC89864a aVar3 = C89863a.f203762a;
            if (aVar3 != null) {
                aVar3.mo144406a("end Analysis");
            }
            C89797d.f203632a = false;
            return C89391z.f203057a;
        }

        /* renamed from: a */
        private static boolean m155892a(File file) {
            MethodCollector.m26663i(4041);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81548b(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(4041);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(4041);
            return delete;
        }
    }

    /* renamed from: a */
    public static void m155891a(Context context, File file) {
        String str;
        C89219l.m154719c(context, "");
        C89219l.m154719c(file, "");
        C89801f.m155896a();
        if (!file.exists()) {
            C89863a.AbstractC89864a aVar = C89863a.f203762a;
            if (aVar != null) {
                StringBuilder sb = new StringBuilder("Hprof file missing due to: [");
                C89219l.m154719c(file, "");
                String absolutePath = file.getAbsolutePath();
                if (C89851k.f203738c.contains(absolutePath)) {
                    str = "Older than all other hprof files";
                } else if (C89851k.f203739d.contains(absolutePath)) {
                    str = "Hprof directory cleared";
                } else if (C89851k.f203740e.contains(absolutePath)) {
                    str = "Leak manually removed";
                } else {
                    str = "Unknown";
                }
                aVar.mo144406a(sb.append(str).append("] ").append(file).toString());
                return;
            }
            return;
        }
        C1731i.m5635a((Callable) new CallableC89798a(file));
    }
}
