package com.p2082ss.android.ugc.aweme.sticker.p3981q;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.aweme.sticker.p3981q.p3982a.C75662a;
import com.p2082ss.android.ugc.aweme.sticker.senor.AbstractC75866a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.AbstractC75912a;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.q.a */
public final class C75660a implements AbstractC75912a {

    /* renamed from: a */
    public final AbstractC31193a f170074a;

    /* renamed from: b */
    public final AbstractC31185d f170075b;

    /* renamed from: c */
    private final HashMap<Object, Object> f170076c = new HashMap<>();

    /* renamed from: d */
    private final AbstractC89244h f170077d = C89250i.m154773a((AbstractC89171a) new C75661a(this));

    static {
        Covode.recordClassIndex(88591);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.AbstractC75912a
    /* renamed from: a */
    public final AbstractC75866a mo119386a() {
        return (AbstractC75866a) this.f170077d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.AbstractC75912a
    /* renamed from: b */
    public final int mo119388b() {
        return this.f170074a.mo56754a((Bitmap) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.q.a$a */
    static final class C75661a extends AbstractC89220m implements AbstractC89171a<C75662a> {

        /* renamed from: a */
        final /* synthetic */ C75660a f170078a;

        static {
            Covode.recordClassIndex(88592);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75661a(C75660a aVar) {
            super(0);
            this.f170078a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75662a invoke() {
            return new C75662a(this.f170078a.f170074a, this.f170078a.f170075b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.AbstractC75912a
    /* renamed from: a */
    public final void mo119387a(boolean z) {
        this.f170074a.mo56812d(z);
    }

    public C75660a(AbstractC31193a aVar, AbstractC31185d dVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dVar, "");
        this.f170074a = aVar;
        this.f170075b = dVar;
    }
}
