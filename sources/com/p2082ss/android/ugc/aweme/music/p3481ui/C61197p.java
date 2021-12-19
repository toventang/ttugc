package com.p2082ss.android.ugc.aweme.music.p3481ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.p */
public final class C61197p {

    /* renamed from: a */
    public int f138940a;

    /* renamed from: b */
    public int f138941b;

    /* renamed from: c */
    public Effect f138942c;

    /* renamed from: d */
    public long f138943d;

    static {
        Covode.recordClassIndex(71802);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61197p)) {
            return false;
        }
        C61197p pVar = (C61197p) obj;
        return this.f138940a == pVar.f138940a && this.f138941b == pVar.f138941b && C89219l.m154714a(this.f138942c, pVar.f138942c) && this.f138943d == pVar.f138943d;
    }

    public final int hashCode() {
        int i = ((this.f138940a * 31) + this.f138941b) * 31;
        Effect effect = this.f138942c;
        int hashCode = effect != null ? effect.hashCode() : 0;
        long j = this.f138943d;
        return ((i + hashCode) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "MusicAndEffectProgress(type=" + this.f138940a + ", progress=" + this.f138941b + ", effect=" + this.f138942c + ", effectTotalSize=" + this.f138943d + ")";
    }

    public C61197p(int i, int i2, Effect effect, long j) {
        this.f138940a = i;
        this.f138941b = i2;
        this.f138942c = effect;
        this.f138943d = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C61197p(int i, int i2, Effect effect, int i3) {
        this(i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : effect, 0L);
    }
}
