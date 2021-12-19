package com.p2082ss.android.ugc.aweme.feed.assem.videoauthorinfo;

import android.app.Application;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoVM */
public final class VideoAuthorInfoVM extends FeedBaseViewModel<C49171q> {
    static {
        Covode.recordClassIndex(57906);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C49171q();
    }

    /* renamed from: a */
    private static boolean m92236a(Aweme aweme) {
        if (aweme == null) {
            return true;
        }
        if ((!aweme.isCanPlay() || aweme.isDelete()) && !C58956a.m108315a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m92235a(String str) {
        String str2;
        try {
            Application a = C17879g.m33104a();
            Object[] objArr = new Object[1];
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            objArr[0] = str2;
            String string = a.getString(R.string.bv1, objArr);
            C89219l.m154716b(string, "");
            return string;
        } catch (Throwable unused) {
            if (str == null) {
                str = "";
            }
            return str;
        }
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

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0184  */
    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.p2082ss.android.ugc.aweme.feed.assem.videoauthorinfo.C49171q mo80488a(com.p2082ss.android.ugc.aweme.feed.assem.videoauthorinfo.C49171q r17, com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams r18) {
        /*
        // Method dump skipped, instructions count: 397
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoVM.mo80488a(com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams):com.bytedance.assem.arch.viewModel.j");
    }
}
