package com.p2082ss.android.ugc.aweme.profile.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.arch.ext.list.ICommonListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.effect.EffectProfileState */
public final class EffectProfileState implements ICommonListState<C75445g> {
    private final ListState<C75445g, C20465o> substate;
    private final String userId;

    static {
        Covode.recordClassIndex(75015);
    }

    public EffectProfileState() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.profile.effect.EffectProfileState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EffectProfileState copy$default(EffectProfileState effectProfileState, String str, ListState listState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = effectProfileState.userId;
        }
        if ((i & 2) != 0) {
            listState = effectProfileState.getSubstate();
        }
        return effectProfileState.copy(str, listState);
    }

    public final String component1() {
        return this.userId;
    }

    public final ListState<C75445g, C20465o> component2() {
        return getSubstate();
    }

    public final EffectProfileState copy(String str, ListState<C75445g, C20465o> listState) {
        C89219l.m154721d(listState, "");
        return new EffectProfileState(str, listState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectProfileState)) {
            return false;
        }
        EffectProfileState effectProfileState = (EffectProfileState) obj;
        return C89219l.m154714a(this.userId, effectProfileState.userId) && C89219l.m154714a(getSubstate(), effectProfileState.getSubstate());
    }

    public final int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ListState<C75445g, C20465o> substate2 = getSubstate();
        if (substate2 != null) {
            i = substate2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "EffectProfileState(userId=" + this.userId + ", substate=" + getSubstate() + ")";
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public final ListState<C75445g, C20465o> getSubstate() {
        return this.substate;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final EffectProfileState newSubstate(ListState<C75445g, C20465o> listState) {
        C89219l.m154721d(listState, "");
        return copy$default(this, null, listState, 1, null);
    }

    public EffectProfileState(String str, ListState<C75445g, C20465o> listState) {
        C89219l.m154721d(listState, "");
        this.userId = str;
        this.substate = listState;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectProfileState(String str, ListState listState, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new ListState(new C20465o(false, 3, (byte) 0), null, null, null, null, 30, null) : listState);
    }
}
