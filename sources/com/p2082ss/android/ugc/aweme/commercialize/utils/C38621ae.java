package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.splash.C38496e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50041af;
import com.p2082ss.android.ugc.aweme.utils.C80595j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ae */
public final class C38621ae implements AbstractC38660az {
    static {
        Covode.recordClassIndex(46162);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38660az
    /* renamed from: a */
    public final boolean mo67204a(Fragment fragment) {
        if (!(fragment instanceof C50041af)) {
            return false;
        }
        return C38496e.m78026a((C50041af) fragment);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38660az
    /* renamed from: a */
    public final boolean mo67205a(AbstractC0952i iVar) {
        return C38620ad.m78373a(iVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        if (r3.equals("web") == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        if (r3.equals("coupon") == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ad, code lost:
        if (com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a.m76288c(r2) != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b3, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c4 A[RETURN] */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38660az
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo67206a(com.p2082ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.utils.C38621ae.mo67206a(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38660az
    /* renamed from: a */
    public final String mo67202a(Context context, Aweme aweme) {
        return C38620ad.m78372a(context, aweme, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38660az
    /* renamed from: a */
    public final void mo67203a(View view, int i, int i2, boolean z) {
        if (view != null) {
            int i3 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            if (z) {
                if (i3 < 0) {
                    C80595j.m139737a(view, i3, i, i2).start();
                }
            } else if (i3 >= 0) {
                C80595j.m139737a(view, i3, i, i2).start();
            }
        }
    }
}
