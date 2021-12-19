package com.p2082ss.ugc.live.p4460a.p4461a.p4465d;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87010a;
import com.p2082ss.ugc.live.p4460a.p4461a.C87020c;
import com.p2082ss.ugc.live.p4460a.p4461a.p4464c.C87021a;
import com.p2082ss.ugc.live.p4460a.p4461a.p4464c.C87022b;
import com.p2082ss.ugc.live.p4460a.p4461a.p4466e.C87036a;
import java.io.File;

/* renamed from: com.ss.ugc.live.a.a.d.b */
public final class C87028b implements AbstractC87010a<String>, AbstractC87031d<String> {

    /* renamed from: a */
    private AbstractC87031d<String> f196201a;

    /* renamed from: b */
    private AbstractC87010a<String> f196202b;

    static {
        Covode.recordClassIndex(102794);
    }

    public C87028b(AbstractC87031d dVar) {
        this.f196201a = dVar;
    }

    /* renamed from: a */
    private static boolean m150721a(File file) {
        MethodCollector.m26663i(3055);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(3055);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(3055);
        return delete;
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87010a
    /* renamed from: a */
    public final void mo63847a(C87020c cVar, int i) {
        AbstractC87010a<String> aVar = this.f196202b;
        if (aVar != null) {
            aVar.mo63847a(cVar, i);
        }
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.p4465d.AbstractC87031d
    /* renamed from: a */
    public final void mo16296a(C87020c cVar, AbstractC87010a<String> aVar) {
        this.f196202b = aVar;
        this.f196201a.mo16296a(cVar, this);
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87010a
    /* renamed from: a */
    public final void mo63848a(C87020c cVar, C87021a aVar) {
        AbstractC87010a<String> aVar2 = this.f196202b;
        if (aVar2 != null) {
            aVar2.mo63848a(cVar, aVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.a.a.c, java.lang.Object] */
    @Override // com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87010a
    /* renamed from: a */
    public final /* synthetic */ void mo63850a(C87020c cVar, String str) {
        String str2 = str;
        try {
            File file = new File(str2);
            String a = C87036a.m150741a(file);
            if (!cVar.f196193e.equals(a)) {
                mo63848a(cVar, (C87021a) new C87022b(C1764a.m5928a("File %1$s md5 is not equals", new Object[]{str2}), cVar, a));
                m150721a(file);
                return;
            }
            AbstractC87010a<String> aVar = this.f196202b;
            if (aVar != null) {
                aVar.mo63850a(cVar, str2);
            }
        } catch (Exception e) {
            mo63848a(cVar, (C87021a) new C87022b(C1764a.m5928a("File %1$s md5 error", new Object[]{str2}), e, cVar, ""));
        }
    }
}
