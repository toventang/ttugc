package com.p2082ss.android.vesdk.runtime;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vesdk.runtime.e */
public abstract class AbstractC85556e {

    /* renamed from: a */
    protected String f191703a;

    /* renamed from: b */
    public List<String> f191704b = new ArrayList();

    /* renamed from: c */
    public List<String> f191705c = new ArrayList();

    /* renamed from: d */
    private String f191706d;

    /* renamed from: e */
    private String f191707e;

    static {
        Covode.recordClassIndex(99731);
    }

    /* renamed from: a */
    public abstract String mo56847a();

    /* renamed from: b */
    public String mo56848b() {
        return this.f191706d;
    }

    /* renamed from: c */
    public String mo56849c() {
        return this.f191707e;
    }

    /* renamed from: f */
    public final String mo131527f() {
        return this.f191703a + File.separator + "temp.mp4";
    }

    /* renamed from: d */
    public final void mo131525d() {
        this.f191706d = C85557f.m147458a(this.f191703a, "concat") + File.separator + "concat.mp4";
    }

    /* renamed from: e */
    public final void mo131526e() {
        this.f191707e = C85557f.m147458a(this.f191703a, "concat") + File.separator + "concat.wav";
    }

    public AbstractC85556e(String str) {
        this.f191703a = str;
    }
}
