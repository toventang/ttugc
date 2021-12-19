package com.bytedance.android.livesdk.feed;

import android.content.Context;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.android.livesdk.feed.p531g.AbstractC8592a;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.DislikeTipViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TimeOutRefreshViewModel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.feed.e */
public final class C8564e implements C1175ad.AbstractC1177b {

    /* renamed from: a */
    public long f21164a;

    /* renamed from: b */
    public AbstractC8596i f21165b;

    /* renamed from: c */
    private AbstractC8639l f21166c;

    /* renamed from: d */
    private AbstractC8643m f21167d;

    /* renamed from: e */
    private Context f21168e;

    /* renamed from: f */
    private AbstractC8592a f21169f;

    /* renamed from: g */
    private AbstractC8655q f21170g;

    static {
        Covode.recordClassIndex(9420);
    }

    @Override // androidx.lifecycle.C1175ad.AbstractC1177b
    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
        if (cls.isAssignableFrom(BaseFeedDataViewModel.class)) {
            return new BaseFeedDataViewModel(this.f21166c, this.f21165b, this.f21169f);
        }
        if (cls.isAssignableFrom(TabFeedViewModel.class)) {
            return new TabFeedViewModel(this.f21166c, this.f21165b, this.f21167d, this.f21169f, this.f21170g, this.f21164a);
        }
        if (cls.isAssignableFrom(DislikeTipViewModel.class)) {
            return new DislikeTipViewModel(this.f21167d, this.f21164a, this.f21168e);
        }
        if (cls.isAssignableFrom(TimeOutRefreshViewModel.class)) {
            return new TimeOutRefreshViewModel();
        }
        throw new IllegalArgumentException("unknown model " + cls.getName());
    }

    public C8564e(AbstractC8639l lVar, AbstractC8643m mVar, Context context, AbstractC8655q qVar, AbstractC8592a aVar) {
        this.f21166c = lVar;
        this.f21167d = mVar;
        this.f21168e = context;
        this.f21170g = qVar;
        this.f21169f = aVar;
    }
}
