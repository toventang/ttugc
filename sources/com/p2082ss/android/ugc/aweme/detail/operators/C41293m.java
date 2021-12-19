package com.p2082ss.android.ugc.aweme.detail.operators;

import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.C13606e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.detail.p2750i.C41232g;
import com.p2082ss.android.ugc.aweme.detail.p2750i.C41234h;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.m */
public final class C41293m implements AbstractC41262aa {

    /* renamed from: a */
    private WeakReference<AbstractC41267ad> f96394a;

    /* renamed from: b */
    private final C41232g f96395b = new C41232g();

    /* renamed from: c */
    private final C41234h f96396c = new C41234h();

    static {
        Covode.recordClassIndex(49181);
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
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean init(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isDataEmpty() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final Object getViewModel() {
        return this.f96395b;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isLoading() {
        return this.f96396c.mo67842j();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void unInit() {
        this.f96396c.ck_();
        this.f96396c.mo67840h();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void bindView(AbstractC41267ad adVar) {
        C89219l.m154721d(adVar, "");
        this.f96394a = new C13606e(adVar);
        this.f96396c.mo67839a_(adVar);
        this.f96396c.mo67838a(this.f96395b);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean deleteItem(String str) {
        AbstractC41267ad adVar;
        C89219l.m154721d(str, "");
        WeakReference<AbstractC41267ad> weakReference = this.f96394a;
        if (weakReference == null || (adVar = weakReference.get()) == null) {
            return false;
        }
        adVar.mo70501l();
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        C89219l.m154721d(bVar, "");
        this.f96396c.mo57616a(bVar.getAid(), bVar.getInboxExtra());
    }
}
