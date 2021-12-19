package com.bytedance.geckox.p1017e;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1023j.C14959a;
import com.bytedance.geckox.p1023j.C14960b;
import com.bytedance.p1603q.AbstractC21931b;
import com.bytedance.p1603q.AbstractC21935d;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.geckox.e.k */
public final class C14922k extends AbstractC21935d<List<UpdatePackage>, List<? extends UpdatePackage>> {
    static {
        Covode.recordClassIndex(17035);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.q.b, java.lang.Object] */
    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final /* synthetic */ Object mo24020a(AbstractC21931b<List<? extends UpdatePackage>> bVar, List<UpdatePackage> list) {
        List<UpdatePackage> list2 = list;
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(list2, "");
        ListIterator<UpdatePackage> listIterator = list2.listIterator();
        while (listIterator.hasNext()) {
            UpdatePackage next = listIterator.next();
            String accessKey = next.getAccessKey();
            ConcurrentHashMap<String, C14959a> concurrentHashMap = C14960b.f36542a.get(accessKey);
            if (concurrentHashMap == null) {
                C89219l.m154709a((Object) accessKey, "");
                concurrentHashMap = C14960b.m27548a(accessKey);
                if (concurrentHashMap == null) {
                }
            }
            C14959a aVar = concurrentHashMap.get(next.getChannel());
            if (aVar != null && !aVar.allowUpdate) {
                listIterator.remove();
            }
        }
        if (list2.isEmpty()) {
            return null;
        }
        return bVar.mo35692a(list2);
    }
}
