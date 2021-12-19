package com.p2082ss.android.ugc.aweme.i18n.language.i18n;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.i18n.a */
public final class C53452a implements AbstractC58069b {

    /* renamed from: a */
    public String f122677a;

    /* renamed from: b */
    public String f122678b;

    /* renamed from: c */
    private String f122679c;

    /* renamed from: d */
    private Locale f122680d;

    /* renamed from: e */
    private String[] f122681e;

    /* renamed from: f */
    private String f122682f;

    /* renamed from: g */
    private String f122683g;

    static {
        Covode.recordClassIndex(63022);
    }

    @Override // com.p2082ss.android.ugc.aweme.language.AbstractC58069b
    /* renamed from: a */
    public final String mo90017a() {
        return this.f122679c;
    }

    @Override // com.p2082ss.android.ugc.aweme.language.AbstractC58069b
    /* renamed from: b */
    public final String mo90018b() {
        return this.f122677a;
    }

    @Override // com.p2082ss.android.ugc.aweme.language.AbstractC58069b
    /* renamed from: e */
    public final String mo90021e() {
        return this.f122682f;
    }

    @Override // com.p2082ss.android.ugc.aweme.language.AbstractC58069b
    /* renamed from: f */
    public final String mo90022f() {
        return this.f122683g;
    }

    @Override // com.p2082ss.android.ugc.aweme.language.AbstractC58069b
    /* renamed from: c */
    public final Locale mo90019c() {
        if (this.f122680d == null) {
            this.f122680d = new Locale(this.f122677a, this.f122678b);
        }
        return this.f122680d;
    }

    @Override // com.p2082ss.android.ugc.aweme.language.AbstractC58069b
    /* renamed from: d */
    public final String[] mo90020d() {
        if (this.f122681e == null) {
            this.f122681e = new String[]{"chat_merge", "instagram", "instagram_story", "facebook", "facebook_lite", "messenger", "messenger_lite", "whatsapp", "sms", "snapchat", "email", "twitter", "line", "kakaotalk", "zalo", "band", "naver_blog", "naver_cafe", "kakao_story", "vk", "viber", "copy", "qr_code", "more"};
        }
        return this.f122681e;
    }

    public C53452a(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, str2);
    }

    public C53452a(String str, String str2, String str3, String str4, String str5) {
        this.f122679c = str;
        this.f122677a = str2;
        this.f122678b = str3;
        this.f122682f = str4;
        this.f122683g = str5;
    }
}
