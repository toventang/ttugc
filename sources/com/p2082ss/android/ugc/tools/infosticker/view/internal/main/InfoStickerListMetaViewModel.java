package com.p2082ss.android.ugc.tools.infosticker.view.internal.main;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84536d;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84692d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84456m;
import com.p2082ss.android.ugc.tools.view.base.HumbleViewModel;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import java.util.List;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListMetaViewModel */
public final class InfoStickerListMetaViewModel extends HumbleViewModel implements AbstractC33974au, AbstractC84692d {

    /* renamed from: a */
    public final C1213t<List<AbstractC84456m>> f189232a;

    /* renamed from: b */
    public final C1213t<EnumC85026a> f189233b;

    /* renamed from: c */
    private final C88411a f189234c = new C88411a();

    /* renamed from: d */
    private final LiveData<List<AbstractC84456m>> f189235d;

    /* renamed from: e */
    private final LiveData<EnumC85026a> f189236e;

    /* renamed from: f */
    private final AbstractC84536d f189237f;

    static {
        Covode.recordClassIndex(98674);
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84692d
    /* renamed from: a */
    public final LiveData<List<AbstractC84456m>> mo129603a() {
        return this.f189235d;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84692d
    /* renamed from: b */
    public final LiveData<EnumC85026a> mo129604b() {
        return this.f189236e;
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f189234c.mo142944a();
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84692d
    /* renamed from: c */
    public final void mo129605c() {
        if (!isDestroyed()) {
            EnumC85026a value = this.f189233b.getValue();
            if (value == null || value != EnumC85026a.LOADING) {
                this.f189233b.setValue(EnumC85026a.LOADING);
                AbstractC88412b a = this.f189237f.mo129421a().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88392a.m153583a()).mo143254a(new C84704a(this), new C84705b(this));
                C89219l.m154716b(a, "");
                C88934a.m154195a(a, this.f189234c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListMetaViewModel$b */
    static final class C84705b<T> implements AbstractC88433f<Throwable> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerListMetaViewModel f189239a;

        static {
            Covode.recordClassIndex(98676);
        }

        C84705b(InfoStickerListMetaViewModel infoStickerListMetaViewModel) {
            this.f189239a = infoStickerListMetaViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Throwable th) {
            this.f189239a.f189233b.setValue(EnumC85026a.ERROR);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListMetaViewModel$a */
    static final class C84704a<T> implements AbstractC88433f<List<? extends AbstractC84456m>> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerListMetaViewModel f189238a;

        static {
            Covode.recordClassIndex(98675);
        }

        C84704a(InfoStickerListMetaViewModel infoStickerListMetaViewModel) {
            this.f189238a = infoStickerListMetaViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: androidx.lifecycle.t<java.util.List<com.ss.android.ugc.tools.h.a.m>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(List<? extends AbstractC84456m> list) {
            EnumC85026a aVar;
            List<? extends AbstractC84456m> list2 = list;
            this.f189238a.f189232a.setValue(list2);
            C1213t<EnumC85026a> tVar = this.f189238a.f189233b;
            if (list2.isEmpty()) {
                aVar = EnumC85026a.EMPTY;
            } else {
                aVar = EnumC85026a.NONE;
            }
            tVar.setValue(aVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfoStickerListMetaViewModel(AbstractC1204m mVar, AbstractC84536d dVar) {
        super(mVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(dVar, "");
        this.f189237f = dVar;
        C1213t<List<AbstractC84456m>> tVar = new C1213t<>();
        this.f189232a = tVar;
        this.f189235d = tVar;
        C1213t<EnumC85026a> tVar2 = new C1213t<>();
        this.f189233b = tVar2;
        this.f189236e = tVar2;
    }
}
