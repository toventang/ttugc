package com.p2082ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39159o;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendList;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.AbstractC35320a;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.C35321b;
import com.p2082ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.ab */
public final class C63823ab extends C35321b<RecommendCommonUserModel, AbstractC63857u> implements AbstractC39159o {
    static {
        Covode.recordClassIndex(75247);
    }

    /* renamed from: a */
    public final void mo103286a(List<User> list) {
        if (this.f83348b != null) {
            ((RecommendCommonUserModel) this.f83348b).setData(list);
        }
    }

    /* renamed from: d */
    public final void mo103287d() {
        ((RecommendCommonUserModel) this.f83348b).recommendUserDialogLoadMore(30);
    }

    /* renamed from: e */
    public final void mo103288e() {
        if (this.f83348b != null) {
            ((RecommendCommonUserModel) this.f83348b).resetShownUserIds();
        }
    }

    /* renamed from: f */
    public final int mo103289f() {
        if (this.f83348b != null) {
            return ((RecommendCommonUserModel) this.f83348b).newUserCount;
        }
        return 0;
    }

    /* renamed from: a */
    public final RecommendList mo103280a() {
        if (this.f83348b == null) {
            return null;
        }
        return ((AbstractC35320a) this.f83348b).mData;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        C61504e.C61505a.f139616a.mo99161b();
        if (((AbstractC35320a) this.f83348b).mQueryType == 1) {
            ((AbstractC63857u) this.f83349c).mo81328a((RecommendList) ((AbstractC35320a) this.f83348b).mData);
        } else if (((AbstractC35320a) this.f83348b).mQueryType == 4) {
            ((AbstractC63857u) this.f83349c).mo81332b(((AbstractC35320a) this.f83348b).mData);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        ((AbstractC63857u) this.f83349c).mo81329a(exc);
    }

    /* renamed from: a */
    public final int mo103279a(String str) {
        if (this.f83348b != null) {
            return ((RecommendCommonUserModel) this.f83348b).getUserImprOrder(str);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo103282a(User user) {
        if (this.f83348b != null) {
            ((RecommendCommonUserModel) this.f83348b).removeData(user);
        }
    }

    public C63823ab(RecommendCommonUserModel recommendCommonUserModel, AbstractC63857u uVar) {
        super(recommendCommonUserModel, uVar);
        ((AbstractC35320a) this.f83348b).addNotifyListener(this);
    }

    /* renamed from: a */
    public final void mo103283a(String str, int i, int i2) {
        ((RecommendCommonUserModel) this.f83348b).fetchData(30, str, 2, 0, i, 2, null, i2);
    }

    /* renamed from: a */
    public final void mo103284a(String str, int i, String str2) {
        mo103281a(20, str, 4, i, 2, str2);
    }

    /* renamed from: a */
    public final void mo103285a(String str, int i, String str2, boolean z) {
        m115468a(str, i, 2, str2, z);
    }

    /* renamed from: a */
    private void m115468a(String str, int i, int i2, String str2, boolean z) {
        ((RecommendCommonUserModel) this.f83348b).refreshRecommendUser(20, str, 4, 0, i, null, 2, str2, null, null, z);
    }

    /* renamed from: a */
    public final void mo103281a(int i, String str, int i2, int i3, int i4, String str2) {
        ((RecommendCommonUserModel) this.f83348b).loadMore(i, str, i2, 0, i3, 2, str2, null);
    }
}
