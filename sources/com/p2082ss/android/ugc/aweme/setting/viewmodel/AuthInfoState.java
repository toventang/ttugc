package com.p2082ss.android.ugc.aweme.setting.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.setting.model.C68173c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.viewmodel.AuthInfoState */
public final class AuthInfoState implements AbstractC20368af {
    private final ListState<C68173c, C20465o> listState;

    static {
        Covode.recordClassIndex(80975);
    }

    public AuthInfoState() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.setting.viewmodel.AuthInfoState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthInfoState copy$default(AuthInfoState authInfoState, ListState listState2, int i, Object obj) {
        if ((i & 1) != 0) {
            listState2 = authInfoState.listState;
        }
        return authInfoState.copy(listState2);
    }

    public final ListState<C68173c, C20465o> component1() {
        return this.listState;
    }

    public final AuthInfoState copy(ListState<C68173c, C20465o> listState2) {
        C89219l.m154721d(listState2, "");
        return new AuthInfoState(listState2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AuthInfoState) && C89219l.m154714a(this.listState, ((AuthInfoState) obj).listState);
        }
        return true;
    }

    public final int hashCode() {
        ListState<C68173c, C20465o> listState2 = this.listState;
        if (listState2 != null) {
            return listState2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "AuthInfoState(listState=" + this.listState + ")";
    }

    public final ListState<C68173c, C20465o> getListState() {
        return this.listState;
    }

    public AuthInfoState(ListState<C68173c, C20465o> listState2) {
        C89219l.m154721d(listState2, "");
        this.listState = listState2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AuthInfoState(ListState listState2, int i, C89214g gVar) {
        this((i & 1) != 0 ? new ListState(new C20465o(false, 3, (byte) 0), null, null, null, null, 30, null) : listState2);
    }
}
