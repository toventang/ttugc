package com.p2082ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.AbstractC34895bp;
import com.p2082ss.android.ugc.aweme.AbstractC35329by;
import com.p2082ss.android.ugc.aweme.C33931ar;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38681bh;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.music.p3481ui.C61156d;
import com.p2082ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.notificationlive.C62513a;
import com.p2082ss.android.ugc.aweme.notificationlive.C62577t;
import com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.C62661i;
import com.p2082ss.android.ugc.aweme.p2352aw.C34267a;
import com.p2082ss.android.ugc.aweme.profile.api.AwemeApi;
import com.p2082ss.android.ugc.aweme.profile.api.C63429c;
import com.p2082ss.android.ugc.aweme.profile.api.C63431e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3571e.C63511a;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3579c.C64073a;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3579c.C64082d;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.profiletab.C64169b;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.profiletab.ProfileTab;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63853q;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63833b;
import com.p2082ss.android.ugc.aweme.utils.C80428fg;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.profile.ProfileServiceImpl */
public final class ProfileServiceImpl extends BaseProfileServiceImpl {
    static {
        Covode.recordClassIndex(74630);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: b */
    public final String mo101961b() {
        return "/tiktok/user/permission/get/v1/";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        if (r0.intValue() != 0) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101959a(java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.ProfileServiceImpl.mo101959a(java.lang.String, java.lang.String):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final void mo101960a(String str, String str2, String str3, int i, boolean z, View view, AbstractC63755f fVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(fVar, "");
        User user = new User();
        user.setUid(str);
        user.setUniqueId(str2);
        user.setFollowStatus(1);
        user.setLivePushNotificationStatus(i);
        user.setSecUid(str3);
        C88960c<C62513a> a = C62577t.m112999a();
        if (a != null) {
            a.onNext(new C62513a(user, C34729o.m70950a(view.getContext()), "", "others_homepage", z, fVar));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: c */
    public final boolean mo101965c() {
        return C62577t.m113007b();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: d */
    public final /* synthetic */ AbstractC63853q mo101966d() {
        return new C63833b();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: e */
    public final /* synthetic */ Fragment mo101967e() {
        return new C62661i();
    }

    /* renamed from: g */
    public static IProfileService m114884g() {
        Object a = C81908b.m141854a(IProfileService.class, false);
        if (a != null) {
            return (IProfileService) a;
        }
        return new ProfileServiceImpl();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: f */
    public final void mo101968f() {
        PowerPreloadServiceImpl.m111300a().mo28815a("/aweme/v1/user/profile/other/", null);
        PowerPreloadServiceImpl.m111300a().mo28815a("/aweme/v1/aweme/post/", null);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final String mo101952a() {
        return Uri.parse(C63429c.f144023a).buildUpon().toString();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final String mo101954a(boolean z) {
        return C63429c.m115020a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final int mo101949a(User user) {
        if (user == null) {
            return 0;
        }
        return user.getCommerceUserLevel();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: b */
    public final boolean mo101963b(Context context) {
        C89219l.m154721d(context, "");
        return C80428fg.m139432a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: c */
    public final C33931ar mo101964c(Context context) {
        C89219l.m154721d(context, "");
        C33931ar a = C64169b.m116103a(context);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ProfileServiceImpl$a */
    public static final class C63344a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Dialog f143773a;

        /* renamed from: b */
        final /* synthetic */ Activity f143774b;

        /* renamed from: c */
        final /* synthetic */ String f143775c;

        /* renamed from: d */
        final /* synthetic */ String f143776d;

        static {
            Covode.recordClassIndex(74631);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(C0643b.m2378c(this.f143774b, R.color.bx));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            if (this.f143773a.isShowing()) {
                this.f143773a.dismiss();
            }
            SmartRouter.buildRoute(this.f143774b, "//privacy/suggest_account").withParam("enter_from", this.f143775c).withParam("previous_page", this.f143776d).withParam("is_rec", 1).open();
        }

        C63344a(Dialog dialog, Activity activity, String str, String str2) {
            this.f143773a = dialog;
            this.f143774b = activity;
            this.f143775c = str;
            this.f143776d = str2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final AbstractC34895bp mo101950a(Activity activity) {
        C89219l.m154721d(activity, "");
        return new C34267a(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final AbstractC35329by mo101951a(Context context) {
        C89219l.m154721d(context, "");
        return new ProfileTab(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final void mo101956a(Handler handler) {
        C89219l.m154721d(handler, "");
        C63431e.m115024a();
        C63431e.m115026a(handler, C31575b.m65865g().getCurUserId(), C31575b.m65865g().getCurSecUserId(), null, 0, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final String mo101953a(Aweme aweme, C38214ac acVar) {
        String aid;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(acVar, "");
        C38214ac a = C38681bh.m78486a(aweme);
        if (a == null || aweme == null) {
            aid = "";
        } else {
            HashMap hashMap = new HashMap();
            String str = a.creativeId;
            String str2 = a.logExtra;
            aid = aweme.getAid();
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("creative_id", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("log_extra", str2);
            }
            C29803q.m60037b(hashMap, true);
            AwemeApi.f144001e.disLikeAweme(aid, hashMap).execute();
        }
        C89219l.m154716b(aid, "");
        return aid;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: b */
    public final void mo101962b(AbstractC0952i iVar, C63511a aVar, String str) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(str, "");
        C23226a.C23227a aVar2 = new C23226a.C23227a();
        C64073a aVar3 = new C64073a();
        Bundle bundle = new Bundle();
        if (aVar != null) {
            bundle.putString("enter_from", aVar.f144137a);
            bundle.putString("enter_method", aVar.f144138b);
        }
        aVar3.setArguments(bundle);
        aVar2.mo37817a(aVar3).mo37812a(1).mo37819a(true).mo37822b(false).f55057a.show(iVar, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final void mo101955a(Activity activity, String str, String str2) {
        MethodCollector.m26663i(7788);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        View inflate = LayoutInflater.from(activity).inflate(R.layout.apg, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.ew2);
        C89219l.m154716b(findViewById, "");
        TextView textView = (TextView) findViewById;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(C0643b.m2378c(activity, R.color.c9));
        C89219l.m154716b(inflate, "");
        Dialog a = C61156d.m110775a(activity, inflate, R.style.v8);
        String string = activity.getResources().getString(R.string.cv8);
        C89219l.m154716b(string, "");
        String string2 = activity.getResources().getString(R.string.c_e, string);
        C89219l.m154716b(string2, "");
        int a2 = C89361p.m154888a((CharSequence) string2, string, 0, false, 6);
        int length = string.length() + a2;
        SpannableString spannableString = new SpannableString(string2);
        if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string) && a2 >= 0) {
            spannableString.setSpan(new C63344a(a, activity, str, str2), a2, length, 34);
            spannableString.setSpan(new StyleSpan(1), a2, length, 34);
        }
        textView.setText(spannableString);
        a.show();
        MethodCollector.m26664o(7788);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    public final void mo101957a(AbstractC0952i iVar, C63511a aVar, String str) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(str, "");
        C64082d.C64083a.m115995a(iVar, aVar, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        if (r10 != null) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a1, code lost:
        if (r10 != null) goto L_0x0017;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.profile.IProfileService
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101958a(com.p2082ss.android.ugc.aweme.feed.model.Aweme r10, java.lang.Integer r11, int r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.ProfileServiceImpl.mo101958a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer, int, java.lang.String):void");
    }
}
