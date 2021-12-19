package com.p2082ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;

/* renamed from: com.ss.android.ugc.tools.view.widget.j */
public final class C85052j {

    /* renamed from: a */
    public static AbstractC85054b f190334a;

    /* renamed from: b */
    public static final C85053a f190335b = new C85053a((byte) 0);

    /* renamed from: c */
    private final Context f190336c;

    /* renamed from: d */
    private final String f190337d;

    /* renamed from: e */
    private final int f190338e;

    /* renamed from: f */
    private final int f190339f;

    /* renamed from: com.ss.android.ugc.tools.view.widget.j$b */
    public interface AbstractC85054b {
        static {
            Covode.recordClassIndex(99075);
        }

        /* renamed from: a */
        void mo73299a(Context context, String str, int i, int i2);
    }

    static {
        Covode.recordClassIndex(99073);
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.j$a */
    public static final class C85053a {
        static {
            Covode.recordClassIndex(99074);
        }

        private C85053a() {
        }

        public /* synthetic */ C85053a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C85052j m146245a(Context context, int i, int i2) {
            String str;
            if (context != null) {
                str = context.getString(i);
            } else {
                str = null;
            }
            return m146246a(context, str, i2);
        }

        /* renamed from: b */
        public static C85052j m146247b(Context context, int i, int i2) {
            String str;
            if (context != null) {
                str = context.getString(i);
            } else {
                str = null;
            }
            return m146248b(context, str, i2);
        }

        /* renamed from: a */
        public static C85052j m146246a(Context context, String str, int i) {
            return new C85052j(context, str, i, 2, (byte) 0);
        }

        /* renamed from: b */
        public static C85052j m146248b(Context context, String str, int i) {
            return new C85052j(context, str, i, 3, (byte) 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.view.widget.j$c */
    public static final class C85055c implements AbstractC85054b {

        /* renamed from: a */
        public static final C85055c f190340a = new C85055c();

        private C85055c() {
        }

        static {
            Covode.recordClassIndex(99076);
        }

        @Override // com.p2082ss.android.ugc.tools.view.widget.C85052j.AbstractC85054b
        /* renamed from: a */
        public final void mo73299a(Context context, String str, int i, int i2) {
            if (context != null && str != null && str.length() != 0) {
                Toast makeText = Toast.makeText(context, str, i);
                if (Build.VERSION.SDK_INT == 25) {
                    C80567ic.m139657a(makeText);
                }
                makeText.show();
            }
        }
    }

    /* renamed from: a */
    public final void mo129996a() {
        String str;
        if (this.f190336c != null && (str = this.f190337d) != null && str.length() != 0) {
            AbstractC85054b bVar = f190334a;
            if (bVar == null) {
                bVar = C85055c.f190340a;
            }
            bVar.mo73299a(this.f190336c, this.f190337d, this.f190338e, this.f190339f);
        }
    }

    /* renamed from: a */
    public static final C85052j m146241a(Context context, int i) {
        return C85053a.m146245a(context, i, 0);
    }

    /* renamed from: b */
    public static final C85052j m146243b(Context context, String str) {
        return C85053a.m146248b(context, str, 0);
    }

    /* renamed from: a */
    public static final C85052j m146242a(Context context, String str) {
        return C85053a.m146246a(context, str, 0);
    }

    private C85052j(Context context, String str, int i, int i2) {
        this.f190336c = context;
        this.f190337d = str;
        this.f190338e = i;
        this.f190339f = i2;
    }

    public /* synthetic */ C85052j(Context context, String str, int i, int i2, byte b) {
        this(context, str, i, i2);
    }
}
