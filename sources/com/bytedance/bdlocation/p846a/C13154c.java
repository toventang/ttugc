package com.bytedance.bdlocation.p846a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.bdlocation.a.c */
public class C13154c extends Exception {

    /* renamed from: a */
    private final String f32068a;

    /* renamed from: b */
    private final String f32069b;

    /* renamed from: c */
    private final String f32070c;

    /* renamed from: d */
    private final Map<String, String> f32071d;

    /* renamed from: e */
    private final List<Throwable> f32072e;

    /* renamed from: f */
    private C13156e f32073f;

    /* renamed from: g */
    private final int f32074g;

    static {
        Covode.recordClassIndex(15101);
    }

    public List<Throwable> getCauses() {
        return this.f32072e;
    }

    public String getDetailMessage() {
        return this.f32068a;
    }

    public C13156e getOption() {
        return this.f32073f;
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        m23678a(this, arrayList);
        return arrayList;
    }

    public String getCode() {
        if (this.f32074g == 0) {
            return this.f32070c;
        }
        for (Throwable th : getRootCauses()) {
            if (th instanceof C13154c) {
                return ((C13154c) th).getCode();
            }
        }
        return "";
    }

    public Map<String, String> getExtra() {
        if (this.f32074g == 0) {
            return this.f32071d;
        }
        HashMap hashMap = new HashMap(0);
        for (Throwable th : getRootCauses()) {
            if (th instanceof C13154c) {
                return ((C13154c) th).getExtra();
            }
        }
        return hashMap;
    }

    public String getSdkName() {
        if (this.f32074g == 0) {
            return this.f32069b;
        }
        for (Throwable th : getRootCauses()) {
            if (th instanceof C13154c) {
                return ((C13154c) th).getSdkName();
            }
        }
        return "";
    }

    public String getMessage() {
        String str = "";
        StringBuffer append = new StringBuffer(71).append(TextUtils.isEmpty(this.f32068a) ? str : "error message: " + this.f32068a + '\n').append(TextUtils.isEmpty(this.f32070c) ? str : "error code: " + this.f32070c + '\n').append(TextUtils.isEmpty(this.f32069b) ? str : "SdkName: " + this.f32069b + '\n');
        if (getExtra().size() != 0) {
            str = "error describe: " + getExtra() + '\n';
        }
        StringBuffer append2 = append.append(str);
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return append2.toString();
        }
        if (rootCauses.size() == 1) {
            append2.append("There was 1 cause:\n");
        } else {
            append2.append("There were ").append(rootCauses.size()).append(" causes:\n");
        }
        for (Throwable th : rootCauses) {
            append2.append(th.getClass().getName()).append("\n(").append(th.getMessage()).append(")\n");
        }
        return append2.toString();
    }

    public void setOption(C13156e eVar) {
        this.f32073f = eVar;
    }

    public String getExtra(String str) {
        return this.f32071d.get(str);
    }

    public C13154c(List<Throwable> list) {
        this("get location failed", "", "", new HashMap(), list, 1);
    }

    public C13154c addExtra(String str, String str2) {
        this.f32071d.put(str, str2);
        return this;
    }

    /* renamed from: a */
    private void m23678a(Throwable th, List<Throwable> list) {
        if (th instanceof C13154c) {
            for (Throwable th2 : ((C13154c) th).getCauses()) {
                m23678a(th2, list);
                if ((th2 instanceof C13154c) && ((C13154c) th2).f32074g == 0) {
                    list.add(th2);
                }
            }
            return;
        }
        list.add(th);
    }

    public C13154c(String str, String str2, String str3) {
        this(str, str2, str3, new HashMap(), Collections.emptyList(), 0);
    }

    public C13154c(Throwable th, String str, String str2) {
        this("", str, str2, new HashMap(), Collections.singletonList(th), 0);
    }

    public C13154c(String str, String str2, String str3, Map<String, String> map, List<Throwable> list, int i) {
        this.f32068a = str;
        this.f32069b = str2;
        this.f32070c = str3;
        this.f32071d = map;
        this.f32072e = list;
        this.f32074g = i;
    }
}
