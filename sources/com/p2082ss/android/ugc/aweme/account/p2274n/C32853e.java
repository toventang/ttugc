package com.p2082ss.android.ugc.aweme.account.p2274n;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1642e.AbstractC22361c;
import com.bytedance.sdk.p1625a.p1642e.C22359a;
import com.bytedance.sdk.p1625a.p1642e.C22362d;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32404v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.p2311am.C33493a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.account.n.e */
public final class C32853e {

    /* renamed from: a */
    public static String f78227a = "";

    /* renamed from: b */
    public static final C32853e f78228b = new C32853e();

    /* renamed from: c */
    private static String f78229c = "";

    /* renamed from: d */
    private static String f78230d = "";

    /* renamed from: com.ss.android.ugc.aweme.account.n.e$a */
    public interface AbstractC32854a {
        static {
            Covode.recordClassIndex(39639);
        }

        /* renamed from: a */
        void mo57639a();
    }

    private C32853e() {
    }

    static {
        Covode.recordClassIndex(39638);
    }

    /* renamed from: a */
    public static C22359a m67446a() {
        String str;
        String str2 = f78230d;
        String str3 = f78229c;
        IAccountUserService e = C36085cj.f85262b.mo57069e();
        C89219l.m154716b(e, "");
        if (e.isChildrenMode()) {
            return null;
        }
        C22359a aVar = new C22359a();
        aVar.f52836a = str2;
        aVar.f52838c = str3;
        if (C36085cj.m73552f() != null) {
            User f = C36085cj.m73552f();
            C89219l.m154716b(f, "");
            aVar.f52837b = f.getNickname();
            if (f.getAvatarThumb() != null) {
                UrlModel avatarThumb = f.getAvatarThumb();
                C89219l.m154716b(avatarThumb, "");
                if (avatarThumb.getUrlList() != null) {
                    UrlModel avatarThumb2 = f.getAvatarThumb();
                    C89219l.m154716b(avatarThumb2, "");
                    if (!avatarThumb2.getUrlList().isEmpty()) {
                        UrlModel avatarThumb3 = f.getAvatarThumb();
                        C89219l.m154716b(avatarThumb3, "");
                        str = avatarThumb3.getUrlList().get(0);
                        aVar.f52839d = str;
                    }
                }
            }
            str = "";
            aVar.f52839d = str;
        }
        f78230d = "";
        f78229c = "";
        return aVar;
    }

    /* renamed from: a */
    public static void m67448a(String str) {
        C89219l.m154721d(str, "");
        f78229c = str;
    }

    /* renamed from: b */
    public static void m67450b(String str) {
        C89219l.m154721d(str, "");
        f78230d = str;
    }

    /* renamed from: c */
    public static void m67451c(String str) {
        C89219l.m154721d(str, "");
        f78227a = str;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.n.e$b */
    public static final class C32855b implements AbstractC22361c {

        /* renamed from: a */
        final /* synthetic */ String f78231a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f78232b;

        /* renamed from: c */
        final /* synthetic */ String f78233c;

        /* renamed from: d */
        final /* synthetic */ int f78234d;

        /* renamed from: e */
        final /* synthetic */ AbstractC32854a f78235e;

        static {
            Covode.recordClassIndex(39640);
        }

        @Override // com.bytedance.sdk.p1625a.p1642e.AbstractC22361c
        /* renamed from: a */
        public final void mo36722a(C22359a aVar) {
            if (aVar != null) {
                C32404v.m66772a(this.f78231a, this.f78232b.element, 1, 0, this.f78233c, this.f78234d);
            } else {
                C32404v.m66772a(this.f78231a, this.f78232b.element, 0, 0, this.f78233c, this.f78234d);
            }
            AbstractC32854a aVar2 = this.f78235e;
            if (aVar2 != null) {
                aVar2.mo57639a();
            }
        }

        @Override // com.bytedance.sdk.p1625a.p1642e.AbstractC22361c
        /* renamed from: a */
        public final void mo36721a(int i, int i2) {
            C32404v.m66772a(this.f78231a, this.f78232b.element, 0, i, this.f78233c, this.f78234d);
            AbstractC32854a aVar = this.f78235e;
            if (aVar != null) {
                aVar.mo57639a();
            }
        }

        C32855b(String str, C89233z.C89238e eVar, String str2, int i, AbstractC32854a aVar) {
            this.f78231a = str;
            this.f78232b = eVar;
            this.f78233c = str2;
            this.f78234d = i;
            this.f78235e = aVar;
        }
    }

    /* renamed from: a */
    public static void m67447a(Activity activity, Bundle bundle, AbstractC32854a aVar, C22359a aVar2) {
        C89219l.m154721d(aVar2, "");
        if (activity == null || bundle == null) {
            aVar.mo57639a();
            return;
        }
        String string = bundle.getString("gms_store_platform");
        if (string == null) {
            string = f78227a;
        }
        C89219l.m154716b(string, "");
        String string2 = bundle.getString("gms_enter_method");
        if (string2 == null) {
            string2 = "";
        }
        C89219l.m154716b(string2, "");
        int i = bundle.getInt("gms_use_auto_fill");
        f78227a = "";
        if (!C33493a.m68599a()) {
            aVar.mo57639a();
            return;
        }
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = (T) aVar2.f52836a;
        if (C36085cj.m73552f() != null) {
            User f = C36085cj.m73552f();
            C89219l.m154716b(f, "");
            eVar.element = (T) f.getUid();
        }
        C32404v.m66773a(string, eVar.element, string2);
        C22362d.m42100a().mo36724a(activity, aVar2, new C32855b(string, eVar, string2, i, aVar));
    }

    /* renamed from: a */
    public static void m67449a(String str, String str2, String str3, AbstractC32572b bVar, int i, String str4) {
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        if (bVar != null) {
            Bundle arguments = bVar.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            C89219l.m154716b(arguments, "");
            arguments.putString("gms_store_id", str);
            arguments.putString("gms_store_pwd", str2);
            arguments.putString("gms_store_platform", str3);
            arguments.putInt("gms_use_auto_fill", i);
            arguments.putString("gms_enter_method", str4);
            bVar.setArguments(arguments);
        }
    }
}
