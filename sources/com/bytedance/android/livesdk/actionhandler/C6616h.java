package com.bytedance.android.livesdk.actionhandler;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.actionhandler.h */
public final class C6616h implements AbstractC6614f {
    static {
        Covode.recordClassIndex(7354);
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public final boolean canHandle(Uri uri) {
        return TextUtils.equals("sign", uri.getHost());
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public final boolean handle(Context context, Uri uri) {
        String queryParameter = uri.getQueryParameter("url");
        Intent intent = new Intent();
        intent.putExtra("url", queryParameter);
        ((IHostAction) C6193a.m13435a(IHostAction.class)).openSignActivity(context, intent);
        return true;
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public final boolean handle(Context context, Uri uri, Map<String, String> map) {
        return handle(context, uri);
    }
}
