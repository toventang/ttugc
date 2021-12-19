package com.p2082ss.android.ugc.aweme.sticker.types.p3999a;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75517h;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.EnumC75518i;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3979b.AbstractC75616b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.a.e */
public final class C75911e implements AbstractC75517h {

    /* renamed from: a */
    private C75908d f170500a;

    /* renamed from: b */
    private C75905a f170501b;

    /* renamed from: c */
    private final AbstractC75616b f170502c;

    /* renamed from: d */
    private final String f170503d;

    static {
        Covode.recordClassIndex(88851);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75517h
    /* renamed from: a */
    public final EnumC75518i mo119168a() {
        return EnumC75518i.CommerceStickerInfoHandlerPriority;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75517h
    /* renamed from: b */
    public final void mo119171b() {
        C75905a aVar = this.f170501b;
        if (aVar != null) {
            aVar.mo119567a((Effect) null, 0);
        }
        C75908d dVar = this.f170500a;
        if (dVar != null) {
            dVar.mo119569a(null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75517h
    /* renamed from: a */
    public final boolean mo119170a(C75618a aVar) {
        C89219l.m154721d(aVar, "");
        Effect effect = aVar.f170022a;
        int i = aVar.f170023b;
        C75908d dVar = this.f170500a;
        if (dVar != null && dVar.mo119569a(effect)) {
            return true;
        }
        C75905a aVar2 = this.f170501b;
        if (aVar2 != null) {
            return aVar2.mo119567a(effect, i);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75517h
    /* renamed from: a */
    public final void mo119169a(View view) {
        C89219l.m154721d(view, "");
        this.f170501b = new C75905a((LinearLayout) view.findViewById(R.id.aaw), this.f170502c, view.getContext());
        View findViewById = view.findViewById(R.id.aay);
        C89219l.m154716b(findViewById, "");
        this.f170500a = new C75908d((LinearLayout) findViewById, this.f170502c, this.f170503d);
    }

    public C75911e(AbstractC75616b bVar, String str) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        this.f170502c = bVar;
        this.f170503d = str;
    }
}
