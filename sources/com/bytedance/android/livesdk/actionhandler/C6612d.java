package com.bytedance.android.livesdk.actionhandler;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.p176b.AbstractC2930g;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.actionhandler.d */
public final class C6612d implements AbstractC6614f {
    static {
        Covode.recordClassIndex(7350);
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public final boolean canHandle(Uri uri) {
        AbstractC2930g gVar = (AbstractC2930g) C6193a.m13435a(AbstractC2930g.class);
        if (gVar != null) {
            return gVar.isContainerScheme(uri);
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public final boolean handle(Context context, Uri uri) {
        AbstractC2930g gVar = (AbstractC2930g) C6193a.m13435a(AbstractC2930g.class);
        if (gVar != null) {
            return gVar.handleScheme(uri, context);
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public final boolean handle(Context context, Uri uri, Map<String, String> map) {
        return handle(context, uri);
    }
}
