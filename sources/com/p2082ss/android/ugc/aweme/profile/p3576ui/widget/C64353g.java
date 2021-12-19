package com.p2082ss.android.ugc.aweme.profile.p3576ui.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p2082ss.android.ugc.aweme.profile.service.AbstractC63871f;
import com.p2082ss.android.ugc.aweme.recommend.users.C66649a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.g */
public final class C64353g extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final Context f145888a;

    /* renamed from: b */
    final AvatarImageWithVerify f145889b;

    /* renamed from: c */
    final TextView f145890c;

    /* renamed from: d */
    final TextView f145891d;

    /* renamed from: e */
    final TextView f145892e;

    /* renamed from: f */
    final ImageView f145893f;

    /* renamed from: g */
    public AbstractC89183m<? super RecommendContact, ? super Integer, C89391z> f145894g;

    /* renamed from: h */
    public final int f145895h;

    static {
        Covode.recordClassIndex(75807);
    }

    /* renamed from: a */
    public final String mo103915a() {
        int i = this.f145895h;
        if (i == 0) {
            return "others_homepage";
        }
        if (i == 1) {
            return "homepage_follow";
        }
        if (i != 2) {
            return "";
        }
        return "homepage_friends";
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.g$a */
    static final class View$OnClickListenerC64354a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64353g f145896a;

        /* renamed from: b */
        final /* synthetic */ RecommendContact f145897b;

        /* renamed from: c */
        final /* synthetic */ int f145898c;

        static {
            Covode.recordClassIndex(75808);
        }

        View$OnClickListenerC64354a(C64353g gVar, RecommendContact recommendContact, int i) {
            this.f145896a = gVar;
            this.f145897b = recommendContact;
            this.f145898c = i;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89183m<? super RecommendContact, ? super Integer, C89391z> mVar = this.f145896a.f145894g;
            if (mVar != null) {
                mVar.invoke(this.f145897b, Integer.valueOf(this.f145898c));
            }
            C66649a.f149816a.mo105650a();
            this.f145896a.mo103915a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.g$b */
    static final class View$OnClickListenerC64355b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64353g f145899a;

        /* renamed from: b */
        final /* synthetic */ RecommendContact f145900b;

        /* renamed from: c */
        final /* synthetic */ int f145901c;

        static {
            Covode.recordClassIndex(75809);
        }

        View$OnClickListenerC64355b(C64353g gVar, RecommendContact recommendContact, int i) {
            this.f145899a = gVar;
            this.f145900b = recommendContact;
            this.f145901c = i;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC63871f a = C66649a.f149816a.mo105650a();
            Context context = this.f145899a.f145888a;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            new AbstractC89172b<Boolean, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64353g.View$OnClickListenerC64355b.C643561 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC64355b f145902a;

                static {
                    Covode.recordClassIndex(75810);
                }

                {
                    this.f145902a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Boolean bool) {
                    AbstractC89183m<? super RecommendContact, ? super Integer, C89391z> mVar;
                    if (bool.booleanValue() && (mVar = this.f145902a.f145899a.f145894g) != null) {
                        mVar.invoke(this.f145902a.f145900b, Integer.valueOf(this.f145902a.f145901c));
                    }
                    return C89391z.f203057a;
                }
            };
            a.mo87022a((Activity) context);
            AbstractC63871f a2 = C66649a.f149816a.mo105650a();
            this.f145899a.mo103915a();
            a2.mo87023a("click");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64353g(View view, int i) {
        super(view);
        C89219l.m154721d(view, "");
        this.f145895h = i;
        this.f145888a = view.getContext();
        View findViewById = view.findViewById(R.id.nz);
        C89219l.m154716b(findViewById, "");
        this.f145889b = (AvatarImageWithVerify) findViewById;
        View findViewById2 = view.findViewById(R.id.fa1);
        C89219l.m154716b(findViewById2, "");
        this.f145890c = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.dfk);
        C89219l.m154716b(findViewById3, "");
        this.f145891d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.b6a);
        C89219l.m154716b(findViewById4, "");
        this.f145892e = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.a6q);
        C89219l.m154716b(findViewById5, "");
        this.f145893f = (ImageView) findViewById5;
    }
}
