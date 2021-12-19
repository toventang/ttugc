package com.p2082ss.android.ugc.aweme.emoji.emojichoose;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.PagerAdapter;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46453g;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46454h;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.C46458a;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.C46462b;
import com.p2082ss.android.ugc.aweme.emoji.p2905h.C46535a;
import com.p2082ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.h */
public final class C46508h extends PagerAdapter {

    /* renamed from: a */
    public AbstractC46454h f108400a;

    /* renamed from: b */
    public AbstractC46453g f108401b;

    /* renamed from: c */
    private C46510i f108402c = new C46510i(1);

    /* renamed from: d */
    private SwipeControlledViewPager f108403d;

    static {
        Covode.recordClassIndex(55093);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        int i = 0;
        for (AbstractC46452f fVar : this.f108401b.mo78983a().f108434b) {
            i += fVar.mo78972g();
        }
        return i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final /* synthetic */ Object instantiateItem(final ViewGroup viewGroup, int i) {
        MethodCollector.m26663i(13174);
        C46510i iVar = this.f108402c;
        SwipeControlledViewPager swipeControlledViewPager = this.f108403d;
        AbstractC46453g gVar = this.f108401b;
        C465091 r12 = new AbstractC46519p() {
            /* class com.p2082ss.android.ugc.aweme.emoji.emojichoose.C46508h.C465091 */

            static {
                Covode.recordClassIndex(55094);
            }

            @Override // com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p
            /* renamed from: a */
            public final void mo79015a() {
                C46508h.this.f108400a.mo64586a();
            }

            @Override // com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p
            /* renamed from: c */
            public final void mo79019c() {
                C46508h.this.f108400a.mo64590b();
            }

            @Override // com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p
            /* renamed from: b */
            public final void mo79018b() {
                Context context = viewGroup.getContext();
                if (context != null) {
                    SmartRouter.buildRoute(context, "//emoji_manager").open();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p
            /* renamed from: a */
            public final void mo79017a(String str) {
                C46508h.this.f108400a.mo64589a(str, 1);
            }

            @Override // com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p
            /* renamed from: a */
            public final void mo79016a(View view, C46447a aVar, int i) {
                if (i == 4) {
                    C46508h.this.f108400a.mo64588a(aVar, i, ((C46462b) C46508h.this.f108401b.mo78983a().f108433a).f108240b.indexOf(aVar.f108224d));
                    return;
                }
                C46508h.this.f108400a.mo64588a(aVar, i, -1);
            }
        };
        C46514m a = gVar.mo78983a();
        AbstractC46452f b = a.mo79028b(i);
        if (b == null || !b.mo78974i()) {
            View a2 = C46510i.m89771a(viewGroup, new C46507g());
            MethodCollector.m26664o(13174);
            return a2;
        }
        if (b.mo78975j() == 3) {
            if (C46535a.f108508b == 0) {
                View a3 = C46510i.m89771a(viewGroup, new C46507g());
                MethodCollector.m26664o(13174);
                return a3;
            } else if (b.mo78976k() == 0) {
                if (iVar.f108407b == 1) {
                    View a4 = C46510i.m89771a(viewGroup, new C46503e(viewGroup.getContext().getString(R.string.bm_)));
                    MethodCollector.m26664o(13174);
                    return a4;
                } else if (iVar.f108407b == 0) {
                    View a5 = C46510i.m89771a(viewGroup, new C46486a());
                    MethodCollector.m26664o(13174);
                    return a5;
                }
            }
        }
        List<C46447a> c = a.mo79029c(i);
        int d = a.mo79030d(i);
        if (b.mo78975j() == 4) {
            if (C46458a.f108233a == 0) {
                View a6 = C46510i.m89771a(viewGroup, new C46507g());
                MethodCollector.m26664o(13174);
                return a6;
            } else if (d <= 0 && (C13603b.m24435a((Collection) c) || !c.get(0).mo78961a())) {
                View a7 = C46510i.m89771a(viewGroup, new C46503e(viewGroup.getContext().getString(R.string.bmb)));
                MethodCollector.m26664o(13174);
                return a7;
            }
        }
        String a8 = C1764a.m5928a(iVar.f108406a, new Object[]{b.mo78977l(), String.valueOf(d)});
        C46504f fVar = (C46504f) iVar.f108408c.remove(a8);
        if (fVar != null) {
            iVar.f108408c.put(a8, fVar);
            View view = fVar.f108388a;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            if (viewGroup.indexOfChild(view) < 0) {
                viewGroup.addView(view);
            }
            iVar.mo79021a(fVar, c, b, r12, swipeControlledViewPager, a, i);
            MethodCollector.m26664o(13174);
            return view;
        }
        C46504f fVar2 = new C46504f(viewGroup, b.mo78975j());
        iVar.f108408c.put(a8, fVar2);
        View view2 = fVar2.f108388a;
        if (viewGroup.indexOfChild(view2) < 0) {
            viewGroup.addView(view2);
        }
        iVar.mo79021a(fVar2, c, b, r12, swipeControlledViewPager, a, i);
        MethodCollector.m26664o(13174);
        return view2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        MethodCollector.m26663i(13172);
        viewGroup.removeView((View) obj);
        MethodCollector.m26664o(13172);
    }

    public C46508h(AbstractC46454h hVar, AbstractC46453g gVar, SwipeControlledViewPager swipeControlledViewPager) {
        this.f108400a = hVar;
        this.f108401b = gVar;
        this.f108403d = swipeControlledViewPager;
    }
}
