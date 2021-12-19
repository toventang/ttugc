package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.video;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.tux.navigation.AbstractC23185a;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.AbstractC23190d;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.C43047dm;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.comment.p2485b.C36294a;
import com.p2082ss.android.ugc.aweme.commerce.C37437a;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.InteractPermission;
import com.p2082ss.android.ugc.aweme.internal.CrossLanguageUserExperiment;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.AdCommentService;
import com.p2082ss.android.ugc.aweme.p2310al.C33489d;
import com.p2082ss.android.ugc.aweme.p2386be.C34800h;
import com.p2082ss.android.ugc.aweme.p2727db.C40945h;
import com.p2082ss.android.ugc.aweme.qna.services.QnaService;
import com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig;
import com.p2082ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.p2082ss.android.ugc.aweme.services.function.IFunctionKey;
import com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC69923ce;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71896b;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.utils.C80636z;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.video.a */
public final class C39986a extends Fragment implements AbstractC23185a, AbstractC68350b, AbstractC68351c {

    /* renamed from: s */
    static final String f93980s = (AVApiImpl.m123134b().mo109850a() + "/aweme/v1/aweme/react_duet/set/limit/");

    /* renamed from: x */
    private static final String f93981x = (AVApiImpl.m123134b().mo109850a() + "/tiktok/v1/caption/cla/");

    /* renamed from: a */
    public IPrivacyConfig.IPermissionSettingItem f93982a;

    /* renamed from: b */
    IPrivacyConfig.IPermissionModule f93983b;

    /* renamed from: c */
    public Aweme f93984c;

    /* renamed from: d */
    C39088c f93985d;

    /* renamed from: e */
    boolean f93986e = true;

    /* renamed from: f */
    boolean f93987f = true;

    /* renamed from: g */
    boolean f93988g = true;

    /* renamed from: h */
    boolean f93989h;

    /* renamed from: i */
    C40945h f93990i;

    /* renamed from: j */
    C40945h f93991j;

    /* renamed from: k */
    C40945h f93992k;

    /* renamed from: l */
    C40945h f93993l;

    /* renamed from: m */
    C40945h f93994m;

    /* renamed from: n */
    String f93995n = "";

    /* renamed from: o */
    String f93996o = "";

    /* renamed from: p */
    String f93997p = "";

    /* renamed from: q */
    boolean f93998q;

    /* renamed from: r */
    boolean f93999r;

    /* renamed from: t */
    private TextView f94000t;

    /* renamed from: u */
    private C68348f f94001u;

    /* renamed from: v */
    private C39088c f94002v;

    /* renamed from: w */
    private C43047dm f94003w;

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
    /* renamed from: a */
    public final void mo68832a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b
    public final void aD_() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ C89391z mo69181j() {
        mo69176d();
        return C89391z.f203057a;
    }

