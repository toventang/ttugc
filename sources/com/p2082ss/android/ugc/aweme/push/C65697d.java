package com.p2082ss.android.ugc.aweme.push;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61553e;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.C53603g;
import com.p2082ss.android.ugc.aweme.push.C65722f;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.push.d */
public final class C65697d {

    /* renamed from: d */
    public static final AbstractC89244h f148026d = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C65699b.f148032a);

    /* renamed from: e */
    public static final C65698a f148027e = new C65698a((byte) 0);

    /* renamed from: a */
    AbstractC88412b f148028a;

    /* renamed from: b */
    public boolean f148029b;

    /* renamed from: c */
    String f148030c;

    /* renamed from: f */
    private final AbstractC89244h f148031f = C89250i.m154773a((AbstractC89171a) C65700c.f148033a);

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.push.d$h */
    public static final class C65706h<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C65706h f148054a = new C65706h();

        static {
            Covode.recordClassIndex(77199);
        }

        C65706h() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: a */
    public final View$OnClickListenerC65719e mo104851a() {
        return (View$OnClickListenerC65719e) this.f148031f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.push.d$a */
    public static final class C65698a {
        static {
            Covode.recordClassIndex(77191);
        }

        /* renamed from: a */
        public static C65697d m117593a() {
            return (C65697d) C65697d.f148026d.getValue();
        }

        private C65698a() {
        }

        public /* synthetic */ C65698a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.push.d$b */
    static final class C65699b extends AbstractC89220m implements AbstractC89171a<C65697d> {

        /* renamed from: a */
        public static final C65699b f148032a = new C65699b();

        static {
            Covode.recordClassIndex(77192);
        }

        C65699b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C65697d invoke() {
            return new C65697d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.push.d$c */
    static final class C65700c extends AbstractC89220m implements AbstractC89171a<View$OnClickListenerC65719e> {

        /* renamed from: a */
        public static final C65700c f148033a = new C65700c();

        static {
            Covode.recordClassIndex(77193);
        }

        C65700c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View$OnClickListenerC65719e invoke() {
            return new View$OnClickListenerC65719e();
        }
    }

    static {
        Covode.recordClassIndex(77190);
    }

    /* renamed from: com.ss.android.ugc.aweme.push.d$e */
    static final class C65702e extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65697d f148040a;

        /* renamed from: b */
        final /* synthetic */ String f148041b;

        /* renamed from: c */
        final /* synthetic */ Activity f148042c;

        /* renamed from: d */
        final /* synthetic */ boolean f148043d;

        static {
            Covode.recordClassIndex(77195);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65702e(C65697d dVar, String str, Activity activity, boolean z) {
            super(1);
            this.f148040a = dVar;
            this.f148041b = str;
            this.f148042c = activity;
            this.f148043d = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            String str;
            C89219l.m154721d(aVar, "");
            String str2 = this.f148041b;
            if (C65697d.m117589a(this.f148042c)) {
                str = "live_take_popup_in_room";
            } else {
                str = "live_take_popup_out_room";
            }
            C65722f.C65723a.m117659a(str2, "cancel", str, this.f148043d);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.push.d$f */
    public static final class C65703f<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C65703f f148044a = new C65703f();

        static {
            Covode.recordClassIndex(77196);
        }

        C65703f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            C89219l.m154721d(l, "");
            return Long.valueOf(l.longValue() + 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.push.d$i */
    static final class C65707i extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f148055a;

        static {
            Covode.recordClassIndex(77200);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65707i(String str) {
            super(1);
            this.f148055a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            C89219l.m154721d(aVar, "");
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            s.mo95830d().mo13039t();
            C65722f.C65723a.m117659a(this.f148055a, "go_live", "live_take_popup_in_room", true);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.push.d$j */
    static final class C65708j extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65697d f148056a;

        /* renamed from: b */
        final /* synthetic */ String f148057b;

        /* renamed from: c */
        final /* synthetic */ Activity f148058c;

        static {
            Covode.recordClassIndex(77201);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65708j(C65697d dVar, String str, Activity activity) {
            super(1);
            this.f148056a = dVar;
            this.f148057b = str;
            this.f148058c = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            String str;
            C89219l.m154721d(aVar, "");
            String str2 = this.f148057b;
            if (C65697d.m117589a(this.f148058c)) {
                str = "live_take_popup_in_room";
            } else {
                str = "live_take_popup_out_room";
            }
            C65722f.C65723a.m117659a(str2, "cancel", str, true);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static boolean m117589a(Activity activity) {
        if (activity == null) {
            return false;
        }
        if (TextUtils.equals(activity.getLocalClassName(), "com.ss.android.ugc.aweme.live.LiveBroadcastActivity") || TextUtils.equals(activity.getLocalClassName(), "com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m117590b(Activity activity) {
        if (activity == null) {
            return false;
        }
        if (TextUtils.equals(activity.getLocalClassName(), "com.ss.android.ugc.aweme.live.LivePlayActivity") || TextUtils.equals(activity.getLocalClassName(), "com.ss.android.ugc.aweme.live.LiveBroadcastActivity")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.push.d$g */
    public static final class C65704g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C65697d f148045a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f148046b;

        /* renamed from: c */
        final /* synthetic */ String f148047c;

        /* renamed from: d */
        final /* synthetic */ String f148048d;

        /* renamed from: e */
        final /* synthetic */ String f148049e;

        /* renamed from: f */
        final /* synthetic */ String f148050f;

        /* renamed from: g */
        final /* synthetic */ String f148051g;

        /* renamed from: h */
        final /* synthetic */ C61553e f148052h;

        static {
            Covode.recordClassIndex(77197);
        }

        C65704g(C65697d dVar, C89233z.C89238e eVar, String str, String str2, String str3, String str4, String str5, C61553e eVar2) {
            this.f148045a = dVar;
            this.f148046b = eVar;
            this.f148047c = str;
            this.f148048d = str2;
            this.f148049e = str3;
            this.f148050f = str4;
            this.f148051g = str5;
            this.f148052h = eVar2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Long l = (Long) obj;
            if (this.f148045a.f148029b || l.longValue() >= 60) {
                AbstractC88412b bVar = this.f148045a.f148028a;
                if (bVar != null) {
                    bVar.dispose();
                    return;
                }
                return;
            }
            T t = this.f148046b.element;
            if (t != null) {
                t.runOnUiThread(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.push.C65697d.C65704g.RunnableC657051 */

                    /* renamed from: a */
                    final /* synthetic */ C65704g f148053a;

                    static {
                        Covode.recordClassIndex(77198);
                    }

                    {
                        this.f148053a = r1;
                    }

                    public final void run() {
                        this.f148053a.f148045a.mo104852a(false, this.f148053a.f148047c, this.f148053a.f148048d, this.f148053a.f148049e, this.f148053a.f148050f, this.f148053a.f148051g, this.f148053a.f148052h);
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.push.d$d */
    static final class C65701d extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65697d f148034a;

        /* renamed from: b */
        final /* synthetic */ Activity f148035b;

        /* renamed from: c */
        final /* synthetic */ String f148036c;

        /* renamed from: d */
        final /* synthetic */ String f148037d;

        /* renamed from: e */
        final /* synthetic */ boolean f148038e;

        /* renamed from: f */
        final /* synthetic */ String f148039f;

        static {
            Covode.recordClassIndex(77194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65701d(C65697d dVar, Activity activity, String str, String str2, boolean z, String str3) {
            super(1);
            this.f148034a = dVar;
            this.f148035b = activity;
            this.f148036c = str;
            this.f148037d = str2;
            this.f148038e = z;
            this.f148039f = str3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            C89219l.m154721d(aVar, "");
            if (C65697d.m117589a(this.f148035b)) {
                ILiveOuterService s = LiveOuterService.m107269s();
                C89219l.m154716b(s, "");
                s.mo95830d().mo13024e(this.f148036c);
                C65722f.C65723a.m117659a(this.f148037d, "go_live", "live_take_popup_in_room", this.f148038e);
            } else {
                ILiveOuterService s2 = LiveOuterService.m107269s();
                C89219l.m154716b(s2, "");
                s2.mo95830d().mo95861f(this.f148039f);
                C65722f.C65723a.m117659a(this.f148037d, "go_live", "live_take_popup_out_room", this.f148038e);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static String m117588a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo104852a(boolean z, String str, String str2, String str3, String str4, String str5, C61553e eVar) {
        boolean z2;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            C53603g.C53604a.m98850a();
            boolean b = C53603g.m98845b();
            C89233z.C89238e eVar2 = new C89233z.C89238e();
            eVar2.element = (T) C17873f.m33102j();
            if (!C80580in.m139687c() && b && !C17873f.f42636l && !m117590b(eVar2.element)) {
                boolean isRecording = AVExternalServiceImpl.m113114a().configService().shortVideoConfig().isRecording();
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                if (eVar2.element instanceof MainActivity) {
                    Boolean isFollowFeed = eVar2.element.isFollowFeed();
                    C89219l.m154716b(isFollowFeed, "");
                    z2 = isFollowFeed.booleanValue();
                } else {
                    z2 = false;
                }
                if (!isRecording && ((!(eVar2.element instanceof MainActivity) || !eVar2.element.isADShowing() || z2) && (createIUserServicebyMonsterPlugin == null || createIUserServicebyMonsterPlugin.isLogin()))) {
                    try {
                        if (eVar2.element != null) {
                            if (!z) {
                                this.f148029b = true;
                            }
                            mo104851a().f148083e = eVar2.element;
                            mo104851a().mo104863a(str, str2, str3, str4, this.f148030c, str5, eVar);
                            mo104851a().mo85244c();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (z) {
                    this.f148029b = false;
                    this.f148028a = AbstractC88979t.m154280a(0, 60, 1, 1, TimeUnit.SECONDS).mo143292d(C65703f.f148044a).mo143254a(new C65704g(this, eVar2, str, str2, str3, str4, str5, eVar), C65706h.f148054a);
                }
            }
        }
    }
}
