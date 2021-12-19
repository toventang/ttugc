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
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4309a.AbstractC83955b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.f */
public final class C83986f implements AbstractC21566a, AbstractC83955b {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f187487a = {new C89232y(C83986f.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C83986f.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0)};

    /* renamed from: b */
    public final ActivityC0218d f187488b = ((ActivityC0218d) getDiContainer().mo35248a(ActivityC0218d.class, (String) null));

    /* renamed from: c */
    private final AbstractC89248d f187489c = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);

    /* renamed from: d */
    private final AbstractC89248d f187490d = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);

    /* renamed from: e */
    private final C21582f f187491e;

    static {
        Covode.recordClassIndex(97879);
    }

    /* renamed from: a */
    public final AbstractC14177d mo128857a() {
        return (AbstractC14177d) this.f187489c.mo23374a(this, f187487a[0]);
    }

    /* renamed from: b */
    public final AbstractC14193m mo128858b() {
        return (AbstractC14193m) this.f187490d.mo23374a(this, f187487a[1]);
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f187491e;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.f$a */
    static final class C83987a extends AbstractC89220m implements AbstractC89171a<AbstractC76080m> {

        /* renamed from: a */
        final /* synthetic */ C83986f f187492a;

        /* renamed from: b */
        final /* synthetic */ AbstractC14330a f187493b;

        /* renamed from: c */
        final /* synthetic */ AbstractC76065a f187494c;

        static {
            Covode.recordClassIndex(97880);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83987a(C83986f fVar, AbstractC14330a aVar, AbstractC76065a aVar2) {
            super(0);
            this.f187492a = fVar;
            this.f187493b = aVar;
            this.f187494c = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC76080m invoke() {
            return C76060a.m133347a(this.f187492a.f187488b, (AbstractC84919c) this.f187492a.getDiContainer().mo35249a((Type) AbstractC84919c.class, (String) null), this.f187492a.mo128857a(), this.f187492a.mo128858b(), this.f187493b, (FrameLayout) this.f187492a.f187488b.findViewById(R.id.c48), this.f187494c);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.f$b */
    static final class C83988b extends AbstractC89220m implements AbstractC89171a<AbstractC76080m> {

        /* renamed from: a */
        final /* synthetic */ C83986f f187495a;

        /* renamed from: b */
        final /* synthetic */ AbstractC14330a f187496b;

        /* renamed from: c */
        final /* synthetic */ AbstractC76065a f187497c;

        static {
            Covode.recordClassIndex(97881);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83988b(C83986f fVar, AbstractC14330a aVar, AbstractC76065a aVar2) {
            super(0);
            this.f187495a = fVar;
            this.f187496b = aVar;
            this.f187497c = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC76080m invoke() {
            return C76060a.m133347a(this.f187495a.f187488b, (AbstractC84919c) this.f187495a.getDiContainer().mo35249a((Type) AbstractC84919c.class, (String) null), this.f187495a.mo128857a(), this.f187495a.mo128858b(), this.f187496b, (FrameLayout) this.f187495a.f187488b.findViewById(R.id.c48), this.f187497c);
        }
    }

    public C83986f(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f187491e = fVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4309a.AbstractC83955b
    /* renamed from: a */
    public final LegacyGameStickerHandler mo128836a(AbstractC14330a aVar, AbstractC76065a aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        return new LegacyGameStickerHandler(this.f187488b, C89250i.m154773a((AbstractC89171a) new C83988b(this, aVar, aVar2)));
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4309a.AbstractC83955b
    /* renamed from: b */
    public final GameStickerHandler mo128837b(AbstractC14330a aVar, AbstractC76065a aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        return new GameStickerHandler(this.f187488b, C89250i.m154773a((AbstractC89171a) new C83987a(this, aVar, aVar2)));
    }
}
