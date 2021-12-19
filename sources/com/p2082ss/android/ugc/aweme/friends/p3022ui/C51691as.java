package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.common.C17177c;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p2082ss.android.ugc.aweme.profile.service.AbstractC63871f;
import com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.as */
public final class C51691as extends AbstractC51755x {

    /* renamed from: a */
    public final Context f119139a;

    /* renamed from: b */
    public AbstractC89183m<? super RecommendContact, ? super Integer, C89391z> f119140b;

    /* renamed from: c */
    private final View f119141c;

    /* renamed from: d */
    private final AvatarImageWithVerify f119142d;

    /* renamed from: e */
    private final FansFollowUserBtn f119143e;

    /* renamed from: f */
    private final ImageView f119144f;

    static {
        Covode.recordClassIndex(61054);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51755x
    public final void setDislikeListener(AbstractC89183m<? super RecommendContact, ? super Integer, C89391z> mVar) {
        this.f119140b = mVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.as$a */
    static final class View$OnClickListenerC51692a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C51691as f119145a;

        /* renamed from: b */
        final /* synthetic */ RecommendContact f119146b;

        /* renamed from: c */
        final /* synthetic */ int f119147c;

        static {
            Covode.recordClassIndex(61055);
        }

        View$OnClickListenerC51692a(C51691as asVar, RecommendContact recommendContact, int i) {
            this.f119145a = asVar;
            this.f119146b = recommendContact;
            this.f119147c = i;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC63871f i = IRecommendUsersServiceImpl.m118438j().mo105663i();
            Context context = this.f119145a.f119139a;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            new AbstractC89172b<Boolean, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.p3022ui.C51691as.View$OnClickListenerC51692a.C516931 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC51692a f119148a;

                static {
                    Covode.recordClassIndex(61056);
                }

                {
                    this.f119148a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Boolean bool) {
                    AbstractC89183m<? super RecommendContact, ? super Integer, C89391z> mVar;
                    if (bool.booleanValue() && (mVar = this.f119148a.f119145a.f119140b) != null) {
                        mVar.invoke(this.f119148a.f119146b, Integer.valueOf(this.f119148a.f119147c));
                    }
                    return C89391z.f203057a;
                }
            };
            i.mo87022a((Activity) context);
            AbstractC63871f i2 = IRecommendUsersServiceImpl.m118438j().mo105663i();
            this.f119145a.getEnterFrom();
            i2.mo87023a("click");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.as$b */
    static final class View$OnClickListenerC51694b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C51691as f119149a;

        /* renamed from: b */
        final /* synthetic */ RecommendContact f119150b;

        /* renamed from: c */
        final /* synthetic */ int f119151c;

        static {
            Covode.recordClassIndex(61057);
        }

        View$OnClickListenerC51694b(C51691as asVar, RecommendContact recommendContact, int i) {
            this.f119149a = asVar;
            this.f119150b = recommendContact;
            this.f119151c = i;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89183m<? super RecommendContact, ? super Integer, C89391z> mVar = this.f119149a.f119140b;
            if (mVar != null) {
                mVar.invoke(this.f119150b, Integer.valueOf(this.f119151c));
            }
            IRecommendUsersServiceImpl.m118438j().mo105663i();
            this.f119149a.getEnterFrom();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C51691as(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(14134);
        this.f119139a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.a2j, this);
        this.f119141c = inflate;
        this.f119142d = (AvatarImageWithVerify) inflate.findViewById(R.id.bsr);
        this.f119143e = (FansFollowUserBtn) inflate.findViewById(R.id.a4h);
        this.f119144f = (ImageView) inflate.findViewById(R.id.am3);
        setBackground(C17177c.m31711c(context));
        MethodCollector.m26664o(14134);
    }

    public /* synthetic */ C51691as(Context context, byte b) {
        this(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51755x
    /* renamed from: a */
    public final void mo87418a(RecommendContact recommendContact, int i) {
        C89219l.m154721d(recommendContact, "");
        this.f119142d.setPlaceHolder(R.drawable.a_9);
        if (C89219l.m154714a((Object) getEnterFrom(), (Object) "find_friends")) {
            FansFollowUserBtn fansFollowUserBtn = this.f119143e;
            ViewGroup.LayoutParams buttonLayoutParams = fansFollowUserBtn.getButtonLayoutParams();
            if (!(buttonLayoutParams.height == C34728n.m70946a(24.0d) && buttonLayoutParams.width == C34728n.m70946a(64.0d))) {
                buttonLayoutParams.height = C34728n.m70946a(24.0d);
                buttonLayoutParams.width = C34728n.m70946a(64.0d);
                fansFollowUserBtn.setButtonLayoutParams(buttonLayoutParams);
                fansFollowUserBtn.getLayoutParams().height = buttonLayoutParams.height;
                fansFollowUserBtn.requestLayout();
            }
        }
        this.f119143e.setText("");
        this.f119143e.setOnClickListener(new View$OnClickListenerC51692a(this, recommendContact, i));
        this.f119144f.setOnClickListener(new View$OnClickListenerC51694b(this, recommendContact, i));
    }
}
