package com.bytedance.android.livesdk.dialogv2.viewmodel;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.guide.C8915c;
import com.bytedance.android.livesdk.olddialog.p597a.C9993a;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.dialogv2.viewmodel.a */
public final class C8374a {

    /* renamed from: l */
    public static final C8375a f20706l = new C8375a((byte) 0);

    /* renamed from: a */
    public Long f20707a;

    /* renamed from: b */
    public User f20708b;

    /* renamed from: c */
    public GiftDialogViewModel.EnumC10040b f20709c;

    /* renamed from: d */
    public Room f20710d;

    /* renamed from: e */
    public String f20711e;

    /* renamed from: f */
    public long f20712f;

    /* renamed from: g */
    public int f20713g;

    /* renamed from: h */
    public boolean f20714h;

    /* renamed from: i */
    public boolean f20715i;

    /* renamed from: j */
    public int f20716j;

    /* renamed from: k */
    public boolean f20717k;

    static {
        Covode.recordClassIndex(9213);
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.viewmodel.a$a */
    public static final class C8375a {

        /* renamed from: com.bytedance.android.livesdk.dialogv2.viewmodel.a$a$a */
        public static final class C8376a {

            /* renamed from: a */
            public static final C8374a f20718a = new C8374a((byte) 0);

            /* renamed from: b */
            public static final C8377a f20719b = new C8377a((byte) 0);

            /* renamed from: com.bytedance.android.livesdk.dialogv2.viewmodel.a$a$a$a */
            public static final class C8377a {
                static {
                    Covode.recordClassIndex(9216);
                }

                private C8377a() {
                }

                public /* synthetic */ C8377a(byte b) {
                    this();
                }
            }

            static {
                Covode.recordClassIndex(9215);
            }
        }

        static {
            Covode.recordClassIndex(9214);
        }

        private C8375a() {
        }

        public /* synthetic */ C8375a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo14698a() {
        this.f20712f = C9993a.m18475a(C3966y.m9669e(), "default_dialog_item");
    }

    private C8374a() {
        this.f20707a = 0L;
        this.f20709c = GiftDialogViewModel.EnumC10040b.ANCHOR;
        this.f20711e = "icon";
        this.f20714h = true;
        this.f20715i = true;
    }

    public /* synthetic */ C8374a(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo14699a(GiftDialogViewModel.EnumC10040b bVar) {
        C89219l.m154721d(bVar, "");
        this.f20709c = bVar;
    }

    /* renamed from: a */
    public final void mo14700a(String str) {
        if (!C8915c.f21976a || !C89219l.m154714a((Object) "icon", (Object) str)) {
            if (str == null) {
                str = "icon";
            }
            this.f20711e = str;
            this.f20715i = true;
            return;
        }
        this.f20711e = "gift_guide_bubble";
    }
}
