package com.p2082ss.android.ugc.aweme.promote;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.promote.h */
public final class C65240h implements AbstractC65226a {
    static {
        Covode.recordClassIndex(76716);
    }

    @Override // com.p2082ss.android.ugc.aweme.promote.AbstractC65226a
    /* renamed from: a */
    public final void mo104387a(Context context, String str, String str2) {
        if (context != null) {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str = "https://api.tiktokv.com/magic/runtime/?id=1079";
            }
            intent.setData(Uri.parse(str));
            String string = context.getResources().getString(R.string.ex_);
            if (C58071d.m104909c()) {
                string = context.getResources().getString(R.string.exd);
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = string;
            }
            intent.putExtra("title", str2);
            intent.putExtra("aweme_model", bundle);
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
        }
    }
}
