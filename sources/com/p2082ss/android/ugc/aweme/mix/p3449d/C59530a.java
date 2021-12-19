package com.p2082ss.android.ugc.aweme.mix.p3449d;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59387a;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59389c;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59390d;
import com.p2082ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59396b;
import com.p2082ss.android.ugc.aweme.mix.model.C59864a;
import com.p2082ss.android.ugc.aweme.mix.model.C59867d;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59408h;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59410j;
import com.p2082ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.d.a */
public final class C59530a {

    /* renamed from: a */
    static C59864a f135844a;

    /* renamed from: b */
    public static final C59530a f135845b = new C59530a();

    private C59530a() {
    }

    static {
        Covode.recordClassIndex(69925);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.d.a$f */
    public static final class C59536f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC59389c f135861a;

        static {
            Covode.recordClassIndex(69931);
        }

        public C59536f(AbstractC59389c cVar) {
            this.f135861a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f135861a.mo97056a(false, C59530a.f135844a);
        }
    }

    /* renamed from: a */
    public static void m109169a(int i) {
        Keva.getRepo("keva_mixlist_repo_name").storeInt(m109167a("keva_mixlist_num_key"), i);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.d.a$d */
    public static final class C59534d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC59390d f135858a;

        static {
            Covode.recordClassIndex(69929);
        }

        public C59534d(AbstractC59390d dVar) {
            this.f135858a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i;
            List<C59867d> mixList;
            AbstractC59390d dVar = this.f135858a;
            C59864a aVar = C59530a.f135844a;
            if (aVar == null || (mixList = aVar.getMixList()) == null) {
                i = 0;
            } else {
                i = mixList.size();
            }
            dVar.mo84869a(false, i);
        }
    }

