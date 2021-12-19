package com.p2082ss.android.ugc.aweme.tools.beauty.impl.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77878d;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77974h;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4084a.C77818a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77861e;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77862f;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77874e;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.d */
public final class C77991d {

    /* renamed from: a */
    public AbstractC77967m f174968a;

    /* renamed from: b */
    public AbstractC78056f.AbstractC78057a f174969b;

    /* renamed from: c */
    public AbstractC78056f.AbstractC78058b f174970c;

    /* renamed from: d */
    public C77988a f174971d;

    /* renamed from: e */
    public C78012g f174972e;

    /* renamed from: f */
    public C77861e f174973f;

    static {
        Covode.recordClassIndex(91081);
    }

    /* renamed from: c */
    public final void mo121695c() {
        this.f174971d.mo121675a("cancel");
    }

    /* renamed from: b */
    public final void mo121693b() {
        this.f174971d.mo121675a("confirm");
        AbstractC77872c cVar = (AbstractC77872c) this.f174972e.mo121716a(AbstractC77872c.class);
        if (cVar != null) {
            cVar.mo121492i();
        }
    }

    /* renamed from: g */
    public final void mo121699g() {
        C77818a d;
        AbstractC77872c cVar = (AbstractC77872c) this.f174972e.mo121716a(AbstractC77872c.class);
        if (cVar != null && (d = cVar.mo121487d()) != null) {
            d.notifyDataSetChanged();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.d$m */
    static final class C78004m extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeauty f174989a;

        /* renamed from: b */
        final /* synthetic */ C78005n f174990b;

        static {
            Covode.recordClassIndex(91094);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78004m(ComposerBeauty composerBeauty, C78005n nVar) {
            super(0);
            this.f174989a = composerBeauty;
            this.f174990b = nVar;
        }

        /* renamed from: a */
        public final C89391z invoke() {
            boolean isCollectionType = this.f174989a.isCollectionType();
            if (isCollectionType) {
                List<ComposerBeauty> childList = this.f174989a.getChildList();
                if (childList == null) {
                    return null;
                }
                Iterator<T> it = childList.iterator();
                while (it.hasNext()) {
                    this.f174990b.mo121707a(it.next());
                }
                return C89391z.f203057a;
            } else if (!isCollectionType) {
                this.f174990b.mo121707a(this.f174989a);
                return C89391z.f203057a;
            } else {
                throw new C89376n();
            }
        }
    }

    /* renamed from: i */
    private final boolean m136268i() {
        C89233z.C89234a aVar = new C89233z.C89234a();
        aVar.element = true;
        C77992a aVar2 = new C77992a(aVar);
        for (T t : this.f174968a.mo121584a()) {
            this.f174968a.mo121599a((BeautyCategory) t);
            aVar2.mo121700a(t.getBeautyList());
        }
        return aVar.element;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.d$e */
    static final class C77996e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeauty f174979a;

        /* renamed from: b */
        final /* synthetic */ C77991d f174980b;

        static {
            Covode.recordClassIndex(91086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77996e(ComposerBeauty composerBeauty, C77991d dVar) {
            super(0);
            this.f174979a = composerBeauty;
            this.f174980b = dVar;
        }

        /* renamed from: a */
        public final C89391z invoke() {
            T t;
            boolean isCollectionType = this.f174979a.isCollectionType();
            if (isCollectionType) {
                List<ComposerBeauty> childList = this.f174979a.getChildList();
                if (childList != null) {
                    Iterator<T> it = childList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (t.getSelected()) {
                            break;
                        }
                    }
                    T t2 = t;
                    if (t2 != null) {
                        this.f174980b.f174968a.mo121606c(t2);
                        return C89391z.f203057a;
                    }
                }
                return null;
            } else if (!isCollectionType) {
                this.f174980b.f174968a.mo121606c(this.f174979a);
                this.f174980b.mo121699g();
                return C89391z.f203057a;
            } else {
                throw new C89376n();
            }
        }
    }

    /* renamed from: h */
    private final boolean m136267h() {
        Iterator<T> it = this.f174968a.mo121584a().iterator();
        boolean z = true;
        while (it.hasNext()) {
            for (T t : it.next().getBeautyList()) {
                if (t.isBeautyMode()) {
                    C89219l.m154721d(t, "");
                    List<ComposerBeauty> childList = t.getChildList();
                    if (childList != null) {
                        Iterator<T> it2 = childList.iterator();
                        boolean z2 = true;
                        while (it2.hasNext()) {
                            if (!m136266c(it2.next())) {
                                z2 = false;
                            }
                        }
                        if (z2) {
                        }
                    }
                } else if (m136266c(t)) {
                }
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo121696d() {
        C77995d dVar = new C77995d(this);
        for (T t : this.f174968a.mo121584a()) {
            this.f174968a.mo121599a((BeautyCategory) t);
            List<ComposerBeauty> beautyList = t.getBeautyList();
            ArrayList<ComposerBeauty> arrayList = new ArrayList();
            for (T t2 : beautyList) {
                if (t2.isCollectionType()) {
                    arrayList.add(t2);
                }
            }
            for (ComposerBeauty composerBeauty : arrayList) {
                dVar.mo121703a(composerBeauty);
            }
        }
    }

    /* renamed from: e */
    public final void mo121697e() {
        Iterator<T> it = this.f174968a.mo121584a().iterator();
        while (it.hasNext()) {
            for (T t : it.next().getBeautyList()) {
                C77996e eVar = new C77996e(t, this);
                if (t.isBeautyMode()) {
                    List<ComposerBeauty> childList = t.getChildList();
                    if (childList != null) {
                        Iterator<T> it2 = childList.iterator();
                        while (it2.hasNext()) {
                            it2.next();
                            eVar.invoke();
                        }
                    }
                } else {
                    eVar.invoke();
                }
            }
        }
    }

    /* renamed from: f */
    public final boolean mo121698f() {
        boolean z;
        boolean z2;
        C89233z.C89234a aVar = new C89233z.C89234a();
        aVar.element = true;
        C77993b bVar = new C77993b(aVar);
        List<BeautyCategory> a = this.f174968a.mo121584a();
        ArrayList<BeautyCategory> arrayList = new ArrayList();
        for (T t : a) {
            T t2 = t;
            if (!t2.getBeautyCategoryExtra().getExclusive()) {
                this.f174968a.mo121599a((BeautyCategory) t2);
            } else {
                arrayList.add(t);
            }
        }
        for (BeautyCategory beautyCategory : arrayList) {
            this.f174968a.mo121599a(beautyCategory);
            bVar.mo121701a(beautyCategory.getBeautyList());
        }
        if (!aVar.element || !m136268i()) {
            z = false;
        } else {
            z = true;
        }
        boolean h = m136267h();
        AbstractC77872c cVar = (AbstractC77872c) this.f174972e.mo121716a(AbstractC77872c.class);
        if (cVar != null) {
            z2 = cVar.mo121491h();
        } else {
            z2 = true;
        }
        if (!z || !h || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo121690a() {
        Boolean bool;
        C77818a aVar;
        T t;
        C77818a aVar2;
        C77818a aVar3;
        ComposerBeauty composerBeauty;
        C77818a aVar4;
        ComposerBeauty composerBeauty2;
        AbstractC77872c cVar = (AbstractC77872c) this.f174972e.mo121716a(AbstractC77872c.class);
        C77997f fVar = new C77997f(this);
        C77818a aVar5 = null;
        if (cVar != null) {
            bool = Boolean.valueOf(cVar.mo121482a());
        } else {
            bool = null;
        }
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            if (cVar != null) {
                aVar4 = cVar.mo121488e();
            } else {
                aVar4 = null;
            }
            Iterator<T> it = aVar4.f174570a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (cVar != null) {
                    composerBeauty2 = cVar.mo121485c();
                } else {
                    composerBeauty2 = null;
                }
                if (C89219l.m154714a((Object) next, (Object) composerBeauty2)) {
                    aVar5 = next;
                    break;
                }
            }
            ComposerBeauty composerBeauty3 = (ComposerBeauty) aVar5;
            if (composerBeauty3 != null) {
                fVar.mo121705a(composerBeauty3);
            }
        } else if (C89219l.m154714a((Object) bool, (Object) false)) {
            if (cVar != null) {
                aVar = cVar.mo121487d();
            } else {
                aVar = null;
            }
            Iterator<T> it2 = aVar.f174570a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    t = null;
                    break;
                }
                t = it2.next();
                if (cVar != null) {
                    composerBeauty = cVar.mo121483b();
                } else {
                    composerBeauty = null;
                }
                if (C89219l.m154714a((Object) t, (Object) composerBeauty)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                fVar.mo121705a(t2);
                if (cVar != null) {
                    aVar2 = cVar.mo121487d();
                } else {
                    aVar2 = null;
                }
                int indexOf = aVar2.f174570a.indexOf(t2);
                if (indexOf >= 0) {
                    if (cVar != null) {
                        aVar3 = cVar.mo121487d();
                    } else {
                        aVar3 = null;
                    }
                    if (indexOf < aVar3.f174570a.size()) {
                        if (cVar != null) {
                            aVar5 = cVar.mo121487d();
                        }
                        aVar5.mo121443a(t2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.d$a */
    public static final class C77992a extends AbstractC89220m implements AbstractC89172b<List<? extends ComposerBeauty>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f174974a;

        static {
            Covode.recordClassIndex(91082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77992a(C89233z.C89234a aVar) {
            super(1);
            this.f174974a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends ComposerBeauty> list) {
            mo121700a(list);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo121700a(List<ComposerBeauty> list) {
            ComposerBeauty composerBeauty;
            T t;
            C89219l.m154721d(list, "");
            ArrayList<ComposerBeauty> arrayList = new ArrayList();
            for (T t2 : list) {
                T t3 = t2;
                if (t3.isCollectionType() && t3.getEnable()) {
                    arrayList.add(t2);
                }
            }
            for (ComposerBeauty composerBeauty2 : arrayList) {
                List<ComposerBeauty> childList = composerBeauty2.getChildList();
                if (childList != null) {
                    Iterator<T> it = childList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (t.getExtra().getDefault()) {
                            break;
                        }
                    }
                    T t4 = t;
                    if (t4 != null) {
                        if (!t4.getSelected()) {
                            this.f174974a.element = false;
                        }
                    }
                }
                List<ComposerBeauty> childList2 = composerBeauty2.getChildList();
                if (!(childList2 == null || (composerBeauty = (ComposerBeauty) C89070n.m154583g((List) childList2)) == null || composerBeauty.getSelected())) {
                    this.f174974a.element = false;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.d$b */
    static final class C77993b extends AbstractC89220m implements AbstractC89172b<List<? extends ComposerBeauty>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f174975a;

        static {
            Covode.recordClassIndex(91083);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77993b(C89233z.C89234a aVar) {
            super(1);
            this.f174975a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends ComposerBeauty> list) {
            mo121701a(list);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo121701a(List<ComposerBeauty> list) {
            T t;
            C89219l.m154721d(list, "");
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t.getExtra().getDefault()) {
                    break;
                }
            }
            T t2 = t;
            if (t2 == null) {
                ComposerBeauty composerBeauty = (ComposerBeauty) C89070n.m154583g((List) list);
                if (composerBeauty != null && !composerBeauty.getSelected()) {
                    this.f174975a.element = false;
                }
            } else if (!t2.getSelected()) {
                this.f174975a.element = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.d$c */
    public static final class C77994c extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77991d f174976a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f174977b;

        static {
            Covode.recordClassIndex(91084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77994c(C77991d dVar, C89233z.C89234a aVar) {
            super(1);
            this.f174976a = dVar;
            this.f174977b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            mo121702a(composerBeauty);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo121702a(ComposerBeauty composerBeauty) {
            C89219l.m154721d(composerBeauty, "");
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (!(items == null || items.isEmpty() || items == null)) {
                for (T t : items) {
                    if (C89241a.m154730a(this.f174976a.f174968a.mo121583a(composerBeauty, t.getTag(), this.f174976a.mo121689a(Integer.valueOf(t.getValue())).floatValue()) * 100.0f) != this.f174976a.mo121689a(Integer.valueOf(t.getValue() * 100)).intValue()) {
                        this.f174977b.element = false;
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.d$d */
    static final class C77995d extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77991d f174978a;

        static {
            Covode.recordClassIndex(91085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77995d(C77991d dVar) {
            super(1);
            this.f174978a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            mo121703a(composerBeauty);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo121703a(ComposerBeauty composerBeauty) {
            boolean z;
            T t;
            boolean z2;
            C89219l.m154721d(composerBeauty, "");
            List<ComposerBeauty> childList = composerBeauty.getChildList();
            if (childList != null) {
                Iterator<T> it = childList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    T t2 = t;
                    if (t2.getExtra().getDefault() && t2.getEnable()) {
                        break;
                    }
                }
                T t3 = t;
                if (t3 != null) {
                    List<ComposerBeauty> childList2 = composerBeauty.getChildList();
                    if (childList2 != null) {
                        for (T t4 : childList2) {
                            if (!C89219l.m154714a((Object) t3, (Object) t4) || !t4.getEnable()) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            t4.setSelected(z2);
                        }
                    }
                    if (t3.getSelected()) {
                        this.f174978a.f174968a.mo121616g(t3);
                        this.f174978a.f174968a.mo121626l(t3);
                        this.f174978a.f174968a.mo121606c(t3);
                        this.f174978a.mo121691a((ComposerBeauty) t3);
                    }
                    this.f174978a.mo121692a(t3, null);
                    return;
                }
            }
            List<ComposerBeauty> childList3 = composerBeauty.getChildList();
            if (!(childList3 == null || childList3.isEmpty())) {
                ComposerBeauty composerBeauty2 = childList3.get(0);
                List<ComposerBeauty> childList4 = composerBeauty.getChildList();
                if (childList4 != null) {
                    for (T t5 : childList4) {
                        if (!C89219l.m154714a((Object) composerBeauty2, (Object) t5) || !t5.getEnable()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        t5.setSelected(z);
                    }
                }
                if (composerBeauty2.getSelected()) {
                    this.f174978a.f174968a.mo121616g(composerBeauty2);
                    this.f174978a.f174968a.mo121626l(composerBeauty2);
                    this.f174978a.f174968a.mo121606c(composerBeauty2);
                    this.f174978a.mo121691a(composerBeauty2);
                }
                this.f174978a.mo121692a(composerBeauty2, null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.d$f */
    static final class C77997f extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77991d f174981a;

        static {
            Covode.recordClassIndex(91087);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77997f(C77991d dVar) {
            super(1);
            this.f174981a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            mo121705a(composerBeauty);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo121705a(ComposerBeauty composerBeauty) {
            C89219l.m154721d(composerBeauty, "");
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (!(items == null || items.isEmpty() || items == null)) {
                for (T t : items) {
                    C77974h.C77975a b = C77974h.m136235b(new C77974h.C77975a(t.getDoubleDirection(), 100, 0, t.getMax(), t.getMin(), (float) t.getValue(), 0, 396));
                    AbstractC77874e eVar = (AbstractC77874e) this.f174981a.f174972e.mo121716a(AbstractC77874e.class);
                    int intValue = this.f174981a.mo121689a(Integer.valueOf(b.f174916h)).intValue();
                    if (eVar != null) {
                        eVar.mo121499a(intValue);
                    }
                    composerBeauty.setProgressValue(intValue);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.d$n */
    public static final class C78005n extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77991d f174991a;

        static {
            Covode.recordClassIndex(91095);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78005n(C77991d dVar) {
            super(1);
            this.f174991a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            mo121707a(composerBeauty);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo121707a(ComposerBeauty composerBeauty) {
            C89219l.m154721d(composerBeauty, "");
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (!(items == null || items.isEmpty() || items == null)) {
                for (T t : items) {
                    this.f174991a.f174968a.mo121602b(composerBeauty, t.getTag(), this.f174991a.mo121689a(Integer.valueOf(t.getValue())).floatValue());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.d$o */
    public static final class C78006o implements AbstractC77967m.AbstractC77970c {

        /* renamed from: a */
        final /* synthetic */ C77991d f174992a;

        static {
            Covode.recordClassIndex(91096);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78006o(C77991d dVar) {
            this.f174992a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m.AbstractC77970c
        /* renamed from: a */
        public final void mo121567a(List<BeautyComposerInfo> list) {
            C89219l.m154721d(list, "");
            AbstractC78056f.AbstractC78057a aVar = this.f174992a.f174969b;
            if (aVar != null) {
                aVar.mo121549a(list, 10000);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m.AbstractC77970c
        /* renamed from: a */
        public final void mo121568a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2) {
            C89219l.m154721d(list, "");
            C89219l.m154721d(list2, "");
            AbstractC78056f.AbstractC78057a aVar = this.f174992a.f174969b;
            if (aVar != null) {
                aVar.mo121550a(list, list2, 10000);
            }
        }
    }

    /* renamed from: b */
    public final void mo121694b(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        this.f174968a.mo121587a(composerBeauty, new C78006o(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.d$h */
    static final class C77999h extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77991d f174983a;

        static {
            Covode.recordClassIndex(91089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77999h(C77991d dVar) {
            super(1);
            this.f174983a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            C89219l.m154721d(composerBeauty2, "");
            this.f174983a.mo121692a(composerBeauty2, Float.valueOf(0.0f));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.d$i */
    static final class C78000i extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77991d f174984a;

        static {
            Covode.recordClassIndex(91090);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78000i(C77991d dVar) {
            super(1);
            this.f174984a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            C89219l.m154721d(composerBeauty2, "");
            this.f174984a.f174968a.mo121606c(composerBeauty2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.d$k */
    static final class C78002k extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Map.Entry f174986a;

        /* renamed from: b */
        final /* synthetic */ C77991d f174987b;

        static {
            Covode.recordClassIndex(91092);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78002k(Map.Entry entry, C77991d dVar) {
            super(1);
            this.f174986a = entry;
            this.f174987b = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            C89219l.m154721d(composerBeauty2, "");
            this.f174987b.mo121692a(composerBeauty2, (Float) this.f174986a.getValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final Number mo121689a(Number number) {
        C77862f fVar;
        C77861e eVar = this.f174973f;
        if (eVar == null || (fVar = eVar.f174694f) == null || !fVar.f174699d) {
            return number;
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.d$g */
    static final class C77998g extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77991d f174982a;

        static {
            Covode.recordClassIndex(91088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77998g(C77991d dVar) {
            super(1);
            this.f174982a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            C89219l.m154721d(composerBeauty2, "");
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty2.getBeautifyExtra().getItems();
            if (items != null) {
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    this.f174982a.f174968a.mo121602b(composerBeauty2, it.next().getTag(), 0.0f);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    private final boolean m136266c(ComposerBeauty composerBeauty) {
        C89233z.C89234a aVar = new C89233z.C89234a();
        aVar.element = true;
        C77994c cVar = new C77994c(this, aVar);
        boolean isCollectionType = composerBeauty.isCollectionType();
        if (isCollectionType) {
            List<ComposerBeauty> childList = composerBeauty.getChildList();
            if (childList != null) {
                Iterator<T> it = childList.iterator();
                while (it.hasNext()) {
                    cVar.mo121702a(it.next());
                }
            }
        } else if (!isCollectionType) {
            cVar.mo121702a(composerBeauty);
        }
        return aVar.element;
    }

    /* renamed from: a */
    public final void mo121691a(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        AbstractC77872c cVar = (AbstractC77872c) this.f174972e.mo121716a(AbstractC77872c.class);
        if (cVar != null) {
            cVar.mo121484b(composerBeauty);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.d$j */
    static final class C78001j extends AbstractC89220m implements AbstractC89183m<ComposerBeauty, AbstractC89172b<? super ComposerBeauty, ? extends C89391z>, C89391z> {

        /* renamed from: a */
        public static final C78001j f174985a = new C78001j();

        static {
            Covode.recordClassIndex(91091);
        }

        C78001j() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty, AbstractC89172b<? super ComposerBeauty, ? extends C89391z> bVar) {
            m136286a(composerBeauty, bVar);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public static void m136286a(ComposerBeauty composerBeauty, AbstractC89172b<? super ComposerBeauty, C89391z> bVar) {
            C89219l.m154721d(composerBeauty, "");
            C89219l.m154721d(bVar, "");
            if (composerBeauty.isCollectionType()) {
                List<ComposerBeauty> childList = composerBeauty.getChildList();
                if (childList != null) {
                    Iterator<T> it = childList.iterator();
                    while (it.hasNext()) {
                        bVar.invoke(it.next());
                    }
                    return;
                }
                return;
            }
            bVar.invoke(composerBeauty);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.d$l */
    static final class C78003l extends AbstractC89220m implements AbstractC89183m<ComposerBeauty, AbstractC89172b<? super ComposerBeauty, ? extends C89391z>, C89391z> {

        /* renamed from: a */
        public static final C78003l f174988a = new C78003l();

        static {
            Covode.recordClassIndex(91093);
        }

        C78003l() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty, AbstractC89172b<? super ComposerBeauty, ? extends C89391z> bVar) {
            m136287a(composerBeauty, bVar);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public static void m136287a(ComposerBeauty composerBeauty, AbstractC89172b<? super ComposerBeauty, C89391z> bVar) {
            C89219l.m154721d(composerBeauty, "");
            C89219l.m154721d(bVar, "");
            if (composerBeauty.isCollectionType()) {
                List<ComposerBeauty> childList = composerBeauty.getChildList();
                if (childList != null) {
                    for (T t : childList) {
                        if (t.getSelected()) {
                            if (t != null) {
                                bVar.invoke(t);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            bVar.invoke(composerBeauty);
        }
    }

    /* renamed from: a */
    public final void mo121692a(ComposerBeauty composerBeauty, Float f) {
        float floatValue;
        C89219l.m154721d(composerBeauty, "");
        mo121694b(composerBeauty);
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (!(items == null || items.isEmpty() || items == null)) {
            for (T t : items) {
                if (this.f174968a.mo121615g().mo121555a(composerBeauty) && C77878d.m136004f(composerBeauty)) {
                    if (f != null) {
                        floatValue = f.floatValue();
                    } else {
                        floatValue = mo121689a(Integer.valueOf(t.getValue())).floatValue();
                    }
                    AbstractC78056f.AbstractC78057a aVar = this.f174969b;
                    if (aVar != null) {
                        aVar.mo121548a(composerBeauty.getEffect().getUnzipPath(), t.getTag(), floatValue / 100.0f);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m136265a(C77991d dVar, ComposerBeauty composerBeauty, List list) {
        String str;
        C77818a d;
        ComposerBeauty b;
        C89219l.m154721d(composerBeauty, "");
        C89219l.m154721d(list, "");
        AbstractC77872c cVar = (AbstractC77872c) dVar.f174972e.mo121716a(AbstractC77872c.class);
        AbstractC77874e eVar = (AbstractC77874e) dVar.f174972e.mo121716a(AbstractC77874e.class);
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            ComposerBeauty composerBeauty2 = (ComposerBeauty) it.next();
            if (!C89219l.m154714a(composerBeauty, composerBeauty2) || !composerBeauty.getEnable()) {
                z = false;
            }
            composerBeauty2.setSelected(z);
        }
        String categoryId = composerBeauty.getCategoryId();
        if (cVar == null || (b = cVar.mo121483b()) == null) {
            str = null;
        } else {
            str = b.getCategoryId();
        }
        if (C89219l.m154714a((Object) categoryId, (Object) str)) {
            if (composerBeauty.getExtra().isNone() || !composerBeauty.getEnable()) {
                if (eVar != null) {
                    eVar.mo121501a(false);
                }
            } else if (eVar != null) {
                eVar.mo121501a(true);
            }
            if (cVar != null) {
                cVar.mo121479a(composerBeauty);
            }
        }
        if (composerBeauty.getSelected()) {
            dVar.f174968a.mo121614f(composerBeauty);
            dVar.f174968a.mo121624k(composerBeauty);
            dVar.f174968a.mo121606c(composerBeauty);
            if (cVar != null && (d = cVar.mo121487d()) != null) {
                d.notifyDataSetChanged();
            }
        }
    }

    public C77991d(AbstractC77967m mVar, AbstractC78056f.AbstractC78057a aVar, AbstractC78056f.AbstractC78058b bVar, C77988a aVar2, C78012g gVar, C77861e eVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(gVar, "");
        this.f174968a = mVar;
        this.f174969b = aVar;
        this.f174970c = bVar;
        this.f174971d = aVar2;
        this.f174972e = gVar;
        this.f174973f = eVar;
    }
}
