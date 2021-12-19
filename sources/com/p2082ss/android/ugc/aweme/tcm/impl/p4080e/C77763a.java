package com.p2082ss.android.ugc.aweme.tcm.impl.p4080e;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commerce.C37486c;
import com.p2082ss.android.ugc.aweme.commerce.C37494e;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38583c;
import com.p2082ss.android.ugc.aweme.commercialize.util.p2620b.C38582a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.profile.model.TcmConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBADetagBA;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBAHideLoading;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBAShowLoading;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBAToPublish;
import com.p2082ss.android.ugc.aweme.tcm.api.p4073a.AbstractC77727a;
import com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77728a;
import com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77731c;
import com.p2082ss.android.ugc.aweme.tcm.impl.api.BABCRemoveMeApi;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4075a.C77736a;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4076b.C77740b;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4079d.C77758a;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4079d.C77759b;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4079d.C77762e;
import com.p2082ss.android.ugc.trill.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tcm.impl.e.a */
public final class C77763a {

    /* renamed from: a */
    public static final C77763a f174386a = new C77763a();

    private C77763a() {
    }

    static {
        Covode.recordClassIndex(90824);
    }

    /* renamed from: a */
    public static final boolean m135856a() {
        TcmConfig a;
        TcmConfig a2;
        AbstractC77727a a3 = C77736a.m135835a();
        if ((a3 == null || !a3.mo65701a()) && (a = C77762e.m135852a()) != null && a.isBrandedContentCreator() && (a2 = C77762e.m135852a()) != null && a2.getCanUseBrandedContentTool()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.e.a$a */
    public static final class C77764a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ CheckBAShowLoading f174387a;

        static {
            Covode.recordClassIndex(90825);
        }

        public C77764a(CheckBAShowLoading checkBAShowLoading) {
            this.f174387a = checkBAShowLoading;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f174387a.showLoading();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.e.a$c */
    public static final class C77767c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ CheckBAToPublish f174393a;

        static {
            Covode.recordClassIndex(90828);
        }

        public C77767c(CheckBAToPublish checkBAToPublish) {
            this.f174393a = checkBAToPublish;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f174393a.toPublish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.e.a$d */
    public static final class C77768d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ CheckBAShowLoading f174394a;

        static {
            Covode.recordClassIndex(90829);
        }

        public C77768d(CheckBAShowLoading checkBAShowLoading) {
            this.f174394a = checkBAShowLoading;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f174394a.showLoading();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.e.a$f */
    public static final class C77772f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ CheckBAToPublish f174403a;

        static {
            Covode.recordClassIndex(90833);
        }

        public C77772f(CheckBAToPublish checkBAToPublish) {
            this.f174403a = checkBAToPublish;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f174403a.toPublish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.e.a$h */
    public static final class C77776h extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        public static final C77776h f174408a = new C77776h();

        static {
            Covode.recordClassIndex(90837);
        }

        C77776h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            C89219l.m154721d(aVar, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.e.a$k */
    public static final class C77779k extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Context f174413a;

        static {
            Covode.recordClassIndex(90840);
        }

        public C77779k(Context context) {
            this.f174413a = context;
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(C0643b.m2378c(this.f174413a, R.color.a2));
            textPaint.setUnderlineText(false);
            textPaint.setFakeBoldText(true);
        }

        public final void onClick(View view) {
            String str;
            C89219l.m154721d(view, "");
            BrandedContentToolSchema a = C77759b.m135850a();
            if (a == null || (str = a.brandedContentInfo) == null) {
                str = "https://support.tiktok.com/en/business-and-creator/creator-and-business-accounts/branded-content-on-tiktok";
            }
            SmartRouter.buildRoute(this.f174413a, "aweme://webview/").withParam("url", str).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.e.a$g */
    public static final class C77773g extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Aweme f174404a;

        /* renamed from: b */
        final /* synthetic */ Context f174405b;

        static {
            Covode.recordClassIndex(90834);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77773g(Aweme aweme, Context context) {
            super(1);
            this.f174404a = aweme;
            this.f174405b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            String str;
            C89219l.m154721d(aVar, "");
            BABCRemoveMeApi bABCRemoveMeApi = (BABCRemoveMeApi) C38582a.m78287a(BABCRemoveMeApi.class, C38583c.f91178a);
            Aweme aweme = this.f174404a;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            bABCRemoveMeApi.getBABCRemoveMe(str).mo143254a(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.tcm.impl.p4080e.C77763a.C77773g.C777741 */

                /* renamed from: a */
                final /* synthetic */ C77773g f174406a;

                static {
                    Covode.recordClassIndex(90835);
                }

                {
                    this.f174406a = r1;
                }

                /* JADX WARNING: Removed duplicated region for block: B:22:0x0086  */
                /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ void accept(java.lang.Object r8) {
                    /*
                    // Method dump skipped, instructions count: 138
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tcm.impl.p4080e.C77763a.C77773g.C777741.accept(java.lang.Object):void");
                }
            }, new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.tcm.impl.p4080e.C77763a.C77773g.C777752 */

                /* renamed from: a */
                final /* synthetic */ C77773g f174407a;

                static {
                    Covode.recordClassIndex(90836);
                }

                {
                    this.f174407a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    C77763a.m135854a(this.f174407a.f174405b);
                    C77763a.m135855a(this.f174407a.f174404a, false);
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.e.a$j */
    public static final class C77778j extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ boolean f174410a;

        /* renamed from: b */
        final /* synthetic */ Activity f174411b;

        /* renamed from: c */
        final /* synthetic */ boolean f174412c;

        static {
            Covode.recordClassIndex(90839);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77778j(boolean z, Activity activity, boolean z2) {
            super(1);
            this.f174410a = z;
            this.f174411b = activity;
            this.f174412c = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            String str;
            String str2;
            C89219l.m154721d(aVar, "");
            if (this.f174410a) {
                str = "passively_popup_highfans_bc";
            } else {
                str = "passively_popup_lowfans_bc";
            }
            C33744d dVar = new C33744d();
            if (this.f174410a) {
                str2 = "highfans_choice";
            } else {
                str2 = "lowfans_choice";
            }
            C39162r.m79460a(str, dVar.mo59980a(str2, 2).f79943a);
            C77740b.m135839a(this.f174411b, this.f174412c, null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final String m135853a(long j) {
        if (1000 > j || 9999 < j) {
            return C53437b.m98615a(j);
        }
        return new BigDecimal(j).divide(new BigDecimal(1000), 1, RoundingMode.HALF_UP).toString() + "K";
    }

    /* renamed from: b */
    public static Activity m135858b(Context context) {
        C89219l.m154721d(context, "");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) context;
            if (contextThemeWrapper.getBaseContext() instanceof Activity) {
                Context baseContext = contextThemeWrapper.getBaseContext();
                Objects.requireNonNull(baseContext, "null cannot be cast to non-null type android.app.Activity");
                return (Activity) baseContext;
            }
        }
        return C17873f.m33102j();
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.e.a$b */
    public static final class C77765b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ CheckBAHideLoading f174388a;

        /* renamed from: b */
        final /* synthetic */ CheckBAToPublish f174389b;

        /* renamed from: c */
        final /* synthetic */ Context f174390c;

        /* renamed from: d */
        final /* synthetic */ CheckBADetagBA f174391d;

        static {
            Covode.recordClassIndex(90826);
        }

        public C77765b(CheckBAHideLoading checkBAHideLoading, CheckBAToPublish checkBAToPublish, Context context, CheckBADetagBA checkBADetagBA) {
            this.f174388a = checkBAHideLoading;
            this.f174389b = checkBAToPublish;
            this.f174390c = context;
            this.f174391d = checkBADetagBA;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 116
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tcm.impl.p4080e.C77763a.C77765b.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.e.a$e */
    public static final class C77769e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ CheckBAHideLoading f174395a;

        /* renamed from: b */
        final /* synthetic */ CheckBAToPublish f174396b;

        /* renamed from: c */
        final /* synthetic */ Context f174397c;

        /* renamed from: d */
        final /* synthetic */ Activity f174398d;

        /* renamed from: e */
        final /* synthetic */ boolean f174399e;

        static {
            Covode.recordClassIndex(90830);
        }

        public C77769e(CheckBAHideLoading checkBAHideLoading, CheckBAToPublish checkBAToPublish, Context context, Activity activity, boolean z) {
            this.f174395a = checkBAHideLoading;
            this.f174396b = checkBAToPublish;
            this.f174397c = context;
            this.f174398d = activity;
            this.f174399e = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (android.text.TextUtils.isEmpty(r0) != false) goto L_0x0019;
         */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r5) {
            /*
            // Method dump skipped, instructions count: 125
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tcm.impl.p4080e.C77763a.C77769e.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.e.a$i */
    public static final class C77777i extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ boolean f174409a;

        static {
            Covode.recordClassIndex(90838);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77777i(boolean z) {
            super(1);
            this.f174409a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            String str;
            String str2;
            if (this.f174409a) {
                C39162r.m79460a("tcm_bc_toggle", new C33744d().mo59980a("click_toggle", 5).f79943a);
                if (C77763a.m135856a()) {
                    C77728a.m135801b("0");
                    C77728a.m135799a((String) null);
                } else {
                    C77731c.m135807b("0");
                    C77731c.m135805a(null);
                }
            }
            if (this.f174409a) {
                str = "passively_popup_highfans_bc";
            } else {
                str = "passively_popup_lowfans_bc";
            }
            C33744d dVar = new C33744d();
            if (this.f174409a) {
                str2 = "highfans_choice";
            } else {
                str2 = "lowfans_choice";
            }
            C39162r.m79460a(str, dVar.mo59980a(str2, 1).f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m135854a(Context context) {
        String str;
        C89219l.m154721d(context, "");
        Activity b = m135858b(context);
        if (b != null) {
            C23144b bVar = new C23144b(b);
            Resources resources = context.getResources();
            if (resources != null) {
                str = resources.getString(R.string.dck);
            } else {
                str = null;
            }
            bVar.mo37635a(str).mo37637b();
        }
    }

    /* renamed from: a */
    public static final boolean m135857a(String str) {
        List<String> list;
        C37494e brandedContent;
        C37486c a = C77758a.m135849a();
        if (a == null || (brandedContent = a.getBrandedContent()) == null) {
            list = null;
        } else {
            list = brandedContent.getEnterFroms();
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (String str2 : list) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m135855a(Aweme aweme, boolean z) {
        String str;
        String str2;
        C33744d a = new C33744d().mo59983a("enter_from", "video_play");
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C33744d a2 = a.mo59983a("item_id", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C39162r.m79460a("ttelite_BA_bctool_video_remove_tag", a2.mo59983a("remove_success", str2).f79943a);
    }
}
