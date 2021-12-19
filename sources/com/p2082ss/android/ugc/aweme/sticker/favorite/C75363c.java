package com.p2082ss.android.ugc.aweme.sticker.favorite;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.bpea.basics.C13349j;
import com.bytedance.bpea.basics.C13350k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.p878a.C13401b;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.p2306ah.C33458f;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.lang.reflect.Type;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.favorite.c */
public final class C75363c implements AbstractC21566a, AbstractC75361b {

    /* renamed from: b */
    private final AbstractC89244h f169402b = C89250i.m154773a((AbstractC89171a) new C75364a(this));

    /* renamed from: c */
    private final C21582f f169403c;

    static {
        Covode.recordClassIndex(88282);
    }

    /* renamed from: c */
    public final AbstractC14177d mo118931c() {
        return (AbstractC14177d) this.f169402b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.favorite.AbstractC75361b
    /* renamed from: a */
    public final Bundle mo118927a() {
        return C33458f.f79510b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f169403c;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.favorite.c$a */
    static final class C75364a extends AbstractC89220m implements AbstractC89171a<AbstractC14177d> {

        /* renamed from: a */
        final /* synthetic */ C75363c f169404a;

        static {
            Covode.recordClassIndex(88283);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75364a(C75363c cVar) {
            super(0);
            this.f169404a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC14177d invoke() {
            return this.f169404a.getDiContainer().mo35249a((Type) AbstractC14177d.class, (String) null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.favorite.AbstractC75361b
    /* renamed from: b */
    public final boolean mo118930b() {
        return C63244g.m114602a().mo73255A().mo93903b();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.favorite.c$b */
    public static final class C75365b implements AbstractC63269z.AbstractC63270a {

        /* renamed from: a */
        final /* synthetic */ C75363c f169405a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f169406b;

        static {
            Covode.recordClassIndex(88284);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z.AbstractC63270a
        /* renamed from: a */
        public final void mo59543a() {
            this.f169406b.invoke();
            AbstractC14177d c = this.f169405a.mo118931c();
            if (c != null) {
                c.mo22740a(false, new PrivacyCert(new C13349j("1006"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z.AbstractC63270a
        /* renamed from: b */
        public final void mo59544b() {
            AbstractC14177d c = this.f169405a.mo118931c();
            if (c != null) {
                c.mo22740a(false, new PrivacyCert(new C13349j("1007"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
            }
        }

        C75365b(C75363c cVar, AbstractC89171a aVar) {
            this.f169405a = cVar;
            this.f169406b = aVar;
        }
    }

    public C75363c(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f169403c = fVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.favorite.AbstractC75361b
    /* renamed from: a */
    public final void mo118929a(Effect effect) {
        C89219l.m154721d(effect, "");
        C63244g.m114602a().mo73258D().mo101689b(effect.getId());
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.favorite.AbstractC75361b
    /* renamed from: a */
    public final void mo118928a(Activity activity, String str, int i, Bundle bundle, AbstractC89171a<C89391z> aVar) {
        String str2;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        if (i == 241) {
            str2 = "click_my_prop";
        } else if (i == 242) {
            str2 = "click_favorite_prop";
        } else {
            throw new IllegalStateException("not support favorite login method".toString());
        }
        AbstractC14177d c = mo118931c();
        if (c != null) {
            c.mo22742b(false, new PrivacyCert(new C13349j("1027"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
        }
        C63244g.m114602a().mo73255A().mo93897a(activity, str, str2, bundle, new C75365b(this, aVar));
    }
}
