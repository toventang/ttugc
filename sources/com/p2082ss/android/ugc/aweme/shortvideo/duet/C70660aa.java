package com.p2082ss.android.ugc.aweme.shortvideo.duet;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.als.C2560h;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.aa */
public final class C70660aa implements AbstractC70734y {

    /* renamed from: a */
    private final ActivityC0945e f158159a;

    /* renamed from: b */
    private final AbstractC14177d f158160b;

    static {
        Covode.recordClassIndex(83131);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.duet.AbstractC70734y
    /* renamed from: a */
    public final C2560h<Boolean> mo111487a() {
        return this.f158160b.mo22818g();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.duet.AbstractC70734y
    /* renamed from: b */
    public final ShortVideoContext mo111488b() {
        AbstractC1174ac a = C1181ae.m3881a(this.f158159a, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
        C89219l.m154716b(a, "");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f155842a;
        C89219l.m154716b(shortVideoContext, "");
        return shortVideoContext;
    }

    public C70660aa(ActivityC0945e eVar, AbstractC14177d dVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(dVar, "");
        this.f158159a = eVar;
        this.f158160b = dVar;
    }
}
