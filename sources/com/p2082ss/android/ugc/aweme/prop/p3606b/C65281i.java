package com.p2082ss.android.ugc.aweme.prop.p3606b;

import android.text.TextUtils;
import android.view.View;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.challenge.p2445a.C35487c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p2082ss.android.ugc.aweme.settingsrequest.C68765a;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.prop.b.i */
public final class C65281i extends C35487c {

    /* renamed from: q */
    AbstractC65282a f147291q;

    /* renamed from: com.ss.android.ugc.aweme.prop.b.i$a */
    interface AbstractC65282a extends Serializable {
        static {
            Covode.recordClassIndex(76761);
        }

        /* renamed from: a */
        C75445g mo104440a();
    }

    static {
        Covode.recordClassIndex(76760);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2445a.C35487c
    /* renamed from: b */
    public final void mo62379b(Aweme aweme, int i, boolean z) {
        C75445g a;
        super.mo62379b(aweme, i, z);
        C68765a.m121209b();
        if (C16048b.m29633a().mo25412a(true, "prop_show_like_num", 0) == 1) {
            mo62378a(aweme);
        }
        if (aweme.isEffectDesigner()) {
            AbstractC65282a aVar = this.f147291q;
            if (aVar != null && (a = aVar.mo104440a()) != null) {
                this.f83689f.setText(C1764a.m5928a(this.itemView.getContext().getString(R.string.exv), new Object[]{a.ownerName}));
                this.f83689f.setVisibility(0);
            }
        } else if (aweme.isPgcShow()) {
            if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                this.f83687d.setVisibility(0);
                this.f83686c.setVisibility(8);
                m72567a(this.f83687d, aweme.getTextTopLabels().get(0));
            }
        } else if (aweme.getOriginAuthor() != null) {
            this.f83688e.setVisibility(0);
            if (!TextUtils.isEmpty(aweme.getLabelOriginAuthorText())) {
                this.f83688e.setText(aweme.getLabelOriginAuthorText());
            }
            this.f83686c.setVisibility(4);
        } else if (aweme.getMusicStarter() == null && aweme.getOriginAuthor() == null) {
            if (aweme.getIsTop() != 1) {
                return;
            }
            if (aweme.getTextTopLabels() == null || aweme.getTextTopLabels().size() <= 0) {
                this.f83687d.setVisibility(8);
                this.f83686c.setVisibility(0);
                C34577e.m70593a(this.f83686c, aweme.getLabelTop(), (int) C13628n.m24520b(this.f83684a, 6.0f), (int) C13628n.m24520b(this.f83684a, 6.0f));
                return;
            }
            this.f83687d.setVisibility(0);
            this.f83686c.setVisibility(8);
            m72567a(this.f83687d, aweme.getTextTopLabels().get(0));
        } else if (aweme.getIsTop() != 1) {
        } else {
            if (aweme.getTextTopLabels() == null || aweme.getTextTopLabels().size() <= 0) {
                this.f83687d.setVisibility(0);
                this.f83686c.setVisibility(8);
                AwemeTextLabelModel awemeTextLabelModel = new AwemeTextLabelModel();
                awemeTextLabelModel.setTextColor("#FFFFFF");
                awemeTextLabelModel.setLabelType(8);
                awemeTextLabelModel.setBgColor("#FE2C55");
                awemeTextLabelModel.setShowSeconds(0.0f);
                awemeTextLabelModel.setLabelName(this.f83684a.getResources().getString(R.string.dkf));
                m72567a(this.f83687d, awemeTextLabelModel);
                return;
            }
            this.f83687d.setVisibility(0);
            this.f83686c.setVisibility(8);
            m72567a(this.f83687d, aweme.getTextTopLabels().get(0));
        }
    }

    public C65281i(View view, String str, AbstractC35500d dVar, AbstractC65282a aVar) {
        super(view, str, dVar);
        this.f147291q = aVar;
    }
}
