package com.p2082ss.android.ugc.aweme.share.p3746d;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.NoticeButtonView;
import com.p2082ss.android.ugc.aweme.share.p3746d.C68913g;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.share.d.d */
public final class C68910d implements AbstractC1214u<C68906a> {
    static {
        Covode.recordClassIndex(81216);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C68906a aVar) {
        Activity j;
        MethodCollector.m26663i(5634);
        if (aVar == null || (j = C17873f.m33102j()) == null) {
            MethodCollector.m26664o(5634);
        } else if (C68909c.m121608c() || C68909c.m121609d()) {
            MethodCollector.m26664o(5634);
        } else {
            Aweme aweme = C68906a.f154145c;
            int i = C68906a.f154143a;
            if (i != 4) {
                if (i == 5 && aweme != null) {
                    C68913g gVar = C68913g.f154168c;
                    C89219l.m154721d(j, "");
                    C89219l.m154721d(aweme, "");
                    gVar.mo109466b();
                    View findViewById = j.findViewById(16908290);
                    C89219l.m154716b(findViewById, "");
                    FrameLayout frameLayout = (FrameLayout) findViewById;
                    C89219l.m154721d(j, "");
                    NoticeButtonView noticeButtonView = C68913g.f154166a;
                    if (noticeButtonView == null) {
                        NoticeButtonView noticeButtonView2 = new NoticeButtonView(j);
                        C68913g.f154166a = noticeButtonView2;
                        noticeButtonView2.setTitleText(R.string.bue);
                        noticeButtonView2.setContextText(R.string.buf);
                        String string = j.getString(R.string.bui);
                        C89219l.m154716b(string, "");
                        noticeButtonView2.setItemText(string);
                        noticeButtonView2.setIconImage(R.raw.icon_exclamation_mark_circle);
                        noticeButtonView2.setButtonTextColor(-16777216);
                        Drawable a = C0643b.m2369a(j, (int) R.drawable.a0l);
                        if (a == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(a, "");
                        noticeButtonView2.setButtonBackgroundDrawable(a);
                        noticeButtonView2.setOnInternalClickListener(new C68913g.C68914a(j, aweme));
                        C68913g.f154167b.sendEmptyMessageDelayed(1, 8000);
                        noticeButtonView = C68913g.f154166a;
                        if (noticeButtonView == null) {
                            C89219l.m154715b();
                        }
                    }
                    int b = (int) C13628n.m24520b(C17867d.m33078a(), 12.0f);
                    C89233z.C89238e eVar = new C89233z.C89238e();
                    eVar.element = (T) new LinearLayout.LayoutParams(-1, -2);
                    eVar.element.setMargins(b, 0, b, 0);
                    noticeButtonView.getViewTreeObserver().addOnGlobalLayoutListener(new C68913g.ViewTreeObserver$OnGlobalLayoutListenerC68916c(noticeButtonView, frameLayout, eVar, b));
                    noticeButtonView.setVisibility(4);
                    frameLayout.addView(noticeButtonView, eVar.element);
                    Aweme aweme2 = C68909c.f154157e;
                    if (aweme2 != null) {
                        C39162r.m79460a("download_failure_window_show", new C33744d().mo59983a("group_id", aweme2.getAid()).mo59983a("author_id", aweme2.getAuthorUid()).f79943a);
                        MethodCollector.m26664o(5634);
                        return;
                    }
                    MethodCollector.m26664o(5634);
                    return;
                }
                MethodCollector.m26664o(5634);
            } else if (aweme != null) {
                new C23144b(j).mo37633a(R.style.nz).mo37640e(R.string.h7o).mo37637b();
                MethodCollector.m26664o(5634);
            } else {
                MethodCollector.m26664o(5634);
            }
        }
    }
}
