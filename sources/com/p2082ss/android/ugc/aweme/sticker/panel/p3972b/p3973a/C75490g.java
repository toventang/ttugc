package com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3971a.AbstractC75473a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.C76401f;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85040c;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.a.g */
public class C75490g extends AbstractView$OnClickListenerC75488e implements AbstractC75374c.AbstractC75376b {

    /* renamed from: e */
    private final AbstractC76151g f169635e;

    static {
        Covode.recordClassIndex(88412);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.a.g$a */
    public static final class RunnableC75491a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C75490g f169636a;

        static {
            Covode.recordClassIndex(88413);
        }

        RunnableC75491a(C75490g gVar) {
            this.f169636a = gVar;
        }

        public final void run() {
            View view = this.f169636a.itemView;
            C89219l.m154716b(view, "");
            if (view.getParent() != null) {
                this.f169636a.itemView.performClick();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75376b
    /* renamed from: a */
    public final void mo118622a() {
        C85037b bVar = this.f169631b;
        if (bVar.f190298e.hasStarted()) {
            ImageView imageView = bVar.f190297d;
            if (imageView == null) {
                C89219l.m154710a("downloadImg");
            }
            imageView.setImageResource(bVar.f190299f);
            ImageView imageView2 = bVar.f190297d;
            if (imageView2 == null) {
                C89219l.m154710a("downloadImg");
            }
            imageView2.setVisibility(4);
            ImageView imageView3 = bVar.f190297d;
            if (imageView3 == null) {
                C89219l.m154710a("downloadImg");
            }
            imageView3.clearAnimation();
        }
    }

    public void onClick(View view) {
        int adapterPosition;
        C89219l.m154721d(view, "");
        DATA data = this.f171207f;
        if (data != null && -1 != (adapterPosition = getAdapterPosition())) {
            this.f169633d.mo120098b(mo119165b(data, adapterPosition));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C76401f<Effect> mo119165b(Effect effect, int i) {
        C89219l.m154721d(effect, "");
        return new C76401f<>(effect, i, this.f171209h, false, false, true, null, this, null, 856);
    }

    /* renamed from: a */
    public void mo119155a(Effect effect, int i) {
        List<String> urlList;
        String str;
        C89219l.m154721d(effect, "");
        String name = effect.getName();
        if (name != null) {
            this.f169631b.setText(name);
        }
        UrlModel iconUrl = effect.getIconUrl();
        if (!(iconUrl == null || (urlList = iconUrl.getUrlList()) == null || (str = (String) C89070n.m154583g((List) urlList)) == null)) {
            C85040c.m146217a(this.f169631b, str);
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        view.setContentDescription(effect.getName());
        int i2 = this.f171209h;
        AbstractC75473a aVar = this.f169630a;
        if (aVar != null && aVar.mo119149a(effect, i2, i)) {
            if (!C75466g.m132345a(effect) || i != 1 || !this.f169632c.mo119288a()) {
                this.itemView.post(new RunnableC75491a(this));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75490g(View view, C85037b bVar, AbstractC75655o oVar, AbstractC76151g gVar, AbstractC76397b<Effect> bVar2) {
        super(view, bVar, oVar, bVar2);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(bVar2, "");
        this.f169635e = gVar;
    }
}
