package com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4312a;

import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71922a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84011c;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84012d;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4312a.C83976c;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.d */
public final class C83984d implements AbstractC21566a, AbstractC84012d {

    /* renamed from: a */
    private final C21582f f187479a;

    /* renamed from: b */
    private final C71922a f187480b;

    /* renamed from: c */
    private final AbstractC89171a<C83976c.C83977a> f187481c;

    static {
        Covode.recordClassIndex(97877);
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f187479a;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84012d
    /* renamed from: a */
    public final AbstractC84011c mo128840a(AbstractC84089j jVar) {
        C89219l.m154721d(jVar, "");
        return new C83976c(this.f187481c, (ActivityC0218d) getDiContainer().mo35248a(ActivityC0218d.class, (String) null), jVar, (ShortVideoContext) getDiContainer().mo35248a(ShortVideoContext.class, (String) null), this.f187480b);
    }

    public C83984d(C21582f fVar, C71922a aVar, AbstractC89171a<C83976c.C83977a> aVar2) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f187479a = fVar;
        this.f187480b = aVar;
        this.f187481c = aVar2;
    }
}
