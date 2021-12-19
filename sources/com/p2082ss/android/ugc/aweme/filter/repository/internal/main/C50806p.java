package com.p2082ss.android.ugc.aweme.filter.repository.internal.main;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50709q;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import java.util.Map;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.p */
public final class C50806p implements AbstractC50709q {

    /* renamed from: a */
    final C1213t<List<FilterBean>> f117246a;

    /* renamed from: b */
    final C1213t<List<FilterBean>> f117247b;

    /* renamed from: c */
    private final C1213t<List<C89378p<EffectCategoryResponse, List<FilterBean>>>> f117248c;

    /* renamed from: d */
    private final C1213t<Map<String, Effect>> f117249d;

    static {
        Covode.recordClassIndex(59974);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50709q
    /* renamed from: a */
    public final LiveData<List<FilterBean>> mo86074a() {
        return this.f117246a;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50709q
    /* renamed from: b */
    public final LiveData<List<FilterBean>> mo86075b() {
        return this.f117247b;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50709q
    /* renamed from: c */
    public final LiveData<List<C89378p<EffectCategoryResponse, List<FilterBean>>>> mo86076c() {
        return this.f117248c;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50709q
    /* renamed from: d */
    public final LiveData<Map<String, Effect>> mo86077d() {
        return this.f117249d;
    }

    public /* synthetic */ C50806p() {
        this(C89086z.INSTANCE);
    }

    private C50806p(List<? extends FilterBean> list) {
        C89219l.m154721d(list, "");
        C1213t<List<FilterBean>> tVar = new C1213t<>();
        this.f117246a = tVar;
        C1213t<List<C89378p<EffectCategoryResponse, List<FilterBean>>>> tVar2 = new C1213t<>();
        this.f117248c = tVar2;
        C1213t<Map<String, Effect>> tVar3 = new C1213t<>();
        this.f117249d = tVar3;
        C1213t<List<FilterBean>> tVar4 = new C1213t<>();
        this.f117247b = tVar4;
        tVar.setValue(list);
        tVar4.setValue(list);
        tVar2.setValue(C89086z.INSTANCE);
        tVar3.setValue(C89041ag.m154415a());
    }
}
