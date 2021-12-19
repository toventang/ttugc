package com.p2082ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.ftc.p3037i.C52614a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.record.C66764a;
import com.p2082ss.android.ugc.gamora.PageFactory;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.w */
public final class C67940w implements PageFactory {

    /* renamed from: a */
    public static final C67940w f152202a = new C67940w();

    /* renamed from: b */
    private final /* synthetic */ PageFactory f152203b;

    @Override // com.p2082ss.android.ugc.gamora.PageFactory
    /* renamed from: a */
    public final void mo88345a(AbstractC22186b bVar) {
        C89219l.m154721d(bVar, "");
        this.f152203b.mo88345a(bVar);
    }

    static {
        Covode.recordClassIndex(80109);
    }

    private C67940w() {
        PageFactory aVar;
        if (C63244g.m114602a().mo73255A().mo93901a()) {
            aVar = new C52614a();
        } else {
            aVar = new C66764a();
        }
        this.f152203b = aVar;
    }
}
