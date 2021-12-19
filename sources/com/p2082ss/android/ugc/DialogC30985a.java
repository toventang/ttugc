package com.p2082ss.android.ugc;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1183ag;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.AbstractC1392ac;
import androidx.recyclerview.widget.C1482s;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.C14894c;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.p1019f.C14936d;
import com.bytedance.ies.dmt.p1194ui.carousel.HorizontalCarousel;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23001b;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.AbstractC34936bt;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.IProfileBadgeService;
import com.p2082ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.badge.C34437f;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.AbstractC63510e;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.MusAvatarWithBorderView;
import com.p2082ss.android.ugc.aweme.setting.C68030bp;
import com.p2082ss.android.ugc.aweme.setting.C68063cl;
import com.p2082ss.android.ugc.aweme.setting.C68064cm;
import com.p2082ss.android.ugc.aweme.setting.C68194p;
import com.p2082ss.android.ugc.aweme.share.AbstractC69358o;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.UserSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.DialogC69695i;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80630u;
import com.p2082ss.android.ugc.navi.C84165a;
import com.p2082ss.android.ugc.navi.C84174b;
import com.p2082ss.android.ugc.navi.NaviProfileCarouselViewModel;
import com.p2082ss.android.ugc.p4317j.C84122a;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.a */
public final class DialogC30985a extends DialogC69695i implements AbstractC69358o, C84165a.AbstractC84167b {

    /* renamed from: l */
    public static final C30986a f74268l = new C30986a((byte) 0);

    /* renamed from: A */
    private final String f74269A;

    /* renamed from: B */
    private final IProfileBadgeService.AbstractC31281c f74270B;

    /* renamed from: a */
    public SmartImageView f74271a;

    /* renamed from: b */
    public TextView f74272b;

    /* renamed from: c */
    public TuxButton f74273c;

    /* renamed from: d */
    public final IProfileBadgeService f74274d;

    /* renamed from: e */
    public final String f74275e;

    /* renamed from: f */
    public final User f74276f;

    /* renamed from: j */
    public final Activity f74277j;

    /* renamed from: k */
    public final AbstractC63510e f74278k;

    /* renamed from: o */
    private AbstractC89171a<C89391z> f74279o;

    /* renamed from: p */
    private ImageView f74280p;

    /* renamed from: q */
    private SmartImageView f74281q;

    /* renamed from: r */
    private boolean f74282r;

    /* renamed from: s */
    private TextView f74283s;

    /* renamed from: t */
    private LinearLayout f74284t;

    /* renamed from: u */
    private Switch f74285u;

    /* renamed from: v */
    private TuxButton f74286v;

    /* renamed from: w */
    private View f74287w;

    /* renamed from: x */
    private View f74288x;

    /* renamed from: y */
    private HorizontalCarousel f74289y;

    /* renamed from: z */
    private final User f74290z;

    static {
        Covode.recordClassIndex(37613);
    }

    /* renamed from: com.ss.android.ugc.a$a */
    public static final class C30986a {
        static {
            Covode.recordClassIndex(37614);
        }

        private C30986a() {
        }

        public /* synthetic */ C30986a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.AbstractC69358o
    /* renamed from: b */
    public final void mo9590b() {
        if (!this.f74277j.isFinishing()) {
            show();
        }
    }

