package com.p2082ss.android.ugc.aweme.ecommerce.sku.p2861c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuSaleProp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.c.a */
public final class C45419a {

    /* renamed from: a */
    public static final C45419a f105826a = new C45419a();

    private C45419a() {
    }

    static {
        Covode.recordClassIndex(53893);
    }

    /* renamed from: a */
    public static SkuItem m87988a(String str, List<SkuItem> list) {
        T t;
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C89361p.m154872a(t.getSalePropValueIds(), str, false)) {
                break;
            }
        }
        return t;
    }

    /* renamed from: a */
    public static int m87987a(String[] strArr, List<SkuItem> list) {
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(list, "");
        int length = strArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!C89219l.m154714a((Object) strArr[i2], (Object) "")) {
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    T t2 = t;
                    List<SkuSaleProp> skuSalePropList = t2.getSkuSalePropList();
                    if (skuSalePropList != null && !skuSalePropList.isEmpty() && m87989a(t2.getSkuSalePropList(), strArr[i2])) {
                        arrayList.add(t);
                    }
                }
                list = arrayList;
            }
        }
        for (SkuItem skuItem : list) {
            if (skuItem.getStockNum() != null) {
                i += skuItem.getStockNum().intValue();
            }
        }
        return i;
    }

    /* renamed from: a */
    private static boolean m87989a(List<SkuSaleProp> list, String str) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (C89219l.m154714a((Object) it.next().f105871b, (Object) str)) {
                return true;
            }
        }
        return false;
    }
}
