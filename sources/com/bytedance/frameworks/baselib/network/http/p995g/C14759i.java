package com.bytedance.frameworks.baselib.network.http.p995g;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.frameworks.baselib.network.http.g.i */
public final class C14759i {

    /* renamed from: a */
    public static final Pattern f35973a = Pattern.compile("(((?:(?i:http|https|rtsp|ws|wss)://(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:(([a-zA-Z0-9[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]]](?:[a-zA-Z0-9[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]]_\\-]{0,61}[a-zA-Z0-9[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]]]){0,1}\\.)+(xn\\-\\-[\\w\\-]{0,58}\\w|[a-zA-Z[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]]]{2,63})|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))))(?:\\:\\d{1,5})?)([/\\?](?:(?:[a-zA-Z0-9[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]];/\\?:@&=#~\\-\\.\\+!\\*'\\(\\),_\\$])|(?:%[a-fA-F0-9]{2}))*)?(?:\\b|$|^))");

    static {
        Covode.recordClassIndex(16856);
    }

    /* renamed from: d */
    private static boolean m27074d(String str) {
        if (str == null || str.length() <= 7 || !str.substring(0, 8).equalsIgnoreCase("https://")) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m27075e(String str) {
        if (str == null || str.length() <= 6 || !str.substring(0, 7).equalsIgnoreCase("http://")) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m27076f(String str) {
        if (str == null || str.length() <= 5 || !str.substring(0, 6).equalsIgnoreCase("wss://")) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m27077g(String str) {
        if (str == null || str.length() <= 4 || !str.substring(0, 5).equalsIgnoreCase("ws://")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static URI m27068a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException unused) {
            try {
                return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused2) {
                return m27073c(str);
            }
        }
    }

    /* renamed from: b */
    public static boolean m27072b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (m27074d(str) || m27075e(str) || m27076f(str) || m27077g(str)) {
            return f35973a.matcher(str).matches();
        }
        return false;
    }

    /* renamed from: c */
    private static URI m27073c(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            int indexOf = str.indexOf("?");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            return URI.create(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static String m27071b(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static String m27067a(Map<String, List<String>> map, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String b = m27071b(entry.getKey(), str);
            List<String> value = entry.getValue();
            if (value != null && value.size() > 0) {
                for (String str3 : value) {
                    if (str3 != null) {
                        str2 = m27071b(str3, str);
                    } else {
                        str2 = "";
                    }
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    sb.append(b);
                    if (!str2.isEmpty()) {
                        sb.append("=");
                        sb.append(str2);
                    }
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static Pair<String, String> m27066a(String str, Map<String, String> map) {
        String encodedQuery;
        if (!C13627m.m24498a(str)) {
            try {
                Uri parse = Uri.parse(str);
                StringBuilder sb = new StringBuilder();
                String scheme = parse.getScheme();
                String host = parse.getHost();
                int port = parse.getPort();
                if (host != null) {
                    if (scheme != null) {
                        sb.append(scheme);
                        sb.append("://");
                    }
                    sb.append(host);
                    if (port > 0) {
                        sb.append(':');
                        sb.append(port);
                    }
                }
                String sb2 = sb.toString();
                String encodedPath = parse.getEncodedPath();
                if (!(map == null || (encodedQuery = parse.getEncodedQuery()) == null)) {
                    String[] split = encodedQuery.split("&");
                    for (String str2 : split) {
                        int indexOf = str2.indexOf("=");
                        if (indexOf >= 0) {
                            map.put(URLDecoder.decode(str2.substring(0, indexOf), "UTF-8"), URLDecoder.decode(str2.substring(indexOf + 1), "UTF-8"));
                        } else {
                            map.put(URLDecoder.decode(str2, "UTF-8"), "");
                        }
                    }
                }
                return new Pair<>(sb2, encodedPath);
            } catch (Throwable unused) {
                throw new IOException("parseUrl url is fail !!!");
            }
        } else {
            throw new IOException("parseUrl url is null !!!");
        }
    }

    /* renamed from: b */
    public static Pair<String, String> m27070b(String str, Map<String, List<String>> map) {
        if (!C13627m.m24498a(str)) {
            try {
                Uri parse = Uri.parse(str);
                StringBuilder sb = new StringBuilder();
                String scheme = parse.getScheme();
                String host = parse.getHost();
                int port = parse.getPort();
                if (host != null) {
                    if (scheme != null) {
                        sb.append(scheme);
                        sb.append("://");
                    }
                    sb.append(host);
                    if (port > 0) {
                        sb.append(':');
                        sb.append(port);
                    }
                }
                String sb2 = sb.toString();
                String encodedPath = parse.getEncodedPath();
                String encodedQuery = parse.getEncodedQuery();
                if (encodedQuery != null) {
                    String[] split = encodedQuery.split("&");
                    for (String str2 : split) {
                        int indexOf = str2.indexOf("=");
                        if (indexOf >= 0) {
                            String decode = URLDecoder.decode(str2.substring(0, indexOf), "UTF-8");
                            List<String> list = map.get(decode);
                            if (list == null) {
                                list = new LinkedList<>();
                            }
                            list.add(URLDecoder.decode(str2.substring(indexOf + 1), "UTF-8"));
                            map.put(decode, list);
                        } else {
                            String decode2 = URLDecoder.decode(str2, "UTF-8");
                            List<String> list2 = map.get(decode2);
                            if (list2 == null) {
                                list2 = new LinkedList<>();
                            }
                            list2.add("");
                            map.put(decode2, list2);
                        }
                    }
                }
                return new Pair<>(sb2, encodedPath);
            } catch (Throwable unused) {
                throw new IOException("parseUrl url is fail !!!");
            }
        } else {
            throw new IOException("parseUrl url is null !!!");
        }
    }

    /* renamed from: a */
    public static boolean m27069a(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        int length = str.length();
        int length2 = str2.length();
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        while (i < length) {
            if (i2 < length2 && (str2.charAt(i2) == '?' || str2.charAt(i2) == str.charAt(i))) {
                i++;
                i2++;
            } else if (i2 < length2 && str2.charAt(i2) == '*') {
                i4 = i;
                i3 = i2;
                i2++;
            } else if (i3 == -1) {
                return false;
            } else {
                i2 = i3 + 1;
                i4++;
                i = i4;
            }
        }
        while (i2 < length2) {
            if (str2.charAt(i2) != '*') {
                return false;
            }
            i2++;
        }
        return true;
    }
}