    /* renamed from: c */
    public final boolean mo56071c() {
        UrlModel avatarVideoUri = this.f74276f.getAvatarVideoUri();
        if (avatarVideoUri == null || avatarVideoUri.getUrlList() == null || avatarVideoUri.getUrlList().size() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.navi.C84165a.AbstractC84167b
    /* renamed from: d */
    public final void mo56072d() {
        this.f74282r = false;
        dismiss();
        boolean a = C39223a.m79589c().mo68606a(4);
        m63703a(!a);
        if (a) {
            return;
        }
        if (mo56071c()) {
            this.f74278k.mo102148b();
        } else {
            this.f74278k.mo102147a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.DialogC69695i
    public final void dismiss() {
        int i;
        super.dismiss();
        this.f74274d.mo57240b(this.f74270B);
        AbstractC89171a<C89391z> aVar = this.f74279o;
        if (aVar != null) {
            aVar.invoke();
        }
        if (this.f74282r) {
            if (this.f74289y != null) {
                i = 1;
            } else {
                i = 0;
            }
            C39162r.m79460a("cancel_profile_photo", new C33744d().mo59983a("enter_from", "personal_homepage").mo59983a("enter_method", "click_head").mo59983a("exit_method", "click_cancel").mo59980a("is_avatar", i).f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.a$j */
    public static final class C30997j implements IProfileBadgeService.AbstractC31281c {

        /* renamed from: a */
        final /* synthetic */ DialogC30985a f74315a;

        static {
            Covode.recordClassIndex(37625);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30997j(DialogC30985a aVar) {
            this.f74315a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IProfileBadgeService.AbstractC31281c
        /* renamed from: a */
        public final void mo56081a(ProfileBadgeStruct profileBadgeStruct) {
            this.f74315a.mo56068a(profileBadgeStruct);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.AbstractC69358o
    /* renamed from: a */
    public final void mo56069a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f74279o = aVar;
    }

    /* renamed from: com.ss.android.ugc.a$h */
    static final class View$OnClickListenerC30995h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC30985a f74312a;

        static {
            Covode.recordClassIndex(37623);
        }

        View$OnClickListenerC30995h(DialogC30985a aVar) {
            this.f74312a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f74312a.f74278k.mo102149c();
        }
    }

    /* renamed from: com.ss.android.ugc.a$g */
    static final class View$OnClickListenerC30994g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC30985a f74310a;

        /* renamed from: b */
        final /* synthetic */ boolean f74311b;

        static {
            Covode.recordClassIndex(37622);
        }

        View$OnClickListenerC30994g(DialogC30985a aVar, boolean z) {
            this.f74310a = aVar;
            this.f74311b = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f74311b) {
                if (this.f74310a.mo56071c()) {
                    this.f74310a.f74278k.mo102148b();
                } else {
                    this.f74310a.f74278k.mo102147a();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.navi.C84165a.AbstractC84167b
    /* renamed from: a */
    public final void mo56065a(View view) {
        C89219l.m154721d(view, "");
        this.f74282r = false;
        dismiss();
        ProfileNaviServiceImpl.m65406a().mo57245a(this.f74277j, view, "profile_photo_page");
    }

    /* renamed from: com.ss.android.ugc.a$e */
    static final class View$OnClickListenerC30991e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC30985a f74299a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1392ac f74300b;

        /* renamed from: c */
        final /* synthetic */ HorizontalCarousel f74301c;

        /* renamed from: d */
        final /* synthetic */ NaviProfileCarouselViewModel f74302d;

        static {
            Covode.recordClassIndex(37619);
        }

        View$OnClickListenerC30991e(DialogC30985a aVar, AbstractC1392ac acVar, HorizontalCarousel horizontalCarousel, NaviProfileCarouselViewModel naviProfileCarouselViewModel) {
            this.f74299a = aVar;
            this.f74300b = acVar;
            this.f74301c = horizontalCarousel;
            this.f74302d = naviProfileCarouselViewModel;
        }

        /* renamed from: com.ss.android.ugc.a$e$a */
        static final class C30992a extends AbstractC89220m implements AbstractC89172b<File, C89391z> {

            /* renamed from: a */
            final /* synthetic */ String f74303a;

            /* renamed from: b */
            final /* synthetic */ int f74304b;

            /* renamed from: c */
            final /* synthetic */ View$OnClickListenerC30991e f74305c;

            /* renamed from: d */
            final /* synthetic */ View f74306d;

            static {
                Covode.recordClassIndex(37620);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C30992a(String str, int i, View$OnClickListenerC30991e eVar, View view) {
                super(1);
                this.f74303a = str;
                this.f74304b = i;
                this.f74305c = eVar;
                this.f74306d = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(File file) {
                File file2 = file;
                C89219l.m154721d(file2, "");
                try {
                    ((MusAvatarWithBorderView) this.f74305c.f74299a.f74277j.findViewById(R.id.be7)).setImageURI(Uri.fromFile(file2));
                    this.f74305c.f74299a.dismiss();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.f74305c.f74299a.dismiss();
                return C89391z.f203057a;
            }
        }

        public final void onClick(View view) {
            String a;
            MethodCollector.m26663i(6459);
            ClickAgent.onClick(view);
            View a2 = this.f74300b.mo4855a(this.f74301c.getLayoutManager());
            if (a2 != null) {
                int d = HorizontalCarousel.m4277d(a2);
                if (d == 0) {
                    this.f74299a.mo56065a(a2);
                    MethodCollector.m26664o(6459);
                    return;
                }
                LinkedList<AbstractC34936bt> value = this.f74302d.f187830a.getValue();
                if (value != null) {
                    int i = d - 2;
                    if (value.size() <= i || (a = value.get(i).mo61818a()) == null) {
                        MethodCollector.m26664o(6459);
                        return;
                    }
                    C39162r.m79460a("set_avatar", new C33744d().mo59983a("enter_from", "profile_photo_page").mo59983a("enter_method", "edit_head").mo59983a("avatar_id", a).f79943a);
                    ImageView imageView = (ImageView) a2.findViewById(R.id.cr5);
                    if (imageView != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(imageView.getWidth(), imageView.getHeight(), Bitmap.Config.ARGB_8888);
                        C89219l.m154716b(createBitmap, "");
                        imageView.draw(new Canvas(createBitmap));
                        ProfileNaviServiceImpl.m65406a().mo57247a(this.f74299a.f74277j, a, createBitmap, new C30992a(a, d, this, a2));
                        MethodCollector.m26664o(6459);
                        return;
                    }
                    MethodCollector.m26664o(6459);
                    return;
                }
            }
            MethodCollector.m26664o(6459);
        }
    }

    /* renamed from: com.ss.android.ugc.a$c */
    static final class View$OnClickListenerC30988c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC30985a f74293a;

        /* renamed from: b */
        final /* synthetic */ ProfileBadgeStruct f74294b;

        static {
            Covode.recordClassIndex(37616);
        }

        View$OnClickListenerC30988c(DialogC30985a aVar, ProfileBadgeStruct profileBadgeStruct) {
            this.f74293a = aVar;
            this.f74294b = profileBadgeStruct;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("profile_badge_obtain", new C33744d().mo59983a("enter_from", this.f74293a.f74275e).mo59981a("badge_id", this.f74294b.getId()).f79943a);
            SmartRouter.buildRoute(this.f74293a.getContext(), C68030bp.m120331a().f152382d).open();
            this.f74293a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.a$n */
    static final class View$OnClickListenerC31002n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC30985a f74322a;

        /* renamed from: b */
        final /* synthetic */ ProfileBadgeStruct f74323b;

        static {
            Covode.recordClassIndex(37630);
        }

        View$OnClickListenerC31002n(DialogC30985a aVar, ProfileBadgeStruct profileBadgeStruct) {
            this.f74322a = aVar;
            this.f74323b = profileBadgeStruct;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("profile_badge_obtain", new C33744d().mo59983a("enter_from", this.f74322a.f74275e).mo59981a("badge_id", this.f74323b.getId()).f79943a);
            SmartRouter.buildRoute(this.f74322a.getContext(), C68064cm.m120370a()).open();
            this.f74322a.dismiss();
        }
    }

    /* renamed from: a */
    private final void m63703a(boolean z) {
        ImageView imageView = this.f74280p;
        if (imageView != null) {
            C22999a a = C23005c.m43393a(new C30998k(z));
            Context context = getContext();
            C89219l.m154716b(context, "");
            C23001b a2 = a.mo37368a(context);
            C23008e a3 = C23009f.m43397a(new C30999l(z));
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            imageView.setImageDrawable(C23163i.m43657a(a2, a3.mo37389a(context2)));
        }
    }

    /* renamed from: com.ss.android.ugc.a$b */
    static final class View$OnClickListenerC30987b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC30985a f74291a;

        /* renamed from: b */
        final /* synthetic */ ProfileBadgeStruct f74292b;

        static {
            Covode.recordClassIndex(37615);
        }

        View$OnClickListenerC30987b(DialogC30985a aVar, ProfileBadgeStruct profileBadgeStruct) {
            this.f74291a = aVar;
            this.f74292b = profileBadgeStruct;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("profile_badge_obtain", new C33744d().mo59983a("enter_from", this.f74291a.f74275e).mo59981a("badge_id", this.f74292b.getId()).f79943a);
            C29844g gVar = new C29844g(C68194p.m120446a());
            gVar.mo52130a("lang", LocalServiceImpl.m108272a().mo96421a(this.f74291a.getContext()));
            gVar.mo52130a("locale", C53438a.m98623b());
            gVar.mo52128a("aid", C17867d.f42590n);
            gVar.mo52130a("enter_from", this.f74291a.f74275e);
            SmartRouter.buildRoute(this.f74291a.getContext(), "aweme://webview").withParam("url", gVar.mo52126a()).withParam("hide_nav_bar", true).open();
            this.f74291a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.a$i */
    static final class View$OnClickListenerC30996i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC30985a f74313a;

        /* renamed from: b */
        final /* synthetic */ ProfileBadgeStruct f74314b;

        static {
            Covode.recordClassIndex(37624);
        }

        View$OnClickListenerC30996i(DialogC30985a aVar, ProfileBadgeStruct profileBadgeStruct) {
            this.f74313a = aVar;
            this.f74314b = profileBadgeStruct;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("profile_badge_change", new C33744d().mo59983a("enter_from", this.f74313a.f74275e).mo59981a("badge_id", this.f74314b.getId()).f79943a);
            C34437f fVar = new C34437f(this.f74313a.f74276f);
            Activity activity = this.f74313a.f74277j;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            fVar.show(((ActivityC0945e) activity).getSupportFragmentManager(), "EditProfileBadgeDialog");
            this.f74313a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.a$k */
    public static final class C30998k extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ boolean f74316a;

        static {
            Covode.recordClassIndex(37626);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30998k(boolean z) {
            super(1);
            this.f74316a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            int i;
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_pen;
            if (this.f74316a) {
                i = R.attr.bc;
            } else {
                i = R.attr.bd;
            }
            aVar2.f54435e = Integer.valueOf(i);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.a$d */
    static final class C30989d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DialogC30985a f74295a;

        /* renamed from: b */
        final /* synthetic */ HorizontalCarousel f74296b;

        /* renamed from: c */
        final /* synthetic */ NaviProfileCarouselViewModel f74297c;

        static {
            Covode.recordClassIndex(37617);
        }

        C30989d(DialogC30985a aVar, HorizontalCarousel horizontalCarousel, NaviProfileCarouselViewModel naviProfileCarouselViewModel) {
            this.f74295a = aVar;
            this.f74296b = horizontalCarousel;
            this.f74297c = naviProfileCarouselViewModel;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            LinkedList linkedList = (LinkedList) obj;
            if (!C84122a.m144659a()) {
                C309901 r8 = new C84122a.AbstractC84123a(this) {
                    /* class com.p2082ss.android.ugc.DialogC30985a.C30989d.C309901 */

                    /* renamed from: a */
                    final /* synthetic */ C30989d f74298a;

                    static {
                        Covode.recordClassIndex(37618);
                    }

                    @Override // com.p2082ss.android.ugc.p4317j.C84122a.AbstractC84123a
                    /* renamed from: a */
                    public final void mo56076a() {
                        RecyclerView.AbstractC1350a adapter;
                        RecyclerView.AbstractC1350a adapter2 = this.f74298a.f74296b.getAdapter();
                        if (adapter2 != null) {
                            C89219l.m154716b(adapter2, "");
                            if (adapter2.getItemCount() > 0 && (adapter = this.f74298a.f74296b.getAdapter()) != null) {
                                adapter.notifyDataSetChanged();
                            }
                        }
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f74298a = r1;
                    }
                };
                C89219l.m154721d(r8, "");
                C14894c b = C80333dc.m139275b();
                HashMap hashMap = new HashMap();
                String str = C84122a.f187729b;
                C89219l.m154716b(str, "");
                List<CheckRequestBodyModel.TargetChannel> asList = Arrays.asList(new CheckRequestBodyModel.TargetChannel(C84122a.f187728a));
                C89219l.m154716b(asList, "");
                hashMap.put(str, asList);
                b.mo23999a("high_priority", hashMap, new C14936d(new C84122a.C84124b(r8)));
            }
            if (this.f74296b.getAdapter() != null) {
                RecyclerView.AbstractC1350a adapter = this.f74296b.getAdapter();
                if (adapter == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(adapter, "");
                if (adapter.getItemCount() != 2) {
                    RecyclerView.AbstractC1350a adapter2 = this.f74296b.getAdapter();
                    if (adapter2 != null) {
                        adapter2.notifyItemRangeChanged(0, linkedList.size() + 2);
                        return;
                    }
                    return;
                }
            }
            this.f74296b.setAdapter(new C84165a(this.f74295a.f74277j, this.f74297c.f187830a.getValue(), this.f74295a.f74276f, this.f74295a));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.a$l */
    public static final class C30999l extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ boolean f74317a;

        static {
            Covode.recordClassIndex(37627);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30999l(boolean z) {
            super(1);
            this.f74317a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            int i;
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54463b = Integer.valueOf((int) R.attr.m);
            if (this.f74317a) {
                i = R.attr.ak;
            } else {
                i = R.attr.an;
            }
            eVar2.f54467f = Integer.valueOf(i);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54465d = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            eVar2.f54469h = C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            eVar2.f54468g = C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system3.getDisplayMetrics()));
            Resources system4 = Resources.getSystem();
            C89219l.m154709a((Object) system4, "");
            eVar2.f54464c = Float.valueOf(TypedValue.applyDimension(1, 50.0f, system4.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.AbstractC69358o
    /* renamed from: a */
    public final void mo56067a(UrlModel urlModel) {
        C89219l.m154721d(urlModel, "");
        C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel));
        a.f49092E = this.f74281q;
        a.mo34179a("AvatarEditableShareDialog").mo34186c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        if (r0 == null) goto L_0x0042;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56068a(com.p2082ss.android.ugc.aweme.profile.model.ProfileBadgeStruct r6) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.DialogC30985a.mo56068a(com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.share.AbstractC69358o
    /* renamed from: a */
    public final void mo56070a(String str) {
        C89219l.m154721d(str, "");
        try {
            Uri fromFile = Uri.fromFile(new File(str));
            C89219l.m154716b(fromFile, "");
            if (mo56071c()) {
                C20766v a = C20761r.m39057a(fromFile);
                a.f49098K = true;
                a.f49106c = true;
                a.f49092E = this.f74281q;
                a.mo34179a("AvatarEditableShareDialog").mo34186c();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.appcompat.app.DialogC0240h, com.p2082ss.android.ugc.aweme.sharer.p3782ui.DialogC69695i, com.google.android.material.bottomsheet.DialogC26609a
    public final void onCreate(Bundle bundle) {
        ProfileBadgeStruct profileBadge;
        TuxButton tuxButton;
        String str;
        TuxButton tuxButton2;
        super.onCreate(bundle);
        this.f74274d.mo57238a(this.f74270B);
        this.f74271a = (SmartImageView) findViewById(R.id.d9u);
        this.f74272b = (TextView) findViewById(R.id.d_1);
        this.f74283s = (TextView) findViewById(R.id.d9y);
        this.f74284t = (LinearLayout) findViewById(R.id.d_0);
        this.f74285u = (Switch) findViewById(R.id.d9z);
        this.f74286v = (TuxButton) findViewById(R.id.d9x);
        this.f74287w = findViewById(R.id.d9v);
        this.f74288x = findViewById(R.id.d9w);
        this.f74289y = (HorizontalCarousel) findViewById(R.id.cq8);
        this.f74273c = (TuxButton) findViewById(R.id.cr7);
        this.f74280p = (ImageView) findViewById(R.id.d9k);
        this.f74281q = (SmartImageView) findViewById(R.id.d9j);
        HorizontalCarousel horizontalCarousel = this.f74289y;
        if (horizontalCarousel != null && (this.f74277j instanceof AbstractC1183ag)) {
            C39162r.m79460a("show_avatar_carousel", new C33744d().mo59983a("enter_from", "profile_photo_page").f79943a);
            AbstractC1174ac a = new C1175ad((AbstractC1183ag) this.f74277j, new C1175ad.C1179d()).mo3983a(NaviProfileCarouselViewModel.class);
            C89219l.m154716b(a, "");
            NaviProfileCarouselViewModel naviProfileCarouselViewModel = (NaviProfileCarouselViewModel) a;
            naviProfileCarouselViewModel.f187830a.observeForever(new C30989d(this, horizontalCarousel, naviProfileCarouselViewModel));
            C1482s sVar = new C1482s();
            sVar.mo4857a(horizontalCarousel);
            TuxButton tuxButton3 = this.f74273c;
            if (tuxButton3 != null) {
                tuxButton3.setOnClickListener(new View$OnClickListenerC30991e(this, sVar, horizontalCarousel, naviProfileCarouselViewModel));
            }
            horizontalCarousel.mo4405a(new C30993f(this, sVar, naviProfileCarouselViewModel));
            horizontalCarousel.setAdapter(new C84165a(this.f74277j, naviProfileCarouselViewModel.f187830a.getValue(), this.f74276f, this));
            User user = this.f74276f;
            C89219l.m154721d(user, "");
            LinkedList<AbstractC34936bt> value = naviProfileCarouselViewModel.f187830a.getValue();
            if (value != null) {
                value.clear();
            }
            naviProfileCarouselViewModel.f187831b = true;
            naviProfileCarouselViewModel.f187832c = 0;
            naviProfileCarouselViewModel.mo128990a(user);
        }
        if (C31575b.m65865g().isMe(this.f74276f.getUid())) {
            ImageView imageView = this.f74280p;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else {
            ImageView imageView2 = this.f74280p;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        if (UserSharePackage.C69241a.m122368a(this.f74276f) && (profileBadge = this.f74276f.getProfileBadge()) != null && !C80580in.m139687c()) {
            C89219l.m154716b(profileBadge, "");
            mo56068a(profileBadge);
            User user2 = this.f74290z;
            C89219l.m154716b(user2, "");
            if (C89219l.m154714a((Object) user2.getUid(), (Object) this.f74276f.getUid())) {
                TuxButton tuxButton4 = this.f74286v;
                if (tuxButton4 != null) {
                    tuxButton4.setButtonVariant(1);
                }
                if (C68030bp.m120331a().f152381c == null || !C89219l.m154714a((Object) C68030bp.m120331a().f152381c, (Object) true) || this.f74276f.getProfileBadge() == null) {
                    TextView textView = this.f74283s;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    LinearLayout linearLayout = this.f74284t;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    TuxButton tuxButton5 = this.f74286v;
                    if (tuxButton5 != null) {
                        tuxButton5.setVisibility(8);
                    }
                    View view = this.f74287w;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    View view2 = this.f74288x;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    Switch r3 = this.f74285u;
                    if (r3 != null) {
                        r3.setOnCheckedChangeListener(null);
                    }
                    Switch r32 = this.f74285u;
                    if (r32 != null) {
                        r32.setChecked(profileBadge.getShouldShow());
                    }
                    Switch r0 = this.f74285u;
                    if (r0 == null || !r0.isChecked()) {
                        SmartImageView smartImageView = this.f74271a;
                        if (smartImageView != null) {
                            smartImageView.setVisibility(8);
                        }
                        TextView textView2 = this.f74272b;
                        if (textView2 != null) {
                            textView2.setVisibility(8);
                        }
                    } else {
                        SmartImageView smartImageView2 = this.f74271a;
                        if (smartImageView2 != null) {
                            smartImageView2.setVisibility(0);
                        }
                        TextView textView3 = this.f74272b;
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                        }
                    }
                    C89233z.C89234a aVar = new C89233z.C89234a();
                    aVar.element = false;
                    Switch r2 = this.f74285u;
                    if (r2 != null) {
                        r2.setOnTouchListener(new View$OnTouchListenerC31000m(this, aVar, r2));
                    }
                } else {
                    LinearLayout linearLayout2 = this.f74284t;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                    }
                    TuxButton tuxButton6 = this.f74286v;
                    if (tuxButton6 != null) {
                        tuxButton6.setVisibility(0);
                    }
                    View view3 = this.f74287w;
                    if (view3 != null) {
                        view3.setVisibility(0);
                    }
                    View view4 = this.f74288x;
                    if (view4 != null) {
                        view4.setVisibility(8);
                    }
                    if (C80538hl.m139614a(C68030bp.m120331a().f152380b) && (tuxButton2 = this.f74286v) != null) {
                        tuxButton2.setText(C68030bp.m120331a().f152380b);
                    }
                    TuxButton tuxButton7 = this.f74286v;
                    if (tuxButton7 != null) {
                        tuxButton7.setOnClickListener(new View$OnClickListenerC30996i(this, profileBadge));
                    }
                }
            } else {
                TuxButton tuxButton8 = this.f74286v;
                if (tuxButton8 != null) {
                    tuxButton8.setButtonVariant(0);
                }
                if (this.f74276f.getProfileBadge() != null) {
                    User user3 = this.f74290z;
                    C89219l.m154716b(user3, "");
                    if (user3.getProfileBadge() != null) {
                        TextView textView4 = this.f74283s;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                        }
                        LinearLayout linearLayout3 = this.f74284t;
                        if (linearLayout3 != null) {
                            linearLayout3.setVisibility(8);
                        }
                        TuxButton tuxButton9 = this.f74286v;
                        if (tuxButton9 != null) {
                            tuxButton9.setVisibility(8);
                        }
                        View view5 = this.f74287w;
                        if (view5 != null) {
                            view5.setVisibility(0);
                        }
                        View view6 = this.f74288x;
                        if (view6 != null) {
                            view6.setVisibility(0);
                        }
                    } else if (C80538hl.m139614a(C68030bp.m120331a().f152382d)) {
                        TextView textView5 = this.f74283s;
                        if (textView5 != null) {
                            textView5.setVisibility(0);
                        }
                        LinearLayout linearLayout4 = this.f74284t;
                        if (linearLayout4 != null) {
                            linearLayout4.setVisibility(8);
                        }
                        TuxButton tuxButton10 = this.f74286v;
                        if (tuxButton10 != null) {
                            tuxButton10.setVisibility(0);
                        }
                        View view7 = this.f74287w;
                        if (view7 != null) {
                            view7.setVisibility(8);
                        }
                        View view8 = this.f74288x;
                        if (view8 != null) {
                            view8.setVisibility(8);
                        }
                        String str2 = C68030bp.m120331a().f152379a;
                        if (C80538hl.m139614a(str2) && (tuxButton = this.f74286v) != null) {
                            tuxButton.setText(str2);
                        }
                        TuxButton tuxButton11 = this.f74286v;
                        if (tuxButton11 != null) {
                            tuxButton11.setOnClickListener(new View$OnClickListenerC30988c(this, profileBadge));
                        }
                    } else if (C80538hl.m139614a(C68064cm.m120370a())) {
                        TextView textView6 = this.f74283s;
                        if (textView6 != null) {
                            textView6.setVisibility(0);
                        }
                        LinearLayout linearLayout5 = this.f74284t;
                        if (linearLayout5 != null) {
                            linearLayout5.setVisibility(8);
                        }
                        TuxButton tuxButton12 = this.f74286v;
                        if (tuxButton12 != null) {
                            tuxButton12.setVisibility(0);
                        }
                        View view9 = this.f74287w;
                        if (view9 != null) {
                            view9.setVisibility(8);
                        }
                        View view10 = this.f74288x;
                        if (view10 != null) {
                            view10.setVisibility(8);
                        }
                        String a2 = C68063cl.m120369a();
                        if (a2.length() > 0) {
                            TuxButton tuxButton13 = this.f74286v;
                            if (tuxButton13 != null) {
                                tuxButton13.setText(a2);
                            }
                        } else {
                            TuxButton tuxButton14 = this.f74286v;
                            if (tuxButton14 != null) {
                                tuxButton14.setText(getContext().getString(R.string.gh2));
                            }
                        }
                        TuxButton tuxButton15 = this.f74286v;
                        if (tuxButton15 != null) {
                            tuxButton15.setOnClickListener(new View$OnClickListenerC31002n(this, profileBadge));
                        }
                    } else if (C68194p.m120446a().length() > 0) {
                        TextView textView7 = this.f74283s;
                        if (textView7 != null) {
                            textView7.setVisibility(0);
                        }
                        LinearLayout linearLayout6 = this.f74284t;
                        if (linearLayout6 != null) {
                            linearLayout6.setVisibility(8);
                        }
                        TuxButton tuxButton16 = this.f74286v;
                        if (tuxButton16 != null) {
                            tuxButton16.setVisibility(0);
                        }
                        View view11 = this.f74287w;
                        if (view11 != null) {
                            view11.setVisibility(8);
                        }
                        View view12 = this.f74288x;
                        if (view12 != null) {
                            view12.setVisibility(8);
                        }
                        TuxButton tuxButton17 = this.f74286v;
                        if (tuxButton17 != null) {
                            tuxButton17.setOnClickListener(new View$OnClickListenerC30987b(this, profileBadge));
                        }
                    } else {
                        TextView textView8 = this.f74283s;
                        if (textView8 != null) {
                            textView8.setVisibility(0);
                        }
                        LinearLayout linearLayout7 = this.f74284t;
                        if (linearLayout7 != null) {
                            linearLayout7.setVisibility(8);
                        }
                        TuxButton tuxButton18 = this.f74286v;
                        if (tuxButton18 != null) {
                            tuxButton18.setVisibility(8);
                        }
                        View view13 = this.f74287w;
                        if (view13 != null) {
                            view13.setVisibility(0);
                        }
                        View view14 = this.f74288x;
                        if (view14 != null) {
                            view14.setVisibility(0);
                        }
                    }
                } else {
                    TextView textView9 = this.f74283s;
                    if (textView9 != null) {
                        textView9.setVisibility(8);
                    }
                    LinearLayout linearLayout8 = this.f74284t;
                    if (linearLayout8 != null) {
                        linearLayout8.setVisibility(8);
                    }
                    TuxButton tuxButton19 = this.f74286v;
                    if (tuxButton19 != null) {
                        tuxButton19.setVisibility(8);
                    }
                    View view15 = this.f74287w;
                    if (view15 != null) {
                        view15.setVisibility(0);
                    }
                    View view16 = this.f74288x;
                    if (view16 != null) {
                        view16.setVisibility(0);
                    }
                }
            }
            C33744d a3 = new C33744d().mo59983a("enter_from", this.f74275e).mo59981a("badge_id", profileBadge.getId());
            User user4 = this.f74290z;
            C89219l.m154716b(user4, "");
            ProfileBadgeStruct profileBadge2 = user4.getProfileBadge();
            if (profileBadge2 == null || !profileBadge2.getShouldShow()) {
                str = "off";
            } else {
                str = "on";
            }
            C39162r.m79460a("profile_badge_setting", a3.mo59983a("status", str).f79943a);
        }
        boolean a4 = C39223a.m79589c().mo68606a(4);
        m63703a(!a4);
        ImageView imageView3 = this.f74280p;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View$OnClickListenerC30994g(this, a4));
        }
        SmartImageView smartImageView3 = this.f74281q;
        if (smartImageView3 != null) {
            smartImageView3.setOnClickListener(new View$OnClickListenerC30995h(this));
        }
        if (this.f74281q == null) {
            return;
        }
        if (mo56071c()) {
            C20766v a5 = C20761r.m39060a(C34735v.m70965a(this.f74276f.getAvatarVideoUri()));
            a5.f49098K = true;
            a5.f49106c = true;
            a5.f49092E = this.f74281q;
            a5.mo34179a("AvatarEditableShareDialog").mo34186c();
            return;
        }
        C20766v a6 = C20761r.m39060a(C34735v.m70965a(C80630u.m139797a(this.f74276f)));
        a6.f49092E = this.f74281q;
        a6.mo34179a("AvatarEditableShareDialog").mo34186c();
    }

    /* renamed from: com.ss.android.ugc.a$m */
    static final class View$OnTouchListenerC31000m implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ DialogC30985a f74318a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f74319b;

        /* renamed from: c */
        final /* synthetic */ Switch f74320c;

        static {
            Covode.recordClassIndex(37628);
        }

        View$OnTouchListenerC31000m(DialogC30985a aVar, C89233z.C89234a aVar2, Switch r3) {
            this.f74318a = aVar;
            this.f74319b = aVar2;
            this.f74320c = r3;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154716b(motionEvent, "");
            if (motionEvent.getAction() != 1 || this.f74319b.element) {
                return true;
            }
            this.f74319b.element = true;
            boolean z = !this.f74320c.isChecked();
            this.f74320c.setChecked(z);
            if (this.f74320c.isChecked()) {
                SmartImageView smartImageView = this.f74318a.f74271a;
                if (smartImageView != null) {
                    smartImageView.setVisibility(0);
                }
                TextView textView = this.f74318a.f74272b;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            } else {
                SmartImageView smartImageView2 = this.f74318a.f74271a;
                if (smartImageView2 != null) {
                    smartImageView2.setVisibility(8);
                }
                TextView textView2 = this.f74318a.f74272b;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            }
            this.f74318a.f74274d.mo57239a(z, new IProfileBadgeService.AbstractC31280b(this) {
                /* class com.p2082ss.android.ugc.DialogC30985a.View$OnTouchListenerC31000m.C310011 */

                /* renamed from: a */
                final /* synthetic */ View$OnTouchListenerC31000m f74321a;

                static {
                    Covode.recordClassIndex(37629);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:3:0x0036, code lost:
                    if (r0 == null) goto L_0x0038;
                 */
                @Override // com.p2082ss.android.ugc.aweme.IProfileBadgeService.AbstractC31280b
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo56083a() {
                    /*
                    // Method dump skipped, instructions count: 126
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.DialogC30985a.View$OnTouchListenerC31000m.C310011.mo56083a():void");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f74321a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.IProfileBadgeService.AbstractC31280b
                /* renamed from: a */
                public final void mo56084a(ProfileBadgeStruct profileBadgeStruct) {
                    this.f74321a.f74319b.element = false;
                    if (profileBadgeStruct == null) {
                        new C79459a(this.f74321a.f74318a.getContext()).mo123050a(R.string.g1i).mo123053a();
                    }
                }
            });
            return true;
        }
    }

    @Override // com.p2082ss.android.ugc.navi.C84165a.AbstractC84167b
    /* renamed from: a */
    public final void mo56066a(View view, String str) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(str, "");
        this.f74282r = false;
        C39162r.m79460a("edit_avatar", new C33744d().mo59983a("enter_from", "profile_photo_page").mo59983a("enter_method", "edit_head").mo59983a("avatar_id", str).f79943a);
        dismiss();
        ProfileNaviServiceImpl.m65406a().mo57246a(this.f74277j, view, str, "profile_photo_page");
    }

    /* renamed from: com.ss.android.ugc.a$f */
    public static final class C30993f extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ DialogC30985a f74307a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1392ac f74308b;

        /* renamed from: c */
        final /* synthetic */ NaviProfileCarouselViewModel f74309c;

        static {
            Covode.recordClassIndex(37621);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            boolean z;
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            View a = this.f74308b.mo4855a(recyclerView.getLayoutManager());
            if (a != null) {
                int d = RecyclerView.m4277d(a);
                TuxButton tuxButton = this.f74307a.f74273c;
                if (tuxButton != null) {
                    if (d >= 2 || d == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    tuxButton.setEnabled(z);
                }
                if (d == 0) {
                    TuxButton tuxButton2 = this.f74307a.f74273c;
                    if (tuxButton2 != null) {
                        tuxButton2.setText(recyclerView.getContext().getString(R.string.a0c));
                    }
                } else {
                    TuxButton tuxButton3 = this.f74307a.f74273c;
                    if (tuxButton3 != null) {
                        tuxButton3.setText(recyclerView.getContext().getString(R.string.a1_));
                    }
                }
                if (i == 0 && d != C84174b.f187855a) {
                    C84174b.f187855a = d;
                    C39162r.m79460a("swipe_avatar_carousel", new C33744d().mo59983a("enter_from", "profile_photo_page").mo59983a("enter_method", "edit_head").mo59980a("order", d).f79943a);
                }
            }
            if (!recyclerView.canScrollHorizontally(1)) {
                this.f74309c.mo128990a(this.f74307a.f74276f);
            }
        }

        C30993f(DialogC30985a aVar, AbstractC1392ac acVar, NaviProfileCarouselViewModel naviProfileCarouselViewModel) {
            this.f74307a = aVar;
            this.f74308b = acVar;
            this.f74309c = naviProfileCarouselViewModel;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DialogC30985a(User user, Activity activity, AbstractC63510e eVar, C69684e eVar2) {
        super(activity, R.style.wi, eVar2);
        String str;
        C89219l.m154721d(user, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(eVar2, "");
        this.f74276f = user;
        this.f74277j = activity;
        this.f74278k = eVar;
        this.f74282r = true;
        IProfileBadgeService b = ProfileBadgeServiceImpl.m67562b();
        C89219l.m154716b(b, "");
        this.f74274d = b;
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        User curUser = e.getCurUser();
        this.f74290z = curUser;
        C89219l.m154716b(curUser, "");
        if (C89219l.m154714a((Object) curUser.getUid(), (Object) user.getUid())) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        this.f74275e = str;
        this.f74269A = "ProfileWidgetShareDialog";
        this.f74270B = new C30997j(this);
    }

    public /* synthetic */ DialogC30985a(User user, Activity activity, AbstractC63510e eVar, C69684e eVar2, byte b) {
        this(user, activity, eVar, eVar2);
    }
}
