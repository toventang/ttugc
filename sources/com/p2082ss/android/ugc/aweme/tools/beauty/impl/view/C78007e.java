package com.p2082ss.android.ugc.aweme.tools.beauty.impl.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.p2082ss.android.ugc.aweme.dependence.beauty.C41093a;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77878d;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77974h;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77871b;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77971n;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f;
import com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.e */
public final class C78007e {

    /* renamed from: a */
    public final AbstractC77967m f174993a;

    /* renamed from: b */
    public AbstractC78056f.AbstractC78057a f174994b;

    /* renamed from: c */
    public AbstractC78056f.AbstractC78058b f174995c;

    /* renamed from: d */
    public C78012g f174996d;

    static {
        Covode.recordClassIndex(91097);
    }

    /* renamed from: b */
    public final boolean mo121711b() {
        AbstractC77871b bVar = (AbstractC77871b) this.f174996d.mo121716a(AbstractC77871b.class);
        if (bVar != null) {
            return bVar.mo121475c();
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo121712c() {
        AbstractC77871b bVar = (AbstractC77871b) this.f174996d.mo121716a(AbstractC77871b.class);
        if (bVar != null) {
            return bVar.mo121476d();
        }
        return false;
    }

    /* renamed from: d */
    public final ComposerBeauty mo121713d() {
        boolean z;
        AbstractC77872c cVar = (AbstractC77872c) this.f174996d.mo121716a(AbstractC77872c.class);
        AbstractC77872c cVar2 = (AbstractC77872c) this.f174996d.mo121716a(AbstractC77872c.class);
        if (cVar2 != null) {
            z = cVar2.mo121482a();
        } else {
            z = false;
        }
        if (z) {
            if (cVar != null) {
                return cVar.mo121485c();
            }
            return null;
        } else if (cVar != null) {
            return cVar.mo121483b();
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo121710a() {
        ComposerBeauty b;
        ComposerBeautyExtraBeautify beautifyExtra;
        List<ComposerBeautyExtraBeautify.ItemsBean> items;
        AbstractC77872c cVar = (AbstractC77872c) this.f174996d.mo121716a(AbstractC77872c.class);
        if (cVar == null) {
            return false;
        }
        if (cVar.mo121482a()) {
            b = cVar.mo121485c();
        } else {
            b = cVar.mo121483b();
        }
        if (b == null || (beautifyExtra = b.getBeautifyExtra()) == null || (items = beautifyExtra.getItems()) == null || items.size() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.e$a */
    public static final class C78008a implements AbstractC77967m.AbstractC77970c {

        /* renamed from: a */
        final /* synthetic */ C78007e f174997a;

        static {
            Covode.recordClassIndex(91098);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78008a(C78007e eVar) {
            this.f174997a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m.AbstractC77970c
        /* renamed from: a */
        public final void mo121567a(List<BeautyComposerInfo> list) {
            AbstractC78056f.AbstractC78057a aVar;
            C89219l.m154721d(list, "");
            if ((!this.f174997a.mo121712c() || this.f174997a.mo121711b()) && (aVar = this.f174997a.f174994b) != null) {
                aVar.mo121549a(list, 10000);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m.AbstractC77970c
        /* renamed from: a */
        public final void mo121568a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2) {
            AbstractC78056f.AbstractC78057a aVar;
            C89219l.m154721d(list, "");
            C89219l.m154721d(list2, "");
            if ((!this.f174997a.mo121712c() || this.f174997a.mo121711b()) && (aVar = this.f174997a.f174994b) != null) {
                aVar.mo121550a(list, list2, 10000);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.e$b */
    public static final class C78009b implements AbstractC77967m.AbstractC77970c {

        /* renamed from: a */
        final /* synthetic */ C78007e f174998a;

        static {
            Covode.recordClassIndex(91099);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78009b(C78007e eVar) {
            this.f174998a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m.AbstractC77970c
        /* renamed from: a */
        public final void mo121567a(List<BeautyComposerInfo> list) {
            AbstractC78056f.AbstractC78057a aVar;
            C89219l.m154721d(list, "");
            if ((!this.f174998a.mo121712c() || this.f174998a.mo121711b()) && (aVar = this.f174998a.f174994b) != null) {
                aVar.mo121549a(list, 10000);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m.AbstractC77970c
        /* renamed from: a */
        public final void mo121568a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2) {
            AbstractC78056f.AbstractC78057a aVar;
            C89219l.m154721d(list, "");
            C89219l.m154721d(list2, "");
            if ((!this.f174998a.mo121712c() || this.f174998a.mo121711b()) && (aVar = this.f174998a.f174994b) != null) {
                aVar.mo121550a(list, list2, 10000);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.e$c */
    static final class C78010c extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C78007e f174999a;

        /* renamed from: b */
        final /* synthetic */ int f175000b;

        /* renamed from: c */
        final /* synthetic */ int f175001c;

        static {
            Covode.recordClassIndex(91100);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78010c(C78007e eVar, int i, int i2) {
            super(1);
            this.f174999a = eVar;
            this.f175000b = i;
            this.f175001c = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            mo121714a(composerBeauty);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo121714a(ComposerBeauty composerBeauty) {
            C89219l.m154721d(composerBeauty, "");
            composerBeauty.setProgressValue(this.f175000b);
            boolean a = this.f174999a.f174993a.mo121615g().mo121555a(composerBeauty);
            boolean f = C77878d.m136004f(composerBeauty);
            if (!a || !f) {
                C41093a.m82762a("update composer error, beautyAvailable:" + a + ",canUpdateComposerNode:" + f + ',' + "effectId:" + composerBeauty.getEffect().getEffectId() + ",name:" + composerBeauty.getEffect().getName() + ",id:" + composerBeauty.getEffect().getId());
                return;
            }
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (!(items == null || items.isEmpty() || items == null)) {
                for (T t : items) {
                    float a2 = C77974h.m136234a(new C77974h.C77975a(t.getDoubleDirection(), this.f175001c, 0, t.getMax(), t.getMin(), 0.0f, this.f175000b, 332));
                    AbstractC78056f.AbstractC78057a aVar = this.f174999a.f174994b;
                    if (aVar != null) {
                        aVar.mo121548a(composerBeauty.getEffect().getUnzipPath(), t.getTag(), a2 / 100.0f);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static List<String> m136292a(ComposerBeauty composerBeauty) {
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (items == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getTag());
        }
        return arrayList;
    }

    /* renamed from: a */
    public final float mo121708a(ComposerBeauty composerBeauty, String str, float f) {
        C89219l.m154721d(composerBeauty, "");
        return this.f174993a.mo121583a(composerBeauty, str, f);
    }

    public C78007e(AbstractC77967m mVar, AbstractC78056f.AbstractC78057a aVar, AbstractC78056f.AbstractC78058b bVar, C78012g gVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(gVar, "");
        this.f174993a = mVar;
        this.f174994b = aVar;
        this.f174995c = bVar;
        this.f174996d = gVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo121709a(int i, BeautySeekBar beautySeekBar, boolean z, HashMap<BeautySeekBar, ComposerBeautyExtraBeautify.ItemsBean> hashMap, ComposerBeauty composerBeauty) {
        ComposerBeautyExtraBeautify.ItemsBean itemsBean;
        if (!z) {
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (items != null && !items.isEmpty() && items != null) {
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    m136293a(composerBeauty, it.next(), beautySeekBar, i, composerBeauty);
                }
                return;
            }
            return;
        }
        List<ComposerBeautyExtraBeautify.ItemsBean> items2 = composerBeauty.getBeautifyExtra().getItems();
        if (items2 != null && items2.size() >= 2 && (itemsBean = hashMap.get(beautySeekBar)) != null) {
            C89219l.m154716b(itemsBean, "");
            m136293a(composerBeauty, itemsBean, beautySeekBar, i, composerBeauty);
        }
    }

    /* renamed from: a */
    private final void m136293a(ComposerBeauty composerBeauty, ComposerBeautyExtraBeautify.ItemsBean itemsBean, BeautySeekBar beautySeekBar, int i, ComposerBeauty composerBeauty2) {
        C77971n<BeautyComposerInfo> nVar;
        float a = C77974h.m136234a(new C77974h.C77975a(itemsBean.getDoubleDirection(), beautySeekBar.getMaxPercent(), 0, itemsBean.getMax(), itemsBean.getMin(), 0.0f, i, 332));
        this.f174993a.mo121602b(composerBeauty2, itemsBean.getTag(), a);
        C77971n<BeautyComposerInfo> d = this.f174993a.mo121609d();
        float f = a / 100.0f;
        String str = composerBeauty.getEffect().getUnzipPath() + ':' + itemsBean.getTag() + ':' + f;
        String extra = composerBeauty.getEffect().getExtra();
        String str2 = "";
        if (extra == null) {
            extra = str2;
        }
        d.add(new BeautyComposerInfo(str, extra, composerBeauty.getEffect().getEffectId()));
        if (C77878d.m135999b(composerBeauty)) {
            this.f174993a.mo121616g(composerBeauty2);
            this.f174993a.mo121626l(composerBeauty2);
        } else {
            this.f174993a.mo121614f(composerBeauty2);
            this.f174993a.mo121624k(composerBeauty2);
        }
        BeautyCategoryExtra categoryExtra = composerBeauty2.getCategoryExtra();
        if (categoryExtra != null && (!C89219l.m154714a((Object) categoryExtra.getParentId(), (Object) "null")) && (nVar = this.f174993a.mo121611e().get(composerBeauty2.getCategoryExtra().getCategoryId())) != null) {
            String str3 = composerBeauty.getEffect().getUnzipPath() + ':' + itemsBean.getTag() + ':' + f;
            String extra2 = composerBeauty.getEffect().getExtra();
            if (extra2 != null) {
                str2 = extra2;
            }
            nVar.add(new BeautyComposerInfo(str3, str2, composerBeauty.getEffect().getEffectId()));
        }
    }
}
