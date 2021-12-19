package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2232ac.C31366b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.IAccountService */
public interface IAccountService {

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$a */
    public interface AbstractC31271a {
        static {
            Covode.recordClassIndex(37932);
        }

        /* renamed from: a */
        C1731i<Bundle> mo57081a(Bundle bundle);

        /* renamed from: a */
        C1731i<Bundle> mo57082a(Bundle bundle, C31366b bVar);

        /* renamed from: b */
        C1731i<Bundle> mo57083b(Bundle bundle);
    }

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$b */
    public interface AbstractC31272b {
        static {
            Covode.recordClassIndex(37933);
        }

        void onAccountResult(int i, boolean z, int i2, User user);
    }

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$e */
    public interface AbstractC31275e {
        static {
            Covode.recordClassIndex(37936);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$f */
    public interface AbstractC31276f {
        static {
            Covode.recordClassIndex(37937);
        }

        /* renamed from: a */
        void mo57085a(int i, int i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$g */
    public interface AbstractC31277g {
        static {
            Covode.recordClassIndex(37938);
        }

        void onResult(int i, int i2, Object obj);
    }

    static {
        Covode.recordClassIndex(37931);
    }

    /* renamed from: a */
    void mo57064a(AbstractC31272b bVar);

    /* renamed from: b */
    String mo57065b();

    /* renamed from: b */
    void mo57066b(AbstractC31272b bVar);

    /* renamed from: c */
    IAgeGateService mo57067c();

    /* renamed from: d */
    AbstractC34881bk mo57068d();

    /* renamed from: e */
    IAccountUserService mo57069e();

    /* renamed from: f */
    AbstractC35317bv mo57070f();

    /* renamed from: g */
    AbstractC34892bo mo57071g();

    /* renamed from: h */
    AbstractC34877bj mo57072h();

    /* renamed from: i */
    AbstractC34913br mo57073i();

    /* renamed from: j */
    AbstractC34930bs mo57074j();

    /* renamed from: k */
    AbstractC34889bn mo57075k();

    /* renamed from: l */
    AbstractC35339ca mo57076l();

    /* renamed from: m */
    AbstractC35418cb mo57077m();

    /* renamed from: n */
    AbstractC34886bm mo57078n();

    /* renamed from: o */
    void mo57079o();

    /* renamed from: p */
    boolean mo57080p();

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$d */
    public static class C31274d {

        /* renamed from: a */
        public Activity f74960a;

        /* renamed from: b */
        public String f74961b;

        /* renamed from: c */
        public String f74962c;

        /* renamed from: d */
        public Bundle f74963d;

        /* renamed from: e */
        public AbstractC31277g f74964e;

        /* renamed from: f */
        public AbstractC31276f f74965f;

        /* renamed from: g */
        public boolean f74966g;

        static {
            Covode.recordClassIndex(37935);
        }

        /* renamed from: a */
        public final C31273c mo57084a() {
            return new C31273c(this, (byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$c */
    public static class C31273c {

        /* renamed from: a */
        public Activity f74953a;

        /* renamed from: b */
        public String f74954b;

        /* renamed from: c */
        public String f74955c;

        /* renamed from: d */
        public Bundle f74956d;

        /* renamed from: e */
        public AbstractC31277g f74957e;

        /* renamed from: f */
        public AbstractC31276f f74958f;

        /* renamed from: g */
        public boolean f74959g;

        static {
            Covode.recordClassIndex(37934);
        }

        private C31273c(C31274d dVar) {
            Bundle bundle;
            this.f74953a = dVar.f74960a;
            this.f74954b = dVar.f74961b;
            this.f74955c = dVar.f74962c;
            if (dVar.f74963d == null) {
                bundle = new Bundle();
            } else {
                bundle = dVar.f74963d;
            }
            this.f74956d = bundle;
            this.f74957e = dVar.f74964e;
            this.f74958f = dVar.f74965f;
            this.f74959g = dVar.f74966g;
            if (!TextUtils.isEmpty(this.f74954b)) {
                this.f74956d.putString("enter_from", this.f74954b);
            }
            if (!TextUtils.isEmpty(this.f74955c)) {
                this.f74956d.putString("enter_method", this.f74955c);
            }
        }

        /* synthetic */ C31273c(C31274d dVar, byte b) {
            this(dVar);
        }
    }
}
