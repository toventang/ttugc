package com.bytedance.frameworks.baselib.network.http.p995g;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/* renamed from: com.bytedance.frameworks.baselib.network.http.g.e */
public class C14755e {

    /* renamed from: a */
    private static final String f35968a = C14755e.class.getSimpleName();

    static {
        Covode.recordClassIndex(16852);
    }

    /* renamed from: a */
    private static long m27051a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse != null) {
                return parse.getTime();
            }
            return 0;
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static boolean m27053a(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || !str.contains("~")) {
            return false;
        }
        String[] split = str.split("~");
        if (split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
            long a = m27051a(split[0]);
            long a2 = m27051a(split[1]);
            if (a > 0 && a2 > 0 && a < a2) {
                list.add(Long.valueOf(a));
                list.add(Long.valueOf(a2));
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m27052a(String str, String str2, String str3, List<Pair<String, String>> list) {
        String[] split;
        String[] split2;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || (split = str.split(str2)) == null) {
            return false;
        }
        for (int i = 0; i < split.length; i++) {
            if (!TextUtils.isEmpty(split[i]) && (split2 = split[i].trim().split(str3)) != null && split2.length == 2 && !TextUtils.isEmpty(split2[0]) && !TextUtils.isEmpty(split2[1])) {
                list.add(new Pair<>(split2[0].trim(), split2[1].trim()));
            }
        }
        if (list.size() != 0) {
            return true;
        }
        return false;
    }
}
