package com.bytedance.android.live.p176b;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.container.AbstractC8241e;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.lynx.AbstractC9341b;
import com.bytedance.android.livesdk.lynx.AbstractC9353d;
import com.bytedance.android.livesdk.p559i.AbstractC8974b;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdkapi.p674b.AbstractC11614d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.b.a */
public class C2918a implements AbstractC2928f {
    static {
        Covode.recordClassIndex(3357);
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public void configWebDialogHelper(C10935a aVar, DataChannel dataChannel, boolean z, AbstractC1204m mVar) {
    }

    public AbstractC2939m createH5DialogBuilder(String str) {
        return null;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public AbstractC8241e createHybridDialog(PopupConfig popupConfig) {
        return null;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public AbstractC11614d createLiveBrowserFragment(Bundle bundle) {
        return null;
    }

    public AbstractC9341b createLynxComponent(Activity activity, int i, AbstractC9353d dVar) {
        return null;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public AbstractC2939m createLynxDialogBuilder(String str, String str2) {
        return null;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public Fragment createLynxFragment(Context context, Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public AbstractC2932i getHybridContainerManager() {
        return null;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public AbstractC2936j getHybridDialogManager() {
        return null;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public AbstractC2937k getHybridPageManager() {
        return null;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public AbstractC2938l getLynxCardViewManager() {
        return null;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public String getWebDialogTag() {
        return "";
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    public void openHybridDialog(Context context, PopupConfig popupConfig) {
    }

    public void removeNotifyBoxOpenedCallbacks() {
    }

    public void setNotifyBoxOpenedCallback(AbstractC8974b bVar) {
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public void setUserSilent(boolean z) {
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public AbstractC6956d webViewManager() {
        return null;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public <T> void xClearStorageItem(Context context, String str) {
    }

    public <T> T xGetStorageItem(Context context, String str) {
        return null;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public <T> void xSetStorageItem(Context context, String str, T t) {
        C89219l.m154721d(context, "");
    }

    public List<String> getSafeHost() {
        return new ArrayList();
    }
}
