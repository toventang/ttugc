package com.p2082ss.android.ugc.aweme.bullet.p2416d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.lynx.AbstractC16370a;
import com.bytedance.ies.bullet.kit.lynx.AbstractC16405c;
import com.bytedance.ies.bullet.kit.lynx.AbstractC16412e;
import com.bytedance.ies.bullet.kit.lynx.p1153b.AbstractC16391d;
import com.bytedance.ies.bullet.kit.lynx.p1153b.C16388a;
import com.bytedance.ies.bullet.kit.lynx.p1154c.AbstractC16406a;
import com.bytedance.ies.bullet.kit.lynx.p1154c.AbstractC16407b;
import com.bytedance.ies.bullet.kit.lynx.p1154c.AbstractC16408c;
import com.bytedance.ies.bullet.kit.web.AbstractC16497f;
import com.bytedance.ies.bullet.kit.web.p1159a.C16479c;
import com.bytedance.ies.bullet.kit.web.p1159a.C16481e;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16210j;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.AdInfoMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.AdLynxCardStatusMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.AdLynxSuperLikeStatus;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.CloseAdLynxCardMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.CloseAdLynxHalfLoadingPageMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.CloseLynxFeedMaskMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.ClosePopUpWindow;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.CollapseAdLynxCardMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.DidGetGameCodeClickMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.DidSelectScoreMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.DidSelectVoteCardOptionMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.DownloadAppClickMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.DynamicAdReadyMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.DynamicAdStatusMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.DynamicAdViewSizeMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.ExpandAdLynxCardMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.FeedElementAnimationMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.FeedElementStatusMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.FeedPlayerTriggerTimeMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.GetNativeSiteCustomDataMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.GetPageDataMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.GetWebViewInfo;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.OpenAdLandPageLinksMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.OpenLightLandingPageMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.RegisterProgressObserverMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.SwipeUpVideoMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.UpdateNavBarMethod;
import com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b;
import com.p2082ss.android.ugc.aweme.bullet.business.C35123a;
import com.p2082ss.android.ugc.aweme.bullet.module.base.AbstractC35203a;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35222b;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35179a;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35180b;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35186c;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35191f;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35192g;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35193h;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35196j;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.d.a */
public final class C35133a extends C35138b implements AbstractC16391d {

    /* renamed from: a */
    public static final C35134a f82924a = new C35134a((byte) 0);

