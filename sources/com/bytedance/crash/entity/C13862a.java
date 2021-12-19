package com.bytedance.crash.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13881i;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.entity.a */
public class C13862a {

    /* renamed from: a */
    private static final ConcurrentLinkedQueue<C13881i> f33755a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    private static final ConcurrentHashMap<Integer, C13881i> f33756b = new ConcurrentHashMap<>();

    /* renamed from: com.bytedance.crash.entity.a$a */
    public interface AbstractC13863a {
        static {
            Covode.recordClassIndex(15922);
        }

        /* renamed from: a */
        boolean mo22265a(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(15921);
    }
}
