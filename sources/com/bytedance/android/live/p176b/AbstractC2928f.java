package com.bytedance.android.live.p176b;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.container.AbstractC8241e;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdkapi.p674b.AbstractC11614d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.live.b.f */
public interface AbstractC2928f extends AbstractC2953a {

    /* renamed from: com.bytedance.android.live.b.f$a */
    public interface AbstractC2929a {
        static {
            Covode.recordClassIndex(3368);
        }

        /* renamed from: a */
        void mo7664a(String str);
    }

    static {
        Covode.recordClassIndex(3367);
    }

    void configWebDialogHelper(C10935a aVar, DataChannel dataChannel, boolean z, AbstractC1204m mVar);

    AbstractC8241e createHybridDialog(PopupConfig popupConfig);

    AbstractC11614d createLiveBrowserFragment(Bundle bundle);

    AbstractC2939m createLynxDialogBuilder(String str, String str2);

    Fragment createLynxFragment(Context context, Bundle bundle);

    AbstractC2932i getHybridContainerManager();

    AbstractC2936j getHybridDialogManager();

    AbstractC2937k getHybridPageManager();

    AbstractC2938l getLynxCardViewManager();

    String getWebDialogTag();

    void setUserSilent(boolean z);

    AbstractC6956d webViewManager();

    <T> void xClearStorageItem(Context context, String str);

    <T> void xSetStorageItem(Context context, String str, T t);
}
