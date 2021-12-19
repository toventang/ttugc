package com.p2082ss.avframework.livestreamv2.utils;

import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* renamed from: com.ss.avframework.livestreamv2.utils.UrlUtils */
public class UrlUtils {
    static {
        Covode.recordClassIndex(100629);
    }

    public static String DecodeUrl(String str) {
        try {
            int lastIndexOf = str.lastIndexOf(47) + 1;
            String substring = str.substring(lastIndexOf);
            if (substring.contains("%")) {
                substring = URLDecoder.decode(substring);
            }
            return str.substring(0, lastIndexOf) + substring;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String EncodeUrl(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("/");
        String str2 = new String();
        if (split != null && split.length >= 2) {
            try {
                str2 = URLEncoder.encode(split[split.length - 1], "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length - 1; i++) {
            sb.append(split[i]).append("/");
        }
        sb.append(str2);
        return sb.toString();
    }

    public static String AddParam(String str, String str2, String str3) {
        try {
            int length = str.length();
            String str4 = "";
            if (str.lastIndexOf("?") >= 0) {
                length = str.lastIndexOf("?") + 1;
                String[] split = str.substring(length).split("&");
                boolean z = false;
                for (String str5 : split) {
                    String[] split2 = str5.split("=");
                    if (split2.length != 2) {
                        str4 = str4 + str5 + "&";
                    } else {
                        if (split2[0].equals(str2)) {
                            split2[1] = str3;
                            z = true;
                        }
                        str4 = str4 + split2[0] + "=" + split2[1] + "&";
                    }
                }
                if (!z) {
                    str4 = str4 + str2 + "=" + str3;
                }
                if (str4.endsWith("&")) {
                    str4 = str4.substring(0, str4.length() - 1);
                }
            } else if (str.toLowerCase().lastIndexOf("%3f") >= 0) {
                length = str.toLowerCase().lastIndexOf("%3f") + 3;
                String[] split3 = str.substring(length).split("%26");
                boolean z2 = false;
                for (String str6 : split3) {
                    String[] split4 = str6.split("(%3d|%3D)");
                    if (split4.length != 2) {
                        str4 = str4 + str6 + "%26";
                    } else {
                        if (split4[0].equals(str2)) {
                            split4[1] = str3;
                            z2 = true;
                        }
                        str4 = str4 + split4[0] + "%3d" + split4[1] + "%26";
                    }
                }
                if (!z2) {
                    str4 = str4 + str2 + "%3d" + str3;
                }
                if (str4.endsWith("%26")) {
                    str4 = str4.substring(0, str4.length() - 3);
                }
            } else {
                str4 = str4 + "?" + str2 + "=" + str3;
            }
            return str.substring(0, length) + str4;
        } catch (Exception unused) {
            return str;
        }
    }
}
