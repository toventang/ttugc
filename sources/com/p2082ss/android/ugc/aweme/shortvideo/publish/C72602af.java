package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.p2160ml.C30091m;
import com.p2082ss.android.ugc.aweme.property.C65432do;
import com.p2082ss.android.ugc.aweme.property.SmartCompileModelV1;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72598ae;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.af */
public final class C72602af implements AbstractC72629g {

    /* renamed from: a */
    public static final C30091m f162759a;

    /* renamed from: b */
    public static final C72602af f162760b = new C72602af();

    private C72602af() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72629g
    /* renamed from: a */
    public final void mo114903a() {
        C30091m mVar = f162759a;
        if (mVar != null) {
            mVar.mo53464b();
        }
    }

    static {
        C30091m mVar;
        Covode.recordClassIndex(85285);
        SmartCompileModelV1 a = C65432do.m117150a();
        if (a != null) {
            C84911q.m145928d("SmartCompileV1 , component init , model : ".concat(String.valueOf(a)));
            mVar = new C30091m(new C72596ad(a));
        } else {
            mVar = null;
        }
        f162759a = mVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.af$a */
    public static final class C72603a<T> implements Comparator {
        static {
            Covode.recordClassIndex(85286);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a((Float) t2.getValue(), (Float) t.getValue());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72629g
    /* renamed from: a */
    public final List<AbstractC72598ae> mo114902a(Map<String, Float> map, boolean z) {
        Object obj;
        C89219l.m154721d(map, "");
        if (f162759a == null) {
            return C89086z.INSTANCE;
        }
        SmartCompileModelV1 a = C65432do.m117150a();
        if (a == null) {
            return C89086z.INSTANCE;
        }
        List<Map.Entry> a2 = C89070n.m154553a((Iterable) map.entrySet(), (Comparator) new C72603a());
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) a2, 10));
        for (Map.Entry entry : a2) {
            arrayList.add(entry.getKey());
        }
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!z || (!C89219l.m154714a(obj2, (Object) "skip"))) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (String str : arrayList2) {
            int hashCode = str.hashCode();
            if (hashCode != 3343) {
                if (hashCode != 3684) {
                    if (hashCode == 3532159 && str.equals("skip")) {
                        obj = new AbstractC72598ae.C72600b(str);
                        arrayList3.add(obj);
                    }
                } else if (str.equals("sw")) {
                    obj = new AbstractC72598ae.C72601c(a.getSwCompileSetting(), str);
                    arrayList3.add(obj);
                }
            } else if (str.equals("hw")) {
                obj = new AbstractC72598ae.C72599a(a.getHwCompileSetting(), str);
                arrayList3.add(obj);
            }
            C22708a.m42800a("SmartCompileV1 ErrorLabel:".concat(String.valueOf(str)));
        }
        ArrayList arrayList4 = arrayList3;
        if (arrayList4.size() < 2) {
            C22708a.m42800a("SmartCompileV1 ErrorResultLabelSize:" + arrayList4.size());
        }
        return arrayList4;
    }
}
