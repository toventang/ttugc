package com.p2082ss.android.ugc.aweme.infosticker;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.infosticker.StickerChallenge */
public final class StickerChallenge implements Parcelable, Serializable {
    public static final C56732a CREATOR = new C56732a((byte) 0);
    @AbstractC27891c(mo46611a = "sticker_list", mo46612b = {"a"})

    /* renamed from: a */
    private List<String> f129295a;
    @AbstractC27891c(mo46611a = "sticker_to_challenge", mo46612b = {"b"})

    /* renamed from: b */
    private HashMap<String, AVChallenge> f129296b;
    @AbstractC27891c(mo46611a = "record_sticker_challenge_list", mo46612b = {"c"})

    /* renamed from: c */
    private List<AVChallenge> f129297c;

    static {
        Covode.recordClassIndex(66594);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.infosticker.StickerChallenge$a */
    public static final class C56732a implements Parcelable.Creator<StickerChallenge> {
        static {
            Covode.recordClassIndex(66595);
        }

        private C56732a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StickerChallenge[] newArray(int i) {
            return new StickerChallenge[i];
        }

        public /* synthetic */ C56732a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StickerChallenge createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new StickerChallenge(parcel);
        }
    }

    public final List<AVChallenge> getRecordStickerChallengeList() {
        return this.f129297c;
    }

    public final List<String> getStickerList() {
        return this.f129295a;
    }

    public final HashMap<String, AVChallenge> getStickerToChallenge() {
        return this.f129296b;
    }

    public final Collection<AVChallenge> infoStickerChallenges() {
        Collection<AVChallenge> values = this.f129296b.values();
        C89219l.m154716b(values, "");
        return values;
    }

    public StickerChallenge() {
        this.f129295a = new ArrayList();
        this.f129296b = new HashMap<>();
        this.f129297c = new ArrayList();
    }

    public final void setRecordStickerChallengeList(List<AVChallenge> list) {
        C89219l.m154721d(list, "");
        this.f129297c = list;
    }

    public final void setStickerList(List<String> list) {
        C89219l.m154721d(list, "");
        this.f129295a = list;
    }

    public final void setStickerToChallenge(HashMap<String, AVChallenge> hashMap) {
        C89219l.m154721d(hashMap, "");
        this.f129296b = hashMap;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StickerChallenge(Parcel parcel) {
        this();
        C89219l.m154721d(parcel, "");
        parcel.readStringList(this.f129295a);
        Serializable readSerializable = parcel.readSerializable();
        Objects.requireNonNull(readSerializable, "null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, com.ss.android.ugc.aweme.shortvideo.AVChallenge> /* = java.util.HashMap<kotlin.String, com.ss.android.ugc.aweme.shortvideo.AVChallenge> */");
        this.f129296b = (HashMap) readSerializable;
        ArrayList readArrayList = parcel.readArrayList(AVChallenge.class.getClassLoader());
        Objects.requireNonNull(readArrayList, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.shortvideo.AVChallenge>");
        this.f129297c = C89206ad.m154682d(readArrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeStringList(this.f129295a);
        parcel.writeSerializable(this.f129296b);
        List<AVChallenge> list = this.f129297c;
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge>");
        parcel.writeList(list);
    }
}
