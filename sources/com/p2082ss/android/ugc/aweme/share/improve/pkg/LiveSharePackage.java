package com.p2082ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11664a;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56253f;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69037c;
import com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69109b;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import com.p2082ss.android.ugc.aweme.share.improve.p3761f.C69198b;
import com.p2082ss.android.ugc.aweme.share.p3776ui.C69480a;
import com.p2082ss.android.ugc.aweme.share.p3776ui.C69482b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69651l;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69683d;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80312cr;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage */
public final class LiveSharePackage extends LinkDefaultSharePackage {

    /* renamed from: a */
    public static final C69226a f154740a = new C69226a((byte) 0);

    static {
        Covode.recordClassIndex(81547);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage$a */
    public static final class C69226a {
        static {
            Covode.recordClassIndex(81548);
        }

        private C69226a() {
        }

        public /* synthetic */ C69226a(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage$a$c */
        public static final class C69229c implements AbstractC69683d {

            /* renamed from: a */
            final /* synthetic */ Activity f154746a;

            /* renamed from: b */
            final /* synthetic */ C11666c f154747b;

            /* renamed from: c */
            final /* synthetic */ List f154748c;

            /* renamed from: d */
            final /* synthetic */ SharePackage f154749d;

            /* renamed from: e */
            final /* synthetic */ AbstractC11665b f154750e;

            static {
                Covode.recordClassIndex(81551);
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69683d
            /* renamed from: b */
            public final boolean mo69720b(SharePackage sharePackage) {
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(sharePackage, "");
                return true;
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69683d
            /* renamed from: a */
            public final void mo69718a(SharePackage sharePackage) {
                C89219l.m154721d(sharePackage, "");
                this.f154750e.mo8903a("chat_merge", "link", sharePackage.f155492i);
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69683d
            /* renamed from: a */
            public final void mo69719a(String str, SharePackage sharePackage) {
                C89219l.m154721d(str, "");
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(str, "");
                C89219l.m154721d(sharePackage, "");
            }

            C69229c(Activity activity, C11666c cVar, List list, SharePackage sharePackage, AbstractC11665b bVar) {
                this.f154746a = activity;
                this.f154747b = cVar;
                this.f154748c = list;
                this.f154749d = sharePackage;
                this.f154750e = bVar;
            }
        }

        /* renamed from: a */
        private static UrlModel m122336a(ImageModel imageModel) {
            if (imageModel == null) {
                return null;
            }
            UrlModel urlModel = new UrlModel();
            urlModel.setUri(imageModel.getUri());
            urlModel.setUrlList(imageModel.getUrls());
            urlModel.setUrlKey(imageModel.getUri());
            urlModel.setWidth(imageModel.width);
            urlModel.setHeight(imageModel.height);
            return urlModel;
        }

        /* renamed from: a */
        private static IMUser m122337a(User user) {
            IMUser iMUser = new IMUser();
            iMUser.setUid(String.valueOf(user.getId()));
            iMUser.setSecUid(user.getSecUid());
            iMUser.setNickName(user.getNickName());
            iMUser.setAvatarThumb(m122336a(user.getAvatarThumb()));
            boolean z = true;
            if (user.getSecret() != 1) {
                z = false;
            }
            iMUser.setSecret(z);
            return iMUser;
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage$a$b */
        public static final class C69228b implements AbstractC69690f {

            /* renamed from: a */
            final /* synthetic */ Activity f154741a;

            /* renamed from: b */
            final /* synthetic */ C11666c f154742b;

            /* renamed from: c */
            final /* synthetic */ List f154743c;

            /* renamed from: d */
            final /* synthetic */ SharePackage f154744d;

            /* renamed from: e */
            final /* synthetic */ AbstractC11665b f154745e;

            static {
                Covode.recordClassIndex(81550);
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
            /* renamed from: a */
            public final void mo60845a(SharePackage sharePackage, Context context) {
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(context, "");
                AbstractC69690f.C69691a.m123095b(sharePackage, context);
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
            /* renamed from: b */
            public final void mo60847b(SharePackage sharePackage, Context context) {
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(context, "");
                AbstractC69690f.C69691a.m123093a(sharePackage, context);
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
            /* renamed from: a */
            public final void mo60846a(AbstractC69693h hVar, SharePackage sharePackage, Context context) {
                C89219l.m154721d(hVar, "");
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(context, "");
                if (hVar instanceof C69037c) {
                    this.f154745e.mo8903a(hVar.mo61919c(), "link", sharePackage.f155492i);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69660b
            /* renamed from: a */
            public final void mo60844a(AbstractC69581b bVar, boolean z, SharePackage sharePackage, Context context) {
                Bundle bundle;
                C89219l.m154721d(bVar, "");
                C89219l.m154721d(context, "");
                if (z) {
                    AbstractC11665b bVar2 = this.f154745e;
                    String a = bVar.mo109548a();
                    if (sharePackage != null) {
                        bundle = sharePackage.f155492i;
                    } else {
                        bundle = null;
                    }
                    bVar2.mo8903a(a, "qr_code", bundle);
                    return;
                }
                this.f154745e.mo8904a(new Throwable());
            }

            C69228b(Activity activity, C11666c cVar, List list, SharePackage sharePackage, AbstractC11665b bVar) {
                this.f154741a = activity;
                this.f154742b = cVar;
                this.f154743c = list;
                this.f154744d = sharePackage;
                this.f154745e = bVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage$a$a */
        public static final class C69227a<T> implements Comparator {
            static {
                Covode.recordClassIndex(81549);
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C89090a.m154604a(Integer.valueOf(t.f154816b), Integer.valueOf(t2.f154816b));
            }
        }

        /* renamed from: a */
        public static LiveSharePackage m122338a(C11666c cVar, Context context) {
            UrlModel a;
            String str;
            String str2;
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(context, "");
            SharePackage.C69654a a2 = new SharePackage.C69654a().mo109803a("live");
            String c = C69124b.m122228c(cVar.f27822l);
            if (c == null) {
                c = "";
            }
            SharePackage.C69654a e = a2.mo109809e(c);
            String str3 = cVar.f27823m;
            if (str3 == null) {
                str3 = "";
            }
            SharePackage.C69654a c2 = e.mo109807c(str3);
            String string = context.getResources().getString(R.string.e81);
            C89219l.m154716b(string, "");
            LiveSharePackage liveSharePackage = new LiveSharePackage(c2.mo109808d(string).mo109806b(String.valueOf(cVar.f27813c)));
            Bundle bundle = liveSharePackage.f155492i;
            if (!TextUtils.isEmpty(cVar.f27806M)) {
                bundle.putString("aid", cVar.f27806M);
            }
            bundle.putSerializable("thumb_for_share", m122336a(cVar.f27817g));
            if (cVar.f27820j == null) {
                a = m122336a(cVar.f27819i);
            } else {
                a = m122336a(cVar.f27820j);
            }
            bundle.putSerializable("video_cover", a);
            bundle.putString("author_name", cVar.f27821k);
            if (cVar.f27816f == null) {
                bundle.putString("author_id", null);
            } else {
                bundle.putString("author_id", cVar.f27816f.toString());
            }
            bundle.putString("app_name", context.getString(R.string.u8));
            String str4 = cVar.f27825o;
            if (str4 == null || C89361p.m154870a((CharSequence) str4)) {
                str = C34577e.m70587a(m122336a(cVar.f27818h));
            } else {
                str = cVar.f27825o;
            }
            bundle.putString("thumb_url", str);
            bundle.putString("uid_for_share", String.valueOf(cVar.f27814d));
            bundle.putString("sec_user_id", cVar.f27833w);
            bundle.putLong("group_id", cVar.f27813c);
            bundle.putLong("item_id", cVar.f27813c);
            bundle.putString("share_text", liveSharePackage.f155490g);
            bundle.putString("live_id", String.valueOf(cVar.f27814d));
            bundle.putString("room_title", cVar.f27823m);
            bundle.putString("request_id", cVar.f27830t);
            if (cVar.f27827q) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            bundle.putString("user_type", str2);
            bundle.putString("request_page", cVar.f27795B);
            bundle.putString("previous_page", "live");
            bundle.putBoolean("is_share_live", true);
            return liveSharePackage;
        }

        /* renamed from: a */
        public static List<C56253f> m122340a(Context context, C11666c cVar) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(cVar, "");
            ArrayList arrayList = new ArrayList();
            List<User> unmodifiableList = Collections.unmodifiableList(cVar.f27804K);
            C89219l.m154716b(unmodifiableList, "");
            if (!(!unmodifiableList.isEmpty())) {
                unmodifiableList = null;
            }
            if (unmodifiableList != null) {
                UrlModel urlModel = new UrlModel();
                String string = context.getResources().getString(R.string.fqz, Integer.valueOf(unmodifiableList.size()));
                C89219l.m154716b(string, "");
                String string2 = context.getResources().getString(R.string.fr0);
                C89219l.m154716b(string2, "");
                C89219l.m154716b(unmodifiableList, "");
                ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) unmodifiableList, 10));
                for (User user : unmodifiableList) {
                    C89219l.m154716b(user, "");
                    arrayList2.add(m122337a(user));
                }
                arrayList.add(new C56253f(urlModel, string, string2, arrayList2, "top_supporters"));
            }
            List<User> unmodifiableList2 = Collections.unmodifiableList(cVar.f27805L);
            C89219l.m154716b(unmodifiableList2, "");
            if ((!unmodifiableList2.isEmpty()) && unmodifiableList2 != null) {
                UrlModel urlModel2 = new UrlModel();
                String string3 = context.getResources().getString(R.string.fqx, Integer.valueOf(unmodifiableList2.size()));
                C89219l.m154716b(string3, "");
                String string4 = context.getResources().getString(R.string.fqy);
                C89219l.m154716b(string4, "");
                C89219l.m154716b(unmodifiableList2, "");
                ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) unmodifiableList2, 10));
                for (User user2 : unmodifiableList2) {
                    C89219l.m154716b(user2, "");
                    arrayList3.add(m122337a(user2));
                }
                arrayList.add(new C56253f(urlModel2, string3, string4, arrayList3, "recently_shared"));
            }
            return arrayList;
        }

        /* renamed from: a */
        public static C69684e m122339a(Activity activity, C11666c cVar, List<C69265h> list, AbstractC11665b bVar, SharePackage sharePackage) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(list, "");
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(sharePackage, "");
            C69684e.C69686b bVar2 = new C69684e.C69686b();
            C68863ah.f154027a.mo109409a(bVar2, activity, false);
            bVar2.f155584o = true;
            bVar2.mo109823a(new C69109b());
            bVar2.mo109829a("instagram");
            bVar2.mo109829a("instagram_story");
            List<AbstractC11664a> list2 = cVar.f27835y;
            if (list2 != null) {
                for (T t : list2) {
                    C89219l.m154716b(t, "");
                    list.add(new C69265h(new C69269l(t, cVar), t.mo17682d()));
                }
            }
            if (list.size() > 1) {
                C89070n.m154530a((List) list, (Comparator) new C69227a());
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                bVar2.mo109827a(it.next().f154815a);
            }
            bVar2.mo109824a(sharePackage);
            bVar2.mo109826a(new C69228b(activity, cVar, list, sharePackage, bVar));
            bVar2.mo109825a(new C69229c(activity, cVar, list, sharePackage, bVar));
            return bVar2.mo109831a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveSharePackage(SharePackage.C69654a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage$b */
    static final class C69230b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ LiveSharePackage f154751a;

        /* renamed from: b */
        final /* synthetic */ AbstractC69581b f154752b;

        /* renamed from: c */
        final /* synthetic */ Context f154753c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f154754d;

        static {
            Covode.recordClassIndex(81552);
        }

        C69230b(LiveSharePackage liveSharePackage, AbstractC69581b bVar, Context context, AbstractC89172b bVar2) {
            this.f154751a = liveSharePackage;
            this.f154752b = bVar;
            this.f154753c = context;
            this.f154754d = bVar2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            final String str2 = (String) obj;
            Bundle bundle = this.f154751a.f155492i;
            Object obj2 = null;
            if (bundle != null) {
                str = bundle.getString("author_name");
            } else {
                str = null;
            }
            C69480a.f155208a = str;
            if (bundle != null) {
                obj2 = C69480a.m122697a(bundle, "video_cover");
            }
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.model.UrlModel");
            C69480a.f155209b = (UrlModel) obj2;
            AbstractC69581b bVar = this.f154752b;
            Context context = this.f154753c;
            C692311 r1 = new AbstractC89172b<String, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage.C69230b.C692311 */

                /* renamed from: a */
                final /* synthetic */ C69230b f154755a;

                static {
                    Covode.recordClassIndex(81553);
                }

                {
                    this.f154755a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(String str) {
                    String str2 = str;
                    C89219l.m154721d(str2, "");
                    AbstractC69581b bVar = this.f154755a.f154752b;
                    Uri a = C80312cr.m139224a(this.f154755a.f154753c, new File(str2));
                    C89219l.m154716b(a, "");
                    bVar.mo109550a(new C69651l(a, str2, str2, 28), this.f154755a.f154753c);
                    this.f154755a.f154754d.invoke(true);
                    return C89391z.f203057a;
                }
            };
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(context, "");
            C89219l.m154721d(r1, "");
            C69482b bVar2 = new C69482b(context, (char) 0);
            C69480a.C69481a aVar = new C69480a.C69481a(bVar2, context, r1);
            C89219l.m154721d(aVar, "");
            bVar2.f155220c = aVar;
            String str3 = C69480a.f155208a;
            UrlModel urlModel = C69480a.f155209b;
            bVar2.f155218a = str3;
            bVar2.f155219b = urlModel;
            if (bVar2.f155218a != null) {
                TuxTextView tuxTextView = (TuxTextView) bVar2.mo109730a(R.id.cbr);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setText("@" + bVar2.f155218a);
            }
            C20766v a = C20761r.m39060a(C34735v.m70965a(bVar2.f155219b)).mo34179a("LiveShareCodeView");
            a.f49105b = bVar2.f155221d;
            a.f49124u = Bitmap.Config.ARGB_8888;
            a.mo34182a(new C69482b.C69485c(bVar2));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    /* renamed from: a */
    public final boolean mo109573a(AbstractC69581b bVar, Context context, AbstractC89172b<? super Boolean, C89391z> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar2, "");
        C68863ah.f154028b.mo109361a(bVar.mo109548a(), 0);
        if (bVar instanceof C69198b) {
            return false;
        }
        String a = bVar.mo109548a();
        if (a.hashCode() != 284397090 || !a.equals("snapchat")) {
            return false;
        }
        try {
            C69125c.m122234b(this.f155491h, this.f155487d, bVar).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143234a(C88391a.m153580a(C88392a.f200660a)).mo143253e(new C69230b(this, bVar, context, bVar2));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }
}
