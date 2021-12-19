package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.data.a.a */
public final class C55959a implements AbstractC55960b {

    /* renamed from: a */
    public final C1213t<String> f127609a = new C1213t<>();

    /* renamed from: b */
    public final C1213t<List<IMContact>> f127610b = new C1213t<>();

    /* renamed from: c */
    public final C1213t<List<IMContact>> f127611c = new C1213t<>();

    /* renamed from: e */
    private final List<IMContact> f127612e;

    static {
        Covode.recordClassIndex(65752);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a.AbstractC55960b
    /* renamed from: a */
    public final void mo92829a(String str) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a.AbstractC55960b
    /* renamed from: d */
    public final void mo92832d() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a.AbstractC55960b
    /* renamed from: f */
    public final void mo92834f() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a.AbstractC55960b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ LiveData mo92828a() {
        return this.f127609a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a.AbstractC55960b
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ LiveData mo92830b() {
        return this.f127610b;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a.AbstractC55960b
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ LiveData mo92831c() {
        return this.f127611c;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a.AbstractC55960b
    /* renamed from: e */
    public final void mo92833e() {
        this.f127611c.setValue(this.f127612e);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMContact> */
    /* JADX WARN: Multi-variable type inference failed */
    public C55959a(List<? extends IMContact> list) {
        C89219l.m154721d(list, "");
        this.f127612e = list;
    }
}
