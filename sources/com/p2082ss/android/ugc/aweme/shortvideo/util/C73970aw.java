package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.AdFeSettings;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.aw */
public final class C73970aw {

    /* renamed from: a */
    public static final C73970aw f166064a = new C73970aw();

    private C73970aw() {
    }

    static {
        Covode.recordClassIndex(86720);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.aw$a */
    public static final class C73971a extends ClickableSpan {

        /* renamed from: a */
        public final int f166065a;

        static {
            Covode.recordClassIndex(86721);
        }

        public C73971a(int i) {
            this.f166065a = i;
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            if (view instanceof TextView) {
                ((TextView) view).setHighlightColor(0);
            }
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            C73970aw.m130098a(context, "post_page");
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f166065a);
            textPaint.setUnderlineText(false);
            textPaint.setFakeBoldText(true);
        }
    }

    /* renamed from: a */
    public static final C73971a m130097a(int i) {
        return new C73971a(i);
    }

    /* renamed from: a */
    public static final void m130098a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        try {
            C39162r.m79460a("enter_music_usage_confimation", new C84425b().mo129406a("enter_method", str).f188764a);
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            AdFeSettings adFeSettings = iESSettingsProxy.getAdFeSettings();
            if (adFeSettings != null) {
                String musicLegalPage = adFeSettings.getMusicLegalPage();
                String string = context.getResources().getString(R.string.eqd);
                C89219l.m154716b(string, "");
                if (!TextUtils.isEmpty(musicLegalPage)) {
                    C63238c.f143585l.mo93823a(context, musicLegalPage, string);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
