package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3204ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.view.a */
public abstract class AbstractC55381a extends LinearLayout {

    /* renamed from: a */
    protected TuxTextView f126625a;

    /* renamed from: b */
    protected TuxTextView f126626b;

    /* renamed from: c */
    protected RemoteImageView f126627c;

    static {
        Covode.recordClassIndex(65150);
    }

    /* access modifiers changed from: protected */
    public abstract int getResourceId();

    /* access modifiers changed from: protected */
    public final RemoteImageView getAvatarIv() {
        RemoteImageView remoteImageView = this.f126627c;
        if (remoteImageView == null) {
            C89219l.m154710a("avatarIv");
        }
        return remoteImageView;
    }

    /* access modifiers changed from: protected */
    public final TuxTextView getSubtitleTv() {
        TuxTextView tuxTextView = this.f126626b;
        if (tuxTextView == null) {
            C89219l.m154710a("subtitleTv");
        }
        return tuxTextView;
    }

    /* access modifiers changed from: protected */
    public final TuxTextView getTitleTv() {
        TuxTextView tuxTextView = this.f126625a;
        if (tuxTextView == null) {
            C89219l.m154710a("titleTv");
        }
        return tuxTextView;
    }

    /* access modifiers changed from: protected */
    public final void setAvatarIv(RemoteImageView remoteImageView) {
        C89219l.m154721d(remoteImageView, "");
        this.f126627c = remoteImageView;
    }

    /* access modifiers changed from: protected */
    public final void setSubtitleTv(TuxTextView tuxTextView) {
        C89219l.m154721d(tuxTextView, "");
        this.f126626b = tuxTextView;
    }

    /* access modifiers changed from: protected */
    public final void setTitleTv(TuxTextView tuxTextView) {
        C89219l.m154721d(tuxTextView, "");
        this.f126625a = tuxTextView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC55381a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }

    /* renamed from: a */
    public final void mo92445a(String str, String str2, String str3) {
        RemoteImageView remoteImageView = this.f126627c;
        if (remoteImageView == null) {
            C89219l.m154710a("avatarIv");
        }
        C34577e.m70608b(remoteImageView, str, -1, -1);
        TuxTextView tuxTextView = this.f126625a;
        if (tuxTextView == null) {
            C89219l.m154710a("titleTv");
        }
        tuxTextView.setText(str2);
        TuxTextView tuxTextView2 = this.f126626b;
        if (tuxTextView2 == null) {
            C89219l.m154710a("subtitleTv");
        }
        tuxTextView2.setText(str3);
    }
}
