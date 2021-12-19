package com.p2082ss.android.ugc.tools.infosticker.view.internal.main1;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84533a;
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

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerListMetaNewViewModel */
public final class InfoStickerListMetaNewViewModel extends HumbleViewModel implements AbstractC33974au, AbstractC84692d {

    /* renamed from: a */
    public final C1213t<List<AbstractC84456m>> f189510a;

    /* renamed from: b */
    public final C1213t<EnumC85026a> f189511b;

    /* renamed from: c */
    private final C88411a f189512c;

    /* renamed from: d */
    private final LiveData<List<AbstractC84456m>> f189513d;

    /* renamed from: e */
    private final LiveData<EnumC85026a> f189514e;

    /* renamed from: f */
    private final AbstractC84533a f189515f;

    static {
        Covode.recordClassIndex(98792);
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84692d
    /* renamed from: a */
    public final LiveData<List<AbstractC84456m>> mo129603a() {
        return this.f189513d;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84692d
    /* renamed from: b */
    public final LiveData<EnumC85026a> mo129604b() {
        return this.f189514e;
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f189512c.mo142944a();
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84692d
    /* renamed from: c */
    public final void mo129605c() {
        if (!isDestroyed()) {
            EnumC85026a value = this.f189511b.getValue();
            if (value == null || value != EnumC85026a.LOADING) {
                this.f189511b.setValue(EnumC85026a.LOADING);
                AbstractC88412b a = this.f189515f.mo129478d().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88392a.m153583a()).mo143254a(new C84814a(this), new C84815b(this));
                C89219l.m154716b(a, "");
                C88934a.m154195a(a, this.f189512c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerListMetaNewViewModel$b */
    static final class C84815b<T> implements AbstractC88433f<Throwable> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerListMetaNewViewModel f189517a;

        static {
            Covode.recordClassIndex(98794);
        }

        C84815b(InfoStickerListMetaNewViewModel infoStickerListMetaNewViewModel) {
            this.f189517a = infoStickerListMetaNewViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Throwable th) {
            this.f189517a.f189511b.setValue(EnumC85026a.ERROR);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerListMetaNewViewModel$a */
    static final class C84814a<T> implements AbstractC88433f<List<? extends AbstractC84456m>> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerListMetaNewViewModel f189516a;

        static {
            Covode.recordClassIndex(98793);
        }

        C84814a(InfoStickerListMetaNewViewModel infoStickerListMetaNewViewModel) {
            this.f189516a = infoStickerListMetaNewViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: androidx.lifecycle.t<java.util.List<com.ss.android.ugc.tools.h.a.m>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(List<? extends AbstractC84456m> list) {
            EnumC85026a aVar;
            List<? extends AbstractC84456m> list2 = list;
            this.f189516a.f189510a.setValue(list2);
            C1213t<EnumC85026a> tVar = this.f189516a.f189511b;
            if (list2.isEmpty()) {
                aVar = EnumC85026a.EMPTY;
            } else {
                aVar = EnumC85026a.NONE;
            }
            tVar.setValue(aVar);
        }
    }
}
