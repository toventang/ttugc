package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.experiment.C46965gb;
import com.p2082ss.android.ugc.aweme.feed.C48311ag;
import com.p2082ss.android.ugc.aweme.feed.api.C48334h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.main.MainPageExperimentServiceImpl;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.p2082ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import com.p2082ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.aweme.video.preload.p4213a.C80826e;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import java.util.Collection;
import java.util.List;
import org.greenrobot.eventbus.AbstractC90253j;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder */
public class FullFeedVideoViewHolder extends VideoViewCell implements AbstractC90253j {

    /* renamed from: a */
    private long f111302a;

    static {
        Covode.recordClassIndex(56775);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: K */
    public boolean mo80077K() {
        return true;
    }

    /* renamed from: o */
    private boolean mo80074o() {
        return TextUtils.equals(mo80197ar(), "homepage_hot");
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: e */
    public final C48311ag mo70617e() {
        return new C48311ag(true, C80826e.m140220a().f180767a);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: g */
    public void mo80072g() {
        super.mo80072g();
        if (mo80074o()) {
            C48334h.m91798a().maybeMonitorTimeSpend(this.f111308j, Long.valueOf(this.f111302a));
        }
    }

    public FullFeedVideoViewHolder(C48238ce ceVar) {
        super(ceVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: b */
    public final void mo80094b(long j) {
        super.mo80094b(j);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: b */
    public final void mo80095b(boolean z) {
        if (TextUtils.equals(mo80197ar(), "homepage_follow")) {
            MainPageExperimentServiceImpl.m108379b();
        }
        super.mo80095b(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public void onRenderFirstFrame(C84216o oVar) {
        int i;
        super.onRenderFirstFrame(oVar);
        if (mo80074o()) {
            this.f111302a = System.currentTimeMillis();
        }
        Aweme aweme = this.f111308j;
        if (this.f111309k == 0) {
            i = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        } else {
            i = 0;
        }
        C1731i.m5631a((long) i).mo5534a(new C48140aa(this, AVExternalServiceImpl.m113114a().specialPlusService(), aweme), C1731i.f5562a, null).mo5538b(C48141ab.f111536a, C1731i.f5564c);
    }

    /* renamed from: a */
    static final /* synthetic */ C1731i m91085a(C1731i iVar) {
        try {
            if (TextUtils.equals((CharSequence) iVar.mo5545d(), "hide")) {
                new SuperEntranceEvent(3, false).post();
                return null;
            } else if (TextUtils.equals((CharSequence) iVar.mo5545d(), "show")) {
                new SuperEntranceEvent(3, true).post();
                return null;
            } else if (!TextUtils.equals((CharSequence) iVar.mo5545d(), "normal")) {
                return null;
            } else {
                new SuperEntranceEvent(0, false).post();
                return null;
            }
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: e */
    public final void mo80096e(Aweme aweme) {
        ISuperEntranceService superEntranceService;
        if (!C46965gb.f109453a && this.f111309k != 0 && C31575b.m65865g() != null) {
            if ((!C31575b.m65865g().isLogin() || !TextUtils.equals(this.f111308j.getAuthorUid(), C31575b.m65865g().getCurUserId())) && (superEntranceService = AVExternalServiceImpl.m113114a().superEntranceService()) != null && superEntranceService.shouldShowSuperEntranceRecord(mo80195ap())) {
                List<String> superEntranceEffectList = superEntranceService.getSuperEntranceEffectList();
                C75445g stickerEntranceInfo = aweme.getStickerEntranceInfo();
                if (stickerEntranceInfo != null && !C13603b.m24435a((Collection) superEntranceEffectList) && superEntranceEffectList.contains(stickerEntranceInfo.f169545id)) {
                    new SuperEntranceEvent(1, true).post();
                    superEntranceService.setShowedSuperEntranceTab();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: a */
    public final void mo80093a(View view, boolean z) {
        if (TextUtils.equals(mo80197ar(), "homepage_follow")) {
            MainPageExperimentServiceImpl.m108379b();
        }
        super.mo80093a(view, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ String mo80092a(ISpecialPlusService iSpecialPlusService, Aweme aweme) {
        try {
            if (!iSpecialPlusService.shouldShowSpecialPlus()) {
                return "hide";
            }
            if (iSpecialPlusService.isQuickPromoPlusEnabled()) {
                if (C31575b.m65865g() == null || !C31575b.m65865g().isLogin() || C31575b.m65865g().isChildrenMode() || (System.currentTimeMillis() / 1000) - C31575b.m65865g().getCurUser().getRegisterTime() < 604800) {
                    return "normal";
                }
                return "show";
            } else if (!mo80074o()) {
                return "normal";
            } else {
                if (C31575b.m65865g() == null || (C31575b.m65865g().isLogin() && TextUtils.equals(this.f111308j.getAuthorUid(), C31575b.m65865g().getCurUserId()))) {
                    return "normal";
                }
                List<String> specialPlusEffectList = iSpecialPlusService.getSpecialPlusEffectList();
                String stickerIDs = aweme.getStickerIDs();
                if (!C13603b.m24435a((Collection) specialPlusEffectList) && !TextUtils.isEmpty(stickerIDs)) {
                    for (String str : stickerIDs.split(",")) {
                        if (specialPlusEffectList.contains(str)) {
                            return "show";
                        }
                    }
                }
                return "normal";
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
