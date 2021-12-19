package com.p2082ss.android.ugc.aweme.share.silent;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.widget.CanCancelRadioButton;
import com.p2082ss.android.ugc.aweme.services.external.IComplianceService;
import com.p2082ss.android.ugc.aweme.share.p3744b.C68877a;

/* renamed from: com.ss.android.ugc.aweme.share.silent.b */
public abstract class AbstractC69445b extends LinearLayout {

    /* renamed from: g */
    protected IComplianceService f155141g;

    /* renamed from: h */
    public Fragment f155142h;

    static {
        Covode.recordClassIndex(81783);
    }

    /* renamed from: a */
    public abstract void mo109675a(int i);

    /* renamed from: a */
    public abstract void mo109678a(CanCancelRadioButton.AbstractC34737a aVar);

    /* renamed from: a */
    public abstract void mo109679a(boolean z);

    /* renamed from: c */
    public abstract String mo109682c();

    public abstract int getSaveUploadType();

    public abstract void setSaveLocalEnabled(boolean z);

    public abstract void setSyncIconSize(int i);

    public abstract void setSyncShareViewTextColor(int i);

    public abstract void setSyncShareViewTextSize(float f);

    public void setSyncShareViewTitle(String str) {
    }

    public IComplianceService getComplianceService() {
        return this.f155141g;
    }

    public Fragment getFragment() {
        return this.f155142h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo109697d() {
        Bundle bundle = new Bundle();
        IComplianceService iComplianceService = this.f155141g;
        if (iComplianceService != null) {
            bundle.putInt("publish_private_status", iComplianceService.getPublishPermission());
            bundle.putBoolean("music_prevent_download", this.f155141g.getMusicPreventDownload());
        }
        C68877a.m121549a("ug_publish_share_click", bundle);
    }

    public AbstractC69445b(Context context) {
        super(context);
    }

    public void setComplianceService(IComplianceService iComplianceService) {
        this.f155141g = iComplianceService;
    }
}
