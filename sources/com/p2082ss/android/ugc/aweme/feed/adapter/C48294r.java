package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.feed.api.C48337k;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50196d;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.LiveCircleView;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80349dn;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.r */
public final class C48294r extends AbstractC48135a {

    /* renamed from: b */
    public final SimpleDraweeView f111917b;

    /* renamed from: c */
    final C50196d f111918c;

    /* renamed from: d */
    final C50196d f111919d;

    /* renamed from: e */
    C48337k f111920e;

    /* renamed from: f */
    private final Context f111921f;

    /* renamed from: g */
    private final SimpleDraweeView f111922g;

    /* renamed from: h */
    private final TextView f111923h;

    /* renamed from: i */
    private final TextView f111924i;

    /* renamed from: j */
    private final TextView f111925j;

    /* renamed from: k */
    private final LiveCircleView f111926k;

    /* renamed from: l */
    private final LiveCircleView f111927l;

    /* renamed from: m */
    private List<C48337k> f111928m;

    static {
        Covode.recordClassIndex(57036);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.r$a */
    static final class View$OnClickListenerC48295a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48294r f111929a;

        /* renamed from: b */
        final /* synthetic */ C48337k f111930b;

        /* renamed from: c */
        final /* synthetic */ List f111931c;

        static {
            Covode.recordClassIndex(57037);
        }

        View$OnClickListenerC48295a(C48294r rVar, C48337k kVar, List list) {
            this.f111929a = rVar;
            this.f111930b = kVar;
            this.f111931c = list;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(this.f111929a.itemView, 1200)) {
                C48294r rVar = this.f111929a;
                View view2 = rVar.itemView;
                C89219l.m154716b(view2, "");
                Context context = view2.getContext();
                C89219l.m154716b(context, "");
                rVar.mo80263a(context, this.f111930b, this.f111931c, this.f111929a.f111917b.getWidth(), this.f111929a.f111917b.getHeight());
            }
        }
    }

    /* renamed from: a */
    private static SlimRoom m91730a(C48337k kVar) {
        if (kVar.getSlimRoom() != null) {
            return kVar.getSlimRoom();
        }
        String str = kVar.getUser().roomData;
        C89219l.m154716b(str, "");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            kVar.setSlimRoom((SlimRoom) C80342dg.m139301a(str, SlimRoom.class));
            return kVar.getSlimRoom();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48294r(View view) {
        super(view);
        C89219l.m154721d(view, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        this.f111921f = context;
        View findViewById = view.findViewById(R.id.buq);
        C89219l.m154716b(findViewById, "");
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) findViewById;
        this.f111922g = simpleDraweeView;
        View findViewById2 = view.findViewById(R.id.bun);
        C89219l.m154716b(findViewById2, "");
        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) findViewById2;
        this.f111917b = simpleDraweeView2;
        View findViewById3 = view.findViewById(R.id.ezz);
        C89219l.m154716b(findViewById3, "");
        this.f111923h = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bia);
        C89219l.m154716b(findViewById4, "");
        this.f111924i = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.f1b);
        C89219l.m154716b(findViewById5, "");
        this.f111925j = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.bxd);
        C89219l.m154716b(findViewById6, "");
        LiveCircleView liveCircleView = (LiveCircleView) findViewById6;
        this.f111926k = liveCircleView;
        View findViewById7 = view.findViewById(R.id.bxc);
        C89219l.m154716b(findViewById7, "");
        LiveCircleView liveCircleView2 = (LiveCircleView) findViewById7;
        this.f111927l = liveCircleView2;
        C50196d dVar = new C50196d(simpleDraweeView, simpleDraweeView, liveCircleView);
        this.f111918c = dVar;
        C50196d dVar2 = new C50196d(simpleDraweeView2, simpleDraweeView2, liveCircleView2);
        this.f111919d = dVar2;
        dVar.f115918l = false;
        dVar2.f115918l = false;
    }

    /* renamed from: a */
    public final void mo80405a(C48337k kVar, List<C48337k> list, int i) {
        List<User> list2;
        User user;
        List<User> list3;
        User user2;
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(list, "");
        this.f111525a = i;
        this.f111920e = kVar;
        this.f111928m = list;
        SlimRoom a = m91730a(kVar);
        if (a != null) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            view.setScaleX(1.0f);
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            view2.setScaleY(1.0f);
            SlimRoom.C11692a linkMic = a.getLinkMic();
            C89219l.m154716b(linkMic, "");
            int i2 = 0;
            if (linkMic.f27944a.size() >= 2) {
                SlimRoom.C11692a linkMic2 = a.getLinkMic();
                if (!(linkMic2 == null || (list3 = linkMic2.f27944a) == null || (user2 = list3.get(0)) == null)) {
                    C80349dn.m139316a(this.f111917b, user2.getAvatarThumb());
                    C58071d.m104909c();
                    this.f111923h.setText(user2.displayId);
                }
                SlimRoom.C11692a linkMic3 = a.getLinkMic();
                if (!(linkMic3 == null || (list2 = linkMic3.f27944a) == null || (user = list2.get(1)) == null)) {
                    C80349dn.m139316a(this.f111922g, user.getAvatarThumb());
                }
            }
            TextView textView = this.f111925j;
            SlimRoom.C11692a linkMic4 = a.getLinkMic();
            C89219l.m154716b(linkMic4, "");
            if (linkMic4.f27946c <= 1) {
                i2 = 8;
            } else if (C80471gb.m139482a()) {
                TextView textView2 = this.f111925j;
                StringBuilder sb = new StringBuilder();
                SlimRoom.C11692a linkMic5 = a.getLinkMic();
                C89219l.m154716b(linkMic5, "");
                textView2.setText(sb.append(String.valueOf(linkMic5.f27946c - 1)).append("+").toString());
            } else {
                TextView textView3 = this.f111925j;
                StringBuilder sb2 = new StringBuilder("+");
                SlimRoom.C11692a linkMic6 = a.getLinkMic();
                C89219l.m154716b(linkMic6, "");
                textView3.setText(sb2.append(String.valueOf(linkMic6.f27946c - 1)).toString());
            }
            textView.setVisibility(i2);
            mo80264a(this.f111924i);
            this.f111917b.setOnClickListener(new View$OnClickListenerC48295a(this, kVar, list));
            this.f111918c.mo85359a(null, getClass());
            this.f111919d.mo85359a(null, getClass());
        }
    }
}
