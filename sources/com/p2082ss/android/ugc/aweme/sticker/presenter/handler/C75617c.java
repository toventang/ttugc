package com.p2082ss.android.ugc.aweme.sticker.presenter.handler;

import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.als.C2560h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75592f;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.aweme.sticker.senor.AbstractC75877c;
import com.p2082ss.android.ugc.aweme.sticker.senor.presenter.DefaultSenorPresenter;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.c */
public final class C75617c extends AbstractC75614b {

    /* renamed from: a */
    private boolean f170015a;

    /* renamed from: b */
    private final ActivityC0218d f170016b;

    /* renamed from: c */
    private final C2560h<Boolean> f170017c;

    /* renamed from: d */
    private final AbstractC89171a<Boolean> f170018d;

    /* renamed from: e */
    private final AbstractC75877c f170019e;

    /* renamed from: f */
    private final AbstractC75592f f170020f;

    /* renamed from: g */
    private final boolean f170021g;

    static {
        Covode.recordClassIndex(88548);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23210a() {
        if (this.f170021g) {
            this.f170020f.mo23147b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final boolean mo23213a(C75618a aVar) {
        C89219l.m154721d(aVar, "");
        if (!C75466g.m132359k(aVar.f170022a)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final void m132671a(boolean z) {
        boolean z2;
        Boolean a = this.f170017c.mo7034a();
        if (a != null) {
            z2 = a.booleanValue();
        } else {
            z2 = false;
        }
        ActivityC0218d dVar = this.f170016b;
        this.f170020f.mo23146a(new DefaultSenorPresenter(dVar, dVar, z2, this.f170019e, this.f170018d.invoke().booleanValue(), this.f170020f.mo23148c(), this.f170021g), z);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23212a(C75619b bVar, C75618a aVar) {
        boolean z;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        if (aVar.f170022a.getTypes().contains("highRotationFreq")) {
            this.f170015a = true;
            int[] iArr = {11, 15};
            Boolean a = this.f170017c.mo7034a();
            if (a != null) {
                z = a.booleanValue();
            } else {
                z = false;
            }
            ActivityC0218d dVar = this.f170016b;
            DefaultSenorPresenter defaultSenorPresenter = new DefaultSenorPresenter(dVar, dVar, z, this.f170019e, this.f170018d.invoke().booleanValue(), this.f170020f.mo23148c(), this.f170021g);
            int i = 0;
            do {
                int i2 = iArr[i];
                if (i2 != 0) {
                    defaultSenorPresenter.f170434a.put(i2, 0);
                }
                i++;
            } while (i < 2);
            this.f170020f.mo23146a(defaultSenorPresenter, true);
        } else if (this.f170015a) {
            this.f170015a = false;
            m132671a(true);
        } else {
            m132671a(false);
        }
    }

    private C75617c(ActivityC0218d dVar, C2560h<Boolean> hVar, AbstractC89171a<Boolean> aVar, AbstractC75877c cVar, AbstractC75592f fVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(fVar, "");
        this.f170016b = dVar;
        this.f170017c = hVar;
        this.f170018d = aVar;
        this.f170019e = cVar;
        this.f170020f = fVar;
        this.f170021g = false;
    }

    public /* synthetic */ C75617c(ActivityC0218d dVar, C2560h hVar, AbstractC89171a aVar, AbstractC75877c cVar, AbstractC75592f fVar, byte b) {
        this(dVar, hVar, aVar, cVar, fVar);
    }
}
