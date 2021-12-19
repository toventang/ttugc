package com.p2082ss.android.ugc.aweme.tools.beauty.p4095g;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77878d;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77974h;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77893a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78049b;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f;
import com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySwitchView;
import com.p2082ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.e */
public final class C77909e {

    /* renamed from: a */
    public final AbstractC77967m f174788a;

    /* renamed from: b */
    public final ComposerBeautyViewImpl f174789b;

    static {
        Covode.recordClassIndex(90998);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.e$f */
    public static final class C77915f implements AbstractC77893a.AbstractC77895b {

        /* renamed from: a */
        final /* synthetic */ C77909e f174796a;

        static {
            Covode.recordClassIndex(91004);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77893a.AbstractC77895b
        /* renamed from: a */
        public final void mo121546a() {
            this.f174796a.f174789b.getBeautyOnInteractListener();
            AbstractC78049b beautyBuried = this.f174796a.f174789b.getBeautyBuried();
            if (beautyBuried != null) {
                beautyBuried.mo121778a("confirm");
            }
            this.f174796a.mo121561b();
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77893a.AbstractC77895b
        /* renamed from: b */
        public final void mo121547b() {
            this.f174796a.f174789b.getBeautyOnInteractListener();
            AbstractC78049b beautyBuried = this.f174796a.f174789b.getBeautyBuried();
            if (beautyBuried != null) {
                beautyBuried.mo121778a("cancel");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C77915f(C77909e eVar) {
            this.f174796a = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.e$g */
    public static final class C77916g implements AbstractC77893a.AbstractC77895b {

        /* renamed from: a */
        final /* synthetic */ C77909e f174797a;

        static {
            Covode.recordClassIndex(91005);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77893a.AbstractC77895b
        /* renamed from: a */
        public final void mo121546a() {
            this.f174797a.f174789b.getBeautyOnInteractListener();
            AbstractC78049b beautyBuried = this.f174797a.f174789b.getBeautyBuried();
            if (beautyBuried != null) {
                beautyBuried.mo121778a("confirm");
            }
            this.f174797a.mo121561b();
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77893a.AbstractC77895b
        /* renamed from: b */
        public final void mo121547b() {
            this.f174797a.f174789b.getBeautyOnInteractListener();
            AbstractC78049b beautyBuried = this.f174797a.f174789b.getBeautyBuried();
            if (beautyBuried != null) {
                beautyBuried.mo121778a("cancel");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C77916g(C77909e eVar) {
            this.f174797a = eVar;
        }
    }

    /* renamed from: d */
    private final void m136050d() {
        T t;
        Iterator<T> it = this.f174788a.mo121584a().iterator();
        while (it.hasNext()) {
            for (T t2 : it.next().getBeautyList()) {
                boolean isCollectionType = t2.isCollectionType();
                if (isCollectionType) {
                    List<ComposerBeauty> childList = t2.getChildList();
                    if (childList != null) {
                        Iterator<T> it2 = childList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it2.next();
                            if (t.getSelected()) {
                                break;
                            }
                        }
                        T t3 = t;
                        if (t3 != null) {
                            this.f174788a.mo121606c(t3);
                        }
                    }
                } else if (!isCollectionType) {
                    this.f174788a.mo121606c(t2);
                    this.f174789b.getCategoryAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: c */
    private final void m136049c() {
        C77912c cVar = new C77912c(this);
        boolean z = this.f174789b.f175232r;
        T t = null;
        if (z) {
            Iterator<T> it = this.f174789b.getAlbumAdapter().f174570a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C89219l.m154714a((Object) next, (Object) this.f174789b.getCurSelectAlbumBeauty())) {
                    t = next;
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                cVar.mo121564a(t2);
            }
        } else if (!z) {
            Iterator<T> it2 = this.f174789b.getCategoryAdapter().f174570a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next2 = it2.next();
                if (C89219l.m154714a((Object) next2, (Object) this.f174789b.getCurSelectBeauty())) {
                    t = next2;
                    break;
                }
            }
            T t3 = t;
            if (t3 != null) {
                cVar.mo121564a(t3);
                int indexOf = this.f174789b.getCategoryAdapter().f174570a.indexOf(t3);
                if (indexOf >= 0 && indexOf < this.f174789b.getCategoryAdapter().f174570a.size()) {
                    this.f174789b.getCategoryAdapter().mo121443a(t3);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo121558a() {
        T t;
        C89233z.C89234a aVar = new C89233z.C89234a();
        aVar.element = true;
        List<BeautyCategory> a = this.f174788a.mo121584a();
        ArrayList arrayList = new ArrayList();
        for (T t2 : a) {
            if (t2.getBeautyCategoryExtra().getExclusive()) {
                arrayList.add(t2);
            }
        }
        Iterator it = arrayList.iterator();
        boolean z = true;
        while (true) {
            T t3 = null;
            if (!it.hasNext()) {
                break;
            }
            BeautyCategory beautyCategory = (BeautyCategory) it.next();
            Iterator<T> it2 = beautyCategory.getBeautyList().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next = it2.next();
                if (next.getExtra().getDefault()) {
                    t3 = next;
                    break;
                }
            }
            T t4 = t3;
            if (t4 != null) {
                if (t4.getSelected()) {
                }
            } else if (beautyCategory.getBeautyList().get(0).getSelected()) {
            }
            z = false;
        }
        Iterator<T> it3 = this.f174788a.mo121584a().iterator();
        while (it3.hasNext()) {
            List<ComposerBeauty> beautyList = it3.next().getBeautyList();
            ArrayList<ComposerBeauty> arrayList2 = new ArrayList();
            for (T t5 : beautyList) {
                if (t5.isCollectionType()) {
                    arrayList2.add(t5);
                }
            }
            for (ComposerBeauty composerBeauty : arrayList2) {
                List<ComposerBeauty> childList = composerBeauty.getChildList();
                if (childList != null) {
                    Iterator<T> it4 = childList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it4.next();
                        if (t.getExtra().getDefault()) {
                            break;
                        }
                    }
                    T t6 = t;
                    if (t6 != null) {
                        if (t6.getSelected()) {
                        }
                        z = false;
                    }
                }
                List<ComposerBeauty> childList2 = composerBeauty.getChildList();
                if (childList2 != null) {
                    ComposerBeauty composerBeauty2 = childList2.get(0);
                    if (composerBeauty2 != null) {
                        if (composerBeauty2.getSelected()) {
                        }
                        z = false;
                    }
                }
            }
        }
        C77910a aVar2 = new C77910a(this, aVar);
        Iterator<T> it5 = this.f174788a.mo121584a().iterator();
        while (it5.hasNext()) {
            for (T t7 : it5.next().getBeautyList()) {
                boolean isCollectionType = t7.isCollectionType();
                if (isCollectionType) {
                    List<ComposerBeauty> childList3 = t7.getChildList();
                    if (childList3 != null) {
                        Iterator<T> it6 = childList3.iterator();
                        while (it6.hasNext()) {
                            aVar2.mo121562a(it6.next());
                        }
                    }
                } else if (!isCollectionType) {
                    aVar2.mo121562a(t7);
                }
            }
        }
        if (!z || !aVar.element) {
            this.f174789b.getRlClearContainer().setAlpha(1.0f);
            this.f174789b.getRlClearContainer().setClickable(true);
            return;
        }
        this.f174789b.getRlClearContainer().setAlpha(0.5f);
        this.f174789b.getRlClearContainer().setClickable(false);
    }

    /* renamed from: b */
    public final void mo121561b() {
        boolean z;
        T t;
        boolean z2;
        T t2;
        T t3;
        C77913d dVar = new C77913d(this);
        Iterator<T> it = this.f174788a.mo121584a().iterator();
        while (it.hasNext()) {
            for (T t4 : it.next().getBeautyList()) {
                boolean isCollectionType = t4.isCollectionType();
                if (isCollectionType) {
                    List<ComposerBeauty> childList = t4.getChildList();
                    if (childList != null) {
                        Iterator<T> it2 = childList.iterator();
                        while (it2.hasNext()) {
                            dVar.mo121565a(it2.next());
                        }
                    }
                } else if (!isCollectionType) {
                    dVar.mo121565a(t4);
                }
            }
        }
        C77971n<BeautyComposerInfo> nVar = new C77971n();
        for (BeautyComposerInfo beautyComposerInfo : this.f174788a.mo121609d()) {
            nVar.add(beautyComposerInfo);
        }
        C77911b bVar = new C77911b(this);
        for (BeautyComposerInfo beautyComposerInfo2 : nVar) {
            String str = beautyComposerInfo2.f96062c;
            Iterator<T> it3 = this.f174788a.mo121584a().iterator();
            while (it3.hasNext()) {
                Iterator<T> it4 = it3.next().getBeautyList().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        t3 = null;
                        break;
                    }
                    t3 = it4.next();
                    if (C89219l.m154714a((Object) t3.getEffect().getEffectId(), (Object) str)) {
                        break;
                    }
                }
                T t5 = t3;
                if (t5 != null) {
                    bVar.mo121563a(t5);
                }
            }
        }
        List<BeautyCategory> a = this.f174788a.mo121584a();
        ArrayList<BeautyCategory> arrayList = new ArrayList();
        for (T t6 : a) {
            if (t6.getBeautyCategoryExtra().getExclusive()) {
                arrayList.add(t6);
            }
        }
        for (BeautyCategory beautyCategory : arrayList) {
            Iterator<T> it5 = beautyCategory.getBeautyList().iterator();
            while (true) {
                if (!it5.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it5.next();
                T t7 = t2;
                if (t7.getExtra().getDefault() && t7.getEnable()) {
                    break;
                }
            }
            T t8 = t2;
            if (t8 != null) {
                m136048a(t8, beautyCategory.getBeautyList());
                mo121559a(t8);
            } else {
                List<ComposerBeauty> beautyList = beautyCategory.getBeautyList();
                if (!(beautyList == null || beautyList.isEmpty() || beautyList == null)) {
                    m136048a(beautyList.get(0), beautyCategory.getBeautyList());
                    mo121559a(beautyList.get(0));
                }
            }
        }
        Iterator<T> it6 = this.f174788a.mo121584a().iterator();
        while (it6.hasNext()) {
            List<ComposerBeauty> beautyList2 = it6.next().getBeautyList();
            ArrayList<ComposerBeauty> arrayList2 = new ArrayList();
            for (T t9 : beautyList2) {
                if (t9.isCollectionType()) {
                    arrayList2.add(t9);
                }
            }
            for (ComposerBeauty composerBeauty : arrayList2) {
                List<ComposerBeauty> childList2 = composerBeauty.getChildList();
                if (childList2 != null) {
                    Iterator<T> it7 = childList2.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it7.next();
                        T t10 = t;
                        if (t10.getExtra().getDefault() && t10.getEnable()) {
                            break;
                        }
                    }
                    T t11 = t;
                    if (t11 != null) {
                        List<ComposerBeauty> childList3 = composerBeauty.getChildList();
                        if (childList3 != null) {
                            for (T t12 : childList3) {
                                if (!C89219l.m154714a((Object) t11, (Object) t12) || !t12.getEnable()) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                t12.setSelected(z2);
                            }
                        }
                        if (t11.getSelected()) {
                            this.f174788a.mo121616g(t11);
                            this.f174788a.mo121606c(t11);
                            this.f174789b.setCurSelectAlbumBeauty(t11);
                        }
                        bVar.mo121563a(t11);
                    }
                }
                List<ComposerBeauty> childList4 = composerBeauty.getChildList();
                if (childList4 != null && !childList4.isEmpty()) {
                    ComposerBeauty composerBeauty2 = childList4.get(0);
                    List<ComposerBeauty> childList5 = composerBeauty.getChildList();
                    if (childList5 != null) {
                        for (T t13 : childList5) {
                            if (!C89219l.m154714a((Object) composerBeauty2, (Object) t13) || !t13.getEnable()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            t13.setSelected(z);
                        }
                    }
                    if (composerBeauty2.getSelected()) {
                        this.f174788a.mo121616g(composerBeauty2);
                        this.f174788a.mo121606c(composerBeauty2);
                        this.f174789b.setCurSelectAlbumBeauty(composerBeauty2);
                    }
                    bVar.mo121563a(composerBeauty2);
                }
            }
        }
        m136049c();
        m136050d();
        mo121558a();
        ComposerBeautyViewImpl composerBeautyViewImpl = this.f174789b;
        if (composerBeautyViewImpl.f175200A.f174735m) {
            BeautySwitchView beautySwitchView = composerBeautyViewImpl.f175227m;
            C89219l.m154716b(beautySwitchView, "");
            if (!beautySwitchView.f175182b) {
                BeautySwitchView beautySwitchView2 = composerBeautyViewImpl.f175227m;
                C89219l.m154716b(beautySwitchView2, "");
                beautySwitchView2.setChecked(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.e$a */
    public static final class C77910a extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77909e f174790a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f174791b;

        static {
            Covode.recordClassIndex(90999);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77910a(C77909e eVar, C89233z.C89234a aVar) {
            super(1);
            this.f174790a = eVar;
            this.f174791b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            mo121562a(composerBeauty);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo121562a(ComposerBeauty composerBeauty) {
            C89219l.m154721d(composerBeauty, "");
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (!(items == null || items.isEmpty() || items == null)) {
                for (T t : items) {
                    if (C89241a.m154730a(this.f174790a.f174788a.mo121583a(composerBeauty, t.getTag(), (float) t.getValue()) * 100.0f) != t.getValue() * 100) {
                        this.f174791b.element = false;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.e$b */
    public static final class C77911b extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77909e f174792a;

        static {
            Covode.recordClassIndex(91000);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77911b(C77909e eVar) {
            super(1);
            this.f174792a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            mo121563a(composerBeauty);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo121563a(ComposerBeauty composerBeauty) {
            AbstractC78056f.AbstractC78057a beautyViewListener;
            C89219l.m154721d(composerBeauty, "");
            this.f174792a.mo121559a(composerBeauty);
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (!(items == null || items.isEmpty() || items == null)) {
                for (T t : items) {
                    if (this.f174792a.f174788a.mo121615g().mo121555a(composerBeauty) && C77878d.m136004f(composerBeauty) && (beautyViewListener = this.f174792a.f174789b.getBeautyViewListener()) != null) {
                        beautyViewListener.mo121548a(composerBeauty.getEffect().getUnzipPath(), t.getTag(), ((float) t.getValue()) / 100.0f);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.e$c */
    public static final class C77912c extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77909e f174793a;

        static {
            Covode.recordClassIndex(91001);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77912c(C77909e eVar) {
            super(1);
            this.f174793a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            mo121564a(composerBeauty);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo121564a(ComposerBeauty composerBeauty) {
            C89219l.m154721d(composerBeauty, "");
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (!(items == null || items.isEmpty() || items == null)) {
                for (T t : items) {
                    C77974h.C77975a b = C77974h.m136235b(new C77974h.C77975a(t.getDoubleDirection(), 100, 0, t.getMax(), t.getMin(), (float) t.getValue(), 0, 396));
                    this.f174793a.f174789b.getPbProgressBar().setPercent(b.f174916h);
                    composerBeauty.setProgressValue(b.f174916h);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.e$d */
    public static final class C77913d extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77909e f174794a;

        static {
            Covode.recordClassIndex(91002);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77913d(C77909e eVar) {
            super(1);
            this.f174794a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            mo121565a(composerBeauty);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo121565a(ComposerBeauty composerBeauty) {
            C89219l.m154721d(composerBeauty, "");
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (!(items == null || items.isEmpty() || items == null)) {
                for (T t : items) {
                    this.f174794a.f174788a.mo121602b(composerBeauty, t.getTag(), (float) t.getValue());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.e$e */
    public static final class C77914e extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77909e f174795a;

        static {
            Covode.recordClassIndex(91003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77914e(C77909e eVar) {
            super(1);
            this.f174795a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            mo121566a(composerBeauty);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo121566a(ComposerBeauty composerBeauty) {
            AbstractC78056f.AbstractC78057a beautyViewListener;
            C89219l.m154721d(composerBeauty, "");
            this.f174795a.mo121559a(composerBeauty);
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (!(items == null || items.isEmpty() || items == null)) {
                for (T t : items) {
                    C77974h.C77975a b = C77974h.m136235b(new C77974h.C77975a(t.getDoubleDirection(), 100, 0, t.getMax(), t.getMin(), (float) t.getValue(), 0, 396));
                    this.f174795a.f174789b.getPbProgressBar().setPercent(b.f174916h);
                    this.f174795a.f174788a.mo121602b(composerBeauty, t.getTag(), (float) t.getValue());
                    if (this.f174795a.f174788a.mo121615g().mo121555a(composerBeauty) && C77878d.m136004f(composerBeauty) && (beautyViewListener = this.f174795a.f174789b.getBeautyViewListener()) != null) {
                        beautyViewListener.mo121548a(composerBeauty.getEffect().getUnzipPath(), t.getTag(), ((float) t.getValue()) / 100.0f);
                    }
                    composerBeauty.setProgressValue(b.f174916h);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.e$h */
    public static final class C77917h implements AbstractC77967m.AbstractC77970c {

        /* renamed from: a */
        final /* synthetic */ C77909e f174798a;

        static {
            Covode.recordClassIndex(91006);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C77917h(C77909e eVar) {
            this.f174798a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m.AbstractC77970c
        /* renamed from: a */
        public final void mo121567a(List<BeautyComposerInfo> list) {
            C89219l.m154721d(list, "");
            AbstractC78056f.AbstractC78057a beautyViewListener = this.f174798a.f174789b.getBeautyViewListener();
            if (beautyViewListener != null) {
                beautyViewListener.mo121549a(list, 10000);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m.AbstractC77970c
        /* renamed from: a */
        public final void mo121568a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2) {
            C89219l.m154721d(list, "");
            C89219l.m154721d(list2, "");
            AbstractC78056f.AbstractC78057a beautyViewListener = this.f174798a.f174789b.getBeautyViewListener();
            if (beautyViewListener != null) {
                beautyViewListener.mo121550a(list, list2, 10000);
            }
        }
    }

    /* renamed from: a */
    public final void mo121559a(ComposerBeauty composerBeauty) {
        this.f174788a.mo121587a(composerBeauty, new C77917h(this));
    }

    /* renamed from: a */
    public final void mo121560a(boolean z) {
        T t;
        Iterator<T> it = this.f174788a.mo121584a().iterator();
        while (it.hasNext()) {
            for (T t2 : it.next().getBeautyList()) {
                boolean isCollectionType = t2.isCollectionType();
                if (isCollectionType) {
                    List<ComposerBeauty> childList = t2.getChildList();
                    if (childList != null) {
                        Iterator<T> it2 = childList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it2.next();
                            if (t.getSelected()) {
                                break;
                            }
                        }
                        T t3 = t;
                        if (t3 != null) {
                            this.f174788a.mo121588a((ComposerBeauty) t3, z);
                        }
                    }
                } else if (!isCollectionType) {
                    this.f174788a.mo121588a((ComposerBeauty) t2, z);
                    this.f174789b.getCategoryAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    public C77909e(AbstractC77967m mVar, ComposerBeautyViewImpl composerBeautyViewImpl) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(composerBeautyViewImpl, "");
        this.f174788a = mVar;
        this.f174789b = composerBeautyViewImpl;
    }

    /* renamed from: a */
    private final void m136048a(ComposerBeauty composerBeauty, List<ComposerBeauty> list) {
        String str;
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (!C89219l.m154714a((Object) composerBeauty, (Object) next) || !composerBeauty.getEnable()) {
                z = false;
            }
            next.setSelected(z);
        }
        String categoryId = composerBeauty.getCategoryId();
        ComposerBeauty curSelectBeauty = this.f174789b.getCurSelectBeauty();
        if (curSelectBeauty != null) {
            str = curSelectBeauty.getCategoryId();
        } else {
            str = null;
        }
        if (C89219l.m154714a((Object) categoryId, (Object) str)) {
            if (composerBeauty.getExtra().isNone() || !composerBeauty.getEnable()) {
                this.f174789b.mo121912b(false);
            } else {
                this.f174789b.mo121912b(true);
            }
            this.f174789b.setCurSelectBeauty(composerBeauty);
        }
        if (composerBeauty.getSelected()) {
            this.f174788a.mo121614f(composerBeauty);
            this.f174788a.mo121606c(composerBeauty);
            this.f174789b.getCategoryAdapter().notifyDataSetChanged();
        }
    }
}
