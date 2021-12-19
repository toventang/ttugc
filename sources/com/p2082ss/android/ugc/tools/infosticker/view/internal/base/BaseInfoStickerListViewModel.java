package com.p2082ss.android.ugc.tools.infosticker.view.internal.base;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84456m;
import com.p2082ss.android.ugc.tools.view.base.HumbleViewModel;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel */
public abstract class BaseInfoStickerListViewModel<DATA> extends HumbleViewModel implements AbstractC84693e<DATA>, AbstractC84693e {

    /* renamed from: a */
    public final C1213t<List<DATA>> f189120a;

    /* renamed from: b */
    public final C1213t<EnumC85026a> f189121b = new C1213t<>();

    /* renamed from: c */
    public final C1213t<EnumC85026a> f189122c;

    /* renamed from: d */
    private C88411a f189123d;

    static {
        Covode.recordClassIndex(98608);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: e */
    public LiveData<Object> mo129562e() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract AbstractC88403ab<List<DATA>> mo129565h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract AbstractC88403ab<List<DATA>> mo129566i();

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: b */
    public final LiveData<List<DATA>> mo129559b() {
        return this.f189120a;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: c */
    public final LiveData<EnumC85026a> mo129560c() {
        return this.f189121b;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: d */
    public LiveData<EnumC85026a> mo129561d() {
        return this.f189122c;
    }

    /* renamed from: a */
    private C88411a mo129555a() {
        C88411a aVar = this.f189123d;
        if (aVar != null) {
            return aVar;
        }
        C88411a aVar2 = new C88411a();
        this.f189123d = aVar2;
        return aVar2;
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public void onCleared() {
        C88411a aVar = this.f189123d;
        if (aVar != null) {
            aVar.dispose();
        }
        this.f189123d = null;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: f */
    public final void mo129563f() {
        if (!isDestroyed()) {
            EnumC85026a value = this.f189121b.getValue();
            if (value == null || !(value == EnumC85026a.EMPTY || value == EnumC85026a.LOADING)) {
                List<DATA> value2 = this.f189120a.getValue();
                if (value2 != null) {
                    C89219l.m154716b(value2, "");
                    if (true ^ value2.isEmpty()) {
                        return;
                    }
                }
                this.f189121b.setValue(EnumC85026a.LOADING);
                mo129555a().mo142945a(mo129565h().mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88392a.m153583a()).mo142915a(new C84643a(this), new C84644b(this)));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: g */
    public final void mo129564g() {
        if (!isDestroyed()) {
            EnumC85026a value = this.f189121b.getValue();
            if (value == null || value == EnumC85026a.NONE) {
                List<DATA> value2 = this.f189120a.getValue();
                if (value2 == null || !value2.isEmpty()) {
                    EnumC85026a value3 = this.f189122c.getValue();
                    if (value3 == null || !(value3 == EnumC85026a.EMPTY || value3 == EnumC85026a.LOADING)) {
                        this.f189122c.setValue(EnumC85026a.LOADING);
                        mo129555a().mo142945a(mo129566i().mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88392a.m153583a()).mo142915a(new C84645c(this), new C84646d(this)));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel$b */
    public static final class C84644b<T> implements AbstractC88433f<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseInfoStickerListViewModel f189125a;

        static {
            Covode.recordClassIndex(98610);
        }

        C84644b(BaseInfoStickerListViewModel baseInfoStickerListViewModel) {
            this.f189125a = baseInfoStickerListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Throwable th) {
            this.f189125a.f189121b.setValue(EnumC85026a.ERROR);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel$d */
    public static final class C84646d<T> implements AbstractC88433f<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseInfoStickerListViewModel f189127a;

        static {
            Covode.recordClassIndex(98612);
        }

        C84646d(BaseInfoStickerListViewModel baseInfoStickerListViewModel) {
            this.f189127a = baseInfoStickerListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Throwable th) {
            this.f189127a.f189122c.setValue(EnumC85026a.ERROR);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel$a */
    public static final class C84643a<T> implements AbstractC88433f<List<? extends DATA>> {

        /* renamed from: a */
        final /* synthetic */ BaseInfoStickerListViewModel f189124a;

        static {
            Covode.recordClassIndex(98609);
        }

        C84643a(BaseInfoStickerListViewModel baseInfoStickerListViewModel) {
            this.f189124a = baseInfoStickerListViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            EnumC85026a aVar;
            List<DATA> list = (List) obj;
            this.f189124a.f189120a.setValue(list);
            C1213t<EnumC85026a> tVar = this.f189124a.f189121b;
            if (list.isEmpty()) {
                aVar = EnumC85026a.EMPTY;
            } else {
                aVar = EnumC85026a.NONE;
            }
            tVar.setValue(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: a */
    public void mo129558a(AbstractC84456m mVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(mVar, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel$c */
    public static final class C84645c<T> implements AbstractC88433f<List<? extends DATA>> {

        /* renamed from: a */
        final /* synthetic */ BaseInfoStickerListViewModel f189126a;

        static {
            Covode.recordClassIndex(98611);
        }

        C84645c(BaseInfoStickerListViewModel baseInfoStickerListViewModel) {
            this.f189126a = baseInfoStickerListViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<DATA> arrayList;
            EnumC85026a aVar;
            List list = (List) obj;
            C1213t<List<DATA>> tVar = this.f189126a.f189120a;
            List<DATA> value = this.f189126a.f189120a.getValue();
            if (value != null) {
                arrayList = C89070n.m154585g((Collection) value);
            } else {
                arrayList = new ArrayList<>();
            }
            C89219l.m154716b(list, "");
            arrayList.addAll(list);
            tVar.setValue(arrayList);
            C1213t<EnumC85026a> tVar2 = this.f189126a.f189122c;
            if (list.isEmpty()) {
                aVar = EnumC85026a.EMPTY;
            } else {
                aVar = EnumC85026a.NONE;
            }
            tVar2.setValue(aVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseInfoStickerListViewModel(AbstractC1204m mVar) {
        super(mVar);
        C89219l.m154721d(mVar, "");
        C1213t<List<DATA>> tVar = new C1213t<>();
        this.f189120a = tVar;
        C1213t<EnumC85026a> tVar2 = new C1213t<>();
        this.f189122c = tVar2;
        tVar.setValue(C89086z.INSTANCE);
        tVar2.setValue(EnumC85026a.NONE);
    }
}
