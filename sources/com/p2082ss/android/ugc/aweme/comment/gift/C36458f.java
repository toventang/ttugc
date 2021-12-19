package com.p2082ss.android.ugc.aweme.comment.gift;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.C11637d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.router.SmartRouter;
import com.google.p1998c.p1999a.C27254p;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.comment.gift.f */
public final class C36458f {

    /* renamed from: c */
    public static final C36459a f86178c = new C36459a((byte) 0);

    /* renamed from: a */
    public final ActivityC0945e f86179a;

    /* renamed from: b */
    public final GiftViewModel f86180b;

    /* renamed from: d */
    private final Fragment f86181d;

    /* renamed from: e */
    private final String f86182e;

    /* renamed from: f */
    private final String f86183f;

    /* renamed from: g */
    private final String f86184g;

    static {
        Covode.recordClassIndex(43756);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.f$a */
    public static final class C36459a {
        static {
            Covode.recordClassIndex(43757);
        }

        private C36459a() {
        }

        public /* synthetic */ C36459a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static String m74212a() {
        if (C58071d.m104909c()) {
            return "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
        }
        return "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
    }

    /* renamed from: c */
    private final void m74215c() {
        C33744d a = new C33744d().mo59983a("enter_from", this.f86182e).mo59983a("group_id", this.f86183f).mo59983a("author_id", this.f86184g).mo59982a("current_balance", this.f86180b.mo63843d().getValue());
        C89219l.m154716b(a, "");
        C39162r.m79460a("show_underage_recharge_prompt", a.f79943a);
    }

    /* renamed from: b */
    private final View m74214b() {
        String string = this.f86179a.getResources().getString(R.string.h9m);
        C89219l.m154716b(string, "");
        String string2 = this.f86179a.getResources().getString(R.string.h9j);
        C89219l.m154716b(string2, "");
        String string3 = this.f86179a.getResources().getString(R.string.h9l);
        C89219l.m154716b(string3, "");
        View a = C1764a.m5927a(LayoutInflater.from(this.f86179a), R.layout.jk, null, false);
        View findViewById = a.findViewById(R.id.dfd);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(string);
        View findViewById2 = a.findViewById(R.id.dfa);
        Objects.requireNonNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        String str = string2 + "  " + string3 + "  ";
        SpannableString spannableString = new SpannableString(str);
        ImageSpan imageSpan = new ImageSpan(this.f86179a, 2131231221, 1);
        StyleSpan styleSpan = new StyleSpan(1);
        ActivityC0945e eVar = this.f86179a;
        if (eVar == null) {
            C89219l.m154715b();
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C0643b.m2378c(eVar, R.color.b_));
        int a2 = C89361p.m154888a((CharSequence) str, string3, 0, false, 6);
        int length = string3.length() + a2;
        spannableString.setSpan(styleSpan, a2, length, 33);
        spannableString.setSpan(foregroundColorSpan, a2, length, 33);
        spannableString.setSpan(imageSpan, str.length() - 1, str.length(), 33);
        spannableString.setSpan(new C36460b(this), a2, str.length(), 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.f$b */
    public static final class C36460b extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C36458f f86185a;

        static {
            Covode.recordClassIndex(43758);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36460b(C36458f fVar) {
            this.f86185a = fVar;
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            C33744d a = new C33744d().mo59983a("enter_from", "recharge_panel");
            C89219l.m154716b(a, "");
            C39162r.m79460a("click_recharge_learn_more", a.f79943a);
            SmartRouter.buildRoute(this.f86185a.f86179a, "aweme://webview").withParam(Uri.parse("https://www.tiktok.com/legal/virtual-items")).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.f$e */
    public static final class C36463e implements AbstractC11635b {

        /* renamed from: a */
        final /* synthetic */ C36458f f86189a;

        static {
            Covode.recordClassIndex(43761);
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b
        /* renamed from: a */
        public final void mo18418a(int i, int i2, String str) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36463e(C36458f fVar) {
            this.f86189a = fVar;
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b
        /* renamed from: a */
        public final void mo18419a(long j) {
            this.f86189a.f86180b.mo63839a("from_recharge", this.f86189a.f86179a, 1, j);
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b
        /* renamed from: a */
        public final void mo18420a(Exception exc, String str) {
            this.f86189a.f86180b.mo63839a("from_recharge", this.f86189a.f86179a, 0, 0);
        }
    }

    /* renamed from: b */
    public final void mo63787b(String str) {
        C33744d a = new C33744d().mo59983a("enter_from", this.f86182e).mo59983a("group_id", this.f86183f).mo59983a("author_id", this.f86184g).mo59983a("enter_method", str).mo59982a("current_balance", this.f86180b.mo63843d().getValue());
        C89219l.m154716b(a, "");
        C39162r.m79460a("dismiss_underage_recharge_prompt", a.f79943a);
    }

    /* renamed from: a */
    public final void mo63786a(String str) {
        C89219l.m154721d(str, "");
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        Boolean bool = (Boolean) s.mo95837k().mo95878a("can_recharge", true);
        Integer num = (Integer) s.mo95837k().mo95878a("low_age_user_limit", 18);
        String str2 = (String) s.mo95837k().mo95878a("live_sdk_appeal_webview", "");
        if (C27254p.m54261a(str2)) {
            str2 = m74212a();
        }
        if (!bool.booleanValue()) {
            C89219l.m154716b(num, "");
            m74213a(num.intValue(), str2);
            return;
        }
        C89378p[] pVarArr = new C89378p[6];
        pVarArr[0] = C89387v.m154943a("video_enter_from", this.f86182e);
        pVarArr[1] = C89387v.m154943a("video_enter_method", this.f86182e);
        pVarArr[2] = C89387v.m154943a("video_group_id", this.f86183f);
        pVarArr[3] = C89387v.m154943a("video_author_id", this.f86184g);
        String str3 = this.f86180b.f86229d;
        if (str3 == null) {
            str3 = "";
        }
        pVarArr[4] = C89387v.m154943a("video_request_id", str3);
        pVarArr[5] = C89387v.m154943a("charge_reason", str);
        Map<String, String> a = C89041ag.m154421a(pVarArr);
        Bundle bundle = new Bundle();
        bundle.putInt("key_bundle_charge_source", 4);
        C11637d.C11638a aVar = new C11637d.C11638a();
        aVar.mo18422a(m74214b());
        aVar.mo18423a(a);
        ILiveOuterService s2 = LiveOuterService.m107269s();
        C89219l.m154716b(s2, "");
        DialogInterface$OnCancelListenerC0944d a2 = s2.mo95830d().mo12973a(this.f86179a, new C36463e(this), bundle, aVar.mo18424a());
        C89219l.m154716b(a2, "");
        a2.showNow(this.f86181d.getChildFragmentManager(), "CommentGiftChoosePanel");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.gift.f$c */
    public static final class DialogInterface$OnClickListenerC36461c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36458f f86186a;

        static {
            Covode.recordClassIndex(43759);
        }

        DialogInterface$OnClickListenerC36461c(C36458f fVar) {
            this.f86186a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f86186a.mo63787b("click_dismiss");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.gift.f$d */
    public static final class DialogInterface$OnClickListenerC36462d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36458f f86187a;

        /* renamed from: b */
        final /* synthetic */ String f86188b;

        static {
            Covode.recordClassIndex(43760);
        }

        DialogInterface$OnClickListenerC36462d(C36458f fVar, String str) {
            this.f86187a = fVar;
            this.f86188b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            s.mo95830d().mo13004a(this.f86187a.f86179a, Uri.parse(this.f86188b));
            this.f86187a.mo63787b("click_contact_us");
        }
    }

    /* renamed from: a */
    private final void m74213a(int i, String str) {
        C17197a.C17200a aVar = new C17197a.C17200a(this.f86179a);
        aVar.f41071b = this.f86179a.getResources().getString(R.string.h9n, String.valueOf(i));
        aVar.mo27195b(R.string.gju, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC36461c(this), false).mo27190a(R.string.h9o, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC36462d(this, str), false).mo27193a().mo27185c().show();
        m74215c();
    }

    public C36458f(Fragment fragment, ActivityC0945e eVar, GiftViewModel giftViewModel, String str, String str2, String str3) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(giftViewModel, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f86181d = fragment;
        this.f86179a = eVar;
        this.f86180b = giftViewModel;
        this.f86182e = str;
        this.f86183f = str2;
        this.f86184g = str3;
    }
}
