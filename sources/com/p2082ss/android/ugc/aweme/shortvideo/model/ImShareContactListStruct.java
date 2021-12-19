package com.p2082ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.ImShareContactListStruct */
public final class ImShareContactListStruct implements Serializable {
    private final ArrayList<ImShareContactStruct> data;

    static {
        Covode.recordClassIndex(84592);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.shortvideo.model.ImShareContactListStruct */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImShareContactListStruct copy$default(ImShareContactListStruct imShareContactListStruct, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = imShareContactListStruct.data;
        }
        return imShareContactListStruct.copy(arrayList);
    }

    public final ArrayList<ImShareContactStruct> component1() {
        return this.data;
    }

    public final ImShareContactListStruct copy(ArrayList<ImShareContactStruct> arrayList) {
        C89219l.m154721d(arrayList, "");
        return new ImShareContactListStruct(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ImShareContactListStruct) && C89219l.m154714a(this.data, ((ImShareContactListStruct) obj).data);
        }
        return true;
    }

    public final int hashCode() {
        ArrayList<ImShareContactStruct> arrayList = this.data;
        if (arrayList != null) {
            return arrayList.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ImShareContactListStruct(data=" + this.data + ")";
    }

    public final ArrayList<ImShareContactStruct> getData() {
        return this.data;
    }

    public ImShareContactListStruct(ArrayList<ImShareContactStruct> arrayList) {
        C89219l.m154721d(arrayList, "");
        this.data = arrayList;
    }
}
