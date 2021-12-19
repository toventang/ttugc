package com.p2082ss.android.ugc.aweme.recommend.users;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Point;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.friends.model.DislikeRecommendParams;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendUserInDMBean;
import com.p2082ss.android.ugc.aweme.friends.p3017g.AbstractC51500a;
import com.p2082ss.android.ugc.aweme.friends.p3019i.C51522d;
import com.p2082ss.android.ugc.aweme.friends.recommendlist.repository.C51601a;
import com.p2082ss.android.ugc.aweme.friends.recommendlist.repository.C51608f;
import com.p2082ss.android.ugc.aweme.inbox.p3268c.C56338a;
import com.p2082ss.android.ugc.aweme.profile.service.AbstractC63871f;
import com.p2082ss.android.ugc.aweme.recommend.users.p3669a.C66650a;
import com.p2082ss.android.ugc.aweme.recommend.users.p3669a.C66651b;
import com.p2082ss.android.ugc.aweme.social.api.RecommendUserApiService;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl */
public final class IRecommendUsersServiceImpl implements IRecommendUsersService {

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl$a */
    static final class C66647a<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C66647a f149814a = new C66647a();

        static {
            Covode.recordClassIndex(78211);
        }

        C66647a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(78210);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: i */
    public final AbstractC63871f mo105663i() {
        return C51522d.f118733a;
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: a */
    public final AbstractC51500a mo105653a() {
        return new C51608f();
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: h */
    public final AbstractC88979t<RecommendUserInDMBean> mo105662h() {
        return RecommendUserApiService.f167940a.fetchRecommendUserForDMPage();
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: b */
    public final boolean mo105656b() {
        if (C66650a.m118466a() == null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: c */
    public final boolean mo105657c() {
        C66651b a = C66650a.m118466a();
        if (a == null || a.f149820b != 1) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: d */
    public final boolean mo105658d() {
        C66651b a = C66650a.m118466a();
        if (a == null || a.f149821c != 1) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: e */
    public final boolean mo105659e() {
        C66651b a = C66650a.m118466a();
        if (a == null || a.f149822d != 1) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: f */
    public final boolean mo105660f() {
        C66651b a = C66650a.m118466a();
        if (a == null || a.f149823e != 1) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: g */
    public final boolean mo105661g() {
        C66651b a = C66650a.m118466a();
        if (a == null || a.f149824f != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static IRecommendUsersService m118438j() {
        Object a = C81908b.m141854a(IRecommendUsersService.class, false);
        if (a != null) {
            return (IRecommendUsersService) a;
        }
        return new IRecommendUsersServiceImpl();
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl$b */
    static final class C66648b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C66648b f149815a = new C66648b();

        static {
            Covode.recordClassIndex(78212);
        }

        C66648b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C51423a.m95790a((Throwable) obj);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: a */
    public final void mo105654a(ActivityC0945e eVar) {
        Display display;
        MethodCollector.m26663i(8159);
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(eVar, "");
        Resources resources = eVar.getResources();
        WindowManager.LayoutParams layoutParams = null;
        View inflate = LayoutInflater.from(eVar).inflate(R.layout.le, (ViewGroup) null);
        C89219l.m154716b(inflate, "");
        View findViewById = inflate.findViewById(R.id.f50);
        C89219l.m154716b(findViewById, "");
        TextView textView = (TextView) findViewById;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(C0643b.m2378c(textView.getContext(), R.color.c9));
        Dialog dialog = new Dialog(eVar, R.style.v0);
        dialog.setCancelable(true);
        dialog.setContentView(inflate);
        WindowManager windowManager = eVar.getWindowManager();
        if (windowManager != null) {
            display = windowManager.getDefaultDisplay();
        } else {
            display = null;
        }
        Window window = dialog.getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        }
        if (layoutParams != null) {
            layoutParams.x = 0;
            layoutParams.gravity = 80;
            layoutParams.windowAnimations = R.style.uz;
        }
        Point point = new Point();
        if (display != null) {
            display.getSize(point);
        }
        if (layoutParams != null) {
            layoutParams.width = point.x;
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
        dialog.setCanceledOnTouchOutside(true);
        String string = resources.getString(R.string.cv8);
        C89219l.m154716b(string, "");
        String string2 = resources.getString(R.string.c_e, string);
        C89219l.m154716b(string2, "");
        int a = C89361p.m154888a((CharSequence) string2, string, 0, false, 6);
        int length = string.length() + a;
        SpannableString spannableString = new SpannableString(string2);
        if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string) && a >= 0) {
            spannableString.setSpan(new C56338a.C56339a(dialog, eVar, textView), a, length, 34);
            spannableString.setSpan(new StyleSpan(1), a, length, 34);
        }
        textView.setText(spannableString);
        dialog.show();
        MethodCollector.m26664o(8159);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: a */
    public final void mo105655a(String str, String str2) {
        C89219l.m154721d(str, "");
        new C51601a().mo33487c(new DislikeRecommendParams(str, str2)).mo143254a(C66647a.f149814a, C66648b.f149815a);
    }
}
