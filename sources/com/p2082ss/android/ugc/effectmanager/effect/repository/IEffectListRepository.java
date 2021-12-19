package com.p2082ss.android.ugc.effectmanager.effect.repository;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IScanQRCodeListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectQRCode;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository */
public interface IEffectListRepository {
    static {
        Covode.recordClassIndex(95641);
    }

    String checkUpdate(String str, String str2, int i, Map<String, String> map, ICheckChannelListener iCheckChannelListener);

    String fetchCategoryEffect(String str, String str2, int i, int i2, int i3, String str3, boolean z, IFetchCategoryEffectListener iFetchCategoryEffectListener);

    String fetchEffectInfoByQRCode(EffectQRCode effectQRCode, IScanQRCodeListener iScanQRCodeListener);

    String fetchExistEffectList(String str, IFetchEffectChannelListener iFetchEffectChannelListener);

    String fetchList(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener);

    String fetchPanelInfo(String str, boolean z, String str2, int i, int i2, boolean z2, IFetchPanelInfoListener iFetchPanelInfoListener);

    String fetchProviderEffectList(String str, int i, int i2, IFetchProviderEffect iFetchProviderEffect);

    String searchProviderEffectList(String str, String str2, int i, int i2, IFetchProviderEffect iFetchProviderEffect);
}
