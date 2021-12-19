package com.p2082ss.android.ugc.aweme.textsticker;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.textsticker.TextStickerChallenges */
public final class TextStickerChallenges implements Parcelable, Serializable {
    public static final Parcelable.Creator<TextStickerChallenges> CREATOR = new C77787a();
    public final List<AVChallenge> readTextChallenges;

    static {
        Covode.recordClassIndex(90851);
    }

    public TextStickerChallenges() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.textsticker.TextStickerChallenges */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextStickerChallenges copy$default(TextStickerChallenges textStickerChallenges, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = textStickerChallenges.readTextChallenges;
        }
        return textStickerChallenges.copy(list);
    }

    public final TextStickerChallenges copy(List<AVChallenge> list) {
        C89219l.m154721d(list, "");
        return new TextStickerChallenges(list);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TextStickerChallenges) && C89219l.m154714a(this.readTextChallenges, ((TextStickerChallenges) obj).readTextChallenges);
        }
        return true;
    }

    public final int hashCode() {
        List<AVChallenge> list = this.readTextChallenges;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TextStickerChallenges(readTextChallenges=" + this.readTextChallenges + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        List<AVChallenge> list = this.readTextChallenges;
        parcel.writeInt(list.size());
        for (AVChallenge aVChallenge : list) {
            parcel.writeParcelable(aVChallenge, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.textsticker.TextStickerChallenges$a */
    public static class C77787a implements Parcelable.Creator<TextStickerChallenges> {
        static {
            Covode.recordClassIndex(90852);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TextStickerChallenges[] newArray(int i) {
            return new TextStickerChallenges[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TextStickerChallenges createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(parcel.readParcelable(TextStickerChallenges.class.getClassLoader()));
                readInt--;
            }
            return new TextStickerChallenges(arrayList);
        }
    }

    public final List<String> getReadTextChallengeIds() {
        ArrayList arrayList = new ArrayList();
        List<AVChallenge> list = this.readTextChallenges;
        ListIterator<AVChallenge> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            AVChallenge previous = listIterator.previous();
            if (!arrayList.contains(previous.cid)) {
                String str = previous.cid;
                C89219l.m154716b(str, "");
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final List<AVChallenge> getReadTextChallenges() {
        ArrayList arrayList = new ArrayList();
        List<AVChallenge> list = this.readTextChallenges;
        ListIterator<AVChallenge> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            AVChallenge previous = listIterator.previous();
            if (!arrayList.contains(previous)) {
                arrayList.add(previous);
            }
        }
        return C89070n.m154584g((Iterable) C89070n.m154590j(arrayList));
    }

    public TextStickerChallenges(List<AVChallenge> list) {
        C89219l.m154721d(list, "");
        this.readTextChallenges = list;
    }

    public final void addReadTextChallenge(AVChallenge aVChallenge) {
        C89219l.m154721d(aVChallenge, "");
        this.readTextChallenges.add(aVChallenge);
    }

    public final void removeReadTextChallenge(String str, AbstractC89172b<? super AVChallenge, C89391z> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        for (T t : this.readTextChallenges) {
            if (C89219l.m154714a((Object) t.cid, (Object) str)) {
                if (t != null) {
                    this.readTextChallenges.remove(t);
                    bVar.invoke(t);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextStickerChallenges(List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? new LinkedList() : list);
    }
}
