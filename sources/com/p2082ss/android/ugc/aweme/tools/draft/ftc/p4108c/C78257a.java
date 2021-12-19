package com.p2082ss.android.ugc.aweme.tools.draft.ftc.p4108c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2698a.C40340a;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.tools.draft.p4109g.AbstractC78376a;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.c.a */
public final class C78257a {

    /* renamed from: a */
    public static final C78257a f175780a = new C78257a();

    private C78257a() {
    }

    static {
        Covode.recordClassIndex(91372);
    }

    /* renamed from: a */
    public static void m136747a(List<? extends C43223c> list) {
        C40340a aVar = new C40340a();
        for (C43223c cVar : list) {
            aVar.mo69486a(cVar);
            cVar.f100880C = aVar.mo69485a();
        }
    }

    /* renamed from: a */
    public static List<C43223c> m136746a(List<? extends AbstractC78376a<Object>> list, boolean z) {
        boolean z2;
        if (list == null || list.isEmpty()) {
            return C89086z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC78376a aVar = (AbstractC78376a) list.get(i);
            if (aVar.f176109b != null) {
                ArrayList<C43223c> arrayList2 = aVar.f176109b;
                if (arrayList2 == null) {
                    C89219l.m154715b();
                }
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C43223c cVar = arrayList2.get(i2);
                    if (cVar != null) {
                        if (i2 == 0 && cVar.f100906f != null) {
                            C69905c cVar2 = cVar.f100906f;
                            C89219l.m154716b(cVar2, "");
                            if (!TextUtils.isEmpty(cVar2.getName())) {
                                C43223c cVar3 = new C43223c();
                                cVar3.f100906f = cVar.f100906f;
                                if (z) {
                                    cVar3.f100924x = 5;
                                } else {
                                    cVar3.f100924x = 1;
                                }
                                arrayList.add(cVar3);
                            }
                        }
                        if (i2 == arrayList2.size() - 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        cVar.f100926z = z2;
                        arrayList.add(cVar);
                    }
                }
            }
        }
        return arrayList;
    }
}
