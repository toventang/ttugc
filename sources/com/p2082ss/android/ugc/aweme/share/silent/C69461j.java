package com.p2082ss.android.ugc.aweme.share.silent;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.widget.CanCancelRadioButton;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.share.silent.C69471s;
import com.p2082ss.android.ugc.aweme.share.silent.p3775b.C69446a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69583c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.share.silent.j */
public class C69461j extends AbstractC69445b {

    /* renamed from: a */
    String f155165a = "";

    /* renamed from: b */
    ImageView f155166b;

    /* renamed from: c */
    LinearLayout f155167c;

    /* renamed from: d */
    RadioGroup f155168d;

    /* renamed from: e */
    CanCancelRadioButton f155169e;

    /* renamed from: f */
    CanCancelRadioButton f155170f;

    /* renamed from: i */
    CanCancelRadioButton f155171i;

    /* renamed from: j */
    TextView f155172j;

    /* renamed from: k */
    public int f155173k = 44;

    /* renamed from: l */
    public int f155174l = 30;

    /* renamed from: m */
    private C17197a f155175m;

    /* renamed from: n */
    private int f155176n;

    /* renamed from: o */
    private boolean f155177o;

    /* renamed from: p */
    private int f155178p;

    static {
        Covode.recordClassIndex(81799);
    }

    /* access modifiers changed from: protected */
    public int getLayoutResId() {
        if (this.f155176n == 0) {
            return R.layout.azg;
        }
        return R.layout.ayi;
    }

