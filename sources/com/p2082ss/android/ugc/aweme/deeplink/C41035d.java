package com.p2082ss.android.ugc.aweme.deeplink;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.d */
public final class C41035d {

    /* renamed from: g */
    public static final C41036a f95917g = new C41036a((byte) 0);

    /* renamed from: a */
    public HashMap<String, Map<String, Object>> f95918a = new HashMap<>();

    /* renamed from: b */
    public HashMap<String, Object> f95919b = new HashMap<>();

    /* renamed from: c */
    public C41058p f95920c = new C41058p();

    /* renamed from: d */
    public final Activity f95921d;

    /* renamed from: e */
    public Uri f95922e;

    /* renamed from: f */
    public final Intent f95923f;

    static {
        Covode.recordClassIndex(48905);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41035d)) {
            return false;
        }
        C41035d dVar = (C41035d) obj;
        return C89219l.m154714a(this.f95921d, dVar.f95921d) && C89219l.m154714a(this.f95922e, dVar.f95922e) && C89219l.m154714a(this.f95923f, dVar.f95923f);
    }

    public final int hashCode() {
        Activity activity = this.f95921d;
        int i = 0;
        int hashCode = (activity != null ? activity.hashCode() : 0) * 31;
        Uri uri = this.f95922e;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Intent intent = this.f95923f;
        if (intent != null) {
            i = intent.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "DeepLinkData(activity=" + this.f95921d + ", originalUri=" + this.f95922e + ", appendedIntent=" + this.f95923f + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.deeplink.d$a */
    public static final class C41036a {
        static {
            Covode.recordClassIndex(48906);
        }

        private C41036a() {
        }

        public /* synthetic */ C41036a(byte b) {
            this();
        }
    }

    public C41035d(Activity activity, Uri uri, Intent intent) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(intent, "");
        this.f95921d = activity;
        this.f95922e = uri;
        this.f95923f = intent;
    }
}
