package com.p2082ss.android.ugc.tools.infosticker.view.internal.base;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20391d;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel */
public abstract class BaseInfoStickerStateViewModel<DATA> extends HumbleViewModel implements AbstractC84700k<DATA>, AbstractC84700k {

    /* renamed from: a */
    public final C1213t<Map<DATA, C89378p<EnumC84444c, Integer>>> f189128a = new C1213t<>();

    /* renamed from: b */
    public final C1213t<C20391d<List<DATA>>> f189129b = new C1213t<>();

    /* renamed from: c */
    public final C1213t<C20391d<List<DATA>>> f189130c = new C1213t<>();

    /* renamed from: d */
    private C88411a f189131d;

    static {
        Covode.recordClassIndex(98613);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AbstractC88979t<C20375am<DATA, EnumC84444c, Integer>> mo129568b(DATA data);

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k
    /* renamed from: j */
    public final LiveData<Map<DATA, C89378p<EnumC84444c, Integer>>> mo129569j() {
        return this.f189128a;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k
    /* renamed from: k */
    public final LiveData<C20391d<List<DATA>>> mo129570k() {
        return this.f189129b;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k
    /* renamed from: l */
    public final LiveData<C20391d<List<DATA>>> mo129571l() {
        return this.f189130c;
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public void onCleared() {
        C88411a aVar = this.f189131d;
        if (aVar != null) {
            aVar.dispose();
        }
        this.f189131d = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseInfoStickerStateViewModel(AbstractC1204m mVar) {
        super(mVar);
        C89219l.m154721d(mVar, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel$b */
    public static final class C84648b<T> implements AbstractC88433f<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseInfoStickerStateViewModel f189133a;

        /* renamed from: b */
        final /* synthetic */ Object f189134b;

        static {
            Covode.recordClassIndex(98615);
        }

        C84648b(BaseInfoStickerStateViewModel baseInfoStickerStateViewModel, Object obj) {
            this.f189133a = baseInfoStickerStateViewModel;
            this.f189134b = obj;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Throwable th) {
            Map<DATA, C89378p<EnumC84444c, Integer>> linkedHashMap;
            BaseInfoStickerStateViewModel baseInfoStickerStateViewModel = this.f189133a;
            Map<DATA, C89378p<EnumC84444c, Integer>> value = baseInfoStickerStateViewModel.f189128a.getValue();
            if (value != null) {
                linkedHashMap = C89041ag.m154431d(value);
            } else {
                linkedHashMap = new LinkedHashMap<>();
            }
            linkedHashMap.remove(this.f189134b);
            baseInfoStickerStateViewModel.f189128a.setValue(linkedHashMap);
            BaseInfoStickerStateViewModel.m145467a(this.f189133a.f189130c, this.f189134b);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k
    /* renamed from: a */
    public final void mo129567a(DATA data) {
        Map<DATA, C89378p<EnumC84444c, Integer>> linkedHashMap;
        if (!isDestroyed()) {
            Map<DATA, C89378p<EnumC84444c, Integer>> value = this.f189128a.getValue();
            if (value == null || !value.containsKey(data)) {
                Map<DATA, C89378p<EnumC84444c, Integer>> value2 = this.f189128a.getValue();
                if (value2 != null) {
                    linkedHashMap = C89041ag.m154431d(value2);
                } else {
                    linkedHashMap = new LinkedHashMap<>();
                }
                linkedHashMap.put(data, C89387v.m154943a(EnumC84444c.UNKNOWN, 0));
                this.f189128a.setValue(linkedHashMap);
                AbstractC88412b a = mo129568b(data).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88392a.m153583a()).mo143254a(new C84647a(this), new C84648b(this, data));
                C88411a aVar = this.f189131d;
                if (aVar == null) {
                    aVar = new C88411a();
                    this.f189131d = aVar;
                }
                aVar.mo142945a(a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel$a */
    public static final class C84647a<T> implements AbstractC88433f<C20375am<DATA, EnumC84444c, Integer>> {

        /* renamed from: a */
        final /* synthetic */ BaseInfoStickerStateViewModel f189132a;

        static {
            Covode.recordClassIndex(98614);
        }

        C84647a(BaseInfoStickerStateViewModel baseInfoStickerStateViewModel) {
            this.f189132a = baseInfoStickerStateViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Map<DATA, C89378p<EnumC84444c, Integer>> linkedHashMap;
            Map<DATA, C89378p<EnumC84444c, Integer>> linkedHashMap2;
            Map<DATA, C89378p<EnumC84444c, Integer>> linkedHashMap3;
            C20375am amVar = (C20375am) obj;
            A a = amVar.f48260a;
            B b = amVar.f48261b;
            C c = amVar.f48262c;
            int i = C84680d.f189192a[b.ordinal()];
            if (i == 1) {
                BaseInfoStickerStateViewModel baseInfoStickerStateViewModel = this.f189132a;
                Map<DATA, C89378p<EnumC84444c, Integer>> value = baseInfoStickerStateViewModel.f189128a.getValue();
                if (value != null) {
                    linkedHashMap = C89041ag.m154431d(value);
                } else {
                    linkedHashMap = new LinkedHashMap<>();
                }
                linkedHashMap.remove(a);
                baseInfoStickerStateViewModel.f189128a.setValue(linkedHashMap);
                BaseInfoStickerStateViewModel.m145467a(this.f189132a.f189129b, a);
            } else if (i != 2) {
                BaseInfoStickerStateViewModel baseInfoStickerStateViewModel2 = this.f189132a;
                Map<DATA, C89378p<EnumC84444c, Integer>> value2 = baseInfoStickerStateViewModel2.f189128a.getValue();
                if (value2 != null) {
                    linkedHashMap3 = C89041ag.m154431d(value2);
                } else {
                    linkedHashMap3 = new LinkedHashMap<>();
                }
                linkedHashMap3.put(a, C89387v.m154943a(b, c));
                baseInfoStickerStateViewModel2.f189128a.setValue(linkedHashMap3);
            } else {
                BaseInfoStickerStateViewModel baseInfoStickerStateViewModel3 = this.f189132a;
                Map<DATA, C89378p<EnumC84444c, Integer>> value3 = baseInfoStickerStateViewModel3.f189128a.getValue();
                if (value3 != null) {
                    linkedHashMap2 = C89041ag.m154431d(value3);
                } else {
                    linkedHashMap2 = new LinkedHashMap<>();
                }
                linkedHashMap2.remove(a);
                baseInfoStickerStateViewModel3.f189128a.setValue(linkedHashMap2);
                BaseInfoStickerStateViewModel.m145467a(this.f189132a.f189130c, a);
            }
        }
    }

    /* renamed from: a */
    public static void m145467a(C1213t<C20391d<List<DATA>>> tVar, DATA data) {
        List arrayList;
        List<DATA> a;
        C20391d<List<DATA>> value = tVar.getValue();
        if (value == null || (a = value.mo33723a()) == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = C89070n.m154585g((Collection) a);
        }
        arrayList.add(data);
        tVar.setValue(new C20391d<>(arrayList));
    }
}
