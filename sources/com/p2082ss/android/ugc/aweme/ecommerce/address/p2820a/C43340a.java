package com.p2082ss.android.ugc.aweme.ecommerce.address.p2820a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.InputItemDTO;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.a.a */
public final class C43340a {

    /* renamed from: a */
    public InputItemDTO f101148a;

    /* renamed from: b */
    public Object f101149b;

    /* renamed from: c */
    public String f101150c;

    static {
        Covode.recordClassIndex(51557);
    }

    public /* synthetic */ C43340a(InputItemDTO inputItemDTO) {
        this(inputItemDTO, null, null);
    }

    private C43340a(InputItemDTO inputItemDTO, Object obj, String str) {
        C89219l.m154721d(inputItemDTO, "");
        this.f101148a = inputItemDTO;
        this.f101149b = obj;
        this.f101150c = str;
    }

    /* renamed from: a */
    private static C43340a m86458a(InputItemDTO inputItemDTO, Object obj, String str) {
        C89219l.m154721d(inputItemDTO, "");
        return new C43340a(inputItemDTO, obj, str);
    }

    /* renamed from: a */
    public static /* synthetic */ C43340a m86457a(C43340a aVar, InputItemDTO inputItemDTO, Object obj, String str, int i) {
        if ((i & 1) != 0) {
            inputItemDTO = aVar.f101148a;
        }
        if ((i & 2) != 0) {
            obj = aVar.f101149b;
        }
        if ((i & 4) != 0) {
            str = aVar.f101150c;
        }
        return m86458a(inputItemDTO, obj, str);
    }
}
