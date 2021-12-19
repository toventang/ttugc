package com.p2082ss.android.ugc.aweme.services;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import com.p2082ss.android.ugc.asve.C31029c;
import com.p2082ss.android.ugc.aweme.experiment.C46790cg;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.port.AbstractC63145a;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63201ay;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.property.C65331aa;
import com.p2082ss.android.ugc.aweme.property.C65352av;
import com.p2082ss.android.ugc.aweme.property.C65353aw;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.property.C65369bi;
import com.p2082ss.android.ugc.aweme.property.C65374bn;
import com.p2082ss.android.ugc.aweme.property.C65376bp;
import com.p2082ss.android.ugc.aweme.property.C65379bs;
import com.p2082ss.android.ugc.aweme.property.C65390cc;
import com.p2082ss.android.ugc.aweme.property.C65395ch;
import com.p2082ss.android.ugc.aweme.property.C65404cp;
import com.p2082ss.android.ugc.aweme.property.C65406cr;
import com.p2082ss.android.ugc.aweme.property.C65414cx;
import com.p2082ss.android.ugc.aweme.property.C65427dj;
import com.p2082ss.android.ugc.aweme.property.C65428dk;
import com.p2082ss.android.ugc.aweme.property.C65437dt;
import com.p2082ss.android.ugc.aweme.property.C65439dv;
import com.p2082ss.android.ugc.aweme.property.C65440dw;
import com.p2082ss.android.ugc.aweme.property.C65460eo;
import com.p2082ss.android.ugc.aweme.property.C65463ep;
import com.p2082ss.android.ugc.aweme.property.C65474g;
import com.p2082ss.android.ugc.aweme.property.C65503z;
import com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68107n;
import com.p2082ss.android.ugc.aweme.shortvideo.p3836i.C71886k;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72464a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.vesdk.C85568t;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p077b.C1731i;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.AVSettingsServiceImpl */
public class AVSettingsServiceImpl implements IAVSettingsService {
    private static AVSettingsServiceImpl sInstance = new AVSettingsServiceImpl();

