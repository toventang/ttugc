package com.p2082ss.android.ugc.aweme.setting.serverpush.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.p2482cn.C36145b;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68346d;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import java.util.concurrent.ExecutionException;
import p077b.C1731i;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager */
public final class PushSettingsApiManager {

    /* renamed from: a */
    private static PushUserSettingsApi f153005a = ((PushUserSettingsApi) C18097a.m33698a(Api.f79771d, PushUserSettingsApi.class));

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager$PushUserSettingsApi */
    public interface PushUserSettingsApi {
        static {
            Covode.recordClassIndex(80575);
        }

        @AbstractC89722f(mo144276a = "/tiktok/user/relation/social/data/check/v1")
        C1731i<SocialRelationDataCheckResponse> checkSocialRelationData(@AbstractC89736t(mo144292a = "social_platform") int i);

        @AbstractC89722f(mo144276a = "/tiktok/v1/notification/settings/")
        AbstractFutureC27655q<C68346d> getNotificationsSettings();

        @AbstractC89722f(mo144276a = "/aweme/v1/user/settings/")
        AbstractFutureC27655q<C68348f> getUserSettings(@AbstractC89736t(mo144292a = "last_settings_version") String str);

        @AbstractC89731o(mo144285a = "/tiktok/user/relation/social/data/delete/v1")
        AbstractFutureC27655q<BaseResponse> removeSocialRelationData(@AbstractC89736t(mo144292a = "social_platform") int i);

        @AbstractC89722f(mo144276a = "/aweme/v1/user/set/settings/")
        AbstractFutureC27655q<BaseResponse> setItem(@AbstractC89736t(mo144292a = "field") String str, @AbstractC89736t(mo144292a = "value") int i);

        @AbstractC89722f(mo144276a = "/aweme/v1/user/set/settings/")
        AbstractFutureC27655q<BaseResponse> setPrivateItem(@AbstractC89736t(mo144292a = "field") String str, @AbstractC89736t(mo144292a = "private_setting") int i);

        @AbstractC89722f(mo144276a = "/aweme/v1/user/set/settings/")
        AbstractFutureC27655q<BaseResponse> setPrivateItem(@AbstractC89736t(mo144292a = "field") String str, @AbstractC89736t(mo144292a = "private_setting") int i, @AbstractC89736t(mo144292a = "enable_stitch") int i2);

        @AbstractC89722f(mo144276a = "/aweme/v1/user/set/settings/")
        AbstractFutureC27655q<BaseResponse> setPrivateItem(@AbstractC89736t(mo144292a = "field") String str, @AbstractC89736t(mo144292a = "private_setting") int i, @AbstractC89736t(mo144292a = "aweme_id") String str2);

        @AbstractC89731o(mo144285a = "/aweme/v1/user/set/settings/")
        AbstractFutureC27655q<BaseResponse> setResidenceItem(@AbstractC89736t(mo144292a = "field") String str, @AbstractC89736t(mo144292a = "user_residence") String str2);

        @AbstractC89731o(mo144285a = "/tiktok/v1/notification/settings/set/")
        AbstractFutureC27655q<BaseResponse> setUserSettingsForLogout(@AbstractC89736t(mo144292a = "field") String str, @AbstractC89736t(mo144292a = "status") int i);
    }

    static {
        Covode.recordClassIndex(80574);
    }

    /* renamed from: b */
    public static C68346d m120631b() {
        try {
            return f153005a.getNotificationsSettings().get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C68348f m120628a() {
        try {
            return f153005a.getUserSettings(C36145b.m73641b().mo63268b(C17867d.m33078a(), "last_user_setting_version", "")).get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C1731i<SocialRelationDataCheckResponse> m120624a(int i) {
        return f153005a.checkSocialRelationData(i);
    }

    /* renamed from: b */
    public static BaseResponse m120629b(int i) {
        try {
            return f153005a.removeSocialRelationData(i).get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static BaseResponse m120625a(String str, int i) {
        try {
            return f153005a.setItem(str, i).get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }

    /* renamed from: c */
    public static BaseResponse m120632c(String str, int i) {
        try {
            return f153005a.setUserSettingsForLogout(str, i).get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }

    /* renamed from: b */
    public static BaseResponse m120630b(String str, int i) {
        try {
            return f153005a.setPrivateItem(str, i).get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static BaseResponse m120626a(String str, int i, int i2) {
        try {
            return f153005a.setPrivateItem(str, i, i2).get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static BaseResponse m120627a(String str, int i, String str2) {
        try {
            return f153005a.setPrivateItem(str, i, str2).get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }
}
