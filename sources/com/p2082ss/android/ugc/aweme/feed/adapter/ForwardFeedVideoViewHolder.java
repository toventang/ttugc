package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.RelationLabelHelper;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import java.util.Collection;
import org.greenrobot.eventbus.AbstractC90253j;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.ForwardFeedVideoViewHolder */
public class ForwardFeedVideoViewHolder extends VideoViewCell implements AbstractC90253j {

    /* renamed from: a */
    private final C48304x f111298a = new C48304x(mo80202aw(), this.f111480z);

    /* renamed from: b */
    private Aweme f111299b;

    static {
        Covode.recordClassIndex(56772);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: O */
    public final Aweme mo80089O() {
        return this.f111299b;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void bp_() {
        super.bp_();
        C48304x xVar = this.f111298a;
        if (xVar.f111948b == null) {
            return;
        }
        if ((xVar.f111948b.getRelationLabel() != null && xVar.f111948b.getRelationLabel().getType() == 1 && !TextUtils.isEmpty(xVar.f111948b.getRelationLabel().getLabelInfo())) || (xVar.f111948b.getFeedRelationLabel() != null && xVar.f111948b.getFeedRelationLabel().getType().intValue() == 3 && !C13603b.m24435a((Collection) xVar.f111948b.getFeedRelationLabel().getUserList()))) {
            new C48305y(xVar);
            if (xVar.f111947a != null && !RelationLabelHelper.hasDuoShanLabel(xVar.f111948b.getForwardItem()) && !RelationLabelHelper.hasNewRelationLabel(xVar.f111948b.getForwardItem())) {
                if (RelationLabelHelper.hasNewRelationLabel(xVar.f111948b)) {
                    xVar.f111948b.getForwardItem().setNewRelationLabel(xVar.f111948b.getNewRelationLabel());
                    xVar.f111948b.getForwardItem();
                    return;
                }
                xVar.f111948b.getForwardItem();
                xVar.f111948b.getRelationLabel().getLabelInfo();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: a */
    public final void mo70615a(Aweme aweme) {
        this.f111299b = aweme;
        this.f111298a.f111948b = aweme;
        super.mo70615a(C50545m.m94766c(this.f111299b));
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: f */
    public final Aweme mo80090f(int i) {
        if (i == 7) {
            return this.f111299b;
        }
        return super.mo80090f(i);
    }

    ForwardFeedVideoViewHolder(C48238ce ceVar) {
        super(ceVar);
    }
}
