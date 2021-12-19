package com.p2082ss.android.ugc.aweme.simkit.model.bitrateselect;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81965d;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.simkit.model.bitrateselect.c */
public class C74681c implements AbstractC81965d {
    @AbstractC27891c(mo46611a = "default_gear_name")

    /* renamed from: a */
    public String f167870a;
    @AbstractC27891c(mo46611a = "gear_group")

    /* renamed from: b */
    public Set<String> f167871b;
    @AbstractC27891c(mo46611a = "default_bitrate")

    /* renamed from: c */
    private double f167872c;
    @AbstractC27891c(mo46611a = "bitrate_range")

    /* renamed from: d */
    private List<Double> f167873d;

    static {
        Covode.recordClassIndex(87509);
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81965d
    /* renamed from: a */
    public final String mo61737a() {
        return this.f167870a;
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81965d
    /* renamed from: b */
    public final Set<String> mo61738b() {
        return this.f167871b;
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81965d
    /* renamed from: c */
    public final double mo61739c() {
        return this.f167872c;
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81965d
    /* renamed from: d */
    public final Pair<Double, Double> mo61740d() {
        List<Double> list = this.f167873d;
        if (list == null || list.size() != 2) {
            return null;
        }
        return new Pair<>(this.f167873d.get(0), this.f167873d.get(1));
    }

    public String toString() {
        return "GearConfig{defaultGearName='" + this.f167870a + '\'' + ", gearGroup=" + this.f167871b + '}';
    }
}
