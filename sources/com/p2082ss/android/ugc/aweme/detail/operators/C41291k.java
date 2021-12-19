package com.p2082ss.android.ugc.aweme.detail.operators;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.C13606e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.detail.p2750i.C41235i;
import com.p2082ss.android.ugc.aweme.detail.p2750i.C41237j;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.k */
public class C41291k implements AbstractC41262aa {

    /* renamed from: a */
    protected C41235i f96391a = new C41235i();

    /* renamed from: b */
    protected C41237j f96392b = new C41237j();

    /* renamed from: c */
    private WeakReference<AbstractC41267ad> f96393c;

    static {
        Covode.recordClassIndex(49179);
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
        return i + 3000;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean init(Fragment fragment) {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean isDataEmpty() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public Object getViewModel() {
        return this.f96391a;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean isLoading() {
        return this.f96392b.mo67842j();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public void unInit() {
        this.f96392b.ck_();
        this.f96392b.mo67840h();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public void bindView(AbstractC41267ad adVar) {
        this.f96393c = new C13606e(adVar);
        this.f96392b.mo67839a_(adVar);
        this.f96392b.mo67838a(this.f96391a);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean deleteItem(String str) {
        WeakReference<AbstractC41267ad> weakReference = this.f96393c;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        this.f96393c.get().mo70501l();
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public void request(int i, C49812b bVar, int i2, boolean z) {
        int i3 = !TextUtils.isEmpty(bVar.getUpvoteId()) ? 1 : 0;
        this.f96392b.mo57616a(bVar.getAid(), bVar.getEventType(), Integer.valueOf(i3));
    }
}
