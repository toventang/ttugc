package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment;

import android.util.Pair;
import com.bytedance.common.utility.AbstractC13621j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.p2082ss.android.ugc.aweme.net.CommonApi;
import com.p2082ss.android.ugc.aweme.utils.C80421fd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.a */
public final class C43645a extends AbstractC13621j {
    static {
        Covode.recordClassIndex(51904);
    }

    @Override // com.bytedance.common.utility.AbstractC13621j
    /* renamed from: a */
    public final String mo21870a(String str, Map<String, String> map) {
        List<C22027b> list;
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new C22027b(entry.getKey(), entry.getValue()));
            }
            list = C89070n.m154585g((Collection) arrayList);
        } else {
            list = new ArrayList<>();
        }
        if (str == null) {
            C89219l.m154715b();
        }
        HashMap hashMap = new HashMap();
        C89219l.m154721d(str, "");
        C89219l.m154721d(hashMap, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(hashMap, "");
        String str2 = (String) C14759i.m27066a(str, (Map<String, String>) null).first;
        C89219l.m154716b(str2, "");
        CommonApi a = C80421fd.m139419a(str2);
        if (a != null) {
            C22099u<String> execute = a.doGet(str, hashMap, list).execute();
            if (execute == null) {
                C89219l.m154715b();
            }
            T t = execute.f52262b;
            if (t == null) {
                C89219l.m154715b();
            }
            return t;
        }
        throw new RuntimeException("CommonApi is null,url=".concat(String.valueOf(str)));
    }

    @Override // com.bytedance.common.utility.AbstractC13621j
    /* renamed from: a */
    public final String mo21869a(String str, List<Pair<String, String>> list, Map<String, String> map) {
        JSONObject jSONObject;
        List<C22027b> list2;
        if (list != null) {
            jSONObject = new JSONObject();
            for (T t : list) {
                jSONObject.put((String) ((Pair) t).first, ((Pair) t).second);
            }
        } else {
            jSONObject = null;
        }
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new C22027b(entry.getKey(), entry.getValue()));
            }
            list2 = C89070n.m154585g((Collection) arrayList);
        } else {
            list2 = new ArrayList<>();
        }
        C80421fd fdVar = C80421fd.f179981a;
        if (str == null) {
            C89219l.m154715b();
        }
        return fdVar.mo123729b(str, jSONObject, null, list2);
    }

    @Override // com.bytedance.common.utility.AbstractC13621j
    /* renamed from: a */
    public final String mo21871a(String str, byte[] bArr, Map<String, String> map) {
        List<C22027b> list;
        TypedByteArray typedByteArray = new TypedByteArray(null, bArr, new String[0]);
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new C22027b(entry.getKey(), entry.getValue()));
            }
            list = C89070n.m154585g((Collection) arrayList);
        } else {
            list = new ArrayList<>();
        }
        if (str == null) {
            C89219l.m154715b();
        }
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        String str2 = (String) C14759i.m27066a(str, (Map<String, String>) null).first;
        C89219l.m154716b(str2, "");
        CommonApi a = C80421fd.m139419a(str2);
        if (a != null) {
            C22099u<String> execute = a.postBody(str, typedByteArray, list).execute();
            if (execute == null) {
                C89219l.m154715b();
            }
            T t = execute.f52262b;
            if (t == null) {
                C89219l.m154715b();
            }
            return t;
        }
        throw new RuntimeException("CommonApi is null,url=".concat(String.valueOf(str)));
    }
}
