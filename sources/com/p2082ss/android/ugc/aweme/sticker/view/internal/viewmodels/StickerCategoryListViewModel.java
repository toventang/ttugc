package com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1468k.C20674a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75431i;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3986c.C75729d;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p2082ss.android.ugc.tools.view.base.HumbleViewModel;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerCategoryListViewModel */
public final class StickerCategoryListViewModel extends HumbleViewModel implements AbstractC33974au, AbstractC76396a {

    /* renamed from: a */
    long f171604a;

    /* renamed from: b */
    public final C1213t<EnumC85026a> f171605b;

    /* renamed from: c */
    final AbstractC75431i f171606c;

    /* renamed from: d */
    private int f171607d;

    /* renamed from: e */
    private final C1213t<Boolean> f171608e;

    /* renamed from: f */
    private final LiveData<Boolean> f171609f;

    /* renamed from: g */
    private final LiveData<EnumC85026a> f171610g;

    /* renamed from: h */
    private final C1213t<List<EffectCategoryModel>> f171611h;

    /* renamed from: i */
    private final LiveData<List<EffectCategoryModel>> f171612i;

    /* renamed from: j */
    private final AbstractC1204m f171613j;

    /* renamed from: k */
    private final AbstractC75655o f171614k;

    static {
        Covode.recordClassIndex(89351);
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76396a
    /* renamed from: a */
    public final int mo120105a() {
        return this.f171607d;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76396a
    /* renamed from: b */
    public final LiveData<Boolean> mo120107b() {
        return this.f171609f;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76396a
    /* renamed from: c */
    public final LiveData<List<EffectCategoryModel>> mo120108c() {
        return this.f171612i;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76396a
    /* renamed from: d */
    public final LiveData<EnumC85026a> mo120109d() {
        return this.f171610g;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76396a
    /* renamed from: e */
    public final void mo120110e() {
        this.f171604a = System.currentTimeMillis();
        this.f171614k.mo119291c().mo119464j().mo119469b().observe(this.f171613j, new C76394a(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x002b  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo120111f() {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerCategoryListViewModel.mo120111f():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76396a
    /* renamed from: a */
    public final void mo120106a(C75729d dVar) {
        C89219l.m154721d(dVar, "");
        this.f171614k.mo119291c().mo119454a(dVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerCategoryListViewModel$a */
    static final class C76394a<T> implements AbstractC1214u<C35324a<PanelInfoModel>> {

        /* renamed from: a */
        final /* synthetic */ StickerCategoryListViewModel f171615a;

        static {
            Covode.recordClassIndex(89352);
        }

        C76394a(StickerCategoryListViewModel stickerCategoryListViewModel) {
            this.f171615a = stickerCategoryListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C35324a<PanelInfoModel> aVar) {
            C35324a.EnumC35325a aVar2;
            C35324a<PanelInfoModel> aVar3 = aVar;
            if (aVar3 != null && (aVar2 = aVar3.f83351b) != null) {
                int i = C76398c.f171620a[aVar2.ordinal()];
                if (i == 1) {
                    this.f171615a.f171605b.setValue(EnumC85026a.NONE);
                    this.f171615a.mo120111f();
                    StickerCategoryListViewModel stickerCategoryListViewModel = this.f171615a;
                    stickerCategoryListViewModel.f171606c.mo118971a(System.currentTimeMillis() - stickerCategoryListViewModel.f171604a);
                } else if (i == 2) {
                    this.f171615a.f171605b.setValue(EnumC85026a.ERROR);
                } else if (i == 3) {
                    this.f171615a.f171605b.setValue(EnumC85026a.LOADING);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerCategoryListViewModel(AbstractC1204m mVar, AbstractC75655o oVar, AbstractC75431i iVar) {
        super(mVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(iVar, "");
        this.f171613j = mVar;
        this.f171614k = oVar;
        this.f171606c = iVar;
        C1213t<Boolean> tVar = new C1213t<>();
        this.f171608e = tVar;
        this.f171609f = tVar;
        C1213t<EnumC85026a> tVar2 = new C1213t<>();
        this.f171605b = tVar2;
        this.f171610g = tVar2;
        C1213t<List<EffectCategoryModel>> tVar3 = new C1213t<>();
        this.f171611h = tVar3;
        this.f171612i = C20674a.m38925a(tVar3);
        mo120111f();
    }
}
