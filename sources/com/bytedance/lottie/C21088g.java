package com.bytedance.lottie;

import android.graphics.Rect;
import androidx.p025c.C0489d;
import androidx.p025c.C0498h;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1499c.C21016c;
import com.bytedance.lottie.p1499c.C21032d;
import com.bytedance.lottie.p1499c.p1502c.C21023d;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.lottie.g */
public class C21088g {

    /* renamed from: a */
    public final C21127q f49969a = new C21127q();

    /* renamed from: b */
    public Map<String, List<C21023d>> f49970b;

    /* renamed from: c */
    public Map<String, C21118j> f49971c;

    /* renamed from: d */
    public Map<String, C21016c> f49972d;

    /* renamed from: e */
    public C0498h<C21032d> f49973e;

    /* renamed from: f */
    C0489d<C21023d> f49974f;

    /* renamed from: g */
    public List<C21023d> f49975g;

    /* renamed from: h */
    public Rect f49976h;

    /* renamed from: i */
    public float f49977i;

    /* renamed from: j */
    public float f49978j;

    /* renamed from: k */
    public float f49979k;

    /* renamed from: l */
    public boolean f49980l;

    /* renamed from: m */
    public boolean f49981m;

    /* renamed from: n */
    public final Set<String> f49982n = new HashSet();

    /* renamed from: o */
    public boolean f49983o;

    /* renamed from: p */
    public int f49984p = 0;

    /* renamed from: q */
    private final HashSet<String> f49985q = new HashSet<>();

    static {
        Covode.recordClassIndex(24704);
    }

    /* renamed from: b */
    public final float mo34564b() {
        return this.f49978j - this.f49977i;
    }

    /* renamed from: a */
    public final float mo34559a() {
        return (float) ((long) ((mo34564b() / this.f49979k) * 1000.0f));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (C21023d dVar : this.f49975g) {
            sb.append(dVar.mo34500a("\t"));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo34561a(int i) {
        this.f49984p += i;
    }

    /* renamed from: a */
    public final C21023d mo34560a(long j) {
        return this.f49974f.mo2078a(j, null);
    }

    /* renamed from: a */
    public final void mo34562a(String str) {
        this.f49985q.add(str);
    }

    /* renamed from: a */
    public final void mo34563a(boolean z) {
        this.f49969a.f50116b = z;
    }
}
