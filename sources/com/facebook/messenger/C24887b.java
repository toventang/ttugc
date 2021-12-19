package com.facebook.messenger;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.facebook.messenger.b */
public final class C24887b {

    /* renamed from: a */
    public static final Set<String> f59070a;

    /* renamed from: b */
    public static final Set<String> f59071b;

    /* renamed from: c */
    public static final Set<String> f59072c;

    /* renamed from: d */
    public final Uri f59073d;

    /* renamed from: e */
    public final String f59074e;

    /* renamed from: f */
    public final String f59075f;

    /* renamed from: g */
    public final Uri f59076g;

    static {
        Covode.recordClassIndex(29077);
        HashSet hashSet = new HashSet();
        hashSet.add("image/*");
        hashSet.add("image/jpeg");
        hashSet.add("image/png");
        hashSet.add("image/gif");
        hashSet.add("image/webp");
        hashSet.add("video/*");
        hashSet.add("video/mp4");
        hashSet.add("audio/*");
        hashSet.add("audio/mpeg");
        f59071b = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add("content");
        hashSet2.add("android.resource");
        hashSet2.add("file");
        f59070a = Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add("http");
        hashSet3.add("https");
        f59072c = Collections.unmodifiableSet(hashSet3);
    }

    C24887b(C24888c cVar) {
        Uri uri = cVar.f59077a;
        this.f59073d = uri;
        String str = cVar.f59078b;
        this.f59074e = str;
        this.f59075f = cVar.f59079c;
        Uri uri2 = cVar.f59080d;
        this.f59076g = uri2;
        Objects.requireNonNull(uri, "Must provide non-null uri");
        Objects.requireNonNull(str, "Must provide mimeType");
        if (!f59070a.contains(uri.getScheme())) {
            throw new IllegalArgumentException("Unsupported URI scheme: " + uri.getScheme());
        } else if (!f59071b.contains(str)) {
            throw new IllegalArgumentException("Unsupported mime-type: " + str);
        } else if (uri2 != null && !f59072c.contains(uri2.getScheme())) {
            throw new IllegalArgumentException("Unsupported external uri scheme: " + uri2.getScheme());
        }
    }

    /* renamed from: a */
    public static C24888c m47715a(Uri uri, String str) {
        return new C24888c(uri, str);
    }
}
