package com.bytedance.frameworks.p977a.p978a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.frameworks.a.a.a */
public final class C14578a {

    /* renamed from: a */
    public static AbstractC14579a f35247a;

    /* renamed from: b */
    private static boolean f35248b;

    /* renamed from: com.bytedance.frameworks.a.a.a$a */
    public interface AbstractC14579a {
        static {
            Covode.recordClassIndex(16669);
        }

        /* renamed from: d */
        boolean mo23458d();

        /* renamed from: e */
        boolean mo23459e();

        /* renamed from: f */
        boolean mo23460f();
    }

    static {
        Covode.recordClassIndex(16668);
    }

    /* renamed from: a */
    private static String m26654a(String str, String str2) {
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
    private static void m26657a(Uri uri, Map<String, List<String>> map) {
        if (uri != null) {
            try {
                String encodedQuery = uri.getEncodedQuery();
                if (encodedQuery != null) {
                    String[] split = encodedQuery.split("&");
                    for (String str : split) {
                        int indexOf = str.indexOf("=");
                        if (indexOf >= 0) {
                            String decode = URLDecoder.decode(str.substring(0, indexOf), "UTF-8");
                            List<String> list = map.get(decode);
                            if (list == null) {
                                list = new LinkedList<>();
                            }
                            list.add(URLDecoder.decode(str.substring(indexOf + 1), "UTF-8"));
                            map.put(decode, list);
                        } else {
                            String decode2 = URLDecoder.decode(str, "UTF-8");
                            List<String> list2 = map.get(decode2);
                            if (list2 == null) {
                                list2 = new LinkedList<>();
                            }
                            list2.add("");
                            map.put(decode2, list2);
                        }
                    }
                }
            } catch (Throwable unused) {
                throw new IOException("parseUrl url is null !!!");
            }
        } else {
            throw new IOException("parseUrl url is null !!!");
        }
    }

    /* renamed from: a */
    public static String m26655a(String str, List<Pair<String, String>> list) {
        if (TextUtils.isEmpty(str) || f35247a == null || f35248b) {
            return str;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Uri parse = Uri.parse(str);
            m26657a(parse, linkedHashMap);
            LinkedList linkedList = new LinkedList();
            m26658a(linkedHashMap, linkedList, "device_id");
            m26658a(linkedHashMap, linkedList, "device_type");
            m26658a(linkedHashMap, linkedList, "device_brand");
            m26658a(linkedHashMap, linkedList, "uuid");
            m26658a(linkedHashMap, linkedList, "openudid");
            String a = m26656a((List<Pair<String, List<String>>>) linkedList, false, "UTF-8");
            if (TextUtils.isEmpty(a)) {
                return str;
            }
            byte[] bytes = a.getBytes();
            byte[] a2 = EncryptorUtil.m27092a(bytes, bytes.length);
            if (a2 == null) {
                return str;
            }
            String encodeToString = Base64.encodeToString(a2, 2);
            LinkedList linkedList2 = new LinkedList();
            if (f35247a.mo23458d()) {
                LinkedList linkedList3 = new LinkedList();
                linkedList3.add(encodeToString);
                linkedList2.add(new Pair("ss_queries", linkedList3));
            }
            if (f35247a.mo23459e() && list != null) {
                list.add(new Pair<>("X-SS-QUERIES", m26654a(encodeToString, "UTF-8")));
            }
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (entry != null) {
                        linkedList2.add(new Pair(entry.getKey(), entry.getValue()));
                    }
                }
            }
            String a3 = m26656a((List<Pair<String, List<String>>>) linkedList2, true, "UTF-8");
            String scheme = parse.getScheme();
            String host = parse.getHost();
            int port = parse.getPort();
            String path = parse.getPath();
            String fragment = parse.getFragment();
            StringBuilder sb = new StringBuilder();
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
            if (path == null || !path.startsWith("/")) {
                sb.append('/');
            }
            if (path != null) {
                sb.append(path);
            }
            if (a3 != null) {
                sb.append('?');
                sb.append(a3);
            }
            if (fragment != null) {
                sb.append('#');
                sb.append(fragment);
            }
            return Uri.parse(sb.toString()).toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: a */
    private static boolean m26658a(Map<String, List<String>> map, List<Pair<String, List<String>>> list, String str) {
        if (TextUtils.isEmpty(str) || !map.containsKey(str)) {
            return false;
        }
        list.add(new Pair<>(str, map.get(str)));
        if (f35247a.mo23460f()) {
            return true;
        }
        map.remove(str);
        return true;
    }

    /* renamed from: a */
    private static String m26656a(List<Pair<String, List<String>>> list, boolean z, String str) {
        StringBuilder sb = new StringBuilder();
        for (Pair<String, List<String>> pair : list) {
            String str2 = (String) pair.first;
            if (z) {
                str2 = m26654a((String) pair.first, str);
            }
            List<String> list2 = (List) pair.second;
            if (list2 != null && list2.size() > 0) {
                for (String str3 : list2) {
                    if (z) {
                        if (str3 != null) {
                            str3 = m26654a(str3, str);
                        } else {
                            str3 = "";
                        }
                    }
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    sb.append(str2);
                    sb.append("=");
                    sb.append(str3);
                }
            }
        }
        return sb.toString();
    }
}
