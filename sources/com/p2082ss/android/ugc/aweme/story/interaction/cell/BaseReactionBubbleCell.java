package com.p2082ss.android.ugc.aweme.story.interaction.cell;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77299e;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77302g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.BaseReactionBubbleCell */
public abstract class BaseReactionBubbleCell<T extends C77299e> extends PowerCell<T> {
    static {
        Covode.recordClassIndex(90341);
    }

    /* renamed from: a */
    public static C20745e m135213a() {
        C20745e.C20746a aVar = new C20745e.C20746a();
        aVar.f48957a = true;
        C20745e a = aVar.mo34169a();
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public final void mo120914a(User user, C77302g gVar) {
        C89219l.m154721d(user, "");
        if (gVar != null) {
            C59252q f = new C59252q().mo96749g(gVar.f173419a);
            String str = gVar.f173420b;
            if (str == null) {
                str = "";
            }
            C59252q qVar = (C59252q) f.mo96825o(str).mo96741a("click_head");
            qVar.f135285Y = "story_detail";
            qVar.f135286Z = "bullet";
            qVar.f135222V = gVar.f173422d;
            qVar.f135223W = gVar.f173423e;
            qVar.mo96752b_(gVar.f173424f).mo96792f();
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/" + user.getUid()).withParam("sec_user_id", user.getSecUid()).open();
    }
}
