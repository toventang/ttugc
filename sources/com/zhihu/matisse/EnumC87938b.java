package com.zhihu.matisse;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.p025c.C0486b;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;
import p078c.p083d.C1762a;

/* renamed from: com.zhihu.matisse.b */
public enum EnumC87938b {
    JPEG("image/jpeg", m152948a("jpg", "jpeg")),
    PNG("image/png", m152948a("png")),
    GIF("image/gif", m152948a("gif")),
    BMP("image/x-ms-bmp", m152948a("bmp")),
    WEBP("image/webp", m152948a("webp")),
    MPEG("video/mpeg", m152948a("mpeg", "mpg")),
    MP4("video/mp4", m152948a("mp4", "m4v")),
    QUICKTIME("video/quicktime", m152948a("mov")),
    THREEGPP("video/3gpp", m152948a("3gp", "3gpp")),
    THREEGPP2("video/3gpp2", m152948a("3g2", "3gpp2")),
    MKV("video/x-matroska", m152948a("mkv")),
    WEBM("video/webm", m152948a("webm")),
    TS("video/mp2ts", m152948a("ts")),
    AVI("video/avi", m152948a("avi"));
    

    /* renamed from: a */
    private final String f199700a;

    /* renamed from: b */
    private final Set<String> f199701b;

    public final String toString() {
        return this.f199700a;
    }

    public static Set<EnumC87938b> ofAll() {
        return EnumSet.allOf(EnumC87938b.class);
    }

    public static Set<EnumC87938b> ofImage() {
        return EnumSet.of(JPEG, PNG, GIF, BMP, WEBP);
    }

    public static Set<EnumC87938b> ofVideo() {
        return EnumSet.of(MPEG, MP4, QUICKTIME, THREEGPP, THREEGPP2, MKV, WEBM, TS, AVI);
    }

    static {
        Covode.recordClassIndex(103953);
    }

    /* renamed from: a */
    private static Set<String> m152948a(String... strArr) {
        return new C0486b(Arrays.asList(strArr));
    }

    public static boolean isImage(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("image");
    }

    public static boolean isVideo(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video");
    }

    /* renamed from: of */
    public static Set<EnumC87938b> m152949of(EnumC87938b bVar, EnumC87938b... bVarArr) {
        return EnumSet.of(bVar, bVarArr);
    }

    public final boolean checkType(Context context, ContentResolver contentResolver, Uri uri) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        if (uri == null) {
            return false;
        }
        String extensionFromMimeType = singleton.getExtensionFromMimeType(contentResolver.getType(uri));
        String str = null;
        boolean z = false;
        for (String str2 : this.f199701b) {
            if (str2.equals(extensionFromMimeType)) {
                return true;
            }
            if (!z) {
                str = C1762a.m5918a(context, uri);
                if (!TextUtils.isEmpty(str)) {
                    str = str.toLowerCase(Locale.US);
                }
                z = true;
            }
            if (str != null && str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private EnumC87938b(String str, Set set) {
        this.f199700a = str;
        this.f199701b = set;
    }
}
