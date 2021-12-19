package com.p2082ss.android.ugc.aweme.profile;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.ak */
public final class C63425ak {

    /* renamed from: a */
    public String f143977a;

    /* renamed from: b */
    public String f143978b;

    /* renamed from: c */
    public String f143979c;

    /* renamed from: d */
    public String f143980d;

    /* renamed from: e */
    public String f143981e;

    /* renamed from: f */
    public String f143982f;

    /* renamed from: g */
    public String f143983g;

    /* renamed from: h */
    public String f143984h;

    /* renamed from: i */
    public String f143985i;

    /* renamed from: j */
    public String f143986j;

    /* renamed from: k */
    public String f143987k;

    /* renamed from: l */
    public String f143988l;

    /* renamed from: m */
    public String f143989m;

    /* renamed from: n */
    public String f143990n;

    /* renamed from: o */
    private boolean f143991o;

    /* renamed from: p */
    private int f143992p;

    /* renamed from: q */
    private int f143993q = -1;

    static {
        Covode.recordClassIndex(74716);
    }

    /* renamed from: a */
    public final Map<String, String> mo102037a() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f143977a)) {
            hashMap.put("nickname", this.f143977a);
        }
        String str = this.f143978b;
        if (str != null) {
            hashMap.put("signature", str);
        }
        if (!TextUtils.isEmpty(this.f143979c)) {
            hashMap.put("unique_id", this.f143979c);
        }
        if (!TextUtils.isEmpty(this.f143980d)) {
            hashMap.put("avatar_uri", this.f143980d);
        }
        if (this.f143991o) {
            hashMap.put("video_icon_virtual_URI", "");
        } else if (!TextUtils.isEmpty(this.f143981e)) {
            hashMap.put("video_icon_virtual_URI", this.f143981e);
        }
        if (!TextUtils.isEmpty(this.f143982f)) {
            hashMap.put("school_name", this.f143982f);
        }
        hashMap.put("school_type", String.valueOf(this.f143992p));
        if (!TextUtils.isEmpty(this.f143983g)) {
            hashMap.put("ins_id", this.f143983g);
        }
        if (!TextUtils.isEmpty(this.f143984h)) {
            hashMap.put("google_account", this.f143984h);
        }
        if (!TextUtils.isEmpty(this.f143985i)) {
            hashMap.put("youtube_channel_id", this.f143985i);
        }
        if (!TextUtils.isEmpty(this.f143986j)) {
            hashMap.put("youtube_channel_title", this.f143986j);
        }
        int i = this.f143993q;
        if (i != -1) {
            hashMap.put("secret", String.valueOf(i));
        }
        String str2 = this.f143987k;
        if (str2 != null) {
            hashMap.put("bio_url", str2);
        }
        String str3 = this.f143988l;
        if (str3 != null) {
            hashMap.put("bio_email", str3);
        }
        String str4 = this.f143989m;
        if (str4 != null) {
            hashMap.put("bio_phone", str4);
        }
        String str5 = this.f143990n;
        if (str5 != null) {
            hashMap.put("bio_location", str5);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo102038a(String str) {
        this.f143991o = TextUtils.isEmpty(str);
        this.f143981e = str;
    }
}
