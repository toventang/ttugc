package com.p2082ss.android.ugc.aweme.sticker.presenter;

import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.repository.C75675a;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3990b.AbstractC75759f;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75705k;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75715t;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75719x;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.c */
public class C75589c implements AbstractC75594h {

    /* renamed from: a */
    private AbstractC75759f f169921a;

    /* renamed from: b */
    private AbstractC75705k f169922b;

    /* renamed from: c */
    private AbstractC75719x f169923c;

    /* renamed from: d */
    private AbstractC75650j f169924d;

    /* renamed from: e */
    private final ActivityC0218d f169925e;

    /* renamed from: f */
    private final C75657q f169926f;

    /* renamed from: g */
    private final AbstractC75715t f169927g;

    /* renamed from: h */
    private final AbstractC84398d f169928h;

    /* renamed from: i */
    private final List<EffectCategoryModel> f169929i;

    static {
        Covode.recordClassIndex(88514);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75594h
    /* renamed from: a */
    public final AbstractC75655o mo119314a() {
        AbstractC75719x xVar = this.f169923c;
        if (xVar == null) {
            xVar = mo119315a(this.f169926f.f170069a, this.f169928h, this.f169927g, this.f169929i);
        }
        return new DefaultStickerDataManager(this.f169925e, this.f169926f, xVar, this.f169924d, this.f169922b);
    }

    /* renamed from: a */
    public final void mo119316a(AbstractC75705k kVar) {
        C89219l.m154721d(kVar, "");
        this.f169922b = kVar;
    }

    /* renamed from: a */
    public final void mo119317a(AbstractC75759f fVar) {
        C89219l.m154721d(fVar, "");
        this.f169921a = fVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C75589c(androidx.appcompat.app.ActivityC0218d r7, com.p2082ss.android.ugc.aweme.sticker.presenter.C75657q r8, com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75715t r9, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d r10) {
        /*
            r6 = this;
            r1 = r7
            java.util.List r5 = com.p2082ss.android.ugc.aweme.sticker.p3970p.C75464f.C75465a.m132336a(r1)
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r5, r0)
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sticker.presenter.C75589c.<init>(androidx.appcompat.app.d, com.ss.android.ugc.aweme.sticker.presenter.q, com.ss.android.ugc.aweme.sticker.repository.a.t, com.ss.android.ugc.tools.b.a.d):void");
    }

    /* renamed from: a */
    public AbstractC75719x mo119315a(String str, AbstractC84398d dVar, AbstractC75715t tVar, List<EffectCategoryModel> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(tVar, "");
        C89219l.m154721d(list, "");
        C75675a aVar = new C75675a(str, dVar, tVar, list);
        AbstractC75759f fVar = this.f169921a;
        if (fVar != null) {
            C89219l.m154721d(fVar, "");
            aVar.f170098c = fVar;
        }
        return aVar;
    }

    public C75589c(ActivityC0218d dVar, C75657q qVar, AbstractC75715t tVar, AbstractC84398d dVar2, List<EffectCategoryModel> list) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(tVar, "");
        C89219l.m154721d(dVar2, "");
        C89219l.m154721d(list, "");
        this.f169925e = dVar;
        this.f169926f = qVar;
        this.f169927g = tVar;
        this.f169928h = dVar2;
        this.f169929i = list;
        this.f169924d = new C75590d((byte) 0);
    }
}
