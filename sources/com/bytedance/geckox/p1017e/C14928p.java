package com.bytedance.geckox.p1017e;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.C14930f;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1012b.C14884b;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.p1603q.AbstractC21931b;
import com.bytedance.p1603q.AbstractC21935d;
import java.io.File;

/* renamed from: com.bytedance.geckox.e.p */
public class C14928p extends AbstractC21935d<Pair<UpdatePackage, Long>, Pair<UpdatePackage, Long>> {
    static {
        Covode.recordClassIndex(17041);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.q.b, java.lang.Object] */
    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo24020a(AbstractC21931b<Pair<UpdatePackage, Long>> bVar, Pair<UpdatePackage, Long> pair) {
        return m27468a(bVar, pair);
    }

    /* renamed from: a */
    private static Object m27468a(AbstractC21931b<Pair<UpdatePackage, Long>> bVar, Pair<UpdatePackage, Long> pair) {
        C14957a.m27543a("update success:", pair);
        try {
            return bVar.mo35692a(pair);
        } finally {
            UpdatePackage updatePackage = (UpdatePackage) pair.first;
            String accessKey = updatePackage.getAccessKey();
            String channel = updatePackage.getChannel();
            String str = C14930f.m27473a().f36475a.get(accessKey);
            if (str != null && !TextUtils.isEmpty(str)) {
                C14884b.m27328a(new File(new File(str, accessKey), channel).getAbsolutePath(), (Long) pair.second, false, 41);
            }
        }
    }
}
