package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3108b.p3110b.p3111a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1204m;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.AbstractC46467a;
import com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.C46472c;
import com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.C46477d;
import com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.SwipeControlledRecycleView;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46518o;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.C46486a;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.C46507g;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.C46517n;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.C46458a;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.p2900a.C46460b;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.p2905h.C46535a;
import com.p2082ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.InputViewDelegate;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3108b.p3110b.p3112b.C54101a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.a.a */
public final class C54092a extends PagerAdapter {

    /* renamed from: a */
    public final InputViewDelegate f123954a;

    /* renamed from: b */
    public final AbstractC54142b f123955b;

    /* renamed from: c */
    private final HashMap<Integer, C46472c> f123956c = new LinkedHashMap();

    /* renamed from: d */
    private final SwipeControlledViewPager f123957d;

    /* renamed from: e */
    private final C54101a f123958e;

    static {
        Covode.recordClassIndex(63769);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        C89219l.m154721d(obj, "");
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(obj, "");
        return view == obj;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.a.a$a */
    public static final class C54093a implements AbstractC46519p {

        /* renamed from: a */
        final /* synthetic */ C54092a f123959a;

        static {
            Covode.recordClassIndex(63770);
        }

        @Override // com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p
        /* renamed from: b */
        public final void mo79018b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p
        /* renamed from: c */
        public final void mo79019c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p
        /* renamed from: a */
        public final void mo79015a() {
            this.f123959a.f123955b.mo91226l();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54093a(C54092a aVar) {
            this.f123959a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p
        /* renamed from: a */
        public final void mo79017a(String str) {
            C89219l.m154721d(str, "");
            this.f123959a.f123955b.mo91212a(str);
        }

        @Override // com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p
        /* renamed from: a */
        public final void mo79016a(View view, C46447a aVar, int i) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(aVar, "");
            C46534a aVar2 = aVar.f108224d;
            C89219l.m154716b(aVar2, "");
            C46460b.m89694a(aVar2);
            this.f123959a.f123954a.mo91243a(aVar);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        C46517n nVar = this.f123958e.f123973e;
        if (nVar.f108450b == null) {
            return 0;
        }
        return nVar.f108450b.size();
    }

    /* renamed from: a */
    private static <T extends AbstractC46518o> View m99277a(ViewGroup viewGroup, T t) {
        MethodCollector.m26663i(4493);
        View a = t.mo79002a(viewGroup);
        C89219l.m154716b(a, "");
        if (viewGroup.indexOfChild(a) < 0) {
            viewGroup.addView(a);
        }
        MethodCollector.m26664o(4493);
        return a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final /* synthetic */ Object instantiateItem(ViewGroup viewGroup, int i) {
        AbstractC46452f fVar;
        View a;
        MethodCollector.m26663i(4489);
        C89219l.m154721d(viewGroup, "");
        C46517n nVar = this.f123958e.f123973e;
        if (i >= 0 && nVar.f108450b != null && i < nVar.f108450b.size() && (fVar = nVar.f108450b.get(i)) != null && fVar.mo78974i()) {
            AbstractC46452f b = nVar.mo79061b(i);
            C89219l.m154716b(b, "");
            if (!C13603b.m24435a((Collection) b.mo78978m())) {
                if (fVar.mo78975j() == 3) {
                    if (C46535a.f108508b == 0) {
                        View a2 = m99277a(viewGroup, new C46507g());
                        MethodCollector.m26664o(4489);
                        return a2;
                    } else if (fVar.mo78976k() == 0) {
                        View a3 = m99277a(viewGroup, new C46486a());
                        MethodCollector.m26664o(4489);
                        return a3;
                    }
                }
                if (fVar.mo78975j() == 4 && C46458a.f108233a == 0) {
                    View a4 = m99277a(viewGroup, new C46507g());
                    MethodCollector.m26664o(4489);
                    return a4;
                }
                C54093a aVar = new C54093a(this);
                C46472c cVar = this.f123956c.get(Integer.valueOf(i));
                if (cVar != null) {
                    a = cVar.mo78995a();
                } else {
                    Context context = viewGroup.getContext();
                    C89219l.m154716b(context, "");
                    while (true) {
                        if (context != null) {
                            if (!(context instanceof Activity)) {
                                if (!(context instanceof ContextWrapper)) {
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            } else {
                                Activity activity = (Activity) context;
                                if (activity != null) {
                                    C46472c cVar2 = new C46472c((AbstractC1204m) activity, viewGroup, this.f123957d, fVar.mo78975j(), aVar);
                                    AbstractC46452f b2 = nVar.mo79061b(i);
                                    C89219l.m154716b(b2, "");
                                    List<C46447a> m = b2.mo78978m();
                                    if (!(cVar2.mo78997c() == null || m == null || !(!m.isEmpty()))) {
                                        AbstractC46467a<C46447a> c = cVar2.mo78997c();
                                        if (c == null) {
                                            C89219l.m154715b();
                                        }
                                        c.mo62377b_(m);
                                    }
                                    if (cVar2.f108269f == 2 || cVar2.f108269f == 4 || cVar2.f108269f == 3) {
                                        C46477d dVar = cVar2.f108265b;
                                        SwipeControlledRecycleView b3 = cVar2.mo78996b();
                                        C89219l.m154716b(b3, "");
                                        SwipeControlledViewPager swipeControlledViewPager = cVar2.f108268e;
                                        if (m == null) {
                                            C89219l.m154715b();
                                        }
                                        C89219l.m154721d(b3, "");
                                        C89219l.m154721d(swipeControlledViewPager, "");
                                        C89219l.m154721d(m, "");
                                        b3.setOnTouchListener(new C46477d.View$OnTouchListenerC46478a(dVar, new ArrayList(), b3, m, swipeControlledViewPager));
                                    }
                                    AbstractC46467a<C46447a> c2 = cVar2.mo78997c();
                                    if (c2 != null) {
                                        AbstractC46519p pVar = cVar2.f108270g;
                                        C89219l.m154721d(pVar, "");
                                        c2.f108252e = pVar;
                                        SwipeControlledRecycleView b4 = cVar2.mo78996b();
                                        C89219l.m154716b(b4, "");
                                        b4.setAdapter(c2);
                                        SwipeControlledRecycleView b5 = cVar2.mo78996b();
                                        C89219l.m154716b(b5, "");
                                        c2.mo78990a(b5);
                                        if (cVar2.f108269f == 1 || cVar2.f108269f == 5) {
                                            cVar2.f108264a.setVisibility(0);
                                            cVar2.f108264a.setOnClickListener(new C46472c.View$OnClickListenerC46474b(cVar2));
                                            int i2 = Build.VERSION.SDK_INT;
                                            Drawable drawable = cVar2.f108264a.getDrawable();
                                            if (drawable != null) {
                                                drawable.setAutoMirrored(true);
                                            }
                                        }
                                    }
                                    a = cVar2.mo78995a();
                                    this.f123956c.put(Integer.valueOf(i), cVar2);
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                    MethodCollector.m26664o(4489);
                    throw nullPointerException;
                }
                if (viewGroup.indexOfChild(a) < 0) {
                    viewGroup.addView(a);
                }
                MethodCollector.m26664o(4489);
                return a;
            }
        }
        View a5 = m99277a(viewGroup, new C46507g());
        MethodCollector.m26664o(4489);
        return a5;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        MethodCollector.m26663i(4495);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(obj, "");
        viewGroup.removeView((View) obj);
        MethodCollector.m26664o(4495);
    }

    public C54092a(AbstractC54142b bVar, SwipeControlledViewPager swipeControlledViewPager, C54101a aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(swipeControlledViewPager, "");
        C89219l.m154721d(aVar, "");
        this.f123955b = bVar;
        this.f123957d = swipeControlledViewPager;
        this.f123958e = aVar;
        swipeControlledViewPager.getContext();
        this.f123954a = new InputViewDelegate(bVar);
    }
}
