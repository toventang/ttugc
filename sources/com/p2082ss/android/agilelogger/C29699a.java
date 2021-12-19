package com.p2082ss.android.agilelogger;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.agilelogger.p2119c.C29720a;

/* renamed from: com.ss.android.agilelogger.a */
public class C29699a {

    /* renamed from: a */
    public Context f70852a;

    /* renamed from: b */
    public int f70853b;

    /* renamed from: c */
    public int f70854c;

    /* renamed from: d */
    public int f70855d;

    /* renamed from: e */
    public String f70856e;

    /* renamed from: f */
    public String f70857f;

    /* renamed from: g */
    public boolean f70858g;

    /* renamed from: h */
    public boolean f70859h;

    /* renamed from: i */
    public int f70860i;

    /* renamed from: j */
    public String f70861j;

    /* renamed from: k */
    public boolean f70862k;

    /* renamed from: l */
    public boolean f70863l;

    static {
        Covode.recordClassIndex(36096);
    }

    private C29699a() {
    }

    /* renamed from: com.ss.android.agilelogger.a$a */
    public static class C29700a {

        /* renamed from: a */
        public int f70864a = 20971520;

        /* renamed from: b */
        public int f70865b = 2097152;

        /* renamed from: c */
        public String f70866c;

        /* renamed from: d */
        public boolean f70867d;

        /* renamed from: e */
        private Context f70868e;

        /* renamed from: f */
        private int f70869f = 14;

        /* renamed from: g */
        private String f70870g;

        /* renamed from: h */
        private boolean f70871h = true;

        /* renamed from: i */
        private boolean f70872i = true;

        /* renamed from: j */
        private int f70873j = 3;

        /* renamed from: k */
        private String f70874k = "fecbb32b759120b672045f74edc41d159b6a426ffc863b9e0be9ad4be12824546f549959b838993a430344f15197221e87bd362298814c75f5068148b980306f";

        /* renamed from: l */
        private boolean f70875l = true;

        static {
            Covode.recordClassIndex(36097);
        }

        /* renamed from: a */
        public final C29699a mo51949a() {
            String str;
            String str2;
            C29699a aVar = new C29699a((byte) 0);
            aVar.f70852a = this.f70868e;
            aVar.f70853b = this.f70869f;
            aVar.f70854c = this.f70864a;
            aVar.f70855d = this.f70865b;
            if (TextUtils.isEmpty(this.f70870g)) {
                str = C29720a.m59891b(this.f70868e);
            } else {
                str = this.f70870g;
            }
            aVar.f70856e = str;
            if (TextUtils.isEmpty(this.f70866c)) {
                str2 = C29720a.m59890a(this.f70868e).getAbsolutePath();
            } else {
                str2 = this.f70866c;
            }
            aVar.f70857f = str2;
            aVar.f70858g = this.f70871h;
            aVar.f70859h = this.f70872i;
            aVar.f70860i = this.f70873j;
            aVar.f70861j = this.f70874k;
            aVar.f70862k = this.f70875l;
            aVar.f70863l = this.f70867d;
            return aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0027, code lost:
            if (r1 != null) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C29700a(android.content.Context r3) {
            /*
                r2 = this;
                r2.<init>()
                r0 = 14
                r2.f70869f = r0
                r0 = 20971520(0x1400000, float:3.526483E-38)
                r2.f70864a = r0
                r0 = 2097152(0x200000, float:2.938736E-39)
                r2.f70865b = r0
                r1 = 1
                r2.f70871h = r1
                r2.f70872i = r1
                r0 = 3
                r2.f70873j = r0
                java.lang.String r0 = "fecbb32b759120b672045f74edc41d159b6a426ffc863b9e0be9ad4be12824546f549959b838993a430344f15197221e87bd362298814c75f5068148b980306f"
                r2.f70874k = r0
                r2.f70875l = r1
                if (r3 == 0) goto L_0x0033
                android.content.Context r1 = r3.getApplicationContext()
                boolean r0 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132201c
                if (r0 != 0) goto L_0x002d
            L_0x0027:
                if (r1 == 0) goto L_0x002a
            L_0x0029:
                r3 = r1
            L_0x002a:
                r2.f70868e = r3
                return
            L_0x002d:
                if (r1 == 0) goto L_0x0030
                goto L_0x0029
            L_0x0030:
                android.app.Application r1 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132199a
                goto L_0x0027
            L_0x0033:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r0 = "context must not be null"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.agilelogger.C29699a.C29700a.<init>(android.content.Context):void");
        }
    }

    /* synthetic */ C29699a(byte b) {
        this();
    }
}
