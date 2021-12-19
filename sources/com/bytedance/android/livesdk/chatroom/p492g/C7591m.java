package com.bytedance.android.livesdk.chatroom.p492g;

import android.content.DialogInterface;
import android.net.Uri;
import com.bytedance.android.livesdk.C6886aw;
import com.bytedance.android.livesdk.chatroom.p488c.C7409y;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.livesdk.chatroom.g.m */
public final class C7591m {

    /* renamed from: a */
    public static final C7591m f18825a = new C7591m();

    private C7591m() {
    }

    static {
        Covode.recordClassIndex(8364);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.g.m$a */
    public static final class DialogInterface$OnDismissListenerC7592a implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ DataChannel f18826a;

        static {
            Covode.recordClassIndex(8365);
        }

        public DialogInterface$OnDismissListenerC7592a(DataChannel dataChannel) {
            this.f18826a = dataChannel;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f18826a.mo28315b(C6886aw.class, new C7409y());
        }
    }

    /* renamed from: a */
    public static int m15605a(Uri uri, String str, int i) {
        String queryParameter;
        if (uri == null || (queryParameter = uri.getQueryParameter(str)) == null) {
            return i;
        }
        return Integer.parseInt(queryParameter);
    }

    /* renamed from: a */
    public static String m15606a(Uri uri, String str, String str2) {
        String queryParameter;
        return (uri == null || (queryParameter = uri.getQueryParameter(str)) == null) ? str2 : queryParameter;
    }
}
