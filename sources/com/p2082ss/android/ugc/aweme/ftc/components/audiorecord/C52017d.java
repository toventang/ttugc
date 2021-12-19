package com.p2082ss.android.ugc.aweme.ftc.components.audiorecord;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.d */
public final class C52017d extends AbstractC23520b<FTCEditAudioRecordViewModel> implements AbstractC21566a {

    /* renamed from: a */
    final AbstractC22186b f119837a;

    /* renamed from: b */
    public final int f119838b = R.id.c7m;

    /* renamed from: c */
    private final AbstractC89244h f119839c = C89250i.m154773a((AbstractC89171a) new C52018a(this));

    /* renamed from: d */
    private final AbstractC89171a<FTCEditAudioRecordViewModel> f119840d = C52019b.f119843a;

    /* renamed from: e */
    private final C21582f f119841e;

    static {
        Covode.recordClassIndex(61392);
    }

    /* renamed from: a */
    private final C52020e m96761a() {
        return (C52020e) this.f119839c.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<FTCEditAudioRecordViewModel> mo23031b() {
        return this.f119840d;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f119837a;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f119841e;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.d$b */
    static final class C52019b extends AbstractC89220m implements AbstractC89171a<FTCEditAudioRecordViewModel> {

        /* renamed from: a */
        public static final C52019b f119843a = new C52019b();

        static {
            Covode.recordClassIndex(61394);
        }

        C52019b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FTCEditAudioRecordViewModel invoke() {
            return new FTCEditAudioRecordViewModel();
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        m96761a().mo87760a(true);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: d */
    public final void mo23033d() {
        m96761a().mo87760a(false);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.d$a */
    static final class C52018a extends AbstractC89220m implements AbstractC89171a<C52020e> {

        /* renamed from: a */
        final /* synthetic */ C52017d f119842a;

        static {
            Covode.recordClassIndex(61393);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52018a(C52017d dVar) {
            super(0);
            this.f119842a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C52020e invoke() {
            C52020e eVar = new C52020e(this.f119842a.getDiContainer());
            this.f119842a.f119837a.mo36387a(this.f119842a.f119838b, eVar, "FTCEditAudioRecordScene");
            return eVar;
        }
    }

    public C52017d(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f119841e = fVar;
        this.f119837a = bVar;
    }
}
