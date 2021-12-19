package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.effect.C46358h;
import com.p2082ss.android.ugc.aweme.effect.C46392y;
import com.p2082ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.b */
public final class C52112b extends AbstractC23520b<FTCEditEffectViewModel> implements AbstractC21566a {

    /* renamed from: a */
    final AbstractC22186b f120036a;

    /* renamed from: b */
    public final int f120037b = R.id.c7m;

    /* renamed from: c */
    private final AbstractC89244h f120038c = C89250i.m154773a((AbstractC89171a) new C52113a(this));

    /* renamed from: d */
    private final AbstractC89171a<FTCEditEffectViewModel> f120039d = C52114b.f120042a;

    /* renamed from: e */
    private final C21582f f120040e;

    static {
        Covode.recordClassIndex(61493);
    }

    /* renamed from: a */
    private final C52115c m96861a() {
        return (C52115c) this.f120038c.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<FTCEditEffectViewModel> mo23031b() {
        return this.f120039d;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f120036a;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f120040e;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.b$b */
    static final class C52114b extends AbstractC89220m implements AbstractC89171a<FTCEditEffectViewModel> {

        /* renamed from: a */
        public static final C52114b f120042a = new C52114b();

        static {
            Covode.recordClassIndex(61495);
        }

        C52114b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FTCEditEffectViewModel invoke() {
            return new FTCEditEffectViewModel();
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: d */
    public final void mo23033d() {
        m96861a().mo87838a().f120084W.mo78626c().setValue(false);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        C52125f a = m96861a().mo87838a();
        a.f120084W.mo78626c().setValue(true);
        if (a.f120092b.isMultiVideoEdit() && (a.f120071J.f120054a instanceof C46392y)) {
            a.mo87856d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.b$a */
    static final class C52113a extends AbstractC89220m implements AbstractC89171a<C52115c> {

        /* renamed from: a */
        final /* synthetic */ C52112b f120041a;

        static {
            Covode.recordClassIndex(61494);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52113a(C52112b bVar) {
            super(0);
            this.f120041a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C52115c invoke() {
            C52115c cVar = new C52115c();
            Activity activity = this.f120041a.f120036a.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C46358h hVar = new C46358h((ActivityC0945e) activity);
            C89219l.m154721d(hVar, "");
            C52125f a = cVar.mo87838a();
            a.f120085X = hVar;
            a.f120084W = (EditEffectVideoModel) C1181ae.m3881a(hVar.mo78849a(), (C1175ad.AbstractC1177b) null).mo3983a(EditEffectVideoModel.class);
            a.f120084W.mo78624a(a.f120085X);
            this.f120041a.f120036a.mo36387a(this.f120041a.f120037b, cVar, "FTCEditEffectScene");
            return cVar;
        }
    }

    public C52112b(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f120040e = fVar;
        this.f120036a = bVar;
    }
}