    /* renamed from: k */
    private static boolean m80963k() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo69180i() {
        C68348f fVar = this.f94001u;
        if (fVar == null || fVar.f153000v != 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        AdCommentService.m67912b().mo58993a();
    }

    /* renamed from: e */
    public static boolean m80960e() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean k = m80963k();
        C58029j.f132256h = k;
        return k;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b
    public final void cm_() {
        this.f93986e = !this.f93986e;
        this.f93990i.mo70126a(new C40001am(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo69179h() {
        Aweme aweme = this.f93984c;
        if (aweme == null || aweme.getCommerceVideoAuthInfo() == null || !this.f93984c.getCommerceVideoAuthInfo().isAdvPromotable()) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AbstractC81915c.m141874a(new C33489d(false, true));
        this.f93985d.ck_();
    }

    static {
        Covode.recordClassIndex(47752);
    }

    /* renamed from: c */
    public final boolean mo69175c() {
        Aweme aweme = this.f93984c;
        if (aweme == null || aweme.getInteractStickerStructs() == null) {
            return false;
        }
        for (InteractStickerStruct interactStickerStruct : this.f93984c.getInteractStickerStructs()) {
            if (interactStickerStruct.getQaStruct() != null && TextUtils.equals(Long.toString(interactStickerStruct.getQaStruct().getItemId()), this.f93984c.getAid())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo69176d() {
        String str;
        getContext();
        if (!m80960e()) {
            mo69174c(R.string.dcp);
            return;
        }
        if (m80962f(this.f93984c) == 0) {
            if (this.f93987f) {
                this.f93987f = false;
            } else {
                this.f93987f = true;
            }
            this.f93991j.mo70126a(new C40021e(this));
            C33744d dVar = new C33744d();
            if (this.f93987f) {
                str = "on";
            } else {
                str = "off";
            }
            C39162r.m79460a("disable_video_duet", dVar.mo59983a("to_status", str).f79943a);
        }
        C1731i.m5640b(new CallableC40026j(this), C1731i.f5562a).mo5534a(new C40027k(this), C1731i.f5564c, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo69177f() {
        getContext();
        if (!m80960e()) {
            mo69174c(R.string.dcp);
            return;
        }
        this.f93989h = !this.f93989h;
        this.f93993l.mo70126a(new C40023g(this));
        String aid = this.f93984c.getAid();
        boolean z = this.f93989h;
        Object a = RetrofitFactory.m33635a().mo28817b(Api.f79771d).mo28832d().mo28858a(ToggleAutoCaptionApi.class);
        C89219l.m154716b(a, "");
        ((ToggleAutoCaptionApi) a).toggleAutoCaptionSetting(aid, z).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C40024h(this, z), new C40025i(this, z));
    }

    @Override // com.bytedance.tux.navigation.AbstractC23185a
    /* renamed from: a */
    public final TuxNavBar.C23179a mo37737a() {
        return new TuxNavBar.C23179a().mo37733b(new C23187b().mo37738a(R.raw.icon_x_mark_small).mo37740a((AbstractC23190d) new C40015b(this))).mo37731a(new C23194g().mo37753a(getString(R.string.es4)));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00be  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69178g() {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.privacy.settings.video.C39986a.mo69178g():void");
    }

    /* renamed from: c */
    static int m80957c(Aweme aweme) {
        InteractPermission interactPermission = aweme.getInteractPermission();
        if (interactPermission == null) {
            return 0;
        }
        return interactPermission.getStitchPrivacySettingControl();
    }

    /* renamed from: f */
    private static int m80962f(Aweme aweme) {
        InteractPermission interactPermission = aweme.getInteractPermission();
        if (interactPermission == null) {
            return 0;
        }
        return interactPermission.getDuetPrivacySettingControl();
    }

    /* renamed from: a */
    public static boolean m80954a(Aweme aweme) {
        if (aweme.getCommerceVideoAuthInfo() == null) {
            return false;
        }
        return aweme.getCommerceVideoAuthInfo().isPreventSelfSee();
    }

    /* renamed from: b */
    public static String m80955b(Aweme aweme) {
        if (aweme.getCommerceVideoAuthInfo() == null || aweme.getCommerceVideoAuthInfo().getPreventPrivacyReason() == null) {
            return "";
        }
        return aweme.getCommerceVideoAuthInfo().getPreventPrivacyReason();
    }

    /* renamed from: c */
    private void m80958c(String str) {
        Fragment fragment;
        if (getParentFragment() instanceof C23226a) {
            fragment = getParentFragment();
        } else {
            fragment = this;
        }
        new C23144b(fragment).mo37635a(str).mo37637b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC81915c.m141874a(new C33489d(true, true));
        C39088c<AbstractC39085b<BaseResponse>, AbstractC68350b> t = SettingServiceImpl.m120782v().mo108884t();
        this.f93985d = t;
        t.mo67839a_(this);
    }

    /* renamed from: b */
    private void m80956b(String str) {
        if (this.f93989h) {
            mo69177f();
        }
        this.f93989h = false;
        this.f93993l.mo70126a(C39996ah.f94016a);
        this.f93993l.mo70126a(new C39997ai(this, str));
    }

    /* renamed from: d */
    private static boolean m80959d(Aweme aweme) {
        List<InteractStickerStruct> interactStickerStructs;
        if (!(aweme == null || (interactStickerStructs = aweme.getInteractStickerStructs()) == null || interactStickerStructs.isEmpty())) {
            for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                if (interactStickerStruct.getType() == 16) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m80961e(Aweme aweme) {
        if (!(aweme == null || aweme.getInteractStickerStructs() == null || aweme.getInteractStickerStructs().size() <= 0)) {
            for (InteractStickerStruct interactStickerStruct : aweme.getInteractStickerStructs()) {
                if (!(interactStickerStruct.getCaptionStruct() == null || C13603b.m24435a((Collection) interactStickerStruct.getCaptionStruct().getAutoCaptions()))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo69174c(int i) {
        Fragment fragment;
        if (getParentFragment() instanceof C23226a) {
            fragment = getParentFragment();
        } else {
            fragment = this;
        }
        new C23144b(fragment).mo37640e(i).mo37637b();
    }

    /* renamed from: a */
    private void m80953a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f94000t.setVisibility(8);
            return;
        }
        if (this.f94000t.getVisibility() != 0) {
            this.f94000t.setVisibility(0);
        }
        this.f94000t.setText(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Void mo69172b(C1731i iVar) {
        String str;
        int i = 1;
        if (iVar.mo5544c()) {
            if (iVar.mo5546e() instanceof C34485a) {
                C34485a aVar = (C34485a) iVar.mo5546e();
                if (aVar.getErrorCode() == 3004044) {
                    m80958c(aVar.getErrorMsg());
                    return null;
                }
            }
            mo69174c(R.string.dcp);
            this.f93987f = !this.f93987f;
            this.f93991j.mo70126a(new C40010av(this));
        } else {
            if (!(this.f93984c.getDuetSetting() == 0 || this.f93984c.getReactSetting() == 0)) {
                i = 0;
            }
            this.f93984c.setDuetSetting(i);
            this.f93984c.setReactSetting(i);
            AbstractC81915c.m141874a(new C71896b(this.f93984c));
            C33744d a = new C33744d().mo59983a("group_id", this.f93984c.getAid()).mo59983a("enter_from", "personal_homepage");
            if (this.f93984c.getDuetSetting() == 0 || this.f93984c.getReactSetting() == 0) {
                str = "on";
            } else {
                str = "off";
            }
            C39162r.m79460a("click_react_duet_control", a.mo59983a("to_status", str).f79943a);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo69170a(C1731i iVar) {
        int i = 1;
        if (iVar.mo5544c()) {
            if (iVar.mo5546e() instanceof C34485a) {
                C34485a aVar = (C34485a) iVar.mo5546e();
                if (aVar.getErrorCode() == 3004045) {
                    m80958c(aVar.getErrorMsg());
                    return null;
                }
            }
            mo69174c(R.string.dcp);
            this.f93988g = !this.f93988g;
            this.f93992k.mo70126a(new C40008at(this));
        } else {
            if (this.f93984c.getStitchSetting() != 0) {
                i = 0;
            }
            this.f93984c.setStitchSetting(i);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo69173b(int i) {
        String str;
        String aid;
        boolean isSecret = C31575b.m65865g().getCurUser().isSecret();
        if (i != 0) {
            if (i == 1) {
                str = "private";
            } else if (i != 2) {
                str = "";
            } else {
                str = "friend";
            }
        } else if (isSecret) {
            str = "followers";
        } else {
            str = "public";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("to_status", str);
            }
            if (this.f93984c.getAwemeType() == 2) {
                jSONObject.put("is_photo", 1);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        MobClick labelName = MobClick.obtain().setEventName("scope_control").setLabelName("share_option");
        Aweme aweme = this.f93984c;
        if (aweme == null) {
            aid = "0";
        } else {
            aid = aweme.getAid();
        }
        C39162r.onEvent(labelName.setValue(aid).setJsonObject(jSONObject));
        C33744d a = new C33744d().mo59983a("group_id", this.f93984c.getAid()).mo59983a("enter_from", this.f93996o).mo59983a("impr_id", this.f93997p);
        if (TextUtils.equals(str, "friend")) {
            str = str + "s";
        }
        a.mo59983a("to_status", str);
        if (TextUtils.equals(this.f93996o, "personal_homepage")) {
            a.mo59983a("tab_name", this.f93995n);
        }
        a.mo59980a("is_private", isSecret ? 1 : 0);
        C39162r.m79460a("select_privacy_setting_video", a.f79943a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo69171a(int i) {
        boolean z;
        if (getContext() != null) {
            if (i != 0) {
                m80956b(getContext().getResources().getString(R.string.b1y));
                return;
            }
            Aweme aweme = this.f93984c;
            if (aweme == null || aweme.getVideo() == null || this.f93984c.getVideo().getCaptionModel() == null || this.f93984c.getVideo().getCaptionModel().getEnableAutoCaption() != 0) {
                Aweme aweme2 = this.f93984c;
                if (aweme2 == null || aweme2.getVideo() == null || this.f93984c.getVideo().getCaptionModel() == null || this.f93984c.getVideo().getCaptionModel().getHasOriginalAudio() <= 0 || this.f93984c.getVideo().getCaptionModel().getEnableAutoCaption() == 0) {
                    m80956b(getContext().getResources().getString(R.string.b1x));
                    return;
                }
                if (this.f93984c.getVideo().getCaptionModel().getEnableAutoCaption() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f93989h = z;
                this.f93993l.mo70126a(new C39994af(this));
                this.f93993l.mo70126a(new C39995ag(this));
                return;
            }
            m80956b(getContext().getResources().getString(R.string.b1w));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
    /* renamed from: a */
    public final void mo68831a(C68348f fVar) {
        this.f94001u = fVar;
        mo69178g();
        if (this.f93984c.getAwemeType() != 40 && this.f93994m != null && !mo69180i()) {
            this.f93994m.mo70126a(C40002an.f94023a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C37437a commerceVideoAuthInfo;
        int missionItemStatus;
        C37437a commerceVideoAuthInfo2;
        boolean z;
        boolean z2;
        MethodCollector.m26663i(10943);
        super.onViewCreated(view, bundle);
        this.f94003w = new C43047dm((PowerList) view.findViewById(R.id.d54));
        boolean z3 = true;
        this.f93990i = new C40945h(new C34800h(getString(R.string.sj), new View$OnClickListenerC40019c(this), true, new C40030n(this)));
        this.f93991j = new C40945h(new C34800h(getString(R.string.sq), new View$OnClickListenerC40041y(this), true, new C39998aj(this)));
        this.f93992k = new C40945h(new C34800h(getString(R.string.st), new View$OnClickListenerC40009au(this), false, new C40013ay(this)));
        this.f93993l = new C40945h(new C34800h(getString(R.string.b1z), (View.OnClickListener) null));
        this.f93994m = new C40945h(new C34800h(getString(R.string.sn), (View.OnClickListener) new View$OnClickListenerC40014az(this)));
        this.f94003w.mo73247a(this.f93990i);
        Aweme aweme = this.f93984c;
        if (!(aweme == null || aweme.getAwemeType() == 40)) {
            this.f94003w.mo73247a(this.f93991j);
            this.f94003w.mo73247a(this.f93992k);
            this.f94003w.mo73247a(this.f93993l);
            this.f94003w.mo73247a(this.f93994m);
        }
        FrameLayout frameLayout = (FrameLayout) getView().findViewById(R.id.cpi);
        Aweme aweme2 = this.f93984c;
        if (aweme2 == null || aweme2.getAwemeType() != 40) {
            IPrivacyConfig.IPermissionSettingItem createPermissionSettingItem = AVExternalServiceImpl.m113114a().configService().privacyConfig().createPermissionSettingItem(getContext());
            this.f93982a = createPermissionSettingItem;
            createPermissionSettingItem.setAdvPromotable(mo69179h());
            IPrivacyConfig.IPermissionSettingItem iPermissionSettingItem = this.f93982a;
            Aweme aweme3 = this.f93984c;
            if (aweme3 == null || (commerceVideoAuthInfo = aweme3.getCommerceVideoAuthInfo()) == null) {
                missionItemStatus = 0;
            } else {
                missionItemStatus = commerceVideoAuthInfo.getMissionItemStatus();
            }
            Aweme aweme4 = this.f93984c;
            String str = "0";
            if (!(aweme4 == null || (commerceVideoAuthInfo2 = aweme4.getCommerceVideoAuthInfo()) == null)) {
                str = String.valueOf(commerceVideoAuthInfo2.getMissionId());
            }
            iPermissionSettingItem.setMission(missionItemStatus, str);
            this.f93982a.asView().setId(R.id.cph);
            this.f93982a.asView().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(this.f93982a.asView());
            this.f93982a.getPrivateIcon().setVisibility(8);
            TextView privateHint = this.f93982a.getPrivateHint();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            privateHint.setLayoutParams(layoutParams);
            if (C80636z.m139817b(this.f93984c)) {
                this.f93982a.setPermission(0, m80954a(this.f93984c), m80955b(this.f93984c));
            } else if (C80636z.m139818c(this.f93984c)) {
                this.f93982a.setPermission(2, m80954a(this.f93984c), m80955b(this.f93984c));
            } else if (C80636z.m139819d(this.f93984c)) {
                this.f93982a.setPermission(1, m80954a(this.f93984c), m80955b(this.f93984c));
            }
        } else {
            frameLayout.setVisibility(8);
        }
        Aweme aweme5 = this.f93984c;
        if (!(aweme5 == null || aweme5.getAwemeType() == 40 || C13603b.m24435a((Collection) this.f93984c.getGeofencingRegions()))) {
            IPrivacyConfig.IPermissionSettingItem iPermissionSettingItem2 = this.f93982a;
            if (iPermissionSettingItem2 != null) {
                View asView = iPermissionSettingItem2.asView();
                this.f93982a.setPermission(0, m80954a(this.f93984c), m80955b(this.f93984c));
                asView.setAlpha(0.4f);
                asView.setEnabled(false);
            }
            C40945h hVar = this.f93991j;
            if (hVar != null) {
                hVar.mo70126a(C40037u.f94063a);
            }
            C40945h hVar2 = this.f93992k;
            if (hVar2 != null) {
                hVar2.mo70126a(C40038v.f94064a);
            }
            C40945h hVar3 = this.f93993l;
            if (hVar3 != null) {
                hVar3.mo70126a(C40039w.f94065a);
            }
            AVExternalServiceImpl.m113114a().configService().geoFencingConfig().injectGeoFencingSettingItem(this.f93984c, (FrameLayout) getView().findViewById(R.id.cpg), this);
        }
        this.f94000t = (TextView) getView().findViewById(R.id.em4);
        Aweme aweme6 = this.f93984c;
        if (aweme6 == null || aweme6.getCommentSetting() == C36294a.f85802a) {
            z = true;
        } else {
            z = false;
        }
        this.f93986e = z;
        this.f93990i.mo70126a(new C39999ak(this));
        if (this.f93984c != null) {
            AdCommentService.m67912b().mo58994a(this.f93984c.getAid(), new C39989aa(this));
        }
        C39088c<AbstractC39085b<C68348f>, AbstractC68351c> u = SettingServiceImpl.m120782v().mo108885u();
        this.f94002v = u;
        u.mo67839a_(this);
        this.f94002v.mo57616a(new Object[0]);
        Aweme aweme7 = this.f93984c;
        if (aweme7 == null || aweme7.getAwemeType() != 40) {
            IAVSettingsService avsettingsConfig = AVExternalServiceImpl.m113114a().configService().avsettingsConfig();
            boolean enableStitch = avsettingsConfig.enableStitch();
            this.f93998q = enableStitch;
            if (enableStitch) {
                this.f93992k.mo70126a(C40040x.f94066a);
            }
            if (m80961e(this.f93984c) || !CrossLanguageUserExperiment.m103003c().mo93972a()) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f93999r = z2;
            this.f93993l.mo70126a(new C40042z(this));
            avsettingsConfig.enableStitch();
            this.f93991j.mo70126a(new C39990ab(getString(R.string.sp)));
            Aweme aweme8 = this.f93984c;
            if (aweme8 != null) {
                if (aweme8.getDuetSetting() == 0 || this.f93984c.getReactSetting() == 0) {
                    this.f93987f = true;
                } else {
                    this.f93987f = false;
                }
                this.f93991j.mo70126a(new C39991ac(this));
                if (FunctionSupportService.INSTANCE.notSupport(IFunctionKey.DUET)) {
                    this.f93991j.mo70126a(C39992ad.f94012a);
                }
            }
            Aweme aweme9 = this.f93984c;
            if (aweme9 != null) {
                if (aweme9.getStitchSetting() != 0) {
                    z3 = false;
                }
                this.f93988g = z3;
                this.f93992k.mo70126a(new C39993ae(this));
            }
            mo69171a(this.f93984c.getStatus().getPrivateStatus());
            IAVSettingsService avsettingsConfig2 = AVExternalServiceImpl.m113114a().configService().avsettingsConfig();
            if (avsettingsConfig2.getPostDownloadSetting() && avsettingsConfig2.getEnablePublishPrivacySetting() == 2) {
                this.f93994m.mo70126a(new C40000al(this));
            }
        }
        m80952a(this.f93990i, UGCMonitor.EVENT_COMMENT, 0);
        Aweme aweme10 = this.f93984c;
        if (!(aweme10 == null || aweme10.getAwemeType() == 40)) {
            m80952a(this.f93991j, "duet", m80962f(this.f93984c));
            m80952a(this.f93992k, "stitch", m80957c(this.f93984c));
            m80952a(this.f93994m, "download", 0);
        }
        Aweme aweme11 = this.f93984c;
        if (!(aweme11 == null || aweme11.getAwemeType() == 40)) {
            IPrivacyConfig.IPermissionModule createPermissionModule = AVExternalServiceImpl.m113114a().configService().privacyConfig().createPermissionModule(getParentFragment(), this.f93982a, 0, m80959d(this.f93984c));
            this.f93983b = createPermissionModule;
            createPermissionModule.setupV2(new AbstractC69923ce() {
                /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.video.C39986a.C399871 */

                /* renamed from: b */
                private final boolean f94005b;

                static {
                    Covode.recordClassIndex(47753);
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC69923ce
                /* renamed from: d */
                public final String mo69185d() {
                    if (this.f94005b) {
                        return C39986a.this.getResources().getString(R.string.f2x);
                    }
                    return "";
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC69923ce
                /* renamed from: e */
                public final String mo69186e() {
                    if (this.f94005b) {
                        return C39986a.this.getResources().getString(R.string.f38);
                    }
                    return "";
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC69923ce
                /* renamed from: c */
                public final String mo69184c() {
                    if (C39986a.this.f93984c == null || C39986a.this.f93984c.playlist_info == null) {
                        return "";
                    }
                    String mixName = C39986a.this.f93984c.playlist_info.getMixName();
                    if (TextUtils.isEmpty(mixName)) {
                        return "";
                    }
                    if (this.f94005b) {
                        return C39986a.this.getResources().getString(R.string.f30, mixName);
                    }
                    return C1764a.m5928a(C39986a.this.getString(R.string.dgx), new Object[]{mixName});
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC69923ce
                /* renamed from: a */
                public final String mo69182a() {
                    if (!(C39986a.this.f93984c == null || C39986a.this.f93984c.playlist_info == null)) {
                        String mixId = C39986a.this.f93984c.playlist_info.getMixId();
                        String mixName = C39986a.this.f93984c.playlist_info.getMixName();
                        if (!TextUtils.isEmpty(mixId) && !TextUtils.isEmpty(mixName)) {
                            if (this.f94005b) {
                                return C39986a.this.getResources().getString(R.string.f2z, mixName);
                            }
                            return C39986a.this.getResources().getString(R.string.bxl) + C1764a.m5928a(C39986a.this.getResources().getString(R.string.dgx), new Object[]{mixName});
                        }
                    }
                    if (this.f94005b) {
                        return C39986a.this.getResources().getString(R.string.f2y);
                    }
                    return C39986a.this.getResources().getString(R.string.bxl);
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC69923ce
                /* renamed from: b */
                public final String mo69183b() {
                    if (!(C39986a.this.f93984c == null || C39986a.this.f93984c.playlist_info == null)) {
                        String mixId = C39986a.this.f93984c.playlist_info.getMixId();
                        String mixName = C39986a.this.f93984c.playlist_info.getMixName();
                        if (!TextUtils.isEmpty(mixId) && !TextUtils.isEmpty(mixName)) {
                            if (this.f94005b) {
                                return C39986a.this.getResources().getString(R.string.f2z, mixName);
                            }
                            return C39986a.this.getResources().getString(R.string.bxk) + C1764a.m5928a(C39986a.this.getResources().getString(R.string.dgx), new Object[]{mixName});
                        }
                    }
                    if (this.f94005b) {
                        return C39986a.this.getResources().getString(R.string.f2y);
                    }
                    return C39986a.this.getResources().getString(R.string.bxk);
                }

                {
                    boolean z;
                    if (!C39986a.this.mo69175c() || !QnaService.m117969a().enablePublicQna()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f94005b = z;
                }
            }, new C40016ba(this));
            mo69178g();
            if (bundle != null) {
                this.f93983b.restoreSavedInstanceState(bundle);
            }
        }
        MethodCollector.m26664o(10943);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.um, viewGroup, false);
    }

    /* renamed from: a */
    private void m80952a(C40945h hVar, String str, int i) {
        C39256o a = C39223a.m79590d().mo68613a(2, str);
        if (a != null) {
            int showType = a.getShowType();
            if (showType == 2 || i == 2) {
                hVar.mo70126a(C40032p.f94057a);
            } else if (i == 1) {
                hVar.mo70126a(C40033q.f94058a);
                hVar.mo70126a(C40034r.f94059a);
            } else if (showType == 1) {
                hVar.mo70126a(C40035s.f94060a);
                hVar.mo70126a(new C40036t(this, a));
            }
        }
    }
}
