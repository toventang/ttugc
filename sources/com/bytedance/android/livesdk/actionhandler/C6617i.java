package com.bytedance.android.livesdk.actionhandler;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p488c.C7381an;
import com.bytedance.android.livesdk.gift.p551g.p552a.EnumC8809a;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.actionhandler.i */
public final class C6617i implements AbstractC6614f {
    static {
        Covode.recordClassIndex(7355);
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public final boolean canHandle(Uri uri) {
        String str;
        if (uri != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        return TextUtils.equals("webcast_gift_dialog", str);
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public final boolean handle(Context context, Uri uri) {
        long j;
        String str;
        String queryParameter;
        if (uri == null || (queryParameter = uri.getQueryParameter("gift_id")) == null) {
            j = 0;
        } else {
            j = Long.parseLong(queryParameter);
        }
        if (uri == null || (str = uri.getQueryParameter("gift_enter_from")) == null) {
            str = "";
        }
        C89219l.m154716b(str, "");
        C7381an anVar = new C7381an();
        anVar.f18295b = j;
        anVar.f18294a = EnumC8809a.GIFT;
        anVar.f18296c = str;
        ((IGiftService) C6193a.m13435a(IGiftService.class)).openGiftDialogFromJSB(anVar);
        return true;
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public final boolean handle(Context context, Uri uri, Map<String, String> map) {
        return handle(context, uri);
    }
}
