package com.p2082ss.android.ugc.aweme.setting.page.datasave.zerorating;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.datasave.zerorating.FreeDataCell */
public final class FreeDataCell extends FreeDataCommonCell<C68268b> {

    /* renamed from: a */
    public C68268b f152822a;

    static {
        Covode.recordClassIndex(80475);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell, com.p2082ss.android.ugc.aweme.setting.page.datasave.zerorating.FreeDataCommonCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C68268b bVar) {
        C68268b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        super.mo23350a((AbstractC17641a) bVar2);
        this.f152822a = bVar2;
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.b8v);
        TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.b8s);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(bVar2.f152828a);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(bVar2.f152829b);
        ((SimpleDraweeView) this.itemView.findViewById(R.id.b8t)).setImageURI(bVar2.f152830c);
    }

    public final void onClick(View view) {
        String str;
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        SmartRoute buildRoute = SmartRouter.buildRoute(view2.getContext(), "aweme://webview");
        C68268b bVar = this.f152822a;
        String str2 = null;
        if (bVar != null) {
            str = bVar.f152832e;
        } else {
            str = null;
        }
        buildRoute.withParam("url", str).open();
        JSONObject jSONObject = new JSONObject();
        try {
            C68268b bVar2 = this.f152822a;
            if (bVar2 != null) {
                str2 = bVar2.f152831d;
            }
            jSONObject.put("plan_id", str2);
            jSONObject.put("enter_from", "zero_rating");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C39162r.m79461a("data_plan_click", jSONObject);
    }
}
