package com.bytedance.geckox.p1017e;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.C14930f;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.utils.C15064m;
import com.bytedance.p1603q.AbstractC21931b;
import com.bytedance.p1603q.AbstractC21935d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.geckox.e.i */
public class C14920i extends AbstractC21935d<String, Map<String, List<Pair<String, Long>>>> {

    /* renamed from: a */
    private boolean f36461a;

    static {
        Covode.recordClassIndex(17033);
    }

    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final void mo24021a(Object... objArr) {
        super.mo24021a(objArr);
        this.f36461a = ((Boolean) objArr[0]).booleanValue();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.q.b, java.lang.Object] */
    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final /* synthetic */ Object mo24020a(AbstractC21931b<Map<String, List<Pair<String, Long>>>> bVar, String str) {
        Long a;
        C14957a.m27543a("get local channel version");
        Map<String, String> map = C14930f.m27473a().f36475a;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            File file = new File(entry.getValue(), key);
            String[] list = file.list();
            ArrayList arrayList = new ArrayList();
            if (list != null && list.length > 0) {
                for (String str2 : list) {
                    File file2 = new File(file, str2);
                    if (file2.isDirectory() && (a = C15064m.m27738a(file2)) != null) {
                        arrayList.add(new Pair<>(str2, a));
                    }
                }
            }
            List<Pair<String, Long>> list2 = hashMap.get(key);
            if (list2 != null) {
                list2.addAll(arrayList);
            } else {
                hashMap.put(key, arrayList);
            }
        }
        return bVar.mo35692a(hashMap);
    }
}
