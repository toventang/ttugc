package com.p2082ss.android.ugc.aweme.p3070im;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service.IMAdapterServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56256i;

/* renamed from: com.ss.android.ugc.aweme.im.a */
public final class C53588a extends C53598c {
    static {
        Covode.recordClassIndex(63166);
    }

    /* renamed from: a */
    public static boolean m98813a() {
        return IMAdapterServiceImpl.m101068d().mo90129a();
    }

    /* renamed from: a */
    public static C56256i m98812a(SharedPreferences.Editor editor, IESSettingsProxy iESSettingsProxy) {
        C56256i iVar = new C56256i();
        try {
            SharePrefCache.inst().getOpenImLinkItem().mo59939b(editor, iESSettingsProxy.getOpenImLink());
        } catch (C16041a e) {
            e.printStackTrace();
        }
        try {
            SharePrefCache.inst().getImUrlTemplateItem().mo59939b(editor, iESSettingsProxy.getImUrlTemplate());
        } catch (C16041a e2) {
            e2.printStackTrace();
        }
        try {
            iVar.f128309a = iESSettingsProxy.getOpenImLink().intValue();
        } catch (C16041a e3) {
            e3.printStackTrace();
        }
        try {
            iVar.f128310b = iESSettingsProxy.getImUrlTemplate();
        } catch (C16041a e4) {
            e4.printStackTrace();
        }
        try {
            if (iESSettingsProxy.getImContactsMultiSelectLimit().intValue() > 0) {
                SharePrefCache.inst().getMultiSelectLimitItem().mo59939b(editor, iESSettingsProxy.getImContactsMultiSelectLimit());
                iVar.f128311c = iESSettingsProxy.getImContactsMultiSelectLimit().intValue();
            } else {
                iVar.f128311c = SharePrefCache.inst().getMultiSelectLimit();
            }
        } catch (C16041a e5) {
            e5.printStackTrace();
            iVar.f128311c = SharePrefCache.inst().getMultiSelectLimit();
        }
        try {
            iVar.f128312d = iESSettingsProxy.getFlipchatSettings();
        } catch (C16041a e6) {
            e6.printStackTrace();
        }
        try {
            iVar.f128314f = iESSettingsProxy.getMaxMessageCountForRecommend().intValue();
        } catch (C16041a e7) {
            e7.printStackTrace();
        }
        try {
            iVar.f128315g = iESSettingsProxy.getDisableImMessageFullFeedSlide().booleanValue();
        } catch (C16041a e8) {
            e8.printStackTrace();
        }
        try {
            iVar.f128316h = iESSettingsProxy.getEnabledImAsupporterMsgTypes().intValue();
        } catch (C16041a e9) {
            e9.printStackTrace();
        }
        try {
            iVar.f128317i = iESSettingsProxy.getEnabledImAsupporterFuncs().intValue();
        } catch (C16041a e10) {
            e10.printStackTrace();
        }
        iVar.f128313e = iESSettingsProxy.getImImageDomains();
        return iVar;
    }
}
