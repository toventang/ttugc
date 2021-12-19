package com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.p3962j.C75392a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85040c;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.a.a */
public class C75480a extends C75490g {

    /* renamed from: e */
    private final AbstractC76151g f169613e;

    static {
        Covode.recordClassIndex(88402);
    }

    /* renamed from: a */
    private final void m132406a(Effect effect) {
        String str = (String) C89070n.m154583g((List) effect.getIconUrl().getUrlList());
        if (str != null) {
            C85040c.m146217a(this.f169631b, str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.C75490g
    public void onClick(View view) {
        int adapterPosition;
        C89219l.m154721d(view, "");
        DATA data = this.f171207f;
        if (data != null && -1 != (adapterPosition = getAdapterPosition())) {
            this.f169633d.mo120098b(mo119165b(data, adapterPosition));
            String id = data.getId();
            int hashCode = hashCode();
            C89219l.m154721d(id, "");
            if (C75392a.f169467b.containsKey(Integer.valueOf(hashCode))) {
                String id2 = data.getId();
                C89219l.m154721d(id2, "");
                C75392a.f169466a.storeBoolean(id2, true);
                String id3 = data.getId();
                int hashCode2 = hashCode();
                C89219l.m154721d(id3, "");
                C75392a.f169467b.remove(Integer.valueOf(hashCode2));
                m132406a((Effect) data);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.AbstractView$OnClickListenerC75488e
    /* renamed from: a */
    public final void mo119153a(Effect effect, EnumC84444c cVar, Integer num) {
        String str;
        C89219l.m154721d(effect, "");
        C89219l.m154721d(cVar, "");
        super.mo119153a(effect, cVar, num);
        C89219l.m154721d(effect, "");
        String b = C72847c.m128630b(effect.getExtra(), "dynamic_icon");
        if (!(b == null || b.length() == 0)) {
            if (!C75392a.f169466a.getBoolean(effect.getId(), false) && !effect.getFileUrl().getUrlList().isEmpty()) {
                String b2 = C89361p.m154912b(effect.getFileUrl().getUrlList().get(0), '/', "");
                if (b2.length() == 0) {
                    str = "";
                } else {
                    str = b2 + '/' + b;
                }
                if (!(str == null || str.length() == 0)) {
                    C85037b bVar = this.f169631b;
                    C89219l.m154721d(bVar, "");
                    C89219l.m154721d(str, "");
                    C84402a.m145184b(bVar.getImageView(), str);
                    String id = effect.getId();
                    int hashCode = hashCode();
                    C89219l.m154721d(id, "");
                    C75392a.f169467b.put(Integer.valueOf(hashCode), id);
                    return;
                }
            }
        }
        m132406a(effect);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75480a(View view, C85037b bVar, AbstractC75655o oVar, AbstractC76151g gVar, AbstractC76397b<Effect> bVar2) {
        super(view, bVar, oVar, gVar, bVar2);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(bVar2, "");
        this.f169613e = gVar;
    }
}
