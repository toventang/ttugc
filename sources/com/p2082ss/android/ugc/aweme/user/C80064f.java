package com.p2082ss.android.ugc.aweme.user;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.C1169aa;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import androidx.p012a.p013a.p016c.AbstractC0189a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.keva.Keva;
import com.google.gson.C27910f;
import com.google.gson.C27917g;
import com.google.gson.C28023p;
import com.google.gson.C28027t;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32835a;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.gsonopt.C52917c;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.user.C80053c;
import com.p2082ss.android.ugc.aweme.user.p4197d.C80060c;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Predicate;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.user.f */
public final class C80064f {

    /* renamed from: a */
    public static final Object f179415a = new Object();

    /* renamed from: b */
    static final C1213t<List<String>> f179416b;

    /* renamed from: c */
    public static final LiveData<List<String>> f179417c;

    /* renamed from: d */
    public static final C80064f f179418d = new C80064f();

    /* renamed from: e */
    private static final AbstractC89244h f179419e = C89250i.m154773a((AbstractC89171a) C80076e.f179449a);

    /* renamed from: f */
    private static final AbstractC89244h f179420f = C89250i.m154773a((AbstractC89171a) C80081j.f179454a);

    /* renamed from: g */
    private static final AbstractC89244h f179421g = C89250i.m154773a((AbstractC89171a) C80075d.f179448a);

    /* renamed from: h */
    private static final List<C80068c> f179422h = new ArrayList();

    /* renamed from: i */
    private static String f179423i = "";

    /* renamed from: j */
    private static String f179424j = "";

    /* renamed from: com.ss.android.ugc.aweme.user.f$a */
    public static final class C80065a {

        /* renamed from: h */
        public static final C80066a f179425h = new C80066a((byte) 0);
        @AbstractC27891c(mo46611a = "uid")

        /* renamed from: a */
        public final String f179426a;
        @AbstractC27891c(mo46611a = "session_key")

        /* renamed from: b */
        public final String f179427b;
        @AbstractC27891c(mo46611a = StringSet.name)

        /* renamed from: c */
        public final String f179428c;
        @AbstractC27891c(mo46611a = "user_verified")

        /* renamed from: d */
        public final boolean f179429d;
        @AbstractC27891c(mo46611a = "country_code")

        /* renamed from: e */
        public String f179430e;
        @AbstractC27891c(mo46611a = "sec_uid")

        /* renamed from: f */
        public String f179431f;
        @AbstractC27891c(mo46611a = "is_kids_mode")

        /* renamed from: g */
        public final boolean f179432g;

        static {
            Covode.recordClassIndex(93296);
        }

        /* renamed from: com.ss.android.ugc.aweme.user.f$a$a */
        public static final class C80066a {
            static {
                Covode.recordClassIndex(93297);
            }

            private C80066a() {
            }

            public /* synthetic */ C80066a(byte b) {
                this();
            }

            /* renamed from: a */
            public static C80065a m138837a(long j, String str, String str2, boolean z, String str3, String str4, boolean z2) {
                String str5 = "";
                C89219l.m154721d(str, str5);
                C89219l.m154721d(str2, str5);
                C89219l.m154721d(str3, str5);
                C89219l.m154721d(str4, str5);
                if (j != 0) {
                    str5 = String.valueOf(j);
                }
                return new C80065a(str5, str, str2, z, str3, str4, z2);
            }
        }

        public /* synthetic */ C80065a(String str) {
            this(str, "", "", false, "", "", false);
        }

