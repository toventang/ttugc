package com.bytedance.android.live.actionhandler;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface IActionHandlerService extends AbstractC2953a {
    static {
        Covode.recordClassIndex(3343);
    }

    boolean canHandle(Uri uri);

    boolean handle(Context context, Uri uri);

    boolean handle(Context context, String str);

    boolean handleWithoutHost(Context context, Uri uri, Map<String, String> map);

    boolean handleWithoutHost(Context context, String str);

    void postReportReason(long j, long j2, long j3, String str);

    boolean showUserProfile(long j);

    boolean showUserProfile(long j, String str, Map<String, String> map);
}
