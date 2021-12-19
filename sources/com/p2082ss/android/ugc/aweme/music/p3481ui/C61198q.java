package com.p2082ss.android.ugc.aweme.music.p3481ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.musicprovider.C84125a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.q */
public final class C61198q {

    /* renamed from: a */
    public String f138944a;

    /* renamed from: b */
    public MusicWaveBean f138945b;

    /* renamed from: c */
    public Integer f138946c;

    /* renamed from: d */
    public C84125a f138947d;

    /* renamed from: e */
    public Effect f138948e;

    /* renamed from: f */
    public Integer f138949f;

    /* renamed from: g */
    public ExceptionResult f138950g;

    static {
        Covode.recordClassIndex(71803);
    }

    public C61198q() {
        this(null, null, null, null, null, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61198q)) {
            return false;
        }
        C61198q qVar = (C61198q) obj;
        return C89219l.m154714a(this.f138944a, qVar.f138944a) && C89219l.m154714a(this.f138945b, qVar.f138945b) && C89219l.m154714a(this.f138946c, qVar.f138946c) && C89219l.m154714a(this.f138947d, qVar.f138947d) && C89219l.m154714a(this.f138948e, qVar.f138948e) && C89219l.m154714a(this.f138949f, qVar.f138949f) && C89219l.m154714a(this.f138950g, qVar.f138950g);
    }

    public final int hashCode() {
        String str = this.f138944a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        MusicWaveBean musicWaveBean = this.f138945b;
        int hashCode2 = (hashCode + (musicWaveBean != null ? musicWaveBean.hashCode() : 0)) * 31;
        Integer num = this.f138946c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        C84125a aVar = this.f138947d;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Effect effect = this.f138948e;
        int hashCode5 = (hashCode4 + (effect != null ? effect.hashCode() : 0)) * 31;
        Integer num2 = this.f138949f;
        int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ExceptionResult exceptionResult = this.f138950g;
        if (exceptionResult != null) {
            i = exceptionResult.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "MusicAndEffectResult(musicFile=" + this.f138944a + ", waveBean=" + this.f138945b + ", musicStatus=" + this.f138946c + ", musicDownloadException=" + this.f138947d + ", effect=" + this.f138948e + ", effectStatus=" + this.f138949f + ", effectExceptionResult=" + this.f138950g + ")";
    }

    public C61198q(String str, MusicWaveBean musicWaveBean, Integer num, C84125a aVar, Effect effect, Integer num2, ExceptionResult exceptionResult) {
        this.f138944a = str;
        this.f138945b = musicWaveBean;
        this.f138946c = num;
        this.f138947d = aVar;
        this.f138948e = effect;
        this.f138949f = num2;
        this.f138950g = exceptionResult;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C61198q(String str, MusicWaveBean musicWaveBean, Integer num, C84125a aVar, Effect effect, Integer num2, ExceptionResult exceptionResult, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : musicWaveBean, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? null : effect, (i & 32) != 0 ? null : num2, (i & 64) == 0 ? exceptionResult : null);
    }
}
