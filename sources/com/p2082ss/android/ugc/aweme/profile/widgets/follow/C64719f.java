package com.p2082ss.android.ugc.aweme.profile.widgets.follow;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.service.AbstractC12799b;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.p1197c.C17167b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.captcha.AbstractC35417a;
import com.p2082ss.android.ugc.aweme.common.C39143l;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39110a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49689q;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.p2082ss.android.ugc.aweme.notice.api.p3510b.C61546b;
import com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.p2082ss.android.ugc.aweme.notificationlive.C62513a;
import com.p2082ss.android.ugc.aweme.notificationlive.C62522i;
import com.p2082ss.android.ugc.aweme.notificationlive.C62577t;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56196c;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.api.C63435i;
import com.p2082ss.android.ugc.aweme.profile.api.C63436j;
import com.p2082ss.android.ugc.aweme.profile.api.RelationCheckApi;
import com.p2082ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64135cz;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64207ac;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64314y;
import com.p2082ss.android.ugc.aweme.profile.service.C63873h;
import com.p2082ss.android.ugc.aweme.profile.tip.FollowRequestTipView;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b;
import com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.AbstractC65121b;
import com.p2082ss.android.ugc.aweme.profile.widgets.relations.AbstractC65189d;
import com.p2082ss.android.ugc.aweme.recommend.C66623g;
import com.p2082ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.web.C81543e;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f */
public final class C64719f extends AbstractC64718e implements WeakHandler.IHandler, AbstractC64716c, AbstractC90252i, AbstractC90253j {

    /* renamed from: j */
    public C64135cz f146464j;

    /* renamed from: k */
    public TuxButton f146465k;

    /* renamed from: l */
    String f146466l;

    /* renamed from: m */
    private FollowRequestTipView f146467m;

    /* renamed from: n */
    private final C12786i f146468n = new C12786i(bW_(), new C64739i(this, null));

    /* renamed from: o */
    private final C12814b f146469o;

    /* renamed from: p */
    private View f146470p;

    /* renamed from: q */
    private String f146471q;

    /* renamed from: r */
    private boolean f146472r;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$b */
    public static final class C64732b extends AbstractC89220m implements AbstractC89172b<C64766o, C64766o> {
        public static final C64732b INSTANCE = new C64732b();

        static {
            Covode.recordClassIndex(76199);
        }

        public C64732b() {
            super(1);
        }

        public final C64766o invoke(C64766o oVar) {
            C89219l.m154719c(oVar, "");
            return oVar;
        }
    }

    static {
        Covode.recordClassIndex(76186);
    }

