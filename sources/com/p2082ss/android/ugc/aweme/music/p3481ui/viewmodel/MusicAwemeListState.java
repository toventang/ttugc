package com.p2082ss.android.ugc.aweme.music.p3481ui.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.arch.ext.list.ICommonListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.MusicAwemeListState */
public final class MusicAwemeListState implements ICommonListState<Object> {
    private boolean isNeedControl;
    private final String musicId;
    private int outBound;
    private final ListState<Object, C20465o> substate;

    static {
        Covode.recordClassIndex(71814);
    }

    public MusicAwemeListState() {
        this(null, 0, false, null, 15, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_music_ui_viewmodel_MusicAwemeListState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m110851xd1383f94(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.music.ui.viewmodel.MusicAwemeListState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MusicAwemeListState copy$default(MusicAwemeListState musicAwemeListState, String str, int i, boolean z, ListState listState, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = musicAwemeListState.musicId;
        }
        if ((i2 & 2) != 0) {
            i = musicAwemeListState.outBound;
        }
        if ((i2 & 4) != 0) {
            z = musicAwemeListState.isNeedControl;
        }
        if ((i2 & 8) != 0) {
            listState = musicAwemeListState.getSubstate();
        }
        return musicAwemeListState.copy(str, i, z, listState);
    }

    public final String component1() {
        return this.musicId;
    }

    public final int component2() {
        return this.outBound;
    }

    public final boolean component3() {
        return this.isNeedControl;
    }

    public final ListState<Object, C20465o> component4() {
        return getSubstate();
    }

    public final MusicAwemeListState copy(String str, int i, boolean z, ListState<Object, C20465o> listState) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(listState, "");
        return new MusicAwemeListState(str, i, z, listState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicAwemeListState)) {
            return false;
        }
        MusicAwemeListState musicAwemeListState = (MusicAwemeListState) obj;
        return C89219l.m154714a(this.musicId, musicAwemeListState.musicId) && this.outBound == musicAwemeListState.outBound && this.isNeedControl == musicAwemeListState.isNeedControl && C89219l.m154714a(getSubstate(), musicAwemeListState.getSubstate());
    }

    public final int hashCode() {
        String str = this.musicId;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + m110851xd1383f94(this.outBound)) * 31;
        boolean z = this.isNeedControl;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        ListState<Object, C20465o> substate2 = getSubstate();
        if (substate2 != null) {
            i = substate2.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "MusicAwemeListState(musicId=" + this.musicId + ", outBound=" + this.outBound + ", isNeedControl=" + this.isNeedControl + ", substate=" + getSubstate() + ")";
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final int getOutBound() {
        return this.outBound;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public final ListState<Object, C20465o> getSubstate() {
        return this.substate;
    }

    public final boolean isNeedControl() {
        return this.isNeedControl;
    }

    public final void setNeedControl(boolean z) {
        this.isNeedControl = z;
    }

    public final void setOutBound(int i) {
        this.outBound = i;
    }

    public final NestedState<ListState<Object, C20465o>> newSubstate(ListState<Object, C20465o> listState) {
        C89219l.m154721d(listState, "");
        return copy$default(this, null, 0, false, listState, 7, null);
    }

    public MusicAwemeListState(String str, int i, boolean z, ListState<Object, C20465o> listState) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(listState, "");
        this.musicId = str;
        this.outBound = i;
        this.isNeedControl = z;
        this.substate = listState;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicAwemeListState(String str, int i, boolean z, ListState listState, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? new ListState(new C20465o(false, 2, (byte) 0), null, null, null, null, 30, null) : listState);
    }
}
