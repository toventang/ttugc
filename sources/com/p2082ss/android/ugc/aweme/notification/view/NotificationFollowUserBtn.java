package com.p2082ss.android.ugc.aweme.notification.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.NiceWidthTextView;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56203d;
import com.p2082ss.android.ugc.aweme.utils.C80552hu;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.notification.view.NotificationFollowUserBtn */
public class NotificationFollowUserBtn extends FollowUserBtn {

    /* renamed from: a */
    private static final int f141364a = ((int) C13628n.m24520b(C17867d.m33078a(), 12.0f));

    /* renamed from: g */
    private static final int f141365g = ((int) C13628n.m24520b(C17867d.m33078a(), 4.0f));

    /* renamed from: h */
    private boolean f141366h;

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn
    /* renamed from: a */
    public final void mo86692a() {
        setDoubleFollowButtonText(null);
    }

    static {
        Covode.recordClassIndex(73061);
    }

    /* renamed from: d */
    private void m112674d() {
        if (this.f118351b != null) {
            NiceWidthTextView niceWidthTextView = this.f118351b;
            int i = f141364a;
            niceWidthTextView.setPadding(i, 0, i, 0);
            C80552hu.m139635a(this.f118351b, 10, 14, C62262g.m112633a(getContext()));
            this.f118351b.setFontType(C17303d.f41573g);
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.common.rebranding.AbstractC17181b, com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn
    /* renamed from: a */
    public final int mo27129a(TextView textView) {
        return C62262g.m112633a(textView.getContext());
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn
    public void setDoubleFollowButtonText(String str) {
        String str2;
        if (!m95704b() || !this.f141366h) {
            super.mo86692a();
            return;
        }
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        if (str == null || C89361p.m154865g(str) == null) {
            str2 = getResources().getString(R.string.d2m);
        } else if (createIIMServicebyMonsterPlugin != null) {
            str2 = createIIMServicebyMonsterPlugin.getEntranceButtonText(getContext(), str);
        } else {
            str2 = getResources().getString(R.string.d2m);
        }
        this.f118351b.setText(str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn
    public void setFollowButtonTextAndIcon(int i) {
        if (i != 1) {
            super.setFollowButtonTextAndIcon(i);
        } else if (getResources() != null) {
            this.f118351b.setText(getResources().getText(R.string.bxw));
        } else {
            return;
        }
        m112674d();
    }

    public NotificationFollowUserBtn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn, com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    /* renamed from: a */
    public final void mo73175a(int i, int i2) {
        mo86406a(i, i2, null);
    }

    private NotificationFollowUserBtn(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.sk});
        this.f141366h = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (!this.f141366h && C56203d.m102113b()) {
            this.f141366h = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn, com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    /* renamed from: a */
    public final void mo86406a(int i, int i2, String str) {
        super.mo86406a(i, i2, str);
        m112674d();
        int i3 = f141365g;
        mo86694b(i3, i3);
    }
}