    private String getUserName() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin.getCurrentUser() == null) {
            return "";
        }
        return createIUserServicebyMonsterPlugin.getCurrentUser().getNickname();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo109713b() {
        boolean z;
        if (this.f155168d.getCheckedRadioButtonId() == R.id.yr) {
            z = true;
        } else {
            z = false;
        }
        m122674a(z, "download");
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69445b
    public int getSaveUploadType() {
        RadioGroup radioGroup = this.f155168d;
        if (radioGroup == null) {
            return 0;
        }
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        if (checkedRadioButtonId == R.id.yr) {
            return 1;
        }
        if (checkedRadioButtonId == R.id.xy) {
            return 2;
        }
        if (checkedRadioButtonId == R.id.xz) {
            return 3;
        }
        return 0;
    }

    /* renamed from: g */
    private boolean m122677g() {
        if (AVExternalServiceImpl.m113114a().configService().avsettingsConfig().enableSaveUploadVideo()) {
            return true;
        }
        setVisibility(8);
        this.f155168d.setVisibility(8);
        C33842s.C33843a.f80132a.mo60066j().mo59940b(0);
        return false;
    }

    private boolean getTwitterRealStatus() {
        if (!C31575b.m65865g().getCurUser().isHasTwitterToken() || C31575b.m65865g().getCurUser().isTwitterExpire() || !SharePrefCache.inst().getAutoSendTwitter().mo59941c().booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private boolean m122678h() {
        if (!SettingsManager.m29616a().mo25400a("disable_save_at_post", false)) {
            return true;
        }
        this.f155169e.setVisibility(8);
        C33842s.C33843a.f80132a.mo60066j().mo59940b(0);
        return false;
    }

    /* renamed from: a */
    public final void mo109711a() {
        if (!this.f155177o) {
            this.f155177o = true;
            AVExternalServiceImpl.m113114a().publishService().cancelSynthetise(getContext());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69445b
    /* renamed from: c */
    public final String mo109682c() {
        ArrayList arrayList = new ArrayList();
        if (m122675a(this.f155166b)) {
            arrayList.add(101);
        }
        int saveUploadType = getSaveUploadType();
        if (saveUploadType != 0) {
            arrayList.add(Integer.valueOf(saveUploadType));
        }
        return C69446a.m122653a(";", arrayList);
    }

    private String getUserAvatarUrl() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin.getCurrentUser() == null || createIUserServicebyMonsterPlugin.getCurrentUser().getAvatarMedium() == null || createIUserServicebyMonsterPlugin.getCurrentUser().getAvatarMedium().getUrlList() == null || createIUserServicebyMonsterPlugin.getCurrentUser().getAvatarMedium().getUrlList().size() == 0) {
            return "";
        }
        return createIUserServicebyMonsterPlugin.getCurrentUser().getAvatarMedium().getUrlList().get(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo109715e() {
        boolean z;
        if (SharePrefCache.inst().getIsAwemePrivate().mo59941c().booleanValue()) {
            new C79459a(getContext()).mo123052a(getContext().getString(R.string.ete)).mo123053a();
            return;
        }
        if (this.f155168d.getCheckedRadioButtonId() == R.id.xz) {
            z = true;
        } else {
            z = false;
        }
        m122674a(z, "ins_story");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo109716f() {
        boolean z;
        if (SharePrefCache.inst().getIsAwemePrivate().mo59941c().booleanValue()) {
            new C79459a(getContext()).mo123052a(getContext().getString(R.string.ete)).mo123053a();
            return;
        }
        if (this.f155168d.getCheckedRadioButtonId() == R.id.xy) {
            z = true;
        } else {
            z = false;
        }
        m122674a(z, "ins");
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69445b
    /* renamed from: a */
    public final void mo109678a(CanCancelRadioButton.AbstractC34737a aVar) {
        this.f155169e.f82026b.add(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69445b
    public void setSyncShareViewTextColor(int i) {
        TextView textView = this.f155172j;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69445b
    public void setSyncShareViewTextSize(float f) {
        TextView textView = this.f155172j;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69445b
    public void setSyncShareViewTitle(String str) {
        TextView textView = this.f155172j;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: a */
    private static String m122673a(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69445b
    public void setSaveLocalEnabled(boolean z) {
        int i;
        CanCancelRadioButton canCancelRadioButton = this.f155169e;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        canCancelRadioButton.setVisibility(i);
    }

    /* renamed from: a */
    private static boolean m122675a(ImageView imageView) {
        if (imageView == null || imageView.getAlpha() != 1.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m122676b(boolean z) {
        if (z) {
            int checkedRadioButtonId = this.f155168d.getCheckedRadioButtonId();
            this.f155170f.setCanChecked(false);
            this.f155171i.setCanChecked(false);
            if (checkedRadioButtonId == this.f155170f.getId() || checkedRadioButtonId == this.f155171i.getId()) {
                this.f155168d.check(-1);
                return;
            }
            return;
        }
        this.f155170f.setCanChecked(true);
        this.f155171i.setCanChecked(true);
    }

    public void setSilentShareChannelDrawable(Context context) {
        this.f155169e.setBackground(C69471s.C69472a.m122692a(context, R.raw.icon_arrow_to_down, R.raw.icon_color_download_circle, this.f155173k, this.f155174l));
        this.f155170f.setBackground(C69471s.C69472a.m122692a(context, R.raw.icon_instagram, R.raw.icon_color_instagram_circle, this.f155173k, this.f155174l));
        this.f155171i.setBackground(C69471s.C69472a.m122692a(context, R.raw.icon_instagram_story, R.raw.icon_color_instagram_story_circle, this.f155173k, this.f155174l));
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69445b
    public void setSyncIconSize(int i) {
        ViewGroup.LayoutParams layoutParams = this.f155166b.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        ViewGroup.LayoutParams layoutParams2 = this.f155170f.getLayoutParams();
        layoutParams2.width = i;
        layoutParams2.height = i;
        ViewGroup.LayoutParams layoutParams3 = this.f155171i.getLayoutParams();
        layoutParams3.width = i;
        layoutParams3.height = i;
        ViewGroup.LayoutParams layoutParams4 = this.f155169e.getLayoutParams();
        layoutParams4.width = i;
        layoutParams4.height = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69445b
    /* renamed from: a */
    public final void mo109675a(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.f155178p = i;
        SharePrefCache.inst().getIsAwemePrivate().mo59940b(Boolean.valueOf(z));
        ShareDependService.C68822a.m121324a().mo109336a(getContext(), z);
        m122676b(z);
        if (z) {
            mo109712a(this.f155166b, false);
        } else {
            mo109712a(this.f155166b, getTwitterRealStatus());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo109714b(View view) {
        if (view.getId() != R.id.zd) {
            return;
        }
        if (m122675a(this.f155166b)) {
            mo109712a(this.f155166b, false);
            SharePrefCache.inst().getAutoSendTwitter().mo59940b(false);
            m122674a(false, "twitter");
        } else if (SharePrefCache.inst().getIsAwemePrivate().mo59941c().booleanValue()) {
            if (this.f155178p == 2) {
                new C79459a(getContext()).mo123052a(getContext().getString(R.string.a8w)).mo123053a();
            } else {
                new C79459a(getContext()).mo123052a(getContext().getString(R.string.ete)).mo123053a();
            }
        } else if (!C31575b.m65865g().getCurUser().isHasTwitterToken() || C31575b.m65865g().getCurUser().isTwitterExpire()) {
            this.f155175m.mo27184b();
            C39162r.onEvent(MobClick.obtain().setEventName("sync_permission").setLabelName("show"));
        } else {
            mo109712a(this.f155166b, true);
            SharePrefCache.inst().getAutoSendTwitter().mo59940b(true);
            m122674a(true, "twitter");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo109708a(View view) {
        this.f155172j = (TextView) view.findViewById(R.id.edt);
    }

    public C69461j(Context context) {
        super(context);
        boolean z;
        boolean z2 = false;
        this.f155176n = 0;
        View a = C1764a.m5927a(LayoutInflater.from(context), getLayoutResId(), this, true);
        this.f155166b = (ImageView) a.findViewById(R.id.zd);
        this.f155167c = (LinearLayout) a.findViewById(R.id.c35);
        this.f155168d = (RadioGroup) a.findViewById(R.id.ddv);
        this.f155169e = (CanCancelRadioButton) a.findViewById(R.id.yr);
        this.f155170f = (CanCancelRadioButton) a.findViewById(R.id.xy);
        this.f155171i = (CanCancelRadioButton) a.findViewById(R.id.xz);
        View findViewById = a.findViewById(R.id.zd);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC69463k(this));
        }
        mo109708a(a);
        setSilentShareChannelDrawable(context);
        if (!m122677g()) {
            a.setVisibility(8);
        } else if (m122678h()) {
            SharePrefCache inst = SharePrefCache.inst();
            mo109712a(this.f155166b, getTwitterRealStatus());
            SharePrefCache.inst().getAutoSendTwitter().mo59940b(Boolean.valueOf(getTwitterRealStatus()));
            if (inst.getIsAwemePrivate().mo59941c().booleanValue()) {
                mo109712a(this.f155166b, false);
            }
            C17197a.C17200a aVar = new C17197a.C17200a(getContext());
            if (C31575b.m65865g().getCurUser().isHasTwitterToken()) {
                aVar.f41071b = getContext().getString(R.string.cb_, "Twitter");
            } else {
                aVar.f41071b = getContext().getString(R.string.cb9, "Twitter", "Twitter");
            }
            aVar.mo27192a(getContext().getString(R.string.cb7), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC69464l(this), false);
            aVar.mo27196b(getContext().getString(R.string.cb8), DialogInterface$OnClickListenerC69465m.f155182a, false);
            this.f155175m = aVar.mo27193a();
            if (m122677g() && m122678h()) {
                AbstractC69581b a2 = C69583c.m122807a("instagram", null);
                if (a2 == null || !a2.mo109557b(getContext())) {
                    this.f155170f.setVisibility(8);
                    z = false;
                } else {
                    z = true;
                }
                AbstractC69581b a3 = C69583c.m122807a("instagram_story", null);
                if (a3 == null || !a3.mo109557b(getContext())) {
                    this.f155171i.setVisibility(8);
                } else {
                    z2 = true;
                }
                if (!AVExternalServiceImpl.m113114a().configService().avsettingsConfig().enableUploadSyncTwitter()) {
                    this.f155166b.setVisibility(8);
                }
                int intValue = C33842s.C33843a.f80132a.mo60066j().mo59941c().intValue();
                if (intValue == 1) {
                    this.f155169e.setChecked(true);
                } else if (intValue != 2) {
                    if (intValue != 3) {
                        this.f155168d.clearCheck();
                    } else if (!z2) {
                        C33842s.C33843a.f80132a.mo60066j().mo59940b(0);
                    } else {
                        this.f155171i.setChecked(true);
                    }
                } else if (!z) {
                    C33842s.C33843a.f80132a.mo60066j().mo59940b(0);
                } else {
                    this.f155170f.setChecked(true);
                }
                if (SharePrefCache.inst().getIsAwemePrivate().mo59941c().booleanValue()) {
                    m122676b(true);
                }
            }
            this.f155170f.setOnClickListener(new View$OnClickListenerC69466n(this));
            this.f155171i.setOnClickListener(new View$OnClickListenerC69467o(this));
            this.f155169e.setOnClickListener(new View$OnClickListenerC69468p(this));
            this.f155168d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                /* class com.p2082ss.android.ugc.aweme.share.silent.C69461j.C694621 */

                static {
                    Covode.recordClassIndex(81800);
                }

                public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                    if (i == R.id.yr) {
                        C33842s.C33843a.f80132a.mo60066j().mo59940b(1);
                        C69461j.this.mo109711a();
                        SharePrefCache.inst().getAutoSaveVideo().mo59940b(true);
                    } else if (i == R.id.xy) {
                        C33842s.C33843a.f80132a.mo60066j().mo59940b(2);
                        C69461j.this.mo109711a();
                        SharePrefCache.inst().getAutoSaveVideo().mo59940b(true);
                    } else if (i == R.id.xz) {
                        C33842s.C33843a.f80132a.mo60066j().mo59940b(3);
                        C69461j.this.mo109711a();
                        SharePrefCache.inst().getAutoSaveVideo().mo59940b(true);
                    } else {
                        C33842s.C33843a.f80132a.mo60066j().mo59940b(0);
                        SharePrefCache.inst().getAutoSaveVideo().mo59940b(false);
                    }
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69445b
    /* renamed from: a */
    public final void mo109679a(boolean z) {
        this.f155169e.setChecked(z);
        if (z) {
            this.f155168d.check(R.id.yr);
        } else if (this.f155168d.getCheckedRadioButtonId() == R.id.yr) {
            this.f155168d.clearCheck();
        }
    }

    /* renamed from: a */
    private void m122674a(boolean z, String str) {
        String str2;
        Object tag = getTag();
        if (tag instanceof Map) {
            Map map = (Map) tag;
            if (z) {
                str2 = "publish_share_confirm";
            } else {
                str2 = "publish_share_cancel";
            }
            C39162r.m79460a(str2, new C33744d().mo59983a("creation_id", m122673a(map.get("creation_id"))).mo59983a("enter_from", m122673a(map.get("enter_from"))).mo59983a("content_type", m122673a(map.get("content_type"))).mo59983a("shoot_way", m122673a(map.get("shoot_way"))).mo59983a("share_to", str).f79943a);
            if (z) {
                mo109697d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo109712a(ImageView imageView, boolean z) {
        if (imageView.getId() == R.id.zd) {
            imageView.setImageDrawable(C69471s.C69472a.m122692a(getContext(), R.raw.icon_twitter, R.raw.icon_color_twitter_circle, this.f155173k, this.f155174l));
        }
        if (z) {
            imageView.setAlpha(1.0f);
        } else {
            imageView.setAlpha(0.99f);
        }
    }
}
