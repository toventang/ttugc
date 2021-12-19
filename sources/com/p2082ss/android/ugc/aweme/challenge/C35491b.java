package com.p2082ss.android.ugc.aweme.challenge;

import android.app.Activity;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.utils.C80460fv;
import com.p2082ss.android.ugc.trill.R;
import java.util.regex.Matcher;

/* renamed from: com.ss.android.ugc.aweme.challenge.b */
public final class C35491b extends AbstractC35484a {

    /* renamed from: b */
    String f83709b;

    /* renamed from: c */
    String f83710c;

    /* renamed from: d */
    public boolean f83711d;

    /* renamed from: e */
    private boolean f83712e = true;

    static {
        Covode.recordClassIndex(42683);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.AbstractC35484a
    /* renamed from: a */
    public final SpannableString mo62373a(SpannableString spannableString) {
        String spannableString2 = spannableString.toString();
        Matcher matcher = C80460fv.f180036a.matcher(spannableString2);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            final String charSequence = spannableString2.subSequence(start, end).toString();
            if (C30128d.m60946a(charSequence)) {
                this.f83711d = true;
                spannableString.setSpan(new StyleSpan(0), start, end, 17);
                spannableString.setSpan(new AbstractC33066c(C34722h.m70921a((int) R.color.bx), C34722h.m70921a((int) R.color.an)) {
                    /* class com.p2082ss.android.ugc.aweme.challenge.C35491b.C354921 */

                    static {
                        Covode.recordClassIndex(42684);
                    }

                    public final void onClick(View view) {
                        C35491b bVar = C35491b.this;
                        String str = charSequence;
                        C39162r.m79460a("click_tag_link", new C33744d().mo59983a("tag_id", bVar.f83709b).f79943a);
                        Activity j = C17873f.m33102j();
                        if (j != null) {
                            SmartRouter.buildRoute(j, "aweme://ame/webview/").withParam(Uri.parse(str)).withParam("show_load_dialog", false).withParam("hide_nav_bar", false).withParam("title", "#" + bVar.f83710c).open();
                        }
                    }
                }, start, end, 17);
            }
        }
        if (this.f83712e) {
            return this.f83678a.mo62373a(spannableString);
        }
        return spannableString;
    }

    public C35491b(String str, String str2) {
        this.f83710c = str2;
        this.f83709b = str;
    }
}
