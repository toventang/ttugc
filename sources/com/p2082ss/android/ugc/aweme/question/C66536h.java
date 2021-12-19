package com.p2082ss.android.ugc.aweme.question;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.challenge.p2445a.C35487c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.question.h */
public final class C66536h extends C35487c {
    static {
        Covode.recordClassIndex(78079);
    }

    public C66536h(View view, String str, AbstractC35500d dVar) {
        super(view, str, dVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2445a.C35487c
    /* renamed from: b */
    public final void mo62379b(Aweme aweme, int i, boolean z) {
        super.mo62379b(aweme, i, z);
        if (aweme.getLabelMusicStarterText() != null && !aweme.getLabelMusicStarterText().isEmpty()) {
            this.f83689f.setVisibility(0);
            if (!TextUtils.isEmpty(aweme.getLabelMusicStarterText())) {
                this.f83689f.setText(aweme.getLabelMusicStarterText());
            }
        }
        if (aweme.isPgcShow()) {
            if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                this.f83687d.setVisibility(0);
                this.f83686c.setVisibility(8);
                m72567a(this.f83687d, aweme.getTextTopLabels().get(0));
            }
        } else if (aweme.getMusicStarter() != null || aweme.getOriginAuthor() != null || !TextUtils.equals(this.f83685b, "qa_detail") || aweme.getIsTop() != 1) {
        } else {
            if (aweme.getTextTopLabels() == null || aweme.getTextTopLabels().size() <= 0) {
                this.f83687d.setVisibility(8);
                this.f83686c.setVisibility(0);
                C34577e.m70593a(this.f83686c, aweme.getLabelTop(), (int) C13628n.m24520b(this.f83684a, 6.0f), (int) C13628n.m24520b(this.f83684a, 6.0f));
                return;
            }
            this.f83687d.setVisibility(0);
            this.f83686c.setVisibility(8);
            m72567a(this.f83687d, aweme.getTextTopLabels().get(0));
        }
    }
}
