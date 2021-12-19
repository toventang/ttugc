package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimatedImageView;
import com.p2082ss.android.ugc.aweme.feed.api.C48337k;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50196d;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.LiveCircleView;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.s */
public final class C48296s extends AbstractC48135a {

    /* renamed from: b */
    public AnimatedImageView f111932b;

    /* renamed from: c */
    public C48337k f111933c;

    /* renamed from: d */
    C50196d f111934d;

    /* renamed from: e */
    private TextView f111935e;

    /* renamed from: f */
    private TextView f111936f;

    /* renamed from: g */
    private Context f111937g;

    /* renamed from: h */
    private LiveCircleView f111938h;

    /* renamed from: i */
    private List<C48337k> f111939i;

    static {
        Covode.recordClassIndex(57038);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.s$a */
    static final class View$OnClickListenerC48297a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48296s f111940a;

        /* renamed from: b */
        final /* synthetic */ List f111941b;

        static {
            Covode.recordClassIndex(57039);
        }

        View$OnClickListenerC48297a(C48296s sVar, List list) {
            this.f111940a = sVar;
            this.f111941b = list;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(this.f111940a.itemView, 1200)) {
                C48296s sVar = this.f111940a;
                View view2 = sVar.itemView;
                C89219l.m154716b(view2, "");
                Context context = view2.getContext();
                C89219l.m154716b(context, "");
                sVar.mo80263a(context, this.f111940a.f111933c, this.f111941b, this.f111940a.f111932b.getWidth(), this.f111940a.f111932b.getHeight());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48296s(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.buj);
        C89219l.m154716b(findViewById, "");
        this.f111932b = (AnimatedImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.ezz);
        C89219l.m154716b(findViewById2, "");
        this.f111935e = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bia);
        C89219l.m154716b(findViewById3, "");
        this.f111936f = (TextView) findViewById3;
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        this.f111937g = context;
        View findViewById4 = view.findViewById(R.id.bxb);
        C89219l.m154716b(findViewById4, "");
        this.f111938h = (LiveCircleView) findViewById4;
        AnimatedImageView animatedImageView = this.f111932b;
        C50196d dVar = new C50196d(animatedImageView, animatedImageView, this.f111938h);
        this.f111934d = dVar;
        dVar.f115918l = false;
    }

    /* renamed from: a */
    public final void mo80407a(C48337k kVar, List<C48337k> list, int i) {
        User user;
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(list, "");
        this.f111525a = i;
        View view = this.itemView;
        C89219l.m154716b(view, "");
        view.setScaleX(1.0f);
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        view2.setScaleY(1.0f);
        this.f111933c = kVar;
        this.f111939i = list;
        if (!(kVar == null || (user = kVar.getUser()) == null)) {
            C34577e.m70592a(this.f111932b, user.getAvatarThumb());
            if (C58071d.m104909c()) {
                this.f111935e.setText(user.getNickname());
            } else {
                this.f111935e.setText(user.getUniqueId());
            }
        }
        mo80264a(this.f111936f);
        this.f111938h.setVisibility(0);
        this.f111934d.mo85359a(null, getClass());
        this.f111932b.setOnClickListener(new View$OnClickListenerC48297a(this, list));
    }
}