    /* renamed from: a */
    public static String m109167a(String str) {
        StringBuilder append = new StringBuilder().append(str);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        return append.append(g.getCurUserId()).toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.d.a$b */
    public static final class C59532b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ int f135853a;

        /* renamed from: b */
        final /* synthetic */ AbstractC59387a f135854b;

        /* renamed from: c */
        final /* synthetic */ Activity f135855c;

        static {
            Covode.recordClassIndex(69927);
        }

        C59532b(int i, AbstractC59387a aVar, Activity activity) {
            this.f135853a = i;
            this.f135854b = aVar;
            this.f135855c = activity;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f135853a == MixFeedApi.EnumC59386b.VIDEOADD.getOperation()) {
                this.f135854b.mo84870a(false);
            } else {
                this.f135854b.mo84871b(false);
            }
            new C23144b(this.f135855c).mo37640e(R.string.fz3).mo37637b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.d.a$c */
    public static final class C59533c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f135856a;

        /* renamed from: b */
        final /* synthetic */ AbstractC59390d f135857b;

        static {
            Covode.recordClassIndex(69928);
        }

        public C59533c(String str, AbstractC59390d dVar) {
            this.f135856a = str;
            this.f135857b = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<C59867d> mixList;
            int i;
            List<C59867d> mixList2;
            C59864a aVar = (C59864a) obj;
            if (aVar != null) {
                C59530a.f135844a = aVar;
                C31575b.m65859a();
                IAccountUserService e = C31575b.f75524a.mo57069e();
                C89219l.m154716b(e, "");
                int i2 = 0;
                if (C89219l.m154714a((Object) e.getCurUserId(), (Object) this.f135856a)) {
                    C59864a aVar2 = C59530a.f135844a;
                    if (aVar2 == null || (mixList2 = aVar2.getMixList()) == null) {
                        i = 0;
                    } else {
                        i = mixList2.size();
                    }
                    C59530a.m109169a(i);
                }
                AbstractC59390d dVar = this.f135857b;
                C59864a aVar3 = C59530a.f135844a;
                if (!(aVar3 == null || (mixList = aVar3.getMixList()) == null)) {
                    i2 = mixList.size();
                }
                dVar.mo84869a(true, i2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.d.a$e */
    public static final class C59535e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f135859a;

        /* renamed from: b */
        final /* synthetic */ AbstractC59389c f135860b;

        static {
            Covode.recordClassIndex(69930);
        }

        public C59535e(String str, AbstractC59389c cVar) {
            this.f135859a = str;
            this.f135860b = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i;
            List<C59867d> mixList;
            C59864a aVar = (C59864a) obj;
            if (aVar != null) {
                C59530a.f135844a = aVar;
                C31575b.m65859a();
                IAccountUserService e = C31575b.f75524a.mo57069e();
                C89219l.m154716b(e, "");
                if (C89219l.m154714a((Object) e.getCurUserId(), (Object) this.f135859a)) {
                    C59864a aVar2 = C59530a.f135844a;
                    if (aVar2 == null || (mixList = aVar2.getMixList()) == null) {
                        i = 0;
                    } else {
                        i = mixList.size();
                    }
                    C59530a.m109169a(i);
                }
                if (aVar.status_code == 0) {
                    this.f135860b.mo97056a(true, C59530a.f135844a);
                } else {
                    this.f135860b.mo97056a(false, C59530a.f135844a);
                }
            }
        }
    }

    /* renamed from: a */
    private static String m109168a(List<String> list) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (i != list.size() - 1) {
                sb.append(",");
            } else {
                sb.append("]");
            }
            i++;
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.d.a$a */
    public static final class C59531a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ int f135846a;

        /* renamed from: b */
        final /* synthetic */ Activity f135847b;

        /* renamed from: c */
        final /* synthetic */ AbstractC59387a f135848c;

        /* renamed from: d */
        final /* synthetic */ String f135849d;

        /* renamed from: e */
        final /* synthetic */ String f135850e;

        /* renamed from: f */
        final /* synthetic */ String f135851f;

        /* renamed from: g */
        final /* synthetic */ Aweme f135852g;

        static {
            Covode.recordClassIndex(69926);
        }

        C59531a(int i, Activity activity, AbstractC59387a aVar, String str, String str2, String str3, Aweme aweme) {
            this.f135846a = i;
            this.f135847b = activity;
            this.f135848c = aVar;
            this.f135849d = str;
            this.f135850e = str2;
            this.f135851f = str3;
            this.f135852g = aweme;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String str2;
            if (((C59396b) obj).status_code != 0) {
                if (this.f135846a == MixFeedApi.EnumC59386b.VIDEOADD.getOperation()) {
                    this.f135848c.mo84870a(false);
                } else {
                    this.f135848c.mo84871b(false);
                }
                new C23144b(this.f135847b).mo37640e(R.string.fz3).mo37637b();
            } else if (this.f135846a == MixFeedApi.EnumC59386b.VIDEOADD.getOperation()) {
                new C23144b(this.f135847b).mo37640e(R.string.pi).mo37637b();
                this.f135848c.mo84870a(true);
                String str3 = this.f135849d;
                String str4 = this.f135850e;
                String str5 = this.f135851f;
                Aweme aweme = this.f135852g;
                if (aweme == null || (str2 = aweme.getGroupId()) == null) {
                    str2 = "";
                }
                C89219l.m154721d(str3, "");
                C89219l.m154721d(str4, "");
                C89219l.m154721d(str5, "");
                C89219l.m154721d(str2, "");
                C39162r.m79460a("add_playlist_video", new C33744d().mo59983a("enter_from", str3).mo59983a("enter_method", str4).mo59983a("playlist_id", str5).mo59983a("group_id", str2).f79943a);
            } else {
                new C23144b(this.f135847b).mo37640e(R.string.gfw).mo37637b();
                String str6 = this.f135849d;
                String str7 = this.f135850e;
                String str8 = this.f135851f;
                Aweme aweme2 = this.f135852g;
                if (aweme2 == null || (str = aweme2.getGroupId()) == null) {
                    str = "";
                }
                C89219l.m154721d(str6, "");
                C89219l.m154721d(str7, "");
                C89219l.m154721d(str8, "");
                C89219l.m154721d(str, "");
                C39162r.m79460a("remove_playlist_video", new C33744d().mo59983a("enter_from", str6).mo59983a("enter_method", str7).mo59983a("playlist_id", str8).mo59983a("group_id", str).f79943a);
                if (this.f135847b instanceof MixVideoDetailActivity) {
                    AbstractC81915c.m141874a(new C59410j(false, this.f135852g));
                    AbstractC81915c.m141874a(new C59408h(this.f135852g));
                    return;
                }
                this.f135848c.mo84871b(true);
            }
        }
    }

    /* renamed from: a */
    public static void m109170a(Activity activity, Aweme aweme, String str, int i, AbstractC59387a aVar, String str2, String str3) {
        String aid;
        String aid2;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (i == MixFeedApi.EnumC59386b.VIDEOADD.getOperation()) {
            if (!(aweme == null || (aid2 = aweme.getAid()) == null)) {
                arrayList.add(aid2);
            }
        } else if (!(i != MixFeedApi.EnumC59386b.VIDEOREMOVE.getOperation() || aweme == null || (aid = aweme.getAid()) == null)) {
            arrayList2.add(aid);
        }
        C89219l.m154716b(MixFeedApi.C59385a.m109095a().manageMixFeed(i, str, "", m109168a(arrayList), m109168a(arrayList2), "").mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C59531a(i, activity, aVar, str2, str3, str, aweme), new C59532b(i, aVar, activity)), "");
    }
}
