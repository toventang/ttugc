package com.p2082ss.android.ugc.aweme.setting.page.datasave.zerorating;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.p1665b.p1667b.C22528a;
import com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a;
import com.p2082ss.android.ugc.aweme.api.AbstractC33535d;
import com.p2082ss.android.ugc.aweme.api.IZeroRatingService;
import com.p2082ss.android.ugc.aweme.p2386be.C34796d;
import com.p2082ss.android.ugc.aweme.p2727db.C40934c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.datasave.zerorating.a */
public final class View$OnClickListenerC68266a extends C40934c implements View.OnClickListener {

    /* renamed from: a */
    public final Context f152824a;

    /* renamed from: b */
    private final String f152825b;

    static {
        Covode.recordClassIndex(80478);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40934c, com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: b */
    public final /* synthetic */ C34796d mo70128b() {
        return mo70128b();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40934c
    /* renamed from: a */
    public final C34796d mo70133a() {
        return new C34796d(this.f152825b, null, this, null, false, null, null, true, null, false, null, false, null, 130810);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2727db.AbstractC40940e, com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    public final void cl_() {
        IZeroRatingService f = ZeroRatingServiceImpl.m141669f();
        C89219l.m154716b(f, "");
        f.mo59646c().mo59659d();
    }

    /* renamed from: e */
    public final void mo108762e() {
        new C79459a(this.f152824a).mo123050a(R.string.bof).mo123053a();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.datasave.zerorating.a$a */
    public static final class C68267a implements AbstractC22558a<C22528a> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC68266a f152826a;

        /* renamed from: b */
        final /* synthetic */ View f152827b;

        static {
            Covode.recordClassIndex(80479);
        }

        @Override // com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a
        /* renamed from: a */
        public final void mo36791a(Exception exc) {
            C89219l.m154721d(exc, "");
            this.f152826a.mo108762e();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a
        /* renamed from: a */
        public final /* synthetic */ void mo36792a(C22528a aVar) {
            C22528a aVar2 = aVar;
            Context context = null;
            if (aVar2 == null || aVar2.f53255a == null || aVar2.f53255a.size() == 0) {
                this.f152826a.mo108762e();
            } else if (aVar2.f53255a.size() == 1) {
                C22528a.C22529a aVar3 = aVar2.f53255a.get(0);
                C89219l.m154716b(aVar3, "");
                SmartRouter.buildRoute(this.f152826a.f152824a, "aweme://webview").withParam("url", aVar3.getUrl()).open();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("plan_id", aVar3.getPlanId());
                    jSONObject.put("enter_from", "data_saver");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                IZeroRatingService f = ZeroRatingServiceImpl.m141669f();
                C89219l.m154716b(f, "");
                AbstractC33535d c = f.mo59646c();
                String planId = aVar3.getPlanId();
                C89219l.m154716b(planId, "");
                c.mo59658c(planId);
            } else if (aVar2.f53255a.size() > 1) {
                Bundle bundle = new Bundle();
                List<C22528a.C22529a> list = aVar2.f53255a;
                Objects.requireNonNull(list, "null cannot be cast to non-null type java.util.ArrayList<com.bytedance.sdk.mobiledata.entity.DataPlanInfo.DataPlanEntity?>");
                bundle.putSerializable("list", (ArrayList) list);
                View view = this.f152827b;
                if (view != null) {
                    context = view.getContext();
                }
                SmartRouter.buildRoute(context, "aweme://setting/datasaver/freedata").withParam(bundle).open();
            }
        }

        C68267a(View$OnClickListenerC68266a aVar, View view) {
            this.f152826a = aVar;
            this.f152827b = view;
        }

        @Override // com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a
        /* renamed from: a */
        public final void mo36790a(int i, String str) {
            C89219l.m154721d(str, "");
            this.f152826a.mo108762e();
        }
    }

    public View$OnClickListenerC68266a(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        String string = fragment.getString(R.string.b3z);
        C89219l.m154716b(string, "");
        this.f152825b = string;
        this.f152824a = fragment.getContext();
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        IZeroRatingService f = ZeroRatingServiceImpl.m141669f();
        C89219l.m154716b(f, "");
        f.mo59646c().mo59660e();
        ZeroRatingServiceImpl.m141669f().mo59643a(new C68267a(this, view));
    }
}
