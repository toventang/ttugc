package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.u */
final /* synthetic */ class DialogInterface$OnClickListenerC38765u implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final Context f91539a;

    /* renamed from: b */
    private final Aweme f91540b;

    /* renamed from: c */
    private final String f91541c;

    static {
        Covode.recordClassIndex(46306);
    }

    DialogInterface$OnClickListenerC38765u(Context context, Aweme aweme, String str) {
        this.f91539a = context;
        this.f91540b = aweme;
        this.f91541c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.f91539a;
        Aweme aweme = this.f91540b;
        String str = this.f91541c;
        AbstractC38757n.m78633a(context, aweme);
        C38189j.m77510b(context, "click_open_url_window_confirm", aweme, C38189j.m77468a(context, aweme, false, (Map<String, String>) null));
        C18129a.m33746a("draw_ad", "click_open_url_window_confirm", aweme.getAwemeRawAd()).mo28902c();
        C38189j.m77482a(context, aweme, str);
        dialogInterface.dismiss();
    }
}
