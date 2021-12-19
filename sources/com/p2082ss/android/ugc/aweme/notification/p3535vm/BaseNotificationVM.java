package com.p2082ss.android.ugc.aweme.notification.p3535vm;

import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56508r;
import com.p2082ss.android.ugc.aweme.notice.api.C61530a;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.EnumC61551c;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61631f;
import com.p2082ss.android.ugc.aweme.notification.bean.C61865a;
import com.p2082ss.android.ugc.aweme.notification.utils.C62261f;
import com.p2082ss.android.ugc.aweme.recommend.users.C66652b;
import java.util.LinkedHashSet;
import java.util.Set;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM */
public class BaseNotificationVM extends AbstractC1174ac {

    /* renamed from: a */
    public String f141488a = "message";

    /* renamed from: b */
    public boolean f141489b;

    /* renamed from: c */
    public final AbstractC89244h f141490c = C89250i.m154773a((AbstractC89171a) C62349f.f141501a);

    /* renamed from: d */
    private final AbstractC89244h f141491d = C89250i.m154773a((AbstractC89171a) C62344a.f141496a);

    /* renamed from: e */
    private final AbstractC89244h f141492e = C89250i.m154773a((AbstractC89171a) C62345b.f141497a);

    /* renamed from: f */
    private final AbstractC89244h f141493f = C89250i.m154773a((AbstractC89171a) C62348e.f141500a);

    /* renamed from: g */
    private final AbstractC89244h f141494g = C89250i.m154773a((AbstractC89171a) C62347d.f141499a);

    /* renamed from: h */
    private final AbstractC89244h f141495h = C89250i.m154773a((AbstractC89171a) C62346c.f141498a);

    static {
        Covode.recordClassIndex(73129);
    }

    /* renamed from: j */
    private final C33943c<C61631f> mo100354j() {
        return (C33943c) this.f141491d.getValue();
    }

    /* renamed from: a */
    public void mo100340a(C61865a aVar) {
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: a */
    public void mo100341a(C61865a aVar, String str) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
    }

    /* renamed from: c */
    public final C33943c<C89378p<Integer, Integer>> mo100344c() {
        return (C33943c) this.f141492e.getValue();
    }

    /* renamed from: d */
    public final Set<String> mo100345d() {
        return (Set) this.f141493f.getValue();
    }

    /* renamed from: e */
    public final C33943c<Boolean> mo100346e() {
        return (C33943c) this.f141494g.getValue();
    }

    /* renamed from: g */
    public final Set<String> mo100348g() {
        return (Set) this.f141495h.getValue();
    }

    /* renamed from: h */
    public EnumC56508r mo100349h() {
        return EnumC56508r.GONE;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM$a */
    static final class C62344a extends AbstractC89220m implements AbstractC89171a<C33943c<C61631f>> {

        /* renamed from: a */
        public static final C62344a f141496a = new C62344a();

        static {
            Covode.recordClassIndex(73130);
        }

        C62344a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<C61631f> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM$b */
    static final class C62345b extends AbstractC89220m implements AbstractC89171a<C33943c<C89378p<? extends Integer, ? extends Integer>>> {

        /* renamed from: a */
        public static final C62345b f141497a = new C62345b();

        static {
            Covode.recordClassIndex(73131);
        }

        C62345b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<C89378p<? extends Integer, ? extends Integer>> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM$c */
    static final class C62346c extends AbstractC89220m implements AbstractC89171a<Set<String>> {

        /* renamed from: a */
        public static final C62346c f141498a = new C62346c();

        static {
            Covode.recordClassIndex(73132);
        }

        C62346c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM$d */
    static final class C62347d extends AbstractC89220m implements AbstractC89171a<C33943c<Boolean>> {

        /* renamed from: a */
        public static final C62347d f141499a = new C62347d();

        static {
            Covode.recordClassIndex(73133);
        }

        C62347d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<Boolean> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM$e */
    static final class C62348e extends AbstractC89220m implements AbstractC89171a<Set<String>> {

        /* renamed from: a */
        public static final C62348e f141500a = new C62348e();

        static {
            Covode.recordClassIndex(73134);
        }

        C62348e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM$f */
    static final class C62349f extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C62349f f141501a = new C62349f();

        static {
            Covode.recordClassIndex(73135);
        }

        C62349f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* renamed from: b */
    public final String mo100343b() {
        return C62261f.m112632a(Integer.valueOf(mo100337a()));
    }

    /* renamed from: f */
    public final C61631f mo100347f() {
        return mo100354j().getValue();
    }

    /* renamed from: a */
    public final int mo100337a() {
        C61631f value = mo100354j().getValue();
        if (value != null) {
            return value.f139899a;
        }
        return C61530a.C61532b.m111445a();
    }

    /* renamed from: i */
    public final boolean mo100350i() {
        if (mo100337a() != C61530a.C61532b.m111445a() || !C66652b.f149825a.mo105657c()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m112772a(int i) {
        if (i == C61530a.C61532b.m111445a()) {
            C61542b.m111461a(EnumC61551c.Normal, 13, 1000, C61530a.C61532b.m111445a(), 3, 44, 84, 26, 37);
            return;
        }
        C61542b.m111461a(EnumC61551c.Normal, i);
    }

    /* renamed from: a */
    public final void mo100339a(C61631f fVar) {
        C89219l.m154721d(fVar, "");
        int a = mo100337a();
        mo100354j().setValue(fVar);
        if (a != mo100337a()) {
            mo100344c().setValue(new C89378p<>(Integer.valueOf(a), Integer.valueOf(mo100337a())));
        }
    }

    /* renamed from: a */
    public final void mo100342a(String str) {
        C89219l.m154721d(str, "");
        this.f141488a = str;
    }

    /* renamed from: a */
    public final void mo100338a(BaseNotice baseNotice, AbstractC89171a<C89391z> aVar) {
        String str;
        C89219l.m154721d(aVar, "");
        if (baseNotice != null && (str = baseNotice.nid) != null && str.length() != 0 && !mo100345d().contains(baseNotice.nid)) {
            Set<String> d = mo100345d();
            String str2 = baseNotice.nid;
            C89219l.m154716b(str2, "");
            d.add(str2);
            aVar.invoke();
        }
    }
}
