package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource */
public class GameDuetResource implements Parcelable {
    public static final Parcelable.Creator<GameDuetResource> CREATOR = new Parcelable.Creator<GameDuetResource>() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.model.GameDuetResource.C719861 */

        static {
            Covode.recordClassIndex(84583);
        }

        @Override // android.os.Parcelable.Creator
        public final GameDuetResource[] newArray(int i) {
            return new GameDuetResource[i];
        }

        @Override // android.os.Parcelable.Creator
        public final GameDuetResource createFromParcel(Parcel parcel) {
            return new GameDuetResource(parcel);
        }
    };
    public int gameScore;
    public Effect gameSticker;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(84582);
    }

    protected GameDuetResource(Parcel parcel) {
        this.gameScore = parcel.readInt();
        this.gameSticker = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
    }

    public GameDuetResource(int i, Effect effect) {
        this.gameScore = i;
        this.gameSticker = effect;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.gameScore);
        parcel.writeParcelable(this.gameSticker, i);
    }
}
