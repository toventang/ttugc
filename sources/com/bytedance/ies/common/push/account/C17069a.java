package com.bytedance.ies.common.push.account;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.common.push.account.a */
public final class C17069a {

    /* renamed from: a */
    public Context f40624a;

    /* renamed from: b */
    private int f40625b;

    /* renamed from: c */
    private boolean f40626c;

    /* renamed from: d */
    private long f40627d;

    static {
        Covode.recordClassIndex(19526);
    }

    /* renamed from: a */
    public final String mo26966a() {
        return TextUtils.concat(this.f40624a.getPackageName(), ".AccountProvider").toString();
    }

    /* renamed from: com.bytedance.ies.common.push.account.a$a */
    public static final class C17070a {

        /* renamed from: a */
        public Context f40628a;

        /* renamed from: b */
        public int f40629b = 1;

        /* renamed from: c */
        public boolean f40630c = true;

        /* renamed from: d */
        public long f40631d = 900;

        static {
            Covode.recordClassIndex(19527);
        }

        public C17070a(Context context) {
            this.f40628a = context;
        }
    }

    private C17069a(C17070a aVar) {
        this.f40624a = aVar.f40628a;
        this.f40625b = aVar.f40629b;
        this.f40626c = aVar.f40630c;
        this.f40627d = aVar.f40631d;
    }

    public /* synthetic */ C17069a(C17070a aVar, byte b) {
        this(aVar);
    }
}
