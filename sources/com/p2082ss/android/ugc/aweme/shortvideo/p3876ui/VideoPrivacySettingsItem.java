package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.geofencing.PublishSettingItem;
import com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71911e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoPrivacySettingsItem */
public final class VideoPrivacySettingsItem extends PublishSettingItem implements View.OnClickListener {

    /* renamed from: a */
    private boolean f164768a;

    /* renamed from: b */
    private boolean f164769b;

    /* renamed from: c */
    private boolean f164770c;

    /* renamed from: n */
    private String f164771n;

    /* renamed from: o */
    private String f164772o;

    /* renamed from: p */
    private String f164773p;

    static {
        Covode.recordClassIndex(86077);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
    }

    /* renamed from: a */
    private void m129411a() {
        String str;
        int i;
        String str2;
        String str3;
        if (C71911e.m126986a()) {
            boolean z = this.f164768a;
            String str4 = "";
            if (z || this.f164769b || this.f164770c) {
                String str5 = null;
                if (z) {
                    str = this.f164771n;
                    i = 1;
                } else {
                    str = null;
                    i = 0;
                }
                if (this.f164769b) {
                    if (str == null) {
                        str = this.f164772o;
                        str2 = null;
                    } else {
                        str2 = this.f164772o;
                    }
                    i++;
                } else {
                    str2 = null;
                }
                if (this.f164770c) {
                    if (str == null) {
                        str = this.f164773p;
                    } else if (str2 == null) {
                        str2 = this.f164773p;
                    } else {
                        str5 = this.f164773p;
                    }
                    i++;
                }
                if (i != 1) {
                    if (i == 2) {
                        str3 = getContext().getString(R.string.azh, str, str2);
                        C89219l.m154716b(str3, str4);
                    } else if (i == 3) {
                        str3 = getContext().getString(R.string.azi, str, str2, str5);
                        C89219l.m154716b(str3, str4);
                    }
                    str4 = str3;
                } else {
                    str3 = getContext().getString(R.string.azg, str);
                    C89219l.m154716b(str3, str4);
                    str4 = str3;
                }
                setBottomHintText(str4);
                setBottomHintTextVisibility(0);
                return;
            }
            setBottomHintText(str4);
            setBottomHintTextVisibility(8);
        }
    }

    public final void setCommentStatus(boolean z) {
        this.f164768a = z;
        m129411a();
    }

    public final void setDuetStatus(boolean z) {
        this.f164769b = z;
        m129411a();
    }

    public final void setStitchStatus(boolean z) {
        this.f164770c = z;
        m129411a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoPrivacySettingsItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        setDrawableLeft(C0643b.m2369a(context, 2131232703));
        setTitle(context.getString(R.string.azn));
        setSubtitle("");
        if (C71911e.m126986a()) {
            i = 0;
        } else {
            i = 8;
        }
        setBottomHintTextVisibility(i);
        String string = context.getString(R.string.azj);
        C89219l.m154716b(string, "");
        this.f164771n = string;
        String string2 = context.getString(R.string.azk);
        C89219l.m154716b(string2, "");
        this.f164772o = string2;
        String string3 = context.getString(R.string.azl);
        C89219l.m154716b(string3, "");
        this.f164773p = string3;
    }
}
