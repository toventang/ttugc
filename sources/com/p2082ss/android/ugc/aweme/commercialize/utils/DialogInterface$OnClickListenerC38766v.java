package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.v */
final /* synthetic */ class DialogInterface$OnClickListenerC38766v implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final Context f91542a;

    /* renamed from: b */
    private final Aweme f91543b;

    static {
        Covode.recordClassIndex(46307);
    }

    DialogInterface$OnClickListenerC38766v(Context context, Aweme aweme) {
        this.f91542a = context;
        this.f91543b = aweme;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.f91542a;
        Aweme aweme = this.f91543b;
        C38189j.m77510b(context, "click_open_url_window_cancel", aweme, C38189j.m77468a(context, aweme, false, (Map<String, String>) null));
        C18129a.m33746a("draw_ad", "click_open_url_window_cancel", aweme.getAwemeRawAd()).mo28902c();
        dialogInterface.dismiss();
    }
}
