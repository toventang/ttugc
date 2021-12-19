package com.p2082ss.android.ugc.aweme.duet.p2816ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.challenge.p2445a.C35487c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.duet.ui.c */
public final class C43270c extends C35487c {

    /* renamed from: q */
    private final String f101016q;

    static {
        Covode.recordClassIndex(51475);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2445a.C35487c
    /* renamed from: b */
    public final void mo62379b(Aweme aweme, int i, boolean z) {
        if (aweme != null) {
            super.mo62379b(aweme, i, z);
            if (TextUtils.equals(this.f101016q, aweme.getAid())) {
                TextView textView = this.f83689f;
                C89219l.m154716b(textView, "");
                textView.setVisibility(0);
                this.f83689f.setText(R.string.cth);
            }
            if (aweme.isPgcShow()) {
                if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                    TextView textView2 = this.f83687d;
                    C89219l.m154716b(textView2, "");
                    textView2.setVisibility(0);
                    RemoteImageView remoteImageView = this.f83686c;
                    C89219l.m154716b(remoteImageView, "");
                    remoteImageView.setVisibility(8);
                    m72567a(this.f83687d, aweme.getTextTopLabels().get(0));
                }
            } else if (aweme.getOriginAuthor() != null) {
                TextView textView3 = this.f83688e;
                C89219l.m154716b(textView3, "");
                textView3.setVisibility(0);
                if (!TextUtils.isEmpty(aweme.getLabelOriginAuthorText())) {
                    TextView textView4 = this.f83688e;
                    C89219l.m154716b(textView4, "");
                    textView4.setText(aweme.getLabelOriginAuthorText());
                }
                RemoteImageView remoteImageView2 = this.f83686c;
                C89219l.m154716b(remoteImageView2, "");
                remoteImageView2.setVisibility(4);
            } else if (aweme.getMusicStarter() != null || aweme.getOriginAuthor() != null || !TextUtils.equals(this.f83685b, "challenge") || aweme.getIsTop() != 1) {
            } else {
                if (aweme.getTextTopLabels() == null || aweme.getTextTopLabels().size() <= 0) {
                    TextView textView5 = this.f83687d;
                    C89219l.m154716b(textView5, "");
                    textView5.setVisibility(8);
                    RemoteImageView remoteImageView3 = this.f83686c;
                    C89219l.m154716b(remoteImageView3, "");
                    remoteImageView3.setVisibility(0);
                    UrlModel labelTop = aweme.getLabelTop();
                    C89219l.m154716b(labelTop, "");
                    C34577e.m70593a(this.f83686c, labelTop, (int) C13628n.m24520b(this.f83684a, 6.0f), (int) C13628n.m24520b(this.f83684a, 6.0f));
                    return;
                }
                TextView textView6 = this.f83687d;
                C89219l.m154716b(textView6, "");
                textView6.setVisibility(0);
                RemoteImageView remoteImageView4 = this.f83686c;
                C89219l.m154716b(remoteImageView4, "");
                remoteImageView4.setVisibility(8);
                m72567a(this.f83687d, aweme.getTextTopLabels().get(0));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43270c(String str, View view, String str2, AbstractC35500d dVar) {
        super(view, str2, dVar);
        C89219l.m154721d(str, "");
        C89219l.m154721d(view, "");
        this.f101016q = str;
    }
}
