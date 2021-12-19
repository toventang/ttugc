package com.bytedance.geckox.p1017e;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.buffer.AbstractC14888a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.utils.C15052e;
import com.bytedance.p1603q.AbstractC21931b;
import com.bytedance.p1603q.AbstractC21935d;
import java.io.File;

/* renamed from: com.bytedance.geckox.e.n */
public class C14926n extends AbstractC21935d<Pair<AbstractC14888a, UpdatePackage>, Pair<UpdatePackage, Long>> {
    static {
        Covode.recordClassIndex(17039);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.q.b, java.lang.Object] */
    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final /* synthetic */ Object mo24020a(AbstractC21931b<Pair<UpdatePackage, Long>> bVar, Pair<AbstractC14888a, UpdatePackage> pair) {
        MethodCollector.m26663i(5158);
        Pair<AbstractC14888a, UpdatePackage> pair2 = pair;
        C14957a.m27543a("start active channel:", ((UpdatePackage) pair2.second).getChannel());
        UpdatePackage updatePackage = (UpdatePackage) pair2.second;
        long version = updatePackage.getVersion();
        File a = C14911b.m27427a(updatePackage);
        File file = new File(a.getParentFile(), String.valueOf(version));
        C15052e.m27712a(file);
        if (a.renameTo(file)) {
            Object a2 = bVar.mo35692a(new Pair<>(updatePackage, Long.valueOf(version)));
            MethodCollector.m26664o(5158);
            return a2;
        }
        RuntimeException runtimeException = new RuntimeException("active merged single file failed:" + a.getAbsolutePath());
        MethodCollector.m26664o(5158);
        throw runtimeException;
    }
}
