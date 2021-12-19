package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import androidx.core.app.C0576b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39165u;
import com.p2082ss.android.ugc.aweme.common.C39168w;
import com.p2082ss.android.ugc.aweme.model.C60140b;
import com.p2082ss.android.ugc.aweme.model.C60157q;
import com.p2082ss.android.ugc.aweme.model.C60159r;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60106a;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60107b;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60109d;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60110e;
import com.p2082ss.android.ugc.aweme.model.api.p3460b.C60116c;
import com.p2082ss.android.ugc.aweme.model.api.p3460b.C60117d;
import com.p2082ss.android.ugc.aweme.model.api.request.C60132b;
import com.p2082ss.android.ugc.aweme.model.api.request.ProfileNaviImageListRequest;
import com.p2082ss.android.ugc.aweme.model.api.request.ProfileNaviInfoRequest;
import com.p2082ss.android.ugc.aweme.profile.C63425ak;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.view.ProfileNaviActivity;
import com.p2082ss.android.ugc.aweme.view.p4232d.DialogC81216a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ProfileNaviServiceImpl */
public final class ProfileNaviServiceImpl implements IProfileNaviService {

    /* renamed from: com.ss.android.ugc.aweme.ProfileNaviServiceImpl$f */
    static final class C31290f implements WeakHandler.IHandler {

        /* renamed from: a */
        public static final C31290f f74990a = new C31290f();

        static {
            Covode.recordClassIndex(37981);
        }

        C31290f() {
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
        }
    }

    static {
        Covode.recordClassIndex(37974);
    }

