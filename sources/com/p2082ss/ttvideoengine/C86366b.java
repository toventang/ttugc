package com.p2082ss.ttvideoengine;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.b */
public final class C86366b {

    /* renamed from: a */
    public static Context f193475a;

    /* renamed from: b */
    public static int f193476b = -1;

    /* renamed from: c */
    public static String f193477c;

    /* renamed from: d */
    public static String f193478d;

    /* renamed from: e */
    public static String f193479e;

    /* renamed from: f */
    public static String f193480f;

    /* renamed from: g */
    public static String f193481g;

    /* renamed from: h */
    public static int f193482h;

    /* renamed from: i */
    public static int f193483i;

    static {
        Covode.recordClassIndex(101594);
    }

    /* renamed from: a */
    public static String m148915a() {
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", Integer.valueOf(f193476b));
        hashMap.put("app_name", f193477c);
        hashMap.put("screen_width", Integer.valueOf(f193482h));
        hashMap.put("screen_height", Integer.valueOf(f193483i));
        return new JSONObject(hashMap).toString();
    }
}
