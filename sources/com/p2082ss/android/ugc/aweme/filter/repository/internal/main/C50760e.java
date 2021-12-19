package com.p2082ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50751l;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50752m;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.C50721d;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.utils.C50813c;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50704l;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50698f;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84915u;
import java.io.File;
import java.io.IOException;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.e */
public class C50760e implements AbstractC50751l {

    /* renamed from: a */
    private AbstractC50752m f117155a;

    /* renamed from: b */
    private final AbstractC50704l f117156b;

    static {
        Covode.recordClassIndex(59928);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50704l
    /* renamed from: a */
    public final String mo86052a(int i) {
        return this.f117156b.mo86052a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50704l
    /* renamed from: b */
    public final String mo86053b(int i) {
        return this.f117156b.mo86053b(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50704l
    /* renamed from: c */
    public final String mo86054c(int i) {
        return this.f117156b.mo86054c(i);
    }

    public C50760e(AbstractC50704l lVar) {
        C89219l.m154721d(lVar, "");
        this.f117156b = lVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50751l
    /* renamed from: a */
    public final void mo86108a(AbstractC50752m mVar) {
        C89219l.m154721d(mVar, "");
        this.f117155a = mVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50751l
    /* renamed from: d */
    public final C50721d mo86109d(int i) {
        String c = mo86054c(i);
        return new C50721d(C50813c.m95170a(c), c);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50751l
    /* renamed from: a */
    public boolean mo86011a(C50698f fVar) {
        C89219l.m154721d(fVar, "");
        return mo86012f(fVar.f117047a);
    }

    /* renamed from: a */
    private static boolean m95080a(File file) {
        MethodCollector.m26663i(1777);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81548b(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(1777);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(1777);
        return delete;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50751l
    /* renamed from: e */
    public final boolean mo86110e(int i) {
        if (mo86012f(i)) {
            return true;
        }
        String c = mo86054c(i);
        File file = new File(c);
        File file2 = new File(mo86053b(i), mo86052a(i));
        try {
            C84902i.m145883a(c, false);
            C84902i.m145886a(file);
            C84915u.m145938a(file2, file);
            AbstractC50752m mVar = this.f117155a;
            if (mVar != null) {
                mVar.mo86025a(file2);
            }
            m95080a(file2);
            return true;
        } catch (IOException e) {
            AbstractC50752m mVar2 = this.f117155a;
            if (mVar2 != null) {
                mVar2.mo86024a(i, file2, e);
            }
            m95080a(file2);
            return false;
        } catch (Throwable th) {
            m95080a(file2);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo86012f(int i) {
        File[] listFiles;
        File file = new File(mo86054c(i));
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return false;
        }
        boolean z = false;
        for (File file2 : listFiles) {
            C89219l.m154716b(file2, "");
            if (file2.isDirectory()) {
                String name = file2.getName();
                if (new File(file2.getAbsolutePath() + File.separator + name + ".png").exists() || new File(file2.getAbsolutePath() + File.separator + name + ".jpg").exists() || new File(file2.getAbsolutePath() + File.separator + name + ".JPG").exists()) {
                    z = true;
                }
            }
        }
        return z;
    }
}
