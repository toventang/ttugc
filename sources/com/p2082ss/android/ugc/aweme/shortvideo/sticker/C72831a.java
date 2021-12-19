package com.p2082ss.android.ugc.aweme.shortvideo.sticker;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a */
public final class C72831a implements Serializable {
    @AbstractC27891c(mo46611a = "sources")

    /* renamed from: a */
    private final String[] f163443a;
    @AbstractC27891c(mo46611a = "use_output")

    /* renamed from: b */
    private final Boolean f163444b;

    static {
        Covode.recordClassIndex(85522);
    }

    public C72831a() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ C72831a copy$default(C72831a aVar, String[] strArr, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = aVar.f163443a;
        }
        if ((i & 2) != 0) {
            bool = aVar.f163444b;
        }
        return aVar.copy(strArr, bool);
    }

    public final String[] component1() {
        return this.f163443a;
    }

    public final Boolean component2() {
        return this.f163444b;
    }

    public final C72831a copy(String[] strArr, Boolean bool) {
        return new C72831a(strArr, bool);
    }

    public final String toString() {
        return "AudioGraph(sources=" + Arrays.toString(this.f163443a) + ", useOutput=" + this.f163444b + ")";
    }

    public final String[] getSources() {
        return this.f163443a;
    }

    public final Boolean getUseOutput() {
        return this.f163444b;
    }

    public final boolean enableMic() {
        String[] strArr = this.f163443a;
        if (strArr == null || !C89064i.m154489a(strArr, "mic")) {
            return false;
        }
        return true;
    }

    public final boolean enableMusic() {
        String[] strArr = this.f163443a;
        if (strArr == null || !C89064i.m154489a(strArr, "music")) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        String[] strArr = this.f163443a;
        int i2 = 0;
        if (strArr != null) {
            i = Arrays.hashCode(strArr);
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Boolean bool = this.f163444b;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return i3 + i2;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C89219l.m154714a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.AudioGraph");
        String[] strArr = this.f163443a;
        if (strArr != null) {
            String[] strArr2 = ((C72831a) obj).f163443a;
            if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                return false;
            }
        } else if (((C72831a) obj).f163443a != null) {
            return false;
        }
        if (!C89219l.m154714a(this.f163444b, ((C72831a) obj).f163444b)) {
            return false;
        }
        return true;
    }

    public C72831a(String[] strArr, Boolean bool) {
        this.f163443a = strArr;
        this.f163444b = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C72831a(String[] strArr, Boolean bool, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : strArr, (i & 2) != 0 ? null : bool);
    }
}
