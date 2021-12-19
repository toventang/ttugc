package com.bytedance.android.livesdk.chatroom.p499ui;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.p147c.p148a.AbstractC2713c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bn */
final /* synthetic */ class RunnableC7810bn implements Runnable {

    /* renamed from: a */
    private final C7794bg f19381a;

    static {
        Covode.recordClassIndex(8605);
    }

    RunnableC7810bn(C7794bg bgVar) {
        this.f19381a = bgVar;
    }

    public final void run() {
        int i;
        MethodCollector.m26663i(10377);
        C7794bg bgVar = this.f19381a;
        if (!(bgVar.f19337e || ((IHostContext) C6193a.m13435a(IHostContext.class)).context() == null || bgVar.getContext() == null)) {
            bgVar.f19346n.setAdapter(new C7769as(bgVar.f19354v));
            bgVar.f19346n.addOnPageChangeListener(new ViewPager.C1582h() {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.C7794bg.C78027 */

                static {
                    Covode.recordClassIndex(8597);
                }

                @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
                public final void onPageSelected(int i) {
                    super.onPageSelected(i);
                    C7794bg.this.mo14058a(i);
                }
            });
            int dimensionPixelSize = bgVar.getContext().getResources().getDimensionPixelSize(R.dimen.wd);
            for (int i2 = 0; i2 < bgVar.f19354v.size(); i2++) {
                AbstractC2713c cVar = bgVar.f19354v.get(i2);
                ViewGroup viewGroup = bgVar.f19347o;
                C89219l.m154721d(viewGroup, "");
                if (cVar.f8105h == null) {
                    cVar.f8105h = new ImageView(viewGroup.getContext());
                    ImageView imageView = cVar.f8105h;
                    if (imageView == null) {
                        C89219l.m154710a("indicatorView");
                    }
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    ImageView imageView2 = cVar.f8105h;
                    if (imageView2 == null) {
                        C89219l.m154710a("indicatorView");
                    }
                    imageView2.setBackground(C0643b.m2369a(viewGroup.getContext(), (int) R.drawable.c7y));
                    ImageView imageView3 = cVar.f8105h;
                    if (imageView3 == null) {
                        C89219l.m154710a("indicatorView");
                    }
                    imageView3.setImageResource(cVar.mo7223a());
                }
                ImageView imageView4 = cVar.f8105h;
                if (imageView4 == null) {
                    C89219l.m154710a("indicatorView");
                }
                bgVar.f19347o.addView(imageView4, dimensionPixelSize, dimensionPixelSize);
                imageView4.setOnClickListener(new View$OnClickListenerC7811bo(bgVar, i2));
            }
            if (bgVar.f19349q == null || (i = bgVar.f19354v.indexOf(bgVar.f19349q)) == -1) {
                i = 0;
            }
            bgVar.f19346n.setCurrentItem(i, false);
            bgVar.mo14058a(i);
            bgVar.f19348p.setVisibility(0);
            bgVar.f19348p.setOnClickListener(new View$OnClickListenerC7812bp(bgVar));
            bgVar.f19337e = true;
        }
        MethodCollector.m26664o(10377);
    }
}
