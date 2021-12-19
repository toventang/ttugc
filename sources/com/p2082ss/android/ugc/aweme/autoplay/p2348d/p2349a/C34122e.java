package com.p2082ss.android.ugc.aweme.autoplay.p2348d.p2349a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.C34246c;
import com.p2082ss.android.ugc.aweme.feed.helper.C49625h;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51053b;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61501c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.e */
public final class C34122e implements AbstractC34186b.AbstractC34187a {

    /* renamed from: a */
    public View.OnClickListener f80670a;

    /* renamed from: b */
    public int f80671b;

    /* renamed from: c */
    public AwemeRawAd f80672c;

    /* renamed from: d */
    public C34246c f80673d;

    /* renamed from: e */
    public View f80674e;

    static {
        Covode.recordClassIndex(41056);
    }

    private /* synthetic */ C34122e() {
        this(null, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34187a
    /* renamed from: a */
    public final void mo60412a() {
        C34246c cVar = this.f80673d;
        if (cVar != null && this.f80674e != null && cVar.f80987d != null) {
            C34246c cVar2 = this.f80673d;
            if (cVar2 == null) {
                C89219l.m154715b();
            }
            C51053b a = cVar2.mo60666a();
            if (a != null) {
                cVar2.f80988e = true;
                C49625h a2 = C49625h.m93072a();
                C89219l.m154716b(a2, "");
                a2.f114189a = cVar2.f80998o;
                C49625h a3 = C49625h.m93072a();
                C89219l.m154716b(a3, "");
                a3.f114191c = a.f117760d;
                C49625h a4 = C49625h.m93072a();
                C89219l.m154716b(a4, "");
                a4.f114195g = true;
                cVar2.f80998o = null;
                C51053b a5 = cVar2.mo60666a();
                if (a5 != null) {
                    a5.f117762f = null;
                }
                C61501c cVar3 = cVar2.f80989f;
                if (cVar3 != null) {
                    cVar3.mo99147a();
                }
                C61501c cVar4 = cVar2.f80989f;
                if (cVar4 != null) {
                    cVar4.f139608e = null;
                }
                View.OnClickListener onClickListener = this.f80670a;
                if (onClickListener != null) {
                    onClickListener.onClick(this.f80674e);
                }
            }
        }
    }

    public C34122e(C34246c cVar, View view) {
        this.f80673d = cVar;
        this.f80674e = view;
    }
}
