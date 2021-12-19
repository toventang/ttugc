package com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.p2316ap.AbstractC33525c;
import com.p2082ss.android.ugc.aweme.p2316ap.C33527e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3173d.C55074a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56224g;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56198e;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger */
public final class ImUnder16Manger {

    /* renamed from: a */
    public static final IUnder16Api f128127a;

    /* renamed from: b */
    public static boolean f128128b;

    /* renamed from: c */
    public static final AbstractC33525c f128129c = C33527e.m68690a(C56181n.f128159a);

    /* renamed from: d */
    public static final AbstractC33525c f128130d = C33527e.m68690a(C56169b.f128147a);

    /* renamed from: e */
    public static final AbstractC33525c f128131e = C33527e.m68690a(C56168a.f128146a);

    /* renamed from: f */
    public static final AbstractC33525c f128132f = C33527e.m68690a(C56182o.f128160a);

    /* renamed from: g */
    public static final Keva f128133g = Keva.getRepo("disable_im_under_sixteen_repo");

    /* renamed from: h */
    public static final ConcurrentHashMap<String, CopyOnWriteArrayList<AbstractC56224g>> f128134h = new ConcurrentHashMap<>();

    /* renamed from: i */
    public static final ImUnder16Manger f128135i = new ImUnder16Manger();

    /* renamed from: j */
    private static final AbstractC89244h f128136j = C89250i.m154773a((AbstractC89171a) C56178k.f128156a);

    /* renamed from: k */
    private static final AbstractC33525c f128137k = C33527e.m68690a(C56175h.f128153a);

    /* renamed from: l */
    private static final AbstractC33525c f128138l = C33527e.m68690a(C56180m.f128158a);

    /* renamed from: m */
    private static final AbstractC33525c f128139m = C33527e.m68690a(C56179l.f128157a);

    /* renamed from: n */
    private static final AbstractC33525c f128140n = C33527e.m68690a(C56176i.f128154a);

    /* renamed from: o */
    private static final AbstractC33525c f128141o = C33527e.m68690a(C56177j.f128155a);

    /* renamed from: p */
    private static final AbstractC33525c f128142p = C33527e.m68690a(C56172e.f128150a);

    /* renamed from: q */
    private static final AbstractC33525c f128143q = C33527e.m68690a(C56183p.f128161a);

    /* renamed from: r */
    private static final AbstractC33525c f128144r = C33527e.m68690a(C56171d.f128149a);

