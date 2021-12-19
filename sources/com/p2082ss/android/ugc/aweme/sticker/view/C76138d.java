package com.p2082ss.android.ugc.aweme.sticker.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45921f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.setting.C68062ck;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.AvatarWithBorderView;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3810c.C70982a;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.widget.CircleImageView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.d */
public final class C76138d extends FrameLayout implements AbstractC45921f {

    /* renamed from: a */
    private View f171039a;

    /* renamed from: b */
    private View f171040b;

    /* renamed from: c */
    private View f171041c;

    /* renamed from: d */
    private AvatarWithBorderView f171042d;

    /* renamed from: e */
    private CircleImageView f171043e;

    /* renamed from: f */
    private CircleImageView f171044f;

    /* renamed from: g */
    private TextView f171045g;

    /* renamed from: h */
    private TextView f171046h;

    static {
        Covode.recordClassIndex(89086);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45921f
    /* renamed from: c */
    public final void mo77334c(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45921f
    public final View getContentView() {
        return this;
    }

    public final View getGradualMaskBottom() {
        return this.f171041c;
    }

    public final View getGroupBottomLine() {
        return this.f171040b;
    }

    public final View getGroupRightLine() {
        return this.f171039a;
    }

    public final CircleImageView getIvOriginMusicCover() {
        return this.f171044f;
    }

    public final AvatarWithBorderView getMAvatarView() {
        return this.f171042d;
    }

    public final CircleImageView getMMusicCoverView() {
        return this.f171043e;
    }

    public final TextView getTvMusic() {
        return this.f171046h;
    }

    public final TextView getTvName() {
        return this.f171045g;
    }

    public final void setGradualMaskBottom(View view) {
        this.f171041c = view;
    }

    public final void setGroupBottomLine(View view) {
        this.f171040b = view;
    }

    public final void setGroupRightLine(View view) {
        this.f171039a = view;
    }

    public final void setIvOriginMusicCover(CircleImageView circleImageView) {
        this.f171044f = circleImageView;
    }

    public final void setMAvatarView(AvatarWithBorderView avatarWithBorderView) {
        this.f171042d = avatarWithBorderView;
    }

    public final void setMMusicCoverView(CircleImageView circleImageView) {
        this.f171043e = circleImageView;
    }

    public final void setTvMusic(TextView textView) {
        this.f171046h = textView;
    }

    public final void setTvName(TextView textView) {
        this.f171045g = textView;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45921f
    /* renamed from: a */
    public final void mo77332a(boolean z) {
        int i;
        View view = this.f171039a;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            view.setVisibility(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45921f
    /* renamed from: b */
    public final void mo77333b(boolean z) {
        View view = this.f171041c;
        int i = 0;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.f171040b;
        if (view2 != null) {
            if (!z) {
                i = 4;
            }
            view2.setVisibility(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76138d(Context context) {
        super(context);
        UrlModel urlModel;
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12358);
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.bij, this, false);
        C89219l.m154716b(a, "");
        this.f171039a = a.findViewById(R.id.bc_);
        this.f171040b = a.findViewById(R.id.bc1);
        this.f171041c = a.findViewById(R.id.bbq);
        if (C68062ck.m120368a()) {
            this.f171041c = a.findViewById(R.id.bbr);
        }
        this.f171042d = (AvatarWithBorderView) a.findViewById(R.id.f__);
        this.f171043e = (CircleImageView) a.findViewById(R.id.cnl);
        this.f171044f = (CircleImageView) a.findViewById(R.id.cxm);
        this.f171045g = (TextView) a.findViewById(R.id.ezz);
        this.f171046h = (TextView) a.findViewById(R.id.ezo);
        AvatarWithBorderView avatarWithBorderView = this.f171042d;
        if (avatarWithBorderView != null) {
            avatarWithBorderView.setBorderColor(R.color.l);
        }
        View view = this.f171039a;
        if (view != null) {
            view.setVisibility(4);
        }
        addView(a);
        AbstractC32846a e = C63244g.m114602a().mo73255A().mo93906e();
        if (e == null || e.mo58663f() == null) {
            C84402a.m145165a(this.f171042d, 2131232314);
        } else {
            AvatarWithBorderView avatarWithBorderView2 = this.f171042d;
            UrlModel f = e.mo58663f();
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            int a2 = (int) C84912r.m145930a(context2, 49.0f);
            Context context3 = getContext();
            C89219l.m154716b(context3, "");
            C84402a.m145169a(avatarWithBorderView2, f, a2, (int) C84912r.m145930a(context3, 49.0f));
        }
        TextView textView = this.f171045g;
        if (textView != null) {
            StringBuilder sb = new StringBuilder("@");
            AbstractC32846a e2 = C63244g.m114602a().mo73255A().mo93906e();
            Resources resources = getResources();
            C89219l.m154716b(resources, "");
            textView.setText(sb.append(C70982a.m125335a(e2, resources)).toString());
        }
        CircleImageView circleImageView = this.f171044f;
        if (e != null) {
            urlModel = e.mo58663f();
        } else {
            urlModel = null;
        }
        C84402a.m145169a(circleImageView, urlModel, 27, 27);
        C84402a.m145165a(this.f171043e, 2131232312);
        Drawable a3 = C0643b.m2369a(getContext(), 2131232303);
        if (a3 != null) {
            a3.setBounds(0, 0, a3.getMinimumWidth(), a3.getMinimumHeight());
        }
        TextView textView2 = this.f171046h;
        if (textView2 != null) {
            textView2.setCompoundDrawables(a3, null, null, null);
        }
        TextView textView3 = this.f171046h;
        if (textView3 != null) {
            StringBuilder sb2 = new StringBuilder();
            Context context4 = getContext();
            C89219l.m154716b(context4, "");
            textView3.setText(sb2.append(C70982a.m125334a(context4, C63244g.m114602a().mo73255A().mo93906e())).toString());
            MethodCollector.m26664o(12358);
            return;
        }
        MethodCollector.m26664o(12358);
    }
}
