package com.bytedance.android.livesdk.feed.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.C1213t;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.media.AbstractC2989d;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.core.paging.AbstractC3985b;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdk.feed.AbstractC8596i;
import com.bytedance.android.livesdk.feed.AbstractC8639l;
import com.bytedance.android.livesdk.feed.feed.C8582a;
import com.bytedance.android.livesdk.feed.feed.C8583b;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p531g.AbstractC8592a;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.p145b.p146a.C2695a;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;

public class BaseFeedDataViewModel extends PagingViewModel<FeedItem> {

    /* renamed from: a */
    public AbstractC8639l f21481a;

    /* renamed from: i */
    public C1213t<Integer> f21482i = new C1213t<>();

    /* renamed from: j */
    public C1213t<AbstractC2989d> f21483j = new C1213t<>();

    /* renamed from: k */
    public C1213t<Integer> f21484k = new C1213t<>();

    /* renamed from: l */
    public C1213t<Integer> f21485l = new C1213t<>();

    /* renamed from: m */
    public C1213t<List<ImageModel>> f21486m = new C1213t<>();

    /* renamed from: n */
    public C1213t<BaseFeedRepository.EnumC8657a> f21487n = new C1213t<>();

    /* renamed from: o */
    public C1213t<BaseFeedRepository.EnumC8657a> f21488o = new C1213t<>();

    /* renamed from: p */
    protected AbstractC3985b<FeedItem> f21489p;

    /* renamed from: q */
    protected String f21490q;

    /* renamed from: r */
    public int f21491r;

    /* renamed from: s */
    public int f21492s;

    /* renamed from: t */
    protected String f21493t;

    /* renamed from: u */
    public FeedDataKey f21494u;

    /* renamed from: v */
    public C1213t<AbstractC2994b.EnumC2995a> f21495v = new C1213t<>();

    /* renamed from: w */
    private C8582a<AbstractC3985b<FeedItem>, C8583b> f21496w;

    /* renamed from: x */
    private C8583b f21497x;

    /* renamed from: y */
    private AbstractC8592a f21498y;

    /* renamed from: z */
    private long f21499z;

    static {
        Covode.recordClassIndex(9580);
    }

    /* renamed from: g */
    public boolean mo14996g() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo14993d() {
        return this.f21490q;
    }

    /* renamed from: e */
    public final FeedDataKey mo14994e() {
        if (this.f21494u == null) {
            this.f21494u = mo14995f();
        }
        return this.f21494u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public FeedDataKey mo14995f() {
        return FeedDataKey.m16810a(this.f21493t, mo14993d(), this.f21499z);
    }

    @Override // com.bytedance.android.live.core.paging.viewmodel.PagingViewModel
    /* renamed from: a */
    public final boolean mo9375a() {
        boolean a = super.mo9375a();
        if (a) {
            this.f21482i.setValue(0);
            C2695a.f8059g.mo7221d();
        }
        return a;
    }

    /* renamed from: c */
    public void mo14992c() {
        try {
            C8582a<AbstractC3985b<FeedItem>, C8583b> a = this.f21481a.mo14934a(mo14993d());
            this.f21496w = a;
            this.f21489p = a.f21210a;
            N n = this.f21496w.f21211b;
            this.f21497x = n;
            n.f21212a.observeForever(new C8713a(this));
            this.f21497x.f21213b.observeForever(new C8714b(this));
            mo9374a(this.f21489p);
            this.f21488o.observeForever(new C8715c(this));
            mo17918a(this.f21481a.mo14935a().mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C8716d(this), C8717e.f21525a));
            mo17918a(this.f21481a.mo14939b().mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C8718f(this), C8719g.f21527a));
            AbstractC8639l lVar = this.f21481a;
            if (lVar instanceof BaseFeedRepository) {
                mo17918a(((BaseFeedRepository) lVar).f21368c.mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C8720h(this), C8721i.f21529a));
                mo17918a(((BaseFeedRepository) this.f21481a).f21369d.mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C8722j(this), C8723k.f21531a));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo14990a(String str) {
        this.f21481a.mo14938a(str, null);
        mo14991b(str);
        return mo9375a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14991b(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "enter_auto") && !TextUtils.equals(str, "detail_loadmore") && this.f21498y.mo14896a()) {
            Integer value = this.f21484k.getValue();
            if (value == null) {
                this.f21484k.setValue(1);
            } else {
                this.f21484k.setValue(Integer.valueOf(value.intValue() + 1));
            }
        }
    }

    public BaseFeedDataViewModel(AbstractC8639l lVar, AbstractC8596i iVar, AbstractC8592a aVar) {
        this.f21481a = lVar;
        if (iVar != null) {
            this.f21490q = iVar.mo14851a();
            this.f21491r = 10;
            this.f21492s = iVar.mo14858c();
            this.f21493t = iVar.mo14857b();
            this.f21498y = aVar;
            this.f21499z = 0;
            this.f21481a.mo14937a(new AbstractC8639l.AbstractC8640a() {
                /* class com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel.C87121 */

                static {
                    Covode.recordClassIndex(9581);
                }

                @Override // com.bytedance.android.livesdk.feed.AbstractC8639l.AbstractC8640a
                /* renamed from: a */
                public final FeedDataKey mo14943a() {
                    return BaseFeedDataViewModel.this.mo14994e();
                }

                @Override // com.bytedance.android.livesdk.feed.AbstractC8639l.AbstractC8640a
                /* renamed from: b */
                public final int mo14944b() {
                    return BaseFeedDataViewModel.this.f21491r;
                }

                @Override // com.bytedance.android.livesdk.feed.AbstractC8639l.AbstractC8640a
                /* renamed from: c */
                public final int mo14945c() {
                    return BaseFeedDataViewModel.this.f21492s;
                }
            });
        }
    }
}
