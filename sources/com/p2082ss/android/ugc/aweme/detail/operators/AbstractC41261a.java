package com.p2082ss.android.ugc.aweme.detail.operators;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.a */
public abstract class AbstractC41261a<MODEL extends AbstractC39100a, PRESENTER extends C39101b<MODEL>> implements AbstractC41262aa {
    protected MODEL mModel;
    protected PRESENTER mPresenter;

    static {
        Covode.recordClassIndex(49149);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean cannotLoadMore() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public int getPageType(int i) {
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean init(Fragment fragment) {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public Object getViewModel() {
        return this.mModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean isDataEmpty() {
        return this.mModel.isDataEmpty();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean isLoading() {
        return this.mPresenter.mo67842j();
    }

    public boolean checkSelfInvalid() {
        if (this.mPresenter == null || this.mModel == null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public void unInit() {
        this.mPresenter.ck_();
        this.mPresenter.mo67840h();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public void bindView(AbstractC41267ad adVar) {
        this.mPresenter.mo67839a_(adVar);
        this.mPresenter.mo67865a(adVar);
        this.mPresenter.mo67838a(this.mModel);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean deleteItem(String str) {
        String str2;
        String name;
        boolean a = this.mPresenter.mo67866a(C50545m.m94761a(str));
        StringBuilder append = new StringBuilder("delete aweme: ").append(str);
        if (a) {
            str2 = " success";
        } else {
            str2 = " failed";
        }
        StringBuilder append2 = append.append(str2);
        if (this.mPresenter.f92286h == null) {
            name = "null";
        } else {
            name = this.mPresenter.f92286h.getClass().getName();
        }
        C51423a.m95791b(6, "DeleteAweme", append2.append(name).toString());
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public void request(int i, C49812b bVar, int i2, boolean z) {
        this.mPresenter.mo57616a(Integer.valueOf(i));
    }
}
