package com.p2082ss.android.ugc.aweme.detail.operators;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.af */
public final class C41269af implements AbstractC41262aa {

    /* renamed from: a */
    private AbstractC39100a f96356a;

    /* renamed from: b */
    private C39101b f96357b = new C39101b();

    static {
        Covode.recordClassIndex(49157);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean cannotLoadMore() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final int getPageType(int i) {
        return 9;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final Object getViewModel() {
        return this.f96356a;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isDataEmpty() {
        return this.f96356a.isDataEmpty();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isLoading() {
        return this.f96357b.mo67842j();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void unInit() {
        this.f96357b.ck_();
        this.f96357b.mo67840h();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean init(Fragment fragment) {
        if (this.f96356a != null) {
            return true;
        }
        return false;
    }

    public C41269af(AbstractC39100a aVar) {
        this.f96356a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void bindView(AbstractC41267ad adVar) {
        this.f96357b.mo67839a_(adVar);
        this.f96357b.mo67865a((AbstractC39103d) adVar);
        this.f96357b.mo67838a((AbstractC39085b) this.f96356a);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean deleteItem(String str) {
        Aweme b = AwemeService.m70060b().mo60684b(str);
        if (b == null && (b = AwemeService.m70060b().mo60679a(str)) == null) {
            return false;
        }
        return this.f96357b.mo67866a(b);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        this.f96357b.mo57528c();
    }
}