    /* renamed from: A */
    private final C64871b m116579A() {
        return (C64871b) this.f146468n.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(64, new RunnableC90250g(C64719f.class, "onEvent", C62522i.class, ThreadMode.POSTING, 0, false));
        hashMap.put(36, new RunnableC90250g(C64719f.class, "onFollowStatusUpdate", FollowStatusEvent.class, ThreadMode.MAIN, 0, false));
        hashMap.put(22, new RunnableC90250g(C64719f.class, "onMobRequestIdEvent", C49689q.class, ThreadMode.POSTING, 0, false));
        hashMap.put(63, new RunnableC90250g(C64719f.class, "onRefreshMessageButton", C56196c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: v */
    public final UserProfileFollowVM mo104190v() {
        return (UserProfileFollowVM) this.f146469o.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$d */
    public static final class C64734d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146489a;

        static {
            Covode.recordClassIndex(76201);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64734d(AbstractC12748a aVar) {
            super(0);
            this.f146489a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f146489a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$c */
    public static final class C64733c extends AbstractC89220m implements AbstractC89171a<C12874b<C64766o>> {
        public static final C64733c INSTANCE = new C64733c();

        static {
            Covode.recordClassIndex(76200);
        }

        public C64733c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C64766o> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$e */
    public static final class C64735e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146490a;

        static {
            Covode.recordClassIndex(76202);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64735e(AbstractC12748a aVar) {
            super(0);
            this.f146490a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f146490a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$f */
    public static final class C64736f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146491a;

        static {
            Covode.recordClassIndex(76203);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64736f(AbstractC12748a aVar) {
            super(0);
            this.f146491a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f146491a.mo20598q();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.AbstractC12799b
    /* renamed from: e */
    public final /* synthetic */ C64717d mo20658e() {
        return new C64717d();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$g */
    public static final class C64737g extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146492a;

        static {
            Covode.recordClassIndex(76204);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64737g(AbstractC12748a aVar) {
            super(0);
            this.f146492a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f146492a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$h */
    public static final class C64738h extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146493a;

        static {
            Covode.recordClassIndex(76205);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64738h(AbstractC12748a aVar) {
            super(0);
            this.f146493a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f146493a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$o */
    static final class C64745o implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ C64719f f146503a;

        static {
            Covode.recordClassIndex(76212);
        }

        C64745o(C64719f fVar) {
            this.f146503a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            this.f146503a.mo104190v().mo104172a(EnumC64712a.START);
        }
    }

    /* renamed from: B */
    private final String m116580B() {
        C64715b bVar;
        C64871b A = m116579A();
        if (A == null || (bVar = A.f146668f) == null) {
            return null;
        }
        return bVar.f146458e;
    }

    /* renamed from: C */
    private static boolean m116581C() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.p2082ss.android.ugc.aweme.profile.widgets.follow.AbstractC64718e, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: p */
    public final void mo20527p() {
        super.mo20527p();
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: y */
    public final String mo104193y() {
        C64871b A = m116579A();
        if (A != null) {
            return A.f146665c;
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$a */
    public static final class C64720a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f146473a;

        static {
            Covode.recordClassIndex(76187);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64720a(AbstractC89277c cVar) {
            super(0);
            this.f146473a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f146473a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$i */
    public static final class C64739i extends AbstractC89220m implements AbstractC89171a<C64871b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146494a;

        /* renamed from: b */
        final /* synthetic */ String f146495b;

        static {
            Covode.recordClassIndex(76206);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64739i(AbstractC12748a aVar, String str) {
            super(0);
            this.f146494a = aVar;
            this.f146495b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.b, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f146494a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.b> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b.class
                java.lang.String r0 = r3.f146495b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.follow.C64719f.C64739i.invoke():java.lang.Object");
        }
    }

    /* renamed from: w */
    public final User mo104191w() {
        C64615i iVar = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
        if (iVar != null) {
            return iVar.f146329a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final Aweme mo104192x() {
        C64207ac acVar = (C64207ac) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64206ab.class));
        if (acVar != null) {
            return acVar.f145632g;
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$aj */
    static final class C64730aj extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ FollowRequestTipView f146483a;

        /* renamed from: b */
        final /* synthetic */ C64719f f146484b;

        /* renamed from: c */
        final /* synthetic */ User f146485c;

        static {
            Covode.recordClassIndex(76197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64730aj(FollowRequestTipView followRequestTipView, C64719f fVar, User user) {
            super(0);
            this.f146483a = followRequestTipView;
            this.f146484b = fVar;
            this.f146485c = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str;
            INoticeService f = NoticeServiceImpl.m112566f();
            WeakHandler weakHandler = new WeakHandler(this.f146484b);
            String uid = this.f146485c.getUid();
            C89219l.m154716b(uid, "");
            f.mo99376a(weakHandler, uid);
            this.f146483a.mo103463b();
            String y = this.f146484b.mo104193y();
            if (y == null) {
                y = "";
            }
            String uid2 = this.f146485c.getUid();
            C89219l.m154716b(uid2, "");
            C64314y.m116181a(y, uid2, 1);
            String uid3 = this.f146485c.getUid();
            C89219l.m154716b(uid3, "");
            if (this.f146485c.getFollowStatus() == 1) {
                str = "mutual";
            } else {
                str = "single";
            }
            C89219l.m154721d(uid3, "");
            C89219l.m154721d(str, "");
            C39162r.m79460a("follow_approve", new C33744d().mo59983a("to_user_id", uid3).mo59983a("enter_from", "others_homepage").mo59983a("follow_type", str).f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$ak */
    static final class C64731ak extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ FollowRequestTipView f146486a;

        /* renamed from: b */
        final /* synthetic */ C64719f f146487b;

        /* renamed from: c */
        final /* synthetic */ User f146488c;

        static {
            Covode.recordClassIndex(76198);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64731ak(FollowRequestTipView followRequestTipView, C64719f fVar, User user) {
            super(0);
            this.f146486a = followRequestTipView;
            this.f146487b = fVar;
            this.f146488c = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            INoticeService f = NoticeServiceImpl.m112566f();
            WeakHandler weakHandler = new WeakHandler(this.f146487b);
            String uid = this.f146488c.getUid();
            C89219l.m154716b(uid, "");
            f.mo99380b(weakHandler, uid);
            this.f146486a.mo103463b();
            String y = this.f146487b.mo104193y();
            if (y == null) {
                y = "";
            }
            String uid2 = this.f146488c.getUid();
            C89219l.m154716b(uid2, "");
            C64314y.m116181a(y, uid2, 0);
            String uid3 = this.f146488c.getUid();
            C89219l.m154716b(uid3, "");
            C89219l.m154721d(uid3, "");
            C39162r.m79460a("follow_refuse", new C33744d().mo59983a("to_user_id", uid3).mo59983a("enter_from", "others_homepage").f79943a);
            return C89391z.f203057a;
        }
    }

    public C64719f() {
        AbstractC89277c a = C89204ab.m154669a(UserProfileFollowVM.class);
        this.f146469o = new C12814b(a, new C64720a(a), C64733c.INSTANCE, new C64734d(this), new C64735e(this), new C64736f(this), C64732b.INSTANCE, new C64737g(this), new C64738h(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.follow.AbstractC64716c
    /* renamed from: a */
    public final void mo104176a() {
        User w;
        mo104190v();
        C39162r.m79460a("click_remove_fans", new C33744d().mo59983a("enter_from", "others_homepage").f79943a);
        C17197a.C17200a a = new C17197a.C17200a(az_()).mo27189a(R.string.f_o);
        Context az_ = az_();
        if (az_ == null) {
            C89219l.m154715b();
        }
        String string = az_.getResources().getString(R.string.f_n);
        C89219l.m154716b(string, "");
        String a2 = C1764a.m5928a(string, Arrays.copyOf(new Object[]{C80580in.m139684b(mo104191w())}, 1));
        C89219l.m154716b(a2, "");
        a.f41071b = a2;
        Dialog c = a.mo27195b(R.string.a8y, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.f_m, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC64729ai(this), false).mo27193a().mo27185c();
        if (c.findViewById(R.id.f2r) instanceof TextView) {
            View findViewById = c.findViewById(R.id.f2r);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) findViewById;
            Context az_2 = az_();
            if (az_2 == null) {
                C89219l.m154715b();
            }
            textView.setTextColor(C0643b.m2378c(az_2, R.color.gr));
        }
        if (TextUtils.equals(mo104193y(), "follow_request_page") && this.f146472r) {
            FollowRequestTipView followRequestTipView = this.f146467m;
            if (followRequestTipView == null) {
                C89219l.m154710a("followRequestTip");
            }
            if (followRequestTipView.f144892c && (w = mo104191w()) != null && w.isBlock) {
                FollowRequestTipView followRequestTipView2 = this.f146467m;
                if (followRequestTipView2 == null) {
                    C89219l.m154710a("followRequestTip");
                }
                followRequestTipView2.mo103463b();
                User w2 = mo104191w();
                if (w2 == null) {
                    C89219l.m154715b();
                }
                String uid = w2.getUid();
                C89219l.m154716b(uid, "");
                AbstractC81915c.m141874a(new C61546b(uid, -101));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0619, code lost:
        if (r19 == false) goto L_0x01b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0436  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0538  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0542  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x055e  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x05ae  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x05df  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x05ef  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x061d  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0623  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x062b  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x062e  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0631  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0634  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0646  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010e  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104194z() {
        /*
        // Method dump skipped, instructions count: 1746
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.follow.C64719f.mo104194z():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$k */
    public static final class C64741k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C64719f f146498a;

        /* renamed from: b */
        final /* synthetic */ int f146499b;

        static {
            Covode.recordClassIndex(76208);
        }

        C64741k(C64719f fVar, int i) {
            this.f146498a = fVar;
            this.f146499b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f146498a.mo104183a(this.f146499b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$ab */
    static final class C64722ab extends AbstractC89220m implements AbstractC89172b<C64717d, C64717d> {

        /* renamed from: a */
        public static final C64722ab f146475a = new C64722ab();

        static {
            Covode.recordClassIndex(76189);
        }

        C64722ab() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64717d invoke(C64717d dVar) {
            C64717d dVar2 = dVar;
            if (dVar2 != null) {
                return new C64717d(dVar2.f146461a);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$ac */
    static final class View$OnClickListenerC64723ac implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64719f f146476a;

        static {
            Covode.recordClassIndex(76190);
        }

        View$OnClickListenerC64723ac(C64719f fVar) {
            this.f146476a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C64719f fVar = this.f146476a;
            C89219l.m154716b(view, "");
            fVar.mo104185c(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$ad */
    static final class View$OnClickListenerC64724ad implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64719f f146477a;

        static {
            Covode.recordClassIndex(76191);
        }

        View$OnClickListenerC64724ad(C64719f fVar) {
            this.f146477a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C64719f fVar = this.f146477a;
            C89219l.m154716b(view, "");
            fVar.mo104185c(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$ae */
    static final class View$OnClickListenerC64725ae implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64719f f146478a;

        static {
            Covode.recordClassIndex(76192);
        }

        View$OnClickListenerC64725ae(C64719f fVar) {
            this.f146478a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C64719f fVar = this.f146478a;
            C89219l.m154716b(view, "");
            fVar.mo104185c(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$ag */
    static final class View$OnClickListenerC64727ag implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64719f f146480a;

        static {
            Covode.recordClassIndex(76194);
        }

        View$OnClickListenerC64727ag(C64719f fVar) {
            this.f146480a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f146480a.mo104184a((String) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$u */
    static final class View$OnClickListenerC64751u implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64719f f146511a;

        static {
            Covode.recordClassIndex(76218);
        }

        View$OnClickListenerC64751u(C64719f fVar) {
            this.f146511a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C64719f fVar = this.f146511a;
            C89219l.m154716b(view, "");
            fVar.mo104185c(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$w */
    static final class C64753w extends AbstractC89220m implements AbstractC89172b<FollowStatus, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64719f f146513a;

        static {
            Covode.recordClassIndex(76220);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64753w(C64719f fVar) {
            super(1);
            this.f146513a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FollowStatus followStatus) {
            FollowStatus followStatus2 = followStatus;
            if (followStatus2 != null) {
                this.f146513a.mo104177a(followStatus2);
            }
            return C89391z.f203057a;
        }
    }

    @AbstractC90264r
    public final void onMobRequestIdEvent(C49689q qVar) {
        C89219l.m154721d(qVar, "");
        this.f146471q = qVar.f114355a;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$t */
    public static final class C64750t implements C62577t.AbstractC62578a {

        /* renamed from: a */
        final /* synthetic */ C64719f f146509a;

        /* renamed from: b */
        final /* synthetic */ FollowStatus f146510b;

        static {
            Covode.recordClassIndex(76217);
        }

        @Override // com.p2082ss.android.ugc.aweme.notificationlive.C62577t.AbstractC62578a
        /* renamed from: a */
        public final void mo100527a(User user) {
            AbstractC64616j.C64617a.m116532a((AbstractC64616j) C12801d.m23018a(this.f146509a, C89204ab.m154669a(AbstractC64616j.class)), user, null, false, 6);
        }

        C64750t(C64719f fVar, FollowStatus followStatus) {
            this.f146509a = fVar;
            this.f146510b = followStatus;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$x */
    static final class C64754x extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64719f f146514a;

        static {
            Covode.recordClassIndex(76221);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64754x(C64719f fVar) {
            super(1);
            this.f146514a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            if (th2 instanceof Exception) {
                this.f146514a.mo104179a((Exception) th2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$af */
    static final class View$OnClickListenerC64726af implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64719f f146479a;

        static {
            Covode.recordClassIndex(76193);
        }

        View$OnClickListenerC64726af(C64719f fVar) {
            this.f146479a = fVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            TuxButton tuxButton = this.f146479a.f146465k;
            if (tuxButton == null) {
                C89219l.m154710a("sendButtonView");
            }
            String obj = tuxButton.getText().toString();
            C89219l.m154716b(view, "");
            if (C89219l.m154714a((Object) obj, (Object) view.getResources().getString(R.string.d2m))) {
                str = "message";
            } else {
                str = "sayhi";
            }
            this.f146479a.mo104184a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$ah */
    static final class C64728ah extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64719f f146481a;

        static {
            Covode.recordClassIndex(76195);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64728ah(C64719f fVar) {
            super(1);
            this.f146481a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            T t;
            C12776a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                this.f146481a.mo104183a(t.getFollowStatus());
                C64135cz czVar = this.f146481a.f146464j;
                if (czVar != null) {
                    int followStatus = t.getFollowStatus();
                    int followerStatus = t.getFollowerStatus();
                    if (followStatus == 0 && followerStatus == 1) {
                        czVar.mo103740d().setText(C17867d.m33078a().getResources().getText(R.string.bxw));
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$v */
    static final class C64752v extends AbstractC89220m implements AbstractC89172b<C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64719f f146512a;

        static {
            Covode.recordClassIndex(76219);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64752v(C64719f fVar) {
            super(1);
            this.f146512a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends Boolean> aVar) {
            int i;
            C12776a<? extends Boolean> aVar2 = aVar;
            if (!(aVar2 == null || !aVar2.f31085a.booleanValue() || this.f146512a.f146464j == null)) {
                User w = this.f146512a.mo104191w();
                if (w != null) {
                    i = w.getFollowStatus();
                } else {
                    i = 0;
                }
                C64135cz.m116056a(i, this.f146512a.mo104191w(), false);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$z */
    static final class C64756z extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64719f f146516a;

        static {
            Covode.recordClassIndex(76223);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64756z(C64719f fVar) {
            super(1);
            this.f146516a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            Throwable a = C33615a.m68845a(th2);
            if (a instanceof C34485a) {
                C33615a.m68846a(this.f146516a.az_(), (C34485a) a);
            } else {
                C51423a.m95790a(a);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.follow.AbstractC64716c
    /* renamed from: a */
    public final void mo104179a(Exception exc) {
        AbstractC0952i iVar;
        C89219l.m154721d(exc, "");
        if (this.f31048h) {
            if (C63873h.f144797a.shouldDoCaptcha(exc)) {
                C63873h hVar = C63873h.f144797a;
                Fragment a = C12777b.m22999a((AbstractC1204m) this);
                if (a != null) {
                    iVar = a.getChildFragmentManager();
                } else {
                    iVar = null;
                }
                hVar.showCaptchaDialog(iVar, (C34485a) exc, new C64749s(this, exc));
                return;
            }
            Activity a2 = C34729o.m70950a(az_());
            C89219l.m154716b(a2, "");
            C39143l.m79438a(a2, exc);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onFollowStatusUpdate(FollowStatusEvent followStatusEvent) {
        String str;
        C89219l.m154721d(followStatusEvent, "");
        FollowStatus followStatus = followStatusEvent.status;
        String str2 = followStatus.userId;
        User w = mo104191w();
        if (w != null) {
            str = w.getUid();
        } else {
            str = null;
        }
        if (TextUtils.equals(str2, str)) {
            m116582a(mo104191w(), followStatus.followStatus);
            AbstractC65189d dVar = (AbstractC65189d) C12801d.m23028e(this, C89204ab.m154669a(AbstractC65189d.class));
            if (dVar != null) {
                dVar.mo104352a(followStatus);
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onRefreshMessageButton(C56196c cVar) {
        String str;
        C64135cz czVar;
        C89219l.m154721d(cVar, "");
        String str2 = cVar.f128192a;
        if (str2 != null) {
            User w = mo104191w();
            if (w != null) {
                str = w.getUid();
            } else {
                str = null;
            }
            if (C89219l.m154714a((Object) str2, (Object) str) && (czVar = this.f146464j) != null) {
                czVar.mo103739c().setText(C17867d.m33078a().getResources().getString(R.string.d2m));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$j */
    public static final class C64740j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C64719f f146496a;

        /* renamed from: b */
        final /* synthetic */ int f146497b;

        static {
            Covode.recordClassIndex(76207);
        }

        C64740j(C64719f fVar, int i) {
            this.f146496a = fVar;
            this.f146497b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            C63436j jVar = (C63436j) obj;
            C89219l.m154721d(jVar, "");
            List<C63435i> list = jVar.f144034a;
            if (list == null || list.isEmpty()) {
                this.f146496a.mo104183a(this.f146497b);
            }
            C64135cz czVar = this.f146496a.f146464j;
            if (czVar != null) {
                User w = this.f146496a.mo104191w();
                User w2 = this.f146496a.mo104191w();
                if (w2 != null) {
                    str = w2.getUid();
                } else {
                    str = null;
                }
                int i = this.f146497b;
                if (list == null) {
                    C89219l.m154715b();
                }
                czVar.mo103737a(w, str, i, list.get(0).f144033a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$y */
    static final class C64755y extends AbstractC89220m implements AbstractC89172b<BaseResponse, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64719f f146515a;

        static {
            Covode.recordClassIndex(76222);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64755y(C64719f fVar) {
            super(1);
            this.f146515a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseResponse baseResponse) {
            User w;
            if (baseResponse != null) {
                User w2 = this.f146515a.mo104191w();
                if (w2 != null) {
                    w2.setFollowerStatus(0);
                }
                User w3 = this.f146515a.mo104191w();
                if (!(w3 == null || w3.getFollowStatus() != 2 || (w = this.f146515a.mo104191w()) == null)) {
                    w.setFollowStatus(1);
                }
                AbstractC64616j.C64617a.m116532a((AbstractC64616j) C12801d.m23018a(this.f146515a, C89204ab.m154669a(AbstractC64616j.class)), this.f146515a.mo104191w(), null, false, 6);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Object obj;
        User w = mo104191w();
        if (w != null) {
            BaseResponse baseResponse = null;
            if (message != null) {
                obj = message.obj;
            } else {
                obj = null;
            }
            if (obj instanceof BaseResponse) {
                baseResponse = obj;
            }
            BaseResponse baseResponse2 = baseResponse;
            if (baseResponse2 == null) {
                return;
            }
            if (NoticeServiceImpl.m112566f().mo99381b(baseResponse2)) {
                String uid = w.getUid();
                C89219l.m154716b(uid, "");
                AbstractC81915c.m141874a(new C61546b(uid, -101));
            } else if (NoticeServiceImpl.m112566f().mo99378a(baseResponse2)) {
                String uid2 = w.getUid();
                C89219l.m154716b(uid2, "");
                AbstractC81915c.m141874a(new C61546b(uid2, -100));
                w.setFollowerStatus(1);
                if (w.getFollowStatus() == 1) {
                    w.setFollowStatus(2);
                }
                mo104183a(w.getFollowStatus());
            }
        }
    }

    @AbstractC90264r
    public final void onEvent(C62522i iVar) {
        String str;
        User user;
        CommerceUserInfo commerceUserInfo;
        AwemeRawAd awemeRawAd;
        C89219l.m154721d(iVar, "");
        String str2 = iVar.f141804a;
        Aweme x = mo104192x();
        if (x == null || (awemeRawAd = x.getAwemeRawAd()) == null) {
            str = null;
        } else {
            str = awemeRawAd.getCreativeIdStr();
        }
        if (!(!C89219l.m154714a((Object) str2, (Object) str))) {
            C64615i iVar2 = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
            if (iVar2 != null) {
                user = iVar2.f146329a;
                if (!(user == null || (commerceUserInfo = user.getCommerceUserInfo()) == null)) {
                    commerceUserInfo.setNotificationConfig(iVar.f141805b ? 1 : 0);
                }
            } else {
                user = null;
            }
            AbstractC64616j.C64617a.m116532a((AbstractC64616j) C12801d.m23018a(this, C89204ab.m154669a(AbstractC64616j.class)), user, null, false, 6);
        }
    }

    /* renamed from: c */
    public final void mo104185c(View view) {
        boolean z;
        Fragment a = C12777b.m22999a((AbstractC1204m) this);
        if (a != null) {
            z = a.isAdded();
        } else {
            z = false;
        }
        if (this.f31048h && z && mo104191w() != null && az_() != null && !C58001a.m104815a(view, 300)) {
            if (C80580in.m139687c()) {
                new C79459a(C17867d.m33078a()).mo123050a(R.string.acx).mo123053a();
                return;
            }
            az_();
            if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132253e = m116581C();
            }
            if (!C58029j.f132253e) {
                new C23144b(view).mo37640e(R.string.dcq).mo37637b();
                return;
            }
            if (!TextUtils.isEmpty(m116580B())) {
                this.f146466l = m116580B();
            }
            mo104190v().mo104172a(EnumC64712a.START);
        }
    }

    /* renamed from: a */
    public final void mo104183a(int i) {
        if (this.f31048h) {
            User w = mo104191w();
            String str = null;
            if (w == null || w.getFollowStatus() != i) {
                User w2 = mo104191w();
                if (w2 != null) {
                    w2.setFollowStatus(i);
                }
                AbstractC64616j.C64617a.m116532a((AbstractC64616j) C12801d.m23018a(this, C89204ab.m154669a(AbstractC64616j.class)), mo104191w(), null, false, 6);
            }
            C64135cz czVar = this.f146464j;
            if (czVar != null) {
                User w3 = mo104191w();
                User w4 = mo104191w();
                if (w4 != null) {
                    str = w4.getUid();
                }
                czVar.mo103737a(w3, str, i, 0);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        String str;
        C89219l.m154721d(view, "");
        view.findViewById(R.id.d7l).setOnClickListener(new View$OnClickListenerC64751u(this));
        View findViewById = view.findViewById(R.id.d7l);
        C89219l.m154716b(findViewById, "");
        this.f146470p = findViewById;
        ((TuxButton) view.findViewById(R.id.b6o)).setOnClickListener(new View$OnClickListenerC64723ac(this));
        ((TextView) view.findViewById(R.id.diy)).setOnClickListener(new View$OnClickListenerC64724ad(this));
        ((RelativeLayout) view.findViewById(R.id.b6p)).setOnClickListener(new View$OnClickListenerC64725ae(this));
        View findViewById2 = view.findViewById(R.id.dvl);
        C89219l.m154716b(findViewById2, "");
        TuxButton tuxButton = (TuxButton) findViewById2;
        this.f146465k = tuxButton;
        if (tuxButton == null) {
            C89219l.m154710a("sendButtonView");
        }
        tuxButton.setOnClickListener(new View$OnClickListenerC64726af(this));
        view.findViewById(R.id.amz).setOnClickListener(new View$OnClickListenerC64727ag(this));
        View findViewById3 = view.findViewById(R.id.b6v);
        C89219l.m154716b(findViewById3, "");
        this.f146467m = (FollowRequestTipView) findViewById3;
        this.f146464j = new C64135cz(view);
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C64761k.f146521a, new C64728ah(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64762l.f146522a, new C64752v(this));
        AssemViewModel.m23030a(mo104190v(), C64758h.f146518a, null, new C64754x(this), null, new C64753w(this), 10);
        AssemViewModel.m23030a(mo104190v(), C64759i.f146519a, null, new C64756z(this), null, new C64755y(this), 10);
        AbstractC12818f.C12819a.m23063a(this, mo104190v(), C64760j.f146520a, (C12854k) null, new C64721aa(this), 6);
        C64207ac acVar = (C64207ac) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64206ab.class));
        if (acVar != null) {
            str = acVar.f145629d;
        } else {
            str = null;
        }
        this.f146466l = str;
        C64722ab abVar = C64722ab.f146475a;
        Class<C64719f> cls = C64719f.class;
        Class<?>[] interfaces = cls.getInterfaces();
        C89219l.m154709a((Object) interfaces, "");
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls2 : interfaces) {
            if (AbstractC12799b.class.isAssignableFrom(cls2)) {
                arrayList.add(cls2);
            }
        }
        while (true) {
            ArrayList arrayList2 = arrayList;
            if (arrayList2.isEmpty()) {
                cls = cls.getSuperclass();
                if (cls == null) {
                    break;
                }
                Class<?>[] interfaces2 = cls.getInterfaces();
                C89219l.m154709a((Object) interfaces2, "");
                arrayList = new ArrayList();
                for (Class<?> cls3 : interfaces2) {
                    if (AbstractC12799b.class.isAssignableFrom(cls3)) {
                        arrayList.add(cls3);
                    }
                }
            } else {
                C12753e eVar = bD_().f30985g;
                Object f = C89070n.m154579f((List) arrayList2);
                if (f != null) {
                    eVar.mo20613a((Class) f, abVar);
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
        }
        C64135cz czVar = this.f146464j;
        if (czVar != null) {
            czVar.mo103738b().setVisibility(8);
            czVar.mo103742f().setVisibility(8);
        }
        C64135cz czVar2 = this.f146464j;
        if (czVar2 != null) {
            C62023a.m112168a(czVar2.mo103736a());
            C62023a.m112168a(czVar2.mo103739c());
            C62023a.m112168a(czVar2.mo103741e());
            C62023a.m112168a(czVar2.mo103742f());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.follow.AbstractC64716c
    /* renamed from: a */
    public final void mo104177a(FollowStatus followStatus) {
        String str;
        String str2;
        String str3;
        AwemeRawAd awemeRawAd;
        C88960c<C62513a> a;
        String str4;
        String str5;
        AwemeRawAd awemeRawAd2;
        User w;
        if (followStatus != null) {
            if ((followStatus.followStatus == 1 || followStatus.followStatus == 2) && (w = mo104191w()) != null) {
                w.setBlock(false);
            }
            Aweme x = mo104192x();
            String str6 = null;
            if (!(x == null || (awemeRawAd = x.getAwemeRawAd()) == null || awemeRawAd.getNotificationConfig() != 1 || (a = C62577t.m112999a()) == null)) {
                User w2 = mo104191w();
                View view = this.f146470p;
                if (view == null) {
                    C89219l.m154710a("followView");
                }
                Activity a2 = C34729o.m70950a(view.getContext());
                C64871b A = m116579A();
                if (A != null) {
                    str4 = A.f146665c;
                } else {
                    str4 = null;
                }
                C64207ac acVar = (C64207ac) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64206ab.class));
                if (acVar != null) {
                    str5 = acVar.f145631f;
                } else {
                    str5 = null;
                }
                C64750t tVar = new C64750t(this, followStatus);
                Aweme x2 = mo104192x();
                if (x2 != null) {
                    awemeRawAd2 = x2.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                a.onNext(new C62513a(w2, a2, "others_homepage", str4, str5, tVar, "follow_notification", awemeRawAd2));
            }
            User w3 = mo104191w();
            if (w3 == null) {
                w3 = new User();
                C64207ac acVar2 = (C64207ac) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64206ab.class));
                if (acVar2 != null) {
                    str2 = acVar2.f145626a;
                } else {
                    str2 = null;
                }
                w3.setUid(str2);
                C64207ac acVar3 = (C64207ac) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64206ab.class));
                if (acVar3 != null) {
                    str3 = acVar3.f145627b;
                } else {
                    str3 = null;
                }
                w3.setSecUid(str3);
                w3.setFollowStatus(followStatus.followStatus);
            }
            IMService.createIIMServicebyMonsterPlugin(false).updateIMUserFollowStatus(IMUser.fromUser(w3));
            m116582a(mo104191w(), followStatus.followStatus);
            if ((followStatus.followStatus == 1 || followStatus.followStatus == 4) && w3.isBlock()) {
                w3.setBlock(false);
                ((AbstractC64206ab) C12801d.m23018a(this, C89204ab.m154669a(AbstractC64206ab.class))).mo103783b();
            }
            ((AbstractC65121b) C12801d.m23023b(this, C89204ab.m154669a(AbstractC65121b.class))).mo104327a(followStatus.followStatus);
            if (TextUtils.equals(mo104193y(), "follow_request_page")) {
                User w4 = mo104191w();
                if (w4 != null) {
                    str = w4.getUid();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    User w5 = mo104191w();
                    if (w5 == null || (str6 = w5.getUid()) == null) {
                        C89219l.m154715b();
                    }
                    AbstractC81915c.m141874a(new C61546b(str6, followStatus.followStatus));
                }
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", 1);
                jSONObject.put("follow_status", followStatus.followStatus);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            AbstractC81915c.m141874a(new C81543e("userFollowStatusChange", jSONObject));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.follow.AbstractC64716c
    /* renamed from: a */
    public final void mo104178a(User user) {
        String str;
        GeneralPermission generalPermission;
        if (TextUtils.equals(mo104193y(), "follow_request_page") && !this.f146472r) {
            ActivityC0945e b = C12777b.m23004b(this);
            if (az_() != null && b != null && mo20528t() != null && this.f31048h && user != null) {
                User w = mo104191w();
                if (w != null) {
                    str = w.getUid();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str) && !b.isFinishing() && !user.isBlock && !user.isBlocked()) {
                    if ((user.getGeneralPermission() == null || ((generalPermission = user.getGeneralPermission()) != null && generalPermission.getFollowToastType() == 0)) && user.getFollowerStatus() != 1) {
                        FollowRequestTipView followRequestTipView = this.f146467m;
                        if (followRequestTipView == null) {
                            C89219l.m154710a("followRequestTip");
                        }
                        C89219l.m154721d(user, "");
                        ((TuxTextView) followRequestTipView.getView().findViewById(R.id.f6v)).setText(C80580in.m139684b(user));
                        ((TuxButton) followRequestTipView.mo103458a(R.id.we)).setOnClickListener(new FollowRequestTipView.View$OnClickListenerC63906a(followRequestTipView));
                        ((TuxButton) followRequestTipView.mo103458a(R.id.w_)).setOnClickListener(new FollowRequestTipView.View$OnClickListenerC63907b(followRequestTipView));
                        followRequestTipView.setAcceptCallback(new C64730aj(followRequestTipView, this, user));
                        followRequestTipView.setDeleteCallback(new C64731ak(followRequestTipView, this, user));
                        if (!followRequestTipView.f144892c) {
                            followRequestTipView.f144892c = true;
                            if (followRequestTipView.f144891b.isRunning()) {
                                followRequestTipView.f144891b.cancel();
                            }
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(followRequestTipView, "translationY", followRequestTipView.getTranslationY(), -C13628n.m24520b(followRequestTipView.getContext(), 16.0f));
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(followRequestTipView, "alpha", followRequestTipView.getAlpha(), 1.0f);
                            followRequestTipView.f144890a.setDuration(200L);
                            followRequestTipView.f144890a.setInterpolator(new C17167b());
                            followRequestTipView.f144890a.play(ofFloat).with(ofFloat2);
                            followRequestTipView.setVisibility(0);
                            followRequestTipView.f144890a.start();
                        }
                        String y = mo104193y();
                        if (y == null) {
                            y = "";
                        }
                        String uid = user.getUid();
                        C89219l.m154716b(uid, "");
                        C89219l.m154721d(y, "");
                        C89219l.m154721d(uid, "");
                        C39162r.m79460a("show_follow_request_pop_up", new C33744d().mo59983a("to_user_id", uid).mo59983a("enter_from", y).f79943a);
                        this.f146472r = true;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo104184a(String str) {
        String str2;
        IMUser iMUser;
        String str3;
        String str4;
        C64715b bVar;
        C66623g gVar;
        String str5;
        C64715b bVar2;
        if (mo104191w() != null) {
            UserProfileFollowVM v = mo104190v();
            Aweme x = mo104192x();
            User w = mo104191w();
            C64871b g = v.mo23342g();
            String str6 = null;
            if (!(g == null || (bVar = g.f146668f) == null || (gVar = bVar.f146459f) == null)) {
                gVar.getEnterFrom();
                C59256u uVar = new C59256u();
                uVar.f135352b = C59256u.EnumC59257a.ENTER_CHAT;
                C59256u f = uVar.mo96833a(gVar).mo96749g(x);
                C64871b g2 = v.mo23342g();
                if (g2 == null || (bVar2 = g2.f146668f) == null) {
                    str5 = null;
                } else {
                    str5 = bVar2.f146460g;
                }
                C59256u a = f.mo96838p(str5).mo96832a(w);
                String reqId = gVar.getReqId();
                if (reqId == null) {
                    reqId = "";
                }
                a.mo96841s(reqId).mo96792f();
            }
            v.mo104171a(C59256u.EnumC59257a.ENTER_CHAT, w);
            C64871b g3 = v.mo23342g();
            if (g3 != null) {
                str2 = g3.f146665c;
            } else {
                str2 = null;
            }
            if (C89219l.m154714a((Object) str2, (Object) "homepage_hot")) {
                C59256u a2 = new C59256u().mo96834a("homepage_hot");
                a2.f135350a = C59256u.EnumC59259c.ITEM;
                a2.f135352b = C59256u.EnumC59257a.ENTER_CHAT;
                C59256u a3 = a2.mo96749g(x).mo96832a(w);
                if (x == null || (str4 = x.getRequestId()) == null) {
                    str4 = "";
                }
                a3.mo96841s(str4).mo96835b();
            }
            UserProfileFollowVM v2 = mo104190v();
            Context az_ = az_();
            if (az_ == null) {
                C89219l.m154715b();
            }
            mo104192x();
            User w2 = mo104191w();
            C89219l.m154721d(az_, "");
            IMainServiceHelper createIMainServiceHelperbyMonsterPlugin = MainServiceHelperImpl.createIMainServiceHelperbyMonsterPlugin(false);
            if (createIMainServiceHelperbyMonsterPlugin != null && createIMainServiceHelperbyMonsterPlugin.shouldRedictToTipsPage() && !createIMainServiceHelperbyMonsterPlugin.isChatFunOfflineUnder16()) {
                createIMainServiceHelperbyMonsterPlugin.goToTipsPage();
            } else if (C63873h.f144797a.canIM()) {
                if (w2 != null) {
                    iMUser = IMUser.fromUser(w2);
                } else {
                    iMUser = null;
                }
                C56245a.C56246a b = C56245a.C56247b.m102214a(az_, iMUser).mo93274c("others_homepage").mo93271b("button");
                if (str != null) {
                    b.mo93276d(str);
                }
                IMService.createIIMServicebyMonsterPlugin(false).startChat(b.f128281a);
                if (w2 != null) {
                    str3 = w2.getUid();
                } else {
                    str3 = null;
                }
                C64871b g4 = v2.mo23342g();
                if (g4 != null) {
                    str6 = g4.f146665c;
                }
                C17867d.m33078a();
                C39162r.m79455a("chat", str6, str3, 0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$s */
    public static final class C64749s implements AbstractC35417a {

        /* renamed from: a */
        final /* synthetic */ C64719f f146507a;

        /* renamed from: b */
        final /* synthetic */ Exception f146508b;

        static {
            Covode.recordClassIndex(76216);
        }

        C64749s(C64719f fVar, Exception exc) {
            this.f146507a = fVar;
            this.f146508b = exc;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$l */
    static final class DialogInterface$OnClickListenerC64742l implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64719f f146500a;

        static {
            Covode.recordClassIndex(76209);
        }

        DialogInterface$OnClickListenerC64742l(C64719f fVar) {
            this.f146500a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f146500a.mo104190v();
            UserProfileFollowVM.m116560a(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$m */
    static final class DialogInterface$OnClickListenerC64743m implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64719f f146501a;

        static {
            Covode.recordClassIndex(76210);
        }

        DialogInterface$OnClickListenerC64743m(C64719f fVar) {
            this.f146501a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f146501a.mo104190v().mo104172a(EnumC64712a.BLOCK);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$n */
    static final class DialogInterface$OnClickListenerC64744n implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64719f f146502a;

        static {
            Covode.recordClassIndex(76211);
        }

        DialogInterface$OnClickListenerC64744n(C64719f fVar) {
            this.f146502a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f146502a.mo104190v().mo104172a(EnumC64712a.DOUBLE_CANCEL);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$p */
    static final class DialogInterface$OnClickListenerC64746p implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64719f f146504a;

        static {
            Covode.recordClassIndex(76213);
        }

        DialogInterface$OnClickListenerC64746p(C64719f fVar) {
            this.f146504a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            if (i == 0) {
                this.f146504a.mo104194z();
            }
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$q */
    static final class DialogInterface$OnClickListenerC64747q implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64719f f146505a;

        static {
            Covode.recordClassIndex(76214);
        }

        DialogInterface$OnClickListenerC64747q(C64719f fVar) {
            this.f146505a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f146505a.mo104190v();
            UserProfileFollowVM.m116560a(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$r */
    static final class DialogInterface$OnClickListenerC64748r implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64719f f146506a;

        static {
            Covode.recordClassIndex(76215);
        }

        DialogInterface$OnClickListenerC64748r(C64719f fVar) {
            this.f146506a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f146506a.mo104190v();
            UserProfileFollowVM.m116560a(1);
            this.f146506a.mo104190v().mo104172a(EnumC64712a.BAN);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$ai */
    static final class DialogInterface$OnClickListenerC64729ai implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64719f f146482a;

        static {
            Covode.recordClassIndex(76196);
        }

        DialogInterface$OnClickListenerC64729ai(C64719f fVar) {
            this.f146482a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str;
            this.f146482a.mo104190v();
            C39162r.m79460a("remove_fans", new C33744d().mo59983a("enter_from", "others_homepage").f79943a);
            UserProfileFollowVM v = this.f146482a.mo104190v();
            User w = this.f146482a.mo104191w();
            String str2 = null;
            if (w != null) {
                str = w.getUid();
            } else {
                str = null;
            }
            User w2 = this.f146482a.mo104191w();
            if (w2 != null) {
                str2 = w2.getSecUid();
            }
            AbstractC88412b a = v.f146424j.mo20458a().mo104209a(str, str2).mo143254a(new UserProfileFollowVM.C64703k(v), new UserProfileFollowVM.C64710l(v));
            C89219l.m154716b(a, "");
            v.mo20659a(a);
        }
    }

    /* renamed from: a */
    private void m116582a(User user, int i) {
        if (user != null) {
            RelationCheckApi.C63426a.m115013a().checkRelation("[\"" + user.getSecUid() + "\"]").mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C64740j(this, i), new C64741k(this, i));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.f$aa */
    static final class C64721aa extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends EnumC64712a>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64719f f146474a;

        static {
            Covode.recordClassIndex(76188);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64721aa(C64719f fVar) {
            super(2);
            this.f146474a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends EnumC64712a> aVar) {
            T t;
            String str;
            int i;
            GeneralPermission generalPermission;
            C12776a<? extends EnumC64712a> aVar2 = aVar;
            String str2 = "";
            C89219l.m154721d(pVar, str2);
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                String str3 = null;
                switch (C64757g.f146517a[t.ordinal()]) {
                    case 1:
                        C64719f fVar = this.f146474a;
                        ActivityC0945e b = C12777b.m23004b(fVar);
                        String str4 = fVar.f146466l;
                        if (str4 != null) {
                            str2 = str4;
                        }
                        C80222ap apVar = new C80222ap();
                        Aweme x = fVar.mo104192x();
                        if (x != null) {
                            str = x.getAid();
                        } else {
                            str = null;
                        }
                        C80222ap a = apVar.mo123649a("group_id", str);
                        Aweme x2 = fVar.mo104192x();
                        if (x2 != null) {
                            str3 = x2.getAid();
                        }
                        C58957c.m108320a(b, str2, "click_follow", a.mo123649a("log_pb", C59208ac.m108768c(str3)).f179700a, new C64745o(fVar));
                        break;
                    case 2:
                        C64719f fVar2 = this.f146474a;
                        new C17197a.C17200a(fVar2.az_()).mo27189a(R.string.h0w).mo27194b(R.string.h0v).mo27190a(R.string.bxs, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC64743m(fVar2), false).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) null, false).mo27193a().mo27184b();
                        break;
                    case 3:
                        C64719f fVar3 = this.f146474a;
                        new C17197a.C17200a(fVar3.az_()).mo27189a(R.string.rz).mo27194b(R.string.s0).mo27190a(R.string.b6k, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC64742l(fVar3), false).mo27193a().mo27185c();
                        fVar3.mo104190v();
                        UserProfileFollowVM.m116562a(fVar3.mo104191w());
                        break;
                    case 4:
                        C64719f fVar4 = this.f146474a;
                        C17197a.C17200a aVar3 = new C17197a.C17200a(fVar4.az_());
                        User w = fVar4.mo104191w();
                        if (w == null || (generalPermission = w.getGeneralPermission()) == null || generalPermission.getFollowToastType() != 4) {
                            i = R.string.s2;
                        } else {
                            i = R.string.s3;
                        }
                        aVar3.mo27194b(i).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC64747q(fVar4), false).mo27190a(R.string.bxs, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC64748r(fVar4), false).mo27193a().mo27185c();
                        fVar4.mo104190v();
                        UserProfileFollowVM.m116562a(fVar4.mo104191w());
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        C64719f fVar5 = this.f146474a;
                        Dialog c = new C17197a.C17200a(fVar5.az_()).mo27189a(R.string.h0e).mo27195b(R.string.a20, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.h4x, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC64744n(fVar5), false).mo27193a().mo27185c();
                        View findViewById = c.findViewById(R.id.f2r);
                        if (findViewById instanceof TextView) {
                            TextView textView = (TextView) findViewById;
                            Context az_ = fVar5.az_();
                            if (az_ == null) {
                                C89219l.m154715b();
                            }
                            textView.setTextColor(C0643b.m2378c(az_, R.color.gr));
                        }
                        View findViewById2 = c.findViewById(R.id.eu6);
                        if (findViewById2 != null) {
                            findViewById2.setVisibility(8);
                            break;
                        }
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        C64719f fVar6 = this.f146474a;
                        C39110a aVar4 = new C39110a(fVar6.az_());
                        String[] strArr = new String[2];
                        Context az_2 = fVar6.az_();
                        if (az_2 == null) {
                            C89219l.m154715b();
                        }
                        strArr[0] = az_2.getResources().getString(R.string.a97);
                        Context az_3 = fVar6.az_();
                        if (az_3 == null) {
                            C89219l.m154715b();
                        }
                        strArr[1] = az_3.getResources().getString(R.string.a8y);
                        aVar4.mo67871a(strArr, new DialogInterface$OnClickListenerC64746p(fVar6));
                        aVar4.f92306a.mo458b();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        this.f146474a.mo104194z();
                        break;
                }
            }
            return C89391z.f203057a;
        }
    }
}
