package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.services.apm.api.C22708a;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.AdditionalInfoItem;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetails;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45560e;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45573n;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.d.e */
public final class C44775e {
    static {
        Covode.recordClassIndex(53161);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.d.e$a */
    public static final class C44776a extends C27895a<List<? extends ProductDetails>> {
        static {
            Covode.recordClassIndex(53162);
        }

        C44776a() {
        }
    }

    /* renamed from: a */
    public static final List<Object> m87497a(ProductPackStruct productPackStruct, boolean z) {
        Iterable<ProductDetails> iterable;
        String str;
        C89219l.m154721d(productPackStruct, "");
        try {
            C27910f fVar = new C27910f();
            ProductBase productBase = productPackStruct.f104677e;
            if (productBase == null || (str = productBase.f104658b) == null) {
                str = "{}";
            }
            Object a = fVar.mo46671a(str, new C44776a().type);
            C89219l.m154716b(a, "");
            iterable = (List) a;
        } catch (Exception e) {
            C22708a.m42802a((Throwable) e);
            iterable = C89086z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        ProductBase productBase2 = productPackStruct.f104677e;
        if ((productBase2 != null ? productBase2.f104659c : null) != null) {
            arrayList.add(new C44785n(productPackStruct.f104677e.f104659c));
        }
        for (ProductDetails productDetails : iterable) {
            String str2 = productDetails.f104667a;
            if (str2 != null) {
                int hashCode = str2.hashCode();
                if (hashCode != 3735) {
                    if (hashCode != 3556653) {
                        if (hashCode != 100313435) {
                            if (hashCode == 110371416) {
                                if (!str2.equals("title")) {
                                }
                            }
                        } else if (str2.equals("image")) {
                            Image image = productDetails.f104668b;
                            if ((image != null ? image.getUrls() : null) != null) {
                                arrayList.add(new C44777f(productDetails.f104668b));
                            }
                        }
                    } else if (!str2.equals("text")) {
                    }
                    if (productDetails.f104669c != null) {
                        arrayList.add(new C44784m(productDetails.f104669c, productDetails.f104667a));
                    }
                } else if (str2.equals("ul") && productDetails.f104670d != null) {
                    List<String> list = productDetails.f104670d;
                    ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new C44784m(it.next(), "ul"));
                    }
                    arrayList.addAll(arrayList2);
                }
            }
        }
        if (z && (!arrayList.isEmpty())) {
            String string = C17867d.m33078a().getString(R.string.bfp);
            C89219l.m154716b(string, "");
            arrayList.add(0, new C44784m(string, "title"));
        }
        if (productPackStruct.f104682j != null && (!productPackStruct.f104682j.isEmpty())) {
            for (T t : productPackStruct.f104682j) {
                arrayList.add(new C44784m(t.f104629b, "title"));
                List<AdditionalInfoItem> list2 = t.f104630c;
                if (list2 != null) {
                    for (T t2 : list2) {
                        arrayList.add(new C44784m(C45573n.m88120a(t2.f104631a + t2.f104632b, new C45560e(t2.f104631a, R.color.bx, (byte) 0), new C45560e(t2.f104632b, R.color.c4, (byte) 0)), "text"));
                    }
                }
            }
        }
        return arrayList;
    }
}