        public C80065a(String str, String str2, String str3, boolean z, String str4, String str5, boolean z2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            C89219l.m154721d(str5, "");
            this.f179426a = str;
            this.f179427b = str2;
            this.f179428c = str3;
            this.f179429d = z;
            this.f179430e = str4;
            this.f179431f = str5;
            this.f179432g = z2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.user.f$g */
    public final /* synthetic */ class C80078g implements Predicate {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f179451a;

        static {
            Covode.recordClassIndex(93309);
        }

        C80078g(AbstractC89172b bVar) {
            this.f179451a = bVar;
        }

        @Override // java.util.function.Predicate
        public final /* synthetic */ boolean test(Object obj) {
            Object invoke = this.f179451a.invoke(obj);
            C89219l.m154716b(invoke, "");
            return ((Boolean) invoke).booleanValue();
        }
    }

    /* renamed from: a */
    public static C27910f m138813a() {
        return (C27910f) f179419e.getValue();
    }

    /* renamed from: b */
    public static SharedPreferences m138816b() {
        return (SharedPreferences) f179420f.getValue();
    }

    private C80064f() {
    }

    /* renamed from: com.ss.android.ugc.aweme.user.f$e */
    static final class C80076e extends AbstractC89220m implements AbstractC89171a<C27910f> {

        /* renamed from: a */
        public static final C80076e f179449a = new C80076e();

        static {
            Covode.recordClassIndex(93307);
        }

        C80076e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C27910f invoke() {
            return new C27910f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.f$d */
    static final class C80075d extends AbstractC89220m implements AbstractC89171a<User> {

        /* renamed from: a */
        public static final C80075d f179448a = new C80075d();

        static {
            Covode.recordClassIndex(93306);
        }

        C80075d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ User invoke() {
            User user = new User();
            user.setAllowStatus(1);
            return user;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.f$j */
    static final class C80081j extends AbstractC89220m implements AbstractC89171a<SharedPreferences> {

        /* renamed from: a */
        public static final C80081j f179454a = new C80081j();

        static {
            Covode.recordClassIndex(93312);
        }

        C80081j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SharedPreferences invoke() {
            return C34822d.m71158a(C31291a.f74991a, "aweme_user", 0);
        }
    }

    /* renamed from: g */
    public static boolean m138823g() {
        return m138816b().getBoolean("mandatory_2sv", false);
    }

    /* renamed from: h */
    public static long m138824h() {
        return m138816b().getLong("last_show_hpas_dialog_time", 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.user.f$c */
    public static final class C80068c {

        /* renamed from: a */
        public final String f179441a;

        /* renamed from: b */
        private final AbstractC89244h f179442b = C89250i.m154773a((AbstractC89171a) new C80071b(this));

        /* renamed from: c */
        private final AbstractC89244h f179443c = C89250i.m154773a((AbstractC89171a) new C80069a(this));

        /* renamed from: d */
        private final AbstractC89244h f179444d = C89250i.m154773a((AbstractC89171a) new C80073c(this));

        static {
            Covode.recordClassIndex(93299);
        }

        /* renamed from: a */
        public final C80067b<User> mo123530a() {
            return (C80067b) this.f179442b.getValue();
        }

        /* renamed from: b */
        public final C80067b<C80065a> mo123531b() {
            return (C80067b) this.f179443c.getValue();
        }

        /* renamed from: c */
        public final C80067b<C80053c> mo123532c() {
            return (C80067b) this.f179444d.getValue();
        }

        /* renamed from: com.ss.android.ugc.aweme.user.f$c$a */
        static final class C80069a extends AbstractC89220m implements AbstractC89171a<C80067b<C80065a>> {

            /* renamed from: a */
            final /* synthetic */ C80068c f179445a;

            static {
                Covode.recordClassIndex(93300);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C80069a(C80068c cVar) {
                super(0);
                this.f179445a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C80067b<C80065a> invoke() {
                return new C80067b(this.f179445a.f179441a, "account_user_info", new C80065a(this.f179445a.f179441a), new AbstractC89171a<C80065a>(this.f179445a) {
                    /* class com.p2082ss.android.ugc.aweme.user.C80064f.C80068c.C80069a.C800701 */

                    static {
                        Covode.recordClassIndex(93301);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C80065a invoke() {
                        String str = ((C80068c) this.receiver).f179441a;
                        long j = C80060c.m138797a().getLong("user_id", 0);
                        String string = C80060c.m138797a().getString("session_key", "");
                        if (string == null) {
                            string = "";
                        }
                        C89219l.m154716b(string, "");
                        String string2 = C80060c.m138797a().getString("user_name", "");
                        if (string2 == null) {
                            string2 = "";
                        }
                        C89219l.m154716b(string2, "");
                        boolean z = C80060c.m138797a().getBoolean("user_verified", false);
                        String string3 = C80060c.m138797a().getString("country_code", "");
                        if (string3 == null) {
                            string3 = "";
                        }
                        C89219l.m154716b(string3, "");
                        String string4 = C80060c.m138797a().getString("sec_uid", "");
                        if (string4 == null) {
                            string4 = "";
                        }
                        C89219l.m154716b(string4, "");
                        boolean z2 = C80060c.m138797a().getBoolean("is_kids_mode", false);
                        if (!TextUtils.equals(str, String.valueOf(j))) {
                            return null;
                        }
                        return C80065a.C80066a.m138837a(j, string, string2, z, string3, string4, z2);
                    }
                });
            }
        }

        /* renamed from: d */
        public final void mo123533d() {
            mo123530a().mo123528c();
            mo123531b().mo123528c();
            mo123532c().mo123528c();
        }

        /* renamed from: f */
        public final User mo123535f() {
            String str;
            User n = C80064f.m138829n();
            if (n != null) {
                str = n.getUid();
            } else {
                str = null;
            }
            if (C89219l.m154714a((Object) str, (Object) this.f179441a)) {
                return n;
            }
            return null;
        }

        /* renamed from: com.ss.android.ugc.aweme.user.f$c$b */
        static final class C80071b extends AbstractC89220m implements AbstractC89171a<C80067b<User>> {

            /* renamed from: a */
            final /* synthetic */ C80068c f179446a;

            static {
                Covode.recordClassIndex(93302);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C80071b(C80068c cVar) {
                super(0);
                this.f179446a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C80067b<User> invoke() {
                String str = this.f179446a.f179441a;
                String str2 = this.f179446a.f179441a;
                User user = new User();
                user.setUid(str2);
                user.setAllowStatus(1);
                return new C80067b(str, "aweme_user_info", user, new AbstractC89171a<User>(this.f179446a) {
                    /* class com.p2082ss.android.ugc.aweme.user.C80064f.C80068c.C80071b.C800721 */

                    static {
                        Covode.recordClassIndex(93303);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ User invoke() {
                        return ((C80068c) this.receiver).mo123535f();
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.user.f$c$c */
        static final class C80073c extends AbstractC89220m implements AbstractC89171a<C80067b<C80053c>> {

            /* renamed from: a */
            final /* synthetic */ C80068c f179447a;

            static {
                Covode.recordClassIndex(93304);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C80073c(C80068c cVar) {
                super(0);
                this.f179447a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C80067b<C80053c> invoke() {
                return new C80067b(this.f179447a.f179441a, "significant_user_info", new C80053c(this.f179447a.f179441a, null, null, null, null, null, 0, 126), new AbstractC89171a<C80053c>(this.f179447a) {
                    /* class com.p2082ss.android.ugc.aweme.user.C80064f.C80068c.C80073c.C800741 */

                    static {
                        Covode.recordClassIndex(93305);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C80053c invoke() {
                        User f = ((C80068c) this.receiver).mo123535f();
                        if (f != null) {
                            return C80053c.C80054a.m138788a(f);
                        }
                        return null;
                    }
                });
            }
        }

        /* renamed from: e */
        public final void mo123534e() {
            mo123530a().mo123526a((User) null);
            mo123530a().mo123527b();
            mo123531b().mo123526a((C80065a) null);
            mo123531b().mo123527b();
            mo123532c().mo123526a((C80053c) null);
            mo123532c().mo123527b();
        }

        public C80068c(String str) {
            C89219l.m154721d(str, "");
            this.f179441a = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.f$b */
    public static final class C80067b<T> {

        /* renamed from: a */
        public boolean f179433a;

        /* renamed from: b */
        public final String f179434b;

        /* renamed from: c */
        public final String f179435c;

        /* renamed from: d */
        private final Class<? extends T> f179436d;

        /* renamed from: e */
        private final String f179437e;

        /* renamed from: f */
        private ArrayList<T> f179438f = new ArrayList<>(1);

        /* renamed from: g */
        private T f179439g;

        /* renamed from: h */
        private final AbstractC89171a<T> f179440h;

        static {
            Covode.recordClassIndex(93298);
        }

        /* renamed from: d */
        public final void mo123529d() {
            SharedPreferences.Editor edit = C80064f.m138816b().edit();
            edit.putString(this.f179437e, C80064f.m138813a().mo46674b(mo123525a()));
            edit.apply();
        }

        /* renamed from: b */
        public final void mo123527b() {
            Iterator<T> it = this.f179438f.iterator();
            if (it.hasNext()) {
                T next = it.next();
                SharedPreferences.Editor edit = C80064f.m138816b().edit();
                if (next == null) {
                    edit.remove(this.f179437e);
                } else {
                    edit.putString(this.f179437e, C80064f.m138813a().mo46674b(next));
                }
                edit.commit();
            }
            this.f179438f.clear();
        }

        /* renamed from: c */
        public final void mo123528c() {
            Iterator<T> it = this.f179438f.iterator();
            if (it.hasNext()) {
                T next = it.next();
                SharedPreferences.Editor edit = C80064f.m138816b().edit();
                if (next == null) {
                    edit.remove(this.f179437e);
                } else {
                    edit.putString(this.f179437e, C80064f.m138813a().mo46674b(next));
                }
                edit.apply();
            }
            this.f179438f.clear();
        }

        /* renamed from: e */
        private final T m138840e() {
            boolean z;
            JSONObject jSONObject;
            String string = C80064f.m138816b().getString(this.f179437e, "");
            if (string == null || string.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            try {
                return C16048b.m29633a().mo25421a(true, "gson_opt_for_user_deserialize_optimize_enable", true) ? m138838a(string) : (T) C80064f.m138813a().mo46671a(string, (Type) this.f179436d);
            } catch (Exception e) {
                e.printStackTrace();
                if ((e instanceof C28027t) || (e instanceof C28023p)) {
                    return null;
                }
                if (e instanceof NullPointerException) {
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException unused) {
                        jSONObject = new JSONObject();
                    }
                    C33830n.m70668a("user_store_load_npe", jSONObject);
                    return null;
                }
                throw e;
            }
        }

        /* renamed from: a */
        public final T mo123525a() {
            if (this.f179433a) {
                return this.f179439g;
            }
            T e = m138840e();
            this.f179439g = e;
            if (e == null) {
                mo123526a((Object) this.f179440h.invoke());
                mo123527b();
            }
            this.f179433a = true;
            return this.f179439g;
        }

        /* renamed from: b */
        private final void m138839b(T t) {
            this.f179438f.clear();
            this.f179438f.add(t);
        }

        /* renamed from: a */
        public final void mo123526a(T t) {
            if (this.f179439g != t) {
                this.f179439g = t;
                m138839b(t);
                this.f179433a = true;
            }
        }

        /* renamed from: a */
        private final T m138838a(String str) {
            boolean z;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            try {
                C27910f a = C80064f.m138813a();
                C27917g gVar = new C27917g(a);
                gVar.mo46681a((Type) User.class, (Object) new C52917c(a));
                return (T) gVar.mo46682b().mo46671a(str, (Type) this.f179436d);
            } catch (C28027t e) {
                e.printStackTrace();
                return (T) C80064f.m138813a().mo46671a(str, (Type) this.f179436d);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.a<? extends T> */
        /* JADX WARN: Multi-variable type inference failed */
        public C80067b(String str, String str2, T t, AbstractC89171a<? extends T> aVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(t, "");
            C89219l.m154721d(aVar, "");
            this.f179434b = str;
            this.f179435c = str2;
            this.f179440h = aVar;
            this.f179436d = (Class<? extends T>) t.getClass();
            this.f179437e = str + '_' + str2;
        }
    }

    /* renamed from: f */
    public static String m138822f() {
        String string = m138816b().getString("mandatory_2sv_nudge_period", "");
        if (string == null) {
            return "";
        }
        return string;
    }

    /* renamed from: j */
    public static final synchronized String m138826j() {
        boolean z;
        String str;
        synchronized (C80064f.class) {
            MethodCollector.m26663i(12244);
            if (f179424j.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = f179424j;
            } else {
                str = Keva.getRepo("keva_aweme_account_user").getString("last_recorded_sec_uid", "");
                C89219l.m154716b(str, "");
            }
            f179424j = str;
            MethodCollector.m26664o(12244);
        }
        return str;
    }

    /* renamed from: l */
    public static List<String> m138827l() {
        boolean z;
        List<String> list;
        MethodCollector.m26663i(12991);
        synchronized (f179415a) {
            try {
                String string = m138816b().getString("logged_in_uid_list", "");
                if (string == null) {
                    string = "";
                }
                C89219l.m154716b(string, "");
                if (string.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    list = C89086z.INSTANCE;
                } else {
                    list = C89361p.m154915b(string, new String[]{","});
                }
            } finally {
                MethodCollector.m26664o(12991);
            }
        }
        return list;
    }

    /* renamed from: m */
    public static void m138828m() {
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        eVar.element = (T) AbstractC88979t.m154314c(CallableC80079h.f179452a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C80080i(eVar));
    }

    /* renamed from: n */
    public static User m138829n() {
        String string = m138816b().getString("user_info", "");
        try {
            if (!TextUtils.isEmpty(string)) {
                return (User) m138813a().mo46670a(string, User.class);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: o */
    private String m138830o() {
        String uid;
        long j = C34822d.m71158a(C31291a.f74991a, "com.ss.spipe_setting", 0).getLong("user_id", 0);
        if (j > 0) {
            return String.valueOf(j);
        }
        User n = m138829n();
        if (n == null || (uid = n.getUid()) == null) {
            return "0";
        }
        return uid;
    }

    /* renamed from: e */
    public final String mo123521e() {
        String string = m138816b().getString("current_foreground_uid", "");
        if (string != null && string.length() > 0) {
            return string;
        }
        if (!m138825h(m138830o())) {
            return m138830o();
        }
        User n = m138829n();
        if (n == null || n.getUid() == null) {
            return "0";
        }
        String uid = n.getUid();
        C89219l.m154716b(uid, "");
        return uid;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.user.f$h */
    public static final class CallableC80079h<V> implements Callable {

        /* renamed from: a */
        public static final CallableC80079h f179452a = new CallableC80079h();

        static {
            Covode.recordClassIndex(93310);
        }

        CallableC80079h() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            MethodCollector.m26663i(10570);
            synchronized (C80064f.f179415a) {
                try {
                    Iterator<T> it = C80064f.m138818c().iterator();
                    while (it.hasNext()) {
                        it.next().mo123533d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10570);
                    throw th;
                }
            }
            C80064f.m138816b().edit().putString("current_foreground_uid", C80064f.f179418d.mo123521e()).apply();
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(10570);
            return zVar;
        }
    }

    static {
        Covode.recordClassIndex(93295);
        C1213t<List<String>> tVar = new C1213t<>();
        tVar.postValue(m138827l());
        f179416b = tVar;
        LiveData<List<String>> a = C1169aa.m3869a(tVar, C80077f.f179450a);
        C89219l.m154716b(a, "");
        f179417c = a;
    }

    /* renamed from: c */
    public static List<C80068c> m138818c() {
        List<String> l = m138827l();
        for (T t : l) {
            Iterator<T> it = f179422h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C89219l.m154714a((Object) next.f179441a, (Object) t)) {
                    if (next != null) {
                    }
                }
            }
            f179422h.add(new C80068c(t));
        }
        List<C80068c> list = f179422h;
        C80082k kVar = new C80082k(l);
        if (Build.VERSION.SDK_INT >= 24) {
            list.removeIf(new C80078g(kVar));
        } else {
            Iterator<C80068c> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((Boolean) kVar.invoke(it2.next())).booleanValue()) {
                    it2.remove();
                }
            }
        }
        return f179422h;
    }

    /* renamed from: i */
    public final synchronized String mo123523i() {
        boolean z;
        String str;
        MethodCollector.m26663i(11963);
        boolean z2 = true;
        if (f179423i.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = f179423i;
        } else {
            String string = m138816b().getString("latest_logged_in_uid_list", "");
            if (string == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(string, "");
            if (string.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                str = m138816b().getString("latest_logged_in_uid_list", "0");
                if (str == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(str, "");
            } else {
                str = m138816b().getString("last_uid", "");
                if (str == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(str, "");
            }
        }
        f179423i = str;
        MethodCollector.m26664o(11963);
        return str;
    }

    /* renamed from: d */
    public final void mo123520d() {
        T t;
        MethodCollector.m26663i(11960);
        String e = mo123521e();
        synchronized (f179415a) {
            try {
                Iterator<T> it = m138818c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C89219l.m154714a((Object) t.f179441a, (Object) e)) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    AbstractC89277c a = C89204ab.m154669a(User.class);
                    if (C89219l.m154714a(a, C89204ab.m154669a(User.class))) {
                        if (t2.mo123530a().f179433a) {
                            t2.mo123530a().mo123525a();
                        } else {
                            t2.mo123530a().mo123525a();
                        }
                    } else if (C89219l.m154714a(a, C89204ab.m154669a(C80065a.class))) {
                        t2.mo123531b().mo123525a();
                    } else if (C89219l.m154714a(a, C89204ab.m154669a(C80053c.class))) {
                        t2.mo123532c().mo123525a();
                    }
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(11960);
                throw th;
            }
        }
        C32835a.C32836a.m67401a(mo123521e());
        MethodCollector.m26664o(11960);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009c, code lost:
        if (r1 == null) goto L_0x0032;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.profile.model.User mo123524k() {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.user.C80064f.mo123524k():com.ss.android.ugc.aweme.profile.model.User");
    }

    /* renamed from: com.ss.android.ugc.aweme.user.f$l */
    public static final class CallableC80083l<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Object f179456a;

        /* renamed from: b */
        final /* synthetic */ boolean f179457b = true;

        static {
            Covode.recordClassIndex(93314);
        }

        public CallableC80083l(Object obj) {
            this.f179456a = obj;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            T t;
            T t2;
            String str2;
            boolean z;
            MethodCollector.m26663i(13455);
            Object obj = this.f179456a;
            AbstractC89277c a = C89204ab.m154669a(C80065a.class);
            if (C89219l.m154714a(a, C89204ab.m154669a(User.class))) {
                if (obj != null) {
                    str = ((User) obj).getUid();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                    MethodCollector.m26664o(13455);
                    throw nullPointerException;
                }
            } else if (C89219l.m154714a(a, C89204ab.m154669a(C80065a.class))) {
                if (obj != null) {
                    str = ((C80065a) obj).f179426a;
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.UserStore.AccountUser");
                    MethodCollector.m26664o(13455);
                    throw nullPointerException2;
                }
            } else if (!C89219l.m154714a(a, C89204ab.m154669a(C80053c.class))) {
                str = "0";
            } else if (obj != null) {
                str = ((C80053c) obj).f179384a;
            } else {
                NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.SignificantUserInfo");
                MethodCollector.m26664o(13455);
                throw nullPointerException3;
            }
            if (str != null) {
                synchronized (C80064f.f179415a) {
                    try {
                        Iterator<T> it = C80064f.m138818c().iterator();
                        while (true) {
                            t = null;
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            if (C89219l.m154714a((Object) t2.f179441a, (Object) str)) {
                                break;
                            }
                        }
                        T t3 = t2;
                        if (t3 != null) {
                            Object obj2 = this.f179456a;
                            AbstractC89277c a2 = C89204ab.m154669a(C80065a.class);
                            if (C89219l.m154714a(a2, C89204ab.m154669a(User.class))) {
                                C80067b<User> a3 = t3.mo123530a();
                                if (obj2 != null) {
                                    a3.mo123526a((User) obj2);
                                    C80067b<C80053c> c = t3.mo123532c();
                                    User a4 = t3.mo123530a().mo123525a();
                                    if (a4 != null) {
                                        c.mo123526a(C80053c.C80054a.m138788a(a4));
                                    } else {
                                        NullPointerException nullPointerException4 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                        MethodCollector.m26664o(13455);
                                        throw nullPointerException4;
                                    }
                                } else {
                                    NullPointerException nullPointerException5 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                    MethodCollector.m26664o(13455);
                                    throw nullPointerException5;
                                }
                            } else if (C89219l.m154714a(a2, C89204ab.m154669a(C80065a.class))) {
                                C80067b<C80065a> b = t3.mo123531b();
                                if (obj2 != null) {
                                    b.mo123526a((C80065a) obj2);
                                } else {
                                    NullPointerException nullPointerException6 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.UserStore.AccountUser");
                                    MethodCollector.m26664o(13455);
                                    throw nullPointerException6;
                                }
                            } else if (C89219l.m154714a(a2, C89204ab.m154669a(C80053c.class))) {
                                C80067b<C80053c> c2 = t3.mo123532c();
                                if (obj2 != null) {
                                    c2.mo123526a((C80053c) obj2);
                                } else {
                                    NullPointerException nullPointerException7 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.SignificantUserInfo");
                                    MethodCollector.m26664o(13455);
                                    throw nullPointerException7;
                                }
                            }
                            t3.mo123533d();
                        }
                        if (t3 == null && this.f179457b) {
                            Object obj3 = this.f179456a;
                            AbstractC89277c a5 = C89204ab.m154669a(C80065a.class);
                            if (C89219l.m154714a(a5, C89204ab.m154669a(User.class))) {
                                if (obj3 != null) {
                                    str2 = ((User) obj3).getUid();
                                } else {
                                    NullPointerException nullPointerException8 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                    MethodCollector.m26664o(13455);
                                    throw nullPointerException8;
                                }
                            } else if (C89219l.m154714a(a5, C89204ab.m154669a(C80065a.class))) {
                                if (obj3 != null) {
                                    str2 = ((C80065a) obj3).f179426a;
                                } else {
                                    NullPointerException nullPointerException9 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.UserStore.AccountUser");
                                    MethodCollector.m26664o(13455);
                                    throw nullPointerException9;
                                }
                            } else if (!C89219l.m154714a(a5, C89204ab.m154669a(C80053c.class))) {
                                str2 = "0";
                            } else if (obj3 != null) {
                                str2 = ((C80053c) obj3).f179384a;
                            } else {
                                NullPointerException nullPointerException10 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.SignificantUserInfo");
                                MethodCollector.m26664o(13455);
                                throw nullPointerException10;
                            }
                            if (str2 != null && !C80064f.m138825h(str2)) {
                                List<String> l = C80064f.m138827l();
                                if (!(l instanceof Collection) || !l.isEmpty()) {
                                    Iterator<T> it2 = l.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (C89219l.m154714a((Object) it2.next(), (Object) str2)) {
                                                z = true;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                z = false;
                                if (!z) {
                                    SharedPreferences.Editor edit = C80064f.m138816b().edit();
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.addAll(C80064f.m138827l());
                                    arrayList.add(str2);
                                    edit.putString("logged_in_uid_list", C89070n.m154551a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62));
                                    edit.apply();
                                    Iterator<T> it3 = C80064f.m138818c().iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            break;
                                        }
                                        T next = it3.next();
                                        if (C89219l.m154714a((Object) next.f179441a, (Object) str2)) {
                                            t = next;
                                            break;
                                        }
                                    }
                                    T t4 = t;
                                    if (t4 != null) {
                                        AbstractC89277c a6 = C89204ab.m154669a(C80065a.class);
                                        if (C89219l.m154714a(a6, C89204ab.m154669a(User.class))) {
                                            C80067b<User> a7 = t4.mo123530a();
                                            if (obj3 != null) {
                                                a7.mo123526a((User) obj3);
                                                C80067b<C80053c> c3 = t4.mo123532c();
                                                User a8 = t4.mo123530a().mo123525a();
                                                if (a8 != null) {
                                                    c3.mo123526a(C80053c.C80054a.m138788a(a8));
                                                } else {
                                                    NullPointerException nullPointerException11 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                                    MethodCollector.m26664o(13455);
                                                    throw nullPointerException11;
                                                }
                                            } else {
                                                NullPointerException nullPointerException12 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                                MethodCollector.m26664o(13455);
                                                throw nullPointerException12;
                                            }
                                        } else if (C89219l.m154714a(a6, C89204ab.m154669a(C80065a.class))) {
                                            C80067b<C80065a> b2 = t4.mo123531b();
                                            if (obj3 != null) {
                                                b2.mo123526a((C80065a) obj3);
                                            } else {
                                                NullPointerException nullPointerException13 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.UserStore.AccountUser");
                                                MethodCollector.m26664o(13455);
                                                throw nullPointerException13;
                                            }
                                        } else if (C89219l.m154714a(a6, C89204ab.m154669a(C80053c.class))) {
                                            C80067b<C80053c> c4 = t4.mo123532c();
                                            if (obj3 != null) {
                                                c4.mo123526a((C80053c) obj3);
                                            } else {
                                                NullPointerException nullPointerException14 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.SignificantUserInfo");
                                                MethodCollector.m26664o(13455);
                                                throw nullPointerException14;
                                            }
                                        }
                                        t4.mo123533d();
                                    }
                                    C80064f.f179416b.postValue(arrayList);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(13455);
                        throw th;
                    }
                }
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(13455);
            return zVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.f$m */
    public static final class CallableC80084m<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Object f179458a;

        /* renamed from: b */
        final /* synthetic */ boolean f179459b = true;

        static {
            Covode.recordClassIndex(93315);
        }

        public CallableC80084m(Object obj) {
            this.f179458a = obj;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0023, code lost:
            if (r5 == null) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x012d, code lost:
            if (r4 == null) goto L_0x012f;
         */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 702
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.user.C80064f.CallableC80084m.call():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.f$n */
    public static final class CallableC80085n<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Object f179460a;

        /* renamed from: b */
        final /* synthetic */ boolean f179461b = true;

        static {
            Covode.recordClassIndex(93316);
        }

        public CallableC80085n(Object obj) {
            this.f179460a = obj;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            T t;
            T t2;
            String str2;
            boolean z;
            MethodCollector.m26663i(10854);
            Object obj = this.f179460a;
            AbstractC89277c a = C89204ab.m154669a(C80053c.class);
            if (C89219l.m154714a(a, C89204ab.m154669a(User.class))) {
                if (obj != null) {
                    str = ((User) obj).getUid();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                    MethodCollector.m26664o(10854);
                    throw nullPointerException;
                }
            } else if (C89219l.m154714a(a, C89204ab.m154669a(C80065a.class))) {
                if (obj != null) {
                    str = ((C80065a) obj).f179426a;
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.UserStore.AccountUser");
                    MethodCollector.m26664o(10854);
                    throw nullPointerException2;
                }
            } else if (!C89219l.m154714a(a, C89204ab.m154669a(C80053c.class))) {
                str = "0";
            } else if (obj != null) {
                str = ((C80053c) obj).f179384a;
            } else {
                NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.SignificantUserInfo");
                MethodCollector.m26664o(10854);
                throw nullPointerException3;
            }
            if (str != null) {
                synchronized (C80064f.f179415a) {
                    try {
                        Iterator<T> it = C80064f.m138818c().iterator();
                        while (true) {
                            t = null;
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            if (C89219l.m154714a((Object) t2.f179441a, (Object) str)) {
                                break;
                            }
                        }
                        T t3 = t2;
                        if (t3 != null) {
                            Object obj2 = this.f179460a;
                            AbstractC89277c a2 = C89204ab.m154669a(C80053c.class);
                            if (C89219l.m154714a(a2, C89204ab.m154669a(User.class))) {
                                C80067b<User> a3 = t3.mo123530a();
                                if (obj2 != null) {
                                    a3.mo123526a((User) obj2);
                                    C80067b<C80053c> c = t3.mo123532c();
                                    User a4 = t3.mo123530a().mo123525a();
                                    if (a4 != null) {
                                        c.mo123526a(C80053c.C80054a.m138788a(a4));
                                    } else {
                                        NullPointerException nullPointerException4 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                        MethodCollector.m26664o(10854);
                                        throw nullPointerException4;
                                    }
                                } else {
                                    NullPointerException nullPointerException5 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                    MethodCollector.m26664o(10854);
                                    throw nullPointerException5;
                                }
                            } else if (C89219l.m154714a(a2, C89204ab.m154669a(C80065a.class))) {
                                C80067b<C80065a> b = t3.mo123531b();
                                if (obj2 != null) {
                                    b.mo123526a((C80065a) obj2);
                                } else {
                                    NullPointerException nullPointerException6 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.UserStore.AccountUser");
                                    MethodCollector.m26664o(10854);
                                    throw nullPointerException6;
                                }
                            } else if (C89219l.m154714a(a2, C89204ab.m154669a(C80053c.class))) {
                                C80067b<C80053c> c2 = t3.mo123532c();
                                if (obj2 != null) {
                                    c2.mo123526a((C80053c) obj2);
                                } else {
                                    NullPointerException nullPointerException7 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.SignificantUserInfo");
                                    MethodCollector.m26664o(10854);
                                    throw nullPointerException7;
                                }
                            }
                            t3.mo123533d();
                        }
                        if (t3 == null && this.f179461b) {
                            Object obj3 = this.f179460a;
                            AbstractC89277c a5 = C89204ab.m154669a(C80053c.class);
                            if (C89219l.m154714a(a5, C89204ab.m154669a(User.class))) {
                                if (obj3 != null) {
                                    str2 = ((User) obj3).getUid();
                                } else {
                                    NullPointerException nullPointerException8 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                    MethodCollector.m26664o(10854);
                                    throw nullPointerException8;
                                }
                            } else if (C89219l.m154714a(a5, C89204ab.m154669a(C80065a.class))) {
                                if (obj3 != null) {
                                    str2 = ((C80065a) obj3).f179426a;
                                } else {
                                    NullPointerException nullPointerException9 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.UserStore.AccountUser");
                                    MethodCollector.m26664o(10854);
                                    throw nullPointerException9;
                                }
                            } else if (!C89219l.m154714a(a5, C89204ab.m154669a(C80053c.class))) {
                                str2 = "0";
                            } else if (obj3 != null) {
                                str2 = ((C80053c) obj3).f179384a;
                            } else {
                                NullPointerException nullPointerException10 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.SignificantUserInfo");
                                MethodCollector.m26664o(10854);
                                throw nullPointerException10;
                            }
                            if (str2 != null && !C80064f.m138825h(str2)) {
                                List<String> l = C80064f.m138827l();
                                if (!(l instanceof Collection) || !l.isEmpty()) {
                                    Iterator<T> it2 = l.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (C89219l.m154714a((Object) it2.next(), (Object) str2)) {
                                                z = true;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                z = false;
                                if (!z) {
                                    SharedPreferences.Editor edit = C80064f.m138816b().edit();
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.addAll(C80064f.m138827l());
                                    arrayList.add(str2);
                                    edit.putString("logged_in_uid_list", C89070n.m154551a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62));
                                    edit.apply();
                                    Iterator<T> it3 = C80064f.m138818c().iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            break;
                                        }
                                        T next = it3.next();
                                        if (C89219l.m154714a((Object) next.f179441a, (Object) str2)) {
                                            t = next;
                                            break;
                                        }
                                    }
                                    T t4 = t;
                                    if (t4 != null) {
                                        AbstractC89277c a6 = C89204ab.m154669a(C80053c.class);
                                        if (C89219l.m154714a(a6, C89204ab.m154669a(User.class))) {
                                            C80067b<User> a7 = t4.mo123530a();
                                            if (obj3 != null) {
                                                a7.mo123526a((User) obj3);
                                                C80067b<C80053c> c3 = t4.mo123532c();
                                                User a8 = t4.mo123530a().mo123525a();
                                                if (a8 != null) {
                                                    c3.mo123526a(C80053c.C80054a.m138788a(a8));
                                                } else {
                                                    NullPointerException nullPointerException11 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                                    MethodCollector.m26664o(10854);
                                                    throw nullPointerException11;
                                                }
                                            } else {
                                                NullPointerException nullPointerException12 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                                MethodCollector.m26664o(10854);
                                                throw nullPointerException12;
                                            }
                                        } else if (C89219l.m154714a(a6, C89204ab.m154669a(C80065a.class))) {
                                            C80067b<C80065a> b2 = t4.mo123531b();
                                            if (obj3 != null) {
                                                b2.mo123526a((C80065a) obj3);
                                            } else {
                                                NullPointerException nullPointerException13 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.UserStore.AccountUser");
                                                MethodCollector.m26664o(10854);
                                                throw nullPointerException13;
                                            }
                                        } else if (C89219l.m154714a(a6, C89204ab.m154669a(C80053c.class))) {
                                            C80067b<C80053c> c4 = t4.mo123532c();
                                            if (obj3 != null) {
                                                c4.mo123526a((C80053c) obj3);
                                            } else {
                                                NullPointerException nullPointerException14 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.SignificantUserInfo");
                                                MethodCollector.m26664o(10854);
                                                throw nullPointerException14;
                                            }
                                        }
                                        t4.mo123533d();
                                    }
                                    C80064f.f179416b.postValue(arrayList);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(10854);
                        throw th;
                    }
                }
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(10854);
            return zVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.f$f */
    static final class C80077f<I, O> implements AbstractC0189a {

        /* renamed from: a */
        public static final C80077f f179450a = new C80077f();

        static {
            Covode.recordClassIndex(93308);
        }

        C80077f() {
        }

        @Override // androidx.p012a.p013a.p016c.AbstractC0189a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo365a(Object obj) {
            return obj;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.user.f$i */
    public static final class C80080i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f179453a;

        static {
            Covode.recordClassIndex(93311);
        }

        C80080i(C89233z.C89238e eVar) {
            this.f179453a = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            T t = this.f179453a.element;
            if (t != null) {
                t.dispose();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.user.f$k */
    public static final class C80082k extends AbstractC89220m implements AbstractC89172b<C80068c, Boolean> {

        /* renamed from: a */
        final /* synthetic */ List f179455a;

        static {
            Covode.recordClassIndex(93313);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80082k(List list) {
            super(1);
            this.f179455a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(C80068c cVar) {
            C80068c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            return Boolean.valueOf(!this.f179455a.contains(cVar2.f179441a));
        }
    }

    /* renamed from: a */
    public static boolean m138815a(String str) {
        if (!m138825h(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m138817b(String str) {
        C89219l.m154721d(str, "");
        C32835a.C32836a.m67401a(str);
        m138816b().edit().putString("current_foreground_uid", str).apply();
    }

    /* renamed from: h */
    public static boolean m138825h(String str) {
        if (str == null || str.length() == 0 || C89219l.m154714a((Object) str, (Object) "0")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static AbstractC88412b m138814a(User user) {
        C89219l.m154721d(user, "");
        AbstractC88979t a = AbstractC88979t.m154314c(new CallableC80084m(user)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
        if (a != null) {
            return a.mo143300g();
        }
        return null;
    }

    /* renamed from: d */
    public static final synchronized void m138819d(String str) {
        synchronized (C80064f.class) {
            MethodCollector.m26663i(12364);
            C89219l.m154721d(str, "");
            if (C89219l.m154714a((Object) f179424j, (Object) str)) {
                MethodCollector.m26664o(12364);
                return;
            }
            f179424j = str;
            Keva.getRepo("keva_aweme_account_user").storeString("last_recorded_sec_uid", str);
            MethodCollector.m26664o(12364);
        }
    }

    /* renamed from: c */
    public final synchronized void mo123519c(String str) {
        MethodCollector.m26663i(12101);
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) f179423i, (Object) str)) {
            MethodCollector.m26664o(12101);
            return;
        }
        f179423i = str;
        m138816b().edit().putString("latest_logged_in_uid_list", str).apply();
        MethodCollector.m26664o(12101);
    }

    /* renamed from: e */
    public static C80065a m138820e(String str) {
        C80065a aVar;
        T t;
        MethodCollector.m26663i(12714);
        C89219l.m154721d(str, "");
        synchronized (f179415a) {
            try {
                Iterator<T> it = m138818c().iterator();
                while (true) {
                    aVar = null;
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C89219l.m154714a((Object) t.f179441a, (Object) str)) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 == null) {
                    return null;
                }
                AbstractC89277c a = C89204ab.m154669a(C80065a.class);
                if (C89219l.m154714a(a, C89204ab.m154669a(User.class))) {
                    if (t2.mo123530a().f179433a) {
                        aVar = (C80065a) t2.mo123530a().mo123525a();
                    } else {
                        aVar = (C80065a) t2.mo123530a().mo123525a();
                    }
                } else if (C89219l.m154714a(a, C89204ab.m154669a(C80065a.class))) {
                    aVar = t2.mo123531b().mo123525a();
                } else if (C89219l.m154714a(a, C89204ab.m154669a(C80053c.class))) {
                    aVar = (C80065a) t2.mo123532c().mo123525a();
                }
                MethodCollector.m26664o(12714);
                return aVar;
            } finally {
                MethodCollector.m26664o(12714);
            }
        }
    }

    /* renamed from: f */
    public static C80053c m138821f(String str) {
        C80053c cVar;
        T t;
        MethodCollector.m26663i(12819);
        C89219l.m154721d(str, "");
        synchronized (f179415a) {
            try {
                Iterator<T> it = m138818c().iterator();
                while (true) {
                    cVar = null;
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C89219l.m154714a((Object) t.f179441a, (Object) str)) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 == null) {
                    return null;
                }
                AbstractC89277c a = C89204ab.m154669a(C80053c.class);
                if (C89219l.m154714a(a, C89204ab.m154669a(User.class))) {
                    if (t2.mo123530a().f179433a) {
                        cVar = (C80053c) t2.mo123530a().mo123525a();
                    } else {
                        cVar = (C80053c) t2.mo123530a().mo123525a();
                    }
                } else if (C89219l.m154714a(a, C89204ab.m154669a(C80065a.class))) {
                    cVar = (C80053c) t2.mo123531b().mo123525a();
                } else if (C89219l.m154714a(a, C89204ab.m154669a(C80053c.class))) {
                    cVar = t2.mo123532c().mo123525a();
                }
                MethodCollector.m26664o(12819);
                return cVar;
            } finally {
                MethodCollector.m26664o(12819);
            }
        }
    }

    /* renamed from: g */
    public final void mo123522g(String str) {
        T t;
        MethodCollector.m26663i(12907);
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) str, (Object) mo123521e())) {
            m138817b("0");
        }
        synchronized (f179415a) {
            try {
                Iterator<T> it = m138818c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C89219l.m154714a((Object) t.f179441a, (Object) str)) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    t2.mo123534e();
                }
                List<C80068c> c = m138818c();
                if (c != null) {
                    C89206ad.m154680b(c).remove(t2);
                    SharedPreferences.Editor edit = m138816b().edit();
                    List<String> l = m138827l();
                    ArrayList arrayList = new ArrayList();
                    for (T t3 : l) {
                        if (!C89219l.m154714a((Object) t3, (Object) str)) {
                            arrayList.add(t3);
                        }
                    }
                    edit.putString("logged_in_uid_list", C89070n.m154551a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62)).apply();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                    MethodCollector.m26664o(12907);
                    throw nullPointerException;
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(12907);
                throw th;
            }
        }
        f179416b.postValue(m138827l());
        MethodCollector.m26664o(12907);
    }
}
