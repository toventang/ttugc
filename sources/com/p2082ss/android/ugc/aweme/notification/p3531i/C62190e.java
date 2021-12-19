package com.p2082ss.android.ugc.aweme.notification.p3531i;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.UgAllServiceImpl;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView;
import com.p2082ss.android.ugc.aweme.newfollow.p3507ui.C61517e;
import com.p2082ss.android.ugc.aweme.notification.p3519ab.C61799b;
import com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i;
import com.p2082ss.android.ugc.aweme.notification.utils.C62271n;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.i.e */
public final class C62190e extends C62208i.C62209a {

    /* renamed from: a */
    private C61517e f141196a;

    static {
        Covode.recordClassIndex(72944);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.e$a */
    public static final class C62191a implements C61517e.AbstractC61520b {
        static {
            Covode.recordClassIndex(72945);
        }

        C62191a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.newfollow.p3507ui.C61517e.AbstractC61520b
        /* renamed from: b */
        public final void mo86688b(Context context) {
            UgAllServiceImpl.m65444c().mo57258c(context);
        }

        @Override // com.p2082ss.android.ugc.aweme.newfollow.p3507ui.C61517e.AbstractC61520b
        /* renamed from: a */
        public final boolean mo86687a(Context context) {
            return UgAllServiceImpl.m65444c().mo57259d(context);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i.C62209a
    /* renamed from: d */
    public final void mo100177d() {
        C61517e eVar;
        if (C61799b.f140285a.getEnablePushGuide() != 0 && (eVar = this.f141196a) != null) {
            eVar.mo99173a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i.C62209a
    /* renamed from: f */
    public final void mo100179f() {
        super.mo100179f();
        C62271n.m112656a((Bundle) null, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i.C62209a
    /* renamed from: a */
    public final void mo100174a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        NoticeView noticeView = (NoticeView) mo100205c(R.id.bbc);
        noticeView.setIconImage(2131231265);
        SpannableString spannableString = new SpannableString(C34722h.m70923b(R.string.ckg));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C34722h.m70923b(R.string.ckh) + " ");
        if (mo100206j().getContext() != null) {
            Context context = mo100206j().getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            spannableString.setSpan(new ForegroundColorSpan(C0643b.m2378c(context, R.color.bh)), 0, spannableString.length(), 34);
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 18);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        noticeView.setTitleText(spannableStringBuilder);
        C62271n.m112657a(noticeView);
        C61517e eVar = new C61517e(noticeView, new C62191a());
        this.f141196a = eVar;
        eVar.f139651f = C61517e.EnumC61519a.Message;
        C61799b.f140285a.getEnablePushGuide();
        if (C61799b.f140285a.getEnablePushGuide() != 0) {
            C61517e eVar2 = this.f141196a;
            if (eVar2 == null) {
                C89219l.m154715b();
            }
            eVar2.mo99173a();
        }
    }
}
