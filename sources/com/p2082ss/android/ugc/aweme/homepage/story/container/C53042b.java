package com.p2082ss.android.ugc.aweme.homepage.story.container;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.container.b */
public final class C53042b {

    /* renamed from: g */
    public static final C53043a f121976g = new C53043a((byte) 0);

    /* renamed from: a */
    public String f121977a;

    /* renamed from: b */
    public String f121978b;

    /* renamed from: c */
    public String f121979c;

    /* renamed from: d */
    public String f121980d;

    /* renamed from: e */
    public long f121981e;

    /* renamed from: f */
    public final AbstractC89183m<EnumC53044b, String, C89391z> f121982f;

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.b$b */
    public enum EnumC53044b {
        EnterFrom,
        EnterMethod;

        static {
            Covode.recordClassIndex(62589);
        }
    }

    static {
        Covode.recordClassIndex(62587);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.b$a */
    public static final class C53043a {
        static {
            Covode.recordClassIndex(62588);
        }

        private C53043a() {
        }

        public /* synthetic */ C53043a(byte b) {
            this();
        }
    }

    private /* synthetic */ C53042b() {
        this(null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.homepage.story.container.b$b, ? super java.lang.String, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C53042b(AbstractC89183m<? super EnumC53044b, ? super String, C89391z> mVar) {
        this.f121982f = mVar;
        this.f121977a = "homepage_hot";
        this.f121978b = "";
        this.f121979c = "";
        this.f121980d = "";
    }

    /* renamed from: a */
    public final void mo89557a(String str) {
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) str, (Object) "click_upper_left_camera") || C89219l.m154714a((Object) str, (Object) "slide_right") || C89219l.m154714a((Object) str, (Object) "click_westwindow_camera")) {
            this.f121978b = str;
        }
    }

    /* renamed from: b */
    public final void mo89558b(String str) {
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) str, (Object) "click") || C89219l.m154714a((Object) str, (Object) "slide") || C89219l.m154714a((Object) str, (Object) "auto") || C89219l.m154714a((Object) str, (Object) "publish")) {
            this.f121979c = str;
            AbstractC89183m<EnumC53044b, String, C89391z> mVar = this.f121982f;
            if (mVar != null) {
                mVar.invoke(EnumC53044b.EnterMethod, str);
            }
        }
    }

    /* renamed from: c */
    public final void mo89559c(String str) {
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) str, (Object) "click") || C89219l.m154714a((Object) str, (Object) "slide_left") || C89219l.m154714a((Object) str, (Object) "slide_up") || C89219l.m154714a((Object) str, (Object) "slide_down") || C89219l.m154714a((Object) str, (Object) "shoot") || C89219l.m154714a((Object) str, (Object) "close_publish")) {
            this.f121980d = str;
        }
    }
}
