package com.p2082ss.android.ugc.aweme.notification.p3535vm;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33941a;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.common.C39077ac;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendList;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.friends.widget.p3023a.C51759a;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56501q;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56508r;
import com.p2082ss.android.ugc.aweme.notice.api.C61530a;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notification.bean.C61865a;
import com.p2082ss.android.ugc.aweme.notification.bean.C61886q;
import com.p2082ss.android.ugc.aweme.notification.p3520b.C61862a;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.C62389c;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.C62423g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM */
public final class NotificationCombineVM extends BaseNotificationVM {

    /* renamed from: i */
    public static final C62352a f141505i = new C62352a((byte) 0);

    /* renamed from: d */
    public boolean f141506d;

    /* renamed from: e */
    public boolean f141507e;

    /* renamed from: f */
    public boolean f141508f;

    /* renamed from: g */
    public boolean f141509g;

    /* renamed from: h */
    public boolean f141510h;

    /* renamed from: j */
    private WeakReference<Context> f141511j;

    /* renamed from: k */
    private final AbstractC89244h f141512k = C89250i.m154773a((AbstractC89171a) C62371s.f141543a);

    /* renamed from: l */
    private final AbstractC89244h f141513l = C89250i.m154773a((AbstractC89171a) C62370r.f141542a);

    /* renamed from: m */
    private final AbstractC89244h f141514m = C89250i.m154773a((AbstractC89171a) C62361j.f141532a);

    /* renamed from: n */
    private final AbstractC89244h f141515n = C89250i.m154773a((AbstractC89171a) C62360i.f141531a);

    /* renamed from: o */
    private final AbstractC89244h f141516o = C89250i.m154773a((AbstractC89171a) C62354c.f141525a);

    /* renamed from: p */
    private final AbstractC89244h f141517p = C61862a.m111996a(C62353b.f141524a);

    /* renamed from: q */
    private final AbstractC89244h f141518q = C61862a.m111996a(C62375w.f141550a);

    /* renamed from: r */
    private final AbstractC89244h f141519r = C89250i.m154773a((AbstractC89171a) C62362k.f141533a);

    /* renamed from: s */
    private final AbstractC89244h f141520s = C89250i.m154773a((AbstractC89171a) C62356e.f141527a);

    /* renamed from: t */
    private final AbstractC89244h f141521t = C89250i.m154773a((AbstractC89171a) C62363l.f141534a);

    /* renamed from: u */
    private final AbstractC89244h f141522u = C89250i.m154773a((AbstractC89171a) C62355d.f141526a);

    /* renamed from: v */
    private final AbstractC89244h f141523v = C89250i.m154773a((AbstractC89171a) C62374v.f141549a);

    static {
        Covode.recordClassIndex(73139);
    }

    /* renamed from: u */
    private final List<C61865a> m112788u() {
        return (List) this.f141520s.getValue();
    }

    /* renamed from: v */
    private final Set<Integer> m112789v() {
        return (Set) this.f141523v.getValue();
    }

    /* renamed from: j */
    public final C33943c<C62380a> mo100354j() {
        return (C33943c) this.f141512k.getValue();
    }

    /* renamed from: k */
    public final C33943c<Boolean> mo100355k() {
        return (C33943c) this.f141513l.getValue();
    }

    /* renamed from: l */
    public final C33943c<C62380a> mo100356l() {
        return (C33943c) this.f141514m.getValue();
    }

    /* renamed from: m */
    public final C33943c<Boolean> mo100357m() {
        return (C33943c) this.f141515n.getValue();
    }

    /* renamed from: n */
    public final C33941a<Boolean> mo100358n() {
        return (C33941a) this.f141516o.getValue();
    }

    /* renamed from: o */
    public final MusNotice mo100359o() {
        return (MusNotice) this.f141517p.getValue();
    }

    /* renamed from: p */
    public final MusNotice mo100360p() {
        return (MusNotice) this.f141518q.getValue();
    }

