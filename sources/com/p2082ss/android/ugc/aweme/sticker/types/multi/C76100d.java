package com.p2082ss.android.ugc.aweme.sticker.types.multi;

import android.view.View;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75575k;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.types.multi.p4012a.C76092a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.multi.d */
public final class C76100d implements AbstractC76091a {

    /* renamed from: a */
    C76092a f170984a;

    /* renamed from: b */
    ActivityC0945e f170985b;

    /* renamed from: c */
    List<Effect> f170986c;

    /* renamed from: d */
    private RecyclerView f170987d;

    /* renamed from: e */
    private AbstractC76105i f170988e;

    /* renamed from: f */
    private LinearLayoutManager f170989f;

    static {
        Covode.recordClassIndex(89047);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.multi.AbstractC76091a
    /* renamed from: c */
    public final void mo119770c() {
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.multi.AbstractC76091a
    /* renamed from: a */
    public final void mo119768a() {
        this.f170987d.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.multi.AbstractC76091a
    /* renamed from: b */
    public final void mo119769b() {
        this.f170987d.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo119831a(AbstractC75429h hVar) {
        this.f170984a.f170961b = hVar;
    }

    /* renamed from: a */
    public final void mo119832a(List<Effect> list) {
        this.f170986c = list;
        C76092a aVar = this.f170984a;
        aVar.f170960a = list;
        aVar.notifyDataSetChanged();
        aVar.f170963d = false;
    }

    /* renamed from: a */
    public final void mo119830a(int i) {
        this.f170984a.f170962c = i;
        int k = this.f170989f.mo4371k();
        int m = this.f170989f.mo4373m();
        if (i <= k || i > m) {
            this.f170987d.mo4413b(i);
            return;
        }
        this.f170987d.scrollBy(0, this.f170987d.getChildAt(i - k).getTop());
    }

    public C76100d(ActivityC0945e eVar, View view, AbstractC75655o oVar, AbstractC76151g gVar, AbstractC76397b<Effect> bVar, C75575k kVar, AbstractC76105i iVar) {
        this.f170985b = eVar;
        this.f170987d = (RecyclerView) ((ViewStubCompat) view.findViewById(R.id.e_x)).mo1691a();
        this.f170988e = iVar;
        this.f170984a = new C76092a(oVar, gVar, bVar, kVar);
        oVar.mo119302n().mo119328e().observe(this.f170985b, new C76101e(this));
        bVar.mo120099k().observe(this.f170985b, new C76102f(this, bVar));
        bVar.mo120102n().observe(this.f170985b, new C76103g(this));
        this.f170987d.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f170989f = linearLayoutManager;
        this.f170987d.setLayoutManager(linearLayoutManager);
        this.f170987d.setAdapter(this.f170984a);
    }
}
