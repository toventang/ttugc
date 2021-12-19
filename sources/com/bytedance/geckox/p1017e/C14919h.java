package com.bytedance.geckox.p1017e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.C14930f;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.policy.p1028b.C14978a;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.p1603q.AbstractC21931b;
import com.bytedance.p1603q.AbstractC21935d;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.geckox.e.h */
public class C14919h extends AbstractC21935d<List<UpdatePackage>, List<UpdatePackage>> {
    static {
        Covode.recordClassIndex(17032);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.q.b, java.lang.Object] */
    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final /* synthetic */ Object mo24020a(AbstractC21931b<List<UpdatePackage>> bVar, List<UpdatePackage> list) {
        List<UpdatePackage> list2 = list;
        GlobalConfigSettings e = C14930f.m27473a().mo24034e();
        if (!(e == null || e.getReqMeta() == null || e.getReqMeta().getLazy() == null)) {
            Map<String, GlobalConfigSettings.LazyItem> lazy = e.getReqMeta().getLazy();
            for (int size = list2.size() - 1; size >= 0; size--) {
                UpdatePackage updatePackage = list2.get(size);
                String accessKey = updatePackage.getAccessKey();
                if (lazy.containsKey(accessKey)) {
                    GlobalConfigSettings.LazyItem lazyItem = lazy.get(accessKey);
                    String groupName = updatePackage.getGroupName();
                    String channel = updatePackage.getChannel();
                    if (!(TextUtils.isEmpty(groupName) || lazyItem.getGroups() == null || !lazyItem.getGroups().contains(groupName)) || (C14978a.f36587a != null && C14978a.f36587a.containsKey(accessKey + "-" + channel))) {
                        String str = accessKey + "-" + groupName;
                        if (C14978a.f36588b == null) {
                            C14978a.f36588b = new ConcurrentHashMap();
                        }
                        C14978a.f36588b.put(str, updatePackage);
                        C14978a.m27578a(accessKey + "-" + channel, updatePackage);
                        list2.remove(size);
                    } else if (lazyItem.getChannels() != null && lazyItem.getChannels().contains(channel)) {
                        C14978a.m27578a(accessKey + "-" + channel, updatePackage);
                        list2.remove(size);
                    }
                }
            }
        }
        if (list2.size() == 0) {
            return null;
        }
        return bVar.mo35692a(list2);
    }
}