    /* renamed from: q */
    public final List<MusNotice> mo100361q() {
        return (List) this.f141519r.getValue();
    }

    /* renamed from: r */
    public final C62423g mo100362r() {
        return (C62423g) this.f141521t.getValue();
    }

    /* renamed from: s */
    public final C62389c mo100363s() {
        return (C62389c) this.f141522u.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$a */
    public static final class C62352a {
        static {
            Covode.recordClassIndex(73140);
        }

        private C62352a() {
        }

        public /* synthetic */ C62352a(byte b) {
            this();
        }

        /* renamed from: a */
        public static NotificationCombineVM m112807a(Fragment fragment) {
            C89219l.m154721d(fragment, "");
            AbstractC1174ac a = C1181ae.m3879a(fragment, (C1175ad.AbstractC1177b) null).mo3983a(NotificationCombineVM.class);
            C89219l.m154716b(a, "");
            NotificationCombineVM notificationCombineVM = (NotificationCombineVM) a;
            notificationCombineVM.mo100352a(fragment.getContext());
            return notificationCombineVM;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$c */
    static final class C62354c extends AbstractC89220m implements AbstractC89171a<C33941a<Boolean>> {

        /* renamed from: a */
        public static final C62354c f141525a = new C62354c();

        static {
            Covode.recordClassIndex(73142);
        }

        C62354c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33941a<Boolean> invoke() {
            return new C33941a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$d */
    static final class C62355d extends AbstractC89220m implements AbstractC89171a<C62389c> {

        /* renamed from: a */
        public static final C62355d f141526a = new C62355d();

        static {
            Covode.recordClassIndex(73143);
        }

        C62355d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C62389c invoke() {
            return new C62389c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$e */
    static final class C62356e extends AbstractC89220m implements AbstractC89171a<List<C61865a>> {

        /* renamed from: a */
        public static final C62356e f141527a = new C62356e();

        static {
            Covode.recordClassIndex(73144);
        }

        C62356e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<C61865a> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$i */
    static final class C62360i extends AbstractC89220m implements AbstractC89171a<C33943c<Boolean>> {

        /* renamed from: a */
        public static final C62360i f141531a = new C62360i();

        static {
            Covode.recordClassIndex(73148);
        }

        C62360i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<Boolean> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$j */
    static final class C62361j extends AbstractC89220m implements AbstractC89171a<C33943c<C62380a>> {

        /* renamed from: a */
        public static final C62361j f141532a = new C62361j();

        static {
            Covode.recordClassIndex(73149);
        }

        C62361j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<C62380a> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$k */
    static final class C62362k extends AbstractC89220m implements AbstractC89171a<List<MusNotice>> {

        /* renamed from: a */
        public static final C62362k f141533a = new C62362k();

        static {
            Covode.recordClassIndex(73150);
        }

        C62362k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<MusNotice> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$l */
    static final class C62363l extends AbstractC89220m implements AbstractC89171a<C62423g> {

        /* renamed from: a */
        public static final C62363l f141534a = new C62363l();

        static {
            Covode.recordClassIndex(73151);
        }

        C62363l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C62423g invoke() {
            return new C62423g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$r */
    static final class C62370r extends AbstractC89220m implements AbstractC89171a<C33943c<Boolean>> {

        /* renamed from: a */
        public static final C62370r f141542a = new C62370r();

        static {
            Covode.recordClassIndex(73158);
        }

        C62370r() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<Boolean> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$s */
    static final class C62371s extends AbstractC89220m implements AbstractC89171a<C33943c<C62380a>> {

        /* renamed from: a */
        public static final C62371s f141543a = new C62371s();

        static {
            Covode.recordClassIndex(73159);
        }

        C62371s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<C62380a> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$v */
    static final class C62374v extends AbstractC89220m implements AbstractC89171a<Set<Integer>> {

        /* renamed from: a */
        public static final C62374v f141549a = new C62374v();

        static {
            Covode.recordClassIndex(73162);
        }

        C62374v() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Set<Integer> invoke() {
            return new LinkedHashSet();
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        mo100362r();
        mo100363s();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$b */
    static final class C62353b extends AbstractC89220m implements AbstractC89171a<MusNotice> {

        /* renamed from: a */
        public static final C62353b f141524a = new C62353b();

        static {
            Covode.recordClassIndex(73141);
        }

        C62353b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MusNotice invoke() {
            MusNotice musNotice = new MusNotice(false, 1, null);
            musNotice.type = 2008;
            return musNotice;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$w */
    static final class C62375w extends AbstractC89220m implements AbstractC89171a<MusNotice> {

        /* renamed from: a */
        public static final C62375w f141550a = new C62375w();

        static {
            Covode.recordClassIndex(73163);
        }

        C62375w() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MusNotice invoke() {
            MusNotice musNotice = new MusNotice(false, 1, null);
            musNotice.type = 2007;
            return musNotice;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$q */
    public static final class C62369q implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ NotificationCombineVM f141540a;

        /* renamed from: b */
        final /* synthetic */ C62380a f141541b;

        static {
            Covode.recordClassIndex(73157);
        }

        public C62369q(NotificationCombineVM notificationCombineVM, C62380a aVar) {
            this.f141540a = notificationCombineVM;
            this.f141541b = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f141540a.f141509g = false;
            this.f141540a.mo100354j().setValue(this.f141541b);
        }
    }

    /* renamed from: t */
    public final EnumC56508r mo100364t() {
        Context context;
        if (mo100337a() != C61530a.C61532b.m111445a()) {
            return EnumC56508r.GONE;
        }
        EnumC56501q qVar = EnumC56501q.THIRD_PLATFORM;
        WeakReference<Context> weakReference = this.f141511j;
        if (weakReference != null) {
            context = weakReference.get();
        } else {
            context = null;
        }
        return qVar.decideDisplay(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$u */
    static final class RunnableC62373u implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f141547a;

        /* renamed from: b */
        final /* synthetic */ String f141548b;

        static {
            Covode.recordClassIndex(73161);
        }

        RunnableC62373u(String str, String str2) {
            this.f141547a = str;
            this.f141548b = str2;
        }

        public final void run() {
            C39162r.m79460a("contact_invite_show", C89041ag.m154421a(C89387v.m154943a("enter_from", "notification_page"), C89387v.m154943a("has_photo", this.f141547a), C89387v.m154943a("rank", this.f141548b), C89387v.m154943a("enter_method", "direct")));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.BaseNotificationVM
    /* renamed from: h */
    public final EnumC56508r mo100349h() {
        Context context;
        this.f141507e = C51648a.f118980a.mo87322d().mo86984c();
        if (mo100337a() != C61530a.C61532b.m111445a()) {
            return EnumC56508r.GONE;
        }
        EnumC56501q qVar = EnumC56501q.CONTACTS;
        WeakReference<Context> weakReference = this.f141511j;
        if (weakReference != null) {
            context = weakReference.get();
        } else {
            context = null;
        }
        return qVar.decideDisplay(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$t */
    static final class RunnableC62372t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f141544a;

        /* renamed from: b */
        final /* synthetic */ String f141545b;

        /* renamed from: c */
        final /* synthetic */ String f141546c;

        static {
            Covode.recordClassIndex(73160);
        }

        RunnableC62372t(String str, String str2, String str3) {
            this.f141544a = str;
            this.f141545b = str2;
            this.f141546c = str3;
        }

        public final void run() {
            C39162r.m79460a("invite_friend_click", C89041ag.m154421a(C89387v.m154943a("enter_from", "notification_page"), C89387v.m154943a("has_photo", this.f141544a), C89387v.m154943a("rank", this.f141545b), C89387v.m154943a("enter_method", "direct"), C89387v.m154943a("url", this.f141546c)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$f */
    public static final class C62357f<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C62357f f141528a = new C62357f();

        static {
            Covode.recordClassIndex(73145);
        }

        C62357f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            AbstractC62398e.C62400b bVar = (AbstractC62398e.C62400b) obj;
            C89219l.m154721d(bVar, "");
            return bVar.f141596b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$g */
    public static final class C62358g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ NotificationCombineVM f141529a;

        static {
            Covode.recordClassIndex(73146);
        }

        public C62358g(NotificationCombineVM notificationCombineVM) {
            this.f141529a = notificationCombineVM;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f141529a.f141510h = false;
            this.f141529a.mo100356l().setValue(obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$n */
    public static final class C62366n<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C62366n f141536a = new C62366n();

        static {
            Covode.recordClassIndex(73154);
        }

        C62366n() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            AbstractC62398e.C62400b bVar = (AbstractC62398e.C62400b) obj;
            C89219l.m154721d(bVar, "");
            return bVar.f141596b;
        }
    }

    /* renamed from: a */
    public final C89391z mo100352a(Context context) {
        if (context == null) {
            return null;
        }
        this.f141511j = new WeakReference<>(context);
        return C89391z.f203057a;
    }

    /* renamed from: b */
    public final int mo100353b(String str) {
        return mo100362r().mo100411a(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$h */
    public static final class C62359h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ NotificationCombineVM f141530a;

        static {
            Covode.recordClassIndex(73147);
        }

        public C62359h(NotificationCombineVM notificationCombineVM) {
            this.f141530a = notificationCombineVM;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f141530a.f141510h = false;
            C39109f.m79401a("NotificationCombineVM", "loadMoreBottom error", (Throwable) obj);
            this.f141530a.mo100357m().setValue(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$m */
    public static final class C62364m<T> implements AbstractC88983w {

        /* renamed from: a */
        public static final C62364m f141535a = new C62364m();

        static {
            Covode.recordClassIndex(73152);
        }

        C62364m() {
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<AbstractC62398e.C62400b<C62380a>> vVar) {
            C89219l.m154721d(vVar, "");
            C39077ac.m79342a(vVar, new AbstractC62398e.C62400b(new AbstractC62398e<Object, C62380a>() {
                /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.NotificationCombineVM.C62364m.C623651 */

                static {
                    Covode.recordClassIndex(73153);
                }

                @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
                /* renamed from: d */
                public final boolean mo100369d() {
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
                /* renamed from: a */
                public final /* synthetic */ C62380a mo100366a() {
                    throw new IllegalAccessError("cannot call retrieveData");
                }

                @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
                /* renamed from: b */
                public final AbstractC88979t<AbstractC62398e.C62400b<C62380a>> mo100367b() {
                    throw new IllegalAccessError("cannot call refresh");
                }

                @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
                /* renamed from: c */
                public final AbstractC88979t<AbstractC62398e.C62400b<C62380a>> mo100368c() {
                    return AbstractC62398e.C62399a.m112856a();
                }

                /* Return type fixed from 'com.ss.android.ugc.aweme.notification.vm.a.e$b' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Throwable] */
                @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
                /* renamed from: a */
                public final /* synthetic */ AbstractC62398e.C62400b<C62380a> mo100365a(C62380a aVar, Throwable th) {
                    C89219l.m154721d(aVar, "");
                    return AbstractC62398e.C62399a.m112855a(this, aVar, th);
                }
            }, new C62380a(null, null, 3)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$o */
    public static final class C62367o<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C62380a f141537a;

        static {
            Covode.recordClassIndex(73155);
        }

        public C62367o(C62380a aVar) {
            this.f141537a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C62380a aVar = (C62380a) obj;
            if (aVar.f141557a != null) {
                this.f141537a.f141557a = aVar.f141557a;
            }
            List<? extends Friend> list = aVar.f141558b;
            if (list != null && !list.isEmpty()) {
                this.f141537a.f141558b = aVar.f141558b;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM$p */
    public static final class C62368p<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ NotificationCombineVM f141538a;

        /* renamed from: b */
        final /* synthetic */ C62380a f141539b;

        static {
            Covode.recordClassIndex(73156);
        }

        public C62368p(NotificationCombineVM notificationCombineVM, C62380a aVar) {
            this.f141538a = notificationCombineVM;
            this.f141539b = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C39109f.m79401a("NotificationCombineVM", "refreshBottom error:" + this.f141539b, (Throwable) obj);
            this.f141538a.f141509g = false;
            this.f141538a.mo100355k().setValue(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.BaseNotificationVM
    /* renamed from: a */
    public final void mo100340a(C61865a aVar) {
        boolean z;
        C89219l.m154721d(aVar, "");
        if (!m112789v().contains(Integer.valueOf(aVar.hashCode()))) {
            String valueOf = String.valueOf(m112788u().indexOf(aVar));
            Friend friend = aVar.f140450b;
            if (friend == null || friend.getPhotoUri() == null) {
                z = false;
            } else {
                z = true;
            }
            C39162r.m79452a().execute(new RunnableC62373u(C51759a.m96435a(z), valueOf));
            m112789v().add(Integer.valueOf(aVar.hashCode()));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.BaseNotificationVM
    /* renamed from: a */
    public final void mo100341a(C61865a aVar, String str) {
        boolean z;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        String valueOf = String.valueOf(m112788u().indexOf(aVar));
        Friend friend = aVar.f140450b;
        if (friend == null || friend.getPhotoUri() == null) {
            z = false;
        } else {
            z = true;
        }
        C39162r.m79452a().execute(new RunnableC62372t(C51759a.m96435a(z), valueOf, str));
    }

    /* renamed from: a */
    public final C62454b mo100351a(List<? extends MusNotice> list, C62380a aVar) {
        RecommendList recommendList;
        C89219l.m154721d(aVar, "");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        ArrayList arrayList2 = new ArrayList();
        if (mo100349h() == EnumC56508r.BOTTOM) {
            arrayList2.add(mo100359o());
        }
        if (mo100364t() == EnumC56508r.BOTTOM) {
            arrayList2.add(mo100360p());
        }
        m112788u().clear();
        List<? extends Friend> list2 = aVar.f141558b;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                m112788u().add(new C61865a(2010, it.next()));
            }
        }
        boolean z = true;
        if (!m112788u().isEmpty()) {
            m112788u().add(0, new C61865a(2009, null));
        }
        this.f141506d = !m112788u().isEmpty();
        RecommendList recommendList2 = aVar.f141557a;
        if (recommendList2 != null) {
            List<User> inviterList = recommendList2.getInviterList();
            if (inviterList != null) {
                Iterator<T> it2 = inviterList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C61886q(2011, it2.next(), null, 0, 12));
                }
            }
            List<User> userList = recommendList2.getUserList();
            if (userList != null && !userList.isEmpty()) {
                if (this.f141506d) {
                    arrayList2.add(new C61886q(2006, null, userList, recommendList2.getTotalCount(), 2));
                } else {
                    Iterator<T> it3 = userList.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(new C61886q(2001, it3.next(), null, 0, 12));
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList2.add(0, new C61886q(LiveNetAdaptiveHurryTimeSetting.DEFAULT, null, null, 0, 14));
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(m112788u());
        if (arrayList.isEmpty() && (!arrayList3.isEmpty())) {
            MusNotice musNotice = new MusNotice(false, 1, null);
            musNotice.type = 2003;
            arrayList.add(musNotice);
        }
        arrayList.addAll(arrayList3);
        if (this.f141506d || (recommendList = aVar.f141557a) == null || !recommendList.hasMore()) {
            z = false;
        }
        return new C62454b(arrayList, arrayList3, z);
    }
}
