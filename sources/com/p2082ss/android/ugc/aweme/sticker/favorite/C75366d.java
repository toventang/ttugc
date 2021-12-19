package com.p2082ss.android.ugc.aweme.sticker.favorite;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.EnumC75295a;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75344c;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75498c;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.p2082ss.android.ugc.aweme.sticker.widget.CheckableImageView;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.favorite.d */
public class C75366d extends AbstractC75614b implements AbstractC75498c, AbstractC75576l {

    /* renamed from: a */
    public AbstractC75369e f169407a;

    /* renamed from: b */
    private boolean f169408b;

    /* renamed from: c */
    private Effect f169409c;

    /* renamed from: d */
    private final ActivityC0218d f169410d;

    /* renamed from: e */
    private final AbstractC75361b f169411e;

    /* renamed from: f */
    private final AbstractC75655o f169412f;

    /* renamed from: g */
    private final AbstractC75429h f169413g;

    /* renamed from: h */
    private final StickerPreferences f169414h;

    /* renamed from: i */
    private final AbstractC89172b<Effect, C89391z> f169415i;

    /* renamed from: j */
    private final AbstractC89171a<C75574j> f169416j;

    static {
        Covode.recordClassIndex(88285);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public boolean mo23213a(C75618a aVar) {
        C89219l.m154721d(aVar, "");
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: b */
    public final void mo23177b(AbstractC75576l.EnumC75577a aVar) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    public final void cD_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75498c
    /* renamed from: b */
    public final boolean mo118933b() {
        return this.f169408b;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.favorite.d$a */
    static final class C75367a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C75366d f169417a;

        static {
            Covode.recordClassIndex(88286);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75367a(C75366d dVar) {
            super(0);
            this.f169417a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC75369e eVar = this.f169417a.f169407a;
            if (eVar != null) {
                this.f169417a.mo118932a(eVar, false);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.favorite.d$b */
    static final class C75368b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C75366d f169418a;

        static {
            Covode.recordClassIndex(88287);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75368b(C75366d dVar) {
            super(0);
            this.f169418a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC75369e eVar = this.f169418a.f169407a;
            if (eVar != null) {
                this.f169418a.mo118932a(eVar, false);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23210a() {
        this.f169409c = null;
        AbstractC75369e eVar = this.f169407a;
        if (eVar != null) {
            mo118932a(eVar, false);
            eVar.mo118918a((Effect) null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75498c
    /* renamed from: c */
    public final void mo118934c() {
        AbstractC75369e eVar = this.f169407a;
        if (eVar != null) {
            mo118932a(eVar, true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75498c
    /* renamed from: d */
    public final void mo118935d() {
        AbstractC75369e eVar = this.f169407a;
        if (eVar != null) {
            mo118932a(eVar, false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: a */
    public final void mo23175a(View view) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(view, "");
        ActivityC0218d dVar = this.f169410d;
        AbstractC75655o oVar = this.f169412f;
        AbstractC75429h hVar = this.f169413g;
        AbstractC75361b bVar = this.f169411e;
        View findViewById = view.findViewById(R.id.c6r);
        C89219l.m154716b(findViewById, "");
        View findViewById2 = view.findViewById(R.id.bma);
        C89219l.m154716b(findViewById2, "");
        this.f169407a = new FavoriteSticker(dVar, oVar, hVar, bVar, (FrameLayout) findViewById, (CheckableImageView) findViewById2, this.f169414h, this.f169416j, this.f169415i);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: a */
    public final void mo23176a(AbstractC75576l.EnumC75577a aVar) {
        C89219l.m154721d(aVar, "");
        if (!m132184a(this.f169409c, new C75367a(this)) && aVar == AbstractC75576l.EnumC75577a.AFTER_ANIMATE) {
            if (this.f169409c != null && !this.f169408b && this.f169412f.mo119298j()) {
                mo118934c();
            }
            AbstractC75369e eVar = this.f169407a;
            if (eVar != null) {
                eVar.mo118918a(this.f169409c);
            }
        }
    }

    /* renamed from: a */
    public final void mo118932a(AbstractC75369e eVar, boolean z) {
        this.f169408b = z;
        eVar.mo118919a(z);
    }

    /* renamed from: a */
    private static boolean m132184a(Effect effect, AbstractC89171a<C89391z> aVar) {
        String extra;
        if (effect == null || (extra = effect.getExtra()) == null || extra.length() <= 0 || !new JSONObject(extra).optBoolean("forbid_favorite")) {
            return false;
        }
        aVar.invoke();
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23212a(C75619b bVar, C75618a aVar) {
        AbstractC75369e eVar;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        if (!C75344c.m132147a(this.f169412f, aVar.f170022a)) {
            Effect effect = aVar.f170022a;
            this.f169409c = effect;
            if (!m132184a(effect, new C75368b(this))) {
                if (aVar.f170024c == EnumC75295a.UI_CLICK) {
                    this.f169412f.mo119287a(true);
                }
                if (this.f169412f.mo119298j() && (eVar = this.f169407a) != null) {
                    mo118932a(eVar, true);
                    eVar.mo118918a(aVar.f170022a);
                }
            }
        }
    }

    public /* synthetic */ C75366d(ActivityC0218d dVar, AbstractC75361b bVar, AbstractC75655o oVar, AbstractC75429h hVar, StickerPreferences stickerPreferences, AbstractC89171a aVar) {
        this(dVar, bVar, oVar, hVar, stickerPreferences, null, aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super com.ss.android.ugc.effectmanager.effect.model.Effect, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C75366d(ActivityC0218d dVar, AbstractC75361b bVar, AbstractC75655o oVar, AbstractC75429h hVar, StickerPreferences stickerPreferences, AbstractC89172b<? super Effect, C89391z> bVar2, AbstractC89171a<C75574j> aVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(stickerPreferences, "");
        C89219l.m154721d(aVar, "");
        this.f169410d = dVar;
        this.f169411e = bVar;
        this.f169412f = oVar;
        this.f169413g = hVar;
        this.f169414h = stickerPreferences;
        this.f169415i = bVar2;
        this.f169416j = aVar;
    }
}
