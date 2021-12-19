package com.bytedance.android.livesdk.p434ad;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3888a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p176b.AbstractC2932i;
import com.bytedance.android.live.p176b.AbstractC2936j;
import com.bytedance.android.live.p176b.AbstractC2937k;
import com.bytedance.android.live.p176b.AbstractC2938l;
import com.bytedance.android.live.p176b.AbstractC2939m;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.C6943b;
import com.bytedance.android.livesdk.browser.C6969d;
import com.bytedance.android.livesdk.browser.C7005e;
import com.bytedance.android.livesdk.browser.C7021g;
import com.bytedance.android.livesdk.browser.jsbridge.C7038b;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7095ao;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7165ca;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.C6966g;
import com.bytedance.android.livesdk.browser.p463d.C6972a;
import com.bytedance.android.livesdk.browser.p463d.View$OnClickListenerC6986h;
import com.bytedance.android.livesdk.browser.p466g.C7024a;
import com.bytedance.android.livesdk.chatroom.interaction.PopHalfWebDialogHelper;
import com.bytedance.android.livesdk.container.AbstractC8241e;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.container.p513j.C8286e;
import com.bytedance.android.livesdk.lynx.AbstractC9341b;
import com.bytedance.android.livesdk.lynx.AbstractC9352c;
import com.bytedance.android.livesdk.lynx.AbstractC9353d;
import com.bytedance.android.livesdk.lynx.C9354e;
import com.bytedance.android.livesdk.lynx.p570ui.C9448e;
import com.bytedance.android.livesdk.p559i.AbstractC8974b;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.p674b.AbstractC11614d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.xbridge.base.p1291a.C18411b;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.ad.a */
public class C6629a implements AbstractC2928f {
    AbstractC9352c mLynxService = new C9354e();

    static {
        Covode.recordClassIndex(7367);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    public void removeNotifyBoxOpenedCallbacks() {
        C7095ao.f17703a = null;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public AbstractC2936j getHybridDialogManager() {
        return C6969d.C6971b.f17440a;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public AbstractC2937k getHybridPageManager() {
        return C7005e.C7007b.f17591a;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public AbstractC2938l getLynxCardViewManager() {
        return C7021g.C7023b.f17618a;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public AbstractC2932i getHybridContainerManager() {
        return new C6943b();
    }

    public List<String> getSafeHost() {
        return C7038b.m14993e();
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public String getWebDialogTag() {
        return C6972a.class.getCanonicalName();
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public AbstractC6956d webViewManager() {
        return C6966g.m14875b();
    }

    public void setNotifyBoxOpenedCallback(AbstractC8974b bVar) {
        C7095ao.f17703a = bVar;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public void setUserSilent(boolean z) {
        C7165ca.f17852a = z;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public AbstractC8241e createHybridDialog(PopupConfig popupConfig) {
        return C8286e.C8287a.m16450a(popupConfig);
    }

    public AbstractC2939m createH5DialogBuilder(String str) {
        return new C9448e(str).mo16283a(C9448e.EnumC9450b.H5);
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public AbstractC11614d createLiveBrowserFragment(Bundle bundle) {
        C7024a.m14981a(bundle.getString("url", ""));
        View$OnClickListenerC6986h hVar = new View$OnClickListenerC6986h();
        hVar.setArguments(bundle);
        return hVar;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public Fragment createLynxFragment(Context context, Bundle bundle) {
        return this.mLynxService.createLynxFragment(context, bundle);
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public <T> void xClearStorageItem(Context context, String str) {
        C18411b.m34269a(context).mo29436b(str);
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public AbstractC2939m createLynxDialogBuilder(String str, String str2) {
        return new C9448e(str, str2).mo16283a(C9448e.EnumC9450b.LYNX);
    }

    public <T> T xGetStorageItem(Context context, String str) {
        return (T) C18411b.m34269a(context).mo29433a(str);
    }

    public void openHybridDialog(Context context, PopupConfig popupConfig) {
        AbstractC8241e createHybridDialog = createHybridDialog(popupConfig);
        if (context != null) {
            if (!(context instanceof Activity)) {
                context = ((IHostApp) C6193a.m13435a(IHostApp.class)).getTopActivity();
            }
            ActivityC0945e b = C3888a.m9506b(context);
            if (b != null) {
                createHybridDialog.mo14591a(b);
            }
        }
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public <T> void xSetStorageItem(Context context, String str, T t) {
        C18411b.m34269a(context).mo29435a(str, t);
    }

    public AbstractC9341b createLynxComponent(Activity activity, int i, AbstractC9353d dVar) {
        return this.mLynxService.create(activity, Integer.valueOf(i), "", dVar, null);
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2928f
    public void configWebDialogHelper(C10935a aVar, DataChannel dataChannel, boolean z, AbstractC1204m mVar) {
        new PopHalfWebDialogHelper(aVar, dataChannel, z, mVar);
    }
}
