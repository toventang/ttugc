package com.p2082ss.android.ugc.aweme.specact.popup.p3944c;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.local_test.LocalTestApi;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75062c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75063d;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75124i;
import com.p2082ss.android.ugc.aweme.specact.popup.p3943b.C75151d;
import com.p2082ss.android.ugc.aweme.specact.popup.p3943b.DialogC75162g;
import com.p2082ss.android.ugc.aweme.specact.popup.p3943b.DialogC75166h;
import com.p2082ss.android.ugc.aweme.specact.popup.p3943b.DialogC75171i;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.c.a */
public final class C75183a {

    /* renamed from: i */
    public static final AbstractC89244h f169044i = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C75185b.f169055a);

    /* renamed from: j */
    public static final C75184a f169045j = new C75184a((byte) 0);

    /* renamed from: a */
    public List<C75124i> f169046a;

    /* renamed from: b */
    public C75124i f169047b;

    /* renamed from: c */
    public C75124i f169048c;

    /* renamed from: d */
    public String f169049d = "";

    /* renamed from: e */
    public Long f169050e = 0L;

    /* renamed from: f */
    public boolean f169051f;

    /* renamed from: g */
    public int f169052g;

    /* renamed from: h */
    public boolean f169053h;

    /* renamed from: k */
    private final AbstractC89244h f169054k = C89250i.m154773a((AbstractC89171a) C75186c.f169056a);

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.c.a$a */
    public static final class C75184a {
        static {
            Covode.recordClassIndex(88060);
        }

        /* renamed from: a */
        public static C75183a m131921a() {
            return (C75183a) C75183a.f169044i.getValue();
        }

        private C75184a() {
        }

        public /* synthetic */ C75184a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.c.a$b */
    static final class C75185b extends AbstractC89220m implements AbstractC89171a<C75183a> {

        /* renamed from: a */
        public static final C75185b f169055a = new C75185b();

        static {
            Covode.recordClassIndex(88061);
        }

        C75185b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75183a invoke() {
            return new C75183a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.c.a$c */
    static final class C75186c extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C75186c f169056a = new C75186c();

        static {
            Covode.recordClassIndex(88062);
        }

        C75186c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("spec_act_popup");
        }
    }

    static {
        Covode.recordClassIndex(88059);
    }

    /* renamed from: b */
    private final void m131913b() {
        String str;
        String str2;
        C33744d dVar = new C33744d();
        C75124i iVar = this.f169048c;
        if (iVar != null) {
            str = iVar.f168883c;
        } else {
            str = null;
        }
        C33744d a = dVar.mo59983a("pop_name", str).mo59983a("result", "wrong_info");
        if (C75063d.m131826a()) {
            str2 = "feed";
        } else {
            str2 = "others";
        }
        C39162r.m79460a("pop_filtered_reason", a.mo59983a("position", str2).f79943a);
    }

    /* renamed from: a */
    public final void mo118340a() {
        List<C75124i> list = this.f169046a;
        if (!(list == null || list.isEmpty())) {
            List<C75124i> list2 = this.f169046a;
            if (list2 == null) {
                C89219l.m154715b();
            }
            for (C75124i iVar : list2) {
                if (C89219l.m154714a((Object) (String.valueOf(iVar.f168881a) + "-" + iVar.f168882b), (Object) "3-0")) {
                    this.f169047b = iVar;
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    private static void m131915c(Activity activity, C75124i iVar) {
        C75151d.m131904b(activity, iVar);
    }

    /* renamed from: b */
    private static void m131914b(Activity activity, C75124i iVar) {
        new DialogC75166h(activity, iVar).show();
    }

    /* renamed from: d */
    private static void m131916d(Activity activity, C75124i iVar) {
        new DialogC75171i(activity, iVar).show();
    }

    /* renamed from: e */
    private static void m131917e(Activity activity, C75124i iVar) {
        new DialogC75162g(activity, iVar).show();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo118342a(Activity activity, C75124i iVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(iVar, "");
        String str = String.valueOf(iVar.f168881a) + "-" + iVar.f168882b;
        this.f169049d = str;
        int hashCode = str.hashCode();
        switch (hashCode) {
            case 48532:
                if (str.equals("1-0")) {
                    m131914b(activity, iVar);
                    break;
                }
                m131913b();
                break;
            case 49493:
                if (str.equals("2-0")) {
                    m131917e(activity, iVar);
                    break;
                }
                m131913b();
                break;
            case 51415:
                if (str.equals("4-0")) {
                    m131916d(activity, iVar);
                    break;
                }
                m131913b();
                break;
            case 53337:
                if (str.equals("6-0")) {
                    m131915c(activity, iVar);
                    break;
                }
                m131913b();
                break;
            default:
                switch (hashCode) {
                    case 52377:
                        if (str.equals("5-1")) {
                            C75151d.m131905c(activity, iVar);
                            break;
                        }
                        m131913b();
                        break;
                    case 52378:
                        if (str.equals("5-2")) {
                            C75151d.m131907e(activity, iVar);
                            break;
                        }
                        m131913b();
                        break;
                    case 52379:
                        if (str.equals("5-3")) {
                            C75151d.m131906d(activity, iVar);
                            break;
                        }
                        m131913b();
                        break;
                    case 52380:
                        if (str.equals("5-4")) {
                            C75151d.m131903a(activity, iVar);
                            break;
                        }
                        m131913b();
                        break;
                    case 52381:
                        if (str.equals("5-5")) {
                            C75151d.m131908f(activity, iVar);
                            break;
                        }
                        m131913b();
                        break;
                    default:
                        m131913b();
                        break;
                }
        }
        this.f169051f = true;
    }

    /* renamed from: a */
    public final void mo118341a(Activity activity, Aweme aweme) {
        if (this.f169048c == null) {
            LocalTestApi localTestApi = C58939a.C58940a.f134171a.f134170a;
            C89219l.m154716b(localTestApi, "");
            localTestApi.getSpecActDebugService().mo106976a("SpecPopup", "highestPopup is null, return");
            return;
        }
        String str = "feed";
        String str2 = null;
        if (C75062c.m131824a(aweme)) {
            LocalTestApi localTestApi2 = C58939a.C58940a.f134171a.f134170a;
            C89219l.m154716b(localTestApi2, "");
            localTestApi2.getSpecActDebugService().mo106976a("SpecPopup", "aweme is AD, return");
            C33744d dVar = new C33744d();
            C75124i iVar = this.f169048c;
            if (iVar != null) {
                str2 = iVar.f168883c;
            }
            C33744d a = dVar.mo59983a("pop_name", str2).mo59983a("result", "popup_occupied");
            if (!C75063d.m131826a()) {
                str = "others";
            }
            C39162r.m79460a("pop_filtered_reason", a.mo59983a("position", str).f79943a);
        } else if (C75062c.m131825b(aweme)) {
            LocalTestApi localTestApi3 = C58939a.C58940a.f134171a.f134170a;
            C89219l.m154716b(localTestApi3, "");
            localTestApi3.getSpecActDebugService().mo106976a("SpecPopup", "aweme is live, return");
            C33744d dVar2 = new C33744d();
            C75124i iVar2 = this.f169048c;
            if (iVar2 != null) {
                str2 = iVar2.f168883c;
            }
            C33744d a2 = dVar2.mo59983a("pop_name", str2).mo59983a("result", "popup_occupied");
            if (!C75063d.m131826a()) {
                str = "others";
            }
            C39162r.m79460a("pop_filtered_reason", a2.mo59983a("position", str).f79943a);
        } else if (this.f169051f) {
            LocalTestApi localTestApi4 = C58939a.C58940a.f134171a.f134170a;
            C89219l.m154716b(localTestApi4, "");
            localTestApi4.getSpecActDebugService().mo106976a("SpecPopup", "this cold launch has popped, so can not pop again");
            if (!this.f169053h) {
                C33744d dVar3 = new C33744d();
                C75124i iVar3 = this.f169048c;
                if (iVar3 != null) {
                    str2 = iVar3.f168883c;
                }
                C33744d a3 = dVar3.mo59983a("pop_name", str2).mo59983a("result", "have_popped");
                if (!C75063d.m131826a()) {
                    str = "others";
                }
                C39162r.m79460a("pop_filtered_reason", a3.mo59983a("position", str).f79943a);
                this.f169053h = true;
            }
        } else if (this.f169052g > 0) {
            LocalTestApi localTestApi5 = C58939a.C58940a.f134171a.f134170a;
            C89219l.m154716b(localTestApi5, "");
            localTestApi5.getSpecActDebugService().mo106976a("SpecPopup", "when launch, there are some more important dialog showing, so return");
            C33744d dVar4 = new C33744d();
            C75124i iVar4 = this.f169048c;
            if (iVar4 != null) {
                str2 = iVar4.f168883c;
            }
            C33744d a4 = dVar4.mo59983a("pop_name", str2).mo59983a("result", "popup_occupied");
            if (!C75063d.m131826a()) {
                str = "others";
            }
            C39162r.m79460a("pop_filtered_reason", a4.mo59983a("position", str).f79943a);
        } else if (activity == null || !C75063d.m131826a()) {
            C33744d dVar5 = new C33744d();
            C75124i iVar5 = this.f169048c;
            if (iVar5 != null) {
                str2 = iVar5.f168883c;
            }
            C39162r.m79460a("pop_filtered_reason", dVar5.mo59983a("pop_name", str2).mo59983a("result", "not_in_feed").mo59983a("position", "others").f79943a);
        } else {
            C75124i iVar6 = this.f169048c;
            if (iVar6 == null) {
                C89219l.m154715b();
            }
            mo118342a(activity, iVar6);
        }
    }
}
