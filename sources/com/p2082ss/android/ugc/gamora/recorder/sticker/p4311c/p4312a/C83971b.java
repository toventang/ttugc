package com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4312a;

import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.GameStickerHandler;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.LegacyGameStickerHandler;
import com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76080m;
import com.p2082ss.android.ugc.aweme.sticker.types.game.C76060a;
import com.p2082ss.android.ugc.aweme.sticker.types.game.p4011a.AbstractC76065a;
import com.p2082ss.android.ugc.aweme.utils.C80245bi;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4309a.AbstractC83955b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.b */
public final class C83971b implements AbstractC21566a, AbstractC83955b {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f187443a = {new C89232y(C83971b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0)};

    /* renamed from: b */
    public final ActivityC0218d f187444b = ((ActivityC0218d) getDiContainer().mo35248a(ActivityC0218d.class, (String) null));

    /* renamed from: c */
    public final AbstractC14177d f187445c = ((AbstractC14177d) getDiContainer().mo35248a(AbstractC14177d.class, (String) null));

    /* renamed from: d */
    private final AbstractC89248d f187446d = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);

    /* renamed from: e */
    private final C21582f f187447e;

    static {
        Covode.recordClassIndex(97864);
    }

    /* renamed from: a */
    public final AbstractC14193m mo128848a() {
        return (AbstractC14193m) this.f187446d.mo23374a(this, f187443a[0]);
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f187447e;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.b$b */
    static final class C83973b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14330a f187451a;

        static {
            Covode.recordClassIndex(97866);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83973b(AbstractC14330a aVar) {
            super(0);
            this.f187451a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f187451a.mo23120b(false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.b$d */
    static final class C83975d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14330a f187455a;

        static {
            Covode.recordClassIndex(97868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83975d(AbstractC14330a aVar) {
            super(0);
            this.f187455a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f187455a.mo23120b(false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.b$a */
    static final class C83972a extends AbstractC89220m implements AbstractC89171a<AbstractC76080m> {

        /* renamed from: a */
        final /* synthetic */ C83971b f187448a;

        /* renamed from: b */
        final /* synthetic */ AbstractC14330a f187449b;

        /* renamed from: c */
        final /* synthetic */ AbstractC76065a f187450c;

        static {
            Covode.recordClassIndex(97865);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83972a(C83971b bVar, AbstractC14330a aVar, AbstractC76065a aVar2) {
            super(0);
            this.f187448a = bVar;
            this.f187449b = aVar;
            this.f187450c = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC76080m invoke() {
            ActivityC0218d dVar = this.f187448a.f187444b;
            AbstractC84919c a = C80245bi.m139086a(this.f187448a.f187444b);
            if (a != null) {
                return C76060a.m133347a(dVar, a, this.f187448a.f187445c, this.f187448a.mo128848a(), this.f187449b, (FrameLayout) this.f187448a.f187444b.findViewById(R.id.c48), this.f187450c);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.b$c */
    static final class C83974c extends AbstractC89220m implements AbstractC89171a<AbstractC76080m> {

        /* renamed from: a */
        final /* synthetic */ C83971b f187452a;

        /* renamed from: b */
        final /* synthetic */ AbstractC14330a f187453b;

        /* renamed from: c */
        final /* synthetic */ AbstractC76065a f187454c;

        static {
            Covode.recordClassIndex(97867);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83974c(C83971b bVar, AbstractC14330a aVar, AbstractC76065a aVar2) {
            super(0);
            this.f187452a = bVar;
            this.f187453b = aVar;
            this.f187454c = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC76080m invoke() {
            ActivityC0218d dVar = this.f187452a.f187444b;
            AbstractC84919c a = C80245bi.m139086a(this.f187452a.f187444b);
            if (a != null) {
                return C76060a.m133347a(dVar, a, this.f187452a.f187445c, this.f187452a.mo128848a(), this.f187453b, (FrameLayout) this.f187452a.f187444b.findViewById(R.id.c48), this.f187454c);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C83971b(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f187447e = fVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4309a.AbstractC83955b
    /* renamed from: a */
    public final LegacyGameStickerHandler mo128836a(AbstractC14330a aVar, AbstractC76065a aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        return new LegacyGameStickerHandler(this.f187444b, C89250i.m154773a((AbstractC89171a) new C83974c(this, aVar, aVar2)), new C83975d(aVar));
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4309a.AbstractC83955b
    /* renamed from: b */
    public final GameStickerHandler mo128837b(AbstractC14330a aVar, AbstractC76065a aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        return new GameStickerHandler(this.f187444b, C89250i.m154773a((AbstractC89171a) new C83972a(this, aVar, aVar2)), new C83973b(aVar));
    }
}
