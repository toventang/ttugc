package com.bytedance.ttnet.utils;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;

/* renamed from: com.bytedance.ttnet.utils.a */
public final class C22963a {

    /* renamed from: a */
    public static volatile boolean f54311a;

    /* renamed from: b */
    private static List<C22965b> f54312b = new ArrayList();

    /* renamed from: c */
    private static ReentrantReadWriteLock f54313c;

    /* renamed from: d */
    private static Lock f54314d;

    /* renamed from: e */
    private static Lock f54315e = f54313c.writeLock();

    /* renamed from: com.bytedance.ttnet.utils.a$a */
    public static class C22964a {

        /* renamed from: a */
        public int f54316a;

        /* renamed from: b */
        public String f54317b;

        static {
            Covode.recordClassIndex(26881);
        }
    }

    static {
        Covode.recordClassIndex(26880);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        f54313c = reentrantReadWriteLock;
        f54314d = reentrantReadWriteLock.readLock();
    }

    /* renamed from: com.bytedance.ttnet.utils.a$b */
    public static class C22965b {

        /* renamed from: a */
        Pattern f54318a;

        static {
            Covode.recordClassIndex(26882);
        }

        /* renamed from: a */
        public final boolean mo37285a(String str) {
            try {
                this.f54318a = Pattern.compile(str);
                return true;
            } catch (PatternSyntaxException e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    /* renamed from: a */
    public static void m43294a(SharedPreferences sharedPreferences) {
        JSONArray jSONArray;
        int i = sharedPreferences.getInt("ttnet_response_verify_enabled", -1);
        String string = sharedPreferences.getString("ttnet_response_verify", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                jSONArray = new JSONArray(string);
            } catch (Throwable unused) {
            }
            m43293a(i, jSONArray);
        }
        jSONArray = null;
        m43293a(i, jSONArray);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static boolean m43295a(URI uri) {
        try {
            f54314d.lock();
            for (C22965b bVar : f54312b) {
                if (uri != null && !TextUtils.isEmpty(uri.getHost())) {
                    if (bVar.f54318a != null) {
                        String host = uri.getHost();
                        if (!TextUtils.isEmpty(uri.getPath())) {
                            host = host + uri.getPath();
                        }
                        if (bVar.f54318a.matcher(host).matches()) {
                            f54314d.unlock();
                            return true;
                        }
                    }
                }
            }
            f54314d.unlock();
            return false;
        } catch (Throwable th) {
            f54314d.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public static void m43293a(int i, JSONArray jSONArray) {
        if (i > 0) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    String optString = jSONArray.optString(i2);
                    if (!TextUtils.isEmpty(optString)) {
                        C22965b bVar = new C22965b();
                        if (bVar.mo37285a(optString)) {
                            arrayList.add(bVar);
                        }
                    }
                }
                try {
                    f54315e.lock();
                    f54312b = arrayList;
                } finally {
                    f54315e.unlock();
                }
            }
            f54311a = true;
            return;
        }
        f54311a = false;
    }
}
