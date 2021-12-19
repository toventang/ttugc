package com.p2082ss.android.ugc.aweme.shortvideo.record.p3856a;

import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.a.b */
public final /* synthetic */ class C72746b implements AbstractC2565m {

    /* renamed from: a */
    private final C72744a f163115a;

    static {
        Covode.recordClassIndex(85432);
    }

    C72746b(C72744a aVar) {
        this.f163115a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
    public final void onChanged(Object obj) {
        MethodCollector.m26663i(10519);
        C72744a aVar = this.f163115a;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            if (!C63244g.m114602a().mo73277e().getReactionTipShow(false)) {
                if (aVar.f163107d == null) {
                    if (aVar.f163106c.getReactionPosMarginInViewPixel() == null) {
                        C40970e.m82485a("getReactionPosMarginInViewPixel return null");
                    } else {
                        aVar.f163107d = new C72750f(aVar.f163106c);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aVar.f163105b.mo22749C().getLayoutParams();
                        int[] reactionCameraPosInViewPixel = aVar.f163106c.getReactionCameraPosInViewPixel();
                        if (reactionCameraPosInViewPixel != null) {
                            if (C78099c.m136517a(aVar.f163104a)) {
                                int i = Build.VERSION.SDK_INT;
                                aVar.f163107d.mo115045a((C70636dh.m124831b(aVar.f163104a) - (reactionCameraPosInViewPixel[0] + Math.min(layoutParams.getMarginStart(), layoutParams.rightMargin))) - reactionCameraPosInViewPixel[2], reactionCameraPosInViewPixel[1] + reactionCameraPosInViewPixel[3], reactionCameraPosInViewPixel[2]);
                            } else {
                                int i2 = Build.VERSION.SDK_INT;
                                aVar.f163107d.mo115045a(reactionCameraPosInViewPixel[0] + Math.min(layoutParams.getMarginStart(), layoutParams.leftMargin), reactionCameraPosInViewPixel[1] + reactionCameraPosInViewPixel[3], reactionCameraPosInViewPixel[2]);
                            }
                        }
                    }
                }
                if (aVar.f163107d != null) {
                    C72750f fVar = aVar.f163107d;
                    if (fVar.f163121c == null) {
                        fVar.f163121c = new TextView(fVar.f163119a);
                        fVar.f163121c.setTextSize(14.0f);
                        fVar.f163121c.setGravity(17);
                        fVar.f163121c.setTextColor(fVar.f163119a.getResources().getColor(R.color.a9));
                        fVar.f163121c.setTextColor(-16777216);
                        fVar.f163120b.addView(fVar.f163121c, new ViewGroup.MarginLayoutParams(-2, -2));
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fVar.f163121c.getLayoutParams();
                    marginLayoutParams.width = fVar.f163124f;
                    if (C78099c.m136517a(fVar.f163119a)) {
                        marginLayoutParams.setMargins(0, fVar.f163123e, fVar.f163122d, 0);
                    } else {
                        marginLayoutParams.setMargins(fVar.f163122d, fVar.f163123e, 0, 0);
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    marginLayoutParams.setMarginStart(fVar.f163122d);
                    fVar.f163121c.requestLayout();
                    fVar.f163121c.setText(R.string.f5r);
                    fVar.f163121c.setVisibility(0);
                    C63244g.m114602a().mo73277e().setReactionTipShow(true);
                    new SafeHandler(aVar.f163104a).postDelayed(new RunnableC72749e(aVar), 5000);
                }
            }
            if (!aVar.f163109f) {
                new C79459a(aVar.f163104a).mo123050a(R.string.f5s).mo123053a();
                aVar.f163109f = true;
            }
        }
        MethodCollector.m26664o(10519);
    }
}
