package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.net.EffectNameModel */
public final class EffectNameModel {
    private String name;

    static {
        Covode.recordClassIndex(102578);
    }

    public EffectNameModel() {
        this(null, 1, null);
    }

    public static /* synthetic */ EffectNameModel copy$default(EffectNameModel effectNameModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = effectNameModel.name;
        }
        return effectNameModel.copy(str);
    }

    public final String component1() {
        return this.name;
    }

    public final EffectNameModel copy(String str) {
        return new EffectNameModel(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof EffectNameModel) && C89219l.m154714a(this.name, ((EffectNameModel) obj).name);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.name;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "EffectNameModel(name=" + this.name + ")";
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public EffectNameModel(String str) {
        this.name = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectNameModel(String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str);
    }
}
