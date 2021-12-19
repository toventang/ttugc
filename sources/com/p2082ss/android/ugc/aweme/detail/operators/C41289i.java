package com.p2082ss.android.ugc.aweme.detail.operators;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.detail.p2750i.C41235i;
import com.p2082ss.android.ugc.aweme.detail.p2750i.C41237j;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.i */
public final class C41289i implements AbstractC41262aa {

    /* renamed from: a */
    private C41235i f96388a = new C41235i();

    /* renamed from: b */
    private WeakReference<AbstractC41267ad> f96389b = null;

    /* renamed from: c */
    private C41237j f96390c = new C41237j();

    static {
        Covode.recordClassIndex(49177);
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
        return 7000;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean init(Fragment fragment) {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isDataEmpty() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final Object getViewModel() {
        return this.f96388a;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isLoading() {
        return this.f96390c.mo67842j();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void unInit() {
        this.f96389b = null;
        this.f96390c.ck_();
        this.f96390c.mo67840h();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void bindView(AbstractC41267ad adVar) {
        this.f96389b = new WeakReference<>(adVar);
        this.f96390c.mo67839a_(adVar);
        this.f96390c.mo67838a(this.f96388a);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean deleteItem(String str) {
        WeakReference<AbstractC41267ad> weakReference = this.f96389b;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        this.f96389b.get().mo70501l();
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        this.f96390c.mo57616a(bVar.getAid(), bVar.getEventType());
    }
}
