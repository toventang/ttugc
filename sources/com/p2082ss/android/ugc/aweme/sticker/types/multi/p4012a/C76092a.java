package com.p2082ss.android.ugc.aweme.sticker.types.multi.p4012a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75575k;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3971a.AbstractC75473a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.C76210a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b;
import com.p2082ss.android.ugc.aweme.sticker.widget.C76412b;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.multi.a.a */
public final class C76092a extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> implements AbstractC75473a {

    /* renamed from: a */
    public List<Effect> f170960a = new ArrayList();

    /* renamed from: b */
    public AbstractC75429h f170961b;

    /* renamed from: c */
    public int f170962c;

    /* renamed from: d */
    public boolean f170963d;

    /* renamed from: e */
    protected final AbstractC76151g f170964e;

    /* renamed from: f */
    protected final AbstractC75655o f170965f;

    /* renamed from: g */
    protected final AbstractC76397b<Effect> f170966g;

    /* renamed from: h */
    protected final C75575k f170967h;

    /* renamed from: i */
    private String f170968i;

    static {
        Covode.recordClassIndex(89039);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m133440a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        List<Effect> list = this.f170960a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Effect effect;
        if (i < 0 || i >= getItemCount()) {
            effect = null;
        } else {
            effect = this.f170960a.get(i);
        }
        C89378p<EnumC84444c, Integer> a = this.f170966g.mo120095a(effect);
        ((C76210a) viewHolder).mo119946a(effect, a.getFirst(), a.getSecond(), i, -1);
        AbstractC75429h hVar = this.f170961b;
        if (hVar != null && effect != null) {
            hVar.mo118952a(effect, this.f170968i, "click_main_panel", i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3971a.AbstractC75473a
    /* renamed from: a */
    public final boolean mo119149a(Effect effect, int i, int i2) {
        int i3 = this.f170962c;
        boolean z = false;
        if (i3 < 0 || !C75466g.m132349b(this.f170960a.get(i3))) {
            if (this.f170962c == i2) {
                z = true;
            }
            if (!this.f170963d && z) {
                this.f170963d = true;
            }
            return z;
        }
        boolean z2 = !C75466g.m132349b(this.f170960a.get(i2));
        if (this.f170963d || !z2) {
            return false;
        }
        this.f170963d = true;
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<com.ss.android.ugc.effectmanager.effect.model.Effect> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        Object g = C89070n.m154583g((List) list);
        if (g instanceof Effect) {
            C89378p<EnumC84444c, Integer> a = this.f170966g.mo120095a((Effect) g);
            ((C76210a) viewHolder).mo119947b(g, a.getFirst(), a.getSecond());
            return;
        }
        super.onBindViewHolder(viewHolder, i, list);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m133440a(C76092a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(6408);
        C75575k kVar = aVar.f170967h;
        Context context = viewGroup.getContext();
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(context, "");
        C89378p a2 = C76412b.m133925a(kVar, context, 54.0f, 54.0f, -2.0f, -2.0f, -2.0f, 58.0f, null, null, 384);
        C76093b bVar = new C76093b((View) a2.getFirst(), (C85037b) a2.getSecond(), aVar.f170965f, aVar.f170964e, aVar.f170966g);
        bVar.f169630a = aVar;
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = bVar.getClass().getName();
        MethodCollector.m26664o(6408);
        return bVar;
    }

    public C76092a(AbstractC75655o oVar, AbstractC76151g gVar, AbstractC76397b<Effect> bVar, C75575k kVar) {
        this.f170965f = oVar;
        this.f170966g = bVar;
        this.f170964e = gVar;
        this.f170967h = kVar;
    }
}
