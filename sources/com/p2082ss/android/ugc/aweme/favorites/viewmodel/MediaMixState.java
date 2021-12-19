package com.p2082ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.base.arch.C34496g;
import com.p2082ss.android.ugc.aweme.feed.model.MixStruct;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixState */
public final class MediaMixState implements AbstractC20368af {
    private final String enterFrom;
    private final String enterMethod;
    private final ListState<MixStruct, C34496g> listState;
    private final String searchKeyword;

    static {
        Covode.recordClassIndex(56382);
    }

    public MediaMixState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaMixState copy$default(MediaMixState mediaMixState, String str, String str2, String str3, ListState listState2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaMixState.enterFrom;
        }
        if ((i & 2) != 0) {
            str2 = mediaMixState.enterMethod;
        }
        if ((i & 4) != 0) {
            str3 = mediaMixState.searchKeyword;
        }
        if ((i & 8) != 0) {
            listState2 = mediaMixState.listState;
        }
        return mediaMixState.copy(str, str2, str3, listState2);
    }

    public final String component1() {
        return this.enterFrom;
    }

    public final String component2() {
        return this.enterMethod;
    }

    public final String component3() {
        return this.searchKeyword;
    }

    public final ListState<MixStruct, C34496g> component4() {
        return this.listState;
    }

    public final MediaMixState copy(String str, String str2, String str3, ListState<MixStruct, C34496g> listState2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(listState2, "");
        return new MediaMixState(str, str2, str3, listState2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMixState)) {
            return false;
        }
        MediaMixState mediaMixState = (MediaMixState) obj;
        return C89219l.m154714a(this.enterFrom, mediaMixState.enterFrom) && C89219l.m154714a(this.enterMethod, mediaMixState.enterMethod) && C89219l.m154714a(this.searchKeyword, mediaMixState.searchKeyword) && C89219l.m154714a(this.listState, mediaMixState.listState);
    }

    public final int hashCode() {
        String str = this.enterFrom;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.enterMethod;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.searchKeyword;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        ListState<MixStruct, C34496g> listState2 = this.listState;
        if (listState2 != null) {
            i = listState2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "MediaMixState(enterFrom=" + this.enterFrom + ", enterMethod=" + this.enterMethod + ", searchKeyword=" + this.searchKeyword + ", listState=" + this.listState + ")";
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final ListState<MixStruct, C34496g> getListState() {
        return this.listState;
    }

    public final String getSearchKeyword() {
        return this.searchKeyword;
    }

    public MediaMixState(String str, String str2, String str3, ListState<MixStruct, C34496g> listState2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(listState2, "");
        this.enterFrom = str;
        this.enterMethod = str2;
        this.searchKeyword = str3;
        this.listState = listState2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediaMixState(String str, String str2, String str3, ListState listState2, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new ListState(new C34496g(), null, null, null, null, 30, null) : listState2);
    }
}
