package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.challenge.p2445a.C35487c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.i */
public final class C35611i extends C35487c {
    static {
        Covode.recordClassIndex(42835);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2445a.C35487c
    /* renamed from: d */
    public final boolean mo62382d() {
        return true;
    }

    public C35611i(View view, String str, AbstractC35500d dVar) {
        super(view, str, dVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2445a.C35487c
    /* renamed from: b */
    public final void mo62379b(Aweme aweme, int i, boolean z) {
        super.mo62379b(aweme, i, z);
        if (aweme.isPgcShow()) {
            if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                this.f83687d.setVisibility(0);
                this.f83686c.setVisibility(8);
                m72567a(this.f83687d, aweme.getTextTopLabels().get(0));
            }
        } else if (aweme.getOriginAuthor() == null && aweme.getMusicStarter() == null && aweme.getOriginAuthor() == null && TextUtils.equals(this.f83685b, "challenge")) {
            if (aweme.getIsTop() == 1) {
                if (aweme.getTextTopLabels() == null || aweme.getTextTopLabels().size() <= 0) {
                    this.f83687d.setVisibility(8);
                    this.f83686c.setVisibility(0);
                    C34577e.m70593a(this.f83686c, aweme.getLabelTop(), (int) C13628n.m24520b(this.f83684a, 6.0f), (int) C13628n.m24520b(this.f83684a, 6.0f));
                } else {
                    this.f83687d.setVisibility(0);
                    this.f83686c.setVisibility(8);
                    m72567a(this.f83687d, aweme.getTextTopLabels().get(0));
                }
            }
            if (i == 0) {
                int a = C16048b.m29633a().mo25412a(true, "[Discover] Hashtag - Instagram layout", 1);
                if (a == 4) {
                    this.f83689f.setText(R.string.eoy);
                    this.f83689f.setVisibility(0);
                } else if (a == 5) {
                    this.f83689f.setText(R.string.f78);
                    this.f83689f.setVisibility(0);
                }
            }
        }
    }
}
