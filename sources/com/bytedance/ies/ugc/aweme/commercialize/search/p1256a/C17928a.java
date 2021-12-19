package com.bytedance.ies.ugc.aweme.commercialize.search.p1256a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1274ui.C18156a;
import com.bytedance.ies.ugc.aweme.rich.p1274ui.RichTagView;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51428b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.search.a.a */
public final class C17928a {

    /* renamed from: a */
    public static final C17928a f42740a = new C17928a();

    private C17928a() {
    }

    static {
        Covode.recordClassIndex(20538);
    }

    /* renamed from: a */
    public static final void m33266a(RichTagView richTagView, AwemeRawAd awemeRawAd) {
        String labelName;
        if (richTagView != null) {
            richTagView.setVisibility(8);
            if (awemeRawAd != null) {
                C18156a.C18157a a = C18156a.C18157a.C18158a.m33791a();
                AwemeTextLabelModel label = awemeRawAd.getLabel();
                if (label != null && (labelName = label.getLabelName()) != null) {
                    richTagView.setVisibility(0);
                    C18156a aVar = a.mo28942a(labelName).mo28943b(92).mo28944c(richTagView.getResources().getColor(R.color.a4)).mo28941a(richTagView.getResources().getColor(R.color.a9)).mo28940a((float) C51428b.m95803a(richTagView.getContext(), 2.0f)).f43256a;
                    if (aVar != null) {
                        richTagView.mo28933a(aVar);
                    }
                }
            }
        }
    }
}
