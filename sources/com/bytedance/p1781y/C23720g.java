package com.bytedance.p1781y;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.y.g */
public final class C23720g {

    /* renamed from: a */
    final ReentrantReadWriteLock f56106a = new ReentrantReadWriteLock();

    /* renamed from: b */
    public JSONObject f56107b = null;

    /* renamed from: c */
    final int f56108c;

    /* renamed from: d */
    SharedPreferences f56109d = null;

    /* renamed from: e */
    Context f56110e = null;

    /* renamed from: f */
    private int f56111f = 0;

    /* renamed from: g */
    private final String f56112g;

    static {
        Covode.recordClassIndex(27825);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo39160c() {
        return this.f56112g + "_whole";
    }

    /* renamed from: a */
    public final void mo39153a() {
        SharedPreferences sharedPreferences;
        this.f56106a.writeLock().lock();
        if (this.f56107b != null) {
            this.f56107b = new JSONObject();
        }
        if ((this.f56108c & 2) > 0 && (sharedPreferences = this.f56109d) != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.apply();
        }
        this.f56106a.writeLock().unlock();
    }

    /* renamed from: b */
    public final JSONObject mo39159b() {
        mo39156a(this.f56110e);
        this.f56106a.readLock().lock();
        JSONObject jSONObject = null;
        try {
            if (this.f56107b != null) {
                jSONObject = new JSONObject(this.f56107b.toString());
            }
        } catch (JSONException e) {
            C23712d.m44808b("Storage", e.toString());
        } catch (Throwable th) {
            this.f56106a.readLock().unlock();
            throw th;
        }
        this.f56106a.readLock().unlock();
        return jSONObject;
    }

    /* renamed from: a */
    public final long mo39152a(String str) {
        long j;
        SharedPreferences sharedPreferences;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i = 0;
        mo39156a(this.f56110e);
        if ((this.f56108c & 1) > 0) {
            this.f56106a.readLock().lock();
            JSONObject jSONObject = this.f56107b;
            if (jSONObject == null || jSONObject.isNull(str)) {
                j = 0;
            } else {
                j = this.f56107b.optLong(str);
                i = this.f56107b.length();
            }
            this.f56106a.readLock().unlock();
            if (!(i == 0 && j == 0)) {
                return j;
            }
        } else {
            j = 0;
        }
        if ((this.f56108c & 2) <= 0 || (sharedPreferences = this.f56109d) == null) {
            return j;
        }
        long j2 = sharedPreferences.getLong(str, 0);
        C23712d.m44807a("Storage", "get long from SP, key = " + str + ", retValue = " + j2);
        return j2;
    }

    /* renamed from: b */
    public final JSONArray mo39158b(String str) {
        JSONArray jSONArray;
        SharedPreferences sharedPreferences;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        mo39156a(this.f56110e);
        if ((this.f56108c & 1) > 0) {
            this.f56106a.readLock().lock();
            JSONObject jSONObject = this.f56107b;
            if (jSONObject == null || jSONObject.isNull(str)) {
                jSONArray = null;
            } else {
                jSONArray = this.f56107b.optJSONArray(str);
            }
            this.f56106a.readLock().unlock();
        } else {
            jSONArray = null;
        }
        if (jSONArray == null && (this.f56108c & 2) > 0 && (sharedPreferences = this.f56109d) != null) {
            String string = sharedPreferences.getString(str, "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    jSONArray = new JSONArray(string);
                    C23712d.m44807a("Storage", "get JSONArray from SP, key= " + str + ", retValue = " + jSONArray);
                } catch (JSONException e) {
                    C23712d.m44808b("Storage", e.toString());
                    return null;
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public final synchronized boolean mo39156a(Context context) {
        MethodCollector.m26663i(4792);
        if (this.f56111f == 2) {
            MethodCollector.m26664o(4792);
            return true;
        }
        this.f56110e = context;
        if (context == null) {
            C23712d.m44808b("Storage", "try to load local. Context is null");
            MethodCollector.m26664o(4792);
            return false;
        }
        this.f56111f = 1;
        C23712d.m44807a("Storage", "loading local settings, name = " + this.f56112g);
        if ((this.f56108c & 2) > 0) {
            SharedPreferences a = C34822d.m71158a(this.f56110e, "com.bd.vod.ST.settings." + this.f56112g, 0);
            this.f56109d = a;
            if ((this.f56108c & 1) <= 0 || a == null) {
                this.f56106a.writeLock().lock();
                if (this.f56107b == null) {
                    this.f56107b = new JSONObject();
                }
                this.f56106a.writeLock().unlock();
            } else {
                String string = a.getString(mo39160c(), "");
                if (!TextUtils.isEmpty(string)) {
                    this.f56106a.writeLock().lock();
                    try {
                        this.f56107b = new JSONObject(string);
                        this.f56106a.writeLock().unlock();
                    } catch (JSONException e) {
                        C23712d.m44808b("Storage", e.toString());
                        this.f56111f = 0;
                        this.f56106a.writeLock().unlock();
                        MethodCollector.m26664o(4792);
                        return false;
                    } catch (Throwable th) {
                        this.f56106a.writeLock().unlock();
                        MethodCollector.m26664o(4792);
                        throw th;
                    }
                }
            }
        } else {
            this.f56106a.writeLock().lock();
            if (this.f56107b == null) {
                this.f56107b = new JSONObject();
            }
            this.f56106a.writeLock().unlock();
        }
        this.f56111f = 2;
        C23712d.m44807a("Storage", "load local settings, name = " + this.f56112g);
        MethodCollector.m26664o(4792);
        return true;
    }

    public C23720g(String str, int i) {
        this.f56112g = str;
        this.f56108c = i;
    }

    /* renamed from: b */
    public final int mo39157b(String str, int i) {
        int i2;
        SharedPreferences sharedPreferences;
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        int i3 = 0;
        mo39156a(this.f56110e);
        if ((this.f56108c & 1) > 0) {
            this.f56106a.readLock().lock();
            JSONObject jSONObject = this.f56107b;
            if (jSONObject == null || jSONObject.isNull(str)) {
                i2 = i;
            } else {
                i2 = this.f56107b.optInt(str);
                i3 = this.f56107b.length();
            }
            this.f56106a.readLock().unlock();
            if (i3 != 0) {
                return i2;
            }
        } else {
            i2 = i;
        }
        if ((this.f56108c & 2) <= 0 || i2 != i || (sharedPreferences = this.f56109d) == null) {
            return i2;
        }
        int i4 = sharedPreferences.getInt(str, i);
        C23712d.m44807a("Storage", "get int from SP, key = " + str + ", retValue = " + i4);
        return i4;
    }

    /* renamed from: a */
    public final void mo39154a(String str, int i) {
        SharedPreferences sharedPreferences;
        if (!TextUtils.isEmpty(str)) {
            mo39156a(this.f56110e);
            if ((this.f56108c & 1) > 0) {
                this.f56106a.writeLock().lock();
                try {
                    JSONObject jSONObject = this.f56107b;
                    if (jSONObject != null) {
                        jSONObject.put(str, i);
                    }
                } catch (JSONException e) {
                    C23712d.m44808b("Storage", e.toString());
                } catch (Throwable th) {
                    this.f56106a.writeLock().unlock();
                    throw th;
                }
                this.f56106a.writeLock().unlock();
            }
            if ((this.f56108c & 2) > 0 && (sharedPreferences = this.f56109d) != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt(str, i);
                edit.apply();
            }
        }
    }

    /* renamed from: a */
    public final void mo39155a(String str, long j) {
        SharedPreferences sharedPreferences;
        if (!TextUtils.isEmpty(str)) {
            mo39156a(this.f56110e);
            if ((this.f56108c & 1) > 0) {
                this.f56106a.writeLock().lock();
                try {
                    JSONObject jSONObject = this.f56107b;
                    if (jSONObject != null) {
                        jSONObject.put(str, j);
                    }
                } catch (JSONException e) {
                    C23712d.m44808b("Storage", e.toString());
                } catch (Throwable th) {
                    this.f56106a.writeLock().unlock();
                    throw th;
                }
                this.f56106a.writeLock().unlock();
            }
            if ((this.f56108c & 2) > 0 && (sharedPreferences = this.f56109d) != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(str, j);
                edit.apply();
            }
        }
    }
}
