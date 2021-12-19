package com.bytedance.ttnet.p1705f;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.bytedance.ttnet.f.a */
public final class C22952a {

    /* renamed from: a */
    public boolean f54266a;

    /* renamed from: b */
    public boolean f54267b = true;

    /* renamed from: c */
    public Map<String, Integer> f54268c;

    /* renamed from: d */
    public int f54269d = 10;

    /* renamed from: e */
    public int f54270e = 3;

    /* renamed from: f */
    public int f54271f = 3;

    /* renamed from: g */
    public int f54272g = 10;

    /* renamed from: h */
    public int f54273h = 3;

    /* renamed from: i */
    public int f54274i = 3;

    /* renamed from: j */
    public int f54275j = 900;

    /* renamed from: k */
    public int f54276k = 120;

    /* renamed from: l */
    public String f54277l;

    static {
        Covode.recordClassIndex(26865);
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(" localEnable: ").append(this.f54266a);
        sb.append(" probeEnable: ").append(this.f54267b);
        StringBuilder append = sb.append(" hostFilter: ");
        Map<String, Integer> map = this.f54268c;
        if (map != null) {
            i = map.size();
        } else {
            i = 0;
        }
        append.append(i);
        sb.append(" reqTo: ").append(this.f54269d).append("#").append(this.f54270e).append("#").append(this.f54271f);
        sb.append(" reqErr: ").append(this.f54272g).append("#").append(this.f54273h).append("#").append(this.f54274i);
        sb.append(" updateInterval: ").append(this.f54275j);
        sb.append(" updateRandom: ").append(this.f54276k);
        sb.append(" httpBlack: ").append(this.f54277l);
        return sb.toString();
    }
}
