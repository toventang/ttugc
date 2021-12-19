package com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.widget.card.view.FollowButtonWithBlock;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecUserRectangleCell */
public final class RecUserRectangleCell extends RecommendUserCell<C74825a> {
    static {
        Covode.recordClassIndex(87669);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell
    /* renamed from: a */
    public final int mo117868a() {
        return R.layout.b08;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell
    /* renamed from: a */
    public final void mo117870a(FollowButtonWithBlock followButtonWithBlock, FollowStatus followStatus) {
        C89219l.m154721d(followButtonWithBlock, "");
        C89219l.m154721d(followStatus, "");
        super.mo117870a(followButtonWithBlock, followStatus);
        m131364a(followStatus, followButtonWithBlock);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell
    /* renamed from: a */
    public final void mo117869a(User user, FollowButtonWithBlock followButtonWithBlock) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(followButtonWithBlock, "");
        FollowStatus followStatus = new FollowStatus();
        followStatus.followStatus = user.getFollowStatus();
        m131364a(followStatus, followButtonWithBlock);
        super.mo117869a(user, followButtonWithBlock);
    }

    /* renamed from: a */
    private final void m131364a(FollowStatus followStatus, FollowButtonWithBlock followButtonWithBlock) {
        int i = followStatus.followStatus;
        if (i == 0) {
            ViewGroup.LayoutParams layoutParams = followButtonWithBlock.getLayoutParams();
            if (layoutParams != null) {
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                layoutParams.width = C89241a.m154730a(TypedValue.applyDimension(1, 88.0f, system.getDisplayMetrics()));
                followButtonWithBlock.setLayoutParams(layoutParams);
                mo23351d().setVisibility(0);
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        } else if (i == 1 || i == 2 || i == 4) {
            ViewGroup.LayoutParams layoutParams2 = followButtonWithBlock.getLayoutParams();
            if (layoutParams2 != null) {
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                layoutParams2.width = C89241a.m154730a(TypedValue.applyDimension(1, 120.0f, system2.getDisplayMetrics()));
                followButtonWithBlock.setLayoutParams(layoutParams2);
                mo23351d().setVisibility(8);
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }
}
