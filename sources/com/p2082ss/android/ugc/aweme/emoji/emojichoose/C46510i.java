package com.p2082ss.android.ugc.aweme.emoji.emojichoose;

import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.p2900a.C46459a;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46641c;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46645g;
import com.p2082ss.android.ugc.aweme.emoji.views.C46671c;
import com.p2082ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.i */
public final class C46510i {

    /* renamed from: a */
    String f108406a;

    /* renamed from: b */
    int f108407b;

    /* renamed from: c */
    C46645g<String, C46504f> f108408c;

    /* renamed from: d */
    float f108409d;

    /* renamed from: e */
    long f108410e;

    /* renamed from: f */
    long f108411f;

    /* renamed from: g */
    boolean f108412g;

    /* renamed from: h */
    long f108413h;

    /* renamed from: i */
    int f108414i;

    /* renamed from: j */
    Handler f108415j;

    /* renamed from: k */
    float f108416k;

    /* renamed from: l */
    float f108417l;

    /* renamed from: m */
    C46671c f108418m;

    static {
        Covode.recordClassIndex(55095);
    }

    public C46510i() {
        this(0);
    }

    public C46510i(int i) {
        this.f108412g = true;
        this.f108414i = -1;
        this.f108415j = new Handler(Looper.getMainLooper());
        this.f108407b = i;
        this.f108408c = new C46645g<>(5);
        this.f108406a = C17867d.m33078a().getString(R.string.bmd);
    }

    /* renamed from: a */
    static <T extends AbstractC46518o> View m89771a(ViewGroup viewGroup, T t) {
        MethodCollector.m26663i(10567);
        View a = t.mo79002a(viewGroup);
        if (viewGroup.indexOfChild(a) < 0) {
            viewGroup.addView(a);
        }
        MethodCollector.m26664o(10567);
        return a;
    }

    /* renamed from: a */
    private void m89773a(GridView gridView, SwipeControlledViewPager swipeControlledViewPager, List<C46447a> list) {
        gridView.setOnTouchListener(new View$OnTouchListenerC46512k(this, new ArrayList(), gridView, list, swipeControlledViewPager));
    }

    /* renamed from: a */
    private static void m89774a(C46504f fVar, List<C46447a> list, AbstractC46519p pVar, C46514m mVar, int i) {
        fVar.f108389b.setOnItemClickListener(new C46511j(list, pVar, mVar, i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m89772a(int r16, com.p2082ss.android.ugc.aweme.base.model.UrlModel r17, android.view.View r18, android.content.Context r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.emoji.emojichoose.C46510i.m89772a(int, com.ss.android.ugc.aweme.base.model.UrlModel, android.view.View, android.content.Context, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo79020a(float f, float f2, List<View> list, List<C46447a> list2, View view, SwipeControlledViewPager swipeControlledViewPager) {
        int i;
        View findViewById;
        int i2 = 0;
        for (View view2 : list) {
            if (f <= ((float) view2.getLeft()) || f >= ((float) view2.getRight()) || f2 >= ((float) view2.getBottom()) || f2 <= ((float) view2.getTop())) {
                i2++;
            } else {
                if (this.f108414i != i2 && System.currentTimeMillis() - this.f108413h > 500 && Math.abs(f - this.f108409d) < 20.0f) {
                    this.f108412g = false;
                    swipeControlledViewPager.setSwipeEnabled(false);
                    this.f108415j.removeCallbacksAndMessages(null);
                }
                int i3 = this.f108414i;
                if (!(i3 < 0 || i2 == i3 || (findViewById = list.get(i3).findViewById(R.id.aua)) == null)) {
                    findViewById.setBackground(new ColorDrawable(0));
                }
                if (!this.f108412g && i2 < list2.size()) {
                    View findViewById2 = list.get(i2).findViewById(R.id.aua);
                    C46447a aVar = list2.get(i2);
                    if (!(!aVar.mo78961a() || (i = aVar.f108221a) == 2131231980 || i == 2131231989 || findViewById2 == null)) {
                        if (aVar.f108224d.getStickerType() == 1) {
                            String str = "file://" + C46641c.m90026b(aVar.f108224d);
                            UrlModel animateUrl = aVar.f108224d.getAnimateUrl();
                            if (new File(str).exists()) {
                                animateUrl = new UrlModel();
                                animateUrl.setUri(str);
                                animateUrl.setUrlList(Collections.singletonList(str));
                            }
                            m89772a(i2, animateUrl, findViewById2, view.getContext(), C46459a.m89692c(aVar.f108224d));
                            return;
                        }
                        m89772a(i2, aVar.f108224d.getAnimateUrl(), findViewById2, view.getContext(), C46459a.m89692c(aVar.f108224d));
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo79021a(C46504f fVar, List<C46447a> list, AbstractC46452f fVar2, AbstractC46519p pVar, SwipeControlledViewPager swipeControlledViewPager, C46514m mVar, int i) {
        fVar.mo79009a(list);
        if (fVar2.mo78975j() == 2 || fVar2.mo78975j() == 4 || fVar2.mo78975j() == 3) {
            fVar.f108389b.setSelector(new ColorDrawable(0));
            m89773a(fVar.f108389b, swipeControlledViewPager, list);
        }
        m89774a(fVar, list, pVar, mVar, i);
    }
}
