package com.p2082ss.android.ugc.asve.editor.nle;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.editor.nle.FloatArrayValue */
public final class FloatArrayValue {
    private final List<Float> value;

    static {
        Covode.recordClassIndex(37716);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.asve.editor.nle.FloatArrayValue */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FloatArrayValue copy$default(FloatArrayValue floatArrayValue, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = floatArrayValue.value;
        }
        return floatArrayValue.copy(list);
    }

    public final List<Float> component1() {
        return this.value;
    }

    public final FloatArrayValue copy(List<Float> list) {
        C89219l.m154721d(list, "");
        return new FloatArrayValue(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FloatArrayValue) && C89219l.m154714a(this.value, ((FloatArrayValue) obj).value);
        }
        return true;
    }

    public final int hashCode() {
        List<Float> list = this.value;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "FloatArrayValue(value=" + this.value + ")";
    }

    public final List<Float> getValue() {
        return this.value;
    }

    public FloatArrayValue(List<Float> list) {
        C89219l.m154721d(list, "");
        this.value = list;
    }
}