    private int clamp(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: com_ss_android_ugc_aweme_services_AVSettingsServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m120105xced628c8(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_android_ugc_aweme_services_AVSettingsServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m120106xced628c8(String str, String str2, Throwable th) {
        return 0;
    }

    /* renamed from: com_ss_android_ugc_aweme_services_AVSettingsServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m120107xced628cc(String str, String str2) {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableFeedbackLog() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public int getMvPlan() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean getPublishProgressOptimize() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public String getVESDKVersion() {
        return "10.5.0.161-mt";
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isEnableUseVEGetThumbs() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isPhotoEditEnabled() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean needLoginBeforeRecord() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean shareVideo2GifEditable() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean showDuetWithReact() {
        return false;
    }

    public static AVSettingsServiceImpl getInstance() {
        return sInstance;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public String getEffectVersion() {
        return C31029c.f74350a;
    }

    private void asynMonitorAwemeSetting() {
        C1731i.m5640b(AVSettingsServiceImpl$$Lambda$0.$instance, C1731i.f5562a);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public AbstractC63145a<Boolean> bubbleGuideShown() {
        return new AbstractC63145a<Boolean>() {
            /* class com.p2082ss.android.ugc.aweme.services.AVSettingsServiceImpl.C678631 */

            static {
                Covode.recordClassIndex(79569);
            }

            @Override // com.p2082ss.android.ugc.aweme.port.AbstractC63145a
            public Boolean get() {
                return Boolean.valueOf(C63244g.m114602a().mo73277e().getBubbleGuideShown(false));
            }

            public void set(Boolean bool) {
                C63244g.m114602a().mo73277e().setBubbleGuideShown(bool.booleanValue());
            }
        };
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableNewMusicMarquee() {
        return C46790cg.m90136a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableQaSticker() {
        return C65353aw.m117038a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableSaveUploadVideo() {
        return C65357b.m117053i();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableStitch() {
        return C65437dt.m117155a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableStudioScreenRightCorner() {
        return C65439dv.m117157a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableTaskDegradationOpti() {
        return C68107n.m120398a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableTitan() {
        return C65369bi.m117065a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean getDuetStickerAB() {
        return C65331aa.m117013a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public int getEnablePublishPrivacySetting() {
        return C65352av.m117037a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean getLongVideoPermittedValue() {
        return C65390cc.m117087a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean getMvThemeRecordMode() {
        return C65395ch.m117095a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean getPostDownloadSetting() {
        return C65404cp.m117105a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isEnableGetThumbsWithEffect() {
        return C65374bn.m117070a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isEnableVideoEditActivityUploadSpeedProbe() {
        return C65376bp.m117072a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isLongVideoPermitted() {
        return C71886k.m126951a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public int recommentMusicByAIPolicy() {
        return C65414cx.m117133a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean showMvThemeRecordMode() {
        return C65395ch.m117095a();
    }

    static {
        Covode.recordClassIndex(79567);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean downloadEffectOrMusicAfterEnterCamera() {
        if (C65503z.m117231a() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableModelFileOnlyEnv() {
        return C16048b.m29633a().mo25421a(true, "model_file_test_env", true);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableUploadSyncIns() {
        return SettingsManager.m29616a().mo25400a("enable_upload_sync_ins", true);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableUploadSyncInsStory() {
        return SettingsManager.m29616a().mo25400a("enable_upload_sync_ins_story", true);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableUploadSyncTwitter() {
        return SettingsManager.m29616a().mo25400a("enable_upload_sync_twitter", true);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public String[] getSharePostEffectIds() {
        C65428dk a = C65427dj.m117145a();
        if (a.f147589d != null) {
            return a.f147589d;
        }
        return new String[0];
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public String getStickerArtistIconUrl() {
        String a = SettingsManager.m29616a().mo25398a("sticker_artist_icon_url", "");
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isDuetAutoApplyEffectEnabled() {
        if (C16048b.m29633a().mo25412a(true, "auto_apply_effect_in_duet", 0) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isPrivateAvailable() {
        return SettingsManager.m29616a().mo25400a("private_available", true);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public long progressBarThreshold() {
        return SettingsManager.m29616a().mo25395a(" progressbar_threshold", 30000L);
    }

    private boolean isInTikTokRegion() {
        AbstractC63201ay A = C63253l.f143623a.mo73302A();
        if (A == null || !A.mo93848b().booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enablePreUploadByUser() {
        boolean enablePreUploadByUser = C63244g.m114602a().mo73277e().getEnablePreUploadByUser(false);
        C73991bj.m130128a("Get EnablePreUploadByUser:".concat(String.valueOf(enablePreUploadByUser)));
        return enablePreUploadByUser;
    }

    static final /* synthetic */ Void lambda$asynMonitorAwemeSetting$0$AVSettingsServiceImpl() {
        try {
            C72464a.m127850a("filter", C65474g.m117201a());
            C72464a.m127850a("hard_code_shot", C65379bs.m117076b());
            C72464a.m127850a("hard_code_release", C65440dw.m117159b());
            int i = 0;
            if (C63244g.m114602a().mo73277e().getWatermarkHardcode(false)) {
                i = 1;
            }
            C72464a.m127850a("hard_code_water_marker", i);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public void setEnablePreUploadByUser(boolean z) {
        C73991bj.m130128a("Set EnablePreUploadByUser:".concat(String.valueOf(z)));
        C63244g.m114602a().mo73277e().setEnablePreUploadByUser(z);
    }

    public void updateServerSettings(IESSettingsProxy iESSettingsProxy) {
        if (C65390cc.m117087a()) {
            C71886k.f161072a = !C65390cc.m117087a();
        }
        C72464a aVar = C72464a.f162451c;
        C72464a.f162449a = true;
        aVar.mo114735a();
        asynMonitorAwemeSetting();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public void updateABTestModel(C28022o oVar) {
        Object valueOf;
        C28022o f = oVar.mo46807f("data");
        if (f == null) {
            m120105xced628c8("AVSettingsServiceImpl", "data is null");
            return;
        }
        C65460eo eoVar = C63238c.f143571I;
        C89219l.m154721d(f, "");
        eoVar.f147643a.mo104580a();
        C85568t a = C85568t.m147473a();
        C89219l.m154716b(a, "");
        Map<String, C85568t.C85573d> map = a.f191736a;
        C89219l.m154716b(map, "");
        for (Map.Entry<String, C85568t.C85573d> entry : map.entrySet()) {
            if (entry.getValue() != null && !TextUtils.isEmpty(entry.getKey()) && f.mo46802b(entry.getKey())) {
                String key = entry.getKey();
                C89219l.m154716b(key, "");
                C85568t.C85573d value = entry.getValue();
                C89219l.m154716b(value, "");
                C65406cr.AbstractC65407a a2 = C65460eo.m117182a(key, value);
                C65406cr.EnumC65408b b = a2.mo104594b();
                if (b != null) {
                    int i = C65463ep.f147652e[b.ordinal()];
                    if (i == 1) {
                        String a3 = a2.mo104593a();
                        C89219l.m154716b(a3, "");
                        Object c = a2.mo104595c();
                        Objects.requireNonNull(c, "null cannot be cast to non-null type kotlin.Boolean");
                        valueOf = Boolean.valueOf(C65460eo.m117185a(f, a3, ((Boolean) c).booleanValue()));
                    } else if (i == 2) {
                        String a4 = a2.mo104593a();
                        C89219l.m154716b(a4, "");
                        Object c2 = a2.mo104595c();
                        Objects.requireNonNull(c2, "null cannot be cast to non-null type kotlin.Int");
                        valueOf = Integer.valueOf(C65460eo.m117180a(f, a4, ((Integer) c2).intValue()));
                    } else if (i == 3) {
                        String a5 = a2.mo104593a();
                        C89219l.m154716b(a5, "");
                        Object c3 = a2.mo104595c();
                        Objects.requireNonNull(c3, "null cannot be cast to non-null type kotlin.Long");
                        valueOf = Long.valueOf(C65460eo.m117181a(f, a5, ((Long) c3).longValue()));
                    } else if (i == 4) {
                        String a6 = a2.mo104593a();
                        C89219l.m154716b(a6, "");
                        Object c4 = a2.mo104595c();
                        Objects.requireNonNull(c4, "null cannot be cast to non-null type kotlin.Float");
                        valueOf = Float.valueOf(C65460eo.m117179a(f, a6, ((Float) c4).floatValue()));
                    } else if (i == 5) {
                        String a7 = a2.mo104593a();
                        C89219l.m154716b(a7, "");
                        valueOf = C65460eo.m117184a(f, a7);
                    }
                    C65406cr crVar = eoVar.f147643a;
                    C65406cr.EnumC65408b b2 = a2.mo104594b();
                    if (b2 != null) {
                        int i2 = C65463ep.f147651d[b2.ordinal()];
                        if (i2 == 1) {
                            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.Boolean");
                            crVar.mo104585a(a2, ((Boolean) valueOf).booleanValue());
                        } else if (i2 == 2) {
                            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.Int");
                            crVar.mo104582a(a2, ((Integer) valueOf).intValue());
                        } else if (i2 == 3) {
                            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.Long");
                            crVar.mo104583a(a2, ((Long) valueOf).longValue());
                        } else if (i2 == 4) {
                            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.Float");
                            crVar.mo104581a(a2, ((Float) valueOf).floatValue());
                        } else if (i2 == 5) {
                            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.String");
                            crVar.mo104584a(a2, (String) valueOf);
                        }
                    }
                }
                throw new C89376n();
            }
        }
        C72464a aVar = C72464a.f162451c;
        C72464a.f162450b = true;
        aVar.mo114735a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService
    public void setDefaultFilterForCamera(int i, int i2) {
        if (i == 0) {
            C63244g.m114602a().mo73277e().setBackCameraFilter(i2);
        } else {
            C63244g.m114602a().mo73277e().setFrontCameraFilter(i2);
        }
    }

    private int getAsInt(C28022o oVar, String str, int i) {
        try {
            C28025r d = oVar.mo46804d(str);
            if (d != null) {
                if (!(d.f65806a instanceof Boolean)) {
                    i = d.mo46694g();
                } else if (d.mo46695h()) {
                    i = 1;
                } else {
                    i = 0;
                }
                m120107xced628cc("AVSettingsServiceImpl", C1764a.m5929a(Locale.getDefault(), "%s: %d", new Object[]{str, Integer.valueOf(i)}));
            }
        } catch (Exception e) {
            m120106xced628c8("AVSettingsServiceImpl", str, e);
            e.printStackTrace();
        }
        return i;
    }

    private boolean getAsBoolean(C28022o oVar, String str, boolean z) {
        try {
            C28025r d = oVar.mo46804d(str);
            if (d != null) {
                if (!(d.f65806a instanceof Number)) {
                    z = d.mo46695h();
                } else if (d.mo46688b().intValue() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                m120107xced628cc("AVSettingsServiceImpl", C1764a.m5929a(Locale.getDefault(), "%s: %b", new Object[]{str, Boolean.valueOf(z)}));
            }
        } catch (Exception e) {
            m120106xced628c8("AVSettingsServiceImpl", str, e);
            e.printStackTrace();
        }
        return z;
    }
}