    /* renamed from: a */
    public static IProfileNaviService m65406a() {
        MethodCollector.m26663i(2307);
        Object a = C81908b.m141854a(IProfileNaviService.class, false);
        if (a != null) {
            IProfileNaviService iProfileNaviService = (IProfileNaviService) a;
            MethodCollector.m26664o(2307);
            return iProfileNaviService;
        }
        if (C81908b.f183411t == null) {
            synchronized (IProfileNaviService.class) {
                try {
                    if (C81908b.f183411t == null) {
                        C81908b.f183411t = new ProfileNaviServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2307);
                    throw th;
                }
            }
        }
        ProfileNaviServiceImpl profileNaviServiceImpl = (ProfileNaviServiceImpl) C81908b.f183411t;
        MethodCollector.m26664o(2307);
        return profileNaviServiceImpl;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ProfileNaviServiceImpl$c */
    public static final class C31287c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviServiceImpl f74978a;

        /* renamed from: b */
        final /* synthetic */ String f74979b;

        /* renamed from: c */
        final /* synthetic */ int f74980c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f74981d;

        static {
            Covode.recordClassIndex(37978);
        }

        C31287c(ProfileNaviServiceImpl profileNaviServiceImpl, String str, int i, AbstractC89172b bVar) {
            this.f74978a = profileNaviServiceImpl;
            this.f74979b = str;
            this.f74980c = i;
            this.f74981d = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f74978a.mo57272a(this.f74979b, this.f74980c + 1, this.f74981d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ProfileNaviServiceImpl$a */
    static final class C31284a extends AbstractC89220m implements AbstractC89172b<C60107b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviServiceImpl f74968a;

        /* renamed from: b */
        final /* synthetic */ Activity f74969b;

        /* renamed from: c */
        final /* synthetic */ Bitmap f74970c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f74971d;

        static {
            Covode.recordClassIndex(37975);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31284a(ProfileNaviServiceImpl profileNaviServiceImpl, Activity activity, Bitmap bitmap, AbstractC89172b bVar) {
            super(1);
            this.f74968a = profileNaviServiceImpl;
            this.f74969b = activity;
            this.f74970c = bitmap;
            this.f74971d = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C60107b bVar) {
            File a;
            C60107b bVar2 = bVar;
            if (!(bVar2 == null || (a = C39165u.m79471a(this.f74969b, this.f74970c)) == null)) {
                this.f74971d.invoke(a);
                C39168w.m79473a(a, new C31285a(this, bVar2), 0);
            }
            return C89391z.f203057a;
        }

        /* renamed from: com.ss.android.ugc.aweme.ProfileNaviServiceImpl$a$a */
        static final class C31285a extends AbstractC89220m implements AbstractC89183m<AvatarUri, Boolean, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C31284a f74972a;

            /* renamed from: b */
            final /* synthetic */ C60107b f74973b;

            static {
                Covode.recordClassIndex(37976);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31285a(C31284a aVar, C60107b bVar) {
                super(2);
                this.f74972a = aVar;
                this.f74973b = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(AvatarUri avatarUri, Boolean bool) {
                UrlModel urlModel;
                String str;
                AvatarUri avatarUri2 = avatarUri;
                if (!bool.booleanValue() && avatarUri2 != null) {
                    UrlModel urlModel2 = new UrlModel();
                    urlModel2.setUrlList(avatarUri2.urlList);
                    urlModel2.setUri(avatarUri2.uri);
                    C60107b bVar = this.f74973b;
                    List<C60106a> animationList = bVar.getAnimationList();
                    if (animationList == null || animationList.isEmpty()) {
                        urlModel = null;
                    } else {
                        List<C60106a> animationList2 = bVar.getAnimationList();
                        if (animationList2 == null) {
                            C89219l.m154715b();
                        }
                        urlModel = ((C60106a) C89070n.m154579f((List) animationList2)).getUrl();
                    }
                    C63425ak akVar = new C63425ak();
                    akVar.f143980d = urlModel2.getUri();
                    akVar.mo102038a(urlModel2.getUri());
                    C31575b.m65865g().updateCurAvatar(urlModel2, urlModel2, urlModel2);
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    User curUser = g.getCurUser();
                    C89219l.m154716b(curUser, "");
                    curUser.setAvatarVideoUri(urlModel2);
                    if (urlModel != null) {
                        akVar.mo102038a(urlModel.getUri());
                        IAccountUserService g2 = C31575b.m65865g();
                        C89219l.m154716b(g2, "");
                        User curUser2 = g2.getCurUser();
                        C89219l.m154716b(curUser2, "");
                        curUser2.setAvatarVideoUri(urlModel);
                    }
                    Map<String, String> a = akVar.mo102037a();
                    C89219l.m154716b(a, "");
                    a.put("page_from", "0");
                    C60157q qVar = C60159r.f137138a;
                    if (!(qVar == null || (str = qVar.f137132a) == null)) {
                        a.put("navi_id", str);
                    }
                    if (urlModel != null) {
                        a.put("video_icon", urlModel.getUri());
                    }
                    C31575b.m65865g().updateUserInfo(new WeakHandler(C31290f.f74990a), a);
                }
                return C89391z.f203057a;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ProfileNaviServiceImpl$b */
    public static final class C31286b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviServiceImpl f74974a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f74975b;

        /* renamed from: c */
        final /* synthetic */ String f74976c;

        /* renamed from: d */
        final /* synthetic */ int f74977d;

        static {
            Covode.recordClassIndex(37977);
        }

        C31286b(ProfileNaviServiceImpl profileNaviServiceImpl, AbstractC89172b bVar, String str, int i) {
            this.f74974a = profileNaviServiceImpl;
            this.f74975b = bVar;
            this.f74976c = str;
            this.f74977d = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C60117d dVar = (C60117d) obj;
            if (dVar == null) {
                return;
            }
            if (dVar.error_code == 0) {
                C60107b bVar = dVar.f137034a;
                if (bVar != null) {
                    this.f74975b.invoke(bVar);
                    return;
                }
                return;
            }
            this.f74974a.mo57272a(this.f74976c, this.f74977d + 1, this.f74975b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ProfileNaviServiceImpl$e */
    public static final class C31289e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviServiceImpl f74986a;

        /* renamed from: b */
        final /* synthetic */ int f74987b;

        /* renamed from: c */
        final /* synthetic */ int f74988c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f74989d;

        static {
            Covode.recordClassIndex(37980);
        }

        C31289e(ProfileNaviServiceImpl profileNaviServiceImpl, int i, int i2, AbstractC89183m mVar) {
            this.f74986a = profileNaviServiceImpl;
            this.f74987b = i;
            this.f74988c = i2;
            this.f74989d = mVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                int i = this.f74987b;
                if (i < 3) {
                    this.f74986a.mo57244a(this.f74988c, i + 1, this.f74989d);
                } else {
                    this.f74989d.invoke(1, null);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ProfileNaviServiceImpl$d */
    public static final class C31288d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviServiceImpl f74982a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f74983b;

        /* renamed from: c */
        final /* synthetic */ int f74984c;

        /* renamed from: d */
        final /* synthetic */ int f74985d;

        static {
            Covode.recordClassIndex(37979);
        }

        C31288d(ProfileNaviServiceImpl profileNaviServiceImpl, AbstractC89183m mVar, int i, int i2) {
            this.f74982a = profileNaviServiceImpl;
            this.f74983b = mVar;
            this.f74984c = i;
            this.f74985d = i2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<String> urlList;
            List<String> urlList2;
            C60116c cVar = (C60116c) obj;
            if (cVar == null) {
                return;
            }
            if (cVar.error_code == 0) {
                List<C60109d> list = cVar.f137033b;
                if (list == null || list.isEmpty()) {
                    this.f74983b.invoke(0, null);
                    return;
                }
                LinkedList linkedList = new LinkedList();
                for (C60109d dVar : cVar.f137033b) {
                    C89219l.m154721d(dVar, "");
                    C60110e eVar = new C60110e();
                    eVar.f137021a = dVar.getNaviId();
                    eVar.f137024d = dVar.getBackgroundColorHex();
                    eVar.f137022b = (dVar.getStaticImageUrlModel() == null || (urlList2 = dVar.getStaticImageUrlModel().getUrlList()) == null || urlList2.isEmpty()) ? null : dVar.getStaticImageUrlModel().getUrlList().get(0);
                    eVar.f137023c = (dVar.getDynamicImageUrlModel() == null || (urlList = dVar.getDynamicImageUrlModel().getUrlList()) == null || urlList.isEmpty()) ? null : dVar.getDynamicImageUrlModel().getUrlList().get(0);
                    linkedList.add(eVar);
                }
                this.f74983b.invoke(0, linkedList);
                return;
            }
            int i = this.f74984c;
            if (i < 3) {
                this.f74982a.mo57244a(this.f74985d, i + 1, this.f74983b);
            } else {
                this.f74983b.invoke(Integer.valueOf(cVar.error_code), null);
            }
        }
    }

    /* renamed from: b */
    private static Intent m65409b(Activity activity, String str) {
        Intent intent = new Intent(activity, ProfileNaviActivity.class);
        intent.putExtra("enter_from", str);
        return intent;
    }

    @Override // com.p2082ss.android.ugc.aweme.IProfileNaviService
    /* renamed from: a */
    public final AbstractC34938bu mo57243a(Activity activity, String str) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        return new DialogC81216a(activity, str, (byte) 0);
    }

    /* renamed from: a */
    private static void m65407a(Activity activity, Intent intent, Bundle bundle) {
        C84349a.m145093a(intent, activity);
        activity.startActivity(intent, bundle);
    }

    /* renamed from: a */
    private static void m65408a(Activity activity, View view, Intent intent) {
        C0576b a = C0576b.m2189a(activity, view, "transition");
        C89219l.m154716b(a, "");
        m65407a(activity, intent, a.mo2564a());
    }

    @Override // com.p2082ss.android.ugc.aweme.IProfileNaviService
    /* renamed from: b */
    public final void mo57248b(Activity activity, View view, String str) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(str, "");
        Intent b = m65409b(activity, str);
        b.putExtra("entry_point", 1);
        m65408a(activity, view, b);
    }

    @Override // com.p2082ss.android.ugc.aweme.IProfileNaviService
    /* renamed from: a */
    public final void mo57244a(int i, int i2, AbstractC89183m<? super Integer, ? super List<? extends AbstractC34936bt>, C89391z> mVar) {
        C89219l.m154721d(mVar, "");
        if (i2 > 0) {
            C60140b.m109603b();
            return;
        }
        C60132b.C60133a aVar = new C60132b.C60133a();
        aVar.f137072b = i;
        C60132b bVar = new C60132b();
        bVar.f137068a = aVar.f137072b;
        bVar.f137069b = aVar.f137071a;
        C89219l.m154721d(bVar, "");
        C89219l.m154716b(ProfileNaviImageListRequest.f137049a.getNaviImageList(bVar.f137068a, bVar.f137069b).mo142918b(C88925a.m154184d(C88946a.f201989a)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C31288d(this, mVar, i2, i), new C31289e(this, i2, i, mVar)), "");
    }

    @Override // com.p2082ss.android.ugc.aweme.IProfileNaviService
    /* renamed from: a */
    public final void mo57245a(Activity activity, View view, String str) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(str, "");
        m65408a(activity, view, m65409b(activity, str));
    }

    /* renamed from: a */
    public final void mo57272a(String str, int i, AbstractC89172b<? super C60107b, C89391z> bVar) {
        if (i >= 3) {
            bVar.invoke(null);
        } else {
            ProfileNaviInfoRequest.C60125a.m109595a(str).mo142918b(C88925a.m154184d(C88946a.f201989a)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C31286b(this, bVar, str, i), new C31287c(this, str, i, bVar));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IProfileNaviService
    /* renamed from: a */
    public final void mo57246a(Activity activity, View view, String str, String str2) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        Intent b = m65409b(activity, str2);
        b.putExtra("edit_navi_id_key", str);
        m65408a(activity, view, b);
    }

    @Override // com.p2082ss.android.ugc.aweme.IProfileNaviService
    /* renamed from: a */
    public final void mo57247a(Activity activity, String str, Bitmap bitmap, AbstractC89172b<? super File, C89391z> bVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(bitmap, "");
        C89219l.m154721d(bVar, "");
        mo57272a(str, 0, new C31284a(this, activity, bitmap, bVar));
    }
}
