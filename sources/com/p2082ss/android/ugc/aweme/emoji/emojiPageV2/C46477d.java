package com.p2082ss.android.ugc.aweme.emoji.emojiPageV2;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.p2900a.C46459a;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46641c;
import com.p2082ss.android.ugc.aweme.emoji.views.C46671c;
import com.p2082ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.d */
public final class C46477d {

    /* renamed from: a */
    public float f108278a;

    /* renamed from: b */
    public long f108279b;

    /* renamed from: c */
    public long f108280c;

    /* renamed from: d */
    public boolean f108281d = true;

    /* renamed from: e */
    public long f108282e;

    /* renamed from: f */
    public int f108283f = -1;

    /* renamed from: g */
    public final Handler f108284g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    public final int f108285h = 500;

    /* renamed from: i */
    public float f108286i;

    /* renamed from: j */
    public float f108287j;

    /* renamed from: k */
    C46671c f108288k;

    /* renamed from: l */
    private final int f108289l = 9;

    /* renamed from: m */
    private final int f108290m = 120;

    /* renamed from: n */
    private final int f108291n = 56;

    /* renamed from: o */
    private final int f108292o = 27;

    /* renamed from: p */
    private final float f108293p = 0.32f;

    /* renamed from: q */
    private final float f108294q = 1.42f;

    static {
        Covode.recordClassIndex(55062);
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.d$a */
    public static final class View$OnTouchListenerC46478a implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C46477d f108295a;

        /* renamed from: b */
        final /* synthetic */ List f108296b;

        /* renamed from: c */
        final /* synthetic */ RecyclerView f108297c;

        /* renamed from: d */
        final /* synthetic */ List f108298d;

        /* renamed from: e */
        final /* synthetic */ SwipeControlledViewPager f108299e;

        static {
            Covode.recordClassIndex(55063);
        }

        public View$OnTouchListenerC46478a(C46477d dVar, List list, RecyclerView recyclerView, List list2, SwipeControlledViewPager swipeControlledViewPager) {
            this.f108295a = dVar;
            this.f108296b = list;
            this.f108297c = recyclerView;
            this.f108298d = list2;
            this.f108299e = swipeControlledViewPager;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (r1 != 3) goto L_0x001c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouch(final android.view.View r14, android.view.MotionEvent r15) {
            /*
            // Method dump skipped, instructions count: 268
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.C46477d.View$OnTouchListenerC46478a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0137  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m89721a(int r17, com.p2082ss.android.ugc.aweme.base.model.UrlModel r18, android.view.View r19, android.content.Context r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 324
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.C46477d.m89721a(int, com.ss.android.ugc.aweme.base.model.UrlModel, android.view.View, android.content.Context, boolean):void");
    }

    /* renamed from: a */
    public final void mo78999a(float f, float f2, List<? extends View> list, List<? extends C46447a> list2, View view, SwipeControlledViewPager swipeControlledViewPager) {
        int i;
        View findViewById;
        int i2 = 0;
        for (View view2 : list) {
            if (f <= ((float) view2.getLeft()) || f >= ((float) view2.getRight()) || f2 >= ((float) view2.getBottom()) || f2 <= ((float) view2.getTop())) {
                i2++;
            } else {
                if (this.f108283f != i2 && System.currentTimeMillis() - this.f108282e > ((long) this.f108285h) && Math.abs(f - this.f108278a) < 20.0f) {
                    this.f108281d = false;
                    swipeControlledViewPager.setSwipeEnabled(false);
                    this.f108284g.removeCallbacksAndMessages(null);
                }
                int i3 = this.f108283f;
                if (!(i3 < 0 || i2 == i3 || (findViewById = ((View) list.get(i3)).findViewById(R.id.aua)) == null)) {
                    findViewById.setBackground(new ColorDrawable(0));
                }
                if (!this.f108281d && i2 < list2.size()) {
                    View findViewById2 = ((View) list.get(i2)).findViewById(R.id.aua);
                    C46447a aVar = (C46447a) list2.get(i2);
                    if (!(!aVar.mo78961a() || (i = aVar.f108221a) == 2131231980 || i == 2131231989 || findViewById2 == null)) {
                        C46534a aVar2 = aVar.f108224d;
                        C89219l.m154716b(aVar2, "");
                        if (aVar2.getStickerType() == 1) {
                            String str = "file://" + C46641c.m90026b(aVar.f108224d);
                            C46534a aVar3 = aVar.f108224d;
                            C89219l.m154716b(aVar3, "");
                            UrlModel animateUrl = aVar3.getAnimateUrl();
                            if (new File(str).exists()) {
                                animateUrl = new UrlModel();
                                animateUrl.setUri(str);
                                animateUrl.setUrlList(C89070n.m154516a(str));
                            }
                            C89219l.m154716b(animateUrl, "");
                            Context context = view.getContext();
                            C89219l.m154716b(context, "");
                            C46534a aVar4 = aVar.f108224d;
                            C89219l.m154716b(aVar4, "");
                            m89721a(i2, animateUrl, findViewById2, context, C46459a.m89692c(aVar4));
                            return;
                        }
                        C46534a aVar5 = aVar.f108224d;
                        C89219l.m154716b(aVar5, "");
                        UrlModel animateUrl2 = aVar5.getAnimateUrl();
                        C89219l.m154716b(animateUrl2, "");
                        Context context2 = view.getContext();
                        C89219l.m154716b(context2, "");
                        C46534a aVar6 = aVar.f108224d;
                        C89219l.m154716b(aVar6, "");
                        m89721a(i2, animateUrl2, findViewById2, context2, C46459a.m89692c(aVar6));
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }
}
