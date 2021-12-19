package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36418d;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ad */
public final class C38620ad {
    static {
        Covode.recordClassIndex(46161);
    }

    /* renamed from: a */
    public static boolean m78374a(Aweme aweme) {
        if (aweme.getAwemeRawAd() != null) {
            String type = aweme.getAwemeRawAd().getType();
            int maskFormStyle = aweme.getAwemeRawAd().getMaskFormStyle();
            if (!TextUtils.equals(type, "form") || maskFormStyle != 1) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m78373a(AbstractC0952i iVar) {
        C41178b bVar;
        if (iVar == null) {
            return false;
        }
        List<Fragment> f = iVar.mo3565f();
        if (C13603b.m24435a((Collection) f)) {
            return false;
        }
        for (Fragment fragment : f) {
            if (fragment != null && !(fragment instanceof AbstractC36413a)) {
                if ((fragment instanceof C41426z) && (bVar = ((C41426z) fragment).f96636k) != null && bVar.f96244i) {
                    return true;
                }
                if (fragment instanceof DialogInterface$OnCancelListenerC0944d) {
                    Dialog dialog = ((DialogInterface$OnCancelListenerC0944d) fragment).getDialog();
                    if (dialog != null) {
                        return dialog.isShowing();
                    }
                } else if (fragment instanceof AbstractC36418d) {
                    return ((AbstractC36418d) fragment).mo63708a();
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m78372a(Context context, Aweme aweme, boolean z) {
        if (context == null || aweme == null || !aweme.isAd()) {
            return "";
        }
        return m78375b(context, aweme, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r1.equals("redpacket") == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        if (r1.equals("dial") == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
        if (r1.equals("coupon") == false) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m78375b(android.content.Context r4, com.p2082ss.android.ugc.aweme.feed.model.Aweme r5, boolean r6) {
        /*
        // Method dump skipped, instructions count: 284
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.utils.C38620ad.m78375b(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, boolean):java.lang.String");
    }
}
