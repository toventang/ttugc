package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3871g;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.base.p2379ui.CircleImageView;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.a */
public final class C72939a extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final CircleImageView f163664a;

    /* renamed from: b */
    public final TextView f163665b;

    static {
        Covode.recordClassIndex(85639);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.a$a */
    public static final class View$OnClickListenerC72940a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72939a f163666a;

        /* renamed from: b */
        final /* synthetic */ User f163667b;

        static {
            Covode.recordClassIndex(85640);
        }

        public View$OnClickListenerC72940a(C72939a aVar, User user) {
            this.f163666a = aVar;
            this.f163667b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            View view2 = this.f163666a.itemView;
            C89219l.m154716b(view2, "");
            if (view2.getContext() != null) {
                View view3 = this.f163666a.itemView;
                C89219l.m154716b(view3, "");
                SmartRouter.buildRoute(view3.getContext(), "aweme://user/profile/").withParam("uid", this.f163667b.getUid()).withParam("sec_user_id", this.f163667b.getSecUid()).open();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.a$b */
    public static final class View$OnClickListenerC72941b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72939a f163668a;

        /* renamed from: b */
        final /* synthetic */ User f163669b;

        static {
            Covode.recordClassIndex(85641);
        }

        public View$OnClickListenerC72941b(C72939a aVar, User user) {
            this.f163668a = aVar;
            this.f163669b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            View view2 = this.f163668a.itemView;
            C89219l.m154716b(view2, "");
            if (view2.getContext() != null) {
                View view3 = this.f163668a.itemView;
                C89219l.m154716b(view3, "");
                SmartRouter.buildRoute(view3.getContext(), "aweme://user/profile/").withParam("uid", this.f163669b.getUid()).withParam("sec_user_id", this.f163669b.getSecUid()).open();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72939a(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.bw2);
        C89219l.m154716b(findViewById, "");
        this.f163664a = (CircleImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.ezz);
        C89219l.m154716b(findViewById2, "");
        this.f163665b = (TextView) findViewById2;
    }
}
