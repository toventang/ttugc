package com.bytedance.android.live.broadcast.preview;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.preview.ai */
public final /* synthetic */ class DialogInterface$OnClickListenerC3376ai implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final Context f9599a;

    static {
        Covode.recordClassIndex(3860);
    }

    public DialogInterface$OnClickListenerC3376ai(Context context) {
        this.f9599a = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.f9599a;
        ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager().mo13248a(context, AbstractC6963e.m14872b("https://www.tiktok.com/aweme/in_app/suicide/help/" + "?is_live=1" + "&enter_from=livestream_keyword_popup" + "&title=" + context.getString(R.string.gug)));
    }
}
