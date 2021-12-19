package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.p2160ml.C30091m;
import com.p2082ss.android.ugc.aweme.property.C65433dp;
import com.p2082ss.android.ugc.aweme.property.C65434dq;
import com.p2082ss.android.ugc.aweme.property.C65466es;
import com.p2082ss.android.ugc.aweme.property.C65467et;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72598ae;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.ag */
public final class C72604ag implements AbstractC72629g {

    /* renamed from: a */
    public static final C30091m f162761a;

    /* renamed from: b */
    public static final C72604ag f162762b = new C72604ag();

    private C72604ag() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72629g
    /* renamed from: a */
    public final void mo114903a() {
        C30091m mVar = f162761a;
        if (mVar != null) {
            mVar.mo53464b();
        }
    }

    static {
        C30091m mVar;
        Covode.recordClassIndex(85287);
        C65433dp a = C65434dq.m117151a();
        if (a != null) {
            C84911q.m145928d("SmartCompileV2 , component init , model : ".concat(String.valueOf(a)));
            mVar = new C30091m(new C72596ad(a));
        } else {
            mVar = null;
        }
        f162761a = mVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.ag$a */
    public static final class C72605a<T> implements Comparator {
        static {
            Covode.recordClassIndex(85288);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a((Float) t2.getValue(), (Float) t.getValue());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72629g
    /* renamed from: a */
    public final List<AbstractC72598ae> mo114902a(Map<String, Float> map, boolean z) {
        AbstractC72598ae aVar;
        C89219l.m154721d(map, "");
        if (f162761a == null) {
            return C89086z.INSTANCE;
        }
        List<Map.Entry> a = C89070n.m154553a((Iterable) map.entrySet(), (Comparator) new C72605a());
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) a, 10));
        for (Map.Entry entry : a) {
            arrayList.add(entry.getKey());
        }
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!z || (!C89219l.m154714a(obj, (Object) "skip"))) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (String str : arrayList2) {
            if (C89219l.m154714a((Object) str, (Object) "skip")) {
                aVar = new AbstractC72598ae.C72600b(str);
            } else {
                int a2 = C89361p.m154885a((CharSequence) str, "_");
                if (a2 <= 0 || a2 >= str.length() - 1) {
                    C22708a.m42800a("SmartCompileV2 ErrorLabel:".concat(String.valueOf(str)));
                } else {
                    C65467et[] a3 = C65466es.m117193a();
                    if (a3 != null) {
                        int length = a3.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            C65467et etVar = a3[i];
                            if (C89219l.m154714a((Object) etVar.f147658a, (Object) str)) {
                                String str2 = etVar.f147659b;
                                if (str2 != null) {
                                    int length2 = str.length();
                                    Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                                    String substring = str.substring(a2 + 1, length2);
                                    C89219l.m154716b(substring, "");
                                    int hashCode = substring.hashCode();
                                    if (hashCode != 3343) {
                                        if (hashCode == 3684 && substring.equals("sw")) {
                                            aVar = new AbstractC72598ae.C72601c(str2, str);
                                        }
                                    } else if (substring.equals("hw")) {
                                        aVar = new AbstractC72598ae.C72599a(str2, str);
                                    }
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                    C22708a.m42800a("SmartCompileV2 ErrorLabel:".concat(String.valueOf(str)));
                }
            }
            arrayList3.add(aVar);
        }
        return arrayList3;
    }
}
