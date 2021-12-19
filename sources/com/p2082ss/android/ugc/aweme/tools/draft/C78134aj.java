package com.p2082ss.android.ugc.aweme.tools.draft;

import android.text.TextUtils;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2698a.C40340a;
import com.p2082ss.android.ugc.aweme.tools.draft.p4109g.AbstractC78376a;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.aj */
public final class C78134aj {
    static {
        Covode.recordClassIndex(91249);
    }

    /* renamed from: a */
    public static void m136624a(List<C43223c> list) {
        if (!C13617h.m24465a(list)) {
            C40340a aVar = new C40340a();
            for (C43223c cVar : list) {
                if (cVar != null) {
                    aVar.mo69486a(cVar);
                    cVar.f100880C = aVar.mo69485a();
                }
            }
        }
    }

    /* renamed from: b */
    private static String m136625b(List<C43223c> list) {
        String str;
        if (C84904k.m145909a(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (C43223c cVar : list) {
            String str2 = cVar.f100892O;
            if (!TextUtils.isEmpty(str2)) {
                String[] split = str2.split(",");
                for (String str3 : split) {
                    if (!sb.toString().contains(str3)) {
                        if (sb.length() == 0) {
                            str = "";
                        } else {
                            str = ",";
                        }
                        sb.append(str).append(str3);
                    }
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    static List<C43223c> m136623a(List<AbstractC78376a<Object>> list, boolean z) {
        if (C13603b.m24435a((Collection) list)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            AbstractC78376a<Object> aVar = list.get(i);
            if (!(aVar == null || aVar.f176109b == null)) {
                ArrayList<C43223c> arrayList2 = aVar.f176109b;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    C43223c cVar = arrayList2.get(i2);
                    if (cVar != null) {
                        if (i2 == 0 && cVar.f100906f != null && !TextUtils.isEmpty(cVar.f100906f.getName())) {
                            C43223c cVar2 = new C43223c();
                            cVar2.f100906f = cVar.f100906f;
                            if (z) {
                                cVar2.f100924x = 5;
                            } else {
                                cVar2.f100924x = 1;
                            }
                            cVar2.f100892O = m136625b(arrayList2);
                            arrayList.add(cVar2);
                        }
                        if (i2 == arrayList2.size() - 1) {
                            cVar.f100926z = true;
                        } else {
                            cVar.f100926z = false;
                        }
                        arrayList.add(cVar);
                    }
                }
            }
        }
        return arrayList;
    }
}
