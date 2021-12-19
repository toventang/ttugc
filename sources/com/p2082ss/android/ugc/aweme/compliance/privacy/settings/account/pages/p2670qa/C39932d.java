package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.p2670qa;

import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.C39723h;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa.d */
public final class C39932d extends AbstractC39720f {

    /* renamed from: a */
    public final C1213t<Integer> f93910a;

    /* renamed from: b */
    private UrlModel f93911b;

    static {
        Covode.recordClassIndex(47682);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f
    /* renamed from: b */
    public final int mo69101b() {
        return R.layout.ur;
    }

    public C39932d(C1213t<Integer> tVar) {
        C89219l.m154721d(tVar, "");
        this.f93910a = tVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c
    /* renamed from: a */
    public final void mo69095a(C39723h hVar, int i) {
        int i2;
        C89219l.m154721d(hVar, "");
        View view = hVar.itemView;
        C89219l.m154716b(view, "");
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.dbu);
        C89219l.m154716b(linearLayout, "");
        Integer value = this.f93910a.getValue();
        if (value != null && value.intValue() == 1) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
        View view2 = hVar.itemView;
        C89219l.m154716b(view2, "");
        SmartCircleImageView smartCircleImageView = (SmartCircleImageView) view2.findViewById(R.id.nz);
        C89219l.m154716b(smartCircleImageView, "");
        User e = C39631a.m80489e();
        if (!C89219l.m154714a(this.f93911b, e.getAvatarThumb())) {
            UrlModel avatarThumb = e.getAvatarThumb();
            this.f93911b = avatarThumb;
            C20766v a = C20761r.m39060a(C34735v.m70965a(avatarThumb));
            a.f49092E = smartCircleImageView;
            a.mo34186c();
        }
    }
}
