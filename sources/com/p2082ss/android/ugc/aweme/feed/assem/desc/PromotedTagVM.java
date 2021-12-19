package com.p2082ss.android.ugc.aweme.feed.assem.desc;

import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Boost;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.PromotedTagVM */
public final class PromotedTagVM extends FeedBaseViewModel<C48592b> {
    static {
        Covode.recordClassIndex(57362);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C48592b();
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C48592b mo80488a(C48592b bVar, VideoItemParams videoItemParams) {
        return m91944a(bVar, videoItemParams);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.AbstractC14529j
    /* renamed from: b */
    public final /* synthetic */ VideoItemParams mo23373b(AbstractC12853j jVar, VideoItemParams videoItemParams) {
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(videoItemParams, "");
        return videoItemParams;
    }

    /* renamed from: a */
    private static C48592b m91944a(C48592b bVar, VideoItemParams videoItemParams) {
        String str;
        int i;
        boolean z;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(videoItemParams, "");
        Aweme aweme = videoItemParams.mAweme;
        if (aweme == null) {
            return bVar;
        }
        Boost boost = aweme.getBoost();
        if (boost != null) {
            str = boost.getText();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Color.parseColor(boost.getBgColor());
            } catch (Exception unused) {
                i = Color.parseColor("#C0FFFFFF");
            }
            int i2 = 16777215;
            try {
                i2 = Color.parseColor(boost.getTextColor());
                z = false;
            } catch (Exception unused2) {
                z = true;
            }
            return C48592b.m91962a(0, 0, Integer.valueOf(i), Integer.valueOf(i2), boost.getText(), z);
        } else if (bVar.f112387a == 8 && bVar.f112388b == 8) {
            return bVar;
        } else {
            return C48592b.m91962a(8, 8, bVar.f112389c, bVar.f112390d, bVar.f112391e, bVar.f112392f);
        }
    }
}
