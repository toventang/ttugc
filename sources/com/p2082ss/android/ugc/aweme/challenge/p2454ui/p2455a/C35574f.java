package com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.utils.C80460fv;
import com.p2082ss.android.ugc.trill.R;
import java.util.regex.Matcher;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.f */
public final class C35574f extends ClickableSpan {

    /* renamed from: a */
    private String f83889a;

    /* renamed from: b */
    private String f83890b;

    /* renamed from: c */
    private String f83891c;

    /* renamed from: d */
    private Context f83892d;

    static {
        Covode.recordClassIndex(42798);
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(C0643b.m2378c(this.f83892d, R.color.jr));
    }

    public final void onClick(View view) {
        C39162r.m79460a("click_tag_link", new C33744d().mo59983a("tag_id", this.f83890b).f79943a);
        Activity j = C17873f.m33102j();
        if (j != null) {
            SmartRouter.buildRoute(j, "aweme://ame/webview/").withParam(Uri.parse(this.f83889a)).withParam("show_load_dialog", false).withParam("hide_nav_bar", false).withParam("title", "#" + this.f83891c).open();
        }
    }

    private C35574f(Context context, String str, String str2, String str3) {
        this.f83892d = context;
        this.f83889a = str;
        this.f83890b = str2;
        this.f83891c = str3;
    }

    /* renamed from: a */
    public static SpannableString m72678a(Context context, String str, String str2, String str3) {
        SpannableString spannableString = new SpannableString(str);
        Matcher matcher = C80460fv.f180036a.matcher(str);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String charSequence = str.subSequence(start, end).toString();
            if (C30128d.m60946a(charSequence)) {
                spannableString.setSpan(new C35574f(context, charSequence, str2, str3), start, end, 17);
            }
        }
        return spannableString;
    }
}
