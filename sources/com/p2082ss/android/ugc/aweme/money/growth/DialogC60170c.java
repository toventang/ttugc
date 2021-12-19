package com.p2082ss.android.ugc.aweme.money.growth;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup;
import com.p2082ss.android.ugc.aweme.views.DialogC81459o;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.money.growth.c */
public final class DialogC60170c extends DialogC81459o {

    /* renamed from: c */
    public static boolean f137158c = true;

    /* renamed from: d */
    public static DialogC60170c f137159d;

    /* renamed from: e */
    public static final String f137160e = "MoneyGrowthDialog";

    /* renamed from: f */
    public static boolean f137161f;

    /* renamed from: g */
    public static final C60175a f137162g = new C60175a((byte) 0);

    /* renamed from: a */
    public boolean f137163a = true;

    /* renamed from: b */
    public boolean f137164b;

    /* renamed from: com.ss.android.ugc.aweme.money.growth.c$a */
    public static final class C60175a {
        static {
            Covode.recordClassIndex(70704);
        }

        private C60175a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.money.growth.c$a$a */
        public static final class RunnableC60176a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Context f137171a;

            /* renamed from: b */
            final /* synthetic */ UgChannelPopup f137172b;

            static {
                Covode.recordClassIndex(70705);
            }

            public RunnableC60176a(Context context, UgChannelPopup ugChannelPopup) {
                this.f137171a = context;
                this.f137172b = ugChannelPopup;
            }

            public final void run() {
                C60175a.m109665a(this.f137171a, this.f137172b);
            }
        }

        /* renamed from: a */
        private static DialogC60170c m109664a() {
            DialogC60170c cVar = DialogC60170c.f137159d;
            if (cVar == null) {
                C89219l.m154710a("dialog");
            }
            return cVar;
        }

        public /* synthetic */ C60175a(byte b) {
            this();
        }

        /* renamed from: a */
        private static void m109666a(DialogC60170c cVar) {
            C89219l.m154721d(cVar, "");
            DialogC60170c.f137159d = cVar;
        }

        /* renamed from: a */
        public static void m109665a(Context context, UgChannelPopup ugChannelPopup) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(ugChannelPopup, "");
            if (!DialogC60170c.f137161f) {
                DialogC60170c.f137161f = true;
                try {
                    m109666a(new DialogC60170c(context, ugChannelPopup));
                } catch (Exception e) {
                    e.getMessage();
                }
                m109664a().show();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.money.growth.c$b */
    public enum EnumC60177b {
        SMALL(1),
        BANNER(2);
        

        /* renamed from: b */
        private final int f137174b;

        public final int getStyle() {
            return this.f137174b;
        }

        static {
            Covode.recordClassIndex(70706);
        }

        private EnumC60177b(int i) {
            this.f137174b = i;
        }
    }

    static {
        Covode.recordClassIndex(70699);
    }

    public final void show() {
        if (this.f137163a) {
            try {
                super.show();
            } catch (Exception e) {
                e.getMessage();
            }
            try {
                if (this.f137164b) {
                    C39162r.m79460a("toast_show", new C33744d().mo59983a("toast_type", "coupon_fission").f79943a);
                }
                C60180e.f137181g.f137184b.mo97850a(2);
            } catch (C16041a unused) {
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ef, code lost:
        r2 = r0.getH5Link();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00b2 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DialogC60170c(android.content.Context r7, com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r8) {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.money.growth.DialogC60170c.<init>(android.content.Context, com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup):void");
    }
}
