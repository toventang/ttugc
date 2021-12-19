package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dy */
final /* synthetic */ class RunnableC50252dy implements Runnable {

    /* renamed from: a */
    private final C50246dw f116038a;

    /* renamed from: b */
    private final String f116039b;

    /* renamed from: c */
    private final C33942b f116040c;

    static {
        Covode.recordClassIndex(59378);
    }

    RunnableC50252dy(C50246dw dwVar, String str, C33942b bVar) {
        this.f116038a = dwVar;
        this.f116039b = str;
        this.f116040c = bVar;
    }

    public final void run() {
        C50246dw dwVar = this.f116038a;
        String str = this.f116039b;
        C33942b bVar = this.f116040c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1661876786:
                if (str.equals("stopPlayAnimation") && !dwVar.f116022d) {
                    if (dwVar.f116020b != null) {
                        dwVar.f116020b.setProgress(0);
                        dwVar.f116020b.clearAnimation();
                        dwVar.f116020b.setVisibility(4);
                    }
                    if (dwVar.f116021c != null) {
                        dwVar.f116021c.clearAnimation();
                        dwVar.f116021c.mo85738c();
                        return;
                    }
                    return;
                }
                return;
            case -904341062:
                if (str.equals("load_progress_bar")) {
                    if (!((Boolean) bVar.mo60212a()).booleanValue()) {
                        dwVar.mo85414d();
                        return;
                    } else if (dwVar.f116021c != null) {
                        dwVar.f116021c.mo85736a();
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 350216171:
                if (str.equals("on_page_selected")) {
                    dwVar.f116022d = true;
                    dwVar.mo85412b();
                    dwVar.mo85416o();
                    dwVar.mo85415e();
                    return;
                }
                return;
            case 1628582276:
                if (str.equals("on_page_unselected")) {
                    dwVar.f116022d = false;
                    dwVar.mo85420p();
                    dwVar.mo85415e();
                    dwVar.mo85414d();
                    return;
                }
                return;
            case 2000201256:
                if (str.equals("in_video_view_holder")) {
                    if (((Boolean) bVar.mo60212a()).booleanValue()) {
                        dwVar.mo85416o();
                        return;
                    } else {
                        dwVar.mo85420p();
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }
}
