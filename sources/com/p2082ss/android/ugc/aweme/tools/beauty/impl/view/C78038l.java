package com.p2082ss.android.ugc.aweme.tools.beauty.impl.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.p032a.C0637f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77974h;
import com.p2082ss.android.ugc.aweme.tools.beauty.impl.view.C78007e;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4084a.C77818a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77861e;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77864g;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77871b;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77873d;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77874e;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f;
import com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.l */
public final class C78038l implements AbstractC77874e {

    /* renamed from: a */
    public final HashMap<BeautySeekBar, ComposerBeautyExtraBeautify.ItemsBean> f175067a = new HashMap<>();

    /* renamed from: b */
    public final Context f175068b;

    /* renamed from: c */
    public final View f175069c;

    /* renamed from: d */
    public final C77861e f175070d;

    /* renamed from: e */
    public final C78007e f175071e;

    /* renamed from: f */
    private final LinearLayout f175072f;

    /* renamed from: g */
    private final BeautySeekBar f175073g;

    /* renamed from: h */
    private final BeautySeekBar f175074h;

    /* renamed from: i */
    private final TextView f175075i;

    /* renamed from: j */
    private final TextView f175076j;

    static {
        Covode.recordClassIndex(91128);
    }

    /* renamed from: b */
    public final boolean mo121735b() {
        if (!this.f175071e.mo121710a() || !this.f175070d.f174732j) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.l$a */
    public static final class C78039a implements BeautySeekBar.AbstractC78062c {

        /* renamed from: a */
        final /* synthetic */ C78038l f175077a;

        /* renamed from: b */
        final /* synthetic */ BeautySeekBar f175078b;

        static {
            Covode.recordClassIndex(91129);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.AbstractC78062c
        /* renamed from: a */
        public final void mo121572a() {
            String str;
            C78038l lVar = this.f175077a;
            BeautySeekBar beautySeekBar = this.f175078b;
            C78007e eVar = lVar.f175071e;
            boolean b = lVar.mo121735b();
            ComposerBeautyExtraBeautify.ItemsBean itemsBean = lVar.f175067a.get(beautySeekBar);
            if (itemsBean == null || (str = itemsBean.getTag()) == null) {
                str = "";
            }
            List<String> a = C89070n.m154516a(str);
            C89219l.m154721d(a, "");
            ComposerBeauty d = eVar.mo121713d();
            if (d != null) {
                if (b) {
                    AbstractC78056f.AbstractC78058b bVar = eVar.f174995c;
                    if (bVar != null) {
                        bVar.mo22667a(d, a);
                    }
                } else {
                    AbstractC78056f.AbstractC78058b bVar2 = eVar.f174995c;
                    if (bVar2 != null) {
                        bVar2.mo22667a(d, C78007e.m136292a(d));
                    }
                }
            }
            C78038l lVar2 = this.f175077a;
            ComposerBeauty d2 = lVar2.f175071e.mo121713d();
            if (d2 != null) {
                lVar2.mo121500a(d2, true, false);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.AbstractC78062c
        /* renamed from: a */
        public final void mo121573a(int i) {
            String str;
            Boolean bool;
            AbstractC78056f.AbstractC78058b bVar;
            BeautySeekBar beautySeekBar = this.f175078b;
            C77864g gVar = this.f175077a.f175070d.f174692d;
            int percent = beautySeekBar.getPercent();
            if (gVar.f174701a) {
                int suggestPercent = beautySeekBar.getSuggestPercent();
                int i2 = suggestPercent - gVar.f174702b;
                if (i2 < beautySeekBar.getMinPercent()) {
                    i2 = beautySeekBar.getMinPercent();
                }
                int i3 = gVar.f174702b + suggestPercent;
                if (i3 > beautySeekBar.getMaxPercent()) {
                    i3 = beautySeekBar.getMaxPercent();
                }
                if (i2 <= percent && i3 >= percent) {
                    beautySeekBar.setPercent(suggestPercent);
                    percent = suggestPercent;
                }
            }
            C78038l lVar = this.f175077a;
            BeautySeekBar beautySeekBar2 = this.f175078b;
            C78007e eVar = lVar.f175071e;
            ComposerBeautyExtraBeautify.ItemsBean itemsBean = lVar.f175067a.get(beautySeekBar2);
            if (itemsBean == null || (str = itemsBean.getTag()) == null) {
                str = "";
            }
            List<String> a = C89070n.m154516a(str);
            C89219l.m154721d(a, "");
            ComposerBeauty d = eVar.mo121713d();
            if (!(d == null || (bVar = eVar.f174995c) == null)) {
                bVar.mo22670b(d, a);
            }
            C78007e eVar2 = this.f175077a.f175071e;
            int maxPercent = this.f175078b.getMaxPercent();
            AbstractC77872c cVar = (AbstractC77872c) eVar2.f174996d.mo121716a(AbstractC77872c.class);
            C78007e.C78010c cVar2 = new C78007e.C78010c(eVar2, percent, maxPercent);
            T t = null;
            if (cVar != null) {
                bool = Boolean.valueOf(cVar.mo121482a());
            } else {
                bool = null;
            }
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                Iterator<T> it = cVar.mo121488e().f174570a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (C89219l.m154714a((Object) next, (Object) cVar.mo121485c())) {
                        t = next;
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    cVar2.mo121714a(t2);
                }
            } else if (C89219l.m154714a((Object) bool, (Object) false)) {
                Iterator<T> it2 = cVar.mo121487d().f174570a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next2 = it2.next();
                    if (C89219l.m154714a((Object) next2, (Object) cVar.mo121483b())) {
                        t = next2;
                        break;
                    }
                }
                T t3 = t;
                if (t3 != null) {
                    cVar2.mo121714a(t3);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.AbstractC78062c
        /* renamed from: b */
        public final void mo121574b(int i) {
            String str;
            Boolean bool;
            C77818a d;
            C78038l lVar = this.f175077a;
            BeautySeekBar beautySeekBar = this.f175078b;
            C78007e eVar = lVar.f175071e;
            boolean b = lVar.mo121735b();
            ComposerBeautyExtraBeautify.ItemsBean itemsBean = lVar.f175067a.get(beautySeekBar);
            if (itemsBean == null || (str = itemsBean.getTag()) == null) {
                str = "";
            }
            List<String> a = C89070n.m154516a(str);
            C89219l.m154721d(a, "");
            ComposerBeauty d2 = eVar.mo121713d();
            if (d2 != null) {
                if (b) {
                    AbstractC78056f.AbstractC78058b bVar = eVar.f174995c;
                    if (bVar != null) {
                        bVar.mo22666a(d2, i, a);
                    }
                } else {
                    AbstractC78056f.AbstractC78058b bVar2 = eVar.f174995c;
                    if (bVar2 != null) {
                        bVar2.mo22666a(d2, i, C78007e.m136292a(d2));
                    }
                }
            }
            C78007e eVar2 = this.f175077a.f175071e;
            BeautySeekBar beautySeekBar2 = this.f175078b;
            boolean b2 = this.f175077a.mo121735b();
            HashMap<BeautySeekBar, ComposerBeautyExtraBeautify.ItemsBean> hashMap = this.f175077a.f175067a;
            C89219l.m154721d(beautySeekBar2, "");
            C89219l.m154721d(hashMap, "");
            AbstractC77872c cVar = (AbstractC77872c) eVar2.f174996d.mo121716a(AbstractC77872c.class);
            T t = null;
            if (cVar != null) {
                bool = Boolean.valueOf(cVar.mo121482a());
            } else {
                bool = null;
            }
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                Iterator<T> it = cVar.mo121488e().f174570a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (C89219l.m154714a((Object) next, (Object) cVar.mo121485c())) {
                        t = next;
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    eVar2.mo121709a(i, beautySeekBar2, b2, hashMap, t2);
                    eVar2.f174993a.mo121606c(t2);
                }
            } else if (C89219l.m154714a((Object) bool, (Object) false)) {
                Iterator<T> it2 = cVar.mo121487d().f174570a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next2 = it2.next();
                    if (C89219l.m154714a((Object) next2, (Object) cVar.mo121483b())) {
                        t = next2;
                        break;
                    }
                }
                T t3 = t;
                if (t3 != null) {
                    eVar2.mo121709a(i, beautySeekBar2, b2, hashMap, t3);
                    eVar2.f174993a.mo121606c(t3);
                    int indexOf = cVar.mo121487d().f174570a.indexOf(t3);
                    if (indexOf >= 0 && indexOf < cVar.mo121487d().f174570a.size()) {
                        cVar.mo121487d().mo121443a(t3);
                    }
                }
            }
            AbstractC77871b bVar3 = (AbstractC77871b) eVar2.f174996d.mo121716a(AbstractC77871b.class);
            if (bVar3 != null) {
                bVar3.mo121477e();
            }
            AbstractC77873d dVar = (AbstractC77873d) eVar2.f174996d.mo121716a(AbstractC77873d.class);
            if (dVar != null) {
                dVar.mo121497b();
            }
            if (cVar != null && (d = cVar.mo121487d()) != null) {
                d.mo121446b(false);
                d.notifyDataSetChanged();
            }
        }

        C78039a(C78038l lVar, BeautySeekBar beautySeekBar) {
            this.f175077a = lVar;
            this.f175078b = beautySeekBar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77874e
    /* renamed from: a */
    public final void mo121498a() {
        BeautySeekBar beautySeekBar = this.f175073g;
        C89219l.m154716b(beautySeekBar, "");
        m136351a(beautySeekBar);
        BeautySeekBar beautySeekBar2 = this.f175074h;
        C89219l.m154716b(beautySeekBar2, "");
        m136351a(beautySeekBar2);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77874e
    /* renamed from: a */
    public final void mo121499a(int i) {
        this.f175073g.setPercent(i);
    }

    /* renamed from: a */
    private final void m136351a(BeautySeekBar beautySeekBar) {
        m136352a(beautySeekBar, this.f175070d.f174692d);
        beautySeekBar.setOnLevelChangeListener(new C78039a(this, beautySeekBar));
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77874e
    /* renamed from: a */
    public final void mo121501a(boolean z) {
        if (z) {
            this.f175072f.setVisibility(0);
            if (mo121735b()) {
                BeautySeekBar beautySeekBar = this.f175074h;
                C89219l.m154716b(beautySeekBar, "");
                beautySeekBar.setVisibility(0);
                return;
            }
            BeautySeekBar beautySeekBar2 = this.f175074h;
            C89219l.m154716b(beautySeekBar2, "");
            beautySeekBar2.setVisibility(8);
            return;
        }
        this.f175072f.setVisibility(8);
    }

    /* renamed from: a */
    private static float m136349a(Context context, float f) {
        Resources resources = context.getResources();
        C89219l.m154716b(resources, "");
        return TypedValue.applyDimension(2, f, resources.getDisplayMetrics());
    }

    /* renamed from: a */
    private static void m136350a(ComposerBeautyExtraBeautify.ItemsBean itemsBean, BeautySeekBar beautySeekBar) {
        C77974h.C77975a b = C77974h.m136235b(new C77974h.C77975a(itemsBean.getDoubleDirection(), 100, 0, itemsBean.getMax(), itemsBean.getMin(), (float) itemsBean.getValue(), 0, 396));
        m136353a(itemsBean.getDoubleDirection(), b.f174916h, beautySeekBar);
        beautySeekBar.setSuggestPercent(b.f174916h);
    }

    /* renamed from: a */
    private final void m136352a(BeautySeekBar beautySeekBar, C77864g gVar) {
        beautySeekBar.mo121790a(C0637f.m2349b(this.f175069c.getResources(), gVar.f174703c, this.f175068b.getTheme()), C0637f.m2349b(this.f175069c.getResources(), gVar.f174704d, this.f175068b.getTheme()), C0637f.m2349b(this.f175069c.getResources(), gVar.f174705e, this.f175068b.getTheme()));
        beautySeekBar.setDefaultCircleConfig(gVar.f174706f);
        beautySeekBar.setSuggestCircleColor(gVar.f174707g);
        Context context = beautySeekBar.getContext();
        C89219l.m154716b(context, "");
        beautySeekBar.setBarHeight(C84912r.m145930a(context, gVar.f174708h));
        Context context2 = beautySeekBar.getContext();
        C89219l.m154716b(context2, "");
        beautySeekBar.setTextSize(m136349a(context2, gVar.f174709i));
        Context context3 = beautySeekBar.getContext();
        C89219l.m154716b(context3, "");
        beautySeekBar.setBarPadding(C84912r.m145930a(context3, gVar.f174710j));
    }

    /* renamed from: a */
    private static void m136353a(boolean z, int i, BeautySeekBar beautySeekBar) {
        if (z || i != 0) {
            beautySeekBar.setNeedShowSuggestCircle(true);
        } else {
            beautySeekBar.setNeedShowSuggestCircle(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77874e
    /* renamed from: a */
    public final void mo121500a(ComposerBeauty composerBeauty, boolean z, boolean z2) {
        List<ComposerBeautyExtraBeautify.ItemsBean> items;
        ComposerBeautyExtraBeautify.ItemsBean itemsBean;
        C89219l.m154721d(composerBeauty, "");
        if (z) {
            if (composerBeauty.isBeautyMode()) {
                C78007e eVar = this.f175071e;
                C89219l.m154721d(composerBeauty, "");
                AbstractC77967m mVar = eVar.f174993a;
                new C78007e.C78009b(eVar);
                mVar.mo121586a(composerBeauty);
            } else {
                C78007e eVar2 = this.f175071e;
                C89219l.m154721d(composerBeauty, "");
                eVar2.f174993a.mo121587a(composerBeauty, new C78007e.C78008a(eVar2));
            }
        }
        if (z2) {
            List<ComposerBeautyExtraBeautify.ItemsBean> items2 = composerBeauty.getBeautifyExtra().getItems();
            if (items2 != null && (!items2.isEmpty())) {
                C77974h.C77975a b = C77974h.m136235b(new C77974h.C77975a(items2.get(0).getDoubleDirection(), 100, 0, items2.get(0).getMax(), items2.get(0).getMin(), this.f175071e.mo121708a(composerBeauty, items2.get(0).getTag(), (float) items2.get(0).getValue()), 0, 396));
                if (items2.get(0).getDoubleDirection()) {
                    this.f175073g.mo121791a(50, -50, false);
                } else {
                    this.f175073g.mo121791a(100, 0, true);
                }
                this.f175073g.setPercent(b.f174916h);
                if (!this.f175070d.f174732j || items2.get(0).getName().length() <= 0) {
                    this.f175075i.setVisibility(8);
                } else {
                    this.f175075i.setVisibility(0);
                    this.f175075i.setText(items2.get(0).getName());
                }
                this.f175076j.setVisibility(8);
                List<ComposerBeautyExtraBeautify.ItemsBean> items3 = composerBeauty.getBeautifyExtra().getItems();
                if (!(items3 == null || (itemsBean = (ComposerBeautyExtraBeautify.ItemsBean) C89070n.m154579f((List) items3)) == null)) {
                    BeautySeekBar beautySeekBar = this.f175073g;
                    C89219l.m154716b(beautySeekBar, "");
                    m136350a(itemsBean, beautySeekBar);
                }
            }
            if (mo121735b() && (items = composerBeauty.getBeautifyExtra().getItems()) != null && items.size() >= 2) {
                C77974h.C77975a b2 = C77974h.m136235b(new C77974h.C77975a(items.get(1).getDoubleDirection(), 100, 0, items.get(1).getMax(), items.get(1).getMin(), this.f175071e.mo121708a(composerBeauty, items.get(1).getTag(), (float) items.get(1).getValue()), 0, 396));
                if (items.get(1).getDoubleDirection()) {
                    this.f175074h.mo121791a(50, -50, false);
                } else {
                    this.f175074h.mo121791a(100, 0, true);
                }
                this.f175074h.setPercent(b2.f174916h);
                if (!this.f175070d.f174732j || items.get(1).getName().length() <= 0) {
                    this.f175076j.setVisibility(8);
                } else {
                    this.f175076j.setVisibility(0);
                    this.f175076j.setText(items.get(1).getName());
                }
                BeautySeekBar beautySeekBar2 = this.f175074h;
                C89219l.m154716b(beautySeekBar2, "");
                m136350a(items.get(1), beautySeekBar2);
                HashMap<BeautySeekBar, ComposerBeautyExtraBeautify.ItemsBean> hashMap = this.f175067a;
                BeautySeekBar beautySeekBar3 = this.f175073g;
                C89219l.m154716b(beautySeekBar3, "");
                hashMap.put(beautySeekBar3, items.get(0));
                HashMap<BeautySeekBar, ComposerBeautyExtraBeautify.ItemsBean> hashMap2 = this.f175067a;
                BeautySeekBar beautySeekBar4 = this.f175074h;
                C89219l.m154716b(beautySeekBar4, "");
                hashMap2.put(beautySeekBar4, items.get(1));
            }
        }
    }

    public C78038l(Context context, View view, C77861e eVar, C78007e eVar2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(eVar2, "");
        this.f175068b = context;
        this.f175069c = view;
        this.f175070d = eVar;
        this.f175071e = eVar2;
        View findViewById = view.findViewById(R.id.dl2);
        C89219l.m154716b(findViewById, "");
        this.f175072f = (LinearLayout) findViewById;
        this.f175073g = (BeautySeekBar) view.findViewById(R.id.czz);
        this.f175074h = (BeautySeekBar) view.findViewById(R.id.d00);
        View findViewById2 = view.findViewById(R.id.f3g);
        C89219l.m154716b(findViewById2, "");
        this.f175075i = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f3h);
        C89219l.m154716b(findViewById3, "");
        this.f175076j = (TextView) findViewById3;
    }
}
