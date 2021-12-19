package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.p2485b.C36294a;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ae */
public final class C73452ae implements AbstractC68351c {

    /* renamed from: a */
    CommonItemView f164997a;

    /* renamed from: b */
    HashMap<String, String> f164998b;

    /* renamed from: c */
    C68348f f164999c;

    /* renamed from: d */
    private C39088c<AbstractC39085b<C68348f>, AbstractC68351c> f165000d;

    static {
        Covode.recordClassIndex(86189);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
    /* renamed from: a */
    public final void mo68832a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
    /* renamed from: a */
    public final void mo68831a(C68348f fVar) {
        this.f164999c = fVar;
        if (this.f164997a != null && fVar != null && fVar.f152996r == C36294a.f85805d) {
            this.f164997a.setChecked(false);
            this.f164997a.setAlpha(0.66f);
        }
    }

    public C73452ae(CommonItemView commonItemView, boolean z, HashMap<String, String> hashMap) {
        this.f164997a = commonItemView;
        this.f164998b = hashMap;
        if (CommentServiceImpl.m73664e().mo63308d()) {
            this.f164997a.setVisibility(0);
            this.f164997a.setChecked(z);
            this.f164997a.setOnClickListener(new View$OnClickListenerC73453af(this));
            C39088c<AbstractC39085b<C68348f>, AbstractC68351c> providePushSettingFetchPresenter = C68432f.f153189a.providePushSettingFetchPresenter();
            this.f165000d = providePushSettingFetchPresenter;
            providePushSettingFetchPresenter.mo67839a_(this);
            this.f165000d.mo57616a(new Object[0]);
            return;
        }
        this.f164997a.setVisibility(8);
    }
}
