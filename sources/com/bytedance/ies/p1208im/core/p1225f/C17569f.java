package com.bytedance.ies.p1208im.core.p1225f;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.p1399im.core.internal.utils.AbstractC20003k;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.f.f */
public final class C17569f implements AbstractC20003k {

    /* renamed from: a */
    private Keva f42023a;

    static {
        Covode.recordClassIndex(20058);
    }

    @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
    /* renamed from: a */
    public final void mo27988a() {
        this.f42023a.clear();
    }

    @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
    /* renamed from: a */
    public final int mo27987a(String str) {
        C89219l.m154721d(str, "");
        return this.f42023a.getInt(str, 0);
    }

    public C17569f(String str) {
        C89219l.m154721d(str, "");
        C19483d a = C19483d.m36365a();
        C89219l.m154716b(a, "");
        Keva repoFromSp = Keva.getRepoFromSp(a.f46156a, str, 0);
        C89219l.m154716b(repoFromSp, "");
        this.f42023a = repoFromSp;
        C19512f.m36457b("imsdk", "SDKSP constructor, spName:".concat(String.valueOf(str)), (Throwable) null);
    }

    @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
    /* renamed from: b */
    public final boolean mo27997b(String str) {
        C89219l.m154721d(str, "");
        return this.f42023a.getBoolean(str, false);
    }

    @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
    /* renamed from: b */
    public final /* synthetic */ long mo27994b(String str, Long l) {
        long longValue = l.longValue();
        C89219l.m154721d(str, "");
        return this.f42023a.getLong(str, longValue);
    }

    @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
    /* renamed from: a */
    public final void mo27989a(String str, int i) {
        C89219l.m154721d(str, "");
        this.f42023a.storeInt(str, i);
    }

    @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
    /* renamed from: b */
    public final /* synthetic */ Float mo27995b(String str, Float f) {
        float floatValue = f.floatValue();
        C89219l.m154721d(str, "");
        return Float.valueOf(this.f42023a.getFloat(str, floatValue));
    }

    @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
    /* renamed from: a */
    public final /* synthetic */ void mo27990a(String str, Float f) {
        float floatValue = f.floatValue();
        C89219l.m154721d(str, "");
        this.f42023a.storeFloat(str, floatValue);
    }

    @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
    /* renamed from: b */
    public final String mo27996b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        String string = this.f42023a.getString(str, str2);
        C89219l.m154716b(string, "");
        return string;
    }

    @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
    /* renamed from: a */
    public final /* synthetic */ void mo27991a(String str, Long l) {
        long longValue = l.longValue();
        C89219l.m154721d(str, "");
        this.f42023a.storeLong(str, longValue);
    }

    @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
    /* renamed from: a */
    public final void mo27992a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f42023a.storeString(str, str2);
    }

    @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
    /* renamed from: a */
    public final void mo27993a(String str, boolean z) {
        C89219l.m154721d(str, "");
        this.f42023a.storeBoolean(str, z);
    }
}
