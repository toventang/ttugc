package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Boost;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ce */
final /* synthetic */ class RunnableC50171ce implements Runnable {

    /* renamed from: a */
    private final C50166cc f115844a;

    /* renamed from: b */
    private final VideoItemParams f115845b;

    static {
        Covode.recordClassIndex(59297);
    }

    RunnableC50171ce(C50166cc ccVar, VideoItemParams videoItemParams) {
        this.f115844a = ccVar;
        this.f115845b = videoItemParams;
    }

    public final void run() {
        int i;
        C50166cc ccVar = this.f115844a;
        Aweme aweme = this.f115845b.mAweme;
        if (ccVar.f115824r != null && ccVar.f115825s != null) {
            ccVar.f115825s.setVisibility(8);
            ccVar.f115824r.setVisibility(8);
            if (aweme != null && aweme.getBoost() != null) {
                Boost boost = aweme.getBoost();
                if (!TextUtils.isEmpty(boost.getText())) {
                    String text = boost.getText();
                    try {
                        i = Color.parseColor(boost.getBgColor());
                    } catch (Exception unused) {
                        i = Color.parseColor("#C0FFFFFF");
                    }
                    try {
                        int parseColor = Color.parseColor(boost.getTextColor());
                        ccVar.f115825s.setVisibility(0);
                        ccVar.f115825s.setText(text);
                        ccVar.f115825s.setBackgroundColor(i);
                        ccVar.f115825s.setTextColor(parseColor);
                    } catch (Exception unused2) {
                        ccVar.f115824r.setVisibility(0);
                        ccVar.f115824r.setTagBackgroundColor(i);
                        ccVar.f115824r.setText(text);
                    }
                }
            }
        }
    }
}