    /* renamed from: s */
    private static final AbstractC33525c f128145s = C33527e.m68690a(C56170c.f128148a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger$IUnder16Api */
    public interface IUnder16Api {
        static {
            Covode.recordClassIndex(65973);
        }

        @AbstractC89722f(mo144276a = "im/disable/chat/notice/")
        AbstractC88403ab<C56184a> getUnder16Info();

        @AbstractC89722f(mo144276a = "im/disable/status/upload/")
        AbstractC88403ab<BaseResponse> uploadStatus(@AbstractC89736t(mo144292a = "status") int i);
    }

    /* renamed from: a */
    public static boolean m102064a() {
        return ((Boolean) f128136j.getValue()).booleanValue();
    }

    private ImUnder16Manger() {
    }

    /* renamed from: e */
    public static String m102074e() {
        return (String) f128142p.mo59628a();
    }

    /* renamed from: f */
    public static String m102077f() {
        return (String) f128143q.mo59628a();
    }

    /* renamed from: h */
    private static boolean m102081h() {
        return ((Boolean) f128138l.mo59628a()).booleanValue();
    }

    /* renamed from: i */
    private static boolean m102082i() {
        return ((Boolean) f128141o.mo59628a()).booleanValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger$a */
    static final class C56168a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C56168a f128146a = new C56168a();

        static {
            Covode.recordClassIndex(65974);
        }

        C56168a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            if (ImUnder16Manger.m102064a()) {
                return ImUnder16Manger.f128133g.getString("chat_cell_content", "");
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger$b */
    static final class C56169b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C56169b f128147a = new C56169b();

        static {
            Covode.recordClassIndex(65975);
        }

        C56169b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            if (ImUnder16Manger.m102064a()) {
                return ImUnder16Manger.f128133g.getString("chat_cell_title", "");
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger$c */
    static final class C56170c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C56170c f128148a = new C56170c();

        static {
            Covode.recordClassIndex(65976);
        }

        C56170c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            if (ImUnder16Manger.m102064a()) {
                return ImUnder16Manger.f128133g.getString("alert_content", "");
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger$d */
    static final class C56171d extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C56171d f128149a = new C56171d();

        static {
            Covode.recordClassIndex(65977);
        }

        C56171d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            if (ImUnder16Manger.m102064a()) {
                return ImUnder16Manger.f128133g.getString("alert_title", "");
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger$e */
    static final class C56172e extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C56172e f128150a = new C56172e();

        static {
            Covode.recordClassIndex(65978);
        }

        C56172e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            if (ImUnder16Manger.m102064a()) {
                return ImUnder16Manger.f128133g.getString("download_data_page_url", "");
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger$h */
    static final class C56175h extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C56175h f128153a = new C56175h();

        static {
            Covode.recordClassIndex(65981);
        }

        C56175h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (ImUnder16Manger.m102064a()) {
                z = ImUnder16Manger.f128133g.getBoolean("is_chat_function_off", false);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger$i */
    static final class C56176i extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C56176i f128154a = new C56176i();

        static {
            Covode.recordClassIndex(65982);
        }

        C56176i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (ImUnder16Manger.m102064a()) {
                z = ImUnder16Manger.f128133g.getBoolean("clear_im_chatlist", false);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger$j */
    static final class C56177j extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C56177j f128155a = new C56177j();

        static {
            Covode.recordClassIndex(65983);
        }

        C56177j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (ImUnder16Manger.m102064a()) {
                z = ImUnder16Manger.f128133g.getBoolean("is_group_chat_open", false);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger$k */
    static final class C56178k extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C56178k f128156a = new C56178k();

        static {
            Covode.recordClassIndex(65984);
        }

        C56178k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            return Boolean.valueOf(g.isLogin());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger$l */
    static final class C56179l extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C56179l f128157a = new C56179l();

        static {
            Covode.recordClassIndex(65985);
        }

        C56179l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (ImUnder16Manger.m102064a()) {
                z = ImUnder16Manger.f128133g.getBoolean("redirect_to_msg_disappear_page", false);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger$m */
    static final class C56180m extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C56180m f128158a = new C56180m();

        static {
            Covode.recordClassIndex(65986);
        }

        C56180m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (ImUnder16Manger.m102064a()) {
                z = ImUnder16Manger.f128133g.getBoolean("show_msg_privacy_entrance", true);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger$n */
    static final class C56181n extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C56181n f128159a = new C56181n();

        static {
            Covode.recordClassIndex(65987);
        }

        C56181n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (ImUnder16Manger.m102064a()) {
                z = ImUnder16Manger.f128133g.getBoolean("show_msg_disappear_chat_cell", false);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger$o */
    static final class C56182o extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        public static final C56182o f128160a = new C56182o();

        static {
            Covode.recordClassIndex(65988);
        }

        C56182o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            long j = Long.MAX_VALUE;
            if (ImUnder16Manger.m102064a()) {
                j = ImUnder16Manger.f128133g.getLong("msg_disappear_chat_cell_server_time", Long.MAX_VALUE);
            }
            return Long.valueOf(j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger$p */
    static final class C56183p extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C56183p f128161a = new C56183p();

        static {
            Covode.recordClassIndex(65989);
        }

        C56183p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            if (ImUnder16Manger.m102064a()) {
                return ImUnder16Manger.f128133g.getString("msg_disappear_page_url", "");
            }
            return "";
        }
    }

    /* renamed from: b */
    public static boolean m102067b() {
        return ((Boolean) f128137k.mo59628a()).booleanValue();
    }

    /* renamed from: c */
    public static boolean m102070c() {
        return ((Boolean) f128139m.mo59628a()).booleanValue();
    }

    /* renamed from: d */
    public static boolean m102073d() {
        return ((Boolean) f128140n.mo59628a()).booleanValue();
    }

    static {
        Covode.recordClassIndex(65972);
        Object a = RetrofitFactory.m33635a().mo28817b(C55074a.f126040b).mo28832d().mo28858a(IUnder16Api.class);
        C89219l.m154716b(a, "");
        f128127a = (IUnder16Api) a;
    }

    /* renamed from: g */
    public static void m102080g() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            Keva keva = f128133g;
            m102063a(keva.getBoolean("is_chat_function_off", false));
            m102066b(keva.getBoolean("show_msg_privacy_entrance", true));
            m102062a(keva.getString("download_data_page_url", ""));
            m102065b(keva.getString("msg_disappear_page_url", ""));
            m102068c(keva.getString("alert_title", ""));
            m102071d(keva.getString("alert_content", ""));
            m102075e(keva.getString("chat_cell_title", ""));
            m102078f(keva.getString("chat_cell_content", ""));
            m102069c(keva.getBoolean("show_msg_disappear_chat_cell", false));
            m102076e(keva.getBoolean("clear_im_chatlist", false));
            m102072d(keva.getBoolean("redirect_to_msg_disappear_page", false));
            m102079f(keva.getBoolean("is_group_chat_open", false));
            m102061a(keva.getLong("msg_disappear_chat_cell_server_time", Long.MAX_VALUE));
        } else {
            f128128b = false;
            m102063a(false);
            m102066b(true);
            m102062a("");
            m102065b("");
            m102068c("");
            m102071d("");
            m102075e("");
            m102078f("");
            m102069c(false);
            m102076e(false);
            m102072d(false);
            m102079f(false);
            m102061a(Long.MAX_VALUE);
        }
        StringBuilder sb = new StringBuilder("disable chat config updated isLogin = ");
        IAccountUserService g2 = C31575b.m65865g();
        C89219l.m154716b(g2, "");
        C56244a.m102191c("ImUnder16Manger", sb.append(g2.isLogin()).append(": {is_of = ").append(m102067b()).append("; do_ur = ").append(m102074e()).append("; ms_ur = ").append(m102077f()).append("; sh_en = ").append(m102081h()).append("; re_pa =").append(m102070c()).append("; cl_ch = ").append(m102073d()).append("}, group_open = ").append(m102082i()).toString());
    }

    /* renamed from: a */
    public static void m102062a(String str) {
        f128142p.mo59629a(str);
    }

    /* renamed from: b */
    public static void m102065b(String str) {
        f128143q.mo59629a(str);
    }

    /* renamed from: c */
    public static void m102068c(String str) {
        f128144r.mo59629a(str);
    }

    /* renamed from: d */
    public static void m102071d(String str) {
        f128145s.mo59629a(str);
    }

    /* renamed from: e */
    public static void m102075e(String str) {
        f128130d.mo59629a(str);
    }

    /* renamed from: f */
    public static void m102078f(String str) {
        f128131e.mo59629a(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger$g */
    public static final class C56174g extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        public static final C56174g f128152a = new C56174g();

        static {
            Covode.recordClassIndex(65980);
        }

        C56174g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            C56244a.m102187a("ImUnder16Manger", th2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m102061a(long j) {
        f128132f.mo59629a(Long.valueOf(j));
    }

    /* renamed from: b */
    public static void m102066b(boolean z) {
        f128138l.mo59629a(Boolean.valueOf(z));
    }

    /* renamed from: c */
    public static void m102069c(boolean z) {
        f128129c.mo59629a(Boolean.valueOf(z));
    }

    /* renamed from: d */
    public static void m102072d(boolean z) {
        f128139m.mo59629a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public static void m102063a(boolean z) {
        f128137k.mo59629a(Boolean.valueOf(z));
    }

    /* renamed from: e */
    public static void m102076e(boolean z) {
        f128140n.mo59629a(Boolean.valueOf(z));
    }

    /* renamed from: f */
    public static void m102079f(boolean z) {
        f128141o.mo59629a(Boolean.valueOf(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger$f */
    public static final class C56173f extends AbstractC89220m implements AbstractC89172b<C56184a, C89391z> {

        /* renamed from: a */
        public static final C56173f f128151a = new C56173f();

        static {
            Covode.recordClassIndex(65979);
        }

        C56173f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56184a aVar) {
            C56184a aVar2 = aVar;
            if (aVar2 != null) {
                ImUnder16Manger.f128133g.storeBoolean("is_u16_fetched", true);
                ImUnder16Manger.f128133g.storeBoolean("is_chat_function_off", aVar2.f128165d);
                ImUnder16Manger.f128133g.storeBoolean("show_msg_privacy_entrance", aVar2.f128172k);
                ImUnder16Manger.f128133g.storeString("download_data_page_url", aVar2.f128166e);
                ImUnder16Manger.f128133g.storeString("msg_disappear_page_url", aVar2.f128167f);
                ImUnder16Manger.f128133g.storeString("alert_title", aVar2.f128168g);
                ImUnder16Manger.f128133g.storeString("alert_content", aVar2.f128169h);
                ImUnder16Manger.f128133g.storeString("chat_cell_title", aVar2.f128170i);
                ImUnder16Manger.f128133g.storeString("chat_cell_content", aVar2.f128171j);
                ImUnder16Manger.f128133g.storeBoolean("show_msg_disappear_chat_cell", aVar2.f128173l);
                ImUnder16Manger.f128133g.storeBoolean("clear_im_chatlist", aVar2.f128175n);
                ImUnder16Manger.f128133g.storeBoolean("redirect_to_msg_disappear_page", aVar2.f128174m);
                ImUnder16Manger.f128133g.storeLong("msg_disappear_chat_cell_server_time", aVar2.f128176o);
                ImUnder16Manger.f128133g.storeBoolean("is_group_chat_open", aVar2.f128177p);
                ImUnder16Manger.m102080g();
                AbstractC81915c.m141874a(new C56198e());
                C56244a.m102191c("ImUnder16Manger", "disable chat config saved : {sh_al = " + aVar2.f128164c + "; is_of = " + aVar2.f128165d + "; do_ur = " + aVar2.f128166e + "; ms_ur = " + aVar2.f128167f + "; sh_en = " + aVar2.f128172k + "; re_pa =" + aVar2.f128174m + "; cl_ch = " + aVar2.f128175n + '}');
            }
            ImUnder16Manger.f128128b = true;
            CopyOnWriteArrayList<AbstractC56224g> copyOnWriteArrayList = ImUnder16Manger.f128134h.get(C55197c.m100919b());
            if (copyOnWriteArrayList != null) {
                Iterator<T> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo91150a();
                }
            }
            return C89391z.f203057a;
        }
    }
}
