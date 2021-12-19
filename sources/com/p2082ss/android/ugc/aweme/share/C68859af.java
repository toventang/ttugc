package com.p2082ss.android.ugc.aweme.share;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.af */
public final class C68859af {

    /* renamed from: i */
    public static final C68861b f153998i = new C68861b((byte) 0);

    /* renamed from: a */
    public String f153999a;

    /* renamed from: b */
    public String f154000b;

    /* renamed from: c */
    public int f154001c;

    /* renamed from: d */
    public int f154002d;

    /* renamed from: e */
    public String f154003e;

    /* renamed from: f */
    public String f154004f;

    /* renamed from: g */
    public String f154005g;

    /* renamed from: h */
    public String f154006h;

    static {
        Covode.recordClassIndex(81160);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.af$b */
    public static final class C68861b {
        static {
            Covode.recordClassIndex(81162);
        }

        private C68861b() {
        }

        public /* synthetic */ C68861b(byte b) {
            this();
        }
    }

    private C68859af() {
        this.f153999a = "";
        this.f154000b = "";
        this.f154003e = "";
        this.f154004f = "";
        this.f154005g = "";
        this.f154006h = "";
    }

    public /* synthetic */ C68859af(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.af$a */
    public static final class C68860a {

        /* renamed from: a */
        public final C68859af f154007a = new C68859af((byte) 0);

        static {
            Covode.recordClassIndex(81161);
        }

        /* renamed from: a */
        public final C68860a mo109438a(String str) {
            if (str != null) {
                this.f154007a.f153999a = str;
            }
            return this;
        }

        /* renamed from: b */
        public final C68860a mo109439b(String str) {
            if (str != null) {
                this.f154007a.f154000b = str;
            }
            return this;
        }
    }

    /* renamed from: a */
    public final Bundle mo109437a(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        bundle.putString("tab_name", this.f153999a);
        bundle.putString("impr_id", this.f154000b);
        bundle.putInt("screen_orientation", this.f154001c);
        bundle.putInt("video_share_page_type", this.f154002d);
        String str = this.f154003e;
        if (!(str == null || str.length() == 0)) {
            bundle.putString("search_id", this.f154003e);
        }
        String str2 = this.f154004f;
        if (!(str2 == null || str2.length() == 0)) {
            bundle.putString("search_result_id", this.f154004f);
        }
        String str3 = this.f154005g;
        if (!(str3 == null || str3.length() == 0)) {
            bundle.putString("tag_id", this.f154005g);
        }
        String str4 = this.f154006h;
        if (!(str4 == null || str4.length() == 0)) {
            bundle.putString("extra_parent_tag_id", this.f154006h);
        }
        return bundle;
    }
}
