package com.bytedance.geckox.p1017e.p1018a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.C14905e;
import com.bytedance.geckox.buffer.AbstractC14888a;
import com.bytedance.geckox.buffer.impl.C14891a;
import com.bytedance.geckox.buffer.p1014a.C14889a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1015c.C14896a;
import com.bytedance.geckox.p1015c.C14898c;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.utils.C15052e;
import com.bytedance.geckox.utils.C15058i;
import com.bytedance.geckox.utils.C15072q;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.p1603q.AbstractC21931b;
import com.bytedance.p1603q.AbstractC21935d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;

/* renamed from: com.bytedance.geckox.e.a.a */
public class C14909a extends AbstractC21935d<Pair<AbstractC14888a, UpdatePackage>, Pair<AbstractC14888a, UpdatePackage>> {

    /* renamed from: a */
    private C14905e f36438a;

    static {
        Covode.recordClassIndex(17022);
    }

    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final void mo24021a(Object... objArr) {
        super.mo24021a(objArr);
        this.f36438a = (C14905e) objArr[0];
    }

    /* renamed from: a */
    private static boolean m27420a(File file) {
        MethodCollector.m26663i(5138);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(5138);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(5138);
        return delete;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.q.b, java.lang.Object] */
    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo24020a(AbstractC21931b<Pair<AbstractC14888a, UpdatePackage>> bVar, Pair<AbstractC14888a, UpdatePackage> pair) {
        return m27419a(bVar, pair);
    }

    /* renamed from: a */
    private static Object m27419a(AbstractC21931b<Pair<AbstractC14888a, UpdatePackage>> bVar, Pair<AbstractC14888a, UpdatePackage> pair) {
        C14957a.m27543a("start decompress zstd file, channel:", ((UpdatePackage) pair.second).getChannel());
        AbstractC14888a aVar = (AbstractC14888a) pair.first;
        aVar.mo23976b(0);
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        File file = new File(aVar.mo23980f().getParentFile(), "res.zst.tmp");
        C15052e.m27712a(file);
        AbstractC14888a a = C14891a.m27370a(file, file.length());
        try {
            C15072q.m27749a(aVar, a);
            m27420a(aVar.mo23980f());
            a.mo23976b(0);
            try {
                C15058i.m27725a(new C14889a(a), updatePackage.getPackage().getDecompressMd5());
                try {
                    return bVar.mo35692a(new Pair<>(a, updatePackage));
                } finally {
                    a.mo23979e();
                }
            } catch (Throwable th) {
                m27420a(a.mo23980f());
                throw new C14896a(th.getMessage(), th);
            }
        } catch (Exception e) {
            m27420a(a.mo23980f());
            throw new C14898c(e.getMessage(), e);
        } catch (Throwable th2) {
            m27420a(aVar.mo23980f());
            throw th2;
        }
    }
}