    static {
        Covode.recordClassIndex(42288);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.d.a$a */
    public static final class C35134a {
        static {
            Covode.recordClassIndex(42289);
        }

        private C35134a() {
        }

        public /* synthetic */ C35134a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.d.a$c */
    public static final class C35136c extends C16388a {
        static {
            Covode.recordClassIndex(42291);
        }

        C35136c() {
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16214m, com.bytedance.ies.bullet.kit.lynx.p1153b.C16388a
        /* renamed from: a */
        public final AbstractC16741q mo25787a(C16248b bVar) {
            C89219l.m154721d(bVar, "");
            return new C35193h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.d.a$d */
    public static final class C35137d extends C16479c {
        static {
            Covode.recordClassIndex(42292);
        }

        C35137d() {
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16214m, com.bytedance.ies.bullet.kit.web.p1159a.C16479c
        /* renamed from: a */
        public final AbstractC16741q mo25787a(C16248b bVar) {
            C89219l.m154721d(bVar, "");
            return new C35196j();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.d.a$b */
    public static final class C35135b implements AbstractC16405c {

        /* renamed from: a */
        final /* synthetic */ AbstractC35125b f82925a;

        static {
            Covode.recordClassIndex(42290);
        }

        C35135b(AbstractC35125b bVar) {
            this.f82925a = bVar;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16204e
        /* renamed from: a */
        public final AbstractC16210j mo25653a(C16248b bVar) {
            C89219l.m154721d(bVar, "");
            return new C35192g(bVar, this.f82925a);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16405c
        /* renamed from: b */
        public final AbstractC16370a mo26033b(C16248b bVar) {
            C89219l.m154721d(bVar, "");
            return new C35191f(bVar, this.f82925a);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16405c
        /* renamed from: c */
        public final AbstractC16406a mo26034c(C16248b bVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154719c(bVar, "");
            return null;
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16405c
        /* renamed from: d */
        public final AbstractC16406a mo26035d(C16248b bVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154719c(bVar, "");
            return null;
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16405c
        /* renamed from: e */
        public final AbstractC16407b mo26036e(C16248b bVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154719c(bVar, "");
            return null;
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16405c
        /* renamed from: f */
        public final AbstractC16408c mo26037f(C16248b bVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154719c(bVar, "");
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.p2416d.C35138b, com.bytedance.ies.bullet.p1125a.AbstractC16132f
    /* renamed from: e */
    public final AbstractC17019c mo25670e(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return new C35180b(bVar, new C35123a());
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.p2416d.C35138b, com.bytedance.ies.bullet.p1125a.AbstractC16136i
    /* renamed from: f */
    public final List<AbstractC16741q> mo25680f(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return C89070n.m154516a(new C35186c());
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.p1153b.AbstractC16391d
    /* renamed from: g */
    public final AbstractC16412e mo26021g(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return new C35136c();
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.p2416d.C35138b, com.bytedance.ies.bullet.kit.web.p1159a.AbstractC16483g
    /* renamed from: k */
    public final AbstractC16497f mo26188k(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return new C35137d();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.p1153b.AbstractC16391d
    /* renamed from: h */
    public final AbstractC16405c mo26022h(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        Object c = bVar.mo25832c(AbstractC17019c.class);
        if (!(c instanceof C35222b)) {
            c = null;
        }
        AbstractC35203a aVar = (AbstractC35203a) c;
        if (aVar != null) {
            return new C35135b(aVar.f83165z);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.p2416d.C35138b, com.bytedance.ies.bullet.p1125a.AbstractC16129d
    /* renamed from: b */
    public final List<AbstractC16183k> mo25667b(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        List d = C89070n.m154572d((Collection) super.mo25667b(bVar), (Iterable) C89070n.m154522b(new GetWebViewInfo(bVar), new AdInfoMethod(bVar), new UpdateNavBarMethod(bVar), new FeedElementAnimationMethod(bVar), new FeedElementStatusMethod(bVar), new FeedPlayerTriggerTimeMethod(bVar), new OpenAdLandPageLinksMethod(bVar), new DownloadAppClickMethod(bVar), new GetNativeSiteCustomDataMethod(bVar), new SwipeUpVideoMethod(bVar), new CloseLynxFeedMaskMethod(bVar), new DidGetGameCodeClickMethod(bVar), new DidSelectVoteCardOptionMethod(bVar), new OpenLightLandingPageMethod(bVar), new DidSelectScoreMethod(bVar), new DynamicAdViewSizeMethod(bVar), new DynamicAdReadyMethod(bVar), new DynamicAdStatusMethod(bVar), new AdLynxSuperLikeStatus(bVar), new CloseAdLynxHalfLoadingPageMethod(bVar), new ClosePopUpWindow(bVar), new RegisterProgressObserverMethod(bVar)));
        List<AbstractC16183k> arrayList = new ArrayList<>();
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33115c a = C33113b.m67826a();
        if (a != null) {
            arrayList = a.mo58910a(bVar);
        }
        arrayList.add(new GetPageDataMethod(bVar));
        List d2 = C89070n.m154572d((Collection) d, (Iterable) arrayList);
        List<AbstractC16183k> arrayList2 = new ArrayList<>();
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33115c a2 = C33113b.m67826a();
        if (a2 != null) {
            arrayList2 = a2.mo58937b(bVar);
        }
        List d3 = C89070n.m154572d((Collection) d2, (Iterable) arrayList2);
        List<AbstractC16183k> arrayList3 = new ArrayList<>();
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33115c a3 = C33113b.m67826a();
        if (a3 != null) {
            arrayList3 = a3.mo58948c(bVar);
        }
        List d4 = C89070n.m154572d((Collection) d3, (Iterable) arrayList3);
        C89219l.m154721d(bVar, "");
        return C89070n.m154572d((Collection) C89070n.m154572d((Collection) d4, (Iterable) new ArrayList()), (Iterable) C89070n.m154524c(new CloseAdLynxCardMethod(bVar), new AdLynxCardStatusMethod(bVar), new ExpandAdLynxCardMethod(bVar), new CollapseAdLynxCardMethod(bVar)));
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.bullet.p2416d.C35138b
    /* renamed from: a */
    public final C16481e mo61983a(C16248b bVar, AbstractC35125b bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        return new C35179a(bVar, bVar2);
    }
}
