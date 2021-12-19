package com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.View$OnTouchListenerC75885t;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75344c;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3971a.AbstractC75473a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.C76210a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85040c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.a.e */
public abstract class AbstractView$OnClickListenerC75488e extends C76210a<Effect> implements View.OnClickListener {

    /* renamed from: a */
    public AbstractC75473a f169630a;

    /* renamed from: b */
    public final C85037b f169631b;

    /* renamed from: c */
    public final AbstractC75655o f169632c;

    /* renamed from: d */
    public AbstractC76397b<Effect> f169633d;

    static {
        Covode.recordClassIndex(88410);
    }

    /* renamed from: a */
    public final void mo119161a(AbstractC76397b<Effect> bVar) {
        C89219l.m154721d(bVar, "");
        this.f169633d = bVar;
    }

    /* renamed from: b */
    public void mo119163b(boolean z) {
        this.f169631b.setCustomSelected(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.C76210a
    /* renamed from: a */
    public final void mo119158a(boolean z) {
        if (z) {
            this.itemView.setOnTouchListener(new View$OnTouchListenerC75885t(1.1f, 100, this.f169631b));
        } else {
            this.itemView.setOnTouchListener(null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo119162a(EnumC84444c cVar, Integer num) {
        C89219l.m154721d(cVar, "");
        int i = C75489f.f169634a[cVar.ordinal()];
        if (i == 1 || i == 2) {
            this.f169631b.mo129978d();
        } else if (i == 3 || i == 4) {
            this.f169631b.mo129976b();
        } else if (i == 5) {
            if (num == null) {
                this.f169631b.mo129977c();
            } else {
                this.f169631b.mo129974a(num.intValue());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo119153a(Effect effect, EnumC84444c cVar, Integer num) {
        String str;
        C89219l.m154721d(effect, "");
        C89219l.m154721d(cVar, "");
        String effectId = effect.getEffectId();
        DATA data = this.f171207f;
        if (data != null) {
            str = data.getEffectId();
        } else {
            str = null;
        }
        if (!(!C89219l.m154714a((Object) effectId, (Object) str))) {
            mo119162a(cVar, num);
            if (!C75344c.m132149b(this.f169632c, effect) || C75466g.m132368t(effect)) {
                C85040c.m146218a(this.f169631b, false);
            } else {
                C85040c.m146218a(this.f169631b, true);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractView$OnClickListenerC75488e(View view, C85037b bVar, AbstractC75655o oVar, AbstractC76397b<Effect> bVar2) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(bVar2, "");
        this.f169631b = bVar;
        this.f169632c = oVar;
        this.f169633d = bVar2;
        view.setOnClickListener(this);
        bVar.setShowDownloadIcon(true);
    }
}
