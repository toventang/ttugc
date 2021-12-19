package com.p2082ss.android.ugc.aweme.music.p3481ui.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.arch.ext.list.ICommonListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.MusicListState */
public final class MusicListState implements ICommonListState<Object> {
    private final String musicId;
    private final ListState<Object, C20465o> substate;

    static {
        Covode.recordClassIndex(71828);
    }

    public MusicListState() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.music.ui.viewmodel.MusicListState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MusicListState copy$default(MusicListState musicListState, String str, ListState listState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = musicListState.musicId;
        }
        if ((i & 2) != 0) {
            listState = musicListState.getSubstate();
        }
        return musicListState.copy(str, listState);
    }

    public final String component1() {
        return this.musicId;
    }

    public final ListState<Object, C20465o> component2() {
        return getSubstate();
    }

    public final MusicListState copy(String str, ListState<Object, C20465o> listState) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(listState, "");
        return new MusicListState(str, listState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicListState)) {
            return false;
        }
        MusicListState musicListState = (MusicListState) obj;
        return C89219l.m154714a(this.musicId, musicListState.musicId) && C89219l.m154714a(getSubstate(), musicListState.getSubstate());
    }

    public final int hashCode() {
        String str = this.musicId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ListState<Object, C20465o> substate2 = getSubstate();
        if (substate2 != null) {
            i = substate2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "MusicListState(musicId=" + this.musicId + ", substate=" + getSubstate() + ")";
    }

    public final String getMusicId() {
        return this.musicId;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public final ListState<Object, C20465o> getSubstate() {
        return this.substate;
    }

    public final NestedState<ListState<Object, C20465o>> newSubstate(ListState<Object, C20465o> listState) {
        C89219l.m154721d(listState, "");
        return copy$default(this, null, listState, 1, null);
    }

    public MusicListState(String str, ListState<Object, C20465o> listState) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(listState, "");
        this.musicId = str;
        this.substate = listState;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicListState(String str, ListState listState, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ListState(new C20465o(false, 3, (byte) 0), null, null, null, null, 30, null) : listState);
    }
}
