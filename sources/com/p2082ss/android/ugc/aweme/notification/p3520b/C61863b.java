package com.p2082ss.android.ugc.aweme.notification.p3520b;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.friends.model.MutualStruct;
import com.p2082ss.android.ugc.aweme.friends.model.MutualUser;
import com.p2082ss.android.ugc.aweme.notification.utils.C62252a;
import com.p2082ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.notification.b.b */
public final class C61863b {
    static {
        Covode.recordClassIndex(72606);
    }

    /* renamed from: a */
    public static final void m112002a(MutualRelationView mutualRelationView, MatchedFriendStruct matchedFriendStruct, int i) {
        List<MutualUser> userList;
        if (mutualRelationView != null) {
            C61862a.m111997a(mutualRelationView);
            if (matchedFriendStruct != null) {
                C61862a.m111999b(mutualRelationView);
                MutualStruct mMutualStruct = matchedFriendStruct.getMMutualStruct();
                boolean z = false;
                if (!(mMutualStruct == null || (userList = mMutualStruct.getUserList()) == null || userList.size() <= 0)) {
                    z = true;
                }
                m112000a(mutualRelationView, i, z);
                if (z) {
                    mutualRelationView.mo125023a(matchedFriendStruct.getMMutualStruct(), 4);
                } else {
                    mutualRelationView.mo125020a();
                }
                mutualRelationView.getTvDesc().setText(matchedFriendStruct.getRecommendReason());
            }
        }
    }

    /* renamed from: a */
    public static final void m112000a(MutualRelationView mutualRelationView, int i, boolean z) {
        if (mutualRelationView != null) {
            if (!z) {
                C11279p.m20025d(mutualRelationView.getTvDesc(), 0);
            } else {
                TuxTextView tvDesc = mutualRelationView.getTvDesc();
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                C11279p.m20025d(tvDesc, C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics())));
            }
            mutualRelationView.mo125024b();
            if (i == 0) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                gradientDrawable.setCornerRadius(TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics()));
                gradientDrawable.setColor(C0643b.m2378c(mutualRelationView.getContext(), R.color.f));
                mutualRelationView.setRootBackground(gradientDrawable);
                Resources system3 = Resources.getSystem();
                C89219l.m154709a((Object) system3, "");
                int a = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system3.getDisplayMetrics()));
                Resources system4 = Resources.getSystem();
                C89219l.m154709a((Object) system4, "");
                mutualRelationView.mo125021a(a, C89241a.m154730a(TypedValue.applyDimension(1, 13.0f, system4.getDisplayMetrics())));
                Resources system5 = Resources.getSystem();
                C89219l.m154709a((Object) system5, "");
                mutualRelationView.setTuxTextSize(C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system5.getDisplayMetrics())));
                Resources system6 = Resources.getSystem();
                C89219l.m154709a((Object) system6, "");
                Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 5.0f, system6.getDisplayMetrics())));
                Resources system7 = Resources.getSystem();
                C89219l.m154709a((Object) system7, "");
                Integer valueOf2 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 2.0f, system7.getDisplayMetrics())));
                Resources system8 = Resources.getSystem();
                C89219l.m154709a((Object) system8, "");
                Integer valueOf3 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 5.0f, system8.getDisplayMetrics())));
                Resources system9 = Resources.getSystem();
                C89219l.m154709a((Object) system9, "");
                mutualRelationView.m141126a(valueOf, valueOf2, valueOf3, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 2.0f, system9.getDisplayMetrics()))));
                mutualRelationView.getTvDesc().setTextColor(C0643b.m2378c(mutualRelationView.getContext(), R.color.c5));
                mutualRelationView.getTvDesc().setTuxFont(72);
                mutualRelationView.mo125025b(C0643b.m2378c(mutualRelationView.getContext(), R.color.n), C0643b.m2378c(mutualRelationView.getContext(), R.color.c4));
            } else if (i == 1) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                Resources system10 = Resources.getSystem();
                C89219l.m154709a((Object) system10, "");
                gradientDrawable2.setCornerRadius(TypedValue.applyDimension(1, 2.0f, system10.getDisplayMetrics()));
                mutualRelationView.setRootBackground(gradientDrawable2);
                Resources system11 = Resources.getSystem();
                C89219l.m154709a((Object) system11, "");
                int a2 = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system11.getDisplayMetrics()));
                Resources system12 = Resources.getSystem();
                C89219l.m154709a((Object) system12, "");
                mutualRelationView.mo125021a(a2, C89241a.m154730a(TypedValue.applyDimension(1, 13.0f, system12.getDisplayMetrics())));
                Resources system13 = Resources.getSystem();
                C89219l.m154709a((Object) system13, "");
                mutualRelationView.setTuxTextSize(C89241a.m154730a(TypedValue.applyDimension(1, 14.0f, system13.getDisplayMetrics())));
                Resources system14 = Resources.getSystem();
                C89219l.m154709a((Object) system14, "");
                Integer valueOf4 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 0.0f, system14.getDisplayMetrics())));
                Resources system15 = Resources.getSystem();
                C89219l.m154709a((Object) system15, "");
                Integer valueOf5 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 2.0f, system15.getDisplayMetrics())));
                Resources system16 = Resources.getSystem();
                C89219l.m154709a((Object) system16, "");
                Integer valueOf6 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 0.0f, system16.getDisplayMetrics())));
                Resources system17 = Resources.getSystem();
                C89219l.m154709a((Object) system17, "");
                mutualRelationView.m141126a(valueOf4, valueOf5, valueOf6, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 2.0f, system17.getDisplayMetrics()))));
                mutualRelationView.getTvDesc().setTextColor(C0643b.m2378c(mutualRelationView.getContext(), R.color.c4));
                mutualRelationView.getTvDesc().setTuxFont(51);
            }
        }
    }

    /* renamed from: a */
    public static final void m112001a(MutualRelationView mutualRelationView, View view, View view2, boolean z) {
        if (view != null && mutualRelationView != null) {
            ConstraintLayout constraintLayout = null;
            if (view2 != null) {
                constraintLayout = (ConstraintLayout) view2.findViewById(R.id.cv7);
            }
            if ((constraintLayout instanceof ConstraintLayout) && constraintLayout != null) {
                C62252a aVar = new C62252a(constraintLayout);
                if (z) {
                    C62252a.C62253a a = aVar.mo100256a();
                    if (a != null) {
                        a.mo100257a(view.getId(), R.id.cuf);
                        a.mo100259b(view.getId(), -1);
                        a.mo100258a();
                        return;
                    }
                    return;
                }
                C62252a.C62253a a2 = aVar.mo100256a();
                if (a2 != null) {
                    a2.mo100257a(view.getId(), R.id.bd0);
                    a2.mo100259b(view.getId(), R.id.bcz);
                    a2.mo100258a();
                }
            }
        }
    }
}
