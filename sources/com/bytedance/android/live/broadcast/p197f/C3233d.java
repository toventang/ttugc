package com.bytedance.android.live.broadcast.p197f;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.broadcast.model.C3274q;
import com.bytedance.android.live.broadcast.model.WaitingReviewInfo;
import com.bytedance.android.live.broadcast.p188b.View$OnClickListenerC3087f;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.p1855f.C24250e;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.broadcast.f.d */
public final /* synthetic */ class C3233d implements AbstractC88433f {

    /* renamed from: a */
    private final C3229a f9285a;

    static {
        Covode.recordClassIndex(3714);
    }

    public C3233d(C3229a aVar) {
        this.f9285a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        boolean z;
        int a;
        int a2;
        MethodCollector.m26663i(6309);
        C3229a aVar = this.f9285a;
        WaitingReviewInfo waitingReviewInfo = (WaitingReviewInfo) ((C5832d) obj).data;
        aVar.f9277f = Math.abs(waitingReviewInfo.getWaitingCount());
        aVar.f9278g = Math.abs(waitingReviewInfo.getWaitingTime()) / 60;
        if (aVar.f9278g <= 0) {
            aVar.f9278g++;
        }
        if (aVar.f9276e || !aVar.f9279h.f27009o) {
            MethodCollector.m26664o(6309);
            return;
        }
        aVar.f9279h.f8964f.setVisibility(8);
        aVar.f9279h.f8960b.setVisibility(0);
        aVar.f9279h.f8961c.setText(C3966y.m9657a((int) R.string.gsn));
        aVar.f9279h.f8962d.setText(C3966y.m9657a((int) R.string.grz));
        if (aVar.f9277f <= 5) {
            aVar.f9275d = 5;
            aVar.f9279h.mo8364a(false, aVar.f9277f, aVar.f9278g);
            aVar.f9279h.mo8365a(true, (CharSequence) C3966y.m9657a((int) R.string.gm9));
        } else {
            aVar.f9275d = 4;
            aVar.f9279h.mo8364a(true, aVar.f9277f, aVar.f9278g);
            aVar.f9279h.mo8365a(false, (CharSequence) null);
        }
        List<C3274q> waitingReviewRules = waitingReviewInfo.getWaitingReviewRules();
        if (waitingReviewRules != null && !waitingReviewRules.isEmpty()) {
            View$OnClickListenerC3087f fVar = aVar.f9279h;
            if (waitingReviewRules.isEmpty()) {
                MethodCollector.m26664o(6309);
                return;
            }
            fVar.f8963e.setVisibility(0);
            fVar.f8965g = waitingReviewRules;
            if (fVar.f8963e.getChildCount() == fVar.f8965g.size()) {
                z = true;
            } else {
                z = false;
                fVar.f8963e.removeAllViews();
            }
            int i = 0;
            while (i < waitingReviewRules.size()) {
                C3274q qVar = waitingReviewRules.get(i);
                if (qVar != null && !TextUtils.isEmpty(qVar.f9388c)) {
                    String str = qVar.f9388c;
                    if (!z) {
                        HSImageView hSImageView = new HSImageView(fVar.f8959a);
                        hSImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        C24250e b = C24250e.m46055b((float) C3966y.m9653a(4.0f));
                        C24247b bVar = new C24247b(C3966y.m9655a());
                        bVar.f57495t = b;
                        hSImageView.setHierarchy(bVar.mo39973a());
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        layoutParams.weight = 1.0f;
                        boolean z2 = i == 0;
                        boolean z3 = i == fVar.f8965g.size() - 1;
                        if (z2) {
                            a = 0;
                        } else {
                            a = C3966y.m9653a(4.25f);
                        }
                        if (z3) {
                            a2 = 0;
                        } else {
                            a2 = C3966y.m9653a(4.25f);
                        }
                        layoutParams.setMargins(a, 0, a2, 0);
                        hSImageView.setLayoutParams(layoutParams);
                        hSImageView.setOnClickListener(fVar);
                        hSImageView.setTag(Integer.valueOf(i));
                        C3941k.m9605a(hSImageView, str);
                        fVar.f8963e.addView(hSImageView);
                    } else {
                        HSImageView hSImageView2 = (HSImageView) fVar.f8963e.getChildAt(i);
                        if (hSImageView2 != null) {
                            C3941k.m9605a(hSImageView2, str);
                        }
                    }
                }
                i++;
            }
        }
        MethodCollector.m26664o(6309);
    }
}
