package com.p2082ss.android.ugc.aweme.p3070im.service.share;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69650k;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.service.share.ImWebSharePackage */
public final class ImWebSharePackage extends SharePackage {

    /* renamed from: a */
    public String f128341a;

    /* renamed from: b */
    public boolean f128342b = true;

    static {
        Covode.recordClassIndex(66075);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImWebSharePackage(SharePackage.C69654a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    /* renamed from: a */
    public final /* synthetic */ AbstractC69645h mo87088a(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        C69650k kVar = new C69650k(this.f155491h, this.f155489f, this.f155490g);
        String a = C34577e.m70588a(this.f128341a);
        if (!TextUtils.isEmpty(a)) {
            C89219l.m154716b(a, "");
            kVar.mo109799a("thumb_path", a);
        }
        return kVar;
    }
}
