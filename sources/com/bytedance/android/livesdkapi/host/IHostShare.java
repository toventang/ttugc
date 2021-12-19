package com.bytedance.android.livesdkapi.host;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.C2962b;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.covode.number.Covode;
import java.util.List;

public interface IHostShare extends AbstractC2953a {

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostShare$a */
    public interface AbstractC11791a {
        static {
            Covode.recordClassIndex(13487);
        }

        /* renamed from: a */
        void mo17691a(List<C2962b> list);
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostShare$b */
    public interface AbstractC11792b {
        static {
            Covode.recordClassIndex(13488);
        }

        /* renamed from: a */
        void mo17684a(String str);
    }

    static {
        Covode.recordClassIndex(13486);
    }

    Pair<String, Drawable> getBreathShareAnimShareRes(Context context, String str, String str2);

    String getBundleKey(int i);

    Dialog getLongPressShareDialog(Activity activity, C11666c cVar, AbstractC11665b bVar);

    Dialog getShareDialog(Activity activity, C11666c cVar, AbstractC11665b bVar);

    void getShortUrl(String str, AbstractC11792b bVar);

    void getUrlModelAndShowAnim(AbstractC11791a aVar);

    boolean isImChannel(String str);

    boolean isShareAvailable(String str, Activity activity);

    void share(Activity activity, C11666c cVar, AbstractC11665b bVar);

    void showReportDialog(Activity activity, C11666c cVar, String str);
}
